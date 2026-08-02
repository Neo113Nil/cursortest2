package androidx.compose.foundation.gestures.snapping;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0004B#\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006H\u0086\u0002¢\u0006\u0004\b\f\u0010\rR\u0011\u0010\u000f\u001a\u00028\u00008\u0006¢\u0006\u0006\n\u0004\b\f\u0010\u000eR#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00068\u0007¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000f\u0010\r"}, d2 = {"Landroidx/compose/foundation/gestures/snapping/AnimationResult;", "T", "Landroidx/compose/animation/core/AnimationVector;", "V", "", "p0", "Landroidx/compose/animation/core/AnimationState;", "p1", "<init>", "(Ljava/lang/Object;Landroidx/compose/animation/core/AnimationState;)V", "getHighResolutionOutputSizeshNQ4ISI", "()Ljava/lang/Object;", "getHighSpeedVideoSizes", "()Landroidx/compose/animation/core/AnimationState;", "Ljava/lang/Object;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRanges", "Landroidx/compose/animation/core/AnimationState;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class AnimationResult<T, V extends androidx.compose.animation.core.AnimationVector> {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.compose.animation.core.AnimationState<T, V> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final T Camera2StreamConfigurationMap;

    public AnimationResult(T t, androidx.compose.animation.core.AnimationState<T, V> animationState) {
        this.Camera2StreamConfigurationMap = t;
        this.getHighSpeedVideoSizes = animationState;
    }

    public final androidx.compose.animation.core.AnimationState<T, V> Camera2StreamConfigurationMap() {
        return this.getHighSpeedVideoSizes;
    }

    public final T getHighResolutionOutputSizeshNQ4ISI() {
        return this.Camera2StreamConfigurationMap;
    }

    public final androidx.compose.animation.core.AnimationState<T, V> getHighSpeedVideoSizes() {
        return this.getHighSpeedVideoSizes;
    }
}
