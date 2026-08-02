package com.dyneti.android.dyscan;

/* loaded from: classes8.dex */
public final class n2 {

    /* renamed from: a, reason: collision with root package name */
    public final org.json.JSONObject f3326a = new org.json.JSONObject();

    public final void a(java.lang.String str, boolean z) {
        try {
            this.f3326a.put(str, z);
        } catch (org.json.JSONException e) {
            a(str, e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Double[]] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v7, types: [double[]] */
    public final void b(java.lang.String str, java.lang.Object obj) {
        org.json.JSONArray jSONArray;
        ?? r0;
        if (obj != null) {
            int i = 0;
            if (obj instanceof float[]) {
                float[] fArr = (float[]) obj;
                r0 = new double[fArr.length];
                while (i < fArr.length) {
                    r0[i] = fArr[i];
                    i++;
                }
            } else if (obj instanceof java.lang.Float[]) {
                java.lang.Float[] fArr2 = (java.lang.Float[]) obj;
                r0 = new java.lang.Double[fArr2.length];
                while (i < fArr2.length) {
                    r0[i] = java.lang.Double.valueOf(fArr2[i].floatValue());
                    i++;
                }
            }
            obj = r0;
        }
        if (obj == null) {
            jSONArray = null;
        } else {
            try {
                jSONArray = new org.json.JSONArray(obj);
            } catch (org.json.JSONException e) {
                a(str, e);
                return;
            }
        }
        a(str, jSONArray);
    }

    public final java.lang.String toString() {
        return this.f3326a.toString();
    }

    public final void a(java.lang.String str, double d) {
        try {
            this.f3326a.put(str, d);
        } catch (org.json.JSONException e) {
            a(str, e);
        }
    }

    public final void a(java.lang.String str, int i) {
        try {
            this.f3326a.put(str, i);
        } catch (org.json.JSONException e) {
            a(str, e);
        }
    }

    public final void a(java.lang.String str, java.lang.String str2) {
        try {
            this.f3326a.put(str, str2);
        } catch (org.json.JSONException e) {
            a(str, e);
        }
    }

    public final void a(java.lang.String str, java.lang.Object obj) {
        try {
            this.f3326a.put(str, obj);
        } catch (org.json.JSONException e) {
            a(str, e);
        }
    }

    public final void a(java.lang.String str, org.json.JSONException jSONException) {
        try {
            this.f3326a.put("jsonExceptionKey", str);
            this.f3326a.put("jsonExceptionMessage", jSONException.getMessage());
        } catch (org.json.JSONException unused) {
        }
    }
}
