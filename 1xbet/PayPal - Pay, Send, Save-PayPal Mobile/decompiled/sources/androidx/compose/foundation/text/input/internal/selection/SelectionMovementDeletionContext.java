package androidx.compose.foundation.text.input.internal.selection;

@kotlin.Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b'\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u0000 ]2\u00020\u0001:\u0001]B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0000¢\u0006\u0004\b\u0010\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0000¢\u0006\u0004\b\u0011\u0010\u000fJ\r\u0010\u0012\u001a\u00020\u0000¢\u0006\u0004\b\u0012\u0010\u000fJ&\u0010\u0017\u001a\u00020\u00002\u0017\u0010\u0016\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\u0002\b\u0015¢\u0006\u0004\b\u0017\u0010\u0018J&\u0010\u0019\u001a\u00020\u00002\u0017\u0010\u0016\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\u0002\b\u0015¢\u0006\u0004\b\u0019\u0010\u0018J\r\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u001a¢\u0006\u0004\b\u001d\u0010\u001cJ\r\u0010\u001e\u001a\u00020\u0000¢\u0006\u0004\b\u001e\u0010\u000fJ\r\u0010\u001f\u001a\u00020\u0000¢\u0006\u0004\b\u001f\u0010\u000fJ\r\u0010 \u001a\u00020\u0000¢\u0006\u0004\b \u0010\u000fJ\r\u0010!\u001a\u00020\u0000¢\u0006\u0004\b!\u0010\u000fJ\r\u0010\"\u001a\u00020\u0000¢\u0006\u0004\b\"\u0010\u000fJ\r\u0010#\u001a\u00020\u0000¢\u0006\u0004\b#\u0010\u000fJ\r\u0010$\u001a\u00020\u0000¢\u0006\u0004\b$\u0010\u000fJ\r\u0010%\u001a\u00020\u0000¢\u0006\u0004\b%\u0010\u000fJ\r\u0010&\u001a\u00020\u0000¢\u0006\u0004\b&\u0010\u000fJ\r\u0010'\u001a\u00020\u0000¢\u0006\u0004\b'\u0010\u000fJ\r\u0010(\u001a\u00020\u0000¢\u0006\u0004\b(\u0010\u000fJ\r\u0010)\u001a\u00020\u0000¢\u0006\u0004\b)\u0010\u000fJ\r\u0010*\u001a\u00020\u0000¢\u0006\u0004\b*\u0010\u000fJ\r\u0010+\u001a\u00020\u0000¢\u0006\u0004\b+\u0010\u000fJ\r\u0010,\u001a\u00020\u0000¢\u0006\u0004\b,\u0010\u000fJ\r\u0010-\u001a\u00020\u0000¢\u0006\u0004\b-\u0010\u000fJ\r\u0010.\u001a\u00020\u0000¢\u0006\u0004\b.\u0010\u000fJ\r\u0010/\u001a\u00020\u0000¢\u0006\u0004\b/\u0010\u000fJ\r\u00100\u001a\u00020\u0000¢\u0006\u0004\b0\u0010\u000fJ\r\u00101\u001a\u00020\u0000¢\u0006\u0004\b1\u0010\u000fJ\r\u00102\u001a\u00020\u0000¢\u0006\u0004\b2\u0010\u000fJ\u000f\u00103\u001a\u00020\u0006H\u0002¢\u0006\u0004\b3\u00104J\u001b\u00106\u001a\u00020\u001a*\u00020\u00042\u0006\u00105\u001a\u00020\u001aH\u0002¢\u0006\u0004\b6\u00107J\u0017\u00106\u001a\u00020\u001a2\u0006\u00105\u001a\u00020\u001aH\u0002¢\u0006\u0004\b6\u00108R\u0014\u0010:\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00109R\u0016\u0010<\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010;R\u0014\u0010>\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010=R\u0014\u00106\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u00103\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010AR\u0017\u0010C\u001a\u00020B8\u0007¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u001a\u0010H\u001a\u00020G8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\"\u0010M\u001a\u00020L8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR$\u0010T\u001a\u0004\u0018\u00010S8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\u0014\u0010\\\u001a\u00020Z8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b<\u0010["}, d2 = {"Landroidx/compose/foundation/text/input/internal/selection/SelectionMovementDeletionContext;", "", "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "state", "Landroidx/compose/ui/text/TextLayoutResult;", "textLayoutResult", "", "isFromSoftKeyboard", "", "visibleTextLayoutHeight", "Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelectionState;", "textPreparedSelectionState", "<init>", "(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroidx/compose/ui/text/TextLayoutResult;ZFLandroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelectionState;)V", "selectAll", "()Landroidx/compose/foundation/text/input/internal/selection/SelectionMovementDeletionContext;", "deselect", "moveCursorLeftByChar", "moveCursorRightByChar", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "or", "collapseLeftOr", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/foundation/text/input/internal/selection/SelectionMovementDeletionContext;", "collapseRightOr", "", "getPrecedingCharacterIndex", "()I", "getNextCharacterIndex", "moveCursorPrevByCodePointOrEmoji", "moveCursorPrevByChar", "moveCursorNextByChar", "moveCursorToHome", "moveCursorToEnd", "moveCursorLeftByWord", "moveCursorRightByWord", "moveCursorNextByWord", "moveCursorPrevByWord", "moveCursorPrevByParagraph", "moveCursorNextByParagraph", "moveCursorUpByLine", "moveCursorDownByLine", "moveCursorToLineLeftSide", "moveCursorToLineRightSide", "moveCursorToLineStart", "moveCursorToLineEnd", "moveCursorUpByPage", "moveCursorDownByPage", "selectMovement", "deleteMovement", "getHighSpeedVideoFpsRanges", "()Z", "p0", "Camera2StreamConfigurationMap", "(Landroidx/compose/ui/text/TextLayoutResult;I)I", "(I)I", "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/ui/text/TextLayoutResult;", "getHighSpeedVideoSizes", "Z", "getHighResolutionOutputSizeshNQ4ISI", "getOutputMinFrameDuration", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelectionState;", "Landroidx/compose/foundation/text/input/TextFieldCharSequence;", "initialValue", "Landroidx/compose/foundation/text/input/TextFieldCharSequence;", "getInitialValue", "()Landroidx/compose/foundation/text/input/TextFieldCharSequence;", "Landroidx/compose/foundation/text/input/internal/SelectionWedgeAffinity;", "initialWedgeAffinity", "Landroidx/compose/foundation/text/input/internal/SelectionWedgeAffinity;", "getInitialWedgeAffinity", "()Landroidx/compose/foundation/text/input/internal/SelectionWedgeAffinity;", "Landroidx/compose/ui/text/TextRange;", "selection", "J", "getSelection-d9O1mEE", "()J", "setSelection-5zc-tL8", "(J)V", "Landroidx/compose/foundation/text/input/internal/WedgeAffinity;", "wedgeAffinity", "Landroidx/compose/foundation/text/input/internal/WedgeAffinity;", "getWedgeAffinity", "()Landroidx/compose/foundation/text/input/internal/WedgeAffinity;", "setWedgeAffinity", "(Landroidx/compose/foundation/text/input/internal/WedgeAffinity;)V", "", "Ljava/lang/String;", "getInputSizeshNQ4ISI", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SelectionMovementDeletionContext {
    public static final int NoCharacterFound = -1;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.compose.ui.text.TextLayoutResult getHighSpeedVideoSizes;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.compose.foundation.text.input.internal.selection.TextFieldPreparedSelectionState getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.compose.foundation.text.input.internal.TransformedTextFieldState getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final boolean getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.lang.String getInputSizeshNQ4ISI;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final float Camera2StreamConfigurationMap;
    private final androidx.compose.foundation.text.input.TextFieldCharSequence initialValue;
    private final androidx.compose.foundation.text.input.internal.SelectionWedgeAffinity initialWedgeAffinity;
    private long selection;
    private androidx.compose.foundation.text.input.internal.WedgeAffinity wedgeAffinity;
    public static final int $stable = 8;

    public SelectionMovementDeletionContext(androidx.compose.foundation.text.input.internal.TransformedTextFieldState transformedTextFieldState, androidx.compose.ui.text.TextLayoutResult textLayoutResult, boolean z, float f, androidx.compose.foundation.text.input.internal.selection.TextFieldPreparedSelectionState textFieldPreparedSelectionState) {
        this.getHighSpeedVideoFpsRangesFor = transformedTextFieldState;
        this.getHighSpeedVideoSizes = textLayoutResult;
        this.getHighResolutionOutputSizeshNQ4ISI = z;
        this.Camera2StreamConfigurationMap = f;
        this.getHighSpeedVideoFpsRanges = textFieldPreparedSelectionState;
        androidx.compose.runtime.snapshots.Snapshot.Companion companion = androidx.compose.runtime.snapshots.Snapshot.INSTANCE;
        androidx.compose.runtime.snapshots.Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
        kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        androidx.compose.runtime.snapshots.Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            androidx.compose.foundation.text.input.TextFieldCharSequence visualText = transformedTextFieldState.getVisualText();
            this.initialValue = visualText;
            this.initialWedgeAffinity = transformedTextFieldState.getSelectionWedgeAffinity();
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
            this.selection = visualText.getSelection();
            this.getInputSizeshNQ4ISI = visualText.getText().toString();
        } catch (java.lang.Throwable th) {
            companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
            throw th;
        }
    }

    public final androidx.compose.foundation.text.input.TextFieldCharSequence getInitialValue() {
        return this.initialValue;
    }

    public final androidx.compose.foundation.text.input.internal.SelectionWedgeAffinity getInitialWedgeAffinity() {
        return this.initialWedgeAffinity;
    }

    /* renamed from: getSelection-d9O1mEE, reason: not valid java name and from getter */
    public final long getSelection() {
        return this.selection;
    }

    /* renamed from: setSelection-5zc-tL8, reason: not valid java name */
    public final void m2291setSelection5zctL8(long j) {
        this.selection = j;
    }

    public final androidx.compose.foundation.text.input.internal.WedgeAffinity getWedgeAffinity() {
        return this.wedgeAffinity;
    }

    public final void setWedgeAffinity(androidx.compose.foundation.text.input.internal.WedgeAffinity wedgeAffinity) {
        this.wedgeAffinity = wedgeAffinity;
    }

    public final androidx.compose.foundation.text.input.internal.selection.SelectionMovementDeletionContext moveCursorLeftByChar() {
        if (getHighSpeedVideoFpsRanges()) {
            return moveCursorPrevByChar();
        }
        return moveCursorNextByChar();
    }

    public final androidx.compose.foundation.text.input.internal.selection.SelectionMovementDeletionContext moveCursorRightByChar() {
        if (getHighSpeedVideoFpsRanges()) {
            return moveCursorNextByChar();
        }
        return moveCursorPrevByChar();
    }

    public final int getPrecedingCharacterIndex() {
        return androidx.compose.foundation.text.StringHelpers_androidKt.findPrecedingBreak(this.getInputSizeshNQ4ISI, androidx.compose.ui.text.TextRange.m8034getEndimpl(this.selection));
    }

    public final int getNextCharacterIndex() {
        return androidx.compose.foundation.text.StringHelpers_androidKt.findFollowingBreak(this.getInputSizeshNQ4ISI, androidx.compose.ui.text.TextRange.m8034getEndimpl(this.selection));
    }

    public final androidx.compose.foundation.text.input.internal.selection.SelectionMovementDeletionContext moveCursorLeftByWord() {
        if (getHighSpeedVideoFpsRanges()) {
            return moveCursorPrevByWord();
        }
        return moveCursorNextByWord();
    }

    public final androidx.compose.foundation.text.input.internal.selection.SelectionMovementDeletionContext moveCursorRightByWord() {
        if (getHighSpeedVideoFpsRanges()) {
            return moveCursorNextByWord();
        }
        return moveCursorPrevByWord();
    }

    public final androidx.compose.foundation.text.input.internal.selection.SelectionMovementDeletionContext moveCursorUpByLine() {
        androidx.compose.ui.text.TextLayoutResult textLayoutResult = this.getHighSpeedVideoSizes;
        int Camera2StreamConfigurationMap = textLayoutResult != null ? Camera2StreamConfigurationMap(textLayoutResult, -1) : Integer.MIN_VALUE;
        if (Camera2StreamConfigurationMap == Integer.MIN_VALUE) {
            this.getHighSpeedVideoFpsRanges.resetCachedX();
        }
        if (this.getInputSizeshNQ4ISI.length() > 0) {
            int m8034getEndimpl = androidx.compose.ui.text.TextRange.m8034getEndimpl(getSelection());
            long calculateNextCursorPositionAndWedgeAffinity = androidx.compose.foundation.text.input.internal.selection.TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(kotlin.ranges.RangesKt.coerceAtLeast(Camera2StreamConfigurationMap, 0), m8034getEndimpl, this.getHighSpeedVideoFpsRangesFor);
            int m2278component1impl = androidx.compose.foundation.text.input.internal.selection.CursorAndWedgeAffinity.m2278component1impl(calculateNextCursorPositionAndWedgeAffinity);
            androidx.compose.foundation.text.input.internal.WedgeAffinity m2279component2impl = androidx.compose.foundation.text.input.internal.selection.CursorAndWedgeAffinity.m2279component2impl(calculateNextCursorPositionAndWedgeAffinity);
            if (m2278component1impl != m8034getEndimpl || !androidx.compose.ui.text.TextRange.m8033getCollapsedimpl(getSelection())) {
                m2291setSelection5zctL8(androidx.compose.ui.text.TextRangeKt.TextRange(m2278component1impl));
            }
            if (m2279component2impl != null) {
                setWedgeAffinity(m2279component2impl);
            }
        }
        return this;
    }

    public final androidx.compose.foundation.text.input.internal.selection.SelectionMovementDeletionContext moveCursorDownByLine() {
        androidx.compose.ui.text.TextLayoutResult textLayoutResult = this.getHighSpeedVideoSizes;
        int Camera2StreamConfigurationMap = textLayoutResult != null ? Camera2StreamConfigurationMap(textLayoutResult, 1) : Integer.MAX_VALUE;
        if (Camera2StreamConfigurationMap == Integer.MAX_VALUE) {
            this.getHighSpeedVideoFpsRanges.resetCachedX();
        }
        if (this.getInputSizeshNQ4ISI.length() > 0) {
            int m8034getEndimpl = androidx.compose.ui.text.TextRange.m8034getEndimpl(getSelection());
            long calculateNextCursorPositionAndWedgeAffinity = androidx.compose.foundation.text.input.internal.selection.TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(kotlin.ranges.RangesKt.coerceAtMost(Camera2StreamConfigurationMap, this.getInputSizeshNQ4ISI.length()), m8034getEndimpl, this.getHighSpeedVideoFpsRangesFor);
            int m2278component1impl = androidx.compose.foundation.text.input.internal.selection.CursorAndWedgeAffinity.m2278component1impl(calculateNextCursorPositionAndWedgeAffinity);
            androidx.compose.foundation.text.input.internal.WedgeAffinity m2279component2impl = androidx.compose.foundation.text.input.internal.selection.CursorAndWedgeAffinity.m2279component2impl(calculateNextCursorPositionAndWedgeAffinity);
            if (m2278component1impl != m8034getEndimpl || !androidx.compose.ui.text.TextRange.m8033getCollapsedimpl(getSelection())) {
                m2291setSelection5zctL8(androidx.compose.ui.text.TextRangeKt.TextRange(m2278component1impl));
            }
            if (m2279component2impl != null) {
                setWedgeAffinity(m2279component2impl);
            }
        }
        return this;
    }

    public final androidx.compose.foundation.text.input.internal.selection.SelectionMovementDeletionContext moveCursorToLineLeftSide() {
        if (getHighSpeedVideoFpsRanges()) {
            return moveCursorToLineStart();
        }
        return moveCursorToLineEnd();
    }

    public final androidx.compose.foundation.text.input.internal.selection.SelectionMovementDeletionContext moveCursorToLineRightSide() {
        if (getHighSpeedVideoFpsRanges()) {
            return moveCursorToLineEnd();
        }
        return moveCursorToLineStart();
    }

    private final boolean getHighSpeedVideoFpsRanges() {
        androidx.compose.ui.text.style.ResolvedTextDirection paragraphDirection;
        androidx.compose.ui.text.TextLayoutResult textLayoutResult = this.getHighSpeedVideoSizes;
        return textLayoutResult == null || (paragraphDirection = textLayoutResult.getParagraphDirection(androidx.compose.ui.text.TextRange.m8034getEndimpl(this.selection))) == null || paragraphDirection == androidx.compose.ui.text.style.ResolvedTextDirection.Ltr;
    }

    private final int Camera2StreamConfigurationMap(androidx.compose.ui.text.TextLayoutResult textLayoutResult, int i) {
        int m8034getEndimpl = androidx.compose.ui.text.TextRange.m8034getEndimpl(this.selection);
        if (java.lang.Float.isNaN(this.getHighSpeedVideoFpsRanges.getCachedX())) {
            this.getHighSpeedVideoFpsRanges.setCachedX(textLayoutResult.getCursorRect(m8034getEndimpl).getLeft());
        }
        int lineForOffset = textLayoutResult.getLineForOffset(m8034getEndimpl) + i;
        if (lineForOffset < 0) {
            return Integer.MIN_VALUE;
        }
        if (lineForOffset >= textLayoutResult.getLineCount()) {
            return Integer.MAX_VALUE;
        }
        float lineBottom = textLayoutResult.getLineBottom(lineForOffset);
        float cachedX = this.getHighSpeedVideoFpsRanges.getCachedX();
        if ((getHighSpeedVideoFpsRanges() && cachedX >= textLayoutResult.getLineRight(lineForOffset)) || (!getHighSpeedVideoFpsRanges() && cachedX <= textLayoutResult.getLineLeft(lineForOffset))) {
            return textLayoutResult.getLineEnd(lineForOffset, true);
        }
        return textLayoutResult.m8011getOffsetForPositionk4lQ0M(androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(cachedX) << 32) | (java.lang.Float.floatToRawIntBits(lineBottom - 1.0f) & 4294967295L)));
    }

    private final int Camera2StreamConfigurationMap(int p0) {
        int m8034getEndimpl = androidx.compose.ui.text.TextRange.m8034getEndimpl(this.initialValue.getSelection());
        if (this.getHighSpeedVideoSizes == null || java.lang.Float.isNaN(this.Camera2StreamConfigurationMap)) {
            return m8034getEndimpl;
        }
        androidx.compose.ui.geometry.Rect translate = this.getHighSpeedVideoSizes.getCursorRect(m8034getEndimpl).translate(0.0f, this.Camera2StreamConfigurationMap * p0);
        float lineBottom = this.getHighSpeedVideoSizes.getLineBottom(this.getHighSpeedVideoSizes.getLineForVerticalPosition(translate.getTop()));
        if (java.lang.Math.abs(translate.getTop() - lineBottom) > java.lang.Math.abs(translate.getBottom() - lineBottom)) {
            return this.getHighSpeedVideoSizes.m8011getOffsetForPositionk4lQ0M(translate.m5787getTopLeftF1C5BW0());
        }
        return this.getHighSpeedVideoSizes.m8011getOffsetForPositionk4lQ0M(translate.m5780getBottomLeftF1C5BW0());
    }

    public final androidx.compose.foundation.text.input.internal.selection.SelectionMovementDeletionContext selectAll() {
        this.getHighSpeedVideoFpsRanges.resetCachedX();
        if (this.getInputSizeshNQ4ISI.length() > 0) {
            this.selection = androidx.compose.ui.text.TextRangeKt.TextRange(0, this.getInputSizeshNQ4ISI.length());
        }
        return this;
    }

    public final androidx.compose.foundation.text.input.internal.selection.SelectionMovementDeletionContext deselect() {
        this.getHighSpeedVideoFpsRanges.resetCachedX();
        if (this.getInputSizeshNQ4ISI.length() > 0) {
            this.selection = androidx.compose.ui.text.TextRangeKt.TextRange(androidx.compose.ui.text.TextRange.m8034getEndimpl(this.selection));
        }
        return this;
    }

    public final androidx.compose.foundation.text.input.internal.selection.SelectionMovementDeletionContext collapseLeftOr(kotlin.jvm.functions.Function1<? super androidx.compose.foundation.text.input.internal.selection.SelectionMovementDeletionContext, kotlin.Unit> or) {
        this.getHighSpeedVideoFpsRanges.resetCachedX();
        if (this.getInputSizeshNQ4ISI.length() > 0) {
            if (androidx.compose.ui.text.TextRange.m8033getCollapsedimpl(this.selection)) {
                or.invoke(this);
                return this;
            }
            if (getHighSpeedVideoFpsRanges()) {
                this.selection = androidx.compose.ui.text.TextRangeKt.TextRange(androidx.compose.ui.text.TextRange.m8037getMinimpl(this.selection));
                return this;
            }
            this.selection = androidx.compose.ui.text.TextRangeKt.TextRange(androidx.compose.ui.text.TextRange.m8036getMaximpl(this.selection));
        }
        return this;
    }

    public final androidx.compose.foundation.text.input.internal.selection.SelectionMovementDeletionContext collapseRightOr(kotlin.jvm.functions.Function1<? super androidx.compose.foundation.text.input.internal.selection.SelectionMovementDeletionContext, kotlin.Unit> or) {
        this.getHighSpeedVideoFpsRanges.resetCachedX();
        if (this.getInputSizeshNQ4ISI.length() > 0) {
            if (androidx.compose.ui.text.TextRange.m8033getCollapsedimpl(this.selection)) {
                or.invoke(this);
                return this;
            }
            if (getHighSpeedVideoFpsRanges()) {
                this.selection = androidx.compose.ui.text.TextRangeKt.TextRange(androidx.compose.ui.text.TextRange.m8036getMaximpl(this.selection));
                return this;
            }
            this.selection = androidx.compose.ui.text.TextRangeKt.TextRange(androidx.compose.ui.text.TextRange.m8037getMinimpl(this.selection));
        }
        return this;
    }

    public final androidx.compose.foundation.text.input.internal.selection.SelectionMovementDeletionContext moveCursorPrevByCodePointOrEmoji() {
        this.getHighSpeedVideoFpsRanges.resetCachedX();
        if (this.getInputSizeshNQ4ISI.length() > 0) {
            int m8034getEndimpl = androidx.compose.ui.text.TextRange.m8034getEndimpl(getSelection());
            long calculateNextCursorPositionAndWedgeAffinity = androidx.compose.foundation.text.input.internal.selection.TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(androidx.compose.foundation.text.StringHelpers_androidKt.findCodePointOrEmojiStartBefore(this.getInputSizeshNQ4ISI, androidx.compose.ui.text.TextRange.m8034getEndimpl(this.selection), -1), m8034getEndimpl, this.getHighSpeedVideoFpsRangesFor);
            int m2278component1impl = androidx.compose.foundation.text.input.internal.selection.CursorAndWedgeAffinity.m2278component1impl(calculateNextCursorPositionAndWedgeAffinity);
            androidx.compose.foundation.text.input.internal.WedgeAffinity m2279component2impl = androidx.compose.foundation.text.input.internal.selection.CursorAndWedgeAffinity.m2279component2impl(calculateNextCursorPositionAndWedgeAffinity);
            if (m2278component1impl != m8034getEndimpl || !androidx.compose.ui.text.TextRange.m8033getCollapsedimpl(getSelection())) {
                m2291setSelection5zctL8(androidx.compose.ui.text.TextRangeKt.TextRange(m2278component1impl));
            }
            if (m2279component2impl != null) {
                setWedgeAffinity(m2279component2impl);
            }
        }
        return this;
    }

    public final androidx.compose.foundation.text.input.internal.selection.SelectionMovementDeletionContext moveCursorPrevByChar() {
        this.getHighSpeedVideoFpsRanges.resetCachedX();
        if (this.getInputSizeshNQ4ISI.length() > 0) {
            int m8034getEndimpl = androidx.compose.ui.text.TextRange.m8034getEndimpl(getSelection());
            long calculateNextCursorPositionAndWedgeAffinity = androidx.compose.foundation.text.input.internal.selection.TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(androidx.compose.foundation.text.StringHelpers_androidKt.findPrecedingBreak(this.getInputSizeshNQ4ISI, androidx.compose.ui.text.TextRange.m8034getEndimpl(this.selection)), m8034getEndimpl, this.getHighSpeedVideoFpsRangesFor);
            int m2278component1impl = androidx.compose.foundation.text.input.internal.selection.CursorAndWedgeAffinity.m2278component1impl(calculateNextCursorPositionAndWedgeAffinity);
            androidx.compose.foundation.text.input.internal.WedgeAffinity m2279component2impl = androidx.compose.foundation.text.input.internal.selection.CursorAndWedgeAffinity.m2279component2impl(calculateNextCursorPositionAndWedgeAffinity);
            if (m2278component1impl != m8034getEndimpl || !androidx.compose.ui.text.TextRange.m8033getCollapsedimpl(getSelection())) {
                m2291setSelection5zctL8(androidx.compose.ui.text.TextRangeKt.TextRange(m2278component1impl));
            }
            if (m2279component2impl != null) {
                setWedgeAffinity(m2279component2impl);
            }
        }
        return this;
    }

    public final androidx.compose.foundation.text.input.internal.selection.SelectionMovementDeletionContext moveCursorNextByChar() {
        this.getHighSpeedVideoFpsRanges.resetCachedX();
        if (this.getInputSizeshNQ4ISI.length() > 0) {
            int m8034getEndimpl = androidx.compose.ui.text.TextRange.m8034getEndimpl(getSelection());
            long calculateNextCursorPositionAndWedgeAffinity = androidx.compose.foundation.text.input.internal.selection.TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(androidx.compose.foundation.text.StringHelpers_androidKt.findFollowingBreak(this.getInputSizeshNQ4ISI, androidx.compose.ui.text.TextRange.m8034getEndimpl(this.selection)), m8034getEndimpl, this.getHighSpeedVideoFpsRangesFor);
            int m2278component1impl = androidx.compose.foundation.text.input.internal.selection.CursorAndWedgeAffinity.m2278component1impl(calculateNextCursorPositionAndWedgeAffinity);
            androidx.compose.foundation.text.input.internal.WedgeAffinity m2279component2impl = androidx.compose.foundation.text.input.internal.selection.CursorAndWedgeAffinity.m2279component2impl(calculateNextCursorPositionAndWedgeAffinity);
            if (m2278component1impl != m8034getEndimpl || !androidx.compose.ui.text.TextRange.m8033getCollapsedimpl(getSelection())) {
                m2291setSelection5zctL8(androidx.compose.ui.text.TextRangeKt.TextRange(m2278component1impl));
            }
            if (m2279component2impl != null) {
                setWedgeAffinity(m2279component2impl);
            }
        }
        return this;
    }

    public final androidx.compose.foundation.text.input.internal.selection.SelectionMovementDeletionContext moveCursorToHome() {
        this.getHighSpeedVideoFpsRanges.resetCachedX();
        if (this.getInputSizeshNQ4ISI.length() > 0) {
            int m8034getEndimpl = androidx.compose.ui.text.TextRange.m8034getEndimpl(getSelection());
            long calculateNextCursorPositionAndWedgeAffinity = androidx.compose.foundation.text.input.internal.selection.TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(0, m8034getEndimpl, this.getHighSpeedVideoFpsRangesFor);
            int m2278component1impl = androidx.compose.foundation.text.input.internal.selection.CursorAndWedgeAffinity.m2278component1impl(calculateNextCursorPositionAndWedgeAffinity);
            androidx.compose.foundation.text.input.internal.WedgeAffinity m2279component2impl = androidx.compose.foundation.text.input.internal.selection.CursorAndWedgeAffinity.m2279component2impl(calculateNextCursorPositionAndWedgeAffinity);
            if (m2278component1impl != m8034getEndimpl || !androidx.compose.ui.text.TextRange.m8033getCollapsedimpl(getSelection())) {
                m2291setSelection5zctL8(androidx.compose.ui.text.TextRangeKt.TextRange(m2278component1impl));
            }
            if (m2279component2impl != null) {
                setWedgeAffinity(m2279component2impl);
            }
        }
        return this;
    }

    public final androidx.compose.foundation.text.input.internal.selection.SelectionMovementDeletionContext moveCursorToEnd() {
        this.getHighSpeedVideoFpsRanges.resetCachedX();
        if (this.getInputSizeshNQ4ISI.length() > 0) {
            int m8034getEndimpl = androidx.compose.ui.text.TextRange.m8034getEndimpl(getSelection());
            long calculateNextCursorPositionAndWedgeAffinity = androidx.compose.foundation.text.input.internal.selection.TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(this.getInputSizeshNQ4ISI.length(), m8034getEndimpl, this.getHighSpeedVideoFpsRangesFor);
            int m2278component1impl = androidx.compose.foundation.text.input.internal.selection.CursorAndWedgeAffinity.m2278component1impl(calculateNextCursorPositionAndWedgeAffinity);
            androidx.compose.foundation.text.input.internal.WedgeAffinity m2279component2impl = androidx.compose.foundation.text.input.internal.selection.CursorAndWedgeAffinity.m2279component2impl(calculateNextCursorPositionAndWedgeAffinity);
            if (m2278component1impl != m8034getEndimpl || !androidx.compose.ui.text.TextRange.m8033getCollapsedimpl(getSelection())) {
                m2291setSelection5zctL8(androidx.compose.ui.text.TextRangeKt.TextRange(m2278component1impl));
            }
            if (m2279component2impl != null) {
                setWedgeAffinity(m2279component2impl);
            }
        }
        return this;
    }

    public final androidx.compose.foundation.text.input.internal.selection.SelectionMovementDeletionContext moveCursorNextByWord() {
        int length;
        this.getHighSpeedVideoFpsRanges.resetCachedX();
        if (this.getInputSizeshNQ4ISI.length() > 0) {
            int m8034getEndimpl = androidx.compose.ui.text.TextRange.m8034getEndimpl(getSelection());
            androidx.compose.ui.text.TextLayoutResult textLayoutResult = this.getHighSpeedVideoSizes;
            if (textLayoutResult == null) {
                length = this.getInputSizeshNQ4ISI.length();
            } else {
                int m8034getEndimpl2 = androidx.compose.ui.text.TextRange.m8034getEndimpl(this.selection);
                while (true) {
                    if (m8034getEndimpl2 >= this.initialValue.length()) {
                        length = this.initialValue.length();
                        break;
                    }
                    long m8013getWordBoundaryjx7JFs = textLayoutResult.m8013getWordBoundaryjx7JFs(kotlin.ranges.RangesKt.coerceAtMost(m8034getEndimpl2, this.getInputSizeshNQ4ISI.length() - 1));
                    if (androidx.compose.ui.text.TextRange.m8034getEndimpl(m8013getWordBoundaryjx7JFs) > m8034getEndimpl2) {
                        length = androidx.compose.ui.text.TextRange.m8034getEndimpl(m8013getWordBoundaryjx7JFs);
                        break;
                    }
                    m8034getEndimpl2++;
                }
            }
            long calculateNextCursorPositionAndWedgeAffinity = androidx.compose.foundation.text.input.internal.selection.TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(length, m8034getEndimpl, this.getHighSpeedVideoFpsRangesFor);
            int m2278component1impl = androidx.compose.foundation.text.input.internal.selection.CursorAndWedgeAffinity.m2278component1impl(calculateNextCursorPositionAndWedgeAffinity);
            androidx.compose.foundation.text.input.internal.WedgeAffinity m2279component2impl = androidx.compose.foundation.text.input.internal.selection.CursorAndWedgeAffinity.m2279component2impl(calculateNextCursorPositionAndWedgeAffinity);
            if (m2278component1impl != m8034getEndimpl || !androidx.compose.ui.text.TextRange.m8033getCollapsedimpl(getSelection())) {
                m2291setSelection5zctL8(androidx.compose.ui.text.TextRangeKt.TextRange(m2278component1impl));
            }
            if (m2279component2impl != null) {
                setWedgeAffinity(m2279component2impl);
            }
        }
        return this;
    }

    public final androidx.compose.foundation.text.input.internal.selection.SelectionMovementDeletionContext moveCursorPrevByWord() {
        this.getHighSpeedVideoFpsRanges.resetCachedX();
        if (this.getInputSizeshNQ4ISI.length() > 0) {
            int m8034getEndimpl = androidx.compose.ui.text.TextRange.m8034getEndimpl(getSelection());
            androidx.compose.ui.text.TextLayoutResult textLayoutResult = this.getHighSpeedVideoSizes;
            int i = 0;
            if (textLayoutResult != null) {
                int m8034getEndimpl2 = androidx.compose.ui.text.TextRange.m8034getEndimpl(this.selection);
                while (true) {
                    if (m8034getEndimpl2 > 0) {
                        long m8013getWordBoundaryjx7JFs = textLayoutResult.m8013getWordBoundaryjx7JFs(kotlin.ranges.RangesKt.coerceAtMost(m8034getEndimpl2, this.getInputSizeshNQ4ISI.length() - 1));
                        if (androidx.compose.ui.text.TextRange.m8039getStartimpl(m8013getWordBoundaryjx7JFs) < m8034getEndimpl2) {
                            i = androidx.compose.ui.text.TextRange.m8039getStartimpl(m8013getWordBoundaryjx7JFs);
                            break;
                        }
                        m8034getEndimpl2--;
                    } else {
                        break;
                    }
                }
            }
            long calculateNextCursorPositionAndWedgeAffinity = androidx.compose.foundation.text.input.internal.selection.TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(i, m8034getEndimpl, this.getHighSpeedVideoFpsRangesFor);
            int m2278component1impl = androidx.compose.foundation.text.input.internal.selection.CursorAndWedgeAffinity.m2278component1impl(calculateNextCursorPositionAndWedgeAffinity);
            androidx.compose.foundation.text.input.internal.WedgeAffinity m2279component2impl = androidx.compose.foundation.text.input.internal.selection.CursorAndWedgeAffinity.m2279component2impl(calculateNextCursorPositionAndWedgeAffinity);
            if (m2278component1impl != m8034getEndimpl || !androidx.compose.ui.text.TextRange.m8033getCollapsedimpl(getSelection())) {
                m2291setSelection5zctL8(androidx.compose.ui.text.TextRangeKt.TextRange(m2278component1impl));
            }
            if (m2279component2impl != null) {
                setWedgeAffinity(m2279component2impl);
            }
        }
        return this;
    }

    public final androidx.compose.foundation.text.input.internal.selection.SelectionMovementDeletionContext moveCursorPrevByParagraph() {
        this.getHighSpeedVideoFpsRanges.resetCachedX();
        if (this.getInputSizeshNQ4ISI.length() > 0) {
            int m8034getEndimpl = androidx.compose.ui.text.TextRange.m8034getEndimpl(getSelection());
            int findParagraphStart = androidx.compose.foundation.text.StringHelpersKt.findParagraphStart(this.getInputSizeshNQ4ISI, androidx.compose.ui.text.TextRange.m8037getMinimpl(this.selection));
            if (findParagraphStart == androidx.compose.ui.text.TextRange.m8037getMinimpl(this.selection) && findParagraphStart != 0) {
                findParagraphStart = androidx.compose.foundation.text.StringHelpersKt.findParagraphStart(this.getInputSizeshNQ4ISI, findParagraphStart - 1);
            }
            long calculateNextCursorPositionAndWedgeAffinity = androidx.compose.foundation.text.input.internal.selection.TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(findParagraphStart, m8034getEndimpl, this.getHighSpeedVideoFpsRangesFor);
            int m2278component1impl = androidx.compose.foundation.text.input.internal.selection.CursorAndWedgeAffinity.m2278component1impl(calculateNextCursorPositionAndWedgeAffinity);
            androidx.compose.foundation.text.input.internal.WedgeAffinity m2279component2impl = androidx.compose.foundation.text.input.internal.selection.CursorAndWedgeAffinity.m2279component2impl(calculateNextCursorPositionAndWedgeAffinity);
            if (m2278component1impl != m8034getEndimpl || !androidx.compose.ui.text.TextRange.m8033getCollapsedimpl(getSelection())) {
                m2291setSelection5zctL8(androidx.compose.ui.text.TextRangeKt.TextRange(m2278component1impl));
            }
            if (m2279component2impl != null) {
                setWedgeAffinity(m2279component2impl);
            }
        }
        return this;
    }

    public final androidx.compose.foundation.text.input.internal.selection.SelectionMovementDeletionContext moveCursorNextByParagraph() {
        this.getHighSpeedVideoFpsRanges.resetCachedX();
        if (this.getInputSizeshNQ4ISI.length() > 0) {
            int m8034getEndimpl = androidx.compose.ui.text.TextRange.m8034getEndimpl(getSelection());
            int findParagraphEnd = androidx.compose.foundation.text.StringHelpersKt.findParagraphEnd(this.getInputSizeshNQ4ISI, androidx.compose.ui.text.TextRange.m8036getMaximpl(this.selection));
            if (findParagraphEnd == androidx.compose.ui.text.TextRange.m8036getMaximpl(this.selection) && findParagraphEnd != this.getInputSizeshNQ4ISI.length()) {
                findParagraphEnd = androidx.compose.foundation.text.StringHelpersKt.findParagraphEnd(this.getInputSizeshNQ4ISI, findParagraphEnd + 1);
            }
            long calculateNextCursorPositionAndWedgeAffinity = androidx.compose.foundation.text.input.internal.selection.TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(findParagraphEnd, m8034getEndimpl, this.getHighSpeedVideoFpsRangesFor);
            int m2278component1impl = androidx.compose.foundation.text.input.internal.selection.CursorAndWedgeAffinity.m2278component1impl(calculateNextCursorPositionAndWedgeAffinity);
            androidx.compose.foundation.text.input.internal.WedgeAffinity m2279component2impl = androidx.compose.foundation.text.input.internal.selection.CursorAndWedgeAffinity.m2279component2impl(calculateNextCursorPositionAndWedgeAffinity);
            if (m2278component1impl != m8034getEndimpl || !androidx.compose.ui.text.TextRange.m8033getCollapsedimpl(getSelection())) {
                m2291setSelection5zctL8(androidx.compose.ui.text.TextRangeKt.TextRange(m2278component1impl));
            }
            if (m2279component2impl != null) {
                setWedgeAffinity(m2279component2impl);
            }
        }
        return this;
    }

    public final androidx.compose.foundation.text.input.internal.selection.SelectionMovementDeletionContext moveCursorToLineStart() {
        this.getHighSpeedVideoFpsRanges.resetCachedX();
        if (this.getInputSizeshNQ4ISI.length() > 0) {
            int m8034getEndimpl = androidx.compose.ui.text.TextRange.m8034getEndimpl(getSelection());
            androidx.compose.ui.text.TextLayoutResult textLayoutResult = this.getHighSpeedVideoSizes;
            long calculateNextCursorPositionAndWedgeAffinity = androidx.compose.foundation.text.input.internal.selection.TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(textLayoutResult != null ? textLayoutResult.getLineStart(textLayoutResult.getLineForOffset(androidx.compose.ui.text.TextRange.m8037getMinimpl(this.selection))) : 0, m8034getEndimpl, this.getHighSpeedVideoFpsRangesFor);
            int m2278component1impl = androidx.compose.foundation.text.input.internal.selection.CursorAndWedgeAffinity.m2278component1impl(calculateNextCursorPositionAndWedgeAffinity);
            androidx.compose.foundation.text.input.internal.WedgeAffinity m2279component2impl = androidx.compose.foundation.text.input.internal.selection.CursorAndWedgeAffinity.m2279component2impl(calculateNextCursorPositionAndWedgeAffinity);
            if (m2278component1impl != m8034getEndimpl || !androidx.compose.ui.text.TextRange.m8033getCollapsedimpl(getSelection())) {
                m2291setSelection5zctL8(androidx.compose.ui.text.TextRangeKt.TextRange(m2278component1impl));
            }
            if (m2279component2impl != null) {
                setWedgeAffinity(m2279component2impl);
            }
        }
        return this;
    }

    public final androidx.compose.foundation.text.input.internal.selection.SelectionMovementDeletionContext moveCursorToLineEnd() {
        int length;
        this.getHighSpeedVideoFpsRanges.resetCachedX();
        if (this.getInputSizeshNQ4ISI.length() > 0) {
            int m8034getEndimpl = androidx.compose.ui.text.TextRange.m8034getEndimpl(getSelection());
            androidx.compose.ui.text.TextLayoutResult textLayoutResult = this.getHighSpeedVideoSizes;
            if (textLayoutResult == null) {
                length = this.getInputSizeshNQ4ISI.length();
            } else {
                length = textLayoutResult.getLineEnd(textLayoutResult.getLineForOffset(androidx.compose.ui.text.TextRange.m8036getMaximpl(this.selection)), true);
            }
            long calculateNextCursorPositionAndWedgeAffinity = androidx.compose.foundation.text.input.internal.selection.TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(length, m8034getEndimpl, this.getHighSpeedVideoFpsRangesFor);
            int m2278component1impl = androidx.compose.foundation.text.input.internal.selection.CursorAndWedgeAffinity.m2278component1impl(calculateNextCursorPositionAndWedgeAffinity);
            androidx.compose.foundation.text.input.internal.WedgeAffinity m2279component2impl = androidx.compose.foundation.text.input.internal.selection.CursorAndWedgeAffinity.m2279component2impl(calculateNextCursorPositionAndWedgeAffinity);
            if (m2278component1impl != m8034getEndimpl || !androidx.compose.ui.text.TextRange.m8033getCollapsedimpl(getSelection())) {
                m2291setSelection5zctL8(androidx.compose.ui.text.TextRangeKt.TextRange(m2278component1impl));
            }
            if (m2279component2impl != null) {
                setWedgeAffinity(m2279component2impl);
            }
        }
        return this;
    }

    public final androidx.compose.foundation.text.input.internal.selection.SelectionMovementDeletionContext moveCursorUpByPage() {
        if (this.getInputSizeshNQ4ISI.length() > 0) {
            int m8034getEndimpl = androidx.compose.ui.text.TextRange.m8034getEndimpl(getSelection());
            long calculateNextCursorPositionAndWedgeAffinity = androidx.compose.foundation.text.input.internal.selection.TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(Camera2StreamConfigurationMap(-1), m8034getEndimpl, this.getHighSpeedVideoFpsRangesFor);
            int m2278component1impl = androidx.compose.foundation.text.input.internal.selection.CursorAndWedgeAffinity.m2278component1impl(calculateNextCursorPositionAndWedgeAffinity);
            androidx.compose.foundation.text.input.internal.WedgeAffinity m2279component2impl = androidx.compose.foundation.text.input.internal.selection.CursorAndWedgeAffinity.m2279component2impl(calculateNextCursorPositionAndWedgeAffinity);
            if (m2278component1impl != m8034getEndimpl || !androidx.compose.ui.text.TextRange.m8033getCollapsedimpl(getSelection())) {
                m2291setSelection5zctL8(androidx.compose.ui.text.TextRangeKt.TextRange(m2278component1impl));
            }
            if (m2279component2impl != null) {
                setWedgeAffinity(m2279component2impl);
            }
        }
        return this;
    }

    public final androidx.compose.foundation.text.input.internal.selection.SelectionMovementDeletionContext moveCursorDownByPage() {
        if (this.getInputSizeshNQ4ISI.length() > 0) {
            int m8034getEndimpl = androidx.compose.ui.text.TextRange.m8034getEndimpl(getSelection());
            long calculateNextCursorPositionAndWedgeAffinity = androidx.compose.foundation.text.input.internal.selection.TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(Camera2StreamConfigurationMap(1), m8034getEndimpl, this.getHighSpeedVideoFpsRangesFor);
            int m2278component1impl = androidx.compose.foundation.text.input.internal.selection.CursorAndWedgeAffinity.m2278component1impl(calculateNextCursorPositionAndWedgeAffinity);
            androidx.compose.foundation.text.input.internal.WedgeAffinity m2279component2impl = androidx.compose.foundation.text.input.internal.selection.CursorAndWedgeAffinity.m2279component2impl(calculateNextCursorPositionAndWedgeAffinity);
            if (m2278component1impl != m8034getEndimpl || !androidx.compose.ui.text.TextRange.m8033getCollapsedimpl(getSelection())) {
                m2291setSelection5zctL8(androidx.compose.ui.text.TextRangeKt.TextRange(m2278component1impl));
            }
            if (m2279component2impl != null) {
                setWedgeAffinity(m2279component2impl);
            }
        }
        return this;
    }

    public final androidx.compose.foundation.text.input.internal.selection.SelectionMovementDeletionContext selectMovement() {
        if (this.getInputSizeshNQ4ISI.length() > 0) {
            this.selection = androidx.compose.ui.text.TextRangeKt.TextRange(androidx.compose.ui.text.TextRange.m8039getStartimpl(this.initialValue.getSelection()), androidx.compose.ui.text.TextRange.m8034getEndimpl(this.selection));
        }
        return this;
    }

    public final androidx.compose.foundation.text.input.internal.selection.SelectionMovementDeletionContext deleteMovement() {
        if (this.getInputSizeshNQ4ISI.length() > 0) {
            if (!androidx.compose.ui.text.TextRange.m8033getCollapsedimpl(this.initialValue.getSelection())) {
                this.getHighSpeedVideoFpsRangesFor.deleteSelectedText();
            } else {
                androidx.compose.foundation.text.input.internal.TransformedTextFieldState.m2268replaceTextM8tDOmk$default(this.getHighSpeedVideoFpsRangesFor, "", androidx.compose.ui.text.TextRangeKt.TextRange(androidx.compose.ui.text.TextRange.m8039getStartimpl(this.initialValue.getSelection()), androidx.compose.ui.text.TextRange.m8034getEndimpl(this.selection)), null, !this.getHighResolutionOutputSizeshNQ4ISI, 4, null);
            }
            this.selection = this.getHighSpeedVideoFpsRangesFor.getVisualText().getSelection();
            this.wedgeAffinity = androidx.compose.foundation.text.input.internal.WedgeAffinity.Start;
        }
        return this;
    }
}
