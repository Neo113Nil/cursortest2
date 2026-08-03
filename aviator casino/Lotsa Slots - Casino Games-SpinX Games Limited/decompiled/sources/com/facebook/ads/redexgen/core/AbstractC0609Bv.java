package com.facebook.ads.redexgen.core;

@com.google.common.collect.ElementTypesAreNonnullByDefault
/* renamed from: com.facebook.ads.redexgen.X.Bv, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC0609Bv<T> extends com.facebook.ads.redexgen.core.C4C<T> {
    public com.facebook.ads.redexgen.core.EnumC1929lk A00 = com.facebook.ads.redexgen.core.EnumC1929lk.A04;

    @javax.annotation.CheckForNull
    public T A01;

    @javax.annotation.CheckForNull
    public abstract T A02();

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bv != com.google.common.collect.AbstractIterator<T> */
    private boolean A00() {
        this.A00 = com.facebook.ads.redexgen.core.EnumC1929lk.A03;
        this.A01 = A02();
        if (this.A00 != com.facebook.ads.redexgen.core.EnumC1929lk.A02) {
            this.A00 = com.facebook.ads.redexgen.core.EnumC1929lk.A05;
            return true;
        }
        return false;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bv != com.google.common.collect.AbstractIterator<T> */
    @javax.annotation.CheckForNull
    public final T A01() {
        this.A00 = com.facebook.ads.redexgen.core.EnumC1929lk.A02;
        return null;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bv != com.google.common.collect.AbstractIterator<T> */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        com.facebook.ads.redexgen.core.AbstractC1866ki.A0D(this.A00 != com.facebook.ads.redexgen.core.EnumC1929lk.A03);
        switch (this.A00) {
            case A05:
                return true;
            case A04:
            default:
                return A00();
            case A02:
                return false;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bv != com.google.common.collect.AbstractIterator<T> */
    @Override // java.util.Iterator
    @com.google.common.collect.ParametricNullness
    public final T next() {
        if (hasNext()) {
            this.A00 = com.facebook.ads.redexgen.core.EnumC1929lk.A04;
            T t = (T) com.facebook.ads.redexgen.core.AbstractC2193qF.A01(this.A01);
            this.A01 = null;
            return t;
        }
        throw new java.util.NoSuchElementException();
    }
}
