package io.sentry.android.replay.util;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.compose.runtime.internal.StabilityInferred;
import g6.C1167p;
import java.util.List;
import t6.e;
import t6.h;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class DebugOverlayDrawable extends Drawable {
    private static final float STROKE_WIDTH = 6.0f;
    private static final int TEXT_COLOR = -16777216;
    private static final int TEXT_OUTLINE_COLOR = -1;
    private static final float TEXT_SIZE = 32.0f;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int maskBackgroundColor = Color.argb(32, 255, 20, 20);
    private static final int maskBorderColor = Color.argb(128, 255, 20, 20);
    private final Paint paint = new Paint(1);
    private final float padding = STROKE_WIDTH;
    private final Rect tmpRect = new Rect();
    private List<Rect> masks = C1167p.f13302a;

    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        private Companion() {
        }
    }

    private final void drawTextWithOutline(Canvas canvas, String str, float f7, float f8) {
        this.paint.setColor(-1);
        this.paint.setStyle(Paint.Style.STROKE);
        canvas.drawText(str, f7, f8, this.paint);
        this.paint.setColor(TEXT_COLOR);
        this.paint.setStyle(Paint.Style.FILL);
        canvas.drawText(str, f7, f8, this.paint);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        h.e(canvas, "canvas");
        this.paint.setTextSize(TEXT_SIZE);
        this.paint.setColor(TEXT_COLOR);
        this.paint.setStrokeWidth(STROKE_WIDTH);
        for (Rect rect : this.masks) {
            this.paint.setColor(maskBackgroundColor);
            this.paint.setStyle(Paint.Style.FILL);
            canvas.drawRect(rect, this.paint);
            this.paint.setColor(maskBorderColor);
            this.paint.setStyle(Paint.Style.STROKE);
            canvas.drawRect(rect, this.paint);
            StringBuilder sb = new StringBuilder();
            sb.append(rect.left);
            sb.append('/');
            sb.append(rect.top);
            String sb2 = sb.toString();
            this.paint.getTextBounds(sb2, 0, sb2.length(), this.tmpRect);
            drawTextWithOutline(canvas, sb2, rect.left, rect.top);
            StringBuilder sb3 = new StringBuilder();
            sb3.append(rect.right);
            sb3.append('/');
            sb3.append(rect.bottom);
            String sb4 = sb3.toString();
            this.paint.getTextBounds(sb4, 0, sb4.length(), this.tmpRect);
            drawTextWithOutline(canvas, sb4, rect.right - this.tmpRect.width(), rect.bottom + this.tmpRect.height());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i7) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public final void updateMasks(List<Rect> list) {
        h.e(list, "masks");
        this.masks = list;
        invalidateSelf();
    }
}
