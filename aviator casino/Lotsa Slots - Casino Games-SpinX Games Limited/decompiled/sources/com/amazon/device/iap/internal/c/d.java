package com.amazon.device.iap.internal.c;

/* compiled from: PendingReceipt.java */
/* loaded from: classes2.dex */
class d {

    /* renamed from: a, reason: collision with root package name */
    private final java.lang.String f3488a;
    private final java.lang.String b;
    private final long c;
    private final java.lang.String d;

    public java.lang.String a() {
        return this.d;
    }

    public java.lang.String b() {
        return this.b;
    }

    public long c() {
        return this.c;
    }

    public d(java.lang.String str, java.lang.String str2, java.lang.String str3, long j) {
        this.f3488a = str;
        this.b = str2;
        this.d = str3;
        this.c = j;
    }

    public static com.amazon.device.iap.internal.c.d a(java.lang.String str) throws com.amazon.device.iap.internal.c.e {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            return new com.amazon.device.iap.internal.c.d(jSONObject.getString("KEY_USER_ID"), jSONObject.getString("KEY_RECEIPT_STRING"), jSONObject.getString("KEY_REQUEST_ID"), jSONObject.getLong("KEY_TIMESTAMP"));
        } catch (java.lang.Throwable th) {
            throw new com.amazon.device.iap.internal.c.e("Input invalid for PendingReceipt Object:" + str, th);
        }
    }

    public java.lang.String d() throws org.json.JSONException {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("KEY_USER_ID", this.f3488a);
        jSONObject.put("KEY_RECEIPT_STRING", this.b);
        jSONObject.put("KEY_REQUEST_ID", this.d);
        jSONObject.put("KEY_TIMESTAMP", this.c);
        return jSONObject.toString();
    }
}
