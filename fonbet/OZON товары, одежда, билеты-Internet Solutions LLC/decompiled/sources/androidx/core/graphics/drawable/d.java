package androidx.core.graphics.drawable;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;

/* loaded from: classes8.dex */
public abstract class d extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    final Bitmap f42142a;

    /* renamed from: b, reason: collision with root package name */
    private int f42143b;

    /* renamed from: e, reason: collision with root package name */
    private final BitmapShader f42146e;

    /* renamed from: g, reason: collision with root package name */
    private float f42148g;

    /* renamed from: k, reason: collision with root package name */
    private int f42152k;

    /* renamed from: l, reason: collision with root package name */
    private int f42153l;

    /* renamed from: c, reason: collision with root package name */
    private int f42144c = 119;

    /* renamed from: d, reason: collision with root package name */
    private final Paint f42145d = new Paint(3);

    /* renamed from: f, reason: collision with root package name */
    private final Matrix f42147f = new Matrix();

    /* renamed from: h, reason: collision with root package name */
    final Rect f42149h = new Rect();

    /* renamed from: i, reason: collision with root package name */
    private final RectF f42150i = new RectF();

    /* renamed from: j, reason: collision with root package name */
    private boolean f42151j = true;

    d(Resources resources, Bitmap bitmap) {
        this.f42143b = 160;
        if (resources != null) {
            this.f42143b = resources.getDisplayMetrics().densityDpi;
        }
        this.f42142a = bitmap;
        if (bitmap == null) {
            this.f42153l = -1;
            this.f42152k = -1;
            this.f42146e = null;
        } else {
            int i11 = this.f42143b;
            this.f42152k = bitmap.getScaledWidth(i11);
            this.f42153l = bitmap.getScaledHeight(i11);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.f42146e = new BitmapShader(bitmap, tileMode, tileMode);
        }
    }

    public final float a() {
        return this.f42148g;
    }

    void b(int i11, int i12, int i13, Rect rect, Rect rect2) {
        throw new UnsupportedOperationException();
    }

    public final void c(float f7) {
        if (this.f42148g == f7) {
            return;
        }
        boolean z11 = f7 > 0.05f;
        Paint paint = this.f42145d;
        if (z11) {
            paint.setShader(this.f42146e);
        } else {
            paint.setShader(null);
        }
        this.f42148g = f7;
        invalidateSelf();
    }

    final void d() {
        if (this.f42151j) {
            b(this.f42144c, this.f42152k, this.f42153l, getBounds(), this.f42149h);
            RectF rectF = this.f42150i;
            rectF.set(this.f42149h);
            BitmapShader bitmapShader = this.f42146e;
            if (bitmapShader != null) {
                Matrix matrix = this.f42147f;
                matrix.setTranslate(rectF.left, rectF.top);
                float width = rectF.width();
                Bitmap bitmap = this.f42142a;
                matrix.preScale(width / bitmap.getWidth(), rectF.height() / bitmap.getHeight());
                bitmapShader.setLocalMatrix(matrix);
                this.f42145d.setShader(bitmapShader);
            }
            this.f42151j = false;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(@NonNull Canvas canvas) {
        Bitmap bitmap = this.f42142a;
        if (bitmap == null) {
            return;
        }
        d();
        Paint paint = this.f42145d;
        if (paint.getShader() == null) {
            canvas.drawBitmap(bitmap, (Rect) null, this.f42149h, paint);
            return;
        }
        RectF rectF = this.f42150i;
        float f7 = this.f42148g;
        canvas.drawRoundRect(rectF, f7, f7, paint);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f42145d.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f42145d.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f42153l;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f42152k;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Bitmap bitmap;
        return (this.f42144c != 119 || (bitmap = this.f42142a) == null || bitmap.hasAlpha() || this.f42145d.getAlpha() < 255 || this.f42148g > 0.05f) ? -3 : -1;
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(@NonNull Rect rect) {
        super.onBoundsChange(rect);
        this.f42151j = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i11) {
        Paint paint = this.f42145d;
        if (i11 != paint.getAlpha()) {
            paint.setAlpha(i11);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f42145d.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z11) {
        this.f42145d.setDither(z11);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z11) {
        this.f42145d.setFilterBitmap(z11);
        invalidateSelf();
    }
}
