package com.startapp.sdk.internal;

/* loaded from: classes.dex */
public final class q9 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d9 f4257a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g9 f4258b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t9 f4259c;

    public q9(t9 t9Var, d9 d9Var, g9 g9Var) {
        this.f4259c = t9Var;
        this.f4257a = d9Var;
        this.f4258b = g9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        t9 t9Var = this.f4259c;
        Runnable runnable = (Runnable) t9Var.f.a(this.f4257a, this.f4258b, null);
        if (runnable != null) {
            t9Var.f4372c.execute(runnable);
        }
    }
}
