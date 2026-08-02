package com.google.common.collect;

import com.google.common.collect.AbstractC0975x;
import com.google.common.collect.V;
import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes4.dex */
public final class x0<K extends Comparable, V> implements g0<K, V> {
    public final TreeMap a = new TreeMap();

    public final class a extends V.b<e0<K>, V> {
        public final Iterable<Map.Entry<e0<K>, V>> a;

        public a(Collection collection) {
            this.a = collection;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean containsKey(Object obj) {
            return get(obj) != null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final V get(Object obj) {
            if (!(obj instanceof e0)) {
                return null;
            }
            e0 e0Var = (e0) obj;
            b bVar = (b) x0.this.a.get(e0Var.a);
            if (bVar == null || !bVar.a.equals(e0Var)) {
                return null;
            }
            return bVar.b;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final int size() {
            return x0.this.a.size();
        }
    }

    public static final class b<K extends Comparable, V> extends AbstractC0959g<e0<K>, V> {
        public final e0<K> a;
        public final V b;

        public b() {
            throw null;
        }

        public b(e0<K> e0Var, V v) {
            this.a = e0Var;
            this.b = v;
        }

        @Override // java.util.Map.Entry
        public final Object getKey() {
            return this.a;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.b;
        }
    }

    @Override // com.google.common.collect.g0
    public final Map<e0<K>, V> a() {
        return new a(this.a.values());
    }

    public final Map.Entry b(Long l) {
        Map.Entry floorEntry = this.a.floorEntry(new AbstractC0975x.c(l));
        if (floorEntry == null) {
            return null;
        }
        e0<K> e0Var = ((b) floorEntry.getValue()).a;
        e0Var.getClass();
        if (!e0Var.a.e(l) || e0Var.b.e(l)) {
            return null;
        }
        return (Map.Entry) floorEntry.getValue();
    }

    public final void c(e0<K> e0Var, V v) {
        AbstractC0975x<K> abstractC0975x = e0Var.a;
        AbstractC0975x<K> abstractC0975x2 = e0Var.b;
        boolean equals = abstractC0975x.equals(abstractC0975x2);
        AbstractC0975x<K> abstractC0975x3 = e0Var.a;
        if (equals) {
            return;
        }
        v.getClass();
        boolean equals2 = abstractC0975x3.equals(abstractC0975x2);
        TreeMap treeMap = this.a;
        if (!equals2) {
            Map.Entry lowerEntry = treeMap.lowerEntry(abstractC0975x3);
            if (lowerEntry != null) {
                e0<K> e0Var2 = ((b) lowerEntry.getValue()).a;
                AbstractC0975x<K> abstractC0975x4 = e0Var2.b;
                AbstractC0975x<K> abstractC0975x5 = e0Var2.b;
                if (abstractC0975x4.compareTo(abstractC0975x3) > 0) {
                    if (abstractC0975x5.compareTo(abstractC0975x2) > 0) {
                        d(abstractC0975x2, abstractC0975x5, ((b) lowerEntry.getValue()).b);
                    }
                    d(e0Var2.a, abstractC0975x3, ((b) lowerEntry.getValue()).b);
                }
            }
            Map.Entry lowerEntry2 = treeMap.lowerEntry(abstractC0975x2);
            if (lowerEntry2 != null) {
                b bVar = (b) lowerEntry2.getValue();
                if (bVar.a.b.compareTo(abstractC0975x2) > 0) {
                    d(abstractC0975x2, bVar.a.b, ((b) lowerEntry2.getValue()).b);
                }
            }
            treeMap.subMap(abstractC0975x3, abstractC0975x2).clear();
        }
        treeMap.put(abstractC0975x3, new b(e0Var, v));
    }

    public final void d(AbstractC0975x<K> abstractC0975x, AbstractC0975x<K> abstractC0975x2, V v) {
        this.a.put(abstractC0975x, new b(new e0(abstractC0975x, abstractC0975x2), v));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g0)) {
            return false;
        }
        return ((AbstractMap) a()).equals(((g0) obj).a());
    }

    public final int hashCode() {
        return ((AbstractMap) a()).hashCode();
    }

    public final String toString() {
        return this.a.values().toString();
    }
}
