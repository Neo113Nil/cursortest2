package androidx.camera.camera2.adapter;

@androidx.camera.camera2.config.CameraScope
@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\f\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0012\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0014R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158G¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158G¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0018R\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00158G¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0018R\u0011\u0010\"\u001a\u00020\u001f8G¢\u0006\u0006\u001a\u0004\b \u0010!R\u0017\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158G¢\u0006\u0006\u001a\u0004\b#\u0010\u0018"}, d2 = {"Landroidx/camera/camera2/adapter/CameraControlStateAdapter;", "", "Landroidx/camera/camera2/impl/ZoomControl;", "zoomControl", "Landroidx/camera/camera2/impl/EvCompControl;", "evCompControl", "Landroidx/camera/camera2/impl/TorchControl;", "torchControl", "Landroidx/camera/camera2/impl/LowLightBoostControl;", "lowLightBoostControl", "<init>", "(Landroidx/camera/camera2/impl/ZoomControl;Landroidx/camera/camera2/impl/EvCompControl;Landroidx/camera/camera2/impl/TorchControl;Landroidx/camera/camera2/impl/LowLightBoostControl;)V", "getHighSpeedVideoFpsRanges", "Landroidx/camera/camera2/impl/ZoomControl;", "Camera2StreamConfigurationMap", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/camera/camera2/impl/EvCompControl;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizes", "Landroidx/camera/camera2/impl/TorchControl;", "Landroidx/camera/camera2/impl/LowLightBoostControl;", "Landroidx/lifecycle/LiveData;", "", "getTorchStateLiveData", "()Landroidx/lifecycle/LiveData;", "torchStateLiveData", "getTorchStrengthLiveData", "torchStrengthLiveData", "Landroidx/camera/core/ZoomState;", "getZoomStateLiveData", "zoomStateLiveData", "Landroidx/camera/core/ExposureState;", "getExposureState", "()Landroidx/camera/core/ExposureState;", "exposureState", "getLowLightBoostState", "lowLightBoostState"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CameraControlStateAdapter {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.camera.camera2.impl.EvCompControl getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.camera.camera2.impl.ZoomControl Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.camera.camera2.impl.LowLightBoostControl getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.camera.camera2.impl.TorchControl getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public CameraControlStateAdapter(androidx.camera.camera2.impl.ZoomControl zoomControl, androidx.camera.camera2.impl.EvCompControl evCompControl, androidx.camera.camera2.impl.TorchControl torchControl, androidx.camera.camera2.impl.LowLightBoostControl lowLightBoostControl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zoomControl, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(evCompControl, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(torchControl, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lowLightBoostControl, "");
        this.Camera2StreamConfigurationMap = zoomControl;
        this.getHighSpeedVideoFpsRangesFor = evCompControl;
        this.getHighSpeedVideoFpsRanges = torchControl;
        this.getHighSpeedVideoSizes = lowLightBoostControl;
    }

    public final androidx.view.LiveData<java.lang.Integer> getTorchStateLiveData() {
        return this.getHighSpeedVideoFpsRanges.getTorchStateLiveData();
    }

    public final androidx.view.LiveData<java.lang.Integer> getTorchStrengthLiveData() {
        return this.getHighSpeedVideoFpsRanges.getTorchStrengthLiveData();
    }

    public final androidx.view.LiveData<androidx.camera.core.ZoomState> getZoomStateLiveData() {
        return this.Camera2StreamConfigurationMap.getZoomStateLiveData();
    }

    public final androidx.camera.core.ExposureState getExposureState() {
        return this.getHighSpeedVideoFpsRangesFor.getExposureState();
    }

    public final androidx.view.LiveData<java.lang.Integer> getLowLightBoostState() {
        return this.getHighSpeedVideoSizes.getLowLightBoostStateLiveData();
    }
}
