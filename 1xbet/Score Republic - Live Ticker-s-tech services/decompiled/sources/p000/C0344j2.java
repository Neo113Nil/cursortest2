package p000;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: renamed from: j2 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0344j2 implements wb1 {

    /* JADX INFO: renamed from: j */
    public CharSequence f3775j;

    /* JADX INFO: renamed from: k */
    public CharSequence f3776k;

    /* JADX INFO: renamed from: l */
    public Intent f3777l;

    /* JADX INFO: renamed from: m */
    public char f3778m;

    /* JADX INFO: renamed from: n */
    public int f3779n;

    /* JADX INFO: renamed from: o */
    public char f3780o;

    /* JADX INFO: renamed from: p */
    public int f3781p;

    /* JADX INFO: renamed from: q */
    public Drawable f3782q;

    /* JADX INFO: renamed from: r */
    public Context f3783r;

    /* JADX INFO: renamed from: s */
    public CharSequence f3784s;

    /* JADX INFO: renamed from: t */
    public CharSequence f3785t;

    /* JADX INFO: renamed from: u */
    public ColorStateList f3786u;

    /* JADX INFO: renamed from: v */
    public PorterDuff.Mode f3787v;

    /* JADX INFO: renamed from: w */
    public boolean f3788w;

    /* JADX INFO: renamed from: x */
    public boolean f3789x;

    /* JADX INFO: renamed from: y */
    public int f3790y;

    @Override // p000.wb1
    /* JADX INFO: renamed from: a */
    public final wb1 mo2779a(sn0 sn0Var) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.wb1
    /* JADX INFO: renamed from: b */
    public final sn0 mo2780b() {
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final void m2781c() {
        Drawable drawable = this.f3782q;
        if (drawable != null) {
            if (this.f3788w || this.f3789x) {
                this.f3782q = drawable;
                Drawable drawableMutate = drawable.mutate();
                this.f3782q = drawableMutate;
                if (this.f3788w) {
                    drawableMutate.setTintList(this.f3786u);
                }
                if (this.f3789x) {
                    this.f3782q.setTintMode(this.f3787v);
                }
            }
        }
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        return null;
    }

    @Override // p000.wb1, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f3781p;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f3780o;
    }

    @Override // p000.wb1, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f3784s;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.f3782q;
    }

    @Override // p000.wb1, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f3786u;
    }

    @Override // p000.wb1, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f3787v;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f3777l;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return R.id.home;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // p000.wb1, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f3779n;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f3778m;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f3775j;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f3776k;
        return charSequence != null ? charSequence : this.f3775j;
    }

    @Override // p000.wb1, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f3785t;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f3790y & 1) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f3790y & 2) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f3790y & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.f3790y & 8) == 0;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.wb1, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int i) {
        this.f3780o = Character.toLowerCase(c);
        this.f3781p = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        this.f3790y = (z ? 1 : 0) | (this.f3790y & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        this.f3790y = (z ? 2 : 0) | (this.f3790y & (-3));
        return this;
    }

    @Override // p000.wb1, android.view.MenuItem
    public final wb1 setContentDescription(CharSequence charSequence) {
        this.f3784s = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z) {
        this.f3790y = (z ? 16 : 0) | (this.f3790y & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.f3782q = this.f3783r.getDrawable(i);
        m2781c();
        return this;
    }

    @Override // p000.wb1, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f3786u = colorStateList;
        this.f3788w = true;
        m2781c();
        return this;
    }

    @Override // p000.wb1, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f3787v = mode;
        this.f3789x = true;
        m2781c();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f3777l = intent;
        return this;
    }

    @Override // p000.wb1, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int i) {
        this.f3778m = c;
        this.f3779n = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.wb1, android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f3778m = c;
        this.f3779n = KeyEvent.normalizeMetaState(i);
        this.f3780o = Character.toLowerCase(c2);
        this.f3781p = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        this.f3775j = this.f3783r.getResources().getString(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f3776k = charSequence;
        return this;
    }

    @Override // p000.wb1, android.view.MenuItem
    public final wb1 setTooltipText(CharSequence charSequence) {
        this.f3785t = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z) {
        this.f3790y = (this.f3790y & 8) | (z ? 0 : 8);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f3784s = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f3785t = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        this.f3778m = c;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f3782q = drawable;
        m2781c();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        this.f3780o = Character.toLowerCase(c);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f3775j = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2) {
        this.f3778m = c;
        this.f3780o = Character.toLowerCase(c2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        return this;
    }
}
