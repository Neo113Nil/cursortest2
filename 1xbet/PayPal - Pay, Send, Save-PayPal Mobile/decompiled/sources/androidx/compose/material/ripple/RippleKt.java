package androidx.compose.material.ripple;

@kotlin.Metadata(d1 = {"\u0000P\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a;\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\r\u0010\u000e\u001a-\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0017\u001a\u00020\u0018H\u0002\u001a\u0018\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0002\"\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00160\u001bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"createRippleModifierNode", "Landroidx/compose/ui/node/DelegatableNode;", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "bounded", "", "radius", "Landroidx/compose/ui/unit/Dp;", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_COLOR, "Landroidx/compose/ui/graphics/ColorProducer;", "rippleAlpha", "Lkotlin/Function0;", "Landroidx/compose/material/ripple/RippleAlpha;", "createRippleModifierNode-TDGSqEk", "(Landroidx/compose/foundation/interaction/InteractionSource;ZFLandroidx/compose/ui/graphics/ColorProducer;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/node/DelegatableNode;", "rememberRipple", "Landroidx/compose/foundation/Indication;", "Landroidx/compose/ui/graphics/Color;", "rememberRipple-9IZ8Weo", "(ZFJLandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/Indication;", "incomingStateLayerAnimationSpecFor", "Landroidx/compose/animation/core/AnimationSpec;", "", "interaction", "Landroidx/compose/foundation/interaction/Interaction;", "outgoingStateLayerAnimationSpecFor", "DefaultTweenSpec", "Landroidx/compose/animation/core/TweenSpec;", "material-ripple"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RippleKt {
    private static final androidx.compose.animation.core.TweenSpec<java.lang.Float> getHighSpeedVideoSizes = new androidx.compose.animation.core.TweenSpec<>(15, 0, androidx.compose.animation.core.EasingKt.getLinearEasing(), 2, null);

    /* renamed from: createRippleModifierNode-TDGSqEk, reason: not valid java name */
    public static final androidx.compose.ui.node.DelegatableNode m2861createRippleModifierNodeTDGSqEk(androidx.compose.foundation.interaction.InteractionSource interactionSource, boolean z, float f, androidx.compose.ui.graphics.ColorProducer colorProducer, kotlin.jvm.functions.Function0<androidx.compose.material.ripple.RippleAlpha> function0) {
        return androidx.compose.material.ripple.Ripple_androidKt.m2867createPlatformRippleNodeTDGSqEk(interactionSource, z, f, colorProducer, function0);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "rememberRipple has been deprecated - it returns an old Indication implementation that is not compatible with the new Indication APIs that provide notable performance improvements. Instead, use the new ripple APIs provided by design system libraries, such as material and material3. If you are implementing your own design system library, use createRippleNode to create your own custom ripple implementation that queries your own theme values. For a migration guide and background information, please visit developer.android.com")
    /* renamed from: rememberRipple-9IZ8Weo, reason: not valid java name */
    public static final androidx.compose.foundation.Indication m2862rememberRipple9IZ8Weo(boolean z, float f, long j, androidx.compose.runtime.Composer composer, int i, int i2) {
        boolean z2 = true;
        if ((i2 & 1) != 0) {
            z = true;
        }
        if ((i2 & 2) != 0) {
            f = androidx.compose.ui.unit.Dp.INSTANCE.m8621getUnspecifiedD9Ej5fM();
        }
        if ((i2 & 4) != 0) {
            j = androidx.compose.ui.graphics.Color.INSTANCE.m6032getUnspecified0d7_KjU();
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1635163520, i, -1, "androidx.compose.material.ripple.rememberRipple (Ripple.kt:144)");
        }
        androidx.compose.runtime.State rememberUpdatedState = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(androidx.compose.ui.graphics.Color.m5986boximpl(j), composer, (i >> 6) & 14);
        boolean z3 = (((i & 14) ^ 6) > 4 && composer.changed(z)) || (i & 6) == 4;
        if ((((i & 112) ^ 48) <= 32 || !composer.changed(f)) && (i & 48) != 32) {
            z2 = false;
        }
        java.lang.Object rememberedValue = composer.rememberedValue();
        if ((z3 | z2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new androidx.compose.material.ripple.PlatformRipple(z, f, rememberUpdatedState, null);
            composer.updateRememberedValue(rememberedValue);
        }
        androidx.compose.material.ripple.PlatformRipple platformRipple = (androidx.compose.material.ripple.PlatformRipple) rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return platformRipple;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.animation.core.AnimationSpec<java.lang.Float> getHighSpeedVideoFpsRanges(androidx.compose.foundation.interaction.Interaction interaction) {
        if (interaction instanceof androidx.compose.foundation.interaction.HoverInteraction.Enter) {
            return getHighSpeedVideoSizes;
        }
        if (!(interaction instanceof androidx.compose.foundation.interaction.FocusInteraction.Focus) && !(interaction instanceof androidx.compose.foundation.interaction.DragInteraction.Start)) {
            return getHighSpeedVideoSizes;
        }
        return new androidx.compose.animation.core.TweenSpec(45, 0, androidx.compose.animation.core.EasingKt.getLinearEasing(), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.animation.core.AnimationSpec<java.lang.Float> getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.interaction.Interaction interaction) {
        if (!(interaction instanceof androidx.compose.foundation.interaction.HoverInteraction.Enter) && !(interaction instanceof androidx.compose.foundation.interaction.FocusInteraction.Focus)) {
            return interaction instanceof androidx.compose.foundation.interaction.DragInteraction.Start ? new androidx.compose.animation.core.TweenSpec(150, 0, androidx.compose.animation.core.EasingKt.getLinearEasing(), 2, null) : getHighSpeedVideoSizes;
        }
        return getHighSpeedVideoSizes;
    }
}
