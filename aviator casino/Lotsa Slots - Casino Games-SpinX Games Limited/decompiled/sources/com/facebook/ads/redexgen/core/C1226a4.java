package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.a4, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1226a4 extends android.widget.LinearLayout {
    public final android.os.Handler A00;
    public final android.widget.ImageView A01;
    public final android.widget.ImageView A02;
    public final com.facebook.ads.redexgen.core.C0906Nm A03;
    public final com.facebook.ads.redexgen.core.C0926Og A04;
    public final com.facebook.ads.redexgen.core.C1636gi A05;
    public final com.facebook.ads.redexgen.core.VI A06;
    public final com.facebook.ads.redexgen.core.InterfaceC1177Yh A07;
    public final java.lang.Runnable A08;
    public final java.lang.String A09;

    public C1226a4(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.AbstractC1801jd abstractC1801jd, com.facebook.ads.redexgen.core.VI vi, com.facebook.ads.redexgen.core.InterfaceC1177Yh interfaceC1177Yh) {
        super(c1636gi);
        this.A00 = new android.os.Handler(android.os.Looper.getMainLooper());
        this.A08 = new com.facebook.ads.redexgen.core.RunnableC1224a2(this);
        this.A05 = c1636gi;
        this.A09 = abstractC1801jd.A2E();
        this.A03 = abstractC1801jd.A2C();
        this.A07 = interfaceC1177Yh;
        this.A06 = vi;
        this.A04 = com.facebook.ads.redexgen.core.AbstractC0927Oh.A00(c1636gi.A02());
        this.A01 = A01(com.facebook.ads.redexgen.core.YM.AD_CHOICE_V2_COLLAPSE, 1104);
        addView(this.A01);
        this.A02 = A01(com.facebook.ads.redexgen.core.YM.AD_CHOICE_V2_EXPAND, 1105);
        addView(this.A02);
        A07(8);
        setOnClickListener(new com.facebook.ads.redexgen.core.ViewOnClickListenerC1225a3(this));
    }

    private final android.widget.ImageView A01(com.facebook.ads.redexgen.core.YM ym, int i) {
        android.widget.ImageView imageView = new android.widget.ImageView(this.A05);
        imageView.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-2, -2));
        imageView.setImageBitmap(com.facebook.ads.redexgen.core.YN.A01(ym));
        com.facebook.ads.redexgen.core.YB.A0G(i, imageView);
        return imageView;
    }

    public final void A04() {
        this.A00.removeCallbacksAndMessages(null);
    }

    public final void A05() {
        this.A00.removeCallbacks(this.A08);
        A07(8);
    }

    public final void A06() {
        if (this.A06 != null) {
            this.A06.A04(com.facebook.ads.redexgen.core.VH.A0A, null);
        }
        if (this.A04.A0O(this.A05.A02(), true)) {
            this.A07.AAo(this.A09, this.A03);
        } else {
            if (android.text.TextUtils.isEmpty(this.A03.A00())) {
                return;
            }
            com.facebook.ads.redexgen.core.X6.A0O(new com.facebook.ads.redexgen.core.X6(), this.A05, com.facebook.ads.redexgen.core.XB.A00(this.A03.A00()), this.A09);
        }
    }

    public final void A07(int i) {
        if (i == 0) {
            this.A02.setVisibility(0);
            this.A01.setVisibility(8);
        } else {
            this.A02.setVisibility(8);
            this.A01.setVisibility(0);
        }
    }
}
