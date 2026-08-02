package androidx.room.util;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u0006\n\u0004\b\u0004\u0010\u0010"}, d2 = {"Landroidx/room/util/ViewInfo;", "", "", "name", com.datadog.trace.api.DDSpanTypes.SQL, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ViewInfo {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.room.util.ViewInfo.Companion INSTANCE = new androidx.room.util.ViewInfo.Companion(null);
    public final java.lang.String name;
    public final java.lang.String sql;

    public ViewInfo(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.name = str;
        this.sql = str2;
    }

    public final boolean equals(java.lang.Object other) {
        return androidx.room.util.ViewInfoKt.equalsCommon(this, other);
    }

    public final int hashCode() {
        return androidx.room.util.ViewInfoKt.hashCodeCommon(this);
    }

    public final java.lang.String toString() {
        return androidx.room.util.ViewInfoKt.toStringCommon(this);
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\r"}, d2 = {"Landroidx/room/util/ViewInfo$Companion;", "", "<init>", "()V", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "database", "", "viewName", "Landroidx/room/util/ViewInfo;", "read", "(Landroidx/sqlite/db/SupportSQLiteDatabase;Ljava/lang/String;)Landroidx/room/util/ViewInfo;", "Landroidx/sqlite/SQLiteConnection;", "connection", "(Landroidx/sqlite/SQLiteConnection;Ljava/lang/String;)Landroidx/room/util/ViewInfo;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @kotlin.Deprecated(message = "No longer used by generated code.")
        @kotlin.jvm.JvmStatic
        public final androidx.room.util.ViewInfo read(androidx.database.db.SupportSQLiteDatabase database, java.lang.String viewName) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(database, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewName, "");
            return read(new androidx.database.driver.SupportSQLiteConnection(database), viewName);
        }

        @kotlin.jvm.JvmStatic
        public final androidx.room.util.ViewInfo read(androidx.database.SQLiteConnection connection, java.lang.String viewName) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connection, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewName, "");
            return androidx.room.util.SchemaInfoUtilKt.readViewInfo(connection, viewName);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Deprecated(message = "No longer used by generated code.")
    @kotlin.jvm.JvmStatic
    public static final androidx.room.util.ViewInfo read(androidx.database.db.SupportSQLiteDatabase supportSQLiteDatabase, java.lang.String str) {
        return INSTANCE.read(supportSQLiteDatabase, str);
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.room.util.ViewInfo read(androidx.database.SQLiteConnection sQLiteConnection, java.lang.String str) {
        return INSTANCE.read(sQLiteConnection, str);
    }
}
