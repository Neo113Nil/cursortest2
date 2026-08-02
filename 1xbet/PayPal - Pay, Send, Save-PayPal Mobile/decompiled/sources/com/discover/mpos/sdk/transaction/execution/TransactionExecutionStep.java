package com.discover.mpos.sdk.transaction.execution;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00030\u0002J*\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0016J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H&¨\u0006\n"}, d2 = {"Lcom/discover/mpos/sdk/transaction/execution/TransactionExecutionStep;", "Data", "Lcom/discover/mpos/sdk/flow/ExecutionStep;", "Lcom/discover/mpos/sdk/transaction/execution/TransactionEx;", "execute", "", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW, "Lcom/discover/mpos/sdk/flow/ExecutionFlow;", "input", "transaction", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.transaction.a.j, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public interface TransactionExecutionStep<Data> extends com.discover.mpos.sdk.flow.ExecutionStep<com.discover.mpos.sdk.transaction.execution.TransactionEx<Data>> {
    void a(com.discover.mpos.sdk.transaction.execution.TransactionEx<Data> transactionEx);

    @kotlin.Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 1})
    /* renamed from: com.discover.mpos.sdk.transaction.a.j$a */
    public static final class a {
        public static <Data> void a(com.discover.mpos.sdk.transaction.execution.TransactionExecutionStep<Data> transactionExecutionStep, com.discover.mpos.sdk.flow.ExecutionFlow<? super com.discover.mpos.sdk.transaction.execution.TransactionEx<Data>> executionFlow, com.discover.mpos.sdk.transaction.execution.TransactionEx<Data> transactionEx) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executionFlow, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionEx, "");
            transactionExecutionStep.a(transactionEx);
        }
    }
}
