package androidx.camera.camera2.internal;

@androidx.camera.camera2.config.CameraScope
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u000b\u001a\u00020\b*\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\r\u001a\u00020\b*\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\fJ\u001f\u0010\u000b\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u0010*\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u0010*\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0015"}, d2 = {"Landroidx/camera/camera2/internal/IntrinsicZoomCalculatorImpl;", "Landroidx/camera/camera2/internal/IntrinsicZoomCalculator;", "Landroidx/camera/camera2/pipe/CameraDevices;", "cameraDevices", "<init>", "(Landroidx/camera/camera2/pipe/CameraDevices;)V", "Landroidx/camera/camera2/pipe/CameraMetadata;", "cameraMetadata", "", "calculateIntrinsicZoomRatio", "(Landroidx/camera/camera2/pipe/CameraMetadata;)Ljava/lang/Float;", "getHighResolutionOutputSizeshNQ4ISI", "(Landroidx/camera/camera2/pipe/CameraMetadata;)F", "getHighSpeedVideoFpsRangesFor", "p0", "p1", "", "(FF)I", "getHighSpeedVideoFpsRanges", "(Landroidx/camera/camera2/pipe/CameraMetadata;)I", "Camera2StreamConfigurationMap", "Landroidx/camera/camera2/pipe/CameraDevices;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class IntrinsicZoomCalculatorImpl implements androidx.camera.camera2.internal.IntrinsicZoomCalculator {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.camera.camera2.pipe.CameraDevices getHighSpeedVideoSizes;

    @javax.inject.Inject
    public IntrinsicZoomCalculatorImpl(androidx.camera.camera2.pipe.CameraDevices cameraDevices) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraDevices, "");
        this.getHighSpeedVideoSizes = cameraDevices;
    }

    @Override // androidx.camera.camera2.internal.IntrinsicZoomCalculator
    public final java.lang.Float calculateIntrinsicZoomRatio(androidx.camera.camera2.pipe.CameraMetadata cameraMetadata) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraMetadata, "");
        try {
            return java.lang.Float.valueOf(Camera2StreamConfigurationMap(cameraMetadata) / getHighSpeedVideoFpsRanges(cameraMetadata));
        } catch (java.lang.Exception e) {
            androidx.camera.camera2.pipe.core.Log.INSTANCE.getERROR_LOGGABLE();
            return null;
        }
    }

    private static float getHighResolutionOutputSizeshNQ4ISI(androidx.camera.camera2.pipe.CameraMetadata cameraMetadata) {
        android.hardware.camera2.CameraCharacteristics.Key key = android.hardware.camera2.CameraCharacteristics.LENS_INFO_AVAILABLE_FOCAL_LENGTHS;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key, "");
        java.lang.Object checkNotNull = androidx.core.util.Preconditions.checkNotNull(cameraMetadata.get(key), "The focal lengths can not be empty.");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(checkNotNull, "");
        float[] fArr = (float[]) checkNotNull;
        androidx.core.util.Preconditions.checkState(!(fArr.length == 0), "The focal lengths can not be empty.");
        return fArr[0];
    }

    private static float getHighSpeedVideoFpsRangesFor(androidx.camera.camera2.pipe.CameraMetadata cameraMetadata) {
        android.hardware.camera2.CameraCharacteristics.Key key = android.hardware.camera2.CameraCharacteristics.SENSOR_INFO_PHYSICAL_SIZE;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key, "");
        java.lang.Object checkNotNull = androidx.core.util.Preconditions.checkNotNull(cameraMetadata.get(key), "The sensor size can't be null.");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(checkNotNull, "");
        android.util.SizeF sizeF = (android.util.SizeF) checkNotNull;
        android.hardware.camera2.CameraCharacteristics.Key key2 = android.hardware.camera2.CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key2, "");
        java.lang.Object checkNotNull2 = androidx.core.util.Preconditions.checkNotNull(cameraMetadata.get(key2), "The sensor orientation can't be null.");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(checkNotNull2, "");
        android.hardware.camera2.CameraCharacteristics.Key key3 = android.hardware.camera2.CameraCharacteristics.SENSOR_INFO_PIXEL_ARRAY_SIZE;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key3, "");
        java.lang.Object checkNotNull3 = androidx.core.util.Preconditions.checkNotNull(cameraMetadata.get(key3), "The active array size can't be null.");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(checkNotNull3, "");
        android.util.Size size = (android.util.Size) checkNotNull3;
        android.hardware.camera2.CameraCharacteristics.Key key4 = android.hardware.camera2.CameraCharacteristics.SENSOR_ORIENTATION;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key4, "");
        java.lang.Object checkNotNull4 = androidx.core.util.Preconditions.checkNotNull(cameraMetadata.get(key4), "The pixel array size can't be null.");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(checkNotNull4, "");
        int intValue = ((java.lang.Number) checkNotNull4).intValue();
        android.util.Size rectToSize = androidx.camera.core.impl.utils.TransformUtils.rectToSize((android.graphics.Rect) checkNotNull2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(rectToSize, "");
        if (androidx.camera.core.impl.utils.TransformUtils.is90or270(intValue)) {
            sizeF = androidx.camera.core.impl.utils.TransformUtils.reverseSizeF(sizeF);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sizeF, "");
            rectToSize = androidx.camera.core.impl.utils.TransformUtils.reverseSize(rectToSize);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(rectToSize, "");
            size = androidx.camera.core.impl.utils.TransformUtils.reverseSize(size);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(size, "");
        }
        return (sizeF.getWidth() * rectToSize.getWidth()) / size.getWidth();
    }

    private static int getHighResolutionOutputSizeshNQ4ISI(float p0, float p1) {
        androidx.core.util.Preconditions.checkArgument(p0 > 0.0f, "Focal length should be positive.");
        androidx.core.util.Preconditions.checkArgument(p1 > 0.0f, "Sensor length should be positive.");
        int degrees = (int) java.lang.Math.toDegrees(java.lang.Math.atan(p1 / (p0 * 2.0f)) * 2.0d);
        androidx.core.util.Preconditions.checkArgumentInRange(degrees, 0, 360, "The provided focal length and sensor length result in an invalid view angle degrees.");
        return degrees;
    }

    private static int getHighSpeedVideoFpsRanges(androidx.camera.camera2.pipe.CameraMetadata cameraMetadata) throws java.lang.IllegalStateException {
        try {
            return getHighResolutionOutputSizeshNQ4ISI(getHighResolutionOutputSizeshNQ4ISI(cameraMetadata), getHighSpeedVideoFpsRangesFor(cameraMetadata));
        } catch (java.lang.Exception e) {
            throw new java.lang.IllegalStateException("Failed to get a valid view angle", e);
        }
    }

    private final int Camera2StreamConfigurationMap(androidx.camera.camera2.pipe.CameraMetadata cameraMetadata) throws java.lang.IllegalStateException {
        try {
            java.lang.Object checkNotNull = androidx.core.util.Preconditions.checkNotNull(androidx.camera.camera2.pipe.CameraDevices.m280awaitCameraIdsSeavPBo$default(this.getHighSpeedVideoSizes, null, 1, null), "Failed to get available camera IDs");
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(checkNotNull, "");
            java.util.Iterator it = ((java.util.List) checkNotNull).iterator();
            while (it.hasNext()) {
                java.lang.String m399unboximpl = ((androidx.camera.camera2.pipe.CameraId) it.next()).m399unboximpl();
                androidx.camera.camera2.pipe.CameraMetadata m281awaitCameraMetadataFpsL5FU$default = androidx.camera.camera2.pipe.CameraDevices.m281awaitCameraMetadataFpsL5FU$default(this.getHighSpeedVideoSizes, m399unboximpl, null, 2, null);
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append("Failed to get CameraMetadata for ");
                sb.append((java.lang.Object) androidx.camera.camera2.pipe.CameraId.m398toStringimpl(m399unboximpl));
                java.lang.Object checkNotNull2 = androidx.core.util.Preconditions.checkNotNull(m281awaitCameraMetadataFpsL5FU$default, sb.toString());
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(checkNotNull2, "");
                androidx.camera.camera2.pipe.CameraMetadata cameraMetadata2 = (androidx.camera.camera2.pipe.CameraMetadata) checkNotNull2;
                android.hardware.camera2.CameraCharacteristics.Key key = android.hardware.camera2.CameraCharacteristics.LENS_FACING;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key, "");
                java.lang.Object obj = cameraMetadata2.get((android.hardware.camera2.CameraCharacteristics.Key<java.lang.Object>) key);
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append("Failed to get CameraCharacteristics.LENS_FACING for ");
                sb2.append((java.lang.Object) androidx.camera.camera2.pipe.CameraId.m398toStringimpl(m399unboximpl));
                java.lang.Object checkNotNull3 = androidx.core.util.Preconditions.checkNotNull(obj, sb2.toString());
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(checkNotNull3, "");
                int intValue = ((java.lang.Number) checkNotNull3).intValue();
                android.hardware.camera2.CameraCharacteristics.Key key2 = android.hardware.camera2.CameraCharacteristics.LENS_FACING;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key2, "");
                java.lang.Object obj2 = cameraMetadata.get((android.hardware.camera2.CameraCharacteristics.Key<java.lang.Object>) key2);
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                sb3.append("Failed to get the required LENS_FACING for ");
                sb3.append((java.lang.Object) androidx.camera.camera2.pipe.CameraId.m398toStringimpl(cameraMetadata.mo411getCameraDz_R5H8()));
                java.lang.Object checkNotNull4 = androidx.core.util.Preconditions.checkNotNull(obj2, sb3.toString());
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(checkNotNull4, "");
                if (intValue == ((java.lang.Number) checkNotNull4).intValue()) {
                    return getHighResolutionOutputSizeshNQ4ISI(getHighResolutionOutputSizeshNQ4ISI(cameraMetadata2), getHighSpeedVideoFpsRangesFor(cameraMetadata2));
                }
            }
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
            sb4.append("Could not find the default camera for ");
            sb4.append((java.lang.Object) androidx.camera.camera2.pipe.CameraId.m398toStringimpl(cameraMetadata.mo411getCameraDz_R5H8()));
            throw new java.lang.IllegalStateException(sb4.toString());
        } catch (java.lang.Exception e) {
            throw new java.lang.IllegalStateException("Failed to get a valid view angle", e);
        }
    }
}
