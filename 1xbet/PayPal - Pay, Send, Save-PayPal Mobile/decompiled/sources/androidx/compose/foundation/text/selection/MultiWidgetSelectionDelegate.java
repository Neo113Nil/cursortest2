package androidx.compose.foundation.text.selection;

@kotlin.Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0011\u0010\u001a\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0011\u0010\u001c\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020&2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020&2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b)\u0010(J\u0017\u0010*\u001a\u00020&2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b*\u0010(J\u0017\u0010.\u001a\u00020+2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010/\u001a\u00020!H\u0016¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020&2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b1\u0010(R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u00102\u001a\u0004\b3\u00104R\u001c\u00107\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u001c\u00108\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b7\u00106R\u0018\u00105\u001a\u000609j\u0002`:8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0018\u0010=\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010;\u001a\u00020!8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b8\u0010?R\u0018\u0010A\u001a\u00020!*\u00020\u00078CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b7\u0010@"}, d2 = {"Landroidx/compose/foundation/text/selection/MultiWidgetSelectionDelegate;", "Landroidx/compose/foundation/text/selection/Selectable;", "", "selectableId", "Lkotlin/Function0;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinatesCallback", "Landroidx/compose/ui/text/TextLayoutResult;", "layoutResultCallback", "<init>", "(JLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "Landroidx/compose/foundation/text/selection/SelectionLayoutBuilder;", "builder", "", "appendSelectableInfoToBuilder", "(Landroidx/compose/foundation/text/selection/SelectionLayoutBuilder;)V", "Landroidx/compose/foundation/text/selection/Selection;", "getSelectAllSelection", "()Landroidx/compose/foundation/text/selection/Selection;", "selection", "", "isStartHandle", "Landroidx/compose/ui/geometry/Offset;", "getHandlePosition-dBAh8RU", "(Landroidx/compose/foundation/text/selection/Selection;Z)J", "getHandlePosition", "getLayoutCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "textLayoutResult", "()Landroidx/compose/ui/text/TextLayoutResult;", "Landroidx/compose/ui/text/AnnotatedString;", "getText", "()Landroidx/compose/ui/text/AnnotatedString;", "", "offset", "Landroidx/compose/ui/geometry/Rect;", "getBoundingBox", "(I)Landroidx/compose/ui/geometry/Rect;", "", "getLineLeft", "(I)F", "getLineRight", "getCenterYForOffset", "Landroidx/compose/ui/text/TextRange;", "getRangeOfLineContaining--jx7JFs", "(I)J", "getRangeOfLineContaining", "getLastVisibleOffset", "()I", "getLineHeight", "J", "getSelectableId", "()J", "Camera2StreamConfigurationMap", "Lkotlin/jvm/functions/Function0;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRanges", "", "Landroidx/compose/foundation/platform/SynchronizedObject;", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/ui/text/TextLayoutResult;", com.visa.cbp.getEncExpo.warmup, "(Landroidx/compose/ui/text/TextLayoutResult;)I", "getInputSizeshNQ4ISI"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MultiWidgetSelectionDelegate implements androidx.compose.foundation.text.selection.Selectable {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function0<androidx.compose.ui.layout.LayoutCoordinates> getHighSpeedVideoSizes;
    private androidx.compose.ui.text.TextLayoutResult getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function0<androidx.compose.ui.text.TextLayoutResult> getHighSpeedVideoFpsRanges;
    private final long selectableId;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.lang.Object Camera2StreamConfigurationMap = this;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private int getHighSpeedVideoFpsRangesFor = -1;

    /* JADX WARN: Multi-variable type inference failed */
    public MultiWidgetSelectionDelegate(long j, kotlin.jvm.functions.Function0<? extends androidx.compose.ui.layout.LayoutCoordinates> function0, kotlin.jvm.functions.Function0<androidx.compose.ui.text.TextLayoutResult> function02) {
        this.selectableId = j;
        this.getHighSpeedVideoSizes = function0;
        this.getHighSpeedVideoFpsRanges = function02;
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public final long getSelectableId() {
        return this.selectableId;
    }

    private final int getHighSpeedVideoSizes(androidx.compose.ui.text.TextLayoutResult textLayoutResult) {
        int i;
        int lineCount;
        synchronized (this.Camera2StreamConfigurationMap) {
            if (this.getHighResolutionOutputSizeshNQ4ISI != textLayoutResult) {
                if (textLayoutResult.getDidOverflowHeight() && !textLayoutResult.getMultiParagraph().getDidExceedMaxLines()) {
                    int coerceAtMost = kotlin.ranges.RangesKt.coerceAtMost(textLayoutResult.getLineForVerticalPosition((int) (textLayoutResult.getSize() & 4294967295L)), textLayoutResult.getLineCount() - 1);
                    while (coerceAtMost >= 0 && textLayoutResult.getLineTop(coerceAtMost) >= ((int) (textLayoutResult.getSize() & 4294967295L))) {
                        coerceAtMost--;
                    }
                    lineCount = kotlin.ranges.RangesKt.coerceAtLeast(coerceAtMost, 0);
                    this.getHighSpeedVideoFpsRangesFor = textLayoutResult.getLineEnd(lineCount, true);
                    this.getHighResolutionOutputSizeshNQ4ISI = textLayoutResult;
                }
                lineCount = textLayoutResult.getLineCount() - 1;
                this.getHighSpeedVideoFpsRangesFor = textLayoutResult.getLineEnd(lineCount, true);
                this.getHighResolutionOutputSizeshNQ4ISI = textLayoutResult;
            }
            i = this.getHighSpeedVideoFpsRangesFor;
        }
        return i;
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public final void appendSelectableInfoToBuilder(androidx.compose.foundation.text.selection.SelectionLayoutBuilder builder) {
        androidx.compose.ui.text.TextLayoutResult invoke;
        long m5756minusMKHz9U;
        androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates = getLayoutCoordinates();
        if (layoutCoordinates == null || (invoke = this.getHighSpeedVideoFpsRanges.invoke()) == null) {
            return;
        }
        long mo7362localPositionOfR5De75A = builder.getContainerCoordinates().mo7362localPositionOfR5De75A(layoutCoordinates, androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0());
        long m5756minusMKHz9U2 = androidx.compose.ui.geometry.Offset.m5756minusMKHz9U(builder.getCurrentPosition(), mo7362localPositionOfR5De75A);
        if ((builder.getPreviousHandlePosition() & 9223372034707292159L) == androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats) {
            m5756minusMKHz9U = androidx.compose.ui.geometry.Offset.INSTANCE.m5767getUnspecifiedF1C5BW0();
        } else {
            m5756minusMKHz9U = androidx.compose.ui.geometry.Offset.m5756minusMKHz9U(builder.getPreviousHandlePosition(), mo7362localPositionOfR5De75A);
        }
        androidx.compose.foundation.text.selection.MultiWidgetSelectionDelegateKt.m2376appendSelectableInfoParwq6A(builder, invoke, m5756minusMKHz9U2, m5756minusMKHz9U, getSelectableId());
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public final androidx.compose.foundation.text.selection.Selection getSelectAllSelection() {
        androidx.compose.ui.text.TextLayoutResult invoke = this.getHighSpeedVideoFpsRanges.invoke();
        if (invoke == null) {
            return null;
        }
        int length = invoke.getLayoutInput().getText().length();
        return new androidx.compose.foundation.text.selection.Selection(new androidx.compose.foundation.text.selection.Selection.AnchorInfo(invoke.getBidiRunDirection(0), 0, getSelectableId()), new androidx.compose.foundation.text.selection.Selection.AnchorInfo(invoke.getBidiRunDirection(java.lang.Math.max(length - 1, 0)), length, getSelectableId()), false);
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    /* renamed from: getHandlePosition-dBAh8RU, reason: not valid java name */
    public final long mo2374getHandlePositiondBAh8RU(androidx.compose.foundation.text.selection.Selection selection, boolean isStartHandle) {
        androidx.compose.ui.text.TextLayoutResult invoke;
        if ((isStartHandle && selection.getStart().getSelectableId() != getSelectableId()) || (!isStartHandle && selection.getEnd().getSelectableId() != getSelectableId())) {
            return androidx.compose.ui.geometry.Offset.INSTANCE.m5767getUnspecifiedF1C5BW0();
        }
        if (getLayoutCoordinates() != null && (invoke = this.getHighSpeedVideoFpsRanges.invoke()) != null) {
            return androidx.compose.foundation.text.selection.TextSelectionDelegateKt.getSelectionHandleCoordinates(invoke, kotlin.ranges.RangesKt.coerceIn((isStartHandle ? selection.getStart() : selection.getEnd()).getOffset(), 0, getHighSpeedVideoSizes(invoke)), isStartHandle, selection.getHandlesCrossed());
        }
        return androidx.compose.ui.geometry.Offset.INSTANCE.m5767getUnspecifiedF1C5BW0();
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public final androidx.compose.ui.layout.LayoutCoordinates getLayoutCoordinates() {
        androidx.compose.ui.layout.LayoutCoordinates invoke = this.getHighSpeedVideoSizes.invoke();
        if (invoke == null || !invoke.isAttached()) {
            return null;
        }
        return invoke;
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public final androidx.compose.ui.text.TextLayoutResult textLayoutResult() {
        return this.getHighSpeedVideoFpsRanges.invoke();
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public final androidx.compose.ui.text.AnnotatedString getText() {
        androidx.compose.ui.text.TextLayoutResult invoke = this.getHighSpeedVideoFpsRanges.invoke();
        return invoke == null ? new androidx.compose.ui.text.AnnotatedString("", null, 2, null) : invoke.getLayoutInput().getText();
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public final androidx.compose.ui.geometry.Rect getBoundingBox(int offset) {
        androidx.compose.ui.text.TextLayoutResult invoke = this.getHighSpeedVideoFpsRanges.invoke();
        if (invoke == null) {
            return androidx.compose.ui.geometry.Rect.INSTANCE.getZero();
        }
        int length = invoke.getLayoutInput().getText().length();
        if (length <= 0) {
            return androidx.compose.ui.geometry.Rect.INSTANCE.getZero();
        }
        return invoke.getBoundingBox(kotlin.ranges.RangesKt.coerceIn(offset, 0, length - 1));
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public final float getLineLeft(int offset) {
        int lineForOffset;
        androidx.compose.ui.text.TextLayoutResult invoke = this.getHighSpeedVideoFpsRanges.invoke();
        if (invoke != null && (lineForOffset = invoke.getLineForOffset(offset)) < invoke.getLineCount()) {
            return invoke.getLineLeft(lineForOffset);
        }
        return -1.0f;
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public final float getLineRight(int offset) {
        int lineForOffset;
        androidx.compose.ui.text.TextLayoutResult invoke = this.getHighSpeedVideoFpsRanges.invoke();
        if (invoke != null && (lineForOffset = invoke.getLineForOffset(offset)) < invoke.getLineCount()) {
            return invoke.getLineRight(lineForOffset);
        }
        return -1.0f;
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public final float getCenterYForOffset(int offset) {
        int lineForOffset;
        androidx.compose.ui.text.TextLayoutResult invoke = this.getHighSpeedVideoFpsRanges.invoke();
        if (invoke == null || (lineForOffset = invoke.getLineForOffset(offset)) >= invoke.getLineCount()) {
            return -1.0f;
        }
        float lineTop = invoke.getLineTop(lineForOffset);
        return ((invoke.getLineBottom(lineForOffset) - lineTop) / 2.0f) + lineTop;
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    /* renamed from: getRangeOfLineContaining--jx7JFs, reason: not valid java name */
    public final long mo2375getRangeOfLineContainingjx7JFs(int offset) {
        androidx.compose.ui.text.TextLayoutResult invoke = this.getHighSpeedVideoFpsRanges.invoke();
        if (invoke == null) {
            return androidx.compose.ui.text.TextRange.INSTANCE.m8044getZerod9O1mEE();
        }
        int highSpeedVideoSizes = getHighSpeedVideoSizes(invoke);
        if (highSpeedVideoSizes <= 0) {
            return androidx.compose.ui.text.TextRange.INSTANCE.m8044getZerod9O1mEE();
        }
        int lineForOffset = invoke.getLineForOffset(kotlin.ranges.RangesKt.coerceIn(offset, 0, highSpeedVideoSizes - 1));
        return androidx.compose.ui.text.TextRangeKt.TextRange(invoke.getLineStart(lineForOffset), invoke.getLineEnd(lineForOffset, true));
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public final int getLastVisibleOffset() {
        androidx.compose.ui.text.TextLayoutResult invoke = this.getHighSpeedVideoFpsRanges.invoke();
        if (invoke == null) {
            return 0;
        }
        return getHighSpeedVideoSizes(invoke);
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public final float getLineHeight(int offset) {
        androidx.compose.ui.text.TextLayoutResult invoke = this.getHighSpeedVideoFpsRanges.invoke();
        if (invoke != null) {
            return androidx.compose.foundation.text.TextLayoutHelperKt.getLineHeight(invoke, offset);
        }
        return 0.0f;
    }
}
