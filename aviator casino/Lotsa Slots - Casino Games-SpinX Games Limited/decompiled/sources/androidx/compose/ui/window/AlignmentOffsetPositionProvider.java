package androidx.compose.ui.window;

/* compiled from: Popup.kt */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J2\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0010H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0019\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/window/AlignmentOffsetPositionProvider;", "Landroidx/compose/ui/window/PopupPositionProvider;", "alignment", "Landroidx/compose/ui/Alignment;", "offset", "Landroidx/compose/ui/unit/IntOffset;", "(Landroidx/compose/ui/Alignment;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAlignment", "()Landroidx/compose/ui/Alignment;", "getOffset-nOcc-ac", "()J", "J", "calculatePosition", "anchorBounds", "Landroidx/compose/ui/unit/IntRect;", "windowSize", "Landroidx/compose/ui/unit/IntSize;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "popupContentSize", "calculatePosition-llwVHH4", "(Landroidx/compose/ui/unit/IntRect;JLandroidx/compose/ui/unit/LayoutDirection;J)J", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AlignmentOffsetPositionProvider implements androidx.compose.ui.window.PopupPositionProvider {
    public static final int $stable = 0;
    private final androidx.compose.ui.Alignment alignment;
    private final long offset;

    public /* synthetic */ AlignmentOffsetPositionProvider(androidx.compose.ui.Alignment alignment, long j, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(alignment, j);
    }

    private AlignmentOffsetPositionProvider(androidx.compose.ui.Alignment alignment, long j) {
        this.alignment = alignment;
        this.offset = j;
    }

    public final androidx.compose.ui.Alignment getAlignment() {
        return this.alignment;
    }

    /* renamed from: getOffset-nOcc-ac, reason: not valid java name and from getter */
    public final long getOffset() {
        return this.offset;
    }

    @Override // androidx.compose.ui.window.PopupPositionProvider
    /* renamed from: calculatePosition-llwVHH4 */
    public long mo1002calculatePositionllwVHH4(androidx.compose.ui.unit.IntRect anchorBounds, long windowSize, androidx.compose.ui.unit.LayoutDirection layoutDirection, long popupContentSize) {
        long mo1748alignKFBX0sM = this.alignment.mo1748alignKFBX0sM(androidx.compose.ui.unit.IntSize.INSTANCE.m4657getZeroYbymL2g(), anchorBounds.m4636getSizeYbymL2g(), layoutDirection);
        long mo1748alignKFBX0sM2 = this.alignment.mo1748alignKFBX0sM(androidx.compose.ui.unit.IntSize.INSTANCE.m4657getZeroYbymL2g(), popupContentSize, layoutDirection);
        long IntOffset = androidx.compose.ui.unit.IntOffsetKt.IntOffset(-androidx.compose.ui.unit.IntOffset.m4610getXimpl(mo1748alignKFBX0sM2), -androidx.compose.ui.unit.IntOffset.m4611getYimpl(mo1748alignKFBX0sM2));
        long IntOffset2 = androidx.compose.ui.unit.IntOffsetKt.IntOffset(androidx.compose.ui.unit.IntOffset.m4610getXimpl(this.offset) * (layoutDirection == androidx.compose.ui.unit.LayoutDirection.Ltr ? 1 : -1), androidx.compose.ui.unit.IntOffset.m4611getYimpl(this.offset));
        long m4638getTopLeftnOccac = anchorBounds.m4638getTopLeftnOccac();
        long IntOffset3 = androidx.compose.ui.unit.IntOffsetKt.IntOffset(androidx.compose.ui.unit.IntOffset.m4610getXimpl(m4638getTopLeftnOccac) + androidx.compose.ui.unit.IntOffset.m4610getXimpl(mo1748alignKFBX0sM), androidx.compose.ui.unit.IntOffset.m4611getYimpl(m4638getTopLeftnOccac) + androidx.compose.ui.unit.IntOffset.m4611getYimpl(mo1748alignKFBX0sM));
        long IntOffset4 = androidx.compose.ui.unit.IntOffsetKt.IntOffset(androidx.compose.ui.unit.IntOffset.m4610getXimpl(IntOffset3) + androidx.compose.ui.unit.IntOffset.m4610getXimpl(IntOffset), androidx.compose.ui.unit.IntOffset.m4611getYimpl(IntOffset3) + androidx.compose.ui.unit.IntOffset.m4611getYimpl(IntOffset));
        return androidx.compose.ui.unit.IntOffsetKt.IntOffset(androidx.compose.ui.unit.IntOffset.m4610getXimpl(IntOffset4) + androidx.compose.ui.unit.IntOffset.m4610getXimpl(IntOffset2), androidx.compose.ui.unit.IntOffset.m4611getYimpl(IntOffset4) + androidx.compose.ui.unit.IntOffset.m4611getYimpl(IntOffset2));
    }
}
