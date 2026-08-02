package androidx.camera.camera2.impl;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J(\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H¦@¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H&¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0014H&¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00198'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0003"}, d2 = {"Landroidx/camera/camera2/impl/UseCaseCamera;", "", "", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "()V", "", "captureMode", "flashMode", "flashType", "Landroidx/camera/core/imagecapture/CameraCapturePipeline;", "getCameraCapturePipeline", "(IIILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "enabled", "setActiveResumeMode", "(Z)V", "isPrimary", "", "Landroidx/camera/core/UseCase;", "runningUseCases", "Lkotlinx/coroutines/Job;", "updateRepeatingRequestAsync", "(ZLjava/util/Collection;)Lkotlinx/coroutines/Job;", "close", "()Lkotlinx/coroutines/Job;", "Landroidx/camera/camera2/impl/UseCaseCameraRequestControl;", "getRequestControl", "()Landroidx/camera/camera2/impl/UseCaseCameraRequestControl;", "requestControl"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface UseCaseCamera {
    kotlinx.coroutines.Job close();

    java.lang.Object getCameraCapturePipeline(int i, int i2, int i3, kotlin.coroutines.Continuation<? super androidx.camera.core.imagecapture.CameraCapturePipeline> continuation);

    androidx.camera.camera2.impl.UseCaseCameraRequestControl getRequestControl();

    default void setActiveResumeMode(boolean enabled) {
    }

    void start();

    kotlinx.coroutines.Job updateRepeatingRequestAsync(boolean isPrimary, java.util.Collection<? extends androidx.camera.core.UseCase> runningUseCases);

    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static void setActiveResumeMode(androidx.camera.camera2.impl.UseCaseCamera useCaseCamera, boolean z) {
            androidx.camera.camera2.impl.UseCaseCamera.super.setActiveResumeMode(z);
        }
    }
}
