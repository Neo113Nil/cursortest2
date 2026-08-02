package androidx.appcompat.widget;

/* loaded from: classes5.dex */
class TooltipPopup {
    final android.content.Context Camera2StreamConfigurationMap;
    final android.view.WindowManager.LayoutParams getHighResolutionOutputSizeshNQ4ISI;
    final android.widget.TextView getHighSpeedVideoFpsRanges;
    final int[] getHighSpeedVideoFpsRangesFor;
    final android.view.View getHighSpeedVideoSizes;
    final int[] getInputFormats;
    final android.graphics.Rect getInputSizeshNQ4ISI;

    TooltipPopup(android.content.Context context) {
        android.view.WindowManager.LayoutParams layoutParams = new android.view.WindowManager.LayoutParams();
        this.getHighResolutionOutputSizeshNQ4ISI = layoutParams;
        this.getInputSizeshNQ4ISI = new android.graphics.Rect();
        this.getHighSpeedVideoFpsRangesFor = new int[2];
        this.getInputFormats = new int[2];
        this.Camera2StreamConfigurationMap = context;
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(androidx.appcompat.R.layout.abc_tooltip, (android.view.ViewGroup) null);
        this.getHighSpeedVideoSizes = inflate;
        this.getHighSpeedVideoFpsRanges = (android.widget.TextView) inflate.findViewById(androidx.appcompat.R.id.message);
        layoutParams.setTitle(getClass().getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = androidx.appcompat.R.style.Animation_AppCompat_Tooltip;
        layoutParams.flags = 24;
    }

    static android.view.View getHighSpeedVideoFpsRangesFor(android.view.View view) {
        android.view.View rootView = view.getRootView();
        android.view.ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if (!(layoutParams instanceof android.view.WindowManager.LayoutParams) || ((android.view.WindowManager.LayoutParams) layoutParams).type != 2) {
            for (android.content.Context context = view.getContext(); context instanceof android.content.ContextWrapper; context = ((android.content.ContextWrapper) context).getBaseContext()) {
                if (context instanceof android.app.Activity) {
                    return ((android.app.Activity) context).getWindow().getDecorView();
                }
            }
        }
        return rootView;
    }

    final void getHighSpeedVideoFpsRanges() {
        if (this.getHighSpeedVideoSizes.getParent() != null) {
            ((android.view.WindowManager) this.Camera2StreamConfigurationMap.getSystemService(com.datadog.android.sessionreplay.internal.recorder.mapper.DecorViewMapper.WINDOW_KEY_NAME)).removeView(this.getHighSpeedVideoSizes);
        }
    }
}
