package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import android.widget.ImageView;
import n3.AbstractC1464a;

/* loaded from: classes.dex */
public class AppCompatImageButton extends ImageButton {

    /* renamed from: a, reason: collision with root package name */
    public final E4.L f8280a;

    /* renamed from: b, reason: collision with root package name */
    public final B1.m f8281b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f8282c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatImageButton(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Y0.a(context);
        this.f8282c = false;
        X0.a(getContext(), this);
        E4.L l7 = new E4.L(this);
        this.f8280a = l7;
        l7.q(attributeSet, i7);
        B1.m mVar = new B1.m(this);
        this.f8281b = mVar;
        mVar.l(attributeSet, i7);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        E4.L l7 = this.f8280a;
        if (l7 != null) {
            l7.l();
        }
        B1.m mVar = this.f8281b;
        if (mVar != null) {
            mVar.e();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        E4.L l7 = this.f8280a;
        if (l7 != null) {
            return l7.n();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        E4.L l7 = this.f8280a;
        if (l7 != null) {
            return l7.o();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        G4.A a2;
        B1.m mVar = this.f8281b;
        if (mVar == null || (a2 = (G4.A) mVar.f1016d) == null) {
            return null;
        }
        return (ColorStateList) a2.f2873c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        G4.A a2;
        B1.m mVar = this.f8281b;
        if (mVar == null || (a2 = (G4.A) mVar.f1016d) == null) {
            return null;
        }
        return (PorterDuff.Mode) a2.f2874d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.f8281b.f1015c).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        E4.L l7 = this.f8280a;
        if (l7 != null) {
            l7.r();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i7) {
        super.setBackgroundResource(i7);
        E4.L l7 = this.f8280a;
        if (l7 != null) {
            l7.s(i7);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        B1.m mVar = this.f8281b;
        if (mVar != null) {
            mVar.e();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        B1.m mVar = this.f8281b;
        if (mVar != null && drawable != null && !this.f8282c) {
            mVar.f1014b = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (mVar != null) {
            mVar.e();
            if (this.f8282c) {
                return;
            }
            ImageView imageView = (ImageView) mVar.f1015c;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(mVar.f1014b);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i7) {
        super.setImageLevel(i7);
        this.f8282c = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i7) {
        B1.m mVar = this.f8281b;
        ImageView imageView = (ImageView) mVar.f1015c;
        if (i7 != 0) {
            Drawable w7 = AbstractC1464a.w(imageView.getContext(), i7);
            if (w7 != null) {
                AbstractC0637f0.a(w7);
            }
            imageView.setImageDrawable(w7);
        } else {
            imageView.setImageDrawable(null);
        }
        mVar.e();
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        B1.m mVar = this.f8281b;
        if (mVar != null) {
            mVar.e();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        E4.L l7 = this.f8280a;
        if (l7 != null) {
            l7.v(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        E4.L l7 = this.f8280a;
        if (l7 != null) {
            l7.w(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        B1.m mVar = this.f8281b;
        if (mVar != null) {
            if (((G4.A) mVar.f1016d) == null) {
                mVar.f1016d = new G4.A();
            }
            G4.A a2 = (G4.A) mVar.f1016d;
            a2.f2873c = colorStateList;
            a2.f2872b = true;
            mVar.e();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        B1.m mVar = this.f8281b;
        if (mVar != null) {
            if (((G4.A) mVar.f1016d) == null) {
                mVar.f1016d = new G4.A();
            }
            G4.A a2 = (G4.A) mVar.f1016d;
            a2.f2874d = mode;
            a2.f2871a = true;
            mVar.e();
        }
    }
}
