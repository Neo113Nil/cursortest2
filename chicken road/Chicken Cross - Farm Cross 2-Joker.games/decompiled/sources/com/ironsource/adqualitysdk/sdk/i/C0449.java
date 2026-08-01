package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import com.unity3d.ads.AdFormat;
import com.unity3d.ads.IUnityAdsListener;
import com.unity3d.ads.IUnityAdsShowListener;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.UnityAdsBaseOptions;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer;
import com.unity3d.ads.adplayer.FullScreenWebViewDisplay;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.mediation.IUnityAdsExtendedListener;
import com.unity3d.services.ads.adunit.AdUnitActivity;
import com.unity3d.services.banners.BannerErrorCode;
import com.unity3d.services.banners.BannerErrorInfo;
import com.unity3d.services.banners.BannerHide;
import com.unity3d.services.banners.BannerShow;
import com.unity3d.services.banners.BannerView;
import com.unity3d.services.banners.BannerViewCache;
import com.unity3d.services.banners.IUnityBannerListener;
import com.unity3d.services.banners.UnityBannerSize;
import com.unity3d.services.banners.UnityBanners;
import com.unity3d.services.banners.api.Banner;
import com.unity3d.services.banners.api.BannerListener;
import com.unity3d.services.banners.configuration.BannersModuleConfiguration;
import com.unity3d.services.banners.properties.BannerProperties;
import com.unity3d.services.banners.view.BannerEvent;
import com.unity3d.services.banners.view.BannerPosition;
import com.unity3d.services.banners.view.BannerWebPlayerContainer;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.request.WebRequest;
import com.unity3d.services.core.request.WebRequestEvent;
import com.unity3d.services.core.webview.WebView;
import com.unity3d.services.core.webview.WebViewApp;
import com.unity3d.services.core.webview.WebViewEventCategory;
import com.unity3d.services.monetization.UnityMonetization;
import com.unity3d.services.monetization.placementcontent.ads.ShowAdListenerAdapter;
import com.unity3d.services.monetization.placementcontent.core.CustomEvent;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import io.ktor.util.date.GMTDateParser;
import java.util.HashMap;
import kotlin.text.Typography;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ˌ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0449 extends AbstractC0557 {

    /* renamed from: סּ, reason: contains not printable characters */
    public static final String f831 = StringFog.decrypt("gZF+natGYSaIgF27vGJ6JpG1eq4=\n", "5vQK3t40E0M=\n");

    /* renamed from: טּ, reason: contains not printable characters */
    public static final String f830 = StringFog.decrypt("ECwfhL0xFnskOxizoDE1eAMu\n", "c1565clUQjk=\n");

    /* renamed from: ﬤ, reason: contains not printable characters */
    public static final String f829 = StringFog.decrypt("BefwXzQ9XLMY9tN5IxlHswHD9Gw=\n", "doKEHEFPLtY=\n");

    /* renamed from: 爫, reason: contains not printable characters */
    public static final String f828 = StringFog.decrypt("Dqwhb3IFHpcN\n", "aclVKBNoe94=\n");

    /* renamed from: 乁, reason: contains not printable characters */
    public static final String f827 = StringFog.decrypt("YtnzPn4lLdBE2PQneT8tzGvZ9Q==\n", "BbyHaxBMWak=\n");

    /* renamed from: 丫, reason: contains not printable characters */
    public static final String f826 = StringFog.decrypt("z5xl5rfkspH9nWL/sP6yjdKcYw==\n", "vPkRs9mNxug=\n");

    /* renamed from: ヶ, reason: contains not printable characters */
    public static final String f825 = StringFog.decrypt("ji+bMKLxnmCVPo8esOeHZ48+kzGx5g==\n", "/Er2X9SUyw4=\n");

    /* renamed from: ヮ, reason: contains not printable characters */
    public static final String f824 = StringFog.decrypt("pRI7tGaP6EeFEiytYZXoW6oTLQ==\n", "xHZf4QjmnD4=\n");

    /* renamed from: リ, reason: contains not printable characters */
    public static final String f823 = StringFog.decrypt("0NaVMKlWuKLSxKQRqVqaiNbHhACjRpc=\n", "t7PhZ8w07ss=\n");

    /* renamed from: ト, reason: contains not printable characters */
    public static final String f822 = StringFog.decrypt("t9TMsSBoo7ihxN2VMU+HuL7F\n", "0LG45kUK8d0=\n");

    /* renamed from: ゥ, reason: contains not printable characters */
    public static final String f821 = StringFog.decrypt("HwNE+Wr4rtkVA17dT/0=\n", "eGYwqQaZzbw=\n");

    /* renamed from: へ, reason: contains not printable characters */
    public static final String f820 = StringFog.decrypt("fHPZ7qRNIAhpWsTfsUYgCGk=\n", "GxatrMUjTm0=\n");

    /* renamed from: っ, reason: contains not printable characters */
    public static final String f819 = StringFog.decrypt("BH8Z3bXznLoFVgTsoPicugU=\n", "dxptn9Sd8t8=\n");

    /* renamed from: く, reason: contains not printable characters */
    public static final String f818 = StringFog.decrypt("saf1yeNKrjixp/XJ40quOA==\n", "5MmcvZoLyks=\n");

    /* renamed from: Ↄ, reason: contains not printable characters */
    public static final String f817 = StringFog.decrypt("CcN1Wwjds5gV+HJGBeWWjy/hdVwF+bmOLg==\n", "XK0cL3Gc1+s=\n");

    /* renamed from: Ⅽ, reason: contains not printable characters */
    public static final String f816 = StringFog.decrypt("JZuEFYRg0rE5oIMIiVj3pgOwlRWYT9KnFLmEEolE2KcC\n", "cPXtYf0htsI=\n");

    /* renamed from: K, reason: contains not printable characters */
    public static final String f815 = StringFog.decrypt("QnaqdNai/qdAfaFWxobtlWdo\n", "FxjDAK/jmtQ=\n");

    /* renamed from: Ύ, reason: contains not printable characters */
    public static final String f814 = StringFog.decrypt("Kfi9Jpu2tBIK+5oz\n", "fbrqQ/ng3Xc=\n");

    /* renamed from: Ὺ, reason: contains not printable characters */
    public static final String f813 = StringFog.decrypt("1pvYl0IVA+Pyiv+zQgoC\n", "gf66xSdkdoY=\n");

    /* renamed from: Ῡ, reason: contains not printable characters */
    public static final String f812 = StringFog.decrypt("BJxZouSQ8QslnFWAzpTyKzSWSY0=\n", "U/k79I31hk4=\n");

    /* renamed from: Ῠ, reason: contains not printable characters */
    public static final String f811 = StringFog.decrypt("DL2tEQbCbB48p60fHvtqHzc=\n", "WdPEZX+PA3A=\n");

    /* renamed from: Ὑ, reason: contains not printable characters */
    public static final String f810 = StringFog.decrypt("dDytIWBiSOhUIKc4RHRF5UYktjNT\n", "J1TCViEGBIE=\n");

    /* renamed from: Ṿ, reason: contains not printable characters */
    public static final String f809 = StringFog.decrypt("7MyIzHxnLLTK148=\n", "r7n7uBMKacI=\n");

    /* renamed from: Ḽ, reason: contains not printable characters */
    public static final String f808 = StringFog.decrypt("Q2Z/Oh+hSbNndw==\n", "FAMdaHrQPNY=\n");

    /* renamed from: Ḹ, reason: contains not printable characters */
    public static final String f807 = StringFog.decrypt("4eKLz0CVgJzj6YDtULGT\n", "tIziuznU5O8=\n");

    /* renamed from: Ḟ, reason: contains not printable characters */
    public static final String f806 = StringFog.decrypt("nVbPZ1Lj95moW+xgT+4=\n", "3DKaCTuXtvo=\n");

    /* renamed from: ᵆ, reason: contains not printable characters */
    public static final String f805 = StringFog.decrypt("pPK0OixT\n", "5pPaVEkhs5Q=\n");

    /* renamed from: ᘥ, reason: contains not printable characters */
    public static final String f804 = StringFog.decrypt("HyxLefGpCDIkJ1B+\n", "SkIiDYjraVw=\n");

    /* renamed from: ᗀ, reason: contains not printable characters */
    public static final String f803 = StringFog.decrypt("TpUnx3lrtNR1njzgaVOw\n", "G/tOswAp1bo=\n");

    /* renamed from: ᖺ, reason: contains not printable characters */
    public static final String f802 = StringFog.decrypt("JdqCbctkmTcIzA==\n", "Z7vsA64Wyl8=\n");

    /* renamed from: ᖸ, reason: contains not printable characters */
    public static final String f801 = StringFog.decrypt("KYbfn5HfO/oPgg==\n", "a+ex8fStc5M=\n");

    /* renamed from: ᖭ, reason: contains not printable characters */
    public static final String f800 = StringFog.decrypt("GVMvutpNy+M+XDU=\n", "WzJB1L8/jpU=\n");

    /* renamed from: ᖫ, reason: contains not printable characters */
    public static final String f799 = StringFog.decrypt("imKdejCRpPO7d5Z6MJE=\n", "yAPzFFXj6Jo=\n");

    /* renamed from: ᖩ, reason: contains not printable characters */
    public static final String f798 = StringFog.decrypt("FLyRp+RTXdM5uYql5GJB8DC0mLzzQFr3ObM=\n", "Vt3/yYEhLp4=\n");

    /* renamed from: ᖅ, reason: contains not printable characters */
    public static final String f797 = StringFog.decrypt("s6v2o6h0nBGeuv2/uW+pEA==\n", "8cqYzc0GzGM=\n");

    /* renamed from: ᕆ, reason: contains not printable characters */
    public static final String f796 = StringFog.decrypt("cw/TfQGAUjpCB8l6C5w=\n", "MW69E2TyAlU=\n");

    /* renamed from: ᕄ, reason: contains not printable characters */
    public static final String f795 = StringFog.decrypt("yfZ0hxHcvnXpx3aIDcubU+T5bogdwIxi\n", "i5ca6XSu6RA=\n");

    /* renamed from: ᕃ, reason: contains not printable characters */
    public static final String f794 = StringFog.decrypt("k+qMCHd8KVuj5JAlfWoJ\n", "0YviZhIObCk=\n");

    /* renamed from: ᕂ, reason: contains not printable characters */
    public static final String f793 = StringFog.decrypt("4+pqpiTgV0/T5HaBL/R9\n", "oYsEyEGSEj0=\n");

    /* renamed from: ᔽ, reason: contains not printable characters */
    public static final String f792 = StringFog.decrypt("hpMbd8eE30uhhQ==\n", "xPJ1GaL2iSI=\n");

    /* renamed from: ᔺ, reason: contains not printable characters */
    public static final String f791 = StringFog.decrypt("tjwnNGpUxr6sYC40bF/dvLwwL2kxWM6kuzY4aTF4zqS7NjhMdl/Y\n", "1VNKGh86r8o=\n");

    /* renamed from: ᔹ, reason: contains not printable characters */
    public static final String f790 = StringFog.decrypt("gqykoC4EBLaluoWiLw==\n", "wM3Kzkt2Ut8=\n");

    /* renamed from: ᔲ, reason: contains not printable characters */
    public static final String f789 = StringFog.decrypt("dHL4gKiS3YduLvGArpnGhX5+8N3zntWdeXjn3fOK3ZZgM9fPs5LRgUF08Nk=\n", "Fx2Vrt38tPM=\n");

    /* renamed from: ᔱ, reason: contains not printable characters */
    public static final String f788 = StringFog.decrypt("Gez49r/bpiM++tX5ucGV\n", "W42WmNqp8Eo=\n");

    /* renamed from: ᓮ, reason: contains not printable characters */
    public static final String f787 = StringFog.decrypt("lP/3Nha1GcSzxPwtLqUo0bjE/C0=\n", "3aqZX2LMW6U=\n");

    /* renamed from: ᐱ, reason: contains not printable characters */
    public static final String f786 = StringFog.decrypt("+WyE8qOaly/eeqPQr5u1I9VomA==\n", "uw3qnMbowUY=\n");

    /* renamed from: Ꮭ, reason: contains not printable characters */
    public static final String f785 = StringFog.decrypt("KZ8seAE1iq0OiQ5/FzO5qg6M\n", "a/5CFmRH3MQ=\n");

    /* renamed from: Ꮧ, reason: contains not printable characters */
    public static final String f784 = StringFog.decrypt("AM1gWNgU8Noj1ltRySHr2jH8ZUfbG+PG\n", "RrgMNKt3gr8=\n");

    /* renamed from: პ, reason: contains not printable characters */
    public static final String f783 = StringFog.decrypt("OjSVw+1MIoYgaJzD+UY43Dg/iIH5Wy6Adx2NgfRxKIA8Ppa6/UAdmzwsvITrUieTIA==\n", "WVv47ZgiS/I=\n");

    /* renamed from: ე, reason: contains not printable characters */
    public static final String f782 = StringFog.decrypt("LVxU/4HcO0I=\n", "bDgbneu5WDY=\n");

    /* renamed from: ງ, reason: contains not printable characters */
    public static final String f781 = StringFog.decrypt("kdEsOXMcv1Kl0yQ4fwe+cb7oLSlKHL5jkdsYJ30MvmY=\n", "0L9ISxx12xQ=\n");

    /* renamed from: อ, reason: contains not printable characters */
    public static final String f780 = StringFog.decrypt("UEGCP6y5PjhJQIovmoguImpBmA==\n", "BS/rS9X4Wks=\n");

    /* renamed from: ม, reason: contains not printable characters */
    public static final String f779 = StringFog.decrypt("Iwz3hsBA9Gc0A+2X9nHkfRkM7Q==\n", "dmKe8rkBkBQ=\n");

    /* renamed from: น, reason: contains not printable characters */
    public static final String f778 = StringFog.decrypt("yOThXdWKX+s=\n", "iYCnMqfnPp8=\n");

    /* renamed from: ต, reason: contains not printable characters */
    public static final String f777 = StringFog.decrypt("M+w4RHwbOMEf8DRTZgYNwA==\n", "cIBRIRJvaLM=\n");

    /* renamed from: ฑ, reason: contains not printable characters */
    public static final String f776 = StringFog.decrypt("0MJjvV00MQT9yEesVjU2\n", "lKsC2jNbQnA=\n");

    /* renamed from: ঢ়, reason: contains not printable characters */
    public static final String f775 = StringFog.decrypt("2E7bHPjs3AniSN0a+9n0HuV+2xD+\n", "kRu1dYyVnW0=\n");

    /* renamed from: ষ, reason: contains not printable characters */
    public static final String f774 = StringFog.decrypt("cs5nJevbSHVh3n0D79JuYw==\n", "FasTapurJwc=\n");

    /* renamed from: ঘ, reason: contains not printable characters */
    public static final String f773 = StringFog.decrypt("9cb1PoyN0AD/xu8aqYj1F/3OwAqvjtkA8dc=\n", "kqOBbuDss2U=\n");

    /* renamed from: খ, reason: contains not printable characters */
    public static final String f772 = StringFog.decrypt("QNVhKdbWTktXxHwK18Q=\n", "J7AVZbm3KgQ=\n");

    /* renamed from: এ, reason: contains not printable characters */
    public static final String f771 = StringFog.decrypt("LHLtTdVBvQ==\n", "SxeZCbQ13Pc=\n");

    /* renamed from: ऱ, reason: contains not printable characters */
    public static final String f770 = StringFog.decrypt("09jmy2uWi2jQ++DjZ7iCSNHT5tx4lJ5Exsn76Xk=\n", "tL2SjAr77iE=\n");

    /* renamed from: ܟ, reason: contains not printable characters */
    public static final String f769 = StringFog.decrypt("ogVFhtLPS6SoBV+i98pus6oNdb/fyUauthRYtfvYTa+x\n", "xWAx1r6uKME=\n");

    /* renamed from: ܘ, reason: contains not printable characters */
    public static final String f768 = StringFog.decrypt("IGGwbl278yYgUKVaWg==\n", "RwTEPSnJmkg=\n");

    /* renamed from: ے, reason: contains not printable characters */
    public static final String f767 = StringFog.decrypt("t5CqGvNI01O5m7ka7kLVVg==\n", "0PXeToEpsDg=\n");

    public C0449(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0557
    /* renamed from: ﻛ */
    public final String mo5368() {
        String version = UnityAds.getVersion();
        if (version != null) {
            return version.split(StringFog.decrypt("dg==\n", "W1muajsh+PM=\n"))[0];
        }
        return null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0557
    /* renamed from: ﾇ */
    public final HashMap mo5369() {
        HashMap hashMap = new HashMap();
        hashMap.put(f831, new C0968(this));
        hashMap.put(f830, new C0574(this));
        hashMap.put(f829, new C0558(this));
        hashMap.put(f828, new C0434(this));
        hashMap.put(f827, new C1318(this));
        hashMap.put(f826, new C1202(this));
        hashMap.put(f824, new C0752(this));
        hashMap.put(f825, new C0751(this));
        hashMap.put(f823, new C0601(this));
        hashMap.put(f822, new C0444(this));
        hashMap.put(f821, new C0443(this));
        hashMap.put(f820, new C0429(this));
        hashMap.put(f819, new C0428(this));
        hashMap.put(f774, new C1285(this));
        hashMap.put(f773, new C1208(this));
        hashMap.put(f772, new C1204(this));
        hashMap.put(f771, new C1073(this));
        hashMap.put(f770, new C0987(this));
        hashMap.put(f769, new C0974(this));
        hashMap.put(f768, new C0943(this));
        hashMap.put(f767, new C0609(this));
        return hashMap;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0557
    /* renamed from: ﾒ */
    public final Class mo5370(String str) {
        char c;
        switch (str.hashCode()) {
            case -2043984616:
                if (str.equals(f795)) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case -2015334886:
                if (str.equals(f778)) {
                    c = '(';
                    break;
                }
                c = 65535;
                break;
            case -1797664962:
                if (str.equals(f811)) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -1769924254:
                if (str.equals(f782)) {
                    c = Typography.dollar;
                    break;
                }
                c = 65535;
                break;
            case -1719935914:
                if (str.equals(f790)) {
                    c = ' ';
                    break;
                }
                c = 65535;
                break;
            case -1673897431:
                if (str.equals(f794)) {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            case -1673719574:
                if (str.equals(f793)) {
                    c = 25;
                    break;
                }
                c = 65535;
                break;
            case -1627944928:
                if (str.equals(f799)) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case -1543737546:
                if (str.equals(f818)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1347165098:
                if (str.equals(f814)) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1258512514:
                if (str.equals(f777)) {
                    c = ')';
                    break;
                }
                c = 65535;
                break;
            case -1251710408:
                if (str.equals(f789)) {
                    c = '!';
                    break;
                }
                c = 65535;
                break;
            case -858834302:
                if (str.equals(f803)) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case -800280637:
                if (str.equals(f798)) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case -618035586:
                if (str.equals(f807)) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case -598903877:
                if (str.equals(f810)) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -553681069:
                if (str.equals(f781)) {
                    c = '%';
                    break;
                }
                c = 65535;
                break;
            case -327500225:
                if (str.equals(f812)) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -324825325:
                if (str.equals(f776)) {
                    c = GMTDateParser.ANY;
                    break;
                }
                c = 65535;
                break;
            case -324012869:
                if (str.equals(f808)) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case -262912338:
                if (str.equals(f800)) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case -249507173:
                if (str.equals(f783)) {
                    c = '#';
                    break;
                }
                c = 65535;
                break;
            case -133620343:
                if (str.equals(f809)) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case -30759555:
                if (str.equals(f817)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 29694293:
                if (str.equals(f775)) {
                    c = '+';
                    break;
                }
                c = 65535;
                break;
            case 67119908:
                if (str.equals(f784)) {
                    c = '\"';
                    break;
                }
                c = 65535;
                break;
            case 252148886:
                if (str.equals(f806)) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 539301490:
                if (str.equals(f779)) {
                    c = '\'';
                    break;
                }
                c = 65535;
                break;
            case 626721475:
                if (str.equals(f815)) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 692588017:
                if (str.equals(f788)) {
                    c = 28;
                    break;
                }
                c = 65535;
                break;
            case 819533772:
                if (str.equals(f787)) {
                    c = 29;
                    break;
                }
                c = 65535;
                break;
            case 961427118:
                if (str.equals(f801)) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 961754217:
                if (str.equals(f802)) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 961844241:
                if (str.equals(f792)) {
                    c = 26;
                    break;
                }
                c = 65535;
                break;
            case 1067215379:
                if (str.equals(f791)) {
                    c = 27;
                    break;
                }
                c = 65535;
                break;
            case 1246120607:
                if (str.equals(f813)) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 1326268204:
                if (str.equals(f786)) {
                    c = 30;
                    break;
                }
                c = 65535;
                break;
            case 1374920114:
                if (str.equals(f804)) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case 1407526303:
                if (str.equals(f797)) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case 1646468069:
                if (str.equals(f785)) {
                    c = 31;
                    break;
                }
                c = 65535;
                break;
            case 1658279126:
                if (str.equals(f816)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1982491468:
                if (str.equals(f805)) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 2020034237:
                if (str.equals(f780)) {
                    c = Typography.amp;
                    break;
                }
                c = 65535;
                break;
            case 2068667541:
                if (str.equals(f796)) {
                    c = 22;
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
                return UnityAds.class;
            case 1:
                return IUnityAdsListener.class;
            case 2:
                return IUnityAdsExtendedListener.class;
            case 3:
                return WebViewApp.class;
            case 4:
                return C0454.class;
            case 5:
                return WebRequestEvent.class;
            case 6:
                return WebViewEventCategory.class;
            case 7:
                return UnityMonetization.class;
            case '\b':
                return ShowAdListenerAdapter.class;
            case '\t':
                return CustomEvent.class;
            case '\n':
                return WebView.class;
            case 11:
                return WebRequest.class;
            case '\f':
                return AdUnitActivity.class;
            case '\r':
                return Banner.class;
            case 14:
                return UnityBanners.class;
            case 15:
                return UnityBannerSize.class;
            case 16:
                return BannerShow.class;
            case 17:
                return BannerHide.class;
            case 18:
                return BannerEvent.class;
            case 19:
                return BannerListener.class;
            case 20:
                return BannersModuleConfiguration.class;
            case 21:
                return BannerProperties.class;
            case 22:
                return BannerPosition.class;
            case 23:
                return BannerWebPlayerContainer.class;
            case 24:
                return BannerErrorCode.class;
            case 25:
                return BannerErrorInfo.class;
            case 26:
            case 27:
                return BannerView.class;
            case 28:
                return BannerViewCache.class;
            case 29:
                return IUnityBannerListener.class;
            case 30:
                return BannerView.IListener.class;
            case 31:
                return BannerView.Listener.class;
            case ' ':
            case '!':
                return com.unity3d.services.banners.view.BannerView.class;
            case '\"':
            case '#':
                return FullScreenWebViewDisplay.class;
            case '$':
                return AdObject.class;
            case '%':
                return AndroidFullscreenWebViewAdPlayer.class;
            case '&':
                return UnityAdsLoadOptions.class;
            case '\'':
                return UnityAdsBaseOptions.class;
            case '(':
                return AdFormat.class;
            case ')':
                return ClientProperties.class;
            case '*':
                return DiagnosticEventRequestOuterClass.DiagnosticEvent.class;
            case '+':
                return IUnityAdsShowListener.class;
            default:
                return null;
        }
    }
}
