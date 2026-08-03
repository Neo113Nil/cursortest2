package androidx.compose.animation.core;

/* compiled from: AnimationSpec.kt */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0002\u000e\u000fB\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0002\u0010\u0005J,\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\n0\t\"\b\b\u0001\u0010\n*\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H\n0\rH\u0016R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Landroidx/compose/animation/core/KeyframesSpec;", "T", "Landroidx/compose/animation/core/DurationBasedAnimationSpec;", com.helpshift.proactive.InAppViewConstants.CONFIG, "Landroidx/compose/animation/core/KeyframesSpec$KeyframesSpecConfig;", "(Landroidx/compose/animation/core/KeyframesSpec$KeyframesSpecConfig;)V", "getConfig", "()Landroidx/compose/animation/core/KeyframesSpec$KeyframesSpecConfig;", "vectorize", "Landroidx/compose/animation/core/VectorizedKeyframesSpec;", androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroidx/compose/animation/core/AnimationVector;", "converter", "Landroidx/compose/animation/core/TwoWayConverter;", "KeyframeEntity", "KeyframesSpecConfig", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class KeyframesSpec<T> implements androidx.compose.animation.core.DurationBasedAnimationSpec<T> {
    public static final int $stable = 0;
    private final androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig<T> config;

    public KeyframesSpec(androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig<T> keyframesSpecConfig) {
        this.config = keyframesSpecConfig;
    }

    public final androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig<T> getConfig() {
        return this.config;
    }

    /* compiled from: AnimationSpec.kt */
    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000*\u0004\b\u0001\u0010\u00012\u0014\u0012\u0004\u0012\u0002H\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00030\u0002B\u0005¢\u0006\u0002\u0010\u0004J\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\u0006\u0010\u0006\u001a\u00028\u0001H\u0010¢\u0006\u0004\b\u0007\u0010\bJ\"\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003*\u00028\u00012\b\b\u0001\u0010\n\u001a\u00020\u000bH\u0096\u0004¢\u0006\u0002\u0010\fJ \u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003*\u00028\u00012\u0006\u0010\u000e\u001a\u00020\u000fH\u0096\u0004¢\u0006\u0002\u0010\u0010J\u001b\u0010\u0011\u001a\u00020\u0012*\b\u0012\u0004\u0012\u00028\u00010\u00032\u0006\u0010\u0013\u001a\u00020\u0014H\u0087\u0004¨\u0006\u0015"}, d2 = {"Landroidx/compose/animation/core/KeyframesSpec$KeyframesSpecConfig;", "T", "Landroidx/compose/animation/core/KeyframesSpecBaseConfig;", "Landroidx/compose/animation/core/KeyframesSpec$KeyframeEntity;", "()V", "createEntityFor", "value", "createEntityFor$animation_core_release", "(Ljava/lang/Object;)Landroidx/compose/animation/core/KeyframesSpec$KeyframeEntity;", "at", "timeStamp", "", "(Ljava/lang/Object;I)Landroidx/compose/animation/core/KeyframesSpec$KeyframeEntity;", "atFraction", "fraction", "", "(Ljava/lang/Object;F)Landroidx/compose/animation/core/KeyframesSpec$KeyframeEntity;", "with", "", "easing", "Landroidx/compose/animation/core/Easing;", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class KeyframesSpecConfig<T> extends androidx.compose.animation.core.KeyframesSpecBaseConfig<T, androidx.compose.animation.core.KeyframesSpec.KeyframeEntity<T>> {
        public static final int $stable = 0;

        public KeyframesSpecConfig() {
            super(null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.compose.animation.core.KeyframesSpecBaseConfig
        public /* bridge */ /* synthetic */ androidx.compose.animation.core.KeyframeBaseEntity at(java.lang.Object obj, int i) {
            return at((androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig<T>) obj, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.compose.animation.core.KeyframesSpecBaseConfig
        public /* bridge */ /* synthetic */ androidx.compose.animation.core.KeyframeBaseEntity atFraction(java.lang.Object obj, float f) {
            return atFraction((androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig<T>) obj, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.compose.animation.core.KeyframesSpecBaseConfig
        public /* bridge */ /* synthetic */ androidx.compose.animation.core.KeyframeBaseEntity createEntityFor$animation_core_release(java.lang.Object obj) {
            return createEntityFor$animation_core_release((androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig<T>) obj);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.compose.animation.core.KeyframesSpecBaseConfig
        public androidx.compose.animation.core.KeyframesSpec.KeyframeEntity<T> createEntityFor$animation_core_release(T value) {
            return new androidx.compose.animation.core.KeyframesSpec.KeyframeEntity<>(value, null, 2, 0 == true ? 1 : 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.compose.animation.core.KeyframesSpecBaseConfig
        public androidx.compose.animation.core.KeyframesSpec.KeyframeEntity<T> at(T t, int i) {
            androidx.compose.animation.core.KeyframesSpec.KeyframeEntity<T> keyframeEntity = new androidx.compose.animation.core.KeyframesSpec.KeyframeEntity<>(t, null, 2, 0 == true ? 1 : 0);
            getKeyframes$animation_core_release().set(i, keyframeEntity);
            return keyframeEntity;
        }

        @Override // androidx.compose.animation.core.KeyframesSpecBaseConfig
        public androidx.compose.animation.core.KeyframesSpec.KeyframeEntity<T> atFraction(T t, float f) {
            return at((androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig<T>) t, kotlin.math.MathKt.roundToInt(getDurationMillis() * f));
        }

        @kotlin.Deprecated(message = "Use version that returns an instance of the entity so it can be re-used in other keyframe builders.", replaceWith = @kotlin.ReplaceWith(expression = "this using easing", imports = {}))
        public final void with(androidx.compose.animation.core.KeyframesSpec.KeyframeEntity<T> keyframeEntity, androidx.compose.animation.core.Easing easing) {
            keyframeEntity.setEasing$animation_core_release(easing);
        }
    }

    @Override // androidx.compose.animation.core.FiniteAnimationSpec, androidx.compose.animation.core.AnimationSpec
    public <V extends androidx.compose.animation.core.AnimationVector> androidx.compose.animation.core.VectorizedKeyframesSpec<V> vectorize(androidx.compose.animation.core.TwoWayConverter<T, V> converter) {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        androidx.collection.MutableIntObjectMap<androidx.compose.animation.core.KeyframesSpec.KeyframeEntity<T>> keyframes$animation_core_release = this.config.getKeyframes$animation_core_release();
        int[] iArr = keyframes$animation_core_release.keys;
        java.lang.Object[] objArr = keyframes$animation_core_release.values;
        long[] jArr = keyframes$animation_core_release.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            linkedHashMap.put(java.lang.Integer.valueOf(iArr[i4]), ((androidx.compose.animation.core.KeyframesSpec.KeyframeEntity) objArr[i4]).toPair$animation_core_release(converter.getConvertToVector()));
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return new androidx.compose.animation.core.VectorizedKeyframesSpec<>(linkedHashMap, this.config.getDurationMillis(), this.config.getDelayMillis());
    }

    /* compiled from: AnimationSpec.kt */
    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00028\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0013\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0096\u0002J\b\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\r"}, d2 = {"Landroidx/compose/animation/core/KeyframesSpec$KeyframeEntity;", "T", "Landroidx/compose/animation/core/KeyframeBaseEntity;", "value", "easing", "Landroidx/compose/animation/core/Easing;", "(Ljava/lang/Object;Landroidx/compose/animation/core/Easing;)V", "equals", "", "other", "", "hashCode", "", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class KeyframeEntity<T> extends androidx.compose.animation.core.KeyframeBaseEntity<T> {
        public static final int $stable = 0;

        public /* synthetic */ KeyframeEntity(java.lang.Object obj, androidx.compose.animation.core.Easing easing, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(obj, (i & 2) != 0 ? androidx.compose.animation.core.EasingKt.getLinearEasing() : easing);
        }

        public KeyframeEntity(T t, androidx.compose.animation.core.Easing easing) {
            super(t, easing, null);
        }

        public boolean equals(java.lang.Object other) {
            if (other instanceof androidx.compose.animation.core.KeyframesSpec.KeyframeEntity) {
                androidx.compose.animation.core.KeyframesSpec.KeyframeEntity keyframeEntity = (androidx.compose.animation.core.KeyframesSpec.KeyframeEntity) other;
                if (kotlin.jvm.internal.Intrinsics.areEqual(keyframeEntity.getValue$animation_core_release(), getValue$animation_core_release()) && kotlin.jvm.internal.Intrinsics.areEqual(keyframeEntity.getEasing(), getEasing())) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            T value$animation_core_release = getValue$animation_core_release();
            return ((value$animation_core_release != null ? value$animation_core_release.hashCode() : 0) * 31) + getEasing().hashCode();
        }
    }
}
