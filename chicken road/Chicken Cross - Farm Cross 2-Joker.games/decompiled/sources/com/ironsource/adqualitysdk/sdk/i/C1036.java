package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import com.ogury.ad.OguryInterstitialAd;
import com.ogury.ad.OguryInterstitialAdListener;
import com.ogury.ad.OguryReward;
import com.ogury.ad.OguryRewardedAd;
import com.ogury.ad.OguryRewardedAdListener;
import com.ogury.ad.interstitial.ui.InterstitialActivity;
import com.ogury.sdk.Ogury;
import java.util.HashMap;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ἰ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1036 extends AbstractC0557 {

    /* renamed from: סּ, reason: contains not printable characters */
    public static final String f3085 = StringFog.decrypt("id5fcwszzRSJz0JODCbEJ573QkkRIsYDiA==\n", "+rsrOmVHqGY=\n");

    /* renamed from: טּ, reason: contains not printable characters */
    public static final String f3084 = StringFog.decrypt("Wno//N14NB5Nei/v3EM8H116JcvK\n", "KR9LrrgPVWw=\n");

    /* renamed from: ﬤ, reason: contains not printable characters */
    public static final String f3083 = StringFog.decrypt("bmmLz7H7ZAJ0KIeF8PV/BGh0lZW36HgRYSiTiPDVfwRodJWVt+h4EWFHhZW36ngEdA==\n", "DQbm4d6cEXA=\n");

    /* renamed from: 爫, reason: contains not printable characters */
    public static final String f3082 = StringFog.decrypt("3SpcMv+S+UngLUk7zIL5SeItXC4=\n", "lEQoV43hjSA=\n");

    /* renamed from: 乁, reason: contains not printable characters */
    public static final String f3081 = StringFog.decrypt("GB0I5Ro=\n", "V3p9l2P4Oog=\n");

    /* renamed from: 丫, reason: contains not printable characters */
    public static final String f3080 = StringFog.decrypt("/uOZEn7qE6bU9p8UbtcUs93FiA==\n", "sYTsYAejfdI=\n");

    /* renamed from: ヶ, reason: contains not printable characters */
    public static final String f3079 = StringFog.decrypt("KtP218xIhZoAxvDR3HWCjwn15+nccp+LC9Hx\n", "ZbSDpbUB6+4=\n");

    /* renamed from: ヮ, reason: contains not printable characters */
    public static final String f3078 = StringFog.decrypt("gi6MUX6UnLWsO51GY4ed\n", "zUn5IwfG+cI=\n");

    /* renamed from: リ, reason: contains not printable characters */
    public static final String f3077 = StringFog.decrypt("H6p5NxtkwuQxv2ggBnfD3zm+eCAMU9U=\n", "UM0MRWI2p5M=\n");

    /* renamed from: ト, reason: contains not printable characters */
    public static final String f3076 = StringFog.decrypt("6Jvmfu6sbozGjvc=\n", "p/yTDJf+C/s=\n");

    public C1036(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0557
    /* renamed from: ﻛ */
    public final String mo5368() {
        try {
            return Ogury.getSdkVersion();
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0557
    /* renamed from: ﾇ */
    public final HashMap mo5369() {
        HashMap hashMap = new HashMap();
        hashMap.put(f3085, new C1053(this));
        hashMap.put(f3084, new C1037(this));
        return hashMap;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0557
    /* renamed from: ﾒ */
    public final Class mo5370(String str) {
        char c;
        switch (str.hashCode()) {
            case -1704786309:
                if (str.equals(f3082)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -734879533:
                if (str.equals(f3076)) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 76142724:
                if (str.equals(f3081)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 82913255:
                if (str.equals(f3079)) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 186993737:
                if (str.equals(f3077)) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 1169123445:
                if (str.equals(f3078)) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 1789379091:
                if (str.equals(f3080)) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1866202823:
                if (str.equals(f3083)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
            case 1:
                return InterstitialActivity.class;
            case 2:
                return Ogury.class;
            case 3:
                return OguryInterstitialAd.class;
            case 4:
                return OguryInterstitialAdListener.class;
            case 5:
                return OguryRewardedAd.class;
            case 6:
                return OguryRewardedAdListener.class;
            case 7:
                return OguryReward.class;
            default:
                return null;
        }
    }
}
