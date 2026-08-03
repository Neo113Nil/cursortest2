package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class MD extends com.facebook.ads.redexgen.core.AbstractC1199Zd {
    public static byte[] A06;
    public static final int A07;
    public static final int A08;
    public static final int A09;
    public final android.widget.HorizontalScrollView A00;
    public final android.widget.ImageView A01;
    public final android.widget.LinearLayout A02;
    public final android.widget.LinearLayout A03;
    public final com.facebook.ads.redexgen.core.C0926Og A04;
    public final com.facebook.ads.redexgen.core.C1636gi A05;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 20);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A06 = new byte[]{3, 32, 34, 42, 3, 44, 47, 51, 37, 96, 1, 36, 96, com.google.common.base.Ascii.DC2, 37, 48, 47, 50, 52, 41, 46, 39};
    }

    static {
        A01();
        A09 = (int) (com.facebook.ads.redexgen.core.XX.A02 * 4.0f);
        A08 = (int) (com.facebook.ads.redexgen.core.XX.A02 * 10.0f);
        A07 = (int) (com.facebook.ads.redexgen.core.XX.A02 * 44.0f);
    }

    public MD(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.VA va, java.lang.String str) {
        super(c1636gi, va, str);
        this.A05 = c1636gi;
        this.A04 = com.facebook.ads.redexgen.core.AbstractC0927Oh.A00(c1636gi.A02());
        this.A01 = new android.widget.ImageView(getContext());
        this.A01.setPadding(A08, A08, A08, A08);
        this.A01.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
        this.A01.setColorFilter(-10459280);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(A07, A07);
        layoutParams.gravity = 16;
        this.A02 = new android.widget.LinearLayout(getContext());
        this.A02.setOrientation(0);
        android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(-1, -2);
        layoutParams2.gravity = 17;
        this.A00 = new android.widget.HorizontalScrollView(getContext());
        this.A00.setHorizontalScrollBarEnabled(false);
        this.A00.setLayoutParams(layoutParams2);
        this.A00.addView(this.A02, layoutParams2);
        this.A03 = new android.widget.LinearLayout(getContext());
        this.A03.setOrientation(0);
        com.facebook.ads.redexgen.core.YB.A0N(this.A03, -218103809);
        this.A03.setMotionEventSplittingEnabled(false);
        this.A03.addView(this.A01, layoutParams);
        this.A03.addView(this.A00, layoutParams2);
        addView(this.A03, new android.widget.FrameLayout.LayoutParams(-1, -1));
        this.A03.setClickable(true);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1199Zd
    public final void A0O() {
        this.A01.setImageBitmap(com.facebook.ads.redexgen.core.YN.A01(com.facebook.ads.redexgen.core.YM.CROSS));
        this.A01.setOnClickListener(new com.facebook.ads.redexgen.core.ViewOnClickListenerC1208Zm(this));
        this.A01.setContentDescription(A00(4, 18, 84));
        com.facebook.ads.redexgen.core.C1203Zh c1203Zh = new com.facebook.ads.redexgen.core.C1203Zh(this.A05);
        c1203Zh.setData(this.A04.A0H(), com.facebook.ads.redexgen.core.YM.HIDE_AD);
        c1203Zh.setOnClickListener(new com.facebook.ads.redexgen.core.ViewOnClickListenerC1209Zn(this, c1203Zh));
        com.facebook.ads.redexgen.core.C1203Zh c1203Zh2 = new com.facebook.ads.redexgen.core.C1203Zh(this.A05);
        c1203Zh2.setData(this.A04.A0L(), com.facebook.ads.redexgen.core.YM.REPORT_AD);
        c1203Zh2.setOnClickListener(new com.facebook.ads.redexgen.core.ViewOnClickListenerC1210Zo(this, c1203Zh2));
        com.facebook.ads.redexgen.core.C1203Zh c1203Zh3 = new com.facebook.ads.redexgen.core.C1203Zh(this.A05);
        c1203Zh3.setData(this.A04.A0M(), com.facebook.ads.redexgen.core.YM.AD_CHOICES_ICON);
        c1203Zh3.setOnClickListener(new com.facebook.ads.redexgen.core.ViewOnClickListenerC1211Zp(this, c1203Zh3));
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, A09, A09, A09);
        com.facebook.ads.redexgen.core.YB.A0W(this.A03);
        this.A02.removeAllViews();
        this.A02.addView(c1203Zh, layoutParams);
        this.A02.addView(c1203Zh2, layoutParams);
        this.A02.addView(c1203Zh3, layoutParams);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1199Zd
    public final void A0P() {
        com.facebook.ads.redexgen.core.YB.A0I(this);
        com.facebook.ads.redexgen.core.YB.A0J(this);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1199Zd
    public final void A0Q(com.facebook.ads.redexgen.core.C0930Ok c0930Ok, com.facebook.ads.redexgen.core.EnumC0928Oi enumC0928Oi) {
        this.A01.setOnClickListener(null);
        android.widget.TextView textView = new android.widget.TextView(getContext());
        com.facebook.ads.redexgen.core.YB.A0a(textView, true, 14);
        textView.setText(this.A04.A0D());
        textView.setGravity(17);
        com.facebook.ads.redexgen.core.YB.A0W(this.A03);
        this.A03.removeAllViews();
        this.A03.addView(textView, new android.widget.LinearLayout.LayoutParams(-1, -1));
        super.A0Q(c0930Ok, enumC0928Oi);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1199Zd
    public final void A0R(com.facebook.ads.redexgen.core.C0930Ok c0930Ok, com.facebook.ads.redexgen.core.EnumC0928Oi enumC0928Oi) {
        com.facebook.ads.redexgen.core.YB.A0W(this.A03);
        this.A01.setImageBitmap(com.facebook.ads.redexgen.core.YN.A01(com.facebook.ads.redexgen.core.YM.BACK_ARROW));
        this.A01.setOnClickListener(new com.facebook.ads.redexgen.core.ViewOnClickListenerC1212Zq(this));
        this.A01.setContentDescription(A00(0, 4, 85));
        this.A02.removeAllViews();
        this.A00.fullScroll(17);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, A09, A09, A09);
        for (com.facebook.ads.redexgen.core.C0930Ok c0930Ok2 : c0930Ok.A05()) {
            com.facebook.ads.redexgen.core.C1203Zh c1203Zh = new com.facebook.ads.redexgen.core.C1203Zh(this.A05);
            c1203Zh.setData(c0930Ok2.A04(), null);
            c1203Zh.setOnClickListener(new com.facebook.ads.redexgen.core.ViewOnClickListenerC1213Zr(this, c1203Zh, c0930Ok2));
            this.A02.addView(c1203Zh, layoutParams);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1199Zd
    public final boolean A0S() {
        return true;
    }
}
