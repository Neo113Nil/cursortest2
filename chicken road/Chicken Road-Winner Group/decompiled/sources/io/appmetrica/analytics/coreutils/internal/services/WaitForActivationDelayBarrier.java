package io.appmetrica.analytics.coreutils.internal.services;

import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrier;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback;
import io.appmetrica.analytics.coreutils.impl.m;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;

/* loaded from: classes.dex */
public class WaitForActivationDelayBarrier implements ActivationBarrier {

    /* renamed from: a, reason: collision with root package name */
    private long f5459a;

    /* renamed from: b, reason: collision with root package name */
    private final SystemTimeProvider f5460b;

    public static class ActivationBarrierHelper {

        /* renamed from: a, reason: collision with root package name */
        private boolean f5461a = false;

        /* renamed from: b, reason: collision with root package name */
        private final a f5462b;

        /* renamed from: c, reason: collision with root package name */
        private final WaitForActivationDelayBarrier f5463c;

        public ActivationBarrierHelper(Runnable runnable, WaitForActivationDelayBarrier waitForActivationDelayBarrier) {
            this.f5462b = new a(this, runnable);
            this.f5463c = waitForActivationDelayBarrier;
        }

        public void subscribeIfNeeded(long j3, ICommonExecutor iCommonExecutor) {
            if (this.f5461a) {
                iCommonExecutor.execute(new b(this));
            } else {
                this.f5463c.subscribe(j3, iCommonExecutor, this.f5462b);
            }
        }
    }

    public WaitForActivationDelayBarrier() {
        this(new SystemTimeProvider());
    }

    public void activate() {
        this.f5459a = this.f5460b.currentTimeMillis();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrier
    public void subscribe(long j3, ICommonExecutor iCommonExecutor, ActivationBarrierCallback activationBarrierCallback) {
        iCommonExecutor.executeDelayed(new m(activationBarrierCallback), Math.max(j3 - (this.f5460b.currentTimeMillis() - this.f5459a), 0L));
    }

    public WaitForActivationDelayBarrier(SystemTimeProvider systemTimeProvider) {
        this.f5460b = systemTimeProvider;
    }
}
