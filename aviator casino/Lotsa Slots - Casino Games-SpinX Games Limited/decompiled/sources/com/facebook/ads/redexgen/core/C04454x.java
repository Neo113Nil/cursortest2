package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.4x, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C04454x extends com.facebook.ads.redexgen.core.AbstractC0723Gj {
    public static byte[] A07;
    public static java.lang.String[] A08 = {"opNTFb7MfNeLnBf1OFt8H8u3IMVbRu1d", "IWQCWQwp5ID5RPcOdaIzYqbwlbVDrClG", "KvkPuVSJhScWrt17epNc", "F0ODCmRg5uMMagWpVfR8fmvJ1OUGt5pq", "F5r", "wG3QjEZJL94bFBL8PiZK", "A8E1xGSXICDDUeWE8x490gS0hcqgXwJC", "2T9PYA9x4VF1QbksNYikemvLXt0jGXOu"};
    public com.facebook.ads.redexgen.core.AbstractC1349c3 A00;
    public com.facebook.ads.redexgen.core.DZ A01;
    public final android.widget.ImageView A02;
    public final com.facebook.ads.redexgen.core.InterfaceC1004Rk A03;
    public final java.util.concurrent.atomic.AtomicBoolean A04;
    public final java.util.concurrent.atomic.AtomicBoolean A05;
    public final java.util.concurrent.atomic.AtomicBoolean A06;

    public static java.lang.String A03(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 61);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A07() {
        A07 = new byte[]{-17, -25, -27, -20};
    }

    static {
        A07();
    }

    public C04454x(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.ZU zu, com.facebook.ads.redexgen.core.VA va, com.facebook.ads.redexgen.core.AbstractC1801jd abstractC1801jd, com.facebook.ads.redexgen.core.C1042Sx c1042Sx, com.facebook.ads.redexgen.core.InterfaceC1177Yh interfaceC1177Yh) {
        super(c1636gi, zu, va, abstractC1801jd, c1042Sx, interfaceC1177Yh);
        this.A03 = new com.facebook.ads.redexgen.core.C0716Gc(this);
        this.A05 = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.A04 = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.A06 = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.A02 = new android.widget.ImageView(getContext());
        if (abstractC1801jd.A29().A0H().A04() > 0) {
            this.A01 = new com.facebook.ads.redexgen.core.DZ(c1636gi, abstractC1801jd.A29().A0H().A04() * 1000);
        }
        this.A02.setScaleType(android.widget.ImageView.ScaleType.CENTER);
        this.A02.setAdjustViewBounds(true);
        new com.facebook.ads.redexgen.core.LM(this.A02, super.A05).A05(super.A03.A29().A0H().A00(), super.A03.A29().A0H().A01()).A06(new com.facebook.ads.redexgen.core.C0715Gb(this)).A07(super.A03.A29().A0H().A08());
    }

    private com.facebook.ads.redexgen.core.AbstractC1349c3 A01(int i) {
        if (this.A02.getParent() != null) {
            com.facebook.ads.redexgen.core.YB.A0J(this.A02);
        }
        com.facebook.ads.redexgen.core.C1352c6 A0M = new com.facebook.ads.redexgen.core.C1352c6(super.A05, super.A06, this.A0A, super.A03, this.A02, this.A0C, this.A08).A0J(this.A09.getToolbarHeight()).A0P(this.A09).A0I(i).A0M(this.A07);
        if (this.A01 != null) {
            A0M.A0R(this.A01);
        }
        A0M.A0L(com.facebook.ads.redexgen.core.C0889Mu.A00(super.A05, super.A06, A03(0, 0, 52), com.facebook.ads.redexgen.core.XB.A00(super.A03.A29().A0J().A05()), new java.util.HashMap(), super.A03.A2A()));
        com.facebook.ads.redexgen.core.C1353c7 params = A0M.A0U();
        return com.facebook.ads.redexgen.core.AbstractC1350c4.A00(params, null, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A06() {
        if (this.A05.get() && this.A04.get()) {
            A0e();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0051, code lost:
    
        if ((r6 instanceof com.facebook.ads.redexgen.core.AbstractC0817Ka) != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A08(int i) {
        boolean z;
        com.facebook.ads.redexgen.core.YB.A0J(this.A00);
        this.A00 = A01(i);
        this.A00.setAccidentalClickCappingListener(new com.facebook.ads.redexgen.core.InterfaceC0886Mr() { // from class: com.facebook.ads.redexgen.X.Gd
            @Override // com.facebook.ads.redexgen.core.InterfaceC0886Mr
            public final void ACk() {
                com.facebook.ads.redexgen.core.C04454x.this.A0n();
            }
        });
        com.facebook.ads.redexgen.core.C0894Na colors = this.A00.getColors();
        java.lang.Integer backgroundColorForToolbar = getBackgroundColorForToolbar();
        boolean z2 = true;
        if (backgroundColorForToolbar == null) {
            if (this.A00 != null) {
                if (!this.A00.A1O()) {
                    com.facebook.ads.redexgen.core.AbstractC1349c3 abstractC1349c3 = this.A00;
                    if (A08[4].length() == 3) {
                        java.lang.String[] strArr = A08;
                        strArr[2] = "fKHhGKaWmtnLqlWg01lC";
                        strArr[5] = "lG6mBbCbmu9ZuvMubYOS";
                    }
                    throw new java.lang.RuntimeException();
                }
                z = true;
                com.facebook.ads.redexgen.core.YB.A0N(this, colors.A08(z));
            }
            z = false;
            com.facebook.ads.redexgen.core.YB.A0N(this, colors.A08(z));
        } else {
            int intValue = backgroundColorForToolbar.intValue();
            java.lang.String[] strArr2 = A08;
            if (strArr2[2].length() != strArr2[5].length()) {
                com.facebook.ads.redexgen.core.YB.A0N(this, intValue);
            } else {
                A08[0] = "OBMiQo8I4Ts7yjqshk6bkpwsmCqa0sTm";
                com.facebook.ads.redexgen.core.YB.A0N(this, intValue);
            }
        }
        com.facebook.ads.redexgen.core.AbstractC1171Yb abstractC1171Yb = this.A09;
        java.lang.String[] strArr3 = A08;
        if (strArr3[2].length() == strArr3[5].length()) {
            java.lang.String[] strArr4 = A08;
            strArr4[2] = "a7i0pPPxGgijq0ih0stJ";
            strArr4[5] = "yYRdNfPwhLNXT50Mgldr";
            abstractC1171Yb.setFullscreen(this.A00.A1O());
            this.A09.A0D(colors, com.facebook.ads.redexgen.core.ViewOnClickListenerC0834Kr.A05(super.A03));
            A0j(this.A00);
            if (super.A01 != null) {
                addView(super.A01, 0, com.facebook.ads.redexgen.core.AbstractC0723Gj.A0H);
            }
            if (this.A00 == null || !this.A00.A1O()) {
                z2 = false;
            }
            setUpFullscreenMode(z2);
            return;
        }
        throw new java.lang.RuntimeException();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0723Gj
    public final com.facebook.ads.redexgen.core.AbstractC1171Yb A0c() {
        com.facebook.ads.redexgen.core.AbstractC1171Yb A0c = super.A0c();
        if (super.A03.A2T()) {
            A0c.setOnClickListener(new com.facebook.ads.redexgen.core.ViewOnClickListenerC1457dn(this));
        }
        return A0c;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0723Gj
    public final void A0g() {
        if (this.A00 != null) {
            this.A07.A04(com.facebook.ads.redexgen.core.VH.A0Y, null);
            com.facebook.ads.redexgen.core.EnumC0885Mq A1B = this.A00.A1B(A03(0, 4, 63));
            if (super.A03.A2N()) {
                return;
            }
            com.facebook.ads.redexgen.core.EnumC0885Mq actionOutcome = com.facebook.ads.redexgen.core.EnumC0885Mq.A09;
            if (A1B != actionOutcome) {
                com.facebook.ads.redexgen.core.EnumC0885Mq actionOutcome2 = com.facebook.ads.redexgen.core.EnumC0885Mq.A06;
                if (A1B != actionOutcome2) {
                    A0f();
                }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0723Gj
    public final void A0h() {
        com.facebook.ads.redexgen.core.YB.A0L(this.A00);
        com.facebook.ads.redexgen.core.YB.A0L(this.A09);
        this.A04.set(true);
        A06();
        int A04 = super.A03.A29().A0H().A04();
        int secondsForNextCta = super.A03.A29().A0H().A02();
        if (A04 > 0) {
            if (this.A00 != null) {
                this.A00.A1G();
            }
            A0i(A04, new com.facebook.ads.redexgen.core.C0714Ga(this), this.A01);
            if (secondsForNextCta == 0 || secondsForNextCta >= A04) {
                super.A02 = true;
                this.A09.setToolbarActionMode(8);
                return;
            } else {
                if (secondsForNextCta <= 0) {
                    return;
                }
                this.A09.setProgressSpinnerInvisible(true);
                A0i(secondsForNextCta, new com.facebook.ads.redexgen.core.GZ(this), null);
                return;
            }
        }
        this.A06.set(true);
        com.facebook.ads.redexgen.core.AbstractC1171Yb abstractC1171Yb = this.A09;
        int unskippableSeconds = getCloseButtonStyle();
        abstractC1171Yb.setToolbarActionMode(unskippableSeconds);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0723Gj
    public final void A0k(com.facebook.ads.redexgen.core.C0998Re c0998Re) {
        android.widget.FrameLayout.LayoutParams layoutParams;
        c0998Re.A0A(this.A03);
        int orientation = c0998Re.A05().getResources().getConfiguration().orientation;
        A08(orientation);
        if (A0m()) {
            com.facebook.ads.redexgen.core.YB.A0J(this.A09);
        }
        if (A0m()) {
            layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -2);
            android.graphics.Rect requestedMargins = this.A09.getRequestedMargins();
            if (requestedMargins == null) {
                layoutParams.setMargins(0, com.facebook.ads.redexgen.core.XV.A0r, 0, 0);
            } else {
                int i = requestedMargins.left;
                int i2 = requestedMargins.top;
                int i3 = requestedMargins.right;
                int i4 = requestedMargins.bottom;
                if (A08[4].length() != 3) {
                    throw new java.lang.RuntimeException();
                }
                A08[0] = "j24x2xTHwZJixq019qlFmxSWfXtsmamW";
                layoutParams.setMargins(i, i2, i3, i4);
            }
        } else {
            int orientation2 = this.A09.getToolbarHeight();
            layoutParams = new android.widget.FrameLayout.LayoutParams(-1, orientation2);
        }
        addView(this.A09, layoutParams);
        com.facebook.ads.redexgen.core.YB.A0H(this.A00);
        com.facebook.ads.redexgen.core.YB.A0H(this.A09);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0723Gj
    public final boolean A0l() {
        if (this.A00 == null) {
            return false;
        }
        com.facebook.ads.redexgen.core.AbstractC1349c3 abstractC1349c3 = this.A00;
        if (A08[4].length() != 3) {
            throw new java.lang.RuntimeException();
        }
        A08[4] = "kMg";
        return abstractC1349c3.A1P(false);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0723Gj
    public final boolean A0m() {
        return super.A03.A1j() || super.A03.A1y();
    }

    public final /* synthetic */ void A0n() {
        A0f();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1178Yi
    public final void AFA(boolean z) {
        if (this.A00 != null) {
            this.A00.A1L(z);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1178Yi
    public final void AFi(boolean z) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getCloseButtonStyle() {
        if (this.A00 != null) {
            return this.A00.getCloseButtonStyle();
        }
        return 0;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0723Gj, android.view.View
    public final void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (!super.A03.A29().A0T() && !A0m()) {
            A08(configuration.orientation);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0723Gj, com.facebook.ads.redexgen.core.InterfaceC1178Yi
    public final void onDestroy() {
        if (com.facebook.ads.redexgen.core.C1086Up.A1z(super.A05)) {
            super.A05.A0B().AKU(this.A02);
        }
        if (this.A00 != null) {
            com.facebook.ads.redexgen.core.AbstractC1349c3 abstractC1349c3 = this.A00;
            java.lang.String[] strArr = A08;
            if (strArr[6].charAt(10) != strArr[1].charAt(10)) {
                throw new java.lang.RuntimeException();
            }
            A08[4] = "hIQ";
            abstractC1349c3.A1C();
        }
        super.onDestroy();
    }
}
