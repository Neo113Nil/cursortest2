package com.iab.omid.library.vungle.attestation;

/* loaded from: classes5.dex */
public class f implements com.iab.omid.library.vungle.messagelistener.b {

    /* renamed from: a, reason: collision with root package name */
    private final com.iab.omid.library.vungle.messagelistener.a f4533a;

    private f(android.webkit.WebView webView) {
        com.iab.omid.library.vungle.messagelistener.a aVar = new com.iab.omid.library.vungle.messagelistener.a(webView, this);
        this.f4533a = aVar;
        aVar.a();
    }

    public static com.iab.omid.library.vungle.attestation.f a(android.webkit.WebView webView) {
        return new com.iab.omid.library.vungle.attestation.f(webView);
    }

    private void a(org.json.JSONObject jSONObject) {
        try {
            java.lang.String string = jSONObject.getString("mechanism");
            java.lang.String string2 = jSONObject.getString("version");
            java.util.Map<java.lang.String, java.lang.String> b = com.iab.omid.library.vungle.utils.c.b(jSONObject.getJSONObject("attestationArgs"));
            b.put("version", string2);
            com.iab.omid.library.vungle.attestation.e.a(com.iab.omid.library.vungle.internal.g.b().a().getApplicationContext(), string, new com.iab.omid.library.vungle.attestation.a(b));
        } catch (java.lang.Exception e) {
            com.iab.omid.library.vungle.utils.d.a("Error processing attestation request", e);
        }
    }

    @Override // com.iab.omid.library.vungle.messagelistener.b
    public java.lang.String getListenerName() {
        return "omidJsAttestationListener";
    }

    @Override // com.iab.omid.library.vungle.messagelistener.b
    public void onMessageReceived(java.lang.String str, org.json.JSONObject jSONObject) {
        if ("attest".equals(str)) {
            a(jSONObject);
            return;
        }
        com.iab.omid.library.vungle.utils.d.b("Unexpected method in AttestationMessageListener: " + str);
    }

    @Override // com.iab.omid.library.vungle.messagelistener.b
    public void onWebMessageListenerUnsupported() {
        com.iab.omid.library.vungle.utils.d.b("The Attestation Webview Listener cannot be supported in this WebView version.");
    }
}
