package com.ironsource;

/* renamed from: com.ironsource.i8, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3095i8 {

    /* renamed from: a, reason: collision with root package name */
    private com.ironsource.InterfaceC3059g8 f6307a;
    private android.webkit.WebView c;
    private java.lang.String d;
    private java.lang.String e = "i8";
    private java.lang.String[] f = {"handleGetViewVisibility"};
    private final java.lang.String[] g = {com.ironsource.C3023e8.h, com.ironsource.C3023e8.i, com.ironsource.C3023e8.g, "handleGetViewVisibility", com.ironsource.C3023e8.j};
    private com.ironsource.C3407zg b = new com.ironsource.C3407zg();

    /* renamed from: com.ironsource.i8$a */
    class a implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.String f6308a;
        final /* synthetic */ java.lang.String b;
        final /* synthetic */ java.lang.String c;
        final /* synthetic */ org.json.JSONObject d;

        a(java.lang.String str, java.lang.String str2, java.lang.String str3, org.json.JSONObject jSONObject) {
            this.f6308a = str;
            this.b = str2;
            this.c = str3;
            this.d = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (!com.ironsource.C3095i8.this.b(this.f6308a)) {
                    java.lang.String str = "ISNAdViewLogic | handleMessageFromController | cannot handle command: " + this.f6308a;
                    android.util.Log.e(com.ironsource.C3095i8.this.e, str);
                    com.ironsource.C3095i8.this.a(this.b, str);
                    return;
                }
                if (this.f6308a.equalsIgnoreCase("handleGetViewVisibility")) {
                    com.ironsource.C3095i8.this.e(this.c);
                } else if (this.f6308a.equalsIgnoreCase(com.ironsource.C3023e8.j) || this.f6308a.equalsIgnoreCase(com.ironsource.C3023e8.i)) {
                    com.ironsource.C3095i8.this.a(this.d.getString("params"), this.c, this.b);
                }
            } catch (java.lang.Exception e) {
                com.ironsource.C3180n4.d().a(e);
                com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
                java.lang.String str2 = "ISNAdViewLogic | handleMessageFromController | Error while trying handle message: " + this.f6308a;
                android.util.Log.e(com.ironsource.C3095i8.this.e, str2);
                com.ironsource.C3095i8.this.a(this.b, str2);
            }
        }
    }

    /* renamed from: com.ironsource.i8$b */
    class b implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.String f6309a;
        final /* synthetic */ java.lang.String b;

        b(java.lang.String str, java.lang.String str2) {
            this.f6309a = str;
            this.b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                com.ironsource.C3095i8.this.c.evaluateJavascript(this.f6309a, null);
            } catch (java.lang.Throwable th) {
                com.ironsource.C3180n4.d().a(th);
                android.util.Log.e(com.ironsource.C3095i8.this.e, "injectJavaScriptIntoWebView | Error while trying inject JS into external adUnit: " + this.b + "Android API level: " + android.os.Build.VERSION.SDK_INT);
            }
        }
    }

    private void d() {
        if (this.f6307a == null || this.b == null) {
            return;
        }
        a(com.ironsource.C3023e8.f6213a, a());
    }

    private boolean h(java.lang.String str) {
        for (java.lang.String str2 : this.f) {
            if (str2.equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    private boolean i(java.lang.String str) {
        return android.os.Build.VERSION.SDK_INT <= 22 ? str.equalsIgnoreCase(com.ironsource.C3023e8.l) : str.equalsIgnoreCase(com.ironsource.C3023e8.k);
    }

    public void a(android.webkit.WebView webView) {
        this.c = webView;
    }

    public void b() {
        this.f6307a = null;
        this.b = null;
    }

    public java.lang.String c() {
        return this.d;
    }

    public void e() {
        if (this.f6307a == null || this.b == null) {
            return;
        }
        a(com.ironsource.C3023e8.b, a());
    }

    public void f(java.lang.String str) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("adViewId", this.d);
            a(str, jSONObject);
        } catch (org.json.JSONException e) {
            com.ironsource.C3180n4.d().a(e);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
        }
    }

    public void g(java.lang.String str) {
        this.d = str;
    }

    public void a(com.ironsource.InterfaceC3059g8 interfaceC3059g8) {
        this.f6307a = interfaceC3059g8;
    }

    public void c(java.lang.String str) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            java.lang.String optString = jSONObject.optString("method");
            if (android.text.TextUtils.isEmpty(optString) || !h(optString)) {
                a(jSONObject.optString(com.ironsource.C3023e8.v, com.ironsource.C3023e8.c), jSONObject);
            } else if (optString.equalsIgnoreCase("handleGetViewVisibility")) {
                a(jSONObject, (java.lang.String) null, (java.lang.String) null);
            }
        } catch (org.json.JSONException e) {
            com.ironsource.C3180n4.d().a(e);
            android.util.Log.e(this.e, "ISNAdViewLogic | receiveMessageFromExternal | Error while trying handle message: " + str);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(java.lang.String str) {
        for (java.lang.String str2 : this.g) {
            if (str2.equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    public void a(java.lang.String str, org.json.JSONObject jSONObject) {
        com.ironsource.InterfaceC3059g8 interfaceC3059g8 = this.f6307a;
        if (interfaceC3059g8 != null) {
            interfaceC3059g8.a(str, jSONObject);
        }
    }

    public void a(java.lang.String str, java.lang.String str2) {
        com.ironsource.InterfaceC3059g8 interfaceC3059g8 = this.f6307a;
        if (interfaceC3059g8 != null) {
            interfaceC3059g8.a(str, str2, this.d);
        }
    }

    public void e(java.lang.String str) throws org.json.JSONException {
        org.json.JSONObject a2 = this.b.a();
        a2.put("adViewId", this.d);
        a(str, a2);
    }

    void a(java.lang.String str, org.json.JSONObject jSONObject, java.lang.String str2, java.lang.String str3) {
        if (this.f6307a == null) {
            com.ironsource.C3327v8.a(com.ironsource.C3083he.t, new com.ironsource.C3238q8().a(com.ironsource.B5.y, "mDelegate is null").a());
        } else {
            com.ironsource.Q7.f5934a.d(new com.ironsource.C3095i8.a(str, str3, str2, jSONObject));
        }
    }

    private void d(java.lang.String str) {
        com.ironsource.Q7.f5934a.d(new com.ironsource.C3095i8.b("javascript:try{" + str + "}catch(e){console.log(\"JS exception: \" + JSON.stringify(e));}", str));
    }

    public void a(java.lang.String str, int i, boolean z) {
        this.b.a(str, i, z);
        if (i(str)) {
            d();
        }
    }

    public org.json.JSONObject a() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put(com.ironsource.C3023e8.s, this.b.a());
            jSONObject.put(com.ironsource.C3023e8.p, jSONObject2);
            jSONObject.put("adViewId", c());
            return jSONObject;
        } catch (org.json.JSONException e) {
            com.ironsource.C3180n4.d().a(e);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
            return new org.json.JSONObject();
        }
    }

    public void a(org.json.JSONObject jSONObject, java.lang.String str, java.lang.String str2) throws org.json.JSONException {
        a(a(jSONObject).toString(), str, str2);
    }

    public void a(java.lang.String str, java.lang.String str2, java.lang.String str3) throws org.json.JSONException {
        if (this.c == null) {
            java.lang.String str4 = "No external adUnit attached to ISNAdView while trying to send message: " + str;
            android.util.Log.e(this.e, str4);
            this.f6307a.a(str3, str4, this.d);
            return;
        }
        try {
            new org.json.JSONObject(str);
        } catch (org.json.JSONException e) {
            com.ironsource.C3180n4.d().a(e);
            str = "\"" + str + "\"";
        }
        d(a(str));
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("adViewId", this.d);
        a(str2, jSONObject);
    }

    private java.lang.String a(java.lang.String str) {
        return java.lang.String.format(com.ironsource.C3023e8.u, str);
    }

    private org.json.JSONObject a(org.json.JSONObject jSONObject) {
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject2.put("id", jSONObject.getString("id"));
            jSONObject2.put("data", this.b.a());
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
            android.util.Log.e(this.e, "Error while trying execute method buildVisibilityMessageForAdUnit | params: " + jSONObject);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
        }
        return jSONObject2;
    }
}
