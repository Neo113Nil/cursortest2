package com.gemalto.mfs.mwsdk.mobilegateway.enrollment;

/* loaded from: classes8.dex */
public interface CardMetaData {
    java.lang.String getAuxiliaryTokenExpiryDate();

    java.lang.String getAuxiliaryTokenLastDigits();

    java.lang.String getCardReferenceId();

    java.lang.String getIssuerEmail();

    java.lang.String getIssuerName();

    java.lang.String getIssuerPhoneNumber();

    java.lang.String getIssuerWebsite();

    java.util.HashMap<java.lang.String, java.lang.String> getKeyValues();

    java.lang.String getLongDescription();

    java.lang.String getPanExpiryDate();

    java.lang.String getPanLastDigits();

    java.lang.String getPaymentAccountReference();

    java.lang.String getPrivacyPolicyUrl();

    java.lang.String getProductId();

    java.lang.String getProductName();

    java.lang.String getShortDescription();

    java.lang.String getTermsAndConditionsUrl();

    java.lang.String getTokenExpiryDate();

    java.lang.String getTokenID();

    java.lang.String getTokenLastDigits();

    java.lang.String getTspId();
}
