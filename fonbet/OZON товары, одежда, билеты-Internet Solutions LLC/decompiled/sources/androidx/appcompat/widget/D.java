package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public final class D extends ToggleButton implements J {

    /* renamed from: a, reason: collision with root package name */
    private final C5060e f37624a;

    /* renamed from: b, reason: collision with root package name */
    private final C5080z f37625b;

    /* renamed from: c, reason: collision with root package name */
    private C5066k f37626c;

    public D(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.buttonStyleToggle);
        W.a(this, getContext());
        C5060e c5060e = new C5060e(this);
        this.f37624a = c5060e;
        c5060e.d(attributeSet, R.attr.buttonStyleToggle);
        C5080z c5080z = new C5080z(this);
        this.f37625b = c5080z;
        c5080z.m(attributeSet, R.attr.buttonStyleToggle);
        a().c(attributeSet, R.attr.buttonStyleToggle);
    }

    @NonNull
    private C5066k a() {
        if (this.f37626c == null) {
            this.f37626c = new C5066k(this);
        }
        return this.f37626c;
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        C5060e c5060e = this.f37624a;
        if (c5060e != null) {
            c5060e.a();
        }
        C5080z c5080z = this.f37625b;
        if (c5080z != null) {
            c5080z.b();
        }
    }

    @Override // android.widget.TextView
    public final void setAllCaps(boolean z11) {
        super.setAllCaps(z11);
        a().d(z11);
    }

    @Override // android.widget.ToggleButton, android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C5060e c5060e = this.f37624a;
        if (c5060e != null) {
            c5060e.e();
        }
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i11) {
        super.setBackgroundResource(i11);
        C5060e c5060e = this.f37624a;
        if (c5060e != null) {
            c5060e.f(i11);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C5080z c5080z = this.f37625b;
        if (c5080z != null) {
            c5080z.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C5080z c5080z = this.f37625b;
        if (c5080z != null) {
            c5080z.b();
        }
    }

    @Override // androidx.appcompat.widget.J
    public final void setEmojiCompatEnabled(boolean z11) {
        a().e(false);
    }

    @Override // android.widget.TextView
    public final void setFilters(@NonNull InputFilter[] inputFilterArr) {
        super.setFilters(a().a(inputFilterArr));
    }
}
