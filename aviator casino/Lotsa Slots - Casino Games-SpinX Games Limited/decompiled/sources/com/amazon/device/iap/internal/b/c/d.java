package com.amazon.device.iap.internal.b.c;

/* compiled from: GetProductDataRequest.java */
/* loaded from: classes2.dex */
public final class d extends com.amazon.device.iap.internal.b.e {
    public d(com.amazon.device.iap.model.RequestId requestId, java.util.Set<java.lang.String> set) {
        super(requestId);
        com.amazon.device.iap.internal.b.c.a aVar = new com.amazon.device.iap.internal.b.c.a(this, set);
        aVar.b(new com.amazon.device.iap.internal.b.c.b(this, set));
        a((com.amazon.device.iap.internal.b.i) aVar);
    }

    @Override // com.amazon.device.iap.internal.b.e
    public void a() {
        a((com.amazon.device.iap.model.ProductDataResponse) d().a());
    }

    @Override // com.amazon.device.iap.internal.b.e
    public void b() {
        com.amazon.device.iap.model.ProductDataResponse productDataResponse = (com.amazon.device.iap.model.ProductDataResponse) d().a();
        if (productDataResponse == null) {
            productDataResponse = new com.amazon.device.iap.internal.model.ProductDataResponseBuilder().setRequestId(c()).setRequestStatus(com.amazon.device.iap.model.ProductDataResponse.RequestStatus.FAILED).build();
        }
        a(productDataResponse);
    }
}
