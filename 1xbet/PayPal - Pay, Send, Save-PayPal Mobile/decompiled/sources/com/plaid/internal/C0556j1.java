package com.plaid.internal;

/* renamed from: com.plaid.internal.j1, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0556j1 implements com.plaid.internal.InterfaceC0529g1 {
    public static final com.plaid.internal.C0680x0 e;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f6447a;
    public final java.lang.String b;
    public final org.json.JSONObject c;
    public final org.json.JSONObject d;

    public C0556j1(java.lang.String str, java.lang.String str2, org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2) {
        this.f6447a = str;
        this.b = str2;
        this.c = jSONObject;
        this.d = jSONObject2;
    }

    public static com.plaid.internal.C0556j1 a(java.lang.String str) {
        java.lang.String str2 = (java.lang.String) com.plaid.internal.AbstractC0663v1.b(str).get(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        if (str2 == null) {
            throw new com.plaid.internal.C0617q(com.plaid.internal.T0.AUTH_MALFORMED_INPUT_DATA, "Invalid flow.v2 data - missing in url");
        }
        try {
            java.lang.String str3 = new java.lang.String(android.util.Base64.decode(str2, 8));
            e.a(com.plaid.internal.W3.TRACE, "decoded data: %s", str3);
            org.json.JSONObject jSONObject = new org.json.JSONObject(str3);
            try {
                java.lang.String string = jSONObject.getString("url");
                try {
                    java.lang.String string2 = jSONObject.getString("vfp");
                    try {
                        org.json.JSONObject jSONObject2 = jSONObject.getJSONObject(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                        try {
                            new java.net.URL(string);
                            return new com.plaid.internal.C0556j1(string, string2, jSONObject2, jSONObject.optJSONObject("att-1004"));
                        } catch (java.net.MalformedURLException unused) {
                            throw new com.plaid.internal.C0617q(com.plaid.internal.T0.AUTH_MALFORMED_INPUT_DATA, "Malformed url ".concat(java.lang.String.valueOf(string)));
                        }
                    } catch (org.json.JSONException unused2) {
                        throw new com.plaid.internal.C0617q(com.plaid.internal.T0.AUTH_MALFORMED_INPUT_DATA, "Invalid flow.v2 data - missing data field");
                    }
                } catch (org.json.JSONException unused3) {
                    throw new com.plaid.internal.C0617q(com.plaid.internal.T0.AUTH_MALFORMED_INPUT_DATA, "Invalid flow.v2 data - missing vfp field");
                }
            } catch (org.json.JSONException unused4) {
                throw new com.plaid.internal.C0617q(com.plaid.internal.T0.AUTH_MALFORMED_INPUT_DATA, "Invalid flow.v2 data - missing url field");
            }
        } catch (java.lang.Exception unused5) {
            throw new com.plaid.internal.C0617q(com.plaid.internal.T0.AUTH_MALFORMED_INPUT_DATA, "Invalid flow.v2 data - cannot parse as json");
        }
    }

    static {
        com.plaid.internal.W3 w3 = com.plaid.internal.Z3.f5986a;
        e = new com.plaid.internal.C0680x0("flowV2");
    }

    @Override // com.plaid.internal.InterfaceC0529g1
    public final java.lang.String a(com.plaid.internal.InterfaceC0627r1 interfaceC0627r1, com.plaid.internal.C0608p c0608p) {
        com.plaid.internal.C0680x0 c0680x0;
        com.plaid.internal.InterfaceC0627r1.b a2;
        int i;
        java.lang.String str;
        c0608p.d = "v2";
        java.lang.String str2 = this.f6447a;
        java.lang.String str3 = (java.lang.String) com.plaid.internal.AbstractC0663v1.b(str2).get("cid");
        if (str3 == null) {
            java.util.LinkedHashMap b = com.plaid.internal.AbstractC0663v1.b(str2);
            str3 = (java.lang.String) b.get("vfp");
            if (str3 == null) {
                str3 = (java.lang.String) b.get(com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY);
            }
        }
        c0608p.e = str3;
        org.json.JSONObject jSONObject = this.c;
        boolean z = false;
        while (true) {
            com.plaid.internal.C0608p.a aVar = new com.plaid.internal.C0608p.a(this.f6447a);
            c0608p.c.add(aVar);
            try {
                java.lang.String jSONObject2 = jSONObject.toString();
                c0680x0 = e;
                com.plaid.internal.W3 w3 = com.plaid.internal.W3.TRACE;
                c0680x0.a(w3, "att request body: %s", jSONObject2);
                a2 = interfaceC0627r1.a(new com.plaid.internal.InterfaceC0627r1.a(this.f6447a, true, jSONObject2, ((java.lang.Number) c0608p.f.a("connection-timeout-att", 10000, java.lang.Number.class)).intValue()));
                i = a2.b;
                aVar.b = i;
                if (i >= 200 && i <= 202) {
                    str = a2.f6553a;
                    c0680x0.a(w3, "att response body: %s", str);
                    if (z) {
                        break;
                    }
                    try {
                        if (new org.json.JSONObject(str).optInt("status", -1) != 1004) {
                            break;
                        }
                        org.json.JSONObject jSONObject3 = this.d;
                        java.lang.String optString = jSONObject3 == null ? null : jSONObject3.optString("application-id");
                        if (optString == null) {
                            c0680x0.a(com.plaid.internal.W3.DEBUG, "missing att1004.application-id, continue flow v2", new java.lang.Object[0]);
                            break;
                        }
                        c0680x0.a(com.plaid.internal.W3.DEBUG, "flow v2.5 detected, use application-id: %s", optString);
                        try {
                            org.json.JSONObject jSONObject4 = new org.json.JSONObject(jSONObject.toString());
                            try {
                                jSONObject4.putOpt("application-id", optString);
                                jSONObject = jSONObject4;
                                z = true;
                            } catch (org.json.JSONException e2) {
                                throw new java.lang.IllegalStateException(e2);
                            }
                        } catch (org.json.JSONException e3) {
                            throw new java.lang.IllegalStateException(e3);
                        }
                    } catch (org.json.JSONException unused) {
                    }
                } else {
                    break;
                }
            } catch (java.io.IOException e4) {
                throw new com.plaid.internal.C0617q(com.plaid.internal.T0.GENERIC_COMMUNICATION_ERROR, e4);
            }
        }
        if (i >= 300 && i < 400) {
            throw new com.plaid.internal.C0617q(com.plaid.internal.T0.AUTH_INVALID_RESPONSE, "Unexpected redirect in flow v2");
        }
        c0680x0.a(com.plaid.internal.W3.INFO, "error response code: %i %s", java.lang.Integer.valueOf(i), a2.c);
        c0680x0.a(com.plaid.internal.W3.DEBUG, "error response body: %s", a2.f6553a);
        if (i == 404) {
            throw new com.plaid.internal.C0617q(com.plaid.internal.T0.AUTH_BAD_CREDENTIALS);
        }
        if (i != 410) {
            throw new com.plaid.internal.C0617q(com.plaid.internal.T0.AUTH_INVALID_RESPONSE, "Unsupported response status=".concat(java.lang.String.valueOf(i)));
        }
        throw new com.plaid.internal.C0617q(com.plaid.internal.T0.AUTH_VFP_KEY_EXPIRED);
        java.lang.String encodeToString = android.util.Base64.encodeToString(str.getBytes(), 10);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.b);
        sb.append("___");
        sb.append(encodeToString);
        sb.append(z ? "___R2" : "");
        return sb.toString();
    }
}
