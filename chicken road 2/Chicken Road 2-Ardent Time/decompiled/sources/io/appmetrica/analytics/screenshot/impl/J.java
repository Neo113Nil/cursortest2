package io.appmetrica.analytics.screenshot.impl;

/* loaded from: classes.dex */
public final class J {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7501a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.screenshot.impl.W f7502b;

    public J(boolean z2, io.appmetrica.analytics.screenshot.impl.W w2) {
        this.f7501a = z2;
        this.f7502b = w2;
    }

    public final io.appmetrica.analytics.screenshot.impl.W a() {
        return this.f7502b;
    }

    public final boolean b() {
        return this.f7501a;
    }

    public final java.lang.String toString() {
        return "RemoteScreenshotConfig(enabled=" + this.f7501a + ", config=" + this.f7502b + ')';
    }

    public J() {
        this(new io.appmetrica.analytics.screenshot.impl.S().f7521a, new io.appmetrica.analytics.screenshot.impl.W());
    }
}
