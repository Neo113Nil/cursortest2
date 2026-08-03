package androidx.compose.material;

/* compiled from: Elevation.kt */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0019\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u0007ø\u0001\u0000J\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u0007ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, d2 = {"Landroidx/compose/material/ElevationDefaults;", "", "()V", "incomingAnimationSpecForInteraction", "Landroidx/compose/animation/core/AnimationSpec;", "Landroidx/compose/ui/unit/Dp;", "interaction", "Landroidx/compose/foundation/interaction/Interaction;", "outgoingAnimationSpecForInteraction", "material_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
final class ElevationDefaults {
    public static final androidx.compose.material.ElevationDefaults INSTANCE = new androidx.compose.material.ElevationDefaults();

    private ElevationDefaults() {
    }

    public final androidx.compose.animation.core.AnimationSpec<androidx.compose.ui.unit.Dp> incomingAnimationSpecForInteraction(androidx.compose.foundation.interaction.Interaction interaction) {
        androidx.compose.animation.core.TweenSpec tweenSpec;
        androidx.compose.animation.core.TweenSpec tweenSpec2;
        androidx.compose.animation.core.TweenSpec tweenSpec3;
        androidx.compose.animation.core.TweenSpec tweenSpec4;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(interaction, "interaction");
        if (interaction instanceof androidx.compose.foundation.interaction.PressInteraction.Press) {
            tweenSpec4 = androidx.compose.material.ElevationKt.DefaultIncomingSpec;
            return tweenSpec4;
        }
        if (interaction instanceof androidx.compose.foundation.interaction.DragInteraction.Start) {
            tweenSpec3 = androidx.compose.material.ElevationKt.DefaultIncomingSpec;
            return tweenSpec3;
        }
        if (interaction instanceof androidx.compose.foundation.interaction.HoverInteraction.Enter) {
            tweenSpec2 = androidx.compose.material.ElevationKt.DefaultIncomingSpec;
            return tweenSpec2;
        }
        if (!(interaction instanceof androidx.compose.foundation.interaction.FocusInteraction.Focus)) {
            return null;
        }
        tweenSpec = androidx.compose.material.ElevationKt.DefaultIncomingSpec;
        return tweenSpec;
    }

    public final androidx.compose.animation.core.AnimationSpec<androidx.compose.ui.unit.Dp> outgoingAnimationSpecForInteraction(androidx.compose.foundation.interaction.Interaction interaction) {
        androidx.compose.animation.core.TweenSpec tweenSpec;
        androidx.compose.animation.core.TweenSpec tweenSpec2;
        androidx.compose.animation.core.TweenSpec tweenSpec3;
        androidx.compose.animation.core.TweenSpec tweenSpec4;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(interaction, "interaction");
        if (interaction instanceof androidx.compose.foundation.interaction.PressInteraction.Press) {
            tweenSpec4 = androidx.compose.material.ElevationKt.DefaultOutgoingSpec;
            return tweenSpec4;
        }
        if (interaction instanceof androidx.compose.foundation.interaction.DragInteraction.Start) {
            tweenSpec3 = androidx.compose.material.ElevationKt.DefaultOutgoingSpec;
            return tweenSpec3;
        }
        if (interaction instanceof androidx.compose.foundation.interaction.HoverInteraction.Enter) {
            tweenSpec2 = androidx.compose.material.ElevationKt.HoveredOutgoingSpec;
            return tweenSpec2;
        }
        if (!(interaction instanceof androidx.compose.foundation.interaction.FocusInteraction.Focus)) {
            return null;
        }
        tweenSpec = androidx.compose.material.ElevationKt.DefaultOutgoingSpec;
        return tweenSpec;
    }
}
