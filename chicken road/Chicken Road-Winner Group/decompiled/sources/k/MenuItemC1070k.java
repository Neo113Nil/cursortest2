package k;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import h.AbstractC0323a;
import java.util.ArrayList;
import x.AbstractC1247a;

/* renamed from: k.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class MenuItemC1070k implements MenuItem {

    /* renamed from: A, reason: collision with root package name */
    public MenuItem.OnActionExpandListener f9599A;

    /* renamed from: a, reason: collision with root package name */
    public final int f9601a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9602b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9603c;

    /* renamed from: d, reason: collision with root package name */
    public final int f9604d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f9605e;
    public CharSequence f;

    /* renamed from: g, reason: collision with root package name */
    public Intent f9606g;

    /* renamed from: h, reason: collision with root package name */
    public char f9607h;

    /* renamed from: j, reason: collision with root package name */
    public char f9609j;

    /* renamed from: l, reason: collision with root package name */
    public Drawable f9611l;

    /* renamed from: n, reason: collision with root package name */
    public final MenuC1069j f9613n;

    /* renamed from: o, reason: collision with root package name */
    public SubMenuC1079t f9614o;

    /* renamed from: p, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f9615p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f9616q;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f9617r;

    /* renamed from: z, reason: collision with root package name */
    public View f9624z;

    /* renamed from: i, reason: collision with root package name */
    public int f9608i = 4096;

    /* renamed from: k, reason: collision with root package name */
    public int f9610k = 4096;

    /* renamed from: m, reason: collision with root package name */
    public int f9612m = 0;

    /* renamed from: s, reason: collision with root package name */
    public ColorStateList f9618s = null;

    /* renamed from: t, reason: collision with root package name */
    public PorterDuff.Mode f9619t = null;

    /* renamed from: u, reason: collision with root package name */
    public boolean f9620u = false;

    /* renamed from: v, reason: collision with root package name */
    public boolean f9621v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f9622w = false;

    /* renamed from: x, reason: collision with root package name */
    public int f9623x = 16;

    /* renamed from: B, reason: collision with root package name */
    public boolean f9600B = false;
    public int y = 0;

    public MenuItemC1070k(MenuC1069j menuC1069j, int i3, int i4, int i5, int i6, CharSequence charSequence) {
        this.f9613n = menuC1069j;
        this.f9601a = i4;
        this.f9602b = i3;
        this.f9603c = i5;
        this.f9604d = i6;
        this.f9605e = charSequence;
    }

    public static void a(StringBuilder sb, int i3, int i4, String str) {
        if ((i3 & i4) == i4) {
            sb.append(str);
        }
    }

    public final Drawable b(Drawable drawable) {
        if (drawable != null && this.f9622w && (this.f9620u || this.f9621v)) {
            drawable = drawable.mutate();
            if (this.f9620u) {
                AbstractC1247a.h(drawable, this.f9618s);
            }
            if (this.f9621v) {
                AbstractC1247a.i(drawable, this.f9619t);
            }
            this.f9622w = false;
        }
        return drawable;
    }

    public final MenuItemC1070k c(CharSequence charSequence) {
        this.f9616q = charSequence;
        this.f9613n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.y & 8) == 0) {
            return false;
        }
        if (this.f9624z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f9599A;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f9613n.d(this);
        }
        return false;
    }

    public final void d(boolean z3) {
        if (z3) {
            this.f9623x |= 32;
        } else {
            this.f9623x &= -33;
        }
    }

    public final MenuItemC1070k e(CharSequence charSequence) {
        this.f9617r = charSequence;
        this.f9613n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        MenuItem.OnActionExpandListener onActionExpandListener;
        if ((((this.y & 8) == 0 || this.f9624z == null) ? false : true) && ((onActionExpandListener = this.f9599A) == null || onActionExpandListener.onMenuItemActionExpand(this))) {
            return this.f9613n.f(this);
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f9624z;
        if (view != null) {
            return view;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f9610k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f9609j;
    }

    @Override // android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f9616q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f9602b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f9611l;
        if (drawable != null) {
            return b(drawable);
        }
        int i3 = this.f9612m;
        if (i3 == 0) {
            return null;
        }
        Drawable a3 = AbstractC0323a.a(this.f9613n.f9579a, i3);
        this.f9612m = 0;
        this.f9611l = a3;
        return b(a3);
    }

    @Override // android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f9618s;
    }

    @Override // android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f9619t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f9606g;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f9601a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f9608i;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f9607h;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f9603c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f9614o;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f9605e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f;
        return charSequence != null ? charSequence : this.f9605e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f9617r;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f9614o != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f9600B;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f9623x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f9623x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f9623x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.f9623x & 8) == 0;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i3;
        this.f9624z = view;
        if (view != null && view.getId() == -1 && (i3 = this.f9601a) > 0) {
            view.setId(i3);
        }
        MenuC1069j menuC1069j = this.f9613n;
        menuC1069j.f9588k = true;
        menuC1069j.o(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c3) {
        if (this.f9609j == c3) {
            return this;
        }
        this.f9609j = Character.toLowerCase(c3);
        this.f9613n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z3) {
        int i3 = this.f9623x;
        int i4 = (z3 ? 1 : 0) | (i3 & (-2));
        this.f9623x = i4;
        if (i3 != i4) {
            this.f9613n.o(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z3) {
        int i3 = this.f9623x;
        if ((i3 & 4) == 0) {
            int i4 = (i3 & (-3)) | (z3 ? 2 : 0);
            this.f9623x = i4;
            if (i3 != i4) {
                this.f9613n.o(false);
            }
            return this;
        }
        MenuC1069j menuC1069j = this.f9613n;
        menuC1069j.getClass();
        ArrayList arrayList = menuC1069j.f;
        int size = arrayList.size();
        menuC1069j.s();
        for (int i5 = 0; i5 < size; i5++) {
            MenuItemC1070k menuItemC1070k = (MenuItemC1070k) arrayList.get(i5);
            if (menuItemC1070k.f9602b == this.f9602b && (menuItemC1070k.f9623x & 4) != 0 && menuItemC1070k.isCheckable()) {
                boolean z4 = menuItemC1070k == this;
                int i6 = menuItemC1070k.f9623x;
                int i7 = (z4 ? 2 : 0) | (i6 & (-3));
                menuItemC1070k.f9623x = i7;
                if (i6 != i7) {
                    menuItemC1070k.f9613n.o(false);
                }
            }
        }
        menuC1069j.r();
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        c(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z3) {
        if (z3) {
            this.f9623x |= 16;
        } else {
            this.f9623x &= -17;
        }
        this.f9613n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f9612m = 0;
        this.f9611l = drawable;
        this.f9622w = true;
        this.f9613n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f9618s = colorStateList;
        this.f9620u = true;
        this.f9622w = true;
        this.f9613n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f9619t = mode;
        this.f9621v = true;
        this.f9622w = true;
        this.f9613n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f9606g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c3) {
        if (this.f9607h == c3) {
            return this;
        }
        this.f9607h = c3;
        this.f9613n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f9599A = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f9615p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c3, char c4) {
        this.f9607h = c3;
        this.f9609j = Character.toLowerCase(c4);
        this.f9613n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i3) {
        int i4 = i3 & 3;
        if (i4 != 0 && i4 != 1 && i4 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.y = i3;
        MenuC1069j menuC1069j = this.f9613n;
        menuC1069j.f9588k = true;
        menuC1069j.o(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i3) {
        setShowAsAction(i3);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f9605e = charSequence;
        this.f9613n.o(false);
        SubMenuC1079t subMenuC1079t = this.f9614o;
        if (subMenuC1079t != null) {
            subMenuC1079t.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f = charSequence;
        this.f9613n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        e(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z3) {
        int i3 = this.f9623x;
        int i4 = (z3 ? 0 : 8) | (i3 & (-9));
        this.f9623x = i4;
        if (i3 != i4) {
            MenuC1069j menuC1069j = this.f9613n;
            menuC1069j.f9585h = true;
            menuC1069j.o(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f9605e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c3, int i3) {
        if (this.f9609j == c3 && this.f9610k == i3) {
            return this;
        }
        this.f9609j = Character.toLowerCase(c3);
        this.f9610k = KeyEvent.normalizeMetaState(i3);
        this.f9613n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c3, int i3) {
        if (this.f9607h == c3 && this.f9608i == i3) {
            return this;
        }
        this.f9607h = c3;
        this.f9608i = KeyEvent.normalizeMetaState(i3);
        this.f9613n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c3, char c4, int i3, int i4) {
        this.f9607h = c3;
        this.f9608i = KeyEvent.normalizeMetaState(i3);
        this.f9609j = Character.toLowerCase(c4);
        this.f9610k = KeyEvent.normalizeMetaState(i4);
        this.f9613n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i3) {
        this.f9611l = null;
        this.f9612m = i3;
        this.f9622w = true;
        this.f9613n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i3) {
        setTitle(this.f9613n.f9579a.getString(i3));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i3) {
        int i4;
        Context context = this.f9613n.f9579a;
        View inflate = LayoutInflater.from(context).inflate(i3, (ViewGroup) new LinearLayout(context), false);
        this.f9624z = inflate;
        if (inflate != null && inflate.getId() == -1 && (i4 = this.f9601a) > 0) {
            inflate.setId(i4);
        }
        MenuC1069j menuC1069j = this.f9613n;
        menuC1069j.f9588k = true;
        menuC1069j.o(true);
        return this;
    }
}
