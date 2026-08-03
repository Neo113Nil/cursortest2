package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Zg implements io.appmetrica.analytics.networktasks.internal.IParamsAppender {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.networktasks.internal.AdvIdWithLimitedAppender f5428a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.networktasks.internal.NetworkTaskForSendingDataParamsAppender f5429b;

    /* renamed from: c, reason: collision with root package name */
    public io.appmetrica.analytics.impl.C0505l7 f5430c;

    /* renamed from: d, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Hb f5431d;

    /* renamed from: e, reason: collision with root package name */
    public long f5432e;

    public Zg(io.appmetrica.analytics.networktasks.internal.RequestBodyEncrypter requestBodyEncrypter) {
        this(new io.appmetrica.analytics.networktasks.internal.AdvIdWithLimitedAppender(), new io.appmetrica.analytics.networktasks.internal.NetworkTaskForSendingDataParamsAppender(requestBodyEncrypter), new io.appmetrica.analytics.impl.Hb());
    }

    public final void a(io.appmetrica.analytics.impl.C0505l7 c0505l7) {
        this.f5430c = c0505l7;
    }

    public Zg(io.appmetrica.analytics.networktasks.internal.AdvIdWithLimitedAppender advIdWithLimitedAppender, io.appmetrica.analytics.networktasks.internal.NetworkTaskForSendingDataParamsAppender networkTaskForSendingDataParamsAppender, io.appmetrica.analytics.impl.Hb hb) {
        this.f5428a = advIdWithLimitedAppender;
        this.f5429b = networkTaskForSendingDataParamsAppender;
        this.f5431d = hb;
    }

    public final void a(long j2) {
        this.f5432e = j2;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.IParamsAppender
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void appendParams(android.net.Uri.Builder builder, io.appmetrica.analytics.impl.C0489kh c0489kh) {
        builder.path("report");
        this.f5429b.appendEncryptedData(builder);
        io.appmetrica.analytics.impl.C0505l7 c0505l7 = this.f5430c;
        if (c0505l7 != null) {
            builder.appendQueryParameter(io.appmetrica.analytics.networktasks.internal.CommonUrlParts.DEVICE_ID, io.appmetrica.analytics.coreutils.internal.StringUtils.ifIsEmptyToDef(c0505l7.f6333a, c0489kh.getDeviceId()));
            builder.appendQueryParameter(io.appmetrica.analytics.networktasks.internal.CommonUrlParts.UUID, io.appmetrica.analytics.coreutils.internal.StringUtils.ifIsEmptyToDef(this.f5430c.f6334b, c0489kh.getUuid()));
            a(builder, io.appmetrica.analytics.networktasks.internal.CommonUrlParts.ANALYTICS_SDK_VERSION_NAME, this.f5430c.f6335c);
            builder.appendQueryParameter(io.appmetrica.analytics.networktasks.internal.CommonUrlParts.APP_VERSION, io.appmetrica.analytics.coreutils.internal.StringUtils.ifIsEmptyToDef(this.f5430c.f6338f, c0489kh.getAppVersion()));
            builder.appendQueryParameter(io.appmetrica.analytics.networktasks.internal.CommonUrlParts.APP_VERSION_CODE, io.appmetrica.analytics.coreutils.internal.StringUtils.ifIsEmptyToDef(this.f5430c.f6340h, c0489kh.getAppBuildNumber()));
            builder.appendQueryParameter(io.appmetrica.analytics.networktasks.internal.CommonUrlParts.OS_VERSION, io.appmetrica.analytics.coreutils.internal.StringUtils.ifIsEmptyToDef(this.f5430c.f6341i, c0489kh.getOsVersion()));
            a(builder, io.appmetrica.analytics.networktasks.internal.CommonUrlParts.OS_API_LEVEL, this.f5430c.f6342j);
            a(builder, io.appmetrica.analytics.networktasks.internal.CommonUrlParts.ANALYTICS_SDK_BUILD_NUMBER, this.f5430c.f6336d);
            a(builder, io.appmetrica.analytics.networktasks.internal.CommonUrlParts.ANALYTICS_SDK_BUILD_TYPE, this.f5430c.f6337e);
            a(builder, "app_debuggable", this.f5430c.f6339g);
            builder.appendQueryParameter(io.appmetrica.analytics.networktasks.internal.CommonUrlParts.LOCALE, io.appmetrica.analytics.coreutils.internal.StringUtils.ifIsEmptyToDef(this.f5430c.f6343k, c0489kh.getLocale()));
            builder.appendQueryParameter(io.appmetrica.analytics.networktasks.internal.CommonUrlParts.ROOT_STATUS, io.appmetrica.analytics.coreutils.internal.StringUtils.ifIsEmptyToDef(this.f5430c.f6344l, c0489kh.getDeviceRootStatus()));
            builder.appendQueryParameter(io.appmetrica.analytics.networktasks.internal.CommonUrlParts.APP_FRAMEWORK, io.appmetrica.analytics.coreutils.internal.StringUtils.ifIsEmptyToDef(this.f5430c.f6345m, c0489kh.getAppFramework()));
            a(builder, "attribution_id", this.f5430c.f6346n);
        }
        builder.appendQueryParameter("api_key_128", c0489kh.f6293m);
        builder.appendQueryParameter(io.appmetrica.analytics.networktasks.internal.CommonUrlParts.APP_ID, c0489kh.getPackageName());
        builder.appendQueryParameter(io.appmetrica.analytics.networktasks.internal.CommonUrlParts.APP_PLATFORM, c0489kh.getAppPlatform());
        builder.appendQueryParameter(io.appmetrica.analytics.networktasks.internal.CommonUrlParts.MODEL, c0489kh.getModel());
        builder.appendQueryParameter(io.appmetrica.analytics.networktasks.internal.CommonUrlParts.MANUFACTURER, c0489kh.getManufacturer());
        builder.appendQueryParameter(io.appmetrica.analytics.networktasks.internal.CommonUrlParts.SCREEN_WIDTH, java.lang.String.valueOf(c0489kh.getScreenWidth()));
        builder.appendQueryParameter(io.appmetrica.analytics.networktasks.internal.CommonUrlParts.SCREEN_HEIGHT, java.lang.String.valueOf(c0489kh.getScreenHeight()));
        builder.appendQueryParameter(io.appmetrica.analytics.networktasks.internal.CommonUrlParts.SCREEN_DPI, java.lang.String.valueOf(c0489kh.getScreenDpi()));
        builder.appendQueryParameter(io.appmetrica.analytics.networktasks.internal.CommonUrlParts.SCALE_FACTOR, java.lang.String.valueOf(c0489kh.getScaleFactor()));
        builder.appendQueryParameter(io.appmetrica.analytics.networktasks.internal.CommonUrlParts.DEVICE_TYPE, c0489kh.getDeviceType());
        a(builder, "clids_set", (java.lang.String) io.appmetrica.analytics.coreutils.internal.WrapUtils.getOrDefault(c0489kh.f6296p, ""));
        builder.appendQueryParameter(io.appmetrica.analytics.networktasks.internal.CommonUrlParts.APP_SET_ID, c0489kh.getAppSetId());
        builder.appendQueryParameter(io.appmetrica.analytics.networktasks.internal.CommonUrlParts.APP_SET_ID_SCOPE, c0489kh.getAppSetIdScope());
        io.appmetrica.analytics.networktasks.internal.AdvIdWithLimitedAppender advIdWithLimitedAppender = this.f5428a;
        this.f5431d.getClass();
        advIdWithLimitedAppender.appendParams(builder, io.appmetrica.analytics.impl.C0560na.f6484I.c().getIdentifiers());
        builder.appendQueryParameter(io.appmetrica.analytics.networktasks.internal.CommonUrlParts.REQUEST_ID, java.lang.String.valueOf(this.f5432e));
    }

    public static void a(android.net.Uri.Builder builder, java.lang.String str, java.lang.String str2) {
        if (android.text.TextUtils.isEmpty(str2)) {
            return;
        }
        builder.appendQueryParameter(str, str2);
    }
}
