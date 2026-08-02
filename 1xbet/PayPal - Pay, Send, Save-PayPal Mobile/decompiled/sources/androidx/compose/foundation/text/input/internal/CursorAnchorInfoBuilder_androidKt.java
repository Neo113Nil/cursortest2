package androidx.compose.foundation.text.input.internal;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001au\u0010\u0015\u001a\u00020\u0012*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0013\u0010\u0014"}, d2 = {"Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "", "text", "Landroidx/compose/ui/text/TextRange;", "selection", "composition", "Landroidx/compose/ui/text/TextLayoutResult;", "textLayoutResult", "Landroid/graphics/Matrix;", "matrix", "Landroidx/compose/ui/geometry/Rect;", "innerTextFieldBounds", "decorationBoxBounds", "", "includeInsertionMarker", "includeCharacterBounds", "includeEditorBounds", "includeLineBounds", "Landroid/view/inputmethod/CursorAnchorInfo;", "build-vxqZcH0", "(Landroid/view/inputmethod/CursorAnchorInfo$Builder;Ljava/lang/CharSequence;JLandroidx/compose/ui/text/TextRange;Landroidx/compose/ui/text/TextLayoutResult;Landroid/graphics/Matrix;Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/geometry/Rect;ZZZZ)Landroid/view/inputmethod/CursorAnchorInfo;", "build"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CursorAnchorInfoBuilder_androidKt {
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00e7, code lost:
    
        if (androidx.compose.foundation.text.input.internal.LegacyCursorAnchorInfoBuilder_androidKt.containsInclusive(r22, r4.getRight(), r4.getBottom()) == false) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: build-vxqZcH0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final android.view.inputmethod.CursorAnchorInfo m2219buildvxqZcH0(android.view.inputmethod.CursorAnchorInfo.Builder builder, java.lang.CharSequence charSequence, long j, androidx.compose.ui.text.TextRange textRange, androidx.compose.ui.text.TextLayoutResult textLayoutResult, android.graphics.Matrix matrix, androidx.compose.ui.geometry.Rect rect, androidx.compose.ui.geometry.Rect rect2, boolean z, boolean z2, boolean z3, boolean z4) {
        int i;
        builder.reset();
        builder.setMatrix(matrix);
        int m8037getMinimpl = androidx.compose.ui.text.TextRange.m8037getMinimpl(j);
        builder.setSelectionRange(m8037getMinimpl, androidx.compose.ui.text.TextRange.m8036getMaximpl(j));
        if (z && m8037getMinimpl >= 0) {
            androidx.compose.ui.geometry.Rect cursorRect = textLayoutResult.getCursorRect(m8037getMinimpl);
            float coerceIn = kotlin.ranges.RangesKt.coerceIn(cursorRect.getLeft(), 0.0f, (int) (textLayoutResult.getSize() >> 32));
            boolean containsInclusive = androidx.compose.foundation.text.input.internal.LegacyCursorAnchorInfoBuilder_androidKt.containsInclusive(rect, coerceIn, cursorRect.getTop());
            boolean containsInclusive2 = androidx.compose.foundation.text.input.internal.LegacyCursorAnchorInfoBuilder_androidKt.containsInclusive(rect, coerceIn, cursorRect.getBottom());
            int i2 = 1;
            boolean z5 = textLayoutResult.getBidiRunDirection(m8037getMinimpl) == androidx.compose.ui.text.style.ResolvedTextDirection.Rtl;
            if (!containsInclusive && !containsInclusive2) {
                i2 = 0;
            }
            if (!containsInclusive || !containsInclusive2) {
                i2 |= 2;
            }
            builder.setInsertionMarkerLocation(coerceIn, cursorRect.getTop(), cursorRect.getBottom(), cursorRect.getBottom(), z5 ? i2 | 4 : i2);
        }
        if (z2) {
            int m8037getMinimpl2 = textRange != null ? androidx.compose.ui.text.TextRange.m8037getMinimpl(textRange.getGetHighResolutionOutputSizeshNQ4ISI()) : -1;
            int m8036getMaximpl = textRange != null ? androidx.compose.ui.text.TextRange.m8036getMaximpl(textRange.getGetHighResolutionOutputSizeshNQ4ISI()) : -1;
            if (m8037getMinimpl2 >= 0 && m8037getMinimpl2 < m8036getMaximpl) {
                builder.setComposingText(m8037getMinimpl2, charSequence.subSequence(m8037getMinimpl2, m8036getMaximpl));
                float[] fArr = new float[(m8036getMaximpl - m8037getMinimpl2) * 4];
                textLayoutResult.getMultiParagraph().m7877fillBoundingBoxes8ffj60Q(androidx.compose.ui.text.TextRangeKt.TextRange(m8037getMinimpl2, m8036getMaximpl), fArr, 0);
                for (int i3 = m8037getMinimpl2; i3 < m8036getMaximpl; i3++) {
                    int i4 = (i3 - m8037getMinimpl2) * 4;
                    androidx.compose.ui.geometry.Rect rect3 = new androidx.compose.ui.geometry.Rect(fArr[i4], fArr[i4 + 1], fArr[i4 + 2], fArr[i4 + 3]);
                    boolean overlaps = rect.overlaps(rect3);
                    if (androidx.compose.foundation.text.input.internal.LegacyCursorAnchorInfoBuilder_androidKt.containsInclusive(rect, rect3.getLeft(), rect3.getTop())) {
                        i = overlaps;
                    }
                    i = (overlaps ? 1 : 0) | 2;
                    if (textLayoutResult.getBidiRunDirection(i3) == androidx.compose.ui.text.style.ResolvedTextDirection.Rtl) {
                        i = (i == true ? 1 : 0) | 4;
                    }
                    builder.addCharacterBounds(i3, rect3.getLeft(), rect3.getTop(), rect3.getRight(), rect3.getBottom(), i);
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
}
