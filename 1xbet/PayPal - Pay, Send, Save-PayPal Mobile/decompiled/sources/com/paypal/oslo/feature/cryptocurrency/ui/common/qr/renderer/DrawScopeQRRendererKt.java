package com.paypal.oslo.feature.cryptocurrency.ui.common.qr.renderer;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a7\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"", "x", "y", "markerSize", "moduleSize", "Lcom/paypal/oslo/feature/cryptocurrency/ui/receive/model/PositionMarkerCorner;", "roundedCorner", "Lcom/paypal/oslo/feature/cryptocurrency/ui/common/qr/renderer/PositionMarkerGeometry;", "calculatePositionMarkerGeometry", "(FFFFLcom/paypal/oslo/feature/cryptocurrency/ui/receive/model/PositionMarkerCorner;)Lcom/paypal/oslo/feature/cryptocurrency/ui/common/qr/renderer/PositionMarkerGeometry;", "corner", "radius", "Lcom/paypal/oslo/feature/cryptocurrency/ui/common/qr/renderer/CornerRadiiSpec;", "calculateCornerRadii", "(Lcom/paypal/oslo/feature/cryptocurrency/ui/receive/model/PositionMarkerCorner;F)Lcom/paypal/oslo/feature/cryptocurrency/ui/common/qr/renderer/CornerRadiiSpec;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DrawScopeQRRendererKt {
    public static final com.paypal.oslo.feature.cryptocurrency.ui.common.qr.renderer.PositionMarkerGeometry calculatePositionMarkerGeometry(float f, float f2, float f3, float f4, com.paypal.oslo.feature.cryptocurrency.ui.receive.model.PositionMarkerCorner positionMarkerCorner) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(positionMarkerCorner, "");
        com.paypal.oslo.feature.cryptocurrency.ui.common.qr.renderer.CornerRadiiSpec calculateCornerRadii = calculateCornerRadii(positionMarkerCorner, 1.5f * f4);
        com.paypal.oslo.feature.cryptocurrency.ui.common.qr.renderer.CornerRadiiSpec calculateCornerRadii2 = calculateCornerRadii(positionMarkerCorner, 1.0f * f4);
        com.paypal.oslo.feature.cryptocurrency.ui.common.qr.renderer.CornerRadiiSpec calculateCornerRadii3 = calculateCornerRadii(positionMarkerCorner, 0.6f * f4);
        com.paypal.oslo.feature.cryptocurrency.ui.common.qr.renderer.MarkerSquareSpec markerSquareSpec = new com.paypal.oslo.feature.cryptocurrency.ui.common.qr.renderer.MarkerSquareSpec(f, f2, f3, calculateCornerRadii);
        float f5 = 2.0f * f4;
        return new com.paypal.oslo.feature.cryptocurrency.ui.common.qr.renderer.PositionMarkerGeometry(markerSquareSpec, new com.paypal.oslo.feature.cryptocurrency.ui.common.qr.renderer.MarkerSquareSpec(f + f4, f2 + f4, 5.0f * f4, calculateCornerRadii2), new com.paypal.oslo.feature.cryptocurrency.ui.common.qr.renderer.MarkerSquareSpec(f + f5, f2 + f5, f4 * 3.0f, calculateCornerRadii3));
    }

    public static final com.paypal.oslo.feature.cryptocurrency.ui.common.qr.renderer.CornerRadiiSpec calculateCornerRadii(com.paypal.oslo.feature.cryptocurrency.ui.receive.model.PositionMarkerCorner positionMarkerCorner, float f) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(positionMarkerCorner, "");
        int i = com.paypal.oslo.feature.cryptocurrency.ui.common.qr.renderer.DrawScopeQRRendererKt.WhenMappings.$EnumSwitchMapping$0[positionMarkerCorner.ordinal()];
        if (i == 1) {
            return new com.paypal.oslo.feature.cryptocurrency.ui.common.qr.renderer.CornerRadiiSpec(f, 0.0f, 0.0f, 0.0f);
        }
        if (i == 2) {
            return new com.paypal.oslo.feature.cryptocurrency.ui.common.qr.renderer.CornerRadiiSpec(0.0f, f, 0.0f, 0.0f);
        }
        if (i != 3) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return new com.paypal.oslo.feature.cryptocurrency.ui.common.qr.renderer.CornerRadiiSpec(0.0f, 0.0f, 0.0f, f);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.cryptocurrency.ui.receive.model.PositionMarkerCorner.values().length];
            try {
                iArr[com.paypal.oslo.feature.cryptocurrency.ui.receive.model.PositionMarkerCorner.TOP_LEFT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.cryptocurrency.ui.receive.model.PositionMarkerCorner.TOP_RIGHT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.cryptocurrency.ui.receive.model.PositionMarkerCorner.BOTTOM_LEFT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
