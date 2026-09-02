package com.goldenboot.saga.zone;

import android.graphics.Paint;
import android.text.Layout;
import kotlin.Metadata;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a%\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a%\u0010\b\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\b\u0010\u0007\"\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\n¨\u0006\f"}, d2 = {"Landroid/text/Layout;", "", "lineIndex", "Landroid/graphics/Paint;", "paint", "", "evictLayout", "(Landroid/text/Layout;ILandroid/graphics/Paint;)F", "injectMetric", "", "Ljava/lang/String;", "EllipsisChar", "ui-text"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class WindowMulticaster {
    private static final String evictLayout = "…";

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class ActivityMutator {
        public static final /* synthetic */ int[] evictLayout;

        static {
            int[] iArr = new int[Layout.Alignment.values().length];
            try {
                iArr[Layout.Alignment.ALIGN_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            evictLayout = iArr;
        }
    }

    public static /* synthetic */ float detachStream(Layout layout, int i, Paint paint, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            paint = layout.getPaint();
        }
        return injectMetric(layout, i, paint);
    }

    public static final float evictLayout(Layout layout, int i, Paint paint) {
        float abs;
        float width;
        float lineLeft = layout.getLineLeft(i);
        if (!SectionStep.peekRevision(layout, i) || layout.getParagraphDirection(i) != 1 || lineLeft >= 0.0f) {
            return 0.0f;
        }
        float primaryHorizontal = (layout.getPrimaryHorizontal(layout.getLineStart(i) + layout.getEllipsisStart(i)) - lineLeft) + paint.measureText(evictLayout);
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i);
        if ((paragraphAlignment == null ? -1 : ActivityMutator.evictLayout[paragraphAlignment.ordinal()]) == 1) {
            abs = Math.abs(lineLeft);
            width = (layout.getWidth() - primaryHorizontal) / 2.0f;
        } else {
            abs = Math.abs(lineLeft);
            width = layout.getWidth() - primaryHorizontal;
        }
        return abs + width;
    }

    public static /* synthetic */ float growPayload(Layout layout, int i, Paint paint, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            paint = layout.getPaint();
        }
        return evictLayout(layout, i, paint);
    }

    public static final float injectMetric(Layout layout, int i, Paint paint) {
        float width;
        float width2;
        if (!SectionStep.peekRevision(layout, i)) {
            return 0.0f;
        }
        if (layout.getParagraphDirection(i) != -1 || layout.getWidth() >= layout.getLineRight(i)) {
            return 0.0f;
        }
        float lineRight = (layout.getLineRight(i) - layout.getPrimaryHorizontal(layout.getLineStart(i) + layout.getEllipsisStart(i))) + paint.measureText(evictLayout);
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i);
        if ((paragraphAlignment != null ? ActivityMutator.evictLayout[paragraphAlignment.ordinal()] : -1) == 1) {
            width = layout.getWidth() - layout.getLineRight(i);
            width2 = (layout.getWidth() - lineRight) / 2.0f;
        } else {
            width = layout.getWidth() - layout.getLineRight(i);
            width2 = layout.getWidth() - lineRight;
        }
        return width - width2;
    }
}
