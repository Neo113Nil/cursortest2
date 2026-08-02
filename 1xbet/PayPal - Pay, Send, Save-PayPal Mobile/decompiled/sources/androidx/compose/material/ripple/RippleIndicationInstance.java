package androidx.compose.material.ripple;

@kotlin.Deprecated(message = "Replaced by the new RippleNode implementation")
@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\b!\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0013\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u001c\u001a\u00020\r*\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010!"}, d2 = {"Landroidx/compose/material/ripple/RippleIndicationInstance;", "Landroidx/compose/foundation/IndicationInstance;", "", "bounded", "Landroidx/compose/runtime/State;", "Landroidx/compose/material/ripple/RippleAlpha;", "rippleAlpha", "<init>", "(ZLandroidx/compose/runtime/State;)V", "Landroidx/compose/foundation/interaction/PressInteraction$Press;", "interaction", "Lkotlinx/coroutines/CoroutineScope;", com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY, "", "addRipple", "(Landroidx/compose/foundation/interaction/PressInteraction$Press;Lkotlinx/coroutines/CoroutineScope;)V", "removeRipple", "(Landroidx/compose/foundation/interaction/PressInteraction$Press;)V", "Landroidx/compose/foundation/interaction/Interaction;", "updateStateLayer$material_ripple", "(Landroidx/compose/foundation/interaction/Interaction;Lkotlinx/coroutines/CoroutineScope;)V", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Landroidx/compose/ui/unit/Dp;", "radius", "Landroidx/compose/ui/graphics/Color;", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_COLOR, "drawStateLayer-H2RKhps", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FJ)V", "drawStateLayer", "getHighSpeedVideoFpsRangesFor", "Z", "Camera2StreamConfigurationMap", "Landroidx/compose/material/ripple/StateLayer;", "Landroidx/compose/material/ripple/StateLayer;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class RippleIndicationInstance implements androidx.compose.foundation.IndicationInstance {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.compose.material.ripple.StateLayer getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final boolean Camera2StreamConfigurationMap;

    public abstract void addRipple(androidx.compose.foundation.interaction.PressInteraction.Press interaction, kotlinx.coroutines.CoroutineScope scope);

    public abstract void removeRipple(androidx.compose.foundation.interaction.PressInteraction.Press interaction);

    public RippleIndicationInstance(boolean z, final androidx.compose.runtime.State<androidx.compose.material.ripple.RippleAlpha> state) {
        this.Camera2StreamConfigurationMap = z;
        this.getHighSpeedVideoSizes = new androidx.compose.material.ripple.StateLayer(z, new kotlin.jvm.functions.Function0() { // from class: androidx.compose.material.ripple.RippleIndicationInstance$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                androidx.compose.material.ripple.RippleAlpha highResolutionOutputSizeshNQ4ISI;
                highResolutionOutputSizeshNQ4ISI = androidx.compose.material.ripple.RippleIndicationInstance.getHighResolutionOutputSizeshNQ4ISI(androidx.compose.runtime.State.this);
                return highResolutionOutputSizeshNQ4ISI;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.material.ripple.RippleAlpha getHighResolutionOutputSizeshNQ4ISI(androidx.compose.runtime.State state) {
        return (androidx.compose.material.ripple.RippleAlpha) state.getValue();
    }

    public final void updateStateLayer$material_ripple(androidx.compose.foundation.interaction.Interaction interaction, kotlinx.coroutines.CoroutineScope scope) {
        this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor(interaction, scope);
    }

    /* renamed from: drawStateLayer-H2RKhps, reason: not valid java name */
    public final void m2860drawStateLayerH2RKhps(androidx.compose.ui.graphics.drawscope.DrawScope drawScope, float f, long j) {
        float f2;
        androidx.compose.material.ripple.StateLayer stateLayer = this.getHighSpeedVideoSizes;
        if (java.lang.Float.isNaN(f)) {
            f2 = androidx.compose.material.ripple.RippleAnimationKt.m2854getRippleEndRadiuscSwnlzA(drawScope, this.Camera2StreamConfigurationMap, drawScope.mo6531getSizeNHjbRc());
        } else {
            f2 = drawScope.mo1418toPx0680j_4(f);
        }
        stateLayer.getHighSpeedVideoSizes(drawScope, f2, j);
    }
}
