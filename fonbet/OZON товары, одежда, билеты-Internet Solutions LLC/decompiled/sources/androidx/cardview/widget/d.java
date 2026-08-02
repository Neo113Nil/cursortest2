package androidx.cardview.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* loaded from: classes8.dex */
final class d extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    private float f38595a;

    /* renamed from: b, reason: collision with root package name */
    private final Paint f38596b;

    /* renamed from: c, reason: collision with root package name */
    private final RectF f38597c;

    /* renamed from: d, reason: collision with root package name */
    private final Rect f38598d;

    /* renamed from: e, reason: collision with root package name */
    private float f38599e;

    /* renamed from: h, reason: collision with root package name */
    private ColorStateList f38602h;

    /* renamed from: i, reason: collision with root package name */
    private PorterDuffColorFilter f38603i;

    /* renamed from: j, reason: collision with root package name */
    private ColorStateList f38604j;

    /* renamed from: f, reason: collision with root package name */
    private boolean f38600f = false;

    /* renamed from: g, reason: collision with root package name */
    private boolean f38601g = true;

    /* renamed from: k, reason: collision with root package name */
    private PorterDuff.Mode f38605k = PorterDuff.Mode.SRC_IN;

    d(ColorStateList colorStateList, float f7) {
        this.f38595a = f7;
        Paint paint = new Paint(5);
        this.f38596b = paint;
        colorStateList = colorStateList == null ? ColorStateList.valueOf(0) : colorStateList;
        this.f38602h = colorStateList;
        paint.setColor(colorStateList.getColorForState(getState(), this.f38602h.getDefaultColor()));
        this.f38597c = new RectF();
        this.f38598d = new Rect();
    }

    private PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    private void h(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        RectF rectF = this.f38597c;
        rectF.set(rect.left, rect.top, rect.right, rect.bottom);
        Rect rect2 = this.f38598d;
        rect2.set(rect);
        if (this.f38600f) {
            rect2.inset((int) Math.ceil(e.a(this.f38599e, this.f38595a, this.f38601g)), (int) Math.ceil(e.b(this.f38599e, this.f38595a, this.f38601g)));
            rectF.set(rect2);
        }
    }

    public final ColorStateList b() {
        return this.f38602h;
    }

    final float c() {
        return this.f38599e;
    }

    public final float d() {
        return this.f38595a;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z11;
        Paint paint = this.f38596b;
        if (this.f38603i == null || paint.getColorFilter() != null) {
            z11 = false;
        } else {
            paint.setColorFilter(this.f38603i);
            z11 = true;
        }
        RectF rectF = this.f38597c;
        float f7 = this.f38595a;
        canvas.drawRoundRect(rectF, f7, f7, paint);
        if (z11) {
            paint.setColorFilter(null);
        }
    }

    public final void e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f38602h = colorStateList;
        this.f38596b.setColor(colorStateList.getColorForState(getState(), this.f38602h.getDefaultColor()));
        invalidateSelf();
    }

    final void f(float f7, boolean z11, boolean z12) {
        if (f7 == this.f38599e && this.f38600f == z11 && this.f38601g == z12) {
            return;
        }
        this.f38599e = f7;
        this.f38600f = z11;
        this.f38601g = z12;
        h(null);
        invalidateSelf();
    }

    final void g(float f7) {
        if (f7 == this.f38595a) {
            return;
        }
        this.f38595a = f7;
        h(null);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        outline.setRoundRect(this.f38598d, this.f38595a);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList = this.f38604j;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.f38602h;
        return (colorStateList2 != null && colorStateList2.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        h(rect);
    }

    @Override // android.graphics.drawable.Drawable
    protected final boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f38602h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        Paint paint = this.f38596b;
        boolean z11 = colorForState != paint.getColor();
        if (z11) {
            paint.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f38604j;
        if (colorStateList2 == null || (mode = this.f38605k) == null) {
            return z11;
        }
        this.f38603i = a(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i11) {
        this.f38596b.setAlpha(i11);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f38596b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.f38604j = colorStateList;
        this.f38603i = a(colorStateList, this.f38605k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.f38605k = mode;
        this.f38603i = a(this.f38604j, mode);
        invalidateSelf();
    }
}
