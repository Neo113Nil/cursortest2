package ac;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;

/* renamed from: ac.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C4992a extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    private final int f36539a;

    /* renamed from: b, reason: collision with root package name */
    private final int f36540b;

    /* renamed from: c, reason: collision with root package name */
    private final Paint f36541c = new Paint(1);

    /* renamed from: d, reason: collision with root package name */
    private final RectF f36542d = new RectF();

    /* renamed from: e, reason: collision with root package name */
    private final Paint f36543e;

    /* renamed from: f, reason: collision with root package name */
    private final Path f36544f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f36545g;

    /* renamed from: ac.a$a, reason: collision with other inner class name */
    private static class C0704a {
        C0704a(float f7, float f11) {
        }
    }

    static {
        new C0704a(0.3888889f, 0.6944444f);
        new C0704a(0.8472222f, 0.2638889f);
    }

    public C4992a(int i11, int i12, int i13) {
        Paint paint = new Paint(1);
        this.f36543e = paint;
        this.f36544f = new Path();
        this.f36539a = i11;
        this.f36540b = i12;
        paint.setColor(i13);
        paint.setStyle(Paint.Style.STROKE);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(@NonNull Canvas canvas) {
        Paint.Style style;
        int i11;
        if (this.f36545g) {
            style = Paint.Style.FILL_AND_STROKE;
            i11 = this.f36539a;
        } else {
            style = Paint.Style.STROKE;
            i11 = this.f36540b;
        }
        Paint paint = this.f36541c;
        paint.setStyle(style);
        paint.setColor(i11);
        float width = getBounds().width();
        RectF rectF = this.f36542d;
        float width2 = (width - rectF.width()) / 2.0f;
        float height = (r0.height() - rectF.height()) / 2.0f;
        float width3 = rectF.width() / 8.0f;
        int save = canvas.save();
        try {
            canvas.translate(width2, height);
            canvas.drawRoundRect(rectF, width3, width3, paint);
            if (this.f36545g) {
                canvas.drawPath(this.f36544f, this.f36543e);
            }
        } finally {
            canvas.restoreToCount(save);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        float min = Math.min(rect.width(), rect.height());
        float f7 = min / 8.0f;
        float f11 = min - f7;
        this.f36542d.set(0.0f, 0.0f, f11, f11);
        this.f36541c.setStrokeWidth(f7);
        this.f36543e.setStrokeWidth(f7);
        Path path = this.f36544f;
        path.reset();
        path.moveTo(0.15277778f * f11, 0.45833334f * f11);
        path.lineTo(0.3888889f * f11, 0.6944444f * f11);
        path.lineTo(0.8472222f * f11, f11 * 0.2638889f);
    }

    @Override // android.graphics.drawable.Drawable
    protected final boolean onStateChange(int[] iArr) {
        boolean z11;
        int length = iArr != null ? iArr.length : 0;
        if (length > 0) {
            for (int i11 = 0; i11 < length; i11++) {
                if (16842912 == iArr[i11]) {
                    z11 = true;
                    break;
                }
            }
        }
        z11 = false;
        boolean z12 = z11 != this.f36545g;
        if (z12) {
            invalidateSelf();
            this.f36545g = z11;
        }
        return z12;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i11) {
        this.f36541c.setAlpha(i11);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f36541c.setColorFilter(colorFilter);
    }
}
