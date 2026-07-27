package io.appmetrica.analytics.impl;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class Y9 {

    /* renamed from: a, reason: collision with root package name */
    public final String f7737a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7738b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f7739c;

    public Y9(JSONObject jSONObject) {
        this.f7737a = jSONObject.getString("name");
        this.f7739c = jSONObject.getBoolean("required");
        this.f7738b = jSONObject.optInt("version", -1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Y9.class != obj.getClass()) {
            return false;
        }
        Y9 y9 = (Y9) obj;
        if (this.f7738b != y9.f7738b || this.f7739c != y9.f7739c) {
            return false;
        }
        String str = this.f7737a;
        String str2 = y9.f7737a;
        return str != null ? str.equals(str2) : str2 == null;
    }

    public final int hashCode() {
        String str = this.f7737a;
        return ((((str != null ? str.hashCode() : 0) * 31) + this.f7738b) * 31) + (this.f7739c ? 1 : 0);
    }

    public Y9(String str, int i2, boolean z) {
        this.f7737a = str;
        this.f7738b = i2;
        this.f7739c = z;
    }
}
