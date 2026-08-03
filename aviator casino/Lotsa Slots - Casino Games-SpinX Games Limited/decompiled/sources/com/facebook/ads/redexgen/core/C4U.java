package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.4U, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class C4U extends com.facebook.ads.redexgen.core.PJ {
    public static byte[] A0A;
    public static java.lang.String[] A0B = {"HroiSjGkBhlygt0UHqritDnsLvuB4mll", "UPUcpMrNl24qq0HclW9U9iERj7I4qSt3", "AR1kUYImMXSQek2fbhOL", "An1bOYQQ6mWkitzD6HneRzMou2TxbTlk", "bk2AprBMZM1jRI7qHazMlP7Iu4yWRtui", "rxrENBx6Cu3lgzyCTlNUNM4zg8", "bB4G8QrXsE48YFBGJh1Aken7ZdbC0Xcx", "YDFainhA1ZmikU8Mw"};
    public static final int A0C;
    public static final int A0D;
    public static final int A0E;
    public static final int A0F;
    public static final int A0G;
    public static final int A0H;
    public com.facebook.ads.redexgen.core.C0712Fy A00;
    public com.facebook.ads.redexgen.core.AbstractC1580fo A01;
    public final android.widget.RelativeLayout A02;
    public final com.facebook.ads.redexgen.core.C1042Sx A03;
    public final com.facebook.ads.redexgen.core.Y2 A04;
    public final com.facebook.ads.redexgen.core.C1J A05;
    public final com.facebook.ads.redexgen.core.C1329bj A06;
    public final com.facebook.ads.redexgen.core.C1581fp A07;
    public final java.lang.String A08;
    public final java.util.List<com.facebook.ads.redexgen.core.C1474e5> A09;

    public static java.lang.String A0E(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A0A, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 53);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A0H() {
        A0A = new byte[]{75, 83, 81, 72};
    }

    static {
        A0H();
        A0D = (int) (com.facebook.ads.redexgen.core.XX.A02 * 48.0f);
        A0E = com.facebook.ads.redexgen.core.XV.A0v;
        A0F = (int) (com.facebook.ads.redexgen.core.XX.A02 * 8.0f);
        A0H = (int) (com.facebook.ads.redexgen.core.XX.A02 * 56.0f);
        A0C = (int) (com.facebook.ads.redexgen.core.XX.A02 * 48.0f);
        A0G = (int) (com.facebook.ads.redexgen.core.XX.A02 * 12.0f);
    }

    public C4U(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.VA va, com.facebook.ads.redexgen.core.C1042Sx c1042Sx, com.facebook.ads.redexgen.core.InterfaceC1177Yh interfaceC1177Yh, com.facebook.ads.redexgen.core.AbstractC1801jd abstractC1801jd) {
        super(c1636gi, va, interfaceC1177Yh, abstractC1801jd);
        this.A04 = new com.facebook.ads.redexgen.core.Y2();
        if (abstractC1801jd instanceof com.facebook.ads.redexgen.core.C05117l) {
            super.A09 = true;
            super.A08 = new com.facebook.ads.redexgen.core.C1504ea(c1636gi, new com.facebook.ads.redexgen.core.MG(), this.A0D.A1G(), interfaceC1177Yh);
        }
        this.A03 = c1042Sx;
        this.A08 = this.A0D.A2E();
        int A0m = this.A0D.A0m();
        this.A01 = A0C();
        int A0n = this.A0D.A0n();
        this.A07 = new com.facebook.ads.redexgen.core.C1581fp(this, 1, new java.lang.ref.WeakReference(this.A01), this.A0E);
        java.util.List<com.facebook.ads.redexgen.core.NR> A2G = this.A0D.A2G();
        this.A07.A0W(A0m);
        this.A07.A0X(A0n);
        this.A09 = new java.util.ArrayList(A2G.size());
        super.A07 = this.A0D.A28();
        A0G();
        this.A02 = new android.widget.RelativeLayout(this.A0E);
        this.A05 = new com.facebook.ads.redexgen.core.C1J(this.A0E);
        this.A05.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-1, -2));
        com.facebook.ads.redexgen.core.YB.A0K(this.A05);
        this.A06 = new com.facebook.ads.redexgen.core.C1329bj(this.A0E, super.A07.A01(), this.A09.size());
        int viewabilityInitialDelayMs = A0F;
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, viewabilityInitialDelayMs);
        layoutParams.setMargins(0, A0G, 0, 0);
        layoutParams.addRule(3, this.A05.getId());
        layoutParams.addRule(14);
        this.A06.setLayoutParams(layoutParams);
    }

    private int A00() {
        return A0H + A0D + (A0E * 4) + (this.A0D.A2Q() ? A0C : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.facebook.ads.redexgen.core.EnumC0885Mq A02(java.lang.String str) {
        com.facebook.ads.redexgen.core.EnumC0885Mq enumC0885Mq = com.facebook.ads.redexgen.core.EnumC0885Mq.A09;
        if (this.A05 == null) {
            return enumC0885Mq;
        }
        com.facebook.ads.redexgen.core.FY holder = (com.facebook.ads.redexgen.core.FY) this.A05.A1G(this.A05.getLayoutManager().A25());
        if (holder != null && holder.A0p() != null) {
            enumC0885Mq = holder.A0p().A0E(str);
            if (holder.A0p().getCtaActionHelper().A06() == null) {
                holder.A0p().getCtaActionHelper().A07(new com.facebook.ads.redexgen.core.C0710Fw(this));
            }
        }
        return enumC0885Mq;
    }

    private com.facebook.ads.redexgen.core.C0711Fx A0C() {
        return new com.facebook.ads.redexgen.core.C0711Fx(this);
    }

    private void A0G() {
        int index = this.A0D.A2G().size();
        int i = 0;
        for (com.facebook.ads.redexgen.core.NR adInfoItem : this.A0D.A2G()) {
            int index2 = i + 1;
            this.A09.add(new com.facebook.ads.redexgen.core.C1474e5(i, index, adInfoItem));
            i = index2;
        }
    }

    private final void A0I() {
        this.A02.removeAllViews();
        this.A05.removeAllViews();
        this.A05.A1S();
        this.A06.removeAllViews();
    }

    private final void A0J(int i, android.os.Bundle bundle) {
        int A00;
        int extraSpacing;
        int height;
        int i2 = com.facebook.ads.redexgen.core.XX.A04.widthPixels;
        int i3 = com.facebook.ads.redexgen.core.XX.A04.heightPixels;
        if (i == 1) {
            A00 = java.lang.Math.min(i2 - (A0E * 4), i3 / 2);
            extraSpacing = (i2 - A00) / 8;
            height = extraSpacing * 4;
        } else {
            A00 = i3 - A00();
            extraSpacing = A0E;
            height = extraSpacing * 2;
        }
        this.A00 = new com.facebook.ads.redexgen.core.C0712Fy(this.A05, i, this.A09, this.A07, bundle);
        int childSpacing = A00;
        this.A05.setAdapter(new com.facebook.ads.redexgen.core.C0703Fp(this.A0E, this.A09, this.A0D, this.A0F, this.A03, this.A07, this.A04, getAudienceNetworkListener(), this.A08, childSpacing, extraSpacing, height, i, this.A00, this.A0H));
        this.A05.A1h(this.A05.getOnScrollListener());
        if (i == 1) {
            A0K(this.A00);
        }
        android.widget.RelativeLayout relativeLayout = this.A02;
        com.facebook.ads.redexgen.core.C1J c1j = this.A05;
        java.lang.String[] strArr = A0B;
        if (strArr[7].length() == strArr[2].length()) {
            throw new java.lang.RuntimeException();
        }
        A0B[3] = "F7mqI2GIhyyFDyTzZV2pklBppM1xGubd";
        relativeLayout.addView(c1j);
        if (this.A06 != null) {
            this.A02.addView(this.A06);
        }
        if (com.facebook.ads.redexgen.core.C1086Up.A1z(this.A0E)) {
            this.A0E.A0B().AKn(this.A05, this.A0D.A2E(), false);
        }
        A0f(this.A02, false, i);
    }

    private void A0K(com.facebook.ads.redexgen.core.C0712Fy c0712Fy) {
        new com.facebook.ads.redexgen.core.C7N().A0G(this.A05);
        c0712Fy.A0Y(new com.facebook.ads.redexgen.core.C0709Fv(this));
    }

    @Override // com.facebook.ads.redexgen.core.PJ
    public final com.facebook.ads.redexgen.core.AbstractC1171Yb A0b() {
        return new com.facebook.ads.redexgen.core.PU(this.A0E, this.A0D, 0);
    }

    @Override // com.facebook.ads.redexgen.core.PJ
    public final void A0d() {
        com.facebook.ads.redexgen.core.EnumC0885Mq A02 = A02(A0E(0, 4, 13));
        if (this.A0D.A2N()) {
            return;
        }
        com.facebook.ads.redexgen.core.EnumC0885Mq actionOutcome = com.facebook.ads.redexgen.core.EnumC0885Mq.A09;
        if (A02 != actionOutcome) {
            com.facebook.ads.redexgen.core.EnumC0885Mq actionOutcome2 = com.facebook.ads.redexgen.core.EnumC0885Mq.A06;
            if (A02 != actionOutcome2) {
                A0m();
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.PJ
    public final boolean A0l() {
        return false;
    }

    public final void A0m() {
        if (this.A0H.getToolbarActionMode() == 8) {
            this.A0H.setToolbarActionMode(2);
        }
        this.A0D.A2K(false);
        this.A0D.A29().A0M(-1);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1178Yi
    public final void AAu(android.content.Intent intent, android.os.Bundle bundle, com.facebook.ads.redexgen.core.C0998Re c0998Re) {
        A0g(c0998Re);
        A0J(c0998Re.A05().getResources().getConfiguration().orientation, bundle);
        c0998Re.A0A(new com.facebook.ads.redexgen.core.C0708Fu(this, c0998Re));
        int A04 = this.A0D.A29().A0H().A04();
        if (super.A09) {
            A04 = this.A0D.A29().A0H().A03();
        }
        if (A04 > 0) {
            A0e(A04);
        }
        com.facebook.ads.redexgen.core.AbstractC1801jd abstractC1801jd = this.A0D;
        if (A0B[4].charAt(27) == 'g') {
            throw new java.lang.RuntimeException();
        }
        A0B[5] = "xzqo3WeAICTwOfDq1ABGux21r55vxNP";
        int unskippableSec = abstractC1801jd.A29().A0H().A02();
        if (unskippableSec >= 0) {
            this.A0H.setToolbarActionMode(8);
        }
        if (this.A0D.A2T()) {
            this.A0H.setOnClickListener(new com.facebook.ads.redexgen.core.ViewOnClickListenerC1475e6(this));
        }
    }

    @Override // com.facebook.ads.redexgen.core.PJ, com.facebook.ads.redexgen.core.InterfaceC1178Yi
    public final void AFA(boolean z) {
        super.AFA(z);
        if (this.A00 != null) {
            this.A00.A0Q();
        }
    }

    @Override // com.facebook.ads.redexgen.core.PJ, com.facebook.ads.redexgen.core.InterfaceC1178Yi
    public final void AFi(boolean z) {
        super.AFi(z);
        if (this.A00 != null) {
            this.A00.A0R();
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1178Yi
    public final void AIv(android.os.Bundle bundle) {
        if (this.A00 != null) {
            this.A00.A0W(bundle);
        }
    }

    @Override // com.facebook.ads.redexgen.core.PJ
    public int getCloseButtonStyle() {
        return 0;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(android.content.res.Configuration configuration) {
        android.os.Bundle bundle = new android.os.Bundle();
        AIv(bundle);
        A0I();
        A0J(configuration.orientation, bundle);
        super.onConfigurationChanged(configuration);
    }

    @Override // com.facebook.ads.redexgen.core.PJ, com.facebook.ads.redexgen.core.InterfaceC1178Yi
    public final void onDestroy() {
        super.onDestroy();
        if (com.facebook.ads.redexgen.core.C1086Up.A1z(this.A0E)) {
            com.facebook.ads.redexgen.core.VM A0B2 = this.A0E.A0B();
            if (A0B[3].charAt(27) != 'x') {
                throw new java.lang.RuntimeException();
            }
            A0B[4] = "QmrF4TvQsO2B2hMNxlVLyQwFLZRqn96s";
            A0B2.AKU(this.A05);
        }
        if (!android.text.TextUtils.isEmpty(this.A08)) {
            this.A0F.AB7(this.A08, new com.facebook.ads.redexgen.core.C1293b9().A03(this.A07).A02(this.A04).A05());
        }
        A0I();
        this.A07.A0V();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        this.A04.A06(this.A0E, motionEvent, this, this);
        return super.onInterceptTouchEvent(motionEvent);
    }
}
