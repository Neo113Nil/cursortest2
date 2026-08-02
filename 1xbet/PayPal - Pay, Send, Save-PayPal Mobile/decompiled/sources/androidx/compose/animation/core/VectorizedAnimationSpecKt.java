package androidx.compose.animation.core;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a;\u0010\u0007\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001aC\u0010\r\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\f\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u001f\u0010\u0011\u001a\u00020\u0006*\u0006\u0012\u0002\b\u00030\u000f2\u0006\u0010\u0010\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a3\u0010\u0018\u001a\u00020\u0017\"\b\b\u0000\u0010\u0001*\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0018\u0010\u0019\"\u0014\u0010\u0018\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c\"\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f\"\u0014\u0010\u001b\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\""}, d2 = {"Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/animation/core/VectorizedAnimationSpec;", "initialValue", "targetValue", "initialVelocity", "", "getDurationMillis", "(Landroidx/compose/animation/core/VectorizedAnimationSpec;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)J", "playTimeMillis", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "end", "startVelocity", "getValueFromMillis", "(Landroidx/compose/animation/core/VectorizedAnimationSpec;JLandroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)Landroidx/compose/animation/core/AnimationVector;", "Landroidx/compose/animation/core/VectorizedDurationBasedAnimationSpec;", "playTime", "clampPlayTime", "(Landroidx/compose/animation/core/VectorizedDurationBasedAnimationSpec;J)J", "p0", "", "p1", "p2", "Landroidx/compose/animation/core/Animations;", "getHighSpeedVideoSizes", "(Landroidx/compose/animation/core/AnimationVector;FF)Landroidx/compose/animation/core/Animations;", "", "getHighSpeedVideoFpsRangesFor", "[I", "", "getHighSpeedVideoFpsRanges", "[F", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/animation/core/ArcSpline;", "Landroidx/compose/animation/core/ArcSpline;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class VectorizedAnimationSpecKt {
    private static final int[] getHighSpeedVideoFpsRangesFor = new int[0];
    private static final float[] getHighSpeedVideoFpsRanges = new float[0];
    private static final androidx.compose.animation.core.ArcSpline getHighResolutionOutputSizeshNQ4ISI = new androidx.compose.animation.core.ArcSpline(new int[2], new float[2], new float[][]{new float[2], new float[2]});

    public static final <V extends androidx.compose.animation.core.AnimationVector> long getDurationMillis(androidx.compose.animation.core.VectorizedAnimationSpec<V> vectorizedAnimationSpec, V v, V v2, V v3) {
        return vectorizedAnimationSpec.getDurationNanos(v, v2, v3) / 1000000;
    }

    public static final <V extends androidx.compose.animation.core.AnimationVector> V getValueFromMillis(androidx.compose.animation.core.VectorizedAnimationSpec<V> vectorizedAnimationSpec, long j, V v, V v2, V v3) {
        return vectorizedAnimationSpec.getValueFromNanos(j * 1000000, v, v2, v3);
    }

    public static final long clampPlayTime(androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec<?> vectorizedDurationBasedAnimationSpec, long j) {
        long delayMillis = j - vectorizedDurationBasedAnimationSpec.getDelayMillis();
        long durationMillis = vectorizedDurationBasedAnimationSpec.getDurationMillis();
        if (delayMillis < 0) {
            delayMillis = 0;
        }
        return delayMillis > durationMillis ? durationMillis : delayMillis;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <V extends androidx.compose.animation.core.AnimationVector> androidx.compose.animation.core.Animations getHighSpeedVideoSizes(final V v, final float f, final float f2) {
        if (v != null) {
            return new androidx.compose.animation.core.Animations(v, f, f2) { // from class: androidx.compose.animation.core.VectorizedAnimationSpecKt$createSpringAnimations$1

                /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
                private final androidx.compose.animation.core.FloatSpringSpec[] Camera2StreamConfigurationMap;

                /* JADX WARN: Incorrect types in method signature: (TV;FF)V */
                {
                    int size = v.getSize();
                    androidx.compose.animation.core.FloatSpringSpec[] floatSpringSpecArr = new androidx.compose.animation.core.FloatSpringSpec[size];
                    for (int i = 0; i < size; i++) {
                        floatSpringSpecArr[i] = new androidx.compose.animation.core.FloatSpringSpec(f, f2, v.get$animation_core(i));
                    }
                    this.Camera2StreamConfigurationMap = floatSpringSpecArr;
                }

                @Override // androidx.compose.animation.core.Animations
                public final androidx.compose.animation.core.FloatSpringSpec get(int index) {
                    return this.Camera2StreamConfigurationMap[index];
                }
            };
        }
        return new androidx.compose.animation.core.Animations(f, f2) { // from class: androidx.compose.animation.core.VectorizedAnimationSpecKt$createSpringAnimations$2
            private final androidx.compose.animation.core.FloatSpringSpec Camera2StreamConfigurationMap;

            {
                this.Camera2StreamConfigurationMap = new androidx.compose.animation.core.FloatSpringSpec(f, f2, 0.0f, 4, null);
            }

            @Override // androidx.compose.animation.core.Animations
            public final androidx.compose.animation.core.FloatSpringSpec get(int index) {
                return this.Camera2StreamConfigurationMap;
            }
        };
    }
}
