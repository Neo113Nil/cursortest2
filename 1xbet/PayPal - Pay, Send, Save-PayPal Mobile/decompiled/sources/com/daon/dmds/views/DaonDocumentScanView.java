package com.daon.dmds.views;

/* loaded from: classes7.dex */
public class DaonDocumentScanView extends android.widget.RelativeLayout {
    public static final java.lang.String DMDS_CANCEL_SCANNING = "DMDS_CANCEL_SCANNING";
    public static final java.lang.String DMDS_ENABLE_CROPPING = "DMDS_ENABLE_CROPPING";
    public static final java.lang.String DMDS_ERROR = "DMDS_ERROR";
    public static final java.lang.String DMDS_FACE_FILE = "DMDS_FACE_FILE";
    public static final java.lang.String DMDS_FACE_IMAGE = "DMDS_FACE_IMAGE";
    public static final java.lang.String DMDS_OPTIONS = "DMDS_OPTIONS";
    public static final java.lang.String DMDS_PROCESSED_IMAGE = "DMDS_PROCESSED_IMAGE";
    public static final java.lang.String DMDS_PROCESSED_IMAGE_LOC = "DMDS_PROCESSED_IMAGE_LOC";
    public static final java.lang.String DMDS_PROCESSED_IMAGE_ORIENTATION = "DMDS_PROCESSED_IMAGE_ORIENTATION";
    public static final java.lang.String DMDS_PROCESS_FILE = "DMDS_PROCESS_FILE";
    public static final java.lang.String DMDS_RESULTS = "DMDS_RESULTS";
    public static final java.lang.String DMDS_UNPROCESSED_IMAGE = "DMDS_UNPROCESSED_IMAGE";
    public static final java.lang.String DMDS_UNPROCESS_FILE = "DMDS_UNPROCESS_FILE";
    private com.daon.dmds.managers.DMDSScanViewLifecycleObserver getHighResolutionOutputSizeshNQ4ISI;
    private com.daon.dmds.views.DMDSScanView getHighSpeedVideoSizes;

    public DaonDocumentScanView(android.content.Context context) {
        super(context);
        ((android.view.LayoutInflater) context.getSystemService("layout_inflater")).inflate(com.daon.dmds.R.layout.base_scan_view_layout, this);
        this.getHighSpeedVideoSizes = (com.daon.dmds.views.DMDSScanView) findViewById(com.daon.dmds.R.id.scanview);
    }

    public void addChildView(android.view.View view, boolean z) {
        com.daon.dmds.views.DMDSScanView dMDSScanView = this.getHighSpeedVideoSizes;
        if (dMDSScanView != null) {
            dMDSScanView.addChildView(view, z);
        }
    }

    public void addMetadataProvider(com.daon.dmds.managers.DMDSMetadataProvider dMDSMetadataProvider) {
        com.daon.dmds.views.DMDSScanView dMDSScanView = this.getHighSpeedVideoSizes;
        if (dMDSScanView != null) {
            dMDSScanView.addMetadataProvider(dMDSMetadataProvider);
        }
    }

    public void create(com.daon.dmds.models.DMDSOptions dMDSOptions, com.daon.dmds.managers.DMDSDefaultScanListener dMDSDefaultScanListener) {
        com.daon.dmds.views.DMDSScanView dMDSScanView = this.getHighSpeedVideoSizes;
        if (dMDSScanView != null) {
            dMDSScanView.create(dMDSOptions, dMDSDefaultScanListener);
        }
    }

    public void destroy() {
        com.daon.dmds.views.DMDSScanView dMDSScanView = this.getHighSpeedVideoSizes;
        if (dMDSScanView != null) {
            dMDSScanView.destroy();
            this.getHighSpeedVideoSizes = null;
        }
        if (this.getHighResolutionOutputSizeshNQ4ISI != null) {
            this.getHighResolutionOutputSizeshNQ4ISI = null;
        }
    }

    public void pause() {
        com.daon.dmds.views.DMDSScanView dMDSScanView = this.getHighSpeedVideoSizes;
        if (dMDSScanView != null) {
            dMDSScanView.pause();
        }
    }

    public void pauseScanning() {
        com.daon.dmds.views.DMDSScanView dMDSScanView = this.getHighSpeedVideoSizes;
        if (dMDSScanView != null) {
            dMDSScanView.pauseScanning();
        }
    }

    public void refocusCamera() {
        this.getHighSpeedVideoSizes.refocusCamera();
    }

    public void restartScanning() {
        com.daon.dmds.views.DMDSScanView dMDSScanView = this.getHighSpeedVideoSizes;
        if (dMDSScanView != null) {
            dMDSScanView.restartScanning();
        }
    }

    public void resume() {
        com.daon.dmds.views.DMDSScanView dMDSScanView = this.getHighSpeedVideoSizes;
        if (dMDSScanView != null) {
            dMDSScanView.resume();
        }
    }

    public void resumeScanning(boolean z) {
        com.daon.dmds.views.DMDSScanView dMDSScanView = this.getHighSpeedVideoSizes;
        if (dMDSScanView != null) {
            dMDSScanView.resumeScanning(z);
        }
    }

    public void setFlashState(boolean z, com.daon.dmds.managers.DMDSFlashStateChangeListener dMDSFlashStateChangeListener) {
        com.daon.dmds.views.DMDSScanView dMDSScanView = this.getHighSpeedVideoSizes;
        if (dMDSScanView != null) {
            dMDSScanView.setFlashState(z, dMDSFlashStateChangeListener);
        }
    }

    public void setLifecycle(androidx.view.Lifecycle lifecycle) {
        com.daon.dmds.managers.DMDSScanViewLifecycleObserver dMDSScanViewLifecycleObserver = new com.daon.dmds.managers.DMDSScanViewLifecycleObserver(this);
        this.getHighResolutionOutputSizeshNQ4ISI = dMDSScanViewLifecycleObserver;
        lifecycle.addObserver(dMDSScanViewLifecycleObserver);
    }

    public void setScanningRegion(com.daon.dmds.models.DMDSRect dMDSRect, boolean z) {
        com.daon.dmds.views.DMDSScanView dMDSScanView = this.getHighSpeedVideoSizes;
        if (dMDSScanView != null) {
            dMDSScanView.setScanningRegion(dMDSRect, z);
        }
    }

    public void start() {
        com.daon.dmds.views.DMDSScanView dMDSScanView = this.getHighSpeedVideoSizes;
        if (dMDSScanView != null) {
            dMDSScanView.start();
        }
    }

    public boolean startScanning() {
        com.daon.dmds.views.DMDSScanView dMDSScanView = this.getHighSpeedVideoSizes;
        if (dMDSScanView != null) {
            return dMDSScanView.startScanning();
        }
        return false;
    }

    public void stop() {
        com.daon.dmds.views.DMDSScanView dMDSScanView = this.getHighSpeedVideoSizes;
        if (dMDSScanView != null) {
            dMDSScanView.stop();
        }
    }

    public boolean updateDocumentTypes(java.util.List<com.daon.dmds.models.DocTypeEnum> list) {
        com.daon.dmds.views.DMDSScanView dMDSScanView = this.getHighSpeedVideoSizes;
        if (dMDSScanView != null) {
            return dMDSScanView.updateDocumentTypes(list);
        }
        return false;
    }

    public void updateScanningOptions(com.daon.dmds.models.DMDSOptions dMDSOptions) {
        com.daon.dmds.views.DMDSScanView dMDSScanView = this.getHighSpeedVideoSizes;
        if (dMDSScanView != null) {
            dMDSScanView.updateScanningOptions(dMDSOptions);
        }
    }

    public DaonDocumentScanView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        ((android.view.LayoutInflater) context.getSystemService("layout_inflater")).inflate(com.daon.dmds.R.layout.base_scan_view_layout, this);
        this.getHighSpeedVideoSizes = (com.daon.dmds.views.DMDSScanView) findViewById(com.daon.dmds.R.id.scanview);
    }

    public void create(com.daon.dmds.models.DMDSOptions dMDSOptions, com.daon.dmds.managers.DMDSCustomScanListener dMDSCustomScanListener) {
        com.daon.dmds.views.DMDSScanView dMDSScanView = this.getHighSpeedVideoSizes;
        if (dMDSScanView != null) {
            dMDSScanView.create(dMDSOptions, dMDSCustomScanListener);
        }
    }

    public DaonDocumentScanView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ((android.view.LayoutInflater) context.getSystemService("layout_inflater")).inflate(com.daon.dmds.R.layout.base_scan_view_layout, this);
        this.getHighSpeedVideoSizes = (com.daon.dmds.views.DMDSScanView) findViewById(com.daon.dmds.R.id.scanview);
    }

    public DaonDocumentScanView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        ((android.view.LayoutInflater) context.getSystemService("layout_inflater")).inflate(com.daon.dmds.R.layout.base_scan_view_layout, this);
        this.getHighSpeedVideoSizes = (com.daon.dmds.views.DMDSScanView) findViewById(com.daon.dmds.R.id.scanview);
    }
}
