package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatCheckBox extends CheckBox {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0642t f8266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final E4.L f8267b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final F2.L0 f8268c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C0648w f8269d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatCheckBox(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Y0.a(context);
        X0.a(getContext(), this);
        C0642t c0642t = new C0642t(this);
        this.f8266a = c0642t;
        c0642t.c(attributeSet, i7);
        E4.L l7 = new E4.L(this);
        this.f8267b = l7;
        l7.q(attributeSet, i7);
        F2.L0 l8 = new F2.L0(this);
        this.f8268c = l8;
        l8.f(attributeSet, i7);
        getEmojiTextViewHelper().b(attributeSet, i7);
    }

    private C0648w getEmojiTextViewHelper() {
        if (this.f8269d == null) {
            this.f8269d = new C0648w(this);
        }
        return this.f8269d;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        E4.L l7 = this.f8267b;
        if (l7 != null) {
            l7.l();
        }
        F2.L0 l8 = this.f8268c;
        if (l8 != null) {
            l8.b();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        C0642t c0642t = this.f8266a;
        if (c0642t != null) {
            c0642t.getClass();
        }
        return compoundPaddingLeft;
    }

    public ColorStateList getSupportBackgroundTintList() {
        E4.L l7 = this.f8267b;
        if (l7 != null) {
            return l7.n();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        E4.L l7 = this.f8267b;
        if (l7 != null) {
            return l7.o();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        C0642t c0642t = this.f8266a;
        if (c0642t != null) {
            return c0642t.f8738a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C0642t c0642t = this.f8266a;
        if (c0642t != null) {
            return c0642t.f8739b;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f8268c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f8268c.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z4) {
        super.setAllCaps(z4);
        getEmojiTextViewHelper().c(z4);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        E4.L l7 = this.f8267b;
        if (l7 != null) {
            l7.r();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i7) {
        super.setBackgroundResource(i7);
        E4.L l7 = this.f8267b;
        if (l7 != null) {
            l7.s(i7);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C0642t c0642t = this.f8266a;
        if (c0642t != null) {
            if (c0642t.f8742e) {
                c0642t.f8742e = false;
            } else {
                c0642t.f8742e = true;
                c0642t.a();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        F2.L0 l7 = this.f8268c;
        if (l7 != null) {
            l7.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        F2.L0 l7 = this.f8268c;
        if (l7 != null) {
            l7.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z4) {
        getEmojiTextViewHelper().d(z4);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        E4.L l7 = this.f8267b;
        if (l7 != null) {
            l7.v(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        E4.L l7 = this.f8267b;
        if (l7 != null) {
            l7.w(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C0642t c0642t = this.f8266a;
        if (c0642t != null) {
            c0642t.f8738a = colorStateList;
            c0642t.f8740c = true;
            c0642t.a();
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C0642t c0642t = this.f8266a;
        if (c0642t != null) {
            c0642t.f8739b = mode;
            c0642t.f8741d = true;
            c0642t.a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        F2.L0 l7 = this.f8268c;
        l7.l(colorStateList);
        l7.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        F2.L0 l7 = this.f8268c;
        l7.m(mode);
        l7.b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i7) {
        setButtonDrawable(p097n3.a.w(getContext(), i7));
    }
}
