package androidx.camera.camera2.compat;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00068WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00068WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001bR\u0018\u0010 \u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u001fR\u0014\u0010!\u001a\u00020\u00108\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b \u0010\u001f"}, d2 = {"Landroidx/camera/camera2/compat/CropRegionZoomCompat;", "Landroidx/camera/camera2/compat/ZoomCompat;", "Landroidx/camera/camera2/impl/CameraProperties;", "cameraProperties", "<init>", "(Landroidx/camera/camera2/impl/CameraProperties;)V", "", "zoomRatio", "Landroidx/camera/camera2/impl/UseCaseCameraRequestControl;", "requestControl", "Lkotlinx/coroutines/Deferred;", "", "applyAsync", "(FLandroidx/camera/camera2/impl/UseCaseCameraRequestControl;)Lkotlinx/coroutines/Deferred;", "resetAsync", "(Landroidx/camera/camera2/impl/UseCaseCameraRequestControl;)Lkotlinx/coroutines/Deferred;", "Landroid/graphics/Rect;", "getCropSensorRegion", "()Landroid/graphics/Rect;", "p0", "p1", "getHighSpeedVideoSizes", "(Landroid/graphics/Rect;F)Landroid/graphics/Rect;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/camera/camera2/impl/CameraProperties;", "getHighSpeedVideoFpsRangesFor", "getMinZoomRatio", "()F", "minZoomRatio", "getMaxZoomRatio", "maxZoomRatio", "Landroid/graphics/Rect;", "getHighSpeedVideoFpsRanges", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CropRegionZoomCompat implements androidx.camera.camera2.compat.ZoomCompat {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.camera.camera2.impl.CameraProperties getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final android.graphics.Rect Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private android.graphics.Rect getHighSpeedVideoFpsRanges;

    @Override // androidx.camera.camera2.compat.ZoomCompat
    public final float getMinZoomRatio() {
        return 1.0f;
    }

    public CropRegionZoomCompat(androidx.camera.camera2.impl.CameraProperties cameraProperties) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraProperties, "");
        this.getHighSpeedVideoFpsRangesFor = cameraProperties;
        androidx.camera.camera2.pipe.CameraMetadata metadata = cameraProperties.getMetadata();
        android.hardware.camera2.CameraCharacteristics.Key key = android.hardware.camera2.CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key, "");
        java.lang.Object obj = metadata.get((android.hardware.camera2.CameraCharacteristics.Key<java.lang.Object>) key);
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj);
        this.Camera2StreamConfigurationMap = (android.graphics.Rect) obj;
    }

    @Override // androidx.camera.camera2.compat.ZoomCompat
    public final float getMaxZoomRatio() {
        androidx.camera.camera2.pipe.CameraMetadata metadata = this.getHighSpeedVideoFpsRangesFor.getMetadata();
        android.hardware.camera2.CameraCharacteristics.Key key = android.hardware.camera2.CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key, "");
        java.lang.Float f = (java.lang.Float) metadata.getOrDefault((android.hardware.camera2.CameraCharacteristics.Key<android.hardware.camera2.CameraCharacteristics.Key>) key, (android.hardware.camera2.CameraCharacteristics.Key) java.lang.Float.valueOf(getMinZoomRatio()));
        androidx.camera.camera2.internal.ZoomMath zoomMath = androidx.camera.camera2.internal.ZoomMath.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(f);
        if (zoomMath.nearZero$camera_camera2(f.floatValue())) {
            androidx.camera.camera2.impl.Camera2Logger camera2Logger = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
            if (!androidx.camera.core.Logger.isWarnEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                return 1.0f;
            }
            java.lang.String unused = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
            return 1.0f;
        }
        return f.floatValue();
    }

    @Override // androidx.camera.camera2.compat.ZoomCompat
    public final kotlinx.coroutines.Deferred<kotlin.Unit> applyAsync(float zoomRatio, androidx.camera.camera2.impl.UseCaseCameraRequestControl requestControl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestControl, "");
        this.getHighSpeedVideoFpsRanges = getHighSpeedVideoSizes(this.Camera2StreamConfigurationMap, zoomRatio);
        android.hardware.camera2.CaptureRequest.Key key = android.hardware.camera2.CaptureRequest.SCALER_CROP_REGION;
        android.graphics.Rect rect = this.getHighSpeedVideoFpsRanges;
        kotlin.jvm.internal.Intrinsics.checkNotNull(rect, "");
        return androidx.camera.camera2.impl.UseCaseCameraRequestControl.setParametersAsync$default(requestControl, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(key, rect)), null, null, 6, null);
    }

    @Override // androidx.camera.camera2.compat.ZoomCompat
    public final kotlinx.coroutines.Deferred<kotlin.Unit> resetAsync(androidx.camera.camera2.impl.UseCaseCameraRequestControl requestControl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestControl, "");
        return androidx.camera.camera2.impl.UseCaseCameraRequestControl.removeParametersAsync$default(requestControl, kotlin.collections.CollectionsKt.listOf(android.hardware.camera2.CaptureRequest.SCALER_CROP_REGION), null, 2, null);
    }

    @Override // androidx.camera.camera2.compat.ZoomCompat
    public final android.graphics.Rect getCropSensorRegion() {
        android.graphics.Rect rect = this.getHighSpeedVideoFpsRanges;
        return rect == null ? this.Camera2StreamConfigurationMap : rect;
    }

    private final android.graphics.Rect getHighSpeedVideoSizes(android.graphics.Rect p0, float p1) {
        if (androidx.camera.camera2.internal.ZoomMath.INSTANCE.nearZero$camera_camera2(p1)) {
            androidx.camera.camera2.impl.Camera2Logger camera2Logger = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
            if (androidx.camera.core.Logger.isWarnEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                java.lang.String unused = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
            }
            p1 = 1.0f;
        }
        float width = p0.width() / p1;
        float height = p0.height() / p1;
        float width2 = (p0.width() - width) / 2.0f;
        float height2 = (p0.height() - height) / 2.0f;
        return new android.graphics.Rect((int) width2, (int) height2, (int) (width2 + width), (int) (height2 + height));
    }
}
