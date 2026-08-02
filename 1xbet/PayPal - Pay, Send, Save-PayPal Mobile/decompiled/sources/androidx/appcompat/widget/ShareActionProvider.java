package androidx.appcompat.widget;

/* loaded from: classes5.dex */
public class ShareActionProvider extends androidx.core.view.ActionProvider {
    public static final java.lang.String DEFAULT_SHARE_HISTORY_FILE_NAME = "share_history.xml";
    private int Camera2StreamConfigurationMap;
    java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    private androidx.appcompat.widget.ActivityChooserModel.OnChooseActivityListener getHighSpeedVideoFpsRanges;
    final android.content.Context getHighSpeedVideoFpsRangesFor;
    androidx.appcompat.widget.ShareActionProvider.OnShareTargetSelectedListener getHighSpeedVideoSizes;
    private final androidx.appcompat.widget.ShareActionProvider.ShareMenuItemOnMenuItemClickListener getOutputMinFrameDuration;

    public interface OnShareTargetSelectedListener {
        boolean onShareTargetSelected(androidx.appcompat.widget.ShareActionProvider shareActionProvider, android.content.Intent intent);
    }

    @Override // androidx.core.view.ActionProvider
    public boolean hasSubMenu() {
        return true;
    }

    public ShareActionProvider(android.content.Context context) {
        super(context);
        this.Camera2StreamConfigurationMap = 4;
        this.getOutputMinFrameDuration = new androidx.appcompat.widget.ShareActionProvider.ShareMenuItemOnMenuItemClickListener();
        this.getHighResolutionOutputSizeshNQ4ISI = DEFAULT_SHARE_HISTORY_FILE_NAME;
        this.getHighSpeedVideoFpsRangesFor = context;
    }

    public void setOnShareTargetSelectedListener(androidx.appcompat.widget.ShareActionProvider.OnShareTargetSelectedListener onShareTargetSelectedListener) {
        this.getHighSpeedVideoSizes = onShareTargetSelectedListener;
        getHighSpeedVideoFpsRangesFor();
    }

    @Override // androidx.core.view.ActionProvider
    public android.view.View onCreateActionView() {
        androidx.appcompat.widget.ActivityChooserView activityChooserView = new androidx.appcompat.widget.ActivityChooserView(this.getHighSpeedVideoFpsRangesFor);
        if (!activityChooserView.isInEditMode()) {
            activityChooserView.setActivityChooserModel(androidx.appcompat.widget.ActivityChooserModel.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI));
        }
        android.util.TypedValue typedValue = new android.util.TypedValue();
        this.getHighSpeedVideoFpsRangesFor.getTheme().resolveAttribute(androidx.appcompat.R.attr.actionModeShareDrawable, typedValue, true);
        activityChooserView.setExpandActivityOverflowButtonDrawable(androidx.appcompat.content.res.AppCompatResources.getDrawable(this.getHighSpeedVideoFpsRangesFor, typedValue.resourceId));
        activityChooserView.setProvider(this);
        activityChooserView.setDefaultActionButtonContentDescription(androidx.appcompat.R.string.abc_shareactionprovider_share_with_application);
        activityChooserView.setExpandActivityOverflowButtonContentDescription(androidx.appcompat.R.string.abc_shareactionprovider_share_with);
        return activityChooserView;
    }

    @Override // androidx.core.view.ActionProvider
    public void onPrepareSubMenu(android.view.SubMenu subMenu) {
        subMenu.clear();
        androidx.appcompat.widget.ActivityChooserModel highResolutionOutputSizeshNQ4ISI = androidx.appcompat.widget.ActivityChooserModel.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI);
        android.content.pm.PackageManager packageManager = this.getHighSpeedVideoFpsRangesFor.getPackageManager();
        int highSpeedVideoFpsRangesFor = highResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor();
        int min = java.lang.Math.min(highSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap);
        for (int i = 0; i < min; i++) {
            android.content.pm.ResolveInfo highResolutionOutputSizeshNQ4ISI2 = highResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI(i);
            subMenu.add(0, i, i, highResolutionOutputSizeshNQ4ISI2.loadLabel(packageManager)).setIcon(highResolutionOutputSizeshNQ4ISI2.loadIcon(packageManager)).setOnMenuItemClickListener(this.getOutputMinFrameDuration);
        }
        if (min < highSpeedVideoFpsRangesFor) {
            android.view.SubMenu addSubMenu = subMenu.addSubMenu(0, min, min, this.getHighSpeedVideoFpsRangesFor.getString(androidx.appcompat.R.string.abc_activity_chooser_view_see_all));
            for (int i2 = 0; i2 < highSpeedVideoFpsRangesFor; i2++) {
                android.content.pm.ResolveInfo highResolutionOutputSizeshNQ4ISI3 = highResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI(i2);
                addSubMenu.add(0, i2, i2, highResolutionOutputSizeshNQ4ISI3.loadLabel(packageManager)).setIcon(highResolutionOutputSizeshNQ4ISI3.loadIcon(packageManager)).setOnMenuItemClickListener(this.getOutputMinFrameDuration);
            }
        }
    }

    public void setShareHistoryFileName(java.lang.String str) {
        this.getHighResolutionOutputSizeshNQ4ISI = str;
        getHighSpeedVideoFpsRangesFor();
    }

    public void setShareIntent(android.content.Intent intent) {
        if (intent != null) {
            java.lang.String action = intent.getAction();
            if ("android.intent.action.SEND".equals(action) || "android.intent.action.SEND_MULTIPLE".equals(action)) {
                intent.addFlags(134742016);
            }
        }
        androidx.appcompat.widget.ActivityChooserModel highResolutionOutputSizeshNQ4ISI = androidx.appcompat.widget.ActivityChooserModel.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI);
        synchronized (highResolutionOutputSizeshNQ4ISI.getInputFormats) {
            if (highResolutionOutputSizeshNQ4ISI.getInputSizeshNQ4ISI == intent) {
                return;
            }
            highResolutionOutputSizeshNQ4ISI.getInputSizeshNQ4ISI = intent;
            highResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizesFor = true;
            highResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes();
        }
    }

    class ShareMenuItemOnMenuItemClickListener implements android.view.MenuItem.OnMenuItemClickListener {
        ShareMenuItemOnMenuItemClickListener() {
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(android.view.MenuItem menuItem) {
            android.content.Intent highSpeedVideoFpsRanges = androidx.appcompat.widget.ActivityChooserModel.getHighResolutionOutputSizeshNQ4ISI(androidx.appcompat.widget.ShareActionProvider.this.getHighSpeedVideoFpsRangesFor, androidx.appcompat.widget.ShareActionProvider.this.getHighResolutionOutputSizeshNQ4ISI).getHighSpeedVideoFpsRanges(menuItem.getItemId());
            if (highSpeedVideoFpsRanges == null) {
                return true;
            }
            java.lang.String action = highSpeedVideoFpsRanges.getAction();
            if ("android.intent.action.SEND".equals(action) || "android.intent.action.SEND_MULTIPLE".equals(action)) {
                androidx.appcompat.widget.ShareActionProvider.getHighSpeedVideoSizes(highSpeedVideoFpsRanges);
            }
            androidx.appcompat.widget.ShareActionProvider.this.getHighSpeedVideoFpsRangesFor.startActivity(highSpeedVideoFpsRanges);
            return true;
        }
    }

    private void getHighSpeedVideoFpsRangesFor() {
        if (this.getHighSpeedVideoSizes == null) {
            return;
        }
        if (this.getHighSpeedVideoFpsRanges == null) {
            this.getHighSpeedVideoFpsRanges = new androidx.appcompat.widget.ShareActionProvider.ShareActivityChooserModelPolicy();
        }
        androidx.appcompat.widget.ActivityChooserModel highResolutionOutputSizeshNQ4ISI = androidx.appcompat.widget.ActivityChooserModel.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI);
        androidx.appcompat.widget.ActivityChooserModel.OnChooseActivityListener onChooseActivityListener = this.getHighSpeedVideoFpsRanges;
        synchronized (highResolutionOutputSizeshNQ4ISI.getInputFormats) {
            highResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor = onChooseActivityListener;
        }
    }

    class ShareActivityChooserModelPolicy implements androidx.appcompat.widget.ActivityChooserModel.OnChooseActivityListener {
        ShareActivityChooserModelPolicy() {
        }

        @Override // androidx.appcompat.widget.ActivityChooserModel.OnChooseActivityListener
        public boolean onChooseActivity(androidx.appcompat.widget.ActivityChooserModel activityChooserModel, android.content.Intent intent) {
            if (androidx.appcompat.widget.ShareActionProvider.this.getHighSpeedVideoSizes == null) {
                return false;
            }
            androidx.appcompat.widget.ShareActionProvider.this.getHighSpeedVideoSizes.onShareTargetSelected(androidx.appcompat.widget.ShareActionProvider.this, intent);
            return false;
        }
    }

    static void getHighSpeedVideoSizes(android.content.Intent intent) {
        intent.addFlags(134742016);
    }
}
