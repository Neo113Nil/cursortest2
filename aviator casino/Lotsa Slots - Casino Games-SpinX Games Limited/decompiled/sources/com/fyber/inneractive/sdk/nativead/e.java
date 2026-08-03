package com.fyber.inneractive.sdk.nativead;

/* loaded from: classes3.dex */
public final class e extends android.content.BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        com.fyber.inneractive.sdk.nativead.b bVar = com.fyber.inneractive.sdk.nativead.b.f;
        android.content.Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            bVar.getClass();
            com.fyber.inneractive.sdk.util.IAlog.f("context is null, would not start the native cache.", new java.lang.Object[0]);
        } else if (!bVar.c || !com.fyber.inneractive.sdk.util.s.a()) {
            bVar.f3829a = applicationContext;
            new java.lang.Thread(bVar.e, "NativeCache").start();
        }
        com.fyber.inneractive.sdk.factories.d.f3667a.a(com.fyber.inneractive.sdk.response.a.RETURNED_ADTYPE_NATIVE, new com.fyber.inneractive.sdk.nativead.c());
        com.fyber.inneractive.sdk.factories.k kVar = com.fyber.inneractive.sdk.factories.j.f3671a;
        kVar.f3672a.add(new com.fyber.inneractive.sdk.nativead.d());
    }
}
