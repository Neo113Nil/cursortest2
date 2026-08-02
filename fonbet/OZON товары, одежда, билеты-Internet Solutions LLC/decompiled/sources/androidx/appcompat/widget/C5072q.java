package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;
import androidx.annotation.NonNull;
import j.C7232a;
import ru.ozon.app.android.R;

/* renamed from: androidx.appcompat.widget.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5072q extends RadioButton implements J {

    /* renamed from: a, reason: collision with root package name */
    private final C5063h f37965a;

    /* renamed from: b, reason: collision with root package name */
    private final C5060e f37966b;

    /* renamed from: c, reason: collision with root package name */
    private final C5080z f37967c;

    /* renamed from: d, reason: collision with root package name */
    private C5066k f37968d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5072q(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.radioButtonStyle);
        Y.a(context);
        W.a(this, getContext());
        C5063h c5063h = new C5063h(this);
        this.f37965a = c5063h;
        c5063h.a(attributeSet, R.attr.radioButtonStyle);
        C5060e c5060e = new C5060e(this);
        this.f37966b = c5060e;
        c5060e.d(attributeSet, R.attr.radioButtonStyle);
        C5080z c5080z = new C5080z(this);
        this.f37967c = c5080z;
        c5080z.m(attributeSet, R.attr.radioButtonStyle);
        a().c(attributeSet, R.attr.radioButtonStyle);
    }

    @NonNull
    private C5066k a() {
        if (this.f37968d == null) {
            this.f37968d = new C5066k(this);
        }
        return this.f37968d;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        C5060e c5060e = this.f37966b;
        if (c5060e != null) {
            c5060e.a();
        }
        C5080z c5080z = this.f37967c;
        if (c5080z != null) {
            c5080z.b();
        }
    }

    @Override // android.widget.TextView
    public final void setAllCaps(boolean z11) {
        super.setAllCaps(z11);
        a().d(z11);
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C5060e c5060e = this.f37966b;
        if (c5060e != null) {
            c5060e.e();
        }
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i11) {
        super.setBackgroundResource(i11);
        C5060e c5060e = this.f37966b;
        if (c5060e != null) {
            c5060e.f(i11);
        }
    }

    @Override // android.widget.CompoundButton
    public final void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C5063h c5063h = this.f37965a;
        if (c5063h != null) {
            c5063h.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C5080z c5080z = this.f37967c;
        if (c5080z != null) {
            c5080z.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C5080z c5080z = this.f37967c;
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

    @Override // android.widget.CompoundButton
    public final void setButtonDrawable(int i11) {
        setButtonDrawable(C7232a.a(getContext(), i11));
    }
}
