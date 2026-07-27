package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.billinginterface.internal.BillingInfo;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoStorage;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import java.util.List;

/* loaded from: classes.dex */
public final class k implements BillingInfoStorage {

    /* renamed from: a, reason: collision with root package name */
    public final ProtobufStateStorage f5164a;

    /* renamed from: b, reason: collision with root package name */
    public C0346a f5165b;

    public k(ProtobufStateStorage<C0346a> protobufStateStorage) {
        this.f5164a = protobufStateStorage;
        this.f5165b = protobufStateStorage.read();
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoStorage
    public final List<BillingInfo> getBillingInfo() {
        return this.f5165b.f5147a;
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoStorage
    public final boolean isFirstInappCheckOccurred() {
        return this.f5165b.f5148b;
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoStorage
    public final void saveInfo(List<? extends BillingInfo> list, boolean z3) {
        for (BillingInfo billingInfo : list) {
        }
        C0346a c0346a = new C0346a(list, z3);
        this.f5165b = c0346a;
        this.f5164a.save(c0346a);
    }
}
