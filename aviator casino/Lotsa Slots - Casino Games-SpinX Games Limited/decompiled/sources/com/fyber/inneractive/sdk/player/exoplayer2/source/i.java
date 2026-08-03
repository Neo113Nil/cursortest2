package com.fyber.inneractive.sdk.player.exoplayer2.source;

/* loaded from: classes3.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.player.exoplayer2.source.p f4055a;

    public i(com.fyber.inneractive.sdk.player.exoplayer2.source.p pVar) {
        this.f4055a = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.fyber.inneractive.sdk.player.exoplayer2.source.p pVar = this.f4055a;
        if (pVar.G || pVar.s || pVar.q == null || !pVar.r) {
            return;
        }
        int size = pVar.o.size();
        for (int i = 0; i < size; i++) {
            if (((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) pVar.o.valueAt(i)).e() == null) {
                return;
            }
        }
        com.fyber.inneractive.sdk.player.exoplayer2.util.e eVar = pVar.k;
        synchronized (eVar) {
            eVar.f4105a = false;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.source.y[] yVarArr = new com.fyber.inneractive.sdk.player.exoplayer2.source.y[size];
        pVar.z = new boolean[size];
        pVar.y = new boolean[size];
        pVar.x = pVar.q.c();
        int i2 = 0;
        while (true) {
            boolean z = true;
            if (i2 >= size) {
                pVar.w = new com.fyber.inneractive.sdk.player.exoplayer2.source.z(yVarArr);
                pVar.s = true;
                com.fyber.inneractive.sdk.player.exoplayer2.source.t tVar = pVar.f;
                long j = pVar.x;
                tVar.a(new com.fyber.inneractive.sdk.player.exoplayer2.source.x(j, j, 0L, 0L, pVar.q.a(), false), null);
                ((com.fyber.inneractive.sdk.player.exoplayer2.l) pVar.p).f.obtainMessage(8, pVar).sendToTarget();
                return;
            }
            com.fyber.inneractive.sdk.player.exoplayer2.o e = ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) pVar.o.valueAt(i2)).e();
            yVarArr[i2] = new com.fyber.inneractive.sdk.player.exoplayer2.source.y(e);
            java.lang.String str = e.f;
            if (!"video".equals(com.fyber.inneractive.sdk.player.exoplayer2.util.i.b(str)) && !"audio".equals(com.fyber.inneractive.sdk.player.exoplayer2.util.i.b(str))) {
                z = false;
            }
            pVar.z[i2] = z;
            pVar.A = z | pVar.A;
            i2++;
        }
    }
}
