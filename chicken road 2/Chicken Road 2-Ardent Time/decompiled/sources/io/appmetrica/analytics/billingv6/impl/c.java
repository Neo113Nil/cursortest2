package io.appmetrica.analytics.billingv6.impl;

/* loaded from: classes.dex */
public final class c implements io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoStorage f3555a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3556b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.LinkedHashMap f3557c;

    public c(io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoStorage billingInfoStorage) {
        this.f3555a = billingInfoStorage;
        this.f3556b = billingInfoStorage.isFirstInappCheckOccurred();
        java.util.List<io.appmetrica.analytics.billinginterface.internal.BillingInfo> billingInfo = billingInfoStorage.getBillingInfo();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.lang.Object obj : billingInfo) {
            linkedHashMap.put(((io.appmetrica.analytics.billinginterface.internal.BillingInfo) obj).productId, obj);
        }
        this.f3557c = linkedHashMap;
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager
    public final io.appmetrica.analytics.billinginterface.internal.BillingInfo get(java.lang.String str) {
        return (io.appmetrica.analytics.billinginterface.internal.BillingInfo) this.f3557c.get(str);
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager
    public final boolean isFirstInappCheckOccurred() {
        return this.f3556b;
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager
    public final void markFirstInappCheckOccurred() {
        if (this.f3556b) {
            return;
        }
        this.f3556b = true;
        this.f3555a.saveInfo(i1.AbstractC0190i.X(this.f3557c.values()), this.f3556b);
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager
    public final void update(java.util.Map<java.lang.String, ? extends io.appmetrica.analytics.billinginterface.internal.BillingInfo> map) {
        for (io.appmetrica.analytics.billinginterface.internal.BillingInfo billingInfo : map.values()) {
            this.f3557c.put(billingInfo.productId, billingInfo);
        }
        this.f3555a.saveInfo(i1.AbstractC0190i.X(this.f3557c.values()), this.f3556b);
    }
}
