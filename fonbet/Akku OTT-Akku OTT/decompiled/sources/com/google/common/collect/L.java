package com.google.common.collect;

import com.google.common.collect.n0;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;

/* loaded from: classes4.dex */
public abstract class L<K, V> extends AbstractC0963k<K, V> implements Serializable {
    private static final long serialVersionUID = 0;
    public final transient I<K, ? extends E<V>> e;
    public final transient int f;

    public static class a<K, V> {
        public r a;
    }

    public static class b<K, V> extends E<Map.Entry<K, V>> {
        private static final long serialVersionUID = 0;
        public final L<K, V> b;

        public b(L<K, V> l) {
            this.b = l;
        }

        @Override // com.google.common.collect.E, java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return this.b.c(entry.getKey(), entry.getValue());
        }

        @Override // com.google.common.collect.E, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        /* renamed from: g */
        public final y0<Map.Entry<K, V>> iterator() {
            L<K, V> l = this.b;
            l.getClass();
            return new J(l);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return this.b.f;
        }

        @Override // com.google.common.collect.E
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    public static class c {
        public static final n0.a<? super L<?, ?>> a;
        public static final n0.a<? super L<?, ?>> b;

        static {
            try {
                a = new n0.a<>(L.class.getDeclaredField("map"));
                try {
                    b = new n0.a<>(L.class.getDeclaredField("size"));
                } catch (NoSuchFieldException e) {
                    throw new AssertionError(e);
                }
            } catch (NoSuchFieldException e2) {
                throw new AssertionError(e2);
            }
        }
    }

    public static final class d<K, V> extends E<V> {
        private static final long serialVersionUID = 0;
        public final transient L<K, V> b;

        public d(L<K, V> l) {
            this.b = l;
        }

        @Override // com.google.common.collect.E
        public final int b(int i, Object[] objArr) {
            y0<? extends E<V>> it = this.b.e.values().iterator();
            while (it.hasNext()) {
                i = it.next().b(i, objArr);
            }
            return i;
        }

        @Override // com.google.common.collect.E, java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            return this.b.d(obj);
        }

        @Override // com.google.common.collect.E, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        /* renamed from: g */
        public final y0<V> iterator() {
            L<K, V> l = this.b;
            l.getClass();
            return new K(l);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return this.b.f;
        }

        @Override // com.google.common.collect.E
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    public L(I<K, ? extends E<V>> i, int i2) {
        this.e = i;
        this.f = i2;
    }

    @Override // com.google.common.collect.W
    public final Collection a() {
        b bVar = this.a;
        if (bVar == null) {
            bVar = new b(this);
            this.a = bVar;
        }
        return bVar;
    }

    @Override // com.google.common.collect.AbstractC0960h
    public final boolean d(Object obj) {
        return obj != null && super.d(obj);
    }

    @Override // com.google.common.collect.W
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public I<K, Collection<V>> b() {
        return this.e;
    }

    @Override // com.google.common.collect.W
    /* renamed from: g */
    public abstract G get(Object obj);

    @Override // com.google.common.collect.W
    @Deprecated
    public final boolean put(K k, V v) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.AbstractC0960h, com.google.common.collect.W
    @Deprecated
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.W
    public final int size() {
        return this.f;
    }

    @Override // com.google.common.collect.W
    public final Collection values() {
        d dVar = this.c;
        if (dVar == null) {
            dVar = new d(this);
            this.c = dVar;
        }
        return dVar;
    }
}
