package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.chickyneer.roadway.R;
import h.AbstractC0477a;

/* renamed from: l.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1243o extends ImageButton {

    /* renamed from: a, reason: collision with root package name */
    public final a5.n f10924a;

    /* renamed from: b, reason: collision with root package name */
    public final B0.c f10925b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1243o(Context context) {
        super(context, null, R.attr.toolbarNavigationButtonStyle);
        g0.a(context);
        a5.n nVar = new a5.n(this);
        this.f10924a = nVar;
        nVar.b(null, R.attr.toolbarNavigationButtonStyle);
        B0.c cVar = new B0.c(this);
        this.f10925b = cVar;
        cVar.g(R.attr.toolbarNavigationButtonStyle);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        a5.n nVar = this.f10924a;
        if (nVar != null) {
            nVar.a();
        }
        B0.c cVar = this.f10925b;
        if (cVar != null) {
            cVar.c();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        T4.h hVar;
        a5.n nVar = this.f10924a;
        if (nVar == null || (hVar = (T4.h) nVar.f3976e) == null) {
            return null;
        }
        return (ColorStateList) hVar.f2878c;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        T4.h hVar;
        a5.n nVar = this.f10924a;
        if (nVar == null || (hVar = (T4.h) nVar.f3976e) == null) {
            return null;
        }
        return (PorterDuff.Mode) hVar.f2879d;
    }

    public ColorStateList getSupportImageTintList() {
        T4.h hVar;
        B0.c cVar = this.f10925b;
        if (cVar == null || (hVar = (T4.h) cVar.f141c) == null) {
            return null;
        }
        return (ColorStateList) hVar.f2878c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        T4.h hVar;
        B0.c cVar = this.f10925b;
        if (cVar == null || (hVar = (T4.h) cVar.f141c) == null) {
            return null;
        }
        return (PorterDuff.Mode) hVar.f2879d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.f10925b.f140b).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        a5.n nVar = this.f10924a;
        if (nVar != null) {
            nVar.f3972a = -1;
            nVar.d(null);
            nVar.a();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        a5.n nVar = this.f10924a;
        if (nVar != null) {
            nVar.c(i2);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        B0.c cVar = this.f10925b;
        if (cVar != null) {
            cVar.c();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        B0.c cVar = this.f10925b;
        if (cVar != null) {
            cVar.c();
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i2) {
        B0.c cVar = this.f10925b;
        ImageView imageView = (ImageView) cVar.f140b;
        if (i2 != 0) {
            Drawable a6 = AbstractC0477a.a(imageView.getContext(), i2);
            if (a6 != null) {
                Rect rect = AbstractC1250w.f10979a;
            }
            imageView.setImageDrawable(a6);
        } else {
            imageView.setImageDrawable(null);
        }
        cVar.c();
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        B0.c cVar = this.f10925b;
        if (cVar != null) {
            cVar.c();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        a5.n nVar = this.f10924a;
        if (nVar != null) {
            nVar.e(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        a5.n nVar = this.f10924a;
        if (nVar != null) {
            nVar.f(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        B0.c cVar = this.f10925b;
        if (cVar != null) {
            if (((T4.h) cVar.f141c) == null) {
                cVar.f141c = new T4.h();
            }
            T4.h hVar = (T4.h) cVar.f141c;
            hVar.f2878c = colorStateList;
            hVar.f2877b = true;
            cVar.c();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        B0.c cVar = this.f10925b;
        if (cVar != null) {
            if (((T4.h) cVar.f141c) == null) {
                cVar.f141c = new T4.h();
            }
            T4.h hVar = (T4.h) cVar.f141c;
            hVar.f2879d = mode;
            hVar.f2876a = true;
            cVar.c();
        }
    }
}
