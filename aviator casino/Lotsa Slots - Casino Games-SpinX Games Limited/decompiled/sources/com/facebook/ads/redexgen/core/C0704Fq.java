package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Fq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0704Fq extends com.facebook.ads.redexgen.core.RK implements com.facebook.ads.redexgen.core.InterfaceC1184Yo {
    public static java.lang.String[] A08 = {"biNTtjxa0xULALtZEUOcP", "rMVpYr4hwZgX", "y0rebd1hOaNR", "snwXdVXwO66aPvNuuMD2", "jxkMgVVp1g5", "Dcah1JX", "lglxOXHbCZFpcLf1TWQPAMUDis4zLCZx", "n80A5ryznQOlcAJIvKv7FeLq2ck19EHB"};
    public com.facebook.ads.redexgen.core.C0900Ng A00;
    public com.facebook.ads.redexgen.core.AbstractC1580fo A01;
    public com.facebook.ads.redexgen.core.C1581fp A02;
    public com.facebook.ads.redexgen.core.C1581fp A03;
    public final int A04;
    public final android.util.SparseBooleanArray A05;
    public final com.facebook.ads.redexgen.core.C1636gi A06;
    public final com.facebook.ads.redexgen.core.C6M A07;

    public C0704Fq(com.facebook.ads.redexgen.core.C6M c6m, android.util.SparseBooleanArray sparseBooleanArray, com.facebook.ads.redexgen.core.C1581fp c1581fp, int i, com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.C0900Ng c0900Ng) {
        super(c6m);
        this.A06 = c1636gi;
        this.A07 = c6m;
        this.A05 = sparseBooleanArray;
        this.A02 = c1581fp;
        this.A04 = i;
        this.A00 = c0900Ng;
    }

    private void A05(com.facebook.ads.redexgen.core.VA va, com.facebook.ads.redexgen.core.Y2 y2, java.lang.String str, com.facebook.ads.redexgen.core.C1474e5 c1474e5) {
        if (this.A05.get(c1474e5.A02())) {
            return;
        }
        if (this.A03 != null) {
            this.A03.A0V();
            java.lang.String[] strArr = A08;
            if (strArr[1].length() != strArr[2].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A08;
            strArr2[3] = "sEemyGdXpNnP2WRBMWcD";
            strArr2[0] = "kawPFcVLuq3VyedHvbBIc";
            this.A03 = null;
        }
        this.A01 = new com.facebook.ads.redexgen.core.C0706Fs(this, str, c1474e5, va, c1474e5.A04(), y2);
        this.A03 = new com.facebook.ads.redexgen.core.C1581fp(this.A07, 10, new java.lang.ref.WeakReference(this.A01), this.A06);
        this.A03.A0Y(false);
        this.A03.A0W(100);
        this.A03.A0X(100);
        this.A07.setOnAssetsLoadedListener(new com.facebook.ads.redexgen.core.C0705Fr(this, c1474e5));
    }

    public final void A0p(com.facebook.ads.redexgen.core.C1474e5 c1474e5, com.facebook.ads.redexgen.core.VA va, com.facebook.ads.redexgen.core.C1042Sx c1042Sx, com.facebook.ads.redexgen.core.Y2 y2, java.lang.String str, int i, int i2, int i3) {
        int A02 = c1474e5.A02();
        this.A07.setTag(-1593835536, java.lang.Integer.valueOf(A02));
        this.A07.setupNativeCtaExtension(c1474e5);
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = new android.view.ViewGroup.MarginLayoutParams(i, -2);
        int rightMargin = A02 == 0 ? i3 : i2;
        if (A02 < this.A04 - 1) {
            i3 = i2;
        }
        java.lang.String[] strArr = A08;
        if (strArr[1].length() != strArr[2].length()) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A08;
        strArr2[1] = "ng4t5bAKqCWK";
        strArr2[2] = "n9xBZs9SEWUc";
        marginLayoutParams.setMargins(rightMargin, 0, i3, 0);
        java.lang.String A082 = c1474e5.A03().A0H().A08();
        java.lang.String A09 = c1474e5.A03().A0H().A09();
        this.A07.setIsVideo(!android.text.TextUtils.isEmpty(A09));
        if (this.A07.A1V()) {
            this.A07.setVideoPlaceholderUrl(A082);
            this.A07.setVideoUrl(c1042Sx.A0T(A09));
        } else {
            this.A07.setImageUrl(A082);
        }
        this.A07.setLayoutParams(marginLayoutParams);
        this.A07.setCTAInfo(c1474e5.A03().A0J(), c1474e5.A04());
        this.A07.A1W(c1474e5.A04());
        A05(va, y2, str, c1474e5);
    }

    public final void A0q(com.facebook.ads.redexgen.core.C1581fp c1581fp) {
        this.A02 = c1581fp;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1184Yo
    public final void AJF() {
        this.A07.A1Q();
    }
}
