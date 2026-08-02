package androidx.camera.camera2.adapter;

@kotlin.Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0011J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u000fH\u0016¢\u0006\u0004\b\u0018\u0010\u0011J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001f\u0010\tJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020\f2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\fH\u0016¢\u0006\u0004\b'\u0010\u000eJ\u001b\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070)0(H\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\fH\u0016¢\u0006\u0004\b,\u0010\u000eJ\u000f\u0010-\u001a\u00020\fH\u0016¢\u0006\u0004\b-\u0010\u000eJ#\u00100\u001a\b\u0012\u0004\u0012\u00020.0(2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020.0(H\u0016¢\u0006\u0004\b0\u00101J\u0015\u00102\u001a\b\u0012\u0004\u0012\u00020\u00010(H\u0016¢\u0006\u0004\b2\u0010+J\u000f\u00104\u001a\u000203H\u0016¢\u0006\u0004\b4\u00105J)\u0010:\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u00107*\u0002062\f\u00109\u001a\b\u0012\u0004\u0012\u00028\u000008H\u0016¢\u0006\u0004\b:\u0010;R\u0014\u0010>\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R!\u0010F\u001a\u00020?8AX\u0080\u0084\u0002¢\u0006\u0012\n\u0004\b@\u0010A\u0012\u0004\bD\u0010E\u001a\u0004\bB\u0010C"}, d2 = {"Landroidx/camera/camera2/adapter/PhysicalCameraInfoAdapter;", "Landroidx/camera/core/CameraInfo;", "Landroidx/camera/camera2/pipe/UnsafeWrapper;", "Landroidx/camera/camera2/impl/CameraProperties;", "cameraProperties", "<init>", "(Landroidx/camera/camera2/impl/CameraProperties;)V", "", "getSensorRotationDegrees", "()I", "relativeRotation", "(I)I", "", "hasFlashUnit", "()Z", "Landroidx/lifecycle/LiveData;", "getTorchState", "()Landroidx/lifecycle/LiveData;", "Landroidx/camera/core/ZoomState;", "getZoomState", "Landroidx/camera/core/ExposureState;", "getExposureState", "()Landroidx/camera/core/ExposureState;", "Landroidx/camera/core/CameraState;", "getCameraState", "", "getImplementationType", "()Ljava/lang/String;", "Landroidx/camera/core/CameraSelector;", "getCameraSelector", "()Landroidx/camera/core/CameraSelector;", "getLensFacing", "", "getIntrinsicZoomRatio", "()F", "Landroidx/camera/core/FocusMeteringAction;", "action", "isFocusMeteringSupported", "(Landroidx/camera/core/FocusMeteringAction;)Z", "isZslSupported", "", "Landroid/util/Range;", "getSupportedFrameRateRanges", "()Ljava/util/Set;", "isLogicalMultiCameraSupported", "isPrivateReprocessingSupported", "Landroidx/camera/core/DynamicRange;", "candidateDynamicRanges", "querySupportedDynamicRanges", "(Ljava/util/Set;)Ljava/util/Set;", "getPhysicalCameraInfos", "Landroidx/camera/core/CameraIdentifier;", "getCameraIdentifier", "()Landroidx/camera/core/CameraIdentifier;", "", "T", "Lkotlin/reflect/KClass;", "type", "unwrapAs", "(Lkotlin/reflect/KClass;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "Landroidx/camera/camera2/impl/CameraProperties;", "getHighSpeedVideoFpsRangesFor", "Landroidx/camera/camera2/interop/Camera2CameraInfo;", "camera2CameraInfo$delegate", "Lkotlin/Lazy;", "getCamera2CameraInfo$camera_camera2", "()Landroidx/camera/camera2/interop/Camera2CameraInfo;", "getCamera2CameraInfo$camera_camera2$annotations", "()V", "camera2CameraInfo"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PhysicalCameraInfoAdapter implements androidx.camera.core.CameraInfo, androidx.camera.camera2.pipe.UnsafeWrapper {

    /* renamed from: camera2CameraInfo$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy camera2CameraInfo;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.camera.camera2.impl.CameraProperties getHighSpeedVideoFpsRangesFor;

    public static /* synthetic */ void getCamera2CameraInfo$camera_camera2$annotations() {
    }

    public PhysicalCameraInfoAdapter(androidx.camera.camera2.impl.CameraProperties cameraProperties) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraProperties, "");
        this.getHighSpeedVideoFpsRangesFor = cameraProperties;
        this.camera2CameraInfo = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: androidx.camera.camera2.adapter.PhysicalCameraInfoAdapter$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                androidx.camera.camera2.interop.Camera2CameraInfo create;
                create = androidx.camera.camera2.interop.Camera2CameraInfo.INSTANCE.create(androidx.camera.camera2.adapter.PhysicalCameraInfoAdapter.this.getHighSpeedVideoFpsRangesFor);
                return create;
            }
        });
    }

    public final androidx.camera.camera2.interop.Camera2CameraInfo getCamera2CameraInfo$camera_camera2() {
        return (androidx.camera.camera2.interop.Camera2CameraInfo) this.camera2CameraInfo.getValue();
    }

    @Override // androidx.camera.core.CameraInfo
    public final int getSensorRotationDegrees() {
        return getSensorRotationDegrees(0);
    }

    @Override // androidx.camera.core.CameraInfo
    public final int getSensorRotationDegrees(int relativeRotation) {
        androidx.camera.camera2.pipe.CameraMetadata metadata = this.getHighSpeedVideoFpsRangesFor.getMetadata();
        android.hardware.camera2.CameraCharacteristics.Key key = android.hardware.camera2.CameraCharacteristics.SENSOR_ORIENTATION;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key, "");
        java.lang.Object obj = metadata.get((android.hardware.camera2.CameraCharacteristics.Key<java.lang.Object>) key);
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj);
        return androidx.camera.core.impl.utils.CameraOrientationUtil.getRelativeImageRotation(androidx.camera.core.impl.utils.CameraOrientationUtil.surfaceRotationToDegrees(relativeRotation), ((java.lang.Number) obj).intValue(), 1 == getLensFacing());
    }

    @Override // androidx.camera.core.CameraInfo
    public final boolean hasFlashUnit() {
        throw new java.lang.UnsupportedOperationException("Physical camera doesn't support this function");
    }

    @Override // androidx.camera.core.CameraInfo
    public final androidx.view.LiveData<java.lang.Integer> getTorchState() {
        throw new java.lang.UnsupportedOperationException("Physical camera doesn't support this function");
    }

    @Override // androidx.camera.core.CameraInfo
    public final androidx.view.LiveData<androidx.camera.core.ZoomState> getZoomState() {
        throw new java.lang.UnsupportedOperationException("Physical camera doesn't support this function");
    }

    @Override // androidx.camera.core.CameraInfo
    public final androidx.camera.core.ExposureState getExposureState() {
        throw new java.lang.UnsupportedOperationException("Physical camera doesn't support this function");
    }

    @Override // androidx.camera.core.CameraInfo
    public final androidx.view.LiveData<androidx.camera.core.CameraState> getCameraState() {
        throw new java.lang.UnsupportedOperationException("Physical camera doesn't support this function");
    }

    @Override // androidx.camera.core.CameraInfo
    public final java.lang.String getImplementationType() {
        throw new java.lang.UnsupportedOperationException("Physical camera doesn't support this function");
    }

    @Override // androidx.camera.core.CameraInfo
    public final androidx.camera.core.CameraSelector getCameraSelector() {
        throw new java.lang.UnsupportedOperationException("Physical camera doesn't support this function");
    }

    @Override // androidx.camera.core.CameraInfo
    public final int getLensFacing() {
        androidx.camera.camera2.pipe.CameraMetadata metadata = this.getHighSpeedVideoFpsRangesFor.getMetadata();
        android.hardware.camera2.CameraCharacteristics.Key key = android.hardware.camera2.CameraCharacteristics.LENS_FACING;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key, "");
        java.lang.Object obj = metadata.get((android.hardware.camera2.CameraCharacteristics.Key<java.lang.Object>) key);
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj);
        int intValue = ((java.lang.Number) obj).intValue();
        if (intValue == 0) {
            return 0;
        }
        if (intValue == 1) {
            return 1;
        }
        if (intValue == 2) {
            return 2;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("The specified lens facing integer ");
        sb.append(intValue);
        sb.append(" can not be recognized.");
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    @Override // androidx.camera.core.CameraInfo
    public final float getIntrinsicZoomRatio() {
        throw new java.lang.UnsupportedOperationException("Physical camera doesn't support this function");
    }

    @Override // androidx.camera.core.CameraInfo
    public final boolean isFocusMeteringSupported(androidx.camera.core.FocusMeteringAction action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "");
        throw new java.lang.UnsupportedOperationException("Physical camera doesn't support this function");
    }

    @Override // androidx.camera.core.CameraInfo
    public final boolean isZslSupported() {
        throw new java.lang.UnsupportedOperationException("Physical camera doesn't support this function");
    }

    @Override // androidx.camera.core.CameraInfo
    public final java.util.Set<android.util.Range<java.lang.Integer>> getSupportedFrameRateRanges() {
        throw new java.lang.UnsupportedOperationException("Physical camera doesn't support this function");
    }

    @Override // androidx.camera.core.CameraInfo
    public final boolean isLogicalMultiCameraSupported() {
        throw new java.lang.UnsupportedOperationException("Physical camera doesn't support this function");
    }

    @Override // androidx.camera.core.CameraInfo
    public final boolean isPrivateReprocessingSupported() {
        throw new java.lang.UnsupportedOperationException("Physical camera doesn't support this function");
    }

    @Override // androidx.camera.core.CameraInfo
    public final java.util.Set<androidx.camera.core.DynamicRange> querySupportedDynamicRanges(java.util.Set<androidx.camera.core.DynamicRange> candidateDynamicRanges) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(candidateDynamicRanges, "");
        throw new java.lang.UnsupportedOperationException("Physical camera doesn't support this function");
    }

    @Override // androidx.camera.core.CameraInfo
    public final java.util.Set<androidx.camera.core.CameraInfo> getPhysicalCameraInfos() {
        throw new java.lang.UnsupportedOperationException("Physical camera doesn't support this function");
    }

    @Override // androidx.camera.core.CameraInfo
    public final androidx.camera.core.CameraIdentifier getCameraIdentifier() {
        throw new java.lang.UnsupportedOperationException("Physical camera doesn't support this function");
    }

    @Override // androidx.camera.camera2.pipe.UnsafeWrapper
    public final <T> T unwrapAs(kotlin.reflect.KClass<T> type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(type, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.camera.camera2.interop.Camera2CameraInfo.class))) {
            java.lang.Object camera2CameraInfo$camera_camera2 = getCamera2CameraInfo$camera_camera2();
            kotlin.jvm.internal.Intrinsics.checkNotNull(camera2CameraInfo$camera_camera2, "");
            return (T) camera2CameraInfo$camera_camera2;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(type, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.camera.camera2.impl.CameraProperties.class))) {
            androidx.camera.camera2.impl.CameraProperties cameraProperties = this.getHighSpeedVideoFpsRangesFor;
            kotlin.jvm.internal.Intrinsics.checkNotNull(cameraProperties, "");
            return (T) cameraProperties;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(type, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(android.hardware.camera2.CameraMetadata.class))) {
            return (T) this.getHighSpeedVideoFpsRangesFor.getMetadata().unwrapAs(type);
        }
        androidx.camera.camera2.pipe.CameraMetadata metadata = this.getHighSpeedVideoFpsRangesFor.getMetadata();
        kotlin.jvm.internal.Intrinsics.checkNotNull(metadata, "");
        return (T) metadata;
    }
}
