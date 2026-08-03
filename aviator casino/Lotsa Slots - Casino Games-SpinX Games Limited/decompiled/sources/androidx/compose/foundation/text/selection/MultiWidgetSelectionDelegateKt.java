package androidx.compose.foundation.text.selection;

/* compiled from: MultiWidgetSelectionDelegate.kt */
@kotlin.Metadata(d1 = {"\u0000R\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\"\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\"\u0010\b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0002ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a\"\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0002ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\r\u001a\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\tH\u0002\u001a6\u0010\u0014\u001a\u00020\u0015*\u00020\u00162\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u001aH\u0000ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u001c\u0010\u001d\u001a\u00020\t*\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001aH\u0002\u001a4\u0010 \u001a\u00020\u0001*\u00020!2\u0016\u0010\"\u001a\u0012\u0012\u0004\u0012\u00020\u001a0#j\b\u0012\u0004\u0012\u00020\u001a`$2\u0006\u0010\u001f\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020\u0001H\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006&"}, d2 = {"getOffsetForPosition", "", "position", "Landroidx/compose/ui/geometry/Offset;", "textLayoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", "getOffsetForPosition-3MmeM6k", "(JLandroidx/compose/ui/text/TextLayoutResult;)I", "getXDirection", "Landroidx/compose/foundation/text/selection/Direction;", "bounds", "Landroidx/compose/ui/geometry/Rect;", "getXDirection-3MmeM6k", "(JLandroidx/compose/ui/geometry/Rect;)Landroidx/compose/foundation/text/selection/Direction;", "getYDirection", "getYDirection-3MmeM6k", "isSelected", "", "currentDirection", "otherDirection", "appendSelectableInfo", "", "Landroidx/compose/foundation/text/selection/SelectionLayoutBuilder;", "localPosition", "previousHandlePosition", "selectableId", "", "appendSelectableInfo-Parwq6A", "(Landroidx/compose/foundation/text/selection/SelectionLayoutBuilder;Landroidx/compose/ui/text/TextLayoutResult;JJJ)V", "getDirectionById", "anchorSelectableId", "currentSelectableId", "getPreviousAdjustedOffset", "Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;", "selectableIdOrderingComparator", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "currentTextLength", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MultiWidgetSelectionDelegateKt {
    /* renamed from: appendSelectableInfo-Parwq6A, reason: not valid java name */
    public static final void m1005appendSelectableInfoParwq6A(androidx.compose.foundation.text.selection.SelectionLayoutBuilder selectionLayoutBuilder, androidx.compose.ui.text.TextLayoutResult textLayoutResult, long j, long j2, long j3) {
        androidx.compose.foundation.text.selection.Direction appendSelectableInfo_Parwq6A$otherDirection;
        androidx.compose.foundation.text.selection.Direction direction;
        androidx.compose.foundation.text.selection.Direction direction2;
        androidx.compose.foundation.text.selection.Direction direction3;
        androidx.compose.foundation.text.selection.Direction direction4;
        int i;
        int previousAdjustedOffset;
        androidx.compose.foundation.text.selection.Selection.AnchorInfo start;
        androidx.compose.foundation.text.selection.Selection.AnchorInfo end;
        androidx.compose.ui.geometry.Rect rect = new androidx.compose.ui.geometry.Rect(0.0f, 0.0f, androidx.compose.ui.unit.IntSize.m4652getWidthimpl(textLayoutResult.getSize()), androidx.compose.ui.unit.IntSize.m4651getHeightimpl(textLayoutResult.getSize()));
        androidx.compose.foundation.text.selection.Direction m1007getXDirection3MmeM6k = m1007getXDirection3MmeM6k(j, rect);
        androidx.compose.foundation.text.selection.Direction m1008getYDirection3MmeM6k = m1008getYDirection3MmeM6k(j, rect);
        if (selectionLayoutBuilder.getIsStartHandle()) {
            androidx.compose.foundation.text.selection.Selection previousSelection = selectionLayoutBuilder.getPreviousSelection();
            appendSelectableInfo_Parwq6A$otherDirection = appendSelectableInfo_Parwq6A$otherDirection(m1007getXDirection3MmeM6k, m1008getYDirection3MmeM6k, selectionLayoutBuilder, j3, previousSelection != null ? previousSelection.getEnd() : null);
            direction3 = appendSelectableInfo_Parwq6A$otherDirection;
            direction4 = direction3;
            direction = m1007getXDirection3MmeM6k;
            direction2 = m1008getYDirection3MmeM6k;
        } else {
            androidx.compose.foundation.text.selection.Selection previousSelection2 = selectionLayoutBuilder.getPreviousSelection();
            appendSelectableInfo_Parwq6A$otherDirection = appendSelectableInfo_Parwq6A$otherDirection(m1007getXDirection3MmeM6k, m1008getYDirection3MmeM6k, selectionLayoutBuilder, j3, previousSelection2 != null ? previousSelection2.getStart() : null);
            direction = appendSelectableInfo_Parwq6A$otherDirection;
            direction2 = direction;
            direction3 = m1007getXDirection3MmeM6k;
            direction4 = m1008getYDirection3MmeM6k;
        }
        if (isSelected(androidx.compose.foundation.text.selection.SelectionLayoutKt.resolve2dDirection(m1007getXDirection3MmeM6k, m1008getYDirection3MmeM6k), appendSelectableInfo_Parwq6A$otherDirection)) {
            int length = textLayoutResult.getLayoutInput().getText().length();
            if (selectionLayoutBuilder.getIsStartHandle()) {
                int m1006getOffsetForPosition3MmeM6k = m1006getOffsetForPosition3MmeM6k(j, textLayoutResult);
                androidx.compose.foundation.text.selection.Selection previousSelection3 = selectionLayoutBuilder.getPreviousSelection();
                previousAdjustedOffset = m1006getOffsetForPosition3MmeM6k;
                i = (previousSelection3 == null || (end = previousSelection3.getEnd()) == null) ? m1006getOffsetForPosition3MmeM6k : getPreviousAdjustedOffset(end, selectionLayoutBuilder.getSelectableIdOrderingComparator(), j3, length);
            } else {
                int m1006getOffsetForPosition3MmeM6k2 = m1006getOffsetForPosition3MmeM6k(j, textLayoutResult);
                androidx.compose.foundation.text.selection.Selection previousSelection4 = selectionLayoutBuilder.getPreviousSelection();
                i = m1006getOffsetForPosition3MmeM6k2;
                previousAdjustedOffset = (previousSelection4 == null || (start = previousSelection4.getStart()) == null) ? m1006getOffsetForPosition3MmeM6k2 : getPreviousAdjustedOffset(start, selectionLayoutBuilder.getSelectableIdOrderingComparator(), j3, length);
            }
            selectionLayoutBuilder.appendInfo(j3, previousAdjustedOffset, direction, direction2, i, direction3, direction4, androidx.compose.ui.geometry.OffsetKt.m1892isUnspecifiedk4lQ0M(j2) ? -1 : m1006getOffsetForPosition3MmeM6k(j2, textLayoutResult), textLayoutResult);
        }
    }

    private static final androidx.compose.foundation.text.selection.Direction appendSelectableInfo_Parwq6A$otherDirection(androidx.compose.foundation.text.selection.Direction direction, androidx.compose.foundation.text.selection.Direction direction2, androidx.compose.foundation.text.selection.SelectionLayoutBuilder selectionLayoutBuilder, long j, androidx.compose.foundation.text.selection.Selection.AnchorInfo anchorInfo) {
        androidx.compose.foundation.text.selection.Direction directionById;
        return (anchorInfo == null || (directionById = getDirectionById(selectionLayoutBuilder, anchorInfo.getSelectableId(), j)) == null) ? androidx.compose.foundation.text.selection.SelectionLayoutKt.resolve2dDirection(direction, direction2) : directionById;
    }

    private static final int getPreviousAdjustedOffset(androidx.compose.foundation.text.selection.Selection.AnchorInfo anchorInfo, java.util.Comparator<java.lang.Long> comparator, long j, int i) {
        int compare = comparator.compare(java.lang.Long.valueOf(anchorInfo.getSelectableId()), java.lang.Long.valueOf(j));
        if (compare < 0) {
            return 0;
        }
        return compare > 0 ? i : anchorInfo.getOffset();
    }

    /* renamed from: getXDirection-3MmeM6k, reason: not valid java name */
    private static final androidx.compose.foundation.text.selection.Direction m1007getXDirection3MmeM6k(long j, androidx.compose.ui.geometry.Rect rect) {
        return androidx.compose.ui.geometry.Offset.m1871getXimpl(j) < rect.getLeft() ? androidx.compose.foundation.text.selection.Direction.BEFORE : androidx.compose.ui.geometry.Offset.m1871getXimpl(j) > rect.getRight() ? androidx.compose.foundation.text.selection.Direction.AFTER : androidx.compose.foundation.text.selection.Direction.ON;
    }

    /* renamed from: getYDirection-3MmeM6k, reason: not valid java name */
    private static final androidx.compose.foundation.text.selection.Direction m1008getYDirection3MmeM6k(long j, androidx.compose.ui.geometry.Rect rect) {
        return androidx.compose.ui.geometry.Offset.m1872getYimpl(j) < rect.getTop() ? androidx.compose.foundation.text.selection.Direction.BEFORE : androidx.compose.ui.geometry.Offset.m1872getYimpl(j) > rect.getBottom() ? androidx.compose.foundation.text.selection.Direction.AFTER : androidx.compose.foundation.text.selection.Direction.ON;
    }

    private static final androidx.compose.foundation.text.selection.Direction getDirectionById(androidx.compose.foundation.text.selection.SelectionLayoutBuilder selectionLayoutBuilder, long j, long j2) {
        int compare = selectionLayoutBuilder.getSelectableIdOrderingComparator().compare(java.lang.Long.valueOf(j), java.lang.Long.valueOf(j2));
        if (compare < 0) {
            return androidx.compose.foundation.text.selection.Direction.BEFORE;
        }
        if (compare > 0) {
            return androidx.compose.foundation.text.selection.Direction.AFTER;
        }
        return androidx.compose.foundation.text.selection.Direction.ON;
    }

    private static final boolean isSelected(androidx.compose.foundation.text.selection.Direction direction, androidx.compose.foundation.text.selection.Direction direction2) {
        return direction == androidx.compose.foundation.text.selection.Direction.ON || direction != direction2;
    }

    /* renamed from: getOffsetForPosition-3MmeM6k, reason: not valid java name */
    private static final int m1006getOffsetForPosition3MmeM6k(long j, androidx.compose.ui.text.TextLayoutResult textLayoutResult) {
        if (androidx.compose.ui.geometry.Offset.m1872getYimpl(j) <= 0.0f) {
            return 0;
        }
        return androidx.compose.ui.geometry.Offset.m1872getYimpl(j) >= textLayoutResult.getMultiParagraph().getHeight() ? textLayoutResult.getLayoutInput().getText().length() : textLayoutResult.m3936getOffsetForPositionk4lQ0M(j);
    }
}
