package com.payair.logic.remote.model;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u001a!\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/payair/logic/remote/model/ResponseTransactionHistoryDto;", "", "networkTokenReference", "", "Lcom/payair/db/transactionhistory/TransactionHistoryEntry;", "toTransactions", "(Lcom/payair/logic/remote/model/ResponseTransactionHistoryDto;Ljava/lang/String;)Ljava/util/List;"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ResponseTransactionHistoryDtoKt {
    public static final java.util.List<com.payair.db.transactionhistory.TransactionHistoryEntry> toTransactions(com.payair.logic.remote.model.ResponseTransactionHistoryDto responseTransactionHistoryDto, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(responseTransactionHistoryDto, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.util.List<com.payair.logic.remote.model.TransactionHistoryEntryDto> transactions = responseTransactionHistoryDto.getTransactions();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(transactions, 10));
        java.util.Iterator<T> it = transactions.iterator();
        while (it.hasNext()) {
            arrayList.add(com.payair.logic.remote.model.TransactionHistoryEntryDtoKt.toTransactionHistoryEntry((com.payair.logic.remote.model.TransactionHistoryEntryDto) it.next(), str));
        }
        return arrayList;
    }
}
