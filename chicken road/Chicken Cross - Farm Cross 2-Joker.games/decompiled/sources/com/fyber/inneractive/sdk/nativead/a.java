package com.fyber.inneractive.sdk.nativead;

import com.fyber.inneractive.sdk.network.z;
import com.fyber.inneractive.sdk.player.cache.g;
import com.fyber.inneractive.sdk.player.cache.l;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.File;

/* loaded from: classes4.dex */
public final class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f5482a;

    public a(b bVar) {
        this.f5482a = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j;
        File a2 = b.a(this.f5482a);
        if (a2 != null) {
            try {
                IAlog.a("NativeCache opening the cache in directory - %s", a2);
                this.f5482a.b = g.a(a2, 41943040L);
                g gVar = this.f5482a.b;
                gVar.getClass();
                IAlog.e("DiskLruCache delete cache", new Object[0]);
                gVar.close();
                l.a(gVar.f5524a);
                this.f5482a.b = g.a(a2, 41943040L);
                g gVar2 = this.f5482a.b;
                synchronized (gVar2) {
                    j = gVar2.h;
                }
                IAlog.a("NativeCache opened the cache in directory - %s current size is %d", a2, Long.valueOf(j));
                b bVar = this.f5482a;
                bVar.b.l = bVar;
                bVar.c = true;
            } catch (Throwable th) {
                z.a("Failed to open cache directory", th.getMessage(), null, null);
                IAlog.a("Failed to open cache directory", th, new Object[0]);
            }
        }
    }
}
