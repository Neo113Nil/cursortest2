package com.discover.mpos.sdk.cardreader.kernel.flow.readrecord;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0002J\u0016\u0010\b\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0016¨\u0006\t"}, d2 = {"Lcom/discover/mpos/sdk/cardreader/kernel/flow/readrecord/ReadRecordDataProvider;", "Lcom/discover/mpos/sdk/transaction/execution/TransactionExecutionDataProvider;", "Lcom/discover/mpos/sdk/cardreader/kernel/flow/readrecord/model/ReadRecordData;", "()V", "getAflTlv", "Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;", "transaction", "Lcom/discover/mpos/sdk/transaction/execution/TransactionEx;", "getData", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.cardreader.kernel.flow.k.a, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final class ReadRecordDataProvider implements com.discover.mpos.sdk.transaction.execution.TransactionExecutionDataProvider<com.discover.mpos.sdk.cardreader.kernel.flow.readrecord.model.ReadRecordData> {
    /* JADX WARN: Code restructure failed: missing block: B:10:0x003c, code lost:
    
        if (r2 == null) goto L13;
     */
    @Override // com.discover.mpos.sdk.transaction.execution.TransactionExecutionDataProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ com.discover.mpos.sdk.cardreader.kernel.flow.readrecord.model.ReadRecordData a(com.discover.mpos.sdk.transaction.execution.TransactionEx<com.discover.mpos.sdk.cardreader.kernel.flow.readrecord.model.ReadRecordData> transactionEx) {
        com.discover.mpos.sdk.core.emv.tlv.Tlv tlv;
        java.util.List<com.discover.mpos.sdk.core.emv.tlv.Tlv> emptyList;
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionEx, "");
        com.discover.mpos.sdk.card.apdu.gpo.GetProcessingOptionsResponse getProcessingOptionsResponse = transactionEx.j().k;
        if (getProcessingOptionsResponse != null) {
            java.util.Iterator<T> it = getProcessingOptionsResponse.getContent().f2949a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.discover.mpos.sdk.core.emv.tlv.Tlv) obj).getTag(), com.discover.mpos.sdk.core.emv.tlv.Tag.APPLICATION_FILE_LOCATOR_AFL.getTag())) {
                    break;
                }
            }
            tlv = (com.discover.mpos.sdk.core.emv.tlv.Tlv) obj;
        }
        tlv = new com.discover.mpos.sdk.core.emv.tlv.Tlv(com.discover.mpos.sdk.core.emv.tlv.Tag.APPLICATION_FILE_LOCATOR_AFL.getTag(), null, 0, 0, 14, null);
        com.discover.mpos.sdk.core.emv.tlv.Tlv tlv2 = tlv;
        com.discover.mpos.sdk.card.apdu.gpo.GetProcessingOptionsResponse getProcessingOptionsResponse2 = transactionEx.j().k;
        if (getProcessingOptionsResponse2 == null || (emptyList = getProcessingOptionsResponse2.getContent().f2949a) == null) {
            emptyList = kotlin.collections.CollectionsKt.emptyList();
        }
        return new com.discover.mpos.sdk.cardreader.kernel.flow.readrecord.model.ReadRecordData(tlv2, null, null, emptyList, 6);
    }
}
