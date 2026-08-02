package com.gemalto.mfs.mwsdk.payment.engine.remote;

/* loaded from: classes8.dex */
public interface RemotePaymentOutputData {
    byte[] getCryptogramData();

    com.gemalto.mfs.mwsdk.payment.engine.CryptogramDataType getCryptogramDataType();

    java.lang.String getDpan();

    java.util.Date getDpanExpirationDate();

    int getDpanSequenceNumber();

    java.lang.String getPAR();

    java.lang.String getTrack2EquvalentData();

    void wipe();
}
