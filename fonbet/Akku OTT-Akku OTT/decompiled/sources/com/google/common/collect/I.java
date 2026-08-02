package com.google.common.collect;

import com.google.common.collect.E;
import com.google.common.collect.j0;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

/* loaded from: classes4.dex */
public abstract class I<K, V> implements Map<K, V>, Serializable {
    private static final long serialVersionUID = 912559;
    public transient M<Map.Entry<K, V>> a;
    public transient M<K> b;
    public transient E<V> c;

    public static class a<K, V> {
        public Object[] a;
        public int b = 0;
        public C0131a c;

        /* renamed from: com.google.common.collect.I$a$a, reason: collision with other inner class name */
        public static final class C0131a {
            public final Object a;
            public final Object b;
            public final Object c;

            public C0131a(Object obj, Object obj2, Object obj3) {
                this.a = obj;
                this.b = obj2;
                this.c = obj3;
            }

            public final IllegalArgumentException a() {
                StringBuilder sb = new StringBuilder("Multiple entries with same key: ");
                Object obj = this.a;
                sb.append(obj);
                sb.append("=");
                sb.append(this.b);
                sb.append(" and ");
                sb.append(obj);
                sb.append("=");
                sb.append(this.c);
                return new IllegalArgumentException(sb.toString());
            }
        }

        public a(int i) {
            this.a = new Object[i * 2];
        }

        public final j0 a(boolean z) {
            C0131a c0131a;
            C0131a c0131a2;
            if (z && (c0131a2 = this.c) != null) {
                throw c0131a2.a();
            }
            j0 i = j0.i(this.b, this.a, this);
            if (!z || (c0131a = this.c) == null) {
                return i;
            }
            throw c0131a.a();
        }

        public I<K, V> b() {
            return a(false);
        }

        public I<K, V> c() {
            return a(true);
        }

        public a<K, V> d(K k, V v) {
            int i = (this.b + 1) * 2;
            Object[] objArr = this.a;
            if (i > objArr.length) {
                this.a = Arrays.copyOf(objArr, E.b.b(objArr.length, i));
            }
            C0965m.a(k, v);
            Object[] objArr2 = this.a;
            int i2 = this.b;
            int i3 = i2 * 2;
            objArr2[i3] = k;
            objArr2[i3 + 1] = v;
            this.b = i2 + 1;
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void e(Map.Entry entry) {
            d(entry.getKey(), entry.getValue());
        }

        public a<K, V> f(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            if (iterable instanceof Collection) {
                int size = (((Collection) iterable).size() + this.b) * 2;
                Object[] objArr = this.a;
                if (size > objArr.length) {
                    this.a = Arrays.copyOf(objArr, E.b.b(objArr.length, size));
                }
            }
            Iterator<? extends Map.Entry<? extends K, ? extends V>> it = iterable.iterator();
            while (it.hasNext()) {
                e(it.next());
            }
            return this;
        }

        public a<K, V> g(Map<? extends K, ? extends V> map) {
            return f(map.entrySet());
        }
    }

    public static class b<K, V> implements Serializable {
        private static final long serialVersionUID = 0;
        public final Object[] a;
        public final Object[] b;

        public b(I<K, V> i) {
            Object[] objArr = new Object[i.size()];
            Object[] objArr2 = new Object[i.size()];
            y0<Map.Entry<K, V>> it = i.entrySet().iterator();
            int i2 = 0;
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                objArr[i2] = next.getKey();
                objArr2[i2] = next.getValue();
                i2++;
            }
            this.a = objArr;
            this.b = objArr2;
        }

        public a<K, V> a(int i) {
            return new a<>(i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final Object readResolve() {
            Object[] objArr = this.a;
            boolean z = objArr instanceof M;
            Object[] objArr2 = this.b;
            if (!z) {
                a<K, V> a = a(objArr.length);
                for (int i = 0; i < objArr.length; i++) {
                    a.d(objArr[i], objArr2[i]);
                }
                return a.c();
            }
            M m = (M) objArr;
            a<K, V> a2 = a(m.size());
            Iterator it = m.iterator();
            y0 it2 = ((E) objArr2).iterator();
            while (it.hasNext()) {
                a2.d(it.next(), it2.next());
            }
            return a2.c();
        }
    }

    public static <K, V> a<K, V> a() {
        return new a<>(4);
    }

    public static <K, V> I<K, V> b(Map<? extends K, ? extends V> map) {
        if ((map instanceof I) && !(map instanceof SortedMap)) {
            I<K, V> i = (I) map;
            i.getClass();
            return i;
        }
        Set<Map.Entry<? extends K, ? extends V>> entrySet = map.entrySet();
        a aVar = new a(entrySet instanceof Collection ? entrySet.size() : 4);
        aVar.f(entrySet);
        return aVar.a(true);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public abstract j0.a c();

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    public abstract j0.b d();

    public abstract E<V> e();

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return V.b(this, obj);
    }

    @Override // java.util.Map
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final M<Map.Entry<K, V>> entrySet() {
        M<Map.Entry<K, V>> m = this.a;
        if (m != null) {
            return m;
        }
        j0.a c = c();
        this.a = c;
        return c;
    }

    @Override // java.util.Map
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final M<K> keySet() {
        M<K> m = this.b;
        if (m != null) {
            return m;
        }
        j0.b d = d();
        this.b = d;
        return d;
    }

    @Override // java.util.Map
    public abstract V get(Object obj);

    @Override // java.util.Map
    public final V getOrDefault(Object obj, V v) {
        V v2 = get(obj);
        return v2 != null ? v2 : v;
    }

    @Override // java.util.Map
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public E<V> values() {
        E<V> e = this.c;
        if (e != null) {
            return e;
        }
        E<V> e2 = e();
        this.c = e2;
        return e2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return t0.c(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    @Deprecated
    public final V put(K k, V v) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        return V.c(this);
    }

    public Object writeReplace() {
        return new b(this);
    }
}
