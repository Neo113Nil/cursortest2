package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class FY extends com.facebook.ads.redexgen.core.RK implements com.facebook.ads.redexgen.core.InterfaceC1184Yo {
    public com.facebook.ads.redexgen.core.C0900Ng A00;
    public com.facebook.ads.redexgen.core.AbstractC1580fo A01;
    public com.facebook.ads.redexgen.core.C1581fp A02;
    public com.facebook.ads.redexgen.core.C1581fp A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final android.util.SparseBooleanArray A08;
    public final com.facebook.ads.redexgen.core.C1636gi A09;
    public final com.facebook.ads.redexgen.core.AnonymousClass67 A0A;

    public FY(com.facebook.ads.redexgen.core.AnonymousClass67 anonymousClass67, android.util.SparseBooleanArray sparseBooleanArray, com.facebook.ads.redexgen.core.C1581fp c1581fp, int i, int i2, int i3, int i4, com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.C0900Ng c0900Ng) {
        super(anonymousClass67);
        this.A09 = c1636gi;
        this.A0A = anonymousClass67;
        this.A08 = sparseBooleanArray;
        this.A02 = c1581fp;
        this.A04 = i;
        this.A05 = i2;
        this.A06 = i3;
        this.A07 = i4;
        this.A00 = c0900Ng;
    }

    private void A05(com.facebook.ads.redexgen.core.VA va, com.facebook.ads.redexgen.core.Y2 y2, java.lang.String str, com.facebook.ads.redexgen.core.C1474e5 c1474e5) {
        if (this.A08.get(c1474e5.A02())) {
            return;
        }
        if (this.A03 != null) {
            this.A03.A0V();
            this.A03 = null;
        }
        this.A01 = new com.facebook.ads.redexgen.core.C0691Fc(this, str, c1474e5, va, c1474e5.A04(), y2);
        this.A03 = new com.facebook.ads.redexgen.core.C1581fp(this.A0A, 10, new java.lang.ref.WeakReference(this.A01), this.A09);
        this.A03.A0Y(false);
        this.A03.A0W(100);
        this.A03.A0X(100);
        this.A0A.setOnAssetsLoadedListener(new com.facebook.ads.redexgen.core.FZ(this, c1474e5));
    }

    public final com.facebook.ads.redexgen.core.ViewOnClickListenerC0834Kr A0p() {
        return this.A0A.getCtaButton();
    }

    public final void A0q(com.facebook.ads.redexgen.core.C1474e5 c1474e5, com.facebook.ads.redexgen.core.VA va, com.facebook.ads.redexgen.core.C1042Sx c1042Sx, com.facebook.ads.redexgen.core.Y2 y2, java.lang.String str) {
        int A02 = c1474e5.A02();
        this.A0A.setTag(-1593835536, java.lang.Integer.valueOf(A02));
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = new android.view.ViewGroup.MarginLayoutParams(this.A04, -2);
        int rightMargin = A02 == 0 ? this.A05 : this.A06;
        int position = this.A07;
        marginLayoutParams.setMargins(rightMargin, 0, A02 >= position + (-1) ? this.A05 : this.A06, 0);
        java.lang.String imageUrl = c1474e5.A03().A0H().A08();
        java.lang.String A09 = c1474e5.A03().A0H().A09();
        this.A0A.setIsVideo(!android.text.TextUtils.isEmpty(A09));
        if (this.A0A.A1V()) {
            this.A0A.setVideoPlaceholderUrl(imageUrl);
            this.A0A.setVideoUrl(c1042Sx.A0T(A09));
        } else {
            this.A0A.setImageUrl(imageUrl);
        }
        this.A0A.setLayoutParams(marginLayoutParams);
        this.A0A.setAdTitleAndDescription(c1474e5.A03().A0I().A0G(), c1474e5.A03().A0I().A04());
        this.A0A.setCTAInfo(c1474e5.A03().A0J(), c1474e5.A04());
        this.A0A.A1Y(c1474e5.A04());
        A05(va, y2, str, c1474e5);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1184Yo
    public final void AJF() {
        this.A0A.A1Q();
    }
}
