package com.facebook.ads.redexgen.core;

@com.google.common.base.ElementTypesAreNonnullByDefault
/* renamed from: com.facebook.ads.redexgen.X.k6, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1830k6<T> implements java.util.Iterator<T> {
    public com.facebook.ads.redexgen.core.EnumC1829k5 A00 = com.facebook.ads.redexgen.core.EnumC1829k5.A04;

    @javax.annotation.CheckForNull
    public T A01;

    @javax.annotation.CheckForNull
    public abstract T A03();

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.k6 != com.google.common.base.AbstractIterator<T> */
    private boolean A01() {
        this.A00 = com.facebook.ads.redexgen.core.EnumC1829k5.A03;
        this.A01 = A03();
        if (this.A00 != com.facebook.ads.redexgen.core.EnumC1829k5.A02) {
            this.A00 = com.facebook.ads.redexgen.core.EnumC1829k5.A05;
            return true;
        }
        return false;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.k6 != com.google.common.base.AbstractIterator<T> */
    @javax.annotation.CheckForNull
    public final T A02() {
        this.A00 = com.facebook.ads.redexgen.core.EnumC1829k5.A02;
        return null;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.k6 != com.google.common.base.AbstractIterator<T> */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        com.facebook.ads.redexgen.core.AbstractC1866ki.A0D(this.A00 != com.facebook.ads.redexgen.core.EnumC1829k5.A03);
        switch (this.A00) {
            case A05:
                return true;
            case A04:
            default:
                return A01();
            case A02:
                return false;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.k6 != com.google.common.base.AbstractIterator<T> */
    @Override // java.util.Iterator
    @com.google.common.base.ParametricNullness
    public final T next() {
        if (hasNext()) {
            this.A00 = com.facebook.ads.redexgen.core.EnumC1829k5.A04;
            T t = (T) com.facebook.ads.redexgen.core.AbstractC1860kb.A00(this.A01);
            this.A01 = null;
            return t;
        }
        throw new java.util.NoSuchElementException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.k6 != com.google.common.base.AbstractIterator<T> */
    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException();
    }
}
