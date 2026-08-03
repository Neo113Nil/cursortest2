package com.amazon.device.iap.internal.b.a;

/* compiled from: PurchaseResponseCommandBase.java */
/* loaded from: classes2.dex */
abstract class c extends com.amazon.device.iap.internal.b.i {
    c(com.amazon.device.iap.internal.b.e eVar, java.lang.String str) {
        super(eVar, "purchase_response", str);
    }

    protected void a(java.lang.String str, java.lang.String str2, java.lang.String str3, com.amazon.device.iap.model.PurchaseResponse.RequestStatus requestStatus) {
        com.amazon.device.iap.internal.b.e b = b();
        b.d().a(new com.amazon.device.iap.internal.model.PurchaseResponseBuilder().setRequestId(b.c()).setRequestStatus(requestStatus).setUserData(new com.amazon.device.iap.internal.model.UserDataBuilder().setUserId(str).setMarketplace(str2).build()).setReceipt(null).build());
    }
}
