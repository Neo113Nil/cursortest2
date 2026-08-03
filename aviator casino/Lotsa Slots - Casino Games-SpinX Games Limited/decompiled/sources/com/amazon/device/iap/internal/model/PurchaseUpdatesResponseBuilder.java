package com.amazon.device.iap.internal.model;

/* loaded from: classes2.dex */
public class PurchaseUpdatesResponseBuilder {
    private boolean hasMore;
    private java.util.List<com.amazon.device.iap.model.Receipt> receipts;
    private com.amazon.device.iap.model.RequestId requestId;
    private com.amazon.device.iap.model.PurchaseUpdatesResponse.RequestStatus requestStatus;
    private com.amazon.device.iap.model.UserData userData;

    public com.amazon.device.iap.model.RequestId getRequestId() {
        return this.requestId;
    }

    public com.amazon.device.iap.model.PurchaseUpdatesResponse.RequestStatus getRequestStatus() {
        return this.requestStatus;
    }

    public com.amazon.device.iap.model.UserData getUserData() {
        return this.userData;
    }

    public java.util.List<com.amazon.device.iap.model.Receipt> getReceipts() {
        return this.receipts;
    }

    public boolean hasMore() {
        return this.hasMore;
    }

    public com.amazon.device.iap.model.PurchaseUpdatesResponse build() {
        return new com.amazon.device.iap.model.PurchaseUpdatesResponse(this);
    }

    public com.amazon.device.iap.internal.model.PurchaseUpdatesResponseBuilder setRequestId(com.amazon.device.iap.model.RequestId requestId) {
        this.requestId = requestId;
        return this;
    }

    public com.amazon.device.iap.internal.model.PurchaseUpdatesResponseBuilder setRequestStatus(com.amazon.device.iap.model.PurchaseUpdatesResponse.RequestStatus requestStatus) {
        this.requestStatus = requestStatus;
        return this;
    }

    public com.amazon.device.iap.internal.model.PurchaseUpdatesResponseBuilder setUserData(com.amazon.device.iap.model.UserData userData) {
        this.userData = userData;
        return this;
    }

    public com.amazon.device.iap.internal.model.PurchaseUpdatesResponseBuilder setReceipts(java.util.List<com.amazon.device.iap.model.Receipt> list) {
        this.receipts = list;
        return this;
    }

    public com.amazon.device.iap.internal.model.PurchaseUpdatesResponseBuilder setHasMore(boolean z) {
        this.hasMore = z;
        return this;
    }
}
