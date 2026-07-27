package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.billinginterface.internal.BillingInfo;
import io.appmetrica.analytics.billinginterface.internal.ProductType;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* loaded from: classes.dex */
public final class i implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final c fromModel(BillingInfo billingInfo) {
        c cVar = new c();
        int i3 = h.f5160a[billingInfo.type.ordinal()];
        cVar.f5150a = i3 != 1 ? i3 != 2 ? 1 : 3 : 2;
        cVar.f5151b = billingInfo.productId;
        cVar.f5152c = billingInfo.purchaseToken;
        cVar.f5153d = billingInfo.purchaseTime;
        cVar.f5154e = billingInfo.sendTime;
        return cVar;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final BillingInfo toModel(c cVar) {
        ProductType productType;
        int i3 = cVar.f5150a;
        if (i3 == 2) {
            productType = ProductType.INAPP;
        } else if (i3 != 3) {
            productType = ProductType.UNKNOWN;
        } else {
            productType = ProductType.SUBS;
        }
        return new BillingInfo(productType, cVar.f5151b, cVar.f5152c, cVar.f5153d, cVar.f5154e);
    }
}
