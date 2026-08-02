package com.google.android.material.chip;

import android.R;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.graphics.ColorUtils;
import androidx.core.graphics.drawable.DrawableCompat;
import com.google.android.material.internal.g;
import com.google.android.material.shape.g;
import com.google.android.material.shape.k;
import com.google.android.material.shape.l;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class c extends g implements Drawable.Callback, g.b {
    public static final int[] E0 = {R.attr.state_enabled};
    public static final ShapeDrawable F0 = new ShapeDrawable(new OvalShape());

    @Nullable
    public ColorStateList A;
    public TextUtils.TruncateAt A0;
    public float B;
    public boolean B0;
    public float C;
    public int C0;

    @Nullable
    public ColorStateList D;
    public boolean D0;
    public float E;

    @Nullable
    public ColorStateList F;

    @Nullable
    public CharSequence G;
    public boolean H;

    @Nullable
    public Drawable I;

    @Nullable
    public ColorStateList J;
    public float K;
    public boolean L;
    public boolean M;

    @Nullable
    public Drawable N;

    @Nullable
    public RippleDrawable O;

    @Nullable
    public ColorStateList P;
    public float Q;
    public boolean R;
    public boolean S;

    @Nullable
    public Drawable T;

    @Nullable
    public ColorStateList U;
    public float V;
    public float W;
    public float X;
    public float Y;
    public float Z;
    public float a0;
    public float b0;
    public float c0;

    @NonNull
    public final Context d0;
    public final Paint e0;
    public final Paint.FontMetrics f0;
    public final RectF g0;
    public final PointF h0;
    public final Path i0;

    @NonNull
    public final com.google.android.material.internal.g j0;

    @ColorInt
    public int k0;

    @ColorInt
    public int l0;

    @ColorInt
    public int m0;

    @ColorInt
    public int n0;

    @ColorInt
    public int o0;

    @ColorInt
    public int p0;
    public boolean q0;

    @ColorInt
    public int r0;
    public int s0;

    @Nullable
    public ColorFilter t0;

    @Nullable
    public PorterDuffColorFilter u0;

    @Nullable
    public ColorStateList v0;

    @Nullable
    public PorterDuff.Mode w0;
    public int[] x0;

    @Nullable
    public ColorStateList y0;

    @Nullable
    public ColorStateList z;

    @NonNull
    public WeakReference<a> z0;

    public interface a {
        void a();
    }

    public c(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.haryanvi.netstream.R.attr.chipStyle, com.haryanvi.netstream.R.style.Widget_MaterialComponents_Chip_Action);
        this.C = -1.0f;
        this.e0 = new Paint(1);
        this.f0 = new Paint.FontMetrics();
        this.g0 = new RectF();
        this.h0 = new PointF();
        this.i0 = new Path();
        this.s0 = 255;
        this.w0 = PorterDuff.Mode.SRC_IN;
        this.z0 = new WeakReference<>(null);
        j(context);
        this.d0 = context;
        com.google.android.material.internal.g gVar = new com.google.android.material.internal.g(this);
        this.j0 = gVar;
        this.G = "";
        gVar.a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = E0;
        setState(iArr);
        if (!Arrays.equals(this.x0, iArr)) {
            this.x0 = iArr;
            if (E()) {
                x(getState(), iArr);
            }
        }
        this.B0 = true;
        F0.setTint(-1);
    }

    public static void F(@Nullable Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public static boolean u(@Nullable ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public static boolean v(@Nullable Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    public final void A(boolean z) {
        if (this.M != z) {
            boolean E = E();
            this.M = z;
            boolean E2 = E();
            if (E != E2) {
                if (E2) {
                    p(this.N);
                } else {
                    F(this.N);
                }
                invalidateSelf();
                w();
            }
        }
    }

    public final void B(@Nullable com.google.android.material.resources.d dVar) {
        com.google.android.material.internal.g gVar = this.j0;
        g.a aVar = gVar.b;
        TextPaint textPaint = gVar.a;
        if (gVar.f != dVar) {
            gVar.f = dVar;
            Context context = this.d0;
            dVar.e(context, textPaint, aVar);
            g.b bVar = gVar.e.get();
            if (bVar != null) {
                textPaint.drawableState = bVar.getState();
            }
            dVar.d(context, textPaint, aVar);
            gVar.d = true;
            g.b bVar2 = gVar.e.get();
            if (bVar2 != null) {
                bVar2.a();
                bVar2.onStateChange(bVar2.getState());
            }
        }
    }

    public final boolean C() {
        return this.S && this.T != null && this.q0;
    }

    public final boolean D() {
        return this.H && this.I != null;
    }

    public final boolean E() {
        return this.M && this.N != null;
    }

    @Override // com.google.android.material.internal.g.b
    public final void a() {
        w();
        invalidateSelf();
    }

    @Override // com.google.android.material.shape.g, android.graphics.drawable.Drawable
    public final void draw(@NonNull Canvas canvas) {
        int i;
        Canvas canvas2;
        int i2;
        int i3;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || (i = this.s0) == 0) {
            return;
        }
        if (i < 255) {
            canvas2 = canvas;
            i2 = canvas2.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i);
        } else {
            canvas2 = canvas;
            i2 = 0;
        }
        boolean z = this.D0;
        Paint paint = this.e0;
        RectF rectF = this.g0;
        if (!z) {
            paint.setColor(this.k0);
            paint.setStyle(Paint.Style.FILL);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, t(), t(), paint);
        }
        if (!this.D0) {
            paint.setColor(this.l0);
            paint.setStyle(Paint.Style.FILL);
            ColorFilter colorFilter = this.t0;
            if (colorFilter == null) {
                colorFilter = this.u0;
            }
            paint.setColorFilter(colorFilter);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, t(), t(), paint);
        }
        if (this.D0) {
            super.draw(canvas);
        }
        if (this.E > 0.0f && !this.D0) {
            paint.setColor(this.n0);
            paint.setStyle(Paint.Style.STROKE);
            if (!this.D0) {
                ColorFilter colorFilter2 = this.t0;
                if (colorFilter2 == null) {
                    colorFilter2 = this.u0;
                }
                paint.setColorFilter(colorFilter2);
            }
            float f = bounds.left;
            float f2 = this.E / 2.0f;
            rectF.set(f + f2, bounds.top + f2, bounds.right - f2, bounds.bottom - f2);
            float f3 = this.C - (this.E / 2.0f);
            canvas2.drawRoundRect(rectF, f3, f3, paint);
        }
        paint.setColor(this.o0);
        paint.setStyle(Paint.Style.FILL);
        rectF.set(bounds);
        if (this.D0) {
            RectF rectF2 = new RectF(bounds);
            g.b bVar = this.a;
            k kVar = bVar.a;
            float f4 = bVar.i;
            g.a aVar = this.s;
            l lVar = this.t;
            Path path = this.i0;
            lVar.a(kVar, f4, rectF2, aVar, path);
            f(canvas2, paint, path, this.a.a, h());
        } else {
            canvas2.drawRoundRect(rectF, t(), t(), paint);
        }
        if (D()) {
            q(bounds, rectF);
            float f5 = rectF.left;
            float f6 = rectF.top;
            canvas2.translate(f5, f6);
            this.I.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.I.draw(canvas2);
            canvas2.translate(-f5, -f6);
        }
        if (C()) {
            q(bounds, rectF);
            float f7 = rectF.left;
            float f8 = rectF.top;
            canvas2.translate(f7, f8);
            this.T.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.T.draw(canvas2);
            canvas2.translate(-f7, -f8);
        }
        if (this.B0 && this.G != null) {
            PointF pointF = this.h0;
            pointF.set(0.0f, 0.0f);
            Paint.Align align = Paint.Align.LEFT;
            CharSequence charSequence = this.G;
            com.google.android.material.internal.g gVar = this.j0;
            if (charSequence != null) {
                float r = r() + this.V + this.Y;
                if (DrawableCompat.getLayoutDirection(this) == 0) {
                    pointF.x = bounds.left + r;
                } else {
                    pointF.x = bounds.right - r;
                    align = Paint.Align.RIGHT;
                }
                float centerY = bounds.centerY();
                TextPaint textPaint = gVar.a;
                Paint.FontMetrics fontMetrics = this.f0;
                textPaint.getFontMetrics(fontMetrics);
                pointF.y = centerY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
            }
            rectF.setEmpty();
            if (this.G != null) {
                float r2 = r() + this.V + this.Y;
                float s = s() + this.c0 + this.Z;
                if (DrawableCompat.getLayoutDirection(this) == 0) {
                    rectF.left = bounds.left + r2;
                    rectF.right = bounds.right - s;
                } else {
                    rectF.left = bounds.left + s;
                    rectF.right = bounds.right - r2;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
            com.google.android.material.resources.d dVar = gVar.f;
            TextPaint textPaint2 = gVar.a;
            if (dVar != null) {
                textPaint2.drawableState = getState();
                gVar.f.d(this.d0, textPaint2, gVar.b);
            }
            textPaint2.setTextAlign(align);
            boolean z2 = Math.round(gVar.a(this.G.toString())) > Math.round(rectF.width());
            if (z2) {
                int save = canvas2.save();
                canvas2.clipRect(rectF);
                i3 = save;
            } else {
                i3 = 0;
            }
            CharSequence charSequence2 = this.G;
            if (z2 && this.A0 != null) {
                charSequence2 = TextUtils.ellipsize(charSequence2, textPaint2, rectF.width(), this.A0);
            }
            canvas.drawText(charSequence2, 0, charSequence2.length(), pointF.x, pointF.y, textPaint2);
            canvas2 = canvas;
            if (z2) {
                canvas2.restoreToCount(i3);
            }
        }
        if (E()) {
            rectF.setEmpty();
            if (E()) {
                float f9 = this.c0 + this.b0;
                if (DrawableCompat.getLayoutDirection(this) == 0) {
                    float f10 = bounds.right - f9;
                    rectF.right = f10;
                    rectF.left = f10 - this.Q;
                } else {
                    float f11 = bounds.left + f9;
                    rectF.left = f11;
                    rectF.right = f11 + this.Q;
                }
                float exactCenterY = bounds.exactCenterY();
                float f12 = this.Q;
                float f13 = exactCenterY - (f12 / 2.0f);
                rectF.top = f13;
                rectF.bottom = f13 + f12;
            }
            float f14 = rectF.left;
            float f15 = rectF.top;
            canvas2.translate(f14, f15);
            this.N.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.O.setBounds(this.N.getBounds());
            this.O.jumpToCurrentState();
            this.O.draw(canvas2);
            canvas2.translate(-f14, -f15);
        }
        if (this.s0 < 255) {
            canvas2.restoreToCount(i2);
        }
    }

    @Override // com.google.android.material.shape.g, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.s0;
    }

    @Override // android.graphics.drawable.Drawable
    @Nullable
    public final ColorFilter getColorFilter() {
        return this.t0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.B;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.min(Math.round(s() + this.j0.a(this.G.toString()) + r() + this.V + this.Y + this.Z + this.c0), this.C0);
    }

    @Override // com.google.android.material.shape.g, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // com.google.android.material.shape.g, android.graphics.drawable.Drawable
    @TargetApi(21)
    public final void getOutline(@NonNull Outline outline) {
        Outline outline2;
        if (this.D0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline2 = outline;
            outline2.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.B, this.C);
        } else {
            outline.setRoundRect(bounds, this.C);
            outline2 = outline;
        }
        outline2.setAlpha(this.s0 / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(@NonNull Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // com.google.android.material.shape.g, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        if (u(this.z) || u(this.A) || u(this.D)) {
            return true;
        }
        com.google.android.material.resources.d dVar = this.j0.f;
        if (dVar == null || (colorStateList = dVar.j) == null || !colorStateList.isStateful()) {
            return (this.S && this.T != null && this.R) || v(this.I) || v(this.T) || u(this.v0);
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (D()) {
            onLayoutDirectionChanged |= DrawableCompat.setLayoutDirection(this.I, i);
        }
        if (C()) {
            onLayoutDirectionChanged |= DrawableCompat.setLayoutDirection(this.T, i);
        }
        if (E()) {
            onLayoutDirectionChanged |= DrawableCompat.setLayoutDirection(this.N, i);
        }
        if (!onLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        boolean onLevelChange = super.onLevelChange(i);
        if (D()) {
            onLevelChange |= this.I.setLevel(i);
        }
        if (C()) {
            onLevelChange |= this.T.setLevel(i);
        }
        if (E()) {
            onLevelChange |= this.N.setLevel(i);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // com.google.android.material.shape.g, android.graphics.drawable.Drawable, com.google.android.material.internal.g.b
    public final boolean onStateChange(@NonNull int[] iArr) {
        if (this.D0) {
            super.onStateChange(iArr);
        }
        return x(iArr, this.x0);
    }

    public final void p(@Nullable Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        DrawableCompat.setLayoutDirection(drawable, DrawableCompat.getLayoutDirection(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.N) {
            if (drawable.isStateful()) {
                drawable.setState(this.x0);
            }
            DrawableCompat.setTintList(drawable, this.P);
            return;
        }
        Drawable drawable2 = this.I;
        if (drawable == drawable2 && this.L) {
            DrawableCompat.setTintList(drawable2, this.J);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    public final void q(@NonNull Rect rect, @NonNull RectF rectF) {
        rectF.setEmpty();
        if (D() || C()) {
            float f = this.V + this.W;
            Drawable drawable = this.q0 ? this.T : this.I;
            float f2 = this.K;
            if (f2 <= 0.0f && drawable != null) {
                f2 = drawable.getIntrinsicWidth();
            }
            if (DrawableCompat.getLayoutDirection(this) == 0) {
                float f3 = rect.left + f;
                rectF.left = f3;
                rectF.right = f3 + f2;
            } else {
                float f4 = rect.right - f;
                rectF.right = f4;
                rectF.left = f4 - f2;
            }
            Drawable drawable2 = this.q0 ? this.T : this.I;
            float f5 = this.K;
            if (f5 <= 0.0f && drawable2 != null) {
                f5 = (float) Math.ceil(TypedValue.applyDimension(1, 24, this.d0.getResources().getDisplayMetrics()));
                if (drawable2.getIntrinsicHeight() <= f5) {
                    f5 = drawable2.getIntrinsicHeight();
                }
            }
            float exactCenterY = rect.exactCenterY() - (f5 / 2.0f);
            rectF.top = exactCenterY;
            rectF.bottom = exactCenterY + f5;
        }
    }

    public final float r() {
        if (!D() && !C()) {
            return 0.0f;
        }
        float f = this.W;
        Drawable drawable = this.q0 ? this.T : this.I;
        float f2 = this.K;
        if (f2 <= 0.0f && drawable != null) {
            f2 = drawable.getIntrinsicWidth();
        }
        return f2 + f + this.X;
    }

    public final float s() {
        if (E()) {
            return this.a0 + this.Q + this.b0;
        }
        return 0.0f;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // com.google.android.material.shape.g, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.s0 != i) {
            this.s0 = i;
            invalidateSelf();
        }
    }

    @Override // com.google.android.material.shape.g, android.graphics.drawable.Drawable
    public final void setColorFilter(@Nullable ColorFilter colorFilter) {
        if (this.t0 != colorFilter) {
            this.t0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // com.google.android.material.shape.g, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public final void setTintList(@Nullable ColorStateList colorStateList) {
        if (this.v0 != colorStateList) {
            this.v0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // com.google.android.material.shape.g, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public final void setTintMode(@NonNull PorterDuff.Mode mode) {
        if (this.w0 != mode) {
            this.w0 = mode;
            ColorStateList colorStateList = this.v0;
            this.u0 = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (D()) {
            visible |= this.I.setVisible(z, z2);
        }
        if (C()) {
            visible |= this.T.setVisible(z, z2);
        }
        if (E()) {
            visible |= this.N.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public final float t() {
        return this.D0 ? this.a.a.e.a(h()) : this.C;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final void w() {
        a aVar = this.z0.get();
        if (aVar != null) {
            aVar.a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0141  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean x(@NonNull int[] iArr, @NonNull int[] iArr2) {
        int i;
        int colorForState;
        int[] state;
        boolean z;
        boolean z2;
        int colorForState2;
        ColorStateList colorStateList;
        boolean onStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList2 = this.z;
        int d = d(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.k0) : 0);
        boolean z3 = true;
        if (this.k0 != d) {
            this.k0 = d;
            onStateChange = true;
        }
        ColorStateList colorStateList3 = this.A;
        int d2 = d(colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.l0) : 0);
        if (this.l0 != d2) {
            this.l0 = d2;
            onStateChange = true;
        }
        int compositeColors = ColorUtils.compositeColors(d2, d);
        if ((this.m0 != compositeColors) | (this.a.c == null)) {
            this.m0 = compositeColors;
            l(ColorStateList.valueOf(compositeColors));
            onStateChange = true;
        }
        ColorStateList colorStateList4 = this.D;
        int colorForState3 = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.n0) : 0;
        if (this.n0 != colorForState3) {
            this.n0 = colorForState3;
            onStateChange = true;
        }
        if (this.y0 != null) {
            boolean z4 = false;
            boolean z5 = false;
            boolean z6 = false;
            for (int i2 : iArr) {
                if (i2 == 16842910) {
                    z5 = true;
                } else if (i2 == 16842908 || i2 == 16842919 || i2 == 16843623) {
                    z6 = true;
                }
            }
            if (z5 && z6) {
                z4 = true;
            }
            if (z4) {
                i = this.y0.getColorForState(iArr, this.o0);
                if (this.o0 != i) {
                    this.o0 = i;
                }
                com.google.android.material.resources.d dVar = this.j0.f;
                colorForState = (dVar != null || (colorStateList = dVar.j) == null) ? 0 : colorStateList.getColorForState(iArr, this.p0);
                if (this.p0 != colorForState) {
                    this.p0 = colorForState;
                    onStateChange = true;
                }
                state = getState();
                if (state != null) {
                    int length = state.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= length) {
                            break;
                        }
                        if (state[i3] != 16842912) {
                            i3++;
                        } else if (this.R) {
                            z = true;
                        }
                    }
                }
                z = false;
                if (this.q0 != z || this.T == null) {
                    z2 = false;
                } else {
                    float r = r();
                    this.q0 = z;
                    if (r != r()) {
                        onStateChange = true;
                        z2 = true;
                    } else {
                        z2 = false;
                        onStateChange = true;
                    }
                }
                ColorStateList colorStateList5 = this.v0;
                colorForState2 = colorStateList5 == null ? colorStateList5.getColorForState(iArr, this.r0) : 0;
                if (this.r0 == colorForState2) {
                    this.r0 = colorForState2;
                    ColorStateList colorStateList6 = this.v0;
                    PorterDuff.Mode mode = this.w0;
                    this.u0 = (colorStateList6 == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList6.getColorForState(getState(), 0), mode);
                } else {
                    z3 = onStateChange;
                }
                if (v(this.I)) {
                    z3 |= this.I.setState(iArr);
                }
                if (v(this.T)) {
                    z3 |= this.T.setState(iArr);
                }
                if (v(this.N)) {
                    int[] iArr3 = new int[iArr.length + iArr2.length];
                    System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                    System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
                    z3 |= this.N.setState(iArr3);
                }
                if (v(this.O)) {
                    z3 |= this.O.setState(iArr2);
                }
                if (z3) {
                    invalidateSelf();
                }
                if (z2) {
                    w();
                }
                return z3;
            }
        }
        i = 0;
        if (this.o0 != i) {
        }
        com.google.android.material.resources.d dVar2 = this.j0.f;
        if (dVar2 != null) {
        }
        if (this.p0 != colorForState) {
        }
        state = getState();
        if (state != null) {
        }
        z = false;
        if (this.q0 != z) {
        }
        z2 = false;
        ColorStateList colorStateList52 = this.v0;
        if (colorStateList52 == null) {
        }
        if (this.r0 == colorForState2) {
        }
        if (v(this.I)) {
        }
        if (v(this.T)) {
        }
        if (v(this.N)) {
        }
        if (v(this.O)) {
        }
        if (z3) {
        }
        if (z2) {
        }
        return z3;
    }

    public final void y(boolean z) {
        if (this.S != z) {
            boolean C = C();
            this.S = z;
            boolean C2 = C();
            if (C != C2) {
                if (C2) {
                    p(this.T);
                } else {
                    F(this.T);
                }
                invalidateSelf();
                w();
            }
        }
    }

    public final void z(boolean z) {
        if (this.H != z) {
            boolean D = D();
            this.H = z;
            boolean D2 = D();
            if (D != D2) {
                if (D2) {
                    p(this.I);
                } else {
                    F(this.I);
                }
                invalidateSelf();
                w();
            }
        }
    }
}
