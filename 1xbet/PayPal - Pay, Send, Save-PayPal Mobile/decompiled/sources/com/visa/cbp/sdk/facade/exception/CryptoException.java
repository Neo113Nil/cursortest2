package com.visa.cbp.sdk.facade.exception;

/* loaded from: classes5.dex */
public class CryptoException extends com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException {
    private int errorCode;

    public CryptoException(java.lang.Throwable th, com.visa.cbp.setDeviceCerts setdevicecerts, com.visa.cbp.sdk.facade.error.ReasonCode reasonCode) {
        super(th);
        this.errorCode = setdevicecerts.BuildConfig();
    }

    public CryptoException(com.visa.cbp.setDeviceCerts setdevicecerts, com.visa.cbp.sdk.facade.error.ReasonCode reasonCode) {
        super(setdevicecerts, reasonCode);
        this.errorCode = setdevicecerts.BuildConfig();
    }

    public CryptoException(com.visa.cbp.setDeviceCerts setdevicecerts, com.visa.cbp.sdk.facade.error.ReasonCode reasonCode, java.lang.String str) {
        super(setdevicecerts, reasonCode, str);
        this.errorCode = setdevicecerts.BuildConfig();
    }

    public CryptoException(com.visa.cbp.setDeviceCerts setdevicecerts, com.visa.cbp.sdk.facade.error.CbpError cbpError, int i) {
        super(setdevicecerts, cbpError, i);
    }

    @java.lang.Deprecated
    public int getErrorCode() {
        return this.errorCode;
    }

    @java.lang.Deprecated
    public void setErrorCode(int i) {
        this.errorCode = i;
    }
}
