package com.facebook.ads.redexgen.core;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* renamed from: com.facebook.ads.redexgen.X.Bt, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0607Bt<K, V> extends com.facebook.ads.redexgen.core.AbstractC2165pn<K, java.util.Collection<V>> {
    public final transient java.util.Map<K, java.util.Collection<V>> A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C2L A01;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bt != com.google.common.collect.AbstractMapBasedMultimap<K, V>$AsMap */
    public C0607Bt(final com.facebook.ads.redexgen.core.C2L this$0, java.util.Map<K, java.util.Collection<V>> submap) {
        this.A01 = this$0;
        this.A00 = submap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bt != com.google.common.collect.AbstractMapBasedMultimap<K, V>$AsMap */
    @Override // java.util.AbstractMap, java.util.Map
    @javax.annotation.CheckForNull
    /* renamed from: A07, reason: merged with bridge method [inline-methods] */
    public final java.util.Collection<V> get(@javax.annotation.CheckForNull java.lang.Object key) {
        java.util.Collection<V> collection = (java.util.Collection) com.facebook.ads.redexgen.core.AbstractC2166po.A05(this.A00, key);
        if (collection == null) {
            return null;
        }
        java.util.Collection<V> collection2 = this.A01.A0F(key, collection);
        return collection2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bt != com.google.common.collect.AbstractMapBasedMultimap<K, V>$AsMap */
    @Override // java.util.AbstractMap, java.util.Map
    @javax.annotation.CheckForNull
    /* renamed from: A08, reason: merged with bridge method [inline-methods] */
    public final java.util.Collection<V> remove(@javax.annotation.CheckForNull java.lang.Object key) {
        java.util.Collection<V> remove = this.A00.remove(key);
        if (remove == null) {
            return null;
        }
        java.util.Collection<V> A0D = this.A01.A0D();
        A0D.addAll(remove);
        com.facebook.ads.redexgen.core.C2L.A03(this.A01, remove.size());
        remove.clear();
        return A0D;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bt != com.google.common.collect.AbstractMapBasedMultimap<K, V>$AsMap */
    @Override // com.facebook.ads.redexgen.core.AbstractC2165pn
    public final java.util.Set<java.util.Map.Entry<K, java.util.Collection<V>>> A09() {
        return new com.facebook.ads.redexgen.core.BI<K, java.util.Collection<V>>() { // from class: com.facebook.ads.redexgen.X.2P
            public static java.lang.String[] A01 = {"c", "Cderzo7kRJnvUqpU20WcBh2OZWVVjooT", "Z", "ZZrF4bQPE17IkUPu05dPNeIYxEP3htEV", "zoL9Bw1Syr4GOxCjTnDxY342EbanM9q3", "GegVcEhGdWXR", "86lf1o9WQgzrbD", "NgZwPtD5hXQhY3eRyOKbKp0yAyP86bbs"};

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2P != com.google.common.collect.AbstractMapBasedMultimap<K, V>$AsMap$AsMapEntries */
            @Override // com.facebook.ads.redexgen.core.BI
            public final java.util.Map<K, java.util.Collection<V>> A00() {
                return com.facebook.ads.redexgen.core.C0607Bt.this;
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2P != com.google.common.collect.AbstractMapBasedMultimap<K, V>$AsMap$AsMapEntries */
            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean contains(@javax.annotation.CheckForNull java.lang.Object o) {
                return com.facebook.ads.redexgen.core.AbstractC2032nc.A03(com.facebook.ads.redexgen.core.C0607Bt.this.A00.entrySet(), o);
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2P != com.google.common.collect.AbstractMapBasedMultimap<K, V>$AsMap$AsMapEntries */
            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public final java.util.Iterator<java.util.Map.Entry<K, java.util.Collection<V>>> iterator() {
                return new com.facebook.ads.redexgen.core.C1930ll(com.facebook.ads.redexgen.core.C0607Bt.this);
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2P != com.google.common.collect.AbstractMapBasedMultimap<K, V>$AsMap$AsMapEntries */
            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean remove(@javax.annotation.CheckForNull java.lang.Object o) {
                if (!contains(o)) {
                    return false;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry) java.util.Objects.requireNonNull((java.util.Map.Entry) o);
                com.facebook.ads.redexgen.core.C0607Bt c0607Bt = com.facebook.ads.redexgen.core.C0607Bt.this;
                if (A01[2].length() == 19) {
                    throw new java.lang.RuntimeException();
                }
                A01[3] = "G2qcJwlII5HIikaXRsYLysr3qmkTj7oM";
                c0607Bt.A01.A0A(entry.getKey());
                return true;
            }
        };
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bt != com.google.common.collect.AbstractMapBasedMultimap<K, V>$AsMap */
    public final java.util.Map.Entry<K, java.util.Collection<V>> A0A(java.util.Map.Entry<K, java.util.Collection<V>> entry) {
        K key = entry.getKey();
        return com.facebook.ads.redexgen.core.AbstractC2166po.A01(key, this.A01.A0F(key, entry.getValue()));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bt != com.google.common.collect.AbstractMapBasedMultimap<K, V>$AsMap */
    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        java.util.Map<K, java.util.Collection<V>> map;
        java.util.Map<K, java.util.Collection<V>> map2 = this.A00;
        map = this.A01.A01;
        if (map2 == map) {
            this.A01.clear();
        } else {
            com.facebook.ads.redexgen.core.AbstractC2126p9.A09(new com.facebook.ads.redexgen.core.C1930ll(this));
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bt != com.google.common.collect.AbstractMapBasedMultimap<K, V>$AsMap */
    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(@javax.annotation.CheckForNull java.lang.Object key) {
        return com.facebook.ads.redexgen.core.AbstractC2166po.A0C(this.A00, key);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bt != com.google.common.collect.AbstractMapBasedMultimap<K, V>$AsMap */
    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(@javax.annotation.CheckForNull java.lang.Object object) {
        return this == object || this.A00.equals(object);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bt != com.google.common.collect.AbstractMapBasedMultimap<K, V>$AsMap */
    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.A00.hashCode();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bt != com.google.common.collect.AbstractMapBasedMultimap<K, V>$AsMap */
    @Override // java.util.AbstractMap, java.util.Map
    public java.util.Set<K> keySet() {
        return this.A01.A01();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bt != com.google.common.collect.AbstractMapBasedMultimap<K, V>$AsMap */
    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.A00.size();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bt != com.google.common.collect.AbstractMapBasedMultimap<K, V>$AsMap */
    @Override // java.util.AbstractMap
    public final java.lang.String toString() {
        return this.A00.toString();
    }
}
