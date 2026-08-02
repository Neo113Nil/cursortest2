package com.visa.cbp.sdk.facade.exception;

/* loaded from: classes5.dex */
public class InvalidTokenStateException extends com.visa.cbp.sdk.facade.exception.TokenException {
    public InvalidTokenStateException(com.visa.cbp.setDeviceCerts setdevicecerts) {
        super(setdevicecerts);
    }

    public InvalidTokenStateException(com.visa.cbp.setDeviceCerts setdevicecerts, com.visa.cbp.sdk.facade.error.ReasonCode reasonCode) {
        super(setdevicecerts, reasonCode);
    }

    public InvalidTokenStateException(com.visa.cbp.setDeviceCerts setdevicecerts, java.lang.String str) {
        super(setdevicecerts, str);
    }
}
