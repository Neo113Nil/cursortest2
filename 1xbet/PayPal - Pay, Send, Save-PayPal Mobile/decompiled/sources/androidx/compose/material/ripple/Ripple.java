package androidx.compose.material.ripple;

@kotlin.Deprecated(message = "Replaced by the new RippleNode implementation")
@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\b!\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJC\u0010\u0015\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0006H&¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b#\u0010$"}, d2 = {"Landroidx/compose/material/ripple/Ripple;", "Landroidx/compose/foundation/Indication;", "", "bounded", "Landroidx/compose/ui/unit/Dp;", "radius", "Landroidx/compose/runtime/State;", "Landroidx/compose/ui/graphics/Color;", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_COLOR, "<init>", "(ZFLandroidx/compose/runtime/State;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/foundation/interaction/InteractionSource;", "interactionSource", "Landroidx/compose/foundation/IndicationInstance;", "rememberUpdatedInstance", "(Landroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/IndicationInstance;", "Landroidx/compose/material/ripple/RippleAlpha;", "rippleAlpha", "Landroidx/compose/material/ripple/RippleIndicationInstance;", "rememberUpdatedRippleInstance-942rkJo", "(Landroidx/compose/foundation/interaction/InteractionSource;ZFLandroidx/compose/runtime/State;Landroidx/compose/runtime/State;Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/ripple/RippleIndicationInstance;", "rememberUpdatedRippleInstance", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "getHighResolutionOutputSizeshNQ4ISI", "Z", "Camera2StreamConfigurationMap", "getHighSpeedVideoSizes", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoFpsRanges", "Landroidx/compose/runtime/State;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class Ripple implements androidx.compose.foundation.Indication {
    public static final int $stable = 0;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final boolean Camera2StreamConfigurationMap;
    private final androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final float getHighSpeedVideoFpsRangesFor;

    /* renamed from: rememberUpdatedRippleInstance-942rkJo */
    public abstract androidx.compose.material.ripple.RippleIndicationInstance mo2851rememberUpdatedRippleInstance942rkJo(androidx.compose.foundation.interaction.InteractionSource interactionSource, boolean z, float f, androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> state, androidx.compose.runtime.State<androidx.compose.material.ripple.RippleAlpha> state2, androidx.compose.runtime.Composer composer, int i);

    private Ripple(boolean z, float f, androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> state) {
        this.Camera2StreamConfigurationMap = z;
        this.getHighSpeedVideoFpsRangesFor = f;
        this.getHighSpeedVideoFpsRanges = state;
    }

    @Override // androidx.compose.foundation.Indication
    @kotlin.Deprecated(message = "Super method is deprecated")
    public final androidx.compose.foundation.IndicationInstance rememberUpdatedInstance(androidx.compose.foundation.interaction.InteractionSource interactionSource, androidx.compose.runtime.Composer composer, int i) {
        long mo2852defaultColorWaAFU9c;
        composer.startReplaceGroup(988743187);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(988743187, i, -1, "androidx.compose.material.ripple.Ripple.rememberUpdatedInstance (Ripple.kt:190)");
        }
        androidx.compose.material.ripple.RippleTheme rippleTheme = (androidx.compose.material.ripple.RippleTheme) composer.consume(androidx.compose.material.ripple.RippleThemeKt.getLocalRippleTheme());
        if (this.getHighSpeedVideoFpsRanges.getValue().m6006unboximpl() != 16) {
            composer.startReplaceGroup(762841340);
            composer.endReplaceGroup();
            mo2852defaultColorWaAFU9c = this.getHighSpeedVideoFpsRanges.getValue().m6006unboximpl();
        } else {
            composer.startReplaceGroup(762899124);
            mo2852defaultColorWaAFU9c = rippleTheme.mo2852defaultColorWaAFU9c(composer, 0);
            composer.endReplaceGroup();
        }
        androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> rememberUpdatedState = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(androidx.compose.ui.graphics.Color.m5986boximpl(mo2852defaultColorWaAFU9c), composer, 0);
        androidx.compose.runtime.State<androidx.compose.material.ripple.RippleAlpha> rememberUpdatedState2 = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(rippleTheme.rippleAlpha(composer, 0), composer, 0);
        int i2 = i & 14;
        androidx.compose.material.ripple.RippleIndicationInstance mo2851rememberUpdatedRippleInstance942rkJo = mo2851rememberUpdatedRippleInstance942rkJo(interactionSource, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, rememberUpdatedState, rememberUpdatedState2, composer, i2 | ((i << 12) & 458752));
        boolean z = ((i2 ^ 6) > 4 && composer.changed(interactionSource)) || (i & 6) == 4;
        boolean changedInstance = composer.changedInstance(mo2851rememberUpdatedRippleInstance942rkJo);
        androidx.compose.material.ripple.Ripple$rememberUpdatedInstance$1$1 rememberedValue = composer.rememberedValue();
        if ((changedInstance | z) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new androidx.compose.material.ripple.Ripple$rememberUpdatedInstance$1$1(interactionSource, mo2851rememberUpdatedRippleInstance942rkJo, null);
            composer.updateRememberedValue(rememberedValue);
        }
        androidx.compose.runtime.EffectsKt.LaunchedEffect(mo2851rememberUpdatedRippleInstance942rkJo, interactionSource, (kotlin.jvm.functions.Function2) rememberedValue, composer, (i << 3) & 112);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return mo2851rememberUpdatedRippleInstance942rkJo;
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.compose.material.ripple.Ripple)) {
            return false;
        }
        androidx.compose.material.ripple.Ripple ripple = (androidx.compose.material.ripple.Ripple) other;
        return this.Camera2StreamConfigurationMap == ripple.Camera2StreamConfigurationMap && androidx.compose.ui.unit.Dp.m8606equalsimpl0(this.getHighSpeedVideoFpsRangesFor, ripple.getHighSpeedVideoFpsRangesFor) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRanges, ripple.getHighSpeedVideoFpsRanges);
    }

    public int hashCode() {
        return (((java.lang.Boolean.hashCode(this.Camera2StreamConfigurationMap) * 31) + androidx.compose.ui.unit.Dp.m8607hashCodeimpl(this.getHighSpeedVideoFpsRangesFor)) * 31) + this.getHighSpeedVideoFpsRanges.hashCode();
    }

    public /* synthetic */ Ripple(boolean z, float f, androidx.compose.runtime.State state, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(z, f, state);
    }
}
