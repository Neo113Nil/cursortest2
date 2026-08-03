package com.amazon.device.iap.internal.b.d;

/* compiled from: PurchaseUpdatesCommandV1.java */
/* loaded from: classes2.dex */
public final class d extends com.amazon.device.iap.internal.b.d.b {
    private static final java.lang.String b = "d";
    private static final java.util.Date c = new java.util.Date(0);

    public d(com.amazon.device.iap.internal.b.e eVar) {
        super(eVar, "1.0", true);
    }

    @Override // com.amazon.device.iap.internal.b.i
    protected boolean a(com.amazon.venezia.command.SuccessResult successResult) throws java.lang.Exception {
        java.util.Map data = successResult.getData();
        com.amazon.device.iap.internal.util.e.a(b, "data: " + data);
        java.lang.String str = (java.lang.String) data.get("userId");
        java.lang.String str2 = (java.lang.String) data.get("marketplace");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        org.json.JSONArray jSONArray = new org.json.JSONArray((java.lang.String) data.get("receipts"));
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                com.amazon.device.iap.model.Receipt a2 = com.amazon.device.iap.internal.util.a.a(jSONArray.getJSONObject(i), str, null);
                arrayList.add(a2);
                if (com.amazon.device.iap.model.ProductType.ENTITLED == a2.getProductType()) {
                    com.amazon.device.iap.internal.c.c.a().a(str, a2.getReceiptId(), a2.getSku());
                }
            } catch (com.amazon.device.iap.internal.b.a e) {
                com.amazon.device.iap.internal.util.e.b(b, "fail to parse receipt, requestId:" + e.a());
            } catch (com.amazon.device.iap.internal.b.d e2) {
                com.amazon.device.iap.internal.util.e.b(b, "fail to verify receipt, requestId:" + e2.a());
            } catch (java.lang.Throwable th) {
                com.amazon.device.iap.internal.util.e.b(b, "fail to verify receipt, requestId:" + th.getMessage());
            }
        }
        org.json.JSONArray jSONArray2 = new org.json.JSONArray((java.lang.String) data.get("revocations"));
        for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
            try {
                java.lang.String string = jSONArray2.getString(i2);
                arrayList.add(new com.amazon.device.iap.internal.model.ReceiptBuilder().setSku(string).setProductType(com.amazon.device.iap.model.ProductType.ENTITLED).setPurchaseDate(null).setCancelDate(c).setReceiptId(com.amazon.device.iap.internal.c.c.a().a(str, string)).build());
            } catch (org.json.JSONException unused) {
                com.amazon.device.iap.internal.util.e.b(b, "fail to parse JSON[" + i2 + "] in \"" + jSONArray2 + "\"");
            }
        }
        java.lang.String str3 = (java.lang.String) data.get(com.helpshift.user.UserConstants.POLLING_CURSOR);
        boolean equalsIgnoreCase = "true".equalsIgnoreCase((java.lang.String) data.get("hasMore"));
        com.amazon.device.iap.internal.b.e b2 = b();
        com.amazon.device.iap.model.PurchaseUpdatesResponse build = new com.amazon.device.iap.internal.model.PurchaseUpdatesResponseBuilder().setRequestId(b2.c()).setRequestStatus(com.amazon.device.iap.model.PurchaseUpdatesResponse.RequestStatus.SUCCESSFUL).setUserData(new com.amazon.device.iap.internal.model.UserDataBuilder().setUserId(str).setMarketplace(str2).build()).setReceipts(arrayList).setHasMore(equalsIgnoreCase).build();
        build.getReceipts().addAll(com.amazon.device.iap.internal.c.a.a().b(build.getUserData().getUserId()));
        b2.d().a(build);
        b2.d().a("newCursor", str3);
        return true;
    }
}
