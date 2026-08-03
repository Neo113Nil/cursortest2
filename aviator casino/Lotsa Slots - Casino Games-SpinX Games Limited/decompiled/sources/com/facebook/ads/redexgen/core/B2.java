package com.facebook.ads.redexgen.core;

@com.google.common.collect.ElementTypesAreNonnullByDefault
/* loaded from: assets/audience_network/classes2.dex */
public final class B2<T> extends com.facebook.ads.redexgen.core.AbstractC2198qK<T> implements java.io.Serializable {
    public static byte[] A01;
    public static java.lang.String[] A02 = {"TYphIuCeMUBPtejfiFOUwjFxcT4QBTq", "8HYxpO9zw1uGMW", "bftleM0W", "QbbbyMJUXm1d4Xd", "2naIPdaT", "exbXjeCkSw", "w", "Nm7"};
    public static final long serialVersionUID = 0;
    public final com.facebook.ads.redexgen.core.AbstractC2198qK<? super T> A00;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 55);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-30, 38, com.google.common.base.Ascii.EM, 42, com.google.common.base.Ascii.EM, 38, 39, com.google.common.base.Ascii.EM, -36, -35};
    }

    static {
        A01();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.B2 != com.google.common.collect.ReverseOrdering<T> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.qK != com.google.common.collect.Ordering<? super T> */
    public B2(com.facebook.ads.redexgen.core.AbstractC2198qK<? super T> forwardOrder) {
        this.A00 = (com.facebook.ads.redexgen.core.AbstractC2198qK) com.facebook.ads.redexgen.core.AbstractC1866ki.A04(forwardOrder);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.B2 != com.google.common.collect.ReverseOrdering<T> */
    @Override // com.facebook.ads.redexgen.core.AbstractC2198qK
    public final <S extends T> com.facebook.ads.redexgen.core.AbstractC2198qK<S> A06() {
        return this.A00;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.B2 != com.google.common.collect.ReverseOrdering<T> */
    @Override // com.facebook.ads.redexgen.core.AbstractC2198qK, java.util.Comparator
    public final int compare(@com.google.common.collect.ParametricNullness T a2, @com.google.common.collect.ParametricNullness T b) {
        return this.A00.compare(b, a2);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.B2 != com.google.common.collect.ReverseOrdering<?> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.B2 != com.google.common.collect.ReverseOrdering<T> */
    @Override // java.util.Comparator
    public final boolean equals(@javax.annotation.CheckForNull java.lang.Object object) {
        if (object != this) {
            if (object instanceof com.facebook.ads.redexgen.core.B2) {
                return this.A00.equals(((com.facebook.ads.redexgen.core.B2) object).A00);
            }
            return false;
        }
        java.lang.String[] strArr = A02;
        if (strArr[2].length() != strArr[4].length()) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A02;
        strArr2[2] = "3jzErf5H";
        strArr2[4] = "YYoE6Ooa";
        return true;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.B2 != com.google.common.collect.ReverseOrdering<T> */
    public final int hashCode() {
        return -this.A00.hashCode();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.B2 != com.google.common.collect.ReverseOrdering<T> */
    public final java.lang.String toString() {
        return this.A00 + A00(0, 10, 125);
    }
}
