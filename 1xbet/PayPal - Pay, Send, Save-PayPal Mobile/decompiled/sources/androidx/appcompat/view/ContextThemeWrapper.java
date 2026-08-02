package androidx.appcompat.view;

/* loaded from: classes3.dex */
public class ContextThemeWrapper extends android.content.ContextWrapper {
    private static android.content.res.Configuration getHighSpeedVideoSizes;
    private android.content.res.Configuration Camera2StreamConfigurationMap;
    private android.content.res.Resources getHighResolutionOutputSizeshNQ4ISI;
    private android.view.LayoutInflater getHighSpeedVideoFpsRanges;
    private android.content.res.Resources.Theme getHighSpeedVideoFpsRangesFor;
    private int getHighSpeedVideoSizesFor;

    public ContextThemeWrapper() {
        super(null);
    }

    public ContextThemeWrapper(android.content.Context context, int i) {
        super(context);
        this.getHighSpeedVideoSizesFor = i;
    }

    public ContextThemeWrapper(android.content.Context context, android.content.res.Resources.Theme theme) {
        super(context);
        this.getHighSpeedVideoFpsRangesFor = theme;
    }

    @Override // android.content.ContextWrapper
    protected void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    public void applyOverrideConfiguration(android.content.res.Configuration configuration) {
        if (this.getHighResolutionOutputSizeshNQ4ISI != null) {
            throw new java.lang.IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.Camera2StreamConfigurationMap != null) {
            throw new java.lang.IllegalStateException("Override configuration has already been set");
        }
        this.Camera2StreamConfigurationMap = new android.content.res.Configuration(configuration);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public android.content.res.Resources getResources() {
        return getHighSpeedVideoFpsRangesFor();
    }

    private android.content.res.Resources getHighSpeedVideoFpsRangesFor() {
        if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
            android.content.res.Configuration configuration = this.Camera2StreamConfigurationMap;
            if (configuration != null && configuration != null) {
                if (getHighSpeedVideoSizes == null) {
                    android.content.res.Configuration configuration2 = new android.content.res.Configuration();
                    configuration2.fontScale = 0.0f;
                    getHighSpeedVideoSizes = configuration2;
                }
                if (!configuration.equals(getHighSpeedVideoSizes)) {
                    this.getHighResolutionOutputSizeshNQ4ISI = createConfigurationContext(this.Camera2StreamConfigurationMap).getResources();
                }
            }
            this.getHighResolutionOutputSizeshNQ4ISI = super.getResources();
        }
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        if (this.getHighSpeedVideoSizesFor != i) {
            this.getHighSpeedVideoSizesFor = i;
            getHighSpeedVideoFpsRanges();
        }
    }

    public int getThemeResId() {
        return this.getHighSpeedVideoSizesFor;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public android.content.res.Resources.Theme getTheme() {
        android.content.res.Resources.Theme theme = this.getHighSpeedVideoFpsRangesFor;
        if (theme != null) {
            return theme;
        }
        if (this.getHighSpeedVideoSizesFor == 0) {
            this.getHighSpeedVideoSizesFor = androidx.appcompat.R.style.Theme_AppCompat_Light;
        }
        getHighSpeedVideoFpsRanges();
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public java.lang.Object getSystemService(java.lang.String str) {
        if ("layout_inflater".equals(str)) {
            if (this.getHighSpeedVideoFpsRanges == null) {
                this.getHighSpeedVideoFpsRanges = android.view.LayoutInflater.from(getBaseContext()).cloneInContext(this);
            }
            return this.getHighSpeedVideoFpsRanges;
        }
        return getBaseContext().getSystemService(str);
    }

    protected void onApplyThemeResource(android.content.res.Resources.Theme theme, int i, boolean z) {
        theme.applyStyle(i, true);
    }

    private void getHighSpeedVideoFpsRanges() {
        boolean z = this.getHighSpeedVideoFpsRangesFor == null;
        if (z) {
            this.getHighSpeedVideoFpsRangesFor = getResources().newTheme();
            android.content.res.Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.getHighSpeedVideoFpsRangesFor.setTo(theme);
            }
        }
        onApplyThemeResource(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizesFor, z);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public android.content.res.AssetManager getAssets() {
        return getResources().getAssets();
    }
}
