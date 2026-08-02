package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;
import n3.AbstractC1464a;

/* loaded from: classes.dex */
public class AppCompatRadioButton extends RadioButton {

    /* renamed from: a, reason: collision with root package name */
    public final C0663t f8290a;

    /* renamed from: b, reason: collision with root package name */
    public final E4.L f8291b;

    /* renamed from: c, reason: collision with root package name */
    public final F2.L0 f8292c;

    /* renamed from: d, reason: collision with root package name */
    public C0669w f8293d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatRadioButton(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Y0.a(context);
        X0.a(getContext(), this);
        C0663t c0663t = new C0663t(this);
        this.f8290a = c0663t;
        c0663t.c(attributeSet, i7);
        E4.L l7 = new E4.L(this);
        this.f8291b = l7;
        l7.q(attributeSet, i7);
        F2.L0 l02 = new F2.L0(this);
        this.f8292c = l02;
        l02.f(attributeSet, i7);
        getEmojiTextViewHelper().b(attributeSet, i7);
    }

    private C0669w getEmojiTextViewHelper() {
        if (this.f8293d == null) {
            this.f8293d = new C0669w(this);
        }
        return this.f8293d;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        E4.L l7 = this.f8291b;
        if (l7 != null) {
            l7.l();
        }
        F2.L0 l02 = this.f8292c;
        if (l02 != null) {
            l02.b();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        C0663t c0663t = this.f8290a;
        if (c0663t != null) {
            c0663t.getClass();
        }
        return compoundPaddingLeft;
    }

    public ColorStateList getSupportBackgroundTintList() {
        E4.L l7 = this.f8291b;
        if (l7 != null) {
            return l7.n();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        E4.L l7 = this.f8291b;
        if (l7 != null) {
            return l7.o();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        C0663t c0663t = this.f8290a;
        if (c0663t != null) {
            return c0663t.f8738a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C0663t c0663t = this.f8290a;
        if (c0663t != null) {
            return c0663t.f8739b;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f8292c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f8292c.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z4) {
        super.setAllCaps(z4);
        getEmojiTextViewHelper().c(z4);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        E4.L l7 = this.f8291b;
        if (l7 != null) {
            l7.r();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i7) {
        super.setBackgroundResource(i7);
        E4.L l7 = this.f8291b;
        if (l7 != null) {
            l7.s(i7);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C0663t c0663t = this.f8290a;
        if (c0663t != null) {
            if (c0663t.f8742e) {
                c0663t.f8742e = false;
            } else {
                c0663t.f8742e = true;
                c0663t.a();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        F2.L0 l02 = this.f8292c;
        if (l02 != null) {
            l02.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        F2.L0 l02 = this.f8292c;
        if (l02 != null) {
            l02.b();
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
        E4.L l7 = this.f8291b;
        if (l7 != null) {
            l7.v(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        E4.L l7 = this.f8291b;
        if (l7 != null) {
            l7.w(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C0663t c0663t = this.f8290a;
        if (c0663t != null) {
            c0663t.f8738a = colorStateList;
            c0663t.f8740c = true;
            c0663t.a();
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C0663t c0663t = this.f8290a;
        if (c0663t != null) {
            c0663t.f8739b = mode;
            c0663t.f8741d = true;
            c0663t.a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        F2.L0 l02 = this.f8292c;
        l02.l(colorStateList);
        l02.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        F2.L0 l02 = this.f8292c;
        l02.m(mode);
        l02.b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i7) {
        setButtonDrawable(AbstractC1464a.w(getContext(), i7));
    }
}
