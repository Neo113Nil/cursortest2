package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import androidx.annotation.NonNull;
import j.C7232a;
import ru.ozon.app.android.R;

/* renamed from: androidx.appcompat.widget.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5061f extends CheckedTextView implements J {

    /* renamed from: a, reason: collision with root package name */
    private final C5062g f37907a;

    /* renamed from: b, reason: collision with root package name */
    private final C5060e f37908b;

    /* renamed from: c, reason: collision with root package name */
    private final C5080z f37909c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    private C5066k f37910d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5061f(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.checkedTextViewStyle);
        Y.a(context);
        W.a(this, getContext());
        C5080z c5080z = new C5080z(this);
        this.f37909c = c5080z;
        c5080z.m(attributeSet, R.attr.checkedTextViewStyle);
        c5080z.b();
        C5060e c5060e = new C5060e(this);
        this.f37908b = c5060e;
        c5060e.d(attributeSet, R.attr.checkedTextViewStyle);
        C5062g c5062g = new C5062g(this);
        this.f37907a = c5062g;
        c5062g.b(attributeSet);
        if (this.f37910d == null) {
            this.f37910d = new C5066k(this);
        }
        this.f37910d.c(attributeSet, R.attr.checkedTextViewStyle);
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        C5080z c5080z = this.f37909c;
        if (c5080z != null) {
            c5080z.b();
        }
        C5060e c5060e = this.f37908b;
        if (c5060e != null) {
            c5060e.a();
        }
        C5062g c5062g = this.f37907a;
        if (c5062g != null) {
            c5062g.a();
        }
    }

    @Override // android.widget.TextView
    public final ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.k.l(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(@NonNull EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C5067l.a(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView
    public final void setAllCaps(boolean z11) {
        super.setAllCaps(z11);
        if (this.f37910d == null) {
            this.f37910d = new C5066k(this);
        }
        this.f37910d.d(z11);
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C5060e c5060e = this.f37908b;
        if (c5060e != null) {
            c5060e.e();
        }
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i11) {
        super.setBackgroundResource(i11);
        C5060e c5060e = this.f37908b;
        if (c5060e != null) {
            c5060e.f(i11);
        }
    }

    @Override // android.widget.CheckedTextView
    public final void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        C5062g c5062g = this.f37907a;
        if (c5062g != null) {
            c5062g.c();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C5080z c5080z = this.f37909c;
        if (c5080z != null) {
            c5080z.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C5080z c5080z = this.f37909c;
        if (c5080z != null) {
            c5080z.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.k.m(callback, this));
    }

    @Override // androidx.appcompat.widget.J
    public final void setEmojiCompatEnabled(boolean z11) {
        if (this.f37910d == null) {
            this.f37910d = new C5066k(this);
        }
        this.f37910d.e(false);
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(@NonNull Context context, int i11) {
        super.setTextAppearance(context, i11);
        C5080z c5080z = this.f37909c;
        if (c5080z != null) {
            c5080z.o(i11, context);
        }
    }

    @Override // android.widget.CheckedTextView
    public final void setCheckMarkDrawable(int i11) {
        setCheckMarkDrawable(C7232a.a(getContext(), i11));
    }
}
