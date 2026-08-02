package androidx.compose.material;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\t"}, d2 = {"Landroidx/compose/material/ElevationDefaults;", "", "<init>", "()V", "Landroidx/compose/foundation/interaction/Interaction;", "p0", "Landroidx/compose/animation/core/AnimationSpec;", "Landroidx/compose/ui/unit/Dp;", "getHighSpeedVideoFpsRangesFor", "(Landroidx/compose/foundation/interaction/Interaction;)Landroidx/compose/animation/core/AnimationSpec;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ElevationDefaults {
    public static final androidx.compose.material.ElevationDefaults INSTANCE = new androidx.compose.material.ElevationDefaults();

    private ElevationDefaults() {
    }

    public static androidx.compose.animation.core.AnimationSpec<androidx.compose.ui.unit.Dp> getHighSpeedVideoFpsRangesFor(androidx.compose.foundation.interaction.Interaction p0) {
        androidx.compose.animation.core.TweenSpec tweenSpec;
        androidx.compose.animation.core.TweenSpec tweenSpec2;
        androidx.compose.animation.core.TweenSpec tweenSpec3;
        androidx.compose.animation.core.TweenSpec tweenSpec4;
        if (p0 instanceof androidx.compose.foundation.interaction.PressInteraction.Press) {
            tweenSpec4 = androidx.compose.material.ElevationKt.getHighResolutionOutputSizeshNQ4ISI;
            return tweenSpec4;
        }
        if (p0 instanceof androidx.compose.foundation.interaction.DragInteraction.Start) {
            tweenSpec3 = androidx.compose.material.ElevationKt.getHighResolutionOutputSizeshNQ4ISI;
            return tweenSpec3;
        }
        if (p0 instanceof androidx.compose.foundation.interaction.HoverInteraction.Enter) {
            tweenSpec2 = androidx.compose.material.ElevationKt.getHighResolutionOutputSizeshNQ4ISI;
            return tweenSpec2;
        }
        if (!(p0 instanceof androidx.compose.foundation.interaction.FocusInteraction.Focus)) {
            return null;
        }
        tweenSpec = androidx.compose.material.ElevationKt.getHighResolutionOutputSizeshNQ4ISI;
        return tweenSpec;
    }

    public static androidx.compose.animation.core.AnimationSpec<androidx.compose.ui.unit.Dp> getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.interaction.Interaction p0) {
        androidx.compose.animation.core.TweenSpec tweenSpec;
        androidx.compose.animation.core.TweenSpec tweenSpec2;
        androidx.compose.animation.core.TweenSpec tweenSpec3;
        androidx.compose.animation.core.TweenSpec tweenSpec4;
        if (p0 instanceof androidx.compose.foundation.interaction.PressInteraction.Press) {
            tweenSpec4 = androidx.compose.material.ElevationKt.getHighSpeedVideoFpsRanges;
            return tweenSpec4;
        }
        if (p0 instanceof androidx.compose.foundation.interaction.DragInteraction.Start) {
            tweenSpec3 = androidx.compose.material.ElevationKt.getHighSpeedVideoFpsRanges;
            return tweenSpec3;
        }
        if (p0 instanceof androidx.compose.foundation.interaction.HoverInteraction.Enter) {
            tweenSpec2 = androidx.compose.material.ElevationKt.Camera2StreamConfigurationMap;
            return tweenSpec2;
        }
        if (!(p0 instanceof androidx.compose.foundation.interaction.FocusInteraction.Focus)) {
            return null;
        }
        tweenSpec = androidx.compose.material.ElevationKt.getHighSpeedVideoFpsRanges;
        return tweenSpec;
    }
}
