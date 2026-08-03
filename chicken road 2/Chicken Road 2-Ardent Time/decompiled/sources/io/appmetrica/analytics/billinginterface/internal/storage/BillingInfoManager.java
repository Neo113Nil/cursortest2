package io.appmetrica.analytics.billinginterface.internal.storage;

/* loaded from: classes.dex */
public interface BillingInfoManager {
    io.appmetrica.analytics.billinginterface.internal.BillingInfo get(java.lang.String str);

    boolean isFirstInappCheckOccurred();

    void markFirstInappCheckOccurred();

    void update(java.util.Map<java.lang.String, io.appmetrica.analytics.billinginterface.internal.BillingInfo> map);
}
