package dagger.hilt.android.internal.managers;

/* loaded from: classes.dex */
public final class ApplicationComponentManager implements dagger.hilt.internal.GeneratedComponentManager<java.lang.Object> {
    private final dagger.hilt.android.internal.managers.ComponentSupplier Camera2StreamConfigurationMap;
    private final java.lang.Object getHighResolutionOutputSizeshNQ4ISI = new java.lang.Object();
    private volatile java.lang.Object getHighSpeedVideoFpsRangesFor;

    public ApplicationComponentManager(dagger.hilt.android.internal.managers.ComponentSupplier componentSupplier) {
        this.Camera2StreamConfigurationMap = componentSupplier;
    }

    @Override // dagger.hilt.internal.GeneratedComponentManager
    public final java.lang.Object generatedComponent() {
        if (this.getHighSpeedVideoFpsRangesFor == null) {
            synchronized (this.getHighResolutionOutputSizeshNQ4ISI) {
                if (this.getHighSpeedVideoFpsRangesFor == null) {
                    this.getHighSpeedVideoFpsRangesFor = this.Camera2StreamConfigurationMap.get();
                }
            }
        }
        return this.getHighSpeedVideoFpsRangesFor;
    }
}
