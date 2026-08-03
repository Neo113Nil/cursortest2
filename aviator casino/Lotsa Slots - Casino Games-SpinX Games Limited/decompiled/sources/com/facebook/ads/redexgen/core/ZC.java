package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class ZC extends android.widget.LinearLayout {
    public static final int A03 = (int) (com.facebook.ads.redexgen.core.XX.A02 * 10.0f);
    public static final int A04 = (int) (com.facebook.ads.redexgen.core.XX.A02 * 24.0f);
    public final android.widget.ImageView A00;
    public final com.facebook.ads.redexgen.core.C0926Og A01;
    public final com.facebook.ads.redexgen.core.C1636gi A02;

    public ZC(com.facebook.ads.redexgen.core.C1636gi c1636gi) {
        super(c1636gi);
        this.A02 = c1636gi;
        this.A01 = com.facebook.ads.redexgen.core.AbstractC0927Oh.A00(c1636gi.A02());
        this.A00 = new android.widget.ImageView(c1636gi);
        A02();
    }

    private void A02() {
        A03(this.A00, com.facebook.ads.redexgen.core.YM.REDESIGN_INFO_ICON);
        setPadding(A03, A03 / 3, A03, A03 / 3);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(A04, A04);
        layoutParams.gravity = 16;
        addView(this.A00, layoutParams);
    }

    public static void A03(android.widget.ImageView imageView, com.facebook.ads.redexgen.core.YM ym) {
        imageView.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
        imageView.setImageBitmap(com.facebook.ads.redexgen.core.YN.A01(ym));
        imageView.setColorFilter(-1);
    }

    public void setAdDetails(com.facebook.ads.redexgen.core.C0906Nm c0906Nm, java.lang.String str, com.facebook.ads.redexgen.core.VI vi, com.facebook.ads.redexgen.core.InterfaceC1177Yh interfaceC1177Yh) {
        setOnClickListener(new com.facebook.ads.redexgen.core.ZB(this, vi, interfaceC1177Yh, str, c0906Nm));
    }

    public void setIconColors(int i) {
        this.A00.setColorFilter(i);
    }
}
