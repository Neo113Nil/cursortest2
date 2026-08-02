package com.google.android.gms.tapandpay.issuer;

/* loaded from: classes8.dex */
public interface PaymentCredentialsGenerator {
    java.util.concurrent.Future<com.google.android.gms.tapandpay.issuer.GeneratePaymentCredentialsResponse> generate(com.google.android.gms.tapandpay.issuer.GeneratePaymentCredentialsRequest generatePaymentCredentialsRequest);

    default boolean getAuxiliaryOpaquePaymentCardSupported() {
        return false;
    }

    default boolean getGoogleOpaquePaymentCardSupported() {
        return false;
    }

    default java.util.List<java.lang.String> getSupportedTokenRequestorIds() {
        return new java.util.ArrayList();
    }
}
