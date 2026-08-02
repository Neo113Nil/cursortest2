package androidx.compose.ui.window;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\u0011\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Landroidx/compose/ui/window/AlignmentOffsetPositionProvider;", "Landroidx/compose/ui/window/PopupPositionProvider;", "Landroidx/compose/ui/Alignment;", "alignment", "Landroidx/compose/ui/unit/IntOffset;", "offset", "<init>", "(Landroidx/compose/ui/Alignment;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/unit/IntRect;", "anchorBounds", "Landroidx/compose/ui/unit/IntSize;", "windowSize", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "popupContentSize", "calculatePosition-llwVHH4", "(Landroidx/compose/ui/unit/IntRect;JLandroidx/compose/ui/unit/LayoutDirection;J)J", "calculatePosition", "Landroidx/compose/ui/Alignment;", "getAlignment", "()Landroidx/compose/ui/Alignment;", "J", "getOffset-nOcc-ac", "()J"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AlignmentOffsetPositionProvider implements androidx.compose.ui.window.PopupPositionProvider {
    public static final int $stable = 0;
    private final androidx.compose.ui.Alignment alignment;
    private final long offset;

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
    public final long mo1386calculatePositionllwVHH4(androidx.compose.ui.unit.IntRect anchorBounds, long windowSize, androidx.compose.ui.unit.LayoutDirection layoutDirection, long popupContentSize) {
        return androidx.compose.ui.unit.IntOffset.m8733plusqkQi6aY(androidx.compose.ui.unit.IntOffset.m8733plusqkQi6aY(androidx.compose.ui.unit.IntOffset.m8733plusqkQi6aY(anchorBounds.m8758getTopLeftnOccac(), this.alignment.mo5504alignKFBX0sM(androidx.compose.ui.unit.IntSize.INSTANCE.m8777getZeroYbymL2g(), anchorBounds.m8756getSizeYbymL2g(), layoutDirection)), androidx.compose.ui.unit.IntOffset.m8737unaryMinusnOccac(this.alignment.mo5504alignKFBX0sM(androidx.compose.ui.unit.IntSize.INSTANCE.m8777getZeroYbymL2g(), popupContentSize, layoutDirection))), androidx.compose.ui.unit.IntOffset.m8723constructorimpl((androidx.compose.ui.unit.IntOffset.m8730getYimpl(this.offset) & 4294967295L) | ((androidx.compose.ui.unit.IntOffset.m8729getXimpl(this.offset) * (layoutDirection == androidx.compose.ui.unit.LayoutDirection.Ltr ? 1 : -1)) << 32)));
    }

    public /* synthetic */ AlignmentOffsetPositionProvider(androidx.compose.ui.Alignment alignment, long j, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(alignment, j);
    }
}
