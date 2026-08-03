package androidx.compose.material.ripple;

/* compiled from: Ripple.kt */
@kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0014J'\u0010\u0015\u001a\u00020\u0011*\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001d"}, d2 = {"Landroidx/compose/material/ripple/StateLayer;", "", "bounded", "", "rippleAlpha", "Landroidx/compose/runtime/State;", "Landroidx/compose/material/ripple/RippleAlpha;", "(ZLandroidx/compose/runtime/State;)V", "animatedAlpha", "Landroidx/compose/animation/core/Animatable;", "", "Landroidx/compose/animation/core/AnimationVector1D;", "currentInteraction", "Landroidx/compose/foundation/interaction/Interaction;", "interactions", "", "handleInteraction", "", "interaction", "scope", "Lkotlinx/coroutines/CoroutineScope;", "drawStateLayer", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", com.helpshift.proactive.InAppViewConstants.RADIUS, "Landroidx/compose/ui/unit/Dp;", "color", "Landroidx/compose/ui/graphics/Color;", "drawStateLayer-H2RKhps", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FJ)V", "material-ripple_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
final class StateLayer {
    private final androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> animatedAlpha;
    private final boolean bounded;
    private androidx.compose.foundation.interaction.Interaction currentInteraction;
    private final java.util.List<androidx.compose.foundation.interaction.Interaction> interactions;
    private final androidx.compose.runtime.State<androidx.compose.material.ripple.RippleAlpha> rippleAlpha;

    public StateLayer(boolean z, androidx.compose.runtime.State<androidx.compose.material.ripple.RippleAlpha> rippleAlpha) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rippleAlpha, "rippleAlpha");
        this.bounded = z;
        this.rippleAlpha = rippleAlpha;
        this.animatedAlpha = androidx.compose.animation.core.AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
        this.interactions = new java.util.ArrayList();
    }

    public final void handleInteraction(androidx.compose.foundation.interaction.Interaction interaction, kotlinx.coroutines.CoroutineScope scope) {
        androidx.compose.animation.core.AnimationSpec outgoingStateLayerAnimationSpecFor;
        float draggedAlpha;
        androidx.compose.animation.core.AnimationSpec incomingStateLayerAnimationSpecFor;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(interaction, "interaction");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "scope");
        boolean z = interaction instanceof androidx.compose.foundation.interaction.HoverInteraction.Enter;
        if (z) {
            this.interactions.add(interaction);
        } else if (interaction instanceof androidx.compose.foundation.interaction.HoverInteraction.Exit) {
            this.interactions.remove(((androidx.compose.foundation.interaction.HoverInteraction.Exit) interaction).getEnter());
        } else if (interaction instanceof androidx.compose.foundation.interaction.FocusInteraction.Focus) {
            this.interactions.add(interaction);
        } else if (interaction instanceof androidx.compose.foundation.interaction.FocusInteraction.Unfocus) {
            this.interactions.remove(((androidx.compose.foundation.interaction.FocusInteraction.Unfocus) interaction).getFocus());
        } else if (interaction instanceof androidx.compose.foundation.interaction.DragInteraction.Start) {
            this.interactions.add(interaction);
        } else if (interaction instanceof androidx.compose.foundation.interaction.DragInteraction.Stop) {
            this.interactions.remove(((androidx.compose.foundation.interaction.DragInteraction.Stop) interaction).getStart());
        } else if (!(interaction instanceof androidx.compose.foundation.interaction.DragInteraction.Cancel)) {
            return;
        } else {
            this.interactions.remove(((androidx.compose.foundation.interaction.DragInteraction.Cancel) interaction).getStart());
        }
        androidx.compose.foundation.interaction.Interaction interaction2 = (androidx.compose.foundation.interaction.Interaction) kotlin.collections.CollectionsKt.lastOrNull((java.util.List) this.interactions);
        if (kotlin.jvm.internal.Intrinsics.areEqual(this.currentInteraction, interaction2)) {
            return;
        }
        if (interaction2 != null) {
            if (z) {
                draggedAlpha = this.rippleAlpha.getValue().getHoveredAlpha();
            } else if (interaction instanceof androidx.compose.foundation.interaction.FocusInteraction.Focus) {
                draggedAlpha = this.rippleAlpha.getValue().getFocusedAlpha();
            } else {
                draggedAlpha = interaction instanceof androidx.compose.foundation.interaction.DragInteraction.Start ? this.rippleAlpha.getValue().getDraggedAlpha() : 0.0f;
            }
            incomingStateLayerAnimationSpecFor = androidx.compose.material.ripple.RippleKt.incomingStateLayerAnimationSpecFor(interaction2);
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(scope, null, null, new androidx.compose.material.ripple.StateLayer$handleInteraction$1(this, draggedAlpha, incomingStateLayerAnimationSpecFor, null), 3, null);
        } else {
            outgoingStateLayerAnimationSpecFor = androidx.compose.material.ripple.RippleKt.outgoingStateLayerAnimationSpecFor(this.currentInteraction);
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(scope, null, null, new androidx.compose.material.ripple.StateLayer$handleInteraction$2(this, outgoingStateLayerAnimationSpecFor, null), 3, null);
        }
        this.currentInteraction = interaction2;
    }

    /* renamed from: drawStateLayer-H2RKhps, reason: not valid java name */
    public final void m1604drawStateLayerH2RKhps(androidx.compose.ui.graphics.drawscope.DrawScope drawStateLayer, float f, long j) {
        float f2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(drawStateLayer, "$this$drawStateLayer");
        if (java.lang.Float.isNaN(f)) {
            f2 = androidx.compose.material.ripple.RippleAnimationKt.m1595getRippleEndRadiuscSwnlzA(drawStateLayer, this.bounded, drawStateLayer.mo2592getSizeNHjbRc());
        } else {
            f2 = drawStateLayer.mo315toPx0680j_4(f);
        }
        float f3 = f2;
        float floatValue = this.animatedAlpha.getValue().floatValue();
        if (floatValue > 0.0f) {
            long m2112copywmQWz5c$default = androidx.compose.ui.graphics.Color.m2112copywmQWz5c$default(j, floatValue, 0.0f, 0.0f, 0.0f, 14, null);
            if (this.bounded) {
                float m1940getWidthimpl = androidx.compose.ui.geometry.Size.m1940getWidthimpl(drawStateLayer.mo2592getSizeNHjbRc());
                float m1937getHeightimpl = androidx.compose.ui.geometry.Size.m1937getHeightimpl(drawStateLayer.mo2592getSizeNHjbRc());
                int m2102getIntersectrtfAjoo = androidx.compose.ui.graphics.ClipOp.INSTANCE.m2102getIntersectrtfAjoo();
                androidx.compose.ui.graphics.drawscope.DrawContext drawContext = drawStateLayer.getDrawContext();
                long mo2598getSizeNHjbRc = drawContext.mo2598getSizeNHjbRc();
                drawContext.getCanvas().save();
                drawContext.getTransform().mo2601clipRectN_I0leg(0.0f, 0.0f, m1940getWidthimpl, m1937getHeightimpl, m2102getIntersectrtfAjoo);
                androidx.compose.ui.graphics.drawscope.DrawScope.CC.m2659drawCircleVaOC9Bg$default(drawStateLayer, m2112copywmQWz5c$default, f3, 0L, 0.0f, null, null, 0, 124, null);
                drawContext.getCanvas().restore();
                drawContext.mo2599setSizeuvyYCjk(mo2598getSizeNHjbRc);
                return;
            }
            androidx.compose.ui.graphics.drawscope.DrawScope.CC.m2659drawCircleVaOC9Bg$default(drawStateLayer, m2112copywmQWz5c$default, f3, 0L, 0.0f, null, null, 0, 124, null);
        }
    }
}
