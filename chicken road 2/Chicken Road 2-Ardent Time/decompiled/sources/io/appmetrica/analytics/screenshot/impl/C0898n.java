package io.appmetrica.analytics.screenshot.impl;

/* renamed from: io.appmetrica.analytics.screenshot.impl.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0898n {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7576a;

    /* renamed from: b, reason: collision with root package name */
    public final long f7577b;

    public C0898n(boolean z2, long j2) {
        this.f7576a = z2;
        this.f7577b = j2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!io.appmetrica.analytics.screenshot.impl.C0898n.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.screenshot.impl.config.client.model.ClientSideServiceCaptorConfig");
        }
        io.appmetrica.analytics.screenshot.impl.C0898n c0898n = (io.appmetrica.analytics.screenshot.impl.C0898n) obj;
        return this.f7576a == c0898n.f7576a && this.f7577b == c0898n.f7577b;
    }

    public final int hashCode() {
        return java.lang.Long.hashCode(this.f7577b) + (java.lang.Boolean.hashCode(this.f7576a) * 31);
    }

    public final java.lang.String toString() {
        return "ClientSideServiceCaptorConfig(enabled=" + this.f7576a + ", delaySeconds=" + this.f7577b + ')';
    }

    public C0898n(io.appmetrica.analytics.screenshot.impl.H h2) {
        this(h2.b(), h2.a());
    }
}
