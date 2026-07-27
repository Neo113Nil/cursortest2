package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.s5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0821s5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0546he f8287a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0847t5 f8288b;

    public RunnableC0821s5(C0847t5 c0847t5, InterfaceC0546he interfaceC0546he) {
        this.f8288b = c0847t5;
        this.f8287a = interfaceC0546he;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f8288b) {
            try {
                C0847t5 c0847t5 = this.f8288b;
                Object obj = c0847t5.f8329a;
                if (obj == null) {
                    c0847t5.f8330b.add(this.f8287a);
                } else {
                    this.f8287a.consume(obj);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
