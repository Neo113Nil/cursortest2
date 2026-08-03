package androidx.compose.material.ripple;

/* compiled from: Ripple.kt */
@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH&J\u0010\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH&J\u001d\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u000fH\u0000¢\u0006\u0002\b\u0013J'\u0010\u0014\u001a\u00020\u000b*\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001c"}, d2 = {"Landroidx/compose/material/ripple/RippleIndicationInstance;", "Landroidx/compose/foundation/IndicationInstance;", "bounded", "", "rippleAlpha", "Landroidx/compose/runtime/State;", "Landroidx/compose/material/ripple/RippleAlpha;", "(ZLandroidx/compose/runtime/State;)V", "stateLayer", "Landroidx/compose/material/ripple/StateLayer;", "addRipple", "", "interaction", "Landroidx/compose/foundation/interaction/PressInteraction$Press;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "removeRipple", "updateStateLayer", "Landroidx/compose/foundation/interaction/Interaction;", "updateStateLayer$material_ripple_release", "drawStateLayer", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", com.helpshift.proactive.InAppViewConstants.RADIUS, "Landroidx/compose/ui/unit/Dp;", "color", "Landroidx/compose/ui/graphics/Color;", "drawStateLayer-H2RKhps", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FJ)V", "material-ripple_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class RippleIndicationInstance implements androidx.compose.foundation.IndicationInstance {
    private final androidx.compose.material.ripple.StateLayer stateLayer;

    public abstract void addRipple(androidx.compose.foundation.interaction.PressInteraction.Press interaction, kotlinx.coroutines.CoroutineScope scope);

    public abstract void removeRipple(androidx.compose.foundation.interaction.PressInteraction.Press interaction);

    public RippleIndicationInstance(boolean z, androidx.compose.runtime.State<androidx.compose.material.ripple.RippleAlpha> rippleAlpha) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rippleAlpha, "rippleAlpha");
        this.stateLayer = new androidx.compose.material.ripple.StateLayer(z, rippleAlpha);
    }

    public final void updateStateLayer$material_ripple_release(androidx.compose.foundation.interaction.Interaction interaction, kotlinx.coroutines.CoroutineScope scope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(interaction, "interaction");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "scope");
        this.stateLayer.handleInteraction(interaction, scope);
    }

    /* renamed from: drawStateLayer-H2RKhps, reason: not valid java name */
    public final void m1600drawStateLayerH2RKhps(androidx.compose.ui.graphics.drawscope.DrawScope drawStateLayer, float f, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(drawStateLayer, "$this$drawStateLayer");
        this.stateLayer.m1604drawStateLayerH2RKhps(drawStateLayer, f, j);
    }
}
