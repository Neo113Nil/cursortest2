package com.amazon.device.iap.internal.model;

/* loaded from: classes2.dex */
public class UserDataResponseBuilder {
    private com.amazon.device.iap.model.RequestId requestId;
    private com.amazon.device.iap.model.UserDataResponse.RequestStatus requestStatus;
    private com.amazon.device.iap.model.UserData userData;

    public com.amazon.device.iap.model.RequestId getRequestId() {
        return this.requestId;
    }

    public com.amazon.device.iap.model.UserDataResponse.RequestStatus getRequestStatus() {
        return this.requestStatus;
    }

    public com.amazon.device.iap.model.UserData getUserData() {
        return this.userData;
    }

    public com.amazon.device.iap.model.UserDataResponse build() {
        return new com.amazon.device.iap.model.UserDataResponse(this);
    }

    public com.amazon.device.iap.internal.model.UserDataResponseBuilder setRequestId(com.amazon.device.iap.model.RequestId requestId) {
        this.requestId = requestId;
        return this;
    }

    public com.amazon.device.iap.internal.model.UserDataResponseBuilder setRequestStatus(com.amazon.device.iap.model.UserDataResponse.RequestStatus requestStatus) {
        this.requestStatus = requestStatus;
        return this;
    }

    public com.amazon.device.iap.internal.model.UserDataResponseBuilder setUserData(com.amazon.device.iap.model.UserData userData) {
        this.userData = userData;
        return this;
    }
}
