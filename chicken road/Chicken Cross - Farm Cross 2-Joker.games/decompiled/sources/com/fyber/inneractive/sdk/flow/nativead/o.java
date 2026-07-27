package com.fyber.inneractive.sdk.flow.nativead;

import com.fyber.inneractive.sdk.util.IAlog;

/* loaded from: classes4.dex */
public final class o implements com.fyber.inneractive.sdk.click.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f5374a;
    public final /* synthetic */ com.fyber.inneractive.sdk.util.g b;
    public final /* synthetic */ p c;

    public o(p pVar, i iVar, com.fyber.inneractive.sdk.util.g gVar) {
        this.c = pVar;
        this.f5374a = iVar;
        this.b = gVar;
    }

    @Override // com.fyber.inneractive.sdk.click.o
    public final void a(com.fyber.inneractive.sdk.click.b bVar) {
        if (bVar.f5221a == com.fyber.inneractive.sdk.click.q.FAILED) {
            p pVar = this.c;
            i iVar = this.f5374a;
            String str = bVar.d;
            com.fyber.inneractive.sdk.util.g gVar = this.b;
            pVar.getClass();
            IAlog.f("%s : Trying to resolve fallback Link: %s", p.b, str);
            j jVar = (j) pVar.f5375a;
            i iVar2 = jVar.f5369a;
            if (iVar2 == null || iVar2.equals(iVar)) {
                IAlog.a("%s : No valid link object, origin: %s", j.d, gVar);
                return;
            }
            p pVar2 = jVar.c;
            i iVar3 = jVar.f5369a;
            pVar2.getClass();
            com.fyber.inneractive.sdk.util.r.f5965a.execute(new m(pVar2, iVar3, true, gVar));
        }
    }
}
