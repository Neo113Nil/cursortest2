package androidx.compose.animation.core;

@kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0019\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003BA\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0018\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u00070\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J/\u0010\u001c\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ/\u0010\u001e\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001e\u0010\u001dJ\u0017\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0015\u0010\u001fJ\u001f\u0010 \u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\nH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010 \u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\nH\u0002¢\u0006\u0004\b \u0010\"R\u0014\u0010%\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R&\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001a\u0010\u000b\u001a\u00020\n8\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010'\u001a\u0004\b(\u0010)R\u001a\u0010\f\u001a\u00020\n8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\f\u0010'\u001a\u0004\b*\u0010)R\u0014\u0010,\u001a\u00020\r8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b \u0010+R\u0018\u0010/\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u0010 \u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b0\u0010.R\u0016\u0010#\u001a\u0002018\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u0010-\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0015\u00105R\u001e\u00102\u001a\n\u0012\u0004\u0012\u000201\u0018\u0001068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0018\u00100\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b/\u0010.R\u0018\u00107\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b,\u0010."}, d2 = {"Landroidx/compose/animation/core/VectorizedMonoSplineKeyframesSpec;", "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/animation/core/VectorizedDurationBasedAnimationSpec;", "Landroidx/collection/IntList;", "timestamps", "Landroidx/collection/IntObjectMap;", "Lkotlin/Pair;", "Landroidx/compose/animation/core/Easing;", "keyframes", "", "durationMillis", "delayMillis", "", "periodicBias", "<init>", "(Landroidx/collection/IntList;Landroidx/collection/IntObjectMap;IIF)V", "p0", "p1", "p2", "", "getHighSpeedVideoFpsRangesFor", "(Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)V", "", "playTimeNanos", "initialValue", "targetValue", "initialVelocity", "getValueFromNanos", "(JLandroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)Landroidx/compose/animation/core/AnimationVector;", "getVelocityFromNanos", "(I)Landroidx/compose/animation/core/Easing;", "Camera2StreamConfigurationMap", "(II)F", "(I)I", "getInputSizeshNQ4ISI", "Landroidx/collection/IntList;", "getHighSpeedVideoSizes", "Landroidx/collection/IntObjectMap;", com.visa.cbp.getEncExpo.warmup, "getDurationMillis", "()I", "getDelayMillis", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getHighSpeedVideoFpsRanges", "getOutputMinFrameDuration", "Landroidx/compose/animation/core/AnimationVector;", "getHighResolutionOutputSizeshNQ4ISI", "getOutputFormats", "", "getHighSpeedVideoSizesFor", "[F", "Landroidx/compose/animation/core/MonoSpline;", "Landroidx/compose/animation/core/MonoSpline;", "", "getInputFormats", "[[F"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class VectorizedMonoSplineKeyframesSpec<V extends androidx.compose.animation.core.AnimationVector> implements androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec<V> {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final float getHighSpeedVideoFpsRanges;
    private final int delayMillis;
    private final int durationMillis;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private V getOutputFormats;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private V getInputFormats;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private androidx.compose.animation.core.MonoSpline getOutputMinFrameDuration;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.collection.IntObjectMap<kotlin.Pair<V, androidx.compose.animation.core.Easing>> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private float[] getInputSizeshNQ4ISI;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private float[][] getHighSpeedVideoSizesFor;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.collection.IntList getHighSpeedVideoSizes;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private V Camera2StreamConfigurationMap;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private V getHighResolutionOutputSizeshNQ4ISI;

    public VectorizedMonoSplineKeyframesSpec(androidx.collection.IntList intList, androidx.collection.IntObjectMap<kotlin.Pair<V, androidx.compose.animation.core.Easing>> intObjectMap, int i, int i2, float f) {
        this.getHighSpeedVideoSizes = intList;
        this.getHighSpeedVideoFpsRangesFor = intObjectMap;
        this.durationMillis = i;
        this.delayMillis = i2;
        this.getHighSpeedVideoFpsRanges = f;
    }

    @Override // androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec
    public final int getDurationMillis() {
        return this.durationMillis;
    }

    @Override // androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec
    public final int getDelayMillis() {
        return this.delayMillis;
    }

    private final void getHighSpeedVideoFpsRangesFor(V p0, V p1, V p2) {
        float[] fArr;
        if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
            this.getHighResolutionOutputSizeshNQ4ISI = (V) androidx.compose.animation.core.AnimationVectorsKt.newInstance(p0);
            this.Camera2StreamConfigurationMap = (V) androidx.compose.animation.core.AnimationVectorsKt.newInstance(p2);
            int i = this.getHighSpeedVideoSizes._size;
            float[] fArr2 = new float[i];
            for (int i2 = 0; i2 < i; i2++) {
                fArr2[i2] = this.getHighSpeedVideoSizes.get(i2) / 1000.0f;
            }
            this.getInputSizeshNQ4ISI = fArr2;
        }
        if (this.getOutputMinFrameDuration != null && kotlin.jvm.internal.Intrinsics.areEqual(this.getOutputFormats, p0) && kotlin.jvm.internal.Intrinsics.areEqual(this.getInputFormats, p1)) {
            return;
        }
        boolean areEqual = kotlin.jvm.internal.Intrinsics.areEqual(this.getOutputFormats, p0);
        boolean areEqual2 = kotlin.jvm.internal.Intrinsics.areEqual(this.getInputFormats, p1);
        this.getOutputFormats = p0;
        this.getInputFormats = p1;
        int size = p0.getSize();
        float[][] fArr3 = this.getHighSpeedVideoSizesFor;
        if (fArr3 == null) {
            int i3 = this.getHighSpeedVideoSizes._size;
            fArr3 = new float[i3][];
            for (int i4 = 0; i4 < i3; i4++) {
                int i5 = this.getHighSpeedVideoSizes.get(i4);
                kotlin.Pair<V, androidx.compose.animation.core.Easing> pair = this.getHighSpeedVideoFpsRangesFor.get(i5);
                if (i5 == 0 && pair == null) {
                    fArr = new float[size];
                    for (int i6 = 0; i6 < size; i6++) {
                        fArr[i6] = p0.get$animation_core(i6);
                    }
                } else if (i5 == getDurationMillis() && pair == null) {
                    fArr = new float[size];
                    for (int i7 = 0; i7 < size; i7++) {
                        fArr[i7] = p1.get$animation_core(i7);
                    }
                } else {
                    kotlin.jvm.internal.Intrinsics.checkNotNull(pair);
                    V first = pair.getFirst();
                    float[] fArr4 = new float[size];
                    for (int i8 = 0; i8 < size; i8++) {
                        fArr4[i8] = first.get$animation_core(i8);
                    }
                    fArr = fArr4;
                }
                fArr3[i4] = fArr;
            }
            this.getHighSpeedVideoSizesFor = fArr3;
        } else {
            if (!areEqual && !this.getHighSpeedVideoFpsRangesFor.containsKey(0)) {
                int binarySearch$default = androidx.collection.IntList.binarySearch$default(this.getHighSpeedVideoSizes, 0, 0, 0, 6, null);
                float[] fArr5 = new float[size];
                for (int i9 = 0; i9 < size; i9++) {
                    fArr5[i9] = p0.get$animation_core(i9);
                }
                fArr3[binarySearch$default] = fArr5;
            }
            if (!areEqual2 && !this.getHighSpeedVideoFpsRangesFor.containsKey(getDurationMillis())) {
                int binarySearch$default2 = androidx.collection.IntList.binarySearch$default(this.getHighSpeedVideoSizes, getDurationMillis(), 0, 0, 6, null);
                float[] fArr6 = new float[size];
                for (int i10 = 0; i10 < size; i10++) {
                    fArr6[i10] = p1.get$animation_core(i10);
                }
                fArr3[binarySearch$default2] = fArr6;
            }
        }
        float[] fArr7 = this.getInputSizeshNQ4ISI;
        if (fArr7 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            fArr7 = null;
        }
        this.getOutputMinFrameDuration = new androidx.compose.animation.core.MonoSpline(fArr7, fArr3, this.getHighSpeedVideoFpsRanges);
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public final V getValueFromNanos(long playTimeNanos, V initialValue, V targetValue, V initialVelocity) {
        int clampPlayTime = (int) androidx.compose.animation.core.VectorizedAnimationSpecKt.clampPlayTime(this, playTimeNanos / 1000000);
        kotlin.Pair<V, androidx.compose.animation.core.Easing> pair = this.getHighSpeedVideoFpsRangesFor.get(clampPlayTime);
        if (pair != null) {
            return pair.getFirst();
        }
        if (clampPlayTime >= getDurationMillis()) {
            return targetValue;
        }
        if (clampPlayTime <= 0) {
            return initialValue;
        }
        getHighSpeedVideoFpsRangesFor(initialValue, targetValue, initialVelocity);
        int Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(clampPlayTime);
        V v = this.getHighResolutionOutputSizeshNQ4ISI;
        kotlin.jvm.internal.Intrinsics.checkNotNull(v);
        androidx.compose.animation.core.MonoSpline monoSpline = this.getOutputMinFrameDuration;
        kotlin.jvm.internal.Intrinsics.checkNotNull(monoSpline);
        monoSpline.getPos(Camera2StreamConfigurationMap(Camera2StreamConfigurationMap, clampPlayTime), v, Camera2StreamConfigurationMap);
        return v;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public final V getVelocityFromNanos(long playTimeNanos, V initialValue, V targetValue, V initialVelocity) {
        int clampPlayTime = (int) androidx.compose.animation.core.VectorizedAnimationSpecKt.clampPlayTime(this, playTimeNanos / 1000000);
        getHighSpeedVideoFpsRangesFor(initialValue, targetValue, initialVelocity);
        int Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(clampPlayTime);
        V v = this.Camera2StreamConfigurationMap;
        kotlin.jvm.internal.Intrinsics.checkNotNull(v);
        androidx.compose.animation.core.MonoSpline monoSpline = this.getOutputMinFrameDuration;
        kotlin.jvm.internal.Intrinsics.checkNotNull(monoSpline);
        monoSpline.getSlope(Camera2StreamConfigurationMap(Camera2StreamConfigurationMap, clampPlayTime), v, Camera2StreamConfigurationMap);
        return v;
    }

    private final androidx.compose.animation.core.Easing getHighSpeedVideoFpsRangesFor(int p0) {
        androidx.compose.animation.core.Easing second;
        kotlin.Pair<V, androidx.compose.animation.core.Easing> pair = this.getHighSpeedVideoFpsRangesFor.get(this.getHighSpeedVideoSizes.get(p0));
        return (pair == null || (second = pair.getSecond()) == null) ? androidx.compose.animation.core.EasingKt.getLinearEasing() : second;
    }

    private final float Camera2StreamConfigurationMap(int p0, int p1) {
        float f;
        if (p0 >= this.getHighSpeedVideoSizes._size - 1) {
            f = p1;
        } else {
            int i = this.getHighSpeedVideoSizes.get(p0);
            int i2 = this.getHighSpeedVideoSizes.get(p0 + 1);
            if (p1 != i) {
                float f2 = i2 - i;
                return ((f2 * getHighSpeedVideoFpsRangesFor(p0).transform((p1 - i) / f2)) + i) / 1000.0f;
            }
            f = i;
        }
        return f / 1000.0f;
    }

    private final int Camera2StreamConfigurationMap(int p0) {
        int binarySearch$default = androidx.collection.IntList.binarySearch$default(this.getHighSpeedVideoSizes, p0, 0, 0, 6, null);
        return binarySearch$default < -1 ? -(binarySearch$default + 2) : binarySearch$default;
    }
}
