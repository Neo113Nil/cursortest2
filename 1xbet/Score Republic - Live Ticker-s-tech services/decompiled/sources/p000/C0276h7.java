package p000;

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
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: renamed from: h7 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public class C0276h7 extends TextView {

    /* JADX INFO: renamed from: j */
    public final C0864x4 f3075j;

    /* JADX INFO: renamed from: k */
    public final C0164e7 f3076k;

    /* JADX INFO: renamed from: l */
    public C0087c6 f3077l;

    /* JADX INFO: renamed from: m */
    public boolean f3078m;

    /* JADX INFO: renamed from: n */
    public C0312i6 f3079n;

    /* JADX INFO: renamed from: o */
    public Future f3080o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0276h7(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        md1.m3376a(context);
        this.f3078m = false;
        this.f3079n = null;
        zc1.m5876a(this, getContext());
        C0864x4 c0864x4 = new C0864x4(this);
        this.f3075j = c0864x4;
        c0864x4.m5518d(attributeSet, i);
        C0164e7 c0164e7 = new C0164e7(this);
        this.f3076k = c0164e7;
        c0164e7.m1379f(attributeSet, i);
        c0164e7.m1376b();
        getEmojiTextViewHelper().m886a(attributeSet, i);
    }

    private C0087c6 getEmojiTextViewHelper() {
        if (this.f3077l == null) {
            this.f3077l = new C0087c6(this);
        }
        return this.f3077l;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0864x4 c0864x4 = this.f3075j;
        if (c0864x4 != null) {
            c0864x4.m5515a();
        }
        C0164e7 c0164e7 = this.f3076k;
        if (c0164e7 != null) {
            c0164e7.m1376b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        return super.getAutoSizeMaxTextSize();
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        return super.getAutoSizeMinTextSize();
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        return super.getAutoSizeStepGranularity();
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        return super.getAutoSizeTextAvailableSizes();
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        return super.getAutoSizeTextType() == 1 ? 1 : 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return super.getCustomSelectionActionModeCallback();
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public InterfaceC0201f7 getSuperCaller() {
        if (this.f3079n == null) {
            if (Build.VERSION.SDK_INT >= 34) {
                this.f3079n = new C0239g7(this);
            } else {
                this.f3079n = new C0312i6(this);
            }
        }
        return this.f3079n;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0864x4 c0864x4 = this.f3075j;
        if (c0864x4 != null) {
            return c0864x4.m5516b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0864x4 c0864x4 = this.f3075j;
        if (c0864x4 != null) {
            return c0864x4.m5517c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f3076k.m1377d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f3076k.m1378e();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        Future future = this.f3080o;
        if (future != null) {
            try {
                this.f3080o = null;
                if (future.get() == null) {
                    throw null;
                }
                throw new ClassCastException();
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        return super.getTextClassifier();
    }

    public lw0 getTextMetricsParamsCompat() {
        return new lw0(getTextMetricsParams());
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f3076k.getClass();
        C0164e7.m1374h(editorInfo, inputConnectionOnCreateInputConnection, this);
        vt1.m5195g(editorInfo, inputConnectionOnCreateInputConnection, this);
        return inputConnectionOnCreateInputConnection;
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
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C0164e7 c0164e7 = this.f3076k;
        if (c0164e7 != null) {
            c0164e7.getClass();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        Future future = this.f3080o;
        if (future != null) {
            try {
                this.f3080o = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().m887b(z);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        super.setAutoSizeTextTypeWithDefaults(i);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0864x4 c0864x4 = this.f3075j;
        if (c0864x4 != null) {
            c0864x4.m5519e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0864x4 c0864x4 = this.f3075j;
        if (c0864x4 != null) {
            c0864x4.m5520f(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0164e7 c0164e7 = this.f3076k;
        if (c0164e7 != null) {
            c0164e7.m1376b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0164e7 c0164e7 = this.f3076k;
        if (c0164e7 != null) {
            c0164e7.m1376b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? j22.m2807p(context, i) : null, i2 != 0 ? j22.m2807p(context, i2) : null, i3 != 0 ? j22.m2807p(context, i3) : null, i4 != 0 ? j22.m2807p(context, i4) : null);
        C0164e7 c0164e7 = this.f3076k;
        if (c0164e7 != null) {
            c0164e7.m1376b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? j22.m2807p(context, i) : null, i2 != 0 ? j22.m2807p(context, i2) : null, i3 != 0 ? j22.m2807p(context, i3) : null, i4 != 0 ? j22.m2807p(context, i4) : null);
        C0164e7 c0164e7 = this.f3076k;
        if (c0164e7 != null) {
            c0164e7.m1376b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().m888c(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((vk1) getEmojiTextViewHelper().f1149b.f5551k).mo489b(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        super.setFirstBaselineToTopHeight(i);
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        super.setLastBaselineToBottomHeight(i);
    }

    @Override // android.widget.TextView
    public final void setLineHeight(int i, float f) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 34) {
            getSuperCaller().mo1646d(i, f);
        } else if (i2 >= 34) {
            AbstractC0528o1.m3622k(this, i, f);
        } else {
            vk1.m5170i(this, Math.round(TypedValue.applyDimension(i, f, getResources().getDisplayMetrics())));
        }
    }

    public void setPrecomputedText(mw0 mw0Var) {
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0864x4 c0864x4 = this.f3075j;
        if (c0864x4 != null) {
            c0864x4.m5522h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0864x4 c0864x4 = this.f3075j;
        if (c0864x4 != null) {
            c0864x4.m5523i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0164e7 c0164e7 = this.f3076k;
        c0164e7.m1381i(colorStateList);
        c0164e7.m1376b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0164e7 c0164e7 = this.f3076k;
        c0164e7.m1382j(mode);
        c0164e7.m1376b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0164e7 c0164e7 = this.f3076k;
        if (c0164e7 != null) {
            c0164e7.m1380g(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        super.setTextClassifier(textClassifier);
    }

    public void setTextFuture(Future<mw0> future) {
        this.f3080o = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(lw0 lw0Var) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = lw0Var.f4916b;
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
        getPaint().set(lw0Var.f4915a);
        setBreakStrategy(lw0Var.f4917c);
        setHyphenationFrequency(lw0Var.f4918d);
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i) {
        Typeface typefaceCreate;
        if (this.f3078m) {
            return;
        }
        if (typeface == null || i <= 0) {
            typefaceCreate = null;
        } else {
            Context context = getContext();
            aa0 aa0Var = ye1.f9283a;
            if (context == null) {
                C0270h1.m2190f("Context cannot be null");
                return;
            }
            typefaceCreate = Typeface.create(typeface, i);
        }
        this.f3078m = true;
        if (typefaceCreate != null) {
            typeface = typefaceCreate;
        }
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.f3078m = false;
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        vk1.m5170i(this, i);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0164e7 c0164e7 = this.f3076k;
        if (c0164e7 != null) {
            c0164e7.m1376b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0164e7 c0164e7 = this.f3076k;
        if (c0164e7 != null) {
            c0164e7.m1376b();
        }
    }

    public C0276h7(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }
}
