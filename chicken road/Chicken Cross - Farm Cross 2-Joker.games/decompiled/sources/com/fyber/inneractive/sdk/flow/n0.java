package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.util.v1;
import com.fyber.inneractive.sdk.util.w1;

/* loaded from: classes4.dex */
public final class n0 implements v1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p0 f5363a;

    public n0(p0 p0Var) {
        this.f5363a = p0Var;
    }

    @Override // com.fyber.inneractive.sdk.util.v1
    public final void a() {
        com.fyber.inneractive.sdk.util.r.b.post(this.f5363a.l);
        p0 p0Var = this.f5363a;
        w1 w1Var = p0Var.m;
        if (w1Var != null) {
            w1Var.e = null;
            p0Var.m = null;
        }
        p0Var.q = false;
    }
}
