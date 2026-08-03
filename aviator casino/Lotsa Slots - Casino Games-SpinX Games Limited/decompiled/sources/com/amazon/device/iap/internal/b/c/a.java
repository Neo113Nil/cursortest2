package com.amazon.device.iap.internal.b.c;

/* compiled from: GetItemDataCommandV2.java */
/* loaded from: classes2.dex */
public final class a extends com.amazon.device.iap.internal.b.c.c {
    private static final java.lang.String b = "a";

    public a(com.amazon.device.iap.internal.b.e eVar, java.util.Set<java.lang.String> set) {
        super(eVar, com.ironsource.M6.k0, set);
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
                    java.lang.String str2 = (java.lang.String) data.get(str);
                    java.lang.String c = c();
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    java.lang.String str3 = b;
                    sb.append(str3);
                    sb.append(".onResult()");
                    com.amazon.device.iap.internal.util.MetricsHelper.submitJsonParsingExceptionMetrics(c, str2, sb.toString());
                    com.amazon.device.iap.internal.util.e.b(str3, "Error parsing JSON for SKU " + str + ": " + e.getMessage());
                }
            }
        }
        com.amazon.device.iap.internal.b.e b2 = b();
        b2.d().a(new com.amazon.device.iap.internal.model.ProductDataResponseBuilder().setRequestId(b2.c()).setRequestStatus(com.amazon.device.iap.model.ProductDataResponse.RequestStatus.SUCCESSFUL).setUnavailableSkus(linkedHashSet).setProductData(hashMap).build());
        return true;
    }

    private com.amazon.device.iap.model.Product a(java.lang.String str, java.util.Map map) throws java.lang.IllegalArgumentException {
        org.json.JSONObject optJSONObject;
        java.lang.String str2 = (java.lang.String) map.get(str);
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str2);
            com.amazon.device.iap.model.ProductType valueOf = com.amazon.device.iap.model.ProductType.valueOf(jSONObject.getString("itemType").toUpperCase());
            java.lang.String string = jSONObject.getString("description");
            java.lang.String optString = jSONObject.optString("price", null);
            if (com.amazon.device.iap.internal.util.d.a(optString) && (optJSONObject = jSONObject.optJSONObject("priceJson")) != null) {
                java.util.Currency currency = java.util.Currency.getInstance(optJSONObject.getString("currency"));
                optString = currency.getSymbol() + new java.math.BigDecimal(optJSONObject.getString("value"));
            }
            return new com.amazon.device.iap.internal.model.ProductBuilder().setSku(str).setProductType(valueOf).setDescription(string).setPrice(optString).setSmallIconUrl(jSONObject.getString("iconUrl")).setTitle(jSONObject.getString("title")).build();
        } catch (org.json.JSONException unused) {
            throw new java.lang.IllegalArgumentException("error in parsing json string" + str2);
        }
    }
}
