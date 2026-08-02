package androidx.appcompat.view.menu;

/* loaded from: classes3.dex */
public class MenuItemWrapperICS extends androidx.appcompat.view.menu.BaseMenuWrapper implements android.view.MenuItem {
    private java.lang.reflect.Method Camera2StreamConfigurationMap;
    private final androidx.core.internal.view.SupportMenuItem getHighResolutionOutputSizeshNQ4ISI;

    public MenuItemWrapperICS(android.content.Context context, androidx.core.internal.view.SupportMenuItem supportMenuItem) {
        super(context);
        if (supportMenuItem == null) {
            throw new java.lang.IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.getHighResolutionOutputSizeshNQ4ISI = supportMenuItem;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getItemId();
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getGroupId();
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getOrder();
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setTitle(java.lang.CharSequence charSequence) {
        this.getHighResolutionOutputSizeshNQ4ISI.setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setTitle(int i) {
        this.getHighResolutionOutputSizeshNQ4ISI.setTitle(i);
        return this;
    }

    @Override // android.view.MenuItem
    public java.lang.CharSequence getTitle() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getTitle();
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setTitleCondensed(java.lang.CharSequence charSequence) {
        this.getHighResolutionOutputSizeshNQ4ISI.setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public java.lang.CharSequence getTitleCondensed() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setIcon(android.graphics.drawable.Drawable drawable) {
        this.getHighResolutionOutputSizeshNQ4ISI.setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setIcon(int i) {
        this.getHighResolutionOutputSizeshNQ4ISI.setIcon(i);
        return this;
    }

    @Override // android.view.MenuItem
    public android.graphics.drawable.Drawable getIcon() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getIcon();
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setIntent(android.content.Intent intent) {
        this.getHighResolutionOutputSizeshNQ4ISI.setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public android.content.Intent getIntent() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getIntent();
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setShortcut(char c, char c2) {
        this.getHighResolutionOutputSizeshNQ4ISI.setShortcut(c, c2);
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.getHighResolutionOutputSizeshNQ4ISI.setShortcut(c, c2, i, i2);
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setNumericShortcut(char c) {
        this.getHighResolutionOutputSizeshNQ4ISI.setNumericShortcut(c);
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setNumericShortcut(char c, int i) {
        this.getHighResolutionOutputSizeshNQ4ISI.setNumericShortcut(c, i);
        return this;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public int getNumericModifiers() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setAlphabeticShortcut(char c) {
        this.getHighResolutionOutputSizeshNQ4ISI.setAlphabeticShortcut(c);
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setAlphabeticShortcut(char c, int i) {
        this.getHighResolutionOutputSizeshNQ4ISI.setAlphabeticShortcut(c, i);
        return this;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setCheckable(boolean z) {
        this.getHighResolutionOutputSizeshNQ4ISI.setCheckable(z);
        return this;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return this.getHighResolutionOutputSizeshNQ4ISI.isCheckable();
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setChecked(boolean z) {
        this.getHighResolutionOutputSizeshNQ4ISI.setChecked(z);
        return this;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return this.getHighResolutionOutputSizeshNQ4ISI.isChecked();
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setVisible(boolean z) {
        return this.getHighResolutionOutputSizeshNQ4ISI.setVisible(z);
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return this.getHighResolutionOutputSizeshNQ4ISI.isVisible();
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setEnabled(boolean z) {
        this.getHighResolutionOutputSizeshNQ4ISI.setEnabled(z);
        return this;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return this.getHighResolutionOutputSizeshNQ4ISI.isEnabled();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.getHighResolutionOutputSizeshNQ4ISI.hasSubMenu();
    }

    @Override // android.view.MenuItem
    public android.view.SubMenu getSubMenu() {
        return getHighSpeedVideoFpsRangesFor(this.getHighResolutionOutputSizeshNQ4ISI.getSubMenu());
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setOnMenuItemClickListener(android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.getHighResolutionOutputSizeshNQ4ISI.setOnMenuItemClickListener(onMenuItemClickListener != null ? new androidx.appcompat.view.menu.MenuItemWrapperICS.OnMenuItemClickListenerWrapper(onMenuItemClickListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public void setShowAsAction(int i) {
        this.getHighResolutionOutputSizeshNQ4ISI.setShowAsAction(i);
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setShowAsActionFlags(int i) {
        this.getHighResolutionOutputSizeshNQ4ISI.setShowAsActionFlags(i);
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setActionView(android.view.View view) {
        if (view instanceof android.view.CollapsibleActionView) {
            view = new androidx.appcompat.view.menu.MenuItemWrapperICS.CollapsibleActionViewWrapper(view);
        }
        this.getHighResolutionOutputSizeshNQ4ISI.setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setActionView(int i) {
        this.getHighResolutionOutputSizeshNQ4ISI.setActionView(i);
        android.view.View actionView = this.getHighResolutionOutputSizeshNQ4ISI.getActionView();
        if (actionView instanceof android.view.CollapsibleActionView) {
            this.getHighResolutionOutputSizeshNQ4ISI.setActionView(new androidx.appcompat.view.menu.MenuItemWrapperICS.CollapsibleActionViewWrapper(actionView));
        }
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.View getActionView() {
        android.view.View actionView = this.getHighResolutionOutputSizeshNQ4ISI.getActionView();
        return actionView instanceof androidx.appcompat.view.menu.MenuItemWrapperICS.CollapsibleActionViewWrapper ? (android.view.View) ((androidx.appcompat.view.menu.MenuItemWrapperICS.CollapsibleActionViewWrapper) actionView).getHighResolutionOutputSizeshNQ4ISI : actionView;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setActionProvider(android.view.ActionProvider actionProvider) {
        androidx.appcompat.view.menu.MenuItemWrapperICS.ActionProviderWrapper actionProviderWrapper = new androidx.appcompat.view.menu.MenuItemWrapperICS.ActionProviderWrapper(this.getHighSpeedVideoSizes, actionProvider);
        androidx.core.internal.view.SupportMenuItem supportMenuItem = this.getHighResolutionOutputSizeshNQ4ISI;
        if (actionProvider == null) {
            actionProviderWrapper = null;
        }
        supportMenuItem.setSupportActionProvider(actionProviderWrapper);
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.ActionProvider getActionProvider() {
        androidx.core.view.ActionProvider supportActionProvider = this.getHighResolutionOutputSizeshNQ4ISI.getSupportActionProvider();
        if (supportActionProvider instanceof androidx.appcompat.view.menu.MenuItemWrapperICS.ActionProviderWrapper) {
            return ((androidx.appcompat.view.menu.MenuItemWrapperICS.ActionProviderWrapper) supportActionProvider).getHighSpeedVideoFpsRangesFor;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public boolean expandActionView() {
        return this.getHighResolutionOutputSizeshNQ4ISI.expandActionView();
    }

    @Override // android.view.MenuItem
    public boolean collapseActionView() {
        return this.getHighResolutionOutputSizeshNQ4ISI.collapseActionView();
    }

    @Override // android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.getHighResolutionOutputSizeshNQ4ISI.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setOnActionExpandListener(android.view.MenuItem.OnActionExpandListener onActionExpandListener) {
        this.getHighResolutionOutputSizeshNQ4ISI.setOnActionExpandListener(onActionExpandListener != null ? new androidx.appcompat.view.menu.MenuItemWrapperICS.OnActionExpandListenerWrapper(onActionExpandListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setContentDescription(java.lang.CharSequence charSequence) {
        this.getHighResolutionOutputSizeshNQ4ISI.setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public java.lang.CharSequence getContentDescription() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getContentDescription();
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setTooltipText(java.lang.CharSequence charSequence) {
        this.getHighResolutionOutputSizeshNQ4ISI.setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public java.lang.CharSequence getTooltipText() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getTooltipText();
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setIconTintList(android.content.res.ColorStateList colorStateList) {
        this.getHighResolutionOutputSizeshNQ4ISI.setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public android.content.res.ColorStateList getIconTintList() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getIconTintList();
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setIconTintMode(android.graphics.PorterDuff.Mode mode) {
        this.getHighResolutionOutputSizeshNQ4ISI.setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public android.graphics.PorterDuff.Mode getIconTintMode() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getIconTintMode();
    }

    public void setExclusiveCheckable(boolean z) {
        try {
            if (this.Camera2StreamConfigurationMap == null) {
                this.Camera2StreamConfigurationMap = this.getHighResolutionOutputSizeshNQ4ISI.getClass().getDeclaredMethod("setExclusiveCheckable", java.lang.Boolean.TYPE);
            }
            this.Camera2StreamConfigurationMap.invoke(this.getHighResolutionOutputSizeshNQ4ISI, java.lang.Boolean.valueOf(z));
        } catch (java.lang.Exception unused) {
        }
    }

    class OnMenuItemClickListenerWrapper implements android.view.MenuItem.OnMenuItemClickListener {
        private final android.view.MenuItem.OnMenuItemClickListener getHighSpeedVideoSizes;

        OnMenuItemClickListenerWrapper(android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.getHighSpeedVideoSizes = onMenuItemClickListener;
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(android.view.MenuItem menuItem) {
            return this.getHighSpeedVideoSizes.onMenuItemClick(androidx.appcompat.view.menu.MenuItemWrapperICS.this.getHighSpeedVideoSizes(menuItem));
        }
    }

    class OnActionExpandListenerWrapper implements android.view.MenuItem.OnActionExpandListener {
        private final android.view.MenuItem.OnActionExpandListener getHighSpeedVideoFpsRanges;

        OnActionExpandListenerWrapper(android.view.MenuItem.OnActionExpandListener onActionExpandListener) {
            this.getHighSpeedVideoFpsRanges = onActionExpandListener;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(android.view.MenuItem menuItem) {
            return this.getHighSpeedVideoFpsRanges.onMenuItemActionExpand(androidx.appcompat.view.menu.MenuItemWrapperICS.this.getHighSpeedVideoSizes(menuItem));
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(android.view.MenuItem menuItem) {
            return this.getHighSpeedVideoFpsRanges.onMenuItemActionCollapse(androidx.appcompat.view.menu.MenuItemWrapperICS.this.getHighSpeedVideoSizes(menuItem));
        }
    }

    class ActionProviderWrapper extends androidx.core.view.ActionProvider implements android.view.ActionProvider.VisibilityListener {
        private androidx.core.view.ActionProvider.VisibilityListener getHighSpeedVideoFpsRanges;
        private final android.view.ActionProvider getHighSpeedVideoFpsRangesFor;

        ActionProviderWrapper(android.content.Context context, android.view.ActionProvider actionProvider) {
            super(context);
            this.getHighSpeedVideoFpsRangesFor = actionProvider;
        }

        @Override // androidx.core.view.ActionProvider
        public android.view.View onCreateActionView(android.view.MenuItem menuItem) {
            return this.getHighSpeedVideoFpsRangesFor.onCreateActionView(menuItem);
        }

        @Override // androidx.core.view.ActionProvider
        public boolean overridesItemVisibility() {
            return this.getHighSpeedVideoFpsRangesFor.overridesItemVisibility();
        }

        @Override // androidx.core.view.ActionProvider
        public boolean isVisible() {
            return this.getHighSpeedVideoFpsRangesFor.isVisible();
        }

        @Override // androidx.core.view.ActionProvider
        public void refreshVisibility() {
            this.getHighSpeedVideoFpsRangesFor.refreshVisibility();
        }

        @Override // androidx.core.view.ActionProvider
        public void setVisibilityListener(androidx.core.view.ActionProvider.VisibilityListener visibilityListener) {
            this.getHighSpeedVideoFpsRanges = visibilityListener;
            this.getHighSpeedVideoFpsRangesFor.setVisibilityListener(visibilityListener != null ? this : null);
        }

        @Override // android.view.ActionProvider.VisibilityListener
        public void onActionProviderVisibilityChanged(boolean z) {
            androidx.core.view.ActionProvider.VisibilityListener visibilityListener = this.getHighSpeedVideoFpsRanges;
            if (visibilityListener != null) {
                visibilityListener.onActionProviderVisibilityChanged(z);
            }
        }

        @Override // androidx.core.view.ActionProvider
        public boolean onPerformDefaultAction() {
            return this.getHighSpeedVideoFpsRangesFor.onPerformDefaultAction();
        }

        @Override // androidx.core.view.ActionProvider
        public android.view.View onCreateActionView() {
            return this.getHighSpeedVideoFpsRangesFor.onCreateActionView();
        }

        @Override // androidx.core.view.ActionProvider
        public boolean hasSubMenu() {
            return this.getHighSpeedVideoFpsRangesFor.hasSubMenu();
        }

        @Override // androidx.core.view.ActionProvider
        public void onPrepareSubMenu(android.view.SubMenu subMenu) {
            this.getHighSpeedVideoFpsRangesFor.onPrepareSubMenu(androidx.appcompat.view.menu.MenuItemWrapperICS.this.getHighSpeedVideoFpsRangesFor(subMenu));
        }
    }

    static class CollapsibleActionViewWrapper extends android.widget.FrameLayout implements androidx.appcompat.view.CollapsibleActionView {
        final android.view.CollapsibleActionView getHighResolutionOutputSizeshNQ4ISI;

        /* JADX WARN: Multi-variable type inference failed */
        CollapsibleActionViewWrapper(android.view.View view) {
            super(view.getContext());
            this.getHighResolutionOutputSizeshNQ4ISI = (android.view.CollapsibleActionView) view;
            addView(view);
        }

        @Override // androidx.appcompat.view.CollapsibleActionView
        public void onActionViewExpanded() {
            this.getHighResolutionOutputSizeshNQ4ISI.onActionViewExpanded();
        }

        @Override // androidx.appcompat.view.CollapsibleActionView
        public void onActionViewCollapsed() {
            this.getHighResolutionOutputSizeshNQ4ISI.onActionViewCollapsed();
        }
    }
}
