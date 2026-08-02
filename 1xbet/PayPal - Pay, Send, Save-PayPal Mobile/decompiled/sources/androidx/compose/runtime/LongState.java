package androidx.compose.runtime;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0006\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/LongState;", "Landroidx/compose/runtime/State;", "", "getValue", "()Ljava/lang/Long;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "getLongValue", "()J", "longValue"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface LongState extends androidx.compose.runtime.State<java.lang.Long> {
    long getLongValue();

    static /* synthetic */ long access$getValue$jd(androidx.compose.runtime.LongState longState) {
        return super.getValue().longValue();
    }

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static java.lang.Long getValue(androidx.compose.runtime.LongState longState) {
            return java.lang.Long.valueOf(androidx.compose.runtime.LongState.access$getValue$jd(longState));
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.State
    default java.lang.Long getValue() {
        return java.lang.Long.valueOf(getLongValue());
    }
}
