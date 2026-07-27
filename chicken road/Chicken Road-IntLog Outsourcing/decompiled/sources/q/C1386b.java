package q;

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

/* renamed from: q.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1386b extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public float f11651a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f11652b;

    /* renamed from: c, reason: collision with root package name */
    public final RectF f11653c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f11654d;

    /* renamed from: e, reason: collision with root package name */
    public float f11655e;

    /* renamed from: h, reason: collision with root package name */
    public ColorStateList f11658h;

    /* renamed from: i, reason: collision with root package name */
    public PorterDuffColorFilter f11659i;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f11660j;

    /* renamed from: f, reason: collision with root package name */
    public boolean f11656f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f11657g = true;

    /* renamed from: k, reason: collision with root package name */
    public PorterDuff.Mode f11661k = PorterDuff.Mode.SRC_IN;

    public C1386b(ColorStateList colorStateList, float f3) {
        this.f11651a = f3;
        Paint paint = new Paint(5);
        this.f11652b = paint;
        colorStateList = colorStateList == null ? ColorStateList.valueOf(0) : colorStateList;
        this.f11658h = colorStateList;
        paint.setColor(colorStateList.getColorForState(getState(), this.f11658h.getDefaultColor()));
        this.f11653c = new RectF();
        this.f11654d = new Rect();
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public final void b(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        RectF rectF = this.f11653c;
        rectF.set(rect.left, rect.top, rect.right, rect.bottom);
        Rect rect2 = this.f11654d;
        rect2.set(rect);
        if (this.f11656f) {
            rect2.inset((int) Math.ceil(AbstractC1387c.a(this.f11655e, this.f11651a, this.f11657g)), (int) Math.ceil(AbstractC1387c.b(this.f11655e, this.f11651a, this.f11657g)));
            rectF.set(rect2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z;
        Paint paint = this.f11652b;
        if (this.f11659i == null || paint.getColorFilter() != null) {
            z = false;
        } else {
            paint.setColorFilter(this.f11659i);
            z = true;
        }
        RectF rectF = this.f11653c;
        float f3 = this.f11651a;
        canvas.drawRoundRect(rectF, f3, f3, paint);
        if (z) {
            paint.setColorFilter(null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        outline.setRoundRect(this.f11654d, this.f11651a);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f11660j;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f11658h) != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        b(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f11658h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        Paint paint = this.f11652b;
        boolean z = colorForState != paint.getColor();
        if (z) {
            paint.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f11660j;
        if (colorStateList2 == null || (mode = this.f11661k) == null) {
            return z;
        }
        this.f11659i = a(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i2) {
        this.f11652b.setAlpha(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f11652b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.f11660j = colorStateList;
        this.f11659i = a(colorStateList, this.f11661k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.f11661k = mode;
        this.f11659i = a(this.f11660j, mode);
        invalidateSelf();
    }
}
