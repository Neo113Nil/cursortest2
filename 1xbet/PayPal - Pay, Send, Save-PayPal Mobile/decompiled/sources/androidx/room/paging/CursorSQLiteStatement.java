package androidx.room.paging;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0001\n\u0002\b\u0010\u0018\u0000 32\u00020\u0001:\u00013B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0019\u0010\u0013J\u0017\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u001eH\u0016¢\u0006\u0004\b!\u0010 J\u001f\u0010$\u001a\u00020#2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\bH\u0016¢\u0006\u0004\b$\u0010%J\u001f\u0010&\u001a\u00020#2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u000bH\u0016¢\u0006\u0004\b&\u0010'J\u001f\u0010(\u001a\u00020#2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u000eH\u0016¢\u0006\u0004\b(\u0010)J\u001f\u0010*\u001a\u00020#2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u0011H\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020#2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020#H\u0016¢\u0006\u0004\b.\u0010/R\u0014\u00102\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101"}, d2 = {"Landroidx/room/paging/CursorSQLiteStatement;", "Landroidx/sqlite/SQLiteStatement;", "Landroid/database/Cursor;", "cursor", "<init>", "(Landroid/database/Cursor;)V", "", "index", "", "getBlob", "(I)[B", "", "getDouble", "(I)D", "", "getLong", "(I)J", "", "getText", "(I)Ljava/lang/String;", "", "isNull", "(I)Z", "getColumnCount", "()I", "getColumnName", "getColumnType", "(I)I", "step", "()Z", "", "reset", "()V", "close", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "bindBlob", "(I[B)Ljava/lang/Void;", "bindDouble", "(ID)Ljava/lang/Void;", "bindLong", "(IJ)Ljava/lang/Void;", "bindText", "(ILjava/lang/String;)Ljava/lang/Void;", "bindNull", "(I)Ljava/lang/Void;", "clearBindings", "()Ljava/lang/Void;", "getHighSpeedVideoSizes", "Landroid/database/Cursor;", "Camera2StreamConfigurationMap", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CursorSQLiteStatement implements androidx.database.SQLiteStatement {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.room.paging.CursorSQLiteStatement.Companion INSTANCE = new androidx.room.paging.CursorSQLiteStatement.Companion(null);

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final android.database.Cursor Camera2StreamConfigurationMap;

    public CursorSQLiteStatement(android.database.Cursor cursor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cursor, "");
        this.Camera2StreamConfigurationMap = cursor;
    }

    @Override // androidx.database.SQLiteStatement
    public final byte[] getBlob(int index) {
        byte[] blob = this.Camera2StreamConfigurationMap.getBlob(index);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(blob, "");
        return blob;
    }

    @Override // androidx.database.SQLiteStatement
    public final double getDouble(int index) {
        return this.Camera2StreamConfigurationMap.getDouble(index);
    }

    @Override // androidx.database.SQLiteStatement
    public final long getLong(int index) {
        return this.Camera2StreamConfigurationMap.getLong(index);
    }

    @Override // androidx.database.SQLiteStatement
    public final java.lang.String getText(int index) {
        java.lang.String string = this.Camera2StreamConfigurationMap.getString(index);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    @Override // androidx.database.SQLiteStatement
    public final boolean isNull(int index) {
        return this.Camera2StreamConfigurationMap.isNull(index);
    }

    @Override // androidx.database.SQLiteStatement
    public final int getColumnCount() {
        return this.Camera2StreamConfigurationMap.getColumnCount();
    }

    @Override // androidx.database.SQLiteStatement
    public final java.lang.String getColumnName(int index) {
        java.lang.String columnName = this.Camera2StreamConfigurationMap.getColumnName(index);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(columnName, "");
        return columnName;
    }

    @Override // androidx.database.SQLiteStatement
    public final int getColumnType(int index) {
        return androidx.room.paging.CursorSQLiteStatement.Companion.access$getDataType(INSTANCE, this.Camera2StreamConfigurationMap, index);
    }

    @Override // androidx.database.SQLiteStatement
    public final boolean step() {
        return this.Camera2StreamConfigurationMap.moveToNext();
    }

    @Override // androidx.database.SQLiteStatement
    public final void reset() {
        this.Camera2StreamConfigurationMap.moveToPosition(-1);
    }

    @Override // androidx.database.SQLiteStatement, java.lang.AutoCloseable
    public final void close() {
        this.Camera2StreamConfigurationMap.close();
    }

    @Override // androidx.database.SQLiteStatement
    /* renamed from: bindBlob, reason: merged with bridge method [inline-methods] */
    public final java.lang.Void mo9283bindBlob(int index, byte[] value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        throw new java.lang.IllegalStateException("Only get*() calls are allowed on a Cursor backed SQLiteStatement".toString());
    }

    @Override // androidx.database.SQLiteStatement
    /* renamed from: bindDouble, reason: merged with bridge method [inline-methods] */
    public final java.lang.Void mo9284bindDouble(int index, double value) {
        throw new java.lang.IllegalStateException("Only get*() calls are allowed on a Cursor backed SQLiteStatement".toString());
    }

    @Override // androidx.database.SQLiteStatement
    /* renamed from: bindLong, reason: merged with bridge method [inline-methods] */
    public final java.lang.Void mo9285bindLong(int index, long value) {
        throw new java.lang.IllegalStateException("Only get*() calls are allowed on a Cursor backed SQLiteStatement".toString());
    }

    @Override // androidx.database.SQLiteStatement
    /* renamed from: bindText, reason: merged with bridge method [inline-methods] */
    public final java.lang.Void mo9287bindText(int index, java.lang.String value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        throw new java.lang.IllegalStateException("Only get*() calls are allowed on a Cursor backed SQLiteStatement".toString());
    }

    @Override // androidx.database.SQLiteStatement
    /* renamed from: bindNull, reason: merged with bridge method [inline-methods] */
    public final java.lang.Void mo9286bindNull(int index) {
        throw new java.lang.IllegalStateException("Only get*() calls are allowed on a Cursor backed SQLiteStatement".toString());
    }

    @Override // androidx.database.SQLiteStatement
    /* renamed from: clearBindings, reason: merged with bridge method [inline-methods] */
    public final java.lang.Void mo9288clearBindings() {
        throw new java.lang.IllegalStateException("Only get*() calls are allowed on a Cursor backed SQLiteStatement".toString());
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/room/paging/CursorSQLiteStatement$Companion;", "", "<init>", "()V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static final /* synthetic */ int access$getDataType(androidx.room.paging.CursorSQLiteStatement.Companion companion, android.database.Cursor cursor, int i) {
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
