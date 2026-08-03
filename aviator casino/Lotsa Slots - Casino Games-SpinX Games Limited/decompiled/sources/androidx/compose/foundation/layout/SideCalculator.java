package androidx.compose.foundation.layout;

/* compiled from: WindowInsetsConnection.android.kt */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000b\bc\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u001a\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH&ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\"\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH&ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000fH\u0016J\u0018\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000fH&J\u0018\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000fH\u0016J\u0010\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0003H&ø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\u001aÀ\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/layout/SideCalculator;", "", "adjustInsets", "Landroid/graphics/Insets;", "oldInsets", "newValue", "", "consumedOffsets", "Landroidx/compose/ui/geometry/Offset;", "available", "consumedOffsets-MK-Hz9U", "(J)J", "consumedVelocity", "Landroidx/compose/ui/unit/Velocity;", "remaining", "", "consumedVelocity-QWom1Mo", "(JF)J", "hideMotion", "x", "y", "motionOf", "showMotion", "valueOf", "insets", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
interface SideCalculator {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.foundation.layout.SideCalculator.Companion INSTANCE = androidx.compose.foundation.layout.SideCalculator.Companion.$$INSTANCE;

    android.graphics.Insets adjustInsets(android.graphics.Insets oldInsets, int newValue);

    /* renamed from: consumedOffsets-MK-Hz9U, reason: not valid java name */
    long mo598consumedOffsetsMKHz9U(long available);

    /* renamed from: consumedVelocity-QWom1Mo, reason: not valid java name */
    long mo599consumedVelocityQWom1Mo(long available, float remaining);

    float hideMotion(float x, float y);

    float motionOf(float x, float y);

    float showMotion(float x, float y);

    int valueOf(android.graphics.Insets insets);

    /* compiled from: WindowInsetsConnection.android.kt */
    /* renamed from: androidx.compose.foundation.layout.SideCalculator$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
    }

    /* compiled from: WindowInsetsConnection.android.kt */
    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0004\u0004\u0007\n\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016R\u0010\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0005R\u0010\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\bR\u0010\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000bR\u0010\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000e\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0017"}, d2 = {"Landroidx/compose/foundation/layout/SideCalculator$Companion;", "", "()V", "BottomSideCalculator", "androidx/compose/foundation/layout/SideCalculator$Companion$BottomSideCalculator$1", "Landroidx/compose/foundation/layout/SideCalculator$Companion$BottomSideCalculator$1;", "LeftSideCalculator", "androidx/compose/foundation/layout/SideCalculator$Companion$LeftSideCalculator$1", "Landroidx/compose/foundation/layout/SideCalculator$Companion$LeftSideCalculator$1;", "RightSideCalculator", "androidx/compose/foundation/layout/SideCalculator$Companion$RightSideCalculator$1", "Landroidx/compose/foundation/layout/SideCalculator$Companion$RightSideCalculator$1;", "TopSideCalculator", "androidx/compose/foundation/layout/SideCalculator$Companion$TopSideCalculator$1", "Landroidx/compose/foundation/layout/SideCalculator$Companion$TopSideCalculator$1;", "chooseCalculator", "Landroidx/compose/foundation/layout/SideCalculator;", "side", "Landroidx/compose/foundation/layout/WindowInsetsSides;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "chooseCalculator-ni1skBw", "(ILandroidx/compose/ui/unit/LayoutDirection;)Landroidx/compose/foundation/layout/SideCalculator;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ androidx.compose.foundation.layout.SideCalculator.Companion $$INSTANCE = new androidx.compose.foundation.layout.SideCalculator.Companion();
        private static final androidx.compose.foundation.layout.SideCalculator$Companion$LeftSideCalculator$1 LeftSideCalculator = new androidx.compose.foundation.layout.SideCalculator() { // from class: androidx.compose.foundation.layout.SideCalculator$Companion$LeftSideCalculator$1
            @Override // androidx.compose.foundation.layout.SideCalculator
            public /* synthetic */ float hideMotion(float f, float f2) {
                float coerceAtMost;
                coerceAtMost = kotlin.ranges.RangesKt.coerceAtMost(motionOf(f, f2), 0.0f);
                return coerceAtMost;
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public float motionOf(float x, float y) {
                return x;
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public /* synthetic */ float showMotion(float f, float f2) {
                float coerceAtLeast;
                coerceAtLeast = kotlin.ranges.RangesKt.coerceAtLeast(motionOf(f, f2), 0.0f);
                return coerceAtLeast;
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public int valueOf(android.graphics.Insets insets) {
                return insets.left;
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public android.graphics.Insets adjustInsets(android.graphics.Insets oldInsets, int newValue) {
                return android.graphics.Insets.of(newValue, oldInsets.top, oldInsets.right, oldInsets.bottom);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            /* renamed from: consumedOffsets-MK-Hz9U */
            public long mo598consumedOffsetsMKHz9U(long available) {
                return androidx.compose.ui.geometry.OffsetKt.Offset(androidx.compose.ui.geometry.Offset.m1871getXimpl(available), 0.0f);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            /* renamed from: consumedVelocity-QWom1Mo */
            public long mo599consumedVelocityQWom1Mo(long available, float remaining) {
                return androidx.compose.ui.unit.VelocityKt.Velocity(androidx.compose.ui.unit.Velocity.m4717getXimpl(available) - remaining, 0.0f);
            }
        };
        private static final androidx.compose.foundation.layout.SideCalculator$Companion$TopSideCalculator$1 TopSideCalculator = new androidx.compose.foundation.layout.SideCalculator() { // from class: androidx.compose.foundation.layout.SideCalculator$Companion$TopSideCalculator$1
            @Override // androidx.compose.foundation.layout.SideCalculator
            public /* synthetic */ float hideMotion(float f, float f2) {
                float coerceAtMost;
                coerceAtMost = kotlin.ranges.RangesKt.coerceAtMost(motionOf(f, f2), 0.0f);
                return coerceAtMost;
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public float motionOf(float x, float y) {
                return y;
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public /* synthetic */ float showMotion(float f, float f2) {
                float coerceAtLeast;
                coerceAtLeast = kotlin.ranges.RangesKt.coerceAtLeast(motionOf(f, f2), 0.0f);
                return coerceAtLeast;
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public int valueOf(android.graphics.Insets insets) {
                return insets.top;
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public android.graphics.Insets adjustInsets(android.graphics.Insets oldInsets, int newValue) {
                return android.graphics.Insets.of(oldInsets.left, newValue, oldInsets.right, oldInsets.bottom);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            /* renamed from: consumedOffsets-MK-Hz9U */
            public long mo598consumedOffsetsMKHz9U(long available) {
                return androidx.compose.ui.geometry.OffsetKt.Offset(0.0f, androidx.compose.ui.geometry.Offset.m1872getYimpl(available));
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            /* renamed from: consumedVelocity-QWom1Mo */
            public long mo599consumedVelocityQWom1Mo(long available, float remaining) {
                return androidx.compose.ui.unit.VelocityKt.Velocity(0.0f, androidx.compose.ui.unit.Velocity.m4718getYimpl(available) - remaining);
            }
        };
        private static final androidx.compose.foundation.layout.SideCalculator$Companion$RightSideCalculator$1 RightSideCalculator = new androidx.compose.foundation.layout.SideCalculator() { // from class: androidx.compose.foundation.layout.SideCalculator$Companion$RightSideCalculator$1
            @Override // androidx.compose.foundation.layout.SideCalculator
            public /* synthetic */ float hideMotion(float f, float f2) {
                float coerceAtMost;
                coerceAtMost = kotlin.ranges.RangesKt.coerceAtMost(motionOf(f, f2), 0.0f);
                return coerceAtMost;
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public float motionOf(float x, float y) {
                return -x;
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public /* synthetic */ float showMotion(float f, float f2) {
                float coerceAtLeast;
                coerceAtLeast = kotlin.ranges.RangesKt.coerceAtLeast(motionOf(f, f2), 0.0f);
                return coerceAtLeast;
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public int valueOf(android.graphics.Insets insets) {
                return insets.right;
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public android.graphics.Insets adjustInsets(android.graphics.Insets oldInsets, int newValue) {
                return android.graphics.Insets.of(oldInsets.left, oldInsets.top, newValue, oldInsets.bottom);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            /* renamed from: consumedOffsets-MK-Hz9U */
            public long mo598consumedOffsetsMKHz9U(long available) {
                return androidx.compose.ui.geometry.OffsetKt.Offset(androidx.compose.ui.geometry.Offset.m1871getXimpl(available), 0.0f);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            /* renamed from: consumedVelocity-QWom1Mo */
            public long mo599consumedVelocityQWom1Mo(long available, float remaining) {
                return androidx.compose.ui.unit.VelocityKt.Velocity(androidx.compose.ui.unit.Velocity.m4717getXimpl(available) + remaining, 0.0f);
            }
        };
        private static final androidx.compose.foundation.layout.SideCalculator$Companion$BottomSideCalculator$1 BottomSideCalculator = new androidx.compose.foundation.layout.SideCalculator() { // from class: androidx.compose.foundation.layout.SideCalculator$Companion$BottomSideCalculator$1
            @Override // androidx.compose.foundation.layout.SideCalculator
            public /* synthetic */ float hideMotion(float f, float f2) {
                float coerceAtMost;
                coerceAtMost = kotlin.ranges.RangesKt.coerceAtMost(motionOf(f, f2), 0.0f);
                return coerceAtMost;
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public float motionOf(float x, float y) {
                return -y;
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public /* synthetic */ float showMotion(float f, float f2) {
                float coerceAtLeast;
                coerceAtLeast = kotlin.ranges.RangesKt.coerceAtLeast(motionOf(f, f2), 0.0f);
                return coerceAtLeast;
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public int valueOf(android.graphics.Insets insets) {
                return insets.bottom;
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public android.graphics.Insets adjustInsets(android.graphics.Insets oldInsets, int newValue) {
                return android.graphics.Insets.of(oldInsets.left, oldInsets.top, oldInsets.right, newValue);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            /* renamed from: consumedOffsets-MK-Hz9U */
            public long mo598consumedOffsetsMKHz9U(long available) {
                return androidx.compose.ui.geometry.OffsetKt.Offset(0.0f, androidx.compose.ui.geometry.Offset.m1872getYimpl(available));
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            /* renamed from: consumedVelocity-QWom1Mo */
            public long mo599consumedVelocityQWom1Mo(long available, float remaining) {
                return androidx.compose.ui.unit.VelocityKt.Velocity(0.0f, androidx.compose.ui.unit.Velocity.m4718getYimpl(available) + remaining);
            }
        };

        private Companion() {
        }

        /* renamed from: chooseCalculator-ni1skBw, reason: not valid java name */
        public final androidx.compose.foundation.layout.SideCalculator m600chooseCalculatorni1skBw(int side, androidx.compose.ui.unit.LayoutDirection layoutDirection) {
            if (androidx.compose.foundation.layout.WindowInsetsSides.m650equalsimpl0(side, androidx.compose.foundation.layout.WindowInsetsSides.INSTANCE.m664getLeftJoeWqyM())) {
                return LeftSideCalculator;
            }
            if (androidx.compose.foundation.layout.WindowInsetsSides.m650equalsimpl0(side, androidx.compose.foundation.layout.WindowInsetsSides.INSTANCE.m667getTopJoeWqyM())) {
                return TopSideCalculator;
            }
            if (androidx.compose.foundation.layout.WindowInsetsSides.m650equalsimpl0(side, androidx.compose.foundation.layout.WindowInsetsSides.INSTANCE.m665getRightJoeWqyM())) {
                return RightSideCalculator;
            }
            if (androidx.compose.foundation.layout.WindowInsetsSides.m650equalsimpl0(side, androidx.compose.foundation.layout.WindowInsetsSides.INSTANCE.m661getBottomJoeWqyM())) {
                return BottomSideCalculator;
            }
            if (androidx.compose.foundation.layout.WindowInsetsSides.m650equalsimpl0(side, androidx.compose.foundation.layout.WindowInsetsSides.INSTANCE.m666getStartJoeWqyM())) {
                if (layoutDirection == androidx.compose.ui.unit.LayoutDirection.Ltr) {
                    return LeftSideCalculator;
                }
                return RightSideCalculator;
            }
            if (!androidx.compose.foundation.layout.WindowInsetsSides.m650equalsimpl0(side, androidx.compose.foundation.layout.WindowInsetsSides.INSTANCE.m662getEndJoeWqyM())) {
                throw new java.lang.IllegalStateException("Only Left, Top, Right, Bottom, Start and End are allowed".toString());
            }
            if (layoutDirection == androidx.compose.ui.unit.LayoutDirection.Ltr) {
                return RightSideCalculator;
            }
            return LeftSideCalculator;
        }
    }
}
