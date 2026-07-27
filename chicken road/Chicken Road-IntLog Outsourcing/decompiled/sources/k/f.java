package k;

import E.G;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.chickyneer.roadway.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import l.C1245q;
import l.J;
import l.K;

/* loaded from: classes.dex */
public final class f extends k implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: b, reason: collision with root package name */
    public final Context f10555b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10556c;

    /* renamed from: d, reason: collision with root package name */
    public final int f10557d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f10558e;

    /* renamed from: f, reason: collision with root package name */
    public final Handler f10559f;

    /* renamed from: i, reason: collision with root package name */
    public final ViewTreeObserverOnGlobalLayoutListenerC1203c f10562i;

    /* renamed from: j, reason: collision with root package name */
    public final d f10563j;

    /* renamed from: n, reason: collision with root package name */
    public View f10567n;

    /* renamed from: o, reason: collision with root package name */
    public View f10568o;

    /* renamed from: p, reason: collision with root package name */
    public int f10569p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f10570q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f10571r;

    /* renamed from: s, reason: collision with root package name */
    public int f10572s;

    /* renamed from: t, reason: collision with root package name */
    public int f10573t;

    /* renamed from: v, reason: collision with root package name */
    public boolean f10575v;

    /* renamed from: w, reason: collision with root package name */
    public n f10576w;

    /* renamed from: x, reason: collision with root package name */
    public ViewTreeObserver f10577x;

    /* renamed from: y, reason: collision with root package name */
    public l f10578y;
    public boolean z;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f10560g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f10561h = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public final V0.j f10564k = new V0.j(15, this);

    /* renamed from: l, reason: collision with root package name */
    public int f10565l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f10566m = 0;

    /* renamed from: u, reason: collision with root package name */
    public boolean f10574u = false;

    public f(Context context, View view, int i2, boolean z) {
        this.f10562i = new ViewTreeObserverOnGlobalLayoutListenerC1203c(this, r0);
        this.f10563j = new d(this, r0);
        this.f10555b = context;
        this.f10567n = view;
        this.f10557d = i2;
        this.f10558e = z;
        Field field = G.f566a;
        this.f10569p = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f10556c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f10559f = new Handler();
    }

    @Override // k.o
    public final void a(i iVar, boolean z) {
        ArrayList arrayList = this.f10561h;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (iVar == ((e) arrayList.get(i2)).f10553b) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 < 0) {
            return;
        }
        int i3 = i2 + 1;
        if (i3 < arrayList.size()) {
            ((e) arrayList.get(i3)).f10553b.c(false);
        }
        e eVar = (e) arrayList.remove(i2);
        CopyOnWriteArrayList copyOnWriteArrayList = eVar.f10553b.f10603r;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            o oVar = (o) weakReference.get();
            if (oVar == null || oVar == this) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        boolean z5 = this.z;
        K k3 = eVar.f10552a;
        if (z5) {
            k3.f10791v.setExitTransition(null);
            k3.f10791v.setAnimationStyle(0);
        }
        k3.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f10569p = ((e) arrayList.get(size2 - 1)).f10554c;
        } else {
            View view = this.f10567n;
            Field field = G.f566a;
            this.f10569p = view.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z) {
                ((e) arrayList.get(0)).f10553b.c(false);
                return;
            }
            return;
        }
        dismiss();
        n nVar = this.f10576w;
        if (nVar != null) {
            nVar.a(iVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.f10577x;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f10577x.removeGlobalOnLayoutListener(this.f10562i);
            }
            this.f10577x = null;
        }
        this.f10568o.removeOnAttachStateChangeListener(this.f10563j);
        this.f10578y.onDismiss();
    }

    @Override // k.o
    public final boolean c(s sVar) {
        Iterator it = this.f10561h.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            if (sVar == eVar.f10553b) {
                eVar.f10552a.f10772c.requestFocus();
                return true;
            }
        }
        if (!sVar.hasVisibleItems()) {
            return false;
        }
        l(sVar);
        n nVar = this.f10576w;
        if (nVar != null) {
            nVar.g(sVar);
        }
        return true;
    }

    @Override // k.q
    public final void d() {
        if (k()) {
            return;
        }
        ArrayList arrayList = this.f10560g;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            v((i) it.next());
        }
        arrayList.clear();
        View view = this.f10567n;
        this.f10568o = view;
        if (view != null) {
            boolean z = this.f10577x == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f10577x = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f10562i);
            }
            this.f10568o.addOnAttachStateChangeListener(this.f10563j);
        }
    }

    @Override // k.q
    public final void dismiss() {
        ArrayList arrayList = this.f10561h;
        int size = arrayList.size();
        if (size > 0) {
            e[] eVarArr = (e[]) arrayList.toArray(new e[size]);
            for (int i2 = size - 1; i2 >= 0; i2--) {
                e eVar = eVarArr[i2];
                if (eVar.f10552a.f10791v.isShowing()) {
                    eVar.f10552a.dismiss();
                }
            }
        }
    }

    @Override // k.o
    public final void f() {
        Iterator it = this.f10561h.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((e) it.next()).f10552a.f10772c.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((g) adapter).notifyDataSetChanged();
        }
    }

    @Override // k.q
    public final ListView g() {
        ArrayList arrayList = this.f10561h;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((e) arrayList.get(arrayList.size() - 1)).f10552a.f10772c;
    }

    @Override // k.o
    public final void h(n nVar) {
        this.f10576w = nVar;
    }

    @Override // k.o
    public final boolean j() {
        return false;
    }

    @Override // k.q
    public final boolean k() {
        ArrayList arrayList = this.f10561h;
        return arrayList.size() > 0 && ((e) arrayList.get(0)).f10552a.f10791v.isShowing();
    }

    @Override // k.k
    public final void l(i iVar) {
        iVar.b(this, this.f10555b);
        if (k()) {
            v(iVar);
        } else {
            this.f10560g.add(iVar);
        }
    }

    @Override // k.k
    public final void n(View view) {
        if (this.f10567n != view) {
            this.f10567n = view;
            int i2 = this.f10565l;
            Field field = G.f566a;
            this.f10566m = Gravity.getAbsoluteGravity(i2, view.getLayoutDirection());
        }
    }

    @Override // k.k
    public final void o(boolean z) {
        this.f10574u = z;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        e eVar;
        ArrayList arrayList = this.f10561h;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                eVar = null;
                break;
            }
            eVar = (e) arrayList.get(i2);
            if (!eVar.f10552a.f10791v.isShowing()) {
                break;
            } else {
                i2++;
            }
        }
        if (eVar != null) {
            eVar.f10553b.c(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i2, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i2 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // k.k
    public final void p(int i2) {
        if (this.f10565l != i2) {
            this.f10565l = i2;
            View view = this.f10567n;
            Field field = G.f566a;
            this.f10566m = Gravity.getAbsoluteGravity(i2, view.getLayoutDirection());
        }
    }

    @Override // k.k
    public final void q(int i2) {
        this.f10570q = true;
        this.f10572s = i2;
    }

    @Override // k.k
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f10578y = (l) onDismissListener;
    }

    @Override // k.k
    public final void s(boolean z) {
        this.f10575v = z;
    }

    @Override // k.k
    public final void t(int i2) {
        this.f10571r = true;
        this.f10573t = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x016a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(i iVar) {
        e eVar;
        View view;
        int i2;
        char c2;
        int i3;
        int i6;
        int width;
        MenuItem menuItem;
        g gVar;
        int i7;
        int firstVisiblePosition;
        Context context = this.f10555b;
        LayoutInflater from = LayoutInflater.from(context);
        g gVar2 = new g(iVar, from, this.f10558e, R.layout.abc_cascading_menu_item_layout);
        if (!k() && this.f10574u) {
            gVar2.f10581c = true;
        } else if (k()) {
            gVar2.f10581c = k.u(iVar);
        }
        int m6 = k.m(gVar2, context, this.f10556c);
        K k3 = new K(context, this.f10557d);
        k3.f10796y = this.f10564k;
        k3.f10782m = this;
        k3.f10791v.setOnDismissListener(this);
        k3.f10781l = this.f10567n;
        k3.f10779j = this.f10566m;
        k3.f10790u = true;
        k3.f10791v.setFocusable(true);
        k3.f10791v.setInputMethodMode(2);
        k3.b(gVar2);
        Drawable background = k3.f10791v.getBackground();
        if (background != null) {
            Rect rect = k3.f10788s;
            background.getPadding(rect);
            k3.f10773d = rect.left + rect.right + m6;
        } else {
            k3.f10773d = m6;
        }
        k3.f10779j = this.f10566m;
        ArrayList arrayList = this.f10561h;
        if (arrayList.size() > 0) {
            eVar = (e) arrayList.get(arrayList.size() - 1);
            i iVar2 = eVar.f10553b;
            int size = iVar2.f10591f.size();
            int i8 = 0;
            while (true) {
                if (i8 >= size) {
                    menuItem = null;
                    break;
                }
                menuItem = iVar2.getItem(i8);
                if (menuItem.hasSubMenu() && iVar == menuItem.getSubMenu()) {
                    break;
                } else {
                    i8++;
                }
            }
            if (menuItem != null) {
                J j2 = eVar.f10552a.f10772c;
                ListAdapter adapter = j2.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i7 = headerViewListAdapter.getHeadersCount();
                    gVar = (g) headerViewListAdapter.getWrappedAdapter();
                } else {
                    gVar = (g) adapter;
                    i7 = 0;
                }
                int count = gVar.getCount();
                int i9 = 0;
                while (true) {
                    if (i9 >= count) {
                        i9 = -1;
                        break;
                    } else if (menuItem == gVar.getItem(i9)) {
                        break;
                    } else {
                        i9++;
                    }
                }
                if (i9 != -1 && (firstVisiblePosition = (i9 + i7) - j2.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < j2.getChildCount()) {
                    view = j2.getChildAt(firstVisiblePosition);
                }
            }
            view = null;
        } else {
            eVar = null;
            view = null;
        }
        if (view != null) {
            int i10 = Build.VERSION.SDK_INT;
            C1245q c1245q = k3.f10791v;
            if (i10 <= 28) {
                Method method = K.z;
                if (method != null) {
                    try {
                        method.invoke(c1245q, Boolean.FALSE);
                    } catch (Exception unused) {
                        Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                    }
                }
            } else {
                c1245q.setTouchModal(false);
            }
            k3.f10791v.setEnterTransition(null);
            J j6 = ((e) arrayList.get(arrayList.size() - 1)).f10552a.f10772c;
            int[] iArr = new int[2];
            j6.getLocationOnScreen(iArr);
            Rect rect2 = new Rect();
            this.f10568o.getWindowVisibleDisplayFrame(rect2);
            if (this.f10569p == 1) {
                if (j6.getWidth() + iArr[0] + m6 > rect2.right) {
                    i2 = 0;
                    boolean z = i2 != 1;
                    this.f10569p = i2;
                    if (Build.VERSION.SDK_INT < 26) {
                        k3.f10781l = view;
                        i6 = 0;
                        i3 = 0;
                    } else {
                        int[] iArr2 = new int[2];
                        this.f10567n.getLocationOnScreen(iArr2);
                        int[] iArr3 = new int[2];
                        view.getLocationOnScreen(iArr3);
                        if ((this.f10566m & 7) == 5) {
                            c2 = 0;
                            iArr2[0] = this.f10567n.getWidth() + iArr2[0];
                            iArr3[0] = view.getWidth() + iArr3[0];
                        } else {
                            c2 = 0;
                        }
                        i3 = iArr3[c2] - iArr2[c2];
                        i6 = iArr3[1] - iArr2[1];
                    }
                    if ((this.f10566m & 5) == 5) {
                        if (z) {
                            width = i3 + view.getWidth();
                            k3.f10774e = width;
                            k3.f10778i = true;
                            k3.f10777h = true;
                            k3.f10775f = i6;
                            k3.f10776g = true;
                        }
                        width = i3 - m6;
                        k3.f10774e = width;
                        k3.f10778i = true;
                        k3.f10777h = true;
                        k3.f10775f = i6;
                        k3.f10776g = true;
                    } else if (z) {
                        width = i3 + m6;
                        k3.f10774e = width;
                        k3.f10778i = true;
                        k3.f10777h = true;
                        k3.f10775f = i6;
                        k3.f10776g = true;
                    } else {
                        m6 = view.getWidth();
                        width = i3 - m6;
                        k3.f10774e = width;
                        k3.f10778i = true;
                        k3.f10777h = true;
                        k3.f10775f = i6;
                        k3.f10776g = true;
                    }
                }
                i2 = 1;
                if (i2 != 1) {
                }
                this.f10569p = i2;
                if (Build.VERSION.SDK_INT < 26) {
                }
                if ((this.f10566m & 5) == 5) {
                }
            } else {
                if (iArr[0] - m6 >= 0) {
                    i2 = 0;
                    if (i2 != 1) {
                    }
                    this.f10569p = i2;
                    if (Build.VERSION.SDK_INT < 26) {
                    }
                    if ((this.f10566m & 5) == 5) {
                    }
                }
                i2 = 1;
                if (i2 != 1) {
                }
                this.f10569p = i2;
                if (Build.VERSION.SDK_INT < 26) {
                }
                if ((this.f10566m & 5) == 5) {
                }
            }
        } else {
            if (this.f10570q) {
                k3.f10774e = this.f10572s;
            }
            if (this.f10571r) {
                k3.f10775f = this.f10573t;
                k3.f10776g = true;
            }
            Rect rect3 = this.f10633a;
            k3.f10789t = rect3 != null ? new Rect(rect3) : null;
        }
        arrayList.add(new e(k3, iVar, this.f10569p));
        k3.d();
        J j7 = k3.f10772c;
        j7.setOnKeyListener(this);
        if (eVar == null && this.f10575v && iVar.f10597l != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) j7, false);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(iVar.f10597l);
            j7.addHeaderView(frameLayout, null, false);
            k3.d();
        }
    }
}
