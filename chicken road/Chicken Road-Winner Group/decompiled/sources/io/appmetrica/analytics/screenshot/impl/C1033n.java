package io.appmetrica.analytics.screenshot.impl;

/* renamed from: io.appmetrica.analytics.screenshot.impl.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1033n {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f9062a;

    /* renamed from: b, reason: collision with root package name */
    public final long f9063b;

    public C1033n(boolean z3, long j3) {
        this.f9062a = z3;
        this.f9063b = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C1033n.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.screenshot.impl.config.client.model.ClientSideServiceCaptorConfig");
        }
        C1033n c1033n = (C1033n) obj;
        return this.f9062a == c1033n.f9062a && this.f9063b == c1033n.f9063b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f9063b) + (Boolean.hashCode(this.f9062a) * 31);
    }

    public final String toString() {
        return "ClientSideServiceCaptorConfig(enabled=" + this.f9062a + ", delaySeconds=" + this.f9063b + ')';
    }

    public C1033n(H h3) {
        this(h3.b(), h3.a());
    }
}
