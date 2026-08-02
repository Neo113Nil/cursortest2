package androidx.appcompat.view;

/* loaded from: classes3.dex */
public class StandaloneActionMode extends androidx.appcompat.view.ActionMode implements androidx.appcompat.view.menu.MenuBuilder.Callback {
    private androidx.appcompat.view.ActionMode.Callback Camera2StreamConfigurationMap;
    private boolean getHighResolutionOutputSizeshNQ4ISI;
    private android.content.Context getHighSpeedVideoFpsRanges;
    private androidx.appcompat.widget.ActionBarContextView getHighSpeedVideoFpsRangesFor;
    private java.lang.ref.WeakReference<android.view.View> getHighSpeedVideoSizes;
    private androidx.appcompat.view.menu.MenuBuilder getInputSizeshNQ4ISI;
    private boolean getOutputMinFrameDuration;

    public void onCloseMenu(androidx.appcompat.view.menu.MenuBuilder menuBuilder, boolean z) {
    }

    public void onCloseSubMenu(androidx.appcompat.view.menu.SubMenuBuilder subMenuBuilder) {
    }

    public StandaloneActionMode(android.content.Context context, androidx.appcompat.widget.ActionBarContextView actionBarContextView, androidx.appcompat.view.ActionMode.Callback callback, boolean z) {
        this.getHighSpeedVideoFpsRanges = context;
        this.getHighSpeedVideoFpsRangesFor = actionBarContextView;
        this.Camera2StreamConfigurationMap = callback;
        androidx.appcompat.view.menu.MenuBuilder defaultShowAsAction = new androidx.appcompat.view.menu.MenuBuilder(actionBarContextView.getContext()).setDefaultShowAsAction(1);
        this.getInputSizeshNQ4ISI = defaultShowAsAction;
        defaultShowAsAction.setCallback(this);
        this.getOutputMinFrameDuration = z;
    }

    @Override // androidx.appcompat.view.ActionMode
    public void setTitle(java.lang.CharSequence charSequence) {
        this.getHighSpeedVideoFpsRangesFor.setTitle(charSequence);
    }

    @Override // androidx.appcompat.view.ActionMode
    public void setSubtitle(java.lang.CharSequence charSequence) {
        this.getHighSpeedVideoFpsRangesFor.setSubtitle(charSequence);
    }

    @Override // androidx.appcompat.view.ActionMode
    public void setTitle(int i) {
        setTitle(this.getHighSpeedVideoFpsRanges.getString(i));
    }

    @Override // androidx.appcompat.view.ActionMode
    public void setSubtitle(int i) {
        setSubtitle(this.getHighSpeedVideoFpsRanges.getString(i));
    }

    @Override // androidx.appcompat.view.ActionMode
    public void setTitleOptionalHint(boolean z) {
        super.setTitleOptionalHint(z);
        this.getHighSpeedVideoFpsRangesFor.setTitleOptional(z);
    }

    @Override // androidx.appcompat.view.ActionMode
    public boolean isTitleOptional() {
        return this.getHighSpeedVideoFpsRangesFor.isTitleOptional();
    }

    @Override // androidx.appcompat.view.ActionMode
    public void setCustomView(android.view.View view) {
        this.getHighSpeedVideoFpsRangesFor.setCustomView(view);
        this.getHighSpeedVideoSizes = view != null ? new java.lang.ref.WeakReference<>(view) : null;
    }

    @Override // androidx.appcompat.view.ActionMode
    public void invalidate() {
        this.Camera2StreamConfigurationMap.onPrepareActionMode(this, this.getInputSizeshNQ4ISI);
    }

    @Override // androidx.appcompat.view.ActionMode
    public void finish() {
        if (this.getHighResolutionOutputSizeshNQ4ISI) {
            return;
        }
        this.getHighResolutionOutputSizeshNQ4ISI = true;
        this.Camera2StreamConfigurationMap.onDestroyActionMode(this);
    }

    @Override // androidx.appcompat.view.ActionMode
    public android.view.Menu getMenu() {
        return this.getInputSizeshNQ4ISI;
    }

    @Override // androidx.appcompat.view.ActionMode
    public java.lang.CharSequence getTitle() {
        return this.getHighSpeedVideoFpsRangesFor.getTitle();
    }

    @Override // androidx.appcompat.view.ActionMode
    public java.lang.CharSequence getSubtitle() {
        return this.getHighSpeedVideoFpsRangesFor.getSubtitle();
    }

    @Override // androidx.appcompat.view.ActionMode
    public android.view.View getCustomView() {
        java.lang.ref.WeakReference<android.view.View> weakReference = this.getHighSpeedVideoSizes;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // androidx.appcompat.view.ActionMode
    public android.view.MenuInflater getMenuInflater() {
        return new androidx.appcompat.view.SupportMenuInflater(this.getHighSpeedVideoFpsRangesFor.getContext());
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
    public boolean onMenuItemSelected(androidx.appcompat.view.menu.MenuBuilder menuBuilder, android.view.MenuItem menuItem) {
        return this.Camera2StreamConfigurationMap.onActionItemClicked(this, menuItem);
    }

    public boolean onSubMenuSelected(androidx.appcompat.view.menu.SubMenuBuilder subMenuBuilder) {
        if (!subMenuBuilder.hasVisibleItems()) {
            return true;
        }
        new androidx.appcompat.view.menu.MenuPopupHelper(this.getHighSpeedVideoFpsRangesFor.getContext(), subMenuBuilder).show();
        return true;
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
    public void onMenuModeChange(androidx.appcompat.view.menu.MenuBuilder menuBuilder) {
        invalidate();
        this.getHighSpeedVideoFpsRangesFor.showOverflowMenu();
    }

    @Override // androidx.appcompat.view.ActionMode
    public boolean isUiFocusable() {
        return this.getOutputMinFrameDuration;
    }
}
