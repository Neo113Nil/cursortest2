package androidx.compose.animation.core;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\u0017B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u001f\b\u0016\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tJ3\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000e\"\b\b\u0001\u0010\u000b*\u00020\n2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0016\u001a\u00020\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Landroidx/compose/animation/core/KeyframesWithSplineSpec;", "T", "Landroidx/compose/animation/core/DurationBasedAnimationSpec;", "Landroidx/compose/animation/core/KeyframesWithSplineSpec$KeyframesWithSplineSpecConfig;", "config", "<init>", "(Landroidx/compose/animation/core/KeyframesWithSplineSpec$KeyframesWithSplineSpecConfig;)V", "", "periodicBias", "(Landroidx/compose/animation/core/KeyframesWithSplineSpec$KeyframesWithSplineSpecConfig;F)V", "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/animation/core/TwoWayConverter;", "converter", "Landroidx/compose/animation/core/VectorizedDurationBasedAnimationSpec;", "vectorize", "(Landroidx/compose/animation/core/TwoWayConverter;)Landroidx/compose/animation/core/VectorizedDurationBasedAnimationSpec;", "Landroidx/compose/animation/core/KeyframesWithSplineSpec$KeyframesWithSplineSpecConfig;", "getConfig", "()Landroidx/compose/animation/core/KeyframesWithSplineSpec$KeyframesWithSplineSpecConfig;", "getHighResolutionOutputSizeshNQ4ISI", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getHighSpeedVideoFpsRanges", "KeyframesWithSplineSpecConfig"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class KeyframesWithSplineSpec<T> implements androidx.compose.animation.core.DurationBasedAnimationSpec<T> {
    public static final int $stable = 0;
    private final androidx.compose.animation.core.KeyframesWithSplineSpec.KeyframesWithSplineSpecConfig<T> config;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private float getHighSpeedVideoFpsRanges;

    public KeyframesWithSplineSpec(androidx.compose.animation.core.KeyframesWithSplineSpec.KeyframesWithSplineSpecConfig<T> keyframesWithSplineSpecConfig) {
        this.config = keyframesWithSplineSpecConfig;
        this.getHighSpeedVideoFpsRanges = Float.NaN;
    }

    public final androidx.compose.animation.core.KeyframesWithSplineSpec.KeyframesWithSplineSpecConfig<T> getConfig() {
        return this.config;
    }

    public KeyframesWithSplineSpec(androidx.compose.animation.core.KeyframesWithSplineSpec.KeyframesWithSplineSpecConfig<T> keyframesWithSplineSpecConfig, float f) {
        this(keyframesWithSplineSpecConfig);
        this.getHighSpeedVideoFpsRanges = f;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000*\u0004\b\u0001\u0010\u00012\u0014\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00030\u0002B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\u0006\u0010\u0006\u001a\u00028\u0001H\u0010¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/animation/core/KeyframesWithSplineSpec$KeyframesWithSplineSpecConfig;", "T", "Landroidx/compose/animation/core/KeyframesSpecBaseConfig;", "Landroidx/compose/animation/core/KeyframesSpec$KeyframeEntity;", "<init>", "()V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "createEntityFor$animation_core", "(Ljava/lang/Object;)Landroidx/compose/animation/core/KeyframesSpec$KeyframeEntity;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class KeyframesWithSplineSpecConfig<T> extends androidx.compose.animation.core.KeyframesSpecBaseConfig<T, androidx.compose.animation.core.KeyframesSpec.KeyframeEntity<T>> {
        public static final int $stable = 8;

        public KeyframesWithSplineSpecConfig() {
            super(null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.compose.animation.core.KeyframesSpecBaseConfig
        public final /* bridge */ /* synthetic */ androidx.compose.animation.core.KeyframeBaseEntity createEntityFor$animation_core(java.lang.Object obj) {
            return createEntityFor$animation_core((androidx.compose.animation.core.KeyframesWithSplineSpec.KeyframesWithSplineSpecConfig<T>) obj);
        }

        @Override // androidx.compose.animation.core.KeyframesSpecBaseConfig
        public final androidx.compose.animation.core.KeyframesSpec.KeyframeEntity<T> createEntityFor$animation_core(T value) {
            return new androidx.compose.animation.core.KeyframesSpec.KeyframeEntity<>(value, null, 0, 6, null);
        }
    }

    @Override // androidx.compose.animation.core.FiniteAnimationSpec, androidx.compose.animation.core.AnimationSpec
    public final <V extends androidx.compose.animation.core.AnimationVector> androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec<V> vectorize(androidx.compose.animation.core.TwoWayConverter<T, V> converter) {
        int[] iArr;
        java.lang.Object[] objArr;
        int[] iArr2;
        java.lang.Object[] objArr2;
        int i;
        androidx.collection.MutableIntObjectMap<androidx.compose.animation.core.KeyframesSpec.KeyframeEntity<T>> keyframes$animation_core = this.config.getKeyframes$animation_core();
        androidx.collection.MutableIntList mutableIntList = new androidx.collection.MutableIntList(keyframes$animation_core.get_size() + 2);
        androidx.collection.MutableIntObjectMap mutableIntObjectMap = new androidx.collection.MutableIntObjectMap(keyframes$animation_core.get_size());
        androidx.collection.MutableIntObjectMap<androidx.compose.animation.core.KeyframesSpec.KeyframeEntity<T>> mutableIntObjectMap2 = keyframes$animation_core;
        int[] iArr3 = mutableIntObjectMap2.keys;
        java.lang.Object[] objArr3 = mutableIntObjectMap2.values;
        long[] jArr = mutableIntObjectMap2.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8;
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    int i5 = 0;
                    while (i5 < i4) {
                        if ((255 & j) < 128) {
                            int i6 = (i2 << 3) + i5;
                            int i7 = iArr3[i6];
                            androidx.compose.animation.core.KeyframesSpec.KeyframeEntity keyframeEntity = (androidx.compose.animation.core.KeyframesSpec.KeyframeEntity) objArr3[i6];
                            mutableIntList.add(i7);
                            iArr2 = iArr3;
                            objArr2 = objArr3;
                            mutableIntObjectMap.set(i7, new kotlin.Pair(converter.getConvertToVector().invoke(keyframeEntity.getValue$animation_core()), keyframeEntity.getEasing()));
                            i = 8;
                        } else {
                            iArr2 = iArr3;
                            objArr2 = objArr3;
                            i = i3;
                        }
                        j >>= i;
                        i5++;
                        i3 = i;
                        iArr3 = iArr2;
                        objArr3 = objArr2;
                    }
                    iArr = iArr3;
                    objArr = objArr3;
                    if (i4 != i3) {
                        break;
                    }
                } else {
                    iArr = iArr3;
                    objArr = objArr3;
                }
                if (i2 == length) {
                    break;
                }
                i2++;
                iArr3 = iArr;
                objArr3 = objArr;
            }
        }
        if (!mutableIntObjectMap2.containsKey(0)) {
            mutableIntList.add(0, 0);
        }
        if (!mutableIntObjectMap2.containsKey(this.config.getDurationMillis())) {
            mutableIntList.add(this.config.getDurationMillis());
        }
        mutableIntList.sort();
        return new androidx.compose.animation.core.VectorizedMonoSplineKeyframesSpec(mutableIntList, mutableIntObjectMap, this.config.getDurationMillis(), this.config.getDelayMillis(), this.getHighSpeedVideoFpsRanges);
    }
}
