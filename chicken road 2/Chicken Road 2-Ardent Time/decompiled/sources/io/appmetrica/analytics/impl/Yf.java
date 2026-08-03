package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Yf implements io.appmetrica.analytics.impl.Wf {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.impl.C0333eg f5344a;

    public Yf(io.appmetrica.analytics.impl.C0333eg c0333eg) {
        this.f5344a = c0333eg;
    }

    @Override // io.appmetrica.analytics.impl.Wf
    public final void a() {
        io.appmetrica.analytics.impl.C0333eg c0333eg = this.f5344a;
        io.appmetrica.analytics.impl.C0871za c0871za = c0333eg.f5846b;
        io.appmetrica.analytics.impl.Xf xf = new io.appmetrica.analytics.impl.Xf(c0333eg);
        c0871za.getClass();
        try {
            java.util.concurrent.FutureTask futureTask = new java.util.concurrent.FutureTask(new io.appmetrica.analytics.impl.CallableC0845ya(c0871za));
            io.appmetrica.analytics.impl.C0560na.f6484I.f6495d.f6308a.getClass();
            new io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread(futureTask, "IAA-SHMSR-" + io.appmetrica.analytics.impl.ThreadFactoryC0874zd.f7184a.incrementAndGet()).start();
            io.appmetrica.analytics.impl.C0566ng c0566ng = (io.appmetrica.analytics.impl.C0566ng) futureTask.get(5L, java.util.concurrent.TimeUnit.SECONDS);
            io.appmetrica.analytics.impl.AbstractC0522lo.a(c0871za.f7183b);
            io.appmetrica.analytics.impl.C0333eg.a(c0333eg, c0566ng, io.appmetrica.analytics.impl.C0333eg.a(c0333eg));
        } catch (java.lang.Throwable th) {
            try {
                xf.a(th);
            } finally {
                io.appmetrica.analytics.impl.AbstractC0522lo.a(c0871za.f7183b);
            }
        }
    }
}
