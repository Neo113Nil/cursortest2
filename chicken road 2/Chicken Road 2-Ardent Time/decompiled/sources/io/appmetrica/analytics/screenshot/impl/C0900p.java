package io.appmetrica.analytics.screenshot.impl;

/* renamed from: io.appmetrica.analytics.screenshot.impl.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0900p {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7580a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f7581b;

    /* renamed from: c, reason: collision with root package name */
    public final long f7582c;

    public C0900p(boolean z2, java.util.List list, long j2) {
        this.f7580a = z2;
        this.f7581b = list;
        this.f7582c = j2;
    }

    public final long a() {
        return this.f7582c;
    }

    public final boolean b() {
        return this.f7580a;
    }

    public final java.util.List c() {
        return this.f7581b;
    }

    public final java.lang.String toString() {
        return "ContentObserverCaptorConfig(enabled=" + this.f7580a + ", mediaStoreColumnNames='" + this.f7581b + "', detectWindowSeconds=" + this.f7582c + ')';
    }

    public C0900p() {
        this(new io.appmetrica.analytics.screenshot.impl.O().f7510a, i1.AbstractC0189h.S(new io.appmetrica.analytics.screenshot.impl.O().f7512c), new io.appmetrica.analytics.screenshot.impl.O().f7511b);
    }
}
