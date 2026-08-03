package com.fyber.inneractive.sdk.nativead;

/* loaded from: classes3.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.nativead.b f3828a;

    public a(com.fyber.inneractive.sdk.nativead.b bVar) {
        this.f3828a = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j;
        java.io.File a2 = com.fyber.inneractive.sdk.nativead.b.a(this.f3828a);
        if (a2 != null) {
            try {
                com.fyber.inneractive.sdk.util.IAlog.a("NativeCache opening the cache in directory - %s", a2);
                this.f3828a.b = com.fyber.inneractive.sdk.player.cache.g.a(a2, 41943040L);
                com.fyber.inneractive.sdk.player.cache.g gVar = this.f3828a.b;
                gVar.getClass();
                com.fyber.inneractive.sdk.util.IAlog.e("DiskLruCache delete cache", new java.lang.Object[0]);
                gVar.close();
                com.fyber.inneractive.sdk.player.cache.l.a(gVar.f3870a);
                this.f3828a.b = com.fyber.inneractive.sdk.player.cache.g.a(a2, 41943040L);
                com.fyber.inneractive.sdk.player.cache.g gVar2 = this.f3828a.b;
                synchronized (gVar2) {
                    j = gVar2.h;
                }
                com.fyber.inneractive.sdk.util.IAlog.a("NativeCache opened the cache in directory - %s current size is %d", a2, java.lang.Long.valueOf(j));
                com.fyber.inneractive.sdk.nativead.b bVar = this.f3828a;
                bVar.b.l = bVar;
                bVar.c = true;
            } catch (java.lang.Throwable th) {
                com.fyber.inneractive.sdk.network.z.a("Failed to open cache directory", th.getMessage(), null, null);
                com.fyber.inneractive.sdk.util.IAlog.a("Failed to open cache directory", th, new java.lang.Object[0]);
            }
        }
    }
}
