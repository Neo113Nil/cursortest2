package androidx.compose.animation.core;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b \u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0004BM\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00028\u0000\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00018\u0001\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R+\u0010\u001d\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00028\u00008W@QX\u0097\u008e\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR*\u0010\u001e\u001a\u00028\u00012\u0006\u0010\u001d\u001a\u00028\u00018\u0007@AX\u0087\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R*\u0010\n\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\t8\u0007@AX\u0087\u000e¢\u0006\u0012\n\u0004\b\n\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R*\u0010\u000b\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\t8\u0007@AX\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010$\u001a\u0004\b)\u0010&\"\u0004\b*\u0010(R*\u0010\r\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\f8\u0007@AX\u0087\u000e¢\u0006\u0012\n\u0004\b\r\u0010+\u001a\u0004\b\r\u0010,\"\u0004\b-\u0010.R\u0011\u00100\u001a\u00028\u00008G¢\u0006\u0006\u001a\u0004\b/\u0010\u001a"}, d2 = {"Landroidx/compose/animation/core/AnimationState;", "T", "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/runtime/State;", "Landroidx/compose/animation/core/TwoWayConverter;", "typeConverter", "initialValue", "initialVelocityVector", "", "lastFrameTimeNanos", "finishedTimeNanos", "", "isRunning", "<init>", "(Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/Object;Landroidx/compose/animation/core/AnimationVector;JJZ)V", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/animation/core/TwoWayConverter;", "getTypeConverter", "()Landroidx/compose/animation/core/TwoWayConverter;", "<set-?>", "value$delegate", "Landroidx/compose/runtime/MutableState;", "getValue", "()Ljava/lang/Object;", "setValue$animation_core", "(Ljava/lang/Object;)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "velocityVector", "Landroidx/compose/animation/core/AnimationVector;", "getVelocityVector", "()Landroidx/compose/animation/core/AnimationVector;", "setVelocityVector$animation_core", "(Landroidx/compose/animation/core/AnimationVector;)V", "J", "getLastFrameTimeNanos", "()J", "setLastFrameTimeNanos$animation_core", "(J)V", "getFinishedTimeNanos", "setFinishedTimeNanos$animation_core", "Z", "()Z", "setRunning$animation_core", "(Z)V", "getVelocity", "velocity"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AnimationState<T, V extends androidx.compose.animation.core.AnimationVector> implements androidx.compose.runtime.State<T> {
    public static final int $stable = 0;
    private long finishedTimeNanos;
    private boolean isRunning;
    private long lastFrameTimeNanos;
    private final androidx.compose.animation.core.TwoWayConverter<T, V> typeConverter;

    /* renamed from: value$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState value;
    private V velocityVector;

    public AnimationState(androidx.compose.animation.core.TwoWayConverter<T, V> twoWayConverter, T t, V v, long j, long j2, boolean z) {
        V v2;
        this.typeConverter = twoWayConverter;
        this.value = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t, null, 2, null);
        this.velocityVector = (v == null || (v2 = (V) androidx.compose.animation.core.AnimationVectorsKt.copy(v)) == null) ? (V) androidx.compose.animation.core.AnimationStateKt.createZeroVectorFrom(twoWayConverter, t) : v2;
        this.lastFrameTimeNanos = j;
        this.finishedTimeNanos = j2;
        this.isRunning = z;
    }

    public /* synthetic */ AnimationState(androidx.compose.animation.core.TwoWayConverter twoWayConverter, java.lang.Object obj, androidx.compose.animation.core.AnimationVector animationVector, long j, long j2, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(twoWayConverter, obj, (i & 4) != 0 ? null : animationVector, (i & 8) != 0 ? Long.MIN_VALUE : j, (i & 16) != 0 ? Long.MIN_VALUE : j2, (i & 32) != 0 ? false : z);
    }

    public final androidx.compose.animation.core.TwoWayConverter<T, V> getTypeConverter() {
        return this.typeConverter;
    }

    @Override // androidx.compose.runtime.State
    public final T getValue() {
        return this.value.getValue();
    }

    public final void setValue$animation_core(T t) {
        this.value.setValue(t);
    }

    public final V getVelocityVector() {
        return this.velocityVector;
    }

    public final void setVelocityVector$animation_core(V v) {
        this.velocityVector = v;
    }

    public final long getLastFrameTimeNanos() {
        return this.lastFrameTimeNanos;
    }

    public final void setLastFrameTimeNanos$animation_core(long j) {
        this.lastFrameTimeNanos = j;
    }

    public final long getFinishedTimeNanos() {
        return this.finishedTimeNanos;
    }

    public final void setFinishedTimeNanos$animation_core(long j) {
        this.finishedTimeNanos = j;
    }

    /* renamed from: isRunning, reason: from getter */
    public final boolean getIsRunning() {
        return this.isRunning;
    }

    public final void setRunning$animation_core(boolean z) {
        this.isRunning = z;
    }

    public final T getVelocity() {
        return this.typeConverter.getConvertFromVector().invoke(this.velocityVector);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AnimationState(value=");
        sb.append(getValue());
        sb.append(", velocity=");
        sb.append(getVelocity());
        sb.append(", isRunning=");
        sb.append(this.isRunning);
        sb.append(", lastFrameTimeNanos=");
        sb.append(this.lastFrameTimeNanos);
        sb.append(", finishedTimeNanos=");
        sb.append(this.finishedTimeNanos);
        sb.append(')');
        return sb.toString();
    }
}
