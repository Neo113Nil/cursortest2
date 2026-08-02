package androidx.camera.camera2.pipe.config;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u000f8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011"}, d2 = {"Landroidx/camera/camera2/pipe/config/ThreadConfigModule;", "", "Landroidx/camera/camera2/pipe/CameraPipe$ThreadConfig;", "threadConfig", "<init>", "(Landroidx/camera/camera2/pipe/CameraPipe$ThreadConfig;)V", "Landroidx/camera/camera2/pipe/internal/CameraPipeLifetime;", "cameraPipeLifetime", "Lkotlinx/coroutines/Job;", "cameraPipeJob", "Landroidx/camera/camera2/pipe/core/Threads;", "provideThreads", "(Landroidx/camera/camera2/pipe/internal/CameraPipeLifetime;Lkotlinx/coroutines/Job;)Landroidx/camera/camera2/pipe/core/Threads;", "getHighSpeedVideoFpsRangesFor", "Landroidx/camera/camera2/pipe/CameraPipe$ThreadConfig;", "", "getHighSpeedVideoFpsRanges", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoSizes", "getHighResolutionOutputSizeshNQ4ISI", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 1, 0}, xi = 48)
@dagger.Module
/* loaded from: classes6.dex */
public final class ThreadConfigModule {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final int getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final int Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final int getHighSpeedVideoSizes;
    private final androidx.camera.camera2.pipe.CameraPipe.ThreadConfig getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final int getHighSpeedVideoFpsRanges;

    public static /* synthetic */ java.util.concurrent.Executor $r8$lambda$xSWIlTwVrOxvbCnVLHTWhJ7CAuI(java.util.concurrent.Executor executor) {
        return executor;
    }

    public ThreadConfigModule(androidx.camera.camera2.pipe.CameraPipe.ThreadConfig threadConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(threadConfig, "");
        this.getHighSpeedVideoFpsRangesFor = threadConfig;
        this.getHighSpeedVideoSizes = java.lang.Math.max(4, java.lang.Runtime.getRuntime().availableProcessors() - 2);
        this.Camera2StreamConfigurationMap = 4;
        this.getHighSpeedVideoFpsRanges = -3;
        this.getHighResolutionOutputSizeshNQ4ISI = -1;
    }

    /* JADX WARN: Type inference failed for: r14v5, types: [T, kotlinx.coroutines.CoroutineScope] */
    /* JADX WARN: Type inference failed for: r14v7, types: [T, kotlinx.coroutines.CoroutineScope] */
    /* JADX WARN: Type inference failed for: r15v3, types: [T, kotlinx.coroutines.CoroutineScope] */
    /* JADX WARN: Type inference failed for: r2v6, types: [T, kotlinx.coroutines.CoroutineScope] */
    @dagger.Provides
    @javax.inject.Singleton
    public final androidx.camera.camera2.pipe.core.Threads provideThreads(final androidx.camera.camera2.pipe.internal.CameraPipeLifetime cameraPipeLifetime, @androidx.camera.camera2.pipe.config.CameraPipeJob kotlinx.coroutines.Job cameraPipeJob) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraPipeLifetime, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraPipeJob, "");
        final java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.concurrent.ScheduledExecutorService defaultBlockingExecutor = this.getHighSpeedVideoFpsRangesFor.getDefaultBlockingExecutor();
        if (defaultBlockingExecutor == null) {
            java.util.concurrent.ScheduledExecutorService asScheduledThreadPool = androidx.camera.camera2.pipe.core.AndroidThreads.INSTANCE.asScheduledThreadPool(androidx.camera.camera2.pipe.core.AndroidThreads.INSTANCE.withAndroidPriority(androidx.camera.camera2.pipe.core.AndroidThreads.INSTANCE.withPrefix(androidx.camera.camera2.pipe.core.AndroidThreads.INSTANCE.getFactory(), "CXCP-IO-"), this.getHighResolutionOutputSizeshNQ4ISI), 8);
            arrayList.add(asScheduledThreadPool);
            defaultBlockingExecutor = asScheduledThreadPool;
        }
        java.util.concurrent.Executor executor = defaultBlockingExecutor;
        kotlinx.coroutines.CoroutineDispatcher from = kotlinx.coroutines.ExecutorsKt.from(executor);
        java.util.concurrent.ScheduledExecutorService defaultBackgroundExecutor = this.getHighSpeedVideoFpsRangesFor.getDefaultBackgroundExecutor();
        if (defaultBackgroundExecutor == null) {
            java.util.concurrent.ScheduledExecutorService asScheduledThreadPool2 = androidx.camera.camera2.pipe.core.AndroidThreads.INSTANCE.asScheduledThreadPool(androidx.camera.camera2.pipe.core.AndroidThreads.INSTANCE.withAndroidPriority(androidx.camera.camera2.pipe.core.AndroidThreads.INSTANCE.withPrefix(androidx.camera.camera2.pipe.core.AndroidThreads.INSTANCE.getFactory(), "CXCP-BG-"), this.getHighResolutionOutputSizeshNQ4ISI), this.Camera2StreamConfigurationMap);
            arrayList.add(asScheduledThreadPool2);
            defaultBackgroundExecutor = asScheduledThreadPool2;
        }
        java.util.concurrent.Executor executor2 = defaultBackgroundExecutor;
        kotlinx.coroutines.CoroutineDispatcher from2 = kotlinx.coroutines.ExecutorsKt.from(executor2);
        java.util.concurrent.ScheduledExecutorService defaultLightweightExecutor = this.getHighSpeedVideoFpsRangesFor.getDefaultLightweightExecutor();
        if (defaultLightweightExecutor == null) {
            java.util.concurrent.ScheduledExecutorService asScheduledThreadPool3 = androidx.camera.camera2.pipe.core.AndroidThreads.INSTANCE.asScheduledThreadPool(androidx.camera.camera2.pipe.core.AndroidThreads.INSTANCE.withAndroidPriority(androidx.camera.camera2.pipe.core.AndroidThreads.INSTANCE.withPrefix(androidx.camera.camera2.pipe.core.AndroidThreads.INSTANCE.getFactory(), "CXCP-"), this.getHighSpeedVideoFpsRanges), this.getHighSpeedVideoSizes);
            arrayList.add(asScheduledThreadPool3);
            defaultLightweightExecutor = asScheduledThreadPool3;
        }
        java.util.concurrent.Executor executor3 = defaultLightweightExecutor;
        kotlinx.coroutines.CoroutineDispatcher from3 = kotlinx.coroutines.ExecutorsKt.from(executor3);
        cameraPipeLifetime.addShutdownAction(androidx.camera.camera2.pipe.internal.CameraPipeLifetime.ShutdownType.THREAD, new java.lang.Runnable() { // from class: androidx.camera.camera2.pipe.config.ThreadConfigModule$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.camera2.pipe.config.ThreadConfigModule.m865$r8$lambda$jeb5Vw5LnFgi_4xpswUjpNN2h0(arrayList);
            }
        });
        kotlin.jvm.functions.Function0<android.os.Handler> defaultCameraHandlerFn = this.getHighSpeedVideoFpsRangesFor.getDefaultCameraHandlerFn();
        if (defaultCameraHandlerFn == null) {
            defaultCameraHandlerFn = new kotlin.jvm.functions.Function0() { // from class: androidx.camera.camera2.pipe.config.ThreadConfigModule$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return androidx.camera.camera2.pipe.config.ThreadConfigModule.$r8$lambda$wABDi6HCco0H4HmkIa31ylMsIOk(androidx.camera.camera2.pipe.config.ThreadConfigModule.this, cameraPipeLifetime);
                }
            };
        }
        kotlin.jvm.functions.Function0<android.os.Handler> function0 = defaultCameraHandlerFn;
        kotlin.jvm.functions.Function0 function02 = new kotlin.jvm.functions.Function0() { // from class: androidx.camera.camera2.pipe.config.ThreadConfigModule$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return androidx.camera.camera2.pipe.config.ThreadConfigModule.m862$r8$lambda$5P1hWeb8e3yIYEHQIrJfBt4bYw(androidx.camera.camera2.pipe.config.ThreadConfigModule.this, cameraPipeLifetime);
            }
        };
        final kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
        final kotlin.jvm.internal.Ref.ObjectRef objectRef2 = new kotlin.jvm.internal.Ref.ObjectRef();
        if (this.getHighSpeedVideoFpsRangesFor.getTestOnlyScope() != null) {
            objectRef.element = this.getHighSpeedVideoFpsRangesFor.getTestOnlyScope();
            objectRef2.element = this.getHighSpeedVideoFpsRangesFor.getTestOnlyScope();
        } else {
            objectRef.element = kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(kotlinx.coroutines.SupervisorKt.SupervisorJob(cameraPipeJob).plus(from3).plus(new kotlinx.coroutines.CoroutineName(androidx.camera.camera2.pipe.core.Log.TAG)));
            objectRef2.element = kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(kotlinx.coroutines.SupervisorKt.SupervisorJob(cameraPipeJob).plus(new kotlinx.coroutines.CoroutineName("CXCP-Dispatch")));
            cameraPipeLifetime.addShutdownAction(androidx.camera.camera2.pipe.internal.CameraPipeLifetime.ShutdownType.SCOPE, new java.lang.Runnable() { // from class: androidx.camera.camera2.pipe.config.ThreadConfigModule$$ExternalSyntheticLambda6
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.camera2.pipe.config.ThreadConfigModule.$r8$lambda$oEFYP5DGguYpNiMpq15Gj4l3Kb4(kotlin.jvm.internal.Ref.ObjectRef.this, objectRef2);
                }
            });
        }
        return new androidx.camera.camera2.pipe.core.Threads((kotlinx.coroutines.CoroutineScope) objectRef.element, (kotlinx.coroutines.CoroutineScope) objectRef2.element, executor, from, executor2, from2, executor3, from3, function0, function02);
    }

    /* renamed from: $r8$lambda$-5P1hWeb8e3yIYEHQIrJfBt4bYw, reason: not valid java name */
    public static /* synthetic */ java.util.concurrent.Executor m862$r8$lambda$5P1hWeb8e3yIYEHQIrJfBt4bYw(androidx.camera.camera2.pipe.config.ThreadConfigModule threadConfigModule, androidx.camera.camera2.pipe.internal.CameraPipeLifetime cameraPipeLifetime) {
        if (threadConfigModule.getHighSpeedVideoFpsRangesFor.getDefaultCameraExecutor() == null) {
            final java.util.concurrent.ExecutorService asFixedSizeThreadPool = androidx.camera.camera2.pipe.core.AndroidThreads.INSTANCE.asFixedSizeThreadPool(androidx.camera.camera2.pipe.core.AndroidThreads.INSTANCE.withAndroidPriority(androidx.camera.camera2.pipe.core.AndroidThreads.INSTANCE.withPrefix(androidx.camera.camera2.pipe.core.AndroidThreads.INSTANCE.getFactory(), "CXCP-Camera-E"), threadConfigModule.getHighSpeedVideoFpsRanges), 1);
            cameraPipeLifetime.addShutdownAction(androidx.camera.camera2.pipe.internal.CameraPipeLifetime.ShutdownType.THREAD, new java.lang.Runnable() { // from class: androidx.camera.camera2.pipe.config.ThreadConfigModule$$ExternalSyntheticLambda7
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.camera2.pipe.config.ThreadConfigModule.m866$r8$lambda$y2vD8fun5cW9oN2ORgqAjxTVG0(asFixedSizeThreadPool);
                }
            });
            return asFixedSizeThreadPool;
        }
        return threadConfigModule.getHighSpeedVideoFpsRangesFor.getDefaultCameraExecutor();
    }

    /* renamed from: $r8$lambda$PSzifxAAI37xjO-xGks0n_xTjmo, reason: not valid java name */
    public static /* synthetic */ android.os.Handler m863$r8$lambda$PSzifxAAI37xjOxGks0n_xTjmo(androidx.camera.camera2.pipe.config.ThreadConfigModule threadConfigModule) {
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("CXCP-Camera-H", threadConfigModule.getHighSpeedVideoFpsRanges);
        handlerThread.start();
        return new android.os.Handler(handlerThread.getLooper());
    }

    /* renamed from: $r8$lambda$aLGf2lPcF3y7juP-ScX8YxK8gwo, reason: not valid java name */
    public static /* synthetic */ void m864$r8$lambda$aLGf2lPcF3y7juPScX8YxK8gwo(android.os.HandlerThread handlerThread) {
        handlerThread.quit();
        handlerThread.join(1000L);
    }

    /* renamed from: $r8$lambda$jeb-5Vw5LnFgi_4xpswUjpNN2h0, reason: not valid java name */
    public static /* synthetic */ void m865$r8$lambda$jeb5Vw5LnFgi_4xpswUjpNN2h0(java.util.List list) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            ((java.util.concurrent.ExecutorService) it.next()).shutdownNow();
        }
        java.util.Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            ((java.util.concurrent.ExecutorService) it2.next()).awaitTermination(1L, java.util.concurrent.TimeUnit.SECONDS);
        }
    }

    public static /* synthetic */ void $r8$lambda$oEFYP5DGguYpNiMpq15Gj4l3Kb4(kotlin.jvm.internal.Ref.ObjectRef objectRef, kotlin.jvm.internal.Ref.ObjectRef objectRef2) {
        kotlinx.coroutines.CoroutineScopeKt.cancel$default((kotlinx.coroutines.CoroutineScope) objectRef.element, null, 1, null);
        kotlinx.coroutines.CoroutineScopeKt.cancel$default((kotlinx.coroutines.CoroutineScope) objectRef2.element, null, 1, null);
    }

    public static /* synthetic */ android.os.Handler $r8$lambda$wABDi6HCco0H4HmkIa31ylMsIOk(androidx.camera.camera2.pipe.config.ThreadConfigModule threadConfigModule, androidx.camera.camera2.pipe.internal.CameraPipeLifetime cameraPipeLifetime) {
        if (threadConfigModule.getHighSpeedVideoFpsRangesFor.getDefaultCameraHandler() == null) {
            final android.os.HandlerThread handlerThread = new android.os.HandlerThread("CXCP-Camera-H", threadConfigModule.getHighSpeedVideoFpsRanges);
            handlerThread.start();
            cameraPipeLifetime.addShutdownAction(androidx.camera.camera2.pipe.internal.CameraPipeLifetime.ShutdownType.THREAD, new java.lang.Runnable() { // from class: androidx.camera.camera2.pipe.config.ThreadConfigModule$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.camera2.pipe.config.ThreadConfigModule.m864$r8$lambda$aLGf2lPcF3y7juPScX8YxK8gwo(handlerThread);
                }
            });
            return new android.os.Handler(handlerThread.getLooper());
        }
        return threadConfigModule.getHighSpeedVideoFpsRangesFor.getDefaultCameraHandler();
    }

    /* renamed from: $r8$lambda$y2vD8fun5cW9oN2O-RgqAjxTVG0, reason: not valid java name */
    public static /* synthetic */ void m866$r8$lambda$y2vD8fun5cW9oN2ORgqAjxTVG0(java.util.concurrent.ExecutorService executorService) {
        executorService.shutdownNow();
        executorService.awaitTermination(1L, java.util.concurrent.TimeUnit.SECONDS);
    }
}
