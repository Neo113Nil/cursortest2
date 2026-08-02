package androidx.appcompat.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.H;
import androidx.appcompat.widget.b0;
import androidx.core.view.AbstractC5307b;
import androidx.core.view.C5346v;
import g.C6594f;
import i.C6977a;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParserException;
import s2.InterfaceMenuC9584a;
import s2.InterfaceMenuItemC9585b;

/* loaded from: classes8.dex */
public final class g extends MenuInflater {

    /* renamed from: e, reason: collision with root package name */
    static final Class<?>[] f37269e;

    /* renamed from: f, reason: collision with root package name */
    static final Class<?>[] f37270f;

    /* renamed from: a, reason: collision with root package name */
    final Object[] f37271a;

    /* renamed from: b, reason: collision with root package name */
    final Object[] f37272b;

    /* renamed from: c, reason: collision with root package name */
    Context f37273c;

    /* renamed from: d, reason: collision with root package name */
    private Object f37274d;

    private static class a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: c, reason: collision with root package name */
        private static final Class<?>[] f37275c = {MenuItem.class};

        /* renamed from: a, reason: collision with root package name */
        private Object f37276a;

        /* renamed from: b, reason: collision with root package name */
        private Method f37277b;

        public a(Object obj, String str) {
            this.f37276a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f37277b = cls.getMethod(str, f37275c);
            } catch (Exception e11) {
                StringBuilder b11 = C6594f.b("Couldn't resolve menu item onClick handler ", str, " in class ");
                b11.append(cls.getName());
                InflateException inflateException = new InflateException(b11.toString());
                inflateException.initCause(e11);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public final boolean onMenuItemClick(MenuItem menuItem) {
            Method method = this.f37277b;
            try {
                Class<?> returnType = method.getReturnType();
                Class<?> cls = Boolean.TYPE;
                Object obj = this.f37276a;
                if (returnType == cls) {
                    return ((Boolean) method.invoke(obj, menuItem)).booleanValue();
                }
                method.invoke(obj, menuItem);
                return true;
            } catch (Exception e11) {
                throw new RuntimeException(e11);
            }
        }
    }

    private class b {

        /* renamed from: A, reason: collision with root package name */
        private CharSequence f37278A;

        /* renamed from: B, reason: collision with root package name */
        private CharSequence f37279B;

        /* renamed from: C, reason: collision with root package name */
        private ColorStateList f37280C = null;

        /* renamed from: D, reason: collision with root package name */
        private PorterDuff.Mode f37281D = null;

        /* renamed from: a, reason: collision with root package name */
        private Menu f37283a;

        /* renamed from: b, reason: collision with root package name */
        private int f37284b;

        /* renamed from: c, reason: collision with root package name */
        private int f37285c;

        /* renamed from: d, reason: collision with root package name */
        private int f37286d;

        /* renamed from: e, reason: collision with root package name */
        private int f37287e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f37288f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f37289g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f37290h;

        /* renamed from: i, reason: collision with root package name */
        private int f37291i;

        /* renamed from: j, reason: collision with root package name */
        private int f37292j;

        /* renamed from: k, reason: collision with root package name */
        private CharSequence f37293k;

        /* renamed from: l, reason: collision with root package name */
        private CharSequence f37294l;

        /* renamed from: m, reason: collision with root package name */
        private int f37295m;

        /* renamed from: n, reason: collision with root package name */
        private char f37296n;

        /* renamed from: o, reason: collision with root package name */
        private int f37297o;

        /* renamed from: p, reason: collision with root package name */
        private char f37298p;

        /* renamed from: q, reason: collision with root package name */
        private int f37299q;

        /* renamed from: r, reason: collision with root package name */
        private int f37300r;

        /* renamed from: s, reason: collision with root package name */
        private boolean f37301s;

        /* renamed from: t, reason: collision with root package name */
        private boolean f37302t;

        /* renamed from: u, reason: collision with root package name */
        private boolean f37303u;

        /* renamed from: v, reason: collision with root package name */
        private int f37304v;

        /* renamed from: w, reason: collision with root package name */
        private int f37305w;

        /* renamed from: x, reason: collision with root package name */
        private String f37306x;

        /* renamed from: y, reason: collision with root package name */
        private String f37307y;

        /* renamed from: z, reason: collision with root package name */
        AbstractC5307b f37308z;

        public b(Menu menu) {
            this.f37283a = menu;
            g();
        }

        private <T> T d(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, g.this.f37273c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception e11) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e11);
                return null;
            }
        }

        private void h(MenuItem menuItem) {
            boolean z11 = false;
            menuItem.setChecked(this.f37301s).setVisible(this.f37302t).setEnabled(this.f37303u).setCheckable(this.f37300r >= 1).setTitleCondensed(this.f37294l).setIcon(this.f37295m);
            int i11 = this.f37304v;
            if (i11 >= 0) {
                menuItem.setShowAsAction(i11);
            }
            String str = this.f37307y;
            g gVar = g.this;
            if (str != null) {
                if (gVar.f37273c.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                menuItem.setOnMenuItemClickListener(new a(gVar.b(), this.f37307y));
            }
            if (this.f37300r >= 2) {
                if (menuItem instanceof androidx.appcompat.view.menu.i) {
                    ((androidx.appcompat.view.menu.i) menuItem).q(true);
                } else if (menuItem instanceof j) {
                    ((j) menuItem).h();
                }
            }
            String str2 = this.f37306x;
            if (str2 != null) {
                menuItem.setActionView((View) d(str2, g.f37269e, gVar.f37271a));
                z11 = true;
            }
            int i12 = this.f37305w;
            if (i12 > 0) {
                if (z11) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                } else {
                    menuItem.setActionView(i12);
                }
            }
            AbstractC5307b abstractC5307b = this.f37308z;
            if (abstractC5307b != null) {
                if (menuItem instanceof InterfaceMenuItemC9585b) {
                    ((InterfaceMenuItemC9585b) menuItem).b(abstractC5307b);
                } else {
                    Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
                }
            }
            C5346v.b(menuItem, this.f37278A);
            C5346v.f(menuItem, this.f37279B);
            C5346v.a(menuItem, this.f37296n, this.f37297o);
            C5346v.e(menuItem, this.f37298p, this.f37299q);
            PorterDuff.Mode mode = this.f37281D;
            if (mode != null) {
                C5346v.d(menuItem, mode);
            }
            ColorStateList colorStateList = this.f37280C;
            if (colorStateList != null) {
                C5346v.c(menuItem, colorStateList);
            }
        }

        public final void a() {
            this.f37290h = true;
            h(this.f37283a.add(this.f37284b, this.f37291i, this.f37292j, this.f37293k));
        }

        public final SubMenu b() {
            this.f37290h = true;
            SubMenu addSubMenu = this.f37283a.addSubMenu(this.f37284b, this.f37291i, this.f37292j, this.f37293k);
            h(addSubMenu.getItem());
            return addSubMenu;
        }

        public final boolean c() {
            return this.f37290h;
        }

        public final void e(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = g.this.f37273c.obtainStyledAttributes(attributeSet, C6977a.f65662p);
            this.f37284b = obtainStyledAttributes.getResourceId(1, 0);
            this.f37285c = obtainStyledAttributes.getInt(3, 0);
            this.f37286d = obtainStyledAttributes.getInt(4, 0);
            this.f37287e = obtainStyledAttributes.getInt(5, 0);
            this.f37288f = obtainStyledAttributes.getBoolean(2, true);
            this.f37289g = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        }

        public final void f(AttributeSet attributeSet) {
            g gVar = g.this;
            b0 u11 = b0.u(gVar.f37273c, attributeSet, C6977a.f65663q);
            this.f37291i = u11.n(2, 0);
            this.f37292j = (u11.k(5, this.f37285c) & (-65536)) | (u11.k(6, this.f37286d) & 65535);
            this.f37293k = u11.p(7);
            this.f37294l = u11.p(8);
            this.f37295m = u11.n(0, 0);
            String o11 = u11.o(9);
            this.f37296n = o11 == null ? (char) 0 : o11.charAt(0);
            this.f37297o = u11.k(16, 4096);
            String o12 = u11.o(10);
            this.f37298p = o12 == null ? (char) 0 : o12.charAt(0);
            this.f37299q = u11.k(20, 4096);
            if (u11.s(11)) {
                this.f37300r = u11.a(11, false) ? 1 : 0;
            } else {
                this.f37300r = this.f37287e;
            }
            this.f37301s = u11.a(3, false);
            this.f37302t = u11.a(4, this.f37288f);
            this.f37303u = u11.a(1, this.f37289g);
            this.f37304v = u11.k(21, -1);
            this.f37307y = u11.o(12);
            this.f37305w = u11.n(13, 0);
            this.f37306x = u11.o(15);
            String o13 = u11.o(14);
            boolean z11 = o13 != null;
            if (z11 && this.f37305w == 0 && this.f37306x == null) {
                this.f37308z = (AbstractC5307b) d(o13, g.f37270f, gVar.f37272b);
            } else {
                if (z11) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.f37308z = null;
            }
            this.f37278A = u11.p(17);
            this.f37279B = u11.p(22);
            if (u11.s(19)) {
                this.f37281D = H.c(u11.k(19, -1), this.f37281D);
            } else {
                this.f37281D = null;
            }
            if (u11.s(18)) {
                this.f37280C = u11.c(18);
            } else {
                this.f37280C = null;
            }
            u11.x();
            this.f37290h = false;
        }

        public final void g() {
            this.f37284b = 0;
            this.f37285c = 0;
            this.f37286d = 0;
            this.f37287e = 0;
            this.f37288f = true;
            this.f37289g = true;
        }
    }

    static {
        Class<?>[] clsArr = {Context.class};
        f37269e = clsArr;
        f37270f = clsArr;
    }

    public g(Context context) {
        super(context);
        this.f37273c = context;
        Object[] objArr = {context};
        this.f37271a = objArr;
        this.f37272b = objArr;
    }

    private static Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    private void c(XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        b bVar = new b(menu);
        int eventType = xmlResourceParser.getEventType();
        while (true) {
            if (eventType == 2) {
                String name = xmlResourceParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
                eventType = xmlResourceParser.next();
            } else {
                eventType = xmlResourceParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        boolean z11 = false;
        boolean z12 = false;
        String str = null;
        while (!z11) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != 2) {
                if (eventType == 3) {
                    String name2 = xmlResourceParser.getName();
                    if (z12 && name2.equals(str)) {
                        z12 = false;
                        str = null;
                    } else if (name2.equals("group")) {
                        bVar.g();
                    } else if (name2.equals("item")) {
                        if (!bVar.c()) {
                            AbstractC5307b abstractC5307b = bVar.f37308z;
                            if (abstractC5307b == null || !abstractC5307b.a()) {
                                bVar.a();
                            } else {
                                bVar.b();
                            }
                        }
                    } else if (name2.equals("menu")) {
                        z11 = true;
                    }
                }
            } else if (!z12) {
                String name3 = xmlResourceParser.getName();
                if (name3.equals("group")) {
                    bVar.e(attributeSet);
                } else if (name3.equals("item")) {
                    bVar.f(attributeSet);
                } else if (name3.equals("menu")) {
                    c(xmlResourceParser, attributeSet, bVar.b());
                } else {
                    str = name3;
                    z12 = true;
                }
            }
            eventType = xmlResourceParser.next();
        }
    }

    final Object b() {
        if (this.f37274d == null) {
            this.f37274d = a(this.f37273c);
        }
        return this.f37274d;
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i11, Menu menu) {
        if (!(menu instanceof InterfaceMenuC9584a)) {
            super.inflate(i11, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        boolean z11 = false;
        try {
            try {
                xmlResourceParser = this.f37273c.getResources().getLayout(i11);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
                if (menu instanceof androidx.appcompat.view.menu.g) {
                    androidx.appcompat.view.menu.g gVar = (androidx.appcompat.view.menu.g) menu;
                    if (gVar.s()) {
                        gVar.Q();
                        z11 = true;
                    }
                }
                c(xmlResourceParser, asAttributeSet, menu);
                if (z11) {
                    ((androidx.appcompat.view.menu.g) menu).P();
                }
                xmlResourceParser.close();
            } catch (IOException e11) {
                throw new InflateException("Error inflating menu XML", e11);
            } catch (XmlPullParserException e12) {
                throw new InflateException("Error inflating menu XML", e12);
            }
        } catch (Throwable th2) {
            if (z11) {
                ((androidx.appcompat.view.menu.g) menu).P();
            }
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th2;
        }
    }
}
