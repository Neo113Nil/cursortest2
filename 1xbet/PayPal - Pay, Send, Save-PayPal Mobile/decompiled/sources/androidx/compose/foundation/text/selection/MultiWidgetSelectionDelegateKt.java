package androidx.compose.foundation.text.selection;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a3\u0010\u000b\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\n\u001a;\u0010\u0013\u001a\u00020\u0011*\u00020\f2\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00060\rj\b\u0012\u0004\u0012\u00020\u0006`\u000e2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a#\u0010\u0016\u001a\u00020\u0015*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001f\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0013\u0010\u0018"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectionLayoutBuilder;", "Landroidx/compose/ui/text/TextLayoutResult;", "textLayoutResult", "Landroidx/compose/ui/geometry/Offset;", "localPosition", "previousHandlePosition", "", "selectableId", "", "appendSelectableInfo-Parwq6A", "(Landroidx/compose/foundation/text/selection/SelectionLayoutBuilder;Landroidx/compose/ui/text/TextLayoutResult;JJJ)V", "appendSelectableInfo", "Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;", "Ljava/util/Comparator;", "Lkotlin/getOutputStallDuration;", "p0", "p1", "", "p2", "getHighSpeedVideoFpsRangesFor", "(Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;Ljava/util/Comparator;JI)I", "Landroidx/compose/foundation/text/selection/Direction;", "getHighSpeedVideoFpsRanges", "(Landroidx/compose/foundation/text/selection/SelectionLayoutBuilder;JJ)Landroidx/compose/foundation/text/selection/Direction;", "(JLandroidx/compose/ui/text/TextLayoutResult;)I"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MultiWidgetSelectionDelegateKt {
    /* renamed from: appendSelectableInfo-Parwq6A, reason: not valid java name */
    public static final void m2376appendSelectableInfoParwq6A(androidx.compose.foundation.text.selection.SelectionLayoutBuilder selectionLayoutBuilder, androidx.compose.ui.text.TextLayoutResult textLayoutResult, long j, long j2, long j3) {
        androidx.compose.foundation.text.selection.Direction direction;
        androidx.compose.foundation.text.selection.Direction direction2;
        androidx.compose.foundation.text.selection.Selection.AnchorInfo start;
        androidx.compose.foundation.text.selection.Direction resolve2dDirection;
        androidx.compose.foundation.text.selection.Direction direction3;
        androidx.compose.foundation.text.selection.Direction direction4;
        androidx.compose.foundation.text.selection.Direction direction5;
        androidx.compose.foundation.text.selection.Direction direction6;
        int highSpeedVideoFpsRangesFor;
        androidx.compose.foundation.text.selection.Selection.AnchorInfo start2;
        int i;
        int highSpeedVideoFpsRangesFor2;
        androidx.compose.foundation.text.selection.Selection.AnchorInfo end;
        androidx.compose.foundation.text.selection.Direction resolve2dDirection2;
        androidx.compose.ui.geometry.Rect rect = new androidx.compose.ui.geometry.Rect(0.0f, 0.0f, (int) (textLayoutResult.getSize() >> 32), (int) (textLayoutResult.getSize() & 4294967295L));
        int i2 = (int) (j >> 32);
        if (java.lang.Float.intBitsToFloat(i2) < rect.getLeft()) {
            direction = androidx.compose.foundation.text.selection.Direction.BEFORE;
        } else {
            direction = java.lang.Float.intBitsToFloat(i2) > rect.getRight() ? androidx.compose.foundation.text.selection.Direction.AFTER : androidx.compose.foundation.text.selection.Direction.ON;
        }
        int i3 = (int) (j & 4294967295L);
        if (java.lang.Float.intBitsToFloat(i3) < rect.getTop()) {
            direction2 = androidx.compose.foundation.text.selection.Direction.BEFORE;
        } else {
            direction2 = java.lang.Float.intBitsToFloat(i3) > rect.getBottom() ? androidx.compose.foundation.text.selection.Direction.AFTER : androidx.compose.foundation.text.selection.Direction.ON;
        }
        if (selectionLayoutBuilder.getIsStartHandle()) {
            androidx.compose.foundation.text.selection.Selection previousSelection = selectionLayoutBuilder.getPreviousSelection();
            start = previousSelection != null ? previousSelection.getEnd() : null;
            if (start == null || (resolve2dDirection2 = getHighSpeedVideoFpsRanges(selectionLayoutBuilder, start.getSelectableId(), j3)) == null) {
                resolve2dDirection2 = androidx.compose.foundation.text.selection.SelectionLayoutKt.resolve2dDirection(direction, direction2);
            }
            direction5 = direction2;
            direction3 = resolve2dDirection2;
            direction4 = direction3;
            direction6 = direction4;
            resolve2dDirection = direction;
        } else {
            androidx.compose.foundation.text.selection.Selection previousSelection2 = selectionLayoutBuilder.getPreviousSelection();
            start = previousSelection2 != null ? previousSelection2.getStart() : null;
            if (start == null || (resolve2dDirection = getHighSpeedVideoFpsRanges(selectionLayoutBuilder, start.getSelectableId(), j3)) == null) {
                resolve2dDirection = androidx.compose.foundation.text.selection.SelectionLayoutKt.resolve2dDirection(direction, direction2);
            }
            direction3 = direction;
            direction4 = direction2;
            direction5 = resolve2dDirection;
            direction6 = direction5;
        }
        androidx.compose.foundation.text.selection.Direction resolve2dDirection3 = androidx.compose.foundation.text.selection.SelectionLayoutKt.resolve2dDirection(direction, direction2);
        if (resolve2dDirection3 == androidx.compose.foundation.text.selection.Direction.ON || resolve2dDirection3 != direction6) {
            int length = textLayoutResult.getLayoutInput().getText().length();
            if (selectionLayoutBuilder.getIsStartHandle()) {
                highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(j, textLayoutResult);
                androidx.compose.foundation.text.selection.Selection previousSelection3 = selectionLayoutBuilder.getPreviousSelection();
                if (previousSelection3 != null && (end = previousSelection3.getEnd()) != null) {
                    int highSpeedVideoFpsRangesFor3 = getHighSpeedVideoFpsRangesFor(end, selectionLayoutBuilder.getSelectableIdOrderingComparator(), j3, length);
                    highSpeedVideoFpsRangesFor2 = highSpeedVideoFpsRangesFor;
                    i = highSpeedVideoFpsRangesFor3;
                }
                highSpeedVideoFpsRangesFor2 = highSpeedVideoFpsRangesFor;
                i = highSpeedVideoFpsRangesFor2;
            } else {
                highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(j, textLayoutResult);
                androidx.compose.foundation.text.selection.Selection previousSelection4 = selectionLayoutBuilder.getPreviousSelection();
                if (previousSelection4 != null && (start2 = previousSelection4.getStart()) != null) {
                    i = highSpeedVideoFpsRangesFor;
                    highSpeedVideoFpsRangesFor2 = getHighSpeedVideoFpsRangesFor(start2, selectionLayoutBuilder.getSelectableIdOrderingComparator(), j3, length);
                }
                highSpeedVideoFpsRangesFor2 = highSpeedVideoFpsRangesFor;
                i = highSpeedVideoFpsRangesFor2;
            }
            selectionLayoutBuilder.appendInfo(j3, highSpeedVideoFpsRangesFor2, resolve2dDirection, direction5, i, direction3, direction4, (9223372034707292159L & j2) == androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats ? -1 : getHighSpeedVideoFpsRangesFor(j2, textLayoutResult), textLayoutResult);
        }
    }

    private static final int getHighSpeedVideoFpsRangesFor(androidx.compose.foundation.text.selection.Selection.AnchorInfo anchorInfo, java.util.Comparator<java.lang.Long> comparator, long j, int i) {
        int compare = comparator.compare(java.lang.Long.valueOf(anchorInfo.getSelectableId()), java.lang.Long.valueOf(j));
        if (compare < 0) {
            return 0;
        }
        return compare > 0 ? i : anchorInfo.getOffset();
    }

    private static final androidx.compose.foundation.text.selection.Direction getHighSpeedVideoFpsRanges(androidx.compose.foundation.text.selection.SelectionLayoutBuilder selectionLayoutBuilder, long j, long j2) {
        int compare = selectionLayoutBuilder.getSelectableIdOrderingComparator().compare(java.lang.Long.valueOf(j), java.lang.Long.valueOf(j2));
        if (compare < 0) {
            return androidx.compose.foundation.text.selection.Direction.BEFORE;
        }
        if (compare > 0) {
            return androidx.compose.foundation.text.selection.Direction.AFTER;
        }
        return androidx.compose.foundation.text.selection.Direction.ON;
    }

    private static final int getHighSpeedVideoFpsRangesFor(long j, androidx.compose.ui.text.TextLayoutResult textLayoutResult) {
        int i = (int) (4294967295L & j);
        if (java.lang.Float.intBitsToFloat(i) <= 0.0f) {
            return 0;
        }
        if (java.lang.Float.intBitsToFloat(i) >= textLayoutResult.getMultiParagraph().getHeight()) {
            return textLayoutResult.getLayoutInput().getText().length();
        }
        return textLayoutResult.m8011getOffsetForPositionk4lQ0M(j);
    }
}
