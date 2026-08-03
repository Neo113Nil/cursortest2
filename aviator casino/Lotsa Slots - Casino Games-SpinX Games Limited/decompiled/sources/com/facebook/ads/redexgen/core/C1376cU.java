package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.cU, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1376cU extends android.widget.RelativeLayout {
    public final android.view.View A00;
    public final com.facebook.ads.redexgen.core.C1331bl A01;

    public C1376cU(com.facebook.ads.redexgen.core.C1636gi c1636gi, android.view.View view) {
        super(c1636gi);
        this.A00 = view;
        this.A01 = new com.facebook.ads.redexgen.core.C1331bl(c1636gi);
        com.facebook.ads.redexgen.core.YB.A0K(this.A01);
    }

    public final void A00(int i) {
        this.A00.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-1, i));
    }

    public final void A01(com.facebook.ads.redexgen.core.C1336bq c1336bq, boolean z) {
        this.A01.addView(this.A00, new android.widget.RelativeLayout.LayoutParams(-1, -2));
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(getContext());
        linearLayout.setOrientation(1);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(8, this.A00.getId());
        if (c1336bq != null) {
            if (z) {
                android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(-1, -2);
                c1336bq.setAlignment(3);
                layoutParams2.setMargins(com.facebook.ads.redexgen.core.AbstractC1349c3.A08 / 2, com.facebook.ads.redexgen.core.AbstractC1349c3.A08 / 2, com.facebook.ads.redexgen.core.AbstractC1349c3.A08 / 2, com.facebook.ads.redexgen.core.AbstractC1349c3.A08 / 2);
                linearLayout.addView(c1336bq, layoutParams2);
                android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.BOTTOM_TOP, new int[]{-1778384896, 0});
                gradientDrawable.setCornerRadius(0.0f);
                gradientDrawable.setGradientType(0);
                com.facebook.ads.redexgen.core.YB.A0V(linearLayout, gradientDrawable);
            } else {
                android.widget.RelativeLayout.LayoutParams insideLayoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -2);
                insideLayoutParams.addRule(3, this.A01.getId());
                insideLayoutParams.setMargins(0, com.facebook.ads.redexgen.core.AbstractC1349c3.A08, 0, 0);
                c1336bq.setAlignment(17);
                addView(c1336bq, insideLayoutParams);
            }
        }
        this.A01.addView(linearLayout, layoutParams);
        addView(this.A01, new android.widget.RelativeLayout.LayoutParams(-1, -2));
    }
}
