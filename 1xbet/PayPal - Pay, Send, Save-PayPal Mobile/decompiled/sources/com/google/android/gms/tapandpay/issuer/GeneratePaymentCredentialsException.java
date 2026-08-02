package com.google.android.gms.tapandpay.issuer;

/* loaded from: classes8.dex */
public class GeneratePaymentCredentialsException extends java.lang.Exception {
    public static final int UNKNOWN_ERROR = 0;
    public static final int UNSUPPORTED_TOKEN_REQUESTOR_ID = 1;
    public final int errorCode;

    /* loaded from: classes3.dex */
    public @interface ErrorCode {
    }

    public GeneratePaymentCredentialsException(int i) {
        this.errorCode = i;
    }
}
