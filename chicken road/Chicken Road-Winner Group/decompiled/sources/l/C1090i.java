package l;

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
import com.chicken.jump.road.pump.R;
import java.util.ArrayList;
import k.AbstractC1071l;
import k.InterfaceC1074o;
import k.InterfaceC1075p;
import k.InterfaceC1076q;
import k.MenuC1069j;
import k.MenuItemC1070k;
import k.SubMenuC1079t;

/* renamed from: l.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1090i implements InterfaceC1075p {

    /* renamed from: a, reason: collision with root package name */
    public final Context f9800a;

    /* renamed from: b, reason: collision with root package name */
    public Context f9801b;

    /* renamed from: c, reason: collision with root package name */
    public MenuC1069j f9802c;

    /* renamed from: d, reason: collision with root package name */
    public final LayoutInflater f9803d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC1074o f9804e;

    /* renamed from: g, reason: collision with root package name */
    public ActionMenuView f9805g;

    /* renamed from: h, reason: collision with root package name */
    public C1089h f9806h;

    /* renamed from: i, reason: collision with root package name */
    public Drawable f9807i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f9808j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f9809k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f9810l;

    /* renamed from: m, reason: collision with root package name */
    public int f9811m;

    /* renamed from: n, reason: collision with root package name */
    public int f9812n;

    /* renamed from: o, reason: collision with root package name */
    public int f9813o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f9814p;

    /* renamed from: r, reason: collision with root package name */
    public C1087f f9816r;

    /* renamed from: s, reason: collision with root package name */
    public C1087f f9817s;

    /* renamed from: t, reason: collision with root package name */
    public A.a f9818t;

    /* renamed from: u, reason: collision with root package name */
    public C1088g f9819u;
    public final int f = R.layout.abc_action_menu_item_layout;

    /* renamed from: q, reason: collision with root package name */
    public final SparseBooleanArray f9815q = new SparseBooleanArray();

    /* renamed from: v, reason: collision with root package name */
    public final io.flutter.plugin.editing.k f9820v = new io.flutter.plugin.editing.k(this);

    public C1090i(Context context) {
        this.f9800a = context;
        this.f9803d = LayoutInflater.from(context);
    }

    @Override // k.InterfaceC1075p
    public final void a(MenuC1069j menuC1069j, boolean z3) {
        g();
        C1087f c1087f = this.f9817s;
        if (c1087f != null && c1087f.b()) {
            c1087f.f9634i.dismiss();
        }
        InterfaceC1074o interfaceC1074o = this.f9804e;
        if (interfaceC1074o != null) {
            interfaceC1074o.a(menuC1069j, z3);
        }
    }

    @Override // k.InterfaceC1075p
    public final boolean b(MenuItemC1070k menuItemC1070k) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // k.InterfaceC1075p
    public final boolean c(SubMenuC1079t subMenuC1079t) {
        boolean z3;
        if (subMenuC1079t.hasVisibleItems()) {
            SubMenuC1079t subMenuC1079t2 = subMenuC1079t;
            while (true) {
                MenuC1069j menuC1069j = subMenuC1079t2.f9655w;
                if (menuC1069j == this.f9802c) {
                    break;
                }
                subMenuC1079t2 = (SubMenuC1079t) menuC1069j;
            }
            ActionMenuView actionMenuView = this.f9805g;
            View view = null;
            if (actionMenuView != null) {
                int childCount = actionMenuView.getChildCount();
                int i3 = 0;
                while (true) {
                    if (i3 >= childCount) {
                        break;
                    }
                    View childAt = actionMenuView.getChildAt(i3);
                    if ((childAt instanceof InterfaceC1076q) && ((InterfaceC1076q) childAt).getItemData() == subMenuC1079t2.f9656x) {
                        view = childAt;
                        break;
                    }
                    i3++;
                }
            }
            if (view != null) {
                subMenuC1079t.f9656x.getClass();
                int size = subMenuC1079t.f.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size) {
                        z3 = false;
                        break;
                    }
                    MenuItem item = subMenuC1079t.getItem(i4);
                    if (item.isVisible() && item.getIcon() != null) {
                        z3 = true;
                        break;
                    }
                    i4++;
                }
                C1087f c1087f = new C1087f(this, this.f9801b, subMenuC1079t, view);
                this.f9817s = c1087f;
                c1087f.f9632g = z3;
                AbstractC1071l abstractC1071l = c1087f.f9634i;
                if (abstractC1071l != null) {
                    abstractC1071l.o(z3);
                }
                C1087f c1087f2 = this.f9817s;
                if (!c1087f2.b()) {
                    if (c1087f2.f9631e == null) {
                        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                    }
                    c1087f2.d(0, 0, false, false);
                }
                InterfaceC1074o interfaceC1074o = this.f9804e;
                if (interfaceC1074o != null) {
                    interfaceC1074o.c(subMenuC1079t);
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r7v4, types: [k.q] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    public final View d(MenuItemC1070k menuItemC1070k, View view, ActionMenuView actionMenuView) {
        View view2 = menuItemC1070k.f9624z;
        View view3 = view2 != null ? view2 : null;
        if (view3 == null || ((menuItemC1070k.y & 8) != 0 && view2 != null)) {
            ActionMenuItemView actionMenuItemView = view instanceof InterfaceC1076q ? (InterfaceC1076q) view : (InterfaceC1076q) this.f9803d.inflate(this.f, (ViewGroup) actionMenuView, false);
            actionMenuItemView.a(menuItemC1070k);
            ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
            actionMenuItemView2.setItemInvoker(this.f9805g);
            if (this.f9819u == null) {
                this.f9819u = new C1088g(this);
            }
            actionMenuItemView2.setPopupCallback(this.f9819u);
            view3 = actionMenuItemView;
        }
        view3.setVisibility(menuItemC1070k.f9600B ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        actionMenuView.getClass();
        if (!(layoutParams instanceof C1092k)) {
            view3.setLayoutParams(ActionMenuView.i(layoutParams));
        }
        return view3;
    }

    @Override // k.InterfaceC1075p
    public final boolean e(MenuItemC1070k menuItemC1070k) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // k.InterfaceC1075p
    public final void f() {
        int i3;
        ActionMenuView actionMenuView = this.f9805g;
        ArrayList arrayList = null;
        boolean z3 = false;
        if (actionMenuView != null) {
            MenuC1069j menuC1069j = this.f9802c;
            if (menuC1069j != null) {
                menuC1069j.i();
                ArrayList k3 = this.f9802c.k();
                int size = k3.size();
                i3 = 0;
                for (int i4 = 0; i4 < size; i4++) {
                    MenuItemC1070k menuItemC1070k = (MenuItemC1070k) k3.get(i4);
                    if ((menuItemC1070k.f9623x & 32) == 32) {
                        View childAt = actionMenuView.getChildAt(i3);
                        MenuItemC1070k itemData = childAt instanceof InterfaceC1076q ? ((InterfaceC1076q) childAt).getItemData() : null;
                        View d3 = d(menuItemC1070k, childAt, actionMenuView);
                        if (menuItemC1070k != itemData) {
                            d3.setPressed(false);
                            d3.jumpDrawablesToCurrentState();
                        }
                        if (d3 != childAt) {
                            ViewGroup viewGroup = (ViewGroup) d3.getParent();
                            if (viewGroup != null) {
                                viewGroup.removeView(d3);
                            }
                            this.f9805g.addView(d3, i3);
                        }
                        i3++;
                    }
                }
            } else {
                i3 = 0;
            }
            while (i3 < actionMenuView.getChildCount()) {
                if (actionMenuView.getChildAt(i3) == this.f9806h) {
                    i3++;
                } else {
                    actionMenuView.removeViewAt(i3);
                }
            }
        }
        this.f9805g.requestLayout();
        MenuC1069j menuC1069j2 = this.f9802c;
        if (menuC1069j2 != null) {
            menuC1069j2.i();
            ArrayList arrayList2 = menuC1069j2.f9586i;
            int size2 = arrayList2.size();
            for (int i5 = 0; i5 < size2; i5++) {
                ((MenuItemC1070k) arrayList2.get(i5)).getClass();
            }
        }
        MenuC1069j menuC1069j3 = this.f9802c;
        if (menuC1069j3 != null) {
            menuC1069j3.i();
            arrayList = menuC1069j3.f9587j;
        }
        if (this.f9809k && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z3 = !((MenuItemC1070k) arrayList.get(0)).f9600B;
            } else if (size3 > 0) {
                z3 = true;
            }
        }
        if (z3) {
            if (this.f9806h == null) {
                this.f9806h = new C1089h(this, this.f9800a);
            }
            ViewGroup viewGroup2 = (ViewGroup) this.f9806h.getParent();
            if (viewGroup2 != this.f9805g) {
                if (viewGroup2 != null) {
                    viewGroup2.removeView(this.f9806h);
                }
                ActionMenuView actionMenuView2 = this.f9805g;
                C1089h c1089h = this.f9806h;
                actionMenuView2.getClass();
                C1092k h3 = ActionMenuView.h();
                h3.f9822c = true;
                actionMenuView2.addView(c1089h, h3);
            }
        } else {
            C1089h c1089h2 = this.f9806h;
            if (c1089h2 != null) {
                ViewParent parent = c1089h2.getParent();
                ActionMenuView actionMenuView3 = this.f9805g;
                if (parent == actionMenuView3) {
                    actionMenuView3.removeView(this.f9806h);
                }
            }
        }
        this.f9805g.setOverflowReserved(this.f9809k);
    }

    public final boolean g() {
        ActionMenuView actionMenuView;
        A.a aVar = this.f9818t;
        if (aVar != null && (actionMenuView = this.f9805g) != null) {
            actionMenuView.removeCallbacks(aVar);
            this.f9818t = null;
            return true;
        }
        C1087f c1087f = this.f9816r;
        if (c1087f == null) {
            return false;
        }
        if (c1087f.b()) {
            c1087f.f9634i.dismiss();
        }
        return true;
    }

    @Override // k.InterfaceC1075p
    public final void h(InterfaceC1074o interfaceC1074o) {
        throw null;
    }

    @Override // k.InterfaceC1075p
    public final void i(Context context, MenuC1069j menuC1069j) {
        this.f9801b = context;
        LayoutInflater.from(context);
        this.f9802c = menuC1069j;
        Resources resources = context.getResources();
        if (!this.f9810l) {
            this.f9809k = true;
        }
        int i3 = 2;
        this.f9811m = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i4 = configuration.screenWidthDp;
        int i5 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i4 > 600 || ((i4 > 960 && i5 > 720) || (i4 > 720 && i5 > 960))) {
            i3 = 5;
        } else if (i4 >= 500 || ((i4 > 640 && i5 > 480) || (i4 > 480 && i5 > 640))) {
            i3 = 4;
        } else if (i4 >= 360) {
            i3 = 3;
        }
        this.f9813o = i3;
        int i6 = this.f9811m;
        if (this.f9809k) {
            if (this.f9806h == null) {
                C1089h c1089h = new C1089h(this, this.f9800a);
                this.f9806h = c1089h;
                if (this.f9808j) {
                    c1089h.setImageDrawable(this.f9807i);
                    this.f9807i = null;
                    this.f9808j = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f9806h.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i6 -= this.f9806h.getMeasuredWidth();
        } else {
            this.f9806h = null;
        }
        this.f9812n = i6;
        float f = resources.getDisplayMetrics().density;
    }

    @Override // k.InterfaceC1075p
    public final boolean j() {
        int i3;
        ArrayList arrayList;
        int i4;
        boolean z3;
        C1090i c1090i = this;
        MenuC1069j menuC1069j = c1090i.f9802c;
        if (menuC1069j != null) {
            arrayList = menuC1069j.k();
            i3 = arrayList.size();
        } else {
            i3 = 0;
            arrayList = null;
        }
        int i5 = c1090i.f9813o;
        int i6 = c1090i.f9812n;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ActionMenuView actionMenuView = c1090i.f9805g;
        int i7 = 0;
        boolean z4 = false;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            i4 = 2;
            z3 = true;
            if (i7 >= i3) {
                break;
            }
            MenuItemC1070k menuItemC1070k = (MenuItemC1070k) arrayList.get(i7);
            int i10 = menuItemC1070k.y;
            if ((i10 & 2) == 2) {
                i8++;
            } else if ((i10 & 1) == 1) {
                i9++;
            } else {
                z4 = true;
            }
            if (c1090i.f9814p && menuItemC1070k.f9600B) {
                i5 = 0;
            }
            i7++;
        }
        if (c1090i.f9809k && (z4 || i9 + i8 > i5)) {
            i5--;
        }
        int i11 = i5 - i8;
        SparseBooleanArray sparseBooleanArray = c1090i.f9815q;
        sparseBooleanArray.clear();
        int i12 = 0;
        int i13 = 0;
        while (i12 < i3) {
            MenuItemC1070k menuItemC1070k2 = (MenuItemC1070k) arrayList.get(i12);
            int i14 = menuItemC1070k2.y;
            boolean z5 = (i14 & 2) == i4 ? z3 : false;
            int i15 = menuItemC1070k2.f9602b;
            if (z5) {
                View d3 = c1090i.d(menuItemC1070k2, null, actionMenuView);
                d3.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = d3.getMeasuredWidth();
                i6 -= measuredWidth;
                if (i13 == 0) {
                    i13 = measuredWidth;
                }
                if (i15 != 0) {
                    sparseBooleanArray.put(i15, z3);
                }
                menuItemC1070k2.d(z3);
            } else if ((i14 & 1) == z3) {
                boolean z6 = sparseBooleanArray.get(i15);
                boolean z7 = ((i11 > 0 || z6) && i6 > 0) ? z3 : false;
                if (z7) {
                    View d4 = c1090i.d(menuItemC1070k2, null, actionMenuView);
                    d4.measure(makeMeasureSpec, makeMeasureSpec);
                    int measuredWidth2 = d4.getMeasuredWidth();
                    i6 -= measuredWidth2;
                    if (i13 == 0) {
                        i13 = measuredWidth2;
                    }
                    z7 &= i6 + i13 > 0;
                }
                if (z7 && i15 != 0) {
                    sparseBooleanArray.put(i15, true);
                } else if (z6) {
                    sparseBooleanArray.put(i15, false);
                    for (int i16 = 0; i16 < i12; i16++) {
                        MenuItemC1070k menuItemC1070k3 = (MenuItemC1070k) arrayList.get(i16);
                        if (menuItemC1070k3.f9602b == i15) {
                            if ((menuItemC1070k3.f9623x & 32) == 32) {
                                i11++;
                            }
                            menuItemC1070k3.d(false);
                        }
                    }
                }
                if (z7) {
                    i11--;
                }
                menuItemC1070k2.d(z7);
            } else {
                menuItemC1070k2.d(false);
                i12++;
                i4 = 2;
                c1090i = this;
                z3 = true;
            }
            i12++;
            i4 = 2;
            c1090i = this;
            z3 = true;
        }
        return z3;
    }

    public final boolean k() {
        MenuC1069j menuC1069j;
        if (!this.f9809k) {
            return false;
        }
        C1087f c1087f = this.f9816r;
        if ((c1087f != null && c1087f.b()) || (menuC1069j = this.f9802c) == null || this.f9805g == null || this.f9818t != null) {
            return false;
        }
        menuC1069j.i();
        if (menuC1069j.f9587j.isEmpty()) {
            return false;
        }
        A.a aVar = new A.a(this, new C1087f(this, this.f9801b, this.f9802c, this.f9806h), 9, false);
        this.f9818t = aVar;
        this.f9805g.post(aVar);
        InterfaceC1074o interfaceC1074o = this.f9804e;
        if (interfaceC1074o == null) {
            return true;
        }
        interfaceC1074o.c(null);
        return true;
    }
}
