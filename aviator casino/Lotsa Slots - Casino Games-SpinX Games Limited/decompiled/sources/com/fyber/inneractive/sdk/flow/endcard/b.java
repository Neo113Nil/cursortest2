package com.fyber.inneractive.sdk.flow.endcard;

/* loaded from: classes3.dex */
public abstract class b implements com.fyber.inneractive.sdk.flow.endcard.n {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f3683a = com.fyber.inneractive.sdk.util.IAlog.a(this);
    public org.json.JSONArray b = null;
    public final com.fyber.inneractive.sdk.flow.x0 c;
    public com.fyber.inneractive.sdk.flow.endcard.n d;
    public int e;
    public int f;

    public b(int i, com.fyber.inneractive.sdk.flow.x0 x0Var) {
        this.c = x0Var;
        this.f = i;
    }

    public abstract void a(android.view.ViewGroup viewGroup, com.fyber.inneractive.sdk.player.ui.b bVar);

    public void a(org.json.JSONArray jSONArray) {
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.n
    public final android.view.View b() {
        return f().b();
    }

    public abstract com.fyber.inneractive.sdk.flow.endcard.n c();

    public com.fyber.inneractive.sdk.player.ui.c d() {
        com.fyber.inneractive.sdk.config.global.features.v vVar = this.c.g;
        com.fyber.inneractive.sdk.player.ui.c cVar = new com.fyber.inneractive.sdk.player.ui.c();
        cVar.f4161a = l();
        cVar.f = i();
        boolean b = b(vVar);
        java.lang.Integer valueOf = java.lang.Integer.valueOf(a(vVar));
        if (b) {
            cVar.d = valueOf;
        }
        return cVar;
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.n
    public void destroy() {
        e();
        com.fyber.inneractive.sdk.flow.endcard.n nVar = this.d;
        if (nVar != null) {
            nVar.destroy();
            this.d = null;
        }
    }

    public void e() {
        a();
    }

    public final com.fyber.inneractive.sdk.flow.endcard.n f() {
        if (this.d == null) {
            this.d = c();
        }
        return this.d;
    }

    public abstract com.fyber.inneractive.sdk.util.g g();

    public abstract com.fyber.inneractive.sdk.flow.endcard.l h();

    public abstract com.fyber.inneractive.sdk.model.vast.i i();

    public boolean j() {
        return false;
    }

    public boolean k() {
        return false;
    }

    public abstract boolean l();

    public void m() {
        com.fyber.inneractive.sdk.util.IAlog.a("%s loading success for %s", i(), this.f3683a);
    }

    public static boolean b(com.fyber.inneractive.sdk.config.global.features.v vVar) {
        java.lang.Boolean c;
        return (vVar == null || (c = vVar.c("shouldEnableEndCardAutoClick")) == null || !c.booleanValue()) ? false : true;
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.n
    public final void a() {
        com.fyber.inneractive.sdk.flow.endcard.n nVar = this.d;
        if (nVar != null) {
            nVar.a();
        }
    }

    public void a(com.fyber.inneractive.sdk.external.InneractiveInfrastructureError inneractiveInfrastructureError) {
        com.fyber.inneractive.sdk.util.IAlog.a("%s loading failed for %s", inneractiveInfrastructureError.getCause(), i(), this.f3683a);
    }

    public static int a(com.fyber.inneractive.sdk.config.global.features.v vVar) {
        if (vVar == null) {
            return 3;
        }
        java.lang.Integer a2 = vVar.a("autoClickDelay");
        int intValue = a2 != null ? a2.intValue() : 3;
        if (intValue < 0 || intValue > 10) {
            return 3;
        }
        return intValue;
    }
}
