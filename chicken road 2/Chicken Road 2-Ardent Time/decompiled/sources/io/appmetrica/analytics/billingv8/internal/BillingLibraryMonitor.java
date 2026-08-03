package io.appmetrica.analytics.billingv8.internal;

/* loaded from: classes.dex */
public final class BillingLibraryMonitor implements io.appmetrica.analytics.billinginterface.internal.monitor.BillingMonitor, io.appmetrica.analytics.billingv8.impl.n {

    /* renamed from: a, reason: collision with root package name */
    private final android.content.Context f3645a;

    /* renamed from: b, reason: collision with root package name */
    private final java.util.concurrent.Executor f3646b;

    /* renamed from: c, reason: collision with root package name */
    private final java.util.concurrent.Executor f3647c;

    /* renamed from: d, reason: collision with root package name */
    private final io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoSender f3648d;

    /* renamed from: e, reason: collision with root package name */
    private final io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager f3649e;

    /* renamed from: f, reason: collision with root package name */
    private final io.appmetrica.analytics.billinginterface.internal.update.UpdatePolicy f3650f;

    /* renamed from: g, reason: collision with root package name */
    private io.appmetrica.analytics.billinginterface.internal.config.BillingConfig f3651g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f3652h;

    public BillingLibraryMonitor(android.content.Context context, java.util.concurrent.Executor executor, java.util.concurrent.Executor executor2, io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoStorage billingInfoStorage, io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoSender billingInfoSender, io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager billingInfoManager, io.appmetrica.analytics.billinginterface.internal.update.UpdatePolicy updatePolicy) {
        this.f3645a = context;
        this.f3646b = executor;
        this.f3647c = executor2;
        this.f3648d = billingInfoSender;
        this.f3649e = billingInfoManager;
        this.f3650f = updatePolicy;
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.config.BillingConfigChangedListener
    public synchronized void onBillingConfigChanged(io.appmetrica.analytics.billinginterface.internal.config.BillingConfig billingConfig) {
        if (kotlin.jvm.internal.i.a(this.f3651g, billingConfig)) {
            return;
        }
        this.f3651g = billingConfig;
        if (billingConfig != null && !this.f3652h) {
            this.f3652h = true;
            com.android.billingclient.api.BillingClient build = com.android.billingclient.api.BillingClient.newBuilder(this.f3645a).setListener(new io.appmetrica.analytics.billingv8.impl.l()).enablePendingPurchases(com.android.billingclient.api.PendingPurchasesParams.newBuilder().enableOneTimeProducts().build()).build();
            build.startConnection(new io.appmetrica.analytics.billingv8.impl.b(billingConfig, build, new io.appmetrica.analytics.billingv8.internal.BillingLibraryMonitor$updateBilling$1(this), new io.appmetrica.analytics.billingv8.impl.d(build), this));
        }
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.monitor.BillingMonitor
    public void onSessionResumed() {
        try {
            io.appmetrica.analytics.billinginterface.internal.config.BillingConfig billingConfig = this.f3651g;
            if (billingConfig != null && !this.f3652h) {
                this.f3652h = true;
                com.android.billingclient.api.BillingClient build = com.android.billingclient.api.BillingClient.newBuilder(this.f3645a).setListener(new io.appmetrica.analytics.billingv8.impl.l()).enablePendingPurchases(com.android.billingclient.api.PendingPurchasesParams.newBuilder().enableOneTimeProducts().build()).build();
                build.startConnection(new io.appmetrica.analytics.billingv8.impl.b(billingConfig, build, new io.appmetrica.analytics.billingv8.internal.BillingLibraryMonitor$updateBilling$1(this), new io.appmetrica.analytics.billingv8.impl.d(build), this));
            }
        } catch (java.lang.Throwable unused) {
        }
    }

    @Override // io.appmetrica.analytics.billingv8.impl.n
    public synchronized void onUpdateFinished() {
        this.f3652h = false;
    }

    public /* synthetic */ BillingLibraryMonitor(android.content.Context context, java.util.concurrent.Executor executor, java.util.concurrent.Executor executor2, io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoStorage billingInfoStorage, io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoSender billingInfoSender, io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager billingInfoManager, io.appmetrica.analytics.billinginterface.internal.update.UpdatePolicy updatePolicy, int i2, kotlin.jvm.internal.e eVar) {
        this(context, executor, executor2, billingInfoStorage, billingInfoSender, (i2 & 32) != 0 ? new io.appmetrica.analytics.billingv8.impl.c(billingInfoStorage) : billingInfoManager, (i2 & 64) != 0 ? new io.appmetrica.analytics.billingv8.impl.o(null, 1, null) : updatePolicy);
    }
}
