package io.appmetrica.analytics.screenshot.impl;

/* loaded from: classes.dex */
public final class W {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.screenshot.impl.C0889e f7524a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.screenshot.impl.a0 f7525b;

    /* renamed from: c, reason: collision with root package name */
    public final io.appmetrica.analytics.screenshot.impl.C0900p f7526c;

    public W(io.appmetrica.analytics.screenshot.impl.C0889e c0889e, io.appmetrica.analytics.screenshot.impl.a0 a0Var, io.appmetrica.analytics.screenshot.impl.C0900p c0900p) {
        this.f7524a = c0889e;
        this.f7525b = a0Var;
        this.f7526c = c0900p;
    }

    public final io.appmetrica.analytics.screenshot.impl.C0889e a() {
        return this.f7524a;
    }

    public final io.appmetrica.analytics.screenshot.impl.C0900p b() {
        return this.f7526c;
    }

    public final io.appmetrica.analytics.screenshot.impl.a0 c() {
        return this.f7525b;
    }

    public final java.lang.String toString() {
        return "ScreenshotConfig(apiCaptorConfig=" + this.f7524a + ", serviceCaptorConfig=" + this.f7525b + ", contentObserverCaptorConfig=" + this.f7526c + ')';
    }

    public W() {
        this(new io.appmetrica.analytics.screenshot.impl.C0889e(), new io.appmetrica.analytics.screenshot.impl.a0(), new io.appmetrica.analytics.screenshot.impl.C0900p());
    }
}
