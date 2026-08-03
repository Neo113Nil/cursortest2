package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.i2, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1716i2 implements com.facebook.ads.redexgen.core.PR {
    public static java.lang.String[] A02 = {"gru2Lda4S7GCbNBLtOIdQEnlbYeRFwfL", "XnGCgKT7Pg2", "mKUX8sgZfunspLF5wjmFH8sDBtb3K48d", "jKk7kH4cQGBiDg5TKe33YqGV3AsPygQR", "TZdQK9usf81OKXIWMb61JsmxOZFMnA3k", "eyC2dzaRwXiJKVGsgdgz1meLL5sRgImY", "S4mkNNYHIh7xNNZ0OEskqLhCY0hDyySt", "ZXfiglEYlIOoTIuj216uQxYNuz12aQjw"};
    public final android.graphics.Rect A00 = new android.graphics.Rect();
    public final /* synthetic */ com.facebook.ads.redexgen.core.Pv A01;

    public C1716i2(com.facebook.ads.redexgen.core.Pv pv) {
        this.A01 = pv;
    }

    @Override // com.facebook.ads.redexgen.core.PR
    public final com.facebook.ads.redexgen.core.C0967Py ACw(android.view.View view, com.facebook.ads.redexgen.core.C0967Py c0967Py) {
        com.facebook.ads.redexgen.core.C0967Py A06 = com.facebook.ads.redexgen.core.Ph.A06(view, c0967Py);
        if (A06.A07()) {
            return A06;
        }
        android.graphics.Rect rect = this.A00;
        rect.left = A06.A03();
        rect.top = A06.A05();
        rect.right = A06.A04();
        rect.bottom = A06.A02();
        int count = this.A01.getChildCount();
        for (int i = 0; i < count; i++) {
            com.facebook.ads.redexgen.core.C0967Py A05 = com.facebook.ads.redexgen.core.Ph.A05(this.A01.getChildAt(i), A06);
            rect.left = java.lang.Math.min(A05.A03(), rect.left);
            rect.top = java.lang.Math.min(A05.A05(), rect.top);
            rect.right = java.lang.Math.min(A05.A04(), rect.right);
            rect.bottom = java.lang.Math.min(A05.A02(), rect.bottom);
        }
        int i2 = rect.left;
        int i3 = rect.top;
        int i4 = rect.right;
        int i5 = rect.bottom;
        if (A02[1].length() != 11) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr = A02;
        strArr[6] = "4mRHs0uPE72ppwyI9I2NgTpzqE63n9j5";
        strArr[2] = "Zp0DshFYJF7gm0rY227qRNMYobzVhEjB";
        com.facebook.ads.redexgen.core.C0967Py applied = A06.A06(i2, i3, i4, i5);
        return applied;
    }
}
