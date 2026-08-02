package com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.flow;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0016\u0010\r\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0016\u0010\u0018\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u000fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/discover/mpos/sdk/cardreader/kernel/flow/readdatastorage/flow/OperatorSpecificStep;", "Lcom/discover/mpos/sdk/cardreader/kernel/flow/readdatastorage/flow/ReadDataStorageFlowStep;", "Lcom/discover/mpos/sdk/cardreader/kernel/flow/readdatastorage/model/ReadDataStorageData;", "()V", "defaultTimeout", "", "isCancelled", "Ljava/util/concurrent/atomic/AtomicBoolean;", "timer", "Lcom/discover/mpos/sdk/core/concurent/DiscoverJob;", "", "debugTag", "", "execute", "transaction", "Lcom/discover/mpos/sdk/transaction/execution/TransactionEx;", "logRequest", "request", "Lcom/discover/mpos/sdk/data/external/readdatarecord/DataStorageRequest;", "processingData", "Lcom/discover/mpos/sdk/transaction/processing/ProcessingData;", "logResponse", "response", "Lcom/discover/mpos/sdk/data/external/readdatarecord/DataStorageResponse;", "setupTimer", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.b.b, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final class OperatorSpecificStep implements com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.flow.ReadDataStorageFlowStep<com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.model.ReadDataStorageData> {
    com.discover.mpos.sdk.core.concurent.DiscoverJob<kotlin.Unit> b;

    /* renamed from: a, reason: collision with root package name */
    final java.util.concurrent.atomic.AtomicBoolean f3182a = new java.util.concurrent.atomic.AtomicBoolean(false);
    private final long c = 30000;

    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "response", "Lcom/discover/mpos/sdk/data/external/readdatarecord/DataStorageResponse;", "invoke"}, k = 3, mv = {1, 4, 1})
    /* renamed from: com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.b.b$a */
    static final class a extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1<com.discover.mpos.sdk.data.external.readdatarecord.DataStorageResponse, kotlin.Unit> {
        final /* synthetic */ com.discover.mpos.sdk.transaction.execution.TransactionEx b;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ kotlin.Unit invoke(com.discover.mpos.sdk.data.external.readdatarecord.DataStorageResponse dataStorageResponse) {
            com.discover.mpos.sdk.data.external.readdatarecord.DataStorageResponse dataStorageResponse2 = dataStorageResponse;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataStorageResponse2, "");
            com.discover.mpos.sdk.core.concurent.DiscoverJob<kotlin.Unit> discoverJob = com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.flow.OperatorSpecificStep.this.b;
            if (discoverJob != null) {
                discoverJob.cancel();
            }
            if (!com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.flow.OperatorSpecificStep.this.f3182a.getAndSet(true)) {
                new java.lang.Object[]{dataStorageResponse2.getDataStorageUpdatedTemplate()};
                new java.lang.Object[]{java.lang.Byte.valueOf(dataStorageResponse2.getCommitControlSettings())};
                new java.lang.Object[]{dataStorageResponse2.getPdolUpdate()};
                if (dataStorageResponse2.isValid$mpos_sdk_card_reader_offlineRegularRelease()) {
                    this.b.j().c = dataStorageResponse2.toDataStorage$mpos_sdk_card_reader_offlineRegularRelease();
                }
                this.b.t();
            }
            return kotlin.Unit.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(com.discover.mpos.sdk.transaction.execution.TransactionEx transactionEx) {
            super(1);
            this.b = transactionEx;
        }
    }

    @Override // com.discover.mpos.sdk.flow.ExecutionStep
    public final /* synthetic */ void a(com.discover.mpos.sdk.flow.ExecutionFlow executionFlow, java.lang.Object obj) {
        com.discover.mpos.sdk.transaction.execution.TransactionEx transactionEx = (com.discover.mpos.sdk.transaction.execution.TransactionEx) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executionFlow, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionEx, "");
        com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.flow.ReadDataStorageFlowStep.a.a(this, executionFlow, transactionEx);
    }

    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 1})
    /* renamed from: com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.b.b$b */
    static final class b extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<kotlin.Unit> {
        final /* synthetic */ com.discover.mpos.sdk.transaction.execution.TransactionEx b;

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ kotlin.Unit invoke() {
            com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.flow.OperatorSpecificStep.this.f3182a.set(true);
            com.discover.mpos.sdk.transaction.execution.TransactionFlowHandler.a.a(this.b, com.discover.mpos.sdk.transaction.execution.TransactionEndStatus.b, com.discover.mpos.sdk.transaction.outcome.UiRequest.MessageIdentifier.PROCESSING_ERROR, false, 4);
            return kotlin.Unit.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(com.discover.mpos.sdk.transaction.execution.TransactionEx transactionEx) {
            super(0);
            this.b = transactionEx;
        }
    }

    @Override // com.discover.mpos.sdk.transaction.execution.TransactionExecutionStep
    public final void a(com.discover.mpos.sdk.transaction.execution.TransactionEx<com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.model.ReadDataStorageData> transactionEx) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionEx, "");
        this.b = transactionEx.a(this.c, new com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.flow.OperatorSpecificStep.b(transactionEx));
        com.discover.mpos.sdk.data.external.readdatarecord.DataStorageRequest dataStorageRequest = new com.discover.mpos.sdk.data.external.readdatarecord.DataStorageRequest(transactionEx.j());
        com.discover.mpos.sdk.transaction.processing.ProcessingData j = transactionEx.j();
        new java.lang.Object[]{dataStorageRequest.getPdol()};
        new java.lang.Object[]{dataStorageRequest.getPdolUpdate()};
        new java.lang.Object[]{java.lang.Boolean.valueOf(dataStorageRequest.getResumeTransaction())};
        new java.lang.Object[]{j.t()};
        new java.lang.Object[]{dataStorageRequest.getCardFeatureDescriptor()};
        new java.lang.Object[]{dataStorageRequest.getDataStorageDirectory()};
        java.util.List<com.discover.mpos.sdk.data.external.readdatarecord.DataStorageContainer> dataContainersRecords = dataStorageRequest.getDataContainersRecords();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(dataContainersRecords, 10));
        for (com.discover.mpos.sdk.data.external.readdatarecord.DataStorageContainer dataStorageContainer : dataContainersRecords) {
            arrayList.add(kotlin.TuplesKt.to(com.discover.mpos.sdk.core.extensions.ByteArrayExtensionsKt.toHexString(dataStorageContainer.getContainerId()), com.discover.mpos.sdk.core.extensions.ByteArrayExtensionsKt.toHexString(dataStorageContainer.getContainerContent())));
        }
        new java.lang.Object[]{arrayList};
        transactionEx.k().a(dataStorageRequest, new com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.flow.OperatorSpecificStep.a(transactionEx));
    }
}
