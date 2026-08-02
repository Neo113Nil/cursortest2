package com.payair.logic.managers;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0096@¢\u0006\u0004\b\r\u0010\u000eJ*\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000fH\u0096@¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u00162\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J2\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000fH\u0096@¢\u0006\u0004\b\u0019\u0010\u001aJ7\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u00162\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u001b\u0010\u001c"}, d2 = {"Lcom/payair/logic/managers/TransactionHistoryManagerImpl;", "Lcom/payair/logic/managers/TransactionHistoryManager;", "Lcom/payair/logic/remote/repositories/TransactionHistoryRepository;", "transactionHistoryRepository", "Lcom/payair/logic/implementation/HceSDKInterface;", "hceSDK", "Lcom/payair/db/Database;", "database", "<init>", "(Lcom/payair/logic/remote/repositories/TransactionHistoryRepository;Lcom/payair/logic/implementation/HceSDKInterface;Lcom/payair/db/Database;)V", "", "networkTokenReference", "Lcom/payair/model/Response;", "updateTransactionHistory", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/util/Date;", "dateFrom", "dateTo", "", "Lcom/payair/db/transactionhistory/TransactionHistoryEntry;", "getTransactionHistory", "(Ljava/util/Date;Ljava/util/Date;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/Flow;", "observeTransactionHistory", "(Ljava/util/Date;Ljava/util/Date;)Lkotlinx/coroutines/flow/Flow;", "getTransactionHistoryForToken", "(Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "observeTransactionHistoryForToken", "(Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;)Lkotlinx/coroutines/flow/Flow;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TransactionHistoryManagerImpl implements com.payair.logic.managers.TransactionHistoryManager {

    /* renamed from: a, reason: collision with root package name */
    public final com.payair.logic.managers.TransactionHistoryManagerSuspendImpl f4458a;

    public TransactionHistoryManagerImpl(com.payair.logic.remote.repositories.TransactionHistoryRepository transactionHistoryRepository, com.payair.logic.implementation.HceSDKInterface hceSDKInterface, com.payair.db.Database database) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionHistoryRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hceSDKInterface, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(database, "");
        this.f4458a = new com.payair.logic.managers.TransactionHistoryManagerSuspendImpl(transactionHistoryRepository, hceSDKInterface, database);
    }

    @Override // com.payair.logic.managers.TransactionHistoryManager
    public final java.lang.Object getTransactionHistory(java.util.Date date, java.util.Date date2, kotlin.coroutines.Continuation<? super java.util.List<com.payair.db.transactionhistory.TransactionHistoryEntry>> continuation) {
        return this.f4458a.getTransactionHistory(date, date2, continuation);
    }

    @Override // com.payair.logic.managers.TransactionHistoryManager
    public final java.lang.Object getTransactionHistoryForToken(java.lang.String str, java.util.Date date, java.util.Date date2, kotlin.coroutines.Continuation<? super java.util.List<com.payair.db.transactionhistory.TransactionHistoryEntry>> continuation) {
        return this.f4458a.getTransactionHistoryForToken(str, date, date2, continuation);
    }

    @Override // com.payair.logic.managers.TransactionHistoryManager
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.payair.db.transactionhistory.TransactionHistoryEntry>> observeTransactionHistory(java.util.Date dateFrom, java.util.Date dateTo) {
        return this.f4458a.observeTransactionHistory(dateFrom, dateTo);
    }

    @Override // com.payair.logic.managers.TransactionHistoryManager
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.payair.db.transactionhistory.TransactionHistoryEntry>> observeTransactionHistoryForToken(java.lang.String networkTokenReference, java.util.Date dateFrom, java.util.Date dateTo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkTokenReference, "");
        return this.f4458a.observeTransactionHistoryForToken(networkTokenReference, dateFrom, dateTo);
    }

    @Override // com.payair.logic.managers.TransactionHistoryManager
    public final java.lang.Object updateTransactionHistory(java.lang.String str, kotlin.coroutines.Continuation<? super com.payair.model.Response> continuation) {
        return this.f4458a.updateTransactionHistory(str, continuation);
    }
}
