package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.jz, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1823jz implements com.facebook.ads.redexgen.core.N1, com.facebook.ads.redexgen.core.InterfaceC0913Nt {
    public static byte[] A0B;
    public static java.lang.String[] A0C = {"Tri2", "1D6RXHNY", "CY2J", "FG3HLf7FRck3Q4", "aTw9XxKg19aD2PWH35UjlgQd", "aN0Sboz7ddtAAnQUWG6qQ4oJRDDzSUBt", "pWs", "z"};
    public long A00;
    public com.facebook.ads.RewardData A01;
    public com.facebook.ads.redexgen.core.NC A02;
    public com.facebook.ads.redexgen.core.ND A03;
    public com.facebook.ads.redexgen.core.C0914Nu A04;
    public com.facebook.ads.redexgen.core.C1636gi A05;
    public java.lang.String A06;
    public java.lang.String A07;
    public java.lang.String A08;
    public boolean A09;
    public final java.lang.String A0A = java.util.UUID.randomUUID().toString();

    public static java.lang.String A03(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A0B, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 84);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A05() {
        A0B = new byte[]{-37, -7, 6, -65, com.google.common.base.Ascii.FF, -72, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.FF, -7, 10, com.google.common.base.Ascii.FF, -72, -39, com.google.common.base.Ascii.CR, -4, 1, -3, 6, -5, -3, -26, -3, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.SI, 7, 10, 3, -39, -5, com.google.common.base.Ascii.FF, 1, com.google.common.base.Ascii.SO, 1, com.google.common.base.Ascii.FF, 17, -58, -72, -27, -7, 3, -3, -72, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.CR, 10, -3, -72, com.google.common.base.Ascii.FF, 0, -7, com.google.common.base.Ascii.FF, -72, 1, com.google.common.base.Ascii.FF, -65, com.google.common.base.Ascii.VT, -72, 1, 6, -72, 17, 7, com.google.common.base.Ascii.CR, 10, -72, -39, 6, -4, 10, 7, 1, -4, -27, -7, 6, 1, -2, -3, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.FF, -58, com.google.common.base.Ascii.DLE, 5, 4, -72, -2, 1, 4, -3, -58, -16, -20, -21, com.google.common.base.Ascii.US, com.google.common.base.Ascii.SO, 19, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.SI, -8, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.RS, 33, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.NAK, -55, -48, -35, -50, -48, -46, -29, -40, -27, -40, -29, -24, -1, -9, -10, -5, -13, 6, -5, 1, 0, -42, -13, 6, -13, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.FF, 1, 3, 5, com.google.common.base.Ascii.CR, 5, com.google.common.base.Ascii.SO, com.google.common.base.Ascii.DC4, -23, 4, -55, -53, -66, -67, -66, -65, -62, -57, -66, -67, -88, -53, -62, -66, -57, -51, -70, -51, -62, -56, -57, -92, -66, -46, -7, -20, -8, -4, -20, -6, -5, -37, -16, -12, -20, -6, -13, -18, -10, -6, -22, -50, -23, 34, com.google.common.base.Ascii.NAK, 17, 35, 0, 37, com.google.common.base.Ascii.FS, 17, com.google.common.base.Ascii.FF, -2, 3, -7, 4, com.google.common.base.Ascii.FF};
    }

    static {
        A05();
    }

    private int A00() {
        android.view.WindowManager windowManager = (android.view.WindowManager) this.A05.getSystemService(A03(194, 6, 65));
        int rotation = windowManager.getDefaultDisplay().getRotation();
        com.facebook.ads.redexgen.core.EnumC1297bD A02 = A02();
        if (A02 == com.facebook.ads.redexgen.core.EnumC1297bD.A05) {
            java.lang.String[] strArr = A0C;
            java.lang.String str = strArr[4];
            java.lang.String str2 = strArr[7];
            int rotation2 = str.length();
            if (rotation2 != str2.length()) {
                java.lang.String[] strArr2 = A0C;
                strArr2[6] = "b7o";
                strArr2[3] = "Q7inAkPu5HYVeU";
                return -1;
            }
        } else if (A02 == com.facebook.ads.redexgen.core.EnumC1297bD.A03) {
            switch (rotation) {
                case 2:
                case 3:
                    int rotation3 = A0C[1].length();
                    if (rotation3 != 29) {
                        java.lang.String[] strArr3 = A0C;
                        strArr3[6] = "bcp";
                        strArr3[3] = "BEZRNTMscmchpM";
                        return 8;
                    }
                    break;
                default:
                    return 0;
            }
        } else {
            switch (rotation) {
                case 2:
                    return 9;
                default:
                    java.lang.String[] strArr4 = A0C;
                    java.lang.String str3 = strArr4[4];
                    java.lang.String str4 = strArr4[7];
                    int rotation4 = str3.length();
                    if (rotation4 == str4.length()) {
                        throw new java.lang.RuntimeException();
                    }
                    java.lang.String[] strArr5 = A0C;
                    strArr5[0] = "VdY7";
                    strArr5[2] = "KFhl";
                    return 1;
            }
        }
        throw new java.lang.RuntimeException();
    }

    private final com.facebook.ads.redexgen.core.WK A01() {
        return this.A04.A0E();
    }

    private com.facebook.ads.redexgen.core.EnumC1297bD A02() {
        return this.A04.A0F();
    }

    private void A04() {
        this.A09 = true;
    }

    private void A06(android.content.Intent intent) {
        this.A04.A0I(intent, this.A01, com.facebook.ads.redexgen.core.C1504ea.A04(this.A01, this.A0A, this.A06));
    }

    private final void A07(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.NC nc, com.facebook.ads.redexgen.core.O8 o8, java.util.EnumSet<com.facebook.ads.CacheFlag> cacheFlags, java.lang.String str) {
        com.facebook.ads.redexgen.core.C0914Nu c0914Nu = new com.facebook.ads.redexgen.core.C0914Nu(c1636gi, o8, this, str);
        com.facebook.ads.redexgen.core.NQ A0D = c0914Nu.A0D();
        if (com.facebook.ads.redexgen.core.C1086Up.A0v(c1636gi) && (A0D instanceof com.facebook.ads.redexgen.core.AbstractC1801jd) && com.facebook.ads.redexgen.core.AbstractC0892Mx.A06(this.A05, com.facebook.ads.redexgen.core.AbstractC0892Mx.A01(c1636gi, o8.A03(), ((com.facebook.ads.redexgen.core.AbstractC1801jd) A0D).A2E()), c1636gi.A0A())) {
            this.A05.A0F().A52();
            this.A02.AEG(this, com.facebook.ads.AdError.NO_FILL);
        } else {
            this.A04 = c0914Nu;
            A08(c0914Nu.A0E());
            c0914Nu.A0J(c1636gi, cacheFlags);
        }
    }

    private void A08(com.facebook.ads.redexgen.core.WK wk) {
        if (wk.equals(com.facebook.ads.redexgen.core.WK.A04)) {
            this.A05.A0F().AJt(com.facebook.ads.redexgen.core.M5.A05);
            return;
        }
        if (wk.equals(com.facebook.ads.redexgen.core.WK.A0A)) {
            this.A05.A0F().AJt(com.facebook.ads.redexgen.core.M5.A04);
            return;
        }
        if (wk.equals(com.facebook.ads.redexgen.core.WK.A0B)) {
            this.A05.A0F().AJt(com.facebook.ads.redexgen.core.M5.A0B);
            return;
        }
        if (wk.equals(com.facebook.ads.redexgen.core.WK.A0D)) {
            this.A05.A0F().AJt(com.facebook.ads.redexgen.core.M5.A0D);
            return;
        }
        if (wk.equals(com.facebook.ads.redexgen.core.WK.A0C)) {
            this.A05.A0F().AJt(com.facebook.ads.redexgen.core.M5.A0C);
            return;
        }
        if (!wk.equals(com.facebook.ads.redexgen.core.WK.A06)) {
            return;
        }
        if (this.A04.A0K()) {
            this.A05.A0F().AJt(com.facebook.ads.redexgen.core.M5.A08);
            return;
        }
        if ((A09() instanceof com.facebook.ads.redexgen.core.AbstractC1801jd) && this.A04.A0L((com.facebook.ads.redexgen.core.AbstractC1801jd) A09())) {
            com.facebook.ads.redexgen.core.InterfaceC0862Lt A0F = this.A05.A0F();
            if (A0C[1].length() == 29) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A0C;
            strArr[6] = "5zP";
            strArr[3] = "kcwn0HZtMTZNOx";
            A0F.AJt(com.facebook.ads.redexgen.core.M5.A0A);
            return;
        }
        this.A05.A0F().AJt(com.facebook.ads.redexgen.core.M5.A09);
    }

    public final com.facebook.ads.redexgen.core.NQ A09() {
        return this.A04.A0D();
    }

    public final void A0A(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.NC nc, com.facebook.ads.redexgen.core.O8 o8, java.util.EnumSet<com.facebook.ads.CacheFlag> enumSet, java.lang.String str, java.lang.String str2, com.facebook.ads.RewardData rewardData) {
        this.A05 = c1636gi;
        this.A02 = nc;
        this.A08 = o8.A02();
        this.A06 = this.A08 != null ? this.A08.split(A03(107, 1, 22))[0] : A03(0, 0, 85);
        this.A00 = o8.A00();
        this.A07 = str2;
        this.A01 = rewardData;
        A07(c1636gi, nc, o8, enumSet, str);
    }

    public final boolean A0B() {
        if (!this.A09) {
            if (this.A02 != null) {
                this.A02.AEG(this, com.facebook.ads.AdError.SHOW_CALLED_BEFORE_LOAD_ERROR);
            }
            return false;
        }
        com.facebook.ads.internal.util.activity.AdActivityIntent A05 = com.facebook.ads.redexgen.core.C1140Wu.A05(this.A05);
        A05.putExtra(A03(143, 24, 5), A00());
        A05.putExtra(A03(178, 8, 49), this.A0A);
        A05.putExtra(A03(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE, 11, 76), this.A08);
        A05.putExtra(A03(167, 11, 51), this.A00);
        com.facebook.ads.redexgen.core.WK A01 = A01();
        A08(A01);
        A05.putExtra(A03(186, 8, 88), A01);
        if (this.A07 != null) {
            A05.putExtra(A03(119, 13, 62), this.A07);
        }
        A06(A05);
        if (!com.facebook.ads.internal.util.process.ProcessUtils.isRemoteRenderingProcess()) {
            java.lang.String[] strArr = A0C;
            if (strArr[4].length() == strArr[7].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0C;
            strArr2[0] = "Sc68";
            strArr2[2] = "wieN";
            A05.addFlags(268435456);
        }
        try {
            com.facebook.ads.internal.util.activity.ActivityUtils.A03(this.A05);
            if (com.facebook.ads.internal.util.process.ProcessUtils.isRemoteRenderingProcess()) {
                if (!com.facebook.ads.redexgen.core.C1140Wu.A0I(this.A05, A05)) {
                    this.A05.A0F().AIC();
                    if (this.A02 != null) {
                        this.A02.AEG(this, com.facebook.ads.AdError.AD_PRESENTATION_ERROR);
                    }
                    return false;
                }
                return true;
            }
            com.facebook.ads.redexgen.core.C1140Wu.A0B(this.A05, A05);
            return true;
        } catch (com.facebook.ads.redexgen.core.C1138Ws e) {
            java.lang.Throwable cause = e.getCause();
            java.lang.Throwable th = e;
            if (cause != null) {
                th = e.getCause();
            }
            this.A05.A08().ABC(A03(108, 11, 27), com.facebook.ads.redexgen.core.AbstractC1048Td.A0D, new com.facebook.ads.redexgen.core.C1049Te(th));
            android.util.Log.e(A03(90, 17, 86), A03(0, 90, 68), th);
            return false;
        }
    }

    @Override // com.facebook.ads.redexgen.core.N1
    public final java.lang.String A7O() {
        return this.A04.A0G();
    }

    @Override // com.facebook.ads.redexgen.core.N1
    public final com.facebook.ads.internal.protocol.AdPlacementType A8k() {
        return com.facebook.ads.internal.protocol.AdPlacementType.INTERSTITIAL;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0913Nt
    public final void ACo(com.facebook.ads.AdError adError) {
        if (this.A02 != null) {
            this.A02.AEG(this, adError);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0913Nt
    public final void ACp() {
        A04();
        this.A02.AEF(this);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0913Nt
    public final void AHY() {
        this.A03 = new com.facebook.ads.redexgen.core.ND(this.A05, this.A0A, this, this.A02);
        this.A03.A02();
    }

    @Override // com.facebook.ads.redexgen.core.N1
    public final boolean AKL() {
        return true;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0913Nt
    public final void AKX() {
        if (this.A03 != null) {
            com.facebook.ads.redexgen.core.ND nd = this.A03;
            java.lang.String[] strArr = A0C;
            if (strArr[0].length() != strArr[2].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0C;
            strArr2[0] = "DiF0";
            strArr2[2] = "lQT3";
            nd.A03();
        }
    }

    @Override // com.facebook.ads.redexgen.core.N1
    public final void onDestroy() {
        if (this.A04 != null) {
            this.A04.A0H();
        }
    }
}
