package com.fyber.inneractive.sdk.config;

/* loaded from: classes3.dex */
public final class b implements android.os.Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.config.e f3584a;

    public b(com.fyber.inneractive.sdk.config.e eVar) {
        this.f3584a = eVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message message) {
        if (message.what != 123) {
            return false;
        }
        com.fyber.inneractive.sdk.config.e eVar = this.f3584a;
        if (eVar.b.compareAndSet(false, true)) {
            if (eVar.b.get() && eVar.d != null) {
                com.fyber.inneractive.sdk.util.IAlog.a("startCounting", new java.lang.Object[0]);
                com.fyber.inneractive.sdk.util.v1 v1Var = eVar.d;
                v1Var.d = false;
                v1Var.c.sendEmptyMessage(1932593528);
            }
            com.fyber.inneractive.sdk.util.IAlog.a("Pause signal", new java.lang.Object[0]);
        }
        return true;
    }
}
