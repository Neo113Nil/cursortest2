package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import com.ogury.sdk.Ogury;
import io.presage.Presage;
import io.presage.common.AdConfig;
import io.presage.common.PresageSdk;
import io.presage.common.network.models.RewardItem;
import io.presage.interstitial.InterstitialActivity;
import io.presage.interstitial.PresageInterstitial;
import io.presage.interstitial.PresageInterstitialCallback;
import io.presage.interstitial.optinvideo.PresageOptinVideo;
import io.presage.interstitial.optinvideo.PresageOptinVideoCallback;
import java.util.HashMap;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ῑ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1057 extends AbstractC0557 {

    /* renamed from: סּ, reason: contains not printable characters */
    public static final String f3154 = StringFog.decrypt("dWo1KmXjWkJ1aggUZPJITXFq\n", "Eg9BeheGKSM=\n");

    /* renamed from: טּ, reason: contains not printable characters */
    public static final String f3153 = StringFog.decrypt("XO+DS1fWXuBc/p52UMNX0U7mm2BYwVA=\n", "L4r3AjmiO5I=\n");

    /* renamed from: ﬤ, reason: contains not printable characters */
    public static final String f3152 = StringFog.decrypt("dpSyebOOjORTmKJTrLmE5mmTp1Wo\n", "BfHGNsP65Yo=\n");

    /* renamed from: 爫, reason: contains not printable characters */
    public static final String f3151 = StringFog.decrypt("Vkk0sJPlqEVYQzSpj/S+VkxSc7SI4bcKdkhupZPzr01LT3usoOOvTUlPbrk=\n", "PyYawOGA2yQ=\n");

    /* renamed from: 乁, reason: contains not printable characters */
    public static final String f3150 = StringFog.decrypt("3u31mEwoV3jj6uCRfzhXeOHq9YQ=\n", "l4OB/T5bIxE=\n");

    /* renamed from: 丫, reason: contains not printable characters */
    public static final String f3149 = StringFog.decrypt("chMpHe59OWl8GSkE8mwvemgIbhn1eSYmbhUpJPJsL3poCG4Z9XkmSXgIbhv1bDM=\n", "G3wHbZwYSgg=\n");

    /* renamed from: ヶ, reason: contains not printable characters */
    public static final String f3148 = StringFog.decrypt("SNuI3JWDE/Rp27XbgIog5Gnbt9uVnw==\n", "HbLBsuHmYYc=\n");

    /* renamed from: ヮ, reason: contains not printable characters */
    public static final String f3147 = StringFog.decrypt("Q87FRMs=\n", "DKmwNrIqsU4=\n");

    /* renamed from: リ, reason: contains not printable characters */
    public static final String f3146 = StringFog.decrypt("7Eb/mhovEg==\n", "vDSa6XtIdwc=\n");

    /* renamed from: ト, reason: contains not printable characters */
    public static final String f3145 = StringFog.decrypt("wFYaGBf0Vrf0Tw==\n", "kCR/a3aTM+Q=\n");

    /* renamed from: ゥ, reason: contains not printable characters */
    public static final String f3144 = StringFog.decrypt("bWYMwigGVwRTYAzDOhVbOVR1BQ==\n", "PRRpsUlhMk0=\n");

    /* renamed from: へ, reason: contains not printable characters */
    public static final String f3143 = StringFog.decrypt("sdVwmFC29syP03CZQqX68YjGeahQvf/ngMR+\n", "4acV6zHRk4U=\n");

    /* renamed from: っ, reason: contains not printable characters */
    public static final String f3142 = StringFog.decrypt("lZi4cTxpNhC1nrRsC2c3Oqo=\n", "xerdAl0OU18=\n");

    /* renamed from: く, reason: contains not printable characters */
    public static final String f3141 = StringFog.decrypt("N/VTlwdcrMgX81+KMFKt4gjEV4gKWajkDA==\n", "Z4c25GY7yYc=\n");

    /* renamed from: Ↄ, reason: contains not printable characters */
    public static final String f3140 = StringFog.decrypt("hGBEoG2AFqqzaA==\n", "1gUzwR/kX94=\n");

    /* renamed from: Ⅽ, reason: contains not printable characters */
    public static final String f3139 = StringFog.decrypt("n5hMyZr5rc4=\n", "3vwPpvSfxKk=\n");

    public C1057(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0557
    /* renamed from: ﻛ */
    public final String mo5368() {
        String mo5371 = mo5371();
        if (mo5371 != null) {
            return mo5371.split(StringFog.decrypt("LQ==\n", "AJ6/XpzDc/g=\n"))[0];
        }
        return null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0557
    /* renamed from: ﾇ */
    public final HashMap mo5369() {
        HashMap hashMap = new HashMap();
        hashMap.put(f3154, new C1072(this));
        hashMap.put(f3153, new C1071(this));
        hashMap.put(f3152, new C1070(this));
        return hashMap;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0557
    /* renamed from: ﾒ */
    public final Class mo5370(String str) {
        char c;
        switch (str.hashCode()) {
            case -2101347995:
                if (str.equals(f3139)) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case -1907784110:
                if (str.equals(f3142)) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case -1704786309:
                if (str.equals(f3150)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -938422005:
                if (str.equals(f3145)) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -610604286:
                if (str.equals(f3140)) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case -126768170:
                if (str.equals(f3151)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 76142724:
                if (str.equals(f3147)) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 698887547:
                if (str.equals(f3144)) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 1067648736:
                if (str.equals(f3143)) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 1346371759:
                if (str.equals(f3146)) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 1871097647:
                if (str.equals(f3148)) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 2109755994:
                if (str.equals(f3149)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 2128976055:
                if (str.equals(f3141)) {
                    c = '\n';
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
            case 3:
                return io.presage.interstitial.ui.InterstitialActivity.class;
            case 4:
                return Ogury.class;
            case 5:
                return Presage.class;
            case 6:
                return PresageSdk.class;
            case 7:
                return PresageInterstitial.class;
            case '\b':
                return PresageInterstitialCallback.class;
            case '\t':
                return PresageOptinVideo.class;
            case '\n':
                return PresageOptinVideoCallback.class;
            case 11:
                return RewardItem.class;
            case '\f':
                return AdConfig.class;
            default:
                return null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0557
    /* renamed from: ﾒ */
    public final String mo5371() {
        try {
            try {
                return (String) Class.forName(StringFog.decrypt("7wJ5o7R+XHDhCHmwqXZCfuhDPrXoTU5y7ggluqh/WnnnGCOXqW5NYssCOaeiVF0=\n", "hm1X08YbLxE=\n")).getMethod(StringFog.decrypt("YQ==\n", "AIkgpfWRLnE=\n"), null).invoke(null, null);
            } catch (Exception unused) {
                return PresageSdk.getAdsSdkVersion();
            }
        } catch (Throwable unused2) {
            return null;
        }
    }
}
