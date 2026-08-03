package io.appmetrica.analytics.screenshot.impl;

/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7557a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f7558b;

    /* renamed from: c, reason: collision with root package name */
    public final long f7559c;

    public i0(boolean z2, java.util.List list, long j2) {
        this.f7557a = z2;
        this.f7558b = list;
        this.f7559c = j2;
    }

    public final long a() {
        return this.f7559c;
    }

    public final boolean b() {
        return this.f7557a;
    }

    public final java.util.List c() {
        return this.f7558b;
    }

    public final java.lang.String toString() {
        return "ServiceSideContentObserverCaptorConfig(enabled=" + this.f7557a + ", mediaStoreColumnNames=" + this.f7558b + ", detectWindowSeconds=" + this.f7559c + ')';
    }

    public i0(io.appmetrica.analytics.screenshot.impl.C0900p c0900p) {
        this(c0900p.b(), c0900p.c(), c0900p.a());
    }
}
