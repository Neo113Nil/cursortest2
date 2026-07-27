package io.appmetrica.analytics.screenshot.impl;

/* renamed from: io.appmetrica.analytics.screenshot.impl.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1032m {

    /* renamed from: a, reason: collision with root package name */
    public final C1029j f9059a;

    /* renamed from: b, reason: collision with root package name */
    public final C1033n f9060b;

    /* renamed from: c, reason: collision with root package name */
    public final C1030k f9061c;

    public C1032m(C1029j c1029j, C1033n c1033n, C1030k c1030k) {
        this.f9059a = c1029j;
        this.f9060b = c1033n;
        this.f9061c = c1030k;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C1032m.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.screenshot.impl.config.client.model.ClientSideScreenshotConfig");
        }
        C1032m c1032m = (C1032m) obj;
        return kotlin.jvm.internal.j.a(this.f9059a, c1032m.f9059a) && kotlin.jvm.internal.j.a(this.f9060b, c1032m.f9060b) && kotlin.jvm.internal.j.a(this.f9061c, c1032m.f9061c);
    }

    public final int hashCode() {
        C1029j c1029j = this.f9059a;
        int hashCode = (c1029j != null ? c1029j.hashCode() : 0) * 31;
        C1033n c1033n = this.f9060b;
        int hashCode2 = (hashCode + (c1033n != null ? c1033n.hashCode() : 0)) * 31;
        C1030k c1030k = this.f9061c;
        return hashCode2 + (c1030k != null ? c1030k.hashCode() : 0);
    }

    public final String toString() {
        return "ClientSideScreenshotConfig(apiCaptorConfig=" + this.f9059a + ", serviceCaptorConfig=" + this.f9060b + ", contentObserverCaptorConfig=" + this.f9061c + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1032m(F f) {
        this(r2, r3, r5 != null ? new C1030k(r5) : null);
        C1044z a3 = f.a();
        C1029j c1029j = a3 != null ? new C1029j(a3) : null;
        H c3 = f.c();
        C1033n c1033n = c3 != null ? new C1033n(c3) : null;
        B b3 = f.b();
    }
}
