package androidx.appcompat.view;

/* loaded from: classes3.dex */
public class ActionBarPolicy {
    private android.content.Context getHighResolutionOutputSizeshNQ4ISI;

    public boolean showsOverflowMenuButton() {
        return true;
    }

    public static androidx.appcompat.view.ActionBarPolicy get(android.content.Context context) {
        return new androidx.appcompat.view.ActionBarPolicy(context);
    }

    private ActionBarPolicy(android.content.Context context) {
        this.getHighResolutionOutputSizeshNQ4ISI = context;
    }

    public int getMaxActionButtons() {
        android.content.res.Configuration configuration = this.getHighResolutionOutputSizeshNQ4ISI.getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i > 600) {
            return 5;
        }
        if (i > 960 && i2 > 720) {
            return 5;
        }
        if (i > 720 && i2 > 960) {
            return 5;
        }
        if (i >= 500) {
            return 4;
        }
        if (i > 640 && i2 > 480) {
            return 4;
        }
        if (i <= 480 || i2 <= 640) {
            return i >= 360 ? 3 : 2;
        }
        return 4;
    }

    public int getEmbeddedMenuWidthLimit() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getResources().getDisplayMetrics().widthPixels / 2;
    }

    public boolean hasEmbeddedTabs() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getResources().getBoolean(androidx.appcompat.R.bool.abc_action_bar_embed_tabs);
    }

    public int getTabContainerHeight() {
        android.content.res.TypedArray obtainStyledAttributes = this.getHighResolutionOutputSizeshNQ4ISI.obtainStyledAttributes(null, androidx.appcompat.R.styleable.ActionBar, androidx.appcompat.R.attr.actionBarStyle, 0);
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(androidx.appcompat.R.styleable.ActionBar_height, 0);
        android.content.res.Resources resources = this.getHighResolutionOutputSizeshNQ4ISI.getResources();
        if (!hasEmbeddedTabs()) {
            layoutDimension = java.lang.Math.min(layoutDimension, resources.getDimensionPixelSize(androidx.appcompat.R.dimen.abc_action_bar_stacked_max_height));
        }
        obtainStyledAttributes.recycle();
        return layoutDimension;
    }

    public boolean enableHomeButtonByDefault() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getApplicationInfo().targetSdkVersion < 14;
    }

    public int getStackedTabMaxWidth() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getResources().getDimensionPixelSize(androidx.appcompat.R.dimen.abc_action_bar_stacked_tab_max_width);
    }
}
