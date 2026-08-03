package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.5S, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class C5S extends com.facebook.ads.redexgen.core.AbstractC0775Ij {
    public static byte[] A0e;
    public static java.lang.String[] A0f = {"uwiFFMiPjkxeIpnCelDmRbiHk5Vwnfgt", "wLfFuslsjBH4uPGwj2Xycf6hIgRvR8Oe", "HvNwre", "LU1P5nNd", "IrSP0rhp", "3tH6XBAURu1AudBFEixfPGQY1Q", "mKjuxDaulnRYw", "yhw0zrPGEZfB7fyQoDKXN69L0o"};
    public static final int A0g;
    public static final int A0h;
    public static final int A0i;
    public static final int A0j;
    public static final int A0k;
    public static final int A0l;
    public static final int A0m;
    public static final int A0n;
    public static final int A0o;
    public static final int A0p;
    public static final int A0q;
    public float A00;
    public com.facebook.ads.redexgen.core.C0894Na A01;
    public com.facebook.ads.redexgen.core.XO A02;
    public com.facebook.ads.redexgen.core.C1365cJ A03;
    public com.facebook.ads.redexgen.core.C1497eS A04;
    public com.facebook.ads.redexgen.core.EnumC1523et A05;
    public com.facebook.ads.redexgen.core.DR A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public final int A0D;
    public final int A0E;
    public final int A0F;
    public final int A0G;
    public final int A0H;
    public final android.os.Handler A0I;
    public final android.view.View A0J;
    public final com.facebook.ads.redexgen.core.C1636gi A0K;
    public final com.facebook.ads.redexgen.core.VI A0L;
    public final com.facebook.ads.redexgen.core.AbstractC1171Yb A0M;
    public final com.facebook.ads.redexgen.core.AbstractC1299bF A0N;
    public final com.facebook.ads.redexgen.core.ViewOnClickListenerC0834Kr A0O;
    public final com.facebook.ads.redexgen.core.InterfaceC1456dm A0P;
    public final com.facebook.ads.redexgen.core.C1491eM A0Q;
    public final com.facebook.ads.redexgen.core.C0683Eu A0R;
    public final com.facebook.ads.redexgen.core.C0673Ek A0S;
    public final com.facebook.ads.redexgen.core.C4L A0T;
    public final com.facebook.ads.redexgen.core.EA A0U;
    public final com.facebook.ads.redexgen.core.E8 A0V;
    public final com.facebook.ads.redexgen.core.E4 A0W;
    public final com.facebook.ads.redexgen.core.E2 A0X;
    public final com.facebook.ads.redexgen.core.E0 A0Y;
    public final com.facebook.ads.redexgen.core.AbstractC0662Dz A0Z;
    public final com.facebook.ads.redexgen.core.C0649Dm A0a;
    public final com.facebook.ads.redexgen.core.DZ A0b;
    public final boolean A0c;
    public final boolean A0d;

    public static java.lang.String A0C(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A0e, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 71);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A0J() {
        A0e = new byte[]{82, 94, 92, com.google.common.base.Ascii.US, 87, 80, 82, 84, 83, 94, 94, 90, com.google.common.base.Ascii.US, 80, 85, 66, com.google.common.base.Ascii.US, 88, 95, 69, 84, 67, 66, 69, 88, 69, 88, 80, 93, com.google.common.base.Ascii.US, 82, 93, 88, 82, 90, 84, 85, 54, 33, 51, 37, 54, 32, 33, 32, com.google.common.base.Ascii.ESC, 50, 45, 32, 33, 43, 105, 118, 123, 122, 112};
    }

    static {
        A0J();
        A0k = (int) (com.facebook.ads.redexgen.core.XX.A02 * 48.0f);
        A0i = com.facebook.ads.redexgen.core.P3.A02(-1, 77);
        A0p = (int) (com.facebook.ads.redexgen.core.XX.A02 * 26.0f);
        A0q = (int) (com.facebook.ads.redexgen.core.XX.A02 * 12.0f);
        A0m = (int) (com.facebook.ads.redexgen.core.XX.A02 * 12.0f);
        A0n = (int) (com.facebook.ads.redexgen.core.XX.A02 * 44.0f);
        A0l = com.facebook.ads.redexgen.core.XV.A0v;
        A0o = (int) (com.facebook.ads.redexgen.core.XX.A02 * 16.0f);
        A0j = com.facebook.ads.redexgen.core.P3.A02(A0i, 90);
        A0h = (int) (com.facebook.ads.redexgen.core.XX.A02 * 4.0f);
        A0g = (int) (com.facebook.ads.redexgen.core.XX.A03 * 32.0f);
    }

    public C5S(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.VA va, com.facebook.ads.redexgen.core.AbstractC1801jd abstractC1801jd, com.facebook.ads.redexgen.core.C1042Sx c1042Sx, com.facebook.ads.redexgen.core.ZU zu, int i, com.facebook.ads.redexgen.core.InterfaceC1177Yh interfaceC1177Yh, com.facebook.ads.redexgen.core.VI vi, com.facebook.ads.redexgen.core.AbstractC1171Yb abstractC1171Yb, int i2, int customVideoDurationMs, int i3, boolean z, int i4, boolean z2, boolean z3, boolean z4, com.facebook.ads.redexgen.core.InterfaceC1456dm interfaceC1456dm, int i5, int i6) {
        super(c1636gi, zu, va, abstractC1801jd, i, z3, z4, interfaceC1177Yh, i6);
        com.facebook.ads.redexgen.core.C0894Na A00;
        this.A0I = new android.os.Handler(android.os.Looper.getMainLooper());
        this.A00 = 0.0f;
        this.A07 = false;
        this.A08 = false;
        this.A0C = false;
        this.A09 = false;
        this.A0A = false;
        this.A0Y = new com.facebook.ads.redexgen.core.E0() { // from class: com.facebook.ads.redexgen.X.5g
            public static java.lang.String[] A01 = {"7gUYNYKFrrI6cUcpcHgvAqL4Gs6ZbmaO", "eulXJJXioKb3UmnXwerKdv", "DeECHluE8BU5loeJcqNW1HYG1mHcuBH8", "x81kE4wfDh8vlLxHq80CctXU2mbMn00Z", "zBHmazzeC9pHgiKU9uedQ6l4AdxQz", "WRgOWCAEbqLirqS5ZGHJuFqEkTHfhP5W", "572CNMLKJv9WD0LgrUqd1zfS4LkJfaLe", "B1saI0DOHUkU6pw"};

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.UN
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(com.facebook.ads.redexgen.core.E1 e1) {
                com.facebook.ads.redexgen.core.DZ dz;
                com.facebook.ads.redexgen.core.ViewOnClickListenerC0834Kr viewOnClickListenerC0834Kr;
                com.facebook.ads.redexgen.core.C1636gi c1636gi2;
                com.facebook.ads.redexgen.core.C1636gi c1636gi3;
                com.facebook.ads.redexgen.core.AbstractC1299bF abstractC1299bF;
                com.facebook.ads.redexgen.core.AbstractC1299bF abstractC1299bF2;
                com.facebook.ads.redexgen.core.AbstractC1299bF abstractC1299bF3;
                com.facebook.ads.redexgen.core.C5S.this.A0C = true;
                if (com.facebook.ads.redexgen.core.C5S.this.getAdDataBundle().A1c()) {
                    c1636gi2 = com.facebook.ads.redexgen.core.C5S.this.A0K;
                    com.facebook.ads.redexgen.core.AbstractC0888Mt A002 = com.facebook.ads.redexgen.core.C0889Mu.A00(c1636gi2, ((com.facebook.ads.redexgen.core.AbstractC0775Ij) com.facebook.ads.redexgen.core.C5S.this).A08, "", com.facebook.ads.redexgen.core.XB.A00(((com.facebook.ads.redexgen.core.AbstractC0775Ij) com.facebook.ads.redexgen.core.C5S.this).A06.A29().A0J().A05()), new java.util.HashMap(), ((com.facebook.ads.redexgen.core.AbstractC0775Ij) com.facebook.ads.redexgen.core.C5S.this).A06.A2A());
                    c1636gi3 = com.facebook.ads.redexgen.core.C5S.this.A0K;
                    c1636gi3.A0F().AKh(com.facebook.ads.redexgen.core.XL.A00((float) ((com.facebook.ads.redexgen.core.AbstractC0775Ij) com.facebook.ads.redexgen.core.C5S.this).A06.A0k()), com.facebook.ads.redexgen.core.C5S.this.getResources().getConfiguration().orientation, true, true, com.facebook.ads.redexgen.core.AbstractC0888Mt.A0C(A002));
                    com.facebook.ads.redexgen.core.C5S.this.A0L(com.facebook.ads.redexgen.core.C5S.this.getResources().getConfiguration().orientation);
                    abstractC1299bF = com.facebook.ads.redexgen.core.C5S.this.A0N;
                    abstractC1299bF.setVisibility(0);
                    abstractC1299bF2 = com.facebook.ads.redexgen.core.C5S.this.A0N;
                    if (abstractC1299bF2 instanceof com.facebook.ads.redexgen.core.LK) {
                        abstractC1299bF3 = com.facebook.ads.redexgen.core.C5S.this.A0N;
                        ((com.facebook.ads.redexgen.core.LK) abstractC1299bF3).A0u(com.facebook.ads.redexgen.core.C5S.this.getResources().getConfiguration().orientation);
                    }
                }
                if (com.facebook.ads.redexgen.core.C5S.this.getAdDataBundle().A1e()) {
                    com.facebook.ads.redexgen.core.C5S c5s = com.facebook.ads.redexgen.core.C5S.this;
                    if (A01[7].length() != 15) {
                        throw new java.lang.RuntimeException();
                    }
                    java.lang.String[] strArr = A01;
                    strArr[2] = "UfF1b519MGYLAJGTcPK3SRNJ7v4WOh3N";
                    strArr[0] = "9iqifXeSGzjDh5N7cdDazqMOJ7agOy96";
                    dz = c5s.A0b;
                    viewOnClickListenerC0834Kr = com.facebook.ads.redexgen.core.C5S.this.A0O;
                    dz.setOnClickListener(viewOnClickListenerC0834Kr);
                }
            }
        };
        this.A0X = new com.facebook.ads.redexgen.core.E2() { // from class: com.facebook.ads.redexgen.X.5c
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.UN
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(com.facebook.ads.redexgen.core.E3 e3) {
                if (!((com.facebook.ads.redexgen.core.AbstractC0775Ij) com.facebook.ads.redexgen.core.C5S.this).A0A.A07()) {
                    com.facebook.ads.redexgen.core.C5S.this.A1F();
                }
            }
        };
        this.A0W = new com.facebook.ads.redexgen.core.E4() { // from class: com.facebook.ads.redexgen.X.5a
            @Override // com.facebook.ads.redexgen.core.UN
            public final /* bridge */ /* synthetic */ void A03(com.facebook.ads.redexgen.core.C4B c4b) {
            }
        };
        this.A0Z = new com.facebook.ads.redexgen.core.AbstractC0662Dz() { // from class: com.facebook.ads.redexgen.X.5Z
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.UN
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(com.facebook.ads.redexgen.core.C4A c4a) {
                float f;
                com.facebook.ads.redexgen.core.C0673Ek c0673Ek;
                com.facebook.ads.redexgen.core.InterfaceC1456dm interfaceC1456dm2;
                com.facebook.ads.redexgen.core.C5S.this.A0R(c4a);
                f = com.facebook.ads.redexgen.core.C5S.this.A00;
                c0673Ek = com.facebook.ads.redexgen.core.C5S.this.A0S;
                float duration = (f * c0673Ek.getDuration()) + c4a.A00();
                interfaceC1456dm2 = com.facebook.ads.redexgen.core.C5S.this.A0P;
                interfaceC1456dm2.ADw(duration);
            }
        };
        this.A0U = new com.facebook.ads.redexgen.core.EA() { // from class: com.facebook.ads.redexgen.X.5U
            public static java.lang.String[] A01 = {"wKs2F0CoKZ83CrYftessGgwUooVDkZ8i", "2Ibb583RxwN39nWjhOn5WWPQj1VmynHE", "A0Qs557f", "DKPVxx7rRSfdfe4bDqdhQ5dEhLiH9LON", "bebhf1UP90kEJwgsUj64UnMMPskca", "Y97MwE7h44FvVbPafIuJT7XHPF7ToAyu", "yGLwGxqGR6Hkk5b2IyfusTMojDv2e", "vJPYkkaf"};

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.UN
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(com.facebook.ads.redexgen.core.C4K c4k) {
                com.facebook.ads.redexgen.core.InterfaceC1456dm interfaceC1456dm2;
                com.facebook.ads.redexgen.core.C0673Ek c0673Ek;
                float f;
                com.facebook.ads.redexgen.core.InterfaceC1456dm interfaceC1456dm3;
                com.facebook.ads.redexgen.core.C0673Ek c0673Ek2;
                interfaceC1456dm2 = com.facebook.ads.redexgen.core.C5S.this.A0P;
                c0673Ek = com.facebook.ads.redexgen.core.C5S.this.A0S;
                interfaceC1456dm2.ADc(c0673Ek.getDuration());
                f = com.facebook.ads.redexgen.core.C5S.this.A00;
                if (f < ((com.facebook.ads.redexgen.core.AbstractC0775Ij) com.facebook.ads.redexgen.core.C5S.this).A06.A29().A0G()) {
                    com.facebook.ads.redexgen.core.C5S.A01(com.facebook.ads.redexgen.core.C5S.this, 1.0f);
                    c0673Ek2 = com.facebook.ads.redexgen.core.C5S.this.A0S;
                    c0673Ek2.A0e(com.facebook.ads.redexgen.core.EnumC1523et.A02, 28);
                    return;
                }
                com.facebook.ads.redexgen.core.C5S c5s = com.facebook.ads.redexgen.core.C5S.this;
                java.lang.String[] strArr = A01;
                if (strArr[3].charAt(6) != strArr[5].charAt(6)) {
                    throw new java.lang.RuntimeException();
                }
                java.lang.String[] strArr2 = A01;
                strArr2[0] = "gUju5w26hU6oOlSn7mf4ATVXJhH4p8zJ";
                strArr2[1] = "33WeYKtkMTovDIRRTCZ4bD6vTYI44Qru";
                if (!c5s.A1L()) {
                    interfaceC1456dm3 = com.facebook.ads.redexgen.core.C5S.this.A0P;
                    interfaceC1456dm3.ADA();
                } else {
                    com.facebook.ads.redexgen.core.C5S.this.A1G();
                }
            }
        };
        this.A0V = new com.facebook.ads.redexgen.core.C5T(this);
        this.A0K = c1636gi;
        this.A0L = vi;
        this.A0M = abstractC1171Yb;
        this.A0H = i5;
        int i7 = -1;
        if (!super.A06.A1c()) {
            this.A0J = new com.facebook.ads.redexgen.core.C0642Df(this.A0K, vi);
        } else {
            i7 = i5;
            this.A0J = new com.facebook.ads.redexgen.core.C0640Dd(this.A0K, vi);
        }
        this.A0b = new com.facebook.ads.redexgen.core.DZ(this.A0K, i7);
        if (this.A00 < abstractC1801jd.A29().A0G()) {
            this.A0b.setShouldClearAnimationWhenVideoCompleted(false);
        }
        this.A0F = i4;
        this.A0d = z2;
        this.A0E = i2;
        this.A0G = customVideoDurationMs;
        this.A0P = interfaceC1456dm;
        this.A0D = i3;
        this.A0c = z;
        this.A0Q = new com.facebook.ads.redexgen.core.C1491eM(this.A0K, va, super.A06);
        if (customVideoDurationMs == 1) {
            A00 = super.A06.A28().A01();
        } else {
            A00 = super.A06.A28().A00();
        }
        this.A01 = A00;
        this.A0S = new com.facebook.ads.redexgen.core.C0673Ek(this.A0K);
        this.A0S.getEventBus().A03(this.A0Y, this.A0X, this.A0W, this.A0Z, this.A0U, this.A0V);
        this.A0T = new com.facebook.ads.redexgen.core.C4L(c1636gi, va, this.A0S, abstractC1801jd.A2E(), 0, 0, abstractC1801jd.A29().A0U(), null, null);
        A0I();
        this.A0S.setVideoURI(c1042Sx.A0T(super.A06.A29().A0H().A09()));
        A0H();
        com.facebook.ads.redexgen.core.XR A02 = super.A09.A02(abstractC1801jd);
        this.A0K.A0H().A00(A02.A01);
        this.A0N = A06();
        if (this.A0N instanceof com.facebook.ads.redexgen.core.C0820Kd) {
            new com.facebook.ads.redexgen.core.DA(this.A0N, 400, 100, 0).A4A(true, false);
        } else {
            this.A0N.setVisibility(8);
        }
        this.A0a = new com.facebook.ads.redexgen.core.C0649Dm(true, abstractC1801jd.A29().A0U());
        A0K();
        this.A0O = this.A0N.getCTAButton();
        if (A02.A00) {
            this.A0S.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.dN
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    com.facebook.ads.redexgen.core.C5S.this.A1O(view);
                }
            });
        }
        com.facebook.ads.redexgen.core.YB.A0G(1001, this.A0O);
        A0G();
        if (!getAdDataBundle().A1c()) {
            A0F();
        }
        this.A0N.bringToFront();
        if (com.facebook.ads.redexgen.core.C1086Up.A1z(this.A0K)) {
            this.A0K.A0B().AKn(this.A0S, super.A06.A2E(), true);
        }
        if (com.facebook.ads.redexgen.core.C1086Up.A20(this.A0K)) {
            this.A0R = new com.facebook.ads.redexgen.core.C0683Eu(this.A0K, va, this.A0S, super.A06.A2E(), abstractC1801jd.A29().A0U(), this.A0T, null);
        } else {
            this.A0R = null;
        }
    }

    public static /* synthetic */ float A01(com.facebook.ads.redexgen.core.C5S c5s, float f) {
        float f2 = c5s.A00 + f;
        c5s.A00 = f2;
        return f2;
    }

    private com.facebook.ads.redexgen.core.AbstractC1299bF A06() {
        java.lang.String A0C;
        com.facebook.ads.redexgen.core.AbstractC1299bF c0820Kd;
        android.widget.RelativeLayout.LayoutParams adDetailsParams = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        adDetailsParams.addRule(12);
        if (super.A06.A10().equals(A0C(37, 14, 3))) {
            A0C = com.facebook.ads.redexgen.core.EnumC1529ez.A04.A03();
        } else {
            A0C = A0C(0, 37, 118);
        }
        double A0k2 = super.A06.A0k();
        if (!getAdDataBundle().A1c()) {
            com.facebook.ads.redexgen.core.C1636gi c1636gi = this.A0K;
            int i = A0k;
            boolean z = super.A06.A29().A0I().A00() == com.facebook.ads.redexgen.core.NW.A05;
            com.facebook.ads.redexgen.core.C0894Na colors = getColors();
            boolean A06 = super.A06.A29().A0J().A06();
            com.facebook.ads.redexgen.core.VA va = super.A08;
            com.facebook.ads.redexgen.core.InterfaceC1177Yh interfaceC1177Yh = super.A0B;
            com.facebook.ads.redexgen.core.C1581fp c1581fp = super.A0D;
            com.facebook.ads.redexgen.core.Y2 y2 = super.A0A;
            com.facebook.ads.redexgen.core.AbstractC1801jd abstractC1801jd = super.A06;
            if (A0f[1].charAt(3) != 'F') {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A0f;
            strArr[5] = "xymrPLzTH8UHDAaiBZe05WSUA2";
            strArr[7] = "XCaDYNVy2gwp6c65cWzWipC7tC";
            c0820Kd = new com.facebook.ads.redexgen.core.C0820Kd(c1636gi, null, i, z, colors, A06, A0C, va, interfaceC1177Yh, c1581fp, y2, abstractC1801jd);
        } else {
            c0820Kd = new com.facebook.ads.redexgen.core.C1338bs((float) A0k2, A0C, this.A0K, getColors(), super.A06, super.A0B, this.A0O, com.facebook.ads.redexgen.core.AbstractC0775Ij.A0G, false, super.A08, super.A0D, super.A0A, this.A0b, this.A0L, false).A03();
            ((com.facebook.ads.redexgen.core.LK) c0820Kd).setChainedAdInfo(super.A00);
        }
        c0820Kd.getCTAButton().getCtaActionHelper().A08(super.A06);
        c0820Kd.getCTAButton().setCreativeAsCtaLoggingHelper(super.A09);
        com.facebook.ads.redexgen.core.YB.A0G(1008, c0820Kd);
        c0820Kd.A0l(this.A0G);
        addView(c0820Kd, adDetailsParams);
        c0820Kd.setInfo(super.A06.A29().A0I(), super.A06.A29().A0J(), super.A06.A2E(), super.A06.A2C().A01(), null, null);
        return c0820Kd;
    }

    private void A0D() {
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        if (this.A04 != null) {
            com.facebook.ads.redexgen.core.C1497eS c1497eS = this.A04;
            if (A0f[6].length() != 13) {
                throw new java.lang.RuntimeException();
            }
            A0f[0] = "pczVUfQTZlSxQoKEEMr5D2oLadoOsoUQ";
            c1497eS.A0f(false);
            addView(this.A04.A0W(), layoutParams);
        }
    }

    private void A0E() {
        if (getAdDataBundle().A29().A0K().A03() && !getAdDataBundle().A29().A0K().A02().isEmpty()) {
            com.facebook.ads.redexgen.core.YB.A0d(this.A0N, this.A0J, this.A0O);
            this.A04 = new com.facebook.ads.redexgen.core.C1497eS(this.A0K, getAdDataBundle(), super.A0B, this.A0O, this.A0I, this.A0L);
            A0D();
        } else {
            if (getAdDataBundle().A29().A0K().A04() || getAdDataBundle().A29().A0K().A03()) {
                com.facebook.ads.redexgen.core.YB.A0d(this.A0N, this.A0J, this.A0O);
                this.A03 = new com.facebook.ads.redexgen.core.C1365cJ(this.A0K, super.A06, this.A0L, this.A0I, super.A0B);
                this.A03.A0I(false);
                addView(this.A03.A0C(this.A0O));
                return;
            }
            android.util.Pair<com.facebook.ads.redexgen.core.EnumC1490eL, android.view.View> A03 = this.A0Q.A03(this.A0O);
            android.view.View endCardView = (android.view.View) A03.second;
            com.facebook.ads.redexgen.core.YB.A0G(1101, endCardView);
            A0Q((com.facebook.ads.redexgen.core.EnumC1490eL) A03.first, endCardView);
        }
    }

    private void A0F() {
        this.A0b.A08(-1, A0i, false);
        this.A0b.setPadding(A0q, A0q, A0q, A0q);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, A0p);
        layoutParams.addRule(12);
        addView(this.A0b, layoutParams);
    }

    private void A0G() {
        android.widget.RelativeLayout.LayoutParams layoutParams;
        if (!super.A06.A1c()) {
            this.A0J.setPadding(A0m, A0m, A0m, A0m);
            layoutParams = new android.widget.RelativeLayout.LayoutParams(A0n, A0n);
            layoutParams.setMargins(0, com.facebook.ads.redexgen.core.AbstractC1171Yb.A00, A0l, 0);
            layoutParams.addRule(11);
            layoutParams.addRule(10);
        } else {
            layoutParams = new android.widget.RelativeLayout.LayoutParams(A0g, A0g);
            layoutParams.setMargins(com.facebook.ads.redexgen.core.XV.A0b, com.facebook.ads.redexgen.core.XV.A0r, com.facebook.ads.redexgen.core.XV.A0b, com.facebook.ads.redexgen.core.XV.A0Z);
            layoutParams.addRule(9);
        }
        android.view.ViewGroup.LayoutParams videoViewParams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        addView(this.A0S, videoViewParams);
        addView(this.A0J, layoutParams);
    }

    private void A0H() {
        postDelayed(new com.facebook.ads.redexgen.core.IL(this), com.facebook.ads.redexgen.core.C1086Up.A0P(this.A0K));
    }

    private void A0I() {
        this.A0S.A0f(this.A0b);
        if (this.A0J instanceof com.facebook.ads.redexgen.core.InterfaceC1524eu) {
            this.A0S.A0f((com.facebook.ads.redexgen.core.InterfaceC1524eu) this.A0J);
        }
        if (!android.text.TextUtils.isEmpty(super.A06.A29().A0H().A08())) {
            com.facebook.ads.redexgen.core.C3S c3s = new com.facebook.ads.redexgen.core.C3S(this.A0K);
            this.A0S.A0f(c3s);
            c3s.setImage(super.A06.A29().A0H().A08());
        }
        this.A0S.A0f(new com.facebook.ads.redexgen.core.C3B(this.A0K));
    }

    private final void A0K() {
        android.view.View expandableLayout = this.A0N.getExpandableLayout();
        if (expandableLayout != null) {
            if (this.A06 != null) {
                com.facebook.ads.redexgen.core.C0649Dm c0649Dm = this.A0a;
                com.facebook.ads.redexgen.core.DR dr = this.A06;
                java.lang.String[] strArr = A0f;
                if (strArr[5].length() != strArr[7].length()) {
                    throw new java.lang.RuntimeException();
                }
                A0f[1] = "yPUFQNIw4jpGFPLG5nXj9YsdQuCVJrWl";
                c0649Dm.A0L(dr);
            }
            com.facebook.ads.redexgen.core.C0894Na A01 = super.A06.A28().A01();
            this.A0a.A0L(new com.facebook.ads.redexgen.core.DB(this.A0N.getCTAButton(), androidx.compose.animation.core.AnimationConstants.DefaultDurationMillis, -1, A01.A0A(true)));
            android.graphics.drawable.Drawable A08 = com.facebook.ads.redexgen.core.YB.A08(A0i, A0j, A0h);
            android.graphics.drawable.Drawable endDrawable = com.facebook.ads.redexgen.core.YB.A05(A01.A09(true), A0h);
            this.A0a.A0L(new com.facebook.ads.redexgen.core.DS(this.A0N.getCTAButton(), androidx.compose.animation.core.AnimationConstants.DefaultDurationMillis, A08, endDrawable));
            this.A0a.A0L(new com.facebook.ads.redexgen.core.DQ(expandableLayout, androidx.compose.material.TextFieldImplKt.AnimationDuration, false));
            this.A0a.AAv(this.A0S);
            this.A0a.A0K(com.ironsource.E9.b.g);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0L(int i) {
        if (!getAdDataBundle().A1c()) {
            return;
        }
        this.A0K.A0F().AKj(i);
        this.A0S.A0Z(i);
        A0M(i, this.A0S, (android.widget.RelativeLayout) this.A0S.getVideoView());
    }

    private final void A0M(int i, android.view.ViewGroup viewGroup, android.widget.RelativeLayout relativeLayout) {
        if (this.A0N instanceof com.facebook.ads.redexgen.core.LK) {
            boolean z = this.A0N instanceof com.facebook.ads.redexgen.core.C6V;
            if (A0f[0].charAt(8) == 'J') {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A0f;
            strArr[5] = "oeSYnKfd6qg69aJdYBhoeO0UNx";
            strArr[7] = "WvPjUISg3i5kB9lwMl0NPsGMqU";
            if (z || (this.A0N instanceof com.facebook.ads.redexgen.core.C6U)) {
                com.facebook.ads.redexgen.core.YB.A0J(this.A0N);
                android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
                if (getResources().getConfiguration().orientation == 2) {
                    layoutParams.addRule(1, relativeLayout.getId());
                    this.A0N.setLayoutParams(layoutParams);
                    viewGroup.addView(this.A0N);
                } else {
                    addView(this.A0N, layoutParams);
                }
            }
            this.A0N.A0l(i);
            ((com.facebook.ads.redexgen.core.LK) this.A0N).A0y(viewGroup, relativeLayout, i);
        }
    }

    private void A0Q(com.facebook.ads.redexgen.core.EnumC1490eL enumC1490eL, android.view.View view) {
        this.A0S.A0h(false);
        this.A0S.setVisibility(8);
        switch (com.facebook.ads.redexgen.core.C1433dP.A00[enumC1490eL.ordinal()]) {
            case 1:
                this.A0N.setVisibility(0);
                android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
                layoutParams.setMargins(0, com.facebook.ads.redexgen.core.AbstractC1171Yb.A00, 0, 0);
                layoutParams.addRule(2, this.A0N.getId());
                addView(view, layoutParams);
                break;
            case 2:
                com.facebook.ads.redexgen.core.YB.A0d(this.A0N);
                android.widget.RelativeLayout.LayoutParams layoutParams2 = new android.widget.RelativeLayout.LayoutParams(-1, -1);
                layoutParams2.setMargins(A0o, A0o, A0o, A0o);
                addView(view, layoutParams2);
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0R(com.facebook.ads.redexgen.core.C4A c4a) {
        if (this.A0S.getState() == com.facebook.ads.redexgen.core.EnumC1578fm.A02 && com.facebook.ads.redexgen.core.C1086Up.A1e(this.A0K)) {
            postDelayed(new com.facebook.ads.redexgen.core.I7(this, c4a), 5000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0S(java.lang.String str) {
        if (!this.A0A) {
            this.A0A = true;
            this.A0P.AGQ(str);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0775Ij
    public final com.facebook.ads.redexgen.core.EnumC0885Mq A1D(java.lang.String str) {
        return this.A0O.A0E(str);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0775Ij
    public final void A1E() {
        super.A1E();
        this.A0N.A0j();
        if (this.A02 != null) {
            com.facebook.ads.redexgen.core.XO xo = this.A02;
            java.lang.String[] strArr = A0f;
            if (strArr[4].length() != strArr[3].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0f;
            strArr2[4] = "vVds5dTr";
            strArr2[3] = "mwltsewL";
            xo.A06();
        }
        this.A0I.removeCallbacksAndMessages(null);
        if (this.A04 != null) {
            this.A04.A0Y();
        }
        if (this.A03 != null) {
            this.A03.A0F();
        }
        if (com.facebook.ads.redexgen.core.C1086Up.A1z(this.A0K)) {
            this.A0K.A0B().AKU(this.A0S);
        }
        if (this.A0R != null) {
            this.A0R.A07();
        }
        if (this.A0S != null) {
            this.A0S.getEventBus().A04(this.A0Y, this.A0X, this.A0W, this.A0Z, this.A0U, this.A0V);
            com.facebook.ads.redexgen.core.YB.A0H(this.A0S);
            this.A0S.A0W();
        }
        this.A0T.A0p();
        com.facebook.ads.redexgen.core.YB.A0d(this.A0S, this.A0b, this.A0J);
        super.A0D.A0V();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0775Ij
    public final void A1G() {
        this.A0K.A0F().A4x();
        this.A07 = true;
        com.facebook.ads.redexgen.core.YB.A0W(this);
        com.facebook.ads.redexgen.core.YB.A0H(this.A0S);
        com.facebook.ads.redexgen.core.YB.A0d(this.A0S, this.A0b, this.A0J);
        A0E();
        if (this.A0D != 0 || !this.A0c) {
            this.A0P.AFw(true);
            if (this.A0M != null && getAdDataBundle().A29().A0K().A00() > 0) {
                this.A08 = false;
                if (getAdDataBundle().A2P()) {
                    this.A0M.setToolbarActionMode(8);
                } else {
                    this.A0M.setToolbarActionMode(2);
                }
                new android.os.Handler(android.os.Looper.getMainLooper()).postDelayed(new com.facebook.ads.redexgen.core.RunnableC1432dO(this), getAdDataBundle().A29().A0K().A00());
                return;
            }
            this.A08 = true;
            return;
        }
        if (this.A0d) {
            this.A0P.AKc();
        }
        if (this.A0M != null) {
            this.A0M.setToolbarActionMode(getAdDataBundle().A2P() ? 8 : 2);
        }
        this.A02 = new com.facebook.ads.redexgen.core.XO(this.A0F, 100.0f, 100L, new android.os.Handler(android.os.Looper.getMainLooper()), new com.facebook.ads.redexgen.core.IU(this));
        this.A02.A07();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0775Ij
    public final void A1H() {
        com.facebook.ads.redexgen.core.C0673Ek c0673Ek = this.A0S;
        int secondsForNextCta = super.A06.A29().A0H().A0A() ? 0 : 1065353216;
        c0673Ek.setVolume(secondsForNextCta);
        this.A0S.A0e(com.facebook.ads.redexgen.core.EnumC1523et.A02, 20);
        int A02 = super.A06.A29().A0H().A02();
        if (A02 >= 0) {
            this.A0M.setProgressSpinnerInvisible(true);
        }
        if (A02 != 0) {
            int secondsForNextCta2 = this.A0H;
            if (A02 < secondsForNextCta2) {
                if (A02 > 0) {
                    new com.facebook.ads.redexgen.core.XO(A02, new com.facebook.ads.redexgen.core.IT(this)).A07();
                    return;
                }
                return;
            }
        }
        com.facebook.ads.redexgen.core.AbstractC1171Yb abstractC1171Yb = this.A0M;
        if (A0f[6].length() != 13) {
            throw new java.lang.RuntimeException();
        }
        A0f[6] = "z6ph3MLFkPTln";
        abstractC1171Yb.setToolbarActionMode(8);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0775Ij
    public final void A1J(boolean z) {
        if (!this.A09) {
            this.A0N.A0m(z);
        }
        if (this.A04 != null && !this.A09) {
            this.A04.A0e(z);
        }
        if (this.A03 != null) {
            boolean z2 = this.A09;
            if (A0f[1].charAt(3) != 'F') {
                throw new java.lang.RuntimeException();
            }
            A0f[1] = "b5uF0JnyggmSeY84XgIRQgfLbHOcd54k";
            if (!z2) {
                this.A03.A0H(z);
            }
        }
        this.A09 = false;
        if (this.A02 != null) {
            this.A02.A06();
        }
        if (this.A0S.A0n()) {
            return;
        }
        this.A05 = this.A0S.getVideoStartReason();
        this.A0B = z;
        this.A0S.A0i(false, 13);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0775Ij
    public final void A1K(boolean z) {
        if (this.A02 != null && !this.A02.A05()) {
            this.A02.A07();
        }
        if (this.A07 || this.A0S.getState() == com.facebook.ads.redexgen.core.EnumC1578fm.A06 || this.A05 == null) {
            return;
        }
        if (!this.A0B || z) {
            this.A0S.A0e(this.A05, 19);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0775Ij
    public final boolean A1L() {
        return (this.A0D == 2 || !super.A06.A29().A0V() || this.A07) ? false : true;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0775Ij
    public final boolean A1M() {
        return this.A07;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0775Ij
    public final boolean A1N() {
        return this.A08;
    }

    public final /* synthetic */ void A1O(android.view.View view) {
        this.A0O.A0E(A0C(51, 5, 88));
    }

    public com.facebook.ads.redexgen.core.C0894Na getColors() {
        return this.A01;
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
        com.facebook.ads.redexgen.core.C0894Na A00;
        super.onConfigurationChanged(configuration);
        if (!this.A07) {
            if (getAdDataBundle().A1c()) {
                A0L(configuration.orientation);
                return;
            }
            if (configuration.orientation == 1) {
                com.facebook.ads.redexgen.core.NN A28 = super.A06.A28();
                java.lang.String[] strArr = A0f;
                if (strArr[4].length() != strArr[3].length()) {
                    throw new java.lang.RuntimeException();
                }
                A0f[1] = "ZWQFADQdeKHmDIXasxpY6pydlWSUwrFV";
                A00 = A28.A01();
            } else {
                A00 = super.A06.A28().A00();
            }
            this.A01 = A00;
            this.A0O.setViewShowsOverMedia(true);
            this.A0O.setUpButtonColors(this.A01);
            this.A0N.A0l(configuration.orientation);
            return;
        }
        if (this.A04 == null) {
            return;
        }
        this.A04.A0a(configuration.orientation);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        android.view.View expandableLayout;
        super.onLayout(z, i, i2, i3, i4);
        if (!getAdDataBundle().A1c() && (expandableLayout = this.A0N.getExpandableLayout()) != null && z && this.A06 == null) {
            this.A06 = new com.facebook.ads.redexgen.core.DR(expandableLayout, androidx.compose.animation.core.AnimationConstants.DefaultDurationMillis, expandableLayout.getHeight(), 0);
            this.A0a.A0L(this.A06);
            this.A0a.A0J();
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            A1K(false);
        } else {
            this.A09 = true;
            A1J(false);
        }
    }
}
