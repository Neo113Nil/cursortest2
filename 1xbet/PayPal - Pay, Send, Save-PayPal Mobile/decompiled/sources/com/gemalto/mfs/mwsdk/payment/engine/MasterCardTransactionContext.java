package com.gemalto.mfs.mwsdk.payment.engine;

/* loaded from: classes3.dex */
public interface MasterCardTransactionContext extends com.gemalto.mfs.mwsdk.payment.engine.TransactionContext {
    com.gemalto.mfs.mwsdk.payment.engine.TransactionType getRichTrxType();

    com.gemalto.mfs.mwsdk.payment.engine.MasterCardTerminalInfo getTerminalInfo();

    byte[] getTransactionId();

    com.gemalto.mfs.mwsdk.payment.engine.MasterCardTransactionInfo getTransactionInfo();

    com.gemalto.mfs.mwsdk.payment.engine.Outcome getTransactionOutcome();
}
