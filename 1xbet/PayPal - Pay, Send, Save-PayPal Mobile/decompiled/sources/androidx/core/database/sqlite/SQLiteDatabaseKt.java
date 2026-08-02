package androidx.core.database.sqlite;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a=\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0002\b\u0005H\u0086\b¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"T", "Landroid/database/sqlite/SQLiteDatabase;", "", "exclusive", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.BODY, "transaction", "(Landroid/database/sqlite/SQLiteDatabase;ZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SQLiteDatabaseKt {
    public static final <T> T transaction(android.database.sqlite.SQLiteDatabase sQLiteDatabase, boolean z, kotlin.jvm.functions.Function1<? super android.database.sqlite.SQLiteDatabase, ? extends T> function1) {
        if (z) {
            sQLiteDatabase.beginTransaction();
        } else {
            sQLiteDatabase.beginTransactionNonExclusive();
        }
        try {
            T invoke = function1.invoke(sQLiteDatabase);
            sQLiteDatabase.setTransactionSuccessful();
            return invoke;
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    public static /* synthetic */ java.lang.Object transaction$default(android.database.sqlite.SQLiteDatabase sQLiteDatabase, boolean z, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0 || z) {
            sQLiteDatabase.beginTransaction();
        } else {
            sQLiteDatabase.beginTransactionNonExclusive();
        }
        try {
            java.lang.Object invoke = function1.invoke(sQLiteDatabase);
            sQLiteDatabase.setTransactionSuccessful();
            return invoke;
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }
}
