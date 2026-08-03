package h;

/* renamed from: h.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0155m extends android.widget.AutoCompleteTextView {

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f3195c = {android.R.attr.popupBackground};

    /* renamed from: a, reason: collision with root package name */
    public final h.C0156n f3196a;

    /* renamed from: b, reason: collision with root package name */
    public final h.C0160s f3197b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC0155m(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, com.watchfacestudio.huasi_urx110.R.attr.autoCompleteTextViewStyle);
        h.g0.a(context);
        I0.b H2 = I0.b.H(getContext(), attributeSet, f3195c, com.watchfacestudio.huasi_urx110.R.attr.autoCompleteTextViewStyle);
        if (((android.content.res.TypedArray) H2.f658c).hasValue(0)) {
            setDropDownBackgroundDrawable(H2.A(0));
        }
        H2.K();
        h.C0156n c0156n = new h.C0156n(this);
        this.f3196a = c0156n;
        c0156n.b(attributeSet, com.watchfacestudio.huasi_urx110.R.attr.autoCompleteTextViewStyle);
        h.C0160s c0160s = new h.C0160s(this);
        this.f3197b = c0160s;
        c0160s.d(attributeSet, com.watchfacestudio.huasi_urx110.R.attr.autoCompleteTextViewStyle);
        c0160s.b();
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        h.C0156n c0156n = this.f3196a;
        if (c0156n != null) {
            c0156n.a();
        }
        h.C0160s c0160s = this.f3197b;
        if (c0160s != null) {
            c0160s.b();
        }
    }

    public android.content.res.ColorStateList getSupportBackgroundTintList() {
        I1.h hVar;
        h.C0156n c0156n = this.f3196a;
        if (c0156n == null || (hVar = c0156n.f3204e) == null) {
            return null;
        }
        return (android.content.res.ColorStateList) hVar.f725c;
    }

    public android.graphics.PorterDuff.Mode getSupportBackgroundTintMode() {
        I1.h hVar;
        h.C0156n c0156n = this.f3196a;
        if (c0156n == null || (hVar = c0156n.f3204e) == null) {
            return null;
        }
        return (android.graphics.PorterDuff.Mode) hVar.f726d;
    }

    @Override // android.widget.TextView, android.view.View
    public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo editorInfo) {
        android.view.inputmethod.InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null && editorInfo.hintText == null) {
            for (android.view.ViewParent parent = getParent(); parent instanceof android.view.View; parent = parent.getParent()) {
            }
        }
        return onCreateInputConnection;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(android.graphics.drawable.Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        h.C0156n c0156n = this.f3196a;
        if (c0156n != null) {
            c0156n.f3202c = -1;
            c0156n.d(null);
            c0156n.a();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        h.C0156n c0156n = this.f3196a;
        if (c0156n != null) {
            c0156n.c(i2);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(android.view.ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(Q1.l.C(callback, this));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i2) {
        setDropDownBackgroundDrawable(d.AbstractC0106a.a(getContext(), i2));
    }

    public void setSupportBackgroundTintList(android.content.res.ColorStateList colorStateList) {
        h.C0156n c0156n = this.f3196a;
        if (c0156n != null) {
            c0156n.e(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode mode) {
        h.C0156n c0156n = this.f3196a;
        if (c0156n != null) {
            c0156n.f(mode);
        }
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(android.content.Context context, int i2) {
        super.setTextAppearance(context, i2);
        h.C0160s c0160s = this.f3197b;
        if (c0160s != null) {
            c0160s.e(context, i2);
        }
    }
}
