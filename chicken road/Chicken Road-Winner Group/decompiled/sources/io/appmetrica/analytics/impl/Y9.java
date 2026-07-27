package io.appmetrica.analytics.impl;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class Y9 {

    /* renamed from: a, reason: collision with root package name */
    public final String f6860a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6861b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f6862c;

    public Y9(JSONObject jSONObject) {
        this.f6860a = jSONObject.getString("name");
        this.f6862c = jSONObject.getBoolean("required");
        this.f6861b = jSONObject.optInt("version", -1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Y9.class == obj.getClass()) {
            Y9 y9 = (Y9) obj;
            if (this.f6861b != y9.f6861b || this.f6862c != y9.f6862c) {
                return false;
            }
            String str = this.f6860a;
            String str2 = y9.f6860a;
            if (str != null) {
                return str.equals(str2);
            }
            if (str2 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f6860a;
        return ((((str != null ? str.hashCode() : 0) * 31) + this.f6861b) * 31) + (this.f6862c ? 1 : 0);
    }

    public Y9(String str, int i3, boolean z3) {
        this.f6860a = str;
        this.f6861b = i3;
        this.f6862c = z3;
    }
}
