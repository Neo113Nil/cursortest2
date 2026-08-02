package com.paypal.oslo.core.commonui.components;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
final class TopBarKt$CenteredTopBarLayout$1$1 implements androidx.compose.ui.layout.MeasurePolicy {
    final /* synthetic */ kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoSizes;

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final /* bridge */ int maxIntrinsicHeight(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable> list, int i) {
        return super.maxIntrinsicHeight(intrinsicMeasureScope, list, i);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final /* bridge */ int maxIntrinsicWidth(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable> list, int i) {
        return super.maxIntrinsicWidth(intrinsicMeasureScope, list, i);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final /* bridge */ int minIntrinsicHeight(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable> list, int i) {
        return super.minIntrinsicHeight(intrinsicMeasureScope, list, i);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final /* bridge */ int minIntrinsicWidth(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable> list, int i) {
        return super.minIntrinsicWidth(intrinsicMeasureScope, list, i);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final androidx.compose.ui.layout.MeasureResult mo1095measure3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, java.util.List<? extends androidx.compose.ui.layout.Measurable> list, final long j) {
        final int highSpeedVideoFpsRangesFor;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(measureScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        final com.paypal.oslo.core.commonui.components.CenteredTopBarMeasurements m11217access$measureCenteredTopBarChildren_EkL_Y = com.paypal.oslo.core.commonui.components.TopBarKt.m11217access$measureCenteredTopBarChildren_EkL_Y(list, j, this.getHighSpeedVideoSizes != null, this.getHighSpeedVideoFpsRanges != null);
        highSpeedVideoFpsRangesFor = com.paypal.oslo.core.commonui.components.TopBarKt.getHighSpeedVideoFpsRangesFor(androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(j), m11217access$measureCenteredTopBarChildren_EkL_Y.Camera2StreamConfigurationMap, m11217access$measureCenteredTopBarChildren_EkL_Y.getHighSpeedVideoFpsRanges);
        return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(j), m11217access$measureCenteredTopBarChildren_EkL_Y.getHighSpeedVideoFpsRangesFor, null, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.core.commonui.components.TopBarKt$CenteredTopBarLayout$1$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.core.commonui.components.TopBarKt$CenteredTopBarLayout$1$1.getHighSpeedVideoFpsRangesFor(com.paypal.oslo.core.commonui.components.CenteredTopBarMeasurements.this, highSpeedVideoFpsRangesFor, j, (androidx.compose.ui.layout.Placeable.PlacementScope) obj);
            }
        }, 4, null);
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(com.paypal.oslo.core.commonui.components.CenteredTopBarMeasurements centeredTopBarMeasurements, int i, long j, androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placementScope, "");
        com.paypal.oslo.core.commonui.components.TopBarKt.access$placeCenteredTopBarChildren(placementScope, centeredTopBarMeasurements, i, androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(j));
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    TopBarKt$CenteredTopBarLayout$1$1(kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function22) {
        this.getHighSpeedVideoSizes = function2;
        this.getHighSpeedVideoFpsRanges = function22;
    }
}
