package com.ironsource.adqualitysdk.sdk.i;

import com.amazon.aps.ads.Aps;
import com.amazon.aps.ads.ApsAd;
import com.amazon.aps.ads.ApsAdController;
import com.amazon.aps.ads.ApsAdRequest;
import com.amazon.aps.ads.ApsAdView;
import com.amazon.aps.ads.activity.ApsAdActivity;
import com.amazon.aps.ads.activity.ApsInterstitialActivity;
import com.amazon.aps.ads.listeners.ApsAdListener;
import com.amazon.aps.ads.listeners.ApsAdRequestListener;
import com.amazon.aps.ads.model.ApsAdFormat;
import com.amazon.aps.ads.model.ApsAdType;
import com.amazon.device.ads.AdRegistration;
import com.amazon.device.ads.DTBActivity;
import com.amazon.device.ads.DTBAdActivity;
import com.amazon.device.ads.DTBAdBannerListener;
import com.amazon.device.ads.DTBAdBaseBannerListener;
import com.amazon.device.ads.DTBAdBaseInterstitialListener;
import com.amazon.device.ads.DTBAdCallback;
import com.amazon.device.ads.DTBAdExpandedListener;
import com.amazon.device.ads.DTBAdInterstitial;
import com.amazon.device.ads.DTBAdInterstitialListener;
import com.amazon.device.ads.DTBAdListener;
import com.amazon.device.ads.DTBAdLoader;
import com.amazon.device.ads.DTBAdRequest;
import com.amazon.device.ads.DTBAdResponse;
import com.amazon.device.ads.DTBAdSize;
import com.amazon.device.ads.DTBAdView;
import com.amazon.device.ads.DTBAdViewSupportClient;
import com.amazon.device.ads.DTBFetchFactory;
import com.amazon.device.ads.DTBFetchManager;
import com.amazon.device.ads.DTBInterstitialActivity;
import com.amazon.device.ads.DTBRenderer;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.text.Typography;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ｌ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1267 extends AbstractC0557 {

    /* renamed from: סּ, reason: contains not printable characters */
    public static final String f3640 = StringFog.decrypt("onxvVZ0OFsG8\n", "xRkbFO1+XaQ=\n");

    /* renamed from: טּ, reason: contains not printable characters */
    public static final String f3639 = StringFog.decrypt("fQTd8SEdIGFcAMrDKxs6QHQS3dYqCiY=\n", "GmGpt0RpQwk=\n");

    /* renamed from: ﬤ, reason: contains not printable characters */
    public static final String f3638 = StringFog.decrypt("mDMvAd2/jtaPOTUz3K+CwbYy\n", "/1ZbQLnt66U=\n");

    /* renamed from: 爫, reason: contains not printable characters */
    public static final String f3637 = StringFog.decrypt("+00Hk8QV+8PsRx2hxQ7zwO5NAKHJKPDl7kQ=\n", "nChz0qBHnrA=\n");

    /* renamed from: 乁, reason: contains not printable characters */
    public static final String f3636 = StringFog.decrypt("dsvQhQdEs6lhwcq3BkSztHXL1q0NcZu7YQ==\n", "Ea6kxGMW1to=\n");

    /* renamed from: 丫, reason: contains not printable characters */
    public static final String f3635 = StringFog.decrypt("fBxYfSz/EXRrFkJPLf8RaX8cXlUmyjZydR1AWQ==\n", "G3ksPEitdAc=\n");

    /* renamed from: ヶ, reason: contains not printable characters */
    public static final String f3634 = StringFog.decrypt("Pz2RGrJSduE0LLM3s1F41TwrtzumQXLnLBuQLaNbesQ5KoQzpA==\n", "WFjlXtc0F5Q=\n");

    /* renamed from: ヮ, reason: contains not printable characters */
    public static final String f3633 = StringFog.decrypt("15aBl6oqB2vAnJulqzkGaw==\n", "sPP11s54Yhg=\n");

    /* renamed from: リ, reason: contains not printable characters */
    public static final String f3632 = StringFog.decrypt("07mbJqNuKJjEs4EUomw/gte5vwiuUjk=\n", "tNzvZ8c8Tes=\n");

    /* renamed from: ト, reason: contains not printable characters */
    public static final String f3631 = StringFog.decrypt("oC2Mjtda4JGiG5Sgx1zcooM=\n", "x0j4z7MJies=\n");

    /* renamed from: ゥ, reason: contains not printable characters */
    public static final String f3630 = StringFog.decrypt("ZXovQVeT7DBnXj9USrDg\n", "Ah9bADPAhUo=\n");

    /* renamed from: へ, reason: contains not printable characters */
    public static final String f3629 = StringFog.decrypt("qI4HytssOF6quwbp7BolUKaFFPg=\n", "z+tzi79/USQ=\n");

    /* renamed from: っ, reason: contains not printable characters */
    public static final String f3628 = StringFog.decrypt("SPRR3GikvHto6WTdSb6yd1XucdR6qQ==\n", "IYcQuDvNxh4=\n");

    /* renamed from: く, reason: contains not printable characters */
    public static final String f3627 = StringFog.decrypt("UGlV0q3bWgR1fkTQsfhvJUd0QsqU32AnVH5C/rjO\n", "Mxsws9m+DkY=\n");

    /* renamed from: Ↄ, reason: contains not printable characters */
    public static final String f3626 = StringFog.decrypt("oZLtUonDenyHmO1QiNJBTJGF+kWUxUs=\n", "wuCIM/2mLj4=\n");

    /* renamed from: Ⅽ, reason: contains not printable characters */
    public static final String f3625 = StringFog.decrypt("jtt4dVMsglmZ0WJHUj2VT4jKZUJSN4M=\n", "6b4MNDd+5yo=\n");

    /* renamed from: K, reason: contains not printable characters */
    public static final String f3624 = StringFog.decrypt("ZR6BOaM5jgxWG6c1qz4=\n", "JHrTXMRQ/Xg=\n");

    /* renamed from: Ύ, reason: contains not printable characters */
    public static final String f3623 = StringFog.decrypt("bHNky4Oj3G9BU18=\n", "KCcmiuDXtRk=\n");

    /* renamed from: Ὺ, reason: contains not printable characters */
    public static final String f3622 = StringFog.decrypt("JkcMeXU/FzkqRk8zcSQfICAGADNnfDIXB2kCI30kHzc8\n", "RShhVxRSdkM=\n");

    /* renamed from: Ῡ, reason: contains not printable characters */
    public static final String f3621 = StringFog.decrypt("K/3lDXU+I+wc3c4wcisq3wzdzjJyPj8=\n", "b6mnRBtKRp4=\n");

    /* renamed from: Ῠ, reason: contains not printable characters */
    public static final String f3620 = StringFog.decrypt("uGHzgA6bYS20YLDKCoBpNL4g/8oc2EQDmUfw2gqEcyOyevfPA7djI7J499oW\n", "2w6erm/2AFc=\n");

    /* renamed from: Ὑ, reason: contains not printable characters */
    public static final String f3619 = StringFog.decrypt("d2CzOJ2/NqhaQpgNgA==\n", "MzTxefn+Vdw=\n");

    /* renamed from: Ṿ, reason: contains not printable characters */
    public static final String f3618 = StringFog.decrypt("HDx94xLF4K8QPT6pFt7othp9cakAhsWBPRJ0jBDc6KMWJ2k=\n", "f1MQzXOogdU=\n");

    /* renamed from: Ḽ, reason: contains not printable characters */
    public static final String f3617 = StringFog.decrypt("ZLvZAa1kLwNFneg0oFkoFkw=\n", "IO+bQMktQXc=\n");

    /* renamed from: Ḹ, reason: contains not printable characters */
    public static final String f3616 = StringFog.decrypt("/qq6ukPGTM3em4o=\n", "uv74+yeKI6w=\n");

    /* renamed from: Ḟ, reason: contains not printable characters */
    public static final String f3615 = StringFog.decrypt("SOwS3+soayN53SPq\n", "DLhQno96DlI=\n");

    /* renamed from: ᵆ, reason: contains not printable characters */
    public static final String f3614 = StringFog.decrypt("HOslT5hDaswo0Al9mQ==\n", "WL9nDvwRD78=\n");

    /* renamed from: ᘥ, reason: contains not printable characters */
    public static final String f3613 = StringFog.decrypt("ZHG4kWGsOGBX\n", "ICX60AX6UQU=\n");

    /* renamed from: ᗀ, reason: contains not printable characters */
    public static final String f3612 = StringFog.decrypt("xAy8JykJTTnl\n", "gFj+Zk1aJEM=\n");

    /* renamed from: ᖺ, reason: contains not printable characters */
    public static final String f3611 = StringFog.decrypt("nV/VvSD9RlKRXpb3JOZOS5se2fcyvmN8vHHcxSj1UA==\n", "/jC4k0GQJyg=\n");

    /* renamed from: ᖸ, reason: contains not printable characters */
    public static final String f3610 = StringFog.decrypt("fRYqKSN3E2JOER0YN04Ic3ouAQ0pVQ==\n", "OUJoaEchegc=\n");

    /* renamed from: ᖭ, reason: contains not printable characters */
    public static final String f3609 = StringFog.decrypt("mlrNk2bc1UuYb+yhbNrP\n", "3g6P1QOotiM=\n");

    /* renamed from: ᖫ, reason: contains not printable characters */
    public static final String f3608 = StringFog.decrypt("O6bIwRjQTK8yk+TmGsFd\n", "f/KKh32kL8c=\n");

    /* renamed from: ᖩ, reason: contains not printable characters */
    public static final String f3607 = StringFog.decrypt("kp0nTkDcpjekrBc=\n", "1sllHCWywlI=\n");

    /* renamed from: ᖅ, reason: contains not printable characters */
    public static final String f3606 = StringFog.decrypt("jPu0F/O3ugymyoQa/oavB6bKhA==\n", "yK/2Vpf122I=\n");

    /* renamed from: ᕆ, reason: contains not printable characters */
    public static final String f3605 = StringFog.decrypt("VlGaPMuhASJ3R7kTwYYSHXt2rBjBhhI=\n", "EgXYfa/jYFE=\n");

    /* renamed from: ᕄ, reason: contains not printable characters */
    public static final String f3604 = StringFog.decrypt("riAkolWXU02PPQiXVKdBSoMAD4JdmVtNnhEIhkM=\n", "6nRm4zHVMj4=\n");

    /* renamed from: ᕃ, reason: contains not printable characters */
    public static final String f3603 = StringFog.decrypt("Wr+hJmv6G95yiYIEZA==\n", "HuvjZw+5erI=\n");

    /* renamed from: ᕂ, reason: contains not printable characters */
    public static final String f3602 = StringFog.decrypt("brn3kXt5M2lLg9G1e3Aial6I27Vt\n", "Ku210B88Sxk=\n");

    /* renamed from: ᔽ, reason: contains not printable characters */
    public static final String f3601 = StringFog.decrypt("0hdkpCMDWebzMVWRLj5e8/oPT5YzL1n35A==\n", "lkMm5UdKN5I=\n");

    /* renamed from: ᔺ, reason: contains not printable characters */
    public static final String f3600 = StringFog.decrypt("Szh1Xhn6Srl7CVl6Dw==\n", "D2w3H322I8o=\n");

    /* renamed from: ᔹ, reason: contains not printable characters */
    public static final String f3599 = StringFog.decrypt("id4gFfHzFs2v1AwH998Q2A==\n", "3ZxtdJ+Scag=\n");

    /* renamed from: ᔲ, reason: contains not printable characters */
    public static final String f3598 = StringFog.decrypt("aHTyMx37p/1TROQuCu676lk=\n", "PDa3S3iY0ok=\n");

    /* renamed from: ᔱ, reason: contains not printable characters */
    public static final String f3597 = StringFog.decrypt("SQ4jqCHKR+F7CjmVJt9O0msKOZcmyls=\n", "CH5Q4U++IpM=\n");

    /* renamed from: ᓮ, reason: contains not printable characters */
    public static final String f3596 = StringFog.decrypt("xZjLVNagy9nJmYgbx76EwsKEiBvUucPVz4PfVPa92erIg8MIxLnD18+WyjvUucPVz4Pf\n", "pvemerfNqqM=\n");

    /* renamed from: ᐱ, reason: contains not printable characters */
    public static final String f3595 = StringFog.decrypt("IKBQqw4HlF0IpkqeEw==\n", "YdAj6mpG9yk=\n");

    /* renamed from: Ꮭ, reason: contains not printable characters */
    public static final String f3594 = StringFog.decrypt("4AstpPCgmynsCm7r4b7UMucXbuvyuZMl6hA5pNC9iRLnJSP++LuTJ/o=\n", "g2RAipHN+lM=\n");

    /* renamed from: Ꮧ, reason: contains not printable characters */
    public static final String f3593 = StringFog.decrypt("D4b4/u82xHs5\n", "TvaLv4tgrR4=\n");

    /* renamed from: პ, reason: contains not printable characters */
    public static final String f3592 = StringFog.decrypt("TOw5\n", "DZxKpShGCFM=\n");

    /* renamed from: ე, reason: contains not printable characters */
    public static final String f3591 = StringFog.decrypt("Imt9ndM=\n", "YxsO3LdMee4=\n");

    /* renamed from: ງ, reason: contains not printable characters */
    public static final String f3590 = StringFog.decrypt("Ahh7W8zQVKQ3Gmd2xPZJ\n", "Q2gIGqiTO8o=\n");

    /* renamed from: อ, reason: contains not printable characters */
    public static final String f3589 = StringFog.decrypt("CeJSrLJfPlE890+IpA==\n", "SJIh7dYTVyI=\n");

    /* renamed from: ม, reason: contains not printable characters */
    public static final String f3588 = StringFog.decrypt("ZYPxSvsJjKVRlvF/0zKaoEGd53k=\n", "JPOCC59b6dQ=\n");

    /* renamed from: น, reason: contains not printable characters */
    public static final String f3587 = StringFog.decrypt("yoJXrsmGNNvmk1A=\n", "i/Ik763AW6k=\n");

    /* renamed from: ต, reason: contains not printable characters */
    public static final String f3586 = StringFog.decrypt("KA0kbPfTvmEM\n", "aX1XLZOHxxE=\n");

    /* renamed from: ฑ, reason: contains not printable characters */
    public static final String f3585 = StringFog.decrypt("D3rFabAuSJc7b8Vc\n", "Tgq2KNR8LeY=\n");

    /* renamed from: ঢ়, reason: contains not printable characters */
    public static final String f3584 = StringFog.decrypt("3eYnCnZ9zUfo5iI+Y334\n", "uoNTSwYOjCM=\n");

    /* renamed from: ষ, reason: contains not printable characters */
    public static final String f3583 = StringFog.decrypt("+FblnqChFif5XA==\n", "nzOR3MnFX0k=\n");

    /* renamed from: ঘ, reason: contains not printable characters */
    public static final String f3582 = StringFog.decrypt("mF5s2zvakECvVHHlPQ==\n", "/zsYi0mz8yU=\n");

    /* renamed from: খ, reason: contains not printable characters */
    public static final String f3581 = StringFog.decrypt("mbEhZ1XKvtSLvTE=\n", "/tRVNDmlyoE=\n");

    /* renamed from: এ, reason: contains not printable characters */
    public static final String f3580 = StringFog.decrypt("vDCLHX7KXxGdOo0xb80=\n", "21X/XA65HnU=\n");

    /* renamed from: ऱ, reason: contains not printable characters */
    public static final String f3579 = StringFog.decrypt("4SoPZU4k913iKgk=\n", "hk97JCpomDw=\n");

    /* renamed from: ܟ, reason: contains not printable characters */
    public static final String f3578 = StringFog.decrypt("3j7MvvkisXrO\n", "uVu4/5102B8=\n");

    public C1267(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0557
    /* renamed from: ﻛ */
    public final String mo5368() {
        Matcher matcher = Pattern.compile(StringFog.decrypt("wtQzXbQvzY6x1TdbxQ==\n", "7P4ede9zqaA=\n")).matcher(AdRegistration.getVersion());
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0557
    /* renamed from: ﾇ */
    public final HashMap mo5369() {
        HashMap hashMap = new HashMap();
        hashMap.put(f3640, new C0349(this));
        hashMap.put(f3639, new C1297(this));
        hashMap.put(f3638, new C1295(this));
        hashMap.put(f3625, new C1292(this));
        hashMap.put(f3637, new C1291(this));
        hashMap.put(f3636, new C1290(this));
        hashMap.put(f3635, new C1288(this));
        hashMap.put(f3634, new C1275(this));
        hashMap.put(f3633, new C1270(this));
        hashMap.put(f3632, new C0468(this));
        hashMap.put(f3631, new C0467(this));
        hashMap.put(f3630, new C0463(this));
        hashMap.put(f3629, new C0419(this));
        hashMap.put(f3628, new C0387(this));
        hashMap.put(f3627, new C0385(this));
        hashMap.put(f3626, new C0362(this));
        hashMap.put(f3584, new C0361(this));
        hashMap.put(f3583, new C0354(this));
        hashMap.put(f3582, new C0353(this));
        hashMap.put(f3581, new C0347(this));
        hashMap.put(f3580, new C0336(this));
        hashMap.put(f3579, new C1311(this));
        hashMap.put(f3578, new C1304(this));
        return hashMap;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0557
    /* renamed from: ﾒ */
    public final String mo5371() {
        return AdRegistration.getVersion();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0557
    /* renamed from: ﾒ */
    public final Class mo5370(String str) {
        char c;
        switch (str.hashCode()) {
            case -2137858584:
                if (str.equals(f3616)) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -2133119933:
                if (str.equals(f3590)) {
                    c = '\"';
                    break;
                }
                c = 65535;
                break;
            case -1987686071:
                if (str.equals(f3600)) {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            case -1885106463:
                if (str.equals(f3623)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1879113962:
                if (str.equals(f3612)) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case -1879025222:
                if (str.equals(f3613)) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case -1554728876:
                if (str.equals(f3620)) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1464660218:
                if (str.equals(f3604)) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case -1358954558:
                if (str.equals(f3609)) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case -1293925587:
                if (str.equals(f3621)) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1291566264:
                if (str.equals(f3585)) {
                    c = '\'';
                    break;
                }
                c = 65535;
                break;
            case -1092884085:
                if (str.equals(f3618)) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -1090060454:
                if (str.equals(f3615)) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case -832298225:
                if (str.equals(f3599)) {
                    c = 25;
                    break;
                }
                c = 65535;
                break;
            case -791598050:
                if (str.equals(f3587)) {
                    c = '%';
                    break;
                }
                c = 65535;
                break;
            case -723985259:
                if (str.equals(f3607)) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case -696695160:
                if (str.equals(f3622)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -694845532:
                if (str.equals(f3619)) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -466918522:
                if (str.equals(f3605)) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case -341719851:
                if (str.equals(f3606)) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case -300800492:
                if (str.equals(f3598)) {
                    c = 26;
                    break;
                }
                c = 65535;
                break;
            case -197992833:
                if (str.equals(f3597)) {
                    c = 27;
                    break;
                }
                c = 65535;
                break;
            case -27446238:
                if (str.equals(f3602)) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case 66052:
                if (str.equals(f3592)) {
                    c = ' ';
                    break;
                }
                c = 65535;
                break;
            case 63478087:
                if (str.equals(f3591)) {
                    c = '!';
                    break;
                }
                c = 65535;
                break;
            case 355568411:
                if (str.equals(f3589)) {
                    c = '#';
                    break;
                }
                c = 65535;
                break;
            case 568188517:
                if (str.equals(f3608)) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 620798166:
                if (str.equals(f3614)) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 788901082:
                if (str.equals(f3603)) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case 1036908700:
                if (str.equals(f3624)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 1251356764:
                if (str.equals(f3594)) {
                    c = 30;
                    break;
                }
                c = 65535;
                break;
            case 1306698049:
                if (str.equals(f3617)) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 1328085269:
                if (str.equals(f3601)) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case 1340383521:
                if (str.equals(f3586)) {
                    c = Typography.amp;
                    break;
                }
                c = 65535;
                break;
            case 1340427404:
                if (str.equals(f3593)) {
                    c = 31;
                    break;
                }
                c = 65535;
                break;
            case 1600627740:
                if (str.equals(f3588)) {
                    c = Typography.dollar;
                    break;
                }
                c = 65535;
                break;
            case 1648408950:
                if (str.equals(f3595)) {
                    c = 29;
                    break;
                }
                c = 65535;
                break;
            case 1713728997:
                if (str.equals(f3596)) {
                    c = 28;
                    break;
                }
                c = 65535;
                break;
            case 2019413793:
                if (str.equals(f3611)) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 2144664800:
                if (str.equals(f3610)) {
                    c = 14;
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
                return AdRegistration.class;
            case 1:
            case 2:
                return DTBActivity.class;
            case 3:
            case 4:
                return DTBInterstitialActivity.class;
            case 5:
            case 6:
                return DTBAdActivity.class;
            case 7:
                return DTBAdInterstitial.class;
            case '\b':
                return DTBAdLoader.class;
            case '\t':
                return DTBAdRequest.class;
            case '\n':
                return DTBAdResponse.class;
            case 11:
            case '\f':
                return DTBAdView.class;
            case '\r':
                return DTBAdSize.class;
            case 14:
                return DTBAdViewSupportClient.class;
            case 15:
                return DTBFetchFactory.class;
            case 16:
                return DTBFetchManager.class;
            case 17:
                return DTBRenderer.class;
            case 18:
                return DTBAdBannerListener.class;
            case 19:
                return DTBAdBaseBannerListener.class;
            case 20:
                return DTBAdBaseInterstitialListener.class;
            case 21:
                return DTBAdCallback.class;
            case 22:
                return DTBAdExpandedListener.class;
            case 23:
                return DTBAdInterstitialListener.class;
            case 24:
                return DTBAdListener.class;
            case 25:
                return C1268.class;
            case 26:
                return C1269.class;
            case 27:
            case 28:
                return ApsInterstitialActivity.class;
            case 29:
            case 30:
                return ApsAdActivity.class;
            case 31:
                return ApsAdView.class;
            case ' ':
                return Aps.class;
            case '!':
                return ApsAd.class;
            case '\"':
                return ApsAdController.class;
            case '#':
                return ApsAdListener.class;
            case '$':
                return ApsAdRequestListener.class;
            case '%':
                return ApsAdFormat.class;
            case '&':
                return ApsAdType.class;
            case '\'':
                return ApsAdRequest.class;
            default:
                return null;
        }
    }
}
