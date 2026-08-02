package com.gemalto.mfs.mwsdk.dcm;

/* loaded from: classes3.dex */
public interface DigitalizedCard {
    com.gemalto.mfs.mwsdk.utils.async.AsyncToken<java.lang.Void> clearAdditionalPaymentDataSet(com.gemalto.mfs.mwsdk.dcm.PaymentType paymentType, com.gemalto.mfs.mwsdk.utils.async.AbstractAsyncHandler<java.lang.Void> abstractAsyncHandler);

    com.gemalto.mfs.mwsdk.utils.async.AsyncToken<com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData> getAdditionalPaymentDataSet(com.gemalto.mfs.mwsdk.dcm.PaymentType paymentType, com.gemalto.mfs.mwsdk.utils.async.AbstractAsyncHandler<com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData> abstractAsyncHandler);

    java.util.List<com.gemalto.mfs.mwsdk.dcm.Aid> getAllAids() throws com.gemalto.mfs.mwsdk.exception.InternalComponentException;

    com.gemalto.mfs.mwsdk.utils.async.AsyncToken<com.gemalto.mfs.mwsdk.dcm.DigitalizedCardDetails> getCardDetails(com.gemalto.mfs.mwsdk.utils.async.AbstractAsyncHandler<com.gemalto.mfs.mwsdk.dcm.DigitalizedCardDetails> abstractAsyncHandler);

    com.gemalto.mfs.mwsdk.utils.async.AsyncToken<com.gemalto.mfs.mwsdk.dcm.DigitalizedCardStatus> getCardState(com.gemalto.mfs.mwsdk.utils.async.AbstractAsyncHandler<com.gemalto.mfs.mwsdk.dcm.DigitalizedCardStatus> abstractAsyncHandler);

    java.lang.String getTokenizedCardID();

    boolean hasAuxiliaryScheme();

    com.gemalto.mfs.mwsdk.utils.async.AsyncToken<java.lang.Boolean> isDefault(com.gemalto.mfs.mwsdk.dcm.PaymentType paymentType, com.gemalto.mfs.mwsdk.utils.async.AbstractAsyncHandler<java.lang.Boolean> abstractAsyncHandler);

    boolean isMultiAids();

    com.gemalto.mfs.mwsdk.utils.async.AsyncToken<java.lang.Void> setAdditionalPaymentData(com.gemalto.mfs.mwsdk.dcm.PaymentType paymentType, com.gemalto.mfs.mwsdk.utils.async.AbstractAsyncHandler<java.lang.Void> abstractAsyncHandler, java.lang.String str, byte[] bArr);

    com.gemalto.mfs.mwsdk.utils.async.AsyncToken<java.lang.Void> setDefault(com.gemalto.mfs.mwsdk.dcm.PaymentType paymentType, com.gemalto.mfs.mwsdk.utils.async.AbstractAsyncHandler<java.lang.Void> abstractAsyncHandler);

    void updateAidList(java.util.List<com.gemalto.mfs.mwsdk.dcm.Aid> list) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException;
}
