package com.fyber.inneractive.sdk.web;

/* loaded from: classes3.dex */
public final class g1 implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.web.i1 f4336a;

    public g1(com.fyber.inneractive.sdk.web.i1 i1Var) {
        this.f4336a = i1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.fyber.inneractive.sdk.measurement.tracker.e eVar;
        com.fyber.inneractive.sdk.web.i1 i1Var = this.f4336a;
        if (i1Var.H == null || (eVar = i1Var.I) == null) {
            return;
        }
        eVar.c();
    }
}
