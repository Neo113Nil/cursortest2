package com.iab.omid.library.ironsrc.internal;

/* loaded from: classes5.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private static com.iab.omid.library.ironsrc.internal.h f4468a = new com.iab.omid.library.ironsrc.internal.h();

    class a implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.webkit.WebView f4469a;
        final /* synthetic */ java.lang.String b;

        a(android.webkit.WebView webView, java.lang.String str) {
            this.f4469a = webView;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.iab.omid.library.ironsrc.internal.h.this.c(this.f4469a, this.b);
        }
    }

    private h() {
    }

    public static final com.iab.omid.library.ironsrc.internal.h a() {
        return f4468a;
    }

    public void a(android.webkit.WebView webView, java.lang.String str) {
        a(webView, "finishSession", str);
    }

    public void a(android.webkit.WebView webView, java.lang.String str, float f) {
        a(webView, "setDeviceVolume", java.lang.Float.valueOf(f), str);
    }

    public void a(android.webkit.WebView webView, java.lang.String str, com.iab.omid.library.ironsrc.adsession.ErrorType errorType, java.lang.String str2) {
        a(webView, "error", errorType.toString(), str2, str);
    }

    public void a(android.webkit.WebView webView, java.lang.String str, java.lang.String str2) {
        a(webView, "setDeviceLockState", str2);
    }

    public void a(android.webkit.WebView webView, java.lang.String str, java.lang.String str2, org.json.JSONObject jSONObject) {
        a(webView, "publishMediaEvent", str2, jSONObject, str);
    }

    public void a(android.webkit.WebView webView, java.lang.String str, org.json.JSONObject jSONObject) {
        a(webView, com.ironsource.X3.a.f, jSONObject, str);
    }

    public void a(android.webkit.WebView webView, java.lang.String str, org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, org.json.JSONObject jSONObject3) {
        a(webView, "startSession", str, jSONObject, jSONObject2, jSONObject3);
    }

    void a(android.webkit.WebView webView, java.lang.String str, java.lang.Object... objArr) {
        if (webView == null) {
            com.iab.omid.library.ironsrc.utils.d.a("The WebView is null for " + str);
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(128);
        sb.append("if(window.omidBridge!==undefined){omidBridge.");
        sb.append(str);
        sb.append("(");
        a(sb, objArr);
        sb.append(")}");
        a(webView, sb);
    }

    void a(android.webkit.WebView webView, java.lang.StringBuilder sb) {
        java.lang.String sb2 = sb.toString();
        android.os.Handler handler = webView.getHandler();
        if (handler == null || android.os.Looper.myLooper() == handler.getLooper()) {
            c(webView, sb2);
        } else {
            handler.post(new com.iab.omid.library.ironsrc.internal.h.a(webView, sb2));
        }
    }

    public void a(android.webkit.WebView webView, org.json.JSONObject jSONObject) {
        a(webView, "setLastActivity", jSONObject);
    }

    void a(java.lang.StringBuilder sb, java.lang.Object[] objArr) {
        java.lang.String obj;
        if (objArr == null || objArr.length <= 0) {
            return;
        }
        for (java.lang.Object obj2 : objArr) {
            if (obj2 == null) {
                obj = kotlinx.serialization.json.internal.AbstractJsonLexerKt.NULL;
            } else {
                if (obj2 instanceof java.lang.String) {
                    obj = obj2.toString();
                    if (!obj.startsWith("{")) {
                        sb.append('\"');
                        sb.append(obj);
                        sb.append('\"');
                    }
                } else {
                    sb.append(obj2);
                }
                sb.append(",");
            }
            sb.append(obj);
            sb.append(",");
        }
        sb.setLength(sb.length() - 1);
    }

    public void b(android.webkit.WebView webView, java.lang.String str) {
        a(webView, "publishImpressionEvent", str);
    }

    public void b(android.webkit.WebView webView, java.lang.String str, java.lang.String str2) {
        a(webView, "setNativeViewHierarchy", str2, str);
    }

    public void b(android.webkit.WebView webView, java.lang.String str, org.json.JSONObject jSONObject) {
        a(webView, "publishLoadedEvent", jSONObject, str);
    }

    public void c(android.webkit.WebView webView, java.lang.String str, java.lang.String str2) {
        a(webView, "setState", str2, str);
    }

    public boolean c(android.webkit.WebView webView, java.lang.String str) {
        if (webView == null || android.text.TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            webView.evaluateJavascript(str, null);
            return true;
        } catch (java.lang.IllegalStateException unused) {
            webView.loadUrl("javascript: " + str);
            return true;
        }
    }

    public void d(android.webkit.WebView webView, java.lang.String str, java.lang.String str2) {
        if (str == null || android.text.TextUtils.isEmpty(str2)) {
            return;
        }
        c(webView, "(function() {this.omidVerificationProperties = this.omidVerificationProperties || {};Object.defineProperty(this.omidVerificationProperties, 'injectionId', {get: function() {var currentScript = document && document.currentScript;return currentScript && currentScript.getAttribute('data-injection-id');}, configurable: true});var script = document.createElement('script');script.setAttribute(\"type\",\"text/javascript\");script.setAttribute(\"src\",\"%SCRIPT_SRC%\");script.setAttribute(\"data-injection-id\",\"%INJECTION_ID%\");document.body.appendChild(script);})();".replace("%SCRIPT_SRC%", str).replace("%INJECTION_ID%", str2));
    }
}
