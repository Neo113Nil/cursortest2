package androidx.window.layout.adapter.sidecar;

/* loaded from: classes7.dex */
public class DistinctElementSidecarCallback implements androidx.window.sidecar.SidecarInterface.SidecarCallback {
    private final java.util.Map<android.os.IBinder, androidx.window.sidecar.SidecarWindowLayoutInfo> Camera2StreamConfigurationMap;
    private final androidx.window.layout.adapter.sidecar.SidecarAdapter getHighResolutionOutputSizeshNQ4ISI;
    private final java.lang.Object getHighSpeedVideoFpsRanges;
    private final androidx.window.sidecar.SidecarInterface.SidecarCallback getHighSpeedVideoFpsRangesFor;
    private androidx.window.sidecar.SidecarDeviceState getHighSpeedVideoSizes;

    DistinctElementSidecarCallback(androidx.window.layout.adapter.sidecar.SidecarAdapter sidecarAdapter, androidx.window.sidecar.SidecarInterface.SidecarCallback sidecarCallback) {
        this.getHighSpeedVideoFpsRanges = new java.lang.Object();
        this.Camera2StreamConfigurationMap = new java.util.WeakHashMap();
        this.getHighResolutionOutputSizeshNQ4ISI = sidecarAdapter;
        this.getHighSpeedVideoFpsRangesFor = sidecarCallback;
    }

    public DistinctElementSidecarCallback(androidx.window.sidecar.SidecarInterface.SidecarCallback sidecarCallback) {
        this.getHighSpeedVideoFpsRanges = new java.lang.Object();
        this.Camera2StreamConfigurationMap = new java.util.WeakHashMap();
        this.getHighResolutionOutputSizeshNQ4ISI = new androidx.window.layout.adapter.sidecar.SidecarAdapter();
        this.getHighSpeedVideoFpsRangesFor = sidecarCallback;
    }

    public void onDeviceStateChanged(androidx.window.sidecar.SidecarDeviceState sidecarDeviceState) {
        if (sidecarDeviceState == null) {
            return;
        }
        synchronized (this.getHighSpeedVideoFpsRanges) {
            if (this.getHighResolutionOutputSizeshNQ4ISI.isEqualSidecarDeviceState(this.getHighSpeedVideoSizes, sidecarDeviceState)) {
                return;
            }
            this.getHighSpeedVideoSizes = sidecarDeviceState;
            this.getHighSpeedVideoFpsRangesFor.onDeviceStateChanged(sidecarDeviceState);
        }
    }

    public void onWindowLayoutChanged(android.os.IBinder iBinder, androidx.window.sidecar.SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
        synchronized (this.getHighSpeedVideoFpsRanges) {
            if (this.getHighResolutionOutputSizeshNQ4ISI.isEqualSidecarWindowLayoutInfo(this.Camera2StreamConfigurationMap.get(iBinder), sidecarWindowLayoutInfo)) {
                return;
            }
            this.Camera2StreamConfigurationMap.put(iBinder, sidecarWindowLayoutInfo);
            this.getHighSpeedVideoFpsRangesFor.onWindowLayoutChanged(iBinder, sidecarWindowLayoutInfo);
        }
    }
}
