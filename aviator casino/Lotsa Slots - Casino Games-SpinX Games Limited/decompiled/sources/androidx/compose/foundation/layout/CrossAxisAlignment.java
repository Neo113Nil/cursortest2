package androidx.compose.foundation.layout;

/* compiled from: RowColumnImpl.kt */
@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000 \u00152\u00020\u0001:\u0007\u0013\u0014\u0015\u0016\u0017\u0018\u0019B\u0007\b\u0004¢\u0006\u0002\u0010\u0002J-\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\bH ¢\u0006\u0002\b\u000fJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\rH\u0010¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00048PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0006\u001a\u001b\u001c\u001d\u001e\u001f¨\u0006 "}, d2 = {"Landroidx/compose/foundation/layout/CrossAxisAlignment;", "", "()V", "isRelative", "", "isRelative$foundation_layout_release", "()Z", "align", "", "size", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "placeable", "Landroidx/compose/ui/layout/Placeable;", "beforeCrossAxisAlignmentLine", "align$foundation_layout_release", "calculateAlignmentLinePosition", "calculateAlignmentLinePosition$foundation_layout_release", "(Landroidx/compose/ui/layout/Placeable;)Ljava/lang/Integer;", "AlignmentLineCrossAxisAlignment", "CenterCrossAxisAlignment", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "EndCrossAxisAlignment", "HorizontalCrossAxisAlignment", "StartCrossAxisAlignment", "VerticalCrossAxisAlignment", "Landroidx/compose/foundation/layout/CrossAxisAlignment$AlignmentLineCrossAxisAlignment;", "Landroidx/compose/foundation/layout/CrossAxisAlignment$CenterCrossAxisAlignment;", "Landroidx/compose/foundation/layout/CrossAxisAlignment$EndCrossAxisAlignment;", "Landroidx/compose/foundation/layout/CrossAxisAlignment$HorizontalCrossAxisAlignment;", "Landroidx/compose/foundation/layout/CrossAxisAlignment$StartCrossAxisAlignment;", "Landroidx/compose/foundation/layout/CrossAxisAlignment$VerticalCrossAxisAlignment;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class CrossAxisAlignment {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.foundation.layout.CrossAxisAlignment.Companion INSTANCE = new androidx.compose.foundation.layout.CrossAxisAlignment.Companion(null);
    private static final androidx.compose.foundation.layout.CrossAxisAlignment Center = androidx.compose.foundation.layout.CrossAxisAlignment.CenterCrossAxisAlignment.INSTANCE;
    private static final androidx.compose.foundation.layout.CrossAxisAlignment Start = androidx.compose.foundation.layout.CrossAxisAlignment.StartCrossAxisAlignment.INSTANCE;
    private static final androidx.compose.foundation.layout.CrossAxisAlignment End = androidx.compose.foundation.layout.CrossAxisAlignment.EndCrossAxisAlignment.INSTANCE;

    public /* synthetic */ CrossAxisAlignment(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract int align$foundation_layout_release(int size, androidx.compose.ui.unit.LayoutDirection layoutDirection, androidx.compose.ui.layout.Placeable placeable, int beforeCrossAxisAlignmentLine);

    public java.lang.Integer calculateAlignmentLinePosition$foundation_layout_release(androidx.compose.ui.layout.Placeable placeable) {
        return null;
    }

    public boolean isRelative$foundation_layout_release() {
        return false;
    }

    private CrossAxisAlignment() {
    }

    /* compiled from: RowColumnImpl.kt */
    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0010J\u0015\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0013H\u0000¢\u0006\u0002\b\u0014J\u0015\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0016H\u0000¢\u0006\u0002\b\u0017J\u0015\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0019H\u0000¢\u0006\u0002\b\u001aR\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\u0002\u001a\u0004\b\n\u0010\u0007R\u001c\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\u0002\u001a\u0004\b\r\u0010\u0007¨\u0006\u001b"}, d2 = {"Landroidx/compose/foundation/layout/CrossAxisAlignment$Companion;", "", "()V", "Center", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "getCenter$annotations", "getCenter", "()Landroidx/compose/foundation/layout/CrossAxisAlignment;", "End", "getEnd$annotations", "getEnd", "Start", "getStart$annotations", "getStart", "AlignmentLine", "alignmentLine", "Landroidx/compose/ui/layout/AlignmentLine;", "Relative", "alignmentLineProvider", "Landroidx/compose/foundation/layout/AlignmentLineProvider;", "Relative$foundation_layout_release", com.helpshift.proactive.InAppViewConstants.ORIENTATION_HORIZONTAL, "Landroidx/compose/ui/Alignment$Horizontal;", "horizontal$foundation_layout_release", com.helpshift.proactive.InAppViewConstants.ORIENTATION_VERTICAL, "Landroidx/compose/ui/Alignment$Vertical;", "vertical$foundation_layout_release", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getCenter$annotations() {
        }

        public static /* synthetic */ void getEnd$annotations() {
        }

        public static /* synthetic */ void getStart$annotations() {
        }

        private Companion() {
        }

        public final androidx.compose.foundation.layout.CrossAxisAlignment getCenter() {
            return androidx.compose.foundation.layout.CrossAxisAlignment.Center;
        }

        public final androidx.compose.foundation.layout.CrossAxisAlignment getStart() {
            return androidx.compose.foundation.layout.CrossAxisAlignment.Start;
        }

        public final androidx.compose.foundation.layout.CrossAxisAlignment getEnd() {
            return androidx.compose.foundation.layout.CrossAxisAlignment.End;
        }

        public final androidx.compose.foundation.layout.CrossAxisAlignment AlignmentLine(androidx.compose.ui.layout.AlignmentLine alignmentLine) {
            return new androidx.compose.foundation.layout.CrossAxisAlignment.AlignmentLineCrossAxisAlignment(new androidx.compose.foundation.layout.AlignmentLineProvider.Value(alignmentLine));
        }

        public final androidx.compose.foundation.layout.CrossAxisAlignment Relative$foundation_layout_release(androidx.compose.foundation.layout.AlignmentLineProvider alignmentLineProvider) {
            return new androidx.compose.foundation.layout.CrossAxisAlignment.AlignmentLineCrossAxisAlignment(alignmentLineProvider);
        }

        public final androidx.compose.foundation.layout.CrossAxisAlignment vertical$foundation_layout_release(androidx.compose.ui.Alignment.Vertical vertical) {
            return new androidx.compose.foundation.layout.CrossAxisAlignment.VerticalCrossAxisAlignment(vertical);
        }

        public final androidx.compose.foundation.layout.CrossAxisAlignment horizontal$foundation_layout_release(androidx.compose.ui.Alignment.Horizontal horizontal) {
            return new androidx.compose.foundation.layout.CrossAxisAlignment.HorizontalCrossAxisAlignment(horizontal);
        }
    }

    /* compiled from: RowColumnImpl.kt */
    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J-\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0004H\u0010¢\u0006\u0002\b\u000b¨\u0006\f"}, d2 = {"Landroidx/compose/foundation/layout/CrossAxisAlignment$CenterCrossAxisAlignment;", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "()V", "align", "", "size", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "placeable", "Landroidx/compose/ui/layout/Placeable;", "beforeCrossAxisAlignmentLine", "align$foundation_layout_release", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class CenterCrossAxisAlignment extends androidx.compose.foundation.layout.CrossAxisAlignment {
        public static final androidx.compose.foundation.layout.CrossAxisAlignment.CenterCrossAxisAlignment INSTANCE = new androidx.compose.foundation.layout.CrossAxisAlignment.CenterCrossAxisAlignment();

        private CenterCrossAxisAlignment() {
            super(null);
        }

        @Override // androidx.compose.foundation.layout.CrossAxisAlignment
        public int align$foundation_layout_release(int size, androidx.compose.ui.unit.LayoutDirection layoutDirection, androidx.compose.ui.layout.Placeable placeable, int beforeCrossAxisAlignmentLine) {
            return size / 2;
        }
    }

    /* compiled from: RowColumnImpl.kt */
    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J-\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0004H\u0010¢\u0006\u0002\b\u000b¨\u0006\f"}, d2 = {"Landroidx/compose/foundation/layout/CrossAxisAlignment$StartCrossAxisAlignment;", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "()V", "align", "", "size", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "placeable", "Landroidx/compose/ui/layout/Placeable;", "beforeCrossAxisAlignmentLine", "align$foundation_layout_release", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class StartCrossAxisAlignment extends androidx.compose.foundation.layout.CrossAxisAlignment {
        public static final androidx.compose.foundation.layout.CrossAxisAlignment.StartCrossAxisAlignment INSTANCE = new androidx.compose.foundation.layout.CrossAxisAlignment.StartCrossAxisAlignment();

        private StartCrossAxisAlignment() {
            super(null);
        }

        @Override // androidx.compose.foundation.layout.CrossAxisAlignment
        public int align$foundation_layout_release(int size, androidx.compose.ui.unit.LayoutDirection layoutDirection, androidx.compose.ui.layout.Placeable placeable, int beforeCrossAxisAlignmentLine) {
            if (layoutDirection == androidx.compose.ui.unit.LayoutDirection.Ltr) {
                return 0;
            }
            return size;
        }
    }

    /* compiled from: RowColumnImpl.kt */
    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J-\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0004H\u0010¢\u0006\u0002\b\u000b¨\u0006\f"}, d2 = {"Landroidx/compose/foundation/layout/CrossAxisAlignment$EndCrossAxisAlignment;", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "()V", "align", "", "size", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "placeable", "Landroidx/compose/ui/layout/Placeable;", "beforeCrossAxisAlignmentLine", "align$foundation_layout_release", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class EndCrossAxisAlignment extends androidx.compose.foundation.layout.CrossAxisAlignment {
        public static final androidx.compose.foundation.layout.CrossAxisAlignment.EndCrossAxisAlignment INSTANCE = new androidx.compose.foundation.layout.CrossAxisAlignment.EndCrossAxisAlignment();

        private EndCrossAxisAlignment() {
            super(null);
        }

        @Override // androidx.compose.foundation.layout.CrossAxisAlignment
        public int align$foundation_layout_release(int size, androidx.compose.ui.unit.LayoutDirection layoutDirection, androidx.compose.ui.layout.Placeable placeable, int beforeCrossAxisAlignmentLine) {
            if (layoutDirection == androidx.compose.ui.unit.LayoutDirection.Ltr) {
                return size;
            }
            return 0;
        }
    }

    /* compiled from: RowColumnImpl.kt */
    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J-\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\fH\u0010¢\u0006\u0002\b\u0013J\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0010¢\u0006\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\b8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u0017"}, d2 = {"Landroidx/compose/foundation/layout/CrossAxisAlignment$AlignmentLineCrossAxisAlignment;", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "alignmentLineProvider", "Landroidx/compose/foundation/layout/AlignmentLineProvider;", "(Landroidx/compose/foundation/layout/AlignmentLineProvider;)V", "getAlignmentLineProvider", "()Landroidx/compose/foundation/layout/AlignmentLineProvider;", "isRelative", "", "isRelative$foundation_layout_release", "()Z", "align", "", "size", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "placeable", "Landroidx/compose/ui/layout/Placeable;", "beforeCrossAxisAlignmentLine", "align$foundation_layout_release", "calculateAlignmentLinePosition", "calculateAlignmentLinePosition$foundation_layout_release", "(Landroidx/compose/ui/layout/Placeable;)Ljava/lang/Integer;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class AlignmentLineCrossAxisAlignment extends androidx.compose.foundation.layout.CrossAxisAlignment {
        private final androidx.compose.foundation.layout.AlignmentLineProvider alignmentLineProvider;

        @Override // androidx.compose.foundation.layout.CrossAxisAlignment
        public boolean isRelative$foundation_layout_release() {
            return true;
        }

        public final androidx.compose.foundation.layout.AlignmentLineProvider getAlignmentLineProvider() {
            return this.alignmentLineProvider;
        }

        public AlignmentLineCrossAxisAlignment(androidx.compose.foundation.layout.AlignmentLineProvider alignmentLineProvider) {
            super(null);
            this.alignmentLineProvider = alignmentLineProvider;
        }

        @Override // androidx.compose.foundation.layout.CrossAxisAlignment
        public java.lang.Integer calculateAlignmentLinePosition$foundation_layout_release(androidx.compose.ui.layout.Placeable placeable) {
            return java.lang.Integer.valueOf(this.alignmentLineProvider.calculateAlignmentLinePosition(placeable));
        }

        @Override // androidx.compose.foundation.layout.CrossAxisAlignment
        public int align$foundation_layout_release(int size, androidx.compose.ui.unit.LayoutDirection layoutDirection, androidx.compose.ui.layout.Placeable placeable, int beforeCrossAxisAlignmentLine) {
            int calculateAlignmentLinePosition = this.alignmentLineProvider.calculateAlignmentLinePosition(placeable);
            if (calculateAlignmentLinePosition == Integer.MIN_VALUE) {
                return 0;
            }
            int i = beforeCrossAxisAlignmentLine - calculateAlignmentLinePosition;
            return layoutDirection == androidx.compose.ui.unit.LayoutDirection.Rtl ? size - i : i;
        }
    }

    /* compiled from: RowColumnImpl.kt */
    @kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J-\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\bH\u0010¢\u0006\u0002\b\u000fJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\bHÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0019"}, d2 = {"Landroidx/compose/foundation/layout/CrossAxisAlignment$VerticalCrossAxisAlignment;", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", com.helpshift.proactive.InAppViewConstants.ORIENTATION_VERTICAL, "Landroidx/compose/ui/Alignment$Vertical;", "(Landroidx/compose/ui/Alignment$Vertical;)V", "getVertical", "()Landroidx/compose/ui/Alignment$Vertical;", "align", "", "size", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "placeable", "Landroidx/compose/ui/layout/Placeable;", "beforeCrossAxisAlignmentLine", "align$foundation_layout_release", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final /* data */ class VerticalCrossAxisAlignment extends androidx.compose.foundation.layout.CrossAxisAlignment {
        private final androidx.compose.ui.Alignment.Vertical vertical;

        public static /* synthetic */ androidx.compose.foundation.layout.CrossAxisAlignment.VerticalCrossAxisAlignment copy$default(androidx.compose.foundation.layout.CrossAxisAlignment.VerticalCrossAxisAlignment verticalCrossAxisAlignment, androidx.compose.ui.Alignment.Vertical vertical, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                vertical = verticalCrossAxisAlignment.vertical;
            }
            return verticalCrossAxisAlignment.copy(vertical);
        }

        /* renamed from: component1, reason: from getter */
        public final androidx.compose.ui.Alignment.Vertical getVertical() {
            return this.vertical;
        }

        public final androidx.compose.foundation.layout.CrossAxisAlignment.VerticalCrossAxisAlignment copy(androidx.compose.ui.Alignment.Vertical vertical) {
            return new androidx.compose.foundation.layout.CrossAxisAlignment.VerticalCrossAxisAlignment(vertical);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof androidx.compose.foundation.layout.CrossAxisAlignment.VerticalCrossAxisAlignment) && kotlin.jvm.internal.Intrinsics.areEqual(this.vertical, ((androidx.compose.foundation.layout.CrossAxisAlignment.VerticalCrossAxisAlignment) other).vertical);
        }

        public int hashCode() {
            return this.vertical.hashCode();
        }

        public java.lang.String toString() {
            return "VerticalCrossAxisAlignment(vertical=" + this.vertical + ')';
        }

        public final androidx.compose.ui.Alignment.Vertical getVertical() {
            return this.vertical;
        }

        public VerticalCrossAxisAlignment(androidx.compose.ui.Alignment.Vertical vertical) {
            super(null);
            this.vertical = vertical;
        }

        @Override // androidx.compose.foundation.layout.CrossAxisAlignment
        public int align$foundation_layout_release(int size, androidx.compose.ui.unit.LayoutDirection layoutDirection, androidx.compose.ui.layout.Placeable placeable, int beforeCrossAxisAlignmentLine) {
            return this.vertical.align(0, size);
        }
    }

    /* compiled from: RowColumnImpl.kt */
    @kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J-\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\bH\u0010¢\u0006\u0002\b\u000fJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\bHÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0019"}, d2 = {"Landroidx/compose/foundation/layout/CrossAxisAlignment$HorizontalCrossAxisAlignment;", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", com.helpshift.proactive.InAppViewConstants.ORIENTATION_HORIZONTAL, "Landroidx/compose/ui/Alignment$Horizontal;", "(Landroidx/compose/ui/Alignment$Horizontal;)V", "getHorizontal", "()Landroidx/compose/ui/Alignment$Horizontal;", "align", "", "size", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "placeable", "Landroidx/compose/ui/layout/Placeable;", "beforeCrossAxisAlignmentLine", "align$foundation_layout_release", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final /* data */ class HorizontalCrossAxisAlignment extends androidx.compose.foundation.layout.CrossAxisAlignment {
        private final androidx.compose.ui.Alignment.Horizontal horizontal;

        public static /* synthetic */ androidx.compose.foundation.layout.CrossAxisAlignment.HorizontalCrossAxisAlignment copy$default(androidx.compose.foundation.layout.CrossAxisAlignment.HorizontalCrossAxisAlignment horizontalCrossAxisAlignment, androidx.compose.ui.Alignment.Horizontal horizontal, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                horizontal = horizontalCrossAxisAlignment.horizontal;
            }
            return horizontalCrossAxisAlignment.copy(horizontal);
        }

        /* renamed from: component1, reason: from getter */
        public final androidx.compose.ui.Alignment.Horizontal getHorizontal() {
            return this.horizontal;
        }

        public final androidx.compose.foundation.layout.CrossAxisAlignment.HorizontalCrossAxisAlignment copy(androidx.compose.ui.Alignment.Horizontal horizontal) {
            return new androidx.compose.foundation.layout.CrossAxisAlignment.HorizontalCrossAxisAlignment(horizontal);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof androidx.compose.foundation.layout.CrossAxisAlignment.HorizontalCrossAxisAlignment) && kotlin.jvm.internal.Intrinsics.areEqual(this.horizontal, ((androidx.compose.foundation.layout.CrossAxisAlignment.HorizontalCrossAxisAlignment) other).horizontal);
        }

        public int hashCode() {
            return this.horizontal.hashCode();
        }

        public java.lang.String toString() {
            return "HorizontalCrossAxisAlignment(horizontal=" + this.horizontal + ')';
        }

        public final androidx.compose.ui.Alignment.Horizontal getHorizontal() {
            return this.horizontal;
        }

        public HorizontalCrossAxisAlignment(androidx.compose.ui.Alignment.Horizontal horizontal) {
            super(null);
            this.horizontal = horizontal;
        }

        @Override // androidx.compose.foundation.layout.CrossAxisAlignment
        public int align$foundation_layout_release(int size, androidx.compose.ui.unit.LayoutDirection layoutDirection, androidx.compose.ui.layout.Placeable placeable, int beforeCrossAxisAlignmentLine) {
            return this.horizontal.align(0, size, layoutDirection);
        }
    }
}
