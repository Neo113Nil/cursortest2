package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import i.C6977a;
import ru.ozon.app.android.R;

/* renamed from: androidx.appcompat.widget.u, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C5075u extends C5071p {

    /* renamed from: d, reason: collision with root package name */
    private final C5074t f37971d;

    /* renamed from: e, reason: collision with root package name */
    private Drawable f37972e;

    /* renamed from: f, reason: collision with root package name */
    private ColorStateList f37973f;

    /* renamed from: g, reason: collision with root package name */
    private PorterDuff.Mode f37974g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f37975h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f37976i;

    C5075u(C5074t c5074t) {
        super(c5074t);
        this.f37973f = null;
        this.f37974g = null;
        this.f37975h = false;
        this.f37976i = false;
        this.f37971d = c5074t;
    }

    private void d() {
        Drawable drawable = this.f37972e;
        if (drawable != null) {
            if (this.f37975h || this.f37976i) {
                Drawable mutate = drawable.mutate();
                this.f37972e = mutate;
                if (this.f37975h) {
                    androidx.core.graphics.drawable.a.j(mutate, this.f37973f);
                }
                if (this.f37976i) {
                    androidx.core.graphics.drawable.a.k(this.f37972e, this.f37974g);
                }
                if (this.f37972e.isStateful()) {
                    this.f37972e.setState(this.f37971d.getDrawableState());
                }
            }
        }
    }

    @Override // androidx.appcompat.widget.C5071p
    final void b(AttributeSet attributeSet, int i11) {
        super.b(attributeSet, R.attr.seekBarStyle);
        C5074t c5074t = this.f37971d;
        Context context = c5074t.getContext();
        int[] iArr = C6977a.f65653g;
        b0 v11 = b0.v(context, attributeSet, iArr, R.attr.seekBarStyle, 0);
        androidx.core.view.Y.B(c5074t, c5074t.getContext(), iArr, attributeSet, v11.r(), R.attr.seekBarStyle);
        Drawable h11 = v11.h(0);
        if (h11 != null) {
            c5074t.setThumb(h11);
        }
        Drawable g10 = v11.g(1);
        Drawable drawable = this.f37972e;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f37972e = g10;
        if (g10 != null) {
            g10.setCallback(c5074t);
            androidx.core.graphics.drawable.a.h(g10, c5074t.getLayoutDirection());
            if (g10.isStateful()) {
                g10.setState(c5074t.getDrawableState());
            }
            d();
        }
        c5074t.invalidate();
        if (v11.s(3)) {
            this.f37974g = H.c(v11.k(3, -1), this.f37974g);
            this.f37976i = true;
        }
        if (v11.s(2)) {
            this.f37973f = v11.c(2);
            this.f37975h = true;
        }
        v11.x();
        d();
    }

    final void e(Canvas canvas) {
        if (this.f37972e != null) {
            int max = this.f37971d.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f37972e.getIntrinsicWidth();
                int intrinsicHeight = this.f37972e.getIntrinsicHeight();
                int i11 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i12 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f37972e.setBounds(-i11, -i12, i11, i12);
                float width = ((r0.getWidth() - r0.getPaddingLeft()) - r0.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(r0.getPaddingLeft(), r0.getHeight() / 2);
                for (int i13 = 0; i13 <= max; i13++) {
                    this.f37972e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    final void f() {
        Drawable drawable = this.f37972e;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        C5074t c5074t = this.f37971d;
        if (drawable.setState(c5074t.getDrawableState())) {
            c5074t.invalidateDrawable(drawable);
        }
    }

    final void g() {
        Drawable drawable = this.f37972e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }
}
