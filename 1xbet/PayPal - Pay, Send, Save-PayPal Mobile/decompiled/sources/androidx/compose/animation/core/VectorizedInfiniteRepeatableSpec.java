package androidx.compose.animation.core;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B)\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB!\b\u0017\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\fJ\u0017\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00028\u00002\u0006\u0010\u0019\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001a\u0010\u0015J/\u0010\u001b\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00028\u00002\u0006\u0010\u0019\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001b\u0010\u0015J'\u0010\u001c\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00028\u00002\u0006\u0010\u0019\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001eR\u0014\u0010\u0014\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u001a\u0010$\u001a\u00020\r8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0014\u0010\u001f\u001a\u00020\r8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b(\u0010%"}, d2 = {"Landroidx/compose/animation/core/VectorizedInfiniteRepeatableSpec;", "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/animation/core/VectorizedAnimationSpec;", "Landroidx/compose/animation/core/VectorizedDurationBasedAnimationSpec;", "animation", "Landroidx/compose/animation/core/RepeatMode;", "repeatMode", "Landroidx/compose/animation/core/StartOffset;", "initialStartOffset", "<init>", "(Landroidx/compose/animation/core/VectorizedDurationBasedAnimationSpec;Landroidx/compose/animation/core/RepeatMode;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "(Landroidx/compose/animation/core/VectorizedDurationBasedAnimationSpec;Landroidx/compose/animation/core/RepeatMode;)V", "", "p0", "getHighSpeedVideoFpsRangesFor", "(J)J", "p1", "p2", "p3", "getHighSpeedVideoFpsRanges", "(JLandroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)Landroidx/compose/animation/core/AnimationVector;", "playTimeNanos", "initialValue", "targetValue", "initialVelocity", "getValueFromNanos", "getVelocityFromNanos", "getDurationNanos", "(Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)J", "Landroidx/compose/animation/core/VectorizedDurationBasedAnimationSpec;", "Camera2StreamConfigurationMap", "Landroidx/compose/animation/core/RepeatMode;", "", "isInfinite", "()Z", "durationNanos", "J", "getDurationNanos$animation_core", "()J", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class VectorizedInfiniteRepeatableSpec<V extends androidx.compose.animation.core.AnimationVector> implements androidx.compose.animation.core.VectorizedAnimationSpec<V> {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.compose.animation.core.RepeatMode getHighSpeedVideoFpsRanges;
    private final long durationNanos;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec<V> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final long Camera2StreamConfigurationMap;

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public final long getDurationNanos(V initialValue, V targetValue, V initialVelocity) {
        return Long.MAX_VALUE;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public final boolean isInfinite() {
        return true;
    }

    private VectorizedInfiniteRepeatableSpec(androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec<V> vectorizedDurationBasedAnimationSpec, androidx.compose.animation.core.RepeatMode repeatMode, long j) {
        this.getHighSpeedVideoFpsRangesFor = vectorizedDurationBasedAnimationSpec;
        this.getHighSpeedVideoFpsRanges = repeatMode;
        this.durationNanos = (vectorizedDurationBasedAnimationSpec.getDelayMillis() + vectorizedDurationBasedAnimationSpec.getDurationMillis()) * 1000000;
        this.Camera2StreamConfigurationMap = j * 1000000;
    }

    public /* synthetic */ VectorizedInfiniteRepeatableSpec(androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec vectorizedDurationBasedAnimationSpec, androidx.compose.animation.core.RepeatMode repeatMode, long j, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(vectorizedDurationBasedAnimationSpec, (i & 2) != 0 ? androidx.compose.animation.core.RepeatMode.Restart : repeatMode, (i & 4) != 0 ? androidx.compose.animation.core.StartOffset.m1219constructorimpl$default(0, 0, 2, null) : j, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    public /* synthetic */ VectorizedInfiniteRepeatableSpec(androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec vectorizedDurationBasedAnimationSpec, androidx.compose.animation.core.RepeatMode repeatMode, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(vectorizedDurationBasedAnimationSpec, (i & 2) != 0 ? androidx.compose.animation.core.RepeatMode.Restart : repeatMode);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This method has been deprecated in favor of the constructor that accepts start offset.")
    public /* synthetic */ VectorizedInfiniteRepeatableSpec(androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec vectorizedDurationBasedAnimationSpec, androidx.compose.animation.core.RepeatMode repeatMode) {
        this(vectorizedDurationBasedAnimationSpec, repeatMode, androidx.compose.animation.core.StartOffset.m1219constructorimpl$default(0, 0, 2, null), (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    /* renamed from: getDurationNanos$animation_core, reason: from getter */
    public final long getDurationNanos() {
        return this.durationNanos;
    }

    private final long getHighSpeedVideoFpsRangesFor(long p0) {
        long j = p0 + this.Camera2StreamConfigurationMap;
        if (j <= 0) {
            return 0L;
        }
        long j2 = j / this.durationNanos;
        if (this.getHighSpeedVideoFpsRanges == androidx.compose.animation.core.RepeatMode.Restart || j2 % 2 == 0) {
            return j - (j2 * this.durationNanos);
        }
        return ((j2 + 1) * this.durationNanos) - j;
    }

    private final V getHighSpeedVideoFpsRanges(long p0, V p1, V p2, V p3) {
        long j = this.Camera2StreamConfigurationMap;
        long j2 = this.durationNanos;
        return p0 + j > j2 ? this.getHighSpeedVideoFpsRangesFor.getVelocityFromNanos(j2 - j, p1, p3, p2) : p2;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public final V getValueFromNanos(long playTimeNanos, V initialValue, V targetValue, V initialVelocity) {
        return this.getHighSpeedVideoFpsRangesFor.getValueFromNanos(getHighSpeedVideoFpsRangesFor(playTimeNanos), initialValue, targetValue, getHighSpeedVideoFpsRanges(playTimeNanos, initialValue, initialVelocity, targetValue));
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public final V getVelocityFromNanos(long playTimeNanos, V initialValue, V targetValue, V initialVelocity) {
        return this.getHighSpeedVideoFpsRangesFor.getVelocityFromNanos(getHighSpeedVideoFpsRangesFor(playTimeNanos), initialValue, targetValue, getHighSpeedVideoFpsRanges(playTimeNanos, initialValue, initialVelocity, targetValue));
    }

    public /* synthetic */ VectorizedInfiniteRepeatableSpec(androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec vectorizedDurationBasedAnimationSpec, androidx.compose.animation.core.RepeatMode repeatMode, long j, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(vectorizedDurationBasedAnimationSpec, repeatMode, j);
    }
}
