package com.discover.mpos.sdk.transaction.execution;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00030\u0002B\u0005¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0016J\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\bH\u0016¨\u0006\t"}, d2 = {"Lcom/discover/mpos/sdk/transaction/execution/LinearTransactionExecutionFlow;", "Data", "Lcom/discover/mpos/sdk/flow/LinearExecutionFlow;", "Lcom/discover/mpos/sdk/transaction/execution/TransactionEx;", "()V", "build", "withStep", "step", "Lcom/discover/mpos/sdk/flow/ExecutionStep;", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.transaction.a.b, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final class LinearTransactionExecutionFlow<Data> extends com.discover.mpos.sdk.flow.LinearExecutionFlow<com.discover.mpos.sdk.transaction.execution.TransactionEx<Data>> {
    @Override // com.discover.mpos.sdk.flow.LinearExecutionFlow, com.discover.mpos.sdk.flow.ExecutionFlowBuilder
    public final /* bridge */ /* synthetic */ com.discover.mpos.sdk.flow.ExecutionFlow c() {
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.discover.mpos.sdk.flow.LinearExecutionFlow, com.discover.mpos.sdk.flow.ExecutionFlowBuilder
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final com.discover.mpos.sdk.transaction.execution.LinearTransactionExecutionFlow<Data> a(com.discover.mpos.sdk.flow.ExecutionStep<com.discover.mpos.sdk.transaction.execution.TransactionEx<Data>> executionStep) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executionStep, "");
        super.a((com.discover.mpos.sdk.flow.ExecutionStep) executionStep);
        return this;
    }
}
