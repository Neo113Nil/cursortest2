package androidx.appcompat.view.menu;

/* loaded from: classes3.dex */
public class ActionMenuItem implements androidx.core.internal.view.SupportMenuItem {
    private java.lang.CharSequence getHighResolutionOutputSizeshNQ4ISI;
    private final int getHighSpeedVideoFpsRanges;
    private android.view.MenuItem.OnMenuItemClickListener getHighSpeedVideoFpsRangesFor;
    private android.content.Context getHighSpeedVideoSizes;
    private android.graphics.drawable.Drawable getHighSpeedVideoSizesFor;
    private android.content.Intent getOutputSizes;
    private char getOutputSizeshNQ4ISI;
    private final int getOutputStallDuration;
    private final int getOutputStallDurationlomOqCM;
    private java.lang.CharSequence getValidOutputFormatsForInputhNQ4ISI;
    private char isOutputSupportedForhNQ4ISI;
    private java.lang.CharSequence toString;
    private java.lang.CharSequence unwrapAs;
    private int isOutputSupportedFor = 4096;
    private int getOutputMinFrameDurationlomOqCM = 4096;
    private android.content.res.ColorStateList getOutputFormats = null;
    private android.graphics.PorterDuff.Mode getInputFormats = null;
    private boolean getOutputMinFrameDuration = false;
    private boolean getInputSizeshNQ4ISI = false;
    private int Camera2StreamConfigurationMap = 16;

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public boolean collapseActionView() {
        return false;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public boolean expandActionView() {
        return false;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public android.view.View getActionView() {
        return null;
    }

    @Override // android.view.MenuItem
    public android.view.ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // android.view.MenuItem
    public android.view.SubMenu getSubMenu() {
        return null;
    }

    @Override // androidx.core.internal.view.SupportMenuItem
    public androidx.core.view.ActionProvider getSupportActionProvider() {
        return null;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return false;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return false;
    }

    @Override // androidx.core.internal.view.SupportMenuItem
    public boolean requiresActionButton() {
        return true;
    }

    @Override // androidx.core.internal.view.SupportMenuItem
    public boolean requiresOverflow() {
        return false;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public void setShowAsAction(int i) {
    }

    public ActionMenuItem(android.content.Context context, int i, int i2, int i3, int i4, java.lang.CharSequence charSequence) {
        this.getHighSpeedVideoSizes = context;
        this.getOutputStallDuration = i2;
        this.getHighSpeedVideoFpsRanges = i;
        this.getOutputStallDurationlomOqCM = i4;
        this.toString = charSequence;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.getOutputSizeshNQ4ISI;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.getOutputMinFrameDurationlomOqCM;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // android.view.MenuItem
    public android.graphics.drawable.Drawable getIcon() {
        return this.getHighSpeedVideoSizesFor;
    }

    @Override // android.view.MenuItem
    public android.content.Intent getIntent() {
        return this.getOutputSizes;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.getOutputStallDuration;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.isOutputSupportedForhNQ4ISI;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public int getNumericModifiers() {
        return this.isOutputSupportedFor;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.getOutputStallDurationlomOqCM;
    }

    @Override // android.view.MenuItem
    public java.lang.CharSequence getTitle() {
        return this.toString;
    }

    @Override // android.view.MenuItem
    public java.lang.CharSequence getTitleCondensed() {
        java.lang.CharSequence charSequence = this.unwrapAs;
        return charSequence != null ? charSequence : this.toString;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.Camera2StreamConfigurationMap & 1) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.Camera2StreamConfigurationMap & 2) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.Camera2StreamConfigurationMap & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return (this.Camera2StreamConfigurationMap & 8) == 0;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setAlphabeticShortcut(char c) {
        this.getOutputSizeshNQ4ISI = java.lang.Character.toLowerCase(c);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public android.view.MenuItem setAlphabeticShortcut(char c, int i) {
        this.getOutputSizeshNQ4ISI = java.lang.Character.toLowerCase(c);
        this.getOutputMinFrameDurationlomOqCM = android.view.KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setCheckable(boolean z) {
        this.Camera2StreamConfigurationMap = (z ? 1 : 0) | (this.Camera2StreamConfigurationMap & (-2));
        return this;
    }

    public androidx.appcompat.view.menu.ActionMenuItem setExclusiveCheckable(boolean z) {
        this.Camera2StreamConfigurationMap = (z ? 4 : 0) | (this.Camera2StreamConfigurationMap & (-5));
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setChecked(boolean z) {
        this.Camera2StreamConfigurationMap = (z ? 2 : 0) | (this.Camera2StreamConfigurationMap & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setEnabled(boolean z) {
        this.Camera2StreamConfigurationMap = (z ? 16 : 0) | (this.Camera2StreamConfigurationMap & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setIcon(android.graphics.drawable.Drawable drawable) {
        this.getHighSpeedVideoSizesFor = drawable;
        getHighSpeedVideoFpsRangesFor();
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setIcon(int i) {
        this.getHighSpeedVideoSizesFor = androidx.core.content.ContextCompat.getDrawable(this.getHighSpeedVideoSizes, i);
        getHighSpeedVideoFpsRangesFor();
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setIntent(android.content.Intent intent) {
        this.getOutputSizes = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setNumericShortcut(char c) {
        this.isOutputSupportedForhNQ4ISI = c;
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public android.view.MenuItem setNumericShortcut(char c, int i) {
        this.isOutputSupportedForhNQ4ISI = c;
        this.isOutputSupportedFor = android.view.KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setOnMenuItemClickListener(android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.getHighSpeedVideoFpsRangesFor = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setShortcut(char c, char c2) {
        this.isOutputSupportedForhNQ4ISI = c;
        this.getOutputSizeshNQ4ISI = java.lang.Character.toLowerCase(c2);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public android.view.MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.isOutputSupportedForhNQ4ISI = c;
        this.isOutputSupportedFor = android.view.KeyEvent.normalizeMetaState(i);
        this.getOutputSizeshNQ4ISI = java.lang.Character.toLowerCase(c2);
        this.getOutputMinFrameDurationlomOqCM = android.view.KeyEvent.normalizeMetaState(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setTitle(java.lang.CharSequence charSequence) {
        this.toString = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setTitle(int i) {
        this.toString = this.getHighSpeedVideoSizes.getResources().getString(i);
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setTitleCondensed(java.lang.CharSequence charSequence) {
        this.unwrapAs = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setVisible(boolean z) {
        this.Camera2StreamConfigurationMap = (z ? 0 : 8) | (this.Camera2StreamConfigurationMap & 8);
        return this;
    }

    public boolean invoke() {
        android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.getHighSpeedVideoFpsRangesFor;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        android.content.Intent intent = this.getOutputSizes;
        if (intent == null) {
            return false;
        }
        this.getHighSpeedVideoSizes.startActivity(intent);
        return true;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public androidx.core.internal.view.SupportMenuItem setActionView(android.view.View view) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setActionProvider(android.view.ActionProvider actionProvider) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public android.view.ActionProvider getActionProvider() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public androidx.core.internal.view.SupportMenuItem setActionView(int i) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // androidx.core.internal.view.SupportMenuItem
    public androidx.core.internal.view.SupportMenuItem setSupportActionProvider(androidx.core.view.ActionProvider actionProvider) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public androidx.core.internal.view.SupportMenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setOnActionExpandListener(android.view.MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public androidx.core.internal.view.SupportMenuItem setContentDescription(java.lang.CharSequence charSequence) {
        this.getHighResolutionOutputSizeshNQ4ISI = charSequence;
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public java.lang.CharSequence getContentDescription() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public androidx.core.internal.view.SupportMenuItem setTooltipText(java.lang.CharSequence charSequence) {
        this.getValidOutputFormatsForInputhNQ4ISI = charSequence;
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public java.lang.CharSequence getTooltipText() {
        return this.getValidOutputFormatsForInputhNQ4ISI;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public android.view.MenuItem setIconTintList(android.content.res.ColorStateList colorStateList) {
        this.getOutputFormats = colorStateList;
        this.getOutputMinFrameDuration = true;
        getHighSpeedVideoFpsRangesFor();
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public android.content.res.ColorStateList getIconTintList() {
        return this.getOutputFormats;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public android.view.MenuItem setIconTintMode(android.graphics.PorterDuff.Mode mode) {
        this.getInputFormats = mode;
        this.getInputSizeshNQ4ISI = true;
        getHighSpeedVideoFpsRangesFor();
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public android.graphics.PorterDuff.Mode getIconTintMode() {
        return this.getInputFormats;
    }

    private void getHighSpeedVideoFpsRangesFor() {
        android.graphics.drawable.Drawable drawable = this.getHighSpeedVideoSizesFor;
        if (drawable != null) {
            if (this.getOutputMinFrameDuration || this.getInputSizeshNQ4ISI) {
                android.graphics.drawable.Drawable wrap = androidx.core.graphics.drawable.DrawableCompat.wrap(drawable);
                this.getHighSpeedVideoSizesFor = wrap;
                android.graphics.drawable.Drawable mutate = wrap.mutate();
                this.getHighSpeedVideoSizesFor = mutate;
                if (this.getOutputMinFrameDuration) {
                    androidx.core.graphics.drawable.DrawableCompat.setTintList(mutate, this.getOutputFormats);
                }
                if (this.getInputSizeshNQ4ISI) {
                    androidx.core.graphics.drawable.DrawableCompat.setTintMode(this.getHighSpeedVideoSizesFor, this.getInputFormats);
                }
            }
        }
    }
}
