package com.plaid.internal;

/* loaded from: classes16.dex */
public final class H {
    public static java.lang.String a(com.plaid.internal.r rVar, com.plaid.internal.C0608p c0608p) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            for (com.plaid.internal.InterfaceC0634s interfaceC0634s : c0608p.c) {
                jSONArray.put(new org.json.JSONObject().put("u", com.plaid.internal.C0687x7.a(interfaceC0634s.b())).put(lib.android.paypal.com.magnessdk.g.n2, interfaceC0634s.a()));
            }
            java.lang.String str = c0608p.e;
            if (str != null) {
                jSONObject.put("cid", com.plaid.internal.C0687x7.a(str));
            }
            com.plaid.internal.EnumC0580l7 enumC0580l7 = rVar.f6550a;
            if (enumC0580l7 != null) {
                jSONObject.put("st", enumC0580l7.getCode());
            }
            if (rVar.a() != null) {
                jSONObject.put("er", rVar.a().getCode());
            }
            jSONObject.put("os", "and").put("v", 20901).put("fl", c0608p.d).put("rq", jSONArray);
        } catch (org.json.JSONException unused) {
        }
        return android.util.Base64.encodeToString("client-error:".concat(java.lang.String.valueOf(jSONObject)).getBytes(java.nio.charset.StandardCharsets.UTF_8), 10);
    }
}
