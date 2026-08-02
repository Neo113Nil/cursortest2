package com.microblink.blinkid.fragment.overlay.components.snackbar;

/* loaded from: classes10.dex */
public class SnackbarManager {
    private boolean Camera2StreamConfigurationMap;
    private final android.os.Handler getHighResolutionOutputSizeshNQ4ISI;
    private final android.widget.ViewSwitcher getHighSpeedVideoFpsRanges;
    private final java.lang.Runnable getHighSpeedVideoFpsRangesFor;

    public SnackbarManager(android.widget.ViewSwitcher viewSwitcher, java.lang.String str, android.graphics.drawable.Drawable drawable, com.microblink.blinkid.fragment.overlay.components.statusmsg.StatusTextStyler statusTextStyler, int i, int i2) {
        this.getHighResolutionOutputSizeshNQ4ISI = new android.os.Handler(android.os.Looper.getMainLooper());
        this.Camera2StreamConfigurationMap = false;
        this.getHighSpeedVideoFpsRangesFor = new java.lang.Runnable() { // from class: com.microblink.blinkid.fragment.overlay.components.snackbar.SnackbarManager$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                com.microblink.blinkid.fragment.overlay.components.snackbar.SnackbarManager.m10891$r8$lambda$0Ejv2VK4JW4ymCplpOUaBYk_Ig(com.microblink.blinkid.fragment.overlay.components.snackbar.SnackbarManager.this);
            }
        };
        this.getHighSpeedVideoFpsRanges = viewSwitcher;
        android.content.Context context = viewSwitcher.getContext();
        viewSwitcher.removeAllViews();
        viewSwitcher.addView(new android.view.View(context), new android.view.ViewGroup.LayoutParams(0, 0));
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.microblink.blinkid.resources.Layouts.IllIIlIIII, (android.view.ViewGroup) viewSwitcher, false);
        viewSwitcher.addView(inflate);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.microblink.blinkid.library.R.id.tvSnackbarMessage);
        textView.setText(str);
        textView.setBackground(drawable);
        statusTextStyler.applyStyle(textView);
        viewSwitcher.setInAnimation(android.view.animation.AnimationUtils.loadAnimation(context, i));
        viewSwitcher.setOutAnimation(android.view.animation.AnimationUtils.loadAnimation(context, i2));
    }

    public void hideSnackbar() {
        this.getHighResolutionOutputSizeshNQ4ISI.removeCallbacks(this.getHighSpeedVideoFpsRangesFor);
        this.Camera2StreamConfigurationMap = false;
        this.getHighResolutionOutputSizeshNQ4ISI.post(new com.microblink.blinkid.fragment.overlay.components.snackbar.SnackbarManager$$ExternalSyntheticLambda0(this));
    }

    public boolean isSnackbarShown() {
        return this.Camera2StreamConfigurationMap;
    }

    public void showSnackbar() {
        this.getHighResolutionOutputSizeshNQ4ISI.removeCallbacks(this.getHighSpeedVideoFpsRangesFor);
        this.Camera2StreamConfigurationMap = true;
        this.getHighResolutionOutputSizeshNQ4ISI.post(new java.lang.Runnable() { // from class: com.microblink.blinkid.fragment.overlay.components.snackbar.SnackbarManager$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                com.microblink.blinkid.fragment.overlay.components.snackbar.SnackbarManager.$r8$lambda$NXmdsuP0xP6WfpxPPKM6Q1L_kZQ(com.microblink.blinkid.fragment.overlay.components.snackbar.SnackbarManager.this);
            }
        });
        this.getHighResolutionOutputSizeshNQ4ISI.postDelayed(this.getHighSpeedVideoFpsRangesFor, 5000L);
    }

    public SnackbarManager(android.widget.ViewSwitcher viewSwitcher, java.lang.String str, android.graphics.drawable.Drawable drawable, com.microblink.blinkid.fragment.overlay.components.statusmsg.StatusTextStyler statusTextStyler) {
        this(viewSwitcher, str, drawable, statusTextStyler, com.microblink.blinkid.library.R.anim.mb_snackbar_in, com.microblink.blinkid.library.R.anim.mb_snackbar_out);
    }

    /* renamed from: $r8$lambda$0Ejv2VK4JW4-ymCplpOUaBYk_Ig, reason: not valid java name */
    public static /* synthetic */ void m10891$r8$lambda$0Ejv2VK4JW4ymCplpOUaBYk_Ig(com.microblink.blinkid.fragment.overlay.components.snackbar.SnackbarManager snackbarManager) {
        snackbarManager.Camera2StreamConfigurationMap = false;
        snackbarManager.getHighResolutionOutputSizeshNQ4ISI.post(new com.microblink.blinkid.fragment.overlay.components.snackbar.SnackbarManager$$ExternalSyntheticLambda0(snackbarManager));
    }

    public static /* synthetic */ void $r8$lambda$NXmdsuP0xP6WfpxPPKM6Q1L_kZQ(com.microblink.blinkid.fragment.overlay.components.snackbar.SnackbarManager snackbarManager) {
        snackbarManager.getHighSpeedVideoFpsRanges.setDisplayedChild(1);
        snackbarManager.getHighSpeedVideoFpsRanges.findViewById(com.microblink.blinkid.library.R.id.tvSnackbarMessage).sendAccessibilityEvent(32768);
    }
}
