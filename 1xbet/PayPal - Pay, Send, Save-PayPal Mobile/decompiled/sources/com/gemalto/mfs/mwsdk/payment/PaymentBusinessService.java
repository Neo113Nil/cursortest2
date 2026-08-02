package com.gemalto.mfs.mwsdk.payment;

/* loaded from: classes3.dex */
public interface PaymentBusinessService extends com.gemalto.mfs.mwsdk.sdkconfig.BusinessService {
    void activate(com.gemalto.mfs.mwsdk.dcm.DigitalizedCard digitalizedCard, com.gemalto.mfs.mwsdk.dcm.PaymentType paymentType, com.gemalto.mfs.mwsdk.payment.PaymentServiceListener paymentServiceListener);

    void activate(com.gemalto.mfs.mwsdk.dcm.PaymentType paymentType, com.gemalto.mfs.mwsdk.payment.PaymentServiceListener paymentServiceListener);

    @java.lang.Deprecated
    void activateCard(java.lang.String str, com.gemalto.mfs.mwsdk.dcm.PaymentType paymentType, com.gemalto.mfs.mwsdk.payment.PaymentServiceListener paymentServiceListener, com.gemalto.mfs.mwsdk.payment.engine.CardActivationListener cardActivationListener);

    void activateNonDefaultCard(java.lang.String str, com.gemalto.mfs.mwsdk.dcm.PaymentType paymentType, com.gemalto.mfs.mwsdk.payment.PaymentServiceListener paymentServiceListener, com.gemalto.mfs.mwsdk.payment.engine.CardActivationListener cardActivationListener);

    void activateNonDefaultCard(java.lang.String str, com.gemalto.mfs.mwsdk.dcm.PaymentType paymentType, boolean z, com.gemalto.mfs.mwsdk.payment.PaymentServiceListener paymentServiceListener, com.gemalto.mfs.mwsdk.payment.engine.CardActivationListener cardActivationListener);

    void deactivate();

    void generateApplicationCryptogram(com.gemalto.mfs.mwsdk.dcm.DigitalizedCard digitalizedCard, com.gemalto.mfs.mwsdk.dcm.PaymentType paymentType, com.gemalto.mfs.mwsdk.payment.engine.PaymentInputData paymentInputData, com.gemalto.mfs.mwsdk.payment.PaymentServiceListener paymentServiceListener);

    void generateApplicationCryptogram(com.gemalto.mfs.mwsdk.dcm.PaymentType paymentType, com.gemalto.mfs.mwsdk.payment.engine.PaymentInputData paymentInputData, com.gemalto.mfs.mwsdk.payment.PaymentServiceListener paymentServiceListener);

    @java.lang.Deprecated
    void generateQRCodePaymentData(java.lang.String str, com.gemalto.mfs.mwsdk.payment.PaymentServiceListener paymentServiceListener);

    com.gemalto.mfs.mwsdk.payment.engine.PaymentService getActivatedPaymentService();

    @java.lang.Deprecated
    void getAuthenticationFlowPriorToPayment(com.gemalto.mfs.mwsdk.payment.PaymentServiceListener paymentServiceListener, com.gemalto.mfs.mwsdk.dcm.PaymentType paymentType);

    void startAuthentication(com.gemalto.mfs.mwsdk.payment.PaymentServiceListener paymentServiceListener, com.gemalto.mfs.mwsdk.dcm.PaymentType paymentType);
}
