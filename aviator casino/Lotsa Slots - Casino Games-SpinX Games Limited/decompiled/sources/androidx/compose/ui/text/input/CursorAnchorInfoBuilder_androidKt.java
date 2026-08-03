package androidx.compose.ui.text.input;

/* compiled from: CursorAnchorInfoBuilder.android.kt */
@kotlin.Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0004\u001a4\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002\u001ad\u0010\u000b\u001a\u00020\f*\u00020\u00012\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\n2\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0013H\u0000\u001a\u001c\u0010\u0017\u001a\u00020\u0013*\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0019H\u0002\u001a,\u0010\u001b\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002¨\u0006\u001d"}, d2 = {"addCharacterBounds", "Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "startOffset", "", "endOffset", "offsetMapping", "Landroidx/compose/ui/text/input/OffsetMapping;", "textLayoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", "innerTextFieldBounds", "Landroidx/compose/ui/geometry/Rect;", "build", "Landroid/view/inputmethod/CursorAnchorInfo;", "textFieldValue", "Landroidx/compose/ui/text/input/TextFieldValue;", "matrix", "Landroid/graphics/Matrix;", "decorationBoxBounds", "includeInsertionMarker", "", "includeCharacterBounds", "includeEditorBounds", "includeLineBounds", "containsInclusive", "x", "", "y", "setInsertionMarker", "selectionStart", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CursorAnchorInfoBuilder_androidKt {
    public static final android.view.inputmethod.CursorAnchorInfo build(android.view.inputmethod.CursorAnchorInfo.Builder builder, androidx.compose.ui.text.input.TextFieldValue textFieldValue, androidx.compose.ui.text.input.OffsetMapping offsetMapping, androidx.compose.ui.text.TextLayoutResult textLayoutResult, android.graphics.Matrix matrix, androidx.compose.ui.geometry.Rect rect, androidx.compose.ui.geometry.Rect rect2, boolean z, boolean z2, boolean z3, boolean z4) {
        builder.reset();
        builder.setMatrix(matrix);
        int m3962getMinimpl = androidx.compose.ui.text.TextRange.m3962getMinimpl(textFieldValue.getSelection());
        builder.setSelectionRange(m3962getMinimpl, androidx.compose.ui.text.TextRange.m3961getMaximpl(textFieldValue.getSelection()));
        if (z) {
            setInsertionMarker(builder, m3962getMinimpl, offsetMapping, textLayoutResult, rect);
        }
        if (z2) {
            androidx.compose.ui.text.TextRange composition = textFieldValue.getComposition();
            int m3962getMinimpl2 = composition != null ? androidx.compose.ui.text.TextRange.m3962getMinimpl(composition.getPackedValue()) : -1;
            androidx.compose.ui.text.TextRange composition2 = textFieldValue.getComposition();
            int m3961getMaximpl = composition2 != null ? androidx.compose.ui.text.TextRange.m3961getMaximpl(composition2.getPackedValue()) : -1;
            if (m3962getMinimpl2 >= 0 && m3962getMinimpl2 < m3961getMaximpl) {
                builder.setComposingText(m3962getMinimpl2, textFieldValue.getText().subSequence(m3962getMinimpl2, m3961getMaximpl));
                addCharacterBounds(builder, m3962getMinimpl2, m3961getMaximpl, offsetMapping, textLayoutResult, rect);
            }
        }
        if (android.os.Build.VERSION.SDK_INT >= 33 && z3) {
            androidx.compose.ui.text.input.CursorAnchorInfoApi33Helper.setEditorBoundsInfo(builder, rect2);
        }
        if (android.os.Build.VERSION.SDK_INT >= 34 && z4) {
            androidx.compose.ui.text.input.CursorAnchorInfoApi34Helper.addVisibleLineBounds(builder, textLayoutResult, rect);
        }
        return builder.build();
    }

    private static final android.view.inputmethod.CursorAnchorInfo.Builder setInsertionMarker(android.view.inputmethod.CursorAnchorInfo.Builder builder, int i, androidx.compose.ui.text.input.OffsetMapping offsetMapping, androidx.compose.ui.text.TextLayoutResult textLayoutResult, androidx.compose.ui.geometry.Rect rect) {
        if (i < 0) {
            return builder;
        }
        int originalToTransformed = offsetMapping.originalToTransformed(i);
        androidx.compose.ui.geometry.Rect cursorRect = textLayoutResult.getCursorRect(originalToTransformed);
        float coerceIn = kotlin.ranges.RangesKt.coerceIn(cursorRect.getLeft(), 0.0f, androidx.compose.ui.unit.IntSize.m4652getWidthimpl(textLayoutResult.getSize()));
        boolean containsInclusive = containsInclusive(rect, coerceIn, cursorRect.getTop());
        boolean containsInclusive2 = containsInclusive(rect, coerceIn, cursorRect.getBottom());
        int i2 = 1;
        boolean z = textLayoutResult.getBidiRunDirection(originalToTransformed) == androidx.compose.ui.text.style.ResolvedTextDirection.Rtl;
        if (!containsInclusive && !containsInclusive2) {
            i2 = 0;
        }
        if (!containsInclusive || !containsInclusive2) {
            i2 |= 2;
        }
        builder.setInsertionMarkerLocation(coerceIn, cursorRect.getTop(), cursorRect.getBottom(), cursorRect.getBottom(), z ? i2 | 4 : i2);
        return builder;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x005d, code lost:
    
        if (containsInclusive(r22, r8.getRight(), r8.getBottom()) == false) goto L8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final android.view.inputmethod.CursorAnchorInfo.Builder addCharacterBounds(android.view.inputmethod.CursorAnchorInfo.Builder builder, int i, int i2, androidx.compose.ui.text.input.OffsetMapping offsetMapping, androidx.compose.ui.text.TextLayoutResult textLayoutResult, androidx.compose.ui.geometry.Rect rect) {
        int i3;
        int i4 = i;
        int originalToTransformed = offsetMapping.originalToTransformed(i4);
        int originalToTransformed2 = offsetMapping.originalToTransformed(i2);
        float[] fArr = new float[(originalToTransformed2 - originalToTransformed) * 4];
        textLayoutResult.getMultiParagraph().m3840fillBoundingBoxes8ffj60Q(androidx.compose.ui.text.TextRangeKt.TextRange(originalToTransformed, originalToTransformed2), fArr, 0);
        while (i4 < i2) {
            int originalToTransformed3 = offsetMapping.originalToTransformed(i4);
            int i5 = (originalToTransformed3 - originalToTransformed) * 4;
            androidx.compose.ui.geometry.Rect rect2 = new androidx.compose.ui.geometry.Rect(fArr[i5], fArr[i5 + 1], fArr[i5 + 2], fArr[i5 + 3]);
            boolean overlaps = rect.overlaps(rect2);
            if (containsInclusive(rect, rect2.getLeft(), rect2.getTop())) {
                i3 = overlaps;
            }
            i3 = (overlaps ? 1 : 0) | 2;
            builder.addCharacterBounds(i4, rect2.getLeft(), rect2.getTop(), rect2.getRight(), rect2.getBottom(), textLayoutResult.getBidiRunDirection(originalToTransformed3) == androidx.compose.ui.text.style.ResolvedTextDirection.Rtl ? i3 | 4 : i3);
            i4++;
        }
        return builder;
    }

    private static final boolean containsInclusive(androidx.compose.ui.geometry.Rect rect, float f, float f2) {
        float left = rect.getLeft();
        if (f <= rect.getRight() && left <= f) {
            float top = rect.getTop();
            if (f2 <= rect.getBottom() && top <= f2) {
                return true;
            }
        }
        return false;
    }
}
