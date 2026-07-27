package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import com.vungle.warren.AdActivity;
import com.vungle.warren.AdvertisementPresentationFactory;
import com.vungle.warren.PlayAdCallback;
import com.vungle.warren.Vungle;
import com.vungle.warren.VungleApiClient;
import com.vungle.warren.VungleBanner;
import com.vungle.warren.model.Advertisement;
import com.vungle.warren.model.Placement;
import com.vungle.warren.model.Report;
import com.vungle.warren.persistence.Repository;
import com.vungle.warren.ui.VungleActivity;
import com.vungle.warren.ui.VungleWebViewActivity;
import com.vungle.warren.ui.contract.AdContract;
import com.vungle.warren.ui.contract.LocalAdContract;
import com.vungle.warren.ui.contract.WebAdContract;
import com.vungle.warren.ui.presenter.LocalAdPresenter;
import com.vungle.warren.ui.presenter.MRAIDAdPresenter;
import com.vungle.warren.ui.view.LocalAdView;
import com.vungle.warren.ui.view.MRAIDAdView;
import com.vungle.warren.ui.view.VungleBannerView;
import com.vungle.warren.ui.view.VungleNativeView;
import com.vungle.warren.ui.view.VungleWebClient;
import com.vungle.warren.ui.view.WebViewAPI;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.h, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4304h extends AbstractC0557 {

    /* renamed from: סּ, reason: contains not printable characters */
    public String f197;

    /* renamed from: טּ, reason: contains not printable characters */
    public static final String f196 = StringFog.decrypt("G8n6+ub2aWgbzNru4Pc=\n", "crqzlIWTBxw=\n");

    /* renamed from: ﬤ, reason: contains not printable characters */
    public static final String f195 = StringFog.decrypt("ZZ6TzeuTaTJpnpPF6w==\n", "AvvnjI/eCEA=\n");

    /* renamed from: 爫, reason: contains not printable characters */
    public static final String f194 = StringFog.decrypt("yr+VVOHghe7EvY8=\n", "rdrhF4CN9Y8=\n");

    /* renamed from: 乁, reason: contains not printable characters */
    public static final String f193 = StringFog.decrypt("Zuw3l63ur6Ru6CeyoPWknXPlMA==\n", "AYlD08KZwcg=\n");

    /* renamed from: 丫, reason: contains not printable characters */
    public static final String f192 = StringFog.decrypt("nO4Lnni63x6W7hG6\n", "+4t/zhTbvHs=\n");

    /* renamed from: ヶ, reason: contains not printable characters */
    public static final String f191 = StringFog.decrypt("CvQ5PaHxgnIq\n", "XZFbfMWn6xc=\n");

    /* renamed from: ヮ, reason: contains not printable characters */
    public static final String f190 = StringFog.decrypt("hCs9xYDbuY6gKzHwgfk=\n", "005fhOSLy+s=\n");

    /* renamed from: リ, reason: contains not printable characters */
    public static final String f189 = StringFog.decrypt("1hqLc/ErDJDRNg==\n", "gX/pJZhOe9E=\n");

    /* renamed from: ト, reason: contains not printable characters */
    public static final String f188 = StringFog.decrypt("i305xvpRfWO/SzvI81pe\n", "3QhXoZY0KgY=\n");

    /* renamed from: ゥ, reason: contains not printable characters */
    public static final String f187 = StringFog.decrypt("KanEHtiqGTcNnvI=\n", "ZPuFV5zrfWE=\n");

    /* renamed from: へ, reason: contains not printable characters */
    public static final String f186 = StringFog.decrypt("OhtofwX/UZgSLkhCJA==\n", "d0kpNkG7NPQ=\n");

    /* renamed from: っ, reason: contains not printable characters */
    public static final String f185 = StringFog.decrypt("ofeFQRAlvlSF/pZKFgGlQpP2nVAHI4hilvadUC44pFOF/ZZW\n", "4JPzJGJR1yc=\n");

    /* renamed from: く, reason: contains not printable characters */
    public static final String f184 = StringFog.decrypt("zaNXDtNPlkv4vg==\n", "jMcWbacm4CI=\n");

    /* renamed from: Ↄ, reason: contains not printable characters */
    public static final String f183 = StringFog.decrypt("EGMFgBUs\n", "RhZr53lJlZs=\n");

    /* renamed from: Ⅽ, reason: contains not printable characters */
    public static final String f182 = StringFog.decrypt("zxEeg6k0Q1vtDQaNsSg=\n", "mWRw5MVRAjg=\n");

    /* renamed from: K, reason: contains not printable characters */
    public static final String f181 = StringFog.decrypt("UAECW47ww/ZfC0ECmfff9F1AGhzW09j/VAIKNJvxxOdaGhY=\n", "M25vdfiFrZE=\n");

    /* renamed from: Ύ, reason: contains not printable characters */
    public static final String f180 = StringFog.decrypt("phArwUBIxz2CGTjKRg==\n", "53RdpDI8rk4=\n");

    /* renamed from: Ὺ, reason: contains not printable characters */
    public static final String f179 = StringFog.decrypt("YN5C3L7TrURE\n", "MLIjv9u+yCo=\n");

    /* renamed from: Ῡ, reason: contains not printable characters */
    public static final String f178 = StringFog.decrypt("FMAJlW2B1/Yg4w6XdqXj5yvDDoZ4\n", "QrVn8gHkgJM=\n");

    /* renamed from: Ῠ, reason: contains not printable characters */
    public static final String f177 = StringFog.decrypt("OH3E7fuGLxY3d4e07IEzFDU83KqjpTQfPH7MlOiRFxg+Zeig+Zo3GC9r\n", "WxKpw43zQXE=\n");

    /* renamed from: Ὑ, reason: contains not printable characters */
    public static final String f176 = StringFog.decrypt("SUdaKIblcYV1R1kwpOo=\n", "GSs7UceBMuQ=\n");

    /* renamed from: Ṿ, reason: contains not printable characters */
    public static final String f175 = StringFog.decrypt("1Y1ZSzqu\n", "h+gpJEjaiBQ=\n");

    /* renamed from: Ḽ, reason: contains not printable characters */
    public static final String f174 = StringFog.decrypt("wvLG0143noLi7g==\n", "kJe2vC1e6u0=\n");

    /* renamed from: Ḹ, reason: contains not printable characters */
    public static final String f173 = StringFog.decrypt("+FkgwZOb4lXaSQ==\n", "uT1jrv3vkDQ=\n");

    /* renamed from: Ḟ, reason: contains not printable characters */
    public static final String f172 = StringFog.decrypt("2mqCccFDw3j5a5VizGHT\n", "lgXhEK0Cpzs=\n");

    /* renamed from: ᵆ, reason: contains not printable characters */
    public static final String f171 = StringFog.decrypt("PPhW3LBD6ZQZ8kI=\n", "cJc1vdwCjcI=\n");

    /* renamed from: ᘥ, reason: contains not printable characters */
    public static final String f170 = StringFog.decrypt("v3zjmS5jASyE\n", "8xOA+EI1aEk=\n");

    /* renamed from: ᗀ, reason: contains not printable characters */
    public static final String f169 = StringFog.decrypt("PFJlrY+eVVIDWGi4hrw=\n", "cD0GzOPOJzc=\n");

    /* renamed from: ᖺ, reason: contains not printable characters */
    public static final String f168 = StringFog.decrypt("TbzTB2Gf3dFvrM8pa53Kwnix4w1ijsHEXKr1G2qF29V+\n", "DNiQaA/rr7A=\n");

    /* renamed from: ᖸ, reason: contains not printable characters */
    public static final String f167 = StringFog.decrypt("gJkWZDmZ3cqkkAVvP73G3LKYDnUqmd3Wr7sBYj+CxsA=\n", "wf1gAUvttLk=\n");

    /* renamed from: ᖭ, reason: contains not printable characters */
    public static final String f166 = StringFog.decrypt("f/lQ7KBWRyhB80DoomNGCg==\n", "M5YzjcwXI3g=\n");

    /* renamed from: ᖫ, reason: contains not printable characters */
    public static final String f165 = StringFog.decrypt("rgH5gtZOD42RNsuu/HsOrw==\n", "41O4y5IPa90=\n");

    /* renamed from: ᖩ, reason: contains not printable characters */
    public static final String f164 = StringFog.decrypt("ULediWB/gPJorJac\n", "BsLz7gwawpM=\n");

    /* renamed from: ᖅ, reason: contains not printable characters */
    public static final String f163 = StringFog.decrypt("YcaSvviSAkNuzNHn75UeQWyHqeXggABBQMiR/uuV\n", "Aqn/kI7nbCQ=\n");

    /* renamed from: ᕆ, reason: contains not printable characters */
    public static final String f162 = StringFog.decrypt("7yxXfEVIoLzNME9+f0SLqg==\n", "uVk5Gykt7t0=\n");

    /* renamed from: ᕄ, reason: contains not printable characters */
    public static final String f161 = StringFog.decrypt("vukLvf2sfHax40jk6qtgdLOoE/qlr3t0qqgw5uW+fnST5xL6/bxEeLjx\n", "3YZmk4vZEhE=\n");

    /* renamed from: ᕃ, reason: contains not printable characters */
    public static final String f160 = StringFog.decrypt("3296goNonszndHGXuWS52g==\n", "iRoU5e8N3K0=\n");

    /* renamed from: ᕂ, reason: contains not printable characters */
    public static final String f159 = StringFog.decrypt("42Yi0L+6WR/sbGGJqL1FHe4nOpfnuV4d9ycZi6eoWx3CaCGQrL1hEeV+\n", "gAlP/snPN3g=\n");

    public C4304h(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0557
    /* renamed from: ﻛ, reason: contains not printable characters */
    public final String mo5368() {
        String mo5371 = mo5371();
        if (mo5371 != null) {
            return mo5371.split(StringFog.decrypt("SA==\n", "Z4YBpsUNGTM=\n"))[1];
        }
        return null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0557
    /* renamed from: ﾇ, reason: contains not printable characters */
    public final HashMap mo5369() {
        HashMap hashMap = new HashMap();
        hashMap.put(f192, new C4299c(this));
        hashMap.put(f196, new C4300d(this));
        hashMap.put(f195, new C4301e(this));
        hashMap.put(f194, new C4302f(this));
        hashMap.put(f193, new C4303g(this));
        return hashMap;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0557
    /* renamed from: ﾒ, reason: contains not printable characters */
    public final String mo5371() {
        if (this.f197 == null) {
            C0929 c0929 = C0391.m5393().f503;
            C0956 c0956 = new C0998().f2924;
            c0956.f2666 = String.class;
            c0956.f1237 |= 8;
            c0956.f1236 |= 16;
            C0929 c09292 = C0391.m5393().f503;
            ArrayList arrayList = new ArrayList();
            c09292.m5739(VungleApiClient.class, c0956, arrayList);
            String str = null;
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    String str2 = (String) ((Field) it.next()).get(null);
                    if (str2.startsWith(StringFog.decrypt("YCNKJ+XBDwVXLEsu\n", "NlYkQImkTmg=\n")) || str2.startsWith(StringFog.decrypt("jds6AcwkJ/i0xzA=\n", "265UZqBBY4o=\n"))) {
                        str = str2.split(StringFog.decrypt("1Q==\n", "7nw+V/ioDPA=\n"))[0];
                        break;
                    }
                }
            } catch (Exception unused) {
            }
            this.f197 = str;
            this.f1270 = str;
        }
        return this.f197;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0557
    /* renamed from: ﾒ, reason: contains not printable characters */
    public final Class mo5370(String str) {
        char c;
        switch (str.hashCode()) {
            case -2075872274:
                if (str.equals(f165)) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case -2012803321:
                if (str.equals(f161)) {
                    c = ' ';
                    break;
                }
                c = 65535;
                break;
            case -1853707364:
                if (str.equals(f159)) {
                    c = 30;
                    break;
                }
                c = 65535;
                break;
            case -1850654380:
                if (str.equals(f175)) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -1836618638:
                if (str.equals(f184)) {
                    c = 26;
                    break;
                }
                c = 65535;
                break;
            case -1740904301:
                if (str.equals(f171)) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case -1721428911:
                if (str.equals(f183)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1057659822:
                if (str.equals(f185)) {
                    c = 25;
                    break;
                }
                c = 65535;
                break;
            case -965507231:
                if (str.equals(f189)) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case -899612152:
                if (str.equals(f177)) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -828205665:
                if (str.equals(f187)) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case -747599243:
                if (str.equals(f173)) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case -498060603:
                if (str.equals(f179)) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -350701718:
                if (str.equals(f174)) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case -92732536:
                if (str.equals(f163)) {
                    c = 28;
                    break;
                }
                c = 65535;
                break;
            case 156342925:
                if (str.equals(f162)) {
                    c = 31;
                    break;
                }
                c = 65535;
                break;
            case 315438882:
                if (str.equals(f160)) {
                    c = 29;
                    break;
                }
                c = 65535;
                break;
            case 332396988:
                if (str.equals(f191)) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 505165239:
                if (str.equals(f178)) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 670892517:
                if (str.equals(f180)) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 746354589:
                if (str.equals(f169)) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 798818448:
                if (str.equals(f170)) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case 1033471823:
                if (str.equals(f181)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1110462460:
                if (str.equals(f186)) {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            case 1205766784:
                if (str.equals(f182)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1208038126:
                if (str.equals(f188)) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 1230133745:
                if (str.equals(f190)) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case 1461477995:
                if (str.equals(f167)) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 1611471226:
                if (str.equals(f166)) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 1731532800:
                if (str.equals(f172)) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 1766407901:
                if (str.equals(f164)) {
                    c = 27;
                    break;
                }
                c = 65535;
                break;
            case 1777696764:
                if (str.equals(f176)) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 1861686093:
                if (str.equals(f168)) {
                    c = 18;
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
                return Vungle.class;
            case 1:
            case 2:
                return VungleActivity.class;
            case 3:
            case 4:
                return VungleWebViewActivity.class;
            case 5:
                return Advertisement.class;
            case 6:
                return Placement.class;
            case 7:
                return VungleWebClient.class;
            case '\b':
                return Report.class;
            case '\t':
                return PlayAdCallback.class;
            case '\n':
                return Repository.class;
            case 11:
                return AdContract.class;
            case '\f':
                return LocalAdContract.class;
            case '\r':
                return LocalAdView.class;
            case 14:
                return LocalAdContract.LocalView.class;
            case 15:
                return LocalAdContract.LocalPresenter.class;
            case 16:
                return LocalAdPresenter.class;
            case 17:
                return MRAIDAdPresenter.class;
            case 18:
                return AdContract.AdvertisementPresenter.class;
            case 19:
                return AdvertisementPresentationFactory.class;
            case 20:
                return WebAdContract.WebAdView.class;
            case 21:
                return WebAdContract.WebAdPresenter.class;
            case 22:
                return WebViewAPI.class;
            case 23:
                return MRAIDAdView.class;
            case 24:
                return WebViewAPI.MRAIDDelegate.class;
            case 25:
                return AdContract.AdvertisementPresenter.EventListener.class;
            case 26:
                return AdActivity.class;
            case 27:
            case 28:
                return VungleBanner.class;
            case 29:
            case 30:
                return VungleBannerView.class;
            case 31:
            case ' ':
                return VungleNativeView.class;
            default:
                return null;
        }
    }
}
