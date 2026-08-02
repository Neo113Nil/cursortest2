package m;

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
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class k implements Menu {

    /* renamed from: Q, reason: collision with root package name */
    public static final int[] f15121Q = {1, 4, 5, 3, 2, 0};

    /* renamed from: A, reason: collision with root package name */
    public final ArrayList f15122A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f15123B;

    /* renamed from: D, reason: collision with root package name */
    public CharSequence f15125D;

    /* renamed from: E, reason: collision with root package name */
    public Drawable f15126E;

    /* renamed from: F, reason: collision with root package name */
    public View f15127F;

    /* renamed from: N, reason: collision with root package name */
    public m f15135N;

    /* renamed from: P, reason: collision with root package name */
    public boolean f15137P;

    /* renamed from: a, reason: collision with root package name */
    public final Context f15138a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources f15139b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f15140c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f15141d;

    /* renamed from: e, reason: collision with root package name */
    public i f15142e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f15143f;

    /* renamed from: x, reason: collision with root package name */
    public final ArrayList f15144x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f15145y;

    /* renamed from: z, reason: collision with root package name */
    public final ArrayList f15146z;

    /* renamed from: C, reason: collision with root package name */
    public int f15124C = 0;

    /* renamed from: G, reason: collision with root package name */
    public boolean f15128G = false;

    /* renamed from: H, reason: collision with root package name */
    public boolean f15129H = false;

    /* renamed from: I, reason: collision with root package name */
    public boolean f15130I = false;

    /* renamed from: J, reason: collision with root package name */
    public boolean f15131J = false;

    /* renamed from: K, reason: collision with root package name */
    public boolean f15132K = false;

    /* renamed from: L, reason: collision with root package name */
    public final ArrayList f15133L = new ArrayList();

    /* renamed from: M, reason: collision with root package name */
    public final CopyOnWriteArrayList f15134M = new CopyOnWriteArrayList();

    /* renamed from: O, reason: collision with root package name */
    public boolean f15136O = false;

    public k(Context context) {
        boolean z4;
        boolean z7 = false;
        this.f15138a = context;
        Resources resources = context.getResources();
        this.f15139b = resources;
        this.f15143f = new ArrayList();
        this.f15144x = new ArrayList();
        this.f15145y = true;
        this.f15146z = new ArrayList();
        this.f15122A = new ArrayList();
        this.f15123B = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Method method = Y.f5042a;
            if (Build.VERSION.SDK_INT >= 28) {
                z4 = W.b(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                z4 = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (z4) {
                z7 = true;
            }
        }
        this.f15141d = z7;
    }

    public final m a(int i7, int i8, int i9, CharSequence charSequence) {
        int i10;
        int i11 = ((-65536) & i9) >> 16;
        if (i11 < 0 || i11 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i12 = (f15121Q[i11] << 16) | (65535 & i9);
        m mVar = new m(this, i7, i8, i9, i12, charSequence, this.f15124C);
        ArrayList arrayList = this.f15143f;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i10 = 0;
                break;
            }
            if (((m) arrayList.get(size)).f15173d <= i12) {
                i10 = size + 1;
                break;
            }
            size--;
        }
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
        PackageManager packageManager = this.f15138a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i10 & 1) == 0) {
            removeGroup(i7);
        }
        for (int i12 = 0; i12 < size; i12++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i12);
            int i13 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i13 < 0 ? intent : intentArr[i13]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            m a2 = a(i7, i8, i9, resolveInfo.loadLabel(packageManager));
            a2.setIcon(resolveInfo.loadIcon(packageManager));
            a2.f15176x = intent2;
            if (menuItemArr != null && (i11 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i11] = a2;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final void b(x xVar, Context context) {
        this.f15134M.add(new WeakReference(xVar));
        xVar.c(context, this);
        this.f15123B = true;
    }

    public final void c(boolean z4) {
        if (this.f15132K) {
            return;
        }
        this.f15132K = true;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f15134M;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            x xVar = (x) weakReference.get();
            if (xVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                xVar.a(this, z4);
            }
        }
        this.f15132K = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        m mVar = this.f15135N;
        if (mVar != null) {
            d(mVar);
        }
        this.f15143f.clear();
        p(true);
    }

    public final void clearHeader() {
        this.f15126E = null;
        this.f15125D = null;
        this.f15127F = null;
        p(false);
    }

    @Override // android.view.Menu
    public final void close() {
        c(true);
    }

    public boolean d(m mVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f15134M;
        boolean z4 = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f15135N == mVar) {
            w();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                x xVar = (x) weakReference.get();
                if (xVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z4 = xVar.j(mVar);
                    if (z4) {
                        break;
                    }
                }
            }
            v();
            if (z4) {
                this.f15135N = null;
            }
        }
        return z4;
    }

    public boolean e(k kVar, MenuItem menuItem) {
        i iVar = this.f15142e;
        return iVar != null && iVar.e(kVar, menuItem);
    }

    public boolean f(m mVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f15134M;
        boolean z4 = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        w();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            x xVar = (x) weakReference.get();
            if (xVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                z4 = xVar.g(mVar);
                if (z4) {
                    break;
                }
            }
        }
        v();
        if (z4) {
            this.f15135N = mVar;
        }
        return z4;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i7) {
        MenuItem findItem;
        ArrayList arrayList = this.f15143f;
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            m mVar = (m) arrayList.get(i8);
            if (mVar.f15170a == i7) {
                return mVar;
            }
            if (mVar.hasSubMenu() && (findItem = mVar.f15155F.findItem(i7)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public final m g(int i7, KeyEvent keyEvent) {
        ArrayList arrayList = this.f15133L;
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
        boolean n2 = n();
        for (int i8 = 0; i8 < size; i8++) {
            m mVar = (m) arrayList.get(i8);
            char c3 = n2 ? mVar.f15150A : mVar.f15177y;
            char[] cArr = keyData.meta;
            if ((c3 == cArr[0] && (metaState & 2) == 0) || ((c3 == cArr[2] && (metaState & 2) != 0) || (n2 && c3 == '\b' && i7 == 67))) {
                return mVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i7) {
        return (MenuItem) this.f15143f.get(i7);
    }

    public final void h(ArrayList arrayList, int i7, KeyEvent keyEvent) {
        int i8;
        boolean n2 = n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i7 == 67) {
            ArrayList arrayList2 = this.f15143f;
            int size = arrayList2.size();
            for (0; i8 < size; i8 + 1) {
                m mVar = (m) arrayList2.get(i8);
                if (mVar.hasSubMenu()) {
                    mVar.f15155F.h(arrayList, i7, keyEvent);
                }
                char c3 = n2 ? mVar.f15150A : mVar.f15177y;
                if ((modifiers & 69647) == ((n2 ? mVar.f15151B : mVar.f15178z) & 69647) && c3 != 0) {
                    char[] cArr = keyData.meta;
                    if (c3 != cArr[0] && c3 != cArr[2]) {
                        if (n2 && c3 == '\b') {
                            i8 = i7 != 67 ? i8 + 1 : 0;
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
        if (this.f15137P) {
            return true;
        }
        ArrayList arrayList = this.f15143f;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (((m) arrayList.get(i7)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        ArrayList l7 = l();
        if (this.f15123B) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.f15134M;
            Iterator it = copyOnWriteArrayList.iterator();
            boolean z4 = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                x xVar = (x) weakReference.get();
                if (xVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z4 |= xVar.d();
                }
            }
            ArrayList arrayList = this.f15146z;
            ArrayList arrayList2 = this.f15122A;
            if (z4) {
                arrayList.clear();
                arrayList2.clear();
                int size = l7.size();
                for (int i7 = 0; i7 < size; i7++) {
                    m mVar = (m) l7.get(i7);
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
            this.f15123B = false;
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
        boolean z4 = this.f15145y;
        ArrayList arrayList = this.f15144x;
        if (!z4) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f15143f;
        int size = arrayList2.size();
        for (int i7 = 0; i7 < size; i7++) {
            m mVar = (m) arrayList2.get(i7);
            if (mVar.isVisible()) {
                arrayList.add(mVar);
            }
        }
        this.f15145y = false;
        this.f15123B = true;
        return arrayList;
    }

    public boolean m() {
        return this.f15136O;
    }

    public boolean n() {
        return this.f15140c;
    }

    public boolean o() {
        return this.f15141d;
    }

    public final void p(boolean z4) {
        if (this.f15128G) {
            this.f15129H = true;
            if (z4) {
                this.f15130I = true;
                return;
            }
            return;
        }
        if (z4) {
            this.f15145y = true;
            this.f15123B = true;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.f15134M;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        w();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
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
        m g3 = g(i7, keyEvent);
        boolean q7 = g3 != null ? q(g3, null, i8) : false;
        if ((i8 & 2) != 0) {
            c(true);
        }
        return q7;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean q(MenuItem menuItem, x xVar, int i7) {
        boolean z4;
        m mVar = (m) menuItem;
        if (mVar == null || !mVar.isEnabled()) {
            return false;
        }
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = mVar.f15156G;
        if (onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(mVar)) {
            k kVar = mVar.f15154E;
            if (!kVar.e(kVar, mVar)) {
                Intent intent = mVar.f15176x;
                if (intent != null) {
                    try {
                        kVar.f15138a.startActivity(intent);
                    } catch (ActivityNotFoundException e7) {
                        Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e7);
                    }
                }
                AbstractC0347c abstractC0347c = mVar.f15167R;
                if (abstractC0347c == null || !((n) abstractC0347c).f15179b.onPerformDefaultAction()) {
                    z4 = false;
                    AbstractC0347c abstractC0347c2 = mVar.f15167R;
                    boolean z7 = abstractC0347c2 == null && ((n) abstractC0347c2).f15179b.hasSubMenu();
                    if (!mVar.e()) {
                        z4 |= mVar.expandActionView();
                        if (z4) {
                            c(true);
                        }
                    } else if (mVar.hasSubMenu() || z7) {
                        if ((i7 & 4) == 0) {
                            c(false);
                        }
                        if (!mVar.hasSubMenu()) {
                            SubMenuC1416D subMenuC1416D = new SubMenuC1416D(this.f15138a, this, mVar);
                            mVar.f15155F = subMenuC1416D;
                            subMenuC1416D.setHeaderTitle(mVar.f15174e);
                        }
                        SubMenuC1416D subMenuC1416D2 = mVar.f15155F;
                        if (z7) {
                            n nVar = (n) abstractC0347c2;
                            nVar.f15180c.getClass();
                            nVar.f15179b.onPrepareSubMenu(subMenuC1416D2);
                        }
                        CopyOnWriteArrayList copyOnWriteArrayList = this.f15134M;
                        if (!copyOnWriteArrayList.isEmpty()) {
                            r0 = xVar != null ? xVar.i(subMenuC1416D2) : false;
                            Iterator it = copyOnWriteArrayList.iterator();
                            while (it.hasNext()) {
                                WeakReference weakReference = (WeakReference) it.next();
                                x xVar2 = (x) weakReference.get();
                                if (xVar2 == null) {
                                    copyOnWriteArrayList.remove(weakReference);
                                } else if (!r0) {
                                    r0 = xVar2.i(subMenuC1416D2);
                                }
                            }
                        }
                        z4 |= r0;
                        if (!z4) {
                            c(true);
                        }
                    } else if ((i7 & 1) == 0) {
                        c(true);
                    }
                    return z4;
                }
            }
        }
        z4 = true;
        AbstractC0347c abstractC0347c22 = mVar.f15167R;
        if (abstractC0347c22 == null) {
        }
        if (!mVar.e()) {
        }
        return z4;
    }

    public final void r(x xVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f15134M;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            x xVar2 = (x) weakReference.get();
            if (xVar2 == null || xVar2 == xVar) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i7) {
        ArrayList arrayList = this.f15143f;
        int size = arrayList.size();
        int i8 = 0;
        int i9 = 0;
        while (true) {
            if (i9 >= size) {
                i9 = -1;
                break;
            } else if (((m) arrayList.get(i9)).f15171b == i7) {
                break;
            } else {
                i9++;
            }
        }
        if (i9 >= 0) {
            int size2 = arrayList.size() - i9;
            while (true) {
                int i10 = i8 + 1;
                if (i8 >= size2 || ((m) arrayList.get(i9)).f15171b != i7) {
                    break;
                }
                if (i9 >= 0) {
                    ArrayList arrayList2 = this.f15143f;
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
        ArrayList arrayList = this.f15143f;
        int size = arrayList.size();
        int i8 = 0;
        while (true) {
            if (i8 >= size) {
                i8 = -1;
                break;
            } else if (((m) arrayList.get(i8)).f15170a == i7) {
                break;
            } else {
                i8++;
            }
        }
        if (i8 >= 0) {
            ArrayList arrayList2 = this.f15143f;
            if (i8 >= arrayList2.size()) {
                return;
            }
            arrayList2.remove(i8);
            p(true);
        }
    }

    public final void s(Bundle bundle) {
        MenuItem findItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(j());
        int size = this.f15143f.size();
        for (int i7 = 0; i7 < size; i7++) {
            MenuItem item = getItem(i7);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((SubMenuC1416D) item.getSubMenu()).s(bundle);
            }
        }
        int i8 = bundle.getInt("android:menu:expandedactionview");
        if (i8 <= 0 || (findItem = findItem(i8)) == null) {
            return;
        }
        findItem.expandActionView();
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i7, boolean z4, boolean z7) {
        ArrayList arrayList = this.f15143f;
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            m mVar = (m) arrayList.get(i8);
            if (mVar.f15171b == i7) {
                mVar.f15164O = (mVar.f15164O & (-5)) | (z7 ? 4 : 0);
                mVar.setCheckable(z4);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z4) {
        this.f15136O = z4;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i7, boolean z4) {
        ArrayList arrayList = this.f15143f;
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            m mVar = (m) arrayList.get(i8);
            if (mVar.f15171b == i7) {
                mVar.setEnabled(z4);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i7, boolean z4) {
        ArrayList arrayList = this.f15143f;
        int size = arrayList.size();
        boolean z7 = false;
        for (int i8 = 0; i8 < size; i8++) {
            m mVar = (m) arrayList.get(i8);
            if (mVar.f15171b == i7) {
                int i9 = mVar.f15164O;
                int i10 = (i9 & (-9)) | (z4 ? 0 : 8);
                mVar.f15164O = i10;
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
        this.f15140c = z4;
        p(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f15143f.size();
    }

    public final void t(Bundle bundle) {
        int size = this.f15143f.size();
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
                ((SubMenuC1416D) item.getSubMenu()).t(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(j(), sparseArray);
        }
    }

    public final void u(int i7, CharSequence charSequence, int i8, Drawable drawable, View view) {
        if (view != null) {
            this.f15127F = view;
            this.f15125D = null;
            this.f15126E = null;
        } else {
            if (i7 > 0) {
                this.f15125D = this.f15139b.getText(i7);
            } else if (charSequence != null) {
                this.f15125D = charSequence;
            }
            if (i8 > 0) {
                this.f15126E = G.h.getDrawable(this.f15138a, i8);
            } else if (drawable != null) {
                this.f15126E = drawable;
            }
            this.f15127F = null;
        }
        p(false);
    }

    public final void v() {
        this.f15128G = false;
        if (this.f15129H) {
            this.f15129H = false;
            p(this.f15130I);
        }
    }

    public final void w() {
        if (this.f15128G) {
            return;
        }
        this.f15128G = true;
        this.f15129H = false;
        this.f15130I = false;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i7) {
        return a(0, 0, 0, this.f15139b.getString(i7));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i7) {
        return addSubMenu(0, 0, 0, this.f15139b.getString(i7));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i7, int i8, int i9, CharSequence charSequence) {
        return a(i7, i8, i9, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i7, int i8, int i9, CharSequence charSequence) {
        m a2 = a(i7, i8, i9, charSequence);
        SubMenuC1416D subMenuC1416D = new SubMenuC1416D(this.f15138a, this, a2);
        a2.f15155F = subMenuC1416D;
        subMenuC1416D.setHeaderTitle(a2.f15174e);
        return subMenuC1416D;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i7, int i8, int i9, int i10) {
        return a(i7, i8, i9, this.f15139b.getString(i10));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i7, int i8, int i9, int i10) {
        return addSubMenu(i7, i8, i9, this.f15139b.getString(i10));
    }

    public k k() {
        return this;
    }
}
