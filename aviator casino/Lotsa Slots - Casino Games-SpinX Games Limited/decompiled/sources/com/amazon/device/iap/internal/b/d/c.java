package com.amazon.device.iap.internal.b.d;

/* compiled from: PurchaseUpdatesCommandV2.java */
/* loaded from: classes2.dex */
public final class c extends com.amazon.device.iap.internal.b.d.b {
    private static final java.lang.String b = "c";

    public c(com.amazon.device.iap.internal.b.e eVar, boolean z) {
        super(eVar, com.ironsource.M6.k0, z);
    }

    @Override // com.amazon.device.iap.internal.b.i
    protected boolean a(com.amazon.venezia.command.SuccessResult successResult) throws java.lang.Exception {
        java.util.Map data = successResult.getData();
        com.amazon.device.iap.internal.util.e.a(b, "data: " + data);
        java.lang.String str = (java.lang.String) data.get("userId");
        java.lang.String str2 = (java.lang.String) data.get("marketplace");
        java.util.List<com.amazon.device.iap.model.Receipt> a2 = a(str, (java.lang.String) data.get("receipts"), (java.lang.String) data.get("requestId"));
        java.lang.String str3 = (java.lang.String) data.get(com.helpshift.user.UserConstants.POLLING_CURSOR);
        boolean booleanValue = java.lang.Boolean.valueOf((java.lang.String) data.get("hasMore")).booleanValue();
        com.amazon.device.iap.internal.b.e b2 = b();
        com.amazon.device.iap.model.PurchaseUpdatesResponse build = new com.amazon.device.iap.internal.model.PurchaseUpdatesResponseBuilder().setRequestId(b2.c()).setRequestStatus(com.amazon.device.iap.model.PurchaseUpdatesResponse.RequestStatus.SUCCESSFUL).setUserData(new com.amazon.device.iap.internal.model.UserDataBuilder().setUserId(str).setMarketplace(str2).build()).setReceipts(a2).setHasMore(booleanValue).build();
        b2.d().a("newCursor", str3);
        b2.d().a(build);
        return true;
    }

    private java.util.List<com.amazon.device.iap.model.Receipt> a(java.lang.String str, java.lang.String str2, java.lang.String str3) throws org.json.JSONException {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        org.json.JSONArray jSONArray = new org.json.JSONArray(str2);
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                arrayList.add(com.amazon.device.iap.internal.util.a.a(jSONArray.getJSONObject(i), str, str3));
            } catch (com.amazon.device.iap.internal.b.a e) {
                com.amazon.device.iap.internal.util.e.b(b, "fail to parse receipt, requestId:" + e.a());
            } catch (com.amazon.device.iap.internal.b.d e2) {
                com.amazon.device.iap.internal.util.e.b(b, "fail to verify receipt, requestId:" + e2.a());
            } catch (java.lang.Throwable th) {
                com.amazon.device.iap.internal.util.e.b(b, "fail to verify receipt, requestId:" + th.getMessage());
            }
        }
        return arrayList;
    }
}
