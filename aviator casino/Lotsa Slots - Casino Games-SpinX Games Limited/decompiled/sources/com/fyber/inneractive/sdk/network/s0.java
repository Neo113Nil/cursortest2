package com.fyber.inneractive.sdk.network;

/* loaded from: classes3.dex */
public final class s0 implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f3856a;
    public final /* synthetic */ java.lang.Exception b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ com.fyber.inneractive.sdk.network.t0 d;

    public s0(com.fyber.inneractive.sdk.network.t0 t0Var, java.lang.Object obj, java.lang.Exception exc, boolean z) {
        this.d = t0Var;
        this.f3856a = obj;
        this.b = exc;
        this.c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.b.a(this.f3856a, this.b, this.c);
    }
}
