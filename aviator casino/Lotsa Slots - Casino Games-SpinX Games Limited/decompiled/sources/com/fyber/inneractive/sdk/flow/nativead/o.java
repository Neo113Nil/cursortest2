package com.fyber.inneractive.sdk.flow.nativead;

/* loaded from: classes3.dex */
public final class o implements com.fyber.inneractive.sdk.click.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.flow.nativead.i f3721a;
    public final /* synthetic */ com.fyber.inneractive.sdk.util.g b;
    public final /* synthetic */ com.fyber.inneractive.sdk.flow.nativead.p c;

    public o(com.fyber.inneractive.sdk.flow.nativead.p pVar, com.fyber.inneractive.sdk.flow.nativead.i iVar, com.fyber.inneractive.sdk.util.g gVar) {
        this.c = pVar;
        this.f3721a = iVar;
        this.b = gVar;
    }

    @Override // com.fyber.inneractive.sdk.click.o
    public final void a(com.fyber.inneractive.sdk.click.b bVar) {
        if (bVar.f3570a == com.fyber.inneractive.sdk.click.q.FAILED) {
            com.fyber.inneractive.sdk.flow.nativead.p pVar = this.c;
            com.fyber.inneractive.sdk.flow.nativead.i iVar = this.f3721a;
            java.lang.String str = bVar.d;
            com.fyber.inneractive.sdk.util.g gVar = this.b;
            pVar.getClass();
            com.fyber.inneractive.sdk.util.IAlog.f("%s : Trying to resolve fallback Link: %s", com.fyber.inneractive.sdk.flow.nativead.p.b, str);
            com.fyber.inneractive.sdk.flow.nativead.j jVar = (com.fyber.inneractive.sdk.flow.nativead.j) pVar.f3722a;
            com.fyber.inneractive.sdk.flow.nativead.i iVar2 = jVar.f3716a;
            if (iVar2 == null || iVar2.equals(iVar)) {
                com.fyber.inneractive.sdk.util.IAlog.a("%s : No valid link object, origin: %s", com.fyber.inneractive.sdk.flow.nativead.j.d, gVar);
                return;
            }
            com.fyber.inneractive.sdk.flow.nativead.p pVar2 = jVar.c;
            com.fyber.inneractive.sdk.flow.nativead.i iVar3 = jVar.f3716a;
            pVar2.getClass();
            com.fyber.inneractive.sdk.util.r.f4308a.execute(new com.fyber.inneractive.sdk.flow.nativead.m(pVar2, iVar3, true, gVar));
        }
    }
}
