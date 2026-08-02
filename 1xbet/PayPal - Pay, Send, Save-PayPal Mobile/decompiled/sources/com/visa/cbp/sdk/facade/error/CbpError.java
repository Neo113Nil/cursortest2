package com.visa.cbp.sdk.facade.error;

/* loaded from: classes5.dex */
public class CbpError {
    com.visa.cbp.sdk.facade.data.ApduResponse apduResponse;
    java.lang.String correlationId;
    int errorCode;
    java.lang.String errorMessage;
    com.visa.cbp.sdk.facade.error.ReasonCode reasonCode;

    public CbpError(int i, java.lang.String str, com.visa.cbp.sdk.facade.error.ReasonCode reasonCode, java.lang.String str2) {
        this.errorCode = 0;
        this.errorMessage = "";
        this.correlationId = "";
        com.visa.cbp.sdk.facade.error.ReasonCode reasonCode2 = com.visa.cbp.sdk.facade.error.ReasonCode.UNKNOWN_ERROR;
        this.apduResponse = null;
        this.errorCode = i;
        this.errorMessage = str;
        this.reasonCode = reasonCode;
        this.correlationId = str2;
    }

    public CbpError(int i, java.lang.String str, com.visa.cbp.sdk.facade.error.ReasonCode reasonCode, java.lang.String str2, com.visa.cbp.sdk.facade.data.ApduResponse apduResponse) {
        this.errorCode = 0;
        this.errorMessage = "";
        this.correlationId = "";
        com.visa.cbp.sdk.facade.error.ReasonCode reasonCode2 = com.visa.cbp.sdk.facade.error.ReasonCode.UNKNOWN_ERROR;
        this.errorCode = i;
        this.errorMessage = str;
        this.reasonCode = reasonCode;
        this.correlationId = str2;
        this.apduResponse = apduResponse;
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    public java.lang.String getErrorMessage() {
        return this.errorMessage;
    }

    public com.visa.cbp.sdk.facade.error.ReasonCode getReasonCode() {
        return this.reasonCode;
    }

    public java.lang.String getCorrelationId() {
        return this.correlationId;
    }

    public com.visa.cbp.sdk.facade.data.ApduResponse getApduResponse() {
        return this.apduResponse;
    }
}
