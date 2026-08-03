package com.ironsource;

/* loaded from: classes5.dex */
public class Fc {
    public static final java.lang.String d = "Ironsrc";
    public static final java.lang.String e = "7";
    public static final java.lang.String f = com.iab.omid.library.ironsrc.Omid.getVersion();
    public static final java.lang.String g = "omidVersion";
    public static final java.lang.String h = "omidPartnerName";
    public static final java.lang.String i = "omidPartnerVersion";
    public static final java.lang.String j = "omidActiveAdSessions";
    private static final java.lang.String k = "Invalid OMID impressionOwner";
    private static final java.lang.String l = "Invalid OMID videoEventsOwner";
    private static final java.lang.String m = "Missing OMID impressionOwner";
    private static final java.lang.String n = "Missing OMID videoEventsOwner";
    private static final java.lang.String o = "OMID has not been activated";
    private static final java.lang.String p = "Missing OMID creativeType";
    private static final java.lang.String q = "Missing adview id in OMID params";
    private static final java.lang.String r = "No adview found with the provided adViewId";
    private static final java.lang.String s = "OMID Session has already started";
    private static final java.lang.String t = "OMID Session has not started";

    /* renamed from: a, reason: collision with root package name */
    private final com.iab.omid.library.ironsrc.adsession.Partner f5705a = com.iab.omid.library.ironsrc.adsession.Partner.createPartner(d, e);
    private boolean c = false;
    private final java.util.HashMap<java.lang.String, com.iab.omid.library.ironsrc.adsession.AdSession> b = new java.util.HashMap<>();

    static class a {
        private static final java.lang.String i = "isolateVerificationScripts";
        private static final java.lang.String j = "impressionOwner";
        private static final java.lang.String k = "videoEventsOwner";
        private static final java.lang.String l = "customReferenceData";
        private static final java.lang.String m = "creativeType";
        private static final java.lang.String n = "impressionType";
        public static final java.lang.String o = "adViewId";

        /* renamed from: a, reason: collision with root package name */
        public boolean f5706a;
        public com.iab.omid.library.ironsrc.adsession.Owner b;
        public com.iab.omid.library.ironsrc.adsession.Owner c;
        public java.lang.String d;
        public com.iab.omid.library.ironsrc.adsession.ImpressionType e;
        public com.iab.omid.library.ironsrc.adsession.CreativeType f;
        public java.lang.String g;
        public com.iab.omid.library.ironsrc.adsession.Owner h;

        public static com.ironsource.Fc.a a(org.json.JSONObject jSONObject) throws java.lang.IllegalArgumentException {
            com.ironsource.Fc.a aVar = new com.ironsource.Fc.a();
            aVar.f5706a = jSONObject.optBoolean("isolateVerificationScripts", false);
            java.lang.String optString = jSONObject.optString("impressionOwner", "");
            if (android.text.TextUtils.isEmpty(optString)) {
                throw new java.lang.IllegalArgumentException(com.ironsource.Fc.m);
            }
            try {
                aVar.b = com.iab.omid.library.ironsrc.adsession.Owner.valueOf(optString.toUpperCase(java.util.Locale.getDefault()));
                java.lang.String optString2 = jSONObject.optString("videoEventsOwner", "");
                if (android.text.TextUtils.isEmpty(optString)) {
                    throw new java.lang.IllegalArgumentException(com.ironsource.Fc.n);
                }
                try {
                    aVar.c = com.iab.omid.library.ironsrc.adsession.Owner.valueOf(optString2.toUpperCase(java.util.Locale.getDefault()));
                    aVar.d = jSONObject.optString("customReferenceData", "");
                    aVar.f = b(jSONObject);
                    aVar.e = c(jSONObject);
                    aVar.g = e(jSONObject);
                    aVar.h = d(jSONObject);
                    return aVar;
                } catch (java.lang.IllegalArgumentException e) {
                    com.ironsource.C3180n4.d().a(e);
                    throw new java.lang.IllegalArgumentException("Invalid OMID videoEventsOwner " + optString2);
                }
            } catch (java.lang.IllegalArgumentException e2) {
                com.ironsource.C3180n4.d().a(e2);
                throw new java.lang.IllegalArgumentException("Invalid OMID impressionOwner " + optString);
            }
        }

        private static com.iab.omid.library.ironsrc.adsession.CreativeType b(org.json.JSONObject jSONObject) throws java.lang.IllegalArgumentException {
            java.lang.String optString = jSONObject.optString("creativeType", "");
            if (android.text.TextUtils.isEmpty(optString)) {
                throw new java.lang.IllegalArgumentException(com.ironsource.Fc.p + optString);
            }
            for (com.iab.omid.library.ironsrc.adsession.CreativeType creativeType : com.iab.omid.library.ironsrc.adsession.CreativeType.values()) {
                if (optString.equalsIgnoreCase(creativeType.toString())) {
                    return creativeType;
                }
            }
            throw new java.lang.IllegalArgumentException(com.ironsource.Fc.p + optString);
        }

        private static com.iab.omid.library.ironsrc.adsession.ImpressionType c(org.json.JSONObject jSONObject) throws java.lang.IllegalArgumentException {
            java.lang.String optString = jSONObject.optString("impressionType", "");
            if (android.text.TextUtils.isEmpty(optString)) {
                throw new java.lang.IllegalArgumentException(com.ironsource.Fc.p + optString);
            }
            for (com.iab.omid.library.ironsrc.adsession.ImpressionType impressionType : com.iab.omid.library.ironsrc.adsession.ImpressionType.values()) {
                if (optString.equalsIgnoreCase(impressionType.toString())) {
                    return impressionType;
                }
            }
            throw new java.lang.IllegalArgumentException(com.ironsource.Fc.p + optString);
        }

        private static com.iab.omid.library.ironsrc.adsession.Owner d(org.json.JSONObject jSONObject) throws java.lang.IllegalArgumentException {
            java.lang.String optString = jSONObject.optString("videoEventsOwner", "");
            com.iab.omid.library.ironsrc.adsession.Owner owner = com.iab.omid.library.ironsrc.adsession.Owner.NONE;
            try {
                return com.iab.omid.library.ironsrc.adsession.Owner.valueOf(optString.toUpperCase(java.util.Locale.getDefault()));
            } catch (java.lang.IllegalArgumentException e) {
                com.ironsource.C3180n4.d().a(e);
                return owner;
            }
        }

        private static java.lang.String e(org.json.JSONObject jSONObject) throws java.lang.IllegalArgumentException {
            java.lang.String optString = jSONObject.optString("adViewId", "");
            if (!android.text.TextUtils.isEmpty(optString)) {
                return optString;
            }
            throw new java.lang.IllegalArgumentException(com.ironsource.Fc.q + optString);
        }
    }

    public void a(android.content.Context context) throws java.lang.IllegalArgumentException {
        if (this.c) {
            return;
        }
        com.iab.omid.library.ironsrc.Omid.activate(context);
        this.c = true;
    }

    public void b(org.json.JSONObject jSONObject) throws java.lang.IllegalStateException {
        a(jSONObject);
        java.lang.String optString = jSONObject.optString("adViewId");
        com.iab.omid.library.ironsrc.adsession.AdSession adSession = this.b.get(optString);
        if (adSession == null) {
            throw new java.lang.IllegalStateException(t);
        }
        adSession.finish();
        this.b.remove(optString);
    }

    public void c(org.json.JSONObject jSONObject) throws java.lang.IllegalArgumentException, java.lang.IllegalStateException {
        a(jSONObject);
        com.iab.omid.library.ironsrc.adsession.AdSession adSession = this.b.get(jSONObject.optString("adViewId"));
        if (adSession == null) {
            throw new java.lang.IllegalStateException(t);
        }
        com.iab.omid.library.ironsrc.adsession.AdEvents createAdEvents = com.iab.omid.library.ironsrc.adsession.AdEvents.createAdEvents(adSession);
        if (jSONObject.optBoolean("signalLoaded")) {
            createAdEvents.loaded();
        }
        createAdEvents.impressionOccurred();
    }

    public void d(org.json.JSONObject jSONObject) throws java.lang.IllegalStateException, java.lang.IllegalArgumentException {
        a(com.ironsource.Fc.a.a(jSONObject));
    }

    public com.ironsource.C3101ie a() {
        com.ironsource.C3101ie c3101ie = new com.ironsource.C3101ie();
        c3101ie.b(g, com.ironsource.sdk.utils.SDKUtils.encodeString(f));
        c3101ie.b(h, com.ironsource.sdk.utils.SDKUtils.encodeString(d));
        c3101ie.b(i, com.ironsource.sdk.utils.SDKUtils.encodeString(e));
        c3101ie.b(j, com.ironsource.sdk.utils.SDKUtils.encodeString(java.util.Arrays.toString(this.b.keySet().toArray())));
        return c3101ie;
    }

    public void a(com.ironsource.Fc.a aVar) throws java.lang.IllegalStateException, java.lang.IllegalArgumentException {
        if (this.c) {
            if (!android.text.TextUtils.isEmpty(aVar.g)) {
                java.lang.String str = aVar.g;
                if (!this.b.containsKey(str)) {
                    com.ironsource.G8 a2 = com.ironsource.C3148l8.a().a(str);
                    if (a2 != null) {
                        com.iab.omid.library.ironsrc.adsession.AdSession a3 = a(aVar, a2);
                        a3.start();
                        this.b.put(str, a3);
                        return;
                    }
                    throw new java.lang.IllegalStateException(r);
                }
                throw new java.lang.IllegalStateException(s);
            }
            throw new java.lang.IllegalStateException(q);
        }
        throw new java.lang.IllegalStateException(o);
    }

    private com.iab.omid.library.ironsrc.adsession.AdSession a(com.ironsource.Fc.a aVar, com.ironsource.G8 g8) throws java.lang.IllegalArgumentException {
        com.iab.omid.library.ironsrc.adsession.AdSession createAdSession = com.iab.omid.library.ironsrc.adsession.AdSession.createAdSession(com.iab.omid.library.ironsrc.adsession.AdSessionConfiguration.createAdSessionConfiguration(aVar.f, aVar.e, aVar.b, aVar.c, aVar.f5706a), com.iab.omid.library.ironsrc.adsession.AdSessionContext.createHtmlAdSessionContext(this.f5705a, g8.getPresentingView(), null, aVar.d));
        createAdSession.registerAdView(g8.getPresentingView());
        return createAdSession;
    }

    private void a(org.json.JSONObject jSONObject) throws java.lang.IllegalStateException {
        if (!this.c) {
            throw new java.lang.IllegalStateException(o);
        }
        if (jSONObject == null) {
            throw new java.lang.IllegalStateException(t);
        }
    }
}
