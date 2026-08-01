package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.unit.IntSize;
import com.ironsource.U3;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: MultiWidgetSelectionDelegate.kt */
@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a5\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a-\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001ak\u0010\u0014\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00050\u00152\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00112\b\u0010\u0018\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u001c\u001a\u00020\u0005H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001e\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001f"}, d2 = {"getAssembledSelectionInfo", "Landroidx/compose/foundation/text/selection/Selection;", "newSelectionRange", "Landroidx/compose/ui/text/TextRange;", "handlesCrossed", "", "selectableId", "", "textLayoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", "getAssembledSelectionInfo-vJH6DeI", "(JZJLandroidx/compose/ui/text/TextLayoutResult;)Landroidx/compose/foundation/text/selection/Selection;", "getOffsetForPosition", "", "bounds", "Landroidx/compose/ui/geometry/Rect;", U3.i.L, "Landroidx/compose/ui/geometry/Offset;", "getOffsetForPosition-0AR0LA0", "(Landroidx/compose/ui/text/TextLayoutResult;Landroidx/compose/ui/geometry/Rect;J)I", "getTextSelectionInfo", "Lkotlin/Pair;", "startHandlePosition", "endHandlePosition", "previousHandlePosition", "adjustment", "Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "previousSelection", "isStartHandle", "getTextSelectionInfo-yM0VcXU", "(Landroidx/compose/ui/text/TextLayoutResult;JJLandroidx/compose/ui/geometry/Offset;JLandroidx/compose/foundation/text/selection/SelectionAdjustment;Landroidx/compose/foundation/text/selection/Selection;Z)Lkotlin/Pair;", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MultiWidgetSelectionDelegateKt {
    /* JADX WARN: Code restructure failed: missing block: B:15:0x008d, code lost:
    
        if (r1 == false) goto L21;
     */
    /* renamed from: getTextSelectionInfo-yM0VcXU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Pair<Selection, Boolean> m789getTextSelectionInfoyM0VcXU(TextLayoutResult textLayoutResult, long j, long j2, Offset offset, long j3, SelectionAdjustment adjustment, Selection selection, boolean z) {
        Intrinsics.checkNotNullParameter(textLayoutResult, "textLayoutResult");
        Intrinsics.checkNotNullParameter(adjustment, "adjustment");
        Rect rect = new Rect(0.0f, 0.0f, IntSize.m4000getWidthimpl(textLayoutResult.getSize()), IntSize.m3999getHeightimpl(textLayoutResult.getSize()));
        boolean z2 = false;
        if (!SelectionMode.Vertical.m852isSelected2x9bVx0$foundation_release(rect, j, j2)) {
            return new Pair<>(null, false);
        }
        int m788getOffsetForPosition0AR0LA0 = m788getOffsetForPosition0AR0LA0(textLayoutResult, rect, j);
        int m788getOffsetForPosition0AR0LA02 = m788getOffsetForPosition0AR0LA0(textLayoutResult, rect, j2);
        int m788getOffsetForPosition0AR0LA03 = offset != null ? m788getOffsetForPosition0AR0LA0(textLayoutResult, rect, offset.getPackedValue()) : -1;
        long mo793adjustZXO7KMw = adjustment.mo793adjustZXO7KMw(textLayoutResult, TextRangeKt.TextRange(m788getOffsetForPosition0AR0LA0, m788getOffsetForPosition0AR0LA02), m788getOffsetForPosition0AR0LA03, z, selection != null ? TextRange.m3474boximpl(selection.m792toTextRanged9O1mEE()) : null);
        Selection m787getAssembledSelectionInfovJH6DeI = m787getAssembledSelectionInfovJH6DeI(mo793adjustZXO7KMw, TextRange.m3485getReversedimpl(mo793adjustZXO7KMw), j3, textLayoutResult);
        boolean areEqual = Intrinsics.areEqual(m787getAssembledSelectionInfovJH6DeI, selection);
        if (!z ? m788getOffsetForPosition0AR0LA02 == m788getOffsetForPosition0AR0LA03 : m788getOffsetForPosition0AR0LA0 == m788getOffsetForPosition0AR0LA03) {
        }
        z2 = true;
        return new Pair<>(m787getAssembledSelectionInfovJH6DeI, Boolean.valueOf(z2));
    }

    /* renamed from: getOffsetForPosition-0AR0LA0, reason: not valid java name */
    public static final int m788getOffsetForPosition0AR0LA0(TextLayoutResult textLayoutResult, Rect bounds, long j) {
        Intrinsics.checkNotNullParameter(textLayoutResult, "textLayoutResult");
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        int length = textLayoutResult.getLayoutInput().getText().length();
        if (bounds.m1418containsk4lQ0M(j)) {
            return RangesKt.coerceIn(textLayoutResult.m3471getOffsetForPositionk4lQ0M(j), 0, length);
        }
        if (SelectionMode.Vertical.mo851compare3MmeM6k$foundation_release(j, bounds) < 0) {
            return 0;
        }
        return length;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getAssembledSelectionInfo-vJH6DeI, reason: not valid java name */
    public static final Selection m787getAssembledSelectionInfovJH6DeI(long j, boolean z, long j2, TextLayoutResult textLayoutResult) {
        return new Selection(new Selection.AnchorInfo(textLayoutResult.getBidiRunDirection(TextRange.m3486getStartimpl(j)), TextRange.m3486getStartimpl(j), j2), new Selection.AnchorInfo(textLayoutResult.getBidiRunDirection(Math.max(TextRange.m3481getEndimpl(j) - 1, 0)), TextRange.m3481getEndimpl(j), j2), z);
    }
}
