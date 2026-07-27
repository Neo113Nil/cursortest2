package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import com.monetization.ads.base.model.reward.RewardData;
import com.yandex.mobile.ads.banner.BannerAdEventListener;
import com.yandex.mobile.ads.banner.BannerAdView;
import com.yandex.mobile.ads.common.AdActivity;
import com.yandex.mobile.ads.common.AdInfo;
import com.yandex.mobile.ads.common.AdRequest;
import com.yandex.mobile.ads.common.AdType;
import com.yandex.mobile.ads.common.ImpressionData;
import com.yandex.mobile.ads.common.MobileAds;
import com.yandex.mobile.ads.common.VideoController;
import com.yandex.mobile.ads.common.VideoEventListener;
import com.yandex.mobile.ads.interstitial.InterstitialAd;
import com.yandex.mobile.ads.interstitial.InterstitialAdEventListener;
import com.yandex.mobile.ads.rewarded.Reward;
import com.yandex.mobile.ads.rewarded.RewardedAd;
import com.yandex.mobile.ads.rewarded.RewardedAdEventListener;
import com.yandex.mobile.ads.video.playback.VideoAdPlaybackListener;
import com.yandex.mobile.ads.video.playback.model.MediaFile;
import com.yandex.mobile.ads.video.playback.model.VideoAd;
import java.util.HashMap;

/* loaded from: classes6.dex */
public final class o0 extends AbstractC0557 {

    /* renamed from: סּ, reason: contains not printable characters */
    public static final String f242 = StringFog.decrypt("h9zCEExa5O6U8NI=\n", "4Lm2USgPioc=\n");

    /* renamed from: טּ, reason: contains not printable characters */
    public static final String f241 = StringFog.decrypt("h6nezFmg/raUrQ==\n", "4MyqnjjXutc=\n");

    /* renamed from: ﬤ, reason: contains not printable characters */
    public static final String f240 = StringFog.decrypt("vzmCOyWnZzeJKpMDOI9rK7g5mAg+\n", "zFz2bUzDAlg=\n");

    /* renamed from: 爫, reason: contains not printable characters */
    public static final String f239 = StringFog.decrypt("k5qfWUqRXpOGjJ95UItLmr2RjX8=\n", "9P/rECTiKvY=\n");

    /* renamed from: 乁, reason: contains not printable characters */
    public static final String f238 = StringFog.decrypt("d/ImNO5XKEF01j8J/k49\n", "EJdSZosgSTM=\n");

    /* renamed from: 丫, reason: contains not printable characters */
    public static final String f237 = StringFog.decrypt("xi1p9SZsMI3FHGTXJg==\n", "oUgdp0MbUf8=\n");

    /* renamed from: ヶ, reason: contains not printable characters */
    public static final String f236 = StringFog.decrypt("d5Yr9hbSc7h0ljvlF+x8rH8=\n", "EPNfpHOlEso=\n");

    /* renamed from: ヮ, reason: contains not printable characters */
    public static final String f235 = StringFog.decrypt("QYcrN51/8YtWhzsknE3mnFyWEwyLfPWXV5A=\n", "MuJfZfgIkPk=\n");

    /* renamed from: リ, reason: contains not printable characters */
    public static final String f234 = StringFog.decrypt("H0BVvlNV4BYfUUiDVEDpJQhgV5JTVckNH1FEmVhT\n", "bCUh9z0hhWQ=\n");

    /* renamed from: ト, reason: contains not printable characters */
    public static final String f233 = StringFog.decrypt("cJNIMgDG3pVRn1AaMNDb\n", "F/Y8f2Wit/Q=\n");

    /* renamed from: ゥ, reason: contains not printable characters */
    public static final String f232 = StringFog.decrypt("3aNetLry4TL7omeHt//lG9OqTw==\n", "usYq4tOWhF0=\n");

    /* renamed from: へ, reason: contains not printable characters */
    public static final String f231 = StringFog.decrypt("bDe3/0UWRbFKNorHSh0=\n", "C1LDqSxyIN4=\n");

    /* renamed from: っ, reason: contains not printable characters */
    public static final String f230 = StringFog.decrypt("zbsQatd7c+PMnwBtwHBz8vK3F1zTe3j0\n", "vt5kKLYVHYY=\n");

    /* renamed from: く, reason: contains not printable characters */
    public static final String f229 = StringFog.decrypt("Li8/dDIaHgUbMg==\n", "b0t+F0ZzaGw=\n");

    /* renamed from: Ↄ, reason: contains not printable characters */
    public static final String f228 = StringFog.decrypt("71RuMkmnXjrpQy1xX6RZMukVYnhD6FMx4VZsch6HVB/vT2pqWbJJ\n", "jDsDHDDGMF4=\n");

    /* renamed from: Ⅽ, reason: contains not printable characters */
    public static final String f227 = StringFog.decrypt("dpbZwhdb\n", "N/KQrHE0MXE=\n");

    /* renamed from: K, reason: contains not printable characters */
    public static final String f226 = StringFog.decrypt("9n/IX78gJQPD\n", "txuaOs5VQHA=\n");

    /* renamed from: Ύ, reason: contains not printable characters */
    public static final String f225 = StringFog.decrypt("wiH61Ojq\n", "g0WurZiPmnE=\n");

    /* renamed from: Ὺ, reason: contains not printable characters */
    public static final String f224 = StringFog.decrypt("eknl8l9hroxcStHhTnM=\n", "MySVgDoS3eU=\n");

    /* renamed from: Ῡ, reason: contains not printable characters */
    public static final String f223 = StringFog.decrypt("lTNL34OIoiOr\n", "2Fwptu/t40c=\n");

    /* renamed from: Ῠ, reason: contains not printable characters */
    public static final String f222 = StringFog.decrypt("5heo8VGjKNnEDKP4UoU1\n", "sH7MlD7gR7c=\n");

    /* renamed from: Ὑ, reason: contains not printable characters */
    public static final String f221 = StringFog.decrypt("vnKUa93ANmGGb7xnwfElao1p\n", "6BvwDrKFQAQ=\n");

    /* renamed from: Ṿ, reason: contains not printable characters */
    public static final String f220 = StringFog.decrypt("Uf/faQFHxUZW6NRpEHntUWf732IW\n", "E56xB2Q1hCI=\n");

    /* renamed from: Ḽ, reason: contains not printable characters */
    public static final String f219 = StringFog.decrypt("bkcZ9lL9gmp6TxLv\n", "LCZ3mDePww4=\n");

    /* renamed from: Ḹ, reason: contains not printable characters */
    public static final String f218 = StringFog.decrypt("+LV8m0dMd0D+oj/YUU9wSP70cNFNA3tF9bR0xxBveEr1v2P0WntwQew=\n", "m9oRtT4tGSQ=\n");

    /* renamed from: Ḟ, reason: contains not printable characters */
    public static final String f217 = StringFog.decrypt("WcqlZIK1coFkzbBtsaI=\n", "EKTRAfDGBug=\n");

    /* renamed from: ᵆ, reason: contains not printable characters */
    public static final String f216 = StringFog.decrypt("cEkVoWIJKVtNTgCoUR4YRFxJFYh5CSlXV0IT\n", "OSdhxBB6XTI=\n");

    /* renamed from: ᘥ, reason: contains not printable characters */
    public static final String f215 = StringFog.decrypt("6IarO6CW\n", "uuPcWtLyXjU=\n");

    /* renamed from: ᗀ, reason: contains not printable characters */
    public static final String f214 = StringFog.decrypt("T59Y6YQnTR9cng==\n", "HfoviPZDKHs=\n");

    /* renamed from: ᖺ, reason: contains not printable characters */
    public static final String f213 = StringFog.decrypt("SZYnmJZhaE5alxWPgWt5ZnKAJJyKYH8=\n", "G/NQ+eQFDSo=\n");

    /* renamed from: ᖸ, reason: contains not printable characters */
    public static final String f212 = StringFog.decrypt("90zb1SXWruHNRMbSK/Sh/chWy9Uk8rg=\n", "oSW/sEqXyrE=\n");

    /* renamed from: ᖭ, reason: contains not printable characters */
    public static final String f211 = StringFog.decrypt("GTe3TYIb7kgx\n", "VFLTJONdhyQ=\n");

    /* renamed from: ᖫ, reason: contains not printable characters */
    public static final String f210 = StringFog.decrypt("EETw2EXHAg==\n", "Ri2UvSqGZo4=\n");

    /* renamed from: ᖩ, reason: contains not printable characters */
    public static final String f209 = StringFog.decrypt("c9+sYBLYIDBV2w==\n", "IbrbAWC8ZFE=\n");

    public o0(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0557
    /* renamed from: ﻛ */
    public final String mo5368() {
        return MobileAds.getLibraryVersion();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0557
    /* renamed from: ﾇ */
    public final HashMap mo5369() {
        HashMap hashMap = new HashMap();
        hashMap.put(f242, new f0(this));
        hashMap.put(f241, new g0(this));
        hashMap.put(f240, new h0(this));
        hashMap.put(f239, new i0(this));
        hashMap.put(f238, new j0(this));
        hashMap.put(f237, new k0(this));
        hashMap.put(f236, new l0(this));
        hashMap.put(f235, new m0(this));
        hashMap.put(f234, new n0(this));
        hashMap.put(f233, new b0(this));
        hashMap.put(f232, new c0(this));
        hashMap.put(f231, new d0(this));
        hashMap.put(f230, new e0(this));
        return hashMap;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0557
    /* renamed from: ﾒ */
    public final Class mo5370(String str) {
        char c;
        switch (str.hashCode()) {
            case -1850459313:
                if (str.equals(f215)) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case -1836618638:
                if (str.equals(f229)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1666698098:
                if (str.equals(f223)) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -1401317165:
                if (str.equals(f221)) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case -1338246468:
                if (str.equals(f218)) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -1139615429:
                if (str.equals(f228)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1115843213:
                if (str.equals(f224)) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -650052115:
                if (str.equals(f212)) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case -610771047:
                if (str.equals(f209)) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case -609786639:
                if (str.equals(f214)) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case -572702516:
                if (str.equals(f226)) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -564429827:
                if (str.equals(f213)) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case -150968480:
                if (str.equals(f211)) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case 308060116:
                if (str.equals(f219)) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 320151695:
                if (str.equals(f217)) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 871099991:
                if (str.equals(f222)) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 957243679:
                if (str.equals(f220)) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 1228411167:
                if (str.equals(f216)) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 1955530641:
                if (str.equals(f227)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1955869213:
                if (str.equals(f225)) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 2117435870:
                if (str.equals(f210)) {
                    c = 19;
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
                return AdActivity.class;
            case 2:
                return AdInfo.class;
            case 3:
                return AdRequest.class;
            case 4:
                return AdType.class;
            case 5:
                return ImpressionData.class;
            case 6:
                return MobileAds.class;
            case 7:
            case '\b':
                return BannerAdView.class;
            case '\t':
                return VideoController.class;
            case '\n':
                return VideoEventListener.class;
            case 11:
                return BannerAdEventListener.class;
            case '\f':
                return InterstitialAd.class;
            case '\r':
                return InterstitialAdEventListener.class;
            case 14:
                return Reward.class;
            case 15:
                return RewardedAd.class;
            case 16:
                return RewardedAdEventListener.class;
            case 17:
                return VideoAdPlaybackListener.class;
            case 18:
                return MediaFile.class;
            case 19:
                return VideoAd.class;
            case 20:
                return RewardData.class;
            default:
                return null;
        }
    }
}
