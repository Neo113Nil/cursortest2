package androidx.camera.camera2.impl;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\"\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/camera/camera2/impl/CameraProperties;", "cameraProperties", "Landroidx/camera/camera2/impl/DisplayInfoManager;", "displayInfoManager", "Landroid/util/Size;", "getProperPreviewSize", "(Landroidx/camera/camera2/impl/CameraProperties;Landroidx/camera/camera2/impl/DisplayInfoManager;)Landroid/util/Size;", "getHighSpeedVideoSizes", "Landroid/util/Size;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MeteringRepeatingKt {
    private static final android.util.Size getHighSpeedVideoSizes = new android.util.Size(640, androidx.window.core.layout.WindowSizeClass.HEIGHT_DP_MEDIUM_LOWER_BOUND);

    /* JADX WARN: Code restructure failed: missing block: B:30:0x008b, code lost:
    
        if (r0 == null) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final android.util.Size getProperPreviewSize(androidx.camera.camera2.impl.CameraProperties cameraProperties, androidx.camera.camera2.impl.DisplayInfoManager displayInfoManager) {
        android.util.Size[] outputSizes;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraProperties, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(displayInfoManager, "");
        androidx.camera.camera2.pipe.CameraMetadata metadata = cameraProperties.getMetadata();
        android.hardware.camera2.CameraCharacteristics.Key key = android.hardware.camera2.CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key, "");
        android.hardware.camera2.params.StreamConfigurationMap streamConfigurationMap = (android.hardware.camera2.params.StreamConfigurationMap) metadata.get(key);
        android.util.Size size = null;
        if (streamConfigurationMap == null) {
            androidx.camera.camera2.impl.Camera2Logger camera2Logger = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
            if (androidx.camera.core.Logger.isErrorEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                java.lang.String unused = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
            }
            outputSizes = null;
        } else {
            outputSizes = streamConfigurationMap.getOutputSizes(34);
        }
        if (outputSizes == null) {
            return getHighSpeedVideoSizes;
        }
        if (outputSizes.length == 0) {
            return getHighSpeedVideoSizes;
        }
        android.util.Size[] supportedRepeatingSurfaceSizes = androidx.camera.camera2.compat.workaround.SupportedRepeatingSurfaceSizeKt.getSupportedRepeatingSurfaceSizes(outputSizes);
        if (supportedRepeatingSurfaceSizes.length == 0) {
            androidx.camera.camera2.impl.Camera2Logger camera2Logger2 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
            if (androidx.camera.core.Logger.isWarnEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                java.lang.String unused2 = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
            }
        } else {
            outputSizes = supportedRepeatingSurfaceSizes;
        }
        if (outputSizes.length > 1) {
            kotlin.collections.ArraysKt.sortWith(outputSizes, new java.util.Comparator() { // from class: androidx.camera.camera2.impl.MeteringRepeatingKt$getProperPreviewSize$$inlined$sortBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    android.util.Size size2 = (android.util.Size) t;
                    android.util.Size size3 = (android.util.Size) t2;
                    return kotlin.comparisons.ComparisonsKt.compareValues(java.lang.Long.valueOf(size2.getWidth() * size2.getHeight()), java.lang.Long.valueOf(size3.getWidth() * size3.getHeight()));
                }
            });
        }
        android.util.Size previewSize = displayInfoManager.getPreviewSize();
        long min = java.lang.Math.min(307200L, previewSize.getWidth() * previewSize.getHeight());
        int length = outputSizes.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            android.util.Size size2 = outputSizes[i];
            long width = size2.getWidth() * size2.getHeight();
            if (width == min) {
                return size2;
            }
            if (width <= min) {
                i++;
                size = size2;
            }
        }
        if (size == null) {
            return outputSizes[0];
        }
        return size;
    }
}
