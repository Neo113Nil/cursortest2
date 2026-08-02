package com.payair.logic.remote.repositories;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J*\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H¦@¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/payair/logic/remote/repositories/TransactionHistoryRepository;", "", "", "paymentAppInstanceId", "networkTokenReference", "", "transactionsFromTimestamp", "Lcom/payair/model/Response;", "getTransactionHistory", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface TransactionHistoryRepository {
    java.lang.Object getTransactionHistory(java.lang.String str, java.lang.String str2, java.lang.Long l, kotlin.coroutines.Continuation<? super com.payair.model.Response> continuation);
}
