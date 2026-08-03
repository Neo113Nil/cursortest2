package com.fyber.inneractive.sdk.player.controller;

/* loaded from: classes3.dex */
public final class m implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.player.enums.b f3889a;
    public final /* synthetic */ com.fyber.inneractive.sdk.player.controller.q b;

    public m(com.fyber.inneractive.sdk.player.controller.q qVar, com.fyber.inneractive.sdk.player.enums.b bVar) {
        this.b = qVar;
        this.f3889a = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.fyber.inneractive.sdk.player.controller.q qVar;
        com.fyber.inneractive.sdk.player.enums.b bVar;
        try {
            try {
                java.util.Iterator it = this.b.b.iterator();
                while (it.hasNext()) {
                    ((com.fyber.inneractive.sdk.player.controller.p) it.next()).a(this.f3889a);
                }
                bVar = this.f3889a;
            } catch (java.lang.Exception e) {
                if (com.fyber.inneractive.sdk.util.IAlog.f4283a <= 3) {
                    com.fyber.inneractive.sdk.player.controller.q qVar2 = this.b;
                    qVar2.getClass();
                    com.fyber.inneractive.sdk.util.IAlog.a("%sonPlayerStateChanged callback threw an exception!", e, com.fyber.inneractive.sdk.util.IAlog.a(qVar2));
                }
                com.fyber.inneractive.sdk.player.enums.b bVar2 = this.f3889a;
                if (bVar2 != com.fyber.inneractive.sdk.player.enums.b.Idle && bVar2 != com.fyber.inneractive.sdk.player.enums.b.Error) {
                    return;
                }
                com.fyber.inneractive.sdk.util.v.a(this.b.j);
                qVar = this.b;
                qVar.j = null;
            }
            if (bVar == com.fyber.inneractive.sdk.player.enums.b.Idle || bVar == com.fyber.inneractive.sdk.player.enums.b.Error) {
                com.fyber.inneractive.sdk.util.v.a(this.b.j);
                qVar = this.b;
                qVar.j = null;
                qVar.k = null;
            }
        } catch (java.lang.Throwable th) {
            com.fyber.inneractive.sdk.player.enums.b bVar3 = this.f3889a;
            if (bVar3 == com.fyber.inneractive.sdk.player.enums.b.Idle || bVar3 == com.fyber.inneractive.sdk.player.enums.b.Error) {
                com.fyber.inneractive.sdk.util.v.a(this.b.j);
                com.fyber.inneractive.sdk.player.controller.q qVar3 = this.b;
                qVar3.j = null;
                qVar3.k = null;
            }
            throw th;
        }
    }
}
