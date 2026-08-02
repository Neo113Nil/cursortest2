package androidx.camera.camera2.adapter;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, d2 = {"Landroidx/camera/camera2/adapter/ExposureStateAdapter;", "Landroidx/camera/core/ExposureState;", "Landroidx/camera/camera2/impl/CameraProperties;", "cameraProperties", "", "exposureCompensation", "<init>", "(Landroidx/camera/camera2/impl/CameraProperties;I)V", "", "isExposureCompensationSupported", "()Z", "getExposureCompensationIndex", "()I", "Landroid/util/Rational;", "getExposureCompensationStep", "()Landroid/util/Rational;", "Landroid/util/Range;", "getExposureCompensationRange", "()Landroid/util/Range;", "getHighSpeedVideoSizes", "Landroidx/camera/camera2/impl/CameraProperties;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRanges", com.visa.cbp.getEncExpo.warmup}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ExposureStateAdapter implements androidx.camera.core.ExposureState {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final int getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.camera.camera2.impl.CameraProperties Camera2StreamConfigurationMap;

    public ExposureStateAdapter(androidx.camera.camera2.impl.CameraProperties cameraProperties, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraProperties, "");
        this.Camera2StreamConfigurationMap = cameraProperties;
        this.getHighSpeedVideoSizes = i;
    }

    @Override // androidx.camera.core.ExposureState
    /* renamed from: isExposureCompensationSupported */
    public final boolean getGetHighResolutionOutputSizeshNQ4ISI() {
        android.util.Range<java.lang.Integer> exposureCompensationRange = getExposureCompensationRange();
        java.lang.Integer lower = exposureCompensationRange.getLower();
        if (lower != null && lower.intValue() == 0) {
            return false;
        }
        java.lang.Integer upper = exposureCompensationRange.getUpper();
        return upper == null || upper.intValue() != 0;
    }

    @Override // androidx.camera.core.ExposureState
    /* renamed from: getExposureCompensationIndex, reason: from getter */
    public final int getGetHighSpeedVideoSizes() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // androidx.camera.core.ExposureState
    /* renamed from: getExposureCompensationStep */
    public final android.util.Rational getCamera2StreamConfigurationMap() {
        if (!getGetHighResolutionOutputSizeshNQ4ISI()) {
            android.util.Rational rational = android.util.Rational.ZERO;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(rational, "");
            return rational;
        }
        androidx.camera.camera2.pipe.CameraMetadata metadata = this.Camera2StreamConfigurationMap.getMetadata();
        android.hardware.camera2.CameraCharacteristics.Key key = android.hardware.camera2.CameraCharacteristics.CONTROL_AE_COMPENSATION_STEP;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key, "");
        java.lang.Object obj = metadata.get((android.hardware.camera2.CameraCharacteristics.Key<java.lang.Object>) key);
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj);
        return (android.util.Rational) obj;
    }

    @Override // androidx.camera.core.ExposureState
    public final android.util.Range<java.lang.Integer> getExposureCompensationRange() {
        androidx.camera.camera2.pipe.CameraMetadata metadata = this.Camera2StreamConfigurationMap.getMetadata();
        android.hardware.camera2.CameraCharacteristics.Key key = android.hardware.camera2.CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key, "");
        android.util.Range<java.lang.Integer> range = (android.util.Range) metadata.get(key);
        return range == null ? androidx.camera.camera2.adapter.ExposureStateAdapterKt.getEMPTY_RANGE() : range;
    }
}
