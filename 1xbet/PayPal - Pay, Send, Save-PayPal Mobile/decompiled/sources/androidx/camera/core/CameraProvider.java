package androidx.camera.core;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\b\u0010\fJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\u00168'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R \u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00160\u00168'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00048'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/camera/core/CameraProvider;", "", "Landroidx/camera/core/CameraSelector;", "cameraSelector", "", "hasCamera", "(Landroidx/camera/core/CameraSelector;)Z", "Landroidx/camera/core/CameraInfo;", "getCameraInfo", "(Landroidx/camera/core/CameraSelector;)Landroidx/camera/core/CameraInfo;", "Landroidx/camera/core/SessionConfig;", "sessionConfig", "(Landroidx/camera/core/CameraSelector;Landroidx/camera/core/SessionConfig;)Landroidx/camera/core/CameraInfo;", "Ljava/util/concurrent/Executor;", "executor", "Landroidx/camera/core/CameraPresenceListener;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "addCameraPresenceListener", "(Ljava/util/concurrent/Executor;Landroidx/camera/core/CameraPresenceListener;)V", "removeCameraPresenceListener", "(Landroidx/camera/core/CameraPresenceListener;)V", "", "getAvailableCameraInfos", "()Ljava/util/List;", "availableCameraInfos", "getAvailableConcurrentCameraInfos", "availableConcurrentCameraInfos", "isConcurrentCameraModeOn", "()Z"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface CameraProvider {
    java.util.List<androidx.camera.core.CameraInfo> getAvailableCameraInfos();

    java.util.List<java.util.List<androidx.camera.core.CameraInfo>> getAvailableConcurrentCameraInfos();

    boolean hasCamera(androidx.camera.core.CameraSelector cameraSelector) throws androidx.camera.core.CameraInfoUnavailableException;

    boolean isConcurrentCameraModeOn();

    default androidx.camera.core.CameraInfo getCameraInfo(androidx.camera.core.CameraSelector cameraSelector) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraSelector, "");
        throw new java.lang.UnsupportedOperationException("The camera provider is not implemented properly.");
    }

    default androidx.camera.core.CameraInfo getCameraInfo(androidx.camera.core.CameraSelector cameraSelector, androidx.camera.core.SessionConfig sessionConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraSelector, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionConfig, "");
        throw new java.lang.UnsupportedOperationException("The camera provider is not implemented properly.");
    }

    default void addCameraPresenceListener(java.util.concurrent.Executor executor, androidx.camera.core.CameraPresenceListener listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "");
        throw new java.lang.UnsupportedOperationException("The camera provider is not implemented properly.");
    }

    default void removeCameraPresenceListener(androidx.camera.core.CameraPresenceListener listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "");
        throw new java.lang.UnsupportedOperationException("The camera provider is not implemented properly.");
    }
}
