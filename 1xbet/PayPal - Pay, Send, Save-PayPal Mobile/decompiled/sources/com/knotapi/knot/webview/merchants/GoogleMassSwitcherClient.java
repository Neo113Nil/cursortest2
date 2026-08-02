package com.knotapi.knot.webview.merchants;

/* loaded from: classes9.dex */
public class GoogleMassSwitcherClient extends com.knotapi.knot.webview.KnotViewClient {
    public GoogleMassSwitcherClient(com.knotapi.knot.webview.KnotView knotView) {
        super(knotView);
    }

    @Override // com.knotapi.knot.webview.KnotViewClient
    public com.knotapi.knot.utilities.Cookie buildCookie(java.lang.String str, java.lang.String str2) {
        try {
            com.knotapi.knot.utilities.Cookie buildCookie = super.buildCookie(str, str2);
            org.json.JSONObject cookieData = getCookieData(new org.json.JSONArray(this.bot.getAllSettings().get("cookies").toString()), buildCookie.getName());
            if (cookieData != null) {
                buildCookie.setDomain(cookieData.getString("domain"));
                return buildCookie;
            }
            buildCookie.setDomain(str2.split(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR)[2]);
            return buildCookie;
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public org.json.JSONObject getCookieData(org.json.JSONArray jSONArray, java.lang.String str) {
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                org.json.JSONObject jSONObject = jSONArray.getJSONObject(i);
                if (jSONObject.getString("name").contains(str)) {
                    return jSONObject;
                }
            } catch (org.json.JSONException unused) {
                return null;
            }
        }
        return null;
    }

    public java.util.List<com.knotapi.knot.utilities.Cookie> getCookies() {
        com.knotapi.knot.utilities.WebViewCookieCollector webViewCookieCollector = new com.knotapi.knot.utilities.WebViewCookieCollector(new com.knotapi.knot.interfaces.CookieBuilder() { // from class: com.knotapi.knot.webview.merchants.GoogleMassSwitcherClient$$ExternalSyntheticLambda0
            @Override // com.knotapi.knot.interfaces.CookieBuilder
            public final com.knotapi.knot.utilities.Cookie buildCookie(java.lang.String str, java.lang.String str2) {
                return com.knotapi.knot.webview.merchants.GoogleMassSwitcherClient.this.buildCookie(str, str2);
            }
        });
        com.knotapi.knot.webview.KnotView knotView = this.knotView;
        return webViewCookieCollector.getAllCookiesAsList(knotView, knotView.getUrl());
    }

    public org.json.JSONArray getGooglePasswordManagerUrl() {
        try {
            return new org.json.JSONArray(this.bot.getAllSettings().get("googlePasswordManagerUrl").toString());
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public java.lang.String getGooglePasswordManagerUserAgent() {
        try {
            return this.bot.getAllSettings().get("googlePasswordManagerUserAgent").getAsString();
        } catch (java.lang.Exception unused) {
            return "";
        }
    }

    @Override // com.knotapi.knot.webview.KnotViewClient
    public boolean isUserLoggedIn(java.lang.String str) {
        this.knotView.setCookies(getCookies());
        return super.isUserLoggedIn(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
    
        r4.knotView.getSettings().setUserAgentString(getGooglePasswordManagerUserAgent());
     */
    @Override // com.knotapi.knot.webview.KnotViewClient, android.webkit.WebViewClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean shouldOverrideUrlLoading(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest) {
        try {
            org.json.JSONArray googlePasswordManagerUrl = getGooglePasswordManagerUrl();
            if (googlePasswordManagerUrl != null) {
                int i = 0;
                while (true) {
                    if (i >= googlePasswordManagerUrl.length()) {
                        break;
                    }
                    if (((java.lang.String) java.util.Objects.requireNonNull(webView.getUrl())).contains(googlePasswordManagerUrl.getString(i))) {
                        break;
                    }
                    i++;
                }
            }
        } catch (org.json.JSONException unused) {
        }
        return super.shouldOverrideUrlLoading(webView, webResourceRequest);
    }
}
