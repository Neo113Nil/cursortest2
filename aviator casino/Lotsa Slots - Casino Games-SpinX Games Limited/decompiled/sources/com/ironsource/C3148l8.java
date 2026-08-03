package com.ironsource;

/* renamed from: com.ironsource.l8, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3148l8 implements com.ironsource.InterfaceC2998d1 {
    private static final java.lang.String b = "l8";
    private static com.ironsource.C3148l8 c;

    /* renamed from: a, reason: collision with root package name */
    private final java.util.Map<java.lang.String, com.ironsource.G8> f6368a = java.util.Collections.synchronizedMap(new java.util.HashMap());

    /* renamed from: com.ironsource.l8$a */
    class a implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.ironsource.C3130k8 f6369a;
        final /* synthetic */ android.content.Context b;
        final /* synthetic */ java.lang.String c;

        a(com.ironsource.C3130k8 c3130k8, android.content.Context context, java.lang.String str) {
            this.f6369a = c3130k8;
            this.b = context;
            this.c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.C3148l8.this.f6368a.put(this.c, new com.ironsource.C3041f8(this.f6369a, this.b));
        }
    }

    public static synchronized com.ironsource.C3148l8 a() {
        com.ironsource.C3148l8 c3148l8;
        synchronized (com.ironsource.C3148l8.class) {
            if (c == null) {
                c = new com.ironsource.C3148l8();
            }
            c3148l8 = c;
        }
        return c3148l8;
    }

    private com.ironsource.C3005d8 b(org.json.JSONObject jSONObject) {
        com.ironsource.C3005d8 c3005d8 = new com.ironsource.C3005d8();
        try {
            return a(jSONObject);
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
            return c3005d8;
        }
    }

    private boolean d(org.json.JSONObject jSONObject) {
        return jSONObject.optBoolean(com.ironsource.X3.i.s0);
    }

    public java.lang.String c(org.json.JSONObject jSONObject) throws org.json.JSONException {
        return (jSONObject == null || !jSONObject.has("adViewId")) ? (jSONObject == null || !jSONObject.has("params")) ? "" : new org.json.JSONObject(jSONObject.getString("params")).getString("adViewId") : jSONObject.getString("adViewId");
    }

    public void d(org.json.JSONObject jSONObject, java.lang.String str, java.lang.String str2) throws java.lang.Exception {
        java.lang.String string = new org.json.JSONObject(jSONObject.getString("params")).getString("adViewId");
        if (string.isEmpty()) {
            com.ironsource.sdk.utils.Logger.i(b, "sendMessageToAd fail - adViewId is empty");
            throw new java.lang.Exception("adViewId is empty");
        }
        if (!this.f6368a.containsKey(string)) {
            com.ironsource.sdk.utils.Logger.i(b, "sendMessageToAd fail - collection does not contain adViewId");
            throw new java.lang.Exception("collection does not contain adViewId");
        }
        com.ironsource.G8 g8 = this.f6368a.get(string);
        if (g8 != null) {
            g8.c(jSONObject, str, str2);
        }
    }

    private com.ironsource.C3005d8 a(org.json.JSONObject jSONObject) {
        try {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject(jSONObject.getString(com.ironsource.X3.i.O));
            java.lang.String obj = jSONObject2.get("height").toString();
            java.lang.String obj2 = jSONObject2.get("width").toString();
            return new com.ironsource.C3005d8(java.lang.Integer.parseInt(obj2), java.lang.Integer.parseInt(obj), jSONObject2.get("label").toString());
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
            return new com.ironsource.C3005d8();
        }
    }

    public void b(org.json.JSONObject jSONObject, java.lang.String str, java.lang.String str2) throws java.lang.Exception {
        java.lang.String string = jSONObject.getString("adViewId");
        if (!string.isEmpty()) {
            if (this.f6368a.containsKey(string)) {
                com.ironsource.G8 g8 = this.f6368a.get(string);
                java.lang.String string2 = jSONObject.getString(com.ironsource.X3.i.v0);
                if (g8 != null) {
                    g8.a(string2, str, str2);
                    return;
                }
                return;
            }
            com.ironsource.sdk.utils.Logger.i(b, "performWebViewAction fail - collection does not contain adViewId");
            throw new java.lang.Exception("collection does not contain adViewId");
        }
        com.ironsource.sdk.utils.Logger.i(b, "performWebViewAction fail - adViewId is empty");
        throw new java.lang.Exception("adViewId is empty");
    }

    public void c(org.json.JSONObject jSONObject, java.lang.String str, java.lang.String str2) throws java.lang.Exception {
        java.lang.String string = jSONObject.getString("adViewId");
        if (!string.isEmpty()) {
            if (this.f6368a.containsKey(string)) {
                com.ironsource.G8 g8 = this.f6368a.get(string);
                this.f6368a.remove(string);
                if (g8 != null) {
                    g8.a(str, str2);
                    return;
                }
                return;
            }
            com.ironsource.sdk.utils.Logger.i(b, "removeAdView fail - collection does not contain adViewId");
            throw new java.lang.Exception("collection does not contain adViewId");
        }
        com.ironsource.sdk.utils.Logger.i(b, "removeAdView fail - adViewId is empty");
        throw new java.lang.Exception("adViewId is empty");
    }

    public void a(com.ironsource.InterfaceC3059g8 interfaceC3059g8, org.json.JSONObject jSONObject, android.content.Context context, java.lang.String str, java.lang.String str2) throws java.lang.Exception {
        java.lang.String string = jSONObject.getString("adViewId");
        if (!string.isEmpty()) {
            com.ironsource.C3005d8 b2 = b(jSONObject);
            if (!this.f6368a.containsKey(string)) {
                com.ironsource.C3130k8 c3130k8 = new com.ironsource.C3130k8(interfaceC3059g8, context, string, b2);
                c3130k8.e(com.ironsource.sdk.utils.IronSourceStorageUtils.getNetworkStorageDir(context));
                c3130k8.b(jSONObject, str, str2);
                if (d(jSONObject)) {
                    com.ironsource.Q7.f5934a.d(new com.ironsource.C3148l8.a(c3130k8, context, string));
                    return;
                } else {
                    this.f6368a.put(string, c3130k8);
                    return;
                }
            }
            com.ironsource.sdk.utils.Logger.i(b, "sendMessageToAd fail - collection already contain adViewId");
            throw new java.lang.Exception("collection already contain adViewId");
        }
        com.ironsource.sdk.utils.Logger.i(b, "loadWithUrl fail - adViewId is empty");
        throw new java.lang.Exception("adViewId is empty");
    }

    @Override // com.ironsource.InterfaceC2998d1
    public com.ironsource.G8 a(java.lang.String str) {
        if (str.isEmpty() || !this.f6368a.containsKey(str)) {
            return null;
        }
        return this.f6368a.get(str);
    }

    public void a(org.json.JSONObject jSONObject, java.lang.String str, java.lang.String str2) throws java.lang.Exception {
        java.lang.String string = jSONObject.getString("adViewId");
        if (!string.isEmpty()) {
            if (this.f6368a.containsKey(string)) {
                com.ironsource.G8 g8 = this.f6368a.get(string);
                if (g8 != null) {
                    g8.a(jSONObject, str, str2);
                    return;
                }
                return;
            }
            com.ironsource.sdk.utils.Logger.i(b, "removeAdView fail - collection does not contain adViewId");
            throw new java.lang.Exception("collection does not contain adViewId");
        }
        com.ironsource.sdk.utils.Logger.i(b, "removeAdView fail - adViewId is empty");
        throw new java.lang.Exception("adViewId is empty");
    }
}
