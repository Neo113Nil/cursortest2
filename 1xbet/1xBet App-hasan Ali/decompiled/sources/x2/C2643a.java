package x2;

import F2.g;
import a.AbstractC0444a;
import android.content.res.ColorStateList;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import java.util.ArrayList;
import k4.AbstractC2036a;
import n.AbstractC2107A;
import v.AbstractC2528x;

/* renamed from: x2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2643a extends Drawable implements Drawable.Callback, Animatable {

    /* renamed from: k, reason: collision with root package name */
    public final g f21087k;

    /* renamed from: l, reason: collision with root package name */
    public final int f21088l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f21089m;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f21090n = new ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public final int f21091o;

    /* renamed from: p, reason: collision with root package name */
    public final int f21092p;

    /* renamed from: q, reason: collision with root package name */
    public long f21093q;

    /* renamed from: r, reason: collision with root package name */
    public int f21094r;

    /* renamed from: s, reason: collision with root package name */
    public int f21095s;

    /* renamed from: t, reason: collision with root package name */
    public Drawable f21096t;

    /* renamed from: u, reason: collision with root package name */
    public final Drawable f21097u;

    public C2643a(Drawable drawable, g gVar, int i, boolean z3) {
        this.f21087k = gVar;
        this.f21088l = i;
        this.f21089m = z3;
        this.f21091o = a(null, drawable != null ? Integer.valueOf(drawable.getIntrinsicWidth()) : null);
        this.f21092p = a(null, drawable != null ? Integer.valueOf(drawable.getIntrinsicHeight()) : null);
        this.f21094r = 255;
        this.f21096t = null;
        Drawable mutate = drawable != null ? drawable.mutate() : null;
        this.f21097u = mutate;
        if (i <= 0) {
            throw new IllegalArgumentException("durationMillis must be > 0.");
        }
        Drawable drawable2 = this.f21096t;
        if (drawable2 != null) {
            drawable2.setCallback(this);
        }
        if (mutate != null) {
            mutate.setCallback(this);
        }
    }

    public final int a(Integer num, Integer num2) {
        if ((num != null && num.intValue() == -1) || (num2 != null && num2.intValue() == -1)) {
            return -1;
        }
        return Math.max(num != null ? num.intValue() : -1, num2 != null ? num2.intValue() : -1);
    }

    public final void b(Drawable drawable, Rect rect) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            drawable.setBounds(rect);
            return;
        }
        int width = rect.width();
        int height = rect.height();
        double c5 = AbstractC2528x.c(intrinsicWidth, intrinsicHeight, width, height, this.f21087k);
        double d5 = 2;
        int T4 = AbstractC2036a.T((width - (intrinsicWidth * c5)) / d5);
        int T5 = AbstractC2036a.T((height - (c5 * intrinsicHeight)) / d5);
        drawable.setBounds(rect.left + T4, rect.top + T5, rect.right - T4, rect.bottom - T5);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int save;
        Drawable drawable;
        int i = this.f21095s;
        if (i == 0) {
            Drawable drawable2 = this.f21096t;
            if (drawable2 != null) {
                drawable2.setAlpha(this.f21094r);
                save = canvas.save();
                try {
                    drawable2.draw(canvas);
                    return;
                } finally {
                }
            }
            return;
        }
        Drawable drawable3 = this.f21097u;
        if (i == 2) {
            if (drawable3 != null) {
                drawable3.setAlpha(this.f21094r);
                save = canvas.save();
                try {
                    drawable3.draw(canvas);
                    return;
                } finally {
                }
            }
            return;
        }
        double uptimeMillis = (SystemClock.uptimeMillis() - this.f21093q) / this.f21088l;
        double r5 = AbstractC0444a.r(uptimeMillis, 0.0d, 1.0d);
        int i5 = this.f21094r;
        int i6 = (int) (r5 * i5);
        if (this.f21089m) {
            i5 -= i6;
        }
        boolean z3 = uptimeMillis >= 1.0d;
        if (!z3 && (drawable = this.f21096t) != null) {
            drawable.setAlpha(i5);
            save = canvas.save();
            try {
                drawable.draw(canvas);
            } finally {
            }
        }
        if (drawable3 != null) {
            drawable3.setAlpha(i6);
            save = canvas.save();
            try {
                drawable3.draw(canvas);
            } finally {
            }
        }
        if (!z3) {
            invalidateSelf();
            return;
        }
        this.f21095s = 2;
        this.f21096t = null;
        ArrayList arrayList = this.f21090n;
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f21094r;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        ColorFilter colorFilter;
        int i = this.f21095s;
        if (i == 0) {
            Drawable drawable = this.f21096t;
            if (drawable != null) {
                return drawable.getColorFilter();
            }
            return null;
        }
        Drawable drawable2 = this.f21097u;
        if (i != 1) {
            if (i == 2 && drawable2 != null) {
                return drawable2.getColorFilter();
            }
            return null;
        }
        if (drawable2 != null && (colorFilter = drawable2.getColorFilter()) != null) {
            return colorFilter;
        }
        Drawable drawable3 = this.f21096t;
        if (drawable3 != null) {
            return drawable3.getColorFilter();
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f21092p;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f21091o;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f21096t;
        int i = this.f21095s;
        if (i == 0) {
            if (drawable != null) {
                return drawable.getOpacity();
            }
            return -2;
        }
        Drawable drawable2 = this.f21097u;
        if (i == 2) {
            if (drawable2 != null) {
                return drawable2.getOpacity();
            }
            return -2;
        }
        if (drawable != null && drawable2 != null) {
            return Drawable.resolveOpacity(drawable.getOpacity(), drawable2.getOpacity());
        }
        if (drawable != null) {
            return drawable.getOpacity();
        }
        if (drawable2 != null) {
            return drawable2.getOpacity();
        }
        return -2;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f21095s == 1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f21096t;
        if (drawable != null) {
            b(drawable, rect);
        }
        Drawable drawable2 = this.f21097u;
        if (drawable2 != null) {
            b(drawable2, rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.f21096t;
        boolean level = drawable != null ? drawable.setLevel(i) : false;
        Drawable drawable2 = this.f21097u;
        return level || (drawable2 != null ? drawable2.setLevel(i) : false);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f21096t;
        boolean state = drawable != null ? drawable.setState(iArr) : false;
        Drawable drawable2 = this.f21097u;
        return state || (drawable2 != null ? drawable2.setState(iArr) : false);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j5) {
        scheduleSelf(runnable, j5);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (i < 0 || i >= 256) {
            throw new IllegalArgumentException(AbstractC2107A.q("Invalid alpha: ", i).toString());
        }
        this.f21094r = i;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f21096t;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        Drawable drawable2 = this.f21097u;
        if (drawable2 != null) {
            drawable2.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.f21096t;
        if (drawable != null) {
            drawable.setTint(i);
        }
        Drawable drawable2 = this.f21097u;
        if (drawable2 != null) {
            drawable2.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintBlendMode(BlendMode blendMode) {
        Drawable drawable = this.f21096t;
        if (drawable != null) {
            drawable.setTintBlendMode(blendMode);
        }
        Drawable drawable2 = this.f21097u;
        if (drawable2 != null) {
            drawable2.setTintBlendMode(blendMode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f21096t;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        }
        Drawable drawable2 = this.f21097u;
        if (drawable2 != null) {
            drawable2.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f21096t;
        if (drawable != null) {
            drawable.setTintMode(mode);
        }
        Drawable drawable2 = this.f21097u;
        if (drawable2 != null) {
            drawable2.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Object obj = this.f21096t;
        Animatable animatable = obj instanceof Animatable ? (Animatable) obj : null;
        if (animatable != null) {
            animatable.start();
        }
        Object obj2 = this.f21097u;
        Animatable animatable2 = obj2 instanceof Animatable ? (Animatable) obj2 : null;
        if (animatable2 != null) {
            animatable2.start();
        }
        if (this.f21095s != 0) {
            return;
        }
        this.f21095s = 1;
        this.f21093q = SystemClock.uptimeMillis();
        ArrayList arrayList = this.f21090n;
        if (arrayList.size() <= 0) {
            invalidateSelf();
        } else {
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Object obj = this.f21096t;
        Animatable animatable = obj instanceof Animatable ? (Animatable) obj : null;
        if (animatable != null) {
            animatable.stop();
        }
        Object obj2 = this.f21097u;
        Animatable animatable2 = obj2 instanceof Animatable ? (Animatable) obj2 : null;
        if (animatable2 != null) {
            animatable2.stop();
        }
        if (this.f21095s != 2) {
            this.f21095s = 2;
            this.f21096t = null;
            ArrayList arrayList = this.f21090n;
            if (arrayList.size() <= 0) {
                return;
            }
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
