package com.visa.cbp.sdk.facade.exception;

/* loaded from: classes5.dex */
public class TokenException extends com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException {
    public TokenException(com.visa.cbp.setDeviceCerts setdevicecerts) {
        super(setdevicecerts);
    }

    public TokenException(com.visa.cbp.setDeviceCerts setdevicecerts, com.visa.cbp.sdk.facade.error.ReasonCode reasonCode) {
        super(setdevicecerts, reasonCode);
    }

    public TokenException(com.visa.cbp.setDeviceCerts setdevicecerts, java.lang.String str) {
        super(setdevicecerts, str);
    }
}
