package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import e3.C1023h;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import n3.AbstractC1464a;

/* loaded from: classes.dex */
public class AppCompatTextView extends TextView {

    /* renamed from: a, reason: collision with root package name */
    public final E4.L f8306a;

    /* renamed from: b, reason: collision with root package name */
    public final F2.L0 f8307b;

    /* renamed from: c, reason: collision with root package name */
    public final C0671x f8308c;

    /* renamed from: d, reason: collision with root package name */
    public C0669w f8309d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f8310e;

    /* renamed from: f, reason: collision with root package name */
    public C1023h f8311f;

    /* renamed from: x, reason: collision with root package name */
    public Future f8312x;

    public AppCompatTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    private C0669w getEmojiTextViewHelper() {
        if (this.f8309d == null) {
            this.f8309d = new C0669w(this);
        }
        return this.f8309d;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        E4.L l7 = this.f8306a;
        if (l7 != null) {
            l7.l();
        }
        F2.L0 l02 = this.f8307b;
        if (l02 != null) {
            l02.b();
        }
    }

    public final void f() {
        Future future = this.f8312x;
        if (future == null) {
            return;
        }
        try {
            this.f8312x = null;
            if (future.get() != null) {
                throw new ClassCastException();
            }
            if (Build.VERSION.SDK_INT >= 29) {
                throw null;
            }
            AbstractC1464a.x(this);
            throw null;
        } catch (InterruptedException | ExecutionException unused) {
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (q1.f8735b) {
            return super.getAutoSizeMaxTextSize();
        }
        F2.L0 l02 = this.f8307b;
        if (l02 != null) {
            return Math.round(((Z) l02.f2599l).f8593e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (q1.f8735b) {
            return super.getAutoSizeMinTextSize();
        }
        F2.L0 l02 = this.f8307b;
        if (l02 != null) {
            return Math.round(((Z) l02.f2599l).f8592d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (q1.f8735b) {
            return super.getAutoSizeStepGranularity();
        }
        F2.L0 l02 = this.f8307b;
        if (l02 != null) {
            return Math.round(((Z) l02.f2599l).f8591c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (q1.f8735b) {
            return super.getAutoSizeTextAvailableSizes();
        }
        F2.L0 l02 = this.f8307b;
        return l02 != null ? ((Z) l02.f2599l).f8594f : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (q1.f8735b) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        F2.L0 l02 = this.f8307b;
        if (l02 != null) {
            return ((Z) l02.f2599l).f8589a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return AbstractC1464a.X(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public Q getSuperCaller() {
        if (this.f8311f == null) {
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 28) {
                this.f8311f = new S(this);
            } else if (i7 >= 26) {
                this.f8311f = new C1023h(this);
            }
        }
        return this.f8311f;
    }

    public ColorStateList getSupportBackgroundTintList() {
        E4.L l7 = this.f8306a;
        if (l7 != null) {
            return l7.n();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        E4.L l7 = this.f8306a;
        if (l7 != null) {
            return l7.o();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f8307b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f8307b.e();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        f();
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C0671x c0671x;
        if (Build.VERSION.SDK_INT >= 28 || (c0671x = this.f8308c) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) c0671x.f8756c;
        return textClassifier == null ? L.a((TextView) c0671x.f8755b) : textClassifier;
    }

    public N.c getTextMetricsParamsCompat() {
        return AbstractC1464a.x(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f8307b.getClass();
        F2.L0.h(editorInfo, onCreateInputConnection, this);
        p3.f.S(editorInfo, onCreateInputConnection, this);
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z4, int i7, int i8, int i9, int i10) {
        super.onLayout(z4, i7, i8, i9, i10);
        F2.L0 l02 = this.f8307b;
        if (l02 == null || q1.f8735b) {
            return;
        }
        ((Z) l02.f2599l).a();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i7, int i8) {
        f();
        super.onMeasure(i7, i8);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
        super.onTextChanged(charSequence, i7, i8, i9);
        F2.L0 l02 = this.f8307b;
        if (l02 == null || q1.f8735b) {
            return;
        }
        Z z4 = (Z) l02.f2599l;
        if (z4.f()) {
            z4.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z4) {
        super.setAllCaps(z4);
        getEmojiTextViewHelper().c(z4);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i7, int i8, int i9, int i10) {
        if (q1.f8735b) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i7, i8, i9, i10);
            return;
        }
        F2.L0 l02 = this.f8307b;
        if (l02 != null) {
            l02.i(i7, i8, i9, i10);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i7) {
        if (q1.f8735b) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i7);
            return;
        }
        F2.L0 l02 = this.f8307b;
        if (l02 != null) {
            l02.j(iArr, i7);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i7) {
        if (q1.f8735b) {
            super.setAutoSizeTextTypeWithDefaults(i7);
            return;
        }
        F2.L0 l02 = this.f8307b;
        if (l02 != null) {
            l02.k(i7);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        E4.L l7 = this.f8306a;
        if (l7 != null) {
            l7.r();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i7) {
        super.setBackgroundResource(i7);
        E4.L l7 = this.f8306a;
        if (l7 != null) {
            l7.s(i7);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        F2.L0 l02 = this.f8307b;
        if (l02 != null) {
            l02.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        F2.L0 l02 = this.f8307b;
        if (l02 != null) {
            l02.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        F2.L0 l02 = this.f8307b;
        if (l02 != null) {
            l02.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        F2.L0 l02 = this.f8307b;
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

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i7) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().U(i7);
        } else {
            AbstractC1464a.P(this, i7);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i7) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().J(i7);
        } else {
            AbstractC1464a.Q(this, i7);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i7) {
        if (i7 < 0) {
            throw new IllegalArgumentException();
        }
        if (i7 != getPaint().getFontMetricsInt(null)) {
            setLineSpacing(i7 - r0, 1.0f);
        }
    }

    public void setPrecomputedText(N.d dVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        AbstractC1464a.x(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        E4.L l7 = this.f8306a;
        if (l7 != null) {
            l7.v(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        E4.L l7 = this.f8306a;
        if (l7 != null) {
            l7.w(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        F2.L0 l02 = this.f8307b;
        l02.l(colorStateList);
        l02.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        F2.L0 l02 = this.f8307b;
        l02.m(mode);
        l02.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i7) {
        super.setTextAppearance(context, i7);
        F2.L0 l02 = this.f8307b;
        if (l02 != null) {
            l02.g(i7, context);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C0671x c0671x;
        if (Build.VERSION.SDK_INT >= 28 || (c0671x = this.f8308c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c0671x.f8756c = textClassifier;
        }
    }

    public void setTextFuture(Future<N.d> future) {
        this.f8312x = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(N.c cVar) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = cVar.f4630b;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i7 = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i7 = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i7 = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i7 = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i7 = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i7 = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i7 = 7;
            }
        }
        setTextDirection(i7);
        getPaint().set(cVar.f4629a);
        V.l.e(this, cVar.f4631c);
        V.l.h(this, cVar.f4632d);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i7, float f7) {
        boolean z4 = q1.f8735b;
        if (z4) {
            super.setTextSize(i7, f7);
            return;
        }
        F2.L0 l02 = this.f8307b;
        if (l02 == null || z4) {
            return;
        }
        Z z7 = (Z) l02.f2599l;
        if (z7.f()) {
            return;
        }
        z7.g(f7, i7);
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i7) {
        Typeface typeface2;
        if (this.f8310e) {
            return;
        }
        if (typeface == null || i7 <= 0) {
            typeface2 = null;
        } else {
            Context context = getContext();
            p3.f fVar = I.f.f3467a;
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null");
            }
            typeface2 = Typeface.create(typeface, i7);
        }
        this.f8310e = true;
        if (typeface2 != null) {
            typeface = typeface2;
        }
        try {
            super.setTypeface(typeface, i7);
        } finally {
            this.f8310e = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatTextView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Y0.a(context);
        this.f8310e = false;
        this.f8311f = null;
        X0.a(getContext(), this);
        E4.L l7 = new E4.L(this);
        this.f8306a = l7;
        l7.q(attributeSet, i7);
        F2.L0 l02 = new F2.L0(this);
        this.f8307b = l02;
        l02.f(attributeSet, i7);
        l02.b();
        C0671x c0671x = new C0671x();
        c0671x.f8755b = this;
        this.f8308c = c0671x;
        getEmojiTextViewHelper().b(attributeSet, i7);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i7, int i8, int i9, int i10) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i7 != 0 ? AbstractC1464a.w(context, i7) : null, i8 != 0 ? AbstractC1464a.w(context, i8) : null, i9 != 0 ? AbstractC1464a.w(context, i9) : null, i10 != 0 ? AbstractC1464a.w(context, i10) : null);
        F2.L0 l02 = this.f8307b;
        if (l02 != null) {
            l02.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i7, int i8, int i9, int i10) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i7 != 0 ? AbstractC1464a.w(context, i7) : null, i8 != 0 ? AbstractC1464a.w(context, i8) : null, i9 != 0 ? AbstractC1464a.w(context, i9) : null, i10 != 0 ? AbstractC1464a.w(context, i10) : null);
        F2.L0 l02 = this.f8307b;
        if (l02 != null) {
            l02.b();
        }
    }
}
