package p000;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public class on0 implements Menu {

    /* JADX INFO: renamed from: H */
    public static final int[] f5791H = {1, 4, 5, 3, 2, 0};

    /* JADX INFO: renamed from: E */
    public rn0 f5796E;

    /* JADX INFO: renamed from: G */
    public boolean f5798G;

    /* JADX INFO: renamed from: j */
    public final Context f5799j;

    /* JADX INFO: renamed from: k */
    public final Resources f5800k;

    /* JADX INFO: renamed from: l */
    public boolean f5801l;

    /* JADX INFO: renamed from: m */
    public final boolean f5802m;

    /* JADX INFO: renamed from: n */
    public mn0 f5803n;

    /* JADX INFO: renamed from: o */
    public final ArrayList f5804o;

    /* JADX INFO: renamed from: p */
    public final ArrayList f5805p;

    /* JADX INFO: renamed from: q */
    public boolean f5806q;

    /* JADX INFO: renamed from: r */
    public final ArrayList f5807r;

    /* JADX INFO: renamed from: s */
    public final ArrayList f5808s;

    /* JADX INFO: renamed from: t */
    public boolean f5809t;

    /* JADX INFO: renamed from: v */
    public CharSequence f5811v;

    /* JADX INFO: renamed from: w */
    public Drawable f5812w;

    /* JADX INFO: renamed from: x */
    public View f5813x;

    /* JADX INFO: renamed from: u */
    public int f5810u = 0;

    /* JADX INFO: renamed from: y */
    public boolean f5814y = false;

    /* JADX INFO: renamed from: z */
    public boolean f5815z = false;

    /* JADX INFO: renamed from: A */
    public boolean f5792A = false;

    /* JADX INFO: renamed from: B */
    public boolean f5793B = false;

    /* JADX INFO: renamed from: C */
    public final ArrayList f5794C = new ArrayList();

    /* JADX INFO: renamed from: D */
    public final CopyOnWriteArrayList f5795D = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: F */
    public boolean f5797F = false;

    public on0(Context context) {
        boolean z = false;
        this.f5799j = context;
        Resources resources = context.getResources();
        this.f5800k = resources;
        this.f5804o = new ArrayList();
        this.f5805p = new ArrayList();
        this.f5806q = true;
        this.f5807r = new ArrayList();
        this.f5808s = new ArrayList();
        this.f5809t = true;
        if (resources.getConfiguration().keyboard != 1 && ViewConfiguration.get(context).shouldShowMenuShortcutsWhenKeyboardPresent()) {
            z = true;
        }
        this.f5802m = z;
    }

    /* JADX INFO: renamed from: a */
    public final rn0 m3705a(int i, int i2, int i3, CharSequence charSequence) {
        int i4;
        int i5 = ((-65536) & i3) >> 16;
        if (i5 < 0 || i5 >= 6) {
            C0270h1.m2190f("order does not contain a valid category.");
            return null;
        }
        int i6 = (f5791H[i5] << 16) | (65535 & i3);
        rn0 rn0Var = new rn0(this, i, i2, i3, i6, charSequence, this.f5810u);
        ArrayList arrayList = this.f5804o;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((rn0) arrayList.get(size)).f6906m <= i6) {
                i4 = size + 1;
                arrayList.add(i4, rn0Var);
                m3712p(true);
                return rn0Var;
            }
        }
        i4 = 0;
        arrayList.add(i4, rn0Var);
        m3712p(true);
        return rn0Var;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return m3705a(0, 0, 0, this.f5800k.getString(i));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        PackageManager packageManager = this.f5799j.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i6 = 0; i6 < size; i6++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i6);
            int i7 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i7 < 0 ? intent : intentArr[i7]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            rn0 rn0VarM3705a = m3705a(i, i2, i3, resolveInfo.loadLabel(packageManager));
            rn0VarM3705a.setIcon(resolveInfo.loadIcon(packageManager));
            rn0VarM3705a.f6909p = intent2;
            if (menuItemArr != null && (i5 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i5] = rn0VarM3705a;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        rn0 rn0VarM3705a = m3705a(i, i2, i3, charSequence);
        gb1 gb1Var = new gb1(this.f5799j, this, rn0VarM3705a);
        rn0VarM3705a.f6917x = gb1Var;
        gb1Var.setHeaderTitle(rn0VarM3705a.f6907n);
        return gb1Var;
    }

    /* JADX INFO: renamed from: b */
    public final void m3706b(eo0 eo0Var, Context context) {
        this.f5795D.add(new WeakReference(eo0Var));
        eo0Var.mo1486h(context, this);
        this.f5809t = true;
    }

    /* JADX INFO: renamed from: c */
    public final void m3707c(boolean z) {
        if (this.f5793B) {
            return;
        }
        this.f5793B = true;
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f5795D;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            eo0 eo0Var = (eo0) weakReference.get();
            if (eo0Var == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                eo0Var.mo1481b(this, z);
            }
        }
        this.f5793B = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        rn0 rn0Var = this.f5796E;
        if (rn0Var != null) {
            mo2016d(rn0Var);
        }
        this.f5804o.clear();
        m3712p(true);
    }

    public final void clearHeader() {
        this.f5812w = null;
        this.f5811v = null;
        this.f5813x = null;
        m3712p(false);
    }

    @Override // android.view.Menu
    public final void close() {
        m3707c(true);
    }

    /* JADX INFO: renamed from: d */
    public boolean mo2016d(rn0 rn0Var) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f5795D;
        boolean zMo1482d = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f5796E == rn0Var) {
            m3719w();
            for (WeakReference weakReference : copyOnWriteArrayList) {
                eo0 eo0Var = (eo0) weakReference.get();
                if (eo0Var != null) {
                    zMo1482d = eo0Var.mo1482d(rn0Var);
                    if (zMo1482d) {
                        break;
                    }
                } else {
                    copyOnWriteArrayList.remove(weakReference);
                }
            }
            m3718v();
            if (zMo1482d) {
                this.f5796E = null;
            }
        }
        return zMo1482d;
    }

    /* JADX INFO: renamed from: e */
    public boolean mo2017e(on0 on0Var, MenuItem menuItem) {
        mn0 mn0Var = this.f5803n;
        return mn0Var != null && mn0Var.mo311g(on0Var, menuItem);
    }

    /* JADX INFO: renamed from: f */
    public boolean mo2018f(rn0 rn0Var) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f5795D;
        boolean zMo1484f = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        m3719w();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            eo0 eo0Var = (eo0) weakReference.get();
            if (eo0Var != null) {
                zMo1484f = eo0Var.mo1484f(rn0Var);
                if (zMo1484f) {
                    break;
                }
            } else {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        m3718v();
        if (zMo1484f) {
            this.f5796E = rn0Var;
        }
        return zMo1484f;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        MenuItem menuItemFindItem;
        ArrayList arrayList = this.f5804o;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            rn0 rn0Var = (rn0) arrayList.get(i2);
            if (rn0Var.f6903j == i) {
                return rn0Var;
            }
            if (rn0Var.hasSubMenu() && (menuItemFindItem = rn0Var.f6917x.findItem(i)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final rn0 m3708g(int i, KeyEvent keyEvent) {
        ArrayList arrayList = this.f5794C;
        arrayList.clear();
        m3709h(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (rn0) arrayList.get(0);
        }
        boolean zMo2022n = mo2022n();
        for (int i2 = 0; i2 < size; i2++) {
            rn0 rn0Var = (rn0) arrayList.get(i2);
            char c = zMo2022n ? rn0Var.f6912s : rn0Var.f6910q;
            char[] cArr = keyData.meta;
            if ((c == cArr[0] && (metaState & 2) == 0) || ((c == cArr[2] && (metaState & 2) != 0) || (zMo2022n && c == '\b' && i == 67))) {
                return rn0Var;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return (MenuItem) this.f5804o.get(i);
    }

    /* JADX INFO: renamed from: h */
    public final void m3709h(List list, int i, KeyEvent keyEvent) {
        boolean zMo2022n = mo2022n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            ArrayList arrayList = this.f5804o;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                rn0 rn0Var = (rn0) arrayList.get(i2);
                if (rn0Var.hasSubMenu()) {
                    rn0Var.f6917x.m3709h(list, i, keyEvent);
                }
                char c = zMo2022n ? rn0Var.f6912s : rn0Var.f6910q;
                if ((modifiers & 69647) == ((zMo2022n ? rn0Var.f6913t : rn0Var.f6911r) & 69647) && c != 0) {
                    char[] cArr = keyData.meta;
                    if ((c == cArr[0] || c == cArr[2] || (zMo2022n && c == '\b' && i == 67)) && rn0Var.isEnabled()) {
                        list.add(rn0Var);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.f5798G) {
            return true;
        }
        ArrayList arrayList = this.f5804o;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((rn0) arrayList.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public final void m3710i() {
        ArrayList arrayListM3711l = m3711l();
        if (this.f5809t) {
            CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f5795D;
            boolean zMo1488k = false;
            for (WeakReference weakReference : copyOnWriteArrayList) {
                eo0 eo0Var = (eo0) weakReference.get();
                if (eo0Var == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    zMo1488k |= eo0Var.mo1488k();
                }
            }
            ArrayList arrayList = this.f5807r;
            ArrayList arrayList2 = this.f5808s;
            if (zMo1488k) {
                arrayList.clear();
                arrayList2.clear();
                int size = arrayListM3711l.size();
                for (int i = 0; i < size; i++) {
                    rn0 rn0Var = (rn0) arrayListM3711l.get(i);
                    if ((rn0Var.f6897G & 32) == 32) {
                        arrayList.add(rn0Var);
                    } else {
                        arrayList2.add(rn0Var);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(m3711l());
            }
            this.f5809t = false;
        }
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return m3708g(i, keyEvent) != null;
    }

    /* JADX INFO: renamed from: j */
    public String mo2019j() {
        return "android:menu:actionviewstates";
    }

    /* JADX INFO: renamed from: l */
    public final ArrayList m3711l() {
        boolean z = this.f5806q;
        ArrayList arrayList = this.f5805p;
        if (!z) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f5804o;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            rn0 rn0Var = (rn0) arrayList2.get(i);
            if (rn0Var.isVisible()) {
                arrayList.add(rn0Var);
            }
        }
        this.f5806q = false;
        this.f5809t = true;
        return arrayList;
    }

    /* JADX INFO: renamed from: m */
    public boolean mo2021m() {
        return this.f5797F;
    }

    /* JADX INFO: renamed from: n */
    public boolean mo2022n() {
        return this.f5801l;
    }

    /* JADX INFO: renamed from: o */
    public boolean mo2023o() {
        return this.f5802m;
    }

    /* JADX INFO: renamed from: p */
    public final void m3712p(boolean z) {
        if (this.f5814y) {
            this.f5815z = true;
            if (z) {
                this.f5792A = true;
                return;
            }
            return;
        }
        if (z) {
            this.f5806q = true;
            this.f5809t = true;
        }
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f5795D;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        m3719w();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            eo0 eo0Var = (eo0) weakReference.get();
            if (eo0Var == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                eo0Var.mo1485g();
            }
        }
        m3718v();
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i2) {
        return m3713q(findItem(i), null, i2);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        rn0 rn0VarM3708g = m3708g(i, keyEvent);
        boolean zM3713q = rn0VarM3708g != null ? m3713q(rn0VarM3708g, null, i2) : false;
        if ((i2 & 2) != 0) {
            m3707c(true);
        }
        return zM3713q;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001a  */
    /* JADX WARN: Code duplicated, block: B:32:0x0051  */
    /* JADX WARN: Code duplicated, block: B:35:0x0058  */
    /* JADX WARN: Code duplicated, block: B:37:0x005f  */
    /* JADX WARN: Code duplicated, block: B:38:0x0064  */
    /* JADX WARN: Code duplicated, block: B:45:0x0075  */
    /* JADX WARN: Code duplicated, block: B:47:0x0079  */
    /* JADX WARN: Code duplicated, block: B:50:0x0082  */
    /* JADX WARN: Code duplicated, block: B:53:0x0094  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x00c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x00c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x00ac A[SYNTHETIC] */
    /* JADX INFO: renamed from: q */
    public final boolean m3713q(MenuItem menuItem, eo0 eo0Var, int i) {
        sn0 sn0Var;
        boolean zExpandActionView;
        sn0 sn0Var2;
        boolean z;
        gb1 gb1Var;
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList;
        eo0 eo0Var2;
        rn0 rn0Var = (rn0) menuItem;
        boolean zMo1487j = false;
        if (rn0Var == null || !rn0Var.isEnabled()) {
            return false;
        }
        on0 on0Var = rn0Var.f6916w;
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = rn0Var.f6918y;
        if ((onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(rn0Var)) && !on0Var.mo2017e(on0Var, rn0Var)) {
            Intent intent = rn0Var.f6909p;
            if (intent != null) {
                try {
                    on0Var.f5799j.startActivity(intent);
                } catch (ActivityNotFoundException e) {
                    Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e);
                    sn0Var = rn0Var.f6900J;
                    if (sn0Var == null) {
                    }
                    zExpandActionView = false;
                    sn0Var2 = rn0Var.f6900J;
                    if (sn0Var2 == null) {
                        z = false;
                    } else {
                        z = false;
                    }
                    if (rn0Var.m4386e()) {
                        zExpandActionView |= rn0Var.expandActionView();
                        if (zExpandActionView) {
                            m3707c(true);
                        }
                    } else if (rn0Var.hasSubMenu()) {
                        if ((i & 4) == 0) {
                            m3707c(false);
                        }
                        if (!rn0Var.hasSubMenu()) {
                            gb1 gb1Var2 = new gb1(this.f5799j, this, rn0Var);
                            rn0Var.f6917x = gb1Var2;
                            gb1Var2.setHeaderTitle(rn0Var.f6907n);
                        }
                        gb1Var = rn0Var.f6917x;
                        if (z) {
                            sn0Var2.f7155b.onPrepareSubMenu(gb1Var);
                        }
                        copyOnWriteArrayList = this.f5795D;
                        if (!copyOnWriteArrayList.isEmpty()) {
                            if (eo0Var != null) {
                            }
                            for (WeakReference weakReference : copyOnWriteArrayList) {
                                eo0Var2 = (eo0) weakReference.get();
                                if (eo0Var2 == null) {
                                    copyOnWriteArrayList.remove(weakReference);
                                } else if (!zMo1487j) {
                                    zMo1487j = eo0Var2.mo1487j(gb1Var);
                                }
                            }
                        }
                        zExpandActionView |= zMo1487j;
                        if (!zExpandActionView) {
                            m3707c(true);
                        }
                    } else {
                        if ((i & 4) == 0) {
                            m3707c(false);
                        }
                        if (!rn0Var.hasSubMenu()) {
                            gb1 gb1Var3 = new gb1(this.f5799j, this, rn0Var);
                            rn0Var.f6917x = gb1Var3;
                            gb1Var3.setHeaderTitle(rn0Var.f6907n);
                        }
                        gb1Var = rn0Var.f6917x;
                        if (z) {
                            sn0Var2.f7155b.onPrepareSubMenu(gb1Var);
                        }
                        copyOnWriteArrayList = this.f5795D;
                        if (!copyOnWriteArrayList.isEmpty()) {
                            zMo1487j = eo0Var != null ? eo0Var.mo1487j(gb1Var) : false;
                            while (r8.hasNext()) {
                                eo0Var2 = (eo0) weakReference.get();
                                if (eo0Var2 == null) {
                                    copyOnWriteArrayList.remove(weakReference);
                                } else if (!zMo1487j) {
                                    zMo1487j = eo0Var2.mo1487j(gb1Var);
                                }
                            }
                        }
                        zExpandActionView |= zMo1487j;
                        if (!zExpandActionView) {
                            m3707c(true);
                        }
                    }
                    return zExpandActionView;
                }
                zExpandActionView = true;
            } else {
                sn0Var = rn0Var.f6900J;
                if (sn0Var == null && sn0Var.f7155b.onPerformDefaultAction()) {
                    zExpandActionView = true;
                } else {
                    zExpandActionView = false;
                }
            }
        } else {
            zExpandActionView = true;
        }
        sn0Var2 = rn0Var.f6900J;
        if (sn0Var2 == null && sn0Var2.f7155b.hasSubMenu()) {
            z = true;
        } else {
            z = false;
        }
        if (rn0Var.m4386e()) {
            zExpandActionView |= rn0Var.expandActionView();
            if (zExpandActionView) {
                m3707c(true);
            }
        } else if (rn0Var.hasSubMenu() || z) {
            if ((i & 4) == 0) {
                m3707c(false);
            }
            if (!rn0Var.hasSubMenu()) {
                gb1 gb1Var4 = new gb1(this.f5799j, this, rn0Var);
                rn0Var.f6917x = gb1Var4;
                gb1Var4.setHeaderTitle(rn0Var.f6907n);
            }
            gb1Var = rn0Var.f6917x;
            if (z) {
                sn0Var2.f7155b.onPrepareSubMenu(gb1Var);
            }
            copyOnWriteArrayList = this.f5795D;
            if (!copyOnWriteArrayList.isEmpty()) {
                if (eo0Var != null) {
                }
                while (r8.hasNext()) {
                    eo0Var2 = (eo0) weakReference.get();
                    if (eo0Var2 == null) {
                        copyOnWriteArrayList.remove(weakReference);
                    } else if (!zMo1487j) {
                        zMo1487j = eo0Var2.mo1487j(gb1Var);
                    }
                }
            }
            zExpandActionView |= zMo1487j;
            if (!zExpandActionView) {
                m3707c(true);
            }
        } else if ((i & 1) == 0) {
            m3707c(true);
        }
        return zExpandActionView;
    }

    /* JADX INFO: renamed from: r */
    public final void m3714r(eo0 eo0Var) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f5795D;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            eo0 eo0Var2 = (eo0) weakReference.get();
            if (eo0Var2 == null || eo0Var2 == eo0Var) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        ArrayList arrayList = this.f5804o;
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (((rn0) arrayList.get(i3)).f6904k == i) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 >= 0) {
            int size2 = arrayList.size() - i3;
            while (true) {
                int i4 = i2 + 1;
                if (i2 >= size2 || ((rn0) arrayList.get(i3)).f6904k != i) {
                    break;
                }
                if (i3 >= 0 && i3 < arrayList.size()) {
                    arrayList.remove(i3);
                }
                i2 = i4;
            }
            m3712p(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        ArrayList arrayList = this.f5804o;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (((rn0) arrayList.get(i2)).f6903j == i) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 < 0 || i2 >= arrayList.size()) {
            return;
        }
        arrayList.remove(i2);
        m3712p(true);
    }

    /* JADX INFO: renamed from: s */
    public final void m3715s(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(mo2019j());
        int size = this.f5804o.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((gb1) item.getSubMenu()).m3715s(bundle);
            }
        }
        int i2 = bundle.getInt("android:menu:expandedactionview");
        if (i2 <= 0 || (menuItemFindItem = findItem(i2)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z, boolean z2) {
        ArrayList arrayList = this.f5804o;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            rn0 rn0Var = (rn0) arrayList.get(i2);
            if (rn0Var.f6904k == i) {
                rn0Var.f6897G = (rn0Var.f6897G & (-5)) | (z2 ? 4 : 0);
                rn0Var.setCheckable(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.f5797F = z;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z) {
        ArrayList arrayList = this.f5804o;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            rn0 rn0Var = (rn0) arrayList.get(i2);
            if (rn0Var.f6904k == i) {
                rn0Var.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z) {
        ArrayList arrayList = this.f5804o;
        int size = arrayList.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            rn0 rn0Var = (rn0) arrayList.get(i2);
            if (rn0Var.f6904k == i) {
                int i3 = rn0Var.f6897G;
                int i4 = (i3 & (-9)) | (z ? 0 : 8);
                rn0Var.f6897G = i4;
                if (i3 != i4) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            m3712p(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.f5801l = z;
        m3712p(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f5804o.size();
    }

    /* JADX INFO: renamed from: t */
    public final void m3716t(Bundle bundle) {
        int size = this.f5804o.size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((gb1) item.getSubMenu()).m3716t(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(mo2019j(), sparseArray);
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m3717u(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        if (view != null) {
            this.f5813x = view;
            this.f5811v = null;
            this.f5812w = null;
        } else {
            if (i > 0) {
                this.f5811v = this.f5800k.getText(i);
            } else if (charSequence != null) {
                this.f5811v = charSequence;
            }
            if (i2 > 0) {
                this.f5812w = this.f5799j.getDrawable(i2);
            } else if (drawable != null) {
                this.f5812w = drawable;
            }
            this.f5813x = null;
        }
        m3712p(false);
    }

    /* JADX INFO: renamed from: v */
    public final void m3718v() {
        this.f5814y = false;
        if (this.f5815z) {
            this.f5815z = false;
            m3712p(this.f5792A);
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m3719w() {
        if (this.f5814y) {
            return;
        }
        this.f5814y = true;
        this.f5815z = false;
        this.f5792A = false;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return m3705a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return m3705a(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, int i4) {
        return m3705a(i, i2, i3, this.f5800k.getString(i4));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.f5800k.getString(i));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.f5800k.getString(i4));
    }

    /* JADX INFO: renamed from: k */
    public on0 mo2020k() {
        return this;
    }
}
