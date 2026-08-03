package com.fyber.inneractive.sdk.config;

/* loaded from: classes3.dex */
public final class e implements com.fyber.inneractive.sdk.config.r {
    public com.fyber.inneractive.sdk.util.v1 d;
    public final com.fyber.inneractive.sdk.config.x0 e;
    public final com.fyber.inneractive.sdk.config.d g;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Set f3594a = java.util.Collections.newSetFromMap(new java.util.concurrent.ConcurrentHashMap());
    public final java.util.concurrent.atomic.AtomicBoolean b = new java.util.concurrent.atomic.AtomicBoolean(false);
    public boolean c = false;
    public final android.os.Handler f = new android.os.Handler(android.os.Looper.getMainLooper(), new com.fyber.inneractive.sdk.config.b(this));

    public e(com.fyber.inneractive.sdk.config.x0 x0Var) {
        com.fyber.inneractive.sdk.config.c cVar = new com.fyber.inneractive.sdk.config.c(this);
        this.g = new com.fyber.inneractive.sdk.config.d(this);
        this.e = x0Var;
        android.app.Application application = com.fyber.inneractive.sdk.util.o.f4302a;
        if (application != null) {
            application.registerActivityLifecycleCallbacks(cVar);
        }
    }

    public final void a() {
        com.fyber.inneractive.sdk.config.s sVar = com.fyber.inneractive.sdk.config.IAConfigManager.N.t;
        if (!sVar.d) {
            sVar.c.add(this);
        }
        com.fyber.inneractive.sdk.util.v1 v1Var = new com.fyber.inneractive.sdk.util.v1(java.util.concurrent.TimeUnit.MINUTES, r0.t.b.a("session_duration", 30, 1));
        this.d = v1Var;
        v1Var.e = this.g;
    }

    @Override // com.fyber.inneractive.sdk.config.r
    public final void onGlobalConfigChanged(com.fyber.inneractive.sdk.config.s sVar, com.fyber.inneractive.sdk.config.o oVar) {
        com.fyber.inneractive.sdk.util.v1 v1Var = this.d;
        if (v1Var != null) {
            v1Var.d = false;
            v1Var.f = 0L;
            com.fyber.inneractive.sdk.util.t1 t1Var = v1Var.c;
            if (t1Var != null) {
                t1Var.removeMessages(1932593528);
            }
            java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MINUTES;
            long a2 = oVar.a("session_duration", 30, 1);
            long j = this.d.f;
            com.fyber.inneractive.sdk.util.v1 v1Var2 = new com.fyber.inneractive.sdk.util.v1(timeUnit, a2);
            v1Var2.f = j;
            com.fyber.inneractive.sdk.util.IAlog.a("Visible time counter init - time %d", java.lang.Long.valueOf(a2));
            this.d = v1Var2;
            v1Var2.e = this.g;
        }
        sVar.c.remove(this);
    }
}
