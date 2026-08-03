package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.7w, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C05227w extends com.facebook.ads.redexgen.core.AbstractC1805jh {
    public static com.facebook.ads.redexgen.core.C1042Sx A0D;
    public static byte[] A0E;
    public static java.lang.String[] A0F = {"g9SdUg6XNSnvVCS02jX19aczyGq48qDV", "lGSQ9LsgX83H3UqklEPZgAjaPEKabNT0", "y0oXMo4BXc2on8MNFvJxgBv", "Ulfd9L14l0ScyK0QB689zsPu0EZ5wfqr", "W3xKKEfUMxBXJmvfztSkCM8j4ls7Vw3H", "lNYBpqeQZYlfeCveDiVEAZh", "rx8", "elj"};
    public long A00;
    public com.facebook.ads.redexgen.core.NJ A01;
    public com.facebook.ads.redexgen.core.NK A02;
    public com.facebook.ads.redexgen.core.NQ A03;
    public com.facebook.ads.redexgen.core.C1636gi A04;
    public com.facebook.ads.redexgen.core.WK A05;
    public com.facebook.ads.redexgen.core.C1420dC A06;
    public java.lang.String A07;
    public java.lang.String A08;
    public java.lang.String A09;
    public java.lang.String A0A;
    public final java.lang.String A0B = java.util.UUID.randomUUID().toString();
    public final java.util.concurrent.atomic.AtomicBoolean A0C = new java.util.concurrent.atomic.AtomicBoolean();

    public static java.lang.String A05(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A0E, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 51);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A09() {
        A0E = new byte[]{-98, -16, -14, -14, -12, -5, -12, 1, -2, -4, -12, 3, -12, 1, -18, 1, -2, 3, -16, 3, -8, -2, -3, -58, -45, -60, -58, -56, -39, -50, -37, -50, -39, -34, 1, 6, -1, 7, com.google.common.base.Ascii.FF, 3, 2, -33, 2, -30, -1, com.google.common.base.Ascii.DC2, -1, -32, 19, com.google.common.base.Ascii.FF, 2, 10, 3, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.EM, 17, 36, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.US, com.google.common.base.Ascii.RS, -12, 17, 36, 17, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.FF, 1, 3, 5, com.google.common.base.Ascii.CR, 5, com.google.common.base.Ascii.SO, com.google.common.base.Ascii.DC4, -23, 4, -68, -66, -79, -80, -79, -78, -75, -70, -79, -80, -101, -66, -75, -79, -70, -64, -83, -64, -75, -69, -70, -105, -79, -59, -17, -30, -18, -14, -30, -16, -15, -47, -26, -22, -30, -2, -15, 3, -19, -2, -16, -33, -15, -2, 2, -15, -2, -31, -34, -40, -13, -26, -8, -30, -13, -27, -26, -27, -41, -22, -27, -26, -16, -62, -27, -59, -30, -11, -30, -61, -10, -17, -27, -19, -26, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.SI, 33, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.SO, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.SO, 9, 32, 19, com.google.common.base.Ascii.SO, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.EM, -61, -68, -73, -65, -61, -77, -105, -78, -4, -17, -21, -3, -38, -1, -10, -21};
    }

    static {
        A09();
    }

    private void A07() {
        com.facebook.ads.redexgen.core.P2.A00(this.A04).A06(this.A02, this.A02.A00());
    }

    private void A08() {
        if (this.A02 != null) {
            try {
                com.facebook.ads.redexgen.core.P2.A00(this.A04).A05(this.A02);
            } catch (java.lang.Exception unused) {
            }
        }
    }

    private void A0A(android.content.Intent intent) {
        int i = super.A00;
        java.lang.String A05 = A05(77, 24, 25);
        if (i != -1 && android.provider.Settings.System.getInt(this.A04.getContentResolver(), A05(1, 22, 92), 0) != 1) {
            int i2 = super.A00;
            java.lang.String[] strArr = A0F;
            if (strArr[4].charAt(19) == strArr[0].charAt(19)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0F;
            strArr2[5] = "RWC7frN5DjKRH0uo4BJmLzj";
            strArr2[2] = "FPcb0UYEDF6wwONX6Ty9E2F";
            intent.putExtra(A05, i2);
            return;
        }
        com.facebook.ads.redexgen.core.C1636gi c1636gi = this.A04;
        java.lang.String[] strArr3 = A0F;
        if (strArr3[7].length() == strArr3[6].length()) {
            java.lang.String[] strArr4 = A0F;
            strArr4[5] = "O4w3do1khQsKhsE3USwlJ7C";
            strArr4[2] = "rALKIAVwphrvKmHx0hqaLzY";
            if (com.facebook.ads.redexgen.core.C1086Up.A0h(c1636gi)) {
                return;
            }
        } else if (com.facebook.ads.redexgen.core.C1086Up.A0h(c1636gi)) {
            return;
        }
        intent.putExtra(A05, 6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0C(final com.facebook.ads.redexgen.core.C1636gi c1636gi, final com.facebook.ads.redexgen.core.C1795jT c1795jT, final int i) {
        if (i >= c1795jT.A23()) {
            return;
        }
        final com.facebook.ads.redexgen.core.C05117l c05117l = (com.facebook.ads.redexgen.core.C05117l) c1795jT.A27(i);
        A0D = new com.facebook.ads.redexgen.core.C1042Sx(c1636gi);
        A0D.A0e(new com.facebook.ads.redexgen.core.VI(c05117l.A2E(), c1636gi.A0A()));
        com.facebook.ads.redexgen.core.O6.A02(c1636gi, A0D, c05117l);
        final boolean z = i == 0;
        A0D.A0X(new com.facebook.ads.redexgen.core.AbstractC1775j4(z) { // from class: com.facebook.ads.redexgen.X.7x
            @Override // com.facebook.ads.redexgen.core.AbstractC1775j4
            public final void A00() {
                com.facebook.ads.redexgen.core.NJ nj;
                nj = com.facebook.ads.redexgen.core.C05227w.this.A01;
                nj.AFp(com.facebook.ads.redexgen.core.C05227w.this, com.facebook.ads.AdError.CACHE_ERROR);
            }

            @Override // com.facebook.ads.redexgen.core.AbstractC1775j4
            public final void A01(boolean z2) {
                java.util.concurrent.atomic.AtomicBoolean atomicBoolean;
                com.facebook.ads.redexgen.core.NJ nj;
                com.facebook.ads.redexgen.core.C05227w.A0D = null;
                if (z2) {
                    c1636gi.A01().AJE(c05117l.A2E(), c1795jT.A28());
                }
                if (i == c1795jT.A25()) {
                    atomicBoolean = com.facebook.ads.redexgen.core.C05227w.this.A0C;
                    atomicBoolean.set(true);
                    nj = com.facebook.ads.redexgen.core.C05227w.this.A01;
                    nj.AFm(com.facebook.ads.redexgen.core.C05227w.this);
                }
                com.facebook.ads.redexgen.core.C05227w.this.A0C(c1636gi, c1795jT, i + 1);
            }
        }, new com.facebook.ads.redexgen.core.C1035Sq(c05117l.A1D(), A05(com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_VERSION, 14, 119), i));
    }

    private void A0D(boolean z) {
        if (this.A05 == com.facebook.ads.redexgen.core.WK.A0G) {
            A0F(z);
            return;
        }
        if (this.A05 == com.facebook.ads.redexgen.core.WK.A0I) {
            A0G(z);
        } else if (this.A05 == com.facebook.ads.redexgen.core.WK.A0H) {
            A0E(z);
        } else {
            A0G(z);
        }
    }

    private void A0E(boolean z) {
        com.facebook.ads.redexgen.core.C1042Sx c1042Sx = new com.facebook.ads.redexgen.core.C1042Sx(this.A04);
        boolean z2 = com.facebook.ads.redexgen.core.C1086Up.A2H(this.A04) && com.facebook.ads.redexgen.core.SN.A0A(this.A03.A1H());
        if (z2) {
            com.facebook.ads.redexgen.core.SN unifiedAssetsLoader = new com.facebook.ads.redexgen.core.SN(c1042Sx, this.A03.A1H(), this.A03.A10(), this.A03.A1D(), z2, new com.facebook.ads.redexgen.core.C1813jp(this));
            c1042Sx.A0e(new com.facebook.ads.redexgen.core.VI(((com.facebook.ads.redexgen.core.AbstractC1801jd) this.A03).A2E(), this.A04.A0A()));
            unifiedAssetsLoader.A0B();
            return;
        }
        com.facebook.ads.redexgen.core.O5.A02(this.A04, (com.facebook.ads.redexgen.core.AbstractC1801jd) this.A03, z, new com.facebook.ads.redexgen.core.C1812jo(this));
    }

    private void A0F(boolean z) {
        com.facebook.ads.redexgen.core.C1042Sx c1042Sx = new com.facebook.ads.redexgen.core.C1042Sx(this.A04);
        c1042Sx.A0e(new com.facebook.ads.redexgen.core.VI(((com.facebook.ads.redexgen.core.AbstractC1801jd) this.A03).A2E(), this.A04.A0A()));
        com.facebook.ads.redexgen.core.O6.A03(this.A04, c1042Sx, (com.facebook.ads.redexgen.core.C05117l) this.A03);
        c1042Sx.A0X(new com.facebook.ads.redexgen.core.C1817jt(this), new com.facebook.ads.redexgen.core.C1035Sq(this.A03.A1D(), A05(com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_VERSION, 14, 119)));
    }

    private void A0G(boolean z) {
        boolean z2 = false;
        if (this.A03.A1b()) {
            com.facebook.ads.redexgen.core.C1795jT c1795jT = (com.facebook.ads.redexgen.core.C1795jT) this.A03;
            for (int i = 0; i < c1795jT.A23(); i++) {
                if (android.text.TextUtils.isEmpty(c1795jT.A27(i).A29().A0H().A09())) {
                    this.A01.AFp(this, com.facebook.ads.AdError.INTERNAL_ERROR);
                    return;
                }
            }
            A0C(this.A04, c1795jT, 0);
            return;
        }
        com.facebook.ads.redexgen.core.C1042Sx c1042Sx = new com.facebook.ads.redexgen.core.C1042Sx(this.A04);
        c1042Sx.A0e(new com.facebook.ads.redexgen.core.VI(((com.facebook.ads.redexgen.core.AbstractC1801jd) this.A03).A2E(), this.A04.A0A()));
        if (com.facebook.ads.redexgen.core.C1086Up.A2H(this.A04) && com.facebook.ads.redexgen.core.SN.A0A(this.A03.A1H())) {
            z2 = true;
        }
        boolean A1g = this.A03.A1g();
        if (z2) {
            com.facebook.ads.redexgen.core.SN unifiedAssetsLoader = new com.facebook.ads.redexgen.core.SN(c1042Sx, this.A03.A1H(), this.A03.A10(), this.A03.A1D(), z2, new com.facebook.ads.redexgen.core.C1815jr(this, A1g));
            unifiedAssetsLoader.A0B();
            return;
        }
        com.facebook.ads.redexgen.core.C05117l c05117l = (com.facebook.ads.redexgen.core.C05117l) this.A03;
        if (android.text.TextUtils.isEmpty(c05117l.A29().A0H().A09())) {
            if (this.A05 == com.facebook.ads.redexgen.core.WK.A0J) {
                this.A04.A0F().AEQ();
            }
            this.A01.AFp(this, com.facebook.ads.AdError.INTERNAL_ERROR);
        } else {
            com.facebook.ads.redexgen.core.O6.A02(this.A04, c1042Sx, c05117l);
            c1042Sx.A0X(new com.facebook.ads.redexgen.core.C05247y(this, z, A1g, c05117l, this), new com.facebook.ads.redexgen.core.C1035Sq(c05117l.A1D(), A05(com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_VERSION, 14, 119)));
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1805jh
    public final int A0H() {
        if (this.A03 == null) {
            return -1;
        }
        return this.A03.A0p();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1805jh
    public final com.facebook.ads.redexgen.core.NQ A0I() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1805jh
    public final boolean A0J() {
        if (!this.A0C.get()) {
            return false;
        }
        this.A03.A1J(super.A01);
        java.lang.String A04 = com.facebook.ads.redexgen.core.C1504ea.A04(super.A02, this.A0B, this.A07);
        this.A03.A1K(super.A02);
        this.A03.A1O(A04);
        com.facebook.ads.internal.util.activity.AdActivityIntent A05 = com.facebook.ads.redexgen.core.C1140Wu.A05(this.A04);
        A05.putExtra(A05(174, 8, 83), this.A05);
        A05.putExtra(A05(127, 25, 78), this.A03);
        A05.putExtra(A05(34, 19, 107), this.A03);
        A05.putExtra(A05(166, 8, 27), this.A0B);
        if (A04 != null) {
            A05.putExtra(A05(112, 15, 89), A04);
        }
        A05.putExtra(A05(66, 11, 109), this.A0A);
        A05.putExtra(A05(101, 11, 74), this.A00);
        if (this.A09 != null) {
            A05.putExtra(A05(53, 13, 125), this.A09);
        }
        A0A(A05);
        if (!com.facebook.ads.internal.util.process.ProcessUtils.isRemoteRenderingProcess()) {
            A05.setFlags(A05.getFlags() | 268435456);
        }
        com.facebook.ads.internal.util.activity.ActivityUtils.A03(this.A04);
        try {
            if (com.facebook.ads.internal.util.process.ProcessUtils.isRemoteRenderingProcess()) {
                if (!com.facebook.ads.redexgen.core.C1140Wu.A0I(this.A04, A05)) {
                    this.A04.A0F().AIC();
                    if (this.A01 != null) {
                        this.A01.AFp(this, com.facebook.ads.AdError.AD_PRESENTATION_ERROR);
                    }
                    return false;
                }
                return true;
            }
            com.facebook.ads.redexgen.core.C1140Wu.A0B(this.A04, A05);
            return true;
        } catch (com.facebook.ads.redexgen.core.C1138Ws e) {
            java.lang.String[] strArr = A0F;
            if (strArr[1].charAt(25) != strArr[3].charAt(25)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0F;
            strArr2[7] = "zr3";
            strArr2[6] = "zCM";
            java.lang.Throwable cause = e.getCause();
            java.lang.Throwable th = e;
            if (cause != null) {
                th = e.getCause();
            }
            this.A04.A08().ABC(A05(23, 11, 50), com.facebook.ads.redexgen.core.AbstractC1048Td.A01, new com.facebook.ads.redexgen.core.C1049Te(th));
            return true;
        }
    }

    public final void A0K(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.NJ nj, com.facebook.ads.redexgen.core.O8 o8, boolean z, java.lang.String str, java.lang.String str2) {
        java.lang.String A05;
        this.A0C.set(false);
        this.A04 = c1636gi;
        this.A01 = nj;
        this.A0A = o8.A02();
        this.A00 = o8.A00();
        this.A09 = str2;
        if (this.A0A != null) {
            java.lang.String str3 = this.A0A;
            java.lang.String A052 = A05(0, 1, 12);
            java.lang.String[] strArr = A0F;
            if (strArr[7].length() == strArr[6].length()) {
                java.lang.String[] strArr2 = A0F;
                strArr2[7] = "x5W";
                strArr2[6] = "dMK";
                A05 = str3.split(A052)[0];
            }
            throw new java.lang.RuntimeException();
        }
        A05 = A05(0, 0, 100);
        this.A07 = A05;
        this.A03 = com.facebook.ads.redexgen.core.NQ.A03(o8.A03(), this.A04);
        this.A03.A1M(str);
        this.A03.A1I(o8.A01().A06());
        if (this.A03.A1b()) {
            this.A08 = ((com.facebook.ads.redexgen.core.C1795jT) this.A03).A2A();
        } else {
            this.A08 = ((com.facebook.ads.redexgen.core.AbstractC1801jd) this.A03).A2E();
        }
        if (this.A03.A1g()) {
            this.A05 = com.facebook.ads.redexgen.core.WK.A08;
            if (this.A03.A1U()) {
                this.A04.A0F().AJt(com.facebook.ads.redexgen.core.M5.A08);
            } else {
                this.A04.A0F().AJt(com.facebook.ads.redexgen.core.M5.A0A);
            }
        } else {
            switch (this.A03.A0o()) {
                case 0:
                    this.A05 = com.facebook.ads.redexgen.core.WK.A0I;
                    this.A04.A0F().AJt(com.facebook.ads.redexgen.core.M5.A0D);
                    break;
                case 1:
                    this.A05 = com.facebook.ads.redexgen.core.WK.A0H;
                    this.A04.A0F().AJt(com.facebook.ads.redexgen.core.M5.A0C);
                    break;
                case 2:
                    this.A05 = com.facebook.ads.redexgen.core.WK.A05;
                    this.A04.A0F().AJt(com.facebook.ads.redexgen.core.M5.A05);
                    break;
                case 3:
                    this.A05 = com.facebook.ads.redexgen.core.WK.A0G;
                    this.A04.A0F().AJt(com.facebook.ads.redexgen.core.M5.A04);
                    break;
                case 4:
                    this.A05 = com.facebook.ads.redexgen.core.WK.A0J;
                    this.A04.A0F().AJt(com.facebook.ads.redexgen.core.M5.A0E);
                    break;
            }
        }
        if (com.facebook.ads.redexgen.core.C1086Up.A0v(c1636gi)) {
            com.facebook.ads.redexgen.core.NQ nq = this.A03;
            java.lang.String[] strArr3 = A0F;
            if (strArr3[4].charAt(19) != strArr3[0].charAt(19)) {
                java.lang.String[] strArr4 = A0F;
                strArr4[4] = "c2SjyVfNFMTSQhwflPzyjFy3Fjr2snH4";
                strArr4[0] = "k4vT1WhZbJ1Mlr1eks5fTJscMmdnfo8D";
                if (nq.A1b()) {
                    com.facebook.ads.redexgen.core.C1795jT c1795jT = (com.facebook.ads.redexgen.core.C1795jT) this.A03;
                    for (int A23 = c1795jT.A23() - 1; A23 >= 0; A23--) {
                        com.facebook.ads.redexgen.core.AbstractC1801jd A27 = c1795jT.A27(A23);
                        if (com.facebook.ads.redexgen.core.AbstractC0892Mx.A06(this.A04, com.facebook.ads.redexgen.core.AbstractC0892Mx.A01(c1636gi, A27.A1H(), A27.A2E()), c1636gi.A0A())) {
                            this.A04.A0F().A52();
                            c1795jT.A2C(A23);
                            return;
                        }
                    }
                    if (c1795jT.A23() == 0) {
                        this.A01.AFp(this, com.facebook.ads.AdError.NO_FILL);
                        return;
                    }
                } else if (com.facebook.ads.redexgen.core.AbstractC0892Mx.A06(this.A04, com.facebook.ads.redexgen.core.AbstractC0892Mx.A01(c1636gi, o8.A03(), ((com.facebook.ads.redexgen.core.AbstractC1801jd) this.A03).A2E()), c1636gi.A0A())) {
                    this.A04.A0F().A52();
                    this.A01.AFp(this, com.facebook.ads.AdError.NO_FILL);
                    return;
                }
            }
            throw new java.lang.RuntimeException();
        }
        this.A02 = new com.facebook.ads.redexgen.core.NK(this.A0B, this, nj);
        A07();
        A0D(z);
    }

    @Override // com.facebook.ads.redexgen.core.N1
    public final java.lang.String A7O() {
        return this.A08;
    }

    @Override // com.facebook.ads.redexgen.core.N1
    public final boolean AKL() {
        return true;
    }

    @Override // com.facebook.ads.redexgen.core.N1
    public final void onDestroy() {
        A08();
    }
}
