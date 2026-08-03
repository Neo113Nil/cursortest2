package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class FD extends com.facebook.ads.redexgen.core.C1331bl {
    public final android.widget.ImageView A00;
    public final com.facebook.ads.redexgen.core.C1636gi A01;

    public FD(com.facebook.ads.redexgen.core.C1636gi c1636gi) {
        super(c1636gi);
        this.A01 = c1636gi;
        this.A00 = new android.widget.ImageView(c1636gi);
        this.A00.setAdjustViewBounds(true);
        addView(this.A00, new android.widget.RelativeLayout.LayoutParams(-2, -1));
    }

    public final void A00(java.lang.String str) {
        com.facebook.ads.redexgen.core.LM downloadImageTask = new com.facebook.ads.redexgen.core.LM(this.A00, this.A01);
        downloadImageTask.A04();
        downloadImageTask.A07(str);
    }
}
