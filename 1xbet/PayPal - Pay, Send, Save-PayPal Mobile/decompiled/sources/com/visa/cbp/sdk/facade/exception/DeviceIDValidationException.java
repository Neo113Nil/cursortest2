package com.visa.cbp.sdk.facade.exception;

/* loaded from: classes5.dex */
public class DeviceIDValidationException extends com.visa.cbp.sdk.facade.exception.InvalidInputException {
    public DeviceIDValidationException(com.visa.cbp.setDeviceCerts setdevicecerts) {
        super(setdevicecerts);
    }

    public DeviceIDValidationException(com.visa.cbp.setDeviceCerts setdevicecerts, java.lang.String str) {
        super(setdevicecerts, str);
    }
}
