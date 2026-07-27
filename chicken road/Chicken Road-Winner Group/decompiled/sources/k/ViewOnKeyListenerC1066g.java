package k;

import D.z;
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
import com.chicken.jump.road.pump.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import l.M;
import l.N;

/* renamed from: k.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC1066g extends AbstractC1071l implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: b, reason: collision with root package name */
    public final Context f9550b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9551c;

    /* renamed from: d, reason: collision with root package name */
    public final int f9552d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f9553e;
    public final Handler f;

    /* renamed from: i, reason: collision with root package name */
    public final ViewTreeObserverOnGlobalLayoutListenerC1062c f9556i;

    /* renamed from: j, reason: collision with root package name */
    public final ViewOnAttachStateChangeListenerC1063d f9557j;

    /* renamed from: n, reason: collision with root package name */
    public View f9561n;

    /* renamed from: o, reason: collision with root package name */
    public View f9562o;

    /* renamed from: p, reason: collision with root package name */
    public int f9563p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f9564q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f9565r;

    /* renamed from: s, reason: collision with root package name */
    public int f9566s;

    /* renamed from: t, reason: collision with root package name */
    public int f9567t;

    /* renamed from: v, reason: collision with root package name */
    public boolean f9569v;

    /* renamed from: w, reason: collision with root package name */
    public InterfaceC1074o f9570w;

    /* renamed from: x, reason: collision with root package name */
    public ViewTreeObserver f9571x;
    public C1072m y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f9572z;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f9554g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f9555h = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public final b0.j f9558k = new b0.j(this);

    /* renamed from: l, reason: collision with root package name */
    public int f9559l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f9560m = 0;

    /* renamed from: u, reason: collision with root package name */
    public boolean f9568u = false;

    public ViewOnKeyListenerC1066g(Context context, View view, int i3, boolean z3) {
        this.f9556i = new ViewTreeObserverOnGlobalLayoutListenerC1062c(this, r0);
        this.f9557j = new ViewOnAttachStateChangeListenerC1063d(this, r0);
        this.f9550b = context;
        this.f9561n = view;
        this.f9552d = i3;
        this.f9553e = z3;
        Field field = z.f259a;
        this.f9563p = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f9551c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f = new Handler();
    }

    @Override // k.InterfaceC1075p
    public final void a(MenuC1069j menuC1069j, boolean z3) {
        ArrayList arrayList = this.f9555h;
        int size = arrayList.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (menuC1069j == ((C1065f) arrayList.get(i3)).f9548b) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 < 0) {
            return;
        }
        int i4 = i3 + 1;
        if (i4 < arrayList.size()) {
            ((C1065f) arrayList.get(i4)).f9548b.c(false);
        }
        C1065f c1065f = (C1065f) arrayList.remove(i3);
        CopyOnWriteArrayList copyOnWriteArrayList = c1065f.f9548b.f9596s;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC1075p interfaceC1075p = (InterfaceC1075p) weakReference.get();
            if (interfaceC1075p == null || interfaceC1075p == this) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        boolean z4 = this.f9572z;
        N n3 = c1065f.f9547a;
        if (z4) {
            n3.f9732v.setExitTransition(null);
            n3.f9732v.setAnimationStyle(0);
        }
        n3.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f9563p = ((C1065f) arrayList.get(size2 - 1)).f9549c;
        } else {
            View view = this.f9561n;
            Field field = z.f259a;
            this.f9563p = view.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z3) {
                ((C1065f) arrayList.get(0)).f9548b.c(false);
                return;
            }
            return;
        }
        dismiss();
        InterfaceC1074o interfaceC1074o = this.f9570w;
        if (interfaceC1074o != null) {
            interfaceC1074o.a(menuC1069j, true);
        }
        ViewTreeObserver viewTreeObserver = this.f9571x;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f9571x.removeGlobalOnLayoutListener(this.f9556i);
            }
            this.f9571x = null;
        }
        this.f9562o.removeOnAttachStateChangeListener(this.f9557j);
        this.y.onDismiss();
    }

    @Override // k.InterfaceC1075p
    public final boolean c(SubMenuC1079t subMenuC1079t) {
        Iterator it = this.f9555h.iterator();
        while (it.hasNext()) {
            C1065f c1065f = (C1065f) it.next();
            if (subMenuC1079t == c1065f.f9548b) {
                c1065f.f9547a.f9714c.requestFocus();
                return true;
            }
        }
        if (!subMenuC1079t.hasVisibleItems()) {
            return false;
        }
        l(subMenuC1079t);
        InterfaceC1074o interfaceC1074o = this.f9570w;
        if (interfaceC1074o != null) {
            interfaceC1074o.c(subMenuC1079t);
        }
        return true;
    }

    @Override // k.InterfaceC1077r
    public final void d() {
        if (k()) {
            return;
        }
        ArrayList arrayList = this.f9554g;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            v((MenuC1069j) it.next());
        }
        arrayList.clear();
        View view = this.f9561n;
        this.f9562o = view;
        if (view != null) {
            boolean z3 = this.f9571x == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f9571x = viewTreeObserver;
            if (z3) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f9556i);
            }
            this.f9562o.addOnAttachStateChangeListener(this.f9557j);
        }
    }

    @Override // k.InterfaceC1077r
    public final void dismiss() {
        ArrayList arrayList = this.f9555h;
        int size = arrayList.size();
        if (size > 0) {
            C1065f[] c1065fArr = (C1065f[]) arrayList.toArray(new C1065f[size]);
            for (int i3 = size - 1; i3 >= 0; i3--) {
                C1065f c1065f = c1065fArr[i3];
                if (c1065f.f9547a.f9732v.isShowing()) {
                    c1065f.f9547a.dismiss();
                }
            }
        }
    }

    @Override // k.InterfaceC1075p
    public final void f() {
        Iterator it = this.f9555h.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((C1065f) it.next()).f9547a.f9714c.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((C1067h) adapter).notifyDataSetChanged();
        }
    }

    @Override // k.InterfaceC1077r
    public final ListView g() {
        ArrayList arrayList = this.f9555h;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((C1065f) arrayList.get(arrayList.size() - 1)).f9547a.f9714c;
    }

    @Override // k.InterfaceC1075p
    public final void h(InterfaceC1074o interfaceC1074o) {
        this.f9570w = interfaceC1074o;
    }

    @Override // k.InterfaceC1075p
    public final boolean j() {
        return false;
    }

    @Override // k.InterfaceC1077r
    public final boolean k() {
        ArrayList arrayList = this.f9555h;
        return arrayList.size() > 0 && ((C1065f) arrayList.get(0)).f9547a.f9732v.isShowing();
    }

    @Override // k.AbstractC1071l
    public final void l(MenuC1069j menuC1069j) {
        menuC1069j.b(this, this.f9550b);
        if (k()) {
            v(menuC1069j);
        } else {
            this.f9554g.add(menuC1069j);
        }
    }

    @Override // k.AbstractC1071l
    public final void n(View view) {
        if (this.f9561n != view) {
            this.f9561n = view;
            int i3 = this.f9559l;
            Field field = z.f259a;
            this.f9560m = Gravity.getAbsoluteGravity(i3, view.getLayoutDirection());
        }
    }

    @Override // k.AbstractC1071l
    public final void o(boolean z3) {
        this.f9568u = z3;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        C1065f c1065f;
        ArrayList arrayList = this.f9555h;
        int size = arrayList.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                c1065f = null;
                break;
            }
            c1065f = (C1065f) arrayList.get(i3);
            if (!c1065f.f9547a.f9732v.isShowing()) {
                break;
            } else {
                i3++;
            }
        }
        if (c1065f != null) {
            c1065f.f9548b.c(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i3, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i3 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // k.AbstractC1071l
    public final void p(int i3) {
        if (this.f9559l != i3) {
            this.f9559l = i3;
            View view = this.f9561n;
            Field field = z.f259a;
            this.f9560m = Gravity.getAbsoluteGravity(i3, view.getLayoutDirection());
        }
    }

    @Override // k.AbstractC1071l
    public final void q(int i3) {
        this.f9564q = true;
        this.f9566s = i3;
    }

    @Override // k.AbstractC1071l
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.y = (C1072m) onDismissListener;
    }

    @Override // k.AbstractC1071l
    public final void s(boolean z3) {
        this.f9569v = z3;
    }

    @Override // k.AbstractC1071l
    public final void t(int i3) {
        this.f9565r = true;
        this.f9567t = i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0160, code lost:
    
        if (((r8.getWidth() + r11[r16]) + r5) > r10.right) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0162, code lost:
    
        r8 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0166, code lost:
    
        r8 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x016b, code lost:
    
        if ((r11[r16] - r5) < 0) goto L63;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(MenuC1069j menuC1069j) {
        int i3;
        int i4;
        C1065f c1065f;
        View view;
        int i5;
        int i6;
        int i7;
        int width;
        MenuItem menuItem;
        C1067h c1067h;
        int i8;
        int firstVisiblePosition;
        Context context = this.f9550b;
        LayoutInflater from = LayoutInflater.from(context);
        C1067h c1067h2 = new C1067h(menuC1069j, from, this.f9553e, R.layout.abc_cascading_menu_item_layout);
        if (!k() && this.f9568u) {
            c1067h2.f9575c = true;
        } else if (k()) {
            c1067h2.f9575c = AbstractC1071l.u(menuC1069j);
        }
        int m3 = AbstractC1071l.m(c1067h2, context, this.f9551c);
        N n3 = new N(context, this.f9552d);
        n3.y = this.f9558k;
        n3.f9723m = this;
        n3.f9732v.setOnDismissListener(this);
        n3.f9722l = this.f9561n;
        n3.f9720j = this.f9560m;
        n3.f9731u = true;
        n3.f9732v.setFocusable(true);
        n3.f9732v.setInputMethodMode(2);
        n3.b(c1067h2);
        Drawable background = n3.f9732v.getBackground();
        if (background != null) {
            Rect rect = n3.f9729s;
            background.getPadding(rect);
            n3.f9715d = rect.left + rect.right + m3;
        } else {
            n3.f9715d = m3;
        }
        n3.f9720j = this.f9560m;
        ArrayList arrayList = this.f9555h;
        if (arrayList.size() > 0) {
            c1065f = (C1065f) arrayList.get(arrayList.size() - 1);
            MenuC1069j menuC1069j2 = c1065f.f9548b;
            int size = menuC1069j2.f.size();
            int i9 = 0;
            while (true) {
                if (i9 >= size) {
                    menuItem = null;
                    break;
                }
                menuItem = menuC1069j2.getItem(i9);
                if (menuItem.hasSubMenu() && menuC1069j == menuItem.getSubMenu()) {
                    break;
                } else {
                    i9++;
                }
            }
            if (menuItem == null) {
                i3 = 1;
                view = null;
                i4 = 0;
            } else {
                M m4 = c1065f.f9547a.f9714c;
                ListAdapter adapter = m4.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i8 = headerViewListAdapter.getHeadersCount();
                    c1067h = (C1067h) headerViewListAdapter.getWrappedAdapter();
                } else {
                    c1067h = (C1067h) adapter;
                    i8 = 0;
                }
                int count = c1067h.getCount();
                i3 = 1;
                int i10 = 0;
                i4 = 0;
                while (true) {
                    if (i10 >= count) {
                        i10 = -1;
                        break;
                    } else if (menuItem == c1067h.getItem(i10)) {
                        break;
                    } else {
                        i10++;
                    }
                }
                view = (i10 != -1 && (firstVisiblePosition = (i10 + i8) - m4.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < m4.getChildCount()) ? m4.getChildAt(firstVisiblePosition) : null;
            }
        } else {
            i3 = 1;
            i4 = 0;
            c1065f = null;
            view = null;
        }
        if (view != null) {
            int i11 = Build.VERSION.SDK_INT;
            l.r rVar = n3.f9732v;
            if (i11 <= 28) {
                Method method = N.f9737z;
                if (method != null) {
                    try {
                        method.invoke(rVar, Boolean.FALSE);
                    } catch (Exception unused) {
                        Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                    }
                }
            } else {
                rVar.setTouchModal(false);
            }
            n3.f9732v.setEnterTransition(null);
            M m5 = ((C1065f) arrayList.get(arrayList.size() - 1)).f9547a.f9714c;
            int[] iArr = new int[2];
            m5.getLocationOnScreen(iArr);
            Rect rect2 = new Rect();
            this.f9562o.getWindowVisibleDisplayFrame(rect2);
            if (this.f9563p == i3) {
            }
            int i12 = i5 == 1 ? 1 : i4;
            this.f9563p = i5;
            if (Build.VERSION.SDK_INT >= 26) {
                n3.f9722l = view;
                i7 = i4;
                i6 = i7;
            } else {
                int[] iArr2 = new int[2];
                this.f9561n.getLocationOnScreen(iArr2);
                int[] iArr3 = new int[2];
                view.getLocationOnScreen(iArr3);
                if ((this.f9560m & 7) == 5) {
                    iArr2[i4] = this.f9561n.getWidth() + iArr2[i4];
                    iArr3[i4] = view.getWidth() + iArr3[i4];
                }
                i6 = iArr3[i4] - iArr2[i4];
                i7 = iArr3[1] - iArr2[1];
            }
            if ((this.f9560m & 5) != 5) {
                if (i12 != 0) {
                    width = i6 + view.getWidth();
                    n3.f9716e = width;
                    n3.f9719i = true;
                    n3.f9718h = true;
                    n3.f = i7;
                    n3.f9717g = true;
                }
                width = i6 - m3;
                n3.f9716e = width;
                n3.f9719i = true;
                n3.f9718h = true;
                n3.f = i7;
                n3.f9717g = true;
            } else if (i12 != 0) {
                width = i6 + m3;
                n3.f9716e = width;
                n3.f9719i = true;
                n3.f9718h = true;
                n3.f = i7;
                n3.f9717g = true;
            } else {
                m3 = view.getWidth();
                width = i6 - m3;
                n3.f9716e = width;
                n3.f9719i = true;
                n3.f9718h = true;
                n3.f = i7;
                n3.f9717g = true;
            }
        } else {
            if (this.f9564q) {
                n3.f9716e = this.f9566s;
            }
            if (this.f9565r) {
                n3.f = this.f9567t;
                n3.f9717g = true;
            }
            Rect rect3 = this.f9625a;
            n3.f9730t = rect3 != null ? new Rect(rect3) : null;
        }
        arrayList.add(new C1065f(n3, menuC1069j, this.f9563p));
        n3.d();
        M m6 = n3.f9714c;
        m6.setOnKeyListener(this);
        if (c1065f == null && this.f9569v && menuC1069j.f9589l != null) {
            boolean z3 = i4;
            FrameLayout frameLayout = (FrameLayout) from.inflate(R.layout.abc_popup_menu_header_item_layout, m6, z3);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(z3);
            textView.setText(menuC1069j.f9589l);
            m6.addHeaderView(frameLayout, null, z3);
            n3.d();
        }
    }
}
