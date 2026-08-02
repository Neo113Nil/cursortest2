package com.gemalto.mfs.mwsdk.mobilegateway;

/* loaded from: classes3.dex */
public interface MGCardEnrollmentService {
    void checkCardEligibility(byte[] bArr, com.gemalto.mfs.mwsdk.mobilegateway.enrollment.InputMethod inputMethod, java.lang.String str, com.gemalto.mfs.mwsdk.mobilegateway.enrollment.WalletAccountData walletAccountData, com.gemalto.mfs.mwsdk.mobilegateway.listener.CardEligibilityListener cardEligibilityListener, java.lang.String str2);

    void checkCardEligibility(byte[] bArr, com.gemalto.mfs.mwsdk.mobilegateway.enrollment.InputMethod inputMethod, java.lang.String str, com.gemalto.mfs.mwsdk.mobilegateway.listener.CardEligibilityListener cardEligibilityListener, java.lang.String str2);

    void checkEligibility(com.gemalto.mfs.mwsdk.mobilegateway.enrollment.EligibilityData eligibilityData, com.gemalto.mfs.mwsdk.mobilegateway.enrollment.InstrumentData instrumentData, com.gemalto.mfs.mwsdk.mobilegateway.listener.CardEligibilityListener cardEligibilityListener);

    java.lang.String digitizeCard(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.gemalto.mfs.mwsdk.mobilegateway.enrollment.TermsAndConditionSession termsAndConditionSession, byte[] bArr, byte[] bArr2, com.gemalto.mfs.mwsdk.mobilegateway.listener.MGDigitizationListener mGDigitizationListener);

    void digitizeCard(com.gemalto.mfs.mwsdk.mobilegateway.enrollment.TermsAndConditionSession termsAndConditionSession, byte[] bArr, com.gemalto.mfs.mwsdk.mobilegateway.listener.MGDigitizationListener mGDigitizationListener);

    void getCardMetaData(java.lang.String str, com.gemalto.mfs.mwsdk.mobilegateway.listener.CardMetaDataFetchListener cardMetaDataFetchListener);

    com.gemalto.mfs.mwsdk.mobilegateway.enrollment.PendingCardActivation getPendingCardActivation(java.lang.String str);

    void getProduct(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.gemalto.mfs.mwsdk.mobilegateway.listener.ProductListener productListener);

    void getProductList(java.lang.String str, java.lang.String str2, java.lang.String str3, com.gemalto.mfs.mwsdk.mobilegateway.listener.ProductListener productListener);

    void getTermsAndConditions(java.lang.String str, com.gemalto.mfs.mwsdk.mobilegateway.listener.TermsAndConditionsListener termsAndConditionsListener);

    java.lang.String getWalletId();

    boolean isCardActivationPending(java.lang.String str);
}
