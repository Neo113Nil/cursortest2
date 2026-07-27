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
    private final ArrayList f6261a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private UtilityServiceConfiguration f6262b;

    /* renamed from: c, reason: collision with root package name */
    final UtilityServiceProvider f6263c;

    public static class FirstExecutionConditionChecker {

        /* renamed from: a, reason: collision with root package name */
        private boolean f6264a = false;

        /* renamed from: b, reason: collision with root package name */
        private long f6265b;

        /* renamed from: c, reason: collision with root package name */
        private long f6266c;

        /* renamed from: d, reason: collision with root package name */
        private long f6267d;

        /* renamed from: e, reason: collision with root package name */
        private final FirstExecutionDelayChecker f6268e;
        public final String tag;

        public FirstExecutionConditionChecker(UtilityServiceConfiguration utilityServiceConfiguration, FirstExecutionDelayChecker firstExecutionDelayChecker, String str) {
            this.f6268e = firstExecutionDelayChecker;
            this.f6266c = utilityServiceConfiguration == null ? 0L : utilityServiceConfiguration.getInitialConfigTime();
            this.f6265b = utilityServiceConfiguration != null ? utilityServiceConfiguration.getLastUpdateConfigTime() : 0L;
            this.f6267d = Long.MAX_VALUE;
            this.tag = str;
        }

        public final void a(long j2) {
            this.f6267d = TimeUnit.SECONDS.toMillis(j2);
        }

        public final boolean b() {
            if (this.f6264a) {
                return true;
            }
            return this.f6268e.delaySinceFirstStartupWasPassed(this.f6266c, this.f6265b, this.f6267d);
        }

        public final void a() {
            this.f6264a = true;
        }

        public final void a(UtilityServiceConfiguration utilityServiceConfiguration) {
            this.f6266c = utilityServiceConfiguration.getInitialConfigTime();
            this.f6265b = utilityServiceConfiguration.getLastUpdateConfigTime();
        }
    }

    public static class FirstExecutionDelayChecker {
        public boolean delaySinceFirstStartupWasPassed(long j2, long j6, long j7) {
            return j6 - j2 >= j7;
        }
    }

    public static class FirstExecutionHandler implements FirstExecutionDelayedTask {

        /* renamed from: a, reason: collision with root package name */
        private final FirstExecutionConditionChecker f6269a;

        /* renamed from: b, reason: collision with root package name */
        private final WaitForActivationDelayBarrier.ActivationBarrierHelper f6270b;

        /* renamed from: c, reason: collision with root package name */
        private final ICommonExecutor f6271c;

        public /* synthetic */ FirstExecutionHandler(ICommonExecutor iCommonExecutor, WaitForActivationDelayBarrier.ActivationBarrierHelper activationBarrierHelper, FirstExecutionConditionChecker firstExecutionConditionChecker, int i2) {
            this(iCommonExecutor, activationBarrierHelper, firstExecutionConditionChecker);
        }

        public boolean canExecute() {
            boolean b6 = this.f6269a.b();
            if (b6) {
                this.f6269a.a();
            }
            return b6;
        }

        @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.FirstExecutionDelayedTask
        public void setInitialDelaySeconds(long j2) {
            this.f6269a.a(j2);
        }

        @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.FirstExecutionDelayedTask
        public boolean tryExecute(long j2) {
            if (!this.f6269a.b()) {
                return false;
            }
            this.f6270b.subscribeIfNeeded(TimeUnit.SECONDS.toMillis(j2), this.f6271c);
            this.f6269a.a();
            return true;
        }

        public void updateConfig(UtilityServiceConfiguration utilityServiceConfiguration) {
            this.f6269a.a(utilityServiceConfiguration);
        }

        private FirstExecutionHandler(ICommonExecutor iCommonExecutor, WaitForActivationDelayBarrier.ActivationBarrierHelper activationBarrierHelper, FirstExecutionConditionChecker firstExecutionConditionChecker) {
            this.f6270b = activationBarrierHelper;
            this.f6269a = firstExecutionConditionChecker;
            this.f6271c = iCommonExecutor;
        }
    }

    public FirstExecutionConditionServiceImpl(UtilityServiceProvider utilityServiceProvider) {
        this.f6263c = utilityServiceProvider;
    }

    public final synchronized FirstExecutionHandler a(ICommonExecutor iCommonExecutor, WaitForActivationDelayBarrier.ActivationBarrierHelper activationBarrierHelper, FirstExecutionConditionChecker firstExecutionConditionChecker) {
        FirstExecutionHandler firstExecutionHandler;
        firstExecutionHandler = new FirstExecutionHandler(iCommonExecutor, activationBarrierHelper, firstExecutionConditionChecker, 0);
        this.f6261a.add(firstExecutionHandler);
        return firstExecutionHandler;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.FirstExecutionConditionService
    public synchronized FirstExecutionDelayedTask createDelayedTask(String str, ICommonExecutor iCommonExecutor, Runnable runnable) {
        return a(iCommonExecutor, new WaitForActivationDelayBarrier.ActivationBarrierHelper(runnable, this.f6263c.getActivationBarrier()), new FirstExecutionConditionChecker(this.f6262b, new FirstExecutionDelayChecker(), str));
    }

    public void updateConfig(UtilityServiceConfiguration utilityServiceConfiguration) {
        ArrayList arrayList;
        synchronized (this) {
            this.f6262b = utilityServiceConfiguration;
            arrayList = new ArrayList(this.f6261a);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((FirstExecutionHandler) it.next()).updateConfig(utilityServiceConfiguration);
        }
    }
}
