package io.appmetrica.analytics.screenshot.impl;

/* loaded from: classes.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f9057a;

    /* renamed from: b, reason: collision with root package name */
    public final long f9058b;

    public l0(boolean z3, long j3) {
        this.f9057a = z3;
        this.f9058b = j3;
    }

    public final long a() {
        return this.f9058b;
    }

    public final boolean b() {
        return this.f9057a;
    }

    public final String toString() {
        return "ServiceSideServiceCaptorConfig(enabled=" + this.f9057a + ", delaySeconds=" + this.f9058b + ')';
    }

    public l0(a0 a0Var) {
        this(a0Var.b(), a0Var.a());
    }
}
