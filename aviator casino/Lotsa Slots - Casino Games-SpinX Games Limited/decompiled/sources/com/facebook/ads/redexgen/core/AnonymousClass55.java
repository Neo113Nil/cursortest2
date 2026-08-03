package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.55, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class AnonymousClass55 extends com.facebook.ads.redexgen.core.AbstractC0775Ij {
    public static byte[] A0o;
    public static java.lang.String[] A0p = {"PW", "VMuxnsAFAgr5cT24vzltLNiVzxTvarbU", "jq4GRSBqKMr4rGHs6WabqGWnms1UYtFJ", "ha", "80KuzsseMGT5f9rKVuNW3ow7LLk13v1X", "uG1OElCv3xaCg8aDr811TJkNgBcTan1c", "YwXHrw3Tlq3bJQZfooudgwuoCwRnfSi1", "LVHFB8bkqwAuG3vKzwVN0RmVN3FHwXeF"};
    public static final int A0q;
    public static final int A0r;
    public static final int A0s;
    public static final int A0t;
    public static final int A0u;
    public float A00;
    public int A01;
    public android.widget.ImageView A02;
    public android.widget.LinearLayout A03;
    public com.facebook.ads.redexgen.core.M8 A04;
    public com.facebook.ads.redexgen.core.C1265ah A05;
    public com.facebook.ads.redexgen.core.M3 A06;
    public com.facebook.ads.redexgen.core.C1313bT A07;
    public com.facebook.ads.redexgen.core.ViewOnClickListenerC0834Kr A08;
    public com.facebook.ads.redexgen.core.C1365cJ A09;
    public com.facebook.ads.redexgen.core.EnumC1523et A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public final float A0N;
    public final int A0O;
    public final android.os.Handler A0P;
    public final android.os.Handler A0Q;
    public final android.os.Handler A0R;
    public final com.facebook.ads.redexgen.core.AbstractC0888Mt A0S;
    public final com.facebook.ads.redexgen.core.C0894Na A0T;
    public final com.facebook.ads.redexgen.core.C1636gi A0U;
    public final com.facebook.ads.redexgen.core.VI A0V;
    public final com.facebook.ads.redexgen.core.AbstractC1171Yb A0W;
    public final com.facebook.ads.redexgen.core.LK A0X;
    public final com.facebook.ads.redexgen.core.InterfaceC1314bU A0Y;
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
    public final com.facebook.ads.redexgen.core.C0640Dd A0j;
    public final com.facebook.ads.redexgen.core.DZ A0k;
    public final java.lang.Runnable A0l;
    public final boolean A0m;
    public final boolean A0n;

    public static java.lang.String A0J(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A0o, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 29);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A0W() {
        A0o = new byte[]{33, 46, 43, 33, 41, com.google.common.base.Ascii.GS, 49, 45, 55, 48, 33, 39, 58, 54, 52, 119, 63, 56, 58, 60, 59, 54, 54, 50, 119, 56, kotlin.io.encoding.Base64.padSymbol, 42, 119, 48, 55, 45, 60, 43, 42, 45, 48, 45, 48, 56, 53, 119, 58, 53, 48, 58, 50, 60, kotlin.io.encoding.Base64.padSymbol, 33, 54, 36, 50, 33, 55, 54, 55, com.google.common.base.Ascii.FF, 37, 58, 55, 54, 60, kotlin.io.encoding.Base64.padSymbol, 59, 45, 58, 43, 36, 33, 43, 35, com.google.common.base.Ascii.ETB, 46, 33, 36, 60, 45, 58, 45, 44, 9};
    }

    static {
        A0W();
        A0q = (int) (com.facebook.ads.redexgen.core.XX.A02 * 4.0f);
        A0r = (int) (com.facebook.ads.redexgen.core.XX.A02 * 32.0f);
        A0s = com.facebook.ads.redexgen.core.P3.A02(-1, 77);
        A0t = (int) (com.facebook.ads.redexgen.core.XX.A02 * 26.0f);
        A0u = (int) (com.facebook.ads.redexgen.core.XX.A02 * 12.0f);
    }

    public AnonymousClass55(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.VA va, com.facebook.ads.redexgen.core.AbstractC1171Yb abstractC1171Yb, com.facebook.ads.redexgen.core.AbstractC1801jd abstractC1801jd, com.facebook.ads.redexgen.core.C1042Sx c1042Sx, com.facebook.ads.redexgen.core.ZU zu, int i, com.facebook.ads.redexgen.core.InterfaceC1177Yh interfaceC1177Yh, com.facebook.ads.redexgen.core.VI vi, int i2, boolean z, boolean z2, com.facebook.ads.redexgen.core.InterfaceC1456dm interfaceC1456dm, int i3, int i4) {
        super(c1636gi, zu, va, abstractC1801jd, i, z, z2, interfaceC1177Yh, i4);
        com.facebook.ads.redexgen.core.C0894Na A00;
        this.A0H = false;
        this.A0G = false;
        this.A0F = false;
        this.A01 = 0;
        this.A0J = true;
        this.A0M = false;
        this.A0I = false;
        this.A0Q = new android.os.Handler(android.os.Looper.getMainLooper());
        this.A0l = new com.facebook.ads.redexgen.core.RunnableC1449df(this);
        this.A0E = false;
        this.A00 = 0.0f;
        this.A0B = true;
        this.A0C = false;
        this.A0K = false;
        this.A0R = new android.os.Handler(android.os.Looper.getMainLooper());
        this.A0h = new com.facebook.ads.redexgen.core.E0() { // from class: com.facebook.ads.redexgen.X.5D
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.UN
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(com.facebook.ads.redexgen.core.E1 e1) {
                boolean z3;
                com.facebook.ads.redexgen.core.C1636gi c1636gi2;
                com.facebook.ads.redexgen.core.LK lk;
                com.facebook.ads.redexgen.core.LK lk2;
                com.facebook.ads.redexgen.core.LK lk3;
                z3 = com.facebook.ads.redexgen.core.AnonymousClass55.this.A0M;
                if (!z3) {
                    com.facebook.ads.redexgen.core.AnonymousClass55.this.A0M = true;
                    c1636gi2 = com.facebook.ads.redexgen.core.AnonymousClass55.this.A0U;
                    c1636gi2.A0F().AKh(com.facebook.ads.redexgen.core.XL.A00((float) ((com.facebook.ads.redexgen.core.AbstractC0775Ij) com.facebook.ads.redexgen.core.AnonymousClass55.this).A06.A0k()), com.facebook.ads.redexgen.core.AnonymousClass55.this.getResources().getConfiguration().orientation, true, true, com.facebook.ads.redexgen.core.AbstractC0888Mt.A0A());
                    com.facebook.ads.redexgen.core.AnonymousClass55.this.A0X(com.facebook.ads.redexgen.core.AnonymousClass55.this.getResources().getConfiguration().orientation);
                    lk = com.facebook.ads.redexgen.core.AnonymousClass55.this.A0X;
                    lk.setVisibility(0);
                    lk2 = com.facebook.ads.redexgen.core.AnonymousClass55.this.A0X;
                    lk2.A0u(com.facebook.ads.redexgen.core.AnonymousClass55.this.getResources().getConfiguration().orientation);
                    lk3 = com.facebook.ads.redexgen.core.AnonymousClass55.this.A0X;
                    lk3.bringToFront();
                    com.facebook.ads.redexgen.core.AnonymousClass55.this.A0V();
                }
            }
        };
        this.A0g = new com.facebook.ads.redexgen.core.E2() { // from class: com.facebook.ads.redexgen.X.5B
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.UN
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(com.facebook.ads.redexgen.core.E3 e3) {
                if (!((com.facebook.ads.redexgen.core.AbstractC0775Ij) com.facebook.ads.redexgen.core.AnonymousClass55.this).A0A.A07()) {
                    com.facebook.ads.redexgen.core.AnonymousClass55.this.A1F();
                }
            }
        };
        this.A0f = new com.facebook.ads.redexgen.core.E4() { // from class: com.facebook.ads.redexgen.X.59
            @Override // com.facebook.ads.redexgen.core.UN
            public final /* bridge */ /* synthetic */ void A03(com.facebook.ads.redexgen.core.C4B c4b) {
            }
        };
        this.A0i = new com.facebook.ads.redexgen.core.AbstractC0662Dz() { // from class: com.facebook.ads.redexgen.X.58
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.UN
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(com.facebook.ads.redexgen.core.C4A c4a) {
                float f;
                com.facebook.ads.redexgen.core.C0673Ek c0673Ek;
                com.facebook.ads.redexgen.core.InterfaceC1456dm interfaceC1456dm2;
                com.facebook.ads.redexgen.core.AnonymousClass55.this.A0o(c4a);
                f = com.facebook.ads.redexgen.core.AnonymousClass55.this.A00;
                c0673Ek = com.facebook.ads.redexgen.core.AnonymousClass55.this.A0b;
                float duration = (f * c0673Ek.getDuration()) + c4a.A00();
                interfaceC1456dm2 = com.facebook.ads.redexgen.core.AnonymousClass55.this.A0Z;
                interfaceC1456dm2.ADw(duration);
            }
        };
        this.A0d = new com.facebook.ads.redexgen.core.EA() { // from class: com.facebook.ads.redexgen.X.57
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.UN
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(com.facebook.ads.redexgen.core.C4K c4k) {
                com.facebook.ads.redexgen.core.InterfaceC1456dm interfaceC1456dm2;
                com.facebook.ads.redexgen.core.C0673Ek c0673Ek;
                com.facebook.ads.redexgen.core.C0673Ek c0673Ek2;
                interfaceC1456dm2 = com.facebook.ads.redexgen.core.AnonymousClass55.this.A0Z;
                c0673Ek = com.facebook.ads.redexgen.core.AnonymousClass55.this.A0b;
                interfaceC1456dm2.ADc(c0673Ek.getDuration());
                com.facebook.ads.redexgen.core.AnonymousClass55.A01(com.facebook.ads.redexgen.core.AnonymousClass55.this, 1.0f);
                c0673Ek2 = com.facebook.ads.redexgen.core.AnonymousClass55.this.A0b;
                c0673Ek2.A0e(com.facebook.ads.redexgen.core.EnumC1523et.A02, 28);
            }
        };
        this.A0e = new com.facebook.ads.redexgen.core.AnonymousClass56(this);
        this.A0Y = new com.facebook.ads.redexgen.core.HW(this);
        this.A0W = abstractC1171Yb;
        this.A0O = i3;
        this.A0P = new android.os.Handler(android.os.Looper.getMainLooper());
        this.A0S = com.facebook.ads.redexgen.core.C0889Mu.A01(c1636gi, va, abstractC1801jd.A2E(), com.facebook.ads.redexgen.core.XB.A00(abstractC1801jd.A29().A0J().A05()), new java.util.HashMap(), false, true, abstractC1801jd.A2A());
        this.A0U = c1636gi;
        this.A0V = vi;
        this.A0j = new com.facebook.ads.redexgen.core.C0640Dd(this.A0U, this.A0V);
        this.A0k = new com.facebook.ads.redexgen.core.DZ(this.A0U, i3);
        this.A0Z = interfaceC1456dm;
        if (i2 == 1) {
            A00 = super.A06.A28().A01();
        } else {
            A00 = super.A06.A28().A00();
        }
        this.A0T = A00;
        com.facebook.ads.redexgen.core.AbstractC1337br.A00(this.A0U, this, abstractC1801jd.A29().A0H().A08());
        this.A0b = new com.facebook.ads.redexgen.core.C0673Ek(this.A0U);
        this.A0b.getEventBus().A03(this.A0h, this.A0g, this.A0f, this.A0i, this.A0d, this.A0e);
        this.A0c = new com.facebook.ads.redexgen.core.C4L(c1636gi, va, this.A0b, abstractC1801jd.A2E());
        A0U();
        java.lang.String videoUrl = super.A06.A29().A0H().A09();
        this.A0b.setVideoURI(c1042Sx.A0T(videoUrl));
        this.A0N = (float) abstractC1801jd.A0k();
        A0Q();
        A0M();
        A0L();
        this.A0X = A0D();
        addView(this.A0X);
        com.facebook.ads.redexgen.core.YB.A0K(this.A0X);
        A0T();
        A0R();
        A0S();
        this.A0X.getProgressBarAnimation().setShouldClearAnimationWhenVideoCompleted(false);
        if (com.facebook.ads.redexgen.core.C1086Up.A1z(this.A0U)) {
            com.facebook.ads.redexgen.core.VM A0B = this.A0U.A0B();
            com.facebook.ads.redexgen.core.C0673Ek c0673Ek = this.A0b;
            java.lang.String videoUrl2 = super.A06.A2E();
            A0B.AKn(c0673Ek, videoUrl2, true);
        }
        if (com.facebook.ads.redexgen.core.C1086Up.A20(this.A0U)) {
            this.A0a = new com.facebook.ads.redexgen.core.C0683Eu(this.A0U, va, this.A0b, super.A06.A2E(), false, this.A0c, null);
        } else {
            this.A0a = null;
        }
        A0d(abstractC1801jd.A29());
        this.A0m = super.A06.A1m();
        this.A0n = super.A06.A1z();
        A0P();
        c1636gi.A0F().ACI(this.A0m, this.A0n, true);
        this.A0j.bringToFront();
    }

    public static /* synthetic */ float A01(com.facebook.ads.redexgen.core.AnonymousClass55 anonymousClass55, float f) {
        float f2 = anonymousClass55.A00 + f;
        anonymousClass55.A00 = f2;
        return f2;
    }

    public static /* synthetic */ int A03(com.facebook.ads.redexgen.core.AnonymousClass55 anonymousClass55) {
        int i = anonymousClass55.A01;
        anonymousClass55.A01 = i + 1;
        return i;
    }

    private com.facebook.ads.redexgen.core.LK A0D() {
        java.lang.String A0J;
        if (super.A06.A10().equals(A0J(49, 14, 78))) {
            A0J = com.facebook.ads.redexgen.core.EnumC1529ez.A04.A03();
        } else {
            A0J = A0J(12, 37, 68);
        }
        com.facebook.ads.redexgen.core.LK A03 = new com.facebook.ads.redexgen.core.C1338bs(this.A0N, A0J, this.A0U, getColors(), super.A06, super.A0B, this.A08, com.facebook.ads.redexgen.core.AbstractC0775Ij.A0G, false, super.A08, super.A0D, super.A0A, this.A0k, this.A0V, true).A03();
        android.widget.RelativeLayout.LayoutParams adDetailsParams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        adDetailsParams.addRule(12);
        A03.setVisibility(8);
        A03.setChainedAdInfo(super.A00);
        A03.setLayoutParams(adDetailsParams);
        return A03;
    }

    private void A0K() {
        this.A09 = new com.facebook.ads.redexgen.core.C1365cJ(this.A0U, super.A06, this.A0V, this.A0Q, super.A0B);
        this.A09.A0I(false);
        addView(this.A09.A0C(getRegularCtaForEndCard()));
    }

    private void A0L() {
        this.A0k.A08(-1, A0s, false);
        this.A0k.setPadding(A0u, A0u, A0u, A0u);
    }

    private void A0M() {
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(A0r, A0r);
        layoutParams.setMargins(com.facebook.ads.redexgen.core.XV.A0b, com.facebook.ads.redexgen.core.XV.A0r, com.facebook.ads.redexgen.core.XV.A0b, com.facebook.ads.redexgen.core.XV.A0Z);
        layoutParams.addRule(9);
        layoutParams.addRule(10);
        android.view.ViewGroup.LayoutParams videoViewParams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        addView(this.A0b, videoViewParams);
        addView(this.A0j, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0N() {
        if (super.A06.A1e() && this.A0E) {
            this.A0E = false;
            A0q(A0J(63, 18, 85));
        }
    }

    private void A0O() {
        if (super.A06.A1e() && this.A0E) {
            this.A0E = false;
            java.util.Map<java.lang.String, java.lang.String> A05 = new com.facebook.ads.redexgen.core.C1293b9().A03(null).A02(null).A05();
            A05.put(A0J(0, 12, 95), A0J(63, 18, 85));
            super.A08.AB6(super.A06.A2E(), A05);
        }
    }

    private void A0P() {
        if (!super.A06.A29().A0K().A04()) {
            return;
        }
        this.A02 = new android.widget.ImageView(this.A0U);
        addView(this.A02);
        this.A02.setVisibility(4);
        new com.facebook.ads.redexgen.core.LM(this.A02, this.A0U).A04().A06(new com.facebook.ads.redexgen.core.C0742Hc(this)).A07(super.A06.A29().A0H().A08());
    }

    private void A0Q() {
        postDelayed(new com.facebook.ads.redexgen.core.C0753Hn(this), com.facebook.ads.redexgen.core.C1086Up.A0P(this.A0U));
    }

    private void A0R() {
        com.facebook.ads.redexgen.core.YB.A0J(this.A03);
        this.A03 = new android.widget.LinearLayout(this.A0U);
        this.A03.setOrientation(1);
        com.facebook.ads.redexgen.core.YB.A0K(this.A03);
        this.A03.setBackgroundColor(-1);
        addView(this.A03);
    }

    private void A0S() {
        if (super.A06.A1X() && this.A0S != null && com.facebook.ads.redexgen.core.XL.A03(this.A0N)) {
            this.A07 = new com.facebook.ads.redexgen.core.C1313bT(this.A0U, super.A0B, super.A06.A0l(), this.A0S, this.A0X.getCTAButton(), this.A0X);
            addView(this.A07.getBrowserPeekView());
            this.A0R.postDelayed(new com.facebook.ads.redexgen.core.RunnableC1446dc(this), 5900L);
        }
    }

    private void A0T() {
        if (super.A06.A1e()) {
            this.A0b.setOnClickListener(new com.facebook.ads.redexgen.core.ViewOnClickListenerC1452di(this));
        }
        com.facebook.ads.redexgen.core.YB.A0J(this.A0b);
        com.facebook.ads.redexgen.core.YB.A0K(this.A0b);
        addView(this.A0b, new android.widget.RelativeLayout.LayoutParams(-1, -2));
        this.A08 = new com.facebook.ads.redexgen.core.ViewOnClickListenerC0834Kr(this.A0U, super.A06, this.A0T, super.A08, super.A0B, super.A0D, super.A0A, (com.facebook.ads.redexgen.core.InterfaceC1151Xh) null);
        com.facebook.ads.redexgen.core.YB.A0G(1001, this.A08);
        if (com.facebook.ads.redexgen.core.C1086Up.A17(this.A0U)) {
            android.view.View.OnClickListener onClickListener = new com.facebook.ads.redexgen.core.ViewOnClickListenerC1444da(this);
            this.A0X.setCTAClickListener(onClickListener);
            if (this.A0W != null) {
                android.view.View.OnClickListener onClickListener2 = new com.facebook.ads.redexgen.core.ViewOnClickListenerC1445db(this);
                this.A0W.setCTAClickListener(onClickListener2);
            }
        }
    }

    private void A0U() {
        this.A0b.A0f(this.A0k);
        this.A0b.A0f(this.A0j);
        if (!android.text.TextUtils.isEmpty(super.A06.A29().A0H().A08())) {
            com.facebook.ads.redexgen.core.C3S c3s = new com.facebook.ads.redexgen.core.C3S(this.A0U, true);
            this.A0b.A0f(c3s);
            c3s.setImage(super.A06.A29().A0H().A08());
        }
        this.A0b.A0f(new com.facebook.ads.redexgen.core.C3B(this.A0U));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0V() {
        int duration = this.A0b.getDuration();
        int videoDuration = this.A0k.getCustomDuration();
        if (videoDuration > duration) {
            this.A0k.setCustomDuration(duration);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0X(int i) {
        if (!this.A0M) {
            return;
        }
        com.facebook.ads.redexgen.core.C0673Ek c0673Ek = this.A0b;
        android.widget.RelativeLayout adjacentView = (android.widget.RelativeLayout) this.A0b.getVideoView();
        this.A0b.A0Z(i);
        A0Z(i, c0673Ek, adjacentView);
    }

    private void A0Y(int i) {
        if (this.A0j != null) {
            android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) this.A0j.getLayoutParams();
            layoutParams.setMargins(com.facebook.ads.redexgen.core.XV.A09, i, com.facebook.ads.redexgen.core.XV.A09, com.facebook.ads.redexgen.core.XV.A05);
            this.A0j.setLayoutParams(layoutParams);
        }
    }

    private void A0Z(int i, android.view.ViewGroup viewGroup, android.widget.RelativeLayout relativeLayout) {
        if (relativeLayout == null) {
            return;
        }
        com.facebook.ads.redexgen.core.YB.A0J(this.A0X);
        if ((this.A0X instanceof com.facebook.ads.redexgen.core.C6V) || (this.A0X instanceof com.facebook.ads.redexgen.core.C6U)) {
            android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
            if (getResources().getConfiguration().orientation == 2) {
                layoutParams.addRule(1, relativeLayout.getId());
                this.A0X.setLayoutParams(layoutParams);
                viewGroup.addView(this.A0X);
            } else {
                android.view.View view = this.A0X;
                java.lang.String[] strArr = A0p;
                if (strArr[1].charAt(10) != strArr[2].charAt(10)) {
                    throw new java.lang.RuntimeException();
                }
                A0p[4] = "hNSRRdlixh2gw3rjMoVJbJnBOeMmg8Zc";
                addView(view, layoutParams);
            }
        } else if (this.A0X instanceof com.facebook.ads.redexgen.core.C6T) {
            android.widget.RelativeLayout.LayoutParams layoutParams2 = new android.widget.RelativeLayout.LayoutParams(-1, -1);
            layoutParams2.addRule(12);
            this.A0X.setLayoutParams(layoutParams2);
            addView(this.A0X, layoutParams2);
        }
        this.A0X.A0l(i);
        this.A0X.A0y(viewGroup, relativeLayout, i);
    }

    private void A0a(android.view.ViewGroup viewGroup, android.view.View view, int i) {
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) viewGroup.getLayoutParams();
        android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) view.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = -1;
        if (i == 1) {
            layoutParams2.width = -1;
            layoutParams2.height = -2;
        } else {
            layoutParams2.width = -2;
            layoutParams2.height = -1;
        }
        layoutParams2.removeRule(14);
        viewGroup.setLayoutParams(layoutParams);
        view.setLayoutParams(layoutParams2);
        A0X(i);
    }

    private void A0b(android.view.ViewGroup viewGroup, android.view.View view, com.facebook.ads.redexgen.core.AbstractC1171Yb abstractC1171Yb, int i) {
        com.facebook.ads.redexgen.core.YB.A0d(this.A03);
        com.facebook.ads.redexgen.core.YB.A0J(abstractC1171Yb);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, abstractC1171Yb.getToolbarHeight());
        layoutParams.addRule(10);
        layoutParams.setMargins(com.facebook.ads.redexgen.core.XV.A0u, com.facebook.ads.redexgen.core.XV.A0r, 0, 0);
        android.widget.RelativeLayout.LayoutParams parentLayoutParam = (android.widget.RelativeLayout.LayoutParams) viewGroup.getLayoutParams();
        android.widget.RelativeLayout.LayoutParams toolbarParams = (android.widget.RelativeLayout.LayoutParams) view.getLayoutParams();
        parentLayoutParam.width = -1;
        parentLayoutParam.height = -1;
        if (i == 1) {
            toolbarParams.width = -1;
            toolbarParams.height = -2;
        } else {
            toolbarParams.width = -2;
            toolbarParams.height = -1;
        }
        toolbarParams.removeRule(14);
        viewGroup.setLayoutParams(parentLayoutParam);
        view.setLayoutParams(toolbarParams);
        this.A0X.A0z(viewGroup, false, false, this.A03.getId());
        A0X(i);
        viewGroup.addView(abstractC1171Yb, layoutParams);
    }

    private void A0c(android.view.ViewGroup viewGroup, android.view.View view, com.facebook.ads.redexgen.core.AbstractC1171Yb abstractC1171Yb, int i) {
        com.facebook.ads.redexgen.core.YB.A0J(this.A03);
        com.facebook.ads.redexgen.core.YB.A0J(abstractC1171Yb);
        com.facebook.ads.redexgen.core.YB.A0J(this.A0X);
        boolean A05 = com.facebook.ads.redexgen.core.XL.A05(this.A0N);
        boolean isBrowserBelowMediaView = i == 1;
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(10);
        if (!super.A06.A2U() || i != 2 || !A05) {
            A0Y(com.facebook.ads.redexgen.core.XV.A0N);
            layoutParams.setMargins(com.facebook.ads.redexgen.core.XV.A0T, com.facebook.ads.redexgen.core.XV.A0N, 0, 0);
        } else {
            layoutParams.setMargins(com.facebook.ads.redexgen.core.XV.A0T, com.facebook.ads.redexgen.core.XV.A0B, 0, 0);
            A0Y(com.facebook.ads.redexgen.core.XV.A0B);
        }
        android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) viewGroup.getLayoutParams();
        android.widget.RelativeLayout.LayoutParams browserLayoutParam = (android.widget.RelativeLayout.LayoutParams) view.getLayoutParams();
        browserLayoutParam.removeRule(14);
        browserLayoutParam.removeRule(9);
        android.widget.RelativeLayout.LayoutParams layoutParams3 = (android.widget.RelativeLayout.LayoutParams) this.A03.getLayoutParams();
        layoutParams3.removeRule(3);
        layoutParams3.removeRule(1);
        boolean z = isBrowserBelowMediaView || A05;
        if (z) {
            layoutParams2.height = getHeightPixels() / 4;
            browserLayoutParam.height = getHeightPixels() / 4;
            if (A0p[5].charAt(30) != '1') {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A0p;
            strArr[1] = "aNPRQigyxlriqHgRS6C1obCW9NP8FFpI";
            strArr[2] = "RUJfPTyX2Zr9a7jBp48wtOZ1EckF1HKn";
            browserLayoutParam.addRule(14);
            layoutParams3.addRule(3, viewGroup.getId());
        } else {
            this.A0b.A0Z(i);
            layoutParams2.height = -1;
            browserLayoutParam.height = -1;
            browserLayoutParam.addRule(9);
            layoutParams3.addRule(1, view.getId());
        }
        layoutParams2.addRule(9);
        layoutParams2.addRule(10);
        viewGroup.setLayoutParams(layoutParams2);
        browserLayoutParam.width = -2;
        view.setLayoutParams(browserLayoutParam);
        layoutParams3.width = -1;
        layoutParams3.height = -1;
        layoutParams3.setMargins(0, 0, 0, 0);
        this.A03.setLayoutParams(layoutParams3);
        if (z) {
            addView(this.A03);
            addView(abstractC1171Yb, layoutParams);
        } else {
            viewGroup.addView(this.A03);
            layoutParams.addRule(0, this.A03.getId());
            viewGroup.addView(abstractC1171Yb, layoutParams);
        }
        this.A0X.A0z(viewGroup, true, A05, this.A03.getId());
    }

    private void A0d(com.facebook.ads.redexgen.core.NR nr) {
        this.A0X.setInfo(nr.A0I(), nr.A0J(), super.A06.A2E(), super.A06.A2C().A01(), null, this.A0Y);
        this.A0X.getCTAButton().setIsInAppBrowser(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0o(com.facebook.ads.redexgen.core.C4A c4a) {
        if (this.A0b.getState() == com.facebook.ads.redexgen.core.EnumC1578fm.A02 && com.facebook.ads.redexgen.core.C1086Up.A1e(this.A0U)) {
            postDelayed(new com.facebook.ads.redexgen.core.C0752Hm(this, c4a), 5000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0p(java.lang.String str) {
        com.facebook.ads.redexgen.core.M3 m3;
        com.facebook.ads.redexgen.core.YB.A0J(this.A06);
        com.facebook.ads.redexgen.core.C0757Hr c0757Hr = new com.facebook.ads.redexgen.core.C0757Hr(this);
        if (this.A0U.A0E() == null) {
            this.A0U.A0F().A9v();
        }
        if (this.A07 != null) {
            this.A07.A0B();
            this.A07 = null;
        }
        if (com.facebook.ads.redexgen.core.AbstractC1087Uq.A02(this.A0U) || this.A0U.A0E() == null) {
            m3 = new com.facebook.ads.redexgen.core.M3(this.A0U, c0757Hr);
        } else {
            m3 = new com.facebook.ads.redexgen.core.M3(this.A0U, this.A0U.A0E(), c0757Hr);
        }
        this.A06 = m3;
        setUpBrowserControls(this.A06);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-1, -1);
        layoutParams.weight = 0.9f;
        this.A03.addView(this.A06, layoutParams);
        this.A06.loadUrl(str);
    }

    private void A0q(java.lang.String str) {
        java.util.Map<java.lang.String, java.lang.String> A05 = new com.facebook.ads.redexgen.core.C1293b9().A03(null).A02(null).A05();
        A05.put(A0J(0, 12, 95), str);
        this.A0V.A04(com.facebook.ads.redexgen.core.VH.A0J, A05);
        super.A0B.A4j(super.A06.A0w());
        super.A08.ABM(super.A06.A2E(), A05);
        if (com.facebook.ads.redexgen.core.C1086Up.A2U(this.A0U)) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put(com.facebook.ads.redexgen.core.AbstractC1840kH.A04, java.lang.Boolean.TRUE.toString());
            hashMap.put(com.facebook.ads.redexgen.core.AbstractC1840kH.A05, java.lang.Boolean.TRUE.toString());
            hashMap.put(com.facebook.ads.redexgen.core.AbstractC1840kH.A06, java.lang.Boolean.TRUE.toString());
            super.A08.ABn(super.A06.A2E(), hashMap);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0r(java.lang.String str) {
        if (super.A06.A25() > 0) {
            if (super.A06.A2O() && this.A0F) {
                return;
            }
            this.A0F = true;
            A0q(str);
            return;
        }
        if (super.A06.A1d()) {
            A0N();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0s(java.lang.String str) {
        if (!this.A0K) {
            this.A0K = true;
            this.A0Z.AGQ(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0t(java.lang.String str) {
        if (!this.A0D) {
            this.A0X.getCTAButton().A0E(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0u(boolean z) {
        if (!z && this.A0m) {
            return;
        }
        this.A0D = z;
        if (z) {
            this.A01 = 0;
            this.A0G = false;
            this.A0F = false;
        } else {
            this.A0P.removeCallbacksAndMessages(null);
        }
        android.widget.LinearLayout linearLayout = this.A03;
        float y = this.A03.getY();
        float heightPixels = getHeightPixels();
        if (z) {
            heightPixels /= 4.0f;
        }
        java.lang.String A0J = A0J(81, 1, 109);
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(linearLayout, A0J, y, heightPixels);
        ofFloat.setDuration(500L);
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(this.A0b, A0J, this.A0b.getY(), 0.0f);
        ofFloat2.setDuration(500L);
        int height = this.A0b.getHeight();
        int heightPixels2 = getHeightPixels();
        if (z) {
            heightPixels2 /= 4;
        }
        android.animation.ValueAnimator duration = android.animation.ValueAnimator.ofInt(height, heightPixels2).setDuration(500L);
        duration.addUpdateListener(new com.facebook.ads.redexgen.core.C1447dd(this));
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
        animatorSet.playTogether(ofFloat, ofFloat2, duration);
        animatorSet.addListener(new com.facebook.ads.redexgen.core.C1448de(this, z));
        if (this.A0n) {
            this.A0b.A0c(animatorSet, z);
        }
        A0w(this.A0D, true);
        if (!z && this.A06 != null) {
            this.A06.destroy();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0054, code lost:
    
        if (r6 != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0056, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0057, code lost:
    
        r4.setCloseButtonVisibility(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0067, code lost:
    
        if (r6 != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A0v(boolean z, int i) {
        this.A0U.A0F().ACG(!z, i);
        if (this.A04 != null) {
            boolean z2 = this.A0m;
            int i2 = 4;
            java.lang.String[] strArr = A0p;
            if (strArr[1].charAt(10) != strArr[2].charAt(10)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0p;
            strArr2[6] = "EaXPQIkUGhcx1dZHr3fchF7eoR8nmh6r";
            strArr2[7] = "BoqCm6Atk4DXyXzUZY25jylGRvSX4IAb";
            if (z2) {
                this.A04.setCloseButtonVisibility(4);
                return;
            }
            com.facebook.ads.redexgen.core.M8 m8 = this.A04;
            java.lang.String[] strArr3 = A0p;
            if (strArr3[3].length() == strArr3[0].length()) {
                java.lang.String[] strArr4 = A0p;
                strArr4[3] = "X7";
                strArr4[0] = "zP";
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0w(boolean z, boolean z2) {
        if (!this.A0M) {
            return;
        }
        int i = getResources().getConfiguration().orientation;
        if (z) {
            A0c(this.A0b, this.A0b.getVideoView(), this.A0W, i);
            return;
        }
        if (z2) {
            com.facebook.ads.redexgen.core.C0673Ek c0673Ek = this.A0b;
            com.facebook.ads.redexgen.core.C0673Ek c0673Ek2 = this.A0b;
            java.lang.String[] strArr = A0p;
            java.lang.String str = strArr[6];
            java.lang.String str2 = strArr[7];
            int charAt = str.charAt(0);
            int orientation = str2.charAt(0);
            if (charAt == orientation) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0p;
            strArr2[6] = "obEiGvqtCCvFNuJUlwIyPJMxkodqaQ5K";
            strArr2[7] = "nJocAzrRDHwRQikLytOPP2BE8QGdYkmy";
            A0b(c0673Ek, c0673Ek2.getVideoView(), this.A0W, i);
            return;
        }
        A0a(this.A0b, this.A0b.getVideoView(), i);
    }

    private final boolean A0x() {
        return this.A0D;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0775Ij
    public final com.facebook.ads.redexgen.core.EnumC0885Mq A1D(java.lang.String str) {
        if (!A0x()) {
            if (this.A09 != null) {
                return this.A09.A0E().A0E(str);
            }
            return this.A0X.getCTAButton().A0E(str);
        }
        return com.facebook.ads.redexgen.core.EnumC0885Mq.A09;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0775Ij
    public final void A1E() {
        A0O();
        this.A0X.A0j();
        this.A0R.removeCallbacksAndMessages(null);
        if (this.A09 != null) {
            this.A09.A0F();
        }
        this.A0Q.removeCallbacksAndMessages(null);
        if (com.facebook.ads.redexgen.core.C1086Up.A1z(this.A0U)) {
            this.A0U.A0B().AKU(this.A0b);
        }
        if (this.A0a != null) {
            this.A0a.A07();
        }
        com.facebook.ads.redexgen.core.C1313bT c1313bT = this.A07;
        java.lang.String[] strArr = A0p;
        if (strArr[1].charAt(10) != strArr[2].charAt(10)) {
            throw new java.lang.RuntimeException();
        }
        A0p[4] = "zZx5K1WC5ur1IIrcKdsfSp5hTLdY49e9";
        if (c1313bT != null) {
            this.A07.A0B();
            this.A07 = null;
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
        this.A0I = true;
        this.A0X.A0o();
        com.facebook.ads.redexgen.core.YB.A0d(this.A0b, this.A0X, this.A0k, this.A04, this.A0j, this.A03, this.A0W);
        if (this.A07 != null) {
            this.A07.A0B();
        }
        com.facebook.ads.redexgen.core.YB.A0W(this);
        if (this.A02 != null) {
            this.A02.setVisibility(0);
        }
        A0K();
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(10);
        layoutParams.setMargins(com.facebook.ads.redexgen.core.XV.A0u, com.facebook.ads.redexgen.core.XV.A0r, 0, 0);
        addView(this.A0W, layoutParams);
        this.A0W.bringToFront();
        this.A0B = true;
        this.A0Z.AFw(true);
        if (this.A0W != null && getAdDataBundle().A29().A0K().A00() > 0) {
            this.A0B = false;
            if (getAdDataBundle().A2P()) {
                this.A0W.setToolbarActionMode(8);
            } else {
                this.A0W.setToolbarActionMode(2);
            }
            new android.os.Handler(android.os.Looper.getMainLooper()).postDelayed(new com.facebook.ads.redexgen.core.RunnableC1450dg(this), getAdDataBundle().A29().A0K().A00());
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0775Ij
    public final void A1H() {
        com.facebook.ads.redexgen.core.C0673Ek c0673Ek = this.A0b;
        int secondsForNextCta = super.A06.A29().A0H().A0A() ? 0 : 1065353216;
        c0673Ek.setVolume(secondsForNextCta);
        this.A0b.A0e(com.facebook.ads.redexgen.core.EnumC1523et.A02, 20);
        int A02 = super.A06.A29().A0H().A02();
        if (A02 != 0) {
            int secondsForNextCta2 = this.A0O;
            if (A02 < secondsForNextCta2) {
                if (A02 <= 0) {
                    return;
                }
                this.A0W.setProgressSpinnerInvisible(true);
                new com.facebook.ads.redexgen.core.XO(A02, new com.facebook.ads.redexgen.core.C0755Hp(this)).A07();
                return;
            }
        }
        this.A0W.setToolbarActionMode(8);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0775Ij
    public final void A1I(boolean z) {
        this.A0J = z;
        A0v(z, 4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006d, code lost:
    
        if (r5 == 1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006f, code lost:
    
        r4 = r6.A07;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007e, code lost:
    
        if (com.facebook.ads.redexgen.core.AnonymousClass55.A0p[4].charAt(14) == 'r') goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0085, code lost:
    
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0095, code lost:
    
        com.facebook.ads.redexgen.core.AnonymousClass55.A0p[5] = "A4MeJOKX43Wbu7wDNPQrh0qwNu1xfN10";
        r4.A0C();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0092, code lost:
    
        if (r5 == 1) goto L23;
     */
    @Override // com.facebook.ads.redexgen.core.AbstractC0775Ij
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A1J(boolean z) {
        if (!this.A0C) {
            this.A0X.A0m(z);
        }
        if (this.A09 != null) {
            boolean z2 = this.A0C;
            java.lang.String[] strArr = A0p;
            if (strArr[1].charAt(10) != strArr[2].charAt(10)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0p;
            strArr2[1] = "0qZcOgUU1tryulZiP6XyTUbAv74itU8r";
            strArr2[2] = "FbQDSrVtnmrn6n1tCiGdEtRCABZgMVu6";
            if (!z2) {
                this.A09.A0H(z);
            }
        }
        this.A0C = false;
        if (this.A0b.A0n()) {
            return;
        }
        if (this.A07 != null) {
            int i = getResources().getConfiguration().orientation;
            if (A0p[5].charAt(30) != '1') {
                A0p[5] = "NO4KYfXMvMpDq3TiuILiTAIZZLlPHE1o";
            } else {
                java.lang.String[] strArr3 = A0p;
                strArr3[1] = "uxhOTaOwbBr7x682JVxutMugyCdaSc2z";
                strArr3[2] = "WtxTL59IucrgXt9Ertpm7Y8tzE2Zsttw";
            }
        }
        this.A0A = this.A0b.getVideoStartReason();
        this.A0L = z;
        this.A0b.A0i(false, 13);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0775Ij
    public final void A1K(boolean z) {
        if (this.A0b.getState() == com.facebook.ads.redexgen.core.EnumC1578fm.A06 || this.A0A == null) {
            return;
        }
        if (!this.A0L || z) {
            com.facebook.ads.redexgen.core.C0673Ek c0673Ek = this.A0b;
            com.facebook.ads.redexgen.core.EnumC1523et enumC1523et = this.A0A;
            java.lang.String[] strArr = A0p;
            if (strArr[3].length() != strArr[0].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0p;
            strArr2[1] = "9WZdaf1ZSKrkBdUpSM4gGNVox8spVJjj";
            strArr2[2] = "I46V5u0Uk9rGg82Mpkl9CB9pMmc46Jha";
            c0673Ek.A0e(enumC1523et, 19);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0775Ij
    public final boolean A1L() {
        if (super.A06.A29().A0V() && super.A06.A29().A0K().A04()) {
            boolean z = this.A0I;
            if (A0p[4].charAt(14) != 'r') {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A0p;
            strArr[1] = "C2SzQuWg94rP8CljhRH7nkSf4iQhtgDx";
            strArr[2] = "CARYfrdNq1rie86wRQdSwAxjb6sfTLqG";
            if (!z) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0775Ij
    public final boolean A1M() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0775Ij
    public final boolean A1N() {
        return this.A0B;
    }

    public final boolean A1O() {
        return !A0x();
    }

    public com.facebook.ads.redexgen.core.C0894Na getColors() {
        return this.A0T;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0775Ij
    public com.facebook.ads.redexgen.core.C1454dk getFullScreenAdStyle() {
        return new com.facebook.ads.redexgen.core.C1454dk(true, com.facebook.ads.redexgen.core.C1454dk.A06, super.A06.A28().A01(), com.facebook.ads.redexgen.core.ViewOnClickListenerC0834Kr.A05(super.A06), super.A06.A28().A01().A08(true), super.A06.A29().A0H().A08());
    }

    private int getHeightPixels() {
        android.util.DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        return displayMetrics.heightPixels;
    }

    private com.facebook.ads.redexgen.core.ViewOnClickListenerC0834Kr getRegularCtaForEndCard() {
        com.facebook.ads.redexgen.core.ViewOnClickListenerC0834Kr viewOnClickListenerC0834Kr = new com.facebook.ads.redexgen.core.ViewOnClickListenerC0834Kr(this.A0U, super.A06.A0w(), super.A06.A28().A01(), super.A08, super.A0B, (com.facebook.ads.redexgen.core.C1581fp) null, super.A0A, super.A06.A2A());
        viewOnClickListenerC0834Kr.setViewShowsOverMedia(true);
        com.facebook.ads.redexgen.core.YB.A0K(viewOnClickListenerC0834Kr);
        viewOnClickListenerC0834Kr.setText(super.A06.A29().A0J().A04());
        com.facebook.ads.redexgen.core.YB.A0G(1001, viewOnClickListenerC0834Kr);
        viewOnClickListenerC0834Kr.setCta(super.A06.A29().A0J(), super.A06.A2E(), new java.util.HashMap(), null);
        return viewOnClickListenerC0834Kr;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0775Ij, android.view.View
    public final void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.A0I) {
            return;
        }
        A0X(configuration.orientation);
        A0w(this.A0D, false);
        if (this.A07 != null) {
            this.A07.A0D(configuration.orientation);
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            A1K(false);
        } else {
            this.A0C = true;
            A1J(false);
        }
    }

    private void setUpBrowserControls(com.facebook.ads.redexgen.core.M3 m3) {
        if (this.A04 != null) {
            com.facebook.ads.redexgen.core.YB.A0J(this.A04);
        }
        this.A04 = new com.facebook.ads.redexgen.core.M8(this.A0U, m3, true);
        if (this.A0m) {
            A0v(this.A0J, 1);
        }
        m3.setBrowserNavigationListener(this.A04.getBrowserNavigationListener());
        com.facebook.ads.redexgen.core.YB.A0K(this.A04);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(com.facebook.ads.redexgen.core.XV.A0v, com.facebook.ads.redexgen.core.XV.A0v, com.facebook.ads.redexgen.core.XV.A0v, com.facebook.ads.redexgen.core.XV.A0v);
        this.A04.setListener(new com.facebook.ads.redexgen.core.C0756Hq(this));
        this.A03.addView(this.A04, layoutParams);
        if (this.A05 != null) {
            com.facebook.ads.redexgen.core.YB.A0J(this.A05);
        }
        this.A05 = new com.facebook.ads.redexgen.core.C1265ah(this.A0U, null, android.R.attr.progressBarStyleHorizontal);
        this.A03.addView(this.A05, new android.widget.LinearLayout.LayoutParams(-1, A0q));
    }
}
