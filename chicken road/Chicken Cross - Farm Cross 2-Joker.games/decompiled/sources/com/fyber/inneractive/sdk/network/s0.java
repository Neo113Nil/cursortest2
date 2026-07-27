package com.fyber.inneractive.sdk.network;

/* loaded from: classes4.dex */
public final class s0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f5510a;
    public final /* synthetic */ Exception b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ t0 d;

    public s0(t0 t0Var, Object obj, Exception exc, boolean z) {
        this.d = t0Var;
        this.f5510a = obj;
        this.b = exc;
        this.c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.b.a(this.f5510a, this.b, this.c);
    }
}
