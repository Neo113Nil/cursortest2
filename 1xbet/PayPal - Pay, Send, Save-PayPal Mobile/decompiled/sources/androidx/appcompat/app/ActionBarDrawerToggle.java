package androidx.appcompat.app;

/* loaded from: classes5.dex */
public class ActionBarDrawerToggle implements androidx.drawerlayout.widget.DrawerLayout.DrawerListener {
    private final androidx.appcompat.app.ActionBarDrawerToggle.Delegate Camera2StreamConfigurationMap;
    android.view.View.OnClickListener getHighResolutionOutputSizeshNQ4ISI;
    boolean getHighSpeedVideoFpsRanges;
    private final int getHighSpeedVideoFpsRangesFor;
    private final androidx.drawerlayout.widget.DrawerLayout getHighSpeedVideoSizes;
    private android.graphics.drawable.Drawable getHighSpeedVideoSizesFor;
    private boolean getInputFormats;
    private boolean getInputSizeshNQ4ISI;
    private androidx.appcompat.graphics.drawable.DrawerArrowDrawable getOutputFormats;
    private final int getOutputMinFrameDuration;
    private boolean getOutputMinFrameDurationlomOqCM;

    public interface Delegate {
        android.content.Context getActionBarThemedContext();

        android.graphics.drawable.Drawable getThemeUpIndicator();

        boolean isNavigationVisible();

        void setActionBarDescription(int i);

        void setActionBarUpIndicator(android.graphics.drawable.Drawable drawable, int i);
    }

    /* loaded from: classes3.dex */
    public interface DelegateProvider {
        androidx.appcompat.app.ActionBarDrawerToggle.Delegate getDrawerToggleDelegate();
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
    public void onDrawerStateChanged(int i) {
    }

    public ActionBarDrawerToggle(android.app.Activity activity, androidx.drawerlayout.widget.DrawerLayout drawerLayout, int i, int i2) {
        this(activity, (androidx.appcompat.widget.Toolbar) null, drawerLayout, i, i2);
    }

    public ActionBarDrawerToggle(android.app.Activity activity, androidx.drawerlayout.widget.DrawerLayout drawerLayout, androidx.appcompat.widget.Toolbar toolbar, int i, int i2) {
        this(activity, toolbar, drawerLayout, i, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private ActionBarDrawerToggle(android.app.Activity activity, androidx.appcompat.widget.Toolbar toolbar, androidx.drawerlayout.widget.DrawerLayout drawerLayout, int i, int i2) {
        this.getInputFormats = true;
        this.getHighSpeedVideoFpsRanges = true;
        this.getOutputMinFrameDurationlomOqCM = false;
        if (toolbar != null) {
            this.Camera2StreamConfigurationMap = new androidx.appcompat.app.ActionBarDrawerToggle.ToolbarCompatDelegate(toolbar);
            toolbar.setNavigationOnClickListener(new android.view.View.OnClickListener() { // from class: androidx.appcompat.app.ActionBarDrawerToggle.1
                @Override // android.view.View.OnClickListener
                public void onClick(android.view.View view) {
                    if (androidx.appcompat.app.ActionBarDrawerToggle.this.getHighSpeedVideoFpsRanges) {
                        androidx.appcompat.app.ActionBarDrawerToggle.this.Camera2StreamConfigurationMap();
                    } else if (androidx.appcompat.app.ActionBarDrawerToggle.this.getHighResolutionOutputSizeshNQ4ISI != null) {
                        androidx.appcompat.app.ActionBarDrawerToggle.this.getHighResolutionOutputSizeshNQ4ISI.onClick(view);
                    }
                }
            });
        } else if (activity instanceof androidx.appcompat.app.ActionBarDrawerToggle.DelegateProvider) {
            this.Camera2StreamConfigurationMap = ((androidx.appcompat.app.ActionBarDrawerToggle.DelegateProvider) activity).getDrawerToggleDelegate();
        } else {
            this.Camera2StreamConfigurationMap = new androidx.appcompat.app.ActionBarDrawerToggle.FrameworkActionBarDelegate(activity);
        }
        this.getHighSpeedVideoSizes = drawerLayout;
        this.getOutputMinFrameDuration = i;
        this.getHighSpeedVideoFpsRangesFor = i2;
        this.getOutputFormats = new androidx.appcompat.graphics.drawable.DrawerArrowDrawable(this.Camera2StreamConfigurationMap.getActionBarThemedContext());
        this.getHighSpeedVideoSizesFor = this.Camera2StreamConfigurationMap.getThemeUpIndicator();
    }

    public void syncState() {
        if (this.getHighSpeedVideoSizes.isDrawerOpen(androidx.core.view.GravityCompat.START)) {
            getHighSpeedVideoFpsRanges(1.0f);
        } else {
            getHighSpeedVideoFpsRanges(0.0f);
        }
        if (this.getHighSpeedVideoFpsRanges) {
            getHighResolutionOutputSizeshNQ4ISI(this.getOutputFormats, this.getHighSpeedVideoSizes.isDrawerOpen(androidx.core.view.GravityCompat.START) ? this.getHighSpeedVideoFpsRangesFor : this.getOutputMinFrameDuration);
        }
    }

    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        if (!this.getInputSizeshNQ4ISI) {
            this.getHighSpeedVideoSizesFor = this.Camera2StreamConfigurationMap.getThemeUpIndicator();
        }
        syncState();
    }

    public boolean onOptionsItemSelected(android.view.MenuItem menuItem) {
        if (menuItem == null || menuItem.getItemId() != 16908332 || !this.getHighSpeedVideoFpsRanges) {
            return false;
        }
        Camera2StreamConfigurationMap();
        return true;
    }

    final void Camera2StreamConfigurationMap() {
        int drawerLockMode = this.getHighSpeedVideoSizes.getDrawerLockMode(androidx.core.view.GravityCompat.START);
        if (this.getHighSpeedVideoSizes.isDrawerVisible(androidx.core.view.GravityCompat.START) && drawerLockMode != 2) {
            this.getHighSpeedVideoSizes.closeDrawer(androidx.core.view.GravityCompat.START);
        } else if (drawerLockMode != 1) {
            this.getHighSpeedVideoSizes.openDrawer(androidx.core.view.GravityCompat.START);
        }
    }

    public void setHomeAsUpIndicator(int i) {
        setHomeAsUpIndicator(i != 0 ? this.getHighSpeedVideoSizes.getResources().getDrawable(i) : null);
    }

    public boolean isDrawerIndicatorEnabled() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public void setDrawerIndicatorEnabled(boolean z) {
        if (z != this.getHighSpeedVideoFpsRanges) {
            if (z) {
                getHighResolutionOutputSizeshNQ4ISI(this.getOutputFormats, this.getHighSpeedVideoSizes.isDrawerOpen(androidx.core.view.GravityCompat.START) ? this.getHighSpeedVideoFpsRangesFor : this.getOutputMinFrameDuration);
            } else {
                getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoSizesFor, 0);
            }
            this.getHighSpeedVideoFpsRanges = z;
        }
    }

    public androidx.appcompat.graphics.drawable.DrawerArrowDrawable getDrawerArrowDrawable() {
        return this.getOutputFormats;
    }

    public void setDrawerArrowDrawable(androidx.appcompat.graphics.drawable.DrawerArrowDrawable drawerArrowDrawable) {
        this.getOutputFormats = drawerArrowDrawable;
        syncState();
    }

    public void setDrawerSlideAnimationEnabled(boolean z) {
        this.getInputFormats = z;
        if (z) {
            return;
        }
        getHighSpeedVideoFpsRanges(0.0f);
    }

    public boolean isDrawerSlideAnimationEnabled() {
        return this.getInputFormats;
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
    public void onDrawerSlide(android.view.View view, float f) {
        if (this.getInputFormats) {
            getHighSpeedVideoFpsRanges(java.lang.Math.min(1.0f, java.lang.Math.max(0.0f, f)));
        } else {
            getHighSpeedVideoFpsRanges(0.0f);
        }
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
    public void onDrawerOpened(android.view.View view) {
        getHighSpeedVideoFpsRanges(1.0f);
        if (this.getHighSpeedVideoFpsRanges) {
            this.Camera2StreamConfigurationMap.setActionBarDescription(this.getHighSpeedVideoFpsRangesFor);
        }
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
    public void onDrawerClosed(android.view.View view) {
        getHighSpeedVideoFpsRanges(0.0f);
        if (this.getHighSpeedVideoFpsRanges) {
            this.Camera2StreamConfigurationMap.setActionBarDescription(this.getOutputMinFrameDuration);
        }
    }

    public android.view.View.OnClickListener getToolbarNavigationClickListener() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public void setToolbarNavigationClickListener(android.view.View.OnClickListener onClickListener) {
        this.getHighResolutionOutputSizeshNQ4ISI = onClickListener;
    }

    private void getHighResolutionOutputSizeshNQ4ISI(android.graphics.drawable.Drawable drawable, int i) {
        if (!this.getOutputMinFrameDurationlomOqCM && !this.Camera2StreamConfigurationMap.isNavigationVisible()) {
            this.getOutputMinFrameDurationlomOqCM = true;
        }
        this.Camera2StreamConfigurationMap.setActionBarUpIndicator(drawable, i);
    }

    private void getHighSpeedVideoFpsRanges(float f) {
        if (f == 1.0f) {
            this.getOutputFormats.setVerticalMirror(true);
        } else if (f == 0.0f) {
            this.getOutputFormats.setVerticalMirror(false);
        }
        this.getOutputFormats.setProgress(f);
    }

    static class FrameworkActionBarDelegate implements androidx.appcompat.app.ActionBarDrawerToggle.Delegate {
        private final android.app.Activity getHighSpeedVideoSizes;

        FrameworkActionBarDelegate(android.app.Activity activity) {
            this.getHighSpeedVideoSizes = activity;
        }

        @Override // androidx.appcompat.app.ActionBarDrawerToggle.Delegate
        public android.graphics.drawable.Drawable getThemeUpIndicator() {
            android.content.res.TypedArray obtainStyledAttributes = getActionBarThemedContext().obtainStyledAttributes(null, new int[]{android.R.attr.homeAsUpIndicator}, android.R.attr.actionBarStyle, 0);
            android.graphics.drawable.Drawable drawable = obtainStyledAttributes.getDrawable(0);
            obtainStyledAttributes.recycle();
            return drawable;
        }

        @Override // androidx.appcompat.app.ActionBarDrawerToggle.Delegate
        public android.content.Context getActionBarThemedContext() {
            android.app.ActionBar actionBar = this.getHighSpeedVideoSizes.getActionBar();
            if (actionBar != null) {
                return actionBar.getThemedContext();
            }
            return this.getHighSpeedVideoSizes;
        }

        @Override // androidx.appcompat.app.ActionBarDrawerToggle.Delegate
        public boolean isNavigationVisible() {
            android.app.ActionBar actionBar = this.getHighSpeedVideoSizes.getActionBar();
            return (actionBar == null || (actionBar.getDisplayOptions() & 4) == 0) ? false : true;
        }

        @Override // androidx.appcompat.app.ActionBarDrawerToggle.Delegate
        public void setActionBarUpIndicator(android.graphics.drawable.Drawable drawable, int i) {
            android.app.ActionBar actionBar = this.getHighSpeedVideoSizes.getActionBar();
            if (actionBar != null) {
                actionBar.setHomeAsUpIndicator(drawable);
                actionBar.setHomeActionContentDescription(i);
            }
        }

        @Override // androidx.appcompat.app.ActionBarDrawerToggle.Delegate
        public void setActionBarDescription(int i) {
            android.app.ActionBar actionBar = this.getHighSpeedVideoSizes.getActionBar();
            if (actionBar != null) {
                actionBar.setHomeActionContentDescription(i);
            }
        }
    }

    static class ToolbarCompatDelegate implements androidx.appcompat.app.ActionBarDrawerToggle.Delegate {
        final androidx.appcompat.widget.Toolbar getHighResolutionOutputSizeshNQ4ISI;
        final android.graphics.drawable.Drawable getHighSpeedVideoFpsRangesFor;
        final java.lang.CharSequence getHighSpeedVideoSizes;

        @Override // androidx.appcompat.app.ActionBarDrawerToggle.Delegate
        public boolean isNavigationVisible() {
            return true;
        }

        ToolbarCompatDelegate(androidx.appcompat.widget.Toolbar toolbar) {
            this.getHighResolutionOutputSizeshNQ4ISI = toolbar;
            this.getHighSpeedVideoFpsRangesFor = toolbar.getNavigationIcon();
            this.getHighSpeedVideoSizes = toolbar.getNavigationContentDescription();
        }

        @Override // androidx.appcompat.app.ActionBarDrawerToggle.Delegate
        public void setActionBarUpIndicator(android.graphics.drawable.Drawable drawable, int i) {
            this.getHighResolutionOutputSizeshNQ4ISI.setNavigationIcon(drawable);
            setActionBarDescription(i);
        }

        @Override // androidx.appcompat.app.ActionBarDrawerToggle.Delegate
        public void setActionBarDescription(int i) {
            if (i == 0) {
                this.getHighResolutionOutputSizeshNQ4ISI.setNavigationContentDescription(this.getHighSpeedVideoSizes);
            } else {
                this.getHighResolutionOutputSizeshNQ4ISI.setNavigationContentDescription(i);
            }
        }

        @Override // androidx.appcompat.app.ActionBarDrawerToggle.Delegate
        public android.graphics.drawable.Drawable getThemeUpIndicator() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        @Override // androidx.appcompat.app.ActionBarDrawerToggle.Delegate
        public android.content.Context getActionBarThemedContext() {
            return this.getHighResolutionOutputSizeshNQ4ISI.getContext();
        }
    }

    public void setHomeAsUpIndicator(android.graphics.drawable.Drawable drawable) {
        if (drawable == null) {
            this.getHighSpeedVideoSizesFor = this.Camera2StreamConfigurationMap.getThemeUpIndicator();
            this.getInputSizeshNQ4ISI = false;
        } else {
            this.getHighSpeedVideoSizesFor = drawable;
            this.getInputSizeshNQ4ISI = true;
        }
        if (this.getHighSpeedVideoFpsRanges) {
            return;
        }
        getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoSizesFor, 0);
    }
}
