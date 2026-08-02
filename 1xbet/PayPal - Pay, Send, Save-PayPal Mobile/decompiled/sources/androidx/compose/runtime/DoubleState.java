package androidx.compose.runtime;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0006\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/DoubleState;", "Landroidx/compose/runtime/State;", "", "getValue", "()Ljava/lang/Double;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "getDoubleValue", "()D", "doubleValue"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface DoubleState extends androidx.compose.runtime.State<java.lang.Double> {
    double getDoubleValue();

    static /* synthetic */ double access$getValue$jd(androidx.compose.runtime.DoubleState doubleState) {
        return super.getValue().doubleValue();
    }

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static java.lang.Double getValue(androidx.compose.runtime.DoubleState doubleState) {
            return java.lang.Double.valueOf(androidx.compose.runtime.DoubleState.access$getValue$jd(doubleState));
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.State
    default java.lang.Double getValue() {
        return java.lang.Double.valueOf(getDoubleValue());
    }
}
