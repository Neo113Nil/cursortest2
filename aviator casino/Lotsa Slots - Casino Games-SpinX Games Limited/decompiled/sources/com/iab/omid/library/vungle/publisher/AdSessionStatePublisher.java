package com.iab.omid.library.vungle.publisher;

/* loaded from: classes5.dex */
public abstract class AdSessionStatePublisher {

    /* renamed from: a, reason: collision with root package name */
    private java.lang.String f4559a;
    private com.iab.omid.library.vungle.weakreference.b b;
    private com.iab.omid.library.vungle.adsession.AdEvents c;
    private com.iab.omid.library.vungle.adsession.media.MediaEvents d;
    private com.iab.omid.library.vungle.publisher.AdSessionStatePublisher.a e;
    private long f;

    enum a {
        AD_STATE_IDLE,
        AD_STATE_VISIBLE,
        AD_STATE_NOTVISIBLE
    }

    public AdSessionStatePublisher(java.lang.String str) {
        a();
        this.f4559a = str;
        this.b = new com.iab.omid.library.vungle.weakreference.b(null);
    }

    private org.json.JSONArray a(java.util.List<com.iab.omid.library.vungle.attestation.b> list) {
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        for (com.iab.omid.library.vungle.attestation.b bVar : list) {
            java.util.Iterator<java.lang.String> it = bVar.c().iterator();
            while (it.hasNext()) {
                jSONArray.put(a(bVar, it.next()));
            }
        }
        return jSONArray;
    }

    private org.json.JSONObject a(com.iab.omid.library.vungle.attestation.b bVar, java.lang.String str) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("mechanism", bVar.a());
        jSONObject.put("executionEnvironment", bVar.b().toString());
        jSONObject.put("version", str);
        return jSONObject;
    }

    private org.json.JSONObject a(org.json.JSONArray jSONArray) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        com.iab.omid.library.vungle.utils.c.a(jSONObject, "supportedAttestationMechanisms", jSONArray);
        return jSONObject;
    }

    private void a(org.json.JSONObject jSONObject) {
        com.iab.omid.library.vungle.internal.h.a().b(getWebView(), jSONObject);
    }

    public void a() {
        this.f = com.iab.omid.library.vungle.utils.f.b();
        this.e = com.iab.omid.library.vungle.publisher.AdSessionStatePublisher.a.AD_STATE_IDLE;
    }

    public void a(float f) {
        com.iab.omid.library.vungle.internal.h.a().a(getWebView(), this.f4559a, f);
    }

    void a(android.webkit.WebView webView) {
        this.b = new com.iab.omid.library.vungle.weakreference.b(webView);
    }

    public void a(com.iab.omid.library.vungle.adsession.AdEvents adEvents) {
        this.c = adEvents;
    }

    public void a(com.iab.omid.library.vungle.adsession.AdSessionConfiguration adSessionConfiguration) {
        com.iab.omid.library.vungle.internal.h.a().a(getWebView(), this.f4559a, adSessionConfiguration.toJsonObject());
    }

    public void a(com.iab.omid.library.vungle.adsession.ErrorType errorType, java.lang.String str) {
        com.iab.omid.library.vungle.internal.h.a().a(getWebView(), this.f4559a, errorType, str);
    }

    public void a(com.iab.omid.library.vungle.adsession.a aVar, com.iab.omid.library.vungle.adsession.AdSessionContext adSessionContext) {
        a(aVar, adSessionContext, null);
    }

    protected void a(com.iab.omid.library.vungle.adsession.a aVar, com.iab.omid.library.vungle.adsession.AdSessionContext adSessionContext, org.json.JSONObject jSONObject) {
        java.lang.String c = aVar.c();
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        com.iab.omid.library.vungle.utils.c.a(jSONObject2, "environment", "app");
        com.iab.omid.library.vungle.utils.c.a(jSONObject2, "adSessionType", adSessionContext.getAdSessionContextType());
        com.iab.omid.library.vungle.utils.c.a(jSONObject2, "deviceInfo", com.iab.omid.library.vungle.utils.b.d());
        com.iab.omid.library.vungle.utils.c.a(jSONObject2, "deviceCategory", com.iab.omid.library.vungle.utils.a.a().toString());
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        com.iab.omid.library.vungle.utils.c.a(jSONObject2, "supports", jSONArray);
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        com.iab.omid.library.vungle.utils.c.a(jSONObject3, com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_OM_PARTNER, adSessionContext.getPartner().getName());
        com.iab.omid.library.vungle.utils.c.a(jSONObject3, com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_OM_PARTNER_VERSION, adSessionContext.getPartner().getVersion());
        com.iab.omid.library.vungle.utils.c.a(jSONObject2, "omidNativeInfo", jSONObject3);
        org.json.JSONObject jSONObject4 = new org.json.JSONObject();
        com.iab.omid.library.vungle.utils.c.a(jSONObject4, "libraryVersion", "1.6.2-Vungle");
        com.iab.omid.library.vungle.utils.c.a(jSONObject4, com.google.firebase.remoteconfig.RemoteConfigConstants.RequestFieldKey.APP_ID, com.iab.omid.library.vungle.internal.g.b().a().getApplicationContext().getPackageName());
        com.iab.omid.library.vungle.utils.c.a(jSONObject2, "app", jSONObject4);
        if (adSessionContext.getContentUrl() != null) {
            com.iab.omid.library.vungle.utils.c.a(jSONObject2, "contentUrl", adSessionContext.getContentUrl());
        }
        if (adSessionContext.getCustomReferenceData() != null) {
            com.iab.omid.library.vungle.utils.c.a(jSONObject2, "customReferenceData", adSessionContext.getCustomReferenceData());
        }
        if (adSessionContext.getUniversalAdId() != null) {
            com.iab.omid.library.vungle.utils.c.a(jSONObject2, "universalAdId", adSessionContext.getUniversalAdId());
        }
        org.json.JSONObject jSONObject5 = new org.json.JSONObject();
        for (com.iab.omid.library.vungle.adsession.VerificationScriptResource verificationScriptResource : adSessionContext.getVerificationScriptResources()) {
            com.iab.omid.library.vungle.utils.c.a(jSONObject5, verificationScriptResource.getVendorKey(), verificationScriptResource.getVerificationParameters());
        }
        com.iab.omid.library.vungle.internal.h.a().a(getWebView(), c, jSONObject2, jSONObject5, jSONObject);
    }

    public void a(com.iab.omid.library.vungle.adsession.media.MediaEvents mediaEvents) {
        this.d = mediaEvents;
    }

    public void a(java.lang.String str) {
        a(str, (org.json.JSONObject) null);
    }

    public void a(java.lang.String str, long j) {
        if (j >= this.f) {
            com.iab.omid.library.vungle.publisher.AdSessionStatePublisher.a aVar = this.e;
            com.iab.omid.library.vungle.publisher.AdSessionStatePublisher.a aVar2 = com.iab.omid.library.vungle.publisher.AdSessionStatePublisher.a.AD_STATE_NOTVISIBLE;
            if (aVar != aVar2) {
                this.e = aVar2;
                com.iab.omid.library.vungle.internal.h.a().b(getWebView(), this.f4559a, str);
            }
        }
    }

    public void a(java.lang.String str, org.json.JSONObject jSONObject) {
        com.iab.omid.library.vungle.internal.h.a().a(getWebView(), this.f4559a, str, jSONObject);
    }

    public void a(java.util.Date date) {
        if (date == null) {
            return;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        com.iab.omid.library.vungle.utils.c.a(jSONObject, com.ironsource.C4.a.d, java.lang.Long.valueOf(date.getTime()));
        com.iab.omid.library.vungle.internal.h.a().a(getWebView(), jSONObject);
    }

    public void a(boolean z) {
        if (e()) {
            com.iab.omid.library.vungle.internal.h.a().c(getWebView(), this.f4559a, z ? "foregrounded" : "backgrounded");
        }
    }

    public void b() {
        this.b.clear();
    }

    public void b(java.lang.String str, long j) {
        if (j >= this.f) {
            this.e = com.iab.omid.library.vungle.publisher.AdSessionStatePublisher.a.AD_STATE_VISIBLE;
            com.iab.omid.library.vungle.internal.h.a().b(getWebView(), this.f4559a, str);
        }
    }

    public void b(java.util.List<com.iab.omid.library.vungle.attestation.b> list) {
        try {
            a(a(a(list)));
        } catch (org.json.JSONException e) {
            com.iab.omid.library.vungle.utils.d.a("Error creating JSON object publishSupportedAttestationMechanisms", e);
        }
    }

    public void b(org.json.JSONObject jSONObject) {
        com.iab.omid.library.vungle.internal.h.a().b(getWebView(), this.f4559a, jSONObject);
    }

    public void b(boolean z) {
        if (e()) {
            com.iab.omid.library.vungle.internal.h.a().a(getWebView(), this.f4559a, z ? "locked" : "unlocked");
        }
    }

    public com.iab.omid.library.vungle.adsession.AdEvents c() {
        return this.c;
    }

    public com.iab.omid.library.vungle.adsession.media.MediaEvents d() {
        return this.d;
    }

    public boolean e() {
        return this.b.get() != null;
    }

    public void f() {
        com.iab.omid.library.vungle.internal.h.a().a(getWebView(), this.f4559a);
    }

    public void g() {
        com.iab.omid.library.vungle.internal.h.a().b(getWebView(), this.f4559a);
    }

    public android.webkit.WebView getWebView() {
        return this.b.get();
    }

    public void h() {
        b((org.json.JSONObject) null);
    }

    public void i() {
    }
}
