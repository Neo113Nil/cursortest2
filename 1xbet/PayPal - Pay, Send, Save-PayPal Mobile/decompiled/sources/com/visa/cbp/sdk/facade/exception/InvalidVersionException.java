package com.visa.cbp.sdk.facade.exception;

/* loaded from: classes5.dex */
public class InvalidVersionException extends com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException {
    public InvalidVersionException(com.visa.cbp.setDeviceCerts setdevicecerts) {
        super(setdevicecerts);
    }

    public InvalidVersionException(com.visa.cbp.setDeviceCerts setdevicecerts, com.visa.cbp.sdk.facade.error.CbpError cbpError) {
        super(setdevicecerts);
        this.cbpError = cbpError;
    }
}
