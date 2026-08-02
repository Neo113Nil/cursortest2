package androidx.compose.foundation.text.selection;

@kotlin.Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0001H\u0002\u001a\u001c\u0010\u0006\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007H\u0002\u001a4\u0010\u000b\u001a\u00020\u0001*\u00020\u00042\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0007H\u0002\u001a\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0014H\u0002\u001a,\u0010\u0015\u001a\u00020\u0001*\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002\u001a\u0014\u0010\u0017\u001a\u00020\u0011*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0002H\u0000\u001a\u0014\u0010\u0018\u001a\u00020\u0011*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0002H\u0002\u001a\u001c\u0010\u0019\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\tH\u0002¨\u0006\u001b²\u0006\n\u0010\u001c\u001a\u00020\tX\u008a\u0084\u0002²\u0006\n\u0010\u001d\u001a\u00020\u0001X\u008a\u0084\u0002"}, d2 = {"updateSelectionBoundary", "Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;", "Landroidx/compose/foundation/text/selection/SelectionLayout;", "info", "Landroidx/compose/foundation/text/selection/SelectableInfo;", "previousSelectionAnchor", "isExpanding", "", "currentRawOffset", "", "isStart", "snapToWordBoundary", "currentLine", "currentOffset", "otherOffset", "crossed", "adjustToBoundaries", "Landroidx/compose/foundation/text/selection/Selection;", androidx.window.reflection.WindowExtensionsConstants.LAYOUT_PACKAGE, "boundaryFunction", "Landroidx/compose/foundation/text/selection/BoundaryFunction;", "anchorOnBoundary", "slot", "ensureAtLeastOneChar", "expandOneChar", "changeOffset", "newOffset", "foundation", "currentRawLine", "anchorSnappedToWordBoundary"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SelectionAdjustmentKt {
    private static final androidx.compose.foundation.text.selection.Selection.AnchorInfo getHighSpeedVideoFpsRangesFor(androidx.compose.foundation.text.selection.SelectableInfo selectableInfo, boolean z, boolean z2, int i, androidx.compose.foundation.text.selection.BoundaryFunction boundaryFunction) {
        int rawStartHandleOffset = z2 ? selectableInfo.getRawStartHandleOffset() : selectableInfo.getRawEndHandleOffset();
        if (i != selectableInfo.getSlot()) {
            return selectableInfo.anchorForOffset(rawStartHandleOffset);
        }
        long highSpeedVideoFpsRangesFor = boundaryFunction.getHighSpeedVideoFpsRangesFor(selectableInfo, rawStartHandleOffset);
        return selectableInfo.anchorForOffset(z ^ z2 ? androidx.compose.ui.text.TextRange.m8039getStartimpl(highSpeedVideoFpsRangesFor) : androidx.compose.ui.text.TextRange.m8034getEndimpl(highSpeedVideoFpsRangesFor));
    }

    public static final androidx.compose.foundation.text.selection.Selection ensureAtLeastOneChar(androidx.compose.foundation.text.selection.Selection selection, androidx.compose.foundation.text.selection.SelectionLayout selectionLayout) {
        int findFollowingBreak;
        if (!androidx.compose.foundation.text.selection.SelectionLayoutKt.isCollapsed(selection, selectionLayout)) {
            return selection;
        }
        java.lang.String inputText = selectionLayout.getGetHighSpeedVideoSizes().getInputText();
        if (selectionLayout.getSize() > 1 || selectionLayout.getGetOutputMinFrameDuration() == null || inputText.length() == 0) {
            return selection;
        }
        androidx.compose.foundation.text.selection.SelectableInfo getHighSpeedVideoSizes = selectionLayout.getGetHighSpeedVideoSizes();
        java.lang.String inputText2 = getHighSpeedVideoSizes.getInputText();
        int rawStartHandleOffset = getHighSpeedVideoSizes.getRawStartHandleOffset();
        int length = inputText2.length();
        if (rawStartHandleOffset == 0) {
            int findFollowingBreak2 = androidx.compose.foundation.text.StringHelpers_androidKt.findFollowingBreak(inputText2, 0);
            if (selectionLayout.getGetHighSpeedVideoSizes()) {
                return androidx.compose.foundation.text.selection.Selection.copy$default(selection, androidx.compose.foundation.text.selection.Selection.AnchorInfo.copy$default(selection.getStart(), getHighSpeedVideoSizes.getTextLayoutResult().getBidiRunDirection(findFollowingBreak2), findFollowingBreak2, 0L, 4, null), null, true, 2, null);
            }
            return androidx.compose.foundation.text.selection.Selection.copy$default(selection, null, androidx.compose.foundation.text.selection.Selection.AnchorInfo.copy$default(selection.getEnd(), getHighSpeedVideoSizes.getTextLayoutResult().getBidiRunDirection(findFollowingBreak2), findFollowingBreak2, 0L, 4, null), false, 1, null);
        }
        if (rawStartHandleOffset == length) {
            int findPrecedingBreak = androidx.compose.foundation.text.StringHelpers_androidKt.findPrecedingBreak(inputText2, length);
            if (selectionLayout.getGetHighSpeedVideoSizes()) {
                return androidx.compose.foundation.text.selection.Selection.copy$default(selection, androidx.compose.foundation.text.selection.Selection.AnchorInfo.copy$default(selection.getStart(), getHighSpeedVideoSizes.getTextLayoutResult().getBidiRunDirection(findPrecedingBreak), findPrecedingBreak, 0L, 4, null), null, false, 2, null);
            }
            return androidx.compose.foundation.text.selection.Selection.copy$default(selection, null, androidx.compose.foundation.text.selection.Selection.AnchorInfo.copy$default(selection.getEnd(), getHighSpeedVideoSizes.getTextLayoutResult().getBidiRunDirection(findPrecedingBreak), findPrecedingBreak, 0L, 4, null), true, 1, null);
        }
        androidx.compose.foundation.text.selection.Selection getOutputMinFrameDuration = selectionLayout.getGetOutputMinFrameDuration();
        boolean z = getOutputMinFrameDuration != null && getOutputMinFrameDuration.getHandlesCrossed();
        if (selectionLayout.getGetHighSpeedVideoSizes() ^ z) {
            findFollowingBreak = androidx.compose.foundation.text.StringHelpers_androidKt.findPrecedingBreak(inputText2, rawStartHandleOffset);
        } else {
            findFollowingBreak = androidx.compose.foundation.text.StringHelpers_androidKt.findFollowingBreak(inputText2, rawStartHandleOffset);
        }
        int i = findFollowingBreak;
        if (selectionLayout.getGetHighSpeedVideoSizes()) {
            return androidx.compose.foundation.text.selection.Selection.copy$default(selection, androidx.compose.foundation.text.selection.Selection.AnchorInfo.copy$default(selection.getStart(), getHighSpeedVideoSizes.getTextLayoutResult().getBidiRunDirection(i), i, 0L, 4, null), null, z, 2, null);
        }
        return androidx.compose.foundation.text.selection.Selection.copy$default(selection, null, androidx.compose.foundation.text.selection.Selection.AnchorInfo.copy$default(selection.getEnd(), getHighSpeedVideoSizes.getTextLayoutResult().getBidiRunDirection(i), i, 0L, 4, null), z, 1, null);
    }

    public static /* synthetic */ androidx.compose.foundation.text.selection.Selection.AnchorInfo $r8$lambda$detVHnvfDg_kJt37Iwhx7np8h1Y(androidx.compose.foundation.text.selection.SelectableInfo selectableInfo, int i, int i2, androidx.compose.foundation.text.selection.SelectionLayout selectionLayout, kotlin.Lazy lazy) {
        int lineStart;
        int lineEnd$default;
        int intValue = ((java.lang.Number) lazy.getValue()).intValue();
        boolean getHighSpeedVideoSizes = selectionLayout.getGetHighSpeedVideoSizes();
        boolean z = selectionLayout.getCrossStatus() == androidx.compose.foundation.text.selection.CrossStatus.CROSSED;
        long m8013getWordBoundaryjx7JFs = selectableInfo.getTextLayoutResult().m8013getWordBoundaryjx7JFs(i);
        if (selectableInfo.getTextLayoutResult().getLineForOffset(androidx.compose.ui.text.TextRange.m8039getStartimpl(m8013getWordBoundaryjx7JFs)) == intValue) {
            lineStart = androidx.compose.ui.text.TextRange.m8039getStartimpl(m8013getWordBoundaryjx7JFs);
        } else if (intValue >= selectableInfo.getTextLayoutResult().getLineCount()) {
            lineStart = selectableInfo.getTextLayoutResult().getLineStart(selectableInfo.getTextLayoutResult().getLineCount() - 1);
        } else {
            lineStart = selectableInfo.getTextLayoutResult().getLineStart(intValue);
        }
        if (selectableInfo.getTextLayoutResult().getLineForOffset(androidx.compose.ui.text.TextRange.m8034getEndimpl(m8013getWordBoundaryjx7JFs)) == intValue) {
            lineEnd$default = androidx.compose.ui.text.TextRange.m8034getEndimpl(m8013getWordBoundaryjx7JFs);
        } else if (intValue >= selectableInfo.getTextLayoutResult().getLineCount()) {
            lineEnd$default = androidx.compose.ui.text.TextLayoutResult.getLineEnd$default(selectableInfo.getTextLayoutResult(), selectableInfo.getTextLayoutResult().getLineCount() - 1, false, 2, null);
        } else {
            lineEnd$default = androidx.compose.ui.text.TextLayoutResult.getLineEnd$default(selectableInfo.getTextLayoutResult(), intValue, false, 2, null);
        }
        if (lineStart == i2) {
            return selectableInfo.anchorForOffset(lineEnd$default);
        }
        if (lineEnd$default == i2) {
            return selectableInfo.anchorForOffset(lineStart);
        }
        if (!(getHighSpeedVideoSizes ^ z) ? i >= lineStart : i > lineEnd$default) {
            lineStart = lineEnd$default;
        }
        return selectableInfo.anchorForOffset(lineStart);
    }

    public static final /* synthetic */ androidx.compose.foundation.text.selection.Selection access$adjustToBoundaries(androidx.compose.foundation.text.selection.SelectionLayout selectionLayout, androidx.compose.foundation.text.selection.BoundaryFunction boundaryFunction) {
        boolean z = selectionLayout.getCrossStatus() == androidx.compose.foundation.text.selection.CrossStatus.CROSSED;
        return new androidx.compose.foundation.text.selection.Selection(getHighSpeedVideoFpsRangesFor(selectionLayout.getStartInfo(), z, true, selectionLayout.getGetHighResolutionOutputSizeshNQ4ISI(), boundaryFunction), getHighSpeedVideoFpsRangesFor(selectionLayout.getEndInfo(), z, false, selectionLayout.getGetHighSpeedVideoFpsRangesFor(), boundaryFunction), z);
    }

    public static final /* synthetic */ androidx.compose.foundation.text.selection.Selection.AnchorInfo access$updateSelectionBoundary(final androidx.compose.foundation.text.selection.SelectionLayout selectionLayout, final androidx.compose.foundation.text.selection.SelectableInfo selectableInfo, androidx.compose.foundation.text.selection.Selection.AnchorInfo anchorInfo) {
        final int rawStartHandleOffset = selectionLayout.getGetHighSpeedVideoSizes() ? selectableInfo.getRawStartHandleOffset() : selectableInfo.getRawEndHandleOffset();
        if ((selectionLayout.getGetHighSpeedVideoSizes() ? selectionLayout.getGetHighResolutionOutputSizeshNQ4ISI() : selectionLayout.getGetHighSpeedVideoFpsRangesFor()) != selectableInfo.getSlot()) {
            return selectableInfo.anchorForOffset(rawStartHandleOffset);
        }
        final kotlin.Lazy lazy = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.NONE, new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.text.selection.SelectionAdjustmentKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                int lineForOffset;
                lineForOffset = androidx.compose.foundation.text.selection.SelectableInfo.this.getTextLayoutResult().getLineForOffset(rawStartHandleOffset);
                return java.lang.Integer.valueOf(lineForOffset);
            }
        });
        final int rawEndHandleOffset = selectionLayout.getGetHighSpeedVideoSizes() ? selectableInfo.getRawEndHandleOffset() : selectableInfo.getRawStartHandleOffset();
        final int i = rawStartHandleOffset;
        kotlin.Lazy lazy2 = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.NONE, new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.text.selection.SelectionAdjustmentKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return androidx.compose.foundation.text.selection.SelectionAdjustmentKt.$r8$lambda$detVHnvfDg_kJt37Iwhx7np8h1Y(androidx.compose.foundation.text.selection.SelectableInfo.this, i, rawEndHandleOffset, selectionLayout, lazy);
            }
        });
        if (selectableInfo.getSelectableId() == anchorInfo.getSelectableId()) {
            int rawPreviousHandleOffset = selectableInfo.getRawPreviousHandleOffset();
            if (rawStartHandleOffset == rawPreviousHandleOffset) {
                return anchorInfo;
            }
            if (((java.lang.Number) lazy.getValue()).intValue() == selectableInfo.getTextLayoutResult().getLineForOffset(rawPreviousHandleOffset)) {
                int offset = anchorInfo.getOffset();
                long m8013getWordBoundaryjx7JFs = selectableInfo.getTextLayoutResult().m8013getWordBoundaryjx7JFs(offset);
                boolean getHighSpeedVideoSizes = selectionLayout.getGetHighSpeedVideoSizes();
                if (selectableInfo.getRawPreviousHandleOffset() != -1) {
                    if (rawStartHandleOffset != selectableInfo.getRawPreviousHandleOffset()) {
                        if (!(getHighSpeedVideoSizes ^ (selectableInfo.getRawCrossStatus() == androidx.compose.foundation.text.selection.CrossStatus.CROSSED))) {
                        }
                    }
                    return selectableInfo.anchorForOffset(rawStartHandleOffset);
                }
                if (offset != androidx.compose.ui.text.TextRange.m8039getStartimpl(m8013getWordBoundaryjx7JFs) && offset != androidx.compose.ui.text.TextRange.m8034getEndimpl(m8013getWordBoundaryjx7JFs)) {
                    return selectableInfo.anchorForOffset(rawStartHandleOffset);
                }
            }
        }
        return (androidx.compose.foundation.text.selection.Selection.AnchorInfo) lazy2.getValue();
    }
}
