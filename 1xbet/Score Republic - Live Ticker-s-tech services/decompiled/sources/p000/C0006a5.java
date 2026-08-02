package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;
import live.football.scorerepublic.R;

/* JADX INFO: renamed from: a5 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0006a5 extends CheckBox {

    /* JADX INFO: renamed from: j */
    public final C0086c5 f36j;

    /* JADX INFO: renamed from: k */
    public final C0864x4 f37k;

    /* JADX INFO: renamed from: l */
    public final C0164e7 f38l;

    /* JADX INFO: renamed from: m */
    public C0087c6 f39m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0006a5(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.checkboxStyle);
        md1.m3376a(context);
        zc1.m5876a(this, getContext());
        C0086c5 c0086c5 = new C0086c5(this);
        this.f36j = c0086c5;
        c0086c5.m850d(attributeSet, R.attr.checkboxStyle);
        C0864x4 c0864x4 = new C0864x4(this);
        this.f37k = c0864x4;
        c0864x4.m5518d(attributeSet, R.attr.checkboxStyle);
        C0164e7 c0164e7 = new C0164e7(this);
        this.f38l = c0164e7;
        c0164e7.m1379f(attributeSet, R.attr.checkboxStyle);
        getEmojiTextViewHelper().m886a(attributeSet, R.attr.checkboxStyle);
    }

    private C0087c6 getEmojiTextViewHelper() {
        if (this.f39m == null) {
            this.f39m = new C0087c6(this);
        }
        return this.f39m;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0864x4 c0864x4 = this.f37k;
        if (c0864x4 != null) {
            c0864x4.m5515a();
        }
        C0164e7 c0164e7 = this.f38l;
        if (c0164e7 != null) {
            c0164e7.m1376b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0864x4 c0864x4 = this.f37k;
        if (c0864x4 != null) {
            return c0864x4.m5516b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0864x4 c0864x4 = this.f37k;
        if (c0864x4 != null) {
            return c0864x4.m5517c();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        C0086c5 c0086c5 = this.f36j;
        if (c0086c5 != null) {
            return (ColorStateList) c0086c5.f1090a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C0086c5 c0086c5 = this.f36j;
        if (c0086c5 != null) {
            return (PorterDuff.Mode) c0086c5.f1091b;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f38l.m1377d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f38l.m1378e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().m887b(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0864x4 c0864x4 = this.f37k;
        if (c0864x4 != null) {
            c0864x4.m5519e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0864x4 c0864x4 = this.f37k;
        if (c0864x4 != null) {
            c0864x4.m5520f(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C0086c5 c0086c5 = this.f36j;
        if (c0086c5 != null) {
            if (c0086c5.f1094e) {
                c0086c5.f1094e = false;
            } else {
                c0086c5.f1094e = true;
                c0086c5.m847a();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0164e7 c0164e7 = this.f38l;
        if (c0164e7 != null) {
            c0164e7.m1376b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0164e7 c0164e7 = this.f38l;
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
        C0864x4 c0864x4 = this.f37k;
        if (c0864x4 != null) {
            c0864x4.m5522h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0864x4 c0864x4 = this.f37k;
        if (c0864x4 != null) {
            c0864x4.m5523i(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C0086c5 c0086c5 = this.f36j;
        if (c0086c5 != null) {
            c0086c5.f1090a = colorStateList;
            c0086c5.f1092c = true;
            c0086c5.m847a();
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C0086c5 c0086c5 = this.f36j;
        if (c0086c5 != null) {
            c0086c5.f1091b = mode;
            c0086c5.f1093d = true;
            c0086c5.m847a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0164e7 c0164e7 = this.f38l;
        c0164e7.m1381i(colorStateList);
        c0164e7.m1376b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0164e7 c0164e7 = this.f38l;
        c0164e7.m1382j(mode);
        c0164e7.m1376b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(j22.m2807p(getContext(), i));
    }
}
