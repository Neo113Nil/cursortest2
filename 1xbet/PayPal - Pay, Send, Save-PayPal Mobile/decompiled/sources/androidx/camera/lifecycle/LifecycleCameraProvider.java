package androidx.camera.lifecycle;

@kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 \"2\u00020\u0001:\u0001\"J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\u0005\u0010\tJ'\u0010\r\u001a\u00020\f2\u0016\u0010\u000b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\n\"\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\r\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\fH&¢\u0006\u0004\b\u0010\u0010\u0011J7\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0016\u0010\u000b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\n\"\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0019H&¢\u0006\u0004\b\u0017\u0010\u001bJ'\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\u0017\u0010\u001cJ\u001f\u0010\u0017\u001a\u00020 2\u000e\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u001dH&¢\u0006\u0004\b\u0017\u0010!ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/camera/lifecycle/LifecycleCameraProvider;", "Landroidx/camera/core/CameraProvider;", "Landroidx/camera/core/UseCase;", "useCase", "", "isBound", "(Landroidx/camera/core/UseCase;)Z", "Landroidx/camera/core/SessionConfig;", "sessionConfig", "(Landroidx/camera/core/SessionConfig;)Z", "", "useCases", "", "unbind", "([Landroidx/camera/core/UseCase;)V", "(Landroidx/camera/core/SessionConfig;)V", "unbindAll", "()V", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Landroidx/camera/core/CameraSelector;", "cameraSelector", "Landroidx/camera/core/Camera;", "bindToLifecycle", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/camera/core/CameraSelector;[Landroidx/camera/core/UseCase;)Landroidx/camera/core/Camera;", "Landroidx/camera/core/UseCaseGroup;", "useCaseGroup", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/camera/core/CameraSelector;Landroidx/camera/core/UseCaseGroup;)Landroidx/camera/core/Camera;", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/camera/core/CameraSelector;Landroidx/camera/core/SessionConfig;)Landroidx/camera/core/Camera;", "", "Landroidx/camera/core/ConcurrentCamera$SingleCameraConfig;", "singleCameraConfigs", "Landroidx/camera/core/ConcurrentCamera;", "(Ljava/util/List;)Landroidx/camera/core/ConcurrentCamera;", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface LifecycleCameraProvider extends androidx.camera.core.CameraProvider {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.camera.lifecycle.LifecycleCameraProvider.Companion INSTANCE = androidx.camera.lifecycle.LifecycleCameraProvider.Companion.getHighSpeedVideoFpsRanges;

    androidx.camera.core.Camera bindToLifecycle(androidx.view.LifecycleOwner lifecycleOwner, androidx.camera.core.CameraSelector cameraSelector, androidx.camera.core.SessionConfig sessionConfig);

    androidx.camera.core.Camera bindToLifecycle(androidx.view.LifecycleOwner lifecycleOwner, androidx.camera.core.CameraSelector cameraSelector, androidx.camera.core.UseCaseGroup useCaseGroup);

    androidx.camera.core.Camera bindToLifecycle(androidx.view.LifecycleOwner lifecycleOwner, androidx.camera.core.CameraSelector cameraSelector, androidx.camera.core.UseCase... useCases);

    androidx.camera.core.ConcurrentCamera bindToLifecycle(java.util.List<androidx.camera.core.ConcurrentCamera.SingleCameraConfig> singleCameraConfigs);

    boolean isBound(androidx.camera.core.SessionConfig sessionConfig);

    boolean isBound(androidx.camera.core.UseCase useCase);

    void unbind(androidx.camera.core.SessionConfig sessionConfig);

    void unbind(androidx.camera.core.UseCase... useCases);

    void unbindAll();

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0087@¢\u0006\u0004\b\t\u0010\nJ)\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Landroidx/camera/lifecycle/LifecycleCameraProvider$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroidx/camera/core/CameraXConfig;", "cameraXConfig", "Landroidx/camera/lifecycle/LifecycleCameraProvider;", "createInstance", "(Landroid/content/Context;Landroidx/camera/core/CameraXConfig;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/google/common/util/concurrent/ListenableFuture;", "createInstanceAsync", "(Landroid/content/Context;Landroidx/camera/core/CameraXConfig;)Lcom/google/common/util/concurrent/ListenableFuture;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ androidx.camera.lifecycle.LifecycleCameraProvider.Companion getHighSpeedVideoFpsRanges = new androidx.camera.lifecycle.LifecycleCameraProvider.Companion();

        private Companion() {
        }

        public static /* synthetic */ java.lang.Object createInstance$default(androidx.camera.lifecycle.LifecycleCameraProvider.Companion companion, android.content.Context context, androidx.camera.core.CameraXConfig cameraXConfig, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                cameraXConfig = null;
            }
            return companion.createInstance(context, cameraXConfig, continuation);
        }

        @kotlin.jvm.JvmStatic
        public final java.lang.Object createInstance(android.content.Context context, androidx.camera.core.CameraXConfig cameraXConfig, kotlin.coroutines.Continuation<? super androidx.camera.lifecycle.LifecycleCameraProvider> continuation) {
            return androidx.concurrent.futures.ListenableFutureKt.await(createInstanceAsync(context, cameraXConfig), continuation);
        }

        public static /* synthetic */ com.google.common.util.concurrent.ListenableFuture createInstanceAsync$default(androidx.camera.lifecycle.LifecycleCameraProvider.Companion companion, android.content.Context context, androidx.camera.core.CameraXConfig cameraXConfig, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                cameraXConfig = null;
            }
            return companion.createInstanceAsync(context, cameraXConfig);
        }

        @kotlin.jvm.JvmStatic
        public final com.google.common.util.concurrent.ListenableFuture<androidx.camera.lifecycle.LifecycleCameraProvider> createInstanceAsync(android.content.Context context, androidx.camera.core.CameraXConfig cameraXConfig) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            androidx.core.util.Preconditions.checkNotNull(context);
            final androidx.camera.lifecycle.LifecycleCameraProviderImpl lifecycleCameraProviderImpl = new androidx.camera.lifecycle.LifecycleCameraProviderImpl();
            com.google.common.util.concurrent.ListenableFuture<java.lang.Void> initAsync$camera_lifecycle = lifecycleCameraProviderImpl.initAsync$camera_lifecycle(context, cameraXConfig);
            final kotlin.jvm.functions.Function1 function1 = new kotlin.jvm.functions.Function1() { // from class: androidx.camera.lifecycle.LifecycleCameraProvider$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return androidx.camera.lifecycle.LifecycleCameraProvider.Companion.$r8$lambda$dE7eVlp6o2FF4hS_HV8mfsHWIqM(androidx.camera.lifecycle.LifecycleCameraProviderImpl.this, (java.lang.Void) obj);
                }
            };
            com.google.common.util.concurrent.ListenableFuture<androidx.camera.lifecycle.LifecycleCameraProvider> transform = androidx.camera.core.impl.utils.futures.Futures.transform(initAsync$camera_lifecycle, new androidx.arch.core.util.Function() { // from class: androidx.camera.lifecycle.LifecycleCameraProvider$Companion$$ExternalSyntheticLambda1
                @Override // androidx.arch.core.util.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return androidx.camera.lifecycle.LifecycleCameraProvider.Companion.$r8$lambda$lNzScxTdnESAHdDsDulr9zuIaMo(kotlin.jvm.functions.Function1.this, obj);
                }
            }, androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor());
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(transform, "");
            return transform;
        }

        public static /* synthetic */ androidx.camera.lifecycle.LifecycleCameraProvider $r8$lambda$dE7eVlp6o2FF4hS_HV8mfsHWIqM(androidx.camera.lifecycle.LifecycleCameraProviderImpl lifecycleCameraProviderImpl, java.lang.Void r1) {
            return lifecycleCameraProviderImpl;
        }

        public static /* synthetic */ androidx.camera.lifecycle.LifecycleCameraProvider $r8$lambda$lNzScxTdnESAHdDsDulr9zuIaMo(kotlin.jvm.functions.Function1 function1, java.lang.Object obj) {
            return (androidx.camera.lifecycle.LifecycleCameraProvider) function1.invoke(obj);
        }

        @kotlin.jvm.JvmStatic
        public final com.google.common.util.concurrent.ListenableFuture<androidx.camera.lifecycle.LifecycleCameraProvider> createInstanceAsync(android.content.Context context) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            return createInstanceAsync$default(this, context, null, 2, null);
        }

        @kotlin.jvm.JvmStatic
        public final java.lang.Object createInstance(android.content.Context context, kotlin.coroutines.Continuation<? super androidx.camera.lifecycle.LifecycleCameraProvider> continuation) {
            return createInstance$default(this, context, null, continuation, 2, null);
        }
    }

    @kotlin.jvm.JvmStatic
    static com.google.common.util.concurrent.ListenableFuture<androidx.camera.lifecycle.LifecycleCameraProvider> createInstanceAsync(android.content.Context context, androidx.camera.core.CameraXConfig cameraXConfig) {
        return INSTANCE.createInstanceAsync(context, cameraXConfig);
    }

    @kotlin.jvm.JvmStatic
    static com.google.common.util.concurrent.ListenableFuture<androidx.camera.lifecycle.LifecycleCameraProvider> createInstanceAsync(android.content.Context context) {
        return INSTANCE.createInstanceAsync(context);
    }

    @kotlin.jvm.JvmStatic
    static java.lang.Object createInstance(android.content.Context context, kotlin.coroutines.Continuation<? super androidx.camera.lifecycle.LifecycleCameraProvider> continuation) {
        return INSTANCE.createInstance(context, continuation);
    }

    @kotlin.jvm.JvmStatic
    static java.lang.Object createInstance(android.content.Context context, androidx.camera.core.CameraXConfig cameraXConfig, kotlin.coroutines.Continuation<? super androidx.camera.lifecycle.LifecycleCameraProvider> continuation) {
        return INSTANCE.createInstance(context, cameraXConfig, continuation);
    }
}
