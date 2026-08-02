package p000;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;

/* JADX INFO: renamed from: g6 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0238g6 extends MultiAutoCompleteTextView {

    /* JADX INFO: renamed from: m */
    public static final int[] f2630m = {R.attr.popupBackground};

    /* JADX INFO: renamed from: j */
    public final C0864x4 f2631j;

    /* JADX INFO: renamed from: k */
    public final C0164e7 f2632k;

    /* JADX INFO: renamed from: l */
    public final C0312i6 f2633l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0238g6(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, live.football.scorerepublic.R.attr.autoCompleteTextViewStyle);
        md1.m3376a(context);
        zc1.m5876a(this, getContext());
        oq0 oq0VarM3731n = oq0.m3731n(getContext(), attributeSet, f2630m, live.football.scorerepublic.R.attr.autoCompleteTextViewStyle);
        if (((TypedArray) oq0VarM3731n.f5841l).hasValue(0)) {
            setDropDownBackgroundDrawable(oq0VarM3731n.m3735e(0));
        }
        oq0VarM3731n.m3742o();
        C0864x4 c0864x4 = new C0864x4(this);
        this.f2631j = c0864x4;
        c0864x4.m5518d(attributeSet, live.football.scorerepublic.R.attr.autoCompleteTextViewStyle);
        C0164e7 c0164e7 = new C0164e7(this);
        this.f2632k = c0164e7;
        c0164e7.m1379f(attributeSet, live.football.scorerepublic.R.attr.autoCompleteTextViewStyle);
        c0164e7.m1376b();
        C0312i6 c0312i6 = new C0312i6(this, 8);
        this.f2633l = c0312i6;
        c0312i6.mo2544o(attributeSet, live.football.scorerepublic.R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = isFocusable();
        boolean zIsClickable = isClickable();
        boolean zIsLongClickable = isLongClickable();
        int inputType = getInputType();
        KeyListener keyListenerM2542m = c0312i6.m2542m(keyListener);
        if (keyListenerM2542m == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerM2542m);
        setRawInputType(inputType);
        setFocusable(zIsFocusable);
        setClickable(zIsClickable);
        setLongClickable(zIsLongClickable);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0864x4 c0864x4 = this.f2631j;
        if (c0864x4 != null) {
            c0864x4.m5515a();
        }
        C0164e7 c0164e7 = this.f2632k;
        if (c0164e7 != null) {
            c0164e7.m1376b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0864x4 c0864x4 = this.f2631j;
        if (c0864x4 != null) {
            return c0864x4.m5516b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0864x4 c0864x4 = this.f2631j;
        if (c0864x4 != null) {
            return c0864x4.m5517c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f2632k.m1377d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f2632k.m1378e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        vt1.m5195g(editorInfo, inputConnectionOnCreateInputConnection, this);
        return this.f2633l.m2545p(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0864x4 c0864x4 = this.f2631j;
        if (c0864x4 != null) {
            c0864x4.m5519e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0864x4 c0864x4 = this.f2631j;
        if (c0864x4 != null) {
            c0864x4.m5520f(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0164e7 c0164e7 = this.f2632k;
        if (c0164e7 != null) {
            c0164e7.m1376b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0164e7 c0164e7 = this.f2632k;
        if (c0164e7 != null) {
            c0164e7.m1376b();
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(j22.m2807p(getContext(), i));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.f2633l.m2554z(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f2633l.m2542m(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0864x4 c0864x4 = this.f2631j;
        if (c0864x4 != null) {
            c0864x4.m5522h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0864x4 c0864x4 = this.f2631j;
        if (c0864x4 != null) {
            c0864x4.m5523i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0164e7 c0164e7 = this.f2632k;
        c0164e7.m1381i(colorStateList);
        c0164e7.m1376b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0164e7 c0164e7 = this.f2632k;
        c0164e7.m1382j(mode);
        c0164e7.m1376b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0164e7 c0164e7 = this.f2632k;
        if (c0164e7 != null) {
            c0164e7.m1380g(context, i);
        }
    }
}
