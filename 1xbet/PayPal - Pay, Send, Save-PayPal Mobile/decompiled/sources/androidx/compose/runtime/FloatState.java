package androidx.compose.runtime;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/FloatState;", "Landroidx/compose/runtime/State;", "", "getValue", "()Ljava/lang/Float;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "getFloatValue", "()F", "floatValue"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface FloatState extends androidx.compose.runtime.State<java.lang.Float> {
    float getFloatValue();

    static /* synthetic */ float access$getValue$jd(androidx.compose.runtime.FloatState floatState) {
        return super.getValue().floatValue();
    }

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static java.lang.Float getValue(androidx.compose.runtime.FloatState floatState) {
            return java.lang.Float.valueOf(androidx.compose.runtime.FloatState.access$getValue$jd(floatState));
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.State
    default java.lang.Float getValue() {
        return java.lang.Float.valueOf(getFloatValue());
    }
}
