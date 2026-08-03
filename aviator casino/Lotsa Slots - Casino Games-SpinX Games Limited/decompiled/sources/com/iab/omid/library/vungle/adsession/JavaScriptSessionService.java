package com.iab.omid.library.vungle.adsession;

/* loaded from: classes5.dex */
public class JavaScriptSessionService implements com.iab.omid.library.vungle.messagelistener.b {
    private static java.lang.String JS_MESSAGE_DATA_AD_SESSION_ID = "adSessionId";
    private static java.lang.String JS_MESSAGE_LISTENER_JS_SESSION_SERVICE = "omidJsSessionService";
    private static java.lang.String JS_MESSAGE_METHOD_FINISH_SESSION = "finishSession";
    private static java.lang.String JS_MESSAGE_METHOD_START_SESSION = "startSession";
    private final java.util.HashMap<java.lang.String, com.iab.omid.library.vungle.adsession.AdSession> adSessions = new java.util.HashMap<>();
    private final com.iab.omid.library.vungle.internal.f friendlyObstructions = new com.iab.omid.library.vungle.internal.f();
    private final boolean isHtmlAdView;
    private final com.iab.omid.library.vungle.messagelistener.a messageListener;
    private final com.iab.omid.library.vungle.adsession.Partner partner;
    private com.iab.omid.library.vungle.weakreference.a weakAdView;
    private final android.webkit.WebView webView;

    public interface TearDownHandler {
        void onTearDown(boolean z);
    }

    private JavaScriptSessionService(com.iab.omid.library.vungle.adsession.Partner partner, android.webkit.WebView webView, boolean z) {
        com.iab.omid.library.vungle.utils.g.a();
        com.iab.omid.library.vungle.utils.g.a(partner, "Partner is null");
        com.iab.omid.library.vungle.utils.g.a(webView, "WebView is null");
        this.partner = partner;
        this.webView = webView;
        this.isHtmlAdView = z;
        if (z) {
            setAdView(webView);
        }
        com.iab.omid.library.vungle.messagelistener.a aVar = new com.iab.omid.library.vungle.messagelistener.a(webView, this);
        this.messageListener = aVar;
        aVar.a();
    }

    public static com.iab.omid.library.vungle.adsession.JavaScriptSessionService create(com.iab.omid.library.vungle.adsession.Partner partner, android.webkit.WebView webView, boolean z) {
        return new com.iab.omid.library.vungle.adsession.JavaScriptSessionService(partner, webView, z);
    }

    private com.iab.omid.library.vungle.adsession.AdSessionConfiguration createAdSessionConfiguration() {
        com.iab.omid.library.vungle.adsession.CreativeType creativeType = com.iab.omid.library.vungle.adsession.CreativeType.DEFINED_BY_JAVASCRIPT;
        com.iab.omid.library.vungle.adsession.ImpressionType impressionType = com.iab.omid.library.vungle.adsession.ImpressionType.DEFINED_BY_JAVASCRIPT;
        com.iab.omid.library.vungle.adsession.Owner owner = com.iab.omid.library.vungle.adsession.Owner.JAVASCRIPT;
        return com.iab.omid.library.vungle.adsession.AdSessionConfiguration.createAdSessionConfiguration(creativeType, impressionType, owner, owner, false);
    }

    private com.iab.omid.library.vungle.adsession.AdSessionContext createAdSessionContext() {
        return this.isHtmlAdView ? com.iab.omid.library.vungle.adsession.AdSessionContext.createHtmlAdSessionContext(this.partner, this.webView, null, null) : com.iab.omid.library.vungle.adsession.AdSessionContext.createJavascriptAdSessionContext(this.partner, this.webView, null, null);
    }

    private void finishSession(java.lang.String str) {
        com.iab.omid.library.vungle.adsession.AdSession adSession = this.adSessions.get(str);
        if (adSession != null) {
            adSession.finish();
            this.adSessions.remove(str);
        }
    }

    private void startSession(java.lang.String str) {
        com.iab.omid.library.vungle.adsession.a aVar = new com.iab.omid.library.vungle.adsession.a(createAdSessionConfiguration(), createAdSessionContext(), str);
        this.adSessions.put(str, aVar);
        aVar.registerAdView(getAdView());
        for (com.iab.omid.library.vungle.internal.e eVar : this.friendlyObstructions.a()) {
            aVar.addFriendlyObstruction(eVar.c().get(), eVar.b(), eVar.a());
        }
        aVar.start();
    }

    public void addFriendlyObstruction(android.view.View view, com.iab.omid.library.vungle.adsession.FriendlyObstructionPurpose friendlyObstructionPurpose, java.lang.String str) {
        java.util.Iterator<com.iab.omid.library.vungle.adsession.AdSession> it = this.adSessions.values().iterator();
        while (it.hasNext()) {
            it.next().addFriendlyObstruction(view, friendlyObstructionPurpose, str);
        }
        this.friendlyObstructions.a(view, friendlyObstructionPurpose, str);
    }

    android.view.View getAdView() {
        com.iab.omid.library.vungle.weakreference.a aVar = this.weakAdView;
        if (aVar == null) {
            return null;
        }
        return aVar.get();
    }

    @Override // com.iab.omid.library.vungle.messagelistener.b
    public java.lang.String getListenerName() {
        return JS_MESSAGE_LISTENER_JS_SESSION_SERVICE;
    }

    @Override // com.iab.omid.library.vungle.messagelistener.b
    public void onMessageReceived(java.lang.String str, org.json.JSONObject jSONObject) {
        try {
            java.lang.String string = jSONObject.getString(JS_MESSAGE_DATA_AD_SESSION_ID);
            if (str.equals(JS_MESSAGE_METHOD_START_SESSION)) {
                startSession(string);
            } else if (str.equals(JS_MESSAGE_METHOD_FINISH_SESSION)) {
                finishSession(string);
            } else {
                com.iab.omid.library.vungle.utils.d.d("Unexpected method in JavaScriptSessionService: " + str);
            }
        } catch (org.json.JSONException e) {
            com.iab.omid.library.vungle.utils.d.a("Error parsing JS message in JavaScriptSessionService.", e);
        }
    }

    @Override // com.iab.omid.library.vungle.messagelistener.b
    public void onWebMessageListenerUnsupported() {
        throw new java.lang.UnsupportedOperationException("The JavaScriptSessionService cannot be supported in this WebView version.");
    }

    public void removeAllFriendlyObstructions() {
        java.util.Iterator<com.iab.omid.library.vungle.adsession.AdSession> it = this.adSessions.values().iterator();
        while (it.hasNext()) {
            it.next().removeAllFriendlyObstructions();
        }
        this.friendlyObstructions.b();
    }

    public void removeFriendlyObstruction(android.view.View view) {
        java.util.Iterator<com.iab.omid.library.vungle.adsession.AdSession> it = this.adSessions.values().iterator();
        while (it.hasNext()) {
            it.next().removeFriendlyObstruction(view);
        }
        this.friendlyObstructions.c(view);
    }

    public void setAdView(android.view.View view) {
        if (getAdView() == view) {
            return;
        }
        java.util.Iterator<com.iab.omid.library.vungle.adsession.AdSession> it = this.adSessions.values().iterator();
        while (it.hasNext()) {
            it.next().registerAdView(view);
        }
        this.weakAdView = new com.iab.omid.library.vungle.weakreference.a(view);
    }

    public void tearDown(final com.iab.omid.library.vungle.adsession.JavaScriptSessionService.TearDownHandler tearDownHandler) {
        java.util.Iterator<com.iab.omid.library.vungle.adsession.AdSession> it = this.adSessions.values().iterator();
        while (it.hasNext()) {
            it.next().finish();
        }
        final java.util.Timer timer = new java.util.Timer();
        timer.schedule(new java.util.TimerTask() { // from class: com.iab.omid.library.vungle.adsession.JavaScriptSessionService.1
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                com.iab.omid.library.vungle.adsession.JavaScriptSessionService.this.messageListener.b();
                tearDownHandler.onTearDown(true);
                timer.cancel();
            }
        }, 1000L);
    }
}
