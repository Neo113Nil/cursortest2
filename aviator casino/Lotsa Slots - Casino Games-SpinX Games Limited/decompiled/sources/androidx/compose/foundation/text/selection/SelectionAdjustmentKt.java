package androidx.compose.foundation.text.selection;

/* compiled from: SelectionAdjustment.kt */
@kotlin.Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a,\u0010\u0006\u001a\u00020\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a\u001c\u0010\u000e\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\rH\u0002\u001a\u0014\u0010\u0011\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u001a\u0014\u0010\u0012\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a\u001c\u0010\u0013\u001a\u00020\n*\u00020\b2\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\nH\u0002\u001a4\u0010\u0015\u001a\u00020\u0007*\u00020\b2\u0006\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\nH\u0002\u001a\u001c\u0010\u0019\u001a\u00020\u0007*\u00020\u00032\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0007H\u0002¨\u0006\u001b²\u0006\n\u0010\u001c\u001a\u00020\rX\u008a\u0084\u0002²\u0006\n\u0010\u001d\u001a\u00020\u0007X\u008a\u0084\u0002"}, d2 = {"adjustToBoundaries", "Landroidx/compose/foundation/text/selection/Selection;", "layout", "Landroidx/compose/foundation/text/selection/SelectionLayout;", "boundaryFunction", "Landroidx/compose/foundation/text/selection/BoundaryFunction;", "anchorOnBoundary", "Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;", "Landroidx/compose/foundation/text/selection/SelectableInfo;", "crossed", "", "isStart", "slot", "", "changeOffset", "info", "newOffset", "ensureAtLeastOneChar", "expandOneChar", "isExpanding", "currentRawOffset", "snapToWordBoundary", "currentLine", "currentOffset", "otherOffset", "updateSelectionBoundary", "previousSelectionAnchor", "foundation_release", "currentRawLine", "anchorSnappedToWordBoundary"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SelectionAdjustmentKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.foundation.text.selection.Selection.AnchorInfo updateSelectionBoundary(final androidx.compose.foundation.text.selection.SelectionLayout selectionLayout, final androidx.compose.foundation.text.selection.SelectableInfo selectableInfo, androidx.compose.foundation.text.selection.Selection.AnchorInfo anchorInfo) {
        final int rawStartHandleOffset = selectionLayout.getIsStartHandle() ? selectableInfo.getRawStartHandleOffset() : selectableInfo.getRawEndHandleOffset();
        if ((selectionLayout.getIsStartHandle() ? selectionLayout.getStartSlot() : selectionLayout.getEndSlot()) != selectableInfo.getSlot()) {
            return selectableInfo.anchorForOffset(rawStartHandleOffset);
        }
        final kotlin.Lazy lazy = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.NONE, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.Integer>() { // from class: androidx.compose.foundation.text.selection.SelectionAdjustmentKt$updateSelectionBoundary$currentRawLine$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Integer invoke() {
                return java.lang.Integer.valueOf(androidx.compose.foundation.text.selection.SelectableInfo.this.getTextLayoutResult().getLineForOffset(rawStartHandleOffset));
            }
        });
        final int rawEndHandleOffset = selectionLayout.getIsStartHandle() ? selectableInfo.getRawEndHandleOffset() : selectableInfo.getRawStartHandleOffset();
        final int i = rawStartHandleOffset;
        kotlin.Lazy lazy2 = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.NONE, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<androidx.compose.foundation.text.selection.Selection.AnchorInfo>() { // from class: androidx.compose.foundation.text.selection.SelectionAdjustmentKt$updateSelectionBoundary$anchorSnappedToWordBoundary$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final androidx.compose.foundation.text.selection.Selection.AnchorInfo invoke() {
                int updateSelectionBoundary$lambda$0;
                androidx.compose.foundation.text.selection.Selection.AnchorInfo snapToWordBoundary;
                androidx.compose.foundation.text.selection.SelectableInfo selectableInfo2 = androidx.compose.foundation.text.selection.SelectableInfo.this;
                updateSelectionBoundary$lambda$0 = androidx.compose.foundation.text.selection.SelectionAdjustmentKt.updateSelectionBoundary$lambda$0(lazy);
                snapToWordBoundary = androidx.compose.foundation.text.selection.SelectionAdjustmentKt.snapToWordBoundary(selectableInfo2, updateSelectionBoundary$lambda$0, i, rawEndHandleOffset, selectionLayout.getIsStartHandle(), selectionLayout.getCrossStatus() == androidx.compose.foundation.text.selection.CrossStatus.CROSSED);
                return snapToWordBoundary;
            }
        });
        if (selectableInfo.getSelectableId() != anchorInfo.getSelectableId()) {
            return updateSelectionBoundary$lambda$1(lazy2);
        }
        int rawPreviousHandleOffset = selectableInfo.getRawPreviousHandleOffset();
        if (rawStartHandleOffset == rawPreviousHandleOffset) {
            return anchorInfo;
        }
        if (updateSelectionBoundary$lambda$0(lazy) != selectableInfo.getTextLayoutResult().getLineForOffset(rawPreviousHandleOffset)) {
            return updateSelectionBoundary$lambda$1(lazy2);
        }
        int offset = anchorInfo.getOffset();
        long m3938getWordBoundaryjx7JFs = selectableInfo.getTextLayoutResult().m3938getWordBoundaryjx7JFs(offset);
        if (!isExpanding(selectableInfo, rawStartHandleOffset, selectionLayout.getIsStartHandle())) {
            return selectableInfo.anchorForOffset(rawStartHandleOffset);
        }
        if (offset == androidx.compose.ui.text.TextRange.m3964getStartimpl(m3938getWordBoundaryjx7JFs) || offset == androidx.compose.ui.text.TextRange.m3959getEndimpl(m3938getWordBoundaryjx7JFs)) {
            return updateSelectionBoundary$lambda$1(lazy2);
        }
        return selectableInfo.anchorForOffset(rawStartHandleOffset);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int updateSelectionBoundary$lambda$0(kotlin.Lazy<java.lang.Integer> lazy) {
        return lazy.getValue().intValue();
    }

    private static final androidx.compose.foundation.text.selection.Selection.AnchorInfo updateSelectionBoundary$lambda$1(kotlin.Lazy<androidx.compose.foundation.text.selection.Selection.AnchorInfo> lazy) {
        return lazy.getValue();
    }

    private static final boolean isExpanding(androidx.compose.foundation.text.selection.SelectableInfo selectableInfo, int i, boolean z) {
        if (selectableInfo.getRawPreviousHandleOffset() == -1) {
            return true;
        }
        if (i == selectableInfo.getRawPreviousHandleOffset()) {
            return false;
        }
        if (z ^ (selectableInfo.getRawCrossStatus() == androidx.compose.foundation.text.selection.CrossStatus.CROSSED)) {
            if (i < selectableInfo.getRawPreviousHandleOffset()) {
                return true;
            }
        } else if (i > selectableInfo.getRawPreviousHandleOffset()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.foundation.text.selection.Selection.AnchorInfo snapToWordBoundary(androidx.compose.foundation.text.selection.SelectableInfo selectableInfo, int i, int i2, int i3, boolean z, boolean z2) {
        int lineStart;
        int lineEnd$default;
        long m3938getWordBoundaryjx7JFs = selectableInfo.getTextLayoutResult().m3938getWordBoundaryjx7JFs(i2);
        if (selectableInfo.getTextLayoutResult().getLineForOffset(androidx.compose.ui.text.TextRange.m3964getStartimpl(m3938getWordBoundaryjx7JFs)) == i) {
            lineStart = androidx.compose.ui.text.TextRange.m3964getStartimpl(m3938getWordBoundaryjx7JFs);
        } else if (i >= selectableInfo.getTextLayoutResult().getLineCount()) {
            lineStart = selectableInfo.getTextLayoutResult().getLineStart(selectableInfo.getTextLayoutResult().getLineCount() - 1);
        } else {
            lineStart = selectableInfo.getTextLayoutResult().getLineStart(i);
        }
        if (selectableInfo.getTextLayoutResult().getLineForOffset(androidx.compose.ui.text.TextRange.m3959getEndimpl(m3938getWordBoundaryjx7JFs)) == i) {
            lineEnd$default = androidx.compose.ui.text.TextRange.m3959getEndimpl(m3938getWordBoundaryjx7JFs);
        } else if (i >= selectableInfo.getTextLayoutResult().getLineCount()) {
            lineEnd$default = androidx.compose.ui.text.TextLayoutResult.getLineEnd$default(selectableInfo.getTextLayoutResult(), selectableInfo.getTextLayoutResult().getLineCount() - 1, false, 2, null);
        } else {
            lineEnd$default = androidx.compose.ui.text.TextLayoutResult.getLineEnd$default(selectableInfo.getTextLayoutResult(), i, false, 2, null);
        }
        if (lineStart == i3) {
            return selectableInfo.anchorForOffset(lineEnd$default);
        }
        if (lineEnd$default == i3) {
            return selectableInfo.anchorForOffset(lineStart);
        }
        if (!(z ^ z2) ? i2 >= lineStart : i2 > lineEnd$default) {
            lineStart = lineEnd$default;
        }
        return selectableInfo.anchorForOffset(lineStart);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.foundation.text.selection.Selection adjustToBoundaries(androidx.compose.foundation.text.selection.SelectionLayout selectionLayout, androidx.compose.foundation.text.selection.BoundaryFunction boundaryFunction) {
        boolean z = selectionLayout.getCrossStatus() == androidx.compose.foundation.text.selection.CrossStatus.CROSSED;
        return new androidx.compose.foundation.text.selection.Selection(anchorOnBoundary(selectionLayout.getStartInfo(), z, true, selectionLayout.getStartSlot(), boundaryFunction), anchorOnBoundary(selectionLayout.getEndInfo(), z, false, selectionLayout.getEndSlot(), boundaryFunction), z);
    }

    private static final androidx.compose.foundation.text.selection.Selection.AnchorInfo anchorOnBoundary(androidx.compose.foundation.text.selection.SelectableInfo selectableInfo, boolean z, boolean z2, int i, androidx.compose.foundation.text.selection.BoundaryFunction boundaryFunction) {
        int rawStartHandleOffset = z2 ? selectableInfo.getRawStartHandleOffset() : selectableInfo.getRawEndHandleOffset();
        if (i != selectableInfo.getSlot()) {
            return selectableInfo.anchorForOffset(rawStartHandleOffset);
        }
        long mo1001getBoundaryfzxv0v0 = boundaryFunction.mo1001getBoundaryfzxv0v0(selectableInfo, rawStartHandleOffset);
        return selectableInfo.anchorForOffset(z ^ z2 ? androidx.compose.ui.text.TextRange.m3964getStartimpl(mo1001getBoundaryfzxv0v0) : androidx.compose.ui.text.TextRange.m3959getEndimpl(mo1001getBoundaryfzxv0v0));
    }

    public static final androidx.compose.foundation.text.selection.Selection ensureAtLeastOneChar(androidx.compose.foundation.text.selection.Selection selection, androidx.compose.foundation.text.selection.SelectionLayout selectionLayout) {
        if (androidx.compose.foundation.text.selection.SelectionLayoutKt.isCollapsed(selection, selectionLayout)) {
            return (selectionLayout.getSize() > 1 || selectionLayout.getPreviousSelection() == null || selectionLayout.getInfo().getInputText().length() == 0) ? selection : expandOneChar(selection, selectionLayout);
        }
        return selection;
    }

    private static final androidx.compose.foundation.text.selection.Selection expandOneChar(androidx.compose.foundation.text.selection.Selection selection, androidx.compose.foundation.text.selection.SelectionLayout selectionLayout) {
        int findFollowingBreak;
        androidx.compose.foundation.text.selection.SelectableInfo info = selectionLayout.getInfo();
        java.lang.String inputText = info.getInputText();
        int rawStartHandleOffset = info.getRawStartHandleOffset();
        int length = inputText.length();
        if (rawStartHandleOffset == 0) {
            int findFollowingBreak2 = androidx.compose.foundation.text.StringHelpers_androidKt.findFollowingBreak(inputText, 0);
            if (selectionLayout.getIsStartHandle()) {
                return androidx.compose.foundation.text.selection.Selection.copy$default(selection, changeOffset(selection.getStart(), info, findFollowingBreak2), null, true, 2, null);
            }
            return androidx.compose.foundation.text.selection.Selection.copy$default(selection, null, changeOffset(selection.getEnd(), info, findFollowingBreak2), false, 1, null);
        }
        if (rawStartHandleOffset == length) {
            int findPrecedingBreak = androidx.compose.foundation.text.StringHelpers_androidKt.findPrecedingBreak(inputText, length);
            if (selectionLayout.getIsStartHandle()) {
                return androidx.compose.foundation.text.selection.Selection.copy$default(selection, changeOffset(selection.getStart(), info, findPrecedingBreak), null, false, 2, null);
            }
            return androidx.compose.foundation.text.selection.Selection.copy$default(selection, null, changeOffset(selection.getEnd(), info, findPrecedingBreak), true, 1, null);
        }
        androidx.compose.foundation.text.selection.Selection previousSelection = selectionLayout.getPreviousSelection();
        boolean z = previousSelection != null && previousSelection.getHandlesCrossed();
        if (selectionLayout.getIsStartHandle() ^ z) {
            findFollowingBreak = androidx.compose.foundation.text.StringHelpers_androidKt.findPrecedingBreak(inputText, rawStartHandleOffset);
        } else {
            findFollowingBreak = androidx.compose.foundation.text.StringHelpers_androidKt.findFollowingBreak(inputText, rawStartHandleOffset);
        }
        if (selectionLayout.getIsStartHandle()) {
            return androidx.compose.foundation.text.selection.Selection.copy$default(selection, changeOffset(selection.getStart(), info, findFollowingBreak), null, z, 2, null);
        }
        return androidx.compose.foundation.text.selection.Selection.copy$default(selection, null, changeOffset(selection.getEnd(), info, findFollowingBreak), z, 1, null);
    }

    private static final androidx.compose.foundation.text.selection.Selection.AnchorInfo changeOffset(androidx.compose.foundation.text.selection.Selection.AnchorInfo anchorInfo, androidx.compose.foundation.text.selection.SelectableInfo selectableInfo, int i) {
        return androidx.compose.foundation.text.selection.Selection.AnchorInfo.copy$default(anchorInfo, selectableInfo.getTextLayoutResult().getBidiRunDirection(i), i, 0L, 4, null);
    }
}
