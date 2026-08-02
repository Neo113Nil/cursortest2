package androidx.compose.foundation;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000f\u001a\u00020\u000e*\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J3\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0004\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\u00132\n\u0010\n\u001a\u00060\u0014j\u0002`\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001cR\u0014\u0010\u0019\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f"}, d2 = {"Landroidx/compose/foundation/GlowOverscrollNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/ui/node/DelegatableNode;", "p0", "Landroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect;", "p1", "Landroidx/compose/foundation/EdgeEffectWrapper;", "p2", "Landroidx/compose/foundation/layout/PaddingValues;", "p3", "<init>", "(Landroidx/compose/ui/node/DelegatableNode;Landroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect;Landroidx/compose/foundation/EdgeEffectWrapper;Landroidx/compose/foundation/layout/PaddingValues;)V", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "", "draw", "(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;)V", "", "Landroidx/compose/ui/geometry/Offset;", "Landroid/widget/EdgeEffect;", "Landroid/graphics/Canvas;", "Landroidx/compose/ui/graphics/getHighSpeedVideoSizes;", "", "getHighSpeedVideoFpsRanges", "(FJLandroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z", "Camera2StreamConfigurationMap", "Landroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect;", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/foundation/EdgeEffectWrapper;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoSizes", "Landroidx/compose/foundation/layout/PaddingValues;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class GlowOverscrollNode extends androidx.compose.ui.node.DelegatingNode implements androidx.compose.ui.node.DrawModifierNode {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.compose.foundation.EdgeEffectWrapper getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.compose.foundation.layout.PaddingValues Camera2StreamConfigurationMap;

    public GlowOverscrollNode(androidx.compose.ui.node.DelegatableNode delegatableNode, androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect, androidx.compose.foundation.EdgeEffectWrapper edgeEffectWrapper, androidx.compose.foundation.layout.PaddingValues paddingValues) {
        this.getHighSpeedVideoFpsRangesFor = androidEdgeEffectOverscrollEffect;
        this.getHighResolutionOutputSizeshNQ4ISI = edgeEffectWrapper;
        this.Camera2StreamConfigurationMap = paddingValues;
        delegate(delegatableNode);
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public final void draw(androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope) {
        boolean z;
        this.getHighSpeedVideoFpsRangesFor.m1268updateSizeuvyYCjk$foundation(contentDrawScope.mo6531getSizeNHjbRc());
        if (androidx.compose.ui.geometry.Size.m5823isEmptyimpl(contentDrawScope.mo6531getSizeNHjbRc())) {
            contentDrawScope.drawContent();
            return;
        }
        contentDrawScope.drawContent();
        this.getHighSpeedVideoFpsRangesFor.getRedrawSignal$foundation().getValue();
        android.graphics.Canvas nativeCanvas = androidx.compose.ui.graphics.AndroidCanvas_androidKt.getNativeCanvas(contentDrawScope.getDrawContext().getCanvas());
        androidx.compose.foundation.EdgeEffectWrapper edgeEffectWrapper = this.getHighResolutionOutputSizeshNQ4ISI;
        boolean z2 = false;
        if (edgeEffectWrapper.getOutputStallDuration()) {
            androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope2 = contentDrawScope;
            z = getHighSpeedVideoFpsRanges(270.0f, androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(-java.lang.Float.intBitsToFloat((int) (contentDrawScope2.mo6531getSizeNHjbRc() & 4294967295L))) << 32) | (java.lang.Float.floatToRawIntBits(contentDrawScope2.mo1418toPx0680j_4(this.Camera2StreamConfigurationMap.mo1672calculateLeftPaddingu2uoSUM(contentDrawScope2.getLayoutDirection()))) & 4294967295L)), edgeEffectWrapper.getHighSpeedVideoFpsRanges(), nativeCanvas);
        } else {
            z = false;
        }
        if (edgeEffectWrapper.isOutputSupportedForhNQ4ISI()) {
            z = getHighSpeedVideoFpsRanges(0.0f, androidx.compose.ui.geometry.Offset.m5744constructorimpl((((long) java.lang.Float.floatToRawIntBits(0.0f)) << 32) | (((long) java.lang.Float.floatToRawIntBits(contentDrawScope.mo1418toPx0680j_4(this.Camera2StreamConfigurationMap.getTop()))) & 4294967295L)), edgeEffectWrapper.getInputSizeshNQ4ISI(), nativeCanvas) || z;
        }
        if (edgeEffectWrapper.unwrapAs()) {
            androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope3 = contentDrawScope;
            if (getHighSpeedVideoFpsRanges(90.0f, androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits((-kotlin.math.MathKt.roundToInt(java.lang.Float.intBitsToFloat((int) (contentDrawScope3.mo6531getSizeNHjbRc() >> 32)))) + contentDrawScope3.mo1418toPx0680j_4(this.Camera2StreamConfigurationMap.mo1673calculateRightPaddingu2uoSUM(contentDrawScope3.getLayoutDirection()))) & 4294967295L) | (java.lang.Float.floatToRawIntBits(0.0f) << 32)), edgeEffectWrapper.getInputFormats(), nativeCanvas) || z) {
                z2 = true;
            }
        } else {
            z2 = z;
        }
        if (edgeEffectWrapper.getHighSpeedVideoSizesFor()) {
            android.widget.EdgeEffect highSpeedVideoFpsRangesFor = edgeEffectWrapper.getHighSpeedVideoFpsRangesFor();
            androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope4 = contentDrawScope;
            float f = contentDrawScope4.mo1418toPx0680j_4(this.Camera2StreamConfigurationMap.getBottom());
            float f2 = -java.lang.Float.intBitsToFloat((int) (contentDrawScope4.mo6531getSizeNHjbRc() >> 32));
            if (!getHighSpeedVideoFpsRanges(180.0f, androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits((-java.lang.Float.intBitsToFloat((int) (contentDrawScope4.mo6531getSizeNHjbRc() & 4294967295L))) + f) & 4294967295L) | (java.lang.Float.floatToRawIntBits(f2) << 32)), highSpeedVideoFpsRangesFor, nativeCanvas) && !z2) {
                return;
            }
        } else if (!z2) {
            return;
        }
        this.getHighSpeedVideoFpsRangesFor.invalidateOverscroll$foundation();
    }

    private static boolean getHighSpeedVideoFpsRanges(float p0, long p1, android.widget.EdgeEffect p2, android.graphics.Canvas p3) {
        int save = p3.save();
        p3.rotate(p0);
        p3.translate(java.lang.Float.intBitsToFloat((int) (p1 >> 32)), java.lang.Float.intBitsToFloat((int) (p1 & 4294967295L)));
        boolean draw = p2.draw(p3);
        p3.restoreToCount(save);
        return draw;
    }
}
