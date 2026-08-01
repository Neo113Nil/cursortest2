package com.instagram.common.viewpoint.core;

import android.view.View;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdExtendedListener;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.if, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public class Cif extends N2 {
    public static byte[] A01;
    public static String[] A02 = {"swComlxz6aoGHqKS8LOj1g5iAOstdInC", "iLoXwxITRpbgZFbT1koR1uJW4vvDXY2W", "MpkXHfR6HdYIg9t449R", "HQI6v11U6roDlbOuDHGyMjhCWVrAbgmk", "qsbQ14vrFuO8q1N0nwgFIOsRNgh3HWyt", "NXqrvE65RyYHWICx", "E9yzS8MfEszoKvwo", "osh9YHk0bwFUuMRHqHbnPk"};
    public final /* synthetic */ C3044id A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 98);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{97, 112, 105, 47, 35, 34, 56, 62, 35, 32, 32, 41, 62, 108, 37, 63, 108, 34, 57, 32, 32};
    }

    static {
        A01();
    }

    public Cif(C3044id c3044id) {
        this.A00 = c3044id;
    }

    @Override // com.instagram.common.viewpoint.core.N2
    public final void A02() {
        InterstitialAd interstitialAd;
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        interstitialAd = this.A00.A01;
        if (interstitialAd == null) {
            this.A00.A04 = false;
            interstitialAdExtendedListener = this.A00.A07;
            interstitialAdExtendedListener.onInterstitialActivityDestroyed();
        }
    }

    @Override // com.instagram.common.viewpoint.core.N2
    public final void A04() {
        InterstitialAd interstitialAd;
        InterstitialAd interstitialAd2;
        C18037j c18037j;
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        C3040iY c3040iY;
        C18037j c18037j2;
        C18037j c18037j3;
        C18037j c18037j4;
        interstitialAd = this.A00.A01;
        if (interstitialAd != null) {
            interstitialAd2 = this.A00.A01;
            interstitialAd2.show();
            return;
        }
        this.A00.A04 = false;
        c18037j = this.A00.A03;
        if (c18037j != null && C2380Up.A2D(this.A00.A06)) {
            c18037j2 = this.A00.A03;
            c18037j2.A0S(new C3046ig(this));
            c18037j3 = this.A00.A03;
            c18037j3.A0N();
            c18037j4 = this.A00.A03;
            c18037j4.A0K();
            this.A00.A03 = null;
        }
        interstitialAdExtendedListener = this.A00.A07;
        c3040iY = this.A00.A08;
        interstitialAdExtendedListener.onInterstitialDismissed(c3040iY.A6k());
    }

    @Override // com.instagram.common.viewpoint.core.N2
    public final void A05() {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        C3040iY c3040iY;
        interstitialAdExtendedListener = this.A00.A07;
        c3040iY = this.A00.A08;
        interstitialAdExtendedListener.onInterstitialDisplayed(c3040iY.A6k());
    }

    @Override // com.instagram.common.viewpoint.core.N2
    public final void A06() {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        interstitialAdExtendedListener = this.A00.A07;
        interstitialAdExtendedListener.onRewardedAdServerFailed();
    }

    @Override // com.instagram.common.viewpoint.core.N2
    public final void A07() {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        interstitialAdExtendedListener = this.A00.A07;
        interstitialAdExtendedListener.onRewardedAdServerSucceeded();
    }

    @Override // com.instagram.common.viewpoint.core.N2
    public final void A08() {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        interstitialAdExtendedListener = this.A00.A07;
        interstitialAdExtendedListener.onRewardedAdCompleted();
    }

    @Override // com.instagram.common.viewpoint.core.N2
    public final void A0C() {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        C3040iY c3040iY;
        this.A00.A06.A0F().A3K();
        interstitialAdExtendedListener = this.A00.A07;
        c3040iY = this.A00.A08;
        interstitialAdExtendedListener.onAdClicked(c3040iY.A6k());
    }

    @Override // com.instagram.common.viewpoint.core.N2
    public final void A0D() {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        C3040iY c3040iY;
        interstitialAdExtendedListener = this.A00.A07;
        c3040iY = this.A00.A08;
        interstitialAdExtendedListener.onLoggingImpression(c3040iY.A6k());
    }

    @Override // com.instagram.common.viewpoint.core.N2
    public final void A0E(View view) {
    }

    @Override // com.instagram.common.viewpoint.core.N2
    public final void A0F(N1 n1) {
        C18037j c18037j;
        C18037j c18037j2;
        NQ nq;
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        C3040iY c3040iY;
        NQ nq2;
        InterstitialAd interstitialAd;
        InterstitialAdExtendedListener interstitialAdExtendedListener2;
        C3040iY c3040iY2;
        InterstitialAdExtendedListener interstitialAdExtendedListener3;
        C3040iY c3040iY3;
        InterstitialAd interstitialAd2;
        C3040iY c3040iY4;
        C3040iY c3040iY5;
        InterstitialAd interstitialAd3;
        C3040iY c3040iY6;
        C3040iY c3040iY7;
        C3040iY c3040iY8;
        c18037j = this.A00.A03;
        if (c18037j != null) {
            this.A00.A05 = true;
            C3044id c3044id = this.A00;
            c18037j2 = this.A00.A03;
            c3044id.A02 = c18037j2.A0I();
            nq = this.A00.A02;
            if (!(nq instanceof AbstractC3095jd)) {
                interstitialAdExtendedListener = this.A00.A07;
                String[] strArr = A02;
                if (strArr[0].charAt(8) == strArr[3].charAt(8)) {
                    String[] strArr2 = A02;
                    strArr2[6] = "JHAXxmwzHKs3NajX";
                    strArr2[5] = "FHZeNyejFCAXh3Vz";
                    c3040iY = this.A00.A08;
                    interstitialAdExtendedListener.onAdLoaded(c3040iY.A6k());
                    return;
                }
            } else {
                nq2 = this.A00.A02;
                AbstractC3095jd abstractC3095jd = (AbstractC3095jd) nq2;
                if (abstractC3095jd.A26() > 0) {
                    XC xc = new XC();
                    C2930gi c2930gi = this.A00.A06;
                    c3040iY6 = this.A00.A08;
                    if (xc.A09(c2930gi, c3040iY6.A08(), abstractC3095jd.A26())) {
                        xc.A08(this.A00.A06, true);
                        C3044id c3044id2 = this.A00;
                        C2930gi c2930gi2 = this.A00.A06;
                        c3040iY7 = this.A00.A08;
                        String A0A = c3040iY7.A0A();
                        c3040iY8 = this.A00.A08;
                        c3044id2.A01 = xc.A06(c2930gi2, A0A, c3040iY8.A08());
                    } else {
                        C3044id c3044id3 = this.A00;
                        if (A02[1].charAt(2) != 'w') {
                            A02[7] = "alFbtn3b1";
                            xc.A08(c3044id3.A06, false);
                        } else {
                            String[] strArr3 = A02;
                            strArr3[6] = "OkLAbmcEeyte5Vfo";
                            strArr3[5] = "zgaU15rF2mVDrexS";
                            xc.A08(c3044id3.A06, false);
                        }
                    }
                }
                C3044id c3044id4 = this.A00;
                if (A02[1].charAt(2) != 'w') {
                    A02[1] = "23I4hcZMgJ395X2lYna8PMjzW0ozt3hz";
                    interstitialAd = c3044id4.A01;
                    if (interstitialAd != null) {
                        abstractC3095jd.A2J(true);
                        interstitialAd2 = this.A00.A01;
                        InterstitialAd.InterstitialAdLoadConfigBuilder withAdListener = interstitialAd2.buildLoadAdConfig().withAdListener(new OH(this, abstractC3095jd));
                        c3040iY4 = this.A00.A08;
                        InterstitialAd.InterstitialAdLoadConfigBuilder withCacheFlags = withAdListener.withCacheFlags(c3040iY4.A0B());
                        c3040iY5 = this.A00.A08;
                        InterstitialAd.InterstitialLoadAdConfig loadAdConfig = withCacheFlags.withRewardData(c3040iY5.A03()).build();
                        interstitialAd3 = this.A00.A01;
                        interstitialAd3.loadAd(loadAdConfig);
                        return;
                    }
                    C3044id c3044id5 = this.A00;
                    String[] strArr4 = A02;
                    if (strArr4[0].charAt(8) != strArr4[3].charAt(8)) {
                        interstitialAdExtendedListener3 = c3044id5.A07;
                        c3040iY3 = this.A00.A08;
                        interstitialAdExtendedListener3.onAdLoaded(c3040iY3.A6k());
                        return;
                    } else {
                        A02[2] = "joZPUUFug9Ts";
                        interstitialAdExtendedListener2 = c3044id5.A07;
                        c3040iY2 = this.A00.A08;
                        interstitialAdExtendedListener2.onAdLoaded(c3040iY2.A6k());
                        return;
                    }
                }
            }
            throw new RuntimeException();
        }
        this.A00.A06.A08().ABC(A00(0, 3, 98), AbstractC2342Td.A0N, new C2343Te(A00(3, 18, 46)));
    }

    @Override // com.instagram.common.viewpoint.core.N2
    public final void A0G(C2402Vm c2402Vm) {
        long j;
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        C3040iY c3040iY;
        InterfaceC2156Lt A0F = this.A00.A06.A0F();
        j = this.A00.A00;
        A0F.A3N(Y1.A01(j), c2402Vm.A03().getErrorCode(), c2402Vm.A04());
        interstitialAdExtendedListener = this.A00.A07;
        c3040iY = this.A00.A08;
        interstitialAdExtendedListener.onError(c3040iY.A6k(), XE.A00(c2402Vm));
    }
}
