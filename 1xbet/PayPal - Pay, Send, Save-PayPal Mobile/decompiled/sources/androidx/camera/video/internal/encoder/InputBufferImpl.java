package androidx.camera.video.internal.encoder;

/* loaded from: classes6.dex */
class InputBufferImpl implements androidx.camera.video.internal.encoder.InputBuffer {
    private final java.nio.ByteBuffer Camera2StreamConfigurationMap;
    private final android.media.MediaCodec getHighSpeedVideoFpsRanges;
    private final int getHighSpeedVideoFpsRangesFor;
    private final androidx.concurrent.futures.CallbackToFutureAdapter.Completer<java.lang.Void> getHighSpeedVideoSizesFor;
    private final com.google.common.util.concurrent.ListenableFuture<java.lang.Void> getInputSizeshNQ4ISI;
    private final java.util.concurrent.atomic.AtomicBoolean getInputFormats = new java.util.concurrent.atomic.AtomicBoolean(false);
    private long getHighSpeedVideoSizes = 0;
    private boolean getHighResolutionOutputSizeshNQ4ISI = false;

    InputBufferImpl(android.media.MediaCodec mediaCodec, int i) throws android.media.MediaCodec.CodecException {
        this.getHighSpeedVideoFpsRanges = (android.media.MediaCodec) androidx.core.util.Preconditions.checkNotNull(mediaCodec);
        this.getHighSpeedVideoFpsRangesFor = androidx.core.util.Preconditions.checkArgumentNonnegative(i);
        this.Camera2StreamConfigurationMap = mediaCodec.getInputBuffer(i);
        final java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
        this.getInputSizeshNQ4ISI = androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(new androidx.concurrent.futures.CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.video.internal.encoder.InputBufferImpl$$ExternalSyntheticLambda0
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final java.lang.Object attachCompleter(androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer) {
                return androidx.camera.video.internal.encoder.InputBufferImpl.getHighSpeedVideoFpsRanges(atomicReference, completer);
            }
        });
        this.getHighSpeedVideoSizesFor = (androidx.concurrent.futures.CallbackToFutureAdapter.Completer) androidx.core.util.Preconditions.checkNotNull((androidx.concurrent.futures.CallbackToFutureAdapter.Completer) atomicReference.get());
    }

    static /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges(java.util.concurrent.atomic.AtomicReference atomicReference, androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer) throws java.lang.Exception {
        atomicReference.set(completer);
        return "Terminate InputBuffer";
    }

    @Override // androidx.camera.video.internal.encoder.InputBuffer
    public boolean submit() {
        if (this.getInputFormats.getAndSet(true)) {
            return false;
        }
        try {
            this.getHighSpeedVideoFpsRanges.queueInputBuffer(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap.position(), this.Camera2StreamConfigurationMap.limit(), this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI ? 4 : 0);
            this.getHighSpeedVideoSizesFor.set(null);
            return true;
        } catch (java.lang.IllegalStateException e) {
            this.getHighSpeedVideoSizesFor.setException(e);
            return false;
        }
    }

    @Override // androidx.camera.video.internal.encoder.InputBuffer
    public boolean cancel() {
        if (this.getInputFormats.getAndSet(true)) {
            return false;
        }
        try {
            this.getHighSpeedVideoFpsRanges.queueInputBuffer(this.getHighSpeedVideoFpsRangesFor, 0, 0, 0L, 0);
            this.getHighSpeedVideoSizesFor.set(null);
        } catch (java.lang.IllegalStateException e) {
            this.getHighSpeedVideoSizesFor.setException(e);
        }
        return true;
    }

    @Override // androidx.camera.video.internal.encoder.InputBuffer
    public com.google.common.util.concurrent.ListenableFuture<java.lang.Void> getTerminationFuture() {
        return androidx.camera.core.impl.utils.futures.Futures.nonCancellationPropagating(this.getInputSizeshNQ4ISI);
    }

    @Override // androidx.camera.video.internal.encoder.InputBuffer
    public java.nio.ByteBuffer getByteBuffer() {
        if (!this.getInputFormats.get()) {
            return this.Camera2StreamConfigurationMap;
        }
        throw new java.lang.IllegalStateException("The buffer is submitted or canceled.");
    }

    @Override // androidx.camera.video.internal.encoder.InputBuffer
    public void setEndOfStream(boolean z) {
        if (!this.getInputFormats.get()) {
            this.getHighResolutionOutputSizeshNQ4ISI = z;
            return;
        }
        throw new java.lang.IllegalStateException("The buffer is submitted or canceled.");
    }

    @Override // androidx.camera.video.internal.encoder.InputBuffer
    public void setPresentationTimeUs(long j) {
        if (!this.getInputFormats.get()) {
            androidx.core.util.Preconditions.checkArgument(j >= 0);
            this.getHighSpeedVideoSizes = j;
            return;
        }
        throw new java.lang.IllegalStateException("The buffer is submitted or canceled.");
    }
}
