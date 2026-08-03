package io.appmetrica.analytics.screenshot.impl;

/* loaded from: classes.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7571a;

    /* renamed from: b, reason: collision with root package name */
    public final long f7572b;

    public l0(boolean z2, long j2) {
        this.f7571a = z2;
        this.f7572b = j2;
    }

    public final long a() {
        return this.f7572b;
    }

    public final boolean b() {
        return this.f7571a;
    }

    public final java.lang.String toString() {
        return "ServiceSideServiceCaptorConfig(enabled=" + this.f7571a + ", delaySeconds=" + this.f7572b + ')';
    }

    public l0(io.appmetrica.analytics.screenshot.impl.a0 a0Var) {
        this(a0Var.b(), a0Var.a());
    }
}
