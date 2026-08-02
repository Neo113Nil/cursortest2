package androidx.compose.animation.core;

@kotlin.Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003BE\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011B;\b\u0016\u0012\u001e\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\f0\u00130\u0012\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0014J'\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ/\u0010 \u001a\u00028\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00028\u00002\u0006\u0010\u001e\u001a\u00028\u00002\u0006\u0010\u001f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b \u0010!J/\u0010\"\u001a\u00028\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00028\u00002\u0006\u0010\u001e\u001a\u00028\u00002\u0006\u0010\u001f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\"\u0010!J\u0017\u0010\u0019\u001a\u00020#2\u0006\u0010\u0015\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0019\u0010$J'\u0010&\u001a\u00020#2\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020%H\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\tH\u0002¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0019\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R \u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010,R\u001a\u0010\n\u001a\u00020\t8\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010-\u001a\u0004\b.\u0010/R\u001a\u0010\u000b\u001a\u00020\t8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u000b\u0010-\u001a\u0004\b0\u0010/R\u0014\u00102\u001a\u00020\f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b(\u00101R\u0014\u00103\u001a\u00020\u000e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b2\u0010-R\u0016\u0010&\u001a\u0002048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u00105\u001a\u0002078\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0018\u00108\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0018\u0010=\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b<\u0010;R\u0018\u0010>\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b3\u0010;R\u0018\u0010?\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b?\u0010;R\u0016\u0010*\u001a\u0002078\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b>\u00109R\u0016\u0010:\u001a\u0002078\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b=\u00109R\u0016\u0010<\u001a\u00020@8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010A"}, d2 = {"Landroidx/compose/animation/core/VectorizedKeyframesSpec;", "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/animation/core/VectorizedDurationBasedAnimationSpec;", "Landroidx/collection/IntList;", "timestamps", "Landroidx/collection/IntObjectMap;", "Landroidx/compose/animation/core/VectorizedKeyframeSpecElementInfo;", "keyframes", "", "durationMillis", "delayMillis", "Landroidx/compose/animation/core/Easing;", "defaultEasing", "Landroidx/compose/animation/core/ArcMode;", "initialArcMode", "<init>", "(Landroidx/collection/IntList;Landroidx/collection/IntObjectMap;IILandroidx/compose/animation/core/Easing;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "Lkotlin/Pair;", "(Ljava/util/Map;II)V", "p0", "p1", "p2", "", "getHighResolutionOutputSizeshNQ4ISI", "(Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)V", "", "playTimeNanos", "initialValue", "targetValue", "initialVelocity", "getValueFromNanos", "(JLandroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)Landroidx/compose/animation/core/AnimationVector;", "getVelocityFromNanos", "", "(I)F", "", "getHighSpeedVideoFpsRanges", "(IIZ)F", "getHighSpeedVideoSizes", "(I)I", "getOutputMinFrameDurationlomOqCM", "Landroidx/collection/IntList;", "Landroidx/collection/IntObjectMap;", com.visa.cbp.getEncExpo.warmup, "getDurationMillis", "()I", "getDelayMillis", "Landroidx/compose/animation/core/Easing;", "getHighSpeedVideoFpsRangesFor", "Camera2StreamConfigurationMap", "", "getInputSizeshNQ4ISI", "[I", "", "getOutputFormats", "[F", "getOutputStallDurationlomOqCM", "Landroidx/compose/animation/core/AnimationVector;", "getOutputSizes", "getHighSpeedVideoSizesFor", "getOutputMinFrameDuration", "getInputFormats", "Landroidx/compose/animation/core/ArcSpline;", "Landroidx/compose/animation/core/ArcSpline;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class VectorizedKeyframesSpec<V extends androidx.compose.animation.core.AnimationVector> implements androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec<V> {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private V getOutputMinFrameDuration;
    private final int delayMillis;
    private final int durationMillis;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private androidx.compose.animation.core.ArcSpline getOutputSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.collection.IntObjectMap<androidx.compose.animation.core.VectorizedKeyframeSpecElementInfo<V>> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final int Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.compose.animation.core.Easing getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private float[] getOutputStallDurationlomOqCM;
    private V getInputFormats;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private int[] getHighSpeedVideoFpsRanges;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private float[] getInputSizeshNQ4ISI;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private float[] getOutputMinFrameDurationlomOqCM;

    /* renamed from: getOutputMinFrameDurationlomOqCM, reason: from kotlin metadata */
    private final androidx.collection.IntList getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getOutputSizes, reason: from kotlin metadata */
    private V getHighSpeedVideoSizesFor;

    /* renamed from: getOutputStallDurationlomOqCM, reason: from kotlin metadata */
    private V getOutputFormats;

    private VectorizedKeyframesSpec(androidx.collection.IntList intList, androidx.collection.IntObjectMap<androidx.compose.animation.core.VectorizedKeyframeSpecElementInfo<V>> intObjectMap, int i, int i2, androidx.compose.animation.core.Easing easing, int i3) {
        int[] iArr;
        float[] fArr;
        float[] fArr2;
        float[] fArr3;
        androidx.compose.animation.core.ArcSpline arcSpline;
        this.getHighResolutionOutputSizeshNQ4ISI = intList;
        this.getHighSpeedVideoSizes = intObjectMap;
        this.durationMillis = i;
        this.delayMillis = i2;
        this.getHighSpeedVideoFpsRangesFor = easing;
        this.Camera2StreamConfigurationMap = i3;
        iArr = androidx.compose.animation.core.VectorizedAnimationSpecKt.getHighSpeedVideoFpsRangesFor;
        this.getHighSpeedVideoFpsRanges = iArr;
        fArr = androidx.compose.animation.core.VectorizedAnimationSpecKt.getHighSpeedVideoFpsRanges;
        this.getInputSizeshNQ4ISI = fArr;
        fArr2 = androidx.compose.animation.core.VectorizedAnimationSpecKt.getHighSpeedVideoFpsRanges;
        this.getOutputMinFrameDurationlomOqCM = fArr2;
        fArr3 = androidx.compose.animation.core.VectorizedAnimationSpecKt.getHighSpeedVideoFpsRanges;
        this.getOutputStallDurationlomOqCM = fArr3;
        arcSpline = androidx.compose.animation.core.VectorizedAnimationSpecKt.getHighResolutionOutputSizeshNQ4ISI;
        this.getOutputSizes = arcSpline;
    }

    @Override // androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec
    public final int getDurationMillis() {
        return this.durationMillis;
    }

    @Override // androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec
    public final int getDelayMillis() {
        return this.delayMillis;
    }

    public /* synthetic */ VectorizedKeyframesSpec(java.util.Map map, int i, int i2, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(map, i, (i3 & 4) != 0 ? 0 : i2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public VectorizedKeyframesSpec(java.util.Map<java.lang.Integer, ? extends kotlin.Pair<? extends V, ? extends androidx.compose.animation.core.Easing>> map, int i, int i2) {
        this(r4, r0, i, i2, androidx.compose.animation.core.EasingKt.getLinearEasing(), androidx.compose.animation.core.ArcMode.INSTANCE.m1197getArcLinear9TMq4(), null);
        androidx.collection.MutableIntList mutableIntList = new androidx.collection.MutableIntList(map.size() + 2);
        java.util.Iterator<java.util.Map.Entry<java.lang.Integer, ? extends kotlin.Pair<? extends V, ? extends androidx.compose.animation.core.Easing>>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            mutableIntList.add(it.next().getKey().intValue());
        }
        if (!map.containsKey(0)) {
            mutableIntList.add(0, 0);
        }
        if (!map.containsKey(java.lang.Integer.valueOf(i))) {
            mutableIntList.add(i);
        }
        mutableIntList.sort();
        androidx.collection.MutableIntList mutableIntList2 = mutableIntList;
        androidx.collection.MutableIntObjectMap mutableIntObjectMap = new androidx.collection.MutableIntObjectMap(0, 1, null);
        for (java.util.Map.Entry<java.lang.Integer, ? extends kotlin.Pair<? extends V, ? extends androidx.compose.animation.core.Easing>> entry : map.entrySet()) {
            int intValue = entry.getKey().intValue();
            kotlin.Pair<? extends V, ? extends androidx.compose.animation.core.Easing> value = entry.getValue();
            mutableIntObjectMap.set(intValue, new androidx.compose.animation.core.VectorizedKeyframeSpecElementInfo(value.getFirst(), value.getSecond(), androidx.compose.animation.core.ArcMode.INSTANCE.m1197getArcLinear9TMq4(), null));
        }
    }

    private final void getHighResolutionOutputSizeshNQ4ISI(V p0, V p1, V p2) {
        androidx.compose.animation.core.ArcSpline arcSpline;
        androidx.compose.animation.core.ArcSpline arcSpline2;
        float[] fArr;
        androidx.compose.animation.core.ArcSpline arcSpline3 = this.getOutputSizes;
        arcSpline = androidx.compose.animation.core.VectorizedAnimationSpecKt.getHighResolutionOutputSizeshNQ4ISI;
        boolean z = arcSpline3 != arcSpline;
        if (this.getOutputFormats == null) {
            this.getOutputFormats = (V) androidx.compose.animation.core.AnimationVectorsKt.newInstance(p0);
            this.getHighSpeedVideoSizesFor = (V) androidx.compose.animation.core.AnimationVectorsKt.newInstance(p2);
            int i = this.getHighResolutionOutputSizeshNQ4ISI._size;
            float[] fArr2 = new float[i];
            for (int i2 = 0; i2 < i; i2++) {
                fArr2[i2] = this.getHighResolutionOutputSizeshNQ4ISI.get(i2) / 1000.0f;
            }
            this.getInputSizeshNQ4ISI = fArr2;
            int i3 = this.getHighResolutionOutputSizeshNQ4ISI._size;
            int[] iArr = new int[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                androidx.compose.animation.core.VectorizedKeyframeSpecElementInfo<V> vectorizedKeyframeSpecElementInfo = this.getHighSpeedVideoSizes.get(this.getHighResolutionOutputSizeshNQ4ISI.get(i4));
                int m1255getArcMode9TMq4 = vectorizedKeyframeSpecElementInfo != null ? vectorizedKeyframeSpecElementInfo.m1255getArcMode9TMq4() : this.Camera2StreamConfigurationMap;
                if (!androidx.compose.animation.core.ArcMode.m1191equalsimpl0(m1255getArcMode9TMq4, androidx.compose.animation.core.ArcMode.INSTANCE.m1197getArcLinear9TMq4())) {
                    z = true;
                }
                iArr[i4] = m1255getArcMode9TMq4;
            }
            this.getHighSpeedVideoFpsRanges = iArr;
        }
        if (z) {
            androidx.compose.animation.core.ArcSpline arcSpline4 = this.getOutputSizes;
            arcSpline2 = androidx.compose.animation.core.VectorizedAnimationSpecKt.getHighResolutionOutputSizeshNQ4ISI;
            if (arcSpline4 != arcSpline2 && kotlin.jvm.internal.Intrinsics.areEqual(this.getOutputMinFrameDuration, p0) && kotlin.jvm.internal.Intrinsics.areEqual(this.getInputFormats, p1)) {
                return;
            }
            this.getOutputMinFrameDuration = p0;
            this.getInputFormats = p1;
            int size = (p0.getSize() % 2) + p0.getSize();
            this.getOutputMinFrameDurationlomOqCM = new float[size];
            this.getOutputStallDurationlomOqCM = new float[size];
            int i5 = this.getHighResolutionOutputSizeshNQ4ISI._size;
            float[][] fArr3 = new float[i5][];
            for (int i6 = 0; i6 < i5; i6++) {
                int i7 = this.getHighResolutionOutputSizeshNQ4ISI.get(i6);
                androidx.compose.animation.core.VectorizedKeyframeSpecElementInfo<V> vectorizedKeyframeSpecElementInfo2 = this.getHighSpeedVideoSizes.get(i7);
                if (i7 == 0 && vectorizedKeyframeSpecElementInfo2 == null) {
                    fArr = new float[size];
                    for (int i8 = 0; i8 < size; i8++) {
                        fArr[i8] = p0.get$animation_core(i8);
                    }
                } else if (i7 == getDurationMillis() && vectorizedKeyframeSpecElementInfo2 == null) {
                    fArr = new float[size];
                    for (int i9 = 0; i9 < size; i9++) {
                        fArr[i9] = p1.get$animation_core(i9);
                    }
                } else {
                    kotlin.jvm.internal.Intrinsics.checkNotNull(vectorizedKeyframeSpecElementInfo2);
                    V vectorValue = vectorizedKeyframeSpecElementInfo2.getVectorValue();
                    float[] fArr4 = new float[size];
                    for (int i10 = 0; i10 < size; i10++) {
                        fArr4[i10] = vectorValue.get$animation_core(i10);
                    }
                    fArr = fArr4;
                }
                fArr3[i6] = fArr;
            }
            this.getOutputSizes = new androidx.compose.animation.core.ArcSpline(this.getHighSpeedVideoFpsRanges, this.getInputSizeshNQ4ISI, fArr3);
        }
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public final V getValueFromNanos(long playTimeNanos, V initialValue, V targetValue, V initialVelocity) {
        androidx.compose.animation.core.ArcSpline arcSpline;
        V vectorValue;
        V vectorValue2;
        int clampPlayTime = (int) androidx.compose.animation.core.VectorizedAnimationSpecKt.clampPlayTime(this, playTimeNanos / 1000000);
        androidx.compose.animation.core.VectorizedKeyframeSpecElementInfo<V> vectorizedKeyframeSpecElementInfo = this.getHighSpeedVideoSizes.get(clampPlayTime);
        if (vectorizedKeyframeSpecElementInfo != null) {
            return vectorizedKeyframeSpecElementInfo.getVectorValue();
        }
        if (clampPlayTime >= getDurationMillis()) {
            return targetValue;
        }
        if (clampPlayTime <= 0) {
            return initialValue;
        }
        getHighResolutionOutputSizeshNQ4ISI(initialValue, targetValue, initialVelocity);
        V v = this.getOutputFormats;
        kotlin.jvm.internal.Intrinsics.checkNotNull(v);
        androidx.compose.animation.core.ArcSpline arcSpline2 = this.getOutputSizes;
        arcSpline = androidx.compose.animation.core.VectorizedAnimationSpecKt.getHighResolutionOutputSizeshNQ4ISI;
        int i = 0;
        if (arcSpline2 != arcSpline) {
            float highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(clampPlayTime);
            float[] fArr = this.getOutputMinFrameDurationlomOqCM;
            this.getOutputSizes.getPos(highResolutionOutputSizeshNQ4ISI, fArr);
            int length = fArr.length;
            while (i < length) {
                v.set$animation_core(i, fArr[i]);
                i++;
            }
        } else {
            int highSpeedVideoSizes = getHighSpeedVideoSizes(clampPlayTime);
            float highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(highSpeedVideoSizes, clampPlayTime, true);
            androidx.compose.animation.core.VectorizedKeyframeSpecElementInfo<V> vectorizedKeyframeSpecElementInfo2 = this.getHighSpeedVideoSizes.get(this.getHighResolutionOutputSizeshNQ4ISI.get(highSpeedVideoSizes));
            if (vectorizedKeyframeSpecElementInfo2 != null && (vectorValue2 = vectorizedKeyframeSpecElementInfo2.getVectorValue()) != null) {
                initialValue = vectorValue2;
            }
            androidx.compose.animation.core.VectorizedKeyframeSpecElementInfo<V> vectorizedKeyframeSpecElementInfo3 = this.getHighSpeedVideoSizes.get(this.getHighResolutionOutputSizeshNQ4ISI.get(highSpeedVideoSizes + 1));
            if (vectorizedKeyframeSpecElementInfo3 != null && (vectorValue = vectorizedKeyframeSpecElementInfo3.getVectorValue()) != null) {
                targetValue = vectorValue;
            }
            int size = v.getSize();
            while (i < size) {
                v.set$animation_core(i, (initialValue.get$animation_core(i) * (1.0f - highSpeedVideoFpsRanges)) + (targetValue.get$animation_core(i) * highSpeedVideoFpsRanges));
                i++;
            }
        }
        return v;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public final V getVelocityFromNanos(long playTimeNanos, V initialValue, V targetValue, V initialVelocity) {
        androidx.compose.animation.core.ArcSpline arcSpline;
        long clampPlayTime = androidx.compose.animation.core.VectorizedAnimationSpecKt.clampPlayTime(this, playTimeNanos / 1000000);
        if (clampPlayTime < 0) {
            return initialVelocity;
        }
        getHighResolutionOutputSizeshNQ4ISI(initialValue, targetValue, initialVelocity);
        V v = this.getHighSpeedVideoSizesFor;
        kotlin.jvm.internal.Intrinsics.checkNotNull(v);
        androidx.compose.animation.core.ArcSpline arcSpline2 = this.getOutputSizes;
        arcSpline = androidx.compose.animation.core.VectorizedAnimationSpecKt.getHighResolutionOutputSizeshNQ4ISI;
        int i = 0;
        if (arcSpline2 != arcSpline) {
            float highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI((int) clampPlayTime);
            float[] fArr = this.getOutputStallDurationlomOqCM;
            this.getOutputSizes.getSlope(highResolutionOutputSizeshNQ4ISI, fArr);
            int length = fArr.length;
            while (i < length) {
                v.set$animation_core(i, fArr[i]);
                i++;
            }
        } else {
            androidx.compose.animation.core.VectorizedKeyframesSpec<V> vectorizedKeyframesSpec = this;
            androidx.compose.animation.core.AnimationVector valueFromMillis = androidx.compose.animation.core.VectorizedAnimationSpecKt.getValueFromMillis(vectorizedKeyframesSpec, clampPlayTime - 1, initialValue, targetValue, initialVelocity);
            androidx.compose.animation.core.AnimationVector valueFromMillis2 = androidx.compose.animation.core.VectorizedAnimationSpecKt.getValueFromMillis(vectorizedKeyframesSpec, clampPlayTime, initialValue, targetValue, initialVelocity);
            int size = valueFromMillis.getSize();
            while (i < size) {
                v.set$animation_core(i, (valueFromMillis.get$animation_core(i) - valueFromMillis2.get$animation_core(i)) * 1000.0f);
                i++;
            }
        }
        return v;
    }

    private final float getHighResolutionOutputSizeshNQ4ISI(int p0) {
        return getHighSpeedVideoFpsRanges(getHighSpeedVideoSizes(p0), p0, false);
    }

    private final float getHighSpeedVideoFpsRanges(int p0, int p1, boolean p2) {
        androidx.compose.animation.core.Easing easing;
        float f;
        if (p0 >= this.getHighResolutionOutputSizeshNQ4ISI._size - 1) {
            f = p1;
        } else {
            int i = this.getHighResolutionOutputSizeshNQ4ISI.get(p0);
            int i2 = this.getHighResolutionOutputSizeshNQ4ISI.get(p0 + 1);
            if (p1 == i) {
                f = i;
            } else {
                androidx.compose.animation.core.VectorizedKeyframeSpecElementInfo<V> vectorizedKeyframeSpecElementInfo = this.getHighSpeedVideoSizes.get(i);
                if (vectorizedKeyframeSpecElementInfo == null || (easing = vectorizedKeyframeSpecElementInfo.getEasing()) == null) {
                    easing = this.getHighSpeedVideoFpsRangesFor;
                }
                float f2 = i2 - i;
                float transform = easing.transform((p1 - i) / f2);
                if (p2) {
                    return transform;
                }
                f = (f2 * transform) + i;
            }
        }
        return f / 1000.0f;
    }

    private final int getHighSpeedVideoSizes(int p0) {
        int binarySearch$default = androidx.collection.IntList.binarySearch$default(this.getHighResolutionOutputSizeshNQ4ISI, p0, 0, 0, 6, null);
        return binarySearch$default < -1 ? -(binarySearch$default + 2) : binarySearch$default;
    }

    public /* synthetic */ VectorizedKeyframesSpec(androidx.collection.IntList intList, androidx.collection.IntObjectMap intObjectMap, int i, int i2, androidx.compose.animation.core.Easing easing, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(intList, intObjectMap, i, i2, easing, i3);
    }
}
