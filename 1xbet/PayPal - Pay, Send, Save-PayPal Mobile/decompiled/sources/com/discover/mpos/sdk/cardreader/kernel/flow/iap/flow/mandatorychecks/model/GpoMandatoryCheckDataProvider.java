package com.discover.mpos.sdk.cardreader.kernel.flow.iap.flow.mandatorychecks.model;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0016\u0010\u0006\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/discover/mpos/sdk/cardreader/kernel/flow/iap/flow/mandatorychecks/model/GpoMandatoryCheckDataProvider;", "Lcom/discover/mpos/sdk/transaction/execution/TransactionExecutionDataProvider;", "Lcom/discover/mpos/sdk/cardreader/kernel/flow/iap/flow/mandatorychecks/model/GpoMandatoryCheckData;", "gpoResponse", "Lcom/discover/mpos/sdk/card/apdu/gpo/GetProcessingOptionsResponse;", "(Lcom/discover/mpos/sdk/card/apdu/gpo/GetProcessingOptionsResponse;)V", "getData", "transaction", "Lcom/discover/mpos/sdk/transaction/execution/TransactionEx;", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.cardreader.kernel.flow.c.a.b.b.b, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final class GpoMandatoryCheckDataProvider implements com.discover.mpos.sdk.transaction.execution.TransactionExecutionDataProvider<com.discover.mpos.sdk.cardreader.kernel.flow.iap.flow.mandatorychecks.model.GpoMandatoryCheckData> {

    /* renamed from: a, reason: collision with root package name */
    private final com.discover.mpos.sdk.card.apdu.gpo.GetProcessingOptionsResponse f3034a;

    public GpoMandatoryCheckDataProvider(com.discover.mpos.sdk.card.apdu.gpo.GetProcessingOptionsResponse getProcessingOptionsResponse) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getProcessingOptionsResponse, "");
        this.f3034a = getProcessingOptionsResponse;
    }

    @Override // com.discover.mpos.sdk.transaction.execution.TransactionExecutionDataProvider
    public final /* synthetic */ com.discover.mpos.sdk.cardreader.kernel.flow.iap.flow.mandatorychecks.model.GpoMandatoryCheckData a(com.discover.mpos.sdk.transaction.execution.TransactionEx<com.discover.mpos.sdk.cardreader.kernel.flow.iap.flow.mandatorychecks.model.GpoMandatoryCheckData> transactionEx) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionEx, "");
        return new com.discover.mpos.sdk.cardreader.kernel.flow.iap.flow.mandatorychecks.model.GpoMandatoryCheckData(this.f3034a, transactionEx.j().n());
    }
}
