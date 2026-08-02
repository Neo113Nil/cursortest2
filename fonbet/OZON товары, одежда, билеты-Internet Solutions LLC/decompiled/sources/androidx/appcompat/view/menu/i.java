package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.n;
import androidx.core.view.AbstractC5307b;
import j.C7232a;
import ru.ozon.app.android.R;
import s2.InterfaceMenuItemC9585b;

/* loaded from: classes8.dex */
public final class i implements InterfaceMenuItemC9585b {

    /* renamed from: A, reason: collision with root package name */
    private AbstractC5307b f37438A;

    /* renamed from: B, reason: collision with root package name */
    private MenuItem.OnActionExpandListener f37439B;

    /* renamed from: a, reason: collision with root package name */
    private final int f37441a;

    /* renamed from: b, reason: collision with root package name */
    private final int f37442b;

    /* renamed from: c, reason: collision with root package name */
    private final int f37443c;

    /* renamed from: d, reason: collision with root package name */
    private final int f37444d;

    /* renamed from: e, reason: collision with root package name */
    private CharSequence f37445e;

    /* renamed from: f, reason: collision with root package name */
    private CharSequence f37446f;

    /* renamed from: g, reason: collision with root package name */
    private Intent f37447g;

    /* renamed from: h, reason: collision with root package name */
    private char f37448h;

    /* renamed from: j, reason: collision with root package name */
    private char f37450j;

    /* renamed from: l, reason: collision with root package name */
    private Drawable f37452l;

    /* renamed from: n, reason: collision with root package name */
    g f37454n;

    /* renamed from: o, reason: collision with root package name */
    private q f37455o;

    /* renamed from: p, reason: collision with root package name */
    private MenuItem.OnMenuItemClickListener f37456p;

    /* renamed from: q, reason: collision with root package name */
    private CharSequence f37457q;

    /* renamed from: r, reason: collision with root package name */
    private CharSequence f37458r;

    /* renamed from: y, reason: collision with root package name */
    private int f37465y;

    /* renamed from: z, reason: collision with root package name */
    private View f37466z;

    /* renamed from: i, reason: collision with root package name */
    private int f37449i = 4096;

    /* renamed from: k, reason: collision with root package name */
    private int f37451k = 4096;

    /* renamed from: m, reason: collision with root package name */
    private int f37453m = 0;

    /* renamed from: s, reason: collision with root package name */
    private ColorStateList f37459s = null;

    /* renamed from: t, reason: collision with root package name */
    private PorterDuff.Mode f37460t = null;

    /* renamed from: u, reason: collision with root package name */
    private boolean f37461u = false;

    /* renamed from: v, reason: collision with root package name */
    private boolean f37462v = false;

    /* renamed from: w, reason: collision with root package name */
    private boolean f37463w = false;

    /* renamed from: x, reason: collision with root package name */
    private int f37464x = 16;

    /* renamed from: C, reason: collision with root package name */
    private boolean f37440C = false;

    final class a implements AbstractC5307b.a {
        a() {
        }
    }

    i(g gVar, int i11, int i12, int i13, int i14, CharSequence charSequence, int i15) {
        this.f37454n = gVar;
        this.f37441a = i12;
        this.f37442b = i11;
        this.f37443c = i13;
        this.f37444d = i14;
        this.f37445e = charSequence;
        this.f37465y = i15;
    }

    private static void c(int i11, int i12, String str, StringBuilder sb2) {
        if ((i11 & i12) == i12) {
            sb2.append(str);
        }
    }

    private Drawable d(Drawable drawable) {
        if (drawable != null && this.f37463w && (this.f37461u || this.f37462v)) {
            drawable = drawable.mutate();
            if (this.f37461u) {
                androidx.core.graphics.drawable.a.j(drawable, this.f37459s);
            }
            if (this.f37462v) {
                androidx.core.graphics.drawable.a.k(drawable, this.f37460t);
            }
            this.f37463w = false;
        }
        return drawable;
    }

    @Override // s2.InterfaceMenuItemC9585b
    public final AbstractC5307b a() {
        return this.f37438A;
    }

    @Override // s2.InterfaceMenuItemC9585b
    @NonNull
    public final InterfaceMenuItemC9585b b(AbstractC5307b abstractC5307b) {
        AbstractC5307b abstractC5307b2 = this.f37438A;
        if (abstractC5307b2 != null) {
            abstractC5307b2.h();
        }
        this.f37466z = null;
        this.f37438A = abstractC5307b;
        this.f37454n.y(true);
        AbstractC5307b abstractC5307b3 = this.f37438A;
        if (abstractC5307b3 != null) {
            abstractC5307b3.i(new a());
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f37465y & 8) == 0) {
            return false;
        }
        if (this.f37466z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f37439B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f37454n.f(this);
        }
        return false;
    }

    public final int e() {
        return this.f37444d;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!i()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f37439B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f37454n.h(this);
        }
        return false;
    }

    final char f() {
        return this.f37454n.u() ? this.f37450j : this.f37448h;
    }

    final String g() {
        char f7 = f();
        if (f7 == 0) {
            return "";
        }
        g gVar = this.f37454n;
        Resources resources = gVar.n().getResources();
        StringBuilder sb2 = new StringBuilder();
        if (ViewConfiguration.get(gVar.n()).hasPermanentMenuKey()) {
            sb2.append(resources.getString(R.string.abc_prepend_shortcut_label));
        }
        int i11 = gVar.u() ? this.f37451k : this.f37449i;
        c(i11, 65536, resources.getString(R.string.abc_menu_meta_shortcut_label), sb2);
        c(i11, 4096, resources.getString(R.string.abc_menu_ctrl_shortcut_label), sb2);
        c(i11, 2, resources.getString(R.string.abc_menu_alt_shortcut_label), sb2);
        c(i11, 1, resources.getString(R.string.abc_menu_shift_shortcut_label), sb2);
        c(i11, 4, resources.getString(R.string.abc_menu_sym_shortcut_label), sb2);
        c(i11, 8, resources.getString(R.string.abc_menu_function_shortcut_label), sb2);
        if (f7 == '\b') {
            sb2.append(resources.getString(R.string.abc_menu_delete_shortcut_label));
        } else if (f7 == '\n') {
            sb2.append(resources.getString(R.string.abc_menu_enter_shortcut_label));
        } else if (f7 != ' ') {
            sb2.append(f7);
        } else {
            sb2.append(resources.getString(R.string.abc_menu_space_shortcut_label));
        }
        return sb2.toString();
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f37466z;
        if (view != null) {
            return view;
        }
        AbstractC5307b abstractC5307b = this.f37438A;
        if (abstractC5307b == null) {
            return null;
        }
        View d11 = abstractC5307b.d(this);
        this.f37466z = d11;
        return d11;
    }

    @Override // s2.InterfaceMenuItemC9585b, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f37451k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f37450j;
    }

    @Override // s2.InterfaceMenuItemC9585b, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f37457q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f37442b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f37452l;
        if (drawable != null) {
            return d(drawable);
        }
        if (this.f37453m == 0) {
            return null;
        }
        Drawable a11 = C7232a.a(this.f37454n.n(), this.f37453m);
        this.f37453m = 0;
        this.f37452l = a11;
        return d(a11);
    }

    @Override // s2.InterfaceMenuItemC9585b, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f37459s;
    }

    @Override // s2.InterfaceMenuItemC9585b, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f37460t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f37447g;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public final int getItemId() {
        return this.f37441a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // s2.InterfaceMenuItemC9585b, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f37449i;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f37448h;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f37443c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f37455o;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public final CharSequence getTitle() {
        return this.f37445e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f37446f;
        return charSequence != null ? charSequence : this.f37445e;
    }

    @Override // s2.InterfaceMenuItemC9585b, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f37458r;
    }

    final CharSequence h(n.a aVar) {
        return aVar.c() ? getTitleCondensed() : this.f37445e;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f37455o != null;
    }

    public final boolean i() {
        AbstractC5307b abstractC5307b;
        if ((this.f37465y & 8) == 0) {
            return false;
        }
        if (this.f37466z == null && (abstractC5307b = this.f37438A) != null) {
            this.f37466z = abstractC5307b.d(this);
        }
        return this.f37466z != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f37440C;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f37464x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f37464x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f37464x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        AbstractC5307b abstractC5307b = this.f37438A;
        return (abstractC5307b == null || !abstractC5307b.g()) ? (this.f37464x & 8) == 0 : (this.f37464x & 8) == 0 && this.f37438A.b();
    }

    public final boolean j() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f37456p;
        if (onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(this)) {
            g gVar = this.f37454n;
            if (!gVar.g(gVar, this)) {
                if (this.f37447g != null) {
                    try {
                        gVar.n().startActivity(this.f37447g);
                        return true;
                    } catch (ActivityNotFoundException e11) {
                        Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e11);
                    }
                }
                AbstractC5307b abstractC5307b = this.f37438A;
                if (abstractC5307b == null || !abstractC5307b.e()) {
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean k() {
        return (this.f37464x & 32) == 32;
    }

    public final boolean l() {
        return (this.f37464x & 4) != 0;
    }

    public final boolean m() {
        return (this.f37465y & 1) == 1;
    }

    public final boolean n() {
        return (this.f37465y & 2) == 2;
    }

    public final void o(boolean z11) {
        this.f37440C = z11;
        this.f37454n.y(false);
    }

    final void p(boolean z11) {
        int i11 = this.f37464x;
        int i12 = (z11 ? 2 : 0) | (i11 & (-3));
        this.f37464x = i12;
        if (i11 != i12) {
            this.f37454n.y(false);
        }
    }

    public final void q(boolean z11) {
        this.f37464x = (z11 ? 4 : 0) | (this.f37464x & (-5));
    }

    public final void r(boolean z11) {
        if (z11) {
            this.f37464x |= 32;
        } else {
            this.f37464x &= -33;
        }
    }

    public final void s(q qVar) {
        this.f37455o = qVar;
        qVar.M(this.f37445e);
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    @NonNull
    public final MenuItem setActionView(View view) {
        int i11;
        this.f37466z = view;
        this.f37438A = null;
        if (view != null && view.getId() == -1 && (i11 = this.f37441a) > 0) {
            view.setId(i11);
        }
        this.f37454n.w();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c11) {
        if (this.f37450j == c11) {
            return this;
        }
        this.f37450j = Character.toLowerCase(c11);
        this.f37454n.y(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z11) {
        int i11 = this.f37464x;
        int i12 = (z11 ? 1 : 0) | (i11 & (-2));
        this.f37464x = i12;
        if (i11 != i12) {
            this.f37454n.y(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z11) {
        if ((this.f37464x & 4) != 0) {
            this.f37454n.H(this);
            return this;
        }
        p(z11);
        return this;
    }

    @Override // android.view.MenuItem
    @NonNull
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z11) {
        if (z11) {
            this.f37464x |= 16;
        } else {
            this.f37464x &= -17;
        }
        this.f37454n.y(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f37453m = 0;
        this.f37452l = drawable;
        this.f37463w = true;
        this.f37454n.y(false);
        return this;
    }

    @Override // s2.InterfaceMenuItemC9585b, android.view.MenuItem
    @NonNull
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f37459s = colorStateList;
        this.f37461u = true;
        this.f37463w = true;
        this.f37454n.y(false);
        return this;
    }

    @Override // s2.InterfaceMenuItemC9585b, android.view.MenuItem
    @NonNull
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f37460t = mode;
        this.f37462v = true;
        this.f37463w = true;
        this.f37454n.y(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f37447g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c11) {
        if (this.f37448h == c11) {
            return this;
        }
        this.f37448h = c11;
        this.f37454n.y(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f37439B = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f37456p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c11, char c12) {
        this.f37448h = c11;
        this.f37450j = Character.toLowerCase(c12);
        this.f37454n.y(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i11) {
        int i12 = i11 & 3;
        if (i12 != 0 && i12 != 1 && i12 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f37465y = i11;
        this.f37454n.w();
    }

    @Override // android.view.MenuItem
    @NonNull
    public final MenuItem setShowAsActionFlags(int i11) {
        setShowAsAction(i11);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f37445e = charSequence;
        this.f37454n.y(false);
        q qVar = this.f37455o;
        if (qVar != null) {
            qVar.M(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f37446f = charSequence;
        this.f37454n.y(false);
        return this;
    }

    @Override // android.view.MenuItem
    @NonNull
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z11) {
        if (t(z11)) {
            this.f37454n.x();
        }
        return this;
    }

    final boolean t(boolean z11) {
        int i11 = this.f37464x;
        int i12 = (z11 ? 0 : 8) | (i11 & (-9));
        this.f37464x = i12;
        return i11 != i12;
    }

    public final String toString() {
        CharSequence charSequence = this.f37445e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public final boolean u() {
        return (this.f37465y & 4) == 4;
    }

    @Override // s2.InterfaceMenuItemC9585b, android.view.MenuItem
    @NonNull
    public final InterfaceMenuItemC9585b setContentDescription(CharSequence charSequence) {
        this.f37457q = charSequence;
        this.f37454n.y(false);
        return this;
    }

    @Override // s2.InterfaceMenuItemC9585b, android.view.MenuItem
    @NonNull
    public final InterfaceMenuItemC9585b setTooltipText(CharSequence charSequence) {
        this.f37458r = charSequence;
        this.f37454n.y(false);
        return this;
    }

    @Override // s2.InterfaceMenuItemC9585b, android.view.MenuItem
    @NonNull
    public final MenuItem setAlphabeticShortcut(char c11, int i11) {
        if (this.f37450j == c11 && this.f37451k == i11) {
            return this;
        }
        this.f37450j = Character.toLowerCase(c11);
        this.f37451k = KeyEvent.normalizeMetaState(i11);
        this.f37454n.y(false);
        return this;
    }

    @Override // s2.InterfaceMenuItemC9585b, android.view.MenuItem
    @NonNull
    public final MenuItem setNumericShortcut(char c11, int i11) {
        if (this.f37448h == c11 && this.f37449i == i11) {
            return this;
        }
        this.f37448h = c11;
        this.f37449i = KeyEvent.normalizeMetaState(i11);
        this.f37454n.y(false);
        return this;
    }

    @Override // s2.InterfaceMenuItemC9585b, android.view.MenuItem
    @NonNull
    public final MenuItem setShortcut(char c11, char c12, int i11, int i12) {
        this.f37448h = c11;
        this.f37449i = KeyEvent.normalizeMetaState(i11);
        this.f37450j = Character.toLowerCase(c12);
        this.f37451k = KeyEvent.normalizeMetaState(i12);
        this.f37454n.y(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i11) {
        this.f37452l = null;
        this.f37453m = i11;
        this.f37463w = true;
        this.f37454n.y(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i11) {
        setTitle(this.f37454n.n().getString(i11));
        return this;
    }

    @Override // android.view.MenuItem
    @NonNull
    public final MenuItem setActionView(int i11) {
        int i12;
        Context n11 = this.f37454n.n();
        View inflate = LayoutInflater.from(n11).inflate(i11, (ViewGroup) new LinearLayout(n11), false);
        this.f37466z = inflate;
        this.f37438A = null;
        if (inflate != null && inflate.getId() == -1 && (i12 = this.f37441a) > 0) {
            inflate.setId(i12);
        }
        this.f37454n.w();
        return this;
    }
}
