package n;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import game.betting133.sports1xbet.R;
import java.util.ArrayList;
import m.AbstractC2072j;
import m.InterfaceC2075m;
import m.InterfaceC2076n;
import m.InterfaceC2077o;
import m.MenuC2070h;
import m.MenuItemC2071i;
import m.SubMenuC2080r;

/* renamed from: n.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2140j implements InterfaceC2076n {

    /* renamed from: B, reason: collision with root package name */
    public C2132f f18255B;

    /* renamed from: C, reason: collision with root package name */
    public C2132f f18256C;

    /* renamed from: D, reason: collision with root package name */
    public D3.h f18257D;

    /* renamed from: E, reason: collision with root package name */
    public C2134g f18258E;

    /* renamed from: k, reason: collision with root package name */
    public final Context f18260k;

    /* renamed from: l, reason: collision with root package name */
    public Context f18261l;

    /* renamed from: m, reason: collision with root package name */
    public MenuC2070h f18262m;

    /* renamed from: n, reason: collision with root package name */
    public final LayoutInflater f18263n;

    /* renamed from: o, reason: collision with root package name */
    public InterfaceC2075m f18264o;

    /* renamed from: q, reason: collision with root package name */
    public ActionMenuView f18266q;

    /* renamed from: r, reason: collision with root package name */
    public C2136h f18267r;

    /* renamed from: s, reason: collision with root package name */
    public Drawable f18268s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f18269t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f18270u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f18271v;

    /* renamed from: w, reason: collision with root package name */
    public int f18272w;

    /* renamed from: x, reason: collision with root package name */
    public int f18273x;

    /* renamed from: y, reason: collision with root package name */
    public int f18274y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f18275z;

    /* renamed from: p, reason: collision with root package name */
    public final int f18265p = R.layout.abc_action_menu_item_layout;

    /* renamed from: A, reason: collision with root package name */
    public final SparseBooleanArray f18254A = new SparseBooleanArray();

    /* renamed from: F, reason: collision with root package name */
    public final C2138i f18259F = new C2138i(0, this);

    public C2140j(Context context) {
        this.f18260k = context;
        this.f18263n = LayoutInflater.from(context);
    }

    @Override // m.InterfaceC2076n
    public final void a(MenuC2070h menuC2070h, boolean z3) {
        d();
        C2132f c2132f = this.f18256C;
        if (c2132f != null && c2132f.b()) {
            c2132f.i.dismiss();
        }
        InterfaceC2075m interfaceC2075m = this.f18264o;
        if (interfaceC2075m != null) {
            interfaceC2075m.a(menuC2070h, z3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r7v4, types: [m.o] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    public final View b(MenuItemC2071i menuItemC2071i, View view, ActionMenuView actionMenuView) {
        View view2 = menuItemC2071i.f17949z;
        View view3 = view2 != null ? view2 : null;
        if (view3 == null || ((menuItemC2071i.f17948y & 8) != 0 && view2 != null)) {
            ActionMenuItemView actionMenuItemView = view instanceof InterfaceC2077o ? (InterfaceC2077o) view : (InterfaceC2077o) this.f18263n.inflate(this.f18265p, (ViewGroup) actionMenuView, false);
            actionMenuItemView.a(menuItemC2071i);
            ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
            actionMenuItemView2.setItemInvoker(this.f18266q);
            if (this.f18258E == null) {
                this.f18258E = new C2134g(this);
            }
            actionMenuItemView2.setPopupCallback(this.f18258E);
            view3 = actionMenuItemView;
        }
        view3.setVisibility(menuItemC2071i.f17925B ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        actionMenuView.getClass();
        if (!(layoutParams instanceof C2142l)) {
            view3.setLayoutParams(ActionMenuView.i(layoutParams));
        }
        return view3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // m.InterfaceC2076n
    public final void c() {
        int i;
        ActionMenuView actionMenuView = this.f18266q;
        ArrayList arrayList = null;
        boolean z3 = false;
        if (actionMenuView != null) {
            MenuC2070h menuC2070h = this.f18262m;
            if (menuC2070h != null) {
                menuC2070h.i();
                ArrayList k5 = this.f18262m.k();
                int size = k5.size();
                i = 0;
                for (int i5 = 0; i5 < size; i5++) {
                    MenuItemC2071i menuItemC2071i = (MenuItemC2071i) k5.get(i5);
                    if ((menuItemC2071i.f17947x & 32) == 32) {
                        View childAt = actionMenuView.getChildAt(i);
                        MenuItemC2071i itemData = childAt instanceof InterfaceC2077o ? ((InterfaceC2077o) childAt).getItemData() : null;
                        View b3 = b(menuItemC2071i, childAt, actionMenuView);
                        if (menuItemC2071i != itemData) {
                            b3.setPressed(false);
                            b3.jumpDrawablesToCurrentState();
                        }
                        if (b3 != childAt) {
                            ViewGroup viewGroup = (ViewGroup) b3.getParent();
                            if (viewGroup != null) {
                                viewGroup.removeView(b3);
                            }
                            this.f18266q.addView(b3, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < actionMenuView.getChildCount()) {
                if (actionMenuView.getChildAt(i) == this.f18267r) {
                    i++;
                } else {
                    actionMenuView.removeViewAt(i);
                }
            }
        }
        this.f18266q.requestLayout();
        MenuC2070h menuC2070h2 = this.f18262m;
        if (menuC2070h2 != null) {
            menuC2070h2.i();
            ArrayList arrayList2 = menuC2070h2.i;
            int size2 = arrayList2.size();
            for (int i6 = 0; i6 < size2; i6++) {
                ((MenuItemC2071i) arrayList2.get(i6)).getClass();
            }
        }
        MenuC2070h menuC2070h3 = this.f18262m;
        if (menuC2070h3 != null) {
            menuC2070h3.i();
            arrayList = menuC2070h3.f17912j;
        }
        if (this.f18270u && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z3 = !((MenuItemC2071i) arrayList.get(0)).f17925B;
            } else if (size3 > 0) {
                z3 = true;
            }
        }
        if (z3) {
            if (this.f18267r == null) {
                this.f18267r = new C2136h(this, this.f18260k);
            }
            ViewGroup viewGroup2 = (ViewGroup) this.f18267r.getParent();
            if (viewGroup2 != this.f18266q) {
                if (viewGroup2 != null) {
                    viewGroup2.removeView(this.f18267r);
                }
                ActionMenuView actionMenuView2 = this.f18266q;
                C2136h c2136h = this.f18267r;
                actionMenuView2.getClass();
                C2142l h3 = ActionMenuView.h();
                h3.f18276a = true;
                actionMenuView2.addView(c2136h, h3);
            }
        } else {
            C2136h c2136h2 = this.f18267r;
            if (c2136h2 != null) {
                ViewParent parent = c2136h2.getParent();
                ActionMenuView actionMenuView3 = this.f18266q;
                if (parent == actionMenuView3) {
                    actionMenuView3.removeView(this.f18267r);
                }
            }
        }
        this.f18266q.setOverflowReserved(this.f18270u);
    }

    public final boolean d() {
        ActionMenuView actionMenuView;
        D3.h hVar = this.f18257D;
        if (hVar != null && (actionMenuView = this.f18266q) != null) {
            actionMenuView.removeCallbacks(hVar);
            this.f18257D = null;
            return true;
        }
        C2132f c2132f = this.f18255B;
        if (c2132f == null) {
            return false;
        }
        if (c2132f.b()) {
            c2132f.i.dismiss();
        }
        return true;
    }

    @Override // m.InterfaceC2076n
    public final boolean e(MenuItemC2071i menuItemC2071i) {
        return false;
    }

    @Override // m.InterfaceC2076n
    public final void f(Context context, MenuC2070h menuC2070h) {
        this.f18261l = context;
        LayoutInflater.from(context);
        this.f18262m = menuC2070h;
        Resources resources = context.getResources();
        if (!this.f18271v) {
            this.f18270u = true;
        }
        int i = 2;
        this.f18272w = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i5 = configuration.screenWidthDp;
        int i6 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i5 > 600 || ((i5 > 960 && i6 > 720) || (i5 > 720 && i6 > 960))) {
            i = 5;
        } else if (i5 >= 500 || ((i5 > 640 && i6 > 480) || (i5 > 480 && i6 > 640))) {
            i = 4;
        } else if (i5 >= 360) {
            i = 3;
        }
        this.f18274y = i;
        int i7 = this.f18272w;
        if (this.f18270u) {
            if (this.f18267r == null) {
                C2136h c2136h = new C2136h(this, this.f18260k);
                this.f18267r = c2136h;
                if (this.f18269t) {
                    c2136h.setImageDrawable(this.f18268s);
                    this.f18268s = null;
                    this.f18269t = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f18267r.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i7 -= this.f18267r.getMeasuredWidth();
        } else {
            this.f18267r = null;
        }
        this.f18273x = i7;
        float f = resources.getDisplayMetrics().density;
    }

    @Override // m.InterfaceC2076n
    public final boolean g() {
        int i;
        ArrayList arrayList;
        int i5;
        boolean z3;
        C2140j c2140j = this;
        MenuC2070h menuC2070h = c2140j.f18262m;
        if (menuC2070h != null) {
            arrayList = menuC2070h.k();
            i = arrayList.size();
        } else {
            i = 0;
            arrayList = null;
        }
        int i6 = c2140j.f18274y;
        int i7 = c2140j.f18273x;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ActionMenuView actionMenuView = c2140j.f18266q;
        int i8 = 0;
        boolean z5 = false;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            i5 = 2;
            z3 = true;
            if (i8 >= i) {
                break;
            }
            MenuItemC2071i menuItemC2071i = (MenuItemC2071i) arrayList.get(i8);
            int i11 = menuItemC2071i.f17948y;
            if ((i11 & 2) == 2) {
                i9++;
            } else if ((i11 & 1) == 1) {
                i10++;
            } else {
                z5 = true;
            }
            if (c2140j.f18275z && menuItemC2071i.f17925B) {
                i6 = 0;
            }
            i8++;
        }
        if (c2140j.f18270u && (z5 || i10 + i9 > i6)) {
            i6--;
        }
        int i12 = i6 - i9;
        SparseBooleanArray sparseBooleanArray = c2140j.f18254A;
        sparseBooleanArray.clear();
        int i13 = 0;
        int i14 = 0;
        while (i13 < i) {
            MenuItemC2071i menuItemC2071i2 = (MenuItemC2071i) arrayList.get(i13);
            int i15 = menuItemC2071i2.f17948y;
            boolean z6 = (i15 & 2) == i5 ? z3 : false;
            int i16 = menuItemC2071i2.f17927b;
            if (z6) {
                View b3 = c2140j.b(menuItemC2071i2, null, actionMenuView);
                b3.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = b3.getMeasuredWidth();
                i7 -= measuredWidth;
                if (i14 == 0) {
                    i14 = measuredWidth;
                }
                if (i16 != 0) {
                    sparseBooleanArray.put(i16, z3);
                }
                menuItemC2071i2.d(z3);
            } else if ((i15 & 1) == z3) {
                boolean z7 = sparseBooleanArray.get(i16);
                boolean z8 = ((i12 > 0 || z7) && i7 > 0) ? z3 : false;
                if (z8) {
                    View b5 = c2140j.b(menuItemC2071i2, null, actionMenuView);
                    b5.measure(makeMeasureSpec, makeMeasureSpec);
                    int measuredWidth2 = b5.getMeasuredWidth();
                    i7 -= measuredWidth2;
                    if (i14 == 0) {
                        i14 = measuredWidth2;
                    }
                    z8 &= i7 + i14 > 0;
                }
                if (z8 && i16 != 0) {
                    sparseBooleanArray.put(i16, true);
                } else if (z7) {
                    sparseBooleanArray.put(i16, false);
                    for (int i17 = 0; i17 < i13; i17++) {
                        MenuItemC2071i menuItemC2071i3 = (MenuItemC2071i) arrayList.get(i17);
                        if (menuItemC2071i3.f17927b == i16) {
                            if ((menuItemC2071i3.f17947x & 32) == 32) {
                                i12++;
                            }
                            menuItemC2071i3.d(false);
                        }
                    }
                }
                if (z8) {
                    i12--;
                }
                menuItemC2071i2.d(z8);
            } else {
                menuItemC2071i2.d(false);
                i13++;
                i5 = 2;
                c2140j = this;
                z3 = true;
            }
            i13++;
            i5 = 2;
            c2140j = this;
            z3 = true;
        }
        return z3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // m.InterfaceC2076n
    public final boolean h(SubMenuC2080r subMenuC2080r) {
        boolean z3;
        if (subMenuC2080r.hasVisibleItems()) {
            SubMenuC2080r subMenuC2080r2 = subMenuC2080r;
            while (true) {
                MenuC2070h menuC2070h = subMenuC2080r2.f17980w;
                if (menuC2070h == this.f18262m) {
                    break;
                }
                subMenuC2080r2 = (SubMenuC2080r) menuC2070h;
            }
            ActionMenuView actionMenuView = this.f18266q;
            View view = null;
            if (actionMenuView != null) {
                int childCount = actionMenuView.getChildCount();
                int i = 0;
                while (true) {
                    if (i >= childCount) {
                        break;
                    }
                    View childAt = actionMenuView.getChildAt(i);
                    if ((childAt instanceof InterfaceC2077o) && ((InterfaceC2077o) childAt).getItemData() == subMenuC2080r2.f17981x) {
                        view = childAt;
                        break;
                    }
                    i++;
                }
            }
            if (view != null) {
                subMenuC2080r.f17981x.getClass();
                int size = subMenuC2080r.f.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size) {
                        z3 = false;
                        break;
                    }
                    MenuItem item = subMenuC2080r.getItem(i5);
                    if (item.isVisible() && item.getIcon() != null) {
                        z3 = true;
                        break;
                    }
                    i5++;
                }
                C2132f c2132f = new C2132f(this, this.f18261l, subMenuC2080r, view);
                this.f18256C = c2132f;
                c2132f.f17957g = z3;
                AbstractC2072j abstractC2072j = c2132f.i;
                if (abstractC2072j != null) {
                    abstractC2072j.o(z3);
                }
                C2132f c2132f2 = this.f18256C;
                if (!c2132f2.b()) {
                    if (c2132f2.f17956e == null) {
                        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                    }
                    c2132f2.d(0, 0, false, false);
                }
                InterfaceC2075m interfaceC2075m = this.f18264o;
                if (interfaceC2075m != null) {
                    interfaceC2075m.d(subMenuC2080r);
                }
                return true;
            }
        }
        return false;
    }

    public final boolean i() {
        MenuC2070h menuC2070h;
        if (!this.f18270u) {
            return false;
        }
        C2132f c2132f = this.f18255B;
        if ((c2132f != null && c2132f.b()) || (menuC2070h = this.f18262m) == null || this.f18266q == null || this.f18257D != null) {
            return false;
        }
        menuC2070h.i();
        if (menuC2070h.f17912j.isEmpty()) {
            return false;
        }
        D3.h hVar = new D3.h(22, this, new C2132f(this, this.f18261l, this.f18262m, this.f18267r));
        this.f18257D = hVar;
        this.f18266q.post(hVar);
        return true;
    }

    @Override // m.InterfaceC2076n
    public final void j(InterfaceC2075m interfaceC2075m) {
        throw null;
    }

    @Override // m.InterfaceC2076n
    public final boolean k(MenuItemC2071i menuItemC2071i) {
        return false;
    }
}
