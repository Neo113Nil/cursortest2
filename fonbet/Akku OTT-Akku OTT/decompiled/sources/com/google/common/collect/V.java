package com.google.common.collect;

import com.google.common.collect.AbstractC0958f;
import com.google.common.collect.AbstractC0958f.a.C0133a;
import com.google.common.collect.t0;
import com.google.common.collect.x0;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public final class V {

    public static abstract class a<K, V> extends t0.c<Map.Entry<K, V>> {
        public abstract Map<K, V> a();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            a().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            V v;
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Map<K, V> a = a();
            a.getClass();
            try {
                v = a.get(key);
            } catch (ClassCastException | NullPointerException unused) {
                v = null;
            }
            if (com.google.common.base.i.a(v, entry.getValue())) {
                return v != null || a().containsKey(key);
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean isEmpty() {
            return a().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (contains(obj) && (obj instanceof Map.Entry)) {
                return a().keySet().remove(((Map.Entry) obj).getKey());
            }
            return false;
        }

        @Override // com.google.common.collect.t0.c, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean removeAll(Collection<?> collection) {
            try {
                collection.getClass();
                return t0.e(collection, this);
            } catch (UnsupportedOperationException unused) {
                Iterator<?> it = collection.iterator();
                boolean z = false;
                while (it.hasNext()) {
                    z |= remove(it.next());
                }
                return z;
            }
        }

        @Override // com.google.common.collect.t0.c, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean retainAll(Collection<?> collection) {
            try {
                collection.getClass();
                return super.retainAll(collection);
            } catch (UnsupportedOperationException unused) {
                HashSet hashSet = new HashSet(V.a(collection.size()));
                for (Object obj : collection) {
                    if (contains(obj) && (obj instanceof Map.Entry)) {
                        hashSet.add(((Map.Entry) obj).getKey());
                    }
                }
                return a().keySet().retainAll(hashSet);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return a().size();
        }
    }

    public static abstract class b<K, V> extends AbstractMap<K, V> {

        public class a extends a<K, V> {
            public a() {
            }

            @Override // com.google.common.collect.V.a
            public final Map<K, V> a() {
                return b.this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public final Iterator<Map.Entry<K, V>> iterator() {
                return ((x0.a) b.this).a.iterator();
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final void clear() {
            P.a(((x0.a) this).a.iterator());
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Set<Map.Entry<K, V>> entrySet() {
            return new a();
        }
    }

    public static class c<K, V> extends t0.c<K> {
        public final Map<K, V> a;

        public c(Map<K, V> map) {
            map.getClass();
            this.a = map;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return this.a.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean isEmpty() {
            return this.a.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return this.a.size();
        }
    }

    public static class d<K, V> extends AbstractCollection<V> {
        public final e a;

        public d(e eVar) {
            this.a = eVar;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            ((AbstractC0958f.a) this.a).clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            return this.a.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean isEmpty() {
            return this.a.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator<V> iterator() {
            return new U(this.a.entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean remove(Object obj) {
            try {
                return super.remove(obj);
            } catch (UnsupportedOperationException unused) {
                e eVar = this.a;
                for (Map.Entry<K, V> entry : eVar.entrySet()) {
                    if (com.google.common.base.i.a(obj, entry.getValue())) {
                        ((AbstractC0958f.a) eVar).remove(entry.getKey());
                        return true;
                    }
                }
                return false;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            try {
                collection.getClass();
                return super.removeAll(collection);
            } catch (UnsupportedOperationException unused) {
                HashSet hashSet = new HashSet();
                e eVar = this.a;
                for (Map.Entry<K, V> entry : eVar.entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        hashSet.add(entry.getKey());
                    }
                }
                return eVar.keySet().removeAll(hashSet);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            try {
                collection.getClass();
                return super.retainAll(collection);
            } catch (UnsupportedOperationException unused) {
                HashSet hashSet = new HashSet();
                e eVar = this.a;
                for (Map.Entry<K, V> entry : eVar.entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        hashSet.add(entry.getKey());
                    }
                }
                return eVar.keySet().retainAll(hashSet);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return ((AbstractC0958f.a) this.a).c.size();
        }
    }

    public static abstract class e<K, V> extends AbstractMap<K, V> {
        public transient AbstractC0958f.a.C0133a a;
        public transient d b;

        @Override // java.util.AbstractMap, java.util.Map
        public final Set<Map.Entry<K, V>> entrySet() {
            AbstractC0958f.a.C0133a c0133a = this.a;
            if (c0133a != null) {
                return c0133a;
            }
            AbstractC0958f.a.C0133a c0133a2 = ((AbstractC0958f.a) this).new C0133a();
            this.a = c0133a2;
            return c0133a2;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Collection<V> values() {
            d dVar = this.b;
            if (dVar != null) {
                return dVar;
            }
            d dVar2 = new d(this);
            this.b = dVar2;
            return dVar2;
        }
    }

    public static int a(int i) {
        if (i < 3) {
            C0965m.b(i, "expectedSize");
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) Math.ceil(i / 0.75d);
        }
        return Integer.MAX_VALUE;
    }

    public static boolean b(Map<?, ?> map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static String c(Map<?, ?> map) {
        int size = map.size();
        C0965m.b(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(size * 8, 1073741824L));
        sb.append('{');
        boolean z = true;
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z = false;
        }
        sb.append('}');
        return sb.toString();
    }
}
