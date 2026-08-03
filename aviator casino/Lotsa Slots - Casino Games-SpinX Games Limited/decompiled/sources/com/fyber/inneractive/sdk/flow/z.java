package com.fyber.inneractive.sdk.flow;

/* loaded from: classes3.dex */
public final class z implements com.fyber.inneractive.sdk.click.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.util.g1 f3768a;
    public final /* synthetic */ com.fyber.inneractive.sdk.util.g b;
    public final /* synthetic */ com.fyber.inneractive.sdk.click.o c;
    public final /* synthetic */ com.fyber.inneractive.sdk.flow.b0 d;

    public z(com.fyber.inneractive.sdk.flow.b0 b0Var, com.fyber.inneractive.sdk.util.g1 g1Var, com.fyber.inneractive.sdk.util.g gVar, com.fyber.inneractive.sdk.click.o oVar) {
        this.d = b0Var;
        this.f3768a = g1Var;
        this.b = gVar;
        this.c = oVar;
    }

    @Override // com.fyber.inneractive.sdk.click.o
    public final void a(com.fyber.inneractive.sdk.click.b bVar) {
        com.fyber.inneractive.sdk.flow.b0 b0Var = this.d;
        b0Var.getClass();
        com.fyber.inneractive.sdk.util.IAlog.a("%s super click result: %s", com.fyber.inneractive.sdk.util.IAlog.a(b0Var), bVar);
        com.fyber.inneractive.sdk.flow.b0 b0Var2 = this.d;
        if (b0Var2.h == null) {
            com.fyber.inneractive.sdk.util.IAlog.a("%s click handler is null. Probably cancelled", com.fyber.inneractive.sdk.util.IAlog.a(b0Var2));
            return;
        }
        b0Var2.h = null;
        b0Var2.i = null;
        b0Var2.G();
        com.fyber.inneractive.sdk.flow.b0 b0Var3 = this.d;
        com.fyber.inneractive.sdk.util.g1 g1Var = this.f3768a;
        com.fyber.inneractive.sdk.util.g gVar = this.b;
        b0Var3.getClass();
        com.fyber.inneractive.sdk.click.q qVar = bVar.f3570a;
        if (qVar == com.fyber.inneractive.sdk.click.q.OPEN_IN_EXTERNAL_APPLICATION || qVar == com.fyber.inneractive.sdk.click.q.OPEN_GOOGLE_STORE) {
            com.fyber.inneractive.sdk.util.IAlog.a("InneractiveAdRendererImpl: handleOpenResult - opened in external application", new java.lang.Object[0]);
            java.util.ArrayList arrayList = bVar.f;
            com.fyber.inneractive.sdk.click.j jVar = (com.fyber.inneractive.sdk.click.j) arrayList.get(arrayList.size() - 1);
            com.fyber.inneractive.sdk.click.q qVar2 = jVar.c;
            if (qVar2 == com.fyber.inneractive.sdk.click.q.OPENED_IN_EXTERNAL_BROWSER) {
                b0Var3.a(jVar.f3577a, qVar2);
            }
            if (b0Var3.c != null) {
                b0Var3.F();
            }
        } else if (qVar == com.fyber.inneractive.sdk.click.q.OPENED_IN_INTERNAL_BROWSER) {
            com.fyber.inneractive.sdk.util.IAlog.a("InneractiveAdRendererImpl: handleOpenResult - opened in internal browser", new java.lang.Object[0]);
            b0Var3.d = true;
            com.fyber.inneractive.sdk.activities.InneractiveInternalBrowserActivity.setInternalBrowserListener(b0Var3);
        } else if (qVar == com.fyber.inneractive.sdk.click.q.OPENED_USING_CHROME_NAVIGATE || qVar == com.fyber.inneractive.sdk.click.q.OPENED_IN_EXTERNAL_BROWSER) {
            com.fyber.inneractive.sdk.util.IAlog.a("InneractiveAdRendererImpl: handleOpenResult - opened in external browser", new java.lang.Object[0]);
            b0Var3.a(bVar.d, bVar.f3570a);
            if (b0Var3.c != null) {
                b0Var3.F();
            }
        }
        if (b0Var3.o() == com.fyber.inneractive.sdk.ignite.m.NONE || (!android.text.TextUtils.isEmpty(bVar.c) && !bVar.c.equals("IgniteGooglePlay"))) {
            b0Var3.b(bVar, g1Var, gVar);
        }
        com.fyber.inneractive.sdk.click.o oVar = this.c;
        if (oVar != null) {
            oVar.a(bVar);
        }
    }
}
