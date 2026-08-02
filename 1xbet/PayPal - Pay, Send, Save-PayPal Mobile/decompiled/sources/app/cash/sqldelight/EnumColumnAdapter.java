package app.cash.sqldelight;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0011\n\u0002\b\f\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003B\u0019\b\u0000\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0011\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lapp/cash/sqldelight/EnumColumnAdapter;", "", "T", "Lapp/cash/sqldelight/ColumnAdapter;", "", "", "enumValues", "<init>", "([Ljava/lang/Enum;)V", "databaseValue", "decode", "(Ljava/lang/String;)Ljava/lang/Enum;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "encode", "(Ljava/lang/Enum;)Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", "[Ljava/lang/Enum;", "getHighSpeedVideoSizes"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class EnumColumnAdapter<T extends java.lang.Enum<T>> implements app.cash.sqldelight.ColumnAdapter<T, java.lang.String> {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final T[] getHighSpeedVideoSizes;

    public EnumColumnAdapter(T[] tArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tArr, "");
        this.getHighSpeedVideoSizes = tArr;
    }

    @Override // app.cash.sqldelight.ColumnAdapter
    public final T decode(java.lang.String databaseValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(databaseValue, "");
        for (T t : this.getHighSpeedVideoSizes) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(t.name(), databaseValue)) {
                return t;
            }
        }
        throw new java.util.NoSuchElementException("Array contains no element matching the predicate.");
    }

    @Override // app.cash.sqldelight.ColumnAdapter
    public final java.lang.String encode(T value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        return value.name();
    }
}
