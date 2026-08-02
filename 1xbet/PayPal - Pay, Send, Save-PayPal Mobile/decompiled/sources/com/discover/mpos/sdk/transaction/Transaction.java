package com.discover.mpos.sdk.transaction;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00058'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\f\u001a\u00020\t8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u0014\u0010\u0012\u001a\u00020\u000f8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/discover/mpos/sdk/transaction/Transaction;", "", "", com.paypal.oslo.feature.identity.passwordrecovery.ui.analytics.PasswordRecoveryAnalytics.ITEM_CANCEL, "()V", "Lcom/discover/mpos/sdk/cardreader/config/ReaderConfiguration;", "getConfig", "()Lcom/discover/mpos/sdk/cardreader/config/ReaderConfiguration;", "config", "", "getExecutionTime", "()J", "executionTime", "getReaderTime", "readerTime", "Lcom/discover/mpos/sdk/transaction/TransactionData;", "getTransactionData", "()Lcom/discover/mpos/sdk/transaction/TransactionData;", "transactionData"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes8.dex */
public interface Transaction {
    void cancel();

    com.discover.mpos.sdk.cardreader.config.ReaderConfiguration getConfig();

    long getExecutionTime();

    long getReaderTime();

    com.discover.mpos.sdk.transaction.TransactionData getTransactionData();
}
