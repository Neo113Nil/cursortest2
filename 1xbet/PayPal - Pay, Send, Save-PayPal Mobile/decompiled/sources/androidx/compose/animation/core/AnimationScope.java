package androidx.compose.animation.core;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b'\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0004B[\b\u0000\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0006\u0010\b\u001a\u00028\u0001\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00028\u0000\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0016¢\u0006\u0004\b\u0017\u0010\u0018R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00068\u0007¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u000b\u001a\u00028\u00008\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\f\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R+\u0010+\u001a\u00028\u00002\u0006\u0010%\u001a\u00028\u00008G@AX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\u001e\"\u0004\b)\u0010*R*\u0010,\u001a\u00028\u00012\u0006\u0010+\u001a\u00028\u00018\u0007@AX\u0087\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R*\u0010\n\u001a\u00020\t2\u0006\u0010+\u001a\u00020\t8\u0007@AX\u0087\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u001f\u001a\u0004\b2\u0010!\"\u0004\b3\u00104R*\u00105\u001a\u00020\t2\u0006\u0010+\u001a\u00020\t8\u0007@AX\u0087\u000e¢\u0006\u0012\n\u0004\b5\u0010\u001f\u001a\u0004\b6\u0010!\"\u0004\b7\u00104R+\u0010\u000e\u001a\u00020\r2\u0006\u0010%\u001a\u00020\r8G@AX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b8\u0010'\u001a\u0004\b\u000e\u00109\"\u0004\b:\u0010;R\u0011\u0010=\u001a\u00028\u00008G¢\u0006\u0006\u001a\u0004\b<\u0010\u001e"}, d2 = {"Landroidx/compose/animation/core/AnimationScope;", "T", "Landroidx/compose/animation/core/AnimationVector;", "V", "", "initialValue", "Landroidx/compose/animation/core/TwoWayConverter;", "typeConverter", "initialVelocityVector", "", "lastFrameTimeNanos", "targetValue", "startTimeNanos", "", "isRunning", "Lkotlin/Function0;", "", "onCancel", "<init>", "(Ljava/lang/Object;Landroidx/compose/animation/core/TwoWayConverter;Landroidx/compose/animation/core/AnimationVector;JLjava/lang/Object;JZLkotlin/jvm/functions/Function0;)V", "cancelAnimation", "()V", "Landroidx/compose/animation/core/AnimationState;", "toAnimationState", "()Landroidx/compose/animation/core/AnimationState;", "Landroidx/compose/animation/core/TwoWayConverter;", "getTypeConverter", "()Landroidx/compose/animation/core/TwoWayConverter;", "Ljava/lang/Object;", "getTargetValue", "()Ljava/lang/Object;", "J", "getStartTimeNanos", "()J", "Camera2StreamConfigurationMap", "Lkotlin/jvm/functions/Function0;", "getHighSpeedVideoFpsRangesFor", "<set-?>", "value$delegate", "Landroidx/compose/runtime/MutableState;", "getValue", "setValue$animation_core", "(Ljava/lang/Object;)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "velocityVector", "Landroidx/compose/animation/core/AnimationVector;", "getVelocityVector", "()Landroidx/compose/animation/core/AnimationVector;", "setVelocityVector$animation_core", "(Landroidx/compose/animation/core/AnimationVector;)V", "getLastFrameTimeNanos", "setLastFrameTimeNanos$animation_core", "(J)V", "finishedTimeNanos", "getFinishedTimeNanos", "setFinishedTimeNanos$animation_core", "isRunning$delegate", "()Z", "setRunning$animation_core", "(Z)V", "getVelocity", "velocity"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AnimationScope<T, V extends androidx.compose.animation.core.AnimationVector> {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoFpsRangesFor;
    private long finishedTimeNanos = Long.MIN_VALUE;

    /* renamed from: isRunning$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState isRunning;
    private long lastFrameTimeNanos;
    private final long startTimeNanos;
    private final T targetValue;
    private final androidx.compose.animation.core.TwoWayConverter<T, V> typeConverter;

    /* renamed from: value$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState value;
    private V velocityVector;

    public AnimationScope(T t, androidx.compose.animation.core.TwoWayConverter<T, V> twoWayConverter, V v, long j, T t2, long j2, boolean z, kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        this.typeConverter = twoWayConverter;
        this.targetValue = t2;
        this.startTimeNanos = j2;
        this.getHighSpeedVideoFpsRangesFor = function0;
        this.value = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t, null, 2, null);
        this.velocityVector = (V) androidx.compose.animation.core.AnimationVectorsKt.copy(v);
        this.lastFrameTimeNanos = j;
        this.isRunning = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.valueOf(z), null, 2, null);
    }

    public final androidx.compose.animation.core.TwoWayConverter<T, V> getTypeConverter() {
        return this.typeConverter;
    }

    public final T getTargetValue() {
        return this.targetValue;
    }

    public final long getStartTimeNanos() {
        return this.startTimeNanos;
    }

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

    public final boolean isRunning() {
        return ((java.lang.Boolean) this.isRunning.getValue()).booleanValue();
    }

    public final void setRunning$animation_core(boolean z) {
        this.isRunning.setValue(java.lang.Boolean.valueOf(z));
    }

    public final T getVelocity() {
        return this.typeConverter.getConvertFromVector().invoke(this.velocityVector);
    }

    public final void cancelAnimation() {
        setRunning$animation_core(false);
        this.getHighSpeedVideoFpsRangesFor.invoke();
    }

    public final androidx.compose.animation.core.AnimationState<T, V> toAnimationState() {
        return new androidx.compose.animation.core.AnimationState<>(this.typeConverter, getValue(), this.velocityVector, this.lastFrameTimeNanos, this.finishedTimeNanos, isRunning());
    }
}
