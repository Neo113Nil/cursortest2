package com.google.android.material.shape;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import androidx.annotation.AttrRes;
import androidx.annotation.ColorInt;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.core.graphics.ColorUtils;
import androidx.core.graphics.drawable.TintAwareDrawable;
import androidx.core.util.ObjectsCompat;
import com.google.android.material.drawable.a;
import com.google.android.material.shape.k;
import com.google.android.material.shape.l;
import com.google.android.material.shape.n;
import java.util.BitSet;

/* loaded from: classes4.dex */
public class g extends Drawable implements TintAwareDrawable, o {
    public static final Paint y;
    public b a;
    public final n.f[] b;
    public final n.f[] c;
    public final BitSet d;
    public boolean e;
    public final Matrix f;
    public final Path i;
    public final Path j;
    public final RectF k;
    public final RectF l;
    public final Region m;
    public final Region n;
    public k o;
    public final Paint p;
    public final Paint q;
    public final com.google.android.material.shadow.a r;

    @NonNull
    public final a s;
    public final l t;

    @Nullable
    public PorterDuffColorFilter u;

    @Nullable
    public PorterDuffColorFilter v;

    @NonNull
    public final RectF w;
    public final boolean x;

    public class a {
        public a() {
        }
    }

    static {
        Paint paint = new Paint(1);
        y = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public g() {
        this(new k());
    }

    @Override // com.google.android.material.shape.o
    public final void b(@NonNull k kVar) {
        this.a.a = kVar;
        invalidateSelf();
    }

    public final void c(@NonNull RectF rectF, @NonNull Path path) {
        b bVar = this.a;
        this.t.a(bVar.a, bVar.i, rectF, this.s, path);
        if (this.a.h != 1.0f) {
            Matrix matrix = this.f;
            matrix.reset();
            float f = this.a.h;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.w, true);
    }

    @ColorInt
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final int d(@ColorInt int i) {
        int i2;
        b bVar = this.a;
        float f = bVar.m + 0.0f + bVar.l;
        com.google.android.material.elevation.a aVar = bVar.b;
        if (aVar == null || !aVar.a || ColorUtils.setAlphaComponent(i, 255) != aVar.d) {
            return i;
        }
        float min = (aVar.e <= 0.0f || f <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f / r4)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int alpha = Color.alpha(i);
        int c = com.google.android.material.color.a.c(min, ColorUtils.setAlphaComponent(i, 255), aVar.b);
        if (min > 0.0f && (i2 = aVar.c) != 0) {
            c = ColorUtils.compositeColors(ColorUtils.setAlphaComponent(i2, com.google.android.material.elevation.a.f), c);
        }
        return ColorUtils.setAlphaComponent(c, alpha);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        PorterDuffColorFilter porterDuffColorFilter = this.u;
        Paint paint = this.p;
        paint.setColorFilter(porterDuffColorFilter);
        int alpha = paint.getAlpha();
        int i = this.a.k;
        paint.setAlpha(((i + (i >>> 7)) * alpha) >>> 8);
        PorterDuffColorFilter porterDuffColorFilter2 = this.v;
        Paint paint2 = this.q;
        paint2.setColorFilter(porterDuffColorFilter2);
        paint2.setStrokeWidth(this.a.j);
        int alpha2 = paint2.getAlpha();
        int i2 = this.a.k;
        paint2.setAlpha(((i2 + (i2 >>> 7)) * alpha2) >>> 8);
        boolean z = this.e;
        Path path = this.i;
        if (z) {
            float f = -(i() ? paint2.getStrokeWidth() / 2.0f : 0.0f);
            k kVar = this.a.a;
            k.a e = kVar.e();
            c cVar = kVar.e;
            if (!(cVar instanceof i)) {
                cVar = new com.google.android.material.shape.b(f, cVar);
            }
            e.e = cVar;
            c cVar2 = kVar.f;
            if (!(cVar2 instanceof i)) {
                cVar2 = new com.google.android.material.shape.b(f, cVar2);
            }
            e.f = cVar2;
            c cVar3 = kVar.h;
            if (!(cVar3 instanceof i)) {
                cVar3 = new com.google.android.material.shape.b(f, cVar3);
            }
            e.h = cVar3;
            c cVar4 = kVar.g;
            if (!(cVar4 instanceof i)) {
                cVar4 = new com.google.android.material.shape.b(f, cVar4);
            }
            e.g = cVar4;
            k a2 = e.a();
            this.o = a2;
            float f2 = this.a.i;
            RectF h = h();
            RectF rectF = this.l;
            rectF.set(h);
            float strokeWidth = i() ? paint2.getStrokeWidth() / 2.0f : 0.0f;
            rectF.inset(strokeWidth, strokeWidth);
            this.t.a(a2, f2, rectF, null, this.j);
            c(h(), path);
            this.e = false;
        }
        b bVar = this.a;
        bVar.getClass();
        if (bVar.n > 0) {
            int i3 = Build.VERSION.SDK_INT;
            if (!this.a.a.d(h()) && !path.isConvex() && i3 < 29) {
                canvas.save();
                double d = 0;
                canvas.translate((int) (Math.sin(Math.toRadians(d)) * this.a.o), (int) (Math.cos(Math.toRadians(d)) * this.a.o));
                if (this.x) {
                    RectF rectF2 = this.w;
                    int width = (int) (rectF2.width() - getBounds().width());
                    int height = (int) (rectF2.height() - getBounds().height());
                    if (width < 0 || height < 0) {
                        throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                    }
                    Bitmap createBitmap = Bitmap.createBitmap((this.a.n * 2) + ((int) rectF2.width()) + width, (this.a.n * 2) + ((int) rectF2.height()) + height, Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(createBitmap);
                    float f3 = (getBounds().left - this.a.n) - width;
                    float f4 = (getBounds().top - this.a.n) - height;
                    canvas2.translate(-f3, -f4);
                    e(canvas2);
                    canvas.drawBitmap(createBitmap, f3, f4, (Paint) null);
                    createBitmap.recycle();
                    canvas.restore();
                } else {
                    e(canvas);
                    canvas.restore();
                }
            }
        }
        b bVar2 = this.a;
        Paint.Style style = bVar2.p;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            f(canvas, paint, path, bVar2.a, h());
        }
        if (i()) {
            g(canvas);
        }
        paint.setAlpha(alpha);
        paint2.setAlpha(alpha2);
    }

    public final void e(@NonNull Canvas canvas) {
        this.d.cardinality();
        int i = this.a.o;
        Path path = this.i;
        com.google.android.material.shadow.a aVar = this.r;
        if (i != 0) {
            canvas.drawPath(path, aVar.a);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            n.f fVar = this.b[i2];
            int i3 = this.a.n;
            Matrix matrix = n.f.b;
            fVar.a(matrix, aVar, i3, canvas);
            this.c[i2].a(matrix, aVar, this.a.n, canvas);
        }
        if (this.x) {
            double d = 0;
            int sin = (int) (Math.sin(Math.toRadians(d)) * this.a.o);
            int cos = (int) (Math.cos(Math.toRadians(d)) * this.a.o);
            canvas.translate(-sin, -cos);
            canvas.drawPath(path, y);
            canvas.translate(sin, cos);
        }
    }

    public final void f(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull Path path, @NonNull k kVar, @NonNull RectF rectF) {
        if (!kVar.d(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float a2 = kVar.f.a(rectF) * this.a.i;
            canvas.drawRoundRect(rectF, a2, a2, paint);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void g(@NonNull Canvas canvas) {
        k kVar = this.o;
        RectF h = h();
        RectF rectF = this.l;
        rectF.set(h);
        boolean i = i();
        Paint paint = this.q;
        float strokeWidth = i ? paint.getStrokeWidth() / 2.0f : 0.0f;
        rectF.inset(strokeWidth, strokeWidth);
        f(canvas, paint, this.j, kVar, rectF);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.a.k;
    }

    @Override // android.graphics.drawable.Drawable
    @Nullable
    public final Drawable.ConstantState getConstantState() {
        return this.a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(@NonNull Outline outline) {
        this.a.getClass();
        if (this.a.a.d(h())) {
            outline.setRoundRect(getBounds(), this.a.a.e.a(h()) * this.a.i);
            return;
        }
        RectF h = h();
        Path path = this.i;
        c(h, path);
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            a.b.a(outline, path);
            return;
        }
        if (i >= 29) {
            try {
                a.C0124a.a(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            a.C0124a.a(outline, path);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(@NonNull Rect rect) {
        Rect rect2 = this.a.g;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.m;
        region.set(bounds);
        RectF h = h();
        Path path = this.i;
        c(h, path);
        Region region2 = this.n;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    @NonNull
    public final RectF h() {
        Rect bounds = getBounds();
        RectF rectF = this.k;
        rectF.set(bounds);
        return rectF;
    }

    public final boolean i() {
        Paint.Style style = this.a.p;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.q.getStrokeWidth() > 0.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.e = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.a.e;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        this.a.getClass();
        ColorStateList colorStateList2 = this.a.d;
        if (colorStateList2 != null && colorStateList2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList3 = this.a.c;
        return colorStateList3 != null && colorStateList3.isStateful();
    }

    public final void j(Context context) {
        this.a.b = new com.google.android.material.elevation.a(context);
        o();
    }

    public final void k(float f) {
        b bVar = this.a;
        if (bVar.m != f) {
            bVar.m = f;
            o();
        }
    }

    public final void l(@Nullable ColorStateList colorStateList) {
        b bVar = this.a;
        if (bVar.c != colorStateList) {
            bVar.c = colorStateList;
            onStateChange(getState());
        }
    }

    public final boolean m(int[] iArr) {
        boolean z;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.a.c == null || color2 == (colorForState2 = this.a.c.getColorForState(iArr, (color2 = (paint2 = this.p).getColor())))) {
            z = false;
        } else {
            paint2.setColor(colorForState2);
            z = true;
        }
        if (this.a.d == null || color == (colorForState = this.a.d.getColorForState(iArr, (color = (paint = this.q).getColor())))) {
            return z;
        }
        paint.setColor(colorForState);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    @NonNull
    public Drawable mutate() {
        this.a = new b(this.a);
        return this;
    }

    public final boolean n() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.u;
        PorterDuffColorFilter porterDuffColorFilter3 = this.v;
        b bVar = this.a;
        ColorStateList colorStateList = bVar.e;
        PorterDuff.Mode mode = bVar.f;
        if (colorStateList == null || mode == null) {
            int color = this.p.getColor();
            int d = d(color);
            porterDuffColorFilter = d != color ? new PorterDuffColorFilter(d, PorterDuff.Mode.SRC_IN) : null;
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(d(colorStateList.getColorForState(getState(), 0)), mode);
        }
        this.u = porterDuffColorFilter;
        this.a.getClass();
        this.v = null;
        this.a.getClass();
        return (ObjectsCompat.equals(porterDuffColorFilter2, this.u) && ObjectsCompat.equals(porterDuffColorFilter3, this.v)) ? false : true;
    }

    public final void o() {
        b bVar = this.a;
        float f = bVar.m + 0.0f;
        bVar.n = (int) Math.ceil(0.75f * f);
        this.a.o = (int) Math.ceil(f * 0.25f);
        n();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.e = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable, com.google.android.material.internal.g.b
    public boolean onStateChange(int[] iArr) {
        boolean z = m(iArr) || n();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(@IntRange(from = 0, to = 255) int i) {
        b bVar = this.a;
        if (bVar.k != i) {
            bVar.k = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.a.getClass();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public final void setTint(@ColorInt int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintList(@Nullable ColorStateList colorStateList) {
        this.a.e = colorStateList;
        n();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintMode(@Nullable PorterDuff.Mode mode) {
        b bVar = this.a;
        if (bVar.f != mode) {
            bVar.f = mode;
            n();
            super.invalidateSelf();
        }
    }

    public g(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i, @StyleRes int i2) {
        this(k.b(context, attributeSet, i, i2).a());
    }

    public g(@NonNull k kVar) {
        this(new b(kVar));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public g(@NonNull b bVar) {
        l lVar;
        this.b = new n.f[4];
        this.c = new n.f[4];
        this.d = new BitSet(8);
        this.f = new Matrix();
        this.i = new Path();
        this.j = new Path();
        this.k = new RectF();
        this.l = new RectF();
        this.m = new Region();
        this.n = new Region();
        Paint paint = new Paint(1);
        this.p = paint;
        Paint paint2 = new Paint(1);
        this.q = paint2;
        this.r = new com.google.android.material.shadow.a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            lVar = l.a.a;
        } else {
            lVar = new l();
        }
        this.t = lVar;
        this.w = new RectF();
        this.x = true;
        this.a = bVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        n();
        m(getState());
        this.s = new a();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static class b extends Drawable.ConstantState {

        @NonNull
        public k a;

        @Nullable
        public com.google.android.material.elevation.a b;

        @Nullable
        public ColorStateList c;

        @Nullable
        public ColorStateList d;

        @Nullable
        public ColorStateList e;

        @Nullable
        public PorterDuff.Mode f;

        @Nullable
        public Rect g;
        public final float h;
        public float i;
        public float j;
        public int k;
        public float l;
        public float m;
        public int n;
        public int o;
        public final Paint.Style p;

        public b(@NonNull k kVar) {
            this.c = null;
            this.d = null;
            this.e = null;
            this.f = PorterDuff.Mode.SRC_IN;
            this.g = null;
            this.h = 1.0f;
            this.i = 1.0f;
            this.k = 255;
            this.l = 0.0f;
            this.m = 0.0f;
            this.n = 0;
            this.o = 0;
            this.p = Paint.Style.FILL_AND_STROKE;
            this.a = kVar;
            this.b = null;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable() {
            g gVar = new g(this);
            gVar.e = true;
            return gVar;
        }

        public b(@NonNull b bVar) {
            this.c = null;
            this.d = null;
            this.e = null;
            this.f = PorterDuff.Mode.SRC_IN;
            this.g = null;
            this.h = 1.0f;
            this.i = 1.0f;
            this.k = 255;
            this.l = 0.0f;
            this.m = 0.0f;
            this.n = 0;
            this.o = 0;
            this.p = Paint.Style.FILL_AND_STROKE;
            this.a = bVar.a;
            this.b = bVar.b;
            this.j = bVar.j;
            this.c = bVar.c;
            this.d = bVar.d;
            this.f = bVar.f;
            this.e = bVar.e;
            this.k = bVar.k;
            this.h = bVar.h;
            this.o = bVar.o;
            this.i = bVar.i;
            this.l = bVar.l;
            this.m = bVar.m;
            this.n = bVar.n;
            this.p = bVar.p;
            if (bVar.g != null) {
                this.g = new Rect(bVar.g);
            }
        }
    }
}
