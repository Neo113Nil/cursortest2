package com.discover.mpos.sdk.cardreader.entrypoint.flow.combinationselection.data;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B1\u0012\u0018\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\u001b\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u0003HÆ\u0003J\u0011\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003HÆ\u0003J7\u0010\u0015\u001a\u00020\u00002\u001a\b\u0002\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\b\u0010\u001b\u001a\u00020\u001cH\u0016R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR#\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u001a\u0010\r\u001a\u00020\u000eX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, d2 = {"Lcom/discover/mpos/sdk/cardreader/entrypoint/flow/combinationselection/data/CombinationSelectionData;", "", "readerCombinations", "", "Lkotlin/Pair;", "Lcom/discover/mpos/sdk/cardreader/config/CombinationConfiguration;", "Lcom/discover/mpos/sdk/transaction/processing/PreProcessingIndicators;", "directoryEntries", "Lcom/discover/mpos/sdk/card/apdu/emv/DirectoryEntry;", "(Ljava/util/List;Ljava/util/List;)V", "getDirectoryEntries", "()Ljava/util/List;", "getReaderCombinations", "selectPpseResponse", "Lcom/discover/mpos/sdk/card/apdu/select/ppse/SelectPPSEResponse;", "getSelectPpseResponse", "()Lcom/discover/mpos/sdk/card/apdu/select/ppse/SelectPPSEResponse;", "setSelectPpseResponse", "(Lcom/discover/mpos/sdk/card/apdu/select/ppse/SelectPPSEResponse;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.cardreader.entrypoint.a.a.a.a, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final /* data */ class CombinationSelectionData {

    /* renamed from: a, reason: collision with root package name */
    public com.discover.mpos.sdk.card.apdu.g.ppse.SelectPPSEResponse f2986a;
    public final java.util.List<kotlin.Pair<com.discover.mpos.sdk.cardreader.config.CombinationConfiguration, com.discover.mpos.sdk.transaction.processing.PreProcessingIndicators>> b;
    private final java.util.List<com.discover.mpos.sdk.card.apdu.emv.DirectoryEntry> c;

    private CombinationSelectionData(java.util.List<kotlin.Pair<com.discover.mpos.sdk.cardreader.config.CombinationConfiguration, com.discover.mpos.sdk.transaction.processing.PreProcessingIndicators>> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.b = list;
        this.c = null;
    }

    public /* synthetic */ CombinationSelectionData(java.util.List list, byte b) {
        this(list);
    }

    public final com.discover.mpos.sdk.card.apdu.g.ppse.SelectPPSEResponse a() {
        com.discover.mpos.sdk.card.apdu.g.ppse.SelectPPSEResponse selectPPSEResponse = this.f2986a;
        if (selectPPSEResponse == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return selectPPSEResponse;
    }

    public final java.lang.String toString() {
        return com.discover.mpos.sdk.core.extensions.StringExtensionsKt.toJSONString(this);
    }

    public final int hashCode() {
        java.util.List<kotlin.Pair<com.discover.mpos.sdk.cardreader.config.CombinationConfiguration, com.discover.mpos.sdk.transaction.processing.PreProcessingIndicators>> list = this.b;
        int hashCode = list != null ? list.hashCode() : 0;
        java.util.List<com.discover.mpos.sdk.card.apdu.emv.DirectoryEntry> list2 = this.c;
        return (hashCode * 31) + (list2 != null ? list2.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.discover.mpos.sdk.cardreader.entrypoint.flow.combinationselection.data.CombinationSelectionData)) {
            return false;
        }
        com.discover.mpos.sdk.cardreader.entrypoint.flow.combinationselection.data.CombinationSelectionData combinationSelectionData = (com.discover.mpos.sdk.cardreader.entrypoint.flow.combinationselection.data.CombinationSelectionData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.b, combinationSelectionData.b) && kotlin.jvm.internal.Intrinsics.areEqual(this.c, combinationSelectionData.c);
    }
}
