package com.discover.mpos.sdk.transaction.internal;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J$\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\n0\u0011H\u0016J$\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u00142\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\n0\u0011H\u0016J\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J\u0010\u0010\u001b\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u001cH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/discover/mpos/sdk/transaction/internal/TransactionExecutionProxyHandler;", "Lcom/discover/mpos/sdk/transaction/internal/TransactionExecutionHandler;", "transaction", "Lcom/discover/mpos/sdk/transaction/internal/InternalTransaction;", "handler", "Lcom/discover/mpos/sdk/transaction/internal/InternalTransactionHandler;", "terminalProcessingCounter", "Lcom/discover/mpos/sdk/core/performance/Benchmark;", "(Lcom/discover/mpos/sdk/transaction/internal/InternalTransaction;Lcom/discover/mpos/sdk/transaction/internal/InternalTransactionHandler;Lcom/discover/mpos/sdk/core/performance/Benchmark;)V", com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.RewardsAnalyticsConstants.Action.COMPLETE, "", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.OUTCOME, "Lcom/discover/mpos/sdk/transaction/outcome/TransactionOutcome;", "onDataStorageProcessingRequest", "request", "Lcom/discover/mpos/sdk/data/external/readdatarecord/DataStorageRequest;", "response", "Lkotlin/Function1;", "Lcom/discover/mpos/sdk/data/external/readdatarecord/DataStorageResponse;", "onExtendedLoggingDataProcessingRequest", "Lcom/discover/mpos/sdk/data/external/initiateapplicationprocessingconnect/ExtendedLoggingDataRequest;", "Lcom/discover/mpos/sdk/data/external/initiateapplicationprocessingconnect/ExtendedLoggingDataResponse;", "requestCAPublicKey", "Lcom/discover/mpos/sdk/data/external/TerminalCAPublicKey;", "rid", "", "iccPKIndex", "requestUI", "Lcom/discover/mpos/sdk/transaction/outcome/UiRequest;", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.transaction.b.d, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final class TransactionExecutionProxyHandler implements com.discover.mpos.sdk.transaction.internal.TransactionExecutionHandler {

    /* renamed from: a, reason: collision with root package name */
    private final com.discover.mpos.sdk.transaction.internal.InternalTransaction f3242a;
    private final com.discover.mpos.sdk.transaction.internal.InternalTransactionHandler b;
    private final com.discover.mpos.sdk.core.performance.Benchmark c;

    public TransactionExecutionProxyHandler(com.discover.mpos.sdk.transaction.internal.InternalTransaction internalTransaction, com.discover.mpos.sdk.transaction.internal.InternalTransactionHandler internalTransactionHandler, com.discover.mpos.sdk.core.performance.Benchmark benchmark) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalTransaction, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalTransactionHandler, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(benchmark, "");
        this.f3242a = internalTransaction;
        this.b = internalTransactionHandler;
        this.c = benchmark;
    }

    @Override // com.discover.mpos.sdk.transaction.internal.TransactionExecutionHandler
    public final void a(com.discover.mpos.sdk.transaction.outcome.TransactionOutcome transactionOutcome) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionOutcome, "");
        this.b.a(this.f3242a, transactionOutcome);
    }

    @Override // com.discover.mpos.sdk.transaction.internal.TransactionExecutionHandler
    public final void a(com.discover.mpos.sdk.transaction.outcome.UiRequest uiRequest) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiRequest, "");
        this.b.a(this.f3242a, uiRequest);
    }

    @Override // com.discover.mpos.sdk.transaction.internal.TransactionExecutionHandler
    public final com.discover.mpos.sdk.data.external.TerminalCAPublicKey a(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        return this.b.a(this.f3242a, str, str2);
    }
}
