package io.appmetrica.analytics.screenshot.impl;

/* loaded from: classes.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public final h0 f10034a;

    /* renamed from: b, reason: collision with root package name */
    public final l0 f10035b;

    /* renamed from: c, reason: collision with root package name */
    public final i0 f10036c;

    public k0(h0 h0Var, l0 l0Var, i0 i0Var) {
        this.f10034a = h0Var;
        this.f10035b = l0Var;
        this.f10036c = i0Var;
    }

    public final h0 a() {
        return this.f10034a;
    }

    public final i0 b() {
        return this.f10036c;
    }

    public final l0 c() {
        return this.f10035b;
    }

    public final String toString() {
        return "ServiceSideScreenshotConfig(apiCaptorConfig=" + this.f10034a + ", serviceCaptorConfig=" + this.f10035b + ", contentObserverCaptorConfig=" + this.f10036c + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public k0(W w3) {
        this(r2, r3, r5 != null ? new i0(r5) : null);
        C1173e a6 = w3.a();
        h0 h0Var = a6 != null ? new h0(a6) : null;
        a0 c2 = w3.c();
        l0 l0Var = c2 != null ? new l0(c2) : null;
        C1184p b6 = w3.b();
    }
}
