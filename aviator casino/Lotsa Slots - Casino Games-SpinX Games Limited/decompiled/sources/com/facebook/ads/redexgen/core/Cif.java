package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.if, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public class Cif extends com.facebook.ads.redexgen.core.N2 {
    public static byte[] A01;
    public static java.lang.String[] A02 = {"swComlxz6aoGHqKS8LOj1g5iAOstdInC", "iLoXwxITRpbgZFbT1koR1uJW4vvDXY2W", "MpkXHfR6HdYIg9t449R", "HQI6v11U6roDlbOuDHGyMjhCWVrAbgmk", "qsbQ14vrFuO8q1N0nwgFIOsRNgh3HWyt", "NXqrvE65RyYHWICx", "E9yzS8MfEszoKvwo", "osh9YHk0bwFUuMRHqHbnPk"};
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1750id A00;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 98);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{97, 112, 105, 47, 35, 34, 56, 62, 35, 32, 32, 41, 62, 108, 37, 63, 108, 34, 57, 32, 32};
    }

    static {
        A01();
    }

    public Cif(com.facebook.ads.redexgen.core.C1750id c1750id) {
        this.A00 = c1750id;
    }

    @Override // com.facebook.ads.redexgen.core.N2
    public final void A02() {
        com.facebook.ads.InterstitialAd interstitialAd;
        com.facebook.ads.InterstitialAdExtendedListener interstitialAdExtendedListener;
        interstitialAd = this.A00.A01;
        if (interstitialAd == null) {
            this.A00.A04 = false;
            interstitialAdExtendedListener = this.A00.A07;
            interstitialAdExtendedListener.onInterstitialActivityDestroyed();
        }
    }

    @Override // com.facebook.ads.redexgen.core.N2
    public final void A04() {
        com.facebook.ads.InterstitialAd interstitialAd;
        com.facebook.ads.InterstitialAd interstitialAd2;
        com.facebook.ads.redexgen.core.C05097j c05097j;
        com.facebook.ads.InterstitialAdExtendedListener interstitialAdExtendedListener;
        com.facebook.ads.redexgen.core.C1746iY c1746iY;
        com.facebook.ads.redexgen.core.C05097j c05097j2;
        com.facebook.ads.redexgen.core.C05097j c05097j3;
        com.facebook.ads.redexgen.core.C05097j c05097j4;
        interstitialAd = this.A00.A01;
        if (interstitialAd != null) {
            interstitialAd2 = this.A00.A01;
            interstitialAd2.show();
            return;
        }
        this.A00.A04 = false;
        c05097j = this.A00.A03;
        if (c05097j != null && com.facebook.ads.redexgen.core.C1086Up.A2D(this.A00.A06)) {
            c05097j2 = this.A00.A03;
            c05097j2.A0S(new com.facebook.ads.redexgen.core.C1752ig(this));
            c05097j3 = this.A00.A03;
            c05097j3.A0N();
            c05097j4 = this.A00.A03;
            c05097j4.A0K();
            this.A00.A03 = null;
        }
        interstitialAdExtendedListener = this.A00.A07;
        c1746iY = this.A00.A08;
        interstitialAdExtendedListener.onInterstitialDismissed(c1746iY.A6k());
    }

    @Override // com.facebook.ads.redexgen.core.N2
    public final void A05() {
        com.facebook.ads.InterstitialAdExtendedListener interstitialAdExtendedListener;
        com.facebook.ads.redexgen.core.C1746iY c1746iY;
        interstitialAdExtendedListener = this.A00.A07;
        c1746iY = this.A00.A08;
        interstitialAdExtendedListener.onInterstitialDisplayed(c1746iY.A6k());
    }

    @Override // com.facebook.ads.redexgen.core.N2
    public final void A06() {
        com.facebook.ads.InterstitialAdExtendedListener interstitialAdExtendedListener;
        interstitialAdExtendedListener = this.A00.A07;
        interstitialAdExtendedListener.onRewardedAdServerFailed();
    }

    @Override // com.facebook.ads.redexgen.core.N2
    public final void A07() {
        com.facebook.ads.InterstitialAdExtendedListener interstitialAdExtendedListener;
        interstitialAdExtendedListener = this.A00.A07;
        interstitialAdExtendedListener.onRewardedAdServerSucceeded();
    }

    @Override // com.facebook.ads.redexgen.core.N2
    public final void A08() {
        com.facebook.ads.InterstitialAdExtendedListener interstitialAdExtendedListener;
        interstitialAdExtendedListener = this.A00.A07;
        interstitialAdExtendedListener.onRewardedAdCompleted();
    }

    @Override // com.facebook.ads.redexgen.core.N2
    public final void A0C() {
        com.facebook.ads.InterstitialAdExtendedListener interstitialAdExtendedListener;
        com.facebook.ads.redexgen.core.C1746iY c1746iY;
        this.A00.A06.A0F().A3K();
        interstitialAdExtendedListener = this.A00.A07;
        c1746iY = this.A00.A08;
        interstitialAdExtendedListener.onAdClicked(c1746iY.A6k());
    }

    @Override // com.facebook.ads.redexgen.core.N2
    public final void A0D() {
        com.facebook.ads.InterstitialAdExtendedListener interstitialAdExtendedListener;
        com.facebook.ads.redexgen.core.C1746iY c1746iY;
        interstitialAdExtendedListener = this.A00.A07;
        c1746iY = this.A00.A08;
        interstitialAdExtendedListener.onLoggingImpression(c1746iY.A6k());
    }

    @Override // com.facebook.ads.redexgen.core.N2
    public final void A0E(android.view.View view) {
    }

    @Override // com.facebook.ads.redexgen.core.N2
    public final void A0F(com.facebook.ads.redexgen.core.N1 n1) {
        com.facebook.ads.redexgen.core.C05097j c05097j;
        com.facebook.ads.redexgen.core.C05097j c05097j2;
        com.facebook.ads.redexgen.core.NQ nq;
        com.facebook.ads.InterstitialAdExtendedListener interstitialAdExtendedListener;
        com.facebook.ads.redexgen.core.C1746iY c1746iY;
        com.facebook.ads.redexgen.core.NQ nq2;
        com.facebook.ads.InterstitialAd interstitialAd;
        com.facebook.ads.InterstitialAdExtendedListener interstitialAdExtendedListener2;
        com.facebook.ads.redexgen.core.C1746iY c1746iY2;
        com.facebook.ads.InterstitialAdExtendedListener interstitialAdExtendedListener3;
        com.facebook.ads.redexgen.core.C1746iY c1746iY3;
        com.facebook.ads.InterstitialAd interstitialAd2;
        com.facebook.ads.redexgen.core.C1746iY c1746iY4;
        com.facebook.ads.redexgen.core.C1746iY c1746iY5;
        com.facebook.ads.InterstitialAd interstitialAd3;
        com.facebook.ads.redexgen.core.C1746iY c1746iY6;
        com.facebook.ads.redexgen.core.C1746iY c1746iY7;
        com.facebook.ads.redexgen.core.C1746iY c1746iY8;
        c05097j = this.A00.A03;
        if (c05097j != null) {
            this.A00.A05 = true;
            com.facebook.ads.redexgen.core.C1750id c1750id = this.A00;
            c05097j2 = this.A00.A03;
            c1750id.A02 = c05097j2.A0I();
            nq = this.A00.A02;
            if (!(nq instanceof com.facebook.ads.redexgen.core.AbstractC1801jd)) {
                interstitialAdExtendedListener = this.A00.A07;
                java.lang.String[] strArr = A02;
                if (strArr[0].charAt(8) == strArr[3].charAt(8)) {
                    java.lang.String[] strArr2 = A02;
                    strArr2[6] = "JHAXxmwzHKs3NajX";
                    strArr2[5] = "FHZeNyejFCAXh3Vz";
                    c1746iY = this.A00.A08;
                    interstitialAdExtendedListener.onAdLoaded(c1746iY.A6k());
                    return;
                }
            } else {
                nq2 = this.A00.A02;
                com.facebook.ads.redexgen.core.AbstractC1801jd abstractC1801jd = (com.facebook.ads.redexgen.core.AbstractC1801jd) nq2;
                if (abstractC1801jd.A26() > 0) {
                    com.facebook.ads.redexgen.core.XC xc = new com.facebook.ads.redexgen.core.XC();
                    com.facebook.ads.redexgen.core.C1636gi c1636gi = this.A00.A06;
                    c1746iY6 = this.A00.A08;
                    if (xc.A09(c1636gi, c1746iY6.A08(), abstractC1801jd.A26())) {
                        xc.A08(this.A00.A06, true);
                        com.facebook.ads.redexgen.core.C1750id c1750id2 = this.A00;
                        com.facebook.ads.redexgen.core.C1636gi c1636gi2 = this.A00.A06;
                        c1746iY7 = this.A00.A08;
                        java.lang.String A0A = c1746iY7.A0A();
                        c1746iY8 = this.A00.A08;
                        c1750id2.A01 = xc.A06(c1636gi2, A0A, c1746iY8.A08());
                    } else {
                        com.facebook.ads.redexgen.core.C1750id c1750id3 = this.A00;
                        if (A02[1].charAt(2) != 'w') {
                            A02[7] = "alFbtn3b1";
                            xc.A08(c1750id3.A06, false);
                        } else {
                            java.lang.String[] strArr3 = A02;
                            strArr3[6] = "OkLAbmcEeyte5Vfo";
                            strArr3[5] = "zgaU15rF2mVDrexS";
                            xc.A08(c1750id3.A06, false);
                        }
                    }
                }
                com.facebook.ads.redexgen.core.C1750id c1750id4 = this.A00;
                if (A02[1].charAt(2) != 'w') {
                    A02[1] = "23I4hcZMgJ395X2lYna8PMjzW0ozt3hz";
                    interstitialAd = c1750id4.A01;
                    if (interstitialAd != null) {
                        abstractC1801jd.A2J(true);
                        interstitialAd2 = this.A00.A01;
                        com.facebook.ads.InterstitialAd.InterstitialAdLoadConfigBuilder withAdListener = interstitialAd2.buildLoadAdConfig().withAdListener(new com.facebook.ads.redexgen.core.OH(this, abstractC1801jd));
                        c1746iY4 = this.A00.A08;
                        com.facebook.ads.InterstitialAd.InterstitialAdLoadConfigBuilder withCacheFlags = withAdListener.withCacheFlags(c1746iY4.A0B());
                        c1746iY5 = this.A00.A08;
                        com.facebook.ads.InterstitialAd.InterstitialLoadAdConfig loadAdConfig = withCacheFlags.withRewardData(c1746iY5.A03()).build();
                        interstitialAd3 = this.A00.A01;
                        interstitialAd3.loadAd(loadAdConfig);
                        return;
                    }
                    com.facebook.ads.redexgen.core.C1750id c1750id5 = this.A00;
                    java.lang.String[] strArr4 = A02;
                    if (strArr4[0].charAt(8) != strArr4[3].charAt(8)) {
                        interstitialAdExtendedListener3 = c1750id5.A07;
                        c1746iY3 = this.A00.A08;
                        interstitialAdExtendedListener3.onAdLoaded(c1746iY3.A6k());
                        return;
                    } else {
                        A02[2] = "joZPUUFug9Ts";
                        interstitialAdExtendedListener2 = c1750id5.A07;
                        c1746iY2 = this.A00.A08;
                        interstitialAdExtendedListener2.onAdLoaded(c1746iY2.A6k());
                        return;
                    }
                }
            }
            throw new java.lang.RuntimeException();
        }
        this.A00.A06.A08().ABC(A00(0, 3, 98), com.facebook.ads.redexgen.core.AbstractC1048Td.A0N, new com.facebook.ads.redexgen.core.C1049Te(A00(3, 18, 46)));
    }

    @Override // com.facebook.ads.redexgen.core.N2
    public final void A0G(com.facebook.ads.redexgen.core.C1108Vm c1108Vm) {
        long j;
        com.facebook.ads.InterstitialAdExtendedListener interstitialAdExtendedListener;
        com.facebook.ads.redexgen.core.C1746iY c1746iY;
        com.facebook.ads.redexgen.core.InterfaceC0862Lt A0F = this.A00.A06.A0F();
        j = this.A00.A00;
        A0F.A3N(com.facebook.ads.redexgen.core.Y1.A01(j), c1108Vm.A03().getErrorCode(), c1108Vm.A04());
        interstitialAdExtendedListener = this.A00.A07;
        c1746iY = this.A00.A08;
        interstitialAdExtendedListener.onError(c1746iY.A6k(), com.facebook.ads.redexgen.core.XE.A00(c1108Vm));
    }
}
