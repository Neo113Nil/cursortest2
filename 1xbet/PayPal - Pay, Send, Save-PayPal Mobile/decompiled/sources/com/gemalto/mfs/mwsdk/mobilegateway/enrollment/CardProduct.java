package com.gemalto.mfs.mwsdk.mobilegateway.enrollment;

/* loaded from: classes8.dex */
public interface CardProduct {
    com.gemalto.mfs.mwsdk.mobilegateway.enrollment.CardArt getCardArt();

    java.lang.String getCsPhoneNumber();

    java.lang.String getCsWebsiteUrl();

    java.lang.String getLongDesc();

    java.lang.String getProductId();

    java.lang.String getProductName();

    double getRefundableDeposit();

    java.lang.String getShortDesc1();

    java.lang.String getShortDesc2();

    java.util.List<java.lang.Integer> getTopupAmounts();

    com.gemalto.mfs.mwsdk.mobilegateway.enrollment.ValidityPeriod getValidityPeriod();
}
