package com.digitalturbine.ignite.authenticator.decorator;

/* loaded from: classes2.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f3503a;
    public final /* synthetic */ com.digitalturbine.ignite.authenticator.decorator.e b;

    public c(com.digitalturbine.ignite.authenticator.decorator.e eVar, com.digitalturbine.ignite.authenticator.decorator.d dVar) {
        this.b = eVar;
        this.f3503a = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.digitalturbine.ignite.authenticator.entities.a a2;
        com.digitalturbine.ignite.authenticator.decorator.e eVar = this.b;
        if (eVar.a()) {
            try {
                a2 = com.digitalturbine.ignite.authenticator.parsers.a.a(new org.json.JSONObject(eVar.j.version()));
            } catch (java.lang.Exception e) {
                com.digitalturbine.ignite.authenticator.events.b.a(com.digitalturbine.ignite.authenticator.events.d.ONE_DT_GENERAL_ERROR, e);
                com.digitalturbine.ignite.authenticator.logger.a.b("%s: resolveIgniteServiceVersion : unable to resolve version : %s", "IgniteAuthenticationComponent", e.toString());
            }
            eVar.i = a2;
            com.digitalturbine.ignite.authenticator.utils.concurency.c.b.post(this.f3503a);
        }
        a2 = new com.digitalturbine.ignite.authenticator.entities.a(false, "");
        eVar.i = a2;
        com.digitalturbine.ignite.authenticator.utils.concurency.c.b.post(this.f3503a);
    }
}
