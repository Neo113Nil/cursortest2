package androidx.database.db;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R \u0010\u0014\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00028WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a"}, d2 = {"Landroidx/sqlite/db/SimpleSQLiteQuery;", "Landroidx/sqlite/db/SupportSQLiteQuery;", "", "query", "", "", "bindArgs", "<init>", "(Ljava/lang/String;[Ljava/lang/Object;)V", "(Ljava/lang/String;)V", "Landroidx/sqlite/db/SupportSQLiteProgram;", "statement", "", "bindTo", "(Landroidx/sqlite/db/SupportSQLiteProgram;)V", "getHighSpeedVideoSizes", "Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", "getHighResolutionOutputSizeshNQ4ISI", "[Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "getSql", "()Ljava/lang/String;", com.datadog.trace.api.DDSpanTypes.SQL, "", "getArgCount", "()I", "argCount", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SimpleSQLiteQuery implements androidx.database.db.SupportSQLiteQuery {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.database.db.SimpleSQLiteQuery.Companion INSTANCE = new androidx.database.db.SimpleSQLiteQuery.Companion(null);

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.lang.Object[] getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.lang.String getHighSpeedVideoFpsRangesFor;

    public SimpleSQLiteQuery(java.lang.String str, java.lang.Object[] objArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.getHighSpeedVideoFpsRangesFor = str;
        this.getHighSpeedVideoFpsRanges = objArr;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SimpleSQLiteQuery(java.lang.String str) {
        this(str, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
    }

    @Override // androidx.database.db.SupportSQLiteQuery
    /* renamed from: getSql, reason: from getter */
    public final java.lang.String getGetHighSpeedVideoFpsRangesFor() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // androidx.database.db.SupportSQLiteQuery
    public final void bindTo(androidx.database.db.SupportSQLiteProgram statement) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statement, "");
        INSTANCE.bind(statement, this.getHighSpeedVideoFpsRanges);
    }

    @Override // androidx.database.db.SupportSQLiteQuery
    public final int getArgCount() {
        java.lang.Object[] objArr = this.getHighSpeedVideoFpsRanges;
        if (objArr != null) {
            return objArr.length;
        }
        return 0;
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0007\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Landroidx/sqlite/db/SimpleSQLiteQuery$Companion;", "", "<init>", "()V", "Landroidx/sqlite/db/SupportSQLiteProgram;", "statement", "", "bindArgs", "", "bind", "(Landroidx/sqlite/db/SupportSQLiteProgram;[Ljava/lang/Object;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final void bind(androidx.database.db.SupportSQLiteProgram statement, java.lang.Object[] bindArgs) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statement, "");
            if (bindArgs != null) {
                int length = bindArgs.length;
                int i = 0;
                while (i < length) {
                    java.lang.Object obj = bindArgs[i];
                    i++;
                    if (obj == null) {
                        statement.bindNull(i);
                    } else if (obj instanceof byte[]) {
                        statement.bindBlob(i, (byte[]) obj);
                    } else if (obj instanceof java.lang.Float) {
                        statement.bindDouble(i, ((java.lang.Number) obj).floatValue());
                    } else if (obj instanceof java.lang.Double) {
                        statement.bindDouble(i, ((java.lang.Number) obj).doubleValue());
                    } else if (obj instanceof java.lang.Long) {
                        statement.bindLong(i, ((java.lang.Number) obj).longValue());
                    } else if (obj instanceof java.lang.Integer) {
                        statement.bindLong(i, ((java.lang.Number) obj).intValue());
                    } else if (obj instanceof java.lang.Short) {
                        statement.bindLong(i, ((java.lang.Number) obj).shortValue());
                    } else if (obj instanceof java.lang.Byte) {
                        statement.bindLong(i, ((java.lang.Number) obj).byteValue());
                    } else if (obj instanceof java.lang.String) {
                        statement.bindString(i, (java.lang.String) obj);
                    } else if (obj instanceof java.lang.Boolean) {
                        statement.bindLong(i, ((java.lang.Boolean) obj).booleanValue() ? 1L : 0L);
                    } else {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot bind ");
                        sb.append(obj);
                        sb.append(" at index ");
                        sb.append(i);
                        sb.append(" Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
                        throw new java.lang.IllegalArgumentException(sb.toString());
                    }
                }
            }
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.jvm.JvmStatic
    public static final void bind(androidx.database.db.SupportSQLiteProgram supportSQLiteProgram, java.lang.Object[] objArr) {
        INSTANCE.bind(supportSQLiteProgram, objArr);
    }
}
