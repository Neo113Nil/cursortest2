package com.fyber.inneractive.sdk.player.exoplayer2;

/* loaded from: classes3.dex */
public final class f extends android.os.Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.player.exoplayer2.g f4028a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.fyber.inneractive.sdk.player.exoplayer2.g gVar, android.os.Looper looper) {
        super(looper);
        this.f4028a = gVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(android.os.Message message) {
        com.fyber.inneractive.sdk.player.exoplayer2.g gVar = this.f4028a;
        gVar.getClass();
        switch (message.what) {
            case 0:
                gVar.l--;
                return;
            case 1:
                gVar.j = message.arg1;
                java.util.Iterator it = gVar.e.iterator();
                while (it.hasNext()) {
                    ((com.fyber.inneractive.sdk.player.controller.b0) it.next()).a(gVar.j, gVar.i);
                }
                return;
            case 2:
                java.util.Iterator it2 = gVar.e.iterator();
                while (it2.hasNext()) {
                    ((com.fyber.inneractive.sdk.player.controller.b0) it2.next()).getClass();
                }
                return;
            case 3:
                if (gVar.l == 0) {
                    com.fyber.inneractive.sdk.player.exoplayer2.trackselection.j jVar = (com.fyber.inneractive.sdk.player.exoplayer2.trackselection.j) message.obj;
                    gVar.h = true;
                    com.fyber.inneractive.sdk.player.exoplayer2.source.z zVar = jVar.f4072a;
                    gVar.o = jVar.b;
                    com.fyber.inneractive.sdk.player.exoplayer2.trackselection.i iVar = gVar.f4029a;
                    java.lang.Object obj = jVar.c;
                    ((com.fyber.inneractive.sdk.player.exoplayer2.trackselection.g) iVar).getClass();
                    java.util.Iterator it3 = gVar.e.iterator();
                    while (it3.hasNext()) {
                        ((com.fyber.inneractive.sdk.player.controller.b0) it3.next()).getClass();
                    }
                    return;
                }
                return;
            case 4:
                int i = gVar.k - 1;
                gVar.k = i;
                if (i == 0) {
                    gVar.q = (com.fyber.inneractive.sdk.player.exoplayer2.i) message.obj;
                    if (message.arg1 != 0) {
                        java.util.Iterator it4 = gVar.e.iterator();
                        while (it4.hasNext()) {
                            ((com.fyber.inneractive.sdk.player.controller.b0) it4.next()).getClass();
                        }
                        return;
                    }
                    return;
                }
                return;
            case 5:
                if (gVar.k == 0) {
                    gVar.q = (com.fyber.inneractive.sdk.player.exoplayer2.i) message.obj;
                    java.util.Iterator it5 = gVar.e.iterator();
                    while (it5.hasNext()) {
                        ((com.fyber.inneractive.sdk.player.controller.b0) it5.next()).getClass();
                    }
                    return;
                }
                return;
            case 6:
                com.fyber.inneractive.sdk.player.exoplayer2.k kVar = (com.fyber.inneractive.sdk.player.exoplayer2.k) message.obj;
                gVar.k -= kVar.d;
                if (gVar.l == 0) {
                    gVar.m = kVar.f4033a;
                    gVar.n = kVar.b;
                    gVar.q = kVar.c;
                    java.util.Iterator it6 = gVar.e.iterator();
                    while (it6.hasNext()) {
                        ((com.fyber.inneractive.sdk.player.controller.b0) it6.next()).getClass();
                    }
                    return;
                }
                return;
            case 7:
                com.fyber.inneractive.sdk.player.exoplayer2.s sVar = (com.fyber.inneractive.sdk.player.exoplayer2.s) message.obj;
                if (gVar.p.equals(sVar)) {
                    return;
                }
                gVar.p = sVar;
                java.util.Iterator it7 = gVar.e.iterator();
                while (it7.hasNext()) {
                    ((com.fyber.inneractive.sdk.player.controller.b0) it7.next()).getClass();
                }
                return;
            case 8:
                com.fyber.inneractive.sdk.player.exoplayer2.d dVar = (com.fyber.inneractive.sdk.player.exoplayer2.d) message.obj;
                java.util.Iterator it8 = gVar.e.iterator();
                while (it8.hasNext()) {
                    com.fyber.inneractive.sdk.player.controller.b0 b0Var = (com.fyber.inneractive.sdk.player.controller.b0) it8.next();
                    com.fyber.inneractive.sdk.player.controller.f fVar = (com.fyber.inneractive.sdk.player.controller.f) b0Var.f3877a.get();
                    if (fVar != null && (dVar.getCause() instanceof com.fyber.inneractive.sdk.player.exoplayer2.audio.n) && (b0Var.b || (fVar.D && fVar.A))) {
                        fVar.v = true;
                        com.fyber.inneractive.sdk.player.exoplayer2.g gVar2 = fVar.s;
                        if (gVar2 != null) {
                            gVar2.d.d();
                            gVar2.c.removeCallbacksAndMessages(null);
                            fVar.s = null;
                        }
                        fVar.a(false);
                        fVar.a(fVar.C);
                        fVar.i.post(new com.fyber.inneractive.sdk.player.controller.k(fVar, false));
                    } else if (fVar == null || !fVar.A || b0Var.b || !com.fyber.inneractive.sdk.player.cache.n.f.c || !com.fyber.inneractive.sdk.util.s.a() || fVar.E >= fVar.p) {
                        com.fyber.inneractive.sdk.player.mediaplayer.o oVar = new com.fyber.inneractive.sdk.player.mediaplayer.o(dVar, dVar.getCause() == null ? "empty" : dVar.getCause().getMessage());
                        com.fyber.inneractive.sdk.util.IAlog.a("%sonPlayerError called with %s for sendErrorState", b0Var.a(), oVar);
                        com.fyber.inneractive.sdk.player.controller.f fVar2 = (com.fyber.inneractive.sdk.player.controller.f) com.fyber.inneractive.sdk.util.v.a(b0Var.f3877a);
                        if (fVar2 != null) {
                            fVar2.a(com.fyber.inneractive.sdk.player.enums.b.Error);
                            com.fyber.inneractive.sdk.util.IAlog.a("%sonPlayerError called with: %s for onPlayerError", com.fyber.inneractive.sdk.util.IAlog.a(fVar2), oVar);
                            fVar2.i.post(new com.fyber.inneractive.sdk.player.controller.j(fVar2, oVar));
                            fVar2.k();
                        }
                    } else {
                        com.fyber.inneractive.sdk.player.exoplayer2.g gVar3 = fVar.s;
                        if (gVar3 != null) {
                            gVar3.d.d();
                            gVar3.c.removeCallbacksAndMessages(null);
                            fVar.s = null;
                        }
                        fVar.a(true);
                        fVar.a(fVar.C);
                        fVar.E++;
                        fVar.i.post(new com.fyber.inneractive.sdk.player.controller.k(fVar, true));
                    }
                }
                return;
            default:
                throw new java.lang.IllegalStateException();
        }
    }
}
