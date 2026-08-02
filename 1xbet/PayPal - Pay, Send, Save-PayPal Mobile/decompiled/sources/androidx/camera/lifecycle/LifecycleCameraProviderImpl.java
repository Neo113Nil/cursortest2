package androidx.camera.lifecycle;

@kotlin.Metadata(d1 = {"\u0000ð\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u001b\u001a\u00020\u001c2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,H\u0000¢\u0006\u0002\b-J\b\u0010.\u001a\u00020/H\u0003J\u001c\u00100\u001a\u00020/2\b\u00101\u001a\u0004\u0018\u00010\u00152\b\u00102\u001a\u0004\u0018\u00010\u001cH\u0003J\u0015\u00103\u001a\u00020/2\u0006\u0010+\u001a\u00020,H\u0000¢\u0006\u0002\b4J\u001d\u00105\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\b\u0002\u00106\u001a\u00020\u0017H\u0000¢\u0006\u0002\b7J\u0010\u00108\u001a\u00020\u00172\u0006\u00109\u001a\u00020:H\u0016J\u0010\u00108\u001a\u00020\u00172\u0006\u0010;\u001a\u00020<H\u0016J%\u0010=\u001a\u00020/2\u0016\u0010>\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010:0?\"\u0004\u0018\u00010:H\u0017¢\u0006\u0002\u0010@J\u0010\u0010=\u001a\u00020/2\u0006\u0010;\u001a\u00020<H\u0017J\b\u0010A\u001a\u00020/H\u0017J\u0010\u0010B\u001a\u00020\u00172\u0006\u0010C\u001a\u00020DH\u0016J5\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020H2\u0006\u0010C\u001a\u00020D2\u0016\u0010>\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010:0?\"\u0004\u0018\u00010:H\u0017¢\u0006\u0002\u0010IJ \u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020H2\u0006\u0010C\u001a\u00020D2\u0006\u0010J\u001a\u00020KH\u0017J \u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020H2\u0006\u0010C\u001a\u00020D2\u0006\u0010;\u001a\u00020<H\u0017J\u0018\u0010E\u001a\u00020L2\u000e\u0010M\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010O0NH\u0017J@\u0010W\u001a\u00020F2\u0006\u0010G\u001a\u00020H2\u0006\u0010X\u001a\u00020D2\n\b\u0002\u0010Y\u001a\u0004\u0018\u00010D2\b\b\u0002\u0010Z\u001a\u00020[2\b\b\u0002\u0010\\\u001a\u00020[2\u0006\u0010;\u001a\u00020<H\u0002J0\u0010]\u001a\u0010\u0012\u0004\u0012\u00020D\u0012\u0006\u0012\u0004\u0018\u00010D0^2\u0006\u0010;\u001a\u00020<2\u0006\u0010X\u001a\u00020D2\b\u0010Y\u001a\u0004\u0018\u00010DH\u0002J\u0010\u0010_\u001a\u00020Q2\u0006\u0010C\u001a\u00020DH\u0016J\u0018\u0010_\u001a\u00020Q2\u0006\u0010C\u001a\u00020D2\u0006\u0010;\u001a\u00020<H\u0016J\u0018\u0010`\u001a\u00020/2\u0006\u0010a\u001a\u00020b2\u0006\u0010c\u001a\u00020\u0002H\u0016J\u0010\u0010d\u001a\u00020/2\u0006\u0010c\u001a\u00020\u0002H\u0016J\u0016\u0010e\u001a\u00020/2\f\u0010f\u001a\b\u0012\u0004\u0012\u00020$0gH\u0017J\u0016\u0010h\u001a\u00020/2\f\u0010i\u001a\b\u0012\u0004\u0012\u00020$0gH\u0017J\u0010\u0010j\u001a\u00020\u00172\u0006\u00109\u001a\u00020:H\u0002J\u0010\u0010k\u001a\u00020\u00172\u0006\u00109\u001a\u00020:H\u0002J\u0018\u0010l\u001a\u00020m2\u0006\u0010C\u001a\u00020D2\u0006\u0010n\u001a\u00020QH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R%\u0010\u0011\u001a\u0015\u0012\f\u0012\n \u0012*\u0004\u0018\u00010\u00100\u00100\u000f¢\u0006\u0002\b\u00138\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u00020\u00178BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0018R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R&\u0010\u001b\u001a\u0004\u0018\u00010\u001c8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u001d\u0010\u0004\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001c\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%0#8\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u001e\u0010&\u001a\u0012\u0012\u0004\u0012\u00020(0'j\b\u0012\u0004\u0012\u00020(`)X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010P\u001a\b\u0012\u0004\u0012\u00020Q0N8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bR\u0010SR \u0010T\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020Q0N0N8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bU\u0010SR\u0014\u0010V\u001a\u00020\u00178WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bV\u0010\u0018R$\u0010o\u001a\u00020p2\u0006\u0010o\u001a\u00020p8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\bq\u0010r\"\u0004\bs\u0010tR0\u0010v\u001a\b\u0012\u0004\u0012\u00020Q0N2\f\u0010u\u001a\b\u0012\u0004\u0012\u00020Q0N8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\bw\u0010S\"\u0004\bx\u0010y¨\u0006z"}, d2 = {"Landroidx/camera/lifecycle/LifecycleCameraProviderImpl;", "Landroidx/camera/lifecycle/LifecycleCameraProvider;", "Landroidx/camera/core/CameraPresenceListener;", "<init>", "()V", "lock", "", "cameraXConfigProvider", "Landroidx/camera/core/CameraXConfig$Provider;", "getCameraXConfigProvider$camera_lifecycle$annotations", "getCameraXConfigProvider$camera_lifecycle", "()Landroidx/camera/core/CameraXConfig$Provider;", "setCameraXConfigProvider$camera_lifecycle", "(Landroidx/camera/core/CameraXConfig$Provider;)V", "cameraXInitializeFuture", "Lcom/google/common/util/concurrent/ListenableFuture;", "Ljava/lang/Void;", "cameraXShutdownFuture", "kotlin.jvm.PlatformType", "Lorg/jspecify/annotations/NonNull;", "cameraX", "Landroidx/camera/core/CameraX;", "isInitialized", "", "()Z", "lifecycleCameraRepository", "Landroidx/camera/lifecycle/LifecycleCameraRepository;", "context", "Landroid/content/Context;", "getContext$camera_lifecycle$annotations", "getContext$camera_lifecycle", "()Landroid/content/Context;", "setContext$camera_lifecycle", "(Landroid/content/Context;)V", "cameraInfoMap", "", "Landroidx/camera/core/CameraIdentifier;", "Landroidx/camera/core/impl/AdapterCameraInfo;", "lifecycleCameraKeys", "Ljava/util/HashSet;", "Landroidx/camera/lifecycle/LifecycleCameraRepository$Key;", "Lkotlin/collections/HashSet;", "initAsync", "cameraXConfig", "Landroidx/camera/core/CameraXConfig;", "initAsync$camera_lifecycle", "shutdownInternal", "", "initInternal", "newCameraX", "newContext", "configure", "configure$camera_lifecycle", "shutdownAsync", "clearConfigProvider", "shutdownAsync$camera_lifecycle", "isBound", "useCase", "Landroidx/camera/core/UseCase;", "sessionConfig", "Landroidx/camera/core/SessionConfig;", "unbind", "useCases", "", "([Landroidx/camera/core/UseCase;)V", "unbindAll", "hasCamera", "cameraSelector", "Landroidx/camera/core/CameraSelector;", "bindToLifecycle", "Landroidx/camera/core/Camera;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/camera/core/CameraSelector;[Landroidx/camera/core/UseCase;)Landroidx/camera/core/Camera;", "useCaseGroup", "Landroidx/camera/core/UseCaseGroup;", "Landroidx/camera/core/ConcurrentCamera;", "singleCameraConfigs", "", "Landroidx/camera/core/ConcurrentCamera$SingleCameraConfig;", "availableCameraInfos", "Landroidx/camera/core/CameraInfo;", "getAvailableCameraInfos", "()Ljava/util/List;", "availableConcurrentCameraInfos", "getAvailableConcurrentCameraInfos", "isConcurrentCameraModeOn", "bindToLifecycleInternal", "primaryCameraSelector", "secondaryCameraSelector", "primaryCompositionSettings", "Landroidx/camera/core/CompositionSettings;", "secondaryCompositionSettings", "getSelectorsWithSessionFilter", "Lkotlin/Pair;", "getCameraInfo", "addCameraPresenceListener", "executor", "Ljava/util/concurrent/Executor;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "removeCameraPresenceListener", "onCamerasAdded", "addedCameraIds", "", "onCamerasRemoved", "removedCameraIds", "isVideoCapture", "isPreview", "getCameraConfig", "Landroidx/camera/core/impl/CameraConfig;", "cameraInfo", "cameraOperatingMode", "", "getCameraOperatingMode", "()I", "setCameraOperatingMode", "(I)V", "cameraInfos", "activeConcurrentCameraInfos", "getActiveConcurrentCameraInfos", "setActiveConcurrentCameraInfos", "(Ljava/util/List;)V", "camera-lifecycle"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LifecycleCameraProviderImpl implements androidx.camera.lifecycle.LifecycleCameraProvider, androidx.camera.core.CameraPresenceListener {
    private final java.util.HashSet<androidx.camera.lifecycle.LifecycleCameraRepository.Key> Camera2StreamConfigurationMap;
    private androidx.camera.core.CameraXConfig.Provider cameraXConfigProvider;
    private android.content.Context context;
    private com.google.common.util.concurrent.ListenableFuture<java.lang.Void> getHighResolutionOutputSizeshNQ4ISI;
    private androidx.camera.core.CameraX getHighSpeedVideoFpsRanges;
    private com.google.common.util.concurrent.ListenableFuture<java.lang.Void> getHighSpeedVideoFpsRangesFor;
    private final java.util.Map<androidx.camera.core.CameraIdentifier, androidx.camera.core.impl.AdapterCameraInfo> getHighSpeedVideoSizes;
    private androidx.camera.lifecycle.LifecycleCameraRepository getInputSizeshNQ4ISI;
    private final java.lang.Object getOutputFormats = new java.lang.Object();

    public static /* synthetic */ void getCameraXConfigProvider$camera_lifecycle$annotations() {
    }

    public static /* synthetic */ void getContext$camera_lifecycle$annotations() {
    }

    public LifecycleCameraProviderImpl() {
        com.google.common.util.concurrent.ListenableFuture<java.lang.Void> immediateFuture = androidx.camera.core.impl.utils.futures.Futures.immediateFuture(null);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(immediateFuture, "");
        this.getHighSpeedVideoFpsRangesFor = immediateFuture;
        this.getHighSpeedVideoSizes = new java.util.HashMap();
        this.Camera2StreamConfigurationMap = new java.util.HashSet<>();
    }

    /* renamed from: getCameraXConfigProvider$camera_lifecycle, reason: from getter */
    public final androidx.camera.core.CameraXConfig.Provider getCameraXConfigProvider() {
        return this.cameraXConfigProvider;
    }

    public final void setCameraXConfigProvider$camera_lifecycle(androidx.camera.core.CameraXConfig.Provider provider) {
        this.cameraXConfigProvider = provider;
    }

    /* renamed from: getContext$camera_lifecycle, reason: from getter */
    public final android.content.Context getContext() {
        return this.context;
    }

    public final void setContext$camera_lifecycle(android.content.Context context) {
        this.context = context;
    }

    public static /* synthetic */ com.google.common.util.concurrent.ListenableFuture initAsync$camera_lifecycle$default(androidx.camera.lifecycle.LifecycleCameraProviderImpl lifecycleCameraProviderImpl, android.content.Context context, androidx.camera.core.CameraXConfig cameraXConfig, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            cameraXConfig = null;
        }
        return lifecycleCameraProviderImpl.initAsync$camera_lifecycle(context, cameraXConfig);
    }

    public final com.google.common.util.concurrent.ListenableFuture<java.lang.Void> initAsync$camera_lifecycle(final android.content.Context context, androidx.camera.core.CameraXConfig cameraXConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        synchronized (this.getOutputFormats) {
            this.getInputSizeshNQ4ISI = androidx.camera.lifecycle.LifecycleCameraRepositories.getInstance$camera_lifecycle(androidx.camera.core.impl.utils.ContextUtil.getDeviceId(context));
            com.google.common.util.concurrent.ListenableFuture<java.lang.Void> listenableFuture = this.getHighResolutionOutputSizeshNQ4ISI;
            if (listenableFuture != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(listenableFuture, "");
                return listenableFuture;
            }
            if (cameraXConfig != null) {
                configure$camera_lifecycle(cameraXConfig);
            }
            final androidx.camera.core.CameraX cameraX = new androidx.camera.core.CameraX(context, this.cameraXConfigProvider);
            androidx.camera.core.impl.utils.futures.FutureChain from = androidx.camera.core.impl.utils.futures.FutureChain.from(this.getHighSpeedVideoFpsRangesFor);
            final kotlin.jvm.functions.Function1 function1 = new kotlin.jvm.functions.Function1() { // from class: androidx.camera.lifecycle.LifecycleCameraProviderImpl$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    com.google.common.util.concurrent.ListenableFuture initializeFuture;
                    initializeFuture = androidx.camera.core.CameraX.this.getInitializeFuture();
                    return initializeFuture;
                }
            };
            androidx.camera.core.impl.utils.futures.FutureChain transformAsync = from.transformAsync(new androidx.camera.core.impl.utils.futures.AsyncFunction() { // from class: androidx.camera.lifecycle.LifecycleCameraProviderImpl$$ExternalSyntheticLambda1
                @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
                public final com.google.common.util.concurrent.ListenableFuture apply(java.lang.Object obj) {
                    return androidx.camera.lifecycle.LifecycleCameraProviderImpl.m1018$r8$lambda$1d6fK4V_iwXm_23qvpSvEcBbqc(kotlin.jvm.functions.Function1.this, obj);
                }
            }, androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor());
            final kotlin.jvm.functions.Function1 function12 = new kotlin.jvm.functions.Function1() { // from class: androidx.camera.lifecycle.LifecycleCameraProviderImpl$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return androidx.camera.lifecycle.LifecycleCameraProviderImpl.$r8$lambda$fGSKVcSoAXbK7NEn8opAT2ioUoU(androidx.camera.lifecycle.LifecycleCameraProviderImpl.this, cameraX, context, (java.lang.Void) obj);
                }
            };
            androidx.camera.core.impl.utils.futures.FutureChain transform = transformAsync.transform(new androidx.arch.core.util.Function() { // from class: androidx.camera.lifecycle.LifecycleCameraProviderImpl$$ExternalSyntheticLambda3
                @Override // androidx.arch.core.util.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return androidx.camera.lifecycle.LifecycleCameraProviderImpl.$r8$lambda$yTT8jiXuM53WIUjzfHGHYzzmhkI(kotlin.jvm.functions.Function1.this, obj);
                }
            }, androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor());
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(transform, "");
            androidx.camera.core.impl.utils.futures.FutureChain futureChain = transform;
            this.getHighResolutionOutputSizeshNQ4ISI = futureChain;
            androidx.camera.core.impl.utils.futures.Futures.addCallback(futureChain, new androidx.camera.core.impl.utils.futures.FutureCallback<java.lang.Void>() { // from class: androidx.camera.lifecycle.LifecycleCameraProviderImpl$initAsync$1$2
                @Override // androidx.camera.core.impl.utils.futures.FutureCallback
                public final void onSuccess(java.lang.Void r1) {
                }

                @Override // androidx.camera.core.impl.utils.futures.FutureCallback
                public final void onFailure(java.lang.Throwable t) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "");
                    androidx.camera.lifecycle.LifecycleCameraProviderImpl.this.shutdownAsync$camera_lifecycle(false);
                }
            }, androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor());
            com.google.common.util.concurrent.ListenableFuture<java.lang.Void> nonCancellationPropagating = androidx.camera.core.impl.utils.futures.Futures.nonCancellationPropagating(futureChain);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(nonCancellationPropagating, "");
            return nonCancellationPropagating;
        }
    }

    private final void getHighSpeedVideoFpsRanges(androidx.camera.core.CameraX cameraX, android.content.Context context) {
        androidx.camera.core.impl.CameraPresenceProvider cameraAvailabilityProvider;
        synchronized (this.getOutputFormats) {
            this.getHighSpeedVideoFpsRanges = cameraX;
            this.context = context;
            if (cameraX != null && (cameraAvailabilityProvider = cameraX.getCameraAvailabilityProvider()) != null) {
                java.util.concurrent.ScheduledExecutorService mainThreadExecutor = androidx.camera.core.impl.utils.executor.CameraXExecutors.mainThreadExecutor();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(mainThreadExecutor, "");
                cameraAvailabilityProvider.addCameraPresenceListener(this, mainThreadExecutor);
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
        }
    }

    public static /* synthetic */ com.google.common.util.concurrent.ListenableFuture shutdownAsync$camera_lifecycle$default(androidx.camera.lifecycle.LifecycleCameraProviderImpl lifecycleCameraProviderImpl, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return lifecycleCameraProviderImpl.shutdownAsync$camera_lifecycle(z);
    }

    public final com.google.common.util.concurrent.ListenableFuture<java.lang.Void> shutdownAsync$camera_lifecycle(boolean clearConfigProvider) {
        com.google.common.util.concurrent.ListenableFuture<java.lang.Void> immediateFuture;
        androidx.camera.core.impl.utils.Threads.runOnMainSync(new java.lang.Runnable() { // from class: androidx.camera.lifecycle.LifecycleCameraProviderImpl$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.lifecycle.LifecycleCameraProviderImpl.$r8$lambda$cqEKuAajCjqIPjMA5N0LIeIbAfA(androidx.camera.lifecycle.LifecycleCameraProviderImpl.this);
            }
        });
        androidx.camera.core.CameraX cameraX = this.getHighSpeedVideoFpsRanges;
        if (cameraX != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(cameraX);
            cameraX.getCameraAvailabilityProvider().removeCameraPresenceListener(this);
            androidx.camera.core.CameraX cameraX2 = this.getHighSpeedVideoFpsRanges;
            kotlin.jvm.internal.Intrinsics.checkNotNull(cameraX2);
            immediateFuture = cameraX2.shutdown();
        } else {
            immediateFuture = androidx.camera.core.impl.utils.futures.Futures.immediateFuture(null);
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(immediateFuture);
        synchronized (this.getOutputFormats) {
            if (clearConfigProvider) {
                this.cameraXConfigProvider = null;
            }
            this.getHighResolutionOutputSizeshNQ4ISI = null;
            this.getHighSpeedVideoFpsRangesFor = immediateFuture;
            this.getHighSpeedVideoSizes.clear();
            this.Camera2StreamConfigurationMap.clear();
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
        getHighSpeedVideoFpsRanges(null, null);
        return immediateFuture;
    }

    @Override // androidx.camera.lifecycle.LifecycleCameraProvider
    public final boolean isBound(androidx.camera.core.UseCase useCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(useCase, "");
        androidx.camera.lifecycle.LifecycleCameraRepository lifecycleCameraRepository = this.getInputSizeshNQ4ISI;
        kotlin.jvm.internal.Intrinsics.checkNotNull(lifecycleCameraRepository);
        for (androidx.camera.lifecycle.LifecycleCamera lifecycleCamera : lifecycleCameraRepository.getHighSpeedVideoFpsRanges()) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lifecycleCamera, "");
            if (lifecycleCamera.isBound(useCase)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.lifecycle.LifecycleCameraProvider
    public final boolean isBound(androidx.camera.core.SessionConfig sessionConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionConfig, "");
        androidx.camera.lifecycle.LifecycleCameraRepository lifecycleCameraRepository = this.getInputSizeshNQ4ISI;
        kotlin.jvm.internal.Intrinsics.checkNotNull(lifecycleCameraRepository);
        for (androidx.camera.lifecycle.LifecycleCamera lifecycleCamera : lifecycleCameraRepository.getHighSpeedVideoFpsRanges()) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lifecycleCamera, "");
            if (lifecycleCamera.isBound(sessionConfig)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.CameraProvider
    public final boolean isConcurrentCameraModeOn() {
        return getHighSpeedVideoFpsRangesFor() == 2;
    }

    private static /* synthetic */ androidx.camera.core.Camera getHighResolutionOutputSizeshNQ4ISI(androidx.camera.lifecycle.LifecycleCameraProviderImpl lifecycleCameraProviderImpl, androidx.view.LifecycleOwner lifecycleOwner, androidx.camera.core.CameraSelector cameraSelector, androidx.camera.core.SessionConfig sessionConfig) {
        androidx.camera.core.CompositionSettings compositionSettings = androidx.camera.core.CompositionSettings.DEFAULT;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(compositionSettings, "");
        androidx.camera.core.CompositionSettings compositionSettings2 = androidx.camera.core.CompositionSettings.DEFAULT;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(compositionSettings2, "");
        return lifecycleCameraProviderImpl.getHighSpeedVideoSizes(lifecycleOwner, cameraSelector, null, compositionSettings, compositionSettings2, sessionConfig);
    }

    @Override // androidx.camera.core.CameraProvider
    public final androidx.camera.core.CameraInfo getCameraInfo(androidx.camera.core.CameraSelector cameraSelector, androidx.camera.core.SessionConfig sessionConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraSelector, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionConfig, "");
        androidx.camera.core.CameraFilter getHighSpeedVideoSizes = sessionConfig.getGetHighSpeedVideoSizes();
        if (getHighSpeedVideoSizes != null) {
            androidx.camera.core.CameraSelector build = androidx.camera.core.CameraSelector.Builder.fromSelector(cameraSelector).addCameraFilter(getHighSpeedVideoSizes).build();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "");
            androidx.camera.core.CameraInfo cameraInfo = getCameraInfo(build);
            if (cameraInfo != null) {
                return cameraInfo;
            }
        }
        return getCameraInfo(cameraSelector);
    }

    @Override // androidx.camera.core.CameraProvider
    public final void addCameraPresenceListener(java.util.concurrent.Executor executor, androidx.camera.core.CameraPresenceListener listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "");
        androidx.camera.core.CameraX cameraX = this.getHighSpeedVideoFpsRanges;
        kotlin.jvm.internal.Intrinsics.checkNotNull(cameraX);
        cameraX.getCameraAvailabilityProvider().addCameraPresenceListener(listener, executor);
    }

    @Override // androidx.camera.core.CameraProvider
    public final void removeCameraPresenceListener(androidx.camera.core.CameraPresenceListener listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "");
        androidx.camera.core.CameraX cameraX = this.getHighSpeedVideoFpsRanges;
        kotlin.jvm.internal.Intrinsics.checkNotNull(cameraX);
        cameraX.getCameraAvailabilityProvider().removeCameraPresenceListener(listener);
    }

    @Override // androidx.camera.core.CameraPresenceListener
    public final void onCamerasRemoved(java.util.Set<androidx.camera.core.CameraIdentifier> removedCameraIds) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(removedCameraIds, "");
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        synchronized (this.getOutputFormats) {
            for (androidx.camera.core.CameraIdentifier cameraIdentifier : removedCameraIds) {
                java.util.Set<androidx.camera.core.CameraIdentifier> keySet = this.getHighSpeedVideoSizes.keySet();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : keySet) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(((androidx.camera.core.CameraIdentifier) obj).getCameraIds(), cameraIdentifier.getCameraIds())) {
                        arrayList.add(obj);
                    }
                }
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    this.getHighSpeedVideoSizes.remove((androidx.camera.core.CameraIdentifier) it.next());
                }
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    public final void configure$camera_lifecycle(final androidx.camera.core.CameraXConfig cameraXConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraXConfig, "");
        androidx.tracing.Trace.beginSection("CX:configureInstanceInternal");
        try {
            synchronized (this.getOutputFormats) {
                androidx.core.util.Preconditions.checkNotNull(cameraXConfig);
                androidx.core.util.Preconditions.checkState(getCameraXConfigProvider() == null, "CameraX has already been configured. To use a different configuration, shutdown() must be called.");
                setCameraXConfigProvider$camera_lifecycle(new androidx.camera.core.CameraXConfig.Provider() { // from class: androidx.camera.lifecycle.LifecycleCameraProviderImpl$configure$1$1$1
                    @Override // androidx.camera.core.CameraXConfig.Provider
                    public final androidx.camera.core.CameraXConfig getCameraXConfig() {
                        return androidx.camera.core.CameraXConfig.this;
                    }
                });
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
            kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
        } finally {
            androidx.tracing.Trace.endSection();
        }
    }

    @Override // androidx.camera.lifecycle.LifecycleCameraProvider
    public final void unbind(androidx.camera.core.UseCase... useCases) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(useCases, "");
        androidx.tracing.Trace.beginSection("CX:unbind");
        try {
            androidx.camera.core.impl.utils.Threads.checkMainThread();
            if (getHighSpeedVideoFpsRangesFor() != 2) {
                androidx.camera.lifecycle.LifecycleCameraRepository lifecycleCameraRepository = this.getInputSizeshNQ4ISI;
                kotlin.jvm.internal.Intrinsics.checkNotNull(lifecycleCameraRepository);
                lifecycleCameraRepository.Camera2StreamConfigurationMap(new androidx.camera.core.LegacySessionConfig(kotlin.collections.ArraysKt.filterNotNull(useCases), null, null, 6, null), this.Camera2StreamConfigurationMap);
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                return;
            }
            throw new java.lang.UnsupportedOperationException("Unbind UseCase is not supported in concurrent camera mode, call unbindAll() first.");
        } finally {
            androidx.tracing.Trace.endSection();
        }
    }

    @Override // androidx.camera.lifecycle.LifecycleCameraProvider
    public final void unbind(androidx.camera.core.SessionConfig sessionConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionConfig, "");
        androidx.tracing.Trace.beginSection("CX:unbind-sessionConfig");
        try {
            androidx.camera.core.impl.utils.Threads.checkMainThread();
            if (getHighSpeedVideoFpsRangesFor() != 2) {
                androidx.camera.lifecycle.LifecycleCameraRepository lifecycleCameraRepository = this.getInputSizeshNQ4ISI;
                kotlin.jvm.internal.Intrinsics.checkNotNull(lifecycleCameraRepository);
                lifecycleCameraRepository.Camera2StreamConfigurationMap(sessionConfig, this.Camera2StreamConfigurationMap);
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                return;
            }
            throw new java.lang.UnsupportedOperationException("Unbind SessionConfig is not supported in concurrent camera mode call unbindAll() first.");
        } finally {
            androidx.tracing.Trace.endSection();
        }
    }

    @Override // androidx.camera.lifecycle.LifecycleCameraProvider
    public final void unbindAll() {
        androidx.tracing.Trace.beginSection("CX:unbindAll");
        try {
            androidx.camera.core.impl.utils.Threads.checkMainThread();
            access$setCameraOperatingMode(this, 0);
            androidx.camera.lifecycle.LifecycleCameraRepository lifecycleCameraRepository = this.getInputSizeshNQ4ISI;
            kotlin.jvm.internal.Intrinsics.checkNotNull(lifecycleCameraRepository);
            java.util.HashSet hashSet = this.Camera2StreamConfigurationMap;
            synchronized (lifecycleCameraRepository.getHighResolutionOutputSizeshNQ4ISI) {
                if (hashSet == null) {
                    hashSet = lifecycleCameraRepository.Camera2StreamConfigurationMap.keySet();
                }
                java.util.Iterator<androidx.camera.lifecycle.LifecycleCameraRepository.Key> it = hashSet.iterator();
                while (it.hasNext()) {
                    androidx.camera.lifecycle.LifecycleCamera lifecycleCamera = lifecycleCameraRepository.Camera2StreamConfigurationMap.get(it.next());
                    if (lifecycleCamera != null) {
                        lifecycleCamera.getHighResolutionOutputSizeshNQ4ISI();
                        lifecycleCameraRepository.Camera2StreamConfigurationMap(lifecycleCamera.getLifecycleOwner());
                    }
                }
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        } finally {
            androidx.tracing.Trace.endSection();
        }
    }

    @Override // androidx.camera.core.CameraProvider
    public final boolean hasCamera(androidx.camera.core.CameraSelector cameraSelector) throws androidx.camera.core.CameraInfoUnavailableException {
        boolean z;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraSelector, "");
        androidx.tracing.Trace.beginSection("CX:hasCamera");
        try {
            androidx.camera.core.CameraX cameraX = this.getHighSpeedVideoFpsRanges;
            kotlin.jvm.internal.Intrinsics.checkNotNull(cameraX);
            cameraSelector.select(cameraX.getCameraRepository().getCameras());
            z = true;
        } catch (java.lang.IllegalArgumentException unused) {
            z = false;
        } catch (java.lang.Throwable th) {
            androidx.tracing.Trace.endSection();
            throw th;
        }
        androidx.tracing.Trace.endSection();
        return z;
    }

    @Override // androidx.camera.lifecycle.LifecycleCameraProvider
    public final androidx.camera.core.Camera bindToLifecycle(androidx.view.LifecycleOwner lifecycleOwner, androidx.camera.core.CameraSelector cameraSelector, androidx.camera.core.UseCase... useCases) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraSelector, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(useCases, "");
        androidx.tracing.Trace.beginSection("CX:bindToLifecycle");
        try {
            if (getHighSpeedVideoFpsRangesFor() == 2) {
                throw new java.lang.UnsupportedOperationException("bindToLifecycle for single camera is not supported in concurrent camera mode, call unbindAll() first");
            }
            access$setCameraOperatingMode(this, 1);
            return getHighResolutionOutputSizeshNQ4ISI(this, lifecycleOwner, cameraSelector, new androidx.camera.core.LegacySessionConfig(kotlin.collections.ArraysKt.filterNotNull(useCases), null, null, 6, null));
        } finally {
            androidx.tracing.Trace.endSection();
        }
    }

    @Override // androidx.camera.lifecycle.LifecycleCameraProvider
    public final androidx.camera.core.Camera bindToLifecycle(androidx.view.LifecycleOwner lifecycleOwner, androidx.camera.core.CameraSelector cameraSelector, androidx.camera.core.UseCaseGroup useCaseGroup) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraSelector, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(useCaseGroup, "");
        androidx.tracing.Trace.beginSection("CX:bindToLifecycle-UseCaseGroup");
        try {
            if (getHighSpeedVideoFpsRangesFor() == 2) {
                throw new java.lang.UnsupportedOperationException("bindToLifecycle for single camera is not supported in concurrent camera mode, call unbindAll() first.");
            }
            access$setCameraOperatingMode(this, 1);
            return getHighResolutionOutputSizeshNQ4ISI(this, lifecycleOwner, cameraSelector, new androidx.camera.core.LegacySessionConfig(useCaseGroup));
        } finally {
            androidx.tracing.Trace.endSection();
        }
    }

    @Override // androidx.camera.lifecycle.LifecycleCameraProvider
    public final androidx.camera.core.Camera bindToLifecycle(androidx.view.LifecycleOwner lifecycleOwner, androidx.camera.core.CameraSelector cameraSelector, androidx.camera.core.SessionConfig sessionConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraSelector, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionConfig, "");
        androidx.tracing.Trace.beginSection("CX:bindToLifecycle-SessionConfig");
        try {
            if (getHighSpeedVideoFpsRangesFor() == 2) {
                throw new java.lang.UnsupportedOperationException("bindToLifecycle for single camera is not supported in concurrent camera mode, call unbindAll() first.");
            }
            access$setCameraOperatingMode(this, 1);
            return getHighResolutionOutputSizeshNQ4ISI(this, lifecycleOwner, cameraSelector, sessionConfig);
        } finally {
            androidx.tracing.Trace.endSection();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x01d0, code lost:
    
        if (access$isPreview(r13, r3) == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01e1, code lost:
    
        r2 = r4.getLifecycleOwner();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, "");
        r3 = r4.getCameraSelector();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, "");
        r0 = r6.getCameraSelector();
        r5 = r4.getCompositionSettings();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, "");
        r6 = r6.getCompositionSettings();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, "");
        r4 = r4.getUseCaseGroup();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, "");
        r8.add(getHighSpeedVideoSizes(r2, r3, r0, r5, r6, new androidx.camera.core.LegacySessionConfig(r4)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01df, code lost:
    
        if (access$isVideoCapture(r13, r3) != false) goto L58;
     */
    @Override // androidx.camera.lifecycle.LifecycleCameraProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final androidx.camera.core.ConcurrentCamera bindToLifecycle(java.util.List<androidx.camera.core.ConcurrentCamera.SingleCameraConfig> singleCameraConfigs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(singleCameraConfigs, "");
        androidx.tracing.Trace.beginSection("CX:bindToLifecycle-Concurrent");
        try {
            if (singleCameraConfigs.size() < 2) {
                throw new java.lang.IllegalArgumentException("Concurrent camera needs two camera configs.");
            }
            if (singleCameraConfigs.size() > 2) {
                throw new java.lang.IllegalArgumentException("Concurrent camera is only supporting two cameras at maximum.");
            }
            androidx.camera.core.ConcurrentCamera.SingleCameraConfig singleCameraConfig = singleCameraConfigs.get(0);
            kotlin.jvm.internal.Intrinsics.checkNotNull(singleCameraConfig);
            androidx.camera.core.ConcurrentCamera.SingleCameraConfig singleCameraConfig2 = singleCameraConfig;
            androidx.camera.core.ConcurrentCamera.SingleCameraConfig singleCameraConfig3 = singleCameraConfigs.get(1);
            kotlin.jvm.internal.Intrinsics.checkNotNull(singleCameraConfig3);
            androidx.camera.core.ConcurrentCamera.SingleCameraConfig singleCameraConfig4 = singleCameraConfig3;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (kotlin.jvm.internal.Intrinsics.areEqual(singleCameraConfig2.getCameraSelector().getLensFacing(), singleCameraConfig4.getCameraSelector().getLensFacing())) {
                if (getHighSpeedVideoFpsRangesFor() == 2) {
                    throw new java.lang.UnsupportedOperationException("Camera is already running, call unbindAll() before binding more cameras.");
                }
                if (!kotlin.jvm.internal.Intrinsics.areEqual(singleCameraConfig2.getLifecycleOwner(), singleCameraConfig4.getLifecycleOwner()) || !kotlin.jvm.internal.Intrinsics.areEqual(singleCameraConfig2.getUseCaseGroup().getViewPort(), singleCameraConfig4.getUseCaseGroup().getViewPort()) || !kotlin.jvm.internal.Intrinsics.areEqual(singleCameraConfig2.getUseCaseGroup().getEffects(), singleCameraConfig4.getUseCaseGroup().getEffects())) {
                    throw new java.lang.IllegalArgumentException("Two camera configs need to have the same lifecycle owner, view port and effects.");
                }
                androidx.view.LifecycleOwner lifecycleOwner = singleCameraConfig2.getLifecycleOwner();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lifecycleOwner, "");
                androidx.camera.core.CameraSelector cameraSelector = singleCameraConfig2.getCameraSelector();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(cameraSelector, "");
                androidx.camera.core.ViewPort viewPort = singleCameraConfig2.getUseCaseGroup().getViewPort();
                java.util.List<androidx.camera.core.CameraEffect> effects = singleCameraConfig2.getUseCaseGroup().getEffects();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(effects, "");
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (androidx.camera.core.ConcurrentCamera.SingleCameraConfig singleCameraConfig5 : singleCameraConfigs) {
                    kotlin.jvm.internal.Intrinsics.checkNotNull(singleCameraConfig5);
                    for (androidx.camera.core.UseCase useCase : singleCameraConfig5.getUseCaseGroup().getUseCases()) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(useCase, "");
                        androidx.camera.core.UseCase useCase2 = useCase;
                        java.lang.String physicalCameraId = singleCameraConfig5.getCameraSelector().getPhysicalCameraId();
                        if (physicalCameraId != null) {
                            useCase2.setPhysicalCameraId(physicalCameraId);
                        }
                    }
                    java.util.List<androidx.camera.core.UseCase> useCases = singleCameraConfig5.getUseCaseGroup().getUseCases();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(useCases, "");
                    arrayList2.addAll(useCases);
                }
                access$setCameraOperatingMode(this, 1);
                arrayList.add(getHighResolutionOutputSizeshNQ4ISI(this, lifecycleOwner, cameraSelector, new androidx.camera.core.LegacySessionConfig(arrayList2, viewPort, effects)));
            } else {
                android.content.Context context = getContext();
                kotlin.jvm.internal.Intrinsics.checkNotNull(context);
                if (context.getPackageManager().hasSystemFeature("android.hardware.camera.concurrent")) {
                    if (getHighSpeedVideoFpsRangesFor() == 1) {
                        throw new java.lang.UnsupportedOperationException("Camera is already running, call unbindAll() before binding more cameras.");
                    }
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    try {
                        androidx.camera.core.CameraSelector cameraSelector2 = singleCameraConfig2.getCameraSelector();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(cameraSelector2, "");
                        androidx.camera.core.CameraInfo cameraInfo = getCameraInfo(cameraSelector2);
                        androidx.camera.core.CameraSelector cameraSelector3 = singleCameraConfig4.getCameraSelector();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(cameraSelector3, "");
                        androidx.camera.core.CameraInfo cameraInfo2 = getCameraInfo(cameraSelector3);
                        arrayList3.add(cameraInfo);
                        arrayList3.add(cameraInfo2);
                        if (!access$getActiveConcurrentCameraInfos(this).isEmpty() && !kotlin.jvm.internal.Intrinsics.areEqual(arrayList3, access$getActiveConcurrentCameraInfos(this))) {
                            throw new java.lang.UnsupportedOperationException("Cameras are already running, call unbindAll() before binding more cameras.");
                        }
                        access$setCameraOperatingMode(this, 2);
                        if (java.util.Objects.equals(singleCameraConfig2.getUseCaseGroup().getUseCases(), singleCameraConfig4.getUseCaseGroup().getUseCases()) && singleCameraConfig2.getUseCaseGroup().getUseCases().size() == 2) {
                            androidx.camera.core.UseCase useCase3 = singleCameraConfig2.getUseCaseGroup().getUseCases().get(0);
                            androidx.camera.core.UseCase useCase4 = singleCameraConfig2.getUseCaseGroup().getUseCases().get(1);
                            kotlin.jvm.internal.Intrinsics.checkNotNull(useCase3);
                            if (access$isVideoCapture(this, useCase3)) {
                                kotlin.jvm.internal.Intrinsics.checkNotNull(useCase4);
                            }
                            if (access$isPreview(this, useCase3)) {
                                kotlin.jvm.internal.Intrinsics.checkNotNull(useCase4);
                            }
                        }
                        for (androidx.camera.core.ConcurrentCamera.SingleCameraConfig singleCameraConfig6 : singleCameraConfigs) {
                            kotlin.jvm.internal.Intrinsics.checkNotNull(singleCameraConfig6);
                            androidx.view.LifecycleOwner lifecycleOwner2 = singleCameraConfig6.getLifecycleOwner();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lifecycleOwner2, "");
                            androidx.camera.core.CameraSelector cameraSelector4 = singleCameraConfig6.getCameraSelector();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(cameraSelector4, "");
                            androidx.camera.core.UseCaseGroup useCaseGroup = singleCameraConfig6.getUseCaseGroup();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(useCaseGroup, "");
                            arrayList.add(getHighResolutionOutputSizeshNQ4ISI(this, lifecycleOwner2, cameraSelector4, new androidx.camera.core.LegacySessionConfig(useCaseGroup)));
                        }
                        access$setActiveConcurrentCameraInfos(this, arrayList3);
                    } catch (java.lang.IllegalArgumentException unused) {
                        throw new java.lang.IllegalArgumentException("Invalid camera selectors in camera configs.");
                    }
                } else {
                    throw new java.lang.UnsupportedOperationException("Concurrent camera is not supported on the device.");
                }
            }
            return new androidx.camera.core.ConcurrentCamera(arrayList);
        } finally {
            androidx.tracing.Trace.endSection();
        }
    }

    @Override // androidx.camera.core.CameraProvider
    public final java.util.List<androidx.camera.core.CameraInfo> getAvailableCameraInfos() {
        androidx.tracing.Trace.beginSection("CX:getAvailableCameraInfos");
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            androidx.camera.core.CameraX cameraX = this.getHighSpeedVideoFpsRanges;
            kotlin.jvm.internal.Intrinsics.checkNotNull(cameraX);
            java.util.LinkedHashSet<androidx.camera.core.impl.CameraInternal> cameras = cameraX.getCameraRepository().getCameras();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(cameras, "");
            java.util.Iterator<androidx.camera.core.impl.CameraInternal> it = cameras.iterator();
            while (it.hasNext()) {
                androidx.camera.core.CameraInfo cameraInfo = it.next().getCameraInfo();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(cameraInfo, "");
                arrayList.add(cameraInfo);
            }
            return arrayList;
        } finally {
            androidx.tracing.Trace.endSection();
        }
    }

    @Override // androidx.camera.core.CameraProvider
    public final java.util.List<java.util.List<androidx.camera.core.CameraInfo>> getAvailableConcurrentCameraInfos() {
        androidx.tracing.Trace.beginSection("CX:getAvailableConcurrentCameraInfos");
        try {
            java.util.Objects.requireNonNull(this.getHighSpeedVideoFpsRanges);
            androidx.camera.core.CameraX cameraX = this.getHighSpeedVideoFpsRanges;
            kotlin.jvm.internal.Intrinsics.checkNotNull(cameraX);
            java.util.Objects.requireNonNull(cameraX.getCameraFactory().getCameraCoordinator());
            androidx.camera.core.CameraX cameraX2 = this.getHighSpeedVideoFpsRanges;
            kotlin.jvm.internal.Intrinsics.checkNotNull(cameraX2);
            java.util.List<java.util.List<androidx.camera.core.CameraSelector>> concurrentCameraSelectors = cameraX2.getCameraFactory().getCameraCoordinator().getConcurrentCameraSelectors();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(concurrentCameraSelectors, "");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.util.List<androidx.camera.core.CameraSelector> list : concurrentCameraSelectors) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (androidx.camera.core.CameraSelector cameraSelector : list) {
                    try {
                        kotlin.jvm.internal.Intrinsics.checkNotNull(cameraSelector);
                        arrayList2.add(getCameraInfo(cameraSelector));
                    } catch (java.lang.IllegalArgumentException unused) {
                    }
                }
                arrayList.add(arrayList2);
            }
            return arrayList;
        } finally {
            androidx.tracing.Trace.endSection();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final androidx.camera.core.Camera getHighSpeedVideoSizes(androidx.view.LifecycleOwner lifecycleOwner, androidx.camera.core.CameraSelector cameraSelector, androidx.camera.core.CameraSelector cameraSelector2, androidx.camera.core.CompositionSettings compositionSettings, androidx.camera.core.CompositionSettings compositionSettings2, final androidx.camera.core.SessionConfig sessionConfig) {
        androidx.camera.core.impl.CameraInternal cameraInternal;
        androidx.camera.core.impl.AdapterCameraInfo adapterCameraInfo;
        androidx.tracing.Trace.beginSection("CX:bindToLifecycle-internal");
        try {
            androidx.camera.core.impl.utils.Threads.checkMainThread();
            kotlin.Pair access$getSelectorsWithSessionFilter = access$getSelectorsWithSessionFilter(this, sessionConfig, cameraSelector, cameraSelector2);
            androidx.camera.core.CameraSelector cameraSelector3 = (androidx.camera.core.CameraSelector) access$getSelectorsWithSessionFilter.component1();
            androidx.camera.core.CameraSelector cameraSelector4 = (androidx.camera.core.CameraSelector) access$getSelectorsWithSessionFilter.component2();
            androidx.camera.core.CameraX cameraX = this.getHighSpeedVideoFpsRanges;
            kotlin.jvm.internal.Intrinsics.checkNotNull(cameraX);
            androidx.camera.core.impl.CameraInternal select = cameraSelector3.select(cameraX.getCameraRepository().getCameras());
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(select, "");
            select.setPrimary(true);
            androidx.camera.core.CameraInfo cameraInfo = getCameraInfo(cameraSelector3);
            kotlin.jvm.internal.Intrinsics.checkNotNull(cameraInfo, "");
            androidx.camera.core.impl.AdapterCameraInfo adapterCameraInfo2 = (androidx.camera.core.impl.AdapterCameraInfo) cameraInfo;
            if (cameraSelector4 != null) {
                androidx.camera.core.CameraX cameraX2 = this.getHighSpeedVideoFpsRanges;
                kotlin.jvm.internal.Intrinsics.checkNotNull(cameraX2);
                androidx.camera.core.impl.CameraInternal select2 = cameraSelector4.select(cameraX2.getCameraRepository().getCameras());
                select2.setPrimary(false);
                androidx.camera.core.CameraInfo cameraInfo2 = getCameraInfo(cameraSelector4);
                kotlin.jvm.internal.Intrinsics.checkNotNull(cameraInfo2, "");
                adapterCameraInfo = (androidx.camera.core.impl.AdapterCameraInfo) cameraInfo2;
                cameraInternal = select2;
            } else {
                cameraInternal = null;
                adapterCameraInfo = null;
            }
            androidx.camera.core.CameraIdentifier fromAdapterInfos = androidx.camera.core.CameraIdentifier.Factory.fromAdapterInfos(adapterCameraInfo2, adapterCameraInfo);
            androidx.camera.lifecycle.LifecycleCameraRepository lifecycleCameraRepository = this.getInputSizeshNQ4ISI;
            kotlin.jvm.internal.Intrinsics.checkNotNull(lifecycleCameraRepository);
            androidx.camera.lifecycle.LifecycleCamera highSpeedVideoFpsRanges = lifecycleCameraRepository.getHighSpeedVideoFpsRanges(lifecycleOwner, fromAdapterInfos);
            androidx.camera.lifecycle.LifecycleCameraRepository lifecycleCameraRepository2 = this.getInputSizeshNQ4ISI;
            kotlin.jvm.internal.Intrinsics.checkNotNull(lifecycleCameraRepository2);
            java.util.Collection<androidx.camera.lifecycle.LifecycleCamera> highSpeedVideoFpsRanges2 = lifecycleCameraRepository2.getHighSpeedVideoFpsRanges();
            for (androidx.camera.core.UseCase useCase : sessionConfig.getUseCases()) {
                for (androidx.camera.lifecycle.LifecycleCamera lifecycleCamera : highSpeedVideoFpsRanges2) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lifecycleCamera, "");
                    androidx.camera.lifecycle.LifecycleCamera lifecycleCamera2 = lifecycleCamera;
                    if (lifecycleCamera2.isBound(useCase) && !kotlin.jvm.internal.Intrinsics.areEqual(lifecycleCamera2.getLifecycleOwner(), lifecycleOwner)) {
                        kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
                        java.lang.String format = java.lang.String.format("Use case %s already bound to a different lifecycle.", java.util.Arrays.copyOf(new java.lang.Object[]{useCase}, 1));
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
                        throw new java.lang.IllegalStateException(format);
                    }
                }
            }
            if (highSpeedVideoFpsRanges == null) {
                androidx.camera.lifecycle.LifecycleCameraRepository lifecycleCameraRepository3 = this.getInputSizeshNQ4ISI;
                kotlin.jvm.internal.Intrinsics.checkNotNull(lifecycleCameraRepository3);
                androidx.camera.core.CameraX cameraX3 = this.getHighSpeedVideoFpsRanges;
                kotlin.jvm.internal.Intrinsics.checkNotNull(cameraX3);
                androidx.camera.core.internal.CameraUseCaseAdapter provide = cameraX3.getCameraUseCaseAdapterProvider().provide(select, cameraInternal, adapterCameraInfo2, adapterCameraInfo, compositionSettings, compositionSettings2);
                androidx.camera.core.CameraX cameraX4 = this.getHighSpeedVideoFpsRanges;
                kotlin.jvm.internal.Intrinsics.checkNotNull(cameraX4);
                highSpeedVideoFpsRanges = lifecycleCameraRepository3.getHighSpeedVideoFpsRanges(lifecycleOwner, provide, cameraX4.getRotationProvider());
            }
            if (!sessionConfig.getUseCases().isEmpty()) {
                androidx.camera.lifecycle.LifecycleCameraRepository lifecycleCameraRepository4 = this.getInputSizeshNQ4ISI;
                kotlin.jvm.internal.Intrinsics.checkNotNull(lifecycleCameraRepository4);
                kotlin.jvm.internal.Intrinsics.checkNotNull(highSpeedVideoFpsRanges);
                androidx.camera.core.CameraX cameraX5 = this.getHighSpeedVideoFpsRanges;
                kotlin.jvm.internal.Intrinsics.checkNotNull(cameraX5);
                androidx.camera.core.concurrent.CameraCoordinator cameraCoordinator = cameraX5.getCameraFactory().getCameraCoordinator();
                synchronized (lifecycleCameraRepository4.getHighResolutionOutputSizeshNQ4ISI) {
                    androidx.core.util.Preconditions.checkArgument(true ^ sessionConfig.getUseCases().isEmpty());
                    lifecycleCameraRepository4.getHighSpeedVideoFpsRangesFor = cameraCoordinator;
                    androidx.view.LifecycleOwner lifecycleOwner2 = highSpeedVideoFpsRanges.getLifecycleOwner();
                    androidx.camera.lifecycle.LifecycleCameraRepository.LifecycleCameraRepositoryObserver highSpeedVideoSizes = lifecycleCameraRepository4.getHighSpeedVideoSizes(lifecycleOwner2);
                    if (highSpeedVideoSizes != null) {
                        java.util.HashSet hashSet = new java.util.HashSet();
                        for (androidx.camera.lifecycle.LifecycleCameraRepository.Key key : (java.util.Set) java.util.Objects.requireNonNull(lifecycleCameraRepository4.getHighSpeedVideoSizes.get(highSpeedVideoSizes))) {
                            androidx.camera.lifecycle.LifecycleCamera lifecycleCamera3 = lifecycleCameraRepository4.Camera2StreamConfigurationMap.get(key);
                            if (lifecycleCamera3 != null && lifecycleCamera3.getCameraUseCaseAdapter().isRemoved()) {
                                hashSet.add(key);
                            }
                        }
                        if (!hashSet.isEmpty()) {
                            java.lang.StringBuilder sb = new java.lang.StringBuilder("Removing ");
                            sb.append(hashSet.size());
                            sb.append(" stale LifecycleCamera(s).");
                            androidx.camera.core.Logger.w("LifecycleCameraRepository", sb.toString());
                            java.util.Iterator it = hashSet.iterator();
                            while (it.hasNext()) {
                                lifecycleCameraRepository4.Camera2StreamConfigurationMap((androidx.camera.lifecycle.LifecycleCamera) java.util.Objects.requireNonNull(lifecycleCameraRepository4.Camera2StreamConfigurationMap.get((androidx.camera.lifecycle.LifecycleCameraRepository.Key) it.next())));
                            }
                        }
                    }
                    androidx.camera.lifecycle.LifecycleCameraRepository.LifecycleCameraRepositoryObserver highSpeedVideoSizes2 = lifecycleCameraRepository4.getHighSpeedVideoSizes(lifecycleOwner2);
                    if (highSpeedVideoSizes2 != null) {
                        java.util.Set<androidx.camera.lifecycle.LifecycleCameraRepository.Key> set = lifecycleCameraRepository4.getHighSpeedVideoSizes.get(highSpeedVideoSizes2);
                        androidx.camera.core.concurrent.CameraCoordinator cameraCoordinator2 = lifecycleCameraRepository4.getHighSpeedVideoFpsRangesFor;
                        if (cameraCoordinator2 == null || cameraCoordinator2.getCameraOperatingMode() != 2) {
                            java.util.Iterator<androidx.camera.lifecycle.LifecycleCameraRepository.Key> it2 = set.iterator();
                            while (it2.hasNext()) {
                                androidx.camera.lifecycle.LifecycleCamera lifecycleCamera4 = (androidx.camera.lifecycle.LifecycleCamera) androidx.core.util.Preconditions.checkNotNull(lifecycleCameraRepository4.Camera2StreamConfigurationMap.get(it2.next()));
                                if (!lifecycleCamera4.equals(highSpeedVideoFpsRanges) && !lifecycleCamera4.getUseCases().isEmpty()) {
                                    if (!lifecycleCamera4.getHighSpeedVideoFpsRanges() && !sessionConfig.getIsLegacy()) {
                                        lifecycleCamera4.getHighResolutionOutputSizeshNQ4ISI();
                                    } else {
                                        throw new java.lang.IllegalArgumentException("Multiple LifecycleCameras with use cases are registered to the same LifecycleOwner. Please unbind first.");
                                    }
                                }
                            }
                        }
                        try {
                            synchronized (highSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor) {
                                if (highSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges == null) {
                                    highSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges = sessionConfig;
                                } else if (sessionConfig.getIsLegacy()) {
                                    if (!highSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges.getIsLegacy()) {
                                        throw new java.lang.IllegalStateException("Cannot bind use cases when a SessionConfig is already bound to this LifecycleOwner. Please unbind first");
                                    }
                                    java.util.ArrayList arrayList = new java.util.ArrayList(highSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges.getUseCases());
                                    arrayList.addAll(sessionConfig.getUseCases());
                                    highSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges = new androidx.camera.core.LegacySessionConfig(arrayList, sessionConfig.getViewPort(), sessionConfig.getEffects());
                                } else {
                                    if (highSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges.getIsLegacy()) {
                                        throw new java.lang.IllegalStateException("Cannot bind the SessionConfig when use cases are bound to this LifecycleOwner already. Please unbind first");
                                    }
                                    highSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges = sessionConfig;
                                    androidx.camera.core.internal.CameraUseCaseAdapter cameraUseCaseAdapter = highSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI;
                                    cameraUseCaseAdapter.removeUseCases(cameraUseCaseAdapter.getUseCases());
                                }
                                highSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI.setViewPort(sessionConfig.getViewPort());
                                highSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI.setEffects(sessionConfig.getEffects());
                                highSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI.setSessionType(sessionConfig.getSessionType());
                                highSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI.setFrameRate(sessionConfig.getFrameRateRange());
                                if (sessionConfig.getIsAutoRotationEnabled()) {
                                    androidx.camera.lifecycle.LifecycleCamera.getHighResolutionOutputSizeshNQ4ISI(sessionConfig.getUseCases(), highSpeedVideoFpsRanges.getHighSpeedVideoSizes);
                                }
                                final androidx.camera.core.featuregroup.impl.ResolvedFeatureGroup resolveFeatureGroup = androidx.camera.core.featuregroup.impl.ResolvedFeatureGroup.resolveFeatureGroup(sessionConfig, (androidx.camera.core.impl.CameraInfoInternal) highSpeedVideoFpsRanges.getCameraInfo());
                                sessionConfig.getFeatureSelectionListenerExecutor().execute(new java.lang.Runnable() { // from class: androidx.camera.lifecycle.LifecycleCamera$$ExternalSyntheticLambda0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        androidx.camera.lifecycle.LifecycleCamera.getHighSpeedVideoSizes(androidx.camera.core.featuregroup.impl.ResolvedFeatureGroup.this, sessionConfig);
                                    }
                                });
                                highSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI.addUseCases(sessionConfig.getUseCases(), resolveFeatureGroup);
                            }
                            if (lifecycleOwner2.getLifecycle().getCamera2StreamConfigurationMap().isAtLeast(androidx.lifecycle.Lifecycle.State.STARTED)) {
                                lifecycleCameraRepository4.getHighSpeedVideoFpsRangesFor(lifecycleOwner2);
                            }
                        } catch (androidx.camera.core.internal.CameraUseCaseAdapter.CameraException e) {
                            throw new java.lang.IllegalArgumentException(e);
                        }
                    }
                }
                this.Camera2StreamConfigurationMap.add(androidx.camera.lifecycle.LifecycleCameraRepository.Key.getHighResolutionOutputSizeshNQ4ISI(lifecycleOwner, fromAdapterInfos));
            } else {
                kotlin.jvm.internal.Intrinsics.checkNotNull(highSpeedVideoFpsRanges);
            }
            androidx.tracing.Trace.endSection();
            return highSpeedVideoFpsRanges;
        } catch (java.lang.Throwable th) {
            androidx.tracing.Trace.endSection();
            throw th;
        }
    }

    @Override // androidx.camera.core.CameraProvider
    public final androidx.camera.core.CameraInfo getCameraInfo(androidx.camera.core.CameraSelector cameraSelector) {
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraSelector, "");
        androidx.tracing.Trace.beginSection("CX:getCameraInfo");
        try {
            androidx.camera.core.CameraX cameraX = this.getHighSpeedVideoFpsRanges;
            kotlin.jvm.internal.Intrinsics.checkNotNull(cameraX);
            androidx.camera.core.impl.CameraInfoInternal camera2StreamConfigurationMap = cameraSelector.select(cameraX.getCameraRepository().getCameras()).getCamera2StreamConfigurationMap();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(camera2StreamConfigurationMap, "");
            androidx.camera.core.impl.CameraConfig access$getCameraConfig = access$getCameraConfig(this, cameraSelector, camera2StreamConfigurationMap);
            java.lang.String cameraId = camera2StreamConfigurationMap.getCameraId();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(cameraId, "");
            androidx.camera.core.CameraIdentifier create = androidx.camera.core.CameraIdentifier.Factory.create(cameraId, null, access$getCameraConfig.getCompatibilityId());
            synchronized (this.getOutputFormats) {
                obj = this.getHighSpeedVideoSizes.get(create);
                if (obj == null) {
                    obj = new androidx.camera.core.impl.AdapterCameraInfo(camera2StreamConfigurationMap, access$getCameraConfig);
                    this.getHighSpeedVideoSizes.put(create, obj);
                }
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
            androidx.camera.core.impl.AdapterCameraInfo adapterCameraInfo = (androidx.camera.core.impl.AdapterCameraInfo) obj;
            androidx.tracing.Trace.endSection();
            return adapterCameraInfo;
        } catch (java.lang.Throwable th) {
            androidx.tracing.Trace.endSection();
            throw th;
        }
    }

    /* renamed from: $r8$lambda$1d6fK4V_iwXm_23qvpSvEc-Bbqc, reason: not valid java name */
    public static /* synthetic */ com.google.common.util.concurrent.ListenableFuture m1018$r8$lambda$1d6fK4V_iwXm_23qvpSvEcBbqc(kotlin.jvm.functions.Function1 function1, java.lang.Object obj) {
        return (com.google.common.util.concurrent.ListenableFuture) function1.invoke(obj);
    }

    public static /* synthetic */ void $r8$lambda$cqEKuAajCjqIPjMA5N0LIeIbAfA(androidx.camera.lifecycle.LifecycleCameraProviderImpl lifecycleCameraProviderImpl) {
        if (lifecycleCameraProviderImpl.getHighSpeedVideoFpsRanges != null) {
            lifecycleCameraProviderImpl.unbindAll();
            androidx.camera.lifecycle.LifecycleCameraRepository lifecycleCameraRepository = lifecycleCameraProviderImpl.getInputSizeshNQ4ISI;
            kotlin.jvm.internal.Intrinsics.checkNotNull(lifecycleCameraRepository);
            java.util.HashSet<androidx.camera.lifecycle.LifecycleCameraRepository.Key> hashSet = lifecycleCameraProviderImpl.Camera2StreamConfigurationMap;
            synchronized (lifecycleCameraRepository.getHighResolutionOutputSizeshNQ4ISI) {
                if (hashSet == null) {
                    hashSet = lifecycleCameraRepository.Camera2StreamConfigurationMap.keySet();
                }
                for (androidx.camera.lifecycle.LifecycleCameraRepository.Key key : hashSet) {
                    if (lifecycleCameraRepository.Camera2StreamConfigurationMap.containsKey(key)) {
                        lifecycleCameraRepository.Camera2StreamConfigurationMap(lifecycleCameraRepository.Camera2StreamConfigurationMap.get(key));
                    }
                }
            }
        }
    }

    public static /* synthetic */ java.lang.Void $r8$lambda$fGSKVcSoAXbK7NEn8opAT2ioUoU(androidx.camera.lifecycle.LifecycleCameraProviderImpl lifecycleCameraProviderImpl, androidx.camera.core.CameraX cameraX, android.content.Context context, java.lang.Void r3) {
        lifecycleCameraProviderImpl.getHighSpeedVideoFpsRanges(cameraX, androidx.camera.core.impl.utils.ContextUtil.getPersistentApplicationContext(context));
        return r3;
    }

    public static /* synthetic */ java.lang.Void $r8$lambda$yTT8jiXuM53WIUjzfHGHYzzmhkI(kotlin.jvm.functions.Function1 function1, java.lang.Object obj) {
        return (java.lang.Void) function1.invoke(obj);
    }

    public static final /* synthetic */ java.util.List access$getActiveConcurrentCameraInfos(androidx.camera.lifecycle.LifecycleCameraProviderImpl lifecycleCameraProviderImpl) {
        androidx.camera.core.CameraX cameraX = lifecycleCameraProviderImpl.getHighSpeedVideoFpsRanges;
        if (cameraX != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(cameraX);
            java.util.List<androidx.camera.core.CameraInfo> activeConcurrentCameraInfos = cameraX.getCameraFactory().getCameraCoordinator().getActiveConcurrentCameraInfos();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(activeConcurrentCameraInfos, "");
            return activeConcurrentCameraInfos;
        }
        return kotlin.collections.CollectionsKt.emptyList();
    }

    public static final /* synthetic */ androidx.camera.core.impl.CameraConfig access$getCameraConfig(androidx.camera.lifecycle.LifecycleCameraProviderImpl lifecycleCameraProviderImpl, androidx.camera.core.CameraSelector cameraSelector, androidx.camera.core.CameraInfo cameraInfo) {
        java.util.Iterator<androidx.camera.core.CameraFilter> it = cameraSelector.getCameraFilterSet().iterator();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "");
        androidx.camera.core.impl.CameraConfig cameraConfig = null;
        while (it.hasNext()) {
            androidx.camera.core.CameraFilter next = it.next();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(next, "");
            androidx.camera.core.CameraFilter cameraFilter = next;
            if (!kotlin.jvm.internal.Intrinsics.areEqual(cameraFilter.getIdentifier(), androidx.camera.core.CameraFilter.DEFAULT_ID)) {
                androidx.camera.core.impl.CameraConfigProvider configProvider = androidx.camera.core.impl.ExtendedCameraConfigProviderStore.getConfigProvider(cameraFilter.getIdentifier());
                android.content.Context context = lifecycleCameraProviderImpl.context;
                kotlin.jvm.internal.Intrinsics.checkNotNull(context);
                androidx.camera.core.impl.CameraConfig config = configProvider.getConfig(cameraInfo, context);
                if (config == null) {
                    continue;
                } else {
                    if (cameraConfig != null) {
                        throw new java.lang.IllegalArgumentException("Cannot apply multiple extended camera configs at the same time.");
                    }
                    cameraConfig = config;
                }
            }
        }
        return cameraConfig == null ? androidx.camera.core.impl.CameraConfigs.defaultConfig() : cameraConfig;
    }

    public static final /* synthetic */ kotlin.Pair access$getSelectorsWithSessionFilter(androidx.camera.lifecycle.LifecycleCameraProviderImpl lifecycleCameraProviderImpl, androidx.camera.core.SessionConfig sessionConfig, androidx.camera.core.CameraSelector cameraSelector, androidx.camera.core.CameraSelector cameraSelector2) {
        androidx.camera.core.CameraFilter getHighSpeedVideoSizes = sessionConfig.getGetHighSpeedVideoSizes();
        if (getHighSpeedVideoSizes == null) {
            return kotlin.TuplesKt.to(cameraSelector, cameraSelector2);
        }
        androidx.camera.core.CameraSelector build = androidx.camera.core.CameraSelector.Builder.fromSelector(cameraSelector).addCameraFilter(getHighSpeedVideoSizes).build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "");
        return kotlin.TuplesKt.to(build, cameraSelector2 != null ? androidx.camera.core.CameraSelector.Builder.fromSelector(cameraSelector2).addCameraFilter(getHighSpeedVideoSizes).build() : null);
    }

    public static final /* synthetic */ boolean access$isPreview(androidx.camera.lifecycle.LifecycleCameraProviderImpl lifecycleCameraProviderImpl, androidx.camera.core.UseCase useCase) {
        return useCase instanceof androidx.camera.core.Preview;
    }

    public static final /* synthetic */ boolean access$isVideoCapture(androidx.camera.lifecycle.LifecycleCameraProviderImpl lifecycleCameraProviderImpl, androidx.camera.core.UseCase useCase) {
        return useCase.getCurrentConfig().containsOption(androidx.camera.core.impl.UseCaseConfig.OPTION_CAPTURE_TYPE) && useCase.getCurrentConfig().getCaptureType() == androidx.camera.core.impl.UseCaseConfigFactory.CaptureType.VIDEO_CAPTURE;
    }

    public static final /* synthetic */ void access$setActiveConcurrentCameraInfos(androidx.camera.lifecycle.LifecycleCameraProviderImpl lifecycleCameraProviderImpl, java.util.List list) {
        androidx.camera.core.CameraX cameraX = lifecycleCameraProviderImpl.getHighSpeedVideoFpsRanges;
        if (cameraX != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(cameraX);
            cameraX.getCameraFactory().getCameraCoordinator().setActiveConcurrentCameraInfos(list);
        }
    }

    public static final /* synthetic */ void access$setCameraOperatingMode(androidx.camera.lifecycle.LifecycleCameraProviderImpl lifecycleCameraProviderImpl, int i) {
        androidx.camera.core.CameraX cameraX = lifecycleCameraProviderImpl.getHighSpeedVideoFpsRanges;
        if (cameraX != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(cameraX);
            cameraX.getCameraFactory().getCameraCoordinator().setCameraOperatingMode(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getHighSpeedVideoFpsRangesFor() {
        androidx.camera.core.CameraX cameraX = this.getHighSpeedVideoFpsRanges;
        if (cameraX == null) {
            return 0;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(cameraX);
        return cameraX.getCameraFactory().getCameraCoordinator().getCameraOperatingMode();
    }

    @Override // androidx.camera.core.CameraPresenceListener
    public final void onCamerasAdded(java.util.Set<androidx.camera.core.CameraIdentifier> addedCameraIds) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addedCameraIds, "");
    }
}
