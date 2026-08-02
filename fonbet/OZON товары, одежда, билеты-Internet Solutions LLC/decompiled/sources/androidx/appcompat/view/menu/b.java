package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.collection.Z;
import s2.InterfaceMenuItemC9585b;

/* loaded from: classes8.dex */
abstract class b {

    /* renamed from: a, reason: collision with root package name */
    final Context f37358a;

    /* renamed from: b, reason: collision with root package name */
    private Z<InterfaceMenuItemC9585b, MenuItem> f37359b;

    /* renamed from: c, reason: collision with root package name */
    private Z<s2.c, SubMenu> f37360c;

    b(Context context) {
        this.f37358a = context;
    }

    final MenuItem c(MenuItem menuItem) {
        if (!(menuItem instanceof InterfaceMenuItemC9585b)) {
            return menuItem;
        }
        InterfaceMenuItemC9585b interfaceMenuItemC9585b = (InterfaceMenuItemC9585b) menuItem;
        if (this.f37359b == null) {
            this.f37359b = new Z<>();
        }
        MenuItem menuItem2 = this.f37359b.get(interfaceMenuItemC9585b);
        if (menuItem2 != null) {
            return menuItem2;
        }
        j jVar = new j(this.f37358a, interfaceMenuItemC9585b);
        this.f37359b.put(interfaceMenuItemC9585b, jVar);
        return jVar;
    }

    final SubMenu d(SubMenu subMenu) {
        if (!(subMenu instanceof s2.c)) {
            return subMenu;
        }
        s2.c cVar = (s2.c) subMenu;
        if (this.f37360c == null) {
            this.f37360c = new Z<>();
        }
        SubMenu subMenu2 = this.f37360c.get(cVar);
        if (subMenu2 != null) {
            return subMenu2;
        }
        r rVar = new r(this.f37358a, cVar);
        this.f37360c.put(cVar, rVar);
        return rVar;
    }

    final void e() {
        Z<InterfaceMenuItemC9585b, MenuItem> z11 = this.f37359b;
        if (z11 != null) {
            z11.clear();
        }
        Z<s2.c, SubMenu> z12 = this.f37360c;
        if (z12 != null) {
            z12.clear();
        }
    }

    final void f(int i11) {
        if (this.f37359b == null) {
            return;
        }
        int i12 = 0;
        while (i12 < this.f37359b.size()) {
            if (this.f37359b.j(i12).getGroupId() == i11) {
                this.f37359b.l(i12);
                i12--;
            }
            i12++;
        }
    }

    final void g(int i11) {
        if (this.f37359b == null) {
            return;
        }
        for (int i12 = 0; i12 < this.f37359b.size(); i12++) {
            if (this.f37359b.j(i12).getItemId() == i11) {
                this.f37359b.l(i12);
                return;
            }
        }
    }
}
