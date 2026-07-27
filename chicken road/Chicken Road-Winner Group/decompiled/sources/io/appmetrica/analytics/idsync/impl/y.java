package io.appmetrica.analytics.idsync.impl;

import java.util.Map;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final String f5626a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f5627b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5628c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f5629d;

    /* renamed from: e, reason: collision with root package name */
    public final int f5630e;
    public final byte[] f;

    /* renamed from: g, reason: collision with root package name */
    public final Map f5631g;

    public y(String str, boolean z3, String str2, boolean z4, int i3, byte[] bArr, Map map) {
        this.f5626a = str;
        this.f5627b = z3;
        this.f5628c = str2;
        this.f5629d = z4;
        this.f5630e = i3;
        this.f = bArr;
        this.f5631g = map;
    }

    public final String toString() {
        return "RequestResult(type='" + this.f5626a + "', isCompleted=" + this.f5627b + ", url=" + this.f5628c + ", responseCodeIsValid=" + this.f5629d + ", responseCode=" + this.f5630e + ", responseBody=" + this.f + ", responseHeaders=" + this.f5631g + ')';
    }
}
