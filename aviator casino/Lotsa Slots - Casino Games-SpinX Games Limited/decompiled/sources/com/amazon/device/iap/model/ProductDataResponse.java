package com.amazon.device.iap.model;

/* loaded from: classes2.dex */
public class ProductDataResponse {
    private static final java.lang.String PRODUCT_DATA = "productData";
    private static final java.lang.String REQUEST_ID = "requestId";
    private static final java.lang.String REQUEST_STATUS = "requestStatus";
    private static final java.lang.String TO_STRING_FORMAT = "(%s, requestId: \"%s\", unavailableSkus: %s, requestStatus: \"%s\", productData: %s)";
    private static final java.lang.String UNAVAILABLE_SKUS = "UNAVAILABLE_SKUS";
    private final java.util.Map<java.lang.String, com.amazon.device.iap.model.Product> productData;
    private final com.amazon.device.iap.model.RequestId requestId;
    private final com.amazon.device.iap.model.ProductDataResponse.RequestStatus requestStatus;
    private final java.util.Set<java.lang.String> unavailableSkus;

    public enum RequestStatus {
        SUCCESSFUL,
        FAILED,
        NOT_SUPPORTED
    }

    public ProductDataResponse(com.amazon.device.iap.internal.model.ProductDataResponseBuilder productDataResponseBuilder) {
        com.amazon.device.iap.internal.util.d.a(productDataResponseBuilder.getRequestId(), REQUEST_ID);
        com.amazon.device.iap.internal.util.d.a(productDataResponseBuilder.getRequestStatus(), REQUEST_STATUS);
        if (productDataResponseBuilder.getUnavailableSkus() == null) {
            productDataResponseBuilder.setUnavailableSkus(new java.util.HashSet());
        }
        if (com.amazon.device.iap.model.ProductDataResponse.RequestStatus.SUCCESSFUL == productDataResponseBuilder.getRequestStatus()) {
            com.amazon.device.iap.internal.util.d.a(productDataResponseBuilder.getProductData(), PRODUCT_DATA);
        }
        this.requestId = productDataResponseBuilder.getRequestId();
        this.requestStatus = productDataResponseBuilder.getRequestStatus();
        this.unavailableSkus = productDataResponseBuilder.getUnavailableSkus();
        this.productData = productDataResponseBuilder.getProductData();
    }

    public com.amazon.device.iap.model.RequestId getRequestId() {
        return this.requestId;
    }

    public java.util.Set<java.lang.String> getUnavailableSkus() {
        return this.unavailableSkus;
    }

    public com.amazon.device.iap.model.ProductDataResponse.RequestStatus getRequestStatus() {
        return this.requestStatus;
    }

    public java.util.Map<java.lang.String, com.amazon.device.iap.model.Product> getProductData() {
        return this.productData;
    }

    public java.lang.String toString() {
        java.lang.Object[] objArr = new java.lang.Object[5];
        objArr[0] = super.toString();
        objArr[1] = this.requestId;
        java.util.Set<java.lang.String> set = this.unavailableSkus;
        java.lang.String str = kotlinx.serialization.json.internal.AbstractJsonLexerKt.NULL;
        objArr[2] = set != null ? set.toString() : kotlinx.serialization.json.internal.AbstractJsonLexerKt.NULL;
        com.amazon.device.iap.model.ProductDataResponse.RequestStatus requestStatus = this.requestStatus;
        objArr[3] = requestStatus != null ? requestStatus.toString() : kotlinx.serialization.json.internal.AbstractJsonLexerKt.NULL;
        java.util.Map<java.lang.String, com.amazon.device.iap.model.Product> map = this.productData;
        if (map != null) {
            str = map.toString();
        }
        objArr[4] = str;
        return java.lang.String.format(TO_STRING_FORMAT, objArr);
    }

    public org.json.JSONObject toJSON() throws org.json.JSONException {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put(REQUEST_ID, this.requestId);
        jSONObject.put(UNAVAILABLE_SKUS, this.unavailableSkus);
        jSONObject.put(REQUEST_STATUS, this.requestStatus);
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        java.util.Map<java.lang.String, com.amazon.device.iap.model.Product> map = this.productData;
        if (map != null) {
            for (java.lang.String str : map.keySet()) {
                jSONObject2.put(str, this.productData.get(str).toJSON());
            }
        }
        jSONObject.put(PRODUCT_DATA, jSONObject2);
        return jSONObject;
    }
}
