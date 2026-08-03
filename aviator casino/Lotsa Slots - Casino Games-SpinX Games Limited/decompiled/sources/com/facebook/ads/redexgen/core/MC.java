package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class MC extends com.facebook.ads.redexgen.core.AbstractC1199Zd {
    public static byte[] A05;
    public static final int A06;
    public static final int A07;
    public static final int A08;
    public final android.widget.ImageView A00;
    public final android.widget.LinearLayout A01;
    public final android.widget.ScrollView A02;
    public final com.facebook.ads.redexgen.core.C0926Og A03;
    public final com.facebook.ads.redexgen.core.C1636gi A04;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 24);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{-52, -21, -19, -11, 120, -95, -92, -88, -102, 85, 118, -103, 85, -121, -102, -91, -92, -89, -87, -98, -93, -100};
    }

    static {
        A01();
        A08 = (int) (com.facebook.ads.redexgen.core.XX.A02 * 8.0f);
        A07 = (int) (com.facebook.ads.redexgen.core.XX.A02 * 10.0f);
        A06 = (int) (com.facebook.ads.redexgen.core.XX.A02 * 44.0f);
    }

    public MC(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.VA va, java.lang.String str) {
        super(c1636gi, va, str);
        this.A04 = c1636gi;
        this.A03 = com.facebook.ads.redexgen.core.AbstractC0927Oh.A00(this.A04.A02());
        this.A00 = new android.widget.ImageView(getContext());
        this.A00.setPadding(A07, A07, A07, A07);
        this.A00.setColorFilter(-10459280);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(A06, A06);
        layoutParams.gravity = 3;
        this.A00.setLayoutParams(layoutParams);
        this.A02 = new android.widget.ScrollView(getContext());
        this.A02.setFillViewport(true);
        com.facebook.ads.redexgen.core.YB.A0N(this.A02, -218103809);
        this.A01 = new android.widget.LinearLayout(getContext());
        this.A01.setOrientation(1);
        this.A01.setPadding(A08, A08, A08, A08);
        this.A02.addView(this.A01, new android.widget.FrameLayout.LayoutParams(-1, -2));
        addView(this.A02, new android.widget.FrameLayout.LayoutParams(-1, -1));
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1199Zd
    public final void A0O() {
        this.A00.setImageBitmap(com.facebook.ads.redexgen.core.YN.A01(com.facebook.ads.redexgen.core.YM.CROSS));
        this.A00.setOnClickListener(new com.facebook.ads.redexgen.core.ViewOnClickListenerC1218Zw(this));
        this.A00.setContentDescription(A00(4, 18, 29));
        com.facebook.ads.redexgen.core.C1203Zh c1203Zh = new com.facebook.ads.redexgen.core.C1203Zh(this.A04);
        c1203Zh.setData(this.A03.A0H(), com.facebook.ads.redexgen.core.YM.HIDE_AD);
        c1203Zh.setOnClickListener(new com.facebook.ads.redexgen.core.ViewOnClickListenerC1219Zx(this, c1203Zh));
        com.facebook.ads.redexgen.core.C1203Zh c1203Zh2 = new com.facebook.ads.redexgen.core.C1203Zh(this.A04);
        c1203Zh2.setData(this.A03.A0L(), com.facebook.ads.redexgen.core.YM.REPORT_AD);
        c1203Zh2.setOnClickListener(new com.facebook.ads.redexgen.core.ViewOnClickListenerC1220Zy(this, c1203Zh2));
        com.facebook.ads.redexgen.core.C1203Zh c1203Zh3 = new com.facebook.ads.redexgen.core.C1203Zh(this.A04);
        c1203Zh3.setData(this.A03.A0M(), com.facebook.ads.redexgen.core.YM.AD_CHOICES_ICON);
        c1203Zh3.setOnClickListener(new com.facebook.ads.redexgen.core.ViewOnClickListenerC1221Zz(this, c1203Zh3));
        android.widget.LinearLayout.LayoutParams menuParams = new android.widget.LinearLayout.LayoutParams(-2, -2);
        menuParams.setMargins(A08, A08, A08, A08);
        menuParams.gravity = 17;
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(getContext());
        linearLayout.setOrientation(1);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-2, 0);
        layoutParams.gravity = 17;
        layoutParams.weight = 1.0f;
        com.facebook.ads.redexgen.core.YB.A0W(this.A01);
        this.A01.removeAllViews();
        this.A01.addView(this.A00);
        this.A01.addView(linearLayout, layoutParams);
        linearLayout.addView(c1203Zh, menuParams);
        linearLayout.addView(c1203Zh2, menuParams);
        linearLayout.addView(c1203Zh3, menuParams);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1199Zd
    public final void A0P() {
        com.facebook.ads.redexgen.core.YB.A0I(this);
        com.facebook.ads.redexgen.core.YB.A0J(this);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1199Zd
    public final void A0Q(com.facebook.ads.redexgen.core.C0930Ok c0930Ok, com.facebook.ads.redexgen.core.EnumC0928Oi enumC0928Oi) {
        java.lang.String A0H;
        com.facebook.ads.redexgen.core.YM ym;
        int i;
        this.A00.setOnClickListener(null);
        if (enumC0928Oi == com.facebook.ads.redexgen.core.EnumC0928Oi.A06) {
            A0H = this.A03.A0F();
            ym = com.facebook.ads.redexgen.core.YM.REPORT_AD;
            i = -552389;
        } else {
            A0H = this.A03.A0H();
            ym = com.facebook.ads.redexgen.core.YM.HIDE_AD;
            i = -13272859;
        }
        com.facebook.ads.redexgen.core.C1196Za A0H2 = new com.facebook.ads.redexgen.core.C1196Za(this.A04, this.A0D).A0H(A0H);
        java.lang.String title = this.A03.A0D();
        com.facebook.ads.redexgen.core.C1196Za A0G = A0H2.A0G(title);
        java.lang.String title2 = c0930Ok.A04();
        com.facebook.ads.redexgen.core.C1197Zb adHiddenView = A0G.A0E(title2).A0J(false).A0D(ym).A0C(i).A0K(false).A0I(false).A0L();
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-1, 0);
        layoutParams.gravity = 17;
        layoutParams.weight = 1.0f;
        com.facebook.ads.redexgen.core.YB.A0W(this.A01);
        this.A02.fullScroll(33);
        this.A01.removeAllViews();
        this.A01.addView(adHiddenView, layoutParams);
        super.A0Q(c0930Ok, enumC0928Oi);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1199Zd
    public final void A0R(com.facebook.ads.redexgen.core.C0930Ok c0930Ok, com.facebook.ads.redexgen.core.EnumC0928Oi enumC0928Oi) {
        boolean isReportFlow = enumC0928Oi == com.facebook.ads.redexgen.core.EnumC0928Oi.A06;
        com.facebook.ads.redexgen.core.C1217Zv c1217Zv = new com.facebook.ads.redexgen.core.C1217Zv(this.A04, c0930Ok, this.A0D, isReportFlow ? com.facebook.ads.redexgen.core.YM.REPORT_AD : com.facebook.ads.redexgen.core.YM.HIDE_AD);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-2, 0);
        layoutParams.gravity = 17;
        layoutParams.weight = 1.0f;
        this.A00.setImageBitmap(com.facebook.ads.redexgen.core.YN.A01(com.facebook.ads.redexgen.core.YM.BACK_ARROW));
        this.A00.setOnClickListener(new com.facebook.ads.redexgen.core.ViewOnClickListenerC1222a0(this));
        this.A00.setContentDescription(A00(0, 4, 114));
        com.facebook.ads.redexgen.core.YB.A0W(this.A01);
        this.A02.fullScroll(33);
        this.A01.removeAllViews();
        this.A01.addView(this.A00);
        this.A01.addView(c1217Zv, layoutParams);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1199Zd
    public final boolean A0S() {
        return true;
    }
}
