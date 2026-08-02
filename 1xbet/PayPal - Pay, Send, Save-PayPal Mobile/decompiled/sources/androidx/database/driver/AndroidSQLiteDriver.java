package androidx.database.driver;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\u00020\t8WX\u0096\u0004¢\u0006\f\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\n\u0010\u000b"}, d2 = {"Landroidx/sqlite/driver/AndroidSQLiteDriver;", "Landroidx/sqlite/SQLiteDriver;", "<init>", "()V", "", "fileName", "Landroidx/sqlite/SQLiteConnection;", "open", "(Ljava/lang/String;)Landroidx/sqlite/SQLiteConnection;", "", "hasConnectionPool", "()Z", "hasConnectionPool$annotations"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AndroidSQLiteDriver implements androidx.database.SQLiteDriver {
    public static /* synthetic */ void hasConnectionPool$annotations() {
    }

    @Override // androidx.database.SQLiteDriver
    public final boolean hasConnectionPool() {
        return true;
    }

    @Override // androidx.database.SQLiteDriver
    public final androidx.database.SQLiteConnection open(java.lang.String fileName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileName, "");
        android.database.sqlite.SQLiteDatabase openOrCreateDatabase = android.database.sqlite.SQLiteDatabase.openOrCreateDatabase(fileName, (android.database.sqlite.SQLiteDatabase.CursorFactory) null);
        kotlin.jvm.internal.Intrinsics.checkNotNull(openOrCreateDatabase);
        return new androidx.database.driver.SupportSQLiteConnection(new androidx.database.db.framework.FrameworkSQLiteDatabase(openOrCreateDatabase));
    }
}
