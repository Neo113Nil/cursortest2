package g;

/* loaded from: classes.dex */
public class j implements android.view.Menu {

    /* renamed from: u, reason: collision with root package name */
    public static final int[] f2959u = {1, 4, 5, 3, 2, 0};

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f2960a;

    /* renamed from: b, reason: collision with root package name */
    public final android.content.res.Resources f2961b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2962c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f2963d;

    /* renamed from: e, reason: collision with root package name */
    public Z0.h f2964e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f2965f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f2966g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f2967h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f2968i;

    /* renamed from: j, reason: collision with root package name */
    public final java.util.ArrayList f2969j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2970k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.CharSequence f2971l;

    /* renamed from: s, reason: collision with root package name */
    public g.k f2978s;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2972m = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f2973n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f2974o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f2975p = false;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.ArrayList f2976q = new java.util.ArrayList();

    /* renamed from: r, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f2977r = new java.util.concurrent.CopyOnWriteArrayList();
    public boolean t = false;

    public j(android.content.Context context) {
        boolean z2;
        boolean z3 = false;
        this.f2960a = context;
        android.content.res.Resources resources = context.getResources();
        this.f2961b = resources;
        this.f2965f = new java.util.ArrayList();
        this.f2966g = new java.util.ArrayList();
        this.f2967h = true;
        this.f2968i = new java.util.ArrayList();
        this.f2969j = new java.util.ArrayList();
        this.f2970k = true;
        if (resources.getConfiguration().keyboard != 1) {
            android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(context);
            java.lang.reflect.Method method = y.B.f8419a;
            if (android.os.Build.VERSION.SDK_INT >= 28) {
                z2 = y.z.b(viewConfiguration);
            } else {
                android.content.res.Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo.APP_PLATFORM);
                z2 = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (z2) {
                z3 = true;
            }
        }
        this.f2963d = z3;
    }

    public final g.k a(int i2, int i3, int i4, java.lang.CharSequence charSequence) {
        int i5;
        int i6 = ((-65536) & i4) >> 16;
        if (i6 < 0 || i6 >= 6) {
            throw new java.lang.IllegalArgumentException("order does not contain a valid category.");
        }
        int i7 = (f2959u[i6] << 16) | (65535 & i4);
        g.k kVar = new g.k(this, i2, i3, i4, i7, charSequence);
        java.util.ArrayList arrayList = this.f2965f;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i5 = 0;
                break;
            }
            if (((g.k) arrayList.get(size)).f2984d <= i7) {
                i5 = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i5, kVar);
        o(true);
        return kVar;
    }

    @Override // android.view.Menu
    public final android.view.MenuItem add(java.lang.CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i2, int i3, int i4, android.content.ComponentName componentName, android.content.Intent[] intentArr, android.content.Intent intent, int i5, android.view.MenuItem[] menuItemArr) {
        int i6;
        android.content.pm.PackageManager packageManager = this.f2960a.getPackageManager();
        java.util.List<android.content.pm.ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i5 & 1) == 0) {
            removeGroup(i2);
        }
        for (int i7 = 0; i7 < size; i7++) {
            android.content.pm.ResolveInfo resolveInfo = queryIntentActivityOptions.get(i7);
            int i8 = resolveInfo.specificIndex;
            android.content.Intent intent2 = new android.content.Intent(i8 < 0 ? intent : intentArr[i8]);
            android.content.pm.ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new android.content.ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            g.k a2 = a(i2, i3, i4, resolveInfo.loadLabel(packageManager));
            a2.setIcon(resolveInfo.loadIcon(packageManager));
            a2.f2987g = intent2;
            if (menuItemArr != null && (i6 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i6] = a2;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final android.view.SubMenu addSubMenu(java.lang.CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final void b(g.p pVar, android.content.Context context) {
        this.f2977r.add(new java.lang.ref.WeakReference(pVar));
        pVar.k(context, this);
        this.f2970k = true;
    }

    public final void c(boolean z2) {
        if (this.f2975p) {
            return;
        }
        this.f2975p = true;
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = this.f2977r;
        java.util.Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) it.next();
            g.p pVar = (g.p) weakReference.get();
            if (pVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                pVar.a(this, z2);
            }
        }
        this.f2975p = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        g.k kVar = this.f2978s;
        if (kVar != null) {
            d(kVar);
        }
        this.f2965f.clear();
        o(true);
    }

    public final void clearHeader() {
        this.f2971l = null;
        o(false);
    }

    @Override // android.view.Menu
    public final void close() {
        c(true);
    }

    public boolean d(g.k kVar) {
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = this.f2977r;
        boolean z2 = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f2978s == kVar) {
            s();
            java.util.Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) it.next();
                g.p pVar = (g.p) weakReference.get();
                if (pVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z2 = pVar.g(kVar);
                    if (z2) {
                        break;
                    }
                }
            }
            r();
            if (z2) {
                this.f2978s = null;
            }
        }
        return z2;
    }

    public boolean e(g.j jVar, android.view.MenuItem menuItem) {
        h.InterfaceC0154l interfaceC0154l;
        Z0.h hVar = this.f2964e;
        if (hVar == null || (interfaceC0154l = ((androidx.appcompat.widget.ActionMenuView) hVar.f1903b).f2034x) == null) {
            return false;
        }
        ((androidx.appcompat.widget.Toolbar) ((Z0.h) interfaceC0154l).f1903b).getClass();
        return false;
    }

    public boolean f(g.k kVar) {
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = this.f2977r;
        boolean z2 = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        s();
        java.util.Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) it.next();
            g.p pVar = (g.p) weakReference.get();
            if (pVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                z2 = pVar.f(kVar);
                if (z2) {
                    break;
                }
            }
        }
        r();
        if (z2) {
            this.f2978s = kVar;
        }
        return z2;
    }

    @Override // android.view.Menu
    public final android.view.MenuItem findItem(int i2) {
        android.view.MenuItem findItem;
        java.util.ArrayList arrayList = this.f2965f;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            g.k kVar = (g.k) arrayList.get(i3);
            if (kVar.f2981a == i2) {
                return kVar;
            }
            if (kVar.hasSubMenu() && (findItem = kVar.f2995o.findItem(i2)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public final g.k g(int i2, android.view.KeyEvent keyEvent) {
        java.util.ArrayList arrayList = this.f2976q;
        arrayList.clear();
        h(arrayList, i2, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        android.view.KeyCharacterMap.KeyData keyData = new android.view.KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (g.k) arrayList.get(0);
        }
        boolean m2 = m();
        for (int i3 = 0; i3 < size; i3++) {
            g.k kVar = (g.k) arrayList.get(i3);
            char c2 = m2 ? kVar.f2990j : kVar.f2988h;
            char[] cArr = keyData.meta;
            if ((c2 == cArr[0] && (metaState & 2) == 0) || ((c2 == cArr[2] && (metaState & 2) != 0) || (m2 && c2 == '\b' && i2 == 67))) {
                return kVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final android.view.MenuItem getItem(int i2) {
        return (android.view.MenuItem) this.f2965f.get(i2);
    }

    public final void h(java.util.ArrayList arrayList, int i2, android.view.KeyEvent keyEvent) {
        int i3;
        boolean m2 = m();
        int modifiers = keyEvent.getModifiers();
        android.view.KeyCharacterMap.KeyData keyData = new android.view.KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i2 == 67) {
            java.util.ArrayList arrayList2 = this.f2965f;
            int size = arrayList2.size();
            for (0; i3 < size; i3 + 1) {
                g.k kVar = (g.k) arrayList2.get(i3);
                if (kVar.hasSubMenu()) {
                    kVar.f2995o.h(arrayList, i2, keyEvent);
                }
                char c2 = m2 ? kVar.f2990j : kVar.f2988h;
                if ((modifiers & 69647) == ((m2 ? kVar.f2991k : kVar.f2989i) & 69647) && c2 != 0) {
                    char[] cArr = keyData.meta;
                    if (c2 != cArr[0] && c2 != cArr[2]) {
                        if (m2 && c2 == '\b') {
                            i3 = i2 != 67 ? i3 + 1 : 0;
                        }
                    }
                    if (kVar.isEnabled()) {
                        arrayList.add(kVar);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        java.util.ArrayList arrayList = this.f2965f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((g.k) arrayList.get(i2)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        java.util.ArrayList k2 = k();
        if (this.f2970k) {
            java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = this.f2977r;
            java.util.Iterator it = copyOnWriteArrayList.iterator();
            boolean z2 = false;
            while (it.hasNext()) {
                java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) it.next();
                g.p pVar = (g.p) weakReference.get();
                if (pVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z2 |= pVar.e();
                }
            }
            java.util.ArrayList arrayList = this.f2968i;
            java.util.ArrayList arrayList2 = this.f2969j;
            if (z2) {
                arrayList.clear();
                arrayList2.clear();
                int size = k2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    g.k kVar = (g.k) k2.get(i2);
                    if (kVar.d()) {
                        arrayList.add(kVar);
                    } else {
                        arrayList2.add(kVar);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(k());
            }
            this.f2970k = false;
        }
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i2, android.view.KeyEvent keyEvent) {
        return g(i2, keyEvent) != null;
    }

    public final java.util.ArrayList k() {
        boolean z2 = this.f2967h;
        java.util.ArrayList arrayList = this.f2966g;
        if (!z2) {
            return arrayList;
        }
        arrayList.clear();
        java.util.ArrayList arrayList2 = this.f2965f;
        int size = arrayList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            g.k kVar = (g.k) arrayList2.get(i2);
            if (kVar.isVisible()) {
                arrayList.add(kVar);
            }
        }
        this.f2967h = false;
        this.f2970k = true;
        return arrayList;
    }

    public boolean l() {
        return this.t;
    }

    public boolean m() {
        return this.f2962c;
    }

    public boolean n() {
        return this.f2963d;
    }

    public final void o(boolean z2) {
        if (this.f2972m) {
            this.f2973n = true;
            if (z2) {
                this.f2974o = true;
                return;
            }
            return;
        }
        if (z2) {
            this.f2967h = true;
            this.f2970k = true;
        }
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = this.f2977r;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        s();
        java.util.Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) it.next();
            g.p pVar = (g.p) weakReference.get();
            if (pVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                pVar.h();
            }
        }
        r();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean p(android.view.MenuItem menuItem, g.l lVar, int i2) {
        boolean z2;
        g.k kVar = (g.k) menuItem;
        if (kVar == null || !kVar.isEnabled()) {
            return false;
        }
        android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener = kVar.f2996p;
        if (onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(kVar)) {
            g.j jVar = kVar.f2994n;
            if (!jVar.e(jVar, kVar)) {
                android.content.Intent intent = kVar.f2987g;
                if (intent != null) {
                    try {
                        jVar.f2960a.startActivity(intent);
                    } catch (android.content.ActivityNotFoundException e2) {
                        android.util.Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e2);
                    }
                }
                z2 = false;
                if (!kVar.c()) {
                    z2 |= kVar.expandActionView();
                    if (z2) {
                        c(true);
                    }
                } else if (kVar.hasSubMenu()) {
                    if ((i2 & 4) == 0) {
                        c(false);
                    }
                    if (!kVar.hasSubMenu()) {
                        g.t tVar = new g.t(this.f2960a, this, kVar);
                        kVar.f2995o = tVar;
                        tVar.setHeaderTitle(kVar.f2985e);
                    }
                    g.t tVar2 = kVar.f2995o;
                    java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = this.f2977r;
                    if (!copyOnWriteArrayList.isEmpty()) {
                        r0 = lVar != null ? lVar.b(tVar2) : false;
                        java.util.Iterator it = copyOnWriteArrayList.iterator();
                        while (it.hasNext()) {
                            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) it.next();
                            g.p pVar = (g.p) weakReference.get();
                            if (pVar == null) {
                                copyOnWriteArrayList.remove(weakReference);
                            } else if (!r0) {
                                r0 = pVar.b(tVar2);
                            }
                        }
                    }
                    z2 |= r0;
                    if (!z2) {
                        c(true);
                    }
                } else if ((i2 & 1) == 0) {
                    c(true);
                }
                return z2;
            }
        }
        z2 = true;
        if (!kVar.c()) {
        }
        return z2;
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i2, int i3) {
        return p(findItem(i2), null, i3);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i2, android.view.KeyEvent keyEvent, int i3) {
        g.k g2 = g(i2, keyEvent);
        boolean p2 = g2 != null ? p(g2, null, i3) : false;
        if ((i3 & 2) != 0) {
            c(true);
        }
        return p2;
    }

    public final void q(int i2, java.lang.CharSequence charSequence, int i3, android.view.View view) {
        if (view != null) {
            this.f2971l = null;
        } else {
            if (i2 > 0) {
                this.f2971l = this.f2961b.getText(i2);
            } else if (charSequence != null) {
                this.f2971l = charSequence;
            }
            if (i3 > 0) {
                p.AbstractC0944a.b(this.f2960a, i3);
            }
        }
        o(false);
    }

    public final void r() {
        this.f2972m = false;
        if (this.f2973n) {
            this.f2973n = false;
            o(this.f2974o);
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i2) {
        java.util.ArrayList arrayList = this.f2965f;
        int size = arrayList.size();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                i4 = -1;
                break;
            } else if (((g.k) arrayList.get(i4)).f2982b == i2) {
                break;
            } else {
                i4++;
            }
        }
        if (i4 >= 0) {
            int size2 = arrayList.size() - i4;
            while (true) {
                int i5 = i3 + 1;
                if (i3 >= size2 || ((g.k) arrayList.get(i4)).f2982b != i2) {
                    break;
                }
                if (i4 >= 0) {
                    java.util.ArrayList arrayList2 = this.f2965f;
                    if (i4 < arrayList2.size()) {
                        arrayList2.remove(i4);
                    }
                }
                i3 = i5;
            }
            o(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i2) {
        java.util.ArrayList arrayList = this.f2965f;
        int size = arrayList.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (((g.k) arrayList.get(i3)).f2981a == i2) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 >= 0) {
            java.util.ArrayList arrayList2 = this.f2965f;
            if (i3 >= arrayList2.size()) {
                return;
            }
            arrayList2.remove(i3);
            o(true);
        }
    }

    public final void s() {
        if (this.f2972m) {
            return;
        }
        this.f2972m = true;
        this.f2973n = false;
        this.f2974o = false;
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i2, boolean z2, boolean z3) {
        java.util.ArrayList arrayList = this.f2965f;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            g.k kVar = (g.k) arrayList.get(i3);
            if (kVar.f2982b == i2) {
                kVar.f3003x = (kVar.f3003x & (-5)) | (z3 ? 4 : 0);
                kVar.setCheckable(z2);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z2) {
        this.t = z2;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i2, boolean z2) {
        java.util.ArrayList arrayList = this.f2965f;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            g.k kVar = (g.k) arrayList.get(i3);
            if (kVar.f2982b == i2) {
                kVar.setEnabled(z2);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i2, boolean z2) {
        java.util.ArrayList arrayList = this.f2965f;
        int size = arrayList.size();
        boolean z3 = false;
        for (int i3 = 0; i3 < size; i3++) {
            g.k kVar = (g.k) arrayList.get(i3);
            if (kVar.f2982b == i2) {
                int i4 = kVar.f3003x;
                int i5 = (i4 & (-9)) | (z2 ? 0 : 8);
                kVar.f3003x = i5;
                if (i4 != i5) {
                    z3 = true;
                }
            }
        }
        if (z3) {
            o(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z2) {
        this.f2962c = z2;
        o(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f2965f.size();
    }

    @Override // android.view.Menu
    public final android.view.MenuItem add(int i2) {
        return a(0, 0, 0, this.f2961b.getString(i2));
    }

    @Override // android.view.Menu
    public final android.view.SubMenu addSubMenu(int i2) {
        return addSubMenu(0, 0, 0, this.f2961b.getString(i2));
    }

    @Override // android.view.Menu
    public final android.view.MenuItem add(int i2, int i3, int i4, java.lang.CharSequence charSequence) {
        return a(i2, i3, i4, charSequence);
    }

    @Override // android.view.Menu
    public final android.view.SubMenu addSubMenu(int i2, int i3, int i4, java.lang.CharSequence charSequence) {
        g.k a2 = a(i2, i3, i4, charSequence);
        g.t tVar = new g.t(this.f2960a, this, a2);
        a2.f2995o = tVar;
        tVar.setHeaderTitle(a2.f2985e);
        return tVar;
    }

    @Override // android.view.Menu
    public final android.view.MenuItem add(int i2, int i3, int i4, int i5) {
        return a(i2, i3, i4, this.f2961b.getString(i5));
    }

    @Override // android.view.Menu
    public final android.view.SubMenu addSubMenu(int i2, int i3, int i4, int i5) {
        return addSubMenu(i2, i3, i4, this.f2961b.getString(i5));
    }

    public g.j j() {
        return this;
    }
}
