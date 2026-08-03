package com.facebook.ads.redexgen.core;

/* JADX INFO: Add missing generic type declarations: [V] */
/* renamed from: com.facebook.ads.redexgen.X.lo, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1933lo<V> implements java.util.Iterator<V> {
    public final java.util.Collection<V> A00;
    public final java.util.Iterator<V> A01;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1934lp A02;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.lo != com.google.common.collect.AbstractMapBasedMultimap<K, V>$WrappedCollection$WrappedIterator */
    public C1933lo(final com.facebook.ads.redexgen.core.C1934lp this$1) {
        java.util.Iterator<V> A05;
        this.A02 = this$1;
        this.A00 = this.A02.A00;
        A05 = com.facebook.ads.redexgen.core.C2L.A05(this$1.A00);
        this.A01 = A05;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.lo != com.google.common.collect.AbstractMapBasedMultimap<K, V>$WrappedCollection$WrappedIterator */
    public C1933lo(final com.facebook.ads.redexgen.core.C1934lp this$1, java.util.Iterator<V> delegateIterator) {
        this.A02 = this$1;
        this.A00 = this.A02.A00;
        this.A01 = delegateIterator;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.lo != com.google.common.collect.AbstractMapBasedMultimap<K, V>$WrappedCollection$WrappedIterator */
    private final void A01() {
        this.A02.A04();
        if (this.A02.A00 == this.A00) {
        } else {
            throw new java.util.ConcurrentModificationException();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.lo != com.google.common.collect.AbstractMapBasedMultimap<K, V>$WrappedCollection$WrappedIterator */
    public final java.util.Iterator<V> A02() {
        A01();
        return this.A01;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.lo != com.google.common.collect.AbstractMapBasedMultimap<K, V>$WrappedCollection$WrappedIterator */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        A01();
        return this.A01.hasNext();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.lo != com.google.common.collect.AbstractMapBasedMultimap<K, V>$WrappedCollection$WrappedIterator */
    @Override // java.util.Iterator
    @com.google.common.collect.ParametricNullness
    public final V next() {
        A01();
        return this.A01.next();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.lo != com.google.common.collect.AbstractMapBasedMultimap<K, V>$WrappedCollection$WrappedIterator */
    @Override // java.util.Iterator
    public final void remove() {
        this.A01.remove();
        com.facebook.ads.redexgen.core.C2L.A01(this.A02.A04);
        this.A02.A05();
    }
}
