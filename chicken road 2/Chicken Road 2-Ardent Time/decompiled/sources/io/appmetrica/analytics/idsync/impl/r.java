package io.appmetrica.analytics.idsync.impl;

/* loaded from: classes.dex */
public final class r implements io.appmetrica.analytics.idsync.impl.s {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.modulesapi.internal.service.ServiceContext f3966a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f3967b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f3968c = io.appmetrica.analytics.networktasks.internal.CommonUrlParts.ADV_ID;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f3969d = io.appmetrica.analytics.networktasks.internal.CommonUrlParts.HUAWEI_OAID;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f3970e = io.appmetrica.analytics.networktasks.internal.CommonUrlParts.YANDEX_ADV_ID;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f3971f = io.appmetrica.analytics.networktasks.internal.CommonUrlParts.UUID;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f3972g = io.appmetrica.analytics.networktasks.internal.CommonUrlParts.DEVICE_ID;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f3973h = io.appmetrica.analytics.networktasks.internal.CommonUrlParts.APP_SET_ID;

    /* renamed from: i, reason: collision with root package name */
    public final long f3974i = java.util.concurrent.TimeUnit.SECONDS.toMillis(60);

    /* renamed from: j, reason: collision with root package name */
    public final long f3975j = 1000;

    /* renamed from: k, reason: collision with root package name */
    public final io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider f3976k = new io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider();

    /* renamed from: l, reason: collision with root package name */
    public final io.appmetrica.analytics.idsync.impl.u f3977l;

    public r(io.appmetrica.analytics.modulesapi.internal.service.ServiceContext serviceContext, java.lang.String str) {
        this.f3966a = serviceContext;
        this.f3967b = str;
        this.f3977l = new io.appmetrica.analytics.idsync.impl.u(serviceContext);
    }

    @Override // io.appmetrica.analytics.idsync.impl.s
    public final void a(final java.lang.String str, io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers sdkIdentifiers) {
        io.appmetrica.analytics.coreapi.internal.identifiers.PlatformIdentifiers platformIdentifiers = this.f3966a.getPlatformIdentifiers();
        io.appmetrica.analytics.coreapi.internal.identifiers.AdvertisingIdsHolder identifiers = platformIdentifiers.getAdvIdentifiersProvider().getIdentifiers(this.f3966a.getContext());
        android.net.Uri.Builder buildUpon = android.net.Uri.parse(this.f3967b).buildUpon();
        io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfo adTrackingInfo = identifiers.getGoogle().mAdTrackingInfo;
        if (adTrackingInfo != null) {
            buildUpon.appendQueryParameter(this.f3968c, adTrackingInfo.advId);
        }
        io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfo adTrackingInfo2 = identifiers.getHuawei().mAdTrackingInfo;
        if (adTrackingInfo2 != null) {
            buildUpon.appendQueryParameter(this.f3969d, adTrackingInfo2.advId);
        }
        io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfo adTrackingInfo3 = identifiers.getYandex().mAdTrackingInfo;
        if (adTrackingInfo3 != null) {
            buildUpon.appendQueryParameter(this.f3970e, adTrackingInfo3.advId);
        }
        buildUpon.appendQueryParameter(this.f3971f, sdkIdentifiers.getUuid());
        buildUpon.appendQueryParameter(this.f3972g, sdkIdentifiers.getDeviceId());
        java.lang.String id = platformIdentifiers.getAppSetIdProvider().getAppSetId().getId();
        if (id != null) {
            buildUpon.appendQueryParameter(this.f3973h, id);
        }
        final java.lang.String uri = buildUpon.build().toString();
        final io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor supportIOExecutor = this.f3966a.getExecutorProvider().getSupportIOExecutor();
        final long currentTimeMillis = this.f3976k.currentTimeMillis();
        supportIOExecutor.execute(new java.lang.Runnable() { // from class: L0.a
            @Override // java.lang.Runnable
            public final void run() {
                io.appmetrica.analytics.idsync.impl.r.a(io.appmetrica.analytics.idsync.impl.r.this, uri, str, supportIOExecutor, currentTimeMillis);
            }
        });
    }

    public static final void a(io.appmetrica.analytics.idsync.impl.r rVar, java.lang.String str, java.lang.String str2, io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor iHandlerExecutor, long j2) {
        long j3 = rVar.f3975j;
        if (rVar.f3977l.a(str, str2)) {
            return;
        }
        rVar.a(str, str2, iHandlerExecutor, j2, 0, j3);
    }

    public static final void a(io.appmetrica.analytics.idsync.impl.r rVar, java.lang.String str, java.lang.String str2, io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor iHandlerExecutor, long j2, int i2, long j3) {
        int i3 = i2 + 1;
        if (rVar.f3977l.a(str, str2)) {
            return;
        }
        rVar.a(str, str2, iHandlerExecutor, j2, i3, j3);
    }

    public final void a(final java.lang.String str, final java.lang.String str2, final io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor iHandlerExecutor, final long j2, final int i2, long j3) {
        final long j4 = j3 * 2;
        if ((this.f3976k.currentTimeMillis() - j2) + j4 <= this.f3974i) {
            iHandlerExecutor.executeDelayed(new java.lang.Runnable() { // from class: L0.b
                @Override // java.lang.Runnable
                public final void run() {
                    io.appmetrica.analytics.idsync.impl.r.a(io.appmetrica.analytics.idsync.impl.r.this, str, str2, iHandlerExecutor, j2, i2, j4);
                }
            }, j3);
        }
    }
}
