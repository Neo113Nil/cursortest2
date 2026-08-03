package com.fyber.inneractive.sdk.video;

/* loaded from: classes3.dex */
public class IAVideoKit extends android.content.BroadcastReceiver {
    private static final com.fyber.inneractive.sdk.util.w sProvider = new com.fyber.inneractive.sdk.video.a();

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        com.fyber.inneractive.sdk.util.w wVar = sProvider;
        com.fyber.inneractive.sdk.config.IAConfigManager.N.G.put(wVar.b(), wVar);
        com.fyber.inneractive.sdk.player.cache.n nVar = com.fyber.inneractive.sdk.player.cache.n.f;
        android.content.Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            nVar.getClass();
            com.fyber.inneractive.sdk.util.IAlog.f("context is null, would not start the video cache.", new java.lang.Object[0]);
        } else if (!nVar.c || !com.fyber.inneractive.sdk.util.s.a()) {
            nVar.f3876a = applicationContext;
            new java.lang.Thread(nVar.e, "VideoCache").start();
        }
        com.fyber.inneractive.sdk.util.IAlog.a("IAVideoKit: onReceive in package: %s", context.getApplicationContext().getPackageName());
        com.fyber.inneractive.sdk.factories.d.f3667a.a(com.fyber.inneractive.sdk.response.a.RETURNED_ADTYPE_VAST, new com.fyber.inneractive.sdk.video.b());
        com.fyber.inneractive.sdk.factories.h.f3669a.f3670a.add(new com.fyber.inneractive.sdk.video.c());
        com.fyber.inneractive.sdk.factories.b.f3665a.f3666a.add(new com.fyber.inneractive.sdk.video.d());
    }
}
