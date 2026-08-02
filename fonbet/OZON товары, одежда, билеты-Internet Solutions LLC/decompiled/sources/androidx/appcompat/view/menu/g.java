package androidx.appcompat.view.menu;

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
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import androidx.core.view.AbstractC5307b;
import androidx.core.view.C5306a0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import s2.InterfaceMenuC9584a;

/* loaded from: classes8.dex */
public class g implements InterfaceMenuC9584a {

    /* renamed from: y, reason: collision with root package name */
    private static final int[] f37410y = {1, 4, 5, 3, 2, 0};

    /* renamed from: a, reason: collision with root package name */
    private final Context f37411a;

    /* renamed from: b, reason: collision with root package name */
    private final Resources f37412b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f37413c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f37414d;

    /* renamed from: e, reason: collision with root package name */
    private a f37415e;

    /* renamed from: f, reason: collision with root package name */
    private ArrayList<i> f37416f;

    /* renamed from: g, reason: collision with root package name */
    private ArrayList<i> f37417g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f37418h;

    /* renamed from: i, reason: collision with root package name */
    private ArrayList<i> f37419i;

    /* renamed from: j, reason: collision with root package name */
    private ArrayList<i> f37420j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f37421k;

    /* renamed from: m, reason: collision with root package name */
    CharSequence f37423m;

    /* renamed from: n, reason: collision with root package name */
    Drawable f37424n;

    /* renamed from: o, reason: collision with root package name */
    View f37425o;

    /* renamed from: v, reason: collision with root package name */
    private i f37432v;

    /* renamed from: x, reason: collision with root package name */
    private boolean f37434x;

    /* renamed from: l, reason: collision with root package name */
    private int f37422l = 0;

    /* renamed from: p, reason: collision with root package name */
    private boolean f37426p = false;

    /* renamed from: q, reason: collision with root package name */
    private boolean f37427q = false;

    /* renamed from: r, reason: collision with root package name */
    private boolean f37428r = false;

    /* renamed from: s, reason: collision with root package name */
    private boolean f37429s = false;

    /* renamed from: t, reason: collision with root package name */
    private ArrayList<i> f37430t = new ArrayList<>();

    /* renamed from: u, reason: collision with root package name */
    private CopyOnWriteArrayList<WeakReference<m>> f37431u = new CopyOnWriteArrayList<>();

    /* renamed from: w, reason: collision with root package name */
    private boolean f37433w = false;

    /* loaded from: classes.dex */
    public interface a {
        void a(@NonNull g gVar);

        boolean b(@NonNull g gVar, @NonNull i iVar);
    }

    public interface b {
        boolean f(i iVar);
    }

    public g(Context context) {
        boolean z11 = false;
        this.f37411a = context;
        Resources resources = context.getResources();
        this.f37412b = resources;
        this.f37416f = new ArrayList<>();
        this.f37417g = new ArrayList<>();
        this.f37418h = true;
        this.f37419i = new ArrayList<>();
        this.f37420j = new ArrayList<>();
        this.f37421k = true;
        if (resources.getConfiguration().keyboard != 1 && C5306a0.c(ViewConfiguration.get(context), context)) {
            z11 = true;
        }
        this.f37414d = z11;
    }

    private void K(int i11, CharSequence charSequence, int i12, Drawable drawable, View view) {
        if (view != null) {
            this.f37425o = view;
            this.f37423m = null;
            this.f37424n = null;
        } else {
            if (i11 > 0) {
                this.f37423m = this.f37412b.getText(i11);
            } else if (charSequence != null) {
                this.f37423m = charSequence;
            }
            if (i12 > 0) {
                this.f37424n = androidx.core.content.a.getDrawable(this.f37411a, i12);
            } else if (drawable != null) {
                this.f37424n = drawable;
            }
            this.f37425o = null;
        }
        y(false);
    }

    public final void A(m mVar) {
        CopyOnWriteArrayList<WeakReference<m>> copyOnWriteArrayList = this.f37431u;
        Iterator<WeakReference<m>> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference<m> next = it.next();
            m mVar2 = next.get();
            if (mVar2 == null || mVar2 == mVar) {
                copyOnWriteArrayList.remove(next);
            }
        }
    }

    public final void B(Bundle bundle) {
        MenuItem findItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(m());
        int size = this.f37416f.size();
        for (int i11 = 0; i11 < size; i11++) {
            MenuItem item = getItem(i11);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((q) item.getSubMenu()).B(bundle);
            }
        }
        int i12 = bundle.getInt("android:menu:expandedactionview");
        if (i12 <= 0 || (findItem = findItem(i12)) == null) {
            return;
        }
        findItem.expandActionView();
    }

    public final void C(Bundle bundle) {
        Parcelable parcelable;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray != null) {
            CopyOnWriteArrayList<WeakReference<m>> copyOnWriteArrayList = this.f37431u;
            if (copyOnWriteArrayList.isEmpty()) {
                return;
            }
            Iterator<WeakReference<m>> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference<m> next = it.next();
                m mVar = next.get();
                if (mVar == null) {
                    copyOnWriteArrayList.remove(next);
                } else {
                    int id2 = mVar.getId();
                    if (id2 > 0 && (parcelable = (Parcelable) sparseParcelableArray.get(id2)) != null) {
                        mVar.k(parcelable);
                    }
                }
            }
        }
    }

    public final void D(Bundle bundle) {
        int size = this.f37416f.size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i11 = 0; i11 < size; i11++) {
            MenuItem item = getItem(i11);
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
                ((q) item.getSubMenu()).D(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(m(), sparseArray);
        }
    }

    public final void E(Bundle bundle) {
        Parcelable c11;
        CopyOnWriteArrayList<WeakReference<m>> copyOnWriteArrayList = this.f37431u;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
        Iterator<WeakReference<m>> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference<m> next = it.next();
            m mVar = next.get();
            if (mVar == null) {
                copyOnWriteArrayList.remove(next);
            } else {
                int id2 = mVar.getId();
                if (id2 > 0 && (c11 = mVar.c()) != null) {
                    sparseArray.put(id2, c11);
                }
            }
        }
        bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
    }

    public void F(a aVar) {
        this.f37415e = aVar;
    }

    public final void G() {
        this.f37422l = 1;
    }

    final void H(i iVar) {
        int groupId = iVar.getGroupId();
        ArrayList<i> arrayList = this.f37416f;
        int size = arrayList.size();
        Q();
        for (int i11 = 0; i11 < size; i11++) {
            i iVar2 = arrayList.get(i11);
            if (iVar2.getGroupId() == groupId && iVar2.l() && iVar2.isCheckable()) {
                iVar2.p(iVar2 == iVar);
            }
        }
        P();
    }

    protected final void I(int i11) {
        K(0, null, i11, null, null);
    }

    protected final void J(Drawable drawable) {
        K(0, null, 0, drawable, null);
    }

    protected final void L(int i11) {
        K(i11, null, 0, null, null);
    }

    protected final void M(CharSequence charSequence) {
        K(0, charSequence, 0, null, null);
    }

    protected final void N(View view) {
        K(0, null, 0, null, view);
    }

    public final void O(boolean z11) {
        this.f37434x = z11;
    }

    public final void P() {
        this.f37426p = false;
        if (this.f37427q) {
            this.f37427q = false;
            y(this.f37428r);
        }
    }

    public final void Q() {
        if (this.f37426p) {
            return;
        }
        this.f37426p = true;
        this.f37427q = false;
        this.f37428r = false;
    }

    protected i a(int i11, int i12, int i13, CharSequence charSequence) {
        int i14;
        int i15 = ((-65536) & i13) >> 16;
        if (i15 < 0 || i15 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i16 = (f37410y[i15] << 16) | (65535 & i13);
        i iVar = new i(this, i11, i12, i13, i16, charSequence, this.f37422l);
        ArrayList<i> arrayList = this.f37416f;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i14 = 0;
                break;
            }
            if (arrayList.get(size).e() <= i16) {
                i14 = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i14, iVar);
        y(true);
        return iVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i11, int i12, int i13, ComponentName componentName, Intent[] intentArr, Intent intent, int i14, MenuItem[] menuItemArr) {
        int i15;
        PackageManager packageManager = this.f37411a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i14 & 1) == 0) {
            removeGroup(i11);
        }
        for (int i16 = 0; i16 < size; i16++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i16);
            int i17 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i17 < 0 ? intent : intentArr[i17]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            i a11 = a(i11, i12, i13, resolveInfo.loadLabel(packageManager));
            a11.setIcon(resolveInfo.loadIcon(packageManager));
            a11.setIntent(intent2);
            if (menuItemArr != null && (i15 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i15] = a11;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final void b(m mVar) {
        c(mVar, this.f37411a);
    }

    public final void c(m mVar, Context context) {
        this.f37431u.add(new WeakReference<>(mVar));
        mVar.g(context, this);
        this.f37421k = true;
    }

    @Override // android.view.Menu
    public final void clear() {
        i iVar = this.f37432v;
        if (iVar != null) {
            f(iVar);
        }
        this.f37416f.clear();
        y(true);
    }

    public final void clearHeader() {
        this.f37424n = null;
        this.f37423m = null;
        this.f37425o = null;
        y(false);
    }

    @Override // android.view.Menu
    public final void close() {
        e(true);
    }

    public final void d() {
        a aVar = this.f37415e;
        if (aVar != null) {
            aVar.a(this);
        }
    }

    public final void e(boolean z11) {
        if (this.f37429s) {
            return;
        }
        this.f37429s = true;
        CopyOnWriteArrayList<WeakReference<m>> copyOnWriteArrayList = this.f37431u;
        Iterator<WeakReference<m>> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference<m> next = it.next();
            m mVar = next.get();
            if (mVar == null) {
                copyOnWriteArrayList.remove(next);
            } else {
                mVar.b(this, z11);
            }
        }
        this.f37429s = false;
    }

    public boolean f(i iVar) {
        CopyOnWriteArrayList<WeakReference<m>> copyOnWriteArrayList = this.f37431u;
        boolean z11 = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f37432v == iVar) {
            Q();
            Iterator<WeakReference<m>> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference<m> next = it.next();
                m mVar = next.get();
                if (mVar == null) {
                    copyOnWriteArrayList.remove(next);
                } else {
                    z11 = mVar.j(iVar);
                    if (z11) {
                        break;
                    }
                }
            }
            P();
            if (z11) {
                this.f37432v = null;
            }
        }
        return z11;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i11) {
        MenuItem findItem;
        ArrayList<i> arrayList = this.f37416f;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            i iVar = arrayList.get(i12);
            if (iVar.getItemId() == i11) {
                return iVar;
            }
            if (iVar.hasSubMenu() && (findItem = ((g) iVar.getSubMenu()).findItem(i11)) != null) {
                return findItem;
            }
        }
        return null;
    }

    boolean g(@NonNull g gVar, @NonNull i iVar) {
        a aVar = this.f37415e;
        return aVar != null && aVar.b(gVar, iVar);
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i11) {
        return this.f37416f.get(i11);
    }

    public boolean h(i iVar) {
        CopyOnWriteArrayList<WeakReference<m>> copyOnWriteArrayList = this.f37431u;
        boolean z11 = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        Q();
        Iterator<WeakReference<m>> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference<m> next = it.next();
            m mVar = next.get();
            if (mVar == null) {
                copyOnWriteArrayList.remove(next);
            } else {
                z11 = mVar.d(iVar);
                if (z11) {
                    break;
                }
            }
        }
        P();
        if (z11) {
            this.f37432v = iVar;
        }
        return z11;
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.f37434x) {
            return true;
        }
        ArrayList<i> arrayList = this.f37416f;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (arrayList.get(i11).isVisible()) {
                return true;
            }
        }
        return false;
    }

    final i i(int i11, KeyEvent keyEvent) {
        ArrayList<i> arrayList = this.f37430t;
        arrayList.clear();
        j(arrayList, i11, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean u11 = u();
        for (int i12 = 0; i12 < size; i12++) {
            i iVar = arrayList.get(i12);
            char alphabeticShortcut = u11 ? iVar.getAlphabeticShortcut() : iVar.getNumericShortcut();
            char[] cArr = keyData.meta;
            if ((alphabeticShortcut == cArr[0] && (metaState & 2) == 0) || ((alphabeticShortcut == cArr[2] && (metaState & 2) != 0) || (u11 && alphabeticShortcut == '\b' && i11 == 67))) {
                return iVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i11, KeyEvent keyEvent) {
        return i(i11, keyEvent) != null;
    }

    final void j(ArrayList arrayList, int i11, KeyEvent keyEvent) {
        boolean u11 = u();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i11 == 67) {
            ArrayList<i> arrayList2 = this.f37416f;
            int size = arrayList2.size();
            for (int i12 = 0; i12 < size; i12++) {
                i iVar = arrayList2.get(i12);
                if (iVar.hasSubMenu()) {
                    ((g) iVar.getSubMenu()).j(arrayList, i11, keyEvent);
                }
                char alphabeticShortcut = u11 ? iVar.getAlphabeticShortcut() : iVar.getNumericShortcut();
                if ((modifiers & 69647) == ((u11 ? iVar.getAlphabeticModifiers() : iVar.getNumericModifiers()) & 69647) && alphabeticShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if ((alphabeticShortcut == cArr[0] || alphabeticShortcut == cArr[2] || (u11 && alphabeticShortcut == '\b' && i11 == 67)) && iVar.isEnabled()) {
                        arrayList.add(iVar);
                    }
                }
            }
        }
    }

    public final void k() {
        ArrayList<i> r11 = r();
        if (this.f37421k) {
            CopyOnWriteArrayList<WeakReference<m>> copyOnWriteArrayList = this.f37431u;
            Iterator<WeakReference<m>> it = copyOnWriteArrayList.iterator();
            boolean z11 = false;
            while (it.hasNext()) {
                WeakReference<m> next = it.next();
                m mVar = next.get();
                if (mVar == null) {
                    copyOnWriteArrayList.remove(next);
                } else {
                    z11 |= mVar.f();
                }
            }
            ArrayList<i> arrayList = this.f37419i;
            ArrayList<i> arrayList2 = this.f37420j;
            if (z11) {
                arrayList.clear();
                arrayList2.clear();
                int size = r11.size();
                for (int i11 = 0; i11 < size; i11++) {
                    i iVar = r11.get(i11);
                    if (iVar.k()) {
                        arrayList.add(iVar);
                    } else {
                        arrayList2.add(iVar);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(r());
            }
            this.f37421k = false;
        }
    }

    public final ArrayList<i> l() {
        k();
        return this.f37419i;
    }

    protected String m() {
        return "android:menu:actionviewstates";
    }

    public final Context n() {
        return this.f37411a;
    }

    public final i o() {
        return this.f37432v;
    }

    public final ArrayList<i> p() {
        k();
        return this.f37420j;
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i11, int i12) {
        return z(findItem(i11), null, i12);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i11, KeyEvent keyEvent, int i12) {
        i i13 = i(i11, keyEvent);
        boolean z11 = i13 != null ? z(i13, null, i12) : false;
        if ((i12 & 2) != 0) {
            e(true);
        }
        return z11;
    }

    public g q() {
        return this;
    }

    @NonNull
    public final ArrayList<i> r() {
        boolean z11 = this.f37418h;
        ArrayList<i> arrayList = this.f37417g;
        if (!z11) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList<i> arrayList2 = this.f37416f;
        int size = arrayList2.size();
        for (int i11 = 0; i11 < size; i11++) {
            i iVar = arrayList2.get(i11);
            if (iVar.isVisible()) {
                arrayList.add(iVar);
            }
        }
        this.f37418h = false;
        this.f37421k = true;
        return arrayList;
    }

    @Override // android.view.Menu
    public final void removeGroup(int i11) {
        ArrayList<i> arrayList = this.f37416f;
        int size = arrayList.size();
        int i12 = 0;
        int i13 = 0;
        while (true) {
            if (i13 >= size) {
                i13 = -1;
                break;
            } else if (arrayList.get(i13).getGroupId() == i11) {
                break;
            } else {
                i13++;
            }
        }
        if (i13 >= 0) {
            int size2 = arrayList.size() - i13;
            while (true) {
                int i14 = i12 + 1;
                if (i12 >= size2 || arrayList.get(i13).getGroupId() != i11) {
                    break;
                }
                if (i13 >= 0) {
                    ArrayList<i> arrayList2 = this.f37416f;
                    if (i13 < arrayList2.size()) {
                        arrayList2.remove(i13);
                    }
                }
                i12 = i14;
            }
            y(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i11) {
        ArrayList<i> arrayList = this.f37416f;
        int size = arrayList.size();
        int i12 = 0;
        while (true) {
            if (i12 >= size) {
                i12 = -1;
                break;
            } else if (arrayList.get(i12).getItemId() == i11) {
                break;
            } else {
                i12++;
            }
        }
        if (i12 >= 0) {
            ArrayList<i> arrayList2 = this.f37416f;
            if (i12 >= arrayList2.size()) {
                return;
            }
            arrayList2.remove(i12);
            y(true);
        }
    }

    public final boolean s() {
        return !this.f37426p;
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i11, boolean z11, boolean z12) {
        ArrayList<i> arrayList = this.f37416f;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            i iVar = arrayList.get(i12);
            if (iVar.getGroupId() == i11) {
                iVar.q(z12);
                iVar.setCheckable(z11);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z11) {
        this.f37433w = z11;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i11, boolean z11) {
        ArrayList<i> arrayList = this.f37416f;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            i iVar = arrayList.get(i12);
            if (iVar.getGroupId() == i11) {
                iVar.setEnabled(z11);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i11, boolean z11) {
        ArrayList<i> arrayList = this.f37416f;
        int size = arrayList.size();
        boolean z12 = false;
        for (int i12 = 0; i12 < size; i12++) {
            i iVar = arrayList.get(i12);
            if (iVar.getGroupId() == i11 && iVar.t(z11)) {
                z12 = true;
            }
        }
        if (z12) {
            y(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z11) {
        this.f37413c = z11;
        y(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f37416f.size();
    }

    public boolean t() {
        return this.f37433w;
    }

    boolean u() {
        return this.f37413c;
    }

    public boolean v() {
        return this.f37414d;
    }

    final void w() {
        this.f37421k = true;
        y(true);
    }

    final void x() {
        this.f37418h = true;
        y(true);
    }

    public final void y(boolean z11) {
        if (this.f37426p) {
            this.f37427q = true;
            if (z11) {
                this.f37428r = true;
                return;
            }
            return;
        }
        if (z11) {
            this.f37418h = true;
            this.f37421k = true;
        }
        CopyOnWriteArrayList<WeakReference<m>> copyOnWriteArrayList = this.f37431u;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        Q();
        Iterator<WeakReference<m>> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference<m> next = it.next();
            m mVar = next.get();
            if (mVar == null) {
                copyOnWriteArrayList.remove(next);
            } else {
                mVar.e(z11);
            }
        }
        P();
    }

    public final boolean z(MenuItem menuItem, m mVar, int i11) {
        i iVar = (i) menuItem;
        if (iVar == null || !iVar.isEnabled()) {
            return false;
        }
        boolean j11 = iVar.j();
        AbstractC5307b a11 = iVar.a();
        boolean z11 = a11 != null && a11.a();
        if (iVar.i()) {
            boolean expandActionView = iVar.expandActionView() | j11;
            if (expandActionView) {
                e(true);
            }
            return expandActionView;
        }
        if (!iVar.hasSubMenu() && !z11) {
            if ((i11 & 1) == 0) {
                e(true);
            }
            return j11;
        }
        if ((i11 & 4) == 0) {
            e(false);
        }
        if (!iVar.hasSubMenu()) {
            iVar.s(new q(this.f37411a, this, iVar));
        }
        q qVar = (q) iVar.getSubMenu();
        if (z11) {
            a11.f(qVar);
        }
        CopyOnWriteArrayList<WeakReference<m>> copyOnWriteArrayList = this.f37431u;
        if (!copyOnWriteArrayList.isEmpty()) {
            r0 = mVar != null ? mVar.l(qVar) : false;
            Iterator<WeakReference<m>> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference<m> next = it.next();
                m mVar2 = next.get();
                if (mVar2 == null) {
                    copyOnWriteArrayList.remove(next);
                } else if (!r0) {
                    r0 = mVar2.l(qVar);
                }
            }
        }
        boolean z12 = j11 | r0;
        if (!z12) {
            e(true);
        }
        return z12;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i11) {
        return a(0, 0, 0, this.f37412b.getString(i11));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i11) {
        return addSubMenu(0, 0, 0, this.f37412b.getString(i11));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i11, int i12, int i13, CharSequence charSequence) {
        return a(i11, i12, i13, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i11, int i12, int i13, CharSequence charSequence) {
        i a11 = a(i11, i12, i13, charSequence);
        q qVar = new q(this.f37411a, this, a11);
        a11.s(qVar);
        return qVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i11, int i12, int i13, int i14) {
        return a(i11, i12, i13, this.f37412b.getString(i14));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i11, int i12, int i13, int i14) {
        return addSubMenu(i11, i12, i13, this.f37412b.getString(i14));
    }
}
