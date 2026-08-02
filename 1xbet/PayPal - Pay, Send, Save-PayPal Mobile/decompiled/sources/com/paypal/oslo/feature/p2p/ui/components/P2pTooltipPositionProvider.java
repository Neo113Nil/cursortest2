package com.paypal.oslo.feature.p2p.ui.components;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\r8\u0007@BX\u0086\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\r8\u0007@BX\u0086\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/components/P2pTooltipPositionProvider;", "Landroidx/compose/ui/window/PopupPositionProvider;", "Lcom/paypal/oslo/feature/p2p/ui/components/P2pTooltipConfig;", "p0", "Landroidx/compose/ui/unit/Density;", "p1", "<init>", "(Lcom/paypal/oslo/feature/p2p/ui/components/P2pTooltipConfig;Landroidx/compose/ui/unit/Density;)V", "Landroidx/compose/ui/unit/IntRect;", "Landroidx/compose/ui/unit/IntSize;", "Landroidx/compose/ui/unit/LayoutDirection;", "p2", "p3", "Landroidx/compose/ui/unit/IntOffset;", "calculatePosition-llwVHH4", "(Landroidx/compose/ui/unit/IntRect;JLandroidx/compose/ui/unit/LayoutDirection;J)J", "calculatePosition", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/p2p/ui/components/P2pTooltipConfig;", "Camera2StreamConfigurationMap", "Landroidx/compose/ui/unit/Density;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoFpsRangesFor", "J", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
final class P2pTooltipPositionProvider implements androidx.compose.ui.window.PopupPositionProvider {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.compose.ui.unit.Density getHighSpeedVideoFpsRanges;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    long getHighSpeedVideoSizes;
    long getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.p2p.ui.components.P2pTooltipConfig Camera2StreamConfigurationMap;

    public P2pTooltipPositionProvider(com.paypal.oslo.feature.p2p.ui.components.P2pTooltipConfig p2pTooltipConfig, androidx.compose.ui.unit.Density density) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2pTooltipConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(density, "");
        this.Camera2StreamConfigurationMap = p2pTooltipConfig;
        this.getHighSpeedVideoFpsRanges = density;
        this.getHighSpeedVideoFpsRangesFor = androidx.compose.ui.unit.IntOffset.INSTANCE.m8740getZeronOccac();
        this.getHighSpeedVideoSizes = androidx.compose.ui.unit.IntOffset.INSTANCE.m8740getZeronOccac();
    }

    @Override // androidx.compose.ui.window.PopupPositionProvider
    /* renamed from: calculatePosition-llwVHH4 */
    public final long mo1386calculatePositionllwVHH4(androidx.compose.ui.unit.IntRect p0, long p1, androidx.compose.ui.unit.LayoutDirection p2, long p3) {
        long m8723constructorimpl;
        float f;
        int right;
        int left;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "");
        this.getHighSpeedVideoFpsRangesFor = p0.m8753getCenternOccac();
        int mo1412roundToPx0680j_4 = this.getHighSpeedVideoFpsRanges.mo1412roundToPx0680j_4(this.Camera2StreamConfigurationMap.m17272getOffsetD9Ej5fM());
        int i = com.paypal.oslo.feature.p2p.ui.components.P2pTooltipPositionProvider.WhenMappings.$EnumSwitchMapping$0[this.Camera2StreamConfigurationMap.getPosition().ordinal()];
        if (i == 1) {
            int left2 = p0.getLeft();
            int width = (p0.getWidth() - ((int) (p3 >> 32))) / 2;
            m8723constructorimpl = androidx.compose.ui.unit.IntOffset.m8723constructorimpl((((p0.getTop() - ((int) (p3 & 4294967295L))) - mo1412roundToPx0680j_4) & 4294967295L) | ((left2 + width) << 32));
        } else if (i == 2) {
            m8723constructorimpl = androidx.compose.ui.unit.IntOffset.m8723constructorimpl(((p0.getLeft() + ((p0.getWidth() - ((int) (p3 >> 32))) / 2)) << 32) | ((p0.getBottom() + mo1412roundToPx0680j_4) & 4294967295L));
        } else if (i == 3) {
            if (p2 == androidx.compose.ui.unit.LayoutDirection.Ltr) {
                right = (p0.getLeft() - ((int) (p3 >> 32))) - mo1412roundToPx0680j_4;
            } else {
                right = p0.getRight() + mo1412roundToPx0680j_4;
            }
            m8723constructorimpl = androidx.compose.ui.unit.IntOffset.m8723constructorimpl((right << 32) | ((p0.getTop() + ((p0.getHeight() - ((int) (p3 & 4294967295L))) / 2)) & 4294967295L));
        } else {
            if (i != 4) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            if (p2 == androidx.compose.ui.unit.LayoutDirection.Ltr) {
                left = p0.getRight() + mo1412roundToPx0680j_4;
            } else {
                left = (p0.getLeft() - ((int) (p3 >> 32))) - mo1412roundToPx0680j_4;
            }
            m8723constructorimpl = androidx.compose.ui.unit.IntOffset.m8723constructorimpl((left << 32) | ((p0.getTop() + ((p0.getHeight() - ((int) (p3 & 4294967295L))) / 2)) & 4294967295L));
        }
        androidx.compose.ui.unit.Density density = this.getHighSpeedVideoFpsRanges;
        f = com.paypal.oslo.feature.p2p.ui.components.P2pTooltipBannerKt.getHighResolutionOutputSizeshNQ4ISI;
        int mo1412roundToPx0680j_42 = density.mo1412roundToPx0680j_4(f);
        long m8723constructorimpl2 = androidx.compose.ui.unit.IntOffset.m8723constructorimpl((kotlin.ranges.RangesKt.coerceIn(androidx.compose.ui.unit.IntOffset.m8729getXimpl(m8723constructorimpl), mo1412roundToPx0680j_42, (((int) (p1 >> 32)) - ((int) (p3 >> 32))) - mo1412roundToPx0680j_42) << 32) | (kotlin.ranges.RangesKt.coerceIn(androidx.compose.ui.unit.IntOffset.m8730getYimpl(m8723constructorimpl), mo1412roundToPx0680j_42, (((int) (p1 & 4294967295L)) - ((int) (p3 & 4294967295L))) - mo1412roundToPx0680j_42) & 4294967295L));
        this.getHighSpeedVideoSizes = m8723constructorimpl2;
        return m8723constructorimpl2;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.p2p.ui.components.P2pTooltipPosition.values().length];
            try {
                iArr[com.paypal.oslo.feature.p2p.ui.components.P2pTooltipPosition.Top.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.p2p.ui.components.P2pTooltipPosition.Bottom.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.p2p.ui.components.P2pTooltipPosition.Start.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.p2p.ui.components.P2pTooltipPosition.End.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
