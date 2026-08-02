package com.payair.db.transactionhistory;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fJ\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H¦@¢\u0006\u0004\b\u0005\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H&¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004H¦@¢\u0006\u0004\b\f\u0010\rJ.\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u00112\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000eH¦@¢\u0006\u0004\b\u0012\u0010\u0013J6\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u00112\u0006\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000eH¦@¢\u0006\u0004\b\u0014\u0010\u0015J$\u0010\u0017\u001a\u00020\u00042\u0012\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0016\"\u00020\u0002H¦@¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u000eH¦@¢\u0006\u0004\b\u0019\u0010\rJ3\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00110\u001a2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000eH&¢\u0006\u0004\b\u001b\u0010\u001cJ;\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00110\u001a2\u0006\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000eH&¢\u0006\u0004\b\u001d\u0010\u001e"}, d2 = {"Lcom/payair/db/transactionhistory/TransactionHistoryEntryDao;", "", "Lcom/payair/db/transactionhistory/TransactionHistoryEntry;", "transactionHistoryEntry", "", com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.DELETE, "(Lcom/payair/db/transactionhistory/TransactionHistoryEntry;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "networkTokenReference", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteAll", "()V", "deleteExpired", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/util/Date;", "dateFrom", "dateTo", "", "getAll", "(Ljava/util/Date;Ljava/util/Date;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getEntriesForToken", "(Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "insert", "([Lcom/payair/db/transactionhistory/TransactionHistoryEntry;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "latestUpdate", "Lkotlinx/coroutines/flow/Flow;", "observeAll", "(Ljava/util/Date;Ljava/util/Date;)Lkotlinx/coroutines/flow/Flow;", "observeEntriesForToken", "(Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;)Lkotlinx/coroutines/flow/Flow;", "Companion"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface TransactionHistoryEntryDao {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.payair.db.transactionhistory.TransactionHistoryEntryDao.Companion INSTANCE = com.payair.db.transactionhistory.TransactionHistoryEntryDao.Companion.f4376a;
    public static final java.lang.String dbName = "transactionHistory";

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/payair/db/transactionhistory/TransactionHistoryEntryDao$Companion;", "", "", "dbName", "Ljava/lang/String;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ com.payair.db.transactionhistory.TransactionHistoryEntryDao.Companion f4376a = new com.payair.db.transactionhistory.TransactionHistoryEntryDao.Companion();
        public static final java.lang.String dbName = "transactionHistory";
    }

    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ java.lang.Object getAll$default(com.payair.db.transactionhistory.TransactionHistoryEntryDao transactionHistoryEntryDao, java.util.Date date, java.util.Date date2, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAll");
            }
            if ((i & 1) != 0) {
                date = null;
            }
            if ((i & 2) != 0) {
                date2 = null;
            }
            return transactionHistoryEntryDao.getAll(date, date2, continuation);
        }

        public static /* synthetic */ java.lang.Object getEntriesForToken$default(com.payair.db.transactionhistory.TransactionHistoryEntryDao transactionHistoryEntryDao, java.lang.String str, java.util.Date date, java.util.Date date2, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getEntriesForToken");
            }
            if ((i & 2) != 0) {
                date = null;
            }
            if ((i & 4) != 0) {
                date2 = null;
            }
            return transactionHistoryEntryDao.getEntriesForToken(str, date, date2, continuation);
        }

        public static /* synthetic */ kotlinx.coroutines.flow.Flow observeAll$default(com.payair.db.transactionhistory.TransactionHistoryEntryDao transactionHistoryEntryDao, java.util.Date date, java.util.Date date2, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: observeAll");
            }
            if ((i & 1) != 0) {
                date = null;
            }
            if ((i & 2) != 0) {
                date2 = null;
            }
            return transactionHistoryEntryDao.observeAll(date, date2);
        }

        public static /* synthetic */ kotlinx.coroutines.flow.Flow observeEntriesForToken$default(com.payair.db.transactionhistory.TransactionHistoryEntryDao transactionHistoryEntryDao, java.lang.String str, java.util.Date date, java.util.Date date2, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: observeEntriesForToken");
            }
            if ((i & 2) != 0) {
                date = null;
            }
            if ((i & 4) != 0) {
                date2 = null;
            }
            return transactionHistoryEntryDao.observeEntriesForToken(str, date, date2);
        }
    }

    java.lang.Object delete(com.payair.db.transactionhistory.TransactionHistoryEntry transactionHistoryEntry, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    java.lang.Object delete(java.lang.String str, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    void deleteAll();

    java.lang.Object deleteExpired(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    java.lang.Object getAll(java.util.Date date, java.util.Date date2, kotlin.coroutines.Continuation<? super java.util.List<com.payair.db.transactionhistory.TransactionHistoryEntry>> continuation);

    java.lang.Object getEntriesForToken(java.lang.String str, java.util.Date date, java.util.Date date2, kotlin.coroutines.Continuation<? super java.util.List<com.payair.db.transactionhistory.TransactionHistoryEntry>> continuation);

    java.lang.Object insert(com.payair.db.transactionhistory.TransactionHistoryEntry[] transactionHistoryEntryArr, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    java.lang.Object latestUpdate(kotlin.coroutines.Continuation<? super java.util.Date> continuation);

    kotlinx.coroutines.flow.Flow<java.util.List<com.payair.db.transactionhistory.TransactionHistoryEntry>> observeAll(java.util.Date dateFrom, java.util.Date dateTo);

    kotlinx.coroutines.flow.Flow<java.util.List<com.payair.db.transactionhistory.TransactionHistoryEntry>> observeEntriesForToken(java.lang.String networkTokenReference, java.util.Date dateFrom, java.util.Date dateTo);
}
