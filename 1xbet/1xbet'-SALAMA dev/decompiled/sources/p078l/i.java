package p078l;

import K.a;
import P.AbstractC0347c;
import P.AbstractC0360p;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import p031e1.k;
import p086m.m;
import p086m.r;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public CharSequence f14821A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public CharSequence f14822B;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final /* synthetic */ j f14825E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Menu f14826a;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f14833h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f14834i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public CharSequence f14835k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public CharSequence f14836l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f14837m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public char f14838n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f14839o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public char f14840p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f14841q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f14842r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f14843s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f14844t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f14845u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f14846v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f14847w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f14848x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f14849y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public AbstractC0347c f14850z;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public ColorStateList f14823C = null;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public PorterDuff.Mode f14824D = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f14827b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f14828c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f14829d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f14830e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f14831f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f14832g = true;

    public i(j jVar, Menu menu) {
        this.f14825E = jVar;
        this.f14826a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.f14825E.f14855c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e7) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e7);
            return null;
        }
    }

    public final void b(MenuItem menuItem) {
        boolean z4 = false;
        menuItem.setChecked(this.f14843s).setVisible(this.f14844t).setEnabled(this.f14845u).setCheckable(this.f14842r >= 1).setTitleCondensed(this.f14836l).setIcon(this.f14837m);
        int i7 = this.f14846v;
        if (i7 >= 0) {
            menuItem.setShowAsAction(i7);
        }
        String str = this.f14849y;
        j jVar = this.f14825E;
        if (str != null) {
            if (jVar.f14855c.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            if (jVar.f14856d == null) {
                jVar.f14856d = j.a(jVar.f14855c);
            }
            Object obj = jVar.f14856d;
            String str2 = this.f14849y;
            h hVar = new h();
            hVar.f14819a = obj;
            Class<?> cls = obj.getClass();
            try {
                hVar.f14820b = cls.getMethod(str2, h.f14818c);
                menuItem.setOnMenuItemClickListener(hVar);
            } catch (Exception e7) {
                StringBuilder sbK = k.k("Couldn't resolve menu item onClick handler ", str2, " in class ");
                sbK.append(cls.getName());
                InflateException inflateException = new InflateException(sbK.toString());
                inflateException.initCause(e7);
                throw inflateException;
            }
        }
        if (this.f14842r >= 2) {
            if (menuItem instanceof m) {
                m mVar = (m) menuItem;
                mVar.f15170O = (mVar.f15170O & (-5)) | 4;
            } else if (menuItem instanceof r) {
                r rVar = (r) menuItem;
                try {
                    Method method = rVar.f15194d;
                    a aVar = rVar.f15193c;
                    if (method == null) {
                        rVar.f15194d = aVar.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    rVar.f15194d.invoke(aVar, Boolean.TRUE);
                } catch (Exception e8) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e8);
                }
            }
        }
        String str3 = this.f14848x;
        if (str3 != null) {
            menuItem.setActionView((View) a(str3, j.f14851e, jVar.f14853a));
            z4 = true;
        }
        int i8 = this.f14847w;
        if (i8 > 0) {
            if (z4) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i8);
            }
        }
        AbstractC0347c abstractC0347c = this.f14850z;
        if (abstractC0347c != null) {
            if (menuItem instanceof a) {
                ((a) menuItem).c(abstractC0347c);
            } else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence = this.f14821A;
        boolean z7 = menuItem instanceof a;
        if (z7) {
            ((a) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0360p.h(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.f14822B;
        if (z7) {
            ((a) menuItem).setTooltipText(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0360p.m(menuItem, charSequence2);
        }
        char c3 = this.f14838n;
        int i9 = this.f14839o;
        if (z7) {
            ((a) menuItem).setAlphabeticShortcut(c3, i9);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0360p.g(menuItem, c3, i9);
        }
        char c4 = this.f14840p;
        int i10 = this.f14841q;
        if (z7) {
            ((a) menuItem).setNumericShortcut(c4, i10);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0360p.k(menuItem, c4, i10);
        }
        PorterDuff.Mode mode = this.f14824D;
        if (mode != null) {
            if (z7) {
                ((a) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                AbstractC0360p.j(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.f14823C;
        if (colorStateList != null) {
            if (z7) {
                ((a) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                AbstractC0360p.i(menuItem, colorStateList);
            }
        }
    }
}
