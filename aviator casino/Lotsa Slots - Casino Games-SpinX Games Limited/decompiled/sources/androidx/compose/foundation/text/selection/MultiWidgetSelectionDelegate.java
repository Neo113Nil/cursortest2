package androidx.compose.foundation.text.selection;

/* compiled from: MultiWidgetSelectionDelegate.kt */
@kotlin.Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005¢\u0006\u0002\u0010\tJ\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000bH\u0016J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u000bH\u0016J%\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b!\u0010\"J\b\u0010\u0010\u001a\u00020\u000bH\u0016J\n\u0010#\u001a\u0004\u0018\u00010\u0006H\u0016J\u0010\u0010$\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u000bH\u0016J\u0010\u0010%\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u000bH\u0016J\u001d\u0010&\u001a\u00020'2\u0006\u0010\u0018\u001a\u00020\u000bH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b(\u0010)J\n\u0010*\u001a\u0004\u0018\u00010\u001eH\u0016J\b\u0010+\u001a\u00020,H\u0016R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u000f\u001a\u00020\u000b*\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006-"}, d2 = {"Landroidx/compose/foundation/text/selection/MultiWidgetSelectionDelegate;", "Landroidx/compose/foundation/text/selection/Selectable;", "selectableId", "", "coordinatesCallback", "Lkotlin/Function0;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "layoutResultCallback", "Landroidx/compose/ui/text/TextLayoutResult;", "(JLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "_previousLastVisibleOffset", "", "_previousTextLayoutResult", "getSelectableId", "()J", "lastVisibleOffset", "getLastVisibleOffset", "(Landroidx/compose/ui/text/TextLayoutResult;)I", "appendSelectableInfoToBuilder", "", "builder", "Landroidx/compose/foundation/text/selection/SelectionLayoutBuilder;", "getBoundingBox", "Landroidx/compose/ui/geometry/Rect;", "offset", "getCenterYForOffset", "", "getHandlePosition", "Landroidx/compose/ui/geometry/Offset;", "selection", "Landroidx/compose/foundation/text/selection/Selection;", "isStartHandle", "", "getHandlePosition-dBAh8RU", "(Landroidx/compose/foundation/text/selection/Selection;Z)J", "getLayoutCoordinates", "getLineLeft", "getLineRight", "getRangeOfLineContaining", "Landroidx/compose/ui/text/TextRange;", "getRangeOfLineContaining--jx7JFs", "(I)J", "getSelectAllSelection", "getText", "Landroidx/compose/ui/text/AnnotatedString;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MultiWidgetSelectionDelegate implements androidx.compose.foundation.text.selection.Selectable {
    public static final int $stable = 8;
    private int _previousLastVisibleOffset = -1;
    private androidx.compose.ui.text.TextLayoutResult _previousTextLayoutResult;
    private final kotlin.jvm.functions.Function0<androidx.compose.ui.layout.LayoutCoordinates> coordinatesCallback;
    private final kotlin.jvm.functions.Function0<androidx.compose.ui.text.TextLayoutResult> layoutResultCallback;
    private final long selectableId;

    /* JADX WARN: Multi-variable type inference failed */
    public MultiWidgetSelectionDelegate(long j, kotlin.jvm.functions.Function0<? extends androidx.compose.ui.layout.LayoutCoordinates> function0, kotlin.jvm.functions.Function0<androidx.compose.ui.text.TextLayoutResult> function02) {
        this.selectableId = j;
        this.coordinatesCallback = function0;
        this.layoutResultCallback = function02;
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public long getSelectableId() {
        return this.selectableId;
    }

    private final synchronized int getLastVisibleOffset(androidx.compose.ui.text.TextLayoutResult textLayoutResult) {
        int lineCount;
        if (this._previousTextLayoutResult != textLayoutResult) {
            if (textLayoutResult.getDidOverflowHeight() && !textLayoutResult.getMultiParagraph().getDidExceedMaxLines()) {
                int coerceAtMost = kotlin.ranges.RangesKt.coerceAtMost(textLayoutResult.getLineForVerticalPosition(androidx.compose.ui.unit.IntSize.m4651getHeightimpl(textLayoutResult.getSize())), textLayoutResult.getLineCount() - 1);
                while (coerceAtMost >= 0 && textLayoutResult.getLineTop(coerceAtMost) >= androidx.compose.ui.unit.IntSize.m4651getHeightimpl(textLayoutResult.getSize())) {
                    coerceAtMost--;
                }
                lineCount = kotlin.ranges.RangesKt.coerceAtLeast(coerceAtMost, 0);
                this._previousLastVisibleOffset = textLayoutResult.getLineEnd(lineCount, true);
                this._previousTextLayoutResult = textLayoutResult;
            }
            lineCount = textLayoutResult.getLineCount() - 1;
            this._previousLastVisibleOffset = textLayoutResult.getLineEnd(lineCount, true);
            this._previousTextLayoutResult = textLayoutResult;
        }
        return this._previousLastVisibleOffset;
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public void appendSelectableInfoToBuilder(androidx.compose.foundation.text.selection.SelectionLayoutBuilder builder) {
        androidx.compose.ui.text.TextLayoutResult invoke;
        long m1875minusMKHz9U;
        androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates = getLayoutCoordinates();
        if (layoutCoordinates == null || (invoke = this.layoutResultCallback.invoke()) == null) {
            return;
        }
        long mo3410localPositionOfR5De75A = builder.getContainerCoordinates().mo3410localPositionOfR5De75A(layoutCoordinates, androidx.compose.ui.geometry.Offset.INSTANCE.m1887getZeroF1C5BW0());
        long m1875minusMKHz9U2 = androidx.compose.ui.geometry.Offset.m1875minusMKHz9U(builder.getCurrentPosition(), mo3410localPositionOfR5De75A);
        if (androidx.compose.ui.geometry.OffsetKt.m1892isUnspecifiedk4lQ0M(builder.getPreviousHandlePosition())) {
            m1875minusMKHz9U = androidx.compose.ui.geometry.Offset.INSTANCE.m1886getUnspecifiedF1C5BW0();
        } else {
            m1875minusMKHz9U = androidx.compose.ui.geometry.Offset.m1875minusMKHz9U(builder.getPreviousHandlePosition(), mo3410localPositionOfR5De75A);
        }
        androidx.compose.foundation.text.selection.MultiWidgetSelectionDelegateKt.m1005appendSelectableInfoParwq6A(builder, invoke, m1875minusMKHz9U2, m1875minusMKHz9U, getSelectableId());
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public androidx.compose.foundation.text.selection.Selection getSelectAllSelection() {
        androidx.compose.ui.text.TextLayoutResult invoke = this.layoutResultCallback.invoke();
        if (invoke == null) {
            return null;
        }
        int length = invoke.getLayoutInput().getText().length();
        return new androidx.compose.foundation.text.selection.Selection(new androidx.compose.foundation.text.selection.Selection.AnchorInfo(invoke.getBidiRunDirection(0), 0, getSelectableId()), new androidx.compose.foundation.text.selection.Selection.AnchorInfo(invoke.getBidiRunDirection(java.lang.Math.max(length - 1, 0)), length, getSelectableId()), false);
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    /* renamed from: getHandlePosition-dBAh8RU, reason: not valid java name */
    public long mo1003getHandlePositiondBAh8RU(androidx.compose.foundation.text.selection.Selection selection, boolean isStartHandle) {
        androidx.compose.ui.text.TextLayoutResult invoke;
        if ((isStartHandle && selection.getStart().getSelectableId() != getSelectableId()) || (!isStartHandle && selection.getEnd().getSelectableId() != getSelectableId())) {
            return androidx.compose.ui.geometry.Offset.INSTANCE.m1886getUnspecifiedF1C5BW0();
        }
        if (getLayoutCoordinates() != null && (invoke = this.layoutResultCallback.invoke()) != null) {
            return androidx.compose.foundation.text.selection.TextSelectionDelegateKt.getSelectionHandleCoordinates(invoke, kotlin.ranges.RangesKt.coerceIn((isStartHandle ? selection.getStart() : selection.getEnd()).getOffset(), 0, getLastVisibleOffset(invoke)), isStartHandle, selection.getHandlesCrossed());
        }
        return androidx.compose.ui.geometry.Offset.INSTANCE.m1886getUnspecifiedF1C5BW0();
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public androidx.compose.ui.layout.LayoutCoordinates getLayoutCoordinates() {
        androidx.compose.ui.layout.LayoutCoordinates invoke = this.coordinatesCallback.invoke();
        if (invoke == null || !invoke.isAttached()) {
            return null;
        }
        return invoke;
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public androidx.compose.ui.text.AnnotatedString getText() {
        androidx.compose.ui.text.TextLayoutResult invoke = this.layoutResultCallback.invoke();
        return invoke == null ? new androidx.compose.ui.text.AnnotatedString("", null, null, 6, null) : invoke.getLayoutInput().getText();
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public androidx.compose.ui.geometry.Rect getBoundingBox(int offset) {
        androidx.compose.ui.text.TextLayoutResult invoke = this.layoutResultCallback.invoke();
        if (invoke == null) {
            return androidx.compose.ui.geometry.Rect.INSTANCE.getZero();
        }
        int length = invoke.getLayoutInput().getText().length();
        if (length < 1) {
            return androidx.compose.ui.geometry.Rect.INSTANCE.getZero();
        }
        return invoke.getBoundingBox(kotlin.ranges.RangesKt.coerceIn(offset, 0, length - 1));
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public float getLineLeft(int offset) {
        int lineForOffset;
        androidx.compose.ui.text.TextLayoutResult invoke = this.layoutResultCallback.invoke();
        if (invoke != null && (lineForOffset = invoke.getLineForOffset(offset)) < invoke.getLineCount()) {
            return invoke.getLineLeft(lineForOffset);
        }
        return -1.0f;
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public float getLineRight(int offset) {
        int lineForOffset;
        androidx.compose.ui.text.TextLayoutResult invoke = this.layoutResultCallback.invoke();
        if (invoke != null && (lineForOffset = invoke.getLineForOffset(offset)) < invoke.getLineCount()) {
            return invoke.getLineRight(lineForOffset);
        }
        return -1.0f;
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public float getCenterYForOffset(int offset) {
        int lineForOffset;
        androidx.compose.ui.text.TextLayoutResult invoke = this.layoutResultCallback.invoke();
        if (invoke == null || (lineForOffset = invoke.getLineForOffset(offset)) >= invoke.getLineCount()) {
            return -1.0f;
        }
        float lineTop = invoke.getLineTop(lineForOffset);
        return ((invoke.getLineBottom(lineForOffset) - lineTop) / 2) + lineTop;
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    /* renamed from: getRangeOfLineContaining--jx7JFs, reason: not valid java name */
    public long mo1004getRangeOfLineContainingjx7JFs(int offset) {
        androidx.compose.ui.text.TextLayoutResult invoke = this.layoutResultCallback.invoke();
        if (invoke == null) {
            return androidx.compose.ui.text.TextRange.INSTANCE.m3969getZerod9O1mEE();
        }
        int lastVisibleOffset = getLastVisibleOffset(invoke);
        if (lastVisibleOffset < 1) {
            return androidx.compose.ui.text.TextRange.INSTANCE.m3969getZerod9O1mEE();
        }
        int lineForOffset = invoke.getLineForOffset(kotlin.ranges.RangesKt.coerceIn(offset, 0, lastVisibleOffset - 1));
        return androidx.compose.ui.text.TextRangeKt.TextRange(invoke.getLineStart(lineForOffset), invoke.getLineEnd(lineForOffset, true));
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public int getLastVisibleOffset() {
        androidx.compose.ui.text.TextLayoutResult invoke = this.layoutResultCallback.invoke();
        if (invoke == null) {
            return 0;
        }
        return getLastVisibleOffset(invoke);
    }
}
