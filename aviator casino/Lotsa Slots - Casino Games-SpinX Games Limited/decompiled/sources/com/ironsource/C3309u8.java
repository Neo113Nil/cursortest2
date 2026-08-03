package com.ironsource;

/* renamed from: com.ironsource.u8, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3309u8 implements com.ironsource.F7 {
    @Override // com.ironsource.F7
    public java.lang.String a(java.util.Map<java.lang.String, java.lang.Object> map) {
        try {
            return java.lang.String.format("%s=%s", "data", android.util.Base64.encodeToString(new org.json.JSONObject().put(com.ironsource.B5.R, com.ironsource.B5.S).put("data", new org.json.JSONObject(map)).toString().getBytes(), 2));
        } catch (org.json.JSONException e) {
            com.ironsource.C3180n4.d().a(e);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
            return "";
        }
    }
}
