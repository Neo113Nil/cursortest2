package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.cf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0281cf {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f5656a;

    /* renamed from: b, reason: collision with root package name */
    public final org.json.JSONObject f5657b;

    /* renamed from: c, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.S7 f5658c;

    public C0281cf(java.lang.String str, org.json.JSONObject jSONObject, io.appmetrica.analytics.impl.S7 s7) {
        this.f5656a = str;
        this.f5657b = jSONObject;
        this.f5658c = s7;
    }

    public final java.lang.String toString() {
        return "Candidate{trackingId='" + this.f5656a + "', additionalParams=" + this.f5657b + ", source=" + this.f5658c + '}';
    }
}
