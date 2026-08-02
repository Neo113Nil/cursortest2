package androidx.compose.material.ripple;

@kotlin.Deprecated(message = "Replaced by the new RippleNode implementation")
@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0007¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001a\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001b\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\n0\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\"\u0010!R \u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020%0$8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b#\u0010&R\u0016\u0010)\u001a\u00020'8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b(\u0010\u001f"}, d2 = {"Landroidx/compose/material/ripple/CommonRippleIndicationInstance;", "Landroidx/compose/material/ripple/RippleIndicationInstance;", "Landroidx/compose/runtime/RememberObserver;", "", "p0", "Landroidx/compose/ui/unit/Dp;", "p1", "Landroidx/compose/runtime/State;", "Landroidx/compose/ui/graphics/Color;", "p2", "Landroidx/compose/material/ripple/RippleAlpha;", "p3", "<init>", "(ZFLandroidx/compose/runtime/State;Landroidx/compose/runtime/State;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "", "drawIndication", "(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;)V", "Landroidx/compose/foundation/interaction/PressInteraction$Press;", "Lkotlinx/coroutines/CoroutineScope;", "addRipple", "(Landroidx/compose/foundation/interaction/PressInteraction$Press;Lkotlinx/coroutines/CoroutineScope;)V", "removeRipple", "(Landroidx/compose/foundation/interaction/PressInteraction$Press;)V", "onRemembered", "()V", "onForgotten", "onAbandoned", "getHighResolutionOutputSizeshNQ4ISI", "Z", "getHighSpeedVideoSizes", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "Camera2StreamConfigurationMap", "Landroidx/compose/runtime/State;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/runtime/snapshots/SnapshotStateMap;", "Landroidx/compose/material/ripple/RippleAnimation;", "Landroidx/compose/runtime/snapshots/SnapshotStateMap;", "", "getHighSpeedVideoSizesFor", "getInputSizeshNQ4ISI"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class CommonRippleIndicationInstance extends androidx.compose.material.ripple.RippleIndicationInstance implements androidx.compose.runtime.RememberObserver {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final boolean getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.compose.runtime.State<androidx.compose.material.ripple.RippleAlpha> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.compose.runtime.snapshots.SnapshotStateMap<androidx.compose.foundation.interaction.PressInteraction.Press, androidx.compose.material.ripple.RippleAnimation> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final float Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private float getInputSizeshNQ4ISI;

    @Override // androidx.compose.runtime.RememberObserver
    public final void onRemembered() {
    }

    private CommonRippleIndicationInstance(boolean z, float f, androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> state, androidx.compose.runtime.State<androidx.compose.material.ripple.RippleAlpha> state2) {
        super(z, state2);
        this.getHighSpeedVideoSizes = z;
        this.Camera2StreamConfigurationMap = f;
        this.getHighResolutionOutputSizeshNQ4ISI = state;
        this.getHighSpeedVideoFpsRangesFor = state2;
        this.getHighSpeedVideoFpsRanges = androidx.compose.runtime.SnapshotStateKt.mutableStateMapOf();
        this.getInputSizeshNQ4ISI = Float.NaN;
    }

    @Override // androidx.compose.foundation.IndicationInstance
    public final void drawIndication(androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope) {
        float f;
        if (java.lang.Float.isNaN(this.Camera2StreamConfigurationMap)) {
            f = androidx.compose.material.ripple.RippleAnimationKt.m2854getRippleEndRadiuscSwnlzA(contentDrawScope, this.getHighSpeedVideoSizes, contentDrawScope.mo6531getSizeNHjbRc());
        } else {
            f = contentDrawScope.mo1418toPx0680j_4(this.Camera2StreamConfigurationMap);
        }
        this.getInputSizeshNQ4ISI = f;
        long m6006unboximpl = this.getHighResolutionOutputSizeshNQ4ISI.getValue().m6006unboximpl();
        contentDrawScope.drawContent();
        androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope2 = contentDrawScope;
        m2860drawStateLayerH2RKhps(contentDrawScope2, this.Camera2StreamConfigurationMap, m6006unboximpl);
        java.util.Iterator<java.util.Map.Entry<androidx.compose.foundation.interaction.PressInteraction.Press, androidx.compose.material.ripple.RippleAnimation>> it = this.getHighSpeedVideoFpsRanges.entrySet().iterator();
        while (it.hasNext()) {
            androidx.compose.material.ripple.RippleAnimation value = it.next().getValue();
            float pressedAlpha = this.getHighSpeedVideoFpsRangesFor.getValue().getPressedAlpha();
            if (pressedAlpha != 0.0f) {
                value.m2853draw4WTKRHQ(contentDrawScope2, androidx.compose.ui.graphics.Color.m5995copywmQWz5c$default(m6006unboximpl, pressedAlpha, 0.0f, 0.0f, 0.0f, 14, null));
            }
        }
    }

    @Override // androidx.compose.material.ripple.RippleIndicationInstance
    public final void addRipple(androidx.compose.foundation.interaction.PressInteraction.Press p0, kotlinx.coroutines.CoroutineScope p1) {
        java.util.Iterator<java.util.Map.Entry<androidx.compose.foundation.interaction.PressInteraction.Press, androidx.compose.material.ripple.RippleAnimation>> it = this.getHighSpeedVideoFpsRanges.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().finish();
        }
        androidx.compose.material.ripple.RippleAnimation rippleAnimation = new androidx.compose.material.ripple.RippleAnimation(this.getHighSpeedVideoSizes ? androidx.compose.ui.geometry.Offset.m5741boximpl(p0.getPressPosition()) : null, this.getInputSizeshNQ4ISI, this.getHighSpeedVideoSizes, null);
        this.getHighSpeedVideoFpsRanges.put(p0, rippleAnimation);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(p1, null, null, new androidx.compose.material.ripple.CommonRippleIndicationInstance$addRipple$2(rippleAnimation, this, p0, null), 3, null);
    }

    @Override // androidx.compose.material.ripple.RippleIndicationInstance
    public final void removeRipple(androidx.compose.foundation.interaction.PressInteraction.Press p0) {
        androidx.compose.material.ripple.RippleAnimation rippleAnimation = this.getHighSpeedVideoFpsRanges.get(p0);
        if (rippleAnimation != null) {
            rippleAnimation.finish();
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onForgotten() {
        this.getHighSpeedVideoFpsRanges.clear();
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onAbandoned() {
        this.getHighSpeedVideoFpsRanges.clear();
    }

    public /* synthetic */ CommonRippleIndicationInstance(boolean z, float f, androidx.compose.runtime.State state, androidx.compose.runtime.State state2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(z, f, state, state2);
    }
}
