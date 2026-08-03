package androidx.compose.material;

/* compiled from: Elevation.kt */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aG\u0010\u0005\u001a\u00020\u0006*\f\u0012\u0004\u0012\u00020\u0002\u0012\u0002\b\u00030\u00072\u0006\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0080@ø\u0001\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\r\"\u0017\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0002\n\u0000\"\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0002\n\u0000\"\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u000e"}, d2 = {"DefaultIncomingSpec", "Landroidx/compose/animation/core/TweenSpec;", "Landroidx/compose/ui/unit/Dp;", "DefaultOutgoingSpec", "HoveredOutgoingSpec", "animateElevation", "", "Landroidx/compose/animation/core/Animatable;", "target", com.google.firebase.messaging.Constants.MessagePayloadKeys.FROM, "Landroidx/compose/foundation/interaction/Interaction;", "to", "animateElevation-rAjV9yQ", "(Landroidx/compose/animation/core/Animatable;FLandroidx/compose/foundation/interaction/Interaction;Landroidx/compose/foundation/interaction/Interaction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "material_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ElevationKt {
    private static final androidx.compose.animation.core.TweenSpec<androidx.compose.ui.unit.Dp> DefaultIncomingSpec = new androidx.compose.animation.core.TweenSpec<>(120, 0, androidx.compose.animation.core.EasingKt.getFastOutSlowInEasing(), 2, null);
    private static final androidx.compose.animation.core.TweenSpec<androidx.compose.ui.unit.Dp> DefaultOutgoingSpec = new androidx.compose.animation.core.TweenSpec<>(androidx.compose.material.TextFieldImplKt.AnimationDuration, 0, new androidx.compose.animation.core.CubicBezierEasing(0.4f, 0.0f, 0.6f, 1.0f), 2, null);
    private static final androidx.compose.animation.core.TweenSpec<androidx.compose.ui.unit.Dp> HoveredOutgoingSpec = new androidx.compose.animation.core.TweenSpec<>(120, 0, new androidx.compose.animation.core.CubicBezierEasing(0.4f, 0.0f, 0.6f, 1.0f), 2, null);

    /* renamed from: animateElevation-rAjV9yQ$default, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m1381animateElevationrAjV9yQ$default(androidx.compose.animation.core.Animatable animatable, float f, androidx.compose.foundation.interaction.Interaction interaction, androidx.compose.foundation.interaction.Interaction interaction2, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            interaction = null;
        }
        if ((i & 4) != 0) {
            interaction2 = null;
        }
        return m1380animateElevationrAjV9yQ(animatable, f, interaction, interaction2, continuation);
    }

    /* renamed from: animateElevation-rAjV9yQ, reason: not valid java name */
    public static final java.lang.Object m1380animateElevationrAjV9yQ(androidx.compose.animation.core.Animatable<androidx.compose.ui.unit.Dp, ?> animatable, float f, androidx.compose.foundation.interaction.Interaction interaction, androidx.compose.foundation.interaction.Interaction interaction2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.compose.animation.core.AnimationSpec<androidx.compose.ui.unit.Dp> outgoingAnimationSpecForInteraction;
        if (interaction2 != null) {
            outgoingAnimationSpecForInteraction = androidx.compose.material.ElevationDefaults.INSTANCE.incomingAnimationSpecForInteraction(interaction2);
        } else {
            outgoingAnimationSpecForInteraction = interaction != null ? androidx.compose.material.ElevationDefaults.INSTANCE.outgoingAnimationSpecForInteraction(interaction) : null;
        }
        androidx.compose.animation.core.AnimationSpec<androidx.compose.ui.unit.Dp> animationSpec = outgoingAnimationSpecForInteraction;
        if (animationSpec != null) {
            java.lang.Object animateTo$default = androidx.compose.animation.core.Animatable.animateTo$default(animatable, androidx.compose.ui.unit.Dp.m4476boximpl(f), animationSpec, null, null, continuation, 12, null);
            return animateTo$default == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? animateTo$default : kotlin.Unit.INSTANCE;
        }
        java.lang.Object snapTo = animatable.snapTo(androidx.compose.ui.unit.Dp.m4476boximpl(f), continuation);
        return snapTo == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? snapTo : kotlin.Unit.INSTANCE;
    }
}
