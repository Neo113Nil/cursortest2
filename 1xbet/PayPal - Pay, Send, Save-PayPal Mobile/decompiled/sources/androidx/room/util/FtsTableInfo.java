package androidx.room.util;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bB'\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\u0006\u0010\u0015"}, d2 = {"Landroidx/room/util/FtsTableInfo;", "", "", "name", "", "columns", "options", "<init>", "(Ljava/lang/String;Ljava/util/Set;Ljava/util/Set;)V", "createSql", "(Ljava/lang/String;Ljava/util/Set;Ljava/lang/String;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "Ljava/util/Set;", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class FtsTableInfo {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.room.util.FtsTableInfo.Companion INSTANCE = new androidx.room.util.FtsTableInfo.Companion(null);
    public final java.util.Set<java.lang.String> columns;
    public final java.lang.String name;
    public final java.util.Set<java.lang.String> options;

    public FtsTableInfo(java.lang.String str, java.util.Set<java.lang.String> set, java.util.Set<java.lang.String> set2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set2, "");
        this.name = str;
        this.columns = set;
        this.options = set2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FtsTableInfo(java.lang.String str, java.util.Set<java.lang.String> set, java.lang.String str2) {
        this(str, set, androidx.room.util.SchemaInfoUtilKt.parseFtsOptions(str2));
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
    }

    public final boolean equals(java.lang.Object other) {
        return androidx.room.util.FtsTableInfoKt.equalsCommon(this, other);
    }

    public final int hashCode() {
        return androidx.room.util.FtsTableInfoKt.hashCodeCommon(this);
    }

    public final java.lang.String toString() {
        return androidx.room.util.FtsTableInfoKt.toStringCommon(this);
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\r"}, d2 = {"Landroidx/room/util/FtsTableInfo$Companion;", "", "<init>", "()V", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "database", "", "tableName", "Landroidx/room/util/FtsTableInfo;", "read", "(Landroidx/sqlite/db/SupportSQLiteDatabase;Ljava/lang/String;)Landroidx/room/util/FtsTableInfo;", "Landroidx/sqlite/SQLiteConnection;", "connection", "(Landroidx/sqlite/SQLiteConnection;Ljava/lang/String;)Landroidx/room/util/FtsTableInfo;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final androidx.room.util.FtsTableInfo read(androidx.database.db.SupportSQLiteDatabase database, java.lang.String tableName) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(database, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tableName, "");
            return read(new androidx.database.driver.SupportSQLiteConnection(database), tableName);
        }

        @kotlin.jvm.JvmStatic
        public final androidx.room.util.FtsTableInfo read(androidx.database.SQLiteConnection connection, java.lang.String tableName) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connection, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tableName, "");
            return new androidx.room.util.FtsTableInfo(tableName, androidx.room.util.SchemaInfoUtilKt.readFtsColumns(connection, tableName), androidx.room.util.SchemaInfoUtilKt.readFtsOptions(connection, tableName));
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.room.util.FtsTableInfo read(androidx.database.db.SupportSQLiteDatabase supportSQLiteDatabase, java.lang.String str) {
        return INSTANCE.read(supportSQLiteDatabase, str);
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.room.util.FtsTableInfo read(androidx.database.SQLiteConnection sQLiteConnection, java.lang.String str) {
        return INSTANCE.read(sQLiteConnection, str);
    }
}
