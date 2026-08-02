package com.discover.mpos.sdk.transaction.internal;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\"\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J$\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00122\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\r0\u0014H\u0016J$\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00172\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\r0\u0014H\u0016J\u0018\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u001aH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/discover/mpos/sdk/transaction/internal/TransactionProxyHandler;", "Lcom/discover/mpos/sdk/transaction/internal/InternalTransactionHandler;", "handler", "Lcom/discover/mpos/sdk/transaction/TransactionHandler;", "(Lcom/discover/mpos/sdk/transaction/TransactionHandler;)V", "onCAPKeyRequest", "Lcom/discover/mpos/sdk/data/external/TerminalCAPublicKey;", "transaction", "Lcom/discover/mpos/sdk/transaction/internal/InternalTransaction;", "rid", "", "iccPKIndex", "onComplete", "", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.OUTCOME, "Lcom/discover/mpos/sdk/transaction/outcome/TransactionOutcome;", "onDataStorageProcessingRequest", "request", "Lcom/discover/mpos/sdk/data/external/readdatarecord/DataStorageRequest;", "response", "Lkotlin/Function1;", "Lcom/discover/mpos/sdk/data/external/readdatarecord/DataStorageResponse;", "onExtendedLoggingDataProcessingRequest", "Lcom/discover/mpos/sdk/data/external/initiateapplicationprocessingconnect/ExtendedLoggingDataRequest;", "Lcom/discover/mpos/sdk/data/external/initiateapplicationprocessingconnect/ExtendedLoggingDataResponse;", "onUIRequest", "Lcom/discover/mpos/sdk/transaction/outcome/UiRequest;", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.transaction.b.e, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final class TransactionProxyHandler implements com.discover.mpos.sdk.transaction.internal.InternalTransactionHandler {

    /* renamed from: a, reason: collision with root package name */
    private final com.discover.mpos.sdk.transaction.TransactionHandler f3243a;

    public TransactionProxyHandler(com.discover.mpos.sdk.transaction.TransactionHandler transactionHandler) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionHandler, "");
        this.f3243a = transactionHandler;
    }

    @Override // com.discover.mpos.sdk.transaction.internal.InternalTransactionHandler
    public final void a(com.discover.mpos.sdk.transaction.internal.InternalTransaction internalTransaction, com.discover.mpos.sdk.transaction.outcome.TransactionOutcome transactionOutcome) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalTransaction, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionOutcome, "");
        this.f3243a.onComplete(internalTransaction, transactionOutcome);
    }

    @Override // com.discover.mpos.sdk.transaction.internal.InternalTransactionHandler
    public final void a(com.discover.mpos.sdk.transaction.internal.InternalTransaction internalTransaction, com.discover.mpos.sdk.transaction.outcome.UiRequest uiRequest) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalTransaction, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiRequest, "");
        this.f3243a.onUIRequest(internalTransaction, uiRequest);
    }

    @Override // com.discover.mpos.sdk.transaction.internal.InternalTransactionHandler
    public final com.discover.mpos.sdk.data.external.TerminalCAPublicKey a(com.discover.mpos.sdk.transaction.internal.InternalTransaction internalTransaction, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalTransaction, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        return this.f3243a.onCAPKeyRequest(internalTransaction, str, str2);
    }

    @Override // com.discover.mpos.sdk.transaction.internal.InternalTransactionHandler
    public final void a(com.discover.mpos.sdk.data.external.readdatarecord.DataStorageRequest dataStorageRequest, kotlin.jvm.functions.Function1<? super com.discover.mpos.sdk.data.external.readdatarecord.DataStorageResponse, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataStorageRequest, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        this.f3243a.onDataStorageProcessingRequest(dataStorageRequest, function1);
    }

    @Override // com.discover.mpos.sdk.transaction.internal.InternalTransactionHandler
    public final void a(com.discover.mpos.sdk.data.external.initiateapplicationprocessingconnect.ExtendedLoggingDataRequest extendedLoggingDataRequest, kotlin.jvm.functions.Function1<? super com.discover.mpos.sdk.data.external.initiateapplicationprocessingconnect.ExtendedLoggingDataResponse, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extendedLoggingDataRequest, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        this.f3243a.onExtendedLoggingDataProcessingRequest(extendedLoggingDataRequest, function1);
    }
}
