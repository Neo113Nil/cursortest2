package m;

import P.AbstractC0347c;
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

/* renamed from: m.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1417a implements K.a {

    /* renamed from: A, reason: collision with root package name */
    public CharSequence f15061A;

    /* renamed from: B, reason: collision with root package name */
    public CharSequence f15062B;

    /* renamed from: C, reason: collision with root package name */
    public ColorStateList f15063C;

    /* renamed from: D, reason: collision with root package name */
    public PorterDuff.Mode f15064D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f15065E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f15066F;

    /* renamed from: G, reason: collision with root package name */
    public int f15067G;

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f15068a;

    /* renamed from: b, reason: collision with root package name */
    public CharSequence f15069b;

    /* renamed from: c, reason: collision with root package name */
    public Intent f15070c;

    /* renamed from: d, reason: collision with root package name */
    public char f15071d;

    /* renamed from: e, reason: collision with root package name */
    public int f15072e;

    /* renamed from: f, reason: collision with root package name */
    public char f15073f;

    /* renamed from: x, reason: collision with root package name */
    public int f15074x;

    /* renamed from: y, reason: collision with root package name */
    public Drawable f15075y;

    /* renamed from: z, reason: collision with root package name */
    public Context f15076z;

    public final void a() {
        Drawable drawable = this.f15075y;
        if (drawable != null) {
            if (this.f15065E || this.f15066F) {
                this.f15075y = drawable;
                Drawable mutate = drawable.mutate();
                this.f15075y = mutate;
                if (this.f15065E) {
                    J.a.h(mutate, this.f15063C);
                }
                if (this.f15066F) {
                    J.a.i(this.f15075y, this.f15064D);
                }
            }
        }
    }

    @Override // K.a
    public final K.a c(AbstractC0347c abstractC0347c) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return false;
    }

    @Override // K.a
    public final AbstractC0347c d() {
        return null;
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

    @Override // K.a, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f15074x;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f15073f;
    }

    @Override // K.a, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f15061A;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.f15075y;
    }

    @Override // K.a, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f15063C;
    }

    @Override // K.a, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f15064D;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f15070c;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return R.id.home;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // K.a, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f15072e;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f15071d;
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
        return this.f15068a;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f15069b;
        return charSequence != null ? charSequence : this.f15068a;
    }

    @Override // K.a, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f15062B;
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
        return (this.f15067G & 1) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f15067G & 2) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f15067G & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.f15067G & 8) == 0;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c3) {
        this.f15073f = Character.toLowerCase(c3);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z4) {
        this.f15067G = (z4 ? 1 : 0) | (this.f15067G & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z4) {
        this.f15067G = (z4 ? 2 : 0) | (this.f15067G & (-3));
        return this;
    }

    @Override // K.a, android.view.MenuItem
    public final K.a setContentDescription(CharSequence charSequence) {
        this.f15061A = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z4) {
        this.f15067G = (z4 ? 16 : 0) | (this.f15067G & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f15075y = drawable;
        a();
        return this;
    }

    @Override // K.a, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f15063C = colorStateList;
        this.f15065E = true;
        a();
        return this;
    }

    @Override // K.a, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f15064D = mode;
        this.f15066F = true;
        a();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f15070c = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c3) {
        this.f15071d = c3;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c3, char c4) {
        this.f15071d = c3;
        this.f15073f = Character.toLowerCase(c4);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f15068a = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f15069b = charSequence;
        return this;
    }

    @Override // K.a, android.view.MenuItem
    public final K.a setTooltipText(CharSequence charSequence) {
        this.f15062B = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z4) {
        this.f15067G = (this.f15067G & 8) | (z4 ? 0 : 8);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i7) {
        throw new UnsupportedOperationException();
    }

    @Override // K.a, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c3, int i7) {
        this.f15073f = Character.toLowerCase(c3);
        this.f15074x = KeyEvent.normalizeMetaState(i7);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f15061A = charSequence;
        return this;
    }

    @Override // K.a, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c3, int i7) {
        this.f15071d = c3;
        this.f15072e = KeyEvent.normalizeMetaState(i7);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i7) {
        this.f15068a = this.f15076z.getResources().getString(i7);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f15062B = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i7) {
        this.f15075y = G.h.getDrawable(this.f15076z, i7);
        a();
        return this;
    }

    @Override // K.a, android.view.MenuItem
    public final MenuItem setShortcut(char c3, char c4, int i7, int i8) {
        this.f15071d = c3;
        this.f15072e = KeyEvent.normalizeMetaState(i7);
        this.f15073f = Character.toLowerCase(c4);
        this.f15074x = KeyEvent.normalizeMetaState(i8);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i7) {
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i7) {
        return this;
    }
}
