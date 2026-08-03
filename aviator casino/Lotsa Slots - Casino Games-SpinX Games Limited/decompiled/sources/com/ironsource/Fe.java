package com.ironsource;

/* loaded from: classes5.dex */
public final class Fe implements com.ironsource.Ge {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.T9 f5711a = new com.ironsource.T9();
    private final com.ironsource.C3256r9 b = new com.ironsource.C3256r9(com.ironsource.environment.thread.IronSourceThreadManager.INSTANCE.getInitHandler());
    private final com.ironsource.InterfaceC3362x7 c = com.ironsource.Jb.u.d().a();

    public static final class a extends com.ironsource.AbstractRunnableC3136ke {
        final /* synthetic */ java.lang.Runnable b;

        a(java.lang.Runnable runnable) {
            this.b = runnable;
        }

        @Override // com.ironsource.AbstractRunnableC3136ke
        public void a() {
            this.b.run();
        }
    }

    @Override // com.ironsource.Ge
    public com.ironsource.InterfaceC3362x7 a() {
        return this.c;
    }

    @Override // com.ironsource.Ge
    public void b(java.lang.Runnable callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "callback");
        com.ironsource.environment.thread.IronSourceThreadManager.postOnUiThreadTask$default(com.ironsource.environment.thread.IronSourceThreadManager.INSTANCE, callback, 0L, 2, null);
    }

    @Override // com.ironsource.Ge
    public void c(java.lang.Runnable callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "callback");
        this.b.a(callback);
    }

    @Override // com.ironsource.Ge
    public void d(java.lang.Runnable runnable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runnable, "runnable");
        this.b.b(runnable);
    }

    @Override // com.ironsource.Ge
    public void e(java.lang.Runnable runnable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runnable, "runnable");
        com.ironsource.environment.thread.IronSourceThreadManager.postMediationBackgroundTask$default(com.ironsource.environment.thread.IronSourceThreadManager.INSTANCE, runnable, 0L, 2, null);
    }

    @Override // com.ironsource.Ge
    public void f() {
        com.ironsource.Ld.c().a();
    }

    @Override // com.ironsource.Ge
    public com.ironsource.T9 g() {
        return this.f5711a;
    }

    @Override // com.ironsource.Ge
    public void a(java.lang.Runnable runnable, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runnable, "runnable");
        com.ironsource.environment.thread.IronSourceThreadManager.INSTANCE.postOnUiThreadTask(runnable, j);
    }

    @Override // com.ironsource.Ge
    public boolean b(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        return com.ironsource.mediationsdk.utils.IronSourceUtils.g(context);
    }

    @Override // com.ironsource.Ge
    public java.lang.String c(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        java.lang.String b = com.ironsource.mediationsdk.p.h().b(context);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(b, "getInstance().getAdvertiserId(context)");
        return b;
    }

    @Override // com.ironsource.Ge
    public boolean d() {
        return com.ironsource.mediationsdk.utils.IronSourceUtils.g();
    }

    @Override // com.ironsource.Ge
    public void e() {
        com.ironsource.mediationsdk.p.h().I();
    }

    @Override // com.ironsource.Ge
    public void a(com.ironsource.AbstractRunnableC3136ke safeRunnable, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(safeRunnable, "safeRunnable");
        this.b.a(safeRunnable, j);
    }

    @Override // com.ironsource.Ge
    public void b() {
        com.ironsource.Jb.u.d().q().a(new com.ironsource.C3360x5(com.ironsource.EnumC3378y5.USING_CACHE_FOR_INIT_EVENT, com.ironsource.mediationsdk.utils.IronSourceUtils.b(false)));
    }

    @Override // com.ironsource.Ge
    public com.ironsource.C2953aa c() {
        return com.ironsource.mediationsdk.p.h().n();
    }

    @Override // com.ironsource.Ge
    public void a(com.ironsource.AbstractRunnableC3136ke safeRunnable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(safeRunnable, "safeRunnable");
        this.b.a(safeRunnable);
    }

    @Override // com.ironsource.Ge
    public void a(java.lang.Runnable callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "callback");
        com.ironsource.environment.thread.IronSourceThreadManager.postOnUiThreadTask$default(com.ironsource.environment.thread.IronSourceThreadManager.INSTANCE, new com.ironsource.Fe.a(callback), 0L, 2, null);
    }

    @Override // com.ironsource.Ge
    public void a(java.lang.String key, java.lang.String value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        if (android.text.TextUtils.isEmpty(value)) {
            return;
        }
        com.ironsource.J6.a().a(key, value);
    }

    @Override // com.ironsource.Ge
    public void a(long j, com.ironsource.Ve.a responseOrigin) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(responseOrigin, "responseOrigin");
        com.ironsource.mediationsdk.p.h().a(j, responseOrigin);
    }

    @Override // com.ironsource.Ge
    public com.ironsource.Ve a(android.content.Context context, java.lang.String appKey) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appKey, "appKey");
        return com.ironsource.mediationsdk.p.h().a(context, appKey);
    }

    @Override // com.ironsource.Ge
    public java.lang.String a(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        java.lang.String a2 = a().a(context);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a2, "deviceInfoService.getOrG…UniqueIdentifier(context)");
        return a2;
    }

    @Override // com.ironsource.Ge
    public void a(com.ironsource.F1 reporterSettings) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reporterSettings, "reporterSettings");
        com.ironsource.C3180n4.d().a(reporterSettings.b(), reporterSettings.d(), reporterSettings.c(), reporterSettings.e(), com.ironsource.mediationsdk.utils.IronSourceUtils.d(), reporterSettings.a(), reporterSettings.g());
    }

    @Override // com.ironsource.Ge
    public void a(com.ironsource.De initStatus) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initStatus, "initStatus");
        com.ironsource.Ee.f5686a.a(initStatus);
    }
}
