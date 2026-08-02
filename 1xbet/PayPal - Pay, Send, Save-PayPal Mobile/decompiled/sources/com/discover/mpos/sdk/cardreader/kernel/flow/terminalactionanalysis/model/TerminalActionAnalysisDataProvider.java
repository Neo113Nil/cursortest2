package com.discover.mpos.sdk.cardreader.kernel.flow.terminalactionanalysis.model;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/discover/mpos/sdk/cardreader/kernel/flow/terminalactionanalysis/model/TerminalActionAnalysisDataProvider;", "Lcom/discover/mpos/sdk/transaction/execution/TransactionExecutionDataProvider;", "Lcom/discover/mpos/sdk/cardreader/kernel/flow/terminalactionanalysis/model/TerminalActionAnalysisData;", "()V", "getData", "transaction", "Lcom/discover/mpos/sdk/transaction/execution/TransactionEx;", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.cardreader.kernel.flow.m.b.b, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final class TerminalActionAnalysisDataProvider implements com.discover.mpos.sdk.transaction.execution.TransactionExecutionDataProvider<com.discover.mpos.sdk.cardreader.kernel.flow.terminalactionanalysis.model.TerminalActionAnalysisData> {
    @Override // com.discover.mpos.sdk.transaction.execution.TransactionExecutionDataProvider
    public final /* synthetic */ com.discover.mpos.sdk.cardreader.kernel.flow.terminalactionanalysis.model.TerminalActionAnalysisData a(com.discover.mpos.sdk.transaction.execution.TransactionEx<com.discover.mpos.sdk.cardreader.kernel.flow.terminalactionanalysis.model.TerminalActionAnalysisData> transactionEx) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionEx, "");
        com.discover.mpos.sdk.cardreader.kernel.flow.iap.flow.otherchecks.model.CryptogramInformationData l = transactionEx.j().l();
        com.discover.mpos.sdk.transaction.processing.terminalverificationresults.TerminalVerificationResults h = transactionEx.j().h();
        com.discover.mpos.sdk.cardreader.kernel.flow.cvm.model.CardProcessingRequirements j = transactionEx.j().j();
        return new com.discover.mpos.sdk.cardreader.kernel.flow.terminalactionanalysis.model.TerminalActionAnalysisData(l.c, j.c(), h.a(), h.d(), l.b, j.b.getBitValue(com.discover.mpos.sdk.core.data.ByteInfo.BitIndex.SIXTH), j.b.getBitValue(com.discover.mpos.sdk.core.data.ByteInfo.BitIndex.SEVENTH), h.b.getBitValue(com.discover.mpos.sdk.core.data.ByteInfo.BitIndex.FIFTH), h.c(), h.f3277a.getBitValue(com.discover.mpos.sdk.core.data.ByteInfo.BitIndex.SIXTH), h.b.getBitValue(com.discover.mpos.sdk.core.data.ByteInfo.BitIndex.SEVENTH), j.b.getBitValue(com.discover.mpos.sdk.core.data.ByteInfo.BitIndex.THIRD), j.b.getBitValue(com.discover.mpos.sdk.core.data.ByteInfo.BitIndex.FOURTH), h.b.getBitValue(com.discover.mpos.sdk.core.data.ByteInfo.BitIndex.SIXTH));
    }
}
