package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class KU extends com.facebook.ads.redexgen.core.AbstractC1349c3 implements com.facebook.ads.redexgen.core.XQ {
    public static byte[] A05;
    public static final int A06;
    public final com.facebook.ads.redexgen.core.AbstractC1801jd A00;
    public final com.facebook.ads.redexgen.core.XS A01;
    public final com.facebook.ads.redexgen.core.InterfaceC1177Yh A02;
    public final com.facebook.ads.redexgen.core.C1376cU A03;
    public final com.facebook.ads.redexgen.core.C1473e4 A04;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 86);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{38, 42, com.google.common.base.Ascii.RS, 36, 34};
    }

    static {
        A01();
        A06 = android.content.res.Resources.getSystem().getDisplayMetrics().widthPixels;
    }

    public KU(com.facebook.ads.redexgen.core.C1353c7 c1353c7, boolean z) {
        super(c1353c7, z);
        int id;
        int A01;
        this.A02 = c1353c7.A0C();
        this.A00 = c1353c7.A05();
        this.A03 = new com.facebook.ads.redexgen.core.C1376cU(c1353c7.A06(), c1353c7.A02());
        this.A03.A01(getTitleDescContainer(), z);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12);
        layoutParams.setMargins(com.facebook.ads.redexgen.core.AbstractC1349c3.A08, com.facebook.ads.redexgen.core.AbstractC1349c3.A08, com.facebook.ads.redexgen.core.AbstractC1349c3.A08, com.facebook.ads.redexgen.core.AbstractC1349c3.A08);
        getCtaButton().setLayoutParams(layoutParams);
        if (c1353c7.A0H()) {
            this.A04 = new com.facebook.ads.redexgen.core.C1473e4(c1353c7.A06());
            this.A04.setPageDetails(c1353c7.A05().A2C());
            com.facebook.ads.redexgen.core.YB.A0G(1007, this.A04);
            android.widget.RelativeLayout.LayoutParams pageDetailsParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
            pageDetailsParams.addRule(2, getCtaButton().getId());
            pageDetailsParams.setMargins(com.facebook.ads.redexgen.core.AbstractC1349c3.A08, com.facebook.ads.redexgen.core.AbstractC1349c3.A08 - (com.facebook.ads.redexgen.core.AbstractC1349c3.A08 / 2), com.facebook.ads.redexgen.core.AbstractC1349c3.A08, 0);
            this.A04.setLayoutParams(pageDetailsParams);
            id = this.A04.getId();
            A01 = c1353c7.A01() - (com.facebook.ads.redexgen.core.AbstractC1349c3.A08 / 2);
        } else {
            id = getCtaButton().getId();
            A01 = c1353c7.A01();
            this.A04 = null;
        }
        android.widget.FrameLayout insideContainerLayout = new android.widget.FrameLayout(c1353c7.A06());
        android.widget.RelativeLayout.LayoutParams layoutParams2 = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        layoutParams2.addRule(10);
        layoutParams2.addRule(2, id);
        layoutParams2.setMargins(0, A01, 0, 0);
        insideContainerLayout.setLayoutParams(layoutParams2);
        android.widget.FrameLayout.LayoutParams layoutParams3 = new android.widget.FrameLayout.LayoutParams(-1, -2);
        layoutParams3.gravity = 17;
        layoutParams3.setMargins(com.facebook.ads.redexgen.core.AbstractC1349c3.A08, 0, com.facebook.ads.redexgen.core.AbstractC1349c3.A08, 0);
        insideContainerLayout.addView(this.A03, layoutParams3);
        addView(insideContainerLayout);
        if (this.A04 != null) {
            addView(this.A04);
        }
        addView(getCtaButton());
        getCtaButton().A0F(c1353c7.A05(), c1353c7.A0B());
        android.view.View A02 = c1353c7.A02();
        this.A01 = com.facebook.ads.redexgen.core.XS.A00(c1353c7.A06(), this.A00, this);
        com.facebook.ads.redexgen.core.XR A022 = this.A01.A02(this.A00);
        c1353c7.A06().A0H().A00(A022.A01);
        getCtaButton().setCreativeAsCtaLoggingHelper(this.A01);
        if (A02 != null && A022.A00) {
            A02.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.cD
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    com.facebook.ads.redexgen.core.KU.this.A1Q(view);
                }
            });
        } else if (A02 != null && com.facebook.ads.redexgen.core.C1086Up.A1J(getAdContextWrapper())) {
            com.facebook.ads.redexgen.core.AbstractC1296bC.A00(A02, com.facebook.ads.redexgen.core.C1086Up.A1K(getAdContextWrapper()), new com.facebook.ads.redexgen.core.ViewOnClickListenerC1360cE(this));
        }
        if (com.facebook.ads.redexgen.core.C1086Up.A17(c1353c7.A06())) {
            getTitleDescContainer().setCTAClickListener(getCtaButton());
            if (c1353c7.A0B() != null) {
                c1353c7.A0B().setCTAClickListener(getCtaButton());
            }
        }
        if (this.A04 != null && com.facebook.ads.redexgen.core.C1086Up.A18(c1353c7.A06())) {
            this.A04.setOnClickListener(getCtaButton());
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1349c3
    public final boolean A0A() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1349c3
    public final boolean A0B() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1349c3
    public final void A1C() {
        super.A1C();
        this.A01.A03();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1349c3
    public final void A1H(com.facebook.ads.redexgen.core.NR nr, java.lang.String str, double d, android.os.Bundle bundle) {
        super.A1H(nr, str, d, bundle);
        if (d > 0.0d) {
            int mediaHeight = (int) ((A06 - (com.facebook.ads.redexgen.core.AbstractC1349c3.A08 * 2)) / d);
            this.A03.A00(mediaHeight);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1349c3
    public final boolean A1O() {
        return false;
    }

    public final /* synthetic */ void A1Q(android.view.View view) {
        getCtaButton().A0E(A00(0, 5, 103));
    }
}
