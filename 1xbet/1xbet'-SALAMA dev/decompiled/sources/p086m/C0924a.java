package p086m;

import G.h;
import K.a;
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

/* JADX INFO: renamed from: m.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0924a implements a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public CharSequence f15067A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public CharSequence f15068B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public ColorStateList f15069C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public PorterDuff.Mode f15070D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f15071E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f15072F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public int f15073G;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CharSequence f15074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CharSequence f15075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Intent f15076c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public char f15077d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f15078e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public char f15079f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f15080x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Drawable f15081y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Context f15082z;

    public final void a() {
        Drawable drawable = this.f15081y;
        if (drawable != null) {
            if (this.f15071E || this.f15072F) {
                this.f15081y = drawable;
                Drawable drawableMutate = drawable.mutate();
                this.f15081y = drawableMutate;
                if (this.f15071E) {
                    J.a.h(drawableMutate, this.f15069C);
                }
                if (this.f15072F) {
                    J.a.i(this.f15081y, this.f15070D);
                }
            }
        }
    }

    @Override // K.a
    public final a c(AbstractC0347c abstractC0347c) {
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
        return this.f15080x;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f15079f;
    }

    @Override // K.a, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f15067A;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.f15081y;
    }

    @Override // K.a, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f15069C;
    }

    @Override // K.a, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f15070D;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f15076c;
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
        return this.f15078e;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f15077d;
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
        return this.f15074a;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f15075b;
        return charSequence != null ? charSequence : this.f15074a;
    }

    @Override // K.a, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f15068B;
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
        return (this.f15073G & 1) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f15073G & 2) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f15073G & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.f15073G & 8) == 0;
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
        this.f15079f = Character.toLowerCase(c3);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z4) {
        this.f15073G = (z4 ? 1 : 0) | (this.f15073G & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z4) {
        this.f15073G = (z4 ? 2 : 0) | (this.f15073G & (-3));
        return this;
    }

    @Override // K.a, android.view.MenuItem
    public final a setContentDescription(CharSequence charSequence) {
        this.f15067A = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z4) {
        this.f15073G = (z4 ? 16 : 0) | (this.f15073G & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f15081y = drawable;
        a();
        return this;
    }

    @Override // K.a, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f15069C = colorStateList;
        this.f15071E = true;
        a();
        return this;
    }

    @Override // K.a, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f15070D = mode;
        this.f15072F = true;
        a();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f15076c = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c3) {
        this.f15077d = c3;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c3, char c4) {
        this.f15077d = c3;
        this.f15079f = Character.toLowerCase(c4);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f15074a = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f15075b = charSequence;
        return this;
    }

    @Override // K.a, android.view.MenuItem
    public final a setTooltipText(CharSequence charSequence) {
        this.f15068B = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z4) {
        this.f15073G = (this.f15073G & 8) | (z4 ? 0 : 8);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i7) {
        throw new UnsupportedOperationException();
    }

    @Override // K.a, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c3, int i7) {
        this.f15079f = Character.toLowerCase(c3);
        this.f15080x = KeyEvent.normalizeMetaState(i7);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f15067A = charSequence;
        return this;
    }

    @Override // K.a, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c3, int i7) {
        this.f15077d = c3;
        this.f15078e = KeyEvent.normalizeMetaState(i7);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i7) {
        this.f15074a = this.f15082z.getResources().getString(i7);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f15068B = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i7) {
        this.f15081y = h.getDrawable(this.f15082z, i7);
        a();
        return this;
    }

    @Override // K.a, android.view.MenuItem
    public final MenuItem setShortcut(char c3, char c4, int i7, int i8) {
        this.f15077d = c3;
        this.f15078e = KeyEvent.normalizeMetaState(i7);
        this.f15079f = Character.toLowerCase(c4);
        this.f15080x = KeyEvent.normalizeMetaState(i8);
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
