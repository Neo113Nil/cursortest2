package com.razorpay;

/* loaded from: classes4.dex */
public interface PaymentResultWithDataListener {
    void onPaymentError(int i, String str, PaymentData paymentData);

    void onPaymentSuccess(String str, PaymentData paymentData);
}
