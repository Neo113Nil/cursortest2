package androidx.camera.core.streamsharing;

/* loaded from: classes6.dex */
public class StreamSharingConfig implements androidx.camera.core.impl.UseCaseConfig<androidx.camera.core.streamsharing.StreamSharing>, androidx.camera.core.impl.ImageOutputConfig, androidx.camera.core.internal.ThreadConfig {
    static final androidx.camera.core.impl.Config.Option<java.util.List<androidx.camera.core.impl.UseCaseConfigFactory.CaptureType>> getHighSpeedVideoFpsRangesFor = androidx.camera.core.impl.Config.Option.create("camerax.core.streamSharing.captureTypes", java.util.List.class);
    private final androidx.camera.core.impl.OptionsBundle Camera2StreamConfigurationMap;

    StreamSharingConfig(androidx.camera.core.impl.OptionsBundle optionsBundle) {
        this.Camera2StreamConfigurationMap = optionsBundle;
    }

    @Override // androidx.camera.core.impl.ReadableConfig
    /* renamed from: getConfig */
    public androidx.camera.core.impl.Config getGetHighSpeedVideoFpsRanges() {
        return this.Camera2StreamConfigurationMap;
    }

    public java.util.List<androidx.camera.core.impl.UseCaseConfigFactory.CaptureType> getCaptureTypes() {
        return (java.util.List) retrieveOption(getHighSpeedVideoFpsRangesFor);
    }
}
