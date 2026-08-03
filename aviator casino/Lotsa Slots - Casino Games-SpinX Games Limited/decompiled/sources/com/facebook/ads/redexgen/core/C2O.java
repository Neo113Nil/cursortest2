package com.facebook.ads.redexgen.core;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* renamed from: com.facebook.ads.redexgen.X.2O, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public class C2O<K, V> extends com.facebook.ads.redexgen.core.BH<K, java.util.Collection<V>> {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C2L A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2O != com.google.common.collect.AbstractMapBasedMultimap<K, V>$KeySet */
    public C2O(final com.facebook.ads.redexgen.core.C2L this$0, final java.util.Map<K, java.util.Collection<V>> subMap) {
        super(subMap);
        this.A00 = this$0;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2O != com.google.common.collect.AbstractMapBasedMultimap<K, V>$KeySet */
    @Override // com.facebook.ads.redexgen.core.BH, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        com.facebook.ads.redexgen.core.AbstractC2126p9.A09(iterator());
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2O != com.google.common.collect.AbstractMapBasedMultimap<K, V>$KeySet */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(java.util.Collection<?> c) {
        return A00().keySet().containsAll(c);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2O != com.google.common.collect.AbstractMapBasedMultimap<K, V>$KeySet */
    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(@javax.annotation.CheckForNull java.lang.Object object) {
        return this == object || A00().keySet().equals(object);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2O != com.google.common.collect.AbstractMapBasedMultimap<K, V>$KeySet */
    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return A00().keySet().hashCode();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2O != com.google.common.collect.AbstractMapBasedMultimap<K, V>$KeySet */
    @Override // com.facebook.ads.redexgen.core.BH, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator<K> iterator() {
        return new com.facebook.ads.redexgen.core.C1932ln(this, A00().entrySet().iterator());
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2O != com.google.common.collect.AbstractMapBasedMultimap<K, V>$KeySet */
    @Override // com.facebook.ads.redexgen.core.BH, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(@javax.annotation.CheckForNull java.lang.Object key) {
        int i = 0;
        java.util.Collection collection = (java.util.Collection) A00().remove(key);
        if (collection != null) {
            i = collection.size();
            collection.clear();
            com.facebook.ads.redexgen.core.C2L.A03(this.A00, i);
        }
        return i > 0;
    }
}
