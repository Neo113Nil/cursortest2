package com.startapp.sdk.internal;

import com.startapp.sdk.adsbase.AdsConstants$AdApiType;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.startappsdk.R;

/* loaded from: classes.dex */
public abstract class h0 {

    /* renamed from: a, reason: collision with root package name */
    public static final String f3810a;

    /* renamed from: b, reason: collision with root package name */
    public static final String f3811b;

    /* renamed from: d, reason: collision with root package name */
    public static final String f3813d;
    public static final Boolean f;

    /* renamed from: g, reason: collision with root package name */
    public static final Boolean f3815g;

    /* renamed from: h, reason: collision with root package name */
    public static final int f3816h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f3817i;

    /* renamed from: j, reason: collision with root package name */
    public static final int f3818j;

    /* renamed from: k, reason: collision with root package name */
    public static final int f3819k;

    /* renamed from: l, reason: collision with root package name */
    public static final String[] f3820l;

    /* renamed from: m, reason: collision with root package name */
    public static final String[] f3821m;

    /* renamed from: c, reason: collision with root package name */
    public static final String f3812c = "trackdownload";

    /* renamed from: e, reason: collision with root package name */
    public static final String f3814e = "https://imp.startappservice.com/tracking/adImpression";

    static {
        String str = "get";
        f3810a = str.concat("ads");
        f3811b = str.concat("htmlad");
        f3813d = str.concat("adsmetadata");
        Boolean bool = Boolean.FALSE;
        f = bool;
        f3815g = bool;
        f3816h = R.id.io_start_fullscreen_main;
        f3817i = R.id.io_start_fullscreen_info;
        f3818j = R.id.io_start_list3d_close;
        f3819k = R.id.io_start_video_main;
        f3820l = new String[]{"back_", "back_dark", "browser_icon_dark", "forward_", "forward_dark", "x_dark"};
        f3821m = new String[]{"empty_star", "filled_star", "half_star"};
    }

    public static String a(AdsConstants$AdApiType adsConstants$AdApiType, AdPreferences.Placement placement) {
        String str;
        String a3;
        String str2;
        String str3;
        int ordinal = adsConstants$AdApiType.ordinal();
        if (ordinal == 0) {
            str = f3811b;
            a3 = MetaData.E().a(placement);
        } else {
            if (ordinal != 1) {
                str3 = null;
                str2 = null;
                return B0.c.o(str3, str2);
            }
            str = f3810a;
            a3 = MetaData.E().a(placement);
        }
        String str4 = a3;
        str2 = str;
        str3 = str4;
        return B0.c.o(str3, str2);
    }
}
