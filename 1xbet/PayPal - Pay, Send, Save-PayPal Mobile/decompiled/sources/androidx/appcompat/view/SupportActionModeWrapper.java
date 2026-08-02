package androidx.appcompat.view;

/* loaded from: classes3.dex */
public class SupportActionModeWrapper extends android.view.ActionMode {
    final android.content.Context getHighSpeedVideoFpsRanges;
    final androidx.appcompat.view.ActionMode getHighSpeedVideoFpsRangesFor;

    public SupportActionModeWrapper(android.content.Context context, androidx.appcompat.view.ActionMode actionMode) {
        this.getHighSpeedVideoFpsRanges = context;
        this.getHighSpeedVideoFpsRangesFor = actionMode;
    }

    @Override // android.view.ActionMode
    public java.lang.Object getTag() {
        return this.getHighSpeedVideoFpsRangesFor.getTag();
    }

    @Override // android.view.ActionMode
    public void setTag(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor.setTag(obj);
    }

    @Override // android.view.ActionMode
    public void setTitle(java.lang.CharSequence charSequence) {
        this.getHighSpeedVideoFpsRangesFor.setTitle(charSequence);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(java.lang.CharSequence charSequence) {
        this.getHighSpeedVideoFpsRangesFor.setSubtitle(charSequence);
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.getHighSpeedVideoFpsRangesFor.invalidate();
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.getHighSpeedVideoFpsRangesFor.finish();
    }

    @Override // android.view.ActionMode
    public android.view.Menu getMenu() {
        return new androidx.appcompat.view.menu.MenuWrapperICS(this.getHighSpeedVideoFpsRanges, (androidx.core.internal.view.SupportMenu) this.getHighSpeedVideoFpsRangesFor.getMenu());
    }

    @Override // android.view.ActionMode
    public java.lang.CharSequence getTitle() {
        return this.getHighSpeedVideoFpsRangesFor.getTitle();
    }

    @Override // android.view.ActionMode
    public void setTitle(int i) {
        this.getHighSpeedVideoFpsRangesFor.setTitle(i);
    }

    @Override // android.view.ActionMode
    public java.lang.CharSequence getSubtitle() {
        return this.getHighSpeedVideoFpsRangesFor.getSubtitle();
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i) {
        this.getHighSpeedVideoFpsRangesFor.setSubtitle(i);
    }

    @Override // android.view.ActionMode
    public android.view.View getCustomView() {
        return this.getHighSpeedVideoFpsRangesFor.getCustomView();
    }

    @Override // android.view.ActionMode
    public void setCustomView(android.view.View view) {
        this.getHighSpeedVideoFpsRangesFor.setCustomView(view);
    }

    @Override // android.view.ActionMode
    public android.view.MenuInflater getMenuInflater() {
        return this.getHighSpeedVideoFpsRangesFor.getMenuInflater();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.getHighSpeedVideoFpsRangesFor.getTitleOptionalHint();
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z) {
        this.getHighSpeedVideoFpsRangesFor.setTitleOptionalHint(z);
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.getHighSpeedVideoFpsRangesFor.isTitleOptional();
    }

    public static class CallbackWrapper implements androidx.appcompat.view.ActionMode.Callback {
        final android.view.ActionMode.Callback Camera2StreamConfigurationMap;
        final android.content.Context getHighSpeedVideoFpsRanges;
        final java.util.ArrayList<androidx.appcompat.view.SupportActionModeWrapper> getHighResolutionOutputSizeshNQ4ISI = new java.util.ArrayList<>();
        final androidx.collection.SimpleArrayMap<android.view.Menu, android.view.Menu> getHighSpeedVideoSizes = new androidx.collection.SimpleArrayMap<>();

        public CallbackWrapper(android.content.Context context, android.view.ActionMode.Callback callback) {
            this.getHighSpeedVideoFpsRanges = context;
            this.Camera2StreamConfigurationMap = callback;
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        public boolean onCreateActionMode(androidx.appcompat.view.ActionMode actionMode, android.view.Menu menu) {
            return this.Camera2StreamConfigurationMap.onCreateActionMode(getActionModeWrapper(actionMode), getHighResolutionOutputSizeshNQ4ISI(menu));
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        public boolean onPrepareActionMode(androidx.appcompat.view.ActionMode actionMode, android.view.Menu menu) {
            return this.Camera2StreamConfigurationMap.onPrepareActionMode(getActionModeWrapper(actionMode), getHighResolutionOutputSizeshNQ4ISI(menu));
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        public boolean onActionItemClicked(androidx.appcompat.view.ActionMode actionMode, android.view.MenuItem menuItem) {
            return this.Camera2StreamConfigurationMap.onActionItemClicked(getActionModeWrapper(actionMode), new androidx.appcompat.view.menu.MenuItemWrapperICS(this.getHighSpeedVideoFpsRanges, (androidx.core.internal.view.SupportMenuItem) menuItem));
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        public void onDestroyActionMode(androidx.appcompat.view.ActionMode actionMode) {
            this.Camera2StreamConfigurationMap.onDestroyActionMode(getActionModeWrapper(actionMode));
        }

        private android.view.Menu getHighResolutionOutputSizeshNQ4ISI(android.view.Menu menu) {
            android.view.Menu menu2 = this.getHighSpeedVideoSizes.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            androidx.appcompat.view.menu.MenuWrapperICS menuWrapperICS = new androidx.appcompat.view.menu.MenuWrapperICS(this.getHighSpeedVideoFpsRanges, (androidx.core.internal.view.SupportMenu) menu);
            this.getHighSpeedVideoSizes.put(menu, menuWrapperICS);
            return menuWrapperICS;
        }

        public android.view.ActionMode getActionModeWrapper(androidx.appcompat.view.ActionMode actionMode) {
            int size = this.getHighResolutionOutputSizeshNQ4ISI.size();
            for (int i = 0; i < size; i++) {
                androidx.appcompat.view.SupportActionModeWrapper supportActionModeWrapper = this.getHighResolutionOutputSizeshNQ4ISI.get(i);
                if (supportActionModeWrapper != null && supportActionModeWrapper.getHighSpeedVideoFpsRangesFor == actionMode) {
                    return supportActionModeWrapper;
                }
            }
            androidx.appcompat.view.SupportActionModeWrapper supportActionModeWrapper2 = new androidx.appcompat.view.SupportActionModeWrapper(this.getHighSpeedVideoFpsRanges, actionMode);
            this.getHighResolutionOutputSizeshNQ4ISI.add(supportActionModeWrapper2);
            return supportActionModeWrapper2;
        }
    }
}
