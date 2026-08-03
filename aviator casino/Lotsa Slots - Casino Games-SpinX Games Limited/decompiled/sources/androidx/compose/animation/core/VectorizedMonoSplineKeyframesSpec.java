package androidx.compose.animation.core;

/* compiled from: VectorizedMonoSplineKeyframesSpec.kt */
@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B-\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0002\u0010\u000bJ-\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001cJ-\u0010\u001d\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001cJ%\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0019\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010 R\u0014\u0010\n\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u00028\u0000X\u0082.¢\u0006\u0004\n\u0002\u0010\u0010R\u0010\u0010\u0011\u001a\u00028\u0000X\u0082.¢\u0006\u0004\n\u0002\u0010\u0010R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u00028\u0000X\u0082.¢\u0006\u0004\n\u0002\u0010\u0010R\u0010\u0010\u0015\u001a\u00028\u0000X\u0082.¢\u0006\u0004\n\u0002\u0010\u0010¨\u0006!"}, d2 = {"Landroidx/compose/animation/core/VectorizedMonoSplineKeyframesSpec;", androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroidx/compose/animation/core/AnimationVector;", "Landroidx/compose/animation/core/VectorizedDurationBasedAnimationSpec;", "timestamps", "Landroidx/collection/IntList;", "keyframes", "Landroidx/collection/IntObjectMap;", "durationMillis", "", "delayMillis", "(Landroidx/collection/IntList;Landroidx/collection/IntObjectMap;II)V", "getDelayMillis", "()I", "getDurationMillis", "lastInitialValue", "Landroidx/compose/animation/core/AnimationVector;", "lastTargetValue", "monoSpline", "Landroidx/compose/animation/core/MonoSpline;", "valueVector", "velocityVector", "getValueFromNanos", "playTimeNanos", "", "initialValue", "targetValue", "initialVelocity", "(JLandroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)Landroidx/compose/animation/core/AnimationVector;", "getVelocityFromNanos", com.ironsource.X3.a.f, "", "(Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)V", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class VectorizedMonoSplineKeyframesSpec<V extends androidx.compose.animation.core.AnimationVector> implements androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec<V> {
    public static final int $stable = 8;
    private final int delayMillis;
    private final int durationMillis;
    private final androidx.collection.IntObjectMap<V> keyframes;
    private V lastInitialValue;
    private V lastTargetValue;
    private androidx.compose.animation.core.MonoSpline monoSpline;
    private final androidx.collection.IntList timestamps;
    private V valueVector;
    private V velocityVector;

    @Override // androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec, androidx.compose.animation.core.VectorizedAnimationSpec
    public /* synthetic */ long getDurationNanos(androidx.compose.animation.core.AnimationVector animationVector, androidx.compose.animation.core.AnimationVector animationVector2, androidx.compose.animation.core.AnimationVector animationVector3) {
        return androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec.CC.$default$getDurationNanos(this, animationVector, animationVector2, animationVector3);
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public /* synthetic */ androidx.compose.animation.core.AnimationVector getEndVelocity(androidx.compose.animation.core.AnimationVector animationVector, androidx.compose.animation.core.AnimationVector animationVector2, androidx.compose.animation.core.AnimationVector animationVector3) {
        return androidx.compose.animation.core.VectorizedAnimationSpec.CC.$default$getEndVelocity(this, animationVector, animationVector2, animationVector3);
    }

    @Override // androidx.compose.animation.core.VectorizedFiniteAnimationSpec, androidx.compose.animation.core.VectorizedAnimationSpec
    public /* synthetic */ boolean isInfinite() {
        return androidx.compose.animation.core.VectorizedFiniteAnimationSpec.CC.$default$isInfinite(this);
    }

    public VectorizedMonoSplineKeyframesSpec(androidx.collection.IntList intList, androidx.collection.IntObjectMap<V> intObjectMap, int i, int i2) {
        this.timestamps = intList;
        this.keyframes = intObjectMap;
        this.durationMillis = i;
        this.delayMillis = i2;
    }

    public /* synthetic */ VectorizedMonoSplineKeyframesSpec(androidx.collection.IntList intList, androidx.collection.IntObjectMap intObjectMap, int i, int i2, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(intList, intObjectMap, i, (i3 & 8) != 0 ? 0 : i2);
    }

    @Override // androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec
    public int getDurationMillis() {
        return this.durationMillis;
    }

    @Override // androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec
    public int getDelayMillis() {
        return this.delayMillis;
    }

    private final void init(V initialValue, V targetValue, V initialVelocity) {
        if (this.valueVector == null) {
            this.valueVector = (V) androidx.compose.animation.core.AnimationVectorsKt.newInstance(initialValue);
            this.velocityVector = (V) androidx.compose.animation.core.AnimationVectorsKt.newInstance(initialVelocity);
        }
        if (this.monoSpline != null) {
            V v = this.lastInitialValue;
            V v2 = null;
            if (v == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("lastInitialValue");
                v = null;
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(v, initialValue)) {
                V v3 = this.lastTargetValue;
                if (v3 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("lastTargetValue");
                } else {
                    v2 = v3;
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(v2, targetValue)) {
                    return;
                }
            }
        }
        this.lastInitialValue = initialValue;
        this.lastTargetValue = targetValue;
        int i = this.keyframes.get_size();
        int i2 = i + 2;
        float[] fArr = new float[i2];
        java.util.ArrayList arrayList = new java.util.ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            arrayList.add(new float[initialValue.getSize()]);
        }
        java.util.ArrayList arrayList2 = arrayList;
        fArr[0] = 0.0f;
        int i4 = i + 1;
        float f = 1000L;
        fArr[i4] = getDurationMillis() / f;
        float[] fArr2 = (float[]) arrayList2.get(0);
        float[] fArr3 = (float[]) arrayList2.get(i4);
        int size = initialValue.getSize();
        for (int i5 = 0; i5 < size; i5++) {
            fArr2[i5] = initialValue.get$animation_core_release(i5);
            fArr3[i5] = targetValue.get$animation_core_release(i5);
        }
        androidx.collection.IntList intList = this.timestamps;
        int[] iArr = intList.content;
        int i6 = intList._size;
        int i7 = 0;
        while (i7 < i6) {
            int i8 = iArr[i7];
            V v4 = this.keyframes.get(i8);
            kotlin.jvm.internal.Intrinsics.checkNotNull(v4);
            V v5 = v4;
            i7++;
            fArr[i7] = i8 / f;
            float[] fArr4 = (float[]) arrayList2.get(i7);
            int length = fArr4.length;
            for (int i9 = 0; i9 < length; i9++) {
                fArr4[i9] = v5.get$animation_core_release(i9);
            }
        }
        this.monoSpline = new androidx.compose.animation.core.MonoSpline(fArr, arrayList2);
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public V getValueFromNanos(long playTimeNanos, V initialValue, V targetValue, V initialVelocity) {
        int clampPlayTime = (int) androidx.compose.animation.core.VectorizedAnimationSpecKt.clampPlayTime(this, playTimeNanos / 1000000);
        if (this.keyframes.containsKey(clampPlayTime)) {
            V v = this.keyframes.get(clampPlayTime);
            kotlin.jvm.internal.Intrinsics.checkNotNull(v);
            return v;
        }
        if (clampPlayTime >= getDurationMillis()) {
            return targetValue;
        }
        if (clampPlayTime <= 0) {
            return initialValue;
        }
        init(initialValue, targetValue, initialVelocity);
        androidx.compose.animation.core.MonoSpline monoSpline = this.monoSpline;
        if (monoSpline == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("monoSpline");
            monoSpline = null;
        }
        float f = clampPlayTime / 1000;
        V v2 = this.valueVector;
        if (v2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("valueVector");
            v2 = null;
        }
        monoSpline.getPos(f, v2);
        V v3 = this.valueVector;
        if (v3 != null) {
            return v3;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("valueVector");
        return null;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public V getVelocityFromNanos(long playTimeNanos, V initialValue, V targetValue, V initialVelocity) {
        long clampPlayTime = androidx.compose.animation.core.VectorizedAnimationSpecKt.clampPlayTime(this, playTimeNanos / 1000000);
        if (clampPlayTime < 0) {
            return initialVelocity;
        }
        init(initialValue, targetValue, initialVelocity);
        androidx.compose.animation.core.MonoSpline monoSpline = this.monoSpline;
        if (monoSpline == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("monoSpline");
            monoSpline = null;
        }
        float f = clampPlayTime / 1000;
        V v = this.velocityVector;
        if (v == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("velocityVector");
            v = null;
        }
        monoSpline.getSlope(f, v);
        V v2 = this.velocityVector;
        if (v2 != null) {
            return v2;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("velocityVector");
        return null;
    }
}
