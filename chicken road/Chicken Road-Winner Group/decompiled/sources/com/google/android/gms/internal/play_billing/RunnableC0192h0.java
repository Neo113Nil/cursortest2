package com.google.android.gms.internal.play_billing;

/* renamed from: com.google.android.gms.internal.play_billing.h0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0192h0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0210n0 f2758a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceFutureC0242y0 f2759b;

    public RunnableC0192h0(AbstractC0210n0 abstractC0210n0, InterfaceFutureC0242y0 interfaceFutureC0242y0) {
        this.f2758a = abstractC0210n0;
        this.f2759b = interfaceFutureC0242y0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f2758a.f2782a != this) {
            return;
        }
        InterfaceFutureC0242y0 interfaceFutureC0242y0 = this.f2759b;
        if (AbstractC0210n0.f.D(this.f2758a, this, AbstractC0210n0.e(interfaceFutureC0242y0))) {
            AbstractC0210n0.h(this.f2758a);
        }
    }
}
