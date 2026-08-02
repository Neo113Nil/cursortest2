package com.gemalto.mfs.mwsdk.payment.engine;

/* loaded from: classes3.dex */
public interface TransactionContext {
    java.lang.String getAid();

    double getAmount();

    byte[] getCurrencyCode();

    com.gemalto.mfs.mwsdk.dcm.DigitalizedCardStatus getDigitalizedCardStatus();

    byte[] getRawAmount();

    com.gemalto.mfs.mwsdk.payment.engine.CardScheme getScheme();

    byte[] getTrxDate();

    java.lang.String getTrxId();

    byte getTrxType();

    void wipe();
}
