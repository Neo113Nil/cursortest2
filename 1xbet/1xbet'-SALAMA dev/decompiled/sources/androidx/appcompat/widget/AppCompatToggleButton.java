package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatToggleButton extends ToggleButton {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final E4.L f8313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final F2.L0 f8314b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C0648w f8315c;

    public AppCompatToggleButton(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        X0.a(getContext(), this);
        E4.L l7 = new E4.L(this);
        this.f8313a = l7;
        l7.q(attributeSet, i7);
        F2.L0 l8 = new F2.L0(this);
        this.f8314b = l8;
        l8.f(attributeSet, i7);
        getEmojiTextViewHelper().b(attributeSet, i7);
    }

    private C0648w getEmojiTextViewHelper() {
        if (this.f8315c == null) {
            this.f8315c = new C0648w(this);
        }
        return this.f8315c;
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        E4.L l7 = this.f8313a;
        if (l7 != null) {
            l7.l();
        }
        F2.L0 l8 = this.f8314b;
        if (l8 != null) {
            l8.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        E4.L l7 = this.f8313a;
        if (l7 != null) {
            return l7.n();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        E4.L l7 = this.f8313a;
        if (l7 != null) {
            return l7.o();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f8314b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f8314b.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z4) {
        super.setAllCaps(z4);
        getEmojiTextViewHelper().c(z4);
    }

    @Override // android.widget.ToggleButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        E4.L l7 = this.f8313a;
        if (l7 != null) {
            l7.r();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i7) {
        super.setBackgroundResource(i7);
        E4.L l7 = this.f8313a;
        if (l7 != null) {
            l7.s(i7);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        F2.L0 l7 = this.f8314b;
        if (l7 != null) {
            l7.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        F2.L0 l7 = this.f8314b;
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
        E4.L l7 = this.f8313a;
        if (l7 != null) {
            l7.v(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        E4.L l7 = this.f8313a;
        if (l7 != null) {
            l7.w(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        F2.L0 l7 = this.f8314b;
        l7.l(colorStateList);
        l7.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        F2.L0 l7 = this.f8314b;
        l7.m(mode);
        l7.b();
    }
}
