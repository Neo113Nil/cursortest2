package h;

/* renamed from: h.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0161t extends android.widget.TextView implements C.c {

    /* renamed from: a, reason: collision with root package name */
    public final h.C0156n f3260a;

    /* renamed from: b, reason: collision with root package name */
    public final h.C0160s f3261b;

    /* renamed from: c, reason: collision with root package name */
    public final x0.e f3262c;

    /* renamed from: d, reason: collision with root package name */
    public java.util.concurrent.Future f3263d;

    public C0161t(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, android.R.attr.textViewStyle);
    }

    public final void d() {
        java.util.concurrent.Future future = this.f3263d;
        if (future == null) {
            return;
        }
        try {
            this.f3263d = null;
            if (future.get() != null) {
                throw new java.lang.ClassCastException();
            }
            if (android.os.Build.VERSION.SDK_INT >= 29) {
                throw null;
            }
            Q1.l.n(this);
            throw null;
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException unused) {
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        h.C0156n c0156n = this.f3260a;
        if (c0156n != null) {
            c0156n.a();
        }
        h.C0160s c0160s = this.f3261b;
        if (c0160s != null) {
            c0160s.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (C.c.f68N) {
            return super.getAutoSizeMaxTextSize();
        }
        h.C0160s c0160s = this.f3261b;
        if (c0160s != null) {
            return java.lang.Math.round(c0160s.f3255i.f3271e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (C.c.f68N) {
            return super.getAutoSizeMinTextSize();
        }
        h.C0160s c0160s = this.f3261b;
        if (c0160s != null) {
            return java.lang.Math.round(c0160s.f3255i.f3270d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (C.c.f68N) {
            return super.getAutoSizeStepGranularity();
        }
        h.C0160s c0160s = this.f3261b;
        if (c0160s != null) {
            return java.lang.Math.round(c0160s.f3255i.f3269c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (C.c.f68N) {
            return super.getAutoSizeTextAvailableSizes();
        }
        h.C0160s c0160s = this.f3261b;
        return c0160s != null ? c0160s.f3255i.f3272f : new int[0];
    }

    @Override // android.widget.TextView
    @android.annotation.SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (C.c.f68N) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        h.C0160s c0160s = this.f3261b;
        if (c0160s != null) {
            return c0160s.f3255i.f3267a;
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

    public android.content.res.ColorStateList getSupportBackgroundTintList() {
        I1.h hVar;
        h.C0156n c0156n = this.f3260a;
        if (c0156n == null || (hVar = c0156n.f3204e) == null) {
            return null;
        }
        return (android.content.res.ColorStateList) hVar.f725c;
    }

    public android.graphics.PorterDuff.Mode getSupportBackgroundTintMode() {
        I1.h hVar;
        h.C0156n c0156n = this.f3260a;
        if (c0156n == null || (hVar = c0156n.f3204e) == null) {
            return null;
        }
        return (android.graphics.PorterDuff.Mode) hVar.f726d;
    }

    public android.content.res.ColorStateList getSupportCompoundDrawablesTintList() {
        I1.h hVar = this.f3261b.f3254h;
        if (hVar != null) {
            return (android.content.res.ColorStateList) hVar.f725c;
        }
        return null;
    }

    public android.graphics.PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        I1.h hVar = this.f3261b.f3254h;
        if (hVar != null) {
            return (android.graphics.PorterDuff.Mode) hVar.f726d;
        }
        return null;
    }

    @Override // android.widget.TextView
    public java.lang.CharSequence getText() {
        d();
        return super.getText();
    }

    @Override // android.widget.TextView
    public android.view.textclassifier.TextClassifier getTextClassifier() {
        x0.e eVar;
        if (android.os.Build.VERSION.SDK_INT >= 28 || (eVar = this.f3262c) == null) {
            return super.getTextClassifier();
        }
        android.view.textclassifier.TextClassifier textClassifier = (android.view.textclassifier.TextClassifier) eVar.f8410c;
        if (textClassifier != null) {
            return textClassifier;
        }
        android.view.textclassifier.TextClassificationManager textClassificationManager = (android.view.textclassifier.TextClassificationManager) ((h.C0161t) eVar.f8409b).getContext().getSystemService(android.view.textclassifier.TextClassificationManager.class);
        return textClassificationManager != null ? textClassificationManager.getTextClassifier() : android.view.textclassifier.TextClassifier.NO_OP;
    }

    public w.C1004b getTextMetricsParamsCompat() {
        return Q1.l.n(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo editorInfo) {
        android.view.inputmethod.InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null && editorInfo.hintText == null) {
            for (android.view.ViewParent parent = getParent(); parent instanceof android.view.View; parent = parent.getParent()) {
            }
        }
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        h.C0160s c0160s = this.f3261b;
        if (c0160s == null || C.c.f68N) {
            return;
        }
        c0160s.f3255i.a();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i2, int i3) {
        d();
        super.onMeasure(i2, i3);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(java.lang.CharSequence charSequence, int i2, int i3, int i4) {
        super.onTextChanged(charSequence, i2, i3, i4);
        h.C0160s c0160s = this.f3261b;
        if (c0160s == null || C.c.f68N) {
            return;
        }
        h.C0162u c0162u = c0160s.f3255i;
        if (c0162u.f3267a != 0) {
            c0162u.a();
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i2, int i3, int i4, int i5) {
        if (C.c.f68N) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i2, i3, i4, i5);
            return;
        }
        h.C0160s c0160s = this.f3261b;
        if (c0160s != null) {
            h.C0162u c0162u = c0160s.f3255i;
            android.util.DisplayMetrics displayMetrics = c0162u.f3276j.getResources().getDisplayMetrics();
            c0162u.i(android.util.TypedValue.applyDimension(i5, i2, displayMetrics), android.util.TypedValue.applyDimension(i5, i3, displayMetrics), android.util.TypedValue.applyDimension(i5, i4, displayMetrics));
            if (c0162u.g()) {
                c0162u.a();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i2) {
        if (C.c.f68N) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i2);
            return;
        }
        h.C0160s c0160s = this.f3261b;
        if (c0160s != null) {
            h.C0162u c0162u = c0160s.f3255i;
            c0162u.getClass();
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i2 == 0) {
                    iArr2 = java.util.Arrays.copyOf(iArr, length);
                } else {
                    android.util.DisplayMetrics displayMetrics = c0162u.f3276j.getResources().getDisplayMetrics();
                    for (int i3 = 0; i3 < length; i3++) {
                        iArr2[i3] = java.lang.Math.round(android.util.TypedValue.applyDimension(i2, iArr[i3], displayMetrics));
                    }
                }
                c0162u.f3272f = h.C0162u.b(iArr2);
                if (!c0162u.h()) {
                    throw new java.lang.IllegalArgumentException("None of the preset sizes is valid: " + java.util.Arrays.toString(iArr));
                }
            } else {
                c0162u.f3273g = false;
            }
            if (c0162u.g()) {
                c0162u.a();
            }
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i2) {
        if (C.c.f68N) {
            super.setAutoSizeTextTypeWithDefaults(i2);
            return;
        }
        h.C0160s c0160s = this.f3261b;
        if (c0160s != null) {
            h.C0162u c0162u = c0160s.f3255i;
            if (i2 == 0) {
                c0162u.f3267a = 0;
                c0162u.f3270d = -1.0f;
                c0162u.f3271e = -1.0f;
                c0162u.f3269c = -1.0f;
                c0162u.f3272f = new int[0];
                c0162u.f3268b = false;
                return;
            }
            if (i2 != 1) {
                c0162u.getClass();
                throw new java.lang.IllegalArgumentException(B1.a.f(i2, "Unknown auto-size text type: "));
            }
            android.util.DisplayMetrics displayMetrics = c0162u.f3276j.getResources().getDisplayMetrics();
            c0162u.i(android.util.TypedValue.applyDimension(2, 12.0f, displayMetrics), android.util.TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (c0162u.g()) {
                c0162u.a();
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(android.graphics.drawable.Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        h.C0156n c0156n = this.f3260a;
        if (c0156n != null) {
            c0156n.f3202c = -1;
            c0156n.d(null);
            c0156n.a();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        h.C0156n c0156n = this.f3260a;
        if (c0156n != null) {
            c0156n.c(i2);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, android.graphics.drawable.Drawable drawable3, android.graphics.drawable.Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        h.C0160s c0160s = this.f3261b;
        if (c0160s != null) {
            c0160s.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, android.graphics.drawable.Drawable drawable3, android.graphics.drawable.Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        h.C0160s c0160s = this.f3261b;
        if (c0160s != null) {
            c0160s.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, android.graphics.drawable.Drawable drawable3, android.graphics.drawable.Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        h.C0160s c0160s = this.f3261b;
        if (c0160s != null) {
            c0160s.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, android.graphics.drawable.Drawable drawable3, android.graphics.drawable.Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        h.C0160s c0160s = this.f3261b;
        if (c0160s != null) {
            c0160s.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(android.view.ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(Q1.l.C(callback, this));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i2) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i2);
        } else {
            Q1.l.w(this, i2);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i2) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i2);
        } else {
            Q1.l.x(this, i2);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i2) {
        if (i2 < 0) {
            throw new java.lang.IllegalArgumentException();
        }
        if (i2 != getPaint().getFontMetricsInt(null)) {
            setLineSpacing(i2 - r0, 1.0f);
        }
    }

    public void setPrecomputedText(w.AbstractC1005c abstractC1005c) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        Q1.l.n(this);
        throw null;
    }

    public void setSupportBackgroundTintList(android.content.res.ColorStateList colorStateList) {
        h.C0156n c0156n = this.f3260a;
        if (c0156n != null) {
            c0156n.e(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode mode) {
        h.C0156n c0156n = this.f3260a;
        if (c0156n != null) {
            c0156n.f(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(android.content.res.ColorStateList colorStateList) {
        h.C0160s c0160s = this.f3261b;
        if (c0160s.f3254h == null) {
            c0160s.f3254h = new I1.h();
        }
        I1.h hVar = c0160s.f3254h;
        hVar.f725c = colorStateList;
        hVar.f724b = colorStateList != null;
        c0160s.f3248b = hVar;
        c0160s.f3249c = hVar;
        c0160s.f3250d = hVar;
        c0160s.f3251e = hVar;
        c0160s.f3252f = hVar;
        c0160s.f3253g = hVar;
        c0160s.b();
    }

    public void setSupportCompoundDrawablesTintMode(android.graphics.PorterDuff.Mode mode) {
        h.C0160s c0160s = this.f3261b;
        if (c0160s.f3254h == null) {
            c0160s.f3254h = new I1.h();
        }
        I1.h hVar = c0160s.f3254h;
        hVar.f726d = mode;
        hVar.f723a = mode != null;
        c0160s.f3248b = hVar;
        c0160s.f3249c = hVar;
        c0160s.f3250d = hVar;
        c0160s.f3251e = hVar;
        c0160s.f3252f = hVar;
        c0160s.f3253g = hVar;
        c0160s.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(android.content.Context context, int i2) {
        super.setTextAppearance(context, i2);
        h.C0160s c0160s = this.f3261b;
        if (c0160s != null) {
            c0160s.e(context, i2);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(android.view.textclassifier.TextClassifier textClassifier) {
        x0.e eVar;
        if (android.os.Build.VERSION.SDK_INT >= 28 || (eVar = this.f3262c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            eVar.f8410c = textClassifier;
        }
    }

    public void setTextFuture(java.util.concurrent.Future<w.AbstractC1005c> future) {
        this.f3263d = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(w.C1004b c1004b) {
        android.text.TextDirectionHeuristic textDirectionHeuristic;
        android.text.TextDirectionHeuristic textDirectionHeuristic2 = c1004b.f8396b;
        android.text.TextDirectionHeuristic textDirectionHeuristic3 = android.text.TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i2 = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == android.text.TextDirectionHeuristics.ANYRTL_LTR) {
                i2 = 2;
            } else if (textDirectionHeuristic2 == android.text.TextDirectionHeuristics.LTR) {
                i2 = 3;
            } else if (textDirectionHeuristic2 == android.text.TextDirectionHeuristics.RTL) {
                i2 = 4;
            } else if (textDirectionHeuristic2 == android.text.TextDirectionHeuristics.LOCALE) {
                i2 = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i2 = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i2 = 7;
            }
        }
        setTextDirection(i2);
        getPaint().set(c1004b.f8395a);
        C.o.e(this, c1004b.f8397c);
        C.o.h(this, c1004b.f8398d);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i2, float f2) {
        boolean z2 = C.c.f68N;
        if (z2) {
            super.setTextSize(i2, f2);
            return;
        }
        h.C0160s c0160s = this.f3261b;
        if (c0160s == null || z2) {
            return;
        }
        h.C0162u c0162u = c0160s.f3255i;
        if (c0162u.f3267a != 0) {
            return;
        }
        c0162u.f(i2, f2);
    }

    @Override // android.widget.TextView
    public final void setTypeface(android.graphics.Typeface typeface, int i2) {
        android.graphics.Typeface typeface2;
        if (typeface == null || i2 <= 0) {
            typeface2 = null;
        } else {
            android.content.Context context = getContext();
            a.AbstractC0059a abstractC0059a = r.d.f8330a;
            if (context == null) {
                throw new java.lang.IllegalArgumentException("Context cannot be null");
            }
            typeface2 = android.graphics.Typeface.create(typeface, i2);
        }
        if (typeface2 != null) {
            typeface = typeface2;
        }
        super.setTypeface(typeface, i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0161t(android.content.Context context, android.util.AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        h.g0.a(context);
        h.C0156n c0156n = new h.C0156n(this);
        this.f3260a = c0156n;
        c0156n.b(attributeSet, i2);
        h.C0160s c0160s = new h.C0160s(this);
        this.f3261b = c0160s;
        c0160s.d(attributeSet, i2);
        c0160s.b();
        x0.e eVar = new x0.e(25, false);
        eVar.f8409b = this;
        this.f3262c = eVar;
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        android.content.Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i2 != 0 ? d.AbstractC0106a.a(context, i2) : null, i3 != 0 ? d.AbstractC0106a.a(context, i3) : null, i4 != 0 ? d.AbstractC0106a.a(context, i4) : null, i5 != 0 ? d.AbstractC0106a.a(context, i5) : null);
        h.C0160s c0160s = this.f3261b;
        if (c0160s != null) {
            c0160s.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        android.content.Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i2 != 0 ? d.AbstractC0106a.a(context, i2) : null, i3 != 0 ? d.AbstractC0106a.a(context, i3) : null, i4 != 0 ? d.AbstractC0106a.a(context, i4) : null, i5 != 0 ? d.AbstractC0106a.a(context, i5) : null);
        h.C0160s c0160s = this.f3261b;
        if (c0160s != null) {
            c0160s.b();
        }
    }
}
