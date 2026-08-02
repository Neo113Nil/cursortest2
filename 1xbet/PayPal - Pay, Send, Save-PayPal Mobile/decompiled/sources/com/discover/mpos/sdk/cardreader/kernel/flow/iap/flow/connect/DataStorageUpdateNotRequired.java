package com.discover.mpos.sdk.cardreader.kernel.flow.iap.flow.connect;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0014J\u0016\u0010\u0012\u001a\u00020\f2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0014J\u0010\u0010\u0015\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u0019\u001a\u00020\fH\u0014J\b\u0010\u001a\u001a\u00020\u001bH\u0014J\u0016\u0010\u001c\u001a\u00020\f2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/discover/mpos/sdk/cardreader/kernel/flow/iap/flow/connect/DataStorageUpdateNotRequired;", "Lcom/discover/mpos/sdk/cardreader/kernel/flow/iap/flow/connect/BaseIapConnectFlow;", "tx", "Lcom/discover/mpos/sdk/transaction/execution/TransactionEx;", "Lcom/discover/mpos/sdk/cardreader/kernel/flow/iap/model/ApplicationProcessingData;", "(Lcom/discover/mpos/sdk/transaction/execution/TransactionEx;)V", "defaultTimeout", "", "isCancelled", "Ljava/util/concurrent/atomic/AtomicBoolean;", "timer", "Lcom/discover/mpos/sdk/core/concurent/DiscoverJob;", "", "appendExtendedLoggingToPdol", "request", "Lcom/discover/mpos/sdk/data/external/initiateapplicationprocessingconnect/ExtendedLoggingDataRequest;", "debugTag", "", "executeOperatorSpecificExchange", "getP1Parameter", "", "logRequest", "logResponse", "response", "Lcom/discover/mpos/sdk/data/external/initiateapplicationprocessingconnect/ExtendedLoggingDataResponse;", "preProcess", "readGPOContent", "Lcom/discover/mpos/sdk/card/apdu/gpo/GetProcessingOptionsResponse;", "setupTimer", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.cardreader.kernel.flow.c.a.a.b, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final class DataStorageUpdateNotRequired extends com.discover.mpos.sdk.cardreader.kernel.flow.iap.flow.connect.BaseIapConnectFlow {
    final java.util.concurrent.atomic.AtomicBoolean b;
    com.discover.mpos.sdk.core.concurent.DiscoverJob<kotlin.Unit> c;
    private final long d;
    private final com.discover.mpos.sdk.transaction.execution.TransactionEx<com.discover.mpos.sdk.cardreader.kernel.flow.iap.model.ApplicationProcessingData> e;

    @Override // com.discover.mpos.sdk.cardreader.kernel.flow.iap.flow.connect.BaseIapConnectFlow
    protected final int e() {
        return 0;
    }

    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "response", "Lcom/discover/mpos/sdk/data/external/initiateapplicationprocessingconnect/ExtendedLoggingDataResponse;", "invoke"}, k = 3, mv = {1, 4, 1})
    /* renamed from: com.discover.mpos.sdk.cardreader.kernel.flow.c.a.a.b$a */
    static final class a extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1<com.discover.mpos.sdk.data.external.initiateapplicationprocessingconnect.ExtendedLoggingDataResponse, kotlin.Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ kotlin.Unit invoke(com.discover.mpos.sdk.data.external.initiateapplicationprocessingconnect.ExtendedLoggingDataResponse extendedLoggingDataResponse) {
            com.discover.mpos.sdk.data.external.initiateapplicationprocessingconnect.ExtendedLoggingDataResponse extendedLoggingDataResponse2 = extendedLoggingDataResponse;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extendedLoggingDataResponse2, "");
            com.discover.mpos.sdk.core.concurent.DiscoverJob<kotlin.Unit> discoverJob = com.discover.mpos.sdk.cardreader.kernel.flow.iap.flow.connect.DataStorageUpdateNotRequired.this.c;
            if (discoverJob != null) {
                discoverJob.cancel();
            }
            if (!com.discover.mpos.sdk.cardreader.kernel.flow.iap.flow.connect.DataStorageUpdateNotRequired.this.b.getAndSet(true)) {
                new java.lang.Object[]{extendedLoggingDataResponse2};
                com.discover.mpos.sdk.cardreader.kernel.flow.iap.flow.connect.DataStorageUpdateNotRequired.this.a(extendedLoggingDataResponse2.getExtendedLoggingData());
            }
            return kotlin.Unit.INSTANCE;
        }

        a() {
            super(1);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStorageUpdateNotRequired(com.discover.mpos.sdk.transaction.execution.TransactionEx<com.discover.mpos.sdk.cardreader.kernel.flow.iap.model.ApplicationProcessingData> transactionEx) {
        super(transactionEx);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionEx, "");
        this.e = transactionEx;
        this.b = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.d = 30000L;
    }

    @Override // com.discover.mpos.sdk.cardreader.kernel.flow.iap.flow.connect.BaseIapConnectFlow
    protected final void d() {
        boolean z = this.e.j().z;
        new java.lang.Object[]{java.lang.Boolean.valueOf(z)};
        if (z) {
            com.discover.mpos.sdk.transaction.execution.TransactionEx<com.discover.mpos.sdk.cardreader.kernel.flow.iap.model.ApplicationProcessingData> transactionEx = this.e;
            this.c = transactionEx.a(this.d, new com.discover.mpos.sdk.cardreader.kernel.flow.iap.flow.connect.DataStorageUpdateNotRequired.b(transactionEx));
            com.discover.mpos.sdk.data.external.initiateapplicationprocessingconnect.ExtendedLoggingDataRequest extendedLoggingDataRequest = new com.discover.mpos.sdk.data.external.initiateapplicationprocessingconnect.ExtendedLoggingDataRequest(transactionEx.j());
            new java.lang.Object[]{extendedLoggingDataRequest.getPdol()};
            new java.lang.Object[]{extendedLoggingDataRequest.getPdolUpdate()};
            new java.lang.Object[]{extendedLoggingDataRequest.getCardFeatureVersionNumber()};
            new java.lang.Object[]{extendedLoggingDataRequest.getCardFeatureDescriptor()};
            this.e.k().a(extendedLoggingDataRequest, new com.discover.mpos.sdk.cardreader.kernel.flow.iap.flow.connect.DataStorageUpdateNotRequired.a());
            return;
        }
        a((com.discover.mpos.sdk.core.emv.tlv.Tlv) null);
    }

    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 1})
    /* renamed from: com.discover.mpos.sdk.cardreader.kernel.flow.c.a.a.b$b */
    static final class b extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<kotlin.Unit> {
        final /* synthetic */ com.discover.mpos.sdk.transaction.execution.TransactionEx b;

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ kotlin.Unit invoke() {
            com.discover.mpos.sdk.cardreader.kernel.flow.iap.flow.connect.DataStorageUpdateNotRequired.this.b.set(true);
            com.discover.mpos.sdk.transaction.execution.TransactionFlowHandler.a.a(this.b, com.discover.mpos.sdk.transaction.execution.TransactionEndStatus.b, com.discover.mpos.sdk.transaction.outcome.UiRequest.MessageIdentifier.PROCESSING_ERROR, false, 4);
            return kotlin.Unit.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(com.discover.mpos.sdk.transaction.execution.TransactionEx transactionEx) {
            super(0);
            this.b = transactionEx;
        }
    }

    @Override // com.discover.mpos.sdk.cardreader.kernel.flow.iap.flow.connect.BaseIapConnectFlow
    protected final com.discover.mpos.sdk.card.apdu.gpo.GetProcessingOptionsResponse f() {
        return this.f3022a.i().a(kotlin.collections.ArraysKt.plus(new com.discover.mpos.sdk.core.emv.tlv.Tlv(com.discover.mpos.sdk.core.emv.tlv.Tag.COMMAND_TEMPLATE.getTag(), b(), 0, 0, 12, null).getE(), c()));
    }
}
