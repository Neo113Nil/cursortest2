package androidx.camera.camera2.pipe.compat;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001:\u0001\bJ\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/camera/camera2/pipe/compat/CameraAvailabilityMonitor;", "", "Landroidx/camera/camera2/pipe/CameraId;", "cameraId", "Landroidx/camera/camera2/pipe/compat/CameraAvailabilityMonitor$Session;", "startMonitoring-0r8Bogc", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startMonitoring", "Session"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface CameraAvailabilityMonitor {

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\bf\u0018\u00002\u00060\u0001j\u0002`\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H¦@¢\u0006\u0002\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Landroidx/camera/camera2/pipe/compat/CameraAvailabilityMonitor$Session;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "awaitAvailableCamera", "", "timeoutMillis", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Session extends java.lang.AutoCloseable {
        java.lang.Object awaitAvailableCamera(long j, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation);
    }

    /* renamed from: startMonitoring-0r8Bogc */
    java.lang.Object mo776startMonitoring0r8Bogc(java.lang.String str, kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.compat.CameraAvailabilityMonitor.Session> continuation);
}
