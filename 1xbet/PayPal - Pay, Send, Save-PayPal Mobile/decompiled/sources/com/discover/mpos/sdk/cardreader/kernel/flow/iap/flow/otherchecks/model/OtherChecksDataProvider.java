package com.discover.mpos.sdk.cardreader.kernel.flow.iap.flow.otherchecks.model;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0016\u0010\u0007\u001a\u00020\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0016J*\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/discover/mpos/sdk/cardreader/kernel/flow/iap/flow/otherchecks/model/OtherChecksDataProvider;", "Lcom/discover/mpos/sdk/transaction/execution/TransactionExecutionDataProvider;", "Lcom/discover/mpos/sdk/cardreader/kernel/flow/iap/flow/otherchecks/flow/model/OtherChecksData;", "()V", "searchedList", "", "", "getData", "transaction", "Lcom/discover/mpos/sdk/transaction/execution/TransactionEx;", "stepsTlv", "Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;", "source", "searched", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.cardreader.kernel.flow.c.a.c.b.b, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final class OtherChecksDataProvider implements com.discover.mpos.sdk.transaction.execution.TransactionExecutionDataProvider<com.discover.mpos.sdk.cardreader.kernel.flow.iap.flow.otherchecks.flow.model.OtherChecksData> {

    /* renamed from: a, reason: collision with root package name */
    private final java.util.List<java.lang.String> f3042a = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{com.discover.mpos.sdk.core.emv.tlv.Tag.CRYPTOGRAM_INFORMATION_DATA.getTag(), com.discover.mpos.sdk.core.emv.tlv.Tag.APPLICATION_CRYPTOGRAM.getTag(), com.discover.mpos.sdk.core.emv.tlv.Tag.APPLICATION_FILE_LOCATOR_AFL.getTag(), com.discover.mpos.sdk.core.emv.tlv.Tag.SIGNED_DYNAMIC_APPLICATION_DATA.getTag(), com.discover.mpos.sdk.core.emv.tlv.Tag.OFFLINE_BALANCE_FOR_D_PAS.getTag(), com.discover.mpos.sdk.core.emv.tlv.Tag.TRACK_2_EQUIVALENT_DATA.getTag(), com.discover.mpos.sdk.core.emv.tlv.Tag.APPLICATION_PRIMARY_ACCOUNT_NUMBER_PAN_SEQUENCE_NUMBER.getTag(), com.discover.mpos.sdk.core.emv.tlv.Tag.APPLICATION_EFFECTIVE_DATE.getTag(), com.discover.mpos.sdk.core.emv.tlv.Tag.APPLICATION_VERSION_NUMBER_CARD.getTag(), com.discover.mpos.sdk.core.emv.tlv.Tag.PAYMENT_ACCOUNT_REFERENCE.getTag()});

    @Override // com.discover.mpos.sdk.transaction.execution.TransactionExecutionDataProvider
    public final /* synthetic */ com.discover.mpos.sdk.cardreader.kernel.flow.iap.flow.otherchecks.flow.model.OtherChecksData a(com.discover.mpos.sdk.transaction.execution.TransactionEx<com.discover.mpos.sdk.cardreader.kernel.flow.iap.flow.otherchecks.flow.model.OtherChecksData> transactionEx) {
        java.util.List<com.discover.mpos.sdk.core.emv.tlv.Tlv> emptyList;
        com.discover.mpos.sdk.card.apdu.gpo.GetProcessingOptionsResponseContent content;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionEx, "");
        com.discover.mpos.sdk.card.apdu.gpo.GetProcessingOptionsResponse getProcessingOptionsResponse = transactionEx.j().k;
        if (getProcessingOptionsResponse == null || (content = getProcessingOptionsResponse.getContent()) == null || (emptyList = content.f2949a) == null) {
            emptyList = kotlin.collections.CollectionsKt.emptyList();
        }
        return new com.discover.mpos.sdk.cardreader.kernel.flow.iap.flow.otherchecks.flow.model.OtherChecksData(transactionEx.j(), a(emptyList, this.f3042a));
    }

    private static java.util.List<com.discover.mpos.sdk.core.emv.tlv.Tlv> a(java.util.List<com.discover.mpos.sdk.core.emv.tlv.Tlv> list, java.util.List<java.lang.String> list2) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (list2.contains(((com.discover.mpos.sdk.core.emv.tlv.Tlv) obj).getTag())) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
