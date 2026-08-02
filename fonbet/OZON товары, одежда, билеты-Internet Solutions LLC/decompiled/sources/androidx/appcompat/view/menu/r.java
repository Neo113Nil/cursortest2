package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* loaded from: classes8.dex */
final class r extends o implements SubMenu {

    /* renamed from: e, reason: collision with root package name */
    private final s2.c f37515e;

    r(Context context, s2.c cVar) {
        super(context, cVar);
        this.f37515e = cVar;
    }

    @Override // android.view.SubMenu
    public final void clearHeader() {
        this.f37515e.clearHeader();
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return c(this.f37515e.getItem());
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i11) {
        this.f37515e.setHeaderIcon(i11);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i11) {
        this.f37515e.setHeaderTitle(i11);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        this.f37515e.setHeaderView(view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i11) {
        this.f37515e.setIcon(i11);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        this.f37515e.setHeaderIcon(drawable);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        this.f37515e.setHeaderTitle(charSequence);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.f37515e.setIcon(drawable);
        return this;
    }
}
