package androidx.compose.foundation.text.input.internal;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\u001ak\u0010\u0012\u001a\u00020\u0011*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a#\u0010\u0017\u001a\u00020\f*\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u0017\u0010\u0018"}, d2 = {"Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "Landroidx/compose/ui/text/input/TextFieldValue;", "textFieldValue", "Landroidx/compose/ui/text/input/OffsetMapping;", "offsetMapping", "Landroidx/compose/ui/text/TextLayoutResult;", "textLayoutResult", "Landroid/graphics/Matrix;", "matrix", "Landroidx/compose/ui/geometry/Rect;", "innerTextFieldBounds", "decorationBoxBounds", "", "includeInsertionMarker", "includeCharacterBounds", "includeEditorBounds", "includeLineBounds", "Landroid/view/inputmethod/CursorAnchorInfo;", "build", "(Landroid/view/inputmethod/CursorAnchorInfo$Builder;Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/OffsetMapping;Landroidx/compose/ui/text/TextLayoutResult;Landroid/graphics/Matrix;Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/geometry/Rect;ZZZZ)Landroid/view/inputmethod/CursorAnchorInfo;", "", "x", "y", "containsInclusive", "(Landroidx/compose/ui/geometry/Rect;FF)Z"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LegacyCursorAnchorInfoBuilder_androidKt {
    /* JADX WARN: Code restructure failed: missing block: B:33:0x010a, code lost:
    
        if (containsInclusive(r20, r5.getRight(), r5.getBottom()) == false) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final android.view.inputmethod.CursorAnchorInfo build(android.view.inputmethod.CursorAnchorInfo.Builder builder, androidx.compose.ui.text.input.TextFieldValue textFieldValue, androidx.compose.ui.text.input.OffsetMapping offsetMapping, androidx.compose.ui.text.TextLayoutResult textLayoutResult, android.graphics.Matrix matrix, androidx.compose.ui.geometry.Rect rect, androidx.compose.ui.geometry.Rect rect2, boolean z, boolean z2, boolean z3, boolean z4) {
        int i;
        builder.reset();
        builder.setMatrix(matrix);
        int m8037getMinimpl = androidx.compose.ui.text.TextRange.m8037getMinimpl(textFieldValue.getSelection());
        builder.setSelectionRange(m8037getMinimpl, androidx.compose.ui.text.TextRange.m8036getMaximpl(textFieldValue.getSelection()));
        if (z && m8037getMinimpl >= 0) {
            int originalToTransformed = offsetMapping.originalToTransformed(m8037getMinimpl);
            androidx.compose.ui.geometry.Rect cursorRect = textLayoutResult.getCursorRect(originalToTransformed);
            float coerceIn = kotlin.ranges.RangesKt.coerceIn(cursorRect.getLeft(), 0.0f, (int) (textLayoutResult.getSize() >> 32));
            boolean containsInclusive = containsInclusive(rect, coerceIn, cursorRect.getTop());
            boolean containsInclusive2 = containsInclusive(rect, coerceIn, cursorRect.getBottom());
            int i2 = 1;
            boolean z5 = textLayoutResult.getBidiRunDirection(originalToTransformed) == androidx.compose.ui.text.style.ResolvedTextDirection.Rtl;
            if (!containsInclusive && !containsInclusive2) {
                i2 = 0;
            }
            if (!containsInclusive || !containsInclusive2) {
                i2 |= 2;
            }
            builder.setInsertionMarkerLocation(coerceIn, cursorRect.getTop(), cursorRect.getBottom(), cursorRect.getBottom(), z5 ? i2 | 4 : i2);
        }
        if (z2) {
            androidx.compose.ui.text.TextRange composition = textFieldValue.getComposition();
            int m8037getMinimpl2 = composition != null ? androidx.compose.ui.text.TextRange.m8037getMinimpl(composition.getGetHighResolutionOutputSizeshNQ4ISI()) : -1;
            androidx.compose.ui.text.TextRange composition2 = textFieldValue.getComposition();
            int m8036getMaximpl = composition2 != null ? androidx.compose.ui.text.TextRange.m8036getMaximpl(composition2.getGetHighResolutionOutputSizeshNQ4ISI()) : -1;
            if (m8037getMinimpl2 >= 0 && m8037getMinimpl2 < m8036getMaximpl) {
                builder.setComposingText(m8037getMinimpl2, textFieldValue.getText().subSequence(m8037getMinimpl2, m8036getMaximpl));
                int originalToTransformed2 = offsetMapping.originalToTransformed(m8037getMinimpl2);
                int originalToTransformed3 = offsetMapping.originalToTransformed(m8036getMaximpl);
                float[] fArr = new float[(originalToTransformed3 - originalToTransformed2) * 4];
                textLayoutResult.getMultiParagraph().m7877fillBoundingBoxes8ffj60Q(androidx.compose.ui.text.TextRangeKt.TextRange(originalToTransformed2, originalToTransformed3), fArr, 0);
                for (int i3 = m8037getMinimpl2; i3 < m8036getMaximpl; i3++) {
                    int originalToTransformed4 = offsetMapping.originalToTransformed(i3);
                    int i4 = (originalToTransformed4 - originalToTransformed2) * 4;
                    androidx.compose.ui.geometry.Rect rect3 = new androidx.compose.ui.geometry.Rect(fArr[i4], fArr[i4 + 1], fArr[i4 + 2], fArr[i4 + 3]);
                    boolean overlaps = rect.overlaps(rect3);
                    if (containsInclusive(rect, rect3.getLeft(), rect3.getTop())) {
                        i = overlaps;
                    }
                    i = (overlaps ? 1 : 0) | 2;
                    builder.addCharacterBounds(i3, rect3.getLeft(), rect3.getTop(), rect3.getRight(), rect3.getBottom(), textLayoutResult.getBidiRunDirection(originalToTransformed4) == androidx.compose.ui.text.style.ResolvedTextDirection.Rtl ? i | 4 : i);
                }
            }
        }
        if (android.os.Build.VERSION.SDK_INT >= 33 && z3) {
            androidx.compose.foundation.text.input.internal.CursorAnchorInfoApi33Helper.setEditorBoundsInfo(builder, rect2);
        }
        if (android.os.Build.VERSION.SDK_INT >= 34 && z4) {
            androidx.compose.foundation.text.input.internal.CursorAnchorInfoApi34Helper.addVisibleLineBounds(builder, textLayoutResult, rect);
        }
        return builder.build();
    }

    public static final boolean containsInclusive(androidx.compose.ui.geometry.Rect rect, float f, float f2) {
        float left = rect.getLeft();
        if (f > rect.getRight() || left > f) {
            return false;
        }
        return f2 <= rect.getBottom() && rect.getTop() <= f2;
    }
}
