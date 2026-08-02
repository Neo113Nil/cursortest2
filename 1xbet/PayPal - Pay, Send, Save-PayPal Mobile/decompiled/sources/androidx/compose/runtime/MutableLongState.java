package androidx.compose.runtime;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\t\bf\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002R$\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00038W@WX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\f\u001a\u00020\u00038'@'X¦\u000e¢\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/MutableLongState;", "Landroidx/compose/runtime/LongState;", "Landroidx/compose/runtime/MutableState;", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "getValue", "()Ljava/lang/Long;", "setValue", "(J)V", "getLongValue", "()J", "setLongValue", "longValue"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface MutableLongState extends androidx.compose.runtime.LongState, androidx.compose.runtime.MutableState<java.lang.Long> {
    @Override // androidx.compose.runtime.LongState
    long getLongValue();

    void setLongValue(long j);

    static /* synthetic */ long access$getValue$jd(androidx.compose.runtime.MutableLongState mutableLongState) {
        return super.getValue().longValue();
    }

    @Override // androidx.compose.runtime.MutableState
    /* synthetic */ default void setValue(java.lang.Long l) {
        setValue(l.longValue());
    }

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static java.lang.Long getValue(androidx.compose.runtime.MutableLongState mutableLongState) {
            return java.lang.Long.valueOf(androidx.compose.runtime.MutableLongState.access$getValue$jd(mutableLongState));
        }

        @java.lang.Deprecated
        public static void setValue(androidx.compose.runtime.MutableLongState mutableLongState, long j) {
            androidx.compose.runtime.MutableLongState.super.setValue(j);
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.LongState, androidx.compose.runtime.State
    default java.lang.Long getValue() {
        return java.lang.Long.valueOf(getLongValue());
    }

    default void setValue(long j) {
        setLongValue(j);
    }
}
