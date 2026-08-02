package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.g;

/* loaded from: classes8.dex */
public final class q extends g implements SubMenu {

    /* renamed from: A, reason: collision with root package name */
    private i f37513A;

    /* renamed from: z, reason: collision with root package name */
    private g f37514z;

    public q(Context context, g gVar, i iVar) {
        super(context);
        this.f37514z = gVar;
        this.f37513A = iVar;
    }

    @Override // androidx.appcompat.view.menu.g
    public final void F(g.a aVar) {
        throw null;
    }

    public final g R() {
        return this.f37514z;
    }

    @Override // androidx.appcompat.view.menu.g
    public final boolean f(i iVar) {
        return this.f37514z.f(iVar);
    }

    @Override // androidx.appcompat.view.menu.g
    final boolean g(@NonNull g gVar, @NonNull i iVar) {
        return super.g(gVar, iVar) || this.f37514z.g(gVar, iVar);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.f37513A;
    }

    @Override // androidx.appcompat.view.menu.g
    public final boolean h(i iVar) {
        return this.f37514z.h(iVar);
    }

    @Override // androidx.appcompat.view.menu.g
    public final String m() {
        i iVar = this.f37513A;
        int itemId = iVar != null ? iVar.getItemId() : 0;
        if (itemId == 0) {
            return null;
        }
        return Ej.b.a(itemId, "android:menu:actionviewstates:");
    }

    @Override // androidx.appcompat.view.menu.g
    public final g q() {
        return this.f37514z.q();
    }

    @Override // androidx.appcompat.view.menu.g, android.view.Menu
    public final void setGroupDividerEnabled(boolean z11) {
        this.f37514z.setGroupDividerEnabled(z11);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        J(drawable);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        M(charSequence);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        N(view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.f37513A.setIcon(drawable);
        return this;
    }

    @Override // androidx.appcompat.view.menu.g, android.view.Menu
    public final void setQwertyMode(boolean z11) {
        this.f37514z.setQwertyMode(z11);
    }

    @Override // androidx.appcompat.view.menu.g
    public final boolean t() {
        return this.f37514z.t();
    }

    @Override // androidx.appcompat.view.menu.g
    public final boolean u() {
        return this.f37514z.u();
    }

    @Override // androidx.appcompat.view.menu.g
    public final boolean v() {
        return this.f37514z.v();
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i11) {
        I(i11);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i11) {
        L(i11);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i11) {
        this.f37513A.setIcon(i11);
        return this;
    }
}
