package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class ZX extends android.widget.FrameLayout {
    public static byte[] A03;
    public android.widget.RelativeLayout A00;
    public android.widget.ScrollView A01;
    public final com.facebook.ads.redexgen.core.C1636gi A02;

    static {
        A04();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 39);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A04() {
        A03 = new byte[]{98, 94, 83, com.google.common.base.Ascii.SYN, 119, 82, com.google.common.base.Ascii.SYN, 95, 69, com.google.common.base.Ascii.SYN, 94, 95, 82, 82, 83, 88, 94, 101, 111, 100};
    }

    public ZX(com.facebook.ads.redexgen.core.C1636gi c1636gi) {
        super(c1636gi);
        this.A02 = c1636gi;
        this.A02.A0F().AB1();
        A03();
        A02();
    }

    private void A01() {
        com.facebook.ads.redexgen.core.YB.A0I(this);
        com.facebook.ads.redexgen.core.YB.A0J(this);
    }

    private void A02() {
        this.A00.removeAllViews();
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        this.A00.addView(getAdHideView(), layoutParams);
        com.facebook.ads.redexgen.core.YB.A0W(this.A00);
        this.A01.fullScroll(33);
    }

    private void A03() {
        this.A01 = new android.widget.ScrollView(this.A02);
        this.A01.setFillViewport(true);
        com.facebook.ads.redexgen.core.YB.A0N(this.A01, -218103809);
        this.A00 = new android.widget.RelativeLayout(this.A02);
        this.A00.setPadding(com.facebook.ads.redexgen.core.XV.A0U, com.facebook.ads.redexgen.core.XV.A0U, com.facebook.ads.redexgen.core.XV.A0U, com.facebook.ads.redexgen.core.XV.A0U);
        this.A01.addView(this.A00, new android.widget.FrameLayout.LayoutParams(-1, -2));
        android.widget.ScrollView scrollView = this.A01;
        android.widget.FrameLayout.LayoutParams mainLayoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
        addView(scrollView, mainLayoutParams);
    }

    public final /* synthetic */ void A05(com.facebook.ads.redexgen.core.C1203Zh c1203Zh, android.view.View view) {
        this.A02.A0F().AB2();
        c1203Zh.A01();
        A01();
    }

    private android.widget.LinearLayout getAdHideView() {
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(this.A02);
        linearLayout.setOrientation(1);
        android.widget.TextView textView = new android.widget.TextView(this.A02);
        com.facebook.ads.redexgen.core.YB.A0a(textView, true, 20);
        textView.setTextColor(-14934495);
        textView.setText(A00(0, 16, 17));
        textView.setGravity(17);
        android.widget.LinearLayout.LayoutParams undoAdHideParams = new android.widget.LinearLayout.LayoutParams(-2, -2);
        undoAdHideParams.setMargins(com.facebook.ads.redexgen.core.XV.A00, com.facebook.ads.redexgen.core.XV.A00, com.facebook.ads.redexgen.core.XV.A00, com.facebook.ads.redexgen.core.XV.A09);
        final com.facebook.ads.redexgen.core.C1203Zh c1203Zh = new com.facebook.ads.redexgen.core.C1203Zh(this.A02);
        c1203Zh.setData(A00(16, 4, 44), null);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        c1203Zh.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.ZV
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.facebook.ads.redexgen.core.ZX.this.A05(c1203Zh, view);
            }
        });
        linearLayout.addView(textView, undoAdHideParams);
        linearLayout.addView(c1203Zh, layoutParams);
        return linearLayout;
    }
}
