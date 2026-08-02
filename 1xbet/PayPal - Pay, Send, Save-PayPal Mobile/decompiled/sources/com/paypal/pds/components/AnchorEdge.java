package com.paypal.pds.components;

@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u0000 \u001c2\u00020\u0001:\u0005\u001c\u001d\u001e\u001f B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH ¢\u0006\u0004\b\n\u0010\u000bJO\u0010\u001b\u001a\u00020\u00182\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u0082\u0001\u0002!\""}, d2 = {"Lcom/paypal/pds/components/AnchorEdge;", "", "<init>", "()V", "Landroidx/compose/ui/unit/IntRect;", "anchorBounds", "", "marginPx", "", "popupHeight", "calculateY$pds_release", "(Landroidx/compose/ui/unit/IntRect;FI)I", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/unit/Dp;", "cornerRadius", "tipWidth", "tipHeight", "Lcom/paypal/pds/components/AnchorEdge$EdgePositioning;", "tipPosition", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/unit/IntSize;", "popupContentSize", "Landroidx/compose/ui/unit/IntOffset;", "calculatePopupPosition-XLN5NMI$pds_release", "(Landroidx/compose/ui/unit/Density;FFFLcom/paypal/pds/components/AnchorEdge$EdgePositioning;Landroidx/compose/ui/unit/IntRect;Landroidx/compose/ui/unit/LayoutDirection;J)J", "calculatePopupPosition", "Companion", "Position", "EdgePositioning", "Top", "Bottom", "Lcom/paypal/pds/components/AnchorEdge$Bottom;", "Lcom/paypal/pds/components/AnchorEdge$Top;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public abstract class AnchorEdge {
    public static final int $stable = 0;
    public static final float CENTER_PERCENT = 0.5f;
    public static final float EDGE_SAFE_ZONE_MULTIPLIER = 2.0f;
    public static final float END_PERCENT = 1.0f;
    public static final float END_POSITION_SHIFT = 0.9f;
    public static final float START_PERCENT = 0.0f;
    public static final float START_POSITION_SHIFT = 0.1f;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.pds.components.AnchorEdge.Companion INSTANCE = new com.paypal.pds.components.AnchorEdge.Companion(null);
    private static final float TIP_WIDTH = com.paypal.pds.core.ConstantsKt.getSize16();
    private static final float TIP_HEIGHT = com.paypal.pds.core.ConstantsKt.getSize8();
    private static final com.paypal.pds.core.Color.BackgroundElevatedPopover COACH_TIP_COLOR = com.paypal.pds.core.Color.BackgroundElevatedPopover.INSTANCE;
    private static final androidx.compose.ui.window.PopupProperties POPUP_PROPERTIES = new androidx.compose.ui.window.PopupProperties(true, true, true, false, 8, (kotlin.jvm.internal.DefaultConstructorMarker) null);

    public abstract int calculateY$pds_release(androidx.compose.ui.unit.IntRect anchorBounds, float marginPx, int popupHeight);

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\u00020\u00078\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u00078\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\nR\u001a\u0010\u000e\u001a\u00020\r8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\u00020\u00128\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00048\u0000X\u0081T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0006R\u0014\u0010\u0018\u001a\u00020\u00048\u0000X\u0081T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0006R\u0014\u0010\u0019\u001a\u00020\u00048\u0000X\u0081T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0006R\u0014\u0010\u001a\u001a\u00020\u00048\u0000X\u0081T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0006R\u0014\u0010\u001b\u001a\u00020\u00048\u0000X\u0081T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0006"}, d2 = {"Lcom/paypal/pds/components/AnchorEdge$Companion;", "", "<init>", "()V", "", "EDGE_SAFE_ZONE_MULTIPLIER", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "Landroidx/compose/ui/unit/Dp;", "TIP_WIDTH", "getTIP_WIDTH-D9Ej5fM$pds_release", "()F", "TIP_HEIGHT", "getTIP_HEIGHT-D9Ej5fM$pds_release", "Lcom/paypal/pds/core/Color$BackgroundElevatedPopover;", "COACH_TIP_COLOR", "Lcom/paypal/pds/core/Color$BackgroundElevatedPopover;", "getCOACH_TIP_COLOR$pds_release", "()Lcom/paypal/pds/core/Color$BackgroundElevatedPopover;", "Landroidx/compose/ui/window/PopupProperties;", "POPUP_PROPERTIES", "Landroidx/compose/ui/window/PopupProperties;", "getPOPUP_PROPERTIES$pds_release", "()Landroidx/compose/ui/window/PopupProperties;", "START_PERCENT", "CENTER_PERCENT", "END_PERCENT", "START_POSITION_SHIFT", "END_POSITION_SHIFT"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getTIP_WIDTH-D9Ej5fM$pds_release, reason: not valid java name */
        public final float m21567getTIP_WIDTHD9Ej5fM$pds_release() {
            return com.paypal.pds.components.AnchorEdge.TIP_WIDTH;
        }

        /* renamed from: getTIP_HEIGHT-D9Ej5fM$pds_release, reason: not valid java name */
        public final float m21566getTIP_HEIGHTD9Ej5fM$pds_release() {
            return com.paypal.pds.components.AnchorEdge.TIP_HEIGHT;
        }

        public final com.paypal.pds.core.Color.BackgroundElevatedPopover getCOACH_TIP_COLOR$pds_release() {
            return com.paypal.pds.components.AnchorEdge.COACH_TIP_COLOR;
        }

        public final androidx.compose.ui.window.PopupProperties getPOPUP_PROPERTIES$pds_release() {
            return com.paypal.pds.components.AnchorEdge.POPUP_PROPERTIES;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private AnchorEdge() {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t"}, d2 = {"Lcom/paypal/pds/components/AnchorEdge$Position;", "", "<init>", "(Ljava/lang/String;I)V", "", "toFloat$pds_release", "()F", "START", "CENTER", "END"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Position {
        public static final com.paypal.pds.components.AnchorEdge.Position CENTER;
        public static final com.paypal.pds.components.AnchorEdge.Position END;
        public static final com.paypal.pds.components.AnchorEdge.Position START;
        private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
        private static final /* synthetic */ com.paypal.pds.components.AnchorEdge.Position[] getHighSpeedVideoFpsRanges;

        private Position(java.lang.String str, int i) {
        }

        static {
            com.paypal.pds.components.AnchorEdge.Position position = new com.paypal.pds.components.AnchorEdge.Position("START", 0);
            START = position;
            com.paypal.pds.components.AnchorEdge.Position position2 = new com.paypal.pds.components.AnchorEdge.Position("CENTER", 1);
            CENTER = position2;
            com.paypal.pds.components.AnchorEdge.Position position3 = new com.paypal.pds.components.AnchorEdge.Position("END", 2);
            END = position3;
            com.paypal.pds.components.AnchorEdge.Position[] positionArr = {position, position2, position3};
            getHighSpeedVideoFpsRanges = positionArr;
            getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(positionArr);
        }

        public final float toFloat$pds_release() {
            int i = com.paypal.pds.components.AnchorEdge.Position.WhenMappings.$EnumSwitchMapping$0[ordinal()];
            if (i == 1) {
                return 0.0f;
            }
            if (i == 2) {
                return 0.5f;
            }
            if (i == 3) {
                return 1.0f;
            }
            throw new kotlin.NoWhenBranchMatchedException();
        }

        public static com.paypal.pds.components.AnchorEdge.Position[] values() {
            return (com.paypal.pds.components.AnchorEdge.Position[]) getHighSpeedVideoFpsRanges.clone();
        }

        @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[com.paypal.pds.components.AnchorEdge.Position.values().length];
                try {
                    iArr[com.paypal.pds.components.AnchorEdge.Position.START.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[com.paypal.pds.components.AnchorEdge.Position.CENTER.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                try {
                    iArr[com.paypal.pds.components.AnchorEdge.Position.END.ordinal()] = 3;
                } catch (java.lang.NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public static com.paypal.pds.components.AnchorEdge.Position valueOf(java.lang.String str) {
            return (com.paypal.pds.components.AnchorEdge.Position) java.lang.Enum.valueOf(com.paypal.pds.components.AnchorEdge.Position.class, str);
        }

        public static kotlin.enums.EnumEntries<com.paypal.pds.components.AnchorEdge.Position> getEntries() {
            return getHighResolutionOutputSizeshNQ4ISI;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R+\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00028G@GX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R+\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00048G@GX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\n\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/pds/components/AnchorEdge$EdgePositioning;", "", "Lcom/paypal/pds/components/AnchorEdge$Position;", com.daon.sdk.face.license.License.FEATURE_POSITION, "Landroidx/compose/ui/unit/Dp;", "offset", "<init>", "(Lcom/paypal/pds/components/AnchorEdge$Position;FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "<set-?>", "position$delegate", "Landroidx/compose/runtime/MutableState;", "getPosition", "()Lcom/paypal/pds/components/AnchorEdge$Position;", "setPosition", "(Lcom/paypal/pds/components/AnchorEdge$Position;)V", "", "getPercent$pds_release", "()F", "percent", "offset$delegate", "getOffset-D9Ej5fM", "setOffset-0680j_4", "(F)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class EdgePositioning {
        public static final int $stable = 0;

        /* renamed from: offset$delegate, reason: from kotlin metadata */
        private final androidx.compose.runtime.MutableState offset;

        /* renamed from: position$delegate, reason: from kotlin metadata */
        private final androidx.compose.runtime.MutableState position;

        private EdgePositioning(com.paypal.pds.components.AnchorEdge.Position position, float f) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(position, "");
            this.position = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(position, null, 2, null);
            this.offset = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(androidx.compose.ui.unit.Dp.m8599boximpl(f), null, 2, null);
        }

        public /* synthetic */ EdgePositioning(com.paypal.pds.components.AnchorEdge.Position position, float f, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? com.paypal.pds.components.AnchorEdge.Position.CENTER : position, (i & 2) != 0 ? com.paypal.pds.core.ConstantsKt.getSize0() : f, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final com.paypal.pds.components.AnchorEdge.Position getPosition() {
            return (com.paypal.pds.components.AnchorEdge.Position) this.position.getValue();
        }

        public final void setPosition(com.paypal.pds.components.AnchorEdge.Position position) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(position, "");
            this.position.setValue(position);
        }

        public final float getPercent$pds_release() {
            return getPosition().toFloat$pds_release();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: getOffset-D9Ej5fM, reason: not valid java name */
        public final float m21568getOffsetD9Ej5fM() {
            return ((androidx.compose.ui.unit.Dp) this.offset.getValue()).m8615unboximpl();
        }

        /* renamed from: setOffset-0680j_4, reason: not valid java name */
        public final void m21569setOffset0680j_4(float f) {
            this.offset.setValue(androidx.compose.ui.unit.Dp.m8599boximpl(f));
        }

        public /* synthetic */ EdgePositioning(com.paypal.pds.components.AnchorEdge.Position position, float f, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(position, f);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0010¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/pds/components/AnchorEdge$Top;", "Lcom/paypal/pds/components/AnchorEdge;", "<init>", "()V", "Landroidx/compose/ui/unit/IntRect;", "anchorBounds", "", "marginPx", "", "popupHeight", "calculateY$pds_release", "(Landroidx/compose/ui/unit/IntRect;FI)I"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Top extends com.paypal.pds.components.AnchorEdge {
        public static final int $stable = 0;
        public static final com.paypal.pds.components.AnchorEdge.Top INSTANCE = new com.paypal.pds.components.AnchorEdge.Top();

        private Top() {
            super(null);
        }

        @Override // com.paypal.pds.components.AnchorEdge
        public final int calculateY$pds_release(androidx.compose.ui.unit.IntRect anchorBounds, float marginPx, int popupHeight) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(anchorBounds, "");
            return (anchorBounds.getTop() - ((int) marginPx)) - popupHeight;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0010¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/pds/components/AnchorEdge$Bottom;", "Lcom/paypal/pds/components/AnchorEdge;", "<init>", "()V", "Landroidx/compose/ui/unit/IntRect;", "anchorBounds", "", "marginPx", "", "popupHeight", "calculateY$pds_release", "(Landroidx/compose/ui/unit/IntRect;FI)I"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Bottom extends com.paypal.pds.components.AnchorEdge {
        public static final int $stable = 0;
        public static final com.paypal.pds.components.AnchorEdge.Bottom INSTANCE = new com.paypal.pds.components.AnchorEdge.Bottom();

        private Bottom() {
            super(null);
        }

        @Override // com.paypal.pds.components.AnchorEdge
        public final int calculateY$pds_release(androidx.compose.ui.unit.IntRect anchorBounds, float marginPx, int popupHeight) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(anchorBounds, "");
            return anchorBounds.getBottom() + ((int) marginPx);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0080, code lost:
    
        if (r11 == androidx.compose.ui.unit.LayoutDirection.Ltr) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x008e, code lost:
    
        r1 = 0.9f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x008b, code lost:
    
        if (r11 == androidx.compose.ui.unit.LayoutDirection.Ltr) goto L25;
     */
    /* renamed from: calculatePopupPosition-XLN5NMI$pds_release, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long m21565calculatePopupPositionXLN5NMI$pds_release(androidx.compose.ui.unit.Density density, float cornerRadius, float tipWidth, float tipHeight, com.paypal.pds.components.AnchorEdge.EdgePositioning tipPosition, androidx.compose.ui.unit.IntRect anchorBounds, androidx.compose.ui.unit.LayoutDirection layoutDirection, long popupContentSize) {
        float right;
        float percent$pds_release;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(density, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tipPosition, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(anchorBounds, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(layoutDirection, "");
        if (layoutDirection == androidx.compose.ui.unit.LayoutDirection.Ltr) {
            right = anchorBounds.getLeft() + (anchorBounds.getWidth() * 0.5f);
        } else {
            right = anchorBounds.getRight() - (anchorBounds.getWidth() * 0.5f);
        }
        float mo1418toPx0680j_4 = density.mo1418toPx0680j_4(androidx.compose.ui.unit.Dp.m8601constructorimpl(androidx.compose.ui.unit.Dp.m8601constructorimpl(androidx.compose.ui.unit.Dp.m8601constructorimpl(cornerRadius * 2.0f) + androidx.compose.ui.unit.Dp.m8601constructorimpl(com.paypal.pds.components.CoachTipKt.m21705getAbsoluteValue0680j_4(tipPosition.m21568getOffsetD9Ej5fM()) * 2.0f)) + ((androidx.compose.ui.unit.Dp) kotlin.comparisons.ComparisonsKt.maxOf(androidx.compose.ui.unit.Dp.m8599boximpl(tipWidth), androidx.compose.ui.unit.Dp.m8599boximpl(tipHeight))).m8615unboximpl())) / 2.0f;
        int i = com.paypal.pds.components.AnchorEdge.WhenMappings.$EnumSwitchMapping$0[tipPosition.getPosition().ordinal()];
        if (i != 1) {
            percent$pds_release = 0.1f;
            if (i != 2) {
                if (i != 3) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
            }
        } else {
            percent$pds_release = layoutDirection == androidx.compose.ui.unit.LayoutDirection.Ltr ? tipPosition.getPercent$pds_release() : 1.0f - tipPosition.getPercent$pds_release();
        }
        return androidx.compose.ui.unit.IntOffset.m8723constructorimpl((((int) kotlin.ranges.RangesKt.coerceAtLeast((right - mo1418toPx0680j_4) - ((((int) (popupContentSize >> 32)) - r6) * percent$pds_release), 0.0f)) << 32) | (kotlin.ranges.RangesKt.coerceAtLeast(calculateY$pds_release(anchorBounds, density.mo1418toPx0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing8()), (int) (popupContentSize & 4294967295L)), 0) & 4294967295L));
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.pds.components.AnchorEdge.Position.values().length];
            try {
                iArr[com.paypal.pds.components.AnchorEdge.Position.CENTER.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.pds.components.AnchorEdge.Position.START.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.pds.components.AnchorEdge.Position.END.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ AnchorEdge(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
