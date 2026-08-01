package com.fyber.inneractive.sdk.renderers;

import com.fyber.inneractive.sdk.flow.w0;
import com.fyber.inneractive.sdk.util.IAlog;

/* loaded from: classes4.dex */
public final class b0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c0 f5891a;

    public b0(c0 c0Var) {
        this.f5891a = c0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        c0 c0Var = this.f5891a;
        if (c0Var.b != null && !c0Var.m) {
            c0Var.m = true;
            IAlog.a("%sTracking impression", IAlog.a(c0Var));
            com.fyber.inneractive.sdk.flow.nativead.trackers.a aVar = new com.fyber.inneractive.sdk.flow.nativead.trackers.a((w0) c0Var.b);
            c0Var.n = aVar;
            aVar.a(c0Var);
        }
        c0Var.E();
    }
}
