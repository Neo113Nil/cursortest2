package io.appmetrica.analytics.impl;

import android.net.Uri;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.networktasks.internal.AdvIdWithLimitedAppender;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.appmetrica.analytics.networktasks.internal.IParamsAppender;
import io.appmetrica.analytics.networktasks.internal.NetworkTaskForSendingDataParamsAppender;
import io.appmetrica.analytics.networktasks.internal.RequestBodyEncrypter;

/* renamed from: io.appmetrica.analytics.impl.eh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0471eh implements IParamsAppender {

    /* renamed from: a, reason: collision with root package name */
    public final AdvIdWithLimitedAppender f7254a;

    /* renamed from: b, reason: collision with root package name */
    public final NetworkTaskForSendingDataParamsAppender f7255b;

    /* renamed from: c, reason: collision with root package name */
    public C0849t7 f7256c;

    /* renamed from: d, reason: collision with root package name */
    public final Ob f7257d;

    /* renamed from: e, reason: collision with root package name */
    public long f7258e;

    public C0471eh(RequestBodyEncrypter requestBodyEncrypter) {
        this(new AdvIdWithLimitedAppender(), new NetworkTaskForSendingDataParamsAppender(requestBodyEncrypter), new Ob());
    }

    public final void a(C0849t7 c0849t7) {
        this.f7256c = c0849t7;
    }

    public C0471eh(AdvIdWithLimitedAppender advIdWithLimitedAppender, NetworkTaskForSendingDataParamsAppender networkTaskForSendingDataParamsAppender, Ob ob) {
        this.f7254a = advIdWithLimitedAppender;
        this.f7255b = networkTaskForSendingDataParamsAppender;
        this.f7257d = ob;
    }

    public final void a(long j3) {
        this.f7258e = j3;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.IParamsAppender
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void appendParams(Uri.Builder builder, C0756ph c0756ph) {
        builder.path("report");
        this.f7255b.appendEncryptedData(builder);
        C0849t7 c0849t7 = this.f7256c;
        if (c0849t7 != null) {
            builder.appendQueryParameter(CommonUrlParts.DEVICE_ID, StringUtils.ifIsEmptyToDef(c0849t7.f8333a, c0756ph.getDeviceId()));
            builder.appendQueryParameter(CommonUrlParts.UUID, StringUtils.ifIsEmptyToDef(this.f7256c.f8334b, c0756ph.getUuid()));
            a(builder, CommonUrlParts.ANALYTICS_SDK_VERSION_NAME, this.f7256c.f8335c);
            builder.appendQueryParameter(CommonUrlParts.APP_VERSION, StringUtils.ifIsEmptyToDef(this.f7256c.f, c0756ph.getAppVersion()));
            builder.appendQueryParameter(CommonUrlParts.APP_VERSION_CODE, StringUtils.ifIsEmptyToDef(this.f7256c.f8339h, c0756ph.getAppBuildNumber()));
            builder.appendQueryParameter(CommonUrlParts.OS_VERSION, StringUtils.ifIsEmptyToDef(this.f7256c.f8340i, c0756ph.getOsVersion()));
            a(builder, CommonUrlParts.OS_API_LEVEL, this.f7256c.f8341j);
            a(builder, CommonUrlParts.ANALYTICS_SDK_BUILD_NUMBER, this.f7256c.f8336d);
            a(builder, CommonUrlParts.ANALYTICS_SDK_BUILD_TYPE, this.f7256c.f8337e);
            a(builder, "app_debuggable", this.f7256c.f8338g);
            builder.appendQueryParameter(CommonUrlParts.LOCALE, StringUtils.ifIsEmptyToDef(this.f7256c.f8342k, c0756ph.getLocale()));
            builder.appendQueryParameter(CommonUrlParts.ROOT_STATUS, StringUtils.ifIsEmptyToDef(this.f7256c.f8343l, c0756ph.getDeviceRootStatus()));
            builder.appendQueryParameter(CommonUrlParts.APP_FRAMEWORK, StringUtils.ifIsEmptyToDef(this.f7256c.f8344m, c0756ph.getAppFramework()));
            a(builder, "attribution_id", this.f7256c.f8345n);
        }
        builder.appendQueryParameter("api_key_128", c0756ph.f8079m);
        builder.appendQueryParameter(CommonUrlParts.APP_ID, c0756ph.getPackageName());
        builder.appendQueryParameter(CommonUrlParts.APP_PLATFORM, c0756ph.getAppPlatform());
        builder.appendQueryParameter(CommonUrlParts.MODEL, c0756ph.getModel());
        builder.appendQueryParameter(CommonUrlParts.MANUFACTURER, c0756ph.getManufacturer());
        builder.appendQueryParameter(CommonUrlParts.SCREEN_WIDTH, String.valueOf(c0756ph.getScreenWidth()));
        builder.appendQueryParameter(CommonUrlParts.SCREEN_HEIGHT, String.valueOf(c0756ph.getScreenHeight()));
        builder.appendQueryParameter(CommonUrlParts.SCREEN_DPI, String.valueOf(c0756ph.getScreenDpi()));
        builder.appendQueryParameter(CommonUrlParts.SCALE_FACTOR, String.valueOf(c0756ph.getScaleFactor()));
        builder.appendQueryParameter(CommonUrlParts.DEVICE_TYPE, c0756ph.getDeviceType());
        a(builder, "clids_set", (String) WrapUtils.getOrDefault(c0756ph.f8082p, ""));
        builder.appendQueryParameter(CommonUrlParts.APP_SET_ID, c0756ph.getAppSetId());
        builder.appendQueryParameter(CommonUrlParts.APP_SET_ID_SCOPE, c0756ph.getAppSetIdScope());
        AdvIdWithLimitedAppender advIdWithLimitedAppender = this.f7254a;
        this.f7257d.getClass();
        advIdWithLimitedAppender.appendParams(builder, C0878ua.f8414H.c().getIdentifiers());
        builder.appendQueryParameter(CommonUrlParts.REQUEST_ID, String.valueOf(this.f7258e));
    }

    public static void a(Uri.Builder builder, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        builder.appendQueryParameter(str, str2);
    }
}
