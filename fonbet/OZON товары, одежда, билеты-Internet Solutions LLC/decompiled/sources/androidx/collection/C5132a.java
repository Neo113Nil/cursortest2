package androidx.collection;

import androidx.annotation.NonNull;
import java.lang.reflect.Array;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.collection.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5132a<K, V> extends Z<K, V> implements Map<K, V> {

    /* renamed from: d, reason: collision with root package name */
    C5132a<K, V>.C0720a f38672d;

    /* renamed from: e, reason: collision with root package name */
    C5132a<K, V>.c f38673e;

    /* renamed from: f, reason: collision with root package name */
    C5132a<K, V>.e f38674f;

    /* renamed from: androidx.collection.a$a, reason: collision with other inner class name */
    final class C0720a extends AbstractSet<Map.Entry<K, V>> {
        C0720a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        @NonNull
        public final Iterator<Map.Entry<K, V>> iterator() {
            return new d();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return C5132a.this.size();
        }
    }

    /* renamed from: androidx.collection.a$b */
    final class b extends AbstractC5139h<K> {
        b() {
            super(C5132a.this.size());
        }

        @Override // androidx.collection.AbstractC5139h
        protected final K b(int i11) {
            return C5132a.this.j(i11);
        }

        @Override // androidx.collection.AbstractC5139h
        protected final void c(int i11) {
            C5132a.this.l(i11);
        }
    }

    /* renamed from: androidx.collection.a$d */
    final class d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

        /* renamed from: a, reason: collision with root package name */
        int f38678a;

        /* renamed from: b, reason: collision with root package name */
        int f38679b = -1;

        /* renamed from: c, reason: collision with root package name */
        boolean f38680c;

        d() {
            this.f38678a = C5132a.this.size() - 1;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (!this.f38680c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            int i11 = this.f38679b;
            C5132a c5132a = C5132a.this;
            return Intrinsics.d(key, c5132a.j(i11)) && Intrinsics.d(entry.getValue(), c5132a.n(this.f38679b));
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            if (this.f38680c) {
                return C5132a.this.j(this.f38679b);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            if (this.f38680c) {
                return C5132a.this.n(this.f38679b);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f38679b < this.f38678a;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            if (!this.f38680c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            int i11 = this.f38679b;
            C5132a c5132a = C5132a.this;
            K j11 = c5132a.j(i11);
            V n11 = c5132a.n(this.f38679b);
            return (j11 == null ? 0 : j11.hashCode()) ^ (n11 != null ? n11.hashCode() : 0);
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.f38679b++;
            this.f38680c = true;
            return this;
        }

        @Override // java.util.Iterator
        public final void remove() {
            if (!this.f38680c) {
                throw new IllegalStateException();
            }
            C5132a.this.l(this.f38679b);
            this.f38679b--;
            this.f38678a--;
            this.f38680c = false;
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v11) {
            if (this.f38680c) {
                return C5132a.this.m(this.f38679b, v11);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public final String toString() {
            return getKey() + "=" + getValue();
        }
    }

    /* renamed from: androidx.collection.a$f */
    final class f extends AbstractC5139h<V> {
        f() {
            super(C5132a.this.size());
        }

        @Override // androidx.collection.AbstractC5139h
        protected final V b(int i11) {
            return C5132a.this.n(i11);
        }

        @Override // androidx.collection.AbstractC5139h
        protected final void c(int i11) {
            C5132a.this.l(i11);
        }
    }

    public C5132a(C5132a c5132a) {
        super(0);
        if (c5132a != null) {
            k(c5132a);
        }
    }

    @Override // java.util.Map
    @NonNull
    public final Set<Map.Entry<K, V>> entrySet() {
        C5132a<K, V>.C0720a c0720a = this.f38672d;
        if (c0720a != null) {
            return c0720a;
        }
        C5132a<K, V>.C0720a c0720a2 = new C0720a();
        this.f38672d = c0720a2;
        return c0720a2;
    }

    @Override // java.util.Map
    @NonNull
    public final Set<K> keySet() {
        C5132a<K, V>.c cVar = this.f38673e;
        if (cVar != null) {
            return cVar;
        }
        C5132a<K, V>.c cVar2 = new c();
        this.f38673e = cVar2;
        return cVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean o(@NonNull Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean p(@NonNull Collection<?> collection) {
        int size = size();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return size != size();
    }

    @Override // java.util.Map
    public final void putAll(@NonNull Map<? extends K, ? extends V> map) {
        c(map.size() + size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public final boolean q(@NonNull Collection<?> collection) {
        int size = size();
        for (int size2 = size() - 1; size2 >= 0; size2--) {
            if (!collection.contains(j(size2))) {
                l(size2);
            }
        }
        return size != size();
    }

    @Override // java.util.Map
    @NonNull
    public final Collection<V> values() {
        C5132a<K, V>.e eVar = this.f38674f;
        if (eVar != null) {
            return eVar;
        }
        C5132a<K, V>.e eVar2 = new e();
        this.f38674f = eVar2;
        return eVar2;
    }

    public C5132a() {
    }

    /* renamed from: androidx.collection.a$c */
    final class c implements Set<K> {
        c() {
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean add(K k11) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean addAll(@NonNull Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final void clear() {
            C5132a.this.clear();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean contains(Object obj) {
            return C5132a.this.containsKey(obj);
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean containsAll(@NonNull Collection<?> collection) {
            return C5132a.this.o(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Set)) {
                return false;
            }
            Set set = (Set) obj;
            C5132a c5132a = C5132a.this;
            try {
                if (c5132a.size() == set.size()) {
                    return c5132a.o(set);
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }

        @Override // java.util.Set, java.util.Collection
        public final int hashCode() {
            C5132a c5132a = C5132a.this;
            int i11 = 0;
            for (int size = c5132a.size() - 1; size >= 0; size--) {
                K j11 = c5132a.j(size);
                i11 += j11 == null ? 0 : j11.hashCode();
            }
            return i11;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean isEmpty() {
            return C5132a.this.isEmpty();
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        @NonNull
        public final Iterator<K> iterator() {
            return new b();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean remove(Object obj) {
            C5132a c5132a = C5132a.this;
            int h11 = c5132a.h(obj);
            if (h11 < 0) {
                return false;
            }
            c5132a.l(h11);
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean removeAll(@NonNull Collection<?> collection) {
            return C5132a.this.p(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean retainAll(@NonNull Collection<?> collection) {
            return C5132a.this.q(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public final int size() {
            return C5132a.this.size();
        }

        @Override // java.util.Set, java.util.Collection
        @NonNull
        public final <T> T[] toArray(@NonNull T[] tArr) {
            C5132a c5132a = C5132a.this;
            int size = c5132a.size();
            if (tArr.length < size) {
                tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), size));
            }
            for (int i11 = 0; i11 < size; i11++) {
                tArr[i11] = c5132a.j(i11);
            }
            if (tArr.length > size) {
                tArr[size] = null;
            }
            return tArr;
        }

        @Override // java.util.Set, java.util.Collection
        @NonNull
        public final Object[] toArray() {
            C5132a c5132a = C5132a.this;
            int size = c5132a.size();
            Object[] objArr = new Object[size];
            for (int i11 = 0; i11 < size; i11++) {
                objArr[i11] = c5132a.j(i11);
            }
            return objArr;
        }
    }

    /* renamed from: androidx.collection.a$e */
    final class e implements Collection<V> {
        e() {
        }

        @Override // java.util.Collection
        public final boolean add(V v11) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public final boolean addAll(@NonNull Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public final void clear() {
            C5132a.this.clear();
        }

        @Override // java.util.Collection
        public final boolean contains(Object obj) {
            return C5132a.this.b(obj) >= 0;
        }

        @Override // java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public final boolean isEmpty() {
            return C5132a.this.isEmpty();
        }

        @Override // java.util.Collection, java.lang.Iterable
        @NonNull
        public final Iterator<V> iterator() {
            return new f();
        }

        @Override // java.util.Collection
        public final boolean remove(Object obj) {
            C5132a c5132a = C5132a.this;
            int b11 = c5132a.b(obj);
            if (b11 < 0) {
                return false;
            }
            c5132a.l(b11);
            return true;
        }

        @Override // java.util.Collection
        public final boolean removeAll(@NonNull Collection<?> collection) {
            C5132a c5132a = C5132a.this;
            int size = c5132a.size();
            int i11 = 0;
            boolean z11 = false;
            while (i11 < size) {
                if (collection.contains(c5132a.n(i11))) {
                    c5132a.l(i11);
                    i11--;
                    size--;
                    z11 = true;
                }
                i11++;
            }
            return z11;
        }

        @Override // java.util.Collection
        public final boolean retainAll(@NonNull Collection<?> collection) {
            C5132a c5132a = C5132a.this;
            int size = c5132a.size();
            int i11 = 0;
            boolean z11 = false;
            while (i11 < size) {
                if (!collection.contains(c5132a.n(i11))) {
                    c5132a.l(i11);
                    i11--;
                    size--;
                    z11 = true;
                }
                i11++;
            }
            return z11;
        }

        @Override // java.util.Collection
        public final int size() {
            return C5132a.this.size();
        }

        @Override // java.util.Collection
        @NonNull
        public final <T> T[] toArray(@NonNull T[] tArr) {
            C5132a c5132a = C5132a.this;
            int size = c5132a.size();
            if (tArr.length < size) {
                tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), size));
            }
            for (int i11 = 0; i11 < size; i11++) {
                tArr[i11] = c5132a.n(i11);
            }
            if (tArr.length > size) {
                tArr[size] = null;
            }
            return tArr;
        }

        @Override // java.util.Collection
        @NonNull
        public final Object[] toArray() {
            C5132a c5132a = C5132a.this;
            int size = c5132a.size();
            Object[] objArr = new Object[size];
            for (int i11 = 0; i11 < size; i11++) {
                objArr[i11] = c5132a.n(i11);
            }
            return objArr;
        }
    }
}
