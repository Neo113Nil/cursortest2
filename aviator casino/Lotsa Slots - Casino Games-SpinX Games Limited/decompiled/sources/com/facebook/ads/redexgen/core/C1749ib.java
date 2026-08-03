package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.ib, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1749ib extends com.facebook.ads.redexgen.core.N2 {
    public static byte[] A01;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1747iZ A00;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 43);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{9, com.google.common.base.Ascii.CAN, 1, 36, 40, 41, 51, 53, 40, 43, 43, 34, 53, 103, 46, 52, 103, 41, 50, 43, 43};
    }

    public C1749ib(com.facebook.ads.redexgen.core.C1747iZ c1747iZ) {
        this.A00 = c1747iZ;
    }

    @Override // com.facebook.ads.redexgen.core.N2
    public final void A06() {
        com.facebook.ads.S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        s2SRewardedVideoAdExtendedListener = this.A00.A07;
        s2SRewardedVideoAdExtendedListener.onRewardServerFailed();
    }

    @Override // com.facebook.ads.redexgen.core.N2
    public final void A07() {
        com.facebook.ads.S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        s2SRewardedVideoAdExtendedListener = this.A00.A07;
        s2SRewardedVideoAdExtendedListener.onRewardServerSuccess();
    }

    @Override // com.facebook.ads.redexgen.core.N2
    public final void A08() {
        com.facebook.ads.RewardedVideoAd rewardedVideoAd;
        com.facebook.ads.S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        rewardedVideoAd = this.A00.A02;
        if (rewardedVideoAd == null) {
            s2SRewardedVideoAdExtendedListener = this.A00.A07;
            s2SRewardedVideoAdExtendedListener.onRewardedVideoCompleted();
        }
    }

    @Override // com.facebook.ads.redexgen.core.N2
    public final void A09() {
        com.facebook.ads.RewardedVideoAd rewardedVideoAd;
        com.facebook.ads.S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        rewardedVideoAd = this.A00.A02;
        if (rewardedVideoAd == null) {
            s2SRewardedVideoAdExtendedListener = this.A00.A07;
            s2SRewardedVideoAdExtendedListener.onRewardedVideoActivityDestroyed();
        }
    }

    @Override // com.facebook.ads.redexgen.core.N2
    public final void A0A() {
        com.facebook.ads.RewardedVideoAd rewardedVideoAd;
        com.facebook.ads.RewardedVideoAd rewardedVideoAd2;
        long j;
        com.facebook.ads.RewardedVideoAd rewardedVideoAd3;
        com.facebook.ads.S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        rewardedVideoAd = this.A00.A02;
        if (rewardedVideoAd != null) {
            rewardedVideoAd2 = this.A00.A02;
            com.facebook.ads.redexgen.core.SJ sj = (com.facebook.ads.redexgen.core.SJ) rewardedVideoAd2.buildShowAdConfig();
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            j = this.A00.A01;
            sj.A02(currentTimeMillis - j);
            rewardedVideoAd3 = this.A00.A02;
            rewardedVideoAd3.show(sj.build());
            return;
        }
        s2SRewardedVideoAdExtendedListener = this.A00.A07;
        s2SRewardedVideoAdExtendedListener.onRewardedVideoClosed();
    }

    @Override // com.facebook.ads.redexgen.core.N2
    public final void A0C() {
        com.facebook.ads.S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        com.facebook.ads.redexgen.core.C1731iI c1731iI;
        this.A00.A06.A0F().A3K();
        s2SRewardedVideoAdExtendedListener = this.A00.A07;
        c1731iI = this.A00.A08;
        s2SRewardedVideoAdExtendedListener.onAdClicked(c1731iI.A6k());
    }

    @Override // com.facebook.ads.redexgen.core.N2
    public final void A0D() {
        com.facebook.ads.S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        com.facebook.ads.redexgen.core.C1731iI c1731iI;
        s2SRewardedVideoAdExtendedListener = this.A00.A07;
        c1731iI = this.A00.A08;
        s2SRewardedVideoAdExtendedListener.onLoggingImpression(c1731iI.A6k());
    }

    @Override // com.facebook.ads.redexgen.core.N2
    public final void A0F(com.facebook.ads.redexgen.core.N1 n1) {
        com.facebook.ads.redexgen.core.C05007a c05007a;
        com.facebook.ads.redexgen.core.C1731iI c1731iI;
        com.facebook.ads.redexgen.core.C1731iI c1731iI2;
        com.facebook.ads.redexgen.core.C05007a c05007a2;
        com.facebook.ads.redexgen.core.NQ nq;
        com.facebook.ads.RewardedVideoAd rewardedVideoAd;
        com.facebook.ads.S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        com.facebook.ads.redexgen.core.C1731iI c1731iI3;
        com.facebook.ads.redexgen.core.NQ nq2;
        com.facebook.ads.RewardedVideoAd rewardedVideoAd2;
        com.facebook.ads.redexgen.core.NQ nq3;
        com.facebook.ads.redexgen.core.C1731iI c1731iI4;
        com.facebook.ads.RewardedVideoAd rewardedVideoAd3;
        com.facebook.ads.redexgen.core.NQ nq4;
        com.facebook.ads.redexgen.core.C1731iI c1731iI5;
        com.facebook.ads.redexgen.core.C1731iI c1731iI6;
        com.facebook.ads.redexgen.core.C1731iI c1731iI7;
        com.facebook.ads.redexgen.core.NQ nq5;
        com.facebook.ads.redexgen.core.C1731iI c1731iI8;
        c05007a = this.A00.A04;
        if (c05007a == null) {
            this.A00.A06.A08().ABC(A00(0, 3, 67), com.facebook.ads.redexgen.core.AbstractC1048Td.A0N, new com.facebook.ads.redexgen.core.C1049Te(A00(3, 18, 108)));
            return;
        }
        com.facebook.ads.redexgen.core.AbstractC1805jh abstractC1805jh = (com.facebook.ads.redexgen.core.AbstractC1805jh) n1;
        c1731iI = this.A00.A08;
        if (c1731iI.A03 != null) {
            c1731iI8 = this.A00.A08;
            abstractC1805jh.A02(c1731iI8.A03);
        }
        c1731iI2 = this.A00.A08;
        c1731iI2.A00 = abstractC1805jh.A0H();
        this.A00.A05 = true;
        com.facebook.ads.redexgen.core.C1747iZ c1747iZ = this.A00;
        c05007a2 = this.A00.A04;
        c1747iZ.A03 = c05007a2.A0I();
        nq = this.A00.A03;
        if (nq != null) {
            int i = 0;
            nq4 = this.A00.A03;
            if (!nq4.A1b()) {
                nq5 = this.A00.A03;
                i = ((com.facebook.ads.redexgen.core.AbstractC1801jd) nq5).A26();
            }
            if (i > 0) {
                com.facebook.ads.redexgen.core.XC xc = new com.facebook.ads.redexgen.core.XC();
                com.facebook.ads.redexgen.core.C1636gi c1636gi = this.A00.A06;
                c1731iI5 = this.A00.A08;
                if (xc.A09(c1636gi, c1731iI5.A06, i)) {
                    xc.A08(this.A00.A06, true);
                    com.facebook.ads.redexgen.core.C1747iZ c1747iZ2 = this.A00;
                    com.facebook.ads.redexgen.core.C1636gi c1636gi2 = this.A00.A06;
                    c1731iI6 = this.A00.A08;
                    java.lang.String str = c1731iI6.A0D;
                    c1731iI7 = this.A00.A08;
                    c1747iZ2.A02 = xc.A07(c1636gi2, str, c1731iI7.A06);
                } else {
                    xc.A08(this.A00.A06, false);
                }
            }
        }
        rewardedVideoAd = this.A00.A02;
        if (rewardedVideoAd == null) {
            s2SRewardedVideoAdExtendedListener = this.A00.A07;
            c1731iI3 = this.A00.A08;
            s2SRewardedVideoAdExtendedListener.onAdLoaded(c1731iI3.A6k());
            return;
        }
        nq2 = this.A00.A03;
        ((com.facebook.ads.redexgen.core.AbstractC1801jd) nq2).A2J(true);
        rewardedVideoAd2 = this.A00.A02;
        com.facebook.ads.RewardedVideoAd.RewardedVideoAdLoadConfigBuilder withFailOnCacheFailureEnabled = rewardedVideoAd2.buildLoadAdConfig().withFailOnCacheFailureEnabled(true);
        nq3 = this.A00.A03;
        com.facebook.ads.RewardedVideoAd.RewardedVideoAdLoadConfigBuilder withRewardData = withFailOnCacheFailureEnabled.withRewardData(nq3.A0s());
        c1731iI4 = this.A00.A08;
        com.facebook.ads.RewardedVideoAd.RewardedVideoLoadAdConfig loadAdConfig = withRewardData.withAdExperience(c1731iI4.A02).withAdListener(new com.facebook.ads.redexgen.core.OI(this)).build();
        rewardedVideoAd3 = this.A00.A02;
        rewardedVideoAd3.loadAd(loadAdConfig);
    }

    @Override // com.facebook.ads.redexgen.core.N2
    public final void A0G(com.facebook.ads.redexgen.core.C1108Vm c1108Vm) {
        com.facebook.ads.redexgen.core.C1731iI c1731iI;
        long j;
        com.facebook.ads.S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        com.facebook.ads.redexgen.core.C1731iI c1731iI2;
        this.A00.A0D(true);
        c1731iI = this.A00.A08;
        com.facebook.ads.redexgen.core.InterfaceC0862Lt A0F = c1731iI.A0B.A0F();
        j = this.A00.A00;
        A0F.A3N(com.facebook.ads.redexgen.core.Y1.A01(j), c1108Vm.A03().getErrorCode(), c1108Vm.A04());
        s2SRewardedVideoAdExtendedListener = this.A00.A07;
        c1731iI2 = this.A00.A08;
        s2SRewardedVideoAdExtendedListener.onError(c1731iI2.A6k(), com.facebook.ads.redexgen.core.XE.A00(c1108Vm));
    }
}
