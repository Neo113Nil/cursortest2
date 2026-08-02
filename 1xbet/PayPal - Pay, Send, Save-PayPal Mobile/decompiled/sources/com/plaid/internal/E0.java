package com.plaid.internal;

/* loaded from: classes16.dex */
public final class E0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f5775a;

    public E0(android.content.Context context) {
        this.f5775a = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.plaid.internal.D0 a(com.plaid.internal.D0 d0) {
        java.lang.String[] strArr;
        java.lang.String networkOperator;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("sdk", 20901);
        jSONObject.put("accept", "json");
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject.put("device", jSONObject2);
        jSONObject2.put("os", "and");
        java.lang.StringBuilder sb = new java.lang.StringBuilder("");
        sb.append(android.os.Build.VERSION.SDK_INT);
        jSONObject2.put("ver", sb.toString());
        java.lang.String str = android.os.Build.MANUFACTURER;
        java.lang.String str2 = android.os.Build.MODEL;
        if (!str2.startsWith(str)) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(str);
            sb2.append(" ");
            sb2.append(str2);
            str2 = sb2.toString();
        }
        jSONObject2.put("model", str2);
        try {
            networkOperator = ((android.telephony.TelephonyManager) this.f5775a.getSystemService("phone")).getNetworkOperator();
        } catch (java.lang.Exception unused) {
        }
        if (!android.text.TextUtils.isEmpty(networkOperator)) {
            strArr = new java.lang.String[]{networkOperator.substring(0, 3), networkOperator.substring(3)};
            if (strArr.length == 2) {
                jSONObject2.put("mcc", strArr[0]);
                jSONObject2.put("mnc", strArr[1]);
            }
            jSONObject2.put("ip", d0.f5765a);
            if (d0.b != null) {
                org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                jSONObject3.put(androidx.core.app.NotificationCompat.CATEGORY_MESSAGE, com.plaid.internal.C0687x7.a(d0.b.getMessage()));
                java.lang.Exception exc = d0.b;
                if (exc instanceof com.plaid.internal.r) {
                    com.plaid.internal.r rVar = (com.plaid.internal.r) exc;
                    com.plaid.internal.EnumC0580l7 enumC0580l7 = rVar.f6550a;
                    if (enumC0580l7 != null) {
                        jSONObject3.put("st", enumC0580l7.getCode());
                    }
                    if (rVar.a() != null) {
                        jSONObject3.put("er", rVar.a().getCode());
                    }
                }
                jSONObject.put("error", jSONObject3);
            }
            return new com.plaid.internal.D0(d0.f5765a, d0.b, android.util.Base64.encodeToString(jSONObject.toString().getBytes(java.nio.charset.StandardCharsets.UTF_8), 10));
        }
        strArr = new java.lang.String[0];
        if (strArr.length == 2) {
        }
        jSONObject2.put("ip", d0.f5765a);
        if (d0.b != null) {
        }
        return new com.plaid.internal.D0(d0.f5765a, d0.b, android.util.Base64.encodeToString(jSONObject.toString().getBytes(java.nio.charset.StandardCharsets.UTF_8), 10));
    }
}
