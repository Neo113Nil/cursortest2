package androidx.compose.material.ripple;

@kotlin.Deprecated(message = "Replaced by the new RippleNode implementation")
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJC\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Landroidx/compose/material/ripple/CommonRipple;", "Landroidx/compose/material/ripple/Ripple;", "", "bounded", "Landroidx/compose/ui/unit/Dp;", "radius", "Landroidx/compose/runtime/State;", "Landroidx/compose/ui/graphics/Color;", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_COLOR, "<init>", "(ZFLandroidx/compose/runtime/State;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/foundation/interaction/InteractionSource;", "interactionSource", "Landroidx/compose/material/ripple/RippleAlpha;", "rippleAlpha", "Landroidx/compose/material/ripple/RippleIndicationInstance;", "rememberUpdatedRippleInstance-942rkJo", "(Landroidx/compose/foundation/interaction/InteractionSource;ZFLandroidx/compose/runtime/State;Landroidx/compose/runtime/State;Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/ripple/RippleIndicationInstance;", "rememberUpdatedRippleInstance"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CommonRipple extends androidx.compose.material.ripple.Ripple {
    public static final int $stable = 0;

    private CommonRipple(boolean z, float f, androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> state) {
        super(z, f, state, null);
    }

    @Override // androidx.compose.material.ripple.Ripple
    /* renamed from: rememberUpdatedRippleInstance-942rkJo, reason: not valid java name */
    public final androidx.compose.material.ripple.RippleIndicationInstance mo2851rememberUpdatedRippleInstance942rkJo(androidx.compose.foundation.interaction.InteractionSource interactionSource, boolean z, float f, androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> state, androidx.compose.runtime.State<androidx.compose.material.ripple.RippleAlpha> state2, androidx.compose.runtime.Composer composer, int i) {
        composer.startReplaceGroup(-1768051227);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1768051227, i, -1, "androidx.compose.material.ripple.CommonRipple.rememberUpdatedRippleInstance (CommonRipple.kt:56)");
        }
        boolean z2 = true;
        boolean z3 = (((i & 14) ^ 6) > 4 && composer.changed(interactionSource)) || (i & 6) == 4;
        if ((((458752 & i) ^ androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) <= 131072 || !composer.changed(this)) && (i & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 131072) {
            z2 = false;
        }
        java.lang.Object rememberedValue = composer.rememberedValue();
        if ((z3 | z2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new androidx.compose.material.ripple.CommonRippleIndicationInstance(z, f, state, state2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        androidx.compose.material.ripple.CommonRippleIndicationInstance commonRippleIndicationInstance = (androidx.compose.material.ripple.CommonRippleIndicationInstance) rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return commonRippleIndicationInstance;
    }

    public /* synthetic */ CommonRipple(boolean z, float f, androidx.compose.runtime.State state, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(z, f, state);
    }
}
