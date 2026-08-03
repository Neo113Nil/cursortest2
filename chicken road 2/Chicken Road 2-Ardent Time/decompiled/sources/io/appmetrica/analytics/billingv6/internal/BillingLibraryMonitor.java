package io.appmetrica.analytics.billingv6.internal;

/* loaded from: classes.dex */
public final class BillingLibraryMonitor implements io.appmetrica.analytics.billinginterface.internal.monitor.BillingMonitor, io.appmetrica.analytics.billingv6.impl.n {

    /* renamed from: a, reason: collision with root package name */
    private final android.content.Context f3592a;

    /* renamed from: b, reason: collision with root package name */
    private final java.util.concurrent.Executor f3593b;

    /* renamed from: c, reason: collision with root package name */
    private final java.util.concurrent.Executor f3594c;

    /* renamed from: d, reason: collision with root package name */
    private final io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoSender f3595d;

    /* renamed from: e, reason: collision with root package name */
    private final io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager f3596e;

    /* renamed from: f, reason: collision with root package name */
    private final io.appmetrica.analytics.billinginterface.internal.update.UpdatePolicy f3597f;

    /* renamed from: g, reason: collision with root package name */
    private io.appmetrica.analytics.billinginterface.internal.config.BillingConfig f3598g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f3599h;

    public BillingLibraryMonitor(android.content.Context context, java.util.concurrent.Executor executor, java.util.concurrent.Executor executor2, io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoStorage billingInfoStorage, io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoSender billingInfoSender, io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager billingInfoManager, io.appmetrica.analytics.billinginterface.internal.update.UpdatePolicy updatePolicy) {
        this.f3592a = context;
        this.f3593b = executor;
        this.f3594c = executor2;
        this.f3595d = billingInfoSender;
        this.f3596e = billingInfoManager;
        this.f3597f = updatePolicy;
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.config.BillingConfigChangedListener
    public synchronized void onBillingConfigChanged(io.appmetrica.analytics.billinginterface.internal.config.BillingConfig billingConfig) {
        if (kotlin.jvm.internal.i.a(this.f3598g, billingConfig)) {
            return;
        }
        this.f3598g = billingConfig;
        if (billingConfig != null && !this.f3599h) {
            this.f3599h = true;
            com.android.billingclient.api.BillingClient build = com.android.billingclient.api.BillingClient.newBuilder(this.f3592a).setListener(new io.appmetrica.analytics.billingv6.impl.l()).enablePendingPurchases().build();
            build.startConnection(new io.appmetrica.analytics.billingv6.impl.b(billingConfig, build, new io.appmetrica.analytics.billingv6.internal.BillingLibraryMonitor$updateBilling$1(this), new io.appmetrica.analytics.billingv6.impl.d(build), this));
        }
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.monitor.BillingMonitor
    public void onSessionResumed() {
        try {
            io.appmetrica.analytics.billinginterface.internal.config.BillingConfig billingConfig = this.f3598g;
            if (billingConfig != null && !this.f3599h) {
                this.f3599h = true;
                com.android.billingclient.api.BillingClient build = com.android.billingclient.api.BillingClient.newBuilder(this.f3592a).setListener(new io.appmetrica.analytics.billingv6.impl.l()).enablePendingPurchases().build();
                build.startConnection(new io.appmetrica.analytics.billingv6.impl.b(billingConfig, build, new io.appmetrica.analytics.billingv6.internal.BillingLibraryMonitor$updateBilling$1(this), new io.appmetrica.analytics.billingv6.impl.d(build), this));
            }
        } catch (java.lang.Throwable unused) {
        }
    }

    @Override // io.appmetrica.analytics.billingv6.impl.n
    public synchronized void onUpdateFinished() {
        this.f3599h = false;
    }

    public /* synthetic */ BillingLibraryMonitor(android.content.Context context, java.util.concurrent.Executor executor, java.util.concurrent.Executor executor2, io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoStorage billingInfoStorage, io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoSender billingInfoSender, io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager billingInfoManager, io.appmetrica.analytics.billinginterface.internal.update.UpdatePolicy updatePolicy, int i2, kotlin.jvm.internal.e eVar) {
        this(context, executor, executor2, billingInfoStorage, billingInfoSender, (i2 & 32) != 0 ? new io.appmetrica.analytics.billingv6.impl.c(billingInfoStorage) : billingInfoManager, (i2 & 64) != 0 ? new io.appmetrica.analytics.billingv6.impl.o(null, 1, null) : updatePolicy);
    }
}
