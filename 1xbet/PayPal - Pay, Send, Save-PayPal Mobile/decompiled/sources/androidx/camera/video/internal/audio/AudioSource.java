package androidx.camera.video.internal.audio;

/* loaded from: classes6.dex */
public final class AudioSource {
    private androidx.camera.core.impl.utils.futures.FutureCallback<androidx.camera.video.internal.encoder.InputBuffer> ArtificialStackFrames;
    final int Camera2StreamConfigurationMap;
    private androidx.camera.core.impl.Observable.Observer<androidx.camera.video.internal.BufferProvider.State> coroutineCreation;
    androidx.camera.video.internal.audio.AudioSource.AudioSourceCallback getHighResolutionOutputSizeshNQ4ISI;
    final androidx.camera.video.internal.audio.AudioStream getHighSpeedVideoFpsRanges;
    long getHighSpeedVideoFpsRangesFor;
    double getHighSpeedVideoSizes;
    androidx.camera.video.internal.BufferProvider.State getHighSpeedVideoSizesFor;
    java.util.concurrent.Executor getInputFormats;
    boolean getInputSizeshNQ4ISI;
    final java.util.concurrent.Executor getOutputFormats;
    androidx.camera.video.internal.BufferProvider<? extends androidx.camera.video.internal.encoder.InputBuffer> getOutputMinFrameDuration;
    long getOutputMinFrameDurationlomOqCM;
    boolean getOutputSizes;
    boolean getOutputSizeshNQ4ISI;
    final java.util.concurrent.atomic.AtomicReference<java.lang.Boolean> getOutputStallDuration;
    boolean getOutputStallDurationlomOqCM;
    final androidx.camera.video.internal.audio.SilentAudioStream getValidOutputFormatsForInputhNQ4ISI;
    final long isOutputSupportedFor;
    final java.util.concurrent.atomic.AtomicBoolean isOutputSupportedForhNQ4ISI;
    public final int mAudioSource;
    byte[] toString;
    androidx.camera.video.internal.audio.AudioSource.InternalState unwrapAs;

    public interface AudioSourceCallback {
        void onAmplitudeValue(double d);

        void onError(java.lang.Throwable th);

        void onSilenceStateChanged(boolean z);

        default void onSuspendStateChanged(boolean z) {
        }
    }

    enum InternalState {
        CONFIGURED,
        STARTED,
        RELEASED
    }

    public AudioSource(androidx.camera.video.internal.audio.AudioSettings audioSettings, java.util.concurrent.Executor executor, android.content.Context context) throws androidx.camera.video.internal.audio.AudioSourceAccessException {
        this(audioSettings, executor, context, new androidx.camera.video.internal.audio.AudioStreamFactory() { // from class: androidx.camera.video.internal.audio.AudioSource$$ExternalSyntheticLambda3
            @Override // androidx.camera.video.internal.audio.AudioStreamFactory
            public final androidx.camera.video.internal.audio.AudioStream create(androidx.camera.video.internal.audio.AudioSettings audioSettings2, android.content.Context context2) {
                return new androidx.camera.video.internal.audio.AudioStreamImpl(audioSettings2, context2);
            }
        });
    }

    private AudioSource(androidx.camera.video.internal.audio.AudioSettings audioSettings, java.util.concurrent.Executor executor, android.content.Context context, androidx.camera.video.internal.audio.AudioStreamFactory audioStreamFactory) throws androidx.camera.video.internal.audio.AudioSourceAccessException {
        this.getOutputStallDuration = new java.util.concurrent.atomic.AtomicReference<>(null);
        this.isOutputSupportedForhNQ4ISI = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.unwrapAs = androidx.camera.video.internal.audio.AudioSource.InternalState.CONFIGURED;
        this.getHighSpeedVideoSizesFor = androidx.camera.video.internal.BufferProvider.State.INACTIVE;
        this.getHighSpeedVideoFpsRangesFor = 0L;
        java.util.concurrent.Executor newSequentialExecutor = androidx.camera.core.impl.utils.executor.CameraXExecutors.newSequentialExecutor(executor);
        this.getOutputFormats = newSequentialExecutor;
        this.isOutputSupportedFor = java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(3000L);
        try {
            androidx.camera.video.internal.audio.BufferedAudioStream bufferedAudioStream = new androidx.camera.video.internal.audio.BufferedAudioStream(audioStreamFactory.create(audioSettings, context), audioSettings);
            this.getHighSpeedVideoFpsRanges = bufferedAudioStream;
            bufferedAudioStream.setCallback(new androidx.camera.video.internal.audio.AudioSource.AudioStreamCallback(), newSequentialExecutor);
            this.getValidOutputFormatsForInputhNQ4ISI = new androidx.camera.video.internal.audio.SilentAudioStream(audioSettings);
            this.Camera2StreamConfigurationMap = audioSettings.getAudioFormat();
            this.mAudioSource = audioSettings.getAudioSource();
        } catch (androidx.camera.video.internal.audio.AudioStream.AudioStreamException | java.lang.IllegalArgumentException e) {
            throw new androidx.camera.video.internal.audio.AudioSourceAccessException("Unable to create AudioStream", e);
        }
    }

    class AudioStreamCallback implements androidx.camera.video.internal.audio.AudioStream.AudioStreamCallback {
        AudioStreamCallback() {
        }

        @Override // androidx.camera.video.internal.audio.AudioStream.AudioStreamCallback
        public void onSilenceStateChanged(boolean z) {
            androidx.camera.video.internal.audio.AudioSource.this.getInputSizeshNQ4ISI = z;
            if (androidx.camera.video.internal.audio.AudioSource.this.unwrapAs == androidx.camera.video.internal.audio.AudioSource.InternalState.STARTED) {
                androidx.camera.video.internal.audio.AudioSource.this.Camera2StreamConfigurationMap();
            }
        }
    }

    public final void setBufferProvider(final androidx.camera.video.internal.BufferProvider<? extends androidx.camera.video.internal.encoder.InputBuffer> bufferProvider) {
        this.getOutputFormats.execute(new java.lang.Runnable() { // from class: androidx.camera.video.internal.audio.AudioSource$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.video.internal.audio.AudioSource audioSource = androidx.camera.video.internal.audio.AudioSource.this;
                androidx.camera.video.internal.BufferProvider<? extends androidx.camera.video.internal.encoder.InputBuffer> bufferProvider2 = bufferProvider;
                int ordinal = audioSource.unwrapAs.ordinal();
                if (ordinal != 0 && ordinal != 1) {
                    if (ordinal == 2) {
                        throw new java.lang.AssertionError("AudioSource is released");
                    }
                } else if (audioSource.getOutputMinFrameDuration != bufferProvider2) {
                    audioSource.getHighSpeedVideoSizes(bufferProvider2);
                }
            }
        });
    }

    public final void start() {
        this.getOutputFormats.execute(new java.lang.Runnable() { // from class: androidx.camera.video.internal.audio.AudioSource$$ExternalSyntheticLambda9
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.video.internal.audio.AudioSource audioSource = androidx.camera.video.internal.audio.AudioSource.this;
                audioSource.start(audioSource.getOutputSizeshNQ4ISI);
            }
        });
    }

    public final void start(final boolean z) {
        this.getOutputFormats.execute(new java.lang.Runnable() { // from class: androidx.camera.video.internal.audio.AudioSource$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.video.internal.audio.AudioSource audioSource = androidx.camera.video.internal.audio.AudioSource.this;
                boolean z2 = z;
                int ordinal = audioSource.unwrapAs.ordinal();
                if (ordinal != 0) {
                    if (ordinal == 2) {
                        throw new java.lang.AssertionError("AudioSource is released");
                    }
                    return;
                }
                audioSource.getOutputStallDuration.set(null);
                audioSource.isOutputSupportedForhNQ4ISI.set(false);
                audioSource.Camera2StreamConfigurationMap(androidx.camera.video.internal.audio.AudioSource.InternalState.STARTED);
                audioSource.mute(z2);
                audioSource.getHighSpeedVideoFpsRangesFor();
            }
        });
    }

    public final void stop() {
        this.getOutputFormats.execute(new java.lang.Runnable() { // from class: androidx.camera.video.internal.audio.AudioSource$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.video.internal.audio.AudioSource audioSource = androidx.camera.video.internal.audio.AudioSource.this;
                int ordinal = audioSource.unwrapAs.ordinal();
                if (ordinal == 1) {
                    audioSource.Camera2StreamConfigurationMap(androidx.camera.video.internal.audio.AudioSource.InternalState.CONFIGURED);
                    audioSource.getHighSpeedVideoFpsRangesFor();
                } else if (ordinal == 2) {
                    androidx.camera.core.Logger.w("AudioSource", "AudioSource is released. Calling stop() is a no-op.");
                }
            }
        });
    }

    public final com.google.common.util.concurrent.ListenableFuture<java.lang.Void> release() {
        return androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(new androidx.concurrent.futures.CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.video.internal.audio.AudioSource$$ExternalSyntheticLambda5
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final java.lang.Object attachCompleter(final androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer) {
                final androidx.camera.video.internal.audio.AudioSource audioSource = androidx.camera.video.internal.audio.AudioSource.this;
                audioSource.getOutputFormats.execute(new java.lang.Runnable() { // from class: androidx.camera.video.internal.audio.AudioSource$$ExternalSyntheticLambda8
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.camera.video.internal.audio.AudioSource audioSource2 = androidx.camera.video.internal.audio.AudioSource.this;
                        androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer2 = completer;
                        try {
                            int ordinal = audioSource2.unwrapAs.ordinal();
                            if (ordinal == 0 || ordinal == 1) {
                                audioSource2.getHighSpeedVideoSizes(null);
                                audioSource2.getValidOutputFormatsForInputhNQ4ISI.release();
                                audioSource2.getHighSpeedVideoFpsRanges.release();
                                if (audioSource2.getOutputSizes) {
                                    audioSource2.getOutputSizes = false;
                                    androidx.camera.core.Logger.d("AudioSource", "stopSendingAudio");
                                    audioSource2.getHighSpeedVideoFpsRanges.stop();
                                }
                                audioSource2.Camera2StreamConfigurationMap(androidx.camera.video.internal.audio.AudioSource.InternalState.RELEASED);
                            }
                            completer2.set(null);
                        } catch (java.lang.Throwable th) {
                            completer2.setException(th);
                        }
                    }
                });
                return "AudioSource-release";
            }
        });
    }

    public final void setAudioSourceCallback(final java.util.concurrent.Executor executor, final androidx.camera.video.internal.audio.AudioSource.AudioSourceCallback audioSourceCallback) {
        this.getOutputFormats.execute(new java.lang.Runnable() { // from class: androidx.camera.video.internal.audio.AudioSource$$ExternalSyntheticLambda10
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.video.internal.audio.AudioSource audioSource = androidx.camera.video.internal.audio.AudioSource.this;
                java.util.concurrent.Executor executor2 = executor;
                androidx.camera.video.internal.audio.AudioSource.AudioSourceCallback audioSourceCallback2 = audioSourceCallback;
                int ordinal = audioSource.unwrapAs.ordinal();
                if (ordinal == 0) {
                    audioSource.getInputFormats = executor2;
                    audioSource.getHighResolutionOutputSizeshNQ4ISI = audioSourceCallback2;
                } else if (ordinal == 1 || ordinal == 2) {
                    throw new java.lang.AssertionError("The audio recording callback must be registered before the audio source is started.");
                }
            }
        });
    }

    public final void mute(final boolean z) {
        this.getOutputFormats.execute(new java.lang.Runnable() { // from class: androidx.camera.video.internal.audio.AudioSource$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.video.internal.audio.AudioSource audioSource = androidx.camera.video.internal.audio.AudioSource.this;
                boolean z2 = z;
                int ordinal = audioSource.unwrapAs.ordinal();
                if (ordinal != 0 && ordinal != 1) {
                    if (ordinal == 2) {
                        throw new java.lang.AssertionError("AudioSource is released");
                    }
                } else if (audioSource.getOutputSizeshNQ4ISI != z2) {
                    audioSource.getOutputSizeshNQ4ISI = z2;
                    if (audioSource.unwrapAs == androidx.camera.video.internal.audio.AudioSource.InternalState.STARTED) {
                        audioSource.Camera2StreamConfigurationMap();
                    }
                }
            }
        });
    }

    final void getHighSpeedVideoSizes(final androidx.camera.video.internal.BufferProvider<? extends androidx.camera.video.internal.encoder.InputBuffer> bufferProvider) {
        androidx.camera.video.internal.BufferProvider<? extends androidx.camera.video.internal.encoder.InputBuffer> bufferProvider2 = this.getOutputMinFrameDuration;
        if (bufferProvider2 != null) {
            bufferProvider2.removeObserver((androidx.camera.core.impl.Observable.Observer) java.util.Objects.requireNonNull(this.coroutineCreation));
            this.getOutputMinFrameDuration = null;
            this.coroutineCreation = null;
            this.ArtificialStackFrames = null;
            this.getHighSpeedVideoSizesFor = androidx.camera.video.internal.BufferProvider.State.INACTIVE;
            getHighSpeedVideoFpsRangesFor();
        }
        if (bufferProvider != null) {
            this.getOutputMinFrameDuration = bufferProvider;
            this.coroutineCreation = new androidx.camera.core.impl.Observable.Observer<androidx.camera.video.internal.BufferProvider.State>() { // from class: androidx.camera.video.internal.audio.AudioSource.1
                @Override // androidx.camera.core.impl.Observable.Observer
                public /* synthetic */ void onNewData(androidx.camera.video.internal.BufferProvider.State state) {
                    androidx.camera.video.internal.BufferProvider.State state2 = state;
                    java.util.Objects.requireNonNull(state2);
                    if (androidx.camera.video.internal.audio.AudioSource.this.getOutputMinFrameDuration == bufferProvider) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Receive BufferProvider state change: ");
                        sb.append(androidx.camera.video.internal.audio.AudioSource.this.getHighSpeedVideoSizesFor);
                        sb.append(" to ");
                        sb.append(state2);
                        androidx.camera.core.Logger.d("AudioSource", sb.toString());
                        if (androidx.camera.video.internal.audio.AudioSource.this.getHighSpeedVideoSizesFor != state2) {
                            androidx.camera.video.internal.audio.AudioSource.this.getHighSpeedVideoSizesFor = state2;
                            androidx.camera.video.internal.audio.AudioSource.this.getHighSpeedVideoFpsRangesFor();
                        }
                    }
                }

                @Override // androidx.camera.core.impl.Observable.Observer
                public void onError(java.lang.Throwable th) {
                    if (androidx.camera.video.internal.audio.AudioSource.this.getOutputMinFrameDuration == bufferProvider) {
                        androidx.camera.video.internal.audio.AudioSource.this.Camera2StreamConfigurationMap(th);
                    }
                }
            };
            this.ArtificialStackFrames = new androidx.camera.core.impl.utils.futures.FutureCallback<androidx.camera.video.internal.encoder.InputBuffer>() { // from class: androidx.camera.video.internal.audio.AudioSource.2
                @Override // androidx.camera.core.impl.utils.futures.FutureCallback
                public /* synthetic */ void onSuccess(androidx.camera.video.internal.encoder.InputBuffer inputBuffer) {
                    androidx.camera.video.internal.encoder.InputBuffer inputBuffer2 = inputBuffer;
                    if (!androidx.camera.video.internal.audio.AudioSource.this.getOutputSizes || androidx.camera.video.internal.audio.AudioSource.this.getOutputMinFrameDuration != bufferProvider) {
                        inputBuffer2.cancel();
                        return;
                    }
                    if (androidx.camera.video.internal.audio.AudioSource.this.getOutputStallDurationlomOqCM) {
                        androidx.camera.video.internal.audio.AudioSource audioSource = androidx.camera.video.internal.audio.AudioSource.this;
                        androidx.core.util.Preconditions.checkState(audioSource.getOutputMinFrameDurationlomOqCM > 0);
                        if (androidx.camera.video.internal.audio.AudioSource.getHighSpeedVideoSizes() - audioSource.getOutputMinFrameDurationlomOqCM >= audioSource.isOutputSupportedFor) {
                            androidx.camera.video.internal.audio.AudioSource audioSource2 = androidx.camera.video.internal.audio.AudioSource.this;
                            androidx.core.util.Preconditions.checkState(audioSource2.getOutputStallDurationlomOqCM);
                            try {
                                audioSource2.getHighSpeedVideoFpsRanges.start();
                                androidx.camera.core.Logger.d("AudioSource", "Retry start AudioStream succeed");
                                audioSource2.getValidOutputFormatsForInputhNQ4ISI.stop();
                                audioSource2.getOutputStallDurationlomOqCM = false;
                            } catch (androidx.camera.video.internal.audio.AudioStream.AudioStreamException e) {
                                androidx.camera.core.Logger.w("AudioSource", "Retry start AudioStream failed", e);
                                audioSource2.getOutputMinFrameDurationlomOqCM = androidx.camera.video.internal.audio.AudioSource.getHighSpeedVideoSizes();
                            }
                        }
                    }
                    androidx.camera.video.internal.audio.AudioSource audioSource3 = androidx.camera.video.internal.audio.AudioSource.this;
                    androidx.camera.video.internal.audio.AudioStream audioStream = audioSource3.getOutputStallDurationlomOqCM ? audioSource3.getValidOutputFormatsForInputhNQ4ISI : audioSource3.getHighSpeedVideoFpsRanges;
                    java.nio.ByteBuffer byteBuffer = inputBuffer2.getByteBuffer();
                    androidx.camera.video.internal.audio.AudioStream.PacketInfo read = audioStream.read(byteBuffer);
                    if (read.getSizeInBytes() > 0) {
                        if (androidx.camera.video.internal.audio.AudioSource.this.getOutputSizeshNQ4ISI) {
                            androidx.camera.video.internal.audio.AudioSource audioSource4 = androidx.camera.video.internal.audio.AudioSource.this;
                            int sizeInBytes = read.getSizeInBytes();
                            byte[] bArr = audioSource4.toString;
                            if (bArr == null || bArr.length < sizeInBytes) {
                                audioSource4.toString = new byte[sizeInBytes];
                            }
                            int position = byteBuffer.position();
                            byteBuffer.put(audioSource4.toString, 0, sizeInBytes);
                            byteBuffer.limit(byteBuffer.position()).position(position);
                        }
                        if (androidx.camera.video.internal.audio.AudioSource.this.getInputFormats != null && read.getTimestampNs() - androidx.camera.video.internal.audio.AudioSource.this.getHighSpeedVideoFpsRangesFor >= 200) {
                            androidx.camera.video.internal.audio.AudioSource.this.getHighSpeedVideoFpsRangesFor = read.getTimestampNs();
                            final androidx.camera.video.internal.audio.AudioSource audioSource5 = androidx.camera.video.internal.audio.AudioSource.this;
                            java.util.concurrent.Executor executor = audioSource5.getInputFormats;
                            final androidx.camera.video.internal.audio.AudioSource.AudioSourceCallback audioSourceCallback = audioSource5.getHighResolutionOutputSizeshNQ4ISI;
                            if (audioSource5.Camera2StreamConfigurationMap == 2) {
                                java.nio.ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
                                double d = 0.0d;
                                while (asShortBuffer.hasRemaining()) {
                                    d = java.lang.Math.max(d, java.lang.Math.abs((int) asShortBuffer.get()));
                                }
                                audioSource5.getHighSpeedVideoSizes = d / 32767.0d;
                                if (executor != null && audioSourceCallback != null) {
                                    executor.execute(new java.lang.Runnable() { // from class: androidx.camera.video.internal.audio.AudioSource$$ExternalSyntheticLambda11
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            audioSourceCallback.onAmplitudeValue(androidx.camera.video.internal.audio.AudioSource.this.getHighSpeedVideoSizes);
                                        }
                                    });
                                }
                            }
                        }
                        byteBuffer.limit(byteBuffer.position() + read.getSizeInBytes());
                        inputBuffer2.setPresentationTimeUs(java.util.concurrent.TimeUnit.NANOSECONDS.toMicros(read.getTimestampNs()));
                        inputBuffer2.submit();
                    } else {
                        androidx.camera.core.Logger.w("AudioSource", "Unable to read data from AudioStream.");
                        inputBuffer2.cancel();
                    }
                    androidx.camera.video.internal.audio.AudioSource.this.getHighResolutionOutputSizeshNQ4ISI();
                }

                @Override // androidx.camera.core.impl.utils.futures.FutureCallback
                public void onFailure(java.lang.Throwable th) {
                    if (androidx.camera.video.internal.audio.AudioSource.this.getOutputMinFrameDuration == bufferProvider) {
                        androidx.camera.core.Logger.d("AudioSource", "Unable to get input buffer, the BufferProvider could be transitioning to INACTIVE state.");
                        if (th instanceof java.lang.IllegalStateException) {
                            return;
                        }
                        androidx.camera.video.internal.audio.AudioSource.this.Camera2StreamConfigurationMap(th);
                    }
                }
            };
            androidx.camera.video.internal.BufferProvider.State highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(bufferProvider);
            if (highSpeedVideoFpsRanges != null) {
                this.getHighSpeedVideoSizesFor = highSpeedVideoFpsRanges;
                getHighSpeedVideoFpsRangesFor();
            }
            this.getOutputMinFrameDuration.addObserver(this.getOutputFormats, this.coroutineCreation);
        }
    }

    final void Camera2StreamConfigurationMap(final java.lang.Throwable th) {
        java.util.concurrent.Executor executor = this.getInputFormats;
        final androidx.camera.video.internal.audio.AudioSource.AudioSourceCallback audioSourceCallback = this.getHighResolutionOutputSizeshNQ4ISI;
        if (executor == null || audioSourceCallback == null) {
            return;
        }
        executor.execute(new java.lang.Runnable() { // from class: androidx.camera.video.internal.audio.AudioSource$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.video.internal.audio.AudioSource.AudioSourceCallback.this.onError(th);
            }
        });
    }

    final void Camera2StreamConfigurationMap() {
        java.util.concurrent.Executor executor = this.getInputFormats;
        final androidx.camera.video.internal.audio.AudioSource.AudioSourceCallback audioSourceCallback = this.getHighResolutionOutputSizeshNQ4ISI;
        if (executor == null || audioSourceCallback == null) {
            return;
        }
        final boolean z = this.getOutputSizeshNQ4ISI || this.getOutputStallDurationlomOqCM || this.getInputSizeshNQ4ISI;
        if (java.util.Objects.equals(this.getOutputStallDuration.getAndSet(java.lang.Boolean.valueOf(z)), java.lang.Boolean.valueOf(z))) {
            return;
        }
        executor.execute(new java.lang.Runnable() { // from class: androidx.camera.video.internal.audio.AudioSource$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.video.internal.audio.AudioSource.AudioSourceCallback.this.onSilenceStateChanged(z);
            }
        });
    }

    private void getHighSpeedVideoFpsRanges(final boolean z) {
        java.util.concurrent.Executor executor = this.getInputFormats;
        final androidx.camera.video.internal.audio.AudioSource.AudioSourceCallback audioSourceCallback = this.getHighResolutionOutputSizeshNQ4ISI;
        if (executor == null || audioSourceCallback == null || this.isOutputSupportedForhNQ4ISI.getAndSet(z) == z) {
            return;
        }
        executor.execute(new java.lang.Runnable() { // from class: androidx.camera.video.internal.audio.AudioSource$$ExternalSyntheticLambda12
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.video.internal.audio.AudioSource.AudioSourceCallback.this.onSuspendStateChanged(z);
            }
        });
    }

    final void getHighSpeedVideoFpsRangesFor() {
        if (this.unwrapAs == androidx.camera.video.internal.audio.AudioSource.InternalState.STARTED) {
            boolean z = this.getHighSpeedVideoSizesFor == androidx.camera.video.internal.BufferProvider.State.ACTIVE;
            getHighSpeedVideoFpsRanges(!z);
            if (z) {
                getHighSpeedVideoFpsRanges();
                return;
            } else {
                if (this.getOutputSizes) {
                    this.getOutputSizes = false;
                    androidx.camera.core.Logger.d("AudioSource", "stopSendingAudio");
                    this.getHighSpeedVideoFpsRanges.stop();
                    return;
                }
                return;
            }
        }
        if (this.getOutputSizes) {
            this.getOutputSizes = false;
            androidx.camera.core.Logger.d("AudioSource", "stopSendingAudio");
            this.getHighSpeedVideoFpsRanges.stop();
        }
    }

    private void getHighSpeedVideoFpsRanges() {
        if (this.getOutputSizes) {
            return;
        }
        try {
            androidx.camera.core.Logger.d("AudioSource", "startSendingAudio");
            this.getHighSpeedVideoFpsRanges.start();
            this.getOutputStallDurationlomOqCM = false;
        } catch (androidx.camera.video.internal.audio.AudioStream.AudioStreamException e) {
            androidx.camera.core.Logger.w("AudioSource", "Failed to start AudioStream", e);
            this.getOutputStallDurationlomOqCM = true;
            this.getValidOutputFormatsForInputhNQ4ISI.start();
            this.getOutputMinFrameDurationlomOqCM = java.lang.System.nanoTime();
            Camera2StreamConfigurationMap();
        }
        this.getOutputSizes = true;
        getHighResolutionOutputSizeshNQ4ISI();
    }

    final void getHighResolutionOutputSizeshNQ4ISI() {
        androidx.camera.core.impl.utils.futures.Futures.addCallback(((androidx.camera.video.internal.BufferProvider) java.util.Objects.requireNonNull(this.getOutputMinFrameDuration)).acquireBuffer(), (androidx.camera.core.impl.utils.futures.FutureCallback) java.util.Objects.requireNonNull(this.ArtificialStackFrames), this.getOutputFormats);
    }

    final void Camera2StreamConfigurationMap(androidx.camera.video.internal.audio.AudioSource.InternalState internalState) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Transitioning internal state: ");
        sb.append(this.unwrapAs);
        sb.append(" --> ");
        sb.append(internalState);
        androidx.camera.core.Logger.d("AudioSource", sb.toString());
        this.unwrapAs = internalState;
    }

    private static androidx.camera.video.internal.BufferProvider.State getHighSpeedVideoFpsRanges(androidx.camera.video.internal.BufferProvider<? extends androidx.camera.video.internal.encoder.InputBuffer> bufferProvider) {
        try {
            com.google.common.util.concurrent.ListenableFuture<? extends androidx.camera.video.internal.encoder.InputBuffer> fetchData = bufferProvider.fetchData();
            if (fetchData.isDone()) {
                return (androidx.camera.video.internal.BufferProvider.State) fetchData.get();
            }
            return null;
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException unused) {
            return null;
        }
    }

    public static boolean isSettingsSupported(int i, int i2, int i3) {
        return androidx.camera.video.internal.audio.AudioStreamImpl.isSettingsSupported(i, i2, i3);
    }

    static long getHighSpeedVideoSizes() {
        return java.lang.System.nanoTime();
    }
}
