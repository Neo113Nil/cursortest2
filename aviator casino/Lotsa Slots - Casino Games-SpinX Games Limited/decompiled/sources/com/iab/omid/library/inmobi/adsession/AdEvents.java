package com.iab.omid.library.inmobi.adsession;

/* loaded from: classes5.dex */
public final class AdEvents {
    private final com.iab.omid.library.inmobi.adsession.a adSession;

    private AdEvents(com.iab.omid.library.inmobi.adsession.a aVar) {
        this.adSession = aVar;
    }

    public static com.iab.omid.library.inmobi.adsession.AdEvents createAdEvents(com.iab.omid.library.inmobi.adsession.AdSession adSession) {
        com.iab.omid.library.inmobi.adsession.a aVar = (com.iab.omid.library.inmobi.adsession.a) adSession;
        com.iab.omid.library.inmobi.utils.g.a(adSession, "AdSession is null");
        com.iab.omid.library.inmobi.utils.g.g(aVar);
        com.iab.omid.library.inmobi.utils.g.b(aVar);
        com.iab.omid.library.inmobi.adsession.AdEvents adEvents = new com.iab.omid.library.inmobi.adsession.AdEvents(aVar);
        aVar.d().a(adEvents);
        return adEvents;
    }

    public void impressionOccurred() {
        com.iab.omid.library.inmobi.utils.g.b(this.adSession);
        com.iab.omid.library.inmobi.utils.g.e(this.adSession);
        if (!this.adSession.h()) {
            try {
                this.adSession.start();
            } catch (java.lang.Exception unused) {
            }
        }
        if (this.adSession.h()) {
            this.adSession.m();
        }
    }

    public void loaded() {
        com.iab.omid.library.inmobi.utils.g.a(this.adSession);
        com.iab.omid.library.inmobi.utils.g.e(this.adSession);
        this.adSession.n();
    }

    public void loaded(com.iab.omid.library.inmobi.adsession.media.VastProperties vastProperties) {
        com.iab.omid.library.inmobi.utils.g.a(vastProperties, "VastProperties is null");
        com.iab.omid.library.inmobi.utils.g.a(this.adSession);
        com.iab.omid.library.inmobi.utils.g.e(this.adSession);
        this.adSession.a(vastProperties.a());
    }
}
