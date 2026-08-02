package com.visa.cbp.sdk.facade.exception;

/* loaded from: classes16.dex */
public class FileAccessException extends com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException {
    private int errorCode;

    public FileAccessException(com.visa.cbp.setDeviceCerts setdevicecerts) {
        super(setdevicecerts);
    }

    public FileAccessException(com.visa.cbp.setDeviceCerts setdevicecerts, com.visa.cbp.sdk.facade.error.ReasonCode reasonCode) {
        super(setdevicecerts, reasonCode);
        this.errorCode = setdevicecerts.BuildConfig();
    }

    public FileAccessException(com.visa.cbp.setDeviceCerts setdevicecerts, com.visa.cbp.sdk.facade.error.ReasonCode reasonCode, java.lang.String str) {
        super(setdevicecerts, reasonCode, str);
        this.errorCode = setdevicecerts.BuildConfig();
    }
}
