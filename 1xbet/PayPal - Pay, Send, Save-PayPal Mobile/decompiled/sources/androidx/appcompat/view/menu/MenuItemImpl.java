package androidx.appcompat.view.menu;

/* loaded from: classes3.dex */
public final class MenuItemImpl implements androidx.core.internal.view.SupportMenuItem {
    private java.lang.CharSequence AMEXKernel;
    private android.content.Intent ArtificialStackFrames;
    char Camera2StreamConfigurationMap;
    private android.view.MenuItem.OnActionExpandListener CoroutineDebuggingKt;
    private java.lang.CharSequence _BOUNDARY;
    private androidx.appcompat.view.menu.SubMenuBuilder _CREATION;

    /* renamed from: a, reason: collision with root package name */
    private java.lang.CharSequence f2665a;
    private int b;
    private java.lang.Runnable coroutineCreation;
    private final int getARTIFICIAL_FRAME_PACKAGE_NAME;
    androidx.appcompat.view.menu.MenuBuilder getHighSpeedVideoFpsRanges;
    android.view.ContextMenu.ContextMenuInfo getHighSpeedVideoFpsRangesFor;
    char getHighSpeedVideoSizes;
    private final int getHighSpeedVideoSizesFor;
    private android.view.MenuItem.OnMenuItemClickListener getInputFormats;
    private androidx.core.view.ActionProvider getOutputFormats;
    private android.view.View getOutputMinFrameDuration;
    private java.lang.CharSequence getOutputMinFrameDurationlomOqCM;
    private final int getOutputSizeshNQ4ISI;
    private android.graphics.drawable.Drawable getValidOutputFormatsForInputhNQ4ISI;
    private final int isOutputSupportedFor;
    int getInputSizeshNQ4ISI = 4096;
    int getHighResolutionOutputSizeshNQ4ISI = 4096;
    private int unwrapAs = 0;
    private android.content.res.ColorStateList toString = null;
    private android.graphics.PorterDuff.Mode isOutputSupportedForhNQ4ISI = null;
    private boolean getOutputStallDurationlomOqCM = false;
    private boolean getOutputStallDuration = false;
    private boolean coroutineBoundary = false;
    private int getOutputSizes = 16;
    private boolean accessartificialFrame = false;

    MenuItemImpl(androidx.appcompat.view.menu.MenuBuilder menuBuilder, int i, int i2, int i3, int i4, java.lang.CharSequence charSequence, int i5) {
        this.getHighSpeedVideoFpsRanges = menuBuilder;
        this.isOutputSupportedFor = i2;
        this.getOutputSizeshNQ4ISI = i;
        this.getHighSpeedVideoSizesFor = i3;
        this.getARTIFICIAL_FRAME_PACKAGE_NAME = i4;
        this._BOUNDARY = charSequence;
        this.b = i5;
    }

    public final boolean invoke() {
        android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.getInputFormats;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        androidx.appcompat.view.menu.MenuBuilder menuBuilder = this.getHighSpeedVideoFpsRanges;
        if (menuBuilder.dispatchMenuItemSelected(menuBuilder, this)) {
            return true;
        }
        java.lang.Runnable runnable = this.coroutineCreation;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.ArtificialStackFrames != null) {
            try {
                this.getHighSpeedVideoFpsRanges.getContext().startActivity(this.ArtificialStackFrames);
                return true;
            } catch (android.content.ActivityNotFoundException unused) {
            }
        }
        androidx.core.view.ActionProvider actionProvider = this.getOutputFormats;
        return actionProvider != null && actionProvider.onPerformDefaultAction();
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.getOutputSizes & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setEnabled(boolean z) {
        if (z) {
            this.getOutputSizes |= 16;
        } else {
            this.getOutputSizes &= -17;
        }
        this.getHighSpeedVideoFpsRanges.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.getOutputSizeshNQ4ISI;
    }

    @Override // android.view.MenuItem
    @android.view.ViewDebug.CapturedViewProperty
    public final int getItemId() {
        return this.isOutputSupportedFor;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.getHighSpeedVideoSizesFor;
    }

    public final int getOrdering() {
        return this.getARTIFICIAL_FRAME_PACKAGE_NAME;
    }

    @Override // android.view.MenuItem
    public final android.content.Intent getIntent() {
        return this.ArtificialStackFrames;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setIntent(android.content.Intent intent) {
        this.ArtificialStackFrames = intent;
        return this;
    }

    public final android.view.MenuItem setCallback(java.lang.Runnable runnable) {
        this.coroutineCreation = runnable;
        return this;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setAlphabeticShortcut(char c) {
        if (this.getHighSpeedVideoSizes == c) {
            return this;
        }
        this.getHighSpeedVideoSizes = java.lang.Character.toLowerCase(c);
        this.getHighSpeedVideoFpsRanges.onItemsChanged(false);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final android.view.MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.getHighSpeedVideoSizes == c && this.getHighResolutionOutputSizeshNQ4ISI == i) {
            return this;
        }
        this.getHighSpeedVideoSizes = java.lang.Character.toLowerCase(c);
        this.getHighResolutionOutputSizeshNQ4ISI = android.view.KeyEvent.normalizeMetaState(i);
        this.getHighSpeedVideoFpsRanges.onItemsChanged(false);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.getInputSizeshNQ4ISI;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setNumericShortcut(char c) {
        if (this.Camera2StreamConfigurationMap == c) {
            return this;
        }
        this.Camera2StreamConfigurationMap = c;
        this.getHighSpeedVideoFpsRanges.onItemsChanged(false);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final android.view.MenuItem setNumericShortcut(char c, int i) {
        if (this.Camera2StreamConfigurationMap == c && this.getInputSizeshNQ4ISI == i) {
            return this;
        }
        this.Camera2StreamConfigurationMap = c;
        this.getInputSizeshNQ4ISI = android.view.KeyEvent.normalizeMetaState(i);
        this.getHighSpeedVideoFpsRanges.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setShortcut(char c, char c2) {
        this.Camera2StreamConfigurationMap = c;
        this.getHighSpeedVideoSizes = java.lang.Character.toLowerCase(c2);
        this.getHighSpeedVideoFpsRanges.onItemsChanged(false);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final android.view.MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.Camera2StreamConfigurationMap = c;
        this.getInputSizeshNQ4ISI = android.view.KeyEvent.normalizeMetaState(i);
        this.getHighSpeedVideoSizes = java.lang.Character.toLowerCase(c2);
        this.getHighResolutionOutputSizeshNQ4ISI = android.view.KeyEvent.normalizeMetaState(i2);
        this.getHighSpeedVideoFpsRanges.onItemsChanged(false);
        return this;
    }

    static void Camera2StreamConfigurationMap(java.lang.StringBuilder sb, int i, int i2, java.lang.String str) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    @Override // android.view.MenuItem
    public final android.view.SubMenu getSubMenu() {
        return this._CREATION;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this._CREATION != null;
    }

    public final void setSubMenu(androidx.appcompat.view.menu.SubMenuBuilder subMenuBuilder) {
        this._CREATION = subMenuBuilder;
        subMenuBuilder.setHeaderTitle(getTitle());
    }

    @Override // android.view.MenuItem
    @android.view.ViewDebug.CapturedViewProperty
    public final java.lang.CharSequence getTitle() {
        return this._BOUNDARY;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setTitle(java.lang.CharSequence charSequence) {
        this._BOUNDARY = charSequence;
        this.getHighSpeedVideoFpsRanges.onItemsChanged(false);
        androidx.appcompat.view.menu.SubMenuBuilder subMenuBuilder = this._CREATION;
        if (subMenuBuilder != null) {
            subMenuBuilder.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setTitle(int i) {
        return setTitle(this.getHighSpeedVideoFpsRanges.getContext().getString(i));
    }

    @Override // android.view.MenuItem
    public final java.lang.CharSequence getTitleCondensed() {
        java.lang.CharSequence charSequence = this.f2665a;
        return charSequence != null ? charSequence : this._BOUNDARY;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setTitleCondensed(java.lang.CharSequence charSequence) {
        this.f2665a = charSequence;
        this.getHighSpeedVideoFpsRanges.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final android.graphics.drawable.Drawable getIcon() {
        android.graphics.drawable.Drawable drawable = this.getValidOutputFormatsForInputhNQ4ISI;
        if (drawable != null) {
            return getHighResolutionOutputSizeshNQ4ISI(drawable);
        }
        if (this.unwrapAs == 0) {
            return null;
        }
        android.graphics.drawable.Drawable drawable2 = androidx.appcompat.content.res.AppCompatResources.getDrawable(this.getHighSpeedVideoFpsRanges.getContext(), this.unwrapAs);
        this.unwrapAs = 0;
        this.getValidOutputFormatsForInputhNQ4ISI = drawable2;
        return getHighResolutionOutputSizeshNQ4ISI(drawable2);
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setIcon(android.graphics.drawable.Drawable drawable) {
        this.unwrapAs = 0;
        this.getValidOutputFormatsForInputhNQ4ISI = drawable;
        this.coroutineBoundary = true;
        this.getHighSpeedVideoFpsRanges.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setIcon(int i) {
        this.getValidOutputFormatsForInputhNQ4ISI = null;
        this.unwrapAs = i;
        this.coroutineBoundary = true;
        this.getHighSpeedVideoFpsRanges.onItemsChanged(false);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final android.view.MenuItem setIconTintList(android.content.res.ColorStateList colorStateList) {
        this.toString = colorStateList;
        this.getOutputStallDurationlomOqCM = true;
        this.coroutineBoundary = true;
        this.getHighSpeedVideoFpsRanges.onItemsChanged(false);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final android.content.res.ColorStateList getIconTintList() {
        return this.toString;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final android.view.MenuItem setIconTintMode(android.graphics.PorterDuff.Mode mode) {
        this.isOutputSupportedForhNQ4ISI = mode;
        this.getOutputStallDuration = true;
        this.coroutineBoundary = true;
        this.getHighSpeedVideoFpsRanges.onItemsChanged(false);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final android.graphics.PorterDuff.Mode getIconTintMode() {
        return this.isOutputSupportedForhNQ4ISI;
    }

    private android.graphics.drawable.Drawable getHighResolutionOutputSizeshNQ4ISI(android.graphics.drawable.Drawable drawable) {
        if (drawable != null && this.coroutineBoundary && (this.getOutputStallDurationlomOqCM || this.getOutputStallDuration)) {
            drawable = androidx.core.graphics.drawable.DrawableCompat.wrap(drawable).mutate();
            if (this.getOutputStallDurationlomOqCM) {
                androidx.core.graphics.drawable.DrawableCompat.setTintList(drawable, this.toString);
            }
            if (this.getOutputStallDuration) {
                androidx.core.graphics.drawable.DrawableCompat.setTintMode(drawable, this.isOutputSupportedForhNQ4ISI);
            }
            this.coroutineBoundary = false;
        }
        return drawable;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.getOutputSizes & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setCheckable(boolean z) {
        int i = this.getOutputSizes;
        int i2 = (z ? 1 : 0) | (i & (-2));
        this.getOutputSizes = i2;
        if (i != i2) {
            this.getHighSpeedVideoFpsRanges.onItemsChanged(false);
        }
        return this;
    }

    public final void setExclusiveCheckable(boolean z) {
        this.getOutputSizes = (z ? 4 : 0) | (this.getOutputSizes & (-5));
    }

    public final boolean isExclusiveCheckable() {
        return (this.getOutputSizes & 4) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.getOutputSizes & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setChecked(boolean z) {
        if ((this.getOutputSizes & 4) != 0) {
            this.getHighSpeedVideoFpsRanges.setExclusiveItemChecked(this);
            return this;
        }
        getHighSpeedVideoSizes(z);
        return this;
    }

    final void getHighSpeedVideoSizes(boolean z) {
        int i = this.getOutputSizes;
        int i2 = (z ? 2 : 0) | (i & (-3));
        this.getOutputSizes = i2;
        if (i != i2) {
            this.getHighSpeedVideoFpsRanges.onItemsChanged(false);
        }
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        androidx.core.view.ActionProvider actionProvider = this.getOutputFormats;
        return (actionProvider == null || !actionProvider.overridesItemVisibility()) ? (this.getOutputSizes & 8) == 0 : (this.getOutputSizes & 8) == 0 && this.getOutputFormats.isVisible();
    }

    final boolean getHighSpeedVideoFpsRangesFor(boolean z) {
        int i = this.getOutputSizes;
        int i2 = (z ? 0 : 8) | (i & (-9));
        this.getOutputSizes = i2;
        return i != i2;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setVisible(boolean z) {
        if (getHighSpeedVideoFpsRangesFor(z)) {
            this.getHighSpeedVideoFpsRanges.onItemVisibleChanged(this);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setOnMenuItemClickListener(android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.getInputFormats = onMenuItemClickListener;
        return this;
    }

    public final java.lang.String toString() {
        java.lang.CharSequence charSequence = this._BOUNDARY;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final android.view.ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final void actionFormatChanged() {
        this.getHighSpeedVideoFpsRanges.onItemActionRequestChanged(this);
    }

    public final boolean shouldShowIcon() {
        return this.getHighSpeedVideoFpsRanges.getOptionalIconsVisible();
    }

    public final boolean isActionButton() {
        return (this.getOutputSizes & 32) == 32;
    }

    public final boolean requestsActionButton() {
        return (this.b & 1) == 1;
    }

    @Override // androidx.core.internal.view.SupportMenuItem
    public final boolean requiresActionButton() {
        return (this.b & 2) == 2;
    }

    @Override // androidx.core.internal.view.SupportMenuItem
    public final boolean requiresOverflow() {
        return (requiresActionButton() || requestsActionButton()) ? false : true;
    }

    public final void setIsActionButton(boolean z) {
        if (z) {
            this.getOutputSizes |= 32;
        } else {
            this.getOutputSizes &= -33;
        }
    }

    public final boolean showsTextAsAction() {
        return (this.b & 4) == 4;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            throw new java.lang.IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.b = i;
        this.getHighSpeedVideoFpsRanges.onItemActionRequestChanged(this);
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final androidx.core.internal.view.SupportMenuItem setActionView(android.view.View view) {
        int i;
        this.getOutputMinFrameDuration = view;
        this.getOutputFormats = null;
        if (view != null && view.getId() == -1 && (i = this.isOutputSupportedFor) > 0) {
            view.setId(i);
        }
        this.getHighSpeedVideoFpsRanges.onItemActionRequestChanged(this);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final androidx.core.internal.view.SupportMenuItem setActionView(int i) {
        android.content.Context context = this.getHighSpeedVideoFpsRanges.getContext();
        setActionView(android.view.LayoutInflater.from(context).inflate(i, (android.view.ViewGroup) new android.widget.LinearLayout(context), false));
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final android.view.View getActionView() {
        android.view.View view = this.getOutputMinFrameDuration;
        if (view != null) {
            return view;
        }
        androidx.core.view.ActionProvider actionProvider = this.getOutputFormats;
        if (actionProvider == null) {
            return null;
        }
        android.view.View onCreateActionView = actionProvider.onCreateActionView(this);
        this.getOutputMinFrameDuration = onCreateActionView;
        return onCreateActionView;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setActionProvider(android.view.ActionProvider actionProvider) {
        throw new java.lang.UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final android.view.ActionProvider getActionProvider() {
        throw new java.lang.UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // androidx.core.internal.view.SupportMenuItem
    public final androidx.core.view.ActionProvider getSupportActionProvider() {
        return this.getOutputFormats;
    }

    @Override // androidx.core.internal.view.SupportMenuItem
    public final androidx.core.internal.view.SupportMenuItem setSupportActionProvider(androidx.core.view.ActionProvider actionProvider) {
        androidx.core.view.ActionProvider actionProvider2 = this.getOutputFormats;
        if (actionProvider2 != null) {
            actionProvider2.reset();
        }
        this.getOutputMinFrameDuration = null;
        this.getOutputFormats = actionProvider;
        this.getHighSpeedVideoFpsRanges.onItemsChanged(true);
        androidx.core.view.ActionProvider actionProvider3 = this.getOutputFormats;
        if (actionProvider3 != null) {
            actionProvider3.setVisibilityListener(new androidx.core.view.ActionProvider.VisibilityListener() { // from class: androidx.appcompat.view.menu.MenuItemImpl.1
                @Override // androidx.core.view.ActionProvider.VisibilityListener
                public void onActionProviderVisibilityChanged(boolean z) {
                    androidx.appcompat.view.menu.MenuItemImpl.this.getHighSpeedVideoFpsRanges.onItemVisibleChanged(androidx.appcompat.view.menu.MenuItemImpl.this);
                }
            });
        }
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final androidx.core.internal.view.SupportMenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final boolean expandActionView() {
        if (!hasCollapsibleActionView()) {
            return false;
        }
        android.view.MenuItem.OnActionExpandListener onActionExpandListener = this.CoroutineDebuggingKt;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.getHighSpeedVideoFpsRanges.expandItemActionView(this);
        }
        return false;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.b & 8) == 0) {
            return false;
        }
        if (this.getOutputMinFrameDuration == null) {
            return true;
        }
        android.view.MenuItem.OnActionExpandListener onActionExpandListener = this.CoroutineDebuggingKt;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.getHighSpeedVideoFpsRanges.collapseItemActionView(this);
        }
        return false;
    }

    public final boolean hasCollapsibleActionView() {
        androidx.core.view.ActionProvider actionProvider;
        if ((this.b & 8) == 0) {
            return false;
        }
        if (this.getOutputMinFrameDuration == null && (actionProvider = this.getOutputFormats) != null) {
            this.getOutputMinFrameDuration = actionProvider.onCreateActionView(this);
        }
        return this.getOutputMinFrameDuration != null;
    }

    public final void setActionViewExpanded(boolean z) {
        this.accessartificialFrame = z;
        this.getHighSpeedVideoFpsRanges.onItemsChanged(false);
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.accessartificialFrame;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setOnActionExpandListener(android.view.MenuItem.OnActionExpandListener onActionExpandListener) {
        this.CoroutineDebuggingKt = onActionExpandListener;
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final androidx.core.internal.view.SupportMenuItem setContentDescription(java.lang.CharSequence charSequence) {
        this.getOutputMinFrameDurationlomOqCM = charSequence;
        this.getHighSpeedVideoFpsRanges.onItemsChanged(false);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final java.lang.CharSequence getContentDescription() {
        return this.getOutputMinFrameDurationlomOqCM;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final androidx.core.internal.view.SupportMenuItem setTooltipText(java.lang.CharSequence charSequence) {
        this.AMEXKernel = charSequence;
        this.getHighSpeedVideoFpsRanges.onItemsChanged(false);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final java.lang.CharSequence getTooltipText() {
        return this.AMEXKernel;
    }
}
