package org.modelmapper.internal.bytebuddy;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.modelmapper.internal.bytebuddy.utility.CompoundList;

/* loaded from: classes4.dex */
public class TypeCache<T> extends ReferenceQueue<ClassLoader> {
    private static final Class<?> NOT_FOUND = null;
    protected final ConcurrentMap<StorageKey, ConcurrentMap<T, Reference<Class<?>>>> cache = new ConcurrentHashMap();
    protected final Sort sort;

    public enum Sort {
        WEAK { // from class: org.modelmapper.internal.bytebuddy.TypeCache.Sort.1
            @Override // org.modelmapper.internal.bytebuddy.TypeCache.Sort
            protected Reference<Class<?>> wrap(Class<?> cls) {
                return new WeakReference(cls);
            }
        },
        SOFT { // from class: org.modelmapper.internal.bytebuddy.TypeCache.Sort.2
            @Override // org.modelmapper.internal.bytebuddy.TypeCache.Sort
            protected Reference<Class<?>> wrap(Class<?> cls) {
                return new SoftReference(cls);
            }
        };

        protected abstract Reference<Class<?>> wrap(Class<?> cls);
    }

    public TypeCache(Sort sort) {
        this.sort = sort;
    }

    public Class<?> find(ClassLoader classLoader, T t) {
        ConcurrentMap<T, Reference<Class<?>>> concurrentMap = this.cache.get(new LookupKey(classLoader));
        if (concurrentMap == null) {
            return NOT_FOUND;
        }
        Reference<Class<?>> reference = concurrentMap.get(t);
        if (reference == null) {
            return NOT_FOUND;
        }
        return reference.get();
    }

    public Class<?> insert(ClassLoader classLoader, T t, Class<?> cls) {
        ConcurrentMap<T, Reference<Class<?>>> putIfAbsent;
        ConcurrentMap<T, Reference<Class<?>>> concurrentMap = this.cache.get(new LookupKey(classLoader));
        if (concurrentMap == null && (putIfAbsent = this.cache.putIfAbsent(new StorageKey(classLoader, this), (concurrentMap = new ConcurrentHashMap<>()))) != null) {
            concurrentMap = putIfAbsent;
        }
        Reference<Class<?>> wrap = this.sort.wrap(cls);
        Reference<Class<?>> putIfAbsent2 = concurrentMap.putIfAbsent(t, wrap);
        while (putIfAbsent2 != null) {
            Class<?> cls2 = putIfAbsent2.get();
            if (cls2 != null) {
                return cls2;
            }
            if (concurrentMap.remove(t, putIfAbsent2)) {
                putIfAbsent2 = concurrentMap.putIfAbsent(t, wrap);
            } else {
                putIfAbsent2 = concurrentMap.get(t);
                if (putIfAbsent2 == null) {
                    putIfAbsent2 = concurrentMap.putIfAbsent(t, wrap);
                }
            }
        }
        return cls;
    }

    public Class<?> findOrInsert(ClassLoader classLoader, T t, Callable<Class<?>> callable) {
        Class<?> find = find(classLoader, t);
        if (find != null) {
            return find;
        }
        try {
            return insert(classLoader, t, callable.call());
        } catch (Throwable th) {
            throw new IllegalArgumentException("Could not create type", th);
        }
    }

    public Class<?> findOrInsert(ClassLoader classLoader, T t, Callable<Class<?>> callable, Object obj) {
        Class<?> findOrInsert;
        Class<?> find = find(classLoader, t);
        if (find != null) {
            return find;
        }
        synchronized (obj) {
            findOrInsert = findOrInsert(classLoader, t, callable);
        }
        return findOrInsert;
    }

    public void expungeStaleEntries() {
        while (true) {
            Reference<? extends T> poll = poll();
            if (poll == null) {
                return;
            } else {
                this.cache.remove(poll);
            }
        }
    }

    public void clear() {
        this.cache.clear();
    }

    protected static class LookupKey {
        private final ClassLoader classLoader;
        private final int hashCode;

        protected LookupKey(ClassLoader classLoader) {
            this.classLoader = classLoader;
            this.hashCode = System.identityHashCode(classLoader);
        }

        public int hashCode() {
            return this.hashCode;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof LookupKey) {
                return this.classLoader == ((LookupKey) obj).classLoader;
            }
            if (!(obj instanceof StorageKey)) {
                return false;
            }
            StorageKey storageKey = (StorageKey) obj;
            return this.hashCode == storageKey.hashCode && this.classLoader == storageKey.get();
        }
    }

    protected static class StorageKey extends WeakReference<ClassLoader> {
        private final int hashCode;

        protected StorageKey(ClassLoader classLoader, ReferenceQueue<? super ClassLoader> referenceQueue) {
            super(classLoader, referenceQueue);
            this.hashCode = System.identityHashCode(classLoader);
        }

        public int hashCode() {
            return this.hashCode;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof LookupKey) {
                LookupKey lookupKey = (LookupKey) obj;
                return this.hashCode == lookupKey.hashCode && get() == lookupKey.classLoader;
            }
            if (!(obj instanceof StorageKey)) {
                return false;
            }
            StorageKey storageKey = (StorageKey) obj;
            return this.hashCode == storageKey.hashCode && get() == storageKey.get();
        }
    }

    public static class WithInlineExpunction<S> extends TypeCache<S> {
        public WithInlineExpunction(Sort sort) {
            super(sort);
        }

        @Override // org.modelmapper.internal.bytebuddy.TypeCache
        public Class<?> find(ClassLoader classLoader, S s) {
            try {
                return super.find(classLoader, s);
            } finally {
                expungeStaleEntries();
            }
        }

        @Override // org.modelmapper.internal.bytebuddy.TypeCache
        public Class<?> insert(ClassLoader classLoader, S s, Class<?> cls) {
            try {
                return super.insert(classLoader, s, cls);
            } finally {
                expungeStaleEntries();
            }
        }

        @Override // org.modelmapper.internal.bytebuddy.TypeCache
        public Class<?> findOrInsert(ClassLoader classLoader, S s, Callable<Class<?>> callable) {
            try {
                return super.findOrInsert(classLoader, s, callable);
            } finally {
                expungeStaleEntries();
            }
        }

        @Override // org.modelmapper.internal.bytebuddy.TypeCache
        public Class<?> findOrInsert(ClassLoader classLoader, S s, Callable<Class<?>> callable, Object obj) {
            try {
                return super.findOrInsert(classLoader, s, callable, obj);
            } finally {
                expungeStaleEntries();
            }
        }
    }

    public static class SimpleKey {
        private final Set<String> types;

        public SimpleKey(Class<?> cls, Class<?>... clsArr) {
            this(cls, Arrays.asList(clsArr));
        }

        public SimpleKey(Class<?> cls, Collection<? extends Class<?>> collection) {
            this(CompoundList.of(cls, new ArrayList(collection)));
        }

        public SimpleKey(Collection<? extends Class<?>> collection) {
            this.types = new HashSet();
            Iterator<? extends Class<?>> it = collection.iterator();
            while (it.hasNext()) {
                this.types.add(it.next().getName());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            return this.types.equals(((SimpleKey) obj).types);
        }

        public int hashCode() {
            return this.types.hashCode();
        }
    }
}
