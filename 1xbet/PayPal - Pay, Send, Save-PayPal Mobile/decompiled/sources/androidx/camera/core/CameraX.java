package androidx.camera.core;

/* loaded from: classes6.dex */
public final class CameraX {
    final java.util.concurrent.Executor Camera2StreamConfigurationMap;
    androidx.camera.core.CameraUseCaseAdapterProvider getHighResolutionOutputSizeshNQ4ISI;
    androidx.camera.core.impl.CameraFactory getHighSpeedVideoFpsRanges;
    final androidx.camera.core.impl.CameraPresenceProvider getHighSpeedVideoFpsRangesFor;
    final androidx.camera.core.impl.CameraRepository getHighSpeedVideoSizes;
    final androidx.camera.core.RetryPolicy getHighSpeedVideoSizesFor;
    final java.lang.Object getInputFormats;
    androidx.camera.core.impl.UseCaseConfigFactory getInputSizeshNQ4ISI;
    final androidx.camera.core.CameraXConfig getOutputFormats;
    androidx.camera.core.CameraX.InternalInitState getOutputMinFrameDuration;
    androidx.camera.core.impl.CameraDeviceSurfaceManager getOutputMinFrameDurationlomOqCM;
    final android.os.Handler getOutputSizes;
    androidx.camera.core.internal.StreamSpecsCalculator getOutputSizeshNQ4ISI;
    final android.os.HandlerThread getOutputStallDuration;
    final kotlin.Lazy<androidx.camera.core.RotationProvider> getOutputStallDurationlomOqCM;
    private final com.google.common.util.concurrent.ListenableFuture<java.lang.Void> getValidOutputFormatsForInputhNQ4ISI;
    private com.google.common.util.concurrent.ListenableFuture<java.lang.Void> isOutputSupportedForhNQ4ISI;
    private final java.lang.Integer unwrapAs;
    private static final java.lang.Object toString = new java.lang.Object();
    private static final android.util.SparseArray<java.lang.Integer> isOutputSupportedFor = new android.util.SparseArray<>();

    enum InternalInitState {
        UNINITIALIZED,
        INITIALIZING,
        INITIALIZING_ERROR,
        INITIALIZED,
        SHUTDOWN
    }

    public CameraX(android.content.Context context, androidx.camera.core.CameraXConfig.Provider provider) {
        this(context, provider, new androidx.camera.core.impl.QuirkSettingsLoader());
    }

    private CameraX(android.content.Context context, androidx.camera.core.CameraXConfig.Provider provider, androidx.arch.core.util.Function<android.content.Context, androidx.camera.core.impl.QuirkSettings> function) {
        this.getHighSpeedVideoSizes = new androidx.camera.core.impl.CameraRepository();
        this.getInputFormats = new java.lang.Object();
        this.getOutputMinFrameDuration = androidx.camera.core.CameraX.InternalInitState.UNINITIALIZED;
        this.isOutputSupportedForhNQ4ISI = androidx.camera.core.impl.utils.futures.Futures.immediateFuture(null);
        final android.content.Context persistentApplicationContext = androidx.camera.core.impl.utils.ContextUtil.getPersistentApplicationContext(context);
        if (provider != null) {
            this.getOutputFormats = provider.getCameraXConfig();
        } else {
            androidx.camera.core.CameraXConfig.Provider highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(context);
            if (highResolutionOutputSizeshNQ4ISI == null) {
                throw new java.lang.IllegalStateException("CameraX is not configured properly. The most likely cause is you did not include a default implementation in your build such as 'camera-camera2'.");
            }
            this.getOutputFormats = highResolutionOutputSizeshNQ4ISI.getCameraXConfig();
        }
        androidx.camera.core.impl.QuirkSettings quirkSettings = this.getOutputFormats.getQuirkSettings();
        if (quirkSettings != null) {
            androidx.camera.core.Logger.d("CameraX", "QuirkSettings from CameraXConfig: ".concat(java.lang.String.valueOf(quirkSettings)));
        } else {
            quirkSettings = function.apply(persistentApplicationContext);
            androidx.camera.core.Logger.d("CameraX", "QuirkSettings from app metadata: ".concat(java.lang.String.valueOf(quirkSettings)));
        }
        if (quirkSettings == null) {
            quirkSettings = androidx.camera.core.impl.QuirkSettingsHolder.DEFAULT;
            androidx.camera.core.Logger.d("CameraX", "QuirkSettings by default: ".concat(java.lang.String.valueOf(quirkSettings)));
        }
        androidx.camera.core.impl.QuirkSettingsHolder.instance().set(quirkSettings);
        java.util.concurrent.Executor cameraExecutor = this.getOutputFormats.getCameraExecutor(null);
        android.os.Handler schedulerHandler = this.getOutputFormats.getSchedulerHandler(null);
        cameraExecutor = cameraExecutor == null ? new androidx.camera.core.CameraExecutor() : cameraExecutor;
        this.Camera2StreamConfigurationMap = cameraExecutor;
        if (schedulerHandler == null) {
            android.os.HandlerThread handlerThread = new android.os.HandlerThread("CameraX-scheduler", 10);
            this.getOutputStallDuration = handlerThread;
            handlerThread.start();
            this.getOutputSizes = androidx.core.os.HandlerCompat.createAsync(handlerThread.getLooper());
        } else {
            this.getOutputStallDuration = null;
            this.getOutputSizes = schedulerHandler;
        }
        java.lang.Integer num = (java.lang.Integer) this.getOutputFormats.retrieveOption(androidx.camera.core.CameraXConfig.getOutputFormats, null);
        this.unwrapAs = num;
        synchronized (toString) {
            if (num != null) {
                androidx.core.util.Preconditions.checkArgumentInRange(num.intValue(), 3, 6, "minLogLevel");
                android.util.SparseArray<java.lang.Integer> sparseArray = isOutputSupportedFor;
                sparseArray.put(num.intValue(), java.lang.Integer.valueOf(sparseArray.get(num.intValue()) != null ? 1 + sparseArray.get(num.intValue()).intValue() : 1));
                Camera2StreamConfigurationMap();
            }
        }
        this.getHighSpeedVideoSizesFor = new androidx.camera.core.RetryPolicy.Builder(this.getOutputFormats.getCameraProviderInitRetryPolicy()).build();
        this.getHighSpeedVideoFpsRangesFor = new androidx.camera.core.impl.CameraPresenceProvider(cameraExecutor, androidx.camera.core.impl.utils.executor.CameraXExecutors.newHandlerExecutor(this.getOutputSizes));
        this.getOutputStallDurationlomOqCM = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: androidx.camera.core.CameraX$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return androidx.camera.core.CameraX.getHighSpeedVideoSizes(persistentApplicationContext);
            }
        });
        this.getValidOutputFormatsForInputhNQ4ISI = Camera2StreamConfigurationMap(persistentApplicationContext);
    }

    static /* synthetic */ androidx.camera.core.RotationProvider getHighSpeedVideoSizes(android.content.Context context) {
        return new androidx.camera.core.RotationProvider(context);
    }

    public final androidx.camera.core.impl.CameraFactory getCameraFactory() {
        androidx.camera.core.impl.CameraFactory cameraFactory = this.getHighSpeedVideoFpsRanges;
        if (cameraFactory != null) {
            return cameraFactory;
        }
        throw new java.lang.IllegalStateException("CameraX not initialized yet.");
    }

    private static androidx.camera.core.CameraXConfig.Provider getHighResolutionOutputSizeshNQ4ISI(android.content.Context context) {
        android.content.ComponentCallbacks2 application = androidx.camera.core.impl.utils.ContextUtil.getApplication(context);
        if (application instanceof androidx.camera.core.CameraXConfig.Provider) {
            return (androidx.camera.core.CameraXConfig.Provider) application;
        }
        try {
            android.content.Context persistentApplicationContext = androidx.camera.core.impl.utils.ContextUtil.getPersistentApplicationContext(context);
            android.content.pm.ServiceInfo serviceInfo = persistentApplicationContext.getPackageManager().getServiceInfo(new android.content.ComponentName(persistentApplicationContext, (java.lang.Class<?>) androidx.camera.core.impl.MetadataHolderService.class), 640);
            java.lang.String string = serviceInfo.metaData != null ? serviceInfo.metaData.getString("androidx.camera.core.impl.MetadataHolderService.DEFAULT_CONFIG_PROVIDER") : null;
            if (string == null) {
                androidx.camera.core.Logger.e("CameraX", "No default CameraXConfig.Provider specified in meta-data. The most likely cause is you did not include a default implementation in your build such as 'camera-camera2'.");
                return null;
            }
            return (androidx.camera.core.CameraXConfig.Provider) java.lang.Class.forName(string).getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
        } catch (android.content.pm.PackageManager.NameNotFoundException | java.lang.ClassNotFoundException | java.lang.IllegalAccessException | java.lang.InstantiationException | java.lang.NoSuchMethodException | java.lang.NullPointerException | java.lang.reflect.InvocationTargetException e) {
            androidx.camera.core.Logger.e("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        }
    }

    public final androidx.camera.core.impl.CameraDeviceSurfaceManager getCameraDeviceSurfaceManager() {
        androidx.camera.core.impl.CameraDeviceSurfaceManager cameraDeviceSurfaceManager = this.getOutputMinFrameDurationlomOqCM;
        if (cameraDeviceSurfaceManager != null) {
            return cameraDeviceSurfaceManager;
        }
        throw new java.lang.IllegalStateException("CameraX not initialized yet.");
    }

    public final androidx.camera.core.CameraUseCaseAdapterProvider getCameraUseCaseAdapterProvider() {
        androidx.camera.core.CameraUseCaseAdapterProvider cameraUseCaseAdapterProvider = this.getHighResolutionOutputSizeshNQ4ISI;
        if (cameraUseCaseAdapterProvider != null) {
            return cameraUseCaseAdapterProvider;
        }
        throw new java.lang.IllegalStateException("CameraX not initialized yet.");
    }

    public final androidx.camera.core.impl.CameraRepository getCameraRepository() {
        return this.getHighSpeedVideoSizes;
    }

    public final androidx.camera.core.impl.UseCaseConfigFactory getDefaultConfigFactory() {
        androidx.camera.core.impl.UseCaseConfigFactory useCaseConfigFactory = this.getInputSizeshNQ4ISI;
        if (useCaseConfigFactory != null) {
            return useCaseConfigFactory;
        }
        throw new java.lang.IllegalStateException("CameraX not initialized yet.");
    }

    public final androidx.camera.core.internal.StreamSpecsCalculator getStreamSpecsCalculator() {
        androidx.camera.core.internal.StreamSpecsCalculator streamSpecsCalculator = this.getOutputSizeshNQ4ISI;
        if (streamSpecsCalculator != null) {
            return streamSpecsCalculator;
        }
        throw new java.lang.IllegalStateException("CameraX not initialized yet.");
    }

    public final com.google.common.util.concurrent.ListenableFuture<java.lang.Void> getInitializeFuture() {
        return this.getValidOutputFormatsForInputhNQ4ISI;
    }

    public final com.google.common.util.concurrent.ListenableFuture<java.lang.Void> shutdown() {
        return getHighSpeedVideoSizes();
    }

    private com.google.common.util.concurrent.ListenableFuture<java.lang.Void> Camera2StreamConfigurationMap(final android.content.Context context) {
        com.google.common.util.concurrent.ListenableFuture<java.lang.Void> future;
        synchronized (this.getInputFormats) {
            androidx.core.util.Preconditions.checkState(this.getOutputMinFrameDuration == androidx.camera.core.CameraX.InternalInitState.UNINITIALIZED, "CameraX.initInternal() should only be called once per instance");
            this.getOutputMinFrameDuration = androidx.camera.core.CameraX.InternalInitState.INITIALIZING;
            future = androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(new androidx.concurrent.futures.CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.core.CameraX$$ExternalSyntheticLambda3
                @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                public final java.lang.Object attachCompleter(androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer) {
                    androidx.camera.core.CameraX cameraX = androidx.camera.core.CameraX.this;
                    android.content.Context context2 = context;
                    java.util.concurrent.Executor executor = cameraX.Camera2StreamConfigurationMap;
                    executor.execute(new androidx.camera.core.CameraX$$ExternalSyntheticLambda2(cameraX, context2, executor, 1, completer, android.os.SystemClock.elapsedRealtime()));
                    return "CameraX initInternal";
                }
            });
        }
        return future;
    }

    public final androidx.camera.core.impl.CameraPresenceProvider getCameraAvailabilityProvider() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final androidx.camera.core.RotationProvider getRotationProvider() {
        return this.getOutputStallDurationlomOqCM.getValue();
    }

    private com.google.common.util.concurrent.ListenableFuture<java.lang.Void> getHighSpeedVideoSizes() {
        synchronized (this.getInputFormats) {
            this.getOutputSizes.removeCallbacksAndMessages("retry_token");
            int ordinal = this.getOutputMinFrameDuration.ordinal();
            if (ordinal == 0) {
                this.getOutputMinFrameDuration = androidx.camera.core.CameraX.InternalInitState.SHUTDOWN;
                return androidx.camera.core.impl.utils.futures.Futures.immediateFuture(null);
            }
            if (ordinal == 1) {
                throw new java.lang.IllegalStateException("CameraX could not be shutdown when it is initializing.");
            }
            if (ordinal == 2 || ordinal == 3) {
                this.getOutputMinFrameDuration = androidx.camera.core.CameraX.InternalInitState.SHUTDOWN;
                java.lang.Integer num = this.unwrapAs;
                synchronized (toString) {
                    if (num != null) {
                        android.util.SparseArray<java.lang.Integer> sparseArray = isOutputSupportedFor;
                        int intValue = sparseArray.get(num.intValue()).intValue() - 1;
                        if (intValue == 0) {
                            sparseArray.remove(num.intValue());
                        } else {
                            sparseArray.put(num.intValue(), java.lang.Integer.valueOf(intValue));
                        }
                        Camera2StreamConfigurationMap();
                    }
                }
                this.isOutputSupportedForhNQ4ISI = androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(new androidx.concurrent.futures.CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.core.CameraX$$ExternalSyntheticLambda5
                    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                    public final java.lang.Object attachCompleter(final androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer) {
                        final androidx.camera.core.CameraX cameraX = androidx.camera.core.CameraX.this;
                        cameraX.getHighSpeedVideoFpsRangesFor.shutdown();
                        if (cameraX.getOutputStallDurationlomOqCM.isInitialized()) {
                            cameraX.getOutputStallDurationlomOqCM.getValue().shutdown();
                        }
                        cameraX.getHighSpeedVideoSizes.deinit().addListener(new java.lang.Runnable() { // from class: androidx.camera.core.CameraX$$ExternalSyntheticLambda0
                            @Override // java.lang.Runnable
                            public final void run() {
                                androidx.camera.core.CameraX cameraX2 = androidx.camera.core.CameraX.this;
                                androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer2 = completer;
                                cameraX2.getHighSpeedVideoFpsRanges.shutdown();
                                if (cameraX2.getOutputStallDuration != null) {
                                    java.util.concurrent.Executor executor = cameraX2.Camera2StreamConfigurationMap;
                                    if (executor instanceof androidx.camera.core.CameraExecutor) {
                                        androidx.camera.core.CameraExecutor cameraExecutor = (androidx.camera.core.CameraExecutor) executor;
                                        synchronized (cameraExecutor.Camera2StreamConfigurationMap) {
                                            if (!cameraExecutor.getHighResolutionOutputSizeshNQ4ISI.isShutdown()) {
                                                cameraExecutor.getHighResolutionOutputSizeshNQ4ISI.shutdown();
                                            }
                                        }
                                    }
                                    cameraX2.getOutputStallDuration.quit();
                                }
                                completer2.set(null);
                            }
                        }, cameraX.Camera2StreamConfigurationMap);
                        return "CameraX shutdownInternal";
                    }
                });
            }
            return this.isOutputSupportedForhNQ4ISI;
        }
    }

    private static void Camera2StreamConfigurationMap() {
        android.util.SparseArray<java.lang.Integer> sparseArray = isOutputSupportedFor;
        if (sparseArray.size() == 0) {
            androidx.camera.core.Logger.getHighResolutionOutputSizeshNQ4ISI();
            return;
        }
        if (sparseArray.get(3) != null) {
            androidx.camera.core.Logger.getHighSpeedVideoSizes(3);
            return;
        }
        if (sparseArray.get(4) != null) {
            androidx.camera.core.Logger.getHighSpeedVideoSizes(4);
        } else if (sparseArray.get(5) != null) {
            androidx.camera.core.Logger.getHighSpeedVideoSizes(5);
        } else if (sparseArray.get(6) != null) {
            androidx.camera.core.Logger.getHighSpeedVideoSizes(6);
        }
    }

    static void getHighSpeedVideoFpsRanges(androidx.camera.core.RetryPolicy.ExecutionState executionState) {
        if (androidx.tracing.Trace.isEnabled()) {
            androidx.tracing.Trace.setCounter("CX:CameraProvider-RetryStatus", executionState != null ? executionState.getStatus() : -1);
        }
    }
}
