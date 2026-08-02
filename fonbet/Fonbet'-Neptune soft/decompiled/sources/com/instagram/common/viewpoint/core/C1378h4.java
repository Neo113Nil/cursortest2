package com.instagram.common.viewpoint.core;

import android.view.View;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdExtendedListener;
import java.util.Arrays;
import okio.Utf8;

/* renamed from: com.facebook.ads.redexgen.X.h4, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1378h4 extends MQ {
    public static byte[] A01;
    public static String[] A02 = {"swComlxz6aoGHqKS8LOj1g5iAOstdInC", "iLoXwxITRpbgZFbT1koR1uJW4vvDXY2W", "MpkXHfR6HdYIg9t449R", "HQI6v11U6roDlbOuDHGyMjhCWVrAbgmk", "qsbQ14vrFuO8q1N0nwgFIOsRNgh3HWyt", "NXqrvE65RyYHWICx", "E9yzS8MfEszoKvwo", "osh9YHk0bwFUuMRHqHbnPk"};
    public final /* synthetic */ C1374gz A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 98);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{97, 112, 105, 47, 35, 34, 56, 62, 35, 32, 32, 41, 62, 108, 37, Utf8.REPLACEMENT_BYTE, 108, 34, 57, 32, 32};
    }

    static {
        A01();
    }

    public C1378h4(C1374gz c1374gz) {
        this.A00 = c1374gz;
    }

    @Override // com.instagram.common.viewpoint.core.MQ
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

    @Override // com.instagram.common.viewpoint.core.MQ
    public final void A04() {
        InterstitialAd interstitialAd;
        InterstitialAd interstitialAd2;
        C02186y c02186y;
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        C1370gv c1370gv;
        C02186y c02186y2;
        C02186y c02186y3;
        C02186y c02186y4;
        interstitialAd = this.A00.A01;
        if (interstitialAd != null) {
            interstitialAd2 = this.A00.A01;
            interstitialAd2.show();
            return;
        }
        this.A00.A04 = false;
        c02186y = this.A00.A03;
        if (c02186y != null && U7.A26(this.A00.A06)) {
            c02186y2 = this.A00.A03;
            c02186y2.A0S(new C1379h5(this));
            c02186y3 = this.A00.A03;
            c02186y3.A0N();
            c02186y4 = this.A00.A03;
            c02186y4.A0K();
            this.A00.A03 = null;
        }
        interstitialAdExtendedListener = this.A00.A07;
        c1370gv = this.A00.A08;
        interstitialAdExtendedListener.onInterstitialDismissed(c1370gv.A6c());
    }

    @Override // com.instagram.common.viewpoint.core.MQ
    public final void A05() {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        C1370gv c1370gv;
        interstitialAdExtendedListener = this.A00.A07;
        c1370gv = this.A00.A08;
        interstitialAdExtendedListener.onInterstitialDisplayed(c1370gv.A6c());
    }

    @Override // com.instagram.common.viewpoint.core.MQ
    public final void A06() {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        interstitialAdExtendedListener = this.A00.A07;
        interstitialAdExtendedListener.onRewardedAdServerFailed();
    }

    @Override // com.instagram.common.viewpoint.core.MQ
    public final void A07() {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        interstitialAdExtendedListener = this.A00.A07;
        interstitialAdExtendedListener.onRewardedAdServerSucceeded();
    }

    @Override // com.instagram.common.viewpoint.core.MQ
    public final void A08() {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        interstitialAdExtendedListener = this.A00.A07;
        interstitialAdExtendedListener.onRewardedAdCompleted();
    }

    @Override // com.instagram.common.viewpoint.core.MQ
    public final void A0C() {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        C1370gv c1370gv;
        this.A00.A06.A0F().A3C();
        interstitialAdExtendedListener = this.A00.A07;
        c1370gv = this.A00.A08;
        interstitialAdExtendedListener.onAdClicked(c1370gv.A6c());
    }

    @Override // com.instagram.common.viewpoint.core.MQ
    public final void A0D() {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        C1370gv c1370gv;
        interstitialAdExtendedListener = this.A00.A07;
        c1370gv = this.A00.A08;
        interstitialAdExtendedListener.onLoggingImpression(c1370gv.A6c());
    }

    @Override // com.instagram.common.viewpoint.core.MQ
    public final void A0E(View view) {
    }

    @Override // com.instagram.common.viewpoint.core.MQ
    public final void A0F(MP mp) {
        C02186y c02186y;
        C02186y c02186y2;
        AbstractC0606Mo abstractC0606Mo;
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        C1370gv c1370gv;
        AbstractC0606Mo abstractC0606Mo2;
        InterstitialAd interstitialAd;
        InterstitialAdExtendedListener interstitialAdExtendedListener2;
        C1370gv c1370gv2;
        InterstitialAdExtendedListener interstitialAdExtendedListener3;
        C1370gv c1370gv3;
        InterstitialAd interstitialAd2;
        C1370gv c1370gv4;
        C1370gv c1370gv5;
        InterstitialAd interstitialAd3;
        C1370gv c1370gv6;
        C1370gv c1370gv7;
        C1370gv c1370gv8;
        c02186y = this.A00.A03;
        if (c02186y != null) {
            this.A00.A05 = true;
            C1374gz c1374gz = this.A00;
            c02186y2 = this.A00.A03;
            c1374gz.A02 = c02186y2.A0I();
            abstractC0606Mo = this.A00.A02;
            if (!(abstractC0606Mo instanceof AbstractC1428hy)) {
                interstitialAdExtendedListener = this.A00.A07;
                String[] strArr = A02;
                if (strArr[0].charAt(8) == strArr[3].charAt(8)) {
                    String[] strArr2 = A02;
                    strArr2[6] = "JHAXxmwzHKs3NajX";
                    strArr2[5] = "FHZeNyejFCAXh3Vz";
                    c1370gv = this.A00.A08;
                    interstitialAdExtendedListener.onAdLoaded(c1370gv.A6c());
                    return;
                }
            } else {
                abstractC0606Mo2 = this.A00.A02;
                AbstractC1428hy abstractC1428hy = (AbstractC1428hy) abstractC0606Mo2;
                if (abstractC1428hy.A1x() > 0) {
                    WR wr = new WR();
                    C1153dL c1153dL = this.A00.A06;
                    c1370gv6 = this.A00.A08;
                    if (wr.A09(c1153dL, c1370gv6.A08(), abstractC1428hy.A1x())) {
                        wr.A08(this.A00.A06, true);
                        C1374gz c1374gz2 = this.A00;
                        C1153dL c1153dL2 = this.A00.A06;
                        c1370gv7 = this.A00.A08;
                        String A0A = c1370gv7.A0A();
                        c1370gv8 = this.A00.A08;
                        c1374gz2.A01 = wr.A06(c1153dL2, A0A, c1370gv8.A08());
                    } else {
                        C1374gz c1374gz3 = this.A00;
                        if (A02[1].charAt(2) != 'w') {
                            A02[7] = "alFbtn3b1";
                            wr.A08(c1374gz3.A06, false);
                        } else {
                            String[] strArr3 = A02;
                            strArr3[6] = "OkLAbmcEeyte5Vfo";
                            strArr3[5] = "zgaU15rF2mVDrexS";
                            wr.A08(c1374gz3.A06, false);
                        }
                    }
                }
                C1374gz c1374gz4 = this.A00;
                if (A02[1].charAt(2) != 'w') {
                    A02[1] = "23I4hcZMgJ395X2lYna8PMjzW0ozt3hz";
                    interstitialAd = c1374gz4.A01;
                    if (interstitialAd != null) {
                        abstractC1428hy.A2A(true);
                        interstitialAd2 = this.A00.A01;
                        InterstitialAd.InterstitialAdLoadConfigBuilder withAdListener = interstitialAd2.buildLoadAdConfig().withAdListener(new C0621Nd(this, abstractC1428hy));
                        c1370gv4 = this.A00.A08;
                        InterstitialAd.InterstitialAdLoadConfigBuilder withCacheFlags = withAdListener.withCacheFlags(c1370gv4.A0B());
                        c1370gv5 = this.A00.A08;
                        InterstitialAd.InterstitialLoadAdConfig loadAdConfig = withCacheFlags.withRewardData(c1370gv5.A03()).build();
                        interstitialAd3 = this.A00.A01;
                        interstitialAd3.loadAd(loadAdConfig);
                        return;
                    }
                    C1374gz c1374gz5 = this.A00;
                    String[] strArr4 = A02;
                    if (strArr4[0].charAt(8) != strArr4[3].charAt(8)) {
                        interstitialAdExtendedListener3 = c1374gz5.A07;
                        c1370gv3 = this.A00.A08;
                        interstitialAdExtendedListener3.onAdLoaded(c1370gv3.A6c());
                        return;
                    } else {
                        A02[2] = "joZPUUFug9Ts";
                        interstitialAdExtendedListener2 = c1374gz5.A07;
                        c1370gv2 = this.A00.A08;
                        interstitialAdExtendedListener2.onAdLoaded(c1370gv2.A6c());
                        return;
                    }
                }
            }
            throw new RuntimeException();
        }
        this.A00.A06.A08().AAy(A00(0, 3, 98), AbstractC0766Sv.A0N, new C0767Sw(A00(3, 18, 46)));
    }

    @Override // com.instagram.common.viewpoint.core.MQ
    public final void A0G(V1 v1) {
        long j;
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        C1370gv c1370gv;
        LH A0F = this.A00.A06.A0F();
        j = this.A00.A00;
        A0F.A3F(XG.A01(j), v1.A03().getErrorCode(), v1.A04());
        interstitialAdExtendedListener = this.A00.A07;
        c1370gv = this.A00.A08;
        interstitialAdExtendedListener.onError(c1370gv.A6c(), WT.A00(v1));
    }
}
