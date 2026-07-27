package l;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import h.AbstractC0323a;

/* renamed from: l.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1094m extends AutoCompleteTextView {

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f9832c = {R.attr.popupBackground};

    /* renamed from: a, reason: collision with root package name */
    public final C1095n f9833a;

    /* renamed from: b, reason: collision with root package name */
    public final C1100t f9834b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC1094m(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.chicken.jump.road.pump.R.attr.autoCompleteTextViewStyle);
        i0.a(context);
        A0.j I3 = A0.j.I(getContext(), attributeSet, f9832c, com.chicken.jump.road.pump.R.attr.autoCompleteTextViewStyle);
        if (((TypedArray) I3.f67c).hasValue(0)) {
            setDropDownBackgroundDrawable(I3.A(0));
        }
        I3.L();
        C1095n c1095n = new C1095n(this);
        this.f9833a = c1095n;
        c1095n.b(attributeSet, com.chicken.jump.road.pump.R.attr.autoCompleteTextViewStyle);
        C1100t c1100t = new C1100t(this);
        this.f9834b = c1100t;
        c1100t.d(attributeSet, com.chicken.jump.road.pump.R.attr.autoCompleteTextViewStyle);
        c1100t.b();
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1095n c1095n = this.f9833a;
        if (c1095n != null) {
            c1095n.a();
        }
        C1100t c1100t = this.f9834b;
        if (c1100t != null) {
            c1100t.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        V.e eVar;
        C1095n c1095n = this.f9833a;
        if (c1095n == null || (eVar = c1095n.f9841e) == null) {
            return null;
        }
        return (ColorStateList) eVar.f1604c;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        V.e eVar;
        C1095n c1095n = this.f9833a;
        if (c1095n == null || (eVar = c1095n.f9841e) == null) {
            return null;
        }
        return (PorterDuff.Mode) eVar.f1605d;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null && editorInfo.hintText == null) {
            for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            }
        }
        return onCreateInputConnection;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1095n c1095n = this.f9833a;
        if (c1095n != null) {
            c1095n.f9839c = -1;
            c1095n.d(null);
            c1095n.a();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i3) {
        super.setBackgroundResource(i3);
        C1095n c1095n = this.f9833a;
        if (c1095n != null) {
            c1095n.c(i3);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(X0.a.O(callback, this));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i3) {
        setDropDownBackgroundDrawable(AbstractC0323a.a(getContext(), i3));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1095n c1095n = this.f9833a;
        if (c1095n != null) {
            c1095n.e(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1095n c1095n = this.f9833a;
        if (c1095n != null) {
            c1095n.f(mode);
        }
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i3) {
        super.setTextAppearance(context, i3);
        C1100t c1100t = this.f9834b;
        if (c1100t != null) {
            c1100t.e(context, i3);
        }
    }
}
