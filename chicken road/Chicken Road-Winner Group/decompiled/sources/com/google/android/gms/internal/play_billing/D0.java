package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
public final class D0 extends AbstractC0210n0 implements Runnable, InterfaceC0198j0 {

    /* renamed from: h, reason: collision with root package name */
    public final Runnable f2616h;

    public D0(Runnable runnable) {
        runnable.getClass();
        this.f2616h = runnable;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0210n0
    public final String b() {
        return B0.c.k("task=[", this.f2616h.toString(), "]");
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f2616h.run();
        } catch (Throwable th) {
            d(th);
            throw th;
        }
    }
}
