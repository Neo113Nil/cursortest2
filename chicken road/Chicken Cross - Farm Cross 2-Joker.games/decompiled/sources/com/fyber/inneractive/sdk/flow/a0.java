package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.util.IAlog;

/* loaded from: classes4.dex */
public final class a0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b0 f5326a;

    public a0(b0 b0Var) {
        this.f5326a = b0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b0 b0Var = this.f5326a;
        b0Var.getClass();
        IAlog.a("%sRe-enabling clicks, grace period has passed", IAlog.a(b0Var));
        b0 b0Var2 = this.f5326a;
        b0Var2.f = true;
        b0Var2.g = null;
    }
}
