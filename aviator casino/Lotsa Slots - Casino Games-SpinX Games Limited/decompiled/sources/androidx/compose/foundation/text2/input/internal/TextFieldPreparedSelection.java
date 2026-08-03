package androidx.compose.foundation.text2.input.internal;

/* compiled from: TextPreparedSelection.kt */
@kotlin.Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b*\b\u0000\u0018\u0000 O2\u00020\u0001:\u0001OB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ,\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\u0017\u0010\u001b\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u001d0\u001c¢\u0006\u0002\b\u001eH\u0082\bJ\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020 H\u0002J\u001f\u0010\"\u001a\u00020\u00002\u0017\u0010#\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u001d0\u001c¢\u0006\u0002\b\u001eJ\u001f\u0010$\u001a\u00020\u00002\u0017\u0010#\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u001d0\u001c¢\u0006\u0002\b\u001eJ\u0019\u0010%\u001a\u00020\u001d2\u000e\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100&H\u0086\bJ\u0006\u0010'\u001a\u00020\u0000J\u0006\u0010(\u001a\u00020 J\u0006\u0010)\u001a\u00020 J\u0006\u0010*\u001a\u00020 J\u0006\u0010+\u001a\u00020 J\u0006\u0010,\u001a\u00020 J\u0006\u0010-\u001a\u00020 J\b\u0010.\u001a\u00020\u001aH\u0002J\u0010\u0010/\u001a\u00020 2\u0006\u00100\u001a\u00020 H\u0002J\u0006\u00101\u001a\u00020\u0000J\u0006\u00102\u001a\u00020\u0000J\u0006\u00103\u001a\u00020\u0000J\u0006\u00104\u001a\u00020\u0000J\b\u00105\u001a\u00020\u0000H\u0002J\u0006\u00106\u001a\u00020\u0000J\b\u00107\u001a\u00020\u0000H\u0002J\b\u00108\u001a\u00020\u0000H\u0002J\u0006\u00109\u001a\u00020\u0000J\b\u0010:\u001a\u00020\u0000H\u0002J\u0006\u0010;\u001a\u00020\u0000J\u0006\u0010<\u001a\u00020\u0000J\u0006\u0010=\u001a\u00020\u0000J\u0006\u0010>\u001a\u00020\u0000J\u0006\u0010?\u001a\u00020\u0000J\u0006\u0010@\u001a\u00020\u0000J\u0006\u0010A\u001a\u00020\u0000J\u0006\u0010B\u001a\u00020\u0000J\u0006\u0010C\u001a\u00020\u0000J\u0006\u0010D\u001a\u00020\u0000J\u0006\u0010E\u001a\u00020\u0000J\u0006\u0010F\u001a\u00020\u0000J\u0010\u0010G\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020 H\u0002J\u0016\u0010H\u001a\u00020 *\u00020\u00052\b\b\u0002\u0010I\u001a\u00020 H\u0002J\u0016\u0010J\u001a\u00020 *\u00020\u00052\b\b\u0002\u0010I\u001a\u00020 H\u0002J\u0017\u0010K\u001a\u00020 *\u00020\u00052\b\b\u0002\u0010I\u001a\u00020 H\u0082\u0010J\u0017\u0010L\u001a\u00020 *\u00020\u00052\b\b\u0002\u0010I\u001a\u00020 H\u0082\u0010J\u0014\u0010M\u001a\u00020 *\u00020\u00052\u0006\u0010N\u001a\u00020 H\u0002R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\"\u0010\u000f\u001a\u00020\u0010X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006P"}, d2 = {"Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;", "", "state", "Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;", "textLayoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", "visibleTextLayoutHeight", "", "textPreparedSelectionState", "Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelectionState;", "(Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;Landroidx/compose/ui/text/TextLayoutResult;FLandroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelectionState;)V", "initialValue", "Landroidx/compose/foundation/text2/input/TextFieldCharSequence;", "getInitialValue", "()Landroidx/compose/foundation/text2/input/TextFieldCharSequence;", "selection", "Landroidx/compose/ui/text/TextRange;", "getSelection-d9O1mEE", "()J", "setSelection-5zc-tL8", "(J)V", "J", "text", "", "applyIfNotEmpty", "resetCachedX", "", "block", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "charOffset", "", "offset", "collapseLeftOr", "or", "collapseRightOr", "deleteIfSelectedOr", "Lkotlin/Function0;", "deselect", "getLineEndByOffset", "getLineStartByOffset", "getNextCharacterIndex", "getNextWordOffset", "getPrecedingCharacterIndex", "getPreviousWordOffset", "isLtr", "jumpByPagesOffset", "pagesAmount", "moveCursorDownByLine", "moveCursorDownByPage", "moveCursorLeft", "moveCursorLeftByWord", "moveCursorNext", "moveCursorNextByParagraph", "moveCursorNextByWord", "moveCursorPrev", "moveCursorPrevByParagraph", "moveCursorPrevByWord", "moveCursorRight", "moveCursorRightByWord", "moveCursorToEnd", "moveCursorToHome", "moveCursorToLineEnd", "moveCursorToLineLeftSide", "moveCursorToLineRightSide", "moveCursorToLineStart", "moveCursorUpByLine", "moveCursorUpByPage", "selectAll", "selectMovement", "setCursor", "getLineEndByOffsetForLayout", "currentOffset", "getLineStartByOffsetForLayout", "getNextWordOffsetForLayout", "getPrevWordOffsetForLayout", "jumpByLinesOffset", "linesAmount", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextFieldPreparedSelection {
    public static final int NoCharacterFound = -1;
    private final androidx.compose.foundation.text2.input.TextFieldCharSequence initialValue;
    private long selection;
    private final androidx.compose.foundation.text2.input.internal.TransformedTextFieldState state;
    private final java.lang.String text;
    private final androidx.compose.ui.text.TextLayoutResult textLayoutResult;
    private final androidx.compose.foundation.text2.input.internal.TextFieldPreparedSelectionState textPreparedSelectionState;
    private final float visibleTextLayoutHeight;
    public static final int $stable = 8;

    public TextFieldPreparedSelection(androidx.compose.foundation.text2.input.internal.TransformedTextFieldState transformedTextFieldState, androidx.compose.ui.text.TextLayoutResult textLayoutResult, float f, androidx.compose.foundation.text2.input.internal.TextFieldPreparedSelectionState textFieldPreparedSelectionState) {
        this.state = transformedTextFieldState;
        this.textLayoutResult = textLayoutResult;
        this.visibleTextLayoutHeight = f;
        this.textPreparedSelectionState = textFieldPreparedSelectionState;
        androidx.compose.runtime.snapshots.Snapshot createNonObservableSnapshot = androidx.compose.runtime.snapshots.Snapshot.INSTANCE.createNonObservableSnapshot();
        try {
            androidx.compose.runtime.snapshots.Snapshot makeCurrent = createNonObservableSnapshot.makeCurrent();
            try {
                androidx.compose.foundation.text2.input.TextFieldCharSequence text = transformedTextFieldState.getText();
                createNonObservableSnapshot.dispose();
                this.initialValue = text;
                this.selection = text.getSelectionInChars();
                this.text = text.toString();
            } finally {
                createNonObservableSnapshot.restoreCurrent(makeCurrent);
            }
        } catch (java.lang.Throwable th) {
            createNonObservableSnapshot.dispose();
            throw th;
        }
    }

    public final androidx.compose.foundation.text2.input.TextFieldCharSequence getInitialValue() {
        return this.initialValue;
    }

    /* renamed from: getSelection-d9O1mEE, reason: not valid java name and from getter */
    public final long getSelection() {
        return this.selection;
    }

    /* renamed from: setSelection-5zc-tL8, reason: not valid java name */
    public final void m1153setSelection5zctL8(long j) {
        this.selection = j;
    }

    public final void deleteIfSelectedOr(kotlin.jvm.functions.Function0<androidx.compose.ui.text.TextRange> block) {
        if (!androidx.compose.ui.text.TextRange.m3958getCollapsedimpl(getSelection())) {
            androidx.compose.foundation.text2.input.internal.TransformedTextFieldState.m1166replaceTextSbBc2M$default(this.state, "", getSelection(), null, 4, null);
            return;
        }
        androidx.compose.ui.text.TextRange invoke = block.invoke();
        if (invoke != null) {
            androidx.compose.foundation.text2.input.internal.TransformedTextFieldState.m1166replaceTextSbBc2M$default(this.state, "", invoke.getPackedValue(), null, 4, null);
        }
    }

    private final int jumpByPagesOffset(int pagesAmount) {
        androidx.compose.ui.geometry.Rect translate = this.textLayoutResult.getCursorRect(androidx.compose.ui.text.TextRange.m3959getEndimpl(this.initialValue.getSelectionInChars())).translate(0.0f, this.visibleTextLayoutHeight * pagesAmount);
        float lineBottom = this.textLayoutResult.getLineBottom(this.textLayoutResult.getLineForVerticalPosition(translate.getTop()));
        if (java.lang.Math.abs(translate.getTop() - lineBottom) > java.lang.Math.abs(translate.getBottom() - lineBottom)) {
            return this.textLayoutResult.m3936getOffsetForPositionk4lQ0M(translate.m1906getTopLeftF1C5BW0());
        }
        return this.textLayoutResult.m3936getOffsetForPositionk4lQ0M(translate.m1899getBottomLeftF1C5BW0());
    }

    private final androidx.compose.foundation.text2.input.internal.TextFieldPreparedSelection applyIfNotEmpty(boolean resetCachedX, kotlin.jvm.functions.Function1<? super androidx.compose.foundation.text2.input.internal.TextFieldPreparedSelection, kotlin.Unit> block) {
        if (resetCachedX) {
            this.textPreparedSelectionState.resetCachedX();
        }
        if (this.text.length() > 0) {
            block.invoke(this);
        }
        return this;
    }

    static /* synthetic */ androidx.compose.foundation.text2.input.internal.TextFieldPreparedSelection applyIfNotEmpty$default(androidx.compose.foundation.text2.input.internal.TextFieldPreparedSelection textFieldPreparedSelection, boolean z, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if (z) {
            textFieldPreparedSelection.textPreparedSelectionState.resetCachedX();
        }
        if (textFieldPreparedSelection.text.length() > 0) {
            function1.invoke(textFieldPreparedSelection);
        }
        return textFieldPreparedSelection;
    }

    private final void setCursor(int offset) {
        this.selection = androidx.compose.ui.text.TextRangeKt.TextRange(offset, offset);
    }

    public final int getPrecedingCharacterIndex() {
        return androidx.compose.foundation.text.StringHelpers_androidKt.findPrecedingBreak(this.text, androidx.compose.ui.text.TextRange.m3959getEndimpl(this.selection));
    }

    public final int getNextCharacterIndex() {
        return androidx.compose.foundation.text.StringHelpers_androidKt.findFollowingBreak(this.text, androidx.compose.ui.text.TextRange.m3959getEndimpl(this.selection));
    }

    public final int getNextWordOffset() {
        return getNextWordOffsetForLayout$default(this, this.textLayoutResult, 0, 1, null);
    }

    public final int getPreviousWordOffset() {
        return getPrevWordOffsetForLayout$default(this, this.textLayoutResult, 0, 1, null);
    }

    public final int getLineStartByOffset() {
        return getLineStartByOffsetForLayout$default(this, this.textLayoutResult, 0, 1, null);
    }

    public final int getLineEndByOffset() {
        return getLineEndByOffsetForLayout$default(this, this.textLayoutResult, 0, 1, null);
    }

    private final boolean isLtr() {
        return this.textLayoutResult.getParagraphDirection(androidx.compose.ui.text.TextRange.m3959getEndimpl(this.selection)) == androidx.compose.ui.text.style.ResolvedTextDirection.Ltr;
    }

    static /* synthetic */ int getNextWordOffsetForLayout$default(androidx.compose.foundation.text2.input.internal.TextFieldPreparedSelection textFieldPreparedSelection, androidx.compose.ui.text.TextLayoutResult textLayoutResult, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = androidx.compose.ui.text.TextRange.m3959getEndimpl(textFieldPreparedSelection.selection);
        }
        return textFieldPreparedSelection.getNextWordOffsetForLayout(textLayoutResult, i);
    }

    private final int getNextWordOffsetForLayout(androidx.compose.ui.text.TextLayoutResult textLayoutResult, int i) {
        while (i < this.initialValue.length()) {
            long m3938getWordBoundaryjx7JFs = textLayoutResult.m3938getWordBoundaryjx7JFs(charOffset(i));
            if (androidx.compose.ui.text.TextRange.m3959getEndimpl(m3938getWordBoundaryjx7JFs) > i) {
                return androidx.compose.ui.text.TextRange.m3959getEndimpl(m3938getWordBoundaryjx7JFs);
            }
            i++;
        }
        return this.initialValue.length();
    }

    static /* synthetic */ int getPrevWordOffsetForLayout$default(androidx.compose.foundation.text2.input.internal.TextFieldPreparedSelection textFieldPreparedSelection, androidx.compose.ui.text.TextLayoutResult textLayoutResult, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = androidx.compose.ui.text.TextRange.m3959getEndimpl(textFieldPreparedSelection.selection);
        }
        return textFieldPreparedSelection.getPrevWordOffsetForLayout(textLayoutResult, i);
    }

    private final int getPrevWordOffsetForLayout(androidx.compose.ui.text.TextLayoutResult textLayoutResult, int i) {
        while (i > 0) {
            long m3938getWordBoundaryjx7JFs = textLayoutResult.m3938getWordBoundaryjx7JFs(charOffset(i));
            if (androidx.compose.ui.text.TextRange.m3964getStartimpl(m3938getWordBoundaryjx7JFs) < i) {
                return androidx.compose.ui.text.TextRange.m3964getStartimpl(m3938getWordBoundaryjx7JFs);
            }
            i--;
        }
        return 0;
    }

    static /* synthetic */ int getLineStartByOffsetForLayout$default(androidx.compose.foundation.text2.input.internal.TextFieldPreparedSelection textFieldPreparedSelection, androidx.compose.ui.text.TextLayoutResult textLayoutResult, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = androidx.compose.ui.text.TextRange.m3962getMinimpl(textFieldPreparedSelection.selection);
        }
        return textFieldPreparedSelection.getLineStartByOffsetForLayout(textLayoutResult, i);
    }

    private final int getLineStartByOffsetForLayout(androidx.compose.ui.text.TextLayoutResult textLayoutResult, int i) {
        return textLayoutResult.getLineStart(textLayoutResult.getLineForOffset(i));
    }

    static /* synthetic */ int getLineEndByOffsetForLayout$default(androidx.compose.foundation.text2.input.internal.TextFieldPreparedSelection textFieldPreparedSelection, androidx.compose.ui.text.TextLayoutResult textLayoutResult, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = androidx.compose.ui.text.TextRange.m3961getMaximpl(textFieldPreparedSelection.selection);
        }
        return textFieldPreparedSelection.getLineEndByOffsetForLayout(textLayoutResult, i);
    }

    private final int getLineEndByOffsetForLayout(androidx.compose.ui.text.TextLayoutResult textLayoutResult, int i) {
        return textLayoutResult.getLineEnd(textLayoutResult.getLineForOffset(i), true);
    }

    private final int jumpByLinesOffset(androidx.compose.ui.text.TextLayoutResult textLayoutResult, int i) {
        int m3959getEndimpl = androidx.compose.ui.text.TextRange.m3959getEndimpl(this.selection);
        if (java.lang.Float.isNaN(this.textPreparedSelectionState.getCachedX())) {
            this.textPreparedSelectionState.setCachedX(textLayoutResult.getCursorRect(m3959getEndimpl).getLeft());
        }
        int lineForOffset = textLayoutResult.getLineForOffset(m3959getEndimpl) + i;
        if (lineForOffset < 0) {
            return 0;
        }
        if (lineForOffset >= textLayoutResult.getLineCount()) {
            return this.text.length();
        }
        float lineBottom = textLayoutResult.getLineBottom(lineForOffset) - 1;
        float cachedX = this.textPreparedSelectionState.getCachedX();
        if ((isLtr() && cachedX >= textLayoutResult.getLineRight(lineForOffset)) || (!isLtr() && cachedX <= textLayoutResult.getLineLeft(lineForOffset))) {
            return textLayoutResult.getLineEnd(lineForOffset, true);
        }
        return textLayoutResult.m3936getOffsetForPositionk4lQ0M(androidx.compose.ui.geometry.OffsetKt.Offset(cachedX, lineBottom));
    }

    private final int charOffset(int offset) {
        return kotlin.ranges.RangesKt.coerceAtMost(offset, this.text.length() - 1);
    }

    public final androidx.compose.foundation.text2.input.internal.TextFieldPreparedSelection moveCursorUpByPage() {
        if (this.text.length() > 0) {
            setCursor(jumpByPagesOffset(-1));
        }
        return this;
    }

    public final androidx.compose.foundation.text2.input.internal.TextFieldPreparedSelection moveCursorDownByPage() {
        if (this.text.length() > 0) {
            setCursor(jumpByPagesOffset(1));
        }
        return this;
    }

    public final androidx.compose.foundation.text2.input.internal.TextFieldPreparedSelection selectAll() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            this.selection = androidx.compose.ui.text.TextRangeKt.TextRange(0, this.text.length());
        }
        return this;
    }

    public final androidx.compose.foundation.text2.input.internal.TextFieldPreparedSelection deselect() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            setCursor(androidx.compose.ui.text.TextRange.m3959getEndimpl(this.selection));
        }
        return this;
    }

    public final androidx.compose.foundation.text2.input.internal.TextFieldPreparedSelection moveCursorLeft() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            if (isLtr()) {
                moveCursorPrev();
            } else {
                moveCursorNext();
            }
        }
        return this;
    }

    public final androidx.compose.foundation.text2.input.internal.TextFieldPreparedSelection moveCursorRight() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            if (isLtr()) {
                moveCursorNext();
            } else {
                moveCursorPrev();
            }
        }
        return this;
    }

    public final androidx.compose.foundation.text2.input.internal.TextFieldPreparedSelection collapseLeftOr(kotlin.jvm.functions.Function1<? super androidx.compose.foundation.text2.input.internal.TextFieldPreparedSelection, kotlin.Unit> or) {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            if (androidx.compose.ui.text.TextRange.m3958getCollapsedimpl(this.selection)) {
                or.invoke(this);
            } else if (isLtr()) {
                setCursor(androidx.compose.ui.text.TextRange.m3962getMinimpl(this.selection));
            } else {
                setCursor(androidx.compose.ui.text.TextRange.m3961getMaximpl(this.selection));
            }
        }
        return this;
    }

    public final androidx.compose.foundation.text2.input.internal.TextFieldPreparedSelection collapseRightOr(kotlin.jvm.functions.Function1<? super androidx.compose.foundation.text2.input.internal.TextFieldPreparedSelection, kotlin.Unit> or) {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            if (androidx.compose.ui.text.TextRange.m3958getCollapsedimpl(this.selection)) {
                or.invoke(this);
            } else if (isLtr()) {
                setCursor(androidx.compose.ui.text.TextRange.m3961getMaximpl(this.selection));
            } else {
                setCursor(androidx.compose.ui.text.TextRange.m3962getMinimpl(this.selection));
            }
        }
        return this;
    }

    private final androidx.compose.foundation.text2.input.internal.TextFieldPreparedSelection moveCursorPrev() {
        int precedingCharacterIndex;
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0 && (precedingCharacterIndex = getPrecedingCharacterIndex()) != -1) {
            setCursor(precedingCharacterIndex);
        }
        return this;
    }

    private final androidx.compose.foundation.text2.input.internal.TextFieldPreparedSelection moveCursorNext() {
        int nextCharacterIndex;
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0 && (nextCharacterIndex = getNextCharacterIndex()) != -1) {
            setCursor(nextCharacterIndex);
        }
        return this;
    }

    public final androidx.compose.foundation.text2.input.internal.TextFieldPreparedSelection moveCursorToHome() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            setCursor(0);
        }
        return this;
    }

    public final androidx.compose.foundation.text2.input.internal.TextFieldPreparedSelection moveCursorToEnd() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            setCursor(this.text.length());
        }
        return this;
    }

    public final androidx.compose.foundation.text2.input.internal.TextFieldPreparedSelection moveCursorLeftByWord() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            if (isLtr()) {
                moveCursorPrevByWord();
            } else {
                moveCursorNextByWord();
            }
        }
        return this;
    }

    public final androidx.compose.foundation.text2.input.internal.TextFieldPreparedSelection moveCursorRightByWord() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            if (isLtr()) {
                moveCursorNextByWord();
            } else {
                moveCursorPrevByWord();
            }
        }
        return this;
    }

    private final androidx.compose.foundation.text2.input.internal.TextFieldPreparedSelection moveCursorNextByWord() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            setCursor(getNextWordOffset());
        }
        return this;
    }

    private final androidx.compose.foundation.text2.input.internal.TextFieldPreparedSelection moveCursorPrevByWord() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            setCursor(getPreviousWordOffset());
        }
        return this;
    }

    public final androidx.compose.foundation.text2.input.internal.TextFieldPreparedSelection moveCursorPrevByParagraph() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            int findParagraphStart = androidx.compose.foundation.text.StringHelpersKt.findParagraphStart(this.text, androidx.compose.ui.text.TextRange.m3962getMinimpl(this.selection));
            if (findParagraphStart == androidx.compose.ui.text.TextRange.m3962getMinimpl(this.selection) && findParagraphStart != 0) {
                findParagraphStart = androidx.compose.foundation.text.StringHelpersKt.findParagraphStart(this.text, findParagraphStart - 1);
            }
            setCursor(findParagraphStart);
        }
        return this;
    }

    public final androidx.compose.foundation.text2.input.internal.TextFieldPreparedSelection moveCursorNextByParagraph() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            int findParagraphEnd = androidx.compose.foundation.text.StringHelpersKt.findParagraphEnd(this.text, androidx.compose.ui.text.TextRange.m3961getMaximpl(this.selection));
            if (findParagraphEnd == androidx.compose.ui.text.TextRange.m3961getMaximpl(this.selection) && findParagraphEnd != this.text.length()) {
                findParagraphEnd = androidx.compose.foundation.text.StringHelpersKt.findParagraphEnd(this.text, findParagraphEnd + 1);
            }
            setCursor(findParagraphEnd);
        }
        return this;
    }

    public final androidx.compose.foundation.text2.input.internal.TextFieldPreparedSelection moveCursorUpByLine() {
        if (this.text.length() > 0) {
            setCursor(jumpByLinesOffset(this.textLayoutResult, -1));
        }
        return this;
    }

    public final androidx.compose.foundation.text2.input.internal.TextFieldPreparedSelection moveCursorDownByLine() {
        if (this.text.length() > 0) {
            setCursor(jumpByLinesOffset(this.textLayoutResult, 1));
        }
        return this;
    }

    public final androidx.compose.foundation.text2.input.internal.TextFieldPreparedSelection moveCursorToLineStart() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            setCursor(getLineStartByOffset());
        }
        return this;
    }

    public final androidx.compose.foundation.text2.input.internal.TextFieldPreparedSelection moveCursorToLineEnd() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            setCursor(getLineEndByOffset());
        }
        return this;
    }

    public final androidx.compose.foundation.text2.input.internal.TextFieldPreparedSelection moveCursorToLineLeftSide() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            if (isLtr()) {
                moveCursorToLineStart();
            } else {
                moveCursorToLineEnd();
            }
        }
        return this;
    }

    public final androidx.compose.foundation.text2.input.internal.TextFieldPreparedSelection moveCursorToLineRightSide() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            if (isLtr()) {
                moveCursorToLineEnd();
            } else {
                moveCursorToLineStart();
            }
        }
        return this;
    }

    public final androidx.compose.foundation.text2.input.internal.TextFieldPreparedSelection selectMovement() {
        if (this.text.length() > 0) {
            this.selection = androidx.compose.ui.text.TextRangeKt.TextRange(androidx.compose.ui.text.TextRange.m3964getStartimpl(this.initialValue.getSelectionInChars()), androidx.compose.ui.text.TextRange.m3959getEndimpl(this.selection));
        }
        return this;
    }
}
