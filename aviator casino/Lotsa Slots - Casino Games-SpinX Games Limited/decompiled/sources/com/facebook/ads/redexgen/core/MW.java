package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class MW extends android.widget.RelativeLayout implements com.facebook.ads.redexgen.core.InterfaceC1178Yi {
    public static byte[] A0V;
    public static java.lang.String[] A0W = {"K2KQx5j", "I1DdEcIQOKACt5VfynDO8RkkSmVrIdSu", "CrPvtz5bwgp8q96Y41ywgNmdDqzXYyT", "BcZqlHBP86U0O", "mAAXLn1achaKS", "KDsASou", "qHjTnlroNJSmFEFt4pVmvH8neAK9EJVy", "ok9QX18270ZP2OGfEK6N7HjWUQBUEH7u"};
    public static final int A0X;
    public int A00;
    public com.facebook.ads.redexgen.core.C0998Re A01;
    public com.facebook.ads.redexgen.core.XO A02;
    public com.facebook.ads.redexgen.core.C1226a4 A03;
    public com.facebook.ads.redexgen.core.C1241aJ A04;
    public com.facebook.ads.redexgen.core.C1245aN A05;
    public com.facebook.ads.redexgen.core.C1311bR A06;
    public com.facebook.ads.redexgen.core.ViewOnClickListenerC0834Kr A07;
    public com.facebook.ads.redexgen.core.C1491eM A08;
    public com.facebook.ads.redexgen.core.C1497eS A09;
    public com.facebook.ads.redexgen.core.C1504ea A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public final android.os.Handler A0F;
    public final com.facebook.ads.redexgen.core.AbstractC1801jd A0G;
    public final com.facebook.ads.redexgen.core.C0908No A0H;
    public final com.facebook.ads.redexgen.core.InterfaceC1004Rk A0I;
    public final com.facebook.ads.redexgen.core.C1636gi A0J;
    public final com.facebook.ads.redexgen.core.VA A0K;
    public final com.facebook.ads.redexgen.core.VI A0L;
    public final com.facebook.ads.redexgen.core.XO A0M;
    public final com.facebook.ads.redexgen.core.ViewOnSystemUiVisibilityChangeListenerC1167Xx A0N;
    public final com.facebook.ads.redexgen.core.InterfaceC1177Yh A0O;
    public final com.facebook.ads.redexgen.core.ZU A0P;
    public final com.facebook.ads.redexgen.core.C1487eI A0Q;
    public final java.util.concurrent.atomic.AtomicBoolean A0R;
    public final java.util.concurrent.atomic.AtomicBoolean A0S;
    public final boolean A0T;
    public final com.facebook.ads.redexgen.core.AbstractC1171Yb A0U;

    public static java.lang.String A09(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A0V, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 44);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A0P() {
        A0V = new byte[]{-81, -72, -75, -81, -73, -85, -69, -66, -75, -77, -75, -70, -99, -90, -93, -99, -91, -103, -83, -87, -81, -84, -99, -97, -7, -20, -1, -12, 1, -16, -22, -18, -9, -12, -18, -10, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.DC4, 9, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.FS, -18, -26, -28, -21, 3, -15, -18, 2, -11, -15, 3, -21, -17, -8, -11, -17, -9};
    }

    static {
        A0P();
        A0X = com.facebook.ads.redexgen.core.XV.A03;
    }

    public MW(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.VA va, com.facebook.ads.redexgen.core.InterfaceC1177Yh interfaceC1177Yh, com.facebook.ads.redexgen.core.AbstractC1801jd abstractC1801jd, com.facebook.ads.redexgen.core.C0908No c0908No, java.lang.String str, com.facebook.ads.redexgen.core.ZU zu) {
        super(c1636gi);
        this.A0C = false;
        this.A0B = false;
        this.A0F = new android.os.Handler(android.os.Looper.getMainLooper());
        this.A0R = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.A0D = false;
        this.A0S = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.A0I = new com.facebook.ads.redexgen.core.C0881Mm(this);
        this.A0J = c1636gi;
        this.A0K = va;
        this.A0O = interfaceC1177Yh;
        this.A0G = abstractC1801jd;
        this.A0H = c0908No;
        this.A0P = zu;
        this.A0L = new com.facebook.ads.redexgen.core.VI(this.A0G.A2E(), this.A0K);
        this.A0A = new com.facebook.ads.redexgen.core.C1504ea(c1636gi, this.A0P, str, this.A0O);
        com.facebook.ads.redexgen.core.C0881Mm c0881Mm = null;
        this.A0M = new com.facebook.ads.redexgen.core.XO(this.A0H.A0C(), new com.facebook.ads.redexgen.core.C0870Mb(this, c0881Mm));
        this.A0T = this.A0G.A1v();
        setBackgroundColor(androidx.core.view.ViewCompat.MEASURED_STATE_MASK);
        this.A00 = getResources().getConfiguration().orientation;
        this.A0N = new com.facebook.ads.redexgen.core.ViewOnSystemUiVisibilityChangeListenerC1167Xx(this);
        this.A0N.A05(com.facebook.ads.redexgen.core.EnumC1166Xw.A03);
        com.facebook.ads.redexgen.core.C0869Ma c0869Ma = new com.facebook.ads.redexgen.core.C0869Ma(this, c0881Mm);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(A09(36, 9, 124), this.A0P.A8l());
        this.A0Q = new com.facebook.ads.redexgen.core.C1487eI(this.A0J, this.A0G, this.A0H, this.A0K, c0869Ma, hashMap);
        this.A0U = A04();
        this.A07 = A06();
        this.A0O.A45(this, new android.widget.RelativeLayout.LayoutParams(-1, -1));
        A0M();
        if (!this.A0H.A0b()) {
            A0b();
        }
    }

    private com.facebook.ads.redexgen.core.PU A04() {
        com.facebook.ads.redexgen.core.PU pu = new com.facebook.ads.redexgen.core.PU(this.A0J, this.A0G, 4);
        pu.setToolbarListener(new com.facebook.ads.redexgen.core.InterfaceC1170Ya() { // from class: com.facebook.ads.redexgen.X.NB
            @Override // com.facebook.ads.redexgen.core.InterfaceC1170Ya
            public final void ACl(com.facebook.ads.redexgen.core.AbstractC1171Yb abstractC1171Yb) {
                com.facebook.ads.redexgen.core.MW.this.A0d(abstractC1171Yb);
            }
        });
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(com.facebook.ads.redexgen.core.XV.A00, com.facebook.ads.redexgen.core.XV.A0N, com.facebook.ads.redexgen.core.XV.A00, com.facebook.ads.redexgen.core.XV.A00);
        pu.setLayoutParams(layoutParams);
        return pu;
    }

    private com.facebook.ads.redexgen.core.ViewOnClickListenerC0834Kr A06() {
        if (this.A0Q != null) {
            com.facebook.ads.redexgen.core.C1487eI c1487eI = this.A0Q;
            if (A0W[1].charAt(5) != 'c') {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A0W;
            strArr[5] = "DwrRGPH";
            strArr[0] = "aRDWSvq";
            if (c1487eI.getViewabilityChecker() != null && this.A0Q.getTouchDataRecorder() != null) {
                com.facebook.ads.redexgen.core.ViewOnClickListenerC0834Kr viewOnClickListenerC0834Kr = new com.facebook.ads.redexgen.core.ViewOnClickListenerC0834Kr(this.A0J, this.A0P.A7M(), this.A0G.A28().A01(), this.A0K, this.A0O, this.A0Q.getViewabilityChecker(), this.A0Q.getTouchDataRecorder(), this.A0G.A2A());
                viewOnClickListenerC0834Kr.setCta(this.A0G.A29().A0J(), this.A0G.A2E(), new java.util.HashMap(), null);
                viewOnClickListenerC0834Kr.setText(this.A0H.A0M());
                viewOnClickListenerC0834Kr.A0D();
                viewOnClickListenerC0834Kr.setTextSize(13.0f);
                viewOnClickListenerC0834Kr.setPadding(com.facebook.ads.redexgen.core.XV.A0D, com.facebook.ads.redexgen.core.XV.A00, com.facebook.ads.redexgen.core.XV.A0D, com.facebook.ads.redexgen.core.XV.A00);
                com.facebook.ads.redexgen.core.YB.A0P(viewOnClickListenerC0834Kr, -15902766, A0X);
                viewOnClickListenerC0834Kr.setElevation(0.0f);
                viewOnClickListenerC0834Kr.setStateListAnimator(null);
                viewOnClickListenerC0834Kr.setOutlineProvider(null);
                viewOnClickListenerC0834Kr.setOnClickListener(new com.facebook.ads.redexgen.core.ZA(this));
                return viewOnClickListenerC0834Kr;
            }
        }
        return null;
    }

    private void A0C() {
        this.A0U.setToolbarActionMode(2);
        this.A0D = true;
        this.A0L.A04(com.facebook.ads.redexgen.core.VH.A0Y, null);
        this.A0J.A0F().AFE();
        if (com.facebook.ads.redexgen.core.C1086Up.A1H(this.A0J)) {
            boolean z = this.A0T;
            if (A0W[2].length() == 32) {
                throw new java.lang.RuntimeException();
            }
            A0W[6] = "k4geMuTXC1h9ucfhhM9HvzcpXwlG9hvy";
            if (z) {
                A0N();
                if (this.A0G.A29().A0S()) {
                    this.A0A.A06();
                    this.A0O.A4k(this.A0P.A6l(), new com.facebook.ads.redexgen.core.C4K(0, 0));
                }
            }
        }
        A0V(false, A09(45, 4, 79));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0D() {
        this.A0E = true;
        if (this.A0G.A29().A0S()) {
            this.A0A.A06();
            this.A0O.A4k(this.A0P.A6l(), new com.facebook.ads.redexgen.core.C4K(0, 0));
        }
    }

    private void A0E() {
        if (this.A03 == null) {
            return;
        }
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(21);
        layoutParams.addRule(12);
        layoutParams.setMargins(com.facebook.ads.redexgen.core.XV.A00, com.facebook.ads.redexgen.core.XV.A00, com.facebook.ads.redexgen.core.XV.A0F, com.facebook.ads.redexgen.core.XV.A00);
        this.A03.setLayoutParams(layoutParams);
    }

    private void A0F() {
        if (this.A04 == null) {
            return;
        }
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(21);
        layoutParams.addRule(12);
        layoutParams.setMargins(com.facebook.ads.redexgen.core.XV.A00, com.facebook.ads.redexgen.core.XV.A00, com.facebook.ads.redexgen.core.XV.A09, com.facebook.ads.redexgen.core.XV.A09);
        this.A04.setLayoutParams(layoutParams);
    }

    private void A0G() {
        if (this.A05 != null) {
            android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(20);
            layoutParams.addRule(12);
            layoutParams.setMargins(com.facebook.ads.redexgen.core.XV.A09, com.facebook.ads.redexgen.core.XV.A00, com.facebook.ads.redexgen.core.XV.A00, com.facebook.ads.redexgen.core.XV.A09);
            this.A05.setLayoutParams(layoutParams);
        }
    }

    private void A0H() {
        this.A03 = new com.facebook.ads.redexgen.core.C1226a4(this.A0J, this.A0G, null, this.A0O);
        A0E();
        addView(this.A03);
    }

    private void A0I() {
        if (this.A0G.A2W()) {
            A0L();
        }
        if (this.A0G.A2M()) {
            A0K();
        } else {
            A0H();
        }
    }

    private void A0J() {
        if (this.A07 == null) {
            return;
        }
        setClipChildren(false);
        this.A06 = new com.facebook.ads.redexgen.core.C1311bR(this.A0J, this.A0G, this.A07, this.A0H.A0B(), this.A0H.A0Z());
        A0Q(this.A00);
        addView(this.A06);
    }

    private void A0K() {
        this.A04 = com.facebook.ads.redexgen.core.AbstractC1246aO.A01(this.A0J, false, this.A0G, this.A0L, this.A0O, com.facebook.ads.redexgen.core.EnumC1244aM.A03, com.facebook.ads.redexgen.core.AbstractC1243aL.A00(this.A0G));
        A0F();
        addView(this.A04);
    }

    private void A0L() {
        this.A05 = com.facebook.ads.redexgen.core.AbstractC1246aO.A02(this.A0J, com.facebook.ads.redexgen.core.EnumC1244aM.A03, this.A0G);
        this.A05.setBackgroundColor(-2145637581);
        A0G();
        addView(this.A05);
    }

    private void A0M() {
        this.A0U.setVisibility(4);
        com.facebook.ads.redexgen.core.YB.A0K(this.A0U);
        this.A0Q.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-1, -1));
        A0R(this.A00);
        addView(this.A0Q);
        addView(this.A0U);
        if (this.A0H.A0a()) {
            A0J();
        }
        A0I();
        if (!this.A0H.A0Y()) {
            boolean A0b = this.A0H.A0b();
            if (A0W[1].charAt(5) != 'c') {
                throw new java.lang.RuntimeException();
            }
            A0W[7] = "XlBnGmRHSm8FPKQHD6bIB4zK3mUoDq5y";
            if (!A0b) {
                this.A0Q.setVisibility(4);
                return;
            }
        }
        setVisibility(4);
        this.A0Q.A0C();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0N() {
        if (this.A0G.A2M() && this.A04 != null) {
            this.A04.A0P();
            if (this.A0G.A2U()) {
                com.facebook.ads.redexgen.core.AbstractC1243aL.A04(this.A0J, com.facebook.ads.redexgen.core.EnumC1244aM.A02);
            } else {
                com.facebook.ads.redexgen.core.AbstractC1243aL.A05(this.A0J, com.facebook.ads.redexgen.core.EnumC1244aM.A02);
            }
        }
        if (this.A0G.A2W() && this.A05 != null) {
            com.facebook.ads.redexgen.core.AbstractC1243aL.A06(this.A0J, com.facebook.ads.redexgen.core.EnumC1244aM.A02);
        }
        this.A0L.A04(com.facebook.ads.redexgen.core.VH.A0z, null);
        if (this.A07 != null) {
            this.A07.setText(this.A0G.A29().A0J().A04());
        }
        if (!this.A0G.A29().A0K().A02().isEmpty()) {
            this.A09 = new com.facebook.ads.redexgen.core.C1497eS(this.A0J, this.A0G, this.A0O, this.A07, this.A0F, this.A0L);
            addView(this.A09.A0W(), new android.widget.RelativeLayout.LayoutParams(-1, -1));
            com.facebook.ads.redexgen.core.YB.A0d(this.A0U);
        } else {
            this.A08 = new com.facebook.ads.redexgen.core.C1491eM(this.A0J, this.A0K, this.A0G);
            android.util.Pair<com.facebook.ads.redexgen.core.EnumC1490eL, android.view.View> A03 = this.A08.A03(this.A07);
            com.facebook.ads.redexgen.core.AbstractC1337br.A00(this.A0J, this, this.A0G.A29().A0H().A08());
            addView((android.view.View) A03.second, new android.widget.RelativeLayout.LayoutParams(-1, -1));
            long A00 = this.A0G.A29().A0K().A00();
            if (A00 > 0) {
                this.A0F.postDelayed(new java.lang.Runnable() { // from class: com.facebook.ads.redexgen.X.Z9
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.facebook.ads.redexgen.core.MW.this.A0c();
                    }
                }, A00);
            } else {
                com.facebook.ads.redexgen.core.AbstractC1171Yb abstractC1171Yb = this.A0U;
                java.lang.String[] strArr = A0W;
                if (strArr[5].length() != strArr[0].length()) {
                    throw new java.lang.RuntimeException();
                }
                A0W[3] = "dsmu";
                abstractC1171Yb.setToolbarActionMode(0);
            }
        }
        com.facebook.ads.redexgen.core.YB.A0d(this.A0Q);
        this.A0R.set(true);
    }

    private void A0O() {
        final com.facebook.ads.redexgen.core.C1465dw c1465dw = new com.facebook.ads.redexgen.core.C1465dw(this.A0J, this.A0G);
        addView(c1465dw, new android.widget.RelativeLayout.LayoutParams(-1, -1));
        this.A0F.postDelayed(new java.lang.Runnable() { // from class: com.facebook.ads.redexgen.X.Z8
            @Override // java.lang.Runnable
            public final void run() {
                com.facebook.ads.redexgen.core.MW.this.A0e(c1465dw);
            }
        }, this.A0H.A0D());
    }

    private void A0Q(int i) {
        if (this.A06 == null) {
            return;
        }
        this.A06.A0I(i);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        if (i == 2) {
            int i2 = com.facebook.ads.redexgen.core.XV.A00;
            if (A0W[4].length() == 25) {
                throw new java.lang.RuntimeException();
            }
            A0W[2] = "3KWOojhtbTrcKNejqW7";
            layoutParams.setMargins(i2, com.facebook.ads.redexgen.core.XV.A00, com.facebook.ads.redexgen.core.XV.A00, com.facebook.ads.redexgen.core.XV.A05);
        } else {
            layoutParams.setMargins(com.facebook.ads.redexgen.core.XV.A00, com.facebook.ads.redexgen.core.XV.A00, com.facebook.ads.redexgen.core.XV.A00, com.facebook.ads.redexgen.core.XV.A0N);
        }
        layoutParams.addRule(12);
        layoutParams.addRule(14);
        this.A06.setLayoutParams(layoutParams);
    }

    private void A0R(int i) {
        if (i == 2) {
            this.A0Q.setPadding(com.facebook.ads.redexgen.core.XV.A01, com.facebook.ads.redexgen.core.XV.A01, com.facebook.ads.redexgen.core.XV.A01, com.facebook.ads.redexgen.core.XV.A01);
            return;
        }
        com.facebook.ads.redexgen.core.C1487eI c1487eI = this.A0Q;
        int i2 = com.facebook.ads.redexgen.core.XV.A00;
        if (A0W[7].charAt(28) == 'Z') {
            throw new java.lang.RuntimeException();
        }
        A0W[3] = "dtYS90IKRfB1L";
        c1487eI.setPadding(i2, com.facebook.ads.redexgen.core.XV.A00, com.facebook.ads.redexgen.core.XV.A00, com.facebook.ads.redexgen.core.XV.A00);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0V(boolean z, java.lang.String str) {
        this.A0C = true;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(A09(0, 12, 32), z ? A09(49, 13, 96) : A09(24, 12, 95));
        hashMap.put(A09(12, 12, 14), str);
        new com.facebook.ads.redexgen.core.C1315bV(this.A0J, this.A0P.A7M(), this.A0Q.getViewabilityChecker(), this.A0Q.getTouchDataRecorder(), this.A0K, this.A0G.A2A(), this.A0O).A05(this.A0G.A2E(), this.A0G.A29().A0J().A05(), hashMap);
    }

    public final void A0b() {
        if (this.A0H.A0Y() || this.A0H.A0b()) {
            setVisibility(0);
            this.A0Q.A0E(0);
            AFi(false);
            if (this.A0S.get()) {
                A0N();
            }
        } else {
            this.A0Q.A0C();
            this.A0Q.setVisibility(0);
            this.A0M.A07();
        }
        if (this.A0H.A0W()) {
            A0O();
        }
        if (this.A06 != null) {
            this.A06.A0E();
        }
        this.A0U.setVisibility(0);
        if (this.A07 != null && this.A0G.A25() > 0 && this.A02 == null) {
            this.A02 = new com.facebook.ads.redexgen.core.XO(this.A0G.A25(), new com.facebook.ads.redexgen.core.C0871Mc(this));
            this.A02.A07();
        }
    }

    public final /* synthetic */ void A0c() {
        this.A0U.setToolbarActionMode(0);
    }

    public final /* synthetic */ void A0d(com.facebook.ads.redexgen.core.AbstractC1171Yb abstractC1171Yb) {
        if (this.A0H.A0A() > 0 && abstractC1171Yb.getToolbarActionMode() == 8) {
            A0C();
            return;
        }
        if (abstractC1171Yb.getToolbarActionMode() != 0 && this.A0H.A0V() && !this.A0R.get()) {
            abstractC1171Yb.setToolbarActionMode(2);
            A0N();
        } else {
            this.A0L.A04(com.facebook.ads.redexgen.core.VH.A07, null);
            this.A0J.A0F().AB0();
            this.A0O.A4j(this.A0P.A7w());
        }
    }

    public final /* synthetic */ void A0e(com.facebook.ads.redexgen.core.C1465dw c1465dw) {
        removeView(c1465dw);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1178Yi
    public final void AAu(android.content.Intent intent, android.os.Bundle bundle, com.facebook.ads.redexgen.core.C0998Re c0998Re) {
        this.A01 = c0998Re;
        c0998Re.A0A(this.A0I);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1178Yi
    public final void AFA(boolean z) {
        this.A0M.A06();
        this.A0B = true;
        if (this.A06 != null) {
            this.A06.A0G();
        }
        if (this.A04 != null) {
            this.A04.A0P();
        } else {
            if (this.A03 == null) {
                return;
            }
            this.A03.A05();
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1178Yi
    public final void AFi(boolean z) {
        this.A0M.A07();
        if (this.A06 != null) {
            this.A06.A0H();
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1178Yi
    public final void AIv(android.os.Bundle bundle) {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1178Yi
    public java.lang.String getCurrentClientToken() {
        return A09(0, 0, 117);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1178Yi
    public final boolean onActivityResult(int i, int i2, android.content.Intent intent) {
        if (i == 945321098 && this.A0D && !this.A0R.get()) {
            this.A0L.A04(com.facebook.ads.redexgen.core.VH.A07, null);
            this.A0O.A4j(this.A0P.A7w());
            return false;
        }
        return false;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        A0R(configuration.orientation);
        A0Q(configuration.orientation);
        if (this.A09 != null) {
            this.A09.A0a(configuration.orientation);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1178Yi
    public final void onDestroy() {
        this.A0N.A03();
        if (this.A01 != null) {
            this.A01.A0B(this.A0I);
        }
        if (this.A06 != null) {
            this.A06.A0F();
        }
        if (this.A0Q != null) {
            if (!android.text.TextUtils.isEmpty(this.A0G.A2E())) {
                this.A0K.AB7(this.A0G.A2E(), new com.facebook.ads.redexgen.core.C1293b9().A03(this.A0Q.getViewabilityChecker()).A02(this.A0Q.getTouchDataRecorder()).A05());
            }
            this.A0Q.A0D();
        }
        if (this.A04 != null) {
            this.A04.A0O();
        } else if (this.A03 != null) {
            this.A03.A04();
        }
        this.A0M.A06();
        com.facebook.ads.redexgen.core.AbstractC1171Yb abstractC1171Yb = this.A0U;
        if (A0W[1].charAt(5) != 'c') {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr = A0W;
        strArr[5] = "SgQ0Vce";
        strArr[0] = "JIQdJaY";
        abstractC1171Yb.setToolbarListener(null);
        this.A0F.removeCallbacksAndMessages(null);
    }

    public void setListener(com.facebook.ads.redexgen.core.InterfaceC1177Yh interfaceC1177Yh) {
    }
}
