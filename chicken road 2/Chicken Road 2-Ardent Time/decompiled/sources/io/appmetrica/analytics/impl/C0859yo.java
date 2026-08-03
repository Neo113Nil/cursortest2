package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.yo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0859yo {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Bo f7170a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Bo f7171b;

    /* renamed from: c, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.zo f7172c;

    /* renamed from: d, reason: collision with root package name */
    public org.json.JSONObject f7173d;

    public C0859yo(io.appmetrica.analytics.impl.Bo bo, io.appmetrica.analytics.impl.Bo bo2, io.appmetrica.analytics.impl.zo zoVar) {
        this.f7170a = bo;
        this.f7171b = bo2;
        this.f7172c = zoVar;
    }

    public final synchronized org.json.JSONObject a() {
        org.json.JSONObject jSONObject;
        try {
            if (this.f7173d == null) {
                org.json.JSONObject a2 = this.f7172c.a(a(this.f7170a), a(this.f7171b));
                this.f7173d = a2;
                a(a2);
            }
            jSONObject = this.f7173d;
            if (jSONObject == null) {
                kotlin.jvm.internal.i.i("fileContents");
                throw null;
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
        return jSONObject;
    }

    public static org.json.JSONObject a(io.appmetrica.analytics.impl.Bo bo) {
        try {
            java.lang.String a2 = bo.a();
            return a2 != null ? new org.json.JSONObject(a2) : new org.json.JSONObject();
        } catch (java.lang.Throwable unused) {
            return new org.json.JSONObject();
        }
    }

    public final synchronized void a(org.json.JSONObject jSONObject) {
        java.lang.String jSONObject2 = jSONObject.toString();
        try {
            this.f7170a.a(jSONObject2);
        } catch (java.lang.Throwable unused) {
        }
        try {
            this.f7171b.a(jSONObject2);
        } catch (java.lang.Throwable unused2) {
        }
    }
}
