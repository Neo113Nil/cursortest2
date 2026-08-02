package androidx.camera.camera2.pipe;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/camera/camera2/pipe/CameraContext;", "", "Landroid/content/Context;", "getAppContext", "()Landroid/content/Context;", "appContext", "Landroidx/camera/camera2/pipe/core/Threads;", "getThreads", "()Landroidx/camera/camera2/pipe/core/Threads;", "threads", "Landroidx/camera/camera2/pipe/CameraBackends;", "getCameraBackends", "()Landroidx/camera/camera2/pipe/CameraBackends;", "cameraBackends"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public interface CameraContext {
    android.content.Context getAppContext();

    androidx.camera.camera2.pipe.CameraBackends getCameraBackends();

    androidx.camera.camera2.pipe.core.Threads getThreads();
}
