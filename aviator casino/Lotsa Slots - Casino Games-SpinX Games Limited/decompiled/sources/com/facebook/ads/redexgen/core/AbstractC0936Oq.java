package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Oq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC0936Oq extends android.widget.RelativeLayout implements com.facebook.ads.redexgen.core.InterfaceC1242aK {
    public android.os.Handler A00;
    public com.facebook.ads.redexgen.core.C1245aN A01;
    public boolean A02;
    public com.facebook.ads.redexgen.core.C1192Yw A03;
    public com.facebook.ads.redexgen.core.C1227a5 A04;
    public com.facebook.ads.redexgen.core.C1241aJ A05;
    public final android.view.View.OnClickListener A06;
    public final com.facebook.ads.redexgen.core.AbstractC1801jd A07;
    public final com.facebook.ads.redexgen.core.C1636gi A08;
    public final com.facebook.ads.redexgen.core.VI A09;
    public static java.lang.String[] A0A = {"eRMzgHG", "A1D1mRRaU8os3umLxugsgnfT", "YU6ciw9hf2Bpu6e80GlNKt1", "R20K8nAvAy9bKMjQ", "gFet4GA2ogUQ417QxbSlVnm1t01blQtv", "7PQXGNMvVATtl2qomoZDAZcCFPoRgKLz", "RpQ71swlwo7OfFOP9TN2ZPjcOzOs9RuN", "6yF"};
    public static final int A0C = (int) (com.facebook.ads.redexgen.core.XX.A02 * 4.0f);
    public static final int A0D = (int) (com.facebook.ads.redexgen.core.XX.A02 * 40.0f);
    public static final int A0B = (int) (com.facebook.ads.redexgen.core.XX.A02 * 24.0f);

    public abstract int getMediaViewId();

    public AbstractC0936Oq(com.facebook.ads.redexgen.core.C1636gi c1636gi, android.view.View.OnClickListener onClickListener, com.facebook.ads.redexgen.core.VI vi, com.facebook.ads.redexgen.core.AbstractC1801jd abstractC1801jd) {
        super(c1636gi);
        this.A02 = true;
        this.A08 = c1636gi;
        this.A06 = onClickListener;
        this.A09 = vi;
        this.A07 = abstractC1801jd;
        A0B();
    }

    public static android.widget.RelativeLayout.LayoutParams A0A(android.view.View view) {
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        if (view != null) {
            layoutParams.addRule(1, view.getId());
            layoutParams.setMargins(com.facebook.ads.redexgen.core.XV.A0I, com.facebook.ads.redexgen.core.XV.A0U, com.facebook.ads.redexgen.core.XV.A00, com.facebook.ads.redexgen.core.XV.A00);
        } else {
            layoutParams.addRule(20);
            layoutParams.setMargins(com.facebook.ads.redexgen.core.XV.A0U, com.facebook.ads.redexgen.core.XV.A0U, com.facebook.ads.redexgen.core.XV.A00, com.facebook.ads.redexgen.core.XV.A00);
        }
        return layoutParams;
    }

    private void A0B() {
        if (this.A07 != null) {
            if (this.A07.A2Q()) {
                this.A00 = new android.os.Handler(android.os.Looper.getMainLooper());
                this.A05 = com.facebook.ads.redexgen.core.AbstractC1246aO.A00(this.A08, true, this.A07, this.A09, null, com.facebook.ads.redexgen.core.EnumC1244aM.A04, this, com.facebook.ads.redexgen.core.AbstractC1243aL.A00(this.A07));
            } else if (this.A07.A2W()) {
                this.A01 = com.facebook.ads.redexgen.core.AbstractC1246aO.A02(this.A08, com.facebook.ads.redexgen.core.EnumC1244aM.A04, this.A07);
                com.facebook.ads.redexgen.core.YB.A0K(this.A01);
            }
            if (this.A07.A2U()) {
                this.A04 = new com.facebook.ads.redexgen.core.C1227a5(this.A08, com.facebook.ads.redexgen.core.EnumC1244aM.A04);
                com.facebook.ads.redexgen.core.YB.A0K(this.A04);
                this.A04.setOnClickListener(this.A06);
            } else {
                this.A03 = new com.facebook.ads.redexgen.core.C1192Yw(this.A08);
                this.A03.setOnClickListener(this.A06);
            }
        }
    }

    public final android.widget.RelativeLayout.LayoutParams A0C(boolean z, boolean z2) {
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(A0D, A0B);
        layoutParams.setMargins(A0C, A0C, A0C, A0C);
        if (this.A02) {
            layoutParams.addRule(z ? 12 : 10);
            layoutParams.addRule(z2 ? 11 : 9);
        } else {
            int mediaViewId = getMediaViewId();
            layoutParams.addRule(z ? 8 : 6, mediaViewId);
            layoutParams.addRule(z2 ? 7 : 5, mediaViewId);
        }
        return layoutParams;
    }

    public void A0D() {
        if (this.A00 != null) {
            this.A00.removeCallbacksAndMessages(null);
        }
    }

    public void A0E() {
        if (this.A01 != null) {
            this.A01.A04();
        }
    }

    public void A0F() {
        if (this.A03 != null) {
            com.facebook.ads.redexgen.core.YB.A0J(this.A03);
            this.A03.setLayoutParams(A0C(false, true));
            addView(this.A03);
        }
        if (this.A05 != null) {
            com.facebook.ads.redexgen.core.YB.A0J(this.A05);
            this.A05.setLayoutParams(getCreditLineLayoutParams());
            addView(this.A05);
        }
        if (this.A01 != null) {
            com.facebook.ads.redexgen.core.YB.A0J(this.A01);
            com.facebook.ads.redexgen.core.C1245aN c1245aN = this.A01;
            java.lang.String[] strArr = A0A;
            if (strArr[4].charAt(11) == strArr[5].charAt(11)) {
                throw new java.lang.RuntimeException();
            }
            A0A[1] = "xKxjkz1d3wlL2PrvsvNwOjyj";
            c1245aN.setLayoutParams(getCreditLineLayoutParams());
            addView(this.A01);
        }
    }

    public boolean A0G() {
        return true;
    }

    public boolean A0H() {
        return true;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1242aK
    public final void ADW(android.view.View view) {
        this.A06.onClick(view);
    }

    public static android.widget.RelativeLayout.LayoutParams getCreditLineLayoutParams() {
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(com.facebook.ads.redexgen.core.XV.A00, com.facebook.ads.redexgen.core.XV.A0U, com.facebook.ads.redexgen.core.XV.A0U, com.facebook.ads.redexgen.core.XV.A00);
        layoutParams.addRule(10);
        layoutParams.addRule(11);
        return layoutParams;
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        boolean A0H = A0H();
        boolean newShouldLayoutButtonsRelativeToParent = this.A02;
        if (A0H != newShouldLayoutButtonsRelativeToParent) {
            this.A02 = A0H;
            A0F();
        }
    }
}
