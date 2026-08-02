package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;
import androidx.annotation.NonNull;
import j.C7232a;

/* renamed from: androidx.appcompat.widget.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5069n extends MultiAutoCompleteTextView implements J {

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f37958d = {R.attr.popupBackground};

    /* renamed from: a, reason: collision with root package name */
    private final C5060e f37959a;

    /* renamed from: b, reason: collision with root package name */
    private final C5080z f37960b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    private final C5065j f37961c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5069n(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, ru.ozon.app.android.R.attr.autoCompleteTextViewStyle);
        Y.a(context);
        W.a(this, getContext());
        b0 v11 = b0.v(getContext(), attributeSet, f37958d, ru.ozon.app.android.R.attr.autoCompleteTextViewStyle, 0);
        if (v11.s(0)) {
            setDropDownBackgroundDrawable(v11.g(0));
        }
        v11.x();
        C5060e c5060e = new C5060e(this);
        this.f37959a = c5060e;
        c5060e.d(attributeSet, ru.ozon.app.android.R.attr.autoCompleteTextViewStyle);
        C5080z c5080z = new C5080z(this);
        this.f37960b = c5080z;
        c5080z.m(attributeSet, ru.ozon.app.android.R.attr.autoCompleteTextViewStyle);
        c5080z.b();
        C5065j c5065j = new C5065j(this);
        this.f37961c = c5065j;
        c5065j.d(attributeSet, ru.ozon.app.android.R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (C5065j.b(keyListener)) {
            boolean isFocusable = isFocusable();
            boolean isClickable = isClickable();
            boolean isLongClickable = isLongClickable();
            int inputType = getInputType();
            KeyListener a11 = c5065j.a(keyListener);
            if (a11 == keyListener) {
                return;
            }
            super.setKeyListener(a11);
            setRawInputType(inputType);
            setFocusable(isFocusable);
            setClickable(isClickable);
            setLongClickable(isLongClickable);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        C5060e c5060e = this.f37959a;
        if (c5060e != null) {
            c5060e.a();
        }
        C5080z c5080z = this.f37960b;
        if (c5080z != null) {
            c5080z.b();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C5067l.a(onCreateInputConnection, editorInfo, this);
        return this.f37961c.e(onCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C5060e c5060e = this.f37959a;
        if (c5060e != null) {
            c5060e.e();
        }
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i11) {
        super.setBackgroundResource(i11);
        C5060e c5060e = this.f37959a;
        if (c5060e != null) {
            c5060e.f(i11);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C5080z c5080z = this.f37960b;
        if (c5080z != null) {
            c5080z.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C5080z c5080z = this.f37960b;
        if (c5080z != null) {
            c5080z.b();
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public final void setDropDownBackgroundResource(int i11) {
        setDropDownBackgroundDrawable(C7232a.a(getContext(), i11));
    }

    @Override // androidx.appcompat.widget.J
    public final void setEmojiCompatEnabled(boolean z11) {
        this.f37961c.f(false);
    }

    @Override // android.widget.TextView
    public final void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f37961c.a(keyListener));
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i11) {
        super.setTextAppearance(context, i11);
        C5080z c5080z = this.f37960b;
        if (c5080z != null) {
            c5080z.o(i11, context);
        }
    }
}
