package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.lang.reflect.Constructor;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class ub1 {

    /* JADX INFO: renamed from: A */
    public CharSequence f7756A;

    /* JADX INFO: renamed from: B */
    public CharSequence f7757B;

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ vb1 f7760E;

    /* JADX INFO: renamed from: a */
    public final Menu f7761a;

    /* JADX INFO: renamed from: h */
    public boolean f7768h;

    /* JADX INFO: renamed from: i */
    public int f7769i;

    /* JADX INFO: renamed from: j */
    public int f7770j;

    /* JADX INFO: renamed from: k */
    public CharSequence f7771k;

    /* JADX INFO: renamed from: l */
    public CharSequence f7772l;

    /* JADX INFO: renamed from: m */
    public int f7773m;

    /* JADX INFO: renamed from: n */
    public char f7774n;

    /* JADX INFO: renamed from: o */
    public int f7775o;

    /* JADX INFO: renamed from: p */
    public char f7776p;

    /* JADX INFO: renamed from: q */
    public int f7777q;

    /* JADX INFO: renamed from: r */
    public int f7778r;

    /* JADX INFO: renamed from: s */
    public boolean f7779s;

    /* JADX INFO: renamed from: t */
    public boolean f7780t;

    /* JADX INFO: renamed from: u */
    public boolean f7781u;

    /* JADX INFO: renamed from: v */
    public int f7782v;

    /* JADX INFO: renamed from: w */
    public int f7783w;

    /* JADX INFO: renamed from: x */
    public String f7784x;

    /* JADX INFO: renamed from: y */
    public String f7785y;

    /* JADX INFO: renamed from: z */
    public sn0 f7786z;

    /* JADX INFO: renamed from: C */
    public ColorStateList f7758C = null;

    /* JADX INFO: renamed from: D */
    public PorterDuff.Mode f7759D = null;

    /* JADX INFO: renamed from: b */
    public int f7762b = 0;

    /* JADX INFO: renamed from: c */
    public int f7763c = 0;

    /* JADX INFO: renamed from: d */
    public int f7764d = 0;

    /* JADX INFO: renamed from: e */
    public int f7765e = 0;

    /* JADX INFO: renamed from: f */
    public boolean f7766f = true;

    /* JADX INFO: renamed from: g */
    public boolean f7767g = true;

    public ub1(vb1 vb1Var, Menu menu) {
        this.f7760E = vb1Var;
        this.f7761a = menu;
    }

    /* JADX INFO: renamed from: a */
    public final Object m4902a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.f7760E.f8165c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m4903b(MenuItem menuItem) {
        vb1 vb1Var = this.f7760E;
        Context context = vb1Var.f8165c;
        boolean z = false;
        menuItem.setChecked(this.f7779s).setVisible(this.f7780t).setEnabled(this.f7781u).setCheckable(this.f7778r >= 1).setTitleCondensed(this.f7772l).setIcon(this.f7773m);
        int i = this.f7782v;
        if (i >= 0) {
            menuItem.setShowAsAction(i);
        }
        if (this.f7785y != null) {
            if (context.isRestricted()) {
                C0270h1.m2191g("The android:onClick attribute cannot be used within a restricted context");
                return;
            }
            if (vb1Var.f8166d == null) {
                vb1Var.f8166d = vb1.m5143a(context);
            }
            Object obj = vb1Var.f8166d;
            String str = this.f7785y;
            tb1 tb1Var = new tb1();
            tb1Var.f7408b = obj;
            Class<?> cls = obj.getClass();
            try {
                tb1Var.f7409c = cls.getMethod(str, tb1.f7406d);
                menuItem.setOnMenuItemClickListener(tb1Var);
            } catch (Exception e) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e);
                throw inflateException;
            }
        }
        if (this.f7778r >= 2) {
            if (menuItem instanceof rn0) {
                rn0 rn0Var = (rn0) menuItem;
                rn0Var.f6897G = (rn0Var.f6897G & (-5)) | 4;
            } else if (menuItem instanceof vn0) {
                vn0 vn0Var = (vn0) menuItem;
                wb1 wb1Var = vn0Var.f8227l;
                try {
                    if (vn0Var.f8228m == null) {
                        vn0Var.f8228m = wb1Var.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    vn0Var.f8228m.invoke(wb1Var, Boolean.TRUE);
                } catch (Exception e2) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e2);
                }
            }
        }
        String str2 = this.f7784x;
        if (str2 != null) {
            menuItem.setActionView((View) m4902a(str2, vb1.f8161e, vb1Var.f8163a));
            z = true;
        }
        int i2 = this.f7783w;
        if (i2 > 0) {
            if (z) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i2);
            }
        }
        sn0 sn0Var = this.f7786z;
        if (sn0Var != null) {
            if (menuItem instanceof wb1) {
                ((wb1) menuItem).mo2779a(sn0Var);
            } else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence = this.f7756A;
        boolean z2 = menuItem instanceof wb1;
        if (z2) {
            ((wb1) menuItem).setContentDescription(charSequence);
        } else {
            menuItem.setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.f7757B;
        if (z2) {
            ((wb1) menuItem).setTooltipText(charSequence2);
        } else {
            menuItem.setTooltipText(charSequence2);
        }
        char c = this.f7774n;
        int i3 = this.f7775o;
        if (z2) {
            ((wb1) menuItem).setAlphabeticShortcut(c, i3);
        } else {
            menuItem.setAlphabeticShortcut(c, i3);
        }
        char c2 = this.f7776p;
        int i4 = this.f7777q;
        if (z2) {
            ((wb1) menuItem).setNumericShortcut(c2, i4);
        } else {
            menuItem.setNumericShortcut(c2, i4);
        }
        PorterDuff.Mode mode = this.f7759D;
        if (mode != null) {
            if (z2) {
                ((wb1) menuItem).setIconTintMode(mode);
            } else {
                menuItem.setIconTintMode(mode);
            }
        }
        ColorStateList colorStateList = this.f7758C;
        if (colorStateList != null) {
            if (z2) {
                ((wb1) menuItem).setIconTintList(colorStateList);
            } else {
                menuItem.setIconTintList(colorStateList);
            }
        }
    }
}
