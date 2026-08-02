package androidx.database.driver;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\u00020\r8WX\u0096\u0004¢\u0006\f\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f"}, d2 = {"Landroidx/sqlite/driver/SupportSQLiteDriver;", "Landroidx/sqlite/SQLiteDriver;", "Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "openHelper", "<init>", "(Landroidx/sqlite/db/SupportSQLiteOpenHelper;)V", "", "fileName", "Landroidx/sqlite/driver/SupportSQLiteConnection;", "open", "(Ljava/lang/String;)Landroidx/sqlite/driver/SupportSQLiteConnection;", "getHighSpeedVideoFpsRangesFor", "Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "", "hasConnectionPool", "()Z", "hasConnectionPool$annotations", "()V"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SupportSQLiteDriver implements androidx.database.SQLiteDriver {
    private final androidx.database.db.SupportSQLiteOpenHelper getHighSpeedVideoFpsRangesFor;

    public static /* synthetic */ void hasConnectionPool$annotations() {
    }

    @Override // androidx.database.SQLiteDriver
    public final boolean hasConnectionPool() {
        return true;
    }

    public SupportSQLiteDriver(androidx.database.db.SupportSQLiteOpenHelper supportSQLiteOpenHelper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(supportSQLiteOpenHelper, "");
        this.getHighSpeedVideoFpsRangesFor = supportSQLiteOpenHelper;
    }

    @Override // androidx.database.SQLiteDriver
    public final androidx.database.driver.SupportSQLiteConnection open(java.lang.String fileName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileName, "");
        java.lang.String getHighSpeedVideoSizes = this.getHighSpeedVideoFpsRangesFor.getGetHighSpeedVideoSizes();
        if (getHighSpeedVideoSizes == null) {
            if (!kotlin.jvm.internal.Intrinsics.areEqual(fileName, net.zetetic.database.sqlcipher.SQLiteDatabaseConfiguration.MEMORY_DB_PATH)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("This driver is configured to open an in-memory database but a file-based named '");
                sb.append(fileName);
                sb.append("' was requested.");
                throw new java.lang.IllegalArgumentException(sb.toString().toString());
            }
        } else if (!kotlin.jvm.internal.Intrinsics.areEqual(getHighSpeedVideoSizes, fileName) && !kotlin.jvm.internal.Intrinsics.areEqual(kotlin.text.StringsKt.substringAfterLast$default(getHighSpeedVideoSizes, kotlinx.io.files.FileSystemKt.UnixPathSeparator, (java.lang.String) null, 2, (java.lang.Object) null), kotlin.text.StringsKt.substringAfterLast$default(fileName, kotlinx.io.files.FileSystemKt.UnixPathSeparator, (java.lang.String) null, 2, (java.lang.Object) null))) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("This driver is configured to open a database named '");
            sb2.append(this.getHighSpeedVideoFpsRangesFor.getGetHighSpeedVideoSizes());
            sb2.append("' but '");
            sb2.append(fileName);
            sb2.append("' was requested.");
            throw new java.lang.IllegalArgumentException(sb2.toString().toString());
        }
        return new androidx.database.driver.SupportSQLiteConnection(this.getHighSpeedVideoFpsRangesFor.getWritableDatabase());
    }
}
