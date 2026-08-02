package m;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import k0.C2023c;
import n.C2138i;
import n.InterfaceC2143m;
import n1.D;

/* renamed from: m.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class MenuC2070h implements Menu {

    /* renamed from: v, reason: collision with root package name */
    public static final int[] f17904v = {1, 4, 5, 3, 2, 0};

    /* renamed from: a, reason: collision with root package name */
    public final Context f17905a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources f17906b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f17907c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f17908d;

    /* renamed from: e, reason: collision with root package name */
    public C2023c f17909e;
    public final ArrayList f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f17910g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f17911h;
    public final ArrayList i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f17912j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f17913k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f17914l;

    /* renamed from: m, reason: collision with root package name */
    public View f17915m;

    /* renamed from: t, reason: collision with root package name */
    public MenuItemC2071i f17922t;

    /* renamed from: n, reason: collision with root package name */
    public boolean f17916n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f17917o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f17918p = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f17919q = false;

    /* renamed from: r, reason: collision with root package name */
    public final ArrayList f17920r = new ArrayList();

    /* renamed from: s, reason: collision with root package name */
    public final CopyOnWriteArrayList f17921s = new CopyOnWriteArrayList();

    /* renamed from: u, reason: collision with root package name */
    public boolean f17923u = false;

    public MenuC2070h(Context context) {
        boolean z3;
        boolean z5 = false;
        this.f17905a = context;
        Resources resources = context.getResources();
        this.f17906b = resources;
        this.f = new ArrayList();
        this.f17910g = new ArrayList();
        this.f17911h = true;
        this.i = new ArrayList();
        this.f17912j = new ArrayList();
        this.f17913k = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Method method = D.f18363a;
            if (Build.VERSION.SDK_INT >= 28) {
                z3 = d1.i.q(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                z3 = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (z3) {
                z5 = true;
            }
        }
        this.f17908d = z5;
    }

    public final MenuItemC2071i a(int i, int i5, int i6, CharSequence charSequence) {
        int i7;
        int i8 = ((-65536) & i6) >> 16;
        if (i8 < 0 || i8 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i9 = (f17904v[i8] << 16) | (65535 & i6);
        MenuItemC2071i menuItemC2071i = new MenuItemC2071i(this, i, i5, i6, i9, charSequence);
        ArrayList arrayList = this.f;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i7 = 0;
                break;
            }
            if (((MenuItemC2071i) arrayList.get(size)).f17929d <= i9) {
                i7 = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i7, menuItemC2071i);
        o(true);
        return menuItemC2071i;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i5, int i6, ComponentName componentName, Intent[] intentArr, Intent intent, int i7, MenuItem[] menuItemArr) {
        int i8;
        PackageManager packageManager = this.f17905a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i7 & 1) == 0) {
            removeGroup(i);
        }
        for (int i9 = 0; i9 < size; i9++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i9);
            int i10 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i10 < 0 ? intent : intentArr[i10]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItemC2071i a5 = a(i, i5, i6, resolveInfo.loadLabel(packageManager));
            a5.setIcon(resolveInfo.loadIcon(packageManager));
            a5.f17931g = intent2;
            if (menuItemArr != null && (i8 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i8] = a5;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final void b(InterfaceC2076n interfaceC2076n, Context context) {
        this.f17921s.add(new WeakReference(interfaceC2076n));
        interfaceC2076n.f(context, this);
        this.f17913k = true;
    }

    public final void c(boolean z3) {
        if (this.f17919q) {
            return;
        }
        this.f17919q = true;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f17921s;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC2076n interfaceC2076n = (InterfaceC2076n) weakReference.get();
            if (interfaceC2076n == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                interfaceC2076n.a(this, z3);
            }
        }
        this.f17919q = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        MenuItemC2071i menuItemC2071i = this.f17922t;
        if (menuItemC2071i != null) {
            d(menuItemC2071i);
        }
        this.f.clear();
        o(true);
    }

    public final void clearHeader() {
        this.f17914l = null;
        o(false);
    }

    @Override // android.view.Menu
    public final void close() {
        c(true);
    }

    public boolean d(MenuItemC2071i menuItemC2071i) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f17921s;
        boolean z3 = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f17922t == menuItemC2071i) {
            s();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                InterfaceC2076n interfaceC2076n = (InterfaceC2076n) weakReference.get();
                if (interfaceC2076n == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z3 = interfaceC2076n.k(menuItemC2071i);
                    if (z3) {
                        break;
                    }
                }
            }
            r();
            if (z3) {
                this.f17922t = null;
            }
        }
        return z3;
    }

    public boolean e(MenuC2070h menuC2070h, MenuItem menuItem) {
        InterfaceC2143m interfaceC2143m;
        C2023c c2023c = this.f17909e;
        if (c2023c == null || (interfaceC2143m = ((ActionMenuView) c2023c.f17544l).f6736I) == null) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) ((Toolbar) ((C2138i) interfaceC2143m).f18249l).f6766Q.f18249l).iterator();
        if (!it.hasNext()) {
            return false;
        }
        ((z1.d) it.next()).getClass();
        throw null;
    }

    public boolean f(MenuItemC2071i menuItemC2071i) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f17921s;
        boolean z3 = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        s();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC2076n interfaceC2076n = (InterfaceC2076n) weakReference.get();
            if (interfaceC2076n == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                z3 = interfaceC2076n.e(menuItemC2071i);
                if (z3) {
                    break;
                }
            }
        }
        r();
        if (z3) {
            this.f17922t = menuItemC2071i;
        }
        return z3;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        MenuItem findItem;
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            MenuItemC2071i menuItemC2071i = (MenuItemC2071i) arrayList.get(i5);
            if (menuItemC2071i.f17926a == i) {
                return menuItemC2071i;
            }
            if (menuItemC2071i.hasSubMenu() && (findItem = menuItemC2071i.f17938o.findItem(i)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public final MenuItemC2071i g(int i, KeyEvent keyEvent) {
        ArrayList arrayList = this.f17920r;
        arrayList.clear();
        h(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (MenuItemC2071i) arrayList.get(0);
        }
        boolean m5 = m();
        for (int i5 = 0; i5 < size; i5++) {
            MenuItemC2071i menuItemC2071i = (MenuItemC2071i) arrayList.get(i5);
            char c5 = m5 ? menuItemC2071i.f17933j : menuItemC2071i.f17932h;
            char[] cArr = keyData.meta;
            if ((c5 == cArr[0] && (metaState & 2) == 0) || ((c5 == cArr[2] && (metaState & 2) != 0) || (m5 && c5 == '\b' && i == 67))) {
                return menuItemC2071i;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return (MenuItem) this.f.get(i);
    }

    public final void h(ArrayList arrayList, int i, KeyEvent keyEvent) {
        boolean m5 = m();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            ArrayList arrayList2 = this.f;
            int size = arrayList2.size();
            for (int i5 = 0; i5 < size; i5++) {
                MenuItemC2071i menuItemC2071i = (MenuItemC2071i) arrayList2.get(i5);
                if (menuItemC2071i.hasSubMenu()) {
                    menuItemC2071i.f17938o.h(arrayList, i, keyEvent);
                }
                char c5 = m5 ? menuItemC2071i.f17933j : menuItemC2071i.f17932h;
                if ((modifiers & 69647) == ((m5 ? menuItemC2071i.f17934k : menuItemC2071i.i) & 69647) && c5 != 0) {
                    char[] cArr = keyData.meta;
                    if ((c5 == cArr[0] || c5 == cArr[2] || (m5 && c5 == '\b' && i == 67)) && menuItemC2071i.isEnabled()) {
                        arrayList.add(menuItemC2071i);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((MenuItemC2071i) arrayList.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        ArrayList k5 = k();
        if (this.f17913k) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.f17921s;
            Iterator it = copyOnWriteArrayList.iterator();
            boolean z3 = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                InterfaceC2076n interfaceC2076n = (InterfaceC2076n) weakReference.get();
                if (interfaceC2076n == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z3 |= interfaceC2076n.g();
                }
            }
            ArrayList arrayList = this.i;
            ArrayList arrayList2 = this.f17912j;
            if (z3) {
                arrayList.clear();
                arrayList2.clear();
                int size = k5.size();
                for (int i = 0; i < size; i++) {
                    MenuItemC2071i menuItemC2071i = (MenuItemC2071i) k5.get(i);
                    if ((menuItemC2071i.f17947x & 32) == 32) {
                        arrayList.add(menuItemC2071i);
                    } else {
                        arrayList2.add(menuItemC2071i);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(k());
            }
            this.f17913k = false;
        }
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return g(i, keyEvent) != null;
    }

    public final ArrayList k() {
        boolean z3 = this.f17911h;
        ArrayList arrayList = this.f17910g;
        if (!z3) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            MenuItemC2071i menuItemC2071i = (MenuItemC2071i) arrayList2.get(i);
            if (menuItemC2071i.isVisible()) {
                arrayList.add(menuItemC2071i);
            }
        }
        this.f17911h = false;
        this.f17913k = true;
        return arrayList;
    }

    public boolean l() {
        return this.f17923u;
    }

    public boolean m() {
        return this.f17907c;
    }

    public boolean n() {
        return this.f17908d;
    }

    public final void o(boolean z3) {
        if (this.f17916n) {
            this.f17917o = true;
            if (z3) {
                this.f17918p = true;
                return;
            }
            return;
        }
        if (z3) {
            this.f17911h = true;
            this.f17913k = true;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.f17921s;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        s();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC2076n interfaceC2076n = (InterfaceC2076n) weakReference.get();
            if (interfaceC2076n == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                interfaceC2076n.c();
            }
        }
        r();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean p(MenuItem menuItem, AbstractC2072j abstractC2072j, int i) {
        boolean z3;
        MenuItemC2071i menuItemC2071i = (MenuItemC2071i) menuItem;
        if (menuItemC2071i == null || !menuItemC2071i.isEnabled()) {
            return false;
        }
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = menuItemC2071i.f17939p;
        if (onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(menuItemC2071i)) {
            MenuC2070h menuC2070h = menuItemC2071i.f17937n;
            if (!menuC2070h.e(menuC2070h, menuItemC2071i)) {
                Intent intent = menuItemC2071i.f17931g;
                if (intent != null) {
                    try {
                        menuC2070h.f17905a.startActivity(intent);
                    } catch (ActivityNotFoundException e3) {
                        Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e3);
                    }
                }
                z3 = false;
                if ((menuItemC2071i.f17948y & 8) == 0 && menuItemC2071i.f17949z != null) {
                    z3 |= menuItemC2071i.expandActionView();
                    if (z3) {
                        c(true);
                    }
                } else if (!menuItemC2071i.hasSubMenu()) {
                    if ((i & 4) == 0) {
                        c(false);
                    }
                    if (!menuItemC2071i.hasSubMenu()) {
                        SubMenuC2080r subMenuC2080r = new SubMenuC2080r(this.f17905a, this, menuItemC2071i);
                        menuItemC2071i.f17938o = subMenuC2080r;
                        subMenuC2080r.setHeaderTitle(menuItemC2071i.f17930e);
                    }
                    SubMenuC2080r subMenuC2080r2 = menuItemC2071i.f17938o;
                    CopyOnWriteArrayList copyOnWriteArrayList = this.f17921s;
                    if (!copyOnWriteArrayList.isEmpty()) {
                        r0 = abstractC2072j != null ? abstractC2072j.h(subMenuC2080r2) : false;
                        Iterator it = copyOnWriteArrayList.iterator();
                        while (it.hasNext()) {
                            WeakReference weakReference = (WeakReference) it.next();
                            InterfaceC2076n interfaceC2076n = (InterfaceC2076n) weakReference.get();
                            if (interfaceC2076n == null) {
                                copyOnWriteArrayList.remove(weakReference);
                            } else if (!r0) {
                                r0 = interfaceC2076n.h(subMenuC2080r2);
                            }
                        }
                    }
                    z3 |= r0;
                    if (!z3) {
                        c(true);
                    }
                } else if ((i & 1) == 0) {
                    c(true);
                }
                return z3;
            }
        }
        z3 = true;
        if ((menuItemC2071i.f17948y & 8) == 0) {
        }
        if (!menuItemC2071i.hasSubMenu()) {
        }
        return z3;
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i5) {
        return p(findItem(i), null, i5);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i5) {
        MenuItemC2071i g5 = g(i, keyEvent);
        boolean p5 = g5 != null ? p(g5, null, i5) : false;
        if ((i5 & 2) != 0) {
            c(true);
        }
        return p5;
    }

    public final void q(int i, CharSequence charSequence, int i5, View view) {
        if (view != null) {
            this.f17915m = view;
            this.f17914l = null;
        } else {
            if (i > 0) {
                this.f17914l = this.f17906b.getText(i);
            } else if (charSequence != null) {
                this.f17914l = charSequence;
            }
            if (i5 > 0) {
                this.f17905a.getDrawable(i5);
            }
        }
        o(false);
    }

    public final void r() {
        this.f17916n = false;
        if (this.f17917o) {
            this.f17917o = false;
            o(this.f17918p);
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        int i5 = 0;
        int i6 = 0;
        while (true) {
            if (i6 >= size) {
                i6 = -1;
                break;
            } else if (((MenuItemC2071i) arrayList.get(i6)).f17927b == i) {
                break;
            } else {
                i6++;
            }
        }
        if (i6 >= 0) {
            int size2 = arrayList.size() - i6;
            while (true) {
                int i7 = i5 + 1;
                if (i5 >= size2 || ((MenuItemC2071i) arrayList.get(i6)).f17927b != i) {
                    break;
                }
                if (i6 >= 0) {
                    ArrayList arrayList2 = this.f;
                    if (i6 < arrayList2.size()) {
                        arrayList2.remove(i6);
                    }
                }
                i5 = i7;
            }
            o(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size) {
                i5 = -1;
                break;
            } else if (((MenuItemC2071i) arrayList.get(i5)).f17926a == i) {
                break;
            } else {
                i5++;
            }
        }
        if (i5 >= 0) {
            ArrayList arrayList2 = this.f;
            if (i5 >= arrayList2.size()) {
                return;
            }
            arrayList2.remove(i5);
            o(true);
        }
    }

    public final void s() {
        if (this.f17916n) {
            return;
        }
        this.f17916n = true;
        this.f17917o = false;
        this.f17918p = false;
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z3, boolean z5) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            MenuItemC2071i menuItemC2071i = (MenuItemC2071i) arrayList.get(i5);
            if (menuItemC2071i.f17927b == i) {
                menuItemC2071i.f17947x = (menuItemC2071i.f17947x & (-5)) | (z5 ? 4 : 0);
                menuItemC2071i.setCheckable(z3);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z3) {
        this.f17923u = z3;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z3) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            MenuItemC2071i menuItemC2071i = (MenuItemC2071i) arrayList.get(i5);
            if (menuItemC2071i.f17927b == i) {
                menuItemC2071i.setEnabled(z3);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z3) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        boolean z5 = false;
        for (int i5 = 0; i5 < size; i5++) {
            MenuItemC2071i menuItemC2071i = (MenuItemC2071i) arrayList.get(i5);
            if (menuItemC2071i.f17927b == i) {
                int i6 = menuItemC2071i.f17947x;
                int i7 = (i6 & (-9)) | (z3 ? 0 : 8);
                menuItemC2071i.f17947x = i7;
                if (i6 != i7) {
                    z5 = true;
                }
            }
        }
        if (z5) {
            o(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z3) {
        this.f17907c = z3;
        o(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f.size();
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return a(0, 0, 0, this.f17906b.getString(i));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.f17906b.getString(i));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i5, int i6, CharSequence charSequence) {
        return a(i, i5, i6, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i5, int i6, CharSequence charSequence) {
        MenuItemC2071i a5 = a(i, i5, i6, charSequence);
        SubMenuC2080r subMenuC2080r = new SubMenuC2080r(this.f17905a, this, a5);
        a5.f17938o = subMenuC2080r;
        subMenuC2080r.setHeaderTitle(a5.f17930e);
        return subMenuC2080r;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i5, int i6, int i7) {
        return a(i, i5, i6, this.f17906b.getString(i7));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i5, int i6, int i7) {
        return addSubMenu(i, i5, i6, this.f17906b.getString(i7));
    }

    public MenuC2070h j() {
        return this;
    }
}
