package io.appmetrica.analytics.screenshot.impl;

/* renamed from: io.appmetrica.analytics.screenshot.impl.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0897m {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.screenshot.impl.C0894j f7573a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.screenshot.impl.C0898n f7574b;

    /* renamed from: c, reason: collision with root package name */
    public final io.appmetrica.analytics.screenshot.impl.C0895k f7575c;

    public C0897m(io.appmetrica.analytics.screenshot.impl.C0894j c0894j, io.appmetrica.analytics.screenshot.impl.C0898n c0898n, io.appmetrica.analytics.screenshot.impl.C0895k c0895k) {
        this.f7573a = c0894j;
        this.f7574b = c0898n;
        this.f7575c = c0895k;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!io.appmetrica.analytics.screenshot.impl.C0897m.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.screenshot.impl.config.client.model.ClientSideScreenshotConfig");
        }
        io.appmetrica.analytics.screenshot.impl.C0897m c0897m = (io.appmetrica.analytics.screenshot.impl.C0897m) obj;
        return kotlin.jvm.internal.i.a(this.f7573a, c0897m.f7573a) && kotlin.jvm.internal.i.a(this.f7574b, c0897m.f7574b) && kotlin.jvm.internal.i.a(this.f7575c, c0897m.f7575c);
    }

    public final int hashCode() {
        io.appmetrica.analytics.screenshot.impl.C0894j c0894j = this.f7573a;
        int hashCode = (c0894j != null ? c0894j.hashCode() : 0) * 31;
        io.appmetrica.analytics.screenshot.impl.C0898n c0898n = this.f7574b;
        int hashCode2 = (hashCode + (c0898n != null ? c0898n.hashCode() : 0)) * 31;
        io.appmetrica.analytics.screenshot.impl.C0895k c0895k = this.f7575c;
        return hashCode2 + (c0895k != null ? c0895k.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "ClientSideScreenshotConfig(apiCaptorConfig=" + this.f7573a + ", serviceCaptorConfig=" + this.f7574b + ", contentObserverCaptorConfig=" + this.f7575c + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0897m(io.appmetrica.analytics.screenshot.impl.F f2) {
        this(r2, r3, r5 != null ? new io.appmetrica.analytics.screenshot.impl.C0895k(r5) : null);
        io.appmetrica.analytics.screenshot.impl.C0909z a2 = f2.a();
        io.appmetrica.analytics.screenshot.impl.C0894j c0894j = a2 != null ? new io.appmetrica.analytics.screenshot.impl.C0894j(a2) : null;
        io.appmetrica.analytics.screenshot.impl.H c2 = f2.c();
        io.appmetrica.analytics.screenshot.impl.C0898n c0898n = c2 != null ? new io.appmetrica.analytics.screenshot.impl.C0898n(c2) : null;
        io.appmetrica.analytics.screenshot.impl.B b2 = f2.b();
    }
}
