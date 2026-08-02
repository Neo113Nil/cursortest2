package androidx.camera.video.internal.encoder;

/* loaded from: classes6.dex */
public class BufferCopiedEncodedData implements androidx.camera.video.internal.encoder.EncodedData {
    private final androidx.concurrent.futures.CallbackToFutureAdapter.Completer<java.lang.Void> Camera2StreamConfigurationMap;
    private final java.nio.ByteBuffer getHighSpeedVideoFpsRanges;
    private final android.media.MediaCodec.BufferInfo getHighSpeedVideoFpsRangesFor;
    private final com.google.common.util.concurrent.ListenableFuture<java.lang.Void> getHighSpeedVideoSizes;

    public BufferCopiedEncodedData(androidx.camera.video.internal.encoder.EncodedData encodedData) {
        android.media.MediaCodec.BufferInfo bufferInfo = encodedData.getBufferInfo();
        android.media.MediaCodec.BufferInfo bufferInfo2 = new android.media.MediaCodec.BufferInfo();
        bufferInfo2.set(0, bufferInfo.size, bufferInfo.presentationTimeUs, bufferInfo.flags);
        this.getHighSpeedVideoFpsRangesFor = bufferInfo2;
        java.nio.ByteBuffer byteBuffer = encodedData.getByteBuffer();
        android.media.MediaCodec.BufferInfo bufferInfo3 = encodedData.getBufferInfo();
        byteBuffer.position(bufferInfo3.offset);
        byteBuffer.limit(bufferInfo3.offset + bufferInfo3.size);
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(bufferInfo3.size);
        allocate.order(byteBuffer.order());
        allocate.put(byteBuffer);
        allocate.flip();
        this.getHighSpeedVideoFpsRanges = allocate;
        final java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
        this.getHighSpeedVideoSizes = androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(new androidx.concurrent.futures.CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.video.internal.encoder.BufferCopiedEncodedData$$ExternalSyntheticLambda0
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final java.lang.Object attachCompleter(androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer) {
                return androidx.camera.video.internal.encoder.BufferCopiedEncodedData.getHighSpeedVideoFpsRangesFor(atomicReference, completer);
            }
        });
        this.Camera2StreamConfigurationMap = (androidx.concurrent.futures.CallbackToFutureAdapter.Completer) androidx.core.util.Preconditions.checkNotNull((androidx.concurrent.futures.CallbackToFutureAdapter.Completer) atomicReference.get());
    }

    static /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor(java.util.concurrent.atomic.AtomicReference atomicReference, androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer) throws java.lang.Exception {
        atomicReference.set(completer);
        return "Data closed";
    }

    @Override // androidx.camera.video.internal.encoder.EncodedData
    public java.nio.ByteBuffer getByteBuffer() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // androidx.camera.video.internal.encoder.EncodedData
    public android.media.MediaCodec.BufferInfo getBufferInfo() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // androidx.camera.video.internal.encoder.EncodedData
    public long getPresentationTimeUs() {
        return this.getHighSpeedVideoFpsRangesFor.presentationTimeUs;
    }

    @Override // androidx.camera.video.internal.encoder.EncodedData
    public long size() {
        return this.getHighSpeedVideoFpsRangesFor.size;
    }

    @Override // androidx.camera.video.internal.encoder.EncodedData
    public boolean isKeyFrame() {
        return (this.getHighSpeedVideoFpsRangesFor.flags & 1) != 0;
    }

    @Override // androidx.camera.video.internal.encoder.EncodedData, java.lang.AutoCloseable
    public void close() {
        this.Camera2StreamConfigurationMap.set(null);
    }

    @Override // androidx.camera.video.internal.encoder.EncodedData
    public com.google.common.util.concurrent.ListenableFuture<java.lang.Void> getClosedFuture() {
        return androidx.camera.core.impl.utils.futures.Futures.nonCancellationPropagating(this.getHighSpeedVideoSizes);
    }
}
