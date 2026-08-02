package N1;

import L1.Y;
import android.graphics.Paint;
import android.text.Layout;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class d {

    /* loaded from: classes8.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f18372a;

        static {
            int[] iArr = new int[Layout.Alignment.values().length];
            try {
                iArr[Layout.Alignment.ALIGN_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f18372a = iArr;
        }
    }

    public static final float a(@NotNull Layout layout, int i11, @NotNull Paint paint) {
        float abs;
        float width;
        float lineLeft = layout.getLineLeft(i11);
        int i12 = Y.f16186c;
        if (layout.getEllipsisCount(i11) <= 0 || layout.getParagraphDirection(i11) != 1 || lineLeft >= 0.0f) {
            return 0.0f;
        }
        float measureText = paint.measureText("…") + (layout.getPrimaryHorizontal(layout.getEllipsisStart(i11) + layout.getLineStart(i11)) - lineLeft);
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i11);
        if ((paragraphAlignment == null ? -1 : a.f18372a[paragraphAlignment.ordinal()]) == 1) {
            abs = Math.abs(lineLeft);
            width = (layout.getWidth() - measureText) / 2.0f;
        } else {
            abs = Math.abs(lineLeft);
            width = layout.getWidth() - measureText;
        }
        return width + abs;
    }

    public static final float b(@NotNull Layout layout, int i11, @NotNull Paint paint) {
        float width;
        float width2;
        int i12 = Y.f16186c;
        if (layout.getEllipsisCount(i11) <= 0) {
            return 0.0f;
        }
        if (layout.getParagraphDirection(i11) != -1 || layout.getWidth() >= layout.getLineRight(i11)) {
            return 0.0f;
        }
        float measureText = paint.measureText("…") + (layout.getLineRight(i11) - layout.getPrimaryHorizontal(layout.getEllipsisStart(i11) + layout.getLineStart(i11)));
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i11);
        if ((paragraphAlignment != null ? a.f18372a[paragraphAlignment.ordinal()] : -1) == 1) {
            width = layout.getWidth() - layout.getLineRight(i11);
            width2 = (layout.getWidth() - measureText) / 2.0f;
        } else {
            width = layout.getWidth() - layout.getLineRight(i11);
            width2 = layout.getWidth() - measureText;
        }
        return width - width2;
    }
}
