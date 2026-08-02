package androidx.compose.material3.internal;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a>\u0010\t\u001a\u00020\u0006*\f\u0012\u0004\u0012\u00020\u0001\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u0080@¢\u0006\u0004\b\u0007\u0010\b\"\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f\"\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\"\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010\"\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0010"}, d2 = {"Landroidx/compose/animation/core/Animatable;", "Landroidx/compose/ui/unit/Dp;", androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_TARGET, "Landroidx/compose/foundation/interaction/Interaction;", "from", androidx.constraintlayout.core.motion.utils.TypedValues.TransitionType.S_TO, "", "animateElevation-rAjV9yQ", "(Landroidx/compose/animation/core/Animatable;FLandroidx/compose/foundation/interaction/Interaction;Landroidx/compose/foundation/interaction/Interaction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "animateElevation", "Landroidx/compose/animation/core/Easing;", "getHighSpeedVideoSizes", "Landroidx/compose/animation/core/Easing;", "getHighSpeedVideoFpsRanges", "Landroidx/compose/animation/core/TweenSpec;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/animation/core/TweenSpec;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRangesFor"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ElevationKt {
    private static final androidx.compose.animation.core.TweenSpec<androidx.compose.ui.unit.Dp> Camera2StreamConfigurationMap;
    private static final androidx.compose.animation.core.TweenSpec<androidx.compose.ui.unit.Dp> getHighResolutionOutputSizeshNQ4ISI;
    private static final androidx.compose.animation.core.TweenSpec<androidx.compose.ui.unit.Dp> getHighSpeedVideoFpsRanges;
    private static final androidx.compose.animation.core.Easing getHighSpeedVideoSizes;

    /* renamed from: animateElevation-rAjV9yQ$default, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m4301animateElevationrAjV9yQ$default(androidx.compose.animation.core.Animatable animatable, float f, androidx.compose.foundation.interaction.Interaction interaction, androidx.compose.foundation.interaction.Interaction interaction2, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            interaction = null;
        }
        if ((i & 4) != 0) {
            interaction2 = null;
        }
        return m4300animateElevationrAjV9yQ(animatable, f, interaction, interaction2, continuation);
    }

    /* renamed from: animateElevation-rAjV9yQ, reason: not valid java name */
    public static final java.lang.Object m4300animateElevationrAjV9yQ(androidx.compose.animation.core.Animatable<androidx.compose.ui.unit.Dp, ?> animatable, float f, androidx.compose.foundation.interaction.Interaction interaction, androidx.compose.foundation.interaction.Interaction interaction2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.compose.animation.core.AnimationSpec<androidx.compose.ui.unit.Dp> animationSpec;
        if (interaction2 != null) {
            androidx.compose.material3.internal.ElevationDefaults elevationDefaults = androidx.compose.material3.internal.ElevationDefaults.INSTANCE;
            animationSpec = androidx.compose.material3.internal.ElevationDefaults.getHighSpeedVideoFpsRanges(interaction2);
        } else if (interaction != null) {
            androidx.compose.material3.internal.ElevationDefaults elevationDefaults2 = androidx.compose.material3.internal.ElevationDefaults.INSTANCE;
            animationSpec = androidx.compose.material3.internal.ElevationDefaults.getHighResolutionOutputSizeshNQ4ISI(interaction);
        } else {
            animationSpec = null;
        }
        androidx.compose.animation.core.AnimationSpec<androidx.compose.ui.unit.Dp> animationSpec2 = animationSpec;
        if (animationSpec2 != null) {
            java.lang.Object animateTo$default = androidx.compose.animation.core.Animatable.animateTo$default(animatable, androidx.compose.ui.unit.Dp.m8599boximpl(f), animationSpec2, null, null, continuation, 12, null);
            return animateTo$default == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? animateTo$default : kotlin.Unit.INSTANCE;
        }
        java.lang.Object snapTo = animatable.snapTo(androidx.compose.ui.unit.Dp.m8599boximpl(f), continuation);
        return snapTo == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? snapTo : kotlin.Unit.INSTANCE;
    }

    static {
        androidx.compose.animation.core.CubicBezierEasing cubicBezierEasing = new androidx.compose.animation.core.CubicBezierEasing(0.4f, 0.0f, 0.6f, 1.0f);
        getHighSpeedVideoSizes = cubicBezierEasing;
        getHighResolutionOutputSizeshNQ4ISI = new androidx.compose.animation.core.TweenSpec<>(120, 0, androidx.compose.animation.core.EasingKt.getFastOutSlowInEasing(), 2, null);
        int i = 0;
        int i2 = 2;
        kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker = null;
        Camera2StreamConfigurationMap = new androidx.compose.animation.core.TweenSpec<>(150, i, cubicBezierEasing, i2, defaultConstructorMarker);
        getHighSpeedVideoFpsRanges = new androidx.compose.animation.core.TweenSpec<>(120, i, cubicBezierEasing, i2, defaultConstructorMarker);
    }
}
