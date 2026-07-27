package j;

import D.AbstractC0005f;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.lang.reflect.Constructor;
import k.MenuItemC1070k;

/* renamed from: j.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1052c {

    /* renamed from: A, reason: collision with root package name */
    public CharSequence f9473A;

    /* renamed from: D, reason: collision with root package name */
    public final /* synthetic */ d f9476D;

    /* renamed from: a, reason: collision with root package name */
    public final Menu f9477a;

    /* renamed from: h, reason: collision with root package name */
    public boolean f9483h;

    /* renamed from: i, reason: collision with root package name */
    public int f9484i;

    /* renamed from: j, reason: collision with root package name */
    public int f9485j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f9486k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f9487l;

    /* renamed from: m, reason: collision with root package name */
    public int f9488m;

    /* renamed from: n, reason: collision with root package name */
    public char f9489n;

    /* renamed from: o, reason: collision with root package name */
    public int f9490o;

    /* renamed from: p, reason: collision with root package name */
    public char f9491p;

    /* renamed from: q, reason: collision with root package name */
    public int f9492q;

    /* renamed from: r, reason: collision with root package name */
    public int f9493r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f9494s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f9495t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f9496u;

    /* renamed from: v, reason: collision with root package name */
    public int f9497v;

    /* renamed from: w, reason: collision with root package name */
    public int f9498w;

    /* renamed from: x, reason: collision with root package name */
    public String f9499x;
    public String y;

    /* renamed from: z, reason: collision with root package name */
    public CharSequence f9500z;

    /* renamed from: B, reason: collision with root package name */
    public ColorStateList f9474B = null;

    /* renamed from: C, reason: collision with root package name */
    public PorterDuff.Mode f9475C = null;

    /* renamed from: b, reason: collision with root package name */
    public int f9478b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f9479c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f9480d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f9481e = 0;
    public boolean f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f9482g = true;

    public C1052c(d dVar, Menu menu) {
        this.f9476D = dVar;
        this.f9477a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.f9476D.f9504c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e3) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e3);
            return null;
        }
    }

    public final void b(MenuItem menuItem) {
        boolean z3 = false;
        menuItem.setChecked(this.f9494s).setVisible(this.f9495t).setEnabled(this.f9496u).setCheckable(this.f9493r >= 1).setTitleCondensed(this.f9487l).setIcon(this.f9488m);
        int i3 = this.f9497v;
        if (i3 >= 0) {
            menuItem.setShowAsAction(i3);
        }
        String str = this.y;
        d dVar = this.f9476D;
        if (str != null) {
            if (dVar.f9504c.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            if (dVar.f9505d == null) {
                dVar.f9505d = d.a(dVar.f9504c);
            }
            Object obj = dVar.f9505d;
            String str2 = this.y;
            MenuItemOnMenuItemClickListenerC1051b menuItemOnMenuItemClickListenerC1051b = new MenuItemOnMenuItemClickListenerC1051b();
            menuItemOnMenuItemClickListenerC1051b.f9471a = obj;
            Class<?> cls = obj.getClass();
            try {
                menuItemOnMenuItemClickListenerC1051b.f9472b = cls.getMethod(str2, MenuItemOnMenuItemClickListenerC1051b.f9470c);
                menuItem.setOnMenuItemClickListener(menuItemOnMenuItemClickListenerC1051b);
            } catch (Exception e3) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str2 + " in class " + cls.getName());
                inflateException.initCause(e3);
                throw inflateException;
            }
        }
        boolean z4 = menuItem instanceof MenuItemC1070k;
        if (z4) {
        }
        if (this.f9493r >= 2 && z4) {
            MenuItemC1070k menuItemC1070k = (MenuItemC1070k) menuItem;
            menuItemC1070k.f9623x = (menuItemC1070k.f9623x & (-5)) | 4;
        }
        String str3 = this.f9499x;
        if (str3 != null) {
            menuItem.setActionView((View) a(str3, d.f9501e, dVar.f9502a));
            z3 = true;
        }
        int i4 = this.f9498w;
        if (i4 > 0) {
            if (z3) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i4);
            }
        }
        CharSequence charSequence = this.f9500z;
        boolean z5 = menuItem instanceof MenuItemC1070k;
        if (z5) {
            ((MenuItemC1070k) menuItem).c(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0005f.h(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.f9473A;
        if (z5) {
            ((MenuItemC1070k) menuItem).e(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0005f.m(menuItem, charSequence2);
        }
        char c3 = this.f9489n;
        int i5 = this.f9490o;
        if (z5) {
            ((MenuItemC1070k) menuItem).setAlphabeticShortcut(c3, i5);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0005f.g(menuItem, c3, i5);
        }
        char c4 = this.f9491p;
        int i6 = this.f9492q;
        if (z5) {
            ((MenuItemC1070k) menuItem).setNumericShortcut(c4, i6);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0005f.k(menuItem, c4, i6);
        }
        PorterDuff.Mode mode = this.f9475C;
        if (mode != null) {
            if (z5) {
                ((MenuItemC1070k) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                AbstractC0005f.j(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.f9474B;
        if (colorStateList != null) {
            if (z5) {
                ((MenuItemC1070k) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                AbstractC0005f.i(menuItem, colorStateList);
            }
        }
    }
}
