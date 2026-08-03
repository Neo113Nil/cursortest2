package io.appmetrica.analytics.idsync.impl;

/* loaded from: classes.dex */
public final class F implements io.appmetrica.analytics.coreapi.internal.data.Converter {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f3894a = "request_state";

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f3895b = "type";

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f3896c = "last_attempt";

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f3897d = "prev_attempt_result";

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [i1.r] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList] */
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final java.lang.String fromModel(java.util.List<io.appmetrica.analytics.idsync.impl.E> list) {
        ?? r2;
        org.json.JSONObject jSONObject;
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        java.lang.String str = this.f3894a;
        if (list != null) {
            r2 = new java.util.ArrayList(i1.AbstractC0192k.K(list));
            for (io.appmetrica.analytics.idsync.impl.E e2 : list) {
                try {
                    jSONObject = new org.json.JSONObject();
                    jSONObject.put(this.f3895b, e2.f3891a);
                    jSONObject.put(this.f3896c, e2.f3892b);
                    jSONObject.put(this.f3897d, io.appmetrica.analytics.idsync.impl.z.a(e2.f3893c));
                } catch (java.lang.Throwable unused) {
                    jSONObject = new org.json.JSONObject();
                }
                r2.add(jSONObject);
            }
        } else {
            r2 = i1.C0199r.f3325a;
        }
        jSONObject2.put(str, new org.json.JSONArray((java.util.Collection) r2));
        return jSONObject2.toString();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final java.util.List<io.appmetrica.analytics.idsync.impl.E> toModel(java.lang.String str) {
        org.json.JSONArray optJSONArray;
        io.appmetrica.analytics.idsync.impl.E e2;
        int i2;
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (str == null || (optJSONArray = new org.json.JSONObject(str).optJSONArray(this.f3894a)) == null) {
                return arrayList;
            }
            int length = optJSONArray.length();
            for (int i3 = 0; i3 < length; i3++) {
                org.json.JSONObject optJSONObject = optJSONArray.optJSONObject(i3);
                if (optJSONObject != null) {
                    try {
                        java.lang.String string = optJSONObject.getString(this.f3895b);
                        long j2 = optJSONObject.getLong(this.f3896c);
                        java.lang.String string2 = optJSONObject.getString(this.f3897d);
                        int[] b2 = io.appmetrica.analytics.idsync.impl.A.b(4);
                        int length2 = b2.length;
                        int i4 = 0;
                        while (true) {
                            if (i4 >= length2) {
                                i2 = 0;
                                break;
                            }
                            i2 = b2[i4];
                            if (kotlin.jvm.internal.i.a(io.appmetrica.analytics.idsync.impl.z.a(i2), string2)) {
                                break;
                            }
                            i4++;
                        }
                        if (i2 == 0) {
                            i2 = 1;
                        }
                        e2 = new io.appmetrica.analytics.idsync.impl.E(string, j2, i2);
                    } catch (java.lang.Throwable unused) {
                        e2 = null;
                    }
                    if (e2 != null) {
                        arrayList.add(e2);
                    }
                }
            }
            return arrayList;
        } catch (java.lang.Throwable unused2) {
            return i1.C0199r.f3325a;
        }
    }
}
