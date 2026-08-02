package com.google.android.material.internal;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.math.MathUtils;
import androidx.core.text.TextDirectionHeuristicsCompat;
import androidx.core.util.Preconditions;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import com.google.android.material.textfield.TextInputLayout;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public final class b {

    @Nullable
    public CharSequence A;

    @Nullable
    public CharSequence B;
    public boolean C;

    @Nullable
    public Bitmap E;
    public float F;
    public float G;
    public float H;
    public float I;
    public float J;
    public int K;
    public int[] L;
    public boolean M;

    @NonNull
    public final TextPaint N;

    @NonNull
    public final TextPaint O;
    public TimeInterpolator P;
    public TimeInterpolator Q;
    public float R;
    public float S;
    public float T;
    public ColorStateList U;
    public float V;
    public float W;
    public float X;
    public StaticLayout Y;
    public float Z;
    public final TextInputLayout a;
    public float a0;
    public float b;
    public float b0;

    @NonNull
    public final Rect c;
    public CharSequence c0;

    @NonNull
    public final Rect d;

    @NonNull
    public final RectF e;
    public ColorStateList j;
    public ColorStateList k;
    public float l;
    public float m;
    public float n;
    public float o;
    public float p;
    public float q;
    public Typeface r;
    public Typeface s;
    public Typeface t;
    public Typeface u;
    public Typeface v;
    public Typeface w;
    public Typeface x;
    public com.google.android.material.resources.a y;
    public int f = 16;
    public int g = 16;
    public float h = 15.0f;
    public float i = 15.0f;
    public final TextUtils.TruncateAt z = TextUtils.TruncateAt.END;
    public final boolean D = true;
    public final int d0 = 1;
    public final float e0 = 1.0f;
    public final int f0 = 1;

    public b(TextInputLayout textInputLayout) {
        this.a = textInputLayout;
        TextPaint textPaint = new TextPaint(129);
        this.N = textPaint;
        this.O = new TextPaint(textPaint);
        this.d = new Rect();
        this.c = new Rect();
        this.e = new RectF();
        g(textInputLayout.getContext().getResources().getConfiguration());
    }

    @ColorInt
    public static int a(@ColorInt int i, @ColorInt int i2, @FloatRange(from = 0.0d, to = 1.0d) float f) {
        float f2 = 1.0f - f;
        return Color.argb(Math.round((Color.alpha(i2) * f) + (Color.alpha(i) * f2)), Math.round((Color.red(i2) * f) + (Color.red(i) * f2)), Math.round((Color.green(i2) * f) + (Color.green(i) * f2)), Math.round((Color.blue(i2) * f) + (Color.blue(i) * f2)));
    }

    public static float f(float f, float f2, float f3, @Nullable TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f3 = timeInterpolator.getInterpolation(f3);
        }
        return com.google.android.material.animation.a.a(f, f2, f3);
    }

    public final boolean b(@NonNull CharSequence charSequence) {
        boolean z = ViewCompat.getLayoutDirection(this.a) == 1;
        if (this.D) {
            return (z ? TextDirectionHeuristicsCompat.FIRSTSTRONG_RTL : TextDirectionHeuristicsCompat.FIRSTSTRONG_LTR).isRtl(charSequence, 0, charSequence.length());
        }
        return z;
    }

    public final void c(float f, boolean z) {
        float f2;
        float f3;
        Typeface typeface;
        boolean z2;
        Layout.Alignment alignment;
        if (this.A == null) {
            return;
        }
        float width = this.d.width();
        float width2 = this.c.width();
        if (Math.abs(f - 1.0f) < 1.0E-5f) {
            f2 = this.i;
            f3 = this.V;
            this.F = 1.0f;
            typeface = this.r;
        } else {
            float f4 = this.h;
            float f5 = this.W;
            Typeface typeface2 = this.u;
            if (Math.abs(f - 0.0f) < 1.0E-5f) {
                this.F = 1.0f;
            } else {
                this.F = f(this.h, this.i, f, this.Q) / this.h;
            }
            float f6 = this.i / this.h;
            width = (z || width2 * f6 <= width) ? width2 : Math.min(width / f6, width2);
            f2 = f4;
            f3 = f5;
            typeface = typeface2;
        }
        TextPaint textPaint = this.N;
        if (width > 0.0f) {
            boolean z3 = this.G != f2;
            boolean z4 = this.X != f3;
            boolean z5 = this.x != typeface;
            StaticLayout staticLayout = this.Y;
            boolean z6 = z3 || z4 || (staticLayout != null && (width > ((float) staticLayout.getWidth()) ? 1 : (width == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z5 || this.M;
            this.G = f2;
            this.X = f3;
            this.x = typeface;
            this.M = false;
            textPaint.setLinearText(this.F != 1.0f);
            z2 = z6;
        } else {
            z2 = false;
        }
        if (this.B == null || z2) {
            textPaint.setTextSize(this.G);
            textPaint.setTypeface(this.x);
            textPaint.setLetterSpacing(this.X);
            boolean b = b(this.A);
            this.C = b;
            int i = this.d0;
            if (i <= 1 || b) {
                i = 1;
            }
            if (i == 1) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else {
                int absoluteGravity = GravityCompat.getAbsoluteGravity(this.f, b ? 1 : 0) & 7;
                alignment = absoluteGravity != 1 ? absoluteGravity != 5 ? this.C ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : this.C ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_CENTER;
            }
            f fVar = new f(this.A, textPaint, (int) width);
            fVar.k = this.z;
            fVar.j = b;
            fVar.e = alignment;
            fVar.i = false;
            fVar.f = i;
            fVar.g = this.e0;
            fVar.h = this.f0;
            StaticLayout staticLayout2 = (StaticLayout) Preconditions.checkNotNull(fVar.a());
            this.Y = staticLayout2;
            this.B = staticLayout2.getText();
        }
    }

    public final float d() {
        float f = this.i;
        TextPaint textPaint = this.O;
        textPaint.setTextSize(f);
        textPaint.setTypeface(this.r);
        textPaint.setLetterSpacing(this.V);
        return -textPaint.ascent();
    }

    @ColorInt
    public final int e(@Nullable ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.L;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    public final void g(@NonNull Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.t;
            if (typeface != null) {
                this.s = com.google.android.material.resources.j.a(configuration, typeface);
            }
            Typeface typeface2 = this.w;
            if (typeface2 != null) {
                this.v = com.google.android.material.resources.j.a(configuration, typeface2);
            }
            Typeface typeface3 = this.s;
            if (typeface3 == null) {
                typeface3 = this.t;
            }
            this.r = typeface3;
            Typeface typeface4 = this.v;
            if (typeface4 == null) {
                typeface4 = this.w;
            }
            this.u = typeface4;
            h(true);
        }
    }

    public final void h(boolean z) {
        float measureText;
        StaticLayout staticLayout;
        TextInputLayout textInputLayout = this.a;
        if ((textInputLayout.getHeight() <= 0 || textInputLayout.getWidth() <= 0) && !z) {
            return;
        }
        c(1.0f, z);
        CharSequence charSequence = this.B;
        TextPaint textPaint = this.N;
        if (charSequence != null && (staticLayout = this.Y) != null) {
            this.c0 = TextUtils.ellipsize(charSequence, textPaint, staticLayout.getWidth(), this.z);
        }
        CharSequence charSequence2 = this.c0;
        if (charSequence2 != null) {
            this.Z = textPaint.measureText(charSequence2, 0, charSequence2.length());
        } else {
            this.Z = 0.0f;
        }
        int absoluteGravity = GravityCompat.getAbsoluteGravity(this.g, this.C ? 1 : 0);
        int i = absoluteGravity & 112;
        Rect rect = this.d;
        if (i == 48) {
            this.m = rect.top;
        } else if (i != 80) {
            this.m = rect.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
        } else {
            this.m = textPaint.ascent() + rect.bottom;
        }
        int i2 = absoluteGravity & GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK;
        if (i2 == 1) {
            this.o = rect.centerX() - (this.Z / 2.0f);
        } else if (i2 != 5) {
            this.o = rect.left;
        } else {
            this.o = rect.right - this.Z;
        }
        c(0.0f, z);
        float height = this.Y != null ? r1.getHeight() : 0.0f;
        StaticLayout staticLayout2 = this.Y;
        if (staticLayout2 == null || this.d0 <= 1) {
            CharSequence charSequence3 = this.B;
            measureText = charSequence3 != null ? textPaint.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
        } else {
            measureText = staticLayout2.getWidth();
        }
        StaticLayout staticLayout3 = this.Y;
        if (staticLayout3 != null) {
            staticLayout3.getLineCount();
        }
        int absoluteGravity2 = GravityCompat.getAbsoluteGravity(this.f, this.C ? 1 : 0);
        int i3 = absoluteGravity2 & 112;
        Rect rect2 = this.c;
        if (i3 == 48) {
            this.l = rect2.top;
        } else if (i3 != 80) {
            this.l = rect2.centerY() - (height / 2.0f);
        } else {
            this.l = textPaint.descent() + (rect2.bottom - height);
        }
        int i4 = absoluteGravity2 & GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK;
        if (i4 == 1) {
            this.n = rect2.centerX() - (measureText / 2.0f);
        } else if (i4 != 5) {
            this.n = rect2.left;
        } else {
            this.n = rect2.right - measureText;
        }
        Bitmap bitmap = this.E;
        if (bitmap != null) {
            bitmap.recycle();
            this.E = null;
        }
        l(this.b);
        float f = this.b;
        float f2 = f(rect2.left, rect.left, f, this.P);
        RectF rectF = this.e;
        rectF.left = f2;
        rectF.top = f(this.l, this.m, f, this.P);
        rectF.right = f(rect2.right, rect.right, f, this.P);
        rectF.bottom = f(rect2.bottom, rect.bottom, f, this.P);
        this.p = f(this.n, this.o, f, this.P);
        this.q = f(this.l, this.m, f, this.P);
        l(f);
        FastOutSlowInInterpolator fastOutSlowInInterpolator = com.google.android.material.animation.a.b;
        this.a0 = 1.0f - f(0.0f, 1.0f, 1.0f - f, fastOutSlowInInterpolator);
        ViewCompat.postInvalidateOnAnimation(textInputLayout);
        this.b0 = f(1.0f, 0.0f, f, fastOutSlowInInterpolator);
        ViewCompat.postInvalidateOnAnimation(textInputLayout);
        ColorStateList colorStateList = this.k;
        ColorStateList colorStateList2 = this.j;
        if (colorStateList != colorStateList2) {
            textPaint.setColor(a(e(colorStateList2), e(this.k), f));
        } else {
            textPaint.setColor(e(colorStateList));
        }
        float f3 = this.V;
        float f4 = this.W;
        if (f3 != f4) {
            textPaint.setLetterSpacing(f(f4, f3, f, fastOutSlowInInterpolator));
        } else {
            textPaint.setLetterSpacing(f3);
        }
        this.H = com.google.android.material.animation.a.a(0.0f, this.R, f);
        this.I = com.google.android.material.animation.a.a(0.0f, this.S, f);
        this.J = com.google.android.material.animation.a.a(0.0f, this.T, f);
        int a = a(0, e(this.U), f);
        this.K = a;
        textPaint.setShadowLayer(this.H, this.I, this.J, a);
        ViewCompat.postInvalidateOnAnimation(textInputLayout);
    }

    public final void i(@Nullable ColorStateList colorStateList) {
        if (this.k == colorStateList && this.j == colorStateList) {
            return;
        }
        this.k = colorStateList;
        this.j = colorStateList;
        h(false);
    }

    public final boolean j(Typeface typeface) {
        com.google.android.material.resources.a aVar = this.y;
        if (aVar != null) {
            aVar.c = true;
        }
        if (this.t == typeface) {
            return false;
        }
        this.t = typeface;
        Typeface a = com.google.android.material.resources.j.a(this.a.getContext().getResources().getConfiguration(), typeface);
        this.s = a;
        if (a == null) {
            a = this.t;
        }
        this.r = a;
        return true;
    }

    public final void k(float f) {
        float clamp = MathUtils.clamp(f, 0.0f, 1.0f);
        if (clamp != this.b) {
            this.b = clamp;
            float f2 = this.c.left;
            Rect rect = this.d;
            float f3 = f(f2, rect.left, clamp, this.P);
            RectF rectF = this.e;
            rectF.left = f3;
            rectF.top = f(this.l, this.m, clamp, this.P);
            rectF.right = f(r2.right, rect.right, clamp, this.P);
            rectF.bottom = f(r2.bottom, rect.bottom, clamp, this.P);
            this.p = f(this.n, this.o, clamp, this.P);
            this.q = f(this.l, this.m, clamp, this.P);
            l(clamp);
            FastOutSlowInInterpolator fastOutSlowInInterpolator = com.google.android.material.animation.a.b;
            this.a0 = 1.0f - f(0.0f, 1.0f, 1.0f - clamp, fastOutSlowInInterpolator);
            TextInputLayout textInputLayout = this.a;
            ViewCompat.postInvalidateOnAnimation(textInputLayout);
            this.b0 = f(1.0f, 0.0f, clamp, fastOutSlowInInterpolator);
            ViewCompat.postInvalidateOnAnimation(textInputLayout);
            ColorStateList colorStateList = this.k;
            ColorStateList colorStateList2 = this.j;
            TextPaint textPaint = this.N;
            if (colorStateList != colorStateList2) {
                textPaint.setColor(a(e(colorStateList2), e(this.k), clamp));
            } else {
                textPaint.setColor(e(colorStateList));
            }
            float f4 = this.V;
            float f5 = this.W;
            if (f4 != f5) {
                textPaint.setLetterSpacing(f(f5, f4, clamp, fastOutSlowInInterpolator));
            } else {
                textPaint.setLetterSpacing(f4);
            }
            this.H = com.google.android.material.animation.a.a(0.0f, this.R, clamp);
            this.I = com.google.android.material.animation.a.a(0.0f, this.S, clamp);
            this.J = com.google.android.material.animation.a.a(0.0f, this.T, clamp);
            int a = a(0, e(this.U), clamp);
            this.K = a;
            textPaint.setShadowLayer(this.H, this.I, this.J, a);
            ViewCompat.postInvalidateOnAnimation(textInputLayout);
        }
    }

    public final void l(float f) {
        c(f, false);
        ViewCompat.postInvalidateOnAnimation(this.a);
    }
}
