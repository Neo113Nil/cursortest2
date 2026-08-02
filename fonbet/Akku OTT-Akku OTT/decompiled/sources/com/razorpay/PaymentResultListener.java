package com.razorpay;

/* loaded from: classes4.dex */
public interface PaymentResultListener {
    void onPaymentError(int i, String str);

    void onPaymentSuccess(String str);
}
