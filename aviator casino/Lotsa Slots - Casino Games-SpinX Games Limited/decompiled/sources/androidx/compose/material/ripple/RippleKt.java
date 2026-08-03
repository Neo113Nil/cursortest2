package androidx.compose.material.ripple;

/* compiled from: Ripple.kt */
@kotlin.Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002\u001a\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002\u001a3\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0012"}, d2 = {"DefaultTweenSpec", "Landroidx/compose/animation/core/TweenSpec;", "", "incomingStateLayerAnimationSpecFor", "Landroidx/compose/animation/core/AnimationSpec;", "interaction", "Landroidx/compose/foundation/interaction/Interaction;", "outgoingStateLayerAnimationSpecFor", "rememberRipple", "Landroidx/compose/foundation/Indication;", "bounded", "", com.helpshift.proactive.InAppViewConstants.RADIUS, "Landroidx/compose/ui/unit/Dp;", "color", "Landroidx/compose/ui/graphics/Color;", "rememberRipple-9IZ8Weo", "(ZFJLandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/Indication;", "material-ripple_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RippleKt {
    private static final androidx.compose.animation.core.TweenSpec<java.lang.Float> DefaultTweenSpec = new androidx.compose.animation.core.TweenSpec<>(15, 0, androidx.compose.animation.core.EasingKt.getLinearEasing(), 2, null);

    /* renamed from: rememberRipple-9IZ8Weo, reason: not valid java name */
    public static final androidx.compose.foundation.Indication m1601rememberRipple9IZ8Weo(boolean z, float f, long j, androidx.compose.runtime.Composer composer, int i, int i2) {
        composer.startReplaceableGroup(1635163520);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(rememberRipple)P(!1,2:c#ui.unit.Dp,1:c#ui.graphics.Color)81@3890L27,82@3929L85:Ripple.kt#vhb33q");
        if ((i2 & 1) != 0) {
            z = true;
        }
        if ((i2 & 2) != 0) {
            f = androidx.compose.ui.unit.Dp.INSTANCE.m4498getUnspecifiedD9Ej5fM();
        }
        if ((i2 & 4) != 0) {
            j = androidx.compose.ui.graphics.Color.INSTANCE.m2149getUnspecified0d7_KjU();
        }
        androidx.compose.runtime.State rememberUpdatedState = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(androidx.compose.ui.graphics.Color.m2103boximpl(j), composer, (i >> 6) & 14);
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z);
        androidx.compose.ui.unit.Dp m4476boximpl = androidx.compose.ui.unit.Dp.m4476boximpl(f);
        composer.startReplaceableGroup(-3686552);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(remember)P(1,2):Composables.kt#9igjgp");
        boolean changed = composer.changed(valueOf) | composer.changed(m4476boximpl);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new androidx.compose.material.ripple.PlatformRipple(z, f, rememberUpdatedState, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        return (androidx.compose.material.ripple.PlatformRipple) rememberedValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.animation.core.AnimationSpec<java.lang.Float> incomingStateLayerAnimationSpecFor(androidx.compose.foundation.interaction.Interaction interaction) {
        if (interaction instanceof androidx.compose.foundation.interaction.HoverInteraction.Enter) {
            return DefaultTweenSpec;
        }
        if (!(interaction instanceof androidx.compose.foundation.interaction.FocusInteraction.Focus) && !(interaction instanceof androidx.compose.foundation.interaction.DragInteraction.Start)) {
            return DefaultTweenSpec;
        }
        return new androidx.compose.animation.core.TweenSpec(45, 0, androidx.compose.animation.core.EasingKt.getLinearEasing(), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.animation.core.AnimationSpec<java.lang.Float> outgoingStateLayerAnimationSpecFor(androidx.compose.foundation.interaction.Interaction interaction) {
        if (!(interaction instanceof androidx.compose.foundation.interaction.HoverInteraction.Enter) && !(interaction instanceof androidx.compose.foundation.interaction.FocusInteraction.Focus)) {
            return interaction instanceof androidx.compose.foundation.interaction.DragInteraction.Start ? new androidx.compose.animation.core.TweenSpec(androidx.compose.material.TextFieldImplKt.AnimationDuration, 0, androidx.compose.animation.core.EasingKt.getLinearEasing(), 2, null) : DefaultTweenSpec;
        }
        return DefaultTweenSpec;
    }
}
