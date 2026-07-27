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
import h.AbstractC0323a;
import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: l.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1101u extends TextView implements H.b {

    /* renamed from: a, reason: collision with root package name */
    public final C1095n f9897a;

    /* renamed from: b, reason: collision with root package name */
    public final C1100t f9898b;

    /* renamed from: c, reason: collision with root package name */
    public final V1.b f9899c;

    /* renamed from: d, reason: collision with root package name */
    public Future f9900d;

    public C1101u(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    public final void d() {
        Future future = this.f9900d;
        if (future == null) {
            return;
        }
        try {
            this.f9900d = null;
            if (future.get() != null) {
                throw new ClassCastException();
            }
            if (Build.VERSION.SDK_INT >= 29) {
                throw null;
            }
            X0.a.v(this);
            throw null;
        } catch (InterruptedException | ExecutionException unused) {
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1095n c1095n = this.f9897a;
        if (c1095n != null) {
            c1095n.a();
        }
        C1100t c1100t = this.f9898b;
        if (c1100t != null) {
            c1100t.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (H.b.f460t0) {
            return super.getAutoSizeMaxTextSize();
        }
        C1100t c1100t = this.f9898b;
        if (c1100t != null) {
            return Math.round(c1100t.f9891i.f9907e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (H.b.f460t0) {
            return super.getAutoSizeMinTextSize();
        }
        C1100t c1100t = this.f9898b;
        if (c1100t != null) {
            return Math.round(c1100t.f9891i.f9906d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (H.b.f460t0) {
            return super.getAutoSizeStepGranularity();
        }
        C1100t c1100t = this.f9898b;
        if (c1100t != null) {
            return Math.round(c1100t.f9891i.f9905c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (H.b.f460t0) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C1100t c1100t = this.f9898b;
        return c1100t != null ? c1100t.f9891i.f : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (H.b.f460t0) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C1100t c1100t = this.f9898b;
        if (c1100t != null) {
            return c1100t.f9891i.f9903a;
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
        V.e eVar;
        C1095n c1095n = this.f9897a;
        if (c1095n == null || (eVar = c1095n.f9841e) == null) {
            return null;
        }
        return (ColorStateList) eVar.f1604c;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        V.e eVar;
        C1095n c1095n = this.f9897a;
        if (c1095n == null || (eVar = c1095n.f9841e) == null) {
            return null;
        }
        return (PorterDuff.Mode) eVar.f1605d;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        V.e eVar = this.f9898b.f9890h;
        if (eVar != null) {
            return (ColorStateList) eVar.f1604c;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        V.e eVar = this.f9898b.f9890h;
        if (eVar != null) {
            return (PorterDuff.Mode) eVar.f1605d;
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
        V1.b bVar;
        if (Build.VERSION.SDK_INT >= 28 || (bVar = this.f9899c) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) bVar.f1615c;
        if (textClassifier != null) {
            return textClassifier;
        }
        TextClassificationManager textClassificationManager = (TextClassificationManager) ((C1101u) bVar.f1614b).getContext().getSystemService(TextClassificationManager.class);
        return textClassificationManager != null ? textClassificationManager.getTextClassifier() : TextClassifier.NO_OP;
    }

    public B.b getTextMetricsParamsCompat() {
        return X0.a.v(this);
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
    public final void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
        super.onLayout(z3, i3, i4, i5, i6);
        C1100t c1100t = this.f9898b;
        if (c1100t == null || H.b.f460t0) {
            return;
        }
        c1100t.f9891i.a();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i3, int i4) {
        d();
        super.onMeasure(i3, i4);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
        super.onTextChanged(charSequence, i3, i4, i5);
        C1100t c1100t = this.f9898b;
        if (c1100t == null || H.b.f460t0) {
            return;
        }
        C1102v c1102v = c1100t.f9891i;
        if (c1102v.f9903a != 0) {
            c1102v.a();
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i3, int i4, int i5, int i6) {
        if (H.b.f460t0) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i3, i4, i5, i6);
            return;
        }
        C1100t c1100t = this.f9898b;
        if (c1100t != null) {
            C1102v c1102v = c1100t.f9891i;
            DisplayMetrics displayMetrics = c1102v.f9911j.getResources().getDisplayMetrics();
            c1102v.i(TypedValue.applyDimension(i6, i3, displayMetrics), TypedValue.applyDimension(i6, i4, displayMetrics), TypedValue.applyDimension(i6, i5, displayMetrics));
            if (c1102v.g()) {
                c1102v.a();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i3) {
        if (H.b.f460t0) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i3);
            return;
        }
        C1100t c1100t = this.f9898b;
        if (c1100t != null) {
            C1102v c1102v = c1100t.f9891i;
            c1102v.getClass();
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i3 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = c1102v.f9911j.getResources().getDisplayMetrics();
                    for (int i4 = 0; i4 < length; i4++) {
                        iArr2[i4] = Math.round(TypedValue.applyDimension(i3, iArr[i4], displayMetrics));
                    }
                }
                c1102v.f = C1102v.b(iArr2);
                if (!c1102v.h()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                c1102v.f9908g = false;
            }
            if (c1102v.g()) {
                c1102v.a();
            }
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i3) {
        if (H.b.f460t0) {
            super.setAutoSizeTextTypeWithDefaults(i3);
            return;
        }
        C1100t c1100t = this.f9898b;
        if (c1100t != null) {
            C1102v c1102v = c1100t.f9891i;
            if (i3 == 0) {
                c1102v.f9903a = 0;
                c1102v.f9906d = -1.0f;
                c1102v.f9907e = -1.0f;
                c1102v.f9905c = -1.0f;
                c1102v.f = new int[0];
                c1102v.f9904b = false;
                return;
            }
            if (i3 != 1) {
                c1102v.getClass();
                throw new IllegalArgumentException(B0.c.h(i3, "Unknown auto-size text type: "));
            }
            DisplayMetrics displayMetrics = c1102v.f9911j.getResources().getDisplayMetrics();
            c1102v.i(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (c1102v.g()) {
                c1102v.a();
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1095n c1095n = this.f9897a;
        if (c1095n != null) {
            c1095n.f9839c = -1;
            c1095n.d(null);
            c1095n.a();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i3) {
        super.setBackgroundResource(i3);
        C1095n c1095n = this.f9897a;
        if (c1095n != null) {
            c1095n.c(i3);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C1100t c1100t = this.f9898b;
        if (c1100t != null) {
            c1100t.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C1100t c1100t = this.f9898b;
        if (c1100t != null) {
            c1100t.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C1100t c1100t = this.f9898b;
        if (c1100t != null) {
            c1100t.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C1100t c1100t = this.f9898b;
        if (c1100t != null) {
            c1100t.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(X0.a.O(callback, this));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i3) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i3);
        } else {
            X0.a.H(this, i3);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i3) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i3);
        } else {
            X0.a.I(this, i3);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i3) {
        if (i3 < 0) {
            throw new IllegalArgumentException();
        }
        if (i3 != getPaint().getFontMetricsInt(null)) {
            setLineSpacing(i3 - r0, 1.0f);
        }
    }

    public void setPrecomputedText(B.c cVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        X0.a.v(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1095n c1095n = this.f9897a;
        if (c1095n != null) {
            c1095n.e(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1095n c1095n = this.f9897a;
        if (c1095n != null) {
            c1095n.f(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C1100t c1100t = this.f9898b;
        if (c1100t.f9890h == null) {
            c1100t.f9890h = new V.e();
        }
        V.e eVar = c1100t.f9890h;
        eVar.f1604c = colorStateList;
        eVar.f1603b = colorStateList != null;
        c1100t.f9885b = eVar;
        c1100t.f9886c = eVar;
        c1100t.f9887d = eVar;
        c1100t.f9888e = eVar;
        c1100t.f = eVar;
        c1100t.f9889g = eVar;
        c1100t.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C1100t c1100t = this.f9898b;
        if (c1100t.f9890h == null) {
            c1100t.f9890h = new V.e();
        }
        V.e eVar = c1100t.f9890h;
        eVar.f1605d = mode;
        eVar.f1602a = mode != null;
        c1100t.f9885b = eVar;
        c1100t.f9886c = eVar;
        c1100t.f9887d = eVar;
        c1100t.f9888e = eVar;
        c1100t.f = eVar;
        c1100t.f9889g = eVar;
        c1100t.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i3) {
        super.setTextAppearance(context, i3);
        C1100t c1100t = this.f9898b;
        if (c1100t != null) {
            c1100t.e(context, i3);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        V1.b bVar;
        if (Build.VERSION.SDK_INT >= 28 || (bVar = this.f9899c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            bVar.f1615c = textClassifier;
        }
    }

    public void setTextFuture(Future<B.c> future) {
        this.f9900d = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(B.b bVar) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = bVar.f127b;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i3 = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i3 = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i3 = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i3 = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i3 = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i3 = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i3 = 7;
            }
        }
        setTextDirection(i3);
        getPaint().set(bVar.f126a);
        H.m.e(this, bVar.f128c);
        H.m.h(this, bVar.f129d);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i3, float f) {
        boolean z3 = H.b.f460t0;
        if (z3) {
            super.setTextSize(i3, f);
            return;
        }
        C1100t c1100t = this.f9898b;
        if (c1100t == null || z3) {
            return;
        }
        C1102v c1102v = c1100t.f9891i;
        if (c1102v.f9903a != 0) {
            return;
        }
        c1102v.f(i3, f);
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i3) {
        Typeface typeface2;
        if (typeface == null || i3 <= 0) {
            typeface2 = null;
        } else {
            Context context = getContext();
            F2.b bVar = w.d.f10438a;
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null");
            }
            typeface2 = Typeface.create(typeface, i3);
        }
        if (typeface2 != null) {
            typeface = typeface2;
        }
        super.setTypeface(typeface, i3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1101u(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        i0.a(context);
        C1095n c1095n = new C1095n(this);
        this.f9897a = c1095n;
        c1095n.b(attributeSet, i3);
        C1100t c1100t = new C1100t(this);
        this.f9898b = c1100t;
        c1100t.d(attributeSet, i3);
        c1100t.b();
        V1.b bVar = new V1.b(7, false);
        bVar.f1614b = this;
        this.f9899c = bVar;
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i3, int i4, int i5, int i6) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i3 != 0 ? AbstractC0323a.a(context, i3) : null, i4 != 0 ? AbstractC0323a.a(context, i4) : null, i5 != 0 ? AbstractC0323a.a(context, i5) : null, i6 != 0 ? AbstractC0323a.a(context, i6) : null);
        C1100t c1100t = this.f9898b;
        if (c1100t != null) {
            c1100t.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i3, int i4, int i5, int i6) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i3 != 0 ? AbstractC0323a.a(context, i3) : null, i4 != 0 ? AbstractC0323a.a(context, i4) : null, i5 != 0 ? AbstractC0323a.a(context, i5) : null, i6 != 0 ? AbstractC0323a.a(context, i6) : null);
        C1100t c1100t = this.f9898b;
        if (c1100t != null) {
            c1100t.b();
        }
    }
}
