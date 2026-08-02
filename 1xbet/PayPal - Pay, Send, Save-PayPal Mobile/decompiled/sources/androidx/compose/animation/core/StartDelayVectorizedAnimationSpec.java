package androidx.compose.animation.core;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\n\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\n\u0010\u000bJ/\u0010\r\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0004\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0011\u0010\u001b\u001a\u00020\u00058\u0006¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u00148WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d"}, d2 = {"Landroidx/compose/animation/core/StartDelayVectorizedAnimationSpec;", "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/animation/core/VectorizedAnimationSpec;", "p0", "", "p1", "<init>", "(Landroidx/compose/animation/core/VectorizedAnimationSpec;J)V", "p2", "getDurationNanos", "(Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)J", "p3", "getVelocityFromNanos", "(JLandroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)Landroidx/compose/animation/core/AnimationVector;", "getValueFromNanos", "", "hashCode", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "Camera2StreamConfigurationMap", "Landroidx/compose/animation/core/VectorizedAnimationSpec;", "getHighSpeedVideoSizes", "J", "getHighSpeedVideoFpsRangesFor", "isInfinite", "()Z", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class StartDelayVectorizedAnimationSpec<V extends androidx.compose.animation.core.AnimationVector> implements androidx.compose.animation.core.VectorizedAnimationSpec<V> {
    private final androidx.compose.animation.core.VectorizedAnimationSpec<V> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final long getHighSpeedVideoFpsRangesFor;

    public StartDelayVectorizedAnimationSpec(androidx.compose.animation.core.VectorizedAnimationSpec<V> vectorizedAnimationSpec, long j) {
        this.Camera2StreamConfigurationMap = vectorizedAnimationSpec;
        this.getHighSpeedVideoFpsRangesFor = j;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public final boolean isInfinite() {
        return this.Camera2StreamConfigurationMap.isInfinite();
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public final long getDurationNanos(V p0, V p1, V p2) {
        return this.Camera2StreamConfigurationMap.getDurationNanos(p0, p1, p2) + this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public final V getVelocityFromNanos(long p0, V p1, V p2, V p3) {
        long j = this.getHighSpeedVideoFpsRangesFor;
        return p0 < j ? p3 : this.Camera2StreamConfigurationMap.getVelocityFromNanos(p0 - j, p1, p2, p3);
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public final V getValueFromNanos(long p0, V p1, V p2, V p3) {
        long j = this.getHighSpeedVideoFpsRangesFor;
        return p0 < j ? p1 : this.Camera2StreamConfigurationMap.getValueFromNanos(p0 - j, p1, p2, p3);
    }

    public final int hashCode() {
        return (this.Camera2StreamConfigurationMap.hashCode() * 31) + java.lang.Long.hashCode(this.getHighSpeedVideoFpsRangesFor);
    }

    public final boolean equals(java.lang.Object p0) {
        if (!(p0 instanceof androidx.compose.animation.core.StartDelayVectorizedAnimationSpec)) {
            return false;
        }
        androidx.compose.animation.core.StartDelayVectorizedAnimationSpec startDelayVectorizedAnimationSpec = (androidx.compose.animation.core.StartDelayVectorizedAnimationSpec) p0;
        return startDelayVectorizedAnimationSpec.getHighSpeedVideoFpsRangesFor == this.getHighSpeedVideoFpsRangesFor && kotlin.jvm.internal.Intrinsics.areEqual(startDelayVectorizedAnimationSpec.Camera2StreamConfigurationMap, this.Camera2StreamConfigurationMap);
    }
}
