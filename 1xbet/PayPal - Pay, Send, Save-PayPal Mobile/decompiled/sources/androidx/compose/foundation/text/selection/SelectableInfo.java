package androidx.compose.foundation.text.selection;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b#\u0010\"R\u001a\u0010\u0007\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b$\u0010\"R\u001a\u0010\b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b%\u0010\"R\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010&\u001a\u0004\b'\u0010(R\u0011\u0010*\u001a\u00020\u001a8G¢\u0006\u0006\u001a\u0004\b)\u0010\u001cR\u0011\u0010,\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b+\u0010\"R\u0011\u00100\u001a\u00020-8G¢\u0006\u0006\u001a\u0004\b.\u0010/"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectableInfo;", "", "", "selectableId", "", "slot", "rawStartHandleOffset", "rawEndHandleOffset", "rawPreviousHandleOffset", "Landroidx/compose/ui/text/TextLayoutResult;", "textLayoutResult", "<init>", "(JIIIILandroidx/compose/ui/text/TextLayoutResult;)V", "other", "", "shouldRecomputeSelection", "(Landroidx/compose/foundation/text/selection/SelectableInfo;)Z", "offset", "Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;", "anchorForOffset", "(I)Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "end", "Landroidx/compose/foundation/text/selection/Selection;", "makeSingleLayoutSelection", "(II)Landroidx/compose/foundation/text/selection/Selection;", "", "toString", "()Ljava/lang/String;", "J", "getSelectableId", "()J", com.visa.cbp.getEncExpo.warmup, "getSlot", "()I", "getRawStartHandleOffset", "getRawEndHandleOffset", "getRawPreviousHandleOffset", "Landroidx/compose/ui/text/TextLayoutResult;", "getTextLayoutResult", "()Landroidx/compose/ui/text/TextLayoutResult;", "getInputText", "inputText", "getTextLength", "textLength", "Landroidx/compose/foundation/text/selection/CrossStatus;", "getRawCrossStatus", "()Landroidx/compose/foundation/text/selection/CrossStatus;", "rawCrossStatus"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SelectableInfo {
    public static final int $stable = androidx.compose.ui.text.TextLayoutResult.$stable;
    private final int rawEndHandleOffset;
    private final int rawPreviousHandleOffset;
    private final int rawStartHandleOffset;
    private final long selectableId;
    private final int slot;
    private final androidx.compose.ui.text.TextLayoutResult textLayoutResult;

    public SelectableInfo(long j, int i, int i2, int i3, int i4, androidx.compose.ui.text.TextLayoutResult textLayoutResult) {
        this.selectableId = j;
        this.slot = i;
        this.rawStartHandleOffset = i2;
        this.rawEndHandleOffset = i3;
        this.rawPreviousHandleOffset = i4;
        this.textLayoutResult = textLayoutResult;
    }

    public final long getSelectableId() {
        return this.selectableId;
    }

    public final int getSlot() {
        return this.slot;
    }

    public final int getRawStartHandleOffset() {
        return this.rawStartHandleOffset;
    }

    public final int getRawEndHandleOffset() {
        return this.rawEndHandleOffset;
    }

    public final int getRawPreviousHandleOffset() {
        return this.rawPreviousHandleOffset;
    }

    public final androidx.compose.ui.text.TextLayoutResult getTextLayoutResult() {
        return this.textLayoutResult;
    }

    public final java.lang.String getInputText() {
        return this.textLayoutResult.getLayoutInput().getText().getText();
    }

    public final int getTextLength() {
        return getInputText().length();
    }

    public final androidx.compose.foundation.text.selection.CrossStatus getRawCrossStatus() {
        int i = this.rawStartHandleOffset;
        int i2 = this.rawEndHandleOffset;
        if (i < i2) {
            return androidx.compose.foundation.text.selection.CrossStatus.NOT_CROSSED;
        }
        if (i > i2) {
            return androidx.compose.foundation.text.selection.CrossStatus.CROSSED;
        }
        return androidx.compose.foundation.text.selection.CrossStatus.COLLAPSED;
    }

    public final boolean shouldRecomputeSelection(androidx.compose.foundation.text.selection.SelectableInfo other) {
        return (this.selectableId == other.selectableId && this.rawStartHandleOffset == other.rawStartHandleOffset && this.rawEndHandleOffset == other.rawEndHandleOffset) ? false : true;
    }

    public final androidx.compose.foundation.text.selection.Selection.AnchorInfo anchorForOffset(int offset) {
        return new androidx.compose.foundation.text.selection.Selection.AnchorInfo(androidx.compose.foundation.text.selection.SelectionHelpersKt.getTextDirectionForOffset(this.textLayoutResult, offset), offset, this.selectableId);
    }

    public final androidx.compose.foundation.text.selection.Selection makeSingleLayoutSelection(int start, int end) {
        return new androidx.compose.foundation.text.selection.Selection(anchorForOffset(start), anchorForOffset(end), start > end);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SelectionInfo(id=");
        sb.append(this.selectableId);
        sb.append(", range=(");
        sb.append(this.rawStartHandleOffset);
        sb.append('-');
        sb.append(androidx.compose.foundation.text.selection.SelectionHelpersKt.getTextDirectionForOffset(this.textLayoutResult, this.rawStartHandleOffset));
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA);
        sb.append(this.rawEndHandleOffset);
        sb.append('-');
        sb.append(androidx.compose.foundation.text.selection.SelectionHelpersKt.getTextDirectionForOffset(this.textLayoutResult, this.rawEndHandleOffset));
        sb.append("), prevOffset=");
        sb.append(this.rawPreviousHandleOffset);
        sb.append(')');
        return sb.toString();
    }
}
