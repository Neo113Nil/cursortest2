package io.appmetrica.analytics.coreutils.internal.services;

/* loaded from: classes.dex */
public class FirstExecutionConditionServiceImpl implements io.appmetrica.analytics.coreapi.internal.servicecomponents.FirstExecutionConditionService {

    /* renamed from: a, reason: collision with root package name */
    private final java.util.ArrayList f3758a = new java.util.ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private io.appmetrica.analytics.coreutils.internal.services.UtilityServiceConfiguration f3759b;

    /* renamed from: c, reason: collision with root package name */
    final io.appmetrica.analytics.coreutils.internal.services.UtilityServiceProvider f3760c;

    public static class FirstExecutionConditionChecker {

        /* renamed from: a, reason: collision with root package name */
        private boolean f3761a = false;

        /* renamed from: b, reason: collision with root package name */
        private long f3762b;

        /* renamed from: c, reason: collision with root package name */
        private long f3763c;

        /* renamed from: d, reason: collision with root package name */
        private long f3764d;

        /* renamed from: e, reason: collision with root package name */
        private final io.appmetrica.analytics.coreutils.internal.services.FirstExecutionConditionServiceImpl.FirstExecutionDelayChecker f3765e;
        public final java.lang.String tag;

        public FirstExecutionConditionChecker(io.appmetrica.analytics.coreutils.internal.services.UtilityServiceConfiguration utilityServiceConfiguration, io.appmetrica.analytics.coreutils.internal.services.FirstExecutionConditionServiceImpl.FirstExecutionDelayChecker firstExecutionDelayChecker, java.lang.String str) {
            this.f3765e = firstExecutionDelayChecker;
            this.f3763c = utilityServiceConfiguration == null ? 0L : utilityServiceConfiguration.getInitialConfigTime();
            this.f3762b = utilityServiceConfiguration != null ? utilityServiceConfiguration.getLastUpdateConfigTime() : 0L;
            this.f3764d = Long.MAX_VALUE;
            this.tag = str;
        }

        public final void a(long j2) {
            this.f3764d = java.util.concurrent.TimeUnit.SECONDS.toMillis(j2);
        }

        public final boolean b() {
            if (this.f3761a) {
                return true;
            }
            return this.f3765e.delaySinceFirstStartupWasPassed(this.f3763c, this.f3762b, this.f3764d);
        }

        public final void a() {
            this.f3761a = true;
        }

        public final void a(io.appmetrica.analytics.coreutils.internal.services.UtilityServiceConfiguration utilityServiceConfiguration) {
            this.f3763c = utilityServiceConfiguration.getInitialConfigTime();
            this.f3762b = utilityServiceConfiguration.getLastUpdateConfigTime();
        }
    }

    public static class FirstExecutionDelayChecker {
        public boolean delaySinceFirstStartupWasPassed(long j2, long j3, long j4) {
            return j3 - j2 >= j4;
        }
    }

    public static class FirstExecutionHandler implements io.appmetrica.analytics.coreapi.internal.servicecomponents.FirstExecutionDelayedTask {

        /* renamed from: a, reason: collision with root package name */
        private final io.appmetrica.analytics.coreutils.internal.services.FirstExecutionConditionServiceImpl.FirstExecutionConditionChecker f3766a;

        /* renamed from: b, reason: collision with root package name */
        private final io.appmetrica.analytics.coreutils.internal.services.WaitForActivationDelayBarrier.ActivationBarrierHelper f3767b;

        /* renamed from: c, reason: collision with root package name */
        private final io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor f3768c;

        public /* synthetic */ FirstExecutionHandler(io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor iCommonExecutor, io.appmetrica.analytics.coreutils.internal.services.WaitForActivationDelayBarrier.ActivationBarrierHelper activationBarrierHelper, io.appmetrica.analytics.coreutils.internal.services.FirstExecutionConditionServiceImpl.FirstExecutionConditionChecker firstExecutionConditionChecker, int i2) {
            this(iCommonExecutor, activationBarrierHelper, firstExecutionConditionChecker);
        }

        public boolean canExecute() {
            boolean b2 = this.f3766a.b();
            if (b2) {
                this.f3766a.a();
            }
            return b2;
        }

        @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.FirstExecutionDelayedTask
        public void setInitialDelaySeconds(long j2) {
            this.f3766a.a(j2);
        }

        @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.FirstExecutionDelayedTask
        public boolean tryExecute(long j2) {
            if (!this.f3766a.b()) {
                return false;
            }
            this.f3767b.subscribeIfNeeded(java.util.concurrent.TimeUnit.SECONDS.toMillis(j2), this.f3768c);
            this.f3766a.a();
            return true;
        }

        public void updateConfig(io.appmetrica.analytics.coreutils.internal.services.UtilityServiceConfiguration utilityServiceConfiguration) {
            this.f3766a.a(utilityServiceConfiguration);
        }

        private FirstExecutionHandler(io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor iCommonExecutor, io.appmetrica.analytics.coreutils.internal.services.WaitForActivationDelayBarrier.ActivationBarrierHelper activationBarrierHelper, io.appmetrica.analytics.coreutils.internal.services.FirstExecutionConditionServiceImpl.FirstExecutionConditionChecker firstExecutionConditionChecker) {
            this.f3767b = activationBarrierHelper;
            this.f3766a = firstExecutionConditionChecker;
            this.f3768c = iCommonExecutor;
        }
    }

    public FirstExecutionConditionServiceImpl(io.appmetrica.analytics.coreutils.internal.services.UtilityServiceProvider utilityServiceProvider) {
        this.f3760c = utilityServiceProvider;
    }

    public final synchronized io.appmetrica.analytics.coreutils.internal.services.FirstExecutionConditionServiceImpl.FirstExecutionHandler a(io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor iCommonExecutor, io.appmetrica.analytics.coreutils.internal.services.WaitForActivationDelayBarrier.ActivationBarrierHelper activationBarrierHelper, io.appmetrica.analytics.coreutils.internal.services.FirstExecutionConditionServiceImpl.FirstExecutionConditionChecker firstExecutionConditionChecker) {
        io.appmetrica.analytics.coreutils.internal.services.FirstExecutionConditionServiceImpl.FirstExecutionHandler firstExecutionHandler;
        firstExecutionHandler = new io.appmetrica.analytics.coreutils.internal.services.FirstExecutionConditionServiceImpl.FirstExecutionHandler(iCommonExecutor, activationBarrierHelper, firstExecutionConditionChecker, 0);
        this.f3758a.add(firstExecutionHandler);
        return firstExecutionHandler;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.FirstExecutionConditionService
    public synchronized io.appmetrica.analytics.coreapi.internal.servicecomponents.FirstExecutionDelayedTask createDelayedTask(java.lang.String str, io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor iCommonExecutor, java.lang.Runnable runnable) {
        return a(iCommonExecutor, new io.appmetrica.analytics.coreutils.internal.services.WaitForActivationDelayBarrier.ActivationBarrierHelper(runnable, this.f3760c.getActivationBarrier()), new io.appmetrica.analytics.coreutils.internal.services.FirstExecutionConditionServiceImpl.FirstExecutionConditionChecker(this.f3759b, new io.appmetrica.analytics.coreutils.internal.services.FirstExecutionConditionServiceImpl.FirstExecutionDelayChecker(), str));
    }

    public void updateConfig(io.appmetrica.analytics.coreutils.internal.services.UtilityServiceConfiguration utilityServiceConfiguration) {
        java.util.ArrayList arrayList;
        synchronized (this) {
            this.f3759b = utilityServiceConfiguration;
            arrayList = new java.util.ArrayList(this.f3758a);
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((io.appmetrica.analytics.coreutils.internal.services.FirstExecutionConditionServiceImpl.FirstExecutionHandler) it.next()).updateConfig(utilityServiceConfiguration);
        }
    }
}
