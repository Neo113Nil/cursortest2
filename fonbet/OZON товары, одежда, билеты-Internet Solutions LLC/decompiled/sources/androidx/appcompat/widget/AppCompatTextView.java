package androidx.appcompat.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.text.g;
import j.C7232a;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* loaded from: classes.dex */
public class AppCompatTextView extends TextView implements androidx.core.widget.b, J {
    private final C5060e mBackgroundTintHelper;

    @NonNull
    private C5066k mEmojiTextViewHelper;
    private boolean mIsSetTypefaceProcessing;
    private Future<androidx.core.text.g> mPrecomputedTextFuture;
    private a mSuperCaller;
    private final C5079y mTextClassifierHelper;
    private final C5080z mTextHelper;

    private interface a {
        void a(int i11);

        void b(int i11);

        void c(int i11, float f7);
    }

    class b implements a {
        b() {
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public void a(int i11) {
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public void b(int i11) {
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public void c(int i11, float f7) {
        }
    }

    class c extends b {
        c() {
            super();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.b, androidx.appcompat.widget.AppCompatTextView.a
        public final void a(int i11) {
            AppCompatTextView.super.setFirstBaselineToTopHeight(i11);
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.b, androidx.appcompat.widget.AppCompatTextView.a
        public final void b(int i11) {
            AppCompatTextView.super.setLastBaselineToBottomHeight(i11);
        }
    }

    class d extends c {
        d() {
            super();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.b, androidx.appcompat.widget.AppCompatTextView.a
        public final void c(int i11, float f7) {
            AppCompatTextView.super.setLineHeight(i11, f7);
        }
    }

    public AppCompatTextView(@NonNull Context context) {
        this(context, null);
    }

    private void consumeTextFutureAndSetBlocking() {
        Future<androidx.core.text.g> future = this.mPrecomputedTextFuture;
        if (future != null) {
            try {
                this.mPrecomputedTextFuture = null;
                androidx.core.widget.k.j(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    @NonNull
    private C5066k getEmojiTextViewHelper() {
        if (this.mEmojiTextViewHelper == null) {
            this.mEmojiTextViewHelper = new C5066k(this);
        }
        return this.mEmojiTextViewHelper;
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C5060e c5060e = this.mBackgroundTintHelper;
        if (c5060e != null) {
            c5060e.a();
        }
        C5080z c5080z = this.mTextHelper;
        if (c5080z != null) {
            c5080z.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (i0.f37950c) {
            return super.getAutoSizeMaxTextSize();
        }
        C5080z c5080z = this.mTextHelper;
        if (c5080z != null) {
            return c5080z.e();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (i0.f37950c) {
            return super.getAutoSizeMinTextSize();
        }
        C5080z c5080z = this.mTextHelper;
        if (c5080z != null) {
            return c5080z.f();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (i0.f37950c) {
            return super.getAutoSizeStepGranularity();
        }
        C5080z c5080z = this.mTextHelper;
        if (c5080z != null) {
            return c5080z.g();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (i0.f37950c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C5080z c5080z = this.mTextHelper;
        return c5080z != null ? c5080z.h() : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (i0.f37950c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C5080z c5080z = this.mTextHelper;
        if (c5080z != null) {
            return c5080z.i();
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.k.l(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    a getSuperCaller() {
        if (this.mSuperCaller == null) {
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 34) {
                this.mSuperCaller = new d();
            } else if (i11 >= 28) {
                this.mSuperCaller = new c();
            } else {
                this.mSuperCaller = new b();
            }
        }
        return this.mSuperCaller;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C5060e c5060e = this.mBackgroundTintHelper;
        if (c5060e != null) {
            return c5060e.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C5060e c5060e = this.mBackgroundTintHelper;
        if (c5060e != null) {
            return c5060e.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.mTextHelper.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.mTextHelper.k();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        consumeTextFutureAndSetBlocking();
        return super.getText();
    }

    @Override // android.widget.TextView
    @NonNull
    public TextClassifier getTextClassifier() {
        C5079y c5079y;
        return (Build.VERSION.SDK_INT >= 28 || (c5079y = this.mTextClassifierHelper) == null) ? super.getTextClassifier() : c5079y.a();
    }

    @NonNull
    public g.b getTextMetricsParamsCompat() {
        return androidx.core.widget.k.a(this);
    }

    public boolean isEmojiCompatEnabled() {
        return getEmojiTextViewHelper().b();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.mTextHelper.getClass();
        if (Build.VERSION.SDK_INT < 30 && onCreateInputConnection != null) {
            B2.a.b(editorInfo, getText());
        }
        C5067l.a(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 30 || i11 >= 33 || !onCheckIsTextEditor()) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        C5080z c5080z = this.mTextHelper;
        if (c5080z == null || i0.f37950c) {
            return;
        }
        c5080z.c();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i11, int i12) {
        consumeTextFutureAndSetBlocking();
        super.onMeasure(i11, i12);
    }

    @Override // android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        super.onTextChanged(charSequence, i11, i12, i13);
        C5080z c5080z = this.mTextHelper;
        if (c5080z == null || i0.f37950c || !c5080z.l()) {
            return;
        }
        this.mTextHelper.c();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z11) {
        super.setAllCaps(z11);
        getEmojiTextViewHelper().d(z11);
    }

    @Override // android.widget.TextView, androidx.core.widget.b
    public void setAutoSizeTextTypeUniformWithConfiguration(int i11, int i12, int i13, int i14) throws IllegalArgumentException {
        if (i0.f37950c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i11, i12, i13, i14);
            return;
        }
        C5080z c5080z = this.mTextHelper;
        if (c5080z != null) {
            c5080z.q(i11, i12, i13, i14);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(@NonNull int[] iArr, int i11) throws IllegalArgumentException {
        if (i0.f37950c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i11);
            return;
        }
        C5080z c5080z = this.mTextHelper;
        if (c5080z != null) {
            c5080z.r(iArr, i11);
        }
    }

    @Override // android.widget.TextView, androidx.core.widget.b
    public void setAutoSizeTextTypeWithDefaults(int i11) {
        if (i0.f37950c) {
            super.setAutoSizeTextTypeWithDefaults(i11);
            return;
        }
        C5080z c5080z = this.mTextHelper;
        if (c5080z != null) {
            c5080z.s(i11);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C5060e c5060e = this.mBackgroundTintHelper;
        if (c5060e != null) {
            c5060e.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i11) {
        super.setBackgroundResource(i11);
        C5060e c5060e = this.mBackgroundTintHelper;
        if (c5060e != null) {
            c5060e.f(i11);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C5080z c5080z = this.mTextHelper;
        if (c5080z != null) {
            c5080z.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C5080z c5080z = this.mTextHelper;
        if (c5080z != null) {
            c5080z.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C5080z c5080z = this.mTextHelper;
        if (c5080z != null) {
            c5080z.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C5080z c5080z = this.mTextHelper;
        if (c5080z != null) {
            c5080z.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.k.m(callback, this));
    }

    @Override // androidx.appcompat.widget.J
    public void setEmojiCompatEnabled(boolean z11) {
        getEmojiTextViewHelper().e(z11);
    }

    @Override // android.widget.TextView
    public void setFilters(@NonNull InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i11) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().a(i11);
        } else {
            androidx.core.widget.k.f(this, i11);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i11) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().b(i11);
        } else {
            androidx.core.widget.k.g(this, i11);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i11) {
        androidx.core.widget.k.h(this, i11);
    }

    public void setPrecomputedText(@NonNull androidx.core.text.g gVar) {
        androidx.core.widget.k.j(this, gVar);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C5060e c5060e = this.mBackgroundTintHelper;
        if (c5060e != null) {
            c5060e.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C5060e c5060e = this.mBackgroundTintHelper;
        if (c5060e != null) {
            c5060e.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.mTextHelper.t(colorStateList);
        this.mTextHelper.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.mTextHelper.u(mode);
        this.mTextHelper.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i11) {
        super.setTextAppearance(context, i11);
        C5080z c5080z = this.mTextHelper;
        if (c5080z != null) {
            c5080z.o(i11, context);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C5079y c5079y;
        if (Build.VERSION.SDK_INT >= 28 || (c5079y = this.mTextClassifierHelper) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c5079y.b(textClassifier);
        }
    }

    public void setTextFuture(Future<androidx.core.text.g> future) {
        this.mPrecomputedTextFuture = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(@NonNull g.b bVar) {
        androidx.core.widget.k.k(this, bVar);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i11, float f7) {
        if (i0.f37950c) {
            super.setTextSize(i11, f7);
            return;
        }
        C5080z c5080z = this.mTextHelper;
        if (c5080z != null) {
            c5080z.v(i11, f7);
        }
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface, int i11) {
        Typeface typeface2;
        if (this.mIsSetTypefaceProcessing) {
            return;
        }
        if (typeface == null || i11 <= 0) {
            typeface2 = null;
        } else {
            Context context = getContext();
            int i12 = androidx.core.graphics.g.f42158c;
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null");
            }
            typeface2 = Typeface.create(typeface, i11);
        }
        this.mIsSetTypefaceProcessing = true;
        if (typeface2 != null) {
            typeface = typeface2;
        }
        try {
            super.setTypeface(typeface, i11);
        } finally {
            this.mIsSetTypefaceProcessing = false;
        }
    }

    public AppCompatTextView(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i11, float f7) {
        if (Build.VERSION.SDK_INT >= 34) {
            getSuperCaller().c(i11, f7);
        } else {
            androidx.core.widget.k.i(this, i11, f7);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatTextView(@NonNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Y.a(context);
        this.mIsSetTypefaceProcessing = false;
        this.mSuperCaller = null;
        W.a(this, getContext());
        C5060e c5060e = new C5060e(this);
        this.mBackgroundTintHelper = c5060e;
        c5060e.d(attributeSet, i11);
        C5080z c5080z = new C5080z(this);
        this.mTextHelper = c5080z;
        c5080z.m(attributeSet, i11);
        c5080z.b();
        this.mTextClassifierHelper = new C5079y(this);
        getEmojiTextViewHelper().c(attributeSet, i11);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i11, int i12, int i13, int i14) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i11 != 0 ? C7232a.a(context, i11) : null, i12 != 0 ? C7232a.a(context, i12) : null, i13 != 0 ? C7232a.a(context, i13) : null, i14 != 0 ? C7232a.a(context, i14) : null);
        C5080z c5080z = this.mTextHelper;
        if (c5080z != null) {
            c5080z.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i11, int i12, int i13, int i14) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i11 != 0 ? C7232a.a(context, i11) : null, i12 != 0 ? C7232a.a(context, i12) : null, i13 != 0 ? C7232a.a(context, i13) : null, i14 != 0 ? C7232a.a(context, i14) : null);
        C5080z c5080z = this.mTextHelper;
        if (c5080z != null) {
            c5080z.b();
        }
    }
}
