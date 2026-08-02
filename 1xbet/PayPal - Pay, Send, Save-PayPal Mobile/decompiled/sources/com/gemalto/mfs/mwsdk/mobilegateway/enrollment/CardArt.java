package com.gemalto.mfs.mwsdk.mobilegateway.enrollment;

/* loaded from: classes8.dex */
public interface CardArt {
    void getBitmap(com.gemalto.mfs.mwsdk.mobilegateway.enrollment.CardArtType cardArtType, com.gemalto.mfs.mwsdk.mobilegateway.utils.MGAbstractAsyncHandler<com.gemalto.mfs.mwsdk.mobilegateway.enrollment.CardBitmap> mGAbstractAsyncHandler);

    byte[] getPANLastDigits();

    java.lang.String getProductName();

    byte[] getTokenExpiryDate();

    byte[] getTokenLastDigits();
}
