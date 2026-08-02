package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;
import androidx.annotation.NonNull;
import j.C7232a;
import ru.ozon.app.android.R;

/* loaded from: classes.dex */
public class AppCompatCheckBox extends CheckBox implements J {

    /* renamed from: a, reason: collision with root package name */
    private final C5063h f37605a;

    /* renamed from: b, reason: collision with root package name */
    private final C5060e f37606b;

    /* renamed from: c, reason: collision with root package name */
    private final C5080z f37607c;

    /* renamed from: d, reason: collision with root package name */
    private C5066k f37608d;

    public AppCompatCheckBox(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.checkboxStyle);
    }

    @NonNull
    private C5066k b() {
        if (this.f37608d == null) {
            this.f37608d = new C5066k(this);
        }
        return this.f37608d;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C5060e c5060e = this.f37606b;
        if (c5060e != null) {
            c5060e.a();
        }
        C5080z c5080z = this.f37607c;
        if (c5080z != null) {
            c5080z.b();
        }
    }

    @Override // android.widget.TextView
    public final void setAllCaps(boolean z11) {
        super.setAllCaps(z11);
        b().d(z11);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C5060e c5060e = this.f37606b;
        if (c5060e != null) {
            c5060e.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i11) {
        super.setBackgroundResource(i11);
        C5060e c5060e = this.f37606b;
        if (c5060e != null) {
            c5060e.f(i11);
        }
    }

    @Override // android.widget.CompoundButton
    public final void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C5063h c5063h = this.f37605a;
        if (c5063h != null) {
            c5063h.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C5080z c5080z = this.f37607c;
        if (c5080z != null) {
            c5080z.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C5080z c5080z = this.f37607c;
        if (c5080z != null) {
            c5080z.b();
        }
    }

    @Override // androidx.appcompat.widget.J
    public final void setEmojiCompatEnabled(boolean z11) {
        b().e(false);
    }

    @Override // android.widget.TextView
    public final void setFilters(@NonNull InputFilter[] inputFilterArr) {
        super.setFilters(b().a(inputFilterArr));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatCheckBox(@NonNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Y.a(context);
        W.a(this, getContext());
        C5063h c5063h = new C5063h(this);
        this.f37605a = c5063h;
        c5063h.a(attributeSet, i11);
        C5060e c5060e = new C5060e(this);
        this.f37606b = c5060e;
        c5060e.d(attributeSet, i11);
        C5080z c5080z = new C5080z(this);
        this.f37607c = c5080z;
        c5080z.m(attributeSet, i11);
        b().c(attributeSet, i11);
    }

    @Override // android.widget.CompoundButton
    public final void setButtonDrawable(int i11) {
        setButtonDrawable(C7232a.a(getContext(), i11));
    }
}
