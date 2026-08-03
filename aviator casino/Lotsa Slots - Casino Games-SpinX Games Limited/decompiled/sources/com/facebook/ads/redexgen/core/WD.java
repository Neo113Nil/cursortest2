package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class WD {
    public static byte[] A08;
    public static java.lang.String[] A09 = {"gkSyaXwR", "2VU3Nz3voiV1lmdRee4U2QJOpqB0EmXx", "l2PJ1mhNLKomP6h8XAPCJTvwOfm7DNfm", "U14uMoZpedA5MoqMp8wF", "ZGFJtzG5houIZuhA5wVIi53yZAjLLlX2", "TKuU0S0TRmpOZ7a0gUh222TH0KiJMCsX", "Ntgwe7QRVjptK5Vt0gMbvLxTukJluaCr", "4nIPbhAhAn1Dg8Q4wgXTfE5Yoh5xfpBP"};
    public static final com.facebook.ads.redexgen.core.YE A0A;
    public static final java.util.concurrent.Executor A0B;
    public static final java.util.concurrent.atomic.AtomicReference<com.facebook.ads.redexgen.core.WH> A0C;
    public long A00;
    public long A01;
    public com.facebook.ads.redexgen.core.WC A02;
    public java.util.Map<java.lang.String, java.lang.String> A03;
    public final com.facebook.ads.redexgen.core.C0926Og A04;
    public final com.facebook.ads.redexgen.core.C1636gi A05;
    public final com.facebook.ads.redexgen.core.WE A06;
    public final java.lang.String A07;

    public static java.lang.String A06(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A08, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 57);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A0B() {
        A08 = new byte[]{113, 107, -97, 108, 106, 111, -96, 112, -32, -15, -17, -21, -19, -25, -16, -19, -23, -14, -8, 3, -10, -23, -11, -7, -23, -9, -8, 3, -19, -24, -126, -84, 89, -117, -121, 115, 89, -62, -61, -108, -70, -67, -64, -64, -108, -26, -39, -41, -39, -35, -22, -39, -40, -39, -6, -85, -47, -12, -9, -9, -85, -16, -3, -3, -6, -3, -85, -18, -6, -17, -16, -85, -26, -80, -2, -24, -85, -80, -2, -33, -35, -26, -35, -22, -31, -37, -57, -66, -51, -48, -56, -53, -60, 10, com.google.common.base.Ascii.VT, -30, 5, 8, 8, -28, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.VT, 7, -35, -33, -36, -29, -42, -47, -46};
    }

    static {
        A0B();
        A0A = new com.facebook.ads.redexgen.core.YE();
        A0B = java.util.concurrent.Executors.newCachedThreadPool(A0A);
        A0C = new java.util.concurrent.atomic.AtomicReference<>();
    }

    public WD(com.facebook.ads.redexgen.core.C1636gi c1636gi) {
        this(c1636gi, com.facebook.ads.redexgen.core.AbstractC0927Oh.A00(c1636gi.A02()));
    }

    public WD(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.C0926Og c0926Og) {
        this.A01 = -1L;
        this.A00 = -1L;
        this.A05 = c1636gi;
        this.A06 = com.facebook.ads.redexgen.core.WE.A00();
        this.A07 = com.facebook.ads.redexgen.core.WI.A01(c1636gi);
        this.A04 = c0926Og;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.facebook.ads.redexgen.core.C1030Sl A03(long j, com.facebook.ads.redexgen.core.WA wa) {
        return new com.facebook.ads.redexgen.core.C1030Sl(this, wa, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0A() {
        if (this.A05 == null || !com.facebook.ads.redexgen.core.C1605gD.A0A(this.A05)) {
            return;
        }
        com.facebook.ads.redexgen.core.C1049Te c1049Te = new com.facebook.ads.redexgen.core.C1049Te(A06(8, 5, 102));
        c1049Te.A05(1);
        this.A05.A08().ABC(A06(86, 7, 32), com.facebook.ads.redexgen.core.AbstractC1048Td.A1x, c1049Te);
    }

    private void A0C(int i, java.lang.String str) {
        java.lang.String A06 = A06(37, 16, 59);
        java.lang.String A062 = A06(0, 8, 1);
        java.lang.String A063 = A06(93, 10, 99);
        com.facebook.ads.redexgen.core.AbstractC1119Vy.A05(A063, A06, A062);
        com.facebook.ads.redexgen.core.AbstractC1119Vy.A04(A063, java.lang.String.format(java.util.Locale.US, A06(53, 26, 82), java.lang.Integer.valueOf(i), str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0D(com.facebook.ads.redexgen.core.C1108Vm c1108Vm) {
        if (this.A02 != null) {
            this.A02.ADp(c1108Vm);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0E(com.facebook.ads.redexgen.core.C1108Vm c1108Vm) {
        com.facebook.ads.redexgen.core.Y4.A00(new com.facebook.ads.redexgen.core.RO(this, c1108Vm));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0L(com.facebook.ads.redexgen.core.RG rg) {
        if (this.A02 != null) {
            this.A02.AG7(rg);
        } else {
            if (rg.A00() == null || rg.A00().A06() == null) {
                return;
            }
            com.facebook.ads.redexgen.core.C1132Wl.A00(this.A05).A0D(rg.A00().A06().toString(), rg.A00().A0B());
        }
    }

    private void A0M(com.facebook.ads.redexgen.core.RG rg) {
        com.facebook.ads.redexgen.core.TE syncModule;
        com.facebook.ads.redexgen.core.Y4.A00(new com.facebook.ads.redexgen.core.SO(this, rg));
        if (com.facebook.ads.redexgen.core.C1086Up.A2e(this.A05) && (syncModule = this.A05.A06()) != null) {
            syncModule.A6d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0N(java.lang.String str, long j, com.facebook.ads.redexgen.core.WA wa) {
        java.lang.String clientChallenge;
        try {
        } catch (java.lang.Exception e) {
            e = e;
        }
        try {
            com.facebook.ads.redexgen.core.WG A07 = this.A06.A07(this.A05, str, j);
            com.facebook.ads.redexgen.core.C1067Tw A00 = A07.A00();
            if (A00 != null) {
                com.facebook.ads.redexgen.core.C1086Up.A0V(this.A05).A36(A00.A0A());
                if (com.facebook.ads.redexgen.core.C1086Up.A0x(this.A05) && A00.A08() != null) {
                    com.facebook.ads.redexgen.core.U6.A04(this.A05.A02(), A00.A08());
                }
                if (com.facebook.ads.redexgen.core.C1086Up.A0y(this.A05) && A00.A0D() != null) {
                    com.facebook.ads.redexgen.core.U6.A05(this.A05.A02(), A00.A0D());
                }
                this.A05.A08().ACP();
                this.A04.A0N(A00.A07());
                com.facebook.ads.redexgen.core.W9.A05(A00.A05().A0B(), wa);
                com.facebook.ads.redexgen.core.YS.A01(this.A05, A0B, A00);
                com.facebook.ads.redexgen.core.C1049Te c1049Te = new com.facebook.ads.redexgen.core.C1049Te(A06(30, 7, 0) + com.facebook.ads.redexgen.core.XY.A02());
                c1049Te.A06(1);
                c1049Te.A0A(false);
                this.A05.A08().ACA(A06(79, 7, 63), com.facebook.ads.redexgen.core.AbstractC1048Td.A1W, c1049Te);
            }
            switch (A07.A01()) {
                case A02:
                    com.facebook.ads.redexgen.core.RG rg = (com.facebook.ads.redexgen.core.RG) A07;
                    if (A00 != null) {
                        if (A00.A05().A0E()) {
                            com.facebook.ads.redexgen.core.W9.A07(str, wa);
                        }
                        if (this.A03 != null) {
                            clientChallenge = this.A03.get(A06(13, 17, 107));
                        } else {
                            clientChallenge = null;
                        }
                        if (!android.text.TextUtils.isEmpty(A07.A02()) && !android.text.TextUtils.isEmpty(clientChallenge)) {
                            this.A05.A03().AIi(this.A05, clientChallenge, A07.A02());
                        }
                    }
                    this.A05.A0F().A3X(com.facebook.ads.redexgen.core.Y1.A01(this.A01), com.facebook.ads.redexgen.core.Y1.A02(this.A01, this.A00));
                    A0M(rg);
                    return;
                case A03:
                    com.facebook.ads.redexgen.core.R4 r4 = (com.facebook.ads.redexgen.core.R4) A07;
                    java.lang.String A04 = r4.A04();
                    com.facebook.ads.internal.protocol.AdErrorType adErrorTypeFromCode = com.facebook.ads.internal.protocol.AdErrorType.adErrorTypeFromCode(r4.A03(), com.facebook.ads.internal.protocol.AdErrorType.ERROR_MESSAGE);
                    A0C(r4.A03(), A04);
                    if (A04 == null) {
                        A04 = str;
                    }
                    this.A05.A0F().A3W(com.facebook.ads.redexgen.core.Y1.A01(this.A01), adErrorTypeFromCode.getErrorCode(), A04, adErrorTypeFromCode.isPublicError());
                    A0E(com.facebook.ads.redexgen.core.C1108Vm.A01(adErrorTypeFromCode, A04));
                    return;
                default:
                    com.facebook.ads.internal.protocol.AdErrorType adErrorType = com.facebook.ads.internal.protocol.AdErrorType.UNKNOWN_RESPONSE;
                    this.A05.A0F().A3W(com.facebook.ads.redexgen.core.Y1.A01(this.A01), adErrorType.getErrorCode(), str, adErrorType.isPublicError());
                    A0E(com.facebook.ads.redexgen.core.C1108Vm.A01(adErrorType, str));
                    return;
            }
        } catch (java.lang.Exception e2) {
            e = e2;
            java.lang.String message = e.getMessage();
            com.facebook.ads.internal.protocol.AdErrorType adErrorType2 = com.facebook.ads.internal.protocol.AdErrorType.PARSER_FAILURE;
            com.facebook.ads.redexgen.core.C1636gi c1636gi = this.A05;
            if (A09[0].length() == 29) {
                throw new java.lang.RuntimeException();
            }
            A09[0] = "STn1t4NLUPoQ";
            c1636gi.A0F().A3W(com.facebook.ads.redexgen.core.Y1.A01(this.A01), adErrorType2.getErrorCode(), message, adErrorType2.isPublicError());
            A0E(com.facebook.ads.redexgen.core.C1108Vm.A01(adErrorType2, message));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0O(java.lang.String str, long j, com.facebook.ads.redexgen.core.WA wa) {
        A0B.execute(new com.facebook.ads.redexgen.core.C1036Sr(this, str, j, wa));
    }

    private boolean A0P(com.facebook.ads.redexgen.core.WA wa) {
        java.lang.String adPlacementType = wa.A06().toString();
        if (com.facebook.ads.redexgen.core.C1132Wl.A00(this.A05).A0F(adPlacementType)) {
            return false;
        }
        int A0A2 = com.facebook.ads.redexgen.core.C1132Wl.A00(this.A05).A0A(adPlacementType);
        int storedAdsCount = com.facebook.ads.redexgen.core.C1086Up.A0J(this.A05);
        int A092 = com.facebook.ads.redexgen.core.C1132Wl.A00(this.A05).A09(adPlacementType);
        if (A0A2 >= storedAdsCount || A0A2 > A092) {
            com.facebook.ads.redexgen.core.C1132Wl A00 = com.facebook.ads.redexgen.core.C1132Wl.A00(this.A05);
            java.lang.String type = wa.A06().toString();
            android.util.Pair<java.lang.String, java.lang.String> A0B2 = A00.A0B(type);
            if (A0B2 != null) {
                java.lang.Object obj = A0B2.second;
                java.lang.String[] strArr = A09;
                java.lang.String str = strArr[1];
                java.lang.String str2 = strArr[4];
                int storedAdsCount2 = str.charAt(27);
                if (storedAdsCount2 == str2.charAt(27)) {
                    throw new java.lang.RuntimeException();
                }
                java.lang.String[] strArr2 = A09;
                strArr2[5] = "wxWvHA1chxzz72CPhzVDSI5kTKVxH7gh";
                strArr2[2] = "qa9WwGn6xu1bvFfukLGFlV7cMdAOaohF";
                if (obj != null && A0B2.first != null) {
                    A0O(A0B2.second.toString(), 0L, wa);
                    return true;
                }
            }
        }
        return false;
    }

    public final void A0Q(com.facebook.ads.redexgen.core.WA wa) {
        this.A01 = java.lang.System.currentTimeMillis();
        com.facebook.ads.redexgen.core.C1058Tn.A0B(this.A05);
        A0C.get();
        if (0 != 0) {
            throw new java.lang.NullPointerException(A06(103, 7, 52));
        }
        if (com.facebook.ads.redexgen.core.C1086Up.A02(this.A05) > 0 && A0P(wa)) {
            return;
        }
        if (com.facebook.ads.redexgen.core.W9.A08(wa)) {
            com.facebook.ads.redexgen.core.YG.A06.execute(new com.facebook.ads.redexgen.core.C1051Tg(this));
            java.lang.String A02 = com.facebook.ads.redexgen.core.W9.A02(wa);
            if (A02 != null) {
                this.A05.A0F().AKg();
                A0O(A02, 0L, wa);
                return;
            } else {
                com.facebook.ads.internal.protocol.AdErrorType error = com.facebook.ads.internal.protocol.AdErrorType.LOAD_TOO_FREQUENTLY;
                this.A05.A0F().A3W(com.facebook.ads.redexgen.core.Y1.A01(this.A01), error.getErrorCode(), error.getDefaultErrorMessage(), error.isPublicError());
                A0E(com.facebook.ads.redexgen.core.C1108Vm.A01(error, null));
                return;
            }
        }
        A0B.execute(new com.facebook.ads.redexgen.core.TZ(this, wa));
    }

    public final void A0R(com.facebook.ads.redexgen.core.WC wc) {
        this.A02 = wc;
    }
}
