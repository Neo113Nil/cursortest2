package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class F9 extends com.facebook.ads.redexgen.core.C1331bl {
    public final android.widget.ImageView A00;
    public final com.facebook.ads.redexgen.core.C1636gi A01;

    public F9(com.facebook.ads.redexgen.core.C1636gi c1636gi) {
        super(c1636gi);
        this.A01 = c1636gi;
        setRadius(30);
        this.A00 = new android.widget.ImageView(c1636gi);
        this.A00.setAdjustViewBounds(true);
        addView(this.A00, new android.widget.RelativeLayout.LayoutParams(-2, -1));
    }

    public final /* synthetic */ void A00(com.facebook.ads.redexgen.core.C1291b7 c1291b7) {
        android.view.ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.width = -2;
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) getParent();
        if (viewGroup != null) {
            viewGroup.updateViewLayout(this, layoutParams);
        }
    }

    public void setUrl(java.lang.String str) {
        com.facebook.ads.redexgen.core.LM lm = new com.facebook.ads.redexgen.core.LM(this.A00, this.A01);
        lm.A04();
        lm.A07(str);
        lm.A06(new com.facebook.ads.redexgen.core.InterfaceC1292b8() { // from class: com.facebook.ads.redexgen.X.FA
            @Override // com.facebook.ads.redexgen.core.InterfaceC1292b8
            public final void AE7(com.facebook.ads.redexgen.core.C1291b7 c1291b7) {
                com.facebook.ads.redexgen.core.F9.this.A00(c1291b7);
            }
        });
    }
}
