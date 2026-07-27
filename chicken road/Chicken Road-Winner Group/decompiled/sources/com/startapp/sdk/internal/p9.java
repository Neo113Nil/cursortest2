package com.startapp.sdk.internal;

/* loaded from: classes.dex */
public final class p9 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d9 f4210a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g9 f4211b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t9 f4212c;

    public p9(t9 t9Var, d9 d9Var, g9 g9Var) {
        this.f4212c = t9Var;
        this.f4210a = d9Var;
        this.f4211b = g9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        t9 t9Var = this.f4212c;
        d9 d9Var = this.f4210a;
        g9 g9Var = this.f4211b;
        t9Var.getClass();
        try {
            t9Var.f4370a.a(d9Var, g9Var);
        } catch (Throwable unused) {
        }
    }
}
