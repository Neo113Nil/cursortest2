package com.ironsource.adqualitysdk.sdk.i;

import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdView;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.BuildConfig;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdListener;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdListener;
import com.facebook.ads.NativeAdView;
import com.facebook.ads.NativeBannerAd;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.RewardedVideoAdListener;
import com.facebook.ads.internal.DisplayAdController;
import com.facebook.ads.internal.adapters.AdAdapter;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import com.facebook.ads.internal.protocol.AdPlacementType;
import com.facebook.ads.internal.settings.AdSdkVersion;
import com.facebook.ads.internal.view.component.CircularProgressView;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.HashMap;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﾋ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1305 extends AbstractC0557 {

    /* renamed from: סּ, reason: contains not printable characters */
    public static final String f3763 = StringFog.decrypt("bMNRTLMT60hmw0tolhbOX2TLZHiJG+1a\n", "C6YlHN9yiC0=\n");

    /* renamed from: טּ, reason: contains not printable characters */
    public static final String f3762 = StringFog.decrypt("/6kh2VsiMi/1qTv9ficXOPehFO0=\n", "mMxViTdDUUo=\n");

    /* renamed from: ﬤ, reason: contains not printable characters */
    public static final String f3761 = StringFog.decrypt("85NtF54Nde30k3cziA==\n", "gPYZVvpBHJ4=\n");

    /* renamed from: 爫, reason: contains not printable characters */
    public static final String f3760 = StringFog.decrypt("RuXgwgKY67NP4/HNEoj1uVPr1eADlfS/VfnC6hKL1q9R5d/mDg==\n", "IYCUg3f8gtY=\n");

    /* renamed from: 乁, reason: contains not printable characters */
    public static final String f3759 = StringFog.decrypt("1GDGjkkZwaHdZteBWQnfq8Fu86xIFN6tx3z3oVg+ybbXSNO9VwjYj9Z8\n", "swWyzzx9qMQ=\n");

    /* renamed from: 丫, reason: contains not printable characters */
    public static final String f3758 = StringFog.decrypt("RknAeheKzzJGWN1HGJLrJHlFx0cckM8y\n", "NSy0M3n+qkA=\n");

    /* renamed from: ヶ, reason: contains not printable characters */
    public static final String f3757 = StringFog.decrypt("56G8IZ8VzAvpp4QKhx/IFA==\n", "gMTIZeZ7rWY=\n");

    /* renamed from: ヮ, reason: contains not printable characters */
    public static final String f3756 = StringFog.decrypt("vgPzVfpXAou0A+lxwk8Riw==\n", "2WaHBZY2Ye4=\n");

    /* renamed from: リ, reason: contains not printable characters */
    public static final String f3755 = StringFog.decrypt("MuAruxx/deof8zqzHn9gzAb3L7Ege1LAHPM+\n", "UZJO2mgaIag=\n");

    /* renamed from: ト, reason: contains not printable characters */
    public static final String f3754 = StringFog.decrypt("wgg=\n", "g2zleUhToTc=\n");

    /* renamed from: ゥ, reason: contains not printable characters */
    public static final String f3753 = StringFog.decrypt("+4r+FkQEQPnI\n", "uu6/ciV0NJw=\n");

    /* renamed from: へ, reason: contains not printable characters */
    public static final String f3752 = StringFog.decrypt("IBHIjPZBpg==\n", "YXWN/oQu1Gs=\n");

    /* renamed from: っ, reason: contains not printable characters */
    public static final String f3751 = StringFog.decrypt("qx6IpnF5ZFGPCA==\n", "6nrEzwINAT8=\n");

    /* renamed from: く, reason: contains not printable characters */
    public static final String f3750 = StringFog.decrypt("haPLwIEO\n", "xMedqeR5tyk=\n");

    /* renamed from: Ↄ, reason: contains not printable characters */
    public static final String f3749 = StringFog.decrypt("9/zSL0zITFX2/NBqBMhLQ7rS21dDzFg=\n", "lJO/ASqpLzA=\n");

    /* renamed from: Ⅽ, reason: contains not printable characters */
    public static final String f3748 = StringFog.decrypt("C7XhmDYgTqQvv8WgLjNO\n", "StGx9FdDK8k=\n");

    /* renamed from: K, reason: contains not printable characters */
    public static final String f3747 = StringFog.decrypt("QnE85z67QRRiWyD5JqhXOWp9PQ==\n", "BhhPl1LaOFU=\n");

    /* renamed from: Ύ, reason: contains not printable characters */
    public static final String f3746 = StringFog.decrypt("X0OHaZULZOVQU5d3nxdswX1CinaZEX4=\n", "HjbjAPBlB4A=\n");

    /* renamed from: Ὺ, reason: contains not printable characters */
    public static final String f3745 = StringFog.decrypt("gyilJKlqXMyCKKdh4Wpb2s4GvW6mblHKhQmtfrhkTcKhJLxjuWJL0A==\n", "4EfICs8LP6k=\n");

    /* renamed from: Ῡ, reason: contains not printable characters */
    public static final String f3744 = StringFog.decrypt("jJB36gwRNIuxl2LjPwYMi7aKZuEbEA==\n", "xf4Dj35iQOI=\n");

    /* renamed from: Ῠ, reason: contains not printable characters */
    public static final String f3743 = StringFog.decrypt("3YSabrCC0Njgg49ng5U=\n", "lOruC8LxpLE=\n");

    /* renamed from: Ὑ, reason: contains not printable characters */
    public static final String f3742 = StringFog.decrypt("/ONZ+6KEhzL470r/v6GGGsf1Wv++hZA=\n", "roYumtDg4lY=\n");

    /* renamed from: Ṿ, reason: contains not printable characters */
    public static final String f3741 = StringFog.decrypt("zk8rxB1Flq/KQzjAAGCX\n", "nCpcpW8h88s=\n");

    /* renamed from: Ḽ, reason: contains not printable characters */
    public static final String f3740 = StringFog.decrypt("EeRRiMgzXhY6/FuM1xxcOSHyTZA=\n", "VZ0/6aVaPVo=\n");

    /* renamed from: Ḹ, reason: contains not printable characters */
    public static final String f3739 = StringFog.decrypt("s3W3egYVLp6/dbB2\n", "/RTDE3Bwb/o=\n");

    /* renamed from: Ḟ, reason: contains not printable characters */
    public static final String f3738 = StringFog.decrypt("xnobw+or843mdQrY3So=\n", "iBtvqpxOsew=\n");

    /* renamed from: ᵆ, reason: contains not printable characters */
    public static final String f3737 = StringFog.decrypt("HEv3f/1T5NA=\n", "UiqDFos2pbQ=\n");

    /* renamed from: ᘥ, reason: contains not printable characters */
    public static final String f3736 = StringFog.decrypt("zypiegvctizXInNk\n", "gUsWE32590g=\n");

    /* renamed from: ᗀ, reason: contains not printable characters */
    public static final String f3735 = StringFog.decrypt("nhd3bgIK7TicH3BzEQHJLg==\n", "0HYDB3RvrFw=\n");

    /* renamed from: ᖺ, reason: contains not printable characters */
    public static final String f3734 = StringFog.decrypt("x1hTapkyjL7UQ05unjuev9JYRH4=\n", "hDEhCexe7cw=\n");

    /* renamed from: ᖸ, reason: contains not printable characters */
    public static final String f3733 = StringFog.decrypt("myMPJTyoaDaOBRYhKapWMrwJDCU4\n", "z2FBREjBHlM=\n");

    /* renamed from: ᖭ, reason: contains not printable characters */
    public static final String f3732 = StringFog.decrypt("Tgr2FkqfA2pjAfYWVak8ZGwE8hJU\n", "AmWVdybdcQU=\n");

    public C1305(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0557
    /* renamed from: ﻛ */
    public final String mo5368() {
        try {
            try {
                try {
                    return (String) C0391.m5393().f503.m5738(AdSdkVersion.class, String.class).get(null);
                } catch (Throwable unused) {
                    return null;
                }
            } catch (Throwable unused2) {
                return (String) C0391.m5393().f503.m5738(AdSdkVersion.class, String.class).get(null);
            }
        } catch (Throwable unused3) {
            C1174 c1174 = C0391.m5393().f502;
            String decrypt = StringFog.decrypt("Z+9aDm2VcbQSnRQ=\n", "ObM+VTHxX+k=\n");
            c1174.getClass();
            return C1174.m5899((Object) null, BuildConfig.class, decrypt);
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0557
    /* renamed from: ﾇ */
    public final HashMap mo5369() {
        HashMap hashMap = new HashMap();
        hashMap.put(f3763, new C0408(this));
        hashMap.put(f3762, new C0390(this));
        hashMap.put(f3761, new C0389(this));
        hashMap.put(f3760, new C0370(this));
        hashMap.put(f3759, new C0363(this));
        hashMap.put(f3758, new C0358(this));
        hashMap.put(f3757, new C0355(this));
        hashMap.put(f3756, new C1315(this));
        hashMap.put(f3755, new C1314(this));
        return hashMap;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0557
    /* renamed from: ﾒ */
    public final Class mo5370(String str) {
        char c;
        switch (str.hashCode()) {
            case -2107186802:
                if (str.equals(f3735)) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case -1585374524:
                if (str.equals(f3742)) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case -1513928064:
                if (str.equals(f3745)) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case -1256969519:
                if (str.equals(f3734)) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case -501313640:
                if (str.equals(f3740)) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case -498709917:
                if (str.equals(f3744)) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -105717264:
                if (str.equals(f3741)) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 2115:
                if (str.equals(f3754)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 289409084:
                if (str.equals(f3748)) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 320151695:
                if (str.equals(f3743)) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 435867927:
                if (str.equals(f3732)) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case 488344453:
                if (str.equals(f3752)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 535330969:
                if (str.equals(f3746)) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 553704929:
                if (str.equals(f3747)) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 1165508119:
                if (str.equals(f3751)) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1237162638:
                if (str.equals(f3733)) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case 1476063628:
                if (str.equals(f3753)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1838933446:
                if (str.equals(f3738)) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 1908493505:
                if (str.equals(f3749)) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 1955913096:
                if (str.equals(f3750)) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 2035065003:
                if (str.equals(f3739)) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 2035668095:
                if (str.equals(f3736)) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case 2110329530:
                if (str.equals(f3737)) {
                    c = 17;
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
                return Ad.class;
            case 1:
                return AdAdapter.class;
            case 2:
                return AdError.class;
            case 3:
                return AdListener.class;
            case 4:
            case 5:
                return AdView.class;
            case 6:
                return AdPlacementType.class;
            case 7:
                return DisplayAdController.class;
            case '\b':
                return InterstitialAdListener.class;
            case '\t':
                return InterstitialAd.class;
            case '\n':
                return RewardedVideoAdListener.class;
            case 11:
                return RewardedVideoAd.class;
            case '\f':
            case '\r':
                return AudienceNetworkActivity.class;
            case 14:
                return DynamicLoaderFactory.class;
            case 15:
                return NativeAdBase.class;
            case 16:
                return NativeBannerAd.class;
            case 17:
                return NativeAd.class;
            case 18:
                return NativeAdView.class;
            case 19:
                return NativeAdListener.class;
            case 20:
                return CircularProgressView.class;
            case 21:
                return C1309.class;
            case 22:
                int i = AbstractC0779.f2275;
                String decrypt = StringFog.decrypt("aNUYB9yhyzAn1xMW0qTNOmbaGBbSu9slaNUdEta6gStm1QgQ3byBBGbYHRnxusApbdgdBseFziZo\n3BkH\n", "Cbt8dbPIr0g=\n");
                String str2 = AbstractC0940.f2644;
                try {
                    return Class.forName(decrypt);
                } catch (Throwable unused) {
                    return null;
                }
            default:
                return null;
        }
    }
}
