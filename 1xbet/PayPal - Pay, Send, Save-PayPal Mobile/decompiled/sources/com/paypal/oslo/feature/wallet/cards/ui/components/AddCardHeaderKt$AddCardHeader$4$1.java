package com.paypal.oslo.feature.wallet.cards.ui.components;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
final class AddCardHeaderKt$AddCardHeader$4$1 implements androidx.compose.ui.layout.MeasurePolicy {
    final /* synthetic */ com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction getHighSpeedVideoFpsRangesFor;

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
        final com.paypal.oslo.feature.wallet.cards.ui.components.CenteredTopBarMeasurements m21098access$measureCenteredTopBarChildren_EkL_Y = com.paypal.oslo.feature.wallet.cards.ui.components.AddCardHeaderKt.m21098access$measureCenteredTopBarChildren_EkL_Y(list, j, this.getHighSpeedVideoFpsRangesFor != null, this.Camera2StreamConfigurationMap != null);
        highSpeedVideoFpsRanges = com.paypal.oslo.feature.wallet.cards.ui.components.AddCardHeaderKt.getHighSpeedVideoFpsRanges(androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(j), m21098access$measureCenteredTopBarChildren_EkL_Y.getHighSpeedVideoSizes, m21098access$measureCenteredTopBarChildren_EkL_Y.getHighResolutionOutputSizeshNQ4ISI);
        return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(j), m21098access$measureCenteredTopBarChildren_EkL_Y.Camera2StreamConfigurationMap, null, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.cards.ui.components.AddCardHeaderKt$AddCardHeader$4$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.wallet.cards.ui.components.AddCardHeaderKt$AddCardHeader$4$1.Camera2StreamConfigurationMap(com.paypal.oslo.feature.wallet.cards.ui.components.CenteredTopBarMeasurements.this, highSpeedVideoFpsRanges, j, (androidx.compose.ui.layout.Placeable.PlacementScope) obj);
            }
        }, 4, null);
    }

    public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(com.paypal.oslo.feature.wallet.cards.ui.components.CenteredTopBarMeasurements centeredTopBarMeasurements, int i, long j, androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placementScope, "");
        com.paypal.oslo.feature.wallet.cards.ui.components.AddCardHeaderKt.access$placeCenteredTopBarChildren(placementScope, centeredTopBarMeasurements, i, androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(j));
        return kotlin.Unit.INSTANCE;
    }

    AddCardHeaderKt$AddCardHeader$4$1(com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction navAction, com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction navAction2) {
        this.getHighSpeedVideoFpsRangesFor = navAction;
        this.Camera2StreamConfigurationMap = navAction2;
    }
}
