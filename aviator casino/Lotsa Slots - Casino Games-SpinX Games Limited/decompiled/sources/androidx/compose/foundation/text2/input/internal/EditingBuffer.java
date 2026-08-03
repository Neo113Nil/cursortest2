package androidx.compose.foundation.text2.input.internal;

/* compiled from: EditingBuffer.kt */
@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\r\n\u0002\b\u0006\b\u0000\u0018\u0000 92\u00020\u0001:\u00019B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\bJ\u0018\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u00112\u0006\u0010+\u001a\u00020\u0011H\u0002J\u0006\u0010,\u001a\u00020)J\u0016\u0010-\u001a\u00020)2\u0006\u0010*\u001a\u00020\u00112\u0006\u0010+\u001a\u00020\u0011J\u0011\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\u0011H\u0086\u0002J\u0006\u00101\u001a\u000202J\u001e\u00103\u001a\u00020)2\u0006\u0010*\u001a\u00020\u00112\u0006\u0010+\u001a\u00020\u00112\u0006\u0010\u0002\u001a\u000204J\u0016\u00105\u001a\u00020)2\u0006\u0010*\u001a\u00020\u00112\u0006\u0010+\u001a\u00020\u0011J\u0016\u00106\u001a\u00020)2\u0006\u0010*\u001a\u00020\u00112\u0006\u0010+\u001a\u00020\u0011J\u0006\u00107\u001a\u00020\u0007J\b\u00108\u001a\u00020\u0003H\u0016R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00058Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0011@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0011@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R$\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00118F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u001d\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00058Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R$\u0010\"\u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u0011@BX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0014\"\u0004\b$\u0010\u001aR$\u0010%\u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u0011@BX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0014\"\u0004\b'\u0010\u001a\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006:"}, d2 = {"Landroidx/compose/foundation/text2/input/internal/EditingBuffer;", "", "text", "", "selection", "Landroidx/compose/ui/text/TextRange;", "(Ljava/lang/String;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/text/AnnotatedString;", "(Landroidx/compose/ui/text/AnnotatedString;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "changeTracker", "Landroidx/compose/foundation/text2/input/internal/ChangeTracker;", "getChangeTracker", "()Landroidx/compose/foundation/text2/input/internal/ChangeTracker;", "composition", "getComposition-MzsxiRA", "()Landroidx/compose/ui/text/TextRange;", "<set-?>", "", "compositionEnd", "getCompositionEnd", "()I", "compositionStart", "getCompositionStart", com.helpshift.user.UserConstants.POLLING_CURSOR, "getCursor", "setCursor", "(I)V", "gapBuffer", "Landroidx/compose/foundation/text2/input/internal/PartialGapBuffer;", "length", "getLength", "getSelection-d9O1mEE", "()J", "value", "selectionEnd", "getSelectionEnd", "setSelectionEnd", "selectionStart", "getSelectionStart", "setSelectionStart", "checkRange", "", "start", "end", "commitComposition", "delete", "get", "", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "hasComposition", "", "replace", "", "setComposition", "setSelection", "toAnnotatedString", "toString", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class EditingBuffer {
    public static final int NOWHERE = -1;
    private final androidx.compose.foundation.text2.input.internal.ChangeTracker changeTracker;
    private int compositionEnd;
    private int compositionStart;
    private final androidx.compose.foundation.text2.input.internal.PartialGapBuffer gapBuffer;
    private int selectionEnd;
    private int selectionStart;
    public static final int $stable = 8;

    public /* synthetic */ EditingBuffer(androidx.compose.ui.text.AnnotatedString annotatedString, long j, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, j);
    }

    public /* synthetic */ EditingBuffer(java.lang.String str, long j, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j);
    }

    private EditingBuffer(androidx.compose.ui.text.AnnotatedString annotatedString, long j) {
        this.gapBuffer = new androidx.compose.foundation.text2.input.internal.PartialGapBuffer(annotatedString.getText());
        this.changeTracker = new androidx.compose.foundation.text2.input.internal.ChangeTracker(null, 1, null);
        this.selectionStart = androidx.compose.ui.text.TextRange.m3964getStartimpl(j);
        this.selectionEnd = androidx.compose.ui.text.TextRange.m3959getEndimpl(j);
        this.compositionStart = -1;
        this.compositionEnd = -1;
        checkRange(androidx.compose.ui.text.TextRange.m3964getStartimpl(j), androidx.compose.ui.text.TextRange.m3959getEndimpl(j));
    }

    public final androidx.compose.foundation.text2.input.internal.ChangeTracker getChangeTracker() {
        return this.changeTracker;
    }

    public final int getSelectionStart() {
        return this.selectionStart;
    }

    private final void setSelectionStart(int i) {
        if (i < 0) {
            throw new java.lang.IllegalArgumentException(("Cannot set selectionStart to a negative value: " + i).toString());
        }
        this.selectionStart = i;
    }

    public final int getSelectionEnd() {
        return this.selectionEnd;
    }

    private final void setSelectionEnd(int i) {
        if (i < 0) {
            throw new java.lang.IllegalArgumentException(("Cannot set selectionEnd to a negative value: " + i).toString());
        }
        this.selectionEnd = i;
    }

    public final int getCompositionStart() {
        return this.compositionStart;
    }

    public final int getCompositionEnd() {
        return this.compositionEnd;
    }

    public final boolean hasComposition() {
        return this.compositionStart != -1;
    }

    /* renamed from: getComposition-MzsxiRA, reason: not valid java name */
    public final androidx.compose.ui.text.TextRange m1119getCompositionMzsxiRA() {
        if (hasComposition()) {
            return androidx.compose.ui.text.TextRange.m3952boximpl(androidx.compose.ui.text.TextRangeKt.TextRange(this.compositionStart, this.compositionEnd));
        }
        return null;
    }

    /* renamed from: getSelection-d9O1mEE, reason: not valid java name */
    public final long m1120getSelectiond9O1mEE() {
        return androidx.compose.ui.text.TextRangeKt.TextRange(this.selectionStart, this.selectionEnd);
    }

    public final int getCursor() {
        int i = this.selectionStart;
        int i2 = this.selectionEnd;
        if (i == i2) {
            return i2;
        }
        return -1;
    }

    public final void setCursor(int i) {
        setSelection(i, i);
    }

    public final char get(int index) {
        return this.gapBuffer.charAt(index);
    }

    public final int getLength() {
        return this.gapBuffer.length();
    }

    private EditingBuffer(java.lang.String str, long j) {
        this(new androidx.compose.ui.text.AnnotatedString(str, null, null, 6, null), j, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    public final void replace(int start, int end, java.lang.CharSequence text) {
        checkRange(start, end);
        int min = java.lang.Math.min(start, end);
        int max = java.lang.Math.max(start, end);
        int i = 0;
        int i2 = min;
        while (i2 < max && i < text.length() && text.charAt(i) == this.gapBuffer.charAt(i2)) {
            i++;
            i2++;
        }
        int length = text.length();
        int i3 = max;
        while (i3 > min && length > i && text.charAt(length - 1) == this.gapBuffer.charAt(i3 - 1)) {
            length--;
            i3--;
        }
        this.changeTracker.trackChange(i2, i3, length - i);
        androidx.compose.foundation.text2.input.internal.PartialGapBuffer.replace$default(this.gapBuffer, min, max, text, 0, 0, 24, null);
        setSelectionStart(text.length() + min);
        setSelectionEnd(min + text.length());
        this.compositionStart = -1;
        this.compositionEnd = -1;
    }

    public final void delete(int start, int end) {
        checkRange(start, end);
        long TextRange = androidx.compose.ui.text.TextRangeKt.TextRange(start, end);
        this.changeTracker.trackChange(start, end, 0);
        androidx.compose.foundation.text2.input.internal.PartialGapBuffer.replace$default(this.gapBuffer, androidx.compose.ui.text.TextRange.m3962getMinimpl(TextRange), androidx.compose.ui.text.TextRange.m3961getMaximpl(TextRange), "", 0, 0, 24, null);
        long m1121updateRangeAfterDeletepWDy79M = androidx.compose.foundation.text2.input.internal.EditingBufferKt.m1121updateRangeAfterDeletepWDy79M(androidx.compose.ui.text.TextRangeKt.TextRange(this.selectionStart, this.selectionEnd), TextRange);
        setSelectionStart(androidx.compose.ui.text.TextRange.m3964getStartimpl(m1121updateRangeAfterDeletepWDy79M));
        setSelectionEnd(androidx.compose.ui.text.TextRange.m3959getEndimpl(m1121updateRangeAfterDeletepWDy79M));
        if (hasComposition()) {
            long m1121updateRangeAfterDeletepWDy79M2 = androidx.compose.foundation.text2.input.internal.EditingBufferKt.m1121updateRangeAfterDeletepWDy79M(androidx.compose.ui.text.TextRangeKt.TextRange(this.compositionStart, this.compositionEnd), TextRange);
            if (androidx.compose.ui.text.TextRange.m3958getCollapsedimpl(m1121updateRangeAfterDeletepWDy79M2)) {
                commitComposition();
            } else {
                this.compositionStart = androidx.compose.ui.text.TextRange.m3962getMinimpl(m1121updateRangeAfterDeletepWDy79M2);
                this.compositionEnd = androidx.compose.ui.text.TextRange.m3961getMaximpl(m1121updateRangeAfterDeletepWDy79M2);
            }
        }
    }

    public final void setSelection(int start, int end) {
        int coerceIn = kotlin.ranges.RangesKt.coerceIn(start, 0, getLength());
        int coerceIn2 = kotlin.ranges.RangesKt.coerceIn(end, 0, getLength());
        setSelectionStart(coerceIn);
        setSelectionEnd(coerceIn2);
    }

    public final void setComposition(int start, int end) {
        if (start < 0 || start > this.gapBuffer.length()) {
            throw new java.lang.IndexOutOfBoundsException("start (" + start + ") offset is outside of text region " + this.gapBuffer.length());
        }
        if (end < 0 || end > this.gapBuffer.length()) {
            throw new java.lang.IndexOutOfBoundsException("end (" + end + ") offset is outside of text region " + this.gapBuffer.length());
        }
        if (start >= end) {
            throw new java.lang.IllegalArgumentException("Do not set reversed or empty range: " + start + " > " + end);
        }
        this.compositionStart = start;
        this.compositionEnd = end;
    }

    public final void commitComposition() {
        this.compositionStart = -1;
        this.compositionEnd = -1;
    }

    public java.lang.String toString() {
        return this.gapBuffer.toString();
    }

    public final androidx.compose.ui.text.AnnotatedString toAnnotatedString() {
        return new androidx.compose.ui.text.AnnotatedString(toString(), null, null, 6, null);
    }

    private final void checkRange(int start, int end) {
        if (start < 0 || start > this.gapBuffer.length()) {
            throw new java.lang.IndexOutOfBoundsException("start (" + start + ") offset is outside of text region " + this.gapBuffer.length());
        }
        if (end < 0 || end > this.gapBuffer.length()) {
            throw new java.lang.IndexOutOfBoundsException("end (" + end + ") offset is outside of text region " + this.gapBuffer.length());
        }
    }
}
