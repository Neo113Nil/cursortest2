package com.facebook.ads.redexgen.core;

@com.google.common.collect.ElementTypesAreNonnullByDefault
/* renamed from: com.facebook.ads.redexgen.X.2E, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2E<E> extends com.facebook.ads.redexgen.core.BP<E> {
    public static final com.facebook.ads.redexgen.core.BP<java.lang.Object> A02 = new com.facebook.ads.redexgen.core.C2E(new java.lang.Object[0], 0);
    public final transient java.lang.Object[] A00;
    public final transient int A01;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2E != com.google.common.collect.RegularImmutableList<E> */
    public C2E(java.lang.Object[] array, int size) {
        this.A00 = array;
        this.A01 = size;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2E != com.google.common.collect.RegularImmutableList<E> */
    @Override // com.facebook.ads.redexgen.core.AbstractC2079oO
    public final int A0G() {
        return this.A01;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2E != com.google.common.collect.RegularImmutableList<E> */
    @Override // com.facebook.ads.redexgen.core.AbstractC2079oO
    public final int A0H() {
        return 0;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2E != com.google.common.collect.RegularImmutableList<E> */
    @Override // com.facebook.ads.redexgen.core.BP, com.facebook.ads.redexgen.core.AbstractC2079oO
    public final int A0I(java.lang.Object[] dst, int dstOff) {
        java.lang.System.arraycopy(this.A00, 0, dst, dstOff, this.A01);
        return this.A01 + dstOff;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2E != com.google.common.collect.RegularImmutableList<E> */
    @Override // com.facebook.ads.redexgen.core.AbstractC2079oO
    public final boolean A0K() {
        return false;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2E != com.google.common.collect.RegularImmutableList<E> */
    @Override // com.facebook.ads.redexgen.core.AbstractC2079oO
    public final java.lang.Object[] A0L() {
        return this.A00;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2E != com.google.common.collect.RegularImmutableList<E> */
    @Override // java.util.List
    public final E get(int i) {
        com.facebook.ads.redexgen.core.AbstractC1866ki.A00(i, this.A01);
        return (E) java.util.Objects.requireNonNull(this.A00[i]);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2E != com.google.common.collect.RegularImmutableList<E> */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.A01;
    }
}
