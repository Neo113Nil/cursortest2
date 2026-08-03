package io.appmetrica.analytics.screenshot.impl;

/* loaded from: classes.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.screenshot.impl.h0 f7566a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.screenshot.impl.l0 f7567b;

    /* renamed from: c, reason: collision with root package name */
    public final io.appmetrica.analytics.screenshot.impl.i0 f7568c;

    public k0(io.appmetrica.analytics.screenshot.impl.h0 h0Var, io.appmetrica.analytics.screenshot.impl.l0 l0Var, io.appmetrica.analytics.screenshot.impl.i0 i0Var) {
        this.f7566a = h0Var;
        this.f7567b = l0Var;
        this.f7568c = i0Var;
    }

    public final io.appmetrica.analytics.screenshot.impl.h0 a() {
        return this.f7566a;
    }

    public final io.appmetrica.analytics.screenshot.impl.i0 b() {
        return this.f7568c;
    }

    public final io.appmetrica.analytics.screenshot.impl.l0 c() {
        return this.f7567b;
    }

    public final java.lang.String toString() {
        return "ServiceSideScreenshotConfig(apiCaptorConfig=" + this.f7566a + ", serviceCaptorConfig=" + this.f7567b + ", contentObserverCaptorConfig=" + this.f7568c + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public k0(io.appmetrica.analytics.screenshot.impl.W w2) {
        this(r2, r3, r5 != null ? new io.appmetrica.analytics.screenshot.impl.i0(r5) : null);
        io.appmetrica.analytics.screenshot.impl.C0889e a2 = w2.a();
        io.appmetrica.analytics.screenshot.impl.h0 h0Var = a2 != null ? new io.appmetrica.analytics.screenshot.impl.h0(a2) : null;
        io.appmetrica.analytics.screenshot.impl.a0 c2 = w2.c();
        io.appmetrica.analytics.screenshot.impl.l0 l0Var = c2 != null ? new io.appmetrica.analytics.screenshot.impl.l0(c2) : null;
        io.appmetrica.analytics.screenshot.impl.C0900p b2 = w2.b();
    }
}
