package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.s5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0970s5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0695he f9234a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0996t5 f9235b;

    public RunnableC0970s5(C0996t5 c0996t5, InterfaceC0695he interfaceC0695he) {
        this.f9235b = c0996t5;
        this.f9234a = interfaceC0695he;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f9235b) {
            try {
                C0996t5 c0996t5 = this.f9235b;
                Object obj = c0996t5.f9277a;
                if (obj == null) {
                    c0996t5.f9278b.add(this.f9234a);
                } else {
                    this.f9234a.consume(obj);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
