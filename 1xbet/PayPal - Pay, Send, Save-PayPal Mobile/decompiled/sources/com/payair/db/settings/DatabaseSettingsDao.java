package com.payair.db.settings;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0005\bf\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\tH¦@¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH\u0096@¢\u0006\u0004\b\r\u0010\u000bJ\u0018\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH¦@¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0012\u001a\u00020\u00042\u0012\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0011\"\u00020\u0002H¦@¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\fH\u0096@¢\u0006\u0004\b\u0015\u0010\u0010"}, d2 = {"Lcom/payair/db/settings/DatabaseSettingsDao;", "", "Lcom/payair/db/settings/DatabaseSettingsEntry;", "transactionHistorySettingsEntry", "", com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.DELETE, "(Lcom/payair/db/settings/DatabaseSettingsEntry;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteAll", "()V", "", "getAll", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "getTransactionHistoryLastUpdatedTag", "key", "getValue", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "insert", "([Lcom/payair/db/settings/DatabaseSettingsEntry;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "setTransactionHistoryLastUpdatedTag", "Companion"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface DatabaseSettingsDao {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.payair.db.settings.DatabaseSettingsDao.Companion INSTANCE = com.payair.db.settings.DatabaseSettingsDao.Companion.f4354a;
    public static final java.lang.String dbName = "databaseSettings";

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/payair/db/settings/DatabaseSettingsDao$Companion;", "", "", "dbName", "Ljava/lang/String;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ com.payair.db.settings.DatabaseSettingsDao.Companion f4354a = new com.payair.db.settings.DatabaseSettingsDao.Companion();
        public static final java.lang.String dbName = "databaseSettings";
    }

    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final class DefaultImpls {
        public static java.lang.Object getTransactionHistoryLastUpdatedTag(com.payair.db.settings.DatabaseSettingsDao databaseSettingsDao, kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
            return databaseSettingsDao.getValue("lastUpdatedTag", continuation);
        }

        public static java.lang.Object setTransactionHistoryLastUpdatedTag(com.payair.db.settings.DatabaseSettingsDao databaseSettingsDao, java.lang.String str, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            java.lang.Object insert = databaseSettingsDao.insert(new com.payair.db.settings.DatabaseSettingsEntry[]{new com.payair.db.settings.DatabaseSettingsEntry("lastUpdatedTag", str)}, continuation);
            return insert == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? insert : kotlin.Unit.INSTANCE;
        }
    }

    java.lang.Object delete(com.payair.db.settings.DatabaseSettingsEntry databaseSettingsEntry, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    void deleteAll();

    java.lang.Object getAll(kotlin.coroutines.Continuation<? super java.util.List<com.payair.db.settings.DatabaseSettingsEntry>> continuation);

    java.lang.Object getTransactionHistoryLastUpdatedTag(kotlin.coroutines.Continuation<? super java.lang.String> continuation);

    java.lang.Object getValue(java.lang.String str, kotlin.coroutines.Continuation<? super java.lang.String> continuation);

    java.lang.Object insert(com.payair.db.settings.DatabaseSettingsEntry[] databaseSettingsEntryArr, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    java.lang.Object setTransactionHistoryLastUpdatedTag(java.lang.String str, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}
