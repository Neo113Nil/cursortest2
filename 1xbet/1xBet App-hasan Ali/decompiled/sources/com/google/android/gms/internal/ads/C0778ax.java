package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.ax, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0778ax extends Ow {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f12733m = 0;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ RunnableFutureC0823bx f12734n;

    /* renamed from: o, reason: collision with root package name */
    public final Object f12735o;

    public C0778ax(RunnableFutureC0823bx runnableFutureC0823bx, InterfaceC1852yw interfaceC1852yw) {
        this.f12734n = runnableFutureC0823bx;
        this.f12735o = interfaceC1852yw;
    }

    @Override // com.google.android.gms.internal.ads.Ow
    public final Object a() {
        Object obj = this.f12735o;
        switch (this.f12733m) {
            case 0:
                InterfaceC1852yw interfaceC1852yw = (InterfaceC1852yw) obj;
                E3.a mo12a = interfaceC1852yw.mo12a();
                if (mo12a != null) {
                    return mo12a;
                }
                throw new NullPointerException(AbstractC0952et.F("AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", interfaceC1852yw));
            default:
                return ((Callable) obj).call();
        }
    }

    @Override // com.google.android.gms.internal.ads.Ow
    public final String b() {
        switch (this.f12733m) {
            case 0:
                return ((InterfaceC1852yw) this.f12735o).toString();
            default:
                return ((Callable) this.f12735o).toString();
        }
    }

    @Override // com.google.android.gms.internal.ads.Ow
    public final void d(Throwable th) {
        switch (this.f12733m) {
            case 0:
                this.f12734n.g(th);
                break;
            default:
                this.f12734n.g(th);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.Ow
    public final void e(Object obj) {
        switch (this.f12733m) {
            case 0:
                this.f12734n.l((E3.a) obj);
                break;
            default:
                this.f12734n.f(obj);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.Ow
    public final boolean f() {
        switch (this.f12733m) {
        }
        return this.f12734n.isDone();
    }

    public C0778ax(RunnableFutureC0823bx runnableFutureC0823bx, Callable callable) {
        this.f12734n = runnableFutureC0823bx;
        callable.getClass();
        this.f12735o = callable;
    }
}
