package k;

import D.B;
import D.D;
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
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import l.InterfaceC1093l;
import t.AbstractC1206a;

/* renamed from: k.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class MenuC1069j implements Menu {

    /* renamed from: v, reason: collision with root package name */
    public static final int[] f9578v = {1, 4, 5, 3, 2, 0};

    /* renamed from: a, reason: collision with root package name */
    public final Context f9579a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources f9580b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f9581c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f9582d;

    /* renamed from: e, reason: collision with root package name */
    public b0.j f9583e;
    public final ArrayList f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f9584g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f9585h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f9586i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f9587j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f9588k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f9589l;

    /* renamed from: m, reason: collision with root package name */
    public View f9590m;

    /* renamed from: t, reason: collision with root package name */
    public MenuItemC1070k f9597t;

    /* renamed from: n, reason: collision with root package name */
    public boolean f9591n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f9592o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f9593p = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f9594q = false;

    /* renamed from: r, reason: collision with root package name */
    public final ArrayList f9595r = new ArrayList();

    /* renamed from: s, reason: collision with root package name */
    public final CopyOnWriteArrayList f9596s = new CopyOnWriteArrayList();

    /* renamed from: u, reason: collision with root package name */
    public boolean f9598u = false;

    public MenuC1069j(Context context) {
        boolean z3;
        boolean z4 = false;
        this.f9579a = context;
        Resources resources = context.getResources();
        this.f9580b = resources;
        this.f = new ArrayList();
        this.f9584g = new ArrayList();
        this.f9585h = true;
        this.f9586i = new ArrayList();
        this.f9587j = new ArrayList();
        this.f9588k = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Method method = D.f196a;
            if (Build.VERSION.SDK_INT >= 28) {
                z3 = B.b(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", ConstantDeviceInfo.APP_PLATFORM);
                z3 = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (z3) {
                z4 = true;
            }
        }
        this.f9582d = z4;
    }

    public final MenuItemC1070k a(int i3, int i4, int i5, CharSequence charSequence) {
        int i6;
        int i7 = ((-65536) & i5) >> 16;
        if (i7 < 0 || i7 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i8 = (f9578v[i7] << 16) | (65535 & i5);
        MenuItemC1070k menuItemC1070k = new MenuItemC1070k(this, i3, i4, i5, i8, charSequence);
        ArrayList arrayList = this.f;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i6 = 0;
                break;
            }
            if (((MenuItemC1070k) arrayList.get(size)).f9604d <= i8) {
                i6 = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i6, menuItemC1070k);
        o(true);
        return menuItemC1070k;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i3, int i4, int i5, ComponentName componentName, Intent[] intentArr, Intent intent, int i6, MenuItem[] menuItemArr) {
        int i7;
        PackageManager packageManager = this.f9579a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i6 & 1) == 0) {
            removeGroup(i3);
        }
        for (int i8 = 0; i8 < size; i8++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i8);
            int i9 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i9 < 0 ? intent : intentArr[i9]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItemC1070k a3 = a(i3, i4, i5, resolveInfo.loadLabel(packageManager));
            a3.setIcon(resolveInfo.loadIcon(packageManager));
            a3.f9606g = intent2;
            if (menuItemArr != null && (i7 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i7] = a3;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final void b(InterfaceC1075p interfaceC1075p, Context context) {
        this.f9596s.add(new WeakReference(interfaceC1075p));
        interfaceC1075p.i(context, this);
        this.f9588k = true;
    }

    public final void c(boolean z3) {
        if (this.f9594q) {
            return;
        }
        this.f9594q = true;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f9596s;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC1075p interfaceC1075p = (InterfaceC1075p) weakReference.get();
            if (interfaceC1075p == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                interfaceC1075p.a(this, z3);
            }
        }
        this.f9594q = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        MenuItemC1070k menuItemC1070k = this.f9597t;
        if (menuItemC1070k != null) {
            d(menuItemC1070k);
        }
        this.f.clear();
        o(true);
    }

    public final void clearHeader() {
        this.f9589l = null;
        o(false);
    }

    @Override // android.view.Menu
    public final void close() {
        c(true);
    }

    public boolean d(MenuItemC1070k menuItemC1070k) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f9596s;
        boolean z3 = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f9597t == menuItemC1070k) {
            s();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                InterfaceC1075p interfaceC1075p = (InterfaceC1075p) weakReference.get();
                if (interfaceC1075p == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z3 = interfaceC1075p.e(menuItemC1070k);
                    if (z3) {
                        break;
                    }
                }
            }
            r();
            if (z3) {
                this.f9597t = null;
            }
        }
        return z3;
    }

    public boolean e(MenuC1069j menuC1069j, MenuItem menuItem) {
        InterfaceC1093l interfaceC1093l;
        b0.j jVar = this.f9583e;
        if (jVar == null || (interfaceC1093l = ((ActionMenuView) jVar.f2462a).f1971x) == null) {
            return false;
        }
        ((Toolbar) ((io.flutter.plugin.editing.k) interfaceC1093l).f9216a).getClass();
        return false;
    }

    public boolean f(MenuItemC1070k menuItemC1070k) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f9596s;
        boolean z3 = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        s();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC1075p interfaceC1075p = (InterfaceC1075p) weakReference.get();
            if (interfaceC1075p == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                z3 = interfaceC1075p.b(menuItemC1070k);
                if (z3) {
                    break;
                }
            }
        }
        r();
        if (z3) {
            this.f9597t = menuItemC1070k;
        }
        return z3;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i3) {
        MenuItem findItem;
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            MenuItemC1070k menuItemC1070k = (MenuItemC1070k) arrayList.get(i4);
            if (menuItemC1070k.f9601a == i3) {
                return menuItemC1070k;
            }
            if (menuItemC1070k.hasSubMenu() && (findItem = menuItemC1070k.f9614o.findItem(i3)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public final MenuItemC1070k g(int i3, KeyEvent keyEvent) {
        ArrayList arrayList = this.f9595r;
        arrayList.clear();
        h(arrayList, i3, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (MenuItemC1070k) arrayList.get(0);
        }
        boolean m3 = m();
        for (int i4 = 0; i4 < size; i4++) {
            MenuItemC1070k menuItemC1070k = (MenuItemC1070k) arrayList.get(i4);
            char c3 = m3 ? menuItemC1070k.f9609j : menuItemC1070k.f9607h;
            char[] cArr = keyData.meta;
            if ((c3 == cArr[0] && (metaState & 2) == 0) || ((c3 == cArr[2] && (metaState & 2) != 0) || (m3 && c3 == '\b' && i3 == 67))) {
                return menuItemC1070k;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i3) {
        return (MenuItem) this.f.get(i3);
    }

    public final void h(ArrayList arrayList, int i3, KeyEvent keyEvent) {
        boolean m3 = m();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i3 == 67) {
            ArrayList arrayList2 = this.f;
            int size = arrayList2.size();
            for (int i4 = 0; i4 < size; i4++) {
                MenuItemC1070k menuItemC1070k = (MenuItemC1070k) arrayList2.get(i4);
                if (menuItemC1070k.hasSubMenu()) {
                    menuItemC1070k.f9614o.h(arrayList, i3, keyEvent);
                }
                char c3 = m3 ? menuItemC1070k.f9609j : menuItemC1070k.f9607h;
                if ((modifiers & 69647) == ((m3 ? menuItemC1070k.f9610k : menuItemC1070k.f9608i) & 69647) && c3 != 0) {
                    char[] cArr = keyData.meta;
                    if ((c3 == cArr[0] || c3 == cArr[2] || (m3 && c3 == '\b' && i3 == 67)) && menuItemC1070k.isEnabled()) {
                        arrayList.add(menuItemC1070k);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (((MenuItemC1070k) arrayList.get(i3)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        ArrayList k3 = k();
        if (this.f9588k) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.f9596s;
            Iterator it = copyOnWriteArrayList.iterator();
            boolean z3 = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                InterfaceC1075p interfaceC1075p = (InterfaceC1075p) weakReference.get();
                if (interfaceC1075p == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z3 |= interfaceC1075p.j();
                }
            }
            ArrayList arrayList = this.f9586i;
            ArrayList arrayList2 = this.f9587j;
            if (z3) {
                arrayList.clear();
                arrayList2.clear();
                int size = k3.size();
                for (int i3 = 0; i3 < size; i3++) {
                    MenuItemC1070k menuItemC1070k = (MenuItemC1070k) k3.get(i3);
                    if ((menuItemC1070k.f9623x & 32) == 32) {
                        arrayList.add(menuItemC1070k);
                    } else {
                        arrayList2.add(menuItemC1070k);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(k());
            }
            this.f9588k = false;
        }
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i3, KeyEvent keyEvent) {
        return g(i3, keyEvent) != null;
    }

    public final ArrayList k() {
        boolean z3 = this.f9585h;
        ArrayList arrayList = this.f9584g;
        if (!z3) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f;
        int size = arrayList2.size();
        for (int i3 = 0; i3 < size; i3++) {
            MenuItemC1070k menuItemC1070k = (MenuItemC1070k) arrayList2.get(i3);
            if (menuItemC1070k.isVisible()) {
                arrayList.add(menuItemC1070k);
            }
        }
        this.f9585h = false;
        this.f9588k = true;
        return arrayList;
    }

    public boolean l() {
        return this.f9598u;
    }

    public boolean m() {
        return this.f9581c;
    }

    public boolean n() {
        return this.f9582d;
    }

    public final void o(boolean z3) {
        if (this.f9591n) {
            this.f9592o = true;
            if (z3) {
                this.f9593p = true;
                return;
            }
            return;
        }
        if (z3) {
            this.f9585h = true;
            this.f9588k = true;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.f9596s;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        s();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC1075p interfaceC1075p = (InterfaceC1075p) weakReference.get();
            if (interfaceC1075p == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                interfaceC1075p.f();
            }
        }
        r();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean p(MenuItem menuItem, AbstractC1071l abstractC1071l, int i3) {
        boolean z3;
        MenuItemC1070k menuItemC1070k = (MenuItemC1070k) menuItem;
        if (menuItemC1070k == null || !menuItemC1070k.isEnabled()) {
            return false;
        }
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = menuItemC1070k.f9615p;
        if (onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(menuItemC1070k)) {
            MenuC1069j menuC1069j = menuItemC1070k.f9613n;
            if (!menuC1069j.e(menuC1069j, menuItemC1070k)) {
                Intent intent = menuItemC1070k.f9606g;
                if (intent != null) {
                    try {
                        menuC1069j.f9579a.startActivity(intent);
                    } catch (ActivityNotFoundException e3) {
                        Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e3);
                    }
                }
                z3 = false;
                if ((menuItemC1070k.y & 8) == 0 && menuItemC1070k.f9624z != null) {
                    z3 |= menuItemC1070k.expandActionView();
                    if (z3) {
                        c(true);
                    }
                } else if (!menuItemC1070k.hasSubMenu()) {
                    if ((i3 & 4) == 0) {
                        c(false);
                    }
                    if (!menuItemC1070k.hasSubMenu()) {
                        SubMenuC1079t subMenuC1079t = new SubMenuC1079t(this.f9579a, this, menuItemC1070k);
                        menuItemC1070k.f9614o = subMenuC1079t;
                        subMenuC1079t.setHeaderTitle(menuItemC1070k.f9605e);
                    }
                    SubMenuC1079t subMenuC1079t2 = menuItemC1070k.f9614o;
                    CopyOnWriteArrayList copyOnWriteArrayList = this.f9596s;
                    if (!copyOnWriteArrayList.isEmpty()) {
                        r0 = abstractC1071l != null ? abstractC1071l.c(subMenuC1079t2) : false;
                        Iterator it = copyOnWriteArrayList.iterator();
                        while (it.hasNext()) {
                            WeakReference weakReference = (WeakReference) it.next();
                            InterfaceC1075p interfaceC1075p = (InterfaceC1075p) weakReference.get();
                            if (interfaceC1075p == null) {
                                copyOnWriteArrayList.remove(weakReference);
                            } else if (!r0) {
                                r0 = interfaceC1075p.c(subMenuC1079t2);
                            }
                        }
                    }
                    z3 |= r0;
                    if (!z3) {
                        c(true);
                    }
                } else if ((i3 & 1) == 0) {
                    c(true);
                }
                return z3;
            }
        }
        z3 = true;
        if ((menuItemC1070k.y & 8) == 0) {
        }
        if (!menuItemC1070k.hasSubMenu()) {
        }
        return z3;
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i3, int i4) {
        return p(findItem(i3), null, i4);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i3, KeyEvent keyEvent, int i4) {
        MenuItemC1070k g3 = g(i3, keyEvent);
        boolean p3 = g3 != null ? p(g3, null, i4) : false;
        if ((i4 & 2) != 0) {
            c(true);
        }
        return p3;
    }

    public final void q(int i3, CharSequence charSequence, int i4, View view) {
        if (view != null) {
            this.f9590m = view;
            this.f9589l = null;
        } else {
            if (i3 > 0) {
                this.f9589l = this.f9580b.getText(i3);
            } else if (charSequence != null) {
                this.f9589l = charSequence;
            }
            if (i4 > 0) {
                AbstractC1206a.b(this.f9579a, i4);
            }
        }
        o(false);
    }

    public final void r() {
        this.f9591n = false;
        if (this.f9592o) {
            this.f9592o = false;
            o(this.f9593p);
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i3) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (i5 >= size) {
                i5 = -1;
                break;
            } else if (((MenuItemC1070k) arrayList.get(i5)).f9602b == i3) {
                break;
            } else {
                i5++;
            }
        }
        if (i5 >= 0) {
            int size2 = arrayList.size() - i5;
            while (true) {
                int i6 = i4 + 1;
                if (i4 >= size2 || ((MenuItemC1070k) arrayList.get(i5)).f9602b != i3) {
                    break;
                }
                if (i5 >= 0) {
                    ArrayList arrayList2 = this.f;
                    if (i5 < arrayList2.size()) {
                        arrayList2.remove(i5);
                    }
                }
                i4 = i6;
            }
            o(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i3) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                i4 = -1;
                break;
            } else if (((MenuItemC1070k) arrayList.get(i4)).f9601a == i3) {
                break;
            } else {
                i4++;
            }
        }
        if (i4 >= 0) {
            ArrayList arrayList2 = this.f;
            if (i4 >= arrayList2.size()) {
                return;
            }
            arrayList2.remove(i4);
            o(true);
        }
    }

    public final void s() {
        if (this.f9591n) {
            return;
        }
        this.f9591n = true;
        this.f9592o = false;
        this.f9593p = false;
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i3, boolean z3, boolean z4) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            MenuItemC1070k menuItemC1070k = (MenuItemC1070k) arrayList.get(i4);
            if (menuItemC1070k.f9602b == i3) {
                menuItemC1070k.f9623x = (menuItemC1070k.f9623x & (-5)) | (z4 ? 4 : 0);
                menuItemC1070k.setCheckable(z3);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z3) {
        this.f9598u = z3;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i3, boolean z3) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            MenuItemC1070k menuItemC1070k = (MenuItemC1070k) arrayList.get(i4);
            if (menuItemC1070k.f9602b == i3) {
                menuItemC1070k.setEnabled(z3);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i3, boolean z3) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        boolean z4 = false;
        for (int i4 = 0; i4 < size; i4++) {
            MenuItemC1070k menuItemC1070k = (MenuItemC1070k) arrayList.get(i4);
            if (menuItemC1070k.f9602b == i3) {
                int i5 = menuItemC1070k.f9623x;
                int i6 = (i5 & (-9)) | (z3 ? 0 : 8);
                menuItemC1070k.f9623x = i6;
                if (i5 != i6) {
                    z4 = true;
                }
            }
        }
        if (z4) {
            o(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z3) {
        this.f9581c = z3;
        o(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f.size();
    }

    @Override // android.view.Menu
    public final MenuItem add(int i3) {
        return a(0, 0, 0, this.f9580b.getString(i3));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i3) {
        return addSubMenu(0, 0, 0, this.f9580b.getString(i3));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i3, int i4, int i5, CharSequence charSequence) {
        return a(i3, i4, i5, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i3, int i4, int i5, CharSequence charSequence) {
        MenuItemC1070k a3 = a(i3, i4, i5, charSequence);
        SubMenuC1079t subMenuC1079t = new SubMenuC1079t(this.f9579a, this, a3);
        a3.f9614o = subMenuC1079t;
        subMenuC1079t.setHeaderTitle(a3.f9605e);
        return subMenuC1079t;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i3, int i4, int i5, int i6) {
        return a(i3, i4, i5, this.f9580b.getString(i6));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i3, int i4, int i5, int i6) {
        return addSubMenu(i3, i4, i5, this.f9580b.getString(i6));
    }

    public MenuC1069j j() {
        return this;
    }
}
