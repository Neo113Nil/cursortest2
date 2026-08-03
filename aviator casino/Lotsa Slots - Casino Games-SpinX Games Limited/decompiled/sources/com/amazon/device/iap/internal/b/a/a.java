package com.amazon.device.iap.internal.b.a;

/* compiled from: PurchaseResponseCommandV2.java */
/* loaded from: classes2.dex */
public final class a extends com.amazon.device.iap.internal.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    private static final java.lang.String f3466a = "a";

    public a(com.amazon.device.iap.internal.b.e eVar) {
        super(eVar, com.ironsource.M6.k0);
    }

    @Override // com.amazon.device.iap.internal.b.i
    protected boolean a(com.amazon.venezia.command.SuccessResult successResult) throws java.lang.Exception {
        com.amazon.device.iap.model.Receipt a2;
        java.util.Map data = successResult.getData();
        com.amazon.device.iap.internal.util.e.a(f3466a, "data: " + data);
        java.lang.String str = (java.lang.String) getCommandData().get("requestId");
        java.lang.String str2 = (java.lang.String) data.get("userId");
        java.lang.String str3 = (java.lang.String) data.get("marketplace");
        java.lang.String str4 = (java.lang.String) data.get("receipt");
        if (com.amazon.device.iap.internal.util.d.a(str4)) {
            a(str2, str3, str, com.amazon.device.iap.model.PurchaseResponse.RequestStatus.FAILED);
            return false;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject(str4);
        com.amazon.device.iap.model.PurchaseResponse.RequestStatus safeValueOf = com.amazon.device.iap.model.PurchaseResponse.RequestStatus.safeValueOf(jSONObject.getString("orderStatus"));
        if (safeValueOf == com.amazon.device.iap.model.PurchaseResponse.RequestStatus.SUCCESSFUL) {
            try {
                a2 = com.amazon.device.iap.internal.util.a.a(jSONObject, str2, str);
            } catch (java.lang.Throwable unused) {
                a(str2, str3, str, com.amazon.device.iap.model.PurchaseResponse.RequestStatus.FAILED);
                return false;
            }
        } else {
            a2 = null;
        }
        com.amazon.device.iap.internal.b.e b = b();
        b.d().a(new com.amazon.device.iap.internal.model.PurchaseResponseBuilder().setRequestId(b.c()).setRequestStatus(safeValueOf).setUserData(new com.amazon.device.iap.internal.model.UserDataBuilder().setUserId(str2).setMarketplace(str3).build()).setReceipt(a2).build());
        return true;
    }
}
