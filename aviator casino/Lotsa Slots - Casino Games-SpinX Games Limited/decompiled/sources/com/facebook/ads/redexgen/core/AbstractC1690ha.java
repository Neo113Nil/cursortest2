package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.ha, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1690ha extends com.facebook.ads.redexgen.core.AbstractC0992Qy {
    public static java.lang.String[] A01 = {"ofgeN", "GcYePxlnDkyLzFZQt8gXTfFAd", "bIohWxIGlUqKJ41hMBKnFxYrg", "ROugplE3NXuve66PKoPS6E1ZAyp", "eD20R2wAf", "s8oLKbIochRuLWrY7HR296xJjla", "faP6eJ6K6STeOEuOEXCJ6OuUaXzDbpLW", "oXM2gF3tn"};
    public boolean A00 = true;

    public abstract boolean A0X(com.facebook.ads.redexgen.core.RK rk);

    public abstract boolean A0Y(com.facebook.ads.redexgen.core.RK rk);

    public abstract boolean A0Z(com.facebook.ads.redexgen.core.RK rk, int i, int i2, int i3, int i4);

    public abstract boolean A0a(com.facebook.ads.redexgen.core.RK rk, com.facebook.ads.redexgen.core.RK rk2, int i, int i2, int i3, int i4);

    @Override // com.facebook.ads.redexgen.core.AbstractC0992Qy
    public final boolean A0N(com.facebook.ads.redexgen.core.RK rk) {
        return !this.A00 || rk.A0f();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0992Qy
    public final boolean A0O(com.facebook.ads.redexgen.core.RK rk, com.facebook.ads.redexgen.core.C0991Qx c0991Qx, com.facebook.ads.redexgen.core.C0991Qx c0991Qx2) {
        if (c0991Qx != null && (c0991Qx.A01 != c0991Qx2.A01 || c0991Qx.A03 != c0991Qx2.A03)) {
            return A0Z(rk, c0991Qx.A01, c0991Qx.A03, c0991Qx2.A01, c0991Qx2.A03);
        }
        return A0X(rk);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0992Qy
    public final boolean A0P(com.facebook.ads.redexgen.core.RK rk, com.facebook.ads.redexgen.core.C0991Qx c0991Qx, com.facebook.ads.redexgen.core.C0991Qx c0991Qx2) {
        int i = c0991Qx.A01;
        int oldLeft = c0991Qx.A03;
        android.view.View view = rk.A0H;
        int oldTop = c0991Qx2 == null ? view.getLeft() : c0991Qx2.A01;
        java.lang.String[] strArr = A01;
        if (strArr[7].length() != strArr[4].length()) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A01;
        strArr2[7] = "jyZdeafgD";
        strArr2[4] = "NUmje91r8";
        int top = c0991Qx2 == null ? view.getTop() : c0991Qx2.A03;
        if (!rk.A0g() && (i != oldTop || oldLeft != top)) {
            view.layout(oldTop, top, view.getWidth() + oldTop, view.getHeight() + top);
            return A0Z(rk, i, oldLeft, oldTop, top);
        }
        return A0Y(rk);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0992Qy
    public final boolean A0Q(com.facebook.ads.redexgen.core.RK rk, com.facebook.ads.redexgen.core.C0991Qx c0991Qx, com.facebook.ads.redexgen.core.C0991Qx c0991Qx2) {
        if (c0991Qx.A01 != c0991Qx2.A01 || c0991Qx.A03 != c0991Qx2.A03) {
            return A0Z(rk, c0991Qx.A01, c0991Qx.A03, c0991Qx2.A01, c0991Qx2.A03);
        }
        A0U(rk);
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0992Qy
    public final boolean A0R(com.facebook.ads.redexgen.core.RK rk, com.facebook.ads.redexgen.core.RK rk2, com.facebook.ads.redexgen.core.C0991Qx c0991Qx, com.facebook.ads.redexgen.core.C0991Qx c0991Qx2) {
        int i;
        int i2;
        int i3 = c0991Qx.A01;
        int i4 = c0991Qx.A03;
        if (rk2.A0l()) {
            i = c0991Qx.A01;
            i2 = c0991Qx.A03;
        } else {
            i = c0991Qx2.A01;
            i2 = c0991Qx2.A03;
        }
        return A0a(rk, rk2, i3, i4, i, i2);
    }

    public final void A0T(com.facebook.ads.redexgen.core.RK rk) {
        A0K(rk);
    }

    public final void A0U(com.facebook.ads.redexgen.core.RK rk) {
        A0K(rk);
    }

    public final void A0V(com.facebook.ads.redexgen.core.RK rk) {
        A0K(rk);
    }

    public final void A0W(com.facebook.ads.redexgen.core.RK rk, boolean z) {
        A0K(rk);
    }
}
