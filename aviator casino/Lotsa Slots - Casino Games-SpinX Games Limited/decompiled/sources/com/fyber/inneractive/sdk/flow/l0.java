package com.fyber.inneractive.sdk.flow;

/* loaded from: classes3.dex */
public final class l0 implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f3708a;
    public final /* synthetic */ com.fyber.inneractive.sdk.flow.p0 b;

    public l0(com.fyber.inneractive.sdk.flow.p0 p0Var, long j) {
        this.b = p0Var;
        this.f3708a = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b.I()) {
            com.fyber.inneractive.sdk.flow.p0 p0Var = this.b;
            p0Var.n = new com.fyber.inneractive.sdk.flow.k0(this);
            long a2 = p0Var.a(this.f3708a);
            com.fyber.inneractive.sdk.flow.p0 p0Var2 = this.b;
            p0Var2.getClass();
            com.fyber.inneractive.sdk.util.v1 v1Var = new com.fyber.inneractive.sdk.util.v1(java.util.concurrent.TimeUnit.MILLISECONDS, a2);
            p0Var2.o = v1Var;
            v1Var.e = new com.fyber.inneractive.sdk.flow.o0(p0Var2);
            v1Var.d = false;
            v1Var.c.sendEmptyMessage(1932593528);
            com.fyber.inneractive.sdk.flow.p0 p0Var3 = this.b;
            p0Var3.getClass();
            com.fyber.inneractive.sdk.util.IAlog.a("%sad contains custom close. Will show transparent x in %d", com.fyber.inneractive.sdk.util.IAlog.a(p0Var3), java.lang.Long.valueOf(a2));
            this.b.l = null;
        } else {
            com.fyber.inneractive.sdk.flow.p0 p0Var4 = this.b;
            p0Var4.getClass();
            com.fyber.inneractive.sdk.util.IAlog.a("%sad does not contain custom close. Showing close button", com.fyber.inneractive.sdk.util.IAlog.a(p0Var4));
            this.b.e(false);
        }
        java.lang.Runnable runnable = this.b.l;
        if (runnable != null) {
            com.fyber.inneractive.sdk.util.r.b.removeCallbacks(runnable);
            this.b.l = null;
        }
    }
}
