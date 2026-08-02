package androidx.room.coroutines;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a)\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a9\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Landroidx/sqlite/SQLiteDriver;", "driver", "", "fileName", "", "preparedStatementCacheSize", "Landroidx/room/coroutines/ConnectionPool;", "newSingleConnectionPool", "(Landroidx/sqlite/SQLiteDriver;Ljava/lang/String;I)Landroidx/room/coroutines/ConnectionPool;", "maxNumOfReaders", "maxNumOfWriters", "newConnectionPool", "(Landroidx/sqlite/SQLiteDriver;Ljava/lang/String;III)Landroidx/room/coroutines/ConnectionPool;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ConnectionPoolKt {
    public static /* synthetic */ androidx.room.coroutines.ConnectionPool newSingleConnectionPool$default(androidx.database.SQLiteDriver sQLiteDriver, java.lang.String str, int i, int i2, java.lang.Object obj) {
        if ((i2 & 4) != 0) {
            i = 25;
        }
        return newSingleConnectionPool(sQLiteDriver, str, i);
    }

    public static final androidx.room.coroutines.ConnectionPool newSingleConnectionPool(androidx.database.SQLiteDriver sQLiteDriver, java.lang.String str, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sQLiteDriver, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return new androidx.room.coroutines.ConnectionPoolImpl(sQLiteDriver, str, i);
    }

    public static /* synthetic */ androidx.room.coroutines.ConnectionPool newConnectionPool$default(androidx.database.SQLiteDriver sQLiteDriver, java.lang.String str, int i, int i2, int i3, int i4, java.lang.Object obj) {
        if ((i4 & 16) != 0) {
            i3 = 25;
        }
        return newConnectionPool(sQLiteDriver, str, i, i2, i3);
    }

    public static final androidx.room.coroutines.ConnectionPool newConnectionPool(androidx.database.SQLiteDriver sQLiteDriver, java.lang.String str, int i, int i2, int i3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sQLiteDriver, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return new androidx.room.coroutines.ConnectionPoolImpl(sQLiteDriver, str, i, i2, i3);
    }
}
