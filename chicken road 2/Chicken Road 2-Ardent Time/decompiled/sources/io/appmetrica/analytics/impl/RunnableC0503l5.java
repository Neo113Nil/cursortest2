package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.l5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0503l5 implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.impl.InterfaceC0228ae f6329a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.impl.C0529m5 f6330b;

    public RunnableC0503l5(io.appmetrica.analytics.impl.C0529m5 c0529m5, io.appmetrica.analytics.impl.InterfaceC0228ae interfaceC0228ae) {
        this.f6330b = c0529m5;
        this.f6329a = interfaceC0228ae;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f6330b) {
            try {
                io.appmetrica.analytics.impl.C0529m5 c0529m5 = this.f6330b;
                java.lang.Object obj = c0529m5.f6389a;
                if (obj == null) {
                    c0529m5.f6390b.add(this.f6329a);
                } else {
                    this.f6329a.consume(obj);
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }
}
