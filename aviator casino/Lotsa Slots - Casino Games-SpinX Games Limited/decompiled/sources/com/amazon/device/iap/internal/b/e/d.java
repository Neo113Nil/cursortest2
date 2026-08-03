package com.amazon.device.iap.internal.b.e;

/* compiled from: GetUserIdCommandV1.java */
/* loaded from: classes2.dex */
public final class d extends com.amazon.device.iap.internal.b.e.b {
    private static final java.lang.String b = "d";

    public d(com.amazon.device.iap.internal.b.e eVar) {
        super(eVar, "1.0");
    }

    @Override // com.amazon.device.iap.internal.b.i
    protected boolean a(com.amazon.venezia.command.SuccessResult successResult) throws android.os.RemoteException, com.amazon.android.framework.exception.KiwiException {
        java.lang.String str = b;
        com.amazon.device.iap.internal.util.e.a(str, "onSuccessInternal: result = " + successResult);
        java.util.Map data = successResult.getData();
        com.amazon.device.iap.internal.util.e.a(str, "data: " + data);
        java.lang.String str2 = (java.lang.String) data.get("userId");
        com.amazon.device.iap.internal.b.e b2 = b();
        if (com.amazon.device.iap.internal.util.d.a(str2)) {
            b2.d().a(new com.amazon.device.iap.internal.model.UserDataResponseBuilder().setRequestId(b2.c()).setRequestStatus(com.amazon.device.iap.model.UserDataResponse.RequestStatus.FAILED).build());
            return false;
        }
        com.amazon.device.iap.model.UserData build = new com.amazon.device.iap.internal.model.UserDataBuilder().setUserId(str2).setMarketplace(f3477a).build();
        com.amazon.device.iap.model.UserDataResponse build2 = new com.amazon.device.iap.internal.model.UserDataResponseBuilder().setRequestId(b2.c()).setRequestStatus(com.amazon.device.iap.model.UserDataResponse.RequestStatus.SUCCESSFUL).setUserData(build).build();
        b2.d().a("userId", build.getUserId());
        b2.d().a(build2);
        return true;
    }
}
