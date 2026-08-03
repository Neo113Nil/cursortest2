package com.amazon.device.iap.internal.b.e;

/* compiled from: GetUserDataRequest.java */
/* loaded from: classes2.dex */
public final class a extends com.amazon.device.iap.internal.b.e {
    public a(com.amazon.device.iap.model.RequestId requestId) {
        super(requestId);
        com.amazon.device.iap.internal.b.e.c cVar = new com.amazon.device.iap.internal.b.e.c(this);
        cVar.b(new com.amazon.device.iap.internal.b.e.d(this));
        a((com.amazon.device.iap.internal.b.i) cVar);
    }

    @Override // com.amazon.device.iap.internal.b.e
    public void a() {
        a((com.amazon.device.iap.model.UserDataResponse) d().a());
    }

    @Override // com.amazon.device.iap.internal.b.e
    public void b() {
        com.amazon.device.iap.model.UserDataResponse userDataResponse = (com.amazon.device.iap.model.UserDataResponse) d().a();
        if (userDataResponse == null) {
            userDataResponse = new com.amazon.device.iap.internal.model.UserDataResponseBuilder().setRequestId(c()).setRequestStatus(com.amazon.device.iap.model.UserDataResponse.RequestStatus.FAILED).build();
        }
        a(userDataResponse);
    }
}
