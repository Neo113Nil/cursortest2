package androidx.compose.foundation.text.selection;

@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\bE\n\u0002\u0010\u000e\n\u0002\b\u0004\b \u0018\u0000 b*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u00020\u0002:\u0001bB1\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ=\u0010\u0016\u001a\u00028\u0000\"\u0004\b\u0001\u0010\u000f*\u00028\u00012\b\b\u0002\u0010\u0011\u001a\u00020\u00102\u0017\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0002\b\u0014H\u0084\b¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0018H\u0004¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u0018H\u0004¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00028\u0000¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00028\u0000¢\u0006\u0004\b\"\u0010!J\r\u0010#\u001a\u00028\u0000¢\u0006\u0004\b#\u0010!J\r\u0010$\u001a\u00028\u0000¢\u0006\u0004\b$\u0010!J&\u0010&\u001a\u00028\u00002\u0017\u0010%\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0002\b\u0014¢\u0006\u0004\b&\u0010'J&\u0010(\u001a\u00028\u00002\u0017\u0010%\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0002\b\u0014¢\u0006\u0004\b(\u0010'J\r\u0010)\u001a\u00020\u0018¢\u0006\u0004\b)\u0010*J\r\u0010+\u001a\u00020\u0018¢\u0006\u0004\b+\u0010*J\r\u0010,\u001a\u00020\u0018¢\u0006\u0004\b,\u0010*J\u000f\u0010-\u001a\u00028\u0000H\u0002¢\u0006\u0004\b-\u0010!J\u000f\u0010.\u001a\u00028\u0000H\u0002¢\u0006\u0004\b.\u0010!J\r\u0010/\u001a\u00028\u0000¢\u0006\u0004\b/\u0010!J\r\u00100\u001a\u00028\u0000¢\u0006\u0004\b0\u0010!J\r\u00101\u001a\u00028\u0000¢\u0006\u0004\b1\u0010!J\r\u00102\u001a\u00028\u0000¢\u0006\u0004\b2\u0010!J\u000f\u00103\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00028\u0000H\u0002¢\u0006\u0004\b5\u0010!J\u000f\u00106\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b6\u00104J\u000f\u00107\u001a\u00028\u0000H\u0002¢\u0006\u0004\b7\u0010!J\r\u00108\u001a\u00028\u0000¢\u0006\u0004\b8\u0010!J\r\u00109\u001a\u00028\u0000¢\u0006\u0004\b9\u0010!J\r\u0010:\u001a\u00028\u0000¢\u0006\u0004\b:\u0010!J\r\u0010;\u001a\u00028\u0000¢\u0006\u0004\b;\u0010!J\u000f\u0010<\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b<\u00104J\r\u0010=\u001a\u00028\u0000¢\u0006\u0004\b=\u0010!J\u000f\u0010>\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b>\u00104J\r\u0010?\u001a\u00028\u0000¢\u0006\u0004\b?\u0010!J\r\u0010@\u001a\u00028\u0000¢\u0006\u0004\b@\u0010!J\r\u0010A\u001a\u00028\u0000¢\u0006\u0004\bA\u0010!J\r\u0010B\u001a\u00028\u0000¢\u0006\u0004\bB\u0010!J\u000f\u0010C\u001a\u00020\u0010H\u0002¢\u0006\u0004\bC\u0010DJ\u001b\u00105\u001a\u00020\u0018*\u00020\u00072\u0006\u0010E\u001a\u00020\u0018H\u0002¢\u0006\u0004\b5\u0010FR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010G\u001a\u0004\bH\u0010IR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010J\u001a\u0004\bK\u0010LR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010M\u001a\u0004\bN\u0010OR\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010P\u001a\u0004\bQ\u0010RR\u001a\u0010\f\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010S\u001a\u0004\bT\u0010UR\"\u0010V\u001a\u00020\u00058\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bV\u0010J\u001a\u0004\bW\u0010L\"\u0004\bX\u0010YR\"\u0010Z\u001a\u00020\u00038\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bZ\u0010G\u001a\u0004\b[\u0010I\"\u0004\b\\\u0010]R\u0014\u0010a\u001a\u00020^8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b_\u0010`"}, d2 = {"Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;", "T", "", "Landroidx/compose/ui/text/AnnotatedString;", "originalText", "Landroidx/compose/ui/text/TextRange;", "originalSelection", "Landroidx/compose/ui/text/TextLayoutResult;", "layoutResult", "Landroidx/compose/ui/text/input/OffsetMapping;", "offsetMapping", "Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;", "state", "<init>", "(Landroidx/compose/ui/text/AnnotatedString;JLandroidx/compose/ui/text/TextLayoutResult;Landroidx/compose/ui/text/input/OffsetMapping;Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.UNITY, "", "resetCachedX", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "block", com.paypal.oslo.feature.bnplacquisition.paymode.PayModeConstants.APPLY_PROMO_CARD_STATUS, "(Ljava/lang/Object;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;", "", "offset", "setCursor", "(I)V", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "end", "setSelection", "(II)V", "selectAll", "()Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;", "deselect", "moveCursorLeft", "moveCursorRight", "or", "collapseLeftOr", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;", "collapseRightOr", "getPrecedingCodePointOrEmojiStartIndex", "()I", "getPrecedingCharacterIndex", "getNextCharacterIndex", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoSizes", "moveCursorToHome", "moveCursorToEnd", "moveCursorLeftByWord", "moveCursorRightByWord", "getNextWordOffset", "()Ljava/lang/Integer;", "Camera2StreamConfigurationMap", "getPreviousWordOffset", "getHighSpeedVideoFpsRangesFor", "moveCursorPrevByParagraph", "moveCursorNextByParagraph", "moveCursorUpByLine", "moveCursorDownByLine", "getLineStartByOffset", "moveCursorToLineStart", "getLineEndByOffset", "moveCursorToLineEnd", "moveCursorToLineLeftSide", "moveCursorToLineRightSide", "selectMovement", "getHighSpeedVideoFpsRanges", "()Z", "p0", "(Landroidx/compose/ui/text/TextLayoutResult;I)I", "Landroidx/compose/ui/text/AnnotatedString;", "getOriginalText", "()Landroidx/compose/ui/text/AnnotatedString;", "J", "getOriginalSelection-d9O1mEE", "()J", "Landroidx/compose/ui/text/TextLayoutResult;", "getLayoutResult", "()Landroidx/compose/ui/text/TextLayoutResult;", "Landroidx/compose/ui/text/input/OffsetMapping;", "getOffsetMapping", "()Landroidx/compose/ui/text/input/OffsetMapping;", "Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;", "getState", "()Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;", "selection", "getSelection-d9O1mEE", "setSelection-5zc-tL8", "(J)V", "annotatedString", "getAnnotatedString", "setAnnotatedString", "(Landroidx/compose/ui/text/AnnotatedString;)V", "", "getText$foundation", "()Ljava/lang/String;", "text", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class BaseTextPreparedSelection<T extends androidx.compose.foundation.text.selection.BaseTextPreparedSelection<T>> {
    public static final int NoCharacterFound = -1;
    private androidx.compose.ui.text.AnnotatedString annotatedString;
    private final androidx.compose.ui.text.TextLayoutResult layoutResult;
    private final androidx.compose.ui.text.input.OffsetMapping offsetMapping;
    private final long originalSelection;
    private final androidx.compose.ui.text.AnnotatedString originalText;
    private long selection;
    private final androidx.compose.foundation.text.selection.TextPreparedSelectionState state;
    public static final int $stable = 8;

    private BaseTextPreparedSelection(androidx.compose.ui.text.AnnotatedString annotatedString, long j, androidx.compose.ui.text.TextLayoutResult textLayoutResult, androidx.compose.ui.text.input.OffsetMapping offsetMapping, androidx.compose.foundation.text.selection.TextPreparedSelectionState textPreparedSelectionState) {
        this.originalText = annotatedString;
        this.originalSelection = j;
        this.layoutResult = textLayoutResult;
        this.offsetMapping = offsetMapping;
        this.state = textPreparedSelectionState;
        this.selection = j;
        this.annotatedString = annotatedString;
    }

    public final androidx.compose.ui.text.AnnotatedString getOriginalText() {
        return this.originalText;
    }

    /* renamed from: getOriginalSelection-d9O1mEE, reason: not valid java name and from getter */
    public final long getOriginalSelection() {
        return this.originalSelection;
    }

    public final androidx.compose.ui.text.TextLayoutResult getLayoutResult() {
        return this.layoutResult;
    }

    public final androidx.compose.ui.text.input.OffsetMapping getOffsetMapping() {
        return this.offsetMapping;
    }

    public final androidx.compose.foundation.text.selection.TextPreparedSelectionState getState() {
        return this.state;
    }

    /* renamed from: getSelection-d9O1mEE, reason: not valid java name and from getter */
    public final long getSelection() {
        return this.selection;
    }

    /* renamed from: setSelection-5zc-tL8, reason: not valid java name */
    public final void m2373setSelection5zctL8(long j) {
        this.selection = j;
    }

    public final androidx.compose.ui.text.AnnotatedString getAnnotatedString() {
        return this.annotatedString;
    }

    public final void setAnnotatedString(androidx.compose.ui.text.AnnotatedString annotatedString) {
        this.annotatedString = annotatedString;
    }

    public final java.lang.String getText$foundation() {
        return this.annotatedString.getText();
    }

    public static /* synthetic */ androidx.compose.foundation.text.selection.BaseTextPreparedSelection apply$default(androidx.compose.foundation.text.selection.BaseTextPreparedSelection baseTextPreparedSelection, java.lang.Object obj, boolean z, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj2) {
        if (obj2 != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: apply");
        }
        if ((i & 1) != 0 || z) {
            baseTextPreparedSelection.getState().resetCachedX();
        }
        if (baseTextPreparedSelection.getText$foundation().length() > 0) {
            function1.invoke(obj);
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
        return (androidx.compose.foundation.text.selection.BaseTextPreparedSelection) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected final <U> T apply(U u, boolean z, kotlin.jvm.functions.Function1<? super U, kotlin.Unit> function1) {
        if (z) {
            getState().resetCachedX();
        }
        if (getText$foundation().length() > 0) {
            function1.invoke(u);
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(u, "");
        return (T) u;
    }

    protected final void setCursor(int offset) {
        setSelection(offset, offset);
    }

    protected final void setSelection(int start, int end) {
        this.selection = androidx.compose.ui.text.TextRangeKt.TextRange(start, end);
    }

    public final int getPrecedingCodePointOrEmojiStartIndex() {
        return androidx.compose.foundation.text.StringHelpers_androidKt.findCodePointOrEmojiStartBefore(this.annotatedString.getText(), androidx.compose.ui.text.TextRange.m8034getEndimpl(this.selection), -1);
    }

    public final int getPrecedingCharacterIndex() {
        return androidx.compose.foundation.text.StringHelpers_androidKt.findPrecedingBreak(this.annotatedString.getText(), androidx.compose.ui.text.TextRange.m8034getEndimpl(this.selection));
    }

    public final int getNextCharacterIndex() {
        return androidx.compose.foundation.text.StringHelpers_androidKt.findFollowingBreak(this.annotatedString.getText(), androidx.compose.ui.text.TextRange.m8034getEndimpl(this.selection));
    }

    public final java.lang.Integer getNextWordOffset() {
        int length;
        androidx.compose.ui.text.TextLayoutResult textLayoutResult = this.layoutResult;
        if (textLayoutResult == null) {
            return null;
        }
        int originalToTransformed = this.offsetMapping.originalToTransformed(androidx.compose.ui.text.TextRange.m8034getEndimpl(this.selection));
        while (true) {
            if (originalToTransformed >= this.originalText.length()) {
                length = this.originalText.length();
                break;
            }
            long m8013getWordBoundaryjx7JFs = textLayoutResult.m8013getWordBoundaryjx7JFs(kotlin.ranges.RangesKt.coerceAtMost(originalToTransformed, getText$foundation().length() - 1));
            if (androidx.compose.ui.text.TextRange.m8034getEndimpl(m8013getWordBoundaryjx7JFs) > originalToTransformed) {
                length = this.offsetMapping.transformedToOriginal(androidx.compose.ui.text.TextRange.m8034getEndimpl(m8013getWordBoundaryjx7JFs));
                break;
            }
            originalToTransformed++;
        }
        return java.lang.Integer.valueOf(length);
    }

    public final java.lang.Integer getPreviousWordOffset() {
        int i;
        androidx.compose.ui.text.TextLayoutResult textLayoutResult = this.layoutResult;
        if (textLayoutResult == null) {
            return null;
        }
        int originalToTransformed = this.offsetMapping.originalToTransformed(androidx.compose.ui.text.TextRange.m8034getEndimpl(this.selection));
        while (true) {
            if (originalToTransformed > 0) {
                long m8013getWordBoundaryjx7JFs = textLayoutResult.m8013getWordBoundaryjx7JFs(kotlin.ranges.RangesKt.coerceAtMost(originalToTransformed, getText$foundation().length() - 1));
                if (androidx.compose.ui.text.TextRange.m8039getStartimpl(m8013getWordBoundaryjx7JFs) < originalToTransformed) {
                    i = this.offsetMapping.transformedToOriginal(androidx.compose.ui.text.TextRange.m8039getStartimpl(m8013getWordBoundaryjx7JFs));
                    break;
                }
                originalToTransformed--;
            } else {
                i = 0;
                break;
            }
        }
        return java.lang.Integer.valueOf(i);
    }

    public final java.lang.Integer getLineStartByOffset() {
        androidx.compose.ui.text.TextLayoutResult textLayoutResult = this.layoutResult;
        if (textLayoutResult == null) {
            return null;
        }
        return java.lang.Integer.valueOf(this.offsetMapping.transformedToOriginal(textLayoutResult.getLineStart(textLayoutResult.getLineForOffset(this.offsetMapping.originalToTransformed(androidx.compose.ui.text.TextRange.m8037getMinimpl(this.selection))))));
    }

    public final java.lang.Integer getLineEndByOffset() {
        androidx.compose.ui.text.TextLayoutResult textLayoutResult = this.layoutResult;
        if (textLayoutResult == null) {
            return null;
        }
        return java.lang.Integer.valueOf(this.offsetMapping.transformedToOriginal(textLayoutResult.getLineEnd(textLayoutResult.getLineForOffset(this.offsetMapping.originalToTransformed(androidx.compose.ui.text.TextRange.m8036getMaximpl(this.selection))), true)));
    }

    private final boolean getHighSpeedVideoFpsRanges() {
        androidx.compose.ui.text.TextLayoutResult textLayoutResult = this.layoutResult;
        return (textLayoutResult != null ? textLayoutResult.getParagraphDirection(this.offsetMapping.originalToTransformed(androidx.compose.ui.text.TextRange.m8034getEndimpl(this.selection))) : null) != androidx.compose.ui.text.style.ResolvedTextDirection.Rtl;
    }

    public final T selectAll() {
        getState().resetCachedX();
        if (getText$foundation().length() > 0) {
            setSelection(0, getText$foundation().length());
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(this, "");
        return this;
    }

    public final T deselect() {
        getState().resetCachedX();
        if (getText$foundation().length() > 0) {
            setCursor(androidx.compose.ui.text.TextRange.m8034getEndimpl(this.selection));
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(this, "");
        return this;
    }

    public final T moveCursorLeft() {
        getState().resetCachedX();
        if (getText$foundation().length() > 0) {
            if (getHighSpeedVideoFpsRanges()) {
                getHighResolutionOutputSizeshNQ4ISI();
            } else {
                getHighSpeedVideoSizes();
            }
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(this, "");
        return this;
    }

    public final T moveCursorRight() {
        getState().resetCachedX();
        if (getText$foundation().length() > 0) {
            if (getHighSpeedVideoFpsRanges()) {
                getHighSpeedVideoSizes();
            } else {
                getHighResolutionOutputSizeshNQ4ISI();
            }
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(this, "");
        return this;
    }

    public final T collapseLeftOr(kotlin.jvm.functions.Function1<? super T, kotlin.Unit> or) {
        getState().resetCachedX();
        if (getText$foundation().length() > 0) {
            if (androidx.compose.ui.text.TextRange.m8033getCollapsedimpl(this.selection)) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(this, "");
                or.invoke(this);
            } else if (getHighSpeedVideoFpsRanges()) {
                setCursor(androidx.compose.ui.text.TextRange.m8037getMinimpl(this.selection));
            } else {
                setCursor(androidx.compose.ui.text.TextRange.m8036getMaximpl(this.selection));
            }
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(this, "");
        return this;
    }

    public final T collapseRightOr(kotlin.jvm.functions.Function1<? super T, kotlin.Unit> or) {
        getState().resetCachedX();
        if (getText$foundation().length() > 0) {
            if (androidx.compose.ui.text.TextRange.m8033getCollapsedimpl(this.selection)) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(this, "");
                or.invoke(this);
            } else if (getHighSpeedVideoFpsRanges()) {
                setCursor(androidx.compose.ui.text.TextRange.m8036getMaximpl(this.selection));
            } else {
                setCursor(androidx.compose.ui.text.TextRange.m8037getMinimpl(this.selection));
            }
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(this, "");
        return this;
    }

    private final T getHighResolutionOutputSizeshNQ4ISI() {
        int precedingCharacterIndex;
        getState().resetCachedX();
        if (getText$foundation().length() > 0 && (precedingCharacterIndex = getPrecedingCharacterIndex()) != -1) {
            setCursor(precedingCharacterIndex);
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(this, "");
        return this;
    }

    private final T getHighSpeedVideoSizes() {
        int nextCharacterIndex;
        getState().resetCachedX();
        if (getText$foundation().length() > 0 && (nextCharacterIndex = getNextCharacterIndex()) != -1) {
            setCursor(nextCharacterIndex);
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(this, "");
        return this;
    }

    public final T moveCursorToHome() {
        getState().resetCachedX();
        if (getText$foundation().length() > 0) {
            setCursor(0);
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(this, "");
        return this;
    }

    public final T moveCursorToEnd() {
        getState().resetCachedX();
        if (getText$foundation().length() > 0) {
            setCursor(getText$foundation().length());
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(this, "");
        return this;
    }

    public final T moveCursorLeftByWord() {
        getState().resetCachedX();
        if (getText$foundation().length() > 0) {
            if (getHighSpeedVideoFpsRanges()) {
                getHighSpeedVideoFpsRangesFor();
            } else {
                Camera2StreamConfigurationMap();
            }
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(this, "");
        return this;
    }

    public final T moveCursorRightByWord() {
        getState().resetCachedX();
        if (getText$foundation().length() > 0) {
            if (getHighSpeedVideoFpsRanges()) {
                Camera2StreamConfigurationMap();
            } else {
                getHighSpeedVideoFpsRangesFor();
            }
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(this, "");
        return this;
    }

    private final T Camera2StreamConfigurationMap() {
        java.lang.Integer nextWordOffset;
        getState().resetCachedX();
        if (getText$foundation().length() > 0 && (nextWordOffset = getNextWordOffset()) != null) {
            setCursor(nextWordOffset.intValue());
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(this, "");
        return this;
    }

    private final T getHighSpeedVideoFpsRangesFor() {
        java.lang.Integer previousWordOffset;
        getState().resetCachedX();
        if (getText$foundation().length() > 0 && (previousWordOffset = getPreviousWordOffset()) != null) {
            setCursor(previousWordOffset.intValue());
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(this, "");
        return this;
    }

    public final T moveCursorPrevByParagraph() {
        getState().resetCachedX();
        if (getText$foundation().length() > 0) {
            int findParagraphStart = androidx.compose.foundation.text.StringHelpersKt.findParagraphStart(getText$foundation(), androidx.compose.ui.text.TextRange.m8037getMinimpl(this.selection));
            if (findParagraphStart == androidx.compose.ui.text.TextRange.m8037getMinimpl(this.selection) && findParagraphStart != 0) {
                findParagraphStart = androidx.compose.foundation.text.StringHelpersKt.findParagraphStart(getText$foundation(), findParagraphStart - 1);
            }
            setCursor(findParagraphStart);
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(this, "");
        return this;
    }

    public final T moveCursorNextByParagraph() {
        getState().resetCachedX();
        if (getText$foundation().length() > 0) {
            int findParagraphEnd = androidx.compose.foundation.text.StringHelpersKt.findParagraphEnd(getText$foundation(), androidx.compose.ui.text.TextRange.m8036getMaximpl(this.selection));
            if (findParagraphEnd == androidx.compose.ui.text.TextRange.m8036getMaximpl(this.selection) && findParagraphEnd != getText$foundation().length()) {
                findParagraphEnd = androidx.compose.foundation.text.StringHelpersKt.findParagraphEnd(getText$foundation(), findParagraphEnd + 1);
            }
            setCursor(findParagraphEnd);
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(this, "");
        return this;
    }

    public final T moveCursorUpByLine() {
        androidx.compose.ui.text.TextLayoutResult textLayoutResult;
        if (getText$foundation().length() > 0 && (textLayoutResult = this.layoutResult) != null) {
            setCursor(Camera2StreamConfigurationMap(textLayoutResult, -1));
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(this, "");
        return this;
    }

    public final T moveCursorDownByLine() {
        androidx.compose.ui.text.TextLayoutResult textLayoutResult;
        if (getText$foundation().length() > 0 && (textLayoutResult = this.layoutResult) != null) {
            setCursor(Camera2StreamConfigurationMap(textLayoutResult, 1));
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(this, "");
        return this;
    }

    public final T moveCursorToLineStart() {
        java.lang.Integer lineStartByOffset;
        getState().resetCachedX();
        if (getText$foundation().length() > 0 && (lineStartByOffset = getLineStartByOffset()) != null) {
            setCursor(lineStartByOffset.intValue());
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(this, "");
        return this;
    }

    public final T moveCursorToLineEnd() {
        java.lang.Integer lineEndByOffset;
        getState().resetCachedX();
        if (getText$foundation().length() > 0 && (lineEndByOffset = getLineEndByOffset()) != null) {
            setCursor(lineEndByOffset.intValue());
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(this, "");
        return this;
    }

    public final T moveCursorToLineLeftSide() {
        getState().resetCachedX();
        if (getText$foundation().length() > 0) {
            if (getHighSpeedVideoFpsRanges()) {
                moveCursorToLineStart();
            } else {
                moveCursorToLineEnd();
            }
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(this, "");
        return this;
    }

    public final T moveCursorToLineRightSide() {
        getState().resetCachedX();
        if (getText$foundation().length() > 0) {
            if (getHighSpeedVideoFpsRanges()) {
                moveCursorToLineEnd();
            } else {
                moveCursorToLineStart();
            }
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(this, "");
        return this;
    }

    public final T selectMovement() {
        if (getText$foundation().length() > 0) {
            this.selection = androidx.compose.ui.text.TextRangeKt.TextRange(androidx.compose.ui.text.TextRange.m8039getStartimpl(this.originalSelection), androidx.compose.ui.text.TextRange.m8034getEndimpl(this.selection));
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(this, "");
        return this;
    }

    private final int Camera2StreamConfigurationMap(androidx.compose.ui.text.TextLayoutResult textLayoutResult, int i) {
        int originalToTransformed = this.offsetMapping.originalToTransformed(androidx.compose.ui.text.TextRange.m8034getEndimpl(this.selection));
        if (this.state.getCachedX() == null) {
            this.state.setCachedX(java.lang.Float.valueOf(textLayoutResult.getCursorRect(originalToTransformed).getLeft()));
        }
        int lineForOffset = textLayoutResult.getLineForOffset(originalToTransformed) + i;
        if (lineForOffset < 0) {
            return 0;
        }
        if (lineForOffset >= textLayoutResult.getLineCount()) {
            return getText$foundation().length();
        }
        float lineBottom = textLayoutResult.getLineBottom(lineForOffset);
        java.lang.Float cachedX = this.state.getCachedX();
        kotlin.jvm.internal.Intrinsics.checkNotNull(cachedX);
        float floatValue = cachedX.floatValue();
        if ((getHighSpeedVideoFpsRanges() && floatValue >= textLayoutResult.getLineRight(lineForOffset)) || (!getHighSpeedVideoFpsRanges() && floatValue <= textLayoutResult.getLineLeft(lineForOffset))) {
            return textLayoutResult.getLineEnd(lineForOffset, true);
        }
        return this.offsetMapping.transformedToOriginal(textLayoutResult.m8011getOffsetForPositionk4lQ0M(androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(r1.floatValue()) << 32) | (java.lang.Float.floatToRawIntBits(lineBottom - 1.0f) & 4294967295L))));
    }

    public /* synthetic */ BaseTextPreparedSelection(androidx.compose.ui.text.AnnotatedString annotatedString, long j, androidx.compose.ui.text.TextLayoutResult textLayoutResult, androidx.compose.ui.text.input.OffsetMapping offsetMapping, androidx.compose.foundation.text.selection.TextPreparedSelectionState textPreparedSelectionState, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, j, textLayoutResult, offsetMapping, textPreparedSelectionState);
    }
}
