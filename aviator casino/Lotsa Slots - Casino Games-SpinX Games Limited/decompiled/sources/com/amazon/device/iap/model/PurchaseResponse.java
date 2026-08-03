package com.amazon.device.iap.model;

/* loaded from: classes2.dex */
public final class PurchaseResponse {
    private static final java.lang.String RECEIPT = "receipt";
    private static final java.lang.String REQUEST_ID = "requestId";
    private static final java.lang.String REQUEST_STATUS = "requestStatus";
    private static final java.lang.String TO_STRING_FORMAT = "(%s, requestId: \"%s\", purchaseRequestStatus: \"%s\", userId: \"%s\", receipt: %s)";
    private static final java.lang.String USER_DATA = "userData";
    private final com.amazon.device.iap.model.Receipt receipt;
    private final com.amazon.device.iap.model.RequestId requestId;
    private final com.amazon.device.iap.model.PurchaseResponse.RequestStatus requestStatus;
    private final com.amazon.device.iap.model.UserData userData;

    public enum RequestStatus {
        SUCCESSFUL,
        FAILED,
        INVALID_SKU,
        ALREADY_PURCHASED,
        NOT_SUPPORTED;

        public static com.amazon.device.iap.model.PurchaseResponse.RequestStatus safeValueOf(java.lang.String str) {
            if (com.amazon.device.iap.internal.util.d.a(str)) {
                return null;
            }
            if ("ALREADY_ENTITLED".equalsIgnoreCase(str)) {
                return ALREADY_PURCHASED;
            }
            return valueOf(str.toUpperCase());
        }
    }

    public PurchaseResponse(com.amazon.device.iap.internal.model.PurchaseResponseBuilder purchaseResponseBuilder) {
        com.amazon.device.iap.internal.util.d.a(purchaseResponseBuilder.getRequestId(), REQUEST_ID);
        com.amazon.device.iap.internal.util.d.a(purchaseResponseBuilder.getRequestStatus(), REQUEST_STATUS);
        if (purchaseResponseBuilder.getRequestStatus() == com.amazon.device.iap.model.PurchaseResponse.RequestStatus.SUCCESSFUL) {
            com.amazon.device.iap.internal.util.d.a(purchaseResponseBuilder.getReceipt(), RECEIPT);
            com.amazon.device.iap.internal.util.d.a(purchaseResponseBuilder.getUserData(), USER_DATA);
        }
        this.requestId = purchaseResponseBuilder.getRequestId();
        this.userData = purchaseResponseBuilder.getUserData();
        this.receipt = purchaseResponseBuilder.getReceipt();
        this.requestStatus = purchaseResponseBuilder.getRequestStatus();
    }

    public com.amazon.device.iap.model.RequestId getRequestId() {
        return this.requestId;
    }

    public com.amazon.device.iap.model.UserData getUserData() {
        return this.userData;
    }

    public com.amazon.device.iap.model.Receipt getReceipt() {
        return this.receipt;
    }

    public com.amazon.device.iap.model.PurchaseResponse.RequestStatus getRequestStatus() {
        return this.requestStatus;
    }

    public java.lang.String toString() {
        java.lang.Object[] objArr = new java.lang.Object[5];
        objArr[0] = super.toString();
        objArr[1] = this.requestId;
        com.amazon.device.iap.model.PurchaseResponse.RequestStatus requestStatus = this.requestStatus;
        objArr[2] = requestStatus != null ? requestStatus.toString() : kotlinx.serialization.json.internal.AbstractJsonLexerKt.NULL;
        objArr[3] = this.userData;
        objArr[4] = this.receipt;
        return java.lang.String.format(TO_STRING_FORMAT, objArr);
    }

    public org.json.JSONObject toJSON() throws org.json.JSONException {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put(REQUEST_ID, this.requestId);
        jSONObject.put(REQUEST_STATUS, this.requestStatus);
        com.amazon.device.iap.model.UserData userData = this.userData;
        jSONObject.put(USER_DATA, userData != null ? userData.toJSON() : "");
        jSONObject.put(RECEIPT, getReceipt() != null ? getReceipt().toJSON() : "");
        return jSONObject;
    }
}
