package com.gemalto.mfs.mwsdk.dcm;

/* loaded from: classes3.dex */
public interface DigitalizedCardStatus {
    int getAuxiliaryNumberOfPaymentsLeft();

    java.lang.String getExpiryDate();

    int getNumberOfPaymentsLeft();

    com.gemalto.mfs.mwsdk.dcm.DigitalizedCardState getState();

    boolean needsReplenishment();
}
