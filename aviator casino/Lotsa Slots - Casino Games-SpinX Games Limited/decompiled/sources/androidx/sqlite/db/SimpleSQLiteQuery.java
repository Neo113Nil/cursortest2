package androidx.sqlite.db;

/* compiled from: SimpleSQLiteQuery.kt */
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0005\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006¢\u0006\u0002\u0010\bJ\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0005\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0016"}, d2 = {"Landroidx/sqlite/db/SimpleSQLiteQuery;", "Landroidx/sqlite/db/SupportSQLiteQuery;", com.google.android.gms.actions.SearchIntents.EXTRA_QUERY, "", "(Ljava/lang/String;)V", "bindArgs", "", "", "(Ljava/lang/String;[Ljava/lang/Object;)V", "argCount", "", "getArgCount", "()I", "[Ljava/lang/Object;", "sql", "getSql", "()Ljava/lang/String;", "bindTo", "", "statement", "Landroidx/sqlite/db/SupportSQLiteProgram;", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "sqlite_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class SimpleSQLiteQuery implements androidx.sqlite.db.SupportSQLiteQuery {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.sqlite.db.SimpleSQLiteQuery.Companion INSTANCE = new androidx.sqlite.db.SimpleSQLiteQuery.Companion(null);
    private final java.lang.Object[] bindArgs;
    private final java.lang.String query;

    @kotlin.jvm.JvmStatic
    public static final void bind(androidx.sqlite.db.SupportSQLiteProgram supportSQLiteProgram, java.lang.Object[] objArr) {
        INSTANCE.bind(supportSQLiteProgram, objArr);
    }

    public SimpleSQLiteQuery(java.lang.String query, java.lang.Object[] objArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(query, "query");
        this.query = query;
        this.bindArgs = objArr;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SimpleSQLiteQuery(java.lang.String query) {
        this(query, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(query, "query");
    }

    @Override // androidx.sqlite.db.SupportSQLiteQuery
    /* renamed from: getSql, reason: from getter */
    public java.lang.String getQuery() {
        return this.query;
    }

    @Override // androidx.sqlite.db.SupportSQLiteQuery
    public void bindTo(androidx.sqlite.db.SupportSQLiteProgram statement) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statement, "statement");
        INSTANCE.bind(statement, this.bindArgs);
    }

    @Override // androidx.sqlite.db.SupportSQLiteQuery
    public int getArgCount() {
        java.lang.Object[] objArr = this.bindArgs;
        if (objArr != null) {
            return objArr.length;
        }
        return 0;
    }

    /* compiled from: SimpleSQLiteQuery.kt */
    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J)\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0001\u0018\u00010\bH\u0007¢\u0006\u0002\u0010\tJ\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0002¨\u0006\r"}, d2 = {"Landroidx/sqlite/db/SimpleSQLiteQuery$Companion;", "", "()V", "bind", "", "statement", "Landroidx/sqlite/db/SupportSQLiteProgram;", "bindArgs", "", "(Landroidx/sqlite/db/SupportSQLiteProgram;[Ljava/lang/Object;)V", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "", "arg", "sqlite_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final void bind(androidx.sqlite.db.SupportSQLiteProgram statement, java.lang.Object[] bindArgs) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statement, "statement");
            if (bindArgs == null) {
                return;
            }
            int length = bindArgs.length;
            int i = 0;
            while (i < length) {
                java.lang.Object obj = bindArgs[i];
                i++;
                bind(statement, i, obj);
            }
        }

        private final void bind(androidx.sqlite.db.SupportSQLiteProgram statement, int index, java.lang.Object arg) {
            if (arg == null) {
                statement.bindNull(index);
                return;
            }
            if (arg instanceof byte[]) {
                statement.bindBlob(index, (byte[]) arg);
                return;
            }
            if (arg instanceof java.lang.Float) {
                statement.bindDouble(index, ((java.lang.Number) arg).floatValue());
                return;
            }
            if (arg instanceof java.lang.Double) {
                statement.bindDouble(index, ((java.lang.Number) arg).doubleValue());
                return;
            }
            if (arg instanceof java.lang.Long) {
                statement.bindLong(index, ((java.lang.Number) arg).longValue());
                return;
            }
            if (arg instanceof java.lang.Integer) {
                statement.bindLong(index, ((java.lang.Number) arg).intValue());
                return;
            }
            if (arg instanceof java.lang.Short) {
                statement.bindLong(index, ((java.lang.Number) arg).shortValue());
                return;
            }
            if (arg instanceof java.lang.Byte) {
                statement.bindLong(index, ((java.lang.Number) arg).byteValue());
                return;
            }
            if (arg instanceof java.lang.String) {
                statement.bindString(index, (java.lang.String) arg);
                return;
            }
            if (arg instanceof java.lang.Boolean) {
                statement.bindLong(index, ((java.lang.Boolean) arg).booleanValue() ? 1L : 0L);
                return;
            }
            throw new java.lang.IllegalArgumentException("Cannot bind " + arg + " at index " + index + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
        }
    }
}
