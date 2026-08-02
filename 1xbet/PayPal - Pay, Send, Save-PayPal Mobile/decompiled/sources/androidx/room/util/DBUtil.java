package androidx.room.util;

@kotlin.Metadata(d1 = {"androidx/room/util/DBUtil__DBUtilKt", "androidx/room/util/DBUtil__DBUtil_androidKt"}, k = 4, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DBUtil {
    @kotlin.Deprecated(message = "Use constructor", replaceWith = @kotlin.ReplaceWith(expression = "CancellationSignal()", imports = {"android.os.CancellationSignal"}))
    public static final android.os.CancellationSignal createCancellationSignal() {
        return androidx.room.util.DBUtil__DBUtil_androidKt.createCancellationSignal();
    }

    public static final void dropFtsSyncTriggers(androidx.database.SQLiteConnection sQLiteConnection) {
        androidx.room.util.DBUtil__DBUtilKt.dropFtsSyncTriggers(sQLiteConnection);
    }

    @kotlin.Deprecated(message = "Replaced by dropFtsSyncTriggers(connection: SQLiteConnection)")
    public static final void dropFtsSyncTriggers(androidx.database.db.SupportSQLiteDatabase supportSQLiteDatabase) {
        androidx.room.util.DBUtil__DBUtil_androidKt.dropFtsSyncTriggers(supportSQLiteDatabase);
    }

    public static final void foreignKeyCheck(androidx.database.SQLiteConnection sQLiteConnection, java.lang.String str) {
        androidx.room.util.DBUtil__DBUtilKt.foreignKeyCheck(sQLiteConnection, str);
    }

    public static final void foreignKeyCheck(androidx.database.db.SupportSQLiteDatabase supportSQLiteDatabase, java.lang.String str) {
        androidx.room.util.DBUtil__DBUtil_androidKt.foreignKeyCheck(supportSQLiteDatabase, str);
    }

    public static final java.lang.Object getCoroutineContext(androidx.room.RoomDatabase roomDatabase, boolean z, kotlin.coroutines.Continuation<? super kotlin.coroutines.CoroutineContext> continuation) {
        return androidx.room.util.DBUtil__DBUtil_androidKt.getCoroutineContext(roomDatabase, z, continuation);
    }

    public static final <R> java.lang.Object internalPerform(androidx.room.RoomDatabase roomDatabase, boolean z, boolean z2, kotlin.jvm.functions.Function2<? super androidx.room.PooledConnection, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super R> continuation) {
        return androidx.room.util.DBUtil__DBUtilKt.internalPerform(roomDatabase, z, z2, function2, continuation);
    }

    public static final <R> R performBlocking(androidx.room.RoomDatabase roomDatabase, boolean z, boolean z2, kotlin.jvm.functions.Function1<? super androidx.database.SQLiteConnection, ? extends R> function1) {
        return (R) androidx.room.util.DBUtil__DBUtil_androidKt.performBlocking(roomDatabase, z, z2, function1);
    }

    public static final <R> java.lang.Object performInTransactionSuspending(androidx.room.RoomDatabase roomDatabase, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function1, kotlin.coroutines.Continuation<? super R> continuation) {
        return androidx.room.util.DBUtil__DBUtil_androidKt.performInTransactionSuspending(roomDatabase, function1, continuation);
    }

    public static final <R> java.lang.Object performSuspending(androidx.room.RoomDatabase roomDatabase, boolean z, boolean z2, kotlin.jvm.functions.Function1<? super androidx.database.SQLiteConnection, ? extends R> function1, kotlin.coroutines.Continuation<? super R> continuation) {
        return androidx.room.util.DBUtil__DBUtil_androidKt.performSuspending(roomDatabase, z, z2, function1, continuation);
    }

    @kotlin.Deprecated(message = "This is only used in the generated code and shouldn't be called directly.")
    public static final android.database.Cursor query(androidx.room.RoomDatabase roomDatabase, androidx.database.db.SupportSQLiteQuery supportSQLiteQuery, boolean z) {
        return androidx.room.util.DBUtil__DBUtil_androidKt.query(roomDatabase, supportSQLiteQuery, z);
    }

    public static final android.database.Cursor query(androidx.room.RoomDatabase roomDatabase, androidx.database.db.SupportSQLiteQuery supportSQLiteQuery, boolean z, android.os.CancellationSignal cancellationSignal) {
        return androidx.room.util.DBUtil__DBUtil_androidKt.query(roomDatabase, supportSQLiteQuery, z, cancellationSignal);
    }

    public static final int readVersion(java.io.File file) throws java.io.IOException {
        return androidx.room.util.DBUtil__DBUtil_androidKt.readVersion(file);
    }

    public static final androidx.database.SQLiteConnection toSQLiteConnection(androidx.database.db.SupportSQLiteDatabase supportSQLiteDatabase) {
        return androidx.room.util.DBUtil__DBUtil_androidKt.toSQLiteConnection(supportSQLiteDatabase);
    }
}
