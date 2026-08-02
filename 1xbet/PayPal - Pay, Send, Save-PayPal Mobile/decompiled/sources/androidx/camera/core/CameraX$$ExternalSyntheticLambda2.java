package androidx.camera.core;

/* loaded from: classes6.dex */
public final /* synthetic */ class CameraX$$ExternalSyntheticLambda2 implements java.lang.Runnable {
    public final /* synthetic */ androidx.camera.core.CameraX f$0;
    public final /* synthetic */ android.content.Context f$1;
    public final /* synthetic */ java.util.concurrent.Executor f$2;
    public final /* synthetic */ int f$3;
    public final /* synthetic */ androidx.concurrent.futures.CallbackToFutureAdapter.Completer f$4;
    public final /* synthetic */ long f$5;

    public /* synthetic */ CameraX$$ExternalSyntheticLambda2(androidx.camera.core.CameraX cameraX, android.content.Context context, java.util.concurrent.Executor executor, int i, androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer, long j) {
        this.f$0 = cameraX;
        this.f$1 = context;
        this.f$2 = executor;
        this.f$3 = i;
        this.f$4 = completer;
        this.f$5 = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01b7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        androidx.camera.core.RetryPolicy.RetryConfig onRetryDecisionRequested;
        java.util.concurrent.ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        final androidx.camera.core.CameraX cameraX = this.f$0;
        final android.content.Context context = this.f$1;
        final java.util.concurrent.Executor executor = this.f$2;
        final int i = this.f$3;
        final androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer = this.f$4;
        final long j = this.f$5;
        androidx.tracing.Trace.beginSection("CX:initAndRetryRecursively");
        try {
            try {
                androidx.camera.core.impl.CameraFactory.Provider cameraFactoryProvider = cameraX.getOutputFormats.getCameraFactoryProvider(null);
                try {
                    if (cameraFactoryProvider == null) {
                        throw new androidx.camera.core.InitializationException(new java.lang.IllegalArgumentException("Invalid app configuration provided. Missing CameraFactory."));
                    }
                    androidx.camera.core.impl.CameraThreadConfig create = androidx.camera.core.impl.CameraThreadConfig.create(cameraX.Camera2StreamConfigurationMap, cameraX.getOutputSizes);
                    androidx.camera.core.CameraSelector availableCamerasLimiter = cameraX.getOutputFormats.getAvailableCamerasLimiter(null);
                    androidx.camera.core.impl.CameraValidator create2 = androidx.camera.core.impl.CameraValidator.create(context, availableCamerasLimiter);
                    long cameraOpenRetryMaxTimeoutInMillisWhileResuming = cameraX.getOutputFormats.getCameraOpenRetryMaxTimeoutInMillisWhileResuming();
                    androidx.camera.core.impl.UseCaseConfigFactory.Provider useCaseConfigFactoryProvider = cameraX.getOutputFormats.getUseCaseConfigFactoryProvider(null);
                    if (useCaseConfigFactoryProvider == null) {
                        throw new androidx.camera.core.InitializationException(new java.lang.IllegalArgumentException("Invalid app configuration provided. Missing UseCaseConfigFactory."));
                    }
                    cameraX.getInputSizeshNQ4ISI = useCaseConfigFactoryProvider.newInstance(context);
                    androidx.camera.core.internal.StreamSpecsCalculatorImpl streamSpecsCalculatorImpl = new androidx.camera.core.internal.StreamSpecsCalculatorImpl(cameraX.getInputSizeshNQ4ISI, null);
                    cameraX.getOutputSizeshNQ4ISI = streamSpecsCalculatorImpl;
                    cameraX.getHighSpeedVideoFpsRanges = cameraFactoryProvider.newInstance(context, create, availableCamerasLimiter, cameraOpenRetryMaxTimeoutInMillisWhileResuming, cameraX.getOutputFormats, streamSpecsCalculatorImpl);
                    androidx.camera.core.impl.CameraDeviceSurfaceManager.Provider deviceSurfaceManagerProvider = cameraX.getOutputFormats.getDeviceSurfaceManagerProvider(null);
                    if (deviceSurfaceManagerProvider == null) {
                        throw new androidx.camera.core.InitializationException(new java.lang.IllegalArgumentException("Invalid app configuration provided. Missing CameraDeviceSurfaceManager."));
                    }
                    androidx.camera.core.impl.CameraDeviceSurfaceManager newInstance = deviceSurfaceManagerProvider.newInstance(context, cameraX.getHighSpeedVideoFpsRanges.getCameraManager(), cameraX.getHighSpeedVideoFpsRanges.getAvailableCameraIds());
                    cameraX.getOutputMinFrameDurationlomOqCM = newInstance;
                    cameraX.getOutputSizeshNQ4ISI.setCameraDeviceSurfaceManager(newInstance);
                    if (executor instanceof androidx.camera.core.CameraExecutor) {
                        androidx.camera.core.CameraExecutor cameraExecutor = (androidx.camera.core.CameraExecutor) executor;
                        androidx.camera.core.impl.CameraFactory cameraFactory = cameraX.getHighSpeedVideoFpsRanges;
                        androidx.core.util.Preconditions.checkNotNull(cameraFactory);
                        synchronized (cameraExecutor.Camera2StreamConfigurationMap) {
                            if (cameraExecutor.getHighResolutionOutputSizeshNQ4ISI.isShutdown()) {
                                cameraExecutor.getHighResolutionOutputSizeshNQ4ISI = androidx.camera.core.CameraExecutor.getHighSpeedVideoFpsRanges();
                            }
                            scheduledThreadPoolExecutor = cameraExecutor.getHighResolutionOutputSizeshNQ4ISI;
                        }
                        scheduledThreadPoolExecutor.setCorePoolSize(java.lang.Math.max(1, cameraFactory.getAvailableCameraIds().size()));
                    }
                    cameraX.getHighSpeedVideoSizes.init(cameraX.getHighSpeedVideoFpsRanges);
                    androidx.camera.core.concurrent.CameraCoordinator cameraCoordinator = cameraX.getHighSpeedVideoFpsRanges.getCameraCoordinator();
                    cameraCoordinator.init(cameraX.getHighSpeedVideoSizes);
                    cameraX.getHighResolutionOutputSizeshNQ4ISI = new androidx.camera.core.CameraUseCaseAdapterProviderImpl(cameraX.getHighSpeedVideoSizes, cameraCoordinator, cameraX.getInputSizeshNQ4ISI, cameraX.getOutputSizeshNQ4ISI);
                    java.util.Iterator<androidx.camera.core.impl.CameraInternal> it = cameraX.getHighSpeedVideoSizes.getCameras().iterator();
                    while (it.hasNext()) {
                        it.next().getCamera2StreamConfigurationMap().setCameraUseCaseAdapterProvider(cameraX.getHighResolutionOutputSizeshNQ4ISI);
                    }
                    cameraX.getHighSpeedVideoFpsRangesFor.startup(create2, cameraX.getHighSpeedVideoFpsRanges, cameraX.getHighSpeedVideoSizes);
                    cameraX.getHighSpeedVideoFpsRangesFor.addDependentInternalListener(cameraX.getOutputMinFrameDurationlomOqCM);
                    cameraX.getHighSpeedVideoFpsRangesFor.addDependentInternalListener(cameraX.getHighSpeedVideoFpsRanges.getCameraCoordinator());
                    create2.validateOnFirstInit(cameraX.getHighSpeedVideoSizes);
                    if (i > 1) {
                        androidx.camera.core.CameraX.getHighSpeedVideoFpsRanges(null);
                    }
                    synchronized (cameraX.getInputFormats) {
                        cameraX.getOutputMinFrameDuration = androidx.camera.core.CameraX.InternalInitState.INITIALIZED;
                    }
                    completer.set(null);
                } catch (androidx.camera.core.InitializationException e) {
                    e = e;
                    androidx.camera.core.impl.CameraProviderExecutionState cameraProviderExecutionState = new androidx.camera.core.impl.CameraProviderExecutionState(j, i, e);
                    onRetryDecisionRequested = cameraX.getHighSpeedVideoSizesFor.onRetryDecisionRequested(cameraProviderExecutionState);
                    androidx.camera.core.CameraX.getHighSpeedVideoFpsRanges(cameraProviderExecutionState);
                    if (onRetryDecisionRequested.shouldRetry() || i >= Integer.MAX_VALUE) {
                        synchronized (cameraX.getInputFormats) {
                            cameraX.getOutputMinFrameDuration = androidx.camera.core.CameraX.InternalInitState.INITIALIZING_ERROR;
                        }
                        if (onRetryDecisionRequested.shouldCompleteWithoutFailure()) {
                            synchronized (cameraX.getInputFormats) {
                                cameraX.getOutputMinFrameDuration = androidx.camera.core.CameraX.InternalInitState.INITIALIZED;
                            }
                            completer.set(null);
                        }
                        if (e instanceof androidx.camera.core.impl.CameraValidator.CameraIdListIncorrectException) {
                            java.lang.StringBuilder sb = new java.lang.StringBuilder();
                            sb.append("Device reporting less cameras than anticipated. On real devices: Retrying initialization might resolve temporary camera errors. On emulators: Ensure virtual camera configuration matches supported camera features as reported by PackageManager#hasSystemFeature. Available cameras: ");
                            sb.append(((androidx.camera.core.impl.CameraValidator.CameraIdListIncorrectException) e).getAvailableCameraCount());
                            java.lang.String obj = sb.toString();
                            androidx.camera.core.Logger.e("CameraX", obj, e);
                            completer.setException(new androidx.camera.core.InitializationException(new androidx.camera.core.CameraUnavailableException(3, obj)));
                        } else if (e instanceof androidx.camera.core.InitializationException) {
                            completer.setException(e);
                        } else {
                            completer.setException(new androidx.camera.core.InitializationException(e));
                        }
                    } else {
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                        sb2.append("Retry init. Start time ");
                        sb2.append(j);
                        sb2.append(" current time ");
                        sb2.append(android.os.SystemClock.elapsedRealtime());
                        androidx.camera.core.Logger.w("CameraX", sb2.toString(), e);
                        androidx.core.os.HandlerCompat.postDelayed(cameraX.getOutputSizes, new java.lang.Runnable() { // from class: androidx.camera.core.CameraX$$ExternalSyntheticLambda1
                            @Override // java.lang.Runnable
                            public final void run() {
                                androidx.camera.core.CameraX cameraX2 = androidx.camera.core.CameraX.this;
                                java.util.concurrent.Executor executor2 = executor;
                                long j2 = j;
                                executor2.execute(new androidx.camera.core.CameraX$$ExternalSyntheticLambda2(cameraX2, context, executor2, i + 1, completer, j2));
                            }
                        }, "retry_token", onRetryDecisionRequested.getRetryDelayInMillis());
                    }
                    cameraX.getHighSpeedVideoFpsRangesFor.shutdown();
                } catch (androidx.camera.core.impl.CameraValidator.CameraIdListIncorrectException e2) {
                    e = e2;
                    androidx.camera.core.impl.CameraProviderExecutionState cameraProviderExecutionState2 = new androidx.camera.core.impl.CameraProviderExecutionState(j, i, e);
                    onRetryDecisionRequested = cameraX.getHighSpeedVideoSizesFor.onRetryDecisionRequested(cameraProviderExecutionState2);
                    androidx.camera.core.CameraX.getHighSpeedVideoFpsRanges(cameraProviderExecutionState2);
                    if (onRetryDecisionRequested.shouldRetry()) {
                    }
                    synchronized (cameraX.getInputFormats) {
                    }
                } catch (java.lang.RuntimeException e3) {
                    e = e3;
                    androidx.camera.core.impl.CameraProviderExecutionState cameraProviderExecutionState22 = new androidx.camera.core.impl.CameraProviderExecutionState(j, i, e);
                    onRetryDecisionRequested = cameraX.getHighSpeedVideoSizesFor.onRetryDecisionRequested(cameraProviderExecutionState22);
                    androidx.camera.core.CameraX.getHighSpeedVideoFpsRanges(cameraProviderExecutionState22);
                    if (onRetryDecisionRequested.shouldRetry()) {
                    }
                    synchronized (cameraX.getInputFormats) {
                    }
                }
            } finally {
                androidx.tracing.Trace.endSection();
            }
        } catch (androidx.camera.core.InitializationException | androidx.camera.core.impl.CameraValidator.CameraIdListIncorrectException | java.lang.RuntimeException e4) {
            e = e4;
        }
    }
}
