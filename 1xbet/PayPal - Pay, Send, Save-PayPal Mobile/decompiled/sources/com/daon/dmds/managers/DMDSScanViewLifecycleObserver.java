package com.daon.dmds.managers;

/* loaded from: classes7.dex */
public class DMDSScanViewLifecycleObserver implements androidx.view.DefaultLifecycleObserver {
    private com.daon.dmds.views.DaonDocumentScanView getHighSpeedVideoSizes;

    public DMDSScanViewLifecycleObserver(com.daon.dmds.views.DaonDocumentScanView daonDocumentScanView) {
        this.getHighSpeedVideoSizes = daonDocumentScanView;
    }

    @Override // androidx.view.DefaultLifecycleObserver
    public void onCreate(androidx.view.LifecycleOwner lifecycleOwner) {
        com.daon.dmds.utils.DobsLogUtils.logVerbose("onCreate: ");
    }

    @Override // androidx.view.DefaultLifecycleObserver
    public void onDestroy(androidx.view.LifecycleOwner lifecycleOwner) {
        this.getHighSpeedVideoSizes.destroy();
        this.getHighSpeedVideoSizes = null;
    }

    @Override // androidx.view.DefaultLifecycleObserver
    public void onPause(androidx.view.LifecycleOwner lifecycleOwner) {
        this.getHighSpeedVideoSizes.pause();
    }

    @Override // androidx.view.DefaultLifecycleObserver
    public void onResume(androidx.view.LifecycleOwner lifecycleOwner) {
        this.getHighSpeedVideoSizes.resume();
    }

    @Override // androidx.view.DefaultLifecycleObserver
    public void onStart(androidx.view.LifecycleOwner lifecycleOwner) {
        this.getHighSpeedVideoSizes.start();
    }

    @Override // androidx.view.DefaultLifecycleObserver
    public void onStop(androidx.view.LifecycleOwner lifecycleOwner) {
        this.getHighSpeedVideoSizes.stop();
    }
}
