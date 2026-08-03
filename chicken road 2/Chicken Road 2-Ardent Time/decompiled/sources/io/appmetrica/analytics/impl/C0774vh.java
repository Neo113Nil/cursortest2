package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.vh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0774vh {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.P5 f6974a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f6975b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6976c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f6977d;

    /* renamed from: e, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Fh f6978e;

    public C0774vh(io.appmetrica.analytics.impl.P5 p5, boolean z2, int i2, java.util.HashMap hashMap, io.appmetrica.analytics.impl.Fh fh) {
        this.f6974a = p5;
        this.f6975b = z2;
        this.f6976c = i2;
        this.f6977d = hashMap;
        this.f6978e = fh;
    }

    public final java.lang.String toString() {
        return "ReportToSend(report=" + this.f6974a + ", serviceDataReporterType=" + this.f6976c + ", environment=" + this.f6978e + ", isCrashReport=" + this.f6975b + ", trimmedFields=" + this.f6977d + ')';
    }
}
