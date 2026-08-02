package androidx.compose.runtime;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\u00038WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00038WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011"}, d2 = {"Landroidx/compose/runtime/UnboxedFloatState;", "Landroidx/compose/runtime/FloatState;", "Landroidx/compose/runtime/State;", "", "baseState", "<init>", "(Landroidx/compose/runtime/State;)V", "", "toString", "()Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/runtime/State;", "getHighSpeedVideoSizes", "getFloatValue", "()F", "floatValue", "getValue", "()Ljava/lang/Float;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UnboxedFloatState implements androidx.compose.runtime.FloatState {
    public static final int $stable = 0;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.compose.runtime.State<java.lang.Float> getHighSpeedVideoSizes;

    public UnboxedFloatState(androidx.compose.runtime.State<java.lang.Float> state) {
        this.getHighSpeedVideoSizes = state;
    }

    @Override // androidx.compose.runtime.FloatState
    public final float getFloatValue() {
        return this.getHighSpeedVideoSizes.getValue().floatValue();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.FloatState, androidx.compose.runtime.State
    public final java.lang.Float getValue() {
        return this.getHighSpeedVideoSizes.getValue();
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("UnboxedFloatState(baseState=");
        sb.append(this.getHighSpeedVideoSizes);
        sb.append(")@");
        sb.append(hashCode());
        return sb.toString();
    }
}
