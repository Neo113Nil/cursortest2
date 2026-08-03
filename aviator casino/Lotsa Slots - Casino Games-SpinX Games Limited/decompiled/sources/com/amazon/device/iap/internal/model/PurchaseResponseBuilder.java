package com.amazon.device.iap.internal.model;

/* loaded from: classes2.dex */
public class PurchaseResponseBuilder {
    private com.amazon.device.iap.model.Receipt receipt;
    private com.amazon.device.iap.model.RequestId requestId;
    private com.amazon.device.iap.model.PurchaseResponse.RequestStatus requestStatus;
    private com.amazon.device.iap.model.UserData userData;

    public com.amazon.device.iap.model.PurchaseResponse build() {
        return new com.amazon.device.iap.model.PurchaseResponse(this);
    }

    public com.amazon.device.iap.model.RequestId getRequestId() {
        return this.requestId;
    }

    public com.amazon.device.iap.model.PurchaseResponse.RequestStatus getRequestStatus() {
        return this.requestStatus;
    }

    public com.amazon.device.iap.model.UserData getUserData() {
        return this.userData;
    }

    public com.amazon.device.iap.model.Receipt getReceipt() {
        return this.receipt;
    }

    public com.amazon.device.iap.internal.model.PurchaseResponseBuilder setRequestId(com.amazon.device.iap.model.RequestId requestId) {
        this.requestId = requestId;
        return this;
    }

    public com.amazon.device.iap.internal.model.PurchaseResponseBuilder setRequestStatus(com.amazon.device.iap.model.PurchaseResponse.RequestStatus requestStatus) {
        this.requestStatus = requestStatus;
        return this;
    }

    public com.amazon.device.iap.internal.model.PurchaseResponseBuilder setUserData(com.amazon.device.iap.model.UserData userData) {
        this.userData = userData;
        return this;
    }

    public com.amazon.device.iap.internal.model.PurchaseResponseBuilder setReceipt(com.amazon.device.iap.model.Receipt receipt) {
        this.receipt = receipt;
        return this;
    }
}
