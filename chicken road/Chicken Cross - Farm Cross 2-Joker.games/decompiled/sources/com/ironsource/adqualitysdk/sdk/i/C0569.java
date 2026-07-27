package com.ironsource.adqualitysdk.sdk.i;

import com.inmobi.ads.AdContainer;
import com.inmobi.ads.AdUnit;
import com.inmobi.ads.InMobiAdRequest;
import com.inmobi.ads.InMobiBanner;
import com.inmobi.ads.InMobiInterstitial;
import com.inmobi.ads.NativeRecyclerViewAdapter;
import com.inmobi.ads.NativeVideoView;
import com.inmobi.ads.ViewableAd;
import com.inmobi.ads.listeners.BannerAdEventListener;
import com.inmobi.ads.listeners.InterstitialAdEventListener;
import com.inmobi.ads.listeners.NativeAdEventListener;
import com.inmobi.ads.listeners.VideoEventListener;
import com.inmobi.media.ads.network.common.model.Ad;
import com.inmobi.media.ads.network.common.model.AdResponse;
import com.inmobi.media.ads.network.common.model.AdSet;
import com.inmobi.media.ads.network.common.model.ContextData;
import com.inmobi.rendering.InMobiAdActivity;
import com.inmobi.sdk.InMobiSdk;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.HashMap;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ה, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0569 extends AbstractC0557 {

    /* renamed from: סּ, reason: contains not printable characters */
    public static final String f1322 = StringFog.decrypt("nnaF1POJEYWUdp/wy5EChbx9hOk=\n", "+RPxhJ/ocuA=\n");

    /* renamed from: טּ, reason: contains not printable characters */
    public static final String f1321 = StringFog.decrypt("ij9360sYPsiGL3P+ViU6/4Mvbg==\n", "7VoDqi9VX7o=\n");

    /* renamed from: ﬤ, reason: contains not printable characters */
    public static final String f1320 = StringFog.decrypt("mnnHKeQtNpiSeNYB\n", "/RyzbYVZV9U=\n");

    /* renamed from: 爫, reason: contains not printable characters */
    public static final String f1319 = StringFog.decrypt("xlpf6Yy0crXAS0LejaN5oMQ=\n", "oT8rqOj3ANA=\n");

    /* renamed from: 乁, reason: contains not printable characters */
    public static final String f1318 = StringFog.decrypt("mQGFjd+9VjKRDLyLy71jLw==\n", "0G/I4r3UF1Y=\n");

    /* renamed from: 丫, reason: contains not printable characters */
    public static final String f1317 = StringFog.decrypt("R+qWav+cRpVG7NU285xPn1bslSO4u0W3S+eSBfKzSI5N85Iw7w==\n", "JIX7RJbyK/o=\n");

    /* renamed from: ヶ, reason: contains not printable characters */
    public static final String f1316 = StringFog.decrypt("2SQuLy0gyKnRKRcpOSD9tMZy\n", "kEpjQE9Jic0=\n");

    /* renamed from: ヮ, reason: contains not printable characters */
    public static final String f1315 = StringFog.decrypt("syeKRK+3XsGyIckLoqod3LUmgw+0sF3J/gGJJ6m7Wu+0CYQer69a2qk=\n", "0EjnasbZM64=\n");

    /* renamed from: リ, reason: contains not printable characters */
    public static final String f1314 = StringFog.decrypt("VtWB7T/P5wF80ZrSIM/G\n", "GLT1hEmqsWg=\n");

    /* renamed from: ト, reason: contains not printable characters */
    public static final String f1313 = StringFog.decrypt("xv44HoGeV9jT4wUa\n", "h5p1f/P1Iqg=\n");

    /* renamed from: ゥ, reason: contains not printable characters */
    public static final String f1312 = StringFog.decrypt("MhJrAhALDOgdE1o=\n", "c3YobX5/bYE=\n");

    /* renamed from: へ, reason: contains not printable characters */
    public static final String f1311 = StringFog.decrypt("62tDsvAw1TjeXl+55SfOItBrXg==\n", "uQ4t1pVCvFY=\n");

    /* renamed from: っ, reason: contains not printable characters */
    public static final String f1310 = StringFog.decrypt("CBXyo42wr2IsLeqwjQ==\n", "WHmTwOjdygw=\n");

    /* renamed from: く, reason: contains not printable characters */
    public static final String f1309 = StringFog.decrypt("Czkp4QeB3vQr\n", "Tk9Mj3PVp4Q=\n");

    /* renamed from: Ↄ, reason: contains not printable characters */
    public static final String f1308 = StringFog.decrypt("ObX920Rulh0etdXG\n", "cNuwtCYH1Hw=\n");

    /* renamed from: Ⅽ, reason: contains not printable characters */
    public static final String f1307 = StringFog.decrypt("L6CYY+XDZZoot5Nj9P1NjRmkmGjy\n", "bcH2DYCxJP4=\n");

    /* renamed from: K, reason: contains not printable characters */
    public static final String f1306 = StringFog.decrypt("wNvmMY2LIj790Nktm4sfOejZ\n", "ibWrXu/ia1A=\n");

    /* renamed from: Ύ, reason: contains not printable characters */
    public static final String f1305 = StringFog.decrypt("aTT1N8fqd0NUM+A+9P1GXEU09R7c6ndPTj/z\n", "IFqBUrWZAyo=\n");

    /* renamed from: Ὺ, reason: contains not printable characters */
    public static final String f1304 = StringFog.decrypt("PREzJFs3TF82BiIjWR5kSAcVKShf\n", "c3BHTS1SDTs=\n");

    /* renamed from: Ῡ, reason: contains not printable characters */
    public static final String f1303 = StringFog.decrypt("N6IfbCOWa0MPvzdgP6d4SAS5\n", "Yct7CUzTHSY=\n");

    /* renamed from: Ῠ, reason: contains not printable characters */
    public static final String f1302 = StringFog.decrypt("GnsBi1nn6C04\n", "UxVM5DuOu0k=\n");

    /* renamed from: Ὑ, reason: contains not printable characters */
    public static final String f1301 = StringFog.decrypt("MuNIOrM2IZkp6HQgtCwU\n", "e40FVdFfYP0=\n");

    /* renamed from: Ṿ, reason: contains not printable characters */
    public static final String f1300 = StringFog.decrypt("XkfibghDeFlJSg==\n", "CC6HGWkhFDw=\n");

    /* renamed from: Ḽ, reason: contains not printable characters */
    public static final String f1299 = StringFog.decrypt("aGq2PFXl\n", "KQ7jUjyRPH4=\n");

    /* renamed from: Ḹ, reason: contains not printable characters */
    public static final String f1298 = StringFog.decrypt("abMpg/VtCcdEqz6G5noNy0KlHI7ieC/HVQ==\n", "J9Jd6oMIW6I=\n");

    /* renamed from: Ḟ, reason: contains not printable characters */
    public static final String f1297 = StringFog.decrypt("BcsyDk5CAJ0Pyygqa0c=\n", "Yq5GXiIjY/g=\n");

    /* renamed from: ᵆ, reason: contains not printable characters */
    public static final String f1296 = StringFog.decrypt("+cTGXCZpgtft\n", "nqGyHUI656M=\n");

    /* renamed from: ᘥ, reason: contains not printable characters */
    public static final String f1295 = StringFog.decrypt("8qgB6srDjBv+vw==\n", "m9tTj72i/n8=\n");

    /* renamed from: ᗀ, reason: contains not printable characters */
    public static final String f1294 = StringFog.decrypt("JzhQb8Tf\n", "QF0kLqCsIko=\n");

    /* renamed from: ᖺ, reason: contains not printable characters */
    public static final String f1293 = StringFog.decrypt("5pATfLTqMH75gSNer+U=\n", "gfVnP9uERBs=\n");

    /* renamed from: ᖸ, reason: contains not printable characters */
    public static final String f1292 = StringFog.decrypt("eEBTHswC6dh7Vg==\n", "HyUnTKl1iKo=\n");

    /* renamed from: ᖭ, reason: contains not printable characters */
    public static final String f1291 = StringFog.decrypt("tn0yqXgEg+CibA==\n", "0RhG/h1m1YE=\n");

    /* renamed from: ᖫ, reason: contains not printable characters */
    public static final String f1290 = StringFog.decrypt("2svIZQ1mtVLU2NlvGw==\n", "va68Jn8D1CY=\n");

    /* renamed from: ᖩ, reason: contains not printable characters */
    public static final String f1289 = StringFog.decrypt("dbeAoPN1HmFmu4eE80AUfWa3mpU=\n", "EtL04ZcDexM=\n");

    /* renamed from: ᖅ, reason: contains not printable characters */
    public static final String f1288 = StringFog.decrypt("uNXxDyrC/WuK1A==\n", "+bGjalmykgU=\n");

    /* renamed from: ᕆ, reason: contains not printable characters */
    public static final String f1287 = StringFog.decrypt("AlUc7uA=\n", "QzFPi5R1GE0=\n");

    /* renamed from: ᕄ, reason: contains not printable characters */
    public static final String f1286 = StringFog.decrypt("qTE=\n", "6FVsBJ8L8+M=\n");

    /* renamed from: ᕃ, reason: contains not printable characters */
    public static final String f1285 = StringFog.decrypt("/JWdurKwnyrejpI=\n", "v/rzztfI624=\n");

    public C0569(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0557
    /* renamed from: ﻛ */
    public final String mo5368() {
        return InMobiSdk.getVersion();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0557
    /* renamed from: ﾇ */
    public final HashMap mo5369() {
        HashMap hashMap = new HashMap();
        hashMap.put(f1322, new C0729(this));
        hashMap.put(f1321, new C0715(this));
        hashMap.put(f1320, new C0704(this));
        hashMap.put(f1319, new C0673(this));
        hashMap.put(f1297, new C0655(this));
        hashMap.put(f1296, new C0634(this));
        hashMap.put(f1295, new C0631(this));
        hashMap.put(f1294, new C0608(this));
        hashMap.put(f1293, new C0607(this));
        hashMap.put(f1292, new C0784(this));
        hashMap.put(f1291, new C0740(this));
        hashMap.put(f1290, new C0735(this));
        hashMap.put(f1289, new C0731(this));
        return hashMap;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0557
    /* renamed from: ﾒ */
    public final Class mo5370(String str) {
        char c;
        switch (str.hashCode()) {
            case -2044438337:
                if (str.equals(f1311)) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -1769689844:
                if (str.equals(f1302)) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case -1716191362:
                if (str.equals(f1312)) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -1405271692:
                if (str.equals(f1298)) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case -1401317165:
                if (str.equals(f1303)) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case -1304544044:
                if (str.equals(f1304)) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case -1062227179:
                if (str.equals(f1317)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -808014786:
                if (str.equals(f1301)) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case -595852006:
                if (str.equals(f1308)) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case -560158238:
                if (str.equals(f1316)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -541364416:
                if (str.equals(f1318)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -520974940:
                if (str.equals(f1288)) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case -235933147:
                if (str.equals(f1313)) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -204096109:
                if (str.equals(f1315)) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -93733047:
                if (str.equals(f1314)) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -32161126:
                if (str.equals(f1306)) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 2115:
                if (str.equals(f1286)) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case 63090975:
                if (str.equals(f1287)) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case 99044255:
                if (str.equals(f1310)) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 515339810:
                if (str.equals(f1300)) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case 957243679:
                if (str.equals(f1307)) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case 1228411167:
                if (str.equals(f1305)) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 1564529113:
                if (str.equals(f1285)) {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            case 1955888231:
                if (str.equals(f1299)) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 2035398868:
                if (str.equals(f1309)) {
                    c = '\t';
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
                return InMobiAdActivity.class;
            case 2:
            case 3:
                return com.inmobi.ads.rendering.InMobiAdActivity.class;
            case 4:
                return NativeVideoView.class;
            case 5:
                return AdUnit.AdMarkupType.class;
            case 6:
                return AdContainer.class;
            case 7:
                return AdContainer.RenderingProperties.class;
            case '\b':
                return AdContainer.RenderingProperties.PlacementType.class;
            case '\t':
                return AdContainer.EventType.class;
            case '\n':
                return InMobiBanner.class;
            case 11:
                return InMobiInterstitial.class;
            case '\f':
                return InMobiSdk.class;
            case '\r':
                return InMobiAdRequest.class;
            case 14:
                return ViewableAd.class;
            case 15:
                return AdUnit.class;
            case 16:
                return NativeRecyclerViewAdapter.class;
            case 17:
                return InterstitialAdEventListener.class;
            case 18:
                return BannerAdEventListener.class;
            case 19:
                return NativeAdEventListener.class;
            case 20:
                return VideoEventListener.class;
            case 21:
                return AdResponse.class;
            case 22:
                return AdSet.class;
            case 23:
                return Ad.class;
            case 24:
                return ContextData.class;
            default:
                return null;
        }
    }
}
