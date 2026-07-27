package l;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import j.InterfaceC1050a;
import java.util.ArrayList;
import k.InterfaceC1075p;
import k.MenuC1069j;
import k.MenuItemC1070k;
import k.SubMenuC1079t;

/* loaded from: classes.dex */
public final class l0 implements InterfaceC1075p {

    /* renamed from: a, reason: collision with root package name */
    public MenuC1069j f9829a;

    /* renamed from: b, reason: collision with root package name */
    public MenuItemC1070k f9830b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Toolbar f9831c;

    public l0(Toolbar toolbar) {
        this.f9831c = toolbar;
    }

    @Override // k.InterfaceC1075p
    public final boolean b(MenuItemC1070k menuItemC1070k) {
        Toolbar toolbar = this.f9831c;
        toolbar.c();
        ViewParent parent = toolbar.f2076h.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f2076h);
            }
            toolbar.addView(toolbar.f2076h);
        }
        View view = menuItemC1070k.f9624z;
        if (view == null) {
            view = null;
        }
        toolbar.f2077i = view;
        this.f9830b = menuItemC1070k;
        ViewParent parent2 = view.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f2077i);
            }
            m0 g3 = Toolbar.g();
            g3.f9835a = (toolbar.f2082n & 112) | 8388611;
            g3.f9836b = 2;
            toolbar.f2077i.setLayoutParams(g3);
            toolbar.addView(toolbar.f2077i);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((m0) childAt.getLayoutParams()).f9836b != 2 && childAt != toolbar.f2070a) {
                toolbar.removeViewAt(childCount);
                toolbar.f2063E.add(childAt);
            }
        }
        toolbar.requestLayout();
        menuItemC1070k.f9600B = true;
        menuItemC1070k.f9613n.o(false);
        KeyEvent.Callback callback = toolbar.f2077i;
        if (callback instanceof InterfaceC1050a) {
            SearchView searchView = (SearchView) ((InterfaceC1050a) callback);
            if (!searchView.f2003W) {
                searchView.f2003W = true;
                SearchView.SearchAutoComplete searchAutoComplete = searchView.f2009p;
                int imeOptions = searchAutoComplete.getImeOptions();
                searchView.f2004a0 = imeOptions;
                searchAutoComplete.setImeOptions(imeOptions | 33554432);
                searchAutoComplete.setText("");
                searchView.setIconified(false);
            }
        }
        return true;
    }

    @Override // k.InterfaceC1075p
    public final boolean c(SubMenuC1079t subMenuC1079t) {
        return false;
    }

    @Override // k.InterfaceC1075p
    public final boolean e(MenuItemC1070k menuItemC1070k) {
        Toolbar toolbar = this.f9831c;
        KeyEvent.Callback callback = toolbar.f2077i;
        if (callback instanceof InterfaceC1050a) {
            SearchView searchView = (SearchView) ((InterfaceC1050a) callback);
            SearchView.SearchAutoComplete searchAutoComplete = searchView.f2009p;
            searchAutoComplete.setText("");
            searchAutoComplete.setSelection(searchAutoComplete.length());
            searchView.f2002V = "";
            searchView.clearFocus();
            searchView.u(true);
            searchAutoComplete.setImeOptions(searchView.f2004a0);
            searchView.f2003W = false;
        }
        toolbar.removeView(toolbar.f2077i);
        toolbar.removeView(toolbar.f2076h);
        toolbar.f2077i = null;
        ArrayList arrayList = toolbar.f2063E;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f9830b = null;
        toolbar.requestLayout();
        menuItemC1070k.f9600B = false;
        menuItemC1070k.f9613n.o(false);
        return true;
    }

    @Override // k.InterfaceC1075p
    public final void f() {
        if (this.f9830b != null) {
            MenuC1069j menuC1069j = this.f9829a;
            if (menuC1069j != null) {
                int size = menuC1069j.f.size();
                for (int i3 = 0; i3 < size; i3++) {
                    if (this.f9829a.getItem(i3) == this.f9830b) {
                        return;
                    }
                }
            }
            e(this.f9830b);
        }
    }

    @Override // k.InterfaceC1075p
    public final void i(Context context, MenuC1069j menuC1069j) {
        MenuItemC1070k menuItemC1070k;
        MenuC1069j menuC1069j2 = this.f9829a;
        if (menuC1069j2 != null && (menuItemC1070k = this.f9830b) != null) {
            menuC1069j2.d(menuItemC1070k);
        }
        this.f9829a = menuC1069j;
    }

    @Override // k.InterfaceC1075p
    public final boolean j() {
        return false;
    }

    @Override // k.InterfaceC1075p
    public final void a(MenuC1069j menuC1069j, boolean z3) {
    }
}
