package l;

import a3.AbstractC0467k;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.lang.reflect.Constructor;
import m.MenuItemC2071i;

/* renamed from: l.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2038b {

    /* renamed from: A, reason: collision with root package name */
    public CharSequence f17629A;

    /* renamed from: D, reason: collision with root package name */
    public final /* synthetic */ C2039c f17632D;

    /* renamed from: a, reason: collision with root package name */
    public final Menu f17633a;

    /* renamed from: h, reason: collision with root package name */
    public boolean f17639h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f17640j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f17641k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f17642l;

    /* renamed from: m, reason: collision with root package name */
    public int f17643m;

    /* renamed from: n, reason: collision with root package name */
    public char f17644n;

    /* renamed from: o, reason: collision with root package name */
    public int f17645o;

    /* renamed from: p, reason: collision with root package name */
    public char f17646p;

    /* renamed from: q, reason: collision with root package name */
    public int f17647q;

    /* renamed from: r, reason: collision with root package name */
    public int f17648r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f17649s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f17650t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f17651u;

    /* renamed from: v, reason: collision with root package name */
    public int f17652v;

    /* renamed from: w, reason: collision with root package name */
    public int f17653w;

    /* renamed from: x, reason: collision with root package name */
    public String f17654x;

    /* renamed from: y, reason: collision with root package name */
    public String f17655y;

    /* renamed from: z, reason: collision with root package name */
    public CharSequence f17656z;

    /* renamed from: B, reason: collision with root package name */
    public ColorStateList f17630B = null;

    /* renamed from: C, reason: collision with root package name */
    public PorterDuff.Mode f17631C = null;

    /* renamed from: b, reason: collision with root package name */
    public int f17634b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f17635c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f17636d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f17637e = 0;
    public boolean f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f17638g = true;

    public C2038b(C2039c c2039c, Menu menu) {
        this.f17632D = c2039c;
        this.f17633a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.f17632D.f17660c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e3) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e3);
            return null;
        }
    }

    public final void b(MenuItem menuItem) {
        boolean z3 = false;
        menuItem.setChecked(this.f17649s).setVisible(this.f17650t).setEnabled(this.f17651u).setCheckable(this.f17648r >= 1).setTitleCondensed(this.f17642l).setIcon(this.f17643m);
        int i = this.f17652v;
        if (i >= 0) {
            menuItem.setShowAsAction(i);
        }
        String str = this.f17655y;
        C2039c c2039c = this.f17632D;
        if (str != null) {
            if (c2039c.f17660c.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            if (c2039c.f17661d == null) {
                c2039c.f17661d = C2039c.a(c2039c.f17660c);
            }
            Object obj = c2039c.f17661d;
            String str2 = this.f17655y;
            MenuItemOnMenuItemClickListenerC2037a menuItemOnMenuItemClickListenerC2037a = new MenuItemOnMenuItemClickListenerC2037a();
            menuItemOnMenuItemClickListenerC2037a.f17627a = obj;
            Class<?> cls = obj.getClass();
            try {
                menuItemOnMenuItemClickListenerC2037a.f17628b = cls.getMethod(str2, MenuItemOnMenuItemClickListenerC2037a.f17626c);
                menuItem.setOnMenuItemClickListener(menuItemOnMenuItemClickListenerC2037a);
            } catch (Exception e3) {
                StringBuilder w5 = AbstractC0467k.w("Couldn't resolve menu item onClick handler ", str2, " in class ");
                w5.append(cls.getName());
                InflateException inflateException = new InflateException(w5.toString());
                inflateException.initCause(e3);
                throw inflateException;
            }
        }
        if (this.f17648r >= 2 && (menuItem instanceof MenuItemC2071i)) {
            MenuItemC2071i menuItemC2071i = (MenuItemC2071i) menuItem;
            menuItemC2071i.f17947x = (menuItemC2071i.f17947x & (-5)) | 4;
        }
        String str3 = this.f17654x;
        if (str3 != null) {
            menuItem.setActionView((View) a(str3, C2039c.f17657e, c2039c.f17658a));
            z3 = true;
        }
        int i5 = this.f17653w;
        if (i5 > 0) {
            if (z3) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i5);
            }
        }
        CharSequence charSequence = this.f17656z;
        boolean z5 = menuItem instanceof MenuItemC2071i;
        if (z5) {
            ((MenuItemC2071i) menuItem).c(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            D0.c.h(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.f17629A;
        if (z5) {
            ((MenuItemC2071i) menuItem).e(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            D0.c.p(menuItem, charSequence2);
        }
        char c5 = this.f17644n;
        int i6 = this.f17645o;
        if (z5) {
            ((MenuItemC2071i) menuItem).setAlphabeticShortcut(c5, i6);
        } else if (Build.VERSION.SDK_INT >= 26) {
            D0.c.f(menuItem, c5, i6);
        }
        char c6 = this.f17646p;
        int i7 = this.f17647q;
        if (z5) {
            ((MenuItemC2071i) menuItem).setNumericShortcut(c6, i7);
        } else if (Build.VERSION.SDK_INT >= 26) {
            D0.c.l(menuItem, c6, i7);
        }
        PorterDuff.Mode mode = this.f17631C;
        if (mode != null) {
            if (z5) {
                ((MenuItemC2071i) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                D0.c.k(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.f17630B;
        if (colorStateList != null) {
            if (z5) {
                ((MenuItemC2071i) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                D0.c.j(menuItem, colorStateList);
            }
        }
    }
}
