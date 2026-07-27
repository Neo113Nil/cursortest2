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
import com.chicken.jump.road.pump.R;
import h.AbstractC0323a;

/* renamed from: l.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1097p extends ImageButton {

    /* renamed from: a, reason: collision with root package name */
    public final C1095n f9847a;

    /* renamed from: b, reason: collision with root package name */
    public final V1.b f9848b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1097p(Context context) {
        super(context, null, R.attr.toolbarNavigationButtonStyle);
        i0.a(context);
        C1095n c1095n = new C1095n(this);
        this.f9847a = c1095n;
        c1095n.b(null, R.attr.toolbarNavigationButtonStyle);
        V1.b bVar = new V1.b(this);
        this.f9848b = bVar;
        bVar.u(R.attr.toolbarNavigationButtonStyle);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1095n c1095n = this.f9847a;
        if (c1095n != null) {
            c1095n.a();
        }
        V1.b bVar = this.f9848b;
        if (bVar != null) {
            bVar.r();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        V.e eVar;
        C1095n c1095n = this.f9847a;
        if (c1095n == null || (eVar = c1095n.f9841e) == null) {
            return null;
        }
        return (ColorStateList) eVar.f1604c;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        V.e eVar;
        C1095n c1095n = this.f9847a;
        if (c1095n == null || (eVar = c1095n.f9841e) == null) {
            return null;
        }
        return (PorterDuff.Mode) eVar.f1605d;
    }

    public ColorStateList getSupportImageTintList() {
        V.e eVar;
        V1.b bVar = this.f9848b;
        if (bVar == null || (eVar = (V.e) bVar.f1615c) == null) {
            return null;
        }
        return (ColorStateList) eVar.f1604c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        V.e eVar;
        V1.b bVar = this.f9848b;
        if (bVar == null || (eVar = (V.e) bVar.f1615c) == null) {
            return null;
        }
        return (PorterDuff.Mode) eVar.f1605d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.f9848b.f1614b).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1095n c1095n = this.f9847a;
        if (c1095n != null) {
            c1095n.f9839c = -1;
            c1095n.d(null);
            c1095n.a();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i3) {
        super.setBackgroundResource(i3);
        C1095n c1095n = this.f9847a;
        if (c1095n != null) {
            c1095n.c(i3);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        V1.b bVar = this.f9848b;
        if (bVar != null) {
            bVar.r();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        V1.b bVar = this.f9848b;
        if (bVar != null) {
            bVar.r();
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i3) {
        V1.b bVar = this.f9848b;
        ImageView imageView = (ImageView) bVar.f1614b;
        if (i3 != 0) {
            Drawable a3 = AbstractC0323a.a(imageView.getContext(), i3);
            if (a3 != null) {
                Rect rect = AbstractC1105y.f9913a;
            }
            imageView.setImageDrawable(a3);
        } else {
            imageView.setImageDrawable(null);
        }
        bVar.r();
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        V1.b bVar = this.f9848b;
        if (bVar != null) {
            bVar.r();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1095n c1095n = this.f9847a;
        if (c1095n != null) {
            c1095n.e(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1095n c1095n = this.f9847a;
        if (c1095n != null) {
            c1095n.f(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        V1.b bVar = this.f9848b;
        if (bVar != null) {
            if (((V.e) bVar.f1615c) == null) {
                bVar.f1615c = new V.e();
            }
            V.e eVar = (V.e) bVar.f1615c;
            eVar.f1604c = colorStateList;
            eVar.f1603b = true;
            bVar.r();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        V1.b bVar = this.f9848b;
        if (bVar != null) {
            if (((V.e) bVar.f1615c) == null) {
                bVar.f1615c = new V.e();
            }
            V.e eVar = (V.e) bVar.f1615c;
            eVar.f1605d = mode;
            eVar.f1602a = true;
            bVar.r();
        }
    }
}
