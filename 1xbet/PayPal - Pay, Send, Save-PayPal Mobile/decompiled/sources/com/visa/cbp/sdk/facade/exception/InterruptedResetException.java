package com.visa.cbp.sdk.facade.exception;

/* loaded from: classes5.dex */
public class InterruptedResetException extends com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException {
    public InterruptedResetException(com.visa.cbp.setDeviceCerts setdevicecerts, com.visa.cbp.sdk.facade.error.ReasonCode reasonCode) {
        super(setdevicecerts, reasonCode, "");
    }

    public InterruptedResetException(com.visa.cbp.setDeviceCerts setdevicecerts, com.visa.cbp.sdk.facade.error.ReasonCode reasonCode, java.lang.String str) {
        super(setdevicecerts, reasonCode, str);
    }

    public InterruptedResetException(com.visa.cbp.setDeviceCerts setdevicecerts, com.visa.cbp.sdk.facade.error.CbpError cbpError) {
        super(setdevicecerts);
        this.cbpError = cbpError;
    }
}
