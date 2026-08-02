package androidx.camera.video.internal.encoder;

/* loaded from: classes6.dex */
public class EncoderImpl implements androidx.camera.video.internal.encoder.Encoder {
    private static final android.util.Range<java.lang.Long> b = android.util.Range.create(Long.MAX_VALUE, Long.MAX_VALUE);
    private final androidx.concurrent.futures.CallbackToFutureAdapter.Completer<java.lang.Void> AMEXKernel;
    final androidx.camera.video.internal.encoder.TimeProvider ArtificialStackFrames;
    androidx.camera.video.internal.encoder.EncoderImpl.InternalState CoroutineDebuggingKt;

    /* renamed from: a, reason: collision with root package name */
    private final android.util.Rational f2677a;
    final java.lang.String coroutineCreation;
    private final com.google.common.util.concurrent.ListenableFuture<java.lang.Void> d;
    private final androidx.camera.video.internal.encoder.EncoderInfo getARTIFICIAL_FRAME_PACKAGE_NAME;
    final boolean getHighSpeedVideoFpsRanges;
    final androidx.camera.video.internal.encoder.Encoder.EncoderInput getInputFormats;
    final java.util.concurrent.Executor getOutputMinFrameDuration;
    final boolean getOutputMinFrameDurationlomOqCM;
    final androidx.camera.core.impl.Timebase getOutputStallDuration;
    private java.util.concurrent.Future<?> init;
    final android.media.MediaCodec isOutputSupportedForhNQ4ISI;
    final android.media.MediaFormat unwrapAs;
    final java.lang.Object getOutputSizes = new java.lang.Object();
    final java.util.Queue<java.lang.Integer> getOutputFormats = new java.util.ArrayDeque();
    final java.util.Queue<androidx.concurrent.futures.CallbackToFutureAdapter.Completer<androidx.camera.video.internal.encoder.InputBuffer>> getHighSpeedVideoFpsRangesFor = new java.util.ArrayDeque();
    final java.util.Set<androidx.camera.video.internal.encoder.InputBuffer> getHighSpeedVideoSizesFor = new java.util.HashSet();
    final java.util.Set<androidx.camera.video.internal.encoder.EncodedDataImpl> getHighSpeedVideoSizes = new java.util.HashSet();
    final java.util.Deque<android.util.Range<java.lang.Long>> Camera2StreamConfigurationMap = new java.util.ArrayDeque();
    androidx.camera.video.internal.encoder.EncoderCallback getHighResolutionOutputSizeshNQ4ISI = androidx.camera.video.internal.encoder.EncoderCallback.EMPTY;
    java.util.concurrent.Executor getInputSizeshNQ4ISI = androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor();
    android.util.Range<java.lang.Long> accessartificialFrame = b;
    long _BOUNDARY = 0;
    boolean toString = false;
    java.lang.Long getOutputSizeshNQ4ISI = null;
    java.util.concurrent.Future<?> coroutineBoundary = null;
    private androidx.camera.video.internal.encoder.EncoderImpl.MediaCodecCallback _CREATION = null;
    boolean getOutputStallDurationlomOqCM = false;
    boolean getValidOutputFormatsForInputhNQ4ISI = false;
    boolean isOutputSupportedFor = false;

    enum InternalState {
        CONFIGURED,
        STARTED,
        PAUSED,
        STOPPING,
        PENDING_START,
        PENDING_START_PAUSED,
        PENDING_RELEASE,
        ERROR,
        RELEASED
    }

    static /* synthetic */ java.util.concurrent.Future getHighSpeedVideoSizes(androidx.camera.video.internal.encoder.EncoderImpl encoderImpl) {
        encoderImpl.init = null;
        return null;
    }

    public EncoderImpl(java.util.concurrent.Executor executor, androidx.camera.video.internal.encoder.EncoderConfig encoderConfig, int i) throws androidx.camera.video.internal.encoder.InvalidConfigException {
        boolean z = false;
        androidx.core.util.Preconditions.checkNotNull(executor);
        android.media.MediaCodec createCodec = androidx.camera.video.internal.utils.CodecUtil.createCodec(encoderConfig);
        this.isOutputSupportedForhNQ4ISI = createCodec;
        android.media.MediaCodecInfo codecInfo = createCodec.getCodecInfo();
        this.getOutputMinFrameDuration = androidx.camera.core.impl.utils.executor.CameraXExecutors.newSequentialExecutor(executor);
        android.media.MediaFormat mediaFormat = encoderConfig.toMediaFormat();
        this.unwrapAs = mediaFormat;
        androidx.camera.core.impl.Timebase inputTimebase = encoderConfig.getInputTimebase();
        this.getOutputStallDuration = inputTimebase;
        final androidx.camera.video.internal.encoder.SystemTimeProvider systemTimeProvider = new androidx.camera.video.internal.encoder.SystemTimeProvider();
        final androidx.arch.core.util.Function function = new androidx.arch.core.util.Function() { // from class: androidx.camera.video.internal.encoder.EncoderImpl$$ExternalSyntheticLambda10
            @Override // androidx.arch.core.util.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return java.lang.Long.valueOf(androidx.camera.video.internal.encoder.EncoderImpl.$r8$lambda$kfgy1ft7hGhWsVbp27upmh1easY(androidx.camera.video.internal.encoder.EncoderImpl.this, ((java.lang.Long) obj).longValue()));
            }
        };
        this.ArtificialStackFrames = new androidx.camera.video.internal.encoder.TimeProvider() { // from class: androidx.camera.video.internal.encoder.EncoderImpl.3
            @Override // androidx.camera.video.internal.encoder.TimeProvider
            public long uptimeUs() {
                return ((java.lang.Long) androidx.arch.core.util.Function.this.apply(java.lang.Long.valueOf(systemTimeProvider.uptimeUs()))).longValue();
            }

            @Override // androidx.camera.video.internal.encoder.TimeProvider
            public long realtimeUs() {
                return ((java.lang.Long) androidx.arch.core.util.Function.this.apply(java.lang.Long.valueOf(systemTimeProvider.realtimeUs()))).longValue();
            }
        };
        if (encoderConfig instanceof androidx.camera.video.internal.encoder.AudioEncoderConfig) {
            androidx.camera.video.internal.encoder.AudioEncoderConfig audioEncoderConfig = (androidx.camera.video.internal.encoder.AudioEncoderConfig) encoderConfig;
            this.coroutineCreation = "AudioEncoder";
            this.getOutputMinFrameDurationlomOqCM = false;
            this.getInputFormats = new androidx.camera.video.internal.encoder.EncoderImpl.ByteBufferInput();
            this.getARTIFICIAL_FRAME_PACKAGE_NAME = new androidx.camera.video.internal.encoder.AudioEncoderInfoImpl(codecInfo, encoderConfig.getMimeType());
            this.f2677a = new android.util.Rational(audioEncoderConfig.getCaptureSampleRate(), audioEncoderConfig.getEncodeSampleRate());
        } else if (encoderConfig instanceof androidx.camera.video.internal.encoder.VideoEncoderConfig) {
            androidx.camera.video.internal.encoder.VideoEncoderConfig videoEncoderConfig = (androidx.camera.video.internal.encoder.VideoEncoderConfig) encoderConfig;
            this.coroutineCreation = "VideoEncoder";
            this.getOutputMinFrameDurationlomOqCM = true;
            this.getInputFormats = new androidx.camera.video.internal.encoder.EncoderImpl.SurfaceInput();
            androidx.camera.video.internal.encoder.VideoEncoderInfoImpl videoEncoderInfoImpl = new androidx.camera.video.internal.encoder.VideoEncoderInfoImpl(codecInfo, encoderConfig.getMimeType());
            androidx.core.util.Preconditions.checkState(true);
            if (mediaFormat.containsKey("bitrate")) {
                int integer = mediaFormat.getInteger("bitrate");
                int intValue = videoEncoderInfoImpl.getSupportedBitrateRange().clamp(java.lang.Integer.valueOf(integer)).intValue();
                if (integer != intValue) {
                    mediaFormat.setInteger("bitrate", intValue);
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("updated bitrate from ");
                    sb.append(integer);
                    sb.append(" to ");
                    sb.append(intValue);
                    androidx.camera.core.Logger.d("VideoEncoder", sb.toString());
                }
            }
            this.getARTIFICIAL_FRAME_PACKAGE_NAME = videoEncoderInfoImpl;
            this.f2677a = new android.util.Rational(videoEncoderConfig.getCaptureFrameRate(), videoEncoderConfig.getEncodeFrameRate());
        } else {
            throw new androidx.camera.video.internal.encoder.InvalidConfigException("Unknown encoder config type");
        }
        androidx.camera.core.Logger.d(this.coroutineCreation, "mInputTimebase = ".concat(java.lang.String.valueOf(inputTimebase)));
        androidx.camera.core.Logger.d(this.coroutineCreation, "mMediaFormat = ".concat(java.lang.String.valueOf(mediaFormat)));
        java.lang.String str = this.coroutineCreation;
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("mCaptureToEncodeFrameRateRatio = ");
        sb2.append(this.f2677a);
        androidx.camera.core.Logger.d(str, sb2.toString());
        try {
            getHighSpeedVideoSizes();
            final java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
            this.d = androidx.camera.core.impl.utils.futures.Futures.nonCancellationPropagating(androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(new androidx.concurrent.futures.CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.video.internal.encoder.EncoderImpl$$ExternalSyntheticLambda11
                @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                public final java.lang.Object attachCompleter(androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer) {
                    return androidx.camera.video.internal.encoder.EncoderImpl.getHighSpeedVideoFpsRangesFor(atomicReference, completer);
                }
            }));
            this.AMEXKernel = (androidx.concurrent.futures.CallbackToFutureAdapter.Completer) androidx.core.util.Preconditions.checkNotNull((androidx.concurrent.futures.CallbackToFutureAdapter.Completer) atomicReference.get());
            if (this.getOutputMinFrameDurationlomOqCM && ((i == 1 && androidx.camera.video.internal.compat.quirk.DeviceQuirks.get(androidx.camera.video.internal.compat.quirk.PreviewFreezeAfterHighSpeedRecordingQuirk.class) != null) || androidx.camera.video.internal.compat.quirk.DeviceQuirks.get(androidx.camera.video.internal.compat.quirk.GLProcessingStuckOnCodecFlushQuirk.class) != null)) {
                z = true;
            }
            this.getHighSpeedVideoFpsRanges = z;
            getHighSpeedVideoFpsRangesFor(androidx.camera.video.internal.encoder.EncoderImpl.InternalState.CONFIGURED);
        } catch (android.media.MediaCodec.CodecException e) {
            throw new androidx.camera.video.internal.encoder.InvalidConfigException(e);
        }
    }

    static /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor(java.util.concurrent.atomic.AtomicReference atomicReference, androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer) throws java.lang.Exception {
        atomicReference.set(completer);
        return "mReleasedFuture";
    }

    final void getHighSpeedVideoSizes() {
        this.accessartificialFrame = b;
        this._BOUNDARY = 0L;
        this.Camera2StreamConfigurationMap.clear();
        this.getOutputFormats.clear();
        java.util.Iterator<androidx.concurrent.futures.CallbackToFutureAdapter.Completer<androidx.camera.video.internal.encoder.InputBuffer>> it = this.getHighSpeedVideoFpsRangesFor.iterator();
        while (it.hasNext()) {
            it.next().setCancelled();
        }
        this.getHighSpeedVideoFpsRangesFor.clear();
        androidx.camera.core.Logger.d(this.coroutineCreation, "mMediaCodec.reset()");
        this.isOutputSupportedForhNQ4ISI.reset();
        this.getOutputStallDurationlomOqCM = false;
        this.getValidOutputFormatsForInputhNQ4ISI = false;
        this.isOutputSupportedFor = false;
        this.toString = false;
        java.util.concurrent.Future<?> future = this.coroutineBoundary;
        if (future != null) {
            future.cancel(true);
            this.coroutineBoundary = null;
        }
        java.util.concurrent.Future<?> future2 = this.init;
        if (future2 != null) {
            future2.cancel(false);
            this.init = null;
        }
        androidx.camera.video.internal.encoder.EncoderImpl.MediaCodecCallback mediaCodecCallback = this._CREATION;
        if (mediaCodecCallback != null) {
            mediaCodecCallback.getHighSpeedVideoSizesFor = true;
        }
        this._CREATION = new androidx.camera.video.internal.encoder.EncoderImpl.MediaCodecCallback();
        androidx.camera.core.Logger.d(this.coroutineCreation, "mMediaCodec.setCallback()");
        this.isOutputSupportedForhNQ4ISI.setCallback(this._CREATION);
        androidx.camera.core.Logger.d(this.coroutineCreation, "mMediaCodec.configure()");
        this.isOutputSupportedForhNQ4ISI.configure(this.unwrapAs, (android.view.Surface) null, (android.media.MediaCrypto) null, 1);
        androidx.camera.video.internal.encoder.Encoder.EncoderInput encoderInput = this.getInputFormats;
        if (encoderInput instanceof androidx.camera.video.internal.encoder.EncoderImpl.SurfaceInput) {
            androidx.camera.video.internal.encoder.EncoderImpl.SurfaceInput surfaceInput = (androidx.camera.video.internal.encoder.EncoderImpl.SurfaceInput) encoderInput;
            androidx.camera.video.internal.encoder.EncoderImpl.this.isOutputSupportedForhNQ4ISI.setInputSurface(surfaceInput.getSurface());
        }
    }

    @Override // androidx.camera.video.internal.encoder.Encoder
    public androidx.camera.video.internal.encoder.Encoder.EncoderInput getInput() {
        return this.getInputFormats;
    }

    @Override // androidx.camera.video.internal.encoder.Encoder
    public androidx.camera.video.internal.encoder.EncoderInfo getEncoderInfo() {
        return this.getARTIFICIAL_FRAME_PACKAGE_NAME;
    }

    @Override // androidx.camera.video.internal.encoder.Encoder
    public int getConfiguredBitrate() {
        if (this.unwrapAs.containsKey("bitrate")) {
            return this.unwrapAs.getInteger("bitrate");
        }
        return 0;
    }

    @Override // androidx.camera.video.internal.encoder.Encoder
    public void stop() {
        stop(-1L);
    }

    final void getInputFormats() {
        androidx.camera.core.Logger.d(this.coroutineCreation, "signalCodecStop");
        androidx.camera.video.internal.encoder.Encoder.EncoderInput encoderInput = this.getInputFormats;
        if (encoderInput instanceof androidx.camera.video.internal.encoder.EncoderImpl.ByteBufferInput) {
            ((androidx.camera.video.internal.encoder.EncoderImpl.ByteBufferInput) encoderInput).Camera2StreamConfigurationMap(false);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator<androidx.camera.video.internal.encoder.InputBuffer> it = this.getHighSpeedVideoSizesFor.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getTerminationFuture());
            }
            androidx.camera.core.impl.utils.futures.Futures.successfulAsList(arrayList).addListener(new java.lang.Runnable() { // from class: androidx.camera.video.internal.encoder.EncoderImpl$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.video.internal.encoder.EncoderImpl.$r8$lambda$SlAnbggd9lEp59VusripYrYneuw(androidx.camera.video.internal.encoder.EncoderImpl.this);
                }
            }, this.getOutputMinFrameDuration);
            return;
        }
        if (encoderInput instanceof androidx.camera.video.internal.encoder.EncoderImpl.SurfaceInput) {
            try {
                if (androidx.camera.video.internal.compat.quirk.DeviceQuirks.get(androidx.camera.video.internal.compat.quirk.SignalEosOutputBufferNotComeQuirk.class) != null) {
                    final androidx.camera.video.internal.encoder.EncoderImpl.MediaCodecCallback mediaCodecCallback = this._CREATION;
                    final java.util.concurrent.Executor executor = this.getOutputMinFrameDuration;
                    java.util.concurrent.Future<?> future = this.init;
                    if (future != null) {
                        future.cancel(false);
                    }
                    this.init = androidx.camera.core.impl.utils.executor.CameraXExecutors.mainThreadExecutor().schedule(new java.lang.Runnable() { // from class: androidx.camera.video.internal.encoder.EncoderImpl$$ExternalSyntheticLambda5
                        @Override // java.lang.Runnable
                        public final void run() {
                            androidx.camera.video.internal.encoder.EncoderImpl.getHighSpeedVideoFpsRangesFor(executor, mediaCodecCallback);
                        }
                    }, 1000L, java.util.concurrent.TimeUnit.MILLISECONDS);
                }
                androidx.camera.core.Logger.d(this.coroutineCreation, "mMediaCodec.signalEndOfInputStream()");
                this.isOutputSupportedForhNQ4ISI.signalEndOfInputStream();
                this.isOutputSupportedFor = true;
            } catch (android.media.MediaCodec.CodecException e) {
                Camera2StreamConfigurationMap(1, e.getMessage(), e);
            }
        }
    }

    @Override // androidx.camera.video.internal.encoder.Encoder
    public void release() {
        this.getOutputMinFrameDuration.execute(new java.lang.Runnable() { // from class: androidx.camera.video.internal.encoder.EncoderImpl$$ExternalSyntheticLambda14
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.video.internal.encoder.EncoderImpl encoderImpl = androidx.camera.video.internal.encoder.EncoderImpl.this;
                switch (encoderImpl.CoroutineDebuggingKt) {
                    case CONFIGURED:
                    case STARTED:
                    case PAUSED:
                    case ERROR:
                        encoderImpl.getHighSpeedVideoFpsRanges();
                        return;
                    case STOPPING:
                    case PENDING_START:
                    case PENDING_START_PAUSED:
                        encoderImpl.getHighSpeedVideoFpsRangesFor(androidx.camera.video.internal.encoder.EncoderImpl.InternalState.PENDING_RELEASE);
                        return;
                    case PENDING_RELEASE:
                    case RELEASED:
                        return;
                    default:
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Unknown state: ");
                        sb.append(encoderImpl.CoroutineDebuggingKt);
                        throw new java.lang.IllegalStateException(sb.toString());
                }
            }
        });
    }

    @Override // androidx.camera.video.internal.encoder.Encoder
    public com.google.common.util.concurrent.ListenableFuture<java.lang.Void> getReleasedFuture() {
        return this.d;
    }

    public void signalSourceStopped() {
        androidx.camera.core.Logger.d(this.coroutineCreation, "signalSourceStopped");
        this.getOutputMinFrameDuration.execute(new java.lang.Runnable() { // from class: androidx.camera.video.internal.encoder.EncoderImpl$$ExternalSyntheticLambda16
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.video.internal.encoder.EncoderImpl encoderImpl = androidx.camera.video.internal.encoder.EncoderImpl.this;
                encoderImpl.getValidOutputFormatsForInputhNQ4ISI = true;
                if (encoderImpl.getOutputStallDurationlomOqCM) {
                    if (!encoderImpl.getHighSpeedVideoFpsRanges) {
                        androidx.camera.core.Logger.d(encoderImpl.coroutineCreation, "mMediaCodec.stop()");
                        encoderImpl.isOutputSupportedForhNQ4ISI.stop();
                    }
                    encoderImpl.getHighSpeedVideoSizes();
                }
            }
        });
    }

    final void getHighSpeedVideoFpsRanges() {
        android.view.Surface surface;
        androidx.camera.core.Logger.d(this.coroutineCreation, "releaseInternal");
        if (this.getOutputStallDurationlomOqCM) {
            if (!this.getHighSpeedVideoFpsRanges) {
                androidx.camera.core.Logger.d(this.coroutineCreation, "mMediaCodec.stop()");
                this.isOutputSupportedForhNQ4ISI.stop();
            }
            this.getOutputStallDurationlomOqCM = false;
        }
        androidx.camera.core.Logger.d(this.coroutineCreation, "mMediaCodec.release()");
        this.isOutputSupportedForhNQ4ISI.release();
        androidx.camera.video.internal.encoder.Encoder.EncoderInput encoderInput = this.getInputFormats;
        if (encoderInput instanceof androidx.camera.video.internal.encoder.EncoderImpl.SurfaceInput) {
            androidx.camera.video.internal.encoder.EncoderImpl.SurfaceInput surfaceInput = (androidx.camera.video.internal.encoder.EncoderImpl.SurfaceInput) encoderInput;
            synchronized (surfaceInput.getHighSpeedVideoFpsRanges) {
                surface = surfaceInput.getHighSpeedVideoFpsRangesFor;
                surfaceInput.getHighSpeedVideoFpsRangesFor = null;
            }
            if (surface != null) {
                surface.release();
            }
        }
        getHighSpeedVideoFpsRangesFor(androidx.camera.video.internal.encoder.EncoderImpl.InternalState.RELEASED);
        this.AMEXKernel.set(null);
    }

    @Override // androidx.camera.video.internal.encoder.Encoder
    public void setEncoderCallback(androidx.camera.video.internal.encoder.EncoderCallback encoderCallback, java.util.concurrent.Executor executor) {
        synchronized (this.getOutputSizes) {
            this.getHighResolutionOutputSizeshNQ4ISI = encoderCallback;
            this.getInputSizeshNQ4ISI = executor;
        }
    }

    @Override // androidx.camera.video.internal.encoder.Encoder
    public void requestKeyFrame() {
        this.getOutputMinFrameDuration.execute(new java.lang.Runnable() { // from class: androidx.camera.video.internal.encoder.EncoderImpl$$ExternalSyntheticLambda15
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.video.internal.encoder.EncoderImpl encoderImpl = androidx.camera.video.internal.encoder.EncoderImpl.this;
                int ordinal = encoderImpl.CoroutineDebuggingKt.ordinal();
                if (ordinal == 1) {
                    encoderImpl.getHighSpeedVideoFpsRangesFor();
                } else if (ordinal == 6 || ordinal == 8) {
                    throw new java.lang.IllegalStateException("Encoder is released");
                }
            }
        });
    }

    final void getHighSpeedVideoFpsRangesFor(androidx.camera.video.internal.encoder.EncoderImpl.InternalState internalState) {
        if (this.CoroutineDebuggingKt == internalState) {
            return;
        }
        java.lang.String str = this.coroutineCreation;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Transitioning encoder internal state: ");
        sb.append(this.CoroutineDebuggingKt);
        sb.append(" --> ");
        sb.append(internalState);
        androidx.camera.core.Logger.d(str, sb.toString());
        this.CoroutineDebuggingKt = internalState;
    }

    final void getHighResolutionOutputSizeshNQ4ISI(boolean z) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("drop-input-frames", z ? 1 : 0);
        androidx.camera.core.Logger.d(this.coroutineCreation, "mMediaCodec.setParameters - setMediaCodecPaused: ".concat(java.lang.String.valueOf(z)));
        this.isOutputSupportedForhNQ4ISI.setParameters(bundle);
    }

    final void getHighSpeedVideoFpsRangesFor() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("request-sync", 0);
        androidx.camera.core.Logger.d(this.coroutineCreation, "mMediaCodec.setParameters - requestKeyFrameToMediaCodec");
        this.isOutputSupportedForhNQ4ISI.setParameters(bundle);
    }

    static /* synthetic */ void getHighSpeedVideoFpsRangesFor(java.util.concurrent.Executor executor, final androidx.camera.video.internal.encoder.EncoderImpl.MediaCodecCallback mediaCodecCallback) {
        java.util.Objects.requireNonNull(mediaCodecCallback);
        executor.execute(new java.lang.Runnable() { // from class: androidx.camera.video.internal.encoder.EncoderImpl$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.video.internal.encoder.EncoderImpl.MediaCodecCallback.this.getHighResolutionOutputSizeshNQ4ISI();
            }
        });
    }

    final void Camera2StreamConfigurationMap(final int i, final java.lang.String str, final java.lang.Throwable th) {
        switch (this.CoroutineDebuggingKt) {
            case CONFIGURED:
                getHighResolutionOutputSizeshNQ4ISI(i, str, th);
                getHighSpeedVideoSizes();
                break;
            case STARTED:
            case PAUSED:
            case STOPPING:
            case PENDING_START:
            case PENDING_START_PAUSED:
            case PENDING_RELEASE:
                getHighSpeedVideoFpsRangesFor(androidx.camera.video.internal.encoder.EncoderImpl.InternalState.ERROR);
                getHighSpeedVideoFpsRanges(new java.lang.Runnable() { // from class: androidx.camera.video.internal.encoder.EncoderImpl$$ExternalSyntheticLambda18
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.camera.video.internal.encoder.EncoderImpl.this.getHighResolutionOutputSizeshNQ4ISI(i, str, th);
                    }
                });
                break;
            case ERROR:
                java.lang.String str2 = this.coroutineCreation;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Get more than one error: ");
                sb.append(str);
                sb.append("(");
                sb.append(i);
                sb.append(")");
                androidx.camera.core.Logger.w(str2, sb.toString(), th);
                break;
        }
    }

    final void getHighResolutionOutputSizeshNQ4ISI(final int i, final java.lang.String str, final java.lang.Throwable th) {
        final androidx.camera.video.internal.encoder.EncoderCallback encoderCallback;
        java.util.concurrent.Executor executor;
        synchronized (this.getOutputSizes) {
            encoderCallback = this.getHighResolutionOutputSizeshNQ4ISI;
            executor = this.getInputSizeshNQ4ISI;
        }
        try {
            executor.execute(new java.lang.Runnable() { // from class: androidx.camera.video.internal.encoder.EncoderImpl$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.video.internal.encoder.EncoderCallback.this.onEncodeError(new androidx.camera.video.internal.encoder.EncodeException(i, str, th));
                }
            });
        } catch (java.util.concurrent.RejectedExecutionException e) {
            androidx.camera.core.Logger.e(this.coroutineCreation, "Unable to post to the supplied executor.", e);
        }
    }

    final void getHighSpeedVideoFpsRanges(final java.lang.Runnable runnable) {
        androidx.camera.core.Logger.d(this.coroutineCreation, "stopMediaCodec");
        final java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<androidx.camera.video.internal.encoder.EncodedDataImpl> it = this.getHighSpeedVideoSizes.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getClosedFuture());
        }
        java.util.Iterator<androidx.camera.video.internal.encoder.InputBuffer> it2 = this.getHighSpeedVideoSizesFor.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().getTerminationFuture());
        }
        if (!arrayList.isEmpty()) {
            java.lang.String str = this.coroutineCreation;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Waiting for resources to return. encoded data = ");
            sb.append(this.getHighSpeedVideoSizes.size());
            sb.append(", input buffers = ");
            sb.append(this.getHighSpeedVideoSizesFor.size());
            androidx.camera.core.Logger.d(str, sb.toString());
        }
        androidx.camera.core.impl.utils.futures.Futures.successfulAsList(arrayList).addListener(new java.lang.Runnable() { // from class: androidx.camera.video.internal.encoder.EncoderImpl$$ExternalSyntheticLambda17
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.video.internal.encoder.EncoderImpl encoderImpl = androidx.camera.video.internal.encoder.EncoderImpl.this;
                java.util.List list = arrayList;
                java.lang.Runnable runnable2 = runnable;
                if (encoderImpl.CoroutineDebuggingKt != androidx.camera.video.internal.encoder.EncoderImpl.InternalState.ERROR) {
                    if (!list.isEmpty()) {
                        androidx.camera.core.Logger.d(encoderImpl.coroutineCreation, "encoded data and input buffers are returned");
                    }
                    if ((encoderImpl.getInputFormats instanceof androidx.camera.video.internal.encoder.EncoderImpl.SurfaceInput) && !encoderImpl.getValidOutputFormatsForInputhNQ4ISI && androidx.camera.video.internal.compat.quirk.DeviceQuirks.get(androidx.camera.video.internal.compat.quirk.StopCodecAfterSurfaceRemovalCrashMediaServerQuirk.class) == null) {
                        if (encoderImpl.getHighSpeedVideoFpsRanges) {
                            androidx.camera.core.Logger.d(encoderImpl.coroutineCreation, "mMediaCodec.stop()");
                            encoderImpl.isOutputSupportedForhNQ4ISI.stop();
                        } else {
                            androidx.camera.core.Logger.d(encoderImpl.coroutineCreation, "mMediaCodec.flush()");
                            encoderImpl.isOutputSupportedForhNQ4ISI.flush();
                        }
                        encoderImpl.getOutputStallDurationlomOqCM = true;
                    } else {
                        androidx.camera.core.Logger.d(encoderImpl.coroutineCreation, "mMediaCodec.stop()");
                        encoderImpl.isOutputSupportedForhNQ4ISI.stop();
                    }
                }
                if (runnable2 != null) {
                    runnable2.run();
                }
                if (encoderImpl.CoroutineDebuggingKt == androidx.camera.video.internal.encoder.EncoderImpl.InternalState.PENDING_RELEASE) {
                    encoderImpl.getHighSpeedVideoFpsRanges();
                    return;
                }
                androidx.camera.video.internal.encoder.EncoderImpl.InternalState internalState = encoderImpl.CoroutineDebuggingKt;
                if (!encoderImpl.getOutputStallDurationlomOqCM) {
                    encoderImpl.getHighSpeedVideoSizes();
                }
                encoderImpl.getHighSpeedVideoFpsRangesFor(androidx.camera.video.internal.encoder.EncoderImpl.InternalState.CONFIGURED);
                if (internalState == androidx.camera.video.internal.encoder.EncoderImpl.InternalState.PENDING_START || internalState == androidx.camera.video.internal.encoder.EncoderImpl.InternalState.PENDING_START_PAUSED) {
                    encoderImpl.start();
                    if (internalState == androidx.camera.video.internal.encoder.EncoderImpl.InternalState.PENDING_START_PAUSED) {
                        encoderImpl.pause();
                    }
                }
            }
        }, this.getOutputMinFrameDuration);
    }

    final com.google.common.util.concurrent.ListenableFuture<androidx.camera.video.internal.encoder.InputBuffer> Camera2StreamConfigurationMap() {
        switch (this.CoroutineDebuggingKt) {
            case CONFIGURED:
                return androidx.camera.core.impl.utils.futures.Futures.immediateFailedFuture(new java.lang.IllegalStateException("Encoder is not started yet."));
            case STARTED:
            case PAUSED:
            case STOPPING:
            case PENDING_START:
            case PENDING_START_PAUSED:
            case PENDING_RELEASE:
                final java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
                com.google.common.util.concurrent.ListenableFuture<androidx.camera.video.internal.encoder.InputBuffer> future = androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(new androidx.concurrent.futures.CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.video.internal.encoder.EncoderImpl$$ExternalSyntheticLambda7
                    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                    public final java.lang.Object attachCompleter(androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer) {
                        return androidx.camera.video.internal.encoder.EncoderImpl.getHighSpeedVideoFpsRanges(atomicReference, completer);
                    }
                });
                final androidx.concurrent.futures.CallbackToFutureAdapter.Completer<androidx.camera.video.internal.encoder.InputBuffer> completer = (androidx.concurrent.futures.CallbackToFutureAdapter.Completer) androidx.core.util.Preconditions.checkNotNull((androidx.concurrent.futures.CallbackToFutureAdapter.Completer) atomicReference.get());
                this.getHighSpeedVideoFpsRangesFor.offer(completer);
                completer.addCancellationListener(new java.lang.Runnable() { // from class: androidx.camera.video.internal.encoder.EncoderImpl$$ExternalSyntheticLambda8
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.camera.video.internal.encoder.EncoderImpl encoderImpl = androidx.camera.video.internal.encoder.EncoderImpl.this;
                        encoderImpl.getHighSpeedVideoFpsRangesFor.remove(completer);
                    }
                }, this.getOutputMinFrameDuration);
                getHighResolutionOutputSizeshNQ4ISI();
                return future;
            case ERROR:
                return androidx.camera.core.impl.utils.futures.Futures.immediateFailedFuture(new java.lang.IllegalStateException("Encoder is in error state."));
            case RELEASED:
                return androidx.camera.core.impl.utils.futures.Futures.immediateFailedFuture(new java.lang.IllegalStateException("Encoder is released."));
            default:
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Unknown state: ");
                sb.append(this.CoroutineDebuggingKt);
                throw new java.lang.IllegalStateException(sb.toString());
        }
    }

    static /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges(java.util.concurrent.atomic.AtomicReference atomicReference, androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer) throws java.lang.Exception {
        atomicReference.set(completer);
        return "acquireInputBuffer";
    }

    final void getHighResolutionOutputSizeshNQ4ISI() {
        while (!this.getHighSpeedVideoFpsRangesFor.isEmpty() && !this.getOutputFormats.isEmpty()) {
            androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer = (androidx.concurrent.futures.CallbackToFutureAdapter.Completer) java.util.Objects.requireNonNull(this.getHighSpeedVideoFpsRangesFor.poll());
            try {
                final androidx.camera.video.internal.encoder.InputBufferImpl inputBufferImpl = new androidx.camera.video.internal.encoder.InputBufferImpl(this.isOutputSupportedForhNQ4ISI, ((java.lang.Integer) java.util.Objects.requireNonNull(this.getOutputFormats.poll())).intValue()) { // from class: androidx.camera.video.internal.encoder.EncoderImpl.2
                    @Override // androidx.camera.video.internal.encoder.InputBufferImpl, androidx.camera.video.internal.encoder.InputBuffer
                    public void setPresentationTimeUs(long j) {
                        if (!androidx.camera.video.internal.encoder.EncoderImpl.this.getOutputMinFrameDurationlomOqCM) {
                            j = androidx.camera.video.internal.encoder.EncoderImpl.getHighSpeedVideoFpsRangesFor(androidx.camera.video.internal.encoder.EncoderImpl.this, j);
                        }
                        super.setPresentationTimeUs(j);
                    }
                };
                if (completer.set(inputBufferImpl)) {
                    this.getHighSpeedVideoSizesFor.add(inputBufferImpl);
                    inputBufferImpl.getTerminationFuture().addListener(new java.lang.Runnable() { // from class: androidx.camera.video.internal.encoder.EncoderImpl$$ExternalSyntheticLambda9
                        @Override // java.lang.Runnable
                        public final void run() {
                            androidx.camera.video.internal.encoder.EncoderImpl encoderImpl = androidx.camera.video.internal.encoder.EncoderImpl.this;
                            encoderImpl.getHighSpeedVideoSizesFor.remove(inputBufferImpl);
                        }
                    }, this.getOutputMinFrameDuration);
                } else {
                    inputBufferImpl.cancel();
                }
            } catch (android.media.MediaCodec.CodecException e) {
                Camera2StreamConfigurationMap(1, e.getMessage(), e);
                return;
            }
        }
    }

    static boolean getHighSpeedVideoFpsRanges(android.media.MediaCodec.BufferInfo bufferInfo) {
        return (bufferInfo.flags & 1) != 0;
    }

    static boolean Camera2StreamConfigurationMap(android.media.MediaCodec.BufferInfo bufferInfo) {
        return (bufferInfo.flags & 4) != 0;
    }

    class MediaCodecCallback extends android.media.MediaCodec.Callback {
        boolean getHighSpeedVideoFpsRanges;
        boolean getOutputFormats;
        private final androidx.camera.video.internal.workaround.VideoTimebaseConverter getOutputStallDuration;
        boolean getHighResolutionOutputSizeshNQ4ISI = false;
        boolean getHighSpeedVideoSizes = false;
        boolean getHighSpeedVideoFpsRangesFor = false;
        private long getOutputStallDurationlomOqCM = 0;
        long Camera2StreamConfigurationMap = 0;
        private boolean getInputFormats = false;
        private boolean getInputSizeshNQ4ISI = false;
        boolean getHighSpeedVideoSizesFor = false;

        static /* synthetic */ android.media.MediaFormat getHighSpeedVideoFpsRangesFor(android.media.MediaFormat mediaFormat) {
            return mediaFormat;
        }

        MediaCodecCallback() {
            this.getOutputFormats = true;
            this.getHighSpeedVideoFpsRanges = androidx.camera.video.internal.encoder.EncoderImpl.this.getOutputMinFrameDurationlomOqCM;
            if (androidx.camera.video.internal.encoder.EncoderImpl.this.getOutputMinFrameDurationlomOqCM) {
                this.getOutputStallDuration = new androidx.camera.video.internal.workaround.VideoTimebaseConverter(androidx.camera.video.internal.encoder.EncoderImpl.this.ArtificialStackFrames, androidx.camera.video.internal.encoder.EncoderImpl.this.getOutputStallDuration, (androidx.camera.video.internal.compat.quirk.CameraUseInconsistentTimebaseQuirk) androidx.camera.video.internal.compat.quirk.DeviceQuirks.get(androidx.camera.video.internal.compat.quirk.CameraUseInconsistentTimebaseQuirk.class));
            } else {
                this.getOutputStallDuration = null;
            }
            androidx.camera.video.internal.compat.quirk.CodecStuckOnFlushQuirk codecStuckOnFlushQuirk = (androidx.camera.video.internal.compat.quirk.CodecStuckOnFlushQuirk) androidx.camera.video.internal.compat.quirk.DeviceQuirks.get(androidx.camera.video.internal.compat.quirk.CodecStuckOnFlushQuirk.class);
            if (codecStuckOnFlushQuirk == null || !codecStuckOnFlushQuirk.isProblematicMimeType(androidx.camera.video.internal.encoder.EncoderImpl.this.unwrapAs.getString("mime"))) {
                return;
            }
            this.getOutputFormats = false;
        }

        @Override // android.media.MediaCodec.Callback
        public void onInputBufferAvailable(android.media.MediaCodec mediaCodec, final int i) {
            androidx.camera.video.internal.encoder.EncoderImpl.this.getOutputMinFrameDuration.execute(new java.lang.Runnable() { // from class: androidx.camera.video.internal.encoder.EncoderImpl$MediaCodecCallback$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.video.internal.encoder.EncoderImpl.MediaCodecCallback mediaCodecCallback = androidx.camera.video.internal.encoder.EncoderImpl.MediaCodecCallback.this;
                    int i2 = i;
                    if (mediaCodecCallback.getHighSpeedVideoSizesFor) {
                        androidx.camera.core.Logger.w(androidx.camera.video.internal.encoder.EncoderImpl.this.coroutineCreation, "Receives input frame after codec is reset.");
                        return;
                    }
                    switch (androidx.camera.video.internal.encoder.EncoderImpl.this.CoroutineDebuggingKt) {
                        case CONFIGURED:
                        case ERROR:
                        case RELEASED:
                            return;
                        case STARTED:
                        case PAUSED:
                        case STOPPING:
                        case PENDING_START:
                        case PENDING_START_PAUSED:
                        case PENDING_RELEASE:
                            androidx.camera.video.internal.encoder.EncoderImpl.this.getOutputFormats.offer(java.lang.Integer.valueOf(i2));
                            androidx.camera.video.internal.encoder.EncoderImpl.this.getHighResolutionOutputSizeshNQ4ISI();
                            return;
                        default:
                            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unknown state: ");
                            sb.append(androidx.camera.video.internal.encoder.EncoderImpl.this.CoroutineDebuggingKt);
                            throw new java.lang.IllegalStateException(sb.toString());
                    }
                }
            });
        }

        @Override // android.media.MediaCodec.Callback
        public void onOutputBufferAvailable(final android.media.MediaCodec mediaCodec, final int i, final android.media.MediaCodec.BufferInfo bufferInfo) {
            androidx.camera.video.internal.encoder.EncoderImpl.this.getOutputMinFrameDuration.execute(new java.lang.Runnable() { // from class: androidx.camera.video.internal.encoder.EncoderImpl$MediaCodecCallback$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    final androidx.camera.video.internal.encoder.EncoderCallback encoderCallback;
                    java.util.concurrent.Executor executor;
                    android.media.MediaCodec.BufferInfo bufferInfo2;
                    final androidx.camera.video.internal.encoder.EncoderImpl.MediaCodecCallback mediaCodecCallback = androidx.camera.video.internal.encoder.EncoderImpl.MediaCodecCallback.this;
                    android.media.MediaCodec.BufferInfo bufferInfo3 = bufferInfo;
                    android.media.MediaCodec mediaCodec2 = mediaCodec;
                    int i2 = i;
                    if (mediaCodecCallback.getHighSpeedVideoSizesFor) {
                        androidx.camera.core.Logger.w(androidx.camera.video.internal.encoder.EncoderImpl.this.coroutineCreation, "Receives frame after codec is reset.");
                        return;
                    }
                    switch (androidx.camera.video.internal.encoder.EncoderImpl.this.CoroutineDebuggingKt) {
                        case CONFIGURED:
                        case ERROR:
                        case RELEASED:
                            return;
                        case STARTED:
                        case PAUSED:
                        case STOPPING:
                        case PENDING_START:
                        case PENDING_START_PAUSED:
                        case PENDING_RELEASE:
                            synchronized (androidx.camera.video.internal.encoder.EncoderImpl.this.getOutputSizes) {
                                encoderCallback = androidx.camera.video.internal.encoder.EncoderImpl.this.getHighResolutionOutputSizeshNQ4ISI;
                                executor = androidx.camera.video.internal.encoder.EncoderImpl.this.getInputSizeshNQ4ISI;
                            }
                            if (android.os.Build.VERSION.SDK_INT < 30 && androidx.camera.video.internal.encoder.EncoderImpl.this.getOutputMinFrameDurationlomOqCM && androidx.camera.video.internal.encoder.EncoderImpl.getHighResolutionOutputSizeshNQ4ISI(androidx.camera.video.internal.encoder.EncoderImpl.this)) {
                                bufferInfo3.presentationTimeUs = androidx.camera.video.internal.encoder.EncoderImpl.getHighSpeedVideoFpsRangesFor(androidx.camera.video.internal.encoder.EncoderImpl.this, bufferInfo3.presentationTimeUs);
                            }
                            if (!mediaCodecCallback.getHighResolutionOutputSizeshNQ4ISI) {
                                mediaCodecCallback.getHighResolutionOutputSizeshNQ4ISI = true;
                                try {
                                    java.util.Objects.requireNonNull(encoderCallback);
                                    executor.execute(new java.lang.Runnable() { // from class: androidx.camera.video.internal.encoder.EncoderImpl$MediaCodecCallback$$ExternalSyntheticLambda4
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            androidx.camera.video.internal.encoder.EncoderCallback.this.onEncodeStart();
                                        }
                                    });
                                } catch (java.util.concurrent.RejectedExecutionException e) {
                                    androidx.camera.core.Logger.e(androidx.camera.video.internal.encoder.EncoderImpl.this.coroutineCreation, "Unable to post to the supplied executor.", e);
                                }
                            }
                            if (mediaCodecCallback.getHighResolutionOutputSizeshNQ4ISI(bufferInfo3)) {
                                if (!mediaCodecCallback.getHighSpeedVideoSizes) {
                                    mediaCodecCallback.getHighSpeedVideoSizes = true;
                                    java.lang.String str = androidx.camera.video.internal.encoder.EncoderImpl.this.coroutineCreation;
                                    java.lang.StringBuilder sb = new java.lang.StringBuilder("data timestampUs = ");
                                    sb.append(bufferInfo3.presentationTimeUs);
                                    sb.append(", data timebase = ");
                                    sb.append(androidx.camera.video.internal.encoder.EncoderImpl.this.getOutputStallDuration);
                                    sb.append(", current system uptimeMs = ");
                                    sb.append(android.os.SystemClock.uptimeMillis());
                                    sb.append(", current system realtimeMs = ");
                                    sb.append(android.os.SystemClock.elapsedRealtime());
                                    androidx.camera.core.Logger.d(str, sb.toString());
                                }
                                androidx.camera.video.internal.encoder.EncoderImpl encoderImpl = androidx.camera.video.internal.encoder.EncoderImpl.this;
                                long j = encoderImpl._BOUNDARY > 0 ? bufferInfo3.presentationTimeUs - encoderImpl._BOUNDARY : bufferInfo3.presentationTimeUs;
                                if (bufferInfo3.presentationTimeUs == j) {
                                    bufferInfo2 = bufferInfo3;
                                } else {
                                    androidx.core.util.Preconditions.checkState(j > mediaCodecCallback.Camera2StreamConfigurationMap);
                                    bufferInfo2 = new android.media.MediaCodec.BufferInfo();
                                    bufferInfo2.set(bufferInfo3.offset, bufferInfo3.size, j, bufferInfo3.flags);
                                }
                                mediaCodecCallback.Camera2StreamConfigurationMap = bufferInfo2.presentationTimeUs;
                                try {
                                    final androidx.camera.video.internal.encoder.EncodedDataImpl encodedDataImpl = new androidx.camera.video.internal.encoder.EncodedDataImpl(mediaCodec2, i2, bufferInfo2);
                                    androidx.camera.video.internal.encoder.EncoderImpl.this.getHighSpeedVideoSizes.add(encodedDataImpl);
                                    androidx.camera.core.impl.utils.futures.Futures.addCallback(encodedDataImpl.getClosedFuture(), new androidx.camera.core.impl.utils.futures.FutureCallback<java.lang.Void>() { // from class: androidx.camera.video.internal.encoder.EncoderImpl.MediaCodecCallback.1
                                        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
                                        public /* synthetic */ void onSuccess(java.lang.Void r2) {
                                            androidx.camera.video.internal.encoder.EncoderImpl.this.getHighSpeedVideoSizes.remove(encodedDataImpl);
                                        }

                                        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
                                        public void onFailure(java.lang.Throwable th) {
                                            androidx.camera.video.internal.encoder.EncoderImpl.this.getHighSpeedVideoSizes.remove(encodedDataImpl);
                                            if (!(th instanceof android.media.MediaCodec.CodecException)) {
                                                androidx.camera.video.internal.encoder.EncoderImpl.this.Camera2StreamConfigurationMap(0, th.getMessage(), th);
                                            } else {
                                                android.media.MediaCodec.CodecException codecException = (android.media.MediaCodec.CodecException) th;
                                                androidx.camera.video.internal.encoder.EncoderImpl.this.Camera2StreamConfigurationMap(1, codecException.getMessage(), codecException);
                                            }
                                        }
                                    }, androidx.camera.video.internal.encoder.EncoderImpl.this.getOutputMinFrameDuration);
                                    try {
                                        executor.execute(new java.lang.Runnable() { // from class: androidx.camera.video.internal.encoder.EncoderImpl$MediaCodecCallback$$ExternalSyntheticLambda6
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                androidx.camera.video.internal.encoder.EncoderCallback.this.onEncodedData(encodedDataImpl);
                                            }
                                        });
                                    } catch (java.util.concurrent.RejectedExecutionException e2) {
                                        androidx.camera.core.Logger.e(androidx.camera.video.internal.encoder.EncoderImpl.this.coroutineCreation, "Unable to post to the supplied executor.", e2);
                                        encodedDataImpl.close();
                                    }
                                } catch (android.media.MediaCodec.CodecException e3) {
                                    androidx.camera.video.internal.encoder.EncoderImpl.this.Camera2StreamConfigurationMap(1, e3.getMessage(), e3);
                                    return;
                                }
                            } else {
                                try {
                                    androidx.camera.video.internal.encoder.EncoderImpl.this.isOutputSupportedForhNQ4ISI.releaseOutputBuffer(i2, false);
                                } catch (android.media.MediaCodec.CodecException e4) {
                                    androidx.camera.video.internal.encoder.EncoderImpl.this.Camera2StreamConfigurationMap(1, e4.getMessage(), e4);
                                    return;
                                }
                            }
                            if (!mediaCodecCallback.getHighSpeedVideoFpsRangesFor && ((androidx.camera.video.internal.encoder.EncoderImpl.Camera2StreamConfigurationMap(bufferInfo3) && (!mediaCodecCallback.getHighSpeedVideoFpsRanges || androidx.camera.video.internal.compat.quirk.DeviceQuirks.get(androidx.camera.video.internal.compat.quirk.PrematureEndOfStreamVideoQuirk.class) == null)) || (mediaCodecCallback.getOutputFormats && androidx.camera.video.internal.encoder.EncoderImpl.this.isOutputSupportedFor && bufferInfo3.presentationTimeUs > androidx.camera.video.internal.encoder.EncoderImpl.this.accessartificialFrame.getUpper().longValue()))) {
                                mediaCodecCallback.getHighResolutionOutputSizeshNQ4ISI();
                            }
                            if (mediaCodecCallback.getHighSpeedVideoFpsRanges) {
                                mediaCodecCallback.getHighSpeedVideoFpsRanges = false;
                                return;
                            }
                            return;
                        default:
                            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Unknown state: ");
                            sb2.append(androidx.camera.video.internal.encoder.EncoderImpl.this.CoroutineDebuggingKt);
                            throw new java.lang.IllegalStateException(sb2.toString());
                    }
                }
            });
        }

        final void getHighResolutionOutputSizeshNQ4ISI() {
            final androidx.camera.video.internal.encoder.EncoderCallback encoderCallback;
            final java.util.concurrent.Executor executor;
            androidx.camera.core.Logger.d(androidx.camera.video.internal.encoder.EncoderImpl.this.coroutineCreation, "reachEndData");
            if (this.getHighSpeedVideoFpsRangesFor) {
                return;
            }
            this.getHighSpeedVideoFpsRangesFor = true;
            if (androidx.camera.video.internal.encoder.EncoderImpl.this.init != null) {
                androidx.camera.video.internal.encoder.EncoderImpl.this.init.cancel(false);
                androidx.camera.video.internal.encoder.EncoderImpl.getHighSpeedVideoSizes(androidx.camera.video.internal.encoder.EncoderImpl.this);
            }
            synchronized (androidx.camera.video.internal.encoder.EncoderImpl.this.getOutputSizes) {
                encoderCallback = androidx.camera.video.internal.encoder.EncoderImpl.this.getHighResolutionOutputSizeshNQ4ISI;
                executor = androidx.camera.video.internal.encoder.EncoderImpl.this.getInputSizeshNQ4ISI;
            }
            androidx.camera.video.internal.encoder.EncoderImpl.this.getHighSpeedVideoFpsRanges(new java.lang.Runnable() { // from class: androidx.camera.video.internal.encoder.EncoderImpl$MediaCodecCallback$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.video.internal.encoder.EncoderImpl.MediaCodecCallback mediaCodecCallback = androidx.camera.video.internal.encoder.EncoderImpl.MediaCodecCallback.this;
                    java.util.concurrent.Executor executor2 = executor;
                    final androidx.camera.video.internal.encoder.EncoderCallback encoderCallback2 = encoderCallback;
                    if (androidx.camera.video.internal.encoder.EncoderImpl.this.CoroutineDebuggingKt != androidx.camera.video.internal.encoder.EncoderImpl.InternalState.ERROR) {
                        try {
                            java.util.Objects.requireNonNull(encoderCallback2);
                            executor2.execute(new java.lang.Runnable() { // from class: androidx.camera.video.internal.encoder.EncoderImpl$MediaCodecCallback$$ExternalSyntheticLambda3
                                @Override // java.lang.Runnable
                                public final void run() {
                                    androidx.camera.video.internal.encoder.EncoderCallback.this.onEncodeStop();
                                }
                            });
                        } catch (java.util.concurrent.RejectedExecutionException e) {
                            androidx.camera.core.Logger.e(androidx.camera.video.internal.encoder.EncoderImpl.this.coroutineCreation, "Unable to post to the supplied executor.", e);
                        }
                    }
                }
            });
        }

        final boolean getHighResolutionOutputSizeshNQ4ISI(android.media.MediaCodec.BufferInfo bufferInfo) {
            long j;
            if (this.getHighSpeedVideoFpsRangesFor) {
                androidx.camera.core.Logger.d(androidx.camera.video.internal.encoder.EncoderImpl.this.coroutineCreation, "Drop buffer by already reach end of stream.");
                return false;
            }
            if (bufferInfo.size <= 0) {
                androidx.camera.core.Logger.d(androidx.camera.video.internal.encoder.EncoderImpl.this.coroutineCreation, "Drop buffer by invalid buffer size.");
                return false;
            }
            if ((bufferInfo.flags & 2) != 0) {
                androidx.camera.core.Logger.d(androidx.camera.video.internal.encoder.EncoderImpl.this.coroutineCreation, "Drop buffer by codec config.");
                return false;
            }
            androidx.camera.video.internal.workaround.VideoTimebaseConverter videoTimebaseConverter = this.getOutputStallDuration;
            if (videoTimebaseConverter != null) {
                bufferInfo.presentationTimeUs = videoTimebaseConverter.convertToUptimeUs(bufferInfo.presentationTimeUs);
            }
            if (bufferInfo.presentationTimeUs <= this.getOutputStallDurationlomOqCM) {
                androidx.camera.core.Logger.d(androidx.camera.video.internal.encoder.EncoderImpl.this.coroutineCreation, "Drop buffer by out of order buffer from MediaCodec.");
                return false;
            }
            this.getOutputStallDurationlomOqCM = bufferInfo.presentationTimeUs;
            if (!androidx.camera.video.internal.encoder.EncoderImpl.this.accessartificialFrame.contains((android.util.Range<java.lang.Long>) java.lang.Long.valueOf(bufferInfo.presentationTimeUs))) {
                androidx.camera.core.Logger.d(androidx.camera.video.internal.encoder.EncoderImpl.this.coroutineCreation, "Drop buffer by not in start-stop range.");
                if (androidx.camera.video.internal.encoder.EncoderImpl.this.toString && bufferInfo.presentationTimeUs >= androidx.camera.video.internal.encoder.EncoderImpl.this.accessartificialFrame.getUpper().longValue()) {
                    if (androidx.camera.video.internal.encoder.EncoderImpl.this.coroutineBoundary != null) {
                        androidx.camera.video.internal.encoder.EncoderImpl.this.coroutineBoundary.cancel(true);
                    }
                    androidx.camera.video.internal.encoder.EncoderImpl.this.getOutputSizeshNQ4ISI = java.lang.Long.valueOf(bufferInfo.presentationTimeUs);
                    androidx.camera.video.internal.encoder.EncoderImpl.this.getInputFormats();
                    androidx.camera.video.internal.encoder.EncoderImpl.this.toString = false;
                }
                return false;
            }
            if (getHighSpeedVideoFpsRangesFor(bufferInfo)) {
                androidx.camera.core.Logger.d(androidx.camera.video.internal.encoder.EncoderImpl.this.coroutineCreation, "Drop buffer by pause.");
                return false;
            }
            androidx.camera.video.internal.encoder.EncoderImpl encoderImpl = androidx.camera.video.internal.encoder.EncoderImpl.this;
            if (encoderImpl._BOUNDARY > 0) {
                j = bufferInfo.presentationTimeUs - encoderImpl._BOUNDARY;
            } else {
                j = bufferInfo.presentationTimeUs;
            }
            if (j <= this.Camera2StreamConfigurationMap) {
                androidx.camera.core.Logger.d(androidx.camera.video.internal.encoder.EncoderImpl.this.coroutineCreation, "Drop buffer by adjusted time is less than the last sent time.");
                if (androidx.camera.video.internal.encoder.EncoderImpl.this.getOutputMinFrameDurationlomOqCM && androidx.camera.video.internal.encoder.EncoderImpl.getHighSpeedVideoFpsRanges(bufferInfo)) {
                    this.getInputSizeshNQ4ISI = true;
                }
                return false;
            }
            if (!this.getHighSpeedVideoSizes && !this.getInputSizeshNQ4ISI && androidx.camera.video.internal.encoder.EncoderImpl.this.getOutputMinFrameDurationlomOqCM) {
                this.getInputSizeshNQ4ISI = true;
            }
            if (this.getInputSizeshNQ4ISI) {
                if (!androidx.camera.video.internal.encoder.EncoderImpl.getHighSpeedVideoFpsRanges(bufferInfo)) {
                    androidx.camera.core.Logger.d(androidx.camera.video.internal.encoder.EncoderImpl.this.coroutineCreation, "Drop buffer by not a key frame.");
                    androidx.camera.video.internal.encoder.EncoderImpl.this.getHighSpeedVideoFpsRangesFor();
                    return false;
                }
                this.getInputSizeshNQ4ISI = false;
            }
            return true;
        }

        private boolean getHighSpeedVideoFpsRangesFor(android.media.MediaCodec.BufferInfo bufferInfo) {
            boolean z;
            java.util.concurrent.Executor executor;
            final androidx.camera.video.internal.encoder.EncoderCallback encoderCallback;
            androidx.camera.video.internal.encoder.EncoderImpl encoderImpl = androidx.camera.video.internal.encoder.EncoderImpl.this;
            long j = bufferInfo.presentationTimeUs;
            while (!encoderImpl.Camera2StreamConfigurationMap.isEmpty()) {
                android.util.Range<java.lang.Long> first = encoderImpl.Camera2StreamConfigurationMap.getFirst();
                if (j <= first.getUpper().longValue()) {
                    break;
                }
                encoderImpl.Camera2StreamConfigurationMap.removeFirst();
                encoderImpl._BOUNDARY += first.getUpper().longValue() - first.getLower().longValue();
                java.lang.String str = encoderImpl.coroutineCreation;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Total paused duration = ");
                sb.append(androidx.camera.video.internal.DebugUtils.readableUs(encoderImpl._BOUNDARY));
                androidx.camera.core.Logger.d(str, sb.toString());
            }
            androidx.camera.video.internal.encoder.EncoderImpl encoderImpl2 = androidx.camera.video.internal.encoder.EncoderImpl.this;
            long j2 = bufferInfo.presentationTimeUs;
            for (android.util.Range<java.lang.Long> range : encoderImpl2.Camera2StreamConfigurationMap) {
                if (range.contains((android.util.Range<java.lang.Long>) java.lang.Long.valueOf(j2))) {
                    z = true;
                    break;
                }
                if (j2 < range.getLower().longValue()) {
                    break;
                }
            }
            z = false;
            boolean z2 = this.getInputFormats;
            if (!z2 && z) {
                androidx.camera.core.Logger.d(androidx.camera.video.internal.encoder.EncoderImpl.this.coroutineCreation, "Switch to pause state");
                this.getInputFormats = true;
                synchronized (androidx.camera.video.internal.encoder.EncoderImpl.this.getOutputSizes) {
                    executor = androidx.camera.video.internal.encoder.EncoderImpl.this.getInputSizeshNQ4ISI;
                    encoderCallback = androidx.camera.video.internal.encoder.EncoderImpl.this.getHighResolutionOutputSizeshNQ4ISI;
                }
                java.util.Objects.requireNonNull(encoderCallback);
                executor.execute(new java.lang.Runnable() { // from class: androidx.camera.video.internal.encoder.EncoderImpl$MediaCodecCallback$$ExternalSyntheticLambda9
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.camera.video.internal.encoder.EncoderCallback.this.onEncodePaused();
                    }
                });
                if (androidx.camera.video.internal.encoder.EncoderImpl.this.CoroutineDebuggingKt == androidx.camera.video.internal.encoder.EncoderImpl.InternalState.PAUSED && ((androidx.camera.video.internal.encoder.EncoderImpl.this.getOutputMinFrameDurationlomOqCM || androidx.camera.video.internal.compat.quirk.DeviceQuirks.get(androidx.camera.video.internal.compat.quirk.AudioEncoderIgnoresInputTimestampQuirk.class) == null) && (!androidx.camera.video.internal.encoder.EncoderImpl.this.getOutputMinFrameDurationlomOqCM || androidx.camera.video.internal.compat.quirk.DeviceQuirks.get(androidx.camera.video.internal.compat.quirk.VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk.class) == null))) {
                    if (androidx.camera.video.internal.encoder.EncoderImpl.this.getInputFormats instanceof androidx.camera.video.internal.encoder.EncoderImpl.ByteBufferInput) {
                        ((androidx.camera.video.internal.encoder.EncoderImpl.ByteBufferInput) androidx.camera.video.internal.encoder.EncoderImpl.this.getInputFormats).Camera2StreamConfigurationMap(false);
                    }
                    androidx.camera.video.internal.encoder.EncoderImpl.this.getHighResolutionOutputSizeshNQ4ISI(true);
                }
                androidx.camera.video.internal.encoder.EncoderImpl.this.getOutputSizeshNQ4ISI = java.lang.Long.valueOf(bufferInfo.presentationTimeUs);
                if (androidx.camera.video.internal.encoder.EncoderImpl.this.toString) {
                    if (androidx.camera.video.internal.encoder.EncoderImpl.this.coroutineBoundary != null) {
                        androidx.camera.video.internal.encoder.EncoderImpl.this.coroutineBoundary.cancel(true);
                    }
                    androidx.camera.video.internal.encoder.EncoderImpl.this.getInputFormats();
                    androidx.camera.video.internal.encoder.EncoderImpl.this.toString = false;
                }
            } else if (z2 && !z) {
                androidx.camera.core.Logger.d(androidx.camera.video.internal.encoder.EncoderImpl.this.coroutineCreation, "Switch to resume state");
                this.getInputFormats = false;
                if (androidx.camera.video.internal.encoder.EncoderImpl.this.getOutputMinFrameDurationlomOqCM && !androidx.camera.video.internal.encoder.EncoderImpl.getHighSpeedVideoFpsRanges(bufferInfo)) {
                    this.getInputSizeshNQ4ISI = true;
                }
            }
            return this.getInputFormats;
        }

        @Override // android.media.MediaCodec.Callback
        public void onError(android.media.MediaCodec mediaCodec, final android.media.MediaCodec.CodecException codecException) {
            androidx.camera.video.internal.encoder.EncoderImpl.this.getOutputMinFrameDuration.execute(new java.lang.Runnable() { // from class: androidx.camera.video.internal.encoder.EncoderImpl$MediaCodecCallback$$ExternalSyntheticLambda10
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.video.internal.encoder.EncoderImpl.MediaCodecCallback mediaCodecCallback = androidx.camera.video.internal.encoder.EncoderImpl.MediaCodecCallback.this;
                    android.media.MediaCodec.CodecException codecException2 = codecException;
                    switch (androidx.camera.video.internal.encoder.EncoderImpl.this.CoroutineDebuggingKt) {
                        case CONFIGURED:
                        case ERROR:
                        case RELEASED:
                            return;
                        case STARTED:
                        case PAUSED:
                        case STOPPING:
                        case PENDING_START:
                        case PENDING_START_PAUSED:
                        case PENDING_RELEASE:
                            androidx.camera.video.internal.encoder.EncoderImpl.this.Camera2StreamConfigurationMap(1, codecException2.getMessage(), codecException2);
                            return;
                        default:
                            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unknown state: ");
                            sb.append(androidx.camera.video.internal.encoder.EncoderImpl.this.CoroutineDebuggingKt);
                            throw new java.lang.IllegalStateException(sb.toString());
                    }
                }
            });
        }

        @Override // android.media.MediaCodec.Callback
        public void onOutputFormatChanged(android.media.MediaCodec mediaCodec, final android.media.MediaFormat mediaFormat) {
            java.lang.String str = androidx.camera.video.internal.encoder.EncoderImpl.this.coroutineCreation;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("onOutputFormatChanged: mediaFormat = ");
            sb.append(mediaFormat);
            sb.append(", CSD data = ");
            sb.append(androidx.camera.video.internal.DebugUtils.getCsdHex(mediaFormat));
            androidx.camera.core.Logger.d(str, sb.toString());
            androidx.camera.video.internal.encoder.EncoderImpl.this.getOutputMinFrameDuration.execute(new java.lang.Runnable() { // from class: androidx.camera.video.internal.encoder.EncoderImpl$MediaCodecCallback$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    final androidx.camera.video.internal.encoder.EncoderCallback encoderCallback;
                    java.util.concurrent.Executor executor;
                    androidx.camera.video.internal.encoder.EncoderImpl.MediaCodecCallback mediaCodecCallback = androidx.camera.video.internal.encoder.EncoderImpl.MediaCodecCallback.this;
                    final android.media.MediaFormat mediaFormat2 = mediaFormat;
                    if (mediaCodecCallback.getHighSpeedVideoSizesFor) {
                        androidx.camera.core.Logger.w(androidx.camera.video.internal.encoder.EncoderImpl.this.coroutineCreation, "Receives onOutputFormatChanged after codec is reset.");
                        return;
                    }
                    switch (androidx.camera.video.internal.encoder.EncoderImpl.this.CoroutineDebuggingKt) {
                        case CONFIGURED:
                        case ERROR:
                        case RELEASED:
                            return;
                        case STARTED:
                        case PAUSED:
                        case STOPPING:
                        case PENDING_START:
                        case PENDING_START_PAUSED:
                        case PENDING_RELEASE:
                            synchronized (androidx.camera.video.internal.encoder.EncoderImpl.this.getOutputSizes) {
                                encoderCallback = androidx.camera.video.internal.encoder.EncoderImpl.this.getHighResolutionOutputSizeshNQ4ISI;
                                executor = androidx.camera.video.internal.encoder.EncoderImpl.this.getInputSizeshNQ4ISI;
                            }
                            try {
                                executor.execute(new java.lang.Runnable() { // from class: androidx.camera.video.internal.encoder.EncoderImpl$MediaCodecCallback$$ExternalSyntheticLambda8
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        androidx.camera.video.internal.encoder.EncoderCallback.this.onOutputConfigUpdate(new androidx.camera.video.internal.encoder.OutputConfig() { // from class: androidx.camera.video.internal.encoder.EncoderImpl$MediaCodecCallback$$ExternalSyntheticLambda7
                                            @Override // androidx.camera.video.internal.encoder.OutputConfig
                                            public final android.media.MediaFormat getMediaFormat() {
                                                return androidx.camera.video.internal.encoder.EncoderImpl.MediaCodecCallback.getHighSpeedVideoFpsRangesFor(r1);
                                            }
                                        });
                                    }
                                });
                                return;
                            } catch (java.util.concurrent.RejectedExecutionException e) {
                                androidx.camera.core.Logger.e(androidx.camera.video.internal.encoder.EncoderImpl.this.coroutineCreation, "Unable to post to the supplied executor.", e);
                                return;
                            }
                        default:
                            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Unknown state: ");
                            sb2.append(androidx.camera.video.internal.encoder.EncoderImpl.this.CoroutineDebuggingKt);
                            throw new java.lang.IllegalStateException(sb2.toString());
                    }
                }
            });
        }
    }

    class SurfaceInput implements androidx.camera.video.internal.encoder.Encoder.SurfaceInput {
        final java.lang.Object getHighSpeedVideoFpsRanges = new java.lang.Object();
        android.view.Surface getHighSpeedVideoFpsRangesFor;

        SurfaceInput() {
        }

        @Override // androidx.camera.video.internal.encoder.Encoder.SurfaceInput
        public android.view.Surface getSurface() {
            android.view.Surface surface;
            synchronized (this.getHighSpeedVideoFpsRanges) {
                if (this.getHighSpeedVideoFpsRangesFor == null) {
                    this.getHighSpeedVideoFpsRangesFor = android.media.MediaCodec.createPersistentInputSurface();
                }
                surface = this.getHighSpeedVideoFpsRangesFor;
            }
            return surface;
        }
    }

    class ByteBufferInput implements androidx.camera.video.internal.encoder.Encoder.ByteBufferInput {
        final java.util.Map<androidx.camera.core.impl.Observable.Observer<? super androidx.camera.video.internal.BufferProvider.State>, java.util.concurrent.Executor> getHighResolutionOutputSizeshNQ4ISI = new java.util.LinkedHashMap();
        androidx.camera.video.internal.BufferProvider.State getHighSpeedVideoFpsRanges = androidx.camera.video.internal.BufferProvider.State.INACTIVE;
        final java.util.List<com.google.common.util.concurrent.ListenableFuture<androidx.camera.video.internal.encoder.InputBuffer>> Camera2StreamConfigurationMap = new java.util.ArrayList();

        ByteBufferInput() {
        }

        @Override // androidx.camera.core.impl.Observable
        public com.google.common.util.concurrent.ListenableFuture<androidx.camera.video.internal.BufferProvider.State> fetchData() {
            return androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(new androidx.concurrent.futures.CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.video.internal.encoder.EncoderImpl$ByteBufferInput$$ExternalSyntheticLambda1
                @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                public final java.lang.Object attachCompleter(final androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer) {
                    final androidx.camera.video.internal.encoder.EncoderImpl.ByteBufferInput byteBufferInput = androidx.camera.video.internal.encoder.EncoderImpl.ByteBufferInput.this;
                    androidx.camera.video.internal.encoder.EncoderImpl.this.getOutputMinFrameDuration.execute(new java.lang.Runnable() { // from class: androidx.camera.video.internal.encoder.EncoderImpl$ByteBufferInput$$ExternalSyntheticLambda4
                        @Override // java.lang.Runnable
                        public final void run() {
                            completer.set(androidx.camera.video.internal.encoder.EncoderImpl.ByteBufferInput.this.getHighSpeedVideoFpsRanges);
                        }
                    });
                    return "fetchData";
                }
            });
        }

        @Override // androidx.camera.video.internal.BufferProvider
        public com.google.common.util.concurrent.ListenableFuture<androidx.camera.video.internal.encoder.InputBuffer> acquireBuffer() {
            return androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(new androidx.concurrent.futures.CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.video.internal.encoder.EncoderImpl$ByteBufferInput$$ExternalSyntheticLambda2
                @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                public final java.lang.Object attachCompleter(final androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer) {
                    final androidx.camera.video.internal.encoder.EncoderImpl.ByteBufferInput byteBufferInput = androidx.camera.video.internal.encoder.EncoderImpl.ByteBufferInput.this;
                    androidx.camera.video.internal.encoder.EncoderImpl.this.getOutputMinFrameDuration.execute(new java.lang.Runnable() { // from class: androidx.camera.video.internal.encoder.EncoderImpl$ByteBufferInput$$ExternalSyntheticLambda3
                        @Override // java.lang.Runnable
                        public final void run() {
                            final androidx.camera.video.internal.encoder.EncoderImpl.ByteBufferInput byteBufferInput2 = androidx.camera.video.internal.encoder.EncoderImpl.ByteBufferInput.this;
                            androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer2 = completer;
                            if (byteBufferInput2.getHighSpeedVideoFpsRanges == androidx.camera.video.internal.BufferProvider.State.ACTIVE) {
                                final com.google.common.util.concurrent.ListenableFuture<androidx.camera.video.internal.encoder.InputBuffer> Camera2StreamConfigurationMap = androidx.camera.video.internal.encoder.EncoderImpl.this.Camera2StreamConfigurationMap();
                                androidx.camera.core.impl.utils.futures.Futures.propagate(Camera2StreamConfigurationMap, completer2);
                                completer2.addCancellationListener(new java.lang.Runnable() { // from class: androidx.camera.video.internal.encoder.EncoderImpl$ByteBufferInput$$ExternalSyntheticLambda5
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        androidx.camera.video.internal.encoder.EncoderImpl.ByteBufferInput byteBufferInput3 = androidx.camera.video.internal.encoder.EncoderImpl.ByteBufferInput.this;
                                        com.google.common.util.concurrent.ListenableFuture listenableFuture = Camera2StreamConfigurationMap;
                                        if (listenableFuture.cancel(true)) {
                                            return;
                                        }
                                        androidx.core.util.Preconditions.checkState(listenableFuture.isDone());
                                        try {
                                            ((androidx.camera.video.internal.encoder.InputBuffer) listenableFuture.get()).cancel();
                                        } catch (java.lang.InterruptedException | java.util.concurrent.CancellationException | java.util.concurrent.ExecutionException e) {
                                            androidx.camera.core.Logger.w(androidx.camera.video.internal.encoder.EncoderImpl.this.coroutineCreation, "Unable to cancel the input buffer: ".concat(java.lang.String.valueOf(e)));
                                        }
                                    }
                                }, androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor());
                                byteBufferInput2.Camera2StreamConfigurationMap.add(Camera2StreamConfigurationMap);
                                Camera2StreamConfigurationMap.addListener(new java.lang.Runnable() { // from class: androidx.camera.video.internal.encoder.EncoderImpl$ByteBufferInput$$ExternalSyntheticLambda6
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        androidx.camera.video.internal.encoder.EncoderImpl.ByteBufferInput byteBufferInput3 = androidx.camera.video.internal.encoder.EncoderImpl.ByteBufferInput.this;
                                        byteBufferInput3.Camera2StreamConfigurationMap.remove(Camera2StreamConfigurationMap);
                                    }
                                }, androidx.camera.video.internal.encoder.EncoderImpl.this.getOutputMinFrameDuration);
                                return;
                            }
                            if (byteBufferInput2.getHighSpeedVideoFpsRanges == androidx.camera.video.internal.BufferProvider.State.INACTIVE) {
                                completer2.setException(new java.lang.IllegalStateException("BufferProvider is not active."));
                                return;
                            }
                            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unknown state: ");
                            sb.append(byteBufferInput2.getHighSpeedVideoFpsRanges);
                            completer2.setException(new java.lang.IllegalStateException(sb.toString()));
                        }
                    });
                    return "acquireBuffer";
                }
            });
        }

        @Override // androidx.camera.core.impl.Observable
        public void addObserver(final java.util.concurrent.Executor executor, final androidx.camera.core.impl.Observable.Observer<? super androidx.camera.video.internal.BufferProvider.State> observer) {
            androidx.camera.video.internal.encoder.EncoderImpl.this.getOutputMinFrameDuration.execute(new java.lang.Runnable() { // from class: androidx.camera.video.internal.encoder.EncoderImpl$ByteBufferInput$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.video.internal.encoder.EncoderImpl.ByteBufferInput byteBufferInput = androidx.camera.video.internal.encoder.EncoderImpl.ByteBufferInput.this;
                    final androidx.camera.core.impl.Observable.Observer observer2 = observer;
                    java.util.concurrent.Executor executor2 = executor;
                    byteBufferInput.getHighResolutionOutputSizeshNQ4ISI.put((androidx.camera.core.impl.Observable.Observer) androidx.core.util.Preconditions.checkNotNull(observer2), (java.util.concurrent.Executor) androidx.core.util.Preconditions.checkNotNull(executor2));
                    final androidx.camera.video.internal.BufferProvider.State state = byteBufferInput.getHighSpeedVideoFpsRanges;
                    executor2.execute(new java.lang.Runnable() { // from class: androidx.camera.video.internal.encoder.EncoderImpl$ByteBufferInput$$ExternalSyntheticLambda8
                        @Override // java.lang.Runnable
                        public final void run() {
                            androidx.camera.core.impl.Observable.Observer.this.onNewData(state);
                        }
                    });
                }
            });
        }

        @Override // androidx.camera.core.impl.Observable
        public void removeObserver(final androidx.camera.core.impl.Observable.Observer<? super androidx.camera.video.internal.BufferProvider.State> observer) {
            androidx.camera.video.internal.encoder.EncoderImpl.this.getOutputMinFrameDuration.execute(new java.lang.Runnable() { // from class: androidx.camera.video.internal.encoder.EncoderImpl$ByteBufferInput$$ExternalSyntheticLambda9
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.video.internal.encoder.EncoderImpl.ByteBufferInput.this.getHighResolutionOutputSizeshNQ4ISI.remove(androidx.core.util.Preconditions.checkNotNull(observer));
                }
            });
        }

        final void Camera2StreamConfigurationMap(boolean z) {
            final androidx.camera.video.internal.BufferProvider.State state = z ? androidx.camera.video.internal.BufferProvider.State.ACTIVE : androidx.camera.video.internal.BufferProvider.State.INACTIVE;
            if (this.getHighSpeedVideoFpsRanges != state) {
                this.getHighSpeedVideoFpsRanges = state;
                if (state == androidx.camera.video.internal.BufferProvider.State.INACTIVE) {
                    java.util.Iterator<com.google.common.util.concurrent.ListenableFuture<androidx.camera.video.internal.encoder.InputBuffer>> it = this.Camera2StreamConfigurationMap.iterator();
                    while (it.hasNext()) {
                        it.next().cancel(true);
                    }
                    this.Camera2StreamConfigurationMap.clear();
                }
                for (final java.util.Map.Entry<androidx.camera.core.impl.Observable.Observer<? super androidx.camera.video.internal.BufferProvider.State>, java.util.concurrent.Executor> entry : this.getHighResolutionOutputSizeshNQ4ISI.entrySet()) {
                    try {
                        entry.getValue().execute(new java.lang.Runnable() { // from class: androidx.camera.video.internal.encoder.EncoderImpl$ByteBufferInput$$ExternalSyntheticLambda7
                            @Override // java.lang.Runnable
                            public final void run() {
                                ((androidx.camera.core.impl.Observable.Observer) entry.getKey()).onNewData(state);
                            }
                        });
                    } catch (java.util.concurrent.RejectedExecutionException e) {
                        androidx.camera.core.Logger.e(androidx.camera.video.internal.encoder.EncoderImpl.this.coroutineCreation, "Unable to post to the supplied executor.", e);
                    }
                }
            }
        }
    }

    public static /* synthetic */ void $r8$lambda$SlAnbggd9lEp59VusripYrYneuw(androidx.camera.video.internal.encoder.EncoderImpl encoderImpl) {
        androidx.camera.core.Logger.d(encoderImpl.coroutineCreation, "signalEndOfInputStream");
        androidx.camera.core.impl.utils.futures.Futures.addCallback(encoderImpl.Camera2StreamConfigurationMap(), new androidx.camera.core.impl.utils.futures.FutureCallback<androidx.camera.video.internal.encoder.InputBuffer>() { // from class: androidx.camera.video.internal.encoder.EncoderImpl.1
            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public /* synthetic */ void onSuccess(androidx.camera.video.internal.encoder.InputBuffer inputBuffer) {
                androidx.camera.video.internal.encoder.InputBuffer inputBuffer2 = inputBuffer;
                inputBuffer2.setPresentationTimeUs(androidx.camera.video.internal.encoder.EncoderImpl.this.ArtificialStackFrames.uptimeUs());
                inputBuffer2.setEndOfStream(true);
                inputBuffer2.submit();
                androidx.camera.core.impl.utils.futures.Futures.addCallback(inputBuffer2.getTerminationFuture(), new androidx.camera.core.impl.utils.futures.FutureCallback<java.lang.Void>() { // from class: androidx.camera.video.internal.encoder.EncoderImpl.1.1
                    @Override // androidx.camera.core.impl.utils.futures.FutureCallback
                    public /* bridge */ /* synthetic */ void onSuccess(java.lang.Void r1) {
                    }

                    @Override // androidx.camera.core.impl.utils.futures.FutureCallback
                    public void onFailure(java.lang.Throwable th) {
                        if (!(th instanceof android.media.MediaCodec.CodecException)) {
                            androidx.camera.video.internal.encoder.EncoderImpl.this.Camera2StreamConfigurationMap(0, th.getMessage(), th);
                        } else {
                            android.media.MediaCodec.CodecException codecException = (android.media.MediaCodec.CodecException) th;
                            androidx.camera.video.internal.encoder.EncoderImpl.this.Camera2StreamConfigurationMap(1, codecException.getMessage(), codecException);
                        }
                    }
                }, androidx.camera.video.internal.encoder.EncoderImpl.this.getOutputMinFrameDuration);
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onFailure(java.lang.Throwable th) {
                androidx.camera.video.internal.encoder.EncoderImpl.this.Camera2StreamConfigurationMap(0, "Unable to acquire InputBuffer.", th);
            }
        }, encoderImpl.getOutputMinFrameDuration);
    }

    public static /* synthetic */ long $r8$lambda$kfgy1ft7hGhWsVbp27upmh1easY(androidx.camera.video.internal.encoder.EncoderImpl encoderImpl, long j) {
        android.util.Rational rational = encoderImpl.f2677a;
        return (rational != null && rational.getDenominator() == rational.getNumerator()) ^ true ? java.lang.Math.round(j * encoderImpl.f2677a.doubleValue()) : j;
    }

    static /* synthetic */ long getHighSpeedVideoFpsRangesFor(androidx.camera.video.internal.encoder.EncoderImpl encoderImpl, long j) {
        android.util.Rational rational = encoderImpl.f2677a;
        return (rational != null && rational.getDenominator() == rational.getNumerator()) ^ true ? java.lang.Math.round(j * encoderImpl.f2677a.doubleValue()) : j;
    }

    static /* synthetic */ boolean getHighResolutionOutputSizeshNQ4ISI(androidx.camera.video.internal.encoder.EncoderImpl encoderImpl) {
        android.util.Rational rational = encoderImpl.f2677a;
        return !(rational != null && rational.getDenominator() == rational.getNumerator());
    }

    @Override // androidx.camera.video.internal.encoder.Encoder
    public void pause() {
        final long uptimeUs = this.ArtificialStackFrames.uptimeUs();
        this.getOutputMinFrameDuration.execute(new java.lang.Runnable() { // from class: androidx.camera.video.internal.encoder.EncoderImpl$$ExternalSyntheticLambda12
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.video.internal.encoder.EncoderImpl encoderImpl = androidx.camera.video.internal.encoder.EncoderImpl.this;
                long j = uptimeUs;
                switch (encoderImpl.CoroutineDebuggingKt) {
                    case CONFIGURED:
                    case PAUSED:
                    case STOPPING:
                    case PENDING_START_PAUSED:
                    case ERROR:
                        return;
                    case STARTED:
                        java.lang.String str = encoderImpl.coroutineCreation;
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Pause on ");
                        sb.append(androidx.camera.video.internal.DebugUtils.readableUs(j));
                        androidx.camera.core.Logger.d(str, sb.toString());
                        encoderImpl.Camera2StreamConfigurationMap.addLast(android.util.Range.create(java.lang.Long.valueOf(j), Long.MAX_VALUE));
                        encoderImpl.getHighSpeedVideoFpsRangesFor(androidx.camera.video.internal.encoder.EncoderImpl.InternalState.PAUSED);
                        return;
                    case PENDING_START:
                        encoderImpl.getHighSpeedVideoFpsRangesFor(androidx.camera.video.internal.encoder.EncoderImpl.InternalState.PENDING_START_PAUSED);
                        return;
                    case PENDING_RELEASE:
                    case RELEASED:
                        throw new java.lang.IllegalStateException("Encoder is released");
                    default:
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Unknown state: ");
                        sb2.append(encoderImpl.CoroutineDebuggingKt);
                        throw new java.lang.IllegalStateException(sb2.toString());
                }
            }
        });
    }

    @Override // androidx.camera.video.internal.encoder.Encoder
    public void start() {
        final long uptimeUs = this.ArtificialStackFrames.uptimeUs();
        this.getOutputMinFrameDuration.execute(new java.lang.Runnable() { // from class: androidx.camera.video.internal.encoder.EncoderImpl$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.video.internal.encoder.EncoderImpl encoderImpl = androidx.camera.video.internal.encoder.EncoderImpl.this;
                long j = uptimeUs;
                switch (encoderImpl.CoroutineDebuggingKt) {
                    case CONFIGURED:
                        encoderImpl.getOutputSizeshNQ4ISI = null;
                        java.lang.String str = encoderImpl.coroutineCreation;
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Start on ");
                        sb.append(androidx.camera.video.internal.DebugUtils.readableUs(j));
                        androidx.camera.core.Logger.d(str, sb.toString());
                        try {
                            if (encoderImpl.getOutputStallDurationlomOqCM) {
                                encoderImpl.getHighSpeedVideoSizes();
                            }
                            encoderImpl.accessartificialFrame = android.util.Range.create(java.lang.Long.valueOf(j), Long.MAX_VALUE);
                            androidx.camera.core.Logger.d(encoderImpl.coroutineCreation, "mMediaCodec.start()");
                            encoderImpl.isOutputSupportedForhNQ4ISI.start();
                            androidx.camera.video.internal.encoder.Encoder.EncoderInput encoderInput = encoderImpl.getInputFormats;
                            if (encoderInput instanceof androidx.camera.video.internal.encoder.EncoderImpl.ByteBufferInput) {
                                ((androidx.camera.video.internal.encoder.EncoderImpl.ByteBufferInput) encoderInput).Camera2StreamConfigurationMap(true);
                            }
                            encoderImpl.getHighSpeedVideoFpsRangesFor(androidx.camera.video.internal.encoder.EncoderImpl.InternalState.STARTED);
                            return;
                        } catch (android.media.MediaCodec.CodecException e) {
                            encoderImpl.Camera2StreamConfigurationMap(1, e.getMessage(), e);
                            return;
                        }
                    case STARTED:
                    case PENDING_START:
                    case ERROR:
                        return;
                    case PAUSED:
                        encoderImpl.getOutputSizeshNQ4ISI = null;
                        android.util.Range<java.lang.Long> removeLast = encoderImpl.Camera2StreamConfigurationMap.removeLast();
                        androidx.core.util.Preconditions.checkState(removeLast != null && removeLast.getUpper().longValue() == Long.MAX_VALUE, "There should be a \"pause\" before \"resume\"");
                        long longValue = removeLast.getLower().longValue();
                        encoderImpl.Camera2StreamConfigurationMap.addLast(android.util.Range.create(java.lang.Long.valueOf(longValue), java.lang.Long.valueOf(j)));
                        java.lang.String str2 = encoderImpl.coroutineCreation;
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Resume on ");
                        sb2.append(androidx.camera.video.internal.DebugUtils.readableUs(j));
                        sb2.append("\nPaused duration = ");
                        sb2.append(androidx.camera.video.internal.DebugUtils.readableUs(j - longValue));
                        androidx.camera.core.Logger.d(str2, sb2.toString());
                        if ((encoderImpl.getOutputMinFrameDurationlomOqCM || androidx.camera.video.internal.compat.quirk.DeviceQuirks.get(androidx.camera.video.internal.compat.quirk.AudioEncoderIgnoresInputTimestampQuirk.class) == null) && (!encoderImpl.getOutputMinFrameDurationlomOqCM || androidx.camera.video.internal.compat.quirk.DeviceQuirks.get(androidx.camera.video.internal.compat.quirk.VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk.class) == null)) {
                            encoderImpl.getHighResolutionOutputSizeshNQ4ISI(false);
                            androidx.camera.video.internal.encoder.Encoder.EncoderInput encoderInput2 = encoderImpl.getInputFormats;
                            if (encoderInput2 instanceof androidx.camera.video.internal.encoder.EncoderImpl.ByteBufferInput) {
                                ((androidx.camera.video.internal.encoder.EncoderImpl.ByteBufferInput) encoderInput2).Camera2StreamConfigurationMap(true);
                            }
                        }
                        if (encoderImpl.getOutputMinFrameDurationlomOqCM) {
                            encoderImpl.getHighSpeedVideoFpsRangesFor();
                        }
                        encoderImpl.getHighSpeedVideoFpsRangesFor(androidx.camera.video.internal.encoder.EncoderImpl.InternalState.STARTED);
                        return;
                    case STOPPING:
                    case PENDING_START_PAUSED:
                        encoderImpl.getHighSpeedVideoFpsRangesFor(androidx.camera.video.internal.encoder.EncoderImpl.InternalState.PENDING_START);
                        return;
                    case PENDING_RELEASE:
                    case RELEASED:
                        throw new java.lang.IllegalStateException("Encoder is released");
                    default:
                        java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Unknown state: ");
                        sb3.append(encoderImpl.CoroutineDebuggingKt);
                        throw new java.lang.IllegalStateException(sb3.toString());
                }
            }
        });
    }

    @Override // androidx.camera.video.internal.encoder.Encoder
    public void stop(final long j) {
        final long uptimeUs = this.ArtificialStackFrames.uptimeUs();
        this.getOutputMinFrameDuration.execute(new java.lang.Runnable() { // from class: androidx.camera.video.internal.encoder.EncoderImpl$$ExternalSyntheticLambda4
            /* JADX WARN: Removed duplicated region for block: B:19:0x0065  */
            /* JADX WARN: Removed duplicated region for block: B:27:0x00ad  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void run() {
                final androidx.camera.video.internal.encoder.EncoderImpl encoderImpl = androidx.camera.video.internal.encoder.EncoderImpl.this;
                long j2 = j;
                long j3 = uptimeUs;
                switch (encoderImpl.CoroutineDebuggingKt) {
                    case CONFIGURED:
                    case STOPPING:
                    case ERROR:
                        return;
                    case STARTED:
                    case PAUSED:
                        androidx.camera.video.internal.encoder.EncoderImpl.InternalState internalState = encoderImpl.CoroutineDebuggingKt;
                        encoderImpl.getHighSpeedVideoFpsRangesFor(androidx.camera.video.internal.encoder.EncoderImpl.InternalState.STOPPING);
                        long longValue = encoderImpl.accessartificialFrame.getLower().longValue();
                        if (longValue == Long.MAX_VALUE) {
                            throw new java.lang.AssertionError("There should be a \"start\" before \"stop\"");
                        }
                        if (j2 != -1) {
                            if (j2 < longValue) {
                                androidx.camera.core.Logger.w(encoderImpl.coroutineCreation, "The expected stop time is less than the start time. Use current time as stop time.");
                            }
                            if (j2 >= longValue) {
                                throw new java.lang.AssertionError("The start time should be before the stop time.");
                            }
                            encoderImpl.accessartificialFrame = android.util.Range.create(java.lang.Long.valueOf(longValue), java.lang.Long.valueOf(j2));
                            java.lang.String str = encoderImpl.coroutineCreation;
                            java.lang.StringBuilder sb = new java.lang.StringBuilder("Stop on ");
                            sb.append(androidx.camera.video.internal.DebugUtils.readableUs(j2));
                            androidx.camera.core.Logger.d(str, sb.toString());
                            if (internalState == androidx.camera.video.internal.encoder.EncoderImpl.InternalState.PAUSED && encoderImpl.getOutputSizeshNQ4ISI != null) {
                                encoderImpl.getInputFormats();
                                return;
                            } else {
                                encoderImpl.toString = true;
                                encoderImpl.coroutineBoundary = androidx.camera.core.impl.utils.executor.CameraXExecutors.mainThreadExecutor().schedule(new java.lang.Runnable() { // from class: androidx.camera.video.internal.encoder.EncoderImpl$$ExternalSyntheticLambda2
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        final androidx.camera.video.internal.encoder.EncoderImpl encoderImpl2 = androidx.camera.video.internal.encoder.EncoderImpl.this;
                                        encoderImpl2.getOutputMinFrameDuration.execute(new java.lang.Runnable() { // from class: androidx.camera.video.internal.encoder.EncoderImpl$$ExternalSyntheticLambda13
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                androidx.camera.video.internal.encoder.EncoderImpl encoderImpl3 = androidx.camera.video.internal.encoder.EncoderImpl.this;
                                                if (encoderImpl3.toString) {
                                                    androidx.camera.core.Logger.w(encoderImpl3.coroutineCreation, "The data didn't reach the expected timestamp before timeout, stop the codec.");
                                                    encoderImpl3.getOutputSizeshNQ4ISI = null;
                                                    encoderImpl3.getInputFormats();
                                                    encoderImpl3.toString = false;
                                                }
                                            }
                                        });
                                    }
                                }, 1000L, java.util.concurrent.TimeUnit.MILLISECONDS);
                                return;
                            }
                        }
                        j2 = j3;
                        if (j2 >= longValue) {
                        }
                        break;
                    case PENDING_START:
                    case PENDING_START_PAUSED:
                        encoderImpl.getHighSpeedVideoFpsRangesFor(androidx.camera.video.internal.encoder.EncoderImpl.InternalState.CONFIGURED);
                        return;
                    case PENDING_RELEASE:
                    case RELEASED:
                        throw new java.lang.IllegalStateException("Encoder is released");
                    default:
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Unknown state: ");
                        sb2.append(encoderImpl.CoroutineDebuggingKt);
                        throw new java.lang.IllegalStateException(sb2.toString());
                }
            }
        });
    }
}
