package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import android.widget.TextView;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: c5 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0086c5 {

    /* JADX INFO: renamed from: a */
    public Parcelable f1090a;

    /* JADX INFO: renamed from: b */
    public Object f1091b;

    /* JADX INFO: renamed from: c */
    public boolean f1092c;

    /* JADX INFO: renamed from: d */
    public boolean f1093d;

    /* JADX INFO: renamed from: e */
    public boolean f1094e;

    /* JADX INFO: renamed from: f */
    public final Object f1095f;

    public /* synthetic */ C0086c5(TextView textView) {
        this.f1090a = null;
        this.f1091b = null;
        this.f1092c = false;
        this.f1093d = false;
        this.f1095f = textView;
    }

    /* JADX INFO: renamed from: a */
    public void m847a() {
        CompoundButton compoundButton = (CompoundButton) this.f1095f;
        Drawable buttonDrawable = compoundButton.getButtonDrawable();
        if (buttonDrawable != null) {
            if (this.f1092c || this.f1093d) {
                Drawable drawableMutate = buttonDrawable.mutate();
                if (this.f1092c) {
                    drawableMutate.setTintList((ColorStateList) this.f1090a);
                }
                if (this.f1093d) {
                    drawableMutate.setTintMode((PorterDuff.Mode) this.f1091b);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(drawableMutate);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m848b() {
        C0050b5 c0050b5 = (C0050b5) this.f1095f;
        Drawable checkMarkDrawable = c0050b5.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.f1092c || this.f1093d) {
                Drawable drawableMutate = checkMarkDrawable.mutate();
                if (this.f1092c) {
                    drawableMutate.setTintList((ColorStateList) this.f1090a);
                }
                if (this.f1093d) {
                    drawableMutate.setTintMode((PorterDuff.Mode) this.f1091b);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(c0050b5.getDrawableState());
                }
                c0050b5.setCheckMarkDrawable(drawableMutate);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public Bundle m849c(String str) {
        if (!this.f1093d) {
            C0270h1.m2191g("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
            return null;
        }
        Bundle bundle = (Bundle) this.f1090a;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle.getBundle(str);
        Bundle bundle3 = (Bundle) this.f1090a;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = (Bundle) this.f1090a;
        if (bundle4 != null && !bundle4.isEmpty()) {
            return bundle2;
        }
        this.f1090a = null;
        return bundle2;
    }

    /* JADX INFO: renamed from: d */
    public void m850d(AttributeSet attributeSet, int i) {
        int resourceId;
        int resourceId2;
        CompoundButton compoundButton = (CompoundButton) this.f1095f;
        Context context = compoundButton.getContext();
        int[] iArr = mz0.f5199m;
        oq0 oq0VarM3731n = oq0.m3731n(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) oq0VarM3731n.f5841l;
        Context context2 = compoundButton.getContext();
        TypedArray typedArray2 = (TypedArray) oq0VarM3731n.f5841l;
        WeakHashMap weakHashMap = ai1.f194a;
        xh1.m5663b(compoundButton, context2, iArr, attributeSet, typedArray2, i, 0);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    compoundButton.setButtonDrawable(j22.m2807p(compoundButton.getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                    if (typedArray.hasValue(0)) {
                        compoundButton.setButtonDrawable(j22.m2807p(compoundButton.getContext(), resourceId));
                    }
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                compoundButton.setButtonDrawable(j22.m2807p(compoundButton.getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                compoundButton.setButtonTintList(oq0VarM3731n.m3734d(2));
            }
            if (typedArray.hasValue(3)) {
                compoundButton.setButtonTintMode(AbstractC0890xu.m5689b(typedArray.getInt(3, -1), null));
            }
        } finally {
            oq0VarM3731n.m3742o();
        }
    }

    /* JADX INFO: renamed from: e */
    public void m851e(String str, w41 w41Var) {
        Object obj;
        w41Var.getClass();
        p41 p41Var = (p41) this.f1095f;
        m41 m41VarMo2353b = p41Var.mo2353b(str);
        if (m41VarMo2353b != null) {
            obj = m41VarMo2353b.f4973k;
        } else {
            m41 m41Var = new m41(str, w41Var);
            p41Var.f5985m++;
            m41 m41Var2 = p41Var.f5983k;
            if (m41Var2 == null) {
                p41Var.f5982j = m41Var;
                p41Var.f5983k = m41Var;
            } else {
                m41Var2.f4974l = m41Var;
                m41Var.f4975m = m41Var2;
                p41Var.f5983k = m41Var;
            }
            obj = null;
        }
        if (((w41) obj) == null) {
            return;
        }
        C0270h1.m2190f("SavedStateProvider with the given key is already registered");
    }

    /* JADX INFO: renamed from: f */
    public void m852f() {
        if (!this.f1094e) {
            C0270h1.m2191g("Can not perform this action after onSaveInstanceState");
            return;
        }
        C0716t4 c0716t4 = (C0716t4) this.f1091b;
        if (c0716t4 == null) {
            c0716t4 = new C0716t4(this);
        }
        this.f1091b = c0716t4;
        try {
            kh0.class.getDeclaredConstructor(null);
            C0716t4 c0716t5 = (C0716t4) this.f1091b;
            if (c0716t5 != null) {
                ((LinkedHashSet) c0716t5.f7274b).add(kh0.class.getName());
            }
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("Class " + kh0.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
        }
    }

    public C0086c5() {
        this.f1095f = new p41();
        this.f1094e = true;
    }
}
