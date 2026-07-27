package com.ironsource.adqualitysdk.sdk.i;

import com.hyprmx.android.BuildConfig;
import com.hyprmx.android.sdk.activity.HyprMXBaseViewController;
import com.hyprmx.android.sdk.activity.HyprMXMraidViewController;
import com.hyprmx.android.sdk.activity.HyprMXNoOffersActivity;
import com.hyprmx.android.sdk.activity.HyprMXOfferViewerActivity;
import com.hyprmx.android.sdk.activity.HyprMXOfferWebViewController;
import com.hyprmx.android.sdk.activity.HyprMXRequiredInformationActivity;
import com.hyprmx.android.sdk.activity.HyprMXVastViewController;
import com.hyprmx.android.sdk.activity.HyprMXWebTrafficViewController;
import com.hyprmx.android.sdk.activity.HyprMXWebView;
import com.hyprmx.android.sdk.activity.HyprMXWebViewClient;
import com.hyprmx.android.sdk.activity.OfferViewerHandler;
import com.hyprmx.android.sdk.api.data.Ad;
import com.hyprmx.android.sdk.api.data.OfferCacheEntity;
import com.hyprmx.android.sdk.api.data.WebTrafficObject;
import com.hyprmx.android.sdk.core.DependencyHolder;
import com.hyprmx.android.sdk.core.HyprMX;
import com.hyprmx.android.sdk.core.HyprMXController;
import com.hyprmx.android.sdk.graphics.HyprMXLearnMoreController;
import com.hyprmx.android.sdk.graphics.HyprMXSkipController;
import com.hyprmx.android.sdk.graphics.HyprMXWebViewWithClosableNavBar;
import com.hyprmx.android.sdk.model.PreloadedVastData;
import com.hyprmx.android.sdk.overlay.HyprMXBrowserActivity;
import com.hyprmx.android.sdk.placement.PlacementType;
import com.hyprmx.android.sdk.utility.HyprMXProperties;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.HashMap;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ṝ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1012 extends AbstractC0557 {

    /* renamed from: סּ, reason: contains not printable characters */
    public static final String f2978 = StringFog.decrypt("3vlWeR47hgHY+kRHGBawGdz/VnsJNaE=\n", "uZwiLntZ0nM=\n");

    /* renamed from: טּ, reason: contains not printable characters */
    public static final String f2977 = StringFog.decrypt("XzgWlIs7qNV7PAGziB6hzls2NrOfMrjAUAgQtw==\n", "OF1i2+1dzac=\n");

    /* renamed from: ﬤ, reason: contains not printable characters */
    public static final String f2976 = StringFog.decrypt("IH/6LHsl\n", "aAaKXjZ9hoQ=\n");

    /* renamed from: 爫, reason: contains not printable characters */
    public static final String f2975 = StringFog.decrypt("mGGCv+y8BJK+bICizYgijw==\n", "0BjyzaHkR/0=\n");

    /* renamed from: 乁, reason: contains not printable characters */
    public static final String f2974 = StringFog.decrypt("7wXMBPp5xI7LPdQX+g==\n", "v2mtZ58UoeA=\n");

    /* renamed from: 丫, reason: contains not printable characters */
    public static final String f2973 = StringFog.decrypt("RLw=\n", "BdjNC56reWs=\n");

    /* renamed from: ヶ, reason: contains not printable characters */
    public static final String f2972 = StringFog.decrypt("dO3Vy8HpfEFT8e3Bw+l8XQ==\n", "MIilrq+NGS8=\n");

    /* renamed from: ヮ, reason: contains not printable characters */
    public static final String f2971 = StringFog.decrypt("JQWt0r8TiuIRIanNpDaP8xQ=\n", "dXfIvtBy7oc=\n");

    /* renamed from: リ, reason: contains not printable characters */
    public static final String f2970 = StringFog.decrypt("k3aZDikLMKW0f4wOEDoFpA==\n", "2w/pfGRTYNc=\n");

    /* renamed from: ト, reason: contains not printable characters */
    public static final String f2969 = StringFog.decrypt("o0FnEG3OGWKJbn4HV8Enc4N7ew1T9yxrjnZ2FGL3PA==\n", "6zgXYiCWTgc=\n");

    /* renamed from: ゥ, reason: contains not printable characters */
    public static final String f2968 = StringFog.decrypt("43GxBOQdHV7tZvJL4gAfQ+l68lnoD0NL8n+sQuUHHgLIZ6xYwTw6SeJItU/7MwRY6F2wRf8FD0Dl\nUL1czgUf\n", "gB7cKoxkbSw=\n");

    /* renamed from: へ, reason: contains not printable characters */
    public static final String f2967 = StringFog.decrypt("g6Dow2k8S16Ev/7UVhdEUr+w7thQHQ==\n", "y9mYsSRkBTE=\n");

    /* renamed from: っ, reason: contains not printable characters */
    public static final String f2966 = StringFog.decrypt("1/YGu69wLJjZ4UX0qW0uhd39ReajYnKL1+0C4659JcT84BvnilEShfv/DfC1eh2JwPAd/LNw\n", "tJlrlccJXOo=\n");

    /* renamed from: く, reason: contains not printable characters */
    public static final String f2965 = StringFog.decrypt("D+YBpZlJzi0h+gOBvXT2LjXeEqO9Z+g/Pg==\n", "R59x19QRgUs=\n");

    /* renamed from: Ↄ, reason: contains not printable characters */
    public static final String f2964 = StringFog.decrypt("YXpp1X8fMaxvbSqaeQIzsWtxKohzDW+/YWFtjX4SOPBKbHSJWj4OuGRwdq1+Aza7cFRnj34QKKp7\n", "AhUE+xdmQd4=\n");

    /* renamed from: Ⅽ, reason: contains not printable characters */
    public static final String f2963 = StringFog.decrypt("iRreZtatgxywFsdm/pGYF6cM3Hn6gbgWryLNYPKDuA24\n", "wWOuFJv10Xk=\n");

    /* renamed from: K, reason: contains not printable characters */
    public static final String f2962 = StringFog.decrypt("MYHDY6Wuezc/loAso7N5KjuKgD6pvCUkMZrHO6Sjcmsal94/gI9ZICObxz+os0IrNIHcIKyjYio8\nr805pKFiMSs=\n", "Uu6uTc3XC0U=\n");

    /* renamed from: Ύ, reason: contains not printable characters */
    public static final String f2961 = StringFog.decrypt("6wgpLifvAJPQFA81D8ABnc0FKzMG2yeA\n", "o3FZXGq3QvI=\n");

    /* renamed from: Ὺ, reason: contains not printable characters */
    public static final String f2960 = StringFog.decrypt("FDT58wPILwcvOd/oK+c6CTI5++4i/BwU\n", "XE2JgU6QeWY=\n");

    /* renamed from: Ῡ, reason: contains not printable characters */
    public static final String f2959 = StringFog.decrypt("0ZhF7sQlg937tUf97xu928+IUOvKErrM645Z8OwP\n", "meE1nIl91Lg=\n");

    /* renamed from: Ῠ, reason: contains not printable characters */
    public static final String f2958 = StringFog.decrypt("kCEhq1iJVJa3IgKgXqNBjA==\n", "30dHzirKNfU=\n");

    /* renamed from: Ὑ, reason: contains not printable characters */
    public static final String f2957 = StringFog.decrypt("q6CwsmXd3eyVpp2EfdnY/g==\n", "/MXS5he8u4o=\n");

    /* renamed from: Ṿ, reason: contains not printable characters */
    public static final String f2956 = StringFog.decrypt("atyaDGHzn+1U2q0KXw==\n", "Pbn4WBOS+Ys=\n");

    /* renamed from: Ḽ, reason: contains not printable characters */
    public static final String f2955 = StringFog.decrypt("E70kTA4RsKo6tjpzLDuZjDSqIEwsJZCqKQ==\n", "W8RUPkNJ/M8=\n");

    /* renamed from: Ḹ, reason: contains not printable characters */
    public static final String f2954 = StringFog.decrypt("kQECuYt8chC4ERadr0FIIbYWBrmpSFMHqw==\n", "2Xhyy8YkP2I=\n");

    /* renamed from: Ḟ, reason: contains not printable characters */
    public static final String f2953 = StringFog.decrypt("TPjSw9KjbWhi5NDm+pl0Z2H24d7xj1BhaO3Hww==\n", "BIGisZ/7Ig4=\n");

    /* renamed from: ᵆ, reason: contains not printable characters */
    public static final String f2952 = StringFog.decrypt("2Ey30CpzqcHyY67HEA==\n", "kDXHomcr/qQ=\n");

    /* renamed from: ᘥ, reason: contains not printable characters */
    public static final String f2951 = StringFog.decrypt("re5Q1b0squ2HwUnChzeR4YD5VA==\n", "5Zcgp/B0/Yg=\n");

    /* renamed from: ᗀ, reason: contains not printable characters */
    public static final String f2950 = StringFog.decrypt("2GWaqbX2oTP2eZiNkcuZMOJUi7Wcwosn\n", "kBzq2/iu7lU=\n");

    /* renamed from: ᖺ, reason: contains not printable characters */
    public static final String f2949 = StringFog.decrypt("gWt0HK22L4+5aGAxvo4ihqt/XhCslCOEq38=\n", "zg0Sed/gRuo=\n");

    /* renamed from: ᖸ, reason: contains not printable characters */
    public static final String f2948 = StringFog.decrypt("DXypX1NJzqQsdZpCcGXvoClpvF8=\n", "RQXZLR4Rnc8=\n");

    /* renamed from: ᖭ, reason: contains not printable characters */
    public static final String f2947 = StringFog.decrypt("MYX5HfDjivsQjMoA08+r/xWQ7B3x0qrkHJLsHQ==\n", "efyJb7272ZA=\n");

    /* renamed from: ᖫ, reason: contains not printable characters */
    public static final String f2946 = StringFog.decrypt("vj9QDb5ivIu8\n", "2VokTNo2xfs=\n");

    /* renamed from: ᖩ, reason: contains not printable characters */
    public static final String f2945 = StringFog.decrypt("Huj4Qv/LH1wU6OJmx9MMXDzj+X8=\n", "eY2MEpOqfDk=\n");

    /* renamed from: ᖅ, reason: contains not printable characters */
    public static final String f2944 = StringFog.decrypt("Div+XBIfNWUNK+R7Dic/Zw0r+FEZHCRqBy3v\n", "aU6KGHdvUAs=\n");

    /* renamed from: ᕆ, reason: contains not printable characters */
    public static final String f2943 = StringFog.decrypt("Cyj4ui9xCaYFL/mKKXA0sA==\n", "bE2M/kYCfdQ=\n");

    /* renamed from: ᕄ, reason: contains not printable characters */
    public static final String f2942 = StringFog.decrypt("vVdQ6z/UT/u3V0rPENpC6qhdSNc2xw==\n", "2jIku1O1LJ4=\n");

    /* renamed from: ᕃ, reason: contains not printable characters */
    public static final String f2941 = StringFog.decrypt("D43RWSWBkBcJjMBtE4WIGQ==\n", "aOilCVfk/Hg=\n");

    /* renamed from: ᕂ, reason: contains not printable characters */
    public static final String f2940 = StringFog.decrypt("rnOpgsmae7esYrig2w==\n", "yRbd0qjoGto=\n");

    /* renamed from: ᔽ, reason: contains not printable characters */
    public static final String f2939 = StringFog.decrypt("BKE9EnNXB68jrz4FTE4mqSWuJBRH\n", "TNhNYD4PRd0=\n");

    /* renamed from: ᔺ, reason: contains not printable characters */
    public static final String f2938 = StringFog.decrypt("j1TwMaJNBbmBQ7N+pFAHpIVfs2yuX1ukml7vc6tNW4OVS+9SknYHpJtI+G2LVwGimlLpZg==\n", "7DudH8o0dcs=\n");

    public C1012(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0557
    /* renamed from: ﻛ */
    public final String mo5368() {
        try {
            try {
                return (String) BuildConfig.class.getDeclaredField(StringFog.decrypt("Wvy42Jd6UZ9C+KfO\n", "DLnqi941H8A=\n")).get(null);
            } catch (Exception unused) {
                return null;
            }
        } catch (Exception unused2) {
            C1174 c1174 = C0391.m5393().f502;
            String decrypt = StringFog.decrypt("hTjLRQ+gaabwOMs6\n", "22SvHlPER/s=\n");
            c1174.getClass();
            return C1174.m5899((Object) null, BuildConfig.class, decrypt);
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0557
    /* renamed from: ﾇ */
    public final HashMap mo5369() {
        HashMap hashMap = new HashMap();
        hashMap.put(f2978, new C1120(this));
        hashMap.put(f2977, new C1094(this));
        hashMap.put(f2946, new C1075(this));
        hashMap.put(f2945, new C1060(this));
        hashMap.put(f2944, new C1041(this));
        hashMap.put(f2943, new C1040(this));
        hashMap.put(f2942, new C1039(this));
        hashMap.put(f2941, new C1038(this));
        hashMap.put(f2940, new C1020(this));
        return hashMap;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0557
    /* renamed from: ﾒ */
    public final Class mo5370(String str) {
        char c;
        switch (str.hashCode()) {
            case -2118473762:
                if (str.equals(f2976)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -2115661176:
                if (str.equals(f2959)) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case -2082076211:
                if (str.equals(f2947)) {
                    c = 29;
                    break;
                }
                c = 65535;
                break;
            case -2060981001:
                if (str.equals(f2972)) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1783324338:
                if (str.equals(f2966)) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case -1711062568:
                if (str.equals(f2969)) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -1632261541:
                if (str.equals(f2952)) {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            case -1625751435:
                if (str.equals(f2962)) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case -1429076201:
                if (str.equals(f2953)) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case -1345825871:
                if (str.equals(f2970)) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -1289932600:
                if (str.equals(f2957)) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case -1102538544:
                if (str.equals(f2949)) {
                    c = 27;
                    break;
                }
                c = 65535;
                break;
            case -1056910325:
                if (str.equals(f2968)) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -793729563:
                if (str.equals(f2967)) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case -684201479:
                if (str.equals(f2948)) {
                    c = 28;
                    break;
                }
                c = 65535;
                break;
            case -411143178:
                if (str.equals(f2964)) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case -352824194:
                if (str.equals(f2971)) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -58290677:
                if (str.equals(f2960)) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case -52302939:
                if (str.equals(f2938)) {
                    c = 31;
                    break;
                }
                c = 65535;
                break;
            case -48720897:
                if (str.equals(f2965)) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 2115:
                if (str.equals(f2973)) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 5206681:
                if (str.equals(f2939)) {
                    c = 30;
                    break;
                }
                c = 65535;
                break;
            case 99044255:
                if (str.equals(f2974)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 217655834:
                if (str.equals(f2975)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 748493318:
                if (str.equals(f2951)) {
                    c = 25;
                    break;
                }
                c = 65535;
                break;
            case 902272186:
                if (str.equals(f2954)) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case 1056638846:
                if (str.equals(f2963)) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 1527993897:
                if (str.equals(f2958)) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case 1564846544:
                if (str.equals(f2961)) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 1575934042:
                if (str.equals(f2950)) {
                    c = 26;
                    break;
                }
                c = 65535;
                break;
            case 1775126662:
                if (str.equals(f2956)) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 1872662391:
                if (str.equals(f2955)) {
                    c = 21;
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
                return HyprMX.class;
            case 1:
                return HyprMXController.class;
            case 2:
                return PlacementType.class;
            case 3:
                return Ad.class;
            case 4:
                return DependencyHolder.class;
            case 5:
                return PreloadedVastData.class;
            case 6:
                return HyprMXProperties.class;
            case 7:
            case '\b':
                return HyprMXWebViewWithClosableNavBar.class;
            case '\t':
            case '\n':
                return HyprMXNoOffersActivity.class;
            case 11:
            case '\f':
                return HyprMXOfferViewerActivity.class;
            case '\r':
            case 14:
                return HyprMXRequiredInformationActivity.class;
            case 15:
                return HyprMXBaseViewController.class;
            case 16:
                return HyprMXVastViewController.class;
            case 17:
                return HyprMXWebTrafficViewController.class;
            case 18:
                return OfferCacheEntity.class;
            case 19:
                return WebTrafficObject.class;
            case 20:
                return WebTrafficObject.WebTrafficURL.class;
            case 21:
                return HyprMXLearnMoreController.class;
            case 22:
                return HyprMXMraidViewController.class;
            case 23:
                return HyprMXOfferWebViewController.class;
            case 24:
                return HyprMXWebView.class;
            case 25:
                return HyprMXWebViewClient.class;
            case 26:
                return OfferViewerHandler.class;
            case 27:
                return OfferViewerHandler.OfferViewerHandlerListener.class;
            case 28:
                return HyprMXSkipController.class;
            case 29:
                return HyprMXSkipController.Listener.class;
            case 30:
            case 31:
                return HyprMXBrowserActivity.class;
            default:
                return null;
        }
    }
}
