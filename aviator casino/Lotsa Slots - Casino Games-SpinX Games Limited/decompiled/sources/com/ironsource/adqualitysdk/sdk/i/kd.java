package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public class kd implements com.ironsource.adqualitysdk.sdk.i.jy {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static java.util.Map<android.webkit.WebView, com.ironsource.adqualitysdk.sdk.i.kd> f2989 = new java.util.WeakHashMap();

    /* renamed from: ﻛ, reason: contains not printable characters */
    private java.util.Set<com.ironsource.adqualitysdk.sdk.i.jy> f2990 = new java.util.HashSet();

    /* renamed from: ｋ, reason: contains not printable characters */
    private com.ironsource.adqualitysdk.sdk.i.kc f2991;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private java.lang.String f2992;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static com.ironsource.adqualitysdk.sdk.i.kd m8341(android.webkit.WebView webView, java.lang.String str) {
        com.ironsource.adqualitysdk.sdk.i.kd kdVar = f2989.get(webView);
        if (kdVar != null) {
            return kdVar;
        }
        com.ironsource.adqualitysdk.sdk.i.kd kdVar2 = new com.ironsource.adqualitysdk.sdk.i.kd(webView, str);
        f2989.put(webView, kdVar2);
        return kdVar2;
    }

    private kd(android.webkit.WebView webView, java.lang.String str) {
        this.f2992 = str;
        com.ironsource.adqualitysdk.sdk.i.kc kcVar = new com.ironsource.adqualitysdk.sdk.i.kc(webView);
        this.f2991 = kcVar;
        kcVar.m8338(new com.ironsource.adqualitysdk.sdk.i.kd.AnonymousClass1());
        this.f2991.m8335(new com.ironsource.adqualitysdk.sdk.i.kd.AnonymousClass5());
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final void m8344() {
        this.f2991.m8338(new com.ironsource.adqualitysdk.sdk.i.kd.AnonymousClass1());
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m8348() {
        this.f2991.m8335(new com.ironsource.adqualitysdk.sdk.i.kd.AnonymousClass5());
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final void m8345(com.ironsource.adqualitysdk.sdk.i.jy jyVar) {
        this.f2990.add(jyVar);
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final void m8342(com.ironsource.adqualitysdk.sdk.i.jy jyVar) {
        this.f2990.remove(jyVar);
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final boolean m8343() {
        return this.f2991.m8336();
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final android.webkit.WebView m8347() {
        return this.f2991.m8339();
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final com.ironsource.adqualitysdk.sdk.i.ba.d m8346() {
        return this.f2991.m8337();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.jy
    /* renamed from: ﻐ */
    public final void mo8316(android.webkit.WebView webView) {
        for (com.ironsource.adqualitysdk.sdk.i.jy jyVar : new java.util.HashSet(this.f2990)) {
            if (jyVar != null) {
                jyVar.mo8316(webView);
            }
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.jy
    /* renamed from: ﻛ */
    public final void mo8318(android.webkit.WebView webView, java.lang.String str, java.lang.String str2) {
        for (com.ironsource.adqualitysdk.sdk.i.jy jyVar : new java.util.HashSet(this.f2990)) {
            if (jyVar != null) {
                jyVar.mo8318(webView, str, str2);
            }
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.jy
    /* renamed from: ﾒ */
    public final void mo8319(android.webkit.WebView webView, java.lang.String str, boolean z) {
        for (com.ironsource.adqualitysdk.sdk.i.jy jyVar : new java.util.HashSet(this.f2990)) {
            if (jyVar != null) {
                jyVar.mo8319(webView, str, z);
            }
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.jy
    /* renamed from: ﻛ */
    public final void mo8317(android.webkit.WebView webView, java.lang.String str) {
        for (com.ironsource.adqualitysdk.sdk.i.jy jyVar : new java.util.HashSet(this.f2990)) {
            if (jyVar != null) {
                jyVar.mo8317(webView, str);
            }
        }
    }

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.kd$1, reason: invalid class name */
    final class AnonymousClass1 extends android.webkit.WebViewClient {

        /* renamed from: ｋ, reason: contains not printable characters */
        private boolean f2994 = false;

        /* renamed from: ﻐ, reason: contains not printable characters */
        private boolean f2993 = false;

        /* renamed from: ﾒ, reason: contains not printable characters */
        private java.lang.String f2996 = null;

        AnonymousClass1() {
        }

        @Override // android.webkit.WebViewClient
        public final void onPageStarted(android.webkit.WebView webView, java.lang.String str, android.graphics.Bitmap bitmap) {
            com.ironsource.adqualitysdk.sdk.i.kd.this.mo8316(webView);
            this.f2994 = true;
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(android.webkit.WebView webView, java.lang.String str) {
            com.ironsource.adqualitysdk.sdk.i.kd.this.mo8316(webView);
            this.f2994 = false;
            this.f2993 = true;
            if (this.f2996 == null) {
                this.f2996 = webView.getOriginalUrl();
            }
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(android.webkit.WebView webView, java.lang.String str) {
            if (m8350(webView, str)) {
                return true;
            }
            if (this.f2996 == null) {
                this.f2996 = webView.getOriginalUrl();
            }
            com.ironsource.adqualitysdk.sdk.i.kd.this.mo8319(webView, str, m8349(webView));
            this.f2993 = true;
            this.f2994 = false;
            return false;
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest) {
            return shouldOverrideUrlLoading(webView, webResourceRequest.getUrl().toString());
        }

        /* renamed from: ｋ, reason: contains not printable characters */
        private boolean m8349(android.webkit.WebView webView) {
            if (this.f2994 && this.f2993) {
                return true;
            }
            return (webView.getOriginalUrl() == null || this.f2996 == null || webView.getOriginalUrl().equals(this.f2996)) ? false : true;
        }

        /* renamed from: ﾇ, reason: contains not printable characters */
        private boolean m8350(android.webkit.WebView webView, java.lang.String str) {
            if (!str.startsWith(com.ironsource.adqualitysdk.sdk.i.kd.this.f2992)) {
                return false;
            }
            this.f2996 = webView.getOriginalUrl();
            java.lang.String substring = str.substring(com.ironsource.adqualitysdk.sdk.i.kd.this.f2992.length());
            com.ironsource.adqualitysdk.sdk.i.kd kdVar = com.ironsource.adqualitysdk.sdk.i.kd.this;
            kdVar.mo8318(webView, kdVar.f2992, substring);
            return true;
        }
    }

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.kd$5, reason: invalid class name */
    final class AnonymousClass5 extends android.webkit.WebChromeClient {

        /* renamed from: ﾒ, reason: contains not printable characters */
        private boolean f2998 = false;

        AnonymousClass5() {
        }

        @Override // android.webkit.WebChromeClient
        public final boolean onJsPrompt(android.webkit.WebView webView, java.lang.String str, java.lang.String str2, java.lang.String str3, android.webkit.JsPromptResult jsPromptResult) {
            com.ironsource.adqualitysdk.sdk.i.kd.this.mo8317(webView, str2);
            return false;
        }

        @Override // android.webkit.WebChromeClient
        public final void onProgressChanged(android.webkit.WebView webView, int i) {
            if (i != 100 || this.f2998) {
                return;
            }
            this.f2998 = true;
            com.ironsource.adqualitysdk.sdk.i.kd.this.mo8316(webView);
        }
    }
}
