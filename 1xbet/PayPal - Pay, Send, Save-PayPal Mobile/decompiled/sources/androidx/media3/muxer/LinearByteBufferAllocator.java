package androidx.media3.muxer;

/* loaded from: classes7.dex */
final class LinearByteBufferAllocator implements androidx.media3.muxer.ByteBufferAllocator {
    java.nio.ByteBuffer Camera2StreamConfigurationMap;

    public LinearByteBufferAllocator() {
        com.google.common.base.Preconditions.checkArgument(true);
        this.Camera2StreamConfigurationMap = java.nio.ByteBuffer.allocateDirect(0);
    }

    @Override // androidx.media3.muxer.ByteBufferAllocator
    public final java.nio.ByteBuffer allocate(int i) {
        com.google.common.base.Preconditions.checkArgument(i >= 0);
        if (this.Camera2StreamConfigurationMap.remaining() < i) {
            this.Camera2StreamConfigurationMap = java.nio.ByteBuffer.allocateDirect(java.lang.Math.max(i, this.Camera2StreamConfigurationMap.capacity() * 2));
        }
        java.nio.ByteBuffer slice = this.Camera2StreamConfigurationMap.slice();
        java.nio.ByteBuffer byteBuffer = this.Camera2StreamConfigurationMap;
        byteBuffer.position(byteBuffer.position() + i);
        slice.limit(i);
        return slice;
    }
}
