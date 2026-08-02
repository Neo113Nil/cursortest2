package com.visa.cbp.sdk.facade.exception;

/* loaded from: classes5.dex */
public class InvalidInputException extends com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException {
    public InvalidInputException(com.visa.cbp.setDeviceCerts setdevicecerts) {
        super(setdevicecerts);
    }

    public InvalidInputException(com.visa.cbp.setDeviceCerts setdevicecerts, com.visa.cbp.sdk.facade.error.ReasonCode reasonCode) {
        super(setdevicecerts, reasonCode);
    }

    public InvalidInputException(com.visa.cbp.setDeviceCerts setdevicecerts, java.lang.String str) {
        super(setdevicecerts, str);
    }
}
