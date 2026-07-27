package io.appmetrica.analytics.coreutils.internal.services;

import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrier;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback;
import io.appmetrica.analytics.coreutils.impl.m;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;

/* loaded from: classes.dex */
public class WaitForActivationDelayBarrier implements ActivationBarrier {

    /* renamed from: a, reason: collision with root package name */
    private long f6279a;

    /* renamed from: b, reason: collision with root package name */
    private final SystemTimeProvider f6280b;

    public static class ActivationBarrierHelper {

        /* renamed from: a, reason: collision with root package name */
        private boolean f6281a = false;

        /* renamed from: b, reason: collision with root package name */
        private final a f6282b;

        /* renamed from: c, reason: collision with root package name */
        private final WaitForActivationDelayBarrier f6283c;

        public ActivationBarrierHelper(Runnable runnable, WaitForActivationDelayBarrier waitForActivationDelayBarrier) {
            this.f6282b = new a(this, runnable);
            this.f6283c = waitForActivationDelayBarrier;
        }

        public void subscribeIfNeeded(long j2, ICommonExecutor iCommonExecutor) {
            if (this.f6281a) {
                iCommonExecutor.execute(new b(this));
            } else {
                this.f6283c.subscribe(j2, iCommonExecutor, this.f6282b);
            }
        }
    }

    public WaitForActivationDelayBarrier() {
        this(new SystemTimeProvider());
    }

    public void activate() {
        this.f6279a = this.f6280b.currentTimeMillis();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrier
    public void subscribe(long j2, ICommonExecutor iCommonExecutor, ActivationBarrierCallback activationBarrierCallback) {
        iCommonExecutor.executeDelayed(new m(activationBarrierCallback), Math.max(j2 - (this.f6280b.currentTimeMillis() - this.f6279a), 0L));
    }

    public WaitForActivationDelayBarrier(SystemTimeProvider systemTimeProvider) {
        this.f6280b = systemTimeProvider;
    }
}
