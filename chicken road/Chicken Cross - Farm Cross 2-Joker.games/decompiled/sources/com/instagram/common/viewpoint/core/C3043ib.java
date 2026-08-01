package com.instagram.common.viewpoint.core;

import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.S2SRewardedVideoAdExtendedListener;
import com.google.common.base.Ascii;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.ib, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C3043ib extends N2 {
    public static byte[] A01;
    public final /* synthetic */ C3041iZ A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 43);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{9, Ascii.CAN, 1, 36, 40, 41, 51, 53, 40, 43, 43, 34, 53, 103, 46, 52, 103, 41, 50, 43, 43};
    }

    public C3043ib(C3041iZ c3041iZ) {
        this.A00 = c3041iZ;
    }

    @Override // com.instagram.common.viewpoint.core.N2
    public final void A06() {
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        s2SRewardedVideoAdExtendedListener = this.A00.A07;
        s2SRewardedVideoAdExtendedListener.onRewardServerFailed();
    }

    @Override // com.instagram.common.viewpoint.core.N2
    public final void A07() {
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        s2SRewardedVideoAdExtendedListener = this.A00.A07;
        s2SRewardedVideoAdExtendedListener.onRewardServerSuccess();
    }

    @Override // com.instagram.common.viewpoint.core.N2
    public final void A08() {
        RewardedVideoAd rewardedVideoAd;
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        rewardedVideoAd = this.A00.A02;
        if (rewardedVideoAd == null) {
            s2SRewardedVideoAdExtendedListener = this.A00.A07;
            s2SRewardedVideoAdExtendedListener.onRewardedVideoCompleted();
        }
    }

    @Override // com.instagram.common.viewpoint.core.N2
    public final void A09() {
        RewardedVideoAd rewardedVideoAd;
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        rewardedVideoAd = this.A00.A02;
        if (rewardedVideoAd == null) {
            s2SRewardedVideoAdExtendedListener = this.A00.A07;
            s2SRewardedVideoAdExtendedListener.onRewardedVideoActivityDestroyed();
        }
    }

    @Override // com.instagram.common.viewpoint.core.N2
    public final void A0A() {
        RewardedVideoAd rewardedVideoAd;
        RewardedVideoAd rewardedVideoAd2;
        long j;
        RewardedVideoAd rewardedVideoAd3;
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        rewardedVideoAd = this.A00.A02;
        if (rewardedVideoAd != null) {
            rewardedVideoAd2 = this.A00.A02;
            SJ sj = (SJ) rewardedVideoAd2.buildShowAdConfig();
            long currentTimeMillis = System.currentTimeMillis();
            j = this.A00.A01;
            sj.A02(currentTimeMillis - j);
            rewardedVideoAd3 = this.A00.A02;
            rewardedVideoAd3.show(sj.build());
            return;
        }
        s2SRewardedVideoAdExtendedListener = this.A00.A07;
        s2SRewardedVideoAdExtendedListener.onRewardedVideoClosed();
    }

    @Override // com.instagram.common.viewpoint.core.N2
    public final void A0C() {
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        C3025iI c3025iI;
        this.A00.A06.A0F().A3K();
        s2SRewardedVideoAdExtendedListener = this.A00.A07;
        c3025iI = this.A00.A08;
        s2SRewardedVideoAdExtendedListener.onAdClicked(c3025iI.A6k());
    }

    @Override // com.instagram.common.viewpoint.core.N2
    public final void A0D() {
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        C3025iI c3025iI;
        s2SRewardedVideoAdExtendedListener = this.A00.A07;
        c3025iI = this.A00.A08;
        s2SRewardedVideoAdExtendedListener.onLoggingImpression(c3025iI.A6k());
    }

    @Override // com.instagram.common.viewpoint.core.N2
    public final void A0F(N1 n1) {
        C17947a c17947a;
        C3025iI c3025iI;
        C3025iI c3025iI2;
        C17947a c17947a2;
        NQ nq;
        RewardedVideoAd rewardedVideoAd;
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        C3025iI c3025iI3;
        NQ nq2;
        RewardedVideoAd rewardedVideoAd2;
        NQ nq3;
        C3025iI c3025iI4;
        RewardedVideoAd rewardedVideoAd3;
        NQ nq4;
        C3025iI c3025iI5;
        C3025iI c3025iI6;
        C3025iI c3025iI7;
        NQ nq5;
        C3025iI c3025iI8;
        c17947a = this.A00.A04;
        if (c17947a == null) {
            this.A00.A06.A08().ABC(A00(0, 3, 67), AbstractC2342Td.A0N, new C2343Te(A00(3, 18, 108)));
            return;
        }
        AbstractC3099jh abstractC3099jh = (AbstractC3099jh) n1;
        c3025iI = this.A00.A08;
        if (c3025iI.A03 != null) {
            c3025iI8 = this.A00.A08;
            abstractC3099jh.A02(c3025iI8.A03);
        }
        c3025iI2 = this.A00.A08;
        c3025iI2.A00 = abstractC3099jh.A0H();
        this.A00.A05 = true;
        C3041iZ c3041iZ = this.A00;
        c17947a2 = this.A00.A04;
        c3041iZ.A03 = c17947a2.A0I();
        nq = this.A00.A03;
        if (nq != null) {
            int i = 0;
            nq4 = this.A00.A03;
            if (!nq4.A1b()) {
                nq5 = this.A00.A03;
                i = ((AbstractC3095jd) nq5).A26();
            }
            if (i > 0) {
                XC xc = new XC();
                C2930gi c2930gi = this.A00.A06;
                c3025iI5 = this.A00.A08;
                if (xc.A09(c2930gi, c3025iI5.A06, i)) {
                    xc.A08(this.A00.A06, true);
                    C3041iZ c3041iZ2 = this.A00;
                    C2930gi c2930gi2 = this.A00.A06;
                    c3025iI6 = this.A00.A08;
                    String str = c3025iI6.A0D;
                    c3025iI7 = this.A00.A08;
                    c3041iZ2.A02 = xc.A07(c2930gi2, str, c3025iI7.A06);
                } else {
                    xc.A08(this.A00.A06, false);
                }
            }
        }
        rewardedVideoAd = this.A00.A02;
        if (rewardedVideoAd == null) {
            s2SRewardedVideoAdExtendedListener = this.A00.A07;
            c3025iI3 = this.A00.A08;
            s2SRewardedVideoAdExtendedListener.onAdLoaded(c3025iI3.A6k());
            return;
        }
        nq2 = this.A00.A03;
        ((AbstractC3095jd) nq2).A2J(true);
        rewardedVideoAd2 = this.A00.A02;
        RewardedVideoAd.RewardedVideoAdLoadConfigBuilder withFailOnCacheFailureEnabled = rewardedVideoAd2.buildLoadAdConfig().withFailOnCacheFailureEnabled(true);
        nq3 = this.A00.A03;
        RewardedVideoAd.RewardedVideoAdLoadConfigBuilder withRewardData = withFailOnCacheFailureEnabled.withRewardData(nq3.A0s());
        c3025iI4 = this.A00.A08;
        RewardedVideoAd.RewardedVideoLoadAdConfig loadAdConfig = withRewardData.withAdExperience(c3025iI4.A02).withAdListener(new OI(this)).build();
        rewardedVideoAd3 = this.A00.A02;
        rewardedVideoAd3.loadAd(loadAdConfig);
    }

    @Override // com.instagram.common.viewpoint.core.N2
    public final void A0G(C2402Vm c2402Vm) {
        C3025iI c3025iI;
        long j;
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        C3025iI c3025iI2;
        this.A00.A0D(true);
        c3025iI = this.A00.A08;
        InterfaceC2156Lt A0F = c3025iI.A0B.A0F();
        j = this.A00.A00;
        A0F.A3N(Y1.A01(j), c2402Vm.A03().getErrorCode(), c2402Vm.A04());
        s2SRewardedVideoAdExtendedListener = this.A00.A07;
        c3025iI2 = this.A00.A08;
        s2SRewardedVideoAdExtendedListener.onError(c3025iI2.A6k(), XE.A00(c2402Vm));
    }
}
