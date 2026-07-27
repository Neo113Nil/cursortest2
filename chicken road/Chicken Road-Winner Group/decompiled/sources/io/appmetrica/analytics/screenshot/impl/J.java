package io.appmetrica.analytics.screenshot.impl;

/* loaded from: classes.dex */
public final class J {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f8988a;

    /* renamed from: b, reason: collision with root package name */
    public final W f8989b;

    public J(boolean z3, W w3) {
        this.f8988a = z3;
        this.f8989b = w3;
    }

    public final W a() {
        return this.f8989b;
    }

    public final boolean b() {
        return this.f8988a;
    }

    public final String toString() {
        return "RemoteScreenshotConfig(enabled=" + this.f8988a + ", config=" + this.f8989b + ')';
    }

    public J() {
        this(new S().f9008a, new W());
    }
}
