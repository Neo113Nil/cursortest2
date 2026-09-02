package g;

/* loaded from: classes.dex */
public final class k implements android.view.MenuItem {

    /* renamed from: A, reason: collision with root package name */
    public android.view.MenuItem.OnActionExpandListener f2979A;

    /* renamed from: a, reason: collision with root package name */
    public final int f2981a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2982b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2983c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2984d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.CharSequence f2985e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.CharSequence f2986f;

    /* renamed from: g, reason: collision with root package name */
    public android.content.Intent f2987g;

    /* renamed from: h, reason: collision with root package name */
    public char f2988h;

    /* renamed from: j, reason: collision with root package name */
    public char f2990j;

    /* renamed from: l, reason: collision with root package name */
    public android.graphics.drawable.Drawable f2992l;

    /* renamed from: n, reason: collision with root package name */
    public final g.j f2994n;

    /* renamed from: o, reason: collision with root package name */
    public g.t f2995o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.MenuItem.OnMenuItemClickListener f2996p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.CharSequence f2997q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.CharSequence f2998r;

    /* renamed from: z, reason: collision with root package name */
    public android.view.View f3005z;

    /* renamed from: i, reason: collision with root package name */
    public int f2989i = io.appmetrica.analytics.coreutils.internal.io.Base64Utils.IO_BUFFER_SIZE;

    /* renamed from: k, reason: collision with root package name */
    public int f2991k = io.appmetrica.analytics.coreutils.internal.io.Base64Utils.IO_BUFFER_SIZE;

    /* renamed from: m, reason: collision with root package name */
    public int f2993m = 0;

    /* renamed from: s, reason: collision with root package name */
    public android.content.res.ColorStateList f2999s = null;
    public android.graphics.PorterDuff.Mode t = null;

    /* renamed from: u, reason: collision with root package name */
    public boolean f3000u = false;

    /* renamed from: v, reason: collision with root package name */
    public boolean f3001v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f3002w = false;

    /* renamed from: x, reason: collision with root package name */
    public int f3003x = 16;

    /* renamed from: B, reason: collision with root package name */
    public boolean f2980B = false;

    /* renamed from: y, reason: collision with root package name */
    public int f3004y = 0;

    public k(g.j jVar, int i2, int i3, int i4, int i5, java.lang.CharSequence charSequence) {
        this.f2994n = jVar;
        this.f2981a = i3;
        this.f2982b = i2;
        this.f2983c = i4;
        this.f2984d = i5;
        this.f2985e = charSequence;
    }

    public static void a(java.lang.StringBuilder sb, int i2, int i3, java.lang.String str) {
        if ((i2 & i3) == i3) {
            sb.append(str);
        }
    }

    public final android.graphics.drawable.Drawable b(android.graphics.drawable.Drawable drawable) {
        if (drawable != null && this.f3002w && (this.f3000u || this.f3001v)) {
            drawable = drawable.mutate();
            if (this.f3000u) {
                s.AbstractC0989a.h(drawable, this.f2999s);
            }
            if (this.f3001v) {
                s.AbstractC0989a.i(drawable, this.t);
            }
            this.f3002w = false;
        }
        return drawable;
    }

    public final boolean c() {
        return ((this.f3004y & 8) == 0 || this.f3005z == null) ? false : true;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f3004y & 8) == 0) {
            return false;
        }
        if (this.f3005z == null) {
            return true;
        }
        android.view.MenuItem.OnActionExpandListener onActionExpandListener = this.f2979A;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f2994n.d(this);
        }
        return false;
    }

    public final boolean d() {
        return (this.f3003x & 32) == 32;
    }

    public final g.k e(java.lang.CharSequence charSequence) {
        this.f2997q = charSequence;
        this.f2994n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!c()) {
            return false;
        }
        android.view.MenuItem.OnActionExpandListener onActionExpandListener = this.f2979A;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f2994n.f(this);
        }
        return false;
    }

    public final void f(boolean z2) {
        if (z2) {
            this.f3003x |= 32;
        } else {
            this.f3003x &= -33;
        }
    }

    public final g.k g(java.lang.CharSequence charSequence) {
        this.f2998r = charSequence;
        this.f2994n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.ActionProvider getActionProvider() {
        throw new java.lang.UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final android.view.View getActionView() {
        android.view.View view = this.f3005z;
        if (view != null) {
            return view;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f2991k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f2990j;
    }

    @Override // android.view.MenuItem
    public final java.lang.CharSequence getContentDescription() {
        return this.f2997q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f2982b;
    }

    @Override // android.view.MenuItem
    public final android.graphics.drawable.Drawable getIcon() {
        android.graphics.drawable.Drawable drawable = this.f2992l;
        if (drawable != null) {
            return b(drawable);
        }
        int i2 = this.f2993m;
        if (i2 == 0) {
            return null;
        }
        android.graphics.drawable.Drawable a2 = d.AbstractC0106a.a(this.f2994n.f2960a, i2);
        this.f2993m = 0;
        this.f2992l = a2;
        return b(a2);
    }

    @Override // android.view.MenuItem
    public final android.content.res.ColorStateList getIconTintList() {
        return this.f2999s;
    }

    @Override // android.view.MenuItem
    public final android.graphics.PorterDuff.Mode getIconTintMode() {
        return this.t;
    }

    @Override // android.view.MenuItem
    public final android.content.Intent getIntent() {
        return this.f2987g;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f2981a;
    }

    @Override // android.view.MenuItem
    public final android.view.ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f2989i;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f2988h;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f2983c;
    }

    @Override // android.view.MenuItem
    public final android.view.SubMenu getSubMenu() {
        return this.f2995o;
    }

    @Override // android.view.MenuItem
    public final java.lang.CharSequence getTitle() {
        return this.f2985e;
    }

    @Override // android.view.MenuItem
    public final java.lang.CharSequence getTitleCondensed() {
        java.lang.CharSequence charSequence = this.f2986f;
        return charSequence != null ? charSequence : this.f2985e;
    }

    @Override // android.view.MenuItem
    public final java.lang.CharSequence getTooltipText() {
        return this.f2998r;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f2995o != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f2980B;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f3003x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f3003x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f3003x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.f3003x & 8) == 0;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setActionProvider(android.view.ActionProvider actionProvider) {
        throw new java.lang.UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setActionView(android.view.View view) {
        int i2;
        this.f3005z = view;
        if (view != null && view.getId() == -1 && (i2 = this.f2981a) > 0) {
            view.setId(i2);
        }
        g.j jVar = this.f2994n;
        jVar.f2970k = true;
        jVar.o(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setAlphabeticShortcut(char c2) {
        if (this.f2990j == c2) {
            return this;
        }
        this.f2990j = java.lang.Character.toLowerCase(c2);
        this.f2994n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setCheckable(boolean z2) {
        int i2 = this.f3003x;
        int i3 = (z2 ? 1 : 0) | (i2 & (-2));
        this.f3003x = i3;
        if (i2 != i3) {
            this.f2994n.o(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setChecked(boolean z2) {
        int i2 = this.f3003x;
        if ((i2 & 4) != 0) {
            g.j jVar = this.f2994n;
            jVar.getClass();
            java.util.ArrayList arrayList = jVar.f2965f;
            int size = arrayList.size();
            jVar.s();
            for (int i3 = 0; i3 < size; i3++) {
                g.k kVar = (g.k) arrayList.get(i3);
                if (kVar.f2982b == this.f2982b && (kVar.f3003x & 4) != 0 && kVar.isCheckable()) {
                    boolean z3 = kVar == this;
                    int i4 = kVar.f3003x;
                    int i5 = (z3 ? 2 : 0) | (i4 & (-3));
                    kVar.f3003x = i5;
                    if (i4 != i5) {
                        kVar.f2994n.o(false);
                    }
                }
            }
            jVar.r();
        } else {
            int i6 = (i2 & (-3)) | (z2 ? 2 : 0);
            this.f3003x = i6;
            if (i2 != i6) {
                this.f2994n.o(false);
            }
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ android.view.MenuItem setContentDescription(java.lang.CharSequence charSequence) {
        e(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setEnabled(boolean z2) {
        if (z2) {
            this.f3003x |= 16;
        } else {
            this.f3003x &= -17;
        }
        this.f2994n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setIcon(android.graphics.drawable.Drawable drawable) {
        this.f2993m = 0;
        this.f2992l = drawable;
        this.f3002w = true;
        this.f2994n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setIconTintList(android.content.res.ColorStateList colorStateList) {
        this.f2999s = colorStateList;
        this.f3000u = true;
        this.f3002w = true;
        this.f2994n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setIconTintMode(android.graphics.PorterDuff.Mode mode) {
        this.t = mode;
        this.f3001v = true;
        this.f3002w = true;
        this.f2994n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setIntent(android.content.Intent intent) {
        this.f2987g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setNumericShortcut(char c2) {
        if (this.f2988h == c2) {
            return this;
        }
        this.f2988h = c2;
        this.f2994n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setOnActionExpandListener(android.view.MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f2979A = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setOnMenuItemClickListener(android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f2996p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setShortcut(char c2, char c3) {
        this.f2988h = c2;
        this.f2990j = java.lang.Character.toLowerCase(c3);
        this.f2994n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i2) {
        int i3 = i2 & 3;
        if (i3 != 0 && i3 != 1 && i3 != 2) {
            throw new java.lang.IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f3004y = i2;
        g.j jVar = this.f2994n;
        jVar.f2970k = true;
        jVar.o(true);
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setShowAsActionFlags(int i2) {
        setShowAsAction(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setTitle(java.lang.CharSequence charSequence) {
        this.f2985e = charSequence;
        this.f2994n.o(false);
        g.t tVar = this.f2995o;
        if (tVar != null) {
            tVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setTitleCondensed(java.lang.CharSequence charSequence) {
        this.f2986f = charSequence;
        this.f2994n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ android.view.MenuItem setTooltipText(java.lang.CharSequence charSequence) {
        g(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setVisible(boolean z2) {
        int i2 = this.f3003x;
        int i3 = (z2 ? 0 : 8) | (i2 & (-9));
        this.f3003x = i3;
        if (i2 != i3) {
            g.j jVar = this.f2994n;
            jVar.f2967h = true;
            jVar.o(true);
        }
        return this;
    }

    public final java.lang.String toString() {
        java.lang.CharSequence charSequence = this.f2985e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setAlphabeticShortcut(char c2, int i2) {
        if (this.f2990j == c2 && this.f2991k == i2) {
            return this;
        }
        this.f2990j = java.lang.Character.toLowerCase(c2);
        this.f2991k = android.view.KeyEvent.normalizeMetaState(i2);
        this.f2994n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setNumericShortcut(char c2, int i2) {
        if (this.f2988h == c2 && this.f2989i == i2) {
            return this;
        }
        this.f2988h = c2;
        this.f2989i = android.view.KeyEvent.normalizeMetaState(i2);
        this.f2994n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setShortcut(char c2, char c3, int i2, int i3) {
        this.f2988h = c2;
        this.f2989i = android.view.KeyEvent.normalizeMetaState(i2);
        this.f2990j = java.lang.Character.toLowerCase(c3);
        this.f2991k = android.view.KeyEvent.normalizeMetaState(i3);
        this.f2994n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setIcon(int i2) {
        this.f2992l = null;
        this.f2993m = i2;
        this.f3002w = true;
        this.f2994n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setTitle(int i2) {
        setTitle(this.f2994n.f2960a.getString(i2));
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setActionView(int i2) {
        int i3;
        android.content.Context context = this.f2994n.f2960a;
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(i2, (android.view.ViewGroup) new android.widget.LinearLayout(context), false);
        this.f3005z = inflate;
        if (inflate != null && inflate.getId() == -1 && (i3 = this.f2981a) > 0) {
            inflate.setId(i3);
        }
        g.j jVar = this.f2994n;
        jVar.f2970k = true;
        jVar.o(true);
        return this;
    }
}
