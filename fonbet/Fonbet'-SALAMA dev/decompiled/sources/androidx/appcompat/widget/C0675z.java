package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import h.AbstractC1174a;
import w1.C1726n0;

/* renamed from: androidx.appcompat.widget.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0675z extends C0671x {

    /* renamed from: e, reason: collision with root package name */
    public final AppCompatSeekBar f8757e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f8758f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f8759g;

    /* renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f8760h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f8761i;
    public boolean j;

    public C0675z(AppCompatSeekBar appCompatSeekBar) {
        super(appCompatSeekBar);
        this.f8759g = null;
        this.f8760h = null;
        this.f8761i = false;
        this.j = false;
        this.f8757e = appCompatSeekBar;
    }

    @Override // androidx.appcompat.widget.C0671x
    public final void b(AttributeSet attributeSet, int i7) {
        super.b(attributeSet, i7);
        AppCompatSeekBar appCompatSeekBar = this.f8757e;
        Context context = appCompatSeekBar.getContext();
        int[] iArr = AbstractC1174a.f13330h;
        C1726n0 F7 = C1726n0.F(context, attributeSet, iArr, i7);
        P.U.g(appCompatSeekBar, appCompatSeekBar.getContext(), iArr, attributeSet, (TypedArray) F7.f17806c, i7);
        Drawable v6 = F7.v(0);
        if (v6 != null) {
            appCompatSeekBar.setThumb(v6);
        }
        Drawable u4 = F7.u(1);
        Drawable drawable = this.f8758f;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f8758f = u4;
        if (u4 != null) {
            u4.setCallback(appCompatSeekBar);
            J.b.b(u4, appCompatSeekBar.getLayoutDirection());
            if (u4.isStateful()) {
                u4.setState(appCompatSeekBar.getDrawableState());
            }
            f();
        }
        appCompatSeekBar.invalidate();
        TypedArray typedArray = (TypedArray) F7.f17806c;
        if (typedArray.hasValue(3)) {
            this.f8760h = AbstractC0637f0.c(typedArray.getInt(3, -1), this.f8760h);
            this.j = true;
        }
        if (typedArray.hasValue(2)) {
            this.f8759g = F7.q(2);
            this.f8761i = true;
        }
        F7.H();
        f();
    }

    public final void f() {
        Drawable drawable = this.f8758f;
        if (drawable != null) {
            if (this.f8761i || this.j) {
                Drawable mutate = drawable.mutate();
                this.f8758f = mutate;
                if (this.f8761i) {
                    J.a.h(mutate, this.f8759g);
                }
                if (this.j) {
                    J.a.i(this.f8758f, this.f8760h);
                }
                if (this.f8758f.isStateful()) {
                    this.f8758f.setState(this.f8757e.getDrawableState());
                }
            }
        }
    }

    public final void g(Canvas canvas) {
        if (this.f8758f != null) {
            int max = this.f8757e.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f8758f.getIntrinsicWidth();
                int intrinsicHeight = this.f8758f.getIntrinsicHeight();
                int i7 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i8 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f8758f.setBounds(-i7, -i8, i7, i8);
                float width = ((r0.getWidth() - r0.getPaddingLeft()) - r0.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(r0.getPaddingLeft(), r0.getHeight() / 2);
                for (int i9 = 0; i9 <= max; i9++) {
                    this.f8758f.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
