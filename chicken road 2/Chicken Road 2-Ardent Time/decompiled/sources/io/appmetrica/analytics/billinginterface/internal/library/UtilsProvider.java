package io.appmetrica.analytics.billinginterface.internal.library;

/* loaded from: classes.dex */
public interface UtilsProvider {
    io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager getBillingInfoManager();

    io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoSender getBillingInfoSender();

    java.util.concurrent.Executor getUiExecutor();

    io.appmetrica.analytics.billinginterface.internal.update.UpdatePolicy getUpdatePolicy();

    java.util.concurrent.Executor getWorkerExecutor();
}
