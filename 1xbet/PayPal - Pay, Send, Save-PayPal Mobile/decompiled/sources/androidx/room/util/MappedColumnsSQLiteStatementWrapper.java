package androidx.room.util;

@kotlin.Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0010 \n\u0002\b\u0018\n\u0002\u0010$\n\u0000\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ \u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\u0015\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0014H\u0096\u0001¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u0018\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0017H\u0096\u0001¢\u0006\u0004\b\u0018\u0010\u0019J \u0010\u001b\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u001aH\u0096\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ \u0010\u001d\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000bH\u0096\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ \u0010 \u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u001fH\u0096\u0001¢\u0006\u0004\b \u0010!J\u0018\u0010\"\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000bH\u0096\u0001¢\u0006\u0004\b\"\u0010#J \u0010$\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0004H\u0096\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0011H\u0096\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0011H\u0096\u0001¢\u0006\u0004\b(\u0010'J\u0018\u0010)\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000bH\u0096\u0001¢\u0006\u0004\b)\u0010*J\u0018\u0010+\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u000bH\u0096\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u000bH\u0096\u0001¢\u0006\u0004\b-\u0010.J\u0018\u0010/\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000bH\u0096\u0001¢\u0006\u0004\b/\u00100J\u0016\u00102\u001a\b\u0012\u0004\u0012\u00020\u000401H\u0096\u0001¢\u0006\u0004\b2\u00103J\u0018\u00104\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bH\u0096\u0001¢\u0006\u0004\b4\u00105J\u0018\u00106\u001a\u00020\u00172\u0006\u0010\u000e\u001a\u00020\u000bH\u0096\u0001¢\u0006\u0004\b6\u00107J\u0018\u00108\u001a\u00020\u001a2\u0006\u0010\u000e\u001a\u00020\u000bH\u0096\u0001¢\u0006\u0004\b8\u00109J\u0018\u0010:\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bH\u0096\u0001¢\u0006\u0004\b:\u00105J\u0018\u0010;\u001a\u00020\u001f2\u0006\u0010\u000e\u001a\u00020\u000bH\u0096\u0001¢\u0006\u0004\b;\u0010<J\u0018\u0010=\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000bH\u0096\u0001¢\u0006\u0004\b=\u00100J\u0018\u0010>\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u000bH\u0096\u0001¢\u0006\u0004\b>\u0010,J\u0010\u0010?\u001a\u00020\u0011H\u0096\u0001¢\u0006\u0004\b?\u0010'J\u0010\u0010@\u001a\u00020\u0014H\u0096\u0001¢\u0006\u0004\b@\u0010AR\u0014\u0010D\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010I\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR \u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010K"}, d2 = {"Landroidx/room/util/MappedColumnsSQLiteStatementWrapper;", "Landroidx/sqlite/SQLiteStatement;", "delegate", "", "", "columnNames", "", "mapping", "<init>", "(Landroidx/sqlite/SQLiteStatement;[Ljava/lang/String;[I)V", "name", "", "getColumnIndex", "(Ljava/lang/String;)I", "index", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "bindBlob", "(I[B)V", "", "bindBoolean", "(IZ)V", "", "bindDouble", "(ID)V", "", "bindFloat", "(IF)V", "bindInt", "(II)V", "", "bindLong", "(IJ)V", "bindNull", "(I)V", "bindText", "(ILjava/lang/String;)V", "clearBindings", "()V", "close", "getBlob", "(I)[B", "getBoolean", "(I)Z", "getColumnCount", "()I", "getColumnName", "(I)Ljava/lang/String;", "", "getColumnNames", "()Ljava/util/List;", "getColumnType", "(I)I", "getDouble", "(I)D", "getFloat", "(I)F", "getInt", "getLong", "(I)J", "getText", "isNull", "reset", "step", "()Z", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/sqlite/SQLiteStatement;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoSizes", "[Ljava/lang/String;", "Camera2StreamConfigurationMap", "[I", "getHighSpeedVideoFpsRangesFor", "", "Ljava/util/Map;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MappedColumnsSQLiteStatementWrapper implements androidx.database.SQLiteStatement {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final int[] getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.database.SQLiteStatement getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.util.Map<java.lang.String, java.lang.Integer> getHighResolutionOutputSizeshNQ4ISI;
    private final java.lang.String[] getHighSpeedVideoSizes;

    public MappedColumnsSQLiteStatementWrapper(androidx.database.SQLiteStatement sQLiteStatement, java.lang.String[] strArr, int[] iArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sQLiteStatement, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strArr, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iArr, "");
        this.getHighSpeedVideoFpsRanges = sQLiteStatement;
        this.getHighSpeedVideoSizes = strArr;
        this.getHighSpeedVideoFpsRangesFor = iArr;
        if (strArr.length != iArr.length) {
            throw new java.lang.IllegalArgumentException("Expected columnNames.size == mapping.size".toString());
        }
        java.util.Map createMapBuilder = kotlin.collections.MapsKt.createMapBuilder();
        int length = strArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            createMapBuilder.put(strArr[i], java.lang.Integer.valueOf(this.getHighSpeedVideoFpsRangesFor[i2]));
            i++;
            i2++;
        }
        int columnCount = getColumnCount();
        for (int i3 = 0; i3 < columnCount; i3++) {
            if (!createMapBuilder.containsKey(getColumnName(i3))) {
                createMapBuilder.put(getColumnName(i3), java.lang.Integer.valueOf(i3));
            }
        }
        this.getHighResolutionOutputSizeshNQ4ISI = kotlin.collections.MapsKt.build(createMapBuilder);
    }

    public final int getColumnIndex(java.lang.String name2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        java.lang.Integer num = this.getHighResolutionOutputSizeshNQ4ISI.get(name2);
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    @Override // androidx.database.SQLiteStatement
    public final boolean step() {
        return this.getHighSpeedVideoFpsRanges.step();
    }

    @Override // androidx.database.SQLiteStatement
    public final void reset() {
        this.getHighSpeedVideoFpsRanges.reset();
    }

    @Override // androidx.database.SQLiteStatement
    public final boolean isNull(int index) {
        return this.getHighSpeedVideoFpsRanges.isNull(index);
    }

    @Override // androidx.database.SQLiteStatement
    public final java.lang.String getText(int index) {
        return this.getHighSpeedVideoFpsRanges.getText(index);
    }

    @Override // androidx.database.SQLiteStatement
    public final long getLong(int index) {
        return this.getHighSpeedVideoFpsRanges.getLong(index);
    }

    @Override // androidx.database.SQLiteStatement
    public final int getInt(int index) {
        return this.getHighSpeedVideoFpsRanges.getInt(index);
    }

    @Override // androidx.database.SQLiteStatement
    public final float getFloat(int index) {
        return this.getHighSpeedVideoFpsRanges.getFloat(index);
    }

    @Override // androidx.database.SQLiteStatement
    public final double getDouble(int index) {
        return this.getHighSpeedVideoFpsRanges.getDouble(index);
    }

    @Override // androidx.database.SQLiteStatement
    public final int getColumnType(int index) {
        return this.getHighSpeedVideoFpsRanges.getColumnType(index);
    }

    @Override // androidx.database.SQLiteStatement
    public final java.util.List<java.lang.String> getColumnNames() {
        return this.getHighSpeedVideoFpsRanges.getColumnNames();
    }

    @Override // androidx.database.SQLiteStatement
    public final java.lang.String getColumnName(int index) {
        return this.getHighSpeedVideoFpsRanges.getColumnName(index);
    }

    @Override // androidx.database.SQLiteStatement
    public final int getColumnCount() {
        return this.getHighSpeedVideoFpsRanges.getColumnCount();
    }

    @Override // androidx.database.SQLiteStatement
    public final boolean getBoolean(int index) {
        return this.getHighSpeedVideoFpsRanges.getBoolean(index);
    }

    @Override // androidx.database.SQLiteStatement
    public final byte[] getBlob(int index) {
        return this.getHighSpeedVideoFpsRanges.getBlob(index);
    }

    @Override // androidx.database.SQLiteStatement, java.lang.AutoCloseable
    public final void close() {
        this.getHighSpeedVideoFpsRanges.close();
    }

    @Override // androidx.database.SQLiteStatement
    /* renamed from: clearBindings */
    public final void mo9288clearBindings() {
        this.getHighSpeedVideoFpsRanges.mo9288clearBindings();
    }

    @Override // androidx.database.SQLiteStatement
    /* renamed from: bindText */
    public final void mo9287bindText(int index, java.lang.String value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        this.getHighSpeedVideoFpsRanges.mo9287bindText(index, value);
    }

    @Override // androidx.database.SQLiteStatement
    /* renamed from: bindNull */
    public final void mo9286bindNull(int index) {
        this.getHighSpeedVideoFpsRanges.mo9286bindNull(index);
    }

    @Override // androidx.database.SQLiteStatement
    /* renamed from: bindLong */
    public final void mo9285bindLong(int index, long value) {
        this.getHighSpeedVideoFpsRanges.mo9285bindLong(index, value);
    }

    @Override // androidx.database.SQLiteStatement
    public final void bindInt(int index, int value) {
        this.getHighSpeedVideoFpsRanges.bindInt(index, value);
    }

    @Override // androidx.database.SQLiteStatement
    public final void bindFloat(int index, float value) {
        this.getHighSpeedVideoFpsRanges.bindFloat(index, value);
    }

    @Override // androidx.database.SQLiteStatement
    /* renamed from: bindDouble */
    public final void mo9284bindDouble(int index, double value) {
        this.getHighSpeedVideoFpsRanges.mo9284bindDouble(index, value);
    }

    @Override // androidx.database.SQLiteStatement
    public final void bindBoolean(int index, boolean value) {
        this.getHighSpeedVideoFpsRanges.bindBoolean(index, value);
    }

    @Override // androidx.database.SQLiteStatement
    /* renamed from: bindBlob */
    public final void mo9283bindBlob(int index, byte[] value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        this.getHighSpeedVideoFpsRanges.mo9283bindBlob(index, value);
    }
}
