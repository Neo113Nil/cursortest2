package com.facebook.ads.redexgen.core;

@com.google.common.collect.ElementTypesAreNonnullByDefault
/* renamed from: com.facebook.ads.redexgen.X.1d, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC03511d<F, T> implements java.util.Iterator<T> {
    public final java.util.Iterator<? extends F> A00;

    @com.google.common.collect.ParametricNullness
    public abstract T A01(@com.google.common.collect.ParametricNullness F from);

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1d != com.google.common.collect.TransformedIterator<F, T> */
    public AbstractC03511d(java.util.Iterator<? extends F> backingIterator) {
        this.A00 = (java.util.Iterator) com.facebook.ads.redexgen.core.AbstractC1866ki.A04(backingIterator);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1d != com.google.common.collect.TransformedIterator<F, T> */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.A00.hasNext();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1d != com.google.common.collect.TransformedIterator<F, T> */
    @Override // java.util.Iterator
    @com.google.common.collect.ParametricNullness
    public final T next() {
        return A01(this.A00.next());
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1d != com.google.common.collect.TransformedIterator<F, T> */
    @Override // java.util.Iterator
    public final void remove() {
        this.A00.remove();
    }
}
