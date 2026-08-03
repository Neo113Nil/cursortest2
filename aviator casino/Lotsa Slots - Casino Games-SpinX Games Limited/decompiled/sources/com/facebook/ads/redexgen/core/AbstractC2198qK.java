package com.facebook.ads.redexgen.core;

@com.google.common.collect.ElementTypesAreNonnullByDefault
/* renamed from: com.facebook.ads.redexgen.X.qK, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC2198qK<T> implements java.util.Comparator<T> {
    @Override // java.util.Comparator
    public abstract int compare(@com.google.common.collect.ParametricNullness T left, @com.google.common.collect.ParametricNullness T right);

    public static <C extends java.lang.Comparable> com.facebook.ads.redexgen.core.AbstractC2198qK<C> A03() {
        return com.facebook.ads.redexgen.core.BB.A02;
    }

    public static <T> com.facebook.ads.redexgen.core.AbstractC2198qK<T> A04(java.util.Comparator<T> comparator) {
        if (comparator instanceof com.facebook.ads.redexgen.core.AbstractC2198qK) {
            return (com.facebook.ads.redexgen.core.AbstractC2198qK) comparator;
        }
        return new com.facebook.ads.redexgen.core.C0595Bh(comparator);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.kO != com.google.common.base.Function<F, ? extends T> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.qK != com.google.common.collect.Ordering<T> */
    public final <F> com.facebook.ads.redexgen.core.AbstractC2198qK<F> A05(com.facebook.ads.redexgen.core.InterfaceC1847kO<F, ? extends T> function) {
        return new com.facebook.ads.redexgen.core.C0603Bp(function, this);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.qK != com.google.common.collect.Ordering<T> */
    public <S extends T> com.facebook.ads.redexgen.core.AbstractC2198qK<S> A06() {
        return new com.facebook.ads.redexgen.core.B2(this);
    }
}
