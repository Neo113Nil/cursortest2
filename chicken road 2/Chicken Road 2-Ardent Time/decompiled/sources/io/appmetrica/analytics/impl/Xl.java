package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Xl implements io.appmetrica.analytics.networktasks.internal.IParamsAppender {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0383ge f5312a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.InterfaceC0589od f5313b;

    /* renamed from: c, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Hb f5314c = new io.appmetrica.analytics.impl.Hb();

    public Xl(io.appmetrica.analytics.impl.C0383ge c0383ge, io.appmetrica.analytics.impl.InterfaceC0589od interfaceC0589od) {
        this.f5312a = c0383ge;
        this.f5313b = interfaceC0589od;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.IParamsAppender
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void appendParams(android.net.Uri.Builder builder, io.appmetrica.analytics.impl.C0262bm c0262bm) {
        io.appmetrica.analytics.impl.C0566ng c0566ng;
        builder.path("analytics/startup");
        builder.appendQueryParameter(this.f5312a.a(io.appmetrica.analytics.networktasks.internal.CommonUrlParts.DEVICE_ID), c0262bm.getDeviceId());
        a(builder, io.appmetrica.analytics.impl.C0560na.f6484I.h(), this.f5314c);
        builder.appendQueryParameter(this.f5312a.a(io.appmetrica.analytics.networktasks.internal.CommonUrlParts.APP_SET_ID), c0262bm.getAppSetId());
        builder.appendQueryParameter(this.f5312a.a(io.appmetrica.analytics.networktasks.internal.CommonUrlParts.APP_SET_ID_SCOPE), c0262bm.getAppSetIdScope());
        builder.appendQueryParameter(this.f5312a.a(io.appmetrica.analytics.networktasks.internal.CommonUrlParts.APP_PLATFORM), c0262bm.getAppPlatform());
        builder.appendQueryParameter(this.f5312a.a(io.appmetrica.analytics.networktasks.internal.CommonUrlParts.PROTOCOL_VERSION), c0262bm.getProtocolVersion());
        builder.appendQueryParameter(this.f5312a.a(io.appmetrica.analytics.networktasks.internal.CommonUrlParts.ANALYTICS_SDK_VERSION_NAME), c0262bm.getAnalyticsSdkVersionName());
        builder.appendQueryParameter(this.f5312a.a(io.appmetrica.analytics.networktasks.internal.CommonUrlParts.MODEL), c0262bm.getModel());
        builder.appendQueryParameter(this.f5312a.a(io.appmetrica.analytics.networktasks.internal.CommonUrlParts.MANUFACTURER), c0262bm.getManufacturer());
        builder.appendQueryParameter(this.f5312a.a(io.appmetrica.analytics.networktasks.internal.CommonUrlParts.OS_VERSION), c0262bm.getOsVersion());
        builder.appendQueryParameter(this.f5312a.a(io.appmetrica.analytics.networktasks.internal.CommonUrlParts.SCREEN_WIDTH), java.lang.String.valueOf(c0262bm.getScreenWidth()));
        builder.appendQueryParameter(this.f5312a.a(io.appmetrica.analytics.networktasks.internal.CommonUrlParts.SCREEN_HEIGHT), java.lang.String.valueOf(c0262bm.getScreenHeight()));
        builder.appendQueryParameter(this.f5312a.a(io.appmetrica.analytics.networktasks.internal.CommonUrlParts.SCREEN_DPI), java.lang.String.valueOf(c0262bm.getScreenDpi()));
        builder.appendQueryParameter(this.f5312a.a(io.appmetrica.analytics.networktasks.internal.CommonUrlParts.SCALE_FACTOR), java.lang.String.valueOf(c0262bm.getScaleFactor()));
        builder.appendQueryParameter(this.f5312a.a(io.appmetrica.analytics.networktasks.internal.CommonUrlParts.LOCALE), c0262bm.getLocale());
        builder.appendQueryParameter(this.f5312a.a(io.appmetrica.analytics.networktasks.internal.CommonUrlParts.DEVICE_TYPE), c0262bm.getDeviceType());
        builder.appendQueryParameter(this.f5312a.a("queries"), java.lang.String.valueOf(1));
        builder.appendQueryParameter(this.f5312a.a("query_hosts"), java.lang.String.valueOf(2));
        java.lang.String a2 = this.f5312a.a("features");
        java.util.List<java.lang.String> h2 = ((io.appmetrica.analytics.impl.C0829xk) this.f5313b).h();
        java.lang.String[] strArr = {this.f5312a.a("permissions_collecting"), this.f5312a.a("features_collecting"), this.f5312a.a("google_aid"), this.f5312a.a("huawei_oaid"), this.f5312a.a("sim_info"), this.f5312a.a("ssl_pinning")};
        java.util.ArrayList arrayList = new java.util.ArrayList(h2);
        arrayList.addAll(java.util.Arrays.asList(strArr));
        builder.appendQueryParameter(a2, io.appmetrica.analytics.coreutils.internal.StringUtils.wrapFeatures((java.lang.String[]) arrayList.toArray(new java.lang.String[0])));
        builder.appendQueryParameter(this.f5312a.a(io.appmetrica.analytics.networktasks.internal.CommonUrlParts.APP_ID), c0262bm.getPackageName());
        builder.appendQueryParameter(this.f5312a.a("app_debuggable"), ((io.appmetrica.analytics.impl.N5) c0262bm).f4707a);
        if (c0262bm.f5604l) {
            java.lang.String str = c0262bm.f5605m;
            if (!android.text.TextUtils.isEmpty(str)) {
                builder.appendQueryParameter(this.f5312a.a("country_init"), str);
            }
        } else {
            builder.appendQueryParameter(this.f5312a.a("detect_locale"), java.lang.String.valueOf(1));
        }
        io.appmetrica.analytics.impl.C0656r3 c0656r3 = c0262bm.f5601i;
        if (!io.appmetrica.analytics.impl.AbstractC0522lo.a(c0656r3.f6715a)) {
            builder.appendQueryParameter(this.f5312a.a("distribution_customization"), java.lang.String.valueOf(1));
            builder.appendQueryParameter(this.f5312a.a("clids_set"), io.appmetrica.analytics.impl.Fm.a(c0656r3.f6715a));
            int ordinal = c0656r3.f6716b.ordinal();
            builder.appendQueryParameter(this.f5312a.a("clids_set_source"), ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? "" : "retail" : "satellite" : "api");
            java.lang.String str2 = c0262bm.f5598f;
            java.lang.String str3 = c0262bm.f5599g;
            if (android.text.TextUtils.isEmpty(str2) && (c0566ng = c0262bm.f5607o.f6364b) != null) {
                str2 = c0566ng.f6533a;
                str3 = c0566ng.f6536d.f6432a;
            }
            if (!android.text.TextUtils.isEmpty(str2)) {
                builder.appendQueryParameter(this.f5312a.a("install_referrer"), str2);
                if (str3 == null) {
                    str3 = "null";
                }
                builder.appendQueryParameter(this.f5312a.a("install_referrer_source"), str3);
            }
        }
        java.lang.String uuid = c0262bm.getUuid();
        if (!android.text.TextUtils.isEmpty(uuid)) {
            builder.appendQueryParameter(this.f5312a.a(io.appmetrica.analytics.networktasks.internal.CommonUrlParts.UUID), uuid);
        }
        builder.appendQueryParameter(this.f5312a.a("time"), java.lang.String.valueOf(1));
        builder.appendQueryParameter(this.f5312a.a("stat_sending"), java.lang.String.valueOf(1));
        builder.appendQueryParameter(this.f5312a.a("retry_policy"), java.lang.String.valueOf(1));
        builder.appendQueryParameter(this.f5312a.a("cache_control"), java.lang.String.valueOf(1));
        builder.appendQueryParameter(this.f5312a.a("permissions_collecting"), java.lang.String.valueOf(1));
        builder.appendQueryParameter(this.f5312a.a("app_system_flag"), ((io.appmetrica.analytics.impl.N5) c0262bm).f4708b);
        builder.appendQueryParameter(this.f5312a.a("attribution"), java.lang.String.valueOf(1));
        builder.appendQueryParameter(this.f5312a.a("startup_update"), java.lang.String.valueOf(1));
        builder.appendQueryParameter(this.f5312a.a("external_attribution"), java.lang.String.valueOf(1));
        java.util.Map<java.lang.String, java.lang.Integer> d2 = ((io.appmetrica.analytics.impl.C0829xk) this.f5313b).d();
        for (java.lang.String str4 : d2.keySet()) {
            builder.appendQueryParameter(str4, java.lang.String.valueOf(d2.get(str4)));
        }
    }

    public final void a(android.net.Uri.Builder builder, io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController dataSendingRestrictionController, io.appmetrica.analytics.impl.Hb hb) {
        hb.getClass();
        io.appmetrica.analytics.coreapi.internal.identifiers.AdvertisingIdsHolder identifiers = io.appmetrica.analytics.impl.C0560na.f6484I.c().getIdentifiers();
        if (identifiers != null && !dataSendingRestrictionController.isRestrictedForSdk()) {
            io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfoResult google = identifiers.getGoogle();
            if (!google.isValid()) {
                builder.appendQueryParameter(this.f5312a.a(io.appmetrica.analytics.networktasks.internal.CommonUrlParts.ADV_ID), "");
            } else {
                builder.appendQueryParameter(this.f5312a.a(io.appmetrica.analytics.networktasks.internal.CommonUrlParts.ADV_ID), google.mAdTrackingInfo.advId);
            }
            io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfoResult huawei = identifiers.getHuawei();
            if (!huawei.isValid()) {
                builder.appendQueryParameter(this.f5312a.a(io.appmetrica.analytics.networktasks.internal.CommonUrlParts.HUAWEI_OAID), "");
            } else {
                builder.appendQueryParameter(this.f5312a.a(io.appmetrica.analytics.networktasks.internal.CommonUrlParts.HUAWEI_OAID), huawei.mAdTrackingInfo.advId);
            }
            io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfoResult yandex = identifiers.getYandex();
            if (!yandex.isValid()) {
                builder.appendQueryParameter(this.f5312a.a(io.appmetrica.analytics.networktasks.internal.CommonUrlParts.YANDEX_ADV_ID), "");
                return;
            } else {
                builder.appendQueryParameter(this.f5312a.a(io.appmetrica.analytics.networktasks.internal.CommonUrlParts.YANDEX_ADV_ID), yandex.mAdTrackingInfo.advId);
                return;
            }
        }
        builder.appendQueryParameter(this.f5312a.a(io.appmetrica.analytics.networktasks.internal.CommonUrlParts.ADV_ID), "");
        builder.appendQueryParameter(this.f5312a.a(io.appmetrica.analytics.networktasks.internal.CommonUrlParts.HUAWEI_OAID), "");
        builder.appendQueryParameter(this.f5312a.a(io.appmetrica.analytics.networktasks.internal.CommonUrlParts.YANDEX_ADV_ID), "");
    }
}
