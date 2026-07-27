package io.appmetrica.analytics.impl;

import android.net.Uri;
import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfoResult;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdvertisingIdsHolder;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.appmetrica.analytics.networktasks.internal.IParamsAppender;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.bm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0399bm implements IParamsAppender {

    /* renamed from: a, reason: collision with root package name */
    public final C0701ne f7070a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0907vd f7071b;

    /* renamed from: c, reason: collision with root package name */
    public final Ob f7072c = new Ob();

    public C0399bm(C0701ne c0701ne, InterfaceC0907vd interfaceC0907vd) {
        this.f7070a = c0701ne;
        this.f7071b = interfaceC0907vd;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.IParamsAppender
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void appendParams(Uri.Builder builder, C0502fm c0502fm) {
        C0832sg c0832sg;
        builder.path("analytics/startup");
        builder.appendQueryParameter(this.f7070a.a(CommonUrlParts.DEVICE_ID), c0502fm.getDeviceId());
        a(builder, C0878ua.f8414H.h(), this.f7072c);
        builder.appendQueryParameter(this.f7070a.a(CommonUrlParts.APP_SET_ID), c0502fm.getAppSetId());
        builder.appendQueryParameter(this.f7070a.a(CommonUrlParts.APP_SET_ID_SCOPE), c0502fm.getAppSetIdScope());
        builder.appendQueryParameter(this.f7070a.a(CommonUrlParts.APP_PLATFORM), c0502fm.getAppPlatform());
        builder.appendQueryParameter(this.f7070a.a(CommonUrlParts.PROTOCOL_VERSION), c0502fm.getProtocolVersion());
        builder.appendQueryParameter(this.f7070a.a(CommonUrlParts.ANALYTICS_SDK_VERSION_NAME), c0502fm.getAnalyticsSdkVersionName());
        builder.appendQueryParameter(this.f7070a.a(CommonUrlParts.MODEL), c0502fm.getModel());
        builder.appendQueryParameter(this.f7070a.a(CommonUrlParts.MANUFACTURER), c0502fm.getManufacturer());
        builder.appendQueryParameter(this.f7070a.a(CommonUrlParts.OS_VERSION), c0502fm.getOsVersion());
        builder.appendQueryParameter(this.f7070a.a(CommonUrlParts.SCREEN_WIDTH), String.valueOf(c0502fm.getScreenWidth()));
        builder.appendQueryParameter(this.f7070a.a(CommonUrlParts.SCREEN_HEIGHT), String.valueOf(c0502fm.getScreenHeight()));
        builder.appendQueryParameter(this.f7070a.a(CommonUrlParts.SCREEN_DPI), String.valueOf(c0502fm.getScreenDpi()));
        builder.appendQueryParameter(this.f7070a.a(CommonUrlParts.SCALE_FACTOR), String.valueOf(c0502fm.getScaleFactor()));
        builder.appendQueryParameter(this.f7070a.a(CommonUrlParts.LOCALE), c0502fm.getLocale());
        builder.appendQueryParameter(this.f7070a.a(CommonUrlParts.DEVICE_TYPE), c0502fm.getDeviceType());
        builder.appendQueryParameter(this.f7070a.a("queries"), String.valueOf(1));
        builder.appendQueryParameter(this.f7070a.a("query_hosts"), String.valueOf(2));
        String a3 = this.f7070a.a("features");
        List<String> h3 = ((Ck) this.f7071b).h();
        String[] strArr = {this.f7070a.a("permissions_collecting"), this.f7070a.a("features_collecting"), this.f7070a.a("google_aid"), this.f7070a.a("huawei_oaid"), this.f7070a.a("sim_info"), this.f7070a.a("ssl_pinning")};
        ArrayList arrayList = new ArrayList(h3);
        arrayList.addAll(Arrays.asList(strArr));
        builder.appendQueryParameter(a3, StringUtils.wrapFeatures((String[]) arrayList.toArray(new String[0])));
        builder.appendQueryParameter(this.f7070a.a(CommonUrlParts.APP_ID), c0502fm.getPackageName());
        builder.appendQueryParameter(this.f7070a.a("app_debuggable"), ((U5) c0502fm).f6714a);
        if (c0502fm.f7307l) {
            String str = c0502fm.f7308m;
            if (!TextUtils.isEmpty(str)) {
                builder.appendQueryParameter(this.f7070a.a("country_init"), str);
            }
        } else {
            builder.appendQueryParameter(this.f7070a.a("detect_locale"), String.valueOf(1));
        }
        C0999z3 c0999z3 = c0502fm.f7304i;
        if (!AbstractC0711no.a(c0999z3.f8657a)) {
            builder.appendQueryParameter(this.f7070a.a("distribution_customization"), String.valueOf(1));
            builder.appendQueryParameter(this.f7070a.a("clids_set"), Jm.a(c0999z3.f8657a));
            int ordinal = c0999z3.f8658b.ordinal();
            builder.appendQueryParameter(this.f7070a.a("clids_set_source"), ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? "" : "retail" : "satellite" : "api");
            String str2 = c0502fm.f;
            String str3 = c0502fm.f7302g;
            if (TextUtils.isEmpty(str2) && (c0832sg = c0502fm.f7310o.f8161b) != null) {
                str2 = c0832sg.f8308a;
                str3 = c0832sg.f8311d.f8233a;
            }
            if (!TextUtils.isEmpty(str2)) {
                builder.appendQueryParameter(this.f7070a.a("install_referrer"), str2);
                if (str3 == null) {
                    str3 = "null";
                }
                builder.appendQueryParameter(this.f7070a.a("install_referrer_source"), str3);
            }
        }
        String uuid = c0502fm.getUuid();
        if (!TextUtils.isEmpty(uuid)) {
            builder.appendQueryParameter(this.f7070a.a(CommonUrlParts.UUID), uuid);
        }
        builder.appendQueryParameter(this.f7070a.a("time"), String.valueOf(1));
        builder.appendQueryParameter(this.f7070a.a("stat_sending"), String.valueOf(1));
        builder.appendQueryParameter(this.f7070a.a("retry_policy"), String.valueOf(1));
        builder.appendQueryParameter(this.f7070a.a("cache_control"), String.valueOf(1));
        builder.appendQueryParameter(this.f7070a.a("permissions_collecting"), String.valueOf(1));
        builder.appendQueryParameter(this.f7070a.a("app_system_flag"), ((U5) c0502fm).f6715b);
        builder.appendQueryParameter(this.f7070a.a("attribution"), String.valueOf(1));
        builder.appendQueryParameter(this.f7070a.a("startup_update"), String.valueOf(1));
        builder.appendQueryParameter(this.f7070a.a("external_attribution"), String.valueOf(1));
        Map<String, Integer> d3 = ((Ck) this.f7071b).d();
        for (String str4 : d3.keySet()) {
            builder.appendQueryParameter(str4, String.valueOf(d3.get(str4)));
        }
    }

    public final void a(Uri.Builder builder, DataSendingRestrictionController dataSendingRestrictionController, Ob ob) {
        ob.getClass();
        AdvertisingIdsHolder identifiers = C0878ua.f8414H.c().getIdentifiers();
        if (identifiers != null && !dataSendingRestrictionController.isRestrictedForSdk()) {
            AdTrackingInfoResult google = identifiers.getGoogle();
            if (!google.isValid()) {
                builder.appendQueryParameter(this.f7070a.a(CommonUrlParts.ADV_ID), "");
            } else {
                builder.appendQueryParameter(this.f7070a.a(CommonUrlParts.ADV_ID), google.mAdTrackingInfo.advId);
            }
            AdTrackingInfoResult huawei = identifiers.getHuawei();
            if (!huawei.isValid()) {
                builder.appendQueryParameter(this.f7070a.a(CommonUrlParts.HUAWEI_OAID), "");
            } else {
                builder.appendQueryParameter(this.f7070a.a(CommonUrlParts.HUAWEI_OAID), huawei.mAdTrackingInfo.advId);
            }
            AdTrackingInfoResult yandex = identifiers.getYandex();
            if (!yandex.isValid()) {
                builder.appendQueryParameter(this.f7070a.a(CommonUrlParts.YANDEX_ADV_ID), "");
                return;
            } else {
                builder.appendQueryParameter(this.f7070a.a(CommonUrlParts.YANDEX_ADV_ID), yandex.mAdTrackingInfo.advId);
                return;
            }
        }
        builder.appendQueryParameter(this.f7070a.a(CommonUrlParts.ADV_ID), "");
        builder.appendQueryParameter(this.f7070a.a(CommonUrlParts.HUAWEI_OAID), "");
        builder.appendQueryParameter(this.f7070a.a(CommonUrlParts.YANDEX_ADV_ID), "");
    }
}
