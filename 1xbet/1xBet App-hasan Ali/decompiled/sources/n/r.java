package n;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.widget.ImageButton;
import android.widget.ImageView;
import game.betting133.sports1xbet.R;
import r0.AbstractC2346c;

/* loaded from: classes.dex */
public final class r extends ImageButton {

    /* renamed from: k, reason: collision with root package name */
    public final C2145o f18311k;

    /* renamed from: l, reason: collision with root package name */
    public final B.K f18312l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f18313m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Context context) {
        super(context, null, R.attr.toolbarNavigationButtonStyle);
        s0.a(context);
        this.f18313m = false;
        r0.a(getContext(), this);
        C2145o c2145o = new C2145o(this);
        this.f18311k = c2145o;
        c2145o.b(null, R.attr.toolbarNavigationButtonStyle);
        B.K k5 = new B.K(this);
        this.f18312l = k5;
        k5.i(R.attr.toolbarNavigationButtonStyle);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C2145o c2145o = this.f18311k;
        if (c2145o != null) {
            c2145o.a();
        }
        B.K k5 = this.f18312l;
        if (k5 != null) {
            k5.c();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        t0 t0Var;
        C2145o c2145o = this.f18311k;
        if (c2145o == null || (t0Var = (t0) c2145o.f18298e) == null) {
            return null;
        }
        return (ColorStateList) t0Var.f18326c;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        t0 t0Var;
        C2145o c2145o = this.f18311k;
        if (c2145o == null || (t0Var = (t0) c2145o.f18298e) == null) {
            return null;
        }
        return (PorterDuff.Mode) t0Var.f18327d;
    }

    public ColorStateList getSupportImageTintList() {
        t0 t0Var;
        B.K k5 = this.f18312l;
        if (k5 == null || (t0Var = (t0) k5.f639d) == null) {
            return null;
        }
        return (ColorStateList) t0Var.f18326c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        t0 t0Var;
        B.K k5 = this.f18312l;
        if (k5 == null || (t0Var = (t0) k5.f639d) == null) {
            return null;
        }
        return (PorterDuff.Mode) t0Var.f18327d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.f18312l.f638c).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C2145o c2145o = this.f18311k;
        if (c2145o != null) {
            c2145o.f18294a = -1;
            c2145o.d(null);
            c2145o.a();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C2145o c2145o = this.f18311k;
        if (c2145o != null) {
            c2145o.c(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        B.K k5 = this.f18312l;
        if (k5 != null) {
            k5.c();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        B.K k5 = this.f18312l;
        if (k5 != null && drawable != null && !this.f18313m) {
            k5.f637b = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (k5 != null) {
            k5.c();
            if (this.f18313m) {
                return;
            }
            ImageView imageView = (ImageView) k5.f638c;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(k5.f637b);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.f18313m = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        B.K k5 = this.f18312l;
        ImageView imageView = (ImageView) k5.f638c;
        if (i != 0) {
            Drawable p5 = AbstractC2346c.p(imageView.getContext(), i);
            if (p5 != null) {
                AbstractC2119M.a(p5);
            }
            imageView.setImageDrawable(p5);
        } else {
            imageView.setImageDrawable(null);
        }
        k5.c();
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        B.K k5 = this.f18312l;
        if (k5 != null) {
            k5.c();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C2145o c2145o = this.f18311k;
        if (c2145o != null) {
            c2145o.e(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C2145o c2145o = this.f18311k;
        if (c2145o != null) {
            c2145o.f(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        B.K k5 = this.f18312l;
        if (k5 != null) {
            if (((t0) k5.f639d) == null) {
                k5.f639d = new t0();
            }
            t0 t0Var = (t0) k5.f639d;
            t0Var.f18326c = colorStateList;
            t0Var.f18325b = true;
            k5.c();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        B.K k5 = this.f18312l;
        if (k5 != null) {
            if (((t0) k5.f639d) == null) {
                k5.f639d = new t0();
            }
            t0 t0Var = (t0) k5.f639d;
            t0Var.f18327d = mode;
            t0Var.f18324a = true;
            k5.c();
        }
    }
}
