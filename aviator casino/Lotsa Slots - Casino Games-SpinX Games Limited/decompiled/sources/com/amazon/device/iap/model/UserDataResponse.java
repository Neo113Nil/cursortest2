package com.amazon.device.iap.model;

/* loaded from: classes2.dex */
public final class UserDataResponse {
    private static final java.lang.String REQUEST_ID = "REQUEST_ID";
    private static final java.lang.String REQUEST_STATUS = "REQUEST_STATUS";
    private static final java.lang.String TO_STRING_FORMAT = "(%s, requestId: \"%s\", requestStatus: \"%s\", userData: \"%s\")";
    private static final java.lang.String USER_DATA = "USER_DATA";
    private final com.amazon.device.iap.model.RequestId requestId;
    private final com.amazon.device.iap.model.UserDataResponse.RequestStatus requestStatus;
    private final com.amazon.device.iap.model.UserData userData;

    public enum RequestStatus {
        SUCCESSFUL,
        FAILED,
        NOT_SUPPORTED
    }

    public UserDataResponse(com.amazon.device.iap.internal.model.UserDataResponseBuilder userDataResponseBuilder) {
        com.amazon.device.iap.internal.util.d.a(userDataResponseBuilder.getRequestId(), "requestId");
        com.amazon.device.iap.internal.util.d.a(userDataResponseBuilder.getRequestStatus(), "requestStatus");
        this.requestId = userDataResponseBuilder.getRequestId();
        this.requestStatus = userDataResponseBuilder.getRequestStatus();
        this.userData = userDataResponseBuilder.getUserData();
    }

    public com.amazon.device.iap.model.RequestId getRequestId() {
        return this.requestId;
    }

    public com.amazon.device.iap.model.UserDataResponse.RequestStatus getRequestStatus() {
        return this.requestStatus;
    }

    public com.amazon.device.iap.model.UserData getUserData() {
        return this.userData;
    }

    public java.lang.String toString() {
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = super.toString();
        objArr[1] = this.requestId;
        com.amazon.device.iap.model.UserDataResponse.RequestStatus requestStatus = this.requestStatus;
        java.lang.String str = kotlinx.serialization.json.internal.AbstractJsonLexerKt.NULL;
        objArr[2] = requestStatus != null ? requestStatus.toString() : kotlinx.serialization.json.internal.AbstractJsonLexerKt.NULL;
        com.amazon.device.iap.model.UserData userData = this.userData;
        if (userData != null) {
            str = userData.toString();
        }
        objArr[3] = str;
        return java.lang.String.format(TO_STRING_FORMAT, objArr);
    }

    public org.json.JSONObject toJSON() throws org.json.JSONException {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put(REQUEST_ID, this.requestId);
        jSONObject.put(REQUEST_STATUS, this.requestStatus);
        com.amazon.device.iap.model.UserData userData = this.userData;
        jSONObject.put(USER_DATA, userData != null ? userData.toJSON() : "");
        return jSONObject;
    }
}
