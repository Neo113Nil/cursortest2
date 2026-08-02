package com.plaid.internal;

/* renamed from: com.plaid.internal.i1, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0547i1 implements com.plaid.internal.InterfaceC0529g1 {
    public static final com.plaid.internal.C0680x0 b;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f6435a;

    public C0547i1(java.lang.String str) {
        this.f6435a = str;
    }

    static {
        com.plaid.internal.W3 w3 = com.plaid.internal.Z3.f5986a;
        b = new com.plaid.internal.C0680x0("flowV1");
    }

    @Override // com.plaid.internal.InterfaceC0529g1
    public final java.lang.String a(com.plaid.internal.InterfaceC0627r1 interfaceC0627r1, com.plaid.internal.C0608p c0608p) {
        com.plaid.internal.InterfaceC0627r1.b a2;
        int i;
        c0608p.d = "v1";
        java.lang.String str = this.f6435a;
        java.lang.String str2 = (java.lang.String) com.plaid.internal.AbstractC0663v1.b(str).get("cid");
        if (str2 == null) {
            java.util.LinkedHashMap b2 = com.plaid.internal.AbstractC0663v1.b(str);
            java.lang.String str3 = (java.lang.String) b2.get("vfp");
            str2 = str3 == null ? (java.lang.String) b2.get(com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY) : str3;
        }
        c0608p.e = str2;
        java.util.LinkedHashMap b3 = com.plaid.internal.AbstractC0663v1.b(this.f6435a);
        java.lang.String str4 = (java.lang.String) b3.get("vfp");
        if (str4 == null) {
            str4 = (java.lang.String) b3.get(com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY);
        }
        int i2 = 0;
        while (true) {
            try {
                com.plaid.internal.C0608p.a aVar = new com.plaid.internal.C0608p.a(str);
                c0608p.c.add(aVar);
                a2 = interfaceC0627r1.a(new com.plaid.internal.InterfaceC0627r1.a(str, false, null, ((java.lang.Number) c0608p.f.a("connection-timeout", 10000, java.lang.Number.class)).intValue()));
                i = a2.b;
                aVar.b = i;
                if (i >= 200 && i <= 202) {
                    if (c0608p.f.a("forward-mno-response")) {
                        org.json.JSONObject jSONObject = new org.json.JSONObject();
                        try {
                            jSONObject.put("status", a2.b);
                            jSONObject.put("statusText", a2.c);
                            jSONObject.put("headers", new org.json.JSONObject(a2.d));
                            jSONObject.put(com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.BODY, a2.f6553a);
                            return android.util.Base64.encodeToString("mno-resp:".concat(java.lang.String.valueOf(jSONObject)).getBytes(java.nio.charset.StandardCharsets.UTF_8), 10);
                        } catch (org.json.JSONException e) {
                            throw new com.plaid.internal.C0617q(com.plaid.internal.T0.GENERIC_UNKNOWN_REASON, e);
                        }
                    }
                    java.lang.String str5 = a2.f6553a;
                    try {
                        java.lang.String a3 = a(new org.json.JSONObject(str5));
                        if (a3 != null) {
                            return a3;
                        }
                        com.plaid.internal.T0 t0 = com.plaid.internal.T0.AUTH_INVALID_RESPONSE;
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Received unknown payload: ");
                        sb.append(str5);
                        throw new com.plaid.internal.C0617q(t0, sb.toString());
                    } catch (org.json.JSONException e2) {
                        throw new com.plaid.internal.C0617q(com.plaid.internal.T0.AUTH_INVALID_RESPONSE, e2);
                    }
                }
                if (i < 300 || i >= 400) {
                    break;
                }
                i2++;
                if (i2 > 10) {
                    throw new com.plaid.internal.C0617q(com.plaid.internal.T0.GENERIC_COMMUNICATION_ERROR, "too many redirects");
                }
                str = a2.d.get("location");
                if (!c0608p.f.a("skip-vfp-detection")) {
                    java.util.LinkedHashMap b4 = com.plaid.internal.AbstractC0663v1.b(str);
                    java.lang.String str6 = (java.lang.String) b4.get("vfp");
                    java.lang.String str7 = str6 == null ? (java.lang.String) b4.get(com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY) : str6;
                    if (str4 == null) {
                        str4 = str7;
                    } else if (str7 != null && !str7.equals(str4)) {
                        b.a(com.plaid.internal.W3.DEBUG, "jumping out of redirect loop with different vfp: %s", str7);
                        return str7;
                    }
                }
            } catch (java.io.IOException e3) {
                throw new com.plaid.internal.C0617q(com.plaid.internal.T0.GENERIC_COMMUNICATION_ERROR, e3);
            }
        }
        com.plaid.internal.C0680x0 c0680x0 = b;
        c0680x0.a(com.plaid.internal.W3.INFO, "error response code: %d %s", java.lang.Integer.valueOf(i), a2.c);
        c0680x0.a(com.plaid.internal.W3.DEBUG, "error response body: %s", a2.f6553a);
        if (i == 404) {
            throw new com.plaid.internal.C0617q(com.plaid.internal.T0.AUTH_BAD_CREDENTIALS);
        }
        if (i != 410) {
            throw new com.plaid.internal.C0617q(com.plaid.internal.T0.AUTH_INVALID_RESPONSE, "Unsupported response status=".concat(java.lang.String.valueOf(i)));
        }
        throw new com.plaid.internal.C0617q(com.plaid.internal.T0.AUTH_VFP_KEY_EXPIRED);
    }

    public static java.lang.String a(org.json.JSONObject jSONObject) {
        java.lang.String optString = jSONObject.optString("vfp");
        if (!optString.isEmpty()) {
            return optString;
        }
        java.lang.String optString2 = jSONObject.optString(com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY);
        java.lang.String optString3 = jSONObject.optString("correlation_id");
        if (!optString2.isEmpty()) {
            if (optString3.isEmpty()) {
                return optString2;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(optString3);
            sb.append("...");
            sb.append(optString2);
            return sb.toString();
        }
        java.lang.String optString4 = jSONObject.optString("reconcilation_token");
        if (optString4.isEmpty()) {
            return null;
        }
        if (optString3.isEmpty()) {
            return optString4;
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(optString3);
        sb2.append("...");
        sb2.append(optString4);
        return sb2.toString();
    }
}
