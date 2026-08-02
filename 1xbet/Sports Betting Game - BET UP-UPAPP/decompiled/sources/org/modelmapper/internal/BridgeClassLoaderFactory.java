package org.modelmapper.internal;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import org.modelmapper.ModelMapper;

/* loaded from: classes4.dex */
public class BridgeClassLoaderFactory {
    private static final Map<ClassLoader, WeakReference<BridgeClassLoader>> CACHE = new WeakHashMap();

    private static final class BridgeClassLoader extends ClassLoader {
        private final Set<ClassLoader> additionalClassLoaders;
        private final ClassLoader internalClassSpace;

        BridgeClassLoader(ClassLoader classLoader) {
            super(classLoader);
            this.internalClassSpace = ModelMapper.class.getClassLoader();
            this.additionalClassLoaders = Collections.newSetFromMap(new ConcurrentHashMap());
        }

        @Override // java.lang.ClassLoader
        protected Class<?> findClass(String str) throws ClassNotFoundException {
            if (str.startsWith("org.modelmapper.internal.cglib")) {
                return this.internalClassSpace.loadClass(str);
            }
            Iterator<ClassLoader> it = this.additionalClassLoaders.iterator();
            while (it.hasNext()) {
                try {
                    return it.next().loadClass(str);
                } catch (ClassNotFoundException unused) {
                }
            }
            throw new ClassNotFoundException(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAdditionalClassLoaders(Set<ClassLoader> set) {
            set.remove(getParent());
            this.additionalClassLoaders.addAll(set);
        }
    }

    static ClassLoader getClassLoader(Class<?> cls) {
        BridgeClassLoader bridgeClassLoader;
        Set<ClassLoader> allClassLoadersInTheTypeHierarchy = getAllClassLoadersInTheTypeHierarchy(getAllExtendedOrImplementedTypesRecursively(cls));
        synchronized (BridgeClassLoaderFactory.class) {
            Map<ClassLoader, WeakReference<BridgeClassLoader>> map = CACHE;
            WeakReference<BridgeClassLoader> weakReference = map.get(cls.getClassLoader());
            bridgeClassLoader = weakReference != null ? weakReference.get() : null;
            if (bridgeClassLoader == null) {
                bridgeClassLoader = new BridgeClassLoader(cls.getClassLoader());
                map.put(cls.getClassLoader(), new WeakReference<>(bridgeClassLoader));
            }
            bridgeClassLoader.addAdditionalClassLoaders(allClassLoadersInTheTypeHierarchy);
        }
        return bridgeClassLoader;
    }

    private static Set<ClassLoader> getAllClassLoadersInTheTypeHierarchy(Set<Class<?>> set) {
        HashSet hashSet = new HashSet();
        for (Class<?> cls : set) {
            if (cls.getClassLoader() != null) {
                hashSet.add(cls.getClassLoader());
            }
        }
        return hashSet;
    }

    private static Set<Class<?>> getAllExtendedOrImplementedTypesRecursively(Class<?> cls) {
        ArrayList arrayList = new ArrayList();
        do {
            arrayList.add(cls);
            Class<?>[] interfaces = cls.getInterfaces();
            if (interfaces.length > 0) {
                arrayList.addAll(Arrays.asList(interfaces));
                for (Class<?> cls2 : interfaces) {
                    arrayList.addAll(getAllExtendedOrImplementedTypesRecursively(cls2));
                }
            }
            cls = cls.getSuperclass();
            if (cls == null) {
                break;
            }
        } while (!"java.lang.Object".equals(cls.getCanonicalName()));
        return new HashSet(arrayList);
    }
}
