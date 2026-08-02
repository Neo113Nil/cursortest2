package com.paypal.oslo.feature.cryptocurrency.ui.common.qr.renderer;

@kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001:\u0001+B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J/\u0010!\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0004H\u0002¢\u0006\u0004\b!\u0010\"J\u0013\u0010!\u001a\u00020\u001e*\u00020#H\u0002¢\u0006\u0004\b!\u0010$R\u0014\u0010%\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010)\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010(R\u0014\u0010*\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010("}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/common/qr/renderer/DrawScopeQRRenderer;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/common/qr/renderer/QRRenderer;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "drawScope", "Landroidx/compose/ui/graphics/Color;", "markerOuterColor", "markerRingColor", "markerInnerColor", "<init>", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "Lcom/paypal/oslo/feature/cryptocurrency/ui/receive/model/DrawingInstruction;", "instructions", "", "execute", "(Ljava/util/List;)V", "Lcom/paypal/oslo/feature/cryptocurrency/ui/receive/model/DrawingInstruction$Background;", "instruction", "drawBackground", "(Lcom/paypal/oslo/feature/cryptocurrency/ui/receive/model/DrawingInstruction$Background;)V", "Lcom/paypal/oslo/feature/cryptocurrency/ui/receive/model/DrawingInstruction$DataModule;", "drawDataModule", "(Lcom/paypal/oslo/feature/cryptocurrency/ui/receive/model/DrawingInstruction$DataModule;)V", "Lcom/paypal/oslo/feature/cryptocurrency/ui/receive/model/DrawingInstruction$PositionMarker;", "drawPositionMarker", "(Lcom/paypal/oslo/feature/cryptocurrency/ui/receive/model/DrawingInstruction$PositionMarker;)V", "Landroidx/compose/ui/geometry/Offset;", "p0", "", "p1", "Lcom/paypal/oslo/feature/cryptocurrency/ui/common/qr/renderer/DrawScopeQRRenderer$CornerRadii;", "p2", "p3", "getHighSpeedVideoFpsRangesFor", "(JFLcom/paypal/oslo/feature/cryptocurrency/ui/common/qr/renderer/DrawScopeQRRenderer$CornerRadii;J)V", "Lcom/paypal/oslo/feature/cryptocurrency/ui/common/qr/renderer/CornerRadiiSpec;", "(Lcom/paypal/oslo/feature/cryptocurrency/ui/common/qr/renderer/CornerRadiiSpec;)Lcom/paypal/oslo/feature/cryptocurrency/ui/common/qr/renderer/DrawScopeQRRenderer$CornerRadii;", "getHighSpeedVideoSizes", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Camera2StreamConfigurationMap", "J", "getHighSpeedVideoFpsRanges", "getHighResolutionOutputSizeshNQ4ISI", "CornerRadii"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DrawScopeQRRenderer implements com.paypal.oslo.feature.cryptocurrency.ui.common.qr.renderer.QRRenderer {
    public static final int $stable = 0;
    private final long Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final long getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final long getHighSpeedVideoFpsRanges;
    private final androidx.compose.ui.graphics.drawscope.DrawScope getHighSpeedVideoSizes;

    private DrawScopeQRRenderer(androidx.compose.ui.graphics.drawscope.DrawScope drawScope, long j, long j2, long j3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(drawScope, "");
        this.getHighSpeedVideoSizes = drawScope;
        this.Camera2StreamConfigurationMap = j;
        this.getHighSpeedVideoFpsRanges = j2;
        this.getHighResolutionOutputSizeshNQ4ISI = j3;
    }

    public /* synthetic */ DrawScopeQRRenderer(androidx.compose.ui.graphics.drawscope.DrawScope drawScope, long j, long j2, long j3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(drawScope, (i & 2) != 0 ? androidx.compose.ui.graphics.Color.INSTANCE.m6022getBlack0d7_KjU() : j, (i & 4) != 0 ? androidx.compose.ui.graphics.Color.INSTANCE.m6033getWhite0d7_KjU() : j2, j3, null);
    }

    @Override // com.paypal.oslo.feature.cryptocurrency.ui.common.qr.renderer.QRRenderer
    public final void execute(java.util.List<? extends com.paypal.oslo.feature.cryptocurrency.ui.receive.model.DrawingInstruction> instructions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instructions, "");
        for (com.paypal.oslo.feature.cryptocurrency.ui.receive.model.DrawingInstruction drawingInstruction : instructions) {
            if (drawingInstruction instanceof com.paypal.oslo.feature.cryptocurrency.ui.receive.model.DrawingInstruction.Background) {
                drawBackground((com.paypal.oslo.feature.cryptocurrency.ui.receive.model.DrawingInstruction.Background) drawingInstruction);
            } else if (drawingInstruction instanceof com.paypal.oslo.feature.cryptocurrency.ui.receive.model.DrawingInstruction.DataModule) {
                drawDataModule((com.paypal.oslo.feature.cryptocurrency.ui.receive.model.DrawingInstruction.DataModule) drawingInstruction);
            } else {
                if (!(drawingInstruction instanceof com.paypal.oslo.feature.cryptocurrency.ui.receive.model.DrawingInstruction.PositionMarker)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                drawPositionMarker((com.paypal.oslo.feature.cryptocurrency.ui.receive.model.DrawingInstruction.PositionMarker) drawingInstruction);
            }
        }
    }

    @Override // com.paypal.oslo.feature.cryptocurrency.ui.common.qr.renderer.QRRenderer
    public final void drawBackground(com.paypal.oslo.feature.cryptocurrency.ui.receive.model.DrawingInstruction.Background instruction) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instruction, "");
        androidx.compose.ui.graphics.drawscope.DrawScope drawScope = this.getHighSpeedVideoSizes;
        long m13997getColor0d7_KjU = instruction.m13997getColor0d7_KjU();
        float width = instruction.getWidth();
        float height = instruction.getHeight();
        androidx.compose.ui.graphics.drawscope.DrawScope.m6526drawRectnJ9OG0$default(drawScope, m13997getColor0d7_KjU, 0L, androidx.compose.ui.geometry.Size.m5812constructorimpl((java.lang.Float.floatToRawIntBits(width) << 32) | (java.lang.Float.floatToRawIntBits(height) & 4294967295L)), 0.0f, null, null, 0, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, null);
    }

    @Override // com.paypal.oslo.feature.cryptocurrency.ui.common.qr.renderer.QRRenderer
    public final void drawDataModule(com.paypal.oslo.feature.cryptocurrency.ui.receive.model.DrawingInstruction.DataModule instruction) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instruction, "");
        androidx.compose.ui.graphics.drawscope.DrawScope drawScope = this.getHighSpeedVideoSizes;
        long m14001getColor0d7_KjU = instruction.m14001getColor0d7_KjU();
        float radius = instruction.getRadius();
        float centerX = instruction.getCenterX();
        float centerY = instruction.getCenterY();
        androidx.compose.ui.graphics.drawscope.DrawScope.m6513drawCircleVaOC9Bg$default(drawScope, m14001getColor0d7_KjU, radius, androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(centerX) << 32) | (java.lang.Float.floatToRawIntBits(centerY) & 4294967295L)), 0.0f, null, null, 0, 120, null);
    }

    @Override // com.paypal.oslo.feature.cryptocurrency.ui.common.qr.renderer.QRRenderer
    public final void drawPositionMarker(com.paypal.oslo.feature.cryptocurrency.ui.receive.model.DrawingInstruction.PositionMarker instruction) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instruction, "");
        com.paypal.oslo.feature.cryptocurrency.ui.common.qr.renderer.PositionMarkerGeometry calculatePositionMarkerGeometry = com.paypal.oslo.feature.cryptocurrency.ui.common.qr.renderer.DrawScopeQRRendererKt.calculatePositionMarkerGeometry(instruction.getX(), instruction.getY(), instruction.getMarkerSize(), instruction.getModuleSize(), instruction.getRoundedCorner());
        float topLeftX = calculatePositionMarkerGeometry.getOuterSquare().getTopLeftX();
        getHighSpeedVideoFpsRangesFor(androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(calculatePositionMarkerGeometry.getOuterSquare().getTopLeftY()) & 4294967295L) | (java.lang.Float.floatToRawIntBits(topLeftX) << 32)), calculatePositionMarkerGeometry.getOuterSquare().getSize(), getHighSpeedVideoFpsRangesFor(calculatePositionMarkerGeometry.getOuterSquare().getRadii()), this.Camera2StreamConfigurationMap);
        float topLeftX2 = calculatePositionMarkerGeometry.getMiddleRing().getTopLeftX();
        getHighSpeedVideoFpsRangesFor(androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(calculatePositionMarkerGeometry.getMiddleRing().getTopLeftY()) & 4294967295L) | (java.lang.Float.floatToRawIntBits(topLeftX2) << 32)), calculatePositionMarkerGeometry.getMiddleRing().getSize(), getHighSpeedVideoFpsRangesFor(calculatePositionMarkerGeometry.getMiddleRing().getRadii()), this.getHighSpeedVideoFpsRanges);
        float topLeftX3 = calculatePositionMarkerGeometry.getInnerSquare().getTopLeftX();
        getHighSpeedVideoFpsRangesFor(androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(calculatePositionMarkerGeometry.getInnerSquare().getTopLeftY()) & 4294967295L) | (java.lang.Float.floatToRawIntBits(topLeftX3) << 32)), calculatePositionMarkerGeometry.getInnerSquare().getSize(), getHighSpeedVideoFpsRangesFor(calculatePositionMarkerGeometry.getInnerSquare().getRadii()), this.getHighResolutionOutputSizeshNQ4ISI);
    }

    private final void getHighSpeedVideoFpsRangesFor(long p0, float p1, com.paypal.oslo.feature.cryptocurrency.ui.common.qr.renderer.DrawScopeQRRenderer.CornerRadii p2, long p3) {
        androidx.compose.ui.graphics.drawscope.DrawScope drawScope = this.getHighSpeedVideoSizes;
        androidx.compose.ui.graphics.Path Path = androidx.compose.ui.graphics.AndroidPath_androidKt.Path();
        int i = (int) (p0 >> 32);
        float intBitsToFloat = java.lang.Float.intBitsToFloat(i);
        int i2 = (int) (p0 & 4294967295L);
        float intBitsToFloat2 = java.lang.Float.intBitsToFloat(i2);
        float intBitsToFloat3 = java.lang.Float.intBitsToFloat(i);
        androidx.compose.ui.graphics.Path.addRoundRect$default(Path, new androidx.compose.ui.geometry.RoundRect(intBitsToFloat, intBitsToFloat2, intBitsToFloat3 + p1, java.lang.Float.intBitsToFloat(i2) + p1, p2.getHighSpeedVideoFpsRangesFor, p2.Camera2StreamConfigurationMap, p2.getHighSpeedVideoSizes, p2.getHighSpeedVideoFpsRanges, null), null, 2, null);
        androidx.compose.ui.graphics.drawscope.DrawScope.m6522drawPathLG529CI$default(drawScope, Path, p3, 0.0f, androidx.compose.ui.graphics.drawscope.Fill.INSTANCE, null, 0, 52, null);
    }

    private static com.paypal.oslo.feature.cryptocurrency.ui.common.qr.renderer.DrawScopeQRRenderer.CornerRadii getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.cryptocurrency.ui.common.qr.renderer.CornerRadiiSpec cornerRadiiSpec) {
        float topLeft = cornerRadiiSpec.getTopLeft();
        long m5706constructorimpl = androidx.compose.ui.geometry.CornerRadius.m5706constructorimpl((java.lang.Float.floatToRawIntBits(topLeft) << 32) | (java.lang.Float.floatToRawIntBits(topLeft) & 4294967295L));
        long m5706constructorimpl2 = androidx.compose.ui.geometry.CornerRadius.m5706constructorimpl((java.lang.Float.floatToRawIntBits(cornerRadiiSpec.getTopRight()) << 32) | (java.lang.Float.floatToRawIntBits(r1) & 4294967295L));
        float bottomRight = cornerRadiiSpec.getBottomRight();
        long m5706constructorimpl3 = androidx.compose.ui.geometry.CornerRadius.m5706constructorimpl((java.lang.Float.floatToRawIntBits(bottomRight) << 32) | (java.lang.Float.floatToRawIntBits(bottomRight) & 4294967295L));
        float bottomLeft = cornerRadiiSpec.getBottomLeft();
        return new com.paypal.oslo.feature.cryptocurrency.ui.common.qr.renderer.DrawScopeQRRenderer.CornerRadii(m5706constructorimpl, m5706constructorimpl2, m5706constructorimpl3, androidx.compose.ui.geometry.CornerRadius.m5706constructorimpl((java.lang.Float.floatToRawIntBits(bottomLeft) << 32) | (java.lang.Float.floatToRawIntBits(bottomLeft) & 4294967295L)), null);
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0082\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0014\u001a\u00020\u00028\u0007¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0016\u001a\u00020\u00028\u0007¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u0011\u0010\u0015\u001a\u00020\u00028\u0007¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0012\u001a\u00020\u00028\u0007¢\u0006\u0006\n\u0004\b\u0017\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/common/qr/renderer/DrawScopeQRRenderer$CornerRadii;", "", "Landroidx/compose/ui/geometry/CornerRadius;", "p0", "p1", "p2", "p3", "<init>", "(JJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighSpeedVideoFpsRanges", "J", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizes", "Camera2StreamConfigurationMap", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final /* data */ class CornerRadii {

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        final long getHighSpeedVideoFpsRanges;

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        final long getHighSpeedVideoFpsRangesFor;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        final long getHighSpeedVideoSizes;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        final long Camera2StreamConfigurationMap;

        private CornerRadii(long j, long j2, long j3, long j4) {
            this.getHighSpeedVideoFpsRangesFor = j;
            this.Camera2StreamConfigurationMap = j2;
            this.getHighSpeedVideoSizes = j3;
            this.getHighSpeedVideoFpsRanges = j4;
        }

        public final java.lang.String toString() {
            java.lang.String m5720toStringimpl = androidx.compose.ui.geometry.CornerRadius.m5720toStringimpl(this.getHighSpeedVideoFpsRangesFor);
            java.lang.String m5720toStringimpl2 = androidx.compose.ui.geometry.CornerRadius.m5720toStringimpl(this.Camera2StreamConfigurationMap);
            java.lang.String m5720toStringimpl3 = androidx.compose.ui.geometry.CornerRadius.m5720toStringimpl(this.getHighSpeedVideoSizes);
            java.lang.String m5720toStringimpl4 = androidx.compose.ui.geometry.CornerRadius.m5720toStringimpl(this.getHighSpeedVideoFpsRanges);
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CornerRadii(getHighSpeedVideoFpsRangesFor=");
            sb.append(m5720toStringimpl);
            sb.append(", Camera2StreamConfigurationMap=");
            sb.append(m5720toStringimpl2);
            sb.append(", getHighSpeedVideoSizes=");
            sb.append(m5720toStringimpl3);
            sb.append(", getHighSpeedVideoFpsRanges=");
            sb.append(m5720toStringimpl4);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((androidx.compose.ui.geometry.CornerRadius.m5714hashCodeimpl(this.getHighSpeedVideoFpsRangesFor) * 31) + androidx.compose.ui.geometry.CornerRadius.m5714hashCodeimpl(this.Camera2StreamConfigurationMap)) * 31) + androidx.compose.ui.geometry.CornerRadius.m5714hashCodeimpl(this.getHighSpeedVideoSizes)) * 31) + androidx.compose.ui.geometry.CornerRadius.m5714hashCodeimpl(this.getHighSpeedVideoFpsRanges);
        }

        public final boolean equals(java.lang.Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof com.paypal.oslo.feature.cryptocurrency.ui.common.qr.renderer.DrawScopeQRRenderer.CornerRadii)) {
                return false;
            }
            com.paypal.oslo.feature.cryptocurrency.ui.common.qr.renderer.DrawScopeQRRenderer.CornerRadii cornerRadii = (com.paypal.oslo.feature.cryptocurrency.ui.common.qr.renderer.DrawScopeQRRenderer.CornerRadii) p0;
            return androidx.compose.ui.geometry.CornerRadius.m5711equalsimpl0(this.getHighSpeedVideoFpsRangesFor, cornerRadii.getHighSpeedVideoFpsRangesFor) && androidx.compose.ui.geometry.CornerRadius.m5711equalsimpl0(this.Camera2StreamConfigurationMap, cornerRadii.Camera2StreamConfigurationMap) && androidx.compose.ui.geometry.CornerRadius.m5711equalsimpl0(this.getHighSpeedVideoSizes, cornerRadii.getHighSpeedVideoSizes) && androidx.compose.ui.geometry.CornerRadius.m5711equalsimpl0(this.getHighSpeedVideoFpsRanges, cornerRadii.getHighSpeedVideoFpsRanges);
        }

        public /* synthetic */ CornerRadii(long j, long j2, long j3, long j4, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(j, j2, j3, j4);
        }
    }

    public /* synthetic */ DrawScopeQRRenderer(androidx.compose.ui.graphics.drawscope.DrawScope drawScope, long j, long j2, long j3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(drawScope, j, j2, j3);
    }
}
