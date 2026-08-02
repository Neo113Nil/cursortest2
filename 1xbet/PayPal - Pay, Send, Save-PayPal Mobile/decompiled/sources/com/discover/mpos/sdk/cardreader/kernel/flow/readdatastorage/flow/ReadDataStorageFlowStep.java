package com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.flow;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b`\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0016J\b\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, d2 = {"Lcom/discover/mpos/sdk/cardreader/kernel/flow/readdatastorage/flow/ReadDataStorageFlowStep;", "Data", "Lcom/discover/mpos/sdk/transaction/execution/TransactionExecutionStep;", "abortTransaction", "", "transaction", "Lcom/discover/mpos/sdk/transaction/execution/TransactionEx;", "debugTag", "", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.b.d, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public interface ReadDataStorageFlowStep<Data> extends com.discover.mpos.sdk.transaction.execution.TransactionExecutionStep<Data> {

    @kotlin.Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 1})
    /* renamed from: com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.b.d$a */
    public static final class a {
        public static <Data> void a(com.discover.mpos.sdk.transaction.execution.TransactionEx<Data> transactionEx) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionEx, "");
            transactionEx.j().y = false;
            new java.lang.Object[]{java.lang.Boolean.valueOf(transactionEx.j().y)};
            transactionEx.s();
        }

        public static <Data> void a(com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.flow.ReadDataStorageFlowStep<Data> readDataStorageFlowStep, com.discover.mpos.sdk.flow.ExecutionFlow<? super com.discover.mpos.sdk.transaction.execution.TransactionEx<Data>> executionFlow, com.discover.mpos.sdk.transaction.execution.TransactionEx<Data> transactionEx) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executionFlow, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionEx, "");
            com.discover.mpos.sdk.transaction.execution.TransactionExecutionStep.a.a(readDataStorageFlowStep, executionFlow, transactionEx);
        }
    }
}
