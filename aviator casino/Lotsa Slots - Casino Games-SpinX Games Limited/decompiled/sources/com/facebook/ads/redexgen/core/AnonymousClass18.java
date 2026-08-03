package com.facebook.ads.redexgen.core;

/* JADX INFO: Add missing generic type declarations: [K] */
/* renamed from: com.facebook.ads.redexgen.X.18, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public class AnonymousClass18<K> extends com.facebook.ads.redexgen.core.C2L<K, V>.KeySet implements java.util.SortedSet<K> {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C2L A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.18 != com.google.common.collect.AbstractMapBasedMultimap<K, V>$SortedKeySet */
    public AnonymousClass18(final com.facebook.ads.redexgen.core.C2L this$0, java.util.SortedMap<K, java.util.Collection<V>> subMap) {
        super(this$0, subMap);
        this.A00 = this$0;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.18 != com.google.common.collect.AbstractMapBasedMultimap<K, V>$SortedKeySet */
    public java.util.SortedMap<K, java.util.Collection<V>> A04() {
        return (java.util.SortedMap) super.A00();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.18 != com.google.common.collect.AbstractMapBasedMultimap<K, V>$SortedKeySet */
    @Override // java.util.SortedSet
    @javax.annotation.CheckForNull
    public final java.util.Comparator<? super K> comparator() {
        return A04().comparator();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.18 != com.google.common.collect.AbstractMapBasedMultimap<K, V>$SortedKeySet */
    @Override // java.util.SortedSet
    @com.google.common.collect.ParametricNullness
    public final K first() {
        return A04().firstKey();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.18 != com.google.common.collect.AbstractMapBasedMultimap<K, V>$SortedKeySet */
    @Override // java.util.SortedSet
    public java.util.SortedSet<K> headSet(@com.google.common.collect.ParametricNullness K toElement) {
        return new com.facebook.ads.redexgen.core.AnonymousClass18(this.A00, A04().headMap(toElement));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.18 != com.google.common.collect.AbstractMapBasedMultimap<K, V>$SortedKeySet */
    @Override // java.util.SortedSet
    @com.google.common.collect.ParametricNullness
    public final K last() {
        return A04().lastKey();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.18 != com.google.common.collect.AbstractMapBasedMultimap<K, V>$SortedKeySet */
    @Override // java.util.SortedSet
    public java.util.SortedSet<K> subSet(@com.google.common.collect.ParametricNullness K fromElement, @com.google.common.collect.ParametricNullness K toElement) {
        return new com.facebook.ads.redexgen.core.AnonymousClass18(this.A00, A04().subMap(fromElement, toElement));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.18 != com.google.common.collect.AbstractMapBasedMultimap<K, V>$SortedKeySet */
    @Override // java.util.SortedSet
    public java.util.SortedSet<K> tailSet(@com.google.common.collect.ParametricNullness K fromElement) {
        return new com.facebook.ads.redexgen.core.AnonymousClass18(this.A00, A04().tailMap(fromElement));
    }
}
