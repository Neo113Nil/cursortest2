package com.discover.mpos.sdk.transaction.internal;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u001bH&J\b\u0010\u001d\u001a\u00020\rH\u0016J\b\u0010\u001e\u001a\u00020\u001bH&J\b\u0010\u001f\u001a\u00020\u001bH&J\b\u0010 \u001a\u00020\u001bH&J\u0016\u0010!\u001a\u00020\u001b2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00000#H\u0016J\u001e\u0010!\u001a\u00020\u001b2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00000#2\u0006\u0010\b\u001a\u00020\tH&R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0012\u0010\f\u001a\u00020\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u000eR\u0012\u0010\u000f\u001a\u00020\u0010X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0012\u0010\u0013\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0012\u0010\u0016\u001a\u00020\u0017X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006$"}, d2 = {"Lcom/discover/mpos/sdk/transaction/internal/InternalTransaction;", "Lcom/discover/mpos/sdk/transaction/Transaction;", "Lcom/discover/mpos/sdk/core/emv/Clearable;", "Lcom/discover/mpos/sdk/data/TearingRecoveryStorage;", "card", "Lcom/discover/mpos/sdk/card/Card;", "getCard", "()Lcom/discover/mpos/sdk/card/Card;", "handler", "Lcom/discover/mpos/sdk/transaction/internal/InternalTransactionHandler;", "getHandler", "()Lcom/discover/mpos/sdk/transaction/internal/InternalTransactionHandler;", "isCancelled", "", "()Z", "processingData", "Lcom/discover/mpos/sdk/transaction/processing/ProcessingData;", "getProcessingData", "()Lcom/discover/mpos/sdk/transaction/processing/ProcessingData;", "tearingRecoveryStorage", "getTearingRecoveryStorage", "()Lcom/discover/mpos/sdk/data/TearingRecoveryStorage;", "unpredictableNumberGenerator", "Lcom/discover/mpos/sdk/security/unpredictablenumber/UnpredictableNumberGenerator;", "getUnpredictableNumberGenerator", "()Lcom/discover/mpos/sdk/security/unpredictablenumber/UnpredictableNumberGenerator;", "clearTearingRecoveryStorage", "", "endPostReadRecordBenchmark", "isTearingRecoveryPossible", "releaseJobManager", "resetPostReadRecordBenchmark", "startPostReadRecordBenchmark", "startProcessingFlow", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW, "Lcom/discover/mpos/sdk/transaction/execution/LinearTransactionExecutionFlow;", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.transaction.b.a, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public interface InternalTransaction extends com.discover.mpos.sdk.core.emv.Clearable, com.discover.mpos.sdk.data.TearingRecoveryStorage, com.discover.mpos.sdk.transaction.Transaction {
    void a(com.discover.mpos.sdk.transaction.execution.LinearTransactionExecutionFlow<com.discover.mpos.sdk.transaction.internal.InternalTransaction> linearTransactionExecutionFlow);

    void a(com.discover.mpos.sdk.transaction.execution.LinearTransactionExecutionFlow<com.discover.mpos.sdk.transaction.internal.InternalTransaction> linearTransactionExecutionFlow, com.discover.mpos.sdk.transaction.internal.InternalTransactionHandler internalTransactionHandler);

    void e();

    void f();

    void g();

    void h();

    com.discover.mpos.sdk.card.Card i();

    com.discover.mpos.sdk.transaction.processing.ProcessingData j();

    com.discover.mpos.sdk.transaction.internal.InternalTransactionHandler k();

    boolean l();

    com.discover.mpos.sdk.security.unpredictablenumber.UnpredictableNumberGenerator m();

    com.discover.mpos.sdk.data.TearingRecoveryStorage n();

    boolean o();

    void p();
}
