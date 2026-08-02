package androidx.camera.camera2.internal;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Landroidx/camera/camera2/internal/CameraCompatibilityFilter;", "", "<init>", "()V", "Landroidx/camera/camera2/pipe/CameraDevices;", "cameraDevices", "", "", "availableCameraIds", "getBackwardCompatibleCameraIds", "(Landroidx/camera/camera2/pipe/CameraDevices;Ljava/util/List;)Ljava/util/List;", "cameraId", "", "isBackwardCompatible", "(Ljava/lang/String;Landroidx/camera/camera2/pipe/CameraDevices;)Z"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CameraCompatibilityFilter {
    public static final androidx.camera.camera2.internal.CameraCompatibilityFilter INSTANCE = new androidx.camera.camera2.internal.CameraCompatibilityFilter();

    private CameraCompatibilityFilter() {
    }

    @kotlin.jvm.JvmStatic
    public static final java.util.List<java.lang.String> getBackwardCompatibleCameraIds(androidx.camera.camera2.pipe.CameraDevices cameraDevices, java.util.List<java.lang.String> availableCameraIds) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraDevices, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(availableCameraIds, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str : availableCameraIds) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(str, "0") || kotlin.jvm.internal.Intrinsics.areEqual(str, "1")) {
                arrayList.add(str);
            } else if (isBackwardCompatible(str, cameraDevices)) {
                arrayList.add(str);
            } else {
                androidx.camera.camera2.impl.Camera2Logger camera2Logger = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                    java.lang.String unused = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
                }
            }
        }
        return arrayList;
    }

    @kotlin.jvm.JvmStatic
    public static final boolean isBackwardCompatible(java.lang.String cameraId, androidx.camera.camera2.pipe.CameraDevices cameraDevices) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraDevices, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(android.os.Build.FINGERPRINT, "robolectric")) {
            androidx.camera.camera2.impl.Camera2Logger camera2Logger = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
            if (!androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                return true;
            }
            java.lang.String unused = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
            return true;
        }
        try {
            androidx.camera.camera2.pipe.CameraMetadata m281awaitCameraMetadataFpsL5FU$default = androidx.camera.camera2.pipe.CameraDevices.m281awaitCameraMetadataFpsL5FU$default(cameraDevices, androidx.camera.camera2.pipe.CameraId.m393constructorimpl(cameraId), null, 2, null);
            if (m281awaitCameraMetadataFpsL5FU$default == null) {
                throw new java.lang.IllegalStateException("Required value was null.".toString());
            }
            android.hardware.camera2.CameraCharacteristics.Key key = android.hardware.camera2.CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key, "");
            int[] iArr = (int[]) m281awaitCameraMetadataFpsL5FU$default.get(key);
            if (iArr != null) {
                return kotlin.collections.ArraysKt.contains(iArr, 0);
            }
            return false;
        } catch (android.hardware.camera2.CameraAccessException e) {
            androidx.camera.camera2.impl.Camera2Logger camera2Logger2 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
            android.hardware.camera2.CameraAccessException cameraAccessException = e;
            if (androidx.camera.core.Logger.isErrorEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                java.lang.String unused2 = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
            }
            throw new androidx.camera.core.InitializationException(cameraAccessException);
        }
    }
}
