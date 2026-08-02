package com.discover.mpos.sdk.cardreader;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001&BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\"\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u001aH\u0002J \u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0018\u0010\u001f\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020!2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0018\u0010\"\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020$2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0018\u0010%\u001a\u00020\u001c2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/discover/mpos/sdk/cardreader/DPasCardReader;", "Lcom/discover/mpos/sdk/cardreader/CardReader;", "entryPoint", "Lcom/discover/mpos/sdk/cardreader/entrypoint/EntryPoint;", "card", "Lcom/discover/mpos/sdk/card/Card;", "config", "Lcom/discover/mpos/sdk/cardreader/config/ReaderConfiguration;", "connectorHub", "Lcom/discover/mpos/sdk/card/connectors/ConnectorHub;", "unpredictableNumber", "Lcom/discover/mpos/sdk/security/unpredictablenumber/UnpredictableNumberGenerator;", "tearingRecoveryStorage", "Lcom/discover/mpos/sdk/data/TearingRecoveryStorage;", "jobManager", "Lcom/discover/mpos/sdk/core/concurent/JobManager;", "(Lcom/discover/mpos/sdk/cardreader/entrypoint/EntryPoint;Lcom/discover/mpos/sdk/card/Card;Lcom/discover/mpos/sdk/cardreader/config/ReaderConfiguration;Lcom/discover/mpos/sdk/card/connectors/ConnectorHub;Lcom/discover/mpos/sdk/security/unpredictablenumber/UnpredictableNumberGenerator;Lcom/discover/mpos/sdk/data/TearingRecoveryStorage;Lcom/discover/mpos/sdk/core/concurent/JobManager;)V", "debugTag", "", "newTransaction", "Lcom/discover/mpos/sdk/transaction/internal/InternalTransaction;", "transactionData", "Lcom/discover/mpos/sdk/transaction/TransactionData;", "transactionHandler", "Lcom/discover/mpos/sdk/transaction/TransactionHandler;", "processingData", "Lcom/discover/mpos/sdk/transaction/processing/ProcessingData;", "startKernelTransaction", "Lcom/discover/mpos/sdk/transaction/Transaction;", "transactionExtras", "Lcom/discover/mpos/sdk/data/external/TransactionExtras;", "startRePresentment", "writeDataStorageUpdate", "Lcom/discover/mpos/sdk/cardreader/entrypoint/model/WriteDataStorageUpdate;", "startRePresentmentStartD", "startDWriteDataStorageUpdate", "Lcom/discover/mpos/sdk/cardreader/entrypoint/model/StartDWriteDataStorageUpdate;", "startTransaction", "CardReaderTransactionHandler", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.cardreader.a, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final class DPasCardReader implements com.discover.mpos.sdk.cardreader.CardReader {

    /* renamed from: a, reason: collision with root package name */
    final com.discover.mpos.sdk.card.Card f2980a;
    final com.discover.mpos.sdk.security.unpredictablenumber.UnpredictableNumberGenerator b;
    private final com.discover.mpos.sdk.cardreader.entrypoint.EntryPoint c;
    private final com.discover.mpos.sdk.cardreader.config.ReaderConfiguration d;
    private final com.discover.mpos.sdk.card.connectors.ConnectorHub e;
    private final com.discover.mpos.sdk.data.TearingRecoveryStorage f;
    private final com.discover.mpos.sdk.core.concurent.JobManager g;

    private DPasCardReader(com.discover.mpos.sdk.cardreader.entrypoint.EntryPoint entryPoint, com.discover.mpos.sdk.card.Card card, com.discover.mpos.sdk.cardreader.config.ReaderConfiguration readerConfiguration, com.discover.mpos.sdk.card.connectors.ConnectorHub connectorHub, com.discover.mpos.sdk.security.unpredictablenumber.UnpredictableNumberGenerator unpredictableNumberGenerator, com.discover.mpos.sdk.data.TearingRecoveryStorage tearingRecoveryStorage, com.discover.mpos.sdk.core.concurent.JobManager jobManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryPoint, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(card, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(readerConfiguration, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectorHub, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unpredictableNumberGenerator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tearingRecoveryStorage, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jobManager, "");
        this.c = entryPoint;
        this.f2980a = card;
        this.d = readerConfiguration;
        this.e = connectorHub;
        this.b = unpredictableNumberGenerator;
        this.f = tearingRecoveryStorage;
        this.g = jobManager;
        unpredictableNumberGenerator.a(readerConfiguration.getTerminalConfiguration().getTerminalId(), readerConfiguration.getInterfaceDeviceIFDSerialNumber());
    }

    public /* synthetic */ DPasCardReader(com.discover.mpos.sdk.cardreader.entrypoint.EntryPoint entryPoint, com.discover.mpos.sdk.card.Card card, com.discover.mpos.sdk.cardreader.config.ReaderConfiguration readerConfiguration, com.discover.mpos.sdk.card.connectors.ConnectorHub connectorHub, com.discover.mpos.sdk.security.unpredictablenumber.UnpredictableNumberGenerator unpredictableNumberGenerator) {
        this(entryPoint, card, readerConfiguration, connectorHub, unpredictableNumberGenerator, new com.discover.mpos.sdk.data.TearingRecoveryLog(), com.discover.mpos.sdk.core.concurent.DiscoverJobManager.Companion.newInstance$default(com.discover.mpos.sdk.core.concurent.DiscoverJobManager.INSTANCE, null, 1, null));
    }

    private final com.discover.mpos.sdk.transaction.internal.InternalTransaction a(com.discover.mpos.sdk.transaction.TransactionData transactionData, com.discover.mpos.sdk.transaction.TransactionHandler transactionHandler, com.discover.mpos.sdk.transaction.processing.ProcessingData processingData) {
        com.discover.mpos.sdk.cardreader.config.ReaderConfiguration readerConfiguration = this.d;
        com.discover.mpos.sdk.card.Card card = this.f2980a;
        com.discover.mpos.sdk.security.unpredictablenumber.UnpredictableNumberGenerator unpredictableNumberGenerator = this.b;
        com.discover.mpos.sdk.transaction.execution.TransactionContext transactionContext = new com.discover.mpos.sdk.transaction.execution.TransactionContext(readerConfiguration, transactionData, card, processingData, new com.discover.mpos.sdk.cardreader.DPasCardReader.a(this, transactionHandler), unpredictableNumberGenerator, this.f, this.g);
        com.discover.mpos.sdk.card.Card card2 = this.f2980a;
        com.discover.mpos.sdk.card.connectors.ConnectorHub connectorHub = this.e;
        com.discover.mpos.sdk.card.connectors.ConnectorType connectorType = transactionData.getConnectorType();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectorType, "");
        com.discover.mpos.sdk.card.connectors.CardConnector cardConnector = connectorHub.f2977a.get(connectorType);
        if (cardConnector != null) {
            card2.a(cardConnector);
            return transactionContext;
        }
        throw new java.util.NoSuchElementException();
    }

    @Override // com.discover.mpos.sdk.cardreader.CardReader
    public final com.discover.mpos.sdk.transaction.Transaction startTransaction(com.discover.mpos.sdk.transaction.TransactionData transactionData, com.discover.mpos.sdk.transaction.TransactionHandler transactionHandler) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionHandler, "");
        new java.lang.Object[]{transactionData};
        com.discover.mpos.sdk.transaction.internal.InternalTransaction a2 = a(transactionData, transactionHandler, new com.discover.mpos.sdk.transaction.processing.ProcessingData(this.d, transactionData, null, null, false, null, 60));
        this.c.a(a2);
        return a2;
    }

    @Override // com.discover.mpos.sdk.cardreader.CardReader
    public final com.discover.mpos.sdk.transaction.Transaction startKernelTransaction(com.discover.mpos.sdk.transaction.TransactionData transactionData, com.discover.mpos.sdk.transaction.TransactionHandler transactionHandler, com.discover.mpos.sdk.data.external.TransactionExtras transactionExtras) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionHandler, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionExtras, "");
        new java.lang.Object[]{transactionData};
        com.discover.mpos.sdk.transaction.internal.InternalTransaction a2 = a(transactionData, transactionHandler, new com.discover.mpos.sdk.transaction.processing.ProcessingData(this.d, transactionData, transactionExtras));
        this.c.b(a2);
        return a2;
    }

    @Override // com.discover.mpos.sdk.cardreader.CardReader
    public final com.discover.mpos.sdk.transaction.Transaction startRePresentment(com.discover.mpos.sdk.cardreader.entrypoint.model.WriteDataStorageUpdate writeDataStorageUpdate, com.discover.mpos.sdk.transaction.TransactionHandler transactionHandler) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writeDataStorageUpdate, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionHandler, "");
        com.discover.mpos.sdk.transaction.internal.InternalTransaction a2 = a(writeDataStorageUpdate.getTransactionData(), transactionHandler, new com.discover.mpos.sdk.transaction.processing.ProcessingData(this.d, writeDataStorageUpdate));
        new java.lang.Object[]{writeDataStorageUpdate.getCombinationConfiguration()};
        new java.lang.Object[]{writeDataStorageUpdate.getPreProcessingIndicators()};
        new java.lang.Object[]{writeDataStorageUpdate.getExtendedSelectionData().getContent()};
        new java.lang.Object[]{writeDataStorageUpdate.getWriteDataStorageContent()};
        this.c.c(a2);
        return a2;
    }

    @Override // com.discover.mpos.sdk.cardreader.CardReader
    public final com.discover.mpos.sdk.transaction.Transaction startRePresentmentStartD(com.discover.mpos.sdk.cardreader.entrypoint.model.StartDWriteDataStorageUpdate startDWriteDataStorageUpdate, com.discover.mpos.sdk.transaction.TransactionHandler transactionHandler) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(startDWriteDataStorageUpdate, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionHandler, "");
        com.discover.mpos.sdk.cardreader.entrypoint.model.WriteDataStorageUpdate writeDataStorageUpdate = startDWriteDataStorageUpdate.getWriteDataStorageUpdate();
        com.discover.mpos.sdk.transaction.internal.InternalTransaction a2 = a(startDWriteDataStorageUpdate.getWriteDataStorageUpdate().getTransactionData(), transactionHandler, new com.discover.mpos.sdk.transaction.processing.ProcessingData(this.d, startDWriteDataStorageUpdate));
        new java.lang.Object[]{writeDataStorageUpdate.getCombinationConfiguration()};
        new java.lang.Object[]{writeDataStorageUpdate.getPreProcessingIndicators()};
        new java.lang.Object[]{writeDataStorageUpdate.getExtendedSelectionData().getContent()};
        new java.lang.Object[]{writeDataStorageUpdate.getWriteDataStorageContent()};
        new java.lang.Object[]{startDWriteDataStorageUpdate.getSelectApplicationResponse()};
        this.c.b(a2);
        return a2;
    }

    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0002J#\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0096\u0001J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J%\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00162\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00110\u0018H\u0096\u0001J%\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u001b2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00110\u0018H\u0096\u0001J\u0019\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\bH\u0096\u0001J\u0010\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\fH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u001f"}, d2 = {"Lcom/discover/mpos/sdk/cardreader/DPasCardReader$CardReaderTransactionHandler;", "Lcom/discover/mpos/sdk/transaction/internal/InternalTransactionHandler;", "handler", "Lcom/discover/mpos/sdk/transaction/TransactionHandler;", "(Lcom/discover/mpos/sdk/cardreader/DPasCardReader;Lcom/discover/mpos/sdk/transaction/TransactionHandler;)V", "getHandler", "()Lcom/discover/mpos/sdk/transaction/TransactionHandler;", "createWelcomeUiRequest", "Lcom/discover/mpos/sdk/transaction/outcome/UiRequest;", "onCAPKeyRequest", "Lcom/discover/mpos/sdk/data/external/TerminalCAPublicKey;", "transaction", "Lcom/discover/mpos/sdk/transaction/internal/InternalTransaction;", "rid", "", "iccPKIndex", "onComplete", "", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.OUTCOME, "Lcom/discover/mpos/sdk/transaction/outcome/TransactionOutcome;", "onDataStorageProcessingRequest", "request", "Lcom/discover/mpos/sdk/data/external/readdatarecord/DataStorageRequest;", "response", "Lkotlin/Function1;", "Lcom/discover/mpos/sdk/data/external/readdatarecord/DataStorageResponse;", "onExtendedLoggingDataProcessingRequest", "Lcom/discover/mpos/sdk/data/external/initiateapplicationprocessingconnect/ExtendedLoggingDataRequest;", "Lcom/discover/mpos/sdk/data/external/initiateapplicationprocessingconnect/ExtendedLoggingDataResponse;", "onUIRequest", "storeDebugData", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
    /* renamed from: com.discover.mpos.sdk.cardreader.a$a */
    final class a implements com.discover.mpos.sdk.transaction.internal.InternalTransactionHandler {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.discover.mpos.sdk.cardreader.DPasCardReader f2981a;
        private final com.discover.mpos.sdk.transaction.TransactionHandler b;
        private final /* synthetic */ com.discover.mpos.sdk.transaction.internal.TransactionProxyHandler c;

        public a(com.discover.mpos.sdk.cardreader.DPasCardReader dPasCardReader, com.discover.mpos.sdk.transaction.TransactionHandler transactionHandler) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionHandler, "");
            this.f2981a = dPasCardReader;
            this.c = new com.discover.mpos.sdk.transaction.internal.TransactionProxyHandler(transactionHandler);
            this.b = transactionHandler;
        }

        @Override // com.discover.mpos.sdk.transaction.internal.InternalTransactionHandler
        public final void a(com.discover.mpos.sdk.transaction.internal.InternalTransaction internalTransaction, com.discover.mpos.sdk.transaction.outcome.TransactionOutcome transactionOutcome) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalTransaction, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionOutcome, "");
            this.f2981a.f2980a.b();
            internalTransaction.f();
            this.f2981a.b.a(internalTransaction.getE().k());
            this.f2981a.b.b();
            internalTransaction.h();
            this.b.onComplete(internalTransaction, transactionOutcome);
            new java.lang.Object[]{transactionOutcome, transactionOutcome.getParams().getStart()};
            if (kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.discover.mpos.sdk.transaction.outcome.OutcomeType[]{com.discover.mpos.sdk.transaction.outcome.OutcomeType.END_APPLICATION, com.discover.mpos.sdk.transaction.outcome.OutcomeType.APPROVED}).contains(transactionOutcome.getType())) {
                com.discover.mpos.sdk.transaction.outcome.UiRequest uiRequestOnOutcome = transactionOutcome.getParams().getUiRequestOnOutcome();
                if (uiRequestOnOutcome == null) {
                    uiRequestOnOutcome = new com.discover.mpos.sdk.transaction.outcome.UiRequest(com.discover.mpos.sdk.transaction.outcome.UiRequest.MessageIdentifier.WELCOME, com.discover.mpos.sdk.transaction.outcome.UiRequest.Status.IDLE, null, null, null, null, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
                }
                a(internalTransaction, uiRequestOnOutcome);
            }
            internalTransaction.getI().clear();
            transactionOutcome.clear();
        }

        @Override // com.discover.mpos.sdk.transaction.internal.InternalTransactionHandler
        public final void a(com.discover.mpos.sdk.transaction.internal.InternalTransaction internalTransaction, com.discover.mpos.sdk.transaction.outcome.UiRequest uiRequest) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalTransaction, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiRequest, "");
            this.c.a(internalTransaction, uiRequest);
        }

        @Override // com.discover.mpos.sdk.transaction.internal.InternalTransactionHandler
        public final void a(com.discover.mpos.sdk.data.external.readdatarecord.DataStorageRequest dataStorageRequest, kotlin.jvm.functions.Function1<? super com.discover.mpos.sdk.data.external.readdatarecord.DataStorageResponse, kotlin.Unit> function1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataStorageRequest, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
            this.c.a(dataStorageRequest, function1);
        }

        @Override // com.discover.mpos.sdk.transaction.internal.InternalTransactionHandler
        public final void a(com.discover.mpos.sdk.data.external.initiateapplicationprocessingconnect.ExtendedLoggingDataRequest extendedLoggingDataRequest, kotlin.jvm.functions.Function1<? super com.discover.mpos.sdk.data.external.initiateapplicationprocessingconnect.ExtendedLoggingDataResponse, kotlin.Unit> function1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extendedLoggingDataRequest, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
            this.c.a(extendedLoggingDataRequest, function1);
        }

        @Override // com.discover.mpos.sdk.transaction.internal.InternalTransactionHandler
        public final com.discover.mpos.sdk.data.external.TerminalCAPublicKey a(com.discover.mpos.sdk.transaction.internal.InternalTransaction internalTransaction, java.lang.String str, java.lang.String str2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalTransaction, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            return this.c.a(internalTransaction, str, str2);
        }
    }
}
