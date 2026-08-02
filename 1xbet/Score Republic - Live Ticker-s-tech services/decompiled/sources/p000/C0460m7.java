package p000;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/* JADX INFO: renamed from: m7 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0460m7 extends ToggleButton {

    /* JADX INFO: renamed from: j */
    public final C0864x4 f4992j;

    /* JADX INFO: renamed from: k */
    public final C0164e7 f4993k;

    /* JADX INFO: renamed from: l */
    public C0087c6 f4994l;

    public C0460m7(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.buttonStyleToggle);
        zc1.m5876a(this, getContext());
        C0864x4 c0864x4 = new C0864x4(this);
        this.f4992j = c0864x4;
        c0864x4.m5518d(attributeSet, R.attr.buttonStyleToggle);
        C0164e7 c0164e7 = new C0164e7(this);
        this.f4993k = c0164e7;
        c0164e7.m1379f(attributeSet, R.attr.buttonStyleToggle);
        getEmojiTextViewHelper().m886a(attributeSet, R.attr.buttonStyleToggle);
    }

    private C0087c6 getEmojiTextViewHelper() {
        if (this.f4994l == null) {
            this.f4994l = new C0087c6(this);
        }
        return this.f4994l;
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0864x4 c0864x4 = this.f4992j;
        if (c0864x4 != null) {
            c0864x4.m5515a();
        }
        C0164e7 c0164e7 = this.f4993k;
        if (c0164e7 != null) {
            c0164e7.m1376b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0864x4 c0864x4 = this.f4992j;
        if (c0864x4 != null) {
            return c0864x4.m5516b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0864x4 c0864x4 = this.f4992j;
        if (c0864x4 != null) {
            return c0864x4.m5517c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f4993k.m1377d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f4993k.m1378e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().m887b(z);
    }

    @Override // android.widget.ToggleButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0864x4 c0864x4 = this.f4992j;
        if (c0864x4 != null) {
            c0864x4.m5519e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0864x4 c0864x4 = this.f4992j;
        if (c0864x4 != null) {
            c0864x4.m5520f(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0164e7 c0164e7 = this.f4993k;
        if (c0164e7 != null) {
            c0164e7.m1376b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0164e7 c0164e7 = this.f4993k;
        if (c0164e7 != null) {
            c0164e7.m1376b();
        }
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().m888c(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((vk1) getEmojiTextViewHelper().f1149b.f5551k).mo489b(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0864x4 c0864x4 = this.f4992j;
        if (c0864x4 != null) {
            c0864x4.m5522h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0864x4 c0864x4 = this.f4992j;
        if (c0864x4 != null) {
            c0864x4.m5523i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0164e7 c0164e7 = this.f4993k;
        c0164e7.m1381i(colorStateList);
        c0164e7.m1376b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0164e7 c0164e7 = this.f4993k;
        c0164e7.m1382j(mode);
        c0164e7.m1376b();
    }
}
