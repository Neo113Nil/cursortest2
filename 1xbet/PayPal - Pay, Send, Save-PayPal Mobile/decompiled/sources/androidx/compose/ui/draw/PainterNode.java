package androidx.compose.ui.draw;

@kotlin.Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003BA\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0018\u001a\u00020\u0015*\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u001c\u001a\u00020\u001b*\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ#\u0010\u001e\u001a\u00020\u001b*\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001dJ#\u0010\u001f\u001a\u00020\u001b*\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001f\u0010\u001dJ#\u0010 \u001a\u00020\u001b*\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\u001bH\u0016¢\u0006\u0004\b \u0010\u001dJ\u0017\u0010\"\u001a\u00020!2\u0006\u0010\u0005\u001a\u00020!H\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u0014H\u0002¢\u0006\u0004\b$\u0010#J\u0013\u0010'\u001a\u00020&*\u00020%H\u0016¢\u0006\u0004\b'\u0010(J\u0013\u0010)\u001a\u00020\u0006*\u00020!H\u0002¢\u0006\u0004\b)\u0010*J\u0013\u0010+\u001a\u00020\u0006*\u00020!H\u0002¢\u0006\u0004\b+\u0010*J\u000f\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b-\u0010.R\"\u0010$\u001a\u00020\u00048\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010/\u001a\u0004\b)\u00100\"\u0004\b$\u00101R\"\u0010+\u001a\u00020\u00068\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b+\u00104\"\u0004\b+\u00105R\u001c\u0010\"\u001a\u00020\b8\u0006@\u0007X\u0087\u000e¢\u0006\f\n\u0004\b)\u00106\"\u0004\b7\u00108R\u001c\u0010)\u001a\u00020\n8\u0006@\u0007X\u0087\u000e¢\u0006\f\n\u0004\b7\u00109\"\u0004\b$\u0010:R\u001c\u00107\u001a\u00020\f8\u0006@\u0007X\u0087\u000e¢\u0006\f\n\u0004\b\"\u0010;\"\u0004\b)\u0010<R\u001e\u0010?\u001a\u0004\u0018\u00010\u000e8\u0006@\u0007X\u0087\u000e¢\u0006\f\n\u0004\b+\u0010=\"\u0004\b+\u0010>R\u0014\u0010@\u001a\u00020\u00068CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b7\u00104R\u0014\u0010B\u001a\u00020\u00068WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bA\u00104"}, d2 = {"Landroidx/compose/ui/draw/PainterNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/ui/graphics/painter/Painter;", "p0", "", "p1", "Landroidx/compose/ui/Alignment;", "p2", "Landroidx/compose/ui/layout/ContentScale;", "p3", "", "p4", "Landroidx/compose/ui/graphics/ColorFilter;", "p5", "<init>", "(Landroidx/compose/ui/graphics/painter/Painter;ZLandroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;)V", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "", "minIntrinsicWidth", "(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Landroidx/compose/ui/layout/IntrinsicMeasurable;I)I", "maxIntrinsicWidth", "minIntrinsicHeight", "maxIntrinsicHeight", "Landroidx/compose/ui/geometry/Size;", "getHighSpeedVideoSizes", "(J)J", "getHighSpeedVideoFpsRanges", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "", "draw", "(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;)V", "Camera2StreamConfigurationMap", "(J)Z", "getHighResolutionOutputSizeshNQ4ISI", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/ui/graphics/painter/Painter;", "()Landroidx/compose/ui/graphics/painter/Painter;", "(Landroidx/compose/ui/graphics/painter/Painter;)V", "getInputSizeshNQ4ISI", "Z", "()Z", "(Z)V", "Landroidx/compose/ui/Alignment;", "getHighSpeedVideoFpsRangesFor", "(Landroidx/compose/ui/Alignment;)V", "Landroidx/compose/ui/layout/ContentScale;", "(Landroidx/compose/ui/layout/ContentScale;)V", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "(F)V", "Landroidx/compose/ui/graphics/ColorFilter;", "(Landroidx/compose/ui/graphics/ColorFilter;)V", "getOutputMinFrameDuration", "getHighSpeedVideoSizesFor", "getShouldAutoInvalidate", "getOutputFormats"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class PainterNode extends androidx.compose.ui.Modifier.Node implements androidx.compose.ui.node.LayoutModifierNode, androidx.compose.ui.node.DrawModifierNode {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private androidx.compose.ui.Alignment getHighSpeedVideoSizes;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private androidx.compose.ui.graphics.ColorFilter getOutputMinFrameDuration;
    private androidx.compose.ui.graphics.painter.Painter getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private androidx.compose.ui.layout.ContentScale Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private float getHighSpeedVideoFpsRangesFor;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private boolean getHighResolutionOutputSizeshNQ4ISI;

    @Override // androidx.compose.ui.Modifier.Node
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    public PainterNode(androidx.compose.ui.graphics.painter.Painter painter, boolean z, androidx.compose.ui.Alignment alignment, androidx.compose.ui.layout.ContentScale contentScale, float f, androidx.compose.ui.graphics.ColorFilter colorFilter) {
        this.getHighSpeedVideoFpsRanges = painter;
        this.getHighResolutionOutputSizeshNQ4ISI = z;
        this.getHighSpeedVideoSizes = alignment;
        this.Camera2StreamConfigurationMap = contentScale;
        this.getHighSpeedVideoFpsRangesFor = f;
        this.getOutputMinFrameDuration = colorFilter;
    }

    /* renamed from: Camera2StreamConfigurationMap, reason: from getter */
    public final androidx.compose.ui.graphics.painter.Painter getGetHighSpeedVideoFpsRanges() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final void getHighSpeedVideoFpsRanges(androidx.compose.ui.graphics.painter.Painter painter) {
        this.getHighSpeedVideoFpsRanges = painter;
    }

    public final void getHighResolutionOutputSizeshNQ4ISI(boolean z) {
        this.getHighResolutionOutputSizeshNQ4ISI = z;
    }

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from getter */
    public final boolean getGetHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final void getHighSpeedVideoFpsRangesFor(androidx.compose.ui.Alignment alignment) {
        this.getHighSpeedVideoSizes = alignment;
    }

    public final void getHighSpeedVideoFpsRanges(androidx.compose.ui.layout.ContentScale contentScale) {
        this.Camera2StreamConfigurationMap = contentScale;
    }

    public final void Camera2StreamConfigurationMap(float f) {
        this.getHighSpeedVideoFpsRangesFor = f;
    }

    public final void getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.graphics.ColorFilter colorFilter) {
        this.getOutputMinFrameDuration = colorFilter;
    }

    private final boolean getHighSpeedVideoFpsRangesFor() {
        return this.getHighResolutionOutputSizeshNQ4ISI && this.getHighSpeedVideoFpsRanges.getIntrinsicSize() != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public final androidx.compose.ui.layout.MeasureResult mo1117measure3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, androidx.compose.ui.layout.Measurable measurable, long j) {
        final androidx.compose.ui.layout.Placeable mo7353measureBRTryo0 = measurable.mo7353measureBRTryo0(getHighSpeedVideoFpsRanges(j));
        return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, mo7353measureBRTryo0.getWidth(), mo7353measureBRTryo0.getHeight(), null, new kotlin.jvm.functions.Function1<androidx.compose.ui.layout.Placeable.PlacementScope, kotlin.Unit>() { // from class: androidx.compose.ui.draw.PainterNode$measure$1
            public final void getHighSpeedVideoSizes(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
                androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(placementScope, androidx.compose.ui.layout.Placeable.this, 0, 0, 0.0f, 4, null);
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
                getHighSpeedVideoSizes(placementScope);
                return kotlin.Unit.INSTANCE;
            }

            {
                super(1);
            }
        }, 4, null);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int minIntrinsicWidth(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (getHighSpeedVideoFpsRangesFor()) {
            long highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(androidx.compose.ui.unit.ConstraintsKt.Constraints$default(0, 0, 0, i, 7, null));
            return java.lang.Math.max(androidx.compose.ui.unit.Constraints.m8556getMinWidthimpl(highSpeedVideoFpsRanges), intrinsicMeasurable.minIntrinsicWidth(i));
        }
        return intrinsicMeasurable.minIntrinsicWidth(i);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int maxIntrinsicWidth(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (getHighSpeedVideoFpsRangesFor()) {
            long highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(androidx.compose.ui.unit.ConstraintsKt.Constraints$default(0, 0, 0, i, 7, null));
            return java.lang.Math.max(androidx.compose.ui.unit.Constraints.m8556getMinWidthimpl(highSpeedVideoFpsRanges), intrinsicMeasurable.maxIntrinsicWidth(i));
        }
        return intrinsicMeasurable.maxIntrinsicWidth(i);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int minIntrinsicHeight(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (getHighSpeedVideoFpsRangesFor()) {
            long highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(androidx.compose.ui.unit.ConstraintsKt.Constraints$default(0, i, 0, 0, 13, null));
            return java.lang.Math.max(androidx.compose.ui.unit.Constraints.m8555getMinHeightimpl(highSpeedVideoFpsRanges), intrinsicMeasurable.minIntrinsicHeight(i));
        }
        return intrinsicMeasurable.minIntrinsicHeight(i);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int maxIntrinsicHeight(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (getHighSpeedVideoFpsRangesFor()) {
            long highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(androidx.compose.ui.unit.ConstraintsKt.Constraints$default(0, i, 0, 0, 13, null));
            return java.lang.Math.max(androidx.compose.ui.unit.Constraints.m8555getMinHeightimpl(highSpeedVideoFpsRanges), intrinsicMeasurable.maxIntrinsicHeight(i));
        }
        return intrinsicMeasurable.maxIntrinsicHeight(i);
    }

    private final long getHighSpeedVideoSizes(long p0) {
        float intBitsToFloat;
        float intBitsToFloat2;
        if (!getHighSpeedVideoFpsRangesFor()) {
            return p0;
        }
        if (!Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRanges.getIntrinsicSize())) {
            intBitsToFloat = java.lang.Float.intBitsToFloat((int) (p0 >> 32));
        } else {
            intBitsToFloat = java.lang.Float.intBitsToFloat((int) (this.getHighSpeedVideoFpsRanges.getIntrinsicSize() >> 32));
        }
        if (!getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRanges.getIntrinsicSize())) {
            intBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (p0 & 4294967295L));
        } else {
            intBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (this.getHighSpeedVideoFpsRanges.getIntrinsicSize() & 4294967295L));
        }
        long m5812constructorimpl = androidx.compose.ui.geometry.Size.m5812constructorimpl((java.lang.Float.floatToRawIntBits(intBitsToFloat) << 32) | (java.lang.Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L));
        if (java.lang.Float.intBitsToFloat((int) (p0 >> 32)) != 0.0f && java.lang.Float.intBitsToFloat((int) (p0 & 4294967295L)) != 0.0f) {
            return androidx.compose.ui.layout.ScaleFactorKt.m7473timesUQTWf7w(m5812constructorimpl, this.Camera2StreamConfigurationMap.mo7350computeScaleFactorH7hwNQA(m5812constructorimpl, p0));
        }
        return androidx.compose.ui.geometry.Size.INSTANCE.m5830getZeroNHjbRc();
    }

    private final long getHighSpeedVideoFpsRanges(long p0) {
        int m8556getMinWidthimpl;
        int m8555getMinHeightimpl;
        boolean z = false;
        boolean z2 = androidx.compose.ui.unit.Constraints.m8550getHasBoundedWidthimpl(p0) && androidx.compose.ui.unit.Constraints.m8549getHasBoundedHeightimpl(p0);
        if (androidx.compose.ui.unit.Constraints.m8552getHasFixedWidthimpl(p0) && androidx.compose.ui.unit.Constraints.m8551getHasFixedHeightimpl(p0)) {
            z = true;
        }
        if ((!getHighSpeedVideoFpsRangesFor() && z2) || z) {
            return androidx.compose.ui.unit.Constraints.m8545copyZbe2FdA$default(p0, androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(p0), 0, androidx.compose.ui.unit.Constraints.m8553getMaxHeightimpl(p0), 0, 10, null);
        }
        long intrinsicSize = this.getHighSpeedVideoFpsRanges.getIntrinsicSize();
        if (!Camera2StreamConfigurationMap(intrinsicSize)) {
            m8556getMinWidthimpl = androidx.compose.ui.unit.Constraints.m8556getMinWidthimpl(p0);
        } else {
            m8556getMinWidthimpl = java.lang.Math.round(java.lang.Float.intBitsToFloat((int) (intrinsicSize >> 32)));
        }
        if (!getHighResolutionOutputSizeshNQ4ISI(intrinsicSize)) {
            m8555getMinHeightimpl = androidx.compose.ui.unit.Constraints.m8555getMinHeightimpl(p0);
        } else {
            m8555getMinHeightimpl = java.lang.Math.round(java.lang.Float.intBitsToFloat((int) (intrinsicSize & 4294967295L)));
        }
        int m8571constrainWidthK40F9xA = androidx.compose.ui.unit.ConstraintsKt.m8571constrainWidthK40F9xA(p0, m8556getMinWidthimpl);
        float m8570constrainHeightK40F9xA = androidx.compose.ui.unit.ConstraintsKt.m8570constrainHeightK40F9xA(p0, m8555getMinHeightimpl);
        long highSpeedVideoSizes = getHighSpeedVideoSizes(androidx.compose.ui.geometry.Size.m5812constructorimpl((java.lang.Float.floatToRawIntBits(m8571constrainWidthK40F9xA) << 32) | (java.lang.Float.floatToRawIntBits(m8570constrainHeightK40F9xA) & 4294967295L)));
        return androidx.compose.ui.unit.Constraints.m8545copyZbe2FdA$default(p0, androidx.compose.ui.unit.ConstraintsKt.m8571constrainWidthK40F9xA(p0, java.lang.Math.round(java.lang.Float.intBitsToFloat((int) (highSpeedVideoSizes >> 32)))), 0, androidx.compose.ui.unit.ConstraintsKt.m8570constrainHeightK40F9xA(p0, java.lang.Math.round(java.lang.Float.intBitsToFloat((int) (highSpeedVideoSizes & 4294967295L)))), 0, 10, null);
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public final void draw(androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope) {
        float intBitsToFloat;
        float intBitsToFloat2;
        long m5830getZeroNHjbRc;
        long intrinsicSize = this.getHighSpeedVideoFpsRanges.getIntrinsicSize();
        if (Camera2StreamConfigurationMap(intrinsicSize)) {
            intBitsToFloat = java.lang.Float.intBitsToFloat((int) (intrinsicSize >> 32));
        } else {
            intBitsToFloat = java.lang.Float.intBitsToFloat((int) (contentDrawScope.mo6531getSizeNHjbRc() >> 32));
        }
        if (getHighResolutionOutputSizeshNQ4ISI(intrinsicSize)) {
            intBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (intrinsicSize & 4294967295L));
        } else {
            intBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (contentDrawScope.mo6531getSizeNHjbRc() & 4294967295L));
        }
        long m5812constructorimpl = androidx.compose.ui.geometry.Size.m5812constructorimpl((java.lang.Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (java.lang.Float.floatToRawIntBits(intBitsToFloat) << 32));
        if (java.lang.Float.intBitsToFloat((int) (contentDrawScope.mo6531getSizeNHjbRc() >> 32)) != 0.0f && java.lang.Float.intBitsToFloat((int) (contentDrawScope.mo6531getSizeNHjbRc() & 4294967295L)) != 0.0f) {
            m5830getZeroNHjbRc = androidx.compose.ui.layout.ScaleFactorKt.m7473timesUQTWf7w(m5812constructorimpl, this.Camera2StreamConfigurationMap.mo7350computeScaleFactorH7hwNQA(m5812constructorimpl, contentDrawScope.mo6531getSizeNHjbRc()));
        } else {
            m5830getZeroNHjbRc = androidx.compose.ui.geometry.Size.INSTANCE.m5830getZeroNHjbRc();
        }
        long j = m5830getZeroNHjbRc;
        long mo5504alignKFBX0sM = this.getHighSpeedVideoSizes.mo5504alignKFBX0sM(androidx.compose.ui.unit.IntSize.m8767constructorimpl((java.lang.Math.round(java.lang.Float.intBitsToFloat((int) (j & 4294967295L))) & 4294967295L) | (java.lang.Math.round(java.lang.Float.intBitsToFloat((int) (j >> 32))) << 32)), androidx.compose.ui.unit.IntSize.m8767constructorimpl((java.lang.Math.round(java.lang.Float.intBitsToFloat((int) (contentDrawScope.mo6531getSizeNHjbRc() & 4294967295L))) & 4294967295L) | (java.lang.Math.round(java.lang.Float.intBitsToFloat((int) (contentDrawScope.mo6531getSizeNHjbRc() >> 32))) << 32)), contentDrawScope.getLayoutDirection());
        float m8729getXimpl = androidx.compose.ui.unit.IntOffset.m8729getXimpl(mo5504alignKFBX0sM);
        float m8730getYimpl = androidx.compose.ui.unit.IntOffset.m8730getYimpl(mo5504alignKFBX0sM);
        androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope2 = contentDrawScope;
        contentDrawScope2.getDrawContext().getTransform().translate(m8729getXimpl, m8730getYimpl);
        try {
            this.getHighSpeedVideoFpsRanges.m6652drawx_KDEd0(contentDrawScope2, j, this.getHighSpeedVideoFpsRangesFor, this.getOutputMinFrameDuration);
            contentDrawScope2.getDrawContext().getTransform().translate(-m8729getXimpl, -m8730getYimpl);
            contentDrawScope.drawContent();
        } catch (java.lang.Throwable th) {
            contentDrawScope2.getDrawContext().getTransform().translate(-m8729getXimpl, -m8730getYimpl);
            throw th;
        }
    }

    private static boolean Camera2StreamConfigurationMap(long j) {
        return !androidx.compose.ui.geometry.Size.m5817equalsimpl0(j, androidx.compose.ui.geometry.Size.INSTANCE.m5829getUnspecifiedNHjbRc()) && (java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat((int) (j >> 32))) & Integer.MAX_VALUE) < 2139095040;
    }

    private static boolean getHighResolutionOutputSizeshNQ4ISI(long j) {
        return !androidx.compose.ui.geometry.Size.m5817equalsimpl0(j, androidx.compose.ui.geometry.Size.INSTANCE.m5829getUnspecifiedNHjbRc()) && (java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat((int) (j & 4294967295L))) & Integer.MAX_VALUE) < 2139095040;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PainterModifier(painter=");
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append(", sizeToIntrinsics=");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append(", alignment=");
        sb.append(this.getHighSpeedVideoSizes);
        sb.append(", alpha=");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append(", colorFilter=");
        sb.append(this.getOutputMinFrameDuration);
        sb.append(')');
        return sb.toString();
    }
}
