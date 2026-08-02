package androidx.database.driver;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u0000 \u00192\u00020\u0001:\u0005\u0019\u001a\u001b\u001c\u001dB\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0004¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u00028\u0005X\u0084\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u00048\u0005X\u0085\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\"\u0010\u0014\u001a\u00020\u00138\u0005@\u0005X\u0085\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016\"\u0004\b\u0017\u0010\u0018\u0082\u0001\u0004\u001e\u001f !"}, d2 = {"Landroidx/sqlite/driver/SupportSQLiteStatement;", "Landroidx/sqlite/SQLiteStatement;", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "p0", "", "p1", "<init>", "(Landroidx/sqlite/db/SupportSQLiteDatabase;Ljava/lang/String;)V", "", "throwIfClosed", "()V", com.datadog.trace.api.DDSpanTypes.COUCHBASE, "Landroidx/sqlite/db/SupportSQLiteDatabase;", "getDb", "()Landroidx/sqlite/db/SupportSQLiteDatabase;", com.datadog.trace.api.DDSpanTypes.SQL, "Ljava/lang/String;", "getSql", "()Ljava/lang/String;", "", "isClosed", "Z", "()Z", "setClosed", "(Z)V", "Companion", "TransactionSQLiteStatement", "JournalModeSetStatement", "RowSQLiteStatement", "OtherSQLiteStatement", "Landroidx/sqlite/driver/SupportSQLiteStatement$JournalModeSetStatement;", "Landroidx/sqlite/driver/SupportSQLiteStatement$OtherSQLiteStatement;", "Landroidx/sqlite/driver/SupportSQLiteStatement$RowSQLiteStatement;", "Landroidx/sqlite/driver/SupportSQLiteStatement$TransactionSQLiteStatement;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class SupportSQLiteStatement implements androidx.database.SQLiteStatement {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.database.driver.SupportSQLiteStatement.Companion INSTANCE = new androidx.database.driver.SupportSQLiteStatement.Companion(null);
    private final androidx.database.db.SupportSQLiteDatabase db;
    private boolean isClosed;
    private final java.lang.String sql;

    private SupportSQLiteStatement(androidx.database.db.SupportSQLiteDatabase supportSQLiteDatabase, java.lang.String str) {
        this.db = supportSQLiteDatabase;
        this.sql = str;
    }

    protected final androidx.database.db.SupportSQLiteDatabase getDb() {
        return this.db;
    }

    protected final java.lang.String getSql() {
        return this.sql;
    }

    /* renamed from: isClosed, reason: from getter */
    protected final boolean getIsClosed() {
        return this.isClosed;
    }

    protected final void setClosed(boolean z) {
        this.isClosed = z;
    }

    protected final void throwIfClosed() {
        if (this.isClosed) {
            androidx.database.SQLite.throwSQLiteException(21, "statement is closed");
            throw new kotlin.KotlinNothingValueException();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0002\r\u000eB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Landroidx/sqlite/driver/SupportSQLiteStatement$Companion;", "", "<init>", "()V", "Landroidx/sqlite/db/SupportSQLiteDatabase;", com.datadog.trace.api.DDSpanTypes.COUCHBASE, "", com.datadog.trace.api.DDSpanTypes.SQL, "Landroidx/sqlite/driver/SupportSQLiteStatement;", "create", "(Landroidx/sqlite/db/SupportSQLiteDatabase;Ljava/lang/String;)Landroidx/sqlite/driver/SupportSQLiteStatement;", "getStatementPrefix$sqlite_framework", "(Ljava/lang/String;)Ljava/lang/String;", "TransactionOperation", "SpecialOperation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x0053, code lost:
        
            if (r2.equals("END") == false) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x005e, code lost:
        
            r3 = androidx.sqlite.driver.SupportSQLiteStatement.Companion.TransactionOperation.getHighSpeedVideoSizes;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x005c, code lost:
        
            if (r2.equals("COM") != false) goto L19;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final androidx.database.driver.SupportSQLiteStatement create(androidx.database.db.SupportSQLiteDatabase db, java.lang.String sql) {
            androidx.sqlite.driver.SupportSQLiteStatement.Companion.TransactionOperation transactionOperation;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(db, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sql, "");
            java.lang.String upperCase = kotlin.text.StringsKt.trim(sql).toString().toUpperCase(java.util.Locale.ROOT);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "");
            java.lang.String statementPrefix$sqlite_framework = getStatementPrefix$sqlite_framework(upperCase);
            if (statementPrefix$sqlite_framework == null) {
                return new androidx.sqlite.driver.SupportSQLiteStatement.OtherSQLiteStatement(db, sql);
            }
            switch (statementPrefix$sqlite_framework.hashCode()) {
                case 65636:
                    if (statementPrefix$sqlite_framework.equals("BEG")) {
                        java.lang.String str = upperCase;
                        if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) "EXCLUSIVE", false, 2, (java.lang.Object) null)) {
                            transactionOperation = androidx.sqlite.driver.SupportSQLiteStatement.Companion.TransactionOperation.getHighSpeedVideoFpsRangesFor;
                            break;
                        } else if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) "IMMEDIATE", false, 2, (java.lang.Object) null)) {
                            transactionOperation = androidx.sqlite.driver.SupportSQLiteStatement.Companion.TransactionOperation.Camera2StreamConfigurationMap;
                            break;
                        } else {
                            transactionOperation = androidx.sqlite.driver.SupportSQLiteStatement.Companion.TransactionOperation.getHighSpeedVideoFpsRanges;
                            break;
                        }
                    }
                    transactionOperation = null;
                    break;
                case 66913:
                    break;
                case 68795:
                    break;
                case 81327:
                    if (statementPrefix$sqlite_framework.equals("ROL") && !kotlin.text.StringsKt.contains$default((java.lang.CharSequence) upperCase, (java.lang.CharSequence) " TO ", false, 2, (java.lang.Object) null)) {
                        transactionOperation = androidx.sqlite.driver.SupportSQLiteStatement.Companion.TransactionOperation.getHighResolutionOutputSizeshNQ4ISI;
                        break;
                    }
                    transactionOperation = null;
                    break;
                default:
                    transactionOperation = null;
                    break;
            }
            if (transactionOperation != null) {
                return new androidx.sqlite.driver.SupportSQLiteStatement.TransactionSQLiteStatement(db, sql, transactionOperation);
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(statementPrefix$sqlite_framework, "PRA")) {
                java.lang.String lowerCase = upperCase.toLowerCase(java.util.Locale.ROOT);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                r6 = (androidx.sqlite.driver.SupportSQLiteStatement.Companion.SpecialOperation) (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) kotlin.text.StringsKt.substringAfter(lowerCase, "journal_mode", ""), (java.lang.CharSequence) "=", false, 2, (java.lang.Object) null) ? androidx.sqlite.driver.SupportSQLiteStatement.Companion.SpecialOperation.JournalModeOperation.INSTANCE : null);
            }
            if (r6 instanceof androidx.sqlite.driver.SupportSQLiteStatement.Companion.SpecialOperation.JournalModeOperation) {
                return new androidx.sqlite.driver.SupportSQLiteStatement.JournalModeSetStatement(db, sql, new androidx.sqlite.driver.SupportSQLiteStatement.RowSQLiteStatement(db, sql));
            }
            int hashCode = statementPrefix$sqlite_framework.hashCode();
            if (hashCode == 79487 ? statementPrefix$sqlite_framework.equals("PRA") : !(hashCode == 81978 ? !statementPrefix$sqlite_framework.equals("SEL") : !(hashCode == 85954 && statementPrefix$sqlite_framework.equals("WIT")))) {
                return new androidx.sqlite.driver.SupportSQLiteStatement.RowSQLiteStatement(db, sql);
            }
            return new androidx.sqlite.driver.SupportSQLiteStatement.OtherSQLiteStatement(db, sql);
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Landroidx/sqlite/driver/SupportSQLiteStatement$Companion$TransactionOperation;", "", "<init>", "(Ljava/lang/String;I)V", "getHighSpeedVideoSizes", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRangesFor", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 1, 0}, xi = 48)
        static final class TransactionOperation {
            public static final androidx.sqlite.driver.SupportSQLiteStatement.Companion.TransactionOperation Camera2StreamConfigurationMap;
            public static final androidx.sqlite.driver.SupportSQLiteStatement.Companion.TransactionOperation getHighResolutionOutputSizeshNQ4ISI;
            public static final androidx.sqlite.driver.SupportSQLiteStatement.Companion.TransactionOperation getHighSpeedVideoFpsRanges;
            public static final androidx.sqlite.driver.SupportSQLiteStatement.Companion.TransactionOperation getHighSpeedVideoFpsRangesFor;
            public static final androidx.sqlite.driver.SupportSQLiteStatement.Companion.TransactionOperation getHighSpeedVideoSizes;
            private static final /* synthetic */ androidx.sqlite.driver.SupportSQLiteStatement.Companion.TransactionOperation[] getInputSizeshNQ4ISI;
            private static final /* synthetic */ kotlin.enums.EnumEntries getOutputFormats;

            private TransactionOperation(java.lang.String str, int i) {
            }

            static {
                androidx.sqlite.driver.SupportSQLiteStatement.Companion.TransactionOperation transactionOperation = new androidx.sqlite.driver.SupportSQLiteStatement.Companion.TransactionOperation("END", 0);
                getHighSpeedVideoSizes = transactionOperation;
                androidx.sqlite.driver.SupportSQLiteStatement.Companion.TransactionOperation transactionOperation2 = new androidx.sqlite.driver.SupportSQLiteStatement.Companion.TransactionOperation("ROLLBACK", 1);
                getHighResolutionOutputSizeshNQ4ISI = transactionOperation2;
                androidx.sqlite.driver.SupportSQLiteStatement.Companion.TransactionOperation transactionOperation3 = new androidx.sqlite.driver.SupportSQLiteStatement.Companion.TransactionOperation("BEGIN_EXCLUSIVE", 2);
                getHighSpeedVideoFpsRangesFor = transactionOperation3;
                androidx.sqlite.driver.SupportSQLiteStatement.Companion.TransactionOperation transactionOperation4 = new androidx.sqlite.driver.SupportSQLiteStatement.Companion.TransactionOperation("BEGIN_IMMEDIATE", 3);
                Camera2StreamConfigurationMap = transactionOperation4;
                androidx.sqlite.driver.SupportSQLiteStatement.Companion.TransactionOperation transactionOperation5 = new androidx.sqlite.driver.SupportSQLiteStatement.Companion.TransactionOperation("BEGIN_DEFERRED", 4);
                getHighSpeedVideoFpsRanges = transactionOperation5;
                androidx.sqlite.driver.SupportSQLiteStatement.Companion.TransactionOperation[] transactionOperationArr = {transactionOperation, transactionOperation2, transactionOperation3, transactionOperation4, transactionOperation5};
                getInputSizeshNQ4ISI = transactionOperationArr;
                getOutputFormats = kotlin.enums.EnumEntriesKt.enumEntries(transactionOperationArr);
            }

            public static androidx.sqlite.driver.SupportSQLiteStatement.Companion.TransactionOperation[] values() {
                return (androidx.sqlite.driver.SupportSQLiteStatement.Companion.TransactionOperation[]) getInputSizeshNQ4ISI.clone();
            }

            public static androidx.sqlite.driver.SupportSQLiteStatement.Companion.TransactionOperation valueOf(java.lang.String str) {
                return (androidx.sqlite.driver.SupportSQLiteStatement.Companion.TransactionOperation) java.lang.Enum.valueOf(androidx.sqlite.driver.SupportSQLiteStatement.Companion.TransactionOperation.class, str);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\b2\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005"}, d2 = {"Landroidx/sqlite/driver/SupportSQLiteStatement$Companion$SpecialOperation;", "", "<init>", "()V", "JournalModeOperation", "Landroidx/sqlite/driver/SupportSQLiteStatement$Companion$SpecialOperation$JournalModeOperation;"}, k = 1, mv = {2, 1, 0}, xi = 48)
        static abstract class SpecialOperation {

            @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/sqlite/driver/SupportSQLiteStatement$Companion$SpecialOperation$JournalModeOperation;", "Landroidx/sqlite/driver/SupportSQLiteStatement$Companion$SpecialOperation;", "<init>", "()V"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class JournalModeOperation extends androidx.sqlite.driver.SupportSQLiteStatement.Companion.SpecialOperation {
                public static final androidx.sqlite.driver.SupportSQLiteStatement.Companion.SpecialOperation.JournalModeOperation INSTANCE = new androidx.sqlite.driver.SupportSQLiteStatement.Companion.SpecialOperation.JournalModeOperation();

                private JournalModeOperation() {
                    super(null);
                }
            }

            private SpecialOperation() {
            }

            public /* synthetic */ SpecialOperation(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public final java.lang.String getStatementPrefix$sqlite_framework(java.lang.String sql) {
            int i;
            int i2;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sql, "");
            int length = sql.length() - 2;
            if (length >= 0) {
                i = 0;
                loop0: while (i < length) {
                    char charAt = sql.charAt(i);
                    if (kotlin.jvm.internal.Intrinsics.compare((int) charAt, 32) > 0) {
                        if (charAt != '-') {
                            if (charAt != '/') {
                                break;
                            }
                            int i3 = i + 1;
                            if (sql.charAt(i3) != '*') {
                                break;
                            }
                            do {
                                i3 = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) sql, '*', i3 + 1, false, 4, (java.lang.Object) null);
                                if (i3 < 0) {
                                    break loop0;
                                }
                                i2 = i3 + 1;
                                if (i2 >= length) {
                                    break;
                                }
                            } while (sql.charAt(i2) != '/');
                            i = i3 + 2;
                        } else if (sql.charAt(i + 1) == '-') {
                            i = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) sql, '\n', i + 2, false, 4, (java.lang.Object) null);
                            if (i < 0) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    i++;
                }
            }
            i = -1;
            if (i < 0 || i > sql.length()) {
                return null;
            }
            java.lang.String substring = sql.substring(i, java.lang.Math.min(i + 3, sql.length()));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
            return substring;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0010\u0012\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020!2\u0006\u0010\u0003\u001a\u00020\nH\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\nH\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\nH\u0016¢\u0006\u0004\b&\u0010 J\u0017\u0010'\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\nH\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020!H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\fH\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\fH\u0016¢\u0006\u0004\b-\u0010,J\u000f\u0010.\u001a\u00020\fH\u0016¢\u0006\u0004\b.\u0010,R\u0011\u00101\u001a\u00020\u00068\u0006¢\u0006\u0006\n\u0004\b/\u00100"}, d2 = {"Landroidx/sqlite/driver/SupportSQLiteStatement$TransactionSQLiteStatement;", "Landroidx/sqlite/driver/SupportSQLiteStatement;", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "p0", "", "p1", "Landroidx/sqlite/driver/SupportSQLiteStatement$Companion$TransactionOperation;", "p2", "<init>", "(Landroidx/sqlite/db/SupportSQLiteDatabase;Ljava/lang/String;Landroidx/sqlite/driver/SupportSQLiteStatement$Companion$TransactionOperation;)V", "", "", "", "bindBlob", "(I[B)V", "", "bindDouble", "(ID)V", "", "bindLong", "(IJ)V", "bindText", "(ILjava/lang/String;)V", "bindNull", "(I)V", "getBlob", "(I)[B", "getDouble", "(I)D", "getLong", "(I)J", "getText", "(I)Ljava/lang/String;", "", "isNull", "(I)Z", "getColumnCount", "()I", "getColumnName", "getColumnType", "(I)I", "step", "()Z", "reset", "()V", "clearBindings", "close", "getHighSpeedVideoSizes", "Landroidx/sqlite/driver/SupportSQLiteStatement$Companion$TransactionOperation;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class TransactionSQLiteStatement extends androidx.database.driver.SupportSQLiteStatement {

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private final androidx.sqlite.driver.SupportSQLiteStatement.Companion.TransactionOperation getHighSpeedVideoFpsRanges;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TransactionSQLiteStatement(androidx.database.db.SupportSQLiteDatabase supportSQLiteDatabase, java.lang.String str, androidx.sqlite.driver.SupportSQLiteStatement.Companion.TransactionOperation transactionOperation) {
            super(supportSQLiteDatabase, str, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionOperation, "");
            this.getHighSpeedVideoFpsRanges = transactionOperation;
        }

        @Override // androidx.database.SQLiteStatement
        /* renamed from: bindBlob */
        public final void mo9283bindBlob(int p0, byte[] p1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "");
            throwIfClosed();
            androidx.database.SQLite.throwSQLiteException(25, "column index out of range");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // androidx.database.SQLiteStatement
        /* renamed from: bindDouble */
        public final void mo9284bindDouble(int p0, double p1) {
            throwIfClosed();
            androidx.database.SQLite.throwSQLiteException(25, "column index out of range");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // androidx.database.SQLiteStatement
        /* renamed from: bindLong */
        public final void mo9285bindLong(int p0, long p1) {
            throwIfClosed();
            androidx.database.SQLite.throwSQLiteException(25, "column index out of range");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // androidx.database.SQLiteStatement
        /* renamed from: bindText */
        public final void mo9287bindText(int p0, java.lang.String p1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "");
            throwIfClosed();
            androidx.database.SQLite.throwSQLiteException(25, "column index out of range");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // androidx.database.SQLiteStatement
        /* renamed from: bindNull */
        public final void mo9286bindNull(int p0) {
            throwIfClosed();
            androidx.database.SQLite.throwSQLiteException(25, "column index out of range");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // androidx.database.SQLiteStatement
        public final byte[] getBlob(int p0) {
            throwIfClosed();
            androidx.database.SQLite.throwSQLiteException(21, "no row");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // androidx.database.SQLiteStatement
        public final double getDouble(int p0) {
            throwIfClosed();
            androidx.database.SQLite.throwSQLiteException(21, "no row");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // androidx.database.SQLiteStatement
        public final long getLong(int p0) {
            throwIfClosed();
            androidx.database.SQLite.throwSQLiteException(21, "no row");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // androidx.database.SQLiteStatement
        public final java.lang.String getText(int p0) {
            throwIfClosed();
            androidx.database.SQLite.throwSQLiteException(21, "no row");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // androidx.database.SQLiteStatement
        public final boolean isNull(int p0) {
            throwIfClosed();
            androidx.database.SQLite.throwSQLiteException(21, "no row");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // androidx.database.SQLiteStatement
        public final int getColumnCount() {
            throwIfClosed();
            return 0;
        }

        @Override // androidx.database.SQLiteStatement
        public final java.lang.String getColumnName(int p0) {
            throwIfClosed();
            androidx.database.SQLite.throwSQLiteException(21, "no row");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // androidx.database.SQLiteStatement
        public final int getColumnType(int p0) {
            throwIfClosed();
            androidx.database.SQLite.throwSQLiteException(21, "no row");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // androidx.database.SQLiteStatement
        public final boolean step() {
            int i = androidx.sqlite.driver.SupportSQLiteStatement.TransactionSQLiteStatement.WhenMappings.$EnumSwitchMapping$0[this.getHighSpeedVideoFpsRanges.ordinal()];
            if (i == 1) {
                getDb().setTransactionSuccessful();
                getDb().endTransaction();
                return false;
            }
            if (i == 2) {
                getDb().endTransaction();
                return false;
            }
            if (i == 3) {
                getDb().beginTransaction();
                return false;
            }
            if (i == 4) {
                getDb().beginTransactionNonExclusive();
                return false;
            }
            if (i != 5) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            getDb().beginTransactionReadOnly();
            return false;
        }

        @Override // androidx.database.SQLiteStatement
        public final void reset() {
            throwIfClosed();
        }

        @Override // androidx.database.SQLiteStatement
        /* renamed from: clearBindings */
        public final void mo9288clearBindings() {
            throwIfClosed();
        }

        @Override // androidx.database.SQLiteStatement, java.lang.AutoCloseable
        public final void close() {
            setClosed(true);
        }

        @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[androidx.sqlite.driver.SupportSQLiteStatement.Companion.TransactionOperation.values().length];
                try {
                    iArr[androidx.sqlite.driver.SupportSQLiteStatement.Companion.TransactionOperation.getHighSpeedVideoSizes.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[androidx.sqlite.driver.SupportSQLiteStatement.Companion.TransactionOperation.getHighResolutionOutputSizeshNQ4ISI.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                try {
                    iArr[androidx.sqlite.driver.SupportSQLiteStatement.Companion.TransactionOperation.getHighSpeedVideoFpsRangesFor.ordinal()] = 3;
                } catch (java.lang.NoSuchFieldError unused3) {
                }
                try {
                    iArr[androidx.sqlite.driver.SupportSQLiteStatement.Companion.TransactionOperation.Camera2StreamConfigurationMap.ordinal()] = 4;
                } catch (java.lang.NoSuchFieldError unused4) {
                }
                try {
                    iArr[androidx.sqlite.driver.SupportSQLiteStatement.Companion.TransactionOperation.getHighSpeedVideoFpsRanges.ordinal()] = 5;
                } catch (java.lang.NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0010\u0012\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0010 \n\u0002\b\u0011\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0001¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u000eH\u0096\u0001¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0014H\u0096\u0001¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0017H\u0096\u0001¢\u0006\u0004\b\u0018\u0010\u0019J \u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\rH\u0096\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ \u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u001cH\u0096\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\rH\u0096\u0001¢\u0006\u0004\b\u001f\u0010 J \u0010!\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0005H\u0096\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\b%\u0010$J\u0018\u0010&\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\rH\u0096\u0001¢\u0006\u0004\b&\u0010'J\u0018\u0010(\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\rH\u0096\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\rH\u0096\u0001¢\u0006\u0004\b*\u0010+J\u0018\u0010,\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\rH\u0096\u0001¢\u0006\u0004\b,\u0010-J\u0016\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00050.H\u0096\u0001¢\u0006\u0004\b/\u00100J\u0018\u00101\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\rH\u0096\u0001¢\u0006\u0004\b1\u00102J\u0018\u00103\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\rH\u0096\u0001¢\u0006\u0004\b3\u00104J\u0018\u00105\u001a\u00020\u00172\u0006\u0010\u0004\u001a\u00020\rH\u0096\u0001¢\u0006\u0004\b5\u00106J\u0018\u00107\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\rH\u0096\u0001¢\u0006\u0004\b7\u00102J\u0018\u00108\u001a\u00020\u001c2\u0006\u0010\u0004\u001a\u00020\rH\u0096\u0001¢\u0006\u0004\b8\u00109J\u0018\u0010:\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\rH\u0096\u0001¢\u0006\u0004\b:\u0010-J\u0018\u0010;\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\rH\u0096\u0001¢\u0006\u0004\b;\u0010)J\u0010\u0010<\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\b<\u0010$R\u0014\u0010?\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>"}, d2 = {"Landroidx/sqlite/driver/SupportSQLiteStatement$JournalModeSetStatement;", "Landroidx/sqlite/driver/SupportSQLiteStatement;", "Landroidx/sqlite/SQLiteStatement;", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "p0", "", "p1", "p2", "<init>", "(Landroidx/sqlite/db/SupportSQLiteDatabase;Ljava/lang/String;Landroidx/sqlite/driver/SupportSQLiteStatement;)V", "", "step", "()Z", "", "", "", "bindBlob", "(I[B)V", "bindBoolean", "(IZ)V", "", "bindDouble", "(ID)V", "", "bindFloat", "(IF)V", "bindInt", "(II)V", "", "bindLong", "(IJ)V", "bindNull", "(I)V", "bindText", "(ILjava/lang/String;)V", "clearBindings", "()V", "close", "getBlob", "(I)[B", "getBoolean", "(I)Z", "getColumnCount", "()I", "getColumnName", "(I)Ljava/lang/String;", "", "getColumnNames", "()Ljava/util/List;", "getColumnType", "(I)I", "getDouble", "(I)D", "getFloat", "(I)F", "getInt", "getLong", "(I)J", "getText", "isNull", "reset", "getHighSpeedVideoFpsRanges", "Landroidx/sqlite/driver/SupportSQLiteStatement;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class JournalModeSetStatement extends androidx.database.driver.SupportSQLiteStatement implements androidx.database.SQLiteStatement {

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private final androidx.database.driver.SupportSQLiteStatement getHighSpeedVideoFpsRangesFor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public JournalModeSetStatement(androidx.database.db.SupportSQLiteDatabase supportSQLiteDatabase, java.lang.String str, androidx.database.driver.SupportSQLiteStatement supportSQLiteStatement) {
            super(supportSQLiteDatabase, str, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(supportSQLiteStatement, "");
            this.getHighSpeedVideoFpsRangesFor = supportSQLiteStatement;
        }

        @Override // androidx.database.SQLiteStatement
        public final boolean step() {
            boolean step = this.getHighSpeedVideoFpsRangesFor.step();
            if (kotlin.text.StringsKt.equals(getText(0), "wal", true)) {
                getDb().enableWriteAheadLogging();
                return step;
            }
            getDb().disableWriteAheadLogging();
            return step;
        }

        @Override // androidx.database.SQLiteStatement
        public final void reset() {
            this.getHighSpeedVideoFpsRangesFor.reset();
        }

        @Override // androidx.database.SQLiteStatement
        public final boolean isNull(int p0) {
            return this.getHighSpeedVideoFpsRangesFor.isNull(p0);
        }

        @Override // androidx.database.SQLiteStatement
        public final java.lang.String getText(int p0) {
            return this.getHighSpeedVideoFpsRangesFor.getText(p0);
        }

        @Override // androidx.database.SQLiteStatement
        public final long getLong(int p0) {
            return this.getHighSpeedVideoFpsRangesFor.getLong(p0);
        }

        @Override // androidx.database.SQLiteStatement
        public final int getInt(int p0) {
            return this.getHighSpeedVideoFpsRangesFor.getInt(p0);
        }

        @Override // androidx.database.SQLiteStatement
        public final float getFloat(int p0) {
            return this.getHighSpeedVideoFpsRangesFor.getFloat(p0);
        }

        @Override // androidx.database.SQLiteStatement
        public final double getDouble(int p0) {
            return this.getHighSpeedVideoFpsRangesFor.getDouble(p0);
        }

        @Override // androidx.database.SQLiteStatement
        public final int getColumnType(int p0) {
            return this.getHighSpeedVideoFpsRangesFor.getColumnType(p0);
        }

        @Override // androidx.database.SQLiteStatement
        public final java.util.List<java.lang.String> getColumnNames() {
            return this.getHighSpeedVideoFpsRangesFor.getColumnNames();
        }

        @Override // androidx.database.SQLiteStatement
        public final java.lang.String getColumnName(int p0) {
            return this.getHighSpeedVideoFpsRangesFor.getColumnName(p0);
        }

        @Override // androidx.database.SQLiteStatement
        public final int getColumnCount() {
            return this.getHighSpeedVideoFpsRangesFor.getColumnCount();
        }

        @Override // androidx.database.SQLiteStatement
        public final boolean getBoolean(int p0) {
            return this.getHighSpeedVideoFpsRangesFor.getBoolean(p0);
        }

        @Override // androidx.database.SQLiteStatement
        public final byte[] getBlob(int p0) {
            return this.getHighSpeedVideoFpsRangesFor.getBlob(p0);
        }

        @Override // androidx.database.SQLiteStatement, java.lang.AutoCloseable
        public final void close() {
            this.getHighSpeedVideoFpsRangesFor.close();
        }

        @Override // androidx.database.SQLiteStatement
        /* renamed from: clearBindings */
        public final void mo9288clearBindings() {
            this.getHighSpeedVideoFpsRangesFor.mo9288clearBindings();
        }

        @Override // androidx.database.SQLiteStatement
        /* renamed from: bindText */
        public final void mo9287bindText(int p0, java.lang.String p1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "");
            this.getHighSpeedVideoFpsRangesFor.mo9287bindText(p0, p1);
        }

        @Override // androidx.database.SQLiteStatement
        /* renamed from: bindNull */
        public final void mo9286bindNull(int p0) {
            this.getHighSpeedVideoFpsRangesFor.mo9286bindNull(p0);
        }

        @Override // androidx.database.SQLiteStatement
        /* renamed from: bindLong */
        public final void mo9285bindLong(int p0, long p1) {
            this.getHighSpeedVideoFpsRangesFor.mo9285bindLong(p0, p1);
        }

        @Override // androidx.database.SQLiteStatement
        public final void bindInt(int p0, int p1) {
            this.getHighSpeedVideoFpsRangesFor.bindInt(p0, p1);
        }

        @Override // androidx.database.SQLiteStatement
        public final void bindFloat(int p0, float p1) {
            this.getHighSpeedVideoFpsRangesFor.bindFloat(p0, p1);
        }

        @Override // androidx.database.SQLiteStatement
        /* renamed from: bindDouble */
        public final void mo9284bindDouble(int p0, double p1) {
            this.getHighSpeedVideoFpsRangesFor.mo9284bindDouble(p0, p1);
        }

        @Override // androidx.database.SQLiteStatement
        public final void bindBoolean(int p0, boolean p1) {
            this.getHighSpeedVideoFpsRangesFor.bindBoolean(p0, p1);
        }

        @Override // androidx.database.SQLiteStatement
        /* renamed from: bindBlob */
        public final void mo9283bindBlob(int p0, byte[] p1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "");
            this.getHighSpeedVideoFpsRangesFor.mo9283bindBlob(p0, p1);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0010\u0012\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0010\u0013\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000 @2\u00020\u0001:\u0001@B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u0003\u001a\u00020\bH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\bH\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\bH\u0016¢\u0006\u0004\b$\u0010\u001eJ\u0017\u0010%\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\bH\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u001fH\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\nH\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\nH\u0016¢\u0006\u0004\b+\u0010*J\u000f\u0010,\u001a\u00020\nH\u0016¢\u0006\u0004\b,\u0010*J\u001f\u0010-\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\bH\u0002¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\nH\u0002¢\u0006\u0004\b/\u0010*R\u0016\u0010-\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u00101R\u0016\u00104\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00103R\u0016\u00107\u001a\u0002058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00106R\u001e\u0010;\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0004088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u001e\u0010/\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0018\u0010?\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u0010>"}, d2 = {"Landroidx/sqlite/driver/SupportSQLiteStatement$RowSQLiteStatement;", "Landroidx/sqlite/driver/SupportSQLiteStatement;", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "p0", "", "p1", "<init>", "(Landroidx/sqlite/db/SupportSQLiteDatabase;Ljava/lang/String;)V", "", "", "", "bindBlob", "(I[B)V", "", "bindDouble", "(ID)V", "", "bindLong", "(IJ)V", "bindText", "(ILjava/lang/String;)V", "bindNull", "(I)V", "getBlob", "(I)[B", "getDouble", "(I)D", "getLong", "(I)J", "getText", "(I)Ljava/lang/String;", "", "isNull", "(I)Z", "getColumnCount", "()I", "getColumnName", "getColumnType", "(I)I", "step", "()Z", "reset", "()V", "clearBindings", "close", "getHighSpeedVideoFpsRangesFor", "(II)V", "getHighSpeedVideoSizes", "", "[I", "", "[J", "getHighSpeedVideoFpsRanges", "", "[D", "Camera2StreamConfigurationMap", "", "getHighSpeedVideoSizesFor", "[Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "[[B", "Landroid/database/Cursor;", "Landroid/database/Cursor;", "getOutputFormats", "Companion_"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class RowSQLiteStatement extends androidx.database.driver.SupportSQLiteStatement {

        /* renamed from: Companion_, reason: from kotlin metadata */
        public static final androidx.sqlite.driver.SupportSQLiteStatement.RowSQLiteStatement.Companion INSTANCE = new androidx.sqlite.driver.SupportSQLiteStatement.RowSQLiteStatement.Companion(null);

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private android.database.Cursor getOutputFormats;

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private byte[][] getHighSpeedVideoSizes;

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private double[] Camera2StreamConfigurationMap;
        private int[] getHighSpeedVideoFpsRangesFor;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private long[] getHighSpeedVideoFpsRanges;

        /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
        private java.lang.String[] getHighResolutionOutputSizeshNQ4ISI;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RowSQLiteStatement(androidx.database.db.SupportSQLiteDatabase supportSQLiteDatabase, java.lang.String str) {
            super(supportSQLiteDatabase, str, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.getHighSpeedVideoFpsRangesFor = new int[0];
            this.getHighSpeedVideoFpsRanges = new long[0];
            this.Camera2StreamConfigurationMap = new double[0];
            this.getHighResolutionOutputSizeshNQ4ISI = new java.lang.String[0];
            this.getHighSpeedVideoSizes = new byte[0][];
        }

        @Override // androidx.database.SQLiteStatement
        /* renamed from: bindBlob */
        public final void mo9283bindBlob(int p0, byte[] p1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "");
            throwIfClosed();
            getHighSpeedVideoFpsRangesFor(4, p0);
            this.getHighSpeedVideoFpsRangesFor[p0] = 4;
            this.getHighSpeedVideoSizes[p0] = p1;
        }

        @Override // androidx.database.SQLiteStatement
        /* renamed from: bindDouble */
        public final void mo9284bindDouble(int p0, double p1) {
            throwIfClosed();
            getHighSpeedVideoFpsRangesFor(2, p0);
            this.getHighSpeedVideoFpsRangesFor[p0] = 2;
            this.Camera2StreamConfigurationMap[p0] = p1;
        }

        @Override // androidx.database.SQLiteStatement
        /* renamed from: bindLong */
        public final void mo9285bindLong(int p0, long p1) {
            throwIfClosed();
            getHighSpeedVideoFpsRangesFor(1, p0);
            this.getHighSpeedVideoFpsRangesFor[p0] = 1;
            this.getHighSpeedVideoFpsRanges[p0] = p1;
        }

        @Override // androidx.database.SQLiteStatement
        /* renamed from: bindText */
        public final void mo9287bindText(int p0, java.lang.String p1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "");
            throwIfClosed();
            getHighSpeedVideoFpsRangesFor(3, p0);
            this.getHighSpeedVideoFpsRangesFor[p0] = 3;
            this.getHighResolutionOutputSizeshNQ4ISI[p0] = p1;
        }

        @Override // androidx.database.SQLiteStatement
        /* renamed from: bindNull */
        public final void mo9286bindNull(int p0) {
            throwIfClosed();
            getHighSpeedVideoFpsRangesFor(5, p0);
            this.getHighSpeedVideoFpsRangesFor[p0] = 5;
        }

        @Override // androidx.database.SQLiteStatement
        public final byte[] getBlob(int p0) {
            throwIfClosed();
            android.database.Cursor cursor = this.getOutputFormats;
            if (cursor == null) {
                androidx.database.SQLite.throwSQLiteException(21, "no row");
                throw new kotlin.KotlinNothingValueException();
            }
            if (p0 >= 0 && p0 < cursor.getColumnCount()) {
                byte[] blob = cursor.getBlob(p0);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(blob, "");
                return blob;
            }
            androidx.database.SQLite.throwSQLiteException(25, "column index out of range");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // androidx.database.SQLiteStatement
        public final double getDouble(int p0) {
            throwIfClosed();
            android.database.Cursor cursor = this.getOutputFormats;
            if (cursor == null) {
                androidx.database.SQLite.throwSQLiteException(21, "no row");
                throw new kotlin.KotlinNothingValueException();
            }
            if (p0 >= 0 && p0 < cursor.getColumnCount()) {
                return cursor.getDouble(p0);
            }
            androidx.database.SQLite.throwSQLiteException(25, "column index out of range");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // androidx.database.SQLiteStatement
        public final long getLong(int p0) {
            throwIfClosed();
            android.database.Cursor cursor = this.getOutputFormats;
            if (cursor == null) {
                androidx.database.SQLite.throwSQLiteException(21, "no row");
                throw new kotlin.KotlinNothingValueException();
            }
            if (p0 >= 0 && p0 < cursor.getColumnCount()) {
                return cursor.getLong(p0);
            }
            androidx.database.SQLite.throwSQLiteException(25, "column index out of range");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // androidx.database.SQLiteStatement
        public final java.lang.String getText(int p0) {
            throwIfClosed();
            android.database.Cursor cursor = this.getOutputFormats;
            if (cursor == null) {
                androidx.database.SQLite.throwSQLiteException(21, "no row");
                throw new kotlin.KotlinNothingValueException();
            }
            if (p0 >= 0 && p0 < cursor.getColumnCount()) {
                java.lang.String string = cursor.getString(p0);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
                return string;
            }
            androidx.database.SQLite.throwSQLiteException(25, "column index out of range");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // androidx.database.SQLiteStatement
        public final boolean isNull(int p0) {
            throwIfClosed();
            android.database.Cursor cursor = this.getOutputFormats;
            if (cursor == null) {
                androidx.database.SQLite.throwSQLiteException(21, "no row");
                throw new kotlin.KotlinNothingValueException();
            }
            if (p0 >= 0 && p0 < cursor.getColumnCount()) {
                return cursor.isNull(p0);
            }
            androidx.database.SQLite.throwSQLiteException(25, "column index out of range");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // androidx.database.SQLiteStatement
        public final int getColumnCount() {
            throwIfClosed();
            getHighSpeedVideoSizes();
            android.database.Cursor cursor = this.getOutputFormats;
            if (cursor != null) {
                return cursor.getColumnCount();
            }
            return 0;
        }

        @Override // androidx.database.SQLiteStatement
        public final java.lang.String getColumnName(int p0) {
            throwIfClosed();
            getHighSpeedVideoSizes();
            android.database.Cursor cursor = this.getOutputFormats;
            if (cursor == null) {
                throw new java.lang.IllegalStateException("Required value was null.".toString());
            }
            if (p0 >= 0 && p0 < cursor.getColumnCount()) {
                java.lang.String columnName = cursor.getColumnName(p0);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(columnName, "");
                return columnName;
            }
            androidx.database.SQLite.throwSQLiteException(25, "column index out of range");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // androidx.database.SQLiteStatement
        public final int getColumnType(int p0) {
            throwIfClosed();
            getHighSpeedVideoSizes();
            android.database.Cursor cursor = this.getOutputFormats;
            if (cursor == null) {
                throw new java.lang.IllegalStateException("Required value was null.".toString());
            }
            if (p0 >= 0 && p0 < cursor.getColumnCount()) {
                return androidx.sqlite.driver.SupportSQLiteStatement.RowSQLiteStatement.Companion.access$getDataType(INSTANCE, cursor, p0);
            }
            androidx.database.SQLite.throwSQLiteException(25, "column index out of range");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // androidx.database.SQLiteStatement
        public final boolean step() {
            throwIfClosed();
            getHighSpeedVideoSizes();
            android.database.Cursor cursor = this.getOutputFormats;
            if (cursor != null) {
                return cursor.moveToNext();
            }
            throw new java.lang.IllegalStateException("Required value was null.".toString());
        }

        @Override // androidx.database.SQLiteStatement
        public final void reset() {
            throwIfClosed();
            android.database.Cursor cursor = this.getOutputFormats;
            if (cursor != null) {
                cursor.close();
            }
            this.getOutputFormats = null;
        }

        @Override // androidx.database.SQLiteStatement
        /* renamed from: clearBindings */
        public final void mo9288clearBindings() {
            throwIfClosed();
            this.getHighSpeedVideoFpsRangesFor = new int[0];
            this.getHighSpeedVideoFpsRanges = new long[0];
            this.Camera2StreamConfigurationMap = new double[0];
            this.getHighResolutionOutputSizeshNQ4ISI = new java.lang.String[0];
            this.getHighSpeedVideoSizes = new byte[0][];
        }

        @Override // androidx.database.SQLiteStatement, java.lang.AutoCloseable
        public final void close() {
            if (!getIsClosed()) {
                mo9288clearBindings();
                reset();
            }
            setClosed(true);
        }

        private final void getHighSpeedVideoFpsRangesFor(int p0, int p1) {
            int i = p1 + 1;
            int[] iArr = this.getHighSpeedVideoFpsRangesFor;
            if (iArr.length < i) {
                int[] copyOf = java.util.Arrays.copyOf(iArr, i);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "");
                this.getHighSpeedVideoFpsRangesFor = copyOf;
            }
            if (p0 == 1) {
                long[] jArr = this.getHighSpeedVideoFpsRanges;
                if (jArr.length < i) {
                    long[] copyOf2 = java.util.Arrays.copyOf(jArr, i);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf2, "");
                    this.getHighSpeedVideoFpsRanges = copyOf2;
                    return;
                }
                return;
            }
            if (p0 == 2) {
                double[] dArr = this.Camera2StreamConfigurationMap;
                if (dArr.length < i) {
                    double[] copyOf3 = java.util.Arrays.copyOf(dArr, i);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf3, "");
                    this.Camera2StreamConfigurationMap = copyOf3;
                    return;
                }
                return;
            }
            if (p0 == 3) {
                java.lang.String[] strArr = this.getHighResolutionOutputSizeshNQ4ISI;
                if (strArr.length < i) {
                    java.lang.Object[] copyOf4 = java.util.Arrays.copyOf(strArr, i);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf4, "");
                    this.getHighResolutionOutputSizeshNQ4ISI = (java.lang.String[]) copyOf4;
                    return;
                }
                return;
            }
            if (p0 == 4) {
                byte[][] bArr = this.getHighSpeedVideoSizes;
                if (bArr.length < i) {
                    java.lang.Object[] copyOf5 = java.util.Arrays.copyOf(bArr, i);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf5, "");
                    this.getHighSpeedVideoSizes = (byte[][]) copyOf5;
                }
            }
        }

        private final void getHighSpeedVideoSizes() {
            if (this.getOutputFormats == null) {
                this.getOutputFormats = getDb().query(new androidx.database.db.SupportSQLiteQuery() { // from class: androidx.sqlite.driver.SupportSQLiteStatement$RowSQLiteStatement$ensureCursor$1
                    @Override // androidx.database.db.SupportSQLiteQuery
                    /* renamed from: getSql */
                    public final java.lang.String getGetHighSpeedVideoFpsRangesFor() {
                        return androidx.sqlite.driver.SupportSQLiteStatement.RowSQLiteStatement.this.getSql();
                    }

                    @Override // androidx.database.db.SupportSQLiteQuery
                    public final void bindTo(androidx.database.db.SupportSQLiteProgram statement) {
                        int[] iArr;
                        int[] iArr2;
                        long[] jArr;
                        double[] dArr;
                        java.lang.String[] strArr;
                        byte[][] bArr;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statement, "");
                        iArr = androidx.sqlite.driver.SupportSQLiteStatement.RowSQLiteStatement.this.getHighSpeedVideoFpsRangesFor;
                        int length = iArr.length;
                        for (int i = 1; i < length; i++) {
                            iArr2 = androidx.sqlite.driver.SupportSQLiteStatement.RowSQLiteStatement.this.getHighSpeedVideoFpsRangesFor;
                            int i2 = iArr2[i];
                            if (i2 == 1) {
                                jArr = androidx.sqlite.driver.SupportSQLiteStatement.RowSQLiteStatement.this.getHighSpeedVideoFpsRanges;
                                statement.bindLong(i, jArr[i]);
                            } else if (i2 == 2) {
                                dArr = androidx.sqlite.driver.SupportSQLiteStatement.RowSQLiteStatement.this.Camera2StreamConfigurationMap;
                                statement.bindDouble(i, dArr[i]);
                            } else if (i2 == 3) {
                                strArr = androidx.sqlite.driver.SupportSQLiteStatement.RowSQLiteStatement.this.getHighResolutionOutputSizeshNQ4ISI;
                                java.lang.String str = strArr[i];
                                kotlin.jvm.internal.Intrinsics.checkNotNull(str);
                                statement.bindString(i, str);
                            } else if (i2 == 4) {
                                bArr = androidx.sqlite.driver.SupportSQLiteStatement.RowSQLiteStatement.this.getHighSpeedVideoSizes;
                                byte[] bArr2 = bArr[i];
                                kotlin.jvm.internal.Intrinsics.checkNotNull(bArr2);
                                statement.bindBlob(i, bArr2);
                            } else if (i2 == 5) {
                                statement.bindNull(i);
                            }
                        }
                    }

                    @Override // androidx.database.db.SupportSQLiteQuery
                    public final int getArgCount() {
                        int[] iArr;
                        iArr = androidx.sqlite.driver.SupportSQLiteStatement.RowSQLiteStatement.this.getHighSpeedVideoFpsRangesFor;
                        return iArr.length;
                    }
                });
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/sqlite/driver/SupportSQLiteStatement$RowSQLiteStatement$Companion_;", "", "<init>", "()V"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: androidx.sqlite.driver.SupportSQLiteStatement$RowSQLiteStatement$Companion_, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            public static final /* synthetic */ int access$getDataType(androidx.sqlite.driver.SupportSQLiteStatement.RowSQLiteStatement.Companion companion, android.database.Cursor cursor, int i) {
                int type = cursor.getType(i);
                int type2 = cursor.getType(i);
                if (type2 == 0) {
                    return 5;
                }
                int i2 = 1;
                if (type2 != 1) {
                    i2 = 2;
                    if (type2 != 2) {
                        i2 = 3;
                        if (type2 != 3) {
                            if (type2 == 4) {
                                return 4;
                            }
                            throw new java.lang.IllegalStateException("Unknown field type: ".concat(java.lang.String.valueOf(type)).toString());
                        }
                    }
                }
                return i2;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0010\u0012\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u0003\u001a\u00020\bH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\bH\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\bH\u0016¢\u0006\u0004\b$\u0010\u001eJ\u0017\u0010%\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\bH\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u001fH\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\nH\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\nH\u0016¢\u0006\u0004\b+\u0010*J\u000f\u0010,\u001a\u00020\nH\u0016¢\u0006\u0004\b,\u0010*R\u0018\u00101\u001a\u00060-j\u0002`.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100"}, d2 = {"Landroidx/sqlite/driver/SupportSQLiteStatement$OtherSQLiteStatement;", "Landroidx/sqlite/driver/SupportSQLiteStatement;", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "p0", "", "p1", "<init>", "(Landroidx/sqlite/db/SupportSQLiteDatabase;Ljava/lang/String;)V", "", "", "", "bindBlob", "(I[B)V", "", "bindDouble", "(ID)V", "", "bindLong", "(IJ)V", "bindText", "(ILjava/lang/String;)V", "bindNull", "(I)V", "getBlob", "(I)[B", "getDouble", "(I)D", "getLong", "(I)J", "getText", "(I)Ljava/lang/String;", "", "isNull", "(I)Z", "getColumnCount", "()I", "getColumnName", "getColumnType", "(I)I", "step", "()Z", "reset", "()V", "clearBindings", "close", "Landroidx/sqlite/db/SupportSQLiteStatement;", "Landroidx/sqlite/driver/SupportStatement;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/sqlite/db/SupportSQLiteStatement;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class OtherSQLiteStatement extends androidx.database.driver.SupportSQLiteStatement {

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private final androidx.database.db.SupportSQLiteStatement getHighSpeedVideoFpsRangesFor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OtherSQLiteStatement(androidx.database.db.SupportSQLiteDatabase supportSQLiteDatabase, java.lang.String str) {
            super(supportSQLiteDatabase, str, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.getHighSpeedVideoFpsRangesFor = supportSQLiteDatabase.compileStatement(str);
        }

        @Override // androidx.database.SQLiteStatement
        /* renamed from: bindBlob */
        public final void mo9283bindBlob(int p0, byte[] p1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "");
            throwIfClosed();
            this.getHighSpeedVideoFpsRangesFor.bindBlob(p0, p1);
        }

        @Override // androidx.database.SQLiteStatement
        /* renamed from: bindDouble */
        public final void mo9284bindDouble(int p0, double p1) {
            throwIfClosed();
            this.getHighSpeedVideoFpsRangesFor.bindDouble(p0, p1);
        }

        @Override // androidx.database.SQLiteStatement
        /* renamed from: bindLong */
        public final void mo9285bindLong(int p0, long p1) {
            throwIfClosed();
            this.getHighSpeedVideoFpsRangesFor.bindLong(p0, p1);
        }

        @Override // androidx.database.SQLiteStatement
        /* renamed from: bindText */
        public final void mo9287bindText(int p0, java.lang.String p1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "");
            throwIfClosed();
            this.getHighSpeedVideoFpsRangesFor.bindString(p0, p1);
        }

        @Override // androidx.database.SQLiteStatement
        /* renamed from: bindNull */
        public final void mo9286bindNull(int p0) {
            throwIfClosed();
            this.getHighSpeedVideoFpsRangesFor.bindNull(p0);
        }

        @Override // androidx.database.SQLiteStatement
        public final byte[] getBlob(int p0) {
            throwIfClosed();
            androidx.database.SQLite.throwSQLiteException(21, "no row");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // androidx.database.SQLiteStatement
        public final double getDouble(int p0) {
            throwIfClosed();
            androidx.database.SQLite.throwSQLiteException(21, "no row");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // androidx.database.SQLiteStatement
        public final long getLong(int p0) {
            throwIfClosed();
            androidx.database.SQLite.throwSQLiteException(21, "no row");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // androidx.database.SQLiteStatement
        public final java.lang.String getText(int p0) {
            throwIfClosed();
            androidx.database.SQLite.throwSQLiteException(21, "no row");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // androidx.database.SQLiteStatement
        public final boolean isNull(int p0) {
            throwIfClosed();
            androidx.database.SQLite.throwSQLiteException(21, "no row");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // androidx.database.SQLiteStatement
        public final int getColumnCount() {
            throwIfClosed();
            return 0;
        }

        @Override // androidx.database.SQLiteStatement
        public final java.lang.String getColumnName(int p0) {
            throwIfClosed();
            androidx.database.SQLite.throwSQLiteException(21, "no row");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // androidx.database.SQLiteStatement
        public final int getColumnType(int p0) {
            throwIfClosed();
            androidx.database.SQLite.throwSQLiteException(21, "no row");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // androidx.database.SQLiteStatement
        public final boolean step() {
            throwIfClosed();
            this.getHighSpeedVideoFpsRangesFor.execute();
            return false;
        }

        @Override // androidx.database.SQLiteStatement
        public final void reset() {
            throwIfClosed();
        }

        @Override // androidx.database.SQLiteStatement
        /* renamed from: clearBindings */
        public final void mo9288clearBindings() {
            throwIfClosed();
            this.getHighSpeedVideoFpsRangesFor.clearBindings();
        }

        @Override // androidx.database.SQLiteStatement, java.lang.AutoCloseable
        public final void close() {
            this.getHighSpeedVideoFpsRangesFor.close();
            setClosed(true);
        }
    }

    public /* synthetic */ SupportSQLiteStatement(androidx.database.db.SupportSQLiteDatabase supportSQLiteDatabase, java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(supportSQLiteDatabase, str);
    }
}
