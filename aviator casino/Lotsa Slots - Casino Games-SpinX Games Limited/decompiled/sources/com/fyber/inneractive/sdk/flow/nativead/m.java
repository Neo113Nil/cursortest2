package com.fyber.inneractive.sdk.flow.nativead;

/* loaded from: classes3.dex */
public final class m implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.flow.nativead.i f3717a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ com.fyber.inneractive.sdk.util.g c;
    public final /* synthetic */ com.fyber.inneractive.sdk.flow.nativead.p d;

    public m(com.fyber.inneractive.sdk.flow.nativead.p pVar, com.fyber.inneractive.sdk.flow.nativead.i iVar, boolean z, com.fyber.inneractive.sdk.util.g gVar) {
        this.d = pVar;
        this.f3717a = iVar;
        this.b = z;
        this.c = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0077  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        com.fyber.inneractive.sdk.click.o oVar;
        java.util.Iterator it;
        com.fyber.inneractive.sdk.flow.nativead.p pVar = this.d;
        com.fyber.inneractive.sdk.flow.nativead.i iVar = this.f3717a;
        boolean z = this.b;
        com.fyber.inneractive.sdk.util.g gVar = this.c;
        pVar.getClass();
        java.lang.String str = iVar.f3715a;
        java.lang.String str2 = iVar.b;
        if (com.fyber.inneractive.sdk.util.v.a(str)) {
            oVar = new com.fyber.inneractive.sdk.flow.nativead.n(pVar, iVar, str2, gVar);
        } else {
            if (!com.fyber.inneractive.sdk.util.v.a(str2)) {
                com.fyber.inneractive.sdk.flow.nativead.j jVar = (com.fyber.inneractive.sdk.flow.nativead.j) pVar.f3722a;
                com.fyber.inneractive.sdk.flow.nativead.i iVar2 = jVar.f3716a;
                if (iVar2 == null || iVar2.equals(iVar)) {
                    com.fyber.inneractive.sdk.util.IAlog.a("%s : No valid link object, origin: %s", com.fyber.inneractive.sdk.flow.nativead.j.d, gVar);
                } else {
                    com.fyber.inneractive.sdk.flow.nativead.p pVar2 = jVar.c;
                    com.fyber.inneractive.sdk.flow.nativead.i iVar3 = jVar.f3716a;
                    pVar2.getClass();
                    com.fyber.inneractive.sdk.util.r.f4308a.execute(new com.fyber.inneractive.sdk.flow.nativead.m(pVar2, iVar3, true, gVar));
                }
                com.fyber.inneractive.sdk.flow.nativead.p pVar3 = this.d;
                com.fyber.inneractive.sdk.flow.nativead.i iVar4 = this.f3717a;
                pVar3.getClass();
                it = iVar4.c.iterator();
                while (it.hasNext()) {
                    java.lang.String str3 = (java.lang.String) it.next();
                    if (!android.text.TextUtils.isEmpty(str3)) {
                        com.fyber.inneractive.sdk.network.z0.b(str3);
                    }
                }
            }
            oVar = new com.fyber.inneractive.sdk.flow.nativead.o(pVar, iVar, gVar);
            str = str2;
        }
        com.fyber.inneractive.sdk.flow.nativead.k kVar = ((com.fyber.inneractive.sdk.flow.nativead.j) pVar.f3722a).b;
        if (kVar != null) {
            kVar.a(str, z, gVar, oVar);
        }
        com.fyber.inneractive.sdk.flow.nativead.p pVar32 = this.d;
        com.fyber.inneractive.sdk.flow.nativead.i iVar42 = this.f3717a;
        pVar32.getClass();
        it = iVar42.c.iterator();
        while (it.hasNext()) {
        }
    }
}
