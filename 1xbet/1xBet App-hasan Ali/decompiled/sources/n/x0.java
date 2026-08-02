package n;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import m.InterfaceC2076n;
import m.MenuC2070h;
import m.MenuItemC2071i;
import m.SubMenuC2080r;

/* loaded from: classes.dex */
public final class x0 implements InterfaceC2076n {

    /* renamed from: k, reason: collision with root package name */
    public MenuC2070h f18330k;

    /* renamed from: l, reason: collision with root package name */
    public MenuItemC2071i f18331l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Toolbar f18332m;

    public x0(Toolbar toolbar) {
        this.f18332m = toolbar;
    }

    @Override // m.InterfaceC2076n
    public final void c() {
        if (this.f18331l != null) {
            MenuC2070h menuC2070h = this.f18330k;
            if (menuC2070h != null) {
                int size = menuC2070h.f.size();
                for (int i = 0; i < size; i++) {
                    if (this.f18330k.getItem(i) == this.f18331l) {
                        return;
                    }
                }
            }
            k(this.f18331l);
        }
    }

    @Override // m.InterfaceC2076n
    public final boolean e(MenuItemC2071i menuItemC2071i) {
        Toolbar toolbar = this.f18332m;
        toolbar.c();
        ViewParent parent = toolbar.f6783r.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f6783r);
            }
            toolbar.addView(toolbar.f6783r);
        }
        View view = menuItemC2071i.f17949z;
        if (view == null) {
            view = null;
        }
        toolbar.f6784s = view;
        this.f18331l = menuItemC2071i;
        ViewParent parent2 = view.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f6784s);
            }
            y0 g5 = Toolbar.g();
            g5.f18333a = (toolbar.f6789x & 112) | 8388611;
            g5.f18334b = 2;
            toolbar.f6784s.setLayoutParams(g5);
            toolbar.addView(toolbar.f6784s);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((y0) childAt.getLayoutParams()).f18334b != 2 && childAt != toolbar.f6776k) {
                toolbar.removeViewAt(childCount);
                toolbar.f6764O.add(childAt);
            }
        }
        toolbar.requestLayout();
        menuItemC2071i.f17925B = true;
        menuItemC2071i.f17937n.o(false);
        toolbar.s();
        return true;
    }

    @Override // m.InterfaceC2076n
    public final void f(Context context, MenuC2070h menuC2070h) {
        MenuItemC2071i menuItemC2071i;
        MenuC2070h menuC2070h2 = this.f18330k;
        if (menuC2070h2 != null && (menuItemC2071i = this.f18331l) != null) {
            menuC2070h2.d(menuItemC2071i);
        }
        this.f18330k = menuC2070h;
    }

    @Override // m.InterfaceC2076n
    public final boolean g() {
        return false;
    }

    @Override // m.InterfaceC2076n
    public final boolean h(SubMenuC2080r subMenuC2080r) {
        return false;
    }

    @Override // m.InterfaceC2076n
    public final boolean k(MenuItemC2071i menuItemC2071i) {
        Toolbar toolbar = this.f18332m;
        toolbar.removeView(toolbar.f6784s);
        toolbar.removeView(toolbar.f6783r);
        toolbar.f6784s = null;
        ArrayList arrayList = toolbar.f6764O;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f18331l = null;
        toolbar.requestLayout();
        menuItemC2071i.f17925B = false;
        menuItemC2071i.f17937n.o(false);
        toolbar.s();
        return true;
    }

    @Override // m.InterfaceC2076n
    public final void a(MenuC2070h menuC2070h, boolean z3) {
    }
}
