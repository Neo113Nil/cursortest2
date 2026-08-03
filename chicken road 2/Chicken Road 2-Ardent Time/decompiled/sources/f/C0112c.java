package f;

/* renamed from: f.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0112c {

    /* renamed from: A, reason: collision with root package name */
    public java.lang.CharSequence f2747A;

    /* renamed from: D, reason: collision with root package name */
    public final /* synthetic */ f.C0113d f2750D;

    /* renamed from: a, reason: collision with root package name */
    public final android.view.Menu f2751a;

    /* renamed from: h, reason: collision with root package name */
    public boolean f2758h;

    /* renamed from: i, reason: collision with root package name */
    public int f2759i;

    /* renamed from: j, reason: collision with root package name */
    public int f2760j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.CharSequence f2761k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.CharSequence f2762l;

    /* renamed from: m, reason: collision with root package name */
    public int f2763m;

    /* renamed from: n, reason: collision with root package name */
    public char f2764n;

    /* renamed from: o, reason: collision with root package name */
    public int f2765o;

    /* renamed from: p, reason: collision with root package name */
    public char f2766p;

    /* renamed from: q, reason: collision with root package name */
    public int f2767q;

    /* renamed from: r, reason: collision with root package name */
    public int f2768r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f2769s;
    public boolean t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2770u;

    /* renamed from: v, reason: collision with root package name */
    public int f2771v;

    /* renamed from: w, reason: collision with root package name */
    public int f2772w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f2773x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f2774y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.CharSequence f2775z;

    /* renamed from: B, reason: collision with root package name */
    public android.content.res.ColorStateList f2748B = null;

    /* renamed from: C, reason: collision with root package name */
    public android.graphics.PorterDuff.Mode f2749C = null;

    /* renamed from: b, reason: collision with root package name */
    public int f2752b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f2753c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f2754d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f2755e = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2756f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2757g = true;

    public C0112c(f.C0113d c0113d, android.view.Menu menu) {
        this.f2750D = c0113d;
        this.f2751a = menu;
    }

    public final java.lang.Object a(java.lang.String str, java.lang.Class[] clsArr, java.lang.Object[] objArr) {
        try {
            java.lang.reflect.Constructor<?> constructor = java.lang.Class.forName(str, false, this.f2750D.f2780c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (java.lang.Exception e2) {
            android.util.Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e2);
            return null;
        }
    }

    public final void b(android.view.MenuItem menuItem) {
        boolean z2 = false;
        menuItem.setChecked(this.f2769s).setVisible(this.t).setEnabled(this.f2770u).setCheckable(this.f2768r >= 1).setTitleCondensed(this.f2762l).setIcon(this.f2763m);
        int i2 = this.f2771v;
        if (i2 >= 0) {
            menuItem.setShowAsAction(i2);
        }
        java.lang.String str = this.f2774y;
        f.C0113d c0113d = this.f2750D;
        if (str != null) {
            if (c0113d.f2780c.isRestricted()) {
                throw new java.lang.IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            if (c0113d.f2781d == null) {
                c0113d.f2781d = f.C0113d.a(c0113d.f2780c);
            }
            java.lang.Object obj = c0113d.f2781d;
            java.lang.String str2 = this.f2774y;
            f.MenuItemOnMenuItemClickListenerC0111b menuItemOnMenuItemClickListenerC0111b = new f.MenuItemOnMenuItemClickListenerC0111b();
            menuItemOnMenuItemClickListenerC0111b.f2745a = obj;
            java.lang.Class<?> cls = obj.getClass();
            try {
                menuItemOnMenuItemClickListenerC0111b.f2746b = cls.getMethod(str2, f.MenuItemOnMenuItemClickListenerC0111b.f2744c);
                menuItem.setOnMenuItemClickListener(menuItemOnMenuItemClickListenerC0111b);
            } catch (java.lang.Exception e2) {
                android.view.InflateException inflateException = new android.view.InflateException("Couldn't resolve menu item onClick handler " + str2 + " in class " + cls.getName());
                inflateException.initCause(e2);
                throw inflateException;
            }
        }
        boolean z3 = menuItem instanceof g.k;
        if (z3) {
        }
        if (this.f2768r >= 2 && z3) {
            g.k kVar = (g.k) menuItem;
            kVar.f3003x = (kVar.f3003x & (-5)) | 4;
        }
        java.lang.String str3 = this.f2773x;
        if (str3 != null) {
            menuItem.setActionView((android.view.View) a(str3, f.C0113d.f2776e, c0113d.f2778a));
            z2 = true;
        }
        int i3 = this.f2772w;
        if (i3 > 0) {
            if (z2) {
                android.util.Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i3);
            }
        }
        java.lang.CharSequence charSequence = this.f2775z;
        boolean z4 = menuItem instanceof g.k;
        if (z4) {
            ((g.k) menuItem).e(charSequence);
        } else if (android.os.Build.VERSION.SDK_INT >= 26) {
            y.AbstractC1018f.h(menuItem, charSequence);
        }
        java.lang.CharSequence charSequence2 = this.f2747A;
        if (z4) {
            ((g.k) menuItem).g(charSequence2);
        } else if (android.os.Build.VERSION.SDK_INT >= 26) {
            y.AbstractC1018f.m(menuItem, charSequence2);
        }
        char c2 = this.f2764n;
        int i4 = this.f2765o;
        if (z4) {
            ((g.k) menuItem).setAlphabeticShortcut(c2, i4);
        } else if (android.os.Build.VERSION.SDK_INT >= 26) {
            y.AbstractC1018f.g(menuItem, c2, i4);
        }
        char c3 = this.f2766p;
        int i5 = this.f2767q;
        if (z4) {
            ((g.k) menuItem).setNumericShortcut(c3, i5);
        } else if (android.os.Build.VERSION.SDK_INT >= 26) {
            y.AbstractC1018f.k(menuItem, c3, i5);
        }
        android.graphics.PorterDuff.Mode mode = this.f2749C;
        if (mode != null) {
            if (z4) {
                ((g.k) menuItem).setIconTintMode(mode);
            } else if (android.os.Build.VERSION.SDK_INT >= 26) {
                y.AbstractC1018f.j(menuItem, mode);
            }
        }
        android.content.res.ColorStateList colorStateList = this.f2748B;
        if (colorStateList != null) {
            if (z4) {
                ((g.k) menuItem).setIconTintList(colorStateList);
            } else if (android.os.Build.VERSION.SDK_INT >= 26) {
                y.AbstractC1018f.i(menuItem, colorStateList);
            }
        }
    }
}
