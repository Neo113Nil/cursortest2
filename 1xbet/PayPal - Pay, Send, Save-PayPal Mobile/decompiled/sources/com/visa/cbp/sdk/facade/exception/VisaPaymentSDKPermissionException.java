package com.visa.cbp.sdk.facade.exception;

/* loaded from: classes16.dex */
public class VisaPaymentSDKPermissionException extends com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException {

    @java.lang.Deprecated
    private int errorCode;

    @java.lang.Deprecated
    private com.visa.cbp.sdk.facade.error.ReasonCode reasonCode;

    public VisaPaymentSDKPermissionException(com.visa.cbp.setDeviceCerts setdevicecerts, com.visa.cbp.sdk.facade.error.ReasonCode reasonCode) {
        super(setdevicecerts, reasonCode);
        this.errorCode = setdevicecerts.BuildConfig();
        this.reasonCode = reasonCode;
    }

    @java.lang.Deprecated
    public int getErrorCode() {
        return this.errorCode;
    }

    @java.lang.Deprecated
    public com.visa.cbp.sdk.facade.error.ReasonCode getReasonCode() {
        return this.reasonCode;
    }
}
