package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.5F, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class C5F extends com.facebook.ads.redexgen.core.AbstractC0775Ij {
    public static byte[] A0o;
    public static java.lang.String[] A0p = {"uilIZmuHzpP0N9Y8quer6Kb2u", "9UUD4l8CpJqeXgkdEQyriIYmJbPiqOP7", "EZE4mnuFogdbCIqsVVCLHtYnmK0aZj", "syebs7ncPc1rj4O1rMWtVdBIydy8e5", "8mpGklwdfsm8yo", "l0wQPHeYLTHnG4", "V5rJxyMt8frjvUGIYtzHbFROecFIJypl", "I99F1f62ejGluaFUQtWt4OKUQ"};
    public static final int A0q;
    public static final int A0r;
    public static final int A0s;
    public static final int A0t;
    public static final int A0u;
    public static final int A0v;
    public static final int A0w;
    public static final int A0x;
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public android.os.Handler A08;
    public android.view.inputmethod.InputMethodManager A09;
    public android.widget.LinearLayout A0A;
    public android.widget.LinearLayout A0B;
    public android.widget.TextView A0C;
    public com.facebook.ads.redexgen.core.C0894Na A0D;
    public com.facebook.ads.redexgen.core.M6 A0E;
    public com.facebook.ads.redexgen.core.C1265ah A0F;
    public com.facebook.ads.redexgen.core.M3 A0G;
    public com.facebook.ads.redexgen.core.C1385cd A0H;
    public com.facebook.ads.redexgen.core.EnumC1523et A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public final int A0U;
    public final com.facebook.ads.redexgen.core.AbstractC0888Mt A0V;
    public final com.facebook.ads.redexgen.core.C1636gi A0W;
    public final com.facebook.ads.redexgen.core.VI A0X;
    public final com.facebook.ads.redexgen.core.AbstractC1171Yb A0Y;
    public final com.facebook.ads.redexgen.core.InterfaceC1456dm A0Z;
    public final com.facebook.ads.redexgen.core.C0683Eu A0a;
    public final com.facebook.ads.redexgen.core.C0673Ek A0b;
    public final com.facebook.ads.redexgen.core.C4L A0c;
    public final com.facebook.ads.redexgen.core.EA A0d;
    public final com.facebook.ads.redexgen.core.E8 A0e;
    public final com.facebook.ads.redexgen.core.E4 A0f;
    public final com.facebook.ads.redexgen.core.E2 A0g;
    public final com.facebook.ads.redexgen.core.E0 A0h;
    public final com.facebook.ads.redexgen.core.AbstractC0662Dz A0i;
    public final com.facebook.ads.redexgen.core.C0642Df A0j;
    public final com.facebook.ads.redexgen.core.DZ A0k;
    public final java.lang.Runnable A0l;
    public final boolean A0m;
    public final boolean A0n;

    public static java.lang.String A0L(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A0o, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 55);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A0X() {
        byte[] bArr = {-15, -6, -9, -15, -7, -19, 1, -3, 3, 0, -15, -13, -68, -63, -61, -56, -57, -78, -64, -72, -57, -69, -62, -73, -26, -28, -42, -29, -44, -35, -38, -44, -36, -48, -41, -38, -35, -27, -42, -29, -42, -43, -40, -54, -49, -59, -48, -40, 47};
        java.lang.String[] strArr = A0p;
        if (strArr[4].length() != strArr[5].length()) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A0p;
        strArr2[4] = "nVqp18ph7ekHb6";
        strArr2[5] = "wg1nH4uIQgdKmM";
        A0o = bArr;
    }

    static {
        A0X();
        A0q = (int) (com.facebook.ads.redexgen.core.XX.A02 * 4.0f);
        A0r = (int) (com.facebook.ads.redexgen.core.XX.A02 * 8.0f);
        A0s = com.facebook.ads.redexgen.core.P3.A02(-1, 77);
        A0w = (int) (com.facebook.ads.redexgen.core.XX.A02 * 26.0f);
        A0x = (int) (com.facebook.ads.redexgen.core.XX.A02 * 12.0f);
        A0u = (int) (com.facebook.ads.redexgen.core.XX.A02 * 12.0f);
        A0v = (int) (com.facebook.ads.redexgen.core.XX.A02 * 44.0f);
        A0t = com.facebook.ads.redexgen.core.XV.A0v;
    }

    public C5F(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.VA va, com.facebook.ads.redexgen.core.AbstractC1171Yb abstractC1171Yb, com.facebook.ads.redexgen.core.AbstractC1801jd abstractC1801jd, com.facebook.ads.redexgen.core.C1042Sx c1042Sx, com.facebook.ads.redexgen.core.ZU zu, int i, com.facebook.ads.redexgen.core.InterfaceC1177Yh interfaceC1177Yh, com.facebook.ads.redexgen.core.VI vi, int i2, boolean z, boolean z2, com.facebook.ads.redexgen.core.InterfaceC1456dm interfaceC1456dm, int i3, int i4) {
        super(c1636gi, zu, va, abstractC1801jd, i, z, z2, interfaceC1177Yh, i4);
        com.facebook.ads.redexgen.core.C0894Na A00;
        this.A03 = 0;
        this.A0J = false;
        this.A0Q = false;
        this.A0N = false;
        this.A0P = false;
        this.A0O = false;
        this.A0M = false;
        this.A07 = 0;
        this.A02 = 0;
        this.A0R = true;
        this.A0l = new com.facebook.ads.redexgen.core.RunnableC1441dX(this);
        this.A0L = false;
        this.A0T = false;
        this.A01 = 0.0f;
        this.A0h = new com.facebook.ads.redexgen.core.E0() { // from class: com.facebook.ads.redexgen.X.5R
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.UN
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(com.facebook.ads.redexgen.core.E1 e1) {
                com.facebook.ads.redexgen.core.C5F.this.A0T = true;
            }
        };
        this.A0g = new com.facebook.ads.redexgen.core.E2() { // from class: com.facebook.ads.redexgen.X.5P
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.UN
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(com.facebook.ads.redexgen.core.E3 e3) {
                if (!((com.facebook.ads.redexgen.core.AbstractC0775Ij) com.facebook.ads.redexgen.core.C5F.this).A0A.A07()) {
                    com.facebook.ads.redexgen.core.C5F.this.A1F();
                }
            }
        };
        this.A0f = new com.facebook.ads.redexgen.core.E4() { // from class: com.facebook.ads.redexgen.X.5M
            @Override // com.facebook.ads.redexgen.core.UN
            public final /* bridge */ /* synthetic */ void A03(com.facebook.ads.redexgen.core.C4B c4b) {
            }
        };
        this.A0i = new com.facebook.ads.redexgen.core.AbstractC0662Dz() { // from class: com.facebook.ads.redexgen.X.5K
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.UN
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(com.facebook.ads.redexgen.core.C4A c4a) {
                float f;
                com.facebook.ads.redexgen.core.C0673Ek c0673Ek;
                com.facebook.ads.redexgen.core.InterfaceC1456dm interfaceC1456dm2;
                com.facebook.ads.redexgen.core.C5F.this.A0f(c4a);
                f = com.facebook.ads.redexgen.core.C5F.this.A01;
                c0673Ek = com.facebook.ads.redexgen.core.C5F.this.A0b;
                float duration = (f * c0673Ek.getDuration()) + c4a.A00();
                interfaceC1456dm2 = com.facebook.ads.redexgen.core.C5F.this.A0Z;
                interfaceC1456dm2.ADw(duration);
            }
        };
        this.A0d = new com.facebook.ads.redexgen.core.EA() { // from class: com.facebook.ads.redexgen.X.5J
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.UN
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(com.facebook.ads.redexgen.core.C4K c4k) {
                com.facebook.ads.redexgen.core.InterfaceC1456dm interfaceC1456dm2;
                com.facebook.ads.redexgen.core.C0673Ek c0673Ek;
                com.facebook.ads.redexgen.core.C0673Ek c0673Ek2;
                interfaceC1456dm2 = com.facebook.ads.redexgen.core.C5F.this.A0Z;
                c0673Ek = com.facebook.ads.redexgen.core.C5F.this.A0b;
                interfaceC1456dm2.ADc(c0673Ek.getDuration());
                com.facebook.ads.redexgen.core.C5F.A03(com.facebook.ads.redexgen.core.C5F.this, 1.0f);
                c0673Ek2 = com.facebook.ads.redexgen.core.C5F.this.A0b;
                c0673Ek2.A0e(com.facebook.ads.redexgen.core.EnumC1523et.A02, 28);
            }
        };
        this.A0e = new com.facebook.ads.redexgen.core.C5G(this);
        this.A0Y = abstractC1171Yb;
        this.A0U = i3;
        this.A08 = new android.os.Handler(android.os.Looper.getMainLooper());
        this.A09 = (android.view.inputmethod.InputMethodManager) c1636gi.getSystemService(A0L(12, 12, 28));
        this.A0V = com.facebook.ads.redexgen.core.C0889Mu.A01(c1636gi, va, abstractC1801jd.A2E(), com.facebook.ads.redexgen.core.XB.A00(abstractC1801jd.A29().A0J().A05()), new java.util.HashMap(), false, true, abstractC1801jd.A2A());
        this.A0W = c1636gi;
        this.A0X = vi;
        this.A0j = new com.facebook.ads.redexgen.core.C0642Df(this.A0W, this.A0X);
        this.A0k = new com.facebook.ads.redexgen.core.DZ(this.A0W, -1);
        this.A0Z = interfaceC1456dm;
        if (i2 == 1) {
            A00 = super.A06.A28().A01();
        } else {
            A00 = super.A06.A28().A00();
        }
        this.A0D = A00;
        this.A0b = new com.facebook.ads.redexgen.core.C0673Ek(this.A0W);
        this.A0b.getEventBus().A03(this.A0h, this.A0g, this.A0f, this.A0i, this.A0d, this.A0e);
        this.A0c = new com.facebook.ads.redexgen.core.C4L(c1636gi, va, this.A0b, abstractC1801jd.A2E());
        A0U();
        java.lang.String videoUrl = super.A06.A29().A0H().A09();
        this.A0b.setVideoURI(c1042Sx.A0T(videoUrl));
        A0R();
        A0O();
        A0N();
        com.facebook.ads.redexgen.core.C1636gi c1636gi2 = this.A0W;
        java.lang.String videoUrl2 = abstractC1801jd.A29().A0H().A08();
        com.facebook.ads.redexgen.core.AbstractC1337br.A00(c1636gi2, this, videoUrl2);
        setupLayoutConfiguration(false);
        A0T();
        A0S();
        postDelayed(new com.facebook.ads.redexgen.core.C0758Hs(this), 1000L);
        if (com.facebook.ads.redexgen.core.C1086Up.A1z(this.A0W)) {
            com.facebook.ads.redexgen.core.VM A0B = this.A0W.A0B();
            com.facebook.ads.redexgen.core.C0673Ek c0673Ek = this.A0b;
            java.lang.String videoUrl3 = super.A06.A2E();
            A0B.AKn(c0673Ek, videoUrl3, true);
        }
        if (com.facebook.ads.redexgen.core.C1086Up.A20(this.A0W)) {
            this.A0a = new com.facebook.ads.redexgen.core.C0683Eu(this.A0W, va, this.A0b, super.A06.A2E(), false, this.A0c, null);
        } else {
            this.A0a = null;
        }
        A0Y(abstractC1801jd.A29());
        this.A0m = super.A06.A1m();
        this.A0n = super.A06.A1z();
        c1636gi.A0F().ACI(this.A0m, this.A0n, true);
    }

    public static /* synthetic */ float A03(com.facebook.ads.redexgen.core.C5F c5f, float f) {
        float f2 = c5f.A01 + f;
        c5f.A01 = f2;
        return f2;
    }

    public static /* synthetic */ int A05(com.facebook.ads.redexgen.core.C5F c5f) {
        int i = c5f.A02;
        c5f.A02 = i + 1;
        return i;
    }

    public static /* synthetic */ int A07(com.facebook.ads.redexgen.core.C5F c5f) {
        int i = c5f.A07;
        c5f.A07 = i + 1;
        return i;
    }

    private void A0M() {
        com.facebook.ads.redexgen.core.YB.A0J(this.A0B);
        this.A0B = new android.widget.LinearLayout(this.A0W);
        com.facebook.ads.redexgen.core.YB.A0U(this.A0B, this.A0W);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, this.A0J ? this.A04 / 4 : this.A04 / 5);
        layoutParams.addRule(12);
        this.A0B.setLayoutParams(layoutParams);
        addView(this.A0B, 2);
    }

    private void A0N() {
        this.A0k.A08(-1, A0s, false);
        this.A0k.setPadding(A0x, A0x, A0x, A0x);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, A0w);
        layoutParams.addRule(12);
        addView(this.A0k, layoutParams);
    }

    private void A0O() {
        this.A0j.setPadding(A0u, A0u, A0u, A0u);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(A0v, A0v);
        layoutParams.setMargins(0, com.facebook.ads.redexgen.core.AbstractC1171Yb.A00, A0t, 0);
        layoutParams.addRule(11);
        layoutParams.addRule(10);
        android.view.ViewGroup.LayoutParams videoViewParams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        addView(this.A0b, videoViewParams);
        addView(this.A0j, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0P() {
        if (super.A06.A1e() && this.A0L) {
            this.A0L = false;
            A0h(A0L(24, 18, 58));
        }
    }

    private void A0Q() {
        if (super.A06.A1e() && this.A0L) {
            this.A0L = false;
            java.util.Map<java.lang.String, java.lang.String> A05 = new com.facebook.ads.redexgen.core.C1293b9().A03(null).A02(null).A05();
            A05.put(A0L(0, 12, 87), A0L(24, 18, 58));
            super.A08.AB6(super.A06.A2E(), A05);
        }
    }

    private void A0R() {
        postDelayed(new com.facebook.ads.redexgen.core.C0761Hv(this), com.facebook.ads.redexgen.core.C1086Up.A0P(this.A0W));
    }

    private void A0S() {
        com.facebook.ads.redexgen.core.YB.A0J(this.A0A);
        this.A0A = new android.widget.LinearLayout(this.A0W);
        this.A0A.setOrientation(1);
        com.facebook.ads.redexgen.core.YB.A0K(this.A0A);
        A0V();
        this.A0A.setBackgroundColor(-1);
        addView(this.A0A);
    }

    private void A0T() {
        android.view.View view = this.A0b;
        if (super.A06.A1e()) {
            view.setOnClickListener(new com.facebook.ads.redexgen.core.ViewOnClickListenerC1443dZ(this));
        }
        com.facebook.ads.redexgen.core.YB.A0J(view);
        com.facebook.ads.redexgen.core.YB.A0K(view);
        android.widget.RelativeLayout.LayoutParams mediaLayoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        mediaLayoutParams.addRule(15);
        addView(view, 1, mediaLayoutParams);
        this.A0C = new android.widget.TextView(this.A0W);
        android.view.View mMediaView = this.A0C;
        com.facebook.ads.redexgen.core.YB.A0K(mMediaView);
        this.A0C.setGravity(17);
        this.A0C.setTextColor(getColors().A06(true));
        this.A0C.setEllipsize(android.text.TextUtils.TruncateAt.END);
        this.A0C.setMaxLines(2);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12);
        layoutParams.setMargins(A0r, A0r / 2, A0r, A0w);
        android.view.View mMediaView2 = this.A0C;
        addView(mMediaView2, layoutParams);
        android.view.View mMediaView3 = this.A0C;
        com.facebook.ads.redexgen.core.YB.A0K(mMediaView3);
        this.A0H = new com.facebook.ads.redexgen.core.C1385cd(this.A0W, null, super.A06, super.A08, super.A0B, super.A0D, super.A0A, getColors(), new com.facebook.ads.redexgen.core.I4(this));
        android.view.View mMediaView4 = this.A0H;
        com.facebook.ads.redexgen.core.YB.A0G(1001, mMediaView4);
        android.view.View mMediaView5 = this.A0H;
        addView(mMediaView5);
        A0W();
        A0M();
        if (com.facebook.ads.redexgen.core.C1086Up.A17(this.A0W)) {
            this.A0B.setOnClickListener(new com.facebook.ads.redexgen.core.ViewOnClickListenerC1435dR(this));
            android.view.View mMediaView6 = this.A0Y;
            if (mMediaView6 != null) {
                this.A0Y.setCTAClickListener(new com.facebook.ads.redexgen.core.ViewOnClickListenerC1436dS(this));
            }
        }
    }

    private void A0U() {
        this.A0b.A0f(this.A0k);
        this.A0b.A0f(this.A0j);
        if (!android.text.TextUtils.isEmpty(super.A06.A29().A0H().A08())) {
            com.facebook.ads.redexgen.core.C3S c3s = new com.facebook.ads.redexgen.core.C3S(this.A0W);
            this.A0b.A0f(c3s);
            c3s.setImage(super.A06.A29().A0H().A08());
        }
        this.A0b.A0f(new com.facebook.ads.redexgen.core.C3B(this.A0W));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0V() {
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, this.A05);
        if (this.A0K) {
            layoutParams.setMargins(0, this.A05 / 5, 0, 0);
            layoutParams.addRule(12);
            this.A0A.setLayoutParams(layoutParams);
        } else {
            layoutParams.setMargins(0, this.A05 + 1, 0, 0);
        }
        android.widget.LinearLayout linearLayout = this.A0A;
        java.lang.String[] strArr = A0p;
        if (strArr[4].length() != strArr[5].length()) {
            throw new java.lang.RuntimeException();
        }
        A0p[1] = "4k5LHuHIhnjzZvLx7p7MkTP5YYpiYy7M";
        linearLayout.setTranslationY(0.0f);
        this.A0A.setLayoutParams(layoutParams);
    }

    private void A0W() {
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, this.A0J ? this.A04 / 4 : this.A04 / 5);
        layoutParams.addRule(14);
        layoutParams.addRule(2, this.A0C.getId());
        layoutParams.setMargins(0, 0, 0, 0);
        this.A0H.setLayoutParams(layoutParams);
    }

    private void A0Y(com.facebook.ads.redexgen.core.NR nr) {
        double A00 = com.facebook.ads.redexgen.core.AbstractC1340bu.A00(nr);
        java.lang.String A0F = nr.A0I().A0F();
        if (A0F == null || A0F.trim().length() == 0) {
            com.facebook.ads.redexgen.core.YB.A0O(this.A0B, 8);
            if (com.facebook.ads.redexgen.core.C1086Up.A17(this.A0W)) {
                this.A0B.setClickable(false);
            }
        } else {
            this.A0C.setText(A0F);
            if (com.facebook.ads.redexgen.core.C1086Up.A17(this.A0W)) {
                this.A0B.setClickable(true);
            }
        }
        if (A00 > 0.0d) {
            this.A03 = (int) (this.A06 / A00);
        }
        this.A03 = this.A0J ? this.A04 : this.A03;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0f(com.facebook.ads.redexgen.core.C4A c4a) {
        if (this.A0b.getState() == com.facebook.ads.redexgen.core.EnumC1578fm.A02 && com.facebook.ads.redexgen.core.C1086Up.A1e(this.A0W)) {
            postDelayed(new com.facebook.ads.redexgen.core.C0759Ht(this, c4a), 5000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0g(java.lang.String str) {
        com.facebook.ads.redexgen.core.M3 m3;
        com.facebook.ads.redexgen.core.YB.A0J(this.A0G);
        com.facebook.ads.redexgen.core.I1 i1 = new com.facebook.ads.redexgen.core.I1(this);
        if (this.A0W.A0E() == null) {
            this.A0W.A0F().A9v();
        }
        boolean A02 = com.facebook.ads.redexgen.core.AbstractC1087Uq.A02(this.A0W);
        if (A0p[6].charAt(12) != 'v') {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr = A0p;
        strArr[4] = "Q7cFr2gPd7sCHl";
        strArr[5] = "KP59UR8sut1qsy";
        if (A02 || this.A0W.A0E() == null) {
            m3 = new com.facebook.ads.redexgen.core.M3(this.A0W, i1);
        } else {
            m3 = new com.facebook.ads.redexgen.core.M3(this.A0W, this.A0W.A0E(), i1);
        }
        this.A0G = m3;
        this.A0G.setOnTouchListener(new com.facebook.ads.redexgen.core.ViewOnTouchListenerC1437dT(this));
        setUpBrowserControls(this.A0G);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-1, -1);
        layoutParams.weight = 0.9f;
        this.A0A.addView(this.A0G, layoutParams);
        this.A0G.loadUrl(str);
    }

    private void A0h(java.lang.String str) {
        java.util.Map<java.lang.String, java.lang.String> A05 = new com.facebook.ads.redexgen.core.C1293b9().A03(null).A02(null).A05();
        A05.put(A0L(0, 12, 87), str);
        this.A0X.A04(com.facebook.ads.redexgen.core.VH.A0J, A05);
        super.A0B.A4j(super.A06.A0w());
        super.A08.ABM(super.A06.A2E(), A05);
        if (com.facebook.ads.redexgen.core.C1086Up.A2U(this.A0W)) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put(com.facebook.ads.redexgen.core.AbstractC1840kH.A04, java.lang.Boolean.TRUE.toString());
            hashMap.put(com.facebook.ads.redexgen.core.AbstractC1840kH.A05, java.lang.Boolean.TRUE.toString());
            hashMap.put(com.facebook.ads.redexgen.core.AbstractC1840kH.A06, java.lang.Boolean.TRUE.toString());
            super.A08.ABn(super.A06.A2E(), hashMap);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0i(java.lang.String str) {
        if (super.A06.A25() > 0) {
            if (super.A06.A2O()) {
                boolean z = this.A0M;
                if (A0p[1].charAt(27) != 'i') {
                    throw new java.lang.RuntimeException();
                }
                java.lang.String[] strArr = A0p;
                strArr[4] = "wgFga5xemtqUSQ";
                strArr[5] = "c72BHAWejdxIIo";
                if (z) {
                    return;
                }
            }
            this.A0M = true;
            A0h(str);
            return;
        }
        boolean A1d = super.A06.A1d();
        if (A0p[1].charAt(27) == 'i') {
            java.lang.String[] strArr2 = A0p;
            strArr2[4] = "tZ3pnOdiXKjC0M";
            strArr2[5] = "WpWfv8IGy682Ke";
            if (!A1d) {
                return;
            }
        } else if (!A1d) {
            return;
        }
        A0P();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0j(boolean z) {
        if (!z && this.A0m && !this.A0R) {
            return;
        }
        this.A0K = z;
        android.animation.ObjectAnimator objectAnimator = null;
        if (!z) {
            this.A08.removeCallbacksAndMessages(null);
        } else {
            this.A02 = 0;
            this.A07 = 0;
            this.A0N = false;
            this.A0O = false;
            this.A0P = false;
            this.A0M = false;
        }
        java.lang.String A0L = A0L(48, 1, 127);
        if (z) {
            objectAnimator = android.animation.ObjectAnimator.ofFloat(this.A0H, A0L, this.A0H.getY(), this.A05 / 5);
        }
        android.widget.LinearLayout linearLayout = this.A0A;
        float y = this.A0A.getY();
        int i = this.A05;
        if (z) {
            i /= 5;
        }
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(linearLayout, A0L, y, i);
        ofFloat.setDuration(500L);
        android.animation.ObjectAnimator browserTransAnim = android.animation.ObjectAnimator.ofFloat(this.A0b, A0L, this.A0b.getY(), 0.0f);
        browserTransAnim.setDuration(500L);
        int height = this.A0b.getHeight();
        int i2 = this.A05;
        if (z) {
            i2 /= 5;
        }
        android.animation.ValueAnimator duration = android.animation.ValueAnimator.ofInt(height, i2).setDuration(500L);
        duration.addUpdateListener(new com.facebook.ads.redexgen.core.C1439dV(this));
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
        animatorSet.playTogether(ofFloat, browserTransAnim, duration);
        if (objectAnimator != null) {
            objectAnimator.setDuration(500L);
            animatorSet.playTogether(objectAnimator);
        }
        animatorSet.addListener(new com.facebook.ads.redexgen.core.C1440dW(this, z));
        if (this.A0n) {
            this.A0b.A0c(animatorSet, z);
        }
        animatorSet.start();
    }

    private void A0k(boolean z) {
        android.widget.RelativeLayout.LayoutParams layoutParams;
        setupLayoutConfiguration(z);
        com.facebook.ads.redexgen.core.YB.A0J(this.A0b);
        if (this.A0K) {
            layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, this.A05 / 5);
            layoutParams.addRule(14);
            layoutParams.addRule(10);
        } else {
            layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -2);
            layoutParams.addRule(13);
            A0S();
        }
        this.A0b.setTranslationY(0.0f);
        addView(this.A0b, 1, layoutParams);
        A0M();
        A0W();
    }

    private void A0l(boolean z, int i) {
        this.A0W.A0F().ACG(!z, i);
        if (this.A0E == null) {
            return;
        }
        this.A0E.setCloseButtonVisibility(z ? 0 : 4);
    }

    private final boolean A0m() {
        return this.A0K;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0775Ij
    public final com.facebook.ads.redexgen.core.EnumC0885Mq A1D(java.lang.String str) {
        if (!A0m()) {
            com.facebook.ads.redexgen.core.EnumC0885Mq A02 = this.A0H.A02(str);
            java.lang.String[] strArr = A0p;
            if (strArr[2].length() != strArr[3].length()) {
                throw new java.lang.RuntimeException();
            }
            A0p[1] = "gDqV8VnRL5n4dziTmRcIoSoDocYisV3G";
            return A02;
        }
        return com.facebook.ads.redexgen.core.EnumC0885Mq.A09;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0775Ij
    public final void A1E() {
        A0Q();
        if (com.facebook.ads.redexgen.core.C1086Up.A1z(this.A0W)) {
            this.A0W.A0B().AKU(this.A0b);
        }
        if (this.A0a != null) {
            com.facebook.ads.redexgen.core.C0683Eu c0683Eu = this.A0a;
            if (A0p[6].charAt(12) != 'v') {
                throw new java.lang.RuntimeException();
            }
            A0p[6] = "qZF2LURQ0N2avpQsVigAjVMCIAfnIk4T";
            c0683Eu.A07();
        }
        if (this.A0b != null) {
            this.A0b.getEventBus().A04(this.A0h, this.A0g, this.A0f, this.A0i, this.A0d, this.A0e);
            com.facebook.ads.redexgen.core.YB.A0H(this.A0b);
            this.A0b.A0W();
        }
        this.A0c.A0p();
        com.facebook.ads.redexgen.core.YB.A0d(this.A0b, this.A0k, this.A0j);
        super.A0D.A0V();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0775Ij
    public final void A1G() {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0775Ij
    public final void A1H() {
        com.facebook.ads.redexgen.core.C0673Ek c0673Ek = this.A0b;
        int secondsForNextCta = super.A06.A29().A0H().A0A() ? 0 : 1065353216;
        c0673Ek.setVolume(secondsForNextCta);
        this.A0b.A0e(com.facebook.ads.redexgen.core.EnumC1523et.A02, 20);
        int A02 = super.A06.A29().A0H().A02();
        if (A02 != 0) {
            int secondsForNextCta2 = this.A0U;
            if (A02 < secondsForNextCta2) {
                if (A02 <= 0) {
                    return;
                }
                this.A0Y.setProgressSpinnerInvisible(true);
                new com.facebook.ads.redexgen.core.XO(A02, new com.facebook.ads.redexgen.core.C0763Hx(this)).A07();
                return;
            }
        }
        this.A0Y.setToolbarActionMode(8);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0775Ij
    public final void A1I(boolean z) {
        this.A0R = z;
        A0l(z, 4);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0775Ij
    public final void A1J(boolean z) {
        if (this.A0b.A0n()) {
            return;
        }
        this.A0I = this.A0b.getVideoStartReason();
        this.A0S = z;
        this.A0b.A0i(false, 13);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0775Ij
    public final void A1K(boolean z) {
        if (this.A0b.getState() != com.facebook.ads.redexgen.core.EnumC1578fm.A06) {
            com.facebook.ads.redexgen.core.EnumC1523et enumC1523et = this.A0I;
            java.lang.String[] strArr = A0p;
            if (strArr[4].length() != strArr[5].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0p;
            strArr2[4] = "XPxqC5lbhdZAQT";
            strArr2[5] = "OGUEg1S7IFb9ga";
            if (enumC1523et != null) {
                if (!this.A0S || z) {
                    this.A0b.A0e(this.A0I, 19);
                }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0775Ij
    public final boolean A1L() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0775Ij
    public final boolean A1M() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0775Ij
    public final boolean A1N() {
        return true;
    }

    public final boolean A1O() {
        return !A0m();
    }

    public com.facebook.ads.redexgen.core.C0894Na getColors() {
        return this.A0D;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0775Ij
    public com.facebook.ads.redexgen.core.C1454dk getFullScreenAdStyle() {
        return new com.facebook.ads.redexgen.core.C1454dk(true, com.facebook.ads.redexgen.core.C1454dk.A06, super.A06.A28().A01(), com.facebook.ads.redexgen.core.ViewOnClickListenerC0834Kr.A05(super.A06), super.A06.A28().A01().A08(true), super.A06.A29().A0H().A08());
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0775Ij
    public com.facebook.ads.redexgen.core.Y2 getTouchDataRecorder() {
        return super.A0A;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0775Ij, android.view.View
    public final void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        A0k(A0m());
        setupLayoutConfiguration(A0m());
        A0V();
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            A1K(false);
        } else {
            A1J(false);
        }
    }

    private void setUpBrowserControls(com.facebook.ads.redexgen.core.M3 m3) {
        com.facebook.ads.redexgen.core.YB.A0J(this.A0E);
        this.A0E = new com.facebook.ads.redexgen.core.M6(this.A0W, m3, true, this.A0n);
        if (this.A0m) {
            A0l(this.A0R, 1);
        }
        m3.setBrowserNavigationListener(this.A0E.getBrowserNavigationListener());
        com.facebook.ads.redexgen.core.YB.A0K(this.A0E);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-1, -2);
        layoutParams.weight = 0.1f;
        this.A0E.setListener(new com.facebook.ads.redexgen.core.C0764Hy(this));
        this.A0E.setOnTouchListener(new com.facebook.ads.redexgen.core.ViewOnTouchListenerC1438dU(this));
        this.A0A.addView(this.A0E, layoutParams);
        com.facebook.ads.redexgen.core.YB.A0J(this.A0F);
        this.A0F = new com.facebook.ads.redexgen.core.C1265ah(this.A0W, null, android.R.attr.progressBarStyleHorizontal);
        this.A0A.addView(this.A0F, new android.widget.LinearLayout.LayoutParams(-1, A0q));
    }

    private void setupLayoutConfiguration(boolean z) {
        this.A0J = getResources().getConfiguration().orientation == 2;
        this.A0K = z;
        this.A04 = android.content.res.Resources.getSystem().getDisplayMetrics().heightPixels;
        this.A06 = android.content.res.Resources.getSystem().getDisplayMetrics().widthPixels;
        android.graphics.Point point = new android.graphics.Point();
        android.view.WindowManager windowManager = (android.view.WindowManager) this.A0W.getSystemService(A0L(42, 6, 42));
        if (windowManager != null) {
            if (android.os.Build.VERSION.SDK_INT >= 30) {
                android.view.WindowMetrics windowMetrics = windowManager.getCurrentWindowMetrics();
                point.y = windowMetrics.getBounds().bottom - windowMetrics.getBounds().top;
            } else {
                windowManager.getDefaultDisplay().getRealSize(point);
            }
        }
        this.A05 = point.y > 0 ? point.y : this.A04;
        this.A03 = this.A04;
    }
}
