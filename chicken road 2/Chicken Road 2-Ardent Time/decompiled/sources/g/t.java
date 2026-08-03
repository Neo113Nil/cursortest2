package g;

/* loaded from: classes.dex */
public final class t extends g.j implements android.view.SubMenu {

    /* renamed from: v, reason: collision with root package name */
    public final g.j f3037v;

    /* renamed from: w, reason: collision with root package name */
    public final g.k f3038w;

    public t(android.content.Context context, g.j jVar, g.k kVar) {
        super(context);
        this.f3037v = jVar;
        this.f3038w = kVar;
    }

    @Override // g.j
    public final boolean d(g.k kVar) {
        return this.f3037v.d(kVar);
    }

    @Override // g.j
    public final boolean e(g.j jVar, android.view.MenuItem menuItem) {
        super.e(jVar, menuItem);
        return this.f3037v.e(jVar, menuItem);
    }

    @Override // g.j
    public final boolean f(g.k kVar) {
        return this.f3037v.f(kVar);
    }

    @Override // android.view.SubMenu
    public final android.view.MenuItem getItem() {
        return this.f3038w;
    }

    @Override // g.j
    public final g.j j() {
        return this.f3037v.j();
    }

    @Override // g.j
    public final boolean l() {
        return this.f3037v.l();
    }

    @Override // g.j
    public final boolean m() {
        return this.f3037v.m();
    }

    @Override // g.j
    public final boolean n() {
        return this.f3037v.n();
    }

    @Override // g.j, android.view.Menu
    public final void setGroupDividerEnabled(boolean z2) {
        this.f3037v.setGroupDividerEnabled(z2);
    }

    @Override // android.view.SubMenu
    public final android.view.SubMenu setHeaderIcon(android.graphics.drawable.Drawable drawable) {
        q(0, null, 0, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final android.view.SubMenu setHeaderTitle(java.lang.CharSequence charSequence) {
        q(0, charSequence, 0, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final android.view.SubMenu setHeaderView(android.view.View view) {
        q(0, null, 0, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final android.view.SubMenu setIcon(android.graphics.drawable.Drawable drawable) {
        this.f3038w.setIcon(drawable);
        return this;
    }

    @Override // g.j, android.view.Menu
    public final void setQwertyMode(boolean z2) {
        this.f3037v.setQwertyMode(z2);
    }

    @Override // android.view.SubMenu
    public final android.view.SubMenu setHeaderIcon(int i2) {
        q(0, null, i2, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final android.view.SubMenu setHeaderTitle(int i2) {
        q(i2, null, 0, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final android.view.SubMenu setIcon(int i2) {
        this.f3038w.setIcon(i2);
        return this;
    }
}
