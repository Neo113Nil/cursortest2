package io.appmetrica.analytics.impl;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class Ao {

    /* renamed from: a, reason: collision with root package name */
    public final Do f6573a;

    /* renamed from: b, reason: collision with root package name */
    public final Do f6574b;

    /* renamed from: c, reason: collision with root package name */
    public final Bo f6575c;

    /* renamed from: d, reason: collision with root package name */
    public JSONObject f6576d;

    public Ao(Do r12, Do r22, Bo bo) {
        this.f6573a = r12;
        this.f6574b = r22;
        this.f6575c = bo;
    }

    public final synchronized JSONObject a() {
        JSONObject jSONObject;
        try {
            if (this.f6576d == null) {
                JSONObject a6 = this.f6575c.a(a(this.f6573a), a(this.f6574b));
                this.f6576d = a6;
                a(a6);
            }
            jSONObject = this.f6576d;
            if (jSONObject == null) {
                kotlin.jvm.internal.i.l("fileContents");
                throw null;
            }
        } catch (Throwable th) {
            throw th;
        }
        return jSONObject;
    }

    public static JSONObject a(Do r12) {
        try {
            String a6 = r12.a();
            return a6 != null ? new JSONObject(a6) : new JSONObject();
        } catch (Throwable unused) {
            return new JSONObject();
        }
    }

    public final synchronized void a(JSONObject jSONObject) {
        String jSONObject2 = jSONObject.toString();
        try {
            this.f6573a.a(jSONObject2);
        } catch (Throwable unused) {
        }
        try {
            this.f6574b.a(jSONObject2);
        } catch (Throwable unused2) {
        }
    }
}
