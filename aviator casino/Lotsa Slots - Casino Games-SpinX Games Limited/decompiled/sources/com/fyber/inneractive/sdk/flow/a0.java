package com.fyber.inneractive.sdk.flow;

/* loaded from: classes3.dex */
public final class a0 implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.flow.b0 f3673a;

    public a0(com.fyber.inneractive.sdk.flow.b0 b0Var) {
        this.f3673a = b0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.fyber.inneractive.sdk.flow.b0 b0Var = this.f3673a;
        b0Var.getClass();
        com.fyber.inneractive.sdk.util.IAlog.a("%sRe-enabling clicks, grace period has passed", com.fyber.inneractive.sdk.util.IAlog.a(b0Var));
        com.fyber.inneractive.sdk.flow.b0 b0Var2 = this.f3673a;
        b0Var2.f = true;
        b0Var2.g = null;
    }
}
