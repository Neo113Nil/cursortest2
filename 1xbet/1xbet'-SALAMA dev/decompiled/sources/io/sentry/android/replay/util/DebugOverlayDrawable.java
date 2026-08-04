package io.sentry.android.replay.util;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import p050g6.p;
import t6.e;
import t6.h;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
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
    private List<Rect> masks = p.f13308a;

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
            String string = sb.toString();
            this.paint.getTextBounds(string, 0, string.length(), this.tmpRect);
            drawTextWithOutline(canvas, string, rect.left, rect.top);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(rect.right);
            sb2.append('/');
            sb2.append(rect.bottom);
            String string2 = sb2.toString();
            this.paint.getTextBounds(string2, 0, string2.length(), this.tmpRect);
            drawTextWithOutline(canvas, string2, rect.right - this.tmpRect.width(), rect.bottom + this.tmpRect.height());
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
