package com.iab.omid.library.vungle.adsession;

/* loaded from: classes5.dex */
public final class AdSessionContext {
    private final com.iab.omid.library.vungle.adsession.AdSessionContextType adSessionContextType;
    private final java.lang.String contentUrl;
    private final java.lang.String customReferenceData;
    private final java.util.Map<java.lang.String, com.iab.omid.library.vungle.adsession.VerificationScriptResource> injectedResourcesMap;
    private final java.lang.String omidJsScriptContent;
    private final com.iab.omid.library.vungle.adsession.Partner partner;
    private final com.iab.omid.library.vungle.adsession.UniversalAdId universalAdId;
    private final java.util.List<com.iab.omid.library.vungle.adsession.VerificationScriptResource> verificationScriptResources;
    private final android.webkit.WebView webView;

    private AdSessionContext(com.iab.omid.library.vungle.adsession.Partner partner, android.webkit.WebView webView, java.lang.String str, java.util.List<com.iab.omid.library.vungle.adsession.VerificationScriptResource> list, java.lang.String str2, java.lang.String str3, com.iab.omid.library.vungle.adsession.AdSessionContextType adSessionContextType, com.iab.omid.library.vungle.adsession.UniversalAdId universalAdId) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.verificationScriptResources = arrayList;
        this.injectedResourcesMap = new java.util.HashMap();
        this.partner = partner;
        this.webView = webView;
        this.omidJsScriptContent = str;
        this.adSessionContextType = adSessionContextType;
        if (list != null) {
            arrayList.addAll(list);
            for (com.iab.omid.library.vungle.adsession.VerificationScriptResource verificationScriptResource : list) {
                this.injectedResourcesMap.put(java.util.UUID.randomUUID().toString(), verificationScriptResource);
            }
        }
        this.contentUrl = str2;
        this.customReferenceData = str3;
        this.universalAdId = universalAdId;
    }

    public static com.iab.omid.library.vungle.adsession.AdSessionContext createHtmlAdSessionContext(com.iab.omid.library.vungle.adsession.Partner partner, android.webkit.WebView webView, java.lang.String str, java.lang.String str2) {
        com.iab.omid.library.vungle.utils.g.a(partner, "Partner is null");
        com.iab.omid.library.vungle.utils.g.a(webView, "WebView is null");
        if (str2 != null) {
            com.iab.omid.library.vungle.utils.g.a(str2, 256, "CustomReferenceData is greater than 256 characters");
        }
        return new com.iab.omid.library.vungle.adsession.AdSessionContext(partner, webView, null, null, str, str2, com.iab.omid.library.vungle.adsession.AdSessionContextType.HTML, null);
    }

    public static com.iab.omid.library.vungle.adsession.AdSessionContext createJavascriptAdSessionContext(com.iab.omid.library.vungle.adsession.Partner partner, android.webkit.WebView webView, java.lang.String str, java.lang.String str2) {
        com.iab.omid.library.vungle.utils.g.a(partner, "Partner is null");
        com.iab.omid.library.vungle.utils.g.a(webView, "WebView is null");
        if (str2 != null) {
            com.iab.omid.library.vungle.utils.g.a(str2, 256, "CustomReferenceData is greater than 256 characters");
        }
        return new com.iab.omid.library.vungle.adsession.AdSessionContext(partner, webView, null, null, str, str2, com.iab.omid.library.vungle.adsession.AdSessionContextType.JAVASCRIPT, null);
    }

    public static com.iab.omid.library.vungle.adsession.AdSessionContext createNativeAdSessionContext(com.iab.omid.library.vungle.adsession.Partner partner, java.lang.String str, java.util.List<com.iab.omid.library.vungle.adsession.VerificationScriptResource> list, java.lang.String str2, java.lang.String str3) {
        return createNativeAdSessionContext(partner, str, list, str2, str3, null);
    }

    public static com.iab.omid.library.vungle.adsession.AdSessionContext createNativeAdSessionContext(com.iab.omid.library.vungle.adsession.Partner partner, java.lang.String str, java.util.List<com.iab.omid.library.vungle.adsession.VerificationScriptResource> list, java.lang.String str2, java.lang.String str3, com.iab.omid.library.vungle.adsession.UniversalAdId universalAdId) {
        com.iab.omid.library.vungle.utils.g.a(partner, "Partner is null");
        com.iab.omid.library.vungle.utils.g.a((java.lang.Object) str, "OM SDK JS script content is null");
        com.iab.omid.library.vungle.utils.g.a(list, "VerificationScriptResources is null");
        if (str3 != null) {
            com.iab.omid.library.vungle.utils.g.a(str3, 256, "CustomReferenceData is greater than 256 characters");
        }
        return new com.iab.omid.library.vungle.adsession.AdSessionContext(partner, null, str, list, str2, str3, com.iab.omid.library.vungle.adsession.AdSessionContextType.NATIVE, universalAdId);
    }

    public com.iab.omid.library.vungle.adsession.AdSessionContextType getAdSessionContextType() {
        return this.adSessionContextType;
    }

    public java.lang.String getContentUrl() {
        return this.contentUrl;
    }

    public java.lang.String getCustomReferenceData() {
        return this.customReferenceData;
    }

    public java.util.Map<java.lang.String, com.iab.omid.library.vungle.adsession.VerificationScriptResource> getInjectedResourcesMap() {
        return java.util.Collections.unmodifiableMap(this.injectedResourcesMap);
    }

    public java.lang.String getOmidJsScriptContent() {
        return this.omidJsScriptContent;
    }

    public com.iab.omid.library.vungle.adsession.Partner getPartner() {
        return this.partner;
    }

    public com.iab.omid.library.vungle.adsession.UniversalAdId getUniversalAdId() {
        return this.universalAdId;
    }

    public java.util.List<com.iab.omid.library.vungle.adsession.VerificationScriptResource> getVerificationScriptResources() {
        return java.util.Collections.unmodifiableList(this.verificationScriptResources);
    }

    public android.webkit.WebView getWebView() {
        return this.webView;
    }
}
