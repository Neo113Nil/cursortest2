package com.amazon.device.iap.model;

/* loaded from: classes2.dex */
public final class PurchaseUpdatesResponse {
    private static final java.lang.String HAS_MORE = "HAS_MORE";
    private static final java.lang.String RECEIPTS = "RECEIPTS";
    private static final java.lang.String REQUEST_ID = "REQUEST_ID";
    private static final java.lang.String REQUEST_STATUS = "REQUEST_STATUS";
    private static final java.lang.String TO_STRING_FORMAT = "(%s, requestId: \"%s\", requestStatus: \"%s\", userData: \"%s\", receipts: %s, hasMore: \"%b\")";
    private static final java.lang.String USER_DATA = "USER_DATA";
    private final boolean hasMore;
    private final java.util.List<com.amazon.device.iap.model.Receipt> receipts;
    private final com.amazon.device.iap.model.RequestId requestId;
    private final com.amazon.device.iap.model.PurchaseUpdatesResponse.RequestStatus requestStatus;
    private final com.amazon.device.iap.model.UserData userData;

    public enum RequestStatus {
        SUCCESSFUL,
        FAILED,
        NOT_SUPPORTED
    }

    public PurchaseUpdatesResponse(com.amazon.device.iap.internal.model.PurchaseUpdatesResponseBuilder purchaseUpdatesResponseBuilder) {
        com.amazon.device.iap.internal.util.d.a(purchaseUpdatesResponseBuilder.getRequestId(), "requestId");
        com.amazon.device.iap.internal.util.d.a(purchaseUpdatesResponseBuilder.getRequestStatus(), "requestStatus");
        if (com.amazon.device.iap.model.PurchaseUpdatesResponse.RequestStatus.SUCCESSFUL == purchaseUpdatesResponseBuilder.getRequestStatus()) {
            com.amazon.device.iap.internal.util.d.a(purchaseUpdatesResponseBuilder.getUserData(), "userData");
            com.amazon.device.iap.internal.util.d.a((java.lang.Object) purchaseUpdatesResponseBuilder.getReceipts(), "receipts");
        }
        this.requestId = purchaseUpdatesResponseBuilder.getRequestId();
        this.requestStatus = purchaseUpdatesResponseBuilder.getRequestStatus();
        this.userData = purchaseUpdatesResponseBuilder.getUserData();
        this.receipts = purchaseUpdatesResponseBuilder.getReceipts() == null ? new java.util.ArrayList<>() : purchaseUpdatesResponseBuilder.getReceipts();
        this.hasMore = purchaseUpdatesResponseBuilder.hasMore();
    }

    public com.amazon.device.iap.model.RequestId getRequestId() {
        return this.requestId;
    }

    public com.amazon.device.iap.model.UserData getUserData() {
        return this.userData;
    }

    public com.amazon.device.iap.model.PurchaseUpdatesResponse.RequestStatus getRequestStatus() {
        return this.requestStatus;
    }

    public java.util.List<com.amazon.device.iap.model.Receipt> getReceipts() {
        return this.receipts;
    }

    public boolean hasMore() {
        return this.hasMore;
    }

    public java.lang.String toString() {
        java.lang.Object[] objArr = new java.lang.Object[6];
        objArr[0] = super.toString();
        objArr[1] = this.requestId;
        objArr[2] = this.requestStatus;
        objArr[3] = this.userData;
        java.util.List<com.amazon.device.iap.model.Receipt> list = this.receipts;
        objArr[4] = list != null ? java.util.Arrays.toString(list.toArray()) : kotlinx.serialization.json.internal.AbstractJsonLexerKt.NULL;
        objArr[5] = java.lang.Boolean.valueOf(this.hasMore);
        return java.lang.String.format(TO_STRING_FORMAT, objArr);
    }

    public org.json.JSONObject toJSON() throws org.json.JSONException {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put(REQUEST_ID, this.requestId);
        jSONObject.put(REQUEST_STATUS, this.requestStatus);
        com.amazon.device.iap.model.UserData userData = this.userData;
        jSONObject.put(USER_DATA, userData != null ? userData.toJSON() : "");
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.util.List<com.amazon.device.iap.model.Receipt> list = this.receipts;
        if (list != null) {
            java.util.Iterator<com.amazon.device.iap.model.Receipt> it = list.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next().toJSON());
            }
        }
        jSONObject.put(RECEIPTS, jSONArray);
        jSONObject.put(HAS_MORE, this.hasMore);
        return jSONObject;
    }
}
