package n;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import h.AbstractC1986a;
import r0.AbstractC2346c;
import x1.C2641b;

/* renamed from: n.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2144n extends AutoCompleteTextView implements s1.h {

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f18290n = {R.attr.popupBackground};

    /* renamed from: k, reason: collision with root package name */
    public final C2145o f18291k;

    /* renamed from: l, reason: collision with root package name */
    public final C2155z f18292l;

    /* renamed from: m, reason: collision with root package name */
    public final C2138i f18293m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC2144n(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, game.betting133.sports1xbet.R.attr.autoCompleteTextViewStyle);
        s0.a(context);
        r0.a(getContext(), this);
        v3.e G5 = v3.e.G(getContext(), attributeSet, f18290n, game.betting133.sports1xbet.R.attr.autoCompleteTextViewStyle);
        if (((TypedArray) G5.f20433m).hasValue(0)) {
            setDropDownBackgroundDrawable(G5.x(0));
        }
        G5.J();
        C2145o c2145o = new C2145o(this);
        this.f18291k = c2145o;
        c2145o.b(attributeSet, game.betting133.sports1xbet.R.attr.autoCompleteTextViewStyle);
        C2155z c2155z = new C2155z(this);
        this.f18292l = c2155z;
        c2155z.d(attributeSet, game.betting133.sports1xbet.R.attr.autoCompleteTextViewStyle);
        c2155z.b();
        C2138i c2138i = new C2138i(this, 1);
        this.f18293m = c2138i;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC1986a.f17174g, game.betting133.sports1xbet.R.attr.autoCompleteTextViewStyle, 0);
        try {
            boolean z3 = obtainStyledAttributes.hasValue(14) ? obtainStyledAttributes.getBoolean(14, true) : true;
            obtainStyledAttributes.recycle();
            c2138i.i(z3);
            KeyListener keyListener = getKeyListener();
            if (keyListener instanceof NumberKeyListener) {
                return;
            }
            boolean isFocusable = super.isFocusable();
            boolean isClickable = super.isClickable();
            boolean isLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener e3 = c2138i.e(keyListener);
            if (e3 == keyListener) {
                return;
            }
            super.setKeyListener(e3);
            super.setRawInputType(inputType);
            super.setFocusable(isFocusable);
            super.setClickable(isClickable);
            super.setLongClickable(isLongClickable);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C2145o c2145o = this.f18291k;
        if (c2145o != null) {
            c2145o.a();
        }
        C2155z c2155z = this.f18292l;
        if (c2155z != null) {
            c2155z.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return (!(customSelectionActionModeCallback instanceof s1.g) || Build.VERSION.SDK_INT < 26) ? customSelectionActionModeCallback : ((s1.g) customSelectionActionModeCallback).f19201a;
    }

    public ColorStateList getSupportBackgroundTintList() {
        t0 t0Var;
        C2145o c2145o = this.f18291k;
        if (c2145o == null || (t0Var = (t0) c2145o.f18298e) == null) {
            return null;
        }
        return (ColorStateList) t0Var.f18326c;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        t0 t0Var;
        C2145o c2145o = this.f18291k;
        if (c2145o == null || (t0Var = (t0) c2145o.f18298e) == null) {
            return null;
        }
        return (PorterDuff.Mode) t0Var.f18327d;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        t0 t0Var = this.f18292l.f18341h;
        if (t0Var != null) {
            return (ColorStateList) t0Var.f18326c;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        t0 t0Var = this.f18292l.f18341h;
        if (t0Var != null) {
            return (PorterDuff.Mode) t0Var.f18327d;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null && editorInfo.hintText == null) {
            for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            }
        }
        C2138i c2138i = (C2138i) this.f18293m.f18249l;
        if (onCreateInputConnection == null) {
            c2138i.getClass();
            return null;
        }
        G.v vVar = (G.v) c2138i.f18249l;
        vVar.getClass();
        return onCreateInputConnection instanceof C2641b ? onCreateInputConnection : new C2641b((AbstractC2144n) vVar.f1749l, onCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C2145o c2145o = this.f18291k;
        if (c2145o != null) {
            c2145o.f18294a = -1;
            c2145o.d(null);
            c2145o.a();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C2145o c2145o = this.f18291k;
        if (c2145o != null) {
            c2145o.c(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C2155z c2155z = this.f18292l;
        if (c2155z != null) {
            c2155z.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C2155z c2155z = this.f18292l;
        if (c2155z != null) {
            c2155z.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26 && i <= 27 && !(callback instanceof s1.g) && callback != null) {
            callback = new s1.g(callback, this);
        }
        super.setCustomSelectionActionModeCallback(callback);
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(AbstractC2346c.p(getContext(), i));
    }

    public void setEmojiCompatEnabled(boolean z3) {
        this.f18293m.i(z3);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f18293m.e(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C2145o c2145o = this.f18291k;
        if (c2145o != null) {
            c2145o.e(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C2145o c2145o = this.f18291k;
        if (c2145o != null) {
            c2145o.f(mode);
        }
    }

    @Override // s1.h
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C2155z c2155z = this.f18292l;
        if (c2155z.f18341h == null) {
            c2155z.f18341h = new t0();
        }
        t0 t0Var = c2155z.f18341h;
        t0Var.f18326c = colorStateList;
        t0Var.f18325b = colorStateList != null;
        c2155z.f18336b = t0Var;
        c2155z.f18337c = t0Var;
        c2155z.f18338d = t0Var;
        c2155z.f18339e = t0Var;
        c2155z.f = t0Var;
        c2155z.f18340g = t0Var;
        c2155z.b();
    }

    @Override // s1.h
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C2155z c2155z = this.f18292l;
        if (c2155z.f18341h == null) {
            c2155z.f18341h = new t0();
        }
        t0 t0Var = c2155z.f18341h;
        t0Var.f18327d = mode;
        t0Var.f18324a = mode != null;
        c2155z.f18336b = t0Var;
        c2155z.f18337c = t0Var;
        c2155z.f18338d = t0Var;
        c2155z.f18339e = t0Var;
        c2155z.f = t0Var;
        c2155z.f18340g = t0Var;
        c2155z.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C2155z c2155z = this.f18292l;
        if (c2155z != null) {
            c2155z.e(context, i);
        }
    }
}
