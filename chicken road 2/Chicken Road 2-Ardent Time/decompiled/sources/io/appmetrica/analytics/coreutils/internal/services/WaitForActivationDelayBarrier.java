package io.appmetrica.analytics.coreutils.internal.services;

/* loaded from: classes.dex */
public class WaitForActivationDelayBarrier implements io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrier {

    /* renamed from: a, reason: collision with root package name */
    private long f3776a;

    /* renamed from: b, reason: collision with root package name */
    private final io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider f3777b;

    public static class ActivationBarrierHelper {

        /* renamed from: a, reason: collision with root package name */
        private boolean f3778a = false;

        /* renamed from: b, reason: collision with root package name */
        private final io.appmetrica.analytics.coreutils.internal.services.a f3779b;

        /* renamed from: c, reason: collision with root package name */
        private final io.appmetrica.analytics.coreutils.internal.services.WaitForActivationDelayBarrier f3780c;

        public ActivationBarrierHelper(java.lang.Runnable runnable, io.appmetrica.analytics.coreutils.internal.services.WaitForActivationDelayBarrier waitForActivationDelayBarrier) {
            this.f3779b = new io.appmetrica.analytics.coreutils.internal.services.a(this, runnable);
            this.f3780c = waitForActivationDelayBarrier;
        }

        public void subscribeIfNeeded(long j2, io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor iCommonExecutor) {
            if (this.f3778a) {
                iCommonExecutor.execute(new io.appmetrica.analytics.coreutils.internal.services.b(this));
            } else {
                this.f3780c.subscribe(j2, iCommonExecutor, this.f3779b);
            }
        }
    }

    public WaitForActivationDelayBarrier() {
        this(new io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider());
    }

    public void activate() {
        this.f3776a = this.f3777b.currentTimeMillis();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrier
    public void subscribe(long j2, io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor iCommonExecutor, io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback activationBarrierCallback) {
        iCommonExecutor.executeDelayed(new io.appmetrica.analytics.coreutils.impl.m(activationBarrierCallback), java.lang.Math.max(j2 - (this.f3777b.currentTimeMillis() - this.f3776a), 0L));
    }

    public WaitForActivationDelayBarrier(io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider systemTimeProvider) {
        this.f3777b = systemTimeProvider;
    }
}
