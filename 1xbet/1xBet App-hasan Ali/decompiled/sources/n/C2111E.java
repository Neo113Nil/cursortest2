package n;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import g1.AbstractC1970d;
import h.AbstractC1986a;
import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import k0.C2023c;
import n1.AbstractC2176q;
import r0.AbstractC2346c;
import v.AbstractC2527w;

/* renamed from: n.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2111E extends TextView implements s1.h {

    /* renamed from: k, reason: collision with root package name */
    public final C2145o f18135k;

    /* renamed from: l, reason: collision with root package name */
    public final C2155z f18136l;

    /* renamed from: m, reason: collision with root package name */
    public final v3.g f18137m;

    /* renamed from: n, reason: collision with root package name */
    public C2147q f18138n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f18139o;

    /* renamed from: p, reason: collision with root package name */
    public C2023c f18140p;

    /* renamed from: q, reason: collision with root package name */
    public Future f18141q;

    public C2111E(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    private C2147q getEmojiTextViewHelper() {
        if (this.f18138n == null) {
            this.f18138n = new C2147q(this);
        }
        return this.f18138n;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C2145o c2145o = this.f18135k;
        if (c2145o != null) {
            c2145o.a();
        }
        C2155z c2155z = this.f18136l;
        if (c2155z != null) {
            c2155z.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (I0.f18161a) {
            return super.getAutoSizeMaxTextSize();
        }
        C2155z c2155z = this.f18136l;
        if (c2155z != null) {
            return Math.round(c2155z.i.f18168e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (I0.f18161a) {
            return super.getAutoSizeMinTextSize();
        }
        C2155z c2155z = this.f18136l;
        if (c2155z != null) {
            return Math.round(c2155z.i.f18167d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (I0.f18161a) {
            return super.getAutoSizeStepGranularity();
        }
        C2155z c2155z = this.f18136l;
        if (c2155z != null) {
            return Math.round(c2155z.i.f18166c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (I0.f18161a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C2155z c2155z = this.f18136l;
        return c2155z != null ? c2155z.i.f : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (I0.f18161a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C2155z c2155z = this.f18136l;
        if (c2155z != null) {
            return c2155z.i.f18164a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return (!(customSelectionActionModeCallback instanceof s1.g) || Build.VERSION.SDK_INT < 26) ? customSelectionActionModeCallback : ((s1.g) customSelectionActionModeCallback).f19201a;
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public InterfaceC2108B getSuperCaller() {
        if (this.f18140p == null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 34) {
                this.f18140p = new C2110D(this);
            } else if (i >= 28) {
                this.f18140p = new C2109C(this);
            } else if (i >= 26) {
                this.f18140p = new C2023c(4, this);
            }
        }
        return this.f18140p;
    }

    public ColorStateList getSupportBackgroundTintList() {
        t0 t0Var;
        C2145o c2145o = this.f18135k;
        if (c2145o == null || (t0Var = (t0) c2145o.f18298e) == null) {
            return null;
        }
        return (ColorStateList) t0Var.f18326c;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        t0 t0Var;
        C2145o c2145o = this.f18135k;
        if (c2145o == null || (t0Var = (t0) c2145o.f18298e) == null) {
            return null;
        }
        return (PorterDuff.Mode) t0Var.f18327d;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        t0 t0Var = this.f18136l.f18341h;
        if (t0Var != null) {
            return (ColorStateList) t0Var.f18326c;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        t0 t0Var = this.f18136l.f18341h;
        if (t0Var != null) {
            return (PorterDuff.Mode) t0Var.f18327d;
        }
        return null;
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        p();
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        v3.g gVar;
        if (Build.VERSION.SDK_INT >= 28 || (gVar = this.f18137m) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) gVar.f20440m;
        return textClassifier == null ? AbstractC2150u.a((C2111E) gVar.f20439l) : textClassifier;
    }

    public l1.b getTextMetricsParamsCompat() {
        return N4.b.A(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f18136l.getClass();
        if (Build.VERSION.SDK_INT < 30 && onCreateInputConnection != null) {
            AbstractC2346c.B(editorInfo, getText());
        }
        if (onCreateInputConnection != null && editorInfo.hintText == null) {
            for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            }
        }
        return onCreateInputConnection;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 || i >= 33 || !onCheckIsTextEditor()) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z3, int i, int i5, int i6, int i7) {
        super.onLayout(z3, i, i5, i6, i7);
        C2155z c2155z = this.f18136l;
        if (c2155z == null || I0.f18161a) {
            return;
        }
        c2155z.i.a();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i5) {
        p();
        super.onMeasure(i, i5);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i5, int i6) {
        super.onTextChanged(charSequence, i, i5, i6);
        C2155z c2155z = this.f18136l;
        if (c2155z == null || I0.f18161a) {
            return;
        }
        C2116J c2116j = c2155z.i;
        if (c2116j.f18164a != 0) {
            c2116j.a();
        }
    }

    public final void p() {
        Future future = this.f18141q;
        if (future == null) {
            return;
        }
        try {
            this.f18141q = null;
            if (future.get() != null) {
                throw new ClassCastException();
            }
            if (Build.VERSION.SDK_INT >= 29) {
                throw null;
            }
            N4.b.A(this);
            throw null;
        } catch (InterruptedException | ExecutionException unused) {
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z3) {
        super.setAllCaps(z3);
        ((AbstractC2527w) getEmojiTextViewHelper().f18310b.f17544l).g(z3);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i5, int i6, int i7) {
        if (I0.f18161a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i5, i6, i7);
            return;
        }
        C2155z c2155z = this.f18136l;
        if (c2155z != null) {
            C2116J c2116j = c2155z.i;
            DisplayMetrics displayMetrics = c2116j.f18171j.getResources().getDisplayMetrics();
            c2116j.i(TypedValue.applyDimension(i7, i, displayMetrics), TypedValue.applyDimension(i7, i5, displayMetrics), TypedValue.applyDimension(i7, i6, displayMetrics));
            if (c2116j.g()) {
                c2116j.a();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (I0.f18161a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        C2155z c2155z = this.f18136l;
        if (c2155z != null) {
            C2116J c2116j = c2155z.i;
            c2116j.getClass();
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = c2116j.f18171j.getResources().getDisplayMetrics();
                    for (int i5 = 0; i5 < length; i5++) {
                        iArr2[i5] = Math.round(TypedValue.applyDimension(i, iArr[i5], displayMetrics));
                    }
                }
                c2116j.f = C2116J.b(iArr2);
                if (!c2116j.h()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                c2116j.f18169g = false;
            }
            if (c2116j.g()) {
                c2116j.a();
            }
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (I0.f18161a) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        C2155z c2155z = this.f18136l;
        if (c2155z != null) {
            C2116J c2116j = c2155z.i;
            if (i == 0) {
                c2116j.f18164a = 0;
                c2116j.f18167d = -1.0f;
                c2116j.f18168e = -1.0f;
                c2116j.f18166c = -1.0f;
                c2116j.f = new int[0];
                c2116j.f18165b = false;
                return;
            }
            if (i != 1) {
                c2116j.getClass();
                throw new IllegalArgumentException(AbstractC2107A.q("Unknown auto-size text type: ", i));
            }
            DisplayMetrics displayMetrics = c2116j.f18171j.getResources().getDisplayMetrics();
            c2116j.i(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (c2116j.g()) {
                c2116j.a();
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C2145o c2145o = this.f18135k;
        if (c2145o != null) {
            c2145o.f18294a = -1;
            c2145o.d(null);
            c2145o.a();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C2145o c2145o = this.f18135k;
        if (c2145o != null) {
            c2145o.c(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C2155z c2155z = this.f18136l;
        if (c2155z != null) {
            c2155z.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C2155z c2155z = this.f18136l;
        if (c2155z != null) {
            c2155z.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C2155z c2155z = this.f18136l;
        if (c2155z != null) {
            c2155z.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C2155z c2155z = this.f18136l;
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

    public void setEmojiCompatEnabled(boolean z3) {
        ((AbstractC2527w) getEmojiTextViewHelper().f18310b.f17544l).h(z3);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((AbstractC2527w) getEmojiTextViewHelper().f18310b.f17544l).d(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().h(i);
        } else {
            N4.b.Q(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().d(i);
        } else {
            N4.b.R(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        N4.b.S(this, i);
    }

    public void setPrecomputedText(l1.c cVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        N4.b.A(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C2145o c2145o = this.f18135k;
        if (c2145o != null) {
            c2145o.e(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C2145o c2145o = this.f18135k;
        if (c2145o != null) {
            c2145o.f(mode);
        }
    }

    @Override // s1.h
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C2155z c2155z = this.f18136l;
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
        C2155z c2155z = this.f18136l;
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
        C2155z c2155z = this.f18136l;
        if (c2155z != null) {
            c2155z.e(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        v3.g gVar;
        if (Build.VERSION.SDK_INT >= 28 || (gVar = this.f18137m) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            gVar.f20440m = textClassifier;
        }
    }

    public void setTextFuture(Future<l1.c> future) {
        this.f18141q = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(l1.b bVar) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = bVar.f17761b;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i = 7;
            }
        }
        setTextDirection(i);
        getPaint().set(bVar.f17760a);
        setBreakStrategy(bVar.f17762c);
        setHyphenationFrequency(bVar.f17763d);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        boolean z3 = I0.f18161a;
        if (z3) {
            super.setTextSize(i, f);
            return;
        }
        C2155z c2155z = this.f18136l;
        if (c2155z == null || z3) {
            return;
        }
        C2116J c2116j = c2155z.i;
        if (c2116j.f18164a != 0) {
            return;
        }
        c2116j.f(i, f);
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i) {
        Typeface typeface2;
        if (this.f18139o) {
            return;
        }
        if (typeface == null || i <= 0) {
            typeface2 = null;
        } else {
            Context context = getContext();
            G4.l lVar = AbstractC1970d.f17079a;
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null");
            }
            typeface2 = Typeface.create(typeface, i);
        }
        this.f18139o = true;
        if (typeface2 != null) {
            typeface = typeface2;
        }
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.f18139o = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2111E(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        s0.a(context);
        this.f18139o = false;
        this.f18140p = null;
        r0.a(getContext(), this);
        C2145o c2145o = new C2145o(this);
        this.f18135k = c2145o;
        c2145o.b(attributeSet, i);
        C2155z c2155z = new C2155z(this);
        this.f18136l = c2155z;
        c2155z.d(attributeSet, i);
        c2155z.b();
        v3.g gVar = new v3.g(18, false);
        gVar.f20439l = this;
        this.f18137m = gVar;
        C2147q emojiTextViewHelper = getEmojiTextViewHelper();
        TypedArray obtainStyledAttributes = emojiTextViewHelper.f18309a.getContext().obtainStyledAttributes(attributeSet, AbstractC1986a.f17174g, i, 0);
        try {
            boolean z3 = obtainStyledAttributes.hasValue(14) ? obtainStyledAttributes.getBoolean(14, true) : true;
            obtainStyledAttributes.recycle();
            ((AbstractC2527w) emojiTextViewHelper.f18310b.f17544l).h(z3);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Override // android.widget.TextView
    public final void setLineHeight(int i, float f) {
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 34) {
            getSuperCaller().j(i, f);
        } else if (i5 >= 34) {
            AbstractC2176q.k(this, i, f);
        } else {
            N4.b.S(this, Math.round(TypedValue.applyDimension(i, f, getResources().getDisplayMetrics())));
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i5, int i6, int i7) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? AbstractC2346c.p(context, i) : null, i5 != 0 ? AbstractC2346c.p(context, i5) : null, i6 != 0 ? AbstractC2346c.p(context, i6) : null, i7 != 0 ? AbstractC2346c.p(context, i7) : null);
        C2155z c2155z = this.f18136l;
        if (c2155z != null) {
            c2155z.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i5, int i6, int i7) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? AbstractC2346c.p(context, i) : null, i5 != 0 ? AbstractC2346c.p(context, i5) : null, i6 != 0 ? AbstractC2346c.p(context, i6) : null, i7 != 0 ? AbstractC2346c.p(context, i7) : null);
        C2155z c2155z = this.f18136l;
        if (c2155z != null) {
            c2155z.b();
        }
    }
}
