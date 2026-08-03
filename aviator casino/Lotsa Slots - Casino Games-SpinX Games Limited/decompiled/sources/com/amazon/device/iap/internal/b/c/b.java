package com.amazon.device.iap.internal.b.c;

/* compiled from: GetItemDataCommandV1.java */
/* loaded from: classes2.dex */
public final class b extends com.amazon.device.iap.internal.b.c.c {
    private static final java.lang.String b = "b";

    public b(com.amazon.device.iap.internal.b.e eVar, java.util.Set<java.lang.String> set) {
        super(eVar, "1.0", set);
    }

    @Override // com.amazon.device.iap.internal.b.i
    protected boolean a(com.amazon.venezia.command.SuccessResult successResult) throws android.os.RemoteException, com.amazon.android.framework.exception.KiwiException {
        java.util.Map data = successResult.getData();
        com.amazon.device.iap.internal.util.e.a(b, "data: " + data);
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        java.util.HashMap hashMap = new java.util.HashMap();
        for (java.lang.String str : this.f3472a) {
            if (!data.containsKey(str)) {
                linkedHashSet.add(str);
            } else {
                try {
                    hashMap.put(str, a(str, data));
                } catch (java.lang.IllegalArgumentException e) {
                    linkedHashSet.add(str);
                    com.amazon.device.iap.internal.util.e.b(b, "Error parsing JSON for SKU " + str + ": " + e.getMessage());
                }
            }
        }
        com.amazon.device.iap.internal.b.e b2 = b();
        b2.d().a(new com.amazon.device.iap.internal.model.ProductDataResponseBuilder().setRequestId(b2.c()).setRequestStatus(com.amazon.device.iap.model.ProductDataResponse.RequestStatus.SUCCESSFUL).setUnavailableSkus(linkedHashSet).setProductData(hashMap).build());
        return true;
    }

    private com.amazon.device.iap.model.Product a(java.lang.String str, java.util.Map map) throws java.lang.IllegalArgumentException {
        java.lang.String str2 = (java.lang.String) map.get(str);
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str2);
            com.amazon.device.iap.model.ProductType valueOf = com.amazon.device.iap.model.ProductType.valueOf(jSONObject.getString("itemType").toUpperCase());
            java.lang.String string = jSONObject.getString("description");
            return new com.amazon.device.iap.internal.model.ProductBuilder().setSku(str).setProductType(valueOf).setDescription(string).setPrice(jSONObject.optString("price")).setSmallIconUrl(jSONObject.getString("iconUrl")).setTitle(jSONObject.getString("title")).build();
        } catch (org.json.JSONException unused) {
            throw new java.lang.IllegalArgumentException("error in parsing json string" + str2);
        }
    }
}
