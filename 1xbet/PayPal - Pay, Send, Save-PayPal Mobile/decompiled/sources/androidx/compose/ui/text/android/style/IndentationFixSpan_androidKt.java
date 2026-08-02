package androidx.compose.ui.text.android.style;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a%\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a%\u0010\b\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\b\u0010\u0007"}, d2 = {"Landroid/text/Layout;", "", "lineIndex", "Landroid/graphics/Paint;", "paint", "", "getEllipsizedLeftPadding", "(Landroid/text/Layout;ILandroid/graphics/Paint;)F", "getEllipsizedRightPadding"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class IndentationFixSpan_androidKt {
    public static /* synthetic */ float getEllipsizedLeftPadding$default(android.text.Layout layout, int i, android.graphics.Paint paint, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            paint = layout.getPaint();
        }
        return getEllipsizedLeftPadding(layout, i, paint);
    }

    public static final float getEllipsizedLeftPadding(android.text.Layout layout, int i, android.graphics.Paint paint) {
        float abs;
        float width;
        float lineLeft = layout.getLineLeft(i);
        if (!androidx.compose.ui.text.android.TextLayout_androidKt.isLineEllipsized(layout, i) || layout.getParagraphDirection(i) != 1 || lineLeft >= 0.0f) {
            return 0.0f;
        }
        float primaryHorizontal = (layout.getPrimaryHorizontal(layout.getLineStart(i) + layout.getEllipsisStart(i)) - lineLeft) + paint.measureText("…");
        android.text.Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i);
        if (paragraphAlignment != null && androidx.compose.ui.text.android.style.IndentationFixSpan_androidKt.WhenMappings.$EnumSwitchMapping$0[paragraphAlignment.ordinal()] == 1) {
            abs = java.lang.Math.abs(lineLeft);
            width = (layout.getWidth() - primaryHorizontal) / 2.0f;
        } else {
            abs = java.lang.Math.abs(lineLeft);
            width = layout.getWidth() - primaryHorizontal;
        }
        return abs + width;
    }

    public static /* synthetic */ float getEllipsizedRightPadding$default(android.text.Layout layout, int i, android.graphics.Paint paint, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            paint = layout.getPaint();
        }
        return getEllipsizedRightPadding(layout, i, paint);
    }

    public static final float getEllipsizedRightPadding(android.text.Layout layout, int i, android.graphics.Paint paint) {
        float width;
        float width2;
        if (!androidx.compose.ui.text.android.TextLayout_androidKt.isLineEllipsized(layout, i) || layout.getParagraphDirection(i) != -1 || layout.getWidth() >= layout.getLineRight(i)) {
            return 0.0f;
        }
        float lineRight = (layout.getLineRight(i) - layout.getPrimaryHorizontal(layout.getLineStart(i) + layout.getEllipsisStart(i))) + paint.measureText("…");
        android.text.Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i);
        if (paragraphAlignment != null && androidx.compose.ui.text.android.style.IndentationFixSpan_androidKt.WhenMappings.$EnumSwitchMapping$0[paragraphAlignment.ordinal()] == 1) {
            width = layout.getWidth() - layout.getLineRight(i);
            width2 = (layout.getWidth() - lineRight) / 2.0f;
        } else {
            width = layout.getWidth() - layout.getLineRight(i);
            width2 = layout.getWidth() - lineRight;
        }
        return width - width2;
    }

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[android.text.Layout.Alignment.values().length];
            try {
                iArr[android.text.Layout.Alignment.ALIGN_CENTER.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
