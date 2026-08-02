package com.discover.mpos.sdk.cardreader.kernel.flow.cvm.flow.onlinepin.flow.cdcvm.flow.mobileonly.model;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/discover/mpos/sdk/cardreader/kernel/flow/cvm/flow/onlinepin/flow/cdcvm/flow/mobileonly/model/CdCvmMobileOnlyDataProvider;", "Lcom/discover/mpos/sdk/transaction/execution/TransactionExecutionDataProvider;", "Lcom/discover/mpos/sdk/cardreader/kernel/flow/cvm/flow/onlinepin/flow/cdcvm/flow/mobileonly/model/CdCvmMobileOnlyData;", "()V", "getData", "transaction", "Lcom/discover/mpos/sdk/transaction/execution/TransactionEx;", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.cardreader.kernel.flow.a.a.a.a.a.a.a.b.b, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final class CdCvmMobileOnlyDataProvider implements com.discover.mpos.sdk.transaction.execution.TransactionExecutionDataProvider<com.discover.mpos.sdk.cardreader.kernel.flow.cvm.flow.onlinepin.flow.cdcvm.flow.mobileonly.model.CdCvmMobileOnlyData> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.discover.mpos.sdk.transaction.execution.TransactionExecutionDataProvider
    public final /* synthetic */ com.discover.mpos.sdk.cardreader.kernel.flow.cvm.flow.onlinepin.flow.cdcvm.flow.mobileonly.model.CdCvmMobileOnlyData a(com.discover.mpos.sdk.transaction.execution.TransactionEx<com.discover.mpos.sdk.cardreader.kernel.flow.cvm.flow.onlinepin.flow.cdcvm.flow.mobileonly.model.CdCvmMobileOnlyData> transactionEx) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionEx, "");
        com.discover.mpos.sdk.transaction.processing.ProcessingData j = transactionEx.j();
        com.discover.mpos.sdk.cardreader.kernel.flow.cvm.model.ContactlessCardVerificationResults contactlessCardVerificationResults = (com.discover.mpos.sdk.cardreader.kernel.flow.cvm.model.ContactlessCardVerificationResults) j.r.a(j, com.discover.mpos.sdk.transaction.processing.ProcessingData.f3244a[8]);
        com.discover.mpos.sdk.cardreader.kernel.flow.cvm.model.CardProcessingRequirements j2 = transactionEx.j().j();
        com.discover.mpos.sdk.cardreader.config.TerminalTransactionQualifiers m = transactionEx.j().m();
        return new com.discover.mpos.sdk.cardreader.kernel.flow.cvm.flow.onlinepin.flow.cdcvm.flow.mobileonly.model.CdCvmMobileOnlyData(contactlessCardVerificationResults.b, contactlessCardVerificationResults.f3018a, j2.e(), m.getIsSignatureSupported(), j2.f(), transactionEx.getConfig().getTerminalConfiguration().getCapabilities().getIsNoCvmRequired(), m.isCvmRequired());
    }
}
