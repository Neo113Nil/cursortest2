package androidx.camera.camera2.pipe;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\nJA\u0010\u0013\u001a\u00020\u00122\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H&¢\u0006\u0004\b\u001b\u0010\u001cø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/camera/camera2/pipe/PlatformApiCompat;", "", "", "isMultiResolutionConcurrentReadersEnabled", "()Z", "Landroid/hardware/camera2/params/MultiResolutionStreamConfigurationMap;", "multiResolutionStreamConfigurationMap", "", "format", "isConcurrentReadersSupported", "(Landroid/hardware/camera2/params/MultiResolutionStreamConfigurationMap;I)Z", "", "Landroid/hardware/camera2/params/MultiResolutionStreamInfo;", "streams", "maxImages", "", "usage", "concurrentOutputsEnabled", "Landroid/hardware/camera2/MultiResolutionImageReader;", "buildMultiResolutionImageReader", "(Ljava/util/Collection;IILjava/lang/Long;Ljava/lang/Boolean;)Landroid/hardware/camera2/MultiResolutionImageReader;", "multiResolutionImageReader", "Ljava/util/concurrent/Executor;", "executor", "Landroidx/camera/camera2/pipe/CameraOnActiveOutputSurfacesListener;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "setOnActiveOutputSurfacesListener", "(Landroid/hardware/camera2/MultiResolutionImageReader;Ljava/util/concurrent/Executor;Landroidx/camera/camera2/pipe/CameraOnActiveOutputSurfacesListener;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface PlatformApiCompat {
    default boolean isMultiResolutionConcurrentReadersEnabled() {
        return false;
    }

    default boolean isConcurrentReadersSupported(android.hardware.camera2.params.MultiResolutionStreamConfigurationMap multiResolutionStreamConfigurationMap, int format) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(multiResolutionStreamConfigurationMap, "");
        throw new java.lang.UnsupportedOperationException("API not supported on current platform");
    }

    default android.hardware.camera2.MultiResolutionImageReader buildMultiResolutionImageReader(java.util.Collection<? extends android.hardware.camera2.params.MultiResolutionStreamInfo> streams, int format, int maxImages, java.lang.Long usage, java.lang.Boolean concurrentOutputsEnabled) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(streams, "");
        throw new java.lang.UnsupportedOperationException("API not supported on current platform");
    }

    default void setOnActiveOutputSurfacesListener(android.hardware.camera2.MultiResolutionImageReader multiResolutionImageReader, java.util.concurrent.Executor executor, androidx.camera.camera2.pipe.CameraOnActiveOutputSurfacesListener listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(multiResolutionImageReader, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "");
        throw new java.lang.UnsupportedOperationException("API not supported on current platform");
    }
}
