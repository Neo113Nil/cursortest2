package androidx.camera.video;

/* loaded from: classes.dex */
public final class Recording implements java.lang.AutoCloseable {
    final androidx.camera.video.OutputOptions Camera2StreamConfigurationMap;
    private final androidx.camera.core.impl.utils.CloseGuardHelper getHighResolutionOutputSizeshNQ4ISI;
    private final boolean getHighSpeedVideoFpsRanges;
    final long getHighSpeedVideoFpsRangesFor;
    private final java.util.concurrent.atomic.AtomicBoolean getHighSpeedVideoSizes;
    private final androidx.camera.video.Recorder getHighSpeedVideoSizesFor;

    private Recording(androidx.camera.video.Recorder recorder, long j, androidx.camera.video.OutputOptions outputOptions, boolean z, boolean z2) {
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.getHighSpeedVideoSizes = atomicBoolean;
        androidx.camera.core.impl.utils.CloseGuardHelper create = androidx.camera.core.impl.utils.CloseGuardHelper.create();
        this.getHighResolutionOutputSizeshNQ4ISI = create;
        this.getHighSpeedVideoSizesFor = recorder;
        this.getHighSpeedVideoFpsRangesFor = j;
        this.Camera2StreamConfigurationMap = outputOptions;
        this.getHighSpeedVideoFpsRanges = z;
        if (z2) {
            atomicBoolean.set(true);
        } else {
            create.open("stop");
        }
    }

    static androidx.camera.video.Recording getHighSpeedVideoFpsRanges(androidx.camera.video.PendingRecording pendingRecording, long j) {
        androidx.core.util.Preconditions.checkNotNull(pendingRecording, "The given PendingRecording cannot be null.");
        return new androidx.camera.video.Recording(pendingRecording.getGetHighSpeedVideoFpsRanges(), j, pendingRecording.getGetHighSpeedVideoSizes(), pendingRecording.getGetInputFormats(), false);
    }

    static androidx.camera.video.Recording getHighResolutionOutputSizeshNQ4ISI(androidx.camera.video.PendingRecording pendingRecording, long j) {
        androidx.core.util.Preconditions.checkNotNull(pendingRecording, "The given PendingRecording cannot be null.");
        return new androidx.camera.video.Recording(pendingRecording.getGetHighSpeedVideoFpsRanges(), j, pendingRecording.getGetHighSpeedVideoSizes(), pendingRecording.getGetInputFormats(), true);
    }

    public final boolean isPersistent() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final void pause() {
        if (this.getHighSpeedVideoSizes.get()) {
            throw new java.lang.IllegalStateException("The recording has been stopped.");
        }
        final androidx.camera.video.Recorder recorder = this.getHighSpeedVideoSizesFor;
        synchronized (recorder.getARTIFICIAL_FRAME_PACKAGE_NAME) {
            if (!androidx.camera.video.Recorder.getHighSpeedVideoFpsRangesFor(this, recorder.d) && !androidx.camera.video.Recorder.getHighSpeedVideoFpsRangesFor(this, recorder.getHighSpeedVideoSizes)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("pause() called on a recording that is no longer active: ");
                sb.append(this.Camera2StreamConfigurationMap);
                androidx.camera.core.Logger.d("Recorder", sb.toString());
                return;
            }
            int ordinal = recorder.rsaCipher.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    recorder.getHighSpeedVideoSizes(androidx.camera.video.Recorder.State.PENDING_PAUSED);
                } else if (ordinal != 3) {
                    if (ordinal == 4) {
                        recorder.getHighSpeedVideoSizes(androidx.camera.video.Recorder.State.PAUSED);
                        final androidx.camera.video.Recorder.RecordingRecord recordingRecord = recorder.getHighSpeedVideoSizes;
                        recorder.requestGoOnline.execute(new java.lang.Runnable() { // from class: androidx.camera.video.Recorder$$ExternalSyntheticLambda17
                            @Override // java.lang.Runnable
                            public final void run() {
                                androidx.camera.video.Recorder.this.Camera2StreamConfigurationMap(recordingRecord);
                            }
                        });
                    }
                }
                return;
            }
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Called pause() from invalid state: ");
            sb2.append(recorder.rsaCipher);
            throw new java.lang.IllegalStateException(sb2.toString());
        }
    }

    public final void resume() {
        if (this.getHighSpeedVideoSizes.get()) {
            throw new java.lang.IllegalStateException("The recording has been stopped.");
        }
        final androidx.camera.video.Recorder recorder = this.getHighSpeedVideoSizesFor;
        synchronized (recorder.getARTIFICIAL_FRAME_PACKAGE_NAME) {
            if (!androidx.camera.video.Recorder.getHighSpeedVideoFpsRangesFor(this, recorder.d) && !androidx.camera.video.Recorder.getHighSpeedVideoFpsRangesFor(this, recorder.getHighSpeedVideoSizes)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("resume() called on a recording that is no longer active: ");
                sb.append(this.Camera2StreamConfigurationMap);
                androidx.camera.core.Logger.d("Recorder", sb.toString());
                return;
            }
            int ordinal = recorder.rsaCipher.ordinal();
            if (ordinal != 0) {
                if (ordinal == 5) {
                    recorder.getHighSpeedVideoSizes(androidx.camera.video.Recorder.State.RECORDING);
                    final androidx.camera.video.Recorder.RecordingRecord recordingRecord = recorder.getHighSpeedVideoSizes;
                    recorder.requestGoOnline.execute(new java.lang.Runnable() { // from class: androidx.camera.video.Recorder$$ExternalSyntheticLambda6
                        @Override // java.lang.Runnable
                        public final void run() {
                            androidx.camera.video.Recorder recorder2 = androidx.camera.video.Recorder.this;
                            if (recorder2.CoroutineDebuggingKt != recordingRecord || recorder2.accessartificialFrame) {
                                return;
                            }
                            if (recorder2.getOutputStallDuration == androidx.camera.video.Recorder.AudioState.ENABLED) {
                                recorder2.getInputFormats.start();
                            }
                            androidx.camera.video.internal.encoder.Encoder encoder = recorder2.freeTransaction;
                            if (encoder == null) {
                                recorder2.requestPINEntry = true;
                                return;
                            }
                            encoder.start();
                            androidx.camera.video.Recorder.RecordingRecord recordingRecord2 = recorder2.CoroutineDebuggingKt;
                            recordingRecord2.getHighSpeedVideoFpsRanges(androidx.camera.video.VideoRecordEvent.getHighSpeedVideoFpsRanges(recordingRecord2.Camera2StreamConfigurationMap(), recorder2.getInputFormats()), true);
                        }
                    });
                } else if (ordinal == 2) {
                    recorder.getHighSpeedVideoSizes(androidx.camera.video.Recorder.State.PENDING_RECORDING);
                } else if (ordinal != 3) {
                }
                return;
            }
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Called resume() from invalid state: ");
            sb2.append(recorder.rsaCipher);
            throw new java.lang.IllegalStateException(sb2.toString());
        }
    }

    public final void stop() {
        close();
    }

    public final void mute(final boolean z) {
        if (this.getHighSpeedVideoSizes.get()) {
            throw new java.lang.IllegalStateException("The recording has been stopped.");
        }
        final androidx.camera.video.Recorder recorder = this.getHighSpeedVideoSizesFor;
        synchronized (recorder.getARTIFICIAL_FRAME_PACKAGE_NAME) {
            if (!androidx.camera.video.Recorder.getHighSpeedVideoFpsRangesFor(this, recorder.d) && !androidx.camera.video.Recorder.getHighSpeedVideoFpsRangesFor(this, recorder.getHighSpeedVideoSizes)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("mute() called on a recording that is no longer active: ");
                sb.append(this.Camera2StreamConfigurationMap);
                androidx.camera.core.Logger.d("Recorder", sb.toString());
            } else {
                final androidx.camera.video.Recorder.RecordingRecord recordingRecord = androidx.camera.video.Recorder.getHighSpeedVideoFpsRangesFor(this, recorder.d) ? recorder.d : recorder.getHighSpeedVideoSizes;
                recorder.requestGoOnline.execute(new java.lang.Runnable() { // from class: androidx.camera.video.Recorder$$ExternalSyntheticLambda7
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.camera.video.internal.audio.AudioSource audioSource;
                        androidx.camera.video.Recorder recorder2 = androidx.camera.video.Recorder.this;
                        androidx.camera.video.Recorder.RecordingRecord recordingRecord2 = recordingRecord;
                        boolean z2 = z;
                        if (recordingRecord2.getHighSpeedVideoFpsRangesFor.get() != z2) {
                            recordingRecord2.getHighSpeedVideoFpsRangesFor.set(z2);
                            if (recorder2.CoroutineDebuggingKt != recordingRecord2 || recorder2.accessartificialFrame || (audioSource = recorder2.getOutputStallDurationlomOqCM) == null) {
                                return;
                            }
                            audioSource.mute(z2);
                        }
                    }
                });
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        Camera2StreamConfigurationMap(0, null);
    }

    protected final void finalize() throws java.lang.Throwable {
        try {
            this.getHighResolutionOutputSizeshNQ4ISI.warnIfOpen();
            Camera2StreamConfigurationMap(10, new java.lang.RuntimeException("Recording stopped due to being garbage collected."));
        } finally {
            super.finalize();
        }
    }

    public final boolean isClosed() {
        return this.getHighSpeedVideoSizes.get();
    }

    private void Camera2StreamConfigurationMap(final int i, final java.lang.Throwable th) {
        this.getHighResolutionOutputSizeshNQ4ISI.close();
        if (this.getHighSpeedVideoSizes.getAndSet(true)) {
            return;
        }
        final androidx.camera.video.Recorder recorder = this.getHighSpeedVideoSizesFor;
        synchronized (recorder.getARTIFICIAL_FRAME_PACKAGE_NAME) {
            if (!androidx.camera.video.Recorder.getHighSpeedVideoFpsRangesFor(this, recorder.d) && !androidx.camera.video.Recorder.getHighSpeedVideoFpsRangesFor(this, recorder.getHighSpeedVideoSizes)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("stop() called on a recording that is no longer active: ");
                sb.append(this.Camera2StreamConfigurationMap);
                androidx.camera.core.Logger.d("Recorder", sb.toString());
                return;
            }
            androidx.camera.video.Recorder.RecordingRecord recordingRecord = null;
            switch (recorder.rsaCipher) {
                case CONFIGURING:
                case IDLING:
                    throw new java.lang.IllegalStateException("Calling stop() while idling or initializing is invalid.");
                case PENDING_RECORDING:
                case PENDING_PAUSED:
                    androidx.core.util.Preconditions.checkState(androidx.camera.video.Recorder.getHighSpeedVideoFpsRangesFor(this, recorder.d));
                    androidx.camera.video.Recorder.RecordingRecord recordingRecord2 = recorder.d;
                    recorder.d = null;
                    recorder.getHighSpeedVideoFpsRanges();
                    recordingRecord = recordingRecord2;
                    break;
                case RECORDING:
                case PAUSED:
                    recorder.getHighSpeedVideoSizes(androidx.camera.video.Recorder.State.STOPPING);
                    final long micros = java.util.concurrent.TimeUnit.NANOSECONDS.toMicros(java.lang.System.nanoTime());
                    final androidx.camera.video.Recorder.RecordingRecord recordingRecord3 = recorder.getHighSpeedVideoSizes;
                    recorder.requestGoOnline.execute(new java.lang.Runnable() { // from class: androidx.camera.video.Recorder$$ExternalSyntheticLambda1
                        @Override // java.lang.Runnable
                        public final void run() {
                            androidx.camera.video.Recorder.this.Camera2StreamConfigurationMap(recordingRecord3, micros, i, th);
                        }
                    });
                    break;
                case STOPPING:
                case RESETTING:
                    androidx.core.util.Preconditions.checkState(androidx.camera.video.Recorder.getHighSpeedVideoFpsRangesFor(this, recorder.getHighSpeedVideoSizes));
                    break;
            }
            if (recordingRecord != null) {
                if (i == 10) {
                    androidx.camera.core.Logger.e("Recorder", "Recording was stopped due to recording being garbage collected before any valid data has been produced.");
                }
                recorder.getHighSpeedVideoFpsRangesFor(recordingRecord, 8, new java.lang.RuntimeException("Recording was stopped before any data could be produced.", th));
            }
        }
    }
}
