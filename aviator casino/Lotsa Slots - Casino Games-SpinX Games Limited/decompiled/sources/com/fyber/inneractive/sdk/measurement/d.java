package com.fyber.inneractive.sdk.measurement;

/* loaded from: classes3.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f3785a;
    public final /* synthetic */ com.fyber.inneractive.sdk.measurement.e b;

    public d(com.fyber.inneractive.sdk.measurement.e eVar, android.content.Context context) {
        this.b = eVar;
        this.f3785a = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            com.iab.omid.library.fyber.Omid.activate(this.f3785a);
            this.b.e = com.iab.omid.library.fyber.adsession.Partner.createPartner("Fyber", com.fyber.inneractive.sdk.external.InneractiveAdManager.getVersion());
            com.fyber.inneractive.sdk.measurement.e.a(this.b, this.f3785a);
            com.fyber.inneractive.sdk.util.IAlog.a("OMID SDK was activated - version %s", com.iab.omid.library.fyber.Omid.getVersion());
            com.fyber.inneractive.sdk.util.IAlog.d("OMID SDK was activated - version %s", com.iab.omid.library.fyber.Omid.getVersion());
        } catch (java.lang.Throwable th) {
            com.fyber.inneractive.sdk.util.IAlog.a("Failed starting omsdk with exception %s", th.getLocalizedMessage());
            this.b.getClass();
            com.fyber.inneractive.sdk.network.z.a(th.getClass().getSimpleName(), "OpenMeasurementMeasurer - " + th.getMessage(), null, null);
        }
    }
}
