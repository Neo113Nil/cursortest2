package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.dw, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1465dw extends android.widget.RelativeLayout {
    public static java.lang.String[] A02 = {"Z2KkNK0t6KPvvV7v0Pfs0ockFnineQcN", "GWLtb6W2", "CYh1D1aDH8GxXA1fL6TVYK05g", "eN61XRBP", "dYdZ9dqAg1GcZtXShOb537F12aTOHlg0", "R696iMXnds0", "sKzTiX3IBPhCg8a0C2DYkpqsAkNZU1R0", "VXZMHsNHJCW6CRJi5CzP8gyptK"};
    public static final int A03 = com.facebook.ads.redexgen.core.XV.A0R;
    public final com.facebook.ads.redexgen.core.AbstractC1801jd A00;
    public final com.facebook.ads.redexgen.core.C1636gi A01;

    public C1465dw(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.AbstractC1801jd abstractC1801jd) {
        super(c1636gi);
        this.A01 = c1636gi;
        this.A00 = abstractC1801jd;
        com.facebook.ads.redexgen.core.AbstractC1337br.A00(c1636gi, this, abstractC1801jd.A29().A0H().A08());
        addView(getSplashScreenContent(), new android.widget.RelativeLayout.LayoutParams(-1, -1));
    }

    private android.widget.TextView A00(java.lang.String str) {
        android.widget.TextView textView = new android.widget.TextView(this.A01);
        textView.setText(str);
        textView.setTextColor(this.A00.A28().A01().A07(true));
        textView.setTextSize(16.0f);
        textView.setMaxLines(1);
        textView.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-2, -2));
        return textView;
    }

    private com.facebook.ads.redexgen.core.C1330bk getAppIcon() {
        com.facebook.ads.redexgen.core.C1330bk c1330bk = new com.facebook.ads.redexgen.core.C1330bk(this.A01);
        com.facebook.ads.redexgen.core.YB.A0N(c1330bk, 0);
        new com.facebook.ads.redexgen.core.LM(c1330bk, this.A01).A05(A03, A03).A07(this.A00.A2C().A01());
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(A03, A03);
        layoutParams.setMargins(0, 0, 0, com.facebook.ads.redexgen.core.XV.A09);
        c1330bk.setLayoutParams(layoutParams);
        return c1330bk;
    }

    private android.widget.LinearLayout getSplashScreenContent() {
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(this.A01);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.addView(getAppIcon());
        linearLayout.addView(getTitleText());
        if (this.A00.A29().A0H().A07() != null) {
            java.lang.String A0R = this.A00.A29().A0H().A07().A0R();
            if (A02[2].length() == 3) {
                throw new java.lang.RuntimeException();
            }
            A02[7] = "EsVH3Bp8ZrJsopZmogAWlKdK6w";
            linearLayout.addView(A00(A0R));
        }
        return linearLayout;
    }

    private android.widget.TextView getTitleText() {
        android.widget.TextView textView = new android.widget.TextView(this.A01);
        textView.setTextColor(this.A00.A28().A01().A07(true));
        textView.setText(this.A00.A29().A0I().A0G());
        textView.setTextSize(20.0f);
        textView.setMaxLines(1);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, 0, 0, com.facebook.ads.redexgen.core.XV.A0U);
        textView.setLayoutParams(layoutParams);
        return textView;
    }
}
