package io.appmetrica.analytics.screenshot.impl;

/* renamed from: io.appmetrica.analytics.screenshot.impl.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1031l {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f9055a;

    /* renamed from: b, reason: collision with root package name */
    public final C1032m f9056b;

    public C1031l(boolean z3, C1032m c1032m) {
        this.f9055a = z3;
        this.f9056b = c1032m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C1031l.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.screenshot.impl.config.client.model.ClientSideRemoteScreenshotConfig");
        }
        C1031l c1031l = (C1031l) obj;
        return this.f9055a == c1031l.f9055a && kotlin.jvm.internal.j.a(this.f9056b, c1031l.f9056b);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.f9055a) * 31;
        C1032m c1032m = this.f9056b;
        return hashCode + (c1032m != null ? c1032m.hashCode() : 0);
    }

    public final String toString() {
        return "ClientSideRemoteScreenshotConfig(enabled=" + this.f9055a + ", config=" + this.f9056b + ')';
    }
}
