package com.discover.mpos.sdk.cardreader.entrypoint;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001:\u0004\u0015\u0016\u0017\u0018B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\b\u001a\u00020\tH\u0002J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0006H\u0016J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R*\u0010\u0003\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006`\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/discover/mpos/sdk/cardreader/entrypoint/DPasEntryPoint;", "Lcom/discover/mpos/sdk/cardreader/entrypoint/EntryPoint;", "()V", "kernels", "Ljava/util/HashMap;", "Lcom/discover/mpos/sdk/cardreader/entrypoint/model/Combination;", "Lcom/discover/mpos/sdk/cardreader/kernel/Kernel;", "Lkotlin/collections/HashMap;", "debugTag", "", "registerKernel", "", "combination", "kernel", "startA", "transaction", "Lcom/discover/mpos/sdk/transaction/internal/InternalTransaction;", "startB", "startC", "startD", "startRePresentment", "CheckUnpredictableNumberStep", "GenerateUnpredictableNumberStep", "KernelExecution", "TransactionLocalHandler", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.cardreader.entrypoint.a, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final class DPasEntryPoint implements com.discover.mpos.sdk.cardreader.entrypoint.EntryPoint {

    /* renamed from: a, reason: collision with root package name */
    final java.util.HashMap<com.discover.mpos.sdk.cardreader.entrypoint.model.Combination, com.discover.mpos.sdk.cardreader.kernel.Kernel> f2983a = new java.util.HashMap<>();

    @Override // com.discover.mpos.sdk.cardreader.entrypoint.EntryPoint
    public final void a(com.discover.mpos.sdk.cardreader.entrypoint.model.Combination combination, com.discover.mpos.sdk.cardreader.kernel.Kernel kernel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(combination, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kernel, "");
        this.f2983a.put(combination, kernel);
    }

    @Override // com.discover.mpos.sdk.cardreader.entrypoint.EntryPoint
    public final void a(com.discover.mpos.sdk.transaction.internal.InternalTransaction internalTransaction) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalTransaction, "");
        internalTransaction.a(new com.discover.mpos.sdk.transaction.execution.LinearTransactionExecutionFlow().a((com.discover.mpos.sdk.flow.ExecutionStep) new com.discover.mpos.sdk.cardreader.entrypoint.flow.TerminalTypeCheckStep()).a((com.discover.mpos.sdk.flow.ExecutionStep) new com.discover.mpos.sdk.cardreader.entrypoint.DPasEntryPoint.b()).a((com.discover.mpos.sdk.flow.ExecutionStep) new com.discover.mpos.sdk.cardreader.entrypoint.flow.preprocessing.PreProcessingTransactionStep()).a((com.discover.mpos.sdk.flow.ExecutionStep) new com.discover.mpos.sdk.cardreader.entrypoint.flow.protocolactivation.ProtocolActivationTransactionStep()).a((com.discover.mpos.sdk.flow.ExecutionStep) new com.discover.mpos.sdk.cardreader.entrypoint.flow.combinationselection.BuildCombinationTransactionStep()).a((com.discover.mpos.sdk.flow.ExecutionStep) new com.discover.mpos.sdk.cardreader.entrypoint.flow.combinationselection.flow.CombinationSelectionStep()).a((com.discover.mpos.sdk.flow.ExecutionStep) new com.discover.mpos.sdk.cardreader.entrypoint.DPasEntryPoint.c()), new com.discover.mpos.sdk.cardreader.entrypoint.DPasEntryPoint.d(this, internalTransaction.k()));
    }

    @Override // com.discover.mpos.sdk.cardreader.entrypoint.EntryPoint
    public final void b(com.discover.mpos.sdk.transaction.internal.InternalTransaction internalTransaction) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalTransaction, "");
        internalTransaction.a(new com.discover.mpos.sdk.transaction.execution.LinearTransactionExecutionFlow().a((com.discover.mpos.sdk.flow.ExecutionStep) new com.discover.mpos.sdk.cardreader.entrypoint.flow.TerminalTypeCheckStep()).a((com.discover.mpos.sdk.flow.ExecutionStep) new com.discover.mpos.sdk.cardreader.entrypoint.DPasEntryPoint.a()).a((com.discover.mpos.sdk.flow.ExecutionStep) new com.discover.mpos.sdk.cardreader.entrypoint.DPasEntryPoint.c()));
    }

    @Override // com.discover.mpos.sdk.cardreader.entrypoint.EntryPoint
    public final void c(com.discover.mpos.sdk.transaction.internal.InternalTransaction internalTransaction) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalTransaction, "");
        com.discover.mpos.sdk.transaction.execution.LinearTransactionExecutionFlow<com.discover.mpos.sdk.transaction.internal.InternalTransaction> a2 = new com.discover.mpos.sdk.transaction.execution.LinearTransactionExecutionFlow().a((com.discover.mpos.sdk.flow.ExecutionStep) new com.discover.mpos.sdk.cardreader.entrypoint.DPasEntryPoint.b()).a((com.discover.mpos.sdk.flow.ExecutionStep) new com.discover.mpos.sdk.cardreader.entrypoint.flow.protocolactivation.ProtocolActivationTransactionStep()).a((com.discover.mpos.sdk.flow.ExecutionStep) new com.discover.mpos.sdk.cardreader.entrypoint.flow.combinationselection.flow.CombinationSelectionStep()).a((com.discover.mpos.sdk.flow.ExecutionStep) new com.discover.mpos.sdk.cardreader.entrypoint.DPasEntryPoint.c());
        internalTransaction.j().d = true;
        internalTransaction.a(a2, new com.discover.mpos.sdk.cardreader.entrypoint.DPasEntryPoint.d(this, internalTransaction.k()));
    }

    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0016J\u0012\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u0002H\u0002¨\u0006\u000b"}, d2 = {"Lcom/discover/mpos/sdk/cardreader/entrypoint/DPasEntryPoint$KernelExecution;", "Lcom/discover/mpos/sdk/transaction/execution/TransactionExecutionStep;", "Lcom/discover/mpos/sdk/transaction/internal/InternalTransaction;", "(Lcom/discover/mpos/sdk/cardreader/entrypoint/DPasEntryPoint;)V", "execute", "", "transaction", "Lcom/discover/mpos/sdk/transaction/execution/TransactionEx;", "getActivationKernel", "Lcom/discover/mpos/sdk/cardreader/kernel/Kernel;", "input", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
    /* renamed from: com.discover.mpos.sdk.cardreader.entrypoint.a$c */
    final class c implements com.discover.mpos.sdk.transaction.execution.TransactionExecutionStep<com.discover.mpos.sdk.transaction.internal.InternalTransaction> {
        public c() {
        }

        @Override // com.discover.mpos.sdk.flow.ExecutionStep
        public final /* synthetic */ void a(com.discover.mpos.sdk.flow.ExecutionFlow executionFlow, java.lang.Object obj) {
            com.discover.mpos.sdk.transaction.execution.TransactionEx transactionEx = (com.discover.mpos.sdk.transaction.execution.TransactionEx) obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executionFlow, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionEx, "");
            com.discover.mpos.sdk.transaction.execution.TransactionExecutionStep.a.a(this, executionFlow, transactionEx);
        }

        @Override // com.discover.mpos.sdk.transaction.execution.TransactionExecutionStep
        public final void a(com.discover.mpos.sdk.transaction.execution.TransactionEx<com.discover.mpos.sdk.transaction.internal.InternalTransaction> transactionEx) {
            com.discover.mpos.sdk.cardreader.kernel.Kernel kernel;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionEx, "");
            com.discover.mpos.sdk.transaction.execution.TransactionEx<com.discover.mpos.sdk.transaction.internal.InternalTransaction> transactionEx2 = transactionEx;
            java.util.HashMap<com.discover.mpos.sdk.cardreader.entrypoint.model.Combination, com.discover.mpos.sdk.cardreader.kernel.Kernel> hashMap = com.discover.mpos.sdk.cardreader.entrypoint.DPasEntryPoint.this.f2983a;
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            for (java.util.Map.Entry<com.discover.mpos.sdk.cardreader.entrypoint.model.Combination, com.discover.mpos.sdk.cardreader.kernel.Kernel> entry : hashMap.entrySet()) {
                if (transactionEx2.j().h.a(entry.getKey().b)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            if (linkedHashMap.keySet().isEmpty()) {
                kernel = null;
            } else {
                new java.lang.Object[]{((com.discover.mpos.sdk.cardreader.entrypoint.model.Combination) kotlin.collections.CollectionsKt.first(linkedHashMap.keySet())).f3009a};
                kernel = (com.discover.mpos.sdk.cardreader.kernel.Kernel) linkedHashMap.get(kotlin.collections.CollectionsKt.first(linkedHashMap.keySet()));
            }
            if (kernel == null) {
                com.discover.mpos.sdk.transaction.execution.TransactionFlowHandler.a.a(transactionEx, 0, null, false, 7);
            } else {
                kernel.a(transactionEx2);
            }
        }
    }

    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"Lcom/discover/mpos/sdk/cardreader/entrypoint/DPasEntryPoint$GenerateUnpredictableNumberStep;", "Lcom/discover/mpos/sdk/transaction/execution/TransactionExecutionStep;", "Lcom/discover/mpos/sdk/transaction/internal/InternalTransaction;", "(Lcom/discover/mpos/sdk/cardreader/entrypoint/DPasEntryPoint;)V", "execute", "", "transaction", "Lcom/discover/mpos/sdk/transaction/execution/TransactionEx;", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
    /* renamed from: com.discover.mpos.sdk.cardreader.entrypoint.a$b */
    final class b implements com.discover.mpos.sdk.transaction.execution.TransactionExecutionStep<com.discover.mpos.sdk.transaction.internal.InternalTransaction> {
        public b() {
        }

        @Override // com.discover.mpos.sdk.flow.ExecutionStep
        public final /* synthetic */ void a(com.discover.mpos.sdk.flow.ExecutionFlow executionFlow, java.lang.Object obj) {
            com.discover.mpos.sdk.transaction.execution.TransactionEx transactionEx = (com.discover.mpos.sdk.transaction.execution.TransactionEx) obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executionFlow, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionEx, "");
            com.discover.mpos.sdk.transaction.execution.TransactionExecutionStep.a.a(this, executionFlow, transactionEx);
        }

        @Override // com.discover.mpos.sdk.transaction.execution.TransactionExecutionStep
        public final void a(com.discover.mpos.sdk.transaction.execution.TransactionEx<com.discover.mpos.sdk.transaction.internal.InternalTransaction> transactionEx) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionEx, "");
            com.discover.mpos.sdk.transaction.processing.ProcessingData j = transactionEx.j();
            byte[] a2 = transactionEx.m().a();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(a2, "");
            j.e = a2;
            transactionEx.t();
        }
    }

    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/discover/mpos/sdk/cardreader/entrypoint/DPasEntryPoint$CheckUnpredictableNumberStep;", "Lcom/discover/mpos/sdk/transaction/execution/TransactionExecutionStep;", "Lcom/discover/mpos/sdk/transaction/internal/InternalTransaction;", "(Lcom/discover/mpos/sdk/cardreader/entrypoint/DPasEntryPoint;)V", "UN_SIZE", "", "execute", "", "transaction", "Lcom/discover/mpos/sdk/transaction/execution/TransactionEx;", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
    /* renamed from: com.discover.mpos.sdk.cardreader.entrypoint.a$a */
    final class a implements com.discover.mpos.sdk.transaction.execution.TransactionExecutionStep<com.discover.mpos.sdk.transaction.internal.InternalTransaction> {
        private final int b = 4;

        public a() {
        }

        @Override // com.discover.mpos.sdk.flow.ExecutionStep
        public final /* synthetic */ void a(com.discover.mpos.sdk.flow.ExecutionFlow executionFlow, java.lang.Object obj) {
            com.discover.mpos.sdk.transaction.execution.TransactionEx transactionEx = (com.discover.mpos.sdk.transaction.execution.TransactionEx) obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executionFlow, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionEx, "");
            com.discover.mpos.sdk.transaction.execution.TransactionExecutionStep.a.a(this, executionFlow, transactionEx);
        }

        @Override // com.discover.mpos.sdk.transaction.execution.TransactionExecutionStep
        public final void a(com.discover.mpos.sdk.transaction.execution.TransactionEx<com.discover.mpos.sdk.transaction.internal.InternalTransaction> transactionEx) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionEx, "");
            com.discover.mpos.sdk.transaction.processing.ProcessingData j = transactionEx.j();
            if (this.b == j.b().length) {
                transactionEx.t();
            } else {
                new java.lang.Object[]{java.lang.Integer.valueOf(j.b().length)};
                com.discover.mpos.sdk.transaction.execution.TransactionFlowHandler.a.a(transactionEx, 0, null, false, 7);
            }
        }
    }

    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003J#\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0096\u0001J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eH\u0016J%\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\f0\u0013H\u0096\u0001J%\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00162\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\f0\u0013H\u0096\u0001J\u0019\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0019H\u0096\u0001R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/discover/mpos/sdk/cardreader/entrypoint/DPasEntryPoint$TransactionLocalHandler;", "Lcom/discover/mpos/sdk/transaction/internal/InternalTransactionHandler;", "handler", "(Lcom/discover/mpos/sdk/cardreader/entrypoint/DPasEntryPoint;Lcom/discover/mpos/sdk/transaction/internal/InternalTransactionHandler;)V", "onCAPKeyRequest", "Lcom/discover/mpos/sdk/data/external/TerminalCAPublicKey;", "transaction", "Lcom/discover/mpos/sdk/transaction/internal/InternalTransaction;", "rid", "", "iccPKIndex", "onComplete", "", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.OUTCOME, "Lcom/discover/mpos/sdk/transaction/outcome/TransactionOutcome;", "onDataStorageProcessingRequest", "request", "Lcom/discover/mpos/sdk/data/external/readdatarecord/DataStorageRequest;", "response", "Lkotlin/Function1;", "Lcom/discover/mpos/sdk/data/external/readdatarecord/DataStorageResponse;", "onExtendedLoggingDataProcessingRequest", "Lcom/discover/mpos/sdk/data/external/initiateapplicationprocessingconnect/ExtendedLoggingDataRequest;", "Lcom/discover/mpos/sdk/data/external/initiateapplicationprocessingconnect/ExtendedLoggingDataResponse;", "onUIRequest", "Lcom/discover/mpos/sdk/transaction/outcome/UiRequest;", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
    /* renamed from: com.discover.mpos.sdk.cardreader.entrypoint.a$d */
    final class d implements com.discover.mpos.sdk.transaction.internal.InternalTransactionHandler {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.discover.mpos.sdk.cardreader.entrypoint.DPasEntryPoint f3006a;
        private final com.discover.mpos.sdk.transaction.internal.InternalTransactionHandler b;

        public d(com.discover.mpos.sdk.cardreader.entrypoint.DPasEntryPoint dPasEntryPoint, com.discover.mpos.sdk.transaction.internal.InternalTransactionHandler internalTransactionHandler) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalTransactionHandler, "");
            this.f3006a = dPasEntryPoint;
            this.b = internalTransactionHandler;
        }

        @Override // com.discover.mpos.sdk.transaction.internal.InternalTransactionHandler
        public final void a(com.discover.mpos.sdk.transaction.internal.InternalTransaction internalTransaction, com.discover.mpos.sdk.transaction.outcome.TransactionOutcome transactionOutcome) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalTransaction, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionOutcome, "");
            int i = com.discover.mpos.sdk.cardreader.entrypoint.b.f3007a[transactionOutcome.getType().ordinal()];
            if (i != 1) {
                if (i == 2) {
                    new java.lang.Object[]{transactionOutcome, transactionOutcome.getParams().getStart()};
                    internalTransaction.j().u();
                    com.discover.mpos.sdk.cardreader.entrypoint.DPasEntryPoint dPasEntryPoint = this.f3006a;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalTransaction, "");
                    internalTransaction.a(new com.discover.mpos.sdk.transaction.execution.LinearTransactionExecutionFlow().a((com.discover.mpos.sdk.flow.ExecutionStep) dPasEntryPoint.new b()).a((com.discover.mpos.sdk.flow.ExecutionStep) new com.discover.mpos.sdk.cardreader.entrypoint.flow.combinationselection.flow.CombinationSelectionStep()).a((com.discover.mpos.sdk.flow.ExecutionStep) dPasEntryPoint.new c()), new com.discover.mpos.sdk.cardreader.entrypoint.DPasEntryPoint.d(dPasEntryPoint, internalTransaction.k()));
                    return;
                }
                if (i == 3) {
                    transactionOutcome.getParams().getStart();
                }
                internalTransaction.k().a(internalTransaction, transactionOutcome);
                return;
            }
            new java.lang.Object[]{transactionOutcome, transactionOutcome.getParams().getStart()};
            internalTransaction.g();
            com.discover.mpos.sdk.transaction.processing.ProcessingData j = internalTransaction.j();
            j.d = true;
            j.h.a();
            j.u();
            internalTransaction.j().f = transactionOutcome.getParams();
            com.discover.mpos.sdk.cardreader.entrypoint.DPasEntryPoint dPasEntryPoint2 = this.f3006a;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalTransaction, "");
            internalTransaction.a(new com.discover.mpos.sdk.transaction.execution.LinearTransactionExecutionFlow().a((com.discover.mpos.sdk.flow.ExecutionStep) dPasEntryPoint2.new b()).a((com.discover.mpos.sdk.flow.ExecutionStep) new com.discover.mpos.sdk.cardreader.entrypoint.flow.protocolactivation.ProtocolActivationTransactionStep()).a((com.discover.mpos.sdk.flow.ExecutionStep) new com.discover.mpos.sdk.cardreader.entrypoint.flow.combinationselection.BuildCombinationTransactionStep()).a((com.discover.mpos.sdk.flow.ExecutionStep) new com.discover.mpos.sdk.cardreader.entrypoint.flow.combinationselection.flow.CombinationSelectionStep()).a((com.discover.mpos.sdk.flow.ExecutionStep) dPasEntryPoint2.new c()), new com.discover.mpos.sdk.cardreader.entrypoint.DPasEntryPoint.d(dPasEntryPoint2, internalTransaction.k()));
        }

        @Override // com.discover.mpos.sdk.transaction.internal.InternalTransactionHandler
        public final void a(com.discover.mpos.sdk.transaction.internal.InternalTransaction internalTransaction, com.discover.mpos.sdk.transaction.outcome.UiRequest uiRequest) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalTransaction, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiRequest, "");
            this.b.a(internalTransaction, uiRequest);
        }

        @Override // com.discover.mpos.sdk.transaction.internal.InternalTransactionHandler
        public final void a(com.discover.mpos.sdk.data.external.readdatarecord.DataStorageRequest dataStorageRequest, kotlin.jvm.functions.Function1<? super com.discover.mpos.sdk.data.external.readdatarecord.DataStorageResponse, kotlin.Unit> function1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataStorageRequest, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
            this.b.a(dataStorageRequest, function1);
        }

        @Override // com.discover.mpos.sdk.transaction.internal.InternalTransactionHandler
        public final void a(com.discover.mpos.sdk.data.external.initiateapplicationprocessingconnect.ExtendedLoggingDataRequest extendedLoggingDataRequest, kotlin.jvm.functions.Function1<? super com.discover.mpos.sdk.data.external.initiateapplicationprocessingconnect.ExtendedLoggingDataResponse, kotlin.Unit> function1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extendedLoggingDataRequest, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
            this.b.a(extendedLoggingDataRequest, function1);
        }

        @Override // com.discover.mpos.sdk.transaction.internal.InternalTransactionHandler
        public final com.discover.mpos.sdk.data.external.TerminalCAPublicKey a(com.discover.mpos.sdk.transaction.internal.InternalTransaction internalTransaction, java.lang.String str, java.lang.String str2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalTransaction, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            return this.b.a(internalTransaction, str, str2);
        }
    }
}
