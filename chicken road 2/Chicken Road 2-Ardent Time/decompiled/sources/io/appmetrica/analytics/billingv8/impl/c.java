package io.appmetrica.analytics.billingv8.impl;

/* loaded from: classes.dex */
public final class c implements io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoStorage f3608a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3609b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.LinkedHashMap f3610c;

    public c(io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoStorage billingInfoStorage) {
        this.f3608a = billingInfoStorage;
        this.f3609b = billingInfoStorage.isFirstInappCheckOccurred();
        java.util.List<io.appmetrica.analytics.billinginterface.internal.BillingInfo> billingInfo = billingInfoStorage.getBillingInfo();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.lang.Object obj : billingInfo) {
            linkedHashMap.put(((io.appmetrica.analytics.billinginterface.internal.BillingInfo) obj).productId, obj);
        }
        this.f3610c = linkedHashMap;
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager
    public final io.appmetrica.analytics.billinginterface.internal.BillingInfo get(java.lang.String str) {
        return (io.appmetrica.analytics.billinginterface.internal.BillingInfo) this.f3610c.get(str);
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager
    public final boolean isFirstInappCheckOccurred() {
        return this.f3609b;
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager
    public final void markFirstInappCheckOccurred() {
        if (this.f3609b) {
            return;
        }
        this.f3609b = true;
        this.f3608a.saveInfo(i1.AbstractC0190i.X(this.f3610c.values()), this.f3609b);
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager
    public final void update(java.util.Map<java.lang.String, ? extends io.appmetrica.analytics.billinginterface.internal.BillingInfo> map) {
        for (io.appmetrica.analytics.billinginterface.internal.BillingInfo billingInfo : map.values()) {
            this.f3610c.put(billingInfo.productId, billingInfo);
        }
        this.f3608a.saveInfo(i1.AbstractC0190i.X(this.f3610c.values()), this.f3609b);
    }
}
