package T4;

import Hj.C3143a;
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
import androidx.annotation.NonNull;
import c3.C5740b;

/* loaded from: classes.dex */
public final class c extends Drawable implements Animatable {

    /* renamed from: g, reason: collision with root package name */
    private static final LinearInterpolator f26606g = new LinearInterpolator();

    /* renamed from: h, reason: collision with root package name */
    private static final C5740b f26607h = new C5740b();

    /* renamed from: i, reason: collision with root package name */
    private static final int[] f26608i = {-16777216};

    /* renamed from: a, reason: collision with root package name */
    private final a f26609a;

    /* renamed from: b, reason: collision with root package name */
    private float f26610b;

    /* renamed from: c, reason: collision with root package name */
    private Resources f26611c;

    /* renamed from: d, reason: collision with root package name */
    private ValueAnimator f26612d;

    /* renamed from: e, reason: collision with root package name */
    float f26613e;

    /* renamed from: f, reason: collision with root package name */
    boolean f26614f;

    /* JADX INFO: Access modifiers changed from: private */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        final RectF f26615a = new RectF();

        /* renamed from: b, reason: collision with root package name */
        final Paint f26616b;

        /* renamed from: c, reason: collision with root package name */
        final Paint f26617c;

        /* renamed from: d, reason: collision with root package name */
        final Paint f26618d;

        /* renamed from: e, reason: collision with root package name */
        float f26619e;

        /* renamed from: f, reason: collision with root package name */
        float f26620f;

        /* renamed from: g, reason: collision with root package name */
        float f26621g;

        /* renamed from: h, reason: collision with root package name */
        float f26622h;

        /* renamed from: i, reason: collision with root package name */
        int[] f26623i;

        /* renamed from: j, reason: collision with root package name */
        int f26624j;

        /* renamed from: k, reason: collision with root package name */
        float f26625k;

        /* renamed from: l, reason: collision with root package name */
        float f26626l;

        /* renamed from: m, reason: collision with root package name */
        float f26627m;

        /* renamed from: n, reason: collision with root package name */
        boolean f26628n;

        /* renamed from: o, reason: collision with root package name */
        Path f26629o;

        /* renamed from: p, reason: collision with root package name */
        float f26630p;

        /* renamed from: q, reason: collision with root package name */
        float f26631q;

        /* renamed from: r, reason: collision with root package name */
        int f26632r;

        /* renamed from: s, reason: collision with root package name */
        int f26633s;

        /* renamed from: t, reason: collision with root package name */
        int f26634t;

        /* renamed from: u, reason: collision with root package name */
        int f26635u;

        a() {
            Paint paint = new Paint();
            this.f26616b = paint;
            Paint paint2 = new Paint();
            this.f26617c = paint2;
            Paint paint3 = new Paint();
            this.f26618d = paint3;
            this.f26619e = 0.0f;
            this.f26620f = 0.0f;
            this.f26621g = 0.0f;
            this.f26622h = 5.0f;
            this.f26630p = 1.0f;
            this.f26634t = 255;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
            paint3.setColor(0);
        }

        final void a(int i11) {
            this.f26624j = i11;
            this.f26635u = this.f26623i[i11];
        }
    }

    public c(@NonNull Context context) {
        context.getClass();
        this.f26611c = context.getResources();
        a aVar = new a();
        this.f26609a = aVar;
        aVar.f26623i = f26608i;
        aVar.a(0);
        aVar.f26622h = 2.5f;
        aVar.f26616b.setStrokeWidth(2.5f);
        invalidateSelf();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new T4.a(this, aVar));
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(f26606g);
        ofFloat.addListener(new b(this, aVar));
        this.f26612d = ofFloat;
    }

    static void h(float f7, a aVar) {
        if (f7 <= 0.75f) {
            aVar.f26635u = aVar.f26623i[aVar.f26624j];
            return;
        }
        float f11 = (f7 - 0.75f) / 0.25f;
        int[] iArr = aVar.f26623i;
        int i11 = aVar.f26624j;
        int i12 = iArr[i11];
        int i13 = iArr[(i11 + 1) % iArr.length];
        aVar.f26635u = ((((i12 >> 24) & 255) + ((int) ((((i13 >> 24) & 255) - r1) * f11))) << 24) | ((((i12 >> 16) & 255) + ((int) ((((i13 >> 16) & 255) - r3) * f11))) << 16) | ((((i12 >> 8) & 255) + ((int) ((((i13 >> 8) & 255) - r4) * f11))) << 8) | ((i12 & 255) + ((int) (f11 * ((i13 & 255) - r2))));
    }

    final void a(float f7, a aVar, boolean z11) {
        float interpolation;
        float f11;
        if (this.f26614f) {
            h(f7, aVar);
            float floor = (float) (Math.floor(aVar.f26627m / 0.8f) + 1.0d);
            float f12 = aVar.f26625k;
            float f13 = aVar.f26626l;
            aVar.f26619e = (((f13 - 0.01f) - f12) * f7) + f12;
            aVar.f26620f = f13;
            float f14 = aVar.f26627m;
            aVar.f26621g = C3143a.d(floor, f14, f7, f14);
            return;
        }
        if (f7 != 1.0f || z11) {
            float f15 = aVar.f26627m;
            C5740b c5740b = f26607h;
            if (f7 < 0.5f) {
                interpolation = aVar.f26625k;
                f11 = (c5740b.getInterpolation(f7 / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                float f16 = aVar.f26625k + 0.79f;
                interpolation = f16 - (((1.0f - c5740b.getInterpolation((f7 - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                f11 = f16;
            }
            float f17 = (0.20999998f * f7) + f15;
            float f18 = (f7 + this.f26613e) * 216.0f;
            aVar.f26619e = interpolation;
            aVar.f26620f = f11;
            aVar.f26621g = f17;
            this.f26610b = f18;
        }
    }

    public final void b(boolean z11) {
        a aVar = this.f26609a;
        if (aVar.f26628n != z11) {
            aVar.f26628n = z11;
        }
        invalidateSelf();
    }

    public final void c(float f7) {
        a aVar = this.f26609a;
        if (f7 != aVar.f26630p) {
            aVar.f26630p = f7;
        }
        invalidateSelf();
    }

    public final void d(@NonNull int... iArr) {
        a aVar = this.f26609a;
        aVar.f26623i = iArr;
        aVar.a(0);
        aVar.a(0);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f26610b, bounds.exactCenterX(), bounds.exactCenterY());
        a aVar = this.f26609a;
        RectF rectF = aVar.f26615a;
        float f7 = aVar.f26631q;
        float f11 = (aVar.f26622h / 2.0f) + f7;
        if (f7 <= 0.0f) {
            f11 = (Math.min(bounds.width(), bounds.height()) / 2.0f) - Math.max((aVar.f26632r * aVar.f26630p) / 2.0f, aVar.f26622h / 2.0f);
        }
        rectF.set(bounds.centerX() - f11, bounds.centerY() - f11, bounds.centerX() + f11, bounds.centerY() + f11);
        float f12 = aVar.f26619e;
        float f13 = aVar.f26621g;
        float f14 = (f12 + f13) * 360.0f;
        float f15 = ((aVar.f26620f + f13) * 360.0f) - f14;
        Paint paint = aVar.f26616b;
        paint.setColor(aVar.f26635u);
        paint.setAlpha(aVar.f26634t);
        float f16 = aVar.f26622h / 2.0f;
        rectF.inset(f16, f16);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, aVar.f26618d);
        float f17 = -f16;
        rectF.inset(f17, f17);
        canvas.drawArc(rectF, f14, f15, false, paint);
        if (aVar.f26628n) {
            Path path = aVar.f26629o;
            if (path == null) {
                Path path2 = new Path();
                aVar.f26629o = path2;
                path2.setFillType(Path.FillType.EVEN_ODD);
            } else {
                path.reset();
            }
            float min = Math.min(rectF.width(), rectF.height()) / 2.0f;
            float f18 = (aVar.f26632r * aVar.f26630p) / 2.0f;
            aVar.f26629o.moveTo(0.0f, 0.0f);
            aVar.f26629o.lineTo(aVar.f26632r * aVar.f26630p, 0.0f);
            Path path3 = aVar.f26629o;
            float f19 = aVar.f26632r;
            float f21 = aVar.f26630p;
            path3.lineTo((f19 * f21) / 2.0f, aVar.f26633s * f21);
            aVar.f26629o.offset((rectF.centerX() + min) - f18, (aVar.f26622h / 2.0f) + rectF.centerY());
            aVar.f26629o.close();
            Paint paint2 = aVar.f26617c;
            paint2.setColor(aVar.f26635u);
            paint2.setAlpha(aVar.f26634t);
            canvas.save();
            canvas.rotate(f14 + f15, rectF.centerX(), rectF.centerY());
            canvas.drawPath(aVar.f26629o, paint2);
            canvas.restore();
        }
        canvas.restore();
    }

    public final void e(float f7) {
        this.f26609a.f26621g = f7;
        invalidateSelf();
    }

    public final void f(float f7) {
        a aVar = this.f26609a;
        aVar.f26619e = 0.0f;
        aVar.f26620f = f7;
        invalidateSelf();
    }

    public final void g() {
        float f7 = this.f26611c.getDisplayMetrics().density;
        float f11 = 2.5f * f7;
        a aVar = this.f26609a;
        aVar.f26622h = f11;
        aVar.f26616b.setStrokeWidth(f11);
        aVar.f26631q = 7.5f * f7;
        aVar.a(0);
        aVar.f26632r = (int) (10.0f * f7);
        aVar.f26633s = (int) (5.0f * f7);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f26609a.f26634t;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f26612d.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i11) {
        this.f26609a.f26634t = i11;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f26609a.f26616b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.f26612d.cancel();
        a aVar = this.f26609a;
        float f7 = aVar.f26619e;
        aVar.f26625k = f7;
        float f11 = aVar.f26620f;
        aVar.f26626l = f11;
        aVar.f26627m = aVar.f26621g;
        if (f11 != f7) {
            this.f26614f = true;
            this.f26612d.setDuration(666L);
            this.f26612d.start();
            return;
        }
        aVar.a(0);
        aVar.f26625k = 0.0f;
        aVar.f26626l = 0.0f;
        aVar.f26627m = 0.0f;
        aVar.f26619e = 0.0f;
        aVar.f26620f = 0.0f;
        aVar.f26621g = 0.0f;
        this.f26612d.setDuration(1332L);
        this.f26612d.start();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f26612d.cancel();
        this.f26610b = 0.0f;
        a aVar = this.f26609a;
        if (aVar.f26628n) {
            aVar.f26628n = false;
        }
        aVar.a(0);
        aVar.f26625k = 0.0f;
        aVar.f26626l = 0.0f;
        aVar.f26627m = 0.0f;
        aVar.f26619e = 0.0f;
        aVar.f26620f = 0.0f;
        aVar.f26621g = 0.0f;
        invalidateSelf();
    }
}
