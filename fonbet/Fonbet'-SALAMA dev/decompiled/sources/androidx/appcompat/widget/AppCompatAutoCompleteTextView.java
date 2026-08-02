package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import n3.AbstractC1464a;
import w1.C1726n0;

/* loaded from: classes.dex */
public class AppCompatAutoCompleteTextView extends AutoCompleteTextView {

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f8259d = {R.attr.popupBackground};

    /* renamed from: a, reason: collision with root package name */
    public final E4.L f8260a;

    /* renamed from: b, reason: collision with root package name */
    public final F2.L0 f8261b;

    /* renamed from: c, reason: collision with root package name */
    public final C0671x f8262c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatAutoCompleteTextView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Y0.a(context);
        X0.a(getContext(), this);
        C1726n0 F7 = C1726n0.F(getContext(), attributeSet, f8259d, i7);
        if (((TypedArray) F7.f17806c).hasValue(0)) {
            setDropDownBackgroundDrawable(F7.u(0));
        }
        F7.H();
        E4.L l7 = new E4.L(this);
        this.f8260a = l7;
        l7.q(attributeSet, i7);
        F2.L0 l02 = new F2.L0(this);
        this.f8261b = l02;
        l02.f(attributeSet, i7);
        l02.b();
        C0671x c0671x = new C0671x(this);
        this.f8262c = c0671x;
        c0671x.b(attributeSet, i7);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean isFocusable = super.isFocusable();
        boolean isClickable = super.isClickable();
        boolean isLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener a2 = c0671x.a(keyListener);
        if (a2 == keyListener) {
            return;
        }
        super.setKeyListener(a2);
        super.setRawInputType(inputType);
        super.setFocusable(isFocusable);
        super.setClickable(isClickable);
        super.setLongClickable(isLongClickable);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        E4.L l7 = this.f8260a;
        if (l7 != null) {
            l7.l();
        }
        F2.L0 l02 = this.f8261b;
        if (l02 != null) {
            l02.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return AbstractC1464a.X(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        E4.L l7 = this.f8260a;
        if (l7 != null) {
            return l7.n();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        E4.L l7 = this.f8260a;
        if (l7 != null) {
            return l7.o();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f8261b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f8261b.e();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        p3.f.S(editorInfo, onCreateInputConnection, this);
        return this.f8262c.c(onCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        E4.L l7 = this.f8260a;
        if (l7 != null) {
            l7.r();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i7) {
        super.setBackgroundResource(i7);
        E4.L l7 = this.f8260a;
        if (l7 != null) {
            l7.s(i7);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        F2.L0 l02 = this.f8261b;
        if (l02 != null) {
            l02.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        F2.L0 l02 = this.f8261b;
        if (l02 != null) {
            l02.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC1464a.Y(callback, this));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i7) {
        setDropDownBackgroundDrawable(AbstractC1464a.w(getContext(), i7));
    }

    public void setEmojiCompatEnabled(boolean z4) {
        this.f8262c.d(z4);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f8262c.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        E4.L l7 = this.f8260a;
        if (l7 != null) {
            l7.v(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        E4.L l7 = this.f8260a;
        if (l7 != null) {
            l7.w(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        F2.L0 l02 = this.f8261b;
        l02.l(colorStateList);
        l02.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        F2.L0 l02 = this.f8261b;
        l02.m(mode);
        l02.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i7) {
        super.setTextAppearance(context, i7);
        F2.L0 l02 = this.f8261b;
        if (l02 != null) {
            l02.g(i7, context);
        }
    }
}
