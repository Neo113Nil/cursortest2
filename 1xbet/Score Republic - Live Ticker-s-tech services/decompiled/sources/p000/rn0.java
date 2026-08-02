package p000;

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

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class rn0 implements wb1 {

    /* JADX INFO: renamed from: A */
    public CharSequence f6891A;

    /* JADX INFO: renamed from: H */
    public int f6898H;

    /* JADX INFO: renamed from: I */
    public View f6899I;

    /* JADX INFO: renamed from: J */
    public sn0 f6900J;

    /* JADX INFO: renamed from: K */
    public MenuItem.OnActionExpandListener f6901K;

    /* JADX INFO: renamed from: j */
    public final int f6903j;

    /* JADX INFO: renamed from: k */
    public final int f6904k;

    /* JADX INFO: renamed from: l */
    public final int f6905l;

    /* JADX INFO: renamed from: m */
    public final int f6906m;

    /* JADX INFO: renamed from: n */
    public CharSequence f6907n;

    /* JADX INFO: renamed from: o */
    public CharSequence f6908o;

    /* JADX INFO: renamed from: p */
    public Intent f6909p;

    /* JADX INFO: renamed from: q */
    public char f6910q;

    /* JADX INFO: renamed from: s */
    public char f6912s;

    /* JADX INFO: renamed from: u */
    public Drawable f6914u;

    /* JADX INFO: renamed from: w */
    public final on0 f6916w;

    /* JADX INFO: renamed from: x */
    public gb1 f6917x;

    /* JADX INFO: renamed from: y */
    public MenuItem.OnMenuItemClickListener f6918y;

    /* JADX INFO: renamed from: z */
    public CharSequence f6919z;

    /* JADX INFO: renamed from: r */
    public int f6911r = 4096;

    /* JADX INFO: renamed from: t */
    public int f6913t = 4096;

    /* JADX INFO: renamed from: v */
    public int f6915v = 0;

    /* JADX INFO: renamed from: B */
    public ColorStateList f6892B = null;

    /* JADX INFO: renamed from: C */
    public PorterDuff.Mode f6893C = null;

    /* JADX INFO: renamed from: D */
    public boolean f6894D = false;

    /* JADX INFO: renamed from: E */
    public boolean f6895E = false;

    /* JADX INFO: renamed from: F */
    public boolean f6896F = false;

    /* JADX INFO: renamed from: G */
    public int f6897G = 16;

    /* JADX INFO: renamed from: L */
    public boolean f6902L = false;

    public rn0(on0 on0Var, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.f6916w = on0Var;
        this.f6903j = i2;
        this.f6904k = i;
        this.f6905l = i3;
        this.f6906m = i4;
        this.f6907n = charSequence;
        this.f6898H = i5;
    }

    /* JADX INFO: renamed from: c */
    public static void m4384c(int i, int i2, String str, StringBuilder sb) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    @Override // p000.wb1
    /* JADX INFO: renamed from: a */
    public final wb1 mo2779a(sn0 sn0Var) {
        this.f6899I = null;
        this.f6900J = sn0Var;
        this.f6916w.m3712p(true);
        sn0 sn0Var2 = this.f6900J;
        if (sn0Var2 != null) {
            sn0Var2.f7154a = new jg0(4, this);
            sn0Var2.f7155b.setVisibilityListener(sn0Var2);
        }
        return this;
    }

    @Override // p000.wb1
    /* JADX INFO: renamed from: b */
    public final sn0 mo2780b() {
        return this.f6900J;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f6898H & 8) == 0) {
            return false;
        }
        if (this.f6899I == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f6901K;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f6916w.mo2016d(this);
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final Drawable m4385d(Drawable drawable) {
        if (drawable != null && this.f6896F && (this.f6894D || this.f6895E)) {
            drawable = drawable.mutate();
            if (this.f6894D) {
                drawable.setTintList(this.f6892B);
            }
            if (this.f6895E) {
                drawable.setTintMode(this.f6893C);
            }
            this.f6896F = false;
        }
        return drawable;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m4386e() {
        sn0 sn0Var;
        if ((this.f6898H & 8) != 0) {
            if (this.f6899I == null && (sn0Var = this.f6900J) != null) {
                this.f6899I = sn0Var.f7155b.onCreateActionView(this);
            }
            if (this.f6899I != null) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!m4386e()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f6901K;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f6916w.mo2018f(this);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final void m4387f(boolean z) {
        int i = this.f6897G;
        if (z) {
            this.f6897G = i | 32;
        } else {
            this.f6897G = i & (-33);
        }
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f6899I;
        if (view != null) {
            return view;
        }
        sn0 sn0Var = this.f6900J;
        if (sn0Var == null) {
            return null;
        }
        View viewOnCreateActionView = sn0Var.f7155b.onCreateActionView(this);
        this.f6899I = viewOnCreateActionView;
        return viewOnCreateActionView;
    }

    @Override // p000.wb1, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f6913t;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f6912s;
    }

    @Override // p000.wb1, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f6919z;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f6904k;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f6914u;
        if (drawable != null) {
            return m4385d(drawable);
        }
        int i = this.f6915v;
        if (i == 0) {
            return null;
        }
        Drawable drawableM2807p = j22.m2807p(this.f6916w.f5799j, i);
        this.f6915v = 0;
        this.f6914u = drawableM2807p;
        return m4385d(drawableM2807p);
    }

    @Override // p000.wb1, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f6892B;
    }

    @Override // p000.wb1, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f6893C;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f6909p;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f6903j;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // p000.wb1, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f6911r;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f6910q;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f6905l;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f6917x;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f6907n;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f6908o;
        return charSequence != null ? charSequence : this.f6907n;
    }

    @Override // p000.wb1, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f6891A;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f6917x != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f6902L;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f6897G & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f6897G & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f6897G & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        sn0 sn0Var = this.f6900J;
        if (sn0Var == null || !sn0Var.f7155b.overridesItemVisibility()) {
            return (this.f6897G & 8) == 0;
        }
        return (this.f6897G & 8) == 0 && this.f6900J.f7155b.isVisible();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        int i2;
        on0 on0Var = this.f6916w;
        Context context = on0Var.f5799j;
        View viewInflate = LayoutInflater.from(context).inflate(i, (ViewGroup) new LinearLayout(context), false);
        this.f6899I = viewInflate;
        this.f6900J = null;
        if (viewInflate != null && viewInflate.getId() == -1 && (i2 = this.f6903j) > 0) {
            viewInflate.setId(i2);
        }
        on0Var.f5809t = true;
        on0Var.m3712p(true);
        return this;
    }

    @Override // p000.wb1, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.f6912s == c && this.f6913t == i) {
            return this;
        }
        this.f6912s = Character.toLowerCase(c);
        this.f6913t = KeyEvent.normalizeMetaState(i);
        this.f6916w.m3712p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        int i = this.f6897G;
        int i2 = (z ? 1 : 0) | (i & (-2));
        this.f6897G = i2;
        if (i != i2) {
            this.f6916w.m3712p(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        int i = this.f6897G;
        int i2 = i & 4;
        on0 on0Var = this.f6916w;
        if (i2 == 0) {
            int i3 = (i & (-3)) | (z ? 2 : 0);
            this.f6897G = i3;
            if (i != i3) {
                on0Var.m3712p(false);
            }
            return this;
        }
        ArrayList arrayList = on0Var.f5804o;
        int size = arrayList.size();
        on0Var.m3719w();
        for (int i4 = 0; i4 < size; i4++) {
            rn0 rn0Var = (rn0) arrayList.get(i4);
            if (rn0Var.f6904k == this.f6904k && (rn0Var.f6897G & 4) != 0 && rn0Var.isCheckable()) {
                boolean z2 = rn0Var == this;
                int i5 = rn0Var.f6897G;
                int i6 = (z2 ? 2 : 0) | (i5 & (-3));
                rn0Var.f6897G = i6;
                if (i5 != i6) {
                    rn0Var.f6916w.m3712p(false);
                }
            }
        }
        on0Var.m3718v();
        return this;
    }

    @Override // p000.wb1, android.view.MenuItem
    public final wb1 setContentDescription(CharSequence charSequence) {
        this.f6919z = charSequence;
        this.f6916w.m3712p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z) {
        int i = this.f6897G;
        if (z) {
            this.f6897G = i | 16;
        } else {
            this.f6897G = i & (-17);
        }
        this.f6916w.m3712p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.f6914u = null;
        this.f6915v = i;
        this.f6896F = true;
        this.f6916w.m3712p(false);
        return this;
    }

    @Override // p000.wb1, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f6892B = colorStateList;
        this.f6894D = true;
        this.f6896F = true;
        this.f6916w.m3712p(false);
        return this;
    }

    @Override // p000.wb1, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f6893C = mode;
        this.f6895E = true;
        this.f6896F = true;
        this.f6916w.m3712p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f6909p = intent;
        return this;
    }

    @Override // p000.wb1, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int i) {
        if (this.f6910q == c && this.f6911r == i) {
            return this;
        }
        this.f6910q = c;
        this.f6911r = KeyEvent.normalizeMetaState(i);
        this.f6916w.m3712p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f6901K = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f6918y = onMenuItemClickListener;
        return this;
    }

    @Override // p000.wb1, android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f6910q = c;
        this.f6911r = KeyEvent.normalizeMetaState(i);
        this.f6912s = Character.toLowerCase(c2);
        this.f6913t = KeyEvent.normalizeMetaState(i2);
        this.f6916w.m3712p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            C0270h1.m2190f("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
            return;
        }
        this.f6898H = i;
        on0 on0Var = this.f6916w;
        on0Var.f5809t = true;
        on0Var.m3712p(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f6907n = charSequence;
        this.f6916w.m3712p(false);
        gb1 gb1Var = this.f6917x;
        if (gb1Var != null) {
            gb1Var.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f6908o = charSequence;
        this.f6916w.m3712p(false);
        return this;
    }

    @Override // p000.wb1, android.view.MenuItem
    public final wb1 setTooltipText(CharSequence charSequence) {
        this.f6891A = charSequence;
        this.f6916w.m3712p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z) {
        int i = this.f6897G;
        int i2 = (z ? 0 : 8) | (i & (-9));
        this.f6897G = i2;
        if (i != i2) {
            on0 on0Var = this.f6916w;
            on0Var.f5806q = true;
            on0Var.m3712p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f6907n;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f6915v = 0;
        this.f6914u = drawable;
        this.f6896F = true;
        this.f6916w.m3712p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        setTitle(this.f6916w.f5799j.getString(i));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        if (this.f6910q == c) {
            return this;
        }
        this.f6910q = c;
        this.f6916w.m3712p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2) {
        this.f6910q = c;
        this.f6912s = Character.toLowerCase(c2);
        this.f6916w.m3712p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        if (this.f6912s == c) {
            return this;
        }
        this.f6912s = Character.toLowerCase(c);
        this.f6916w.m3712p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i;
        this.f6899I = view;
        this.f6900J = null;
        if (view != null && view.getId() == -1 && (i = this.f6903j) > 0) {
            view.setId(i);
        }
        on0 on0Var = this.f6916w;
        on0Var.f5809t = true;
        on0Var.m3712p(true);
        return this;
    }
}
