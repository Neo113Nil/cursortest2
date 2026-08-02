package androidx.camera.camera2.config;

/* loaded from: classes6.dex */
public final class DaggerCameraAppComponent {
    private DaggerCameraAppComponent() {
    }

    public static androidx.camera.camera2.config.CameraAppComponent.Builder builder() {
        return new androidx.camera.camera2.config.DaggerCameraAppComponent.Builder((byte) 0);
    }

    static final class Builder implements androidx.camera.camera2.config.CameraAppComponent.Builder {
        private androidx.camera.camera2.config.CameraAppConfig getHighSpeedVideoSizes;

        private Builder() {
        }

        /* synthetic */ Builder(byte b) {
            this();
        }

        @Override // androidx.camera.camera2.config.CameraAppComponent.Builder
        public final androidx.camera.camera2.config.CameraAppComponent build() {
            dagger.internal.Preconditions.checkBuilderRequirement(this.getHighSpeedVideoSizes, androidx.camera.camera2.config.CameraAppConfig.class);
            return new androidx.camera.camera2.config.DaggerCameraAppComponent.CameraAppComponentImpl(this.getHighSpeedVideoSizes);
        }

        @Override // androidx.camera.camera2.config.CameraAppComponent.Builder
        public final /* synthetic */ androidx.camera.camera2.config.CameraAppComponent.Builder config(androidx.camera.camera2.config.CameraAppConfig cameraAppConfig) {
            this.getHighSpeedVideoSizes = (androidx.camera.camera2.config.CameraAppConfig) dagger.internal.Preconditions.checkNotNull(cameraAppConfig);
            return this;
        }
    }

    static final class CameraComponentBuilder implements androidx.camera.camera2.config.CameraComponent.Builder {
        private final androidx.camera.camera2.config.DaggerCameraAppComponent.CameraAppComponentImpl getHighSpeedVideoFpsRanges;
        private androidx.camera.camera2.config.CameraConfig getHighSpeedVideoFpsRangesFor;
        private androidx.camera.core.internal.StreamSpecsCalculator getHighSpeedVideoSizes;

        /* synthetic */ CameraComponentBuilder(androidx.camera.camera2.config.DaggerCameraAppComponent.CameraAppComponentImpl cameraAppComponentImpl, byte b) {
            this(cameraAppComponentImpl);
        }

        private CameraComponentBuilder(androidx.camera.camera2.config.DaggerCameraAppComponent.CameraAppComponentImpl cameraAppComponentImpl) {
            this.getHighSpeedVideoFpsRanges = cameraAppComponentImpl;
        }

        @Override // androidx.camera.camera2.config.CameraComponent.Builder
        public final androidx.camera.camera2.config.CameraComponent build() {
            dagger.internal.Preconditions.checkBuilderRequirement(this.getHighSpeedVideoFpsRangesFor, androidx.camera.camera2.config.CameraConfig.class);
            dagger.internal.Preconditions.checkBuilderRequirement(this.getHighSpeedVideoSizes, androidx.camera.core.internal.StreamSpecsCalculator.class);
            return new androidx.camera.camera2.config.DaggerCameraAppComponent.CameraComponentImpl(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes);
        }

        @Override // androidx.camera.camera2.config.CameraComponent.Builder
        public final /* synthetic */ androidx.camera.camera2.config.CameraComponent.Builder config(androidx.camera.camera2.config.CameraConfig cameraConfig) {
            this.getHighSpeedVideoFpsRangesFor = (androidx.camera.camera2.config.CameraConfig) dagger.internal.Preconditions.checkNotNull(cameraConfig);
            return this;
        }

        @Override // androidx.camera.camera2.config.CameraComponent.Builder
        public final /* synthetic */ androidx.camera.camera2.config.CameraComponent.Builder streamSpecsCalculator(androidx.camera.core.internal.StreamSpecsCalculator streamSpecsCalculator) {
            this.getHighSpeedVideoSizes = (androidx.camera.core.internal.StreamSpecsCalculator) dagger.internal.Preconditions.checkNotNull(streamSpecsCalculator);
            return this;
        }
    }

    static final class UseCaseCameraComponentBuilder implements androidx.camera.camera2.config.UseCaseCameraComponent.Builder {
        private final androidx.camera.camera2.config.DaggerCameraAppComponent.CameraComponentImpl Camera2StreamConfigurationMap;
        private androidx.camera.camera2.config.UseCaseCameraConfig getHighSpeedVideoFpsRanges;
        private final androidx.camera.camera2.config.DaggerCameraAppComponent.CameraAppComponentImpl getHighSpeedVideoSizes;

        /* synthetic */ UseCaseCameraComponentBuilder(androidx.camera.camera2.config.DaggerCameraAppComponent.CameraAppComponentImpl cameraAppComponentImpl, androidx.camera.camera2.config.DaggerCameraAppComponent.CameraComponentImpl cameraComponentImpl, byte b) {
            this(cameraAppComponentImpl, cameraComponentImpl);
        }

        private UseCaseCameraComponentBuilder(androidx.camera.camera2.config.DaggerCameraAppComponent.CameraAppComponentImpl cameraAppComponentImpl, androidx.camera.camera2.config.DaggerCameraAppComponent.CameraComponentImpl cameraComponentImpl) {
            this.getHighSpeedVideoSizes = cameraAppComponentImpl;
            this.Camera2StreamConfigurationMap = cameraComponentImpl;
        }

        @Override // androidx.camera.camera2.config.UseCaseCameraComponent.Builder
        public final androidx.camera.camera2.config.UseCaseCameraComponent build() {
            dagger.internal.Preconditions.checkBuilderRequirement(this.getHighSpeedVideoFpsRanges, androidx.camera.camera2.config.UseCaseCameraConfig.class);
            return new androidx.camera.camera2.config.DaggerCameraAppComponent.UseCaseCameraComponentImpl(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges);
        }

        @Override // androidx.camera.camera2.config.UseCaseCameraComponent.Builder
        public final /* synthetic */ androidx.camera.camera2.config.UseCaseCameraComponent.Builder config(androidx.camera.camera2.config.UseCaseCameraConfig useCaseCameraConfig) {
            this.getHighSpeedVideoFpsRanges = (androidx.camera.camera2.config.UseCaseCameraConfig) dagger.internal.Preconditions.checkNotNull(useCaseCameraConfig);
            return this;
        }
    }

    static final class UseCaseCameraComponentImpl implements androidx.camera.camera2.config.UseCaseCameraComponent {
        dagger.internal.Provider<androidx.camera.camera2.compat.workaround.CapturePipelineTorchCorrection> Camera2StreamConfigurationMap;
        dagger.internal.Provider<androidx.camera.camera2.impl.DeferredUseCaseCameraRequestControl> getHighResolutionOutputSizeshNQ4ISI;
        dagger.internal.Provider<androidx.camera.camera2.impl.CapturePipeline> getHighSpeedVideoFpsRanges;
        dagger.internal.Provider<androidx.camera.camera2.impl.CapturePipelineImpl> getHighSpeedVideoFpsRangesFor;
        dagger.internal.Provider<androidx.camera.camera2.adapter.CaptureConfigAdapter> getHighSpeedVideoSizes;
        dagger.internal.Provider<androidx.camera.camera2.adapter.SessionConfigAdapter> getHighSpeedVideoSizesFor;
        dagger.internal.Provider<androidx.camera.core.impl.SessionProcessor> getInputFormats;
        dagger.internal.Provider<androidx.camera.camera2.config.UseCaseGraphContext> getInputSizeshNQ4ISI;
        dagger.internal.Provider<androidx.camera.camera2.impl.UseCaseCameraImpl> getOutputFormats;
        dagger.internal.Provider<androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl> getOutputMinFrameDuration;
        dagger.internal.Provider<androidx.camera.camera2.impl.UseCaseSurfaceManager> getOutputMinFrameDurationlomOqCM;
        private final androidx.camera.camera2.config.DaggerCameraAppComponent.CameraAppComponentImpl getOutputSizes;
        private final androidx.camera.camera2.config.DaggerCameraAppComponent.UseCaseCameraComponentImpl getOutputSizeshNQ4ISI = this;
        dagger.internal.Provider<androidx.camera.camera2.impl.UseCaseCameraState> getOutputStallDuration;
        private final androidx.camera.camera2.config.DaggerCameraAppComponent.CameraComponentImpl getOutputStallDurationlomOqCM;
        private final androidx.camera.camera2.config.UseCaseCameraConfig getValidOutputFormatsForInputhNQ4ISI;

        UseCaseCameraComponentImpl(androidx.camera.camera2.config.DaggerCameraAppComponent.CameraAppComponentImpl cameraAppComponentImpl, androidx.camera.camera2.config.DaggerCameraAppComponent.CameraComponentImpl cameraComponentImpl, androidx.camera.camera2.config.UseCaseCameraConfig useCaseCameraConfig) {
            this.getOutputSizes = cameraAppComponentImpl;
            this.getOutputStallDurationlomOqCM = cameraComponentImpl;
            this.getValidOutputFormatsForInputhNQ4ISI = useCaseCameraConfig;
            this.getInputSizeshNQ4ISI = dagger.internal.DoubleCheck.provider((dagger.internal.Provider) new androidx.camera.camera2.config.DaggerCameraAppComponent.UseCaseCameraComponentImpl.SwitchingProvider(cameraAppComponentImpl, cameraComponentImpl, this, 1));
            this.getInputFormats = dagger.internal.DoubleCheck.provider((dagger.internal.Provider) new androidx.camera.camera2.config.DaggerCameraAppComponent.UseCaseCameraComponentImpl.SwitchingProvider(cameraAppComponentImpl, cameraComponentImpl, this, 2));
            this.getHighSpeedVideoSizes = dagger.internal.DoubleCheck.provider((dagger.internal.Provider) new androidx.camera.camera2.config.DaggerCameraAppComponent.UseCaseCameraComponentImpl.SwitchingProvider(cameraAppComponentImpl, cameraComponentImpl, this, 7));
            this.getOutputStallDuration = dagger.internal.DoubleCheck.provider((dagger.internal.Provider) new androidx.camera.camera2.config.DaggerCameraAppComponent.UseCaseCameraComponentImpl.SwitchingProvider(cameraAppComponentImpl, cameraComponentImpl, this, 8));
            this.getHighSpeedVideoFpsRangesFor = dagger.internal.DoubleCheck.provider((dagger.internal.Provider) new androidx.camera.camera2.config.DaggerCameraAppComponent.UseCaseCameraComponentImpl.SwitchingProvider(cameraAppComponentImpl, cameraComponentImpl, this, 6));
            this.Camera2StreamConfigurationMap = dagger.internal.DoubleCheck.provider((dagger.internal.Provider) new androidx.camera.camera2.config.DaggerCameraAppComponent.UseCaseCameraComponentImpl.SwitchingProvider(cameraAppComponentImpl, cameraComponentImpl, this, 9));
            this.getHighSpeedVideoFpsRanges = dagger.internal.DoubleCheck.provider((dagger.internal.Provider) new androidx.camera.camera2.config.DaggerCameraAppComponent.UseCaseCameraComponentImpl.SwitchingProvider(cameraAppComponentImpl, cameraComponentImpl, this, 5));
            this.getHighSpeedVideoSizesFor = dagger.internal.DoubleCheck.provider((dagger.internal.Provider) new androidx.camera.camera2.config.DaggerCameraAppComponent.UseCaseCameraComponentImpl.SwitchingProvider(cameraAppComponentImpl, cameraComponentImpl, this, 11));
            this.getOutputMinFrameDurationlomOqCM = dagger.internal.DoubleCheck.provider((dagger.internal.Provider) new androidx.camera.camera2.config.DaggerCameraAppComponent.UseCaseCameraComponentImpl.SwitchingProvider(cameraAppComponentImpl, cameraComponentImpl, this, 10));
            this.getOutputMinFrameDuration = dagger.internal.DoubleCheck.provider((dagger.internal.Provider) new androidx.camera.camera2.config.DaggerCameraAppComponent.UseCaseCameraComponentImpl.SwitchingProvider(cameraAppComponentImpl, cameraComponentImpl, this, 4));
            this.getHighResolutionOutputSizeshNQ4ISI = dagger.internal.DoubleCheck.provider((dagger.internal.Provider) new androidx.camera.camera2.config.DaggerCameraAppComponent.UseCaseCameraComponentImpl.SwitchingProvider(cameraAppComponentImpl, cameraComponentImpl, this, 3));
            this.getOutputFormats = dagger.internal.DoubleCheck.provider((dagger.internal.Provider) new androidx.camera.camera2.config.DaggerCameraAppComponent.UseCaseCameraComponentImpl.SwitchingProvider(cameraAppComponentImpl, cameraComponentImpl, this, 0));
        }

        @Override // androidx.camera.camera2.config.UseCaseCameraComponent
        public final androidx.camera.camera2.impl.UseCaseCamera getUseCaseCamera() {
            return this.getOutputFormats.get();
        }

        @Override // androidx.camera.camera2.config.UseCaseCameraComponent
        public final androidx.camera.camera2.config.UseCaseGraphContext getUseCaseGraphContext() {
            return this.getInputSizeshNQ4ISI.get();
        }

        static final class SwitchingProvider<T> implements dagger.internal.Provider<T> {
            private final int Camera2StreamConfigurationMap;
            private final androidx.camera.camera2.config.DaggerCameraAppComponent.CameraAppComponentImpl getHighResolutionOutputSizeshNQ4ISI;
            private final androidx.camera.camera2.config.DaggerCameraAppComponent.CameraComponentImpl getHighSpeedVideoFpsRanges;
            private final androidx.camera.camera2.config.DaggerCameraAppComponent.UseCaseCameraComponentImpl getHighSpeedVideoFpsRangesFor;

            SwitchingProvider(androidx.camera.camera2.config.DaggerCameraAppComponent.CameraAppComponentImpl cameraAppComponentImpl, androidx.camera.camera2.config.DaggerCameraAppComponent.CameraComponentImpl cameraComponentImpl, androidx.camera.camera2.config.DaggerCameraAppComponent.UseCaseCameraComponentImpl useCaseCameraComponentImpl, int i) {
                this.getHighResolutionOutputSizeshNQ4ISI = cameraAppComponentImpl;
                this.getHighSpeedVideoFpsRanges = cameraComponentImpl;
                this.getHighSpeedVideoFpsRangesFor = useCaseCameraComponentImpl;
                this.Camera2StreamConfigurationMap = i;
            }

            @Override // javax.inject.Provider, jakarta.inject.Provider
            public final T get() {
                switch (this.Camera2StreamConfigurationMap) {
                    case 0:
                        return (T) new androidx.camera.camera2.impl.UseCaseCameraImpl(this.getHighSpeedVideoFpsRangesFor.getInputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRanges.coroutineBoundary.get(), this.getHighSpeedVideoFpsRangesFor.getInputFormats.get(), this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRangesFor.getOutputMinFrameDurationlomOqCM, this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizesFor, this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges);
                    case 1:
                        return (T) androidx.camera.camera2.config.UseCaseCameraConfig_ProvideUseCaseGraphContextFactory.provideUseCaseGraphContext(this.getHighSpeedVideoFpsRangesFor.getValidOutputFormatsForInputhNQ4ISI, this.getHighSpeedVideoFpsRanges.getOutputSizes.get());
                    case 2:
                        return (T) this.getHighSpeedVideoFpsRangesFor.getValidOutputFormatsForInputhNQ4ISI.getGetHighSpeedVideoFpsRanges();
                    case 3:
                        return (T) new androidx.camera.camera2.impl.DeferredUseCaseCameraRequestControl(this.getHighSpeedVideoFpsRangesFor.getOutputMinFrameDuration, this.getHighSpeedVideoFpsRanges.coroutineBoundary.get());
                    case 4:
                        return (T) new androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl(this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor.getOutputStallDuration, this.getHighSpeedVideoFpsRangesFor.getInputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRangesFor.getOutputMinFrameDurationlomOqCM, this.getHighSpeedVideoFpsRanges.coroutineBoundary.get(), androidx.camera.camera2.config.CameraAppConfig_ProvideCameraXConfigFactory.provideCameraXConfig(this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges));
                    case 5:
                        return (T) androidx.camera.camera2.config.UseCaseCameraModule_Companion_ProvideCapturePipelineFactory.provideCapturePipeline(this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap);
                    case 6:
                        androidx.camera.camera2.adapter.CaptureConfigAdapter captureConfigAdapter = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes.get();
                        androidx.camera.camera2.impl.FlashControl flashControl = this.getHighSpeedVideoFpsRanges.getOutputStallDuration.get();
                        androidx.camera.camera2.impl.TorchControl torchControl = this.getHighSpeedVideoFpsRanges.getARTIFICIAL_FRAME_PACKAGE_NAME.get();
                        androidx.camera.camera2.impl.VideoUsageControl videoUsageControl = this.getHighSpeedVideoFpsRanges.AMEXKernel.get();
                        androidx.camera.camera2.impl.UseCaseThreads useCaseThreads = this.getHighSpeedVideoFpsRanges.coroutineBoundary.get();
                        androidx.camera.camera2.impl.ComboRequestListener comboRequestListener = this.getHighSpeedVideoFpsRanges.getOutputStallDurationlomOqCM.get();
                        androidx.camera.camera2.config.DaggerCameraAppComponent.CameraComponentImpl cameraComponentImpl = this.getHighSpeedVideoFpsRanges;
                        return (T) new androidx.camera.camera2.impl.CapturePipelineImpl(captureConfigAdapter, flashControl, torchControl, videoUsageControl, useCaseThreads, comboRequestListener, androidx.camera.camera2.compat.workaround.UseTorchAsFlash_Bindings_Companion_ProvideUseTorchAsFlashFactory.provideUseTorchAsFlash(cameraComponentImpl.getOutputMinFrameDuration.get(), cameraComponentImpl.getHighSpeedVideoFpsRanges.getCameraDevices(), cameraComponentImpl.isOutputSupportedFor.get()), this.getHighSpeedVideoFpsRanges.getInputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRangesFor.getOutputStallDuration, this.getHighSpeedVideoFpsRangesFor.getInputSizeshNQ4ISI.get());
                    case 7:
                        return (T) new androidx.camera.camera2.adapter.CaptureConfigAdapter(this.getHighSpeedVideoFpsRanges.getInputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRangesFor.getInputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRanges.b.get(), this.getHighSpeedVideoFpsRanges.coroutineBoundary.get(), androidx.camera.camera2.compat.workaround.TemplateParamsOverride_Bindings_Companion_ProvideTemplateParamsOverrideFactory.provideTemplateParamsOverride(this.getHighSpeedVideoFpsRanges.getOutputMinFrameDuration.get()));
                    case 8:
                        return (T) new androidx.camera.camera2.impl.UseCaseCameraState(this.getHighSpeedVideoFpsRangesFor.getInputSizeshNQ4ISI.get(), androidx.camera.camera2.compat.workaround.TemplateParamsOverride_Bindings_Companion_ProvideTemplateParamsOverrideFactory.provideTemplateParamsOverride(this.getHighSpeedVideoFpsRanges.getOutputMinFrameDuration.get()));
                    case 9:
                        return (T) new androidx.camera.camera2.compat.workaround.CapturePipelineTorchCorrection(this.getHighSpeedVideoFpsRanges.getInputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges.coroutineBoundary.get(), this.getHighSpeedVideoFpsRanges.getARTIFICIAL_FRAME_PACKAGE_NAME.get());
                    case 10:
                        return (T) new androidx.camera.camera2.impl.UseCaseSurfaceManager(this.getHighSpeedVideoFpsRanges.coroutineBoundary.get(), androidx.camera.camera2.config.CameraAppConfig_ProvideCameraPipeFactory.provideCameraPipe(this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges), androidx.camera.camera2.compat.workaround.InactiveSurfaceCloser_Bindings_Companion_ProvideInactiveSurfaceCloserFactory.provideInactiveSurfaceCloser(this.getHighSpeedVideoFpsRanges.getOutputMinFrameDuration.get()), this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizesFor.get());
                    case 11:
                        return (T) androidx.camera.camera2.config.UseCaseCameraConfig_ProvideSessionConfigAdapterFactory.provideSessionConfigAdapter(this.getHighSpeedVideoFpsRangesFor.getValidOutputFormatsForInputhNQ4ISI);
                    default:
                        throw new java.lang.AssertionError(this.Camera2StreamConfigurationMap);
                }
            }
        }
    }

    static final class CameraComponentImpl implements androidx.camera.camera2.config.CameraComponent {
        dagger.internal.Provider<androidx.camera.camera2.impl.VideoUsageControl> AMEXKernel;
        dagger.internal.Provider<androidx.camera.core.impl.EncoderProfilesProvider> ArtificialStackFrames;
        dagger.internal.Provider<androidx.camera.camera2.adapter.CameraControlStateAdapter> Camera2StreamConfigurationMap;
        dagger.internal.Provider<android.hardware.camera2.params.StreamConfigurationMap> CoroutineDebuggingKt;
        dagger.internal.Provider<androidx.camera.camera2.impl.State3AControl> _BOUNDARY;
        dagger.internal.Provider<androidx.camera.camera2.impl.StillCaptureRequestControl> _CREATION;

        /* renamed from: a, reason: collision with root package name */
        dagger.internal.Provider<androidx.camera.camera2.compat.StreamConfigurationMapCompat> f2671a;
        dagger.internal.Provider<androidx.camera.camera2.pipe.CameraMetadata> accessartificialFrame;
        dagger.internal.Provider<androidx.camera.camera2.adapter.ZslControl> b;
        private final androidx.camera.camera2.config.CameraConfig c;
        dagger.internal.Provider<androidx.camera.camera2.impl.UseCaseThreads> coroutineBoundary;
        dagger.internal.Provider<java.lang.String> coroutineCreation;
        dagger.internal.Provider<androidx.camera.camera2.impl.TorchControl> getARTIFICIAL_FRAME_PACKAGE_NAME;
        dagger.internal.Provider<androidx.camera.camera2.impl.CameraCallbackMap> getHighResolutionOutputSizeshNQ4ISI;
        final androidx.camera.camera2.config.DaggerCameraAppComponent.CameraAppComponentImpl getHighSpeedVideoFpsRanges;
        dagger.internal.Provider<androidx.camera.camera2.compat.Camera2CameraControlCompatImpl> getHighSpeedVideoFpsRangesFor;
        dagger.internal.Provider<androidx.camera.camera2.adapter.CameraControlAdapter> getHighSpeedVideoSizes;
        dagger.internal.Provider<androidx.camera.camera2.impl.CameraGraphConfigProvider> getHighSpeedVideoSizesFor;
        dagger.internal.Provider<androidx.camera.camera2.adapter.CameraInfoAdapter> getInputFormats;
        dagger.internal.Provider<androidx.camera.camera2.impl.CameraPipeCameraProperties> getInputSizeshNQ4ISI;
        dagger.internal.Provider<androidx.camera.camera2.compat.quirk.CameraQuirks> getOutputMinFrameDuration;
        dagger.internal.Provider<androidx.camera.camera2.compat.EvCompImpl> getOutputMinFrameDurationlomOqCM;
        dagger.internal.Provider<androidx.camera.camera2.adapter.CameraStateAdapter> getOutputSizes;
        dagger.internal.Provider<androidx.camera.camera2.impl.EvCompControl> getOutputSizeshNQ4ISI;
        dagger.internal.Provider<androidx.camera.camera2.impl.FlashControl> getOutputStallDuration;
        dagger.internal.Provider<androidx.camera.camera2.impl.ComboRequestListener> getOutputStallDurationlomOqCM;
        dagger.internal.Provider<androidx.camera.camera2.impl.FocusMeteringControl> getValidOutputFormatsForInputhNQ4ISI;
        dagger.internal.Provider<androidx.camera.camera2.impl.UseCaseManager> init;
        dagger.internal.Provider<androidx.camera.camera2.internal.IntrinsicZoomCalculatorImpl> isOutputSupportedFor;
        dagger.internal.Provider<androidx.camera.camera2.impl.LowLightBoostControl> isOutputSupportedForhNQ4ISI;
        dagger.internal.Provider<androidx.camera.camera2.impl.ZoomControl> kernelVersion;
        private final androidx.camera.core.internal.StreamSpecsCalculator release;
        dagger.internal.Provider<androidx.camera.camera2.compat.workaround.OutputSizesCorrector> toString;
        dagger.internal.Provider<androidx.camera.camera2.interop.Camera2CameraControl> unwrapAs;
        private final androidx.camera.camera2.config.DaggerCameraAppComponent.CameraComponentImpl d = this;
        dagger.internal.Provider<androidx.camera.camera2.adapter.CameraInternalAdapter> getOutputFormats = new dagger.internal.DelegateFactory();

        CameraComponentImpl(androidx.camera.camera2.config.DaggerCameraAppComponent.CameraAppComponentImpl cameraAppComponentImpl, androidx.camera.camera2.config.CameraConfig cameraConfig, androidx.camera.core.internal.StreamSpecsCalculator streamSpecsCalculator) {
            this.getHighSpeedVideoFpsRanges = cameraAppComponentImpl;
            this.c = cameraConfig;
            this.release = streamSpecsCalculator;
            this.accessartificialFrame = dagger.internal.DoubleCheck.provider((dagger.internal.Provider) new androidx.camera.camera2.config.DaggerCameraAppComponent.CameraComponentImpl.SwitchingProvider(cameraAppComponentImpl, this, 4));
            this.getInputSizeshNQ4ISI = dagger.internal.DoubleCheck.provider((dagger.internal.Provider) new androidx.camera.camera2.config.DaggerCameraAppComponent.CameraComponentImpl.SwitchingProvider(cameraAppComponentImpl, this, 3));
            this.b = dagger.internal.DoubleCheck.provider((dagger.internal.Provider) new androidx.camera.camera2.config.DaggerCameraAppComponent.CameraComponentImpl.SwitchingProvider(cameraAppComponentImpl, this, 2));
            this.CoroutineDebuggingKt = dagger.internal.DoubleCheck.provider((dagger.internal.Provider) new androidx.camera.camera2.config.DaggerCameraAppComponent.CameraComponentImpl.SwitchingProvider(cameraAppComponentImpl, this, 9));
            this.toString = dagger.internal.DoubleCheck.provider((dagger.internal.Provider) new androidx.camera.camera2.config.DaggerCameraAppComponent.CameraComponentImpl.SwitchingProvider(cameraAppComponentImpl, this, 10));
            this.f2671a = dagger.internal.DoubleCheck.provider((dagger.internal.Provider) new androidx.camera.camera2.config.DaggerCameraAppComponent.CameraComponentImpl.SwitchingProvider(cameraAppComponentImpl, this, 8));
            this.getOutputMinFrameDuration = dagger.internal.DoubleCheck.provider((dagger.internal.Provider) new androidx.camera.camera2.config.DaggerCameraAppComponent.CameraComponentImpl.SwitchingProvider(cameraAppComponentImpl, this, 7));
            this.coroutineBoundary = dagger.internal.DoubleCheck.provider((dagger.internal.Provider) new androidx.camera.camera2.config.DaggerCameraAppComponent.CameraComponentImpl.SwitchingProvider(cameraAppComponentImpl, this, 11));
            this._BOUNDARY = dagger.internal.DoubleCheck.provider((dagger.internal.Provider) new androidx.camera.camera2.config.DaggerCameraAppComponent.CameraComponentImpl.SwitchingProvider(cameraAppComponentImpl, this, 6));
            this.getOutputStallDurationlomOqCM = dagger.internal.DoubleCheck.provider((dagger.internal.Provider) new androidx.camera.camera2.config.DaggerCameraAppComponent.CameraComponentImpl.SwitchingProvider(cameraAppComponentImpl, this, 12));
            this.isOutputSupportedForhNQ4ISI = dagger.internal.DoubleCheck.provider((dagger.internal.Provider) new androidx.camera.camera2.config.DaggerCameraAppComponent.CameraComponentImpl.SwitchingProvider(cameraAppComponentImpl, this, 5));
            this.getOutputMinFrameDurationlomOqCM = dagger.internal.DoubleCheck.provider((dagger.internal.Provider) new androidx.camera.camera2.config.DaggerCameraAppComponent.CameraComponentImpl.SwitchingProvider(cameraAppComponentImpl, this, 14));
            this.getOutputSizeshNQ4ISI = dagger.internal.DoubleCheck.provider((dagger.internal.Provider) new androidx.camera.camera2.config.DaggerCameraAppComponent.CameraComponentImpl.SwitchingProvider(cameraAppComponentImpl, this, 13));
            this.getARTIFICIAL_FRAME_PACKAGE_NAME = dagger.internal.DoubleCheck.provider((dagger.internal.Provider) new androidx.camera.camera2.config.DaggerCameraAppComponent.CameraComponentImpl.SwitchingProvider(cameraAppComponentImpl, this, 16));
            this.getOutputStallDuration = dagger.internal.DoubleCheck.provider((dagger.internal.Provider) new androidx.camera.camera2.config.DaggerCameraAppComponent.CameraComponentImpl.SwitchingProvider(cameraAppComponentImpl, this, 15));
            this.getValidOutputFormatsForInputhNQ4ISI = dagger.internal.DoubleCheck.provider((dagger.internal.Provider) new androidx.camera.camera2.config.DaggerCameraAppComponent.CameraComponentImpl.SwitchingProvider(cameraAppComponentImpl, this, 17));
            this._CREATION = dagger.internal.DoubleCheck.provider((dagger.internal.Provider) new androidx.camera.camera2.config.DaggerCameraAppComponent.CameraComponentImpl.SwitchingProvider(cameraAppComponentImpl, this, 18));
            this.AMEXKernel = dagger.internal.DoubleCheck.provider((dagger.internal.Provider) new androidx.camera.camera2.config.DaggerCameraAppComponent.CameraComponentImpl.SwitchingProvider(cameraAppComponentImpl, this, 19));
            this.kernelVersion = dagger.internal.DoubleCheck.provider((dagger.internal.Provider) new androidx.camera.camera2.config.DaggerCameraAppComponent.CameraComponentImpl.SwitchingProvider(cameraAppComponentImpl, this, 20));
            this.getHighSpeedVideoFpsRangesFor = dagger.internal.DoubleCheck.provider((dagger.internal.Provider) new androidx.camera.camera2.config.DaggerCameraAppComponent.CameraComponentImpl.SwitchingProvider(cameraAppComponentImpl, this, 22));
            this.unwrapAs = dagger.internal.DoubleCheck.provider((dagger.internal.Provider) new androidx.camera.camera2.config.DaggerCameraAppComponent.CameraComponentImpl.SwitchingProvider(cameraAppComponentImpl, this, 21));
            this.getOutputSizes = dagger.internal.DoubleCheck.provider((dagger.internal.Provider) new androidx.camera.camera2.config.DaggerCameraAppComponent.CameraComponentImpl.SwitchingProvider(cameraAppComponentImpl, this, 23));
            this.Camera2StreamConfigurationMap = dagger.internal.DoubleCheck.provider((dagger.internal.Provider) new androidx.camera.camera2.config.DaggerCameraAppComponent.CameraComponentImpl.SwitchingProvider(cameraAppComponentImpl, this, 25));
            this.getHighResolutionOutputSizeshNQ4ISI = dagger.internal.DoubleCheck.provider((dagger.internal.Provider) new androidx.camera.camera2.config.DaggerCameraAppComponent.CameraComponentImpl.SwitchingProvider(cameraAppComponentImpl, this, 26));
            this.coroutineCreation = dagger.internal.DoubleCheck.provider((dagger.internal.Provider) new androidx.camera.camera2.config.DaggerCameraAppComponent.CameraComponentImpl.SwitchingProvider(cameraAppComponentImpl, this, 28));
            this.ArtificialStackFrames = dagger.internal.DoubleCheck.provider((dagger.internal.Provider) new androidx.camera.camera2.config.DaggerCameraAppComponent.CameraComponentImpl.SwitchingProvider(cameraAppComponentImpl, this, 27));
            this.isOutputSupportedFor = dagger.internal.DoubleCheck.provider((dagger.internal.Provider) new androidx.camera.camera2.config.DaggerCameraAppComponent.CameraComponentImpl.SwitchingProvider(cameraAppComponentImpl, this, 29));
            this.getInputFormats = dagger.internal.DoubleCheck.provider((dagger.internal.Provider) new androidx.camera.camera2.config.DaggerCameraAppComponent.CameraComponentImpl.SwitchingProvider(cameraAppComponentImpl, this, 24));
            this.getHighSpeedVideoSizesFor = dagger.internal.DoubleCheck.provider((dagger.internal.Provider) new androidx.camera.camera2.config.DaggerCameraAppComponent.CameraComponentImpl.SwitchingProvider(cameraAppComponentImpl, this, 30));
            this.init = dagger.internal.DoubleCheck.provider((dagger.internal.Provider) new androidx.camera.camera2.config.DaggerCameraAppComponent.CameraComponentImpl.SwitchingProvider(cameraAppComponentImpl, this, 1));
            this.getHighSpeedVideoSizes = dagger.internal.DoubleCheck.provider((dagger.internal.Provider) new androidx.camera.camera2.config.DaggerCameraAppComponent.CameraComponentImpl.SwitchingProvider(cameraAppComponentImpl, this, 31));
            dagger.internal.DelegateFactory.setDelegate((dagger.internal.Provider) this.getOutputFormats, dagger.internal.DoubleCheck.provider((dagger.internal.Provider) new androidx.camera.camera2.config.DaggerCameraAppComponent.CameraComponentImpl.SwitchingProvider(cameraAppComponentImpl, this, 0)));
        }

        @Override // androidx.camera.camera2.config.CameraComponent
        public final androidx.camera.core.impl.CameraInternal getCameraInternal() {
            return this.getOutputFormats.get();
        }

        static final class SwitchingProvider<T> implements dagger.internal.Provider<T> {
            private final androidx.camera.camera2.config.DaggerCameraAppComponent.CameraAppComponentImpl Camera2StreamConfigurationMap;
            private final int getHighSpeedVideoFpsRanges;
            private final androidx.camera.camera2.config.DaggerCameraAppComponent.CameraComponentImpl getHighSpeedVideoFpsRangesFor;

            SwitchingProvider(androidx.camera.camera2.config.DaggerCameraAppComponent.CameraAppComponentImpl cameraAppComponentImpl, androidx.camera.camera2.config.DaggerCameraAppComponent.CameraComponentImpl cameraComponentImpl, int i) {
                this.Camera2StreamConfigurationMap = cameraAppComponentImpl;
                this.getHighSpeedVideoFpsRangesFor = cameraComponentImpl;
                this.getHighSpeedVideoFpsRanges = i;
            }

            @Override // javax.inject.Provider, jakarta.inject.Provider
            public final T get() {
                switch (this.getHighSpeedVideoFpsRanges) {
                    case 0:
                        return (T) new androidx.camera.camera2.adapter.CameraInternalAdapter(androidx.camera.camera2.config.CameraConfig_ProvideCameraConfigFactory.provideCameraConfig(this.getHighSpeedVideoFpsRangesFor.c), this.getHighSpeedVideoFpsRangesFor.init.get(), this.getHighSpeedVideoFpsRangesFor.getInputFormats.get(), this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRangesFor.coroutineBoundary.get(), this.getHighSpeedVideoFpsRangesFor.getOutputSizes.get());
                    case 1:
                        androidx.camera.camera2.pipe.CameraPipe provideCameraPipe = androidx.camera.camera2.config.CameraAppConfig_ProvideCameraPipeFactory.provideCameraPipe(this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges);
                        androidx.camera.core.concurrent.CameraCoordinator provideCameraCoordinator = androidx.camera.camera2.config.CameraAppConfig_ProvideCameraCoordinatorFactory.provideCameraCoordinator(this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges);
                        androidx.camera.camera2.config.DaggerCameraAppComponent.UseCaseCameraComponentBuilder useCaseCameraComponentBuilder = new androidx.camera.camera2.config.DaggerCameraAppComponent.UseCaseCameraComponentBuilder(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, (byte) 0);
                        androidx.camera.camera2.adapter.ZslControl zslControl = this.getHighSpeedVideoFpsRangesFor.b.get();
                        androidx.camera.camera2.impl.LowLightBoostControl lowLightBoostControl = this.getHighSpeedVideoFpsRangesFor.isOutputSupportedForhNQ4ISI.get();
                        androidx.camera.camera2.config.DaggerCameraAppComponent.CameraComponentImpl cameraComponentImpl = this.getHighSpeedVideoFpsRangesFor;
                        dagger.internal.SetBuilder newSetBuilder = dagger.internal.SetBuilder.newSetBuilder(9);
                        newSetBuilder.add(cameraComponentImpl.getOutputSizeshNQ4ISI.get());
                        newSetBuilder.add(cameraComponentImpl.getOutputStallDuration.get());
                        newSetBuilder.add(cameraComponentImpl.getValidOutputFormatsForInputhNQ4ISI.get());
                        newSetBuilder.add(cameraComponentImpl._BOUNDARY.get());
                        newSetBuilder.add(cameraComponentImpl._CREATION.get());
                        newSetBuilder.add(cameraComponentImpl.getARTIFICIAL_FRAME_PACKAGE_NAME.get());
                        newSetBuilder.add(cameraComponentImpl.isOutputSupportedForhNQ4ISI.get());
                        newSetBuilder.add(cameraComponentImpl.AMEXKernel.get());
                        newSetBuilder.add(cameraComponentImpl.kernelVersion.get());
                        java.util.Set<T> build = newSetBuilder.build();
                        androidx.camera.camera2.interop.Camera2CameraControl camera2CameraControl = this.getHighSpeedVideoFpsRangesFor.unwrapAs.get();
                        androidx.camera.camera2.adapter.CameraStateAdapter cameraStateAdapter = this.getHighSpeedVideoFpsRangesFor.getOutputSizes.get();
                        dagger.internal.Provider<androidx.camera.camera2.adapter.CameraInternalAdapter> provider = this.getHighSpeedVideoFpsRangesFor.getOutputFormats;
                        dagger.internal.Provider<androidx.camera.camera2.impl.UseCaseThreads> provider2 = this.getHighSpeedVideoFpsRangesFor.coroutineBoundary;
                        dagger.internal.Provider<androidx.camera.camera2.adapter.CameraInfoAdapter> provider3 = this.getHighSpeedVideoFpsRangesFor.getInputFormats;
                        androidx.camera.core.impl.EncoderProfilesProvider encoderProfilesProvider = this.getHighSpeedVideoFpsRangesFor.ArtificialStackFrames.get();
                        androidx.camera.camera2.impl.CameraPipeCameraProperties cameraPipeCameraProperties = this.getHighSpeedVideoFpsRangesFor.getInputSizeshNQ4ISI.get();
                        androidx.camera.core.CameraXConfig provideCameraXConfig = androidx.camera.camera2.config.CameraAppConfig_ProvideCameraXConfigFactory.provideCameraXConfig(this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges);
                        androidx.camera.camera2.impl.CameraGraphConfigProvider cameraGraphConfigProvider = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizesFor.get();
                        android.content.Context provideContext = androidx.camera.camera2.config.CameraAppConfig_ProvideContextFactory.provideContext(this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges);
                        androidx.camera.camera2.config.CameraAppConfig cameraAppConfig = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges;
                        return (T) new androidx.camera.camera2.impl.UseCaseManager(provideCameraPipe, provideCameraCoordinator, useCaseCameraComponentBuilder, zslControl, lowLightBoostControl, build, camera2CameraControl, cameraStateAdapter, provider, provider2, provider3, encoderProfilesProvider, cameraPipeCameraProperties, provideCameraXConfig, cameraGraphConfigProvider, provideContext, androidx.camera.camera2.config.CameraAppConfig_ProvideDisplayInfoManagerFactory.provideDisplayInfoManager(cameraAppConfig, androidx.camera.camera2.config.CameraAppConfig_ProvideContextFactory.provideContext(cameraAppConfig)));
                    case 2:
                        return (T) androidx.camera.camera2.config.CameraModule_Companion_ProvideZslControlFactory.provideZslControl(this.getHighSpeedVideoFpsRangesFor.getInputSizeshNQ4ISI.get());
                    case 3:
                        return (T) new androidx.camera.camera2.impl.CameraPipeCameraProperties(androidx.camera.camera2.config.CameraConfig_ProvideCameraConfigFactory.provideCameraConfig(this.getHighSpeedVideoFpsRangesFor.c), this.getHighSpeedVideoFpsRangesFor.accessartificialFrame.get());
                    case 4:
                        return (T) androidx.camera.camera2.config.CameraModule.INSTANCE.provideCameraMetadata(androidx.camera.camera2.config.CameraAppConfig_ProvideCameraPipeFactory.provideCameraPipe(this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges), androidx.camera.camera2.config.CameraConfig_ProvideCameraConfigFactory.provideCameraConfig(this.getHighSpeedVideoFpsRangesFor.c));
                    case 5:
                        return (T) new androidx.camera.camera2.impl.LowLightBoostControl(this.getHighSpeedVideoFpsRangesFor.accessartificialFrame.get(), this.getHighSpeedVideoFpsRangesFor._BOUNDARY.get(), this.getHighSpeedVideoFpsRangesFor.coroutineBoundary.get(), this.getHighSpeedVideoFpsRangesFor.getOutputStallDurationlomOqCM.get());
                    case 6:
                        return (T) new androidx.camera.camera2.impl.State3AControl(this.getHighSpeedVideoFpsRangesFor.getInputSizeshNQ4ISI.get(), androidx.camera.camera2.compat.workaround.AutoFlashAEModeDisabler_Bindings_Companion_ProvideAEModeDisablerFactory.provideAEModeDisabler(this.getHighSpeedVideoFpsRangesFor.getOutputMinFrameDuration.get()), this.getHighSpeedVideoFpsRangesFor.coroutineBoundary.get());
                    case 7:
                        return (T) new androidx.camera.camera2.compat.quirk.CameraQuirks(this.getHighSpeedVideoFpsRangesFor.accessartificialFrame.get(), this.getHighSpeedVideoFpsRangesFor.f2671a.get());
                    case 8:
                        return (T) new androidx.camera.camera2.compat.StreamConfigurationMapCompat(this.getHighSpeedVideoFpsRangesFor.CoroutineDebuggingKt.get(), this.getHighSpeedVideoFpsRangesFor.toString.get());
                    case 9:
                        return (T) androidx.camera.camera2.config.CameraModule.INSTANCE.provideStreamConfigurationMap(this.getHighSpeedVideoFpsRangesFor.accessartificialFrame.get());
                    case 10:
                        return (T) new androidx.camera.camera2.compat.workaround.OutputSizesCorrector(this.getHighSpeedVideoFpsRangesFor.accessartificialFrame.get(), this.getHighSpeedVideoFpsRangesFor.CoroutineDebuggingKt.get());
                    case 11:
                        return (T) androidx.camera.camera2.config.CameraModule_Companion_ProvideUseCaseThreadsFactory.provideUseCaseThreads(androidx.camera.camera2.config.CameraConfig_ProvideCameraConfigFactory.provideCameraConfig(this.getHighSpeedVideoFpsRangesFor.c), androidx.camera.camera2.config.CameraAppConfig_ProvideCameraThreadConfigFactory.provideCameraThreadConfig(this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges));
                    case 12:
                        return (T) new androidx.camera.camera2.impl.ComboRequestListener();
                    case 13:
                        return (T) new androidx.camera.camera2.impl.EvCompControl(this.getHighSpeedVideoFpsRangesFor.getOutputMinFrameDurationlomOqCM.get());
                    case 14:
                        return (T) new androidx.camera.camera2.compat.EvCompImpl(this.getHighSpeedVideoFpsRangesFor.getInputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRangesFor.coroutineBoundary.get(), this.getHighSpeedVideoFpsRangesFor.getOutputStallDurationlomOqCM.get());
                    case 15:
                        return (T) new androidx.camera.camera2.impl.FlashControl(this.getHighSpeedVideoFpsRangesFor.getInputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRangesFor._BOUNDARY.get(), this.getHighSpeedVideoFpsRangesFor.coroutineBoundary.get(), this.getHighSpeedVideoFpsRangesFor.getARTIFICIAL_FRAME_PACKAGE_NAME.get(), androidx.camera.camera2.compat.workaround.UseFlashModeTorchFor3aUpdate_Bindings_Companion_ProvideUseFlashModeTorchFor3aUpdateFactory.provideUseFlashModeTorchFor3aUpdate(this.getHighSpeedVideoFpsRangesFor.getOutputMinFrameDuration.get()));
                    case 16:
                        return (T) new androidx.camera.camera2.impl.TorchControl(this.getHighSpeedVideoFpsRangesFor.getInputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRangesFor._BOUNDARY.get(), this.getHighSpeedVideoFpsRangesFor.coroutineBoundary.get());
                    case 17:
                        return (T) new androidx.camera.camera2.impl.FocusMeteringControl(this.getHighSpeedVideoFpsRangesFor.getInputSizeshNQ4ISI.get(), androidx.camera.camera2.compat.workaround.MeteringRegionCorrection_Bindings_Companion_ProvideMeteringRegionCorrectionFactory.provideMeteringRegionCorrection(this.getHighSpeedVideoFpsRangesFor.getOutputMinFrameDuration.get()), this.getHighSpeedVideoFpsRangesFor._BOUNDARY.get(), this.getHighSpeedVideoFpsRangesFor.coroutineBoundary.get(), androidx.camera.camera2.compat.ZoomCompat_Bindings_Companion_ProvideZoomCompatFactory.provideZoomCompat(this.getHighSpeedVideoFpsRangesFor.getInputSizeshNQ4ISI.get()));
                    case 18:
                        return (T) new androidx.camera.camera2.impl.StillCaptureRequestControl(this.getHighSpeedVideoFpsRangesFor.getOutputStallDuration.get(), this.getHighSpeedVideoFpsRangesFor.coroutineBoundary.get());
                    case 19:
                        return (T) new androidx.camera.camera2.impl.VideoUsageControl();
                    case 20:
                        return (T) new androidx.camera.camera2.impl.ZoomControl(androidx.camera.camera2.compat.ZoomCompat_Bindings_Companion_ProvideZoomCompatFactory.provideZoomCompat(this.getHighSpeedVideoFpsRangesFor.getInputSizeshNQ4ISI.get()));
                    case 21:
                        return (T) androidx.camera.camera2.config.CameraModule_Companion_ProvideCamera2CameraControlFactory.provideCamera2CameraControl(this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoFpsRangesFor.coroutineBoundary.get(), this.getHighSpeedVideoFpsRangesFor.getOutputStallDurationlomOqCM.get());
                    case 22:
                        return (T) new androidx.camera.camera2.compat.Camera2CameraControlCompatImpl();
                    case 23:
                        return (T) new androidx.camera.camera2.adapter.CameraStateAdapter();
                    case 24:
                        return (T) new androidx.camera.camera2.adapter.CameraInfoAdapter(this.getHighSpeedVideoFpsRangesFor.getInputSizeshNQ4ISI.get(), androidx.camera.camera2.config.CameraConfig_ProvideCameraConfigFactory.provideCameraConfig(this.getHighSpeedVideoFpsRangesFor.c), this.getHighSpeedVideoFpsRangesFor.getOutputSizes.get(), this.getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRangesFor.getValidOutputFormatsForInputhNQ4ISI.get(), this.getHighSpeedVideoFpsRangesFor.getOutputMinFrameDuration.get(), this.getHighSpeedVideoFpsRangesFor.ArtificialStackFrames.get(), this.getHighSpeedVideoFpsRangesFor.f2671a.get(), this.getHighSpeedVideoFpsRangesFor.isOutputSupportedFor.get(), this.getHighSpeedVideoFpsRangesFor.release);
                    case 25:
                        return (T) new androidx.camera.camera2.adapter.CameraControlStateAdapter(this.getHighSpeedVideoFpsRangesFor.kernelVersion.get(), this.getHighSpeedVideoFpsRangesFor.getOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRangesFor.getARTIFICIAL_FRAME_PACKAGE_NAME.get(), this.getHighSpeedVideoFpsRangesFor.isOutputSupportedForhNQ4ISI.get());
                    case 26:
                        return (T) new androidx.camera.camera2.impl.CameraCallbackMap();
                    case 27:
                        return (T) androidx.camera.camera2.config.CameraModule_Companion_ProvideEncoderProfilesProviderFactory.provideEncoderProfilesProvider(this.getHighSpeedVideoFpsRangesFor.coroutineCreation.get(), this.getHighSpeedVideoFpsRangesFor.getOutputMinFrameDuration.get());
                    case 28:
                        return (T) androidx.camera.camera2.config.CameraModule_Companion_ProvideCameraIdStringFactory.provideCameraIdString(androidx.camera.camera2.config.CameraConfig_ProvideCameraConfigFactory.provideCameraConfig(this.getHighSpeedVideoFpsRangesFor.c));
                    case 29:
                        return (T) new androidx.camera.camera2.internal.IntrinsicZoomCalculatorImpl(this.Camera2StreamConfigurationMap.getCameraDevices());
                    case 30:
                        return (T) new androidx.camera.camera2.impl.CameraGraphConfigProvider(this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRangesFor.getOutputStallDurationlomOqCM.get(), androidx.camera.camera2.config.CameraConfig_ProvideCameraConfigFactory.provideCameraConfig(this.getHighSpeedVideoFpsRangesFor.c), this.getHighSpeedVideoFpsRangesFor.getOutputMinFrameDuration.get(), this.getHighSpeedVideoFpsRangesFor.b.get(), androidx.camera.camera2.compat.workaround.TemplateParamsOverride_Bindings_Companion_ProvideTemplateParamsOverrideFactory.provideTemplateParamsOverride(this.getHighSpeedVideoFpsRangesFor.getOutputMinFrameDuration.get()), this.getHighSpeedVideoFpsRangesFor.accessartificialFrame.get(), androidx.camera.camera2.config.CameraAppConfig_ProvideCameraXConfigFactory.provideCameraXConfig(this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges), androidx.camera.camera2.config.CameraAppConfig_ProvideCamera2InteropCallbacksFactory.provideCamera2InteropCallbacks(this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges));
                    case 31:
                        return (T) new androidx.camera.camera2.adapter.CameraControlAdapter(this.getHighSpeedVideoFpsRangesFor.getInputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRangesFor.getOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRangesFor.getOutputStallDuration.get(), this.getHighSpeedVideoFpsRangesFor.getValidOutputFormatsForInputhNQ4ISI.get(), this.getHighSpeedVideoFpsRangesFor._CREATION.get(), this.getHighSpeedVideoFpsRangesFor.getARTIFICIAL_FRAME_PACKAGE_NAME.get(), this.getHighSpeedVideoFpsRangesFor.isOutputSupportedForhNQ4ISI.get(), this.getHighSpeedVideoFpsRangesFor.kernelVersion.get(), this.getHighSpeedVideoFpsRangesFor.b.get(), this.getHighSpeedVideoFpsRangesFor.unwrapAs.get(), this.getHighSpeedVideoFpsRangesFor.init.get(), this.getHighSpeedVideoFpsRangesFor.coroutineBoundary.get(), this.getHighSpeedVideoFpsRangesFor.AMEXKernel.get());
                    default:
                        throw new java.lang.AssertionError(this.getHighSpeedVideoFpsRanges);
                }
            }
        }
    }

    static final class CameraAppComponentImpl implements androidx.camera.camera2.config.CameraAppComponent {
        final androidx.camera.camera2.config.CameraAppConfig getHighSpeedVideoFpsRanges;
        private final androidx.camera.camera2.config.DaggerCameraAppComponent.CameraAppComponentImpl getHighSpeedVideoSizes = this;

        CameraAppComponentImpl(androidx.camera.camera2.config.CameraAppConfig cameraAppConfig) {
            this.getHighSpeedVideoFpsRanges = cameraAppConfig;
        }

        @Override // androidx.camera.camera2.config.CameraAppComponent
        public final androidx.camera.camera2.config.CameraComponent.Builder cameraBuilder() {
            return new androidx.camera.camera2.config.DaggerCameraAppComponent.CameraComponentBuilder(this.getHighSpeedVideoSizes, (byte) 0);
        }

        @Override // androidx.camera.camera2.config.CameraAppComponent
        public final androidx.camera.camera2.pipe.CameraPipe getCameraPipe() {
            return androidx.camera.camera2.config.CameraAppConfig_ProvideCameraPipeFactory.provideCameraPipe(this.getHighSpeedVideoFpsRanges);
        }

        @Override // androidx.camera.camera2.config.CameraAppComponent
        public final androidx.camera.camera2.pipe.CameraDevices getCameraDevices() {
            return androidx.camera.camera2.config.CameraAppModule_Companion_ProvideCameraDevicesFactory.provideCameraDevices(androidx.camera.camera2.config.CameraAppConfig_ProvideCameraPipeFactory.provideCameraPipe(this.getHighSpeedVideoFpsRanges));
        }
    }
}
