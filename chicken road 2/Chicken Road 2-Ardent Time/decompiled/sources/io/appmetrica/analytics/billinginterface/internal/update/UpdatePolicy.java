package io.appmetrica.analytics.billinginterface.internal.update;

/* loaded from: classes.dex */
public interface UpdatePolicy {
    java.util.Map<java.lang.String, io.appmetrica.analytics.billinginterface.internal.BillingInfo> getBillingInfoToUpdate(io.appmetrica.analytics.billinginterface.internal.config.BillingConfig billingConfig, java.util.Map<java.lang.String, io.appmetrica.analytics.billinginterface.internal.BillingInfo> map, io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager billingInfoManager);
}
