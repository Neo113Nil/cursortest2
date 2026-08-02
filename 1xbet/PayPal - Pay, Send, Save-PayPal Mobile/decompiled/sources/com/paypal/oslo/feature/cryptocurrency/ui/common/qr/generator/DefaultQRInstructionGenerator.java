package com.paypal.oslo.feature.cryptocurrency.ui.common.qr.generator;

@kotlin.Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JU\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014JK\u0010#\u001a\u00020\"2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00160\u001e2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00120 H\u0002¢\u0006\u0004\b#\u0010$"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/common/qr/generator/DefaultQRInstructionGenerator;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/common/qr/generator/QRInstructionGenerator;", "<init>", "()V", "Lcom/google/zxing/common/BitMatrix;", "bitMatrix", "Lcom/paypal/oslo/feature/cryptocurrency/ui/common/qr/QRCodeMetrics;", com.datadog.android.trace.internal.domain.event.SpanEventSerializer.METRICS_KEY_PREFIX, "", "canvasWidth", "canvasHeight", "Landroidx/compose/ui/graphics/Color;", "dataColor", "backgroundColor", "", "centerClearanceModules", "density", "", "Lcom/paypal/oslo/feature/cryptocurrency/ui/receive/model/DrawingInstruction;", "generate-kKq0p4A", "(Lcom/google/zxing/common/BitMatrix;Lcom/paypal/oslo/feature/cryptocurrency/ui/common/qr/QRCodeMetrics;FFJJIF)Ljava/util/List;", "generate", "Lcom/paypal/oslo/feature/cryptocurrency/ui/common/qr/model/ModuleType;", "p0", "Lcom/paypal/oslo/feature/cryptocurrency/ui/receive/model/PositionMarkerCorner;", "p1", "Lcom/paypal/oslo/feature/cryptocurrency/ui/common/qr/QRCodePositionDetector$MarkerRegion;", "p2", "Lcom/paypal/oslo/feature/cryptocurrency/ui/common/qr/model/QRRenderingParams;", "p3", "", "p4", "", "p5", "", "getHighResolutionOutputSizeshNQ4ISI", "(Lcom/paypal/oslo/feature/cryptocurrency/ui/common/qr/model/ModuleType;Lcom/paypal/oslo/feature/cryptocurrency/ui/receive/model/PositionMarkerCorner;Lcom/paypal/oslo/feature/cryptocurrency/ui/common/qr/QRCodePositionDetector$MarkerRegion;Lcom/paypal/oslo/feature/cryptocurrency/ui/common/qr/model/QRRenderingParams;Ljava/util/Set;Ljava/util/List;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DefaultQRInstructionGenerator implements com.paypal.oslo.feature.cryptocurrency.ui.common.qr.generator.QRInstructionGenerator {
    public static final int $stable = 0;

    @Override // com.paypal.oslo.feature.cryptocurrency.ui.common.qr.generator.QRInstructionGenerator
    /* renamed from: generate-kKq0p4A, reason: not valid java name */
    public final java.util.List<com.paypal.oslo.feature.cryptocurrency.ui.receive.model.DrawingInstruction> mo13872generatekKq0p4A(com.google.zxing.common.BitMatrix bitMatrix, com.paypal.oslo.feature.cryptocurrency.ui.common.qr.QRCodeMetrics metrics, float canvasWidth, float canvasHeight, long dataColor, long backgroundColor, int centerClearanceModules, float density) {
        int i;
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bitMatrix, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metrics, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(new com.paypal.oslo.feature.cryptocurrency.ui.receive.model.DrawingInstruction.Background(backgroundColor, canvasWidth, canvasHeight, null));
        com.paypal.oslo.feature.cryptocurrency.ui.common.qr.model.QRRenderingParams calculateRenderingParams = com.paypal.oslo.feature.cryptocurrency.ui.common.qr.coordinator.QRCodeRenderingCoordinatorKt.calculateRenderingParams(canvasWidth, bitMatrix.getWidth(), metrics.m13871getOffsetDpD9Ej5fM() * density);
        com.paypal.oslo.feature.cryptocurrency.ui.common.qr.model.CenterClearanceRegion calculateCenterClearanceRegion = com.paypal.oslo.feature.cryptocurrency.ui.common.qr.coordinator.QRCodeRenderingCoordinatorKt.calculateCenterClearanceRegion(bitMatrix.getWidth(), bitMatrix.getHeight(), centerClearanceModules);
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        java.util.List listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.cryptocurrency.ui.common.qr.model.MarkerDrawCoordinates[]{com.paypal.oslo.feature.cryptocurrency.ui.common.qr.coordinator.QRCodeRenderingCoordinatorKt.calculateMarkerDrawCoordinates(metrics.getPositionMarkers().getTopLeft(), calculateRenderingParams.getModuleSize(), calculateRenderingParams.getCustomMarkerOffset(), com.paypal.oslo.feature.cryptocurrency.ui.receive.model.PositionMarkerCorner.TOP_LEFT), com.paypal.oslo.feature.cryptocurrency.ui.common.qr.coordinator.QRCodeRenderingCoordinatorKt.calculateMarkerDrawCoordinates(metrics.getPositionMarkers().getTopRight(), calculateRenderingParams.getModuleSize(), calculateRenderingParams.getCustomMarkerOffset(), com.paypal.oslo.feature.cryptocurrency.ui.receive.model.PositionMarkerCorner.TOP_RIGHT), com.paypal.oslo.feature.cryptocurrency.ui.common.qr.coordinator.QRCodeRenderingCoordinatorKt.calculateMarkerDrawCoordinates(metrics.getPositionMarkers().getBottomLeft(), calculateRenderingParams.getModuleSize(), calculateRenderingParams.getCustomMarkerOffset(), com.paypal.oslo.feature.cryptocurrency.ui.receive.model.PositionMarkerCorner.BOTTOM_LEFT)});
        int height = bitMatrix.getHeight();
        for (int i3 = 0; i3 < height; i3++) {
            int width = bitMatrix.getWidth();
            int i4 = 0;
            while (i4 < width) {
                com.paypal.oslo.feature.cryptocurrency.ui.common.qr.model.ModuleType moduleRenderType = com.paypal.oslo.feature.cryptocurrency.ui.common.qr.coordinator.QRCodeRenderingCoordinatorKt.getModuleRenderType(i4, i3, bitMatrix, calculateCenterClearanceRegion, metrics.getPositionMarkers());
                if (kotlin.jvm.internal.Intrinsics.areEqual(moduleRenderType, com.paypal.oslo.feature.cryptocurrency.ui.common.qr.model.ModuleType.Skip.INSTANCE)) {
                    i = i4;
                    i2 = width;
                } else if (kotlin.jvm.internal.Intrinsics.areEqual(moduleRenderType, com.paypal.oslo.feature.cryptocurrency.ui.common.qr.model.ModuleType.PositionMarkerTopLeft.INSTANCE)) {
                    i = i4;
                    i2 = width;
                    getHighResolutionOutputSizeshNQ4ISI(moduleRenderType, com.paypal.oslo.feature.cryptocurrency.ui.receive.model.PositionMarkerCorner.TOP_LEFT, metrics.getPositionMarkers().getTopLeft(), calculateRenderingParams, linkedHashSet, arrayList);
                } else {
                    i = i4;
                    i2 = width;
                    if (kotlin.jvm.internal.Intrinsics.areEqual(moduleRenderType, com.paypal.oslo.feature.cryptocurrency.ui.common.qr.model.ModuleType.PositionMarkerTopRight.INSTANCE)) {
                        getHighResolutionOutputSizeshNQ4ISI(moduleRenderType, com.paypal.oslo.feature.cryptocurrency.ui.receive.model.PositionMarkerCorner.TOP_RIGHT, metrics.getPositionMarkers().getTopRight(), calculateRenderingParams, linkedHashSet, arrayList);
                    } else if (kotlin.jvm.internal.Intrinsics.areEqual(moduleRenderType, com.paypal.oslo.feature.cryptocurrency.ui.common.qr.model.ModuleType.PositionMarkerBottomLeft.INSTANCE)) {
                        getHighResolutionOutputSizeshNQ4ISI(moduleRenderType, com.paypal.oslo.feature.cryptocurrency.ui.receive.model.PositionMarkerCorner.BOTTOM_LEFT, metrics.getPositionMarkers().getBottomLeft(), calculateRenderingParams, linkedHashSet, arrayList);
                    } else {
                        if (!kotlin.jvm.internal.Intrinsics.areEqual(moduleRenderType, com.paypal.oslo.feature.cryptocurrency.ui.common.qr.model.ModuleType.Data.INSTANCE)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        com.paypal.oslo.feature.cryptocurrency.ui.common.qr.model.DataModuleSpec calculateDataModuleSpec = com.paypal.oslo.feature.cryptocurrency.ui.common.qr.coordinator.QRCodeRenderingCoordinatorKt.calculateDataModuleSpec(i, i3, calculateRenderingParams.getModuleSize());
                        java.util.List<com.paypal.oslo.feature.cryptocurrency.ui.common.qr.model.MarkerDrawCoordinates> list = listOf;
                        if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
                            for (com.paypal.oslo.feature.cryptocurrency.ui.common.qr.model.MarkerDrawCoordinates markerDrawCoordinates : list) {
                                float centerX = calculateDataModuleSpec.getCenterX();
                                float centerY = calculateDataModuleSpec.getCenterY();
                                float radius = calculateDataModuleSpec.getRadius();
                                float x = markerDrawCoordinates.getX();
                                float y = markerDrawCoordinates.getY();
                                float x2 = markerDrawCoordinates.getX();
                                if (com.paypal.oslo.feature.cryptocurrency.ui.common.qr.coordinator.QRCodeRenderingCoordinatorKt.isCircleOverlappingRect(centerX, centerY, radius, x, y, markerDrawCoordinates.getMarkerSize() + x2, markerDrawCoordinates.getY() + markerDrawCoordinates.getMarkerSize())) {
                                    break;
                                }
                            }
                        }
                        arrayList.add(new com.paypal.oslo.feature.cryptocurrency.ui.receive.model.DrawingInstruction.DataModule(calculateDataModuleSpec.getCenterX(), calculateDataModuleSpec.getCenterY(), calculateDataModuleSpec.getRadius(), dataColor, null));
                    }
                }
                i4 = i + 1;
                width = i2;
            }
        }
        return arrayList;
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.cryptocurrency.ui.common.qr.model.ModuleType p0, com.paypal.oslo.feature.cryptocurrency.ui.receive.model.PositionMarkerCorner p1, com.paypal.oslo.feature.cryptocurrency.ui.common.qr.QRCodePositionDetector.MarkerRegion p2, com.paypal.oslo.feature.cryptocurrency.ui.common.qr.model.QRRenderingParams p3, java.util.Set<com.paypal.oslo.feature.cryptocurrency.ui.common.qr.model.ModuleType> p4, java.util.List<com.paypal.oslo.feature.cryptocurrency.ui.receive.model.DrawingInstruction> p5) {
        if (p4.contains(p0)) {
            return;
        }
        com.paypal.oslo.feature.cryptocurrency.ui.common.qr.model.MarkerDrawCoordinates calculateMarkerDrawCoordinates = com.paypal.oslo.feature.cryptocurrency.ui.common.qr.coordinator.QRCodeRenderingCoordinatorKt.calculateMarkerDrawCoordinates(p2, p3.getModuleSize(), p3.getCustomMarkerOffset(), p1);
        p5.add(new com.paypal.oslo.feature.cryptocurrency.ui.receive.model.DrawingInstruction.PositionMarker(calculateMarkerDrawCoordinates.getX(), calculateMarkerDrawCoordinates.getY(), calculateMarkerDrawCoordinates.getMarkerSize(), p3.getModuleSize(), p1));
        p4.add(p0);
    }
}
