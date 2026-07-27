package io.appmetrica.analytics.screenshot.impl;

/* renamed from: io.appmetrica.analytics.screenshot.impl.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1029j {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f9046a;

    public C1029j(boolean z3) {
        this.f9046a = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C1029j.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj != null) {
            return this.f9046a == ((C1029j) obj).f9046a;
        }
        throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.screenshot.impl.config.client.model.ClientSideApiCaptorConfig");
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f9046a);
    }

    public final String toString() {
        return "ClientSideApiCaptorConfig(enabled=" + this.f9046a + ')';
    }

    public C1029j(C1044z c1044z) {
        this(c1044z.a());
    }
}
