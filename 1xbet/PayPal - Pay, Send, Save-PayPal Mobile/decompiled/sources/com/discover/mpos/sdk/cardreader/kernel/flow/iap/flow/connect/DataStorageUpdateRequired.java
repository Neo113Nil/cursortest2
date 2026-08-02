package com.discover.mpos.sdk.cardreader.kernel.flow.iap.flow.connect;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\b\u0010\t\u001a\u00020\nH\u0014J\b\u0010\u000b\u001a\u00020\u0007H\u0014J\b\u0010\f\u001a\u00020\rH\u0014J\b\u0010\u000e\u001a\u00020\u000fH\u0014R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/discover/mpos/sdk/cardreader/kernel/flow/iap/flow/connect/DataStorageUpdateRequired;", "Lcom/discover/mpos/sdk/cardreader/kernel/flow/iap/flow/connect/BaseIapConnectFlow;", "tx", "Lcom/discover/mpos/sdk/transaction/execution/TransactionEx;", "Lcom/discover/mpos/sdk/cardreader/kernel/flow/iap/model/ApplicationProcessingData;", "(Lcom/discover/mpos/sdk/transaction/execution/TransactionEx;)V", "commitControlSettings", "", "maskOf128", "debugTag", "", "getP1Parameter", "preProcess", "", "readGPOContent", "Lcom/discover/mpos/sdk/card/apdu/gpo/GetProcessingOptionsResponse;", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.cardreader.kernel.flow.c.a.a.c, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final class DataStorageUpdateRequired extends com.discover.mpos.sdk.cardreader.kernel.flow.iap.flow.connect.BaseIapConnectFlow {
    private final int b;
    private final int c;
    private final com.discover.mpos.sdk.transaction.execution.TransactionEx<com.discover.mpos.sdk.cardreader.kernel.flow.iap.model.ApplicationProcessingData> d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStorageUpdateRequired(com.discover.mpos.sdk.transaction.execution.TransactionEx<com.discover.mpos.sdk.cardreader.kernel.flow.iap.model.ApplicationProcessingData> transactionEx) {
        super(transactionEx);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionEx, "");
        this.d = transactionEx;
        this.b = 128;
        com.discover.mpos.sdk.data.readdatarecord.DataStorage dataStorage = transactionEx.j().c;
        this.c = dataStorage != null ? com.discover.mpos.sdk.core.extensions.HexExtensionsKt.toUnsignedInt(dataStorage.b) : 0;
    }

    @Override // com.discover.mpos.sdk.cardreader.kernel.flow.iap.flow.connect.BaseIapConnectFlow
    protected final void d() {
        com.discover.mpos.sdk.data.readdatarecord.DataStorage dataStorage = this.d.j().c;
        a(dataStorage != null ? dataStorage.f3218a : null);
    }

    @Override // com.discover.mpos.sdk.cardreader.kernel.flow.iap.flow.connect.BaseIapConnectFlow
    protected final int e() {
        return this.c | this.b;
    }

    @Override // com.discover.mpos.sdk.cardreader.kernel.flow.iap.flow.connect.BaseIapConnectFlow
    protected final com.discover.mpos.sdk.card.apdu.gpo.GetProcessingOptionsResponse f() {
        return this.f3022a.i().b(this.c, kotlin.collections.ArraysKt.plus(new com.discover.mpos.sdk.core.emv.tlv.Tlv(com.discover.mpos.sdk.core.emv.tlv.Tag.COMMAND_TEMPLATE.getTag(), b(), 0, 0, 12, null).getE(), c()));
    }
}
