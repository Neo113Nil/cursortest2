package androidx.compose.foundation.text.input.internal;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a+\u0010\f\u001a\u00020\u000b*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\r\u001a+\u0010\u0002\u001a\u00020\u000b*\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0002\u0010\u000f\u001a7\u0010\u0013\u001a\u00020\u000b*\u0004\u0018\u00010\u00102\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00112\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a/\u0010\u0017\u001a\u00020\u0000*\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u00152\b\u0010\b\u001a\u0004\u0018\u00010\u00112\b\u0010\n\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a%\u0010\u0017\u001a\u00020\u0000*\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u00152\b\u0010\b\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0019"}, d2 = {"", "", "getHighResolutionOutputSizeshNQ4ISI", "(I)Z", "Landroidx/compose/foundation/text/input/internal/TextLayoutState;", "Landroidx/compose/ui/geometry/Rect;", "p0", "Landroidx/compose/ui/text/TextGranularity;", "p1", "Landroidx/compose/ui/text/TextInclusionStrategy;", "p2", "Landroidx/compose/ui/text/TextRange;", "getHighSpeedVideoSizes", "(Landroidx/compose/foundation/text/input/internal/TextLayoutState;Landroidx/compose/ui/geometry/Rect;ILandroidx/compose/ui/text/TextInclusionStrategy;)J", "Landroidx/compose/foundation/text/LegacyTextFieldState;", "(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroidx/compose/ui/geometry/Rect;ILandroidx/compose/ui/text/TextInclusionStrategy;)J", "Landroidx/compose/ui/text/MultiParagraph;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "p3", "getHighSpeedVideoFpsRanges", "(Landroidx/compose/ui/text/MultiParagraph;Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/layout/LayoutCoordinates;ILandroidx/compose/ui/text/TextInclusionStrategy;)J", "Landroidx/compose/ui/geometry/Offset;", "Landroidx/compose/ui/platform/ViewConfiguration;", "getHighSpeedVideoFpsRangesFor", "(Landroidx/compose/ui/text/MultiParagraph;JLandroidx/compose/ui/layout/LayoutCoordinates;Landroidx/compose/ui/platform/ViewConfiguration;)I", "(Landroidx/compose/ui/text/MultiParagraph;JLandroidx/compose/ui/platform/ViewConfiguration;)I"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class HandwritingGesture_androidKt {
    private static final boolean getHighResolutionOutputSizeshNQ4ISI(int i) {
        int type = java.lang.Character.getType(i);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long getHighSpeedVideoSizes(androidx.compose.foundation.text.input.internal.TextLayoutState textLayoutState, androidx.compose.ui.geometry.Rect rect, int i, androidx.compose.ui.text.TextInclusionStrategy textInclusionStrategy) {
        androidx.compose.ui.text.TextLayoutResult layoutResult = textLayoutState.getLayoutResult();
        return getHighSpeedVideoFpsRanges(layoutResult != null ? layoutResult.getMultiParagraph() : null, rect, textLayoutState.getTextLayoutNodeCoordinates(), i, textInclusionStrategy);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.text.LegacyTextFieldState legacyTextFieldState, androidx.compose.ui.geometry.Rect rect, int i, androidx.compose.ui.text.TextInclusionStrategy textInclusionStrategy) {
        androidx.compose.ui.text.TextLayoutResult value;
        androidx.compose.foundation.text.TextLayoutResultProxy layoutResult = legacyTextFieldState.getLayoutResult();
        return getHighSpeedVideoFpsRanges((layoutResult == null || (value = layoutResult.getValue()) == null) ? null : value.getMultiParagraph(), rect, legacyTextFieldState.getLayoutCoordinates(), i, textInclusionStrategy);
    }

    private static final long getHighSpeedVideoFpsRanges(androidx.compose.ui.text.MultiParagraph multiParagraph, androidx.compose.ui.geometry.Rect rect, androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates, int i, androidx.compose.ui.text.TextInclusionStrategy textInclusionStrategy) {
        if (multiParagraph == null || layoutCoordinates == null) {
            return androidx.compose.ui.text.TextRange.INSTANCE.m8044getZerod9O1mEE();
        }
        return multiParagraph.m7879getRangeForRect86BmAI(rect.m5789translatek4lQ0M(layoutCoordinates.mo7367screenToLocalMKHz9U(androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0())), i, textInclusionStrategy);
    }

    private static final int getHighSpeedVideoFpsRangesFor(androidx.compose.ui.text.MultiParagraph multiParagraph, long j, androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates, androidx.compose.ui.platform.ViewConfiguration viewConfiguration) {
        long mo7367screenToLocalMKHz9U;
        int highSpeedVideoFpsRangesFor;
        if (layoutCoordinates == null || (highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(multiParagraph, (mo7367screenToLocalMKHz9U = layoutCoordinates.mo7367screenToLocalMKHz9U(j)), viewConfiguration)) == -1) {
            return -1;
        }
        return multiParagraph.m7878getOffsetForPositionk4lQ0M(androidx.compose.ui.geometry.Offset.m5746copydBAh8RU$default(mo7367screenToLocalMKHz9U, 0.0f, (multiParagraph.getLineTop(highSpeedVideoFpsRangesFor) + multiParagraph.getLineBottom(highSpeedVideoFpsRangesFor)) / 2.0f, 1, null));
    }

    private static final int getHighSpeedVideoFpsRangesFor(androidx.compose.ui.text.MultiParagraph multiParagraph, long j, androidx.compose.ui.platform.ViewConfiguration viewConfiguration) {
        float handwritingGestureLineMargin = viewConfiguration != null ? viewConfiguration.getHandwritingGestureLineMargin() : 0.0f;
        int i = (int) (4294967295L & j);
        int lineForVerticalPosition = multiParagraph.getLineForVerticalPosition(java.lang.Float.intBitsToFloat(i));
        if (java.lang.Float.intBitsToFloat(i) < multiParagraph.getLineTop(lineForVerticalPosition) - handwritingGestureLineMargin || java.lang.Float.intBitsToFloat(i) > multiParagraph.getLineBottom(lineForVerticalPosition) + handwritingGestureLineMargin) {
            return -1;
        }
        int i2 = (int) (j >> 32);
        if (java.lang.Float.intBitsToFloat(i2) < (-handwritingGestureLineMargin) || java.lang.Float.intBitsToFloat(i2) > multiParagraph.getWidth() + handwritingGestureLineMargin) {
            return -1;
        }
        return lineForVerticalPosition;
    }

    /* renamed from: access$adjustHandwritingDeleteGestureRange-72CqOWE, reason: not valid java name */
    public static final /* synthetic */ long m2224access$adjustHandwritingDeleteGestureRange72CqOWE(long j, java.lang.CharSequence charSequence) {
        int type;
        int type2;
        int type3;
        int type4;
        int m8039getStartimpl = androidx.compose.ui.text.TextRange.m8039getStartimpl(j);
        int m8034getEndimpl = androidx.compose.ui.text.TextRange.m8034getEndimpl(j);
        int codePointBefore = m8039getStartimpl > 0 ? java.lang.Character.codePointBefore(charSequence, m8039getStartimpl) : 10;
        int codePointAt = m8034getEndimpl < charSequence.length() ? java.lang.Character.codePointAt(charSequence, m8034getEndimpl) : 10;
        if ((java.lang.Character.isWhitespace(codePointBefore) || codePointBefore == 160) && (type = java.lang.Character.getType(codePointBefore)) != 14 && type != 13 && codePointBefore != 10 && (java.lang.Character.isWhitespace(codePointAt) || codePointAt == 160 || getHighResolutionOutputSizeshNQ4ISI(codePointAt))) {
            do {
                m8039getStartimpl -= java.lang.Character.charCount(codePointBefore);
                if (m8039getStartimpl == 0) {
                    break;
                }
                codePointBefore = java.lang.Character.codePointBefore(charSequence, m8039getStartimpl);
                if ((!java.lang.Character.isWhitespace(codePointBefore) && codePointBefore != 160) || (type2 = java.lang.Character.getType(codePointBefore)) == 14 || type2 == 13) {
                    break;
                }
            } while (codePointBefore != 10);
            return androidx.compose.ui.text.TextRangeKt.TextRange(m8039getStartimpl, m8034getEndimpl);
        }
        if ((!java.lang.Character.isWhitespace(codePointAt) && codePointAt != 160) || (type3 = java.lang.Character.getType(codePointAt)) == 14 || type3 == 13 || codePointAt == 10) {
            return j;
        }
        if (!java.lang.Character.isWhitespace(codePointBefore) && codePointBefore != 160 && !getHighResolutionOutputSizeshNQ4ISI(codePointBefore)) {
            return j;
        }
        do {
            m8034getEndimpl += java.lang.Character.charCount(codePointAt);
            if (m8034getEndimpl == charSequence.length()) {
                break;
            }
            codePointAt = java.lang.Character.codePointAt(charSequence, m8034getEndimpl);
            if ((!java.lang.Character.isWhitespace(codePointAt) && codePointAt != 160) || (type4 = java.lang.Character.getType(codePointAt)) == 14 || type4 == 13) {
                break;
            }
        } while (codePointAt != 10);
        return androidx.compose.ui.text.TextRangeKt.TextRange(m8039getStartimpl, m8034getEndimpl);
    }

    public static final /* synthetic */ androidx.compose.ui.text.input.EditCommand access$compoundEditCommand(final androidx.compose.ui.text.input.EditCommand... editCommandArr) {
        return new androidx.compose.ui.text.input.EditCommand() { // from class: androidx.compose.foundation.text.input.internal.HandwritingGesture_androidKt$compoundEditCommand$1
            @Override // androidx.compose.ui.text.input.EditCommand
            public final void applyTo(androidx.compose.ui.text.input.EditingBuffer buffer) {
                for (androidx.compose.ui.text.input.EditCommand editCommand : editCommandArr) {
                    editCommand.applyTo(buffer);
                }
            }
        };
    }

    /* renamed from: access$getOffsetForHandwritingGesture-d-4ec7I, reason: not valid java name */
    public static final /* synthetic */ int m2225access$getOffsetForHandwritingGestured4ec7I(androidx.compose.foundation.text.LegacyTextFieldState legacyTextFieldState, long j, androidx.compose.ui.platform.ViewConfiguration viewConfiguration) {
        androidx.compose.ui.text.TextLayoutResult value;
        androidx.compose.ui.text.MultiParagraph multiParagraph;
        androidx.compose.foundation.text.TextLayoutResultProxy layoutResult = legacyTextFieldState.getLayoutResult();
        if (layoutResult == null || (value = layoutResult.getValue()) == null || (multiParagraph = value.getMultiParagraph()) == null) {
            return -1;
        }
        return getHighSpeedVideoFpsRangesFor(multiParagraph, j, legacyTextFieldState.getLayoutCoordinates(), viewConfiguration);
    }

    /* renamed from: access$getOffsetForHandwritingGesture-d-4ec7I, reason: not valid java name */
    public static final /* synthetic */ int m2226access$getOffsetForHandwritingGestured4ec7I(androidx.compose.foundation.text.input.internal.TextLayoutState textLayoutState, long j, androidx.compose.ui.platform.ViewConfiguration viewConfiguration) {
        androidx.compose.ui.text.MultiParagraph multiParagraph;
        androidx.compose.ui.text.TextLayoutResult layoutResult = textLayoutState.getLayoutResult();
        if (layoutResult == null || (multiParagraph = layoutResult.getMultiParagraph()) == null) {
            return -1;
        }
        return getHighSpeedVideoFpsRangesFor(multiParagraph, j, textLayoutState.getTextLayoutNodeCoordinates(), viewConfiguration);
    }

    /* renamed from: access$getRangeForRemoveSpaceGesture-5iVPX68, reason: not valid java name */
    public static final /* synthetic */ long m2227access$getRangeForRemoveSpaceGesture5iVPX68(androidx.compose.ui.text.TextLayoutResult textLayoutResult, long j, long j2, androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates, androidx.compose.ui.platform.ViewConfiguration viewConfiguration) {
        if (textLayoutResult != null && layoutCoordinates != null) {
            long mo7367screenToLocalMKHz9U = layoutCoordinates.mo7367screenToLocalMKHz9U(j);
            long mo7367screenToLocalMKHz9U2 = layoutCoordinates.mo7367screenToLocalMKHz9U(j2);
            int highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(textLayoutResult.getMultiParagraph(), mo7367screenToLocalMKHz9U, viewConfiguration);
            int highSpeedVideoFpsRangesFor2 = getHighSpeedVideoFpsRangesFor(textLayoutResult.getMultiParagraph(), mo7367screenToLocalMKHz9U2, viewConfiguration);
            if (highSpeedVideoFpsRangesFor == -1) {
                if (highSpeedVideoFpsRangesFor2 != -1) {
                    highSpeedVideoFpsRangesFor = highSpeedVideoFpsRangesFor2;
                }
            } else if (highSpeedVideoFpsRangesFor2 != -1) {
                highSpeedVideoFpsRangesFor = java.lang.Math.min(highSpeedVideoFpsRangesFor, highSpeedVideoFpsRangesFor2);
            }
            float lineTop = (textLayoutResult.getLineTop(highSpeedVideoFpsRangesFor) + textLayoutResult.getLineBottom(highSpeedVideoFpsRangesFor)) / 2.0f;
            int i = (int) (mo7367screenToLocalMKHz9U >> 32);
            int i2 = (int) (mo7367screenToLocalMKHz9U2 >> 32);
            return textLayoutResult.getMultiParagraph().m7879getRangeForRect86BmAI(new androidx.compose.ui.geometry.Rect(java.lang.Math.min(java.lang.Float.intBitsToFloat(i), java.lang.Float.intBitsToFloat(i2)), lineTop - 0.1f, java.lang.Math.max(java.lang.Float.intBitsToFloat(i), java.lang.Float.intBitsToFloat(i2)), lineTop + 0.1f), androidx.compose.ui.text.TextGranularity.INSTANCE.m8002getCharacterDRrd7Zo(), androidx.compose.ui.text.TextInclusionStrategy.INSTANCE.getAnyOverlap());
        }
        return androidx.compose.ui.text.TextRange.INSTANCE.m8044getZerod9O1mEE();
    }

    /* renamed from: access$getRangeForScreenRects-O048IG0, reason: not valid java name */
    public static final /* synthetic */ long m2230access$getRangeForScreenRectsO048IG0(androidx.compose.foundation.text.LegacyTextFieldState legacyTextFieldState, androidx.compose.ui.geometry.Rect rect, androidx.compose.ui.geometry.Rect rect2, int i, androidx.compose.ui.text.TextInclusionStrategy textInclusionStrategy) {
        long highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(legacyTextFieldState, rect, i, textInclusionStrategy);
        if (androidx.compose.ui.text.TextRange.m8033getCollapsedimpl(highResolutionOutputSizeshNQ4ISI)) {
            return androidx.compose.ui.text.TextRange.INSTANCE.m8044getZerod9O1mEE();
        }
        long highResolutionOutputSizeshNQ4ISI2 = getHighResolutionOutputSizeshNQ4ISI(legacyTextFieldState, rect2, i, textInclusionStrategy);
        return androidx.compose.ui.text.TextRange.m8033getCollapsedimpl(highResolutionOutputSizeshNQ4ISI2) ? androidx.compose.ui.text.TextRange.INSTANCE.m8044getZerod9O1mEE() : androidx.compose.ui.text.TextRangeKt.TextRange(java.lang.Math.min(androidx.compose.ui.text.TextRange.m8039getStartimpl(highResolutionOutputSizeshNQ4ISI), androidx.compose.ui.text.TextRange.m8039getStartimpl(highResolutionOutputSizeshNQ4ISI)), java.lang.Math.max(androidx.compose.ui.text.TextRange.m8034getEndimpl(highResolutionOutputSizeshNQ4ISI2), androidx.compose.ui.text.TextRange.m8034getEndimpl(highResolutionOutputSizeshNQ4ISI2)));
    }

    /* renamed from: access$getRangeForScreenRects-O048IG0, reason: not valid java name */
    public static final /* synthetic */ long m2231access$getRangeForScreenRectsO048IG0(androidx.compose.foundation.text.input.internal.TextLayoutState textLayoutState, androidx.compose.ui.geometry.Rect rect, androidx.compose.ui.geometry.Rect rect2, int i, androidx.compose.ui.text.TextInclusionStrategy textInclusionStrategy) {
        long highSpeedVideoSizes = getHighSpeedVideoSizes(textLayoutState, rect, i, textInclusionStrategy);
        if (androidx.compose.ui.text.TextRange.m8033getCollapsedimpl(highSpeedVideoSizes)) {
            return androidx.compose.ui.text.TextRange.INSTANCE.m8044getZerod9O1mEE();
        }
        long highSpeedVideoSizes2 = getHighSpeedVideoSizes(textLayoutState, rect2, i, textInclusionStrategy);
        return androidx.compose.ui.text.TextRange.m8033getCollapsedimpl(highSpeedVideoSizes2) ? androidx.compose.ui.text.TextRange.INSTANCE.m8044getZerod9O1mEE() : androidx.compose.ui.text.TextRangeKt.TextRange(java.lang.Math.min(androidx.compose.ui.text.TextRange.m8039getStartimpl(highSpeedVideoSizes), androidx.compose.ui.text.TextRange.m8039getStartimpl(highSpeedVideoSizes)), java.lang.Math.max(androidx.compose.ui.text.TextRange.m8034getEndimpl(highSpeedVideoSizes2), androidx.compose.ui.text.TextRange.m8034getEndimpl(highSpeedVideoSizes2)));
    }

    public static final /* synthetic */ boolean access$isBiDiBoundary(androidx.compose.ui.text.TextLayoutResult textLayoutResult, int i) {
        int lineForOffset = textLayoutResult.getLineForOffset(i);
        return (i == textLayoutResult.getLineStart(lineForOffset) || i == androidx.compose.ui.text.TextLayoutResult.getLineEnd$default(textLayoutResult, lineForOffset, false, 2, null)) ? textLayoutResult.getParagraphDirection(i) != textLayoutResult.getBidiRunDirection(i) : textLayoutResult.getBidiRunDirection(i) != textLayoutResult.getBidiRunDirection(i - 1);
    }

    public static final /* synthetic */ long access$rangeOfWhitespaces(java.lang.CharSequence charSequence, int i) {
        int i2 = i;
        while (i2 > 0) {
            int codePointBefore = androidx.compose.foundation.text.input.internal.CodepointHelpers_jvmKt.codePointBefore(charSequence, i2);
            if (!java.lang.Character.isWhitespace(codePointBefore) && codePointBefore != 160) {
                break;
            }
            i2 -= java.lang.Character.charCount(codePointBefore);
        }
        while (i < charSequence.length()) {
            int codePointAt = androidx.compose.foundation.text.input.internal.CodepointHelpers_jvmKt.codePointAt(charSequence, i);
            if (!java.lang.Character.isWhitespace(codePointAt) && codePointAt != 160) {
                break;
            }
            i += androidx.compose.foundation.text.input.internal.CodepointHelpers_jvmKt.charCount(codePointAt);
        }
        return androidx.compose.ui.text.TextRangeKt.TextRange(i2, i);
    }

    public static final /* synthetic */ long access$toOffset(android.graphics.PointF pointF) {
        float f = pointF.x;
        float f2 = pointF.y;
        return androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(f) << 32) | (java.lang.Float.floatToRawIntBits(f2) & 4294967295L));
    }
}
