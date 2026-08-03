package com.facebook.ads.redexgen.core;

@com.google.common.collect.ElementTypesAreNonnullByDefault
/* renamed from: com.facebook.ads.redexgen.X.29, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class AnonymousClass29<E> extends com.facebook.ads.redexgen.core.BO<E> {
    public final transient java.lang.Object[] A00;
    public final transient java.lang.Object[] A01;
    public final transient int A02;
    public final transient int A03;
    public final transient int A04;
    public static final java.lang.Object[] A06 = new java.lang.Object[0];
    public static final com.facebook.ads.redexgen.core.AnonymousClass29<java.lang.Object> A05 = new com.facebook.ads.redexgen.core.AnonymousClass29<>(A06, 0, A06, 0, 0);

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.29 != com.google.common.collect.RegularImmutableSet<E> */
    public AnonymousClass29(java.lang.Object[] elements, int hashCode, java.lang.Object[] table, int mask, int size) {
        this.A00 = elements;
        this.A02 = hashCode;
        this.A01 = table;
        this.A03 = mask;
        this.A04 = size;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.29 != com.google.common.collect.RegularImmutableSet<E> */
    @Override // com.facebook.ads.redexgen.core.AbstractC2079oO
    public final int A0G() {
        return this.A04;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.29 != com.google.common.collect.RegularImmutableSet<E> */
    @Override // com.facebook.ads.redexgen.core.AbstractC2079oO
    public final int A0H() {
        return 0;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.29 != com.google.common.collect.RegularImmutableSet<E> */
    @Override // com.facebook.ads.redexgen.core.AbstractC2079oO
    public final int A0I(java.lang.Object[] dst, int offset) {
        java.lang.System.arraycopy(this.A00, 0, dst, offset, this.A04);
        return this.A04 + offset;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.29 != com.google.common.collect.RegularImmutableSet<E> */
    @Override // com.facebook.ads.redexgen.core.AbstractC2079oO
    public final boolean A0K() {
        return false;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.29 != com.google.common.collect.RegularImmutableSet<E> */
    @Override // com.facebook.ads.redexgen.core.AbstractC2079oO
    public final java.lang.Object[] A0L() {
        return this.A00;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.29 != com.google.common.collect.RegularImmutableSet<E> */
    @Override // com.facebook.ads.redexgen.core.BO
    public final com.facebook.ads.redexgen.core.BP<E> A0M() {
        return com.facebook.ads.redexgen.core.BP.A09(this.A00, this.A04);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.29 != com.google.common.collect.RegularImmutableSet<E> */
    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: A0N */
    public final com.facebook.ads.redexgen.core.C4C<E> iterator() {
        return A0J().iterator();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.29 != com.google.common.collect.RegularImmutableSet<E> */
    @Override // com.facebook.ads.redexgen.core.BO
    public final boolean A0O() {
        return true;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.29 != com.google.common.collect.RegularImmutableSet<E> */
    @Override // com.facebook.ads.redexgen.core.AbstractC2079oO, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@javax.annotation.CheckForNull java.lang.Object target) {
        java.lang.Object[] objArr = this.A01;
        if (target == null || objArr.length == 0) {
            return false;
        }
        int A02 = com.facebook.ads.redexgen.core.AbstractC2073oI.A02(target);
        while (true) {
            int i = A02 & this.A03;
            java.lang.Object obj = objArr[i];
            if (obj == null) {
                return false;
            }
            if (obj.equals(target)) {
                return true;
            }
            A02 = i + 1;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.29 != com.google.common.collect.RegularImmutableSet<E> */
    @Override // com.facebook.ads.redexgen.core.BO, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.A02;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.29 != com.google.common.collect.RegularImmutableSet<E> */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.A04;
    }
}
