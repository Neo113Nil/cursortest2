package androidx.compose.foundation.layout;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u0000 \u00142\u00020\u0001:\u0004\u0014\u0015\u0016\u0017B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0004H ¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\tH\u0010¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108QX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\u0082\u0001\u0003\u0018\u0019\u001a"}, d2 = {"Landroidx/compose/foundation/layout/CrossAxisAlignment;", "", "<init>", "()V", "", io.ktor.http.ContentDisposition.Parameters.Size, "itemCrossAxisSize", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/layout/Placeable;", "placeable", "beforeCrossAxisAlignmentLine", "align$foundation_layout", "(IILandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/layout/Placeable;I)I", "calculateAlignmentLinePosition$foundation_layout", "(Landroidx/compose/ui/layout/Placeable;)Ljava/lang/Integer;", "", "isRelative$foundation_layout", "()Z", "isRelative", "Companion", "AlignmentLineCrossAxisAlignment", "VerticalCrossAxisAlignment", "HorizontalCrossAxisAlignment", "Landroidx/compose/foundation/layout/CrossAxisAlignment$AlignmentLineCrossAxisAlignment;", "Landroidx/compose/foundation/layout/CrossAxisAlignment$HorizontalCrossAxisAlignment;", "Landroidx/compose/foundation/layout/CrossAxisAlignment$VerticalCrossAxisAlignment;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class CrossAxisAlignment {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.foundation.layout.CrossAxisAlignment.Companion INSTANCE = new androidx.compose.foundation.layout.CrossAxisAlignment.Companion(null);

    public abstract int align$foundation_layout(int size, int itemCrossAxisSize, androidx.compose.ui.unit.LayoutDirection layoutDirection, androidx.compose.ui.layout.Placeable placeable, int beforeCrossAxisAlignmentLine);

    public java.lang.Integer calculateAlignmentLinePosition$foundation_layout(androidx.compose.ui.layout.Placeable placeable) {
        return null;
    }

    public boolean isRelative$foundation_layout() {
        return false;
    }

    private CrossAxisAlignment() {
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0013\u0010\u0014"}, d2 = {"Landroidx/compose/foundation/layout/CrossAxisAlignment$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/layout/AlignmentLine;", "alignmentLine", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "AlignmentLine", "(Landroidx/compose/ui/layout/AlignmentLine;)Landroidx/compose/foundation/layout/CrossAxisAlignment;", "Landroidx/compose/foundation/layout/AlignmentLineProvider;", "alignmentLineProvider", "Relative$foundation_layout", "(Landroidx/compose/foundation/layout/AlignmentLineProvider;)Landroidx/compose/foundation/layout/CrossAxisAlignment;", "Landroidx/compose/ui/Alignment$Vertical;", "vertical", "vertical$foundation_layout", "(Landroidx/compose/ui/Alignment$Vertical;)Landroidx/compose/foundation/layout/CrossAxisAlignment;", "Landroidx/compose/ui/Alignment$Horizontal;", "horizontal", "horizontal$foundation_layout", "(Landroidx/compose/ui/Alignment$Horizontal;)Landroidx/compose/foundation/layout/CrossAxisAlignment;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final androidx.compose.foundation.layout.CrossAxisAlignment AlignmentLine(androidx.compose.ui.layout.AlignmentLine alignmentLine) {
            return new androidx.compose.foundation.layout.CrossAxisAlignment.AlignmentLineCrossAxisAlignment(new androidx.compose.foundation.layout.AlignmentLineProvider.Value(alignmentLine));
        }

        public final androidx.compose.foundation.layout.CrossAxisAlignment Relative$foundation_layout(androidx.compose.foundation.layout.AlignmentLineProvider alignmentLineProvider) {
            return new androidx.compose.foundation.layout.CrossAxisAlignment.AlignmentLineCrossAxisAlignment(alignmentLineProvider);
        }

        public final androidx.compose.foundation.layout.CrossAxisAlignment vertical$foundation_layout(androidx.compose.ui.Alignment.Vertical vertical) {
            return new androidx.compose.foundation.layout.CrossAxisAlignment.VerticalCrossAxisAlignment(vertical);
        }

        public final androidx.compose.foundation.layout.CrossAxisAlignment horizontal$foundation_layout(androidx.compose.ui.Alignment.Horizontal horizontal) {
            return new androidx.compose.foundation.layout.CrossAxisAlignment.HorizontalCrossAxisAlignment(horizontal);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0007H\u0010¢\u0006\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148QX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Landroidx/compose/foundation/layout/CrossAxisAlignment$AlignmentLineCrossAxisAlignment;", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "Landroidx/compose/foundation/layout/AlignmentLineProvider;", "p0", "<init>", "(Landroidx/compose/foundation/layout/AlignmentLineProvider;)V", "Landroidx/compose/ui/layout/Placeable;", "", "calculateAlignmentLinePosition$foundation_layout", "(Landroidx/compose/ui/layout/Placeable;)Ljava/lang/Integer;", "p1", "Landroidx/compose/ui/unit/LayoutDirection;", "p2", "p3", "p4", "align$foundation_layout", "(IILandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/layout/Placeable;I)I", "getHighSpeedVideoFpsRanges", "Landroidx/compose/foundation/layout/AlignmentLineProvider;", "Camera2StreamConfigurationMap", "", "isRelative$foundation_layout", "()Z", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    static final class AlignmentLineCrossAxisAlignment extends androidx.compose.foundation.layout.CrossAxisAlignment {

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private final androidx.compose.foundation.layout.AlignmentLineProvider Camera2StreamConfigurationMap;

        @Override // androidx.compose.foundation.layout.CrossAxisAlignment
        public final boolean isRelative$foundation_layout() {
            return true;
        }

        public AlignmentLineCrossAxisAlignment(androidx.compose.foundation.layout.AlignmentLineProvider alignmentLineProvider) {
            super(null);
            this.Camera2StreamConfigurationMap = alignmentLineProvider;
        }

        @Override // androidx.compose.foundation.layout.CrossAxisAlignment
        public final java.lang.Integer calculateAlignmentLinePosition$foundation_layout(androidx.compose.ui.layout.Placeable p0) {
            return java.lang.Integer.valueOf(this.Camera2StreamConfigurationMap.calculateAlignmentLinePosition(p0));
        }

        @Override // androidx.compose.foundation.layout.CrossAxisAlignment
        public final int align$foundation_layout(int p0, int p1, androidx.compose.ui.unit.LayoutDirection p2, androidx.compose.ui.layout.Placeable p3, int p4) {
            int calculateAlignmentLinePosition = this.Camera2StreamConfigurationMap.calculateAlignmentLinePosition(p3);
            if (calculateAlignmentLinePosition == Integer.MIN_VALUE) {
                return 0;
            }
            int i = p4 - calculateAlignmentLinePosition;
            return p2 == androidx.compose.ui.unit.LayoutDirection.Rtl ? (p0 - p1) - i : i;
        }
    }

    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J7\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u0003\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0011\u0010\u001a\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019"}, d2 = {"Landroidx/compose/foundation/layout/CrossAxisAlignment$VerticalCrossAxisAlignment;", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "Landroidx/compose/ui/Alignment$Vertical;", "p0", "<init>", "(Landroidx/compose/ui/Alignment$Vertical;)V", "", "p1", "Landroidx/compose/ui/unit/LayoutDirection;", "p2", "Landroidx/compose/ui/layout/Placeable;", "p3", "p4", "align$foundation_layout", "(IILandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/layout/Placeable;I)I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/ui/Alignment$Vertical;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    static final /* data */ class VerticalCrossAxisAlignment extends androidx.compose.foundation.layout.CrossAxisAlignment {

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private final androidx.compose.ui.Alignment.Vertical getHighSpeedVideoFpsRanges;

        public VerticalCrossAxisAlignment(androidx.compose.ui.Alignment.Vertical vertical) {
            super(null);
            this.getHighSpeedVideoFpsRanges = vertical;
        }

        @Override // androidx.compose.foundation.layout.CrossAxisAlignment
        public final int align$foundation_layout(int p0, int p1, androidx.compose.ui.unit.LayoutDirection p2, androidx.compose.ui.layout.Placeable p3, int p4) {
            return this.getHighSpeedVideoFpsRanges.align(p1, p0);
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("VerticalCrossAxisAlignment(getHighSpeedVideoFpsRanges=");
            sb.append(this.getHighSpeedVideoFpsRanges);
            sb.append(')');
            return sb.toString();
        }

        public final int hashCode() {
            return this.getHighSpeedVideoFpsRanges.hashCode();
        }

        public final boolean equals(java.lang.Object p0) {
            if (this == p0) {
                return true;
            }
            return (p0 instanceof androidx.compose.foundation.layout.CrossAxisAlignment.VerticalCrossAxisAlignment) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRanges, ((androidx.compose.foundation.layout.CrossAxisAlignment.VerticalCrossAxisAlignment) p0).getHighSpeedVideoFpsRanges);
        }
    }

    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J7\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u0003\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019"}, d2 = {"Landroidx/compose/foundation/layout/CrossAxisAlignment$HorizontalCrossAxisAlignment;", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "Landroidx/compose/ui/Alignment$Horizontal;", "p0", "<init>", "(Landroidx/compose/ui/Alignment$Horizontal;)V", "", "p1", "Landroidx/compose/ui/unit/LayoutDirection;", "p2", "Landroidx/compose/ui/layout/Placeable;", "p3", "p4", "align$foundation_layout", "(IILandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/layout/Placeable;I)I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/ui/Alignment$Horizontal;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    static final /* data */ class HorizontalCrossAxisAlignment extends androidx.compose.foundation.layout.CrossAxisAlignment {
        private final androidx.compose.ui.Alignment.Horizontal getHighSpeedVideoFpsRangesFor;

        public HorizontalCrossAxisAlignment(androidx.compose.ui.Alignment.Horizontal horizontal) {
            super(null);
            this.getHighSpeedVideoFpsRangesFor = horizontal;
        }

        @Override // androidx.compose.foundation.layout.CrossAxisAlignment
        public final int align$foundation_layout(int p0, int p1, androidx.compose.ui.unit.LayoutDirection p2, androidx.compose.ui.layout.Placeable p3, int p4) {
            return this.getHighSpeedVideoFpsRangesFor.align(p1, p0, p2);
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("HorizontalCrossAxisAlignment(getHighSpeedVideoFpsRangesFor=");
            sb.append(this.getHighSpeedVideoFpsRangesFor);
            sb.append(')');
            return sb.toString();
        }

        public final int hashCode() {
            return this.getHighSpeedVideoFpsRangesFor.hashCode();
        }

        public final boolean equals(java.lang.Object p0) {
            if (this == p0) {
                return true;
            }
            return (p0 instanceof androidx.compose.foundation.layout.CrossAxisAlignment.HorizontalCrossAxisAlignment) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRangesFor, ((androidx.compose.foundation.layout.CrossAxisAlignment.HorizontalCrossAxisAlignment) p0).getHighSpeedVideoFpsRangesFor);
        }
    }

    public /* synthetic */ CrossAxisAlignment(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
