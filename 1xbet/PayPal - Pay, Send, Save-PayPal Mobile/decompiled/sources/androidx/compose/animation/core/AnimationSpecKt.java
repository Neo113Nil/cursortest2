package androidx.compose.animation.core;

@kotlin.Metadata(d1 = {"\u0000\u0094\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u001a;\u0010\u0005\u001a\u0004\u0018\u00018\u0001\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00018\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a7\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000e\u001a9\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a8\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b\"\u0004\b\u0000\u0010\u00002\u001d\u0010\u001a\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0017\u0012\u0004\u0012\u00020\u00180\u0016¢\u0006\u0002\b\u0019¢\u0006\u0004\b\u001c\u0010\u001d\u001a8\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001f\"\u0004\b\u0000\u0010\u00002\u001d\u0010\u001a\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001e\u0012\u0004\u0012\u00020\u00180\u0016¢\u0006\u0002\b\u0019¢\u0006\u0004\b \u0010!\u001a@\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001f\"\u0004\b\u0000\u0010\u00002\u0006\u0010\"\u001a\u00020\u000f2\u001d\u0010\u001a\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001e\u0012\u0004\u0012\u00020\u00180\u0016¢\u0006\u0002\b\u0019¢\u0006\u0004\b \u0010#\u001aC\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000+\"\u0004\b\u0000\u0010\u00002\u0006\u0010$\u001a\u00020\u00072\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000%2\b\b\u0002\u0010(\u001a\u00020'2\b\b\u0002\u0010*\u001a\u00020)¢\u0006\u0004\b,\u0010-\u001a;\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000+\"\u0004\b\u0000\u0010\u00002\u0006\u0010$\u001a\u00020\u00072\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000%2\b\b\u0002\u0010(\u001a\u00020'H\u0007¢\u0006\u0004\b.\u0010/\u001a;\u00103\u001a\b\u0012\u0004\u0012\u00028\u000000\"\u0004\b\u0000\u0010\u00002\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000%2\b\b\u0002\u0010(\u001a\u00020'2\b\b\u0002\u0010*\u001a\u00020)¢\u0006\u0004\b1\u00102\u001a3\u00103\u001a\b\u0012\u0004\u0012\u00028\u000000\"\u0004\b\u0000\u0010\u00002\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000%2\b\b\u0002\u0010(\u001a\u00020'H\u0007¢\u0006\u0004\b3\u00104\u001a#\u00106\u001a\b\u0012\u0004\u0012\u00028\u000005\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b6\u00107\u001a1\u0010<\u001a\b\u0012\u0004\u0012\u00028\u000008\"\u0004\b\u0000\u0010\u00002\f\u00109\u001a\b\u0012\u0004\u0012\u00028\u0000082\u0006\u0010;\u001a\u00020:H\u0000¢\u0006\u0004\b<\u0010="}, d2 = {"T", "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/animation/core/TwoWayConverter;", "p0", "Camera2StreamConfigurationMap", "(Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/Object;)Landroidx/compose/animation/core/AnimationVector;", "", "durationMillis", "delayMillis", "Landroidx/compose/animation/core/Easing;", "easing", "Landroidx/compose/animation/core/TweenSpec;", "tween", "(IILandroidx/compose/animation/core/Easing;)Landroidx/compose/animation/core/TweenSpec;", "", "dampingRatio", "stiffness", "visibilityThreshold", "Landroidx/compose/animation/core/SpringSpec;", "spring", "(FFLjava/lang/Object;)Landroidx/compose/animation/core/SpringSpec;", "Lkotlin/Function1;", "Landroidx/compose/animation/core/KeyframesSpec$KeyframesSpecConfig;", "", "Lkotlin/ExtensionFunctionType;", "init", "Landroidx/compose/animation/core/KeyframesSpec;", "keyframes", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/animation/core/KeyframesSpec;", "Landroidx/compose/animation/core/KeyframesWithSplineSpec$KeyframesWithSplineSpecConfig;", "Landroidx/compose/animation/core/KeyframesWithSplineSpec;", "keyframesWithSpline", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/animation/core/KeyframesWithSplineSpec;", "periodicBias", "(FLkotlin/jvm/functions/Function1;)Landroidx/compose/animation/core/KeyframesWithSplineSpec;", "iterations", "Landroidx/compose/animation/core/DurationBasedAnimationSpec;", "animation", "Landroidx/compose/animation/core/RepeatMode;", "repeatMode", "Landroidx/compose/animation/core/StartOffset;", "initialStartOffset", "Landroidx/compose/animation/core/RepeatableSpec;", "repeatable-91I0pcU", "(ILandroidx/compose/animation/core/DurationBasedAnimationSpec;Landroidx/compose/animation/core/RepeatMode;J)Landroidx/compose/animation/core/RepeatableSpec;", "repeatable", "(ILandroidx/compose/animation/core/DurationBasedAnimationSpec;Landroidx/compose/animation/core/RepeatMode;)Landroidx/compose/animation/core/RepeatableSpec;", "Landroidx/compose/animation/core/InfiniteRepeatableSpec;", "infiniteRepeatable-9IiC70o", "(Landroidx/compose/animation/core/DurationBasedAnimationSpec;Landroidx/compose/animation/core/RepeatMode;J)Landroidx/compose/animation/core/InfiniteRepeatableSpec;", "infiniteRepeatable", "(Landroidx/compose/animation/core/DurationBasedAnimationSpec;Landroidx/compose/animation/core/RepeatMode;)Landroidx/compose/animation/core/InfiniteRepeatableSpec;", "Landroidx/compose/animation/core/SnapSpec;", "snap", "(I)Landroidx/compose/animation/core/SnapSpec;", "Landroidx/compose/animation/core/AnimationSpec;", "animationSpec", "", "startDelayNanos", "delayed", "(Landroidx/compose/animation/core/AnimationSpec;J)Landroidx/compose/animation/core/AnimationSpec;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AnimationSpecKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final <T, V extends androidx.compose.animation.core.AnimationVector> V Camera2StreamConfigurationMap(androidx.compose.animation.core.TwoWayConverter<T, V> twoWayConverter, T t) {
        if (t == null) {
            return null;
        }
        return twoWayConverter.getConvertToVector().invoke(t);
    }

    public static /* synthetic */ androidx.compose.animation.core.TweenSpec tween$default(int i, int i2, androidx.compose.animation.core.Easing easing, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = 300;
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

    public static final <T> androidx.compose.animation.core.KeyframesWithSplineSpec<T> keyframesWithSpline(float f, kotlin.jvm.functions.Function1<? super androidx.compose.animation.core.KeyframesWithSplineSpec.KeyframesWithSplineSpecConfig<T>, kotlin.Unit> function1) {
        androidx.compose.animation.core.KeyframesWithSplineSpec.KeyframesWithSplineSpecConfig keyframesWithSplineSpecConfig = new androidx.compose.animation.core.KeyframesWithSplineSpec.KeyframesWithSplineSpecConfig();
        function1.invoke(keyframesWithSplineSpecConfig);
        return new androidx.compose.animation.core.KeyframesWithSplineSpec<>(keyframesWithSplineSpecConfig, f);
    }

    /* renamed from: repeatable-91I0pcU$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.animation.core.RepeatableSpec m1186repeatable91I0pcU$default(int i, androidx.compose.animation.core.DurationBasedAnimationSpec durationBasedAnimationSpec, androidx.compose.animation.core.RepeatMode repeatMode, long j, int i2, java.lang.Object obj) {
        if ((i2 & 4) != 0) {
            repeatMode = androidx.compose.animation.core.RepeatMode.Restart;
        }
        if ((i2 & 8) != 0) {
            j = androidx.compose.animation.core.StartOffset.m1219constructorimpl$default(0, 0, 2, null);
        }
        return m1185repeatable91I0pcU(i, durationBasedAnimationSpec, repeatMode, j);
    }

    /* renamed from: repeatable-91I0pcU, reason: not valid java name */
    public static final <T> androidx.compose.animation.core.RepeatableSpec<T> m1185repeatable91I0pcU(int i, androidx.compose.animation.core.DurationBasedAnimationSpec<T> durationBasedAnimationSpec, androidx.compose.animation.core.RepeatMode repeatMode, long j) {
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
        return new androidx.compose.animation.core.RepeatableSpec(i, durationBasedAnimationSpec, repeatMode, androidx.compose.animation.core.StartOffset.m1219constructorimpl$default(0, 0, 2, null), (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    /* renamed from: infiniteRepeatable-9IiC70o$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.animation.core.InfiniteRepeatableSpec m1184infiniteRepeatable9IiC70o$default(androidx.compose.animation.core.DurationBasedAnimationSpec durationBasedAnimationSpec, androidx.compose.animation.core.RepeatMode repeatMode, long j, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            repeatMode = androidx.compose.animation.core.RepeatMode.Restart;
        }
        if ((i & 4) != 0) {
            j = androidx.compose.animation.core.StartOffset.m1219constructorimpl$default(0, 0, 2, null);
        }
        return m1183infiniteRepeatable9IiC70o(durationBasedAnimationSpec, repeatMode, j);
    }

    /* renamed from: infiniteRepeatable-9IiC70o, reason: not valid java name */
    public static final <T> androidx.compose.animation.core.InfiniteRepeatableSpec<T> m1183infiniteRepeatable9IiC70o(androidx.compose.animation.core.DurationBasedAnimationSpec<T> durationBasedAnimationSpec, androidx.compose.animation.core.RepeatMode repeatMode, long j) {
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
        return new androidx.compose.animation.core.InfiniteRepeatableSpec(durationBasedAnimationSpec, repeatMode, androidx.compose.animation.core.StartOffset.m1219constructorimpl$default(0, 0, 2, null), (kotlin.jvm.internal.DefaultConstructorMarker) null);
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

    public static final <T> androidx.compose.animation.core.AnimationSpec<T> delayed(androidx.compose.animation.core.AnimationSpec<T> animationSpec, long j) {
        return new androidx.compose.animation.core.StartDelayAnimationSpec(animationSpec, j);
    }
}
