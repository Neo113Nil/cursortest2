package io.appmetrica.analytics.screenshot.impl;

/* renamed from: io.appmetrica.analytics.screenshot.impl.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0905v implements io.appmetrica.analytics.screenshot.impl.T {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.modulesapi.internal.client.ClientContext f7586a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.screenshot.impl.U f7587b;

    /* renamed from: c, reason: collision with root package name */
    public volatile io.appmetrica.analytics.screenshot.impl.C0895k f7588c;

    /* renamed from: d, reason: collision with root package name */
    public final io.appmetrica.analytics.screenshot.impl.Z f7589d;

    public C0905v(io.appmetrica.analytics.modulesapi.internal.client.ClientContext clientContext, io.appmetrica.analytics.screenshot.impl.U u2) {
        this.f7586a = clientContext;
        this.f7587b = u2;
        this.f7589d = new io.appmetrica.analytics.screenshot.impl.Z(clientContext, new io.appmetrica.analytics.screenshot.impl.C0902s(this));
    }

    @Override // io.appmetrica.analytics.screenshot.impl.T
    public final void a(io.appmetrica.analytics.screenshot.impl.C0897m c0897m) {
        this.f7588c = c0897m != null ? c0897m.f7575c : null;
        this.f7589d.f7536c = this.f7588c;
    }

    public final java.lang.String b() {
        return "ContentObserverScreenshotCaptor";
    }

    @Override // io.appmetrica.analytics.screenshot.impl.T
    public final void a() {
        this.f7586a.getActivityLifecycleRegistry().registerListener(new io.appmetrica.analytics.screenshot.impl.C0904u(this), io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent.RESUMED, io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent.PAUSED);
    }
}
