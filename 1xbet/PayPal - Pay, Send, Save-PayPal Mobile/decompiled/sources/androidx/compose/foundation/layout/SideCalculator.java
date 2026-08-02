package androidx.compose.foundation.layout;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bb\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H&¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0007H&¢\u0006\u0004\b\u000e\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0007H&¢\u0006\u0004\b\u000f\u0010\u000bJ\u001f\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0004H&¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H&¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0007H&¢\u0006\u0004\b\u001b\u0010\u001cø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/layout/SideCalculator;", "", "Landroid/graphics/Insets;", "insets", "", "valueOf", "(Landroid/graphics/Insets;)I", "", "x", "y", "motionOf", "(FF)F", "p0", "p1", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRanges", "oldInsets", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.NEW_VALUE_KEY, "adjustInsets", "(Landroid/graphics/Insets;I)Landroid/graphics/Insets;", "Landroidx/compose/ui/geometry/Offset;", com.paypal.oslo.core.telemetry.compose.OsloAnalyticsProvider.AVAILABLE_CONDITION_KEY, "consumedOffsets-MK-Hz9U", "(J)J", "consumedOffsets", "Landroidx/compose/ui/unit/Velocity;", "remaining", "consumedVelocity-QWom1Mo", "(JF)J", "consumedVelocity", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
interface SideCalculator {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.foundation.layout.SideCalculator.Companion INSTANCE = androidx.compose.foundation.layout.SideCalculator.Companion.getHighResolutionOutputSizeshNQ4ISI;

    android.graphics.Insets adjustInsets(android.graphics.Insets oldInsets, int newValue);

    /* renamed from: consumedOffsets-MK-Hz9U, reason: not valid java name */
    long mo1721consumedOffsetsMKHz9U(long available);

    /* renamed from: consumedVelocity-QWom1Mo, reason: not valid java name */
    long mo1722consumedVelocityQWom1Mo(long available, float remaining);

    float motionOf(float x, float y);

    int valueOf(android.graphics.Insets insets);

    default float getHighSpeedVideoSizes(float p0, float p1) {
        return kotlin.ranges.RangesKt.coerceAtLeast(motionOf(p0, p1), 0.0f);
    }

    default float getHighSpeedVideoFpsRanges(float p0, float p1) {
        return kotlin.ranges.RangesKt.coerceAtMost(motionOf(p0, p1), 0.0f);
    }

    @kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0010\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0014\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0017"}, d2 = {"Landroidx/compose/foundation/layout/SideCalculator$Companion;", "", "<init>", "()V", "Landroidx/compose/foundation/layout/WindowInsetsSides;", "side", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/foundation/layout/SideCalculator;", "chooseCalculator-ni1skBw", "(ILandroidx/compose/ui/unit/LayoutDirection;)Landroidx/compose/foundation/layout/SideCalculator;", "chooseCalculator", "Landroidx/compose/foundation/layout/SideCalculator$Companion$LeftSideCalculator$1;", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/foundation/layout/SideCalculator$Companion$LeftSideCalculator$1;", "Landroidx/compose/foundation/layout/SideCalculator$Companion$TopSideCalculator$1;", "getHighSpeedVideoFpsRanges", "Landroidx/compose/foundation/layout/SideCalculator$Companion$TopSideCalculator$1;", "getHighSpeedVideoSizes", "Landroidx/compose/foundation/layout/SideCalculator$Companion$RightSideCalculator$1;", "Camera2StreamConfigurationMap", "Landroidx/compose/foundation/layout/SideCalculator$Companion$RightSideCalculator$1;", "Landroidx/compose/foundation/layout/SideCalculator$Companion$BottomSideCalculator$1;", "Landroidx/compose/foundation/layout/SideCalculator$Companion$BottomSideCalculator$1;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ androidx.compose.foundation.layout.SideCalculator.Companion getHighResolutionOutputSizeshNQ4ISI = new androidx.compose.foundation.layout.SideCalculator.Companion();
        private static final androidx.compose.foundation.layout.SideCalculator$Companion$LeftSideCalculator$1 getHighSpeedVideoFpsRangesFor = new androidx.compose.foundation.layout.SideCalculator() { // from class: androidx.compose.foundation.layout.SideCalculator$Companion$LeftSideCalculator$1
            @Override // androidx.compose.foundation.layout.SideCalculator
            public final float motionOf(float x, float y) {
                return x;
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public final int valueOf(android.graphics.Insets insets) {
                return insets.left;
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public final android.graphics.Insets adjustInsets(android.graphics.Insets oldInsets, int newValue) {
                return android.graphics.Insets.of(newValue, oldInsets.top, oldInsets.right, oldInsets.bottom);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            /* renamed from: consumedVelocity-QWom1Mo */
            public final long mo1722consumedVelocityQWom1Mo(long available, float remaining) {
                return androidx.compose.ui.unit.VelocityKt.Velocity(androidx.compose.ui.unit.Velocity.m8839getXimpl(available) - remaining, 0.0f);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            /* renamed from: consumedOffsets-MK-Hz9U */
            public final long mo1721consumedOffsetsMKHz9U(long available) {
                return androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat((int) (available >> 32))) << 32) | (java.lang.Float.floatToRawIntBits(0.0f) & 4294967295L));
            }
        };

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private static final androidx.compose.foundation.layout.SideCalculator$Companion$TopSideCalculator$1 getHighSpeedVideoSizes = new androidx.compose.foundation.layout.SideCalculator() { // from class: androidx.compose.foundation.layout.SideCalculator$Companion$TopSideCalculator$1
            @Override // androidx.compose.foundation.layout.SideCalculator
            public final float motionOf(float x, float y) {
                return y;
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public final int valueOf(android.graphics.Insets insets) {
                return insets.top;
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public final android.graphics.Insets adjustInsets(android.graphics.Insets oldInsets, int newValue) {
                return android.graphics.Insets.of(oldInsets.left, newValue, oldInsets.right, oldInsets.bottom);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            /* renamed from: consumedVelocity-QWom1Mo */
            public final long mo1722consumedVelocityQWom1Mo(long available, float remaining) {
                return androidx.compose.ui.unit.VelocityKt.Velocity(0.0f, androidx.compose.ui.unit.Velocity.m8840getYimpl(available) - remaining);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            /* renamed from: consumedOffsets-MK-Hz9U */
            public final long mo1721consumedOffsetsMKHz9U(long available) {
                return androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat((int) (available & 4294967295L))) & 4294967295L) | (java.lang.Float.floatToRawIntBits(0.0f) << 32));
            }
        };

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private static final androidx.compose.foundation.layout.SideCalculator$Companion$RightSideCalculator$1 getHighSpeedVideoFpsRanges = new androidx.compose.foundation.layout.SideCalculator() { // from class: androidx.compose.foundation.layout.SideCalculator$Companion$RightSideCalculator$1
            @Override // androidx.compose.foundation.layout.SideCalculator
            public final float motionOf(float x, float y) {
                return -x;
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public final int valueOf(android.graphics.Insets insets) {
                return insets.right;
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public final android.graphics.Insets adjustInsets(android.graphics.Insets oldInsets, int newValue) {
                return android.graphics.Insets.of(oldInsets.left, oldInsets.top, newValue, oldInsets.bottom);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            /* renamed from: consumedVelocity-QWom1Mo */
            public final long mo1722consumedVelocityQWom1Mo(long available, float remaining) {
                return androidx.compose.ui.unit.VelocityKt.Velocity(androidx.compose.ui.unit.Velocity.m8839getXimpl(available) + remaining, 0.0f);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            /* renamed from: consumedOffsets-MK-Hz9U */
            public final long mo1721consumedOffsetsMKHz9U(long available) {
                return androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat((int) (available >> 32))) << 32) | (java.lang.Float.floatToRawIntBits(0.0f) & 4294967295L));
            }
        };

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private static final androidx.compose.foundation.layout.SideCalculator$Companion$BottomSideCalculator$1 Camera2StreamConfigurationMap = new androidx.compose.foundation.layout.SideCalculator() { // from class: androidx.compose.foundation.layout.SideCalculator$Companion$BottomSideCalculator$1
            @Override // androidx.compose.foundation.layout.SideCalculator
            public final float motionOf(float x, float y) {
                return -y;
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public final int valueOf(android.graphics.Insets insets) {
                return insets.bottom;
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public final android.graphics.Insets adjustInsets(android.graphics.Insets oldInsets, int newValue) {
                return android.graphics.Insets.of(oldInsets.left, oldInsets.top, oldInsets.right, newValue);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            /* renamed from: consumedVelocity-QWom1Mo */
            public final long mo1722consumedVelocityQWom1Mo(long available, float remaining) {
                return androidx.compose.ui.unit.VelocityKt.Velocity(0.0f, androidx.compose.ui.unit.Velocity.m8840getYimpl(available) + remaining);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            /* renamed from: consumedOffsets-MK-Hz9U */
            public final long mo1721consumedOffsetsMKHz9U(long available) {
                return androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat((int) (available & 4294967295L))) & 4294967295L) | (java.lang.Float.floatToRawIntBits(0.0f) << 32));
            }
        };

        private Companion() {
        }

        /* renamed from: chooseCalculator-ni1skBw, reason: not valid java name */
        public final androidx.compose.foundation.layout.SideCalculator m1723chooseCalculatorni1skBw(int side, androidx.compose.ui.unit.LayoutDirection layoutDirection) {
            if (androidx.compose.foundation.layout.WindowInsetsSides.m1761equalsimpl0(side, androidx.compose.foundation.layout.WindowInsetsSides.INSTANCE.m1774getLeftJoeWqyM())) {
                return getHighSpeedVideoFpsRangesFor;
            }
            if (androidx.compose.foundation.layout.WindowInsetsSides.m1761equalsimpl0(side, androidx.compose.foundation.layout.WindowInsetsSides.INSTANCE.m1777getTopJoeWqyM())) {
                return getHighSpeedVideoSizes;
            }
            if (androidx.compose.foundation.layout.WindowInsetsSides.m1761equalsimpl0(side, androidx.compose.foundation.layout.WindowInsetsSides.INSTANCE.m1775getRightJoeWqyM())) {
                return getHighSpeedVideoFpsRanges;
            }
            if (androidx.compose.foundation.layout.WindowInsetsSides.m1761equalsimpl0(side, androidx.compose.foundation.layout.WindowInsetsSides.INSTANCE.m1771getBottomJoeWqyM())) {
                return Camera2StreamConfigurationMap;
            }
            if (androidx.compose.foundation.layout.WindowInsetsSides.m1761equalsimpl0(side, androidx.compose.foundation.layout.WindowInsetsSides.INSTANCE.m1776getStartJoeWqyM())) {
                if (layoutDirection == androidx.compose.ui.unit.LayoutDirection.Ltr) {
                    return getHighSpeedVideoFpsRangesFor;
                }
                return getHighSpeedVideoFpsRanges;
            }
            if (androidx.compose.foundation.layout.WindowInsetsSides.m1761equalsimpl0(side, androidx.compose.foundation.layout.WindowInsetsSides.INSTANCE.m1772getEndJoeWqyM())) {
                if (layoutDirection == androidx.compose.ui.unit.LayoutDirection.Ltr) {
                    return getHighSpeedVideoFpsRanges;
                }
                return getHighSpeedVideoFpsRangesFor;
            }
            throw new java.lang.IllegalStateException("Only Left, Top, Right, Bottom, Start and End are allowed".toString());
        }
    }
}
