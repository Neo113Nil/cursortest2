package com.visa.cbp.sdk.facade.exception;

/* loaded from: classes5.dex */
public class VisaPaymentSDKException extends java.lang.RuntimeException {
    protected com.visa.cbp.sdk.facade.error.CbpError cbpError;

    public VisaPaymentSDKException(java.lang.Throwable th) {
        super(th);
        this.cbpError = com.visa.cbp.sdk.facade.error.CBPErrorFactoryCommons.error(com.visa.cbp.setDeviceCerts.setCertValue, com.visa.cbp.sdk.facade.error.ReasonCode.SDK_EXCEPTION);
    }

    public VisaPaymentSDKException(com.visa.cbp.setDeviceCerts setdevicecerts) {
        super(setdevicecerts.valueOf());
        this.cbpError = com.visa.cbp.sdk.facade.error.CBPErrorFactoryCommons.error(setdevicecerts, com.visa.cbp.sdk.facade.error.ReasonCode.SDK_EXCEPTION);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public VisaPaymentSDKException(com.visa.cbp.setDeviceCerts setdevicecerts, com.visa.cbp.setFirstName setfirstname) {
        super(r0.toString());
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(setdevicecerts.valueOf());
        sb.append(setfirstname.valueOf());
        this.cbpError = com.visa.cbp.sdk.facade.error.CBPErrorFactoryCommons.error(setdevicecerts, com.visa.cbp.sdk.facade.error.ReasonCode.SDK_EXCEPTION);
    }

    public VisaPaymentSDKException(com.visa.cbp.setDeviceCerts setdevicecerts, com.visa.cbp.sdk.facade.error.ReasonCode reasonCode) {
        super(setdevicecerts.valueOf());
        this.cbpError = com.visa.cbp.sdk.facade.error.CBPErrorFactoryCommons.error(setdevicecerts, reasonCode);
    }

    public VisaPaymentSDKException(com.visa.cbp.setDeviceCerts setdevicecerts, java.lang.String str) {
        super(setdevicecerts.ConfirmReplenishRequest(str));
        this.cbpError = com.visa.cbp.sdk.facade.error.CBPErrorFactoryCommons.error(setdevicecerts, str, com.visa.cbp.sdk.facade.error.ReasonCode.SDK_EXCEPTION);
    }

    public VisaPaymentSDKException(com.visa.cbp.setDeviceCerts setdevicecerts, java.lang.String str, java.lang.String str2) {
        super(setdevicecerts.ConfirmReplenishRequest(str));
        this.cbpError = com.visa.cbp.sdk.facade.error.CBPErrorFactoryCommons.error(setdevicecerts, str, com.visa.cbp.sdk.facade.error.ReasonCode.SDK_EXCEPTION, str2);
    }

    public VisaPaymentSDKException(com.visa.cbp.setDeviceCerts setdevicecerts, com.visa.cbp.sdk.facade.error.CbpError cbpError, int i) {
        super(setdevicecerts.BuildConfig(i));
        this.cbpError = cbpError;
    }

    public VisaPaymentSDKException(com.visa.cbp.setDeviceCerts setdevicecerts, com.visa.cbp.sdk.facade.error.ReasonCode reasonCode, java.lang.String str) {
        super(setdevicecerts.ConfirmReplenishRequest(str));
        this.cbpError = com.visa.cbp.sdk.facade.error.CBPErrorFactoryCommons.error(setdevicecerts, reasonCode);
    }

    public com.visa.cbp.sdk.facade.error.CbpError getCbpError() {
        return this.cbpError;
    }
}
