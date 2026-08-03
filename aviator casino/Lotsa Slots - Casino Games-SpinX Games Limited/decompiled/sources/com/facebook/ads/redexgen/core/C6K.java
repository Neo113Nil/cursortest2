package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.6K, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class C6K extends com.facebook.ads.redexgen.core.AbstractC0817Ka {
    public static byte[] A09;
    public float A00;
    public com.facebook.ads.redexgen.core.C1497eS A01;
    public boolean A02;
    public final android.os.Handler A03;
    public final android.view.View A04;
    public final android.widget.RelativeLayout A05;
    public final android.widget.RelativeLayout A06;
    public final com.facebook.ads.redexgen.core.AbstractC1171Yb A07;
    public final com.facebook.ads.redexgen.core.InterfaceC1177Yh A08;

    static {
        A06();
    }

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A09, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 106);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A06() {
        A09 = new byte[]{112, 116, 120, 126, 124};
    }

    public C6K(com.facebook.ads.redexgen.core.C1353c7 c1353c7) {
        super(c1353c7, true);
        this.A03 = new android.os.Handler(android.os.Looper.getMainLooper());
        this.A02 = false;
        this.A08 = c1353c7.A0C();
        this.A07 = c1353c7.A0B();
        this.A06 = new android.widget.RelativeLayout(c1353c7.A06());
        this.A05 = new android.widget.RelativeLayout(c1353c7.A06());
        com.facebook.ads.redexgen.core.YB.A0K(this.A05);
        com.facebook.ads.redexgen.core.YB.A0K(this.A06);
        this.A04 = c1353c7.A02();
        A04();
        this.A06.addView(this.A05, new android.widget.RelativeLayout.LayoutParams(-2, -2));
        addView(this.A06, new android.widget.RelativeLayout.LayoutParams(-1, -1));
        com.facebook.ads.redexgen.core.AbstractC1337br.A00(c1353c7.A06(), this.A06, getAdInfo().A0H().A08());
        A03();
        ((com.facebook.ads.redexgen.core.AbstractC1349c3) this).A07.A06().A0F().AKh(com.facebook.ads.redexgen.core.XL.A00(this.A00), getResources().getConfiguration().orientation, false, false, com.facebook.ads.redexgen.core.AbstractC0888Mt.A0C(((com.facebook.ads.redexgen.core.AbstractC1349c3) this).A07.A04()));
    }

    private void A02() {
        com.facebook.ads.redexgen.core.YB.A0d(this.A07, getAdDetailsView(), getCtaButton());
        this.A01 = new com.facebook.ads.redexgen.core.C1497eS(((com.facebook.ads.redexgen.core.AbstractC1349c3) this).A07.A06(), getAdDataBundle(), this.A08, getCtaButton(), this.A03, ((com.facebook.ads.redexgen.core.AbstractC1349c3) this).A07.A08());
        addView(this.A01.A0W(), new android.widget.RelativeLayout.LayoutParams(-1, -1));
    }

    private void A03() {
        com.facebook.ads.redexgen.core.YB.A0J(getAdDetailsView());
        addView(getAdDetailsView(), new android.widget.RelativeLayout.LayoutParams(-1, -1));
        getAdDetailsView().setVisibility(0);
        A07(getResources().getConfiguration().orientation);
        if (getAdDetailsView() instanceof com.facebook.ads.redexgen.core.LK) {
            ((com.facebook.ads.redexgen.core.LK) getAdDetailsView()).A0u(getResources().getConfiguration().orientation);
        }
    }

    private void A04() {
        if (this.A04 == null) {
            return;
        }
        this.A05.addView(this.A04, new android.widget.RelativeLayout.LayoutParams(-2, -2));
        com.facebook.ads.redexgen.core.YB.A0K(this.A04);
        com.facebook.ads.redexgen.core.XR A02 = super.A08.A02(getAdDataBundle());
        ((com.facebook.ads.redexgen.core.AbstractC1349c3) this).A07.A06().A0H().A00(A02.A01);
        getCtaButton().setCreativeAsCtaLoggingHelper(super.A08);
        if (A02.A00) {
            this.A04.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.c1
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    com.facebook.ads.redexgen.core.C6K.this.A1X(view);
                }
            });
        } else {
            if (!com.facebook.ads.redexgen.core.C1086Up.A1J(getAdContextWrapper())) {
                return;
            }
            com.facebook.ads.redexgen.core.AbstractC1296bC.A00(this.A04, com.facebook.ads.redexgen.core.C1086Up.A1K(getAdContextWrapper()), new com.facebook.ads.redexgen.core.ViewOnClickListenerC1348c2(this));
        }
    }

    private void A05() {
        this.A09.set(true);
        com.facebook.ads.redexgen.core.YB.A0W(this);
        int i = 2;
        com.facebook.ads.redexgen.core.YB.A0d(this.A05, getAdDetailsView());
        com.facebook.ads.redexgen.core.YB.A0L(this.A07);
        A02();
        if (getAdInfo().A0K().A00() >= 0) {
            this.A02 = true;
            if (this.A07 != null) {
                com.facebook.ads.redexgen.core.AbstractC1171Yb abstractC1171Yb = this.A07;
                if (getAdDataBundle().A2P()) {
                    i = 8;
                }
                abstractC1171Yb.setToolbarActionMode(i);
                this.A07.setProgressImmediate(0.0f);
            }
            new com.facebook.ads.redexgen.core.XO((int) getAdInfo().A0K().A00(), 20.0f, 20L, new android.os.Handler(android.os.Looper.getMainLooper()), new com.facebook.ads.redexgen.core.KY(this)).A07();
        }
    }

    private void A07(int i) {
        A08(i);
        A1V(i, this.A06, this.A05);
    }

    private void A08(int i) {
        if (this.A04 == null) {
            return;
        }
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) this.A04.getLayoutParams();
        layoutParams.removeRule(13);
        layoutParams.removeRule(10);
        layoutParams.removeRule(9);
        if (i == 1) {
            layoutParams.width = -1;
            layoutParams.height = -2;
            layoutParams.addRule(10);
        } else {
            layoutParams.width = -2;
            layoutParams.height = -1;
            if (com.facebook.ads.redexgen.core.XL.A05(this.A00)) {
                layoutParams.addRule(13);
                android.widget.RelativeLayout.LayoutParams containerLayoutParam = (android.widget.RelativeLayout.LayoutParams) this.A05.getLayoutParams();
                containerLayoutParam.addRule(14);
                this.A05.setLayoutParams(containerLayoutParam);
            } else {
                layoutParams.addRule(9);
            }
        }
        this.A04.setLayoutParams(layoutParams);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1349c3
    public final boolean A0A() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1349c3
    public final boolean A0B() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0817Ka, com.facebook.ads.redexgen.core.AbstractC1349c3
    public final void A1C() {
        super.A1C();
        this.A03.removeCallbacksAndMessages(null);
        getAdDetailsView().A0j();
        if (this.A01 != null) {
            this.A01.A0Y();
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0817Ka, com.facebook.ads.redexgen.core.AbstractC1349c3
    public final void A1H(com.facebook.ads.redexgen.core.NR nr, java.lang.String str, double d, android.os.Bundle bundle) {
        super.A1H(nr, str, d, bundle);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1349c3
    public final void A1L(boolean z) {
        super.A1L(z);
        getAdDetailsView().A0m(z);
        if (this.A01 != null) {
            this.A01.A0e(z);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1349c3
    public final boolean A1M() {
        return getAdInfo().A0V();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1349c3
    public final boolean A1O() {
        return true;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1349c3
    public final boolean A1P(boolean z) {
        if (getAdInfo().A0V() && !this.A09.get()) {
            A05();
            return true;
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0817Ka
    public final com.facebook.ads.redexgen.core.AbstractC1299bF A1R(com.facebook.ads.redexgen.core.C1353c7 c1353c7, com.facebook.ads.redexgen.core.NR nr, java.lang.String str) {
        this.A00 = new com.facebook.ads.redexgen.core.C1042Sx(c1353c7.A06()).A0M(nr.A0H().A08());
        return new com.facebook.ads.redexgen.core.C1338bs(this.A00, str, c1353c7.A06(), getColors(), c1353c7.A05(), c1353c7.A0C(), getCtaButton(), com.facebook.ads.redexgen.core.AbstractC0817Ka.A0G, false, c1353c7.A07(), c1353c7.A0F(), c1353c7.A0A(), c1353c7.A0E(), c1353c7.A08(), false).A03();
    }

    public final /* synthetic */ void A1X(android.view.View view) {
        getCtaButton().A0E(A01(0, 5, 115));
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1349c3
    public int getCloseButtonStyle() {
        if (this.A02) {
            if (getAdDataBundle().A2P()) {
                return 8;
            }
            return 2;
        }
        if (A1M() && !this.A09.get()) {
            return 1;
        }
        return super.getCloseButtonStyle();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0817Ka, com.facebook.ads.redexgen.core.AbstractC1349c3, android.view.View
    public final void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.A01 != null && this.A09.get()) {
            this.A01.A0a(configuration.orientation);
        } else {
            A07(configuration.orientation);
        }
    }
}
