package com.gemalto.mfs.mwsdk.provisioning.model;

/* loaded from: classes8.dex */
public interface KnownMessageCode {
    public static final java.lang.String MSG_PAYMENT_INVALID_CRYPTOGRAM = "CBP.error.invalidCryptogram";
    public static final java.lang.String MSG_PAYMENT_PIN_LOCKED = "CBP.error.pinLocked";
    public static final java.lang.String MSG_PAYMENT_TRANSACTION_APPROVED = "CBP.info.paymentAccepted";
    public static final java.lang.String MSG_PAYMENT_WRONG_PIN = "CBP.error.wrongPIN";
    public static final java.lang.String MSG_PIN_CHANGE_SUCCESSFUL = "CBP.info.tokenPINChanged";
    public static final java.lang.String REQUEST_DELETE_CARD = "CBP.info.tokenDeleted";
    public static final java.lang.String REQUEST_INSTALL_CARD = "CBP.info.tokenProvisioned";
    public static final java.lang.String REQUEST_RENEW_CARD = "CBP.info.tokenRenewed";
    public static final java.lang.String REQUEST_RENEW_ODA_CERT = "CBP.info.tokenODACertRenewed";
    public static final java.lang.String REQUEST_REPLENISH_KEYS = "CBP.info.tokenReplenished";
    public static final java.lang.String REQUEST_RESUME_CARD = "CBP.info.tokenResumed";
    public static final java.lang.String REQUEST_SUSPEND_CARD = "CBP.info.tokenSuspended";
}
