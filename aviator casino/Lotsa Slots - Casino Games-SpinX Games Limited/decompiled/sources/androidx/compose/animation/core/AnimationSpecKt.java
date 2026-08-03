package androidx.compose.animation.core;

/* compiled from: AnimationSpec.kt */
@kotlin.Metadata(d1 = {"\u0000\u0080\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a,\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u0007\u001a@\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a3\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00020\f\"\u0004\b\u0000\u0010\u00022\u001d\u0010\r\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\u0002\b\u0011H\u0007\u001a3\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0013\"\u0004\b\u0000\u0010\u00022\u001d\u0010\r\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0014\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\u0002\b\u0011H\u0007\u001a4\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0016\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0017\u001a\u00020\u00182\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u0007\u001aH\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0016\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0017\u001a\u00020\u00182\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u001e\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H\u00020\u001c\"\u0004\b\u0000\u0010\u00022\b\b\u0002\u0010\u001d\u001a\u00020\u0018H\u0007\u001a9\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u00020\u001f\"\u0004\b\u0000\u0010\u00022\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020!2\n\b\u0002\u0010#\u001a\u0004\u0018\u0001H\u0002H\u0007¢\u0006\u0002\u0010$\u001a2\u0010%\u001a\b\u0012\u0004\u0012\u0002H\u00020&\"\u0004\b\u0000\u0010\u00022\b\b\u0002\u0010'\u001a\u00020\u00182\b\b\u0002\u0010\u001d\u001a\u00020\u00182\b\b\u0002\u0010(\u001a\u00020)H\u0007\u001a9\u0010*\u001a\u0004\u0018\u0001H+\"\u0004\b\u0000\u0010\u0002\"\b\b\u0001\u0010+*\u00020,*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H+0-2\b\u0010.\u001a\u0004\u0018\u0001H\u0002H\u0002¢\u0006\u0002\u0010/\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00060"}, d2 = {"infiniteRepeatable", "Landroidx/compose/animation/core/InfiniteRepeatableSpec;", "T", "animation", "Landroidx/compose/animation/core/DurationBasedAnimationSpec;", "repeatMode", "Landroidx/compose/animation/core/RepeatMode;", "initialStartOffset", "Landroidx/compose/animation/core/StartOffset;", "infiniteRepeatable-9IiC70o", "(Landroidx/compose/animation/core/DurationBasedAnimationSpec;Landroidx/compose/animation/core/RepeatMode;J)Landroidx/compose/animation/core/InfiniteRepeatableSpec;", "keyframes", "Landroidx/compose/animation/core/KeyframesSpec;", com.ironsource.X3.a.f, "Lkotlin/Function1;", "Landroidx/compose/animation/core/KeyframesSpec$KeyframesSpecConfig;", "", "Lkotlin/ExtensionFunctionType;", "keyframesWithSpline", "Landroidx/compose/animation/core/KeyframesWithSplineSpec;", "Landroidx/compose/animation/core/KeyframesWithSplineSpec$KeyframesWithSplineSpecConfig;", "repeatable", "Landroidx/compose/animation/core/RepeatableSpec;", "iterations", "", "repeatable-91I0pcU", "(ILandroidx/compose/animation/core/DurationBasedAnimationSpec;Landroidx/compose/animation/core/RepeatMode;J)Landroidx/compose/animation/core/RepeatableSpec;", "snap", "Landroidx/compose/animation/core/SnapSpec;", "delayMillis", "spring", "Landroidx/compose/animation/core/SpringSpec;", "dampingRatio", "", "stiffness", "visibilityThreshold", "(FFLjava/lang/Object;)Landroidx/compose/animation/core/SpringSpec;", "tween", "Landroidx/compose/animation/core/TweenSpec;", "durationMillis", "easing", "Landroidx/compose/animation/core/Easing;", "convert", androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroidx/compose/animation/core/AnimationVector;", "Landroidx/compose/animation/core/TwoWayConverter;", "data", "(Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/Object;)Landroidx/compose/animation/core/AnimationVector;", "animation-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AnimationSpecKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final <T, V extends androidx.compose.animation.core.AnimationVector> V convert(androidx.compose.animation.core.TwoWayConverter<T, V> twoWayConverter, T t) {
        if (t == null) {
            return null;
        }
        return twoWayConverter.getConvertToVector().invoke(t);
    }

    public static /* synthetic */ androidx.compose.animation.core.TweenSpec tween$default(int i, int i2, androidx.compose.animation.core.Easing easing, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = androidx.compose.animation.core.AnimationConstants.DefaultDurationMillis;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            easing = androidx.compose.animation.core.EasingKt.getFastOutSlowInEasing();
        }
        return tween(i, i2, easing);
    }

    public static final <T> androidx.compose.animation.core.TweenSpec<T> tween(int i, int i2, androidx.compose.animation.core.Easing easing) {
        return new androidx.compose.animation.core.TweenSpec<>(i, i2, easing);
    }

    public static /* synthetic */ androidx.compose.animation.core.SpringSpec spring$default(float f, float f2, java.lang.Object obj, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        if ((i & 2) != 0) {
            f2 = 1500.0f;
        }
        if ((i & 4) != 0) {
            obj = null;
        }
        return spring(f, f2, obj);
    }

    public static final <T> androidx.compose.animation.core.SpringSpec<T> spring(float f, float f2, T t) {
        return new androidx.compose.animation.core.SpringSpec<>(f, f2, t);
    }

    public static final <T> androidx.compose.animation.core.KeyframesSpec<T> keyframes(kotlin.jvm.functions.Function1<? super androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig<T>, kotlin.Unit> function1) {
        androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig keyframesSpecConfig = new androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig();
        function1.invoke(keyframesSpecConfig);
        return new androidx.compose.animation.core.KeyframesSpec<>(keyframesSpecConfig);
    }

    public static final <T> androidx.compose.animation.core.KeyframesWithSplineSpec<T> keyframesWithSpline(kotlin.jvm.functions.Function1<? super androidx.compose.animation.core.KeyframesWithSplineSpec.KeyframesWithSplineSpecConfig<T>, kotlin.Unit> function1) {
        androidx.compose.animation.core.KeyframesWithSplineSpec.KeyframesWithSplineSpecConfig keyframesWithSplineSpecConfig = new androidx.compose.animation.core.KeyframesWithSplineSpec.KeyframesWithSplineSpecConfig();
        function1.invoke(keyframesWithSplineSpecConfig);
        return new androidx.compose.animation.core.KeyframesWithSplineSpec<>(keyframesWithSplineSpecConfig);
    }

    /* renamed from: repeatable-91I0pcU$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.animation.core.RepeatableSpec m130repeatable91I0pcU$default(int i, androidx.compose.animation.core.DurationBasedAnimationSpec durationBasedAnimationSpec, androidx.compose.animation.core.RepeatMode repeatMode, long j, int i2, java.lang.Object obj) {
        if ((i2 & 4) != 0) {
            repeatMode = androidx.compose.animation.core.RepeatMode.Restart;
        }
        if ((i2 & 8) != 0) {
            j = androidx.compose.animation.core.StartOffset.m150constructorimpl$default(0, 0, 2, null);
        }
        return m129repeatable91I0pcU(i, durationBasedAnimationSpec, repeatMode, j);
    }

    /* renamed from: repeatable-91I0pcU, reason: not valid java name */
    public static final <T> androidx.compose.animation.core.RepeatableSpec<T> m129repeatable91I0pcU(int i, androidx.compose.animation.core.DurationBasedAnimationSpec<T> durationBasedAnimationSpec, androidx.compose.animation.core.RepeatMode repeatMode, long j) {
        return new androidx.compose.animation.core.RepeatableSpec<>(i, durationBasedAnimationSpec, repeatMode, j, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    public static /* synthetic */ androidx.compose.animation.core.RepeatableSpec repeatable$default(int i, androidx.compose.animation.core.DurationBasedAnimationSpec durationBasedAnimationSpec, androidx.compose.animation.core.RepeatMode repeatMode, int i2, java.lang.Object obj) {
        if ((i2 & 4) != 0) {
            repeatMode = androidx.compose.animation.core.RepeatMode.Restart;
        }
        return repeatable(i, durationBasedAnimationSpec, repeatMode);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This method has been deprecated in favor of the repeatable function that accepts start offset.")
    public static final /* synthetic */ androidx.compose.animation.core.RepeatableSpec repeatable(int i, androidx.compose.animation.core.DurationBasedAnimationSpec durationBasedAnimationSpec, androidx.compose.animation.core.RepeatMode repeatMode) {
        return new androidx.compose.animation.core.RepeatableSpec(i, durationBasedAnimationSpec, repeatMode, androidx.compose.animation.core.StartOffset.m150constructorimpl$default(0, 0, 2, null), (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    /* renamed from: infiniteRepeatable-9IiC70o$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.animation.core.InfiniteRepeatableSpec m128infiniteRepeatable9IiC70o$default(androidx.compose.animation.core.DurationBasedAnimationSpec durationBasedAnimationSpec, androidx.compose.animation.core.RepeatMode repeatMode, long j, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            repeatMode = androidx.compose.animation.core.RepeatMode.Restart;
        }
        if ((i & 4) != 0) {
            j = androidx.compose.animation.core.StartOffset.m150constructorimpl$default(0, 0, 2, null);
        }
        return m127infiniteRepeatable9IiC70o(durationBasedAnimationSpec, repeatMode, j);
    }

    /* renamed from: infiniteRepeatable-9IiC70o, reason: not valid java name */
    public static final <T> androidx.compose.animation.core.InfiniteRepeatableSpec<T> m127infiniteRepeatable9IiC70o(androidx.compose.animation.core.DurationBasedAnimationSpec<T> durationBasedAnimationSpec, androidx.compose.animation.core.RepeatMode repeatMode, long j) {
        return new androidx.compose.animation.core.InfiniteRepeatableSpec<>(durationBasedAnimationSpec, repeatMode, j, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    public static /* synthetic */ androidx.compose.animation.core.InfiniteRepeatableSpec infiniteRepeatable$default(androidx.compose.animation.core.DurationBasedAnimationSpec durationBasedAnimationSpec, androidx.compose.animation.core.RepeatMode repeatMode, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            repeatMode = androidx.compose.animation.core.RepeatMode.Restart;
        }
        return infiniteRepeatable(durationBasedAnimationSpec, repeatMode);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This method has been deprecated in favor of the infinite repeatable function that accepts start offset.")
    public static final /* synthetic */ androidx.compose.animation.core.InfiniteRepeatableSpec infiniteRepeatable(androidx.compose.animation.core.DurationBasedAnimationSpec durationBasedAnimationSpec, androidx.compose.animation.core.RepeatMode repeatMode) {
        return new androidx.compose.animation.core.InfiniteRepeatableSpec(durationBasedAnimationSpec, repeatMode, androidx.compose.animation.core.StartOffset.m150constructorimpl$default(0, 0, 2, null), (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    public static final <T> androidx.compose.animation.core.SnapSpec<T> snap(int i) {
        return new androidx.compose.animation.core.SnapSpec<>(i);
    }

    public static /* synthetic */ androidx.compose.animation.core.SnapSpec snap$default(int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return snap(i);
    }
}
