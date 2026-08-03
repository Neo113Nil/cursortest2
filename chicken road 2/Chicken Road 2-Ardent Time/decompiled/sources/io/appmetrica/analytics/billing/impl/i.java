package io.appmetrica.analytics.billing.impl;

/* loaded from: classes.dex */
public final class i implements io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.billing.impl.c fromModel(io.appmetrica.analytics.billinginterface.internal.BillingInfo billingInfo) {
        io.appmetrica.analytics.billing.impl.c cVar = new io.appmetrica.analytics.billing.impl.c();
        int i2 = io.appmetrica.analytics.billing.impl.h.f3464a[billingInfo.type.ordinal()];
        cVar.f3453a = i2 != 1 ? i2 != 2 ? 1 : 3 : 2;
        cVar.f3454b = billingInfo.productId;
        cVar.f3455c = billingInfo.purchaseToken;
        cVar.f3456d = billingInfo.purchaseTime;
        cVar.f3457e = billingInfo.sendTime;
        return cVar;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.billinginterface.internal.BillingInfo toModel(io.appmetrica.analytics.billing.impl.c cVar) {
        io.appmetrica.analytics.billinginterface.internal.ProductType productType;
        int i2 = cVar.f3453a;
        if (i2 == 2) {
            productType = io.appmetrica.analytics.billinginterface.internal.ProductType.INAPP;
        } else if (i2 != 3) {
            productType = io.appmetrica.analytics.billinginterface.internal.ProductType.UNKNOWN;
        } else {
            productType = io.appmetrica.analytics.billinginterface.internal.ProductType.SUBS;
        }
        return new io.appmetrica.analytics.billinginterface.internal.BillingInfo(productType, cVar.f3454b, cVar.f3455c, cVar.f3456d, cVar.f3457e);
    }
}
