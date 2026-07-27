package io.appmetrica.analytics.screenshot.impl;

/* renamed from: io.appmetrica.analytics.screenshot.impl.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1180l {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f10037a;

    /* renamed from: b, reason: collision with root package name */
    public final C1181m f10038b;

    public C1180l(boolean z, C1181m c1181m) {
        this.f10037a = z;
        this.f10038b = c1181m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C1180l.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.screenshot.impl.config.client.model.ClientSideRemoteScreenshotConfig");
        }
        C1180l c1180l = (C1180l) obj;
        return this.f10037a == c1180l.f10037a && kotlin.jvm.internal.i.a(this.f10038b, c1180l.f10038b);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.f10037a) * 31;
        C1181m c1181m = this.f10038b;
        return hashCode + (c1181m != null ? c1181m.hashCode() : 0);
    }

    public final String toString() {
        return "ClientSideRemoteScreenshotConfig(enabled=" + this.f10037a + ", config=" + this.f10038b + ')';
    }
}
