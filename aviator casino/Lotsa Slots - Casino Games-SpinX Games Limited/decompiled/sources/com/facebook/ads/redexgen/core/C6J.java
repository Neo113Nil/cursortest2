package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.6J, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class C6J extends com.facebook.ads.redexgen.core.AbstractC0817Ka {
    public static byte[] A02;
    public static java.lang.String[] A03 = {"ccLmdgMtf", "50lpHgsnQSuWf1CWCacJGyiAwAWsDUud", "Nq2vo108Bdlpu7LWCjcAC5dDG31maruF", "TAe0PaklKNA7XHBVlxrhZCtyBfgeydAO", "ouUdcivF6", "IAXVD4SBpgtyrGYWX4yc8p2wBrUpSeUf", "nA5GNdAWyE31pAGlKcdnPdOQEY7Q2fwD", "a5Dyr8HKQP9cZfy0xnx35qJg31dQk6"};
    public static final int A04;
    public final android.view.View A00;
    public final boolean A01;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A02, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A03[7].length() != 30) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A03;
            strArr[0] = "FT3046kmt";
            strArr[4] = "J6Q3a22Lt";
            if (i4 >= length) {
                return new java.lang.String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 71);
            i4++;
        }
    }

    public static void A01() {
        A02 = new byte[]{37, 33, 45, 43, 41};
    }

    static {
        A01();
        A04 = android.content.res.Resources.getSystem().getDisplayMetrics().widthPixels;
    }

    public C6J(com.facebook.ads.redexgen.core.C1353c7 c1353c7, boolean z) {
        super(c1353c7, true);
        this.A01 = z;
        this.A00 = c1353c7.A02();
        if (this.A00 == null) {
            return;
        }
        A1S();
        if (this.A01) {
            addView(this.A00, new android.widget.RelativeLayout.LayoutParams(-1, -1));
        } else {
            android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(c1353c7.A06());
            android.widget.RelativeLayout.LayoutParams insideContainerParams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
            insideContainerParams.addRule(2, getAdDetailsView().getId());
            frameLayout.setLayoutParams(insideContainerParams);
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 17;
            layoutParams.setMargins(com.facebook.ads.redexgen.core.AbstractC1349c3.A08, 0, com.facebook.ads.redexgen.core.AbstractC1349c3.A08, 0);
            frameLayout.addView(this.A00, layoutParams);
            addView(frameLayout);
        }
        com.facebook.ads.redexgen.core.XR A022 = this.A08.A02(getAdDataBundle());
        c1353c7.A06().A0H().A00(A022.A01);
        getCtaButton().setCreativeAsCtaLoggingHelper(this.A08);
        if (this.A00 != null) {
            if (A022.A00) {
                this.A00.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.c8
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        com.facebook.ads.redexgen.core.C6J.this.A1X(view);
                    }
                });
            } else if (com.facebook.ads.redexgen.core.C1086Up.A1J(getAdContextWrapper())) {
                com.facebook.ads.redexgen.core.AbstractC1296bC.A00(this.A00, com.facebook.ads.redexgen.core.C1086Up.A1K(getAdContextWrapper()), new com.facebook.ads.redexgen.core.ViewOnClickListenerC1355c9(this));
            }
        }
        getAdDetailsView().bringToFront();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1349c3
    public final boolean A0A() {
        return this.A01 && super.A0B();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1349c3
    public final boolean A0B() {
        return this.A01 && super.A0B();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0817Ka, com.facebook.ads.redexgen.core.AbstractC1349c3
    public final void A1H(com.facebook.ads.redexgen.core.NR nr, java.lang.String str, double d, android.os.Bundle bundle) {
        super.A1H(nr, str, d, bundle);
        if (!this.A01 && d > 0.0d && this.A00 != null) {
            int mediaHeight = (int) ((A04 - (com.facebook.ads.redexgen.core.AbstractC1349c3.A08 * 2)) / d);
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, mediaHeight);
            layoutParams.gravity = 17;
            int i = com.facebook.ads.redexgen.core.AbstractC1349c3.A08;
            int mediaHeight2 = com.facebook.ads.redexgen.core.AbstractC1349c3.A08;
            layoutParams.setMargins(i, 0, mediaHeight2, 0);
            this.A00.setLayoutParams(layoutParams);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1349c3
    public final boolean A1O() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0817Ka
    public final com.facebook.ads.redexgen.core.AbstractC1299bF A1R(com.facebook.ads.redexgen.core.C1353c7 c1353c7, com.facebook.ads.redexgen.core.NR nr, java.lang.String str) {
        return new com.facebook.ads.redexgen.core.C0820Kd(c1353c7.A06(), getCtaButton(), com.facebook.ads.redexgen.core.AbstractC0817Ka.A0F, nr.A0I().A00() == com.facebook.ads.redexgen.core.NW.A05, getColors(), nr.A0J().A06(), str, c1353c7.A07(), c1353c7.A0C(), c1353c7.A0F(), c1353c7.A0A(), c1353c7.A05());
    }

    public final /* synthetic */ void A1X(android.view.View view) {
        getCtaButton().A0E(A00(0, 5, 11));
    }
}
