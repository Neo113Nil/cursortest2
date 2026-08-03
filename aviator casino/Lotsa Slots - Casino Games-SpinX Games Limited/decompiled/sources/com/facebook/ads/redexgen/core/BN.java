package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class BN<T> extends com.facebook.ads.redexgen.core.C4C<T> {
    public boolean A00;
    public final T A01;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BN != com.google.common.collect.Iterators$SingletonIterator<T> */
    public BN(T value) {
        this.A01 = value;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BN != com.google.common.collect.Iterators$SingletonIterator<T> */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.A00;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BN != com.google.common.collect.Iterators$SingletonIterator<T> */
    @Override // java.util.Iterator
    @com.google.common.collect.ParametricNullness
    public final T next() {
        if (!this.A00) {
            this.A00 = true;
            return this.A01;
        }
        throw new java.util.NoSuchElementException();
    }
}
