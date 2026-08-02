package app.cash.sqldelight;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\u0004\b\u0001\u0010\u00032\u00020\u0001J\u0017\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00028\u0001H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00028\u00012\u0006\u0010\u0007\u001a\u00028\u0000H&¢\u0006\u0004\b\b\u0010\u0006"}, d2 = {"Lapp/cash/sqldelight/ColumnAdapter;", "", "T", "S", "databaseValue", "decode", "(Ljava/lang/Object;)Ljava/lang/Object;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "encode"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface ColumnAdapter<T, S> {
    T decode(S databaseValue);

    S encode(T value);
}
