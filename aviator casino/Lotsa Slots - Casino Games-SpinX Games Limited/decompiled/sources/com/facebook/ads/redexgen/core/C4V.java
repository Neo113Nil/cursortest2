package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.4V, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class C4V extends com.facebook.ads.redexgen.core.AbstractC0723Gj {
    public static byte[] A0V;
    public static java.lang.String[] A0W = {"", "YtQm2387uXJs", "MlRkJczYYxJD4Wwp0SHW4B9CEOUSnddR", "Rw6HEQ3C6e1KGOQ0gaz0SQKaqXM6WP6s", "SVsTOXJGQLTRlrov45UN9nTiloFn5X8Y", "Icuwm310fXqoj23c8ds7ElfBFjsMoXLO", "Pjvv6hw4WD5DyhE4XvR8T7jl", "KYBHBzoeYb2kbTAqfKJN2TrMGpQFpmBq"};
    public int A00;
    public com.facebook.ads.redexgen.core.VH A01;
    public com.facebook.ads.redexgen.core.AbstractC1349c3 A02;
    public com.facebook.ads.redexgen.core.InterfaceC1467dy A03;
    public com.facebook.ads.redexgen.core.C1504ea A04;
    public com.facebook.ads.redexgen.core.EnumC1523et A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public final android.os.Handler A0G;
    public final android.view.View A0H;
    public final com.facebook.ads.redexgen.core.InterfaceC1004Rk A0I;
    public final com.facebook.ads.redexgen.core.AbstractC1171Yb A0J;
    public final com.facebook.ads.redexgen.core.InterfaceC1466dx A0K;
    public final com.facebook.ads.redexgen.core.C0683Eu A0L;
    public final com.facebook.ads.redexgen.core.C0673Ek A0M;
    public final com.facebook.ads.redexgen.core.C4L A0N;
    public final com.facebook.ads.redexgen.core.EA A0O;
    public final com.facebook.ads.redexgen.core.E8 A0P;
    public final com.facebook.ads.redexgen.core.E4 A0Q;
    public final com.facebook.ads.redexgen.core.E2 A0R;
    public final com.facebook.ads.redexgen.core.E0 A0S;
    public final com.facebook.ads.redexgen.core.AbstractC0662Dz A0T;
    public final com.facebook.ads.redexgen.core.DZ A0U;

    public static java.lang.String A0A(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A0V, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 126);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A0F() {
        A0V = new byte[]{com.google.common.base.Ascii.ETB, 63, 41, 47, 63, 17, 103, 96, 122, 107, 124, 125, 122, 103, 122, 103, 111, 98, kotlin.io.encoding.Base64.padSymbol, 42, 56, 46, kotlin.io.encoding.Base64.padSymbol, 43, 42, 43, com.google.common.base.Ascii.DLE, 57, 38, 43, 42, 32, 49, 41, 43, 50};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private synchronized void A0S(boolean z, boolean z2) {
        if (this.A03 != null) {
            this.A08 = false;
            return;
        }
        if (this.A08) {
            boolean A2C = com.facebook.ads.redexgen.core.C1086Up.A2C(super.A05);
            if (!z && (!A2C || !z2)) {
                if (z2) {
                    super.A05.A0F().ACC();
                }
                super.A0A.A4j(super.A0B.A6l());
                this.A04.A06();
                this.A08 = false;
                if (this.A02 != null) {
                    this.A02.A1D();
                }
                return;
            }
            this.A08 = false;
        }
    }

    static {
        A0F();
    }

    public C4V(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.ZU zu, com.facebook.ads.redexgen.core.VA va, com.facebook.ads.redexgen.core.AbstractC1801jd abstractC1801jd, com.facebook.ads.redexgen.core.C1042Sx c1042Sx, com.facebook.ads.redexgen.core.InterfaceC1177Yh interfaceC1177Yh) {
        super(c1636gi, zu, va, abstractC1801jd, c1042Sx, interfaceC1177Yh);
        this.A0I = new com.facebook.ads.redexgen.core.GN(this);
        this.A0S = new com.facebook.ads.redexgen.core.E0() { // from class: com.facebook.ads.redexgen.X.4w
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.UN
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(com.facebook.ads.redexgen.core.E1 e1) {
                com.facebook.ads.redexgen.core.AbstractC1349c3 abstractC1349c3;
                com.facebook.ads.redexgen.core.C4V.this.A0E = true;
                abstractC1349c3 = com.facebook.ads.redexgen.core.C4V.this.A02;
                abstractC1349c3.A1J(e1);
            }
        };
        this.A0R = new com.facebook.ads.redexgen.core.E2() { // from class: com.facebook.ads.redexgen.X.4t
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.UN
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(com.facebook.ads.redexgen.core.E3 e3) {
                com.facebook.ads.redexgen.core.C4V.this.A0F = true;
                com.facebook.ads.redexgen.core.C4V.this.A0e();
            }
        };
        this.A0Q = new com.facebook.ads.redexgen.core.E4() { // from class: com.facebook.ads.redexgen.X.4s
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.UN
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(com.facebook.ads.redexgen.core.C4B c4b) {
            }
        };
        this.A0T = new com.facebook.ads.redexgen.core.AbstractC0662Dz() { // from class: com.facebook.ads.redexgen.X.4r
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.UN
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(com.facebook.ads.redexgen.core.C4A c4a) {
                com.facebook.ads.redexgen.core.AbstractC1349c3 abstractC1349c3;
                int i;
                com.facebook.ads.redexgen.core.C4V.this.A0P(c4a);
                com.facebook.ads.redexgen.core.C4V.this.A0O(c4a);
                abstractC1349c3 = com.facebook.ads.redexgen.core.C4V.this.A02;
                i = com.facebook.ads.redexgen.core.C4V.this.A00;
                abstractC1349c3.A1K(c4a, i);
            }
        };
        this.A0O = new com.facebook.ads.redexgen.core.EA() { // from class: com.facebook.ads.redexgen.X.4q
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.UN
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(com.facebook.ads.redexgen.core.C4K c4k) {
                com.facebook.ads.redexgen.core.C0673Ek c0673Ek;
                com.facebook.ads.redexgen.core.C4V c4v = com.facebook.ads.redexgen.core.C4V.this;
                c0673Ek = com.facebook.ads.redexgen.core.C4V.this.A0M;
                c4v.A0N(c4k, c0673Ek.getState() != com.facebook.ads.redexgen.core.EnumC1578fm.A06, false);
            }
        };
        this.A0P = new com.facebook.ads.redexgen.core.C04264e(this);
        boolean z = false;
        this.A0E = false;
        this.A0F = false;
        this.A0D = false;
        this.A0C = false;
        this.A0A = false;
        this.A00 = 0;
        this.A06 = false;
        this.A09 = false;
        this.A07 = false;
        this.A01 = com.facebook.ads.redexgen.core.VH.A0c;
        this.A0G = new android.os.Handler(android.os.Looper.getMainLooper());
        this.A0K = new com.facebook.ads.redexgen.core.GE(this);
        this.A0M = new com.facebook.ads.redexgen.core.C0673Ek(super.A05);
        this.A0M.setFunnelLoggingHandler(super.A07);
        this.A0M.getEventBus().A03(this.A0S, this.A0R, this.A0Q, this.A0T, this.A0O, this.A0P);
        this.A0B = abstractC1801jd.A1t();
        this.A0N = new com.facebook.ads.redexgen.core.C4L(super.A05, super.A06, this.A0M, super.A03.A2E(), 0, 0, super.A03.A29().A0U(), null, null);
        if (com.facebook.ads.redexgen.core.C1086Up.A20(super.A05)) {
            this.A0L = new com.facebook.ads.redexgen.core.C0683Eu(super.A05, super.A06, this.A0M, super.A03.A2E(), super.A03.A29().A0U(), this.A0N, null);
        } else {
            this.A0L = null;
        }
        this.A04 = new com.facebook.ads.redexgen.core.C1504ea(super.A05, super.A0B, super.A03.A1G(), interfaceC1177Yh);
        if (!A0m()) {
            this.A0H = new com.facebook.ads.redexgen.core.C0642Df(super.A05, super.A07);
        } else {
            this.A0H = new com.facebook.ads.redexgen.core.C0640Dd(super.A05, super.A07);
        }
        int A02 = (super.A03.A1h() || A0m()) ? A02(super.A03) * 1000 : -1;
        if (!A0m()) {
            this.A0U = new com.facebook.ads.redexgen.core.DZ(super.A05, A02);
        } else {
            this.A0U = new com.facebook.ads.redexgen.core.DZ(super.A05, A02, com.facebook.ads.redexgen.core.DZ.A0D);
        }
        if ((this.A0B && !super.A03.A1r()) || super.A03.A1i()) {
            this.A0U.setVisibility(8);
        }
        if (super.A03.A29().A0U() || super.A03.A1W()) {
            this.A0U.setShouldClearAnimationWhenVideoCompleted(false);
        }
        A0E();
        java.lang.String A09 = super.A03.A29().A0H().A09();
        com.facebook.ads.redexgen.core.C0673Ek c0673Ek = this.A0M;
        java.lang.String videoUrl = super.A04.A0T(A09);
        c0673Ek.setVideoURI(videoUrl);
        A0C();
        int unskippableSeconds = super.A03.A29().A0H().A04();
        if (com.facebook.ads.redexgen.core.C1086Up.A2Q(super.A05)) {
            this.A0C = unskippableSeconds == 0;
        } else {
            this.A0C = unskippableSeconds <= 0;
        }
        if (super.A03.A29().A0S() && super.A03.A29().A0H().A03() > 0) {
            z = true;
        }
        this.A08 = z;
        java.lang.Integer toolbarBackgroundColor = getBackgroundColorForToolbar();
        if (toolbarBackgroundColor == null) {
            com.facebook.ads.redexgen.core.YB.A0N(this, super.A03.A28().A01().A08(true));
        } else {
            com.facebook.ads.redexgen.core.YB.A0N(this, toolbarBackgroundColor.intValue());
        }
        if (com.facebook.ads.redexgen.core.C1086Up.A2K(super.A05) || super.A03.A1h()) {
            super.A09.setProgressSpinnerInvisible(true);
        }
        if (super.A03.A1u()) {
            super.A05.A0F().AEX();
        }
    }

    private float A00() {
        float A04 = super.A03.A29().A0H().A04();
        boolean isRV = super.A0B.A8l().equals(com.facebook.ads.internal.protocol.AdPlacementType.REWARDED_VIDEO.toString());
        if (A04 == -1.0f && isRV && super.A03.A1m()) {
            float videoDuration = this.A0M.getDuration();
            if (videoDuration <= 0.0f) {
                return 0.0f;
            }
            return videoDuration;
        }
        if (!this.A0B) {
            float serverUnskippableSeconds = this.A0M.getDuration();
            return java.lang.Math.min(1000.0f * A04, serverUnskippableSeconds);
        }
        return 1000.0f * A04;
    }

    private int A01(int i, int i2, int i3) {
        int i4 = 0;
        if (this.A0B) {
            int i5 = this.A00;
            if (A0W[4].charAt(26) != 'F') {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A0W;
            strArr[0] = "";
            strArr[1] = "GEJnt8SXHB7Z";
            i4 = i3 * i5;
        }
        int completedVideoCycleDuration = i / 1000;
        return (i2 - i4) - completedVideoCycleDuration;
    }

    public static int A02(com.facebook.ads.redexgen.core.AbstractC1801jd abstractC1801jd) {
        if (abstractC1801jd.A10().equals(A0A(18, 14, 49))) {
            return abstractC1801jd.A29().A0H().A03();
        }
        if (abstractC1801jd.A10().equals(A0A(6, 12, 112))) {
            return abstractC1801jd.A29().A0H().A04();
        }
        java.lang.String[] strArr = A0W;
        if (strArr[7].charAt(8) != strArr[2].charAt(8)) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A0W;
        strArr2[0] = "";
        strArr2[1] = "oU1GMCkqMMy1";
        return 0;
    }

    private com.facebook.ads.redexgen.core.AbstractC1349c3 A06(int i) {
        com.facebook.ads.redexgen.core.C1352c6 A0M = new com.facebook.ads.redexgen.core.C1352c6(super.A05, super.A06, super.A0A, super.A03, this.A0M, super.A0C, super.A08).A0J(super.A09.getToolbarHeight()).A0P(super.A09).A0I(i).A0K(this.A0H).A0R(this.A0U).A0M(super.A07);
        if (super.A03.A29().A0S() && com.facebook.ads.redexgen.core.C1086Up.A1d(super.A05) && super.A03.A29().A0L() != null) {
            A0M.A0O(getPackageInstallListener());
        }
        A0M.A0L(com.facebook.ads.redexgen.core.C0889Mu.A00(super.A05, super.A06, A0A(0, 0, 98), com.facebook.ads.redexgen.core.XB.A00(super.A03.A29().A0J().A05()), new java.util.HashMap(), super.A03.A2A()));
        com.facebook.ads.redexgen.core.C1353c7 params = A0M.A0U();
        return com.facebook.ads.redexgen.core.AbstractC1350c4.A00(params, null, true);
    }

    private void A0B() {
        this.A0M.postDelayed(new com.facebook.ads.redexgen.core.GV(this), com.facebook.ads.redexgen.core.C1086Up.A0O(super.A05));
    }

    private void A0C() {
        this.A0M.postDelayed(new com.facebook.ads.redexgen.core.GU(this), com.facebook.ads.redexgen.core.C1086Up.A0P(super.A05));
    }

    private void A0D() {
        this.A0C = true;
        super.A09.A0A();
        if (this.A02 != null) {
            this.A02.A1F();
        }
    }

    private void A0E() {
        this.A0M.A0f(this.A0U);
        if (this.A0H instanceof com.facebook.ads.redexgen.core.InterfaceC1524eu) {
            this.A0M.A0f((com.facebook.ads.redexgen.core.InterfaceC1524eu) this.A0H);
        }
        if (!android.text.TextUtils.isEmpty(super.A03.A29().A0H().A08())) {
            com.facebook.ads.redexgen.core.C3S c3s = new com.facebook.ads.redexgen.core.C3S(super.A05, A0m());
            this.A0M.A0f(c3s);
            c3s.setImage(super.A03.A29().A0H().A08());
        }
        if (!A0m()) {
            com.facebook.ads.redexgen.core.AnonymousClass34 anonymousClass34 = new com.facebook.ads.redexgen.core.AnonymousClass34(super.A05, true, super.A07);
            this.A0M.A0f(anonymousClass34);
            this.A0M.A0f(new com.facebook.ads.redexgen.core.C0644Dh(anonymousClass34, com.facebook.ads.redexgen.core.EnumC1539f9.A02, true));
        }
        this.A0M.A0f(new com.facebook.ads.redexgen.core.C3B(super.A05));
    }

    private void A0G(com.facebook.ads.redexgen.core.VH vh) {
        new com.facebook.ads.redexgen.core.VI(super.A03.A2E(), super.A05.A0A()).A04(vh, null);
        super.A0A.A4j(super.A0B.A6l());
        this.A04.A06();
        if (this.A02 instanceof com.facebook.ads.redexgen.core.C6H) {
            ((com.facebook.ads.redexgen.core.C6H) this.A02).A1Z();
        }
        if (!super.A03.A1r()) {
            this.A0G.postDelayed(new com.facebook.ads.redexgen.core.RunnableC1462dt(this), 2000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0H(com.facebook.ads.redexgen.core.VH vh) {
        if (!this.A06) {
            this.A09 = true;
            this.A01 = vh;
        } else {
            A0G(vh);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0N(com.facebook.ads.redexgen.core.C4K c4k, boolean z, boolean z2) {
        if (this.A03 != null) {
            if (z) {
                super.A05.A0F().AEY();
            }
            super.A05.A0F().AEV();
            this.A03.AIY();
            return;
        }
        if (this.A0D) {
            return;
        }
        if (!z && this.A08 && this.A0B) {
            this.A00++;
            this.A0M.A0e(com.facebook.ads.redexgen.core.EnumC1523et.A02, 20);
            return;
        }
        if (!this.A0C) {
            A0D();
        }
        if (!z && this.A00 < super.A03.A29().A0G()) {
            this.A0M.A0e(com.facebook.ads.redexgen.core.EnumC1523et.A02, 32);
        } else {
            this.A0D = true;
            if (this.A02 != null) {
                this.A02.A1I(c4k);
            }
        }
        if (this.A00 == 0) {
            A0R(z, z2);
        }
        this.A00++;
        java.lang.String[] strArr = A0W;
        if (strArr[0].length() == strArr[1].length()) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A0W;
        strArr2[0] = "";
        strArr2[1] = "mBWwcFSbVIKH";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0O(com.facebook.ads.redexgen.core.C4A c4a) {
        if (this.A0M.getState() == com.facebook.ads.redexgen.core.EnumC1578fm.A02 && com.facebook.ads.redexgen.core.C1086Up.A1e(super.A05)) {
            this.A0M.postDelayed(new com.facebook.ads.redexgen.core.GT(this, c4a), 5000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0P(com.facebook.ads.redexgen.core.C4A c4a) {
        float f;
        int A00 = c4a.A00();
        int totalSecondsForNextCta = super.A03.A29().A0H().A02();
        int currentPosMs = super.A03.A29().A0H().A05();
        int currentPosMs2 = A01(A00, totalSecondsForNextCta, currentPosMs);
        if (totalSecondsForNextCta >= 0 && currentPosMs2 <= 0 && !super.A02 && this.A02 != null && this.A02.A1N()) {
            super.A02 = true;
            super.A09.setToolbarActionMode(8);
        }
        if (this.A08) {
            int totalSecondsForNextCta2 = super.A03.A29().A0H().A03();
            int currentPosMs3 = super.A03.A29().A0H().A05();
            int A01 = A01(A00, totalSecondsForNextCta2, currentPosMs3);
            com.facebook.ads.redexgen.core.AbstractC1801jd abstractC1801jd = super.A03;
            if (A0W[6].length() != 22) {
                java.lang.String[] strArr = A0W;
                strArr[0] = "";
                strArr[1] = "CRWrhlQnYLwh";
                if (!com.facebook.ads.redexgen.core.ViewOnClickListenerC0834Kr.A05(abstractC1801jd)) {
                    boolean A1u = super.A03.A1u();
                    java.lang.String A0A = A0A(0, 0, 98);
                    if (A1u || super.A03.A1s() || super.A03.A1h()) {
                        super.A09.setToolbarActionMessage(A0A);
                    } else if (A01 > 0) {
                        super.A09.setToolbarActionMessage(super.A03.A2D().A06().replace(A0A(0, 6, 50), java.lang.String.valueOf(A01)));
                    } else {
                        super.A09.setToolbarActionMessage(A0A);
                    }
                }
                if (A01 <= 0) {
                    A0S(false, false);
                }
            } else {
                throw new java.lang.RuntimeException();
            }
        }
        float A002 = A00();
        float totalCurrentPosMs = A00;
        if (this.A0B) {
            int totalSecondsForNextCta3 = this.A0M.getDuration();
            int currentPosMs4 = this.A00;
            totalCurrentPosMs += totalSecondsForNextCta3 * currentPosMs4;
        }
        if (!super.A03.A1m()) {
            f = totalCurrentPosMs / A002;
        } else if (A002 > 0.0f) {
            f = totalCurrentPosMs / A002;
        } else {
            f = 1.0f;
        }
        boolean A1s = super.A03.A1s();
        if (A0W[5].charAt(8) != 102) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A0W;
        strArr2[7] = "BY5kACpHY7KFfLoLkWPFyXHXe8tQ4ZYS";
        strArr2[2] = "FXqF0wWRYQoNHbRw7kiC8WRpThpP8Fmr";
        if (!A1s) {
            float unskippableSeconds = 100.0f * f;
            super.A09.setProgress(unskippableSeconds);
        } else {
            int i = 0;
            if (A002 - totalCurrentPosMs > 0.0f) {
                int currentPosMs5 = (int) (A002 - totalCurrentPosMs);
                i = currentPosMs5 / 1000;
            }
            com.facebook.ads.redexgen.core.AbstractC1171Yb abstractC1171Yb = super.A09;
            java.lang.String[] strArr3 = A0W;
            java.lang.String str = strArr3[7];
            java.lang.String str2 = strArr3[2];
            int totalSecondsForNextCta4 = str.charAt(8);
            int currentPosMs6 = str2.charAt(8);
            if (totalSecondsForNextCta4 != currentPosMs6) {
                float unskippableSeconds2 = 100.0f * f;
                abstractC1171Yb.A0C(unskippableSeconds2, i);
            } else {
                A0W[3] = "ksHgyK5pJeiIhpnbSmOLRLGEWkwS8h7S";
                float unskippableSeconds3 = 100.0f * f;
                abstractC1171Yb.A0C(unskippableSeconds3, i);
            }
        }
        if (f >= 1.0f && !this.A0C) {
            A0D();
            com.facebook.ads.redexgen.core.AbstractC1171Yb abstractC1171Yb2 = super.A09;
            int currentPosMs7 = getCloseButtonStyle();
            abstractC1171Yb2.setToolbarActionMode(currentPosMs7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0Q(java.lang.String str) {
        if (this.A07) {
            return;
        }
        this.A07 = true;
        int i = 0;
        int duration = 0;
        if (this.A0M != null) {
            i = this.A0M.getCurrentPositionInMillis();
            duration = this.A0M.getDuration();
            this.A0M.A0b(3);
        }
        super.A05.A0F().A3a(str);
        if (com.facebook.ads.redexgen.core.C1086Up.A1f(super.A05)) {
            A0N(new com.facebook.ads.redexgen.core.C4K(i, duration), false, true);
            return;
        }
        super.A0A.A4j(super.A0B.A81());
        com.facebook.ads.redexgen.core.InterfaceC1177Yh interfaceC1177Yh = super.A0A;
        com.facebook.ads.redexgen.core.ZU zu = super.A0B;
        int currentPositionMS = A0W[4].charAt(26);
        if (currentPositionMS != 70) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr = A0W;
        strArr[0] = "";
        strArr[1] = "o6mUTp9wkX0m";
        interfaceC1177Yh.A4j(zu.A7w());
    }

    private void A0R(boolean z, boolean z2) {
        super.A09.setToolbarActionMessage(A0A(0, 0, 98));
        A0S(z, z2);
        if (z2) {
            if (super.A03.A29().A0T()) {
                super.A05.A0F().ACE();
            } else {
                super.A05.A0F().ACD();
            }
            com.facebook.ads.redexgen.core.AbstractC1171Yb abstractC1171Yb = super.A09;
            java.lang.String[] strArr = A0W;
            if (strArr[0].length() == strArr[1].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0W;
            strArr2[0] = "";
            strArr2[1] = "xKhq1oBo2v82";
            abstractC1171Yb.setToolbarActionMode(0);
            return;
        }
        super.A09.setToolbarActionMode(getCloseButtonStyle());
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0723Gj
    public final com.facebook.ads.redexgen.core.AbstractC1171Yb A0c() {
        com.facebook.ads.redexgen.core.AbstractC1171Yb A0c = super.A0c();
        if (A0m() && super.A03.A2T()) {
            A0c.setOnTouchListener(new com.facebook.ads.redexgen.core.ViewOnTouchListenerC1464dv(this));
        }
        if (super.A03.A2T()) {
            A0c.setOnClickListener(new com.facebook.ads.redexgen.core.ViewOnClickListenerC1460dr(this));
        }
        return A0c;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0723Gj
    public final void A0d() {
        android.graphics.Rect requestedMargins;
        super.A0d();
        if (!super.A03.A1W() || (requestedMargins = super.A09.getRequestedMargins()) == null) {
            return;
        }
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) this.A0H.getLayoutParams();
        layoutParams.setMargins(layoutParams.leftMargin, requestedMargins.top, layoutParams.rightMargin, layoutParams.bottomMargin);
        this.A0H.setLayoutParams(layoutParams);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0723Gj
    public final void A0g() {
        if (this.A02 != null) {
            super.A07.A04(com.facebook.ads.redexgen.core.VH.A0Y, null);
            if (super.A03.A29().A0H().A07() != null) {
                this.A0M.A0d(com.facebook.ads.redexgen.core.EnumC1515el.A05);
                if (com.facebook.ads.redexgen.core.C1086Up.A1H(super.A05)) {
                    super.A03.A29().A0H().A07().A0U(false);
                }
            }
            com.facebook.ads.redexgen.core.EnumC0885Mq A1B = this.A02.A1B(A0A(32, 4, 60));
            if (super.A03.A2N()) {
                return;
            }
            com.facebook.ads.redexgen.core.EnumC0885Mq actionOutcome = com.facebook.ads.redexgen.core.EnumC0885Mq.A09;
            if (A1B != actionOutcome) {
                com.facebook.ads.redexgen.core.EnumC0885Mq actionOutcome2 = com.facebook.ads.redexgen.core.EnumC0885Mq.A06;
                if (A1B != actionOutcome2) {
                    A0f();
                    return;
                }
                return;
            }
            return;
        }
        super.A07.A04(com.facebook.ads.redexgen.core.VH.A0Z, null);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0723Gj
    public final void A0h() {
        com.facebook.ads.redexgen.core.YB.A0L(this.A02);
        this.A0M.setVisibility(4);
        if (!super.A03.A1o()) {
            A0n();
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0723Gj
    public final void A0k(com.facebook.ads.redexgen.core.C0998Re c0998Re) {
        android.widget.FrameLayout.LayoutParams layoutParams;
        c0998Re.A0A(this.A0I);
        int orientation = c0998Re.A05().getResources().getConfiguration().orientation;
        this.A02 = A06(orientation);
        this.A02.setAccidentalClickCappingListener(new com.facebook.ads.redexgen.core.InterfaceC0886Mr() { // from class: com.facebook.ads.redexgen.X.GW
            @Override // com.facebook.ads.redexgen.core.InterfaceC0886Mr
            public final void ACk() {
                com.facebook.ads.redexgen.core.C4V.this.A0o();
            }
        });
        A0j(this.A02);
        if (super.A01 != null) {
            addView(super.A01, com.facebook.ads.redexgen.core.AbstractC0723Gj.A0H);
        }
        boolean z = false;
        if (A0m()) {
            layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -2);
            android.graphics.Rect requestedMargins = super.A09.getRequestedMargins();
            if (requestedMargins == null) {
                int i = com.facebook.ads.redexgen.core.XV.A0u;
                int orientation2 = com.facebook.ads.redexgen.core.XV.A0r;
                layoutParams.setMargins(i, orientation2, 0, 0);
            } else {
                int i2 = requestedMargins.left;
                int i3 = requestedMargins.top;
                int i4 = requestedMargins.right;
                int orientation3 = requestedMargins.bottom;
                layoutParams.setMargins(i2, i3, i4, orientation3);
            }
        } else {
            int orientation4 = super.A09.getToolbarHeight();
            layoutParams = new android.widget.FrameLayout.LayoutParams(-1, orientation4);
        }
        addView(super.A09, layoutParams);
        if (this.A0J != null) {
            addView(this.A0J, new android.widget.FrameLayout.LayoutParams(-1, this.A0J.getToolbarHeight()));
            com.facebook.ads.redexgen.core.YB.A0H(this.A0J);
        }
        com.facebook.ads.redexgen.core.AbstractC1349c3 abstractC1349c3 = this.A02;
        if (A0W[5].charAt(8) != 'f') {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr = A0W;
        strArr[0] = "";
        strArr[1] = "o0V9GMeYx8z7";
        com.facebook.ads.redexgen.core.YB.A0H(abstractC1349c3);
        com.facebook.ads.redexgen.core.YB.A0H(super.A09);
        if (super.A03.A1o() && (this.A02 instanceof com.facebook.ads.redexgen.core.C6H)) {
            ((com.facebook.ads.redexgen.core.C6H) this.A02).setVideoAdViewListener(this.A0K);
        }
        if (this.A02 != null && this.A02.A1O()) {
            z = true;
        }
        setUpFullscreenMode(z);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0723Gj
    public final boolean A0l() {
        if (this.A02 != null) {
            boolean A1P = this.A02.A1P(this.A08);
            java.lang.String[] strArr = A0W;
            if (strArr[7].charAt(8) != strArr[2].charAt(8)) {
                throw new java.lang.RuntimeException();
            }
            A0W[5] = "3q2LSuBAfmgZDuIIO8XYef2gzNnaMySy";
            if (A1P) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0723Gj
    public final boolean A0m() {
        if (super.A03.A29().A0H().A07() == null) {
            if (!super.A03.A1w()) {
                boolean A1y = super.A03.A1y();
                if (A0W[5].charAt(8) != 'f') {
                    throw new java.lang.RuntimeException();
                }
                java.lang.String[] strArr = A0W;
                strArr[0] = "";
                strArr[1] = "yoI6qUf6VdU9";
                if (!A1y) {
                    return false;
                }
            }
            return true;
        }
        return super.A03.A1n();
    }

    public final void A0n() {
        this.A0M.setVisibility(0);
        com.facebook.ads.redexgen.core.YB.A0L(super.A09);
        this.A0M.setVolume(super.A03.A29().A0H().A0A() ? 0.0f : 1.0f);
        if (A0m()) {
            com.facebook.ads.redexgen.core.AbstractC1349c3 abstractC1349c3 = this.A02;
            if (A0W[3].charAt(17) == 'M') {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A0W;
            strArr[7] = "EZroGEyqYXPxT1OpX1Zo9PGFXXX4LGG2";
            strArr[2] = "A8BrNBzgYOoIkIhiYkC2R6mbpOJkqkYa";
            if (abstractC1349c3 instanceof com.facebook.ads.redexgen.core.C6H) {
                ((com.facebook.ads.redexgen.core.C6H) this.A02).A1a(getResources().getConfiguration().orientation);
                ((com.facebook.ads.redexgen.core.C6H) this.A02).A1Y();
            }
        }
        this.A0M.A0e(com.facebook.ads.redexgen.core.EnumC1523et.A02, 20);
        if (this.A02 != null && this.A08) {
            this.A02.A1E();
        }
        if (this.A02 != null && !this.A0C) {
            this.A02.A1G();
        }
        A0B();
    }

    public final /* synthetic */ void A0o() {
        A0f();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1178Yi
    public final void AFA(boolean z) {
        this.A06 = false;
        if (this.A02 != null) {
            this.A02.A1L(z);
        }
        if (this.A0M.getVisibility() != 0 || this.A0M.A0n()) {
            return;
        }
        this.A05 = this.A0M.getVideoStartReason();
        this.A0A = z;
        this.A0M.A0i(false, 13);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1178Yi
    public final void AFi(boolean z) {
        this.A06 = true;
        if (this.A09) {
            this.A09 = false;
            A0G(this.A01);
        }
        if (this.A0M.getVisibility() != 0 || this.A0M.A0o() || this.A0D || this.A0M.getState() == com.facebook.ads.redexgen.core.EnumC1578fm.A06 || this.A05 == null) {
            return;
        }
        if (!this.A0A || z) {
            this.A0M.A0e(this.A05, 19);
        }
    }

    private int getCloseButtonStyle() {
        if (this.A02 != null) {
            return this.A02.getCloseButtonStyle();
        }
        return 0;
    }

    private com.facebook.ads.redexgen.core.InterfaceC1151Xh getPackageInstallListener() {
        return new com.facebook.ads.redexgen.core.GS(this);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0723Gj, com.facebook.ads.redexgen.core.InterfaceC1178Yi
    public final void onDestroy() {
        super.onDestroy();
        if (com.facebook.ads.redexgen.core.C1086Up.A1z(super.A05)) {
            super.A05.A0B().AKU(this.A0M);
        }
        if (this.A02 != null) {
            this.A02.A1C();
        }
        if (this.A0M != null) {
            if (!this.A0D) {
                this.A0M.A0d(com.facebook.ads.redexgen.core.EnumC1515el.A05);
            }
            this.A0M.getEventBus().A04(this.A0S, this.A0R, this.A0Q, this.A0T, this.A0O, this.A0P);
            this.A0M.A0W();
        }
        if (this.A0L != null) {
            this.A0L.A07();
        }
        com.facebook.ads.redexgen.core.C4L c4l = this.A0N;
        if (A0W[3].charAt(17) == 'M') {
            throw new java.lang.RuntimeException();
        }
        A0W[5] = "JW7Ky8SZfj6uPXM0M3owDCnBT69Er2UJ";
        c4l.A0p();
        this.A0G.removeCallbacksAndMessages(null);
    }

    public void setServerSideRewardHandler(com.facebook.ads.redexgen.core.C1504ea c1504ea) {
        this.A04 = c1504ea;
    }

    public void setVideoLeadingPlayableAdListener(com.facebook.ads.redexgen.core.InterfaceC1467dy interfaceC1467dy) {
        this.A03 = interfaceC1467dy;
    }
}
