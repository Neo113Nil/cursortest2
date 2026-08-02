package com.paypal.oslo.feature.shoppingrewards.rewards.tiertracker.ui;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\u001a+\u0010\n\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0017\u0010\f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\f\u0010\r\u001aS\u0010\u0019\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001ac\u0010\u001e\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a#\u0010#\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u0003H\u0000¢\u0006\u0004\b!\u0010\"\u001a;\u0010(\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b&\u0010'"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Landroidx/compose/ui/unit/Density;", "density", "", "normalizedProgress", "Landroidx/compose/ui/graphics/Color;", "accentColor", "", "drawCircularProgressTrackerIconContent-g2O1Hgs", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/unit/Density;FJ)V", "drawCircularProgressTrackerIconContent", "totalSweep", "calculateIconFullSweep", "(F)F", "startAngle", "fullSweep", "Landroidx/compose/ui/geometry/Offset;", "arcTopLeft", "Landroidx/compose/ui/geometry/Size;", "arcSize", "strokePx", "accentStartAngle", "accentSweep", "drawIconArcsContent-d0ZGnmY", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFJJFFFJ)V", "drawIconArcsContent", "centerX", "centerY", "drawIconArcs-_gpkdOQ", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFJJFFFJFF)V", "drawIconArcs", "indicatorCenter", "indicatorInnerPx", "drawIconIndicatorDot-d-4ec7I", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JF)V", "drawIconIndicatorDot", "crossArm", "crossStroke", "drawIconCrosshair-kKL39v8", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFFFJ)V", "drawIconCrosshair"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CircularProgressTrackerIconDrawingKt {
    public static final float calculateIconFullSweep(float f) {
        return f - 2.0f;
    }

    /* renamed from: drawCircularProgressTrackerIconContent-g2O1Hgs, reason: not valid java name */
    public static final void m19574drawCircularProgressTrackerIconContentg2O1Hgs(androidx.compose.ui.graphics.drawscope.DrawScope drawScope, androidx.compose.ui.unit.Density density, float f, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(drawScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(density, "");
        com.paypal.oslo.feature.shoppingrewards.rewards.tiertracker.ui.IconCanvasGeometry calculateIconCanvasGeometry = com.paypal.oslo.feature.shoppingrewards.rewards.tiertracker.ui.IconCanvasGeometryKt.calculateIconCanvasGeometry(java.lang.Float.intBitsToFloat((int) (drawScope.mo6531getSizeNHjbRc() >> 32)), density, f);
        m19575drawIconArcs_gpkdOQ(drawScope, calculateIconCanvasGeometry.getStartAngle(), calculateIconCanvasGeometry.getFullSweep(), calculateIconCanvasGeometry.m19599getArcTopLeftF1C5BW0(), calculateIconCanvasGeometry.m19598getArcSizeNHjbRc(), calculateIconCanvasGeometry.getStrokePx(), calculateIconCanvasGeometry.getAccentStartAngle(), calculateIconCanvasGeometry.getAccentSweep(), j, calculateIconCanvasGeometry.getCenterX(), calculateIconCanvasGeometry.getCenterY());
        m19578drawIconIndicatorDotd4ec7I(drawScope, calculateIconCanvasGeometry.m19600getIndicatorCenterF1C5BW0(), calculateIconCanvasGeometry.getIndicatorInnerPx());
        m19577drawIconCrosshairkKL39v8(drawScope, calculateIconCanvasGeometry.getCenterX(), calculateIconCanvasGeometry.getCenterY(), calculateIconCanvasGeometry.getCrossArm(), calculateIconCanvasGeometry.getCrossStroke(), j);
    }

    /* renamed from: drawIconArcsContent-d0ZGnmY, reason: not valid java name */
    public static final void m19576drawIconArcsContentd0ZGnmY(androidx.compose.ui.graphics.drawscope.DrawScope drawScope, float f, float f2, long j, long j2, float f3, float f4, float f5, long j3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(drawScope, "");
        androidx.compose.ui.graphics.drawscope.DrawScope.m6511drawArcyD3GUKo$default(drawScope, com.paypal.oslo.feature.shoppingrewards.rewards.tiertracker.ui.IconDrawingConstants.INSTANCE.m19601getBACKGROUND_ARC_COLOR0d7_KjU(), f, f2, false, j, j2, 0.0f, new androidx.compose.ui.graphics.drawscope.Stroke(f3, 0.0f, androidx.compose.ui.graphics.StrokeCap.INSTANCE.m6341getRoundKaPHkGw(), 0, null, 26, null), null, 0, 832, null);
        androidx.compose.ui.graphics.drawscope.DrawScope.m6511drawArcyD3GUKo$default(drawScope, j3, f4, f5, false, j, j2, 0.0f, new androidx.compose.ui.graphics.drawscope.Stroke(f3, 0.0f, androidx.compose.ui.graphics.StrokeCap.INSTANCE.m6341getRoundKaPHkGw(), 0, null, 26, null), null, 0, 832, null);
    }

    /* renamed from: drawIconIndicatorDot-d-4ec7I, reason: not valid java name */
    public static final void m19578drawIconIndicatorDotd4ec7I(androidx.compose.ui.graphics.drawscope.DrawScope drawScope, long j, float f) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(drawScope, "");
        androidx.compose.ui.graphics.drawscope.DrawScope.m6513drawCircleVaOC9Bg$default(drawScope, androidx.compose.ui.graphics.Color.INSTANCE.m6033getWhite0d7_KjU(), f, j, 0.0f, null, null, 0, 120, null);
    }

    /* renamed from: drawIconArcs-_gpkdOQ, reason: not valid java name */
    public static final void m19575drawIconArcs_gpkdOQ(androidx.compose.ui.graphics.drawscope.DrawScope drawScope, float f, float f2, long j, long j2, float f3, float f4, float f5, long j3, float f6, float f7) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(drawScope, "");
        long m5744constructorimpl = androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(f6) << 32) | (java.lang.Float.floatToRawIntBits(f7) & 4294967295L));
        androidx.compose.ui.graphics.drawscope.DrawContext drawContext = drawScope.getDrawContext();
        long mo6453getSizeNHjbRc = drawContext.mo6453getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo6460scale0AR0LA0(-1.0f, 1.0f, m5744constructorimpl);
            m19576drawIconArcsContentd0ZGnmY(drawScope, f, f2, j, j2, f3, f4, f5, j3);
        } finally {
            drawContext.getCanvas().restore();
            drawContext.mo6454setSizeuvyYCjk(mo6453getSizeNHjbRc);
        }
    }

    /* renamed from: drawIconCrosshair-kKL39v8, reason: not valid java name */
    public static final void m19577drawIconCrosshairkKL39v8(androidx.compose.ui.graphics.drawscope.DrawScope drawScope, float f, float f2, float f3, float f4, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(drawScope, "");
        androidx.compose.ui.graphics.drawscope.DrawScope.m6518drawLineNGM6Ib0$default(drawScope, j, androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(f - f3) << 32) | (java.lang.Float.floatToRawIntBits(f2) & 4294967295L)), androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(f + f3) << 32) | (java.lang.Float.floatToRawIntBits(f2) & 4294967295L)), f4, androidx.compose.ui.graphics.StrokeCap.INSTANCE.m6342getSquareKaPHkGw(), null, 0.0f, null, 0, androidx.window.core.layout.WindowSizeClass.HEIGHT_DP_MEDIUM_LOWER_BOUND, null);
        androidx.compose.ui.graphics.drawscope.DrawScope.m6518drawLineNGM6Ib0$default(drawScope, j, androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(f) << 32) | (java.lang.Float.floatToRawIntBits(f2 - f3) & 4294967295L)), androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(f) << 32) | (java.lang.Float.floatToRawIntBits(f2 + f3) & 4294967295L)), f4, androidx.compose.ui.graphics.StrokeCap.INSTANCE.m6342getSquareKaPHkGw(), null, 0.0f, null, 0, androidx.window.core.layout.WindowSizeClass.HEIGHT_DP_MEDIUM_LOWER_BOUND, null);
    }
}
