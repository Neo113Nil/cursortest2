package com.payair.logic.remote.model;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/payair/logic/remote/model/TransactionHistoryEntryDto;", "", "networkTokenReference", "Lcom/payair/db/transactionhistory/TransactionHistoryEntry;", "toTransactionHistoryEntry", "(Lcom/payair/logic/remote/model/TransactionHistoryEntryDto;Ljava/lang/String;)Lcom/payair/db/transactionhistory/TransactionHistoryEntry;"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class TransactionHistoryEntryDtoKt {
    public static final com.payair.db.transactionhistory.TransactionHistoryEntry toTransactionHistoryEntry(com.payair.logic.remote.model.TransactionHistoryEntryDto transactionHistoryEntryDto, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionHistoryEntryDto, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return new com.payair.db.transactionhistory.TransactionHistoryEntry(0L, transactionHistoryEntryDto.getRecordId(), transactionHistoryEntryDto.getTransactionIdentifier(), transactionHistoryEntryDto.getMerchantName(), transactionHistoryEntryDto.getAmount(), transactionHistoryEntryDto.getTransactionTimestamp(), transactionHistoryEntryDto.getCurrencyCode(), transactionHistoryEntryDto.getAuthorizationStatus(), transactionHistoryEntryDto.getTransactionType(), str, transactionHistoryEntryDto.getMerchantType(), transactionHistoryEntryDto.getMerchantCity(), transactionHistoryEntryDto.getTransactionCountryCode(), transactionHistoryEntryDto.getIndustryCatgCode(), transactionHistoryEntryDto.getIndustryCatgName(), transactionHistoryEntryDto.getIndustryName(), 1, null);
    }
}
