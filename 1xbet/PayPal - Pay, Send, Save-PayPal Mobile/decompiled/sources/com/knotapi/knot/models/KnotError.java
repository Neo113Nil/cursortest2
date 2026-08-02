package com.knotapi.knot.models;

/* loaded from: classes9.dex */
public enum KnotError {
    INVALID_SESSION("Invalid_Session", "The session is invalid."),
    EXPIRED_SESSION("Expired_Session", "The session has expired."),
    INVALID_CLIENT_ID("Invalid_Client_Id", "The client ID is invalid."),
    INTERNAL_ERROR("Internal_Error", "An internal error occurred."),
    INVALID_CARD_NAME("Invalid_Card_Name", "The card name is invalid."),
    INVALID_CUSTOMER_NAME("Invalid_Customer_Name", "The customer name is invalid."),
    INVALID_LOGO_ID("Invalid_Logo_Id", "The logo ID is invalid."),
    MERCHANT_ID_NOT_FOUND("Merchant_Id_Not_Found", "The merchant ID is required when product type = transaction_link.");

    private final java.lang.String errorCode;
    private final java.lang.String errorDescription;

    KnotError(java.lang.String str, java.lang.String str2) {
        this.errorCode = str;
        this.errorDescription = str2;
    }

    public final java.lang.String getErrorCode() {
        return this.errorCode;
    }

    public final java.lang.String getErrorDescription() {
        return this.errorDescription;
    }
}
