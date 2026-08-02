package androidx.compose.animation.core;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0002\u0011\u0012B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J3\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000b\"\b\b\u0001\u0010\b*\u00020\u00072\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010"}, d2 = {"Landroidx/compose/animation/core/KeyframesSpec;", "T", "Landroidx/compose/animation/core/DurationBasedAnimationSpec;", "Landroidx/compose/animation/core/KeyframesSpec$KeyframesSpecConfig;", "config", "<init>", "(Landroidx/compose/animation/core/KeyframesSpec$KeyframesSpecConfig;)V", "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/animation/core/TwoWayConverter;", "converter", "Landroidx/compose/animation/core/VectorizedKeyframesSpec;", "vectorize", "(Landroidx/compose/animation/core/TwoWayConverter;)Landroidx/compose/animation/core/VectorizedKeyframesSpec;", "Landroidx/compose/animation/core/KeyframesSpec$KeyframesSpecConfig;", "getConfig", "()Landroidx/compose/animation/core/KeyframesSpec$KeyframesSpecConfig;", "KeyframesSpecConfig", "KeyframeEntity"}, k = 1, mv = {2, 0, 0}, xi = 48)
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

    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0001\u0010\u00012\u0014\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00030\u0002B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\u0006\u0010\u0006\u001a\u00028\u0001H\u0010¢\u0006\u0004\b\u0007\u0010\bJ\"\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003*\u00028\u00012\u0006\u0010\n\u001a\u00020\tH\u0096\u0004¢\u0006\u0004\b\u000b\u0010\fJ\"\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003*\u00028\u00012\u0006\u0010\u000e\u001a\u00020\rH\u0096\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\"\u0010\u0014\u001a\u00020\u0013*\b\u0012\u0004\u0012\u00028\u00010\u00032\u0006\u0010\u0012\u001a\u00020\u0011H\u0087\u0004¢\u0006\u0004\b\u0014\u0010\u0015J(\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003*\b\u0012\u0004\u0012\u00028\u00010\u00032\u0006\u0010\u0017\u001a\u00020\u0016H\u0086\u0004¢\u0006\u0004\b\u0018\u0010\u0019"}, d2 = {"Landroidx/compose/animation/core/KeyframesSpec$KeyframesSpecConfig;", "T", "Landroidx/compose/animation/core/KeyframesSpecBaseConfig;", "Landroidx/compose/animation/core/KeyframesSpec$KeyframeEntity;", "<init>", "()V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "createEntityFor$animation_core", "(Ljava/lang/Object;)Landroidx/compose/animation/core/KeyframesSpec$KeyframeEntity;", "", "timeStamp", "at", "(Ljava/lang/Object;I)Landroidx/compose/animation/core/KeyframesSpec$KeyframeEntity;", "", "fraction", "atFraction", "(Ljava/lang/Object;F)Landroidx/compose/animation/core/KeyframesSpec$KeyframeEntity;", "Landroidx/compose/animation/core/Easing;", "easing", "", "with", "(Landroidx/compose/animation/core/KeyframesSpec$KeyframeEntity;Landroidx/compose/animation/core/Easing;)V", "Landroidx/compose/animation/core/ArcMode;", "arcMode", "using-ngzHuyU", "(Landroidx/compose/animation/core/KeyframesSpec$KeyframeEntity;I)Landroidx/compose/animation/core/KeyframesSpec$KeyframeEntity;", "using"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class KeyframesSpecConfig<T> extends androidx.compose.animation.core.KeyframesSpecBaseConfig<T, androidx.compose.animation.core.KeyframesSpec.KeyframeEntity<T>> {
        public static final int $stable = 8;

        public KeyframesSpecConfig() {
            super(null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.compose.animation.core.KeyframesSpecBaseConfig
        public final /* bridge */ /* synthetic */ androidx.compose.animation.core.KeyframeBaseEntity at(java.lang.Object obj, int i) {
            return at((androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig<T>) obj, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.compose.animation.core.KeyframesSpecBaseConfig
        public final /* bridge */ /* synthetic */ androidx.compose.animation.core.KeyframeBaseEntity atFraction(java.lang.Object obj, float f) {
            return atFraction((androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig<T>) obj, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.compose.animation.core.KeyframesSpecBaseConfig
        public final /* bridge */ /* synthetic */ androidx.compose.animation.core.KeyframeBaseEntity createEntityFor$animation_core(java.lang.Object obj) {
            return createEntityFor$animation_core((androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig<T>) obj);
        }

        @Override // androidx.compose.animation.core.KeyframesSpecBaseConfig
        public final androidx.compose.animation.core.KeyframesSpec.KeyframeEntity<T> createEntityFor$animation_core(T value) {
            return new androidx.compose.animation.core.KeyframesSpec.KeyframeEntity<>(value, null, 0, 6, null);
        }

        @Override // androidx.compose.animation.core.KeyframesSpecBaseConfig
        public final androidx.compose.animation.core.KeyframesSpec.KeyframeEntity<T> at(T t, int i) {
            androidx.compose.animation.core.KeyframesSpec.KeyframeEntity<T> keyframeEntity = new androidx.compose.animation.core.KeyframesSpec.KeyframeEntity<>(t, null, 0, 6, null);
            getKeyframes$animation_core().set(i, keyframeEntity);
            return keyframeEntity;
        }

        @Override // androidx.compose.animation.core.KeyframesSpecBaseConfig
        public final androidx.compose.animation.core.KeyframesSpec.KeyframeEntity<T> atFraction(T t, float f) {
            return at((androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig<T>) t, java.lang.Math.round(getDurationMillis() * f));
        }

        @kotlin.Deprecated(message = "Use version that returns an instance of the entity so it can be re-used in other keyframe builders.", replaceWith = @kotlin.ReplaceWith(expression = "this using easing", imports = {}))
        public final void with(androidx.compose.animation.core.KeyframesSpec.KeyframeEntity<T> keyframeEntity, androidx.compose.animation.core.Easing easing) {
            keyframeEntity.setEasing$animation_core(easing);
        }

        /* renamed from: using-ngzHuyU, reason: not valid java name */
        public final androidx.compose.animation.core.KeyframesSpec.KeyframeEntity<T> m1204usingngzHuyU(androidx.compose.animation.core.KeyframesSpec.KeyframeEntity<T> keyframeEntity, int i) {
            keyframeEntity.m1203setArcModeRur9ykg$animation_core(i);
            return keyframeEntity;
        }
    }

    @Override // androidx.compose.animation.core.FiniteAnimationSpec, androidx.compose.animation.core.AnimationSpec
    public final <V extends androidx.compose.animation.core.AnimationVector> androidx.compose.animation.core.VectorizedKeyframesSpec<V> vectorize(androidx.compose.animation.core.TwoWayConverter<T, V> converter) {
        long[] jArr;
        int[] iArr;
        long[] jArr2;
        int[] iArr2;
        int i;
        androidx.collection.MutableIntList mutableIntList = new androidx.collection.MutableIntList(this.config.getKeyframes$animation_core().get_size() + 2);
        androidx.collection.MutableIntObjectMap mutableIntObjectMap = new androidx.collection.MutableIntObjectMap(this.config.getKeyframes$animation_core().get_size());
        androidx.collection.MutableIntObjectMap<androidx.compose.animation.core.KeyframesSpec.KeyframeEntity<T>> keyframes$animation_core = this.config.getKeyframes$animation_core();
        int[] iArr3 = keyframes$animation_core.keys;
        java.lang.Object[] objArr = keyframes$animation_core.values;
        long[] jArr3 = keyframes$animation_core.metadata;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr3[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8;
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    int i5 = 0;
                    while (i5 < i4) {
                        if ((255 & j) < 128) {
                            int i6 = (i2 << 3) + i5;
                            int i7 = iArr3[i6];
                            androidx.compose.animation.core.KeyframesSpec.KeyframeEntity keyframeEntity = (androidx.compose.animation.core.KeyframesSpec.KeyframeEntity) objArr[i6];
                            mutableIntList.add(i7);
                            jArr2 = jArr3;
                            iArr2 = iArr3;
                            mutableIntObjectMap.set(i7, new androidx.compose.animation.core.VectorizedKeyframeSpecElementInfo(converter.getConvertToVector().invoke(keyframeEntity.getValue$animation_core()), keyframeEntity.getEasing(), keyframeEntity.getArcMode(), null));
                            i = 8;
                        } else {
                            jArr2 = jArr3;
                            iArr2 = iArr3;
                            i = i3;
                        }
                        j >>= i;
                        i5++;
                        i3 = i;
                        jArr3 = jArr2;
                        iArr3 = iArr2;
                    }
                    jArr = jArr3;
                    iArr = iArr3;
                    if (i4 != i3) {
                        break;
                    }
                } else {
                    jArr = jArr3;
                    iArr = iArr3;
                }
                if (i2 == length) {
                    break;
                }
                i2++;
                jArr3 = jArr;
                iArr3 = iArr;
            }
        }
        if (!this.config.getKeyframes$animation_core().containsKey(0)) {
            mutableIntList.add(0, 0);
        }
        if (!this.config.getKeyframes$animation_core().containsKey(this.config.getDurationMillis())) {
            mutableIntList.add(this.config.getDurationMillis());
        }
        mutableIntList.sort();
        return new androidx.compose.animation.core.VectorizedKeyframesSpec<>(mutableIntList, mutableIntObjectMap, this.config.getDurationMillis(), this.config.getDelayMillis(), androidx.compose.animation.core.EasingKt.getLinearEasing(), androidx.compose.animation.core.ArcMode.INSTANCE.m1197getArcLinear9TMq4(), null);
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B%\b\u0000\u0012\u0006\u0010\u0003\u001a\u00028\u0001\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\u0007\u001a\u00020\u00068\u0001@\u0001X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0011\"\u0004\b\u0014\u0010\u0015"}, d2 = {"Landroidx/compose/animation/core/KeyframesSpec$KeyframeEntity;", "T", "Landroidx/compose/animation/core/KeyframeBaseEntity;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Landroidx/compose/animation/core/Easing;", "easing", "Landroidx/compose/animation/core/ArcMode;", "arcMode", "<init>", "(Ljava/lang/Object;Landroidx/compose/animation/core/Easing;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", com.visa.cbp.getEncExpo.warmup, "getArcMode--9T-Mq4$animation_core", "setArcMode-Rur9ykg$animation_core", "(I)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class KeyframeEntity<T> extends androidx.compose.animation.core.KeyframeBaseEntity<T> {
        public static final int $stable = 8;
        private int arcMode;

        private KeyframeEntity(T t, androidx.compose.animation.core.Easing easing, int i) {
            super(t, easing, null);
            this.arcMode = i;
        }

        public /* synthetic */ KeyframeEntity(java.lang.Object obj, androidx.compose.animation.core.Easing easing, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(obj, (i2 & 2) != 0 ? androidx.compose.animation.core.EasingKt.getLinearEasing() : easing, (i2 & 4) != 0 ? androidx.compose.animation.core.ArcMode.INSTANCE.m1197getArcLinear9TMq4() : i, null);
        }

        /* renamed from: getArcMode--9T-Mq4$animation_core, reason: not valid java name and from getter */
        public final int getArcMode() {
            return this.arcMode;
        }

        /* renamed from: setArcMode-Rur9ykg$animation_core, reason: not valid java name */
        public final void m1203setArcModeRur9ykg$animation_core(int i) {
            this.arcMode = i;
        }

        public final boolean equals(java.lang.Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof androidx.compose.animation.core.KeyframesSpec.KeyframeEntity)) {
                return false;
            }
            androidx.compose.animation.core.KeyframesSpec.KeyframeEntity keyframeEntity = (androidx.compose.animation.core.KeyframesSpec.KeyframeEntity) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(keyframeEntity.getValue$animation_core(), getValue$animation_core()) && kotlin.jvm.internal.Intrinsics.areEqual(keyframeEntity.getEasing(), getEasing()) && androidx.compose.animation.core.ArcMode.m1191equalsimpl0(keyframeEntity.arcMode, this.arcMode);
        }

        public final int hashCode() {
            T value$animation_core = getValue$animation_core();
            return ((((value$animation_core != null ? value$animation_core.hashCode() : 0) * 31) + androidx.compose.animation.core.ArcMode.m1192hashCodeimpl(this.arcMode)) * 31) + getEasing().hashCode();
        }

        public /* synthetic */ KeyframeEntity(java.lang.Object obj, androidx.compose.animation.core.Easing easing, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(obj, easing, i);
        }
    }
}
