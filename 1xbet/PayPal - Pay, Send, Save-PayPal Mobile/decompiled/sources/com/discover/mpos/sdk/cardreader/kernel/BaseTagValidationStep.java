package com.discover.mpos.sdk.cardreader.kernel;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b \u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0006H\u0014J\b\u0010\f\u001a\u00020\rH$J\u0016\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0016J \u0010\u0012\u001a\u00020\u000f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00062\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0014J\u001e\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u00062\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0014J\u0016\u0010\u0014\u001a\u00020\u00062\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H$R\u0018\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u0016"}, d2 = {"Lcom/discover/mpos/sdk/cardreader/kernel/BaseTagValidationStep;", "InputData", "Lcom/discover/mpos/sdk/transaction/execution/TransactionExecutionStep;", "()V", "validator", "Lcom/discover/mpos/sdk/core/emv/Validator;", "Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;", "getValidator", "()Lcom/discover/mpos/sdk/core/emv/Validator;", "customChecksPassed", "", "tlv", "debugTag", "", "execute", "", "transaction", "Lcom/discover/mpos/sdk/transaction/execution/TransactionEx;", "handleValidationFailure", "handleValidationSucceed", "retrieveTag", "input", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.cardreader.kernel.a, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public abstract class BaseTagValidationStep<InputData> implements com.discover.mpos.sdk.transaction.execution.TransactionExecutionStep<InputData> {
    protected abstract com.discover.mpos.sdk.core.emv.Validator<com.discover.mpos.sdk.core.emv.tlv.Tlv> a();

    protected abstract com.discover.mpos.sdk.core.emv.tlv.Tlv b(com.discover.mpos.sdk.transaction.execution.TransactionEx<InputData> transactionEx);

    protected abstract java.lang.String b();

    @Override // com.discover.mpos.sdk.flow.ExecutionStep
    public final /* synthetic */ void a(com.discover.mpos.sdk.flow.ExecutionFlow executionFlow, java.lang.Object obj) {
        com.discover.mpos.sdk.transaction.execution.TransactionEx transactionEx = (com.discover.mpos.sdk.transaction.execution.TransactionEx) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executionFlow, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionEx, "");
        com.discover.mpos.sdk.transaction.execution.TransactionExecutionStep.a.a(this, executionFlow, transactionEx);
    }

    @Override // com.discover.mpos.sdk.transaction.execution.TransactionExecutionStep
    public final void a(com.discover.mpos.sdk.transaction.execution.TransactionEx<InputData> transactionEx) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionEx, "");
        com.discover.mpos.sdk.core.emv.tlv.Tlv b = b(transactionEx);
        if (a().isValid(b)) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(b, "");
            b(b, transactionEx);
        } else {
            a(b, transactionEx);
        }
    }

    public void a(com.discover.mpos.sdk.core.emv.tlv.Tlv tlv, com.discover.mpos.sdk.transaction.execution.TransactionEx<InputData> transactionEx) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionEx, "");
        java.lang.Object obj = tlv;
        if (tlv == null) {
            obj = "NO Tlv";
        }
        new java.lang.Object[]{obj};
        com.discover.mpos.sdk.transaction.execution.TransactionFlowHandler.a.a(transactionEx, com.discover.mpos.sdk.transaction.execution.TransactionEndStatus.b, null, false, 6);
    }

    public void b(com.discover.mpos.sdk.core.emv.tlv.Tlv tlv, com.discover.mpos.sdk.transaction.execution.TransactionEx<InputData> transactionEx) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tlv, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionEx, "");
        transactionEx.t();
    }
}
