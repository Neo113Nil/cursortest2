package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.util.v1;
import com.fyber.inneractive.sdk.util.w1;

/* loaded from: classes4.dex */
public final class o0 implements v1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p0 f5382a;

    public o0(p0 p0Var) {
        this.f5382a = p0Var;
    }

    @Override // com.fyber.inneractive.sdk.util.v1
    public final void a() {
        Runnable runnable = this.f5382a.n;
        if (runnable != null) {
            com.fyber.inneractive.sdk.util.r.b.post(runnable);
        }
        p0 p0Var = this.f5382a;
        w1 w1Var = p0Var.o;
        if (w1Var != null) {
            w1Var.e = null;
            p0Var.o = null;
        }
    }
}
