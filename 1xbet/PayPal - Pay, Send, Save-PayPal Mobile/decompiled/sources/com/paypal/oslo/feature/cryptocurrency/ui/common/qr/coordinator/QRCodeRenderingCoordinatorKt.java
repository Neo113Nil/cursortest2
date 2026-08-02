package com.paypal.oslo.feature.cryptocurrency.ui.common.qr.coordinator;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a'\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a7\u0010\u0011\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a'\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a/\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001bH\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a'\u0010!\u001a\u00020 2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0000H\u0000¢\u0006\u0004\b!\u0010\"\u001aG\u0010+\u001a\u00020*2\u0006\u0010#\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\u00002\u0006\u0010%\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\u00002\u0006\u0010(\u001a\u00020\u00002\u0006\u0010)\u001a\u00020\u0000H\u0000¢\u0006\u0004\b+\u0010,\"\u0014\u0010-\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b-\u0010.\"\u0014\u0010/\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b/\u0010."}, d2 = {"", "canvasWidth", "", "matrixWidth", "offsetPixels", "Lcom/paypal/oslo/feature/cryptocurrency/ui/common/qr/model/QRRenderingParams;", "calculateRenderingParams", "(FIF)Lcom/paypal/oslo/feature/cryptocurrency/ui/common/qr/model/QRRenderingParams;", "x", "y", "Lcom/google/zxing/common/BitMatrix;", "bitMatrix", "Lcom/paypal/oslo/feature/cryptocurrency/ui/common/qr/model/CenterClearanceRegion;", "centerRegion", "Lcom/paypal/oslo/feature/cryptocurrency/ui/common/qr/QRCodePositionDetector$PositionMarkers;", "positionMarkers", "Lcom/paypal/oslo/feature/cryptocurrency/ui/common/qr/model/ModuleType;", "getModuleRenderType", "(IILcom/google/zxing/common/BitMatrix;Lcom/paypal/oslo/feature/cryptocurrency/ui/common/qr/model/CenterClearanceRegion;Lcom/paypal/oslo/feature/cryptocurrency/ui/common/qr/QRCodePositionDetector$PositionMarkers;)Lcom/paypal/oslo/feature/cryptocurrency/ui/common/qr/model/ModuleType;", "matrixHeight", "clearanceModules", "calculateCenterClearanceRegion", "(III)Lcom/paypal/oslo/feature/cryptocurrency/ui/common/qr/model/CenterClearanceRegion;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/common/qr/QRCodePositionDetector$MarkerRegion;", "markerRegion", "moduleSize", "positiveOffset", "Lcom/paypal/oslo/feature/cryptocurrency/ui/receive/model/PositionMarkerCorner;", "markerType", "Lcom/paypal/oslo/feature/cryptocurrency/ui/common/qr/model/MarkerDrawCoordinates;", "calculateMarkerDrawCoordinates", "(Lcom/paypal/oslo/feature/cryptocurrency/ui/common/qr/QRCodePositionDetector$MarkerRegion;FFLcom/paypal/oslo/feature/cryptocurrency/ui/receive/model/PositionMarkerCorner;)Lcom/paypal/oslo/feature/cryptocurrency/ui/common/qr/model/MarkerDrawCoordinates;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/common/qr/model/DataModuleSpec;", "calculateDataModuleSpec", "(IIF)Lcom/paypal/oslo/feature/cryptocurrency/ui/common/qr/model/DataModuleSpec;", "centerX", "centerY", "radius", com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_LEFT, com.dyneti.android.dyscan.DyScanHelperTextPosition.TOP, com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_RIGHT, com.dyneti.android.dyscan.DyScanHelperTextPosition.BOTTOM, "", "isCircleOverlappingRect", "(FFFFFFF)Z", "PositionMarkerSizeModules", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "DataModuleRadiusDivisor"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class QRCodeRenderingCoordinatorKt {
    public static final float DataModuleRadiusDivisor = 2.0f;
    public static final float PositionMarkerSizeModules = 7.0f;

    public static final com.paypal.oslo.feature.cryptocurrency.ui.common.qr.model.QRRenderingParams calculateRenderingParams(float f, int i, float f2) {
        return new com.paypal.oslo.feature.cryptocurrency.ui.common.qr.model.QRRenderingParams(f / i, f2, -f2);
    }

    public static final com.paypal.oslo.feature.cryptocurrency.ui.common.qr.model.ModuleType getModuleRenderType(int i, int i2, com.google.zxing.common.BitMatrix bitMatrix, com.paypal.oslo.feature.cryptocurrency.ui.common.qr.model.CenterClearanceRegion centerClearanceRegion, com.paypal.oslo.feature.cryptocurrency.ui.common.qr.QRCodePositionDetector.PositionMarkers positionMarkers) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bitMatrix, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(centerClearanceRegion, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(positionMarkers, "");
        boolean z = bitMatrix.get(i, i2);
        boolean contains = centerClearanceRegion.contains(i, i2);
        boolean isPositionMarker = com.paypal.oslo.feature.cryptocurrency.ui.common.qr.QRCodePositionDetector.INSTANCE.isPositionMarker(i, i2, positionMarkers);
        if (!z) {
            return com.paypal.oslo.feature.cryptocurrency.ui.common.qr.model.ModuleType.Skip.INSTANCE;
        }
        if (contains) {
            return com.paypal.oslo.feature.cryptocurrency.ui.common.qr.model.ModuleType.Skip.INSTANCE;
        }
        if (!isPositionMarker) {
            return com.paypal.oslo.feature.cryptocurrency.ui.common.qr.model.ModuleType.Data.INSTANCE;
        }
        com.paypal.oslo.feature.cryptocurrency.ui.common.qr.QRCodePositionDetector.PositionMark positionMark = com.paypal.oslo.feature.cryptocurrency.ui.common.qr.QRCodePositionDetector.INSTANCE.getPositionMark(i, i2, positionMarkers);
        int i3 = positionMark == null ? -1 : com.paypal.oslo.feature.cryptocurrency.ui.common.qr.coordinator.QRCodeRenderingCoordinatorKt.WhenMappings.$EnumSwitchMapping$0[positionMark.ordinal()];
        if (i3 == -1) {
            return com.paypal.oslo.feature.cryptocurrency.ui.common.qr.model.ModuleType.Data.INSTANCE;
        }
        if (i3 == 1) {
            return com.paypal.oslo.feature.cryptocurrency.ui.common.qr.model.ModuleType.PositionMarkerTopLeft.INSTANCE;
        }
        if (i3 == 2) {
            return com.paypal.oslo.feature.cryptocurrency.ui.common.qr.model.ModuleType.PositionMarkerTopRight.INSTANCE;
        }
        if (i3 != 3) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.feature.cryptocurrency.ui.common.qr.model.ModuleType.PositionMarkerBottomLeft.INSTANCE;
    }

    public static final com.paypal.oslo.feature.cryptocurrency.ui.common.qr.model.CenterClearanceRegion calculateCenterClearanceRegion(int i, int i2, int i3) {
        int i4 = i / 2;
        int i5 = i2 / 2;
        int i6 = i3 / 2;
        return new com.paypal.oslo.feature.cryptocurrency.ui.common.qr.model.CenterClearanceRegion(i4 - i6, i5 - i6, i4 + i6, i5 + i6);
    }

    public static final com.paypal.oslo.feature.cryptocurrency.ui.common.qr.model.MarkerDrawCoordinates calculateMarkerDrawCoordinates(com.paypal.oslo.feature.cryptocurrency.ui.common.qr.QRCodePositionDetector.MarkerRegion markerRegion, float f, float f2, com.paypal.oslo.feature.cryptocurrency.ui.receive.model.PositionMarkerCorner positionMarkerCorner) {
        float startX;
        float startY;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(markerRegion, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(positionMarkerCorner, "");
        int i = com.paypal.oslo.feature.cryptocurrency.ui.common.qr.coordinator.QRCodeRenderingCoordinatorKt.WhenMappings.$EnumSwitchMapping$1[positionMarkerCorner.ordinal()];
        if (i == 1 || i == 2) {
            startX = (markerRegion.getStartX() * f) + f2;
        } else {
            if (i != 3) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            startX = (markerRegion.getStartX() * f) - f2;
        }
        int i2 = com.paypal.oslo.feature.cryptocurrency.ui.common.qr.coordinator.QRCodeRenderingCoordinatorKt.WhenMappings.$EnumSwitchMapping$1[positionMarkerCorner.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                startY = (markerRegion.getStartY() * f) - f2;
                return new com.paypal.oslo.feature.cryptocurrency.ui.common.qr.model.MarkerDrawCoordinates(startX, startY, f * 7.0f);
            }
            if (i2 != 3) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        startY = (markerRegion.getStartY() * f) + f2;
        return new com.paypal.oslo.feature.cryptocurrency.ui.common.qr.model.MarkerDrawCoordinates(startX, startY, f * 7.0f);
    }

    public static final com.paypal.oslo.feature.cryptocurrency.ui.common.qr.model.DataModuleSpec calculateDataModuleSpec(int i, int i2, float f) {
        float f2 = f / 2.0f;
        return new com.paypal.oslo.feature.cryptocurrency.ui.common.qr.model.DataModuleSpec(f2, (i * f) + f2, (i2 * f) + f2);
    }

    public static final boolean isCircleOverlappingRect(float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        float coerceIn = f - kotlin.ranges.RangesKt.coerceIn(f, f4, f6);
        float coerceIn2 = f2 - kotlin.ranges.RangesKt.coerceIn(f2, f5, f7);
        return (coerceIn * coerceIn) + (coerceIn2 * coerceIn2) < f3 * f3;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.cryptocurrency.ui.common.qr.QRCodePositionDetector.PositionMark.values().length];
            try {
                iArr[com.paypal.oslo.feature.cryptocurrency.ui.common.qr.QRCodePositionDetector.PositionMark.TOP_LEFT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.cryptocurrency.ui.common.qr.QRCodePositionDetector.PositionMark.TOP_RIGHT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.cryptocurrency.ui.common.qr.QRCodePositionDetector.PositionMark.BOTTOM_LEFT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.paypal.oslo.feature.cryptocurrency.ui.receive.model.PositionMarkerCorner.values().length];
            try {
                iArr2[com.paypal.oslo.feature.cryptocurrency.ui.receive.model.PositionMarkerCorner.TOP_LEFT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr2[com.paypal.oslo.feature.cryptocurrency.ui.receive.model.PositionMarkerCorner.BOTTOM_LEFT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr2[com.paypal.oslo.feature.cryptocurrency.ui.receive.model.PositionMarkerCorner.TOP_RIGHT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }
}
