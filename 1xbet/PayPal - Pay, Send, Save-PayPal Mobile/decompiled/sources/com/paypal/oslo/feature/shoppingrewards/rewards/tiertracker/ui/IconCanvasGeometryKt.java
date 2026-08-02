package com.paypal.oslo.feature.shoppingrewards.rewards.tiertracker.ui;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a'\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "canvasWidth", "Landroidx/compose/ui/unit/Density;", "density", "normalizedProgress", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/tiertracker/ui/IconCanvasGeometry;", "calculateIconCanvasGeometry", "(FLandroidx/compose/ui/unit/Density;F)Lcom/paypal/oslo/feature/shoppingrewards/rewards/tiertracker/ui/IconCanvasGeometry;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class IconCanvasGeometryKt {
    public static final com.paypal.oslo.feature.shoppingrewards.rewards.tiertracker.ui.IconCanvasGeometry calculateIconCanvasGeometry(float f, androidx.compose.ui.unit.Density density, float f2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(density, "");
        float f3 = f / 2.0f;
        float calculateIconScaleFactor = com.paypal.oslo.feature.shoppingrewards.rewards.tiertracker.ui.CircularProgressTrackerIconCalculationsKt.calculateIconScaleFactor(f, density.mo1418toPx0680j_4(androidx.compose.ui.unit.Dp.m8601constructorimpl(250.0f)));
        float calculateScaledPx = com.paypal.oslo.feature.shoppingrewards.rewards.tiertracker.ui.CircularProgressTrackerIconCalculationsKt.calculateScaledPx(density.mo1418toPx0680j_4(androidx.compose.ui.unit.Dp.m8601constructorimpl(30.0f)), calculateIconScaleFactor);
        float calculateScaledPx2 = com.paypal.oslo.feature.shoppingrewards.rewards.tiertracker.ui.CircularProgressTrackerIconCalculationsKt.calculateScaledPx(density.mo1418toPx0680j_4(androidx.compose.ui.unit.Dp.m8601constructorimpl(40.0f)), calculateIconScaleFactor);
        float calculateScaledPx3 = com.paypal.oslo.feature.shoppingrewards.rewards.tiertracker.ui.CircularProgressTrackerIconCalculationsKt.calculateScaledPx(density.mo1418toPx0680j_4(androidx.compose.ui.unit.Dp.m8601constructorimpl(10.0f)), calculateIconScaleFactor);
        float calculateIconRadius = com.paypal.oslo.feature.shoppingrewards.rewards.tiertracker.ui.CircularProgressTrackerIconCalculationsKt.calculateIconRadius(f, calculateScaledPx);
        long calculateIconArcTopLeft = com.paypal.oslo.feature.shoppingrewards.rewards.tiertracker.ui.CircularProgressTrackerIconCalculationsKt.calculateIconArcTopLeft(f3, f3, calculateIconRadius);
        long calculateIconArcSize = com.paypal.oslo.feature.shoppingrewards.rewards.tiertracker.ui.CircularProgressTrackerIconCalculationsKt.calculateIconArcSize(calculateIconRadius);
        float calculateIconFullSweep = com.paypal.oslo.feature.shoppingrewards.rewards.tiertracker.ui.CircularProgressTrackerIconDrawingKt.calculateIconFullSweep(310.0f);
        kotlin.Pair<java.lang.Float, java.lang.Float> calculateAccentArc = com.paypal.oslo.feature.shoppingrewards.rewards.tiertracker.ui.CircularProgressTrackerIconCalculationsKt.calculateAccentArc(116.0f, calculateIconFullSweep, f2);
        return new com.paypal.oslo.feature.shoppingrewards.rewards.tiertracker.ui.IconCanvasGeometry(f3, f3, calculateScaledPx2, calculateScaledPx3, calculateIconArcTopLeft, calculateIconArcSize, 116.0f, calculateIconFullSweep, calculateAccentArc.component1().floatValue(), calculateAccentArc.component2().floatValue(), com.paypal.oslo.feature.shoppingrewards.rewards.tiertracker.ui.CircularProgressTrackerIconCalculationsKt.calculateIconIndicatorCenter(116.0f, 310.0f, f2, f3, f3, calculateIconRadius), com.paypal.oslo.feature.shoppingrewards.rewards.tiertracker.ui.CircularProgressTrackerIconCalculationsKt.calculateIconCrosshairArm(f), com.paypal.oslo.feature.shoppingrewards.rewards.tiertracker.ui.CircularProgressTrackerIconCalculationsKt.calculateIconCrosshairStroke(f), null);
    }
}
