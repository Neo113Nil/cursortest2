package io.appmetrica.analytics.idsync.impl;

/* loaded from: classes.dex */
public final class D {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f3884a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3885b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f3886c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f3887d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3888e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f3889f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Map f3890g;

    public D(java.lang.String str, boolean z2, java.lang.String str2, boolean z3, int i2, byte[] bArr, java.util.Map map) {
        this.f3884a = str;
        this.f3885b = z2;
        this.f3886c = str2;
        this.f3887d = z3;
        this.f3888e = i2;
        this.f3889f = bArr;
        this.f3890g = map;
    }

    public final java.lang.String toString() {
        return "RequestResult(type='" + this.f3884a + "', isCompleted=" + this.f3885b + ", url=" + this.f3886c + ", responseCodeIsValid=" + this.f3887d + ", responseCode=" + this.f3888e + ", responseBody=" + this.f3889f + ", responseHeaders=" + this.f3890g + ')';
    }
}
