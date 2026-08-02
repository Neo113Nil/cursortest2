package com.payair.logic.remote.model;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/payair/logic/remote/model/ResponseTransactionHistoryDto;", "Lcom/payair/hce/communication/JsonResponse;", "", "Lcom/payair/logic/remote/model/TransactionHistoryEntryDto;", "transactions", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/payair/logic/remote/model/ResponseTransactionHistoryDto;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getTransactions"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ResponseTransactionHistoryDto extends com.payair.hce.communication.JsonResponse {
    private final java.util.List<com.payair.logic.remote.model.TransactionHistoryEntryDto> transactions;

    /* JADX WARN: Multi-variable type inference failed */
    public ResponseTransactionHistoryDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final java.util.List<com.payair.logic.remote.model.TransactionHistoryEntryDto> getTransactions() {
        return this.transactions;
    }

    public /* synthetic */ ResponseTransactionHistoryDto(java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list);
    }

    public ResponseTransactionHistoryDto(java.util.List<com.payair.logic.remote.model.TransactionHistoryEntryDto> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.transactions = list;
    }

    @Override // com.payair.hce.communication.JsonResponse
    public final java.lang.String toString() {
        java.util.List<com.payair.logic.remote.model.TransactionHistoryEntryDto> list = this.transactions;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ResponseTransactionHistoryDto(transactions=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.transactions.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.payair.logic.remote.model.ResponseTransactionHistoryDto) && kotlin.jvm.internal.Intrinsics.areEqual(this.transactions, ((com.payair.logic.remote.model.ResponseTransactionHistoryDto) other).transactions);
    }

    public final com.payair.logic.remote.model.ResponseTransactionHistoryDto copy(java.util.List<com.payair.logic.remote.model.TransactionHistoryEntryDto> transactions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactions, "");
        return new com.payair.logic.remote.model.ResponseTransactionHistoryDto(transactions);
    }

    public final java.util.List<com.payair.logic.remote.model.TransactionHistoryEntryDto> component1() {
        return this.transactions;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.payair.logic.remote.model.ResponseTransactionHistoryDto copy$default(com.payair.logic.remote.model.ResponseTransactionHistoryDto responseTransactionHistoryDto, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = responseTransactionHistoryDto.transactions;
        }
        return responseTransactionHistoryDto.copy(list);
    }
}
