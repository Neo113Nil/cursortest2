package com.visa.cbp.sdk.facade.exception;

/* loaded from: classes5.dex */
public class InvalidInputForReplenishmentException extends com.visa.cbp.sdk.facade.exception.InvalidInputException {
    public InvalidInputForReplenishmentException(com.visa.cbp.setDeviceCerts setdevicecerts) {
        super(setdevicecerts);
    }

    public InvalidInputForReplenishmentException(com.visa.cbp.setDeviceCerts setdevicecerts, com.visa.cbp.sdk.facade.error.ReasonCode reasonCode) {
        super(setdevicecerts, reasonCode);
    }

    public InvalidInputForReplenishmentException(com.visa.cbp.setDeviceCerts setdevicecerts, java.lang.String str) {
        super(setdevicecerts, str);
    }
}
