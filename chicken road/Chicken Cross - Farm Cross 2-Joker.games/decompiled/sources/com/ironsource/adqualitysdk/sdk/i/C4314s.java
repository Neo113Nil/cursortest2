package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import com.vungle.ads.BannerAd;
import com.vungle.ads.BannerAdListener;
import com.vungle.ads.BannerAdSize;
import com.vungle.ads.BannerView;
import com.vungle.ads.BaseAd;
import com.vungle.ads.BaseAdListener;
import com.vungle.ads.BaseFullscreenAd;
import com.vungle.ads.BuildConfig;
import com.vungle.ads.FullscreenAd;
import com.vungle.ads.FullscreenAdListener;
import com.vungle.ads.InterstitialAd;
import com.vungle.ads.InterstitialAdListener;
import com.vungle.ads.RewardedAd;
import com.vungle.ads.RewardedAdListener;
import com.vungle.ads.VungleAds;
import com.vungle.ads.internal.AdInternal;
import com.vungle.ads.internal.model.AdAsset;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.model.AppNode;
import com.vungle.ads.internal.model.Placement;
import com.vungle.ads.internal.network.VungleApiClient;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import com.vungle.ads.internal.ui.AdActivity;
import com.vungle.ads.internal.ui.VungleActivity;
import com.vungle.ads.internal.ui.VungleWebClient;
import java.util.HashMap;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.s, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4314s extends AbstractC0557 {

    /* renamed from: סּ, reason: contains not printable characters */
    public static final String f280 = StringFog.decrypt("Kk82RWj7pMAfUg==\n", "ayt3JhyS0qk=\n");

    /* renamed from: טּ, reason: contains not printable characters */
    public static final String f279 = StringFog.decrypt("G+/GHm6t1joU5YVRfKuWNBb0zkJ2udRzDemFcXyZ2ykR9sJEYQ==\n", "eICrMBjYuF0=\n");

    /* renamed from: ﬤ, reason: contains not printable characters */
    public static final String f278 = StringFog.decrypt("s0u+/zGz2Q==\n", "8i//jELWrRA=\n");

    /* renamed from: 爫, reason: contains not printable characters */
    public static final String f277 = StringFog.decrypt("UwDgc1vbbNFzCA==\n", "EmSpHS++Hr8=\n");

    /* renamed from: 乁, reason: contains not printable characters */
    public static final String f276 = StringFog.decrypt("oS09RtXppyGE\n", "4EltJ6yFyEA=\n");

    /* renamed from: 丫, reason: contains not printable characters */
    public static final String f275 = StringFog.decrypt("GrnR9TQ05w==\n", "W8mhu1tQgqM=\n");

    /* renamed from: ヶ, reason: contains not printable characters */
    public static final String f274 = StringFog.decrypt("qm5RnFfv56s=\n", "6A8/8jKdps8=\n");

    /* renamed from: ヮ, reason: contains not printable characters */
    public static final String f273 = StringFog.decrypt("xtcCR1VSSyrI3x9dVU5vPA==\n", "hLZsKTAgCk4=\n");

    /* renamed from: リ, reason: contains not printable characters */
    public static final String f272 = StringFog.decrypt("vMMxxdTKiuatyyXO\n", "/qJfq7G4y4I=\n");

    /* renamed from: ト, reason: contains not printable characters */
    public static final String f271 = StringFog.decrypt("CSCgGg6p42AuNg==\n", "S0HOdGvbtQk=\n");

    /* renamed from: ゥ, reason: contains not printable characters */
    public static final String f270 = StringFog.decrypt("PrJF6oYf+lExuAallBm6dDyzRqGCPP1TKg==\n", "Xd0oxPBqlDY=\n");

    /* renamed from: へ, reason: contains not printable characters */
    public static final String f269 = StringFog.decrypt("wB0aEFOr\n", "gnxpdRLP10Q=\n");

    /* renamed from: っ, reason: contains not printable characters */
    public static final String f268 = StringFog.decrypt("o4G0tRTjpEOSlKK+MPU=\n", "4eDH0FWH6Co=\n");

    /* renamed from: く, reason: contains not printable characters */
    public static final String f267 = StringFog.decrypt("uLlZYxdwJSGJu1hjNGsIKQ==\n", "+tgqBlEFSU0=\n");

    /* renamed from: Ↄ, reason: contains not printable characters */
    public static final String f266 = StringFog.decrypt("v7fpcHcjjQSZhO9ofiOMDZGz5Gw=\n", "/NaKGBJC72g=\n");

    /* renamed from: Ⅽ, reason: contains not printable characters */
    public static final String f265 = StringFog.decrypt("wlsk1OJOKtzhQAnc\n", "hC5IuJEtWLk=\n");

    /* renamed from: K, reason: contains not printable characters */
    public static final String f264 = StringFog.decrypt("9QWWcI6/rIXWHrt4sbWtlNYen24=\n", "s3D6HP3c3uA=\n");

    /* renamed from: Ύ, reason: contains not printable characters */
    public static final String f263 = StringFog.decrypt("V0CjxLnoSWJqR7bNiv8=\n", "Hi7XocubPQs=\n");

    /* renamed from: Ὺ, reason: contains not printable characters */
    public static final String f262 = StringFog.decrypt("w3iaNnCKilj+f48/Q52yWPliiz1niw==\n", "ihbuUwL5/jE=\n");

    /* renamed from: Ῡ, reason: contains not printable characters */
    public static final String f261 = StringFog.decrypt("GEzaNNQxAPMme/UJ9RM=\n", "VR6bfZBhcpY=\n");

    /* renamed from: Ῠ, reason: contains not printable characters */
    public static final String f260 = StringFog.decrypt("wZQTHUaW8Dfl\n", "kfhyfiP7lVk=\n");

    /* renamed from: Ὑ, reason: contains not printable characters */
    public static final String f259 = StringFog.decrypt("ynTVBfw/tGvZdQ==\n", "mBGiZI5b0Q8=\n");

    /* renamed from: Ṿ, reason: contains not printable characters */
    public static final String f258 = StringFog.decrypt("XTK7tEIOGxNOM4C8Qx4bGWol\n", "D1fM1TBqfnc=\n");

    /* renamed from: Ḽ, reason: contains not printable characters */
    public static final String f257 = StringFog.decrypt("J3/vljV3HLcFY/eYLWs=\n", "cQqB8VkSXdQ=\n");

    /* renamed from: Ḹ, reason: contains not printable characters */
    public static final String f256 = StringFog.decrypt("O3Sthbcnniw0fu7KpSHeIjZvpdmvM5xlLXLu/bQ8lyc9WqPfqCSZPyE=\n", "WBvAq8FS8Es=\n");

    /* renamed from: Ḟ, reason: contains not printable characters */
    public static final String f255 = StringFog.decrypt("V5mHuBXJGVhy\n", "Aezp33msWDw=\n");

    /* renamed from: ᵆ, reason: contains not printable characters */
    public static final String f254 = StringFog.decrypt("PaJ1BvhEfOIClHcI8U9J\n", "a9cbYZQhPZI=\n");

    /* renamed from: ᘥ, reason: contains not printable characters */
    public static final String f253 = StringFog.decrypt("gl+Idpp1NOy2aYp4k34X\n", "1CrmEfYQY4k=\n");

    /* renamed from: ᗀ, reason: contains not printable characters */
    public static final String f252 = StringFog.decrypt("G8Rqig9l+8cI\n", "fKEey2swla4=\n");

    /* renamed from: ᖺ, reason: contains not printable characters */
    public static final String f251 = StringFog.decrypt("Dpwa0QAKki4=\n", "aflukHB620o=\n");

    /* renamed from: ᖸ, reason: contains not printable characters */
    public static final String f250 = StringFog.decrypt("iZJaxUPZuAuPlULjcN+gAo+US+tH1KQ7nJs=\n", "7vcuhiK60G4=\n");

    /* renamed from: ᖭ, reason: contains not printable characters */
    public static final String f249 = StringFog.decrypt("IMkMBGsKSMUuyxY=\n", "R6x4RwpnOKQ=\n");

    /* renamed from: ᖫ, reason: contains not printable characters */
    public static final String f248 = StringFog.decrypt("wx1XpPyBOLLJHU2A2YQ=\n", "pHgj9JDgW9c=\n");

    /* renamed from: ᖩ, reason: contains not printable characters */
    public static final String f247 = StringFog.decrypt("ebelXCYox7Z/prRbJjHDs3C1og==\n", "HtLRCENFt9o=\n");

    /* renamed from: ᖅ, reason: contains not printable characters */
    public static final String f246 = StringFog.decrypt("cdd+Sl/C08N9wHpGTMbO\n", "GKQsLyijoac=\n");

    public C4314s(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0557
    /* renamed from: ﻛ */
    public final String mo5368() {
        try {
            return mo5371().split(StringFog.decrypt("OA==\n", "FVwlOxh4QVo=\n"))[0];
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0557
    /* renamed from: ﾇ */
    public final HashMap mo5369() {
        HashMap hashMap = new HashMap();
        hashMap.put(f252, new C4308l(this));
        hashMap.put(f251, new C4309m(this));
        hashMap.put(f250, new C4310n(this));
        hashMap.put(f249, new C4311o(this));
        hashMap.put(f248, new C4312p(this));
        hashMap.put(f247, new C4313q(this));
        hashMap.put(f246, new r(this));
        return hashMap;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0557
    /* renamed from: ﾒ */
    public final String mo5371() {
        try {
            C1174 c1174 = C0391.m5393().f502;
            String decrypt = StringFog.decrypt("OSPefC8catlMI94JWVw=\n", "Z3+6J3N4RIQ=\n");
            c1174.getClass();
            return C1174.m5899((Object) null, BuildConfig.class, decrypt);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0557
    /* renamed from: ﾒ */
    public final Class mo5370(String str) {
        char c;
        switch (str.hashCode()) {
            case -1836618638:
                if (str.equals(f280)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1791176561:
                if (str.equals(f274)) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -1560947009:
                if (str.equals(f270)) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case -1494265129:
                if (str.equals(f256)) {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            case -1435839138:
                if (str.equals(f265)) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case -1179107681:
                if (str.equals(f255)) {
                    c = 25;
                    break;
                }
                c = 65535;
                break;
            case -609786639:
                if (str.equals(f259)) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case -498709917:
                if (str.equals(f262)) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case -498060603:
                if (str.equals(f260)) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case -486531311:
                if (str.equals(f261)) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case -393802555:
                if (str.equals(f258)) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case -43797322:
                if (str.equals(f266)) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case 307971376:
                if (str.equals(f272)) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 320151695:
                if (str.equals(f263)) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 324239304:
                if (str.equals(f268)) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 389759008:
                if (str.equals(f277)) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 484680813:
                if (str.equals(f278)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 870529955:
                if (str.equals(f275)) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 961844241:
                if (str.equals(f271)) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 989853769:
                if (str.equals(f279)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1205766784:
                if (str.equals(f257)) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case 1208038126:
                if (str.equals(f253)) {
                    c = 27;
                    break;
                }
                c = 65535;
                break;
            case 1442693170:
                if (str.equals(f264)) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 1505622627:
                if (str.equals(f273)) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 1839869899:
                if (str.equals(f276)) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1853648591:
                if (str.equals(f267)) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 1930966324:
                if (str.equals(f254)) {
                    c = 26;
                    break;
                }
                c = 65535;
                break;
            case 1982630644:
                if (str.equals(f269)) {
                    c = 11;
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
                return AdAsset.class;
            case 3:
                return AdInternal.class;
            case 4:
                return AdPayload.class;
            case 5:
                return AppNode.class;
            case 6:
                return BannerAd.class;
            case 7:
                return BannerAdListener.class;
            case '\b':
                return BannerAdSize.class;
            case '\t':
            case '\n':
                return BannerView.class;
            case 11:
                return BaseAd.class;
            case '\f':
                return BaseAdListener.class;
            case '\r':
                return BaseFullscreenAd.class;
            case 14:
                return AdPayload.CacheableReplacement.class;
            case 15:
                return FullscreenAd.class;
            case 16:
                return FullscreenAdListener.class;
            case 17:
                return InterstitialAd.class;
            case 18:
                return InterstitialAdListener.class;
            case 19:
                return MRAIDPresenter.class;
            case 20:
                return Placement.class;
            case 21:
                return RewardedAd.class;
            case 22:
                return RewardedAdListener.class;
            case 23:
            case 24:
                return VungleActivity.class;
            case 25:
                return VungleAds.class;
            case 26:
                return VungleApiClient.class;
            case 27:
                return VungleWebClient.class;
            default:
                return null;
        }
    }
}
