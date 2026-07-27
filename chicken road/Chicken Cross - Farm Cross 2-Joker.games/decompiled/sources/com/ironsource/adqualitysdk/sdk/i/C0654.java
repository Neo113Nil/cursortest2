package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.HashMap;
import jp.maio.sdk.android.AdFullscreenActivity;
import jp.maio.sdk.android.HtmlBasedAdActivity;
import jp.maio.sdk.android.MaioAds;
import jp.maio.sdk.android.MaioAdsInstance;
import jp.maio.sdk.android.MaioAdsListener;
import jp.maio.sdk.android.MaioAdsListenerInterface;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ܢ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0654 extends AbstractC0557 {

    /* renamed from: סּ, reason: contains not printable characters */
    public static final String f1800 = StringFog.decrypt("2uXDpRzTx2PN8/uBDs7NTMzy\n", "qYC36H26qCI=\n");

    /* renamed from: טּ, reason: contains not printable characters */
    public static final String f1799 = StringFog.decrypt("DWSjIRybzg==\n", "QAXKTl3/vbU=\n");

    /* renamed from: ﬤ, reason: contains not printable characters */
    public static final String f1798 = StringFog.decrypt("5an/zpsZ5C3Gu+LAtB7y\n", "qMiWodp9l2Q=\n");

    /* renamed from: 爫, reason: contains not printable characters */
    public static final String f1797 = StringFog.decrypt("lNUENeF/kKCwxxk/zn6R\n", "2bRtWqAb4+w=\n");

    /* renamed from: 乁, reason: contains not printable characters */
    public static final String f1796 = StringFog.decrypt("REjgY4eytp1gWv1pqLO3mGdd7H6gt6a0\n", "CSmJDMbWxdE=\n");

    /* renamed from: 丫, reason: contains not printable characters */
    public static final String f1795 = StringFog.decrypt("i1wFJMYixfG4XSY/6y3C+7xRNyg=\n", "yjhDUapOtpI=\n");

    /* renamed from: ヶ, reason: contains not printable characters */
    public static final String f1794 = StringFog.decrypt("BsT5b/tb2Ewf0Lws+1zTEAPdsyzbVvEXANikYehX0gwt16Nr7FvDGw==\n", "bLTXApoyt2I=\n");

    /* renamed from: ヮ, reason: contains not printable characters */
    public static final String f1793 = StringFog.decrypt("2sAaTfOYS1z29RNg0o1RT/vADg==\n", "krR3IbH5ODk=\n");

    /* renamed from: リ, reason: contains not printable characters */
    public static final String f1792 = StringFog.decrypt("Cw0YyrgygvESGV2JuDWJrQ4UUomRL4CzIxxFwr0aiZ4CCV/RsC+U\n", "YX02p9lb7d8=\n");

    public C0654(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0557
    /* renamed from: ﻛ */
    public final String mo5368() {
        return MaioAds.getSdkVersion();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0557
    /* renamed from: ﾇ */
    public final HashMap mo5369() {
        HashMap hashMap = new HashMap();
        hashMap.put(f1800, new C0723(this));
        return hashMap;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0557
    /* renamed from: ﾒ */
    public final Class mo5370(String str) {
        char c;
        switch (str.hashCode()) {
            case -1799290762:
                if (str.equals(f1799)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1455130644:
                if (str.equals(f1794)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1303622385:
                if (str.equals(f1796)) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -1069735125:
                if (str.equals(f1798)) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -278703286:
                if (str.equals(f1797)) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 357386522:
                if (str.equals(f1793)) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1819361677:
                if (str.equals(f1795)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1914325723:
                if (str.equals(f1792)) {
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
                return MaioAds.class;
            case 1:
            case 2:
                return AdFullscreenActivity.class;
            case 3:
            case 4:
                return HtmlBasedAdActivity.class;
            case 5:
                return MaioAdsInstance.class;
            case 6:
                return MaioAdsListener.class;
            case 7:
                return MaioAdsListenerInterface.class;
            default:
                return null;
        }
    }
}
