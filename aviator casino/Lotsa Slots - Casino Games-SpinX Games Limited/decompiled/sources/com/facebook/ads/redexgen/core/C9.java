package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public class C9<T> implements com.facebook.ads.redexgen.core.InterfaceC1867kj<T>, java.io.Serializable {
    public static byte[] A01;
    public static final long serialVersionUID = 0;
    public final java.util.List<? extends com.facebook.ads.redexgen.core.InterfaceC1867kj<? super T>> A00;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 99);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{52, 65, 55};
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.C9 != com.google.common.base.Predicates$AndPredicate<T> */
    public C9(java.util.List<? extends com.facebook.ads.redexgen.core.InterfaceC1867kj<? super T>> components) {
        this.A00 = components;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.C9 != com.google.common.base.Predicates$AndPredicate<T> */
    /* JADX WARN: Incorrect condition in loop: B:3:0x0007 */
    @Override // com.facebook.ads.redexgen.core.InterfaceC1867kj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean A4C(@com.google.common.base.ParametricNullness T t) {
        for (int i = 0; i < i; i++) {
            if (!this.A00.get(i).A4C(t)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.C9 != com.google.common.base.Predicates$AndPredicate<?> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.C9 != com.google.common.base.Predicates$AndPredicate<T> */
    public final boolean equals(@javax.annotation.CheckForNull java.lang.Object obj) {
        if (obj instanceof com.facebook.ads.redexgen.core.C9) {
            return this.A00.equals(((com.facebook.ads.redexgen.core.C9) obj).A00);
        }
        return false;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.C9 != com.google.common.base.Predicates$AndPredicate<T> */
    public final int hashCode() {
        return this.A00.hashCode() + 306654252;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.C9 != com.google.common.base.Predicates$AndPredicate<T> */
    public final java.lang.String toString() {
        java.lang.String A02;
        A02 = com.facebook.ads.redexgen.core.AbstractC1869kl.A02(A00(0, 3, 112), this.A00);
        return A02;
    }
}
