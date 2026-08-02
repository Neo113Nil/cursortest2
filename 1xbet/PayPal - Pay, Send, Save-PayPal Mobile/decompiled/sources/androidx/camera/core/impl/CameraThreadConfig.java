package androidx.camera.core.impl;

/* loaded from: classes6.dex */
public abstract class CameraThreadConfig {
    public abstract java.util.concurrent.Executor getCameraExecutor();

    public abstract android.os.Handler getSchedulerHandler();

    public static androidx.camera.core.impl.CameraThreadConfig create(java.util.concurrent.Executor executor, android.os.Handler handler) {
        return new androidx.camera.core.impl.AutoValue_CameraThreadConfig(executor, handler);
    }
}
