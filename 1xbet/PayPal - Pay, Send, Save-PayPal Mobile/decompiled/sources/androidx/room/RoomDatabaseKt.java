package androidx.room;

@kotlin.Metadata(d1 = {"androidx/room/RoomDatabaseKt__RoomDatabaseKt", "androidx/room/RoomDatabaseKt__RoomDatabase_androidKt"}, k = 4, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RoomDatabaseKt {
    public static final <R> java.lang.Object compatTransactionCoroutineExecute(androidx.room.RoomDatabase roomDatabase, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function1, kotlin.coroutines.Continuation<? super R> continuation) {
        return androidx.room.RoomDatabaseKt__RoomDatabase_androidKt.compatTransactionCoroutineExecute(roomDatabase, function1, continuation);
    }

    @kotlin.Deprecated(message = "Replaced by equivalent API in InvalidationTracker.", replaceWith = @kotlin.ReplaceWith(expression = "this.invalidationTracker.createFlow(*tables)", imports = {}))
    public static final kotlinx.coroutines.flow.Flow<java.util.Set<java.lang.String>> invalidationTrackerFlow(androidx.room.RoomDatabase roomDatabase, java.lang.String[] strArr, boolean z) {
        return androidx.room.RoomDatabaseKt__RoomDatabase_androidKt.invalidationTrackerFlow(roomDatabase, strArr, z);
    }

    public static final <R> java.lang.Object useReaderConnection(androidx.room.RoomDatabase roomDatabase, kotlin.jvm.functions.Function2<? super androidx.room.Transactor, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super R> continuation) {
        return androidx.room.RoomDatabaseKt__RoomDatabaseKt.useReaderConnection(roomDatabase, function2, continuation);
    }

    public static final <R> java.lang.Object useWriterConnection(androidx.room.RoomDatabase roomDatabase, kotlin.jvm.functions.Function2<? super androidx.room.Transactor, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super R> continuation) {
        return androidx.room.RoomDatabaseKt__RoomDatabaseKt.useWriterConnection(roomDatabase, function2, continuation);
    }

    public static final void validateAutoMigrations(androidx.room.RoomDatabase roomDatabase, androidx.room.DatabaseConfiguration databaseConfiguration) {
        androidx.room.RoomDatabaseKt__RoomDatabaseKt.validateAutoMigrations(roomDatabase, databaseConfiguration);
    }

    public static final void validateMigrationsNotRequired(java.util.Set<java.lang.Integer> set, java.util.Set<java.lang.Integer> set2) {
        androidx.room.RoomDatabaseKt__RoomDatabaseKt.validateMigrationsNotRequired(set, set2);
    }

    public static final void validateTypeConverters(androidx.room.RoomDatabase roomDatabase, androidx.room.DatabaseConfiguration databaseConfiguration) {
        androidx.room.RoomDatabaseKt__RoomDatabaseKt.validateTypeConverters(roomDatabase, databaseConfiguration);
    }

    public static final <R> java.lang.Object withTransaction(androidx.room.RoomDatabase roomDatabase, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function1, kotlin.coroutines.Continuation<? super R> continuation) {
        return androidx.room.RoomDatabaseKt__RoomDatabase_androidKt.withTransaction(roomDatabase, function1, continuation);
    }

    public static final <R> java.lang.Object withTransactionContext(androidx.room.RoomDatabase roomDatabase, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function1, kotlin.coroutines.Continuation<? super R> continuation) {
        return androidx.room.RoomDatabaseKt__RoomDatabase_androidKt.withTransactionContext(roomDatabase, function1, continuation);
    }
}
