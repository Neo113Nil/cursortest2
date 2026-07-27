package io.appmetrica.analytics.screenshot.impl;

/* loaded from: classes.dex */
public final class W {

    /* renamed from: a, reason: collision with root package name */
    public final C1024e f9011a;

    /* renamed from: b, reason: collision with root package name */
    public final a0 f9012b;

    /* renamed from: c, reason: collision with root package name */
    public final C1035p f9013c;

    public W(C1024e c1024e, a0 a0Var, C1035p c1035p) {
        this.f9011a = c1024e;
        this.f9012b = a0Var;
        this.f9013c = c1035p;
    }

    public final C1024e a() {
        return this.f9011a;
    }

    public final C1035p b() {
        return this.f9013c;
    }

    public final a0 c() {
        return this.f9012b;
    }

    public final String toString() {
        return "ScreenshotConfig(apiCaptorConfig=" + this.f9011a + ", serviceCaptorConfig=" + this.f9012b + ", contentObserverCaptorConfig=" + this.f9013c + ')';
    }

    public W() {
        this(new C1024e(), new a0(), new C1035p());
    }
}
