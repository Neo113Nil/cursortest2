package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.core.view.AbstractC5307b;
import java.lang.reflect.Method;
import s2.InterfaceMenuItemC9585b;

/* loaded from: classes8.dex */
public final class j extends androidx.appcompat.view.menu.b implements MenuItem {

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceMenuItemC9585b f37468d;

    /* renamed from: e, reason: collision with root package name */
    private Method f37469e;

    private class a extends AbstractC5307b implements ActionProvider.VisibilityListener {

        /* renamed from: b, reason: collision with root package name */
        private AbstractC5307b.a f37470b;

        /* renamed from: c, reason: collision with root package name */
        private final ActionProvider f37471c;

        a(ActionProvider actionProvider) {
            this.f37471c = actionProvider;
        }

        @Override // androidx.core.view.AbstractC5307b
        public final boolean a() {
            return this.f37471c.hasSubMenu();
        }

        @Override // androidx.core.view.AbstractC5307b
        public final boolean b() {
            return this.f37471c.isVisible();
        }

        @Override // androidx.core.view.AbstractC5307b
        @NonNull
        public final View c() {
            return this.f37471c.onCreateActionView();
        }

        @Override // androidx.core.view.AbstractC5307b
        public final View d(i iVar) {
            return this.f37471c.onCreateActionView(iVar);
        }

        @Override // androidx.core.view.AbstractC5307b
        public final boolean e() {
            return this.f37471c.onPerformDefaultAction();
        }

        @Override // androidx.core.view.AbstractC5307b
        public final void f(q qVar) {
            this.f37471c.onPrepareSubMenu(j.this.d(qVar));
        }

        @Override // androidx.core.view.AbstractC5307b
        public final boolean g() {
            return this.f37471c.overridesItemVisibility();
        }

        @Override // androidx.core.view.AbstractC5307b
        public final void i(AbstractC5307b.a aVar) {
            this.f37470b = aVar;
            this.f37471c.setVisibilityListener(this);
        }

        @Override // android.view.ActionProvider.VisibilityListener
        public final void onActionProviderVisibilityChanged(boolean z11) {
            AbstractC5307b.a aVar = this.f37470b;
            if (aVar != null) {
                i.this.f37454n.x();
            }
        }
    }

    static class b extends FrameLayout implements androidx.appcompat.view.c {

        /* renamed from: a, reason: collision with root package name */
        final CollapsibleActionView f37473a;

        /* JADX WARN: Multi-variable type inference failed */
        b(View view) {
            super(view.getContext());
            this.f37473a = (CollapsibleActionView) view;
            addView(view);
        }

        @Override // androidx.appcompat.view.c
        public final void b() {
            this.f37473a.onActionViewCollapsed();
        }

        @Override // androidx.appcompat.view.c
        public final void d() {
            this.f37473a.onActionViewExpanded();
        }
    }

    private class c implements MenuItem.OnActionExpandListener {

        /* renamed from: a, reason: collision with root package name */
        private final MenuItem.OnActionExpandListener f37474a;

        c(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f37474a = onActionExpandListener;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f37474a.onMenuItemActionCollapse(j.this.c(menuItem));
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public final boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f37474a.onMenuItemActionExpand(j.this.c(menuItem));
        }
    }

    private class d implements MenuItem.OnMenuItemClickListener {

        /* renamed from: a, reason: collision with root package name */
        private final MenuItem.OnMenuItemClickListener f37476a;

        d(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f37476a = onMenuItemClickListener;
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public final boolean onMenuItemClick(MenuItem menuItem) {
            return this.f37476a.onMenuItemClick(j.this.c(menuItem));
        }
    }

    public j(Context context, InterfaceMenuItemC9585b interfaceMenuItemC9585b) {
        super(context);
        if (interfaceMenuItemC9585b == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f37468d = interfaceMenuItemC9585b;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return this.f37468d.collapseActionView();
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return this.f37468d.expandActionView();
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        AbstractC5307b a11 = this.f37468d.a();
        if (a11 instanceof a) {
            return ((a) a11).f37471c;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View actionView = this.f37468d.getActionView();
        return actionView instanceof b ? (View) ((b) actionView).f37473a : actionView;
    }

    @Override // android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f37468d.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f37468d.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f37468d.getContentDescription();
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f37468d.getGroupId();
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.f37468d.getIcon();
    }

    @Override // android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f37468d.getIconTintList();
    }

    @Override // android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f37468d.getIconTintMode();
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f37468d.getIntent();
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f37468d.getItemId();
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f37468d.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f37468d.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f37468d.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f37468d.getOrder();
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return d(this.f37468d.getSubMenu());
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f37468d.getTitle();
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        return this.f37468d.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f37468d.getTooltipText();
    }

    public final void h() {
        try {
            Method method = this.f37469e;
            InterfaceMenuItemC9585b interfaceMenuItemC9585b = this.f37468d;
            if (method == null) {
                this.f37469e = interfaceMenuItemC9585b.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
            }
            this.f37469e.invoke(interfaceMenuItemC9585b, Boolean.TRUE);
        } catch (Exception e11) {
            Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e11);
        }
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f37468d.hasSubMenu();
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f37468d.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return this.f37468d.isCheckable();
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return this.f37468d.isChecked();
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return this.f37468d.isEnabled();
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return this.f37468d.isVisible();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        a aVar = new a(actionProvider);
        if (actionProvider == null) {
            aVar = null;
        }
        this.f37468d.b(aVar);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new b(view);
        }
        this.f37468d.setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c11) {
        this.f37468d.setAlphabeticShortcut(c11);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z11) {
        this.f37468d.setCheckable(z11);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z11) {
        this.f37468d.setChecked(z11);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f37468d.setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z11) {
        this.f37468d.setEnabled(z11);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f37468d.setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f37468d.setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f37468d.setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f37468d.setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c11) {
        this.f37468d.setNumericShortcut(c11);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f37468d.setOnActionExpandListener(onActionExpandListener != null ? new c(onActionExpandListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f37468d.setOnMenuItemClickListener(onMenuItemClickListener != null ? new d(onMenuItemClickListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c11, char c12) {
        this.f37468d.setShortcut(c11, c12);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i11) {
        this.f37468d.setShowAsAction(i11);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i11) {
        this.f37468d.setShowAsActionFlags(i11);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f37468d.setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f37468d.setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f37468d.setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z11) {
        return this.f37468d.setVisible(z11);
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c11, int i11) {
        this.f37468d.setAlphabeticShortcut(c11, i11);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i11) {
        this.f37468d.setIcon(i11);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c11, int i11) {
        this.f37468d.setNumericShortcut(c11, i11);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c11, char c12, int i11, int i12) {
        this.f37468d.setShortcut(c11, c12, i11, i12);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i11) {
        this.f37468d.setTitle(i11);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i11) {
        InterfaceMenuItemC9585b interfaceMenuItemC9585b = this.f37468d;
        interfaceMenuItemC9585b.setActionView(i11);
        View actionView = interfaceMenuItemC9585b.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            interfaceMenuItemC9585b.setActionView(new b(actionView));
        }
        return this;
    }
}
