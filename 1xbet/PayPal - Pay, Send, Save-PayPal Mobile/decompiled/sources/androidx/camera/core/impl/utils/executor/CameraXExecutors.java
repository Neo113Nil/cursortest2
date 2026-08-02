package androidx.camera.core.impl.utils.executor;

/* loaded from: classes6.dex */
public final class CameraXExecutors {
    private CameraXExecutors() {
    }

    public static java.util.concurrent.ScheduledExecutorService mainThreadExecutor() {
        return androidx.camera.core.impl.utils.executor.MainThreadExecutor.Camera2StreamConfigurationMap();
    }

    public static java.util.concurrent.Executor ioExecutor() {
        return androidx.camera.core.impl.utils.executor.IoExecutor.Camera2StreamConfigurationMap();
    }

    public static java.util.concurrent.Executor audioExecutor() {
        return androidx.camera.core.impl.utils.executor.AudioExecutor.getHighSpeedVideoSizes();
    }

    public static java.util.concurrent.Executor directExecutor() {
        return androidx.camera.core.impl.utils.executor.DirectExecutor.getHighSpeedVideoFpsRanges();
    }

    public static java.util.concurrent.Executor newSequentialExecutor(java.util.concurrent.Executor executor) {
        return new androidx.camera.core.impl.utils.executor.SequentialExecutor(executor);
    }

    public static boolean isSequentialExecutor(java.util.concurrent.Executor executor) {
        return executor instanceof androidx.camera.core.impl.utils.executor.SequentialExecutor;
    }

    public static java.util.concurrent.ScheduledExecutorService myLooperExecutor() {
        return androidx.camera.core.impl.utils.executor.HandlerScheduledExecutorService.getHighSpeedVideoFpsRanges();
    }

    public static java.util.concurrent.ScheduledExecutorService newHandlerExecutor(android.os.Handler handler) {
        return new androidx.camera.core.impl.utils.executor.HandlerScheduledExecutorService(handler);
    }

    public static java.util.concurrent.Executor highPriorityExecutor() {
        return androidx.camera.core.impl.utils.executor.HighPriorityExecutor.getHighSpeedVideoFpsRanges();
    }
}
