package io.appmetrica.analytics.billing.impl;

/* loaded from: classes.dex */
public final class k implements io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoStorage {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage f3468a;

    /* renamed from: b, reason: collision with root package name */
    public io.appmetrica.analytics.billing.impl.C0204a f3469b;

    public k(io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage<io.appmetrica.analytics.billing.impl.C0204a> protobufStateStorage) {
        this.f3468a = protobufStateStorage;
        this.f3469b = protobufStateStorage.read();
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoStorage
    public final java.util.List<io.appmetrica.analytics.billinginterface.internal.BillingInfo> getBillingInfo() {
        return this.f3469b.f3449a;
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoStorage
    public final boolean isFirstInappCheckOccurred() {
        return this.f3469b.f3450b;
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoStorage
    public final void saveInfo(java.util.List<? extends io.appmetrica.analytics.billinginterface.internal.BillingInfo> list, boolean z2) {
        for (io.appmetrica.analytics.billinginterface.internal.BillingInfo billingInfo : list) {
        }
        io.appmetrica.analytics.billing.impl.C0204a c0204a = new io.appmetrica.analytics.billing.impl.C0204a(list, z2);
        this.f3469b = c0204a;
        this.f3468a.save(c0204a);
    }
}
