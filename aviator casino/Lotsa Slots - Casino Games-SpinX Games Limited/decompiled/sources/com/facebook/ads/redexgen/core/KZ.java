package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class KZ extends com.facebook.ads.redexgen.core.AbstractC1349c3 implements com.facebook.ads.redexgen.core.XQ {
    public static byte[] A03;
    public static java.lang.String[] A04 = {"jViytUMb8W4ggVUJxJM4ipopCTL5", "9aLNfhHGIgyW1yw0lAvb2knTk6C61HAs", "tSRmVjXXTSnTtzrce7INiQjRTYiInlbV", "4hcdJiGUQmFME9vgh87fiTmYWHBJid0b", "Sl93MFe7LYTqHCUKgRBPFfcYUFdC2Wx2", "6CReOOSeiw7R4vGYWPFAi839J8MszZAI", "rkSedGSxOJTtoP7gEY2R8PFp4jzzUrYJ", "HZKY5YyrBfN27m9O42YnVDeAUeo6GkfS"};
    public final com.facebook.ads.redexgen.core.AbstractC1801jd A00;
    public final com.facebook.ads.redexgen.core.XS A01;
    public final com.facebook.ads.redexgen.core.InterfaceC1177Yh A02;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A03, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A04[0].length() != 28) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A04;
            strArr[1] = "P3g3yiO3ICi92ZTGqQIjITPfAPWFUEMm";
            strArr[2] = "pyBqNmisWoZkDTGCi8bHuToayw1uFlPn";
            if (i4 >= length) {
                return new java.lang.String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 78);
            i4++;
        }
    }

    public static void A01() {
        A03 = new byte[]{com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 68, 72, 78, 76};
    }

    static {
        A01();
    }

    public KZ(com.facebook.ads.redexgen.core.C1353c7 c1353c7, boolean z) {
        super(c1353c7, true);
        android.widget.FrameLayout.LayoutParams layoutParams;
        this.A02 = c1353c7.A0C();
        this.A00 = c1353c7.A05();
        android.widget.RelativeLayout relativeLayout = new android.widget.RelativeLayout(c1353c7.A06());
        android.widget.RelativeLayout.LayoutParams layoutParams2 = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(12);
        com.facebook.ads.redexgen.core.YB.A0U(relativeLayout, getAdContextWrapper());
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(c1353c7.A06());
        linearLayout.setOrientation(!z ? 1 : 0);
        linearLayout.setGravity(80);
        com.facebook.ads.redexgen.core.YB.A0K(linearLayout);
        android.widget.RelativeLayout.LayoutParams layoutParams3 = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        layoutParams3.setMargins(com.facebook.ads.redexgen.core.AbstractC1349c3.A08, 0, com.facebook.ads.redexgen.core.AbstractC1349c3.A08, com.facebook.ads.redexgen.core.AbstractC1349c3.A08);
        android.widget.LinearLayout.LayoutParams layoutParams4 = new android.widget.LinearLayout.LayoutParams(z ? -2 : -1, -2);
        layoutParams4.setMargins(z ? com.facebook.ads.redexgen.core.AbstractC1349c3.A08 : 0, z ? 0 : com.facebook.ads.redexgen.core.AbstractC1349c3.A08, 0, 0);
        android.widget.LinearLayout.LayoutParams layoutParams5 = new android.widget.LinearLayout.LayoutParams(z ? 0 : -1, -2);
        layoutParams5.setMargins(0, 0, 0, 0);
        layoutParams5.weight = 1.0f;
        linearLayout.addView(getTitleDescContainer(), layoutParams5);
        this.A01 = com.facebook.ads.redexgen.core.XS.A00(c1353c7.A06(), this.A00, this);
        com.facebook.ads.redexgen.core.XR A02 = this.A01.A02(this.A00);
        c1353c7.A06().A0H().A00(A02.A01);
        if (c1353c7.A0H() && !z) {
            com.facebook.ads.redexgen.core.C1473e4 c1473e4 = new com.facebook.ads.redexgen.core.C1473e4(c1353c7.A06());
            c1473e4.setPageDetails(c1353c7.A05().A2C());
            int A05 = this.A07.A05().A28().A00().A05(true);
            c1473e4.A02(A05, A05);
            com.facebook.ads.redexgen.core.YB.A0G(1007, c1473e4);
            android.widget.LinearLayout.LayoutParams layoutParams6 = new android.widget.LinearLayout.LayoutParams(-1, -2);
            layoutParams6.setMargins(0, com.facebook.ads.redexgen.core.AbstractC1349c3.A08, 0, 0);
            linearLayout.addView(c1473e4, layoutParams6);
            if (com.facebook.ads.redexgen.core.C1086Up.A18(c1353c7.A06())) {
                c1473e4.setOnClickListener(getCtaButton());
            }
        }
        linearLayout.addView(getCtaButton(), layoutParams4);
        relativeLayout.addView(linearLayout, layoutParams3);
        getCtaButton().A0F(c1353c7.A05(), c1353c7.A0B());
        android.view.View A022 = c1353c7.A02();
        if (A022 != null && (A02.A00 || com.facebook.ads.redexgen.core.C1086Up.A1J(getAdContextWrapper()))) {
            if (z) {
                layoutParams = new android.widget.FrameLayout.LayoutParams(-2, -1);
            } else {
                layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -2);
            }
            layoutParams.gravity = 17;
            android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(c1353c7.A06());
            frameLayout.addView(A022, layoutParams);
            addView(frameLayout, new android.widget.RelativeLayout.LayoutParams(-1, -1));
            getCtaButton().setCreativeAsCtaLoggingHelper(this.A01);
            if (A02.A00) {
                A022.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.bz
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        com.facebook.ads.redexgen.core.KZ.this.A1Q(view);
                    }
                });
            } else {
                com.facebook.ads.redexgen.core.AbstractC1296bC.A00(A022, com.facebook.ads.redexgen.core.C1086Up.A1K(getAdContextWrapper()), new com.facebook.ads.redexgen.core.ViewOnClickListenerC1346c0(this));
            }
        } else if (A022 != null) {
            addView(A022, new android.widget.RelativeLayout.LayoutParams(-1, -1));
        }
        addView(relativeLayout, layoutParams2);
        if (com.facebook.ads.redexgen.core.C1086Up.A17(c1353c7.A06())) {
            getTitleDescContainer().setCTAClickListener(getCtaButton());
            if (c1353c7.A0B() != null) {
                c1353c7.A0B().setCTAClickListener(getCtaButton());
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1349c3
    public final void A1C() {
        super.A1C();
        this.A01.A03();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1349c3
    public final void A1H(com.facebook.ads.redexgen.core.NR nr, java.lang.String str, double d, android.os.Bundle bundle) {
        super.A1H(nr, str, d, bundle);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1349c3
    public final boolean A1O() {
        return true;
    }

    public final /* synthetic */ void A1Q(android.view.View view) {
        getCtaButton().A0E(A00(0, 5, 103));
    }
}
