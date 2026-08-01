package com.fyber.inneractive.sdk.player.cache;

import com.fyber.inneractive.sdk.network.z;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.File;

/* loaded from: classes4.dex */
public final class m implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f5529a;

    public m(n nVar) {
        this.f5529a = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j;
        File a2 = n.a(this.f5529a.f5530a, "fyb.vamp.vid.cache");
        if (a2 != null) {
            try {
                IAlog.a("VideoCache opening the cache in directory - %s", a2);
                this.f5529a.b = g.a(a2, 52428800L);
                g gVar = this.f5529a.b;
                gVar.getClass();
                IAlog.e("DiskLruCache delete cache", new Object[0]);
                gVar.close();
                l.a(gVar.f5524a);
                this.f5529a.b = g.a(a2, 52428800L);
                g gVar2 = this.f5529a.b;
                synchronized (gVar2) {
                    j = gVar2.h;
                }
                IAlog.a("VideoCache opened the cache in directory - %s current size is %d", a2, Long.valueOf(j));
                n nVar = this.f5529a;
                nVar.b.l = nVar;
                nVar.c = true;
            } catch (Throwable th) {
                z.a("Failed to open cache directory", th.getMessage(), null, null);
                IAlog.a("Failed to open cache directory", th, new Object[0]);
            }
        }
    }
}
