package androidx.camera.camera2.compat;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0016\u001a\u00020\u00068\u0017X\u0096D¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u00068\u0017X\u0097D¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019"}, d2 = {"Landroidx/camera/camera2/compat/NoOpZoomCompat;", "Landroidx/camera/camera2/compat/ZoomCompat;", "Landroidx/camera/camera2/impl/CameraProperties;", "cameraProperties", "<init>", "(Landroidx/camera/camera2/impl/CameraProperties;)V", "", "zoomRatio", "Landroidx/camera/camera2/impl/UseCaseCameraRequestControl;", "requestControl", "Lkotlinx/coroutines/Deferred;", "", "applyAsync", "(FLandroidx/camera/camera2/impl/UseCaseCameraRequestControl;)Lkotlinx/coroutines/Deferred;", "resetAsync", "(Landroidx/camera/camera2/impl/UseCaseCameraRequestControl;)Lkotlinx/coroutines/Deferred;", "Landroid/graphics/Rect;", "getCropSensorRegion", "()Landroid/graphics/Rect;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/camera/camera2/impl/CameraProperties;", "Camera2StreamConfigurationMap", "minZoomRatio", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getMinZoomRatio", "()F", "maxZoomRatio", "getMaxZoomRatio", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class NoOpZoomCompat implements androidx.camera.camera2.compat.ZoomCompat {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.camera.camera2.compat.NoOpZoomCompat.Companion INSTANCE = new androidx.camera.camera2.compat.NoOpZoomCompat.Companion(null);
    private static final java.util.List<android.hardware.camera2.CameraCharacteristics.Key<android.graphics.Rect>> getHighSpeedVideoSizes = kotlin.collections.CollectionsKt.listOf(android.hardware.camera2.CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.camera.camera2.impl.CameraProperties Camera2StreamConfigurationMap;
    private final float maxZoomRatio;
    private final float minZoomRatio;

    public NoOpZoomCompat(androidx.camera.camera2.impl.CameraProperties cameraProperties) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraProperties, "");
        this.Camera2StreamConfigurationMap = cameraProperties;
        this.minZoomRatio = 1.0f;
        this.maxZoomRatio = 1.0f;
    }

    @Override // androidx.camera.camera2.compat.ZoomCompat
    public final float getMinZoomRatio() {
        return this.minZoomRatio;
    }

    @Override // androidx.camera.camera2.compat.ZoomCompat
    public final float getMaxZoomRatio() {
        return this.maxZoomRatio;
    }

    @Override // androidx.camera.camera2.compat.ZoomCompat
    public final kotlinx.coroutines.Deferred<kotlin.Unit> applyAsync(float zoomRatio, androidx.camera.camera2.impl.UseCaseCameraRequestControl requestControl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestControl, "");
        return kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred(kotlin.Unit.INSTANCE);
    }

    @Override // androidx.camera.camera2.compat.ZoomCompat
    public final kotlinx.coroutines.Deferred<kotlin.Unit> resetAsync(androidx.camera.camera2.impl.UseCaseCameraRequestControl requestControl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestControl, "");
        return kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred(kotlin.Unit.INSTANCE);
    }

    @Override // androidx.camera.camera2.compat.ZoomCompat
    public final android.graphics.Rect getCropSensorRegion() {
        return androidx.camera.camera2.compat.workaround.CameraMetadataSafeGetterKt.getActiveArraySizeSafely(this.Camera2StreamConfigurationMap.getMetadata());
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R*\u0010\u0004\u001a\u001b\u0012\u0017\u0012\u0015\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u00070\u0006¢\u0006\u0002\b\t0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/camera/camera2/compat/NoOpZoomCompat$Companion;", "", "<init>", "()V", "requiredCharacteristics", "", "Landroid/hardware/camera2/CameraCharacteristics$Key;", "Landroid/graphics/Rect;", "kotlin.jvm.PlatformType", "Lkotlin/jvm/internal/EnhancedNullability;", "getRequiredCharacteristics", "()Ljava/util/List;", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.util.List<android.hardware.camera2.CameraCharacteristics.Key<android.graphics.Rect>> getRequiredCharacteristics() {
            return androidx.camera.camera2.compat.NoOpZoomCompat.getHighSpeedVideoSizes;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
