package androidx.camera.camera2.compat;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001:\u0001\u0014J%\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/camera/camera2/compat/ZoomCompat;", "", "", "zoomRatio", "Landroidx/camera/camera2/impl/UseCaseCameraRequestControl;", "requestControl", "Lkotlinx/coroutines/Deferred;", "", "applyAsync", "(FLandroidx/camera/camera2/impl/UseCaseCameraRequestControl;)Lkotlinx/coroutines/Deferred;", "resetAsync", "(Landroidx/camera/camera2/impl/UseCaseCameraRequestControl;)Lkotlinx/coroutines/Deferred;", "Landroid/graphics/Rect;", "getCropSensorRegion", "()Landroid/graphics/Rect;", "getMinZoomRatio", "()F", "minZoomRatio", "getMaxZoomRatio", "maxZoomRatio", "Bindings"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ZoomCompat {
    kotlinx.coroutines.Deferred<kotlin.Unit> applyAsync(float zoomRatio, androidx.camera.camera2.impl.UseCaseCameraRequestControl requestControl);

    android.graphics.Rect getCropSensorRegion();

    float getMaxZoomRatio();

    float getMinZoomRatio();

    kotlinx.coroutines.Deferred<kotlin.Unit> resetAsync(androidx.camera.camera2.impl.UseCaseCameraRequestControl requestControl);

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b'\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/camera/camera2/compat/ZoomCompat$Bindings;", "", "<init>", "()V", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @dagger.Module
    public static abstract class Bindings {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final androidx.camera.camera2.compat.ZoomCompat.Bindings.Companion INSTANCE = new androidx.camera.camera2.compat.ZoomCompat.Bindings.Companion(null);

        @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/camera/camera2/compat/ZoomCompat$Bindings$Companion;", "", "<init>", "()V", "Landroidx/camera/camera2/impl/CameraProperties;", "cameraProperties", "Landroidx/camera/camera2/compat/ZoomCompat;", "provideZoomCompat", "(Landroidx/camera/camera2/impl/CameraProperties;)Landroidx/camera/camera2/compat/ZoomCompat;"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @dagger.Provides
            public final androidx.camera.camera2.compat.ZoomCompat provideZoomCompat(androidx.camera.camera2.impl.CameraProperties cameraProperties) {
                android.util.Range<java.lang.Float> controlZoomRatioRangeSafely;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraProperties, "");
                if (kotlin.jvm.internal.Intrinsics.areEqual("robolectric", android.os.Build.FINGERPRINT)) {
                    java.util.List<android.hardware.camera2.CameraCharacteristics.Key<android.graphics.Rect>> requiredCharacteristics = androidx.camera.camera2.compat.NoOpZoomCompat.INSTANCE.getRequiredCharacteristics();
                    if (!(requiredCharacteristics instanceof java.util.Collection) || !requiredCharacteristics.isEmpty()) {
                        java.util.Iterator<T> it = requiredCharacteristics.iterator();
                        while (it.hasNext()) {
                            android.hardware.camera2.CameraCharacteristics.Key key = (android.hardware.camera2.CameraCharacteristics.Key) it.next();
                            androidx.camera.camera2.impl.Camera2Logger camera2Logger = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                            if (androidx.camera.core.Logger.isWarnEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                                java.lang.String unused = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
                            }
                            androidx.camera.camera2.pipe.CameraMetadata metadata = cameraProperties.getMetadata();
                            kotlin.jvm.internal.Intrinsics.checkNotNull(key);
                            if (metadata.get(key) == null) {
                                return new androidx.camera.camera2.compat.NoOpZoomCompat(cameraProperties);
                            }
                        }
                    }
                } else if (android.os.Build.VERSION.SDK_INT >= 30 && (controlZoomRatioRangeSafely = androidx.camera.camera2.compat.workaround.CameraMetadataSafeGetterKt.getControlZoomRatioRangeSafely(cameraProperties.getMetadata())) != null) {
                    return new androidx.camera.camera2.compat.AndroidRZoomCompat(cameraProperties, controlZoomRatioRangeSafely);
                }
                return new androidx.camera.camera2.compat.CropRegionZoomCompat(cameraProperties);
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }
}
