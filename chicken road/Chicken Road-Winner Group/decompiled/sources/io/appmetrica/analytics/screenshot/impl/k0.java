package io.appmetrica.analytics.screenshot.impl;

/* loaded from: classes.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public final h0 f9052a;

    /* renamed from: b, reason: collision with root package name */
    public final l0 f9053b;

    /* renamed from: c, reason: collision with root package name */
    public final i0 f9054c;

    public k0(h0 h0Var, l0 l0Var, i0 i0Var) {
        this.f9052a = h0Var;
        this.f9053b = l0Var;
        this.f9054c = i0Var;
    }

    public final h0 a() {
        return this.f9052a;
    }

    public final i0 b() {
        return this.f9054c;
    }

    public final l0 c() {
        return this.f9053b;
    }

    public final String toString() {
        return "ServiceSideScreenshotConfig(apiCaptorConfig=" + this.f9052a + ", serviceCaptorConfig=" + this.f9053b + ", contentObserverCaptorConfig=" + this.f9054c + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public k0(W w3) {
        this(r2, r3, r5 != null ? new i0(r5) : null);
        C1024e a3 = w3.a();
        h0 h0Var = a3 != null ? new h0(a3) : null;
        a0 c3 = w3.c();
        l0 l0Var = c3 != null ? new l0(c3) : null;
        C1035p b3 = w3.b();
    }
}
