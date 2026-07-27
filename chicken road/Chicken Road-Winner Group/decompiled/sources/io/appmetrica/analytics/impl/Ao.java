package io.appmetrica.analytics.impl;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class Ao {

    /* renamed from: a, reason: collision with root package name */
    public final Do f5741a;

    /* renamed from: b, reason: collision with root package name */
    public final Do f5742b;

    /* renamed from: c, reason: collision with root package name */
    public final Bo f5743c;

    /* renamed from: d, reason: collision with root package name */
    public JSONObject f5744d;

    public Ao(Do r12, Do r22, Bo bo) {
        this.f5741a = r12;
        this.f5742b = r22;
        this.f5743c = bo;
    }

    public final synchronized JSONObject a() {
        JSONObject jSONObject;
        try {
            if (this.f5744d == null) {
                JSONObject a3 = this.f5743c.a(a(this.f5741a), a(this.f5742b));
                this.f5744d = a3;
                a(a3);
            }
            jSONObject = this.f5744d;
            if (jSONObject == null) {
                kotlin.jvm.internal.j.g("fileContents");
                throw null;
            }
        } catch (Throwable th) {
            throw th;
        }
        return jSONObject;
    }

    public static JSONObject a(Do r12) {
        try {
            String a3 = r12.a();
            return a3 != null ? new JSONObject(a3) : new JSONObject();
        } catch (Throwable unused) {
            return new JSONObject();
        }
    }

    public final synchronized void a(JSONObject jSONObject) {
        String jSONObject2 = jSONObject.toString();
        try {
            this.f5741a.a(jSONObject2);
        } catch (Throwable unused) {
        }
        try {
            this.f5742b.a(jSONObject2);
        } catch (Throwable unused2) {
        }
    }
}
