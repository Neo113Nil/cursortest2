package androidx.appcompat.view.menu;

import C.o0;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
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
import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.l;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.N;
import androidx.appcompat.widget.O;
import java.util.ArrayList;
import java.util.Iterator;
import ru.ozon.app.android.R;

/* loaded from: classes8.dex */
final class c extends k implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: b, reason: collision with root package name */
    private final Context f37361b;

    /* renamed from: c, reason: collision with root package name */
    private final int f37362c;

    /* renamed from: d, reason: collision with root package name */
    private final int f37363d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f37364e;

    /* renamed from: f, reason: collision with root package name */
    final Handler f37365f;

    /* renamed from: n, reason: collision with root package name */
    private View f37373n;

    /* renamed from: o, reason: collision with root package name */
    View f37374o;

    /* renamed from: p, reason: collision with root package name */
    private int f37375p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f37376q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f37377r;

    /* renamed from: s, reason: collision with root package name */
    private int f37378s;

    /* renamed from: t, reason: collision with root package name */
    private int f37379t;

    /* renamed from: v, reason: collision with root package name */
    private boolean f37381v;

    /* renamed from: w, reason: collision with root package name */
    private m.a f37382w;

    /* renamed from: x, reason: collision with root package name */
    ViewTreeObserver f37383x;

    /* renamed from: y, reason: collision with root package name */
    private PopupWindow.OnDismissListener f37384y;

    /* renamed from: z, reason: collision with root package name */
    boolean f37385z;

    /* renamed from: g, reason: collision with root package name */
    private final ArrayList f37366g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    final ArrayList f37367h = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    final ViewTreeObserver.OnGlobalLayoutListener f37368i = new a();

    /* renamed from: j, reason: collision with root package name */
    private final View.OnAttachStateChangeListener f37369j = new b();

    /* renamed from: k, reason: collision with root package name */
    private final N f37370k = new C0714c();

    /* renamed from: l, reason: collision with root package name */
    private int f37371l = 0;

    /* renamed from: m, reason: collision with root package name */
    private int f37372m = 0;

    /* renamed from: u, reason: collision with root package name */
    private boolean f37380u = false;

    final class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            c cVar = c.this;
            if (cVar.a()) {
                ArrayList arrayList = cVar.f37367h;
                if (arrayList.size() <= 0 || ((d) arrayList.get(0)).f37389a.v()) {
                    return;
                }
                View view = cVar.f37374o;
                if (view == null || !view.isShown()) {
                    cVar.dismiss();
                    return;
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((d) it.next()).f37389a.show();
                }
            }
        }
    }

    final class b implements View.OnAttachStateChangeListener {
        b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            c cVar = c.this;
            ViewTreeObserver viewTreeObserver = cVar.f37383x;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    cVar.f37383x = view.getViewTreeObserver();
                }
                cVar.f37383x.removeGlobalOnLayoutListener(cVar.f37368i);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    /* renamed from: androidx.appcompat.view.menu.c$c, reason: collision with other inner class name */
    final class C0714c implements N {
        C0714c() {
        }

        @Override // androidx.appcompat.widget.N
        public final void i(@NonNull g gVar, @NonNull i iVar) {
            c cVar = c.this;
            cVar.f37365f.removeCallbacksAndMessages(null);
            ArrayList arrayList = cVar.f37367h;
            int size = arrayList.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    i11 = -1;
                    break;
                } else if (gVar == ((d) arrayList.get(i11)).f37390b) {
                    break;
                } else {
                    i11++;
                }
            }
            if (i11 == -1) {
                return;
            }
            int i12 = i11 + 1;
            cVar.f37365f.postAtTime(new androidx.appcompat.view.menu.d(this, i12 < arrayList.size() ? (d) arrayList.get(i12) : null, iVar, gVar), gVar, SystemClock.uptimeMillis() + 200);
        }

        @Override // androidx.appcompat.widget.N
        public final void m(@NonNull g gVar, @NonNull i iVar) {
            c.this.f37365f.removeCallbacksAndMessages(gVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class d {

        /* renamed from: a, reason: collision with root package name */
        public final O f37389a;

        /* renamed from: b, reason: collision with root package name */
        public final g f37390b;

        /* renamed from: c, reason: collision with root package name */
        public final int f37391c;

        public d(@NonNull O o11, @NonNull g gVar, int i11) {
            this.f37389a = o11;
            this.f37390b = gVar;
            this.f37391c = i11;
        }
    }

    public c(@NonNull Context context, @NonNull View view, int i11, boolean z11) {
        this.f37361b = context;
        this.f37373n = view;
        this.f37363d = i11;
        this.f37364e = z11;
        this.f37375p = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f37362c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f37365f = new Handler();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0134, code lost:
    
        if (((r9.getWidth() + r10[r16]) + r5) > r11.right) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0136, code lost:
    
        r9 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0139, code lost:
    
        r9 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x013e, code lost:
    
        if ((r10[r16] - r5) < 0) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0170  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void x(@NonNull g gVar) {
        boolean z11;
        int i11;
        d dVar;
        View view;
        int i12;
        MenuItem menuItem;
        f fVar;
        int i13;
        int firstVisiblePosition;
        Context context = this.f37361b;
        LayoutInflater from = LayoutInflater.from(context);
        f fVar2 = new f(gVar, from, this.f37364e, R.layout.abc_cascading_menu_item_layout);
        if (!a() && this.f37380u) {
            fVar2.e(true);
        } else if (a()) {
            int size = gVar.size();
            int i14 = 0;
            while (true) {
                if (i14 >= size) {
                    z11 = false;
                    break;
                }
                MenuItem item = gVar.getItem(i14);
                if (item.isVisible() && item.getIcon() != null) {
                    z11 = true;
                    break;
                }
                i14++;
            }
            fVar2.e(z11);
        }
        int o11 = k.o(fVar2, context, this.f37362c);
        O o12 = new O(context, null, this.f37363d);
        o12.I(this.f37370k);
        o12.E(this);
        o12.D(this);
        o12.w(this.f37373n);
        o12.z(this.f37372m);
        o12.C();
        o12.B();
        o12.n(fVar2);
        o12.y(o11);
        o12.z(this.f37372m);
        ArrayList arrayList = this.f37367h;
        if (arrayList.size() > 0) {
            dVar = (d) o0.b(1, arrayList);
            g gVar2 = dVar.f37390b;
            int size2 = gVar2.size();
            int i15 = 0;
            while (true) {
                if (i15 >= size2) {
                    menuItem = null;
                    break;
                }
                menuItem = gVar2.getItem(i15);
                if (menuItem.hasSubMenu() && gVar == menuItem.getSubMenu()) {
                    break;
                } else {
                    i15++;
                }
            }
            if (menuItem == null) {
                view = null;
                i11 = 0;
            } else {
                ListView h11 = dVar.f37389a.h();
                ListAdapter adapter = h11.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i13 = headerViewListAdapter.getHeadersCount();
                    fVar = (f) headerViewListAdapter.getWrappedAdapter();
                } else {
                    fVar = (f) adapter;
                    i13 = 0;
                }
                int count = fVar.getCount();
                int i16 = 0;
                while (true) {
                    i11 = 0;
                    if (i16 >= count) {
                        i16 = -1;
                        break;
                    } else if (menuItem == fVar.getItem(i16)) {
                        break;
                    } else {
                        i16++;
                    }
                }
                if (i16 != -1 && (firstVisiblePosition = (i16 + i13) - h11.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < h11.getChildCount()) {
                    view = h11.getChildAt(firstVisiblePosition);
                }
            }
            if (view == null) {
                o12.J();
                o12.G();
                ListView h12 = ((d) arrayList.get(arrayList.size() - 1)).f37389a.h();
                int[] iArr = new int[2];
                h12.getLocationOnScreen(iArr);
                Rect rect = new Rect();
                this.f37374o.getWindowVisibleDisplayFrame(rect);
                if (this.f37375p == 1) {
                }
                int i17 = i12 != 1 ? i11 : 1;
                this.f37375p = i12;
                o12.w(view);
                if ((this.f37372m & 5) != 5) {
                    o11 = i17 != 0 ? view.getWidth() : 0 - o11;
                } else if (i17 == 0) {
                    o11 = 0 - view.getWidth();
                }
                o12.j(o11);
                o12.F();
                o12.c(i11);
            } else {
                if (this.f37376q) {
                    o12.j(this.f37378s);
                }
                if (this.f37377r) {
                    o12.c(this.f37379t);
                }
                o12.A(n());
            }
            arrayList.add(new d(o12, gVar, this.f37375p));
            o12.show();
            ListView h13 = o12.h();
            h13.setOnKeyListener(this);
            if (dVar == null || !this.f37381v || gVar.f37423m == null) {
                return;
            }
            FrameLayout frameLayout = (FrameLayout) from.inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) h13, false);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(gVar.f37423m);
            h13.addHeaderView(frameLayout, null, false);
            o12.show();
            return;
        }
        i11 = 0;
        dVar = null;
        view = null;
        if (view == null) {
        }
        arrayList.add(new d(o12, gVar, this.f37375p));
        o12.show();
        ListView h132 = o12.h();
        h132.setOnKeyListener(this);
        if (dVar == null) {
        }
    }

    @Override // m.InterfaceC7975b
    public final boolean a() {
        ArrayList arrayList = this.f37367h;
        return arrayList.size() > 0 && ((d) arrayList.get(0)).f37389a.a();
    }

    @Override // androidx.appcompat.view.menu.m
    public final void b(g gVar, boolean z11) {
        ArrayList arrayList = this.f37367h;
        int size = arrayList.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                i11 = -1;
                break;
            } else if (gVar == ((d) arrayList.get(i11)).f37390b) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 < 0) {
            return;
        }
        int i12 = i11 + 1;
        if (i12 < arrayList.size()) {
            ((d) arrayList.get(i12)).f37390b.e(false);
        }
        d dVar = (d) arrayList.remove(i11);
        dVar.f37390b.A(this);
        boolean z12 = this.f37385z;
        O o11 = dVar.f37389a;
        if (z12) {
            o11.H();
            o11.x();
        }
        o11.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f37375p = ((d) arrayList.get(size2 - 1)).f37391c;
        } else {
            this.f37375p = this.f37373n.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z11) {
                ((d) arrayList.get(0)).f37390b.e(false);
                return;
            }
            return;
        }
        dismiss();
        m.a aVar = this.f37382w;
        if (aVar != null) {
            aVar.b(gVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.f37383x;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f37383x.removeGlobalOnLayoutListener(this.f37368i);
            }
            this.f37383x = null;
        }
        this.f37374o.removeOnAttachStateChangeListener(this.f37369j);
        ((l.a) this.f37384y).onDismiss();
    }

    @Override // androidx.appcompat.view.menu.m
    public final Parcelable c() {
        return null;
    }

    @Override // m.InterfaceC7975b
    public final void dismiss() {
        ArrayList arrayList = this.f37367h;
        int size = arrayList.size();
        if (size > 0) {
            d[] dVarArr = (d[]) arrayList.toArray(new d[size]);
            for (int i11 = size - 1; i11 >= 0; i11--) {
                d dVar = dVarArr[i11];
                if (dVar.f37389a.a()) {
                    dVar.f37389a.dismiss();
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public final void e(boolean z11) {
        Iterator it = this.f37367h.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((d) it.next()).f37389a.h().getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((f) adapter).notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public final boolean f() {
        return false;
    }

    @Override // m.InterfaceC7975b
    public final ListView h() {
        ArrayList arrayList = this.f37367h;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((d) o0.b(1, arrayList)).f37389a.h();
    }

    @Override // androidx.appcompat.view.menu.m
    public final void i(m.a aVar) {
        this.f37382w = aVar;
    }

    @Override // androidx.appcompat.view.menu.m
    public final void k(Parcelable parcelable) {
    }

    @Override // androidx.appcompat.view.menu.m
    public final boolean l(q qVar) {
        Iterator it = this.f37367h.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            if (qVar == dVar.f37390b) {
                dVar.f37389a.h().requestFocus();
                return true;
            }
        }
        if (!qVar.hasVisibleItems()) {
            return false;
        }
        m(qVar);
        m.a aVar = this.f37382w;
        if (aVar != null) {
            aVar.c(qVar);
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.k
    public final void m(g gVar) {
        gVar.c(this, this.f37361b);
        if (a()) {
            x(gVar);
        } else {
            this.f37366g.add(gVar);
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        d dVar;
        ArrayList arrayList = this.f37367h;
        int size = arrayList.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                dVar = null;
                break;
            }
            dVar = (d) arrayList.get(i11);
            if (!dVar.f37389a.a()) {
                break;
            } else {
                i11++;
            }
        }
        if (dVar != null) {
            dVar.f37390b.e(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i11, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i11 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // androidx.appcompat.view.menu.k
    public final void p(@NonNull View view) {
        if (this.f37373n != view) {
            this.f37373n = view;
            this.f37372m = Gravity.getAbsoluteGravity(this.f37371l, view.getLayoutDirection());
        }
    }

    @Override // androidx.appcompat.view.menu.k
    public final void r(boolean z11) {
        this.f37380u = z11;
    }

    @Override // androidx.appcompat.view.menu.k
    public final void s(int i11) {
        if (this.f37371l != i11) {
            this.f37371l = i11;
            this.f37372m = Gravity.getAbsoluteGravity(i11, this.f37373n.getLayoutDirection());
        }
    }

    @Override // m.InterfaceC7975b
    public final void show() {
        if (a()) {
            return;
        }
        ArrayList arrayList = this.f37366g;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            x((g) it.next());
        }
        arrayList.clear();
        View view = this.f37373n;
        this.f37374o = view;
        if (view != null) {
            boolean z11 = this.f37383x == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f37383x = viewTreeObserver;
            if (z11) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f37368i);
            }
            this.f37374o.addOnAttachStateChangeListener(this.f37369j);
        }
    }

    @Override // androidx.appcompat.view.menu.k
    public final void t(int i11) {
        this.f37376q = true;
        this.f37378s = i11;
    }

    @Override // androidx.appcompat.view.menu.k
    public final void u(PopupWindow.OnDismissListener onDismissListener) {
        this.f37384y = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.k
    public final void v(boolean z11) {
        this.f37381v = z11;
    }

    @Override // androidx.appcompat.view.menu.k
    public final void w(int i11) {
        this.f37377r = true;
        this.f37379t = i11;
    }
}
