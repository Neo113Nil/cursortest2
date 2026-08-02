package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import androidx.annotation.NonNull;
import ru.ozon.app.android.R;

/* loaded from: classes.dex */
public class AppCompatButton extends Button implements androidx.core.widget.b, J {

    @NonNull
    private C5066k mAppCompatEmojiTextHelper;
    private final C5060e mBackgroundTintHelper;
    private final C5080z mTextHelper;

    public AppCompatButton(@NonNull Context context) {
        this(context, null);
    }

    @NonNull
    private C5066k getEmojiTextViewHelper() {
        if (this.mAppCompatEmojiTextHelper == null) {
            this.mAppCompatEmojiTextHelper = new C5066k(this);
        }
        return this.mAppCompatEmojiTextHelper;
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

    public boolean isEmojiCompatEnabled() {
        return getEmojiTextViewHelper().b();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
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

    public void setSupportAllCaps(boolean z11) {
        C5080z c5080z = this.mTextHelper;
        if (c5080z != null) {
            c5080z.p(z11);
        }
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

    public AppCompatButton(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatButton(@NonNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Y.a(context);
        W.a(this, getContext());
        C5060e c5060e = new C5060e(this);
        this.mBackgroundTintHelper = c5060e;
        c5060e.d(attributeSet, i11);
        C5080z c5080z = new C5080z(this);
        this.mTextHelper = c5080z;
        c5080z.m(attributeSet, i11);
        c5080z.b();
        getEmojiTextViewHelper().c(attributeSet, i11);
    }
}
