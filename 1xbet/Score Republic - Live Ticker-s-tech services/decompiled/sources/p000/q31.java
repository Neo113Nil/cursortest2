package p000;

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

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class q31 extends Drawable {

    /* JADX INFO: renamed from: a */
    public float f6353a;

    /* JADX INFO: renamed from: b */
    public final Paint f6354b;

    /* JADX INFO: renamed from: c */
    public final RectF f6355c;

    /* JADX INFO: renamed from: d */
    public final Rect f6356d;

    /* JADX INFO: renamed from: e */
    public float f6357e;

    /* JADX INFO: renamed from: h */
    public ColorStateList f6360h;

    /* JADX INFO: renamed from: i */
    public PorterDuffColorFilter f6361i;

    /* JADX INFO: renamed from: j */
    public ColorStateList f6362j;

    /* JADX INFO: renamed from: f */
    public boolean f6358f = false;

    /* JADX INFO: renamed from: g */
    public boolean f6359g = true;

    /* JADX INFO: renamed from: k */
    public PorterDuff.Mode f6363k = PorterDuff.Mode.SRC_IN;

    public q31(ColorStateList colorStateList, float f) {
        this.f6353a = f;
        Paint paint = new Paint(5);
        this.f6354b = paint;
        colorStateList = colorStateList == null ? ColorStateList.valueOf(0) : colorStateList;
        this.f6360h = colorStateList;
        paint.setColor(colorStateList.getColorForState(getState(), this.f6360h.getDefaultColor()));
        this.f6355c = new RectF();
        this.f6356d = new Rect();
    }

    /* JADX INFO: renamed from: a */
    public final PorterDuffColorFilter m4031a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    /* JADX INFO: renamed from: b */
    public final void m4032b(Rect rect) {
        float f;
        if (rect == null) {
            rect = getBounds();
        }
        float f2 = rect.left;
        float f3 = rect.top;
        float f4 = rect.right;
        float f5 = rect.bottom;
        RectF rectF = this.f6355c;
        rectF.set(f2, f3, f4, f5);
        Rect rect2 = this.f6356d;
        rect2.set(rect);
        if (this.f6358f) {
            float f6 = this.f6357e;
            float f7 = this.f6353a;
            boolean z = this.f6359g;
            if (z) {
                f = (float) (((1.0d - r31.f6702a) * ((double) f7)) + ((double) (1.5f * f6)));
            } else {
                int i = r31.f6703b;
                f = 1.5f * f6;
            }
            if (z) {
                f6 = (float) (((1.0d - r31.f6702a) * ((double) f7)) + ((double) f6));
            }
            rect2.inset((int) Math.ceil(f6), (int) Math.ceil(f));
            rectF.set(rect2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z;
        PorterDuffColorFilter porterDuffColorFilter = this.f6361i;
        Paint paint = this.f6354b;
        if (porterDuffColorFilter == null || paint.getColorFilter() != null) {
            z = false;
        } else {
            paint.setColorFilter(this.f6361i);
            z = true;
        }
        RectF rectF = this.f6355c;
        float f = this.f6353a;
        canvas.drawRoundRect(rectF, f, f, paint);
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
        outline.setRoundRect(this.f6356d, this.f6353a);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList = this.f6362j;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.f6360h;
        return (colorStateList2 != null && colorStateList2.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m4032b(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f6360h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        Paint paint = this.f6354b;
        boolean z = colorForState != paint.getColor();
        if (z) {
            paint.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f6362j;
        if (colorStateList2 == null || (mode = this.f6363k) == null) {
            return z;
        }
        this.f6361i = m4031a(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f6354b.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f6354b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.f6362j = colorStateList;
        this.f6361i = m4031a(colorStateList, this.f6363k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.f6363k = mode;
        this.f6361i = m4031a(this.f6362j, mode);
        invalidateSelf();
    }
}
