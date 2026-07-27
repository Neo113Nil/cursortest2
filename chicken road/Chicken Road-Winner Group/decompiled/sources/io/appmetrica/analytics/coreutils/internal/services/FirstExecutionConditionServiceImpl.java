package io.appmetrica.analytics.coreutils.internal.services;

import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.FirstExecutionConditionService;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.FirstExecutionDelayedTask;
import io.appmetrica.analytics.coreutils.internal.services.WaitForActivationDelayBarrier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class FirstExecutionConditionServiceImpl implements FirstExecutionConditionService {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f5441a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private UtilityServiceConfiguration f5442b;

    /* renamed from: c, reason: collision with root package name */
    final UtilityServiceProvider f5443c;

    public static class FirstExecutionConditionChecker {

        /* renamed from: a, reason: collision with root package name */
        private boolean f5444a = false;

        /* renamed from: b, reason: collision with root package name */
        private long f5445b;

        /* renamed from: c, reason: collision with root package name */
        private long f5446c;

        /* renamed from: d, reason: collision with root package name */
        private long f5447d;

        /* renamed from: e, reason: collision with root package name */
        private final FirstExecutionDelayChecker f5448e;
        public final String tag;

        public FirstExecutionConditionChecker(UtilityServiceConfiguration utilityServiceConfiguration, FirstExecutionDelayChecker firstExecutionDelayChecker, String str) {
            this.f5448e = firstExecutionDelayChecker;
            this.f5446c = utilityServiceConfiguration == null ? 0L : utilityServiceConfiguration.getInitialConfigTime();
            this.f5445b = utilityServiceConfiguration != null ? utilityServiceConfiguration.getLastUpdateConfigTime() : 0L;
            this.f5447d = Long.MAX_VALUE;
            this.tag = str;
        }

        public final void a(long j3) {
            this.f5447d = TimeUnit.SECONDS.toMillis(j3);
        }

        public final boolean b() {
            if (this.f5444a) {
                return true;
            }
            return this.f5448e.delaySinceFirstStartupWasPassed(this.f5446c, this.f5445b, this.f5447d);
        }

        public final void a() {
            this.f5444a = true;
        }

        public final void a(UtilityServiceConfiguration utilityServiceConfiguration) {
            this.f5446c = utilityServiceConfiguration.getInitialConfigTime();
            this.f5445b = utilityServiceConfiguration.getLastUpdateConfigTime();
        }
    }

    public static class FirstExecutionDelayChecker {
        public boolean delaySinceFirstStartupWasPassed(long j3, long j4, long j5) {
            return j4 - j3 >= j5;
        }
    }

    public static class FirstExecutionHandler implements FirstExecutionDelayedTask {

        /* renamed from: a, reason: collision with root package name */
        private final FirstExecutionConditionChecker f5449a;

        /* renamed from: b, reason: collision with root package name */
        private final WaitForActivationDelayBarrier.ActivationBarrierHelper f5450b;

        /* renamed from: c, reason: collision with root package name */
        private final ICommonExecutor f5451c;

        public /* synthetic */ FirstExecutionHandler(ICommonExecutor iCommonExecutor, WaitForActivationDelayBarrier.ActivationBarrierHelper activationBarrierHelper, FirstExecutionConditionChecker firstExecutionConditionChecker, int i3) {
            this(iCommonExecutor, activationBarrierHelper, firstExecutionConditionChecker);
        }

        public boolean canExecute() {
            boolean b3 = this.f5449a.b();
            if (b3) {
                this.f5449a.a();
            }
            return b3;
        }

        @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.FirstExecutionDelayedTask
        public void setInitialDelaySeconds(long j3) {
            this.f5449a.a(j3);
        }

        @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.FirstExecutionDelayedTask
        public boolean tryExecute(long j3) {
            if (!this.f5449a.b()) {
                return false;
            }
            this.f5450b.subscribeIfNeeded(TimeUnit.SECONDS.toMillis(j3), this.f5451c);
            this.f5449a.a();
            return true;
        }

        public void updateConfig(UtilityServiceConfiguration utilityServiceConfiguration) {
            this.f5449a.a(utilityServiceConfiguration);
        }

        private FirstExecutionHandler(ICommonExecutor iCommonExecutor, WaitForActivationDelayBarrier.ActivationBarrierHelper activationBarrierHelper, FirstExecutionConditionChecker firstExecutionConditionChecker) {
            this.f5450b = activationBarrierHelper;
            this.f5449a = firstExecutionConditionChecker;
            this.f5451c = iCommonExecutor;
        }
    }

    public FirstExecutionConditionServiceImpl(UtilityServiceProvider utilityServiceProvider) {
        this.f5443c = utilityServiceProvider;
    }

    public final synchronized FirstExecutionHandler a(ICommonExecutor iCommonExecutor, WaitForActivationDelayBarrier.ActivationBarrierHelper activationBarrierHelper, FirstExecutionConditionChecker firstExecutionConditionChecker) {
        FirstExecutionHandler firstExecutionHandler;
        firstExecutionHandler = new FirstExecutionHandler(iCommonExecutor, activationBarrierHelper, firstExecutionConditionChecker, 0);
        this.f5441a.add(firstExecutionHandler);
        return firstExecutionHandler;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.FirstExecutionConditionService
    public synchronized FirstExecutionDelayedTask createDelayedTask(String str, ICommonExecutor iCommonExecutor, Runnable runnable) {
        return a(iCommonExecutor, new WaitForActivationDelayBarrier.ActivationBarrierHelper(runnable, this.f5443c.getActivationBarrier()), new FirstExecutionConditionChecker(this.f5442b, new FirstExecutionDelayChecker(), str));
    }

    public void updateConfig(UtilityServiceConfiguration utilityServiceConfiguration) {
        ArrayList arrayList;
        synchronized (this) {
            this.f5442b = utilityServiceConfiguration;
            arrayList = new ArrayList(this.f5441a);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((FirstExecutionHandler) it.next()).updateConfig(utilityServiceConfiguration);
        }
    }
}
