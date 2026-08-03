package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class I5 implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f4439a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor f4440b = io.appmetrica.analytics.impl.C0560na.k().w().a();

    /* renamed from: c, reason: collision with root package name */
    public final io.appmetrica.analytics.coreutils.internal.services.WaitForActivationDelayBarrier f4441c = io.appmetrica.analytics.impl.C0560na.k().a();

    public I5(java.util.List list) {
        this.f4439a = list;
    }

    public static final void a(io.appmetrica.analytics.impl.I5 i5) {
        java.util.Iterator it = i5.f4439a.iterator();
        while (it.hasNext()) {
            ((java.lang.Runnable) it.next()).run();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4441c.subscribe(java.util.concurrent.TimeUnit.SECONDS.toMillis(10L), this.f4440b, new E0.a(7, this));
    }
}
