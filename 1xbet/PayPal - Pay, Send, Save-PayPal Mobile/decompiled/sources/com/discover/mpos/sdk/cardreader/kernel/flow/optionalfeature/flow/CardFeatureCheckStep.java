package com.discover.mpos.sdk.cardreader.kernel.flow.optionalfeature.flow;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0007H\u0002J\u0016\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0016J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/discover/mpos/sdk/cardreader/kernel/flow/optionalfeature/flow/CardFeatureCheckStep;", "Lcom/discover/mpos/sdk/transaction/execution/TransactionExecutionStep;", "Lcom/discover/mpos/sdk/cardreader/kernel/flow/optionalfeature/data/OptionalFeatureData;", "()V", "expectedVersionNumberValue", "", "debugTag", "", "execute", "", "transaction", "Lcom/discover/mpos/sdk/transaction/execution/TransactionEx;", "validateVersionNumber", "", "versionNumber", "Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.cardreader.kernel.flow.f.b.a, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final class CardFeatureCheckStep implements com.discover.mpos.sdk.transaction.execution.TransactionExecutionStep<com.discover.mpos.sdk.cardreader.kernel.flow.optionalfeature.data.OptionalFeatureData> {

    /* renamed from: a, reason: collision with root package name */
    private final byte f3147a = 2;

    @Override // com.discover.mpos.sdk.flow.ExecutionStep
    public final /* synthetic */ void a(com.discover.mpos.sdk.flow.ExecutionFlow executionFlow, java.lang.Object obj) {
        com.discover.mpos.sdk.transaction.execution.TransactionEx transactionEx = (com.discover.mpos.sdk.transaction.execution.TransactionEx) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executionFlow, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionEx, "");
        com.discover.mpos.sdk.transaction.execution.TransactionExecutionStep.a.a(this, executionFlow, transactionEx);
    }

    @Override // com.discover.mpos.sdk.transaction.execution.TransactionExecutionStep
    public final void a(com.discover.mpos.sdk.transaction.execution.TransactionEx<com.discover.mpos.sdk.cardreader.kernel.flow.optionalfeature.data.OptionalFeatureData> transactionEx) {
        byte[] content;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionEx, "");
        com.discover.mpos.sdk.transaction.processing.ProcessingData j = transactionEx.j();
        com.discover.mpos.sdk.core.emv.tlv.Tlv t = j.t();
        com.discover.mpos.sdk.cardreader.kernel.flow.optionalfeature.data.CardFeatureDescriptor s = j.s();
        new java.lang.Object[]{t != null ? t.getContent() : null, s};
        if (t != null && (content = t.getContent()) != null && java.util.Arrays.equals(content, new byte[]{this.f3147a}) && s != null && s.f3144a) {
            transactionEx.t();
            return;
        }
        com.discover.mpos.sdk.transaction.processing.ProcessingData.a aVar = j.B;
        kotlin.reflect.KProperty kProperty = com.discover.mpos.sdk.transaction.processing.ProcessingData.f3244a[20];
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(j, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kProperty, "");
        aVar.f3246a = null;
        aVar.b = true;
        transactionEx.s();
    }
}
