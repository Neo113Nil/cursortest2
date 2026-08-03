package io.appmetrica.analytics.screenshot.impl;

/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7561a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.screenshot.impl.k0 f7562b;

    public j0(boolean z2, io.appmetrica.analytics.screenshot.impl.k0 k0Var) {
        this.f7561a = z2;
        this.f7562b = k0Var;
    }

    public final io.appmetrica.analytics.screenshot.impl.k0 a() {
        return this.f7562b;
    }

    public final boolean b() {
        return this.f7561a;
    }

    public final java.lang.String toString() {
        return "ServiceSideRemoteScreenshotConfig(enabled=" + this.f7561a + ", config=" + this.f7562b + ')';
    }

    public j0() {
        this(new io.appmetrica.analytics.screenshot.impl.J());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public j0(io.appmetrica.analytics.screenshot.impl.J j2) {
        this(r0, r3 != null ? new io.appmetrica.analytics.screenshot.impl.k0(r3) : null);
        boolean b2 = j2.b();
        io.appmetrica.analytics.screenshot.impl.W a2 = j2.a();
    }
}
