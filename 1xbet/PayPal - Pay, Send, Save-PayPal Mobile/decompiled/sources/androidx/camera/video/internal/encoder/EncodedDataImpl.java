package androidx.camera.video.internal.encoder;

/* loaded from: classes6.dex */
public class EncodedDataImpl implements androidx.camera.video.internal.encoder.EncodedData {
    private final java.util.concurrent.atomic.AtomicBoolean Camera2StreamConfigurationMap = new java.util.concurrent.atomic.AtomicBoolean(false);
    private final androidx.concurrent.futures.CallbackToFutureAdapter.Completer<java.lang.Void> getHighResolutionOutputSizeshNQ4ISI;
    private final int getHighSpeedVideoFpsRanges;
    private final java.nio.ByteBuffer getHighSpeedVideoFpsRangesFor;
    private final android.media.MediaCodec.BufferInfo getHighSpeedVideoSizes;
    private final android.media.MediaCodec getInputSizeshNQ4ISI;
    private final com.google.common.util.concurrent.ListenableFuture<java.lang.Void> getOutputFormats;

    EncodedDataImpl(android.media.MediaCodec mediaCodec, int i, android.media.MediaCodec.BufferInfo bufferInfo) throws android.media.MediaCodec.CodecException {
        this.getInputSizeshNQ4ISI = (android.media.MediaCodec) androidx.core.util.Preconditions.checkNotNull(mediaCodec);
        this.getHighSpeedVideoFpsRanges = i;
        this.getHighSpeedVideoFpsRangesFor = mediaCodec.getOutputBuffer(i);
        this.getHighSpeedVideoSizes = (android.media.MediaCodec.BufferInfo) androidx.core.util.Preconditions.checkNotNull(bufferInfo);
        final java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
        this.getOutputFormats = androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(new androidx.concurrent.futures.CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.video.internal.encoder.EncodedDataImpl$$ExternalSyntheticLambda0
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final java.lang.Object attachCompleter(androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer) {
                return androidx.camera.video.internal.encoder.EncodedDataImpl.getHighResolutionOutputSizeshNQ4ISI(atomicReference, completer);
            }
        });
        this.getHighResolutionOutputSizeshNQ4ISI = (androidx.concurrent.futures.CallbackToFutureAdapter.Completer) androidx.core.util.Preconditions.checkNotNull((androidx.concurrent.futures.CallbackToFutureAdapter.Completer) atomicReference.get());
    }

    static /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI(java.util.concurrent.atomic.AtomicReference atomicReference, androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer) throws java.lang.Exception {
        atomicReference.set(completer);
        return "Data closed";
    }

    @Override // androidx.camera.video.internal.encoder.EncodedData
    public android.media.MediaCodec.BufferInfo getBufferInfo() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // androidx.camera.video.internal.encoder.EncodedData
    public long getPresentationTimeUs() {
        return this.getHighSpeedVideoSizes.presentationTimeUs;
    }

    @Override // androidx.camera.video.internal.encoder.EncodedData
    public long size() {
        return this.getHighSpeedVideoSizes.size;
    }

    @Override // androidx.camera.video.internal.encoder.EncodedData
    public boolean isKeyFrame() {
        return (this.getHighSpeedVideoSizes.flags & 1) != 0;
    }

    @Override // androidx.camera.video.internal.encoder.EncodedData, java.lang.AutoCloseable
    public void close() {
        if (this.Camera2StreamConfigurationMap.getAndSet(true)) {
            return;
        }
        try {
            this.getInputSizeshNQ4ISI.releaseOutputBuffer(this.getHighSpeedVideoFpsRanges, false);
            this.getHighResolutionOutputSizeshNQ4ISI.set(null);
        } catch (java.lang.IllegalStateException e) {
            this.getHighResolutionOutputSizeshNQ4ISI.setException(e);
        }
    }

    @Override // androidx.camera.video.internal.encoder.EncodedData
    public com.google.common.util.concurrent.ListenableFuture<java.lang.Void> getClosedFuture() {
        return androidx.camera.core.impl.utils.futures.Futures.nonCancellationPropagating(this.getOutputFormats);
    }

    @Override // androidx.camera.video.internal.encoder.EncodedData
    public java.nio.ByteBuffer getByteBuffer() {
        if (!this.Camera2StreamConfigurationMap.get()) {
            this.getHighSpeedVideoFpsRangesFor.position(this.getHighSpeedVideoSizes.offset);
            this.getHighSpeedVideoFpsRangesFor.limit(this.getHighSpeedVideoSizes.offset + this.getHighSpeedVideoSizes.size);
            return this.getHighSpeedVideoFpsRangesFor;
        }
        throw new java.lang.IllegalStateException("encoded data is closed.");
    }
}
