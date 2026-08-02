package androidx.compose.animation.core;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004BG\b\u0000\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0006\u0010\t\u001a\u00028\u0000\u0012\u0006\u0010\n\u001a\u00028\u0000\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00018\u0001¢\u0006\u0004\b\f\u0010\rBG\b\u0016\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0006\u0010\t\u001a\u00028\u0000\u0012\u0006\u0010\n\u001a\u00028\u0000\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00018\u0001¢\u0006\u0004\b\f\u0010\u000fJ\u0017\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00028\u00012\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u00058\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR&\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00078\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR*\u0010 \u001a\u00028\u00002\u0006\u0010\u001f\u001a\u00028\u00008\u0001@AX\u0081\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R*\u0010&\u001a\u00028\u00002\u0006\u0010\u001f\u001a\u00028\u00008\u0001@AX\u0081\u000e¢\u0006\u0012\n\u0004\b&\u0010!\u001a\u0004\b'\u0010#\"\u0004\b(\u0010%R\u0011\u0010\t\u001a\u00028\u00008G¢\u0006\u0006\u001a\u0004\b)\u0010#R\u0014\u0010\n\u001a\u00028\u00008WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010#R\u0016\u0010-\u001a\u00028\u00018\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010+\u001a\u00028\u00018\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b.\u0010,R\u0014\u0010/\u001a\u00028\u00018\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b-\u0010,R\u0014\u00101\u001a\u0002008WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u0016\u0010.\u001a\u00020\u00108\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b/\u00103R\u0014\u00106\u001a\u00020\u00108WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u00105R\u0018\u00107\u001a\u0004\u0018\u00018\u00018\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b7\u0010,R\u0014\u00109\u001a\u00028\u00018CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b/\u00108"}, d2 = {"Landroidx/compose/animation/core/TargetBasedAnimation;", "T", "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/animation/core/Animation;", "Landroidx/compose/animation/core/VectorizedAnimationSpec;", "animationSpec", "Landroidx/compose/animation/core/TwoWayConverter;", "typeConverter", "initialValue", "targetValue", "initialVelocityVector", "<init>", "(Landroidx/compose/animation/core/VectorizedAnimationSpec;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/AnimationVector;)V", "Landroidx/compose/animation/core/AnimationSpec;", "(Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/AnimationVector;)V", "", "playTimeNanos", "getValueFromNanos", "(J)Ljava/lang/Object;", "getVelocityVectorFromNanos", "(J)Landroidx/compose/animation/core/AnimationVector;", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/animation/core/VectorizedAnimationSpec;", "getAnimationSpec$animation_core", "()Landroidx/compose/animation/core/VectorizedAnimationSpec;", "Landroidx/compose/animation/core/TwoWayConverter;", "getTypeConverter", "()Landroidx/compose/animation/core/TwoWayConverter;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "mutableTargetValue", "Ljava/lang/Object;", "getMutableTargetValue$animation_core", "()Ljava/lang/Object;", "setMutableTargetValue$animation_core", "(Ljava/lang/Object;)V", "mutableInitialValue", "getMutableInitialValue$animation_core", "setMutableInitialValue$animation_core", "getInitialValue", "getTargetValue", "getHighSpeedVideoFpsRanges", "Landroidx/compose/animation/core/AnimationVector;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRangesFor", "", "isInfinite", "()Z", "J", "getDurationNanos", "()J", "durationNanos", "Camera2StreamConfigurationMap", "()Landroidx/compose/animation/core/AnimationVector;", "getInputSizeshNQ4ISI"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TargetBasedAnimation<T, V extends androidx.compose.animation.core.AnimationVector> implements androidx.compose.animation.core.Animation<T, V> {
    public static final int $stable = 8;
    private V Camera2StreamConfigurationMap;
    private final androidx.compose.animation.core.VectorizedAnimationSpec<V> animationSpec;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final V getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private V getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private long getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private V getHighSpeedVideoFpsRanges;
    private T mutableInitialValue;
    private T mutableTargetValue;
    private final androidx.compose.animation.core.TwoWayConverter<T, V> typeConverter;

    public TargetBasedAnimation(androidx.compose.animation.core.VectorizedAnimationSpec<V> vectorizedAnimationSpec, androidx.compose.animation.core.TwoWayConverter<T, V> twoWayConverter, T t, T t2, V v) {
        V v2;
        this.animationSpec = vectorizedAnimationSpec;
        this.typeConverter = twoWayConverter;
        this.mutableTargetValue = t2;
        this.mutableInitialValue = t;
        this.getHighResolutionOutputSizeshNQ4ISI = getTypeConverter().getConvertToVector().invoke(t);
        this.getHighSpeedVideoFpsRanges = getTypeConverter().getConvertToVector().invoke(t2);
        this.getHighSpeedVideoFpsRangesFor = (v == null || (v2 = (V) androidx.compose.animation.core.AnimationVectorsKt.copy(v)) == null) ? (V) androidx.compose.animation.core.AnimationVectorsKt.newInstance(getTypeConverter().getConvertToVector().invoke(t)) : v2;
        this.getHighSpeedVideoSizes = -1L;
    }

    public /* synthetic */ TargetBasedAnimation(androidx.compose.animation.core.VectorizedAnimationSpec vectorizedAnimationSpec, androidx.compose.animation.core.TwoWayConverter twoWayConverter, java.lang.Object obj, java.lang.Object obj2, androidx.compose.animation.core.AnimationVector animationVector, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((androidx.compose.animation.core.VectorizedAnimationSpec<androidx.compose.animation.core.AnimationVector>) vectorizedAnimationSpec, (androidx.compose.animation.core.TwoWayConverter<java.lang.Object, androidx.compose.animation.core.AnimationVector>) twoWayConverter, obj, obj2, (i & 16) != 0 ? null : animationVector);
    }

    public final androidx.compose.animation.core.VectorizedAnimationSpec<V> getAnimationSpec$animation_core() {
        return this.animationSpec;
    }

    @Override // androidx.compose.animation.core.Animation
    public final androidx.compose.animation.core.TwoWayConverter<T, V> getTypeConverter() {
        return this.typeConverter;
    }

    public final T getMutableTargetValue$animation_core() {
        return this.mutableTargetValue;
    }

    public final void setMutableTargetValue$animation_core(T t) {
        if (kotlin.jvm.internal.Intrinsics.areEqual(this.mutableTargetValue, t)) {
            return;
        }
        this.mutableTargetValue = t;
        this.getHighSpeedVideoFpsRanges = getTypeConverter().getConvertToVector().invoke(t);
        this.Camera2StreamConfigurationMap = null;
        this.getHighSpeedVideoSizes = -1L;
    }

    public final T getMutableInitialValue$animation_core() {
        return this.mutableInitialValue;
    }

    public final void setMutableInitialValue$animation_core(T t) {
        if (kotlin.jvm.internal.Intrinsics.areEqual(t, this.mutableInitialValue)) {
            return;
        }
        this.mutableInitialValue = t;
        this.getHighResolutionOutputSizeshNQ4ISI = getTypeConverter().getConvertToVector().invoke(t);
        this.Camera2StreamConfigurationMap = null;
        this.getHighSpeedVideoSizes = -1L;
    }

    public final T getInitialValue() {
        return this.mutableInitialValue;
    }

    @Override // androidx.compose.animation.core.Animation
    public final T getTargetValue() {
        return this.mutableTargetValue;
    }

    public /* synthetic */ TargetBasedAnimation(androidx.compose.animation.core.AnimationSpec animationSpec, androidx.compose.animation.core.TwoWayConverter twoWayConverter, java.lang.Object obj, java.lang.Object obj2, androidx.compose.animation.core.AnimationVector animationVector, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((androidx.compose.animation.core.AnimationSpec<java.lang.Object>) animationSpec, (androidx.compose.animation.core.TwoWayConverter<java.lang.Object, androidx.compose.animation.core.AnimationVector>) twoWayConverter, obj, obj2, (i & 16) != 0 ? null : animationVector);
    }

    public TargetBasedAnimation(androidx.compose.animation.core.AnimationSpec<T> animationSpec, androidx.compose.animation.core.TwoWayConverter<T, V> twoWayConverter, T t, T t2, V v) {
        this(animationSpec.vectorize(twoWayConverter), twoWayConverter, t, t2, v);
    }

    @Override // androidx.compose.animation.core.Animation
    /* renamed from: isInfinite */
    public final boolean getIsInfinite() {
        return this.animationSpec.isInfinite();
    }

    @Override // androidx.compose.animation.core.Animation
    public final T getValueFromNanos(long playTimeNanos) {
        if (!isFinishedFromNanos(playTimeNanos)) {
            V valueFromNanos = this.animationSpec.getValueFromNanos(playTimeNanos, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor);
            int size = valueFromNanos.getSize();
            for (int i = 0; i < size; i++) {
                if (java.lang.Float.isNaN(valueFromNanos.get$animation_core(i))) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("AnimationVector cannot contain a NaN. ");
                    sb.append(valueFromNanos);
                    sb.append(". Animation: ");
                    sb.append(this);
                    sb.append(", playTimeNanos: ");
                    sb.append(playTimeNanos);
                    androidx.compose.animation.core.PreconditionsKt.throwIllegalStateException(sb.toString());
                }
            }
            return getTypeConverter().getConvertFromVector().invoke(valueFromNanos);
        }
        return getTargetValue();
    }

    @Override // androidx.compose.animation.core.Animation
    public final long getDurationNanos() {
        if (this.getHighSpeedVideoSizes < 0) {
            this.getHighSpeedVideoSizes = this.animationSpec.getDurationNanos(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor);
        }
        return this.getHighSpeedVideoSizes;
    }

    private final V getHighSpeedVideoFpsRangesFor() {
        V v = this.Camera2StreamConfigurationMap;
        if (v != null) {
            return v;
        }
        V endVelocity = this.animationSpec.getEndVelocity(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor);
        this.Camera2StreamConfigurationMap = endVelocity;
        return endVelocity;
    }

    @Override // androidx.compose.animation.core.Animation
    public final V getVelocityVectorFromNanos(long playTimeNanos) {
        if (!isFinishedFromNanos(playTimeNanos)) {
            return this.animationSpec.getVelocityFromNanos(playTimeNanos, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor);
        }
        return getHighSpeedVideoFpsRangesFor();
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TargetBasedAnimation: ");
        sb.append(getInitialValue());
        sb.append(" -> ");
        sb.append(getTargetValue());
        sb.append(",initial velocity: ");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append(", duration: ");
        sb.append(androidx.compose.animation.core.AnimationKt.getDurationMillis(this));
        sb.append(" ms,animationSpec: ");
        sb.append(this.animationSpec);
        return sb.toString();
    }
}
