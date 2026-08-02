package androidx.compose.material3.internal;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/material3/internal/AnchorAlignmentOffsetPosition;", "", "<init>", "()V", "Horizontal", "Vertical"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AnchorAlignmentOffsetPosition {
    public static final int $stable = 0;
    public static final androidx.compose.material3.internal.AnchorAlignmentOffsetPosition INSTANCE = new androidx.compose.material3.internal.AnchorAlignmentOffsetPosition();

    private AnchorAlignmentOffsetPosition() {
    }

    @kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u0012\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J.\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010 R\u0014\u0010$\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%"}, d2 = {"Landroidx/compose/material3/internal/AnchorAlignmentOffsetPosition$Horizontal;", "Landroidx/compose/material3/internal/MenuPosition$Horizontal;", "Landroidx/compose/ui/Alignment$Horizontal;", "menuAlignment", "anchorAlignment", "", "offset", "<init>", "(Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Horizontal;I)V", "Landroidx/compose/ui/unit/IntRect;", "anchorBounds", "Landroidx/compose/ui/unit/IntSize;", "windowSize", "menuWidth", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "position-95KtPRI", "(Landroidx/compose/ui/unit/IntRect;JILandroidx/compose/ui/unit/LayoutDirection;)I", com.daon.sdk.face.license.License.FEATURE_POSITION, "copy", "(Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Horizontal;I)Landroidx/compose/material3/internal/AnchorAlignmentOffsetPosition$Horizontal;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/ui/Alignment$Horizontal;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRanges", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoSizes", com.visa.cbp.getEncExpo.warmup}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Horizontal implements androidx.compose.material3.internal.MenuPosition.Horizontal {
        public static final int $stable = 0;

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private final androidx.compose.ui.Alignment.Horizontal getHighResolutionOutputSizeshNQ4ISI;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private final androidx.compose.ui.Alignment.Horizontal Camera2StreamConfigurationMap;
        private final int getHighSpeedVideoSizes;

        public Horizontal(androidx.compose.ui.Alignment.Horizontal horizontal, androidx.compose.ui.Alignment.Horizontal horizontal2, int i) {
            this.Camera2StreamConfigurationMap = horizontal;
            this.getHighResolutionOutputSizeshNQ4ISI = horizontal2;
            this.getHighSpeedVideoSizes = i;
        }

        @Override // androidx.compose.material3.internal.MenuPosition.Horizontal
        /* renamed from: position-95KtPRI, reason: not valid java name */
        public final int mo4270position95KtPRI(androidx.compose.ui.unit.IntRect anchorBounds, long windowSize, int menuWidth, androidx.compose.ui.unit.LayoutDirection layoutDirection) {
            int align = this.getHighResolutionOutputSizeshNQ4ISI.align(0, anchorBounds.getWidth(), layoutDirection);
            return anchorBounds.getLeft() + align + (-this.Camera2StreamConfigurationMap.align(0, menuWidth, layoutDirection)) + (layoutDirection == androidx.compose.ui.unit.LayoutDirection.Ltr ? this.getHighSpeedVideoSizes : -this.getHighSpeedVideoSizes);
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Horizontal(Camera2StreamConfigurationMap=");
            sb.append(this.Camera2StreamConfigurationMap);
            sb.append(", getHighResolutionOutputSizeshNQ4ISI=");
            sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
            sb.append(", getHighSpeedVideoSizes=");
            sb.append(this.getHighSpeedVideoSizes);
            sb.append(')');
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.Camera2StreamConfigurationMap.hashCode() * 31) + this.getHighResolutionOutputSizeshNQ4ISI.hashCode()) * 31) + java.lang.Integer.hashCode(this.getHighSpeedVideoSizes);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof androidx.compose.material3.internal.AnchorAlignmentOffsetPosition.Horizontal)) {
                return false;
            }
            androidx.compose.material3.internal.AnchorAlignmentOffsetPosition.Horizontal horizontal = (androidx.compose.material3.internal.AnchorAlignmentOffsetPosition.Horizontal) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.Camera2StreamConfigurationMap, horizontal.Camera2StreamConfigurationMap) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighResolutionOutputSizeshNQ4ISI, horizontal.getHighResolutionOutputSizeshNQ4ISI) && this.getHighSpeedVideoSizes == horizontal.getHighSpeedVideoSizes;
        }

        public final androidx.compose.material3.internal.AnchorAlignmentOffsetPosition.Horizontal copy(androidx.compose.ui.Alignment.Horizontal menuAlignment, androidx.compose.ui.Alignment.Horizontal anchorAlignment, int offset) {
            return new androidx.compose.material3.internal.AnchorAlignmentOffsetPosition.Horizontal(menuAlignment, anchorAlignment, offset);
        }

        public static /* synthetic */ androidx.compose.material3.internal.AnchorAlignmentOffsetPosition.Horizontal copy$default(androidx.compose.material3.internal.AnchorAlignmentOffsetPosition.Horizontal horizontal, androidx.compose.ui.Alignment.Horizontal horizontal2, androidx.compose.ui.Alignment.Horizontal horizontal3, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                horizontal2 = horizontal.Camera2StreamConfigurationMap;
            }
            if ((i2 & 2) != 0) {
                horizontal3 = horizontal.getHighResolutionOutputSizeshNQ4ISI;
            }
            if ((i2 & 4) != 0) {
                i = horizontal.getHighSpeedVideoSizes;
            }
            return horizontal.copy(horizontal2, horizontal3, i);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u0010\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001eR\u0014\u0010 \u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\""}, d2 = {"Landroidx/compose/material3/internal/AnchorAlignmentOffsetPosition$Vertical;", "Landroidx/compose/material3/internal/MenuPosition$Vertical;", "Landroidx/compose/ui/Alignment$Vertical;", "menuAlignment", "anchorAlignment", "", "offset", "<init>", "(Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/ui/Alignment$Vertical;I)V", "Landroidx/compose/ui/unit/IntRect;", "anchorBounds", "Landroidx/compose/ui/unit/IntSize;", "windowSize", "menuHeight", "position-JVtK1S4", "(Landroidx/compose/ui/unit/IntRect;JI)I", com.daon.sdk.face.license.License.FEATURE_POSITION, "copy", "(Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/ui/Alignment$Vertical;I)Landroidx/compose/material3/internal/AnchorAlignmentOffsetPosition$Vertical;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/ui/Alignment$Vertical;", "getHighSpeedVideoFpsRanges", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoSizes", com.visa.cbp.getEncExpo.warmup}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Vertical implements androidx.compose.material3.internal.MenuPosition.Vertical {
        public static final int $stable = 0;

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private final androidx.compose.ui.Alignment.Vertical getHighSpeedVideoSizes;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private final androidx.compose.ui.Alignment.Vertical getHighSpeedVideoFpsRanges;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private final int getHighResolutionOutputSizeshNQ4ISI;

        public Vertical(androidx.compose.ui.Alignment.Vertical vertical, androidx.compose.ui.Alignment.Vertical vertical2, int i) {
            this.getHighSpeedVideoFpsRanges = vertical;
            this.getHighSpeedVideoSizes = vertical2;
            this.getHighResolutionOutputSizeshNQ4ISI = i;
        }

        @Override // androidx.compose.material3.internal.MenuPosition.Vertical
        /* renamed from: position-JVtK1S4, reason: not valid java name */
        public final int mo4271positionJVtK1S4(androidx.compose.ui.unit.IntRect anchorBounds, long windowSize, int menuHeight) {
            int align = this.getHighSpeedVideoSizes.align(0, anchorBounds.getHeight());
            return anchorBounds.getTop() + align + (-this.getHighSpeedVideoFpsRanges.align(0, menuHeight)) + this.getHighResolutionOutputSizeshNQ4ISI;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Vertical(getHighSpeedVideoFpsRanges=");
            sb.append(this.getHighSpeedVideoFpsRanges);
            sb.append(", getHighSpeedVideoSizes=");
            sb.append(this.getHighSpeedVideoSizes);
            sb.append(", getHighResolutionOutputSizeshNQ4ISI=");
            sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
            sb.append(')');
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.getHighSpeedVideoFpsRanges.hashCode() * 31) + this.getHighSpeedVideoSizes.hashCode()) * 31) + java.lang.Integer.hashCode(this.getHighResolutionOutputSizeshNQ4ISI);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof androidx.compose.material3.internal.AnchorAlignmentOffsetPosition.Vertical)) {
                return false;
            }
            androidx.compose.material3.internal.AnchorAlignmentOffsetPosition.Vertical vertical = (androidx.compose.material3.internal.AnchorAlignmentOffsetPosition.Vertical) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRanges, vertical.getHighSpeedVideoFpsRanges) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizes, vertical.getHighSpeedVideoSizes) && this.getHighResolutionOutputSizeshNQ4ISI == vertical.getHighResolutionOutputSizeshNQ4ISI;
        }

        public final androidx.compose.material3.internal.AnchorAlignmentOffsetPosition.Vertical copy(androidx.compose.ui.Alignment.Vertical menuAlignment, androidx.compose.ui.Alignment.Vertical anchorAlignment, int offset) {
            return new androidx.compose.material3.internal.AnchorAlignmentOffsetPosition.Vertical(menuAlignment, anchorAlignment, offset);
        }

        public static /* synthetic */ androidx.compose.material3.internal.AnchorAlignmentOffsetPosition.Vertical copy$default(androidx.compose.material3.internal.AnchorAlignmentOffsetPosition.Vertical vertical, androidx.compose.ui.Alignment.Vertical vertical2, androidx.compose.ui.Alignment.Vertical vertical3, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                vertical2 = vertical.getHighSpeedVideoFpsRanges;
            }
            if ((i2 & 2) != 0) {
                vertical3 = vertical.getHighSpeedVideoSizes;
            }
            if ((i2 & 4) != 0) {
                i = vertical.getHighResolutionOutputSizeshNQ4ISI;
            }
            return vertical.copy(vertical2, vertical3, i);
        }
    }
}
