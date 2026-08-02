package androidx.camera.camera2.pipe.compat;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a;\u0010\t\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u000e\b\u0004\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"T", "Landroidx/camera/camera2/pipe/CameraId;", "cameraId", "Landroidx/camera/camera2/pipe/internal/CameraErrorListener;", "cameraErrorListener", "Lkotlin/Function0;", "block", "catchAndReportCameraExceptions-RzXb1QE", "(Ljava/lang/String;Landroidx/camera/camera2/pipe/internal/CameraErrorListener;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "catchAndReportCameraExceptions"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ExceptionsKt {
    /* renamed from: catchAndReportCameraExceptions-RzXb1QE, reason: not valid java name */
    public static final <T> T m822catchAndReportCameraExceptionsRzXb1QE(java.lang.String str, androidx.camera.camera2.pipe.internal.CameraErrorListener cameraErrorListener, kotlin.jvm.functions.Function0<? extends T> function0) throws androidx.camera.camera2.pipe.compat.ObjectUnavailableException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraErrorListener, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        try {
            return function0.invoke();
        } catch (java.lang.Exception e) {
            if (!(e instanceof android.hardware.camera2.CameraAccessException)) {
                if (!(e instanceof java.lang.IllegalArgumentException) && !(e instanceof java.lang.SecurityException) && !(e instanceof java.lang.UnsupportedOperationException) && !(e instanceof java.lang.NullPointerException)) {
                    if (!(e instanceof java.lang.IllegalStateException)) {
                        throw e;
                    }
                    androidx.camera.camera2.pipe.core.Log.INSTANCE.getDEBUG_LOGGABLE();
                    return null;
                }
                if (androidx.camera.camera2.pipe.core.Log.INSTANCE.getWARN_LOGGABLE()) {
                    e.getMessage();
                }
                cameraErrorListener.mo790onCameraError3M5Xam4(str, androidx.camera.camera2.pipe.CameraError.INSTANCE.m339getERROR_GRAPH_CONFIGv7Vf74A(), false);
                return null;
            }
            if (androidx.camera.camera2.pipe.core.Log.INSTANCE.getWARN_LOGGABLE()) {
                e.getMessage();
            }
            cameraErrorListener.mo790onCameraError3M5Xam4(str, androidx.camera.camera2.pipe.CameraError.INSTANCE.m328fromPVuDhNw$camera_camera2_pipe((android.hardware.camera2.CameraAccessException) e), true);
            return null;
        }
    }
}
