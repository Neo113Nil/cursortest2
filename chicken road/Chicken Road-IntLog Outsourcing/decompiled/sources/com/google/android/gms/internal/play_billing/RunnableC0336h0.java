package com.google.android.gms.internal.play_billing;

/* renamed from: com.google.android.gms.internal.play_billing.h0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0336h0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0354n0 f5190a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceFutureC0386y0 f5191b;

    public RunnableC0336h0(AbstractC0354n0 abstractC0354n0, InterfaceFutureC0386y0 interfaceFutureC0386y0) {
        this.f5190a = abstractC0354n0;
        this.f5191b = interfaceFutureC0386y0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f5190a.f5216a != this) {
            return;
        }
        InterfaceFutureC0386y0 interfaceFutureC0386y0 = this.f5191b;
        if (AbstractC0354n0.f5214f.L(this.f5190a, this, AbstractC0354n0.f(interfaceFutureC0386y0))) {
            AbstractC0354n0.i(this.f5190a);
        }
    }
}
