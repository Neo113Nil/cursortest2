package androidx.camera.video;

/* loaded from: classes.dex */
public final class Recorder implements androidx.camera.video.VideoOutput {
    private static final androidx.camera.video.internal.muxer.MuxerFactory BerTlvEncoder;
    static int Camera2StreamConfigurationMap = 0;
    public static final androidx.camera.video.QualitySelector DEFAULT_QUALITY_SELECTOR;
    private static final androidx.camera.video.VideoSpec TransactionOutcomeDecoderExternalSyntheticLambda1;
    public static final int VIDEO_CAPABILITIES_SOURCE_CAMCORDER_PROFILE = 0;
    public static final int VIDEO_CAPABILITIES_SOURCE_CODEC_CAPABILITIES = 1;
    private static final java.util.concurrent.Executor aid;
    private static final java.util.Set<androidx.camera.video.Recorder.State> apply = java.util.Collections.unmodifiableSet(java.util.EnumSet.of(androidx.camera.video.Recorder.State.PENDING_RECORDING, androidx.camera.video.Recorder.State.PENDING_PAUSED));
    private static final java.util.Set<androidx.camera.video.Recorder.State> decode = java.util.Collections.unmodifiableSet(java.util.EnumSet.of(androidx.camera.video.Recorder.State.CONFIGURING, androidx.camera.video.Recorder.State.IDLING, androidx.camera.video.Recorder.State.RESETTING, androidx.camera.video.Recorder.State.STOPPING, androidx.camera.video.Recorder.State.ERROR));
    private static final androidx.camera.video.internal.OutputStorage.Factory encode;
    static final java.lang.Exception getHighResolutionOutputSizeshNQ4ISI;
    static long getHighSpeedVideoFpsRanges;
    static final androidx.camera.video.internal.encoder.EncoderFactory getHighSpeedVideoFpsRangesFor;
    private static final androidx.camera.video.internal.encoder.VideoEncoderInfo.Finder kernelID;
    private static final androidx.camera.video.MediaSpec provide;
    private final androidx.camera.video.internal.encoder.EncoderFactory TransactionOutcomeDecoder;
    private final androidx.camera.video.internal.muxer.MuxerFactory TransactionOutcomeDecoderExternalSyntheticLambda3;
    private final java.util.concurrent.Executor TransactionOutcomeDecoderExternalSyntheticLambda5;
    private final androidx.camera.core.impl.MutableStateObservable<java.lang.Boolean> TransactionOutcomeDecoderExternalSyntheticLambda6;

    /* renamed from: a, reason: collision with root package name */
    final androidx.camera.core.impl.MutableStateObservable<androidx.camera.video.MediaSpec> f2676a;
    androidx.camera.core.SurfaceRequest coroutineCreation;
    private final int getInterfaceVersion;
    private final androidx.camera.video.internal.encoder.EncoderFactory onExtraCallbackWithResult;
    private final androidx.camera.core.impl.MutableStateObservable<androidx.camera.video.StreamInfo> onNavigationEvent;
    private final java.util.concurrent.Executor onWarmupCompleted;
    final java.util.concurrent.Executor requestGoOnline;
    androidx.camera.core.impl.Timebase start;
    private final long valueOf;
    private final androidx.camera.video.internal.OutputStorage.Factory values;
    androidx.camera.video.VideoEncoderSession version;
    final java.lang.Object getARTIFICIAL_FRAME_PACKAGE_NAME = new java.lang.Object();
    final androidx.camera.core.impl.MutableStateObservable<android.util.Range<java.lang.Integer>> sha1 = androidx.camera.core.impl.MutableStateObservable.withInitialState(null);
    androidx.camera.video.Recorder.State rsaCipher = androidx.camera.video.Recorder.State.CONFIGURING;
    private androidx.camera.video.Recorder.State TransactionOutcomeDecodera = null;
    int free = 0;
    androidx.camera.video.Recorder.RecordingRecord getHighSpeedVideoSizes = null;
    androidx.camera.video.Recorder.RecordingRecord d = null;
    private long TransactionOutcomeDecoderExternalSyntheticLambda4 = 0;
    androidx.camera.video.Recorder.RecordingRecord CoroutineDebuggingKt = null;
    boolean accessartificialFrame = false;
    private androidx.camera.core.SurfaceRequest.TransformationInfo TransactionOutcomeDecoderExternalSyntheticLambda2 = null;
    androidx.camera.core.SurfaceRequest.TransformationInfo AMEXKernelJNI = null;
    private androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy TransactionOutcomeDecoderExternalSyntheticLambda7 = null;
    final java.util.List<com.google.common.util.concurrent.ListenableFuture<java.lang.Void>> getOutputSizeshNQ4ISI = new java.util.ArrayList();
    java.lang.Integer getOutputMinFrameDurationlomOqCM = null;
    java.lang.Integer newContext = null;
    android.view.Surface coroutineBoundary = null;
    android.view.Surface getHighSpeedVideoSizesFor = null;
    androidx.camera.video.internal.muxer.Muxer _CREATION = null;
    androidx.camera.video.internal.audio.AudioSource getOutputStallDurationlomOqCM = null;
    androidx.camera.video.internal.encoder.Encoder freeTransaction = null;
    androidx.camera.video.internal.encoder.OutputConfig AMEXKernelProvider = null;
    androidx.camera.video.internal.encoder.Encoder getInputFormats = null;
    androidx.camera.video.internal.encoder.OutputConfig getInputSizeshNQ4ISI = null;
    androidx.camera.video.Recorder.AudioState getOutputStallDuration = androidx.camera.video.Recorder.AudioState.INITIALIZING;
    android.net.Uri _BOUNDARY = android.net.Uri.EMPTY;
    long release = 0;
    long resetTransaction = 0;
    long AMEXKernela = 0;
    long isOutputSupportedFor = Long.MAX_VALUE;
    int getValidOutputFormatsForInputhNQ4ISI = 0;
    long toString = Long.MAX_VALUE;
    long init = Long.MAX_VALUE;
    long c = Long.MAX_VALUE;
    long isOutputSupportedForhNQ4ISI = 0;
    long getOutputSizes = 0;
    int exchange = 1;
    java.lang.Throwable startTransaction = null;
    androidx.camera.video.internal.encoder.EncodedData kernelVersion = null;
    final androidx.camera.core.internal.utils.RingBuffer<androidx.camera.video.internal.encoder.EncodedData> AMEXKernel = new androidx.camera.core.internal.utils.ArrayRingBuffer(60);
    java.lang.Throwable getOutputFormats = null;
    boolean ArtificialStackFrames = false;
    androidx.camera.video.VideoOutput.SourceState updateUI = androidx.camera.video.VideoOutput.SourceState.INACTIVE;
    java.util.concurrent.ScheduledFuture<?> AMEXKernelCallback = null;
    boolean b = false;
    private androidx.camera.video.internal.encoder.VideoEncoderConfig onExtraCallback = null;
    androidx.camera.video.VideoEncoderSession setup = null;
    double getOutputMinFrameDuration = 0.0d;
    boolean requestPINEntry = false;
    androidx.camera.video.Recorder.SetupVideoTask l = null;
    private androidx.camera.video.internal.OutputStorage IAuthTabCallback = null;
    private long TransactionOutcomeDecoderExternalSyntheticLambda0 = Long.MAX_VALUE;
    boolean unwrapAs = false;

    /* loaded from: classes6.dex */
    enum AudioState {
        INITIALIZING,
        IDLING,
        DISABLED,
        ENABLED,
        ERROR_ENCODER,
        ERROR_SOURCE
    }

    /* loaded from: classes6.dex */
    enum State {
        CONFIGURING,
        PENDING_RECORDING,
        PENDING_PAUSED,
        IDLING,
        RECORDING,
        PAUSED,
        STOPPING,
        RESETTING,
        ERROR
    }

    static {
        androidx.camera.video.QualitySelector fromOrderedList = androidx.camera.video.QualitySelector.fromOrderedList(java.util.Arrays.asList(androidx.camera.video.Quality.FHD, androidx.camera.video.Quality.HD, androidx.camera.video.Quality.SD), androidx.camera.video.FallbackStrategy.higherQualityOrLowerThan(androidx.camera.video.Quality.FHD));
        DEFAULT_QUALITY_SELECTOR = fromOrderedList;
        androidx.camera.video.VideoSpec build = androidx.camera.video.VideoSpec.builder().setQualitySelector(fromOrderedList).setAspectRatio(-1).build();
        TransactionOutcomeDecoderExternalSyntheticLambda1 = build;
        provide = androidx.camera.video.MediaSpec.builder().setOutputFormat(-1).setVideoSpec(build).build();
        getHighResolutionOutputSizeshNQ4ISI = new java.lang.RuntimeException("The video frame producer became inactive before any data was received.");
        getHighSpeedVideoFpsRangesFor = new androidx.camera.video.internal.encoder.EncoderFactory() { // from class: androidx.camera.video.Recorder$$ExternalSyntheticLambda8
            @Override // androidx.camera.video.internal.encoder.EncoderFactory
            public final androidx.camera.video.internal.encoder.Encoder createEncoder(java.util.concurrent.Executor executor, androidx.camera.video.internal.encoder.EncoderConfig encoderConfig, int i) {
                return new androidx.camera.video.internal.encoder.EncoderImpl(executor, encoderConfig, i);
            }
        };
        kernelID = androidx.camera.video.internal.encoder.VideoEncoderInfoImpl.FINDER;
        BerTlvEncoder = new androidx.camera.video.internal.muxer.MuxerFactory() { // from class: androidx.camera.video.Recorder$$ExternalSyntheticLambda9
            @Override // androidx.camera.video.internal.muxer.MuxerFactory
            public final androidx.camera.video.internal.muxer.Muxer create(int i) {
                return androidx.camera.video.Recorder.getHighResolutionOutputSizeshNQ4ISI(i);
            }
        };
        encode = new androidx.camera.video.internal.OutputStorage.Factory() { // from class: androidx.camera.video.Recorder$$ExternalSyntheticLambda10
            @Override // androidx.camera.video.internal.OutputStorage.Factory
            public final androidx.camera.video.internal.OutputStorage create(androidx.camera.video.OutputOptions outputOptions) {
                return new androidx.camera.video.internal.OutputStorageImpl(outputOptions);
            }
        };
        aid = androidx.camera.core.impl.utils.executor.CameraXExecutors.newSequentialExecutor(androidx.camera.core.impl.utils.executor.CameraXExecutors.ioExecutor());
        Camera2StreamConfigurationMap = 3;
        getHighSpeedVideoFpsRanges = 1000L;
    }

    static /* synthetic */ androidx.camera.video.internal.muxer.Muxer getHighResolutionOutputSizeshNQ4ISI(int i) {
        if (i == 0 || i == 2) {
            androidx.camera.core.Logger.d("Recorder", "Create Media3MuxerImpl");
            return new androidx.camera.video.internal.muxer.Media3MuxerImpl();
        }
        androidx.camera.core.Logger.d("Recorder", "Create MediaMuxerImpl");
        return new androidx.camera.video.internal.muxer.MediaMuxerImpl();
    }

    Recorder(java.util.concurrent.Executor executor, androidx.camera.video.MediaSpec mediaSpec, int i, androidx.camera.video.internal.encoder.EncoderFactory encoderFactory, androidx.camera.video.internal.encoder.EncoderFactory encoderFactory2, androidx.camera.video.internal.muxer.MuxerFactory muxerFactory, androidx.camera.video.internal.OutputStorage.Factory factory, long j) {
        this.onWarmupCompleted = executor;
        executor = executor == null ? androidx.camera.core.impl.utils.executor.CameraXExecutors.ioExecutor() : executor;
        this.TransactionOutcomeDecoderExternalSyntheticLambda5 = executor;
        java.util.concurrent.Executor newSequentialExecutor = androidx.camera.core.impl.utils.executor.CameraXExecutors.newSequentialExecutor(executor);
        this.requestGoOnline = newSequentialExecutor;
        androidx.camera.video.MediaSpec.Builder builder = mediaSpec.toBuilder();
        if (mediaSpec.getVideoSpec().getAspectRatio() == -1) {
            builder.configureVideo(new androidx.core.util.Consumer() { // from class: androidx.camera.video.Recorder$$ExternalSyntheticLambda11
                @Override // androidx.core.util.Consumer
                public final void accept(java.lang.Object obj) {
                    ((androidx.camera.video.VideoSpec.Builder) obj).setAspectRatio(androidx.camera.video.Recorder.TransactionOutcomeDecoderExternalSyntheticLambda1.getAspectRatio());
                }
            });
        }
        this.f2676a = androidx.camera.core.impl.MutableStateObservable.withInitialState(builder.build());
        this.getInterfaceVersion = i;
        int i2 = this.free;
        androidx.camera.video.Recorder.State state = this.rsaCipher;
        this.onNavigationEvent = androidx.camera.core.impl.MutableStateObservable.withInitialState(androidx.camera.video.StreamInfo.getHighSpeedVideoFpsRangesFor(i2, (state == androidx.camera.video.Recorder.State.RECORDING || state == androidx.camera.video.Recorder.State.STOPPING) ? androidx.camera.video.StreamInfo.StreamState.ACTIVE : androidx.camera.video.StreamInfo.StreamState.INACTIVE));
        this.TransactionOutcomeDecoderExternalSyntheticLambda6 = androidx.camera.core.impl.MutableStateObservable.withInitialState(java.lang.Boolean.FALSE);
        this.onExtraCallbackWithResult = encoderFactory;
        this.TransactionOutcomeDecoder = encoderFactory2;
        this.TransactionOutcomeDecoderExternalSyntheticLambda3 = muxerFactory;
        this.values = factory;
        this.version = new androidx.camera.video.VideoEncoderSession(encoderFactory, newSequentialExecutor, executor);
        j = j == -1 ? 52428800L : j;
        this.valueOf = j;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("mRequiredFreeStorageBytes = ");
        sb.append(androidx.camera.video.internal.utils.StorageUtil.formatSize(j));
        androidx.camera.core.Logger.d("Recorder", sb.toString());
    }

    @Override // androidx.camera.video.VideoOutput
    public final void onSurfaceRequested(androidx.camera.core.SurfaceRequest surfaceRequest) {
        onSurfaceRequested(surfaceRequest, androidx.camera.core.impl.Timebase.UPTIME, false);
    }

    @Override // androidx.camera.video.VideoOutput
    public final void onSurfaceRequested(final androidx.camera.core.SurfaceRequest surfaceRequest, final androidx.camera.core.impl.Timebase timebase, final boolean z) {
        synchronized (this.getARTIFICIAL_FRAME_PACKAGE_NAME) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Surface is requested in state: ");
            sb.append(this.rsaCipher);
            sb.append(", Current surface: ");
            sb.append(this.free);
            androidx.camera.core.Logger.d("Recorder", sb.toString());
            if (this.rsaCipher == androidx.camera.video.Recorder.State.ERROR) {
                getHighSpeedVideoSizes(androidx.camera.video.Recorder.State.CONFIGURING);
            }
        }
        this.requestGoOnline.execute(new java.lang.Runnable() { // from class: androidx.camera.video.Recorder$$ExternalSyntheticLambda16
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.video.Recorder recorder = androidx.camera.video.Recorder.this;
                androidx.camera.core.SurfaceRequest surfaceRequest2 = surfaceRequest;
                androidx.camera.core.impl.Timebase timebase2 = timebase;
                boolean z2 = z;
                androidx.camera.core.SurfaceRequest surfaceRequest3 = recorder.coroutineCreation;
                if (surfaceRequest3 != null && !surfaceRequest3.isServiced()) {
                    recorder.coroutineCreation.willNotProvideSurface();
                }
                recorder.unwrapAs = z2;
                recorder.coroutineCreation = surfaceRequest2;
                recorder.start = timebase2;
                recorder.getHighSpeedVideoFpsRanges(surfaceRequest2, timebase2, true);
            }
        });
    }

    @Override // androidx.camera.video.VideoOutput
    public final androidx.camera.core.impl.Observable<androidx.camera.video.MediaSpec> getMediaSpec() {
        return this.f2676a;
    }

    @Override // androidx.camera.video.VideoOutput
    public final androidx.camera.core.impl.Observable<androidx.camera.video.StreamInfo> getStreamInfo() {
        return this.onNavigationEvent;
    }

    @Override // androidx.camera.video.VideoOutput
    public final androidx.camera.core.impl.Observable<java.lang.Boolean> isSourceStreamRequired() {
        return this.TransactionOutcomeDecoderExternalSyntheticLambda6;
    }

    @Override // androidx.camera.video.VideoOutput
    public final void onSourceStateChanged(final androidx.camera.video.VideoOutput.SourceState sourceState) {
        this.requestGoOnline.execute(new java.lang.Runnable() { // from class: androidx.camera.video.Recorder$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                java.util.concurrent.ScheduledFuture<?> scheduledFuture;
                androidx.camera.video.internal.encoder.Encoder encoder;
                androidx.camera.video.Recorder recorder = androidx.camera.video.Recorder.this;
                androidx.camera.video.VideoOutput.SourceState sourceState2 = sourceState;
                androidx.camera.video.VideoOutput.SourceState sourceState3 = recorder.updateUI;
                recorder.updateUI = sourceState2;
                if (sourceState3 == sourceState2) {
                    androidx.camera.core.Logger.d("Recorder", "Video source transitions to the same state: ".concat(java.lang.String.valueOf(sourceState2)));
                    return;
                }
                androidx.camera.core.Logger.d("Recorder", "Video source has transitioned to state: ".concat(java.lang.String.valueOf(sourceState2)));
                if (sourceState2 != androidx.camera.video.VideoOutput.SourceState.INACTIVE) {
                    if (sourceState2 != androidx.camera.video.VideoOutput.SourceState.ACTIVE_NON_STREAMING || (scheduledFuture = recorder.AMEXKernelCallback) == null || !scheduledFuture.cancel(false) || (encoder = recorder.freeTransaction) == null) {
                        return;
                    }
                    androidx.camera.video.Recorder.getHighSpeedVideoFpsRanges(encoder);
                    return;
                }
                if (recorder.getHighSpeedVideoSizesFor == null) {
                    androidx.camera.video.Recorder.SetupVideoTask setupVideoTask = recorder.l;
                    if (setupVideoTask != null) {
                        setupVideoTask.getHighSpeedVideoFpsRangesFor();
                        recorder.l = null;
                    }
                    recorder.Camera2StreamConfigurationMap(false);
                    return;
                }
                recorder.b = true;
                androidx.camera.video.Recorder.RecordingRecord recordingRecord = recorder.CoroutineDebuggingKt;
                if (recordingRecord == null || recordingRecord.getInputSizeshNQ4ISI()) {
                    return;
                }
                recorder.Camera2StreamConfigurationMap(recorder.CoroutineDebuggingKt, 4, null);
            }
        });
    }

    @Override // androidx.camera.video.VideoOutput
    public final androidx.camera.video.VideoCapabilities getMediaCapabilities(androidx.camera.core.CameraInfo cameraInfo, int i) {
        return getHighSpeedVideoFpsRanges(i == 1 ? 2 : 1, cameraInfo, this.getInterfaceVersion, ((androidx.camera.video.MediaSpec) Camera2StreamConfigurationMap(this.f2676a)).getVideoSpec().getMimeType());
    }

    public final androidx.camera.video.QualitySelector getQualitySelector() {
        return ((androidx.camera.video.MediaSpec) Camera2StreamConfigurationMap(this.f2676a)).getVideoSpec().getQualitySelector();
    }

    @Override // androidx.camera.video.VideoOutput
    public final boolean isQualitySelectorDefault() {
        return getQualitySelector() == DEFAULT_QUALITY_SELECTOR;
    }

    public final int getVideoCapabilitiesSource() {
        return this.getInterfaceVersion;
    }

    public final int getAudioSource() {
        return ((androidx.camera.video.MediaSpec) Camera2StreamConfigurationMap(this.f2676a)).getAudioSpec().getSource();
    }

    public final java.util.concurrent.Executor getExecutor() {
        return this.onWarmupCompleted;
    }

    public final int getTargetVideoEncodingBitRate() {
        return ((androidx.camera.video.MediaSpec) Camera2StreamConfigurationMap(this.f2676a)).getVideoSpec().getBitrate();
    }

    public final androidx.camera.core.impl.Observable<android.util.Range<java.lang.Integer>> getVideoEncoderBitrateRange() {
        return this.sha1;
    }

    public final int getVideoEncodingFrameRate() {
        return ((androidx.camera.video.MediaSpec) Camera2StreamConfigurationMap(this.f2676a)).getVideoSpec().getEncodeFrameRate();
    }

    public final void setVideoEncodingFrameRate(final int i) {
        androidx.core.util.Preconditions.checkArgument(i > 0, "frameRate must be greater than 0.");
        androidx.camera.core.impl.MutableStateObservable<androidx.camera.video.MediaSpec> mutableStateObservable = this.f2676a;
        mutableStateObservable.setState(((androidx.camera.video.MediaSpec) Camera2StreamConfigurationMap(mutableStateObservable)).toBuilder().configureVideo(new androidx.core.util.Consumer() { // from class: androidx.camera.video.Recorder$$ExternalSyntheticLambda4
            @Override // androidx.core.util.Consumer
            public final void accept(java.lang.Object obj) {
                ((androidx.camera.video.VideoSpec.Builder) obj).setEncodeFrameRate(i);
            }
        }).build());
    }

    public final int getAspectRatio() {
        return ((androidx.camera.video.MediaSpec) Camera2StreamConfigurationMap(this.f2676a)).getVideoSpec().getAspectRatio();
    }

    final androidx.camera.video.Recording getHighSpeedVideoFpsRangesFor(androidx.camera.video.PendingRecording pendingRecording) {
        long j;
        int i;
        androidx.camera.video.Recorder.RecordingRecord recordingRecord;
        final androidx.camera.video.Recorder.RecordingRecord highSpeedVideoFpsRangesFor;
        final android.content.Context camera2StreamConfigurationMap;
        final androidx.camera.video.internal.muxer.MuxerFactory muxerFactory;
        androidx.core.util.Consumer<android.net.Uri> consumer;
        androidx.camera.video.Recorder.RecordingRecord recordingRecord2;
        androidx.core.util.Preconditions.checkNotNull(pendingRecording, "The given PendingRecording cannot be null.");
        synchronized (this.getARTIFICIAL_FRAME_PACKAGE_NAME) {
            j = this.TransactionOutcomeDecoderExternalSyntheticLambda4 + 1;
            this.TransactionOutcomeDecoderExternalSyntheticLambda4 = j;
            i = 0;
            recordingRecord = null;
            switch (this.rsaCipher) {
                case CONFIGURING:
                case IDLING:
                case STOPPING:
                case RESETTING:
                case ERROR:
                    if (this.rsaCipher == androidx.camera.video.Recorder.State.IDLING) {
                        androidx.core.util.Preconditions.checkState(this.getHighSpeedVideoSizes == null && this.d == null, "Expected recorder to be idle but a recording is either pending or in progress.");
                    }
                    try {
                        highSpeedVideoFpsRangesFor = androidx.camera.video.Recorder.RecordingRecord.getHighSpeedVideoFpsRangesFor(pendingRecording, j);
                        camera2StreamConfigurationMap = pendingRecording.getCamera2StreamConfigurationMap();
                        muxerFactory = this.TransactionOutcomeDecoderExternalSyntheticLambda3;
                    } catch (java.io.IOException e) {
                        e = e;
                        i = 5;
                    }
                    if (highSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges.getAndSet(true)) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Recording ");
                        sb.append(highSpeedVideoFpsRangesFor);
                        sb.append(" has already been initialized");
                        throw new java.lang.AssertionError(sb.toString());
                    }
                    final androidx.camera.video.OutputOptions Camera2StreamConfigurationMap2 = highSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap();
                    final android.os.ParcelFileDescriptor dup = Camera2StreamConfigurationMap2 instanceof androidx.camera.video.FileDescriptorOutputOptions ? ((androidx.camera.video.FileDescriptorOutputOptions) Camera2StreamConfigurationMap2).getParcelFileDescriptor().dup() : null;
                    highSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap.open("finalizeRecording");
                    highSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI.set(new androidx.camera.video.Recorder.RecordingRecord.MuxerSupplier() { // from class: androidx.camera.video.Recorder$RecordingRecord$$ExternalSyntheticLambda3
                        @Override // androidx.camera.video.Recorder.RecordingRecord.MuxerSupplier
                        public final androidx.camera.video.internal.muxer.Muxer get(int i2, androidx.core.util.Consumer consumer2) {
                            return androidx.camera.video.Recorder.RecordingRecord.getHighSpeedVideoFpsRangesFor(muxerFactory, Camera2StreamConfigurationMap2, dup, i2, consumer2);
                        }
                    });
                    if (highSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI()) {
                        highSpeedVideoFpsRangesFor.getHighSpeedVideoSizes.set(androidx.camera.video.Recorder.RecordingRecord.getHighResolutionOutputSizeshNQ4ISI(camera2StreamConfigurationMap));
                    }
                    if (Camera2StreamConfigurationMap2 instanceof androidx.camera.video.MediaStoreOutputOptions) {
                        final androidx.camera.video.MediaStoreOutputOptions mediaStoreOutputOptions = (androidx.camera.video.MediaStoreOutputOptions) Camera2StreamConfigurationMap2;
                        if (android.os.Build.VERSION.SDK_INT >= 29) {
                            consumer = new androidx.core.util.Consumer() { // from class: androidx.camera.video.Recorder$RecordingRecord$$ExternalSyntheticLambda4
                                @Override // androidx.core.util.Consumer
                                public final void accept(java.lang.Object obj) {
                                    androidx.camera.video.Recorder.RecordingRecord.getHighResolutionOutputSizeshNQ4ISI(androidx.camera.video.MediaStoreOutputOptions.this, (android.net.Uri) obj);
                                }
                            };
                        } else {
                            consumer = new androidx.core.util.Consumer() { // from class: androidx.camera.video.Recorder$RecordingRecord$$ExternalSyntheticLambda5
                                @Override // androidx.core.util.Consumer
                                public final void accept(java.lang.Object obj) {
                                    androidx.camera.video.Recorder.RecordingRecord.getHighSpeedVideoFpsRanges(androidx.camera.video.MediaStoreOutputOptions.this, camera2StreamConfigurationMap, (android.net.Uri) obj);
                                }
                            };
                        }
                    } else {
                        consumer = null;
                    }
                    if (consumer != null) {
                        highSpeedVideoFpsRangesFor.getHighSpeedVideoSizesFor.set(consumer);
                    }
                    this.d = highSpeedVideoFpsRangesFor;
                    if (this.rsaCipher == androidx.camera.video.Recorder.State.IDLING) {
                        getHighSpeedVideoSizes(androidx.camera.video.Recorder.State.PENDING_RECORDING);
                        this.requestGoOnline.execute(new java.lang.Runnable() { // from class: androidx.camera.video.Recorder$$ExternalSyntheticLambda12
                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean z;
                                int i2;
                                androidx.camera.video.Recorder.RecordingRecord recordingRecord3;
                                androidx.camera.video.Recorder.RecordingRecord highSpeedVideoFpsRangesFor2;
                                androidx.camera.video.Recorder.RecordingRecord recordingRecord4;
                                java.lang.Exception exc;
                                androidx.camera.video.Recorder recorder = androidx.camera.video.Recorder.this;
                                synchronized (recorder.getARTIFICIAL_FRAME_PACKAGE_NAME) {
                                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("tryServicePendingRecording on state: ");
                                    sb2.append(recorder.rsaCipher);
                                    androidx.camera.core.Logger.d("Recorder", sb2.toString());
                                    int ordinal = recorder.rsaCipher.ordinal();
                                    z = true;
                                    i2 = 0;
                                    recordingRecord3 = null;
                                    if (ordinal == 1) {
                                        z = false;
                                    } else if (ordinal != 2) {
                                        z = false;
                                        highSpeedVideoFpsRangesFor2 = null;
                                        exc = null;
                                        recordingRecord3 = highSpeedVideoFpsRangesFor2;
                                        recordingRecord4 = null;
                                    }
                                    if (recorder.updateUI == androidx.camera.video.VideoOutput.SourceState.INACTIVE) {
                                        recordingRecord4 = recorder.d;
                                        recorder.d = null;
                                        recorder.getHighSpeedVideoFpsRanges();
                                        exc = androidx.camera.video.Recorder.getHighResolutionOutputSizeshNQ4ISI;
                                        i2 = 4;
                                    } else {
                                        if (recorder.getHighSpeedVideoSizes == null && !recorder.b) {
                                            if (recorder.freeTransaction != null) {
                                                highSpeedVideoFpsRangesFor2 = recorder.getHighSpeedVideoFpsRangesFor(recorder.rsaCipher);
                                                exc = null;
                                                recordingRecord3 = highSpeedVideoFpsRangesFor2;
                                                recordingRecord4 = null;
                                            }
                                            highSpeedVideoFpsRangesFor2 = null;
                                            exc = null;
                                            recordingRecord3 = highSpeedVideoFpsRangesFor2;
                                            recordingRecord4 = null;
                                        }
                                        java.lang.StringBuilder sb3 = new java.lang.StringBuilder("PendingRecording is not handled, active recording = ");
                                        sb3.append(recorder.getHighSpeedVideoSizes);
                                        sb3.append(", need reset flag = ");
                                        sb3.append(recorder.b);
                                        androidx.camera.core.Logger.w("Recorder", sb3.toString());
                                        highSpeedVideoFpsRangesFor2 = null;
                                        exc = null;
                                        recordingRecord3 = highSpeedVideoFpsRangesFor2;
                                        recordingRecord4 = null;
                                    }
                                }
                                if (recordingRecord3 == null) {
                                    if (recordingRecord4 != null) {
                                        recorder.getHighSpeedVideoFpsRangesFor(recordingRecord4, i2, exc);
                                    }
                                } else {
                                    recorder.getHighResolutionOutputSizeshNQ4ISI(recordingRecord3);
                                    if (z) {
                                        recorder.Camera2StreamConfigurationMap(recordingRecord3);
                                    }
                                }
                            }
                        });
                    } else if (this.rsaCipher == androidx.camera.video.Recorder.State.ERROR) {
                        getHighSpeedVideoSizes(androidx.camera.video.Recorder.State.PENDING_RECORDING);
                        this.requestGoOnline.execute(new java.lang.Runnable() { // from class: androidx.camera.video.Recorder$$ExternalSyntheticLambda13
                            @Override // java.lang.Runnable
                            public final void run() {
                                androidx.camera.video.Recorder recorder = androidx.camera.video.Recorder.this;
                                androidx.camera.core.SurfaceRequest surfaceRequest = recorder.coroutineCreation;
                                if (surfaceRequest == null) {
                                    throw new java.lang.AssertionError("surface request is required to retry initialization.");
                                }
                                recorder.getHighSpeedVideoFpsRanges(surfaceRequest, recorder.start, false);
                            }
                        });
                    } else {
                        getHighSpeedVideoSizes(androidx.camera.video.Recorder.State.PENDING_RECORDING);
                    }
                    e = null;
                    break;
                    break;
                case PENDING_RECORDING:
                case PENDING_PAUSED:
                    recordingRecord2 = (androidx.camera.video.Recorder.RecordingRecord) androidx.core.util.Preconditions.checkNotNull(this.d);
                    recordingRecord = recordingRecord2;
                    e = null;
                    break;
                case RECORDING:
                case PAUSED:
                    recordingRecord2 = this.getHighSpeedVideoSizes;
                    recordingRecord = recordingRecord2;
                    e = null;
                    break;
                default:
                    e = null;
                    break;
            }
        }
        if (recordingRecord != null) {
            throw new java.lang.IllegalStateException("A recording is already in progress. Previous recordings must be stopped before a new recording can be started.");
        }
        if (i != 0) {
            androidx.camera.core.Logger.e("Recorder", "Recording was started when the Recorder had encountered error ".concat(java.lang.String.valueOf(e)));
            getHighSpeedVideoFpsRangesFor(androidx.camera.video.Recorder.RecordingRecord.getHighSpeedVideoFpsRangesFor(pendingRecording, j), i, e);
            return androidx.camera.video.Recording.getHighResolutionOutputSizeshNQ4ISI(pendingRecording, j);
        }
        return androidx.camera.video.Recording.getHighSpeedVideoFpsRanges(pendingRecording, j);
    }

    final void getHighSpeedVideoFpsRangesFor(androidx.camera.video.Recorder.RecordingRecord recordingRecord, int i, java.lang.Throwable th) {
        android.net.Uri uri = android.net.Uri.EMPTY;
        if (recordingRecord.getHighSpeedVideoFpsRanges.get()) {
            recordingRecord.Camera2StreamConfigurationMap(recordingRecord.getHighSpeedVideoSizesFor.getAndSet(null), uri);
        }
        recordingRecord.getHighSpeedVideoFpsRanges(androidx.camera.video.VideoRecordEvent.getHighResolutionOutputSizeshNQ4ISI(recordingRecord.Camera2StreamConfigurationMap(), androidx.camera.video.RecordingStats.getHighResolutionOutputSizeshNQ4ISI(0L, 0L, androidx.camera.video.AudioStats.getHighSpeedVideoFpsRangesFor(1, this.getOutputFormats, 0.0d, 0L)), androidx.camera.video.OutputResults.getHighResolutionOutputSizeshNQ4ISI(android.net.Uri.EMPTY), i, th), true);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    final void Camera2StreamConfigurationMap(boolean z) {
        boolean z2;
        boolean z3;
        synchronized (this.getARTIFICIAL_FRAME_PACKAGE_NAME) {
            z2 = true;
            z3 = false;
            switch (this.rsaCipher) {
                case CONFIGURING:
                case IDLING:
                case ERROR:
                    break;
                case PENDING_RECORDING:
                case PENDING_PAUSED:
                    Camera2StreamConfigurationMap(androidx.camera.video.Recorder.State.RESETTING);
                    break;
                case RECORDING:
                case PAUSED:
                    boolean z4 = this.CoroutineDebuggingKt != null;
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("In-progress recording shouldn't be null when in state ");
                    sb.append(this.rsaCipher);
                    androidx.core.util.Preconditions.checkState(z4, sb.toString());
                    androidx.camera.video.Recorder.RecordingRecord recordingRecord = this.getHighSpeedVideoSizes;
                    androidx.camera.video.Recorder.RecordingRecord recordingRecord2 = this.CoroutineDebuggingKt;
                    if (recordingRecord != recordingRecord2) {
                        throw new java.lang.AssertionError("In-progress recording does not match the active recording. Unable to reset encoder.");
                    }
                    if (recordingRecord2 == null || !recordingRecord2.getInputSizeshNQ4ISI()) {
                        getHighSpeedVideoSizes(androidx.camera.video.Recorder.State.RESETTING);
                        z3 = true;
                        z2 = false;
                    }
                    break;
                    break;
                case STOPPING:
                    getHighSpeedVideoSizes(androidx.camera.video.Recorder.State.RESETTING);
                    z2 = false;
                    break;
                case RESETTING:
                default:
                    z2 = false;
                    break;
            }
        }
        if (!z2) {
            if (z3) {
                Camera2StreamConfigurationMap(this.CoroutineDebuggingKt, -1L, 4, null);
            }
        } else {
            if (!z) {
                getOutputStallDuration();
                return;
            }
            if (this.freeTransaction != null) {
                androidx.camera.core.Logger.d("Recorder", "Releasing video encoder.");
                getOutputStallDurationlomOqCM();
            }
            getInputSizeshNQ4ISI();
        }
    }

    void getHighSpeedVideoFpsRanges(androidx.camera.core.SurfaceRequest surfaceRequest, androidx.camera.core.impl.Timebase timebase, boolean z) {
        if (surfaceRequest.isServiced()) {
            androidx.camera.core.Logger.w("Recorder", "Ignore the SurfaceRequest since it is already served.");
            return;
        }
        surfaceRequest.setTransformationInfoListener(this.requestGoOnline, new androidx.camera.core.SurfaceRequest.TransformationInfoListener() { // from class: androidx.camera.video.Recorder$$ExternalSyntheticLambda15
            @Override // androidx.camera.core.SurfaceRequest.TransformationInfoListener
            public final void onTransformationInfoUpdate(androidx.camera.core.SurfaceRequest.TransformationInfo transformationInfo) {
                androidx.camera.video.Recorder.this.AMEXKernelJNI = transformationInfo;
            }
        });
        this.TransactionOutcomeDecoderExternalSyntheticLambda7 = getEncoderProfilesResolver(surfaceRequest.getCamera().getCameraInfo(), surfaceRequest.getSessionType()).findNearestHigherSupportedEncoderProfilesFor(surfaceRequest.getResolution(), surfaceRequest.getDynamicRange());
        java.lang.StringBuilder sb = new java.lang.StringBuilder("mResolvedEncoderProfiles = ");
        sb.append(this.TransactionOutcomeDecoderExternalSyntheticLambda7);
        androidx.camera.core.Logger.d("Recorder", sb.toString());
        androidx.camera.video.Recorder.SetupVideoTask setupVideoTask = this.l;
        if (setupVideoTask != null) {
            setupVideoTask.getHighSpeedVideoFpsRangesFor();
        }
        androidx.camera.video.Recorder.SetupVideoTask setupVideoTask2 = new androidx.camera.video.Recorder.SetupVideoTask(surfaceRequest, timebase, this.unwrapAs, z ? Camera2StreamConfigurationMap : 0);
        this.l = setupVideoTask2;
        androidx.camera.video.Recorder.this.getOutputSizeshNQ4ISI().addListener(new androidx.camera.video.Recorder$SetupVideoTask$$ExternalSyntheticLambda0(setupVideoTask2, setupVideoTask2.Camera2StreamConfigurationMap, setupVideoTask2.getHighSpeedVideoSizes), androidx.camera.video.Recorder.this.requestGoOnline);
    }

    /* loaded from: classes6.dex */
    class SetupVideoTask {
        final androidx.camera.core.SurfaceRequest Camera2StreamConfigurationMap;
        private final int getHighSpeedVideoFpsRanges;
        final androidx.camera.core.impl.Timebase getHighSpeedVideoSizes;
        private boolean getHighSpeedVideoFpsRangesFor = false;
        private int getInputFormats = 0;
        private java.util.concurrent.ScheduledFuture<?> getOutputFormats = null;

        static /* synthetic */ int getHighSpeedVideoFpsRanges(androidx.camera.video.Recorder.SetupVideoTask setupVideoTask) {
            int i = setupVideoTask.getInputFormats;
            setupVideoTask.getInputFormats = i + 1;
            return i;
        }

        SetupVideoTask(androidx.camera.core.SurfaceRequest surfaceRequest, androidx.camera.core.impl.Timebase timebase, boolean z, int i) {
            this.Camera2StreamConfigurationMap = surfaceRequest;
            this.getHighSpeedVideoSizes = timebase;
            androidx.camera.video.Recorder.this.unwrapAs = z;
            this.getHighSpeedVideoFpsRanges = i;
        }

        final void getHighSpeedVideoFpsRangesFor() {
            if (this.getHighSpeedVideoFpsRangesFor) {
                return;
            }
            this.getHighSpeedVideoFpsRangesFor = true;
            java.util.concurrent.ScheduledFuture<?> scheduledFuture = this.getOutputFormats;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                this.getOutputFormats = null;
            }
        }

        /* renamed from: androidx.camera.video.Recorder$SetupVideoTask$1, reason: invalid class name */
        class AnonymousClass1 implements androidx.camera.core.impl.utils.futures.FutureCallback<androidx.camera.video.internal.encoder.Encoder> {
            final /* synthetic */ androidx.camera.video.VideoEncoderSession getHighSpeedVideoSizes;

            AnonymousClass1(androidx.camera.video.VideoEncoderSession videoEncoderSession) {
                this.getHighSpeedVideoSizes = videoEncoderSession;
            }

            /* JADX WARN: Removed duplicated region for block: B:58:0x00d2  */
            /* JADX WARN: Removed duplicated region for block: B:59:0x00d3 A[Catch: all -> 0x0138, TryCatch #0 {, blocks: (B:15:0x0081, B:16:0x0087, B:41:0x008c, B:42:0x0095, B:43:0x009c, B:45:0x00a0, B:47:0x00a4, B:50:0x00ad, B:53:0x00b5, B:54:0x00ca, B:56:0x00ce, B:59:0x00d3, B:61:0x00d9, B:62:0x00e5, B:64:0x00f1), top: B:14:0x0081 }] */
            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public /* synthetic */ void onSuccess(androidx.camera.video.internal.encoder.Encoder encoder) {
                boolean z;
                int i;
                boolean z2;
                java.lang.Exception exc;
                androidx.camera.video.Recorder.RecordingRecord recordingRecord;
                androidx.camera.video.internal.encoder.Encoder encoder2 = encoder;
                androidx.camera.core.Logger.d("Recorder", "VideoEncoder is created. ".concat(java.lang.String.valueOf(encoder2)));
                if (encoder2 != null) {
                    androidx.core.util.Preconditions.checkState(androidx.camera.video.Recorder.this.version == this.getHighSpeedVideoSizes);
                    androidx.core.util.Preconditions.checkState(androidx.camera.video.Recorder.this.freeTransaction == null);
                    final androidx.camera.video.Recorder recorder = androidx.camera.video.Recorder.this;
                    final androidx.camera.video.VideoEncoderSession videoEncoderSession = this.getHighSpeedVideoSizes;
                    androidx.camera.video.internal.encoder.Encoder encoder3 = (androidx.camera.video.internal.encoder.Encoder) androidx.core.util.Preconditions.checkNotNull(videoEncoderSession.getHighSpeedVideoSizesFor);
                    recorder.freeTransaction = encoder3;
                    recorder.sha1.setState(((androidx.camera.video.internal.encoder.VideoEncoderInfo) encoder3.getEncoderInfo()).getSupportedBitrateRange());
                    recorder.getValidOutputFormatsForInputhNQ4ISI = recorder.freeTransaction.getConfiguredBitrate();
                    androidx.camera.video.Recorder.RecordingRecord recordingRecord2 = null;
                    android.view.Surface surface = videoEncoderSession.getInputFormats != androidx.camera.video.VideoEncoderSession.VideoEncoderState.READY ? null : videoEncoderSession.Camera2StreamConfigurationMap;
                    recorder.getHighSpeedVideoSizesFor = surface;
                    recorder.getHighSpeedVideoFpsRangesFor(surface);
                    androidx.camera.core.impl.utils.futures.Futures.addCallback(androidx.camera.core.impl.utils.futures.Futures.nonCancellationPropagating(videoEncoderSession.getHighSpeedVideoFpsRangesFor), new androidx.camera.core.impl.utils.futures.FutureCallback<androidx.camera.video.internal.encoder.Encoder>() { // from class: androidx.camera.video.Recorder.1
                        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
                        public /* synthetic */ void onSuccess(androidx.camera.video.internal.encoder.Encoder encoder4) {
                            androidx.camera.video.internal.encoder.Encoder encoder5 = encoder4;
                            androidx.camera.core.Logger.d("Recorder", "VideoEncoder can be released: ".concat(java.lang.String.valueOf(encoder5)));
                            if (encoder5 != null) {
                                boolean z3 = false;
                                if (androidx.camera.video.Recorder.this.AMEXKernelCallback != null && androidx.camera.video.Recorder.this.AMEXKernelCallback.cancel(false) && androidx.camera.video.Recorder.this.freeTransaction != null && androidx.camera.video.Recorder.this.freeTransaction == encoder5) {
                                    androidx.camera.video.Recorder.getHighSpeedVideoFpsRanges(androidx.camera.video.Recorder.this.freeTransaction);
                                }
                                androidx.camera.video.Recorder.this.setup = videoEncoderSession;
                                androidx.camera.video.Recorder.this.getHighSpeedVideoFpsRangesFor((android.view.Surface) null);
                                androidx.camera.video.Recorder recorder2 = androidx.camera.video.Recorder.this;
                                androidx.camera.video.Recorder.RecordingRecord recordingRecord3 = recorder2.CoroutineDebuggingKt;
                                if (recordingRecord3 != null && recordingRecord3.getInputSizeshNQ4ISI()) {
                                    z3 = true;
                                }
                                recorder2.Camera2StreamConfigurationMap(z3);
                            }
                        }

                        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
                        public void onFailure(java.lang.Throwable th) {
                            androidx.camera.core.Logger.d("Recorder", "Error in ReadyToReleaseFuture: ".concat(java.lang.String.valueOf(th)));
                        }
                    }, recorder.requestGoOnline);
                    androidx.camera.video.Recorder recorder2 = androidx.camera.video.Recorder.this;
                    synchronized (recorder2.getARTIFICIAL_FRAME_PACKAGE_NAME) {
                        switch (recorder2.rsaCipher) {
                            case CONFIGURING:
                                recorder2.getHighSpeedVideoSizes(androidx.camera.video.Recorder.State.IDLING);
                                z = false;
                                i = 0;
                                z2 = false;
                                recordingRecord = null;
                                exc = null;
                                break;
                            case PENDING_RECORDING:
                                z = false;
                                if (recorder2.getHighSpeedVideoSizes == null) {
                                    i = 0;
                                    z2 = false;
                                    recordingRecord = null;
                                    exc = null;
                                    break;
                                } else if (recorder2.updateUI == androidx.camera.video.VideoOutput.SourceState.INACTIVE) {
                                    recordingRecord = recorder2.d;
                                    recorder2.d = null;
                                    recorder2.getHighSpeedVideoFpsRanges();
                                    exc = androidx.camera.video.Recorder.getHighResolutionOutputSizeshNQ4ISI;
                                    i = 4;
                                    z2 = false;
                                } else {
                                    i = 0;
                                    z2 = false;
                                    exc = null;
                                    recordingRecord2 = recorder2.getHighSpeedVideoFpsRangesFor(recorder2.rsaCipher);
                                    recordingRecord = null;
                                }
                            case PENDING_PAUSED:
                                z = true;
                                if (recorder2.getHighSpeedVideoSizes == null) {
                                }
                                break;
                            case IDLING:
                            case RESETTING:
                                java.lang.StringBuilder sb = new java.lang.StringBuilder("Incorrectly invoke onConfigured() in state ");
                                sb.append(recorder2.rsaCipher);
                                throw new java.lang.AssertionError(sb.toString());
                            case RECORDING:
                                z = false;
                                androidx.camera.video.Recorder.RecordingRecord recordingRecord3 = recorder2.CoroutineDebuggingKt;
                                androidx.core.util.Preconditions.checkState(recordingRecord3 == null && recordingRecord3.getInputSizeshNQ4ISI(), "Unexpectedly invoke onConfigured() when there's a non-persistent in-progress recording");
                                z2 = true;
                                i = 0;
                                recordingRecord = null;
                                exc = null;
                                break;
                            case PAUSED:
                                z = true;
                                androidx.camera.video.Recorder.RecordingRecord recordingRecord32 = recorder2.CoroutineDebuggingKt;
                                if (recordingRecord32 == null) {
                                    break;
                                }
                                androidx.core.util.Preconditions.checkState(recordingRecord32 == null && recordingRecord32.getInputSizeshNQ4ISI(), "Unexpectedly invoke onConfigured() when there's a non-persistent in-progress recording");
                                z2 = true;
                                i = 0;
                                recordingRecord = null;
                                exc = null;
                                break;
                            case STOPPING:
                                throw new java.lang.AssertionError("Unexpectedly invoke onConfigured() in a STOPPING state when it's not waiting for a new surface.");
                            case ERROR:
                                androidx.camera.core.Logger.e("Recorder", "onConfigured() was invoked when the Recorder had encountered error");
                                z = false;
                                i = 0;
                                z2 = false;
                                recordingRecord = null;
                                exc = null;
                                break;
                            default:
                                z = false;
                                i = 0;
                                z2 = false;
                                recordingRecord = null;
                                exc = null;
                                break;
                        }
                    }
                    if (z2) {
                        recorder2.getHighResolutionOutputSizeshNQ4ISI(recorder2.CoroutineDebuggingKt, true);
                        recorder2.freeTransaction.start();
                        if (recorder2.requestPINEntry) {
                            androidx.camera.video.Recorder.RecordingRecord recordingRecord4 = recorder2.CoroutineDebuggingKt;
                            recordingRecord4.getHighSpeedVideoFpsRanges(androidx.camera.video.VideoRecordEvent.getHighSpeedVideoFpsRanges(recordingRecord4.Camera2StreamConfigurationMap(), recorder2.getInputFormats()), true);
                            recorder2.requestPINEntry = false;
                        }
                        if (z) {
                            recorder2.freeTransaction.pause();
                            return;
                        }
                        return;
                    }
                    if (recordingRecord2 == null) {
                        if (recordingRecord != null) {
                            recorder2.getHighSpeedVideoFpsRangesFor(recordingRecord, i, exc);
                        }
                    } else {
                        recorder2.getHighResolutionOutputSizeshNQ4ISI(recordingRecord2);
                        if (z) {
                            recorder2.Camera2StreamConfigurationMap(recordingRecord2);
                        }
                    }
                }
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onFailure(java.lang.Throwable th) {
                androidx.camera.video.Recorder.RecordingRecord recordingRecord;
                androidx.camera.core.Logger.w("Recorder", "VideoEncoder Setup error: ".concat(java.lang.String.valueOf(th)), th);
                if (androidx.camera.video.Recorder.SetupVideoTask.this.getInputFormats < androidx.camera.video.Recorder.SetupVideoTask.this.getHighSpeedVideoFpsRanges) {
                    androidx.camera.video.Recorder.SetupVideoTask.getHighSpeedVideoFpsRanges(androidx.camera.video.Recorder.SetupVideoTask.this);
                    androidx.camera.video.Recorder.SetupVideoTask.this.getOutputFormats = androidx.camera.video.Recorder.getHighSpeedVideoSizes(new java.lang.Runnable() { // from class: androidx.camera.video.Recorder$SetupVideoTask$1$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean z;
                            androidx.camera.core.SurfaceRequest surfaceRequest;
                            androidx.camera.core.impl.Timebase timebase;
                            androidx.camera.video.Recorder.SetupVideoTask.AnonymousClass1 anonymousClass1 = androidx.camera.video.Recorder.SetupVideoTask.AnonymousClass1.this;
                            z = androidx.camera.video.Recorder.SetupVideoTask.this.getHighSpeedVideoFpsRangesFor;
                            if (z) {
                                return;
                            }
                            java.lang.StringBuilder sb = new java.lang.StringBuilder("Retry setupVideo #");
                            sb.append(androidx.camera.video.Recorder.SetupVideoTask.this.getInputFormats);
                            androidx.camera.core.Logger.d("Recorder", sb.toString());
                            androidx.camera.video.Recorder.SetupVideoTask setupVideoTask = androidx.camera.video.Recorder.SetupVideoTask.this;
                            surfaceRequest = setupVideoTask.Camera2StreamConfigurationMap;
                            timebase = androidx.camera.video.Recorder.SetupVideoTask.this.getHighSpeedVideoSizes;
                            androidx.camera.video.Recorder.this.getOutputSizeshNQ4ISI().addListener(new androidx.camera.video.Recorder$SetupVideoTask$$ExternalSyntheticLambda0(setupVideoTask, surfaceRequest, timebase), androidx.camera.video.Recorder.this.requestGoOnline);
                        }
                    }, androidx.camera.video.Recorder.this.requestGoOnline, androidx.camera.video.Recorder.getHighSpeedVideoFpsRanges, java.util.concurrent.TimeUnit.MILLISECONDS);
                    return;
                }
                androidx.camera.video.Recorder recorder = androidx.camera.video.Recorder.this;
                synchronized (recorder.getARTIFICIAL_FRAME_PACKAGE_NAME) {
                    recordingRecord = null;
                    switch (recorder.rsaCipher) {
                        case PENDING_RECORDING:
                        case PENDING_PAUSED:
                            androidx.camera.video.Recorder.RecordingRecord recordingRecord2 = recorder.d;
                            recorder.d = null;
                            recordingRecord = recordingRecord2;
                        case CONFIGURING:
                            recorder.getHighSpeedVideoSizes(-1);
                            recorder.getHighSpeedVideoSizes(androidx.camera.video.Recorder.State.ERROR);
                            break;
                        case IDLING:
                        case RECORDING:
                        case PAUSED:
                        case STOPPING:
                        case RESETTING:
                            java.lang.StringBuilder sb = new java.lang.StringBuilder("Encountered encoder setup error while in unexpected state ");
                            sb.append(recorder.rsaCipher);
                            sb.append(": ");
                            sb.append(th);
                            throw new java.lang.AssertionError(sb.toString());
                    }
                }
                if (recordingRecord != null) {
                    recorder.getHighSpeedVideoFpsRangesFor(recordingRecord, 7, th);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.google.common.util.concurrent.ListenableFuture<java.lang.Void> getOutputSizeshNQ4ISI() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Try to safely release video encoder: ");
        sb.append(this.freeTransaction);
        androidx.camera.core.Logger.d("Recorder", sb.toString());
        androidx.camera.video.VideoEncoderSession videoEncoderSession = this.version;
        videoEncoderSession.getHighSpeedVideoSizes();
        return androidx.camera.core.impl.utils.futures.Futures.nonCancellationPropagating(videoEncoderSession.getHighResolutionOutputSizeshNQ4ISI);
    }

    private void getHighSpeedVideoSizesFor() {
        final androidx.camera.video.internal.audio.AudioSource audioSource = this.getOutputStallDurationlomOqCM;
        if (audioSource == null) {
            throw new java.lang.AssertionError("Cannot release null audio source.");
        }
        this.getOutputStallDurationlomOqCM = null;
        androidx.camera.core.Logger.d("Recorder", java.lang.String.format("Releasing audio source: 0x%x", java.lang.Integer.valueOf(audioSource.hashCode())));
        androidx.camera.core.impl.utils.futures.Futures.addCallback(audioSource.release(), new androidx.camera.core.impl.utils.futures.FutureCallback<java.lang.Void>() { // from class: androidx.camera.video.Recorder.2
            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public /* synthetic */ void onSuccess(java.lang.Void r2) {
                androidx.camera.core.Logger.d("Recorder", java.lang.String.format("Released audio source successfully: 0x%x", java.lang.Integer.valueOf(audioSource.hashCode())));
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onFailure(java.lang.Throwable th) {
                androidx.camera.core.Logger.d("Recorder", java.lang.String.format("An error occurred while attempting to release audio source: 0x%x", java.lang.Integer.valueOf(audioSource.hashCode())));
            }
        }, androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor());
    }

    final void getHighSpeedVideoFpsRanges(androidx.camera.video.Recorder.RecordingRecord recordingRecord) {
        androidx.camera.video.internal.muxer.Muxer highResolutionOutputSizeshNQ4ISI;
        if (this._CREATION != null) {
            throw new java.lang.AssertionError("Unable to set up muxer when one already exists.");
        }
        if (this.getOutputStallDuration == androidx.camera.video.Recorder.AudioState.ENABLED && this.AMEXKernel.isEmpty()) {
            throw new java.lang.AssertionError("Audio is enabled but no audio sample is ready. Cannot start muxer.");
        }
        androidx.camera.video.internal.encoder.EncodedData encodedData = this.kernelVersion;
        if (encodedData == null) {
            throw new java.lang.AssertionError("Muxer cannot be started without an encoded video frame.");
        }
        try {
            this.kernelVersion = null;
            long presentationTimeUs = encodedData.getPresentationTimeUs();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (!this.AMEXKernel.isEmpty()) {
                androidx.camera.video.internal.encoder.EncodedData dequeue = this.AMEXKernel.dequeue();
                if (dequeue.getPresentationTimeUs() >= presentationTimeUs) {
                    arrayList.add(dequeue);
                }
            }
            long size = encodedData.size();
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                size += ((androidx.camera.video.internal.encoder.EncodedData) it.next()).size();
            }
            long j = this.isOutputSupportedForhNQ4ISI;
            int i = 0;
            if (j != 0 && size > j) {
                androidx.camera.core.Logger.d("Recorder", java.lang.String.format("Initial data exceeds file size limit %d > %d", java.lang.Long.valueOf(size), java.lang.Long.valueOf(j)));
                Camera2StreamConfigurationMap(recordingRecord, 2, null);
                if (encodedData != null) {
                    encodedData.close();
                    return;
                }
                return;
            }
            try {
                androidx.camera.video.MediaSpec mediaSpec = (androidx.camera.video.MediaSpec) Camera2StreamConfigurationMap(this.f2676a);
                if (mediaSpec.getOutputFormat() == -1) {
                    androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy videoValidatedEncoderProfilesProxy = this.TransactionOutcomeDecoderExternalSyntheticLambda7;
                    int outputFormatToMuxerFormat = androidx.camera.video.MediaSpec.outputFormatToMuxerFormat(provide.getOutputFormat());
                    if (videoValidatedEncoderProfilesProxy != null) {
                        int recommendedFileFormat = videoValidatedEncoderProfilesProxy.getRecommendedFileFormat();
                        if (recommendedFileFormat == 1) {
                            i = 2;
                        } else if (recommendedFileFormat != 2) {
                            if (recommendedFileFormat == 9) {
                                i = 1;
                            }
                        }
                    }
                    i = outputFormatToMuxerFormat;
                } else {
                    i = androidx.camera.video.MediaSpec.outputFormatToMuxerFormat(mediaSpec.getOutputFormat());
                }
                highResolutionOutputSizeshNQ4ISI = recordingRecord.getHighResolutionOutputSizeshNQ4ISI(i, new androidx.core.util.Consumer() { // from class: androidx.camera.video.Recorder$$ExternalSyntheticLambda18
                    @Override // androidx.core.util.Consumer
                    public final void accept(java.lang.Object obj) {
                        androidx.camera.video.Recorder.this._BOUNDARY = (android.net.Uri) obj;
                    }
                });
                androidx.camera.core.SurfaceRequest.TransformationInfo transformationInfo = this.AMEXKernelJNI;
                if (transformationInfo != null) {
                    getHighSpeedVideoFpsRangesFor(transformationInfo);
                    try {
                        highResolutionOutputSizeshNQ4ISI.setOrientationDegrees(transformationInfo.getRotationDegrees());
                    } catch (java.lang.IllegalArgumentException e) {
                        highResolutionOutputSizeshNQ4ISI.release();
                        Camera2StreamConfigurationMap(recordingRecord, 5, e);
                        if (encodedData != null) {
                            encodedData.close();
                        }
                        return;
                    }
                }
                android.location.Location location = recordingRecord.Camera2StreamConfigurationMap().getLocation();
                if (location != null) {
                    try {
                        highResolutionOutputSizeshNQ4ISI.setLocation(location.getLatitude(), location.getLongitude());
                    } catch (java.lang.IllegalArgumentException e2) {
                        highResolutionOutputSizeshNQ4ISI.release();
                        Camera2StreamConfigurationMap(recordingRecord, 5, e2);
                        if (encodedData != null) {
                            encodedData.close();
                        }
                        return;
                    }
                }
                androidx.camera.video.internal.encoder.VideoEncoderConfig videoEncoderConfig = (androidx.camera.video.internal.encoder.VideoEncoderConfig) androidx.core.util.Preconditions.checkNotNull(this.onExtraCallback);
                if (videoEncoderConfig.isSlowMotion()) {
                    try {
                        highResolutionOutputSizeshNQ4ISI.setCaptureFps(videoEncoderConfig.getCaptureFrameRate());
                    } catch (java.lang.IllegalArgumentException e3) {
                        highResolutionOutputSizeshNQ4ISI.release();
                        Camera2StreamConfigurationMap(recordingRecord, 5, e3);
                        if (encodedData == null) {
                            return;
                        }
                        encodedData.close();
                    }
                }
            } catch (java.io.IOException e4) {
                Camera2StreamConfigurationMap(recordingRecord, Camera2StreamConfigurationMap(e4) ? 3 : 5, e4);
                if (encodedData == null) {
                    return;
                }
            }
            try {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append("Muxer.addTrack() for video ");
                sb.append(this.AMEXKernelProvider.getMediaFormat());
                androidx.camera.core.Logger.d("Recorder", sb.toString());
                this.newContext = java.lang.Integer.valueOf(highResolutionOutputSizeshNQ4ISI.addTrack((android.media.MediaFormat) androidx.core.util.Preconditions.checkNotNull(this.AMEXKernelProvider.getMediaFormat())));
                if (this.getOutputStallDuration == androidx.camera.video.Recorder.AudioState.ENABLED) {
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                    sb2.append("Muxer.addTrack() for audio ");
                    sb2.append(this.getInputSizeshNQ4ISI.getMediaFormat());
                    androidx.camera.core.Logger.d("Recorder", sb2.toString());
                    this.getOutputMinFrameDurationlomOqCM = java.lang.Integer.valueOf(highResolutionOutputSizeshNQ4ISI.addTrack((android.media.MediaFormat) androidx.core.util.Preconditions.checkNotNull(this.getInputSizeshNQ4ISI.getMediaFormat())));
                }
                androidx.camera.core.Logger.d("Recorder", "Muxer.start()");
                highResolutionOutputSizeshNQ4ISI.start();
                this._CREATION = highResolutionOutputSizeshNQ4ISI;
                getHighResolutionOutputSizeshNQ4ISI(encodedData, recordingRecord);
                java.util.Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    getHighSpeedVideoFpsRanges((androidx.camera.video.internal.encoder.EncodedData) it2.next(), recordingRecord);
                }
                if (encodedData != null) {
                    encodedData.close();
                }
            } catch (androidx.camera.video.internal.muxer.MuxerException e5) {
                androidx.camera.core.Logger.w("Recorder", "Failed to setup and start muxer", e5);
                highResolutionOutputSizeshNQ4ISI.release();
                Camera2StreamConfigurationMap(recordingRecord, Camera2StreamConfigurationMap(e5) ? 3 : 1, e5);
                if (encodedData != null) {
                    encodedData.close();
                }
            }
        } catch (java.lang.Throwable th) {
            if (encodedData != null) {
                try {
                    encodedData.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    final void getHighResolutionOutputSizeshNQ4ISI(androidx.camera.video.Recorder.RecordingRecord recordingRecord) {
        androidx.camera.video.Recorder.AudioState audioState;
        if (this.CoroutineDebuggingKt != null) {
            throw new java.lang.AssertionError("Attempted to start a new recording while another was in progress.");
        }
        this.CoroutineDebuggingKt = recordingRecord;
        androidx.camera.video.internal.OutputStorage create = this.values.create(recordingRecord.Camera2StreamConfigurationMap());
        this.IAuthTabCallback = create;
        long availableBytes = create.getAvailableBytes();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("availableBytes = ");
        sb.append(androidx.camera.video.internal.utils.StorageUtil.formatSize(availableBytes));
        androidx.camera.core.Logger.d("Recorder", sb.toString());
        long j = this.valueOf;
        if (availableBytes < j) {
            Camera2StreamConfigurationMap(3, new java.io.IOException(java.lang.String.format("Insufficient storage space. The available storage (%d bytes) is below the required threshold of %d bytes.", java.lang.Long.valueOf(availableBytes), java.lang.Long.valueOf(j))));
            return;
        }
        this.TransactionOutcomeDecoderExternalSyntheticLambda0 = availableBytes - j;
        if (recordingRecord.Camera2StreamConfigurationMap().getFileSizeLimit() > 0) {
            this.isOutputSupportedForhNQ4ISI = java.lang.Math.round(recordingRecord.Camera2StreamConfigurationMap().getFileSizeLimit() * 0.95d);
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("File size limit in bytes: ");
            sb2.append(this.isOutputSupportedForhNQ4ISI);
            androidx.camera.core.Logger.d("Recorder", sb2.toString());
        } else {
            this.isOutputSupportedForhNQ4ISI = 0L;
        }
        if (recordingRecord.Camera2StreamConfigurationMap().getDurationLimitMillis() > 0) {
            this.getOutputSizes = java.util.concurrent.TimeUnit.MILLISECONDS.toMicros(recordingRecord.Camera2StreamConfigurationMap().getDurationLimitMillis());
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Duration limit in microseconds: ");
            sb3.append(this.getOutputSizes);
            androidx.camera.core.Logger.d("Recorder", sb3.toString());
        } else {
            this.getOutputSizes = 0L;
        }
        int ordinal = this.getOutputStallDuration.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                getHighResolutionOutputSizeshNQ4ISI(recordingRecord.getHighResolutionOutputSizeshNQ4ISI() ? androidx.camera.video.Recorder.AudioState.ENABLED : androidx.camera.video.Recorder.AudioState.DISABLED);
            } else if (ordinal == 2 || ordinal == 3 || ordinal == 4 || ordinal == 5) {
                java.lang.StringBuilder sb4 = new java.lang.StringBuilder("Incorrectly invoke startInternal in audio state ");
                sb4.append(this.getOutputStallDuration);
                throw new java.lang.AssertionError(sb4.toString());
            }
        } else if (recordingRecord.getHighResolutionOutputSizeshNQ4ISI()) {
            if (((androidx.camera.video.MediaSpec) Camera2StreamConfigurationMap(this.f2676a)).getAudioSpec().getChannelCount() == 0) {
                throw new java.lang.AssertionError("The Recorder doesn't support recording with audio");
            }
            try {
                if (!this.CoroutineDebuggingKt.getInputSizeshNQ4ISI() || this.getInputFormats == null) {
                    androidx.camera.video.MediaSpec mediaSpec = (androidx.camera.video.MediaSpec) Camera2StreamConfigurationMap(this.f2676a);
                    androidx.camera.video.internal.config.AudioMimeInfo resolveAudioMimeInfo = androidx.camera.video.internal.config.AudioConfigUtil.resolveAudioMimeInfo(mediaSpec, this.TransactionOutcomeDecoderExternalSyntheticLambda7);
                    androidx.camera.core.impl.Timebase timebase = androidx.camera.core.impl.Timebase.UPTIME;
                    androidx.camera.video.internal.encoder.VideoEncoderConfig videoEncoderConfig = (androidx.camera.video.internal.encoder.VideoEncoderConfig) androidx.core.util.Preconditions.checkNotNull(this.onExtraCallback);
                    androidx.camera.video.internal.audio.AudioSettings resolveAudioSettings = androidx.camera.video.internal.config.AudioConfigUtil.resolveAudioSettings(resolveAudioMimeInfo, mediaSpec.getAudioSpec(), videoEncoderConfig.isSlowMotion() ? new android.util.Rational(videoEncoderConfig.getCaptureFrameRate(), videoEncoderConfig.getEncodeFrameRate()) : null);
                    if (this.getOutputStallDurationlomOqCM != null) {
                        getHighSpeedVideoSizesFor();
                    }
                    if (!recordingRecord.getHighResolutionOutputSizeshNQ4ISI()) {
                        throw new java.lang.AssertionError("Recording does not have audio enabled. Unable to create audio source for recording ".concat(java.lang.String.valueOf(recordingRecord)));
                    }
                    androidx.camera.video.Recorder.RecordingRecord.AudioSourceSupplier andSet = recordingRecord.getHighSpeedVideoSizes.getAndSet(null);
                    if (andSet == null) {
                        throw new java.lang.AssertionError("One-time audio source creation has already occurred for recording ".concat(java.lang.String.valueOf(recordingRecord)));
                    }
                    androidx.camera.video.internal.audio.AudioSource highSpeedVideoSizes = andSet.getHighSpeedVideoSizes(resolveAudioSettings, aid);
                    this.getOutputStallDurationlomOqCM = highSpeedVideoSizes;
                    androidx.camera.core.Logger.d("Recorder", java.lang.String.format("Set up new audio source: 0x%x", java.lang.Integer.valueOf(highSpeedVideoSizes.hashCode())));
                    androidx.camera.video.internal.encoder.Encoder createEncoder = this.TransactionOutcomeDecoder.createEncoder(this.TransactionOutcomeDecoderExternalSyntheticLambda5, androidx.camera.video.internal.config.AudioConfigUtil.resolveAudioEncoderConfig(resolveAudioMimeInfo, timebase, resolveAudioSettings, mediaSpec.getAudioSpec()), ((androidx.camera.core.SurfaceRequest) androidx.core.util.Preconditions.checkNotNull(this.coroutineCreation)).getSessionType());
                    this.getInputFormats = createEncoder;
                    androidx.camera.video.internal.encoder.Encoder.EncoderInput input = createEncoder.getInput();
                    if (!(input instanceof androidx.camera.video.internal.encoder.Encoder.ByteBufferInput)) {
                        throw new java.lang.AssertionError("The EncoderInput of audio isn't a ByteBufferInput.");
                    }
                    this.getOutputStallDurationlomOqCM.setBufferProvider((androidx.camera.video.internal.encoder.Encoder.ByteBufferInput) input);
                }
                getHighResolutionOutputSizeshNQ4ISI(androidx.camera.video.Recorder.AudioState.ENABLED);
            } catch (androidx.camera.video.internal.audio.AudioSourceAccessException | androidx.camera.video.internal.encoder.InvalidConfigException e) {
                androidx.camera.core.Logger.e("Recorder", "Unable to create audio resource with error: ", e);
                if (e instanceof androidx.camera.video.internal.encoder.InvalidConfigException) {
                    audioState = androidx.camera.video.Recorder.AudioState.ERROR_ENCODER;
                } else {
                    audioState = androidx.camera.video.Recorder.AudioState.ERROR_SOURCE;
                }
                getHighResolutionOutputSizeshNQ4ISI(audioState);
                this.getOutputFormats = e;
            }
        }
        getHighResolutionOutputSizeshNQ4ISI(recordingRecord, false);
        if (this.getOutputStallDuration == androidx.camera.video.Recorder.AudioState.ENABLED) {
            this.getOutputStallDurationlomOqCM.start(recordingRecord.getHighSpeedVideoFpsRangesFor.get());
            this.getInputFormats.start();
        }
        this.freeTransaction.start();
        androidx.camera.video.Recorder.RecordingRecord recordingRecord2 = this.CoroutineDebuggingKt;
        recordingRecord2.getHighSpeedVideoFpsRanges(androidx.camera.video.VideoRecordEvent.Camera2StreamConfigurationMap(recordingRecord2.Camera2StreamConfigurationMap(), getInputFormats()), true);
    }

    final void getHighResolutionOutputSizeshNQ4ISI(final androidx.camera.video.Recorder.RecordingRecord recordingRecord, boolean z) {
        if (!this.getOutputSizeshNQ4ISI.isEmpty()) {
            com.google.common.util.concurrent.ListenableFuture allAsList = androidx.camera.core.impl.utils.futures.Futures.allAsList(this.getOutputSizeshNQ4ISI);
            if (!allAsList.isDone()) {
                allAsList.cancel(true);
            }
            this.getOutputSizeshNQ4ISI.clear();
        }
        this.getOutputSizeshNQ4ISI.add(androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(new androidx.concurrent.futures.CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.video.Recorder$$ExternalSyntheticLambda2
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final java.lang.Object attachCompleter(final androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer) {
                final androidx.camera.video.Recorder recorder = androidx.camera.video.Recorder.this;
                final androidx.camera.video.Recorder.RecordingRecord recordingRecord2 = recordingRecord;
                recorder.freeTransaction.setEncoderCallback(new androidx.camera.video.internal.encoder.EncoderCallback() { // from class: androidx.camera.video.Recorder.3
                    @Override // androidx.camera.video.internal.encoder.EncoderCallback
                    public void onEncodeStart() {
                    }

                    @Override // androidx.camera.video.internal.encoder.EncoderCallback
                    public void onEncodeStop() {
                        completer.set(null);
                    }

                    @Override // androidx.camera.video.internal.encoder.EncoderCallback
                    public void onEncodeError(androidx.camera.video.internal.encoder.EncodeException encodeException) {
                        completer.setException(encodeException);
                    }

                    @Override // androidx.camera.video.internal.encoder.EncoderCallback
                    public void onEncodedData(androidx.camera.video.internal.encoder.EncodedData encodedData) {
                        boolean z2;
                        if (androidx.camera.video.Recorder.this._CREATION == null) {
                            if (!androidx.camera.video.Recorder.this.accessartificialFrame) {
                                if (androidx.camera.video.Recorder.this.kernelVersion != null) {
                                    androidx.camera.video.Recorder.this.kernelVersion.close();
                                    androidx.camera.video.Recorder.this.kernelVersion = null;
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if (encodedData.isKeyFrame()) {
                                    androidx.camera.video.Recorder.this.kernelVersion = encodedData;
                                    if (androidx.camera.video.Recorder.this.getOutputStallDuration != androidx.camera.video.Recorder.AudioState.ENABLED || !androidx.camera.video.Recorder.this.AMEXKernel.isEmpty()) {
                                        androidx.camera.core.Logger.d("Recorder", "Received video keyframe. Starting muxer...");
                                        androidx.camera.video.Recorder.this.getHighSpeedVideoFpsRanges(recordingRecord2);
                                        return;
                                    } else if (z2) {
                                        androidx.camera.core.Logger.d("Recorder", "Replaced cached video keyframe with newer keyframe.");
                                        return;
                                    } else {
                                        androidx.camera.core.Logger.d("Recorder", "Cached video keyframe while we wait for first audio sample before starting muxer.");
                                        return;
                                    }
                                }
                                if (z2) {
                                    androidx.camera.core.Logger.d("Recorder", "Dropped cached keyframe since we have new video data and have not yet received audio data.");
                                }
                                androidx.camera.core.Logger.d("Recorder", "Dropped video data since muxer has not yet started and data is not a keyframe.");
                                androidx.camera.video.Recorder.this.freeTransaction.requestKeyFrame();
                                encodedData.close();
                                return;
                            }
                            androidx.camera.core.Logger.d("Recorder", "Drop video data since recording is stopping.");
                            encodedData.close();
                            return;
                        }
                        try {
                            androidx.camera.video.Recorder.this.getHighResolutionOutputSizeshNQ4ISI(encodedData, recordingRecord2);
                            if (encodedData != null) {
                                encodedData.close();
                            }
                        } catch (java.lang.Throwable th) {
                            if (encodedData != null) {
                                try {
                                    encodedData.close();
                                } catch (java.lang.Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                            }
                            throw th;
                        }
                    }

                    @Override // androidx.camera.video.internal.encoder.EncoderCallback
                    public void onOutputConfigUpdate(androidx.camera.video.internal.encoder.OutputConfig outputConfig) {
                        androidx.camera.video.Recorder.this.AMEXKernelProvider = outputConfig;
                    }
                }, recorder.requestGoOnline);
                return "videoEncodingFuture";
            }
        }));
        if (this.getOutputStallDuration == androidx.camera.video.Recorder.AudioState.ENABLED && !z) {
            this.getOutputSizeshNQ4ISI.add(androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(new androidx.concurrent.futures.CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.video.Recorder$$ExternalSyntheticLambda3
                @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                public final java.lang.Object attachCompleter(final androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer) {
                    final androidx.camera.video.Recorder recorder = androidx.camera.video.Recorder.this;
                    final androidx.camera.video.Recorder.RecordingRecord recordingRecord2 = recordingRecord;
                    final androidx.core.util.Consumer consumer = new androidx.core.util.Consumer() { // from class: androidx.camera.video.Recorder$$ExternalSyntheticLambda14
                        @Override // androidx.core.util.Consumer
                        public final void accept(java.lang.Object obj) {
                            androidx.camera.video.Recorder recorder2 = androidx.camera.video.Recorder.this;
                            androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer2 = completer;
                            java.lang.Throwable th = (java.lang.Throwable) obj;
                            if (recorder2.getOutputFormats == null) {
                                if (th instanceof androidx.camera.video.internal.encoder.EncodeException) {
                                    recorder2.getHighResolutionOutputSizeshNQ4ISI(androidx.camera.video.Recorder.AudioState.ERROR_ENCODER);
                                } else {
                                    recorder2.getHighResolutionOutputSizeshNQ4ISI(androidx.camera.video.Recorder.AudioState.ERROR_SOURCE);
                                }
                                recorder2.getOutputFormats = th;
                                recorder2.getHighSpeedVideoSizes(true);
                                completer2.set(null);
                            }
                        }
                    };
                    recorder.getOutputStallDurationlomOqCM.setAudioSourceCallback(recorder.requestGoOnline, new androidx.camera.video.internal.audio.AudioSource.AudioSourceCallback() { // from class: androidx.camera.video.Recorder.4
                        @Override // androidx.camera.video.internal.audio.AudioSource.AudioSourceCallback
                        public void onSilenceStateChanged(boolean z2) {
                            if (androidx.camera.video.Recorder.this.ArtificialStackFrames != z2) {
                                androidx.camera.video.Recorder.this.ArtificialStackFrames = z2;
                                androidx.camera.video.Recorder.this.getHighSpeedVideoSizes(true);
                            } else {
                                androidx.camera.core.Logger.w("Recorder", "Audio source silenced transitions to the same state ".concat(java.lang.String.valueOf(z2)));
                            }
                        }

                        @Override // androidx.camera.video.internal.audio.AudioSource.AudioSourceCallback
                        public void onError(java.lang.Throwable th) {
                            androidx.camera.core.Logger.e("Recorder", "Error occurred after audio source started.", th);
                            if (th instanceof androidx.camera.video.internal.audio.AudioSourceAccessException) {
                                consumer.accept(th);
                            }
                        }

                        @Override // androidx.camera.video.internal.audio.AudioSource.AudioSourceCallback
                        public void onAmplitudeValue(double d) {
                            androidx.camera.video.Recorder.this.getOutputMinFrameDuration = d;
                        }
                    });
                    recorder.getInputFormats.setEncoderCallback(new androidx.camera.video.internal.encoder.EncoderCallback() { // from class: androidx.camera.video.Recorder.5
                        @Override // androidx.camera.video.internal.encoder.EncoderCallback
                        public void onEncodeStart() {
                        }

                        @Override // androidx.camera.video.internal.encoder.EncoderCallback
                        public void onEncodeStop() {
                            completer.set(null);
                        }

                        @Override // androidx.camera.video.internal.encoder.EncoderCallback
                        public void onEncodeError(androidx.camera.video.internal.encoder.EncodeException encodeException) {
                            if (androidx.camera.video.Recorder.this.getOutputFormats == null) {
                                consumer.accept(encodeException);
                            }
                        }

                        @Override // androidx.camera.video.internal.encoder.EncoderCallback
                        public void onEncodedData(androidx.camera.video.internal.encoder.EncodedData encodedData) {
                            if (androidx.camera.video.Recorder.this.getOutputStallDuration == androidx.camera.video.Recorder.AudioState.DISABLED) {
                                encodedData.close();
                                throw new java.lang.AssertionError("Audio is not enabled but audio encoded data is being produced.");
                            }
                            if (androidx.camera.video.Recorder.this._CREATION == null) {
                                if (!androidx.camera.video.Recorder.this.accessartificialFrame) {
                                    androidx.camera.video.Recorder.this.AMEXKernel.enqueue(new androidx.camera.video.internal.encoder.BufferCopiedEncodedData(encodedData));
                                    if (androidx.camera.video.Recorder.this.kernelVersion != null) {
                                        androidx.camera.core.Logger.d("Recorder", "Received audio data. Starting muxer...");
                                        androidx.camera.video.Recorder.this.getHighSpeedVideoFpsRanges(recordingRecord2);
                                    } else {
                                        androidx.camera.core.Logger.d("Recorder", "Cached audio data while we wait for video keyframe before starting muxer.");
                                    }
                                } else {
                                    androidx.camera.core.Logger.d("Recorder", "Drop audio data since recording is stopping.");
                                }
                                encodedData.close();
                                return;
                            }
                            try {
                                androidx.camera.video.Recorder.this.getHighSpeedVideoFpsRanges(encodedData, recordingRecord2);
                                if (encodedData != null) {
                                    encodedData.close();
                                }
                            } catch (java.lang.Throwable th) {
                                if (encodedData != null) {
                                    try {
                                        encodedData.close();
                                    } catch (java.lang.Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                }
                                throw th;
                            }
                        }

                        @Override // androidx.camera.video.internal.encoder.EncoderCallback
                        public void onOutputConfigUpdate(androidx.camera.video.internal.encoder.OutputConfig outputConfig) {
                            androidx.camera.video.Recorder.this.getInputSizeshNQ4ISI = outputConfig;
                        }
                    }, recorder.requestGoOnline);
                    return "audioEncodingFuture";
                }
            }));
        }
        androidx.camera.core.impl.utils.futures.Futures.addCallback(androidx.camera.core.impl.utils.futures.Futures.allAsList(this.getOutputSizeshNQ4ISI), new androidx.camera.core.impl.utils.futures.FutureCallback<java.util.List<java.lang.Void>>() { // from class: androidx.camera.video.Recorder.6
            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public /* synthetic */ void onSuccess(java.util.List<java.lang.Void> list) {
                androidx.camera.core.Logger.d("Recorder", "Encodings end successfully.");
                androidx.camera.video.Recorder recorder = androidx.camera.video.Recorder.this;
                recorder.Camera2StreamConfigurationMap(recorder.exchange, androidx.camera.video.Recorder.this.startTransaction);
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onFailure(java.lang.Throwable th) {
                androidx.core.util.Preconditions.checkState(androidx.camera.video.Recorder.this.CoroutineDebuggingKt != null, "In-progress recording shouldn't be null");
                if (androidx.camera.video.Recorder.this.CoroutineDebuggingKt.getInputSizeshNQ4ISI()) {
                    return;
                }
                androidx.camera.core.Logger.d("Recorder", "Encodings end with error: ".concat(java.lang.String.valueOf(th)));
                androidx.camera.video.Recorder recorder = androidx.camera.video.Recorder.this;
                recorder.Camera2StreamConfigurationMap(recorder._CREATION == null ? 8 : 6, th);
            }
        }, androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor());
    }

    final void getHighResolutionOutputSizeshNQ4ISI(androidx.camera.video.internal.encoder.EncodedData encodedData, androidx.camera.video.Recorder.RecordingRecord recordingRecord) {
        if (this.freeTransaction == null) {
            androidx.camera.core.Logger.d("Recorder", "Ignore the video data since the video encoder has been released.");
            return;
        }
        if (this.newContext == null) {
            throw new java.lang.AssertionError("Video data comes before the track is added to Muxer.");
        }
        long size = this.release + encodedData.size();
        long j = this.isOutputSupportedForhNQ4ISI;
        long j2 = 0;
        if (j != 0 && size > j) {
            androidx.camera.core.Logger.d("Recorder", java.lang.String.format("Reach file size limit %d > %d", java.lang.Long.valueOf(size), java.lang.Long.valueOf(j)));
            Camera2StreamConfigurationMap(recordingRecord, 2, null);
            return;
        }
        long presentationTimeUs = encodedData.getPresentationTimeUs();
        long j3 = this.isOutputSupportedFor;
        if (j3 == Long.MAX_VALUE) {
            this.isOutputSupportedFor = presentationTimeUs;
            androidx.camera.core.Logger.d("Recorder", java.lang.String.format("First video time: %d (%s)", java.lang.Long.valueOf(presentationTimeUs), androidx.camera.video.internal.DebugUtils.readableUs(presentationTimeUs)));
        } else {
            long j4 = presentationTimeUs - j3;
            if (this.getOutputSizes != 0) {
                androidx.core.util.Preconditions.checkState(this.init != Long.MAX_VALUE, "There should be a previous data for adjusting the duration.");
                long j5 = (presentationTimeUs - this.init) + j4;
                long j6 = this.getOutputSizes;
                if (j5 > j6) {
                    androidx.camera.core.Logger.d("Recorder", java.lang.String.format("Video data reaches duration limit %d > %d", java.lang.Long.valueOf(j5), java.lang.Long.valueOf(j6)));
                    Camera2StreamConfigurationMap(recordingRecord, 9, null);
                    return;
                }
            }
            j2 = j4;
        }
        encodedData.getBufferInfo().presentationTimeUs = j2;
        try {
            this._CREATION.writeSampleData(this.newContext.intValue(), encodedData.getByteBuffer(), encodedData.getBufferInfo());
            this.release = size;
            this.AMEXKernela = j2;
            this.init = presentationTimeUs;
            getHighSpeedVideoSizes(encodedData.isKeyFrame());
            if (size > this.TransactionOutcomeDecoderExternalSyntheticLambda0) {
                long availableBytes = ((androidx.camera.video.internal.OutputStorage) androidx.core.util.Preconditions.checkNotNull(this.IAuthTabCallback)).getAvailableBytes();
                java.lang.StringBuilder sb = new java.lang.StringBuilder("availableBytes = ");
                sb.append(androidx.camera.video.internal.utils.StorageUtil.formatSize(availableBytes));
                androidx.camera.core.Logger.d("Recorder", sb.toString());
                long j7 = this.valueOf;
                if (availableBytes < j7) {
                    Camera2StreamConfigurationMap(recordingRecord, 3, new java.io.IOException(java.lang.String.format("Insufficient storage space. The available storage (%d bytes) is below the required threshold of %d bytes.", java.lang.Long.valueOf(availableBytes), java.lang.Long.valueOf(j7))));
                } else {
                    this.TransactionOutcomeDecoderExternalSyntheticLambda0 = availableBytes - j7;
                }
            }
        } catch (androidx.camera.video.internal.muxer.MuxerException e) {
            androidx.camera.core.Logger.w("Recorder", "writeVideoData failed", e);
            Camera2StreamConfigurationMap(recordingRecord, Camera2StreamConfigurationMap(e) ? 3 : 1, e);
        }
    }

    final void getHighSpeedVideoFpsRanges(androidx.camera.video.internal.encoder.EncodedData encodedData, androidx.camera.video.Recorder.RecordingRecord recordingRecord) {
        if (this.getInputFormats == null) {
            androidx.camera.core.Logger.d("Recorder", "Ignore the audio data since the audio encoder has been released.");
            return;
        }
        if (encodedData.getPresentationTimeUs() < this.isOutputSupportedFor) {
            androidx.camera.core.Logger.d("Recorder", "Skipping audio data: timestamp precedes first video frame.");
            return;
        }
        long size = this.release + encodedData.size();
        long j = this.isOutputSupportedForhNQ4ISI;
        if (j != 0 && size > j) {
            androidx.camera.core.Logger.d("Recorder", java.lang.String.format("Reach file size limit %d > %d", java.lang.Long.valueOf(size), java.lang.Long.valueOf(j)));
            Camera2StreamConfigurationMap(recordingRecord, 2, null);
            return;
        }
        long presentationTimeUs = encodedData.getPresentationTimeUs();
        long j2 = presentationTimeUs - this.isOutputSupportedFor;
        if (this.toString == Long.MAX_VALUE) {
            this.toString = presentationTimeUs;
            androidx.camera.core.Logger.d("Recorder", java.lang.String.format("First audio time: %d (%s)", java.lang.Long.valueOf(presentationTimeUs), androidx.camera.video.internal.DebugUtils.readableUs(presentationTimeUs)));
        } else if (this.getOutputSizes != 0) {
            androidx.core.util.Preconditions.checkState(this.c != Long.MAX_VALUE, "There should be a previous data for adjusting the duration.");
            long j3 = (presentationTimeUs - this.c) + j2;
            long j4 = this.getOutputSizes;
            if (j3 > j4) {
                androidx.camera.core.Logger.d("Recorder", java.lang.String.format("Audio data reaches duration limit %d > %d", java.lang.Long.valueOf(j3), java.lang.Long.valueOf(j4)));
                Camera2StreamConfigurationMap(recordingRecord, 9, null);
                return;
            }
        }
        encodedData.getBufferInfo().presentationTimeUs = j2;
        try {
            this._CREATION.writeSampleData(this.getOutputMinFrameDurationlomOqCM.intValue(), encodedData.getByteBuffer(), encodedData.getBufferInfo());
            this.release = size;
            this.resetTransaction += encodedData.size();
            this.c = presentationTimeUs;
        } catch (androidx.camera.video.internal.muxer.MuxerException e) {
            androidx.camera.core.Logger.w("Recorder", "writeAudioData failed", e);
            Camera2StreamConfigurationMap(recordingRecord, Camera2StreamConfigurationMap(e) ? 3 : 1, e);
        }
    }

    final void Camera2StreamConfigurationMap(androidx.camera.video.Recorder.RecordingRecord recordingRecord) {
        if (this.CoroutineDebuggingKt != recordingRecord || this.accessartificialFrame) {
            return;
        }
        if (this.getOutputStallDuration == androidx.camera.video.Recorder.AudioState.ENABLED) {
            this.getInputFormats.pause();
        }
        this.freeTransaction.pause();
        androidx.camera.video.Recorder.RecordingRecord recordingRecord2 = this.CoroutineDebuggingKt;
        recordingRecord2.getHighSpeedVideoFpsRanges(androidx.camera.video.VideoRecordEvent.getHighSpeedVideoSizes(recordingRecord2.Camera2StreamConfigurationMap(), getInputFormats()), true);
    }

    final void Camera2StreamConfigurationMap(androidx.camera.video.Recorder.RecordingRecord recordingRecord, long j, int i, java.lang.Throwable th) {
        if (this.CoroutineDebuggingKt != recordingRecord || this.accessartificialFrame) {
            return;
        }
        this.accessartificialFrame = true;
        this.exchange = i;
        this.startTransaction = th;
        if (this.getOutputStallDuration == androidx.camera.video.Recorder.AudioState.ENABLED) {
            getOutputFormats();
            this.getInputFormats.stop(j);
        }
        androidx.camera.video.internal.encoder.EncodedData encodedData = this.kernelVersion;
        if (encodedData != null) {
            encodedData.close();
            this.kernelVersion = null;
        }
        if (this.updateUI != androidx.camera.video.VideoOutput.SourceState.ACTIVE_NON_STREAMING) {
            java.lang.Runnable runnable = new java.lang.Runnable() { // from class: androidx.camera.video.Recorder$$ExternalSyntheticLambda19
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.core.Logger.d("Recorder", "The source didn't become non-streaming before timeout. Waited 1000ms");
                }
            };
            java.util.concurrent.Executor executor = this.requestGoOnline;
            this.AMEXKernelCallback = androidx.camera.core.impl.utils.executor.CameraXExecutors.mainThreadExecutor().schedule(new androidx.camera.video.Recorder$$ExternalSyntheticLambda0(executor, runnable), 1000L, java.util.concurrent.TimeUnit.MILLISECONDS);
        } else {
            androidx.camera.video.internal.encoder.Encoder encoder = this.freeTransaction;
            if (encoder instanceof androidx.camera.video.internal.encoder.EncoderImpl) {
                ((androidx.camera.video.internal.encoder.EncoderImpl) encoder).signalSourceStopped();
            }
        }
        this.freeTransaction.stop(j);
    }

    static void getHighSpeedVideoFpsRanges(androidx.camera.video.internal.encoder.Encoder encoder) {
        if (encoder instanceof androidx.camera.video.internal.encoder.EncoderImpl) {
            ((androidx.camera.video.internal.encoder.EncoderImpl) encoder).signalSourceStopped();
        }
    }

    private void getOutputFormats() {
        while (!this.AMEXKernel.isEmpty()) {
            this.AMEXKernel.dequeue().close();
        }
    }

    private void getOutputStallDuration() {
        if (this.getInputFormats != null) {
            androidx.camera.core.Logger.d("Recorder", "Releasing audio encoder.");
            this.getInputFormats.release();
            this.getInputFormats = null;
            this.getInputSizeshNQ4ISI = null;
        }
        if (this.getOutputStallDurationlomOqCM != null) {
            getHighSpeedVideoSizesFor();
        }
        getHighResolutionOutputSizeshNQ4ISI(androidx.camera.video.Recorder.AudioState.INITIALIZING);
        if (this.freeTransaction != null) {
            androidx.camera.core.Logger.d("Recorder", "Releasing video encoder.");
            getOutputStallDurationlomOqCM();
        }
        getInputSizeshNQ4ISI();
    }

    private void getOutputStallDurationlomOqCM() {
        androidx.camera.video.VideoEncoderSession videoEncoderSession = this.setup;
        if (videoEncoderSession != null) {
            androidx.core.util.Preconditions.checkState(videoEncoderSession.getHighSpeedVideoSizesFor == this.freeTransaction);
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Releasing video encoder: ");
            sb.append(this.freeTransaction);
            androidx.camera.core.Logger.d("Recorder", sb.toString());
            this.setup.getHighResolutionOutputSizeshNQ4ISI();
            this.setup = null;
            this.freeTransaction = null;
            this.AMEXKernelProvider = null;
            getHighSpeedVideoFpsRangesFor((android.view.Surface) null);
            return;
        }
        getOutputSizeshNQ4ISI();
    }

    private void getInputSizeshNQ4ISI() {
        boolean z;
        androidx.camera.core.SurfaceRequest surfaceRequest;
        synchronized (this.getARTIFICIAL_FRAME_PACKAGE_NAME) {
            switch (this.rsaCipher.ordinal()) {
                case 1:
                case 2:
                    Camera2StreamConfigurationMap(androidx.camera.video.Recorder.State.CONFIGURING);
                    z = true;
                    break;
                case 4:
                case 5:
                case 8:
                    androidx.camera.video.Recorder.RecordingRecord recordingRecord = this.CoroutineDebuggingKt;
                    if (recordingRecord != null && recordingRecord.getInputSizeshNQ4ISI()) {
                        z = false;
                        break;
                    }
                    break;
                case 3:
                case 6:
                case 7:
                    getHighSpeedVideoSizes(androidx.camera.video.Recorder.State.CONFIGURING);
                    z = true;
                    break;
                default:
                    z = true;
                    break;
            }
        }
        this.b = false;
        if (!z || (surfaceRequest = this.coroutineCreation) == null || surfaceRequest.isServiced()) {
            return;
        }
        getHighSpeedVideoFpsRanges(this.coroutineCreation, this.start, false);
    }

    private int Camera2StreamConfigurationMap(androidx.camera.video.Recorder.AudioState audioState) {
        int ordinal = audioState.ordinal();
        if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
            return 1;
        }
        if (ordinal != 3) {
            if (ordinal == 4) {
                return 3;
            }
            if (ordinal == 5) {
                return 4;
            }
            throw new java.lang.AssertionError("Invalid internal audio state: ".concat(java.lang.String.valueOf(audioState)));
        }
        androidx.camera.video.Recorder.RecordingRecord recordingRecord = this.CoroutineDebuggingKt;
        if (recordingRecord == null || !recordingRecord.getHighSpeedVideoFpsRangesFor.get()) {
            return this.ArtificialStackFrames ? 2 : 0;
        }
        return 5;
    }

    private boolean Camera2StreamConfigurationMap(java.lang.Throwable th) {
        return androidx.camera.video.internal.utils.StorageUtil.isStorageFullException(th) || ((androidx.camera.video.internal.OutputStorage) androidx.core.util.Preconditions.checkNotNull(this.IAuthTabCallback)).getAvailableBytes() < this.valueOf;
    }

    private boolean getOutputMinFrameDuration() {
        if (this.release > 0) {
            return this.getOutputStallDuration == androidx.camera.video.Recorder.AudioState.ENABLED && this.resetTransaction <= 0;
        }
        return true;
    }

    final void Camera2StreamConfigurationMap(int i, java.lang.Throwable th) {
        androidx.camera.video.VideoRecordEvent.Finalize highResolutionOutputSizeshNQ4ISI;
        if (this.CoroutineDebuggingKt == null) {
            throw new java.lang.AssertionError("Attempted to finalize in-progress recording, but no recording is in progress.");
        }
        int i2 = 8;
        try {
            if (this._CREATION != null) {
                try {
                    androidx.camera.core.Logger.d("Recorder", "Muxer.stop()");
                    this._CREATION.stop();
                } catch (androidx.camera.video.internal.muxer.MuxerException e) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Muxer failed to stop with error: ");
                    sb.append(e);
                    androidx.camera.core.Logger.w("Recorder", sb.toString(), e);
                    if (i == 0) {
                        if (Camera2StreamConfigurationMap(e)) {
                            i2 = 3;
                        } else if (!getOutputMinFrameDuration()) {
                            i2 = 1;
                        }
                        th = e;
                        i = i2;
                    }
                }
            } else if (i == 0) {
                i = 8;
            }
            androidx.camera.video.Recorder.RecordingRecord recordingRecord = this.CoroutineDebuggingKt;
            android.net.Uri uri = this._BOUNDARY;
            if (recordingRecord.getHighSpeedVideoFpsRanges.get()) {
                recordingRecord.Camera2StreamConfigurationMap(recordingRecord.getHighSpeedVideoSizesFor.getAndSet(null), uri);
            }
            androidx.camera.video.OutputOptions Camera2StreamConfigurationMap2 = this.CoroutineDebuggingKt.Camera2StreamConfigurationMap();
            androidx.camera.video.RecordingStats inputFormats = getInputFormats();
            androidx.camera.video.OutputResults highResolutionOutputSizeshNQ4ISI2 = androidx.camera.video.OutputResults.getHighResolutionOutputSizeshNQ4ISI(this._BOUNDARY);
            androidx.camera.video.Recorder.RecordingRecord recordingRecord2 = this.CoroutineDebuggingKt;
            if (i == 0) {
                highResolutionOutputSizeshNQ4ISI = androidx.camera.video.VideoRecordEvent.getHighResolutionOutputSizeshNQ4ISI(Camera2StreamConfigurationMap2, inputFormats, highResolutionOutputSizeshNQ4ISI2);
            } else {
                highResolutionOutputSizeshNQ4ISI = androidx.camera.video.VideoRecordEvent.getHighResolutionOutputSizeshNQ4ISI(Camera2StreamConfigurationMap2, inputFormats, highResolutionOutputSizeshNQ4ISI2, i, th);
            }
            recordingRecord2.getHighSpeedVideoFpsRanges(highResolutionOutputSizeshNQ4ISI, true);
            androidx.camera.video.Recorder.RecordingRecord recordingRecord3 = this.CoroutineDebuggingKt;
            this.CoroutineDebuggingKt = null;
            this.accessartificialFrame = false;
            this.getOutputMinFrameDurationlomOqCM = null;
            this.newContext = null;
            this.getOutputSizeshNQ4ISI.clear();
            this._BOUNDARY = android.net.Uri.EMPTY;
            this.release = 0L;
            this.resetTransaction = 0L;
            this.AMEXKernela = 0L;
            this.isOutputSupportedFor = Long.MAX_VALUE;
            this.toString = Long.MAX_VALUE;
            this.init = Long.MAX_VALUE;
            this.c = Long.MAX_VALUE;
            this.exchange = 1;
            this.startTransaction = null;
            this.getOutputFormats = null;
            this.getOutputMinFrameDuration = 0.0d;
            this.IAuthTabCallback = null;
            this.TransactionOutcomeDecoderExternalSyntheticLambda0 = Long.MAX_VALUE;
            getOutputFormats();
            getHighSpeedVideoFpsRangesFor((androidx.camera.core.SurfaceRequest.TransformationInfo) null);
            int ordinal = this.getOutputStallDuration.ordinal();
            if (ordinal == 2 || ordinal == 3) {
                getHighResolutionOutputSizeshNQ4ISI(androidx.camera.video.Recorder.AudioState.IDLING);
                this.getOutputStallDurationlomOqCM.stop();
            } else if (ordinal == 4 || ordinal == 5) {
                getHighResolutionOutputSizeshNQ4ISI(androidx.camera.video.Recorder.AudioState.INITIALIZING);
            }
            getHighSpeedVideoFpsRangesFor(recordingRecord3);
        } finally {
            androidx.camera.core.Logger.d("Recorder", "Muxer.release()");
            this._CREATION.release();
            this._CREATION = null;
        }
    }

    private void getHighSpeedVideoFpsRangesFor(androidx.camera.video.Recorder.RecordingRecord recordingRecord) {
        androidx.camera.video.Recorder.RecordingRecord recordingRecord2;
        int i;
        int i2;
        androidx.camera.video.Recorder.RecordingRecord recordingRecord3;
        java.lang.Exception exc;
        int i3;
        synchronized (this.getARTIFICIAL_FRAME_PACKAGE_NAME) {
            androidx.camera.video.Recorder.RecordingRecord recordingRecord4 = this.getHighSpeedVideoSizes;
            if (recordingRecord4 != recordingRecord) {
                throw new java.lang.AssertionError("Active recording did not match finalized recording on finalize.");
            }
            recordingRecord4.getInputFormats.removeObservers();
            recordingRecord2 = null;
            this.getHighSpeedVideoSizes = null;
            i = 1;
            i2 = 0;
            switch (this.rsaCipher.ordinal()) {
                case 1:
                    i = 0;
                case 2:
                    if (this.updateUI == androidx.camera.video.VideoOutput.SourceState.INACTIVE) {
                        recordingRecord3 = this.d;
                        this.d = null;
                        getHighSpeedVideoSizes(androidx.camera.video.Recorder.State.CONFIGURING);
                        exc = getHighResolutionOutputSizeshNQ4ISI;
                        i3 = 4;
                        i2 = i;
                        i = 0;
                    } else {
                        if (this.freeTransaction != null) {
                            exc = null;
                            i3 = 0;
                            recordingRecord2 = getHighSpeedVideoFpsRangesFor(this.rsaCipher);
                            recordingRecord3 = null;
                        } else {
                            recordingRecord3 = null;
                            exc = null;
                            i3 = 0;
                        }
                        i2 = i;
                        i = i3;
                    }
                    break;
                case 3:
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Unexpected state on finalize of recording: ");
                    sb.append(this.rsaCipher);
                    throw new java.lang.AssertionError(sb.toString());
                case 4:
                case 5:
                case 6:
                    getHighSpeedVideoSizes(androidx.camera.video.Recorder.State.IDLING);
                    recordingRecord3 = null;
                    exc = null;
                    i = 0;
                    i3 = 0;
                    break;
                case 7:
                    recordingRecord3 = null;
                    exc = null;
                    i3 = 0;
                    break;
                default:
                    recordingRecord3 = null;
                    exc = null;
                    i = 0;
                    i3 = 0;
                    break;
            }
        }
        if (i != 0) {
            getOutputStallDuration();
            return;
        }
        if (recordingRecord2 == null) {
            if (recordingRecord3 != null) {
                getHighSpeedVideoFpsRangesFor(recordingRecord3, i3, exc);
            }
        } else {
            getHighResolutionOutputSizeshNQ4ISI(recordingRecord2);
            if (i2 != 0) {
                Camera2StreamConfigurationMap(recordingRecord2);
            }
        }
    }

    final void Camera2StreamConfigurationMap(androidx.camera.video.Recorder.RecordingRecord recordingRecord, int i, java.lang.Throwable th) {
        boolean z;
        if (recordingRecord != this.CoroutineDebuggingKt) {
            throw new java.lang.AssertionError("Internal error occurred on recording that is not the current in-progress recording.");
        }
        synchronized (this.getARTIFICIAL_FRAME_PACKAGE_NAME) {
            z = false;
            switch (this.rsaCipher) {
                case CONFIGURING:
                case IDLING:
                case ERROR:
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("In-progress recording error occurred while in unexpected state: ");
                    sb.append(this.rsaCipher);
                    throw new java.lang.AssertionError(sb.toString());
                case RECORDING:
                case PAUSED:
                    getHighSpeedVideoSizes(androidx.camera.video.Recorder.State.STOPPING);
                    z = true;
                case PENDING_RECORDING:
                case PENDING_PAUSED:
                case STOPPING:
                case RESETTING:
                    if (recordingRecord != this.getHighSpeedVideoSizes) {
                        throw new java.lang.AssertionError("Internal error occurred for recording but it is not the active recording.");
                    }
                    break;
            }
        }
        if (z) {
            Camera2StreamConfigurationMap(recordingRecord, -1L, i, th);
        }
    }

    final androidx.camera.video.Recorder.RecordingRecord getHighSpeedVideoFpsRangesFor(androidx.camera.video.Recorder.State state) {
        boolean z;
        if (state == androidx.camera.video.Recorder.State.PENDING_PAUSED) {
            z = true;
        } else {
            if (state != androidx.camera.video.Recorder.State.PENDING_RECORDING) {
                throw new java.lang.AssertionError("makePendingRecordingActiveLocked() can only be called from a pending state.");
            }
            z = false;
        }
        if (this.getHighSpeedVideoSizes != null) {
            throw new java.lang.AssertionError("Cannot make pending recording active because another recording is already active.");
        }
        androidx.camera.video.Recorder.RecordingRecord recordingRecord = this.d;
        if (recordingRecord == null) {
            throw new java.lang.AssertionError("Pending recording should exist when in a PENDING state.");
        }
        this.getHighSpeedVideoSizes = recordingRecord;
        recordingRecord.getInputFormats.addObserver(androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor(), new androidx.camera.core.impl.Observable.Observer<java.lang.Boolean>() { // from class: androidx.camera.video.Recorder.7
            @Override // androidx.camera.core.impl.Observable.Observer
            public /* synthetic */ void onNewData(java.lang.Boolean bool) {
                androidx.camera.video.Recorder.this.TransactionOutcomeDecoderExternalSyntheticLambda6.setState(bool);
            }

            @Override // androidx.camera.core.impl.Observable.Observer
            public void onError(java.lang.Throwable th) {
                androidx.camera.video.Recorder.this.TransactionOutcomeDecoderExternalSyntheticLambda6.setError(th);
            }
        });
        this.d = null;
        if (z) {
            getHighSpeedVideoSizes(androidx.camera.video.Recorder.State.PAUSED);
            return recordingRecord;
        }
        getHighSpeedVideoSizes(androidx.camera.video.Recorder.State.RECORDING);
        return recordingRecord;
    }

    final void getHighSpeedVideoSizes(boolean z) {
        androidx.camera.video.Recorder.RecordingRecord recordingRecord = this.CoroutineDebuggingKt;
        if (recordingRecord != null) {
            recordingRecord.getHighSpeedVideoFpsRanges(androidx.camera.video.VideoRecordEvent.getHighResolutionOutputSizeshNQ4ISI(recordingRecord.Camera2StreamConfigurationMap(), getInputFormats()), z);
        }
    }

    final androidx.camera.video.RecordingStats getInputFormats() {
        return androidx.camera.video.RecordingStats.getHighResolutionOutputSizeshNQ4ISI(java.util.concurrent.TimeUnit.MICROSECONDS.toNanos(this.AMEXKernela), this.release, androidx.camera.video.AudioStats.getHighSpeedVideoFpsRangesFor(Camera2StreamConfigurationMap(this.getOutputStallDuration), this.getOutputFormats, this.getOutputMinFrameDuration, this.resetTransaction));
    }

    static <T> T Camera2StreamConfigurationMap(androidx.camera.core.impl.StateObservable<T> stateObservable) {
        try {
            return stateObservable.fetchData().get();
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e) {
            throw new java.lang.IllegalStateException(e);
        }
    }

    final void getHighSpeedVideoSizes(androidx.camera.video.Recorder.State state) {
        if (this.rsaCipher == state) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Attempted to transition to state ");
            sb.append(state);
            sb.append(", but Recorder is already in state ");
            sb.append(state);
            throw new java.lang.AssertionError(sb.toString());
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Transitioning Recorder internal state: ");
        sb2.append(this.rsaCipher);
        sb2.append(" --> ");
        sb2.append(state);
        androidx.camera.core.Logger.d("Recorder", sb2.toString());
        java.util.Set<androidx.camera.video.Recorder.State> set = apply;
        androidx.camera.video.StreamInfo.StreamState streamState = null;
        if (set.contains(state)) {
            if (!set.contains(this.rsaCipher)) {
                if (!decode.contains(this.rsaCipher)) {
                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Invalid state transition. Should not be transitioning to a PENDING state from state ");
                    sb3.append(this.rsaCipher);
                    throw new java.lang.AssertionError(sb3.toString());
                }
                androidx.camera.video.Recorder.State state2 = this.rsaCipher;
                this.TransactionOutcomeDecodera = state2;
                streamState = (state2 == androidx.camera.video.Recorder.State.RECORDING || state2 == androidx.camera.video.Recorder.State.STOPPING) ? androidx.camera.video.StreamInfo.StreamState.ACTIVE : androidx.camera.video.StreamInfo.StreamState.INACTIVE;
            }
        } else if (this.TransactionOutcomeDecodera != null) {
            this.TransactionOutcomeDecodera = null;
        }
        this.rsaCipher = state;
        if (streamState == null) {
            streamState = (state == androidx.camera.video.Recorder.State.RECORDING || state == androidx.camera.video.Recorder.State.STOPPING) ? androidx.camera.video.StreamInfo.StreamState.ACTIVE : androidx.camera.video.StreamInfo.StreamState.INACTIVE;
        }
        this.onNavigationEvent.setState(androidx.camera.video.StreamInfo.getHighSpeedVideoFpsRanges(this.free, streamState, this.TransactionOutcomeDecoderExternalSyntheticLambda2));
    }

    final void getHighSpeedVideoFpsRangesFor(android.view.Surface surface) {
        int hashCode;
        if (this.coroutineBoundary == surface) {
            return;
        }
        this.coroutineBoundary = surface;
        synchronized (this.getARTIFICIAL_FRAME_PACKAGE_NAME) {
            if (surface != null) {
                try {
                    hashCode = surface.hashCode();
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            } else {
                hashCode = 0;
            }
            getHighSpeedVideoSizes(hashCode);
        }
    }

    final void getHighSpeedVideoSizes(int i) {
        if (this.free == i) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Transitioning streamId: ");
        sb.append(this.free);
        sb.append(" --> ");
        sb.append(i);
        androidx.camera.core.Logger.d("Recorder", sb.toString());
        this.free = i;
        androidx.camera.core.impl.MutableStateObservable<androidx.camera.video.StreamInfo> mutableStateObservable = this.onNavigationEvent;
        androidx.camera.video.Recorder.State state = this.rsaCipher;
        mutableStateObservable.setState(androidx.camera.video.StreamInfo.getHighSpeedVideoFpsRanges(i, (state == androidx.camera.video.Recorder.State.RECORDING || state == androidx.camera.video.Recorder.State.STOPPING) ? androidx.camera.video.StreamInfo.StreamState.ACTIVE : androidx.camera.video.StreamInfo.StreamState.INACTIVE, this.TransactionOutcomeDecoderExternalSyntheticLambda2));
    }

    private void getHighSpeedVideoFpsRangesFor(androidx.camera.core.SurfaceRequest.TransformationInfo transformationInfo) {
        androidx.camera.core.Logger.d("Recorder", "Update stream transformation info: ".concat(java.lang.String.valueOf(transformationInfo)));
        this.TransactionOutcomeDecoderExternalSyntheticLambda2 = transformationInfo;
        synchronized (this.getARTIFICIAL_FRAME_PACKAGE_NAME) {
            androidx.camera.core.impl.MutableStateObservable<androidx.camera.video.StreamInfo> mutableStateObservable = this.onNavigationEvent;
            int i = this.free;
            androidx.camera.video.Recorder.State state = this.rsaCipher;
            mutableStateObservable.setState(androidx.camera.video.StreamInfo.getHighSpeedVideoFpsRanges(i, (state == androidx.camera.video.Recorder.State.RECORDING || state == androidx.camera.video.Recorder.State.STOPPING) ? androidx.camera.video.StreamInfo.StreamState.ACTIVE : androidx.camera.video.StreamInfo.StreamState.INACTIVE, transformationInfo));
        }
    }

    private void Camera2StreamConfigurationMap(androidx.camera.video.Recorder.State state) {
        if (!apply.contains(this.rsaCipher)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Can only updated non-pending state from a pending state, but state is ");
            sb.append(this.rsaCipher);
            throw new java.lang.AssertionError(sb.toString());
        }
        if (!decode.contains(state)) {
            throw new java.lang.AssertionError("Invalid state transition. State is not a valid non-pending state while in a pending state: ".concat(java.lang.String.valueOf(state)));
        }
        if (this.TransactionOutcomeDecodera != state) {
            this.TransactionOutcomeDecodera = state;
            this.onNavigationEvent.setState(androidx.camera.video.StreamInfo.getHighSpeedVideoFpsRanges(this.free, (state == androidx.camera.video.Recorder.State.RECORDING || state == androidx.camera.video.Recorder.State.STOPPING) ? androidx.camera.video.StreamInfo.StreamState.ACTIVE : androidx.camera.video.StreamInfo.StreamState.INACTIVE, this.TransactionOutcomeDecoderExternalSyntheticLambda2));
        }
    }

    final void getHighSpeedVideoFpsRanges() {
        if (!apply.contains(this.rsaCipher)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot restore non-pending state when in state ");
            sb.append(this.rsaCipher);
            throw new java.lang.AssertionError(sb.toString());
        }
        getHighSpeedVideoSizes(this.TransactionOutcomeDecodera);
    }

    final void getHighResolutionOutputSizeshNQ4ISI(androidx.camera.video.Recorder.AudioState audioState) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Transitioning audio state: ");
        sb.append(this.getOutputStallDuration);
        sb.append(" --> ");
        sb.append(audioState);
        androidx.camera.core.Logger.d("Recorder", sb.toString());
        this.getOutputStallDuration = audioState;
    }

    public static androidx.camera.video.VideoCapabilities getVideoCapabilities(androidx.camera.core.CameraInfo cameraInfo) {
        return getHighSpeedVideoFpsRanges(1, cameraInfo, 0, androidx.camera.video.VideoSpec.MIME_TYPE_UNSPECIFIED);
    }

    public static androidx.camera.video.VideoCapabilities getVideoCapabilities(androidx.camera.core.CameraInfo cameraInfo, java.lang.String str) {
        return getHighSpeedVideoFpsRanges(1, cameraInfo, 0, str);
    }

    public static androidx.camera.video.VideoCapabilities getVideoCapabilities(androidx.camera.core.CameraInfo cameraInfo, int i) {
        return getHighSpeedVideoFpsRanges(1, cameraInfo, i, androidx.camera.video.VideoSpec.MIME_TYPE_UNSPECIFIED);
    }

    public static androidx.camera.video.VideoCapabilities getHighSpeedVideoCapabilities(androidx.camera.core.CameraInfo cameraInfo) {
        return getHighSpeedVideoCapabilities(cameraInfo, 0);
    }

    public static androidx.camera.video.VideoCapabilities getHighSpeedVideoCapabilities(androidx.camera.core.CameraInfo cameraInfo, int i) {
        androidx.camera.video.VideoCapabilities highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(2, cameraInfo, i, androidx.camera.video.VideoSpec.MIME_TYPE_UNSPECIFIED);
        if (highSpeedVideoFpsRanges.getSupportedDynamicRanges().isEmpty()) {
            return null;
        }
        return highSpeedVideoFpsRanges;
    }

    private static androidx.camera.video.VideoCapabilities getHighSpeedVideoFpsRanges(int i, androidx.camera.core.CameraInfo cameraInfo, int i2, java.lang.String str) {
        androidx.camera.core.impl.CameraInfoInternal cameraInfoInternal = (androidx.camera.core.impl.CameraInfoInternal) cameraInfo;
        if (androidx.camera.video.VideoSpec.MIME_TYPE_UNSPECIFIED.equals(str)) {
            return new androidx.camera.video.RecorderVideoCapabilities(androidx.camera.video.EncoderProfilesResolverFactory.getResolver(cameraInfo, i, i2, kernelID), cameraInfoInternal);
        }
        return new androidx.camera.video.MimeMatchedVideoCapabilities(str, cameraInfoInternal, kernelID);
    }

    @Override // androidx.camera.video.VideoOutput
    public final androidx.camera.video.EncoderProfilesResolver getEncoderProfilesResolver(androidx.camera.core.CameraInfo cameraInfo, int i) {
        return androidx.camera.video.EncoderProfilesResolverFactory.getResolver(cameraInfo, i == 1 ? 2 : 1, this.getInterfaceVersion, kernelID);
    }

    /* loaded from: classes6.dex */
    static abstract class RecordingRecord implements java.lang.AutoCloseable {
        final androidx.camera.core.impl.utils.CloseGuardHelper Camera2StreamConfigurationMap = androidx.camera.core.impl.utils.CloseGuardHelper.create();
        final java.util.concurrent.atomic.AtomicBoolean getHighSpeedVideoFpsRanges = new java.util.concurrent.atomic.AtomicBoolean(false);
        final java.util.concurrent.atomic.AtomicReference<androidx.camera.video.Recorder.RecordingRecord.MuxerSupplier> getHighResolutionOutputSizeshNQ4ISI = new java.util.concurrent.atomic.AtomicReference<>(null);
        final java.util.concurrent.atomic.AtomicReference<androidx.camera.video.Recorder.RecordingRecord.AudioSourceSupplier> getHighSpeedVideoSizes = new java.util.concurrent.atomic.AtomicReference<>(null);
        final java.util.concurrent.atomic.AtomicReference<androidx.core.util.Consumer<android.net.Uri>> getHighSpeedVideoSizesFor = new java.util.concurrent.atomic.AtomicReference<>(new androidx.core.util.Consumer() { // from class: androidx.camera.video.Recorder$RecordingRecord$$ExternalSyntheticLambda2
            @Override // androidx.core.util.Consumer
            public final void accept(java.lang.Object obj) {
                androidx.camera.video.Recorder.RecordingRecord.getOutputMinFrameDuration();
            }
        });
        final java.util.concurrent.atomic.AtomicBoolean getHighSpeedVideoFpsRangesFor = new java.util.concurrent.atomic.AtomicBoolean(false);
        final androidx.camera.core.impl.MutableStateObservable<java.lang.Boolean> getInputFormats = androidx.camera.core.impl.MutableStateObservable.withInitialState(java.lang.Boolean.FALSE);

        interface AudioSourceSupplier {
            androidx.camera.video.internal.audio.AudioSource getHighSpeedVideoSizes(androidx.camera.video.internal.audio.AudioSettings audioSettings, java.util.concurrent.Executor executor) throws androidx.camera.video.internal.audio.AudioSourceAccessException;
        }

        interface MuxerSupplier {
            androidx.camera.video.internal.muxer.Muxer get(int i, androidx.core.util.Consumer<android.net.Uri> consumer) throws java.io.IOException;
        }

        static /* synthetic */ void getOutputMinFrameDuration() {
        }

        abstract androidx.camera.video.OutputOptions Camera2StreamConfigurationMap();

        abstract boolean getHighResolutionOutputSizeshNQ4ISI();

        abstract androidx.core.util.Consumer<androidx.camera.video.VideoRecordEvent> getHighSpeedVideoFpsRanges();

        abstract long getHighSpeedVideoFpsRangesFor();

        abstract java.util.concurrent.Executor getHighSpeedVideoSizes();

        abstract boolean getInputSizeshNQ4ISI();

        RecordingRecord() {
        }

        static androidx.camera.video.Recorder.RecordingRecord getHighSpeedVideoFpsRangesFor(androidx.camera.video.PendingRecording pendingRecording, long j) {
            androidx.camera.video.AutoValue_Recorder_RecordingRecord autoValue_Recorder_RecordingRecord = new androidx.camera.video.AutoValue_Recorder_RecordingRecord(pendingRecording.getGetHighSpeedVideoSizes(), pendingRecording.getGetHighResolutionOutputSizeshNQ4ISI(), pendingRecording.getEventListener(), pendingRecording.getGetOutputFormats(), pendingRecording.getGetInputFormats(), j);
            autoValue_Recorder_RecordingRecord.getHighSpeedVideoFpsRangesFor.set(pendingRecording.getGetOutputMinFrameDuration());
            return autoValue_Recorder_RecordingRecord;
        }

        static /* synthetic */ androidx.camera.video.internal.muxer.Muxer getHighSpeedVideoFpsRangesFor(androidx.camera.video.internal.muxer.MuxerFactory muxerFactory, androidx.camera.video.OutputOptions outputOptions, android.os.ParcelFileDescriptor parcelFileDescriptor, int i, androidx.core.util.Consumer consumer) throws java.io.IOException {
            androidx.camera.video.internal.muxer.Muxer create = muxerFactory.create(i);
            android.net.Uri uri = android.net.Uri.EMPTY;
            if (outputOptions instanceof androidx.camera.video.FileOutputOptions) {
                java.io.File file = ((androidx.camera.video.FileOutputOptions) outputOptions).getFile();
                if (!androidx.camera.video.internal.utils.OutputUtil.createParentFolder(file)) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed to create folder for ");
                    sb.append(file.getAbsolutePath());
                    androidx.camera.core.Logger.w("Recorder", sb.toString());
                }
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Muxer.setOutput by path = ");
                sb2.append(file.getAbsolutePath());
                androidx.camera.core.Logger.d("Recorder", sb2.toString());
                create.setOutput(file.getAbsolutePath(), i);
                uri = android.net.Uri.fromFile(file);
            } else if (outputOptions instanceof androidx.camera.video.FileDescriptorOutputOptions) {
                androidx.camera.core.Logger.d("Recorder", "Muxer.setOutput by ParcelFileDescriptor");
                create.setOutput(parcelFileDescriptor, i);
            } else if (outputOptions instanceof androidx.camera.video.MediaStoreOutputOptions) {
                androidx.camera.video.MediaStoreOutputOptions mediaStoreOutputOptions = (androidx.camera.video.MediaStoreOutputOptions) outputOptions;
                android.content.ContentValues contentValues = new android.content.ContentValues(mediaStoreOutputOptions.getContentValues());
                if (android.os.Build.VERSION.SDK_INT >= 29 && !create.isInterruptionResilient()) {
                    contentValues.put("is_pending", (java.lang.Integer) 1);
                }
                try {
                    uri = mediaStoreOutputOptions.getContentResolver().insert(mediaStoreOutputOptions.getCollectionUri(), contentValues);
                    if (uri == null) {
                        throw new java.io.IOException("Unable to create MediaStore entry.");
                    }
                    android.os.ParcelFileDescriptor openFileDescriptor = mediaStoreOutputOptions.getContentResolver().openFileDescriptor(uri, "rw");
                    if (openFileDescriptor == null) {
                        throw new java.io.IOException("Unable to open file descriptor from uri ".concat(java.lang.String.valueOf(uri)));
                    }
                    try {
                        androidx.camera.core.Logger.d("Recorder", "Muxer.setOutput by ParcelFileDescriptor");
                        create.setOutput(openFileDescriptor, i);
                    } catch (java.io.IOException e) {
                        openFileDescriptor.close();
                        throw e;
                    }
                } catch (java.lang.RuntimeException e2) {
                    throw new java.io.IOException("Unable to create MediaStore entry by ".concat(java.lang.String.valueOf(e2)), e2);
                }
            } else {
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Invalid output options type: ");
                sb3.append(outputOptions.getClass().getSimpleName());
                throw new java.lang.AssertionError(sb3.toString());
            }
            consumer.accept(uri);
            return create;
        }

        static /* synthetic */ void getHighResolutionOutputSizeshNQ4ISI(androidx.camera.video.MediaStoreOutputOptions mediaStoreOutputOptions, android.net.Uri uri) {
            if (uri.equals(android.net.Uri.EMPTY)) {
                return;
            }
            android.content.ContentValues contentValues = new android.content.ContentValues();
            contentValues.put("is_pending", (java.lang.Integer) 0);
            mediaStoreOutputOptions.getContentResolver().update(uri, contentValues, null, null);
        }

        static /* synthetic */ void getHighSpeedVideoFpsRanges(androidx.camera.video.MediaStoreOutputOptions mediaStoreOutputOptions, android.content.Context context, android.net.Uri uri) {
            if (uri.equals(android.net.Uri.EMPTY)) {
                return;
            }
            java.lang.String absolutePathFromUri = androidx.camera.video.internal.utils.OutputUtil.getAbsolutePathFromUri(mediaStoreOutputOptions.getContentResolver(), uri, "_data");
            if (absolutePathFromUri != null) {
                android.media.MediaScannerConnection.scanFile(context, new java.lang.String[]{absolutePathFromUri}, null, new android.media.MediaScannerConnection.OnScanCompletedListener() { // from class: androidx.camera.video.Recorder$RecordingRecord$$ExternalSyntheticLambda0
                    @Override // android.media.MediaScannerConnection.OnScanCompletedListener
                    public final void onScanCompleted(java.lang.String str, android.net.Uri uri2) {
                        androidx.camera.video.Recorder.RecordingRecord.getHighSpeedVideoFpsRangesFor(str, uri2);
                    }
                });
            } else {
                androidx.camera.core.Logger.d("Recorder", "Skipping media scanner scan. Unable to retrieve file path from URI: ".concat(java.lang.String.valueOf(uri)));
            }
        }

        static /* synthetic */ void getHighSpeedVideoFpsRangesFor(java.lang.String str, android.net.Uri uri) {
            if (uri == null) {
                androidx.camera.core.Logger.e("Recorder", java.lang.String.format("File scanning operation failed [path: %s]", str));
            } else {
                androidx.camera.core.Logger.d("Recorder", java.lang.String.format("File scan completed successfully [path: %s, URI: %s]", str, uri));
            }
        }

        static androidx.camera.video.Recorder.RecordingRecord.AudioSourceSupplier getHighResolutionOutputSizeshNQ4ISI(final android.content.Context context) {
            if (android.os.Build.VERSION.SDK_INT < 31) {
                context = null;
            }
            return new androidx.camera.video.Recorder.RecordingRecord.AudioSourceSupplier() { // from class: androidx.camera.video.Recorder.RecordingRecord.1
                @Override // androidx.camera.video.Recorder.RecordingRecord.AudioSourceSupplier
                public final androidx.camera.video.internal.audio.AudioSource getHighSpeedVideoSizes(androidx.camera.video.internal.audio.AudioSettings audioSettings, java.util.concurrent.Executor executor) throws androidx.camera.video.internal.audio.AudioSourceAccessException {
                    return new androidx.camera.video.internal.audio.AudioSource(audioSettings, executor, context);
                }
            };
        }

        final void getHighSpeedVideoFpsRanges(final androidx.camera.video.VideoRecordEvent videoRecordEvent, boolean z) {
            if (!java.util.Objects.equals(videoRecordEvent.getOutputOptions(), Camera2StreamConfigurationMap())) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Attempted to update event listener with event from incorrect recording [Recording: ");
                sb.append(videoRecordEvent.getOutputOptions());
                sb.append(", Expected: ");
                sb.append(Camera2StreamConfigurationMap());
                sb.append("]");
                throw new java.lang.AssertionError(sb.toString());
            }
            if (z) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Sending VideoRecordEvent ");
                sb2.append(videoRecordEvent.getClass().getSimpleName());
                java.lang.String obj = sb2.toString();
                if (videoRecordEvent instanceof androidx.camera.video.VideoRecordEvent.Finalize) {
                    androidx.camera.video.VideoRecordEvent.Finalize finalize = (androidx.camera.video.VideoRecordEvent.Finalize) videoRecordEvent;
                    if (finalize.hasError()) {
                        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                        sb3.append(obj);
                        sb3.append(java.lang.String.format(" [error: %s]", androidx.camera.video.VideoRecordEvent.Finalize.Camera2StreamConfigurationMap(finalize.getError())));
                        obj = sb3.toString();
                    }
                }
                androidx.camera.core.Logger.d("Recorder", obj);
            }
            getHighSpeedVideoFpsRangesFor(videoRecordEvent);
            if (getHighSpeedVideoSizes() == null || getHighSpeedVideoFpsRanges() == null) {
                return;
            }
            try {
                getHighSpeedVideoSizes().execute(new java.lang.Runnable() { // from class: androidx.camera.video.Recorder$RecordingRecord$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.camera.video.Recorder.RecordingRecord recordingRecord = androidx.camera.video.Recorder.RecordingRecord.this;
                        recordingRecord.getHighSpeedVideoFpsRanges().accept(videoRecordEvent);
                    }
                });
            } catch (java.util.concurrent.RejectedExecutionException e) {
                androidx.camera.core.Logger.e("Recorder", "The callback executor is invalid.", e);
            }
        }

        private void getHighSpeedVideoFpsRangesFor(androidx.camera.video.VideoRecordEvent videoRecordEvent) {
            if ((videoRecordEvent instanceof androidx.camera.video.VideoRecordEvent.Start) || (videoRecordEvent instanceof androidx.camera.video.VideoRecordEvent.Resume)) {
                this.getInputFormats.setState(java.lang.Boolean.TRUE);
            } else if ((videoRecordEvent instanceof androidx.camera.video.VideoRecordEvent.Pause) || (videoRecordEvent instanceof androidx.camera.video.VideoRecordEvent.Finalize)) {
                this.getInputFormats.setState(java.lang.Boolean.FALSE);
            }
        }

        final androidx.camera.video.internal.muxer.Muxer getHighResolutionOutputSizeshNQ4ISI(int i, androidx.core.util.Consumer<android.net.Uri> consumer) throws java.io.IOException {
            if (!this.getHighSpeedVideoFpsRanges.get()) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Recording ");
                sb.append(this);
                sb.append(" has not been initialized");
                throw new java.lang.AssertionError(sb.toString());
            }
            androidx.camera.video.Recorder.RecordingRecord.MuxerSupplier andSet = this.getHighResolutionOutputSizeshNQ4ISI.getAndSet(null);
            if (andSet == null) {
                throw new java.lang.AssertionError("One-time muxer creation has already occurred for recording ".concat(java.lang.String.valueOf(this)));
            }
            try {
                return andSet.get(i, consumer);
            } catch (java.lang.RuntimeException e) {
                throw new java.io.IOException("Failed to create Muxer by ".concat(java.lang.String.valueOf(e)), e);
            }
        }

        @Override // java.lang.AutoCloseable
        public void close() {
            android.net.Uri uri = android.net.Uri.EMPTY;
            if (this.getHighSpeedVideoFpsRanges.get()) {
                Camera2StreamConfigurationMap(this.getHighSpeedVideoSizesFor.getAndSet(null), uri);
            }
        }

        protected void finalize() throws java.lang.Throwable {
            try {
                this.Camera2StreamConfigurationMap.warnIfOpen();
                androidx.core.util.Consumer<android.net.Uri> andSet = this.getHighSpeedVideoSizesFor.getAndSet(null);
                if (andSet != null) {
                    Camera2StreamConfigurationMap(andSet, android.net.Uri.EMPTY);
                }
            } finally {
                super.finalize();
            }
        }

        final void Camera2StreamConfigurationMap(androidx.core.util.Consumer<android.net.Uri> consumer, android.net.Uri uri) {
            if (consumer == null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Recording ");
                sb.append(this);
                sb.append(" has already been finalized");
                throw new java.lang.AssertionError(sb.toString());
            }
            this.Camera2StreamConfigurationMap.close();
            consumer.accept(uri);
        }
    }

    public static final class Builder {
        private int getInputSizeshNQ4ISI = 0;
        private java.util.concurrent.Executor getHighResolutionOutputSizeshNQ4ISI = null;
        private androidx.camera.video.internal.encoder.EncoderFactory getOutputMinFrameDuration = androidx.camera.video.Recorder.getHighSpeedVideoFpsRangesFor;
        private androidx.camera.video.internal.encoder.EncoderFactory getHighSpeedVideoSizes = androidx.camera.video.Recorder.getHighSpeedVideoFpsRangesFor;
        private androidx.camera.video.internal.muxer.MuxerFactory getHighSpeedVideoFpsRangesFor = androidx.camera.video.Recorder.BerTlvEncoder;
        private androidx.camera.video.internal.OutputStorage.Factory getHighSpeedVideoFpsRanges = androidx.camera.video.Recorder.encode;
        private long getInputFormats = -1;
        private final androidx.camera.video.MediaSpec.Builder Camera2StreamConfigurationMap = androidx.camera.video.Recorder.provide.toBuilder();

        public final androidx.camera.video.Recorder.Builder setExecutor(java.util.concurrent.Executor executor) {
            androidx.core.util.Preconditions.checkNotNull(executor, "The specified executor can't be null.");
            this.getHighResolutionOutputSizeshNQ4ISI = executor;
            return this;
        }

        public final androidx.camera.video.Recorder.Builder setQualitySelector(final androidx.camera.video.QualitySelector qualitySelector) {
            androidx.core.util.Preconditions.checkNotNull(qualitySelector, "The specified quality selector can't be null.");
            this.Camera2StreamConfigurationMap.configureVideo(new androidx.core.util.Consumer() { // from class: androidx.camera.video.Recorder$Builder$$ExternalSyntheticLambda3
                @Override // androidx.core.util.Consumer
                public final void accept(java.lang.Object obj) {
                    ((androidx.camera.video.VideoSpec.Builder) obj).setQualitySelector(androidx.camera.video.QualitySelector.this);
                }
            });
            return this;
        }

        public final androidx.camera.video.Recorder.Builder setMuxerFactory(androidx.camera.video.internal.muxer.MuxerFactory muxerFactory) {
            this.getHighSpeedVideoFpsRangesFor = muxerFactory;
            return this;
        }

        public final androidx.camera.video.Recorder.Builder setVideoCapabilitiesSource(int i) {
            boolean z = true;
            if (i != 0 && i != 1) {
                z = false;
            }
            androidx.core.util.Preconditions.checkArgument(z, "Not a supported video capabilities source: ".concat(java.lang.String.valueOf(i)));
            this.getInputSizeshNQ4ISI = i;
            return this;
        }

        public final androidx.camera.video.Recorder.Builder setTargetVideoEncodingBitRate(final int i) {
            if (i <= 0) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("The requested target bitrate ");
                sb.append(i);
                sb.append(" is not supported. Target bitrate must be greater than 0.");
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
            this.Camera2StreamConfigurationMap.configureVideo(new androidx.core.util.Consumer() { // from class: androidx.camera.video.Recorder$Builder$$ExternalSyntheticLambda0
                @Override // androidx.core.util.Consumer
                public final void accept(java.lang.Object obj) {
                    ((androidx.camera.video.VideoSpec.Builder) obj).setBitrate(i);
                }
            });
            return this;
        }

        public final androidx.camera.video.Recorder.Builder setAspectRatio(final int i) {
            this.Camera2StreamConfigurationMap.configureVideo(new androidx.core.util.Consumer() { // from class: androidx.camera.video.Recorder$Builder$$ExternalSyntheticLambda2
                @Override // androidx.core.util.Consumer
                public final void accept(java.lang.Object obj) {
                    ((androidx.camera.video.VideoSpec.Builder) obj).setAspectRatio(i);
                }
            });
            return this;
        }

        public final androidx.camera.video.Recorder.Builder setRequiredFreeStorageBytes(long j) {
            androidx.core.util.Preconditions.checkArgument(j > 0);
            this.getInputFormats = j;
            return this;
        }

        public final androidx.camera.video.Recorder.Builder setAudioSource(final int i) {
            this.Camera2StreamConfigurationMap.configureAudio(new androidx.core.util.Consumer() { // from class: androidx.camera.video.Recorder$Builder$$ExternalSyntheticLambda1
                @Override // androidx.core.util.Consumer
                public final void accept(java.lang.Object obj) {
                    ((androidx.camera.video.AudioSpec.Builder) obj).setSource(i);
                }
            });
            return this;
        }

        public final androidx.camera.video.Recorder build() {
            return new androidx.camera.video.Recorder(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap.build(), this.getInputSizeshNQ4ISI, this.getOutputMinFrameDuration, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.getInputFormats);
        }
    }

    static /* synthetic */ java.util.concurrent.ScheduledFuture getHighSpeedVideoSizes(java.lang.Runnable runnable, java.util.concurrent.Executor executor, long j, java.util.concurrent.TimeUnit timeUnit) {
        return androidx.camera.core.impl.utils.executor.CameraXExecutors.mainThreadExecutor().schedule(new androidx.camera.video.Recorder$$ExternalSyntheticLambda0(executor, runnable), j, timeUnit);
    }

    static boolean getHighSpeedVideoFpsRangesFor(androidx.camera.video.Recording recording, androidx.camera.video.Recorder.RecordingRecord recordingRecord) {
        return recordingRecord != null && recording.getHighSpeedVideoFpsRangesFor == recordingRecord.getHighSpeedVideoFpsRangesFor();
    }

    public final androidx.camera.video.PendingRecording prepareRecording(android.content.Context context, androidx.camera.video.FileDescriptorOutputOptions fileDescriptorOutputOptions) {
        androidx.core.util.Preconditions.checkNotNull(fileDescriptorOutputOptions, "The OutputOptions cannot be null.");
        return new androidx.camera.video.PendingRecording(context, this, fileDescriptorOutputOptions);
    }

    public final androidx.camera.video.PendingRecording prepareRecording(android.content.Context context, androidx.camera.video.FileOutputOptions fileOutputOptions) {
        androidx.core.util.Preconditions.checkNotNull(fileOutputOptions, "The OutputOptions cannot be null.");
        return new androidx.camera.video.PendingRecording(context, this, fileOutputOptions);
    }

    public final androidx.camera.video.PendingRecording prepareRecording(android.content.Context context, androidx.camera.video.MediaStoreOutputOptions mediaStoreOutputOptions) {
        androidx.core.util.Preconditions.checkNotNull(mediaStoreOutputOptions, "The OutputOptions cannot be null.");
        return new androidx.camera.video.PendingRecording(context, this, mediaStoreOutputOptions);
    }
}
