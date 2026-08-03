package io.appmetrica.analytics.billingv8.impl;

/* loaded from: classes.dex */
public final class o implements io.appmetrica.analytics.billinginterface.internal.update.UpdatePolicy {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider f3644a;

    /* JADX WARN: Multi-variable type inference failed */
    public o() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0052, code lost:
    
        if (kotlin.jvm.internal.i.a(r3.purchaseToken, r2.purchaseToken) != false) goto L22;
     */
    @Override // io.appmetrica.analytics.billinginterface.internal.update.UpdatePolicy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.util.Map<java.lang.String, io.appmetrica.analytics.billinginterface.internal.BillingInfo> getBillingInfoToUpdate(io.appmetrica.analytics.billinginterface.internal.config.BillingConfig billingConfig, java.util.Map<java.lang.String, ? extends io.appmetrica.analytics.billinginterface.internal.BillingInfo> map, io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager billingInfoManager) {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.util.Map.Entry<java.lang.String, ? extends io.appmetrica.analytics.billinginterface.internal.BillingInfo> entry : map.entrySet()) {
            io.appmetrica.analytics.billinginterface.internal.BillingInfo value = entry.getValue();
            if (value.type != io.appmetrica.analytics.billinginterface.internal.ProductType.INAPP || billingInfoManager.isFirstInappCheckOccurred()) {
                io.appmetrica.analytics.billinginterface.internal.BillingInfo billingInfo = billingInfoManager.get(value.productId);
                if (billingInfo != null) {
                }
                if (this.f3644a.currentTimeMillis() - value.purchaseTime > java.util.concurrent.TimeUnit.SECONDS.toMillis(billingConfig.firstCollectingInappMaxAgeSeconds)) {
                    if (value.type == io.appmetrica.analytics.billinginterface.internal.ProductType.SUBS) {
                    }
                    if (billingInfo != null && value.type == io.appmetrica.analytics.billinginterface.internal.ProductType.SUBS && this.f3644a.currentTimeMillis() - billingInfo.sendTime >= java.util.concurrent.TimeUnit.SECONDS.toMillis(billingConfig.sendFrequencySeconds)) {
                    }
                }
                linkedHashMap.put(entry.getKey(), entry.getValue());
            } else if (this.f3644a.currentTimeMillis() - value.purchaseTime <= java.util.concurrent.TimeUnit.SECONDS.toMillis(billingConfig.firstCollectingInappMaxAgeSeconds)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public o(io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider systemTimeProvider) {
        this.f3644a = systemTimeProvider;
    }

    public /* synthetic */ o(io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider systemTimeProvider, int i2, kotlin.jvm.internal.e eVar) {
        this((i2 & 1) != 0 ? new io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider() : systemTimeProvider);
    }
}
