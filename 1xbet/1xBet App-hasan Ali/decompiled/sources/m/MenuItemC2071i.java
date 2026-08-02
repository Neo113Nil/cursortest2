package m;

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
import java.util.ArrayList;
import r0.AbstractC2346c;

/* renamed from: m.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class MenuItemC2071i implements MenuItem {

    /* renamed from: A, reason: collision with root package name */
    public MenuItem.OnActionExpandListener f17924A;

    /* renamed from: a, reason: collision with root package name */
    public final int f17926a;

    /* renamed from: b, reason: collision with root package name */
    public final int f17927b;

    /* renamed from: c, reason: collision with root package name */
    public final int f17928c;

    /* renamed from: d, reason: collision with root package name */
    public final int f17929d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f17930e;
    public CharSequence f;

    /* renamed from: g, reason: collision with root package name */
    public Intent f17931g;

    /* renamed from: h, reason: collision with root package name */
    public char f17932h;

    /* renamed from: j, reason: collision with root package name */
    public char f17933j;

    /* renamed from: l, reason: collision with root package name */
    public Drawable f17935l;

    /* renamed from: n, reason: collision with root package name */
    public final MenuC2070h f17937n;

    /* renamed from: o, reason: collision with root package name */
    public SubMenuC2080r f17938o;

    /* renamed from: p, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f17939p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f17940q;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f17941r;

    /* renamed from: z, reason: collision with root package name */
    public View f17949z;
    public int i = 4096;

    /* renamed from: k, reason: collision with root package name */
    public int f17934k = 4096;

    /* renamed from: m, reason: collision with root package name */
    public int f17936m = 0;

    /* renamed from: s, reason: collision with root package name */
    public ColorStateList f17942s = null;

    /* renamed from: t, reason: collision with root package name */
    public PorterDuff.Mode f17943t = null;

    /* renamed from: u, reason: collision with root package name */
    public boolean f17944u = false;

    /* renamed from: v, reason: collision with root package name */
    public boolean f17945v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f17946w = false;

    /* renamed from: x, reason: collision with root package name */
    public int f17947x = 16;

    /* renamed from: B, reason: collision with root package name */
    public boolean f17925B = false;

    /* renamed from: y, reason: collision with root package name */
    public int f17948y = 0;

    public MenuItemC2071i(MenuC2070h menuC2070h, int i, int i5, int i6, int i7, CharSequence charSequence) {
        this.f17937n = menuC2070h;
        this.f17926a = i5;
        this.f17927b = i;
        this.f17928c = i6;
        this.f17929d = i7;
        this.f17930e = charSequence;
    }

    public static void a(StringBuilder sb, int i, int i5, String str) {
        if ((i & i5) == i5) {
            sb.append(str);
        }
    }

    public final Drawable b(Drawable drawable) {
        if (drawable != null && this.f17946w && (this.f17944u || this.f17945v)) {
            drawable = drawable.mutate();
            if (this.f17944u) {
                drawable.setTintList(this.f17942s);
            }
            if (this.f17945v) {
                drawable.setTintMode(this.f17943t);
            }
            this.f17946w = false;
        }
        return drawable;
    }

    public final MenuItemC2071i c(CharSequence charSequence) {
        this.f17940q = charSequence;
        this.f17937n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f17948y & 8) == 0) {
            return false;
        }
        if (this.f17949z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f17924A;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f17937n.d(this);
        }
        return false;
    }

    public final void d(boolean z3) {
        if (z3) {
            this.f17947x |= 32;
        } else {
            this.f17947x &= -33;
        }
    }

    public final MenuItemC2071i e(CharSequence charSequence) {
        this.f17941r = charSequence;
        this.f17937n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        MenuItem.OnActionExpandListener onActionExpandListener;
        if ((((this.f17948y & 8) == 0 || this.f17949z == null) ? false : true) && ((onActionExpandListener = this.f17924A) == null || onActionExpandListener.onMenuItemActionExpand(this))) {
            return this.f17937n.f(this);
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f17949z;
        if (view != null) {
            return view;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f17934k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f17933j;
    }

    @Override // android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f17940q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f17927b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f17935l;
        if (drawable != null) {
            return b(drawable);
        }
        int i = this.f17936m;
        if (i == 0) {
            return null;
        }
        Drawable p5 = AbstractC2346c.p(this.f17937n.f17905a, i);
        this.f17936m = 0;
        this.f17935l = p5;
        return b(p5);
    }

    @Override // android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f17942s;
    }

    @Override // android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f17943t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f17931g;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f17926a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // android.view.MenuItem
    public final int getNumericModifiers() {
        return this.i;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f17932h;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f17928c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f17938o;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f17930e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f;
        return charSequence != null ? charSequence : this.f17930e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f17941r;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f17938o != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f17925B;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f17947x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f17947x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f17947x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.f17947x & 8) == 0;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i;
        this.f17949z = view;
        if (view != null && view.getId() == -1 && (i = this.f17926a) > 0) {
            view.setId(i);
        }
        MenuC2070h menuC2070h = this.f17937n;
        menuC2070h.f17913k = true;
        menuC2070h.o(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c5) {
        if (this.f17933j == c5) {
            return this;
        }
        this.f17933j = Character.toLowerCase(c5);
        this.f17937n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z3) {
        int i = this.f17947x;
        int i5 = (z3 ? 1 : 0) | (i & (-2));
        this.f17947x = i5;
        if (i != i5) {
            this.f17937n.o(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z3) {
        int i = this.f17947x;
        if ((i & 4) == 0) {
            int i5 = (i & (-3)) | (z3 ? 2 : 0);
            this.f17947x = i5;
            if (i != i5) {
                this.f17937n.o(false);
            }
            return this;
        }
        MenuC2070h menuC2070h = this.f17937n;
        menuC2070h.getClass();
        ArrayList arrayList = menuC2070h.f;
        int size = arrayList.size();
        menuC2070h.s();
        for (int i6 = 0; i6 < size; i6++) {
            MenuItemC2071i menuItemC2071i = (MenuItemC2071i) arrayList.get(i6);
            if (menuItemC2071i.f17927b == this.f17927b && (menuItemC2071i.f17947x & 4) != 0 && menuItemC2071i.isCheckable()) {
                boolean z5 = menuItemC2071i == this;
                int i7 = menuItemC2071i.f17947x;
                int i8 = (z5 ? 2 : 0) | (i7 & (-3));
                menuItemC2071i.f17947x = i8;
                if (i7 != i8) {
                    menuItemC2071i.f17937n.o(false);
                }
            }
        }
        menuC2070h.r();
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
            this.f17947x |= 16;
        } else {
            this.f17947x &= -17;
        }
        this.f17937n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f17936m = 0;
        this.f17935l = drawable;
        this.f17946w = true;
        this.f17937n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f17942s = colorStateList;
        this.f17944u = true;
        this.f17946w = true;
        this.f17937n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f17943t = mode;
        this.f17945v = true;
        this.f17946w = true;
        this.f17937n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f17931g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c5) {
        if (this.f17932h == c5) {
            return this;
        }
        this.f17932h = c5;
        this.f17937n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f17924A = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f17939p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c5, char c6) {
        this.f17932h = c5;
        this.f17933j = Character.toLowerCase(c6);
        this.f17937n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
        int i5 = i & 3;
        if (i5 != 0 && i5 != 1 && i5 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f17948y = i;
        MenuC2070h menuC2070h = this.f17937n;
        menuC2070h.f17913k = true;
        menuC2070h.o(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f17930e = charSequence;
        this.f17937n.o(false);
        SubMenuC2080r subMenuC2080r = this.f17938o;
        if (subMenuC2080r != null) {
            subMenuC2080r.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f = charSequence;
        this.f17937n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        e(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z3) {
        int i = this.f17947x;
        int i5 = (z3 ? 0 : 8) | (i & (-9));
        this.f17947x = i5;
        if (i != i5) {
            MenuC2070h menuC2070h = this.f17937n;
            menuC2070h.f17911h = true;
            menuC2070h.o(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f17930e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c5, int i) {
        if (this.f17933j == c5 && this.f17934k == i) {
            return this;
        }
        this.f17933j = Character.toLowerCase(c5);
        this.f17934k = KeyEvent.normalizeMetaState(i);
        this.f17937n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c5, int i) {
        if (this.f17932h == c5 && this.i == i) {
            return this;
        }
        this.f17932h = c5;
        this.i = KeyEvent.normalizeMetaState(i);
        this.f17937n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c5, char c6, int i, int i5) {
        this.f17932h = c5;
        this.i = KeyEvent.normalizeMetaState(i);
        this.f17933j = Character.toLowerCase(c6);
        this.f17934k = KeyEvent.normalizeMetaState(i5);
        this.f17937n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.f17935l = null;
        this.f17936m = i;
        this.f17946w = true;
        this.f17937n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        setTitle(this.f17937n.f17905a.getString(i));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        int i5;
        Context context = this.f17937n.f17905a;
        View inflate = LayoutInflater.from(context).inflate(i, (ViewGroup) new LinearLayout(context), false);
        this.f17949z = inflate;
        if (inflate != null && inflate.getId() == -1 && (i5 = this.f17926a) > 0) {
            inflate.setId(i5);
        }
        MenuC2070h menuC2070h = this.f17937n;
        menuC2070h.f17913k = true;
        menuC2070h.o(true);
        return this;
    }
}
