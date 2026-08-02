package androidx.compose.foundation.text.selection;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a/\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\b\u0010\t\u001a+\u0010\u000b\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Landroidx/compose/ui/text/TextLayoutResult;", "textLayoutResult", "", "offset", "", "isStart", "areHandlesCrossed", "Landroidx/compose/ui/geometry/Offset;", "getSelectionHandleCoordinates", "(Landroidx/compose/ui/text/TextLayoutResult;IZZ)J", "", "getHorizontalPosition", "(Landroidx/compose/ui/text/TextLayoutResult;IZZ)F"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TextSelectionDelegateKt {
    public static final long getSelectionHandleCoordinates(androidx.compose.ui.text.TextLayoutResult textLayoutResult, int i, boolean z, boolean z2) {
        int lineForOffset = textLayoutResult.getLineForOffset(i);
        if (lineForOffset >= textLayoutResult.getLineCount()) {
            return androidx.compose.ui.geometry.Offset.INSTANCE.m5767getUnspecifiedF1C5BW0();
        }
        float coerceIn = kotlin.ranges.RangesKt.coerceIn(getHorizontalPosition(textLayoutResult, i, z, z2), 0.0f, (int) (textLayoutResult.getSize() >> 32));
        float coerceIn2 = kotlin.ranges.RangesKt.coerceIn(textLayoutResult.getLineBottom(lineForOffset), 0.0f, (int) (textLayoutResult.getSize() & 4294967295L));
        return androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(coerceIn) << 32) | (java.lang.Float.floatToRawIntBits(coerceIn2) & 4294967295L));
    }

    public static final float getHorizontalPosition(androidx.compose.ui.text.TextLayoutResult textLayoutResult, int i, boolean z, boolean z2) {
        return textLayoutResult.getHorizontalPosition(i, textLayoutResult.getBidiRunDirection(((!z || z2) && (z || !z2)) ? java.lang.Math.max(i + (-1), 0) : i) == textLayoutResult.getParagraphDirection(i));
    }
}
