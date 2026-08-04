package p086m;

import G.h;
import P.AbstractC0347c;
import P.W;
import P.Y;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
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
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public class k implements Menu {

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final int[] f15127Q = {1, 4, 5, 3, 2, 0};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final ArrayList f15128A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f15129B;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public CharSequence f15131D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public Drawable f15132E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public View f15133F;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public m f15141N;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public boolean f15143P;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f15144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Resources f15145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f15146c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f15147d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public i f15148e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f15149f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ArrayList f15150x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f15151y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final ArrayList f15152z;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f15130C = 0;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f15134G = false;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f15135H = false;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f15136I = false;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public boolean f15137J = false;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public boolean f15138K = false;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final ArrayList f15139L = new ArrayList();

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final CopyOnWriteArrayList f15140M = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public boolean f15142O = false;

    public k(Context context) {
        boolean zB;
        boolean z4 = false;
        this.f15144a = context;
        Resources resources = context.getResources();
        this.f15145b = resources;
        this.f15149f = new ArrayList();
        this.f15150x = new ArrayList();
        this.f15151y = true;
        this.f15152z = new ArrayList();
        this.f15128A = new ArrayList();
        this.f15129B = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Method method = Y.f5042a;
            if (Build.VERSION.SDK_INT >= 28) {
                zB = W.b(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                zB = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (zB) {
                z4 = true;
            }
        }
        this.f15147d = z4;
    }

    public final m a(int i7, int i8, int i9, CharSequence charSequence) {
        int i10;
        int i11 = ((-65536) & i9) >> 16;
        if (i11 < 0 || i11 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i12 = (f15127Q[i11] << 16) | (65535 & i9);
        m mVar = new m(this, i7, i8, i9, i12, charSequence, this.f15130C);
        ArrayList arrayList = this.f15149f;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((m) arrayList.get(size)).f15179d <= i12) {
                i10 = size + 1;
                arrayList.add(i10, mVar);
                p(true);
                return mVar;
            }
        }
        i10 = 0;
        arrayList.add(i10, mVar);
        p(true);
        return mVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i7, int i8, int i9, ComponentName componentName, Intent[] intentArr, Intent intent, int i10, MenuItem[] menuItemArr) {
        int i11;
        PackageManager packageManager = this.f15144a.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i10 & 1) == 0) {
            removeGroup(i7);
        }
        for (int i12 = 0; i12 < size; i12++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i12);
            int i13 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i13 < 0 ? intent : intentArr[i13]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            m mVarA = a(i7, i8, i9, resolveInfo.loadLabel(packageManager));
            mVarA.setIcon(resolveInfo.loadIcon(packageManager));
            mVarA.f15182x = intent2;
            if (menuItemArr != null && (i11 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i11] = mVarA;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final void b(x xVar, Context context) {
        this.f15140M.add(new WeakReference(xVar));
        xVar.c(context, this);
        this.f15129B = true;
    }

    public final void c(boolean z4) {
        if (this.f15138K) {
            return;
        }
        this.f15138K = true;
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f15140M;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            x xVar = (x) weakReference.get();
            if (xVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                xVar.a(this, z4);
            }
        }
        this.f15138K = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        m mVar = this.f15141N;
        if (mVar != null) {
            d(mVar);
        }
        this.f15149f.clear();
        p(true);
    }

    public final void clearHeader() {
        this.f15132E = null;
        this.f15131D = null;
        this.f15133F = null;
        p(false);
    }

    @Override // android.view.Menu
    public final void close() {
        c(true);
    }

    public boolean d(m mVar) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f15140M;
        boolean zJ = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f15141N == mVar) {
            w();
            for (WeakReference weakReference : copyOnWriteArrayList) {
                x xVar = (x) weakReference.get();
                if (xVar != null) {
                    zJ = xVar.j(mVar);
                    if (zJ) {
                        break;
                    }
                } else {
                    copyOnWriteArrayList.remove(weakReference);
                }
            }
            v();
            if (zJ) {
                this.f15141N = null;
            }
        }
        return zJ;
    }

    public boolean e(k kVar, MenuItem menuItem) {
        i iVar = this.f15148e;
        return iVar != null && iVar.e(kVar, menuItem);
    }

    public boolean f(m mVar) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f15140M;
        boolean zG = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        w();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            x xVar = (x) weakReference.get();
            if (xVar != null) {
                zG = xVar.g(mVar);
                if (zG) {
                    break;
                }
            } else {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        v();
        if (zG) {
            this.f15141N = mVar;
        }
        return zG;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i7) {
        MenuItem menuItemFindItem;
        ArrayList arrayList = this.f15149f;
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            m mVar = (m) arrayList.get(i8);
            if (mVar.f15176a == i7) {
                return mVar;
            }
            if (mVar.hasSubMenu() && (menuItemFindItem = mVar.f15161F.findItem(i7)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    public final m g(int i7, KeyEvent keyEvent) {
        ArrayList arrayList = this.f15139L;
        arrayList.clear();
        h(arrayList, i7, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (m) arrayList.get(0);
        }
        boolean zN = n();
        for (int i8 = 0; i8 < size; i8++) {
            m mVar = (m) arrayList.get(i8);
            char c3 = zN ? mVar.f15156A : mVar.f15183y;
            char[] cArr = keyData.meta;
            if ((c3 == cArr[0] && (metaState & 2) == 0) || ((c3 == cArr[2] && (metaState & 2) != 0) || (zN && c3 == '\b' && i7 == 67))) {
                return mVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i7) {
        return (MenuItem) this.f15149f.get(i7);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0069  */
    public final void h(ArrayList arrayList, int i7, KeyEvent keyEvent) {
        boolean zN = n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i7 == 67) {
            ArrayList arrayList2 = this.f15149f;
            int size = arrayList2.size();
            for (int i8 = 0; i8 < size; i8++) {
                m mVar = (m) arrayList2.get(i8);
                if (mVar.hasSubMenu()) {
                    mVar.f15161F.h(arrayList, i7, keyEvent);
                }
                char c3 = zN ? mVar.f15156A : mVar.f15183y;
                if ((modifiers & 69647) == ((zN ? mVar.f15157B : mVar.f15184z) & 69647) && c3 != 0) {
                    char[] cArr = keyData.meta;
                    if (c3 != cArr[0] && c3 != cArr[2]) {
                        if (zN && c3 == '\b') {
                            if (i7 == 67) {
                            }
                        }
                    }
                    if (mVar.isEnabled()) {
                        arrayList.add(mVar);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.f15143P) {
            return true;
        }
        ArrayList arrayList = this.f15149f;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (((m) arrayList.get(i7)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        ArrayList arrayListL = l();
        if (this.f15129B) {
            CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f15140M;
            boolean zD = false;
            for (WeakReference weakReference : copyOnWriteArrayList) {
                x xVar = (x) weakReference.get();
                if (xVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    zD |= xVar.d();
                }
            }
            ArrayList arrayList = this.f15152z;
            ArrayList arrayList2 = this.f15128A;
            if (zD) {
                arrayList.clear();
                arrayList2.clear();
                int size = arrayListL.size();
                for (int i7 = 0; i7 < size; i7++) {
                    m mVar = (m) arrayListL.get(i7);
                    if (mVar.f()) {
                        arrayList.add(mVar);
                    } else {
                        arrayList2.add(mVar);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(l());
            }
            this.f15129B = false;
        }
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i7, KeyEvent keyEvent) {
        return g(i7, keyEvent) != null;
    }

    public String j() {
        return "android:menu:actionviewstates";
    }

    public final ArrayList l() {
        boolean z4 = this.f15151y;
        ArrayList arrayList = this.f15150x;
        if (!z4) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f15149f;
        int size = arrayList2.size();
        for (int i7 = 0; i7 < size; i7++) {
            m mVar = (m) arrayList2.get(i7);
            if (mVar.isVisible()) {
                arrayList.add(mVar);
            }
        }
        this.f15151y = false;
        this.f15129B = true;
        return arrayList;
    }

    public boolean m() {
        return this.f15142O;
    }

    public boolean n() {
        return this.f15146c;
    }

    public boolean o() {
        return this.f15147d;
    }

    public final void p(boolean z4) {
        if (this.f15134G) {
            this.f15135H = true;
            if (z4) {
                this.f15136I = true;
                return;
            }
            return;
        }
        if (z4) {
            this.f15151y = true;
            this.f15129B = true;
        }
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f15140M;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        w();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            x xVar = (x) weakReference.get();
            if (xVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                xVar.f();
            }
        }
        v();
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i7, int i8) {
        return q(findItem(i7), null, i8);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i7, KeyEvent keyEvent, int i8) {
        m mVarG = g(i7, keyEvent);
        boolean zQ = mVarG != null ? q(mVarG, null, i8) : false;
        if ((i8 & 2) != 0) {
            c(true);
        }
        return zQ;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0018  */
    /* JADX WARN: Code duplicated, block: B:32:0x0056  */
    /* JADX WARN: Code duplicated, block: B:35:0x005d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0064  */
    /* JADX WARN: Code duplicated, block: B:38:0x0069  */
    /* JADX WARN: Code duplicated, block: B:45:0x007a  */
    /* JADX WARN: Code duplicated, block: B:47:0x007e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0087  */
    /* JADX WARN: Code duplicated, block: B:53:0x0099  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ae A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:62:0x00be  */
    /* JADX WARN: Code duplicated, block: B:69:0x00da  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x00d2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x00cc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x00b8 A[SYNTHETIC] */
    public final boolean q(MenuItem menuItem, x xVar, int i7) {
        AbstractC0347c abstractC0347c;
        boolean zExpandActionView;
        AbstractC0347c abstractC0347c2;
        boolean z4;
        D d7;
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList;
        x xVar2;
        m mVar = (m) menuItem;
        boolean zI = false;
        if (mVar == null || !mVar.isEnabled()) {
            return false;
        }
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = mVar.f15162G;
        if (onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(mVar)) {
            k kVar = mVar.f15160E;
            if (kVar.e(kVar, mVar)) {
                zExpandActionView = true;
            } else {
                Intent intent = mVar.f15182x;
                if (intent != null) {
                    try {
                        kVar.f15144a.startActivity(intent);
                    } catch (ActivityNotFoundException e7) {
                        Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e7);
                        abstractC0347c = mVar.f15173R;
                        if (abstractC0347c == null) {
                        }
                        zExpandActionView = false;
                        abstractC0347c2 = mVar.f15173R;
                        if (abstractC0347c2 == null) {
                            z4 = false;
                        } else {
                            z4 = false;
                        }
                        if (mVar.e()) {
                            zExpandActionView |= mVar.expandActionView();
                            if (zExpandActionView) {
                                c(true);
                            }
                        } else if (mVar.hasSubMenu()) {
                            if ((i7 & 4) == 0) {
                                c(false);
                            }
                            if (!mVar.hasSubMenu()) {
                                D d8 = new D(this.f15144a, this, mVar);
                                mVar.f15161F = d8;
                                d8.setHeaderTitle(mVar.f15180e);
                            }
                            d7 = mVar.f15161F;
                            if (z4) {
                                n nVar = (n) abstractC0347c2;
                                nVar.f15186c.getClass();
                                nVar.f15185b.onPrepareSubMenu(d7);
                            }
                            copyOnWriteArrayList = this.f15140M;
                            if (!copyOnWriteArrayList.isEmpty()) {
                                if (xVar != null) {
                                }
                                for (WeakReference weakReference : copyOnWriteArrayList) {
                                    xVar2 = (x) weakReference.get();
                                    if (xVar2 == null) {
                                        copyOnWriteArrayList.remove(weakReference);
                                    } else if (!zI) {
                                        zI = xVar2.i(d7);
                                    }
                                }
                            }
                            zExpandActionView |= zI;
                            if (!zExpandActionView) {
                                c(true);
                            }
                        } else {
                            if ((i7 & 4) == 0) {
                                c(false);
                            }
                            if (!mVar.hasSubMenu()) {
                                D d9 = new D(this.f15144a, this, mVar);
                                mVar.f15161F = d9;
                                d9.setHeaderTitle(mVar.f15180e);
                            }
                            d7 = mVar.f15161F;
                            if (z4) {
                                n nVar2 = (n) abstractC0347c2;
                                nVar2.f15186c.getClass();
                                nVar2.f15185b.onPrepareSubMenu(d7);
                            }
                            copyOnWriteArrayList = this.f15140M;
                            if (!copyOnWriteArrayList.isEmpty()) {
                                zI = xVar != null ? xVar.i(d7) : false;
                                while (r8.hasNext()) {
                                    xVar2 = (x) weakReference.get();
                                    if (xVar2 == null) {
                                        copyOnWriteArrayList.remove(weakReference);
                                    } else if (!zI) {
                                        zI = xVar2.i(d7);
                                    }
                                }
                            }
                            zExpandActionView |= zI;
                            if (!zExpandActionView) {
                                c(true);
                            }
                        }
                        return zExpandActionView;
                    }
                    zExpandActionView = true;
                } else {
                    abstractC0347c = mVar.f15173R;
                    if (abstractC0347c == null && ((n) abstractC0347c).f15185b.onPerformDefaultAction()) {
                        zExpandActionView = true;
                    } else {
                        zExpandActionView = false;
                    }
                }
            }
        } else {
            zExpandActionView = true;
        }
        abstractC0347c2 = mVar.f15173R;
        if (abstractC0347c2 == null && ((n) abstractC0347c2).f15185b.hasSubMenu()) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (mVar.e()) {
            zExpandActionView |= mVar.expandActionView();
            if (zExpandActionView) {
                c(true);
            }
        } else if (mVar.hasSubMenu() || z4) {
            if ((i7 & 4) == 0) {
                c(false);
            }
            if (!mVar.hasSubMenu()) {
                D d10 = new D(this.f15144a, this, mVar);
                mVar.f15161F = d10;
                d10.setHeaderTitle(mVar.f15180e);
            }
            d7 = mVar.f15161F;
            if (z4) {
                n nVar3 = (n) abstractC0347c2;
                nVar3.f15186c.getClass();
                nVar3.f15185b.onPrepareSubMenu(d7);
            }
            copyOnWriteArrayList = this.f15140M;
            if (!copyOnWriteArrayList.isEmpty()) {
                if (xVar != null) {
                }
                while (r8.hasNext()) {
                    xVar2 = (x) weakReference.get();
                    if (xVar2 == null) {
                        copyOnWriteArrayList.remove(weakReference);
                    } else if (!zI) {
                        zI = xVar2.i(d7);
                    }
                }
            }
            zExpandActionView |= zI;
            if (!zExpandActionView) {
                c(true);
            }
        } else if ((i7 & 1) == 0) {
            c(true);
        }
        return zExpandActionView;
    }

    public final void r(x xVar) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f15140M;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            x xVar2 = (x) weakReference.get();
            if (xVar2 == null || xVar2 == xVar) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i7) {
        ArrayList arrayList = this.f15149f;
        int size = arrayList.size();
        int i8 = 0;
        int i9 = 0;
        while (true) {
            if (i9 >= size) {
                i9 = -1;
                break;
            } else if (((m) arrayList.get(i9)).f15177b == i7) {
                break;
            } else {
                i9++;
            }
        }
        if (i9 >= 0) {
            int size2 = arrayList.size() - i9;
            while (true) {
                int i10 = i8 + 1;
                if (i8 >= size2 || ((m) arrayList.get(i9)).f15177b != i7) {
                    break;
                }
                if (i9 >= 0) {
                    ArrayList arrayList2 = this.f15149f;
                    if (i9 < arrayList2.size()) {
                        arrayList2.remove(i9);
                    }
                }
                i8 = i10;
            }
            p(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i7) {
        ArrayList arrayList = this.f15149f;
        int size = arrayList.size();
        int i8 = 0;
        while (true) {
            if (i8 >= size) {
                i8 = -1;
                break;
            } else if (((m) arrayList.get(i8)).f15176a == i7) {
                break;
            } else {
                i8++;
            }
        }
        if (i8 >= 0) {
            ArrayList arrayList2 = this.f15149f;
            if (i8 >= arrayList2.size()) {
                return;
            }
            arrayList2.remove(i8);
            p(true);
        }
    }

    public final void s(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(j());
        int size = this.f15149f.size();
        for (int i7 = 0; i7 < size; i7++) {
            MenuItem item = getItem(i7);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((D) item.getSubMenu()).s(bundle);
            }
        }
        int i8 = bundle.getInt("android:menu:expandedactionview");
        if (i8 <= 0 || (menuItemFindItem = findItem(i8)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i7, boolean z4, boolean z7) {
        ArrayList arrayList = this.f15149f;
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            m mVar = (m) arrayList.get(i8);
            if (mVar.f15177b == i7) {
                mVar.f15170O = (mVar.f15170O & (-5)) | (z7 ? 4 : 0);
                mVar.setCheckable(z4);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z4) {
        this.f15142O = z4;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i7, boolean z4) {
        ArrayList arrayList = this.f15149f;
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            m mVar = (m) arrayList.get(i8);
            if (mVar.f15177b == i7) {
                mVar.setEnabled(z4);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i7, boolean z4) {
        ArrayList arrayList = this.f15149f;
        int size = arrayList.size();
        boolean z7 = false;
        for (int i8 = 0; i8 < size; i8++) {
            m mVar = (m) arrayList.get(i8);
            if (mVar.f15177b == i7) {
                int i9 = mVar.f15170O;
                int i10 = (i9 & (-9)) | (z4 ? 0 : 8);
                mVar.f15170O = i10;
                if (i9 != i10) {
                    z7 = true;
                }
            }
        }
        if (z7) {
            p(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z4) {
        this.f15146c = z4;
        p(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f15149f.size();
    }

    public final void t(Bundle bundle) {
        int size = this.f15149f.size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i7 = 0; i7 < size; i7++) {
            MenuItem item = getItem(i7);
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
                ((D) item.getSubMenu()).t(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(j(), sparseArray);
        }
    }

    public final void u(int i7, CharSequence charSequence, int i8, Drawable drawable, View view) {
        if (view != null) {
            this.f15133F = view;
            this.f15131D = null;
            this.f15132E = null;
        } else {
            if (i7 > 0) {
                this.f15131D = this.f15145b.getText(i7);
            } else if (charSequence != null) {
                this.f15131D = charSequence;
            }
            if (i8 > 0) {
                this.f15132E = h.getDrawable(this.f15144a, i8);
            } else if (drawable != null) {
                this.f15132E = drawable;
            }
            this.f15133F = null;
        }
        p(false);
    }

    public final void v() {
        this.f15134G = false;
        if (this.f15135H) {
            this.f15135H = false;
            p(this.f15136I);
        }
    }

    public final void w() {
        if (this.f15134G) {
            return;
        }
        this.f15134G = true;
        this.f15135H = false;
        this.f15136I = false;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i7) {
        return a(0, 0, 0, this.f15145b.getString(i7));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i7) {
        return addSubMenu(0, 0, 0, this.f15145b.getString(i7));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i7, int i8, int i9, CharSequence charSequence) {
        return a(i7, i8, i9, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i7, int i8, int i9, CharSequence charSequence) {
        m mVarA = a(i7, i8, i9, charSequence);
        D d7 = new D(this.f15144a, this, mVarA);
        mVarA.f15161F = d7;
        d7.setHeaderTitle(mVarA.f15180e);
        return d7;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i7, int i8, int i9, int i10) {
        return a(i7, i8, i9, this.f15145b.getString(i10));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i7, int i8, int i9, int i10) {
        return addSubMenu(i7, i8, i9, this.f15145b.getString(i10));
    }

    public k k() {
        return this;
    }
}
