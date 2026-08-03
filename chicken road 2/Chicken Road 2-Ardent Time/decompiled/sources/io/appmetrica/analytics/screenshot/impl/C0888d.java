package io.appmetrica.analytics.screenshot.impl;

/* renamed from: io.appmetrica.analytics.screenshot.impl.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0888d implements io.appmetrica.analytics.screenshot.impl.T {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.modulesapi.internal.client.ClientContext f7542a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.screenshot.impl.U f7543b;

    /* renamed from: c, reason: collision with root package name */
    public volatile io.appmetrica.analytics.screenshot.impl.C0894j f7544c;

    /* renamed from: d, reason: collision with root package name */
    public final h1.InterfaceC0171c f7545d = Q1.l.q(new io.appmetrica.analytics.screenshot.impl.C0885a(this));

    public C0888d(io.appmetrica.analytics.modulesapi.internal.client.ClientContext clientContext, io.appmetrica.analytics.screenshot.impl.U u2) {
        this.f7542a = clientContext;
        this.f7543b = u2;
    }

    public static final android.app.Activity.ScreenCaptureCallback d(io.appmetrica.analytics.screenshot.impl.C0888d c0888d) {
        return N0.b.c(((h1.C0175g) c0888d.f7545d).a());
    }

    @Override // io.appmetrica.analytics.screenshot.impl.T
    public final void a(io.appmetrica.analytics.screenshot.impl.C0897m c0897m) {
        this.f7544c = c0897m != null ? c0897m.f7573a : null;
    }

    public final java.lang.String b() {
        return "AndroidApiScreenshotCaptor";
    }

    @Override // io.appmetrica.analytics.screenshot.impl.T
    public final void a() {
        if (io.appmetrica.analytics.coreutils.internal.AndroidUtils.isApiAchieved(34)) {
            this.f7542a.getActivityLifecycleRegistry().registerListener(new io.appmetrica.analytics.screenshot.impl.C0887c(this), io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent.STARTED, io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent.STOPPED);
        }
    }
}
