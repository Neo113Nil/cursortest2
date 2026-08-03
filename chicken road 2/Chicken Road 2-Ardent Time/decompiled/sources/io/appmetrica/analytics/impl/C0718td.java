package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.td, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0718td {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f6854a;

    /* renamed from: b, reason: collision with root package name */
    public final long f6855b;

    public C0718td(java.util.List list, long j2) {
        this.f6854a = list;
        this.f6855b = j2;
    }

    public final java.lang.String a() {
        org.json.JSONObject jSONObject;
        try {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            java.util.List<io.appmetrica.analytics.impl.C0253bd> list = this.f6854a;
            java.util.ArrayList arrayList = new java.util.ArrayList(i1.AbstractC0192k.K(list));
            for (io.appmetrica.analytics.impl.C0253bd c0253bd : list) {
                c0253bd.getClass();
                try {
                    jSONObject = new org.json.JSONObject();
                    jSONObject.put("moduleName", c0253bd.f5576a);
                    jSONObject.put("loaded", c0253bd.f5577b);
                } catch (java.lang.Throwable unused) {
                    jSONObject = new org.json.JSONObject();
                }
                arrayList.add(jSONObject);
            }
            jSONObject2.put("modulesStatus", new org.json.JSONArray((java.util.Collection) arrayList));
            jSONObject2.put("lastSendTime", this.f6855b);
            return jSONObject2.toString();
        } catch (java.lang.Throwable unused2) {
            return "";
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof io.appmetrica.analytics.impl.C0718td)) {
            return false;
        }
        io.appmetrica.analytics.impl.C0718td c0718td = (io.appmetrica.analytics.impl.C0718td) obj;
        return kotlin.jvm.internal.i.a(this.f6854a, c0718td.f6854a) && this.f6855b == c0718td.f6855b;
    }

    public final int hashCode() {
        return java.lang.Long.hashCode(this.f6855b) + (this.f6854a.hashCode() * 31);
    }

    public final java.lang.String toString() {
        return "ModulesStatus(modulesStatus=" + this.f6854a + ", lastSendTime=" + this.f6855b + ')';
    }
}
