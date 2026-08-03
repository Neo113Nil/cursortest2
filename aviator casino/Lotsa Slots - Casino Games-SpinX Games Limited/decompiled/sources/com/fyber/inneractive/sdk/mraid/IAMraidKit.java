package com.fyber.inneractive.sdk.mraid;

/* loaded from: classes3.dex */
public class IAMraidKit extends android.content.BroadcastReceiver {
    private static final com.fyber.inneractive.sdk.util.w sProvider = new com.fyber.inneractive.sdk.mraid.a();

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isMRaidSpotContent(com.fyber.inneractive.sdk.external.InneractiveAdSpot inneractiveAdSpot) {
        return inneractiveAdSpot.getAdContent() != null && (inneractiveAdSpot.getAdContent() instanceof com.fyber.inneractive.sdk.flow.q0);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        com.fyber.inneractive.sdk.util.IAlog.a("IAMraidKit: onReceive in package: %s", context.getApplicationContext().getPackageName());
        com.fyber.inneractive.sdk.util.w wVar = sProvider;
        com.fyber.inneractive.sdk.config.IAConfigManager.N.G.put(wVar.b(), wVar);
        com.fyber.inneractive.sdk.mraid.b bVar = new com.fyber.inneractive.sdk.mraid.b();
        com.fyber.inneractive.sdk.factories.f fVar = com.fyber.inneractive.sdk.factories.d.f3667a;
        fVar.a(com.fyber.inneractive.sdk.response.a.RETURNED_ADTYPE_HTML, bVar);
        fVar.a(com.fyber.inneractive.sdk.response.a.RETURNED_ADTYPE_MRAID, bVar);
        com.fyber.inneractive.sdk.factories.h.f3669a.f3670a.add(new com.fyber.inneractive.sdk.mraid.c(this));
        com.fyber.inneractive.sdk.factories.b.f3665a.f3666a.add(new com.fyber.inneractive.sdk.mraid.d(this));
    }
}
