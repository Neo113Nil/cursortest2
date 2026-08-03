package com.android.billingclient.api;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes2.dex */
public final class UserChoiceDetails {
    private final java.lang.String mOriginalJson;
    private final org.json.JSONObject mParsedJson;
    private final java.util.List<com.android.billingclient.api.UserChoiceDetails.Product> mProducts;

    /* compiled from: com.android.billingclient:billing@@7.0.0 */
    public static class Product {
        private final java.lang.String id;
        private final java.lang.String offerToken;
        private final java.lang.String type;

        Product(java.lang.String str, java.lang.String str2, java.lang.String str3) {
            this.id = str;
            this.type = str2;
            this.offerToken = str3;
        }

        private Product(org.json.JSONObject jSONObject) {
            this.id = jSONObject.optString(com.unity3d.ads.metadata.InAppPurchaseMetaData.KEY_PRODUCT_ID);
            this.type = jSONObject.optString(com.ironsource.X3.i.m);
            java.lang.String optString = jSONObject.optString("offerToken");
            this.offerToken = true == optString.isEmpty() ? null : optString;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.android.billingclient.api.UserChoiceDetails.Product)) {
                return false;
            }
            com.android.billingclient.api.UserChoiceDetails.Product product = (com.android.billingclient.api.UserChoiceDetails.Product) obj;
            return this.id.equals(product.getId()) && this.type.equals(product.getType()) && java.util.Objects.equals(this.offerToken, product.getOfferToken());
        }

        public java.lang.String getId() {
            return this.id;
        }

        public java.lang.String getOfferToken() {
            return this.offerToken;
        }

        public java.lang.String getType() {
            return this.type;
        }

        public int hashCode() {
            return java.util.Objects.hash(this.id, this.type, this.offerToken);
        }

        public java.lang.String toString() {
            return java.lang.String.format("{id: %s, type: %s, offer token: %s}", this.id, this.type, this.offerToken);
        }
    }

    UserChoiceDetails(java.lang.String str) throws org.json.JSONException {
        this.mOriginalJson = str;
        org.json.JSONObject jSONObject = new org.json.JSONObject(str);
        this.mParsedJson = jSONObject;
        this.mProducts = toProductList(jSONObject.optJSONArray("products"));
    }

    private static java.util.List<com.android.billingclient.api.UserChoiceDetails.Product> toProductList(org.json.JSONArray jSONArray) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                org.json.JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    arrayList.add(new com.android.billingclient.api.UserChoiceDetails.Product(optJSONObject));
                }
            }
        }
        return arrayList;
    }

    public java.lang.String getExternalTransactionToken() {
        return this.mParsedJson.optString("externalTransactionToken");
    }

    public java.lang.String getOriginalExternalTransactionId() {
        java.lang.String optString = this.mParsedJson.optString("originalExternalTransactionId");
        if (optString.isEmpty()) {
            return null;
        }
        return optString;
    }

    public java.util.List<com.android.billingclient.api.UserChoiceDetails.Product> getProducts() {
        return this.mProducts;
    }
}
