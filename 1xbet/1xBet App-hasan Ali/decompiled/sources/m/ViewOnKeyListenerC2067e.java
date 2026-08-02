package m;

import A0.I;
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
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import game.betting133.sports1xbet.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import k0.C2023c;
import n.AbstractC2135g0;
import n.AbstractC2137h0;
import n.C2139i0;
import n.C2149t;
import n.j0;

/* renamed from: m.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC2067e extends AbstractC2072j implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: A, reason: collision with root package name */
    public boolean f17875A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f17876B;

    /* renamed from: C, reason: collision with root package name */
    public int f17877C;

    /* renamed from: D, reason: collision with root package name */
    public int f17878D;

    /* renamed from: F, reason: collision with root package name */
    public boolean f17880F;

    /* renamed from: G, reason: collision with root package name */
    public InterfaceC2075m f17881G;

    /* renamed from: H, reason: collision with root package name */
    public ViewTreeObserver f17882H;

    /* renamed from: I, reason: collision with root package name */
    public C2073k f17883I;
    public boolean J;

    /* renamed from: l, reason: collision with root package name */
    public final Context f17884l;

    /* renamed from: m, reason: collision with root package name */
    public final int f17885m;

    /* renamed from: n, reason: collision with root package name */
    public final int f17886n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f17887o;

    /* renamed from: p, reason: collision with root package name */
    public final Handler f17888p;

    /* renamed from: x, reason: collision with root package name */
    public View f17896x;

    /* renamed from: y, reason: collision with root package name */
    public View f17897y;

    /* renamed from: z, reason: collision with root package name */
    public int f17898z;

    /* renamed from: q, reason: collision with root package name */
    public final ArrayList f17889q = new ArrayList();

    /* renamed from: r, reason: collision with root package name */
    public final ArrayList f17890r = new ArrayList();

    /* renamed from: s, reason: collision with root package name */
    public final ViewTreeObserverOnGlobalLayoutListenerC2065c f17891s = new ViewTreeObserverOnGlobalLayoutListenerC2065c(this, 0);

    /* renamed from: t, reason: collision with root package name */
    public final I f17892t = new I(4, this);

    /* renamed from: u, reason: collision with root package name */
    public final C2023c f17893u = new C2023c(2, this);

    /* renamed from: v, reason: collision with root package name */
    public int f17894v = 0;

    /* renamed from: w, reason: collision with root package name */
    public int f17895w = 0;

    /* renamed from: E, reason: collision with root package name */
    public boolean f17879E = false;

    public ViewOnKeyListenerC2067e(Context context, View view, int i, boolean z3) {
        this.f17884l = context;
        this.f17896x = view;
        this.f17886n = i;
        this.f17887o = z3;
        this.f17898z = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f17885m = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f17888p = new Handler();
    }

    @Override // m.InterfaceC2076n
    public final void a(MenuC2070h menuC2070h, boolean z3) {
        ArrayList arrayList = this.f17890r;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (menuC2070h == ((C2066d) arrayList.get(i)).f17873b) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            return;
        }
        int i5 = i + 1;
        if (i5 < arrayList.size()) {
            ((C2066d) arrayList.get(i5)).f17873b.c(false);
        }
        C2066d c2066d = (C2066d) arrayList.remove(i);
        CopyOnWriteArrayList copyOnWriteArrayList = c2066d.f17873b.f17921s;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC2076n interfaceC2076n = (InterfaceC2076n) weakReference.get();
            if (interfaceC2076n == null || interfaceC2076n == this) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        boolean z5 = this.J;
        j0 j0Var = c2066d.f17872a;
        if (z5) {
            AbstractC2135g0.b(j0Var.f18227F, null);
            j0Var.f18227F.setAnimationStyle(0);
        }
        j0Var.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f17898z = ((C2066d) arrayList.get(size2 - 1)).f17874c;
        } else {
            this.f17898z = this.f17896x.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z3) {
                ((C2066d) arrayList.get(0)).f17873b.c(false);
                return;
            }
            return;
        }
        dismiss();
        InterfaceC2075m interfaceC2075m = this.f17881G;
        if (interfaceC2075m != null) {
            interfaceC2075m.a(menuC2070h, true);
        }
        ViewTreeObserver viewTreeObserver = this.f17882H;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f17882H.removeGlobalOnLayoutListener(this.f17891s);
            }
            this.f17882H = null;
        }
        this.f17897y.removeOnAttachStateChangeListener(this.f17892t);
        this.f17883I.onDismiss();
    }

    @Override // m.InterfaceC2078p
    public final void b() {
        if (i()) {
            return;
        }
        ArrayList arrayList = this.f17889q;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            v((MenuC2070h) obj);
        }
        arrayList.clear();
        View view = this.f17896x;
        this.f17897y = view;
        if (view != null) {
            boolean z3 = this.f17882H == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f17882H = viewTreeObserver;
            if (z3) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f17891s);
            }
            this.f17897y.addOnAttachStateChangeListener(this.f17892t);
        }
    }

    @Override // m.InterfaceC2076n
    public final void c() {
        ArrayList arrayList = this.f17890r;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ListAdapter adapter = ((C2066d) obj).f17872a.f18230m.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((C2068f) adapter).notifyDataSetChanged();
        }
    }

    @Override // m.InterfaceC2078p
    public final ListView d() {
        ArrayList arrayList = this.f17890r;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((C2066d) arrayList.get(arrayList.size() - 1)).f17872a.f18230m;
    }

    @Override // m.InterfaceC2078p
    public final void dismiss() {
        ArrayList arrayList = this.f17890r;
        int size = arrayList.size();
        if (size > 0) {
            C2066d[] c2066dArr = (C2066d[]) arrayList.toArray(new C2066d[size]);
            for (int i = size - 1; i >= 0; i--) {
                C2066d c2066d = c2066dArr[i];
                if (c2066d.f17872a.f18227F.isShowing()) {
                    c2066d.f17872a.dismiss();
                }
            }
        }
    }

    @Override // m.InterfaceC2076n
    public final boolean g() {
        return false;
    }

    @Override // m.InterfaceC2076n
    public final boolean h(SubMenuC2080r subMenuC2080r) {
        ArrayList arrayList = this.f17890r;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            C2066d c2066d = (C2066d) obj;
            if (subMenuC2080r == c2066d.f17873b) {
                c2066d.f17872a.f18230m.requestFocus();
                return true;
            }
        }
        if (!subMenuC2080r.hasVisibleItems()) {
            return false;
        }
        l(subMenuC2080r);
        InterfaceC2075m interfaceC2075m = this.f17881G;
        if (interfaceC2075m != null) {
            interfaceC2075m.d(subMenuC2080r);
        }
        return true;
    }

    @Override // m.InterfaceC2078p
    public final boolean i() {
        ArrayList arrayList = this.f17890r;
        return arrayList.size() > 0 && ((C2066d) arrayList.get(0)).f17872a.f18227F.isShowing();
    }

    @Override // m.InterfaceC2076n
    public final void j(InterfaceC2075m interfaceC2075m) {
        this.f17881G = interfaceC2075m;
    }

    @Override // m.AbstractC2072j
    public final void l(MenuC2070h menuC2070h) {
        menuC2070h.b(this, this.f17884l);
        if (i()) {
            v(menuC2070h);
        } else {
            this.f17889q.add(menuC2070h);
        }
    }

    @Override // m.AbstractC2072j
    public final void n(View view) {
        if (this.f17896x != view) {
            this.f17896x = view;
            this.f17895w = Gravity.getAbsoluteGravity(this.f17894v, view.getLayoutDirection());
        }
    }

    @Override // m.AbstractC2072j
    public final void o(boolean z3) {
        this.f17879E = z3;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        C2066d c2066d;
        ArrayList arrayList = this.f17890r;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                c2066d = null;
                break;
            }
            c2066d = (C2066d) arrayList.get(i);
            if (!c2066d.f17872a.f18227F.isShowing()) {
                break;
            } else {
                i++;
            }
        }
        if (c2066d != null) {
            c2066d.f17873b.c(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // m.AbstractC2072j
    public final void p(int i) {
        if (this.f17894v != i) {
            this.f17894v = i;
            this.f17895w = Gravity.getAbsoluteGravity(i, this.f17896x.getLayoutDirection());
        }
    }

    @Override // m.AbstractC2072j
    public final void q(int i) {
        this.f17875A = true;
        this.f17877C = i;
    }

    @Override // m.AbstractC2072j
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f17883I = (C2073k) onDismissListener;
    }

    @Override // m.AbstractC2072j
    public final void s(boolean z3) {
        this.f17880F = z3;
    }

    @Override // m.AbstractC2072j
    public final void t(int i) {
        this.f17876B = true;
        this.f17878D = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0175  */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r17v6 */
    /* JADX WARN: Type inference failed for: r17v7 */
    /* JADX WARN: Type inference failed for: r4v0, types: [android.view.LayoutInflater] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(MenuC2070h menuC2070h) {
        int i;
        boolean z3;
        View view;
        C2066d c2066d;
        int i5;
        int i6;
        int i7;
        MenuItem menuItem;
        C2068f c2068f;
        int i8;
        int firstVisiblePosition;
        Context context = this.f17884l;
        ?? from = LayoutInflater.from(context);
        C2068f c2068f2 = new C2068f(menuC2070h, from, this.f17887o, R.layout.abc_cascading_menu_item_layout);
        int i9 = 1;
        if (!i() && this.f17879E) {
            c2068f2.f17901c = true;
        } else if (i()) {
            c2068f2.f17901c = AbstractC2072j.u(menuC2070h);
        }
        int m5 = AbstractC2072j.m(c2068f2, context, this.f17885m);
        j0 j0Var = new j0(context, this.f17886n);
        C2149t c2149t = j0Var.f18227F;
        j0Var.J = this.f17893u;
        j0Var.f18240w = this;
        c2149t.setOnDismissListener(this);
        j0Var.f18239v = this.f17896x;
        j0Var.f18237t = this.f17895w;
        j0Var.f18226E = true;
        c2149t.setFocusable(true);
        c2149t.setInputMethodMode(2);
        j0Var.c(c2068f2);
        Drawable background = c2149t.getBackground();
        if (background != null) {
            Rect rect = j0Var.f18224C;
            background.getPadding(rect);
            j0Var.f18231n = rect.left + rect.right + m5;
        } else {
            j0Var.f18231n = m5;
        }
        j0Var.f18237t = this.f17895w;
        ArrayList arrayList = this.f17890r;
        if (arrayList.size() > 0) {
            c2066d = (C2066d) arrayList.get(arrayList.size() - 1);
            MenuC2070h menuC2070h2 = c2066d.f17873b;
            int size = menuC2070h2.f.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    menuItem = null;
                    break;
                }
                menuItem = menuC2070h2.getItem(i10);
                if (menuItem.hasSubMenu() && menuC2070h == menuItem.getSubMenu()) {
                    break;
                } else {
                    i10++;
                }
            }
            if (menuItem == null) {
                i = 1;
                view = null;
                z3 = 0;
            } else {
                C2139i0 c2139i0 = c2066d.f17872a.f18230m;
                ListAdapter adapter = c2139i0.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i8 = headerViewListAdapter.getHeadersCount();
                    c2068f = (C2068f) headerViewListAdapter.getWrappedAdapter();
                } else {
                    c2068f = (C2068f) adapter;
                    i8 = 0;
                }
                int count = c2068f.getCount();
                int i11 = 0;
                z3 = 0;
                z3 = 0;
                while (true) {
                    i = i9;
                    if (i11 >= count) {
                        i11 = -1;
                        break;
                    } else {
                        if (menuItem == c2068f.getItem(i11)) {
                            break;
                        }
                        i11++;
                        i9 = i;
                    }
                }
                view = (i11 != -1 && (firstVisiblePosition = (i11 + i8) - c2139i0.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < c2139i0.getChildCount()) ? c2139i0.getChildAt(firstVisiblePosition) : null;
            }
        } else {
            i = 1;
            z3 = 0;
            view = null;
            c2066d = null;
        }
        if (view != null) {
            if (Build.VERSION.SDK_INT <= 28) {
                Method method = j0.K;
                if (method != null) {
                    try {
                        Object[] objArr = new Object[i];
                        objArr[z3] = Boolean.FALSE;
                        method.invoke(c2149t, objArr);
                    } catch (Exception unused) {
                        Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                    }
                }
            } else {
                AbstractC2137h0.a(c2149t, z3);
            }
            AbstractC2135g0.a(c2149t, null);
            C2139i0 c2139i02 = ((C2066d) arrayList.get(arrayList.size() - 1)).f17872a.f18230m;
            int[] iArr = new int[2];
            c2139i02.getLocationOnScreen(iArr);
            Rect rect2 = new Rect();
            this.f17897y.getWindowVisibleDisplayFrame(rect2);
            if (this.f17898z == 1) {
                if (c2139i02.getWidth() + iArr[0] + m5 > rect2.right) {
                    i5 = 0;
                    boolean z5 = i5 != 1;
                    this.f17898z = i5;
                    if (Build.VERSION.SDK_INT < 26) {
                        j0Var.f18239v = view;
                        i7 = 0;
                        i6 = 0;
                    } else {
                        int[] iArr2 = new int[2];
                        this.f17896x.getLocationOnScreen(iArr2);
                        int[] iArr3 = new int[2];
                        view.getLocationOnScreen(iArr3);
                        if ((this.f17895w & 7) == 5) {
                            iArr2[0] = this.f17896x.getWidth() + iArr2[0];
                            iArr3[0] = view.getWidth() + iArr3[0];
                        }
                        i6 = iArr3[0] - iArr2[0];
                        i7 = iArr3[1] - iArr2[1];
                    }
                    j0Var.f18232o = (this.f17895w & 5) != 5 ? z5 ? i6 + m5 : i6 - view.getWidth() : z5 ? i6 + view.getWidth() : i6 - m5;
                    j0Var.f18236s = true;
                    j0Var.f18235r = true;
                    j0Var.f18233p = i7;
                    j0Var.f18234q = true;
                }
                i5 = 1;
                if (i5 != 1) {
                }
                this.f17898z = i5;
                if (Build.VERSION.SDK_INT < 26) {
                }
                j0Var.f18232o = (this.f17895w & 5) != 5 ? z5 ? i6 + m5 : i6 - view.getWidth() : z5 ? i6 + view.getWidth() : i6 - m5;
                j0Var.f18236s = true;
                j0Var.f18235r = true;
                j0Var.f18233p = i7;
                j0Var.f18234q = true;
            } else {
                if (iArr[0] - m5 >= 0) {
                    i5 = 0;
                    if (i5 != 1) {
                    }
                    this.f17898z = i5;
                    if (Build.VERSION.SDK_INT < 26) {
                    }
                    j0Var.f18232o = (this.f17895w & 5) != 5 ? z5 ? i6 + m5 : i6 - view.getWidth() : z5 ? i6 + view.getWidth() : i6 - m5;
                    j0Var.f18236s = true;
                    j0Var.f18235r = true;
                    j0Var.f18233p = i7;
                    j0Var.f18234q = true;
                }
                i5 = 1;
                if (i5 != 1) {
                }
                this.f17898z = i5;
                if (Build.VERSION.SDK_INT < 26) {
                }
                j0Var.f18232o = (this.f17895w & 5) != 5 ? z5 ? i6 + m5 : i6 - view.getWidth() : z5 ? i6 + view.getWidth() : i6 - m5;
                j0Var.f18236s = true;
                j0Var.f18235r = true;
                j0Var.f18233p = i7;
                j0Var.f18234q = true;
            }
        } else {
            if (this.f17875A) {
                j0Var.f18232o = this.f17877C;
            }
            if (this.f17876B) {
                j0Var.f18233p = this.f17878D;
                j0Var.f18234q = true;
            }
            Rect rect3 = this.f17950k;
            j0Var.f18225D = rect3 != null ? new Rect(rect3) : null;
        }
        arrayList.add(new C2066d(j0Var, menuC2070h, this.f17898z));
        j0Var.b();
        C2139i0 c2139i03 = j0Var.f18230m;
        c2139i03.setOnKeyListener(this);
        if (c2066d == null && this.f17880F && menuC2070h.f17914l != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(R.layout.abc_popup_menu_header_item_layout, c2139i03, false);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(menuC2070h.f17914l);
            c2139i03.addHeaderView(frameLayout, null, false);
            j0Var.b();
        }
    }
}
