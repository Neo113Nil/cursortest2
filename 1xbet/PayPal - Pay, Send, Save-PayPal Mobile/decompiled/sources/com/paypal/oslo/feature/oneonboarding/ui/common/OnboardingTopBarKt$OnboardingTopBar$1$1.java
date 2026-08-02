package com.paypal.oslo.feature.oneonboarding.ui.common;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
final class OnboardingTopBarKt$OnboardingTopBar$1$1 implements androidx.compose.ui.layout.MeasurePolicy {
    final /* synthetic */ com.paypal.oslo.feature.oneonboarding.api.domain.NavDecor Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.oneonboarding.api.domain.NavDecor getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoSizes;

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
        final int highSpeedVideoFpsRanges;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(measureScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        boolean z = false;
        boolean z2 = (this.Camera2StreamConfigurationMap == null || this.getHighSpeedVideoSizes == null) ? false : true;
        if (this.getHighSpeedVideoFpsRanges != null && this.getHighSpeedVideoFpsRangesFor != null) {
            z = true;
        }
        final com.paypal.oslo.feature.oneonboarding.ui.common.CenteredTopBarMeasurements m17157access$measureCenteredTopBarChildren_EkL_Y = com.paypal.oslo.feature.oneonboarding.ui.common.OnboardingTopBarKt.m17157access$measureCenteredTopBarChildren_EkL_Y(list, j, z2, z);
        highSpeedVideoFpsRanges = com.paypal.oslo.feature.oneonboarding.ui.common.OnboardingTopBarKt.getHighSpeedVideoFpsRanges(androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(j), m17157access$measureCenteredTopBarChildren_EkL_Y.getHighSpeedVideoSizes, m17157access$measureCenteredTopBarChildren_EkL_Y.getHighResolutionOutputSizeshNQ4ISI);
        return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(j), m17157access$measureCenteredTopBarChildren_EkL_Y.getHighSpeedVideoFpsRangesFor, null, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.oneonboarding.ui.common.OnboardingTopBarKt$OnboardingTopBar$1$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.oneonboarding.ui.common.OnboardingTopBarKt$OnboardingTopBar$1$1.getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.oneonboarding.ui.common.CenteredTopBarMeasurements.this, highSpeedVideoFpsRanges, j, (androidx.compose.ui.layout.Placeable.PlacementScope) obj);
            }
        }, 4, null);
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.oneonboarding.ui.common.CenteredTopBarMeasurements centeredTopBarMeasurements, int i, long j, androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placementScope, "");
        com.paypal.oslo.feature.oneonboarding.ui.common.OnboardingTopBarKt.access$placeCenteredTopBarChildren(placementScope, centeredTopBarMeasurements, i, androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(j));
        return kotlin.Unit.INSTANCE;
    }

    OnboardingTopBarKt$OnboardingTopBar$1$1(com.paypal.oslo.feature.oneonboarding.api.domain.NavDecor navDecor, kotlin.jvm.functions.Function0<kotlin.Unit> function0, com.paypal.oslo.feature.oneonboarding.api.domain.NavDecor navDecor2, kotlin.jvm.functions.Function0<kotlin.Unit> function02) {
        this.Camera2StreamConfigurationMap = navDecor;
        this.getHighSpeedVideoSizes = function0;
        this.getHighSpeedVideoFpsRanges = navDecor2;
        this.getHighSpeedVideoFpsRangesFor = function02;
    }
}
