package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.cd, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1385cd extends android.widget.FrameLayout {
    public final int A00;
    public final android.widget.RelativeLayout A01;
    public final com.facebook.ads.redexgen.core.ViewOnClickListenerC0834Kr A02;
    public static final int A05 = (int) (com.facebook.ads.redexgen.core.XX.A02 * 36.0f);
    public static final int A06 = (int) (com.facebook.ads.redexgen.core.XX.A02 * 36.0f);
    public static final int A03 = (int) (com.facebook.ads.redexgen.core.XX.A02 * 23.0f);
    public static final int A04 = (int) (com.facebook.ads.redexgen.core.XX.A02 * 3.0f);
    public static final int A07 = (int) (com.facebook.ads.redexgen.core.XX.A02 * 4.0f);

    public C1385cd(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.ViewOnClickListenerC0834Kr viewOnClickListenerC0834Kr, com.facebook.ads.redexgen.core.AbstractC1801jd abstractC1801jd, com.facebook.ads.redexgen.core.VA va, com.facebook.ads.redexgen.core.InterfaceC1177Yh interfaceC1177Yh, com.facebook.ads.redexgen.core.C1581fp c1581fp, com.facebook.ads.redexgen.core.Y2 y2, com.facebook.ads.redexgen.core.C0894Na c0894Na, com.facebook.ads.redexgen.core.InterfaceC1314bU interfaceC1314bU) {
        super(c1636gi);
        this.A00 = c0894Na.A09(true);
        this.A01 = new android.widget.RelativeLayout(c1636gi);
        addView(this.A01, new android.widget.FrameLayout.LayoutParams(-1, -1));
        this.A01.setClickable(false);
        A01(c1636gi, abstractC1801jd.A29().A0J().A04());
        if (viewOnClickListenerC0834Kr == null) {
            this.A02 = new com.facebook.ads.redexgen.core.ViewOnClickListenerC0834Kr(c1636gi, abstractC1801jd.A0w(), (com.facebook.ads.redexgen.core.C0894Na) null, va, interfaceC1177Yh, c1581fp, y2, abstractC1801jd.A2A());
        } else {
            this.A02 = viewOnClickListenerC0834Kr;
        }
        A03();
        this.A02.setCta(abstractC1801jd.A29().A0J(), abstractC1801jd.A2E(), new java.util.HashMap(), interfaceC1314bU);
        this.A02.setIsInAppBrowser(true);
        android.widget.FrameLayout.LayoutParams ctaButtonParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
        addView(this.A02, ctaButtonParams);
    }

    private void A00(com.facebook.ads.redexgen.core.C1636gi c1636gi, android.view.View view) {
        android.widget.ImageView imageView = new android.widget.ImageView(c1636gi);
        imageView.setImageBitmap(com.facebook.ads.redexgen.core.YN.A01(com.facebook.ads.redexgen.core.YM.MINIMIZE_ARROW));
        imageView.setRotation(180.0f);
        imageView.setClickable(false);
        imageView.setColorFilter(this.A00);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(A03, A03);
        imageView.setPadding(A04, A04, A04, A04);
        layoutParams.addRule(2, view.getId());
        layoutParams.addRule(14);
        this.A01.addView(imageView, layoutParams);
    }

    private void A01(com.facebook.ads.redexgen.core.C1636gi c1636gi, java.lang.String str) {
        android.widget.Button button = new android.widget.Button(c1636gi);
        com.facebook.ads.redexgen.core.YB.A0K(button);
        button.setPadding(A06, 0, A06, 0);
        button.setText(str.toUpperCase(java.util.Locale.getDefault()));
        button.setTextSize(14.0f);
        button.setTypeface(android.graphics.Typeface.defaultFromStyle(1));
        com.facebook.ads.redexgen.core.YB.A0Q(button, this.A00, A07);
        button.setTextColor(androidx.core.view.ViewCompat.MEASURED_STATE_MASK);
        android.widget.RelativeLayout.LayoutParams ctaParams = new android.widget.RelativeLayout.LayoutParams(-2, A05);
        ctaParams.addRule(12);
        ctaParams.addRule(14);
        this.A01.addView(button, ctaParams);
        A00(c1636gi, button);
    }

    public final com.facebook.ads.redexgen.core.EnumC0885Mq A02(java.lang.String str) {
        return this.A02.A0E(str);
    }

    public final void A03() {
        this.A02.setBackgroundColor(0);
        this.A02.setTextColor(0);
    }

    @Override // android.view.View
    public final boolean performClick() {
        return this.A02.performClick();
    }

    public void setAutoClickTime(com.facebook.ads.redexgen.core.AbstractC1801jd abstractC1801jd, com.facebook.ads.redexgen.core.AbstractC1171Yb abstractC1171Yb) {
        this.A02.A0F(abstractC1801jd, abstractC1171Yb);
    }

    public void setCta(com.facebook.ads.redexgen.core.C0896Nc c0896Nc, java.lang.String str, java.util.HashMap<java.lang.String, java.lang.String> extras, com.facebook.ads.redexgen.core.InterfaceC1314bU interfaceC1314bU) {
        this.A02.setCta(c0896Nc, str, extras, interfaceC1314bU);
    }
}
