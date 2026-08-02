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
import h.AbstractC1174a;
import n3.AbstractC1464a;
import w1.C1726n0;

/* loaded from: classes.dex */
public class AppCompatCheckedTextView extends CheckedTextView {

    /* renamed from: a, reason: collision with root package name */
    public final C0663t f8270a;

    /* renamed from: b, reason: collision with root package name */
    public final E4.L f8271b;

    /* renamed from: c, reason: collision with root package name */
    public final F2.L0 f8272c;

    /* renamed from: d, reason: collision with root package name */
    public C0669w f8273d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0083 A[Catch: all -> 0x0063, TryCatch #1 {all -> 0x0063, blocks: (B:3:0x004a, B:5:0x0051, B:8:0x0057, B:9:0x007c, B:11:0x0083, B:12:0x008a, B:14:0x0091, B:21:0x0065, B:23:0x006b, B:25:0x0071), top: B:2:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0091 A[Catch: all -> 0x0063, TRY_LEAVE, TryCatch #1 {all -> 0x0063, blocks: (B:3:0x004a, B:5:0x0051, B:8:0x0057, B:9:0x007c, B:11:0x0083, B:12:0x008a, B:14:0x0091, B:21:0x0065, B:23:0x006b, B:25:0x0071), top: B:2:0x004a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AppCompatCheckedTextView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        int resourceId;
        int resourceId2;
        Y0.a(context);
        X0.a(getContext(), this);
        F2.L0 l02 = new F2.L0(this);
        this.f8272c = l02;
        l02.f(attributeSet, i7);
        l02.b();
        E4.L l7 = new E4.L(this);
        this.f8271b = l7;
        l7.q(attributeSet, i7);
        this.f8270a = new C0663t(this);
        Context context2 = getContext();
        int[] iArr = AbstractC1174a.f13334m;
        C1726n0 F7 = C1726n0.F(context2, attributeSet, iArr, i7);
        TypedArray typedArray = (TypedArray) F7.f17806c;
        P.U.g(this, getContext(), iArr, attributeSet, (TypedArray) F7.f17806c, i7);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    setCheckMarkDrawable(AbstractC1464a.w(getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                }
                if (typedArray.hasValue(2)) {
                    setCheckMarkTintList(F7.q(2));
                }
                if (typedArray.hasValue(3)) {
                    setCheckMarkTintMode(AbstractC0637f0.c(typedArray.getInt(3, -1), null));
                }
                F7.H();
                getEmojiTextViewHelper().b(attributeSet, i7);
            }
            if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                setCheckMarkDrawable(AbstractC1464a.w(getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
            }
            if (typedArray.hasValue(3)) {
            }
            F7.H();
            getEmojiTextViewHelper().b(attributeSet, i7);
        } catch (Throwable th) {
            F7.H();
            throw th;
        }
    }

    private C0669w getEmojiTextViewHelper() {
        if (this.f8273d == null) {
            this.f8273d = new C0669w(this);
        }
        return this.f8273d;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        F2.L0 l02 = this.f8272c;
        if (l02 != null) {
            l02.b();
        }
        E4.L l7 = this.f8271b;
        if (l7 != null) {
            l7.l();
        }
        C0663t c0663t = this.f8270a;
        if (c0663t != null) {
            c0663t.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return AbstractC1464a.X(super.getCustomSelectionActionModeCallback());
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
        C0663t c0663t = this.f8270a;
        if (c0663t != null) {
            return c0663t.f8738a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        C0663t c0663t = this.f8270a;
        if (c0663t != null) {
            return c0663t.f8739b;
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
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        p3.f.S(editorInfo, onCreateInputConnection, this);
        return onCreateInputConnection;
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
        C0663t c0663t = this.f8270a;
        if (c0663t != null) {
            if (c0663t.f8742e) {
                c0663t.f8742e = false;
            } else {
                c0663t.f8742e = true;
                c0663t.b();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        F2.L0 l02 = this.f8272c;
        if (l02 != null) {
            l02.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        F2.L0 l02 = this.f8272c;
        if (l02 != null) {
            l02.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC1464a.Y(callback, this));
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
        C0663t c0663t = this.f8270a;
        if (c0663t != null) {
            c0663t.f8738a = colorStateList;
            c0663t.f8740c = true;
            c0663t.b();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        C0663t c0663t = this.f8270a;
        if (c0663t != null) {
            c0663t.f8739b = mode;
            c0663t.f8741d = true;
            c0663t.b();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        F2.L0 l02 = this.f8272c;
        l02.l(colorStateList);
        l02.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        F2.L0 l02 = this.f8272c;
        l02.m(mode);
        l02.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i7) {
        super.setTextAppearance(context, i7);
        F2.L0 l02 = this.f8272c;
        if (l02 != null) {
            l02.g(i7, context);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i7) {
        setCheckMarkDrawable(AbstractC1464a.w(getContext(), i7));
    }
}
