package com.paypal.oslo.feature.p2p.ui.components;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
final class P2pTooltipBannerKt$P2pTooltipContent$2$1 implements androidx.compose.ui.layout.MeasurePolicy {
    final /* synthetic */ androidx.compose.ui.unit.Density getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.p2p.ui.components.P2pTooltipPositionProvider getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.p2p.ui.components.P2pTooltipConfig getHighSpeedVideoSizes;

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
    public final androidx.compose.ui.layout.MeasureResult mo1095measure3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, java.util.List<? extends androidx.compose.ui.layout.Measurable> list, long j) {
        float f;
        float f2;
        kotlin.Pair pair;
        int width;
        int height;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(measureScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        final androidx.compose.ui.layout.Placeable mo7353measureBRTryo0 = list.get(0).mo7353measureBRTryo0(j);
        androidx.compose.ui.unit.Density density = this.getHighResolutionOutputSizeshNQ4ISI;
        f = com.paypal.oslo.feature.p2p.ui.components.P2pTooltipBannerKt.getHighSpeedVideoFpsRangesFor;
        int mo1412roundToPx0680j_4 = density.mo1412roundToPx0680j_4(f);
        androidx.compose.ui.unit.Density density2 = this.getHighResolutionOutputSizeshNQ4ISI;
        f2 = com.paypal.oslo.feature.p2p.ui.components.P2pTooltipBannerKt.Camera2StreamConfigurationMap;
        int mo1412roundToPx0680j_42 = density2.mo1412roundToPx0680j_4(f2);
        int i = com.paypal.oslo.feature.p2p.ui.components.P2pTooltipBannerKt$P2pTooltipContent$2$1.WhenMappings.$EnumSwitchMapping$0[this.getHighSpeedVideoSizes.getPosition().ordinal()];
        if (i == 1 || i == 2) {
            pair = kotlin.TuplesKt.to(java.lang.Integer.valueOf(mo1412roundToPx0680j_42), java.lang.Integer.valueOf(mo1412roundToPx0680j_4));
        } else {
            if (i != 3 && i != 4) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            pair = kotlin.TuplesKt.to(java.lang.Integer.valueOf(mo1412roundToPx0680j_4), java.lang.Integer.valueOf(mo1412roundToPx0680j_42));
        }
        int intValue = ((java.lang.Number) pair.component1()).intValue();
        int intValue2 = ((java.lang.Number) pair.component2()).intValue();
        final androidx.compose.ui.layout.Placeable mo7353measureBRTryo02 = list.get(1).mo7353measureBRTryo0(androidx.compose.ui.unit.Constraints.m8544copyZbe2FdA(j, intValue, intValue, intValue2, intValue2));
        int i2 = com.paypal.oslo.feature.p2p.ui.components.P2pTooltipBannerKt$P2pTooltipContent$2$1.WhenMappings.$EnumSwitchMapping$0[this.getHighSpeedVideoSizes.getPosition().ordinal()];
        if (i2 == 1 || i2 == 2) {
            width = mo7353measureBRTryo0.getWidth() + mo7353measureBRTryo02.getWidth();
        } else {
            if (i2 != 3 && i2 != 4) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            width = mo7353measureBRTryo0.getWidth();
        }
        int i3 = com.paypal.oslo.feature.p2p.ui.components.P2pTooltipBannerKt$P2pTooltipContent$2$1.WhenMappings.$EnumSwitchMapping$0[this.getHighSpeedVideoSizes.getPosition().ordinal()];
        if (i3 == 1 || i3 == 2) {
            height = mo7353measureBRTryo0.getHeight();
        } else {
            if (i3 != 3 && i3 != 4) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            height = mo7353measureBRTryo0.getHeight() + mo7353measureBRTryo02.getHeight();
        }
        final int i4 = height;
        final com.paypal.oslo.feature.p2p.ui.components.P2pTooltipConfig p2pTooltipConfig = this.getHighSpeedVideoSizes;
        final com.paypal.oslo.feature.p2p.ui.components.P2pTooltipPositionProvider p2pTooltipPositionProvider = this.getHighSpeedVideoFpsRanges;
        final int i5 = width;
        return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, width, i4, null, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.p2p.ui.components.P2pTooltipBannerKt$P2pTooltipContent$2$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.p2p.ui.components.P2pTooltipBannerKt$P2pTooltipContent$2$1.getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.p2p.ui.components.P2pTooltipConfig.this, p2pTooltipPositionProvider, mo7353measureBRTryo0, mo7353measureBRTryo02, i5, i4, (androidx.compose.ui.layout.Placeable.PlacementScope) obj);
            }
        }, 4, null);
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.p2p.ui.components.P2pTooltipConfig p2pTooltipConfig, com.paypal.oslo.feature.p2p.ui.components.P2pTooltipPositionProvider p2pTooltipPositionProvider, androidx.compose.ui.layout.Placeable placeable, androidx.compose.ui.layout.Placeable placeable2, int i, int i2, androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placementScope, "");
        com.paypal.oslo.feature.p2p.ui.components.P2pTooltipBannerKt.access$placeTooltipAndArrow(placementScope, p2pTooltipConfig, p2pTooltipPositionProvider, placeable, placeable2, i, i2);
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.p2p.ui.components.P2pTooltipPosition.values().length];
            try {
                iArr[com.paypal.oslo.feature.p2p.ui.components.P2pTooltipPosition.Start.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.p2p.ui.components.P2pTooltipPosition.End.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.p2p.ui.components.P2pTooltipPosition.Top.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.p2p.ui.components.P2pTooltipPosition.Bottom.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    P2pTooltipBannerKt$P2pTooltipContent$2$1(androidx.compose.ui.unit.Density density, com.paypal.oslo.feature.p2p.ui.components.P2pTooltipConfig p2pTooltipConfig, com.paypal.oslo.feature.p2p.ui.components.P2pTooltipPositionProvider p2pTooltipPositionProvider) {
        this.getHighResolutionOutputSizeshNQ4ISI = density;
        this.getHighSpeedVideoSizes = p2pTooltipConfig;
        this.getHighSpeedVideoFpsRanges = p2pTooltipPositionProvider;
    }
}
