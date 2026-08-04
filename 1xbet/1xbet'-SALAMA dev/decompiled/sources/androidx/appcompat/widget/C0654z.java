package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import p155w1.C1017n0;

/* JADX INFO: renamed from: androidx.appcompat.widget.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0654z extends C0650x {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AppCompatSeekBar f8757e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Drawable f8758f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ColorStateList f8759g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f8760h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f8761i;
    public boolean j;

    public C0654z(AppCompatSeekBar appCompatSeekBar) {
        super(appCompatSeekBar);
        this.f8759g = null;
        this.f8760h = null;
        this.f8761i = false;
        this.j = false;
        this.f8757e = appCompatSeekBar;
    }

    @Override // androidx.appcompat.widget.C0650x
    public final void b(AttributeSet attributeSet, int i7) {
        super.b(attributeSet, i7);
        AppCompatSeekBar appCompatSeekBar = this.f8757e;
        Context context = appCompatSeekBar.getContext();
        int[] iArr = p051h.a.f13336h;
        C1017n0 c1017n0F = C1017n0.F(context, attributeSet, iArr, i7);
        P.U.g(appCompatSeekBar, appCompatSeekBar.getContext(), iArr, attributeSet, (TypedArray) c1017n0F.f17812c, i7);
        Drawable drawableV = c1017n0F.v(0);
        if (drawableV != null) {
            appCompatSeekBar.setThumb(drawableV);
        }
        Drawable drawableU = c1017n0F.u(1);
        Drawable drawable = this.f8758f;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f8758f = drawableU;
        if (drawableU != null) {
            drawableU.setCallback(appCompatSeekBar);
            J.b.b(drawableU, appCompatSeekBar.getLayoutDirection());
            if (drawableU.isStateful()) {
                drawableU.setState(appCompatSeekBar.getDrawableState());
            }
            f();
        }
        appCompatSeekBar.invalidate();
        TypedArray typedArray = (TypedArray) c1017n0F.f17812c;
        if (typedArray.hasValue(3)) {
            this.f8760h = AbstractC0616f0.c(typedArray.getInt(3, -1), this.f8760h);
            this.j = true;
        }
        if (typedArray.hasValue(2)) {
            this.f8759g = c1017n0F.q(2);
            this.f8761i = true;
        }
        c1017n0F.H();
        f();
    }

    public final void f() {
        Drawable drawable = this.f8758f;
        if (drawable != null) {
            if (this.f8761i || this.j) {
                Drawable drawableMutate = drawable.mutate();
                this.f8758f = drawableMutate;
                if (this.f8761i) {
                    J.a.h(drawableMutate, this.f8759g);
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
            AppCompatSeekBar appCompatSeekBar = this.f8757e;
            int max = appCompatSeekBar.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f8758f.getIntrinsicWidth();
                int intrinsicHeight = this.f8758f.getIntrinsicHeight();
                int i7 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i8 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f8758f.setBounds(-i7, -i8, i7, i8);
                float width = ((appCompatSeekBar.getWidth() - appCompatSeekBar.getPaddingLeft()) - appCompatSeekBar.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(appCompatSeekBar.getPaddingLeft(), appCompatSeekBar.getHeight() / 2);
                for (int i9 = 0; i9 <= max; i9++) {
                    this.f8758f.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }
}
