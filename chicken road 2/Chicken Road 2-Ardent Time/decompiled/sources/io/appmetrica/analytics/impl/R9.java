package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class R9 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f4900a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4901b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f4902c;

    public R9(org.json.JSONObject jSONObject) {
        this.f4900a = jSONObject.getString("name");
        this.f4902c = jSONObject.getBoolean("required");
        this.f4901b = jSONObject.optInt("version", -1);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || io.appmetrica.analytics.impl.R9.class != obj.getClass()) {
            return false;
        }
        io.appmetrica.analytics.impl.R9 r9 = (io.appmetrica.analytics.impl.R9) obj;
        if (this.f4901b != r9.f4901b || this.f4902c != r9.f4902c) {
            return false;
        }
        java.lang.String str = this.f4900a;
        java.lang.String str2 = r9.f4900a;
        return str != null ? str.equals(str2) : str2 == null;
    }

    public final int hashCode() {
        java.lang.String str = this.f4900a;
        return ((((str != null ? str.hashCode() : 0) * 31) + this.f4901b) * 31) + (this.f4902c ? 1 : 0);
    }

    public R9(java.lang.String str, int i2, boolean z2) {
        this.f4900a = str;
        this.f4901b = i2;
        this.f4902c = z2;
    }
}
