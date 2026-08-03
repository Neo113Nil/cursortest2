package com.fyber.inneractive.sdk.web;

/* loaded from: classes3.dex */
public final class r implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.web.i0 f4352a;

    public r(com.fyber.inneractive.sdk.web.i0 i0Var) {
        this.f4352a = i0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.fyber.inneractive.sdk.web.i0 i0Var = this.f4352a;
        if (i0Var.V == null) {
            try {
                i0Var.getClass();
                com.fyber.inneractive.sdk.util.IAlog.a("%sregistering orientation broadcast receiver", com.fyber.inneractive.sdk.util.IAlog.a(i0Var));
                this.f4352a.V = new com.fyber.inneractive.sdk.web.e0(this.f4352a);
                if (com.fyber.inneractive.sdk.util.o.a(this.f4352a.b) != null) {
                    com.fyber.inneractive.sdk.web.i0 i0Var2 = this.f4352a;
                    com.fyber.inneractive.sdk.web.e0 e0Var = i0Var2.V;
                    android.content.Context a2 = com.fyber.inneractive.sdk.util.o.a(i0Var2.b);
                    com.fyber.inneractive.sdk.web.i0 i0Var3 = e0Var.c;
                    i0Var3.getClass();
                    com.fyber.inneractive.sdk.util.IAlog.a("%sregister screen broadcast receiver", com.fyber.inneractive.sdk.util.IAlog.a(i0Var3));
                    e0Var.f4332a = a2;
                    a2.registerReceiver(e0Var, new android.content.IntentFilter("android.intent.action.CONFIGURATION_CHANGED"));
                }
            } catch (java.lang.Exception e) {
                com.fyber.inneractive.sdk.web.i0 i0Var4 = this.f4352a;
                i0Var4.getClass();
                com.fyber.inneractive.sdk.util.IAlog.f("%sfailed registering orientation broadcast recevier", com.fyber.inneractive.sdk.util.IAlog.a(i0Var4));
                if (com.fyber.inneractive.sdk.util.IAlog.f4283a >= 3) {
                    e.printStackTrace();
                }
            }
        }
    }
}
