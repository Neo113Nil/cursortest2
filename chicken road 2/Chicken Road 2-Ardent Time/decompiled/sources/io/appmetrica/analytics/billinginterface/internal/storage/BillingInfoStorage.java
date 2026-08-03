package io.appmetrica.analytics.billinginterface.internal.storage;

/* loaded from: classes.dex */
public interface BillingInfoStorage {
    java.util.List<io.appmetrica.analytics.billinginterface.internal.BillingInfo> getBillingInfo();

    boolean isFirstInappCheckOccurred();

    void saveInfo(java.util.List<io.appmetrica.analytics.billinginterface.internal.BillingInfo> list, boolean z2);
}
