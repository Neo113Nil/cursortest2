package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import java.util.WeakHashMap;
import live.football.scorerepublic.R;

/* JADX INFO: renamed from: b5 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0050b5 extends CheckedTextView {

    /* JADX INFO: renamed from: j */
    public final C0086c5 f711j;

    /* JADX INFO: renamed from: k */
    public final C0864x4 f712k;

    /* JADX INFO: renamed from: l */
    public final C0164e7 f713l;

    /* JADX INFO: renamed from: m */
    public C0087c6 f714m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0050b5(Context context, AttributeSet attributeSet) {
        int resourceId;
        int resourceId2;
        super(context, attributeSet, R.attr.checkedTextViewStyle);
        md1.m3376a(context);
        zc1.m5876a(this, getContext());
        C0164e7 c0164e7 = new C0164e7(this);
        this.f713l = c0164e7;
        c0164e7.m1379f(attributeSet, R.attr.checkedTextViewStyle);
        c0164e7.m1376b();
        C0864x4 c0864x4 = new C0864x4(this);
        this.f712k = c0864x4;
        c0864x4.m5518d(attributeSet, R.attr.checkedTextViewStyle);
        this.f711j = new C0086c5(this);
        Context context2 = getContext();
        int[] iArr = mz0.f5198l;
        oq0 oq0VarM3731n = oq0.m3731n(context2, attributeSet, iArr, R.attr.checkedTextViewStyle);
        TypedArray typedArray = (TypedArray) oq0VarM3731n.f5841l;
        Context context3 = getContext();
        TypedArray typedArray2 = (TypedArray) oq0VarM3731n.f5841l;
        WeakHashMap weakHashMap = ai1.f194a;
        xh1.m5663b(this, context3, iArr, attributeSet, typedArray2, R.attr.checkedTextViewStyle, 0);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    setCheckMarkDrawable(j22.m2807p(getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                    if (typedArray.hasValue(0)) {
                        setCheckMarkDrawable(j22.m2807p(getContext(), resourceId));
                    }
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                setCheckMarkDrawable(j22.m2807p(getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                setCheckMarkTintList(oq0VarM3731n.m3734d(2));
            }
            if (typedArray.hasValue(3)) {
                setCheckMarkTintMode(AbstractC0890xu.m5689b(typedArray.getInt(3, -1), null));
            }
            oq0VarM3731n.m3742o();
            getEmojiTextViewHelper().m886a(attributeSet, R.attr.checkedTextViewStyle);
        } catch (Throwable th) {
            oq0VarM3731n.m3742o();
            throw th;
        }
    }

    private C0087c6 getEmojiTextViewHelper() {
        if (this.f714m == null) {
            this.f714m = new C0087c6(this);
        }
        return this.f714m;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0164e7 c0164e7 = this.f713l;
        if (c0164e7 != null) {
            c0164e7.m1376b();
        }
        C0864x4 c0864x4 = this.f712k;
        if (c0864x4 != null) {
            c0864x4.m5515a();
        }
        C0086c5 c0086c5 = this.f711j;
        if (c0086c5 != null) {
            c0086c5.m848b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return super.getCustomSelectionActionModeCallback();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0864x4 c0864x4 = this.f712k;
        if (c0864x4 != null) {
            return c0864x4.m5516b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0864x4 c0864x4 = this.f712k;
        if (c0864x4 != null) {
            return c0864x4.m5517c();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        C0086c5 c0086c5 = this.f711j;
        if (c0086c5 != null) {
            return (ColorStateList) c0086c5.f1090a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        C0086c5 c0086c5 = this.f711j;
        if (c0086c5 != null) {
            return (PorterDuff.Mode) c0086c5.f1091b;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f713l.m1377d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f713l.m1378e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        vt1.m5195g(editorInfo, inputConnectionOnCreateInputConnection, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().m887b(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0864x4 c0864x4 = this.f712k;
        if (c0864x4 != null) {
            c0864x4.m5519e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0864x4 c0864x4 = this.f712k;
        if (c0864x4 != null) {
            c0864x4.m5520f(i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        C0086c5 c0086c5 = this.f711j;
        if (c0086c5 != null) {
            if (c0086c5.f1094e) {
                c0086c5.f1094e = false;
            } else {
                c0086c5.f1094e = true;
                c0086c5.m848b();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0164e7 c0164e7 = this.f713l;
        if (c0164e7 != null) {
            c0164e7.m1376b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0164e7 c0164e7 = this.f713l;
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

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0864x4 c0864x4 = this.f712k;
        if (c0864x4 != null) {
            c0864x4.m5522h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0864x4 c0864x4 = this.f712k;
        if (c0864x4 != null) {
            c0864x4.m5523i(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        C0086c5 c0086c5 = this.f711j;
        if (c0086c5 != null) {
            c0086c5.f1090a = colorStateList;
            c0086c5.f1092c = true;
            c0086c5.m848b();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        C0086c5 c0086c5 = this.f711j;
        if (c0086c5 != null) {
            c0086c5.f1091b = mode;
            c0086c5.f1093d = true;
            c0086c5.m848b();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0164e7 c0164e7 = this.f713l;
        c0164e7.m1381i(colorStateList);
        c0164e7.m1376b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0164e7 c0164e7 = this.f713l;
        c0164e7.m1382j(mode);
        c0164e7.m1376b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0164e7 c0164e7 = this.f713l;
        if (c0164e7 != null) {
            c0164e7.m1380g(context, i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(j22.m2807p(getContext(), i));
    }
}
