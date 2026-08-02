package androidx.camera.camera2.pipe.compat;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/hardware/camera2/CameraDevice;", "", "closeWithTrace", "(Landroid/hardware/camera2/CameraDevice;)V"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CameraDeviceWrapperKt {
    public static final void closeWithTrace(android.hardware.camera2.CameraDevice cameraDevice) {
        if (cameraDevice != null) {
            if (androidx.camera.camera2.pipe.core.Log.INSTANCE.getINFO_LOGGABLE()) {
                cameraDevice.getId();
            }
            androidx.camera.camera2.pipe.core.Debug debug = androidx.camera.camera2.pipe.core.Debug.INSTANCE;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CXCP#CameraDevice-");
            sb.append(cameraDevice.getId());
            sb.append("#close");
            java.lang.String obj = sb.toString();
            long mo885nowvQl9yQU = debug.getSystemTimeSource$camera_camera2_pipe().mo885nowvQl9yQU();
            try {
                android.os.Trace.beginSection(obj);
                try {
                    cameraDevice.close();
                } catch (java.lang.NullPointerException e) {
                    java.lang.NullPointerException nullPointerException = e;
                    androidx.camera.camera2.pipe.core.Log.INSTANCE.getWARN_LOGGABLE();
                }
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            } finally {
                android.os.Trace.endSection();
                long m872constructorimpl = androidx.camera.camera2.pipe.core.DurationNs.m872constructorimpl(debug.getSystemTimeSource$camera_camera2_pipe().mo885nowvQl9yQU() - mo885nowvQl9yQU);
                if (androidx.camera.camera2.pipe.core.Log.INSTANCE.getDEBUG_LOGGABLE()) {
                    androidx.camera.camera2.pipe.core.Timestamps timestamps = androidx.camera.camera2.pipe.core.Timestamps.INSTANCE;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(java.lang.String.format(null, "%.3f ms", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Double.valueOf(m872constructorimpl / 1000000.0d)}, 1)), "");
                }
            }
        }
    }
}
