package com.amazon.device.iap.internal.b.d;

/* compiled from: GetPurchaseUpdatesRequest.java */
/* loaded from: classes2.dex */
public final class a extends com.amazon.device.iap.internal.b.e {
    public a(com.amazon.device.iap.model.RequestId requestId, boolean z) {
        super(requestId);
        com.amazon.device.iap.internal.b.e.c cVar = new com.amazon.device.iap.internal.b.e.c(this);
        cVar.a(new com.amazon.device.iap.internal.b.d.c(this, z));
        com.amazon.device.iap.internal.b.e.d dVar = new com.amazon.device.iap.internal.b.e.d(this);
        dVar.a(new com.amazon.device.iap.internal.b.d.d(this));
        cVar.b(dVar);
        a((com.amazon.device.iap.internal.b.i) cVar);
    }

    @Override // com.amazon.device.iap.internal.b.e
    public void a() {
        com.amazon.device.iap.internal.b.i iVar;
        com.amazon.device.iap.model.PurchaseUpdatesResponse purchaseUpdatesResponse = (com.amazon.device.iap.model.PurchaseUpdatesResponse) d().a();
        if (purchaseUpdatesResponse.getReceipts() == null || purchaseUpdatesResponse.getReceipts().size() <= 0) {
            iVar = null;
        } else {
            java.util.HashSet hashSet = new java.util.HashSet();
            for (com.amazon.device.iap.model.Receipt receipt : purchaseUpdatesResponse.getReceipts()) {
                if (!com.amazon.device.iap.internal.util.d.a(receipt.getReceiptId())) {
                    hashSet.add(receipt.getReceiptId());
                }
            }
            iVar = new com.amazon.device.iap.internal.b.g.a(this, hashSet, com.amazon.device.iap.internal.model.a.DELIVERED.toString());
        }
        a(purchaseUpdatesResponse, iVar);
    }

    @Override // com.amazon.device.iap.internal.b.e
    public void b() {
        com.amazon.device.iap.model.PurchaseUpdatesResponse build;
        java.lang.Object a2 = d().a();
        if (a2 == null || !(a2 instanceof com.amazon.device.iap.model.PurchaseUpdatesResponse)) {
            build = new com.amazon.device.iap.internal.model.PurchaseUpdatesResponseBuilder().setRequestId(c()).setRequestStatus(com.amazon.device.iap.model.PurchaseUpdatesResponse.RequestStatus.FAILED).build();
        } else {
            build = (com.amazon.device.iap.model.PurchaseUpdatesResponse) a2;
        }
        a(build);
    }
}
