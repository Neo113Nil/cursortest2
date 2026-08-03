package io.appmetrica.analytics.screenshot.impl;

/* renamed from: io.appmetrica.analytics.screenshot.impl.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0894j {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7560a;

    public C0894j(boolean z2) {
        this.f7560a = z2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!io.appmetrica.analytics.screenshot.impl.C0894j.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj != null) {
            return this.f7560a == ((io.appmetrica.analytics.screenshot.impl.C0894j) obj).f7560a;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.screenshot.impl.config.client.model.ClientSideApiCaptorConfig");
    }

    public final int hashCode() {
        return java.lang.Boolean.hashCode(this.f7560a);
    }

    public final java.lang.String toString() {
        return "ClientSideApiCaptorConfig(enabled=" + this.f7560a + ')';
    }

    public C0894j(io.appmetrica.analytics.screenshot.impl.C0909z c0909z) {
        this(c0909z.a());
    }
}
