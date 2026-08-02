package androidx.compose.material3.internal;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/material3/internal/WindowAlignmentMarginPosition;", "", "<init>", "()V", "Horizontal", "Vertical"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class WindowAlignmentMarginPosition {
    public static final int $stable = 0;
    public static final androidx.compose.material3.internal.WindowAlignmentMarginPosition INSTANCE = new androidx.compose.material3.internal.WindowAlignmentMarginPosition();

    private WindowAlignmentMarginPosition() {
    }

    @kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\u0011\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010#\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\""}, d2 = {"Landroidx/compose/material3/internal/WindowAlignmentMarginPosition$Horizontal;", "Landroidx/compose/material3/internal/MenuPosition$Horizontal;", "Landroidx/compose/ui/Alignment$Horizontal;", "alignment", "", "margin", "<init>", "(Landroidx/compose/ui/Alignment$Horizontal;I)V", "Landroidx/compose/ui/unit/IntRect;", "anchorBounds", "Landroidx/compose/ui/unit/IntSize;", "windowSize", "menuWidth", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "position-95KtPRI", "(Landroidx/compose/ui/unit/IntRect;JILandroidx/compose/ui/unit/LayoutDirection;)I", com.daon.sdk.face.license.License.FEATURE_POSITION, "copy", "(Landroidx/compose/ui/Alignment$Horizontal;I)Landroidx/compose/material3/internal/WindowAlignmentMarginPosition$Horizontal;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/ui/Alignment$Horizontal;", "Camera2StreamConfigurationMap", "getHighSpeedVideoSizes", com.visa.cbp.getEncExpo.warmup, "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Horizontal implements androidx.compose.material3.internal.MenuPosition.Horizontal {
        public static final int $stable = 0;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private final androidx.compose.ui.Alignment.Horizontal Camera2StreamConfigurationMap;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private final int getHighResolutionOutputSizeshNQ4ISI;

        public Horizontal(androidx.compose.ui.Alignment.Horizontal horizontal, int i) {
            this.Camera2StreamConfigurationMap = horizontal;
            this.getHighResolutionOutputSizeshNQ4ISI = i;
        }

        @Override // androidx.compose.material3.internal.MenuPosition.Horizontal
        /* renamed from: position-95KtPRI */
        public final int mo4270position95KtPRI(androidx.compose.ui.unit.IntRect anchorBounds, long windowSize, int menuWidth, androidx.compose.ui.unit.LayoutDirection layoutDirection) {
            int i = (int) (windowSize >> 32);
            if (menuWidth >= i - (this.getHighResolutionOutputSizeshNQ4ISI * 2)) {
                return androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally().align(menuWidth, i, layoutDirection);
            }
            int align = this.Camera2StreamConfigurationMap.align(menuWidth, i, layoutDirection);
            int i2 = this.getHighResolutionOutputSizeshNQ4ISI;
            return kotlin.ranges.RangesKt.coerceIn(align, i2, (i - i2) - menuWidth);
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Horizontal(Camera2StreamConfigurationMap=");
            sb.append(this.Camera2StreamConfigurationMap);
            sb.append(", getHighResolutionOutputSizeshNQ4ISI=");
            sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
            sb.append(')');
            return sb.toString();
        }

        public final int hashCode() {
            return (this.Camera2StreamConfigurationMap.hashCode() * 31) + java.lang.Integer.hashCode(this.getHighResolutionOutputSizeshNQ4ISI);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof androidx.compose.material3.internal.WindowAlignmentMarginPosition.Horizontal)) {
                return false;
            }
            androidx.compose.material3.internal.WindowAlignmentMarginPosition.Horizontal horizontal = (androidx.compose.material3.internal.WindowAlignmentMarginPosition.Horizontal) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.Camera2StreamConfigurationMap, horizontal.Camera2StreamConfigurationMap) && this.getHighResolutionOutputSizeshNQ4ISI == horizontal.getHighResolutionOutputSizeshNQ4ISI;
        }

        public final androidx.compose.material3.internal.WindowAlignmentMarginPosition.Horizontal copy(androidx.compose.ui.Alignment.Horizontal alignment, int margin) {
            return new androidx.compose.material3.internal.WindowAlignmentMarginPosition.Horizontal(alignment, margin);
        }

        public static /* synthetic */ androidx.compose.material3.internal.WindowAlignmentMarginPosition.Horizontal copy$default(androidx.compose.material3.internal.WindowAlignmentMarginPosition.Horizontal horizontal, androidx.compose.ui.Alignment.Horizontal horizontal2, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                horizontal2 = horizontal.Camera2StreamConfigurationMap;
            }
            if ((i2 & 2) != 0) {
                i = horizontal.getHighResolutionOutputSizeshNQ4ISI;
            }
            return horizontal.copy(horizontal2, i);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\u000f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000eJ$\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001c\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 "}, d2 = {"Landroidx/compose/material3/internal/WindowAlignmentMarginPosition$Vertical;", "Landroidx/compose/material3/internal/MenuPosition$Vertical;", "Landroidx/compose/ui/Alignment$Vertical;", "alignment", "", "margin", "<init>", "(Landroidx/compose/ui/Alignment$Vertical;I)V", "Landroidx/compose/ui/unit/IntRect;", "anchorBounds", "Landroidx/compose/ui/unit/IntSize;", "windowSize", "menuHeight", "position-JVtK1S4", "(Landroidx/compose/ui/unit/IntRect;JI)I", com.daon.sdk.face.license.License.FEATURE_POSITION, "copy", "(Landroidx/compose/ui/Alignment$Vertical;I)Landroidx/compose/material3/internal/WindowAlignmentMarginPosition$Vertical;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Camera2StreamConfigurationMap", "Landroidx/compose/ui/Alignment$Vertical;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoSizes", com.visa.cbp.getEncExpo.warmup}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Vertical implements androidx.compose.material3.internal.MenuPosition.Vertical {
        public static final int $stable = 0;

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private final androidx.compose.ui.Alignment.Vertical getHighSpeedVideoFpsRanges;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private final int Camera2StreamConfigurationMap;

        public Vertical(androidx.compose.ui.Alignment.Vertical vertical, int i) {
            this.getHighSpeedVideoFpsRanges = vertical;
            this.Camera2StreamConfigurationMap = i;
        }

        @Override // androidx.compose.material3.internal.MenuPosition.Vertical
        /* renamed from: position-JVtK1S4 */
        public final int mo4271positionJVtK1S4(androidx.compose.ui.unit.IntRect anchorBounds, long windowSize, int menuHeight) {
            int i = (int) (windowSize & 4294967295L);
            if (menuHeight >= i - (this.Camera2StreamConfigurationMap * 2)) {
                return androidx.compose.ui.Alignment.INSTANCE.getCenterVertically().align(menuHeight, i);
            }
            int align = this.getHighSpeedVideoFpsRanges.align(menuHeight, i);
            int i2 = this.Camera2StreamConfigurationMap;
            return kotlin.ranges.RangesKt.coerceIn(align, i2, (i - i2) - menuHeight);
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Vertical(getHighSpeedVideoFpsRanges=");
            sb.append(this.getHighSpeedVideoFpsRanges);
            sb.append(", Camera2StreamConfigurationMap=");
            sb.append(this.Camera2StreamConfigurationMap);
            sb.append(')');
            return sb.toString();
        }

        public final int hashCode() {
            return (this.getHighSpeedVideoFpsRanges.hashCode() * 31) + java.lang.Integer.hashCode(this.Camera2StreamConfigurationMap);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof androidx.compose.material3.internal.WindowAlignmentMarginPosition.Vertical)) {
                return false;
            }
            androidx.compose.material3.internal.WindowAlignmentMarginPosition.Vertical vertical = (androidx.compose.material3.internal.WindowAlignmentMarginPosition.Vertical) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRanges, vertical.getHighSpeedVideoFpsRanges) && this.Camera2StreamConfigurationMap == vertical.Camera2StreamConfigurationMap;
        }

        public final androidx.compose.material3.internal.WindowAlignmentMarginPosition.Vertical copy(androidx.compose.ui.Alignment.Vertical alignment, int margin) {
            return new androidx.compose.material3.internal.WindowAlignmentMarginPosition.Vertical(alignment, margin);
        }

        public static /* synthetic */ androidx.compose.material3.internal.WindowAlignmentMarginPosition.Vertical copy$default(androidx.compose.material3.internal.WindowAlignmentMarginPosition.Vertical vertical, androidx.compose.ui.Alignment.Vertical vertical2, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                vertical2 = vertical.getHighSpeedVideoFpsRanges;
            }
            if ((i2 & 2) != 0) {
                i = vertical.Camera2StreamConfigurationMap;
            }
            return vertical.copy(vertical2, i);
        }
    }
}
