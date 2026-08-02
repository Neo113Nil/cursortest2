package androidx.camera.lifecycle;

@kotlin.Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 B2\u00020\u0001:\u0001BB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\t\u0010\rJ%\u0010\u0011\u001a\u00020\u00102\u0016\u0010\u000f\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00060\u000e\"\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0011\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0015J5\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0016\u0010\u000f\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00060\u000e\"\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001b\u0010\u001fJ%\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u001b\u0010 J\u001d\u0010\u001b\u001a\u00020$2\u000e\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0!¢\u0006\u0004\b\u001b\u0010%J\u0017\u0010&\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020(2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b)\u0010*J\u001f\u0010)\u001a\u00020(2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b)\u0010+J\u001f\u00100\u001a\u00020\u00102\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00020\u00102\u0006\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b2\u00103J\u0013\u00106\u001a\b\u0012\u0004\u0012\u00020504¢\u0006\u0004\b6\u00107R\u0014\u0010:\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020(0!8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<R \u0010?\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0!0!8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b>\u0010<R\u0014\u0010@\u001a\u00020\b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b@\u0010A"}, d2 = {"Landroidx/camera/lifecycle/ProcessCameraProvider;", "Landroidx/camera/core/CameraProvider;", "Landroidx/camera/lifecycle/LifecycleCameraProviderImpl;", "p0", "<init>", "(Landroidx/camera/lifecycle/LifecycleCameraProviderImpl;)V", "Landroidx/camera/core/UseCase;", "useCase", "", "isBound", "(Landroidx/camera/core/UseCase;)Z", "Landroidx/camera/core/SessionConfig;", "sessionConfig", "(Landroidx/camera/core/SessionConfig;)Z", "", "useCases", "", "unbind", "([Landroidx/camera/core/UseCase;)V", "(Landroidx/camera/core/SessionConfig;)V", "unbindAll", "()V", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Landroidx/camera/core/CameraSelector;", "cameraSelector", "Landroidx/camera/core/Camera;", "bindToLifecycle", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/camera/core/CameraSelector;[Landroidx/camera/core/UseCase;)Landroidx/camera/core/Camera;", "Landroidx/camera/core/UseCaseGroup;", "useCaseGroup", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/camera/core/CameraSelector;Landroidx/camera/core/UseCaseGroup;)Landroidx/camera/core/Camera;", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/camera/core/CameraSelector;Landroidx/camera/core/SessionConfig;)Landroidx/camera/core/Camera;", "", "Landroidx/camera/core/ConcurrentCamera$SingleCameraConfig;", "singleCameraConfigs", "Landroidx/camera/core/ConcurrentCamera;", "(Ljava/util/List;)Landroidx/camera/core/ConcurrentCamera;", "hasCamera", "(Landroidx/camera/core/CameraSelector;)Z", "Landroidx/camera/core/CameraInfo;", "getCameraInfo", "(Landroidx/camera/core/CameraSelector;)Landroidx/camera/core/CameraInfo;", "(Landroidx/camera/core/CameraSelector;Landroidx/camera/core/SessionConfig;)Landroidx/camera/core/CameraInfo;", "Ljava/util/concurrent/Executor;", "executor", "Landroidx/camera/core/CameraPresenceListener;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addCameraPresenceListener", "(Ljava/util/concurrent/Executor;Landroidx/camera/core/CameraPresenceListener;)V", "removeCameraPresenceListener", "(Landroidx/camera/core/CameraPresenceListener;)V", "Lcom/google/common/util/concurrent/ListenableFuture;", "Ljava/lang/Void;", "shutdownAsync", "()Lcom/google/common/util/concurrent/ListenableFuture;", "getHighSpeedVideoFpsRanges", "Landroidx/camera/lifecycle/LifecycleCameraProviderImpl;", "getHighSpeedVideoSizes", "getAvailableCameraInfos", "()Ljava/util/List;", "availableCameraInfos", "getAvailableConcurrentCameraInfos", "availableConcurrentCameraInfos", "isConcurrentCameraModeOn", "()Z", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ProcessCameraProvider implements androidx.camera.core.CameraProvider {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.camera.lifecycle.ProcessCameraProvider.Companion INSTANCE = new androidx.camera.lifecycle.ProcessCameraProvider.Companion(null);
    private static final androidx.camera.lifecycle.ProcessCameraProvider getHighSpeedVideoSizes = new androidx.camera.lifecycle.ProcessCameraProvider(new androidx.camera.lifecycle.LifecycleCameraProviderImpl());

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.camera.lifecycle.LifecycleCameraProviderImpl getHighSpeedVideoSizes;

    private ProcessCameraProvider(androidx.camera.lifecycle.LifecycleCameraProviderImpl lifecycleCameraProviderImpl) {
        this.getHighSpeedVideoSizes = lifecycleCameraProviderImpl;
    }

    public final boolean isBound(androidx.camera.core.UseCase useCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(useCase, "");
        return this.getHighSpeedVideoSizes.isBound(useCase);
    }

    public final boolean isBound(androidx.camera.core.SessionConfig sessionConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionConfig, "");
        return this.getHighSpeedVideoSizes.isBound(sessionConfig);
    }

    public final void unbind(androidx.camera.core.UseCase... useCases) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(useCases, "");
        this.getHighSpeedVideoSizes.unbind((androidx.camera.core.UseCase[]) java.util.Arrays.copyOf(useCases, useCases.length));
    }

    public final void unbind(androidx.camera.core.SessionConfig sessionConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionConfig, "");
        this.getHighSpeedVideoSizes.unbind(sessionConfig);
    }

    public final void unbindAll() {
        this.getHighSpeedVideoSizes.unbindAll();
    }

    public final androidx.camera.core.Camera bindToLifecycle(androidx.view.LifecycleOwner lifecycleOwner, androidx.camera.core.CameraSelector cameraSelector, androidx.camera.core.UseCase... useCases) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraSelector, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(useCases, "");
        return this.getHighSpeedVideoSizes.bindToLifecycle(lifecycleOwner, cameraSelector, (androidx.camera.core.UseCase[]) java.util.Arrays.copyOf(useCases, useCases.length));
    }

    public final androidx.camera.core.Camera bindToLifecycle(androidx.view.LifecycleOwner lifecycleOwner, androidx.camera.core.CameraSelector cameraSelector, androidx.camera.core.UseCaseGroup useCaseGroup) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraSelector, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(useCaseGroup, "");
        return this.getHighSpeedVideoSizes.bindToLifecycle(lifecycleOwner, cameraSelector, useCaseGroup);
    }

    public final androidx.camera.core.Camera bindToLifecycle(androidx.view.LifecycleOwner lifecycleOwner, androidx.camera.core.CameraSelector cameraSelector, androidx.camera.core.SessionConfig sessionConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraSelector, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionConfig, "");
        return this.getHighSpeedVideoSizes.bindToLifecycle(lifecycleOwner, cameraSelector, sessionConfig);
    }

    public final androidx.camera.core.ConcurrentCamera bindToLifecycle(java.util.List<androidx.camera.core.ConcurrentCamera.SingleCameraConfig> singleCameraConfigs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(singleCameraConfigs, "");
        return this.getHighSpeedVideoSizes.bindToLifecycle(singleCameraConfigs);
    }

    @Override // androidx.camera.core.CameraProvider
    public final java.util.List<androidx.camera.core.CameraInfo> getAvailableCameraInfos() {
        return this.getHighSpeedVideoSizes.getAvailableCameraInfos();
    }

    @Override // androidx.camera.core.CameraProvider
    public final java.util.List<java.util.List<androidx.camera.core.CameraInfo>> getAvailableConcurrentCameraInfos() {
        return this.getHighSpeedVideoSizes.getAvailableConcurrentCameraInfos();
    }

    @Override // androidx.camera.core.CameraProvider
    public final boolean isConcurrentCameraModeOn() {
        return this.getHighSpeedVideoSizes.isConcurrentCameraModeOn();
    }

    @Override // androidx.camera.core.CameraProvider
    public final boolean hasCamera(androidx.camera.core.CameraSelector cameraSelector) throws androidx.camera.core.CameraInfoUnavailableException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraSelector, "");
        return this.getHighSpeedVideoSizes.hasCamera(cameraSelector);
    }

    @Override // androidx.camera.core.CameraProvider
    public final androidx.camera.core.CameraInfo getCameraInfo(androidx.camera.core.CameraSelector cameraSelector) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraSelector, "");
        return this.getHighSpeedVideoSizes.getCameraInfo(cameraSelector);
    }

    @Override // androidx.camera.core.CameraProvider
    public final androidx.camera.core.CameraInfo getCameraInfo(androidx.camera.core.CameraSelector cameraSelector, androidx.camera.core.SessionConfig sessionConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraSelector, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionConfig, "");
        return this.getHighSpeedVideoSizes.getCameraInfo(cameraSelector, sessionConfig);
    }

    @Override // androidx.camera.core.CameraProvider
    public final void addCameraPresenceListener(java.util.concurrent.Executor executor, androidx.camera.core.CameraPresenceListener listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "");
        this.getHighSpeedVideoSizes.addCameraPresenceListener(executor, listener);
    }

    @Override // androidx.camera.core.CameraProvider
    public final void removeCameraPresenceListener(androidx.camera.core.CameraPresenceListener listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "");
        this.getHighSpeedVideoSizes.removeCameraPresenceListener(listener);
    }

    public final com.google.common.util.concurrent.ListenableFuture<java.lang.Void> shutdownAsync() {
        return androidx.camera.lifecycle.LifecycleCameraProviderImpl.shutdownAsync$camera_lifecycle$default(this.getHighSpeedVideoSizes, false, 1, null);
    }

    @kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0013\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0006H\u0007¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018"}, d2 = {"Landroidx/camera/lifecycle/ProcessCameraProvider$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/google/common/util/concurrent/ListenableFuture;", "Landroidx/camera/lifecycle/ProcessCameraProvider;", "getInstance", "(Landroid/content/Context;)Lcom/google/common/util/concurrent/ListenableFuture;", "Landroidx/camera/core/CameraXConfig;", "cameraXConfig", "", "configureInstance", "(Landroidx/camera/core/CameraXConfig;)V", "Lkotlin/time/Duration;", com.datadog.trace.bootstrap.instrumentation.api.InstrumentationTags.TIMEOUT, "clearConfiguration-LRDsOJo", "(J)V", "clearConfiguration", "Ljava/lang/Void;", "shutdown", "()Lcom/google/common/util/concurrent/ListenableFuture;", "getHighSpeedVideoSizes", "Landroidx/camera/lifecycle/ProcessCameraProvider;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final com.google.common.util.concurrent.ListenableFuture<androidx.camera.lifecycle.ProcessCameraProvider> getInstance(android.content.Context context) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            androidx.core.util.Preconditions.checkNotNull(context);
            com.google.common.util.concurrent.ListenableFuture access$initAsync = androidx.camera.lifecycle.ProcessCameraProvider.access$initAsync(androidx.camera.lifecycle.ProcessCameraProvider.getHighSpeedVideoSizes, context);
            final kotlin.jvm.functions.Function1 function1 = new kotlin.jvm.functions.Function1() { // from class: androidx.camera.lifecycle.ProcessCameraProvider$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    androidx.camera.lifecycle.ProcessCameraProvider processCameraProvider;
                    processCameraProvider = androidx.camera.lifecycle.ProcessCameraProvider.getHighSpeedVideoSizes;
                    return processCameraProvider;
                }
            };
            com.google.common.util.concurrent.ListenableFuture<androidx.camera.lifecycle.ProcessCameraProvider> transform = androidx.camera.core.impl.utils.futures.Futures.transform(access$initAsync, new androidx.arch.core.util.Function() { // from class: androidx.camera.lifecycle.ProcessCameraProvider$Companion$$ExternalSyntheticLambda1
                @Override // androidx.arch.core.util.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return androidx.camera.lifecycle.ProcessCameraProvider.Companion.$r8$lambda$CjFKEa1HNEh7c_io6Z4hztLk6yo(kotlin.jvm.functions.Function1.this, obj);
                }
            }, androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor());
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(transform, "");
            return transform;
        }

        /* renamed from: clearConfiguration-LRDsOJo$default, reason: not valid java name */
        public static /* synthetic */ void m1020clearConfigurationLRDsOJo$default(androidx.camera.lifecycle.ProcessCameraProvider.Companion companion, long j, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                kotlin.time.Duration.Companion companion2 = kotlin.time.Duration.INSTANCE;
                j = kotlin.time.DurationKt.toDuration(10, kotlin.time.DurationUnit.SECONDS);
            }
            companion.m1021clearConfigurationLRDsOJo(j);
        }

        @kotlin.jvm.JvmStatic
        /* renamed from: clearConfiguration-LRDsOJo, reason: not valid java name */
        public final void m1021clearConfigurationLRDsOJo(long timeout) {
            androidx.camera.lifecycle.ProcessCameraProvider.getHighSpeedVideoSizes.shutdownAsync().get(kotlin.time.Duration.m23955getInWholeNanosecondsimpl(timeout), java.util.concurrent.TimeUnit.NANOSECONDS);
        }

        @kotlin.jvm.JvmStatic
        public final com.google.common.util.concurrent.ListenableFuture<java.lang.Void> shutdown() {
            return androidx.camera.lifecycle.ProcessCameraProvider.getHighSpeedVideoSizes.shutdownAsync();
        }

        @kotlin.jvm.JvmStatic
        public final void configureInstance(androidx.camera.core.CameraXConfig cameraXConfig) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraXConfig, "");
            androidx.tracing.Trace.beginSection("CX:configureInstance");
            try {
                androidx.camera.lifecycle.ProcessCameraProvider.access$configure(androidx.camera.lifecycle.ProcessCameraProvider.getHighSpeedVideoSizes, cameraXConfig);
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            } finally {
                androidx.tracing.Trace.endSection();
            }
        }

        public static /* synthetic */ androidx.camera.lifecycle.ProcessCameraProvider $r8$lambda$CjFKEa1HNEh7c_io6Z4hztLk6yo(kotlin.jvm.functions.Function1 function1, java.lang.Object obj) {
            return (androidx.camera.lifecycle.ProcessCameraProvider) function1.invoke(obj);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final /* synthetic */ void access$configure(androidx.camera.lifecycle.ProcessCameraProvider processCameraProvider, androidx.camera.core.CameraXConfig cameraXConfig) {
        processCameraProvider.getHighSpeedVideoSizes.configure$camera_lifecycle(cameraXConfig);
    }

    public static final /* synthetic */ com.google.common.util.concurrent.ListenableFuture access$initAsync(androidx.camera.lifecycle.ProcessCameraProvider processCameraProvider, android.content.Context context) {
        return processCameraProvider.getHighSpeedVideoSizes.initAsync$camera_lifecycle(context, null);
    }

    @kotlin.jvm.JvmStatic
    public static final com.google.common.util.concurrent.ListenableFuture<java.lang.Void> shutdown() {
        return INSTANCE.shutdown();
    }

    @kotlin.jvm.JvmStatic
    public static final com.google.common.util.concurrent.ListenableFuture<androidx.camera.lifecycle.ProcessCameraProvider> getInstance(android.content.Context context) {
        return INSTANCE.getInstance(context);
    }

    @kotlin.jvm.JvmStatic
    public static final void configureInstance(androidx.camera.core.CameraXConfig cameraXConfig) {
        INSTANCE.configureInstance(cameraXConfig);
    }

    @kotlin.jvm.JvmStatic
    /* renamed from: clearConfiguration-LRDsOJo, reason: not valid java name */
    public static final void m1019clearConfigurationLRDsOJo(long j) {
        INSTANCE.m1021clearConfigurationLRDsOJo(j);
    }
}
