package com.payair.logic.managers;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J.\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002H¦@¢\u0006\u0004\b\u0007\u0010\bJ6\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002H¦@¢\u0006\u0004\b\u000b\u0010\fJ3\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\r2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u000e\u0010\u000fJ;\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\r2\u0006\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\tH¦@¢\u0006\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/payair/logic/managers/TransactionHistoryManager;", "", "Ljava/util/Date;", "dateFrom", "dateTo", "", "Lcom/payair/db/transactionhistory/TransactionHistoryEntry;", "getTransactionHistory", "(Ljava/util/Date;Ljava/util/Date;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "networkTokenReference", "getTransactionHistoryForToken", "(Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/Flow;", "observeTransactionHistory", "(Ljava/util/Date;Ljava/util/Date;)Lkotlinx/coroutines/flow/Flow;", "observeTransactionHistoryForToken", "(Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;)Lkotlinx/coroutines/flow/Flow;", "Lcom/payair/model/Response;", "updateTransactionHistory", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface TransactionHistoryManager {

    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ java.lang.Object getTransactionHistory$default(com.payair.logic.managers.TransactionHistoryManager transactionHistoryManager, java.util.Date date, java.util.Date date2, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getTransactionHistory");
            }
            if ((i & 1) != 0) {
                date = null;
            }
            if ((i & 2) != 0) {
                date2 = null;
            }
            return transactionHistoryManager.getTransactionHistory(date, date2, continuation);
        }

        public static /* synthetic */ java.lang.Object getTransactionHistoryForToken$default(com.payair.logic.managers.TransactionHistoryManager transactionHistoryManager, java.lang.String str, java.util.Date date, java.util.Date date2, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getTransactionHistoryForToken");
            }
            if ((i & 2) != 0) {
                date = null;
            }
            if ((i & 4) != 0) {
                date2 = null;
            }
            return transactionHistoryManager.getTransactionHistoryForToken(str, date, date2, continuation);
        }

        public static /* synthetic */ kotlinx.coroutines.flow.Flow observeTransactionHistory$default(com.payair.logic.managers.TransactionHistoryManager transactionHistoryManager, java.util.Date date, java.util.Date date2, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: observeTransactionHistory");
            }
            if ((i & 1) != 0) {
                date = null;
            }
            if ((i & 2) != 0) {
                date2 = null;
            }
            return transactionHistoryManager.observeTransactionHistory(date, date2);
        }

        public static /* synthetic */ kotlinx.coroutines.flow.Flow observeTransactionHistoryForToken$default(com.payair.logic.managers.TransactionHistoryManager transactionHistoryManager, java.lang.String str, java.util.Date date, java.util.Date date2, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: observeTransactionHistoryForToken");
            }
            if ((i & 2) != 0) {
                date = null;
            }
            if ((i & 4) != 0) {
                date2 = null;
            }
            return transactionHistoryManager.observeTransactionHistoryForToken(str, date, date2);
        }
    }

    java.lang.Object getTransactionHistory(java.util.Date date, java.util.Date date2, kotlin.coroutines.Continuation<? super java.util.List<com.payair.db.transactionhistory.TransactionHistoryEntry>> continuation);

    java.lang.Object getTransactionHistoryForToken(java.lang.String str, java.util.Date date, java.util.Date date2, kotlin.coroutines.Continuation<? super java.util.List<com.payair.db.transactionhistory.TransactionHistoryEntry>> continuation);

    kotlinx.coroutines.flow.Flow<java.util.List<com.payair.db.transactionhistory.TransactionHistoryEntry>> observeTransactionHistory(java.util.Date dateFrom, java.util.Date dateTo);

    kotlinx.coroutines.flow.Flow<java.util.List<com.payair.db.transactionhistory.TransactionHistoryEntry>> observeTransactionHistoryForToken(java.lang.String networkTokenReference, java.util.Date dateFrom, java.util.Date dateTo);

    java.lang.Object updateTransactionHistory(java.lang.String str, kotlin.coroutines.Continuation<? super com.payair.model.Response> continuation);
}
