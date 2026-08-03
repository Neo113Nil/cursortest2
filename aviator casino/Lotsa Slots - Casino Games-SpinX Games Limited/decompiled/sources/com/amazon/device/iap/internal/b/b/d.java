package com.amazon.device.iap.internal.b.b;

/* compiled from: PurchaseRequest.java */
/* loaded from: classes2.dex */
public final class d extends com.amazon.device.iap.internal.b.e {
    @Override // com.amazon.device.iap.internal.b.e
    public void a() {
    }

    public d(com.amazon.device.iap.model.RequestId requestId, java.lang.String str) {
        super(requestId);
        com.amazon.device.iap.internal.b.b.c cVar = new com.amazon.device.iap.internal.b.b.c(this, str);
        cVar.b(new com.amazon.device.iap.internal.b.b.b(this, str));
        a((com.amazon.device.iap.internal.b.i) cVar);
    }

    @Override // com.amazon.device.iap.internal.b.e
    public void b() {
        com.amazon.device.iap.model.PurchaseResponse purchaseResponse = (com.amazon.device.iap.model.PurchaseResponse) d().a();
        if (purchaseResponse == null) {
            purchaseResponse = new com.amazon.device.iap.internal.model.PurchaseResponseBuilder().setRequestId(c()).setRequestStatus(com.amazon.device.iap.model.PurchaseResponse.RequestStatus.FAILED).build();
        }
        a(purchaseResponse);
    }
}
