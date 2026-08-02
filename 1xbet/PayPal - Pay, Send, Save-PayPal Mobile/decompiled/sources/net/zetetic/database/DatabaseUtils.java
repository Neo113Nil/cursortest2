package net.zetetic.database;

/* loaded from: classes5.dex */
public class DatabaseUtils {
    private static final boolean DEBUG = false;
    public static final int STATEMENT_ABORT = 6;
    public static final int STATEMENT_ATTACH = 3;
    public static final int STATEMENT_BEGIN = 4;
    public static final int STATEMENT_COMMIT = 5;
    public static final int STATEMENT_DDL = 8;
    public static final int STATEMENT_OTHER = 99;
    public static final int STATEMENT_PRAGMA = 7;
    public static final int STATEMENT_SELECT = 1;
    public static final int STATEMENT_UNPREPARED = 9;
    public static final int STATEMENT_UPDATE = 2;
    private static final java.lang.String TAG = "DatabaseUtils";
    private static final char[] DIGITS = {com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', io.ktor.util.date.GMTDateParser.DAY_OF_MONTH, 'e', 'f'};
    private static java.text.Collator mColl = null;

    public static final void writeExceptionToParcel(android.os.Parcel parcel, java.lang.Exception exc) {
        int i;
        boolean z = false;
        int i2 = 1;
        if (!(exc instanceof java.io.FileNotFoundException)) {
            if (exc instanceof java.lang.IllegalArgumentException) {
                i = 2;
            } else if (exc instanceof java.lang.UnsupportedOperationException) {
                i = 3;
            } else if (exc instanceof android.database.sqlite.SQLiteAbortException) {
                i = 4;
            } else if (exc instanceof android.database.sqlite.SQLiteConstraintException) {
                i = 5;
            } else if (exc instanceof android.database.sqlite.SQLiteDatabaseCorruptException) {
                i = 6;
            } else if (exc instanceof android.database.sqlite.SQLiteFullException) {
                i = 7;
            } else if (exc instanceof android.database.sqlite.SQLiteDiskIOException) {
                i = 8;
            } else if (exc instanceof android.database.sqlite.SQLiteException) {
                i = 9;
            } else if (exc instanceof android.content.OperationApplicationException) {
                i = 10;
            } else {
                if (!(exc instanceof android.os.OperationCanceledException)) {
                    parcel.writeException(exc);
                    net.zetetic.database.Logger.e(TAG, "Writing exception to parcel", exc);
                    return;
                }
                i2 = 11;
            }
            z = true;
            i2 = i;
        }
        parcel.writeInt(i2);
        parcel.writeString(exc.getMessage());
        if (z) {
            net.zetetic.database.Logger.e(TAG, "Writing exception to parcel", exc);
        }
    }

    private static final void readExceptionFromParcel(android.os.Parcel parcel, java.lang.String str, int i) {
        switch (i) {
            case 2:
                throw new java.lang.IllegalArgumentException(str);
            case 3:
                throw new java.lang.UnsupportedOperationException(str);
            case 4:
                throw new android.database.sqlite.SQLiteAbortException(str);
            case 5:
                throw new android.database.sqlite.SQLiteConstraintException(str);
            case 6:
                throw new android.database.sqlite.SQLiteDatabaseCorruptException(str);
            case 7:
                throw new android.database.sqlite.SQLiteFullException(str);
            case 8:
                throw new android.database.sqlite.SQLiteDiskIOException(str);
            case 9:
                throw new android.database.sqlite.SQLiteException(str);
            case 10:
            default:
                parcel.readException(i, str);
                return;
            case 11:
                throw new android.os.OperationCanceledException(str);
        }
    }

    public static void bindObjectToProgram(net.zetetic.database.sqlcipher.SQLiteProgram sQLiteProgram, int i, java.lang.Object obj) {
        if (obj == null) {
            sQLiteProgram.bindNull(i);
            return;
        }
        if ((obj instanceof java.lang.Double) || (obj instanceof java.lang.Float)) {
            sQLiteProgram.bindDouble(i, ((java.lang.Number) obj).doubleValue());
            return;
        }
        if (obj instanceof java.lang.Number) {
            sQLiteProgram.bindLong(i, ((java.lang.Number) obj).longValue());
            return;
        }
        if (obj instanceof java.lang.Boolean) {
            if (((java.lang.Boolean) obj).booleanValue()) {
                sQLiteProgram.bindLong(i, 1L);
                return;
            } else {
                sQLiteProgram.bindLong(i, 0L);
                return;
            }
        }
        if (obj instanceof byte[]) {
            sQLiteProgram.bindBlob(i, (byte[]) obj);
        } else {
            sQLiteProgram.bindString(i, obj.toString());
        }
    }

    public static int getTypeOfObject(java.lang.Object obj) {
        if (obj == null) {
            return 0;
        }
        if (obj instanceof byte[]) {
            return 4;
        }
        if ((obj instanceof java.lang.Float) || (obj instanceof java.lang.Double)) {
            return 2;
        }
        return ((obj instanceof java.lang.Long) || (obj instanceof java.lang.Integer) || (obj instanceof java.lang.Short) || (obj instanceof java.lang.Byte)) ? 1 : 3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0076, code lost:
    
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007c, code lost:
    
        if (r5.moveToNext() != false) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void cursorFillWindow(android.database.Cursor cursor, int i, net.zetetic.database.CursorWindow cursorWindow) {
        boolean putNull;
        if (i < 0 || i >= cursor.getCount()) {
            return;
        }
        int position = cursor.getPosition();
        int columnCount = cursor.getColumnCount();
        cursorWindow.clear();
        cursorWindow.setStartPosition(i);
        cursorWindow.setNumColumns(columnCount);
        if (cursor.moveToPosition(i)) {
            loop0: while (true) {
                if (!cursorWindow.allocRow()) {
                    break;
                }
                int i2 = 0;
                while (true) {
                    if (i2 >= columnCount) {
                        break;
                    }
                    int type = cursor.getType(i2);
                    if (type == 0) {
                        putNull = cursorWindow.putNull(i, i2);
                    } else if (type == 1) {
                        putNull = cursorWindow.putLong(cursor.getLong(i2), i, i2);
                    } else if (type == 2) {
                        putNull = cursorWindow.putDouble(cursor.getDouble(i2), i, i2);
                    } else if (type == 4) {
                        byte[] blob = cursor.getBlob(i2);
                        if (blob != null) {
                            putNull = cursorWindow.putBlob(blob, i, i2);
                        } else {
                            putNull = cursorWindow.putNull(i, i2);
                        }
                    } else {
                        java.lang.String string = cursor.getString(i2);
                        if (string != null) {
                            putNull = cursorWindow.putString(string, i, i2);
                        } else {
                            putNull = cursorWindow.putNull(i, i2);
                        }
                    }
                    if (!putNull) {
                        cursorWindow.freeLastRow();
                        break loop0;
                    }
                    i2++;
                }
            }
        }
        cursor.moveToPosition(position);
    }

    public static void appendEscapedSQLString(java.lang.StringBuilder sb, java.lang.String str) {
        sb.append('\'');
        if (str.indexOf(39) != -1) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if (charAt == '\'') {
                    sb.append('\'');
                }
                sb.append(charAt);
            }
        } else {
            sb.append(str);
        }
        sb.append('\'');
    }

    public static java.lang.String sqlEscapeString(java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        appendEscapedSQLString(sb, str);
        return sb.toString();
    }

    public static final void appendValueToSql(java.lang.StringBuilder sb, java.lang.Object obj) {
        if (obj == null) {
            sb.append("NULL");
            return;
        }
        if (obj instanceof java.lang.Boolean) {
            if (((java.lang.Boolean) obj).booleanValue()) {
                sb.append('1');
                return;
            } else {
                sb.append(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                return;
            }
        }
        appendEscapedSQLString(sb, obj.toString());
    }

    public static java.lang.String concatenateWhere(java.lang.String str, java.lang.String str2) {
        if (android.text.TextUtils.isEmpty(str)) {
            return str2;
        }
        if (android.text.TextUtils.isEmpty(str2)) {
            return str;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("(");
        sb.append(str);
        sb.append(") AND (");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public static java.lang.String getCollationKey(java.lang.String str) {
        byte[] collationKeyInBytes = getCollationKeyInBytes(str);
        try {
            return new java.lang.String(collationKeyInBytes, 0, getKeyLen(collationKeyInBytes), "ISO8859_1");
        } catch (java.lang.Exception unused) {
            return "";
        }
    }

    public static java.lang.String getHexCollationKey(java.lang.String str) {
        byte[] collationKeyInBytes = getCollationKeyInBytes(str);
        return new java.lang.String(encodeHex(collationKeyInBytes), 0, getKeyLen(collationKeyInBytes) * 2);
    }

    private static char[] encodeHex(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length << 1];
        int i = 0;
        int i2 = 0;
        while (i2 < length) {
            char[] cArr2 = DIGITS;
            byte b = bArr[i2];
            cArr[i] = cArr2[(b & com.visa.cbp.getEncExpo.onUnminimized) >>> 4];
            cArr[i + 1] = cArr2[b & com.google.common.base.Ascii.SI];
            i2++;
            i += 2;
        }
        return cArr;
    }

    private static int getKeyLen(byte[] bArr) {
        if (bArr[bArr.length - 1] != 0) {
            return bArr.length;
        }
        return bArr.length - 1;
    }

    private static byte[] getCollationKeyInBytes(java.lang.String str) {
        if (mColl == null) {
            java.text.Collator collator = java.text.Collator.getInstance();
            mColl = collator;
            collator.setStrength(0);
        }
        return mColl.getCollationKey(str).toByteArray();
    }

    public static void dumpCursor(android.database.Cursor cursor) {
        dumpCursor(cursor, java.lang.System.out);
    }

    public static void dumpCursor(android.database.Cursor cursor, java.io.PrintStream printStream) {
        printStream.println(">>>>> Dumping cursor ".concat(java.lang.String.valueOf(cursor)));
        if (cursor != null) {
            int position = cursor.getPosition();
            cursor.moveToPosition(-1);
            while (cursor.moveToNext()) {
                dumpCurrentRow(cursor, printStream);
            }
            cursor.moveToPosition(position);
        }
        printStream.println("<<<<<");
    }

    public static void dumpCursor(android.database.Cursor cursor, java.lang.StringBuilder sb) {
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder(">>>>> Dumping cursor ");
        sb2.append(cursor);
        sb2.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
        sb.append(sb2.toString());
        if (cursor != null) {
            int position = cursor.getPosition();
            cursor.moveToPosition(-1);
            while (cursor.moveToNext()) {
                dumpCurrentRow(cursor, sb);
            }
            cursor.moveToPosition(position);
        }
        sb.append("<<<<<\n");
    }

    public static java.lang.String dumpCursorToString(android.database.Cursor cursor) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        dumpCursor(cursor, sb);
        return sb.toString();
    }

    public static void dumpCurrentRow(android.database.Cursor cursor) {
        dumpCurrentRow(cursor, java.lang.System.out);
    }

    public static void dumpCurrentRow(android.database.Cursor cursor, java.io.PrintStream printStream) {
        java.lang.String str;
        java.lang.String[] columnNames = cursor.getColumnNames();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("");
        sb.append(cursor.getPosition());
        sb.append(" {");
        printStream.println(sb.toString());
        int length = columnNames.length;
        for (int i = 0; i < length; i++) {
            try {
                str = cursor.getString(i);
            } catch (android.database.sqlite.SQLiteException unused) {
                str = "<unprintable>";
            }
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("   ");
            sb2.append(columnNames[i]);
            sb2.append('=');
            sb2.append(str);
            printStream.println(sb2.toString());
        }
        printStream.println("}");
    }

    public static void dumpCurrentRow(android.database.Cursor cursor, java.lang.StringBuilder sb) {
        java.lang.String str;
        java.lang.String[] columnNames = cursor.getColumnNames();
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("");
        sb2.append(cursor.getPosition());
        sb2.append(" {\n");
        sb.append(sb2.toString());
        int length = columnNames.length;
        for (int i = 0; i < length; i++) {
            try {
                str = cursor.getString(i);
            } catch (android.database.sqlite.SQLiteException unused) {
                str = "<unprintable>";
            }
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("   ");
            sb3.append(columnNames[i]);
            sb3.append('=');
            sb3.append(str);
            sb3.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
            sb.append(sb3.toString());
        }
        sb.append("}\n");
    }

    public static java.lang.String dumpCurrentRowToString(android.database.Cursor cursor) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        dumpCurrentRow(cursor, sb);
        return sb.toString();
    }

    public static void cursorStringToContentValues(android.database.Cursor cursor, java.lang.String str, android.content.ContentValues contentValues) {
        cursorStringToContentValues(cursor, str, contentValues, str);
    }

    public static void cursorStringToInsertHelper(android.database.Cursor cursor, java.lang.String str, net.zetetic.database.DatabaseUtils.InsertHelper insertHelper, int i) {
        insertHelper.bind(i, cursor.getString(cursor.getColumnIndexOrThrow(str)));
    }

    public static void cursorStringToContentValues(android.database.Cursor cursor, java.lang.String str, android.content.ContentValues contentValues, java.lang.String str2) {
        contentValues.put(str2, cursor.getString(cursor.getColumnIndexOrThrow(str)));
    }

    public static void cursorIntToContentValues(android.database.Cursor cursor, java.lang.String str, android.content.ContentValues contentValues) {
        cursorIntToContentValues(cursor, str, contentValues, str);
    }

    public static void cursorIntToContentValues(android.database.Cursor cursor, java.lang.String str, android.content.ContentValues contentValues, java.lang.String str2) {
        int columnIndex = cursor.getColumnIndex(str);
        if (!cursor.isNull(columnIndex)) {
            contentValues.put(str2, java.lang.Integer.valueOf(cursor.getInt(columnIndex)));
        } else {
            contentValues.put(str2, (java.lang.Integer) null);
        }
    }

    public static void cursorLongToContentValues(android.database.Cursor cursor, java.lang.String str, android.content.ContentValues contentValues) {
        cursorLongToContentValues(cursor, str, contentValues, str);
    }

    public static void cursorLongToContentValues(android.database.Cursor cursor, java.lang.String str, android.content.ContentValues contentValues, java.lang.String str2) {
        int columnIndex = cursor.getColumnIndex(str);
        if (!cursor.isNull(columnIndex)) {
            contentValues.put(str2, java.lang.Long.valueOf(cursor.getLong(columnIndex)));
        } else {
            contentValues.put(str2, (java.lang.Long) null);
        }
    }

    public static void cursorDoubleToCursorValues(android.database.Cursor cursor, java.lang.String str, android.content.ContentValues contentValues) {
        cursorDoubleToContentValues(cursor, str, contentValues, str);
    }

    public static void cursorDoubleToContentValues(android.database.Cursor cursor, java.lang.String str, android.content.ContentValues contentValues, java.lang.String str2) {
        int columnIndex = cursor.getColumnIndex(str);
        if (!cursor.isNull(columnIndex)) {
            contentValues.put(str2, java.lang.Double.valueOf(cursor.getDouble(columnIndex)));
        } else {
            contentValues.put(str2, (java.lang.Double) null);
        }
    }

    public static void cursorRowToContentValues(android.database.Cursor cursor, android.content.ContentValues contentValues) {
        java.lang.String[] columnNames = cursor.getColumnNames();
        int length = columnNames.length;
        for (int i = 0; i < length; i++) {
            if (cursor.getType(i) == 4) {
                contentValues.put(columnNames[i], cursor.getBlob(i));
            } else {
                contentValues.put(columnNames[i], cursor.getString(i));
            }
        }
    }

    public static int cursorPickFillWindowStartPosition(int i, int i2) {
        return java.lang.Math.max(i - (i2 / 3), 0);
    }

    public static long queryNumEntries(net.zetetic.database.sqlcipher.SQLiteDatabase sQLiteDatabase, java.lang.String str) {
        return queryNumEntries(sQLiteDatabase, str, null, null);
    }

    public static long queryNumEntries(net.zetetic.database.sqlcipher.SQLiteDatabase sQLiteDatabase, java.lang.String str, java.lang.String str2) {
        return queryNumEntries(sQLiteDatabase, str, str2, null);
    }

    public static long queryNumEntries(net.zetetic.database.sqlcipher.SQLiteDatabase sQLiteDatabase, java.lang.String str, java.lang.String str2, java.lang.String[] strArr) {
        java.lang.String concat = !android.text.TextUtils.isEmpty(str2) ? " where ".concat(java.lang.String.valueOf(str2)) : "";
        java.lang.StringBuilder sb = new java.lang.StringBuilder("select count(*) from ");
        sb.append(str);
        sb.append(concat);
        return longForQuery(sQLiteDatabase, sb.toString(), strArr);
    }

    public static boolean queryIsEmpty(net.zetetic.database.sqlcipher.SQLiteDatabase sQLiteDatabase, java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("select exists(select 1 from ");
        sb.append(str);
        sb.append(")");
        return longForQuery(sQLiteDatabase, sb.toString(), null) == 0;
    }

    public static long longForQuery(net.zetetic.database.sqlcipher.SQLiteDatabase sQLiteDatabase, java.lang.String str, java.lang.String[] strArr) {
        net.zetetic.database.sqlcipher.SQLiteStatement compileStatement = sQLiteDatabase.compileStatement(str);
        try {
            return longForQuery(compileStatement, strArr);
        } finally {
            compileStatement.close();
        }
    }

    public static long longForQuery(net.zetetic.database.sqlcipher.SQLiteStatement sQLiteStatement, java.lang.String[] strArr) {
        sQLiteStatement.bindAllArgsAsStrings(strArr);
        return sQLiteStatement.simpleQueryForLong();
    }

    public static java.lang.String stringForQuery(net.zetetic.database.sqlcipher.SQLiteDatabase sQLiteDatabase, java.lang.String str, java.lang.String[] strArr) {
        net.zetetic.database.sqlcipher.SQLiteStatement compileStatement = sQLiteDatabase.compileStatement(str);
        try {
            return stringForQuery(compileStatement, strArr);
        } finally {
            compileStatement.close();
        }
    }

    public static java.lang.String stringForQuery(net.zetetic.database.sqlcipher.SQLiteStatement sQLiteStatement, java.lang.String[] strArr) {
        sQLiteStatement.bindAllArgsAsStrings(strArr);
        return sQLiteStatement.simpleQueryForString();
    }

    public static android.os.ParcelFileDescriptor blobFileDescriptorForQuery(net.zetetic.database.sqlcipher.SQLiteDatabase sQLiteDatabase, java.lang.String str, java.lang.String[] strArr) {
        net.zetetic.database.sqlcipher.SQLiteStatement compileStatement = sQLiteDatabase.compileStatement(str);
        try {
            return blobFileDescriptorForQuery(compileStatement, strArr);
        } finally {
            compileStatement.close();
        }
    }

    public static android.os.ParcelFileDescriptor blobFileDescriptorForQuery(net.zetetic.database.sqlcipher.SQLiteStatement sQLiteStatement, java.lang.String[] strArr) {
        sQLiteStatement.bindAllArgsAsStrings(strArr);
        return sQLiteStatement.simpleQueryForBlobFileDescriptor();
    }

    public static void cursorStringToContentValuesIfPresent(android.database.Cursor cursor, android.content.ContentValues contentValues, java.lang.String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex == -1 || cursor.isNull(columnIndex)) {
            return;
        }
        contentValues.put(str, cursor.getString(columnIndex));
    }

    public static void cursorLongToContentValuesIfPresent(android.database.Cursor cursor, android.content.ContentValues contentValues, java.lang.String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex == -1 || cursor.isNull(columnIndex)) {
            return;
        }
        contentValues.put(str, java.lang.Long.valueOf(cursor.getLong(columnIndex)));
    }

    public static void cursorShortToContentValuesIfPresent(android.database.Cursor cursor, android.content.ContentValues contentValues, java.lang.String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex == -1 || cursor.isNull(columnIndex)) {
            return;
        }
        contentValues.put(str, java.lang.Short.valueOf(cursor.getShort(columnIndex)));
    }

    public static void cursorIntToContentValuesIfPresent(android.database.Cursor cursor, android.content.ContentValues contentValues, java.lang.String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex == -1 || cursor.isNull(columnIndex)) {
            return;
        }
        contentValues.put(str, java.lang.Integer.valueOf(cursor.getInt(columnIndex)));
    }

    public static void cursorFloatToContentValuesIfPresent(android.database.Cursor cursor, android.content.ContentValues contentValues, java.lang.String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex == -1 || cursor.isNull(columnIndex)) {
            return;
        }
        contentValues.put(str, java.lang.Float.valueOf(cursor.getFloat(columnIndex)));
    }

    public static void cursorDoubleToContentValuesIfPresent(android.database.Cursor cursor, android.content.ContentValues contentValues, java.lang.String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex == -1 || cursor.isNull(columnIndex)) {
            return;
        }
        contentValues.put(str, java.lang.Double.valueOf(cursor.getDouble(columnIndex)));
    }

    @java.lang.Deprecated
    /* loaded from: classes17.dex */
    public static class InsertHelper {
        public static final int TABLE_INFO_PRAGMA_COLUMNNAME_INDEX = 1;
        public static final int TABLE_INFO_PRAGMA_DEFAULT_INDEX = 4;
        private java.util.HashMap<java.lang.String, java.lang.Integer> mColumns;
        private final net.zetetic.database.sqlcipher.SQLiteDatabase mDb;
        private final java.lang.String mTableName;
        private java.lang.String mInsertSQL = null;
        private net.zetetic.database.sqlcipher.SQLiteStatement mInsertStatement = null;
        private net.zetetic.database.sqlcipher.SQLiteStatement mReplaceStatement = null;
        private net.zetetic.database.sqlcipher.SQLiteStatement mPreparedStatement = null;

        public InsertHelper(net.zetetic.database.sqlcipher.SQLiteDatabase sQLiteDatabase, java.lang.String str) {
            this.mDb = sQLiteDatabase;
            this.mTableName = str;
        }

        private void buildSQL() throws android.database.SQLException {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(128);
            sb.append("INSERT INTO ");
            sb.append(this.mTableName);
            sb.append(" (");
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(128);
            sb2.append("VALUES (");
            android.database.Cursor cursor = null;
            try {
                net.zetetic.database.sqlcipher.SQLiteDatabase sQLiteDatabase = this.mDb;
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder("PRAGMA table_info(");
                sb3.append(this.mTableName);
                sb3.append(")");
                cursor = sQLiteDatabase.rawQuery(sb3.toString(), (java.lang.String[]) null);
                this.mColumns = new java.util.HashMap<>(cursor.getCount());
                int i = 1;
                while (cursor.moveToNext()) {
                    java.lang.String string = cursor.getString(1);
                    java.lang.String string2 = cursor.getString(4);
                    this.mColumns.put(string, java.lang.Integer.valueOf(i));
                    sb.append("'");
                    sb.append(string);
                    sb.append("'");
                    if (string2 == null) {
                        sb2.append(com.datadog.android.core.internal.CoreFeature.DEFAULT_APP_VERSION);
                    } else {
                        sb2.append("COALESCE(?, ");
                        sb2.append(string2);
                        sb2.append(")");
                    }
                    sb.append(i == cursor.getCount() ? ") " : ", ");
                    sb2.append(i == cursor.getCount() ? ");" : ", ");
                    i++;
                }
                sb.append((java.lang.CharSequence) sb2);
                this.mInsertSQL = sb.toString();
            } finally {
                if (cursor != null) {
                    cursor.close();
                }
            }
        }

        private net.zetetic.database.sqlcipher.SQLiteStatement getStatement(boolean z) throws android.database.SQLException {
            if (z) {
                if (this.mReplaceStatement == null) {
                    if (this.mInsertSQL == null) {
                        buildSQL();
                    }
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("INSERT OR REPLACE");
                    sb.append(this.mInsertSQL.substring(6));
                    this.mReplaceStatement = this.mDb.compileStatement(sb.toString());
                }
                return this.mReplaceStatement;
            }
            if (this.mInsertStatement == null) {
                if (this.mInsertSQL == null) {
                    buildSQL();
                }
                this.mInsertStatement = this.mDb.compileStatement(this.mInsertSQL);
            }
            return this.mInsertStatement;
        }

        private long insertInternal(android.content.ContentValues contentValues, boolean z) {
            this.mDb.beginTransactionNonExclusive();
            try {
                try {
                    net.zetetic.database.sqlcipher.SQLiteStatement statement = getStatement(z);
                    statement.clearBindings();
                    for (java.util.Map.Entry<java.lang.String, java.lang.Object> entry : contentValues.valueSet()) {
                        net.zetetic.database.DatabaseUtils.bindObjectToProgram(statement, getColumnIndex(entry.getKey()), entry.getValue());
                    }
                    long executeInsert = statement.executeInsert();
                    this.mDb.setTransactionSuccessful();
                    return executeInsert;
                } catch (android.database.SQLException e) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append("Error inserting ");
                    sb.append(contentValues);
                    sb.append(" into table  ");
                    sb.append(this.mTableName);
                    net.zetetic.database.Logger.e(net.zetetic.database.DatabaseUtils.TAG, sb.toString(), e);
                    this.mDb.endTransaction();
                    return -1L;
                }
            } finally {
                this.mDb.endTransaction();
            }
        }

        public int getColumnIndex(java.lang.String str) {
            getStatement(false);
            java.lang.Integer num = this.mColumns.get(str);
            if (num == null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("column '");
                sb.append(str);
                sb.append("' is invalid");
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
            return num.intValue();
        }

        public void bind(int i, double d) {
            this.mPreparedStatement.bindDouble(i, d);
        }

        public void bind(int i, float f) {
            this.mPreparedStatement.bindDouble(i, f);
        }

        public void bind(int i, long j) {
            this.mPreparedStatement.bindLong(i, j);
        }

        public void bind(int i, int i2) {
            this.mPreparedStatement.bindLong(i, i2);
        }

        public void bind(int i, boolean z) {
            this.mPreparedStatement.bindLong(i, z ? 1L : 0L);
        }

        public void bindNull(int i) {
            this.mPreparedStatement.bindNull(i);
        }

        public void bind(int i, byte[] bArr) {
            if (bArr == null) {
                this.mPreparedStatement.bindNull(i);
            } else {
                this.mPreparedStatement.bindBlob(i, bArr);
            }
        }

        public void bind(int i, java.lang.String str) {
            if (str == null) {
                this.mPreparedStatement.bindNull(i);
            } else {
                this.mPreparedStatement.bindString(i, str);
            }
        }

        public long insert(android.content.ContentValues contentValues) {
            return insertInternal(contentValues, false);
        }

        public long execute() {
            net.zetetic.database.sqlcipher.SQLiteStatement sQLiteStatement = this.mPreparedStatement;
            if (sQLiteStatement == null) {
                throw new java.lang.IllegalStateException("you must prepare this inserter before calling execute");
            }
            try {
                try {
                    return sQLiteStatement.executeInsert();
                } catch (android.database.SQLException e) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Error executing InsertHelper with table ");
                    sb.append(this.mTableName);
                    net.zetetic.database.Logger.e(net.zetetic.database.DatabaseUtils.TAG, sb.toString(), e);
                    this.mPreparedStatement = null;
                    return -1L;
                }
            } finally {
                this.mPreparedStatement = null;
            }
        }

        public void prepareForInsert() {
            net.zetetic.database.sqlcipher.SQLiteStatement statement = getStatement(false);
            this.mPreparedStatement = statement;
            statement.clearBindings();
        }

        public void prepareForReplace() {
            net.zetetic.database.sqlcipher.SQLiteStatement statement = getStatement(true);
            this.mPreparedStatement = statement;
            statement.clearBindings();
        }

        public long replace(android.content.ContentValues contentValues) {
            return insertInternal(contentValues, true);
        }

        public void close() {
            net.zetetic.database.sqlcipher.SQLiteStatement sQLiteStatement = this.mInsertStatement;
            if (sQLiteStatement != null) {
                sQLiteStatement.close();
                this.mInsertStatement = null;
            }
            net.zetetic.database.sqlcipher.SQLiteStatement sQLiteStatement2 = this.mReplaceStatement;
            if (sQLiteStatement2 != null) {
                sQLiteStatement2.close();
                this.mReplaceStatement = null;
            }
            this.mInsertSQL = null;
            this.mColumns = null;
        }
    }

    public static void createDbFromSqlStatements(android.content.Context context, java.lang.String str, int i, java.lang.String str2) {
        java.io.File databasePath = context.getDatabasePath(str);
        databasePath.getParentFile().mkdirs();
        net.zetetic.database.sqlcipher.SQLiteDatabase openOrCreateDatabase = net.zetetic.database.sqlcipher.SQLiteDatabase.openOrCreateDatabase(databasePath, (net.zetetic.database.sqlcipher.SQLiteDatabase.CursorFactory) null);
        for (java.lang.String str3 : android.text.TextUtils.split(str2, ";\n")) {
            if (!android.text.TextUtils.isEmpty(str3)) {
                openOrCreateDatabase.execSQL(str3);
            }
        }
        openOrCreateDatabase.setVersion(i);
        openOrCreateDatabase.close();
    }

    public static int getSqlStatementType(java.lang.String str) {
        java.lang.String trim = str.trim();
        if (trim.length() < 3) {
            return 99;
        }
        java.lang.String upperCase = trim.substring(0, 3).toUpperCase(java.util.Locale.ROOT);
        if (upperCase.equals("SEL")) {
            return 1;
        }
        if (upperCase.equals("INS") || upperCase.equals("UPD") || upperCase.equals("REP") || upperCase.equals("DEL")) {
            return 2;
        }
        if (upperCase.equals("ATT")) {
            return 3;
        }
        if (upperCase.equals("COM") || upperCase.equals("END")) {
            return 5;
        }
        if (upperCase.equals("ROL")) {
            return 6;
        }
        if (upperCase.equals("BEG")) {
            return 4;
        }
        if (upperCase.equals("PRA")) {
            return 7;
        }
        if (upperCase.equals("CRE") || upperCase.equals("DRO") || upperCase.equals("ALT")) {
            return 8;
        }
        return (upperCase.equals("ANA") || upperCase.equals("DET")) ? 9 : 99;
    }

    public static java.lang.String[] appendSelectionArgs(java.lang.String[] strArr, java.lang.String[] strArr2) {
        if (strArr == null || strArr.length == 0) {
            return strArr2;
        }
        java.lang.String[] strArr3 = new java.lang.String[strArr.length + strArr2.length];
        java.lang.System.arraycopy(strArr, 0, strArr3, 0, strArr.length);
        java.lang.System.arraycopy(strArr2, 0, strArr3, strArr.length, strArr2.length);
        return strArr3;
    }

    public static int findRowIdColumnIndex(java.lang.String[] strArr) {
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            if (strArr[i].equals("_id")) {
                return i;
            }
        }
        return -1;
    }
}
