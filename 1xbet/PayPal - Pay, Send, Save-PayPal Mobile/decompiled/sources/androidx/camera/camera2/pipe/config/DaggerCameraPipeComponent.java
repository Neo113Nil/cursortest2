package androidx.camera.camera2.pipe.config;

/* loaded from: classes6.dex */
public final class DaggerCameraPipeComponent {
    private DaggerCameraPipeComponent() {
    }

    public static androidx.camera.camera2.pipe.config.DaggerCameraPipeComponent.Builder builder() {
        return new androidx.camera.camera2.pipe.config.DaggerCameraPipeComponent.Builder((byte) 0);
    }

    public static final class Builder {
        private androidx.camera.camera2.pipe.config.ThreadConfigModule getHighSpeedVideoFpsRangesFor;
        private androidx.camera.camera2.pipe.config.CameraPipeConfigModule getHighSpeedVideoSizes;

        /* synthetic */ Builder(byte b) {
            this();
        }

        private Builder() {
        }

        public final androidx.camera.camera2.pipe.config.DaggerCameraPipeComponent.Builder cameraPipeConfigModule(androidx.camera.camera2.pipe.config.CameraPipeConfigModule cameraPipeConfigModule) {
            this.getHighSpeedVideoSizes = (androidx.camera.camera2.pipe.config.CameraPipeConfigModule) dagger.internal.Preconditions.checkNotNull(cameraPipeConfigModule);
            return this;
        }

        public final androidx.camera.camera2.pipe.config.DaggerCameraPipeComponent.Builder threadConfigModule(androidx.camera.camera2.pipe.config.ThreadConfigModule threadConfigModule) {
            this.getHighSpeedVideoFpsRangesFor = (androidx.camera.camera2.pipe.config.ThreadConfigModule) dagger.internal.Preconditions.checkNotNull(threadConfigModule);
            return this;
        }

        public final androidx.camera.camera2.pipe.config.CameraPipeComponent build() {
            dagger.internal.Preconditions.checkBuilderRequirement(this.getHighSpeedVideoSizes, androidx.camera.camera2.pipe.config.CameraPipeConfigModule.class);
            dagger.internal.Preconditions.checkBuilderRequirement(this.getHighSpeedVideoFpsRangesFor, androidx.camera.camera2.pipe.config.ThreadConfigModule.class);
            return new androidx.camera.camera2.pipe.config.DaggerCameraPipeComponent.CameraPipeComponentImpl(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor);
        }
    }

    static final class CameraGraphComponentBuilder implements androidx.camera.camera2.pipe.config.CameraGraphComponent.Builder {
        private androidx.camera.camera2.pipe.config.CameraGraphConfigModule Camera2StreamConfigurationMap;
        private final androidx.camera.camera2.pipe.config.DaggerCameraPipeComponent.CameraPipeComponentImpl getHighResolutionOutputSizeshNQ4ISI;

        /* synthetic */ CameraGraphComponentBuilder(androidx.camera.camera2.pipe.config.DaggerCameraPipeComponent.CameraPipeComponentImpl cameraPipeComponentImpl, byte b) {
            this(cameraPipeComponentImpl);
        }

        private CameraGraphComponentBuilder(androidx.camera.camera2.pipe.config.DaggerCameraPipeComponent.CameraPipeComponentImpl cameraPipeComponentImpl) {
            this.getHighResolutionOutputSizeshNQ4ISI = cameraPipeComponentImpl;
        }

        @Override // androidx.camera.camera2.pipe.config.CameraGraphComponent.Builder
        public final androidx.camera.camera2.pipe.config.CameraGraphComponent build() {
            dagger.internal.Preconditions.checkBuilderRequirement(this.Camera2StreamConfigurationMap, androidx.camera.camera2.pipe.config.CameraGraphConfigModule.class);
            return new androidx.camera.camera2.pipe.config.DaggerCameraPipeComponent.CameraGraphComponentImpl(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap);
        }

        @Override // androidx.camera.camera2.pipe.config.CameraGraphComponent.Builder
        public final /* synthetic */ androidx.camera.camera2.pipe.config.CameraGraphComponent.Builder cameraGraphConfigModule(androidx.camera.camera2.pipe.config.CameraGraphConfigModule cameraGraphConfigModule) {
            this.Camera2StreamConfigurationMap = (androidx.camera.camera2.pipe.config.CameraGraphConfigModule) dagger.internal.Preconditions.checkNotNull(cameraGraphConfigModule);
            return this;
        }
    }

    static final class FrameGraphComponentBuilder implements androidx.camera.camera2.pipe.config.FrameGraphComponent.Builder {
        private final androidx.camera.camera2.pipe.config.DaggerCameraPipeComponent.CameraPipeComponentImpl getHighResolutionOutputSizeshNQ4ISI;
        private androidx.camera.camera2.pipe.config.FrameGraphConfigModule getHighSpeedVideoFpsRangesFor;

        /* synthetic */ FrameGraphComponentBuilder(androidx.camera.camera2.pipe.config.DaggerCameraPipeComponent.CameraPipeComponentImpl cameraPipeComponentImpl, byte b) {
            this(cameraPipeComponentImpl);
        }

        private FrameGraphComponentBuilder(androidx.camera.camera2.pipe.config.DaggerCameraPipeComponent.CameraPipeComponentImpl cameraPipeComponentImpl) {
            this.getHighResolutionOutputSizeshNQ4ISI = cameraPipeComponentImpl;
        }

        @Override // androidx.camera.camera2.pipe.config.FrameGraphComponent.Builder
        public final androidx.camera.camera2.pipe.config.FrameGraphComponent build() {
            dagger.internal.Preconditions.checkBuilderRequirement(this.getHighSpeedVideoFpsRangesFor, androidx.camera.camera2.pipe.config.FrameGraphConfigModule.class);
            return new androidx.camera.camera2.pipe.config.DaggerCameraPipeComponent.FrameGraphComponentImpl(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor);
        }

        @Override // androidx.camera.camera2.pipe.config.FrameGraphComponent.Builder
        public final /* synthetic */ androidx.camera.camera2.pipe.config.FrameGraphComponent.Builder frameGraphConfigModule(androidx.camera.camera2.pipe.config.FrameGraphConfigModule frameGraphConfigModule) {
            this.getHighSpeedVideoFpsRangesFor = (androidx.camera.camera2.pipe.config.FrameGraphConfigModule) dagger.internal.Preconditions.checkNotNull(frameGraphConfigModule);
            return this;
        }
    }

    static final class Camera2ControllerComponentBuilder implements androidx.camera.camera2.pipe.config.Camera2ControllerComponent.Builder {
        private androidx.camera.camera2.pipe.config.Camera2ControllerConfig getHighSpeedVideoFpsRangesFor;
        private final androidx.camera.camera2.pipe.config.DaggerCameraPipeComponent.CameraPipeComponentImpl getHighSpeedVideoSizes;

        /* synthetic */ Camera2ControllerComponentBuilder(androidx.camera.camera2.pipe.config.DaggerCameraPipeComponent.CameraPipeComponentImpl cameraPipeComponentImpl, byte b) {
            this(cameraPipeComponentImpl);
        }

        private Camera2ControllerComponentBuilder(androidx.camera.camera2.pipe.config.DaggerCameraPipeComponent.CameraPipeComponentImpl cameraPipeComponentImpl) {
            this.getHighSpeedVideoSizes = cameraPipeComponentImpl;
        }

        @Override // androidx.camera.camera2.pipe.config.Camera2ControllerComponent.Builder
        public final androidx.camera.camera2.pipe.config.Camera2ControllerComponent build() {
            dagger.internal.Preconditions.checkBuilderRequirement(this.getHighSpeedVideoFpsRangesFor, androidx.camera.camera2.pipe.config.Camera2ControllerConfig.class);
            return new androidx.camera.camera2.pipe.config.DaggerCameraPipeComponent.Camera2ControllerComponentImpl(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor);
        }

        @Override // androidx.camera.camera2.pipe.config.Camera2ControllerComponent.Builder
        public final /* synthetic */ androidx.camera.camera2.pipe.config.Camera2ControllerComponent.Builder camera2ControllerConfig(androidx.camera.camera2.pipe.config.Camera2ControllerConfig camera2ControllerConfig) {
            this.getHighSpeedVideoFpsRangesFor = (androidx.camera.camera2.pipe.config.Camera2ControllerConfig) dagger.internal.Preconditions.checkNotNull(camera2ControllerConfig);
            return this;
        }
    }

    static final class CameraGraphComponentImpl implements androidx.camera.camera2.pipe.config.CameraGraphComponent {
        dagger.internal.Provider<androidx.camera.camera2.pipe.graph.CameraGraphImpl> Camera2StreamConfigurationMap;
        private final androidx.camera.camera2.pipe.config.DaggerCameraPipeComponent.CameraPipeComponentImpl accessartificialFrame;
        dagger.internal.Provider<androidx.camera.camera2.pipe.internal.CameraGraphRequestListenersImpl> getHighResolutionOutputSizeshNQ4ISI;
        dagger.internal.Provider<androidx.camera.camera2.pipe.internal.CameraGraphParametersImpl> getHighSpeedVideoFpsRanges;
        dagger.internal.Provider<androidx.camera.camera2.pipe.internal.FrameCaptureQueue> getHighSpeedVideoFpsRangesFor;
        dagger.internal.Provider<androidx.camera.camera2.pipe.graph.Controller3A> getHighSpeedVideoSizes;
        dagger.internal.Provider<androidx.camera.camera2.pipe.internal.GraphSessionLock> getHighSpeedVideoSizesFor;
        dagger.internal.Provider<androidx.camera.camera2.pipe.graph.Listener3A> getInputFormats;
        dagger.internal.Provider<androidx.camera.camera2.pipe.CameraBackend> getInputSizeshNQ4ISI;
        dagger.internal.Provider<androidx.camera.camera2.pipe.graph.GraphState3A> getOutputMinFrameDuration;
        dagger.internal.Provider<java.util.List<androidx.camera.camera2.pipe.Request.Listener>> getOutputMinFrameDurationlomOqCM;
        dagger.internal.Provider<androidx.camera.camera2.pipe.internal.FrameDistributor> getOutputSizes;
        dagger.internal.Provider<kotlinx.coroutines.CoroutineScope> getOutputSizeshNQ4ISI;
        dagger.internal.Provider<androidx.camera.camera2.pipe.CameraMetadata> getOutputStallDuration;
        private final androidx.camera.camera2.pipe.config.CameraGraphConfigModule getValidOutputFormatsForInputhNQ4ISI;
        dagger.internal.Provider<androidx.camera.camera2.pipe.graph.SurfaceGraph> isOutputSupportedFor;
        dagger.internal.Provider<androidx.camera.camera2.pipe.core.SystemClockOffsets> isOutputSupportedForhNQ4ISI;
        private final androidx.camera.camera2.pipe.config.DaggerCameraPipeComponent.CameraGraphComponentImpl unwrapAs = this;
        dagger.internal.Provider<androidx.camera.camera2.pipe.graph.GraphProcessorImpl> getOutputFormats = new dagger.internal.DelegateFactory();
        dagger.internal.Provider<androidx.camera.camera2.pipe.graph.StreamGraphImpl> toString = new dagger.internal.DelegateFactory();
        dagger.internal.Provider<androidx.camera.camera2.pipe.CameraController> getOutputStallDurationlomOqCM = new dagger.internal.DelegateFactory();

        CameraGraphComponentImpl(androidx.camera.camera2.pipe.config.DaggerCameraPipeComponent.CameraPipeComponentImpl cameraPipeComponentImpl, androidx.camera.camera2.pipe.config.CameraGraphConfigModule cameraGraphConfigModule) {
            this.accessartificialFrame = cameraPipeComponentImpl;
            this.getValidOutputFormatsForInputhNQ4ISI = cameraGraphConfigModule;
            this.getInputSizeshNQ4ISI = dagger.internal.DoubleCheck.provider((dagger.internal.Provider) new androidx.camera.camera2.pipe.config.DaggerCameraPipeComponent.CameraGraphComponentImpl.SwitchingProvider(cameraPipeComponentImpl, this, 2));
            this.getOutputStallDuration = dagger.internal.DoubleCheck.provider((dagger.internal.Provider) new androidx.camera.camera2.pipe.config.DaggerCameraPipeComponent.CameraGraphComponentImpl.SwitchingProvider(cameraPipeComponentImpl, this, 1));
            this.getInputFormats = dagger.internal.DoubleCheck.provider((dagger.internal.Provider) new androidx.camera.camera2.pipe.config.DaggerCameraPipeComponent.CameraGraphComponentImpl.SwitchingProvider(cameraPipeComponentImpl, this, 4));
            this.isOutputSupportedFor = dagger.internal.DoubleCheck.provider((dagger.internal.Provider) new androidx.camera.camera2.pipe.config.DaggerCameraPipeComponent.CameraGraphComponentImpl.SwitchingProvider(cameraPipeComponentImpl, this, 9));
            dagger.internal.DelegateFactory.setDelegate((dagger.internal.Provider) this.getOutputStallDurationlomOqCM, dagger.internal.DoubleCheck.provider((dagger.internal.Provider) new androidx.camera.camera2.pipe.config.DaggerCameraPipeComponent.CameraGraphComponentImpl.SwitchingProvider(cameraPipeComponentImpl, this, 8)));
            dagger.internal.DelegateFactory.setDelegate((dagger.internal.Provider) this.toString, dagger.internal.DoubleCheck.provider((dagger.internal.Provider) new androidx.camera.camera2.pipe.config.DaggerCameraPipeComponent.CameraGraphComponentImpl.SwitchingProvider(cameraPipeComponentImpl, this, 7)));
            this.getHighSpeedVideoFpsRangesFor = dagger.internal.DoubleCheck.provider((dagger.internal.Provider) new androidx.camera.camera2.pipe.config.DaggerCameraPipeComponent.CameraGraphComponentImpl.SwitchingProvider(cameraPipeComponentImpl, this, 10));
            this.isOutputSupportedForhNQ4ISI = dagger.internal.DoubleCheck.provider((dagger.internal.Provider) new androidx.camera.camera2.pipe.config.DaggerCameraPipeComponent.CameraGraphComponentImpl.SwitchingProvider(cameraPipeComponentImpl, this, 11));
            this.getOutputSizes = dagger.internal.DoubleCheck.provider((dagger.internal.Provider) new androidx.camera.camera2.pipe.config.DaggerCameraPipeComponent.CameraGraphComponentImpl.SwitchingProvider(cameraPipeComponentImpl, this, 6));
            this.getOutputMinFrameDurationlomOqCM = dagger.internal.DoubleCheck.provider((dagger.internal.Provider) new androidx.camera.camera2.pipe.config.DaggerCameraPipeComponent.CameraGraphComponentImpl.SwitchingProvider(cameraPipeComponentImpl, this, 5));
            dagger.internal.DelegateFactory.setDelegate((dagger.internal.Provider) this.getOutputFormats, dagger.internal.DoubleCheck.provider((dagger.internal.Provider) new androidx.camera.camera2.pipe.config.DaggerCameraPipeComponent.CameraGraphComponentImpl.SwitchingProvider(cameraPipeComponentImpl, this, 3)));
            this.getHighSpeedVideoSizesFor = dagger.internal.DoubleCheck.provider((dagger.internal.Provider) new androidx.camera.camera2.pipe.config.DaggerCameraPipeComponent.CameraGraphComponentImpl.SwitchingProvider(cameraPipeComponentImpl, this, 13));
            this.getOutputSizeshNQ4ISI = dagger.internal.DoubleCheck.provider((dagger.internal.Provider) new androidx.camera.camera2.pipe.config.DaggerCameraPipeComponent.CameraGraphComponentImpl.SwitchingProvider(cameraPipeComponentImpl, this, 14));
            this.getHighSpeedVideoFpsRanges = dagger.internal.DoubleCheck.provider((dagger.internal.Provider) new androidx.camera.camera2.pipe.config.DaggerCameraPipeComponent.CameraGraphComponentImpl.SwitchingProvider(cameraPipeComponentImpl, this, 12));
            this.getHighResolutionOutputSizeshNQ4ISI = dagger.internal.DoubleCheck.provider((dagger.internal.Provider) new androidx.camera.camera2.pipe.config.DaggerCameraPipeComponent.CameraGraphComponentImpl.SwitchingProvider(cameraPipeComponentImpl, this, 15));
            this.getOutputMinFrameDuration = dagger.internal.DoubleCheck.provider((dagger.internal.Provider) new androidx.camera.camera2.pipe.config.DaggerCameraPipeComponent.CameraGraphComponentImpl.SwitchingProvider(cameraPipeComponentImpl, this, 17));
            this.getHighSpeedVideoSizes = dagger.internal.DoubleCheck.provider((dagger.internal.Provider) new androidx.camera.camera2.pipe.config.DaggerCameraPipeComponent.CameraGraphComponentImpl.SwitchingProvider(cameraPipeComponentImpl, this, 16));
            this.Camera2StreamConfigurationMap = dagger.internal.DoubleCheck.provider((dagger.internal.Provider) new androidx.camera.camera2.pipe.config.DaggerCameraPipeComponent.CameraGraphComponentImpl.SwitchingProvider(cameraPipeComponentImpl, this, 0));
        }

        @Override // androidx.camera.camera2.pipe.config.CameraGraphComponent
        public final androidx.camera.camera2.pipe.CameraGraph cameraGraph() {
            return this.Camera2StreamConfigurationMap.get();
        }

        @Override // androidx.camera.camera2.pipe.config.CameraGraphComponent
        public final androidx.camera.camera2.pipe.graph.GraphProcessor graphProcessor() {
            return this.getOutputFormats.get();
        }

        @Override // androidx.camera.camera2.pipe.config.CameraGraphComponent
        public final androidx.camera.camera2.pipe.internal.FrameCaptureQueue frameCaptureQueue() {
            return this.getHighSpeedVideoFpsRangesFor.get();
        }

        @Override // androidx.camera.camera2.pipe.config.CameraGraphComponent
        public final androidx.camera.camera2.pipe.internal.GraphSessionLock sessionLock() {
            return this.getHighSpeedVideoSizesFor.get();
        }

        @Override // androidx.camera.camera2.pipe.config.CameraGraphComponent
        public final androidx.camera.camera2.pipe.internal.FrameDistributor frameDistributor() {
            return this.getOutputSizes.get();
        }

        @Override // androidx.camera.camera2.pipe.config.CameraGraphComponent
        public final androidx.camera.camera2.pipe.graph.Controller3A controller3A() {
            return this.getHighSpeedVideoSizes.get();
        }

        static final class SwitchingProvider<T> implements dagger.internal.Provider<T> {
            private final int getHighResolutionOutputSizeshNQ4ISI;
            private final androidx.camera.camera2.pipe.config.DaggerCameraPipeComponent.CameraPipeComponentImpl getHighSpeedVideoFpsRanges;
            private final androidx.camera.camera2.pipe.config.DaggerCameraPipeComponent.CameraGraphComponentImpl getHighSpeedVideoFpsRangesFor;

            SwitchingProvider(androidx.camera.camera2.pipe.config.DaggerCameraPipeComponent.CameraPipeComponentImpl cameraPipeComponentImpl, androidx.camera.camera2.pipe.config.DaggerCameraPipeComponent.CameraGraphComponentImpl cameraGraphComponentImpl, int i) {
                this.getHighSpeedVideoFpsRanges = cameraPipeComponentImpl;
                this.getHighSpeedVideoFpsRangesFor = cameraGraphComponentImpl;
                this.getHighResolutionOutputSizeshNQ4ISI = i;
            }

            @Override // javax.inject.Provider, jakarta.inject.Provider
            public final T get() {
                switch (this.getHighResolutionOutputSizeshNQ4ISI) {
                    case 0:
                        return (T) new androidx.camera.camera2.pipe.graph.CameraGraphImpl(androidx.camera.camera2.pipe.config.CameraGraphConfigModule_ProvideCameraGraphConfigFactory.provideCameraGraphConfig(this.getHighSpeedVideoFpsRangesFor.getValidOutputFormatsForInputhNQ4ISI), this.getHighSpeedVideoFpsRangesFor.getOutputStallDuration.get(), this.getHighSpeedVideoFpsRangesFor.getOutputFormats.get(), this.getHighSpeedVideoFpsRangesFor.getOutputFormats.get(), this.getHighSpeedVideoFpsRangesFor.toString.get(), this.getHighSpeedVideoFpsRangesFor.isOutputSupportedFor.get(), this.getHighSpeedVideoFpsRangesFor.getOutputStallDurationlomOqCM.get(), this.getHighSpeedVideoFpsRangesFor.getOutputSizes.get(), this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor.get(), androidx.camera.camera2.pipe.config.CameraGraphConfigModule_ProvideCameraGraphIdFactory.provideCameraGraphId(this.getHighSpeedVideoFpsRangesFor.getValidOutputFormatsForInputhNQ4ISI), this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizesFor.get(), this.getHighSpeedVideoFpsRangesFor.getOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes.get());
                    case 1:
                        return (T) androidx.camera.camera2.pipe.config.InternalCameraGraphModules_Companion_ProvideCameraMetadataFactory.provideCameraMetadata(androidx.camera.camera2.pipe.config.CameraGraphConfigModule_ProvideCameraGraphConfigFactory.provideCameraGraphConfig(this.getHighSpeedVideoFpsRangesFor.getValidOutputFormatsForInputhNQ4ISI), this.getHighSpeedVideoFpsRangesFor.getInputSizeshNQ4ISI.get());
                    case 2:
                        return (T) androidx.camera.camera2.pipe.config.InternalCameraGraphModules_Companion_ProvideCameraBackendFactory.provideCameraBackend(this.getHighSpeedVideoFpsRanges.getOutputStallDuration.get(), androidx.camera.camera2.pipe.config.CameraGraphConfigModule_ProvideCameraGraphConfigFactory.provideCameraGraphConfig(this.getHighSpeedVideoFpsRangesFor.getValidOutputFormatsForInputhNQ4ISI), this.getHighSpeedVideoFpsRanges.getOutputStallDurationlomOqCM.get());
                    case 3:
                        return (T) new androidx.camera.camera2.pipe.graph.GraphProcessorImpl(this.getHighSpeedVideoFpsRanges.coroutineCreation.get(), androidx.camera.camera2.pipe.config.CameraGraphConfigModule_ProvideCameraGraphIdFactory.provideCameraGraphId(this.getHighSpeedVideoFpsRangesFor.getValidOutputFormatsForInputhNQ4ISI), androidx.camera.camera2.pipe.config.CameraGraphConfigModule_ProvideCameraGraphConfigFactory.provideCameraGraphConfig(this.getHighSpeedVideoFpsRangesFor.getValidOutputFormatsForInputhNQ4ISI), this.getHighSpeedVideoFpsRangesFor.getInputFormats.get(), this.getHighSpeedVideoFpsRangesFor.getOutputMinFrameDurationlomOqCM.get(), this.getHighSpeedVideoFpsRanges.getOutputMinFrameDuration.get());
                    case 4:
                        return (T) new androidx.camera.camera2.pipe.graph.Listener3A();
                    case 5:
                        return (T) androidx.camera.camera2.pipe.config.SharedCameraGraphModules_Companion_ProvideRequestListenersFactory.provideRequestListeners(androidx.camera.camera2.pipe.config.CameraGraphConfigModule_ProvideCameraGraphConfigFactory.provideCameraGraphConfig(this.getHighSpeedVideoFpsRangesFor.getValidOutputFormatsForInputhNQ4ISI), this.getHighSpeedVideoFpsRangesFor.getInputFormats.get(), this.getHighSpeedVideoFpsRangesFor.getOutputSizes.get());
                    case 6:
                        return (T) androidx.camera.camera2.pipe.config.SharedCameraGraphModules_Companion_ProvideFrameDistributorFactory.provideFrameDistributor(this.getHighSpeedVideoFpsRangesFor.toString.get(), this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoFpsRangesFor.getOutputStallDuration.get(), this.getHighSpeedVideoFpsRangesFor.isOutputSupportedForhNQ4ISI.get());
                    case 7:
                        androidx.camera.camera2.pipe.CameraMetadata cameraMetadata = this.getHighSpeedVideoFpsRangesFor.getOutputStallDuration.get();
                        androidx.camera.camera2.pipe.CameraGraph.Config provideCameraGraphConfig = androidx.camera.camera2.pipe.config.CameraGraphConfigModule_ProvideCameraGraphConfigFactory.provideCameraGraphConfig(this.getHighSpeedVideoFpsRangesFor.getValidOutputFormatsForInputhNQ4ISI);
                        androidx.camera.camera2.pipe.config.DaggerCameraPipeComponent.CameraPipeComponentImpl cameraPipeComponentImpl = this.getHighSpeedVideoFpsRanges;
                        return (T) new androidx.camera.camera2.pipe.graph.StreamGraphImpl(cameraMetadata, provideCameraGraphConfig, androidx.camera.camera2.pipe.config.CameraPipeModule_Companion_ConfigureImageSourcesFactory.configureImageSources(new androidx.camera.camera2.pipe.media.ImageReaderImageSources(cameraPipeComponentImpl.coroutineCreation.get(), androidx.camera.camera2.pipe.config.CameraPipeConfigModule_ProvideCameraPipeConfigFactory.provideCameraPipeConfig(cameraPipeComponentImpl.getInputFormats)), androidx.camera.camera2.pipe.config.CameraPipeConfigModule_ProvideCameraPipeConfigFactory.provideCameraPipeConfig(cameraPipeComponentImpl.getInputFormats)), this.getHighSpeedVideoFpsRangesFor.getOutputStallDurationlomOqCM);
                    case 8:
                        return (T) androidx.camera.camera2.pipe.config.InternalCameraGraphModules_Companion_ProvideCameraControllerFactory.provideCameraController(androidx.camera.camera2.pipe.config.CameraGraphConfigModule_ProvideCameraGraphIdFactory.provideCameraGraphId(this.getHighSpeedVideoFpsRangesFor.getValidOutputFormatsForInputhNQ4ISI), androidx.camera.camera2.pipe.config.CameraGraphConfigModule_ProvideCameraGraphConfigFactory.provideCameraGraphConfig(this.getHighSpeedVideoFpsRangesFor.getValidOutputFormatsForInputhNQ4ISI), this.getHighSpeedVideoFpsRangesFor.getInputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRanges.getOutputStallDurationlomOqCM.get(), this.getHighSpeedVideoFpsRangesFor.getOutputFormats.get(), this.getHighSpeedVideoFpsRangesFor.toString.get(), this.getHighSpeedVideoFpsRangesFor.isOutputSupportedFor.get());
                    case 9:
                        return (T) androidx.camera.camera2.pipe.config.SharedCameraGraphModules_Companion_ProvideSurfaceGraphFactory.provideSurfaceGraph(this.getHighSpeedVideoFpsRangesFor.toString.get(), this.getHighSpeedVideoFpsRangesFor.getOutputStallDurationlomOqCM, this.getHighSpeedVideoFpsRanges.isOutputSupportedForhNQ4ISI.get());
                    case 10:
                        return (T) new androidx.camera.camera2.pipe.internal.FrameCaptureQueue();
                    case 11:
                        return (T) androidx.camera.camera2.pipe.config.SharedCameraGraphModules_Companion_ProvideSystemClockOffsetsFactory.provideSystemClockOffsets();
                    case 12:
                        return (T) new androidx.camera.camera2.pipe.internal.CameraGraphParametersImpl(this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizesFor.get(), this.getHighSpeedVideoFpsRangesFor.getOutputFormats.get(), this.getHighSpeedVideoFpsRangesFor.getOutputSizeshNQ4ISI.get());
                    case 13:
                        return (T) new androidx.camera.camera2.pipe.internal.GraphSessionLock();
                    case 14:
                        return (T) androidx.camera.camera2.pipe.config.SharedCameraGraphModules_Companion_ProvideCameraGraphCoroutineScopeFactory.provideCameraGraphCoroutineScope(this.getHighSpeedVideoFpsRanges.coroutineCreation.get(), this.getHighSpeedVideoFpsRanges.unwrapAs.get());
                    case 15:
                        return (T) new androidx.camera.camera2.pipe.internal.CameraGraphRequestListenersImpl(this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizesFor.get(), this.getHighSpeedVideoFpsRangesFor.getOutputFormats.get(), this.getHighSpeedVideoFpsRangesFor.getOutputSizeshNQ4ISI.get());
                    case 16:
                        return (T) new androidx.camera.camera2.pipe.graph.Controller3A(this.getHighSpeedVideoFpsRangesFor.getOutputFormats.get(), this.getHighSpeedVideoFpsRangesFor.getOutputStallDuration.get(), this.getHighSpeedVideoFpsRangesFor.getOutputMinFrameDuration.get(), this.getHighSpeedVideoFpsRangesFor.getInputFormats.get());
                    case 17:
                        return (T) new androidx.camera.camera2.pipe.graph.GraphState3A();
                    default:
                        throw new java.lang.AssertionError(this.getHighResolutionOutputSizeshNQ4ISI);
                }
            }
        }
    }

    static final class FrameGraphComponentImpl implements androidx.camera.camera2.pipe.config.FrameGraphComponent {
        private final androidx.camera.camera2.pipe.config.DaggerCameraPipeComponent.FrameGraphComponentImpl Camera2StreamConfigurationMap = this;
        dagger.internal.Provider<androidx.camera.camera2.pipe.framegraph.FrameGraphImpl> getHighResolutionOutputSizeshNQ4ISI;
        private final androidx.camera.camera2.pipe.config.DaggerCameraPipeComponent.CameraPipeComponentImpl getHighSpeedVideoFpsRanges;
        dagger.internal.Provider<androidx.camera.camera2.pipe.framegraph.FrameGraphBuffers> getHighSpeedVideoFpsRangesFor;
        dagger.internal.Provider<kotlinx.coroutines.CoroutineScope> getHighSpeedVideoSizes;
        private final androidx.camera.camera2.pipe.config.FrameGraphConfigModule getOutputFormats;

        FrameGraphComponentImpl(androidx.camera.camera2.pipe.config.DaggerCameraPipeComponent.CameraPipeComponentImpl cameraPipeComponentImpl, androidx.camera.camera2.pipe.config.FrameGraphConfigModule frameGraphConfigModule) {
            this.getHighSpeedVideoFpsRanges = cameraPipeComponentImpl;
            this.getOutputFormats = frameGraphConfigModule;
            this.getHighSpeedVideoSizes = dagger.internal.DoubleCheck.provider((dagger.internal.Provider) new androidx.camera.camera2.pipe.config.DaggerCameraPipeComponent.FrameGraphComponentImpl.SwitchingProvider(cameraPipeComponentImpl, this, 2));
            this.getHighSpeedVideoFpsRangesFor = dagger.internal.DoubleCheck.provider((dagger.internal.Provider) new androidx.camera.camera2.pipe.config.DaggerCameraPipeComponent.FrameGraphComponentImpl.SwitchingProvider(cameraPipeComponentImpl, this, 1));
            this.getHighResolutionOutputSizeshNQ4ISI = dagger.internal.DoubleCheck.provider((dagger.internal.Provider) new androidx.camera.camera2.pipe.config.DaggerCameraPipeComponent.FrameGraphComponentImpl.SwitchingProvider(cameraPipeComponentImpl, this, 0));
        }

        @Override // androidx.camera.camera2.pipe.config.FrameGraphComponent
        public final androidx.camera.camera2.pipe.FrameGraph frameGraph() {
            return this.getHighResolutionOutputSizeshNQ4ISI.get();
        }

        static final class SwitchingProvider<T> implements dagger.internal.Provider<T> {
            private final androidx.camera.camera2.pipe.config.DaggerCameraPipeComponent.CameraPipeComponentImpl Camera2StreamConfigurationMap;
            private final androidx.camera.camera2.pipe.config.DaggerCameraPipeComponent.FrameGraphComponentImpl getHighResolutionOutputSizeshNQ4ISI;
            private final int getHighSpeedVideoFpsRanges;

            SwitchingProvider(androidx.camera.camera2.pipe.config.DaggerCameraPipeComponent.CameraPipeComponentImpl cameraPipeComponentImpl, androidx.camera.camera2.pipe.config.DaggerCameraPipeComponent.FrameGraphComponentImpl frameGraphComponentImpl, int i) {
                this.Camera2StreamConfigurationMap = cameraPipeComponentImpl;
                this.getHighResolutionOutputSizeshNQ4ISI = frameGraphComponentImpl;
                this.getHighSpeedVideoFpsRanges = i;
            }

            @Override // javax.inject.Provider, jakarta.inject.Provider
            public final T get() {
                int i = this.getHighSpeedVideoFpsRanges;
                if (i == 0) {
                    return (T) new androidx.camera.camera2.pipe.framegraph.FrameGraphImpl(androidx.camera.camera2.pipe.config.FrameGraphConfigModule_ProvideCameraGraphFactory.provideCameraGraph(this.getHighResolutionOutputSizeshNQ4ISI.getOutputFormats), androidx.camera.camera2.pipe.config.FrameGraphConfigModule_ProvideFrameDistributorFactory.provideFrameDistributor(this.getHighResolutionOutputSizeshNQ4ISI.getOutputFormats), this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor.get(), this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes.get(), androidx.camera.camera2.pipe.config.FrameGraphConfigModule_ProvideController3AFactory.provideController3A(this.getHighResolutionOutputSizeshNQ4ISI.getOutputFormats));
                }
                if (i == 1) {
                    return (T) new androidx.camera.camera2.pipe.framegraph.FrameGraphBuffers(androidx.camera.camera2.pipe.config.FrameGraphConfigModule_ProvideCameraGraphFactory.provideCameraGraph(this.getHighResolutionOutputSizeshNQ4ISI.getOutputFormats), this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes.get());
                }
                if (i == 2) {
                    return (T) androidx.camera.camera2.pipe.config.FrameGraphModule_Companion_ProvideFrameGraphCoroutineScopeFactory.provideFrameGraphCoroutineScope(this.Camera2StreamConfigurationMap.coroutineCreation.get(), this.Camera2StreamConfigurationMap.unwrapAs.get());
                }
                throw new java.lang.AssertionError(this.getHighSpeedVideoFpsRanges);
            }
        }
    }

    static final class Camera2ControllerComponentImpl implements androidx.camera.camera2.pipe.config.Camera2ControllerComponent {
        dagger.internal.Provider<androidx.camera.camera2.pipe.compat.AndroidPSessionFactory> Camera2StreamConfigurationMap;
        dagger.internal.Provider<androidx.camera.camera2.pipe.compat.AndroidMHighSpeedSessionFactory> getHighResolutionOutputSizeshNQ4ISI;
        dagger.internal.Provider<androidx.camera.camera2.pipe.compat.AndroidExtensionSessionFactory> getHighSpeedVideoFpsRanges;
        dagger.internal.Provider<androidx.camera.camera2.pipe.compat.AndroidMSessionFactory> getHighSpeedVideoFpsRangesFor;
        dagger.internal.Provider<androidx.camera.camera2.pipe.compat.AndroidNSessionFactory> getHighSpeedVideoSizes;
        dagger.internal.Provider<kotlinx.coroutines.CoroutineScope> getHighSpeedVideoSizesFor;
        dagger.internal.Provider<androidx.camera.camera2.pipe.internal.CameraStatusMonitor> getInputFormats;
        dagger.internal.Provider<androidx.camera.camera2.pipe.compat.Camera2CameraController> getInputSizeshNQ4ISI;
        final androidx.camera.camera2.pipe.config.Camera2ControllerConfig getOutputFormats;
        final androidx.camera.camera2.pipe.config.DaggerCameraPipeComponent.CameraPipeComponentImpl getOutputMinFrameDuration;
        private final androidx.camera.camera2.pipe.config.DaggerCameraPipeComponent.Camera2ControllerComponentImpl getOutputMinFrameDurationlomOqCM = this;
        dagger.internal.Provider<androidx.camera.camera2.pipe.compat.CaptureSessionFactory> getOutputSizeshNQ4ISI;

        Camera2ControllerComponentImpl(androidx.camera.camera2.pipe.config.DaggerCameraPipeComponent.CameraPipeComponentImpl cameraPipeComponentImpl, androidx.camera.camera2.pipe.config.Camera2ControllerConfig camera2ControllerConfig) {
            this.getOutputMinFrameDuration = cameraPipeComponentImpl;
            this.getOutputFormats = camera2ControllerConfig;
            this.getHighSpeedVideoSizesFor = dagger.internal.DoubleCheck.provider((dagger.internal.Provider) new androidx.camera.camera2.pipe.config.DaggerCameraPipeComponent.Camera2ControllerComponentImpl.SwitchingProvider(cameraPipeComponentImpl, this, 1));
            this.getInputFormats = dagger.internal.DoubleCheck.provider((dagger.internal.Provider) new androidx.camera.camera2.pipe.config.DaggerCameraPipeComponent.Camera2ControllerComponentImpl.SwitchingProvider(cameraPipeComponentImpl, this, 2));
            this.getHighSpeedVideoFpsRangesFor = new androidx.camera.camera2.pipe.config.DaggerCameraPipeComponent.Camera2ControllerComponentImpl.SwitchingProvider(cameraPipeComponentImpl, this, 4);
            this.getHighResolutionOutputSizeshNQ4ISI = new androidx.camera.camera2.pipe.config.DaggerCameraPipeComponent.Camera2ControllerComponentImpl.SwitchingProvider(cameraPipeComponentImpl, this, 5);
            this.getHighSpeedVideoSizes = new androidx.camera.camera2.pipe.config.DaggerCameraPipeComponent.Camera2ControllerComponentImpl.SwitchingProvider(cameraPipeComponentImpl, this, 6);
            this.Camera2StreamConfigurationMap = new androidx.camera.camera2.pipe.config.DaggerCameraPipeComponent.Camera2ControllerComponentImpl.SwitchingProvider(cameraPipeComponentImpl, this, 7);
            this.getHighSpeedVideoFpsRanges = new androidx.camera.camera2.pipe.config.DaggerCameraPipeComponent.Camera2ControllerComponentImpl.SwitchingProvider(cameraPipeComponentImpl, this, 8);
            this.getOutputSizeshNQ4ISI = dagger.internal.DoubleCheck.provider((dagger.internal.Provider) new androidx.camera.camera2.pipe.config.DaggerCameraPipeComponent.Camera2ControllerComponentImpl.SwitchingProvider(cameraPipeComponentImpl, this, 3));
            this.getInputSizeshNQ4ISI = dagger.internal.DoubleCheck.provider((dagger.internal.Provider) new androidx.camera.camera2.pipe.config.DaggerCameraPipeComponent.Camera2ControllerComponentImpl.SwitchingProvider(cameraPipeComponentImpl, this, 0));
        }

        @Override // androidx.camera.camera2.pipe.config.Camera2ControllerComponent
        public final androidx.camera.camera2.pipe.CameraController cameraController() {
            return this.getInputSizeshNQ4ISI.get();
        }

        static final class SwitchingProvider<T> implements dagger.internal.Provider<T> {
            private final androidx.camera.camera2.pipe.config.DaggerCameraPipeComponent.Camera2ControllerComponentImpl getHighSpeedVideoFpsRanges;
            private final androidx.camera.camera2.pipe.config.DaggerCameraPipeComponent.CameraPipeComponentImpl getHighSpeedVideoFpsRangesFor;
            private final int getHighSpeedVideoSizes;

            SwitchingProvider(androidx.camera.camera2.pipe.config.DaggerCameraPipeComponent.CameraPipeComponentImpl cameraPipeComponentImpl, androidx.camera.camera2.pipe.config.DaggerCameraPipeComponent.Camera2ControllerComponentImpl camera2ControllerComponentImpl, int i) {
                this.getHighSpeedVideoFpsRangesFor = cameraPipeComponentImpl;
                this.getHighSpeedVideoFpsRanges = camera2ControllerComponentImpl;
                this.getHighSpeedVideoSizes = i;
            }

            @Override // javax.inject.Provider, jakarta.inject.Provider
            public final T get() {
                switch (this.getHighSpeedVideoSizes) {
                    case 0:
                        kotlinx.coroutines.CoroutineScope coroutineScope = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizesFor.get();
                        androidx.camera.camera2.pipe.core.Threads threads = this.getHighSpeedVideoFpsRangesFor.coroutineCreation.get();
                        androidx.camera.camera2.pipe.StrictMode strictMode = this.getHighSpeedVideoFpsRangesFor.CoroutineDebuggingKt.get();
                        androidx.camera.camera2.pipe.CameraGraph.Config provideCameraGraphConfig = androidx.camera.camera2.pipe.config.Camera2ControllerConfig_ProvideCameraGraphConfigFactory.provideCameraGraphConfig(this.getHighSpeedVideoFpsRanges.getOutputFormats);
                        androidx.camera.camera2.pipe.graph.GraphListener provideGraphListener = androidx.camera.camera2.pipe.config.Camera2ControllerConfig_ProvideGraphListenerFactory.provideGraphListener(this.getHighSpeedVideoFpsRanges.getOutputFormats);
                        androidx.camera.camera2.pipe.SurfaceTracker provideSurfaceGraph = androidx.camera.camera2.pipe.config.Camera2ControllerConfig_ProvideSurfaceGraphFactory.provideSurfaceGraph(this.getHighSpeedVideoFpsRanges.getOutputFormats);
                        androidx.camera.camera2.pipe.internal.CameraStatusMonitor cameraStatusMonitor = this.getHighSpeedVideoFpsRanges.getInputFormats.get();
                        androidx.camera.camera2.pipe.compat.CaptureSessionFactory captureSessionFactory = this.getHighSpeedVideoFpsRanges.getOutputSizeshNQ4ISI.get();
                        androidx.camera.camera2.pipe.config.DaggerCameraPipeComponent.Camera2ControllerComponentImpl camera2ControllerComponentImpl = this.getHighSpeedVideoFpsRanges;
                        return (T) new androidx.camera.camera2.pipe.compat.Camera2CameraController(coroutineScope, threads, strictMode, provideCameraGraphConfig, provideGraphListener, provideSurfaceGraph, cameraStatusMonitor, captureSessionFactory, new androidx.camera.camera2.pipe.compat.StandardCamera2CaptureSequenceProcessorFactory(camera2ControllerComponentImpl.getOutputMinFrameDuration.coroutineCreation.get(), androidx.camera.camera2.pipe.config.Camera2ControllerConfig_ProvideCameraGraphConfigFactory.provideCameraGraphConfig(camera2ControllerComponentImpl.getOutputFormats), androidx.camera.camera2.pipe.config.Camera2ControllerConfig_ProvideStreamGraphFactory.provideStreamGraph(camera2ControllerComponentImpl.getOutputFormats), camera2ControllerComponentImpl.getOutputMinFrameDuration.getOutputMinFrameDuration.get(), camera2ControllerComponentImpl.getOutputMinFrameDuration.CoroutineDebuggingKt.get()), this.getHighSpeedVideoFpsRangesFor.ArtificialStackFrames.get(), this.getHighSpeedVideoFpsRangesFor.isOutputSupportedForhNQ4ISI.get(), this.getHighSpeedVideoFpsRangesFor.getOutputMinFrameDuration.get(), this.getHighSpeedVideoFpsRangesFor.accessartificialFrame.get(), androidx.camera.camera2.pipe.config.Camera2ControllerConfig_ProvideCameraGraphIdFactory.provideCameraGraphId(this.getHighSpeedVideoFpsRanges.getOutputFormats), androidx.camera.camera2.pipe.config.Camera2ControllerConfig_ProvideShutdownListenerFactory.provideShutdownListener(this.getHighSpeedVideoFpsRanges.getOutputFormats), androidx.camera.camera2.pipe.config.Camera2ControllerConfig_ProvideStreamGraphFactory.provideStreamGraph(this.getHighSpeedVideoFpsRanges.getOutputFormats), this.getHighSpeedVideoFpsRangesFor.getOutputMinFrameDurationlomOqCM.get());
                    case 1:
                        return (T) androidx.camera.camera2.pipe.config.Camera2ControllerModule_Companion_ProvideCoroutineScopeFactory.provideCoroutineScope(this.getHighSpeedVideoFpsRangesFor.coroutineCreation.get(), this.getHighSpeedVideoFpsRangesFor.unwrapAs.get());
                    case 2:
                        return (T) androidx.camera.camera2.pipe.config.Camera2ControllerModule_Companion_ProvideCameraStatusMonitorFactory.provideCameraStatusMonitor(this.getHighSpeedVideoFpsRangesFor.toString, this.getHighSpeedVideoFpsRangesFor.coroutineCreation.get(), androidx.camera.camera2.pipe.config.Camera2ControllerConfig_ProvideCameraGraphConfigFactory.provideCameraGraphConfig(this.getHighSpeedVideoFpsRanges.getOutputFormats), this.getHighSpeedVideoFpsRangesFor.unwrapAs.get());
                    case 3:
                        return (T) androidx.camera.camera2.pipe.compat.Camera2CaptureSessionsModule_ProvideSessionFactoryFactory.provideSessionFactory(this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges, androidx.camera.camera2.pipe.config.Camera2ControllerConfig_ProvideCameraGraphConfigFactory.provideCameraGraphConfig(this.getHighSpeedVideoFpsRanges.getOutputFormats));
                    case 4:
                        return (T) new androidx.camera.camera2.pipe.compat.AndroidMSessionFactory(this.getHighSpeedVideoFpsRangesFor.coroutineCreation.get(), androidx.camera.camera2.pipe.config.Camera2ControllerConfig_ProvideStreamGraphFactory.provideStreamGraph(this.getHighSpeedVideoFpsRanges.getOutputFormats), androidx.camera.camera2.pipe.config.Camera2ControllerConfig_ProvideCameraGraphConfigFactory.provideCameraGraphConfig(this.getHighSpeedVideoFpsRanges.getOutputFormats));
                    case 5:
                        return (T) new androidx.camera.camera2.pipe.compat.AndroidMHighSpeedSessionFactory(androidx.camera.camera2.pipe.config.Camera2ControllerConfig_ProvideStreamGraphFactory.provideStreamGraph(this.getHighSpeedVideoFpsRanges.getOutputFormats), this.getHighSpeedVideoFpsRangesFor.coroutineCreation.get());
                    case 6:
                        return (T) new androidx.camera.camera2.pipe.compat.AndroidNSessionFactory(this.getHighSpeedVideoFpsRangesFor.coroutineCreation.get(), androidx.camera.camera2.pipe.config.Camera2ControllerConfig_ProvideStreamGraphFactory.provideStreamGraph(this.getHighSpeedVideoFpsRanges.getOutputFormats), androidx.camera.camera2.pipe.config.Camera2ControllerConfig_ProvideCameraGraphConfigFactory.provideCameraGraphConfig(this.getHighSpeedVideoFpsRanges.getOutputFormats));
                    case 7:
                        return (T) new androidx.camera.camera2.pipe.compat.AndroidPSessionFactory(this.getHighSpeedVideoFpsRangesFor.coroutineCreation.get(), androidx.camera.camera2.pipe.config.Camera2ControllerConfig_ProvideCameraGraphConfigFactory.provideCameraGraphConfig(this.getHighSpeedVideoFpsRanges.getOutputFormats), androidx.camera.camera2.pipe.config.Camera2ControllerConfig_ProvideStreamGraphFactory.provideStreamGraph(this.getHighSpeedVideoFpsRanges.getOutputFormats));
                    case 8:
                        return (T) new androidx.camera.camera2.pipe.compat.AndroidExtensionSessionFactory(this.getHighSpeedVideoFpsRangesFor.coroutineCreation.get(), androidx.camera.camera2.pipe.config.Camera2ControllerConfig_ProvideCameraGraphConfigFactory.provideCameraGraphConfig(this.getHighSpeedVideoFpsRanges.getOutputFormats), androidx.camera.camera2.pipe.config.Camera2ControllerConfig_ProvideStreamGraphFactory.provideStreamGraph(this.getHighSpeedVideoFpsRanges.getOutputFormats), this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizesFor.get(), this.getHighSpeedVideoFpsRangesFor.CoroutineDebuggingKt.get());
                    default:
                        throw new java.lang.AssertionError(this.getHighSpeedVideoSizes);
                }
            }
        }
    }

    static final class CameraPipeComponentImpl implements androidx.camera.camera2.pipe.config.CameraPipeComponent {
        private final androidx.camera.camera2.pipe.config.ThreadConfigModule _BOUNDARY;
        final androidx.camera.camera2.pipe.config.CameraPipeConfigModule getInputFormats;
        private final androidx.camera.camera2.pipe.config.DaggerCameraPipeComponent.CameraPipeComponentImpl getARTIFICIAL_FRAME_PACKAGE_NAME = this;
        dagger.internal.Provider<kotlinx.coroutines.Job> unwrapAs = dagger.internal.DoubleCheck.provider((dagger.internal.Provider) new androidx.camera.camera2.pipe.config.DaggerCameraPipeComponent.CameraPipeComponentImpl.SwitchingProvider(this, 1));
        dagger.internal.Provider<androidx.camera.camera2.pipe.internal.CameraPipeLifetime> getInputSizeshNQ4ISI = dagger.internal.DoubleCheck.provider((dagger.internal.Provider) new androidx.camera.camera2.pipe.config.DaggerCameraPipeComponent.CameraPipeComponentImpl.SwitchingProvider(this, 0));
        dagger.internal.Provider<androidx.camera.camera2.pipe.core.Threads> coroutineCreation = dagger.internal.DoubleCheck.provider((dagger.internal.Provider) new androidx.camera.camera2.pipe.config.DaggerCameraPipeComponent.CameraPipeComponentImpl.SwitchingProvider(this, 5));
        dagger.internal.Provider<android.hardware.camera2.CameraManager> toString = dagger.internal.SingleCheck.provider((dagger.internal.Provider) new androidx.camera.camera2.pipe.config.DaggerCameraPipeComponent.CameraPipeComponentImpl.SwitchingProvider(this, 7));
        dagger.internal.Provider<android.content.pm.PackageManager> getValidOutputFormatsForInputhNQ4ISI = dagger.internal.DoubleCheck.provider((dagger.internal.Provider) new androidx.camera.camera2.pipe.config.DaggerCameraPipeComponent.CameraPipeComponentImpl.SwitchingProvider(this, 8));
        dagger.internal.Provider<androidx.camera.camera2.pipe.compat.Camera2ErrorProcessor> getHighResolutionOutputSizeshNQ4ISI = dagger.internal.DoubleCheck.provider((dagger.internal.Provider) new androidx.camera.camera2.pipe.config.DaggerCameraPipeComponent.CameraPipeComponentImpl.SwitchingProvider(this, 9));
        dagger.internal.Provider<androidx.camera.featurecombinationquery.CameraDeviceSetupCompatFactory> getOutputSizes = dagger.internal.DoubleCheck.provider((dagger.internal.Provider) new androidx.camera.camera2.pipe.config.DaggerCameraPipeComponent.CameraPipeComponentImpl.SwitchingProvider(this, 10));
        dagger.internal.Provider<androidx.camera.camera2.pipe.compat.Camera2DeviceCache> Camera2StreamConfigurationMap = dagger.internal.DoubleCheck.provider((dagger.internal.Provider) new androidx.camera.camera2.pipe.config.DaggerCameraPipeComponent.CameraPipeComponentImpl.SwitchingProvider(this, 6));
        dagger.internal.Provider<androidx.camera.camera2.pipe.core.Permissions> getOutputSizeshNQ4ISI = dagger.internal.DoubleCheck.provider((dagger.internal.Provider) new androidx.camera.camera2.pipe.config.DaggerCameraPipeComponent.CameraPipeComponentImpl.SwitchingProvider(this, 12));
        dagger.internal.Provider<androidx.camera.camera2.pipe.core.SystemTimeSource> accessartificialFrame = dagger.internal.DoubleCheck.provider((dagger.internal.Provider) new androidx.camera.camera2.pipe.config.DaggerCameraPipeComponent.CameraPipeComponentImpl.SwitchingProvider(this, 13));
        dagger.internal.Provider<androidx.camera.camera2.pipe.compat.Camera2MetadataCache> getHighSpeedVideoSizesFor = dagger.internal.DoubleCheck.provider((dagger.internal.Provider) new androidx.camera.camera2.pipe.config.DaggerCameraPipeComponent.CameraPipeComponentImpl.SwitchingProvider(this, 11));
        dagger.internal.Provider<androidx.camera.camera2.pipe.StrictMode> CoroutineDebuggingKt = dagger.internal.DoubleCheck.provider((dagger.internal.Provider) new androidx.camera.camera2.pipe.config.DaggerCameraPipeComponent.CameraPipeComponentImpl.SwitchingProvider(this, 17));
        dagger.internal.Provider<androidx.camera.camera2.pipe.compat.Camera2Quirks> getOutputMinFrameDuration = dagger.internal.DoubleCheck.provider((dagger.internal.Provider) new androidx.camera.camera2.pipe.config.DaggerCameraPipeComponent.CameraPipeComponentImpl.SwitchingProvider(this, 16));
        dagger.internal.Provider<androidx.camera.camera2.pipe.compat.DevicePolicyManagerWrapper> isOutputSupportedFor = dagger.internal.SingleCheck.provider((dagger.internal.Provider) new androidx.camera.camera2.pipe.config.DaggerCameraPipeComponent.CameraPipeComponentImpl.SwitchingProvider(this, 18));
        dagger.internal.Provider<androidx.camera.camera2.pipe.compat.AudioRestrictionControllerImpl> getHighSpeedVideoFpsRangesFor = dagger.internal.DoubleCheck.provider((dagger.internal.Provider) new androidx.camera.camera2.pipe.config.DaggerCameraPipeComponent.CameraPipeComponentImpl.SwitchingProvider(this, 19));
        dagger.internal.Provider<androidx.camera.camera2.pipe.compat.RetryingCameraStateOpenerImpl> coroutineBoundary = dagger.internal.DoubleCheck.provider((dagger.internal.Provider) new androidx.camera.camera2.pipe.config.DaggerCameraPipeComponent.CameraPipeComponentImpl.SwitchingProvider(this, 15));
        dagger.internal.Provider<androidx.camera.camera2.pipe.compat.Camera2DeviceCloserImpl> getHighSpeedVideoSizes = dagger.internal.DoubleCheck.provider((dagger.internal.Provider) new androidx.camera.camera2.pipe.config.DaggerCameraPipeComponent.CameraPipeComponentImpl.SwitchingProvider(this, 20));
        dagger.internal.Provider<androidx.camera.camera2.pipe.compat.PruningCamera2DeviceManager> ArtificialStackFrames = dagger.internal.DoubleCheck.provider((dagger.internal.Provider) new androidx.camera.camera2.pipe.config.DaggerCameraPipeComponent.CameraPipeComponentImpl.SwitchingProvider(this, 14));
        dagger.internal.Provider<androidx.camera.camera2.pipe.compat.Camera2Backend> getHighSpeedVideoFpsRanges = new androidx.camera.camera2.pipe.config.DaggerCameraPipeComponent.CameraPipeComponentImpl.SwitchingProvider(this, 4);
        dagger.internal.Provider<androidx.camera.camera2.pipe.CameraBackends> getOutputStallDuration = dagger.internal.DoubleCheck.provider((dagger.internal.Provider) new androidx.camera.camera2.pipe.config.DaggerCameraPipeComponent.CameraPipeComponentImpl.SwitchingProvider(this, 3));
        dagger.internal.Provider<androidx.camera.camera2.pipe.internal.CameraDevicesImpl> getOutputFormats = dagger.internal.DoubleCheck.provider((dagger.internal.Provider) new androidx.camera.camera2.pipe.config.DaggerCameraPipeComponent.CameraPipeComponentImpl.SwitchingProvider(this, 2));
        dagger.internal.Provider<androidx.camera.camera2.pipe.CameraContext> getOutputStallDurationlomOqCM = dagger.internal.DoubleCheck.provider((dagger.internal.Provider) new androidx.camera.camera2.pipe.config.DaggerCameraPipeComponent.CameraPipeComponentImpl.SwitchingProvider(this, 21));
        dagger.internal.Provider<androidx.camera.camera2.pipe.CameraSurfaceManager> isOutputSupportedForhNQ4ISI = dagger.internal.DoubleCheck.provider((dagger.internal.Provider) new androidx.camera.camera2.pipe.config.DaggerCameraPipeComponent.CameraPipeComponentImpl.SwitchingProvider(this, 22));
        dagger.internal.Provider<androidx.camera.camera2.pipe.compat.ConcurrentSessionSequencers> getOutputMinFrameDurationlomOqCM = dagger.internal.DoubleCheck.provider((dagger.internal.Provider) new androidx.camera.camera2.pipe.config.DaggerCameraPipeComponent.CameraPipeComponentImpl.SwitchingProvider(this, 23));

        CameraPipeComponentImpl(androidx.camera.camera2.pipe.config.CameraPipeConfigModule cameraPipeConfigModule, androidx.camera.camera2.pipe.config.ThreadConfigModule threadConfigModule) {
            this.getInputFormats = cameraPipeConfigModule;
            this._BOUNDARY = threadConfigModule;
        }

        @Override // androidx.camera.camera2.pipe.config.CameraPipeComponent
        public final androidx.camera.camera2.pipe.internal.CameraPipeLifetime cameraPipeLifetime() {
            return this.getInputSizeshNQ4ISI.get();
        }

        @Override // androidx.camera.camera2.pipe.config.CameraPipeComponent
        public final androidx.camera.camera2.pipe.config.CameraGraphComponent.Builder cameraGraphComponentBuilder() {
            return new androidx.camera.camera2.pipe.config.DaggerCameraPipeComponent.CameraGraphComponentBuilder(this.getARTIFICIAL_FRAME_PACKAGE_NAME, (byte) 0);
        }

        @Override // androidx.camera.camera2.pipe.config.CameraPipeComponent
        public final androidx.camera.camera2.pipe.config.FrameGraphComponent.Builder frameGraphComponentBuilder() {
            return new androidx.camera.camera2.pipe.config.DaggerCameraPipeComponent.FrameGraphComponentBuilder(this.getARTIFICIAL_FRAME_PACKAGE_NAME, (byte) 0);
        }

        @Override // androidx.camera.camera2.pipe.config.CameraPipeComponent
        public final androidx.camera.camera2.pipe.CameraDevices cameras() {
            return this.getOutputFormats.get();
        }

        @Override // androidx.camera.camera2.pipe.config.CameraPipeComponent
        public final androidx.camera.camera2.pipe.CameraBackends cameraBackends() {
            return this.getOutputStallDuration.get();
        }

        @Override // androidx.camera.camera2.pipe.config.CameraPipeComponent
        public final androidx.camera.camera2.pipe.CameraContext cameraContext() {
            return this.getOutputStallDurationlomOqCM.get();
        }

        @Override // androidx.camera.camera2.pipe.config.CameraPipeComponent
        public final androidx.camera.camera2.pipe.CameraSurfaceManager cameraSurfaceManager() {
            return this.isOutputSupportedForhNQ4ISI.get();
        }

        @Override // androidx.camera.camera2.pipe.config.CameraPipeComponent
        public final androidx.camera.camera2.pipe.compat.AudioRestrictionController cameraAudioRestrictionController() {
            return this.getHighSpeedVideoFpsRangesFor.get();
        }

        @Override // androidx.camera.camera2.pipe.config.CameraPipeComponent
        public final androidx.camera.camera2.pipe.compat.ConcurrentSessionSequencers concurrentSessionSequencers() {
            return this.getOutputMinFrameDurationlomOqCM.get();
        }

        static final class SwitchingProvider<T> implements dagger.internal.Provider<T> {
            private final androidx.camera.camera2.pipe.config.DaggerCameraPipeComponent.CameraPipeComponentImpl getHighResolutionOutputSizeshNQ4ISI;
            private final int getHighSpeedVideoFpsRanges;

            SwitchingProvider(androidx.camera.camera2.pipe.config.DaggerCameraPipeComponent.CameraPipeComponentImpl cameraPipeComponentImpl, int i) {
                this.getHighResolutionOutputSizeshNQ4ISI = cameraPipeComponentImpl;
                this.getHighSpeedVideoFpsRanges = i;
            }

            @Override // javax.inject.Provider, jakarta.inject.Provider
            public final T get() {
                switch (this.getHighSpeedVideoFpsRanges) {
                    case 0:
                        return (T) new androidx.camera.camera2.pipe.internal.CameraPipeLifetime(this.getHighResolutionOutputSizeshNQ4ISI.unwrapAs.get());
                    case 1:
                        return (T) androidx.camera.camera2.pipe.config.CameraPipeModule_Companion_ProvideCameraPipeJobFactory.provideCameraPipeJob();
                    case 2:
                        return (T) new androidx.camera.camera2.pipe.internal.CameraDevicesImpl(this.getHighResolutionOutputSizeshNQ4ISI.getOutputStallDuration.get());
                    case 3:
                        return (T) androidx.camera.camera2.pipe.config.CameraPipeModule_Companion_ProvideCameraBackendsFactory.provideCameraBackends(androidx.camera.camera2.pipe.config.CameraPipeConfigModule_ProvideCameraPipeConfigFactory.provideCameraPipeConfig(this.getHighResolutionOutputSizeshNQ4ISI.getInputFormats), this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges, androidx.camera.camera2.pipe.config.CameraPipeModule_Companion_ProvideContextFactory.provideContext(androidx.camera.camera2.pipe.config.CameraPipeConfigModule_ProvideCameraPipeConfigFactory.provideCameraPipeConfig(this.getHighResolutionOutputSizeshNQ4ISI.getInputFormats)), this.getHighResolutionOutputSizeshNQ4ISI.coroutineCreation.get(), this.getHighResolutionOutputSizeshNQ4ISI.getInputSizeshNQ4ISI.get());
                    case 4:
                        return (T) new androidx.camera.camera2.pipe.compat.Camera2Backend(this.getHighResolutionOutputSizeshNQ4ISI.coroutineCreation.get(), this.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap.get(), this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizesFor.get(), this.getHighResolutionOutputSizeshNQ4ISI.ArtificialStackFrames.get(), new androidx.camera.camera2.pipe.config.DaggerCameraPipeComponent.Camera2ControllerComponentBuilder(this.getHighResolutionOutputSizeshNQ4ISI, (byte) 0), androidx.camera.camera2.pipe.config.CameraPipeModule_Companion_ProvideContextFactory.provideContext(androidx.camera.camera2.pipe.config.CameraPipeConfigModule_ProvideCameraPipeConfigFactory.provideCameraPipeConfig(this.getHighResolutionOutputSizeshNQ4ISI.getInputFormats)));
                    case 5:
                        return (T) androidx.camera.camera2.pipe.config.ThreadConfigModule_ProvideThreadsFactory.provideThreads(this.getHighResolutionOutputSizeshNQ4ISI._BOUNDARY, this.getHighResolutionOutputSizeshNQ4ISI.getInputSizeshNQ4ISI.get(), this.getHighResolutionOutputSizeshNQ4ISI.unwrapAs.get());
                    case 6:
                        return (T) new androidx.camera.camera2.pipe.compat.Camera2DeviceCache(this.getHighResolutionOutputSizeshNQ4ISI.toString, this.getHighResolutionOutputSizeshNQ4ISI.coroutineCreation.get(), androidx.camera.camera2.pipe.config.CameraPipeModule_Companion_ProvideContextFactory.provideContext(androidx.camera.camera2.pipe.config.CameraPipeConfigModule_ProvideCameraPipeConfigFactory.provideCameraPipeConfig(this.getHighResolutionOutputSizeshNQ4ISI.getInputFormats)), this.getHighResolutionOutputSizeshNQ4ISI.getValidOutputFormatsForInputhNQ4ISI.get(), this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighResolutionOutputSizeshNQ4ISI.getOutputSizes, this.getHighResolutionOutputSizeshNQ4ISI.getInputSizeshNQ4ISI.get(), this.getHighResolutionOutputSizeshNQ4ISI.unwrapAs.get());
                    case 7:
                        return (T) androidx.camera.camera2.pipe.config.CameraPipeModule_Companion_ProvideCameraManagerFactory.provideCameraManager(androidx.camera.camera2.pipe.config.CameraPipeModule_Companion_ProvideContextFactory.provideContext(androidx.camera.camera2.pipe.config.CameraPipeConfigModule_ProvideCameraPipeConfigFactory.provideCameraPipeConfig(this.getHighResolutionOutputSizeshNQ4ISI.getInputFormats)));
                    case 8:
                        return (T) androidx.camera.camera2.pipe.config.CameraPipeModule_Companion_ProvidePackageManagerFactory.providePackageManager(androidx.camera.camera2.pipe.config.CameraPipeModule_Companion_ProvideContextFactory.provideContext(androidx.camera.camera2.pipe.config.CameraPipeConfigModule_ProvideCameraPipeConfigFactory.provideCameraPipeConfig(this.getHighResolutionOutputSizeshNQ4ISI.getInputFormats)));
                    case 9:
                        return (T) new androidx.camera.camera2.pipe.compat.Camera2ErrorProcessor();
                    case 10:
                        return (T) androidx.camera.camera2.pipe.config.CameraPipeModule_Companion_ProvideCameraDeviceSetupCompatFactoryFactory.provideCameraDeviceSetupCompatFactory(androidx.camera.camera2.pipe.config.CameraPipeModule_Companion_ProvideContextFactory.provideContext(androidx.camera.camera2.pipe.config.CameraPipeConfigModule_ProvideCameraPipeConfigFactory.provideCameraPipeConfig(this.getHighResolutionOutputSizeshNQ4ISI.getInputFormats)));
                    case 11:
                        return (T) new androidx.camera.camera2.pipe.compat.Camera2MetadataCache(androidx.camera.camera2.pipe.config.CameraPipeModule_Companion_ProvideContextFactory.provideContext(androidx.camera.camera2.pipe.config.CameraPipeConfigModule_ProvideCameraPipeConfigFactory.provideCameraPipeConfig(this.getHighResolutionOutputSizeshNQ4ISI.getInputFormats)), this.getHighResolutionOutputSizeshNQ4ISI.coroutineCreation.get(), this.getHighResolutionOutputSizeshNQ4ISI.getOutputSizeshNQ4ISI.get(), androidx.camera.camera2.pipe.config.CameraPipeModule_Companion_ProvideCameraMetadataConfigFactory.provideCameraMetadataConfig(androidx.camera.camera2.pipe.config.CameraPipeConfigModule_ProvideCameraPipeConfigFactory.provideCameraPipeConfig(this.getHighResolutionOutputSizeshNQ4ISI.getInputFormats)), this.getHighResolutionOutputSizeshNQ4ISI.accessartificialFrame.get());
                    case 12:
                        return (T) new androidx.camera.camera2.pipe.core.Permissions(androidx.camera.camera2.pipe.config.CameraPipeModule_Companion_ProvideContextFactory.provideContext(androidx.camera.camera2.pipe.config.CameraPipeConfigModule_ProvideCameraPipeConfigFactory.provideCameraPipeConfig(this.getHighResolutionOutputSizeshNQ4ISI.getInputFormats)));
                    case 13:
                        return (T) new androidx.camera.camera2.pipe.core.SystemTimeSource();
                    case 14:
                        return (T) new androidx.camera.camera2.pipe.compat.PruningCamera2DeviceManager(this.getHighResolutionOutputSizeshNQ4ISI.getOutputSizeshNQ4ISI.get(), this.getHighResolutionOutputSizeshNQ4ISI.coroutineBoundary.get(), this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes.get(), this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighResolutionOutputSizeshNQ4ISI.coroutineCreation.get());
                    case 15:
                        androidx.camera.camera2.pipe.config.DaggerCameraPipeComponent.CameraPipeComponentImpl cameraPipeComponentImpl = this.getHighResolutionOutputSizeshNQ4ISI;
                        androidx.camera.camera2.pipe.compat.Camera2CameraOpener camera2CameraOpener = new androidx.camera.camera2.pipe.compat.Camera2CameraOpener(cameraPipeComponentImpl.toString, cameraPipeComponentImpl.coroutineCreation.get());
                        androidx.camera.camera2.pipe.compat.Camera2MetadataCache camera2MetadataCache = cameraPipeComponentImpl.getHighSpeedVideoSizesFor.get();
                        androidx.camera.camera2.pipe.compat.Camera2ErrorProcessor camera2ErrorProcessor = cameraPipeComponentImpl.getHighResolutionOutputSizeshNQ4ISI.get();
                        androidx.camera.camera2.pipe.compat.Camera2Quirks camera2Quirks = cameraPipeComponentImpl.getOutputMinFrameDuration.get();
                        androidx.camera.camera2.pipe.core.SystemTimeSource systemTimeSource = cameraPipeComponentImpl.accessartificialFrame.get();
                        androidx.camera.camera2.pipe.config.CameraPipeConfigModule cameraPipeConfigModule = cameraPipeComponentImpl.getInputFormats;
                        androidx.camera.camera2.pipe.compat.CameraStateOpener cameraStateOpener = new androidx.camera.camera2.pipe.compat.CameraStateOpener(camera2CameraOpener, camera2MetadataCache, camera2ErrorProcessor, camera2Quirks, systemTimeSource, androidx.camera.camera2.pipe.config.CameraPipeConfigModule_ProvideCameraInteropConfigFactory.provideCameraInteropConfig(cameraPipeConfigModule, androidx.camera.camera2.pipe.config.CameraPipeConfigModule_ProvideCameraPipeConfigFactory.provideCameraPipeConfig(cameraPipeConfigModule)), cameraPipeComponentImpl.coroutineCreation.get());
                        androidx.camera.camera2.pipe.compat.Camera2ErrorProcessor camera2ErrorProcessor2 = this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI.get();
                        androidx.camera.camera2.pipe.config.DaggerCameraPipeComponent.CameraPipeComponentImpl cameraPipeComponentImpl2 = this.getHighResolutionOutputSizeshNQ4ISI;
                        androidx.camera.camera2.pipe.compat.Camera2CameraAvailabilityMonitor camera2CameraAvailabilityMonitor = new androidx.camera.camera2.pipe.compat.Camera2CameraAvailabilityMonitor(cameraPipeComponentImpl2.toString, cameraPipeComponentImpl2.coroutineCreation.get(), cameraPipeComponentImpl2.unwrapAs.get());
                        androidx.camera.camera2.pipe.core.SystemTimeSource systemTimeSource2 = this.getHighResolutionOutputSizeshNQ4ISI.accessartificialFrame.get();
                        androidx.camera.camera2.pipe.compat.DevicePolicyManagerWrapper devicePolicyManagerWrapper = this.getHighResolutionOutputSizeshNQ4ISI.isOutputSupportedFor.get();
                        androidx.camera.camera2.pipe.compat.AudioRestrictionControllerImpl audioRestrictionControllerImpl = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor.get();
                        androidx.camera.camera2.pipe.config.CameraPipeConfigModule cameraPipeConfigModule2 = this.getHighResolutionOutputSizeshNQ4ISI.getInputFormats;
                        return (T) new androidx.camera.camera2.pipe.compat.RetryingCameraStateOpenerImpl(cameraStateOpener, camera2ErrorProcessor2, camera2CameraAvailabilityMonitor, systemTimeSource2, devicePolicyManagerWrapper, audioRestrictionControllerImpl, androidx.camera.camera2.pipe.config.CameraPipeConfigModule_ProvideCameraInteropConfigFactory.provideCameraInteropConfig(cameraPipeConfigModule2, androidx.camera.camera2.pipe.config.CameraPipeConfigModule_ProvideCameraPipeConfigFactory.provideCameraPipeConfig(cameraPipeConfigModule2)), this.getHighResolutionOutputSizeshNQ4ISI.coroutineCreation.get());
                    case 16:
                        return (T) new androidx.camera.camera2.pipe.compat.Camera2Quirks(this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizesFor.get(), this.getHighResolutionOutputSizeshNQ4ISI.CoroutineDebuggingKt.get());
                    case 17:
                        return (T) androidx.camera.camera2.pipe.config.CameraPipeModule_Companion_ProvideStrictModeFactory.provideStrictMode(androidx.camera.camera2.pipe.config.CameraPipeConfigModule_ProvideCameraPipeFlagsFactory.provideCameraPipeFlags(this.getHighResolutionOutputSizeshNQ4ISI.getInputFormats));
                    case 18:
                        return (T) androidx.camera.camera2.pipe.config.CameraPipeModule_Companion_ProvideDevicePolicyManagerWrapperFactory.provideDevicePolicyManagerWrapper(androidx.camera.camera2.pipe.config.CameraPipeModule_Companion_ProvideContextFactory.provideContext(androidx.camera.camera2.pipe.config.CameraPipeConfigModule_ProvideCameraPipeConfigFactory.provideCameraPipeConfig(this.getHighResolutionOutputSizeshNQ4ISI.getInputFormats)));
                    case 19:
                        return (T) new androidx.camera.camera2.pipe.compat.AudioRestrictionControllerImpl(this.getHighResolutionOutputSizeshNQ4ISI.coroutineCreation.get(), this.getHighResolutionOutputSizeshNQ4ISI.getInputSizeshNQ4ISI.get(), this.getHighResolutionOutputSizeshNQ4ISI.unwrapAs.get());
                    case 20:
                        return (T) new androidx.camera.camera2.pipe.compat.Camera2DeviceCloserImpl(this.getHighResolutionOutputSizeshNQ4ISI.coroutineCreation.get(), this.getHighResolutionOutputSizeshNQ4ISI.getOutputMinFrameDuration.get(), this.getHighResolutionOutputSizeshNQ4ISI.coroutineBoundary.get());
                    case 21:
                        return (T) androidx.camera.camera2.pipe.config.CameraPipeModule_Companion_ProvideCameraContextFactory.provideCameraContext(androidx.camera.camera2.pipe.config.CameraPipeModule_Companion_ProvideContextFactory.provideContext(androidx.camera.camera2.pipe.config.CameraPipeConfigModule_ProvideCameraPipeConfigFactory.provideCameraPipeConfig(this.getHighResolutionOutputSizeshNQ4ISI.getInputFormats)), this.getHighResolutionOutputSizeshNQ4ISI.coroutineCreation.get(), this.getHighResolutionOutputSizeshNQ4ISI.getOutputStallDuration.get());
                    case 22:
                        return (T) androidx.camera.camera2.pipe.config.CameraPipeModule_Companion_ProvideCameraSurfaceManagerFactory.provideCameraSurfaceManager();
                    case 23:
                        return (T) new androidx.camera.camera2.pipe.compat.ConcurrentSessionSequencers();
                    default:
                        throw new java.lang.AssertionError(this.getHighSpeedVideoFpsRanges);
                }
            }
        }
    }
}
