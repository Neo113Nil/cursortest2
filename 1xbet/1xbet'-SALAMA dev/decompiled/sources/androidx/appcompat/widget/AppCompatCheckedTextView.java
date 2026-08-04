package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import p155w1.C1017n0;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatCheckedTextView extends CheckedTextView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0642t f8270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final E4.L f8271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final F2.L0 f8272c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C0648w f8273d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatCheckedTextView(Context context, AttributeSet attributeSet, int i7) {
        int resourceId;
        int resourceId2;
        super(context, attributeSet, i7);
        Y0.a(context);
        X0.a(getContext(), this);
        F2.L0 l7 = new F2.L0(this);
        this.f8272c = l7;
        l7.f(attributeSet, i7);
        l7.b();
        E4.L l8 = new E4.L(this);
        this.f8271b = l8;
        l8.q(attributeSet, i7);
        this.f8270a = new C0642t(this);
        Context context2 = getContext();
        int[] iArr = p051h.a.f13340m;
        C1017n0 c1017n0F = C1017n0.F(context2, attributeSet, iArr, i7);
        TypedArray typedArray = (TypedArray) c1017n0F.f17812c;
        P.U.g(this, getContext(), iArr, attributeSet, (TypedArray) c1017n0F.f17812c, i7);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    setCheckMarkDrawable(p097n3.a.w(getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                    if (typedArray.hasValue(0)) {
                        setCheckMarkDrawable(p097n3.a.w(getContext(), resourceId));
                    }
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                setCheckMarkDrawable(p097n3.a.w(getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                setCheckMarkTintList(c1017n0F.q(2));
            }
            if (typedArray.hasValue(3)) {
                setCheckMarkTintMode(AbstractC0616f0.c(typedArray.getInt(3, -1), null));
            }
            c1017n0F.H();
            getEmojiTextViewHelper().b(attributeSet, i7);
        } catch (Throwable th) {
            c1017n0F.H();
            throw th;
        }
    }

    private C0648w getEmojiTextViewHelper() {
        if (this.f8273d == null) {
            this.f8273d = new C0648w(this);
        }
        return this.f8273d;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        F2.L0 l7 = this.f8272c;
        if (l7 != null) {
            l7.b();
        }
        E4.L l8 = this.f8271b;
        if (l8 != null) {
            l8.l();
        }
        C0642t c0642t = this.f8270a;
        if (c0642t != null) {
            c0642t.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return p097n3.a.X(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        E4.L l7 = this.f8271b;
        if (l7 != null) {
            return l7.n();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        E4.L l7 = this.f8271b;
        if (l7 != null) {
            return l7.o();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        C0642t c0642t = this.f8270a;
        if (c0642t != null) {
            return c0642t.f8738a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        C0642t c0642t = this.f8270a;
        if (c0642t != null) {
            return c0642t.f8739b;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f8272c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f8272c.e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        p113p3.f.S(editorInfo, inputConnectionOnCreateInputConnection, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z4) {
        super.setAllCaps(z4);
        getEmojiTextViewHelper().c(z4);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        E4.L l7 = this.f8271b;
        if (l7 != null) {
            l7.r();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i7) {
        super.setBackgroundResource(i7);
        E4.L l7 = this.f8271b;
        if (l7 != null) {
            l7.s(i7);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        C0642t c0642t = this.f8270a;
        if (c0642t != null) {
            if (c0642t.f8742e) {
                c0642t.f8742e = false;
            } else {
                c0642t.f8742e = true;
                c0642t.b();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        F2.L0 l7 = this.f8272c;
        if (l7 != null) {
            l7.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        F2.L0 l7 = this.f8272c;
        if (l7 != null) {
            l7.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(p097n3.a.Y(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z4) {
        getEmojiTextViewHelper().d(z4);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        E4.L l7 = this.f8271b;
        if (l7 != null) {
            l7.v(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        E4.L l7 = this.f8271b;
        if (l7 != null) {
            l7.w(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        C0642t c0642t = this.f8270a;
        if (c0642t != null) {
            c0642t.f8738a = colorStateList;
            c0642t.f8740c = true;
            c0642t.b();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        C0642t c0642t = this.f8270a;
        if (c0642t != null) {
            c0642t.f8739b = mode;
            c0642t.f8741d = true;
            c0642t.b();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        F2.L0 l7 = this.f8272c;
        l7.l(colorStateList);
        l7.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        F2.L0 l7 = this.f8272c;
        l7.m(mode);
        l7.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i7) {
        super.setTextAppearance(context, i7);
        F2.L0 l7 = this.f8272c;
        if (l7 != null) {
            l7.g(i7, context);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i7) {
        setCheckMarkDrawable(p097n3.a.w(getContext(), i7));
    }
}
