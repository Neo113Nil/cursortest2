package androidx.compose.material;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a>\u0010\t\u001a\u00020\u0006*\f\u0012\u0004\u0012\u00020\u0001\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u0080@¢\u0006\u0004\b\u0007\u0010\b\"\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f\"\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\f\"\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\f"}, d2 = {"Landroidx/compose/animation/core/Animatable;", "Landroidx/compose/ui/unit/Dp;", androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_TARGET, "Landroidx/compose/foundation/interaction/Interaction;", "from", androidx.constraintlayout.core.motion.utils.TypedValues.TransitionType.S_TO, "", "animateElevation-rAjV9yQ", "(Landroidx/compose/animation/core/Animatable;FLandroidx/compose/foundation/interaction/Interaction;Landroidx/compose/foundation/interaction/Interaction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "animateElevation", "Landroidx/compose/animation/core/TweenSpec;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/animation/core/TweenSpec;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoFpsRangesFor", "Camera2StreamConfigurationMap"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ElevationKt {
    private static final androidx.compose.animation.core.TweenSpec<androidx.compose.ui.unit.Dp> getHighResolutionOutputSizeshNQ4ISI = new androidx.compose.animation.core.TweenSpec<>(120, 0, androidx.compose.animation.core.EasingKt.getFastOutSlowInEasing(), 2, null);
    private static final androidx.compose.animation.core.TweenSpec<androidx.compose.ui.unit.Dp> getHighSpeedVideoFpsRanges = new androidx.compose.animation.core.TweenSpec<>(150, 0, new androidx.compose.animation.core.CubicBezierEasing(0.4f, 0.0f, 0.6f, 1.0f), 2, null);
    private static final androidx.compose.animation.core.TweenSpec<androidx.compose.ui.unit.Dp> Camera2StreamConfigurationMap = new androidx.compose.animation.core.TweenSpec<>(120, 0, new androidx.compose.animation.core.CubicBezierEasing(0.4f, 0.0f, 0.6f, 1.0f), 2, null);

    /* renamed from: animateElevation-rAjV9yQ$default, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m2616animateElevationrAjV9yQ$default(androidx.compose.animation.core.Animatable animatable, float f, androidx.compose.foundation.interaction.Interaction interaction, androidx.compose.foundation.interaction.Interaction interaction2, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            interaction = null;
        }
        if ((i & 4) != 0) {
            interaction2 = null;
        }
        return m2615animateElevationrAjV9yQ(animatable, f, interaction, interaction2, continuation);
    }

    /* renamed from: animateElevation-rAjV9yQ, reason: not valid java name */
    public static final java.lang.Object m2615animateElevationrAjV9yQ(androidx.compose.animation.core.Animatable<androidx.compose.ui.unit.Dp, ?> animatable, float f, androidx.compose.foundation.interaction.Interaction interaction, androidx.compose.foundation.interaction.Interaction interaction2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.compose.animation.core.AnimationSpec<androidx.compose.ui.unit.Dp> animationSpec;
        if (interaction2 != null) {
            androidx.compose.material.ElevationDefaults elevationDefaults = androidx.compose.material.ElevationDefaults.INSTANCE;
            animationSpec = androidx.compose.material.ElevationDefaults.getHighSpeedVideoFpsRangesFor(interaction2);
        } else if (interaction != null) {
            androidx.compose.material.ElevationDefaults elevationDefaults2 = androidx.compose.material.ElevationDefaults.INSTANCE;
            animationSpec = androidx.compose.material.ElevationDefaults.getHighResolutionOutputSizeshNQ4ISI(interaction);
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
}
