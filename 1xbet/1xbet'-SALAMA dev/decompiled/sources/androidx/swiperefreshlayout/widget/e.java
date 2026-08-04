package androidx.swiperefreshlayout.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;

/* JADX INFO: loaded from: classes.dex */
public final class e extends Drawable implements Animatable {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final LinearInterpolator f9825x = new LinearInterpolator();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final p079l0.a f9826y = new p079l0.a(p079l0.a.f14863c);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int[] f9827z = {-16777216};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f9828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f9829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Resources f9830c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ValueAnimator f9831d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f9832e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f9833f;

    public e(Context context) {
        context.getClass();
        this.f9830c = context.getResources();
        d dVar = new d();
        this.f9828a = dVar;
        dVar.f9813i = f9827z;
        dVar.a(0);
        dVar.f9812h = 2.5f;
        dVar.f9806b.setStrokeWidth(2.5f);
        invalidateSelf();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new b(this, dVar));
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(1);
        valueAnimatorOfFloat.setInterpolator(f9825x);
        valueAnimatorOfFloat.addListener(new c(this, dVar));
        this.f9831d = valueAnimatorOfFloat;
    }

    public static void d(float f7, d dVar) {
        if (f7 <= 0.75f) {
            dVar.f9824u = dVar.f9813i[dVar.j];
            return;
        }
        float f8 = (f7 - 0.75f) / 0.25f;
        int[] iArr = dVar.f9813i;
        int i7 = dVar.j;
        int i8 = iArr[i7];
        int i9 = iArr[(i7 + 1) % iArr.length];
        int i10 = (i8 >> 24) & 255;
        int i11 = (i8 >> 16) & 255;
        int i12 = (i8 >> 8) & 255;
        int i13 = i8 & 255;
        dVar.f9824u = ((i10 + ((int) ((((i9 >> 24) & 255) - i10) * f8))) << 24) | ((i11 + ((int) ((((i9 >> 16) & 255) - i11) * f8))) << 16) | ((i12 + ((int) ((((i9 >> 8) & 255) - i12) * f8))) << 8) | (i13 + ((int) (f8 * ((i9 & 255) - i13))));
    }

    public final void a(float f7, d dVar, boolean z4) {
        float interpolation;
        float interpolation2;
        if (this.f9833f) {
            d(f7, dVar);
            float fFloor = (float) (Math.floor(dVar.f9816m / 0.8f) + 1.0d);
            float f8 = dVar.f9814k;
            float f9 = dVar.f9815l;
            dVar.f9809e = (((f9 - 0.01f) - f8) * f7) + f8;
            dVar.f9810f = f9;
            float f10 = dVar.f9816m;
            dVar.f9811g = ((fFloor - f10) * f7) + f10;
            return;
        }
        if (f7 != 1.0f || z4) {
            float f11 = dVar.f9816m;
            p079l0.a aVar = f9826y;
            if (f7 < 0.5f) {
                interpolation = dVar.f9814k;
                interpolation2 = (aVar.getInterpolation(f7 / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                float f12 = dVar.f9814k + 0.79f;
                interpolation = f12 - (((1.0f - aVar.getInterpolation((f7 - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                interpolation2 = f12;
            }
            float f13 = (0.20999998f * f7) + f11;
            float f14 = (f7 + this.f9832e) * 216.0f;
            dVar.f9809e = interpolation;
            dVar.f9810f = interpolation2;
            dVar.f9811g = f13;
            this.f9829b = f14;
        }
    }

    public final void b(float f7, float f8, float f9, float f10) {
        float f11 = this.f9830c.getDisplayMetrics().density;
        float f12 = f8 * f11;
        d dVar = this.f9828a;
        dVar.f9812h = f12;
        dVar.f9806b.setStrokeWidth(f12);
        dVar.f9820q = f7 * f11;
        dVar.a(0);
        dVar.f9821r = (int) (f9 * f11);
        dVar.f9822s = (int) (f10 * f11);
    }

    public final void c(int i7) {
        if (i7 == 0) {
            b(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            b(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f9829b, bounds.exactCenterX(), bounds.exactCenterY());
        d dVar = this.f9828a;
        RectF rectF = dVar.f9805a;
        float f7 = dVar.f9820q;
        float fMin = (dVar.f9812h / 2.0f) + f7;
        if (f7 <= 0.0f) {
            fMin = (Math.min(bounds.width(), bounds.height()) / 2.0f) - Math.max((dVar.f9821r * dVar.f9819p) / 2.0f, dVar.f9812h / 2.0f);
        }
        rectF.set(bounds.centerX() - fMin, bounds.centerY() - fMin, bounds.centerX() + fMin, bounds.centerY() + fMin);
        float f8 = dVar.f9809e;
        float f9 = dVar.f9811g;
        float f10 = (f8 + f9) * 360.0f;
        float f11 = ((dVar.f9810f + f9) * 360.0f) - f10;
        Paint paint = dVar.f9806b;
        paint.setColor(dVar.f9824u);
        paint.setAlpha(dVar.f9823t);
        float f12 = dVar.f9812h / 2.0f;
        rectF.inset(f12, f12);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, dVar.f9808d);
        float f13 = -f12;
        rectF.inset(f13, f13);
        canvas.drawArc(rectF, f10, f11, false, paint);
        if (dVar.f9817n) {
            Path path = dVar.f9818o;
            if (path == null) {
                Path path2 = new Path();
                dVar.f9818o = path2;
                path2.setFillType(Path.FillType.EVEN_ODD);
            } else {
                path.reset();
            }
            float fMin2 = Math.min(rectF.width(), rectF.height()) / 2.0f;
            float f14 = (dVar.f9821r * dVar.f9819p) / 2.0f;
            dVar.f9818o.moveTo(0.0f, 0.0f);
            dVar.f9818o.lineTo(dVar.f9821r * dVar.f9819p, 0.0f);
            Path path3 = dVar.f9818o;
            float f15 = dVar.f9821r;
            float f16 = dVar.f9819p;
            path3.lineTo((f15 * f16) / 2.0f, dVar.f9822s * f16);
            dVar.f9818o.offset((rectF.centerX() + fMin2) - f14, (dVar.f9812h / 2.0f) + rectF.centerY());
            dVar.f9818o.close();
            Paint paint2 = dVar.f9807c;
            paint2.setColor(dVar.f9824u);
            paint2.setAlpha(dVar.f9823t);
            canvas.save();
            canvas.rotate(f10 + f11, rectF.centerX(), rectF.centerY());
            canvas.drawPath(dVar.f9818o, paint2);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f9828a.f9823t;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f9831d.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
        this.f9828a.f9823t = i7;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f9828a.f9806b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.f9831d.cancel();
        d dVar = this.f9828a;
        float f7 = dVar.f9809e;
        dVar.f9814k = f7;
        float f8 = dVar.f9810f;
        dVar.f9815l = f8;
        dVar.f9816m = dVar.f9811g;
        if (f8 != f7) {
            this.f9833f = true;
            this.f9831d.setDuration(666L);
            this.f9831d.start();
            return;
        }
        dVar.a(0);
        dVar.f9814k = 0.0f;
        dVar.f9815l = 0.0f;
        dVar.f9816m = 0.0f;
        dVar.f9809e = 0.0f;
        dVar.f9810f = 0.0f;
        dVar.f9811g = 0.0f;
        this.f9831d.setDuration(1332L);
        this.f9831d.start();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f9831d.cancel();
        this.f9829b = 0.0f;
        d dVar = this.f9828a;
        if (dVar.f9817n) {
            dVar.f9817n = false;
        }
        dVar.a(0);
        dVar.f9814k = 0.0f;
        dVar.f9815l = 0.0f;
        dVar.f9816m = 0.0f;
        dVar.f9809e = 0.0f;
        dVar.f9810f = 0.0f;
        dVar.f9811g = 0.0f;
        invalidateSelf();
    }
}
