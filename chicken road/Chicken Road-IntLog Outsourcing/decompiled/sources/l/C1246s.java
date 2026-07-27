package l;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
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
import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import b2.AbstractC0279e;
import h.AbstractC0477a;
import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import u1.AbstractC1477a;
import x.AbstractC1529d;

/* renamed from: l.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1246s extends TextView implements I.b {

    /* renamed from: a, reason: collision with root package name */
    public final a5.n f10962a;

    /* renamed from: b, reason: collision with root package name */
    public final r f10963b;

    /* renamed from: c, reason: collision with root package name */
    public final B0.e f10964c;

    /* renamed from: d, reason: collision with root package name */
    public Future f10965d;

    public C1246s(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    public final void d() {
        Future future = this.f10965d;
        if (future == null) {
            return;
        }
        try {
            this.f10965d = null;
            if (future.get() != null) {
                throw new ClassCastException();
            }
            if (Build.VERSION.SDK_INT >= 29) {
                throw null;
            }
            AbstractC1477a.q(this);
            throw null;
        } catch (InterruptedException | ExecutionException unused) {
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        a5.n nVar = this.f10962a;
        if (nVar != null) {
            nVar.a();
        }
        r rVar = this.f10963b;
        if (rVar != null) {
            rVar.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (I.b.f1221O) {
            return super.getAutoSizeMaxTextSize();
        }
        r rVar = this.f10963b;
        if (rVar != null) {
            return Math.round(rVar.f10956i.f10972e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (I.b.f1221O) {
            return super.getAutoSizeMinTextSize();
        }
        r rVar = this.f10963b;
        if (rVar != null) {
            return Math.round(rVar.f10956i.f10971d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (I.b.f1221O) {
            return super.getAutoSizeStepGranularity();
        }
        r rVar = this.f10963b;
        if (rVar != null) {
            return Math.round(rVar.f10956i.f10970c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (I.b.f1221O) {
            return super.getAutoSizeTextAvailableSizes();
        }
        r rVar = this.f10963b;
        return rVar != null ? rVar.f10956i.f10973f : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (I.b.f1221O) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        r rVar = this.f10963b;
        if (rVar != null) {
            return rVar.f10956i.f10968a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public ColorStateList getSupportBackgroundTintList() {
        T4.h hVar;
        a5.n nVar = this.f10962a;
        if (nVar == null || (hVar = (T4.h) nVar.f3976e) == null) {
            return null;
        }
        return (ColorStateList) hVar.f2878c;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        T4.h hVar;
        a5.n nVar = this.f10962a;
        if (nVar == null || (hVar = (T4.h) nVar.f3976e) == null) {
            return null;
        }
        return (PorterDuff.Mode) hVar.f2879d;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        T4.h hVar = this.f10963b.f10955h;
        if (hVar != null) {
            return (ColorStateList) hVar.f2878c;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        T4.h hVar = this.f10963b.f10955h;
        if (hVar != null) {
            return (PorterDuff.Mode) hVar.f2879d;
        }
        return null;
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        d();
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        B0.e eVar;
        if (Build.VERSION.SDK_INT >= 28 || (eVar = this.f10964c) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) eVar.f147c;
        if (textClassifier != null) {
            return textClassifier;
        }
        TextClassificationManager textClassificationManager = (TextClassificationManager) ((C1246s) eVar.f146b).getContext().getSystemService(TextClassificationManager.class);
        return textClassificationManager != null ? textClassificationManager.getTextClassifier() : TextClassifier.NO_OP;
    }

    public C.b getTextMetricsParamsCompat() {
        return AbstractC1477a.q(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null && editorInfo.hintText == null) {
            for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            }
        }
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i2, int i3, int i6, int i7) {
        super.onLayout(z, i2, i3, i6, i7);
        r rVar = this.f10963b;
        if (rVar == null || I.b.f1221O) {
            return;
        }
        rVar.f10956i.a();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i2, int i3) {
        d();
        super.onMeasure(i2, i3);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i6) {
        super.onTextChanged(charSequence, i2, i3, i6);
        r rVar = this.f10963b;
        if (rVar == null || I.b.f1221O) {
            return;
        }
        C1247t c1247t = rVar.f10956i;
        if (c1247t.f10968a != 0) {
            c1247t.a();
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i2, int i3, int i6, int i7) {
        if (I.b.f1221O) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i2, i3, i6, i7);
            return;
        }
        r rVar = this.f10963b;
        if (rVar != null) {
            C1247t c1247t = rVar.f10956i;
            DisplayMetrics displayMetrics = c1247t.f10977j.getResources().getDisplayMetrics();
            c1247t.i(TypedValue.applyDimension(i7, i2, displayMetrics), TypedValue.applyDimension(i7, i3, displayMetrics), TypedValue.applyDimension(i7, i6, displayMetrics));
            if (c1247t.g()) {
                c1247t.a();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i2) {
        if (I.b.f1221O) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i2);
            return;
        }
        r rVar = this.f10963b;
        if (rVar != null) {
            C1247t c1247t = rVar.f10956i;
            c1247t.getClass();
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i2 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = c1247t.f10977j.getResources().getDisplayMetrics();
                    for (int i3 = 0; i3 < length; i3++) {
                        iArr2[i3] = Math.round(TypedValue.applyDimension(i2, iArr[i3], displayMetrics));
                    }
                }
                c1247t.f10973f = C1247t.b(iArr2);
                if (!c1247t.h()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                c1247t.f10974g = false;
            }
            if (c1247t.g()) {
                c1247t.a();
            }
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i2) {
        if (I.b.f1221O) {
            super.setAutoSizeTextTypeWithDefaults(i2);
            return;
        }
        r rVar = this.f10963b;
        if (rVar != null) {
            C1247t c1247t = rVar.f10956i;
            if (i2 == 0) {
                c1247t.f10968a = 0;
                c1247t.f10971d = -1.0f;
                c1247t.f10972e = -1.0f;
                c1247t.f10970c = -1.0f;
                c1247t.f10973f = new int[0];
                c1247t.f10969b = false;
                return;
            }
            if (i2 != 1) {
                c1247t.getClass();
                throw new IllegalArgumentException(AbstractC0279e.d(i2, "Unknown auto-size text type: "));
            }
            DisplayMetrics displayMetrics = c1247t.f10977j.getResources().getDisplayMetrics();
            c1247t.i(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (c1247t.g()) {
                c1247t.a();
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        a5.n nVar = this.f10962a;
        if (nVar != null) {
            nVar.f3972a = -1;
            nVar.d(null);
            nVar.a();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        a5.n nVar = this.f10962a;
        if (nVar != null) {
            nVar.c(i2);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        r rVar = this.f10963b;
        if (rVar != null) {
            rVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        r rVar = this.f10963b;
        if (rVar != null) {
            rVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        r rVar = this.f10963b;
        if (rVar != null) {
            rVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        r rVar = this.f10963b;
        if (rVar != null) {
            rVar.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC1477a.C(callback, this));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i2) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i2);
        } else {
            AbstractC1477a.x(this, i2);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i2) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i2);
        } else {
            AbstractC1477a.y(this, i2);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException();
        }
        if (i2 != getPaint().getFontMetricsInt(null)) {
            setLineSpacing(i2 - r0, 1.0f);
        }
    }

    public void setPrecomputedText(C.c cVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        AbstractC1477a.q(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        a5.n nVar = this.f10962a;
        if (nVar != null) {
            nVar.e(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        a5.n nVar = this.f10962a;
        if (nVar != null) {
            nVar.f(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        r rVar = this.f10963b;
        if (rVar.f10955h == null) {
            rVar.f10955h = new T4.h();
        }
        T4.h hVar = rVar.f10955h;
        hVar.f2878c = colorStateList;
        hVar.f2877b = colorStateList != null;
        rVar.f10949b = hVar;
        rVar.f10950c = hVar;
        rVar.f10951d = hVar;
        rVar.f10952e = hVar;
        rVar.f10953f = hVar;
        rVar.f10954g = hVar;
        rVar.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        r rVar = this.f10963b;
        if (rVar.f10955h == null) {
            rVar.f10955h = new T4.h();
        }
        T4.h hVar = rVar.f10955h;
        hVar.f2879d = mode;
        hVar.f2876a = mode != null;
        rVar.f10949b = hVar;
        rVar.f10950c = hVar;
        rVar.f10951d = hVar;
        rVar.f10952e = hVar;
        rVar.f10953f = hVar;
        rVar.f10954g = hVar;
        rVar.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        r rVar = this.f10963b;
        if (rVar != null) {
            rVar.e(context, i2);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        B0.e eVar;
        if (Build.VERSION.SDK_INT >= 28 || (eVar = this.f10964c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            eVar.f147c = textClassifier;
        }
    }

    public void setTextFuture(Future<C.c> future) {
        this.f10965d = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(C.b bVar) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = bVar.f319b;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i2 = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i2 = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i2 = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i2 = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i2 = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i2 = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i2 = 7;
            }
        }
        setTextDirection(i2);
        getPaint().set(bVar.f318a);
        I.l.e(this, bVar.f320c);
        I.l.h(this, bVar.f321d);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i2, float f3) {
        boolean z = I.b.f1221O;
        if (z) {
            super.setTextSize(i2, f3);
            return;
        }
        r rVar = this.f10963b;
        if (rVar == null || z) {
            return;
        }
        C1247t c1247t = rVar.f10956i;
        if (c1247t.f10968a != 0) {
            return;
        }
        c1247t.f(i2, f3);
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i2) {
        Typeface typeface2;
        if (typeface == null || i2 <= 0) {
            typeface2 = null;
        } else {
            Context context = getContext();
            AbstractC1477a abstractC1477a = AbstractC1529d.f12236a;
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null");
            }
            typeface2 = Typeface.create(typeface, i2);
        }
        if (typeface2 != null) {
            typeface = typeface2;
        }
        super.setTypeface(typeface, i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1246s(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        g0.a(context);
        a5.n nVar = new a5.n(this);
        this.f10962a = nVar;
        nVar.b(attributeSet, i2);
        r rVar = new r(this);
        this.f10963b = rVar;
        rVar.d(attributeSet, i2);
        rVar.b();
        B0.e eVar = new B0.e(10);
        eVar.f146b = this;
        this.f10964c = eVar;
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i2, int i3, int i6, int i7) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i2 != 0 ? AbstractC0477a.a(context, i2) : null, i3 != 0 ? AbstractC0477a.a(context, i3) : null, i6 != 0 ? AbstractC0477a.a(context, i6) : null, i7 != 0 ? AbstractC0477a.a(context, i7) : null);
        r rVar = this.f10963b;
        if (rVar != null) {
            rVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i2, int i3, int i6, int i7) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i2 != 0 ? AbstractC0477a.a(context, i2) : null, i3 != 0 ? AbstractC0477a.a(context, i3) : null, i6 != 0 ? AbstractC0477a.a(context, i6) : null, i7 != 0 ? AbstractC0477a.a(context, i7) : null);
        r rVar = this.f10963b;
        if (rVar != null) {
            rVar.b();
        }
    }
}
