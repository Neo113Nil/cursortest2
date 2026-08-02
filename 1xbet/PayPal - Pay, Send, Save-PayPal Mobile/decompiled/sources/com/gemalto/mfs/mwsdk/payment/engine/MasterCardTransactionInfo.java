package com.gemalto.mfs.mwsdk.payment.engine;

/* loaded from: classes3.dex */
public interface MasterCardTransactionInfo {
    com.gemalto.mfs.mwsdk.payment.engine.TransactionConditions getConditionsofUse();

    com.gemalto.mfs.mwsdk.payment.engine.UserActionOnPoi getExpectedUserActionOnPOI();

    double getOtherAmount();

    com.gemalto.mfs.mwsdk.payment.engine.TransactionPurpose getPurpose();

    com.gemalto.mfs.mwsdk.payment.engine.TransactionRange getTransactionRange();

    boolean hasTerminalRequestedCdCvm();

    boolean isAlternateAID();
}
