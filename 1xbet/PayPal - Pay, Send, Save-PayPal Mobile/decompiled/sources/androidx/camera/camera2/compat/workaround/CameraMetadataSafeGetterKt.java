package androidx.camera.camera2.compat.workaround;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a'\u0010\u0004\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006*\u00020\u0001¢\u0006\u0004\b\b\u0010\t\u001a\u0011\u0010\u000b\u001a\u00020\n*\u00020\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"T", "Landroidx/camera/camera2/pipe/CameraMetadata;", "Landroid/hardware/camera2/CameraCharacteristics$Key;", "key", "getSafely", "(Landroidx/camera/camera2/pipe/CameraMetadata;Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;", "Landroid/util/Range;", "", "getControlZoomRatioRangeSafely", "(Landroidx/camera/camera2/pipe/CameraMetadata;)Landroid/util/Range;", "Landroid/graphics/Rect;", "getActiveArraySizeSafely", "(Landroidx/camera/camera2/pipe/CameraMetadata;)Landroid/graphics/Rect;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CameraMetadataSafeGetterKt {
    public static final <T> T getSafely(androidx.camera.camera2.pipe.CameraMetadata cameraMetadata, android.hardware.camera2.CameraCharacteristics.Key<T> key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraMetadata, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        if (android.os.Build.VERSION.SDK_INT >= 30 && kotlin.jvm.internal.Intrinsics.areEqual(key, android.hardware.camera2.CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE)) {
            return (T) getControlZoomRatioRangeSafely(cameraMetadata);
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(key, android.hardware.camera2.CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE)) {
            return (T) getActiveArraySizeSafely(cameraMetadata);
        }
        return (T) cameraMetadata.get(key);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00ab A[Catch: AssertionError -> 0x00bf, TryCatch #0 {AssertionError -> 0x00bf, blocks: (B:3:0x0007, B:5:0x0016, B:7:0x001e, B:8:0x0028, B:11:0x003a, B:13:0x0050, B:16:0x005f, B:17:0x0078, B:19:0x008d, B:22:0x009c, B:23:0x00b5, B:25:0x00a3, B:27:0x00ab, B:28:0x00b1, B:29:0x0066, B:31:0x006e, B:32:0x0074), top: B:2:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final android.util.Range<java.lang.Float> getControlZoomRatioRangeSafely(androidx.camera.camera2.pipe.CameraMetadata cameraMetadata) {
        java.lang.Float valueOf;
        androidx.camera.camera2.internal.ZoomMath zoomMath;
        java.lang.Object upper;
        java.lang.Float valueOf2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraMetadata, "");
        try {
            android.hardware.camera2.CameraCharacteristics.Key key = android.hardware.camera2.CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key, "");
            android.util.Range range = (android.util.Range) cameraMetadata.get(key);
            if (range == null) {
                androidx.camera.camera2.impl.Camera2Logger camera2Logger = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                if (androidx.camera.core.Logger.isWarnEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                    java.lang.String unused = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
                    androidx.camera.camera2.pipe.CameraId.m398toStringimpl(cameraMetadata.getCamera());
                }
                return new android.util.Range<>(java.lang.Float.valueOf(1.0f), java.lang.Float.valueOf(1.0f));
            }
            androidx.camera.camera2.internal.ZoomMath zoomMath2 = androidx.camera.camera2.internal.ZoomMath.INSTANCE;
            java.lang.Object lower = range.getLower();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lower, "");
            if (!zoomMath2.nearZero$camera_camera2(((java.lang.Number) lower).floatValue()) && ((java.lang.Number) range.getLower()).floatValue() >= 0.0f) {
                valueOf = (java.lang.Float) range.getLower();
                zoomMath = androidx.camera.camera2.internal.ZoomMath.INSTANCE;
                upper = range.getUpper();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upper, "");
                if (!zoomMath.nearZero$camera_camera2(((java.lang.Number) upper).floatValue()) && ((java.lang.Number) range.getUpper()).floatValue() >= 0.0f) {
                    valueOf2 = (java.lang.Float) range.getUpper();
                    return new android.util.Range<>(valueOf, valueOf2);
                }
                androidx.camera.camera2.impl.Camera2Logger camera2Logger2 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                if (androidx.camera.core.Logger.isWarnEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                    java.lang.String unused2 = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
                    range.getUpper();
                }
                valueOf2 = java.lang.Float.valueOf(1.0f);
                return new android.util.Range<>(valueOf, valueOf2);
            }
            androidx.camera.camera2.impl.Camera2Logger camera2Logger3 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
            if (androidx.camera.core.Logger.isWarnEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                java.lang.String unused3 = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
                range.getLower();
            }
            valueOf = java.lang.Float.valueOf(1.0f);
            zoomMath = androidx.camera.camera2.internal.ZoomMath.INSTANCE;
            upper = range.getUpper();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upper, "");
            if (!zoomMath.nearZero$camera_camera2(((java.lang.Number) upper).floatValue())) {
                valueOf2 = (java.lang.Float) range.getUpper();
                return new android.util.Range<>(valueOf, valueOf2);
            }
            androidx.camera.camera2.impl.Camera2Logger camera2Logger22 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
            if (androidx.camera.core.Logger.isWarnEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
            }
            valueOf2 = java.lang.Float.valueOf(1.0f);
            return new android.util.Range<>(valueOf, valueOf2);
        } catch (java.lang.AssertionError e) {
            if (androidx.camera.camera2.compat.quirk.DeviceQuirks.INSTANCE.get(androidx.camera.camera2.compat.quirk.ControlZoomRatioRangeAssertionErrorQuirk.class) != null) {
                androidx.camera.camera2.impl.Camera2Logger camera2Logger4 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                    java.lang.String unused4 = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
                }
            } else {
                androidx.camera.camera2.impl.Camera2Logger camera2Logger5 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                if (androidx.camera.core.Logger.isErrorEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                    java.lang.String unused5 = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
                }
            }
            androidx.camera.camera2.impl.Camera2Logger camera2Logger6 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
            if (!androidx.camera.core.Logger.isWarnEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                return null;
            }
            java.lang.String unused6 = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
            return null;
        }
    }

    public static final android.graphics.Rect getActiveArraySizeSafely(androidx.camera.camera2.pipe.CameraMetadata cameraMetadata) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraMetadata, "");
        android.hardware.camera2.CameraCharacteristics.Key key = android.hardware.camera2.CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key, "");
        android.graphics.Rect rect = (android.graphics.Rect) cameraMetadata.get(key);
        if (rect != null) {
            return rect;
        }
        androidx.camera.camera2.impl.Camera2Logger camera2Logger = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
        if (androidx.camera.core.Logger.isWarnEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
            java.lang.String unused = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
            androidx.camera.camera2.pipe.CameraId.m398toStringimpl(cameraMetadata.getCamera());
        }
        return new android.graphics.Rect(0, 0, 4000, 3000);
    }
}
