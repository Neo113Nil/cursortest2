package androidx.compose.material.ripple;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\nH\u0000¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0011\u001a\u00020\u000b*\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0013R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00180\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\t0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001bR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d"}, d2 = {"Landroidx/compose/material/ripple/StateLayer;", "", "", "p0", "Lkotlin/Function0;", "Landroidx/compose/material/ripple/RippleAlpha;", "p1", "<init>", "(ZLkotlin/jvm/functions/Function0;)V", "Landroidx/compose/foundation/interaction/Interaction;", "Lkotlinx/coroutines/CoroutineScope;", "", "getHighSpeedVideoFpsRangesFor", "(Landroidx/compose/foundation/interaction/Interaction;Lkotlinx/coroutines/CoroutineScope;)V", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "", "Landroidx/compose/ui/graphics/Color;", "getHighSpeedVideoSizes", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FJ)V", "Z", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/jvm/functions/Function0;", "Camera2StreamConfigurationMap", "Landroidx/compose/animation/core/Animatable;", "Landroidx/compose/animation/core/AnimationVector1D;", "Landroidx/compose/animation/core/Animatable;", "", "Ljava/util/List;", "getHighSpeedVideoFpsRanges", "Landroidx/compose/foundation/interaction/Interaction;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class StateLayer {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function0<androidx.compose.material.ripple.RippleAlpha> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private androidx.compose.foundation.interaction.Interaction getHighResolutionOutputSizeshNQ4ISI;
    private final boolean getHighSpeedVideoFpsRangesFor;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> getHighSpeedVideoSizes = androidx.compose.animation.core.AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.util.List<androidx.compose.foundation.interaction.Interaction> getHighSpeedVideoFpsRanges = new java.util.ArrayList();

    public StateLayer(boolean z, kotlin.jvm.functions.Function0<androidx.compose.material.ripple.RippleAlpha> function0) {
        this.getHighSpeedVideoFpsRangesFor = z;
        this.Camera2StreamConfigurationMap = function0;
    }

    public final void getHighSpeedVideoFpsRangesFor(androidx.compose.foundation.interaction.Interaction p0, kotlinx.coroutines.CoroutineScope p1) {
        androidx.compose.animation.core.AnimationSpec highResolutionOutputSizeshNQ4ISI;
        float draggedAlpha;
        androidx.compose.animation.core.AnimationSpec highSpeedVideoFpsRanges;
        if (p0 instanceof androidx.compose.foundation.interaction.HoverInteraction.Enter) {
            this.getHighSpeedVideoFpsRanges.add(p0);
        } else if (p0 instanceof androidx.compose.foundation.interaction.HoverInteraction.Exit) {
            this.getHighSpeedVideoFpsRanges.remove(((androidx.compose.foundation.interaction.HoverInteraction.Exit) p0).getEnter());
        } else if (p0 instanceof androidx.compose.foundation.interaction.FocusInteraction.Focus) {
            this.getHighSpeedVideoFpsRanges.add(p0);
        } else if (p0 instanceof androidx.compose.foundation.interaction.FocusInteraction.Unfocus) {
            this.getHighSpeedVideoFpsRanges.remove(((androidx.compose.foundation.interaction.FocusInteraction.Unfocus) p0).getFocus());
        } else if (p0 instanceof androidx.compose.foundation.interaction.DragInteraction.Start) {
            this.getHighSpeedVideoFpsRanges.add(p0);
        } else if (p0 instanceof androidx.compose.foundation.interaction.DragInteraction.Stop) {
            this.getHighSpeedVideoFpsRanges.remove(((androidx.compose.foundation.interaction.DragInteraction.Stop) p0).getStart());
        } else if (!(p0 instanceof androidx.compose.foundation.interaction.DragInteraction.Cancel)) {
            return;
        } else {
            this.getHighSpeedVideoFpsRanges.remove(((androidx.compose.foundation.interaction.DragInteraction.Cancel) p0).getStart());
        }
        androidx.compose.foundation.interaction.Interaction interaction = (androidx.compose.foundation.interaction.Interaction) kotlin.collections.CollectionsKt.lastOrNull((java.util.List) this.getHighSpeedVideoFpsRanges);
        if (kotlin.jvm.internal.Intrinsics.areEqual(this.getHighResolutionOutputSizeshNQ4ISI, interaction)) {
            return;
        }
        if (interaction == null) {
            highResolutionOutputSizeshNQ4ISI = androidx.compose.material.ripple.RippleKt.getHighResolutionOutputSizeshNQ4ISI(this.getHighResolutionOutputSizeshNQ4ISI);
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(p1, null, null, new androidx.compose.material.ripple.StateLayer$handleInteraction$2(this, highResolutionOutputSizeshNQ4ISI, null), 3, null);
        } else {
            androidx.compose.material.ripple.RippleAlpha invoke = this.Camera2StreamConfigurationMap.invoke();
            if (interaction instanceof androidx.compose.foundation.interaction.HoverInteraction.Enter) {
                draggedAlpha = invoke.getHoveredAlpha();
            } else if (interaction instanceof androidx.compose.foundation.interaction.FocusInteraction.Focus) {
                draggedAlpha = invoke.getFocusedAlpha();
            } else {
                draggedAlpha = interaction instanceof androidx.compose.foundation.interaction.DragInteraction.Start ? invoke.getDraggedAlpha() : 0.0f;
            }
            highSpeedVideoFpsRanges = androidx.compose.material.ripple.RippleKt.getHighSpeedVideoFpsRanges(interaction);
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(p1, null, null, new androidx.compose.material.ripple.StateLayer$handleInteraction$1(this, draggedAlpha, highSpeedVideoFpsRanges, null), 3, null);
        }
        this.getHighResolutionOutputSizeshNQ4ISI = interaction;
    }

    public final void getHighSpeedVideoSizes(androidx.compose.ui.graphics.drawscope.DrawScope drawScope, float f, long j) {
        long j2;
        float floatValue = this.getHighSpeedVideoSizes.getValue().floatValue();
        if (floatValue <= 0.0f) {
            return;
        }
        long m5995copywmQWz5c$default = androidx.compose.ui.graphics.Color.m5995copywmQWz5c$default(j, floatValue, 0.0f, 0.0f, 0.0f, 14, null);
        if (!this.getHighSpeedVideoFpsRangesFor) {
            androidx.compose.ui.graphics.drawscope.DrawScope.m6513drawCircleVaOC9Bg$default(drawScope, m5995copywmQWz5c$default, f, 0L, 0.0f, null, null, 0, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
            return;
        }
        float m5821getWidthimpl = androidx.compose.ui.geometry.Size.m5821getWidthimpl(drawScope.mo6531getSizeNHjbRc());
        float m5818getHeightimpl = androidx.compose.ui.geometry.Size.m5818getHeightimpl(drawScope.mo6531getSizeNHjbRc());
        int m5985getIntersectrtfAjoo = androidx.compose.ui.graphics.ClipOp.INSTANCE.m5985getIntersectrtfAjoo();
        androidx.compose.ui.graphics.drawscope.DrawContext drawContext = drawScope.getDrawContext();
        long mo6453getSizeNHjbRc = drawContext.mo6453getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo6456clipRectN_I0leg(0.0f, 0.0f, m5821getWidthimpl, m5818getHeightimpl, m5985getIntersectrtfAjoo);
            j2 = mo6453getSizeNHjbRc;
            try {
                androidx.compose.ui.graphics.drawscope.DrawScope.m6513drawCircleVaOC9Bg$default(drawScope, m5995copywmQWz5c$default, f, 0L, 0.0f, null, null, 0, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
                drawContext.getCanvas().restore();
                drawContext.mo6454setSizeuvyYCjk(j2);
            } catch (java.lang.Throwable th) {
                th = th;
                drawContext.getCanvas().restore();
                drawContext.mo6454setSizeuvyYCjk(j2);
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            j2 = mo6453getSizeNHjbRc;
        }
    }
}
