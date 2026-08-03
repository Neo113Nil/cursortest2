package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.4T, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class C4T extends com.facebook.ads.redexgen.core.PJ {
    public static byte[] A0D;
    public static java.lang.String[] A0E = {"tW3Su6P8GZp1yTngpwFy2DF2GhDzXnf2", "3HQabaXZCQWVf5CedpF1izNpaoU6B", "XHPkWVuaRS230ZzCiYR7qtQACoZnYKM5", "gQNAwnCobdMDtnebLpL2jf4350QwOymE", "dRJ3n5TbirTJDeON6upQokchUTJmTtSu", "43KhzPf8qbqk0SZtfSmXLCVXJtKHuuuO", "kYCENHGiqRDWZvuV9M2TmYzxFqbu31T5", "7NDfQDtGKt0HcNI2moZZTs031QkqKmSX"};
    public static final int A0F;
    public static final int A0G;
    public static final int A0H;
    public static final int A0I;
    public static final int A0J;
    public static final int A0K;
    public int A00;
    public int A01;
    public android.widget.LinearLayout A02;
    public com.facebook.ads.redexgen.core.AbstractC1801jd A03;
    public com.facebook.ads.redexgen.core.C1042Sx A04;
    public com.facebook.ads.redexgen.core.C1J A05;
    public com.facebook.ads.redexgen.core.C1329bj A06;
    public com.facebook.ads.redexgen.core.C0712Fy A07;
    public com.facebook.ads.redexgen.core.AbstractC1580fo A08;
    public com.facebook.ads.redexgen.core.C1581fp A09;
    public java.lang.String A0A;
    public java.util.List<com.facebook.ads.redexgen.core.C1474e5> A0B;
    public final com.facebook.ads.redexgen.core.Y2 A0C;

    public static java.lang.String A0E(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A0D, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 7);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A0G() {
        A0D = new byte[]{66, 71, 124, 71, 66, 87, 66, 124, 65, 86, 77, 71, 79, 70, com.google.common.base.Ascii.DC2, 5, com.google.common.base.Ascii.ETB, 1, com.google.common.base.Ascii.DC2, 4, 5, 4, 54, 9, 4, 5, com.google.common.base.Ascii.SI, 33, 4, 36, 1, com.google.common.base.Ascii.DC4, 1, 34, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.SO, 4, com.google.common.base.Ascii.FF, 5, 118, 110, 108, 117};
    }

    static {
        A0G();
        A0G = (int) (com.facebook.ads.redexgen.core.XX.A02 * 48.0f);
        A0H = com.facebook.ads.redexgen.core.XV.A0v;
        A0I = (int) (com.facebook.ads.redexgen.core.XX.A02 * 8.0f);
        A0K = (int) (com.facebook.ads.redexgen.core.XX.A02 * 56.0f);
        A0F = (int) (com.facebook.ads.redexgen.core.XX.A02 * 48.0f);
        A0J = (int) (com.facebook.ads.redexgen.core.XX.A02 * 12.0f);
    }

    public C4T(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.VA va, com.facebook.ads.redexgen.core.C1042Sx c1042Sx, com.facebook.ads.redexgen.core.InterfaceC1177Yh interfaceC1177Yh, com.facebook.ads.redexgen.core.AbstractC1801jd abstractC1801jd) {
        super(c1636gi, va, interfaceC1177Yh, abstractC1801jd);
        this.A0C = new com.facebook.ads.redexgen.core.Y2();
        if (abstractC1801jd instanceof com.facebook.ads.redexgen.core.C05117l) {
            super.A09 = true;
            super.A08 = new com.facebook.ads.redexgen.core.C1504ea(c1636gi, new com.facebook.ads.redexgen.core.MG(), this.A0D.A1G(), interfaceC1177Yh);
        }
        this.A04 = c1042Sx;
        if (android.os.Build.VERSION.SDK_INT >= 35) {
            setFitsSystemWindows(true);
        }
    }

    private int A00() {
        return A0K + A0G + (A0H * 4) + (this.A0D.A2Q() ? A0F : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x006b, code lost:
    
        if (r4.A06() == null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006d, code lost:
    
        r3.A0p().getCtaActionHelper().A07(new com.facebook.ads.redexgen.core.C0694Ff(r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x008e, code lost:
    
        if (r4.A06() == null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public com.facebook.ads.redexgen.core.EnumC0885Mq A02(java.lang.String str) {
        com.facebook.ads.redexgen.core.EnumC0885Mq enumC0885Mq = com.facebook.ads.redexgen.core.EnumC0885Mq.A09;
        if (this.A05 == null) {
            return enumC0885Mq;
        }
        com.facebook.ads.redexgen.core.C1J c1j = this.A05;
        com.facebook.ads.redexgen.core.C1706hr layoutManager = this.A05.getLayoutManager();
        java.lang.String[] strArr = A0E;
        if (strArr[5].charAt(30) == strArr[6].charAt(30)) {
            throw new java.lang.RuntimeException();
        }
        A0E[2] = "E32f1TaBN4dkj3FL0vDfikWnsbqL7SKY";
        com.facebook.ads.redexgen.core.FY fy = (com.facebook.ads.redexgen.core.FY) c1j.A1G(layoutManager.A25());
        if (fy != null && fy.A0p() != null) {
            enumC0885Mq = fy.A0p().A0E(str);
            com.facebook.ads.redexgen.core.C1315bV ctaActionHelper = fy.A0p().getCtaActionHelper();
            if (A0E[2].charAt(16) != '1') {
                java.lang.String[] strArr2 = A0E;
                strArr2[5] = "i7TFLIHedh0buU6tWLTqbZ60SXZT8zmg";
                strArr2[6] = "DCWE7AKb21kTTjPuFVubbU6pDlTglIBY";
            } else {
                java.lang.String[] strArr3 = A0E;
                strArr3[7] = "dI26cUvsILIVYWhCptAOIe9hx0G02LwU";
                strArr3[0] = "KP2PoUq36ksxZ0HlOf60WIRRhVJwRZXP";
            }
        }
        return enumC0885Mq;
    }

    private com.facebook.ads.redexgen.core.AbstractC1801jd A03(android.content.Intent intent) {
        if (super.A09) {
            return (com.facebook.ads.redexgen.core.AbstractC1801jd) intent.getSerializableExtra(A0E(14, 25, 103));
        }
        return (com.facebook.ads.redexgen.core.AbstractC1801jd) intent.getSerializableExtra(A0E(0, 14, 36));
    }

    private final void A0H() {
        if (this.A02 != null) {
            this.A02.removeAllViews();
            if (A0E[3].charAt(5) != 'n') {
                throw new java.lang.RuntimeException();
            }
            A0E[4] = "3JPxSaqJUpKyt95G35P4gQJAerHutmpA";
            this.A02 = null;
        }
        if (this.A05 != null) {
            this.A05.removeAllViews();
            this.A05.A1S();
            this.A05 = null;
        }
        if (this.A06 != null) {
            this.A06.removeAllViews();
            this.A06 = null;
        }
    }

    private final void A0I(int i, android.os.Bundle bundle) {
        int extraSpacing;
        int i2;
        int height;
        this.A02 = new android.widget.LinearLayout(getContext());
        if (i == 1) {
            this.A02.setGravity(17);
        } else {
            this.A02.setGravity(48);
        }
        this.A02.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-1, -1));
        this.A02.setOrientation(1);
        int i3 = com.facebook.ads.redexgen.core.XX.A04.widthPixels;
        int i4 = com.facebook.ads.redexgen.core.XX.A04.heightPixels;
        if (i == 1) {
            extraSpacing = java.lang.Math.min(i3 - (A0H * 4), i4 / 2);
            i2 = (i3 - extraSpacing) / 8;
            height = i2 * 4;
        } else {
            extraSpacing = i4 - A00();
            i2 = A0H;
            height = i2 * 2;
        }
        this.A08 = new com.facebook.ads.redexgen.core.C0695Fg(this);
        this.A09 = new com.facebook.ads.redexgen.core.C1581fp(this, 1, new java.lang.ref.WeakReference(this.A08), this.A0E);
        this.A09.A0W(this.A00);
        this.A09.A0X(this.A01);
        this.A05 = new com.facebook.ads.redexgen.core.C1J(this.A0E);
        this.A05.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-1, -2));
        this.A07 = new com.facebook.ads.redexgen.core.C0712Fy(this.A05, i, this.A0B, this.A09, bundle);
        int extraSpacing2 = i2;
        int childSpacing = extraSpacing;
        this.A05.setAdapter(new com.facebook.ads.redexgen.core.C0703Fp(this.A0E, this.A0B, this.A03, this.A0F, this.A04, this.A09, this.A0C, getAudienceNetworkListener(), this.A0A, childSpacing, extraSpacing2, height, i, this.A07, this.A0H));
        this.A05.A1h(this.A05.getOnScrollListener());
        if (i == 1) {
            A0K(this.A07);
        }
        this.A02.addView(this.A05);
        if (this.A06 != null) {
            this.A02.addView(this.A06);
        }
        if (com.facebook.ads.redexgen.core.C1086Up.A1z(this.A0E)) {
            this.A0E.A0B().AKn(this.A05, this.A0D.A2E(), false);
        }
        A0f(this.A02, false, i);
    }

    private void A0J(com.facebook.ads.redexgen.core.AbstractC1801jd abstractC1801jd) {
        this.A03 = abstractC1801jd;
        this.A0A = this.A03.A2E();
        this.A00 = this.A03.A0m();
        this.A01 = this.A03.A0n();
        java.util.List<com.facebook.ads.redexgen.core.NR> A2G = this.A03.A2G();
        java.util.List<com.facebook.ads.internal.adapters.datamodels.AdInfo> adInfoList = new java.util.ArrayList<>(A2G.size());
        this.A0B = adInfoList;
        for (int i = 0; i < A2G.size(); i++) {
            com.facebook.ads.redexgen.core.NR nr = A2G.get(i);
            java.util.List<com.facebook.ads.redexgen.core.C1474e5> list = this.A0B;
            int i2 = A2G.size();
            list.add(new com.facebook.ads.redexgen.core.C1474e5(i, i2, nr));
        }
    }

    private void A0K(com.facebook.ads.redexgen.core.C0712Fy c0712Fy) {
        new com.facebook.ads.redexgen.core.C7N().A0G(this.A05);
        c0712Fy.A0Y(new com.facebook.ads.redexgen.core.C0693Fe(this));
        this.A06 = new com.facebook.ads.redexgen.core.C1329bj(this.A0E, super.A07.A01(), this.A0B.size());
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-1, A0I);
        layoutParams.setMargins(0, A0J, 0, 0);
        this.A06.setLayoutParams(layoutParams);
    }

    @Override // com.facebook.ads.redexgen.core.PJ
    public final com.facebook.ads.redexgen.core.AbstractC1171Yb A0b() {
        return new com.facebook.ads.internal.view.FullScreenAdToolbar(this.A0E, getAudienceNetworkListener(), this.A0G, 0, this.A0D.A22(), false);
    }

    @Override // com.facebook.ads.redexgen.core.PJ
    public final void A0d() {
        com.facebook.ads.redexgen.core.EnumC0885Mq A02 = A02(A0E(39, 4, 2));
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
        com.facebook.ads.redexgen.core.AbstractC1801jd dataBundle = A03(intent);
        A0g(c0998Re);
        A0J(dataBundle);
        A0I(c0998Re.A05().getResources().getConfiguration().orientation, bundle);
        c0998Re.A0A(new com.facebook.ads.redexgen.core.C0692Fd(this, c0998Re));
        com.facebook.ads.redexgen.core.AbstractC1801jd dataBundle2 = this.A0D;
        int unskippableSec = dataBundle2.A29().A0H().A04();
        if (super.A09) {
            com.facebook.ads.redexgen.core.AbstractC1801jd dataBundle3 = this.A0D;
            unskippableSec = dataBundle3.A29().A0H().A03();
        }
        if (unskippableSec > 0) {
            A0e(unskippableSec);
        }
        com.facebook.ads.redexgen.core.AbstractC1801jd dataBundle4 = this.A0D;
        if (dataBundle4.A29().A0H().A02() >= 0) {
            this.A0H.setToolbarActionMode(8);
        }
        com.facebook.ads.redexgen.core.AbstractC1801jd dataBundle5 = this.A0D;
        if (dataBundle5.A2T()) {
            this.A0H.setOnClickListener(new com.facebook.ads.redexgen.core.ViewOnClickListenerC1478e9(this));
        }
    }

    @Override // com.facebook.ads.redexgen.core.PJ, com.facebook.ads.redexgen.core.InterfaceC1178Yi
    public final void AFA(boolean z) {
        super.AFA(z);
        if (this.A07 != null) {
            this.A07.A0Q();
        }
    }

    @Override // com.facebook.ads.redexgen.core.PJ, com.facebook.ads.redexgen.core.InterfaceC1178Yi
    public final void AFi(boolean z) {
        super.AFi(z);
        this.A07.A0R();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1178Yi
    public final void AIv(android.os.Bundle bundle) {
        if (this.A07 != null) {
            this.A07.A0W(bundle);
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
        A0H();
        A0I(configuration.orientation, bundle);
        super.onConfigurationChanged(configuration);
        if (android.os.Build.VERSION.SDK_INT >= 35) {
            setFitsSystemWindows(true);
        }
    }

    @Override // com.facebook.ads.redexgen.core.PJ, com.facebook.ads.redexgen.core.InterfaceC1178Yi
    public final void onDestroy() {
        super.onDestroy();
        if (com.facebook.ads.redexgen.core.C1086Up.A1z(this.A0E)) {
            this.A0E.A0B().AKU(this.A05);
        }
        if (!android.text.TextUtils.isEmpty(this.A0A)) {
            this.A0F.AB7(this.A0A, new com.facebook.ads.redexgen.core.C1293b9().A03(this.A09).A02(this.A0C).A05());
        }
        A0H();
        this.A09.A0V();
        this.A09 = null;
        this.A08 = null;
        this.A0B = null;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        this.A0C.A06(this.A0E, motionEvent, this, this);
        return super.onInterceptTouchEvent(motionEvent);
    }
}
