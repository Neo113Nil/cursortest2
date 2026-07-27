package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import com.qq.e.ads.ADActivity;
import com.qq.e.ads.DialogActivity;
import com.qq.e.ads.LandscapeADActivity;
import com.qq.e.ads.LiteAbstractAD;
import com.qq.e.ads.PortraitADActivity;
import com.qq.e.ads.RewardvideoLandscapeADActivity;
import com.qq.e.ads.RewardvideoPortraitADActivity;
import com.qq.e.ads.banner2.UnifiedBannerADListener;
import com.qq.e.ads.banner2.UnifiedBannerView;
import com.qq.e.ads.interstitial2.UnifiedInterstitialAD;
import com.qq.e.ads.interstitial2.UnifiedInterstitialADListener;
import com.qq.e.ads.rewardvideo.RewardVideoAD;
import com.qq.e.ads.rewardvideo.RewardVideoADListener;
import com.qq.e.comm.adevent.ADEvent;
import com.qq.e.comm.adevent.ADListener;
import com.qq.e.comm.constants.LoadAdParams;
import com.qq.e.comm.managers.GDTAdSdk;
import com.qq.e.comm.managers.status.APPStatus;
import com.qq.e.comm.managers.status.SDKStatus;
import com.qq.e.comm.pi.ACTD;
import java.util.HashMap;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᒽ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0804 extends AbstractC0557 {

    /* renamed from: סּ, reason: contains not printable characters */
    public static final String f2350 = StringFog.decrypt("rfD1H/jqMAQ=\n", "6rShXpy5VG8=\n");

    /* renamed from: טּ, reason: contains not printable characters */
    public static final String f2349 = StringFog.decrypt("GXUt5YnTv2IsSA==\n", "WDFshv26yQs=\n");

    /* renamed from: ﬤ, reason: contains not printable characters */
    public static final String f2348 = StringFog.decrypt("muaRK+k75kzX6Jh2tguMaJr9lXPxPrE=\n", "+Yn8BZhKyCk=\n");

    /* renamed from: 爫, reason: contains not printable characters */
    public static final String f2347 = StringFog.decrypt("CDp1sq9PPwE4OmK3tFE=\n", "TFMU3sAofmI=\n");

    /* renamed from: 乁, reason: contains not printable characters */
    public static final String f2346 = StringFog.decrypt("JzvOfgDgdSpqNccjX9UyLig7xBES5TI5LSDa\n", "RFSjUHGRW08=\n");

    /* renamed from: 丫, reason: contains not printable characters */
    public static final String f2345 = StringFog.decrypt("hRYH3UmUVCqsNi34WYNcLKADEA==\n", "yXdpuTr3NVo=\n");

    /* renamed from: ヶ, reason: contains not printable characters */
    public static final String f2344 = StringFog.decrypt("ZajMSLPx+fgopsUV7My282K0wgey5ZbZR6TVD7Tpo+Q=\n", "BsehZsKA150=\n");

    /* renamed from: ヮ, reason: contains not printable characters */
    public static final String f2343 = StringFog.decrypt("5PCBFjhJ2W/127IBPkHGcsDm\n", "tJ/zYkoosBs=\n");

    /* renamed from: リ, reason: contains not printable characters */
    public static final String f2342 = StringFog.decrypt("nm8VoUcgG+3TYRz8GAFa+olyGeZCEHHJnnQR+V8lTA==\n", "/QB4jzZRNYg=\n");

    /* renamed from: ト, reason: contains not printable characters */
    public static final String f2341 = StringFog.decrypt("ABOhHVHNxjc2E7kwQsfULTEXphli7fE9Jh+gFVfQ\n", "UnbWfCOpsF4=\n");

    /* renamed from: ゥ, reason: contains not printable characters */
    public static final String f2340 = StringFog.decrypt("GplhwqXLPLhXl2if+uh3qhiEaJq93neyNZdiiKfZc60ct0itt857qxCCdQ==\n", "efYM7NS6Et0=\n");

    /* renamed from: へ, reason: contains not printable characters */
    public static final String f2339 = StringFog.decrypt("FtCu7iKyMbYg0LbfP6QzrSXcrc4UlySrLcOw+yk=\n", "RLXZj1DWR98=\n");

    /* renamed from: っ, reason: contains not printable characters */
    public static final String f2338 = StringFog.decrypt("DSI32gUx/FlALD6HWhK3Sw8/PoIdJLdTPiIogAYhu0gvCRuXACmkVRo0\n", "bk1a9HRA0jw=\n");

    /* renamed from: く, reason: contains not printable characters */
    public static final String f2337 = StringFog.decrypt("prvajA5bwUWdodaYFErMeJq036sj\n", "89Wz6mc+pQw=\n");

    /* renamed from: Ↄ, reason: contains not printable characters */
    public static final String f2336 = StringFog.decrypt("sH/2GVOLHzWLZfoNSZoSCIxw8z5+ohIPkXTxGkg=\n", "5RGffzrue3w=\n");

    /* renamed from: Ⅽ, reason: contains not printable characters */
    public static final String f2335 = StringFog.decrypt("VhuEKFewAXtgG5wIYQ==\n", "BH7zSSXUVxI=\n");

    /* renamed from: K, reason: contains not printable characters */
    public static final String f2334 = StringFog.decrypt("FmRzKEX0yjAyUn4lV/DbOyU=\n", "VyA/QTaAr14=\n");

    /* renamed from: Ύ, reason: contains not printable characters */
    public static final String f2333 = StringFog.decrypt("83wS8frQpdvFfArRzPiawdV8C/X6\n", "oRllkIi087I=\n");

    /* renamed from: Ὺ, reason: contains not printable characters */
    public static final String f2332 = StringFog.decrypt("6BekCqg1xwTWGagd\n", "pHjFbulRl2U=\n");

    /* renamed from: Ῡ, reason: contains not printable characters */
    public static final String f2331 = StringFog.decrypt("eBqjHF2d4AtMGqQfRq7tLFo=\n", "LXTKejT4hEk=\n");

    /* renamed from: Ῠ, reason: contains not printable characters */
    public static final String f2330 = StringFog.decrypt("MttFc5WoItQG20JwjowC2g7GWHCSqDQ=\n", "Z7UsFfzNRpY=\n");

    /* renamed from: Ὑ, reason: contains not printable characters */
    public static final String f2329 = StringFog.decrypt("K+e7No/oyw==\n", "aqP+QOqGv40=\n");

    /* renamed from: Ṿ, reason: contains not printable characters */
    public static final String f2328 = StringFog.decrypt("K3WY1F6pIiIZ\n", "aiXIhyrIVlc=\n");

    /* renamed from: Ḽ, reason: contains not printable characters */
    public static final String f2327 = StringFog.decrypt("k2eX8w==\n", "0iTDtyrfHZ4=\n");

    /* renamed from: Ḹ, reason: contains not printable characters */
    public static final String f2326 = StringFog.decrypt("kgu9GAFrxqmsA6oJAU0=\n", "3mLJfUAJtd0=\n");

    /* renamed from: Ḟ, reason: contains not printable characters */
    public static final String f2325 = StringFog.decrypt("DBVuY4yWBKQoIw==\n", "TVEiCv/iYco=\n");

    /* renamed from: ᵆ, reason: contains not printable characters */
    public static final String f2324 = StringFog.decrypt("ySPbL3zOmJ/jJ8EPXeg=\n", "rkavaDia2fs=\n");

    /* renamed from: ᘥ, reason: contains not printable characters */
    public static final String f2323 = StringFog.decrypt("6SZCXTk98wk=\n", "jkM2HElNum0=\n");

    /* renamed from: ᗀ, reason: contains not printable characters */
    public static final String f2322 = StringFog.decrypt("6f5CIQoOKODH9VAL\n", "jps2ZHJ6WoE=\n");

    /* renamed from: ᖺ, reason: contains not printable characters */
    public static final String f2321 = StringFog.decrypt("yIcx1nTIYYXLoyHQaM9l\n", "r+JFhBG/APc=\n");

    /* renamed from: ᖸ, reason: contains not printable characters */
    public static final String f2320 = StringFog.decrypt("q+WVD9ZdTfeo5YUYy15f\n", "zIDhXbMqLIU=\n");

    /* renamed from: ᖭ, reason: contains not printable characters */
    public static final String f2319 = StringFog.decrypt("2+H2zFLr4wPP8OvxVf7qNMTw\n", "vISChTyfhnE=\n");

    public C0804(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0557
    /* renamed from: ﻛ */
    public final String mo5368() {
        return SDKStatus.getIntegrationSDKVersion();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0557
    /* renamed from: ﾇ */
    public final HashMap mo5369() {
        HashMap hashMap = new HashMap();
        hashMap.put(f2324, new C0954(this));
        hashMap.put(f2323, new C0946(this));
        hashMap.put(f2322, new C0944(this));
        hashMap.put(f2321, new C0897(this));
        hashMap.put(f2320, new C0846(this));
        hashMap.put(f2319, new C0845(this));
        return hashMap;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0557
    /* renamed from: ﾒ */
    public final Class mo5370(String str) {
        char c;
        switch (str.hashCode()) {
            case -1950656211:
                if (str.equals(f2345)) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -1537668511:
                if (str.equals(f2337)) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case -1192770783:
                if (str.equals(f2341)) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case -1125491209:
                if (str.equals(f2325)) {
                    c = 25;
                    break;
                }
                c = 65535;
                break;
            case -1040623465:
                if (str.equals(f2347)) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -839956733:
                if (str.equals(f2331)) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case -570955421:
                if (str.equals(f2333)) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case -427681737:
                if (str.equals(f2329)) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case -358530385:
                if (str.equals(f2332)) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case -311779863:
                if (str.equals(f2340)) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case -301299368:
                if (str.equals(f2334)) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case -287046183:
                if (str.equals(f2339)) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case -207731435:
                if (str.equals(f2342)) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 2003474:
                if (str.equals(f2327)) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case 167349330:
                if (str.equals(f2349)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 555831221:
                if (str.equals(f2330)) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 796884557:
                if (str.equals(f2343)) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 814717722:
                if (str.equals(f2348)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 937653587:
                if (str.equals(f2328)) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case 1265986405:
                if (str.equals(f2344)) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 1305853839:
                if (str.equals(f2335)) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 1336889139:
                if (str.equals(f2326)) {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            case 1773421109:
                if (str.equals(f2336)) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case 1874129984:
                if (str.equals(f2350)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 1958130193:
                if (str.equals(f2338)) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 2111488863:
                if (str.equals(f2346)) {
                    c = 4;
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
                return GDTAdSdk.class;
            case 1:
            case 2:
                return ADActivity.class;
            case 3:
            case 4:
                return DialogActivity.class;
            case 5:
            case 6:
                return LandscapeADActivity.class;
            case 7:
            case '\b':
                return PortraitADActivity.class;
            case '\t':
            case '\n':
                return RewardvideoLandscapeADActivity.class;
            case 11:
            case '\f':
                return RewardvideoPortraitADActivity.class;
            case '\r':
                return UnifiedInterstitialAD.class;
            case 14:
                return UnifiedInterstitialADListener.class;
            case 15:
                return RewardVideoAD.class;
            case 16:
                return RewardVideoADListener.class;
            case 17:
                return LoadAdParams.class;
            case 18:
                return UnifiedBannerView.class;
            case 19:
                return UnifiedBannerADListener.class;
            case 20:
                return ADEvent.class;
            case 21:
                return APPStatus.class;
            case 22:
                return RewardVideoAD.ADListenerAdapter.class;
            case 23:
                return ACTD.class;
            case 24:
                return LiteAbstractAD.class;
            case 25:
                return ADListener.class;
            default:
                return null;
        }
    }
}
