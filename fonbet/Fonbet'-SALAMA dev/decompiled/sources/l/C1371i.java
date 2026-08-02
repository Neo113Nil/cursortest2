package l;

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
import m.r;

/* renamed from: l.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1371i {

    /* renamed from: A, reason: collision with root package name */
    public CharSequence f14815A;

    /* renamed from: B, reason: collision with root package name */
    public CharSequence f14816B;

    /* renamed from: E, reason: collision with root package name */
    public final /* synthetic */ C1372j f14819E;

    /* renamed from: a, reason: collision with root package name */
    public final Menu f14820a;

    /* renamed from: h, reason: collision with root package name */
    public boolean f14827h;

    /* renamed from: i, reason: collision with root package name */
    public int f14828i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f14829k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f14830l;

    /* renamed from: m, reason: collision with root package name */
    public int f14831m;

    /* renamed from: n, reason: collision with root package name */
    public char f14832n;

    /* renamed from: o, reason: collision with root package name */
    public int f14833o;

    /* renamed from: p, reason: collision with root package name */
    public char f14834p;

    /* renamed from: q, reason: collision with root package name */
    public int f14835q;

    /* renamed from: r, reason: collision with root package name */
    public int f14836r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f14837s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f14838t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f14839u;

    /* renamed from: v, reason: collision with root package name */
    public int f14840v;

    /* renamed from: w, reason: collision with root package name */
    public int f14841w;

    /* renamed from: x, reason: collision with root package name */
    public String f14842x;

    /* renamed from: y, reason: collision with root package name */
    public String f14843y;

    /* renamed from: z, reason: collision with root package name */
    public AbstractC0347c f14844z;

    /* renamed from: C, reason: collision with root package name */
    public ColorStateList f14817C = null;

    /* renamed from: D, reason: collision with root package name */
    public PorterDuff.Mode f14818D = null;

    /* renamed from: b, reason: collision with root package name */
    public int f14821b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f14822c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f14823d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f14824e = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f14825f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f14826g = true;

    public C1371i(C1372j c1372j, Menu menu) {
        this.f14819E = c1372j;
        this.f14820a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.f14819E.f14849c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e7) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e7);
            return null;
        }
    }

    public final void b(MenuItem menuItem) {
        boolean z4 = false;
        menuItem.setChecked(this.f14837s).setVisible(this.f14838t).setEnabled(this.f14839u).setCheckable(this.f14836r >= 1).setTitleCondensed(this.f14830l).setIcon(this.f14831m);
        int i7 = this.f14840v;
        if (i7 >= 0) {
            menuItem.setShowAsAction(i7);
        }
        String str = this.f14843y;
        C1372j c1372j = this.f14819E;
        if (str != null) {
            if (c1372j.f14849c.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            if (c1372j.f14850d == null) {
                c1372j.f14850d = C1372j.a(c1372j.f14849c);
            }
            Object obj = c1372j.f14850d;
            String str2 = this.f14843y;
            MenuItemOnMenuItemClickListenerC1370h menuItemOnMenuItemClickListenerC1370h = new MenuItemOnMenuItemClickListenerC1370h();
            menuItemOnMenuItemClickListenerC1370h.f14813a = obj;
            Class<?> cls = obj.getClass();
            try {
                menuItemOnMenuItemClickListenerC1370h.f14814b = cls.getMethod(str2, MenuItemOnMenuItemClickListenerC1370h.f14812c);
                menuItem.setOnMenuItemClickListener(menuItemOnMenuItemClickListenerC1370h);
            } catch (Exception e7) {
                StringBuilder k7 = e1.k.k("Couldn't resolve menu item onClick handler ", str2, " in class ");
                k7.append(cls.getName());
                InflateException inflateException = new InflateException(k7.toString());
                inflateException.initCause(e7);
                throw inflateException;
            }
        }
        if (this.f14836r >= 2) {
            if (menuItem instanceof m.m) {
                m.m mVar = (m.m) menuItem;
                mVar.f15164O = (mVar.f15164O & (-5)) | 4;
            } else if (menuItem instanceof r) {
                r rVar = (r) menuItem;
                try {
                    Method method = rVar.f15188d;
                    K.a aVar = rVar.f15187c;
                    if (method == null) {
                        rVar.f15188d = aVar.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    rVar.f15188d.invoke(aVar, Boolean.TRUE);
                } catch (Exception e8) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e8);
                }
            }
        }
        String str3 = this.f14842x;
        if (str3 != null) {
            menuItem.setActionView((View) a(str3, C1372j.f14845e, c1372j.f14847a));
            z4 = true;
        }
        int i8 = this.f14841w;
        if (i8 > 0) {
            if (z4) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i8);
            }
        }
        AbstractC0347c abstractC0347c = this.f14844z;
        if (abstractC0347c != null) {
            if (menuItem instanceof K.a) {
                ((K.a) menuItem).c(abstractC0347c);
            } else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence = this.f14815A;
        boolean z7 = menuItem instanceof K.a;
        if (z7) {
            ((K.a) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0360p.h(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.f14816B;
        if (z7) {
            ((K.a) menuItem).setTooltipText(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0360p.m(menuItem, charSequence2);
        }
        char c3 = this.f14832n;
        int i9 = this.f14833o;
        if (z7) {
            ((K.a) menuItem).setAlphabeticShortcut(c3, i9);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0360p.g(menuItem, c3, i9);
        }
        char c4 = this.f14834p;
        int i10 = this.f14835q;
        if (z7) {
            ((K.a) menuItem).setNumericShortcut(c4, i10);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0360p.k(menuItem, c4, i10);
        }
        PorterDuff.Mode mode = this.f14818D;
        if (mode != null) {
            if (z7) {
                ((K.a) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                AbstractC0360p.j(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.f14817C;
        if (colorStateList != null) {
            if (z7) {
                ((K.a) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                AbstractC0360p.i(menuItem, colorStateList);
            }
        }
    }
}
