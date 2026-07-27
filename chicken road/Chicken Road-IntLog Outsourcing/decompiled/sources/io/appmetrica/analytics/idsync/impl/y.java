package io.appmetrica.analytics.idsync.impl;

import java.util.Map;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final String f6452a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f6453b;

    /* renamed from: c, reason: collision with root package name */
    public final String f6454c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f6455d;

    /* renamed from: e, reason: collision with root package name */
    public final int f6456e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f6457f;

    /* renamed from: g, reason: collision with root package name */
    public final Map f6458g;

    public y(String str, boolean z, String str2, boolean z5, int i2, byte[] bArr, Map map) {
        this.f6452a = str;
        this.f6453b = z;
        this.f6454c = str2;
        this.f6455d = z5;
        this.f6456e = i2;
        this.f6457f = bArr;
        this.f6458g = map;
    }

    public final String toString() {
        return "RequestResult(type='" + this.f6452a + "', isCompleted=" + this.f6453b + ", url=" + this.f6454c + ", responseCodeIsValid=" + this.f6455d + ", responseCode=" + this.f6456e + ", responseBody=" + this.f6457f + ", responseHeaders=" + this.f6458g + ')';
    }
}
