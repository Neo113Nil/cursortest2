package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class Cw extends Ow {

    /* renamed from: m, reason: collision with root package name */
    public final Executor f8110m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Dw f8111n;

    /* renamed from: o, reason: collision with root package name */
    public final Callable f8112o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Dw f8113p;

    public Cw(Dw dw, Callable callable, Executor executor) {
        this.f8113p = dw;
        this.f8111n = dw;
        executor.getClass();
        this.f8110m = executor;
        this.f8112o = callable;
    }

    @Override // com.google.android.gms.internal.ads.Ow
    public final Object a() {
        return this.f8112o.call();
    }

    @Override // com.google.android.gms.internal.ads.Ow
    public final String b() {
        return this.f8112o.toString();
    }

    @Override // com.google.android.gms.internal.ads.Ow
    public final void d(Throwable th) {
        Dw dw = this.f8111n;
        dw.f8420z = null;
        if (th instanceof ExecutionException) {
            dw.g(((ExecutionException) th).getCause());
        } else if (th instanceof CancellationException) {
            dw.cancel(false);
        } else {
            dw.g(th);
        }
    }

    @Override // com.google.android.gms.internal.ads.Ow
    public final void e(Object obj) {
        this.f8111n.f8420z = null;
        this.f8113p.f(obj);
    }

    @Override // com.google.android.gms.internal.ads.Ow
    public final boolean f() {
        return this.f8111n.isDone();
    }
}
