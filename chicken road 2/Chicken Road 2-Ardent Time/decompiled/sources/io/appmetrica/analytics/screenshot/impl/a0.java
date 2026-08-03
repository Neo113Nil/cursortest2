package io.appmetrica.analytics.screenshot.impl;

/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7538a;

    /* renamed from: b, reason: collision with root package name */
    public final long f7539b;

    public a0(boolean z2, long j2) {
        this.f7538a = z2;
        this.f7539b = j2;
    }

    public final long a() {
        return this.f7539b;
    }

    public final boolean b() {
        return this.f7538a;
    }

    public final java.lang.String toString() {
        return "ServiceCaptorConfig(enabled=" + this.f7538a + ", delaySeconds=" + this.f7539b + ')';
    }

    public a0() {
        this(new io.appmetrica.analytics.screenshot.impl.P().f7514a, new io.appmetrica.analytics.screenshot.impl.P().f7515b);
    }
}
