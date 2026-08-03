package io.appmetrica.analytics.screenshot.impl;

/* loaded from: classes.dex */
public final class g0 implements io.appmetrica.analytics.screenshot.impl.T {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.modulesapi.internal.client.ClientContext f7550a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.screenshot.impl.U f7551b;

    /* renamed from: c, reason: collision with root package name */
    public final android.os.Handler f7552c;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f7553d;

    /* renamed from: e, reason: collision with root package name */
    public volatile io.appmetrica.analytics.screenshot.impl.C0898n f7554e;

    /* renamed from: f, reason: collision with root package name */
    public final io.appmetrica.analytics.screenshot.impl.d0 f7555f = new io.appmetrica.analytics.screenshot.impl.d0(this);

    public g0(io.appmetrica.analytics.modulesapi.internal.client.ClientContext clientContext, io.appmetrica.analytics.screenshot.impl.U u2) {
        this.f7550a = clientContext;
        this.f7551b = u2;
        this.f7552c = clientContext.getClientExecutorProvider().getDefaultExecutor().getHandler();
    }

    @Override // io.appmetrica.analytics.screenshot.impl.T
    public final void a(io.appmetrica.analytics.screenshot.impl.C0897m c0897m) {
        this.f7554e = c0897m != null ? c0897m.f7574b : null;
    }

    public final java.lang.String b() {
        return "ServiceScreenshotCaptor";
    }

    @Override // io.appmetrica.analytics.screenshot.impl.T
    public final void a() {
        this.f7550a.getActivityLifecycleRegistry().registerListener(new io.appmetrica.analytics.screenshot.impl.f0(this), io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent.RESUMED, io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent.PAUSED);
    }
}
