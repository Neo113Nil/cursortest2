package io.appmetrica.analytics.billing.impl;

/* loaded from: classes.dex */
public final class g implements io.appmetrica.analytics.coreapi.internal.data.Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.billing.impl.s fromModel(io.appmetrica.analytics.billing.internal.config.BillingConfig billingConfig) {
        io.appmetrica.analytics.billing.impl.s sVar = new io.appmetrica.analytics.billing.impl.s();
        sVar.f3481a = billingConfig.getSendFrequencySeconds();
        sVar.f3482b = billingConfig.getFirstCollectingInappMaxAgeSeconds();
        return sVar;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final java.lang.Object toModel(java.lang.Object obj) {
        io.appmetrica.analytics.billing.impl.s sVar = (io.appmetrica.analytics.billing.impl.s) obj;
        return new io.appmetrica.analytics.billing.internal.config.BillingConfig(sVar.f3481a, sVar.f3482b);
    }

    public final io.appmetrica.analytics.billing.internal.config.BillingConfig a(io.appmetrica.analytics.billing.impl.s sVar) {
        return new io.appmetrica.analytics.billing.internal.config.BillingConfig(sVar.f3481a, sVar.f3482b);
    }
}
