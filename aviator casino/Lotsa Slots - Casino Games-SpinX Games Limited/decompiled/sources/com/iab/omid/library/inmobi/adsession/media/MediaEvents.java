package com.iab.omid.library.inmobi.adsession.media;

/* loaded from: classes5.dex */
public final class MediaEvents {
    private final com.iab.omid.library.inmobi.adsession.a adSession;

    private MediaEvents(com.iab.omid.library.inmobi.adsession.a aVar) {
        this.adSession = aVar;
    }

    private void confirmValidDuration(float f) {
        if (f <= 0.0f) {
            throw new java.lang.IllegalArgumentException("Invalid Media duration");
        }
    }

    private void confirmValidVolume(float f) {
        if (f < 0.0f || f > 1.0f) {
            throw new java.lang.IllegalArgumentException("Invalid Media volume");
        }
    }

    public static com.iab.omid.library.inmobi.adsession.media.MediaEvents createMediaEvents(com.iab.omid.library.inmobi.adsession.AdSession adSession) {
        com.iab.omid.library.inmobi.adsession.a aVar = (com.iab.omid.library.inmobi.adsession.a) adSession;
        com.iab.omid.library.inmobi.utils.g.a(adSession, "AdSession is null");
        com.iab.omid.library.inmobi.utils.g.f(aVar);
        com.iab.omid.library.inmobi.utils.g.c(aVar);
        com.iab.omid.library.inmobi.utils.g.b(aVar);
        com.iab.omid.library.inmobi.utils.g.h(aVar);
        com.iab.omid.library.inmobi.adsession.media.MediaEvents mediaEvents = new com.iab.omid.library.inmobi.adsession.media.MediaEvents(aVar);
        aVar.d().a(mediaEvents);
        return mediaEvents;
    }

    public void adUserInteraction(com.iab.omid.library.inmobi.adsession.media.InteractionType interactionType) {
        com.iab.omid.library.inmobi.utils.g.a(interactionType, "InteractionType is null");
        com.iab.omid.library.inmobi.utils.g.a(this.adSession);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        com.iab.omid.library.inmobi.utils.c.a(jSONObject, "interactionType", interactionType);
        this.adSession.d().a("adUserInteraction", jSONObject);
    }

    public void bufferFinish() {
        com.iab.omid.library.inmobi.utils.g.a(this.adSession);
        this.adSession.d().a("bufferFinish");
    }

    public void bufferStart() {
        com.iab.omid.library.inmobi.utils.g.a(this.adSession);
        this.adSession.d().a("bufferStart");
    }

    public void complete() {
        com.iab.omid.library.inmobi.utils.g.a(this.adSession);
        this.adSession.d().a("complete");
    }

    public void firstQuartile() {
        com.iab.omid.library.inmobi.utils.g.a(this.adSession);
        this.adSession.d().a("firstQuartile");
    }

    public void midpoint() {
        com.iab.omid.library.inmobi.utils.g.a(this.adSession);
        this.adSession.d().a("midpoint");
    }

    public void pause() {
        com.iab.omid.library.inmobi.utils.g.a(this.adSession);
        this.adSession.d().a("pause");
    }

    public void playerStateChange(com.iab.omid.library.inmobi.adsession.media.PlayerState playerState) {
        com.iab.omid.library.inmobi.utils.g.a(playerState, "PlayerState is null");
        com.iab.omid.library.inmobi.utils.g.a(this.adSession);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        com.iab.omid.library.inmobi.utils.c.a(jSONObject, "state", playerState);
        this.adSession.d().a("playerStateChange", jSONObject);
    }

    public void resume() {
        com.iab.omid.library.inmobi.utils.g.a(this.adSession);
        this.adSession.d().a("resume");
    }

    public void skipped() {
        com.iab.omid.library.inmobi.utils.g.a(this.adSession);
        this.adSession.d().a(com.facebook.login.LoginLogger.EVENT_PARAM_METHOD_RESULT_SKIPPED);
    }

    public void start(float f, float f2) {
        confirmValidDuration(f);
        confirmValidVolume(f2);
        com.iab.omid.library.inmobi.utils.g.a(this.adSession);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        com.iab.omid.library.inmobi.utils.c.a(jSONObject, com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_DURATION, java.lang.Float.valueOf(f));
        com.iab.omid.library.inmobi.utils.c.a(jSONObject, "mediaPlayerVolume", java.lang.Float.valueOf(f2));
        com.iab.omid.library.inmobi.utils.c.a(jSONObject, com.ironsource.X3.j.P, java.lang.Float.valueOf(com.iab.omid.library.inmobi.internal.i.c().b()));
        this.adSession.d().a("start", jSONObject);
    }

    public void thirdQuartile() {
        com.iab.omid.library.inmobi.utils.g.a(this.adSession);
        this.adSession.d().a("thirdQuartile");
    }

    public void volumeChange(float f) {
        confirmValidVolume(f);
        com.iab.omid.library.inmobi.utils.g.a(this.adSession);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        com.iab.omid.library.inmobi.utils.c.a(jSONObject, "mediaPlayerVolume", java.lang.Float.valueOf(f));
        com.iab.omid.library.inmobi.utils.c.a(jSONObject, com.ironsource.X3.j.P, java.lang.Float.valueOf(com.iab.omid.library.inmobi.internal.i.c().b()));
        this.adSession.d().a("volumeChange", jSONObject);
    }
}
