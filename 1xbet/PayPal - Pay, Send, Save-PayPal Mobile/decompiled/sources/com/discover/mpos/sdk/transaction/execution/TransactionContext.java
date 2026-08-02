package com.discover.mpos.sdk.transaction.execution;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B[\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0016¢\u0006\u0002\u0010\u0017J\b\u0010=\u001a\u00020>H\u0016J\b\u0010?\u001a\u00020>H\u0016J\b\u0010@\u001a\u00020>H\u0016J\u0011\u0010A\u001a\u00020>2\u0006\u0010B\u001a\u00020.H\u0096\u0001J\t\u0010C\u001a\u00020\u000fH\u0096\u0001J\u0011\u0010D\u001a\u00020\u000f2\u0006\u0010E\u001a\u00020FH\u0096\u0001J\b\u0010G\u001a\u00020>H\u0016J\b\u0010H\u001a\u00020>H\u0016J\u0011\u0010I\u001a\u00020>2\u0006\u0010J\u001a\u00020KH\u0096\u0001J\b\u0010L\u001a\u00020>H\u0016J\u001e\u0010M\u001a\u00020>2\f\u0010N\u001a\b\u0012\u0004\u0012\u00020\u00010O2\u0006\u0010\f\u001a\u00020\rH\u0016R\u0014\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u001a\u0010\u000e\u001a\u00020\u000fX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010&\"\u0004\b'\u0010(R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010)\u001a\u00020*X\u0096\u0005¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0012\u0010-\u001a\u00020.X\u0096\u0005¢\u0006\u0006\u001a\u0004\b/\u00100R\u000e\u00101\u001a\u000202X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0014\u00105\u001a\u00020!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u0010#R\u0014\u0010\u0012\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0014\u0010\u0010\u001a\u00020\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<¨\u0006P"}, d2 = {"Lcom/discover/mpos/sdk/transaction/execution/TransactionContext;", "Lcom/discover/mpos/sdk/transaction/internal/InternalTransaction;", "Lcom/discover/mpos/sdk/core/emv/Clearable;", "Lcom/discover/mpos/sdk/data/TearingRecoveryStorage;", "config", "Lcom/discover/mpos/sdk/cardreader/config/ReaderConfiguration;", "transactionData", "Lcom/discover/mpos/sdk/transaction/TransactionData;", "card", "Lcom/discover/mpos/sdk/card/Card;", "processingData", "Lcom/discover/mpos/sdk/transaction/processing/ProcessingData;", "handler", "Lcom/discover/mpos/sdk/transaction/internal/InternalTransactionHandler;", "isCancelled", "", "unpredictableNumberGenerator", "Lcom/discover/mpos/sdk/security/unpredictablenumber/UnpredictableNumberGenerator;", "tearingRecoveryStorage", "jobManager", "Lcom/discover/mpos/sdk/core/concurent/JobManager;", "terminalProcessingBenchmark", "Lcom/discover/mpos/sdk/core/performance/Benchmark;", "(Lcom/discover/mpos/sdk/cardreader/config/ReaderConfiguration;Lcom/discover/mpos/sdk/transaction/TransactionData;Lcom/discover/mpos/sdk/card/Card;Lcom/discover/mpos/sdk/transaction/processing/ProcessingData;Lcom/discover/mpos/sdk/transaction/internal/InternalTransactionHandler;ZLcom/discover/mpos/sdk/security/unpredictablenumber/UnpredictableNumberGenerator;Lcom/discover/mpos/sdk/data/TearingRecoveryStorage;Lcom/discover/mpos/sdk/core/concurent/JobManager;Lcom/discover/mpos/sdk/core/performance/Benchmark;)V", "additionalData", "Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;", "getAdditionalData", "()Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;", "getCard", "()Lcom/discover/mpos/sdk/card/Card;", "getConfig", "()Lcom/discover/mpos/sdk/cardreader/config/ReaderConfiguration;", "executionTime", "", "getExecutionTime", "()J", "getHandler", "()Lcom/discover/mpos/sdk/transaction/internal/InternalTransactionHandler;", "()Z", "setCancelled", "(Z)V", "parameterP1", "", "getParameterP1", "()I", "pdolData", "Lcom/discover/mpos/sdk/transaction/processing/pdol/PdolData;", "getPdolData", "()Lcom/discover/mpos/sdk/transaction/processing/pdol/PdolData;", "postReadRecordBenchmark", "Lcom/discover/mpos/sdk/core/performance/PerformanceCounter;", "getProcessingData", "()Lcom/discover/mpos/sdk/transaction/processing/ProcessingData;", "readerTime", "getReaderTime", "getTearingRecoveryStorage", "()Lcom/discover/mpos/sdk/data/TearingRecoveryStorage;", "getTransactionData", "()Lcom/discover/mpos/sdk/transaction/TransactionData;", "getUnpredictableNumberGenerator", "()Lcom/discover/mpos/sdk/security/unpredictablenumber/UnpredictableNumberGenerator;", com.paypal.oslo.feature.identity.passwordrecovery.ui.analytics.PasswordRecoveryAnalytics.ITEM_CANCEL, "", "clear", "endPostReadRecordBenchmark", "fillPdolData", "transactionPdolData", "isEmpty", "isTearingRecoveryLogValidForRetrieval", "newData", "Lcom/discover/mpos/sdk/data/TearingRecoveryLogMatchingData;", "releaseJobManager", "resetPostReadRecordBenchmark", "saveTransactionDetails", "tearingLogTransactionDetails", "Lcom/discover/mpos/sdk/data/TearingLogTransactionDetails;", "startPostReadRecordBenchmark", "startProcessingFlow", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW, "Lcom/discover/mpos/sdk/transaction/execution/LinearTransactionExecutionFlow;", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.transaction.a.e, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final class TransactionContext implements com.discover.mpos.sdk.core.emv.Clearable, com.discover.mpos.sdk.data.TearingRecoveryStorage, com.discover.mpos.sdk.transaction.internal.InternalTransaction {

    /* renamed from: a, reason: collision with root package name */
    private final com.discover.mpos.sdk.core.performance.PerformanceCounter f3234a;
    private final com.discover.mpos.sdk.cardreader.config.ReaderConfiguration b;
    private final com.discover.mpos.sdk.transaction.TransactionData c;
    private final com.discover.mpos.sdk.card.Card d;
    private final com.discover.mpos.sdk.transaction.processing.ProcessingData e;
    private final com.discover.mpos.sdk.transaction.internal.InternalTransactionHandler f;
    private boolean g;
    private final com.discover.mpos.sdk.security.unpredictablenumber.UnpredictableNumberGenerator h;
    private final com.discover.mpos.sdk.data.TearingRecoveryStorage i;
    private final com.discover.mpos.sdk.core.concurent.JobManager j;
    private final com.discover.mpos.sdk.core.performance.Benchmark k;

    private TransactionContext(com.discover.mpos.sdk.cardreader.config.ReaderConfiguration readerConfiguration, com.discover.mpos.sdk.transaction.TransactionData transactionData, com.discover.mpos.sdk.card.Card card, com.discover.mpos.sdk.transaction.processing.ProcessingData processingData, com.discover.mpos.sdk.transaction.internal.InternalTransactionHandler internalTransactionHandler, com.discover.mpos.sdk.security.unpredictablenumber.UnpredictableNumberGenerator unpredictableNumberGenerator, com.discover.mpos.sdk.data.TearingRecoveryStorage tearingRecoveryStorage, com.discover.mpos.sdk.core.concurent.JobManager jobManager, com.discover.mpos.sdk.core.performance.Benchmark benchmark) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(readerConfiguration, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(card, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(processingData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalTransactionHandler, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unpredictableNumberGenerator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tearingRecoveryStorage, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jobManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(benchmark, "");
        this.b = readerConfiguration;
        this.c = transactionData;
        this.d = card;
        this.e = processingData;
        this.f = internalTransactionHandler;
        this.g = false;
        this.h = unpredictableNumberGenerator;
        this.i = tearingRecoveryStorage;
        this.j = jobManager;
        this.k = benchmark;
        this.f3234a = new com.discover.mpos.sdk.core.performance.PerformanceCounter();
    }

    @Override // com.discover.mpos.sdk.transaction.internal.InternalTransaction
    public final void a(com.discover.mpos.sdk.transaction.execution.LinearTransactionExecutionFlow<com.discover.mpos.sdk.transaction.internal.InternalTransaction> linearTransactionExecutionFlow) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linearTransactionExecutionFlow, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linearTransactionExecutionFlow, "");
        a(linearTransactionExecutionFlow, getF());
    }

    @Override // com.discover.mpos.sdk.transaction.Transaction
    /* renamed from: getConfig, reason: from getter */
    public final com.discover.mpos.sdk.cardreader.config.ReaderConfiguration getB() {
        return this.b;
    }

    @Override // com.discover.mpos.sdk.transaction.Transaction
    /* renamed from: getTransactionData, reason: from getter */
    public final com.discover.mpos.sdk.transaction.TransactionData getC() {
        return this.c;
    }

    @Override // com.discover.mpos.sdk.transaction.internal.InternalTransaction
    /* renamed from: i, reason: from getter */
    public final com.discover.mpos.sdk.card.Card getD() {
        return this.d;
    }

    @Override // com.discover.mpos.sdk.transaction.internal.InternalTransaction
    /* renamed from: j, reason: from getter */
    public final com.discover.mpos.sdk.transaction.processing.ProcessingData getE() {
        return this.e;
    }

    @Override // com.discover.mpos.sdk.transaction.internal.InternalTransaction
    /* renamed from: k, reason: from getter */
    public final com.discover.mpos.sdk.transaction.internal.InternalTransactionHandler getF() {
        return this.f;
    }

    @Override // com.discover.mpos.sdk.transaction.internal.InternalTransaction
    /* renamed from: l, reason: from getter */
    public final boolean getG() {
        return this.g;
    }

    @Override // com.discover.mpos.sdk.transaction.internal.InternalTransaction
    /* renamed from: m, reason: from getter */
    public final com.discover.mpos.sdk.security.unpredictablenumber.UnpredictableNumberGenerator getH() {
        return this.h;
    }

    @Override // com.discover.mpos.sdk.transaction.internal.InternalTransaction
    /* renamed from: n, reason: from getter */
    public final com.discover.mpos.sdk.data.TearingRecoveryStorage getI() {
        return this.i;
    }

    public /* synthetic */ TransactionContext(com.discover.mpos.sdk.cardreader.config.ReaderConfiguration readerConfiguration, com.discover.mpos.sdk.transaction.TransactionData transactionData, com.discover.mpos.sdk.card.Card card, com.discover.mpos.sdk.transaction.processing.ProcessingData processingData, com.discover.mpos.sdk.transaction.internal.InternalTransactionHandler internalTransactionHandler, com.discover.mpos.sdk.security.unpredictablenumber.UnpredictableNumberGenerator unpredictableNumberGenerator, com.discover.mpos.sdk.data.TearingRecoveryStorage tearingRecoveryStorage, com.discover.mpos.sdk.core.concurent.JobManager jobManager) {
        this(readerConfiguration, transactionData, card, processingData, internalTransactionHandler, unpredictableNumberGenerator, tearingRecoveryStorage, jobManager, new com.discover.mpos.sdk.core.performance.PerformanceCounter());
    }

    @Override // com.discover.mpos.sdk.transaction.Transaction
    public final long getReaderTime() {
        return getExecutionTime() - this.d.a().getExecutionTime();
    }

    @Override // com.discover.mpos.sdk.transaction.internal.InternalTransaction
    public final void e() {
        this.f3234a.start();
    }

    @Override // com.discover.mpos.sdk.transaction.internal.InternalTransaction
    public final void f() {
        this.f3234a.stop();
    }

    @Override // com.discover.mpos.sdk.transaction.internal.InternalTransaction
    public final void g() {
        this.f3234a.reset();
    }

    @Override // com.discover.mpos.sdk.transaction.internal.InternalTransaction
    public final void a(com.discover.mpos.sdk.transaction.execution.LinearTransactionExecutionFlow<com.discover.mpos.sdk.transaction.internal.InternalTransaction> linearTransactionExecutionFlow, com.discover.mpos.sdk.transaction.internal.InternalTransactionHandler internalTransactionHandler) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linearTransactionExecutionFlow, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalTransactionHandler, "");
        com.discover.mpos.sdk.transaction.execution.TransactionContext transactionContext = this;
        new com.discover.mpos.sdk.transaction.execution.TransactionEx(new com.discover.mpos.sdk.transaction.execution.TransactionProvider(), linearTransactionExecutionFlow, transactionContext, this.j, new com.discover.mpos.sdk.transaction.internal.TransactionExecutionProxyHandler(transactionContext, internalTransactionHandler, this.k)).r();
    }

    @Override // com.discover.mpos.sdk.transaction.internal.InternalTransaction
    public final void h() {
        this.j.cancelAll();
    }

    @Override // com.discover.mpos.sdk.transaction.Transaction
    public final long getExecutionTime() {
        return (this.d.a().getConnectionTime() - this.k.getTotalTime()) - this.f3234a.getTotalTime();
    }

    @Override // com.discover.mpos.sdk.core.emv.Clearable
    public final void clear() {
        this.e.clear();
    }

    @Override // com.discover.mpos.sdk.transaction.Transaction
    public final void cancel() {
        if (this.g) {
            return;
        }
        this.g = true;
        this.j.cancelAll();
        clear();
        this.f.a(this, new com.discover.mpos.sdk.transaction.outcome.TransactionOutcome(com.discover.mpos.sdk.transaction.outcome.OutcomeType.END_APPLICATION, null, 2, null));
    }

    @Override // com.discover.mpos.sdk.transaction.internal.InternalTransaction
    public final boolean o() {
        boolean p = getE().p();
        boolean z = getE().A;
        new java.lang.Object[]{java.lang.Boolean.valueOf(p)};
        new java.lang.Object[]{java.lang.Boolean.valueOf(z)};
        new java.lang.Object[]{getI()};
        return p && z && !getI().d();
    }

    @Override // com.discover.mpos.sdk.transaction.internal.InternalTransaction
    public final void p() {
        boolean z = getE().A;
        new java.lang.Object[]{java.lang.Boolean.valueOf(z)};
        if (z) {
            getI().clear();
        }
    }

    @Override // com.discover.mpos.sdk.data.TearingRecoveryStorage
    public final boolean d() {
        return this.i.d();
    }

    @Override // com.discover.mpos.sdk.data.TearingRecoveryStorage
    public final com.discover.mpos.sdk.core.emv.tlv.Tlv c() {
        return this.i.c();
    }

    @Override // com.discover.mpos.sdk.data.TearingRecoveryStorage
    public final com.discover.mpos.sdk.transaction.processing.pdol.PdolData b() {
        return this.i.b();
    }

    @Override // com.discover.mpos.sdk.data.TearingRecoveryStorage
    public final boolean a(com.discover.mpos.sdk.data.TearingRecoveryLogMatchingData tearingRecoveryLogMatchingData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tearingRecoveryLogMatchingData, "");
        return this.i.a(tearingRecoveryLogMatchingData);
    }

    @Override // com.discover.mpos.sdk.data.TearingRecoveryStorage
    public final void a(com.discover.mpos.sdk.transaction.processing.pdol.PdolData pdolData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pdolData, "");
        this.i.a(pdolData);
    }

    @Override // com.discover.mpos.sdk.data.TearingRecoveryStorage
    public final void a(com.discover.mpos.sdk.data.TearingLogTransactionDetails tearingLogTransactionDetails) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tearingLogTransactionDetails, "");
        this.i.a(tearingLogTransactionDetails);
    }

    @Override // com.discover.mpos.sdk.data.TearingRecoveryStorage
    public final int a() {
        return this.i.a();
    }
}
