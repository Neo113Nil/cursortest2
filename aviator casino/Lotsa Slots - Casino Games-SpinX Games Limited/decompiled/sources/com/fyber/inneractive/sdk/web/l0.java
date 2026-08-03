package com.fyber.inneractive.sdk.web;

/* loaded from: classes3.dex */
public final class l0 implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.web.m0 f4342a;

    public l0(com.fyber.inneractive.sdk.web.m0 m0Var) {
        this.f4342a = m0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.fyber.inneractive.sdk.web.v0 v0Var = this.f4342a.f4344a;
        if (v0Var.y) {
            return;
        }
        v0Var.e(v0Var.k);
    }
}
