package androidx.compose.foundation;

@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\r\u001a\u00020\f*\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J#\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u00132\n\u0010\u0006\u001a\u00060\u0014j\u0002`\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u00132\n\u0010\u0006\u001a\u00060\u0014j\u0002`\u0015H\u0002¢\u0006\u0004\b\u0012\u0010\u0017J#\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u00132\n\u0010\u0006\u001a\u00060\u0014j\u0002`\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0017J#\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u00132\n\u0010\u0006\u001a\u00060\u0014j\u0002`\u0015H\u0002¢\u0006\u0004\b\u0010\u0010\u0017J+\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u00192\u0006\u0010\u0006\u001a\u00020\u00132\n\u0010\b\u001a\u00060\u0014j\u0002`\u0015H\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001a\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001cR\u0014\u0010\u0012\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001dR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u001fR\u0014\u0010\u0016\u001a\u00020\u001e8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b \u0010!"}, d2 = {"Landroidx/compose/foundation/StretchOverscrollNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/ui/node/DelegatableNode;", "p0", "Landroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect;", "p1", "Landroidx/compose/foundation/EdgeEffectWrapper;", "p2", "<init>", "(Landroidx/compose/ui/node/DelegatableNode;Landroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect;Landroidx/compose/foundation/EdgeEffectWrapper;)V", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "", "draw", "(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;)V", "", "getHighResolutionOutputSizeshNQ4ISI", "()Z", "getHighSpeedVideoFpsRangesFor", "Landroid/widget/EdgeEffect;", "Landroid/graphics/Canvas;", "Landroidx/compose/ui/graphics/getHighSpeedVideoSizes;", "Camera2StreamConfigurationMap", "(Landroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z", "getHighSpeedVideoSizes", "", "getHighSpeedVideoFpsRanges", "(FLandroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z", "Landroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect;", "Landroidx/compose/foundation/EdgeEffectWrapper;", "Landroid/graphics/RenderNode;", "Landroid/graphics/RenderNode;", "X_", "()Landroid/graphics/RenderNode;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class StretchOverscrollNode extends androidx.compose.ui.node.DelegatingNode implements androidx.compose.ui.node.DrawModifierNode {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.compose.foundation.EdgeEffectWrapper getHighSpeedVideoFpsRangesFor;
    private final androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private android.graphics.RenderNode getHighResolutionOutputSizeshNQ4ISI;

    public StretchOverscrollNode(androidx.compose.ui.node.DelegatableNode delegatableNode, androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect, androidx.compose.foundation.EdgeEffectWrapper edgeEffectWrapper) {
        this.getHighSpeedVideoFpsRanges = androidEdgeEffectOverscrollEffect;
        this.getHighSpeedVideoFpsRangesFor = edgeEffectWrapper;
        delegate(delegatableNode);
    }

    private final android.graphics.RenderNode X_() {
        android.graphics.RenderNode renderNode = this.getHighResolutionOutputSizeshNQ4ISI;
        if (renderNode != null) {
            return renderNode;
        }
        android.graphics.RenderNode renderNode2 = new android.graphics.RenderNode("AndroidEdgeEffectOverscrollEffect");
        this.getHighResolutionOutputSizeshNQ4ISI = renderNode2;
        return renderNode2;
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public final void draw(androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope) {
        boolean z;
        this.getHighSpeedVideoFpsRanges.m1268updateSizeuvyYCjk$foundation(contentDrawScope.mo6531getSizeNHjbRc());
        android.graphics.Canvas nativeCanvas = androidx.compose.ui.graphics.AndroidCanvas_androidKt.getNativeCanvas(contentDrawScope.getDrawContext().getCanvas());
        this.getHighSpeedVideoFpsRanges.getRedrawSignal$foundation().getValue();
        if (androidx.compose.ui.geometry.Size.m5823isEmptyimpl(contentDrawScope.mo6531getSizeNHjbRc())) {
            contentDrawScope.drawContent();
            return;
        }
        if (!nativeCanvas.isHardwareAccelerated()) {
            this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI();
            contentDrawScope.drawContent();
            return;
        }
        float f = contentDrawScope.mo1418toPx0680j_4(androidx.compose.foundation.ClipScrollableContainerKt.getMaxSupportedElevation());
        androidx.compose.foundation.EdgeEffectWrapper edgeEffectWrapper = this.getHighSpeedVideoFpsRangesFor;
        boolean highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI();
        boolean highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor();
        if (highResolutionOutputSizeshNQ4ISI && highSpeedVideoFpsRangesFor) {
            X_().setPosition(0, 0, nativeCanvas.getWidth(), nativeCanvas.getHeight());
        } else if (highResolutionOutputSizeshNQ4ISI) {
            X_().setPosition(0, 0, nativeCanvas.getWidth() + (kotlin.math.MathKt.roundToInt(f) * 2), nativeCanvas.getHeight());
        } else if (highSpeedVideoFpsRangesFor) {
            X_().setPosition(0, 0, nativeCanvas.getWidth(), nativeCanvas.getHeight() + (kotlin.math.MathKt.roundToInt(f) * 2));
        } else {
            contentDrawScope.drawContent();
            return;
        }
        android.graphics.RecordingCanvas beginRecording = X_().beginRecording();
        if (edgeEffectWrapper.getOutputSizeshNQ4ISI()) {
            android.widget.EdgeEffect Camera2StreamConfigurationMap = edgeEffectWrapper.Camera2StreamConfigurationMap();
            getHighSpeedVideoSizes(Camera2StreamConfigurationMap, beginRecording);
            Camera2StreamConfigurationMap.finish();
        }
        if (edgeEffectWrapper.getOutputStallDuration()) {
            android.widget.EdgeEffect highSpeedVideoFpsRanges = edgeEffectWrapper.getHighSpeedVideoFpsRanges();
            z = Camera2StreamConfigurationMap(highSpeedVideoFpsRanges, beginRecording);
            if (edgeEffectWrapper.getOutputSizes()) {
                androidx.compose.foundation.EdgeEffectCompat.INSTANCE.onPullDistanceCompat(edgeEffectWrapper.Camera2StreamConfigurationMap(), androidx.compose.foundation.EdgeEffectCompat.INSTANCE.getDistanceCompat(highSpeedVideoFpsRanges), 1.0f - java.lang.Float.intBitsToFloat((int) (this.getHighSpeedVideoFpsRanges.m1267displacementF1C5BW0$foundation() & 4294967295L)));
            }
        } else {
            z = false;
        }
        if (edgeEffectWrapper.coroutineCreation()) {
            android.widget.EdgeEffect outputFormats = edgeEffectWrapper.getOutputFormats();
            getHighResolutionOutputSizeshNQ4ISI(outputFormats, beginRecording);
            outputFormats.finish();
        }
        if (edgeEffectWrapper.isOutputSupportedForhNQ4ISI()) {
            android.widget.EdgeEffect inputSizeshNQ4ISI = edgeEffectWrapper.getInputSizeshNQ4ISI();
            z = getHighSpeedVideoFpsRangesFor(inputSizeshNQ4ISI, beginRecording) || z;
            if (edgeEffectWrapper.CoroutineDebuggingKt()) {
                androidx.compose.foundation.EdgeEffectCompat.INSTANCE.onPullDistanceCompat(edgeEffectWrapper.getOutputFormats(), androidx.compose.foundation.EdgeEffectCompat.INSTANCE.getDistanceCompat(inputSizeshNQ4ISI), java.lang.Float.intBitsToFloat((int) (this.getHighSpeedVideoFpsRanges.m1267displacementF1C5BW0$foundation() >> 32)));
            }
        }
        if (edgeEffectWrapper.isOutputSupportedFor()) {
            android.widget.EdgeEffect outputMinFrameDuration = edgeEffectWrapper.getOutputMinFrameDuration();
            Camera2StreamConfigurationMap(outputMinFrameDuration, beginRecording);
            outputMinFrameDuration.finish();
        }
        if (edgeEffectWrapper.unwrapAs()) {
            android.widget.EdgeEffect inputFormats = edgeEffectWrapper.getInputFormats();
            z = getHighSpeedVideoSizes(inputFormats, beginRecording) || z;
            if (edgeEffectWrapper.getValidOutputFormatsForInputhNQ4ISI()) {
                androidx.compose.foundation.EdgeEffectCompat.INSTANCE.onPullDistanceCompat(edgeEffectWrapper.getOutputMinFrameDuration(), androidx.compose.foundation.EdgeEffectCompat.INSTANCE.getDistanceCompat(inputFormats), java.lang.Float.intBitsToFloat((int) (this.getHighSpeedVideoFpsRanges.m1267displacementF1C5BW0$foundation() & 4294967295L)));
            }
        }
        if (edgeEffectWrapper.getOutputStallDurationlomOqCM()) {
            android.widget.EdgeEffect highSpeedVideoSizes = edgeEffectWrapper.getHighSpeedVideoSizes();
            getHighSpeedVideoFpsRangesFor(highSpeedVideoSizes, beginRecording);
            highSpeedVideoSizes.finish();
        }
        if (edgeEffectWrapper.getHighSpeedVideoSizesFor()) {
            android.widget.EdgeEffect highSpeedVideoFpsRangesFor2 = edgeEffectWrapper.getHighSpeedVideoFpsRangesFor();
            boolean z2 = getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoFpsRangesFor2, beginRecording) || z;
            if (edgeEffectWrapper.getOutputMinFrameDurationlomOqCM()) {
                androidx.compose.foundation.EdgeEffectCompat.INSTANCE.onPullDistanceCompat(edgeEffectWrapper.getHighSpeedVideoSizes(), androidx.compose.foundation.EdgeEffectCompat.INSTANCE.getDistanceCompat(highSpeedVideoFpsRangesFor2), 1.0f - java.lang.Float.intBitsToFloat((int) (this.getHighSpeedVideoFpsRanges.m1267displacementF1C5BW0$foundation() >> 32)));
            }
            z = z2;
        }
        if (z) {
            this.getHighSpeedVideoFpsRanges.invalidateOverscroll$foundation();
        }
        float f2 = highSpeedVideoFpsRangesFor ? 0.0f : f;
        if (highResolutionOutputSizeshNQ4ISI) {
            f = 0.0f;
        }
        androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope2 = contentDrawScope;
        androidx.compose.ui.unit.LayoutDirection layoutDirection = contentDrawScope.getLayoutDirection();
        androidx.compose.ui.graphics.Canvas Canvas = androidx.compose.ui.graphics.AndroidCanvas_androidKt.Canvas(beginRecording);
        long j = contentDrawScope.mo6531getSizeNHjbRc();
        androidx.compose.ui.unit.Density density = contentDrawScope2.getDrawContext().getDensity();
        androidx.compose.ui.unit.LayoutDirection layoutDirection2 = contentDrawScope2.getDrawContext().getLayoutDirection();
        androidx.compose.ui.graphics.Canvas canvas = contentDrawScope2.getDrawContext().getCanvas();
        long mo6453getSizeNHjbRc = contentDrawScope2.getDrawContext().mo6453getSizeNHjbRc();
        androidx.compose.ui.graphics.layer.GraphicsLayer graphicsLayer = contentDrawScope2.getDrawContext().getGraphicsLayer();
        androidx.compose.ui.graphics.drawscope.DrawContext drawContext = contentDrawScope2.getDrawContext();
        drawContext.setDensity(contentDrawScope);
        drawContext.setLayoutDirection(layoutDirection);
        drawContext.setCanvas(Canvas);
        drawContext.mo6454setSizeuvyYCjk(j);
        drawContext.setGraphicsLayer(null);
        Canvas.save();
        try {
            contentDrawScope2.getDrawContext().getTransform().translate(f2, f);
            try {
                contentDrawScope.drawContent();
                float f3 = -f2;
                float f4 = -f;
                contentDrawScope2.getDrawContext().getTransform().translate(f3, f4);
                Canvas.restore();
                androidx.compose.ui.graphics.drawscope.DrawContext drawContext2 = contentDrawScope2.getDrawContext();
                drawContext2.setDensity(density);
                drawContext2.setLayoutDirection(layoutDirection2);
                drawContext2.setCanvas(canvas);
                drawContext2.mo6454setSizeuvyYCjk(mo6453getSizeNHjbRc);
                drawContext2.setGraphicsLayer(graphicsLayer);
                X_().endRecording();
                int save = nativeCanvas.save();
                nativeCanvas.translate(f3, f4);
                nativeCanvas.drawRenderNode(X_());
                nativeCanvas.restoreToCount(save);
            } catch (java.lang.Throwable th) {
                contentDrawScope2.getDrawContext().getTransform().translate(-f2, -f);
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            Canvas.restore();
            androidx.compose.ui.graphics.drawscope.DrawContext drawContext3 = contentDrawScope2.getDrawContext();
            drawContext3.setDensity(density);
            drawContext3.setLayoutDirection(layoutDirection2);
            drawContext3.setCanvas(canvas);
            drawContext3.mo6454setSizeuvyYCjk(mo6453getSizeNHjbRc);
            drawContext3.setGraphicsLayer(graphicsLayer);
            throw th2;
        }
    }

    private final boolean getHighResolutionOutputSizeshNQ4ISI() {
        androidx.compose.foundation.EdgeEffectWrapper edgeEffectWrapper = this.getHighSpeedVideoFpsRangesFor;
        return edgeEffectWrapper.isOutputSupportedForhNQ4ISI() || edgeEffectWrapper.coroutineCreation() || edgeEffectWrapper.getHighSpeedVideoSizesFor() || edgeEffectWrapper.getOutputStallDurationlomOqCM();
    }

    private final boolean getHighSpeedVideoFpsRangesFor() {
        androidx.compose.foundation.EdgeEffectWrapper edgeEffectWrapper = this.getHighSpeedVideoFpsRangesFor;
        return edgeEffectWrapper.getOutputStallDuration() || edgeEffectWrapper.getOutputSizeshNQ4ISI() || edgeEffectWrapper.unwrapAs() || edgeEffectWrapper.isOutputSupportedFor();
    }

    private static boolean Camera2StreamConfigurationMap(android.widget.EdgeEffect p0, android.graphics.Canvas p1) {
        return getHighSpeedVideoFpsRanges(270.0f, p0, p1);
    }

    private static boolean getHighSpeedVideoFpsRangesFor(android.widget.EdgeEffect p0, android.graphics.Canvas p1) {
        return getHighSpeedVideoFpsRanges(0.0f, p0, p1);
    }

    private static boolean getHighSpeedVideoSizes(android.widget.EdgeEffect p0, android.graphics.Canvas p1) {
        return getHighSpeedVideoFpsRanges(90.0f, p0, p1);
    }

    private static boolean getHighResolutionOutputSizeshNQ4ISI(android.widget.EdgeEffect p0, android.graphics.Canvas p1) {
        return getHighSpeedVideoFpsRanges(180.0f, p0, p1);
    }

    private static boolean getHighSpeedVideoFpsRanges(float p0, android.widget.EdgeEffect p1, android.graphics.Canvas p2) {
        if (p0 == 0.0f) {
            return p1.draw(p2);
        }
        int save = p2.save();
        p2.rotate(p0);
        boolean draw = p1.draw(p2);
        p2.restoreToCount(save);
        return draw;
    }
}
