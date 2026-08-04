package androidx.appcompat.widget;

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
import android.widget.TextView;
import com.salamadev.nabilalawadi.kisaskoran.R;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatButton extends Button {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final E4.L f8263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final F2.L0 f8264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C0648w f8265c;

    public AppCompatButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyle);
    }

    private C0648w getEmojiTextViewHelper() {
        if (this.f8265c == null) {
            this.f8265c = new C0648w(this);
        }
        return this.f8265c;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        E4.L l7 = this.f8263a;
        if (l7 != null) {
            l7.l();
        }
        F2.L0 l8 = this.f8264b;
        if (l8 != null) {
            l8.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (q1.f8735b) {
            return super.getAutoSizeMaxTextSize();
        }
        F2.L0 l7 = this.f8264b;
        if (l7 != null) {
            return Math.round(((Z) l7.f2599l).f8593e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (q1.f8735b) {
            return super.getAutoSizeMinTextSize();
        }
        F2.L0 l7 = this.f8264b;
        if (l7 != null) {
            return Math.round(((Z) l7.f2599l).f8592d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (q1.f8735b) {
            return super.getAutoSizeStepGranularity();
        }
        F2.L0 l7 = this.f8264b;
        if (l7 != null) {
            return Math.round(((Z) l7.f2599l).f8591c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (q1.f8735b) {
            return super.getAutoSizeTextAvailableSizes();
        }
        F2.L0 l7 = this.f8264b;
        return l7 != null ? ((Z) l7.f2599l).f8594f : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (q1.f8735b) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        F2.L0 l7 = this.f8264b;
        if (l7 != null) {
            return ((Z) l7.f2599l).f8589a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return p097n3.a.X(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        E4.L l7 = this.f8263a;
        if (l7 != null) {
            return l7.n();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        E4.L l7 = this.f8263a;
        if (l7 != null) {
            return l7.o();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f8264b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f8264b.e();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z4, int i7, int i8, int i9, int i10) {
        super.onLayout(z4, i7, i8, i9, i10);
        F2.L0 l7 = this.f8264b;
        if (l7 == null || q1.f8735b) {
            return;
        }
        ((Z) l7.f2599l).a();
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
        super.onTextChanged(charSequence, i7, i8, i9);
        F2.L0 l7 = this.f8264b;
        if (l7 == null || q1.f8735b) {
            return;
        }
        Z z4 = (Z) l7.f2599l;
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
        F2.L0 l7 = this.f8264b;
        if (l7 != null) {
            l7.i(i7, i8, i9, i10);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i7) {
        if (q1.f8735b) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i7);
            return;
        }
        F2.L0 l7 = this.f8264b;
        if (l7 != null) {
            l7.j(iArr, i7);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i7) {
        if (q1.f8735b) {
            super.setAutoSizeTextTypeWithDefaults(i7);
            return;
        }
        F2.L0 l7 = this.f8264b;
        if (l7 != null) {
            l7.k(i7);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        E4.L l7 = this.f8263a;
        if (l7 != null) {
            l7.r();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i7) {
        super.setBackgroundResource(i7);
        E4.L l7 = this.f8263a;
        if (l7 != null) {
            l7.s(i7);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(p097n3.a.Y(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z4) {
        getEmojiTextViewHelper().d(z4);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z4) {
        F2.L0 l7 = this.f8264b;
        if (l7 != null) {
            ((TextView) l7.f2592d).setAllCaps(z4);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        E4.L l7 = this.f8263a;
        if (l7 != null) {
            l7.v(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        E4.L l7 = this.f8263a;
        if (l7 != null) {
            l7.w(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        F2.L0 l7 = this.f8264b;
        l7.l(colorStateList);
        l7.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        F2.L0 l7 = this.f8264b;
        l7.m(mode);
        l7.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i7) {
        super.setTextAppearance(context, i7);
        F2.L0 l7 = this.f8264b;
        if (l7 != null) {
            l7.g(i7, context);
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i7, float f7) {
        boolean z4 = q1.f8735b;
        if (z4) {
            super.setTextSize(i7, f7);
            return;
        }
        F2.L0 l7 = this.f8264b;
        if (l7 == null || z4) {
            return;
        }
        Z z7 = (Z) l7.f2599l;
        if (z7.f()) {
            return;
        }
        z7.g(f7, i7);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatButton(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Y0.a(context);
        X0.a(getContext(), this);
        E4.L l7 = new E4.L(this);
        this.f8263a = l7;
        l7.q(attributeSet, i7);
        F2.L0 l8 = new F2.L0(this);
        this.f8264b = l8;
        l8.f(attributeSet, i7);
        l8.b();
        getEmojiTextViewHelper().b(attributeSet, i7);
    }
}
