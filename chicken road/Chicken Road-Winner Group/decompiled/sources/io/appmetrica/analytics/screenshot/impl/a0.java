package io.appmetrica.analytics.screenshot.impl;

/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f9025a;

    /* renamed from: b, reason: collision with root package name */
    public final long f9026b;

    public a0(boolean z3, long j3) {
        this.f9025a = z3;
        this.f9026b = j3;
    }

    public final long a() {
        return this.f9026b;
    }

    public final boolean b() {
        return this.f9025a;
    }

    public final String toString() {
        return "ServiceCaptorConfig(enabled=" + this.f9025a + ", delaySeconds=" + this.f9026b + ')';
    }

    public a0() {
        this(new P().f9001a, new P().f9002b);
    }
}
