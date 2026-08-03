package com.fyber.inneractive.sdk.measurement.tracker;

/* loaded from: classes3.dex */
public final class a extends com.fyber.inneractive.sdk.measurement.tracker.e {
    public a(com.iab.omid.library.fyber.adsession.Partner partner, com.fyber.inneractive.sdk.web.m mVar) {
        super(partner, mVar);
    }

    @Override // com.fyber.inneractive.sdk.measurement.tracker.e
    public final void a(com.fyber.inneractive.sdk.web.m mVar) {
        super.a(mVar);
        try {
            com.iab.omid.library.fyber.adsession.AdEvents createAdEvents = com.iab.omid.library.fyber.adsession.AdEvents.createAdEvents(this.f3791a);
            this.b = createAdEvents;
            createAdEvents.loaded();
        } catch (java.lang.Throwable unused) {
        }
    }

    @Override // com.fyber.inneractive.sdk.measurement.tracker.e
    public final com.iab.omid.library.fyber.adsession.AdSessionConfiguration b() {
        try {
            return com.iab.omid.library.fyber.adsession.AdSessionConfiguration.createAdSessionConfiguration(com.iab.omid.library.fyber.adsession.CreativeType.HTML_DISPLAY, com.iab.omid.library.fyber.adsession.ImpressionType.UNSPECIFIED, com.iab.omid.library.fyber.adsession.Owner.NATIVE, com.iab.omid.library.fyber.adsession.Owner.NONE, false);
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    @Override // com.fyber.inneractive.sdk.measurement.tracker.e
    public final void c() {
        com.iab.omid.library.fyber.adsession.AdEvents adEvents;
        if (this.c || this.f3791a == null || (adEvents = this.b) == null) {
            return;
        }
        this.c = true;
        try {
            adEvents.impressionOccurred();
        } catch (java.lang.Throwable unused) {
        }
    }

    @Override // com.fyber.inneractive.sdk.measurement.tracker.e
    public final void a() {
        com.fyber.inneractive.sdk.util.IAlog.f("%s Unsupported functionality for non video MRAID ads", com.fyber.inneractive.sdk.util.IAlog.a(this));
    }
}
