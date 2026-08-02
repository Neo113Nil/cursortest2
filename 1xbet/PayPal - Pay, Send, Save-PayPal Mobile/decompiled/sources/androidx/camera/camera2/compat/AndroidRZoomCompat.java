package androidx.camera.camera2.compat;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001a"}, d2 = {"Landroidx/camera/camera2/compat/AndroidRZoomCompat;", "Landroidx/camera/camera2/compat/ZoomCompat;", "Landroidx/camera/camera2/impl/CameraProperties;", "cameraProperties", "Landroid/util/Range;", "", "range", "<init>", "(Landroidx/camera/camera2/impl/CameraProperties;Landroid/util/Range;)V", "zoomRatio", "Landroidx/camera/camera2/impl/UseCaseCameraRequestControl;", "requestControl", "Lkotlinx/coroutines/Deferred;", "", "applyAsync", "(FLandroidx/camera/camera2/impl/UseCaseCameraRequestControl;)Lkotlinx/coroutines/Deferred;", "resetAsync", "(Landroidx/camera/camera2/impl/UseCaseCameraRequestControl;)Lkotlinx/coroutines/Deferred;", "Landroid/graphics/Rect;", "getCropSensorRegion", "()Landroid/graphics/Rect;", "Camera2StreamConfigurationMap", "Landroidx/camera/camera2/impl/CameraProperties;", "getHighResolutionOutputSizeshNQ4ISI", "Landroid/util/Range;", "getMinZoomRatio", "()F", "minZoomRatio", "getMaxZoomRatio", "maxZoomRatio"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidRZoomCompat implements androidx.camera.camera2.compat.ZoomCompat {
    private final androidx.camera.camera2.impl.CameraProperties Camera2StreamConfigurationMap;
    private final android.util.Range<java.lang.Float> getHighResolutionOutputSizeshNQ4ISI;

    public AndroidRZoomCompat(androidx.camera.camera2.impl.CameraProperties cameraProperties, android.util.Range<java.lang.Float> range) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraProperties, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(range, "");
        this.Camera2StreamConfigurationMap = cameraProperties;
        this.getHighResolutionOutputSizeshNQ4ISI = range;
    }

    @Override // androidx.camera.camera2.compat.ZoomCompat
    public final float getMinZoomRatio() {
        java.lang.Float lower = this.getHighResolutionOutputSizeshNQ4ISI.getLower();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lower, "");
        return lower.floatValue();
    }

    @Override // androidx.camera.camera2.compat.ZoomCompat
    public final float getMaxZoomRatio() {
        java.lang.Float upper = this.getHighResolutionOutputSizeshNQ4ISI.getUpper();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upper, "");
        return upper.floatValue();
    }

    @Override // androidx.camera.camera2.compat.ZoomCompat
    public final kotlinx.coroutines.Deferred<kotlin.Unit> applyAsync(float zoomRatio, androidx.camera.camera2.impl.UseCaseCameraRequestControl requestControl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestControl, "");
        float minZoomRatio = getMinZoomRatio();
        if (zoomRatio > getMaxZoomRatio() || minZoomRatio > zoomRatio) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
        java.util.Map mutableMapOf = kotlin.collections.MapsKt.mutableMapOf(kotlin.TuplesKt.to(android.hardware.camera2.CaptureRequest.CONTROL_ZOOM_RATIO, java.lang.Float.valueOf(zoomRatio)));
        if (android.os.Build.VERSION.SDK_INT >= 34 && androidx.camera.camera2.pipe.CameraMetadata.INSTANCE.getSupportsZoomOverride(this.Camera2StreamConfigurationMap.getMetadata())) {
            androidx.camera.camera2.compat.Api34Compat.setSettingsOverrideZoom(mutableMapOf);
        }
        return androidx.camera.camera2.impl.UseCaseCameraRequestControl.setParametersAsync$default(requestControl, mutableMapOf, null, null, 6, null);
    }

    @Override // androidx.camera.camera2.compat.ZoomCompat
    public final kotlinx.coroutines.Deferred<kotlin.Unit> resetAsync(androidx.camera.camera2.impl.UseCaseCameraRequestControl requestControl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestControl, "");
        android.hardware.camera2.CaptureRequest.Key key = android.hardware.camera2.CaptureRequest.CONTROL_ZOOM_RATIO;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key, "");
        java.util.List mutableListOf = kotlin.collections.CollectionsKt.mutableListOf(key);
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            android.hardware.camera2.CaptureRequest.Key key2 = android.hardware.camera2.CaptureRequest.CONTROL_SETTINGS_OVERRIDE;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key2, "");
            mutableListOf.add(key2);
        }
        return androidx.camera.camera2.impl.UseCaseCameraRequestControl.removeParametersAsync$default(requestControl, mutableListOf, null, 2, null);
    }

    @Override // androidx.camera.camera2.compat.ZoomCompat
    public final android.graphics.Rect getCropSensorRegion() {
        androidx.camera.camera2.pipe.CameraMetadata metadata = this.Camera2StreamConfigurationMap.getMetadata();
        android.hardware.camera2.CameraCharacteristics.Key key = android.hardware.camera2.CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key, "");
        java.lang.Object obj = metadata.get((android.hardware.camera2.CameraCharacteristics.Key<java.lang.Object>) key);
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj);
        return (android.graphics.Rect) obj;
    }
}
