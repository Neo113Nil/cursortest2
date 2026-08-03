package com.facebook.ads.redexgen.core;

/* JADX INFO: Add missing generic type declarations: [K] */
/* renamed from: com.facebook.ads.redexgen.X.0u, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0u<K> extends com.facebook.ads.redexgen.core.C2L<K, V>.SortedKeySet implements java.util.NavigableSet<K> {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C2L A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.0u != com.google.common.collect.AbstractMapBasedMultimap<K, V>$NavigableKeySet */
    public C0u(final com.facebook.ads.redexgen.core.C2L this$0, java.util.NavigableMap<K, java.util.Collection<V>> subMap) {
        super(this$0, subMap);
        this.A00 = this$0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.0u != com.google.common.collect.AbstractMapBasedMultimap<K, V>$NavigableKeySet */
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final java.util.NavigableMap<K, java.util.Collection<V>> A04() {
        return (java.util.NavigableMap) super.A04();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.0u != com.google.common.collect.AbstractMapBasedMultimap<K, V>$NavigableKeySet */
    @Override // java.util.NavigableSet, java.util.SortedSet
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final java.util.NavigableSet<K> headSet(@com.google.common.collect.ParametricNullness K toElement) {
        return headSet(toElement, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.0u != com.google.common.collect.AbstractMapBasedMultimap<K, V>$NavigableKeySet */
    @Override // java.util.NavigableSet, java.util.SortedSet
    /* renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final java.util.NavigableSet<K> tailSet(@com.google.common.collect.ParametricNullness K fromElement) {
        return tailSet(fromElement, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.0u != com.google.common.collect.AbstractMapBasedMultimap<K, V>$NavigableKeySet */
    @Override // java.util.NavigableSet, java.util.SortedSet
    /* renamed from: A03, reason: merged with bridge method [inline-methods] */
    public final java.util.NavigableSet<K> subSet(@com.google.common.collect.ParametricNullness K fromElement, @com.google.common.collect.ParametricNullness K toElement) {
        return subSet(fromElement, true, toElement, false);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.0u != com.google.common.collect.AbstractMapBasedMultimap<K, V>$NavigableKeySet */
    @Override // java.util.NavigableSet
    @javax.annotation.CheckForNull
    public final K ceiling(@com.google.common.collect.ParametricNullness K k) {
        return A04().ceilingKey(k);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.0u != com.google.common.collect.AbstractMapBasedMultimap<K, V>$NavigableKeySet */
    @Override // java.util.NavigableSet
    public final java.util.Iterator<K> descendingIterator() {
        return descendingSet().iterator();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.0u != com.google.common.collect.AbstractMapBasedMultimap<K, V>$NavigableKeySet */
    @Override // java.util.NavigableSet
    public final java.util.NavigableSet<K> descendingSet() {
        return new com.facebook.ads.redexgen.core.C0u(this.A00, A04().descendingMap());
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.0u != com.google.common.collect.AbstractMapBasedMultimap<K, V>$NavigableKeySet */
    @Override // java.util.NavigableSet
    @javax.annotation.CheckForNull
    public final K floor(@com.google.common.collect.ParametricNullness K k) {
        return A04().floorKey(k);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.0u != com.google.common.collect.AbstractMapBasedMultimap<K, V>$NavigableKeySet */
    @Override // java.util.NavigableSet
    public final java.util.NavigableSet<K> headSet(@com.google.common.collect.ParametricNullness K toElement, boolean inclusive) {
        return new com.facebook.ads.redexgen.core.C0u(this.A00, A04().headMap(toElement, inclusive));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.0u != com.google.common.collect.AbstractMapBasedMultimap<K, V>$NavigableKeySet */
    @Override // java.util.NavigableSet
    @javax.annotation.CheckForNull
    public final K higher(@com.google.common.collect.ParametricNullness K k) {
        return A04().higherKey(k);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.0u != com.google.common.collect.AbstractMapBasedMultimap<K, V>$NavigableKeySet */
    @Override // java.util.NavigableSet
    @javax.annotation.CheckForNull
    public final K lower(@com.google.common.collect.ParametricNullness K k) {
        return A04().lowerKey(k);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.0u != com.google.common.collect.AbstractMapBasedMultimap<K, V>$NavigableKeySet */
    @Override // java.util.NavigableSet
    @javax.annotation.CheckForNull
    public final K pollFirst() {
        return (K) com.facebook.ads.redexgen.core.AbstractC2126p9.A04(iterator());
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.0u != com.google.common.collect.AbstractMapBasedMultimap<K, V>$NavigableKeySet */
    @Override // java.util.NavigableSet
    @javax.annotation.CheckForNull
    public final K pollLast() {
        return (K) com.facebook.ads.redexgen.core.AbstractC2126p9.A04(descendingIterator());
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.0u != com.google.common.collect.AbstractMapBasedMultimap<K, V>$NavigableKeySet */
    @Override // java.util.NavigableSet
    public final java.util.NavigableSet<K> subSet(@com.google.common.collect.ParametricNullness K fromElement, @com.google.common.collect.ParametricNullness boolean fromInclusive, K toElement, boolean toInclusive) {
        return new com.facebook.ads.redexgen.core.C0u(this.A00, A04().subMap(fromElement, fromInclusive, toElement, toInclusive));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.0u != com.google.common.collect.AbstractMapBasedMultimap<K, V>$NavigableKeySet */
    @Override // java.util.NavigableSet
    public final java.util.NavigableSet<K> tailSet(@com.google.common.collect.ParametricNullness K fromElement, boolean inclusive) {
        return new com.facebook.ads.redexgen.core.C0u(this.A00, A04().tailMap(fromElement, inclusive));
    }
}
