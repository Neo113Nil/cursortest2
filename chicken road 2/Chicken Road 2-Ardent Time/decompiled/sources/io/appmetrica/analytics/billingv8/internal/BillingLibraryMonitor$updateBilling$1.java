package io.appmetrica.analytics.billingv8.internal;

/* loaded from: classes.dex */
public final class BillingLibraryMonitor$updateBilling$1 implements io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ io.appmetrica.analytics.billingv8.internal.BillingLibraryMonitor f3653a;

    public BillingLibraryMonitor$updateBilling$1(io.appmetrica.analytics.billingv8.internal.BillingLibraryMonitor billingLibraryMonitor) {
        this.f3653a = billingLibraryMonitor;
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider
    public io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager getBillingInfoManager() {
        io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager billingInfoManager;
        billingInfoManager = this.f3653a.f3649e;
        return billingInfoManager;
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider
    public io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoSender getBillingInfoSender() {
        io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoSender billingInfoSender;
        billingInfoSender = this.f3653a.f3648d;
        return billingInfoSender;
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider
    public java.util.concurrent.Executor getUiExecutor() {
        java.util.concurrent.Executor executor;
        executor = this.f3653a.f3647c;
        return executor;
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider
    public io.appmetrica.analytics.billinginterface.internal.update.UpdatePolicy getUpdatePolicy() {
        io.appmetrica.analytics.billinginterface.internal.update.UpdatePolicy updatePolicy;
        updatePolicy = this.f3653a.f3650f;
        return updatePolicy;
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider
    public java.util.concurrent.Executor getWorkerExecutor() {
        java.util.concurrent.Executor executor;
        executor = this.f3653a.f3646b;
        return executor;
    }
}
