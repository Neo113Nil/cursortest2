package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.hm, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1701hm implements com.facebook.ads.redexgen.core.QP {
    public static byte[] A01;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C7M A00;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 72);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-26, 4, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.SI, 8, 7, -61, 4, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.ETB, 4, 6, com.google.common.base.Ascii.VT, -61, com.google.common.base.Ascii.DC2, 17, -61, 4, -61, 6, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.SI, 7, -61, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.FF, 6, com.google.common.base.Ascii.VT, -61, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.SYN, -61, 17, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.ETB, -61, 7, 8, com.google.common.base.Ascii.ETB, 4, 6, com.google.common.base.Ascii.VT, 8, 7, -35, -61, -53, -55, -44, -44, -51, -52, -120, -52, -51, -36, -55, -53, -48, -120, -41, -42, -120, -55, -42, -120, -55, -44, -38, -51, -55, -52, -31, -120, -52, -51, -36, -55, -53, -48, -51, -52, -120, -53, -48, -47, -44, -52, -120};
    }

    public C1701hm(com.facebook.ads.redexgen.core.C7M c7m) {
        this.A00 = c7m;
    }

    @Override // com.facebook.ads.redexgen.core.QP
    public final void A4K(android.view.View view, int i, android.view.ViewGroup.LayoutParams layoutParams) {
        com.facebook.ads.redexgen.core.RK A0F = com.facebook.ads.redexgen.core.C7M.A0F(view);
        if (A0F != null) {
            if (A0F.A0i() || A0F.A0l()) {
                A0F.A0V();
            } else {
                throw new java.lang.IllegalArgumentException(A00(0, 48, 91) + A0F + this.A00.A1J());
            }
        }
        this.A00.attachViewToParent(view, i, layoutParams);
    }

    @Override // com.facebook.ads.redexgen.core.QP
    public final void A5w(int i) {
        com.facebook.ads.redexgen.core.RK A0F;
        android.view.View view = A7H(i);
        if (view != null && (A0F = com.facebook.ads.redexgen.core.C7M.A0F(view)) != null) {
            if (!A0F.A0i() || A0F.A0l()) {
                A0F.A0Z(256);
            } else {
                throw new java.lang.IllegalArgumentException(A00(48, 43, 32) + A0F + this.A00.A1J());
            }
        }
        this.A00.detachViewFromParent(i);
    }

    @Override // com.facebook.ads.redexgen.core.QP
    public final android.view.View A7H(int i) {
        return this.A00.getChildAt(i);
    }

    @Override // com.facebook.ads.redexgen.core.QP
    public final int A7I() {
        return this.A00.getChildCount();
    }

    @Override // com.facebook.ads.redexgen.core.QP
    public final com.facebook.ads.redexgen.core.RK A7L(android.view.View view) {
        return com.facebook.ads.redexgen.core.C7M.A0F(view);
    }

    @Override // com.facebook.ads.redexgen.core.QP
    public final int AA7(android.view.View view) {
        return this.A00.indexOfChild(view);
    }

    @Override // com.facebook.ads.redexgen.core.QP
    public final void ADo(android.view.View view) {
        com.facebook.ads.redexgen.core.RK A0F = com.facebook.ads.redexgen.core.C7M.A0F(view);
        if (A0F != null) {
            A0F.A0D(this.A00);
        }
    }

    @Override // com.facebook.ads.redexgen.core.QP
    public final void AEa(android.view.View view) {
        com.facebook.ads.redexgen.core.RK A0F = com.facebook.ads.redexgen.core.C7M.A0F(view);
        if (A0F != null) {
            A0F.A0E(this.A00);
        }
    }

    @Override // com.facebook.ads.redexgen.core.QP
    public final void AIQ() {
        int A7I = A7I();
        for (int i = 0; i < A7I; i++) {
            android.view.View A7H = A7H(i);
            this.A00.A1g(A7H);
            A7H.clearAnimation();
        }
        this.A00.removeAllViews();
    }

    @Override // com.facebook.ads.redexgen.core.QP
    public final void AIW(int i) {
        android.view.View childAt = this.A00.getChildAt(i);
        if (childAt != null) {
            this.A00.A1g(childAt);
            childAt.clearAnimation();
        }
        this.A00.removeViewAt(i);
    }

    @Override // com.facebook.ads.redexgen.core.QP
    public final void addView(android.view.View view, int i) {
        this.A00.addView(view, i);
        this.A00.A1f(view);
    }
}
