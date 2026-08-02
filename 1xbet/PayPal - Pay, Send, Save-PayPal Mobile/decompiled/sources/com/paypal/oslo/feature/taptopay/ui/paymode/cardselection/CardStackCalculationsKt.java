package com.paypal.oslo.feature.taptopay.ui.paymode.cardselection;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a/\u0010\b\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001aO\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a]\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00032\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u0013H\u0000¢\u0006\u0004\b\u0016\u0010\u0017"}, d2 = {"", "index", "selectedCardIndex", "Landroidx/compose/ui/unit/Dp;", "containerHeightDp", "selectedCardYPositionDp", "computeCollapsedY-4j6BHR0", "(IIFF)F", "computeCollapsedY", "expandedAnchorY", "cardVisibleHeightDp", "scrollOffsetDp", "cardHeightDp", "snapThreshold", "snapZoneHeight", "computeExpandedY-a145CXI", "(IFFFFFFF)F", "computeExpandedY", "cardCount", "Lkotlin/ranges/ClosedRange;", "scrollBounds", "Lcom/paypal/oslo/feature/taptopay/ui/paymode/cardselection/SnapResult;", "calculateCardStackSnap-GBMyqPk", "(IFFFFFFFLkotlin/ranges/ClosedRange;)Lcom/paypal/oslo/feature/taptopay/ui/paymode/cardselection/SnapResult;", "calculateCardStackSnap"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CardStackCalculationsKt {
    /* renamed from: computeCollapsedY-4j6BHR0, reason: not valid java name */
    public static final float m20110computeCollapsedY4j6BHR0(int i, int i2, float f, float f2) {
        if (i == i2) {
            return f2;
        }
        if (i > i2) {
            i--;
        }
        return androidx.compose.ui.unit.Dp.m8601constructorimpl(androidx.compose.ui.unit.Dp.m8601constructorimpl(f - androidx.compose.ui.unit.Dp.m8601constructorimpl(58.0f)) - androidx.compose.ui.unit.Dp.m8601constructorimpl(androidx.compose.ui.unit.Dp.m8601constructorimpl(8.0f) * (kotlin.ranges.RangesKt.coerceAtMost(i, 2) + 1)));
    }

    /* renamed from: calculateCardStackSnap-GBMyqPk, reason: not valid java name */
    public static final com.paypal.oslo.feature.taptopay.ui.paymode.cardselection.SnapResult m20109calculateCardStackSnapGBMyqPk(int i, float f, float f2, float f3, float f4, float f5, float f6, float f7, kotlin.ranges.ClosedRange<androidx.compose.ui.unit.Dp> closedRange) {
        androidx.compose.ui.unit.Dp m8599boximpl;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(closedRange, "");
        if (androidx.compose.ui.unit.Dp.m8606equalsimpl0(f2, com.paypal.pds.core.ConstantsKt.getSpacing0()) || i == 0) {
            return new com.paypal.oslo.feature.taptopay.ui.paymode.cardselection.SnapResult(null, null, null);
        }
        float m20111computeExpandedYa145CXI = m20111computeExpandedYa145CXI(0, f4, f2, f, f3, f5, f6, f7);
        float f8 = m20111computeExpandedYa145CXI;
        float abs = java.lang.Math.abs(androidx.compose.ui.unit.Dp.m8601constructorimpl(m20111computeExpandedYa145CXI - f4));
        int i2 = 0;
        for (int i3 = 1; i3 < i; i3++) {
            float m20111computeExpandedYa145CXI2 = m20111computeExpandedYa145CXI(i3, f4, f2, f, f3, f5, f6, f7);
            float abs2 = java.lang.Math.abs(androidx.compose.ui.unit.Dp.m8601constructorimpl(m20111computeExpandedYa145CXI2 - f4));
            if (abs2 < abs) {
                f8 = m20111computeExpandedYa145CXI2;
                abs = abs2;
                i2 = i3;
            }
        }
        if (androidx.compose.ui.unit.Dp.m8600compareTo0680j_4(androidx.compose.ui.unit.Dp.m8601constructorimpl(f8 + f3), f6) > 0) {
            m8599boximpl = null;
        } else {
            float m8615unboximpl = ((androidx.compose.ui.unit.Dp) kotlin.ranges.RangesKt.coerceIn(androidx.compose.ui.unit.Dp.m8599boximpl(androidx.compose.ui.unit.Dp.m8601constructorimpl(-androidx.compose.ui.unit.Dp.m8601constructorimpl(i2 * f2))), closedRange.getStart(), closedRange.getEndInclusive())).m8615unboximpl();
            if (m8615unboximpl == 0.0f) {
                m8615unboximpl = com.paypal.pds.core.ConstantsKt.getSpacing0();
            }
            m8599boximpl = androidx.compose.ui.unit.Dp.m8599boximpl(m8615unboximpl);
        }
        return new com.paypal.oslo.feature.taptopay.ui.paymode.cardselection.SnapResult(m8599boximpl, java.lang.Integer.valueOf(i2), null);
    }

    /* renamed from: computeExpandedY-a145CXI, reason: not valid java name */
    public static final float m20111computeExpandedYa145CXI(int i, float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        float m8601constructorimpl = androidx.compose.ui.unit.Dp.m8601constructorimpl(f - androidx.compose.ui.unit.Dp.m8601constructorimpl(androidx.compose.ui.unit.Dp.m8601constructorimpl(f2 * i) + f3));
        float m8601constructorimpl2 = androidx.compose.ui.unit.Dp.m8601constructorimpl(f4 + m8601constructorimpl);
        if (androidx.compose.ui.unit.Dp.m8600compareTo0680j_4(m8601constructorimpl2, f6) <= 0) {
            return ((androidx.compose.ui.unit.Dp) kotlin.ranges.RangesKt.coerceAtLeast(androidx.compose.ui.unit.Dp.m8599boximpl(m8601constructorimpl), androidx.compose.ui.unit.Dp.m8599boximpl(com.paypal.pds.core.ConstantsKt.getSpacing0()))).m8615unboximpl();
        }
        return ((androidx.compose.ui.unit.Dp) kotlin.ranges.RangesKt.coerceAtLeast(androidx.compose.ui.unit.Dp.m8599boximpl(androidx.compose.ui.unit.Dp.m8601constructorimpl(m8601constructorimpl + androidx.compose.ui.unit.Dp.m8601constructorimpl(androidx.compose.ui.unit.Dp.m8601constructorimpl(androidx.compose.ui.unit.Dp.m8601constructorimpl(androidx.compose.ui.unit.Dp.m8601constructorimpl(f5 - androidx.compose.ui.unit.Dp.m8601constructorimpl(58.0f)) - androidx.compose.ui.unit.Dp.m8601constructorimpl(androidx.compose.ui.unit.Dp.m8601constructorimpl(8.0f) * (kotlin.ranges.RangesKt.coerceAtMost(i, 2) + 1))) - m8601constructorimpl) * androidx.compose.animation.core.EasingKt.getFastOutSlowInEasing().transform(kotlin.ranges.RangesKt.coerceIn((androidx.compose.ui.unit.Dp.m8601constructorimpl(m8601constructorimpl2 - f6) / f7) * 1.5f, 0.0f, 1.0f))))), androidx.compose.ui.unit.Dp.m8599boximpl(com.paypal.pds.core.ConstantsKt.getSpacing0()))).m8615unboximpl();
    }
}
