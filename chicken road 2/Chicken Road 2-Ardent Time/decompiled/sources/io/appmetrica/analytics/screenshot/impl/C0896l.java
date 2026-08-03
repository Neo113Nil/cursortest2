package io.appmetrica.analytics.screenshot.impl;

/* renamed from: io.appmetrica.analytics.screenshot.impl.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0896l {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7569a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.screenshot.impl.C0897m f7570b;

    public C0896l(boolean z2, io.appmetrica.analytics.screenshot.impl.C0897m c0897m) {
        this.f7569a = z2;
        this.f7570b = c0897m;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!io.appmetrica.analytics.screenshot.impl.C0896l.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.screenshot.impl.config.client.model.ClientSideRemoteScreenshotConfig");
        }
        io.appmetrica.analytics.screenshot.impl.C0896l c0896l = (io.appmetrica.analytics.screenshot.impl.C0896l) obj;
        return this.f7569a == c0896l.f7569a && kotlin.jvm.internal.i.a(this.f7570b, c0896l.f7570b);
    }

    public final int hashCode() {
        int hashCode = java.lang.Boolean.hashCode(this.f7569a) * 31;
        io.appmetrica.analytics.screenshot.impl.C0897m c0897m = this.f7570b;
        return hashCode + (c0897m != null ? c0897m.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "ClientSideRemoteScreenshotConfig(enabled=" + this.f7569a + ", config=" + this.f7570b + ')';
    }
}
