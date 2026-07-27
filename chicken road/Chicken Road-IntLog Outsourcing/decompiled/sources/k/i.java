package k;

import E.I;
import E.K;
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
import l.InterfaceC1240l;
import v.AbstractC1485a;

/* loaded from: classes.dex */
public class i implements Menu {

    /* renamed from: u, reason: collision with root package name */
    public static final int[] f10585u = {1, 4, 5, 3, 2, 0};

    /* renamed from: a, reason: collision with root package name */
    public final Context f10586a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources f10587b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f10588c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f10589d;

    /* renamed from: e, reason: collision with root package name */
    public V0.j f10590e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f10591f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f10592g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f10593h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f10594i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f10595j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f10596k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f10597l;

    /* renamed from: s, reason: collision with root package name */
    public j f10604s;

    /* renamed from: m, reason: collision with root package name */
    public boolean f10598m = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f10599n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f10600o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f10601p = false;

    /* renamed from: q, reason: collision with root package name */
    public final ArrayList f10602q = new ArrayList();

    /* renamed from: r, reason: collision with root package name */
    public final CopyOnWriteArrayList f10603r = new CopyOnWriteArrayList();

    /* renamed from: t, reason: collision with root package name */
    public boolean f10605t = false;

    public i(Context context) {
        boolean z;
        boolean z5 = false;
        this.f10586a = context;
        Resources resources = context.getResources();
        this.f10587b = resources;
        this.f10591f = new ArrayList();
        this.f10592g = new ArrayList();
        this.f10593h = true;
        this.f10594i = new ArrayList();
        this.f10595j = new ArrayList();
        this.f10596k = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Method method = K.f568a;
            if (Build.VERSION.SDK_INT >= 28) {
                z = I.b(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                z = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (z) {
                z5 = true;
            }
        }
        this.f10589d = z5;
    }

    public final j a(int i2, int i3, int i6, CharSequence charSequence) {
        int i7;
        int i8 = ((-65536) & i6) >> 16;
        if (i8 < 0 || i8 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i9 = (f10585u[i8] << 16) | (65535 & i6);
        j jVar = new j(this, i2, i3, i6, i9, charSequence);
        ArrayList arrayList = this.f10591f;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i7 = 0;
                break;
            }
            if (((j) arrayList.get(size)).f10611d <= i9) {
                i7 = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i7, jVar);
        o(true);
        return jVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i2, int i3, int i6, ComponentName componentName, Intent[] intentArr, Intent intent, int i7, MenuItem[] menuItemArr) {
        int i8;
        PackageManager packageManager = this.f10586a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i7 & 1) == 0) {
            removeGroup(i2);
        }
        for (int i9 = 0; i9 < size; i9++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i9);
            int i10 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i10 < 0 ? intent : intentArr[i10]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            j a6 = a(i2, i3, i6, resolveInfo.loadLabel(packageManager));
            a6.setIcon(resolveInfo.loadIcon(packageManager));
            a6.f10614g = intent2;
            if (menuItemArr != null && (i8 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i8] = a6;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final void b(o oVar, Context context) {
        this.f10603r.add(new WeakReference(oVar));
        oVar.i(context, this);
        this.f10596k = true;
    }

    public final void c(boolean z) {
        if (this.f10601p) {
            return;
        }
        this.f10601p = true;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f10603r;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            o oVar = (o) weakReference.get();
            if (oVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                oVar.a(this, z);
            }
        }
        this.f10601p = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        j jVar = this.f10604s;
        if (jVar != null) {
            d(jVar);
        }
        this.f10591f.clear();
        o(true);
    }

    public final void clearHeader() {
        this.f10597l = null;
        o(false);
    }

    @Override // android.view.Menu
    public final void close() {
        c(true);
    }

    public boolean d(j jVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f10603r;
        boolean z = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f10604s == jVar) {
            s();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                o oVar = (o) weakReference.get();
                if (oVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z = oVar.e(jVar);
                    if (z) {
                        break;
                    }
                }
            }
            r();
            if (z) {
                this.f10604s = null;
            }
        }
        return z;
    }

    public boolean e(i iVar, MenuItem menuItem) {
        InterfaceC1240l interfaceC1240l;
        V0.j jVar = this.f10590e;
        if (jVar == null || (interfaceC1240l = ((ActionMenuView) jVar.f3212b).f4163x) == null) {
            return false;
        }
        ((Toolbar) ((U.e) interfaceC1240l).f3053a).getClass();
        return false;
    }

    public boolean f(j jVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f10603r;
        boolean z = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        s();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            o oVar = (o) weakReference.get();
            if (oVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                z = oVar.b(jVar);
                if (z) {
                    break;
                }
            }
        }
        r();
        if (z) {
            this.f10604s = jVar;
        }
        return z;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i2) {
        MenuItem findItem;
        ArrayList arrayList = this.f10591f;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            j jVar = (j) arrayList.get(i3);
            if (jVar.f10608a == i2) {
                return jVar;
            }
            if (jVar.hasSubMenu() && (findItem = jVar.f10622o.findItem(i2)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public final j g(int i2, KeyEvent keyEvent) {
        ArrayList arrayList = this.f10602q;
        arrayList.clear();
        h(arrayList, i2, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (j) arrayList.get(0);
        }
        boolean m6 = m();
        for (int i3 = 0; i3 < size; i3++) {
            j jVar = (j) arrayList.get(i3);
            char c2 = m6 ? jVar.f10617j : jVar.f10615h;
            char[] cArr = keyData.meta;
            if ((c2 == cArr[0] && (metaState & 2) == 0) || ((c2 == cArr[2] && (metaState & 2) != 0) || (m6 && c2 == '\b' && i2 == 67))) {
                return jVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i2) {
        return (MenuItem) this.f10591f.get(i2);
    }

    public final void h(ArrayList arrayList, int i2, KeyEvent keyEvent) {
        int i3;
        boolean m6 = m();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i2 == 67) {
            ArrayList arrayList2 = this.f10591f;
            int size = arrayList2.size();
            for (0; i3 < size; i3 + 1) {
                j jVar = (j) arrayList2.get(i3);
                if (jVar.hasSubMenu()) {
                    jVar.f10622o.h(arrayList, i2, keyEvent);
                }
                char c2 = m6 ? jVar.f10617j : jVar.f10615h;
                if ((modifiers & 69647) == ((m6 ? jVar.f10618k : jVar.f10616i) & 69647) && c2 != 0) {
                    char[] cArr = keyData.meta;
                    if (c2 != cArr[0] && c2 != cArr[2]) {
                        if (m6 && c2 == '\b') {
                            i3 = i2 != 67 ? i3 + 1 : 0;
                        }
                    }
                    if (jVar.isEnabled()) {
                        arrayList.add(jVar);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        ArrayList arrayList = this.f10591f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((j) arrayList.get(i2)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        ArrayList k3 = k();
        if (this.f10596k) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.f10603r;
            Iterator it = copyOnWriteArrayList.iterator();
            boolean z = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                o oVar = (o) weakReference.get();
                if (oVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z |= oVar.j();
                }
            }
            ArrayList arrayList = this.f10594i;
            ArrayList arrayList2 = this.f10595j;
            if (z) {
                arrayList.clear();
                arrayList2.clear();
                int size = k3.size();
                for (int i2 = 0; i2 < size; i2++) {
                    j jVar = (j) k3.get(i2);
                    if (jVar.d()) {
                        arrayList.add(jVar);
                    } else {
                        arrayList2.add(jVar);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(k());
            }
            this.f10596k = false;
        }
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i2, KeyEvent keyEvent) {
        return g(i2, keyEvent) != null;
    }

    public final ArrayList k() {
        boolean z = this.f10593h;
        ArrayList arrayList = this.f10592g;
        if (!z) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f10591f;
        int size = arrayList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            j jVar = (j) arrayList2.get(i2);
            if (jVar.isVisible()) {
                arrayList.add(jVar);
            }
        }
        this.f10593h = false;
        this.f10596k = true;
        return arrayList;
    }

    public boolean l() {
        return this.f10605t;
    }

    public boolean m() {
        return this.f10588c;
    }

    public boolean n() {
        return this.f10589d;
    }

    public final void o(boolean z) {
        if (this.f10598m) {
            this.f10599n = true;
            if (z) {
                this.f10600o = true;
                return;
            }
            return;
        }
        if (z) {
            this.f10593h = true;
            this.f10596k = true;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.f10603r;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        s();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            o oVar = (o) weakReference.get();
            if (oVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                oVar.f();
            }
        }
        r();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean p(MenuItem menuItem, k kVar, int i2) {
        boolean z;
        j jVar = (j) menuItem;
        if (jVar == null || !jVar.isEnabled()) {
            return false;
        }
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = jVar.f10623p;
        if (onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(jVar)) {
            i iVar = jVar.f10621n;
            if (!iVar.e(iVar, jVar)) {
                Intent intent = jVar.f10614g;
                if (intent != null) {
                    try {
                        iVar.f10586a.startActivity(intent);
                    } catch (ActivityNotFoundException e3) {
                        Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e3);
                    }
                }
                z = false;
                if (!jVar.c()) {
                    z |= jVar.expandActionView();
                    if (z) {
                        c(true);
                    }
                } else if (jVar.hasSubMenu()) {
                    if ((i2 & 4) == 0) {
                        c(false);
                    }
                    if (!jVar.hasSubMenu()) {
                        s sVar = new s(this.f10586a, this, jVar);
                        jVar.f10622o = sVar;
                        sVar.setHeaderTitle(jVar.f10612e);
                    }
                    s sVar2 = jVar.f10622o;
                    CopyOnWriteArrayList copyOnWriteArrayList = this.f10603r;
                    if (!copyOnWriteArrayList.isEmpty()) {
                        r0 = kVar != null ? kVar.c(sVar2) : false;
                        Iterator it = copyOnWriteArrayList.iterator();
                        while (it.hasNext()) {
                            WeakReference weakReference = (WeakReference) it.next();
                            o oVar = (o) weakReference.get();
                            if (oVar == null) {
                                copyOnWriteArrayList.remove(weakReference);
                            } else if (!r0) {
                                r0 = oVar.c(sVar2);
                            }
                        }
                    }
                    z |= r0;
                    if (!z) {
                        c(true);
                    }
                } else if ((i2 & 1) == 0) {
                    c(true);
                }
                return z;
            }
        }
        z = true;
        if (!jVar.c()) {
        }
        return z;
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i2, int i3) {
        return p(findItem(i2), null, i3);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i2, KeyEvent keyEvent, int i3) {
        j g6 = g(i2, keyEvent);
        boolean p5 = g6 != null ? p(g6, null, i3) : false;
        if ((i3 & 2) != 0) {
            c(true);
        }
        return p5;
    }

    public final void q(int i2, CharSequence charSequence, int i3, View view) {
        if (view != null) {
            this.f10597l = null;
        } else {
            if (i2 > 0) {
                this.f10597l = this.f10587b.getText(i2);
            } else if (charSequence != null) {
                this.f10597l = charSequence;
            }
            if (i3 > 0) {
                AbstractC1485a.b(this.f10586a, i3);
            }
        }
        o(false);
    }

    public final void r() {
        this.f10598m = false;
        if (this.f10599n) {
            this.f10599n = false;
            o(this.f10600o);
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i2) {
        ArrayList arrayList = this.f10591f;
        int size = arrayList.size();
        int i3 = 0;
        int i6 = 0;
        while (true) {
            if (i6 >= size) {
                i6 = -1;
                break;
            } else if (((j) arrayList.get(i6)).f10609b == i2) {
                break;
            } else {
                i6++;
            }
        }
        if (i6 >= 0) {
            int size2 = arrayList.size() - i6;
            while (true) {
                int i7 = i3 + 1;
                if (i3 >= size2 || ((j) arrayList.get(i6)).f10609b != i2) {
                    break;
                }
                if (i6 >= 0) {
                    ArrayList arrayList2 = this.f10591f;
                    if (i6 < arrayList2.size()) {
                        arrayList2.remove(i6);
                    }
                }
                i3 = i7;
            }
            o(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i2) {
        ArrayList arrayList = this.f10591f;
        int size = arrayList.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (((j) arrayList.get(i3)).f10608a == i2) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 >= 0) {
            ArrayList arrayList2 = this.f10591f;
            if (i3 >= arrayList2.size()) {
                return;
            }
            arrayList2.remove(i3);
            o(true);
        }
    }

    public final void s() {
        if (this.f10598m) {
            return;
        }
        this.f10598m = true;
        this.f10599n = false;
        this.f10600o = false;
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i2, boolean z, boolean z5) {
        ArrayList arrayList = this.f10591f;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            j jVar = (j) arrayList.get(i3);
            if (jVar.f10609b == i2) {
                jVar.f10631x = (jVar.f10631x & (-5)) | (z5 ? 4 : 0);
                jVar.setCheckable(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.f10605t = z;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i2, boolean z) {
        ArrayList arrayList = this.f10591f;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            j jVar = (j) arrayList.get(i3);
            if (jVar.f10609b == i2) {
                jVar.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i2, boolean z) {
        ArrayList arrayList = this.f10591f;
        int size = arrayList.size();
        boolean z5 = false;
        for (int i3 = 0; i3 < size; i3++) {
            j jVar = (j) arrayList.get(i3);
            if (jVar.f10609b == i2) {
                int i6 = jVar.f10631x;
                int i7 = (i6 & (-9)) | (z ? 0 : 8);
                jVar.f10631x = i7;
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
    public void setQwertyMode(boolean z) {
        this.f10588c = z;
        o(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f10591f.size();
    }

    @Override // android.view.Menu
    public final MenuItem add(int i2) {
        return a(0, 0, 0, this.f10587b.getString(i2));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i2) {
        return addSubMenu(0, 0, 0, this.f10587b.getString(i2));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i2, int i3, int i6, CharSequence charSequence) {
        return a(i2, i3, i6, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i2, int i3, int i6, CharSequence charSequence) {
        j a6 = a(i2, i3, i6, charSequence);
        s sVar = new s(this.f10586a, this, a6);
        a6.f10622o = sVar;
        sVar.setHeaderTitle(a6.f10612e);
        return sVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i2, int i3, int i6, int i7) {
        return a(i2, i3, i6, this.f10587b.getString(i7));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i2, int i3, int i6, int i7) {
        return addSubMenu(i2, i3, i6, this.f10587b.getString(i7));
    }

    public i j() {
        return this;
    }
}
