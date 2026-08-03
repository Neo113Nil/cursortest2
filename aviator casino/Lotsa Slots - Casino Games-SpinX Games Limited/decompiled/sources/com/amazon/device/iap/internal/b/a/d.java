package com.amazon.device.iap.internal.b.a;

/* compiled from: PurchaseResponseRequest.java */
/* loaded from: classes2.dex */
public final class d extends com.amazon.device.iap.internal.b.e {
    public d(com.amazon.device.iap.model.RequestId requestId) {
        super(requestId);
        com.amazon.device.iap.internal.b.a.a aVar = new com.amazon.device.iap.internal.b.a.a(this);
        aVar.b(new com.amazon.device.iap.internal.b.a.b(this));
        a((com.amazon.device.iap.internal.b.i) aVar);
    }

    @Override // com.amazon.device.iap.internal.b.e
    public void a() {
        com.amazon.device.iap.model.PurchaseResponse purchaseResponse = (com.amazon.device.iap.model.PurchaseResponse) d().a();
        if (purchaseResponse == null) {
            return;
        }
        com.amazon.device.iap.model.Receipt receipt = purchaseResponse.getReceipt();
        boolean z = receipt != null;
        com.amazon.device.iap.internal.b.i cVar = new com.amazon.device.iap.internal.b.f.c(this, z);
        if (z && (com.amazon.device.iap.model.ProductType.ENTITLED == receipt.getProductType() || com.amazon.device.iap.model.ProductType.SUBSCRIPTION == receipt.getProductType())) {
            cVar.b(new com.amazon.device.iap.internal.b.f.b(this, c().toString()));
        }
        a(purchaseResponse, cVar);
    }

    @Override // com.amazon.device.iap.internal.b.e
    public void b() {
        com.amazon.device.iap.model.PurchaseResponse purchaseResponse = (com.amazon.device.iap.model.PurchaseResponse) d().a();
        if (purchaseResponse == null) {
            purchaseResponse = new com.amazon.device.iap.internal.model.PurchaseResponseBuilder().setRequestId(c()).setRequestStatus(com.amazon.device.iap.model.PurchaseResponse.RequestStatus.FAILED).build();
        }
        a(purchaseResponse, new com.amazon.device.iap.internal.b.f.c(this, false));
    }
}
