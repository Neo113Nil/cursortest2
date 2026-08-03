package com.iab.omid.library.vungle.messagelistener;

/* loaded from: classes5.dex */
public class a {
    private static final com.iab.omid.library.vungle.utils.i c = new com.iab.omid.library.vungle.utils.i();

    /* renamed from: a, reason: collision with root package name */
    private final android.webkit.WebView f4554a;
    private final com.iab.omid.library.vungle.messagelistener.b b;

    /* renamed from: com.iab.omid.library.vungle.messagelistener.a$a, reason: collision with other inner class name */
    class C0111a implements androidx.webkit.WebViewCompat.WebMessageListener {
        C0111a() {
        }

        @Override // androidx.webkit.WebViewCompat.WebMessageListener
        public void onPostMessage(android.webkit.WebView webView, androidx.webkit.WebMessageCompat webMessageCompat, android.net.Uri uri, boolean z, androidx.webkit.JavaScriptReplyProxy javaScriptReplyProxy) {
            com.iab.omid.library.vungle.messagelistener.a.this.a(webMessageCompat.getData());
        }
    }

    public a(android.webkit.WebView webView, com.iab.omid.library.vungle.messagelistener.b bVar) {
        com.iab.omid.library.vungle.utils.g.a(webView, "WebView is null");
        this.f4554a = webView;
        this.b = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(java.lang.String str) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            this.b.onMessageReceived(jSONObject.getString("method"), jSONObject.getJSONObject("data"));
        } catch (org.json.JSONException e) {
            com.iab.omid.library.vungle.utils.d.a("Error parsing JS message", e);
        }
    }

    public void a() {
        try {
            if (!androidx.webkit.WebViewFeature.isFeatureSupported("WEB_MESSAGE_LISTENER")) {
                this.b.onWebMessageListenerUnsupported();
                return;
            }
            try {
                b();
                c.a(this.f4554a, this.b.getListenerName(), new java.util.HashSet(java.util.Arrays.asList("*")), new com.iab.omid.library.vungle.messagelistener.a.C0111a());
            } catch (java.lang.Exception e) {
                com.iab.omid.library.vungle.utils.d.a("Error adding WebView listener", e);
                this.b.onWebMessageListenerUnsupported();
            }
        } catch (java.lang.NoClassDefFoundError unused) {
            this.b.onWebMessageListenerUnsupported();
        }
    }

    public void b() {
        c.a(this.f4554a, this.b.getListenerName());
    }
}
