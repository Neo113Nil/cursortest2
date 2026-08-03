package com.amazon.device.iap.internal.model;

/* loaded from: classes2.dex */
public class ProductDataResponseBuilder {
    private java.util.Map<java.lang.String, com.amazon.device.iap.model.Product> productData;
    private com.amazon.device.iap.model.RequestId requestId;
    private com.amazon.device.iap.model.ProductDataResponse.RequestStatus requestStatus;
    private java.util.Set<java.lang.String> unavailableSkus;

    public com.amazon.device.iap.model.ProductDataResponse build() {
        return new com.amazon.device.iap.model.ProductDataResponse(this);
    }

    public com.amazon.device.iap.internal.model.ProductDataResponseBuilder setRequestId(com.amazon.device.iap.model.RequestId requestId) {
        this.requestId = requestId;
        return this;
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

    public com.amazon.device.iap.internal.model.ProductDataResponseBuilder setUnavailableSkus(java.util.Set<java.lang.String> set) {
        this.unavailableSkus = set;
        return this;
    }

    public com.amazon.device.iap.internal.model.ProductDataResponseBuilder setRequestStatus(com.amazon.device.iap.model.ProductDataResponse.RequestStatus requestStatus) {
        this.requestStatus = requestStatus;
        return this;
    }

    public com.amazon.device.iap.internal.model.ProductDataResponseBuilder setProductData(java.util.Map<java.lang.String, com.amazon.device.iap.model.Product> map) {
        this.productData = map;
        return this;
    }
}
