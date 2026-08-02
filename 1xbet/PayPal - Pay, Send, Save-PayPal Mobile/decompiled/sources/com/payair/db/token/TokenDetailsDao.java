package com.payair.db.token;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H¦@¢\u0006\u0004\b\u0005\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H&¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\fH¦@¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u0007H¦@¢\u0006\u0004\b\u000f\u0010\tJ$\u0010\u0011\u001a\u00020\u00042\u0012\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0010\"\u00020\u0002H¦@¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\f0\u0013H&¢\u0006\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/payair/db/token/TokenDetailsDao;", "", "Lcom/payair/db/token/TokenDetailsEntry;", "tokenDetailsEntry", "", com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.DELETE, "(Lcom/payair/db/token/TokenDetailsEntry;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "networkTokenReference", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteAll", "()V", "", "getAll", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getByNetworkTokenReference", "", "insert", "([Lcom/payair/db/token/TokenDetailsEntry;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/Flow;", "observeAll", "()Lkotlinx/coroutines/flow/Flow;", "Companion"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface TokenDetailsDao {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.payair.db.token.TokenDetailsDao.Companion INSTANCE = com.payair.db.token.TokenDetailsDao.Companion.f4361a;
    public static final java.lang.String dbName = "TokenDetails";

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/payair/db/token/TokenDetailsDao$Companion;", "", "", "dbName", "Ljava/lang/String;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ com.payair.db.token.TokenDetailsDao.Companion f4361a = new com.payair.db.token.TokenDetailsDao.Companion();
        public static final java.lang.String dbName = "TokenDetails";
    }

    java.lang.Object delete(com.payair.db.token.TokenDetailsEntry tokenDetailsEntry, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    java.lang.Object delete(java.lang.String str, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    void deleteAll();

    java.lang.Object getAll(kotlin.coroutines.Continuation<? super java.util.List<com.payair.db.token.TokenDetailsEntry>> continuation);

    java.lang.Object getByNetworkTokenReference(java.lang.String str, kotlin.coroutines.Continuation<? super com.payair.db.token.TokenDetailsEntry> continuation);

    java.lang.Object insert(com.payair.db.token.TokenDetailsEntry[] tokenDetailsEntryArr, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    kotlinx.coroutines.flow.Flow<java.util.List<com.payair.db.token.TokenDetailsEntry>> observeAll();
}
