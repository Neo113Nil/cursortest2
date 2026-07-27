package com.ironsource.adqualitysdk.sdk.i;

import com.amazon.device.ads.DTBAdView;
import com.ironsource.C4761z5;
import com.ironsource.adqualitysdk.sdk.StringFog;
import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.IronSourceBannerLayout;
import com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData;
import com.ironsource.mediationsdk.ads.nativead.LevelPlayMediaView;
import com.ironsource.mediationsdk.ads.nativead.LevelPlayNativeAd;
import com.ironsource.mediationsdk.ads.nativead.LevelPlayNativeAdListener;
import com.ironsource.mediationsdk.ads.nativead.NativeAdLayout;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdInteractionListener;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdInterface;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdLoadListener;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface;
import com.ironsource.mediationsdk.ads.nativead.internal.InternalNativeAdListener;
import com.ironsource.mediationsdk.ads.nativead.internal.NativeAdViewHolder;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import com.ironsource.mediationsdk.sdk.LevelPlayBannerListener;
import com.ironsource.mediationsdk.sdk.LevelPlayInterstitialListener;
import com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoAutomaticListener;
import com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoListener;
import com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoManualListener;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.sdk.controller.ControllerActivity;
import com.ironsource.sdk.controller.InterstitialActivity;
import com.ironsource.sdk.controller.OpenUrlActivity;
import com.unity3d.ironsourceads.IronSourceAds;
import com.unity3d.ironsourceads.banner.BannerAdInfo;
import com.unity3d.ironsourceads.banner.BannerAdRequest;
import com.unity3d.ironsourceads.banner.BannerAdView;
import com.unity3d.ironsourceads.banner.BannerAdViewListener;
import com.unity3d.ironsourceads.interstitial.InterstitialAd;
import com.unity3d.ironsourceads.interstitial.InterstitialAdInfo;
import com.unity3d.ironsourceads.interstitial.InterstitialAdListener;
import com.unity3d.ironsourceads.interstitial.InterstitialAdRequest;
import com.unity3d.ironsourceads.rewarded.RewardedAd;
import com.unity3d.ironsourceads.rewarded.RewardedAdInfo;
import com.unity3d.ironsourceads.rewarded.RewardedAdListener;
import com.unity3d.ironsourceads.rewarded.RewardedAdRequest;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.banner.LevelPlayBannerAdView;
import com.unity3d.mediation.banner.LevelPlayBannerAdViewListener;
import com.unity3d.mediation.impression.LevelPlayImpressionData;
import com.unity3d.mediation.impression.LevelPlayImpressionDataListener;
import com.unity3d.mediation.interstitial.LevelPlayInterstitialAd;
import com.unity3d.mediation.interstitial.LevelPlayInterstitialAdListener;
import com.unity3d.mediation.rewarded.LevelPlayReward;
import com.unity3d.mediation.rewarded.LevelPlayRewardedAd;
import com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener;
import io.ktor.util.date.GMTDateParser;
import java.util.HashMap;
import kotlin.text.Typography;
import kotlinx.io.files.FileSystemKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.แ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0713 extends AbstractC0557 {

    /* renamed from: סּ, reason: contains not printable characters */
    public static final String f1982 = StringFog.decrypt("RSqC22vS2jlPKpj/SdLUOQ==\n", "Ik/2iwezuVw=\n");

    /* renamed from: טּ, reason: contains not printable characters */
    public static final String f1981 = StringFog.decrypt("lOUsKTCs35yBzDkSPrfFqZ/hOw48p9+NveE1Dg==\n", "84BYa1HCsfk=\n");

    /* renamed from: ﬤ, reason: contains not printable characters */
    public static final String f1980 = StringFog.decrypt("EgfTMiR4WvMGEc4UJ0xJ4hQo1BQn\n", "dWKne0kIKJY=\n");

    /* renamed from: 爫, reason: contains not printable characters */
    public static final String f1979 = StringFog.decrypt("h0aKXcbDjs2VUYd7xfed3Iduh2ff1pLNlA==\n", "5iLuFKuz/Kg=\n");

    /* renamed from: 乁, reason: contains not printable characters */
    public static final String f1978 = StringFog.decrypt("yhdfmHkL2jbIAFeEfAf8NfwTRpZDB+Av3RxXhQ==\n", "uHIy9w9uk1s=\n");

    /* renamed from: 丫, reason: contains not printable characters */
    public static final String f1977 = StringFog.decrypt("uoSN5gapVFqsoJ3kDq5JSaeEiw==\n", "yeH5qGfdPSw=\n");

    /* renamed from: ヶ, reason: contains not printable characters */
    public static final String f1976 = StringFog.decrypt("saBL0rQLiuikgV71sA==\n", "1sU/gdF5/I0=\n");

    /* renamed from: ヮ, reason: contains not printable characters */
    public static final String f1975 = StringFog.decrypt("rtFo4Yy1XBau13rlirFN\n", "77Mblf7UP2I=\n");

    /* renamed from: リ, reason: contains not printable characters */
    public static final String f1974 = StringFog.decrypt("v11ZSVAriuSb\n", "7zE4KjVG74o=\n");

    /* renamed from: ト, reason: contains not printable characters */
    public static final String f1973 = StringFog.decrypt("rJu3+sen43OKhpjtwaH5dpuN\n", "7/TZjrXIjx8=\n");

    /* renamed from: ゥ, reason: contains not printable characters */
    public static final String f1972 = StringFog.decrypt("PFLox4+28dwsUvCbhaGwwTtWq4qJqurAMFHpjJTq3d0xSfeGiqj7wB5e8YCQrerL\n", "Xz2F6ebEnrI=\n");

    /* renamed from: へ, reason: contains not printable characters */
    public static final String f1971 = StringFog.decrypt("oyZmro4qHDWeIXOnvTocNZwhZrI=\n", "6kgSy/xZaFw=\n");

    /* renamed from: っ, reason: contains not printable characters */
    public static final String f1970 = StringFog.decrypt("ZjCxIBjwGDV2MKl8EudZKGE08m0e7AMpajOwawOsPjVxOq59BesDMmQznW0F6wEycSY=\n", "BV/cDnGCd1s=\n");

    /* renamed from: く, reason: contains not printable characters */
    public static final String f1969 = StringFog.decrypt("i+VN19YE582n4UHP6gLy\n", "xJUouYN2i4w=\n");

    /* renamed from: Ↄ, reason: contains not printable characters */
    public static final String f1968 = StringFog.decrypt("IVBJr0/D0OUxUFHzRdSR+CZUCuJJ38v5LVNI5FSf8PsnUXHzSvDc/ytJTfVf\n", "Qj8kgSaxv4s=\n");

    /* renamed from: Ⅽ, reason: contains not printable characters */
    public static final String f1967 = StringFog.decrypt("o4A7p21Yb6WJlxaoUFl/paaTLaZLQw==\n", "6vJUyT43Gtc=\n");

    /* renamed from: K, reason: contains not printable characters */
    public static final String f1966 = StringFog.decrypt("iJQ6VZjMiWaYlCIJktvIZY6fPhqF14lmmJ88VbjMiWa4lCIJktukaYWVMgm9359nno8=\n", "6/tXe/G+5gg=\n");

    /* renamed from: Ύ, reason: contains not printable characters */
    public static final String f1965 = StringFog.decrypt("xMPpouvqU57n0e+A5+t0lujH9Q==\n", "hqKHzI6YAPM=\n");

    /* renamed from: Ὺ, reason: contains not printable characters */
    public static final String f1964 = StringFog.decrypt("4MO87JB4Jw3K1A==\n", "qbHTgsMXUn8=\n");

    /* renamed from: Ῡ, reason: contains not printable characters */
    public static final String f1963 = StringFog.decrypt("2z/OVdbaBmT9PPpGx8g=\n", "klK+J7OpdQ0=\n");

    /* renamed from: Ῠ, reason: contains not printable characters */
    public static final String f1962 = StringFog.decrypt("hK4a8ErPR4mirS7jW914ib63D+xKzg==\n", "zcNqgi+8NOA=\n");

    /* renamed from: Ὑ, reason: contains not printable characters */
    public static final String f1961 = StringFog.decrypt("clOUKVId8ElB\n", "NgfWaDZLmSw=\n");

    /* renamed from: Ṿ, reason: contains not printable characters */
    public static final String f1960 = StringFog.decrypt("KwQZmqteALcnBVrQr0UIri1FFdC5HSWZCioQ4qNWFg==\n", "SGt0tMozYc0=\n");

    /* renamed from: Ḽ, reason: contains not printable characters */
    public static final String f1959 = StringFog.decrypt("iLAuPf7SKcW9lzk2/Oc36K2mLD385zc=\n", "xNVYWJKCRaQ=\n");

    /* renamed from: Ḹ, reason: contains not printable characters */
    public static final String f1958 = StringFog.decrypt("0V3Yho30qhDkccCXhNa1BfRMx4KN6K8C6V3AhpM=\n", "nTiu4+GkxnE=\n");

    /* renamed from: Ḟ, reason: contains not printable characters */
    public static final String f1957 = StringFog.decrypt("npDwKALM3jGrp+M6D+7WNbaj7ykL8/MlpprrLBr10Ry7hvIoAPnA\n", "0vWGTW6cslA=\n");

    /* renamed from: ᵆ, reason: contains not printable characters */
    public static final String f1956 = StringFog.decrypt("Fmvj1ds0P8EjXPDH1hY3xT5Y/NTSCx/JKXrw3tIW\n", "Wg6VsLdkU6A=\n");

    /* renamed from: ᘥ, reason: contains not printable characters */
    public static final String f1955 = StringFog.decrypt("SecdjN7nm8l80A6e08WTzWHUAo3X2LrJa/cKhf7ehNxg7A6b\n", "BYJr6bK396g=\n");

    /* renamed from: ᗀ, reason: contains not printable characters */
    public static final String f1954 = StringFog.decrypt("vSFS+KcH\n", "/EUblsFovh8=\n");

    /* renamed from: ᖺ, reason: contains not printable characters */
    public static final String f1953 = StringFog.decrypt("K3maNNUp1ZMeUo0l0A/cswM=\n", "ZxzsUbl5ufI=\n");

    /* renamed from: ᖸ, reason: contains not printable characters */
    public static final String f1952 = StringFog.decrypt("GT0k235YCYgbPSndfUk=\n", "V1xQsgg9SOw=\n");

    /* renamed from: ᖭ, reason: contains not printable characters */
    public static final String f1951 = StringFog.decrypt("zSFZ/eflxqr4Ck7s4sPPiuUIRuv/0MSu8w==\n", "gUQvmIu1qss=\n");

    /* renamed from: ᖫ, reason: contains not printable characters */
    public static final String f1950 = StringFog.decrypt("O7j95NseORwOkO7l3i8DFBKq\n", "d92LgbdOVX0=\n");

    /* renamed from: ᖩ, reason: contains not printable characters */
    public static final String f1949 = StringFog.decrypt("QOO2ByRoHjtg874BNUwIMWDztg==\n", "AYfXd1ANbHU=\n");

    /* renamed from: ᖅ, reason: contains not printable characters */
    public static final String f1948 = StringFog.decrypt("VefpAn1zbfNN7/gcQ3lA8370\n", "G4adawsWLJc=\n");

    /* renamed from: ᕆ, reason: contains not printable characters */
    public static final String f1947 = StringFog.decrypt("y2giXS2q13PMZyJRKaH3e85vJUw6qtNt\n", "ggZWOF/Eth8=\n");

    /* renamed from: ᕄ, reason: contains not printable characters */
    public static final String f1946 = StringFog.decrypt("hSJb7fX7STyKJ0709/t6EaU3Svbl/2s9\n", "y0MvhIOeCFg=\n");

    /* renamed from: ᕃ, reason: contains not printable characters */
    public static final String f1945 = StringFog.decrypt("/T2DUU1mF+X3PYNZcm0i5ME6llte\n", "s1z3ODsDVoE=\n");

    /* renamed from: ᕂ, reason: contains not printable characters */
    public static final String f1944 = StringFog.decrypt("56FEw3xG7rPgrkTPeELMo8CvXuZjUNuyx6VC\n", "qcAwqgojr9c=\n");

    /* renamed from: ᔽ, reason: contains not printable characters */
    public static final String f1943 = StringFog.decrypt("LcXkJBHj8pEqyuQoFeDSlgY=\n", "Y6SQTWeGs/U=\n");

    /* renamed from: ᔺ, reason: contains not printable characters */
    public static final String f1942 = StringFog.decrypt("VLC/m9Oojj9WvqqW6aS8L3+/roA=\n", "GtHL8qXNz1s=\n");

    /* renamed from: ᔹ, reason: contains not printable characters */
    public static final String f1941 = StringFog.decrypt("RlGHrzcWra5bXZK1KT+FuXxVnaMz\n", "CDDzxkFz7Mo=\n");

    /* renamed from: ᔲ, reason: contains not printable characters */
    public static final String f1940 = StringFog.decrypt("cvI2VNcvP61q+idK4yMQrVnhC1PVLwyvXfAn\n", "PJNCPaFKfsk=\n");

    /* renamed from: ᔱ, reason: contains not printable characters */
    public static final String f1939 = StringFog.decrypt("QCN1RJQW\n", "AUcxJeB3C/U=\n");

    /* renamed from: ᓮ, reason: contains not printable characters */
    public static final String f1938 = StringFog.decrypt("CK6R3+iYeo49ioPz6q55\n", "RMvnuoTIFu8=\n");

    /* renamed from: ᐱ, reason: contains not printable characters */
    public static final String f1937 = StringFog.decrypt("xkXFkbOelk7zYtKasauIbu522pGo\n", "iiCz9N/O+i8=\n");

    /* renamed from: Ꮭ, reason: contains not printable characters */
    public static final String f1936 = StringFog.decrypt("5SLwxpK+Ruz/fvnGirVL8ec59IeJ/k356CP4msmcSu7jIc2Ehqlt+egj+JqmtHnx4zo=\n", "hk2d6OfQL5g=\n");

    /* renamed from: Ꮧ, reason: contains not printable characters */
    public static final String f1935 = StringFog.decrypt("6an3kRCgdSXcjuCaEpVrBcGa6JELvHA30anvkQ4=\n", "pcyB9HzwGUQ=\n");

    /* renamed from: პ, reason: contains not printable characters */
    public static final String f1934 = StringFog.decrypt("nN/dJpw2fHa2yPMsvB9mdrjMxg==\n", "1a2ySM9ZCQQ=\n");

    /* renamed from: ე, reason: contains not printable characters */
    public static final String f1933 = StringFog.decrypt("jV7vJunJWMeGUecn\n", "zz+BSIy7GaM=\n");

    /* renamed from: ງ, reason: contains not printable characters */
    public static final String f1932 = StringFog.decrypt("Pp3fVZVvhYwumcBOlW6w\n", "fPyxO/AdxOg=\n");

    /* renamed from: อ, reason: contains not printable characters */
    public static final String f1931 = StringFog.decrypt("xtNZjLqb5zrS21KV\n", "hLI34t/ppl4=\n");

    /* renamed from: ม, reason: contains not printable characters */
    public static final String f1930 = StringFog.decrypt("4W+KjoF8nVb7M4OOnWCbTPFvktKXd5VG8S6FwZp8kVCsQobOmneGY+ZWjsWD\n", "ggDnoPQS9CI=\n");

    /* renamed from: น, reason: contains not printable characters */
    public static final String f1929 = StringFog.decrypt("TDmzSWuGEKZYMbhQQp0itms2uFU=\n", "DljdJw70UcI=\n");

    /* renamed from: ต, reason: contains not printable characters */
    public static final String f1928 = StringFog.decrypt("LJOek21mE7YRlIuaXnE=\n", "Zf3q9h8VZ98=\n");

    /* renamed from: ฑ, reason: contains not printable characters */
    public static final String f1927 = StringFog.decrypt("wmB2SdaCNYT/Z2NA5ZUIg+1h\n", "iw4CLKTxQe0=\n");

    /* renamed from: ঢ়, reason: contains not printable characters */
    public static final String f1926 = StringFog.decrypt("K7QIFMhtVkMWsx0d+3puQxGuGR/fbA==\n", "Ytp8cboeIio=\n");

    /* renamed from: ষ, reason: contains not printable characters */
    public static final String f1925 = StringFog.decrypt("OgLYsO5a9lsHBc253U3QVwIZyabo\n", "c2ys1ZwpgjI=\n");

    /* renamed from: ঘ, reason: contains not printable characters */
    public static final String f1924 = StringFog.decrypt("rjDR16sqt8i9MQ==\n", "/FWmttlO0qw=\n");

    /* renamed from: খ, reason: contains not printable characters */
    public static final String f1923 = StringFog.decrypt("6XlWNqeW22n6eGg5s50=\n", "uxwhV9Xyvg0=\n");

    /* renamed from: এ, reason: contains not printable characters */
    public static final String f1922 = StringFog.decrypt("u0jAzHQO3nqoSfvEdR7ecIxf\n", "6S23rQZqux4=\n");

    /* renamed from: ऱ, reason: contains not printable characters */
    public static final String f1921 = StringFog.decrypt("ebvaDqLXhKhquv8KocaEv18=\n", "K96tb9Cz4cw=\n");

    /* renamed from: ܟ, reason: contains not printable characters */
    public static final String f1920 = StringFog.decrypt("EcAnYssNdH8k7D9zwi9rajTROGbLHHw=\n", "XaVRB6ddGB4=\n");

    /* renamed from: ܘ, reason: contains not printable characters */
    public static final String f1919 = StringFog.decrypt("Lp0YUWODSyQbsQBAaqFUMQuMB1VjkkMJC4saUWG2VQ==\n", "YvhuNA/TJ0U=\n");

    /* renamed from: ے, reason: contains not printable characters */
    public static final String f1918 = StringFog.decrypt("GIbnl+jfxmgtsfSF5f3ObDCi9Q==\n", "VOOR8oSPqgk=\n");

    /* renamed from: ۉ, reason: contains not printable characters */
    public static final String f1917 = StringFog.decrypt("LuyKORBuzdob25krHUzF3gbImBAVTdXeDOyO\n", "Yon8XHw+obs=\n");

    /* renamed from: ۅ, reason: contains not printable characters */
    public static final String f1916 = StringFog.decrypt("ZjWcu4z2d+RTAo+pgdR/\n", "KlDq3uCmG4U=\n");

    /* renamed from: ڑ, reason: contains not printable characters */
    public static final String f1915 = StringFog.decrypt("ZimPu9Uzz4JTBZSuywbQkEMjl5rYF8I=\n", "Kkz53rljo+M=\n");

    /* renamed from: پ, reason: contains not printable characters */
    public static final String f1914 = StringFog.decrypt("QB8SFoJ2IzN1MwkDnEM8IWUVCjePUi4eZQkQFoBDPQ==\n", "DHpkc+4mT1I=\n");

    /* renamed from: ٽ, reason: contains not printable characters */
    public static final String f1913 = StringFog.decrypt("AKeBPCb7QQE3rpQJCuBUHwKxhhks42AME6O/Ayzj\n", "Z8L1cEONJG0=\n");

    /* renamed from: ث, reason: contains not printable characters */
    public static final String f1912 = StringFog.decrypt("0E75ECEtAHfhRvwlDTYVadRZ7jUrNSlywl74MiEp\n", "sSqdXERbZRs=\n");

    /* renamed from: ת, reason: contains not printable characters */
    public static final String f1911 = StringFog.decrypt("NvbKhgG1DRMy9su5G7E4Pynj1YwEoygZKt/OmgO1LxM2\n", "RJOn6XfQQXY=\n");

    public C0713(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0557
    /* renamed from: ﻛ */
    public final String mo5368() {
        try {
            try {
                return LevelPlay.getSdkVersion();
            } catch (Throwable unused) {
                return IronSourceUtils.getSDKVersion();
            }
        } catch (Throwable unused2) {
            return null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0557
    /* renamed from: ﾇ */
    public final HashMap mo5369() {
        HashMap hashMap = new HashMap();
        hashMap.put(f1982, new C0903(this));
        hashMap.put(f1981, new C0880(this));
        hashMap.put(f1980, new C0786(this));
        hashMap.put(f1979, new C0783(this));
        hashMap.put(f1978, new C0781(this));
        hashMap.put(f1913, new C0736(this));
        hashMap.put(f1912, new C0734(this));
        hashMap.put(f1911, new C0732(this));
        hashMap.put(f1977, new C0718(this));
        hashMap.put(f1976, new C0911(this));
        return hashMap;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0557
    /* renamed from: ﾒ */
    public final Class mo5370(String str) {
        char c;
        switch (str.hashCode()) {
            case -2063883567:
                if (str.equals(f1950)) {
                    c = 25;
                    break;
                }
                c = 65535;
                break;
            case -2054763962:
                if (str.equals(f1951)) {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            case -2044561387:
                if (str.equals(f1945)) {
                    c = 30;
                    break;
                }
                c = 65535;
                break;
            case -2012752057:
                if (str.equals(f1920)) {
                    c = '7';
                    break;
                }
                c = 65535;
                break;
            case -1879025222:
                if (str.equals(f1961)) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case -1810844504:
                if (str.equals(f1929)) {
                    c = '.';
                    break;
                }
                c = 65535;
                break;
            case -1704786309:
                if (str.equals(f1971)) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1678289205:
                if (str.equals(f1972)) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1555060867:
                if (str.equals(f1917)) {
                    c = AbstractJsonLexerKt.COLON;
                    break;
                }
                c = 65535;
                break;
            case -1406023077:
                if (str.equals(f1970)) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -1282106699:
                if (str.equals(f1936)) {
                    c = '\'';
                    break;
                }
                c = 65535;
                break;
            case -1276273849:
                if (str.equals(f1962)) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case -1115843213:
                if (str.equals(f1963)) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case -1088585376:
                if (str.equals(f1935)) {
                    c = '(';
                    break;
                }
                c = 65535;
                break;
            case -989825485:
                if (str.equals(f1949)) {
                    c = 26;
                    break;
                }
                c = 65535;
                break;
            case -838208757:
                if (str.equals(f1948)) {
                    c = 27;
                    break;
                }
                c = 65535;
                break;
            case -643050252:
                if (str.equals(f1968)) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -609786639:
                if (str.equals(f1924)) {
                    c = '3';
                    break;
                }
                c = 65535;
                break;
            case -559540471:
                if (str.equals(f1956)) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case -498709917:
                if (str.equals(f1926)) {
                    c = '1';
                    break;
                }
                c = 65535;
                break;
            case -498060603:
                if (str.equals(f1974)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -393802555:
                if (str.equals(f1922)) {
                    c = '5';
                    break;
                }
                c = 65535;
                break;
            case -284636416:
                if (str.equals(f1932)) {
                    c = '+';
                    break;
                }
                c = 65535;
                break;
            case -154075626:
                if (str.equals(f1941)) {
                    c = '\"';
                    break;
                }
                c = 65535;
                break;
            case -153002112:
                if (str.equals(f1930)) {
                    c = '-';
                    break;
                }
                c = 65535;
                break;
            case 30304559:
                if (str.equals(f1955)) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 85893348:
                if (str.equals(f1934)) {
                    c = ')';
                    break;
                }
                c = 65535;
                break;
            case 149942051:
                if (str.equals(f1964)) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 204617641:
                if (str.equals(f1918)) {
                    c = '9';
                    break;
                }
                c = 65535;
                break;
            case 204897024:
                if (str.equals(f1925)) {
                    c = '2';
                    break;
                }
                c = 65535;
                break;
            case 307677661:
                if (str.equals(f1933)) {
                    c = GMTDateParser.ANY;
                    break;
                }
                c = 65535;
                break;
            case 308060116:
                if (str.equals(f1931)) {
                    c = AbstractJsonLexerKt.COMMA;
                    break;
                }
                c = 65535;
                break;
            case 320151695:
                if (str.equals(f1928)) {
                    c = FileSystemKt.UnixPathSeparator;
                    break;
                }
                c = 65535;
                break;
            case 334118616:
                if (str.equals(f1959)) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 663296747:
                if (str.equals(f1973)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 766880816:
                if (str.equals(f1940)) {
                    c = '#';
                    break;
                }
                c = 65535;
                break;
            case 779287609:
                if (str.equals(f1967)) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 823061407:
                if (str.equals(f1943)) {
                    c = ' ';
                    break;
                }
                c = 65535;
                break;
            case 846220331:
                if (str.equals(f1915)) {
                    c = Typography.less;
                    break;
                }
                c = 65535;
                break;
            case 894546539:
                if (str.equals(f1947)) {
                    c = 28;
                    break;
                }
                c = 65535;
                break;
            case 1052532031:
                if (str.equals(f1923)) {
                    c = '4';
                    break;
                }
                c = 65535;
                break;
            case 1069602180:
                if (str.equals(f1946)) {
                    c = 29;
                    break;
                }
                c = 65535;
                break;
            case 1081984916:
                if (str.equals(f1942)) {
                    c = '!';
                    break;
                }
                c = 65535;
                break;
            case 1180349927:
                if (str.equals(f1966)) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 1226831433:
                if (str.equals(f1938)) {
                    c = '%';
                    break;
                }
                c = 65535;
                break;
            case 1266525324:
                if (str.equals(f1937)) {
                    c = Typography.amp;
                    break;
                }
                c = 65535;
                break;
            case 1267145181:
                if (str.equals(f1927)) {
                    c = '0';
                    break;
                }
                c = 65535;
                break;
            case 1304950957:
                if (str.equals(f1975)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 1325013503:
                if (str.equals(f1914)) {
                    c = C4761z5.U;
                    break;
                }
                c = 65535;
                break;
            case 1432059210:
                if (str.equals(f1957)) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case 1517126868:
                if (str.equals(f1969)) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 1628896204:
                if (str.equals(f1944)) {
                    c = 31;
                    break;
                }
                c = 65535;
                break;
            case 1715808775:
                if (str.equals(f1916)) {
                    c = ';';
                    break;
                }
                c = 65535;
                break;
            case 1773831812:
                if (str.equals(f1952)) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case 1870849118:
                if (str.equals(f1921)) {
                    c = '6';
                    break;
                }
                c = 65535;
                break;
            case 1910059890:
                if (str.equals(f1953)) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case 1910219460:
                if (str.equals(f1965)) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 1955369613:
                if (str.equals(f1939)) {
                    c = Typography.dollar;
                    break;
                }
                c = 65535;
                break;
            case 1955530641:
                if (str.equals(f1954)) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case 2019413793:
                if (str.equals(f1960)) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 2019599576:
                if (str.equals(f1958)) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 2102577435:
                if (str.equals(f1919)) {
                    c = '8';
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
                return AbstractAdapter.class;
            case 1:
                return Placement.class;
            case 2:
            case 3:
                return ControllerActivity.class;
            case 4:
            case 5:
                return InterstitialActivity.class;
            case 6:
            case 7:
                return OpenUrlActivity.class;
            case '\b':
            case '\t':
                return IronSourceBannerLayout.class;
            case '\n':
                return BannerSmashListener.class;
            case 11:
                return IronSource.class;
            case '\f':
                return ImpressionData.class;
            case '\r':
                return ImpressionDataListener.class;
            case 14:
            case 15:
                return DTBAdView.class;
            case 16:
                return LevelPlayBannerListener.class;
            case 17:
                return LevelPlayInterstitialListener.class;
            case 18:
                return LevelPlayRewardedVideoAutomaticListener.class;
            case 19:
                return LevelPlayRewardedVideoListener.class;
            case 20:
                return LevelPlayRewardedVideoManualListener.class;
            case 21:
                return AdInfo.class;
            case 22:
                return LevelPlayNativeAd.class;
            case 23:
                return NativeAdLayout.class;
            case 24:
                return LevelPlayNativeAdListener.class;
            case 25:
                return LevelPlayMediaView.class;
            case 26:
                return AdapterNativeAdData.class;
            case 27:
                return NativeAdViewHolder.class;
            case 28:
                return InternalNativeAdListener.class;
            case 29:
                return NativeAdAdapterInterface.class;
            case 30:
                return NativeAdDataInterface.class;
            case 31:
                return NativeAdInteractionListener.class;
            case ' ':
                return NativeAdInterface.class;
            case '!':
                return NativeAdLoadListener.class;
            case '\"':
                return NativeAdSmashListener.class;
            case '#':
                return NativeAdViewBinderInterface.class;
            case '$':
                return AdData.class;
            case '%':
                return LevelPlayAdInfo.class;
            case '&':
            case '\'':
                return LevelPlayBannerAdView.class;
            case '(':
                return LevelPlayBannerAdViewListener.class;
            case ')':
                return IronSourceAds.AdFormat.class;
            case '*':
                return BannerAdInfo.class;
            case '+':
                return BannerAdRequest.class;
            case ',':
            case '-':
                return BannerAdView.class;
            case '.':
                return BannerAdViewListener.class;
            case '/':
                return InterstitialAd.class;
            case '0':
                return InterstitialAdInfo.class;
            case '1':
                return InterstitialAdListener.class;
            case '2':
                return InterstitialAdRequest.class;
            case '3':
                return RewardedAd.class;
            case '4':
                return RewardedAdInfo.class;
            case '5':
                return RewardedAdListener.class;
            case '6':
                return RewardedAdRequest.class;
            case '7':
                return LevelPlayInterstitialAd.class;
            case '8':
                return LevelPlayInterstitialAdListener.class;
            case '9':
                return LevelPlayRewardedAd.class;
            case ':':
                return LevelPlayRewardedAdListener.class;
            case ';':
                return LevelPlayReward.class;
            case '<':
                return LevelPlayImpressionData.class;
            case '=':
                return LevelPlayImpressionDataListener.class;
            default:
                return null;
        }
    }
}
