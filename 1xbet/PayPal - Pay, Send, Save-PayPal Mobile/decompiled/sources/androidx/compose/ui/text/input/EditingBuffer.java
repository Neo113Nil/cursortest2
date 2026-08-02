package androidx.compose.ui.text.input;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\f\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u001d\u0018\u0000 @2\u00020\u0001:\u0001@B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\b\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0080\u0002¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0015\u0010\u0017J\u001f\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\rH\u0000¢\u0006\u0004\b\u001a\u0010\u0019J\u001f\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\rH\u0000¢\u0006\u0004\b\u001b\u0010\u0019J\u000f\u0010\u001c\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u001e\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0002H\u0000¢\u0006\u0004\b!\u0010\"R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R*\u0010(\u001a\u00020\r2\u0006\u0010'\u001a\u00020\r8\u0001@CX\u0080\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R*\u0010.\u001a\u00020\r2\u0006\u0010'\u001a\u00020\r8\u0001@CX\u0081\u000e¢\u0006\u0012\n\u0004\b.\u0010)\u001a\u0004\b/\u0010+\"\u0004\b0\u0010-R$\u00102\u001a\u00020\r2\u0006\u00101\u001a\u00020\r8\u0001@BX\u0081\u000e¢\u0006\f\n\u0004\b2\u0010)\u001a\u0004\b3\u0010+R$\u00104\u001a\u00020\r2\u0006\u00101\u001a\u00020\r8\u0001@BX\u0081\u000e¢\u0006\f\n\u0004\b4\u0010)\u001a\u0004\b5\u0010+R\u0016\u00108\u001a\u0004\u0018\u00010\u00048AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b6\u00107R\u0014\u0010\u0005\u001a\u00020\u00048AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:R$\u0010;\u001a\u00020\r2\u0006\u0010;\u001a\u00020\r8A@AX\u0080\u000e¢\u0006\f\u001a\u0004\b<\u0010+\"\u0004\b=\u0010-R\u0014\u0010?\u001a\u00020\r8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b>\u0010+"}, d2 = {"Landroidx/compose/ui/text/input/EditingBuffer;", "", "Landroidx/compose/ui/text/AnnotatedString;", "text", "Landroidx/compose/ui/text/TextRange;", "selection", "<init>", "(Landroidx/compose/ui/text/AnnotatedString;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "(Ljava/lang/String;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "hasComposition$ui_text", "()Z", "", "index", "", "get$ui_text", "(I)C", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "end", "", "replace$ui_text", "(IILandroidx/compose/ui/text/AnnotatedString;)V", "(IILjava/lang/String;)V", "delete$ui_text", "(II)V", "setSelection$ui_text", "setComposition$ui_text", "cancelComposition$ui_text", "()V", "commitComposition$ui_text", "toString", "()Ljava/lang/String;", "toAnnotatedString$ui_text", "()Landroidx/compose/ui/text/AnnotatedString;", "Landroidx/compose/ui/text/input/PartialGapBuffer;", "Camera2StreamConfigurationMap", "Landroidx/compose/ui/text/input/PartialGapBuffer;", "getHighResolutionOutputSizeshNQ4ISI", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "selectionStart", com.visa.cbp.getEncExpo.warmup, "getSelectionStart$ui_text", "()I", "setSelectionStart", "(I)V", "selectionEnd", "getSelectionEnd$ui_text", "setSelectionEnd", "p0", "compositionStart", "getCompositionStart$ui_text", "compositionEnd", "getCompositionEnd$ui_text", "getComposition-MzsxiRA$ui_text", "()Landroidx/compose/ui/text/TextRange;", "composition", "getSelection-d9O1mEE$ui_text", "()J", "cursor", "getCursor$ui_text", "setCursor$ui_text", "getLength$ui_text", "length", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class EditingBuffer {
    public static final int NOWHERE = -1;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.compose.ui.text.input.PartialGapBuffer getHighResolutionOutputSizeshNQ4ISI;
    private int compositionEnd;
    private int compositionStart;
    private int selectionEnd;
    private int selectionStart;
    public static final int $stable = 8;

    private EditingBuffer(androidx.compose.ui.text.AnnotatedString annotatedString, long j) {
        this.getHighResolutionOutputSizeshNQ4ISI = new androidx.compose.ui.text.input.PartialGapBuffer(annotatedString.getText());
        this.selectionStart = androidx.compose.ui.text.TextRange.m8037getMinimpl(j);
        this.selectionEnd = androidx.compose.ui.text.TextRange.m8036getMaximpl(j);
        this.compositionStart = -1;
        this.compositionEnd = -1;
        int m8037getMinimpl = androidx.compose.ui.text.TextRange.m8037getMinimpl(j);
        int m8036getMaximpl = androidx.compose.ui.text.TextRange.m8036getMaximpl(j);
        if (m8037getMinimpl < 0 || m8037getMinimpl > annotatedString.length()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("start (");
            sb.append(m8037getMinimpl);
            sb.append(") offset is outside of text region ");
            sb.append(annotatedString.length());
            throw new java.lang.IndexOutOfBoundsException(sb.toString());
        }
        if (m8036getMaximpl < 0 || m8036getMaximpl > annotatedString.length()) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("end (");
            sb2.append(m8036getMaximpl);
            sb2.append(") offset is outside of text region ");
            sb2.append(annotatedString.length());
            throw new java.lang.IndexOutOfBoundsException(sb2.toString());
        }
        if (m8037getMinimpl <= m8036getMaximpl) {
            return;
        }
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Do not set reversed range: ");
        sb3.append(m8037getMinimpl);
        sb3.append(" > ");
        sb3.append(m8036getMaximpl);
        throw new java.lang.IllegalArgumentException(sb3.toString());
    }

    /* renamed from: getSelectionStart$ui_text, reason: from getter */
    public final int getSelectionStart() {
        return this.selectionStart;
    }

    private final void setSelectionStart(int i) {
        if (i < 0) {
            androidx.compose.ui.text.internal.InlineClassHelperKt.throwIllegalArgumentException("Cannot set selectionStart to a negative value: ".concat(java.lang.String.valueOf(i)));
        }
        this.selectionStart = i;
    }

    /* renamed from: getSelectionEnd$ui_text, reason: from getter */
    public final int getSelectionEnd() {
        return this.selectionEnd;
    }

    private final void setSelectionEnd(int i) {
        if (i < 0) {
            androidx.compose.ui.text.internal.InlineClassHelperKt.throwIllegalArgumentException("Cannot set selectionEnd to a negative value: ".concat(java.lang.String.valueOf(i)));
        }
        this.selectionEnd = i;
    }

    /* renamed from: getCompositionStart$ui_text, reason: from getter */
    public final int getCompositionStart() {
        return this.compositionStart;
    }

    /* renamed from: getCompositionEnd$ui_text, reason: from getter */
    public final int getCompositionEnd() {
        return this.compositionEnd;
    }

    public final boolean hasComposition$ui_text() {
        return this.compositionStart != -1;
    }

    /* renamed from: getComposition-MzsxiRA$ui_text, reason: not valid java name */
    public final androidx.compose.ui.text.TextRange m8195getCompositionMzsxiRA$ui_text() {
        if (hasComposition$ui_text()) {
            return androidx.compose.ui.text.TextRange.m8027boximpl(androidx.compose.ui.text.TextRangeKt.TextRange(this.compositionStart, this.compositionEnd));
        }
        return null;
    }

    /* renamed from: getSelection-d9O1mEE$ui_text, reason: not valid java name */
    public final long m8196getSelectiond9O1mEE$ui_text() {
        return androidx.compose.ui.text.TextRangeKt.TextRange(this.selectionStart, this.selectionEnd);
    }

    public final int getCursor$ui_text() {
        int i = this.selectionStart;
        int i2 = this.selectionEnd;
        if (i == i2) {
            return i2;
        }
        return -1;
    }

    public final void setCursor$ui_text(int i) {
        setSelection$ui_text(i, i);
    }

    public final char get$ui_text(int index) {
        return this.getHighResolutionOutputSizeshNQ4ISI.get(index);
    }

    public final int getLength$ui_text() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getLength();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private EditingBuffer(java.lang.String str, long j) {
        this(new androidx.compose.ui.text.AnnotatedString(str, null, 2, 0 == true ? 1 : 0), j, (kotlin.jvm.internal.DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public final void replace$ui_text(int start, int end, androidx.compose.ui.text.AnnotatedString text) {
        replace$ui_text(start, end, text.getText());
    }

    public final void replace$ui_text(int start, int end, java.lang.String text) {
        if (start < 0 || start > this.getHighResolutionOutputSizeshNQ4ISI.getLength()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("start (");
            sb.append(start);
            sb.append(") offset is outside of text region ");
            sb.append(this.getHighResolutionOutputSizeshNQ4ISI.getLength());
            throw new java.lang.IndexOutOfBoundsException(sb.toString());
        }
        if (end < 0 || end > this.getHighResolutionOutputSizeshNQ4ISI.getLength()) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("end (");
            sb2.append(end);
            sb2.append(") offset is outside of text region ");
            sb2.append(this.getHighResolutionOutputSizeshNQ4ISI.getLength());
            throw new java.lang.IndexOutOfBoundsException(sb2.toString());
        }
        if (start > end) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Do not set reversed range: ");
            sb3.append(start);
            sb3.append(" > ");
            sb3.append(end);
            throw new java.lang.IllegalArgumentException(sb3.toString());
        }
        this.getHighResolutionOutputSizeshNQ4ISI.replace(start, end, text);
        setSelectionStart(text.length() + start);
        setSelectionEnd(start + text.length());
        this.compositionStart = -1;
        this.compositionEnd = -1;
    }

    public final void delete$ui_text(int start, int end) {
        long TextRange = androidx.compose.ui.text.TextRangeKt.TextRange(start, end);
        this.getHighResolutionOutputSizeshNQ4ISI.replace(start, end, "");
        long m8197updateRangeAfterDeletepWDy79M = androidx.compose.ui.text.input.EditingBufferKt.m8197updateRangeAfterDeletepWDy79M(androidx.compose.ui.text.TextRangeKt.TextRange(this.selectionStart, this.selectionEnd), TextRange);
        setSelectionStart(androidx.compose.ui.text.TextRange.m8037getMinimpl(m8197updateRangeAfterDeletepWDy79M));
        setSelectionEnd(androidx.compose.ui.text.TextRange.m8036getMaximpl(m8197updateRangeAfterDeletepWDy79M));
        if (hasComposition$ui_text()) {
            long m8197updateRangeAfterDeletepWDy79M2 = androidx.compose.ui.text.input.EditingBufferKt.m8197updateRangeAfterDeletepWDy79M(androidx.compose.ui.text.TextRangeKt.TextRange(this.compositionStart, this.compositionEnd), TextRange);
            if (androidx.compose.ui.text.TextRange.m8033getCollapsedimpl(m8197updateRangeAfterDeletepWDy79M2)) {
                commitComposition$ui_text();
            } else {
                this.compositionStart = androidx.compose.ui.text.TextRange.m8037getMinimpl(m8197updateRangeAfterDeletepWDy79M2);
                this.compositionEnd = androidx.compose.ui.text.TextRange.m8036getMaximpl(m8197updateRangeAfterDeletepWDy79M2);
            }
        }
    }

    public final void setSelection$ui_text(int start, int end) {
        if (start < 0 || start > this.getHighResolutionOutputSizeshNQ4ISI.getLength()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("start (");
            sb.append(start);
            sb.append(") offset is outside of text region ");
            sb.append(this.getHighResolutionOutputSizeshNQ4ISI.getLength());
            throw new java.lang.IndexOutOfBoundsException(sb.toString());
        }
        if (end < 0 || end > this.getHighResolutionOutputSizeshNQ4ISI.getLength()) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("end (");
            sb2.append(end);
            sb2.append(") offset is outside of text region ");
            sb2.append(this.getHighResolutionOutputSizeshNQ4ISI.getLength());
            throw new java.lang.IndexOutOfBoundsException(sb2.toString());
        }
        if (start > end) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Do not set reversed range: ");
            sb3.append(start);
            sb3.append(" > ");
            sb3.append(end);
            throw new java.lang.IllegalArgumentException(sb3.toString());
        }
        setSelectionStart(start);
        setSelectionEnd(end);
    }

    public final void setComposition$ui_text(int start, int end) {
        if (start < 0 || start > this.getHighResolutionOutputSizeshNQ4ISI.getLength()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("start (");
            sb.append(start);
            sb.append(") offset is outside of text region ");
            sb.append(this.getHighResolutionOutputSizeshNQ4ISI.getLength());
            throw new java.lang.IndexOutOfBoundsException(sb.toString());
        }
        if (end < 0 || end > this.getHighResolutionOutputSizeshNQ4ISI.getLength()) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("end (");
            sb2.append(end);
            sb2.append(") offset is outside of text region ");
            sb2.append(this.getHighResolutionOutputSizeshNQ4ISI.getLength());
            throw new java.lang.IndexOutOfBoundsException(sb2.toString());
        }
        if (start >= end) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Do not set reversed or empty range: ");
            sb3.append(start);
            sb3.append(" > ");
            sb3.append(end);
            throw new java.lang.IllegalArgumentException(sb3.toString());
        }
        this.compositionStart = start;
        this.compositionEnd = end;
    }

    public final void cancelComposition$ui_text() {
        replace$ui_text(this.compositionStart, this.compositionEnd, "");
        this.compositionStart = -1;
        this.compositionEnd = -1;
    }

    public final void commitComposition$ui_text() {
        this.compositionStart = -1;
        this.compositionEnd = -1;
    }

    public final java.lang.String toString() {
        return this.getHighResolutionOutputSizeshNQ4ISI.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final androidx.compose.ui.text.AnnotatedString toAnnotatedString$ui_text() {
        return new androidx.compose.ui.text.AnnotatedString(toString(), null, 2, 0 == true ? 1 : 0);
    }

    public /* synthetic */ EditingBuffer(java.lang.String str, long j, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j);
    }

    public /* synthetic */ EditingBuffer(androidx.compose.ui.text.AnnotatedString annotatedString, long j, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, j);
    }
}
