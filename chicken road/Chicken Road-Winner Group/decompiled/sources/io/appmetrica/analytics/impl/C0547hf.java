package io.appmetrica.analytics.impl;

import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.hf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0547hf {

    /* renamed from: a, reason: collision with root package name */
    public final String f7417a;

    /* renamed from: b, reason: collision with root package name */
    public final JSONObject f7418b;

    /* renamed from: c, reason: collision with root package name */
    public final Y7 f7419c;

    public C0547hf(String str, JSONObject jSONObject, Y7 y7) {
        this.f7417a = str;
        this.f7418b = jSONObject;
        this.f7419c = y7;
    }

    public final String toString() {
        return "Candidate{trackingId='" + this.f7417a + "', additionalParams=" + this.f7418b + ", source=" + this.f7419c + '}';
    }
}
