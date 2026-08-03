package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class F7 extends android.widget.LinearLayout implements com.facebook.ads.redexgen.core.InterfaceC1508ee {
    public final com.facebook.ads.NativeBannerAd A00;
    public final com.facebook.ads.redexgen.core.C1636gi A01;
    public final java.util.ArrayList<android.view.View> A02;
    public static final int A04 = (int) (com.facebook.ads.redexgen.core.XX.A02 * 42.0f);
    public static final int A03 = (int) (com.facebook.ads.redexgen.core.XX.A02 * 48.0f);
    public static final int A05 = (int) (com.facebook.ads.redexgen.core.XX.A02 * 54.0f);
    public static final int A07 = (int) (com.facebook.ads.redexgen.core.XX.A02 * 4.0f);
    public static final int A06 = (int) (com.facebook.ads.redexgen.core.XX.A02 * 8.0f);

    public F7(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.NativeBannerAd nativeBannerAd, com.facebook.ads.redexgen.core.C1100Vd c1100Vd, com.facebook.ads.redexgen.core.EnumC1101Ve enumC1101Ve, com.facebook.ads.MediaView mediaView, com.facebook.ads.AdOptionsView adOptionsView, com.facebook.ads.redexgen.core.C1227a5 c1227a5) {
        super(c1636gi);
        android.widget.LinearLayout.LayoutParams layoutParams;
        android.view.ViewGroup.LayoutParams commonLayoutParams;
        this.A02 = new java.util.ArrayList<>();
        this.A00 = nativeBannerAd;
        this.A01 = c1636gi;
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(getContext());
        linearLayout.setOrientation(0);
        int A00 = A00(enumC1101Ve);
        com.facebook.ads.redexgen.core.C1331bl c1331bl = new com.facebook.ads.redexgen.core.C1331bl(this.A01);
        c1331bl.setFullCircleCorners(true);
        android.widget.RelativeLayout.LayoutParams layoutParams2 = new android.widget.RelativeLayout.LayoutParams(A00, A00);
        c1331bl.addView(mediaView, new android.widget.LinearLayout.LayoutParams(-1, -1));
        android.widget.RelativeLayout relativeLayout = new android.widget.RelativeLayout(getContext());
        android.widget.LinearLayout.LayoutParams layoutParams3 = new android.widget.LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 16;
        relativeLayout.addView(c1331bl, layoutParams2);
        if (c1227a5 != null) {
            android.widget.RelativeLayout.LayoutParams layoutParams4 = new android.widget.RelativeLayout.LayoutParams(-2, -2);
            layoutParams4.addRule(10);
            layoutParams4.setMargins(com.facebook.ads.redexgen.core.XV.A0A, com.facebook.ads.redexgen.core.XV.A0A, com.facebook.ads.redexgen.core.XV.A00, com.facebook.ads.redexgen.core.XV.A00);
            relativeLayout.addView(c1227a5, layoutParams4);
        }
        linearLayout.addView(relativeLayout, layoutParams3);
        android.view.View c1505eb = new com.facebook.ads.redexgen.core.C1505eb(c1636gi, this.A00, enumC1101Ve, c1100Vd, adOptionsView);
        c1505eb.setPadding(A06, 0, 0, 0);
        android.widget.LinearLayout.LayoutParams layoutParams5 = new android.widget.LinearLayout.LayoutParams(0, -2);
        layoutParams5.weight = 1.0f;
        layoutParams5.gravity = 16;
        linearLayout.addView(c1505eb, layoutParams5);
        if (enumC1101Ve == com.facebook.ads.redexgen.core.EnumC1101Ve.A0A) {
            setPadding(A07, A07, A07, A07);
            setOrientation(0);
            layoutParams = new android.widget.LinearLayout.LayoutParams(0, -1);
            commonLayoutParams = new android.widget.LinearLayout.LayoutParams(-2, -1);
            linearLayout.setPadding(0, 0, A07, 0);
        } else {
            setPadding(A06, A06, A06, A06);
            setOrientation(1);
            layoutParams = new android.widget.LinearLayout.LayoutParams(-1, 0);
            commonLayoutParams = new android.widget.LinearLayout.LayoutParams(-1, -2);
            linearLayout.setPadding(0, 0, 0, A06);
        }
        layoutParams.weight = 1.0f;
        addView(linearLayout, layoutParams);
        android.widget.TextView textView = new android.widget.TextView(getContext());
        textView.setPadding(A06, A07, A06, A07);
        c1100Vd.A05(textView);
        textView.setText(this.A00.getAdCallToAction());
        addView(textView, commonLayoutParams);
        this.A02.add(mediaView);
        this.A02.add(textView);
    }

    public static int A00(com.facebook.ads.redexgen.core.EnumC1101Ve enumC1101Ve) {
        switch (enumC1101Ve) {
            case A0A:
                return A04;
            case A06:
                return A03;
            default:
                return A05;
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1508ee
    public android.view.View getView() {
        return this;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1508ee
    public java.util.ArrayList<android.view.View> getViewsForInteraction() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1508ee
    public final void unregisterView() {
        this.A00.unregisterView();
    }
}
